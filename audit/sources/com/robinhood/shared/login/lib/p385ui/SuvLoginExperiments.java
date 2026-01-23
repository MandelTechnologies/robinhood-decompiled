package com.robinhood.shared.login.lib.p385ui;

import com.robinhood.experiments.DeviceIdExperiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: SuvLoginExperiments.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/SuvLoginKillswitchExperiment;", "Lcom/robinhood/experiments/DeviceIdExperiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.login.lib.ui.SuvLoginKillswitchExperiment, reason: use source file name */
/* loaded from: classes21.dex */
public final class SuvLoginExperiments extends DeviceIdExperiment<SimpleVariant> {
    public static final SuvLoginExperiments INSTANCE = new SuvLoginExperiments();
    public static final int $stable = 8;

    private SuvLoginExperiments() {
        super("account-security-suv-login-android-killswitch", null, 2, null);
    }
}
