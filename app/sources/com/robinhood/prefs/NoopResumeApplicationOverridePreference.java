package com.robinhood.prefs;

import com.robinhood.prefs.ResumeApplicationOverridePreference;
import kotlin.Metadata;
import p479j$.time.Duration;

/* compiled from: NoopResumeApplicationOverridePreference.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/prefs/NoopResumeApplicationOverridePreference;", "Lcom/robinhood/prefs/ResumeApplicationOverridePreference;", "<init>", "()V", "getDurationOverrideMillis", "", "()Ljava/lang/Long;", "setDurationOverride", "", "overrideDurationMillis", "(Ljava/lang/Long;)V", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class NoopResumeApplicationOverridePreference implements ResumeApplicationOverridePreference {
    @Override // com.robinhood.prefs.ResumeApplicationOverridePreference
    public Long getDurationOverrideMillis() {
        return null;
    }

    @Override // com.robinhood.prefs.ResumeApplicationOverridePreference
    public void setDurationOverride(Long overrideDurationMillis) {
    }

    @Override // com.robinhood.prefs.ResumeApplicationOverridePreference
    public Duration getDurationOverride() {
        return ResumeApplicationOverridePreference.DefaultImpls.getDurationOverride(this);
    }
}
