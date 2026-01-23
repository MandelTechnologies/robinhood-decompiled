package com.twilio.twilsock.client;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.twilio.twilsock.client.SideEffect;
import com.twilio.twilsock.client.TwilsockEvent;
import com.twilio.twilsock.client.TwilsockImpl.C434801;
import com.twilio.twilsock.client.TwilsockMessage;
import com.twilio.twilsock.client.TwilsockState;
import com.twilio.twilsock.util.ConnectivityMonitor;
import com.twilio.twilsock.util.ConnectivityMonitorAndroid;
import com.twilio.twilsock.util.HandledInCppException;
import com.twilio.twilsock.util.HttpRequest;
import com.twilio.twilsock.util.HttpResponse;
import com.twilio.twilsock.util.MultiMap2;
import com.twilio.twilsock.util.Unsubscriber;
import com.twilio.twilsock.util.commonUtils;
import com.twilio.util.AccountDescriptor;
import com.twilio.util.ErrorInfo;
import com.twilio.util.Fibonacci2;
import com.twilio.util.InternalUtils3;
import com.twilio.util.StateMachine;
import com.twilio.util.Timer;
import com.twilio.util.TwilioException;
import com.twilio.util.TwilioException2;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import io.ktor.http.HttpStatusCode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementBuilders;
import kotlinx.serialization.json.JsonElementBuilders2;

