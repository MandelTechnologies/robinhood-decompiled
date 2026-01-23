package com.robinhood.android.supportchat.thread;

import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomControls;
import com.robinhood.android.supportchat.thread.compose.CxChatBottomSheetData;
import com.robinhood.android.supportchat.thread.compose.CxChatDialogData;
import com.robinhood.android.supportchat.thread.compose.CxChatTopBar5;
import com.robinhood.models.p355ui.p356v2.ChatbotSuggestedResponse;
import com.robinhood.models.p355ui.pathfinder.messaging.ChatMode;
import com.robinhood.models.supportchat.p353db.SupportChatBanner;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CxChatViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "", "bottomSheetData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "getBottomSheetData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "getDialogData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "topBarState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "getTopBarState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getChatMode", "()Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "Loading", "Success", "FailedFetching", "FailedCreating", "BottomControlState", "TopBarState", "ContentState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$FailedCreating;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$FailedFetching;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$Loading;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$Success;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface CxChatViewState {
    CxChatBottomSheetData getBottomSheetData();

    ChatMode getChatMode();

    CxChatDialogData getDialogData();

    TopBarState getTopBarState();

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$Loading;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "bottomSheetData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;)V", "getBottomSheetData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "getDialogData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getChatMode", "()Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "topBarState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "getTopBarState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements CxChatViewState {
        public static final int $stable = 8;
        private final CxChatBottomSheetData bottomSheetData;
        private final ChatMode chatMode;
        private final CxChatDialogData dialogData;
        private final TopBarState topBarState;

        public static /* synthetic */ Loading copy$default(Loading loading, CxChatBottomSheetData cxChatBottomSheetData, CxChatDialogData cxChatDialogData, int i, Object obj) {
            if ((i & 1) != 0) {
                cxChatBottomSheetData = loading.bottomSheetData;
            }
            if ((i & 2) != 0) {
                cxChatDialogData = loading.dialogData;
            }
            return loading.copy(cxChatBottomSheetData, cxChatDialogData);
        }

        /* renamed from: component1, reason: from getter */
        public final CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        /* renamed from: component2, reason: from getter */
        public final CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        public final Loading copy(CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData) {
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            return new Loading(bottomSheetData, dialogData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.bottomSheetData, loading.bottomSheetData) && Intrinsics.areEqual(this.dialogData, loading.dialogData);
        }

        public int hashCode() {
            return (this.bottomSheetData.hashCode() * 31) + this.dialogData.hashCode();
        }

        public String toString() {
            return "Loading(bottomSheetData=" + this.bottomSheetData + ", dialogData=" + this.dialogData + ")";
        }

        public Loading(CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData) {
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            this.bottomSheetData = bottomSheetData;
            this.dialogData = dialogData;
            this.topBarState = TopBarState.Empty.INSTANCE;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public ChatMode getChatMode() {
            return this.chatMode;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }
    }

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u0011HÆ\u0003JY\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$Success;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "inquiryId", "Ljava/util/UUID;", "initialInput", "", "contentState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "bottomControlState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "bottomSheetData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "topBarState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;)V", "getInquiryId", "()Ljava/util/UUID;", "getInitialInput", "()Ljava/lang/String;", "getContentState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "getBottomControlState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "getChatMode", "()Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getBottomSheetData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "getDialogData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "getTopBarState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements CxChatViewState {
        public static final int $stable = 8;
        private final BottomControlState bottomControlState;
        private final CxChatBottomSheetData bottomSheetData;
        private final ChatMode chatMode;
        private final ContentState contentState;
        private final CxChatDialogData dialogData;
        private final String initialInput;
        private final UUID inquiryId;
        private final TopBarState topBarState;

        public static /* synthetic */ Success copy$default(Success success, UUID uuid, String str, ContentState contentState, BottomControlState bottomControlState, ChatMode chatMode, CxChatBottomSheetData cxChatBottomSheetData, CxChatDialogData cxChatDialogData, TopBarState topBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = success.inquiryId;
            }
            if ((i & 2) != 0) {
                str = success.initialInput;
            }
            if ((i & 4) != 0) {
                contentState = success.contentState;
            }
            if ((i & 8) != 0) {
                bottomControlState = success.bottomControlState;
            }
            if ((i & 16) != 0) {
                chatMode = success.chatMode;
            }
            if ((i & 32) != 0) {
                cxChatBottomSheetData = success.bottomSheetData;
            }
            if ((i & 64) != 0) {
                cxChatDialogData = success.dialogData;
            }
            if ((i & 128) != 0) {
                topBarState = success.topBarState;
            }
            CxChatDialogData cxChatDialogData2 = cxChatDialogData;
            TopBarState topBarState2 = topBarState;
            ChatMode chatMode2 = chatMode;
            CxChatBottomSheetData cxChatBottomSheetData2 = cxChatBottomSheetData;
            return success.copy(uuid, str, contentState, bottomControlState, chatMode2, cxChatBottomSheetData2, cxChatDialogData2, topBarState2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialInput() {
            return this.initialInput;
        }

        /* renamed from: component3, reason: from getter */
        public final ContentState getContentState() {
            return this.contentState;
        }

        /* renamed from: component4, reason: from getter */
        public final BottomControlState getBottomControlState() {
            return this.bottomControlState;
        }

        /* renamed from: component5, reason: from getter */
        public final ChatMode getChatMode() {
            return this.chatMode;
        }

        /* renamed from: component6, reason: from getter */
        public final CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        /* renamed from: component7, reason: from getter */
        public final CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        /* renamed from: component8, reason: from getter */
        public final TopBarState getTopBarState() {
            return this.topBarState;
        }

        public final Success copy(UUID inquiryId, String initialInput, ContentState contentState, BottomControlState bottomControlState, ChatMode chatMode, CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData, TopBarState topBarState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(initialInput, "initialInput");
            Intrinsics.checkNotNullParameter(contentState, "contentState");
            Intrinsics.checkNotNullParameter(bottomControlState, "bottomControlState");
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            return new Success(inquiryId, initialInput, contentState, bottomControlState, chatMode, bottomSheetData, dialogData, topBarState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.inquiryId, success.inquiryId) && Intrinsics.areEqual(this.initialInput, success.initialInput) && Intrinsics.areEqual(this.contentState, success.contentState) && Intrinsics.areEqual(this.bottomControlState, success.bottomControlState) && Intrinsics.areEqual(this.chatMode, success.chatMode) && Intrinsics.areEqual(this.bottomSheetData, success.bottomSheetData) && Intrinsics.areEqual(this.dialogData, success.dialogData) && Intrinsics.areEqual(this.topBarState, success.topBarState);
        }

        public int hashCode() {
            return (((((((((((((this.inquiryId.hashCode() * 31) + this.initialInput.hashCode()) * 31) + this.contentState.hashCode()) * 31) + this.bottomControlState.hashCode()) * 31) + this.chatMode.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31) + this.dialogData.hashCode()) * 31) + this.topBarState.hashCode();
        }

        public String toString() {
            return "Success(inquiryId=" + this.inquiryId + ", initialInput=" + this.initialInput + ", contentState=" + this.contentState + ", bottomControlState=" + this.bottomControlState + ", chatMode=" + this.chatMode + ", bottomSheetData=" + this.bottomSheetData + ", dialogData=" + this.dialogData + ", topBarState=" + this.topBarState + ")";
        }

        public Success(UUID inquiryId, String initialInput, ContentState contentState, BottomControlState bottomControlState, ChatMode chatMode, CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData, TopBarState topBarState) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(initialInput, "initialInput");
            Intrinsics.checkNotNullParameter(contentState, "contentState");
            Intrinsics.checkNotNullParameter(bottomControlState, "bottomControlState");
            Intrinsics.checkNotNullParameter(chatMode, "chatMode");
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            Intrinsics.checkNotNullParameter(topBarState, "topBarState");
            this.inquiryId = inquiryId;
            this.initialInput = initialInput;
            this.contentState = contentState;
            this.bottomControlState = bottomControlState;
            this.chatMode = chatMode;
            this.bottomSheetData = bottomSheetData;
            this.dialogData = dialogData;
            this.topBarState = topBarState;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        public final String getInitialInput() {
            return this.initialInput;
        }

        public final ContentState getContentState() {
            return this.contentState;
        }

        public final BottomControlState getBottomControlState() {
            return this.bottomControlState;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public ChatMode getChatMode() {
            return this.chatMode;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }
    }

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J'\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$FailedFetching;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "inquiryId", "Ljava/util/UUID;", "bottomSheetData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;)V", "getInquiryId", "()Ljava/util/UUID;", "getBottomSheetData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "getDialogData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getChatMode", "()Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "topBarState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "getTopBarState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FailedFetching implements CxChatViewState {
        public static final int $stable = 8;
        private final CxChatBottomSheetData bottomSheetData;
        private final ChatMode chatMode;
        private final CxChatDialogData dialogData;
        private final UUID inquiryId;
        private final TopBarState topBarState;

        public static /* synthetic */ FailedFetching copy$default(FailedFetching failedFetching, UUID uuid, CxChatBottomSheetData cxChatBottomSheetData, CxChatDialogData cxChatDialogData, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = failedFetching.inquiryId;
            }
            if ((i & 2) != 0) {
                cxChatBottomSheetData = failedFetching.bottomSheetData;
            }
            if ((i & 4) != 0) {
                cxChatDialogData = failedFetching.dialogData;
            }
            return failedFetching.copy(uuid, cxChatBottomSheetData, cxChatDialogData);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        /* renamed from: component2, reason: from getter */
        public final CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        /* renamed from: component3, reason: from getter */
        public final CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        public final FailedFetching copy(UUID inquiryId, CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            return new FailedFetching(inquiryId, bottomSheetData, dialogData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedFetching)) {
                return false;
            }
            FailedFetching failedFetching = (FailedFetching) other;
            return Intrinsics.areEqual(this.inquiryId, failedFetching.inquiryId) && Intrinsics.areEqual(this.bottomSheetData, failedFetching.bottomSheetData) && Intrinsics.areEqual(this.dialogData, failedFetching.dialogData);
        }

        public int hashCode() {
            return (((this.inquiryId.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.dialogData.hashCode();
        }

        public String toString() {
            return "FailedFetching(inquiryId=" + this.inquiryId + ", bottomSheetData=" + this.bottomSheetData + ", dialogData=" + this.dialogData + ")";
        }

        public FailedFetching(UUID inquiryId, CxChatBottomSheetData bottomSheetData, CxChatDialogData dialogData) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(bottomSheetData, "bottomSheetData");
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            this.inquiryId = inquiryId;
            this.bottomSheetData = bottomSheetData;
            this.dialogData = dialogData;
            this.topBarState = TopBarState.Empty.INSTANCE;
        }

        public final UUID getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public ChatMode getChatMode() {
            return this.chatMode;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }
    }

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$FailedCreating;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState;", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "<init>", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;)V", "getDialogData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "chatMode", "Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "getChatMode", "()Lcom/robinhood/models/ui/pathfinder/messaging/ChatMode;", "topBarState", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "getTopBarState", "()Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "bottomSheetData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "getBottomSheetData", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomSheetData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FailedCreating implements CxChatViewState {
        public static final int $stable = 8;
        private final CxChatBottomSheetData bottomSheetData;
        private final ChatMode chatMode;
        private final CxChatDialogData dialogData;
        private final TopBarState topBarState;

        public static /* synthetic */ FailedCreating copy$default(FailedCreating failedCreating, CxChatDialogData cxChatDialogData, int i, Object obj) {
            if ((i & 1) != 0) {
                cxChatDialogData = failedCreating.dialogData;
            }
            return failedCreating.copy(cxChatDialogData);
        }

        /* renamed from: component1, reason: from getter */
        public final CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        public final FailedCreating copy(CxChatDialogData dialogData) {
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            return new FailedCreating(dialogData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FailedCreating) && Intrinsics.areEqual(this.dialogData, ((FailedCreating) other).dialogData);
        }

        public int hashCode() {
            return this.dialogData.hashCode();
        }

        public String toString() {
            return "FailedCreating(dialogData=" + this.dialogData + ")";
        }

        public FailedCreating(CxChatDialogData dialogData) {
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            this.dialogData = dialogData;
            this.topBarState = TopBarState.Empty.INSTANCE;
            this.bottomSheetData = CxChatBottomSheetData.None.INSTANCE;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatDialogData getDialogData() {
            return this.dialogData;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public ChatMode getChatMode() {
            return this.chatMode;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        @Override // com.robinhood.android.supportchat.thread.CxChatViewState
        public CxChatBottomSheetData getBottomSheetData() {
            return this.bottomSheetData;
        }
    }

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "", "placeholder", "", "getPlaceholder", "()Ljava/lang/String;", "sendButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "getSendButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "imageButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "getImageButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "input", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "getInput", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "Hidden", "Loading", "Disabled", "SendingDisabled", "Enabled", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Disabled;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Enabled;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Hidden;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Loading;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$SendingDisabled;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BottomControlState {
        CxChatBottomControls.ImageButton getImageButton();

        CxChatBottomControls.Input getInput();

        String getPlaceholder();

        CxChatBottomControls.SendButton getSendButton();

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Hidden;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "<init>", "()V", "placeholder", "", "getPlaceholder", "()Ljava/lang/String;", "sendButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "getSendButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "imageButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "getImageButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "input", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "getInput", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Hidden implements BottomControlState {
            public static final int $stable = 0;
            private static final String placeholder = null;
            public static final Hidden INSTANCE = new Hidden();
            private static final CxChatBottomControls.SendButton sendButton = CxChatBottomControls.SendButton.Hidden;
            private static final CxChatBottomControls.ImageButton imageButton = CxChatBottomControls.ImageButton.Hidden;
            private static final CxChatBottomControls.Input input = CxChatBottomControls.Input.Hidden;

            public boolean equals(Object other) {
                return this == other || (other instanceof Hidden);
            }

            public int hashCode() {
                return 230907649;
            }

            public String toString() {
                return "Hidden";
            }

            private Hidden() {
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public String getPlaceholder() {
                return placeholder;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.SendButton getSendButton() {
                return sendButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.ImageButton getImageButton() {
                return imageButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.Input getInput() {
                return input;
            }
        }

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Loading;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "placeholder", "", "imageButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;)V", "canShowImageButton", "", "(ZLjava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getImageButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "sendButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "getSendButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "input", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "getInput", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements BottomControlState {
            public static final int $stable = 0;
            private final CxChatBottomControls.ImageButton imageButton;
            private final CxChatBottomControls.Input input;
            private final String placeholder;
            private final CxChatBottomControls.SendButton sendButton;

            public static /* synthetic */ Loading copy$default(Loading loading, String str, CxChatBottomControls.ImageButton imageButton, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loading.placeholder;
                }
                if ((i & 2) != 0) {
                    imageButton = loading.imageButton;
                }
                return loading.copy(str, imageButton);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component2, reason: from getter */
            public final CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            public final Loading copy(String placeholder, CxChatBottomControls.ImageButton imageButton) {
                Intrinsics.checkNotNullParameter(imageButton, "imageButton");
                return new Loading(placeholder, imageButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) other;
                return Intrinsics.areEqual(this.placeholder, loading.placeholder) && this.imageButton == loading.imageButton;
            }

            public int hashCode() {
                String str = this.placeholder;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.imageButton.hashCode();
            }

            public String toString() {
                return "Loading(placeholder=" + this.placeholder + ", imageButton=" + this.imageButton + ")";
            }

            public Loading(String str, CxChatBottomControls.ImageButton imageButton) {
                Intrinsics.checkNotNullParameter(imageButton, "imageButton");
                this.placeholder = str;
                this.imageButton = imageButton;
                this.sendButton = CxChatBottomControls.SendButton.Loading;
                this.input = CxChatBottomControls.Input.Disabled;
            }

            public /* synthetic */ Loading(String str, CxChatBottomControls.ImageButton imageButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, imageButton);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public String getPlaceholder() {
                return this.placeholder;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            public /* synthetic */ Loading(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : str);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Loading(boolean z, String str) {
                CxChatBottomControls.ImageButton imageButton;
                if (z) {
                    imageButton = CxChatBottomControls.ImageButton.Disabled;
                } else {
                    imageButton = CxChatBottomControls.ImageButton.Hidden;
                }
                this(str, imageButton);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.SendButton getSendButton() {
                return this.sendButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.Input getInput() {
                return this.input;
            }
        }

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Disabled;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "imageButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "placeholder", "", "<init>", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;Ljava/lang/String;)V", "canShowImageButton", "", "(ZLjava/lang/String;)V", "getImageButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "getPlaceholder", "()Ljava/lang/String;", "sendButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "getSendButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "input", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "getInput", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Disabled implements BottomControlState {
            public static final int $stable = 0;
            private final CxChatBottomControls.ImageButton imageButton;
            private final CxChatBottomControls.Input input;
            private final String placeholder;
            private final CxChatBottomControls.SendButton sendButton;

            public static /* synthetic */ Disabled copy$default(Disabled disabled, CxChatBottomControls.ImageButton imageButton, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    imageButton = disabled.imageButton;
                }
                if ((i & 2) != 0) {
                    str = disabled.placeholder;
                }
                return disabled.copy(imageButton, str);
            }

            /* renamed from: component1, reason: from getter */
            public final CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            /* renamed from: component2, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final Disabled copy(CxChatBottomControls.ImageButton imageButton, String placeholder) {
                Intrinsics.checkNotNullParameter(imageButton, "imageButton");
                return new Disabled(imageButton, placeholder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disabled)) {
                    return false;
                }
                Disabled disabled = (Disabled) other;
                return this.imageButton == disabled.imageButton && Intrinsics.areEqual(this.placeholder, disabled.placeholder);
            }

            public int hashCode() {
                int iHashCode = this.imageButton.hashCode() * 31;
                String str = this.placeholder;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Disabled(imageButton=" + this.imageButton + ", placeholder=" + this.placeholder + ")";
            }

            public Disabled(CxChatBottomControls.ImageButton imageButton, String str) {
                Intrinsics.checkNotNullParameter(imageButton, "imageButton");
                this.imageButton = imageButton;
                this.placeholder = str;
                this.sendButton = CxChatBottomControls.SendButton.Disabled;
                this.input = CxChatBottomControls.Input.Disabled;
            }

            public /* synthetic */ Disabled(CxChatBottomControls.ImageButton imageButton, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(imageButton, (i & 2) != 0 ? null : str);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public String getPlaceholder() {
                return this.placeholder;
            }

            public /* synthetic */ Disabled(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : str);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Disabled(boolean z, String str) {
                CxChatBottomControls.ImageButton imageButton;
                if (z) {
                    imageButton = CxChatBottomControls.ImageButton.Disabled;
                } else {
                    imageButton = CxChatBottomControls.ImageButton.Hidden;
                }
                this(imageButton, str);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.SendButton getSendButton() {
                return this.sendButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.Input getInput() {
                return this.input;
            }
        }

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$SendingDisabled;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "placeholder", "", "<init>", "(Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "sendButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "getSendButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "imageButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "getImageButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "input", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "getInput", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SendingDisabled implements BottomControlState {
            public static final int $stable = 0;
            private final CxChatBottomControls.ImageButton imageButton;
            private final CxChatBottomControls.Input input;
            private final String placeholder;
            private final CxChatBottomControls.SendButton sendButton;

            /* JADX WARN: Multi-variable type inference failed */
            public SendingDisabled() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ SendingDisabled copy$default(SendingDisabled sendingDisabled, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = sendingDisabled.placeholder;
                }
                return sendingDisabled.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final SendingDisabled copy(String placeholder) {
                return new SendingDisabled(placeholder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendingDisabled) && Intrinsics.areEqual(this.placeholder, ((SendingDisabled) other).placeholder);
            }

            public int hashCode() {
                String str = this.placeholder;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SendingDisabled(placeholder=" + this.placeholder + ")";
            }

            public SendingDisabled(String str) {
                this.placeholder = str;
                this.sendButton = CxChatBottomControls.SendButton.Disabled;
                this.imageButton = CxChatBottomControls.ImageButton.Hidden;
                this.input = CxChatBottomControls.Input.Enabled;
            }

            public /* synthetic */ SendingDisabled(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public String getPlaceholder() {
                return this.placeholder;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.SendButton getSendButton() {
                return this.sendButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.Input getInput() {
                return this.input;
            }
        }

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState$Enabled;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$BottomControlState;", "placeholder", "", "imageButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;)V", "canShowImageButton", "", "(ZLjava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "getImageButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$ImageButton;", "sendButton", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "getSendButton", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$SendButton;", "input", "Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "getInput", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatBottomControlStyle$Input;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Enabled implements BottomControlState {
            public static final int $stable = 0;
            private final CxChatBottomControls.ImageButton imageButton;
            private final CxChatBottomControls.Input input;
            private final String placeholder;
            private final CxChatBottomControls.SendButton sendButton;

            public static /* synthetic */ Enabled copy$default(Enabled enabled, String str, CxChatBottomControls.ImageButton imageButton, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = enabled.placeholder;
                }
                if ((i & 2) != 0) {
                    imageButton = enabled.imageButton;
                }
                return enabled.copy(str, imageButton);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* renamed from: component2, reason: from getter */
            public final CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            public final Enabled copy(String placeholder, CxChatBottomControls.ImageButton imageButton) {
                Intrinsics.checkNotNullParameter(imageButton, "imageButton");
                return new Enabled(placeholder, imageButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Enabled)) {
                    return false;
                }
                Enabled enabled = (Enabled) other;
                return Intrinsics.areEqual(this.placeholder, enabled.placeholder) && this.imageButton == enabled.imageButton;
            }

            public int hashCode() {
                String str = this.placeholder;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.imageButton.hashCode();
            }

            public String toString() {
                return "Enabled(placeholder=" + this.placeholder + ", imageButton=" + this.imageButton + ")";
            }

            public Enabled(String str, CxChatBottomControls.ImageButton imageButton) {
                Intrinsics.checkNotNullParameter(imageButton, "imageButton");
                this.placeholder = str;
                this.imageButton = imageButton;
                this.sendButton = CxChatBottomControls.SendButton.Enabled;
                this.input = CxChatBottomControls.Input.Enabled;
            }

            public /* synthetic */ Enabled(String str, CxChatBottomControls.ImageButton imageButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, imageButton);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public String getPlaceholder() {
                return this.placeholder;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.ImageButton getImageButton() {
                return this.imageButton;
            }

            public /* synthetic */ Enabled(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, (i & 2) != 0 ? null : str);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Enabled(boolean z, String str) {
                CxChatBottomControls.ImageButton imageButton;
                if (z) {
                    imageButton = CxChatBottomControls.ImageButton.Enabled;
                } else {
                    imageButton = CxChatBottomControls.ImageButton.Hidden;
                }
                this(str, imageButton);
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.SendButton getSendButton() {
                return this.sendButton;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.BottomControlState
            public CxChatBottomControls.Input getInput() {
                return this.input;
            }
        }
    }

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "", "endButtonStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "getEndButtonStatus", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "Empty", "Loaded", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState$Empty;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState$Loaded;", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface TopBarState {
        CxChatTopBar5.EndButtonStatus getEndButtonStatus();

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState$Empty;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "<init>", "()V", "endButtonStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "getEndButtonStatus", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Empty implements TopBarState {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();
            private static final CxChatTopBar5.EndButtonStatus endButtonStatus = CxChatTopBar5.EndButtonStatus.Hidden;

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return 1137264538;
            }

            public String toString() {
                return "Empty";
            }

            private Empty() {
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.TopBarState
            public CxChatTopBar5.EndButtonStatus getEndButtonStatus() {
                return endButtonStatus;
            }
        }

        /* compiled from: CxChatViewState.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState$Loaded;", "Lcom/robinhood/android/supportchat/thread/CxChatViewState$TopBarState;", "title", "", "avatar", "Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "avatarSliverColor", "avatarStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "endButtonStatus", "Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;Ljava/lang/String;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;)V", "getTitle", "()Ljava/lang/String;", "getAvatar", "()Lcom/robinhood/android/libdesignsystem/serverui/PictogramAsset;", "getAvatarSliverColor", "getAvatarStatus", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$AvatarStatus;", "getEndButtonStatus", "()Lcom/robinhood/android/supportchat/thread/compose/CxChatTopBars$EndButtonStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements TopBarState {
            public static final int $stable = 0;
            private final ServerToBentoAssetMapper3 avatar;
            private final String avatarSliverColor;
            private final CxChatTopBar5.AvatarStatus avatarStatus;
            private final CxChatTopBar5.EndButtonStatus endButtonStatus;
            private final String title;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, ServerToBentoAssetMapper3 serverToBentoAssetMapper3, String str2, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loaded.title;
                }
                if ((i & 2) != 0) {
                    serverToBentoAssetMapper3 = loaded.avatar;
                }
                if ((i & 4) != 0) {
                    str2 = loaded.avatarSliverColor;
                }
                if ((i & 8) != 0) {
                    avatarStatus = loaded.avatarStatus;
                }
                if ((i & 16) != 0) {
                    endButtonStatus = loaded.endButtonStatus;
                }
                CxChatTopBar5.EndButtonStatus endButtonStatus2 = endButtonStatus;
                String str3 = str2;
                return loaded.copy(str, serverToBentoAssetMapper3, str3, avatarStatus, endButtonStatus2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final ServerToBentoAssetMapper3 getAvatar() {
                return this.avatar;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAvatarSliverColor() {
                return this.avatarSliverColor;
            }

            /* renamed from: component4, reason: from getter */
            public final CxChatTopBar5.AvatarStatus getAvatarStatus() {
                return this.avatarStatus;
            }

            /* renamed from: component5, reason: from getter */
            public final CxChatTopBar5.EndButtonStatus getEndButtonStatus() {
                return this.endButtonStatus;
            }

            public final Loaded copy(String title, ServerToBentoAssetMapper3 avatar, String avatarSliverColor, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                Intrinsics.checkNotNullParameter(avatarSliverColor, "avatarSliverColor");
                Intrinsics.checkNotNullParameter(avatarStatus, "avatarStatus");
                Intrinsics.checkNotNullParameter(endButtonStatus, "endButtonStatus");
                return new Loaded(title, avatar, avatarSliverColor, avatarStatus, endButtonStatus);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.title, loaded.title) && this.avatar == loaded.avatar && Intrinsics.areEqual(this.avatarSliverColor, loaded.avatarSliverColor) && this.avatarStatus == loaded.avatarStatus && this.endButtonStatus == loaded.endButtonStatus;
            }

            public int hashCode() {
                return (((((((this.title.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.avatarSliverColor.hashCode()) * 31) + this.avatarStatus.hashCode()) * 31) + this.endButtonStatus.hashCode();
            }

            public String toString() {
                return "Loaded(title=" + this.title + ", avatar=" + this.avatar + ", avatarSliverColor=" + this.avatarSliverColor + ", avatarStatus=" + this.avatarStatus + ", endButtonStatus=" + this.endButtonStatus + ")";
            }

            public Loaded(String title, ServerToBentoAssetMapper3 avatar, String avatarSliverColor, CxChatTopBar5.AvatarStatus avatarStatus, CxChatTopBar5.EndButtonStatus endButtonStatus) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                Intrinsics.checkNotNullParameter(avatarSliverColor, "avatarSliverColor");
                Intrinsics.checkNotNullParameter(avatarStatus, "avatarStatus");
                Intrinsics.checkNotNullParameter(endButtonStatus, "endButtonStatus");
                this.title = title;
                this.avatar = avatar;
                this.avatarSliverColor = avatarSliverColor;
                this.avatarStatus = avatarStatus;
                this.endButtonStatus = endButtonStatus;
            }

            public final String getTitle() {
                return this.title;
            }

            public final ServerToBentoAssetMapper3 getAvatar() {
                return this.avatar;
            }

            public final String getAvatarSliverColor() {
                return this.avatarSliverColor;
            }

            public final CxChatTopBar5.AvatarStatus getAvatarStatus() {
                return this.avatarStatus;
            }

            @Override // com.robinhood.android.supportchat.thread.CxChatViewState.TopBarState
            public CxChatTopBar5.EndButtonStatus getEndButtonStatus() {
                return this.endButtonStatus;
            }
        }
    }

    /* compiled from: CxChatViewState.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0088\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "", "isSendingActionInput", "", "isFetchingPreviousMessages", "selectedSuggestedResponseId", "", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/supportchat/db/SupportChatBanner;", "secondaryBanner", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "chatbotSuggestedResponses", "Lcom/robinhood/models/ui/v2/ChatbotSuggestedResponse;", "chatbotPageCursor", "agentChatPageCursor", "", "hasInternetConnection", "<init>", "(ZZLjava/lang/String;Lcom/robinhood/models/supportchat/db/SupportChatBanner;Lcom/robinhood/models/supportchat/db/SupportChatBanner;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/Long;Z)V", "()Z", "getSelectedSuggestedResponseId", "()Ljava/lang/String;", "getBanner", "()Lcom/robinhood/models/supportchat/db/SupportChatBanner;", "getSecondaryBanner", "getMessages", "()Lkotlinx/collections/immutable/ImmutableList;", "getChatbotSuggestedResponses", "getChatbotPageCursor", "getAgentChatPageCursor", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHasInternetConnection", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ZZLjava/lang/String;Lcom/robinhood/models/supportchat/db/SupportChatBanner;Lcom/robinhood/models/supportchat/db/SupportChatBanner;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/Long;Z)Lcom/robinhood/android/supportchat/thread/CxChatViewState$ContentState;", "equals", "other", "hashCode", "", "toString", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContentState {
        public static final int $stable = 8;
        private final Long agentChatPageCursor;
        private final SupportChatBanner banner;
        private final String chatbotPageCursor;
        private final ImmutableList<ChatbotSuggestedResponse> chatbotSuggestedResponses;
        private final boolean hasInternetConnection;
        private final boolean isFetchingPreviousMessages;
        private final boolean isSendingActionInput;
        private final ImmutableList<UiChatMessage> messages;
        private final SupportChatBanner secondaryBanner;
        private final String selectedSuggestedResponseId;

        public static /* synthetic */ ContentState copy$default(ContentState contentState, boolean z, boolean z2, String str, SupportChatBanner supportChatBanner, SupportChatBanner supportChatBanner2, ImmutableList immutableList, ImmutableList immutableList2, String str2, Long l, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = contentState.isSendingActionInput;
            }
            if ((i & 2) != 0) {
                z2 = contentState.isFetchingPreviousMessages;
            }
            if ((i & 4) != 0) {
                str = contentState.selectedSuggestedResponseId;
            }
            if ((i & 8) != 0) {
                supportChatBanner = contentState.banner;
            }
            if ((i & 16) != 0) {
                supportChatBanner2 = contentState.secondaryBanner;
            }
            if ((i & 32) != 0) {
                immutableList = contentState.messages;
            }
            if ((i & 64) != 0) {
                immutableList2 = contentState.chatbotSuggestedResponses;
            }
            if ((i & 128) != 0) {
                str2 = contentState.chatbotPageCursor;
            }
            if ((i & 256) != 0) {
                l = contentState.agentChatPageCursor;
            }
            if ((i & 512) != 0) {
                z3 = contentState.hasInternetConnection;
            }
            Long l2 = l;
            boolean z4 = z3;
            ImmutableList immutableList3 = immutableList2;
            String str3 = str2;
            SupportChatBanner supportChatBanner3 = supportChatBanner2;
            ImmutableList immutableList4 = immutableList;
            return contentState.copy(z, z2, str, supportChatBanner, supportChatBanner3, immutableList4, immutableList3, str3, l2, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSendingActionInput() {
            return this.isSendingActionInput;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getHasInternetConnection() {
            return this.hasInternetConnection;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsFetchingPreviousMessages() {
            return this.isFetchingPreviousMessages;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSelectedSuggestedResponseId() {
            return this.selectedSuggestedResponseId;
        }

        /* renamed from: component4, reason: from getter */
        public final SupportChatBanner getBanner() {
            return this.banner;
        }

        /* renamed from: component5, reason: from getter */
        public final SupportChatBanner getSecondaryBanner() {
            return this.secondaryBanner;
        }

        public final ImmutableList<UiChatMessage> component6() {
            return this.messages;
        }

        public final ImmutableList<ChatbotSuggestedResponse> component7() {
            return this.chatbotSuggestedResponses;
        }

        /* renamed from: component8, reason: from getter */
        public final String getChatbotPageCursor() {
            return this.chatbotPageCursor;
        }

        /* renamed from: component9, reason: from getter */
        public final Long getAgentChatPageCursor() {
            return this.agentChatPageCursor;
        }

        public final ContentState copy(boolean isSendingActionInput, boolean isFetchingPreviousMessages, String selectedSuggestedResponseId, SupportChatBanner banner, SupportChatBanner secondaryBanner, ImmutableList<? extends UiChatMessage> messages, ImmutableList<ChatbotSuggestedResponse> chatbotSuggestedResponses, String chatbotPageCursor, Long agentChatPageCursor, boolean hasInternetConnection) {
            Intrinsics.checkNotNullParameter(messages, "messages");
            Intrinsics.checkNotNullParameter(chatbotSuggestedResponses, "chatbotSuggestedResponses");
            return new ContentState(isSendingActionInput, isFetchingPreviousMessages, selectedSuggestedResponseId, banner, secondaryBanner, messages, chatbotSuggestedResponses, chatbotPageCursor, agentChatPageCursor, hasInternetConnection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentState)) {
                return false;
            }
            ContentState contentState = (ContentState) other;
            return this.isSendingActionInput == contentState.isSendingActionInput && this.isFetchingPreviousMessages == contentState.isFetchingPreviousMessages && Intrinsics.areEqual(this.selectedSuggestedResponseId, contentState.selectedSuggestedResponseId) && Intrinsics.areEqual(this.banner, contentState.banner) && Intrinsics.areEqual(this.secondaryBanner, contentState.secondaryBanner) && Intrinsics.areEqual(this.messages, contentState.messages) && Intrinsics.areEqual(this.chatbotSuggestedResponses, contentState.chatbotSuggestedResponses) && Intrinsics.areEqual(this.chatbotPageCursor, contentState.chatbotPageCursor) && Intrinsics.areEqual(this.agentChatPageCursor, contentState.agentChatPageCursor) && this.hasInternetConnection == contentState.hasInternetConnection;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isSendingActionInput) * 31) + Boolean.hashCode(this.isFetchingPreviousMessages)) * 31;
            String str = this.selectedSuggestedResponseId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            SupportChatBanner supportChatBanner = this.banner;
            int iHashCode3 = (iHashCode2 + (supportChatBanner == null ? 0 : supportChatBanner.hashCode())) * 31;
            SupportChatBanner supportChatBanner2 = this.secondaryBanner;
            int iHashCode4 = (((((iHashCode3 + (supportChatBanner2 == null ? 0 : supportChatBanner2.hashCode())) * 31) + this.messages.hashCode()) * 31) + this.chatbotSuggestedResponses.hashCode()) * 31;
            String str2 = this.chatbotPageCursor;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.agentChatPageCursor;
            return ((iHashCode5 + (l != null ? l.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasInternetConnection);
        }

        public String toString() {
            return "ContentState(isSendingActionInput=" + this.isSendingActionInput + ", isFetchingPreviousMessages=" + this.isFetchingPreviousMessages + ", selectedSuggestedResponseId=" + this.selectedSuggestedResponseId + ", banner=" + this.banner + ", secondaryBanner=" + this.secondaryBanner + ", messages=" + this.messages + ", chatbotSuggestedResponses=" + this.chatbotSuggestedResponses + ", chatbotPageCursor=" + this.chatbotPageCursor + ", agentChatPageCursor=" + this.agentChatPageCursor + ", hasInternetConnection=" + this.hasInternetConnection + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentState(boolean z, boolean z2, String str, SupportChatBanner supportChatBanner, SupportChatBanner supportChatBanner2, ImmutableList<? extends UiChatMessage> messages, ImmutableList<ChatbotSuggestedResponse> chatbotSuggestedResponses, String str2, Long l, boolean z3) {
            Intrinsics.checkNotNullParameter(messages, "messages");
            Intrinsics.checkNotNullParameter(chatbotSuggestedResponses, "chatbotSuggestedResponses");
            this.isSendingActionInput = z;
            this.isFetchingPreviousMessages = z2;
            this.selectedSuggestedResponseId = str;
            this.banner = supportChatBanner;
            this.secondaryBanner = supportChatBanner2;
            this.messages = messages;
            this.chatbotSuggestedResponses = chatbotSuggestedResponses;
            this.chatbotPageCursor = str2;
            this.agentChatPageCursor = l;
            this.hasInternetConnection = z3;
        }

        public final boolean isSendingActionInput() {
            return this.isSendingActionInput;
        }

        public final boolean isFetchingPreviousMessages() {
            return this.isFetchingPreviousMessages;
        }

        public final String getSelectedSuggestedResponseId() {
            return this.selectedSuggestedResponseId;
        }

        public final SupportChatBanner getBanner() {
            return this.banner;
        }

        public final SupportChatBanner getSecondaryBanner() {
            return this.secondaryBanner;
        }

        public final ImmutableList<UiChatMessage> getMessages() {
            return this.messages;
        }

        public final ImmutableList<ChatbotSuggestedResponse> getChatbotSuggestedResponses() {
            return this.chatbotSuggestedResponses;
        }

        public final String getChatbotPageCursor() {
            return this.chatbotPageCursor;
        }

        public final Long getAgentChatPageCursor() {
            return this.agentChatPageCursor;
        }

        public final boolean getHasInternetConnection() {
            return this.hasInternetConnection;
        }
    }
}
