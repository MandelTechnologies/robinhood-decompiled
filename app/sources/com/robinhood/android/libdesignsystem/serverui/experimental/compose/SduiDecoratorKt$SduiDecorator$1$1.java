package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.util.PointerInputScopes;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: SduiDecorator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
final class SduiDecoratorKt$SduiDecorator$1$1 implements PointerInputEventHandler {
    final /* synthetic */ SduiActionHandler<ActionT> $actionHandler;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;

    /* JADX INFO: Incorrect field signature: TActionT; */
    final /* synthetic */ Parcelable $tapAction;

    /* JADX WARN: Incorrect types in method signature: (Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler<-TActionT;>;TActionT;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/analytics/EventLogger;)V */
    SduiDecoratorKt$SduiDecorator$1$1(SduiActionHandler sduiActionHandler, Parcelable parcelable, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
        this.$actionHandler = sduiActionHandler;
        this.$tapAction = parcelable;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SduiActionHandler<ActionT> sduiActionHandler = this.$actionHandler;
        final Parcelable parcelable = this.$tapAction;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final EventLogger eventLogger = this.$eventLogger;
        Object objDetectTap = PointerInputScopes.detectTap(pointerInputScope, new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$SduiDecorator$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiDecoratorKt$SduiDecorator$1$1.invoke$lambda$0(sduiActionHandler, parcelable, userInteractionEventDescriptor, eventLogger, (Offset) obj);
            }
        }, continuation);
        return objDetectTap == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTap : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SduiActionHandler sduiActionHandler, Parcelable parcelable, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Offset offset) {
        SduiActionHandler3.handling(sduiActionHandler, parcelable).invoke();
        if (userInteractionEventDescriptor != null) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.TAP), false, false, 6, null);
        }
        return Unit.INSTANCE;
    }
}
