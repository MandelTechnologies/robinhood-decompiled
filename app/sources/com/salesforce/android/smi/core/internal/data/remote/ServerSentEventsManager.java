package com.salesforce.android.smi.core.internal.data.remote;

import android.annotation.SuppressLint;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.core.Configuration;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.core.internal.CoreEventFlow;
import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import com.salesforce.android.smi.core.internal.data.repository.ConversationRepository;
import com.salesforce.android.smi.core.internal.util.AbstractEventFlow;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryStatus;
import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayloadExt;
import com.salesforce.android.smi.network.internal.api.sse.ServerSentEvent;
import com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import com.salesforce.android.smi.remote.internal.api.sse.ServerSentEventsService;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ServerSentEventsManager.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001UBC\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J.\u0010+\u001a\u00020\u00152\u001c\u0010*\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0(\u0012\u0006\u0012\u0004\u0018\u00010)0'H\u0082@¢\u0006\u0004\b+\u0010,J\u0018\u0010.\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020-H\u0082@¢\u0006\u0004\b.\u0010/J,\u00105\u001a\u00020\u001f2\u0006\u00101\u001a\u0002002\b\b\u0002\u00102\u001a\u0002002\b\b\u0002\u00104\u001a\u000203H\u0082@¢\u0006\u0004\b5\u00106J \u0010:\u001a\u00020\u001f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001f2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b<\u0010=JF\u0010D\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u001a2\u001c\u0010C\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0(\u0012\u0006\u0012\u0004\u0018\u00010)0'H\u0082@¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010FR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010GR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010HR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u001c\u0010O\u001a\n N*\u0004\u0018\u00010M0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010Q\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010S\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", "Lcom/salesforce/android/smi/core/internal/util/AbstractEventFlow;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "conversationRestService", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "conversationRepository", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "conversationEntryRepository", "Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventsService;", "serverSentEventsService", "Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "coreEventFlow", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventsService;Lcom/salesforce/android/smi/core/internal/CoreEventFlow;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "start", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;", "stop", "()Lkotlinx/coroutines/Job;", "", "readLastEvent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;", "serverSentEvent", "", "collector", "(Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectionHandler", "(Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Connection;)V", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Error;", "errorEventHandler", "(Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$Error;)V", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "handleAsynchronously", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$ConversationEntryEvent;", "conversationEntryEventHandler", "(Lcom/salesforce/android/smi/network/internal/api/sse/ServerSentEvent$ConversationEntryEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "cadence", "", "delay", "applyBackpressure", "(IIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "conversationEntry", "eventId", "emitAndSave", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleMessage", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;)V", "Ljava/util/UUID;", "conversationId", "", "isLocal", "id", "transactionBlock", "updateHighWaterMark", "(Ljava/util/UUID;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventsService;", "Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "sseScope", "Lkotlinx/coroutines/CoroutineScope;", "sseJob", "Lkotlinx/coroutines/Job;", "Companion", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ServerSentEventsManager extends AbstractEventFlow<ServerSentEvent.Connection> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;
    private final AuthorizationService authorizationService;
    private final ConversationEntryRepository conversationEntryRepository;
    private final ConversationRepository conversationRepository;
    private final RestService conversationRestService;
    private final CoreEventFlow coreEventFlow;
    private final CoroutineDispatcher ioDispatcher;
    private final Logger logger;
    private final ServerSentEventsService serverSentEventsService;
    private Job sseJob;
    private CoroutineScope sseScope;

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager", m3645f = "ServerSentEventsManager.kt", m3646l = {76}, m3647m = "collector")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$collector$1 */
    static final class C420811 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420811(Continuation<? super C420811> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerSentEventsManager.this.collector(null, this);
        }
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "conversationEntryEventHandler")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$1 */
    static final class C420821 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C420821(Continuation<? super C420821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ServerSentEventsManager.this.conversationEntryEventHandler(null, this);
        }
    }

    public /* synthetic */ ServerSentEventsManager(AuthorizationService authorizationService, RestService restService, ConversationRepository conversationRepository, ConversationEntryRepository conversationEntryRepository, ServerSentEventsService serverSentEventsService, CoreEventFlow coreEventFlow, CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(authorizationService, restService, conversationRepository, conversationEntryRepository, serverSentEventsService, coreEventFlow, coroutineDispatcher);
    }

    private ServerSentEventsManager(AuthorizationService authorizationService, RestService restService, ConversationRepository conversationRepository, ConversationEntryRepository conversationEntryRepository, ServerSentEventsService serverSentEventsService, CoreEventFlow coreEventFlow, CoroutineDispatcher coroutineDispatcher) {
        super(0, null, 3, null);
        this.authorizationService = authorizationService;
        this.conversationRestService = restService;
        this.conversationRepository = conversationRepository;
        this.conversationEntryRepository = conversationEntryRepository;
        this.serverSentEventsService = serverSentEventsService;
        this.coreEventFlow = coreEventFlow;
        this.ioDispatcher = coroutineDispatcher;
        this.logger = Logger.getLogger(TAG);
    }

    @SuppressLint({"VisibleForTests"})
    public final Job start(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Job job = this.sseJob;
        if (job == null || (job != null && !job.isActive())) {
            this.sseScope = scope;
            this.sseJob = BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C420911(null), 3, null);
        }
        return this.sseJob;
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$start$1", m3645f = "ServerSentEventsManager.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$start$1 */
    static final class C420911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C420911(Continuation<? super C420911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ServerSentEventsManager.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$start$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Continuation<? super String>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(1, obj, ServerSentEventsManager.class, "readLastEvent", "readLastEvent(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super String> continuation) {
                return ((ServerSentEventsManager) this.receiver).readLastEvent(continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ServerSentEvent> flowStartStream = ServerSentEventsManager.this.serverSentEventsService.startStream(new AnonymousClass1(ServerSentEventsManager.this));
                final ServerSentEventsManager serverSentEventsManager = ServerSentEventsManager.this;
                FlowCollector<? super ServerSentEvent> flowCollector = new FlowCollector() { // from class: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager.start.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ServerSentEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ServerSentEvent serverSentEvent, Continuation<? super Unit> continuation) {
                        Object objCollector = serverSentEventsManager.collector(serverSentEvent, continuation);
                        return objCollector == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollector : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowStartStream.collect(flowCollector, this) == coroutine_suspended) {
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

    @SuppressLint({"VisibleForTests"})
    public final Job stop() {
        Job job = this.sseJob;
        if (job != null) {
            Job6.cancel$default(job, "SSE stream cancelled", null, 2, null);
        }
        return this.sseJob;
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$readLastEvent$2", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$readLastEvent$2 */
    static final class C420902 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C420902(Continuation<? super C420902> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420902(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C420902) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String lastEventId;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizationService authorizationService = ServerSentEventsManager.this.authorizationService;
                this.label = 1;
                obj = AuthorizationService.authorization$default(authorizationService, false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Auth auth = (Auth) com.salesforce.android.smi.common.api.ResultKt.getData((Result) obj);
            if (auth == null || (lastEventId = auth.getLastEventId()) == null) {
                lastEventId = "0";
            }
            ServerSentEventsManager.this.logger.log(Level.INFO, "Stored lastEventId: " + lastEventId);
            return lastEventId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readLastEvent(Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C420902(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collector(ServerSentEvent serverSentEvent, Continuation<? super Unit> continuation) {
        C420811 c420811;
        ServerSentEventsManager serverSentEventsManager;
        if (continuation instanceof C420811) {
            c420811 = (C420811) continuation;
            int i = c420811.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420811.label = i - Integer.MIN_VALUE;
            } else {
                c420811 = new C420811(continuation);
            }
        }
        Object obj = c420811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420811.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                if (serverSentEvent instanceof ServerSentEvent.ConversationEntryEvent) {
                    c420811.L$0 = this;
                    c420811.label = 1;
                    if (conversationEntryEventHandler((ServerSentEvent.ConversationEntryEvent) serverSentEvent, c420811) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (serverSentEvent instanceof ServerSentEvent.Error) {
                    errorEventHandler((ServerSentEvent.Error) serverSentEvent);
                } else {
                    if (!(serverSentEvent instanceof ServerSentEvent.Connection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ServerSentEvent.Connection connection = (ServerSentEvent.Connection) serverSentEvent;
                    if (!Intrinsics.areEqual(connection, ServerSentEvent.Connection.Closed.INSTANCE) && !Intrinsics.areEqual(connection, ServerSentEvent.Connection.Connecting.INSTANCE) && !Intrinsics.areEqual(connection, ServerSentEvent.Connection.Open.INSTANCE) && !Intrinsics.areEqual(connection, ServerSentEvent.Connection.Ping.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    connectionHandler((ServerSentEvent.Connection) serverSentEvent);
                }
            } catch (Exception e) {
                e = e;
                serverSentEventsManager = this;
                serverSentEventsManager.errorEventHandler(new ServerSentEvent.Error("SSE Manager Collector", e));
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverSentEventsManager = (ServerSentEventsManager) c420811.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                serverSentEventsManager.errorEventHandler(new ServerSentEvent.Error("SSE Manager Collector", e));
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    private final void connectionHandler(ServerSentEvent.Connection serverSentEvent) {
        if (Intrinsics.areEqual(serverSentEvent, ServerSentEvent.Connection.Closed.INSTANCE) || Intrinsics.areEqual(serverSentEvent, ServerSentEvent.Connection.Connecting.INSTANCE) || Intrinsics.areEqual(serverSentEvent, ServerSentEvent.Connection.Open.INSTANCE)) {
            sendEvent(serverSentEvent);
        } else if (!Intrinsics.areEqual(serverSentEvent, ServerSentEvent.Connection.Ping.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        this.coreEventFlow.sendEvent(new CoreEvent.Connection(serverSentEvent));
    }

    private final void errorEventHandler(ServerSentEvent.Error serverSentEvent) {
        Logger logger = this.logger;
        Level level = Level.WARNING;
        String message = serverSentEvent.getMessage();
        Throwable cause = serverSentEvent.getCause();
        logger.log(level, "Error server sent event handler: " + message + " - " + (cause != null ? ExceptionsKt.stackTraceToString(cause) : null));
        Throwable cause2 = serverSentEvent.getCause();
        if (cause2 != null) {
            this.coreEventFlow.sendEvent(new CoreEvent.Error(serverSentEvent.getMessage(), new Exception(cause2)));
        } else {
            this.coreEventFlow.sendEvent(new CoreEvent.Error(serverSentEvent.getMessage(), null, 2, null));
        }
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$handleAsynchronously$2", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$handleAsynchronously$2 */
    static final class C420882 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C420882(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super C420882> continuation) {
            super(2, continuation);
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C420882(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420882) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Unit>, Object> function1 = this.$block;
                this.label = 1;
                if (function1.invoke(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024c, code lost:
    
        if (emitAndSave(r12, r11, r6) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0130, code lost:
    
        if (updateHighWaterMark(r2, r3, r4, r5, r6) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015c, code lost:
    
        if (r12.updateStatus(r1, r2, r4, r6) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        if (emitAndSave(r12, r1, r6) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0193, code lost:
    
        if (r12.updateLastEventId(r11, r6) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e5, code lost:
    
        if (r2.handleAsynchronously(r12, r6) != r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object conversationEntryEventHandler(ServerSentEvent.ConversationEntryEvent conversationEntryEvent, Continuation<? super Unit> continuation) {
        C420821 c420821;
        ConversationEntry conversationEntry;
        ServerSentEventsManager serverSentEventsManager;
        ServerSentEvent.ConversationEntryEvent conversationEntryEvent2;
        ConversationEntry conversationEntry2;
        ServerSentEventsManager serverSentEventsManager2;
        ServerSentEventsManager serverSentEventsManager3;
        ServerSentEvent.ConversationEntryEvent conversationEntryEvent3;
        ConversationEntry conversationEntry3;
        String eventId;
        ServerSentEventsManager serverSentEventsManager4;
        if (continuation instanceof C420821) {
            c420821 = (C420821) continuation;
            int i = c420821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420821.label = i - Integer.MIN_VALUE;
            } else {
                c420821 = new C420821(continuation);
            }
        }
        C420821 c4208212 = c420821;
        Object obj = c4208212.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c4208212.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ConversationEntry conversationEntry4 = conversationEntryEvent.getConversationEntry();
                this.logger.log(Level.INFO, "Conversation entry event payload: " + conversationEntry4.getEntryType() + " - " + conversationEntry4.getPayload());
                EntryPayload payload = conversationEntry4.getPayload();
                if (payload instanceof EntryPayload.MessagePayload) {
                    C420832 c420832 = new C420832(conversationEntry4, null);
                    c4208212.L$0 = this;
                    c4208212.L$1 = conversationEntryEvent;
                    c4208212.L$2 = conversationEntry4;
                    c4208212.label = 1;
                    if (handleAsynchronously(c420832, c4208212) != coroutine_suspended) {
                        serverSentEventsManager3 = this;
                        conversationEntryEvent3 = conversationEntryEvent;
                        conversationEntry3 = conversationEntry4;
                        eventId = conversationEntryEvent3.getEventId();
                        c4208212.L$0 = serverSentEventsManager3;
                        c4208212.L$1 = conversationEntry3;
                        c4208212.L$2 = null;
                        c4208212.label = 2;
                        if (serverSentEventsManager3.emitAndSave(conversationEntry3, eventId, c4208212) != coroutine_suspended) {
                            serverSentEventsManager4 = serverSentEventsManager3;
                            serverSentEventsManager4.handleMessage(conversationEntry3);
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                if (payload instanceof EntryPayload.AcknowledgeReadPayload) {
                    this.coreEventFlow.sendEvent(new CoreEvent.ConversationEvent.Entry(conversationEntry4));
                    UUID conversationId = conversationEntry4.getConversationId();
                    boolean zIsLocal = conversationEntry4.getSender().isLocal();
                    String acknowledgedConversationEntryIdentifier = ((EntryPayload.AcknowledgeReadPayload) payload).getAcknowledgedConversationEntryIdentifier();
                    C420843 c420843 = new C420843(conversationEntryEvent, null);
                    c4208212.label = 3;
                    break;
                } else if (payload instanceof EntryPayload.AcknowledgeDeliveryPayload) {
                    this.coreEventFlow.sendEvent(new CoreEvent.ConversationEvent.Entry(conversationEntry4));
                    ConversationEntryRepository conversationEntryRepository = this.conversationEntryRepository;
                    String acknowledgedConversationEntryIdentifier2 = ((EntryPayload.AcknowledgeDeliveryPayload) payload).getAcknowledgedConversationEntryIdentifier();
                    ConversationEntryStatus conversationEntryStatus = ConversationEntryStatus.Delivered;
                    C420854 c420854 = new C420854(conversationEntryEvent, null);
                    c4208212.label = 4;
                    break;
                } else if (payload instanceof EntryPayload.ParticipantChangedPayload) {
                    if (EntryPayloadExt.filterInvalid((EntryPayload.ParticipantChangedPayload) payload) == null) {
                        AuthorizationService authorizationService = this.authorizationService;
                        String eventId2 = conversationEntryEvent.getEventId();
                        c4208212.L$0 = null;
                        c4208212.L$1 = null;
                        c4208212.label = 6;
                        break;
                    } else {
                        String eventId3 = conversationEntryEvent.getEventId();
                        c4208212.L$0 = this;
                        c4208212.L$1 = conversationEntryEvent;
                        c4208212.label = 5;
                        break;
                    }
                } else if ((payload instanceof EntryPayload.RoutingResultPayload) || (payload instanceof EntryPayload.RoutingWorkResultPayload) || (payload instanceof EntryPayload.UnknownEntryPayload)) {
                    String eventId4 = conversationEntryEvent.getEventId();
                    c4208212.label = 7;
                    break;
                } else if (payload instanceof EntryPayload.StreamingTokenPayload) {
                    int sequenceNumber = ((EntryPayload.StreamingTokenPayload) payload).getStreamingToken().getSequenceNumber();
                    c4208212.L$0 = this;
                    c4208212.L$1 = conversationEntryEvent;
                    c4208212.L$2 = conversationEntry4;
                    c4208212.label = 8;
                    if (applyBackpressure$default(this, sequenceNumber, 0, 0L, c4208212, 6, null) != coroutine_suspended) {
                        conversationEntryEvent2 = conversationEntryEvent;
                        conversationEntry2 = conversationEntry4;
                        serverSentEventsManager2 = this;
                        C420866 c420866 = serverSentEventsManager2.new C420866(conversationEntry2, conversationEntryEvent2, null);
                        c4208212.L$0 = null;
                        c4208212.L$1 = null;
                        c4208212.L$2 = null;
                        c4208212.label = 9;
                        break;
                    }
                } else {
                    if (!(payload instanceof EntryPayload.ProgressIndicatorPayload) && !(payload instanceof EntryPayload.TypingIndicatorPayload) && !(payload instanceof EntryPayload.TypingStartedIndicatorPayload) && !(payload instanceof EntryPayload.TypingStoppedIndicatorPayload)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AuthorizationService authorizationService2 = this.authorizationService;
                    String eventId5 = conversationEntryEvent.getEventId();
                    c4208212.L$0 = this;
                    c4208212.L$1 = conversationEntry4;
                    c4208212.label = 10;
                    if (authorizationService2.updateLastEventId(eventId5, c4208212) != coroutine_suspended) {
                        conversationEntry = conversationEntry4;
                        serverSentEventsManager = this;
                        if (!conversationEntry.getSender().isLocal()) {
                            return Unit.INSTANCE;
                        }
                        serverSentEventsManager.coreEventFlow.sendEvent(new CoreEvent.ConversationEvent.TypingIndicator(conversationEntry, null, 2, null));
                        boxing.boxBoolean(serverSentEventsManager.coreEventFlow.sendEvent(new CoreEvent.ConversationEvent.ProgressIndicator(conversationEntry)));
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 1:
                conversationEntry3 = (ConversationEntry) c4208212.L$2;
                conversationEntryEvent3 = (ServerSentEvent.ConversationEntryEvent) c4208212.L$1;
                serverSentEventsManager3 = (ServerSentEventsManager) c4208212.L$0;
                ResultKt.throwOnFailure(obj);
                eventId = conversationEntryEvent3.getEventId();
                c4208212.L$0 = serverSentEventsManager3;
                c4208212.L$1 = conversationEntry3;
                c4208212.L$2 = null;
                c4208212.label = 2;
                if (serverSentEventsManager3.emitAndSave(conversationEntry3, eventId, c4208212) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                conversationEntry3 = (ConversationEntry) c4208212.L$1;
                serverSentEventsManager4 = (ServerSentEventsManager) c4208212.L$0;
                ResultKt.throwOnFailure(obj);
                serverSentEventsManager4.handleMessage(conversationEntry3);
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 8:
                conversationEntry2 = (ConversationEntry) c4208212.L$2;
                conversationEntryEvent2 = (ServerSentEvent.ConversationEntryEvent) c4208212.L$1;
                serverSentEventsManager2 = (ServerSentEventsManager) c4208212.L$0;
                ResultKt.throwOnFailure(obj);
                C420866 c4208662 = serverSentEventsManager2.new C420866(conversationEntry2, conversationEntryEvent2, null);
                c4208212.L$0 = null;
                c4208212.L$1 = null;
                c4208212.L$2 = null;
                c4208212.label = 9;
                break;
            case 9:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 10:
                conversationEntry = (ConversationEntry) c4208212.L$1;
                serverSentEventsManager = (ServerSentEventsManager) c4208212.L$0;
                ResultKt.throwOnFailure(obj);
                if (!conversationEntry.getSender().isLocal()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$2", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$2 */
    static final class C420832 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ConversationEntry $conversationEntry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420832(ConversationEntry conversationEntry, Continuation<? super C420832> continuation) {
            super(1, continuation);
            this.$conversationEntry = conversationEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420832(this.$conversationEntry, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420832) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ConversationEntryRepository conversationEntryRepository = ServerSentEventsManager.this.conversationEntryRepository;
                ConversationEntry conversationEntry = this.$conversationEntry;
                Intrinsics.checkNotNull(conversationEntry, "null cannot be cast to non-null type com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry");
                this.label = 1;
                if (conversationEntryRepository.saveAttachments((CoreConversationEntry) conversationEntry, this) == coroutine_suspended) {
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

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$3", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$3 */
    static final class C420843 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerSentEvent.ConversationEntryEvent $serverSentEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420843(ServerSentEvent.ConversationEntryEvent conversationEntryEvent, Continuation<? super C420843> continuation) {
            super(1, continuation);
            this.$serverSentEvent = conversationEntryEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420843(this.$serverSentEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420843) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizationService authorizationService = ServerSentEventsManager.this.authorizationService;
                String eventId = this.$serverSentEvent.getEventId();
                this.label = 1;
                if (authorizationService.updateLastEventId(eventId, this) == coroutine_suspended) {
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

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$4", m3645f = "ServerSentEventsManager.kt", m3646l = {156}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$4 */
    static final class C420854 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ServerSentEvent.ConversationEntryEvent $serverSentEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420854(ServerSentEvent.ConversationEntryEvent conversationEntryEvent, Continuation<? super C420854> continuation) {
            super(1, continuation);
            this.$serverSentEvent = conversationEntryEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420854(this.$serverSentEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420854) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizationService authorizationService = ServerSentEventsManager.this.authorizationService;
                String eventId = this.$serverSentEvent.getEventId();
                this.label = 1;
                if (authorizationService.updateLastEventId(eventId, this) == coroutine_suspended) {
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

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$6", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$conversationEntryEventHandler$6 */
    static final class C420866 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ ConversationEntry $conversationEntry;
        final /* synthetic */ ServerSentEvent.ConversationEntryEvent $serverSentEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420866(ConversationEntry conversationEntry, ServerSentEvent.ConversationEntryEvent conversationEntryEvent, Continuation<? super C420866> continuation) {
            super(1, continuation);
            this.$conversationEntry = conversationEntry;
            this.$serverSentEvent = conversationEntryEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420866(this.$conversationEntry, this.$serverSentEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420866) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ServerSentEventsManager serverSentEventsManager = ServerSentEventsManager.this;
                ConversationEntry conversationEntry = this.$conversationEntry;
                String eventId = this.$serverSentEvent.getEventId();
                this.label = 1;
                if (serverSentEventsManager.emitAndSave(conversationEntry, eventId, this) == coroutine_suspended) {
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

    static /* synthetic */ Object applyBackpressure$default(ServerSentEventsManager serverSentEventsManager, int i, int i2, long j, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            j = 500;
        }
        return serverSentEventsManager.applyBackpressure(i, i4, j, continuation);
    }

    private final Object applyBackpressure(int i, int i2, long j, Continuation<? super Unit> continuation) {
        if (i > 0) {
            int i3 = i % i2;
            if (i3 + (i2 & (((i3 ^ i2) & ((-i3) | i3)) >> 31)) == 0) {
                this.logger.log(Level.INFO, "[" + i + "] applying backpressure to allow other DB operations to catch up if needed.");
                Object objDelay = DelayKt.delay(j, continuation);
                return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$emitAndSave$2", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$emitAndSave$2 */
    static final class C420872 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $eventId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420872(String str, Continuation<? super C420872> continuation) {
            super(1, continuation);
            this.$eventId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420872(this.$eventId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C420872) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthorizationService authorizationService = ServerSentEventsManager.this.authorizationService;
                String str = this.$eventId;
                this.label = 1;
                if (authorizationService.updateLastEventId(str, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitAndSave(ConversationEntry conversationEntry, String str, Continuation<? super Unit> continuation) {
        this.coreEventFlow.sendEvent(new CoreEvent.ConversationEvent.Entry(conversationEntry));
        Object objSave$default = ConversationEntryRepository.save$default(this.conversationEntryRepository, conversationEntry, false, false, new C420872(str, null), continuation, 6, null);
        return objSave$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSave$default : Unit.INSTANCE;
    }

    private final void handleMessage(ConversationEntry conversationEntry) {
        CoroutineScope coroutineScope;
        if (conversationEntry.getSender().isLocal() || (coroutineScope = this.sseScope) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C420891(conversationEntry, null), 3, null);
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$handleMessage$1", m3645f = "ServerSentEventsManager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.salesforce.android.smi.core.internal.data.remote.ServerSentEventsManager$handleMessage$1 */
    static final class C420891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ConversationEntry $conversationEntry;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C420891(ConversationEntry conversationEntry, Continuation<? super C420891> continuation) {
            super(2, continuation);
            this.$conversationEntry = conversationEntry;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ServerSentEventsManager.this.new C420891(this.$conversationEntry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C420891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RestService restService = ServerSentEventsManager.this.conversationRestService;
                UUID conversationId = this.$conversationEntry.getConversationId();
                String identifier = this.$conversationEntry.getIdentifier();
                this.label = 1;
                if (restService.sendDeliveryAck(conversationId, identifier, this) == coroutine_suspended) {
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

    private final Object updateHighWaterMark(UUID uuid, boolean z, String str, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        if (z) {
            Object objUpdateInboundWatermark = this.conversationRepository.updateInboundWatermark(uuid, str, function1, continuation);
            return objUpdateInboundWatermark == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateInboundWatermark : Unit.INSTANCE;
        }
        Object objUpdateOutboundWatermark = this.conversationRepository.updateOutboundWatermark(uuid, str, function1, continuation);
        return objUpdateOutboundWatermark == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateOutboundWatermark : Unit.INSTANCE;
    }

    /* compiled from: ServerSentEventsManager.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager$Companion;", "", "<init>", "()V", "Lcom/salesforce/android/smi/core/Configuration;", "coreConfiguration", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "authorizationService", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "conversationRepository", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "conversationEntryRepository", "Lcom/salesforce/android/smi/core/internal/CoreEventFlow;", "coreEventFlow", "Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventsService;", "serverSentEventsService", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/salesforce/android/smi/core/Configuration;Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;Lcom/salesforce/android/smi/core/internal/CoreEventFlow;Lcom/salesforce/android/smi/remote/internal/api/sse/ServerSentEventsService;Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/salesforce/android/smi/core/internal/data/remote/ServerSentEventsManager;", "", "STREAMING_BACKPRESSURE_DELAY_MS", "J", "", "STREAMING_BACKPRESSURE_CADENCE", "I", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ServerSentEventsManager create(Configuration coreConfiguration, AuthorizationService authorizationService, RestService restService, ConversationRepository conversationRepository, ConversationEntryRepository conversationEntryRepository, CoreEventFlow coreEventFlow, ServerSentEventsService serverSentEventsService, CoroutineDispatcher ioDispatcher) {
            Intrinsics.checkNotNullParameter(coreConfiguration, "coreConfiguration");
            Intrinsics.checkNotNullParameter(authorizationService, "authorizationService");
            Intrinsics.checkNotNullParameter(restService, "restService");
            Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
            Intrinsics.checkNotNullParameter(conversationEntryRepository, "conversationEntryRepository");
            Intrinsics.checkNotNullParameter(coreEventFlow, "coreEventFlow");
            Intrinsics.checkNotNullParameter(serverSentEventsService, "serverSentEventsService");
            Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
            return new ServerSentEventsManager(authorizationService, restService, conversationRepository, conversationEntryRepository, serverSentEventsService, coreEventFlow, ioDispatcher, null);
        }
    }

    static {
        String name = ServerSentEventsManager.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }

    private final Object handleAsynchronously(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Job> continuation) {
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(continuation.getContext()), this.ioDispatcher, null, new C420882(function1, null), 2, null);
    }
}