/* compiled from: Twilsock.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012l\b\u0002\u0010\u0011\u001af\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0012j\u0002`\u001b¢\u0006\u0002\u0010\u001cJ\u000e\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u000201J!\u0010I\u001a\u00020J2\u0017\u0010L\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020N0M¢\u0006\u0002\bOH\u0016J\u0012\u0010P\u001a\u0004\u0018\u0001042\u0006\u0010Q\u001a\u000204H\u0002J\u0015\u0010R\u001a\u00020\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\b\u0010U\u001a\u00020NH\u0002J\b\u0010V\u001a\u00020NH\u0016J\b\u0010W\u001a\u00020NH\u0002J\u001a\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020\u0015H\u0002ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u0002042\u0006\u0010]\u001a\u00020\u0006H\u0002J\u0010\u0010^\u001a\u0002042\u0006\u0010_\u001a\u00020`H\u0002J*\u0010^\u001a\u0002042\u0006\u0010a\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020bH\u0002ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ\b\u0010e\u001a\u00020NH\u0016J\u0010\u0010f\u001a\u00020N2\u0006\u0010g\u001a\u00020hH\u0002J\u0010\u0010i\u001a\u00020N2\u0006\u0010g\u001a\u00020hH\u0002J\u0010\u0010j\u001a\u00020N2\u0006\u0010k\u001a\u00020lH\u0002J\u0010\u0010m\u001a\u00020N2\u0006\u0010k\u001a\u00020nH\u0002J\u0010\u0010o\u001a\u00020N2\u0006\u0010k\u001a\u00020pH\u0002J\u0010\u0010o\u001a\u00020N2\u0006\u0010q\u001a\u00020bH\u0016J\u0010\u0010r\u001a\u00020N2\u0006\u0010k\u001a\u00020sH\u0002J\u0010\u0010t\u001a\u00020N2\u0006\u0010k\u001a\u00020uH\u0002J$\u0010v\u001a\u00020w2\u0019\b\u0004\u0010L\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020N0M¢\u0006\u0002\bOH\u0082\bJ\"\u0010x\u001a\u00020N2\u0017\u0010L\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020N0M¢\u0006\u0002\bOH\u0082\bJ\b\u0010y\u001a\u00020NH\u0002J\b\u0010z\u001a\u00020NH\u0002J\u0010\u0010{\u001a\u00020N2\u0006\u0010q\u001a\u00020bH\u0016J\u0010\u0010|\u001a\u00020N2\u0006\u0010Q\u001a\u000204H\u0002J\b\u0010}\u001a\u00020NH\u0002J\b\u0010~\u001a\u00020NH\u0016J\u0010\u0010\u007f\u001a\u00020N2\u0006\u0010g\u001a\u00020hH\u0016J\u0019\u0010\u0080\u0001\u001a\u00020N2\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0082\u0001H\u0016J\t\u0010\u0083\u0001\u001a\u00020NH\u0002J\t\u0010\u0084\u0001\u001a\u00020NH\u0002J\u0019\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010_\u001a\u00020`H\u0096@¢\u0006\u0003\u0010\u0087\u0001J0\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010a\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u00152\u0007\u0010\u0088\u0001\u001a\u00020bH\u0096@ø\u0001\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020NH\u0002J\t\u0010\u008c\u0001\u001a\u00020NH\u0002J\u0018\u0010\u008d\u0001\u001a\u00020N2\u0006\u0010]\u001a\u00020\u0006H\u0096@¢\u0006\u0003\u0010\u008e\u0001J\r\u0010\u008f\u0001\u001a\u00020N*\u000204H\u0002J\"\u0010\u0090\u0001\u001a\u00020N*\u00020p2\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\t\b\u0002\u0010\u0093\u0001\u001a\u00020\u0006H\u0002R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020403¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001d\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020403¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0011\u00109\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R \u0010=\u001a\u0014\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ERr\u0010\u0011\u001af\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u0012j\u0002`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010H\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/twilio/twilsock/client/TwilsockImpl;", "Lcom/twilio/twilsock/client/Twilsock;", "Lcom/twilio/twilsock/client/TwilsockTransportListener;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "url", "", "useProxy", "", "authData", "Lcom/twilio/twilsock/client/AuthData;", "clientMetadata", "Lcom/twilio/twilsock/client/ClientMetadata;", "continuationTokenStorage", "Lcom/twilio/twilsock/client/ContinuationTokenStorage;", "connectivityMonitor", "Lcom/twilio/twilsock/util/ConnectivityMonitor;", "twilsockTransportFactory", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "Lkotlin/time/Duration;", "connectTimeout", "", "certificates", "listener", "Lcom/twilio/twilsock/client/TwilsockTransport;", "Lcom/twilio/twilsock/client/TwilsockTransportFactory;", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;ZLcom/twilio/twilsock/client/AuthData;Lcom/twilio/twilsock/client/ClientMetadata;Lcom/twilio/twilsock/client/ContinuationTokenStorage;Lcom/twilio/twilsock/util/ConnectivityMonitor;Lkotlin/jvm/functions/Function4;)V", "accountDescriptor", "Lcom/twilio/util/AccountDescriptor;", "getAccountDescriptor", "()Lcom/twilio/util/AccountDescriptor;", "setAccountDescriptor", "(Lcom/twilio/util/AccountDescriptor;)V", "failedReconnectionAttempts", "", "getFailedReconnectionAttempts", "()I", "setFailedReconnectionAttempts", "(I)V", "initRegistrations", "", "getInitRegistrations", "()Ljava/util/Set;", "isConnected", "()Z", "isNetworkAvailable", "observers", "Lcom/twilio/twilsock/client/TwilsockObserver;", "pendingRequests", "", "Lcom/twilio/twilsock/client/TwilsockRequest;", "getPendingRequests", "()Ljava/util/Map;", "sentRequests", "getSentRequests", "state", "Lcom/twilio/twilsock/client/TwilsockState;", "getState", "()Lcom/twilio/twilsock/client/TwilsockState;", "stateMachine", "Lcom/twilio/util/StateMachine;", "Lcom/twilio/twilsock/client/TwilsockEvent;", "Lcom/twilio/twilsock/client/SideEffect;", "token", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "watchdogTimer", "Lcom/twilio/util/Timer;", "websocket", "addObserver", "Lcom/twilio/twilsock/util/Unsubscriber;", "observer", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "addPendingRequest", "request", "calcDefaultWaitTime", "calcDefaultWaitTime-UwyO8pc", "()J", "cancelWatchdogTimer", "connect", "connectWebSocket", "createInitRequest", "timeout", "createInitRequest-LRDsOJo", "(J)Lcom/twilio/twilsock/client/TwilsockRequest;", "createUpdateTokenRequest", "newToken", "createUpstreamRequest", "httpRequest", "Lcom/twilio/twilsock/util/HttpRequest;", "requestId", "", "createUpstreamRequest-8Mi8wO0", "(Ljava/lang/String;J[B)Lcom/twilio/twilsock/client/TwilsockRequest;", "disconnect", "failAllPendingRequests", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "failAllSentRequests", "handleClientUpdateMessage", "message", "Lcom/twilio/twilsock/client/TwilsockClientUpdateMessage;", "handleCloseMessage", "Lcom/twilio/twilsock/client/TwilsockCloseMessage;", "handleMessageReceived", "Lcom/twilio/twilsock/client/TwilsockMessage;", WebsocketGatewayConstants.DATA_KEY, "handleNotificationMessage", "Lcom/twilio/twilsock/client/TwilsockNotificationMessage;", "handleReplyMessage", "Lcom/twilio/twilsock/client/TwilsockReplyMessage;", "notifyObservers", "Lkotlinx/coroutines/Job;", "notifyObserversSync", "onConnectivityChanged", "onInitMessageReceived", "onMessageReceived", "onRequestFinished", "onTimeout", "onTransportConnected", "onTransportDisconnected", "populateInitRegistrations", "messageTypes", "", "restartWatchdogTimer", "sendAllPendingRequests", "sendRequest", "Lcom/twilio/twilsock/util/HttpResponse;", "(Lcom/twilio/twilsock/util/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawMessage", "sendRequest-dWUq8MI", "(Ljava/lang/String;J[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdownWebSocket", "startWatchdogTimer", "updateToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "sendReply", "status", "Lcom/twilio/twilsock/client/Status;", "description", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TwilsockImpl implements Twilsock, TwilsockTransport7 {
    private AccountDescriptor accountDescriptor;
    private final AuthData authData;
    private final ClientMetadata clientMetadata;
    private final ConnectivityMonitor connectivityMonitor;
    private final ContinuationTokenStorage continuationTokenStorage;
    private final CoroutineScope coroutineScope;
    private int failedReconnectionAttempts;
    private final Set<String> initRegistrations;
    private final Set<TwilsockObserver> observers;
    private final Map<String, TwilsockRequest> pendingRequests;
    private final Map<String, TwilsockRequest> sentRequests;
    private final StateMachine<TwilsockState, TwilsockEvent, SideEffect> stateMachine;
    private String token;
    private final Function4<CoroutineScope, Duration, List<String>, TwilsockTransport7, TwilsockTransport> twilsockTransportFactory;
    private final String url;
    private final boolean useProxy;
    private final Timer watchdogTimer;
    private TwilsockTransport websocket;

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TwilioException2.values().length];
            try {
                iArr[TwilioException2.SslHandshakeError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TwilioException2.HostnameUnverified.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl", m3645f = "Twilsock.kt", m3646l = {500}, m3647m = "sendRequest")
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$sendRequest$1 */
    static final class C434831 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434831(Continuation<? super C434831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TwilsockImpl.this.sendRequest(null, this);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl", m3645f = "Twilsock.kt", m3646l = {536}, m3647m = "sendRequest-dWUq8MI")
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$sendRequest$2 */
    static final class C434842 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434842(Continuation<? super C434842> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TwilsockImpl.this.mo27200sendRequestdWUq8MI(null, 0L, null, this);
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl", m3645f = "Twilsock.kt", m3646l = {569}, m3647m = "updateToken")
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$updateToken$1 */
    static final class C434921 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434921(Continuation<? super C434921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TwilsockImpl.this.updateToken(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TwilsockImpl(CoroutineScope coroutineScope, String url, boolean z, AuthData authData, ClientMetadata clientMetadata, ContinuationTokenStorage continuationTokenStorage, ConnectivityMonitor connectivityMonitor, Function4<? super CoroutineScope, ? super Duration, ? super List<String>, ? super TwilsockTransport7, TwilsockTransport> twilsockTransportFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(authData, "authData");
        Intrinsics.checkNotNullParameter(clientMetadata, "clientMetadata");
        Intrinsics.checkNotNullParameter(continuationTokenStorage, "continuationTokenStorage");
        Intrinsics.checkNotNullParameter(connectivityMonitor, "connectivityMonitor");
        Intrinsics.checkNotNullParameter(twilsockTransportFactory, "twilsockTransportFactory");
        this.coroutineScope = coroutineScope;
        this.url = url;
        this.useProxy = z;
        this.authData = authData;
        this.clientMetadata = clientMetadata;
        this.continuationTokenStorage = continuationTokenStorage;
        this.connectivityMonitor = connectivityMonitor;
        this.twilsockTransportFactory = twilsockTransportFactory;
        this.token = authData.getToken();
        this.initRegistrations = new LinkedHashSet();
        this.pendingRequests = new LinkedHashMap();
        this.sentRequests = new LinkedHashMap();
        this.observers = new LinkedHashSet();
        this.watchdogTimer = new Timer(coroutineScope);
        this.stateMachine = StateMachine.INSTANCE.create(new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect> graphBuilder) {
                invoke2(graphBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect> create) {
                Intrinsics.checkNotNullParameter(create, "$this$create");
                create.initialState(new TwilsockState.Disconnected(new ErrorInfo((TwilioException2) null, 0, 0, "twilsock created", (String) null, 23, (DefaultConstructorMarker) null)));
                final TwilsockImpl twilsockImpl = this.this$0;
                Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Disconnected>, Unit> function1 = new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Disconnected>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Disconnected> stateDefinitionBuilder) {
                        invoke2(stateDefinitionBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Disconnected> state) {
                        Intrinsics.checkNotNullParameter(state, "$this$state");
                        final TwilsockImpl twilsockImpl2 = twilsockImpl;
                        state.onEnter(new Function2<TwilsockState.Disconnected, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Disconnected disconnected, TwilsockEvent twilsockEvent) {
                                invoke2(disconnected, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Disconnected onEnter, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onEnter, "$this$onEnter");
                                Intrinsics.checkNotNullParameter(it, "it");
                                twilsockImpl2.setFailedReconnectionAttempts(0);
                                twilsockImpl2.connectivityMonitor.stop();
                                twilsockImpl2.failAllSentRequests(onEnter.getErrorInfo());
                                twilsockImpl2.failAllPendingRequests(onEnter.getErrorInfo());
                                twilsockImpl2.shutdownWebSocket();
                                TwilsockImpl twilsockImpl3 = twilsockImpl2;
                                BuildersKt__Builders_commonKt.launch$default(twilsockImpl3.coroutineScope, null, null, new C43467x63982183(twilsockImpl3, null, onEnter), 3, null);
                            }
                        });
                        final TwilsockImpl twilsockImpl3 = twilsockImpl;
                        state.onExit(new Function2<TwilsockState.Disconnected, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.1.2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Disconnected disconnected, TwilsockEvent twilsockEvent) {
                                invoke2(disconnected, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Disconnected onExit, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onExit, "$this$onExit");
                                Intrinsics.checkNotNullParameter(it, "it");
                                twilsockImpl3.connectivityMonitor.start();
                            }
                        });
                        Function2<TwilsockState.Disconnected, TwilsockEvent.OnConnect, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>> function2 = new Function2<TwilsockState.Disconnected, TwilsockEvent.OnConnect, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Disconnected on, TwilsockEvent.OnConnect it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connecting.INSTANCE, null, false, 6, null);
                            }
                        };
                        StateMachine.Matcher.Companion companion = StateMachine.Matcher.INSTANCE;
                        state.m3184on((StateMachine.Matcher) companion.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnConnect.class)), (Function2) function2);
                        final TwilsockImpl twilsockImpl4 = twilsockImpl;
                        state.m3184on((StateMachine.Matcher) companion.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnUpdateToken.class)), (Function2) new Function2<TwilsockState.Disconnected, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.1.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Disconnected on, TwilsockEvent.OnUpdateToken event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl4.setToken(event.getToken());
                                event.getRequest().cancel(new ErrorInfo(TwilioException2.TokenUpdatedLocally, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null));
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connecting.INSTANCE, null, false, 6, null);
                            }
                        });
                        state.m3184on((StateMachine.Matcher) companion.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnSendRequest.class)), (Function2) new Function2<TwilsockState.Disconnected, TwilsockEvent.OnSendRequest, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.1.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Disconnected on, TwilsockEvent.OnSendRequest event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                event.getRequest().cancel(new ErrorInfo(TwilioException2.TransportDisconnected, 0, 0, "Cannot send request in disconnected state", (String) null, 22, (DefaultConstructorMarker) null));
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                    }
                };
                StateMachine.Matcher.Companion companion = StateMachine.Matcher.INSTANCE;
                create.state(companion.any(Reflection.getOrCreateKotlinClass(TwilsockState.Disconnected.class)), (Function1<? super StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S>, Unit>) function1);
                final TwilsockImpl twilsockImpl2 = this.this$0;
                create.state(companion.any(Reflection.getOrCreateKotlinClass(TwilsockState.Connecting.class)), (Function1<? super StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S>, Unit>) new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Connecting>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Connecting> stateDefinitionBuilder) {
                        invoke2(stateDefinitionBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Connecting> state) {
                        Intrinsics.checkNotNullParameter(state, "$this$state");
                        final TwilsockImpl twilsockImpl3 = twilsockImpl2;
                        state.onEnter(new Function2<TwilsockState.Connecting, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.2.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Connecting connecting, TwilsockEvent twilsockEvent) {
                                invoke2(connecting, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Connecting onEnter, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onEnter, "$this$onEnter");
                                Intrinsics.checkNotNullParameter(it, "it");
                                twilsockImpl3.connectWebSocket();
                                TwilsockImpl twilsockImpl4 = twilsockImpl3;
                                BuildersKt__Builders_commonKt.launch$default(twilsockImpl4.coroutineScope, null, null, new C43468x773ff504(twilsockImpl4, null), 3, null);
                            }
                        });
                        TwilsockKt.defaultOnDisconnect(state);
                        final TwilsockImpl twilsockImpl4 = twilsockImpl2;
                        Function2<TwilsockState.Connecting, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>> function2 = new Function2<TwilsockState.Connecting, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Connecting on, TwilsockEvent.OnUpdateToken event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl4.setToken(event.getToken());
                                event.getRequest().cancel(new ErrorInfo(TwilioException2.TokenUpdatedLocally, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null));
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        };
                        StateMachine.Matcher.Companion companion2 = StateMachine.Matcher.INSTANCE;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnUpdateToken.class)), (Function2) function2);
                        final TwilsockImpl twilsockImpl5 = twilsockImpl2;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnSendRequest.class)), (Function2) new Function2<TwilsockState.Connecting, TwilsockEvent.OnSendRequest, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.2.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Connecting on, TwilsockEvent.OnSendRequest event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl5.addPendingRequest(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnTransportConnected.class)), (Function2) new Function2<TwilsockState.Connecting, TwilsockEvent.OnTransportConnected, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.2.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Connecting on, TwilsockEvent.OnTransportConnected it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Initializing.INSTANCE, null, false, 6, null);
                            }
                        });
                        TwilsockKt.defaultOnNetworkBecameUnreachable(state);
                        TwilsockKt.defaultOnNonFatalError(state);
                        TwilsockKt.defaultOnFatalError(state);
                    }
                });
                final TwilsockImpl twilsockImpl3 = this.this$0;
                create.state(companion.any(Reflection.getOrCreateKotlinClass(TwilsockState.Initializing.class)), (Function1<? super StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S>, Unit>) new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Initializing>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Initializing> stateDefinitionBuilder) {
                        invoke2(stateDefinitionBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Initializing> state) {
                        Intrinsics.checkNotNullParameter(state, "$this$state");
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        final TwilsockImpl twilsockImpl4 = twilsockImpl3;
                        state.onEnter(new Function2<TwilsockState.Initializing, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Initializing initializing, TwilsockEvent twilsockEvent) {
                                invoke2(initializing, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Type inference failed for: r5v2, types: [T, com.twilio.twilsock.client.TwilsockRequest] */
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Initializing onEnter, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onEnter, "$this$onEnter");
                                Intrinsics.checkNotNullParameter(it, "it");
                                Ref.ObjectRef<TwilsockRequest> objectRef2 = objectRef;
                                TwilsockImpl twilsockImpl5 = twilsockImpl4;
                                Duration.Companion companion2 = Duration.INSTANCE;
                                ?? M27209createInitRequestLRDsOJo = twilsockImpl5.m27209createInitRequestLRDsOJo(Duration3.toDuration(2, DurationUnitJvm.SECONDS));
                                final TwilsockImpl twilsockImpl6 = twilsockImpl4;
                                twilsockImpl6.send(M27209createInitRequestLRDsOJo);
                                ((TwilsockRequest) M27209createInitRequestLRDsOJo).deferredResponse.invokeOnCompletion(new Function1<Throwable, Unit>(twilsockImpl6) { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1$3$1$invoke$lambda$2$$inlined$onReply$default$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th) {
                                        if (th != null) {
                                            if ((th instanceof TwilioException) && ((TwilioException) th).getErrorInfo().getReason() == TwilioException2.Timeout) {
                                                this.this$0.onTimeout();
                                                return;
                                            }
                                            return;
                                        }
                                        this.this$0.onInitMessageReceived();
                                    }
                                });
                                objectRef2.element = M27209createInitRequestLRDsOJo;
                            }
                        });
                        state.onExit(new Function2<TwilsockState.Initializing, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Initializing initializing, TwilsockEvent twilsockEvent) {
                                invoke2(initializing, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Initializing onExit, TwilsockEvent it) {
                                TwilsockRequest twilsockRequest;
                                Intrinsics.checkNotNullParameter(onExit, "$this$onExit");
                                Intrinsics.checkNotNullParameter(it, "it");
                                TwilsockRequest twilsockRequest2 = objectRef.element;
                                if (twilsockRequest2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("request");
                                    twilsockRequest = null;
                                } else {
                                    twilsockRequest = twilsockRequest2;
                                }
                                TwilsockRequest.cancel$default(twilsockRequest, null, 1, null);
                            }
                        });
                        Function2<TwilsockState.Initializing, TwilsockEvent.OnTimeout, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>> function2 = new Function2<TwilsockState.Initializing, TwilsockEvent.OnTimeout, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Initializing on, TwilsockEvent.OnTimeout it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, new TwilsockState.WaitAndReconnect(null, 1, null), new SideEffect.NotifyObservers(new Function1<TwilsockObserver, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.3.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TwilsockObserver twilsockObserver) {
                                        invoke2(twilsockObserver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TwilsockObserver $receiver) {
                                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                                        $receiver.getOnNonFatalError().invoke(new ErrorInfo(TwilioException2.Timeout, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null));
                                    }
                                }), false, 4, null);
                            }
                        };
                        StateMachine.Matcher.Companion companion2 = StateMachine.Matcher.INSTANCE;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnTimeout.class)), (Function2) function2);
                        TwilsockKt.defaultOnMessageReceived(state);
                        TwilsockKt.defaultOnDisconnect(state);
                        final TwilsockImpl twilsockImpl5 = twilsockImpl3;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnUpdateToken.class)), (Function2) new Function2<TwilsockState.Initializing, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Initializing on, TwilsockEvent.OnUpdateToken event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl5.setToken(event.getToken());
                                twilsockImpl5.addPendingRequest(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        final TwilsockImpl twilsockImpl6 = twilsockImpl3;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnSendRequest.class)), (Function2) new Function2<TwilsockState.Initializing, TwilsockEvent.OnSendRequest, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Initializing on, TwilsockEvent.OnSendRequest event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl6.addPendingRequest(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnInitMessageReceived.class)), (Function2) new Function2<TwilsockState.Initializing, TwilsockEvent.OnInitMessageReceived, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Initializing on, TwilsockEvent.OnInitMessageReceived it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connected.INSTANCE, null, false, 6, null);
                            }
                        });
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnTooManyRequests.class)), (Function2) new Function2<TwilsockState.Initializing, TwilsockEvent.OnTooManyRequests, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Initializing on, TwilsockEvent.OnTooManyRequests event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                final ErrorInfo errorInfo = new ErrorInfo(TwilioException2.TooManyRequests, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, new TwilsockState.WaitAndReconnect(Duration.m28726boximpl(event.m27204getWaitTimeUwyO8pc()), null), new SideEffect.NotifyObservers(new Function1<TwilsockObserver, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.3.7.1
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
                        TwilsockKt.defaultOnNetworkBecameUnreachable(state);
                        TwilsockKt.defaultOnNonFatalError(state);
                        TwilsockKt.defaultOnFatalError(state);
                    }
                });
                final TwilsockImpl twilsockImpl4 = this.this$0;
                create.state(companion.any(Reflection.getOrCreateKotlinClass(TwilsockState.Connected.class)), (Function1<? super StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S>, Unit>) new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Connected>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Connected> stateDefinitionBuilder) {
                        invoke2(stateDefinitionBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Connected> state) {
                        Intrinsics.checkNotNullParameter(state, "$this$state");
                        final TwilsockImpl twilsockImpl5 = twilsockImpl4;
                        state.onEnter(new Function2<TwilsockState.Connected, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.4.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Connected connected, TwilsockEvent twilsockEvent) {
                                invoke2(connected, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Connected onEnter, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onEnter, "$this$onEnter");
                                Intrinsics.checkNotNullParameter(it, "it");
                                twilsockImpl5.setFailedReconnectionAttempts(0);
                                twilsockImpl5.startWatchdogTimer();
                                twilsockImpl5.sendAllPendingRequests();
                                TwilsockImpl twilsockImpl6 = twilsockImpl5;
                                BuildersKt__Builders_commonKt.launch$default(twilsockImpl6.coroutineScope, null, null, new C43470x9e8f9c06(twilsockImpl6, null), 3, null);
                            }
                        });
                        final TwilsockImpl twilsockImpl6 = twilsockImpl4;
                        state.onExit(new Function2<TwilsockState.Connected, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.4.2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Connected connected, TwilsockEvent twilsockEvent) {
                                invoke2(connected, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Connected onExit, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onExit, "$this$onExit");
                                Intrinsics.checkNotNullParameter(it, "it");
                                twilsockImpl6.cancelWatchdogTimer();
                            }
                        });
                        TwilsockKt.defaultOnMessageReceived(state);
                        TwilsockKt.defaultOnDisconnect(state);
                        final TwilsockImpl twilsockImpl7 = twilsockImpl4;
                        Function2<TwilsockState.Connected, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>> function2 = new Function2<TwilsockState.Connected, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.4.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Connected on, TwilsockEvent.OnUpdateToken event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl7.setToken(event.getToken());
                                twilsockImpl7.send(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        };
                        StateMachine.Matcher.Companion companion2 = StateMachine.Matcher.INSTANCE;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnUpdateToken.class)), (Function2) function2);
                        final TwilsockImpl twilsockImpl8 = twilsockImpl4;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnSendRequest.class)), (Function2) new Function2<TwilsockState.Connected, TwilsockEvent.OnSendRequest, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.4.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Connected on, TwilsockEvent.OnSendRequest event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl8.send(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnTooManyRequests.class)), (Function2) new Function2<TwilsockState.Connected, TwilsockEvent.OnTooManyRequests, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.4.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Connected on, TwilsockEvent.OnTooManyRequests event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                final ErrorInfo errorInfo = new ErrorInfo(TwilioException2.TooManyRequests, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null);
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, new TwilsockState.Throttling(event.m27204getWaitTimeUwyO8pc(), null), new SideEffect.NotifyObservers(new Function1<TwilsockObserver, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.4.5.1
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
                        TwilsockKt.defaultOnNetworkBecameUnreachable(state);
                        TwilsockKt.defaultOnNonFatalError(state);
                        TwilsockKt.defaultOnFatalError(state);
                    }
                });
                final TwilsockImpl twilsockImpl5 = this.this$0;
                create.state(companion.any(Reflection.getOrCreateKotlinClass(TwilsockState.WaitAndReconnect.class)), (Function1<? super StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S>, Unit>) new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.WaitAndReconnect>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.5
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.WaitAndReconnect> stateDefinitionBuilder) {
                        invoke2(stateDefinitionBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.WaitAndReconnect> state) {
                        Intrinsics.checkNotNullParameter(state, "$this$state");
                        final Timer timer = new Timer(twilsockImpl5.coroutineScope);
                        final TwilsockImpl twilsockImpl6 = twilsockImpl5;
                        state.onEnter(new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.WaitAndReconnect waitAndReconnect, TwilsockEvent twilsockEvent) {
                                invoke2(waitAndReconnect, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.WaitAndReconnect onEnter, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onEnter, "$this$onEnter");
                                Intrinsics.checkNotNullParameter(it, "it");
                                Duration durationM27220getWaitTimeFghU774 = onEnter.m27220getWaitTimeFghU774();
                                long rawValue = durationM27220getWaitTimeFghU774 != null ? durationM27220getWaitTimeFghU774.getRawValue() : twilsockImpl6.m27208calcDefaultWaitTimeUwyO8pc();
                                TwilioLogger logger = TwilioLogger3.getLogger(onEnter);
                                TwilsockImpl twilsockImpl7 = twilsockImpl6;
                                if (logger.isDebugEnabled()) {
                                    logger.m3189d("failedReconnectionAttempts: " + twilsockImpl7.getFailedReconnectionAttempts() + "; finalWaitTime: " + ((Object) Duration.m28761toStringimpl(rawValue)), (Throwable) null);
                                }
                                twilsockImpl6.failAllSentRequests(new ErrorInfo(TwilioException2.TransportDisconnected, 0, 0, "Transport disconnected, will try to reconnect after " + ((Object) Duration.m28761toStringimpl(rawValue)), (String) null, 22, (DefaultConstructorMarker) null));
                                twilsockImpl6.shutdownWebSocket();
                                if (twilsockImpl6.isNetworkAvailable()) {
                                    Timer timer2 = timer;
                                    TwilsockImpl twilsockImpl8 = twilsockImpl6;
                                    timer2.cancel();
                                    timer2.setJob(BuildersKt__Builders_commonKt.launch$default(timer2.getScope(), null, null, new C43472x7c8620dd(rawValue, timer2, null, twilsockImpl8), 3, null));
                                }
                                TwilsockImpl twilsockImpl9 = twilsockImpl6;
                                twilsockImpl9.setFailedReconnectionAttempts(twilsockImpl9.getFailedReconnectionAttempts() + 1);
                                TwilsockImpl twilsockImpl10 = twilsockImpl6;
                                BuildersKt__Builders_commonKt.launch$default(twilsockImpl10.coroutineScope, null, null, new C43471xb2376f87(twilsockImpl10, null), 3, null);
                            }
                        });
                        state.onExit(new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.WaitAndReconnect waitAndReconnect, TwilsockEvent twilsockEvent) {
                                invoke2(waitAndReconnect, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.WaitAndReconnect onExit, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onExit, "$this$onExit");
                                Intrinsics.checkNotNullParameter(it, "it");
                                timer.cancel();
                            }
                        });
                        Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnTimeout, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>> function2 = new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnTimeout, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.WaitAndReconnect on, TwilsockEvent.OnTimeout it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connecting.INSTANCE, null, false, 6, null);
                            }
                        };
                        StateMachine.Matcher.Companion companion2 = StateMachine.Matcher.INSTANCE;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnTimeout.class)), (Function2) function2);
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnConnect.class)), (Function2) new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnConnect, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.WaitAndReconnect on, TwilsockEvent.OnConnect it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connecting.INSTANCE, null, false, 6, null);
                            }
                        });
                        TwilsockKt.defaultOnDisconnect(state);
                        final TwilsockImpl twilsockImpl7 = twilsockImpl5;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnUpdateToken.class)), (Function2) new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.WaitAndReconnect on, TwilsockEvent.OnUpdateToken event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl7.setToken(event.getToken());
                                event.getRequest().cancel(new ErrorInfo(TwilioException2.TokenUpdatedLocally, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null));
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        final TwilsockImpl twilsockImpl8 = twilsockImpl5;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnSendRequest.class)), (Function2) new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnSendRequest, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.WaitAndReconnect on, TwilsockEvent.OnSendRequest event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl8.addPendingRequest(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        final TwilsockImpl twilsockImpl9 = twilsockImpl5;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnNetworkBecameReachable.class)), (Function2) new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnNetworkBecameReachable, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.WaitAndReconnect on, TwilsockEvent.OnNetworkBecameReachable it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                twilsockImpl9.setFailedReconnectionAttempts(0);
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connecting.INSTANCE, null, false, 6, null);
                            }
                        });
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnNetworkBecameUnreachable.class)), (Function2) new Function2<TwilsockState.WaitAndReconnect, TwilsockEvent.OnNetworkBecameUnreachable, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.5.8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.WaitAndReconnect on, TwilsockEvent.OnNetworkBecameUnreachable it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                timer.cancel();
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                    }
                });
                final TwilsockImpl twilsockImpl6 = this.this$0;
                create.state(companion.any(Reflection.getOrCreateKotlinClass(TwilsockState.Throttling.class)), (Function1<? super StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<S>, Unit>) new Function1<StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Throttling>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.6
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Throttling> stateDefinitionBuilder) {
                        invoke2(stateDefinitionBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final StateMachine.GraphBuilder<TwilsockState, TwilsockEvent, SideEffect>.StateDefinitionBuilder<TwilsockState.Throttling> state) {
                        Intrinsics.checkNotNullParameter(state, "$this$state");
                        final Timer timer = new Timer(twilsockImpl6.coroutineScope);
                        final TwilsockImpl twilsockImpl7 = twilsockImpl6;
                        state.onEnter(new Function2<TwilsockState.Throttling, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.6.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Throttling throttling, TwilsockEvent twilsockEvent) {
                                invoke2(throttling, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Throttling onEnter, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onEnter, "$this$onEnter");
                                Intrinsics.checkNotNullParameter(it, "it");
                                Timer timer2 = timer;
                                long jM27216getWaitTimeUwyO8pc = onEnter.m27216getWaitTimeUwyO8pc();
                                TwilsockImpl twilsockImpl8 = twilsockImpl7;
                                timer2.cancel();
                                timer2.setJob(BuildersKt__Builders_commonKt.launch$default(timer2.getScope(), null, null, new C43473xddd8bd7c(jM27216getWaitTimeUwyO8pc, timer2, null, twilsockImpl8), 3, null));
                            }
                        });
                        state.onExit(new Function2<TwilsockState.Throttling, TwilsockEvent, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.6.2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(TwilsockState.Throttling throttling, TwilsockEvent twilsockEvent) {
                                invoke2(throttling, twilsockEvent);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(TwilsockState.Throttling onExit, TwilsockEvent it) {
                                Intrinsics.checkNotNullParameter(onExit, "$this$onExit");
                                Intrinsics.checkNotNullParameter(it, "it");
                                timer.cancel();
                            }
                        });
                        Function2<TwilsockState.Throttling, TwilsockEvent.OnTimeout, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>> function2 = new Function2<TwilsockState.Throttling, TwilsockEvent.OnTimeout, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.6.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Throttling on, TwilsockEvent.OnTimeout it) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(it, "it");
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.transitionTo$default(state, on, TwilsockState.Connected.INSTANCE, null, false, 6, null);
                            }
                        };
                        StateMachine.Matcher.Companion companion2 = StateMachine.Matcher.INSTANCE;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnTimeout.class)), (Function2) function2);
                        TwilsockKt.defaultOnMessageReceived(state);
                        TwilsockKt.defaultOnDisconnect(state);
                        final TwilsockImpl twilsockImpl8 = twilsockImpl6;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnUpdateToken.class)), (Function2) new Function2<TwilsockState.Throttling, TwilsockEvent.OnUpdateToken, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.6.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Throttling on, TwilsockEvent.OnUpdateToken event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl8.setToken(event.getToken());
                                twilsockImpl8.addPendingRequest(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        final TwilsockImpl twilsockImpl9 = twilsockImpl6;
                        state.m3184on((StateMachine.Matcher) companion2.any(Reflection.getOrCreateKotlinClass(TwilsockEvent.OnSendRequest.class)), (Function2) new Function2<TwilsockState.Throttling, TwilsockEvent.OnSendRequest, StateMachine.Graph.State.TransitionTo<? extends TwilsockState, ? extends SideEffect>>() { // from class: com.twilio.twilsock.client.TwilsockImpl.stateMachine.1.6.5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final StateMachine.Graph.State.TransitionTo<TwilsockState, SideEffect> invoke(TwilsockState.Throttling on, TwilsockEvent.OnSendRequest event) {
                                Intrinsics.checkNotNullParameter(on, "$this$on");
                                Intrinsics.checkNotNullParameter(event, "event");
                                twilsockImpl9.addPendingRequest(event.getRequest());
                                return StateMachine.GraphBuilder.StateDefinitionBuilder.dontTransition$default(state, on, null, 1, null);
                            }
                        });
                        TwilsockKt.defaultOnNetworkBecameUnreachable(state);
                        TwilsockKt.defaultOnNonFatalError(state);
                        TwilsockKt.defaultOnFatalError(state);
                    }
                });
                final TwilsockImpl twilsockImpl7 = this.this$0;
                create.onTransition(new Function1<StateMachine.Transition<? extends TwilsockState, ? extends TwilsockEvent, ? extends SideEffect>, Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl$stateMachine$1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StateMachine.Transition<? extends TwilsockState, ? extends TwilsockEvent, ? extends SideEffect> transition) {
                        invoke2(transition);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(StateMachine.Transition<? extends TwilsockState, ? extends TwilsockEvent, ? extends SideEffect> transition) {
                        SideEffect sideEffect;
                        Intrinsics.checkNotNullParameter(transition, "transition");
                        if (transition instanceof StateMachine.Transition.Valid) {
                            TwilioLogger logger = TwilioLogger3.getLogger(create);
                            if (logger.isDebugEnabled()) {
                                logger.m3189d("onTransition: " + Reflection.getOrCreateKotlinClass(transition.getFromState().getClass()).getSimpleName() + " -> " + Reflection.getOrCreateKotlinClass(((StateMachine.Transition.Valid) transition).getToState().getClass()).getSimpleName() + " [" + transition.getEvent() + ']', (Throwable) null);
                            }
                            sideEffect = (SideEffect) ((StateMachine.Transition.Valid) transition).getSideEffect();
                        } else {
                            if (!(transition instanceof StateMachine.Transition.DontTransition)) {
                                return;
                            }
                            TwilioLogger logger2 = TwilioLogger3.getLogger(create);
                            if (logger2.isDebugEnabled()) {
                                logger2.m3189d("dontTransition: " + Reflection.getOrCreateKotlinClass(transition.getFromState().getClass()).getSimpleName() + " [" + transition.getEvent() + ']', (Throwable) null);
                            }
                            sideEffect = (SideEffect) ((StateMachine.Transition.DontTransition) transition).getSideEffect();
                        }
                        if (sideEffect instanceof SideEffect.NotifyObservers) {
                            TwilsockImpl twilsockImpl8 = twilsockImpl7;
                            BuildersKt__Builders_commonKt.launch$default(twilsockImpl8.coroutineScope, null, null, twilsockImpl8.new C434801(((SideEffect.NotifyObservers) sideEffect).getBlock(), null), 3, null);
                        } else if (sideEffect instanceof SideEffect.HandleMessageReceived) {
                            twilsockImpl7.handleMessageReceived(((SideEffect.HandleMessageReceived) sideEffect).getMessage());
                        }
                    }
                });
            }
        });
        connectivityMonitor.setOnChanged(new C434752(this));
    }

    public /* synthetic */ TwilsockImpl(CoroutineScope coroutineScope, String str, boolean z, AuthData authData, ClientMetadata clientMetadata, ContinuationTokenStorage continuationTokenStorage, ConnectivityMonitor connectivityMonitor, Function4 function4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, z, authData, clientMetadata, (i & 32) != 0 ? new ContinuationTokenStorage2() : continuationTokenStorage, (i & 64) != 0 ? new ConnectivityMonitorAndroid(coroutineScope) : connectivityMonitor, (i & 128) != 0 ? C434741.INSTANCE : function4);
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$1 */
    /* synthetic */ class C434741 extends FunctionReferenceImpl implements Function4<CoroutineScope, Duration, List<? extends String>, TwilsockTransport7, TwilsockTransport> {
        public static final C434741 INSTANCE = new C434741();

        C434741() {
            super(4, TwilsockTransport6.class, "TwilsockTransportFactory", "TwilsockTransportFactory-dWUq8MI(Lkotlinx/coroutines/CoroutineScope;JLjava/util/List;Lcom/twilio/twilsock/client/TwilsockTransportListener;)Lcom/twilio/twilsock/client/TwilsockTransport;", 1);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ TwilsockTransport invoke(CoroutineScope coroutineScope, Duration duration, List<? extends String> list, TwilsockTransport7 twilsockTransport7) {
            return m27211invokedWUq8MI(coroutineScope, duration.getRawValue(), list, twilsockTransport7);
        }

        /* renamed from: invoke-dWUq8MI, reason: not valid java name */
        public final TwilsockTransport m27211invokedWUq8MI(CoroutineScope p0, long j, List<String> p2, TwilsockTransport7 p3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p2, "p2");
            Intrinsics.checkNotNullParameter(p3, "p3");
            return TwilsockTransport6.m27221TwilsockTransportFactorydWUq8MI(p0, j, p2, p3);
        }
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public boolean isConnected() {
        return getState() instanceof TwilsockState.Connected;
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public AccountDescriptor getAccountDescriptor() {
        return this.accountDescriptor;
    }

    public void setAccountDescriptor(AccountDescriptor accountDescriptor) {
        this.accountDescriptor = accountDescriptor;
    }

    public final TwilsockState getState() {
        return this.stateMachine.getState();
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final Set<String> getInitRegistrations() {
        return this.initRegistrations;
    }

    public final Map<String, TwilsockRequest> getPendingRequests() {
        return this.pendingRequests;
    }

    public final Map<String, TwilsockRequest> getSentRequests() {
        return this.sentRequests;
    }

    public final int getFailedReconnectionAttempts() {
        return this.failedReconnectionAttempts;
    }

    public final void setFailedReconnectionAttempts(int i) {
        this.failedReconnectionAttempts = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNetworkAvailable() {
        return this.connectivityMonitor.isNetworkAvailable();
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$2 */
    /* synthetic */ class C434752 extends FunctionReferenceImpl implements Function0<Unit> {
        C434752(Object obj) {
            super(0, obj, TwilsockImpl.class, "onConnectivityChanged", "onConnectivityChanged()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((TwilsockImpl) this.receiver).onConnectivityChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failAllPendingRequests(ErrorInfo errorInfo) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(this.pendingRequests.values());
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        this.pendingRequests.clear();
        Iterator it = listBuild.iterator();
        while (it.hasNext()) {
            ((TwilsockRequest) it.next()).cancel(errorInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failAllSentRequests(ErrorInfo errorInfo) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(this.sentRequests.values());
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        this.sentRequests.clear();
        Iterator it = listBuild.iterator();
        while (it.hasNext()) {
            ((TwilsockRequest) it.next()).cancel(errorInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAllPendingRequests() {
        Iterator<T> it = this.pendingRequests.values().iterator();
        while (it.hasNext()) {
            send((TwilsockRequest) it.next());
        }
        this.pendingRequests.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TwilsockRequest addPendingRequest(TwilsockRequest request) {
        return this.pendingRequests.put(request.getMessage().getRequestId(), request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calcDefaultWaitTime-UwyO8pc, reason: not valid java name */
    public final long m27208calcDefaultWaitTimeUwyO8pc() {
        double dMin = Math.min(Fibonacci2.fibonacci(this.failedReconnectionAttempts), 45.0d);
        double dNextDouble = 0.2d * dMin * Random.INSTANCE.nextDouble(0.0d, 1.0d);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration3.toDuration(dMin + dNextDouble, DurationUnitJvm.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startWatchdogTimer() {
        Timer timer = this.watchdogTimer;
        Duration.Companion companion = Duration.INSTANCE;
        long duration = Duration3.toDuration(45, DurationUnitJvm.SECONDS);
        timer.cancel();
        timer.setJob(BuildersKt__Builders_commonKt.launch$default(timer.getScope(), null, null, new TwilsockImpl$startWatchdogTimer$$inlined$scheduleVtjQ1oo$1(duration, timer, null, this), 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelWatchdogTimer() {
        this.watchdogTimer.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartWatchdogTimer() {
        if (this.watchdogTimer.isScheduled()) {
            cancelWatchdogTimer();
            startWatchdogTimer();
        }
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public void connect() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "connect", (Throwable) null, 2, (Object) null);
        this.stateMachine.transition(TwilsockEvent.OnConnect.INSTANCE);
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public void disconnect() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "disconnect", (Throwable) null, 2, (Object) null);
        this.stateMachine.transition(TwilsockEvent.OnDisconnect.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.twilio.twilsock.client.Twilsock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendRequest(HttpRequest httpRequest, Continuation<? super HttpResponse> continuation) {
        C434831 c434831;
        TwilsockRequest twilsockRequestCreateUpstreamRequest;
        Throwable th;
        TwilsockImpl twilsockImpl;
        Object objM28550constructorimpl;
        if (continuation instanceof C434831) {
            c434831 = (C434831) continuation;
            int i = c434831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434831.label = i - Integer.MIN_VALUE;
            } else {
                c434831 = new C434831(continuation);
            }
        }
        Object objAwaitResponse = c434831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434831.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitResponse);
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "sendRequest", (Throwable) null, 2, (Object) null);
            twilsockRequestCreateUpstreamRequest = createUpstreamRequest(httpRequest);
            this.stateMachine.transition(new TwilsockEvent.OnSendRequest(twilsockRequestCreateUpstreamRequest));
            try {
                Result.Companion companion = Result.INSTANCE;
                c434831.L$0 = this;
                c434831.L$1 = twilsockRequestCreateUpstreamRequest;
                c434831.label = 1;
                objAwaitResponse = twilsockRequestCreateUpstreamRequest.awaitResponse(c434831);
                if (objAwaitResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                twilsockImpl = this;
            } catch (Throwable th2) {
                th = th2;
                twilsockImpl = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) instanceof CancellationException) {
                }
                ResultKt.throwOnFailure(objM28550constructorimpl);
                TwilsockMessage8 twilsockMessage8 = (TwilsockMessage8) objM28550constructorimpl;
                return new HttpResponse(twilsockMessage8.getReplyHeaders().getHttpStatus().getCode(), twilsockMessage8.getReplyHeaders().getHttpStatus().getStatus(), twilsockMessage8.getRawHeaders(), MultiMap2.toMultiMap(twilsockMessage8.getReplyHeaders().getHttpHeaders()), twilsockMessage8.getPayload());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            twilsockRequestCreateUpstreamRequest = (TwilsockRequest) c434831.L$1;
            twilsockImpl = (TwilsockImpl) c434831.L$0;
            try {
                ResultKt.throwOnFailure(objAwaitResponse);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) instanceof CancellationException) {
                }
                ResultKt.throwOnFailure(objM28550constructorimpl);
                TwilsockMessage8 twilsockMessage82 = (TwilsockMessage8) objM28550constructorimpl;
                return new HttpResponse(twilsockMessage82.getReplyHeaders().getHttpStatus().getCode(), twilsockMessage82.getReplyHeaders().getHttpStatus().getStatus(), twilsockMessage82.getRawHeaders(), MultiMap2.toMultiMap(twilsockMessage82.getReplyHeaders().getHttpHeaders()), twilsockMessage82.getPayload());
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((TwilsockMessage8) objAwaitResponse);
        if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) instanceof CancellationException) {
            TwilioLogger.d$default(TwilioLogger3.getLogger(twilsockImpl), "the request " + twilsockRequestCreateUpstreamRequest.getMessage().getRequestId() + " has been cancelled by the user", (Throwable) null, 2, (Object) null);
            TwilsockRequest.cancel$default(twilsockRequestCreateUpstreamRequest, null, 1, null);
        }
        ResultKt.throwOnFailure(objM28550constructorimpl);
        TwilsockMessage8 twilsockMessage822 = (TwilsockMessage8) objM28550constructorimpl;
        return new HttpResponse(twilsockMessage822.getReplyHeaders().getHttpStatus().getCode(), twilsockMessage822.getReplyHeaders().getHttpStatus().getStatus(), twilsockMessage822.getRawHeaders(), MultiMap2.toMultiMap(twilsockMessage822.getReplyHeaders().getHttpHeaders()), twilsockMessage822.getPayload());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.twilio.twilsock.client.Twilsock
    /* renamed from: sendRequest-dWUq8MI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27200sendRequestdWUq8MI(String str, long j, byte[] bArr, Continuation<? super HttpResponse> continuation) {
        C434842 c434842;
        TwilsockImpl twilsockImpl;
        TwilsockRequest twilsockRequest;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C434842) {
            c434842 = (C434842) continuation;
            int i = c434842.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434842.label = i - Integer.MIN_VALUE;
            } else {
                c434842 = new C434842(continuation);
            }
        }
        Object objAwaitResponse = c434842.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434842.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitResponse);
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "sendRequest(raw)", (Throwable) null, 2, (Object) null);
            TwilsockRequest twilsockRequestM27210createUpstreamRequest8Mi8wO0 = m27210createUpstreamRequest8Mi8wO0(str, j, bArr);
            if (this.stateMachine.getState() == TwilsockState.Connected.INSTANCE) {
                send(twilsockRequestM27210createUpstreamRequest8Mi8wO0);
            } else {
                this.stateMachine.transition(new TwilsockEvent.OnSendRequest(twilsockRequestM27210createUpstreamRequest8Mi8wO0));
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                c434842.L$0 = this;
                c434842.L$1 = twilsockRequestM27210createUpstreamRequest8Mi8wO0;
                c434842.label = 1;
                objAwaitResponse = twilsockRequestM27210createUpstreamRequest8Mi8wO0.awaitResponse(c434842);
                if (objAwaitResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                twilsockImpl = this;
                twilsockRequest = twilsockRequestM27210createUpstreamRequest8Mi8wO0;
            } catch (Throwable th) {
                th = th;
                twilsockImpl = this;
                twilsockRequest = twilsockRequestM27210createUpstreamRequest8Mi8wO0;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl instanceof HandledInCppException) {
                }
                ResultKt.throwOnFailure(objM28550constructorimpl);
                TwilsockMessage8 twilsockMessage8 = (TwilsockMessage8) objM28550constructorimpl;
                return new HttpResponse(twilsockMessage8.getReplyHeaders().getHttpStatus().getCode(), twilsockMessage8.getReplyHeaders().getHttpStatus().getStatus(), twilsockMessage8.getRawHeaders(), MultiMap2.toMultiMap(twilsockMessage8.getReplyHeaders().getHttpHeaders()), twilsockMessage8.getPayload());
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            twilsockRequest = (TwilsockRequest) c434842.L$1;
            twilsockImpl = (TwilsockImpl) c434842.L$0;
            try {
                ResultKt.throwOnFailure(objAwaitResponse);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl instanceof HandledInCppException) {
                }
                ResultKt.throwOnFailure(objM28550constructorimpl);
                TwilsockMessage8 twilsockMessage82 = (TwilsockMessage8) objM28550constructorimpl;
                return new HttpResponse(twilsockMessage82.getReplyHeaders().getHttpStatus().getCode(), twilsockMessage82.getReplyHeaders().getHttpStatus().getStatus(), twilsockMessage82.getRawHeaders(), MultiMap2.toMultiMap(twilsockMessage82.getReplyHeaders().getHttpHeaders()), twilsockMessage82.getPayload());
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((TwilsockMessage8) objAwaitResponse);
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl instanceof HandledInCppException) {
            twilsockRequest.cancel(new ErrorInfo((TwilioException2) null, 0, 0, "Reply has been handled on CPP level", (String) null, 23, (DefaultConstructorMarker) null));
        } else if (thM28553exceptionOrNullimpl instanceof CancellationException) {
            TwilioLogger.d$default(TwilioLogger3.getLogger(twilsockImpl), "the request " + twilsockRequest.getMessage().getRequestId() + " has been cancelled by the user", (Throwable) null, 2, (Object) null);
            TwilsockRequest.cancel$default(twilsockRequest, null, 1, null);
        }
        ResultKt.throwOnFailure(objM28550constructorimpl);
        TwilsockMessage8 twilsockMessage822 = (TwilsockMessage8) objM28550constructorimpl;
        return new HttpResponse(twilsockMessage822.getReplyHeaders().getHttpStatus().getCode(), twilsockMessage822.getReplyHeaders().getHttpStatus().getStatus(), twilsockMessage822.getRawHeaders(), MultiMap2.toMultiMap(twilsockMessage822.getReplyHeaders().getHttpHeaders()), twilsockMessage822.getPayload());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.twilio.twilsock.client.Twilsock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateToken(String str, Continuation<? super Unit> continuation) {
        C434921 c434921;
        Throwable th;
        TwilsockRequest twilsockRequest;
        TwilsockImpl twilsockImpl;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        if (continuation instanceof C434921) {
            c434921 = (C434921) continuation;
            int i = c434921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434921.label = i - Integer.MIN_VALUE;
            } else {
                c434921 = new C434921(continuation);
            }
        }
        Object obj = c434921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            TwilioLogger.d$default(TwilioLogger3.getLogger(this), "updateToken", (Throwable) null, 2, (Object) null);
            if (Intrinsics.areEqual(str, this.token)) {
                TwilioLogger logger = TwilioLogger3.getLogger(this);
                if (logger.isInfoEnabled()) {
                    logger.m3196i("token is the same, skipping update", (Throwable) null);
                }
                return Unit.INSTANCE;
            }
            TwilsockRequest twilsockRequestCreateUpdateTokenRequest = createUpdateTokenRequest(str);
            this.stateMachine.transition(new TwilsockEvent.OnUpdateToken(str, twilsockRequestCreateUpdateTokenRequest));
            try {
                Result.Companion companion = Result.INSTANCE;
                c434921.L$0 = this;
                c434921.L$1 = twilsockRequestCreateUpdateTokenRequest;
                c434921.label = 1;
                Object objAwaitResponse = twilsockRequestCreateUpdateTokenRequest.awaitResponse(c434921);
                if (objAwaitResponse == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objAwaitResponse;
                twilsockRequest = twilsockRequestCreateUpdateTokenRequest;
                twilsockImpl = this;
            } catch (Throwable th2) {
                th = th2;
                twilsockRequest = twilsockRequestCreateUpdateTokenRequest;
                twilsockImpl = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl instanceof TwilioException) {
                }
                ResultKt.throwOnFailure(objM28550constructorimpl);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            twilsockRequest = (TwilsockRequest) c434921.L$1;
            twilsockImpl = (TwilsockImpl) c434921.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl instanceof TwilioException) {
                }
                ResultKt.throwOnFailure(objM28550constructorimpl);
                return Unit.INSTANCE;
            }
        }
        objM28550constructorimpl = Result.m28550constructorimpl((TwilsockMessage) obj);
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl instanceof TwilioException) {
            if (((TwilioException) thM28553exceptionOrNullimpl).getErrorInfo().getReason() == TwilioException2.TokenUpdatedLocally) {
                TwilioLogger.d$default(TwilioLogger3.getLogger(twilsockImpl), "token updated locally", (Throwable) null, 2, (Object) null);
                return Unit.INSTANCE;
            }
        } else if (thM28553exceptionOrNullimpl instanceof CancellationException) {
            TwilioLogger3.getLogger(twilsockImpl).m3202w("updateToken cancelled", thM28553exceptionOrNullimpl);
            TwilsockRequest.cancel$default(twilsockRequest, null, 1, null);
        } else if (thM28553exceptionOrNullimpl == null) {
            TwilioLogger.i$default(TwilioLogger3.getLogger(twilsockImpl), "token updated remotely", (Throwable) null, 2, (Object) null);
        }
        ResultKt.throwOnFailure(objM28550constructorimpl);
        return Unit.INSTANCE;
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public void populateInitRegistrations(Set<String> messageTypes) {
        Intrinsics.checkNotNullParameter(messageTypes, "messageTypes");
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "populateInitRegistrations: " + messageTypes, (Throwable) null, 2, (Object) null);
        this.initRegistrations.addAll(messageTypes);
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public Unsubscriber addObserver(Function1<? super TwilsockObserver, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        TwilsockObserver twilsockObserver = new TwilsockObserver(null, null, null, null, null, null, null, null, null, 511, null);
        block.invoke(twilsockObserver);
        return addObserver(twilsockObserver);
    }

    public final Unsubscriber addObserver(final TwilsockObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
        return new Unsubscriber(new Function0<Unit>() { // from class: com.twilio.twilsock.client.TwilsockImpl.addObserver.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TwilsockImpl.this.observers.remove(observer);
            }
        });
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl$notifyObservers$1", m3645f = "Twilsock.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$notifyObservers$1 */
    public static final class C434801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<TwilsockObserver, Unit> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C434801(Function1<? super TwilsockObserver, Unit> function1, Continuation<? super C434801> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockImpl.this.new C434801(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Set set = TwilsockImpl.this.observers;
                Function1<TwilsockObserver, Unit> function1 = this.$block;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    function1.invoke((TwilsockObserver) it.next());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            Set set = TwilsockImpl.this.observers;
            Function1<TwilsockObserver, Unit> function1 = this.$block;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                function1.invoke((TwilsockObserver) it.next());
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    private final Job notifyObservers(Function1<? super TwilsockObserver, Unit> block) {
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434801(block, null), 3, null);
    }

    private final void notifyObserversSync(Function1<? super TwilsockObserver, Unit> block) {
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            block.invoke((TwilsockObserver) it.next());
        }
    }

    @Override // com.twilio.twilsock.client.TwilsockTransport7
    public void onMessageReceived(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator<T> it = this.observers.iterator();
        boolean zBooleanValue = false;
        while (it.hasNext()) {
            zBooleanValue |= ((TwilsockObserver) it.next()).getOnRawDataReceived().invoke(data).booleanValue();
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434812(null), 3, null);
        if (zBooleanValue) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434823(data, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void connectWebSocket() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "connectWebSocket", (Throwable) null, 2, (Object) null);
        if (this.websocket != null) {
            throw new IllegalStateException("Check failed.");
        }
        Duration.Companion companion = Duration.INSTANCE;
        TwilsockTransport twilsockTransportInvoke = this.twilsockTransportFactory.invoke(this.coroutineScope, Duration.m28726boximpl(Duration3.toDuration(60, DurationUnitJvm.SECONDS)), this.authData.getCertificates(), this);
        twilsockTransportInvoke.connect(this.url, this.useProxy);
        this.websocket = twilsockTransportInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shutdownWebSocket() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "shutdownWebSocket", (Throwable) null, 2, (Object) null);
        TwilsockTransport twilsockTransport = this.websocket;
        if (twilsockTransport != null) {
            twilsockTransport.disconnect("shutdownWebSocket");
        }
        this.websocket = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createInitRequest-LRDsOJo, reason: not valid java name */
    public final TwilsockRequest m27209createInitRequestLRDsOJo(long timeout) {
        InitRegistration initRegistration = new InitRegistration(this.authData.getNotificationProductId(), (String) null, 0, this.initRegistrations, 6, (DefaultConstructorMarker) null);
        JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
        JsonElementBuilders.put(jsonElementBuilders2, "tweak_key", "TweakKey-2019");
        JsonElement6 jsonElement6Build = jsonElementBuilders2.build();
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"client_update", "account_descriptor"});
        String str = this.token;
        String continuationToken = this.continuationTokenStorage.getContinuationToken();
        if (continuationToken.length() <= 0) {
            continuationToken = null;
        }
        InitMessageHeaders initMessageHeaders = new InitMessageHeaders(listListOf, str, continuationToken, !initRegistration.getMessageTypes().isEmpty() ? CollectionsKt.listOf(initRegistration) : null, !this.authData.getTweaks().isEmpty() ? new JsonElement6(MapsKt.plus(jsonElement6Build, this.authData.getTweaks())) : null, this.clientMetadata);
        TwilsockMessage.Method method = TwilsockMessage.Method.INIT;
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        return new TwilsockRequest(this.coroutineScope, new TwilsockMessage(null, method, null, JsonElement3.getJsonObject(json.encodeToJsonElement(InitMessageHeaders.INSTANCE.serializer(), initMessageHeaders)), null, null, null, 117, null), timeout, new TwilsockImpl$createInitRequest$1(this), null);
    }

    private final TwilsockRequest createUpdateTokenRequest(String newToken) {
        TwilsockMessage.Method method = TwilsockMessage.Method.UPDATE;
        JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
        JsonElementBuilders.put(jsonElementBuilders2, "token", newToken);
        Unit unit = Unit.INSTANCE;
        TwilsockMessage twilsockMessage = new TwilsockMessage(null, method, null, jsonElementBuilders2.build(), null, null, null, 117, null);
        CoroutineScope coroutineScope = this.coroutineScope;
        Duration.Companion companion = Duration.INSTANCE;
        return new TwilsockRequest(coroutineScope, twilsockMessage, Duration3.toDuration(60, DurationUnitJvm.SECONDS), new C434771(this), null);
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$createUpdateTokenRequest$1 */
    /* synthetic */ class C434771 extends FunctionReferenceImpl implements Function1<TwilsockRequest, Unit> {
        C434771(Object obj) {
            super(1, obj, TwilsockImpl.class, "onRequestFinished", "onRequestFinished(Lcom/twilio/twilsock/client/TwilsockRequest;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TwilsockRequest twilsockRequest) {
            invoke2(twilsockRequest);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TwilsockRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TwilsockImpl) this.receiver).onRequestFinished(p0);
        }
    }

    private final TwilsockRequest createUpstreamRequest(HttpRequest httpRequest) {
        String str;
        UpstreamRequestMessageHeaders upstreamRequestMessageHeaders = new UpstreamRequestMessageHeaders(this.authData.getActiveGrant(), httpRequest);
        TwilsockMessage.Method method = TwilsockMessage.Method.UPSTREAM_REQUEST;
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        JsonElement6 jsonObject = JsonElement3.getJsonObject(json.encodeToJsonElement(UpstreamRequestMessageHeaders.INSTANCE.serializer(), upstreamRequestMessageHeaders));
        Set<String> set = httpRequest.getHeaders().get("Content-Type");
        if (set == null || (str = (String) CollectionsKt.first(set)) == null) {
            str = "application/json";
        }
        return new TwilsockRequest(this.coroutineScope, new TwilsockMessage(null, method, null, jsonObject, str, httpRequest.getPayload(), null, 69, null), httpRequest.m27236getTimeoutUwyO8pc(), new C434781(this), null);
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$createUpstreamRequest$1 */
    /* synthetic */ class C434781 extends FunctionReferenceImpl implements Function1<TwilsockRequest, Unit> {
        C434781(Object obj) {
            super(1, obj, TwilsockImpl.class, "onRequestFinished", "onRequestFinished(Lcom/twilio/twilsock/client/TwilsockRequest;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TwilsockRequest twilsockRequest) {
            invoke2(twilsockRequest);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TwilsockRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TwilsockImpl) this.receiver).onRequestFinished(p0);
        }
    }

    /* renamed from: createUpstreamRequest-8Mi8wO0, reason: not valid java name */
    private final TwilsockRequest m27210createUpstreamRequest8Mi8wO0(String requestId, long timeout, byte[] request) {
        return new TwilsockRequest(this.coroutineScope, new TwilsockMessage(requestId, TwilsockMessage.Method.UPSTREAM_REQUEST, null, null, null, null, request, 60, null), timeout, new C434792(this), null);
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$createUpstreamRequest$2 */
    /* synthetic */ class C434792 extends FunctionReferenceImpl implements Function1<TwilsockRequest, Unit> {
        C434792(Object obj) {
            super(1, obj, TwilsockImpl.class, "onRequestFinished", "onRequestFinished(Lcom/twilio/twilsock/client/TwilsockRequest;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TwilsockRequest twilsockRequest) {
            invoke2(twilsockRequest);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TwilsockRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TwilsockImpl) this.receiver).onRequestFinished(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequestFinished(TwilsockRequest request) {
        this.pendingRequests.remove(request.getMessage().getRequestId());
        this.sentRequests.remove(request.getMessage().getRequestId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeout() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "onTimeout", (Throwable) null, 2, (Object) null);
        this.stateMachine.transition(TwilsockEvent.OnTimeout.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitMessageReceived() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "onInitMessageReceived", (Throwable) null, 2, (Object) null);
        this.stateMachine.transition(TwilsockEvent.OnInitMessageReceived.INSTANCE);
    }

    @Override // com.twilio.twilsock.client.TwilsockTransport7
    public void onTransportConnected() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "onTransportConnected", (Throwable) null, 2, (Object) null);
        this.stateMachine.transition(TwilsockEvent.OnTransportConnected.INSTANCE);
    }

    @Override // com.twilio.twilsock.client.TwilsockTransport7
    public void onTransportDisconnected(ErrorInfo errorInfo) {
        Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "onTransportDisconnected: " + errorInfo, (Throwable) null, 2, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[errorInfo.getReason().ordinal()];
        if (i == 1 || i == 2) {
            this.stateMachine.transition(new TwilsockEvent.OnFatalError(errorInfo));
        } else {
            this.stateMachine.transition(new TwilsockEvent.OnNonFatalError(errorInfo));
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl$onMessageReceived$2", m3645f = "Twilsock.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$onMessageReceived$2 */
    static final class C434812 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C434812(Continuation<? super C434812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockImpl.this.new C434812(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockImpl.this.restartWatchdogTimer();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Twilsock.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.client.TwilsockImpl$onMessageReceived$3", m3645f = "Twilsock.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.twilsock.client.TwilsockImpl$onMessageReceived$3 */
    static final class C434823 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C434823(byte[] bArr, Continuation<? super C434823> continuation) {
            super(2, continuation);
            this.$data = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockImpl.this.new C434823(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434823) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockImpl.this.handleMessageReceived(this.$data);
            return Unit.INSTANCE;
        }
    }

    @Override // com.twilio.twilsock.client.Twilsock
    public void handleMessageReceived(byte[] data) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(data, "data");
        String strDecodeToString = StringsKt.decodeToString(data);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(TwilsockMessage5.parse(TwilsockMessage.INSTANCE, strDecodeToString));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            TwilioLogger3.getLogger(this).m3202w("Error parsing incoming message: " + strDecodeToString, thM28553exceptionOrNullimpl);
            this.stateMachine.transition(new TwilsockEvent.OnFatalError(new ErrorInfo(TwilioException2.CannotParse, 0, 0, (String) null, (String) null, 30, (DefaultConstructorMarker) null)));
            return;
        }
        TwilsockMessage twilsockMessage = (TwilsockMessage) objM28550constructorimpl;
        if (this.stateMachine.getState() == TwilsockState.Connected.INSTANCE) {
            handleMessageReceived(twilsockMessage);
        } else {
            this.stateMachine.transition(new TwilsockEvent.OnMessageReceived(twilsockMessage));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMessageReceived(TwilsockMessage message) {
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("handleMessageReceived: " + message.getRequestId(), (Throwable) null);
        }
        if (message instanceof TwilsockMessage8) {
            handleReplyMessage((TwilsockMessage8) message);
            return;
        }
        if (message instanceof TwilsockMessage3) {
            handleCloseMessage((TwilsockMessage3) message);
            return;
        }
        if (message instanceof TwilsockMessage2) {
            handleClientUpdateMessage((TwilsockMessage2) message);
            return;
        }
        if (message instanceof TwilsockMessage6) {
            handleNotificationMessage((TwilsockMessage6) message);
            return;
        }
        if (message instanceof TwilsockMessage7) {
            sendReply$default(this, message, Status.INSTANCE.getOk(), null, 2, null);
            return;
        }
        TwilioLogger.w$default(TwilioLogger3.getLogger(this), "Skipped message with unexpected method " + message.getMethod(), (Throwable) null, 2, (Object) null);
    }

    private final void handleReplyMessage(TwilsockMessage8 message) {
        ErrorInfo errorInfo;
        TwilsockRequest twilsockRequest = this.sentRequests.get(message.getRequestId());
        if (twilsockRequest == null) {
            TwilioLogger.w$default(TwilioLogger3.getLogger(this), "Skipped reply for unknown request: " + message.getRequestId(), (Throwable) null, 2, (Object) null);
            return;
        }
        Status status = message.getReplyHeaders().getStatus();
        if (status.getCode() / 100 != 2) {
            HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
            HttpStatusCode httpStatusCodeFromValue = companion.fromValue(status.getCode());
            Integer errorCode = status.getErrorCode();
            if (errorCode != null && errorCode.intValue() == 20104) {
                errorInfo = commonUtils.toErrorInfo(status, TwilioException2.TokenExpired);
            } else if (Intrinsics.areEqual(httpStatusCodeFromValue, companion.getUnauthorized())) {
                errorInfo = commonUtils.toErrorInfo(status, TwilioException2.Unauthorized);
            } else {
                errorInfo = Intrinsics.areEqual(httpStatusCodeFromValue, companion.getTooManyRequests()) ? commonUtils.toErrorInfo(status, TwilioException2.TooManyRequests) : commonUtils.toErrorInfo(status, TwilioException2.Unknown);
            }
            twilsockRequest.cancel(errorInfo);
            Integer errorCode2 = status.getErrorCode();
            if (errorCode2 != null && errorCode2.intValue() == 20104) {
                TwilioLogger.w$default(TwilioLogger3.getLogger(this), "Token expired reply received", (Throwable) null, 2, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new TwilsockImpl$handleReplyMessage$$inlined$notifyObservers$1(this, null), 3, null);
            }
            if (Intrinsics.areEqual(httpStatusCodeFromValue, companion.getUnauthorized())) {
                this.stateMachine.transition(new TwilsockEvent.OnFatalError(errorInfo));
                return;
            }
            if (Intrinsics.areEqual(httpStatusCodeFromValue, companion.getTooManyRequests())) {
                BackoffPolicy backoffPolicy = message.getReplyPayload().getBackoffPolicy();
                int iNextInt = Random.INSTANCE.nextInt(backoffPolicy.getReconnectMinMilliseconds(), backoffPolicy.getReconnectMaxMilliseconds());
                StateMachine<TwilsockState, TwilsockEvent, SideEffect> stateMachine = this.stateMachine;
                Duration.Companion companion2 = Duration.INSTANCE;
                stateMachine.transition(new TwilsockEvent.OnTooManyRequests(Duration3.toDuration(iNextInt, DurationUnitJvm.MILLISECONDS), null));
                return;
            }
            this.stateMachine.transition(new TwilsockEvent.OnNonFatalError(errorInfo));
            return;
        }
        String continuationToken = message.getReplyHeaders().getContinuationToken();
        if (continuationToken.length() > 0) {
            this.continuationTokenStorage.setContinuationToken(continuationToken);
        }
        AccountDescriptor accountDescriptor = message.getReplyHeaders().getAccountDescriptor();
        if (accountDescriptor != null) {
            setAccountDescriptor(accountDescriptor);
        }
        twilsockRequest.complete(message);
    }

    private final void handleCloseMessage(TwilsockMessage3 message) {
        Integer errorCode;
        Integer errorCode2;
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("Server has just initiated process of closing connection: " + message.getPayload(), (Throwable) null);
        }
        sendReply$default(this, message, Status.INSTANCE.getOk(), null, 2, null);
        ErrorInfo errorInfo = commonUtils.toErrorInfo(message.getStatus(), TwilioException2.CloseMessageReceived);
        if (message.getStatus().getCode() == 308 && (errorCode2 = message.getStatus().getErrorCode()) != null && errorCode2.intValue() == 51232) {
            TwilioLogger logger2 = TwilioLogger3.getLogger(this);
            if (logger2.isDebugEnabled()) {
                logger2.m3189d("Token with different instanceSid", (Throwable) null);
            }
            this.stateMachine.transition(new TwilsockEvent.OnFatalError(errorInfo));
            return;
        }
        int code = message.getStatus().getCode();
        if (code == 308) {
            TwilioLogger logger3 = TwilioLogger3.getLogger(this);
            if (logger3.isDebugEnabled()) {
                logger3.m3189d("Offloading to another instance", (Throwable) null);
            }
            this.stateMachine.transition(new TwilsockEvent.OnNonFatalError(errorInfo));
            return;
        }
        if (code != 401 && code != 406 && code != 410 && code != 417) {
            TwilioLogger logger4 = TwilioLogger3.getLogger(this);
            if (logger4.isWarnEnabled()) {
                logger4.m3202w("Unexpected close message: " + errorInfo, (Throwable) null);
            }
            this.stateMachine.transition(new TwilsockEvent.OnNonFatalError(errorInfo));
            return;
        }
        TwilioLogger logger5 = TwilioLogger3.getLogger(this);
        if (logger5.isDebugEnabled()) {
            logger5.m3189d("Server closed connection because of fatal error: " + errorInfo, (Throwable) null);
        }
        if (code == 410 || ((errorCode = message.getStatus().getErrorCode()) != null && errorCode.intValue() == 20104)) {
            errorInfo = ErrorInfo.copy$default(errorInfo, TwilioException2.TokenExpired, 0, 0, null, null, 30, null);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new TwilsockImpl$handleCloseMessage$$inlined$notifyObservers$1(this, null), 3, null);
        } else if (code == 401) {
            errorInfo = ErrorInfo.copy$default(errorInfo, TwilioException2.Unauthorized, 0, 0, null, null, 30, null);
        }
        this.stateMachine.transition(new TwilsockEvent.OnFatalError(errorInfo));
    }

    private final void handleClientUpdateMessage(TwilsockMessage2 message) {
        sendReply$default(this, message, Status.INSTANCE.getOk(), null, 2, null);
        if (Intrinsics.areEqual(message.getClientUpdateType(), "token_about_to_expire")) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C43465x5a024d77(this, null), 3, null);
            return;
        }
        TwilioLogger.w$default(TwilioLogger3.getLogger(this), "Ignoring unknown client update: " + message.getClientUpdateType(), (Throwable) null, 2, (Object) null);
    }

    private final void handleNotificationMessage(TwilsockMessage6 message) {
        if (message.getPayload().length() == 0) {
            TwilioLogger.w$default(TwilioLogger3.getLogger(this), "Notification message is skipped. Payload is empty: " + message.getRequestId(), (Throwable) null, 2, (Object) null);
            sendReply(message, Status.INSTANCE.getBadRequest(), "Notification message must carry data");
            return;
        }
        sendReply$default(this, message, Status.INSTANCE.getOk(), null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C43466xd88a242e(this, null, message), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectivityChanged() {
        TwilioLogger logger = TwilioLogger3.getLogger(this);
        if (logger.isDebugEnabled()) {
            logger.m3189d("onConnectivityChanged: " + isNetworkAvailable(), (Throwable) null);
        }
        this.stateMachine.transition(isNetworkAvailable() ? TwilsockEvent.OnNetworkBecameReachable.INSTANCE : TwilsockEvent.OnNetworkBecameUnreachable.INSTANCE);
    }

    static /* synthetic */ void sendReply$default(TwilsockImpl twilsockImpl, TwilsockMessage twilsockMessage, Status status, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        twilsockImpl.sendReply(twilsockMessage, status, str);
    }

    private final void sendReply(TwilsockMessage twilsockMessage, Status status, String str) {
        TwilsockTransport twilsockTransport = this.websocket;
        if (twilsockTransport == null) {
            return;
        }
        String requestId = twilsockMessage.getRequestId();
        TwilsockMessage.Method method = TwilsockMessage.Method.REPLY;
        JsonElementBuilders2 jsonElementBuilders2 = new JsonElementBuilders2();
        Json json = InternalUtils3.getJson();
        json.getSerializersModule();
        jsonElementBuilders2.put("status", json.encodeToJsonElement(Status.INSTANCE.serializer(), status));
        Unit unit = Unit.INSTANCE;
        twilsockTransport.sendMessage(StringsKt.encodeToByteArray(TwilsockMessage5.encode(new TwilsockMessage(requestId, method, null, jsonElementBuilders2.build(), str.length() > 0 ? "text/plain" : "", str, null, 68, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void send(TwilsockRequest twilsockRequest) {
        byte[] bArrEncodeToByteArray = TwilsockMessage5.encodeToByteArray(twilsockRequest.getMessage());
        TwilsockTransport twilsockTransport = this.websocket;
        if (twilsockTransport == null) {
            throw new IllegalStateException("Required value was null.");
        }
        twilsockTransport.sendMessage(bArrEncodeToByteArray);
        this.sentRequests.put(twilsockRequest.getMessage().getRequestId(), twilsockRequest);
    }
}
