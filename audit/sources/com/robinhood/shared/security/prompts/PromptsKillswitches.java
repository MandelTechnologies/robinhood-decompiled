package com.robinhood.shared.security.prompts;

import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import kotlin.Metadata;

/* compiled from: PromptsKillswitches.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/security/prompts/PromptsKillswitch;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-prompts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.prompts.PromptsKillswitch, reason: use source file name */
/* loaded from: classes21.dex */
public final class PromptsKillswitches extends Experiment<SimpleVariant> {
    public static final PromptsKillswitches INSTANCE = new PromptsKillswitches();

    private PromptsKillswitches() {
        super("account-security-device-approval-killswitch", null, 2, null);
    }
}
