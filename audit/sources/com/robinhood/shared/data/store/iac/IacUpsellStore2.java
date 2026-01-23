package com.robinhood.shared.data.store.iac;

import com.robinhood.models.p355ui.IacUpsellLocation;
import com.robinhood.models.p355ui.IacUpsellResponse;
import com.robinhood.shared.api.iac.IacUpsellApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IacUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/IacUpsellResponse;", "param", "Lcom/robinhood/shared/data/store/iac/IacUpsellsParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.data.store.iac.IacUpsellStore$endpoint$1", m3645f = "IacUpsellStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.data.store.iac.IacUpsellStore$endpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class IacUpsellStore2 extends ContinuationImpl7 implements Function2<IacUpsellsParams, Continuation<? super IacUpsellResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IacUpsellStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IacUpsellStore2(IacUpsellStore iacUpsellStore, Continuation<? super IacUpsellStore2> continuation) {
        super(2, continuation);
        this.this$0 = iacUpsellStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IacUpsellStore2 iacUpsellStore2 = new IacUpsellStore2(this.this$0, continuation);
        iacUpsellStore2.L$0 = obj;
        return iacUpsellStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(IacUpsellsParams iacUpsellsParams, Continuation<? super IacUpsellResponse> continuation) {
        return ((IacUpsellStore2) create(iacUpsellsParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
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
        IacUpsellsParams iacUpsellsParams = (IacUpsellsParams) this.L$0;
        IacUpsellApi iacUpsellApi = this.this$0.getIacUpsellApi();
        IacUpsellLocation location = iacUpsellsParams.getLocation();
        UUID instrumentId = iacUpsellsParams.getInstrumentId();
        UUID orderId = iacUpsellsParams.getOrderId();
        UUID depositId = iacUpsellsParams.getDepositId();
        String accountNumber = iacUpsellsParams.getAccountNumber();
        String entryPoint = iacUpsellsParams.getEntryPoint();
        Boolean notificationStatus = iacUpsellsParams.getNotificationStatus();
        this.label = 1;
        Object iacUpsell = iacUpsellApi.getIacUpsell(location, instrumentId, orderId, depositId, accountNumber, entryPoint, notificationStatus, this);
        return iacUpsell == coroutine_suspended ? coroutine_suspended : iacUpsell;
    }
}
