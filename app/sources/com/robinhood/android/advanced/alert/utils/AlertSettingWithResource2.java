package com.robinhood.android.advanced.alert.utils;

import com.robinhood.android.advanced.alert.AdvancedAlertViewState;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AlertSettingWithResource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m3636d2 = {"addIndicator", "Lcom/robinhood/android/advanced/alert/AdvancedAlertViewState$AlertSettingWithResource;", "technicalIndicatorList", "", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advanced.alert.utils.AlertSettingWithResourceKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AlertSettingWithResource2 {

    /* compiled from: AlertSettingWithResource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.utils.AlertSettingWithResourceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAlertHubSettingItem.Type.values().length];
            try {
                iArr[ApiAlertHubSettingItem.Type.SMA_ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.SMA_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_ABOVE_SMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_BELOW_SMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.EMA_ABOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.EMA_BELOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_ABOVE_EMA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_BELOW_EMA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.RSI_ABOVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.RSI_BELOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.VWAP_ABOVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.VWAP_BELOW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_ABOVE_VWAP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_BELOW_VWAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.MACD_ABOVE_SIGNAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.MACD_BELOW_SIGNAL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_ABOVE_BOLL_UPPER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ApiAlertHubSettingItem.Type.PRICE_BELOW_BOLL_LOWER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AdvancedAlertViewState.AlertSettingWithResource addIndicator(AdvancedAlertViewState.AlertSettingWithResource alertSettingWithResource, List<? extends ApiTechnicalIndicator> technicalIndicatorList) {
        Intrinsics.checkNotNullParameter(alertSettingWithResource, "<this>");
        Intrinsics.checkNotNullParameter(technicalIndicatorList, "technicalIndicatorList");
        ApiAlertHubSettingItem.Type settingType = alertSettingWithResource.getAlert().getSettingType();
        Object obj = null;
        switch (settingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[settingType.ordinal()]) {
            case 1:
                AlertHubSettingItem alert = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.SmaAbove");
                AlertHubSettingItem.SmaAbove smaAbove = (AlertHubSettingItem.SmaAbove) alert;
                Iterator<T> it = technicalIndicatorList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        ApiTechnicalIndicator apiTechnicalIndicator = (ApiTechnicalIndicator) next;
                        if (apiTechnicalIndicator.getType() == ApiTechnicalIndicator.Type.SMA && (apiTechnicalIndicator instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) && ((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator).getPeriod() == smaAbove.getPeriod()) {
                            obj = next;
                        }
                    }
                }
                ApiTechnicalIndicator apiSimpleMovingAverage = (ApiTechnicalIndicator) obj;
                if (apiSimpleMovingAverage == null) {
                    apiSimpleMovingAverage = new ApiTechnicalIndicator.ApiSimpleMovingAverage(Boolean.TRUE, smaAbove.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiSimpleMovingAverage);
                break;
            case 2:
                AlertHubSettingItem alert2 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert2, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.SmaBelow");
                AlertHubSettingItem.SmaBelow smaBelow = (AlertHubSettingItem.SmaBelow) alert2;
                Iterator<T> it2 = technicalIndicatorList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        ApiTechnicalIndicator apiTechnicalIndicator2 = (ApiTechnicalIndicator) next2;
                        if (apiTechnicalIndicator2.getType() == ApiTechnicalIndicator.Type.SMA && (apiTechnicalIndicator2 instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) && ((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator2).getPeriod() == smaBelow.getPeriod()) {
                            obj = next2;
                        }
                    }
                }
                ApiTechnicalIndicator apiSimpleMovingAverage2 = (ApiTechnicalIndicator) obj;
                if (apiSimpleMovingAverage2 == null) {
                    apiSimpleMovingAverage2 = new ApiTechnicalIndicator.ApiSimpleMovingAverage(Boolean.TRUE, smaBelow.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiSimpleMovingAverage2);
                break;
            case 3:
                AlertHubSettingItem alert3 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert3, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceAboveSma");
                AlertHubSettingItem.PriceAboveSma priceAboveSma = (AlertHubSettingItem.PriceAboveSma) alert3;
                Iterator<T> it3 = technicalIndicatorList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        ApiTechnicalIndicator apiTechnicalIndicator3 = (ApiTechnicalIndicator) next3;
                        if (apiTechnicalIndicator3.getType() == ApiTechnicalIndicator.Type.SMA && (apiTechnicalIndicator3 instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) && ((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator3).getPeriod() == priceAboveSma.getPeriod()) {
                            obj = next3;
                        }
                    }
                }
                ApiTechnicalIndicator apiSimpleMovingAverage3 = (ApiTechnicalIndicator) obj;
                if (apiSimpleMovingAverage3 == null) {
                    apiSimpleMovingAverage3 = new ApiTechnicalIndicator.ApiSimpleMovingAverage(Boolean.TRUE, priceAboveSma.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiSimpleMovingAverage3);
                break;
            case 4:
                AlertHubSettingItem alert4 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert4, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceBelowSma");
                AlertHubSettingItem.PriceBelowSma priceBelowSma = (AlertHubSettingItem.PriceBelowSma) alert4;
                Iterator<T> it4 = technicalIndicatorList.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        ApiTechnicalIndicator apiTechnicalIndicator4 = (ApiTechnicalIndicator) next4;
                        if (apiTechnicalIndicator4.getType() == ApiTechnicalIndicator.Type.SMA && (apiTechnicalIndicator4 instanceof ApiTechnicalIndicator.ApiSimpleMovingAverage) && ((ApiTechnicalIndicator.ApiSimpleMovingAverage) apiTechnicalIndicator4).getPeriod() == priceBelowSma.getPeriod()) {
                            obj = next4;
                        }
                    }
                }
                ApiTechnicalIndicator apiSimpleMovingAverage4 = (ApiTechnicalIndicator) obj;
                if (apiSimpleMovingAverage4 == null) {
                    apiSimpleMovingAverage4 = new ApiTechnicalIndicator.ApiSimpleMovingAverage(Boolean.TRUE, priceBelowSma.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiSimpleMovingAverage4);
                break;
            case 5:
                AlertHubSettingItem alert5 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert5, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.EmaAbove");
                AlertHubSettingItem.EmaAbove emaAbove = (AlertHubSettingItem.EmaAbove) alert5;
                Iterator<T> it5 = technicalIndicatorList.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        Object next5 = it5.next();
                        ApiTechnicalIndicator apiTechnicalIndicator5 = (ApiTechnicalIndicator) next5;
                        if (apiTechnicalIndicator5.getType() == ApiTechnicalIndicator.Type.EMA && (apiTechnicalIndicator5 instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) && ((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator5).getPeriod() == emaAbove.getPeriod()) {
                            obj = next5;
                        }
                    }
                }
                ApiTechnicalIndicator apiExponentialMovingAverage = (ApiTechnicalIndicator) obj;
                if (apiExponentialMovingAverage == null) {
                    apiExponentialMovingAverage = new ApiTechnicalIndicator.ApiExponentialMovingAverage(Boolean.TRUE, emaAbove.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiExponentialMovingAverage);
                break;
            case 6:
                AlertHubSettingItem alert6 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert6, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.EmaBelow");
                AlertHubSettingItem.EmaBelow emaBelow = (AlertHubSettingItem.EmaBelow) alert6;
                Iterator<T> it6 = technicalIndicatorList.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        ApiTechnicalIndicator apiTechnicalIndicator6 = (ApiTechnicalIndicator) next6;
                        if (apiTechnicalIndicator6.getType() == ApiTechnicalIndicator.Type.EMA && (apiTechnicalIndicator6 instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) && ((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator6).getPeriod() == emaBelow.getPeriod()) {
                            obj = next6;
                        }
                    }
                }
                ApiTechnicalIndicator apiExponentialMovingAverage2 = (ApiTechnicalIndicator) obj;
                if (apiExponentialMovingAverage2 == null) {
                    apiExponentialMovingAverage2 = new ApiTechnicalIndicator.ApiExponentialMovingAverage(Boolean.TRUE, emaBelow.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiExponentialMovingAverage2);
                break;
            case 7:
                AlertHubSettingItem alert7 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert7, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceAboveEma");
                AlertHubSettingItem.PriceAboveEma priceAboveEma = (AlertHubSettingItem.PriceAboveEma) alert7;
                Iterator<T> it7 = technicalIndicatorList.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        Object next7 = it7.next();
                        ApiTechnicalIndicator apiTechnicalIndicator7 = (ApiTechnicalIndicator) next7;
                        if (apiTechnicalIndicator7.getType() == ApiTechnicalIndicator.Type.EMA && (apiTechnicalIndicator7 instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) && ((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator7).getPeriod() == priceAboveEma.getPeriod()) {
                            obj = next7;
                        }
                    }
                }
                ApiTechnicalIndicator apiExponentialMovingAverage3 = (ApiTechnicalIndicator) obj;
                if (apiExponentialMovingAverage3 == null) {
                    apiExponentialMovingAverage3 = new ApiTechnicalIndicator.ApiExponentialMovingAverage(Boolean.TRUE, priceAboveEma.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiExponentialMovingAverage3);
                break;
            case 8:
                AlertHubSettingItem alert8 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert8, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceBelowEma");
                AlertHubSettingItem.PriceBelowEma priceBelowEma = (AlertHubSettingItem.PriceBelowEma) alert8;
                Iterator<T> it8 = technicalIndicatorList.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next8 = it8.next();
                        ApiTechnicalIndicator apiTechnicalIndicator8 = (ApiTechnicalIndicator) next8;
                        if (apiTechnicalIndicator8.getType() == ApiTechnicalIndicator.Type.EMA && (apiTechnicalIndicator8 instanceof ApiTechnicalIndicator.ApiExponentialMovingAverage) && ((ApiTechnicalIndicator.ApiExponentialMovingAverage) apiTechnicalIndicator8).getPeriod() == priceBelowEma.getPeriod()) {
                            obj = next8;
                        }
                    }
                }
                ApiTechnicalIndicator apiExponentialMovingAverage4 = (ApiTechnicalIndicator) obj;
                if (apiExponentialMovingAverage4 == null) {
                    apiExponentialMovingAverage4 = new ApiTechnicalIndicator.ApiExponentialMovingAverage(Boolean.TRUE, priceBelowEma.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiExponentialMovingAverage4);
                break;
            case 9:
                AlertHubSettingItem alert9 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert9, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.RsiAbove");
                AlertHubSettingItem.RsiAbove rsiAbove = (AlertHubSettingItem.RsiAbove) alert9;
                Iterator<T> it9 = technicalIndicatorList.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next9 = it9.next();
                        ApiTechnicalIndicator apiTechnicalIndicator9 = (ApiTechnicalIndicator) next9;
                        if (apiTechnicalIndicator9.getType() == ApiTechnicalIndicator.Type.RSI && (apiTechnicalIndicator9 instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) && ((ApiTechnicalIndicator.ApiRelativeStrengthIndex) apiTechnicalIndicator9).getPeriod() == rsiAbove.getPeriod()) {
                            obj = next9;
                        }
                    }
                }
                ApiTechnicalIndicator apiRelativeStrengthIndex = (ApiTechnicalIndicator) obj;
                if (apiRelativeStrengthIndex == null) {
                    apiRelativeStrengthIndex = new ApiTechnicalIndicator.ApiRelativeStrengthIndex(Boolean.TRUE, 70, 30, rsiAbove.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiRelativeStrengthIndex);
                break;
            case 10:
                AlertHubSettingItem alert10 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert10, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.RsiBelow");
                AlertHubSettingItem.RsiBelow rsiBelow = (AlertHubSettingItem.RsiBelow) alert10;
                Iterator<T> it10 = technicalIndicatorList.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next10 = it10.next();
                        ApiTechnicalIndicator apiTechnicalIndicator10 = (ApiTechnicalIndicator) next10;
                        if (apiTechnicalIndicator10.getType() == ApiTechnicalIndicator.Type.RSI && (apiTechnicalIndicator10 instanceof ApiTechnicalIndicator.ApiRelativeStrengthIndex) && ((ApiTechnicalIndicator.ApiRelativeStrengthIndex) apiTechnicalIndicator10).getPeriod() == rsiBelow.getPeriod()) {
                            obj = next10;
                        }
                    }
                }
                ApiTechnicalIndicator apiRelativeStrengthIndex2 = (ApiTechnicalIndicator) obj;
                if (apiRelativeStrengthIndex2 == null) {
                    apiRelativeStrengthIndex2 = new ApiTechnicalIndicator.ApiRelativeStrengthIndex(Boolean.TRUE, 70, 30, rsiBelow.getPeriod());
                }
                alertSettingWithResource.setIndicator(apiRelativeStrengthIndex2);
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                Iterator<T> it11 = technicalIndicatorList.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next11 = it11.next();
                        if (((ApiTechnicalIndicator) next11).getType() == ApiTechnicalIndicator.Type.VWAP) {
                            obj = next11;
                        }
                    }
                }
                ApiTechnicalIndicator apiVolumeWeightedAveragePrice = (ApiTechnicalIndicator) obj;
                if (apiVolumeWeightedAveragePrice == null) {
                    apiVolumeWeightedAveragePrice = new ApiTechnicalIndicator.ApiVolumeWeightedAveragePrice(Boolean.TRUE);
                }
                alertSettingWithResource.setIndicator(apiVolumeWeightedAveragePrice);
                break;
            case 15:
            case 16:
                Iterator<T> it12 = technicalIndicatorList.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next12 = it12.next();
                        ApiTechnicalIndicator apiTechnicalIndicator11 = (ApiTechnicalIndicator) next12;
                        if (apiTechnicalIndicator11.getType() == ApiTechnicalIndicator.Type.MACD && (apiTechnicalIndicator11 instanceof ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence)) {
                            obj = next12;
                        }
                    }
                }
                ApiTechnicalIndicator apiMovingAverageConvergenceDivergence = (ApiTechnicalIndicator) obj;
                if (apiMovingAverageConvergenceDivergence == null) {
                    apiMovingAverageConvergenceDivergence = new ApiTechnicalIndicator.ApiMovingAverageConvergenceDivergence(Boolean.TRUE, 9, 12, 26);
                }
                alertSettingWithResource.setIndicator(apiMovingAverageConvergenceDivergence);
                break;
            case 17:
                AlertHubSettingItem alert11 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert11, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceAboveBollUpper");
                AlertHubSettingItem.PriceAboveBollUpper priceAboveBollUpper = (AlertHubSettingItem.PriceAboveBollUpper) alert11;
                Iterator<T> it13 = technicalIndicatorList.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next13 = it13.next();
                        ApiTechnicalIndicator apiTechnicalIndicator12 = (ApiTechnicalIndicator) next13;
                        if (apiTechnicalIndicator12.getType() == ApiTechnicalIndicator.Type.BOLL && (apiTechnicalIndicator12 instanceof ApiTechnicalIndicator.ApiBollingerBands) && ((ApiTechnicalIndicator.ApiBollingerBands) apiTechnicalIndicator12).getPeriod() == priceAboveBollUpper.getPeriod()) {
                            obj = next13;
                        }
                    }
                }
                ApiTechnicalIndicator apiBollingerBands = (ApiTechnicalIndicator) obj;
                if (apiBollingerBands == null) {
                    apiBollingerBands = new ApiTechnicalIndicator.ApiBollingerBands(Boolean.TRUE, null, priceAboveBollUpper.getPeriod(), new BigDecimal(2), 2, null);
                }
                alertSettingWithResource.setIndicator(apiBollingerBands);
                break;
            case 18:
                AlertHubSettingItem alert12 = alertSettingWithResource.getAlert();
                Intrinsics.checkNotNull(alert12, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceBelowBollLower");
                AlertHubSettingItem.PriceBelowBollLower priceBelowBollLower = (AlertHubSettingItem.PriceBelowBollLower) alert12;
                Iterator<T> it14 = technicalIndicatorList.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        Object next14 = it14.next();
                        ApiTechnicalIndicator apiTechnicalIndicator13 = (ApiTechnicalIndicator) next14;
                        if (apiTechnicalIndicator13.getType() == ApiTechnicalIndicator.Type.BOLL && (apiTechnicalIndicator13 instanceof ApiTechnicalIndicator.ApiBollingerBands) && ((ApiTechnicalIndicator.ApiBollingerBands) apiTechnicalIndicator13).getPeriod() == priceBelowBollLower.getPeriod()) {
                            obj = next14;
                        }
                    }
                }
                ApiTechnicalIndicator apiBollingerBands2 = (ApiTechnicalIndicator) obj;
                if (apiBollingerBands2 == null) {
                    apiBollingerBands2 = new ApiTechnicalIndicator.ApiBollingerBands(Boolean.TRUE, null, priceBelowBollLower.getPeriod(), new BigDecimal(2), 2, null);
                }
                alertSettingWithResource.setIndicator(apiBollingerBands2);
                break;
            default:
                alertSettingWithResource.setIndicator(null);
                break;
        }
        return alertSettingWithResource;
    }
}
