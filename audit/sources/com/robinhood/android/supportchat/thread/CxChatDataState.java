package com.robinhood.android.supportchat.thread;

import com.robinhood.android.supportchat.thread.compose.CxChatBottomSheetData;
import com.robinhood.android.supportchat.thread.compose.CxChatDialogData;
import com.robinhood.models.p355ui.p356v2.ChatbotSession;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.shared.models.chat.common.UnsentInput;
import com.robinhood.store.supportchat.AgentChatSession;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatDataState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003=>?B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u0083\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001J\u0013\u00107\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState;", "", "initialStatus", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "uploadStatus", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "chatbotSession", "Lcom/robinhood/models/ui/v2/ChatbotSession;", "agentChatSession", "Lcom/robinhood/store/supportchat/AgentChatSession;", "hasInternetConnection", "", "pendingMessages", "", "Lcom/robinhood/shared/models/chat/common/UnsentInput;", "bottomSheetData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "hideSelectionMenuForInquiry", "", "Ljava/util/UUID;", "hideSuggestedResponsesForInquiry", "<init>", "(Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;Lcom/robinhood/models/ui/v2/ChatbotSession;Lcom/robinhood/store/supportchat/AgentChatSession;ZLjava/util/List;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;Ljava/util/Set;Ljava/util/Set;)V", "getInitialStatus", "()Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "getUploadStatus", "()Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "getChatbotSession", "()Lcom/robinhood/models/ui/v2/ChatbotSession;", "getAgentChatSession", "()Lcom/robinhood/store/supportchat/AgentChatSession;", "getHasInternetConnection", "()Z", "getPendingMessages", "()Ljava/util/List;", "getBottomSheetData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "getDialogData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "getHideSelectionMenuForInquiry", "()Ljava/util/Set;", "getHideSuggestedResponsesForInquiry", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "", "InitialStatus", "UploadStatus", "InitialChatType", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CxChatDataState {
    public static final int $stable = 8;
    private final AgentChatSession agentChatSession;
    private final CxChatBottomSheetData bottomSheetData;
    private final ChatbotSession chatbotSession;
    private final CxChatDialogData dialogData;
    private final boolean hasInternetConnection;
    private final Set<UUID> hideSelectionMenuForInquiry;
    private final Set<UUID> hideSuggestedResponsesForInquiry;
    private final InitialStatus initialStatus;
    private final List<UnsentInput> pendingMessages;
    private final UploadStatus uploadStatus;

    public CxChatDataState() {
        this(null, null, null, null, false, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CxChatDataState copy$default(CxChatDataState cxChatDataState, InitialStatus initialStatus, UploadStatus uploadStatus, ChatbotSession chatbotSession, AgentChatSession agentChatSession, boolean z, List list, CxChatBottomSheetData cxChatBottomSheetData, CxChatDialogData cxChatDialogData, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            initialStatus = cxChatDataState.initialStatus;
        }
        if ((i & 2) != 0) {
            uploadStatus = cxChatDataState.uploadStatus;
        }
        if ((i & 4) != 0) {
            chatbotSession = cxChatDataState.chatbotSession;
        }
        if ((i & 8) != 0) {
            agentChatSession = cxChatDataState.agentChatSession;
        }
        if ((i & 16) != 0) {
            z = cxChatDataState.hasInternetConnection;
        }
        if ((i & 32) != 0) {
            list = cxChatDataState.pendingMessages;
        }
        if ((i & 64) != 0) {
            cxChatBottomSheetData = cxChatDataState.bottomSheetData;
        }
        if ((i & 128) != 0) {
            cxChatDialogData = cxChatDataState.dialogData;
        }
        if ((i & 256) != 0) {
            set = cxChatDataState.hideSelectionMenuForInquiry;
        }
        if ((i & 512) != 0) {
            set2 = cxChatDataState.hideSuggestedResponsesForInquiry;
        }
        Set set3 = set;
        Set set4 = set2;
        CxChatBottomSheetData cxChatBottomSheetData2 = cxChatBottomSheetData;
        CxChatDialogData cxChatDialogData2 = cxChatDialogData;
        boolean z2 = z;
        List list2 = list;
        return cxChatDataState.copy(initialStatus, uploadStatus, chatbotSession, agentChatSession, z2, list2, cxChatBottomSheetData2, cxChatDialogData2, set3, set4);
    }

    /* renamed from: component1, reason: from getter */
    public final InitialStatus getInitialStatus() {
        return this.initialStatus;
    }

    public final Set<UUID> component10() {
        return this.hideSuggestedResponsesForInquiry;
    }

    /* renamed from: component2, reason: from getter */
    public final UploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final ChatbotSession getChatbotSession() {
        return this.chatbotSession;
    }

    /* renamed from: component4, reason: from getter */
    public final AgentChatSession getAgentChatSession() {
        return this.agentChatSession;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasInternetConnection() {
        return this.hasInternetConnection;
    }

    public final List<UnsentInput> component6() {
        return this.pendingMessages;
    }

    /* renamed from: component7, reason: from getter */
    public final CxChatBottomSheetData getBottomSheetData() {
        return this.bottomSheetData;
    }

    /* renamed from: component8, reason: from getter */
    public final CxChatDialogData getDialogData() {
        return this.dialogData;
    }

    public final Set<UUID> component9() {
        return this.hideSelectionMenuForInquiry;
    }

    public final CxChatDataState copy(InitialStatus initialStatus, UploadStatus uploadStatus, ChatbotSession chatbotSession, AgentChatSession agentChatSession, boolean hasInternetConnection, List<? extends UnsentInput> pendingMessages, CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData, Set<UUID> hideSelectionMenuForInquiry, Set<UUID> hideSuggestedResponsesForInquiry) {
        Intrinsics.checkNotNullParameter(initialStatus, "initialStatus");
        Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
        Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        Intrinsics.checkNotNullParameter(hideSelectionMenuForInquiry, "hideSelectionMenuForInquiry");
        Intrinsics.checkNotNullParameter(hideSuggestedResponsesForInquiry, "hideSuggestedResponsesForInquiry");
        return new CxChatDataState(initialStatus, uploadStatus, chatbotSession, agentChatSession, hasInternetConnection, pendingMessages, bottomSheetData, dialogData, hideSelectionMenuForInquiry, hideSuggestedResponsesForInquiry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CxChatDataState)) {
            return false;
        }
        CxChatDataState cxChatDataState = (CxChatDataState) other;
        return Intrinsics.areEqual(this.initialStatus, cxChatDataState.initialStatus) && Intrinsics.areEqual(this.uploadStatus, cxChatDataState.uploadStatus) && Intrinsics.areEqual(this.chatbotSession, cxChatDataState.chatbotSession) && Intrinsics.areEqual(this.agentChatSession, cxChatDataState.agentChatSession) && this.hasInternetConnection == cxChatDataState.hasInternetConnection && Intrinsics.areEqual(this.pendingMessages, cxChatDataState.pendingMessages) && Intrinsics.areEqual(this.bottomSheetData, cxChatDataState.bottomSheetData) && Intrinsics.areEqual(this.dialogData, cxChatDataState.dialogData) && Intrinsics.areEqual(this.hideSelectionMenuForInquiry, cxChatDataState.hideSelectionMenuForInquiry) && Intrinsics.areEqual(this.hideSuggestedResponsesForInquiry, cxChatDataState.hideSuggestedResponsesForInquiry);
    }

    public int hashCode() {
        int iHashCode = ((this.initialStatus.hashCode() * 31) + this.uploadStatus.hashCode()) * 31;
        ChatbotSession chatbotSession = this.chatbotSession;
        int iHashCode2 = (iHashCode + (chatbotSession == null ? 0 : chatbotSession.hashCode())) * 31;
        AgentChatSession agentChatSession = this.agentChatSession;
        return ((((((((((((iHashCode2 + (agentChatSession != null ? agentChatSession.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasInternetConnection)) * 31) + this.pendingMessages.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.dialogData.hashCode()) * 31) + this.hideSelectionMenuForInquiry.hashCode()) * 31) + this.hideSuggestedResponsesForInquiry.hashCode();
    }

    public String toString() {
        return "CxChatDataState(initialStatus=" + this.initialStatus + ", uploadStatus=" + this.uploadStatus + ", chatbotSession=" + this.chatbotSession + ", agentChatSession=" + this.agentChatSession + ", hasInternetConnection=" + this.hasInternetConnection + ", pendingMessages=" + this.pendingMessages + ", bottomSheetData=" + this.bottomSheetData + ", dialogData=" + this.dialogData + ", hideSelectionMenuForInquiry=" + this.hideSelectionMenuForInquiry + ", hideSuggestedResponsesForInquiry=" + this.hideSuggestedResponsesForInquiry + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CxChatDataState(InitialStatus initialStatus, UploadStatus uploadStatus, ChatbotSession chatbotSession, AgentChatSession agentChatSession, boolean z, List<? extends UnsentInput> pendingMessages, CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData, Set<UUID> hideSelectionMenuForInquiry, Set<UUID> hideSuggestedResponsesForInquiry) {
        Intrinsics.checkNotNullParameter(initialStatus, "initialStatus");
        Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
        Intrinsics.checkNotNullParameter(pendingMessages, "pendingMessages");
        Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        Intrinsics.checkNotNullParameter(hideSelectionMenuForInquiry, "hideSelectionMenuForInquiry");
        Intrinsics.checkNotNullParameter(hideSuggestedResponsesForInquiry, "hideSuggestedResponsesForInquiry");
        this.initialStatus = initialStatus;
        this.uploadStatus = uploadStatus;
        this.chatbotSession = chatbotSession;
        this.agentChatSession = agentChatSession;
        this.hasInternetConnection = z;
        this.pendingMessages = pendingMessages;
        this.bottomSheetData = bottomSheetData;
        this.dialogData = dialogData;
        this.hideSelectionMenuForInquiry = hideSelectionMenuForInquiry;
        this.hideSuggestedResponsesForInquiry = hideSuggestedResponsesForInquiry;
    }

    public /* synthetic */ CxChatDataState(InitialStatus initialStatus, UploadStatus uploadStatus, ChatbotSession chatbotSession, AgentChatSession agentChatSession, boolean z, List list, CxChatBottomSheetData cxChatBottomSheetData, CxChatDialogData cxChatDialogData, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InitialStatus.Loading.INSTANCE : initialStatus, (i & 2) != 0 ? UploadStatus.None.INSTANCE : uploadStatus, (i & 4) != 0 ? null : chatbotSession, (i & 8) != 0 ? null : agentChatSession, (i & 16) != 0 ? false : z, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CxChatBottomSheetData.None.INSTANCE : cxChatBottomSheetData, (i & 128) != 0 ? CxChatDialogData.None.INSTANCE : cxChatDialogData, (i & 256) != 0 ? SetsKt.emptySet() : set, (i & 512) != 0 ? SetsKt.emptySet() : set2);
    }

    public final InitialStatus getInitialStatus() {
        return this.initialStatus;
    }

    public final UploadStatus getUploadStatus() {
        return this.uploadStatus;
    }

    public final ChatbotSession getChatbotSession() {
        return this.chatbotSession;
    }

    public final AgentChatSession getAgentChatSession() {
        return this.agentChatSession;
    }

    public final boolean getHasInternetConnection() {
        return this.hasInternetConnection;
    }

    public final List<UnsentInput> getPendingMessages() {
        return this.pendingMessages;
    }

    public final CxChatBottomSheetData getBottomSheetData() {
        return this.bottomSheetData;
    }

    public final CxChatDialogData getDialogData() {
        return this.dialogData;
    }

    public final Set<UUID> getHideSelectionMenuForInquiry() {
        return this.hideSelectionMenuForInquiry;
    }

    public final Set<UUID> getHideSuggestedResponsesForInquiry() {
        return this.hideSuggestedResponsesForInquiry;
    }

    /* compiled from: CxChatDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "", "Loading", "Success", "FailedFetching", "FailedCreating", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$FailedCreating;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$FailedFetching;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$Loading;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$Success;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InitialStatus {

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$Loading;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements InitialStatus {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 527968967;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$Success;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "supportChat", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;", "initialChatType", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialChatType;", "<init>", "(Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialChatType;)V", "getSupportChat", "()Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;", "getInitialChatType", "()Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialChatType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements InitialStatus {
            public static final int $stable = 8;
            private final InitialChatType initialChatType;
            private final SupportChat supportChat;

            public static /* synthetic */ Success copy$default(Success success, SupportChat supportChat, InitialChatType initialChatType, int i, Object obj) {
                if ((i & 1) != 0) {
                    supportChat = success.supportChat;
                }
                if ((i & 2) != 0) {
                    initialChatType = success.initialChatType;
                }
                return success.copy(supportChat, initialChatType);
            }

            /* renamed from: component1, reason: from getter */
            public final SupportChat getSupportChat() {
                return this.supportChat;
            }

            /* renamed from: component2, reason: from getter */
            public final InitialChatType getInitialChatType() {
                return this.initialChatType;
            }

            public final Success copy(SupportChat supportChat, InitialChatType initialChatType) {
                Intrinsics.checkNotNullParameter(supportChat, "supportChat");
                return new Success(supportChat, initialChatType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.supportChat, success.supportChat) && this.initialChatType == success.initialChatType;
            }

            public int hashCode() {
                int iHashCode = this.supportChat.hashCode() * 31;
                InitialChatType initialChatType = this.initialChatType;
                return iHashCode + (initialChatType == null ? 0 : initialChatType.hashCode());
            }

            public String toString() {
                return "Success(supportChat=" + this.supportChat + ", initialChatType=" + this.initialChatType + ")";
            }

            public Success(SupportChat supportChat, InitialChatType initialChatType) {
                Intrinsics.checkNotNullParameter(supportChat, "supportChat");
                this.supportChat = supportChat;
                this.initialChatType = initialChatType;
            }

            public /* synthetic */ Success(SupportChat supportChat, InitialChatType initialChatType, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(supportChat, (i & 2) != 0 ? null : initialChatType);
            }

            public final SupportChat getSupportChat() {
                return this.supportChat;
            }

            public final InitialChatType getInitialChatType() {
                return this.initialChatType;
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$FailedFetching;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "inquiryId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getInquiryId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FailedFetching implements InitialStatus {
            public static final int $stable = 8;
            private final UUID inquiryId;

            public static /* synthetic */ FailedFetching copy$default(FailedFetching failedFetching, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = failedFetching.inquiryId;
                }
                return failedFetching.copy(uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getInquiryId() {
                return this.inquiryId;
            }

            public final FailedFetching copy(UUID inquiryId) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                return new FailedFetching(inquiryId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FailedFetching) && Intrinsics.areEqual(this.inquiryId, ((FailedFetching) other).inquiryId);
            }

            public int hashCode() {
                return this.inquiryId.hashCode();
            }

            public String toString() {
                return "FailedFetching(inquiryId=" + this.inquiryId + ")";
            }

            public FailedFetching(UUID inquiryId) {
                Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                this.inquiryId = inquiryId;
            }

            public final UUID getInquiryId() {
                return this.inquiryId;
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus$FailedCreating;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FailedCreating implements InitialStatus {
            public static final int $stable = 0;
            public static final FailedCreating INSTANCE = new FailedCreating();

            public boolean equals(Object other) {
                return this == other || (other instanceof FailedCreating);
            }

            public int hashCode() {
                return 1379192363;
            }

            public String toString() {
                return "FailedCreating";
            }

            private FailedCreating() {
            }
        }
    }

    /* compiled from: CxChatDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "", "None", "CtaEndChat", "SendChatbotUserMessage", "Action", "SendSuggestedResponse", "FetchPreviousMessages", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$CtaEndChat;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$FetchPreviousMessages;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$None;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$SendChatbotUserMessage;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$SendSuggestedResponse;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface UploadStatus {

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$None;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements UploadStatus {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return 434181078;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$CtaEndChat;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CtaEndChat implements UploadStatus {
            public static final int $stable = 0;
            public static final CtaEndChat INSTANCE = new CtaEndChat();

            public boolean equals(Object other) {
                return this == other || (other instanceof CtaEndChat);
            }

            public int hashCode() {
                return 4867265;
            }

            public String toString() {
                return "CtaEndChat";
            }

            private CtaEndChat() {
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$SendChatbotUserMessage;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SendChatbotUserMessage implements UploadStatus {
            public static final int $stable = 0;
            public static final SendChatbotUserMessage INSTANCE = new SendChatbotUserMessage();

            public boolean equals(Object other) {
                return this == other || (other instanceof SendChatbotUserMessage);
            }

            public int hashCode() {
                return -105462381;
            }

            public String toString() {
                return "SendChatbotUserMessage";
            }

            private SendChatbotUserMessage() {
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "uploadingActionLocalId", "", "getUploadingActionLocalId", "()Ljava/lang/String;", "SendCta", "EndChat", "ResumeChat", "Escalate", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$EndChat;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$Escalate;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$ResumeChat;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$SendCta;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Action extends UploadStatus {
            String getUploadingActionLocalId();

            /* compiled from: CxChatDataState.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$SendCta;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action;", "uploadingActionLocalId", "", "<init>", "(Ljava/lang/String;)V", "getUploadingActionLocalId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class SendCta implements Action {
                public static final int $stable = 0;
                private final String uploadingActionLocalId;

                public static /* synthetic */ SendCta copy$default(SendCta sendCta, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = sendCta.uploadingActionLocalId;
                    }
                    return sendCta.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }

                public final SendCta copy(String uploadingActionLocalId) {
                    return new SendCta(uploadingActionLocalId);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SendCta) && Intrinsics.areEqual(this.uploadingActionLocalId, ((SendCta) other).uploadingActionLocalId);
                }

                public int hashCode() {
                    String str = this.uploadingActionLocalId;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return "SendCta(uploadingActionLocalId=" + this.uploadingActionLocalId + ")";
                }

                public SendCta(String str) {
                    this.uploadingActionLocalId = str;
                }

                @Override // com.robinhood.android.supportchat.thread.CxChatDataState.UploadStatus.Action
                public String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }
            }

            /* compiled from: CxChatDataState.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$EndChat;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action;", "uploadingActionLocalId", "", "<init>", "(Ljava/lang/String;)V", "getUploadingActionLocalId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class EndChat implements Action {
                public static final int $stable = 0;
                private final String uploadingActionLocalId;

                public static /* synthetic */ EndChat copy$default(EndChat endChat, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = endChat.uploadingActionLocalId;
                    }
                    return endChat.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }

                public final EndChat copy(String uploadingActionLocalId) {
                    return new EndChat(uploadingActionLocalId);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EndChat) && Intrinsics.areEqual(this.uploadingActionLocalId, ((EndChat) other).uploadingActionLocalId);
                }

                public int hashCode() {
                    String str = this.uploadingActionLocalId;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return "EndChat(uploadingActionLocalId=" + this.uploadingActionLocalId + ")";
                }

                public EndChat(String str) {
                    this.uploadingActionLocalId = str;
                }

                @Override // com.robinhood.android.supportchat.thread.CxChatDataState.UploadStatus.Action
                public String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }
            }

            /* compiled from: CxChatDataState.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$ResumeChat;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action;", "uploadingActionLocalId", "", "<init>", "(Ljava/lang/String;)V", "getUploadingActionLocalId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class ResumeChat implements Action {
                public static final int $stable = 0;
                private final String uploadingActionLocalId;

                public static /* synthetic */ ResumeChat copy$default(ResumeChat resumeChat, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = resumeChat.uploadingActionLocalId;
                    }
                    return resumeChat.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }

                public final ResumeChat copy(String uploadingActionLocalId) {
                    return new ResumeChat(uploadingActionLocalId);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ResumeChat) && Intrinsics.areEqual(this.uploadingActionLocalId, ((ResumeChat) other).uploadingActionLocalId);
                }

                public int hashCode() {
                    String str = this.uploadingActionLocalId;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return "ResumeChat(uploadingActionLocalId=" + this.uploadingActionLocalId + ")";
                }

                public ResumeChat(String str) {
                    this.uploadingActionLocalId = str;
                }

                @Override // com.robinhood.android.supportchat.thread.CxChatDataState.UploadStatus.Action
                public String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }
            }

            /* compiled from: CxChatDataState.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action$Escalate;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$Action;", "uploadingActionLocalId", "", "<init>", "(Ljava/lang/String;)V", "getUploadingActionLocalId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Escalate implements Action {
                public static final int $stable = 0;
                private final String uploadingActionLocalId;

                public static /* synthetic */ Escalate copy$default(Escalate escalate, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = escalate.uploadingActionLocalId;
                    }
                    return escalate.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }

                public final Escalate copy(String uploadingActionLocalId) {
                    return new Escalate(uploadingActionLocalId);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Escalate) && Intrinsics.areEqual(this.uploadingActionLocalId, ((Escalate) other).uploadingActionLocalId);
                }

                public int hashCode() {
                    String str = this.uploadingActionLocalId;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public String toString() {
                    return "Escalate(uploadingActionLocalId=" + this.uploadingActionLocalId + ")";
                }

                public Escalate(String str) {
                    this.uploadingActionLocalId = str;
                }

                @Override // com.robinhood.android.supportchat.thread.CxChatDataState.UploadStatus.Action
                public String getUploadingActionLocalId() {
                    return this.uploadingActionLocalId;
                }
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$SendSuggestedResponse;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "suggestedResponseId", "", "<init>", "(Ljava/lang/String;)V", "getSuggestedResponseId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SendSuggestedResponse implements UploadStatus {
            public static final int $stable = 0;
            private final String suggestedResponseId;

            public static /* synthetic */ SendSuggestedResponse copy$default(SendSuggestedResponse sendSuggestedResponse, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sendSuggestedResponse.suggestedResponseId;
                }
                return sendSuggestedResponse.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSuggestedResponseId() {
                return this.suggestedResponseId;
            }

            public final SendSuggestedResponse copy(String suggestedResponseId) {
                Intrinsics.checkNotNullParameter(suggestedResponseId, "suggestedResponseId");
                return new SendSuggestedResponse(suggestedResponseId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendSuggestedResponse) && Intrinsics.areEqual(this.suggestedResponseId, ((SendSuggestedResponse) other).suggestedResponseId);
            }

            public int hashCode() {
                return this.suggestedResponseId.hashCode();
            }

            public String toString() {
                return "SendSuggestedResponse(suggestedResponseId=" + this.suggestedResponseId + ")";
            }

            public SendSuggestedResponse(String suggestedResponseId) {
                Intrinsics.checkNotNullParameter(suggestedResponseId, "suggestedResponseId");
                this.suggestedResponseId = suggestedResponseId;
            }

            public final String getSuggestedResponseId() {
                return this.suggestedResponseId;
            }
        }

        /* compiled from: CxChatDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus$FetchPreviousMessages;", "Lcom/robinhood/android/supportchat/thread/CxChatDataState$UploadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FetchPreviousMessages implements UploadStatus {
            public static final int $stable = 0;
            public static final FetchPreviousMessages INSTANCE = new FetchPreviousMessages();

            public boolean equals(Object other) {
                return this == other || (other instanceof FetchPreviousMessages);
            }

            public int hashCode() {
                return -191792289;
            }

            public String toString() {
                return "FetchPreviousMessages";
            }

            private FetchPreviousMessages() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CxChatDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatDataState$InitialChatType;", "", "<init>", "(Ljava/lang/String;I)V", "CHATBOT_CHAT", "AGENT_CHAT", "ESCALATED_CHAT", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InitialChatType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InitialChatType[] $VALUES;
        public static final InitialChatType CHATBOT_CHAT = new InitialChatType("CHATBOT_CHAT", 0);
        public static final InitialChatType AGENT_CHAT = new InitialChatType("AGENT_CHAT", 1);
        public static final InitialChatType ESCALATED_CHAT = new InitialChatType("ESCALATED_CHAT", 2);

        private static final /* synthetic */ InitialChatType[] $values() {
            return new InitialChatType[]{CHATBOT_CHAT, AGENT_CHAT, ESCALATED_CHAT};
        }

        public static EnumEntries<InitialChatType> getEntries() {
            return $ENTRIES;
        }

        private InitialChatType(String str, int i) {
        }

        static {
            InitialChatType[] initialChatTypeArr$values = $values();
            $VALUES = initialChatTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(initialChatTypeArr$values);
        }

        public static InitialChatType valueOf(String str) {
            return (InitialChatType) Enum.valueOf(InitialChatType.class, str);
        }

        public static InitialChatType[] values() {
            return (InitialChatType[]) $VALUES.clone();
        }
    }
}
