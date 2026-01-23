package com.robinhood.android.investmentstracker.security;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityFilter.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/security/SecurityFilter;", "", "hideAll", "", "<init>", "(Z)V", "getHideAll", "()Z", "setHideAll", "getValueOrStars", "", "value", "component1", "copy", "equals", "other", "hashCode", "", "toString", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SecurityFilter {
    public static final int $stable = 8;
    private boolean hideAll;

    public static /* synthetic */ SecurityFilter copy$default(SecurityFilter securityFilter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = securityFilter.hideAll;
        }
        return securityFilter.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHideAll() {
        return this.hideAll;
    }

    public final SecurityFilter copy(boolean hideAll) {
        return new SecurityFilter(hideAll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SecurityFilter) && this.hideAll == ((SecurityFilter) other).hideAll;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hideAll);
    }

    public String toString() {
        return "SecurityFilter(hideAll=" + this.hideAll + ")";
    }

    public SecurityFilter(boolean z) {
        this.hideAll = z;
    }

    public final boolean getHideAll() {
        return this.hideAll;
    }

    public final void setHideAll(boolean z) {
        this.hideAll = z;
    }

    public final String getValueOrStars(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.hideAll ? "****" : value;
    }
}
