package com.robinhood.store.advisory;

import advisory.proto.p008v1.AdvisoryService;
import advisory.proto.p008v1.GetReturnHubRequestDto;
import advisory.proto.p008v1.GetReturnHubResponseDto;
import com.robinhood.models.advisory.p304db.returns.ReturnsHub3;
import com.robinhood.models.advisory.p304db.returns.ReturnsHubResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ReturnsHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/advisory/db/returns/ReturnsHubResponse;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.ReturnsHubStore$returnsHubEndPoint$1", m3645f = "ReturnsHubStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.ReturnsHubStore$returnsHubEndPoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ReturnsHubStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super ReturnsHubResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReturnsHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnsHubStore2(ReturnsHubStore returnsHubStore, Continuation<? super ReturnsHubStore2> continuation) {
        super(2, continuation);
        this.this$0 = returnsHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReturnsHubStore2 returnsHubStore2 = new ReturnsHubStore2(this.this$0, continuation);
        returnsHubStore2.L$0 = obj;
        return returnsHubStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super ReturnsHubResponse> continuation) {
        return ((ReturnsHubStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            AdvisoryService advisoryService = this.this$0.getAdvisoryService();
            GetReturnHubRequestDto getReturnHubRequestDto = new GetReturnHubRequestDto(str);
            this.label = 1;
            obj = advisoryService.GetReturnHub(getReturnHubRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ReturnsHub3.toDbModel((GetReturnHubResponseDto) obj);
    }
}
