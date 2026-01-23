package com.robinhood.android.supportchat;

import com.robinhood.models.p355ui.SimpleChatIssue;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportChatListDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDataState;", "", "loadingState", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;", "agentChatToPreviewMessages", "", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "agentChatToUnreadMessageCount", "", "isInitialPreviewLoadingComplete", "", "previewMessageLoadingFailed", "<init>", "(Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;Ljava/util/Map;Ljava/util/Map;ZZ)V", "getLoadingState", "()Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;", "getAgentChatToPreviewMessages", "()Ljava/util/Map;", "getAgentChatToUnreadMessageCount", "()Z", "getPreviewMessageLoadingFailed", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "SupportChatListLoadStatus", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SupportChatListDataState {
    public static final int $stable = 8;
    private final Map<String, SocketChatMessage> agentChatToPreviewMessages;
    private final Map<String, Long> agentChatToUnreadMessageCount;
    private final boolean isInitialPreviewLoadingComplete;
    private final SupportChatListLoadStatus loadingState;
    private final boolean previewMessageLoadingFailed;

    public SupportChatListDataState() {
        this(null, null, null, false, false, 31, null);
    }

    public static /* synthetic */ SupportChatListDataState copy$default(SupportChatListDataState supportChatListDataState, SupportChatListLoadStatus supportChatListLoadStatus, Map map, Map map2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            supportChatListLoadStatus = supportChatListDataState.loadingState;
        }
        if ((i & 2) != 0) {
            map = supportChatListDataState.agentChatToPreviewMessages;
        }
        if ((i & 4) != 0) {
            map2 = supportChatListDataState.agentChatToUnreadMessageCount;
        }
        if ((i & 8) != 0) {
            z = supportChatListDataState.isInitialPreviewLoadingComplete;
        }
        if ((i & 16) != 0) {
            z2 = supportChatListDataState.previewMessageLoadingFailed;
        }
        boolean z3 = z2;
        Map map3 = map2;
        return supportChatListDataState.copy(supportChatListLoadStatus, map, map3, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final SupportChatListLoadStatus getLoadingState() {
        return this.loadingState;
    }

    public final Map<String, SocketChatMessage> component2() {
        return this.agentChatToPreviewMessages;
    }

    public final Map<String, Long> component3() {
        return this.agentChatToUnreadMessageCount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInitialPreviewLoadingComplete() {
        return this.isInitialPreviewLoadingComplete;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPreviewMessageLoadingFailed() {
        return this.previewMessageLoadingFailed;
    }

    public final SupportChatListDataState copy(SupportChatListLoadStatus loadingState, Map<String, SocketChatMessage> agentChatToPreviewMessages, Map<String, Long> agentChatToUnreadMessageCount, boolean isInitialPreviewLoadingComplete, boolean previewMessageLoadingFailed) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(agentChatToPreviewMessages, "agentChatToPreviewMessages");
        Intrinsics.checkNotNullParameter(agentChatToUnreadMessageCount, "agentChatToUnreadMessageCount");
        return new SupportChatListDataState(loadingState, agentChatToPreviewMessages, agentChatToUnreadMessageCount, isInitialPreviewLoadingComplete, previewMessageLoadingFailed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportChatListDataState)) {
            return false;
        }
        SupportChatListDataState supportChatListDataState = (SupportChatListDataState) other;
        return Intrinsics.areEqual(this.loadingState, supportChatListDataState.loadingState) && Intrinsics.areEqual(this.agentChatToPreviewMessages, supportChatListDataState.agentChatToPreviewMessages) && Intrinsics.areEqual(this.agentChatToUnreadMessageCount, supportChatListDataState.agentChatToUnreadMessageCount) && this.isInitialPreviewLoadingComplete == supportChatListDataState.isInitialPreviewLoadingComplete && this.previewMessageLoadingFailed == supportChatListDataState.previewMessageLoadingFailed;
    }

    public int hashCode() {
        return (((((((this.loadingState.hashCode() * 31) + this.agentChatToPreviewMessages.hashCode()) * 31) + this.agentChatToUnreadMessageCount.hashCode()) * 31) + Boolean.hashCode(this.isInitialPreviewLoadingComplete)) * 31) + Boolean.hashCode(this.previewMessageLoadingFailed);
    }

    public String toString() {
        return "SupportChatListDataState(loadingState=" + this.loadingState + ", agentChatToPreviewMessages=" + this.agentChatToPreviewMessages + ", agentChatToUnreadMessageCount=" + this.agentChatToUnreadMessageCount + ", isInitialPreviewLoadingComplete=" + this.isInitialPreviewLoadingComplete + ", previewMessageLoadingFailed=" + this.previewMessageLoadingFailed + ")";
    }

    public SupportChatListDataState(SupportChatListLoadStatus loadingState, Map<String, SocketChatMessage> agentChatToPreviewMessages, Map<String, Long> agentChatToUnreadMessageCount, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(agentChatToPreviewMessages, "agentChatToPreviewMessages");
        Intrinsics.checkNotNullParameter(agentChatToUnreadMessageCount, "agentChatToUnreadMessageCount");
        this.loadingState = loadingState;
        this.agentChatToPreviewMessages = agentChatToPreviewMessages;
        this.agentChatToUnreadMessageCount = agentChatToUnreadMessageCount;
        this.isInitialPreviewLoadingComplete = z;
        this.previewMessageLoadingFailed = z2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SupportChatListDataState(com.robinhood.android.supportchat.SupportChatListDataState.SupportChatListLoadStatus r2, java.util.Map r3, java.util.Map r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.robinhood.android.supportchat.SupportChatListDataState$SupportChatListLoadStatus$Loading r2 = com.robinhood.android.supportchat.SupportChatListDataState.SupportChatListLoadStatus.Loading.INSTANCE
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Le
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
        Le:
            r8 = r7 & 4
            if (r8 == 0) goto L16
            java.util.Map r4 = kotlin.collections.MapsKt.emptyMap()
        L16:
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L1c
            r5 = r0
        L1c:
            r7 = r7 & 16
            if (r7 == 0) goto L27
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2d
        L27:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2d:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.supportchat.SupportChatListDataState.<init>(com.robinhood.android.supportchat.SupportChatListDataState$SupportChatListLoadStatus, java.util.Map, java.util.Map, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final SupportChatListLoadStatus getLoadingState() {
        return this.loadingState;
    }

    public final Map<String, SocketChatMessage> getAgentChatToPreviewMessages() {
        return this.agentChatToPreviewMessages;
    }

    public final Map<String, Long> getAgentChatToUnreadMessageCount() {
        return this.agentChatToUnreadMessageCount;
    }

    public final boolean isInitialPreviewLoadingComplete() {
        return this.isInitialPreviewLoadingComplete;
    }

    public final boolean getPreviewMessageLoadingFailed() {
        return this.previewMessageLoadingFailed;
    }

    /* compiled from: SupportChatListDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;", "", "Loading", "Success", "Failed", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus$Failed;", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus$Loading;", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus$Success;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface SupportChatListLoadStatus {

        /* compiled from: SupportChatListDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus$Loading;", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements SupportChatListLoadStatus {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -360597478;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: SupportChatListDataState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus$Success;", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;", "chatIssues", "", "Lcom/robinhood/models/ui/SimpleChatIssue;", "<init>", "(Ljava/util/List;)V", "getChatIssues", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements SupportChatListLoadStatus {
            public static final int $stable = 8;
            private final List<SimpleChatIssue> chatIssues;

            /* JADX WARN: Multi-variable type inference failed */
            public Success() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = success.chatIssues;
                }
                return success.copy(list);
            }

            public final List<SimpleChatIssue> component1() {
                return this.chatIssues;
            }

            public final Success copy(List<SimpleChatIssue> chatIssues) {
                Intrinsics.checkNotNullParameter(chatIssues, "chatIssues");
                return new Success(chatIssues);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.chatIssues, ((Success) other).chatIssues);
            }

            public int hashCode() {
                return this.chatIssues.hashCode();
            }

            public String toString() {
                return "Success(chatIssues=" + this.chatIssues + ")";
            }

            public Success(List<SimpleChatIssue> chatIssues) {
                Intrinsics.checkNotNullParameter(chatIssues, "chatIssues");
                this.chatIssues = chatIssues;
            }

            public /* synthetic */ Success(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final List<SimpleChatIssue> getChatIssues() {
                return this.chatIssues;
            }
        }

        /* compiled from: SupportChatListDataState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus$Failed;", "Lcom/robinhood/android/supportchat/SupportChatListDataState$SupportChatListLoadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Failed implements SupportChatListLoadStatus {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            public boolean equals(Object other) {
                return this == other || (other instanceof Failed);
            }

            public int hashCode() {
                return 912288159;
            }

            public String toString() {
                return "Failed";
            }

            private Failed() {
            }
        }
    }
}
