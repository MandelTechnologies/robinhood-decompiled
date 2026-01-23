package com.robinhood.android.optionchain.chainsettings;

import android.content.res.Resources;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.Either;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainFallbackMetrics.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, m3636d2 = {"getFallbackSelectedMetric", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "resources", "Landroid/content/res/Resources;", "type", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/db/OrderSide;", "Lcom/robinhood/models/api/OptionStrategyType;", "getStandardDefaultMetric", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$MetricType;", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionchain.chainsettings.OptionChainFallbackMetricsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionChainFallbackMetrics {

    /* compiled from: OptionChainFallbackMetrics.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionchain.chainsettings.OptionChainFallbackMetricsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionStrategyType.values().length];
            try {
                iArr2[OptionStrategyType.LONG_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionStrategyType.BUY_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionStrategyType.LONG_PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OptionStrategyType.BUY_PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionStrategyType.SHORT_CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OptionStrategyType.SHORT_PUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionChainAvailableMetrics.MetricType.values().length];
            try {
                iArr3[OptionChainAvailableMetrics.MetricType.BREAKEVEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OptionChainAvailableMetrics.MetricType.TO_BREAKEVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OptionChainAvailableMetrics.MetricType.CHANCE_OF_PROFIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionChainAvailableMetrics.MetricType.BID_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OptionChainAvailableMetrics.MetricType.ASK_PRICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Tuples2<OptionChainAvailableMetrics.Metric, OptionChainAvailableMetrics.Metric> getFallbackSelectedMetric(Resources resources, Either<? extends OrderSide, ? extends OptionStrategyType> either) {
        OptionChainAvailableMetrics.Metric standardDefaultMetric;
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (either == null) {
            return new Tuples2<>(getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.BREAKEVEN, resources), getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.TO_BREAKEVEN, resources));
        }
        if (either instanceof Either.Left) {
            OrderSide orderSide = (OrderSide) ((Either.Left) either).getValue();
            OptionChainAvailableMetrics.Metric standardDefaultMetric2 = getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.BREAKEVEN, resources);
            int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i == 1) {
                standardDefaultMetric = getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.TO_BREAKEVEN, resources);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                standardDefaultMetric = getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.CHANCE_OF_PROFIT, resources);
            }
            return new Tuples2<>(standardDefaultMetric2, standardDefaultMetric);
        }
        if (!(either instanceof Either.Right)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (WhenMappings.$EnumSwitchMapping$1[((OptionStrategyType) ((Either.Right) either).getValue()).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return new Tuples2<>(getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.BREAKEVEN, resources), getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.TO_BREAKEVEN, resources));
            case 5:
            case 6:
                return new Tuples2<>(getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.BREAKEVEN, resources), getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.CHANCE_OF_PROFIT, resources));
            default:
                return new Tuples2<>(getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.BID_PRICE, resources), getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType.ASK_PRICE, resources));
        }
    }

    private static final OptionChainAvailableMetrics.Metric getStandardDefaultMetric(OptionChainAvailableMetrics.MetricType metricType, Resources resources) throws Resources.NotFoundException {
        int i = WhenMappings.$EnumSwitchMapping$2[metricType.ordinal()];
        if (i == 1) {
            String string2 = resources.getString(C22987R.string.option_chain_customization_default_breakeven_metric_label);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = resources.getString(C22987R.string.option_chain_customization_default_breakeven_metric_label);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return new OptionChainAvailableMetrics.Metric(string2, string3, OptionChainAvailableMetrics.MetricType.BREAKEVEN, true);
        }
        if (i == 2) {
            String string4 = resources.getString(C22987R.string.f4719xb6b18c5f);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = resources.getString(C22987R.string.option_chain_customization_default_to_breakeven_metric_label);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return new OptionChainAvailableMetrics.Metric(string4, string5, OptionChainAvailableMetrics.MetricType.TO_BREAKEVEN, true);
        }
        if (i == 3) {
            String string6 = resources.getString(C22987R.string.option_chain_customization_default_chance_of_profit_metric_label);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            String string7 = resources.getString(C22987R.string.option_chain_customization_default_chance_of_profit_metric_label);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return new OptionChainAvailableMetrics.Metric(string6, string7, OptionChainAvailableMetrics.MetricType.CHANCE_OF_PROFIT, true);
        }
        if (i == 4) {
            String string8 = resources.getString(C22987R.string.option_chain_customization_default_bid_metric_chain_label);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            String string9 = resources.getString(C22987R.string.option_chain_customization_default_bid_metric_label);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            return new OptionChainAvailableMetrics.Metric(string8, string9, OptionChainAvailableMetrics.MetricType.BID_PRICE, true);
        }
        if (i == 5) {
            String string10 = resources.getString(C22987R.string.option_chain_customization_default_ask_metric_chain_label);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            String string11 = resources.getString(C22987R.string.option_chain_customization_default_ask_metric_label);
            Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
            return new OptionChainAvailableMetrics.Metric(string10, string11, OptionChainAvailableMetrics.MetricType.ASK_PRICE, true);
        }
        throw new IllegalStateException("invalid metric type usage");
    }
}
