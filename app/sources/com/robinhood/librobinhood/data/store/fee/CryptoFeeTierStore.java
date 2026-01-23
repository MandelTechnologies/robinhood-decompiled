package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.models.crypto.dao.CryptoFeeTierInfoDao;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.RestNummusService;
import nummus.p512v1.UserFeeTierResponseDto;
import retrofit2.Response;

/* compiled from: CryptoFeeTierStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u000eJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "Lcom/robinhood/store/Store;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "nummusService", "Lnummus/v1/RestNummusService;", "cryptoFeeTierInfoDao", "Lcom/robinhood/models/crypto/dao/CryptoFeeTierInfoDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lnummus/v1/RestNummusService;Lcom/robinhood/models/crypto/dao/CryptoFeeTierInfoDao;Lcom/robinhood/store/StoreBundle;)V", "getCryptoAccountId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lretrofit2/Response;", "Lnummus/v1/UserFeeTierResponseDto;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "streamCryptoFeeTierInfo", "Lkotlinx/coroutines/flow/Flow;", "getCryptoFeeTierInfo", "Lkotlin/Result;", "getCryptoFeeTierInfo-IoAF18A", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoFeeTierStore extends Store {
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoFeeTierInfoDao cryptoFeeTierInfoDao;
    private final Endpoint<Unit, Response<UserFeeTierResponseDto>> endpoint;
    private final RestNummusService nummusService;
    private final Query<Unit, CryptoFeeTierInfo> query;

    /* compiled from: CryptoFeeTierStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore", m3645f = "CryptoFeeTierStore.kt", m3646l = {33}, m3647m = "getCryptoAccountId")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$getCryptoAccountId$1 */
    static final class C348111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348111(Continuation<? super C348111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoFeeTierStore.this.getCryptoAccountId(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoFeeTierStore(CryptoAccountStore cryptoAccountStore, RestNummusService nummusService, CryptoFeeTierInfoDao cryptoFeeTierInfoDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(cryptoFeeTierInfoDao, "cryptoFeeTierInfoDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountStore = cryptoAccountStore;
        this.nummusService = nummusService;
        this.cryptoFeeTierInfoDao = cryptoFeeTierInfoDao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoFeeTierStore2(this, null), getLogoutKillswitch(), new CryptoFeeTierStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamCryptoFeeTierInfo", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoFeeTierStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoFeeTierStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoAccountId(Continuation<? super String> continuation) {
        C348111 c348111;
        if (continuation instanceof C348111) {
            c348111 = (C348111) continuation;
            int i = c348111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348111.label = i - Integer.MIN_VALUE;
            } else {
                c348111 = new C348111(continuation);
            }
        }
        Object objFirstOrNull = c348111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<CryptoAccount> flowStreamAccount = this.cryptoAccountStore.streamAccount();
            c348111.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamAccount, c348111);
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirstOrNull);
        }
        CryptoAccount cryptoAccount = (CryptoAccount) objFirstOrNull;
        String id = cryptoAccount != null ? cryptoAccount.getId() : null;
        return id == null ? "" : id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(CryptoFeeTierStore cryptoFeeTierStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint8.backendPoll$default(cryptoFeeTierStore.endpoint, it, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(CryptoFeeTierStore cryptoFeeTierStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoFeeTierStore.cryptoFeeTierInfoDao.getCryptoFeeTierInfo();
    }

    public final Flow<CryptoFeeTierInfo> streamCryptoFeeTierInfo() {
        return this.query.asFlow(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: getCryptoFeeTierInfo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22810getCryptoFeeTierInfoIoAF18A(Continuation<? super Result<CryptoFeeTierInfo>> continuation) {
        CryptoFeeTierStore4 cryptoFeeTierStore4;
        if (continuation instanceof CryptoFeeTierStore4) {
            cryptoFeeTierStore4 = (CryptoFeeTierStore4) continuation;
            int i = cryptoFeeTierStore4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoFeeTierStore4.label = i - Integer.MIN_VALUE;
            } else {
                cryptoFeeTierStore4 = new CryptoFeeTierStore4(this, continuation);
            }
        }
        Object objRetryExponential = cryptoFeeTierStore4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoFeeTierStore4.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRetryExponential);
            Function1 function1 = new Function1() { // from class: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(CryptoFeeTierStore.getCryptoFeeTierInfo_IoAF18A$lambda$2((Throwable) obj));
                }
            };
            CryptoFeeTierStore5 cryptoFeeTierStore5 = new CryptoFeeTierStore5(this, null);
            cryptoFeeTierStore4.label = 1;
            objRetryExponential = RetryOnError.retryExponential(3, function1, cryptoFeeTierStore5, cryptoFeeTierStore4);
            if (objRetryExponential == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRetryExponential);
        }
        return ((Result) objRetryExponential).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCryptoFeeTierInfo_IoAF18A$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }
}
