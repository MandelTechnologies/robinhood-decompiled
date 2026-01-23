package com.salesforce.android.smi.core.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.common.internal.util.NetworkConnectivityStatus;
import com.salesforce.android.smi.common.internal.util.NetworkStateManager;
import com.salesforce.android.smi.core.Configuration;
import com.salesforce.android.smi.core.ConversationClient;
import com.salesforce.android.smi.core.CoreClient;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.core.internal.ServiceLocator;
import com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger;
import com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager;
import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import com.salesforce.android.smi.core.internal.data.repository.ConversationRepository;
import com.salesforce.android.smi.core.internal.util.ConversationEntryFactory;
import com.salesforce.android.smi.core.internal.util.SMILogger;
import com.salesforce.android.smi.network.api.auth.UserVerificationProvider;
import com.salesforce.android.smi.network.internal.api.sse.ServerSentEvent;
import com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService;
import com.salesforce.android.smi.remote.internal.api.config.RemoteConfigService;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: InternalCoreClient.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001QB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020!0*H\u0096@¢\u0006\u0004\b+\u0010,J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020!0*2\u0006\u0010+\u001a\u00020-H\u0096@¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020!H\u0016¢\u0006\u0004\b0\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010;R \u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR&\u0010D\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010%\u001a\u0004\bF\u0010GR \u0010J\u001a\b\u0012\u0004\u0012\u00020C0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010O\u001a\b\u0012\u0004\u0012\u00020N0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010A¨\u0006R"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/InternalCoreClient;", "Lcom/salesforce/android/smi/core/CoreClient;", "Lcom/salesforce/android/smi/core/Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager;", "networkStateManager", "Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;", "configService", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", "serverSentEventsManager", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "conversationRepository", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "conversationEntryRepository", "Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "readAcknowledger", "Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "conversationEntryFactory", "Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "coreEventFlow", "<init>", "(Lcom/salesforce/android/smi/core/Configuration;Lcom/salesforce/android/smi/common/internal/util/NetworkStateManager;Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;Lcom/salesforce/android/smi/core/internal/CoreEventFlow;)V", "Ljava/util/UUID;", "conversationId", "Lcom/salesforce/android/smi/core/ConversationClient;", "conversationClient", "(Ljava/util/UUID;)Lcom/salesforce/android/smi/core/ConversationClient;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "start", "(Lkotlinx/coroutines/CoroutineScope;)V", "stop", "()V", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "provider", "registerUserVerificationProvider", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;)V", "Lcom/salesforce/android/smi/common/api/Result;", "deregisterDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "revokeToken", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "Lcom/salesforce/android/smi/core/Configuration;", "getConfiguration", "()Lcom/salesforce/android/smi/core/Configuration;", "Lcom/salesforce/android/smi/remote/internal/api/config/RemoteConfigService;", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/salesforce/android/smi/core/events/CoreEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/salesforce/android/smi/common/internal/util/NetworkConnectivityStatus;", "networkConnectivityState", "Lkotlinx/coroutines/flow/StateFlow;", "getNetworkConnectivityState", "()Lkotlinx/coroutines/flow/StateFlow;", "getNetworkConnectivityState$annotations", "Lkotlinx/coroutines/flow/Flow;", "networkConnectivityStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "getNetworkConnectivityStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "realtimeConnectionState", "getRealtimeConnectionState", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InternalCoreClient implements CoreClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;

    @Keep
    private static final SMILogger defaultLogger;
    private static final Logger logger;
    private final AuthorizationService authorizationService;
    private final RemoteConfigService configService;
    private final Configuration configuration;
    private final ConversationEntryFactory conversationEntryFactory;
    private final ConversationEntryRepository conversationEntryRepository;
    private final ConversationRepository conversationRepository;
    private final SharedFlow<CoreEvent> events;
    private final StateFlow<NetworkConnectivityStatus> networkConnectivityState;
    private final Flow<NetworkConnectivityStatus> networkConnectivityStatusFlow;
    private final ReadAcknowledger readAcknowledger;
    private final SharedFlow<ServerSentEvent.Connection> realtimeConnectionState;
    private final RestService restService;
    private final ServerSentEventsManager serverSentEventsManager;

    /* compiled from: InternalCoreClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalCoreClient", m3645f = "InternalCoreClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE}, m3647m = "revokeToken")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalCoreClient$revokeToken$1 */
    static final class C420771 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420771(Continuation<? super C420771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalCoreClient.this.revokeToken(false, this);
        }
    }

    public InternalCoreClient(Configuration configuration, NetworkStateManager networkStateManager, RemoteConfigService configService, AuthorizationService authorizationService, RestService restService, ServerSentEventsManager serverSentEventsManager, ConversationRepository conversationRepository, ConversationEntryRepository conversationEntryRepository, ReadAcknowledger readAcknowledger, ConversationEntryFactory conversationEntryFactory, CoreEventFlow coreEventFlow) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(networkStateManager, "networkStateManager");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(authorizationService, "authorizationService");
        Intrinsics.checkNotNullParameter(restService, "restService");
        Intrinsics.checkNotNullParameter(serverSentEventsManager, "serverSentEventsManager");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(conversationEntryRepository, "conversationEntryRepository");
        Intrinsics.checkNotNullParameter(readAcknowledger, "readAcknowledger");
        Intrinsics.checkNotNullParameter(conversationEntryFactory, "conversationEntryFactory");
        Intrinsics.checkNotNullParameter(coreEventFlow, "coreEventFlow");
        this.configuration = configuration;
        this.configService = configService;
        this.authorizationService = authorizationService;
        this.restService = restService;
        this.serverSentEventsManager = serverSentEventsManager;
        this.conversationRepository = conversationRepository;
        this.conversationEntryRepository = conversationEntryRepository;
        this.readAcknowledger = readAcknowledger;
        this.conversationEntryFactory = conversationEntryFactory;
        this.events = coreEventFlow.getFlow();
        this.networkConnectivityState = FlowKt.asStateFlow(StateFlow4.MutableStateFlow(NetworkConnectivityStatus.Unknown));
        this.networkConnectivityStatusFlow = networkStateManager.getConnectivityStatusFlow();
        this.realtimeConnectionState = serverSentEventsManager.getFlow();
    }

    public Configuration getConfiguration() {
        return this.configuration;
    }

    public SharedFlow<CoreEvent> getEvents() {
        return this.events;
    }

    @Override // com.salesforce.android.smi.core.CoreClient
    public ConversationClient conversationClient(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return new InternalConversationClient(conversationId, this.restService, this.conversationRepository, this.conversationEntryRepository, this.readAcknowledger, this.conversationEntryFactory, getEvents());
    }

    @Override // com.salesforce.android.smi.core.CoreClient
    public void start(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.serverSentEventsManager.start(scope);
    }

    @Override // com.salesforce.android.smi.core.CoreClient
    public void stop() {
        this.serverSentEventsManager.stop();
    }

    @Override // com.salesforce.android.smi.core.CoreClient
    public void registerUserVerificationProvider(UserVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.authorizationService.setUserVerificationProvider(provider);
    }

    public Object deregisterDevice(Continuation<? super Result<Unit>> continuation) {
        return this.restService.deregisterDevice(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (deregisterDevice(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.salesforce.android.smi.core.CoreClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object revokeToken(boolean z, Continuation<? super Result<Unit>> continuation) {
        C420771 c420771;
        InternalCoreClient internalCoreClient;
        if (continuation instanceof C420771) {
            c420771 = (C420771) continuation;
            int i = c420771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420771.label = i - Integer.MIN_VALUE;
            } else {
                c420771 = new C420771(continuation);
            }
        }
        Object obj = c420771.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420771.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!getConfiguration().isUserVerificationRequired()) {
                return new Result.Error(new Exception("Revoke token is not currently supported for unauthenticated users"));
            }
            if (z) {
                c420771.L$0 = this;
                c420771.label = 1;
            }
            internalCoreClient = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            internalCoreClient = (InternalCoreClient) c420771.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AuthorizationService authorizationService = internalCoreClient.authorizationService;
        c420771.L$0 = null;
        c420771.label = 2;
        Object objRevokeToken = authorizationService.revokeToken(c420771);
        return objRevokeToken == coroutine_suspended ? coroutine_suspended : objRevokeToken;
    }

    @Override // com.salesforce.android.smi.core.CoreClient
    public void destroy() {
        stop();
        ServiceLocator.INSTANCE.destroyInstance();
    }

    /* compiled from: InternalCoreClient.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/InternalCoreClient$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/salesforce/android/smi/core/Configuration;", "coreConfiguration", "Lcom/salesforce/android/smi/core/CoreClient;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Landroid/content/Context;Lcom/salesforce/android/smi/core/Configuration;)Lcom/salesforce/android/smi/core/CoreClient;", "", "TAG", "Ljava/lang/String;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lcom/salesforce/android/smi/core/internal/util/SMILogger;", "defaultLogger", "Lcom/salesforce/android/smi/core/internal/util/SMILogger;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CoreClient create(Context context, Configuration coreConfiguration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(coreConfiguration, "coreConfiguration");
            InternalCoreClient.logger.log(Level.INFO, "Creating new CoreClient instance\n" + coreConfiguration);
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            companion.destroyInstance();
            ServiceLocator singletonHolder = companion.getInstance(new Tuples2(context, coreConfiguration));
            return new InternalCoreClient(coreConfiguration, singletonHolder.getNetworkStateManager(), singletonHolder.getRemoteConfigService(), singletonHolder.getAuthorizationService(), singletonHolder.getRestService(), singletonHolder.getServerSentEventsManager(), singletonHolder.getConversationRepository(), singletonHolder.getConversationEntryRepository(), singletonHolder.getReadAcknowledger(), singletonHolder.getConversationEntryFactory(), singletonHolder.getCoreEventFlow());
        }
    }

    static {
        String name = InternalCoreClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
        logger = Logger.getLogger(name);
        defaultLogger = SMILogger.INSTANCE;
    }
}
