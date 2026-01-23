package com.robinhood.shared.history.order;

import com.robinhood.models.api.ApiDividend;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dividends.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"resId", "", "Lcom/robinhood/models/api/ApiDividend$State;", "getResId", "(Lcom/robinhood/models/api/ApiDividend$State;)I", "lib-order-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.order.DividendsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Dividends {

    /* compiled from: Dividends.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.order.DividendsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiDividend.State.values().length];
            try {
                iArr[ApiDividend.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiDividend.State.PAID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiDividend.State.VOIDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiDividend.State.REVERTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiDividend.State.REINVESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiDividend.State.REINVESTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiDividend.State.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getResId(ApiDividend.State state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return C39008R.string.dividend_state_pending;
            case 2:
                return C39008R.string.dividend_state_paid;
            case 3:
                return C39008R.string.dividend_state_voided;
            case 4:
                return C39008R.string.dividend_state_reversed;
            case 5:
                return C39008R.string.dividend_state_reinvesting;
            case 6:
                return C39008R.string.dividend_state_reinvested;
            case 7:
                return C39008R.string.dividend_state_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
