package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.compose.bento.util.PointerInputScopes;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import rh_server_driven_ui.p531v1.ActionDto;

/* compiled from: SduiDecoratorIdl.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$SduiDecorator$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class SduiDecoratorIdl2 implements PointerInputEventHandler {
    final /* synthetic */ SduiActionHandler<ActionT> $actionHandler;
    final /* synthetic */ DtoActionHandler<ActionT> $dtoActionHandler;
    final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Function1<ActionDto, ActionT> $parseAction;
    final /* synthetic */ ActionDto $tapAction;

    /* JADX WARN: Multi-variable type inference failed */
    SduiDecoratorIdl2(Function1<? super ActionDto, ? extends ActionT> function1, ActionDto actionDto, SduiActionHandler<? super ActionT> sduiActionHandler, DtoActionHandler<ActionT> dtoActionHandler, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger) {
        this.$parseAction = function1;
        this.$tapAction = actionDto;
        this.$actionHandler = sduiActionHandler;
        this.$dtoActionHandler = dtoActionHandler;
        this.$eventDescriptor = userInteractionEventDescriptor;
        this.$eventLogger = eventLogger;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function1<ActionDto, ActionT> function1 = this.$parseAction;
        final ActionDto actionDto = this.$tapAction;
        final SduiActionHandler<ActionT> sduiActionHandler = this.$actionHandler;
        final DtoActionHandler<ActionT> dtoActionHandler = this.$dtoActionHandler;
        final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
        final EventLogger eventLogger = this.$eventLogger;
        Object objDetectTap = PointerInputScopes.detectTap(pointerInputScope, new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$SduiDecorator$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SduiDecoratorIdl2.invoke$lambda$0(function1, actionDto, sduiActionHandler, dtoActionHandler, userInteractionEventDescriptor, eventLogger, (Offset) obj);
            }
        }, continuation);
        return objDetectTap == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTap : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, ActionDto actionDto, SduiActionHandler sduiActionHandler, DtoActionHandler dtoActionHandler, UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Offset offset) {
        Object objInvoke = function1.invoke(actionDto);
        if (objInvoke != null) {
            SduiActionHandler3.handling(objInvoke, sduiActionHandler, dtoActionHandler).invoke();
        }
        if (userInteractionEventDescriptor != null) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.TAP), false, false, 6, null);
        }
        return Unit.INSTANCE;
    }
}
