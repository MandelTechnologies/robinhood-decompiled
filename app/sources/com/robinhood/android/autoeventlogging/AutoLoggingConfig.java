package com.robinhood.android.autoeventlogging;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AutoLoggingConfig.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "", "excludeFromAutomaticAppearLogging", "", "logAppearOnce", "<init>", "(ZZ)V", "getExcludeFromAutomaticAppearLogging", "()Z", "getLogAppearOnce", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoLoggingConfig {
    private final boolean excludeFromAutomaticAppearLogging;
    private final boolean logAppearOnce;

    /* JADX WARN: Illegal instructions before constructor call */
    public AutoLoggingConfig() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ AutoLoggingConfig copy$default(AutoLoggingConfig autoLoggingConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = autoLoggingConfig.excludeFromAutomaticAppearLogging;
        }
        if ((i & 2) != 0) {
            z2 = autoLoggingConfig.logAppearOnce;
        }
        return autoLoggingConfig.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExcludeFromAutomaticAppearLogging() {
        return this.excludeFromAutomaticAppearLogging;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLogAppearOnce() {
        return this.logAppearOnce;
    }

    public final AutoLoggingConfig copy(boolean excludeFromAutomaticAppearLogging, boolean logAppearOnce) {
        return new AutoLoggingConfig(excludeFromAutomaticAppearLogging, logAppearOnce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoLoggingConfig)) {
            return false;
        }
        AutoLoggingConfig autoLoggingConfig = (AutoLoggingConfig) other;
        return this.excludeFromAutomaticAppearLogging == autoLoggingConfig.excludeFromAutomaticAppearLogging && this.logAppearOnce == autoLoggingConfig.logAppearOnce;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.excludeFromAutomaticAppearLogging) * 31) + Boolean.hashCode(this.logAppearOnce);
    }

    public String toString() {
        return "AutoLoggingConfig(excludeFromAutomaticAppearLogging=" + this.excludeFromAutomaticAppearLogging + ", logAppearOnce=" + this.logAppearOnce + ")";
    }

    public AutoLoggingConfig(boolean z, boolean z2) {
        this.excludeFromAutomaticAppearLogging = z;
        this.logAppearOnce = z2;
    }

    public /* synthetic */ AutoLoggingConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public final boolean getExcludeFromAutomaticAppearLogging() {
        return this.excludeFromAutomaticAppearLogging;
    }

    public final boolean getLogAppearOnce() {
        return this.logAppearOnce;
    }
}
