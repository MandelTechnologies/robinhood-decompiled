package com.robinhood.android.common.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TransitionReason.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/TransitionReason;", "", "<init>", "()V", "transitionReason", "", "getAndResetTransitionReason", "setTransitionReason", "", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TransitionReason {
    public static final String ACH_ACCOUNT_LINK_ERROR = "achAccountLinkError";
    public static final String ACH_TRANSFER_AUTOMATIC_DEPOSIT = "automaticDeposit";
    public static final String ACH_TRANSFER_CHANGE_BANK = "changeBank";
    public static final String ACH_TRANSFER_REVIEW_NO_ACCOUNT = "reviewButNoAccount";
    public static final String CANCEL = "cancel";
    public static final String CANCEL_ORDERS_FAILED = "cancel_orders_failed";
    public static final String DISCLOSURE_ACCEPT = "accept";
    public static final String DO_NOT_WANT_TO_CANCEL_ORDERS = "do_not_want_to_cancel_orders";
    public static final String GENERIC_ERROR = "error";
    public static final String MICRODEPOSIT_VERIFIED = "verified";
    public static final String NOT_IN_RISK_OF_MARGIN_CALL = "not_in_risk_of_margin_call";
    public static final String ODYSSEY_BACK_N_PAGE = "odyssey_back_n_page";
    public static final String OPTION_TRADE_CHAIN = "chain";
    public static final String OPTION_TRADE_DISCOVER = "discover";
    public static final String OPTION_UPGRADE_ORDER_TYPES = "order_types";
    public static final String OPTION_UPGRADE_PROF_TRADER_NO = "prof_trader_no";
    public static final String OPTION_UPGRADE_PROF_TRADER_YES = "prof_trader_yes";
    public static final String OPTION_UPGRADE_SIGN_UP = "sign_up";
    public static final String PLACE_SELL_ORDERS_FAILED = "place_sell_orders_failed";
    public static final String PLACE_SELL_ORDERS_NOT_FILLED = "place_sell_orders_not_filled";
    public static final String STOCK_REWARD_CLAIM_SKIP = "skip";
    public static final String SUCCESS = "success";
    public static final String UNKNOWN = "unknown";
    private String transitionReason = "unknown";
    public static final int $stable = 8;

    public final String getAndResetTransitionReason() {
        String str = this.transitionReason;
        this.transitionReason = "unknown";
        return str;
    }

    public final void setTransitionReason(String transitionReason) {
        Intrinsics.checkNotNullParameter(transitionReason, "transitionReason");
        if (Intrinsics.areEqual("unknown", this.transitionReason)) {
            this.transitionReason = transitionReason;
            return;
        }
        if (StringsKt.contains$default((CharSequence) this.transitionReason, (CharSequence) transitionReason, false, 2, (Object) null)) {
            return;
        }
        this.transitionReason = this.transitionReason + "," + transitionReason;
    }
}
