package com.robinhood.shared.posttransfer;

import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DynamicPostTransferTimelineDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/posttransfer/DynamicPostTransferTimelineViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineDuxo$onResume$2$1", m3645f = "DynamicPostTransferTimelineDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes6.dex */
final class DynamicPostTransferTimelineDuxo2 extends ContinuationImpl7 implements Function2<DynamicPostTransferTimelineViewState, Continuation<? super DynamicPostTransferTimelineViewState>, Object> {
    final /* synthetic */ ApiPostTransferPage.DynamicPostTransferTimeline $dynamicTimeline;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicPostTransferTimelineDuxo2(ApiPostTransferPage.DynamicPostTransferTimeline dynamicPostTransferTimeline, Continuation<? super DynamicPostTransferTimelineDuxo2> continuation) {
        super(2, continuation);
        this.$dynamicTimeline = dynamicPostTransferTimeline;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DynamicPostTransferTimelineDuxo2 dynamicPostTransferTimelineDuxo2 = new DynamicPostTransferTimelineDuxo2(this.$dynamicTimeline, continuation);
        dynamicPostTransferTimelineDuxo2.L$0 = obj;
        return dynamicPostTransferTimelineDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DynamicPostTransferTimelineViewState dynamicPostTransferTimelineViewState, Continuation<? super DynamicPostTransferTimelineViewState> continuation) {
        return ((DynamicPostTransferTimelineDuxo2) create(dynamicPostTransferTimelineViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((DynamicPostTransferTimelineViewState) this.L$0).copy(this.$dynamicTimeline);
    }
}
