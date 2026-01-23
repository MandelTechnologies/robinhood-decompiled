package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.crypto.p033v1.CryptoService;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsRequestDto;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAgreementsStore;", "Lcom/robinhood/store/Store;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoService", "Lbonfire/proto/idl/crypto/v1/CryptoService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lbonfire/proto/idl/crypto/v1/CryptoService;Lcom/robinhood/store/StoreBundle;)V", "getCryptoAgreements", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoAgreementsStore extends Store {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoService cryptoService;

    /* compiled from: CryptoAgreementsStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAgreementsStore", m3645f = "CryptoAgreementsStore.kt", m3646l = {28, 30}, m3647m = "getCryptoAgreements")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAgreementsStore$getCryptoAgreements$1 */
    static final class C336821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C336821(Continuation<? super C336821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoAgreementsStore.this.getCryptoAgreements(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAgreementsStore(CryptoAccountProvider cryptoAccountProvider, CryptoService cryptoService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoService = cryptoService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCryptoAgreements(Continuation<? super GetCryptoUserAgreementsResponseDto> continuation) {
        C336821 c336821;
        if (continuation instanceof C336821) {
            c336821 = (C336821) continuation;
            int i = c336821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c336821.label = i - Integer.MIN_VALUE;
            } else {
                c336821 = new C336821(continuation);
            }
        }
        Object objFirst = c336821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c336821.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<String> flowStreamAccountNumber = this.cryptoAccountProvider.streamAccountNumber(CryptoAccountSwitcherLocation.Home.INSTANCE);
            c336821.label = 1;
            objFirst = FlowKt.first(flowStreamAccountNumber, c336821);
            if (objFirst != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
            return objFirst;
        }
        ResultKt.throwOnFailure(objFirst);
        if (objFirst == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CryptoService cryptoService = this.cryptoService;
        GetCryptoUserAgreementsRequestDto getCryptoUserAgreementsRequestDto = new GetCryptoUserAgreementsRequestDto((String) objFirst);
        c336821.label = 2;
        Object objGetCryptoUserAgreements = cryptoService.GetCryptoUserAgreements(getCryptoUserAgreementsRequestDto, c336821);
        return objGetCryptoUserAgreements == coroutine_suspended ? coroutine_suspended : objGetCryptoUserAgreements;
    }
}
