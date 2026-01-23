package com.robinhood.equities.history.extensions;

import android.content.res.Resources;
import com.robinhood.equities.history.C33130R;
import com.robinhood.recurring.models.TradeSkippedReason;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradeSkippedReasons.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"getOrderString", "", "Lcom/robinhood/recurring/models/TradeSkippedReason;", "res", "Landroid/content/res/Resources;", "getOrderStringRes", "", "(Lcom/robinhood/recurring/models/TradeSkippedReason;)Ljava/lang/Integer;", "lib-equity-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.equities.history.extensions.TradeSkippedReasonsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class TradeSkippedReasons {

    /* compiled from: TradeSkippedReasons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.equities.history.extensions.TradeSkippedReasonsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeSkippedReason.values().length];
            try {
                iArr[TradeSkippedReason.TRANSFER_FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeSkippedReason.TRANSFER_REVERSAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeSkippedReason.ACCOUNT_RESTRICTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeSkippedReason.ACCOUNT_DEACTIVATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeSkippedReason.ACCOUNT_DEPOSIT_HALTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeSkippedReason.ACCOUNT_POSITION_OPEN_HALTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TradeSkippedReason.INSUFFICIENT_BUYING_POWER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TradeSkippedReason.INSUFFICIENT_BUYING_POWER_ON_ACH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TradeSkippedReason.UNTRADABLE_INSTRUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TradeSkippedReason.INACTIVE_INSTRUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TradeSkippedReason.INSTRUMENT_SELL_ONLY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TradeSkippedReason.NO_FRACTIONAL_TRADABILITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TradeSkippedReason.PAUSED_BY_USER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TradeSkippedReason.SCHEDULE_PAUSED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TradeSkippedReason.ACH_RELATIONSHIP_UNLINKED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TradeSkippedReason.MAY_CAUSE_DAY_TRADE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TradeSkippedReason.MAY_TRIGGER_PDT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TradeSkippedReason.BACKUP_ACH_TRANSFER_FAILURE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TradeSkippedReason.BACKUP_ACH_TRANSFER_REVERSAL.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TradeSkippedReason.MARGIN_REQUIREMENT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TradeSkippedReason.INSUFFICIENT_DIRECT_DEPOSIT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TradeSkippedReason.PLACE_ORDER_FAILURE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[TradeSkippedReason.INTER_ENTITY_TRANSFER_FAILURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[TradeSkippedReason.INSUFFICIENT_FUNDS_IN_RHY_ACCOUNT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[TradeSkippedReason.IRA_CONTRIBUTION_LIMIT_REACHED.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[TradeSkippedReason.UPSTREAM_PROCESSING_ERROR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[TradeSkippedReason.UNKNOWN.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getOrderString(TradeSkippedReason tradeSkippedReason, Resources res) {
        Intrinsics.checkNotNullParameter(tradeSkippedReason, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Integer orderStringRes = getOrderStringRes(tradeSkippedReason);
        if (orderStringRes != null) {
            return res.getString(orderStringRes.intValue());
        }
        return null;
    }

    public static final Integer getOrderStringRes(TradeSkippedReason tradeSkippedReason) {
        Intrinsics.checkNotNullParameter(tradeSkippedReason, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[tradeSkippedReason.ordinal()]) {
            case 1:
                return Integer.valueOf(C33130R.string.f5240xb6b9b4ec);
            case 2:
                return Integer.valueOf(C33130R.string.f5241xe86ef22c);
            case 3:
            case 4:
            case 5:
            case 6:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_failed_account_restriction);
            case 7:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_failed_low_buying_power);
            case 8:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_failed_low_buying_power_ach);
            case 9:
            case 10:
            case 11:
            case 12:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_failed_stock_unsupported);
            case 13:
            case 14:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_schedule_paused);
            case 15:
                return null;
            case 16:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_may_cause_day_trade);
            case 17:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_may_trigger_pdt);
            case 18:
                return Integer.valueOf(C33130R.string.f5235xf304572c);
            case 19:
                return Integer.valueOf(C33130R.string.f5236x357897ec);
            case 20:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_margin_requirement);
            case 21:
                return Integer.valueOf(C33130R.string.f5237x3b3df104);
            case 22:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_place_order_failure);
            case 23:
                return Integer.valueOf(C33130R.string.f5239x767494af);
            case 24:
                return Integer.valueOf(C33130R.string.f5238x130038a4);
            case 25:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_ira_limit_reached);
            case 26:
            case 27:
                return Integer.valueOf(C33130R.string.investment_schedule_event_order_cancelled_general);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
