package com.robinhood.shared.posttransfer;

import com.robinhood.android.truelayer.TrueLayerSession;
import com.robinhood.models.api.bonfire.transfer.ApiInitialPostTransferTimelineAction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DynamicPostTransferTimelineFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$onViewCreated$1$1", m3645f = "DynamicPostTransferTimelineFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.posttransfer.DynamicPostTransferTimelineFragment$onViewCreated$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class DynamicPostTransferTimelineFragment5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiInitialPostTransferTimelineAction $action;
    int label;
    final /* synthetic */ DynamicPostTransferTimelineFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicPostTransferTimelineFragment5(DynamicPostTransferTimelineFragment dynamicPostTransferTimelineFragment, ApiInitialPostTransferTimelineAction apiInitialPostTransferTimelineAction, Continuation<? super DynamicPostTransferTimelineFragment5> continuation) {
        super(2, continuation);
        this.this$0 = dynamicPostTransferTimelineFragment;
        this.$action = apiInitialPostTransferTimelineAction;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DynamicPostTransferTimelineFragment5(this.this$0, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DynamicPostTransferTimelineFragment5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            TrueLayerSession trueLayerSession = this.this$0.trueLayerSession;
            if (trueLayerSession == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trueLayerSession");
                trueLayerSession = null;
            }
            String string2 = ((ApiInitialPostTransferTimelineAction.TrueLayerProcessPaymentAction) this.$action).getPayment_id().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            trueLayerSession.startAndListenToNewTrueLayerSession(string2, ((ApiInitialPostTransferTimelineAction.TrueLayerProcessPaymentAction) this.$action).getResource_token(), "https://applink.robinhood.com/truelayer_redirect", false);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
