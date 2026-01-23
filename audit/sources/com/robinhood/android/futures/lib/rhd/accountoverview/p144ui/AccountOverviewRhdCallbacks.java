package com.robinhood.android.futures.lib.rhd.accountoverview.p144ui;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewRhdCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"onCtaClick", "", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/AccountOverviewRhdSectionCtaType;", "callbacks", "Lcom/robinhood/android/futures/lib/rhd/accountoverview/ui/FuturesSectionCallbacks;", "lib-rhd-account-overview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.ui.AccountOverviewRhdCallbacksKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountOverviewRhdCallbacks {

    /* compiled from: AccountOverviewRhdCallbacks.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.lib.rhd.accountoverview.ui.AccountOverviewRhdCallbacksKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountOverviewContents2.values().length];
            try {
                iArr[AccountOverviewContents2.TRADE_FUTURES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountOverviewContents2.TRADE_EVENT_CONTRACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountOverviewContents2.APPLY_TO_TRADE_FUTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountOverviewContents2.APPLY_TO_TRADE_EVENT_CONTRACTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountOverviewContents2.REACTIVATE_ACCOUNT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void onCtaClick(AccountOverviewContents2 accountOverviewContents2, AccountOverviewRhdCallbacks2 callbacks) {
        Intrinsics.checkNotNullParameter(accountOverviewContents2, "<this>");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        int i = WhenMappings.$EnumSwitchMapping$0[accountOverviewContents2.ordinal()];
        if (i == 1) {
            callbacks.onTradeFuturesClicked();
            return;
        }
        if (i == 2) {
            callbacks.onTradeEventContractsClicked();
            return;
        }
        if (i == 3) {
            callbacks.onApplyToTradeFuturesClicked();
        } else if (i == 4) {
            callbacks.onApplyToTradeEventContractsClicked();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            callbacks.onReactivateAccountClicked();
        }
    }
}
