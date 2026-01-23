package com.twilio.twilsock.client;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.twilio.util.ErrorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0007\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u0007\u0012#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00128\b\u0002\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u0013\u0012#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0007¢\u0006\u0002\u0010\u001aR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR5\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$RJ\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R5\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e¨\u00063"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockObserver;", "", "onConnecting", "Lkotlin/Function0;", "", "onConnected", "onDisconnected", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "reason", "onFatalError", "Lcom/twilio/util/ErrorInfo;", "errorInfo", "onNonFatalError", "onTokenAboutToExpire", "onTokenExpired", "onMessageReceived", "Lkotlin/Function2;", "messageType", "message", "onRawDataReceived", "", WebsocketGatewayConstants.DATA_KEY, "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getOnConnected", "()Lkotlin/jvm/functions/Function0;", "setOnConnected", "(Lkotlin/jvm/functions/Function0;)V", "getOnConnecting", "setOnConnecting", "getOnDisconnected", "()Lkotlin/jvm/functions/Function1;", "setOnDisconnected", "(Lkotlin/jvm/functions/Function1;)V", "getOnFatalError", "setOnFatalError", "getOnMessageReceived", "()Lkotlin/jvm/functions/Function2;", "setOnMessageReceived", "(Lkotlin/jvm/functions/Function2;)V", "getOnNonFatalError", "setOnNonFatalError", "getOnRawDataReceived", "setOnRawDataReceived", "getOnTokenAboutToExpire", "setOnTokenAboutToExpire", "getOnTokenExpired", "setOnTokenExpired", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TwilsockObserver {
    private Function0<Unit> onConnected;
    private Function0<Unit> onConnecting;
    private Function1<? super String, Unit> onDisconnected;
    private Function1<? super ErrorInfo, Unit> onFatalError;
    private Function2<? super String, ? super String, Unit> onMessageReceived;
    private Function1<? super ErrorInfo, Unit> onNonFatalError;
    private Function1<? super byte[], Boolean> onRawDataReceived;
    private Function0<Unit> onTokenAboutToExpire;
    private Function0<Unit> onTokenExpired;

    public TwilsockObserver() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public TwilsockObserver(Function0<Unit> onConnecting, Function0<Unit> onConnected, Function1<? super String, Unit> onDisconnected, Function1<? super ErrorInfo, Unit> onFatalError, Function1<? super ErrorInfo, Unit> onNonFatalError, Function0<Unit> onTokenAboutToExpire, Function0<Unit> onTokenExpired, Function2<? super String, ? super String, Unit> onMessageReceived, Function1<? super byte[], Boolean> onRawDataReceived) {
        Intrinsics.checkNotNullParameter(onConnecting, "onConnecting");
        Intrinsics.checkNotNullParameter(onConnected, "onConnected");
        Intrinsics.checkNotNullParameter(onDisconnected, "onDisconnected");
        Intrinsics.checkNotNullParameter(onFatalError, "onFatalError");
        Intrinsics.checkNotNullParameter(onNonFatalError, "onNonFatalError");
        Intrinsics.checkNotNullParameter(onTokenAboutToExpire, "onTokenAboutToExpire");
        Intrinsics.checkNotNullParameter(onTokenExpired, "onTokenExpired");
        Intrinsics.checkNotNullParameter(onMessageReceived, "onMessageReceived");
        Intrinsics.checkNotNullParameter(onRawDataReceived, "onRawDataReceived");
        this.onConnecting = onConnecting;
        this.onConnected = onConnected;
        this.onDisconnected = onDisconnected;
        this.onFatalError = onFatalError;
        this.onNonFatalError = onNonFatalError;
        this.onTokenAboutToExpire = onTokenAboutToExpire;
        this.onTokenExpired = onTokenExpired;
        this.onMessageReceived = onMessageReceived;
        this.onRawDataReceived = onRawDataReceived;
    }

    public /* synthetic */ TwilsockObserver(Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function0 function03, Function0 function04, Function2 function2, Function1 function14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0, (i & 2) != 0 ? new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02, (i & 4) != 0 ? new Function1<String, Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function1, (i & 8) != 0 ? new Function1<ErrorInfo, Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                invoke2(errorInfo);
                return Unit.INSTANCE;
            }
        } : function12, (i & 16) != 0 ? new Function1<ErrorInfo, Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                invoke2(errorInfo);
                return Unit.INSTANCE;
            }
        } : function13, (i & 32) != 0 ? new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.6
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function03, (i & 64) != 0 ? new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function04, (i & 128) != 0 ? new Function2<String, String, Unit>() { // from class: com.twilio.twilsock.client.TwilsockObserver.8
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.INSTANCE;
            }
        } : function2, (i & 256) != 0 ? new Function1<byte[], Boolean>() { // from class: com.twilio.twilsock.client.TwilsockObserver.9
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(byte[] it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        } : function14);
    }

    public final Function0<Unit> getOnConnecting() {
        return this.onConnecting;
    }

    public final void setOnConnecting(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onConnecting = function0;
    }

    public final Function0<Unit> getOnConnected() {
        return this.onConnected;
    }

    public final void setOnConnected(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onConnected = function0;
    }

    public final Function1<String, Unit> getOnDisconnected() {
        return this.onDisconnected;
    }

    public final void setOnDisconnected(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onDisconnected = function1;
    }

    public final Function1<ErrorInfo, Unit> getOnFatalError() {
        return this.onFatalError;
    }

    public final void setOnFatalError(Function1<? super ErrorInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onFatalError = function1;
    }

    public final Function1<ErrorInfo, Unit> getOnNonFatalError() {
        return this.onNonFatalError;
    }

    public final void setOnNonFatalError(Function1<? super ErrorInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onNonFatalError = function1;
    }

    public final Function0<Unit> getOnTokenAboutToExpire() {
        return this.onTokenAboutToExpire;
    }

    public final void setOnTokenAboutToExpire(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onTokenAboutToExpire = function0;
    }

    public final Function0<Unit> getOnTokenExpired() {
        return this.onTokenExpired;
    }

    public final void setOnTokenExpired(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onTokenExpired = function0;
    }

    public final Function2<String, String, Unit> getOnMessageReceived() {
        return this.onMessageReceived;
    }

    public final void setOnMessageReceived(Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onMessageReceived = function2;
    }

    public final Function1<byte[], Boolean> getOnRawDataReceived() {
        return this.onRawDataReceived;
    }

    public final void setOnRawDataReceived(Function1<? super byte[], Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onRawDataReceived = function1;
    }
}
