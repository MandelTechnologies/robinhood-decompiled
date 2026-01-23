package com.robinhood.librobinhood.data.store;

import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: OnboardingGbExperiments.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OnboardingGbSignupKillswitch;", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-store-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OnboardingGbSignupKillswitch, reason: use source file name */
/* loaded from: classes20.dex */
public final class OnboardingGbExperiments extends DeviceIdExperiment<SimpleVariant> {
    public static final OnboardingGbExperiments INSTANCE = new OnboardingGbExperiments();

    private OnboardingGbExperiments() {
        super("acq-onboarding-gb-signups-killswitch", null, 2, null);
    }
}
