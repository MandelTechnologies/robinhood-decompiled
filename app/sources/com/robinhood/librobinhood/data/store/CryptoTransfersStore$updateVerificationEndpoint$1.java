package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.retrofit.CryptoTransfersApi;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "it", "Lcom/robinhood/librobinhood/data/store/UpdateVerificationRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$updateVerificationEndpoint$1", m3645f = "CryptoTransfersStore.kt", m3646l = {359}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CryptoTransfersStore$updateVerificationEndpoint$1 extends ContinuationImpl7 implements Function2<UpdateVerificationRequest, Continuation<? super ApiCryptoVerificationResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTransfersStore this$0;

    /* compiled from: CryptoTransfersStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTransferHistoryDetailResponse.Type.values().length];
            try {
                iArr[ApiCryptoTransferHistoryDetailResponse.Type.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferHistoryDetailResponse.Type.WITHDRAWAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransfersStore$updateVerificationEndpoint$1(CryptoTransfersStore cryptoTransfersStore, Continuation<? super CryptoTransfersStore$updateVerificationEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransfersStore$updateVerificationEndpoint$1 cryptoTransfersStore$updateVerificationEndpoint$1 = new CryptoTransfersStore$updateVerificationEndpoint$1(this.this$0, continuation);
        cryptoTransfersStore$updateVerificationEndpoint$1.L$0 = obj;
        return cryptoTransfersStore$updateVerificationEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateVerificationRequest updateVerificationRequest, Continuation<? super ApiCryptoVerificationResponse> continuation) {
        return ((CryptoTransfersStore$updateVerificationEndpoint$1) create(updateVerificationRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        UpdateVerificationRequest updateVerificationRequest = (UpdateVerificationRequest) this.L$0;
        CryptoTransfersApi cryptoTransfersApi = this.this$0.cryptoTransfersApi;
        int i2 = WhenMappings.$EnumSwitchMapping$0[updateVerificationRequest.getType().ordinal()];
        if (i2 == 1) {
            str = "deposits";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "withdrawals";
        }
        UUID verificationId = updateVerificationRequest.getVerificationId();
        ApiCryptoWithdrawalVerificationRequest request = updateVerificationRequest.getRequest();
        this.label = 1;
        Object objUpdateVerification = cryptoTransfersApi.updateVerification(str, verificationId, request, this);
        return objUpdateVerification == coroutine_suspended ? coroutine_suspended : objUpdateVerification;
    }
}
