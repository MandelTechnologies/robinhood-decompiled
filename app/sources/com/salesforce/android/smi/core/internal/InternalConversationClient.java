package com.salesforce.android.smi.core.internal;

import com.plaid.internal.EnumC7081g;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.common.internal.util.FileUtil;
import com.salesforce.android.smi.core.ConversationClient;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.core.internal.data.remote.ReadAcknowledger;
import com.salesforce.android.smi.core.internal.data.repository.ConversationEntryRepository;
import com.salesforce.android.smi.core.internal.data.repository.ConversationRepository;
import com.salesforce.android.smi.core.internal.util.ConversationEntryFactory;
import com.salesforce.android.smi.network.api.rest.QueryDirection;
import com.salesforce.android.smi.network.data.domain.conversation.Conversation;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.CoreConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.StaticContentFormat;
import com.salesforce.android.smi.remote.internal.api.rest.RestService;
import java.io.File;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: InternalConversationClient.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180(0\u00170'2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b+\u0010,J(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b-\u0010\u001aJ\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010.\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b/\u00100J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0017H\u0096@¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010.\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b4\u00100J\u0012\u00106\u001a\u0004\u0018\u000105H\u0096@¢\u0006\u0004\b6\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R&\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00170'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010D\u001a\b\u0012\u0004\u0012\u00020C0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u001c\u0010F\u001a\b\u0012\u0004\u0012\u0002050\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, m3636d2 = {"Lcom/salesforce/android/smi/core/internal/InternalConversationClient;", "Lcom/salesforce/android/smi/core/ConversationClient;", "Ljava/util/UUID;", "conversationId", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "restService", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "conversationRepository", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "conversationEntryRepository", "Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "readAcknowledger", "Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "conversationEntryFactory", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/salesforce/android/smi/core/events/CoreEvent;", "coreEvents", "<init>", "(Ljava/util/UUID;Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;Lkotlinx/coroutines/flow/SharedFlow;)V", "Ljava/io/File;", "file", "", "message", "Lcom/salesforce/android/smi/common/api/Result;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "sendAttachment", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "text", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$AttachmentsFormat;", "getAttachmentsFormat", "(Ljava/io/File;Ljava/lang/String;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/StaticContentFormat$AttachmentsFormat;", "", "limit", "", "timestamp", "Lcom/salesforce/android/smi/network/api/rest/QueryDirection;", "direction", "", "forceRefresh", "Lkotlinx/coroutines/flow/Flow;", "", "conversationEntriesFlow", "(ILjava/lang/Long;Lcom/salesforce/android/smi/network/api/rest/QueryDirection;Z)Lkotlinx/coroutines/flow/Flow;", "sendMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendFile", "conversationEntry", "retryEntry", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendTypingEvent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "Lcom/salesforce/android/smi/network/data/domain/conversation/Conversation;", "currentConversation", "Ljava/util/UUID;", "getConversationId", "()Ljava/util/UUID;", "Lcom/salesforce/android/smi/remote/internal/api/rest/RestService;", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationRepository;", "Lcom/salesforce/android/smi/core/internal/data/repository/ConversationEntryRepository;", "Lcom/salesforce/android/smi/core/internal/data/remote/ReadAcknowledger;", "Lcom/salesforce/android/smi/core/internal/util/ConversationEntryFactory;", "conversation", "Lkotlinx/coroutines/flow/Flow;", "getConversation", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/salesforce/android/smi/core/events/CoreEvent$ConversationEvent;", "events", "getEvents", "cachedConversationResult", "Lcom/salesforce/android/smi/common/api/Result;", "core_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InternalConversationClient implements ConversationClient {
    private Result<? extends Conversation> cachedConversationResult;
    private final Flow<Result<Conversation>> conversation;
    private final ConversationEntryFactory conversationEntryFactory;
    private final ConversationEntryRepository conversationEntryRepository;
    private final UUID conversationId;
    private final ConversationRepository conversationRepository;
    private final Flow<CoreEvent.ConversationEvent> events;
    private final ReadAcknowledger readAcknowledger;
    private final RestService restService;

    /* compiled from: InternalConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient", m3645f = "InternalConversationClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m3647m = "currentConversation")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$currentConversation$1 */
    static final class C420711 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420711(Continuation<? super C420711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalConversationClient.this.currentConversation(this);
        }
    }

    /* compiled from: InternalConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient", m3645f = "InternalConversationClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "markAsRead")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$markAsRead$1 */
    static final class C420721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C420721(Continuation<? super C420721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalConversationClient.this.markAsRead(null, this);
        }
    }

    /* compiled from: InternalConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient", m3645f = "InternalConversationClient.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "sendAttachment")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$sendAttachment$1 */
    static final class C420731 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420731(Continuation<? super C420731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalConversationClient.this.sendAttachment(null, null, this);
        }
    }

    /* compiled from: InternalConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient", m3645f = "InternalConversationClient.kt", m3646l = {97}, m3647m = "sendFile")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$sendFile$1 */
    static final class C420741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C420741(Continuation<? super C420741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalConversationClient.this.sendFile(null, null, this);
        }
    }

    /* compiled from: InternalConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient", m3645f = "InternalConversationClient.kt", m3646l = {84}, m3647m = "sendMessage")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$sendMessage$1 */
    static final class C420751 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420751(Continuation<? super C420751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalConversationClient.this.sendMessage(null, this);
        }
    }

    /* compiled from: InternalConversationClient.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient", m3645f = "InternalConversationClient.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "sendTypingEvent")
    /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$sendTypingEvent$1 */
    static final class C420761 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C420761(Continuation<? super C420761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InternalConversationClient.this.sendTypingEvent(this);
        }
    }

    public InternalConversationClient(UUID conversationId, RestService restService, ConversationRepository conversationRepository, ConversationEntryRepository conversationEntryRepository, ReadAcknowledger readAcknowledger, ConversationEntryFactory conversationEntryFactory, final SharedFlow<? extends CoreEvent> coreEvents) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(restService, "restService");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(conversationEntryRepository, "conversationEntryRepository");
        Intrinsics.checkNotNullParameter(readAcknowledger, "readAcknowledger");
        Intrinsics.checkNotNullParameter(conversationEntryFactory, "conversationEntryFactory");
        Intrinsics.checkNotNullParameter(coreEvents, "coreEvents");
        this.conversationId = conversationId;
        this.restService = restService;
        this.conversationRepository = conversationRepository;
        this.conversationEntryRepository = conversationEntryRepository;
        this.readAcknowledger = readAcknowledger;
        this.conversationEntryFactory = conversationEntryFactory;
        this.conversation = ConversationRepository.getConversationFlow$default(conversationRepository, getConversationId(), false, 2, null);
        final Flow<Object> flow = new Flow<Object>() { // from class: com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filterIsInstance$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filterIsInstance$1$2 */
            public static final class C420702<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filterIsInstance$1$2", m3645f = "InternalConversationClient.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C420702.this.emit(null, this);
                    }
                }

                public C420702(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (obj instanceof CoreEvent.ConversationEvent) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object objCollect = coreEvents.collect(new C420702(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.events = new Flow<CoreEvent.ConversationEvent>() { // from class: com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filter$1$2 */
            public static final class C420692<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ InternalConversationClient this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filter$1$2", m3645f = "InternalConversationClient.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.salesforce.android.smi.core.internal.InternalConversationClient$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C420692.this.emit(null, this);
                    }
                }

                public C420692(FlowCollector flowCollector, InternalConversationClient internalConversationClient) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = internalConversationClient;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (Intrinsics.areEqual(((CoreEvent.ConversationEvent) obj).getConversationId(), this.this$0.getConversationId())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CoreEvent.ConversationEvent> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C420692(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.cachedConversationResult = Result.Empty.INSTANCE;
    }

    public UUID getConversationId() {
        return this.conversationId;
    }

    @Override // com.salesforce.android.smi.core.ConversationClient
    public Flow<CoreEvent.ConversationEvent> getEvents() {
        return this.events;
    }

    @Override // com.salesforce.android.smi.core.ConversationClient
    public Flow<Result<List<ConversationEntry>>> conversationEntriesFlow(int limit, Long timestamp, QueryDirection direction, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return this.conversationEntryRepository.getConversationEntriesFlow(getConversationId(), limit, timestamp, direction, forceRefresh);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.salesforce.android.smi.core.ConversationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendMessage(String str, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C420751 c420751;
        InternalConversationClient internalConversationClient;
        if (continuation instanceof C420751) {
            c420751 = (C420751) continuation;
            int i = c420751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420751.label = i - Integer.MIN_VALUE;
            } else {
                c420751 = new C420751(continuation);
            }
        }
        Object objAddConversationEntry = c420751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAddConversationEntry);
            boolean zIsBlank = StringsKt.isBlank(str);
            if (!(!zIsBlank)) {
                if (!zIsBlank) {
                    throw new NoWhenBranchMatchedException();
                }
                return new Result.Error(new Exception("Message cannot be blank"));
            }
            CoreConversationEntry coreConversationEntryCreateStaticContentTextMessage$default = ConversationEntryFactory.createStaticContentTextMessage$default(this.conversationEntryFactory, getConversationId(), str, null, null, null, 28, null);
            ConversationEntryRepository conversationEntryRepository = this.conversationEntryRepository;
            c420751.L$0 = this;
            c420751.label = 1;
            objAddConversationEntry = conversationEntryRepository.addConversationEntry(coreConversationEntryCreateStaticContentTextMessage$default, c420751);
            if (objAddConversationEntry == coroutine_suspended) {
                return coroutine_suspended;
            }
            internalConversationClient = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            internalConversationClient = (InternalConversationClient) c420751.L$0;
            ResultKt.throwOnFailure(objAddConversationEntry);
        }
        Result result = (Result) objAddConversationEntry;
        internalConversationClient.restService.resetTypingThrottle();
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.salesforce.android.smi.core.ConversationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendFile(File file, String str, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C420741 c420741;
        if (continuation instanceof C420741) {
            c420741 = (C420741) continuation;
            int i = c420741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420741.label = i - Integer.MIN_VALUE;
            } else {
                c420741 = new C420741(continuation);
            }
        }
        Object objSendAttachment = c420741.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420741.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendAttachment);
                c420741.label = 1;
                objSendAttachment = sendAttachment(file, str, c420741);
                if (objSendAttachment == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendAttachment);
            }
            return (Result) objSendAttachment;
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r6 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.salesforce.android.smi.core.ConversationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendTypingEvent(Continuation<? super Result<Unit>> continuation) {
        C420761 c420761;
        InternalConversationClient internalConversationClient;
        if (continuation instanceof C420761) {
            c420761 = (C420761) continuation;
            int i = c420761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420761.label = i - Integer.MIN_VALUE;
            } else {
                c420761 = new C420761(continuation);
            }
        }
        Object objCurrentConversation = c420761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420761.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCurrentConversation);
                c420761.L$0 = this;
                c420761.label = 1;
                objCurrentConversation = currentConversation(c420761);
                if (objCurrentConversation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                internalConversationClient = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objCurrentConversation);
                    return (Result) objCurrentConversation;
                }
                internalConversationClient = (InternalConversationClient) c420761.L$0;
                ResultKt.throwOnFailure(objCurrentConversation);
            }
            if (((Conversation) objCurrentConversation) != null) {
                RestService restService = internalConversationClient.restService;
                UUID conversationId = internalConversationClient.getConversationId();
                c420761.L$0 = null;
                c420761.label = 2;
                objCurrentConversation = restService.sendTypingEvent(conversationId, c420761);
            } else {
                return new Result.Error(new Exception("Conversation must be started first. Send a message to start a conversation."));
            }
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.salesforce.android.smi.core.ConversationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsRead(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C420721 c420721;
        InternalConversationClient internalConversationClient;
        if (continuation instanceof C420721) {
            c420721 = (C420721) continuation;
            int i = c420721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420721.label = i - Integer.MIN_VALUE;
            } else {
                c420721 = new C420721(continuation);
            }
        }
        Object objCurrentConversation = c420721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420721.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCurrentConversation);
                if (Intrinsics.areEqual(conversationEntry.getConversationId(), getConversationId())) {
                    c420721.L$0 = this;
                    c420721.L$1 = conversationEntry;
                    c420721.label = 1;
                    objCurrentConversation = currentConversation(c420721);
                    if (objCurrentConversation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    internalConversationClient = this;
                } else {
                    return new Result.Error(new Exception("Provided conversation entry belongs to a different conversation."));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objCurrentConversation);
                    return (Result) objCurrentConversation;
                }
                conversationEntry = (ConversationEntry) c420721.L$1;
                internalConversationClient = (InternalConversationClient) c420721.L$0;
                ResultKt.throwOnFailure(objCurrentConversation);
            }
            if (((Conversation) objCurrentConversation) != null) {
                ReadAcknowledger readAcknowledger = internalConversationClient.readAcknowledger;
                c420721.L$0 = null;
                c420721.L$1 = null;
                c420721.label = 2;
                objCurrentConversation = readAcknowledger.markAsRead(conversationEntry, c420721);
            } else {
                return new Result.Error(new Exception("Conversation must be started first. Send a message to start a conversation."));
            }
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object currentConversation(Continuation<? super Conversation> continuation) {
        C420711 c420711;
        InternalConversationClient internalConversationClient;
        if (continuation instanceof C420711) {
            c420711 = (C420711) continuation;
            int i = c420711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420711.label = i - Integer.MIN_VALUE;
            } else {
                c420711 = new C420711(continuation);
            }
        }
        C420711 c4207112 = c420711;
        Object conversation$default = c4207112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4207112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(conversation$default);
            Result<? extends Conversation> result = this.cachedConversationResult;
            if (result instanceof Result.Success) {
                return (Conversation) ((Result.Success) result).getData();
            }
            ConversationRepository conversationRepository = this.conversationRepository;
            UUID conversationId = getConversationId();
            c4207112.L$0 = this;
            c4207112.label = 1;
            conversation$default = ConversationRepository.getConversation$default(conversationRepository, conversationId, false, c4207112, 2, null);
            if (conversation$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            internalConversationClient = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            internalConversationClient = (InternalConversationClient) c4207112.L$0;
            ResultKt.throwOnFailure(conversation$default);
        }
        Result<? extends Conversation> result2 = (Result) conversation$default;
        internalConversationClient.cachedConversationResult = result2;
        Result.Success success = result2 instanceof Result.Success ? (Result.Success) result2 : null;
        if (success != null) {
            return (Conversation) success.getData();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAttachment(File file, String str, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        C420731 c420731;
        InternalConversationClient internalConversationClient;
        if (continuation instanceof C420731) {
            c420731 = (C420731) continuation;
            int i = c420731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c420731.label = i - Integer.MIN_VALUE;
            } else {
                c420731 = new C420731(continuation);
            }
        }
        Object objAddConversationEntry = c420731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c420731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAddConversationEntry);
            CoreConversationEntry coreConversationEntryCreateAttachment$default = ConversationEntryFactory.createAttachment$default(this.conversationEntryFactory, getConversationId(), getAttachmentsFormat(file, str), null, 4, null);
            ConversationEntryRepository conversationEntryRepository = this.conversationEntryRepository;
            c420731.L$0 = this;
            c420731.label = 1;
            objAddConversationEntry = conversationEntryRepository.addConversationEntry(coreConversationEntryCreateAttachment$default, c420731);
            if (objAddConversationEntry == coroutine_suspended) {
                return coroutine_suspended;
            }
            internalConversationClient = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            internalConversationClient = (InternalConversationClient) c420731.L$0;
            ResultKt.throwOnFailure(objAddConversationEntry);
        }
        internalConversationClient.restService.resetTypingThrottle();
        return objAddConversationEntry;
    }

    @Override // com.salesforce.android.smi.core.ConversationClient
    public Object retryEntry(ConversationEntry conversationEntry, Continuation<? super Result<? extends ConversationEntry>> continuation) {
        if (Intrinsics.areEqual(conversationEntry.getConversationId(), getConversationId())) {
            return this.conversationEntryRepository.resendConversationEntry(conversationEntry, continuation);
        }
        return new Result.Error(new Exception("Provided conversation entry belongs to a different conversation."));
    }

    private final StaticContentFormat.AttachmentsFormat getAttachmentsFormat(File file, String text) {
        FileAsset unknownAsset;
        FileUtil fileUtil = FileUtil.INSTANCE;
        String mimeType = fileUtil.getMimeType(file);
        if (fileUtil.isImage(mimeType)) {
            unknownAsset = new FileAsset.ImageAsset(file);
            unknownAsset.setFile(file);
        } else if (fileUtil.isPdf(mimeType)) {
            unknownAsset = new FileAsset.PdfAsset(file);
            unknownAsset.setFile(file);
        } else {
            unknownAsset = new FileAsset.UnknownAsset(file);
        }
        return new StaticContentFormat.AttachmentsFormat(text, CollectionsKt.listOf(unknownAsset));
    }
}
