package com.robinhood.store.supportchat.salesforce;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.supportchat.SalesforceChatTokenManager;
import com.robinhood.android.api.supportchat.SalesforceChatTokenRefresher;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.models.supportchat.p353db.SocketChatMessage3;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.models.chat.common.UnsentInputStatus;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.store.chat.common.InFlightMessageStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.supportchat.AgentChatEvent;
import com.robinhood.store.supportchat.AgentChatSession;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.core.ConversationClient;
import com.salesforce.android.smi.core.CoreClient;
import com.salesforce.android.smi.core.events.CoreEvent;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntry;
import com.salesforce.android.smi.network.data.domain.conversationEntry.ConversationEntryStatus;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.ConversationEntryType;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.EntryPayload;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Instant;

/* compiled from: SalesforceChatStore.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XBK\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0%2\u0006\u0010&\u001a\u00020\u001bH\u0001¢\u0006\u0002\b'J\u000e\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u001bJ\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020+0%2\u0006\u0010,\u001a\u00020\u001cH\u0001¢\u0006\u0002\b-J#\u0010.\u001a\b\u0012\u0004\u0012\u00020/0%2\u0006\u0010,\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001bH\u0001¢\u0006\u0002\b1J*\u00102\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00105\u001a\u00020#H\u0082@¢\u0006\u0002\u00106J\u0014\u00107\u001a\u000208*\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u0014\u0010<\u001a\u00020=*\u0002032\u0006\u0010>\u001a\u000208H\u0002J\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0%2\u0006\u0010,\u001a\u00020\u001cJ\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020B0%2\u0006\u00100\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001bJ\u0014\u0010C\u001a\b\u0012\u0004\u0012\u0002030%2\u0006\u0010&\u001a\u00020\u001bJ\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020E0%2\u0006\u0010&\u001a\u00020\u001bJ\u0016\u0010F\u001a\u00020)2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020\"J\u0016\u0010H\u001a\u00020)2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020JJ\u0016\u0010K\u001a\u00020)2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\"J\u000e\u0010M\u001a\u00020)2\u0006\u0010&\u001a\u00020\u001bJ\u0011\u0010N\u001a\u00020O*\u00020PH\u0000¢\u0006\u0002\bQJ\u001c\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0S0%2\u0006\u0010,\u001a\u00020\u001cH\u0002J\u001c\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0S0%2\u0006\u0010,\u001a\u00020\u001cH\u0002J\f\u0010U\u001a\u00020;*\u000209H\u0002J\f\u0010V\u001a\u00020;*\u000209H\u0002J\f\u0010W\u001a\u00020;*\u000209H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00170\u001a8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "coreClientFactory", "Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;", "tokenRefresher", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenRefresher;", "tokenManager", "Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "inFlightMessageStore", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/store/supportchat/salesforce/SalesforceCoreClientFactory;Lcom/robinhood/android/api/supportchat/SalesforceChatTokenRefresher;Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;Lcom/robinhood/android/bitmap/BitmapStore;Landroid/content/Context;)V", "coreClientStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "coreClientFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/salesforce/android/smi/core/CoreClient;", "conversationClients", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "Lcom/salesforce/android/smi/core/ConversationClient;", "getConversationClients$lib_store_support_chat_externalRelease$annotations", "()V", "getConversationClients$lib_store_support_chat_externalRelease", "()Ljava/util/concurrent/ConcurrentHashMap;", "errorMessageEntries", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;", "streamConversationClient", "Lkotlinx/coroutines/flow/Flow;", "conversationId", "streamConversationClient$lib_store_support_chat_externalRelease", "sendTypingStatus", "Lkotlinx/coroutines/Job;", "streamTypingStatus", "Lcom/robinhood/store/supportchat/AgentChatEvent$Typing;", "client", "streamTypingStatus$lib_store_support_chat_externalRelease", "streamPaginatedMessages", "Lcom/robinhood/store/supportchat/AgentChatEvent$Message;", "inquiryId", "streamPaginatedMessages$lib_store_support_chat_externalRelease", "differentiateFailedUserMessage", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "message", "messageSourceEntry", "(Ljava/util/UUID;Lcom/robinhood/models/supportchat/db/SocketChatMessage;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUnsentInputStatus", "Lcom/robinhood/shared/models/chat/common/UnsentInputStatus;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/ConversationEntryStatus;", "isResending", "", "toUnsentInput", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "status", "streamLastAgentReadMessageMetadata", "Lcom/robinhood/store/supportchat/AgentChatEvent$LastAgentReadMessageData;", "streamAgentChatSession", "Lcom/robinhood/store/supportchat/AgentChatSession;", "streamPreviewMessage", "streamUnreadMessageCount", "", "sendTextMessage", "inputText", "sendImageMessage", "imageFile", "Ljava/io/File;", "resendAnyMessage", "entryId", "markAllMessagesRead", "handleError", "", "", "handleError$lib_store_support_chat_externalRelease", "streamMessageEntries", "", "streamGenericEntries", "isSent", "isSentAndUnread", "isRead", "Companion", "lib-store-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SalesforceChatStore extends Store {
    public static final long INSTANCE_TTL_MS = 3000;
    private final Context appContext;
    private final AuthManager authManager;
    private final BitmapStore bitmapStore;
    private final ConcurrentHashMap<UUID, SharedFlow<ConversationClient>> conversationClients;
    private final SalesforceCoreClientFactory coreClientFactory;
    private final SharedFlow<CoreClient> coreClientFlow;
    private final AtomicBoolean coreClientStarted;
    private final ConcurrentHashMap<String, ConversationEntry> errorMessageEntries;
    private final InFlightMessageStore inFlightMessageStore;
    private final SalesforceChatTokenManager tokenManager;
    private final SalesforceChatTokenRefresher tokenRefresher;

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConversationEntryType.values().length];
            try {
                iArr[ConversationEntryType.TypingStartedIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversationEntryType.TypingStoppedIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConversationEntryStatus.values().length];
            try {
                iArr2[ConversationEntryStatus.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ConversationEntryStatus.Sending.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ConversationEntryStatus.Delivered.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ConversationEntryStatus.Read.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ConversationEntryStatus.Sent.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ConversationEntryStatus.PreconditionFailedError.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore", m3645f = "SalesforceChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 255}, m3647m = "differentiateFailedUserMessage")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$differentiateFailedUserMessage$1 */
    static final class C416251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C416251(Continuation<? super C416251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SalesforceChatStore.this.differentiateFailedUserMessage(null, null, null, this);
        }
    }

    /* renamed from: getConversationClients$lib_store_support_chat_externalRelease$annotations */
    public static /* synthetic */ void m2965x3989aed2() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SalesforceChatStore(StoreBundle storeBundle, SalesforceCoreClientFactory coreClientFactory, SalesforceChatTokenRefresher tokenRefresher, SalesforceChatTokenManager tokenManager, AuthManager authManager, InFlightMessageStore inFlightMessageStore, BitmapStore bitmapStore, Context appContext) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(coreClientFactory, "coreClientFactory");
        Intrinsics.checkNotNullParameter(tokenRefresher, "tokenRefresher");
        Intrinsics.checkNotNullParameter(tokenManager, "tokenManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.coreClientFactory = coreClientFactory;
        this.tokenRefresher = tokenRefresher;
        this.tokenManager = tokenManager;
        this.authManager = authManager;
        this.inFlightMessageStore = inFlightMessageStore;
        this.bitmapStore = bitmapStore;
        this.appContext = appContext;
        this.coreClientStarted = new AtomicBoolean(false);
        this.coreClientFlow = FlowKt.shareIn(FlowKt.callbackFlow(new SalesforceChatStore2(this, null)), getStoreScope(), SharingStarted.INSTANCE.WhileSubscribed(3000L, 0L), 1);
        this.conversationClients = new ConcurrentHashMap<>();
        this.errorMessageEntries = new ConcurrentHashMap<>();
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C416241(null), 3, null);
    }

    public final ConcurrentHashMap<UUID, SharedFlow<ConversationClient>> getConversationClients$lib_store_support_chat_externalRelease() {
        return this.conversationClients;
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$1", m3645f = "SalesforceChatStore.kt", m3646l = {136}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$1 */
    static final class C416241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C416241(Continuation<? super C416241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SalesforceChatStore.this.new C416241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> loggedInStateFlow = SalesforceChatStore.this.authManager.getLoggedInStateFlow();
                final SalesforceChatStore salesforceChatStore = SalesforceChatStore.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (!z) {
                            salesforceChatStore.tokenManager.invalidateToken();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (loggedInStateFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final Flow<ConversationClient> streamConversationClient$lib_store_support_chat_externalRelease(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return FlowKt.transformLatest(this.coreClientFlow, new C41611x49d235d6(null, this, conversationId));
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$sendTypingStatus$1", m3645f = "SalesforceChatStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.f2773x8d9721ad}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$sendTypingStatus$1 */
    static final class C416301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C416301(UUID uuid, Continuation<? super C416301> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SalesforceChatStore.this.new C416301(this.$conversationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        
            if (((com.salesforce.android.smi.core.ConversationClient) r5).sendTypingEvent(r4) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                SalesforceChatStore.this.handleError$lib_store_support_chat_externalRelease(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ConversationClient> flowStreamConversationClient$lib_store_support_chat_externalRelease = SalesforceChatStore.this.streamConversationClient$lib_store_support_chat_externalRelease(this.$conversationId);
                this.label = 1;
                obj = FlowKt.first(flowStreamConversationClient$lib_store_support_chat_externalRelease, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }
    }

    public final Job sendTypingStatus(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C416301(conversationId, null), 3, null);
    }

    public final Flow<AgentChatEvent.Typing> streamTypingStatus$lib_store_support_chat_externalRelease(ConversationClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        final Flow<CoreEvent.ConversationEvent> events = client.getEvents();
        final Flow<Object> flow = new Flow<Object>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$filterIsInstance$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object objCollect = events.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$filterIsInstance$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
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
                        if (obj instanceof CoreEvent.ConversationEvent.ProgressIndicator) {
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
        };
        return new Flow<AgentChatEvent.Typing>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AgentChatEvent.Typing> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C416212(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$mapNotNull$1$2 */
            public static final class C416212<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$mapNotNull$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {56}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamTypingStatus$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416212.this.emit(null, this);
                    }
                }

                public C416212(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    AgentChatEvent.Typing typing;
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
                        int i3 = SalesforceChatStore.WhenMappings.$EnumSwitchMapping$0[((CoreEvent.ConversationEvent.ProgressIndicator) obj).getConversationEntry().getEntryType().ordinal()];
                        if (i3 == 1) {
                            typing = new AgentChatEvent.Typing(true);
                        } else {
                            typing = i3 != 2 ? null : new AgentChatEvent.Typing(false);
                        }
                        if (typing != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(typing, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final Flow<AgentChatEvent.Message> streamPaginatedMessages$lib_store_support_chat_externalRelease(ConversationClient client, final UUID inquiryId) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        final Flow<List<ConversationEntry>> flowStreamGenericEntries = streamGenericEntries(client);
        return new Flow<AgentChatEvent.Message>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPaginatedMessages$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AgentChatEvent.Message> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamGenericEntries.collect(new C416172(flowCollector, this, inquiryId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPaginatedMessages$$inlined$map$1$2 */
            public static final class C416172<T> implements FlowCollector {
                final /* synthetic */ UUID $inquiryId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SalesforceChatStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPaginatedMessages$$inlined$map$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {63, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamPaginatedMessages$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416172.this.emit(null, this);
                    }
                }

                public C416172(FlowCollector flowCollector, SalesforceChatStore salesforceChatStore, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = salesforceChatStore;
                    this.$inquiryId$inlined = uuid;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
                
                    if (r12 == r1) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
                
                    if (r5.emit(r11, r0) == r1) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0082 -> B:22:0x0085). Please report as a decompilation issue!!! */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Collection arrayList;
                    Iterator<T> it;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object objDifferentiateFailedUserMessage = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(objDifferentiateFailedUserMessage);
                        FlowCollector flowCollector2 = this.$this_unsafeFlow;
                        arrayList = new ArrayList();
                        it = ((List) obj).iterator();
                        flowCollector = flowCollector2;
                        if (it.hasNext()) {
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objDifferentiateFailedUserMessage);
                        return Unit.INSTANCE;
                    }
                    it = (Iterator) anonymousClass1.L$2;
                    arrayList = (Collection) anonymousClass1.L$1;
                    flowCollector = (FlowCollector) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(objDifferentiateFailedUserMessage);
                    SocketChatMessage socketChatMessage = (SocketChatMessage) objDifferentiateFailedUserMessage;
                    if (socketChatMessage != null) {
                        arrayList.add(socketChatMessage);
                    }
                    if (it.hasNext()) {
                        AgentChatEvent.Message message = new AgentChatEvent.Message((List) arrayList);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.label = 2;
                    } else {
                        ConversationEntry conversationEntry = (ConversationEntry) it.next();
                        SalesforceChatStore salesforceChatStore = this.this$0;
                        UUID uuid = this.$inquiryId$inlined;
                        SocketChatMessage uiModel = SalesforceMessages.toUiModel(conversationEntry, salesforceChatStore.appContext, this.this$0.bitmapStore);
                        anonymousClass1.L$0 = flowCollector;
                        anonymousClass1.L$1 = arrayList;
                        anonymousClass1.L$2 = it;
                        anonymousClass1.label = 1;
                        objDifferentiateFailedUserMessage = salesforceChatStore.differentiateFailedUserMessage(uuid, uiModel, conversationEntry, anonymousClass1);
                    }
                    return coroutine_suspended;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (r10.removeMessage(r8, r11, r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r2.addMessage(r8, r11, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object differentiateFailedUserMessage(UUID uuid, SocketChatMessage socketChatMessage, ConversationEntry conversationEntry, Continuation<? super SocketChatMessage> continuation) {
        C416251 c416251;
        if (continuation instanceof C416251) {
            c416251 = (C416251) continuation;
            int i = c416251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c416251.label = i - Integer.MIN_VALUE;
            } else {
                c416251 = new C416251(continuation);
            }
        }
        Object obj = c416251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c416251.label;
        if (i2 != 0) {
            if (i2 == 1) {
                conversationEntry = (ConversationEntry) c416251.L$1;
                socketChatMessage = (SocketChatMessage) c416251.L$0;
                ResultKt.throwOnFailure(obj);
                this.errorMessageEntries.put(socketChatMessage.getMessageSid(), conversationEntry);
                return null;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            socketChatMessage = (SocketChatMessage) c416251.L$0;
            ResultKt.throwOnFailure(obj);
            this.errorMessageEntries.remove(socketChatMessage.getMessageSid());
            return socketChatMessage;
        }
        ResultKt.throwOnFailure(obj);
        if (socketChatMessage == null) {
            return null;
        }
        if (socketChatMessage.getSenderType() != ParticipantType.USER) {
            return socketChatMessage;
        }
        ConversationEntryStatus status = conversationEntry.getStatus();
        int i3 = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
        if (i3 == 1 || i3 == 2) {
            InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore;
            UnsentInput unsentInput = toUnsentInput(socketChatMessage, toUnsentInputStatus(status, conversationEntry.getError() != null));
            c416251.L$0 = socketChatMessage;
            c416251.L$1 = conversationEntry;
            c416251.label = 1;
        } else if (i3 == 3 || i3 == 4 || i3 == 5) {
            InFlightMessageStore inFlightMessageStore2 = this.inFlightMessageStore;
            String messageSid = socketChatMessage.getMessageSid();
            c416251.L$0 = socketChatMessage;
            c416251.label = 2;
        } else {
            throw new IllegalStateException(("Unsupported status: " + status).toString());
        }
        return coroutine_suspended;
    }

    private final UnsentInputStatus toUnsentInputStatus(ConversationEntryStatus conversationEntryStatus, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$1[conversationEntryStatus.ordinal()];
        if (i == 1) {
            return UnsentInputStatus.FAILED;
        }
        if (i == 2) {
            if (z) {
                return UnsentInputStatus.RESENDING;
            }
            return UnsentInputStatus.SENDING;
        }
        if (i == 3 || i == 4 || i == 5) {
            throw new IllegalStateException("Should not be called for Sent status");
        }
        throw new IllegalStateException(("Unsupported status: " + conversationEntryStatus).toString());
    }

    private final UnsentInput toUnsentInput(SocketChatMessage socketChatMessage, UnsentInputStatus unsentInputStatus) {
        SocketChatMessage3 data = socketChatMessage.getAttributes().getData();
        if (data instanceof SocketChatMessage3.Text) {
            return new UnsentInput.Text(socketChatMessage.getMessageSid(), unsentInputStatus, socketChatMessage.getDateCreated(), socketChatMessage.getBody());
        }
        if (data instanceof SocketChatMessage3.Image) {
            SocketChatMessage3.Image image = (SocketChatMessage3.Image) data;
            return new UnsentInput.Image(socketChatMessage.getMessageSid(), unsentInputStatus, socketChatMessage.getDateCreated(), null, image.getExtraInfo().getOriginalWidth(), image.getExtraInfo().getOriginalHeight(), image.getExtraInfo().getDocumentUri());
        }
        throw new IllegalArgumentException("Unsupported message type: " + data + " for error user message");
    }

    public final Flow<AgentChatEvent.LastAgentReadMessageData> streamLastAgentReadMessageMetadata(ConversationClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        final Flow<List<ConversationEntry>> flowStreamGenericEntries = streamGenericEntries(client);
        return new Flow<AgentChatEvent.LastAgentReadMessageData>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamLastAgentReadMessageMetadata$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super AgentChatEvent.LastAgentReadMessageData> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamGenericEntries.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamLastAgentReadMessageMetadata$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamLastAgentReadMessageMetadata$$inlined$mapNotNull$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {57}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamLastAgentReadMessageMetadata$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r2v1, types: [com.robinhood.store.supportchat.AgentChatEvent$LastAgentReadMessageData] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    T lastAgentReadMessageData;
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
                        ConversationEntry conversationEntryLastReadEntryOrNull = SalesforceMessages.lastReadEntryOrNull((List) obj);
                        if (conversationEntryLastReadEntryOrNull == null) {
                            lastAgentReadMessageData = null;
                        } else {
                            long timestamp = conversationEntryLastReadEntryOrNull.getTimestamp();
                            Instant instantOfEpochMilli = Instant.ofEpochMilli(conversationEntryLastReadEntryOrNull.getTimestamp());
                            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
                            lastAgentReadMessageData = new AgentChatEvent.LastAgentReadMessageData(timestamp, instantOfEpochMilli);
                        }
                        if (lastAgentReadMessageData != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(lastAgentReadMessageData, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    public final Flow<AgentChatSession> streamAgentChatSession(UUID inquiryId, UUID conversationId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return FlowKt.scan(FlowKt.transformLatest(streamConversationClient$lib_store_support_chat_externalRelease(conversationId), new C41610x7599d80b(null, this, inquiryId)), new AgentChatSession(null, false, null, null, null, 31, null), new C416312(null));
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/store/supportchat/AgentChatSession;", "previousSession", "newEvent", "Lcom/robinhood/store/supportchat/AgentChatEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamAgentChatSession$2", m3645f = "SalesforceChatStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamAgentChatSession$2 */
    static final class C416312 extends ContinuationImpl7 implements Function3<AgentChatSession, AgentChatEvent, Continuation<? super AgentChatSession>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C416312(Continuation<? super C416312> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(AgentChatSession agentChatSession, AgentChatEvent agentChatEvent, Continuation<? super AgentChatSession> continuation) {
            C416312 c416312 = new C416312(continuation);
            c416312.L$0 = agentChatSession;
            c416312.L$1 = agentChatEvent;
            return c416312.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AgentChatSession) this.L$0).accept$lib_store_support_chat_externalRelease((AgentChatEvent) this.L$1);
        }
    }

    public final Flow<SocketChatMessage> streamPreviewMessage(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return FlowKt.transformLatest(streamConversationClient$lib_store_support_chat_externalRelease(conversationId), new C41618xb92e8505(null, this));
    }

    public final Flow<Integer> streamUnreadMessageCount(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return FlowKt.debounce(FlowKt.distinctUntilChanged(FlowKt.transformLatest(streamConversationClient$lib_store_support_chat_externalRelease(conversationId), new C41622x4b8f558d(null, this))), 500L);
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$sendTextMessage$1", m3645f = "SalesforceChatStore.kt", m3646l = {401, 402}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$sendTextMessage$1 */
    static final class C416291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ String $inputText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C416291(UUID uuid, String str, Continuation<? super C416291> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$inputText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SalesforceChatStore.this.new C416291(this.$conversationId, this.$inputText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
        
            if (((com.salesforce.android.smi.core.ConversationClient) r5).sendMessage(r1, r4) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                SalesforceChatStore.this.handleError$lib_store_support_chat_externalRelease(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ConversationClient> flowStreamConversationClient$lib_store_support_chat_externalRelease = SalesforceChatStore.this.streamConversationClient$lib_store_support_chat_externalRelease(this.$conversationId);
                this.label = 1;
                obj = FlowKt.first(flowStreamConversationClient$lib_store_support_chat_externalRelease, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String str = this.$inputText;
            this.label = 2;
        }
    }

    public final Job sendTextMessage(UUID conversationId, String inputText) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C416291(conversationId, inputText, null), 3, null);
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$sendImageMessage$1", m3645f = "SalesforceChatStore.kt", m3646l = {413, 414}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$sendImageMessage$1 */
    static final class C416281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ File $imageFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C416281(UUID uuid, File file, Continuation<? super C416281> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$imageFile = file;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SalesforceChatStore.this.new C416281(this.$conversationId, this.$imageFile, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:30|(1:(4:6|7|28|29)(2:10|11))(1:12))(5:14|33|15|(1:17)|22)|18|19|31|20|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        
            if (com.salesforce.android.smi.core.ConversationClient.DefaultImpls.sendFile$default(r3, r4, null, r6, 2, null) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        
            r0 = th;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            C416281 c416281;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Flow<ConversationClient> flowStreamConversationClient$lib_store_support_chat_externalRelease = SalesforceChatStore.this.streamConversationClient$lib_store_support_chat_externalRelease(this.$conversationId);
                    this.label = 1;
                    obj = FlowKt.first(flowStreamConversationClient$lib_store_support_chat_externalRelease, this);
                    if (obj == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    c416281 = this;
                    th = th;
                    SalesforceChatStore.this.handleError$lib_store_support_chat_externalRelease(th);
                    return Unit.INSTANCE;
                }
            }
            try {
            } catch (Throwable th3) {
                th = th3;
                c416281 = this;
                SalesforceChatStore.this.handleError$lib_store_support_chat_externalRelease(th);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ConversationClient conversationClient = (ConversationClient) obj;
            File file = this.$imageFile;
            this.label = 2;
            c416281 = this;
        }
    }

    public final Job sendImageMessage(UUID conversationId, File imageFile) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(imageFile, "imageFile");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C416281(conversationId, imageFile, null), 3, null);
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$resendAnyMessage$1", m3645f = "SalesforceChatStore.kt", m3646l = {427, 428}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$resendAnyMessage$1 */
    static final class C416271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ String $entryId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C416271(String str, UUID uuid, Continuation<? super C416271> continuation) {
            super(2, continuation);
            this.$entryId = str;
            this.$conversationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SalesforceChatStore.this.new C416271(this.$entryId, this.$conversationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (((com.salesforce.android.smi.core.ConversationClient) r6).retryEntry(r1, r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ConversationEntry conversationEntry;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                SalesforceChatStore.this.handleError$lib_store_support_chat_externalRelease(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                conversationEntry = (ConversationEntry) SalesforceChatStore.this.errorMessageEntries.get(this.$entryId);
                if (conversationEntry == null) {
                    return Unit.INSTANCE;
                }
                Flow<ConversationClient> flowStreamConversationClient$lib_store_support_chat_externalRelease = SalesforceChatStore.this.streamConversationClient$lib_store_support_chat_externalRelease(this.$conversationId);
                this.L$0 = conversationEntry;
                this.label = 1;
                obj = FlowKt.first(flowStreamConversationClient$lib_store_support_chat_externalRelease, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            conversationEntry = (ConversationEntry) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        }
    }

    public final Job resendAnyMessage(UUID conversationId, String entryId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(entryId, "entryId");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C416271(entryId, conversationId, null), 3, null);
    }

    /* compiled from: SalesforceChatStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$markAllMessagesRead$1", m3645f = "SalesforceChatStore.kt", m3646l = {440, 441, 450}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$markAllMessagesRead$1 */
    static final class C416261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C416261(UUID uuid, Continuation<? super C416261> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SalesforceChatStore.this.new C416261(this.$conversationId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:30:0x0069, B:32:0x006f, B:34:0x0081, B:37:0x008e, B:15:0x002c, B:25:0x005c, B:27:0x0060, B:29:0x0063, B:16:0x0030, B:22:0x0048, B:19:0x0037), top: B:43:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:30:0x0069, B:32:0x006f, B:34:0x0081, B:37:0x008e, B:15:0x002c, B:25:0x005c, B:27:0x0060, B:29:0x0063, B:16:0x0030, B:22:0x0048, B:19:0x0037), top: B:43:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:30:0x0069, B:32:0x006f, B:34:0x0081, B:37:0x008e, B:15:0x002c, B:25:0x005c, B:27:0x0060, B:29:0x0063, B:16:0x0030, B:22:0x0048, B:19:0x0037), top: B:43:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ConversationClient conversationClient;
            List list;
            ConversationClient conversationClient2;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                SalesforceChatStore.this.handleError$lib_store_support_chat_externalRelease(th);
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<ConversationClient> flowStreamConversationClient$lib_store_support_chat_externalRelease = SalesforceChatStore.this.streamConversationClient$lib_store_support_chat_externalRelease(this.$conversationId);
                this.label = 1;
                obj = FlowKt.first(flowStreamConversationClient$lib_store_support_chat_externalRelease, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2) {
                    conversationClient = (ConversationClient) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = (List) obj;
                    if (list != null) {
                        return Unit.INSTANCE;
                    }
                    conversationClient2 = conversationClient;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                conversationClient2 = (ConversationClient) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    ConversationEntry conversationEntry = (ConversationEntry) it.next();
                    if (SalesforceMessages.toParticipantType(conversationEntry.getSender()) == ParticipantType.AGENT && !SalesforceChatStore.this.isRead(conversationEntry.getStatus())) {
                        this.L$0 = conversationClient2;
                        this.L$1 = it;
                        this.label = 3;
                        if (conversationClient2.markAsRead(conversationEntry, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            conversationClient = (ConversationClient) obj;
            Flow flowStreamMessageEntries = SalesforceChatStore.this.streamMessageEntries(conversationClient);
            this.L$0 = conversationClient;
            this.label = 2;
            obj = FlowKt.firstOrNull(flowStreamMessageEntries, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) obj;
            if (list != null) {
            }
        }
    }

    public final Job markAllMessagesRead(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C416261(conversationId, null), 3, null);
    }

    public final void handleError$lib_store_support_chat_externalRelease(Throwable th) throws Throwable {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof CancellationException) {
            throw th;
        }
        if (Throwables.isNetworkRelated(th)) {
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<ConversationEntry>> streamMessageEntries(ConversationClient client) {
        final Flow<List<ConversationEntry>> flowStreamGenericEntries = streamGenericEntries(client);
        return new Flow<List<? extends ConversationEntry>>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamMessageEntries$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ConversationEntry>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamGenericEntries.collect(new C416162(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamMessageEntries$$inlined$map$1$2 */
            public static final class C416162<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamMessageEntries$$inlined$map$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamMessageEntries$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416162.this.emit(null, this);
                    }
                }

                public C416162(FlowCollector flowCollector) {
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
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (((ConversationEntry) t).getPayload() instanceof EntryPayload.MessagePayload) {
                                arrayList.add(t);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
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
        };
    }

    private final Flow<List<ConversationEntry>> streamGenericEntries(ConversationClient client) {
        final Flow flowConversationEntriesFlow$default = ConversationClient.DefaultImpls.conversationEntriesFlow$default(client, Integer.MAX_VALUE, null, null, false, 14, null);
        final Flow<List<? extends ConversationEntry>> flow = new Flow<List<? extends ConversationEntry>>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ConversationEntry>> flowCollector, Continuation continuation) {
                Object objCollect = flowConversationEntriesFlow$default.collect(new C416132(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$mapNotNull$1$2 */
            public static final class C416132<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$mapNotNull$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416132.this.emit(null, this);
                    }
                }

                public C416132(FlowCollector flowCollector) {
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
                        Result result = (Result) obj;
                        Result.Success success = result instanceof Result.Success ? (Result.Success) result : null;
                        List list = success != null ? (List) success.getData() : null;
                        if (list != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(list, anonymousClass1) == coroutine_suspended) {
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
        };
        return FlowKt.distinctUntilChanged(new Flow<List<? extends ConversationEntry>>() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ConversationEntry>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C416122(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1$2 */
            public static final class C416122<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1$2", m3645f = "SalesforceChatStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C416122.this.emit(null, this);
                    }
                }

                public C416122(FlowCollector flowCollector) {
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
                        List listSortedWith = CollectionsKt.sortedWith((List) obj, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE (r5v3 'listSortedWith' java.util.List) = 
                              (wrap:java.util.List:0x0036: CHECK_CAST (java.util.List) (r5v0 'obj' java.lang.Object))
                              (wrap:java.util.Comparator:0x003c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1056) call: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$lambda$17$$inlined$sortedBy$1.<init>():void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1056) in method: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes12.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$lambda$17$$inlined$sortedBy$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            boolean r0 = r6 instanceof com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1.C416122.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1$2$1 r0 = (com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1.C416122.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1$2$1 r0 = new com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L4c
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            java.util.List r5 = (java.util.List) r5
                            java.lang.Iterable r5 = (java.lang.Iterable) r5
                            com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$lambda$17$$inlined$sortedBy$1 r2 = new com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$lambda$17$$inlined$sortedBy$1
                            r2.<init>()
                            java.util.List r5 = kotlin.collections.CollectionsKt.sortedWith(r5, r2)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4c
                            return r1
                        L4c:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$streamGenericEntries$$inlined$map$1.C416122.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSent(ConversationEntryStatus conversationEntryStatus) {
            switch (WhenMappings.$EnumSwitchMapping$1[conversationEntryStatus.ordinal()]) {
                case 1:
                case 2:
                case 6:
                    return false;
                case 3:
                case 4:
                case 5:
                    return true;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSentAndUnread(ConversationEntryStatus conversationEntryStatus) {
            switch (WhenMappings.$EnumSwitchMapping$1[conversationEntryStatus.ordinal()]) {
                case 1:
                case 2:
                case 6:
                    return false;
                case 3:
                case 5:
                    return true;
                case 4:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isRead(ConversationEntryStatus conversationEntryStatus) {
            switch (WhenMappings.$EnumSwitchMapping$1[conversationEntryStatus.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                    return false;
                case 4:
                    return true;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
