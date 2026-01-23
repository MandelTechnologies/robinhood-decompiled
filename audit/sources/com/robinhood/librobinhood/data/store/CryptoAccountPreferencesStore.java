package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.coroutines.RetryOnError;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.dao.CryptoAccountPreferenceDao;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.crypto.p314db.CryptoAccountPreferences;
import com.robinhood.shared.crypto.utils.MonetizationModels;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nummus.p512v1.AccountPreferencePutRequestDto;
import nummus.p512v1.AccountPreferencePutResponseDto;
import nummus.p512v1.AccountPreferenceRetrieveRequestDto;
import nummus.p512v1.AccountPreferenceRetrieveResponseDto;
import nummus.p512v1.RestNummusService;

/* compiled from: CryptoAccountPreferencesStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0004\b\u001b\u0010\u000eJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b\u001f\u0010 J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "Lcom/robinhood/store/Store;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountPreferencesDao", "Lcom/robinhood/models/crypto/dao/CryptoAccountPreferenceDao;", "nummusService", "Lnummus/v1/RestNummusService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/models/crypto/dao/CryptoAccountPreferenceDao;Lnummus/v1/RestNummusService;Lcom/robinhood/store/StoreBundle;)V", "getCryptoAccountId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountPreferencesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lnummus/v1/AccountPreferenceRetrieveRequestDto;", "Lcom/robinhood/utils/Either;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "Lnummus/v1/AccountPreferencePutResponseDto;", "accountPreferencePutEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lnummus/v1/AccountPreferencePutRequestDto;", "refreshAccountPreferences", "Lkotlin/Result;", "", "refreshAccountPreferences-IoAF18A", "updateMonetizationModelPreference", "monetizationModel", "Lcom/robinhood/models/api/fee/MonetizationModel;", "updateMonetizationModelPreference-gIAlu-s", "(Lcom/robinhood/models/api/fee/MonetizationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamAccountPreferences", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/crypto/db/CryptoAccountPreferences;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoAccountPreferencesStore extends Store {
    private final PostEndpoint<AccountPreferencePutRequestDto, AccountPreferencePutResponseDto> accountPreferencePutEndpoint;
    private final Endpoint<AccountPreferenceRetrieveRequestDto, Either<AccountPreferenceRetrieveResponseDto, AccountPreferencePutResponseDto>> accountPreferencesEndpoint;
    private final CryptoAccountPreferenceDao cryptoAccountPreferencesDao;
    private final CryptoAccountStore cryptoAccountStore;
    private final RestNummusService nummusService;

    /* compiled from: CryptoAccountPreferencesStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore", m3645f = "CryptoAccountPreferencesStore.kt", m3646l = {38}, m3647m = "getCryptoAccountId")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$getCryptoAccountId$1 */
    static final class C336531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336531(Continuation<? super C336531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoAccountPreferencesStore.this.getCryptoAccountId(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAccountPreferencesStore(CryptoAccountStore cryptoAccountStore, CryptoAccountPreferenceDao cryptoAccountPreferencesDao, RestNummusService nummusService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesDao, "cryptoAccountPreferencesDao");
        Intrinsics.checkNotNullParameter(nummusService, "nummusService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoAccountPreferencesDao = cryptoAccountPreferencesDao;
        this.nummusService = nummusService;
        this.accountPreferencesEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoAccountPreferencesStore4(this, null), getLogoutKillswitch(), new CryptoAccountPreferencesStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.accountPreferencePutEndpoint = PostEndpoint.INSTANCE.create(new CryptoAccountPreferencesStore2(this, null), new CryptoAccountPreferencesStore3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoAccountId(Continuation<? super String> continuation) {
        C336531 c336531;
        if (continuation instanceof C336531) {
            c336531 = (C336531) continuation;
            int i = c336531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336531.label = i - Integer.MIN_VALUE;
            } else {
                c336531 = new C336531(continuation);
            }
        }
        Object objFirstOrNull = c336531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirstOrNull);
            Flow<CryptoAccount> flowStreamAccount = this.cryptoAccountStore.streamAccount();
            c336531.label = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowStreamAccount, c336531);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: refreshAccountPreferences-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22601refreshAccountPreferencesIoAF18A(Continuation<? super Result<Unit>> continuation) {
        CryptoAccountPreferencesStore6 cryptoAccountPreferencesStore6;
        if (continuation instanceof CryptoAccountPreferencesStore6) {
            cryptoAccountPreferencesStore6 = (CryptoAccountPreferencesStore6) continuation;
            int i = cryptoAccountPreferencesStore6.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoAccountPreferencesStore6.label = i - Integer.MIN_VALUE;
            } else {
                cryptoAccountPreferencesStore6 = new CryptoAccountPreferencesStore6(this, continuation);
            }
        }
        Object objRetryExponential = cryptoAccountPreferencesStore6.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoAccountPreferencesStore6.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRetryExponential);
            Function1 function1 = new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(CryptoAccountPreferencesStore.refreshAccountPreferences_IoAF18A$lambda$0((Throwable) obj));
                }
            };
            CryptoAccountPreferencesStore7 cryptoAccountPreferencesStore7 = new CryptoAccountPreferencesStore7(this, null);
            cryptoAccountPreferencesStore6.label = 1;
            objRetryExponential = RetryOnError.retryExponential(3, function1, cryptoAccountPreferencesStore7, cryptoAccountPreferencesStore6);
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
    public static final boolean refreshAccountPreferences_IoAF18A$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: updateMonetizationModelPreference-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22602updateMonetizationModelPreferencegIAlus(MonetizationModel monetizationModel, Continuation<? super Result<Unit>> continuation) {
        CryptoAccountPreferencesStore8 cryptoAccountPreferencesStore8;
        if (continuation instanceof CryptoAccountPreferencesStore8) {
            cryptoAccountPreferencesStore8 = (CryptoAccountPreferencesStore8) continuation;
            int i = cryptoAccountPreferencesStore8.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cryptoAccountPreferencesStore8.label = i - Integer.MIN_VALUE;
            } else {
                cryptoAccountPreferencesStore8 = new CryptoAccountPreferencesStore8(this, continuation);
            }
        }
        CryptoAccountPreferencesStore8 cryptoAccountPreferencesStore82 = cryptoAccountPreferencesStore8;
        Object obj = cryptoAccountPreferencesStore82.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cryptoAccountPreferencesStore82.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint<AccountPreferencePutRequestDto, AccountPreferencePutResponseDto> postEndpoint = this.accountPreferencePutEndpoint;
                AccountPreferencePutRequestDto accountPreferencePutRequestDto = new AccountPreferencePutRequestDto(null, MonetizationModels.getDto(monetizationModel), i3, 0 == true ? 1 : 0);
                cryptoAccountPreferencesStore82.label = 1;
                if (PostEndpoint.DefaultImpls.post$default(postEndpoint, accountPreferencePutRequestDto, null, cryptoAccountPreferencesStore82, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Exception e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(e));
        }
    }

    public final Flow<CryptoAccountPreferences> streamAccountPreferences() {
        return FlowKt.filterNotNull(this.cryptoAccountPreferencesDao.getAccountPreferences());
    }
}
