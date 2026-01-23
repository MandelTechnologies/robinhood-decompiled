package com.robinhood.android.feature.margin.maintenance.table;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.lazy.LazyListState;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: MarginMaintenanceTableComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$2$1", m3645f = "MarginMaintenanceTableComposable.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginMaintenanceTableComposable5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ UserInteractionEventDescriptor $loggingDescriptor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginMaintenanceTableComposable5(LazyListState lazyListState, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Continuation<? super MarginMaintenanceTableComposable5> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$loggingDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginMaintenanceTableComposable5(this.$listState, this.$loggingDescriptor, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginMaintenanceTableComposable5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Interaction> interactions = this.$listState.getInteractionSource().getInteractions();
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$loggingDescriptor;
            final EventLogger eventLogger = this.$eventLogger;
            FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: com.robinhood.android.feature.margin.maintenance.table.MarginMaintenanceTableComposableKt$MarginMaintenanceTableComposable$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                    if (interaction instanceof DragInteraction.Start) {
                        Screen screen = userInteractionEventDescriptor.getScreen();
                        Context context = userInteractionEventDescriptor.getContext();
                        EventLogger.DefaultImpls.logScroll$default(eventLogger, null, screen, new Component(Component.ComponentType.TABLE, null, null, 6, null), null, context, 9, null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interactions.collect(flowCollector, this) == coroutine_suspended) {
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
