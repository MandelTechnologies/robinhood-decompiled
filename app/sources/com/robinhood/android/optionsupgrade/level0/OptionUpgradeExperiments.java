package com.robinhood.android.optionsupgrade.level0;

import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.experiments.Experiment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: OptionUpgradeExperiments.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"OPTION_UPGRADE_EXPERIMENTS", "", "Lcom/robinhood/experiments/Experiment;", "getOPTION_UPGRADE_EXPERIMENTS", "()Ljava/util/List;", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.level0.OptionUpgradeExperimentsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionUpgradeExperiments {
    private static final List<Experiment<?>> OPTION_UPGRADE_EXPERIMENTS = CollectionsKt.listOf((Object[]) new Experiment[]{Experiments.OptionsOnboardingL0SplashRedesignExperiment.INSTANCE, Experiments.OptionsOnboardingL2SplashRedesignV2Experiment.INSTANCE, Experiments.OptionsSkipAnsweredSpreadsExperiment.INSTANCE, Experiments.OptionsSkipAnsweredYoeExperiment.INSTANCE, Experiments.OptionsImproveInvestmentProfileExperiment.INSTANCE, Experiments.OptionsSkipSpreadsEduExperiment.INSTANCE, Experiments.OptionsKnowledgeCheckM1Experiment.INSTANCE, Experiments.OptionsKnowledgeCheckM2Experiment.INSTANCE, Experiments.OptionsInfoGatheringExperiment.INSTANCE});

    public static final List<Experiment<?>> getOPTION_UPGRADE_EXPERIMENTS() {
        return OPTION_UPGRADE_EXPERIMENTS;
    }
}
