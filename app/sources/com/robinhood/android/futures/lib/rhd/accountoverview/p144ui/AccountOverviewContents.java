package com.robinhood.android.futures.lib.rhd.accountoverview.p144ui;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.futures.lib.rhd.accountoverview.C17291R;
import com.robinhood.android.futures.lib.rhd.accountoverview.RhdAccountDataState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewContents.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"accountTitleLabel", "", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;", "isEcSupported", "", "accountStatusLabel", "getAccountStatusLabel", "(Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;)I", "accountOverviewSummary", "Lcom/robinhood/utils/resource/StringResource;", "isCryptoSupported", "accountOverviewFuturesCtaType", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/AccountOverviewRhdSectionCtaType;", "getAccountOverviewFuturesCtaType", "(Lcom/robinhood/android/futures/lib/rhd/accountoverview/RhdAccountDataState;)Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/AccountOverviewRhdSectionCtaType;", "accountOverviewEcCtaType", "getAccountOverviewEcCtaType", "lib-rhd-account-overview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.ui.AccountOverviewContentsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountOverviewContents {
    public static final int accountTitleLabel(RhdAccountDataState rhdAccountDataState, boolean z) {
        Intrinsics.checkNotNullParameter(rhdAccountDataState, "<this>");
        if (z) {
            return C17291R.string.account_overview_rhd_card_futures_and_event_contracts_title;
        }
        return C17291R.string.account_overview_rhd_card_futures_only_title;
    }

    public static final int getAccountStatusLabel(RhdAccountDataState rhdAccountDataState) {
        Intrinsics.checkNotNullParameter(rhdAccountDataState, "<this>");
        if (rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccount) {
            if (((RhdAccountDataState.AlreadyHasAccount) rhdAccountDataState).getActiveAccount().getDeactivated()) {
                return C17291R.string.account_overview_event_contracts_card_title_value_disabled;
            }
            return C17291R.string.account_overview_event_contracts_card_title_value_enabled;
        }
        if ((rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccountInAnotherAccount) || (rhdAccountDataState instanceof RhdAccountDataState.EligibleOrInReviewInAnotherAccount)) {
            return C17291R.string.account_overview_event_contracts_card_title_value_unavailable;
        }
        if (rhdAccountDataState instanceof RhdAccountDataState.Eligible) {
            return C17291R.string.account_overview_event_contracts_card_title_value_disabled;
        }
        if (rhdAccountDataState instanceof RhdAccountDataState.InManualReview) {
            return C17291R.string.account_overview_event_contracts_card_title_value_in_review;
        }
        if (!(rhdAccountDataState instanceof RhdAccountDataState.Ineligible)) {
            throw new NoWhenBranchMatchedException();
        }
        return C17291R.string.account_overview_event_contracts_card_title_value_disabled;
    }

    public static final StringResource accountOverviewSummary(RhdAccountDataState rhdAccountDataState, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(rhdAccountDataState, "<this>");
        if ((rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccount) || (rhdAccountDataState instanceof RhdAccountDataState.Eligible) || (rhdAccountDataState instanceof RhdAccountDataState.InManualReview) || (rhdAccountDataState instanceof RhdAccountDataState.Ineligible)) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (z) {
                i = C17291R.string.account_overview_rhd_card_futures_and_event_contracts_summary;
            } else if (z2) {
                i = C17291R.string.account_overview_rhd_card_futures_only_summary;
            } else {
                i = C17291R.string.account_overview_rhd_card_futures_only_summary_no_crypto;
            }
            return companion.invoke(i, new Object[0]);
        }
        if (rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccountInAnotherAccount) {
            RhdAccountDataState.AlreadyHasAccountInAnotherAccount alreadyHasAccountInAnotherAccount = (RhdAccountDataState.AlreadyHasAccountInAnotherAccount) rhdAccountDataState;
            StringResource inSentence = AccountDisplayNames.getDisplayName(alreadyHasAccountInAnotherAccount.getFuturesAllowedAccount()).getWithAccount().getInSentence();
            if (alreadyHasAccountInAnotherAccount.getFuturesAllowedAccount().getDeactivated()) {
                StringResource.Companion companion2 = StringResource.INSTANCE;
                if (z) {
                    i4 = C17291R.string.account_overview_rhd_card_summary_mib_unavailable_deactivated;
                } else {
                    i4 = C17291R.string.f4156xa69de595;
                }
                return companion2.invoke(i4, inSentence);
            }
            StringResource.Companion companion3 = StringResource.INSTANCE;
            if (z) {
                i3 = C17291R.string.account_overview_rhd_card_summary_mib_unavailable_to_trade;
            } else {
                i3 = C17291R.string.f4158xf45df5ef;
            }
            return companion3.invoke(i3, inSentence);
        }
        if (!(rhdAccountDataState instanceof RhdAccountDataState.EligibleOrInReviewInAnotherAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion4 = StringResource.INSTANCE;
        if (z) {
            i2 = C17291R.string.account_overview_rhd_card_summary_mib_unavailable_to_apply;
        } else {
            i2 = C17291R.string.f4157x67f18425;
        }
        return companion4.invoke(i2, AccountDisplayNames.getDisplayName(((RhdAccountDataState.EligibleOrInReviewInAnotherAccount) rhdAccountDataState).getFuturesAllowedAccount()).getWithAccount().getInSentence());
    }

    public static final AccountOverviewContents2 getAccountOverviewFuturesCtaType(RhdAccountDataState rhdAccountDataState) {
        Intrinsics.checkNotNullParameter(rhdAccountDataState, "<this>");
        if (rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccount) {
            if (((RhdAccountDataState.AlreadyHasAccount) rhdAccountDataState).getActiveAccount().getDeactivated()) {
                return AccountOverviewContents2.REACTIVATE_ACCOUNT;
            }
            return AccountOverviewContents2.TRADE_FUTURES;
        }
        if (rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccountInAnotherAccount) {
            if (((RhdAccountDataState.AlreadyHasAccountInAnotherAccount) rhdAccountDataState).isFuturesAllowedAccountDeactivated()) {
                return AccountOverviewContents2.REACTIVATE_ACCOUNT;
            }
            return null;
        }
        if ((rhdAccountDataState instanceof RhdAccountDataState.Eligible) || (rhdAccountDataState instanceof RhdAccountDataState.Ineligible)) {
            return AccountOverviewContents2.APPLY_TO_TRADE_FUTURES;
        }
        if ((rhdAccountDataState instanceof RhdAccountDataState.InManualReview) || (rhdAccountDataState instanceof RhdAccountDataState.EligibleOrInReviewInAnotherAccount)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AccountOverviewContents2 getAccountOverviewEcCtaType(RhdAccountDataState rhdAccountDataState) {
        Intrinsics.checkNotNullParameter(rhdAccountDataState, "<this>");
        if (rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccount) {
            if (((RhdAccountDataState.AlreadyHasAccount) rhdAccountDataState).getActiveAccount().getDeactivated()) {
                return null;
            }
            return AccountOverviewContents2.TRADE_EVENT_CONTRACTS;
        }
        if (rhdAccountDataState instanceof RhdAccountDataState.AlreadyHasAccountInAnotherAccount) {
            return null;
        }
        if ((rhdAccountDataState instanceof RhdAccountDataState.Eligible) || (rhdAccountDataState instanceof RhdAccountDataState.Ineligible)) {
            return AccountOverviewContents2.APPLY_TO_TRADE_EVENT_CONTRACTS;
        }
        if ((rhdAccountDataState instanceof RhdAccountDataState.InManualReview) || (rhdAccountDataState instanceof RhdAccountDataState.EligibleOrInReviewInAnotherAccount)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
