package com.robinhood.android.matcha.p177ui.review;

import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewTransactionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u0087\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0010HÆ\u0001J\u0013\u00104\u001a\u00020\u00102\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionViewState;", "", "transferId", "Ljava/util/UUID;", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryText", "summaryText", "swipeHintText", "toolbarTitleText", "toolbarSubtitle", "avatar", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "bannerViewState", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "isSourceOfFundsEditable", "", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "showLoading", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/p2p/common/ProfileAvatarState;Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;ZLcom/robinhood/android/matcha/ui/review/MemoState;Z)V", "getTransferId", "()Ljava/util/UUID;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryText", "getSummaryText", "getSwipeHintText", "getToolbarTitleText", "getToolbarSubtitle", "getAvatar", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "getBannerViewState", "()Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionBannerViewState;", "()Z", "getMemoState", "()Lcom/robinhood/android/matcha/ui/review/MemoState;", "getShowLoading", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaReviewTransactionViewState {
    public static final int $stable = 8;
    private final ProfileAvatarState avatar;
    private final MatchaReviewTransactionViewState2 bannerViewState;
    private final boolean isSourceOfFundsEditable;
    private final MatchaReviewTransactionViewState3 memoState;
    private final StringResource primaryText;
    private final StringResource secondaryText;
    private final boolean showLoading;
    private final StringResource summaryText;
    private final StringResource swipeHintText;
    private final StringResource toolbarSubtitle;
    private final StringResource toolbarTitleText;
    private final UUID transferId;

    public static /* synthetic */ MatchaReviewTransactionViewState copy$default(MatchaReviewTransactionViewState matchaReviewTransactionViewState, UUID uuid, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, ProfileAvatarState profileAvatarState, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, boolean z, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = matchaReviewTransactionViewState.transferId;
        }
        if ((i & 2) != 0) {
            stringResource = matchaReviewTransactionViewState.primaryText;
        }
        if ((i & 4) != 0) {
            stringResource2 = matchaReviewTransactionViewState.secondaryText;
        }
        if ((i & 8) != 0) {
            stringResource3 = matchaReviewTransactionViewState.summaryText;
        }
        if ((i & 16) != 0) {
            stringResource4 = matchaReviewTransactionViewState.swipeHintText;
        }
        if ((i & 32) != 0) {
            stringResource5 = matchaReviewTransactionViewState.toolbarTitleText;
        }
        if ((i & 64) != 0) {
            stringResource6 = matchaReviewTransactionViewState.toolbarSubtitle;
        }
        if ((i & 128) != 0) {
            profileAvatarState = matchaReviewTransactionViewState.avatar;
        }
        if ((i & 256) != 0) {
            matchaReviewTransactionViewState2 = matchaReviewTransactionViewState.bannerViewState;
        }
        if ((i & 512) != 0) {
            z = matchaReviewTransactionViewState.isSourceOfFundsEditable;
        }
        if ((i & 1024) != 0) {
            matchaReviewTransactionViewState3 = matchaReviewTransactionViewState.memoState;
        }
        if ((i & 2048) != 0) {
            z2 = matchaReviewTransactionViewState.showLoading;
        }
        MatchaReviewTransactionViewState3 matchaReviewTransactionViewState32 = matchaReviewTransactionViewState3;
        boolean z3 = z2;
        MatchaReviewTransactionViewState2 matchaReviewTransactionViewState22 = matchaReviewTransactionViewState2;
        boolean z4 = z;
        StringResource stringResource7 = stringResource6;
        ProfileAvatarState profileAvatarState2 = profileAvatarState;
        StringResource stringResource8 = stringResource4;
        StringResource stringResource9 = stringResource5;
        return matchaReviewTransactionViewState.copy(uuid, stringResource, stringResource2, stringResource3, stringResource8, stringResource9, stringResource7, profileAvatarState2, matchaReviewTransactionViewState22, z4, matchaReviewTransactionViewState32, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getTransferId() {
        return this.transferId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSourceOfFundsEditable() {
        return this.isSourceOfFundsEditable;
    }

    /* renamed from: component11, reason: from getter */
    public final MatchaReviewTransactionViewState3 getMemoState() {
        return this.memoState;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSummaryText() {
        return this.summaryText;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSwipeHintText() {
        return this.swipeHintText;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getToolbarTitleText() {
        return this.toolbarTitleText;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final ProfileAvatarState getAvatar() {
        return this.avatar;
    }

    /* renamed from: component9, reason: from getter */
    public final MatchaReviewTransactionViewState2 getBannerViewState() {
        return this.bannerViewState;
    }

    public final MatchaReviewTransactionViewState copy(UUID transferId, StringResource primaryText, StringResource secondaryText, StringResource summaryText, StringResource swipeHintText, StringResource toolbarTitleText, StringResource toolbarSubtitle, ProfileAvatarState avatar, MatchaReviewTransactionViewState2 bannerViewState, boolean isSourceOfFundsEditable, MatchaReviewTransactionViewState3 memoState, boolean showLoading) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        Intrinsics.checkNotNullParameter(swipeHintText, "swipeHintText");
        Intrinsics.checkNotNullParameter(toolbarTitleText, "toolbarTitleText");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(bannerViewState, "bannerViewState");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        return new MatchaReviewTransactionViewState(transferId, primaryText, secondaryText, summaryText, swipeHintText, toolbarTitleText, toolbarSubtitle, avatar, bannerViewState, isSourceOfFundsEditable, memoState, showLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaReviewTransactionViewState)) {
            return false;
        }
        MatchaReviewTransactionViewState matchaReviewTransactionViewState = (MatchaReviewTransactionViewState) other;
        return Intrinsics.areEqual(this.transferId, matchaReviewTransactionViewState.transferId) && Intrinsics.areEqual(this.primaryText, matchaReviewTransactionViewState.primaryText) && Intrinsics.areEqual(this.secondaryText, matchaReviewTransactionViewState.secondaryText) && Intrinsics.areEqual(this.summaryText, matchaReviewTransactionViewState.summaryText) && Intrinsics.areEqual(this.swipeHintText, matchaReviewTransactionViewState.swipeHintText) && Intrinsics.areEqual(this.toolbarTitleText, matchaReviewTransactionViewState.toolbarTitleText) && Intrinsics.areEqual(this.toolbarSubtitle, matchaReviewTransactionViewState.toolbarSubtitle) && Intrinsics.areEqual(this.avatar, matchaReviewTransactionViewState.avatar) && Intrinsics.areEqual(this.bannerViewState, matchaReviewTransactionViewState.bannerViewState) && this.isSourceOfFundsEditable == matchaReviewTransactionViewState.isSourceOfFundsEditable && Intrinsics.areEqual(this.memoState, matchaReviewTransactionViewState.memoState) && this.showLoading == matchaReviewTransactionViewState.showLoading;
    }

    public int hashCode() {
        UUID uuid = this.transferId;
        int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + this.primaryText.hashCode()) * 31;
        StringResource stringResource = this.secondaryText;
        int iHashCode2 = (((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.summaryText.hashCode()) * 31) + this.swipeHintText.hashCode()) * 31) + this.toolbarTitleText.hashCode()) * 31;
        StringResource stringResource2 = this.toolbarSubtitle;
        return ((((((((((iHashCode2 + (stringResource2 != null ? stringResource2.hashCode() : 0)) * 31) + this.avatar.hashCode()) * 31) + this.bannerViewState.hashCode()) * 31) + Boolean.hashCode(this.isSourceOfFundsEditable)) * 31) + this.memoState.hashCode()) * 31) + Boolean.hashCode(this.showLoading);
    }

    public String toString() {
        return "MatchaReviewTransactionViewState(transferId=" + this.transferId + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", summaryText=" + this.summaryText + ", swipeHintText=" + this.swipeHintText + ", toolbarTitleText=" + this.toolbarTitleText + ", toolbarSubtitle=" + this.toolbarSubtitle + ", avatar=" + this.avatar + ", bannerViewState=" + this.bannerViewState + ", isSourceOfFundsEditable=" + this.isSourceOfFundsEditable + ", memoState=" + this.memoState + ", showLoading=" + this.showLoading + ")";
    }

    public MatchaReviewTransactionViewState(UUID uuid, StringResource primaryText, StringResource stringResource, StringResource summaryText, StringResource swipeHintText, StringResource toolbarTitleText, StringResource stringResource2, ProfileAvatarState avatar, MatchaReviewTransactionViewState2 bannerViewState, boolean z, MatchaReviewTransactionViewState3 memoState, boolean z2) {
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        Intrinsics.checkNotNullParameter(swipeHintText, "swipeHintText");
        Intrinsics.checkNotNullParameter(toolbarTitleText, "toolbarTitleText");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(bannerViewState, "bannerViewState");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        this.transferId = uuid;
        this.primaryText = primaryText;
        this.secondaryText = stringResource;
        this.summaryText = summaryText;
        this.swipeHintText = swipeHintText;
        this.toolbarTitleText = toolbarTitleText;
        this.toolbarSubtitle = stringResource2;
        this.avatar = avatar;
        this.bannerViewState = bannerViewState;
        this.isSourceOfFundsEditable = z;
        this.memoState = memoState;
        this.showLoading = z2;
    }

    public /* synthetic */ MatchaReviewTransactionViewState(UUID uuid, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, StringResource stringResource6, ProfileAvatarState profileAvatarState, MatchaReviewTransactionViewState2 matchaReviewTransactionViewState2, boolean z, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, stringResource, stringResource2, stringResource3, stringResource4, stringResource5, stringResource6, profileAvatarState, matchaReviewTransactionViewState2, z, matchaReviewTransactionViewState3, (i & 2048) != 0 ? false : z2);
    }

    public final UUID getTransferId() {
        return this.transferId;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final StringResource getSummaryText() {
        return this.summaryText;
    }

    public final StringResource getSwipeHintText() {
        return this.swipeHintText;
    }

    public final StringResource getToolbarTitleText() {
        return this.toolbarTitleText;
    }

    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final ProfileAvatarState getAvatar() {
        return this.avatar;
    }

    public final MatchaReviewTransactionViewState2 getBannerViewState() {
        return this.bannerViewState;
    }

    public final boolean isSourceOfFundsEditable() {
        return this.isSourceOfFundsEditable;
    }

    public final MatchaReviewTransactionViewState3 getMemoState() {
        return this.memoState;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }
}
