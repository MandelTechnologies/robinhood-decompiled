package com.robinhood.android.securitycenter.p251ui.mfa;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: MfaSettingsKillSwitchExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/mfa/MfaSettingsKillSwitchExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MfaSettingsKillSwitchExperiment extends Experiment<SimpleVariant> {
    public static final MfaSettingsKillSwitchExperiment INSTANCE = new MfaSettingsKillSwitchExperiment();
    public static final int $stable = 8;

    private MfaSettingsKillSwitchExperiment() {
        super("acc-sec-fe-mfa-settings-removal", null, 2, null);
    }
}
