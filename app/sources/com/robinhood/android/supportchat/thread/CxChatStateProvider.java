package com.robinhood.android.supportchat.thread;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.supportchat.thread.CxChatDataState;
import com.robinhood.android.supportchat.thread.CxChatViewState;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.pathfinder.messaging.ChatCurrentType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.p356v2.ChatbotMessage;
import com.robinhood.models.p355ui.p356v2.ChatbotSession;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import com.robinhood.models.p355ui.p356v2.ChatbotTypingState;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.p355ui.p356v2.SelectionMenuState;
import com.robinhood.models.p355ui.pathfinder.messaging.AgentChat;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatbotChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.models.supportchat.p353db.SupportChatBanner;
import com.robinhood.shared.models.chat.common.Renderable;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.shared.models.chat.common.api.ChatTypingStatus;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.support.supportchat.UiChatMessages;
import com.robinhood.shared.support.supportchat.extensions.ChatbotMessages;
import com.robinhood.shared.support.supportchat.extensions.SocketChatMessages;
import com.robinhood.shared.support.supportchat.format.ChatTimestampFormatter;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage2;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage3;
import com.robinhood.store.supportchat.AgentChatSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CxChatStateProvider.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ³\u0001\u0010-\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00132\u0006\u0010'\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b-\u0010.J9\u00106\u001a\u0002052\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u0001022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\u001c*\u00020\u000bH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u000bH\u0002¢\u0006\u0004\b:\u00109J/\u0010<\u001a\u00020;2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001cH\u0002¢\u0006\u0004\b<\u0010=J!\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020C2\u0006\u0010B\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bD\u0010EJ\u008f\u0001\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G2\b\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u00101\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\bI\u0010JJ+\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00160G2\u0006\u0010L\u001a\u00020K2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u0002H\u0016¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010T¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "chatTimestampFormatter", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;Lj$/time/Clock;)V", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getChatMode", "(Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;)Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "Lcom/robinhood/models/ui/pathfinder/messaging/AgentChat;", "(Lcom/robinhood/models/ui/pathfinder/messaging/AgentChat;)Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "supportChat", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "uploadStatus", "", "Lcom/robinhood/models/ui/v2/ChatbotMessage;", "chatbotMessages", "Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "chatbotSuggestedResponses", "Lcom/robinhood/models/ui/v2/ChatbotTypingState;", "chatbotTypingState", "", "chatbotPageCursor", "", "agentTyping", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "agentChatMessages", "", "agentChatPageCursor", "lastAgentReadMessageIndex", "j$/time/Instant", "lastAgentReadMessageTimestamp", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "pendingMessages", "hasInternetConnection", "Lcom/robinhood/models/ui/v2/ExtraUserInputModel;", "extraUserInputModel", "hideSelectionMenu", "hideSuggestedResponses", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "getContentState", "(Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/ui/v2/ChatbotTypingState;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Long;Ljava/lang/Long;Lj$/time/Instant;Ljava/util/List;ZLcom/robinhood/models/ui/v2/ExtraUserInputModel;ZZ)Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "Lcom/robinhood/shared/models/chat/common/api/ChatTypingStatus;", "inputState", "chatMode", "Lcom/robinhood/models/ui/v2/ChatbotSession;", "chatbotSession", "hasInFlightMessage", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "getBottomControlState", "(Lcom/robinhood/shared/models/chat/common/api/ChatTypingStatus;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/models/ui/v2/ChatbotSession;Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;Z)Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "hasAgentChatConversation", "(Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;)Z", "canShowImageButton", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "getTopBarState", "(Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;Z)Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "isAgentOnline", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "getAvatarStatus", "(Ljava/lang/Boolean;Z)Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "isEndable", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "getEndButtonStatus", "(ZLcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;)Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "canBeEscalated", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "generateMessages", "(Ljava/lang/Long;Lj$/time/Instant;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Ljava/util/List;Lcom/robinhood/models/ui/v2/ChatbotTypingState;Ljava/util/List;ZLjava/util/List;Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;ZLcom/robinhood/models/ui/v2/ExtraUserInputModel;Z)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/pathfinder/messaging/ChatCurrentType;", "currentType", "suggestedResponses", "getSuggestedResponses", "(Lcom/robinhood/models/api/pathfinder/messaging/ChatCurrentType;Ljava/util/List;)Lkotlinx/collections/immutable/ImmutableList;", "dataState", "reduce", "(Lcom/robinhood/android/supportchat/thread/CxChatDataState;)Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "Lcom/robinhood/shared/support/supportchat/format/ChatTimestampFormatter;", "Lj$/time/Clock;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CxChatStateProvider implements StateProvider<CxChatDataState, CxChatViewState> {
    public static final int $stable = 8;
    private final ChatTimestampFormatter chatTimestampFormatter;
    private final Clock clock;

    /* compiled from: CxChatStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CxChatDataState.InitialChatType.values().length];
            try {
                iArr[CxChatDataState.InitialChatType.CHATBOT_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CxChatDataState.InitialChatType.AGENT_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CxChatDataState.InitialChatType.ESCALATED_CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChatTypingStatus.values().length];
            try {
                iArr2[ChatTypingStatus.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChatTypingStatus.SENDING_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChatTypingStatus.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChatTypingStatus.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ParticipantType.values().length];
            try {
                iArr3[ParticipantType.AGENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ParticipantType.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ParticipantType.CHATBOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ParticipantType.USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ChatCurrentType.values().length];
            try {
                iArr4[ChatCurrentType.CHATBOT_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[ChatCurrentType.AGENT_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ChatCurrentType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public CxChatStateProvider(ChatTimestampFormatter chatTimestampFormatter, Clock clock) {
        Intrinsics.checkNotNullParameter(chatTimestampFormatter, "chatTimestampFormatter");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.chatTimestampFormatter = chatTimestampFormatter;
        this.clock = clock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if (r23.getAgentChatSession() != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r23.getAgentChatSession() == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        if (r23.getChatbotSession() == null) goto L69;
     */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CxChatViewState reduce(CxChatDataState dataState) {
        boolean z;
        Instant instant;
        List<ChatbotMessage> list;
        boolean z2;
        List<ChatbotSuggestedResponse> list2;
        List<SocketChatMessage> list3;
        CxChatStateProvider cxChatStateProvider;
        SelectionMenuState extraUserInputType;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CxChatDataState.InitialStatus initialStatus = dataState.getInitialStatus();
        if (Intrinsics.areEqual(initialStatus, CxChatDataState.InitialStatus.Loading.INSTANCE)) {
            return new CxChatViewState.Loading(dataState.getBottomSheetData(), dataState.getDialogData());
        }
        if (initialStatus instanceof CxChatDataState.InitialStatus.FailedFetching) {
            return new CxChatViewState.FailedFetching(((CxChatDataState.InitialStatus.FailedFetching) initialStatus).getInquiryId(), dataState.getBottomSheetData(), dataState.getDialogData());
        }
        if (initialStatus instanceof CxChatDataState.InitialStatus.FailedCreating) {
            return new CxChatViewState.FailedCreating(dataState.getDialogData());
        }
        if (!(initialStatus instanceof CxChatDataState.InitialStatus.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        List<UnsentInput> pendingMessages = dataState.getPendingMessages();
        boolean z3 = false;
        if ((pendingMessages instanceof Collection) && pendingMessages.isEmpty()) {
            z = false;
        } else {
            for (UnsentInput unsentInput : pendingMessages) {
                if ((unsentInput instanceof UnsentInput.Selection) || (unsentInput instanceof UnsentInput.SuggestedResponse)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z4 = z || ((dataState.getUploadStatus() instanceof CxChatDataState.UploadStatus.SendChatbotUserMessage) || (dataState.getUploadStatus() instanceof CxChatDataState.UploadStatus.SendSuggestedResponse));
        CxChatDataState.InitialStatus.Success success = (CxChatDataState.InitialStatus.Success) initialStatus;
        UUID inquiryId = success.getSupportChat().getInquiryId();
        boolean zContains = dataState.getHideSelectionMenuForInquiry().contains(inquiryId);
        boolean z5 = dataState.getHideSuggestedResponsesForInquiry().contains(inquiryId) || z4;
        SupportChat supportChat = success.getSupportChat();
        ChatMode chatMode = getChatMode(supportChat);
        Tuples2 tuples2M3642to = Tuples4.m3642to(dataState.getAgentChatSession(), dataState.getChatbotSession());
        AgentChatSession agentChatSession = (AgentChatSession) tuples2M3642to.component1();
        ChatbotSession chatbotSession = (ChatbotSession) tuples2M3642to.component2();
        CxChatDataState.InitialChatType initialChatType = success.getInitialChatType();
        int i = initialChatType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[initialChatType.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (dataState.getChatbotSession() != null) {
                    }
                    return new CxChatViewState.Loading(dataState.getBottomSheetData(), dataState.getDialogData());
                }
            }
        }
        UUID inquiryId2 = success.getSupportChat().getInquiryId();
        CxChatDataState.UploadStatus uploadStatus = dataState.getUploadStatus();
        List<ChatbotMessage> messages = chatbotSession != null ? chatbotSession.getMessages() : null;
        if (messages == null) {
            messages = CollectionsKt.emptyList();
        }
        List<ChatbotSuggestedResponse> suggestedResponses = chatbotSession != null ? chatbotSession.getSuggestedResponses() : null;
        if (suggestedResponses == null) {
            suggestedResponses = CollectionsKt.emptyList();
        }
        String cursor = chatbotSession != null ? chatbotSession.getCursor() : null;
        ChatbotTypingState typingState = chatbotSession != null ? chatbotSession.getTypingState() : null;
        List<SocketChatMessage> messages2 = agentChatSession != null ? agentChatSession.getMessages() : null;
        if (messages2 == null) {
            messages2 = CollectionsKt.emptyList();
        }
        Long cursor2 = agentChatSession != null ? agentChatSession.getCursor() : null;
        if (agentChatSession != null && agentChatSession.isTyping()) {
            z3 = true;
        }
        Long lastAgentReadMessageIndex = agentChatSession != null ? agentChatSession.getLastAgentReadMessageIndex() : null;
        Instant lastAgentReadMessageTimestamp = agentChatSession != null ? agentChatSession.getLastAgentReadMessageTimestamp() : null;
        ChatbotTypingState chatbotTypingState = typingState;
        Long l = lastAgentReadMessageIndex;
        boolean hasInternetConnection = dataState.getHasInternetConnection();
        String str = cursor;
        Long l2 = cursor2;
        List<UnsentInput> pendingMessages2 = dataState.getPendingMessages();
        if (chatbotSession != null) {
            cxChatStateProvider = this;
            extraUserInputType = chatbotSession.getExtraUserInputType();
            List<SocketChatMessage> list4 = messages2;
            instant = lastAgentReadMessageTimestamp;
            list = messages;
            z2 = z3;
            list2 = suggestedResponses;
            list3 = list4;
        } else {
            List<SocketChatMessage> list5 = messages2;
            instant = lastAgentReadMessageTimestamp;
            list = messages;
            z2 = z3;
            list2 = suggestedResponses;
            list3 = list5;
            cxChatStateProvider = this;
            extraUserInputType = null;
        }
        return new CxChatViewState.Success(inquiryId2, "", cxChatStateProvider.getContentState(supportChat, uploadStatus, list, list2, chatbotTypingState, str, z2, list3, l2, l, instant, pendingMessages2, hasInternetConnection, extraUserInputType, zContains, z5), getBottomControlState(supportChat.getInputState(), chatMode, dataState.getChatbotSession(), dataState.getUploadStatus(), !dataState.getPendingMessages().isEmpty()), chatMode, dataState.getBottomSheetData(), dataState.getDialogData(), getTopBarState(supportChat, chatMode, dataState.getUploadStatus(), dataState.getHasInternetConnection()));
    }

    private final ChatMode getChatMode(SupportChat supportChat) {
        Tuples2 tuples2M3642to = Tuples4.m3642to(supportChat.getAgentChat(), supportChat.getChatbotChat());
        AgentChat agentChat = (AgentChat) tuples2M3642to.component1();
        ChatbotChat chatbotChat = (ChatbotChat) tuples2M3642to.component2();
        if (supportChat.getCurrentType() == ChatCurrentType.AGENT_CHAT && agentChat != null) {
            return getChatMode(agentChat);
        }
        if (supportChat.getCurrentType() == ChatCurrentType.CHATBOT_CHAT && chatbotChat != null) {
            return new ChatMode.ChatbotChat(chatbotChat.getConversationId());
        }
        throw new IllegalStateException("Cannot determine chat mode!");
    }

    private final ChatMode getChatMode(AgentChat agentChat) {
        AgentChat.AgentChatConversation conversation = agentChat.getConversation();
        if (conversation instanceof AgentChat.AgentChatConversation.AgentChatSalesforceChat) {
            return new ChatMode.AgentChat.SalesforceChat(agentChat.getIssueId(), ((AgentChat.AgentChatConversation.AgentChatSalesforceChat) conversation).getId());
        }
        if (conversation instanceof AgentChat.AgentChatConversation.AgentChatTwilioChat) {
            return new ChatMode.AgentChat.TwilioChat(agentChat.getIssueId(), ((AgentChat.AgentChatConversation.AgentChatTwilioChat) conversation).getId());
        }
        return new ChatMode.AgentChat.TwilioChat(agentChat.getIssueId(), agentChat.getConversationSid());
    }

    private final CxChatViewState.ContentState getContentState(SupportChat supportChat, CxChatDataState.UploadStatus uploadStatus, List<? extends ChatbotMessage> chatbotMessages, List<ChatbotSuggestedResponse> chatbotSuggestedResponses, ChatbotTypingState chatbotTypingState, String chatbotPageCursor, boolean agentTyping, List<SocketChatMessage> agentChatMessages, Long agentChatPageCursor, Long lastAgentReadMessageIndex, Instant lastAgentReadMessageTimestamp, List<? extends UnsentInput> pendingMessages, boolean hasInternetConnection, SelectionMenuState extraUserInputModel, boolean hideSelectionMenu, boolean hideSuggestedResponses) {
        ImmutableList<ChatbotSuggestedResponse> suggestedResponses;
        Boolean canBeEscalated;
        boolean zBooleanValue = false;
        boolean z = (uploadStatus instanceof CxChatDataState.UploadStatus.Action) || (uploadStatus instanceof CxChatDataState.UploadStatus.CtaEndChat);
        CxChatDataState.UploadStatus.SendSuggestedResponse sendSuggestedResponse = uploadStatus instanceof CxChatDataState.UploadStatus.SendSuggestedResponse ? (CxChatDataState.UploadStatus.SendSuggestedResponse) uploadStatus : null;
        String suggestedResponseId = sendSuggestedResponse != null ? sendSuggestedResponse.getSuggestedResponseId() : null;
        boolean zAreEqual = Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.FetchPreviousMessages.INSTANCE);
        SupportChatBanner banner = supportChat.getBanner();
        SupportChatBanner secondaryBanner = supportChat.getSecondaryBanner();
        ChatMode chatMode = getChatMode(supportChat);
        ChatbotChat chatbotChat = supportChat.getChatbotChat();
        if (chatbotChat != null && (canBeEscalated = chatbotChat.getCanBeEscalated()) != null) {
            zBooleanValue = canBeEscalated.booleanValue();
        }
        ImmutableList<UiChatMessage> immutableListGenerateMessages = generateMessages(lastAgentReadMessageIndex, lastAgentReadMessageTimestamp, chatMode, chatbotMessages, chatbotTypingState, agentChatMessages, agentTyping, pendingMessages, uploadStatus, zBooleanValue, extraUserInputModel, hideSelectionMenu);
        if (hideSuggestedResponses) {
            suggestedResponses = extensions2.persistentListOf();
        } else {
            suggestedResponses = getSuggestedResponses(supportChat.getCurrentType(), extensions2.toImmutableList(chatbotSuggestedResponses));
        }
        return new CxChatViewState.ContentState(z, zAreEqual, suggestedResponseId, banner, secondaryBanner, immutableListGenerateMessages, suggestedResponses, chatbotPageCursor, agentChatPageCursor, hasInternetConnection);
    }

    private final CxChatViewState.BottomControlState getBottomControlState(ChatTypingStatus inputState, ChatMode chatMode, ChatbotSession chatbotSession, CxChatDataState.UploadStatus uploadStatus, boolean hasInFlightMessage) {
        boolean zCanShowImageButton = canShowImageButton(chatMode);
        String textInputPlaceholder = chatbotSession != null ? chatbotSession.getTextInputPlaceholder() : null;
        int[] iArr = WhenMappings.$EnumSwitchMapping$1;
        int i = iArr[inputState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new CxChatViewState.BottomControlState.SendingDisabled(textInputPlaceholder);
            }
            if (i == 3) {
                return CxChatViewState.BottomControlState.Hidden.INSTANCE;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return new CxChatViewState.BottomControlState.Disabled(zCanShowImageButton, textInputPlaceholder);
        }
        if (Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.SendChatbotUserMessage.INSTANCE)) {
            return new CxChatViewState.BottomControlState.SendingDisabled(textInputPlaceholder);
        }
        if (Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.CtaEndChat.INSTANCE) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.SendCta) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.EndChat) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.Escalate) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.ResumeChat) || (uploadStatus instanceof CxChatDataState.UploadStatus.SendSuggestedResponse)) {
            if (chatMode instanceof ChatMode.ChatbotChat) {
                if ((chatbotSession != null ? chatbotSession.getInputStatus() : null) == ChatTypingStatus.HIDDEN) {
                    return CxChatViewState.BottomControlState.Hidden.INSTANCE;
                }
            }
            return new CxChatViewState.BottomControlState.Disabled(zCanShowImageButton, textInputPlaceholder);
        }
        if (!Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.FetchPreviousMessages.INSTANCE) && !Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        if (chatMode instanceof ChatMode.ChatbotChat) {
            ChatTypingStatus inputStatus = chatbotSession != null ? chatbotSession.getInputStatus() : null;
            int i2 = inputStatus == null ? -1 : iArr[inputStatus.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    if (hasInFlightMessage) {
                        return new CxChatViewState.BottomControlState.SendingDisabled(textInputPlaceholder);
                    }
                    return new CxChatViewState.BottomControlState.Enabled(zCanShowImageButton, textInputPlaceholder);
                }
                if (i2 == 2) {
                    return new CxChatViewState.BottomControlState.SendingDisabled(textInputPlaceholder);
                }
                if (i2 == 3) {
                    return CxChatViewState.BottomControlState.Hidden.INSTANCE;
                }
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new CxChatViewState.BottomControlState.Disabled(zCanShowImageButton, textInputPlaceholder);
        }
        if (!(chatMode instanceof ChatMode.AgentChat)) {
            throw new NoWhenBranchMatchedException();
        }
        if (hasAgentChatConversation(chatMode)) {
            return new CxChatViewState.BottomControlState.Enabled(zCanShowImageButton, (String) null);
        }
        return new CxChatViewState.BottomControlState.SendingDisabled(null);
    }

    private final boolean hasAgentChatConversation(ChatMode chatMode) {
        if (chatMode instanceof ChatMode.AgentChat.SalesforceChat) {
            return ((ChatMode.AgentChat.SalesforceChat) chatMode).getConversationId() != null;
        }
        if (chatMode instanceof ChatMode.AgentChat.TwilioChat) {
            return ((ChatMode.AgentChat.TwilioChat) chatMode).getConversationSid() != null;
        }
        if (chatMode instanceof ChatMode.ChatbotChat) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean canShowImageButton(ChatMode chatMode) {
        if (chatMode instanceof ChatMode.AgentChat) {
            return true;
        }
        if (chatMode instanceof ChatMode.ChatbotChat) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final CxChatViewState.TopBarState getTopBarState(SupportChat supportChat, ChatMode chatMode, CxChatDataState.UploadStatus uploadStatus, boolean hasInternetConnection) {
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3;
        if (chatMode instanceof ChatMode.ChatbotChat) {
            serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.ROBINHOOD;
        } else {
            if (!(chatMode instanceof ChatMode.AgentChat)) {
                throw new NoWhenBranchMatchedException();
            }
            serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.AGENT;
        }
        ServerToBentoAssetMapper3 serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
        String chatTitle = supportChat.getChatTitle();
        String chatAvatarColor = supportChat.getChatAvatarColor();
        AgentChat agentChat = supportChat.getAgentChat();
        return new CxChatViewState.TopBarState.Loaded(chatTitle, serverToBentoAssetMapper32, chatAvatarColor, getAvatarStatus(agentChat != null ? agentChat.isAgentOnline() : null, hasInternetConnection), getEndButtonStatus(supportChat.isEndable(), uploadStatus));
    }

    private final CxChatTopBar5.AvatarStatus getAvatarStatus(Boolean isAgentOnline, boolean hasInternetConnection) {
        if (isAgentOnline == null) {
            return CxChatTopBar5.AvatarStatus.Hidden;
        }
        return (isAgentOnline.booleanValue() && hasInternetConnection) ? CxChatTopBar5.AvatarStatus.Online : CxChatTopBar5.AvatarStatus.Offline;
    }

    private final CxChatTopBar5.EndButtonStatus getEndButtonStatus(boolean isEndable, CxChatDataState.UploadStatus uploadStatus) {
        if (!isEndable) {
            return CxChatTopBar5.EndButtonStatus.Hidden;
        }
        if (Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.CtaEndChat.INSTANCE)) {
            return CxChatTopBar5.EndButtonStatus.Loading;
        }
        if ((uploadStatus instanceof CxChatDataState.UploadStatus.Action.SendCta) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.EndChat) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.Escalate) || (uploadStatus instanceof CxChatDataState.UploadStatus.Action.ResumeChat) || (uploadStatus instanceof CxChatDataState.UploadStatus.SendSuggestedResponse) || Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.SendChatbotUserMessage.INSTANCE)) {
            return CxChatTopBar5.EndButtonStatus.Disabled;
        }
        if (!Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.FetchPreviousMessages.INSTANCE) && !Intrinsics.areEqual(uploadStatus, CxChatDataState.UploadStatus.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return CxChatTopBar5.EndButtonStatus.Enabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ImmutableList<UiChatMessage> generateMessages(Long lastAgentReadMessageIndex, Instant lastAgentReadMessageTimestamp, ChatMode chatMode, List<? extends ChatbotMessage> chatbotMessages, ChatbotTypingState chatbotTypingState, List<SocketChatMessage> agentChatMessages, boolean agentTyping, List<? extends UnsentInput> pendingMessages, final CxChatDataState.UploadStatus uploadStatus, final boolean canBeEscalated, SelectionMenuState extraUserInputModel, boolean hideSelectionMenu) {
        List listEmptyList;
        List listPlus;
        ParticipantType participantType;
        boolean z;
        ArrayList arrayList = new ArrayList();
        List listSortedWith = CollectionsKt.sortedWith(chatbotMessages, new Comparator() { // from class: com.robinhood.android.supportchat.thread.CxChatStateProvider$generateMessages$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((ChatbotMessage) t).getSentAt(), ((ChatbotMessage) t2).getSentAt());
            }
        });
        List listSortedWith2 = CollectionsKt.sortedWith(agentChatMessages, new Comparator() { // from class: com.robinhood.android.supportchat.thread.CxChatStateProvider$generateMessages$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SocketChatMessage) t).getIndex()), Long.valueOf(((SocketChatMessage) t2).getIndex()));
            }
        });
        arrayList.addAll(listSortedWith);
        arrayList.addAll(listSortedWith2);
        boolean z2 = (chatbotTypingState != null && chatbotTypingState.getTypingOrThinking()) || agentTyping;
        long jLongValue = lastAgentReadMessageIndex != null ? lastAgentReadMessageIndex.longValue() : -1L;
        Instant instant = lastAgentReadMessageTimestamp == null ? Instant.MIN : lastAgentReadMessageTimestamp;
        Intrinsics.checkNotNull(instant);
        List<UiChatMessage> listTransform = UiChatMessages.transform(arrayList, z2, jLongValue, instant, this.chatTimestampFormatter, new Function4() { // from class: com.robinhood.android.supportchat.thread.CxChatStateProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return CxChatStateProvider.generateMessages$lambda$3(uploadStatus, canBeEscalated, (Renderable) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (UiChatMessage2.Timestamp) obj4);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listTransform.iterator();
        while (it.hasNext()) {
            String localSid = ((UiChatMessage) it.next()).getLocalSid();
            if (localSid != null) {
                arrayList2.add(localSid);
            }
        }
        Set set = CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : pendingMessages) {
            if (!set.contains(((UnsentInput) obj).getLocalSid())) {
                arrayList3.add(obj);
            }
        }
        List<UiChatMessage.Regular> unsentMessages = UiChatMessage3.toUnsentMessages(arrayList3, chatMode);
        if ((chatbotTypingState != null && chatbotTypingState.getTypingOrThinking()) || agentTyping) {
            if (chatMode instanceof ChatMode.AgentChat) {
                participantType = ParticipantType.AGENT;
            } else {
                if (!(chatMode instanceof ChatMode.ChatbotChat)) {
                    throw new NoWhenBranchMatchedException();
                }
                participantType = ParticipantType.CHATBOT;
            }
            ParticipantType participantType2 = participantType;
            int i = WhenMappings.$EnumSwitchMapping$2[participantType2.ordinal()];
            if (i == 1) {
                z = true;
                Instant instantNow = Instant.now(this.clock);
                Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
                listEmptyList = CollectionsKt.listOf(new UiChatMessage.Regular.TypingIndicator(null, 0L, participantType2, z, true, instantNow, null, chatbotTypingState != null ? chatbotTypingState.getThinkingMessage() : null, 3, null));
            } else {
                if (i == 2 || i == 3) {
                    if ((chatbotTypingState != null ? chatbotTypingState.getThinkingMessage() : null) == null) {
                    }
                    Instant instantNow2 = Instant.now(this.clock);
                    Intrinsics.checkNotNullExpressionValue(instantNow2, "now(...)");
                    listEmptyList = CollectionsKt.listOf(new UiChatMessage.Regular.TypingIndicator(null, 0L, participantType2, z, true, instantNow2, null, chatbotTypingState != null ? chatbotTypingState.getThinkingMessage() : null, 3, null));
                } else if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
                Instant instantNow22 = Instant.now(this.clock);
                Intrinsics.checkNotNullExpressionValue(instantNow22, "now(...)");
                listEmptyList = CollectionsKt.listOf(new UiChatMessage.Regular.TypingIndicator(null, 0L, participantType2, z, true, instantNow22, null, chatbotTypingState != null ? chatbotTypingState.getThinkingMessage() : null, 3, null));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (chatMode instanceof ChatMode.AgentChat) {
            listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listTransform, (Iterable) listEmptyList), (Iterable) unsentMessages);
        } else {
            if (!(chatMode instanceof ChatMode.ChatbotChat)) {
                throw new NoWhenBranchMatchedException();
            }
            listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listTransform, (Iterable) unsentMessages), (Iterable) listEmptyList);
        }
        if ((extraUserInputModel instanceof SelectionMenuState.SelectionMenu) && !hideSelectionMenu) {
            SelectionMenuState.SelectionMenu selectionMenu = (SelectionMenuState.SelectionMenu) extraUserInputModel;
            List<SelectionMenuRowModel> rows = selectionMenu.getRows();
            Integer maxQuickReplyRows = selectionMenu.getMaxQuickReplyRows();
            String string2 = UUID.randomUUID().toString();
            UiChatMessage uiChatMessage = (UiChatMessage) CollectionsKt.lastOrNull(listPlus);
            long index = uiChatMessage != null ? uiChatMessage.getIndex() : 0L;
            ParticipantType participantType3 = ParticipantType.CHATBOT;
            Instant instantNow3 = Instant.now(this.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow3, "now(...)");
            listPlus = CollectionsKt.plus((Collection<? extends UiChatMessage.Regular.SelectionMenu>) listPlus, new UiChatMessage.Regular.SelectionMenu(rows, maxQuickReplyRows, selectionMenu.getTakeoverTitle(), string2, false, true, null, index + 1, participantType3, instantNow3));
        }
        return extensions2.toImmutableList(listPlus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiChatMessage generateMessages$lambda$3(CxChatDataState.UploadStatus uploadStatus, boolean z, Renderable transform, boolean z2, boolean z3, UiChatMessage2.Timestamp timestamp) {
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        if (transform instanceof ChatbotMessage) {
            ChatbotMessage chatbotMessage = (ChatbotMessage) transform;
            CxChatDataState.UploadStatus.Action action = uploadStatus instanceof CxChatDataState.UploadStatus.Action ? (CxChatDataState.UploadStatus.Action) uploadStatus : null;
            return ChatbotMessages.transform(chatbotMessage, z2, z3, timestamp, action != null ? action.getUploadingActionLocalId() : null, z);
        }
        if (transform instanceof SocketChatMessage) {
            return SocketChatMessages.transform((SocketChatMessage) transform, z2, z3, timestamp);
        }
        throw new IllegalArgumentException("Message type (" + transform.getClass() + ") is not supported");
    }

    private final ImmutableList<ChatbotSuggestedResponse> getSuggestedResponses(ChatCurrentType currentType, List<ChatbotSuggestedResponse> suggestedResponses) {
        int i = WhenMappings.$EnumSwitchMapping$3[currentType.ordinal()];
        if (i == 1) {
            return extensions2.toImmutableList(suggestedResponses);
        }
        if (i == 2 || i == 3) {
            return extensions2.persistentListOf();
        }
        throw new NoWhenBranchMatchedException();
    }
}
