package com.robinhood.android.options.optionsstring.sbschain;

import android.content.res.Resources;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.models.p320db.OptionSideBySideChainMetric;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainMetricStrings.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"getOptionSideBySideChainMetricLongString", "", "Lcom/robinhood/models/db/OptionSideBySideChainMetric;", "res", "Landroid/content/res/Resources;", "getOptionSideBySideChainMetricShortString", "bidAskPriceLabelType", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.sbschain.OptionSideBySideChainMetricStringsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainMetricStrings {

    /* compiled from: OptionSideBySideChainMetricStrings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.optionsstring.sbschain.OptionSideBySideChainMetricStringsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionSideBySideChainMetric.values().length];
            try {
                iArr[OptionSideBySideChainMetric.BID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionSideBySideChainMetric.ASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionSideBySideChainMetric.MARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionSideBySideChainMetric.LAST_TRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionSideBySideChainMetric.PREVIOUS_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionSideBySideChainMetric.HIGH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionSideBySideChainMetric.LOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionSideBySideChainMetric.NET_CHANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionSideBySideChainMetric.PERCENT_CHANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionSideBySideChainMetric.BID_SIZE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionSideBySideChainMetric.ASK_SIZE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionSideBySideChainMetric.VOLUME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionSideBySideChainMetric.OPEN_INTEREST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionSideBySideChainMetric.DELTA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionSideBySideChainMetric.GAMMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[OptionSideBySideChainMetric.THETA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[OptionSideBySideChainMetric.VEGA.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[OptionSideBySideChainMetric.RHO.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[OptionSideBySideChainMetric.IMPLIED_VOLATILITY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[OptionSideBySideChainMetric.BREAKEVEN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[OptionSideBySideChainMetric.TO_BREAKEVEN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[OptionSideBySideChainMetric.CHANCE_OF_PROFIT_LONG.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[OptionSideBySideChainMetric.CHANCE_OF_PROFIT_SHORT.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionChainSettingsSideBySideBidAskPriceLabelType.values().length];
            try {
                iArr2[OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[OptionChainSettingsSideBySideBidAskPriceLabelType.SELL_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getOptionSideBySideChainMetricLongString(OptionSideBySideChainMetric optionSideBySideChainMetric, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionSideBySideChainMetric, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        switch (WhenMappings.$EnumSwitchMapping$0[optionSideBySideChainMetric.ordinal()]) {
            case 1:
                String string2 = res.getString(C23386R.string.option_side_by_side_chain_metric_bid);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = res.getString(C23386R.string.option_side_by_side_chain_metric_ask);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = res.getString(C23386R.string.option_side_by_side_chain_metric_mark);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = res.getString(C23386R.string.option_side_by_side_chain_metric_last_trade);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = res.getString(C23386R.string.option_side_by_side_chain_metric_previous_close);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = res.getString(C23386R.string.option_side_by_side_chain_metric_high);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = res.getString(C23386R.string.option_side_by_side_chain_metric_low);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = res.getString(C23386R.string.option_side_by_side_chain_metric_net_change);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 9:
                String string10 = res.getString(C23386R.string.option_side_by_side_chain_metric_percent_change);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 10:
                String string11 = res.getString(C23386R.string.option_side_by_side_chain_metric_bid_size);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 11:
                String string12 = res.getString(C23386R.string.option_side_by_side_chain_metric_ask_size);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case 12:
                String string13 = res.getString(C23386R.string.option_side_by_side_chain_metric_volume);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            case 13:
                String string14 = res.getString(C23386R.string.option_side_by_side_chain_metric_open_interest);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            case 14:
                String string15 = res.getString(C23386R.string.option_side_by_side_chain_metric_delta);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                return string15;
            case 15:
                String string16 = res.getString(C23386R.string.option_side_by_side_chain_metric_gamma);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                return string16;
            case 16:
                String string17 = res.getString(C23386R.string.option_side_by_side_chain_metric_theta);
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                return string17;
            case 17:
                String string18 = res.getString(C23386R.string.option_side_by_side_chain_metric_vega);
                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                return string18;
            case 18:
                String string19 = res.getString(C23386R.string.option_side_by_side_chain_metric_rho);
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                return string19;
            case 19:
                String string20 = res.getString(C23386R.string.option_side_by_side_chain_metric_implied_volatility);
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                return string20;
            case 20:
                String string21 = res.getString(C23386R.string.option_side_by_side_chain_metric_breakeven);
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                return string21;
            case 21:
                String string22 = res.getString(C23386R.string.option_side_by_side_chain_metric_to_breakeven);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                return string22;
            case 22:
                String string23 = res.getString(C23386R.string.option_side_by_side_chain_metric_chance_of_profit_long);
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                return string23;
            case 23:
                String string24 = res.getString(C23386R.string.option_side_by_side_chain_metric_chance_of_profit_short);
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                return string24;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getOptionSideBySideChainMetricShortString(OptionSideBySideChainMetric optionSideBySideChainMetric, Resources res, OptionChainSettingsSideBySideBidAskPriceLabelType bidAskPriceLabelType) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optionSideBySideChainMetric, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(bidAskPriceLabelType, "bidAskPriceLabelType");
        switch (WhenMappings.$EnumSwitchMapping$0[optionSideBySideChainMetric.ordinal()]) {
            case 1:
                int i = WhenMappings.$EnumSwitchMapping$1[bidAskPriceLabelType.ordinal()];
                if (i == 1) {
                    String string2 = res.getString(C23386R.string.option_side_by_side_chain_metric_bid);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String string3 = res.getString(C23386R.string.option_side_by_side_chain_metric_sell);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 2:
                int i2 = WhenMappings.$EnumSwitchMapping$1[bidAskPriceLabelType.ordinal()];
                if (i2 == 1) {
                    String string4 = res.getString(C23386R.string.option_side_by_side_chain_metric_ask);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String string5 = res.getString(C23386R.string.option_side_by_side_chain_metric_buy);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 3:
                String string6 = res.getString(C23386R.string.option_side_by_side_chain_metric_mark);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 4:
                String string7 = res.getString(C23386R.string.option_side_by_side_chain_metric_last_trade);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 5:
                String string8 = res.getString(C23386R.string.option_side_by_side_chain_metric_short_previous_close);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 6:
                String string9 = res.getString(C23386R.string.option_side_by_side_chain_metric_high);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case 7:
                String string10 = res.getString(C23386R.string.option_side_by_side_chain_metric_low);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case 8:
                String string11 = res.getString(C23386R.string.option_side_by_side_chain_metric_net_change);
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case 9:
                String string12 = res.getString(C23386R.string.option_side_by_side_chain_metric_percent_change);
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case 10:
                String string13 = res.getString(C23386R.string.option_side_by_side_chain_metric_bid_size);
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            case 11:
                String string14 = res.getString(C23386R.string.option_side_by_side_chain_metric_ask_size);
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            case 12:
                String string15 = res.getString(C23386R.string.option_side_by_side_chain_metric_volume);
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                return string15;
            case 13:
                String string16 = res.getString(C23386R.string.option_side_by_side_chain_metric_short_open_interest);
                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                return string16;
            case 14:
                String string17 = res.getString(C23386R.string.option_side_by_side_chain_metric_delta);
                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                return string17;
            case 15:
                String string18 = res.getString(C23386R.string.option_side_by_side_chain_metric_gamma);
                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                return string18;
            case 16:
                String string19 = res.getString(C23386R.string.option_side_by_side_chain_metric_theta);
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                return string19;
            case 17:
                String string20 = res.getString(C23386R.string.option_side_by_side_chain_metric_vega);
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                return string20;
            case 18:
                String string21 = res.getString(C23386R.string.option_side_by_side_chain_metric_rho);
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                return string21;
            case 19:
                String string22 = res.getString(C23386R.string.option_side_by_side_chain_metric_short_implied_volatility);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                return string22;
            case 20:
                String string23 = res.getString(C23386R.string.option_side_by_side_chain_metric_breakeven);
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                return string23;
            case 21:
                String string24 = res.getString(C23386R.string.option_side_by_side_chain_metric_short_to_breakeven);
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                return string24;
            case 22:
                String string25 = res.getString(C23386R.string.option_side_by_side_chain_metric_short_chance_of_profit_long);
                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                return string25;
            case 23:
                String string26 = res.getString(C23386R.string.option_side_by_side_chain_metric_short_chance_of_profit_short);
                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                return string26;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
