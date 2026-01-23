package com.twilio.twilsock.client;

import com.twilio.twilsock.client.SideEffect;
import com.twilio.twilsock.client.TwilsockEvent;
import com.twilio.twilsock.client.TwilsockState;
import com.twilio.util.ErrorInfo;
import com.twilio.util.StateMachine;
import com.twilio.util.TwilioException2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a<\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*(\u0012\u0004\u0012\u0002H\u00040\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\b\u0012\u0004\u0012\u0002H\u0004`\nH\u0002\u001a<\u0010\u000b\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*(\u0012\u0004\u0012\u0002H\u00040\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\b\u0012\u0004\u0012\u0002H\u0004`\nH\u0002\u001a<\u0010\f\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*(\u0012\u0004\u0012\u0002H\u00040\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\b\u0012\u0004\u0012\u0002H\u0004`\nH\u0002\u001a<\u0010\r\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*(\u0012\u0004\u0012\u0002H\u00040\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\b\u0012\u0004\u0012\u0002H\u0004`\nH\u0002\u001a<\u0010\u000e\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005*(\u0012\u0004\u0012\u0002H\u00040\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\b\u0012\u0004\u0012\u0002H\u0004`\nH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000*J\b\u0002\u0010\u000f\u001a\u0004\b\u0000\u0010\u0010\"\u001e\u0012\u0004\u0012\u0002H\u00100\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u001e\u0012\u0004\u0012\u0002H\u00100\u0006R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¨\u0006\u0011"}, m3636d2 = {"kTokenExpiredCode", "", "defaultOnDisconnect", "", "S", "Lcom/twilio/twilsock/client/TwilsockState;", "Lcom/twilio/util/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/twilio/util/StateMachine$GraphBuilder;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "Lcom/twilio/twilsock/client/SideEffect;", "Lcom/twilio/twilsock/client/TwilsockStateDefinitionBuilder;", "defaultOnFatalError", "defaultOnMessageReceived", "defaultOnNetworkBecameUnreachable", "defaultOnNonFatalError", "TwilsockStateDefinitionBuilder", "STATE", "twilsock_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TwilsockKt {
    private static final int kTokenExpiredCode = 20104;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S extends TwilsockState> void defaultOnMessageReceived(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S> stateDefinitionBuilder) {
        stateDefinitionBuilder.m3184on((StateMachine.Matcher) StateMachine.Matcher.INSTANCE.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnMessageReceived.class)), new Function2<S, TwilsockEvent.OnMessageReceived, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnMessageReceived.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;Lcom/twilio/twilsock/client/TwilsockEvent$OnMessageReceived;)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo<Lcom/twilio/twilsock/client/TwilsockState;Lcom/twilio/twilsock/client/SideEffect;>; */
            @Override // kotlin.jvm.functions.Function2
            public final StateMachine.Graph.State.TransitionTo invoke(TwilsockState on, TwilsockEvent.OnMessageReceived event) {
                Intrinsics.checkNotNullParameter(on, "$this$on");
                Intrinsics.checkNotNullParameter(event, "event");
                return stateDefinitionBuilder.dontTransition(on, new SideEffect.HandleMessageReceived(event.getMessage()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S extends TwilsockState> void defaultOnDisconnect(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S> stateDefinitionBuilder) {
        stateDefinitionBuilder.m3184on((StateMachine.Matcher) StateMachine.Matcher.INSTANCE.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnDisconnect.class)), new Function2<S, TwilsockEvent.OnDisconnect, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnDisconnect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;Lcom/twilio/twilsock/client/TwilsockEvent$OnDisconnect;)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo<Lcom/twilio/twilsock/client/TwilsockState;Lcom/twilio/twilsock/client/SideEffect;>; */
            @Override // kotlin.jvm.functions.Function2
            public final StateMachine.Graph.State.TransitionTo invoke(TwilsockState on, TwilsockEvent.OnDisconnect it) {
                Intrinsics.checkNotNullParameter(on, "$this$on");
                Intrinsics.checkNotNullParameter(it, "it");
                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(stateDefinitionBuilder, on, new TwilsockState.Disconnected(new ErrorInfo((TwilioException2) null, 0, 0, "disconnect called", (String) null, 23, (DefaultConstructorMarker) null)), null, false, 6, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S extends TwilsockState> void defaultOnNonFatalError(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S> stateDefinitionBuilder) {
        stateDefinitionBuilder.m3184on((StateMachine.Matcher) StateMachine.Matcher.INSTANCE.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnNonFatalError.class)), new Function2<S, TwilsockEvent.OnNonFatalError, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnNonFatalError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;Lcom/twilio/twilsock/client/TwilsockEvent$OnNonFatalError;)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo<Lcom/twilio/twilsock/client/TwilsockState;Lcom/twilio/twilsock/client/SideEffect;>; */
            @Override // kotlin.jvm.functions.Function2
            public final StateMachine.Graph.State.TransitionTo invoke(TwilsockState on, final TwilsockEvent.OnNonFatalError event) {
                Intrinsics.checkNotNullParameter(on, "$this$on");
                Intrinsics.checkNotNullParameter(event, "event");
                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(stateDefinitionBuilder, on, new TwilsockState.WaitAndReconnect(null, 1, null), new SideEffect.NotifyObservers(new Function1<TwilsockObserver, Unit>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnNonFatalError.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TwilsockObserver twilsockObserver) {
                        invoke2(twilsockObserver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TwilsockObserver $receiver) {
                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                        $receiver.getOnNonFatalError().invoke(event.getErrorInfo());
                    }
                }), false, 4, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S extends TwilsockState> void defaultOnNetworkBecameUnreachable(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S> stateDefinitionBuilder) {
        stateDefinitionBuilder.m3184on((StateMachine.Matcher) StateMachine.Matcher.INSTANCE.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnNetworkBecameUnreachable.class)), new Function2<S, TwilsockEvent.OnNetworkBecameUnreachable, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnNetworkBecameUnreachable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;Lcom/twilio/twilsock/client/TwilsockEvent$OnNetworkBecameUnreachable;)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo<Lcom/twilio/twilsock/client/TwilsockState;Lcom/twilio/twilsock/client/SideEffect;>; */
            @Override // kotlin.jvm.functions.Function2
            public final StateMachine.Graph.State.TransitionTo invoke(TwilsockState on, TwilsockEvent.OnNetworkBecameUnreachable it) {
                Intrinsics.checkNotNullParameter(on, "$this$on");
                Intrinsics.checkNotNullParameter(it, "it");
                final ErrorInfo errorInfo = new ErrorInfo(TwilioException2.NetworkBecameUnreachable, 0, 0, "Network became unreachable", (String) null, 22, (DefaultConstructorMarker) null);
                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(stateDefinitionBuilder, on, new TwilsockState.WaitAndReconnect(null, 1, null), new SideEffect.NotifyObservers(new Function1<TwilsockObserver, Unit>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnNetworkBecameUnreachable.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TwilsockObserver twilsockObserver) {
                        invoke2(twilsockObserver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TwilsockObserver $receiver) {
                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                        $receiver.getOnNonFatalError().invoke(errorInfo);
                    }
                }), false, 4, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <S extends TwilsockState> void defaultOnFatalError(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S> stateDefinitionBuilder) {
        stateDefinitionBuilder.m3184on((StateMachine.Matcher) StateMachine.Matcher.INSTANCE.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnFatalError.class)), new Function2<S, TwilsockEvent.OnFatalError, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnFatalError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Incorrect types in method signature: (TS;Lcom/twilio/twilsock/client/TwilsockEvent$OnFatalError;)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo<Lcom/twilio/twilsock/client/TwilsockState;Lcom/twilio/twilsock/client/SideEffect;>; */
            @Override // kotlin.jvm.functions.Function2
            public final StateMachine.Graph.State.TransitionTo invoke(TwilsockState on, final TwilsockEvent.OnFatalError event) {
                Intrinsics.checkNotNullParameter(on, "$this$on");
                Intrinsics.checkNotNullParameter(event, "event");
                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(stateDefinitionBuilder, on, new TwilsockState.Disconnected(event.getErrorInfo()), new SideEffect.NotifyObservers(new Function1<TwilsockObserver, Unit>() { // from class: com.twilio.twilsock.client.TwilsockKt.defaultOnFatalError.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TwilsockObserver twilsockObserver) {
                        invoke2(twilsockObserver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TwilsockObserver $receiver) {
                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                        $receiver.getOnFatalError().invoke(event.getErrorInfo());
                    }
                }), false, 4, null);
            }
        });
    }
}
