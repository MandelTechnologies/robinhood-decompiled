package com.twilio.conversations.twilsock;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.twilio.twilsock.client.AuthData;
import com.twilio.twilsock.client.ClientMetadata;
import com.twilio.twilsock.client.Twilsock;
import com.twilio.twilsock.client.TwilsockFactory;
import com.twilio.twilsock.client.TwilsockObserver;
import com.twilio.twilsock.util.HttpResponse;
import com.twilio.twilsock.util.http;
import com.twilio.util.CoroutineContextAndroid;
import com.twilio.util.ErrorInfo;
import com.twilio.util.TwilioLogger;
import com.twilio.util.TwilioLogger3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Supervisor3;

/* compiled from: TwilsockWrapper.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J,\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0005J\u0014\u0010#\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020 J\u0006\u0010(\u001a\u00020\u0016J\t\u0010)\u001a\u00020\u0016H\u0082 J\t\u0010*\u001a\u00020\u0016H\u0082 J\u0011\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0005H\u0082 J\u0011\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0082 J\u0011\u00100\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0082 J\t\u00101\u001a\u00020\u0016H\u0082 J\t\u00102\u001a\u00020\u0016H\u0082 J\u0019\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0082 J\u0019\u00106\u001a\u00020\u00162\u0006\u0010'\u001a\u00020 2\u0006\u00107\u001a\u00020\u0003H\u0082 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u00068"}, m3636d2 = {"Lcom/twilio/conversations/twilsock/TwilsockWrapper;", "", "nativeId", "", "url", "", "useProxy", "", "authData", "Lcom/twilio/twilsock/client/AuthData;", "clientMetadata", "Lcom/twilio/twilsock/client/ClientMetadata;", "<init>", "(ILjava/lang/String;ZLcom/twilio/twilsock/client/AuthData;Lcom/twilio/twilsock/client/ClientMetadata;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "twilsock", "Lcom/twilio/twilsock/client/Twilsock;", "getTwilsock", "()Lcom/twilio/twilsock/client/Twilsock;", "createTwilsock", "connect", "", "disconnect", "sendRequest", "Lcom/twilio/conversations/twilsock/JniFuture;", "Lcom/twilio/twilsock/util/HttpResponse;", "jniFutureId", "requestId", "timeout", "", "request", "", "updateToken", "newToken", "populateInitRegistrations", "messageTypes", "", "handleMessageReceived", WebsocketGatewayConstants.DATA_KEY, "close", "notifyConnecting", "notifyConnected", "notifyDisconnected", "reason", "notifyFatalError", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "notifyNonFatalError", "notifyTokenAboutToExpire", "notifyTokenExpired", "notifyTargetedMessageReceived", "messageType", "message", "notifyRawDataReceived", "len", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class TwilsockWrapper {
    private final AuthData authData;
    private final ClientMetadata clientMetadata;
    private final CoroutineScope coroutineScope;
    private final int nativeId;
    private final Twilsock twilsock;
    private final String url;
    private final boolean useProxy;

    private final native void notifyConnected();

    private final native void notifyConnecting();

    private final native void notifyDisconnected(String reason);

    private final native void notifyFatalError(ErrorInfo errorInfo);

    private final native void notifyNonFatalError(ErrorInfo errorInfo);

    private final native void notifyRawDataReceived(byte[] data, int len);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void notifyTargetedMessageReceived(String messageType, String message);

    private final native void notifyTokenAboutToExpire();

    private final native void notifyTokenExpired();

    public TwilsockWrapper(int i, String url, boolean z, AuthData authData, ClientMetadata clientMetadata) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(authData, "authData");
        Intrinsics.checkNotNullParameter(clientMetadata, "clientMetadata");
        this.nativeId = i;
        this.url = url;
        this.useProxy = z;
        this.authData = authData;
        this.clientMetadata = clientMetadata;
        try {
            CoroutineDispatcher coroutineDispatcherNewSingleThreadCoroutineContext = CoroutineContextAndroid.newSingleThreadCoroutineContext("TwilsockWrapper[" + i + ']');
            this.coroutineScope = CoroutineScope2.CoroutineScope(coroutineDispatcherNewSingleThreadCoroutineContext.plus(Supervisor3.SupervisorJob$default(null, 1, null)));
            this.twilsock = (Twilsock) BuildersKt.runBlocking(coroutineDispatcherNewSingleThreadCoroutineContext, new C434551(null));
        } catch (Throwable th) {
            TwilioLogger3.getLogger(this).m3192e("Fatal error while constructing TwilsockWrapper", th);
            throw th;
        }
    }

    public final Twilsock getTwilsock() {
        return this.twilsock;
    }

    /* compiled from: TwilsockWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/twilio/twilsock/client/Twilsock;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$1", m3645f = "TwilsockWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$1 */
    static final class C434551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Twilsock>, Object> {
        int label;

        C434551(Continuation<? super C434551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockWrapper.this.new C434551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Twilsock> continuation) {
            return ((C434551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TwilsockWrapper.this.createTwilsock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Twilsock createTwilsock() {
        Twilsock twilsockTwilsockFactory$default = TwilsockFactory.TwilsockFactory$default(this.url, this.useProxy, this.authData, this.clientMetadata, this.coroutineScope, null, null, null, 224, null);
        twilsockTwilsockFactory$default.addObserver(new Function1() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8(this.f$0, (TwilsockObserver) obj);
            }
        });
        return twilsockTwilsockFactory$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8(final TwilsockWrapper this$0, TwilsockObserver addObserver) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(addObserver, "$this$addObserver");
        addObserver.setOnConnecting(new Function0() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$0(this.f$0);
            }
        });
        addObserver.setOnConnected(new Function0() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$1(this.f$0);
            }
        });
        addObserver.setOnDisconnected(new Function1() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$2(this.f$0, (String) obj);
            }
        });
        addObserver.setOnMessageReceived(new TwilsockWrapper2(this$0));
        addObserver.setOnNonFatalError(new Function1() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$3(this.f$0, (ErrorInfo) obj);
            }
        });
        addObserver.setOnFatalError(new Function1() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$4(this.f$0, (ErrorInfo) obj);
            }
        });
        addObserver.setOnTokenAboutToExpire(new Function0() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$5(this.f$0);
            }
        });
        addObserver.setOnTokenExpired(new Function0() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$6(this.f$0);
            }
        });
        addObserver.setOnRawDataReceived(new Function1() { // from class: com.twilio.conversations.twilsock.TwilsockWrapper$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TwilsockWrapper.createTwilsock$lambda$9$lambda$8$lambda$7(this.f$0, (byte[]) obj));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$0(TwilsockWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyConnecting();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$1(TwilsockWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyConnected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$2(TwilsockWrapper this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.notifyDisconnected(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$3(TwilsockWrapper this$0, ErrorInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.notifyNonFatalError(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$4(TwilsockWrapper this$0, ErrorInfo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.notifyFatalError(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$5(TwilsockWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyTokenAboutToExpire();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTwilsock$lambda$9$lambda$8$lambda$6(TwilsockWrapper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyTokenExpired();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createTwilsock$lambda$9$lambda$8$lambda$7(TwilsockWrapper this$0, byte[] it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.notifyRawDataReceived(it, it.length);
        return true;
    }

    /* compiled from: TwilsockWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$connect$1", m3645f = "TwilsockWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$connect$1 */
    static final class C434571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C434571(Continuation<? super C434571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockWrapper.this.new C434571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockWrapper.this.getTwilsock().connect();
            return Unit.INSTANCE;
        }
    }

    public final void connect() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434571(null), 3, null);
    }

    /* compiled from: TwilsockWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$disconnect$1", m3645f = "TwilsockWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$disconnect$1 */
    static final class C434581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C434581(Continuation<? super C434581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockWrapper.this.new C434581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockWrapper.this.getTwilsock().disconnect();
            return Unit.INSTANCE;
        }
    }

    public final void disconnect() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434581(null), 3, null);
    }

    public final JniFuture<HttpResponse> sendRequest(int jniFutureId, String requestId, long timeout, byte[] request) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(request, "request");
        return new JniFuture<>(this.coroutineScope, jniFutureId, BuildersKt__Builders_commonKt.async$default(this.coroutineScope, null, null, new TwilsockWrapper3(this, requestId, timeout > 0 ? Duration3.toDuration(timeout, DurationUnitJvm.MILLISECONDS) : http.getKDefaultRequestTimeout(), request, null), 3, null));
    }

    public final JniFuture<Unit> updateToken(int jniFutureId, String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        return new JniFuture<>(this.coroutineScope, jniFutureId, BuildersKt__Builders_commonKt.async$default(this.coroutineScope, null, null, new TwilsockWrapper4(this, newToken, null), 3, null));
    }

    /* compiled from: TwilsockWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$populateInitRegistrations$1", m3645f = "TwilsockWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$populateInitRegistrations$1 */
    static final class C434601 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Set<String> $messageTypes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C434601(Set<String> set, Continuation<? super C434601> continuation) {
            super(2, continuation);
            this.$messageTypes = set;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockWrapper.this.new C434601(this.$messageTypes, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockWrapper.this.getTwilsock().populateInitRegistrations(this.$messageTypes);
            return Unit.INSTANCE;
        }
    }

    public final void populateInitRegistrations(Set<String> messageTypes) {
        Intrinsics.checkNotNullParameter(messageTypes, "messageTypes");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434601(messageTypes, null), 3, null);
    }

    /* compiled from: TwilsockWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$handleMessageReceived$1", m3645f = "TwilsockWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$handleMessageReceived$1 */
    static final class C434591 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C434591(byte[] bArr, Continuation<? super C434591> continuation) {
            super(2, continuation);
            this.$data = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockWrapper.this.new C434591(this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockWrapper.this.getTwilsock().handleMessageReceived(this.$data);
            return Unit.INSTANCE;
        }
    }

    public final void handleMessageReceived(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434591(data, null), 3, null);
    }

    /* compiled from: TwilsockWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.twilsock.TwilsockWrapper$close$1", m3645f = "TwilsockWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$close$1 */
    static final class C434561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C434561(Continuation<? super C434561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TwilsockWrapper.this.new C434561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C434561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TwilsockWrapper.this.getTwilsock().disconnect();
            return Unit.INSTANCE;
        }
    }

    public final void close() {
        TwilioLogger.d$default(TwilioLogger3.getLogger(this), "close", (Throwable) null, 2, (Object) null);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C434561(null), 3, null);
    }
}
