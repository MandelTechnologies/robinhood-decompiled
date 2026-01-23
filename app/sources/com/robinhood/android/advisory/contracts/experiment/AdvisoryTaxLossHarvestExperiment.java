package com.robinhood.android.advisory.contracts.experiment;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: AdvisoryTaxLossHarvestExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/experiment/AdvisoryTaxLossHarvestExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryTaxLossHarvestExperiment extends Experiment<SimpleVariant> {
    public static final AdvisoryTaxLossHarvestExperiment INSTANCE = new AdvisoryTaxLossHarvestExperiment();

    private AdvisoryTaxLossHarvestExperiment() {
        super("advisory-tax-loss-harvest", null, 2, null);
    }
}
