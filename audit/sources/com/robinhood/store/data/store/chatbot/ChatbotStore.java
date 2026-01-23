package com.robinhood.store.data.store.chatbot;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.chatbot.proto.p285v1.Chatbot;
import com.robinhood.chatbot.proto.p285v1.ConversationMessagesDto;
import com.robinhood.chatbot.proto.p285v1.GetConversationMessagesRequestDto;
import com.robinhood.chatbot.proto.p285v1.MessageTypeDto;
import com.robinhood.chatbot.proto.p285v1.SendMessageRequestAttributesDto;
import com.robinhood.chatbot.proto.p285v1.SendMessageRequestDto;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.api.p306v2.SortingOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.p356v2.ChatbotMessage;
import com.robinhood.models.p355ui.p356v2.ChatbotMessagePage;
import com.robinhood.models.p355ui.p356v2.ChatbotSession;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import com.robinhood.models.p355ui.p356v2.ChatbotTypingState;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.models.chat.common.UnsentInputStatus;
import com.robinhood.shared.models.chat.common.api.ChatTypingStatus;
import com.robinhood.shared.store.chat.common.InFlightMessageStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.http.Headers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: ChatbotStore.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u0010*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b#\u0010\"J\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b$\u0010\"J<\u0010+\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0086@¢\u0006\u0004\b+\u0010,J4\u00100\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020%2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010%H\u0086@¢\u0006\u0004\b0\u00101J(\u00104\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0086@¢\u0006\u0004\b4\u00105J \u00107\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020%H\u0086@¢\u0006\u0004\b7\u00108J4\u0010<\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010:\u001a\u0002092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010%H\u0086@¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u00020?2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010>\u001a\u00020%¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR1\u0010L\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b0Fj\u0002`G0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR-\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010KR,\u0010S\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR,\u0010V\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010T¨\u0006W"}, m3636d2 = {"Lcom/robinhood/store/data/store/chatbot/ChatbotStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "chatbotApi", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "inFlightMessageStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/chatbot/proto/v1/Chatbot;Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;Lj$/time/Clock;)V", "Ljava/util/UUID;", "conversationId", "Lcom/robinhood/models/ui/v2/ChatbotMessagePage;", "responseData", "", "pollingIntervalMs", "", "applyInteractionState", "", "applySessionMutation", "(Ljava/util/UUID;Lcom/robinhood/models/ui/v2/ChatbotMessagePage;Ljava/lang/Long;Z)V", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/chatbot/proto/v1/ConversationMessagesDto;", "getPollingIntervalMs", "(Lcom/robinhood/idl/Response;)Ljava/lang/Long;", "Lcom/robinhood/models/ui/v2/ChatbotSession;", "createDefaultSession", "(Ljava/util/UUID;)Lcom/robinhood/models/ui/v2/ChatbotSession;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/v2/ChatbotMessage;", "streamMessages", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "streamSession", "pollSession", "", "pageOffset", "", "pageSize", "Lcom/robinhood/models/api/v2/SortingOrder;", Card.Icon.ORDER, "fetchMessages", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Integer;Lcom/robinhood/models/api/v2/SortingOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inquiryId", "text", "textLocalId", "sendUserMessage", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;", "row", "sendSelection", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "actionId", "sendCta", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "suggestedResponse", "suggestedResponseLocalId", "sendPickedSuggestedResponse", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "input", "Lkotlinx/coroutines/Job;", "setInputDraft", "(Ljava/util/UUID;Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/chatbot/proto/v1/Chatbot;", "Lcom/robinhood/shared/store/chat/common/InFlightMessageStore;", "Lj$/time/Clock;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/store/data/store/chatbot/ConversationSessions;", "conversationSessions$delegate", "Lkotlin/Lazy;", "getConversationSessions", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "conversationSessions", "pollMessagesIntervalStream$delegate", "getPollMessagesIntervalStream", "pollMessagesIntervalStream", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/idl/Request;", "Lcom/robinhood/chatbot/proto/v1/GetConversationMessagesRequestDto;", "getMessagesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/chatbot/proto/v1/SendMessageRequestDto;", "sendUserMessageEndpoint", "lib-store-chatbot_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ChatbotStore extends Store {
    private final Chatbot chatbotApi;
    private final Clock clock;

    /* renamed from: conversationSessions$delegate, reason: from kotlin metadata */
    private final Lazy conversationSessions;
    private final Endpoint<Request<GetConversationMessagesRequestDto>, Response<ConversationMessagesDto>> getMessagesEndpoint;
    private final InFlightMessageStore inFlightMessageStore;

    /* renamed from: pollMessagesIntervalStream$delegate, reason: from kotlin metadata */
    private final Lazy pollMessagesIntervalStream;
    private final Endpoint<Request<SendMessageRequestDto>, Response<ConversationMessagesDto>> sendUserMessageEndpoint;

    /* compiled from: ChatbotStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore", m3645f = "ChatbotStore.kt", m3646l = {350, 356, 369, 380}, m3647m = "sendPickedSuggestedResponse")
    /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$sendPickedSuggestedResponse$1 */
    static final class C413361 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C413361(Continuation<? super C413361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatbotStore.this.sendPickedSuggestedResponse(null, null, null, null, this);
        }
    }

    /* compiled from: ChatbotStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore", m3645f = "ChatbotStore.kt", m3646l = {283, EnumC7081g.f2777x89a9e432, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m3647m = "sendSelection")
    /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$sendSelection$1 */
    static final class C413371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C413371(Continuation<? super C413371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatbotStore.this.sendSelection(null, null, null, this);
        }
    }

    /* compiled from: ChatbotStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore", m3645f = "ChatbotStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE}, m3647m = "sendUserMessage")
    /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$sendUserMessage$1 */
    static final class C413381 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C413381(Continuation<? super C413381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatbotStore.this.sendUserMessage(null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotStore(StoreBundle storeBundle, Chatbot chatbotApi, InFlightMessageStore inFlightMessageStore, Clock clock) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(chatbotApi, "chatbotApi");
        Intrinsics.checkNotNullParameter(inFlightMessageStore, "inFlightMessageStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.chatbotApi = chatbotApi;
        this.inFlightMessageStore = inFlightMessageStore;
        this.clock = clock;
        this.conversationSessions = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatbotStore.conversationSessions_delegate$lambda$0();
            }
        });
        this.pollMessagesIntervalStream = LazyKt.lazy(new Function0() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChatbotStore.pollMessagesIntervalStream_delegate$lambda$1();
            }
        });
        Endpoint.Companion companion = Endpoint.INSTANCE;
        ChatbotStore2 chatbotStore2 = new ChatbotStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        ChatbotStore3 chatbotStore3 = new ChatbotStore3(this, null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfMillis = Duration.ofMillis(500L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        this.getMessagesEndpoint = companion.createWithParams(chatbotStore2, logoutKillswitch, chatbotStore3, clock2, new DefaultStaleDecider(durationOfMillis, storeBundle.getClock()));
        ChatbotStore4 chatbotStore4 = new ChatbotStore4(this, null);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        ChatbotStore5 chatbotStore5 = new ChatbotStore5(this, null);
        Clock clock3 = storeBundle.getClock();
        Duration durationOfMillis2 = Duration.ofMillis(500L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis2, "ofMillis(...)");
        this.sendUserMessageEndpoint = companion.createWithParams(chatbotStore4, logoutKillswitch2, chatbotStore5, clock3, new DefaultStaleDecider(durationOfMillis2, storeBundle.getClock()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow2<Map<UUID, ChatbotSession>> getConversationSessions() {
        return (StateFlow2) this.conversationSessions.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow2 conversationSessions_delegate$lambda$0() {
        return StateFlow4.MutableStateFlow(MapsKt.emptyMap());
    }

    private final StateFlow2<Map<UUID, Long>> getPollMessagesIntervalStream() {
        return (StateFlow2) this.pollMessagesIntervalStream.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow2 pollMessagesIntervalStream_delegate$lambda$1() {
        return StateFlow4.MutableStateFlow(MapsKt.emptyMap());
    }

    public final Flow<List<ChatbotMessage>> streamMessages(final UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        final StateFlow2<Map<UUID, ChatbotSession>> conversationSessions = getConversationSessions();
        final Flow<ChatbotSession> flow = new Flow<ChatbotSession>() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatbotSession> flowCollector, Continuation continuation) {
                Object objCollect = conversationSessions.collect(new C413342(flowCollector, conversationId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$mapNotNull$1$2 */
            public static final class C413342<T> implements FlowCollector {
                final /* synthetic */ UUID $conversationId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$mapNotNull$1$2", m3645f = "ChatbotStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C413342.this.emit(null, this);
                    }
                }

                public C413342(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$conversationId$inlined = uuid;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$conversationId$inlined);
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
        return new Flow<List<? extends ChatbotMessage>>() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends ChatbotMessage>> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C413332(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$map$1$2 */
            public static final class C413332<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$map$1$2", m3645f = "ChatbotStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$streamMessages$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C413332.this.emit(null, this);
                    }
                }

                public C413332(FlowCollector flowCollector) {
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
                        List<ChatbotMessage> messages = ((ChatbotSession) obj).getMessages();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(messages, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<ChatbotSession> streamSession(final UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        final StateFlow2<Map<UUID, ChatbotSession>> conversationSessions = getConversationSessions();
        return new Flow<ChatbotSession>() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$streamSession$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ChatbotSession> flowCollector, Continuation continuation) {
                Object objCollect = conversationSessions.collect(new C413352(flowCollector, conversationId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$streamSession$$inlined$mapNotNull$1$2 */
            public static final class C413352<T> implements FlowCollector {
                final /* synthetic */ UUID $conversationId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$streamSession$$inlined$mapNotNull$1$2", m3645f = "ChatbotStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$streamSession$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return C413352.this.emit(null, this);
                    }
                }

                public C413352(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$conversationId$inlined = uuid;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$conversationId$inlined);
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<Unit> pollSession(UUID conversationId) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        StateFlow2<Map<UUID, Long>> pollMessagesIntervalStream = getPollMessagesIntervalStream();
        while (!pollMessagesIntervalStream.compareAndSet(pollMessagesIntervalStream.getValue(), MapsKt.emptyMap())) {
        }
        return FlowKt.transformLatest(getPollMessagesIntervalStream(), new ChatbotStore$pollSession$$inlined$flatMapLatest$1(null, conversationId, this));
    }

    public static /* synthetic */ Object fetchMessages$default(ChatbotStore chatbotStore, UUID uuid, String str, Integer num, SortingOrder sortingOrder, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            sortingOrder = null;
        }
        return chatbotStore.fetchMessages(uuid, str, num, sortingOrder, continuation);
    }

    public final Object fetchMessages(UUID uuid, String str, Integer num, SortingOrder sortingOrder, Continuation<? super Unit> continuation) throws NumberFormatException {
        int i;
        String serverValue;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        } else {
            i = 0;
        }
        Endpoint<Request<GetConversationMessagesRequestDto>, Response<ConversationMessagesDto>> endpoint = this.getMessagesEndpoint;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        int iIntValue = num != null ? num.intValue() : 0;
        if (sortingOrder == null || (serverValue = sortingOrder.getServerValue()) == null) {
            serverValue = "";
        }
        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, new Request(new GetConversationMessagesRequestDto(string2, i, iIntValue, serverValue), null, 2, null), null, continuation, 2, null);
        return objForceFetch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objForceFetch$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object sendUserMessage$default(ChatbotStore chatbotStore, UUID uuid, UUID uuid2, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return chatbotStore.sendUserMessage(uuid, uuid2, str, str2, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|59|(1:(1:(3:(1:(1:15)(2:16|17))(2:18|19)|56|57)(3:23|24|43))(1:26))(6:27|(1:29)(1:30)|(1:34)|35|(1:38)|55)|60|39|(2:42|43)|55) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (r0.removeMessage(r5, r2, r8) != r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        r15 = r0;
        r5 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010f, code lost:
    
        if ((r15 instanceof java.util.concurrent.CancellationException) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        if (com.robinhood.utils.extensions.Throwables.isNetworkRelated(r15) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0117, code lost:
    
        com.robinhood.utils.logging.CrashReporter.DefaultImpls.reportNonFatal$default(com.robinhood.utils.logging.CrashReporter.INSTANCE, r15, false, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
    
        r0 = r21.inFlightMessageStore;
        r3 = com.robinhood.shared.models.chat.common.UnsentInputStatus.FAILED;
        r8.L$0 = null;
        r8.L$1 = null;
        r8.L$2 = null;
        r8.L$3 = null;
        r8.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
    
        if (r0.updateMessageStatus(r5, r2, r3, r8) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013c, code lost:
    
        throw r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUserMessage(UUID uuid, UUID uuid2, String str, String str2, Continuation<? super Unit> continuation) throws Throwable {
        C413381 c413381;
        String string2;
        UnsentInputStatus unsentInputStatus;
        UUID uuid3;
        UUID uuid4;
        String str3;
        UUID uuid5;
        String str4;
        String str5 = str;
        if (continuation instanceof C413381) {
            c413381 = (C413381) continuation;
            int i = c413381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413381.label = i - Integer.MIN_VALUE;
            } else {
                c413381 = new C413381(continuation);
            }
        }
        C413381 c4133812 = c413381;
        Object obj = c4133812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4133812.label;
        try {
        } catch (Throwable th) {
            Throwable th2 = th;
            UUID uuid6 = i2;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str2 == null) {
                string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            } else {
                string2 = str2;
            }
            if (str2 == null || (unsentInputStatus = UnsentInputStatus.RESENDING) == null) {
                unsentInputStatus = UnsentInputStatus.SENDING;
            }
            Instant instantNow = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            UnsentInput.Text text = new UnsentInput.Text(string2, unsentInputStatus, instantNow, str5);
            InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore;
            c4133812.L$0 = uuid;
            uuid3 = uuid2;
            c4133812.L$1 = uuid3;
            c4133812.L$2 = str5;
            c4133812.L$3 = string2;
            c4133812.label = 1;
            if (inFlightMessageStore.addMessage(uuid, text, c4133812) != coroutine_suspended) {
                uuid4 = uuid;
                str3 = str5;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            String str6 = (String) c4133812.L$3;
            String str7 = (String) c4133812.L$2;
            UUID uuid7 = (UUID) c4133812.L$1;
            UUID uuid8 = (UUID) c4133812.L$0;
            ResultKt.throwOnFailure(obj);
            string2 = str6;
            str3 = str7;
            uuid3 = uuid7;
            uuid4 = uuid8;
        } else if (i2 == 2) {
            str4 = (String) c4133812.L$1;
            uuid5 = (UUID) c4133812.L$0;
            ResultKt.throwOnFailure(obj);
            InFlightMessageStore inFlightMessageStore2 = this.inFlightMessageStore;
            c4133812.L$0 = uuid5;
            c4133812.L$1 = str4;
            c4133812.label = 3;
        } else {
            if (i2 == 3) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        Endpoint<Request<SendMessageRequestDto>, Response<ConversationMessagesDto>> endpoint = this.sendUserMessageEndpoint;
        String string3 = uuid3.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Request request = new Request(new SendMessageRequestDto(string3, MessageTypeDto.TEXT, new SendMessageRequestAttributesDto(str3, null, 2, null)), null, 2, null);
        c4133812.L$0 = uuid4;
        c4133812.L$1 = string2;
        c4133812.L$2 = null;
        c4133812.L$3 = null;
        c4133812.label = 2;
        if (Endpoint.DefaultImpls.fetch$default(endpoint, request, null, c4133812, 2, null) != coroutine_suspended) {
            uuid5 = uuid4;
            str4 = string2;
            InFlightMessageStore inFlightMessageStore22 = this.inFlightMessageStore;
            c4133812.L$0 = uuid5;
            c4133812.L$1 = str4;
            c4133812.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:54)|(1:(1:(3:(1:(1:15)(2:16|17))(2:18|19)|48|49)(3:23|24|35))(1:26))(3:27|(1:30)|47)|52|31|(2:34|35)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r0.removeMessage(r5, r4, r7) != r3) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        r5 = r13;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        if ((r0 instanceof java.util.concurrent.CancellationException) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011f, code lost:
    
        if (com.robinhood.utils.extensions.Throwables.isNetworkRelated(r0) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0121, code lost:
    
        com.robinhood.utils.logging.CrashReporter.DefaultImpls.reportNonFatal$default(com.robinhood.utils.logging.CrashReporter.INSTANCE, r0, false, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        r0 = r22.inFlightMessageStore;
        r2 = com.robinhood.shared.models.chat.common.UnsentInputStatus.FAILED;
        r7.L$0 = null;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        if (r0.updateMessageStatus(r5, r4, r2, r7) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSelection(UUID uuid, UUID uuid2, SelectionMenuRowModel selectionMenuRowModel, Continuation<? super Unit> continuation) throws Throwable {
        C413371 c413371;
        String string2;
        UUID uuid3;
        SelectionMenuRowModel selectionMenuRowModel2;
        UUID uuid4;
        UUID uuid5;
        String str;
        if (continuation instanceof C413371) {
            c413371 = (C413371) continuation;
            int i = c413371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413371.label = i - Integer.MIN_VALUE;
            } else {
                c413371 = new C413371(continuation);
            }
        }
        C413371 c4133712 = c413371;
        Object obj = c4133712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str2 = c4133712.label;
        UUID uuid6 = "toString(...)";
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (str2 == 0) {
            ResultKt.throwOnFailure(obj);
            string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Instant instantNow = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            UnsentInput.Selection selection = new UnsentInput.Selection(string2, UnsentInputStatus.SENDING, instantNow, selectionMenuRowModel.getId(), selectionMenuRowModel.getTitle(), selectionMenuRowModel.getSubtitle(), selectionMenuRowModel.getIcon(), selectionMenuRowModel.getTrailingContent());
            InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore;
            c4133712.L$0 = uuid;
            uuid3 = uuid2;
            c4133712.L$1 = uuid3;
            selectionMenuRowModel2 = selectionMenuRowModel;
            c4133712.L$2 = selectionMenuRowModel2;
            c4133712.L$3 = string2;
            c4133712.label = 1;
            if (inFlightMessageStore.addMessage(uuid, selection, c4133712) != coroutine_suspended) {
                uuid4 = uuid;
            }
            return coroutine_suspended;
        }
        if (str2 == 1) {
            String str3 = (String) c4133712.L$3;
            SelectionMenuRowModel selectionMenuRowModel3 = (SelectionMenuRowModel) c4133712.L$2;
            UUID uuid7 = (UUID) c4133712.L$1;
            uuid4 = (UUID) c4133712.L$0;
            ResultKt.throwOnFailure(obj);
            selectionMenuRowModel2 = selectionMenuRowModel3;
            uuid3 = uuid7;
            string2 = str3;
        } else if (str2 == 2) {
            str = (String) c4133712.L$1;
            uuid5 = (UUID) c4133712.L$0;
            ResultKt.throwOnFailure(obj);
            InFlightMessageStore inFlightMessageStore2 = this.inFlightMessageStore;
            c4133712.L$0 = uuid5;
            c4133712.L$1 = str;
            c4133712.label = 3;
        } else {
            if (str2 == 3) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (str2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        Endpoint<Request<SendMessageRequestDto>, Response<ConversationMessagesDto>> endpoint = this.sendUserMessageEndpoint;
        String string3 = uuid3.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Request request = new Request(new SendMessageRequestDto(string3, MessageTypeDto.SELECTION, new SendMessageRequestAttributesDto(null, selectionMenuRowModel2.getId(), 1, null)), null, 2, null);
        c4133712.L$0 = uuid4;
        c4133712.L$1 = string2;
        c4133712.L$2 = null;
        c4133712.L$3 = null;
        c4133712.label = 2;
        if (Endpoint.DefaultImpls.fetch$default(endpoint, request, null, c4133712, 2, null) != coroutine_suspended) {
            uuid5 = uuid4;
            str = string2;
            InFlightMessageStore inFlightMessageStore22 = this.inFlightMessageStore;
            c4133712.L$0 = uuid5;
            c4133712.L$1 = str;
            c4133712.label = 3;
        }
        return coroutine_suspended;
    }

    public final Object sendCta(UUID uuid, String str, Continuation<? super Unit> continuation) {
        Endpoint<Request<SendMessageRequestDto>, Response<ConversationMessagesDto>> endpoint = this.sendUserMessageEndpoint;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Object objFetch$default = Endpoint.DefaultImpls.fetch$default(endpoint, new Request(new SendMessageRequestDto(string2, MessageTypeDto.CTA_ACTION, new SendMessageRequestAttributesDto(null, str, 1, null)), null, 2, null), null, continuation, 2, null);
        return objFetch$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFetch$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object sendPickedSuggestedResponse$default(ChatbotStore chatbotStore, UUID uuid, UUID uuid2, ChatbotSuggestedResponse chatbotSuggestedResponse, String str, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return chatbotStore.sendPickedSuggestedResponse(uuid, uuid2, chatbotSuggestedResponse, str, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|63|(1:(1:(3:(1:(1:15)(2:16|17))(2:18|19)|59|60)(3:23|24|46))(1:26))(8:27|(1:29)(1:30)|31|(1:37)|36|38|(1:41)|58)|64|42|(2:45|46)|58) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        if (r0.removeMessage(r5, r4, r7) != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0119, code lost:
    
        r5 = r13;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
    
        if ((r0 instanceof java.util.concurrent.CancellationException) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0123, code lost:
    
        if (com.robinhood.utils.extensions.Throwables.isNetworkRelated(r0) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        com.robinhood.utils.logging.CrashReporter.DefaultImpls.reportNonFatal$default(com.robinhood.utils.logging.CrashReporter.INSTANCE, r0, false, null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0134, code lost:
    
        r0 = r21.inFlightMessageStore;
        r2 = com.robinhood.shared.models.chat.common.UnsentInputStatus.FAILED;
        r7.L$0 = null;
        r7.L$1 = null;
        r7.L$2 = null;
        r7.L$3 = null;
        r7.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0147, code lost:
    
        if (r0.updateMessageStatus(r5, r4, r2, r7) == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendPickedSuggestedResponse(UUID uuid, UUID uuid2, ChatbotSuggestedResponse chatbotSuggestedResponse, String str, Continuation<? super Unit> continuation) throws Throwable {
        C413361 c413361;
        String str2;
        UnsentInputStatus unsentInputStatus;
        UUID uuid3;
        ChatbotSuggestedResponse chatbotSuggestedResponse2;
        UUID uuid4;
        UUID uuid5;
        String str3;
        if (continuation instanceof C413361) {
            c413361 = (C413361) continuation;
            int i = c413361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413361.label = i - Integer.MIN_VALUE;
            } else {
                c413361 = new C413361(continuation);
            }
        }
        C413361 c4133612 = c413361;
        Object obj = c4133612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String str4 = c4133612.label;
        UUID uuid6 = "toString(...)";
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (str4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (str == null) {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                str2 = string2;
            } else {
                str2 = str;
            }
            String text = chatbotSuggestedResponse.getText();
            if (str == null || (unsentInputStatus = UnsentInputStatus.RESENDING) == null) {
                unsentInputStatus = UnsentInputStatus.SENDING;
            }
            UnsentInputStatus unsentInputStatus2 = unsentInputStatus;
            Instant instantNow = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            UnsentInput.SuggestedResponse suggestedResponse = new UnsentInput.SuggestedResponse(str2, unsentInputStatus2, instantNow, chatbotSuggestedResponse.getId(), text);
            InFlightMessageStore inFlightMessageStore = this.inFlightMessageStore;
            c4133612.L$0 = uuid;
            uuid3 = uuid2;
            c4133612.L$1 = uuid3;
            chatbotSuggestedResponse2 = chatbotSuggestedResponse;
            c4133612.L$2 = chatbotSuggestedResponse2;
            c4133612.L$3 = str2;
            c4133612.label = 1;
            if (inFlightMessageStore.addMessage(uuid, suggestedResponse, c4133612) != coroutine_suspended) {
                uuid4 = uuid;
            }
            return coroutine_suspended;
        }
        if (str4 == 1) {
            String str5 = (String) c4133612.L$3;
            ChatbotSuggestedResponse chatbotSuggestedResponse3 = (ChatbotSuggestedResponse) c4133612.L$2;
            UUID uuid7 = (UUID) c4133612.L$1;
            uuid4 = (UUID) c4133612.L$0;
            ResultKt.throwOnFailure(obj);
            chatbotSuggestedResponse2 = chatbotSuggestedResponse3;
            uuid3 = uuid7;
            str2 = str5;
        } else if (str4 == 2) {
            str3 = (String) c4133612.L$1;
            uuid5 = (UUID) c4133612.L$0;
            ResultKt.throwOnFailure(obj);
            InFlightMessageStore inFlightMessageStore2 = this.inFlightMessageStore;
            c4133612.L$0 = uuid5;
            c4133612.L$1 = str3;
            c4133612.label = 3;
        } else {
            if (str4 == 3) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (str4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        Endpoint<Request<SendMessageRequestDto>, Response<ConversationMessagesDto>> endpoint = this.sendUserMessageEndpoint;
        String string3 = uuid3.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        Request request = new Request(new SendMessageRequestDto(string3, MessageTypeDto.SUGGESTED_RESPONSES, new SendMessageRequestAttributesDto(null, chatbotSuggestedResponse2.getId(), 1, null)), null, 2, null);
        c4133612.L$0 = uuid4;
        c4133612.L$1 = str2;
        c4133612.L$2 = null;
        c4133612.L$3 = null;
        c4133612.label = 2;
        if (Endpoint.DefaultImpls.fetch$default(endpoint, request, null, c4133612, 2, null) != coroutine_suspended) {
            uuid5 = uuid4;
            str3 = str2;
            InFlightMessageStore inFlightMessageStore22 = this.inFlightMessageStore;
            c4133612.L$0 = uuid5;
            c4133612.L$1 = str3;
            c4133612.label = 3;
        }
        return coroutine_suspended;
    }

    /* compiled from: ChatbotStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.data.store.chatbot.ChatbotStore$setInputDraft$1", m3645f = "ChatbotStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.data.store.chatbot.ChatbotStore$setInputDraft$1 */
    static final class C413391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $conversationId;
        final /* synthetic */ String $input;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413391(UUID uuid, String str, Continuation<? super C413391> continuation) {
            super(2, continuation);
            this.$conversationId = uuid;
            this.$input = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatbotStore.this.new C413391(this.$conversationId, this.$input, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C413391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ChatbotSession chatbotSessionCreateDefaultSession = (ChatbotSession) ((Map) ChatbotStore.this.getConversationSessions().getValue()).get(this.$conversationId);
                if (chatbotSessionCreateDefaultSession == null) {
                    chatbotSessionCreateDefaultSession = ChatbotStore.this.createDefaultSession(this.$conversationId);
                }
                ChatbotSession chatbotSessionCopy$default = ChatbotSession.copy$default(chatbotSessionCreateDefaultSession, null, null, null, this.$input, null, null, null, null, null, 503, null);
                StateFlow2 conversationSessions = ChatbotStore.this.getConversationSessions();
                UUID uuid = this.$conversationId;
                do {
                    value = conversationSessions.getValue();
                } while (!conversationSessions.compareAndSet(value, MapsKt.plus((Map) value, Tuples4.m3642to(uuid, chatbotSessionCopy$default))));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Job setInputDraft(UUID conversationId, String input) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(input, "input");
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C413391(conversationId, input, null), 3, null);
    }

    static /* synthetic */ void applySessionMutation$default(ChatbotStore chatbotStore, UUID uuid, ChatbotMessagePage chatbotMessagePage, Long l, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        chatbotStore.applySessionMutation(uuid, chatbotMessagePage, l, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySessionMutation(UUID conversationId, ChatbotMessagePage responseData, Long pollingIntervalMs, boolean applyInteractionState) {
        Map<UUID, ChatbotSession> value;
        Map<UUID, Long> value2;
        Map<UUID, Long> value3;
        ChatbotSession chatbotSessionCreateDefaultSession = getConversationSessions().getValue().get(conversationId);
        if (chatbotSessionCreateDefaultSession == null) {
            chatbotSessionCreateDefaultSession = createDefaultSession(conversationId);
        }
        ChatbotSession chatbotSession = chatbotSessionCreateDefaultSession;
        List listPlus = CollectionsKt.plus((Collection) responseData.getMessages(), (Iterable) chatbotSession.getMessages());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlus) {
            if (hashSet.add(((ChatbotMessage) obj).getId())) {
                arrayList.add(obj);
            }
        }
        ChatbotSession chatbotSessionCopy$default = ChatbotSession.copy$default(chatbotSession, null, null, null, null, null, responseData.getNext(), CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.store.data.store.chatbot.ChatbotStore$applySessionMutation$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((ChatbotMessage) t).getSentAt(), ((ChatbotMessage) t2).getSentAt());
            }
        }), null, null, 415, null);
        if (applyInteractionState) {
            chatbotSessionCopy$default = ChatbotSession.copy$default(chatbotSessionCopy$default, null, responseData.getUserInteractionState().getTextInputState(), responseData.getUserInteractionState().getTextInputPlaceholder(), null, responseData.getUserInteractionState().getTypingState(), null, null, responseData.getUserInteractionState().getSuggestedResponses(), responseData.getUserInteractionState().getExtraInput(), 105, null);
        }
        StateFlow2<Map<UUID, ChatbotSession>> conversationSessions = getConversationSessions();
        do {
            value = conversationSessions.getValue();
        } while (!conversationSessions.compareAndSet(value, MapsKt.plus(value, Tuples4.m3642to(conversationId, chatbotSessionCopy$default))));
        if (pollingIntervalMs != null) {
            StateFlow2<Map<UUID, Long>> pollMessagesIntervalStream = getPollMessagesIntervalStream();
            do {
                value3 = pollMessagesIntervalStream.getValue();
            } while (!pollMessagesIntervalStream.compareAndSet(value3, MapsKt.plus(value3, Tuples4.m3642to(conversationId, pollingIntervalMs))));
        } else {
            StateFlow2<Map<UUID, Long>> pollMessagesIntervalStream2 = getPollMessagesIntervalStream();
            do {
                value2 = pollMessagesIntervalStream2.getValue();
            } while (!pollMessagesIntervalStream2.compareAndSet(value2, MapsKt.minus(value2, conversationId)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getPollingIntervalMs(Response<ConversationMessagesDto> response) {
        String str = response.getMetadata().get(Headers.POLL_INTERVAL);
        if (str == null) {
            Map<String, String> metadata = response.getMetadata();
            String lowerCase = Headers.POLL_INTERVAL.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str = metadata.get(lowerCase);
        }
        if (str != null) {
            return StringsKt.toLongOrNull(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatbotSession createDefaultSession(UUID conversationId) {
        return new ChatbotSession(conversationId, ChatTypingStatus.DISABLED, null, null, new ChatbotTypingState(false, null), null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null);
    }
}
