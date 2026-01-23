package com.twilio.twilsock.client;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.neovisionaries.p054ws.client.ProxySettings;
import com.neovisionaries.p054ws.client.WebSocket;
import com.neovisionaries.p054ws.client.WebSocketAdapter;
import com.neovisionaries.p054ws.client.WebSocketError;
import com.neovisionaries.p054ws.client.WebSocketException;
import com.neovisionaries.p054ws.client.WebSocketFactory;
import com.neovisionaries.p054ws.client.WebSocketFrame;
import com.plaid.internal.EnumC7081g;
import com.twilio.twilsock.client.TwilsockTransport;
import com.twilio.twilsock.util.ProxyInfo;
import com.twilio.twilsock.util.SslContext;
import com.twilio.util.ErrorInfo;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TwilsockTransport.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001(B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\bJ\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J9\u0010\u001e\u001a\u00020\u00152)\b\u0004\u0010\u001f\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150!\u0012\u0006\u0012\u0004\u0018\u00010\u00010 ¢\u0006\u0002\b\"H\u0082\b¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockTransport;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "connectTimeout", "Lkotlin/time/Duration;", "certificates", "", "", "listener", "Lcom/twilio/twilsock/client/TwilsockTransportListener;", "(Lkotlinx/coroutines/CoroutineScope;JLjava/util/List;Lcom/twilio/twilsock/client/TwilsockTransportListener;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "mState", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/twilio/twilsock/client/TwilsockTransport$State;", "kotlin.jvm.PlatformType", "webSocket", "Lcom/neovisionaries/ws/client/WebSocket;", "webSocketFactory", "Lcom/neovisionaries/ws/client/WebSocketFactory;", "connect", "", "url", "useProxy", "", "disconnect", "reason", "doDisconnect", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "notifyListener", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "sendMessage", "bytes", "", "setupProxy", "State", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TwilsockTransport {
    private final CoroutineScope coroutineScope;
    private final TwilsockTransport7 listener;
    private final AtomicReference<State> mState;
    private WebSocket webSocket;
    private final WebSocketFactory webSocketFactory;

    public /* synthetic */ TwilsockTransport(CoroutineScope coroutineScope, long j, List list, TwilsockTransport7 twilsockTransport7, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, j, list, twilsockTransport7);
    }

    private TwilsockTransport(CoroutineScope coroutineScope, long j, List<String> certificates, TwilsockTransport7 listener) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.coroutineScope = coroutineScope;
        this.listener = listener;
        this.mState = new AtomicReference<>(State.DISCONNECTED);
        WebSocketFactory webSocketFactory = new WebSocketFactory();
        this.webSocketFactory = webSocketFactory;
        webSocketFactory.setConnectionTimeout((int) Duration.m28738getInWholeMillisecondsimpl(j));
        webSocketFactory.setSSLContext(SslContext.SslContext(certificates));
        TwilioLogger.i$default(TwilioLogger3.getLogger(this), "constructed connectionTimeout: " + webSocketFactory.getConnectionTimeout(), (Throwable) null, 2, (Object) null);
    }

    public static /* synthetic */ void connect$default(TwilsockTransport twilsockTransport, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        twilsockTransport.connect(str, z);
    }

    public final synchronized void connect(String url, boolean useProxy) {
        Intrinsics.checkNotNullParameter(url, "url");
        TwilioLogger.i$default(TwilioLogger3.getLogger(this), "connect: " + url, (Throwable) null, 2, (Object) null);
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.mState, State.DISCONNECTED, State.CONNECTING)) {
            TwilioLogger.w$default(TwilioLogger3.getLogger(this), "cannot connect in state" + this.mState.get() + ". Ignored.", (Throwable) null, 2, (Object) null);
            return;
        }
        try {
            setupProxy(useProxy);
            WebSocket webSocketCreateSocket = this.webSocketFactory.createSocket(url);
            webSocketCreateSocket.addExtension("permessage-deflate");
            webSocketCreateSocket.setMissingCloseFrameAllowed(true);
            webSocketCreateSocket.addListener(new WebSocketAdapter() { // from class: com.twilio.twilsock.client.TwilsockTransport$connect$1$1

                /* compiled from: TwilsockTransport.kt */
                @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                /* renamed from: com.twilio.twilsock.client.TwilsockTransport$connect$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[WebSocketError.values().length];
                        try {
                            iArr[WebSocketError.HOSTNAME_UNVERIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[WebSocketError.SSL_HANDSHAKE_ERROR.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.neovisionaries.p054ws.client.WebSocketAdapter, com.neovisionaries.p054ws.client.WebSocketListener
                public void onConnected(WebSocket websocket, Map<String, ? extends List<String>> headers) throws Exception {
                    Intrinsics.checkNotNullParameter(websocket, "websocket");
                    super.onConnected(websocket, headers);
                    AtomicReference atomicReference = this.this$0.mState;
                    TwilsockTransport.State state = TwilsockTransport.State.CONNECTED;
                    TwilsockTransport.State state2 = (TwilsockTransport.State) atomicReference.getAndSet(state);
                    TwilioLogger.i$default(TwilioLogger3.getLogger(this), "Connected: " + state2, (Throwable) null, 2, (Object) null);
                    if (state2 != state) {
                        TwilsockTransport twilsockTransport = this.this$0;
                        BuildersKt__Builders_commonKt.launch$default(twilsockTransport.coroutineScope, null, null, new TwilsockTransport3(twilsockTransport, null), 3, null);
                    }
                }

                @Override // com.neovisionaries.p054ws.client.WebSocketAdapter, com.neovisionaries.p054ws.client.WebSocketListener
                public void onConnectError(WebSocket websocket, WebSocketException exception) throws Exception {
                    ErrorInfo errorInfo;
                    Intrinsics.checkNotNullParameter(websocket, "websocket");
                    super.onConnectError(websocket, exception);
                    TwilioLogger3.getLogger(this).m3192e("onConnectError: ", exception);
                    WebSocketError error = exception != null ? exception.getError() : null;
                    int i = error == null ? -1 : WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    if (i == 1) {
                        errorInfo = new ErrorInfo(TwilioException2.HostnameUnverified, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
                    } else if (i == 2) {
                        errorInfo = new ErrorInfo(TwilioException2.SslHandshakeError, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
                    } else {
                        errorInfo = new ErrorInfo(TwilioException2.Unknown, 0, 0, "Failed to connect", (String) null, 22, (DefaultConstructorMarker) null);
                    }
                    this.this$0.doDisconnect(errorInfo);
                }

                @Override // com.neovisionaries.p054ws.client.WebSocketAdapter, com.neovisionaries.p054ws.client.WebSocketListener
                public void onDisconnected(WebSocket websocket, WebSocketFrame serverCloseFrame, WebSocketFrame clientCloseFrame, boolean closedByServer) throws Exception {
                    Intrinsics.checkNotNullParameter(websocket, "websocket");
                    super.onDisconnected(websocket, serverCloseFrame, clientCloseFrame, closedByServer);
                    TwilioLogger.i$default(TwilioLogger3.getLogger(this), "onDisconnected: by server=" + closedByServer + "\nserverCloseFrame: " + serverCloseFrame + "\nclientCloseFrame: " + clientCloseFrame, (Throwable) null, 2, (Object) null);
                    TwilsockTransport twilsockTransport = this.this$0;
                    TwilioException2 twilioException2 = TwilioException2.TransportDisconnected;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onDisconnected: by server=");
                    sb.append(closedByServer);
                    twilsockTransport.doDisconnect(new ErrorInfo(twilioException2, 0, 0, sb.toString(), (String) null, 22, (DefaultConstructorMarker) null));
                }

                @Override // com.neovisionaries.p054ws.client.WebSocketAdapter, com.neovisionaries.p054ws.client.WebSocketListener
                public void onBinaryMessage(WebSocket websocket, byte[] binary) throws Exception {
                    Intrinsics.checkNotNullParameter(websocket, "websocket");
                    Intrinsics.checkNotNullParameter(binary, "binary");
                    super.onBinaryMessage(websocket, binary);
                    TwilioLogger logger = TwilioLogger3.getLogger(this);
                    if (logger.isVerboseEnabled()) {
                        logger.m3199v("onBinaryMessage: " + StringsKt.decodeToString(binary), (Throwable) null);
                    }
                    TwilsockTransport twilsockTransport = this.this$0;
                    BuildersKt__Builders_commonKt.launch$default(twilsockTransport.coroutineScope, null, null, new TwilsockTransport2(twilsockTransport, null, binary), 3, null);
                }
            });
            this.webSocket = webSocketCreateSocket;
            Intrinsics.checkNotNull(webSocketCreateSocket);
            webSocketCreateSocket.connectAsynchronously();
        } catch (Throwable th) {
            TwilioLogger3.getLogger(this).m3192e("Error in connect: ", th);
            doDisconnect(new ErrorInfo(TwilioException2.Unknown, 0, 0, "Error in connect: " + ExceptionsKt.stackTraceToString(th), (String) null, 22, (DefaultConstructorMarker) null));
        }
    }

    public final void sendMessage(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        WebSocket webSocket = this.webSocket;
        if ((webSocket != null ? webSocket.sendBinary(bytes) : null) == null) {
            throw new IllegalStateException("TwilsockTransport is not ready. Call connect() first");
        }
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isVerboseEnabled()) {
            logger.m3199v("sendMessage: " + StringsKt.decodeToString(bytes), (Throwable) null);
        }
    }

    public final void disconnect(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        doDisconnect(new ErrorInfo(TwilioException2.TransportDisconnected, 0, 0, "Disconnect called: " + reason, (String) null, 22, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void doDisconnect(ErrorInfo errorInfo) {
        try {
            AtomicReference<State> atomicReference = this.mState;
            State state = State.DISCONNECTED;
            State andSet = atomicReference.getAndSet(state);
            TwilioLogger.i$default(TwilioLogger3.getLogger(this), "doDisconnect(" + errorInfo + "): " + andSet, (Throwable) null, 2, (Object) null);
            if (andSet != state) {
                WebSocket webSocket = this.webSocket;
                if (webSocket != null) {
                    webSocket.disconnect(1000);
                }
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new TwilsockTransport4(this, null, errorInfo), 3, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void setupProxy(boolean useProxy) {
        ProxySettings proxySettings = this.webSocketFactory.getProxySettings();
        proxySettings.reset();
        if (useProxy) {
            ProxyInfo proxyInfo = new ProxyInfo();
            if (proxyInfo.getHost() == null) {
                TwilioLogger.i$default(TwilioLogger3.getLogger(this), "Proxy info is not set", (Throwable) null, 2, (Object) null);
                return;
            }
            TwilioLogger.i$default(TwilioLogger3.getLogger(this), "Using proxy: " + proxyInfo.getHost() + ':' + proxyInfo.getPort(), (Throwable) null, 2, (Object) null);
            proxySettings.setHost(proxyInfo.getHost()).setPort(proxyInfo.getPort()).setCredentials(proxyInfo.getUser(), proxyInfo.getPassword());
        }
    }

    /* compiled from: TwilsockTransport.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockTransport$notifyListener$1", m3645f = "TwilsockTransport.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.twilio.twilsock.client.TwilsockTransport$notifyListener$1 */
    public static final class C435161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<TwilsockTransport7, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ TwilsockTransport this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C435161(Function2<? super TwilsockTransport7, ? super Continuation<? super Unit>, ? extends Object> function2, TwilsockTransport twilsockTransport, Continuation<? super C435161> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.this$0 = twilsockTransport;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435161(this.$block, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<TwilsockTransport7, Continuation<? super Unit>, Object> function2 = this.$block;
                TwilsockTransport7 twilsockTransport7 = this.this$0.listener;
                this.label = 1;
                if (function2.invoke(twilsockTransport7, this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$block.invoke(this.this$0.listener, this);
            return Unit.INSTANCE;
        }
    }

    private final void notifyListener(Function2<? super TwilsockTransport7, ? super Continuation<? super Unit>, ? extends Object> block) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435161(block, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TwilsockTransport.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockTransport$State;", "", "(Ljava/lang/String;I)V", "DISCONNECTED", "CONNECTING", "CONNECTED", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DISCONNECTED = new State("DISCONNECTED", 0);
        public static final State CONNECTING = new State("CONNECTING", 1);
        public static final State CONNECTED = new State("CONNECTED", 2);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DISCONNECTED, CONNECTING, CONNECTED};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }
    }
}
