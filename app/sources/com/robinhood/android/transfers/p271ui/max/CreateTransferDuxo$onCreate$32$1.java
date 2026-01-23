package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.ValidateContributionTypeRequest;
import com.robinhood.models.api.bonfire.ValidateContributionTypeResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ValidateContributionTypeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$32$1", m3645f = "CreateTransferDuxo.kt", m3646l = {644}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferDuxo$onCreate$32$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ValidateContributionTypeResponse>, Object> {
    int label;
    final /* synthetic */ CreateTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferDuxo$onCreate$32$1(CreateTransferDuxo createTransferDuxo, Continuation<? super CreateTransferDuxo$onCreate$32$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferDuxo$onCreate$32$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ValidateContributionTypeResponse> continuation) {
        return ((CreateTransferDuxo$onCreate$32$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
        IraContributionType iraContributionType = ((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTransferConfiguration().getIraContributionType();
        if (iraContributionType != null) {
            ValidateContributionTypeRequest validateContributionTypeRequest = new ValidateContributionTypeRequest(iraContributionType);
            this.label = 1;
            Object objValidateContributionType = transfersBonfireApi.validateContributionType(validateContributionTypeRequest, this);
            return objValidateContributionType == coroutine_suspended ? coroutine_suspended : objValidateContributionType;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
