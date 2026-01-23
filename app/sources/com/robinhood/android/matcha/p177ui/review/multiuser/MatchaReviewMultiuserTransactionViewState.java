package com.robinhood.android.matcha.p177ui.review.multiuser;

import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState3;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewMultiuserTransactionViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003Jw\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 ¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionViewState;", "", "transferId", "Ljava/util/UUID;", "summaryText", "Lcom/robinhood/utils/resource/StringResource;", "amountText", "", "swipeHintText", "toolbarTitleText", "toolbarSubtitle", "avatars", "", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "isSourceOfFundsEditable", "", "memoState", "Lcom/robinhood/android/matcha/ui/review/MemoState;", "showLoading", "<init>", "(Ljava/util/UUID;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;ZLcom/robinhood/android/matcha/ui/review/MemoState;Z)V", "getTransferId", "()Ljava/util/UUID;", "getSummaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getAmountText", "()Ljava/lang/String;", "getSwipeHintText", "getToolbarTitleText", "getToolbarSubtitle", "getAvatars", "()Ljava/util/List;", "()Z", "getMemoState", "()Lcom/robinhood/android/matcha/ui/review/MemoState;", "getShowLoading", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MatchaReviewMultiuserTransactionViewState {
    public static final int $stable = 8;
    private final String amountText;
    private final List<ProfileAvatarState> avatars;
    private final boolean isSourceOfFundsEditable;
    private final MatchaReviewTransactionViewState3 memoState;
    private final boolean showLoading;
    private final StringResource summaryText;
    private final StringResource swipeHintText;
    private final StringResource toolbarSubtitle;
    private final StringResource toolbarTitleText;
    private final UUID transferId;

    public static /* synthetic */ MatchaReviewMultiuserTransactionViewState copy$default(MatchaReviewMultiuserTransactionViewState matchaReviewMultiuserTransactionViewState, UUID uuid, StringResource stringResource, String str, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, List list, boolean z, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = matchaReviewMultiuserTransactionViewState.transferId;
        }
        if ((i & 2) != 0) {
            stringResource = matchaReviewMultiuserTransactionViewState.summaryText;
        }
        if ((i & 4) != 0) {
            str = matchaReviewMultiuserTransactionViewState.amountText;
        }
        if ((i & 8) != 0) {
            stringResource2 = matchaReviewMultiuserTransactionViewState.swipeHintText;
        }
        if ((i & 16) != 0) {
            stringResource3 = matchaReviewMultiuserTransactionViewState.toolbarTitleText;
        }
        if ((i & 32) != 0) {
            stringResource4 = matchaReviewMultiuserTransactionViewState.toolbarSubtitle;
        }
        if ((i & 64) != 0) {
            list = matchaReviewMultiuserTransactionViewState.avatars;
        }
        if ((i & 128) != 0) {
            z = matchaReviewMultiuserTransactionViewState.isSourceOfFundsEditable;
        }
        if ((i & 256) != 0) {
            matchaReviewTransactionViewState3 = matchaReviewMultiuserTransactionViewState.memoState;
        }
        if ((i & 512) != 0) {
            z2 = matchaReviewMultiuserTransactionViewState.showLoading;
        }
        MatchaReviewTransactionViewState3 matchaReviewTransactionViewState32 = matchaReviewTransactionViewState3;
        boolean z3 = z2;
        List list2 = list;
        boolean z4 = z;
        StringResource stringResource5 = stringResource3;
        StringResource stringResource6 = stringResource4;
        return matchaReviewMultiuserTransactionViewState.copy(uuid, stringResource, str, stringResource2, stringResource5, stringResource6, list2, z4, matchaReviewTransactionViewState32, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getTransferId() {
        return this.transferId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSummaryText() {
        return this.summaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSwipeHintText() {
        return this.swipeHintText;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getToolbarTitleText() {
        return this.toolbarTitleText;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    public final List<ProfileAvatarState> component7() {
        return this.avatars;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSourceOfFundsEditable() {
        return this.isSourceOfFundsEditable;
    }

    /* renamed from: component9, reason: from getter */
    public final MatchaReviewTransactionViewState3 getMemoState() {
        return this.memoState;
    }

    public final MatchaReviewMultiuserTransactionViewState copy(UUID transferId, StringResource summaryText, String amountText, StringResource swipeHintText, StringResource toolbarTitleText, StringResource toolbarSubtitle, List<? extends ProfileAvatarState> avatars, boolean isSourceOfFundsEditable, MatchaReviewTransactionViewState3 memoState, boolean showLoading) {
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(swipeHintText, "swipeHintText");
        Intrinsics.checkNotNullParameter(toolbarTitleText, "toolbarTitleText");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        return new MatchaReviewMultiuserTransactionViewState(transferId, summaryText, amountText, swipeHintText, toolbarTitleText, toolbarSubtitle, avatars, isSourceOfFundsEditable, memoState, showLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchaReviewMultiuserTransactionViewState)) {
            return false;
        }
        MatchaReviewMultiuserTransactionViewState matchaReviewMultiuserTransactionViewState = (MatchaReviewMultiuserTransactionViewState) other;
        return Intrinsics.areEqual(this.transferId, matchaReviewMultiuserTransactionViewState.transferId) && Intrinsics.areEqual(this.summaryText, matchaReviewMultiuserTransactionViewState.summaryText) && Intrinsics.areEqual(this.amountText, matchaReviewMultiuserTransactionViewState.amountText) && Intrinsics.areEqual(this.swipeHintText, matchaReviewMultiuserTransactionViewState.swipeHintText) && Intrinsics.areEqual(this.toolbarTitleText, matchaReviewMultiuserTransactionViewState.toolbarTitleText) && Intrinsics.areEqual(this.toolbarSubtitle, matchaReviewMultiuserTransactionViewState.toolbarSubtitle) && Intrinsics.areEqual(this.avatars, matchaReviewMultiuserTransactionViewState.avatars) && this.isSourceOfFundsEditable == matchaReviewMultiuserTransactionViewState.isSourceOfFundsEditable && Intrinsics.areEqual(this.memoState, matchaReviewMultiuserTransactionViewState.memoState) && this.showLoading == matchaReviewMultiuserTransactionViewState.showLoading;
    }

    public int hashCode() {
        UUID uuid = this.transferId;
        int iHashCode = (((((((((uuid == null ? 0 : uuid.hashCode()) * 31) + this.summaryText.hashCode()) * 31) + this.amountText.hashCode()) * 31) + this.swipeHintText.hashCode()) * 31) + this.toolbarTitleText.hashCode()) * 31;
        StringResource stringResource = this.toolbarSubtitle;
        return ((((((((iHashCode + (stringResource != null ? stringResource.hashCode() : 0)) * 31) + this.avatars.hashCode()) * 31) + Boolean.hashCode(this.isSourceOfFundsEditable)) * 31) + this.memoState.hashCode()) * 31) + Boolean.hashCode(this.showLoading);
    }

    public String toString() {
        return "MatchaReviewMultiuserTransactionViewState(transferId=" + this.transferId + ", summaryText=" + this.summaryText + ", amountText=" + this.amountText + ", swipeHintText=" + this.swipeHintText + ", toolbarTitleText=" + this.toolbarTitleText + ", toolbarSubtitle=" + this.toolbarSubtitle + ", avatars=" + this.avatars + ", isSourceOfFundsEditable=" + this.isSourceOfFundsEditable + ", memoState=" + this.memoState + ", showLoading=" + this.showLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchaReviewMultiuserTransactionViewState(UUID uuid, StringResource summaryText, String amountText, StringResource swipeHintText, StringResource toolbarTitleText, StringResource stringResource, List<? extends ProfileAvatarState> avatars, boolean z, MatchaReviewTransactionViewState3 memoState, boolean z2) {
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(swipeHintText, "swipeHintText");
        Intrinsics.checkNotNullParameter(toolbarTitleText, "toolbarTitleText");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(memoState, "memoState");
        this.transferId = uuid;
        this.summaryText = summaryText;
        this.amountText = amountText;
        this.swipeHintText = swipeHintText;
        this.toolbarTitleText = toolbarTitleText;
        this.toolbarSubtitle = stringResource;
        this.avatars = avatars;
        this.isSourceOfFundsEditable = z;
        this.memoState = memoState;
        this.showLoading = z2;
    }

    public /* synthetic */ MatchaReviewMultiuserTransactionViewState(UUID uuid, StringResource stringResource, String str, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, List list, boolean z, MatchaReviewTransactionViewState3 matchaReviewTransactionViewState3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, stringResource, str, stringResource2, stringResource3, stringResource4, list, z, matchaReviewTransactionViewState3, (i & 512) != 0 ? false : z2);
    }

    public final UUID getTransferId() {
        return this.transferId;
    }

    public final StringResource getSummaryText() {
        return this.summaryText;
    }

    public final String getAmountText() {
        return this.amountText;
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

    public final List<ProfileAvatarState> getAvatars() {
        return this.avatars;
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
