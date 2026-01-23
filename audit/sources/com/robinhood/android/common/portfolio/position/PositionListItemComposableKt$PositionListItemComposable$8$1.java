package com.robinhood.android.common.portfolio.position;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.portfolio.position.PositionItemState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PositionListItemComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.position.PositionListItemComposableKt$PositionListItemComposable$8$1", m3645f = "PositionListItemComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PositionListItemComposableKt$PositionListItemComposable$8$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PositionItemState $concreteUiState;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Screen $screen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionListItemComposableKt$PositionListItemComposable$8$1(PositionItemState positionItemState, EventLogger eventLogger, Screen screen, Continuation<? super PositionListItemComposableKt$PositionListItemComposable$8$1> continuation) {
        super(2, continuation);
        this.$concreteUiState = positionItemState;
        this.$eventLogger = eventLogger;
        this.$screen = screen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionListItemComposableKt$PositionListItemComposable$8$1(this.$concreteUiState, this.$eventLogger, this.$screen, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionListItemComposableKt$PositionListItemComposable$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UiEvent<?> event;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SwipeAnimationPreview swipeAnimationPreview = ((PositionItemState.Loaded) this.$concreteUiState).getSwipeAnimationPreview();
        if (swipeAnimationPreview != null && (event = swipeAnimationPreview.getEvent()) != null && !event.getConsumed()) {
            EventLogger.DefaultImpls.logAppear$default(this.$eventLogger, UserInteractionEventData.Action.ANIMATION, this.$screen, new Component(Component.ComponentType.HOLDING_ROW, "equities_swipe_to_trade_nux", null, 4, null), null, null, 24, null);
        }
        return Unit.INSTANCE;
    }
}
