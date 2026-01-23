package com.robinhood.android.advanced.alert.utils;

import com.robinhood.android.advanced.alert.AdvancedAlertViewState;
import com.robinhood.android.lib.formats.DefaultNumberFormatter;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.IndicatorAlertDisplayResources;
import com.robinhood.models.advanced.alert.api.IndicatorDisplayResources;
import com.robinhood.models.advanced.alert.api.PriceAlertDisplayResources;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AlertHubUiResources.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u0010\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¨\u0006\u0012"}, m3636d2 = {"getListDisplayResource", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSettingWithResource;", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "maxFractionDigits", "", "(Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;Ljava/lang/Integer;)Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSettingWithResource;", "getEditorDisplayResource", "Lcom/robinhood/models/advanced/alert/api/IndicatorDisplayResources;", "indicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "getEditorTitleResource", "", "getCurrentLabel", "replacePeriodParam", "appendBoldValue", "value", "feature-lib-advanced-alert_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.utils.AlertHubUiResourcesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AlertHubUiResources2 {
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f5 A[PHI: r0 r2
      0x03f5: PHI (r0v70 java.lang.String) = (r0v67 java.lang.String), (r0v82 java.lang.String) binds: [B:177:0x0467, B:156:0x03f1] A[DONT_GENERATE, DONT_INLINE]
      0x03f5: PHI (r2v65 java.lang.String) = (r2v63 java.lang.String), (r2v68 java.lang.String) binds: [B:177:0x0467, B:156:0x03f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[PHI: r0 r2
      0x0138: PHI (r0v126 java.lang.String) = 
      (r0v50 java.lang.String)
      (r0v54 java.lang.String)
      (r0v100 java.lang.String)
      (r0v104 java.lang.String)
      (r0v123 java.lang.String)
      (r0v129 java.lang.String)
     binds: [B:207:0x0513, B:192:0x04bd, B:119:0x02ff, B:103:0x0294, B:68:0x01a6, B:50:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0138: PHI (r2v114 java.lang.String) = 
      (r2v48 java.lang.String)
      (r2v60 java.lang.String)
      (r2v84 java.lang.String)
      (r2v94 java.lang.String)
      (r2v111 java.lang.String)
      (r2v124 java.lang.String)
     binds: [B:207:0x0513, B:192:0x04bd, B:119:0x02ff, B:103:0x0294, B:68:0x01a6, B:50:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AdvancedAlertViewState.AlertSettingWithResource getListDisplayResource(AlertHubUiResources alertHubUiResources, AlertHubSettingItem item, Integer num) {
        String strReplace$default;
        String strAppendBoldValue;
        String str;
        String hubTitle;
        String subtitle;
        String strAppendBoldValue2;
        String subtitle2;
        String hubSubtitle;
        String subtitle3;
        String hubSubtitle2;
        Intrinsics.checkNotNullParameter(alertHubUiResources, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        currencyInstance.setMinimumFractionDigits(num != null ? num.intValue() : 2);
        currencyInstance.setMaximumFractionDigits(num != null ? num.intValue() : 2);
        strReplace$default = "";
        if (currencyInstance instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            Currency currency = decimalFormat.getCurrency();
            Intrinsics.checkNotNull(currency);
            decimalFormat.setNegativePrefix("-" + currency.getSymbol());
            decimalFormat.setNegativeSuffix("");
        }
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "apply(...)");
        DefaultNumberFormatter defaultNumberFormatter = new DefaultNumberFormatter(currencyInstance);
        if (item instanceof AlertHubSettingItem.PriceBelow) {
            PriceAlertDisplayResources movesBelowValue = alertHubUiResources.getContent().getPrice().getMovesBelowValue();
            hubTitle = movesBelowValue != null ? movesBelowValue.getHubTitle() : null;
            if (hubTitle == null) {
                hubTitle = "";
            }
            BigDecimal price = ((AlertHubSettingItem.PriceBelow) item).getPrice();
            strAppendBoldValue2 = appendBoldValue(hubTitle, defaultNumberFormatter.format(price != null ? Double.valueOf(price.doubleValue()) : 0));
        } else {
            if (!(item instanceof AlertHubSettingItem.PriceAbove)) {
                if (item instanceof AlertHubSettingItem.SmaAbove) {
                    IndicatorAlertDisplayResources movesAboveValue = alertHubUiResources.getContent().getSma().getMovesAboveValue();
                    hubTitle = movesAboveValue != null ? movesAboveValue.getHubTitle() : null;
                    AlertHubSettingItem.SmaAbove smaAbove = (AlertHubSettingItem.SmaAbove) item;
                    String strReplace$default2 = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(smaAbove.getPeriod()), false, 4, (Object) null);
                    BigDecimal value = smaAbove.getValue();
                    strAppendBoldValue2 = appendBoldValue(strReplace$default2, defaultNumberFormatter.format(value != null ? Double.valueOf(value.doubleValue()) : 0));
                    subtitle2 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), smaAbove.getInterval());
                    if (subtitle2.length() == 0) {
                        hubSubtitle = alertHubUiResources.getContent().getSma().getHubSubtitle();
                        if (hubSubtitle != null) {
                            strReplace$default = hubSubtitle;
                        }
                    }
                    str = subtitle2;
                    strAppendBoldValue = strAppendBoldValue2;
                } else if (item instanceof AlertHubSettingItem.SmaBelow) {
                    IndicatorAlertDisplayResources movesBelowValue2 = alertHubUiResources.getContent().getSma().getMovesBelowValue();
                    hubTitle = movesBelowValue2 != null ? movesBelowValue2.getHubTitle() : null;
                    AlertHubSettingItem.SmaBelow smaBelow = (AlertHubSettingItem.SmaBelow) item;
                    String strReplace$default3 = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(smaBelow.getPeriod()), false, 4, (Object) null);
                    BigDecimal value2 = smaBelow.getValue();
                    strAppendBoldValue2 = appendBoldValue(strReplace$default3, defaultNumberFormatter.format(value2 != null ? Double.valueOf(value2.doubleValue()) : 0));
                    subtitle2 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), smaBelow.getInterval());
                    if (subtitle2.length() == 0) {
                        hubSubtitle = alertHubUiResources.getContent().getSma().getHubSubtitle();
                        if (hubSubtitle != null) {
                        }
                    }
                    str = subtitle2;
                    strAppendBoldValue = strAppendBoldValue2;
                } else {
                    if (item instanceof AlertHubSettingItem.PriceAboveSma) {
                        IndicatorAlertDisplayResources crossesAbove = alertHubUiResources.getContent().getSma().getCrossesAbove();
                        hubTitle = crossesAbove != null ? crossesAbove.getHubTitle() : null;
                        AlertHubSettingItem.PriceAboveSma priceAboveSma = (AlertHubSettingItem.PriceAboveSma) item;
                        strReplace$default = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(priceAboveSma.getPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), priceAboveSma.getInterval());
                    } else if (item instanceof AlertHubSettingItem.PriceBelowSma) {
                        IndicatorAlertDisplayResources crossesBelow = alertHubUiResources.getContent().getSma().getCrossesBelow();
                        hubTitle = crossesBelow != null ? crossesBelow.getHubTitle() : null;
                        AlertHubSettingItem.PriceBelowSma priceBelowSma = (AlertHubSettingItem.PriceBelowSma) item;
                        strReplace$default = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(priceBelowSma.getPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), priceBelowSma.getInterval());
                    } else if (item instanceof AlertHubSettingItem.EmaAbove) {
                        IndicatorAlertDisplayResources movesAboveValue2 = alertHubUiResources.getContent().getEma().getMovesAboveValue();
                        hubTitle = movesAboveValue2 != null ? movesAboveValue2.getHubTitle() : null;
                        AlertHubSettingItem.EmaAbove emaAbove = (AlertHubSettingItem.EmaAbove) item;
                        String strReplace$default4 = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(emaAbove.getPeriod()), false, 4, (Object) null);
                        BigDecimal value3 = emaAbove.getValue();
                        strAppendBoldValue2 = appendBoldValue(strReplace$default4, defaultNumberFormatter.format(value3 != null ? Double.valueOf(value3.doubleValue()) : 0));
                        subtitle2 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), emaAbove.getInterval());
                        if (subtitle2.length() == 0) {
                            hubSubtitle = alertHubUiResources.getContent().getSma().getHubSubtitle();
                            if (hubSubtitle != null) {
                            }
                        }
                        str = subtitle2;
                        strAppendBoldValue = strAppendBoldValue2;
                    } else if (item instanceof AlertHubSettingItem.EmaBelow) {
                        IndicatorAlertDisplayResources movesBelowValue3 = alertHubUiResources.getContent().getEma().getMovesBelowValue();
                        hubTitle = movesBelowValue3 != null ? movesBelowValue3.getHubTitle() : null;
                        AlertHubSettingItem.EmaBelow emaBelow = (AlertHubSettingItem.EmaBelow) item;
                        String strReplace$default5 = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(emaBelow.getPeriod()), false, 4, (Object) null);
                        BigDecimal value4 = emaBelow.getValue();
                        strAppendBoldValue2 = appendBoldValue(strReplace$default5, defaultNumberFormatter.format(value4 != null ? Double.valueOf(value4.doubleValue()) : 0));
                        subtitle2 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), emaBelow.getInterval());
                        if (subtitle2.length() == 0) {
                            hubSubtitle = alertHubUiResources.getContent().getSma().getHubSubtitle();
                            if (hubSubtitle != null) {
                            }
                        }
                        str = subtitle2;
                        strAppendBoldValue = strAppendBoldValue2;
                    } else if (item instanceof AlertHubSettingItem.PriceAboveEma) {
                        IndicatorAlertDisplayResources crossesAbove2 = alertHubUiResources.getContent().getEma().getCrossesAbove();
                        hubTitle = crossesAbove2 != null ? crossesAbove2.getHubTitle() : null;
                        AlertHubSettingItem.PriceAboveEma priceAboveEma = (AlertHubSettingItem.PriceAboveEma) item;
                        strReplace$default = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(priceAboveEma.getPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), priceAboveEma.getInterval());
                    } else if (item instanceof AlertHubSettingItem.PriceBelowEma) {
                        IndicatorAlertDisplayResources crossesBelow2 = alertHubUiResources.getContent().getEma().getCrossesBelow();
                        hubTitle = crossesBelow2 != null ? crossesBelow2.getHubTitle() : null;
                        AlertHubSettingItem.PriceBelowEma priceBelowEma = (AlertHubSettingItem.PriceBelowEma) item;
                        strReplace$default = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(priceBelowEma.getPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), priceBelowEma.getInterval());
                    } else if (item instanceof AlertHubSettingItem.RsiAbove) {
                        IndicatorAlertDisplayResources movesAboveValue3 = alertHubUiResources.getContent().getRsi().getMovesAboveValue();
                        String hubTitle2 = movesAboveValue3 != null ? movesAboveValue3.getHubTitle() : null;
                        String str2 = hubTitle2 == null ? "" : hubTitle2;
                        AlertHubSettingItem.RsiAbove rsiAbove = (AlertHubSettingItem.RsiAbove) item;
                        String strReplace$default6 = StringsKt.replace$default(str2, AlertHubUiResources.PERIOD_PARAM, String.valueOf(rsiAbove.getPeriod()), false, 4, (Object) null);
                        BigDecimal value5 = rsiAbove.getValue();
                        hubTitle = value5 != null ? Integer.valueOf(value5.intValue()).toString() : null;
                        if (hubTitle == null) {
                            hubTitle = "";
                        }
                        strAppendBoldValue = appendBoldValue(strReplace$default6, hubTitle);
                        subtitle3 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), rsiAbove.getInterval());
                        if (subtitle3.length() == 0) {
                            hubSubtitle2 = alertHubUiResources.getContent().getSma().getHubSubtitle();
                            if (hubSubtitle2 != null) {
                                strReplace$default = hubSubtitle2;
                            }
                            str = strReplace$default;
                        }
                        str = subtitle3;
                    } else if (item instanceof AlertHubSettingItem.RsiBelow) {
                        IndicatorAlertDisplayResources movesBelowValue4 = alertHubUiResources.getContent().getRsi().getMovesBelowValue();
                        String hubTitle3 = movesBelowValue4 != null ? movesBelowValue4.getHubTitle() : null;
                        String str3 = hubTitle3 == null ? "" : hubTitle3;
                        AlertHubSettingItem.RsiBelow rsiBelow = (AlertHubSettingItem.RsiBelow) item;
                        String strReplace$default7 = StringsKt.replace$default(str3, AlertHubUiResources.PERIOD_PARAM, String.valueOf(rsiBelow.getPeriod()), false, 4, (Object) null);
                        BigDecimal value6 = rsiBelow.getValue();
                        hubTitle = value6 != null ? Integer.valueOf(value6.intValue()).toString() : null;
                        if (hubTitle == null) {
                            hubTitle = "";
                        }
                        strAppendBoldValue = appendBoldValue(strReplace$default7, hubTitle);
                        subtitle3 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), rsiBelow.getInterval());
                        if (subtitle3.length() == 0) {
                            hubSubtitle2 = alertHubUiResources.getContent().getSma().getHubSubtitle();
                            if (hubSubtitle2 != null) {
                            }
                            str = strReplace$default;
                        }
                        str = subtitle3;
                    } else if (item instanceof AlertHubSettingItem.VwapAbove) {
                        IndicatorAlertDisplayResources movesAboveValue4 = alertHubUiResources.getContent().getVwap().getMovesAboveValue();
                        hubTitle = movesAboveValue4 != null ? movesAboveValue4.getHubTitle() : null;
                        if (hubTitle == null) {
                            hubTitle = "";
                        }
                        BigDecimal value7 = ((AlertHubSettingItem.VwapAbove) item).getValue();
                        strAppendBoldValue2 = appendBoldValue(hubTitle, defaultNumberFormatter.format(value7 != null ? Double.valueOf(value7.doubleValue()) : 0));
                        subtitle2 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), ApiAlertHubSettingItem.Interval.FIVE_MINUTES);
                        if (subtitle2.length() == 0) {
                            hubSubtitle = alertHubUiResources.getContent().getSma().getHubSubtitle();
                            if (hubSubtitle != null) {
                            }
                        }
                        str = subtitle2;
                        strAppendBoldValue = strAppendBoldValue2;
                    } else if (item instanceof AlertHubSettingItem.VwapBelow) {
                        IndicatorAlertDisplayResources movesBelowValue5 = alertHubUiResources.getContent().getVwap().getMovesBelowValue();
                        hubTitle = movesBelowValue5 != null ? movesBelowValue5.getHubTitle() : null;
                        if (hubTitle == null) {
                            hubTitle = "";
                        }
                        BigDecimal value8 = ((AlertHubSettingItem.VwapBelow) item).getValue();
                        strAppendBoldValue2 = appendBoldValue(hubTitle, defaultNumberFormatter.format(value8 != null ? Double.valueOf(value8.doubleValue()) : 0));
                        subtitle2 = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), ApiAlertHubSettingItem.Interval.FIVE_MINUTES);
                        if (subtitle2.length() == 0) {
                            hubSubtitle = alertHubUiResources.getContent().getSma().getHubSubtitle();
                            if (hubSubtitle != null) {
                            }
                        }
                        str = subtitle2;
                        strAppendBoldValue = strAppendBoldValue2;
                    } else if (item instanceof AlertHubSettingItem.PriceAboveVwap) {
                        IndicatorAlertDisplayResources crossesAbove3 = alertHubUiResources.getContent().getVwap().getCrossesAbove();
                        hubTitle = crossesAbove3 != null ? crossesAbove3.getHubTitle() : null;
                        strReplace$default = hubTitle != null ? hubTitle : "";
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), ApiAlertHubSettingItem.Interval.FIVE_MINUTES);
                    } else if (item instanceof AlertHubSettingItem.PriceBelowVwap) {
                        IndicatorAlertDisplayResources crossesBelow3 = alertHubUiResources.getContent().getVwap().getCrossesBelow();
                        hubTitle = crossesBelow3 != null ? crossesBelow3.getHubTitle() : null;
                        strReplace$default = hubTitle != null ? hubTitle : "";
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), ApiAlertHubSettingItem.Interval.FIVE_MINUTES);
                    } else if (item instanceof AlertHubSettingItem.MacdAboveSignal) {
                        IndicatorAlertDisplayResources crossesAbove4 = alertHubUiResources.getContent().getMacd().getCrossesAbove();
                        hubTitle = crossesAbove4 != null ? crossesAbove4.getHubTitle() : null;
                        AlertHubSettingItem.MacdAboveSignal macdAboveSignal = (AlertHubSettingItem.MacdAboveSignal) item;
                        strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.SLOW_PERIOD_PARAM, String.valueOf(macdAboveSignal.getSlowPeriod()), false, 4, (Object) null), AlertHubUiResources.FAST_PERIOD_PARAM, String.valueOf(macdAboveSignal.getFastPeriod()), false, 4, (Object) null), AlertHubUiResources.SIGNAL_PERIOD_PARAM, String.valueOf(macdAboveSignal.getSignalPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), macdAboveSignal.getInterval());
                    } else if (item instanceof AlertHubSettingItem.MacdBelowSignal) {
                        IndicatorAlertDisplayResources crossesBelow4 = alertHubUiResources.getContent().getMacd().getCrossesBelow();
                        hubTitle = crossesBelow4 != null ? crossesBelow4.getHubTitle() : null;
                        AlertHubSettingItem.MacdBelowSignal macdBelowSignal = (AlertHubSettingItem.MacdBelowSignal) item;
                        strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.SLOW_PERIOD_PARAM, String.valueOf(macdBelowSignal.getSlowPeriod()), false, 4, (Object) null), AlertHubUiResources.FAST_PERIOD_PARAM, String.valueOf(macdBelowSignal.getFastPeriod()), false, 4, (Object) null), AlertHubUiResources.SIGNAL_PERIOD_PARAM, String.valueOf(macdBelowSignal.getSignalPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), macdBelowSignal.getInterval());
                    } else if (item instanceof AlertHubSettingItem.PriceAboveBollUpper) {
                        IndicatorAlertDisplayResources crossesAbove5 = alertHubUiResources.getContent().getBoll().getCrossesAbove();
                        hubTitle = crossesAbove5 != null ? crossesAbove5.getHubTitle() : null;
                        AlertHubSettingItem.PriceAboveBollUpper priceAboveBollUpper = (AlertHubSettingItem.PriceAboveBollUpper) item;
                        strReplace$default = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(priceAboveBollUpper.getPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), priceAboveBollUpper.getInterval());
                    } else if (item instanceof AlertHubSettingItem.PriceBelowBollLower) {
                        IndicatorAlertDisplayResources crossesBelow5 = alertHubUiResources.getContent().getBoll().getCrossesBelow();
                        hubTitle = crossesBelow5 != null ? crossesBelow5.getHubTitle() : null;
                        AlertHubSettingItem.PriceBelowBollLower priceBelowBollLower = (AlertHubSettingItem.PriceBelowBollLower) item;
                        strReplace$default = StringsKt.replace$default(hubTitle == null ? "" : hubTitle, AlertHubUiResources.PERIOD_PARAM, String.valueOf(priceBelowBollLower.getPeriod()), false, 4, (Object) null);
                        subtitle = IntervalDisplayResources2.getSubtitle(alertHubUiResources.getContent().getInterval(), priceBelowBollLower.getInterval());
                    } else {
                        strAppendBoldValue = "";
                        str = strAppendBoldValue;
                    }
                    str = subtitle;
                    strAppendBoldValue = strReplace$default;
                }
                return new AdvancedAlertViewState.AlertSettingWithResource(item, strAppendBoldValue, str, null, false, 16, null);
            }
            PriceAlertDisplayResources movesAboveValue5 = alertHubUiResources.getContent().getPrice().getMovesAboveValue();
            hubTitle = movesAboveValue5 != null ? movesAboveValue5.getHubTitle() : null;
            if (hubTitle == null) {
                hubTitle = "";
            }
            BigDecimal price2 = ((AlertHubSettingItem.PriceAbove) item).getPrice();
            strAppendBoldValue2 = appendBoldValue(hubTitle, defaultNumberFormatter.format(price2 != null ? Double.valueOf(price2.doubleValue()) : 0));
        }
        strAppendBoldValue = strAppendBoldValue2;
        str = strReplace$default;
        return new AdvancedAlertViewState.AlertSettingWithResource(item, strAppendBoldValue, str, null, false, 16, null);
    }

    public static final IndicatorDisplayResources getEditorDisplayResource(AlertHubUiResources alertHubUiResources, ApiTechnicalIndicator indicator) {
        Intrinsics.checkNotNullParameter(alertHubUiResources, "<this>");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        if (indicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) {
            return alertHubUiResources.getContent().getSma();
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) {
            return alertHubUiResources.getContent().getEma();
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) {
            return alertHubUiResources.getContent().getRsi();
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) {
            return alertHubUiResources.getContent().getMacd();
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice) {
            return alertHubUiResources.getContent().getVwap();
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiBollingerBands) {
            return alertHubUiResources.getContent().getBoll();
        }
        return null;
    }

    public static final String getEditorTitleResource(AlertHubUiResources alertHubUiResources, ApiTechnicalIndicator indicator) {
        String editorTitle;
        Intrinsics.checkNotNullParameter(alertHubUiResources, "<this>");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        IndicatorDisplayResources editorDisplayResource = getEditorDisplayResource(alertHubUiResources, indicator);
        String strReplacePeriodParam = (editorDisplayResource == null || (editorTitle = editorDisplayResource.getEditorTitle()) == null) ? null : replacePeriodParam(editorTitle, indicator);
        return strReplacePeriodParam == null ? "" : strReplacePeriodParam;
    }

    public static final String getCurrentLabel(AlertHubUiResources alertHubUiResources, ApiTechnicalIndicator indicator) {
        String currentValueLabel;
        Intrinsics.checkNotNullParameter(alertHubUiResources, "<this>");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        IndicatorDisplayResources editorDisplayResource = getEditorDisplayResource(alertHubUiResources, indicator);
        String strReplacePeriodParam = (editorDisplayResource == null || (currentValueLabel = editorDisplayResource.getCurrentValueLabel()) == null) ? null : replacePeriodParam(currentValueLabel, indicator);
        return strReplacePeriodParam == null ? "" : strReplacePeriodParam;
    }

    public static final String replacePeriodParam(String str, ApiTechnicalIndicator indicator) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indicator, "indicator");
        if (indicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) {
            return StringsKt.replace$default(str, AlertHubUiResources.PERIOD_PARAM, String.valueOf(((ApiTechnicalIndicator.ApiSimpleMovingAverage) indicator).getPeriod()), false, 4, (Object) null);
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) {
            return StringsKt.replace$default(str, AlertHubUiResources.PERIOD_PARAM, String.valueOf(((ApiTechnicalIndicator.ApiExponentialMovingAverage) indicator).getPeriod()), false, 4, (Object) null);
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) {
            return StringsKt.replace$default(str, AlertHubUiResources.PERIOD_PARAM, String.valueOf(((ApiTechnicalIndicator.ApiRelativeStrengthIndex) indicator).getPeriod()), false, 4, (Object) null);
        }
        if (indicator instanceof ApiTechnicalIndicator.ApiBollingerBands) {
            return StringsKt.replace$default(str, AlertHubUiResources.PERIOD_PARAM, String.valueOf(((ApiTechnicalIndicator.ApiBollingerBands) indicator).getPeriod()), false, 4, (Object) null);
        }
        if (!(indicator instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence)) {
            return str;
        }
        ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence apiMovingAverageConvergenceDivergence = (ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence) indicator;
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, AlertHubUiResources.FAST_PERIOD_PARAM, String.valueOf(apiMovingAverageConvergenceDivergence.getFast_period()), false, 4, (Object) null), AlertHubUiResources.SLOW_PERIOD_PARAM, String.valueOf(apiMovingAverageConvergenceDivergence.getSlow_period()), false, 4, (Object) null), AlertHubUiResources.SIGNAL_PERIOD_PARAM, String.valueOf(apiMovingAverageConvergenceDivergence.getSignal_period()), false, 4, (Object) null);
    }

    public static final String appendBoldValue(String str, String value) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return str + " **" + value + "**";
    }
}
