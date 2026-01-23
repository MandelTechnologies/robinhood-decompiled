package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: HideProgressBarExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/HideProgressBarExperiment;", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class HideProgressBarExperiment extends DeviceIdExperiment<SimpleVariant> {
    public static final HideProgressBarExperiment INSTANCE = new HideProgressBarExperiment();
    public static final int $stable = 8;

    private HideProgressBarExperiment() {
        super("android-user-creation-hide-progress-bar", null, 2, null);
    }
}
