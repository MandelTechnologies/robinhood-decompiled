package com.robinhood.android.p273ui.tooltip;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: WatchlistTabTooltipService.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$hasSeenFlow$1", m3645f = "WatchlistTabTooltipService.kt", m3646l = {35}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.ui.tooltip.WatchlistTabTooltipService$shouldShowTooltip$hasSeenFlow$1, reason: use source file name */
/* loaded from: classes9.dex */
final class WatchlistTabTooltipService2 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WatchlistTabTooltipService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchlistTabTooltipService2(WatchlistTabTooltipService watchlistTabTooltipService, Continuation<? super WatchlistTabTooltipService2> continuation) {
        super(2, continuation);
        this.this$0 = watchlistTabTooltipService;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WatchlistTabTooltipService2 watchlistTabTooltipService2 = new WatchlistTabTooltipService2(this.this$0, continuation);
        watchlistTabTooltipService2.L$0 = obj;
        return watchlistTabTooltipService2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
        return ((WatchlistTabTooltipService2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Boolean boolBoxBoolean = boxing.boxBoolean(this.this$0.hasSeenTooltipPref.get());
            this.label = 1;
            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
