package com.robinhood.android.matcha.p177ui.review;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaReviewTransactionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionDataState;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionViewState;", "<init>", "()V", "reduce", "dataState", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaReviewTransactionStateProvider implements StateProvider<MatchaReviewTransactionDataState, MatchaReviewTransactionViewState> {
    public static final int $stable = 0;

    /* compiled from: MatchaReviewTransactionStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaReviewTransactionViewState reduce(MatchaReviewTransactionDataState dataState) {
        StringResource summary;
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getDirection().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            UUID transferId = dataState.getTransferId();
            StringResource primaryText = dataState.getPrimaryText();
            StringResource secondaryText = dataState.getSecondaryText();
            StringResource.Companion companion = StringResource.INSTANCE;
            return new MatchaReviewTransactionViewState(transferId, primaryText, secondaryText, companion.invoke(C21284R.string.matcha_request_review_summary, dataState.getAmountText(), dataState.getTransactorDisplayId()), companion.invoke(C21284R.string.matcha_swipe_up_request_hint, new Object[0]), companion.invoke(C21284R.string.matcha_request_toolbar_title, dataState.getAmountText()), null, ProfileAvatars.getAvatar(dataState.getTransactor()), dataState.getBannerViewState(), dataState.getRequestId() != null, dataState.getMemoState(), dataState.getShowLoading());
        }
        UUID transferId2 = dataState.getTransferId();
        StringResource primaryText2 = dataState.getPrimaryText();
        StringResource secondaryText2 = dataState.getSecondaryText();
        if (dataState.getSummarySourceOfFundsSuffix() != null) {
            summary = StringResources6.join(CollectionsKt.listOfNotNull((Object[]) new StringResource[]{dataState.getSummary(), dataState.getSummarySourceOfFundsSuffix()}), PlaceholderUtils.XXShortPlaceholderText);
        } else {
            summary = dataState.getSummary();
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        StringResource stringResourceInvoke2 = companion2.invoke(C21284R.string.matcha_swipe_up_pay_hint, new Object[0]);
        StringResource stringResourceInvoke3 = companion2.invoke(C21284R.string.matcha_send_toolbar_title, dataState.getAmountText());
        SourceOfFunds sourceOfFunds = dataState.getSourceOfFunds();
        if ((sourceOfFunds != null ? sourceOfFunds.getLabel() : null) != null) {
            String label = dataState.getSourceOfFunds().getLabel();
            Intrinsics.checkNotNull(label);
            stringResourceInvoke = companion2.invoke(label);
        } else {
            stringResourceInvoke = companion2.invoke(C21284R.string.matcha_transaction_detail_account, new Object[0]);
        }
        ProfileAvatarState avatar = ProfileAvatars.getAvatar(dataState.getTransactor());
        boolean z = true;
        StringResource stringResource = summary;
        StringResource stringResource2 = stringResourceInvoke;
        MatchaReviewTransactionViewState2 bannerViewState = dataState.getBannerViewState();
        if (dataState.getRequestId() == null) {
            z = false;
        }
        return new MatchaReviewTransactionViewState(transferId2, primaryText2, secondaryText2, stringResource, stringResourceInvoke2, stringResourceInvoke3, stringResource2, avatar, bannerViewState, z, dataState.getMemoState(), dataState.getShowLoading());
    }
}
