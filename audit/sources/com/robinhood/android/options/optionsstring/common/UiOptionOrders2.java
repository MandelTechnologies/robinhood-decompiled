package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.common.strings.OrderStates;
import com.robinhood.common.strings.UiOptionOrders3;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiOptionOrders.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\f\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\r\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u000e"}, m3636d2 = {"getHistoryTitle", "", "Lcom/robinhood/models/ui/UiOptionOrder;", "resources", "Landroid/content/res/Resources;", "includeSymbol", "", "getMultilegHistoryTitle", "getHistorySubtitle", "", "getHistoryDetail", "getStateString", "getConfirmationQuantityLabel", "getConfirmationQuantityText", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionOrdersKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiOptionOrders2 {

    /* compiled from: UiOptionOrders.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.common.UiOptionOrdersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderState.values().length];
            try {
                iArr2[OrderState.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderState.PARTIALLY_FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderState.TRIGGERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderState.NEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderState.UNCONFIRMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderState.CONFIRMED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[OrderState.REJECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[OrderState.CANCELED.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[OrderState.PENDING_CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[OrderState.FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[OrderState.VOIDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[OrderState.FILLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[OrderState.NOT_ACCEPTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CharSequence getHistoryTitle(UiOptionOrder uiOptionOrder, Resources resources, boolean z) throws Resources.NotFoundException {
        NumberFormatter strikeValueFormat;
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (uiOptionOrder.isMultiLeg()) {
            return getMultilegHistoryTitle(uiOptionOrder, resources, z);
        }
        OptionInstrument optionInstrument = ((UiOptionOrderLeg) CollectionsKt.single((List) uiOptionOrder.getLegs())).getOptionInstrument();
        CharSequence contractTypeString$default = OptionExtensions.getContractTypeString$default(resources, optionInstrument.getContractType(), 0, 4, null);
        String sideString = UiOptionOrders3.getSideString(resources, ((UiOptionOrderLeg) CollectionsKt.first((List) uiOptionOrder.getLegs())).getLeg().getSide());
        int i = WhenMappings.$EnumSwitchMapping$0[uiOptionOrder.getUnderlyingType().ordinal()];
        if (i == 1) {
            strikeValueFormat = Formats.getStrikeValueFormat();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strikeValueFormat = Formats.getStrikePriceFormat();
        }
        boolean settleOnOpen = uiOptionOrder.getOptionChain().getSettleOnOpen();
        if (z) {
            String string2 = resources.getString(C23386R.string.options_history_title_single_leg, sideString, uiOptionOrder.getOptionChain().getSymbol(), strikeValueFormat.format(optionInstrument.getStrikePrice()), contractTypeString$default, OptionExtensions2.getExpirationStringShort(resources, optionInstrument.getExpirationDate(), settleOnOpen));
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        String string3 = resources.getString(C23386R.string.options_history_title_single_leg_no_symbol, sideString, strikeValueFormat.format(optionInstrument.getStrikePrice()), contractTypeString$default, OptionExtensions2.getExpirationStringShort(resources, optionInstrument.getExpirationDate(), settleOnOpen));
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    private static final CharSequence getMultilegHistoryTitle(UiOptionOrder uiOptionOrder, Resources resources, boolean z) throws Resources.NotFoundException {
        OptionStrategyType rollingStrategy = uiOptionOrder.getRollingStrategy();
        CharSequence name = rollingStrategy != null ? OptionExtensions.getName(rollingStrategy, resources, uiOptionOrder.getLegs().size()) : null;
        if (name == null) {
            CharSequence name2 = OptionExtensions.getName(uiOptionOrder.getStrategy(), resources, uiOptionOrder.getLegs().size());
            if (!z) {
                return name2;
            }
            String string2 = resources.getString(C23386R.string.option_history_title_multi_leg, uiOptionOrder.getOptionChain().getSymbol(), name2);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (z) {
            String string3 = resources.getString(C23386R.string.option_strategy_roll_with_symbol, uiOptionOrder.getOptionChain().getSymbol(), name);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = resources.getString(C23386R.string.option_strategy_roll_without_symbol, name);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public static final String getHistorySubtitle(UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        return InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) uiOptionOrder.getOptionOrder().getCreatedAt());
    }

    public static final String getHistoryDetail(UiOptionOrder uiOptionOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return !uiOptionOrder.getOptionOrder().getState().hasExecutions() ? getStateString(uiOptionOrder, resources) : Formats.getCurrencyFormat().format(uiOptionOrder.getOptionOrder().getProcessedPremium());
    }

    public static final String getStateString(UiOptionOrder uiOptionOrder, Resources resources) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return OrderStates.getOrderStateString(uiOptionOrder.getOptionOrder().getState(), resources);
    }

    public static final String getConfirmationQuantityLabel(UiOptionOrder uiOptionOrder, Resources resources) throws Resources.NotFoundException {
        int i;
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$1[uiOptionOrder.getOptionOrder().getState().ordinal()]) {
            case 1:
                i = C23386R.string.option_order_entered_quantity_label;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i = C23386R.string.option_order_quantity_label;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getConfirmationQuantityText(UiOptionOrder uiOptionOrder, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        switch (WhenMappings.$EnumSwitchMapping$1[uiOptionOrder.getOptionOrder().getState().ordinal()]) {
            case 1:
                return Formats.getIntegerFormat().format(uiOptionOrder.getOptionOrder().getQuantity());
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                String string2 = resources.getString(C23386R.string.option_order_filled_quantity_value, Integer.valueOf(uiOptionOrder.getOptionOrder().getProcessedQuantity().intValue()), Integer.valueOf(uiOptionOrder.getOptionOrder().getQuantity().intValue()));
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
