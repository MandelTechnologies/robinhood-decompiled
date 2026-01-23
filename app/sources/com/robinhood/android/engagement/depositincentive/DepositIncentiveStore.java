package com.robinhood.android.engagement.depositincentive;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.transfer.rewarddetail.ApiTransferRewardDetailResponse;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositIncentiveStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/engagement/depositincentive/DepositIncentiveStore;", "Lcom/robinhood/store/Store;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "getRewardDetail", "Lcom/robinhood/models/api/bonfire/transfer/rewarddetail/ApiTransferRewardDetailResponse;", "createTransferData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-deposit-incentive_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DepositIncentiveStore extends Store {
    public static final int $stable = 8;
    private final TransfersBonfireApi transfersBonfireApi;

    /* compiled from: DepositIncentiveStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.engagement.depositincentive.DepositIncentiveStore", m3645f = "DepositIncentiveStore.kt", m3646l = {19}, m3647m = "getRewardDetail")
    /* renamed from: com.robinhood.android.engagement.depositincentive.DepositIncentiveStore$getRewardDetail$1 */
    static final class C145181 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C145181(Continuation<? super C145181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DepositIncentiveStore.this.getRewardDetail(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositIncentiveStore(TransfersBonfireApi transfersBonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRewardDetail(ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super ApiTransferRewardDetailResponse> continuation) {
        C145181 c145181;
        Object objM28550constructorimpl;
        if (continuation instanceof C145181) {
            c145181 = (C145181) continuation;
            int i = c145181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c145181.label = i - Integer.MIN_VALUE;
            } else {
                c145181 = new C145181(continuation);
            }
        }
        Object transferRewardDetails = c145181.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c145181.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(transferRewardDetails);
                Result.Companion companion = Result.INSTANCE;
                TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
                c145181.label = 1;
                transferRewardDetails = transfersBonfireApi.getTransferRewardDetails(apiCreateTransferRequest, c145181);
                if (transferRewardDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(transferRewardDetails);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiTransferRewardDetailResponse) transferRewardDetails);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }
}
