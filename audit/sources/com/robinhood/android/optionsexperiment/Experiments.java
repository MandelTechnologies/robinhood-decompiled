package com.robinhood.android.optionsexperiment;

import com.robinhood.android.options.history.detail.order.OptionOrderDetailStateProvider2;
import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.models.p320db.KaizenExperiment;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: Experiments.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b.\bÆ\u0002\u0018\u00002\u00020\u0001:+\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments;", "", "<init>", "()V", "OptionsValuationTradeFlowM1Experiment", "OptionsSingleLegMarketabilityExperiment", "OptionsMaxOrderSizeImprovementsExperiment", "OptionsCatFeesCopyKillSwitch", "OptionsCatFeesKillSwitch", "OptionsOrderPathMaxOrderSizeV2", "OptionsOrderPathAmbiguousOrderDirection", "OptionsOrderPathMarketTradingHours", "OptionsOrderPathStopMarketTradingHours", "OptionsOrderPathBidAskSpread", "OptionsOrderPathNeccMultileg", "OptionsOrderPathMaxOrderSizeV3", "OptionsMarginRoutingExperiment", "OptionsSkipAnsweredSpreadsExperiment", "OptionsSkipAnsweredYoeExperiment", "OptionsImproveInvestmentProfileExperiment", "OptionsSkipSpreadsEduExperiment", "OptionsKnowledgeCheckM1Experiment", "OptionsKnowledgeCheckM2Experiment", "OptionsInfoGatheringExperiment", "OptionsInJointAccountPreSetupExperiment", "OptionsExpirationDateSnackbarDismissalExperiment", "OptionsSideBySideChainNuxRevampExperiment", "OptionsSelloutImprovementExperiment", "OptionsPostEnablementSdpEntryExperiment", "OptionsPostEnablementNonSdpEntryExperiment", "OptionsShortSellingExercise", "OptionsOnboardingL0SplashRedesignExperiment", "OptionsOnboardingL2SplashRedesignV2Experiment", "SdpOptionsUpsellAllowNullRiskTolerance", "IndexOptionsExtendedHoursCurb", "IndexOptionsSingleLegOrderSummaryUpdates", "OptionsMultiLegGreek", "OptionsPlaceAgain", "OptionsSnackbarDismissalFollowUp", "OptionsLevel3EntryPointOptionSettings", "OptionsLevel3EntryPointPostTradeUpsell", "OptionsLevel3EntryPointAssetHome", "OptionsLevel3EntryPointSdp", "OptionsPortfolioRiskAnalyzer", "OptionsSbsBidAskSetting", "ReorderOptionsSectionOnSdp", "SbsChainPerfImprovement", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class Experiments {
    public static final Experiments INSTANCE = new Experiments();

    private Experiments() {
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsValuationTradeFlowM1Experiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsValuationTradeFlowM1Experiment$Variant;", "<init>", "()V", "Variant", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class OptionsValuationTradeFlowM1Experiment extends Experiment<Variant> {
        public static final OptionsValuationTradeFlowM1Experiment INSTANCE = new OptionsValuationTradeFlowM1Experiment();

        private OptionsValuationTradeFlowM1Experiment() {
            super("options-valuation-trade-flow-m1", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Experiments.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsValuationTradeFlowM1Experiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "MEMBER", "DEBUG", "isInExperiment", "", "()Z", "marketabilityDebounceRate", "", "getMarketabilityDebounceRate", "()J", "Companion", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variant MEMBER = new Variant("MEMBER", 1, KaizenExperiment.VARIATION_MEMBER);
            public static final Variant DEBUG = new Variant("DEBUG", 2, SLRemoteConfiguration.Constants.DEBUG_JSON_KEY);

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, MEMBER, DEBUG};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public final boolean isInExperiment() {
                return this != CONTROL;
            }

            public final long getMarketabilityDebounceRate() {
                return isInExperiment() ? 0L : 150L;
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSingleLegMarketabilityExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class OptionsSingleLegMarketabilityExperiment extends Experiment<SimpleVariant> {
        public static final OptionsSingleLegMarketabilityExperiment INSTANCE = new OptionsSingleLegMarketabilityExperiment();

        private OptionsSingleLegMarketabilityExperiment() {
            super("options-single-leg-marketability-migration", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMaxOrderSizeImprovementsExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class OptionsMaxOrderSizeImprovementsExperiment extends Experiment<SimpleVariant> {
        public static final OptionsMaxOrderSizeImprovementsExperiment INSTANCE = new OptionsMaxOrderSizeImprovementsExperiment();

        private OptionsMaxOrderSizeImprovementsExperiment() {
            super("options-max-order-size-improvements", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsCatFeesCopyKillSwitch;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class OptionsCatFeesCopyKillSwitch extends Experiment<SimpleVariant> {
        public static final OptionsCatFeesCopyKillSwitch INSTANCE = new OptionsCatFeesCopyKillSwitch();

        private OptionsCatFeesCopyKillSwitch() {
            super("options-cat-fees-copy-kill-switch", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsCatFeesKillSwitch;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class OptionsCatFeesKillSwitch extends Experiment<SimpleVariant> {
        public static final OptionsCatFeesKillSwitch INSTANCE = new OptionsCatFeesKillSwitch();

        private OptionsCatFeesKillSwitch() {
            super("options-cat-fees-kill-switch", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathMaxOrderSizeV2;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathMaxOrderSizeV2 extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathMaxOrderSizeV2 INSTANCE = new OptionsOrderPathMaxOrderSizeV2();

        private OptionsOrderPathMaxOrderSizeV2() {
            super("options-order-path-max-order-size-v2", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathAmbiguousOrderDirection;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathAmbiguousOrderDirection extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathAmbiguousOrderDirection INSTANCE = new OptionsOrderPathAmbiguousOrderDirection();

        private OptionsOrderPathAmbiguousOrderDirection() {
            super("options-order-path-ambiguous-order-direction", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathMarketTradingHours;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathMarketTradingHours extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathMarketTradingHours INSTANCE = new OptionsOrderPathMarketTradingHours();

        private OptionsOrderPathMarketTradingHours() {
            super("options-order-path-market-trading-hours", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathStopMarketTradingHours;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathStopMarketTradingHours extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathStopMarketTradingHours INSTANCE = new OptionsOrderPathStopMarketTradingHours();

        private OptionsOrderPathStopMarketTradingHours() {
            super("options-order-path-stop-market-trading-hours", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathBidAskSpread;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathBidAskSpread extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathBidAskSpread INSTANCE = new OptionsOrderPathBidAskSpread();

        private OptionsOrderPathBidAskSpread() {
            super("options-order-path-bid-ask-spread", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathNeccMultileg;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathNeccMultileg extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathNeccMultileg INSTANCE = new OptionsOrderPathNeccMultileg();

        private OptionsOrderPathNeccMultileg() {
            super("options-order-path-necc-multileg", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOrderPathMaxOrderSizeV3;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOrderPathMaxOrderSizeV3 extends Experiment<SimpleVariant> {
        public static final OptionsOrderPathMaxOrderSizeV3 INSTANCE = new OptionsOrderPathMaxOrderSizeV3();

        private OptionsOrderPathMaxOrderSizeV3() {
            super("options-order-path-max-order-size-v3", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMarginRoutingExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsMarginRoutingExperiment extends Experiment<SimpleVariant> {
        public static final OptionsMarginRoutingExperiment INSTANCE = new OptionsMarginRoutingExperiment();

        private OptionsMarginRoutingExperiment() {
            super("options-onboarding-improvements-m2-3-margin-routing", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSkipAnsweredSpreadsExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSkipAnsweredSpreadsExperiment extends Experiment<SimpleVariant> {
        public static final OptionsSkipAnsweredSpreadsExperiment INSTANCE = new OptionsSkipAnsweredSpreadsExperiment();

        private OptionsSkipAnsweredSpreadsExperiment() {
            super("options-onboarding-improvements-m2-4-skip-answered-spreads", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSkipAnsweredYoeExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSkipAnsweredYoeExperiment extends Experiment<SimpleVariant> {
        public static final OptionsSkipAnsweredYoeExperiment INSTANCE = new OptionsSkipAnsweredYoeExperiment();

        private OptionsSkipAnsweredYoeExperiment() {
            super("options-onboarding-improvements-m2-5-skip-answered-yoe", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsImproveInvestmentProfileExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsImproveInvestmentProfileExperiment extends Experiment<SimpleVariant> {
        public static final OptionsImproveInvestmentProfileExperiment INSTANCE = new OptionsImproveInvestmentProfileExperiment();

        private OptionsImproveInvestmentProfileExperiment() {
            super("options-onboarding-improvements-m2-6-investor-profile", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSkipSpreadsEduExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSkipSpreadsEduExperiment extends Experiment<SimpleVariant> {
        public static final OptionsSkipSpreadsEduExperiment INSTANCE = new OptionsSkipSpreadsEduExperiment();

        private OptionsSkipSpreadsEduExperiment() {
            super("options-onboarding-improvements-m2-7-skip-spreads-edu", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsKnowledgeCheckM1Experiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsKnowledgeCheckM1Experiment extends Experiment<SimpleVariant> {
        public static final OptionsKnowledgeCheckM1Experiment INSTANCE = new OptionsKnowledgeCheckM1Experiment();

        private OptionsKnowledgeCheckM1Experiment() {
            super("options-eligibility-knowledge-check-manual-review-m1", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsKnowledgeCheckM2Experiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsKnowledgeCheckM2Experiment extends Experiment<SimpleVariant> {
        public static final OptionsKnowledgeCheckM2Experiment INSTANCE = new OptionsKnowledgeCheckM2Experiment();

        private OptionsKnowledgeCheckM2Experiment() {
            super("options-eligibility-knowledge-check-manual-review-m2", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsInfoGatheringExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsInfoGatheringExperiment extends Experiment<SimpleVariant> {
        public static final OptionsInfoGatheringExperiment INSTANCE = new OptionsInfoGatheringExperiment();

        private OptionsInfoGatheringExperiment() {
            super("options-onboarding-improvements-m3-2-info-gathering", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsInJointAccountPreSetupExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsInJointAccountPreSetupExperiment extends Experiment<SimpleVariant> {
        public static final OptionsInJointAccountPreSetupExperiment INSTANCE = new OptionsInJointAccountPreSetupExperiment();

        private OptionsInJointAccountPreSetupExperiment() {
            super("options-in-joint-account-pre-setup", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsExpirationDateSnackbarDismissalExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsExpirationDateSnackbarDismissalExperiment extends Experiment<SimpleVariant> {
        public static final OptionsExpirationDateSnackbarDismissalExperiment INSTANCE = new OptionsExpirationDateSnackbarDismissalExperiment();

        private OptionsExpirationDateSnackbarDismissalExperiment() {
            super("options-expiration-date-snackbar-dismissal", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSideBySideChainNuxRevampExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSideBySideChainNuxRevampExperiment extends Experiment<SimpleVariant> {
        public static final OptionsSideBySideChainNuxRevampExperiment INSTANCE = new OptionsSideBySideChainNuxRevampExperiment();

        private OptionsSideBySideChainNuxRevampExperiment() {
            super("options-side-by-side-chain-nux-revamp", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSelloutImprovementExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSelloutImprovementExperiment extends Experiment<SimpleVariant> {
        public static final OptionsSelloutImprovementExperiment INSTANCE = new OptionsSelloutImprovementExperiment();

        private OptionsSelloutImprovementExperiment() {
            super("options-sellout-improvement-m2", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPostEnablementSdpEntryExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsPostEnablementSdpEntryExperiment extends Experiment<SimpleVariant> {
        public static final OptionsPostEnablementSdpEntryExperiment INSTANCE = new OptionsPostEnablementSdpEntryExperiment();

        private OptionsPostEnablementSdpEntryExperiment() {
            super("acq-post-options-enablement-sdp", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPostEnablementNonSdpEntryExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsPostEnablementNonSdpEntryExperiment extends Experiment<SimpleVariant> {
        public static final OptionsPostEnablementNonSdpEntryExperiment INSTANCE = new OptionsPostEnablementNonSdpEntryExperiment();

        private OptionsPostEnablementNonSdpEntryExperiment() {
            super("acq-post-options-enablement-non-sdp", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsShortSellingExercise;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsShortSellingExercise extends Experiment<SimpleVariant> {
        public static final OptionsShortSellingExercise INSTANCE = new OptionsShortSellingExercise();

        private OptionsShortSellingExercise() {
            super("options-short-selling-exercise", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOnboardingL0SplashRedesignExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOnboardingL0SplashRedesignExperiment$Variant;", "<init>", "()V", "Variant", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOnboardingL0SplashRedesignExperiment extends Experiment<Variant> {
        public static final OptionsOnboardingL0SplashRedesignExperiment INSTANCE = new OptionsOnboardingL0SplashRedesignExperiment();

        private OptionsOnboardingL0SplashRedesignExperiment() {
            super("options-onboarding-l0-splash-redesign", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Experiments.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOnboardingL0SplashRedesignExperiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "COPY", "LOTTIE", "VIDEO", "Companion", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variant COPY = new Variant("COPY", 1, "copy");
            public static final Variant LOTTIE = new Variant("LOTTIE", 2, "lottie");
            public static final Variant VIDEO = new Variant("VIDEO", 3, "video");

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, COPY, LOTTIE, VIDEO};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOnboardingL2SplashRedesignV2Experiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOnboardingL2SplashRedesignV2Experiment$Variant;", "<init>", "()V", "Variant", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsOnboardingL2SplashRedesignV2Experiment extends Experiment<Variant> {
        public static final OptionsOnboardingL2SplashRedesignV2Experiment INSTANCE = new OptionsOnboardingL2SplashRedesignV2Experiment();

        private OptionsOnboardingL2SplashRedesignV2Experiment() {
            super("options-onboarding-l2-splash-redesign-v2", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Experiments.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsOnboardingL2SplashRedesignV2Experiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "COPY", "LOTTIE", "Companion", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variant COPY = new Variant("COPY", 1, "copy");
            public static final Variant LOTTIE = new Variant("LOTTIE", 2, "lottie");

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, COPY, LOTTIE};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$SdpOptionsUpsellAllowNullRiskTolerance;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SdpOptionsUpsellAllowNullRiskTolerance extends Experiment<SimpleVariant> {
        public static final SdpOptionsUpsellAllowNullRiskTolerance INSTANCE = new SdpOptionsUpsellAllowNullRiskTolerance();

        private SdpOptionsUpsellAllowNullRiskTolerance() {
            super("sdp-options-upsell-include-null-risk-tolerance", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$IndexOptionsExtendedHoursCurb;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IndexOptionsExtendedHoursCurb extends Experiment<SimpleVariant> {
        public static final IndexOptionsExtendedHoursCurb INSTANCE = new IndexOptionsExtendedHoursCurb();

        private IndexOptionsExtendedHoursCurb() {
            super("index-options-extended-hours-curb", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$IndexOptionsSingleLegOrderSummaryUpdates;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/optionsexperiment/Experiments$IndexOptionsSingleLegOrderSummaryUpdates$Variant;", "<init>", "()V", "Variant", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IndexOptionsSingleLegOrderSummaryUpdates extends Experiment<Variant> {
        public static final IndexOptionsSingleLegOrderSummaryUpdates INSTANCE = new IndexOptionsSingleLegOrderSummaryUpdates();

        private IndexOptionsSingleLegOrderSummaryUpdates() {
            super("index-options-single-leg-order-summary-updates", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Experiments.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$IndexOptionsSingleLegOrderSummaryUpdates$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "SHORTEN", "REMOVE", "Companion", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variant SHORTEN = new Variant("SHORTEN", 1, "shorten");
            public static final Variant REMOVE = new Variant("REMOVE", 2, "remove");

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, SHORTEN, REMOVE};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek$Variant;", "<init>", "()V", "Variant", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsMultiLegGreek extends Experiment<Variant> {
        public static final OptionsMultiLegGreek INSTANCE = new OptionsMultiLegGreek();

        private OptionsMultiLegGreek() {
            super("options-multi-leg-greek", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Experiments.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsMultiLegGreek$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "GREEK_THEN_OPTION", "OPTION_THEN_GREEK", "CONTROL", "Companion", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant GREEK_THEN_OPTION = new Variant("GREEK_THEN_OPTION", 0, "greek-then-option");
            public static final Variant OPTION_THEN_GREEK = new Variant("OPTION_THEN_GREEK", 1, "option-then-greek");
            public static final Variant CONTROL = new Variant("CONTROL", 2, KaizenExperiment.VARIATION_CONTROL);

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{GREEK_THEN_OPTION, OPTION_THEN_GREEK, CONTROL};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPlaceAgain;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPlaceAgain$Variant;", "<init>", "()V", "Variant", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsPlaceAgain extends Experiment<Variant> {
        public static final OptionsPlaceAgain INSTANCE = new OptionsPlaceAgain();

        private OptionsPlaceAgain() {
            super("options-place-again", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Experiments.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPlaceAgain$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "PLACE_AGAIN", "CREATE_DUPLICATE_ORDER", "CONTROL", "Companion", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant PLACE_AGAIN = new Variant("PLACE_AGAIN", 0, OptionOrderDetailStateProvider2.BUTTON_COMPONENT_PLACE_AGAIN);
            public static final Variant CREATE_DUPLICATE_ORDER = new Variant("CREATE_DUPLICATE_ORDER", 1, OptionOrderDetailStateProvider2.BUTTON_COMPONENT_CREATE_DUPLICATE_ORDER);
            public static final Variant CONTROL = new Variant("CONTROL", 2, KaizenExperiment.VARIATION_CONTROL);

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{PLACE_AGAIN, CREATE_DUPLICATE_ORDER, CONTROL};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSnackbarDismissalFollowUp;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSnackbarDismissalFollowUp extends Experiment<SimpleVariant> {
        public static final OptionsSnackbarDismissalFollowUp INSTANCE = new OptionsSnackbarDismissalFollowUp();

        private OptionsSnackbarDismissalFollowUp() {
            super("options-snackbar-dismissal-follow-up", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsLevel3EntryPointOptionSettings;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsLevel3EntryPointOptionSettings extends Experiment<SimpleVariant> {
        public static final OptionsLevel3EntryPointOptionSettings INSTANCE = new OptionsLevel3EntryPointOptionSettings();

        private OptionsLevel3EntryPointOptionSettings() {
            super("options-level3-entry-point-option-settings", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsLevel3EntryPointPostTradeUpsell;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsLevel3EntryPointPostTradeUpsell extends Experiment<SimpleVariant> {
        public static final OptionsLevel3EntryPointPostTradeUpsell INSTANCE = new OptionsLevel3EntryPointPostTradeUpsell();

        private OptionsLevel3EntryPointPostTradeUpsell() {
            super("options-level3-entry-point-post-trade-upsell", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsLevel3EntryPointAssetHome;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsLevel3EntryPointAssetHome extends Experiment<SimpleVariant> {
        public static final OptionsLevel3EntryPointAssetHome INSTANCE = new OptionsLevel3EntryPointAssetHome();

        private OptionsLevel3EntryPointAssetHome() {
            super("options-level3-entry-point-asset-home", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsLevel3EntryPointSdp;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsLevel3EntryPointSdp extends Experiment<SimpleVariant> {
        public static final OptionsLevel3EntryPointSdp INSTANCE = new OptionsLevel3EntryPointSdp();

        private OptionsLevel3EntryPointSdp() {
            super("options-level3-entry-point-sdp", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsPortfolioRiskAnalyzer;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsPortfolioRiskAnalyzer extends Experiment<SimpleVariant> {
        public static final OptionsPortfolioRiskAnalyzer INSTANCE = new OptionsPortfolioRiskAnalyzer();

        private OptionsPortfolioRiskAnalyzer() {
            super("options-portfolio-risk-analyzer", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$OptionsSbsBidAskSetting;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OptionsSbsBidAskSetting extends Experiment<SimpleVariant> {
        public static final OptionsSbsBidAskSetting INSTANCE = new OptionsSbsBidAskSetting();

        private OptionsSbsBidAskSetting() {
            super("options-side-by-side-chain-bid-ask-setting", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$ReorderOptionsSectionOnSdp;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ReorderOptionsSectionOnSdp extends Experiment<SimpleVariant> {
        public static final ReorderOptionsSectionOnSdp INSTANCE = new ReorderOptionsSectionOnSdp();

        private ReorderOptionsSectionOnSdp() {
            super("android-reorder-options-section-on-sdp", null, 2, null);
        }
    }

    /* compiled from: Experiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionsexperiment/Experiments$SbsChainPerfImprovement;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-options-experiment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SbsChainPerfImprovement extends Experiment<SimpleVariant> {
        public static final SbsChainPerfImprovement INSTANCE = new SbsChainPerfImprovement();

        private SbsChainPerfImprovement() {
            super("android-sbs-chain-perf-improvement", null, 2, null);
        }
    }
}
