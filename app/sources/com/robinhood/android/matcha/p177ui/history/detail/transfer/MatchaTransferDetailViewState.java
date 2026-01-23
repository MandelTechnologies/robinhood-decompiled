package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.profile.MatchaProfileMenuBottomSheet;
import com.robinhood.android.social.contracts.CreateReportFragmentKey;
import com.robinhood.models.p320db.matcha.MatchaUser;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loading;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface MatchaTransferDetailViewState {

    /* compiled from: MatchaTransferDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loading;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements MatchaTransferDetailViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: MatchaTransferDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\\]^_B×\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070 \u0018\u00010\u0019\u0012\u0006\u0010!\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0012HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0012HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019HÆ\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019HÆ\u0003J\u0017\u0010T\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070 \u0018\u00010\u0019HÆ\u0003J\t\u0010U\u001a\u00020\"HÆ\u0003Jù\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00192\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00192\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070 \u0018\u00010\u00192\b\b\u0002\u0010!\u001a\u00020\"HÆ\u0001J\u0013\u0010W\u001a\u00020\"2\b\u0010X\u001a\u0004\u0018\u00010YHÖ\u0003J\t\u0010Z\u001a\u00020\u0012HÖ\u0001J\t\u0010[\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b>\u0010<R\u001f\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070 \u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b!\u0010@R\u0011\u0010A\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState;", "avatarState", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "formattedAmount", "", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", MemoInputActivity.EXTRA_MEMO, "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;", "status", "statusBanner", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;", "formattedDate", "transactor", "Lcom/robinhood/models/db/matcha/MatchaUser;", "transactorIdValue", "transactorIdLabel", "", "transactionId", "accountLabel", "dispute", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Dispute;", "disputeClawbackBannerText", "showMenuSheet", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileMenuBottomSheet$Args;", "launchReporting", "Lcom/robinhood/android/social/contracts/CreateReportFragmentKey;", "showBlockConfirmationDialog", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/ShowBlockConfirmationDialogEvent;", "blockResultEvent", "Lkotlin/Result;", "isBlocked", "", "<init>", "(Lcom/robinhood/p2p/common/ProfileAvatarState;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;Ljava/lang/String;Lcom/robinhood/models/db/matcha/MatchaUser;Ljava/lang/String;ILjava/lang/String;ILcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Dispute;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Z)V", "getAvatarState", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "getFormattedAmount", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMemo", "()Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;", "getStatus", "getStatusBanner", "()Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;", "getFormattedDate", "getTransactor", "()Lcom/robinhood/models/db/matcha/MatchaUser;", "getTransactorIdValue", "getTransactorIdLabel", "()I", "getTransactionId", "getAccountLabel", "getDispute", "()Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Dispute;", "getDisputeClawbackBannerText", "getShowMenuSheet", "()Lcom/robinhood/udf/UiEvent;", "getLaunchReporting", "getShowBlockConfirmationDialog", "getBlockResultEvent", "()Z", "showDispute", "getShowDispute", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "", "hashCode", "toString", "Dispute", "StatusBanner", "Memo", "MemoContent", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements MatchaTransferDetailViewState {
        public static final int $stable = 8;
        private final int accountLabel;
        private final ProfileAvatarState avatarState;
        private final UiEvent<Result<StringResource>> blockResultEvent;
        private final Dispute dispute;
        private final StringResource disputeClawbackBannerText;
        private final String formattedAmount;
        private final String formattedDate;
        private final boolean isBlocked;
        private final UiEvent<CreateReportFragmentKey> launchReporting;
        private final Memo memo;
        private final UiEvent<ShowBlockConfirmationDialogEvent> showBlockConfirmationDialog;
        private final UiEvent<MatchaProfileMenuBottomSheet.Args> showMenuSheet;
        private final StringResource status;
        private final StatusBanner statusBanner;
        private final StringResource subtitle;
        private final String transactionId;
        private final MatchaUser transactor;
        private final int transactorIdLabel;
        private final String transactorIdValue;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ProfileAvatarState profileAvatarState, String str, StringResource stringResource, Memo memo, StringResource stringResource2, StatusBanner statusBanner, String str2, MatchaUser matchaUser, String str3, int i, String str4, int i2, Dispute dispute, StringResource stringResource3, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z, int i3, Object obj) {
            boolean z2;
            UiEvent uiEvent5;
            ProfileAvatarState profileAvatarState2 = (i3 & 1) != 0 ? loaded.avatarState : profileAvatarState;
            String str5 = (i3 & 2) != 0 ? loaded.formattedAmount : str;
            StringResource stringResource4 = (i3 & 4) != 0 ? loaded.subtitle : stringResource;
            Memo memo2 = (i3 & 8) != 0 ? loaded.memo : memo;
            StringResource stringResource5 = (i3 & 16) != 0 ? loaded.status : stringResource2;
            StatusBanner statusBanner2 = (i3 & 32) != 0 ? loaded.statusBanner : statusBanner;
            String str6 = (i3 & 64) != 0 ? loaded.formattedDate : str2;
            MatchaUser matchaUser2 = (i3 & 128) != 0 ? loaded.transactor : matchaUser;
            String str7 = (i3 & 256) != 0 ? loaded.transactorIdValue : str3;
            int i4 = (i3 & 512) != 0 ? loaded.transactorIdLabel : i;
            String str8 = (i3 & 1024) != 0 ? loaded.transactionId : str4;
            int i5 = (i3 & 2048) != 0 ? loaded.accountLabel : i2;
            Dispute dispute2 = (i3 & 4096) != 0 ? loaded.dispute : dispute;
            StringResource stringResource6 = (i3 & 8192) != 0 ? loaded.disputeClawbackBannerText : stringResource3;
            ProfileAvatarState profileAvatarState3 = profileAvatarState2;
            UiEvent uiEvent6 = (i3 & 16384) != 0 ? loaded.showMenuSheet : uiEvent;
            UiEvent uiEvent7 = (i3 & 32768) != 0 ? loaded.launchReporting : uiEvent2;
            UiEvent uiEvent8 = (i3 & 65536) != 0 ? loaded.showBlockConfirmationDialog : uiEvent3;
            UiEvent uiEvent9 = (i3 & 131072) != 0 ? loaded.blockResultEvent : uiEvent4;
            if ((i3 & 262144) != 0) {
                uiEvent5 = uiEvent9;
                z2 = loaded.isBlocked;
            } else {
                z2 = z;
                uiEvent5 = uiEvent9;
            }
            return loaded.copy(profileAvatarState3, str5, stringResource4, memo2, stringResource5, statusBanner2, str6, matchaUser2, str7, i4, str8, i5, dispute2, stringResource6, uiEvent6, uiEvent7, uiEvent8, uiEvent5, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ProfileAvatarState getAvatarState() {
            return this.avatarState;
        }

        /* renamed from: component10, reason: from getter */
        public final int getTransactorIdLabel() {
            return this.transactorIdLabel;
        }

        /* renamed from: component11, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component12, reason: from getter */
        public final int getAccountLabel() {
            return this.accountLabel;
        }

        /* renamed from: component13, reason: from getter */
        public final Dispute getDispute() {
            return this.dispute;
        }

        /* renamed from: component14, reason: from getter */
        public final StringResource getDisputeClawbackBannerText() {
            return this.disputeClawbackBannerText;
        }

        public final UiEvent<MatchaProfileMenuBottomSheet.Args> component15() {
            return this.showMenuSheet;
        }

        public final UiEvent<CreateReportFragmentKey> component16() {
            return this.launchReporting;
        }

        public final UiEvent<ShowBlockConfirmationDialogEvent> component17() {
            return this.showBlockConfirmationDialog;
        }

        public final UiEvent<Result<StringResource>> component18() {
            return this.blockResultEvent;
        }

        /* renamed from: component19, reason: from getter */
        public final boolean getIsBlocked() {
            return this.isBlocked;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Memo getMemo() {
            return this.memo;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getStatus() {
            return this.status;
        }

        /* renamed from: component6, reason: from getter */
        public final StatusBanner getStatusBanner() {
            return this.statusBanner;
        }

        /* renamed from: component7, reason: from getter */
        public final String getFormattedDate() {
            return this.formattedDate;
        }

        /* renamed from: component8, reason: from getter */
        public final MatchaUser getTransactor() {
            return this.transactor;
        }

        /* renamed from: component9, reason: from getter */
        public final String getTransactorIdValue() {
            return this.transactorIdValue;
        }

        public final Loaded copy(ProfileAvatarState avatarState, String formattedAmount, StringResource subtitle, Memo memo, StringResource status, StatusBanner statusBanner, String formattedDate, MatchaUser transactor, String transactorIdValue, int transactorIdLabel, String transactionId, int accountLabel, Dispute dispute, StringResource disputeClawbackBannerText, UiEvent<MatchaProfileMenuBottomSheet.Args> showMenuSheet, UiEvent<CreateReportFragmentKey> launchReporting, UiEvent<ShowBlockConfirmationDialogEvent> showBlockConfirmationDialog, UiEvent<Result<StringResource>> blockResultEvent, boolean isBlocked) {
            Intrinsics.checkNotNullParameter(avatarState, "avatarState");
            Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            Intrinsics.checkNotNullParameter(transactor, "transactor");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            return new Loaded(avatarState, formattedAmount, subtitle, memo, status, statusBanner, formattedDate, transactor, transactorIdValue, transactorIdLabel, transactionId, accountLabel, dispute, disputeClawbackBannerText, showMenuSheet, launchReporting, showBlockConfirmationDialog, blockResultEvent, isBlocked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.avatarState, loaded.avatarState) && Intrinsics.areEqual(this.formattedAmount, loaded.formattedAmount) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.memo, loaded.memo) && Intrinsics.areEqual(this.status, loaded.status) && Intrinsics.areEqual(this.statusBanner, loaded.statusBanner) && Intrinsics.areEqual(this.formattedDate, loaded.formattedDate) && Intrinsics.areEqual(this.transactor, loaded.transactor) && Intrinsics.areEqual(this.transactorIdValue, loaded.transactorIdValue) && this.transactorIdLabel == loaded.transactorIdLabel && Intrinsics.areEqual(this.transactionId, loaded.transactionId) && this.accountLabel == loaded.accountLabel && Intrinsics.areEqual(this.dispute, loaded.dispute) && Intrinsics.areEqual(this.disputeClawbackBannerText, loaded.disputeClawbackBannerText) && Intrinsics.areEqual(this.showMenuSheet, loaded.showMenuSheet) && Intrinsics.areEqual(this.launchReporting, loaded.launchReporting) && Intrinsics.areEqual(this.showBlockConfirmationDialog, loaded.showBlockConfirmationDialog) && Intrinsics.areEqual(this.blockResultEvent, loaded.blockResultEvent) && this.isBlocked == loaded.isBlocked;
        }

        public int hashCode() {
            int iHashCode = ((((this.avatarState.hashCode() * 31) + this.formattedAmount.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
            Memo memo = this.memo;
            int iHashCode2 = (iHashCode + (memo == null ? 0 : memo.hashCode())) * 31;
            StringResource stringResource = this.status;
            int iHashCode3 = (iHashCode2 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            StatusBanner statusBanner = this.statusBanner;
            int iHashCode4 = (((((iHashCode3 + (statusBanner == null ? 0 : statusBanner.hashCode())) * 31) + this.formattedDate.hashCode()) * 31) + this.transactor.hashCode()) * 31;
            String str = this.transactorIdValue;
            int iHashCode5 = (((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.transactorIdLabel)) * 31) + this.transactionId.hashCode()) * 31) + Integer.hashCode(this.accountLabel)) * 31;
            Dispute dispute = this.dispute;
            int iHashCode6 = (iHashCode5 + (dispute == null ? 0 : dispute.hashCode())) * 31;
            StringResource stringResource2 = this.disputeClawbackBannerText;
            int iHashCode7 = (iHashCode6 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
            UiEvent<MatchaProfileMenuBottomSheet.Args> uiEvent = this.showMenuSheet;
            int iHashCode8 = (iHashCode7 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
            UiEvent<CreateReportFragmentKey> uiEvent2 = this.launchReporting;
            int iHashCode9 = (iHashCode8 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
            UiEvent<ShowBlockConfirmationDialogEvent> uiEvent3 = this.showBlockConfirmationDialog;
            int iHashCode10 = (iHashCode9 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
            UiEvent<Result<StringResource>> uiEvent4 = this.blockResultEvent;
            return ((iHashCode10 + (uiEvent4 != null ? uiEvent4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBlocked);
        }

        public String toString() {
            return "Loaded(avatarState=" + this.avatarState + ", formattedAmount=" + this.formattedAmount + ", subtitle=" + this.subtitle + ", memo=" + this.memo + ", status=" + this.status + ", statusBanner=" + this.statusBanner + ", formattedDate=" + this.formattedDate + ", transactor=" + this.transactor + ", transactorIdValue=" + this.transactorIdValue + ", transactorIdLabel=" + this.transactorIdLabel + ", transactionId=" + this.transactionId + ", accountLabel=" + this.accountLabel + ", dispute=" + this.dispute + ", disputeClawbackBannerText=" + this.disputeClawbackBannerText + ", showMenuSheet=" + this.showMenuSheet + ", launchReporting=" + this.launchReporting + ", showBlockConfirmationDialog=" + this.showBlockConfirmationDialog + ", blockResultEvent=" + this.blockResultEvent + ", isBlocked=" + this.isBlocked + ")";
        }

        public Loaded(ProfileAvatarState avatarState, String formattedAmount, StringResource subtitle, Memo memo, StringResource stringResource, StatusBanner statusBanner, String formattedDate, MatchaUser transactor, String str, int i, String transactionId, int i2, Dispute dispute, StringResource stringResource2, UiEvent<MatchaProfileMenuBottomSheet.Args> uiEvent, UiEvent<CreateReportFragmentKey> uiEvent2, UiEvent<ShowBlockConfirmationDialogEvent> uiEvent3, UiEvent<Result<StringResource>> uiEvent4, boolean z) {
            Intrinsics.checkNotNullParameter(avatarState, "avatarState");
            Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            Intrinsics.checkNotNullParameter(transactor, "transactor");
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.avatarState = avatarState;
            this.formattedAmount = formattedAmount;
            this.subtitle = subtitle;
            this.memo = memo;
            this.status = stringResource;
            this.statusBanner = statusBanner;
            this.formattedDate = formattedDate;
            this.transactor = transactor;
            this.transactorIdValue = str;
            this.transactorIdLabel = i;
            this.transactionId = transactionId;
            this.accountLabel = i2;
            this.dispute = dispute;
            this.disputeClawbackBannerText = stringResource2;
            this.showMenuSheet = uiEvent;
            this.launchReporting = uiEvent2;
            this.showBlockConfirmationDialog = uiEvent3;
            this.blockResultEvent = uiEvent4;
            this.isBlocked = z;
        }

        public /* synthetic */ Loaded(ProfileAvatarState profileAvatarState, String str, StringResource stringResource, Memo memo, StringResource stringResource2, StatusBanner statusBanner, String str2, MatchaUser matchaUser, String str3, int i, String str4, int i2, Dispute dispute, StringResource stringResource3, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(profileAvatarState, str, stringResource, memo, stringResource2, statusBanner, str2, matchaUser, str3, i, str4, i2, dispute, stringResource3, uiEvent, uiEvent2, uiEvent3, (i3 & 131072) != 0 ? null : uiEvent4, z);
        }

        public final ProfileAvatarState getAvatarState() {
            return this.avatarState;
        }

        public final String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final Memo getMemo() {
            return this.memo;
        }

        public final StringResource getStatus() {
            return this.status;
        }

        public final StatusBanner getStatusBanner() {
            return this.statusBanner;
        }

        public final String getFormattedDate() {
            return this.formattedDate;
        }

        public final MatchaUser getTransactor() {
            return this.transactor;
        }

        public final String getTransactorIdValue() {
            return this.transactorIdValue;
        }

        public final int getTransactorIdLabel() {
            return this.transactorIdLabel;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        public final int getAccountLabel() {
            return this.accountLabel;
        }

        public final Dispute getDispute() {
            return this.dispute;
        }

        public final StringResource getDisputeClawbackBannerText() {
            return this.disputeClawbackBannerText;
        }

        public final UiEvent<MatchaProfileMenuBottomSheet.Args> getShowMenuSheet() {
            return this.showMenuSheet;
        }

        public final UiEvent<CreateReportFragmentKey> getLaunchReporting() {
            return this.launchReporting;
        }

        public final UiEvent<ShowBlockConfirmationDialogEvent> getShowBlockConfirmationDialog() {
            return this.showBlockConfirmationDialog;
        }

        public final UiEvent<Result<StringResource>> getBlockResultEvent() {
            return this.blockResultEvent;
        }

        public final boolean isBlocked() {
            return this.isBlocked;
        }

        public final boolean getShowDispute() {
            return this.dispute != null;
        }

        /* compiled from: MatchaTransferDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Dispute;", "", "status", "", "statusDescription", "Lcom/robinhood/utils/resource/StringResource;", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getStatusDescription", "()Lcom/robinhood/utils/resource/StringResource;", "getCreatedAt", "getUpdatedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Dispute {
            public static final int $stable = StringResource.$stable;
            private final String createdAt;
            private final String status;
            private final StringResource statusDescription;
            private final String updatedAt;

            public static /* synthetic */ Dispute copy$default(Dispute dispute, String str, StringResource stringResource, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dispute.status;
                }
                if ((i & 2) != 0) {
                    stringResource = dispute.statusDescription;
                }
                if ((i & 4) != 0) {
                    str2 = dispute.createdAt;
                }
                if ((i & 8) != 0) {
                    str3 = dispute.updatedAt;
                }
                return dispute.copy(str, stringResource, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getStatusDescription() {
                return this.statusDescription;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCreatedAt() {
                return this.createdAt;
            }

            /* renamed from: component4, reason: from getter */
            public final String getUpdatedAt() {
                return this.updatedAt;
            }

            public final Dispute copy(String status, StringResource statusDescription, String createdAt, String updatedAt) {
                Intrinsics.checkNotNullParameter(status, "status");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
                return new Dispute(status, statusDescription, createdAt, updatedAt);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dispute)) {
                    return false;
                }
                Dispute dispute = (Dispute) other;
                return Intrinsics.areEqual(this.status, dispute.status) && Intrinsics.areEqual(this.statusDescription, dispute.statusDescription) && Intrinsics.areEqual(this.createdAt, dispute.createdAt) && Intrinsics.areEqual(this.updatedAt, dispute.updatedAt);
            }

            public int hashCode() {
                int iHashCode = this.status.hashCode() * 31;
                StringResource stringResource = this.statusDescription;
                return ((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
            }

            public String toString() {
                return "Dispute(status=" + this.status + ", statusDescription=" + this.statusDescription + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ")";
            }

            public Dispute(String status, StringResource stringResource, String createdAt, String updatedAt) {
                Intrinsics.checkNotNullParameter(status, "status");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
                this.status = status;
                this.statusDescription = stringResource;
                this.createdAt = createdAt;
                this.updatedAt = updatedAt;
            }

            public final String getStatus() {
                return this.status;
            }

            public final StringResource getStatusDescription() {
                return this.statusDescription;
            }

            public final String getCreatedAt() {
                return this.createdAt;
            }

            public final String getUpdatedAt() {
                return this.updatedAt;
            }
        }

        /* compiled from: MatchaTransferDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$StatusBanner;", "", "text", "", "showContactSupport", "", "<init>", "(IZ)V", "getText", "()I", "getShowContactSupport", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class StatusBanner {
            public static final int $stable = 0;
            private final boolean showContactSupport;
            private final int text;

            public static /* synthetic */ StatusBanner copy$default(StatusBanner statusBanner, int i, boolean z, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = statusBanner.text;
                }
                if ((i2 & 2) != 0) {
                    z = statusBanner.showContactSupport;
                }
                return statusBanner.copy(i, z);
            }

            /* renamed from: component1, reason: from getter */
            public final int getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowContactSupport() {
                return this.showContactSupport;
            }

            public final StatusBanner copy(int text, boolean showContactSupport) {
                return new StatusBanner(text, showContactSupport);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StatusBanner)) {
                    return false;
                }
                StatusBanner statusBanner = (StatusBanner) other;
                return this.text == statusBanner.text && this.showContactSupport == statusBanner.showContactSupport;
            }

            public int hashCode() {
                return (Integer.hashCode(this.text) * 31) + Boolean.hashCode(this.showContactSupport);
            }

            public String toString() {
                return "StatusBanner(text=" + this.text + ", showContactSupport=" + this.showContactSupport + ")";
            }

            public StatusBanner(int i, boolean z) {
                this.text = i;
                this.showContactSupport = z;
            }

            public final int getText() {
                return this.text;
            }

            public final boolean getShowContactSupport() {
                return this.showContactSupport;
            }
        }

        /* compiled from: MatchaTransferDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;", "", "content", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;", "bannerText", "", "bannerCta", "<init>", "(Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getContent", "()Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;", "getBannerText", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBannerCta", "component1", "component2", "component3", "copy", "(Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$Memo;", "equals", "", "other", "hashCode", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Memo {
            public static final int $stable = 8;
            private final Integer bannerCta;
            private final Integer bannerText;
            private final MemoContent content;

            public static /* synthetic */ Memo copy$default(Memo memo, MemoContent memoContent, Integer num, Integer num2, int i, Object obj) {
                if ((i & 1) != 0) {
                    memoContent = memo.content;
                }
                if ((i & 2) != 0) {
                    num = memo.bannerText;
                }
                if ((i & 4) != 0) {
                    num2 = memo.bannerCta;
                }
                return memo.copy(memoContent, num, num2);
            }

            /* renamed from: component1, reason: from getter */
            public final MemoContent getContent() {
                return this.content;
            }

            /* renamed from: component2, reason: from getter */
            public final Integer getBannerText() {
                return this.bannerText;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getBannerCta() {
                return this.bannerCta;
            }

            public final Memo copy(MemoContent content, Integer bannerText, Integer bannerCta) {
                Intrinsics.checkNotNullParameter(content, "content");
                return new Memo(content, bannerText, bannerCta);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Memo)) {
                    return false;
                }
                Memo memo = (Memo) other;
                return Intrinsics.areEqual(this.content, memo.content) && Intrinsics.areEqual(this.bannerText, memo.bannerText) && Intrinsics.areEqual(this.bannerCta, memo.bannerCta);
            }

            public int hashCode() {
                int iHashCode = this.content.hashCode() * 31;
                Integer num = this.bannerText;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.bannerCta;
                return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public String toString() {
                return "Memo(content=" + this.content + ", bannerText=" + this.bannerText + ", bannerCta=" + this.bannerCta + ")";
            }

            public Memo(MemoContent content, Integer num, Integer num2) {
                Intrinsics.checkNotNullParameter(content, "content");
                this.content = content;
                this.bannerText = num;
                this.bannerCta = num2;
            }

            public final MemoContent getContent() {
                return this.content;
            }

            public final Integer getBannerText() {
                return this.bannerText;
            }

            public final Integer getBannerCta() {
                return this.bannerCta;
            }
        }

        /* compiled from: MatchaTransferDetailViewState.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\f\r\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;", "", "text", "", "getText", "()Ljava/lang/String;", "revealedText", "getRevealedText", "showRevealButton", "", "getShowRevealButton", "()Z", "Approved", "Flagged", "Removed", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent$Approved;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent$Flagged;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent$Removed;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface MemoContent {
            String getRevealedText();

            boolean getShowRevealButton();

            String getText();

            /* compiled from: MatchaTransferDetailViewState.kt */
            @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent$Approved;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "showRevealButton", "", "getShowRevealButton", "()Z", "revealedText", "getRevealedText", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Approved implements MemoContent {
                public static final int $stable = 0;
                private final String revealedText;
                private final boolean showRevealButton;
                private final String text;

                public static /* synthetic */ Approved copy$default(Approved approved, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = approved.text;
                    }
                    return approved.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                public final Approved copy(String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new Approved(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Approved) && Intrinsics.areEqual(this.text, ((Approved) other).text);
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return "Approved(text=" + this.text + ")";
                }

                public Approved(String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.revealedText = getText();
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public String getText() {
                    return this.text;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public boolean getShowRevealButton() {
                    return this.showRevealButton;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public String getRevealedText() {
                    return this.revealedText;
                }
            }

            /* compiled from: MatchaTransferDetailViewState.kt */
            @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent$Flagged;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "text", "getText", "showRevealButton", "", "getShowRevealButton", "()Z", "revealedText", "getRevealedText", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Flagged implements MemoContent {
                public static final int $stable = 0;
                private final String content;
                private final String revealedText;
                private final boolean showRevealButton;
                private final String text;

                public static /* synthetic */ Flagged copy$default(Flagged flagged, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = flagged.content;
                    }
                    return flagged.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getContent() {
                    return this.content;
                }

                public final Flagged copy(String content) {
                    Intrinsics.checkNotNullParameter(content, "content");
                    return new Flagged(content);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Flagged) && Intrinsics.areEqual(this.content, ((Flagged) other).content);
                }

                public int hashCode() {
                    return this.content.hashCode();
                }

                public String toString() {
                    return "Flagged(content=" + this.content + ")";
                }

                public Flagged(String content) {
                    Intrinsics.checkNotNullParameter(content, "content");
                    this.content = content;
                    int length = content.length();
                    char[] cArr = new char[length];
                    for (int i = 0; i < length; i++) {
                        cArr[i] = '*';
                    }
                    this.text = new String(cArr);
                    this.showRevealButton = true;
                    this.revealedText = this.content;
                }

                public final String getContent() {
                    return this.content;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public String getText() {
                    return this.text;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public boolean getShowRevealButton() {
                    return this.showRevealButton;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public String getRevealedText() {
                    return this.revealedText;
                }
            }

            /* compiled from: MatchaTransferDetailViewState.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent$Removed;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailViewState$Loaded$MemoContent;", "<init>", "()V", "text", "", "getText", "()Ljava/lang/String;", "showRevealButton", "", "getShowRevealButton", "()Z", "revealedText", "getRevealedText", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Removed implements MemoContent {
                public static final int $stable = 0;
                public static final Removed INSTANCE;
                private static final String revealedText;
                private static final boolean showRevealButton = false;
                private static final String text;

                private Removed() {
                }

                static {
                    Removed removed = new Removed();
                    INSTANCE = removed;
                    text = "********";
                    revealedText = removed.getText();
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public String getText() {
                    return text;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public boolean getShowRevealButton() {
                    return showRevealButton;
                }

                @Override // com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailViewState.Loaded.MemoContent
                public String getRevealedText() {
                    return revealedText;
                }
            }
        }
    }
}
