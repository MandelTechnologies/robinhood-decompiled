package com.robinhood.prefs;

import kotlin.Metadata;
import p479j$.time.Duration;

/* compiled from: ResumeApplicationOverridePreference.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/prefs/ResumeApplicationOverridePreference;", "", "", "getDurationOverrideMillis", "()Ljava/lang/Long;", "overrideDurationMillis", "", "setDurationOverride", "(Ljava/lang/Long;)V", "j$/time/Duration", "getDurationOverride", "()Lj$/time/Duration;", "Companion", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface ResumeApplicationOverridePreference {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long NO_OVERRIDE_MILLIS = -1;

    Duration getDurationOverride();

    Long getDurationOverrideMillis();

    void setDurationOverride(Long overrideDurationMillis);

    /* compiled from: ResumeApplicationOverridePreference.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Duration getDurationOverride(ResumeApplicationOverridePreference resumeApplicationOverridePreference) {
            Long durationOverrideMillis = resumeApplicationOverridePreference.getDurationOverrideMillis();
            if (durationOverrideMillis != null && durationOverrideMillis.longValue() > 0) {
                return Duration.ofMillis(durationOverrideMillis.longValue());
            }
            return null;
        }
    }

    /* compiled from: ResumeApplicationOverridePreference.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prefs/ResumeApplicationOverridePreference$Companion;", "", "<init>", "()V", "NO_OVERRIDE_MILLIS", "", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long NO_OVERRIDE_MILLIS = -1;

        private Companion() {
        }
    }
}
