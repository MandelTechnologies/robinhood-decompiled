package com.robinhood.android.lib.stepupverification;

import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: SuvExperiments.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/lib/stepupverification/SuvMigrationExperiment;", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.stepupverification.SuvMigrationExperiment, reason: use source file name */
/* loaded from: classes8.dex */
public final class SuvExperiments2 extends DeviceIdExperiment<SimpleVariant> {
    public static final SuvExperiments2 INSTANCE = new SuvExperiments2();
    public static final int $stable = 8;

    private SuvExperiments2() {
        super("acc-sec-fe-suv-sassy-killswitch", null, 2, null);
    }
}
