package com.twilio.twilsock.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/twilsock/client/SideEffect;", "", "()V", "HandleMessageReceived", "NotifyObservers", "Lcom/twilio/twilsock/client/SideEffect$HandleMessageReceived;", "Lcom/twilio/twilsock/client/SideEffect$NotifyObservers;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
abstract class SideEffect {
    public /* synthetic */ SideEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001e\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007R\"\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/twilio/twilsock/client/SideEffect$NotifyObservers;", "Lcom/twilio/twilsock/client/SideEffect;", "block", "Lkotlin/Function1;", "Lcom/twilio/twilsock/client/TwilsockObserver;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getBlock", "()Lkotlin/jvm/functions/Function1;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class NotifyObservers extends SideEffect {
        private final Function1<TwilsockObserver, Unit> block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NotifyObservers(Function1<? super TwilsockObserver, Unit> block) {
            super(null);
            Intrinsics.checkNotNullParameter(block, "block");
            this.block = block;
        }

        public final Function1<TwilsockObserver, Unit> getBlock() {
            return this.block;
        }
    }

    private SideEffect() {
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/twilio/twilsock/client/SideEffect$HandleMessageReceived;", "Lcom/twilio/twilsock/client/SideEffect;", "message", "Lcom/twilio/twilsock/client/TwilsockMessage;", "(Lcom/twilio/twilsock/client/TwilsockMessage;)V", "getMessage", "()Lcom/twilio/twilsock/client/TwilsockMessage;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class HandleMessageReceived extends SideEffect {
        private final TwilsockMessage message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleMessageReceived(TwilsockMessage message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final TwilsockMessage getMessage() {
            return this.message;
        }
    }
}
