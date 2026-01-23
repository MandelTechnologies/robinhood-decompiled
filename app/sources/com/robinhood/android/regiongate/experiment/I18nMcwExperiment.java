package com.robinhood.android.regiongate.experiment;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: I18nMcwExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/regiongate/experiment/I18nMcwExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-region-gate_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class I18nMcwExperiment extends Experiment<SimpleVariant> {
    public static final I18nMcwExperiment INSTANCE = new I18nMcwExperiment();

    /* JADX WARN: Multi-variable type inference failed */
    private I18nMcwExperiment() {
        super("i18n-multi-currency-wallet", null, 2, 0 == true ? 1 : 0);
    }
}
