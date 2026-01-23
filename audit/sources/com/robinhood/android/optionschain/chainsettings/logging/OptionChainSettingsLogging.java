package com.robinhood.android.optionschain.chainsettings.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.optionchain.chainsettings.logging.OptionChainSettingsLoggingIdentifier;
import com.robinhood.models.p320db.OptionChainSettingsTableMetric;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainSettingsLogging.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\u001a \u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019¨\u0006\u001a"}, m3636d2 = {"logOnDefaultPriceChanged", "", "Lcom/robinhood/analytics/EventLogger;", "setting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "logOnBidAskPriceLabelChanged", "type", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "logTapDefaultPriceSettings", "logTapCustomizeChain", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "tapType", "Lcom/robinhood/android/optionschain/chainsettings/logging/OptionChainSettingsLoggingTapType;", "logChangeDisplayMode", "sbsChainEnabled", "", "logChangeSbsChainMetrics", "interactionType", "Lcom/robinhood/android/optionschain/chainsettings/logging/OptionSbsChainMetricsInteractionType;", "metrics", "", "Lcom/robinhood/models/db/OptionChainSettingsTableMetric;", "logToggleSimulatedReturnChartType", "chartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLoggingKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainSettingsLogging {

    /* compiled from: OptionChainSettingsLogging.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLoggingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OptionChainSettingsLogging2.values().length];
            try {
                iArr[OptionChainSettingsLogging2.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainSettingsLogging2.ROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionChainSettingsLogging3.values().length];
            try {
                iArr3[OptionChainSettingsLogging3.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[OptionChainSettingsLogging3.REORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OptionChainSettingsPnlChartType.values().length];
            try {
                iArr4[OptionChainSettingsPnlChartType.BY_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[OptionChainSettingsPnlChartType.OVER_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void logOnDefaultPriceChanged(EventLogger eventLogger, OptionSettings.DefaultPricingSetting setting) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(setting, "setting");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.RADIO_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, setting.getServerValue(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public static final void logOnBidAskPriceLabelChanged(EventLogger eventLogger, OptionChainSettingsSideBySideBidAskPriceLabelType type2) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.RADIO_BUTTON, null, null, 6, null), null, new Context(0, 0, 0, type2.toString(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }

    public static final void logTapDefaultPriceSettings(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.DROPDOWN_OPTION, null, null, 6, null), null, null, false, 57, null);
    }

    public static final void logTapCustomizeChain(EventLogger eventLogger, OrderSide orderSide, OptionChainSettingsLogging2 tapType) {
        Component.ComponentType componentType;
        String identifier;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(tapType, "tapType");
        Screen screen = new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null);
        int i = WhenMappings.$EnumSwitchMapping$0[tapType.ordinal()];
        if (i == 1) {
            componentType = Component.ComponentType.BUTTON;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            componentType = Component.ComponentType.ROW;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
        if (i2 == 1) {
            identifier = OptionChainSettingsLoggingIdentifier.CUSTOMIZE_BUY.getIdentifier();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            identifier = OptionChainSettingsLoggingIdentifier.CUSTOMIZE_SELL.getIdentifier();
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, identifier, null, 4, null), null, null, false, 57, null);
    }

    public static final void logChangeDisplayMode(EventLogger eventLogger, boolean z) {
        String chainTypeForLogging;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        if (z) {
            chainTypeForLogging = OptionChainDisplayMode.SIDE_BY_SIDE.toChainTypeForLogging();
        } else {
            chainTypeForLogging = OptionChainDisplayMode.DEFAULT.toChainTypeForLogging();
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_DISPLAY_MODE_CARD, chainTypeForLogging, null, 4, null), null, null, false, 57, null);
    }

    public static final void logChangeSbsChainMetrics(EventLogger eventLogger, OptionChainSettingsLogging3 interactionType, List<OptionChainSettingsTableMetric> metrics) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(interactionType, "interactionType");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Screen screen = new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null);
        Component component = new Component(Component.ComponentType.ROW, "sbs_metrics", null, 4, null);
        List<OptionChainSettingsTableMetric> list = metrics;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionChainSettingsTableMetric) it.next()).getMetric().getServerValue());
        }
        Context context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsChainCustomizationContext(null, null, null, null, null, null, null, arrayList, null, 383, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1025, -1, 16383, null);
        int i = WhenMappings.$EnumSwitchMapping$2[interactionType.ordinal()];
        if (i == 1) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, component, null, context, false, 41, null);
            Unit unit = Unit.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EventLogger.DefaultImpls.logDrag$default(eventLogger, null, screen, component, null, context, false, 41, null);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public static final void logToggleSimulatedReturnChartType(EventLogger eventLogger, OptionChainSettingsPnlChartType chartType) {
        String str;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        int i = WhenMappings.$EnumSwitchMapping$3[chartType.ordinal()];
        if (i == 1) {
            str = "PRICE";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "TIME";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null), new Component(Component.ComponentType.OPTION_PROFIT_AND_LOSS_CARD, str, null, 4, null), null, null, false, 57, null);
    }
}
