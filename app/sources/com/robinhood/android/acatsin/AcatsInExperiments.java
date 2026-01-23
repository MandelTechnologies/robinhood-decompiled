package com.robinhood.android.acatsin;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: AcatsInExperiments.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInSbExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.AcatsInSbExperiment, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInExperiments extends Experiment<SimpleVariant> {
    public static final AcatsInExperiments INSTANCE = new AcatsInExperiments();
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    private AcatsInExperiments() {
        super("acats-redesign-skip-name-for-plaid", null, 2, 0 == true ? 1 : 0);
    }
}
