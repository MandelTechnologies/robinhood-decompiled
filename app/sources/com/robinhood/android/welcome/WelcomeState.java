package com.robinhood.android.welcome;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WelcomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/welcome/WelcomeState;", "", "forceDarkTheme", "", "subtitleOverrideRes", "", "<init>", "(ZLjava/lang/Integer;)V", "getForceDarkTheme", "()Z", "getSubtitleOverrideRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lcom/robinhood/android/welcome/WelcomeState;", "equals", "other", "hashCode", "toString", "", "feature-welcome_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class WelcomeState {
    private final boolean forceDarkTheme;
    private final Integer subtitleOverrideRes;

    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ WelcomeState copy$default(WelcomeState welcomeState, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = welcomeState.forceDarkTheme;
        }
        if ((i & 2) != 0) {
            num = welcomeState.subtitleOverrideRes;
        }
        return welcomeState.copy(z, num);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSubtitleOverrideRes() {
        return this.subtitleOverrideRes;
    }

    public final WelcomeState copy(boolean forceDarkTheme, Integer subtitleOverrideRes) {
        return new WelcomeState(forceDarkTheme, subtitleOverrideRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeState)) {
            return false;
        }
        WelcomeState welcomeState = (WelcomeState) other;
        return this.forceDarkTheme == welcomeState.forceDarkTheme && Intrinsics.areEqual(this.subtitleOverrideRes, welcomeState.subtitleOverrideRes);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.forceDarkTheme) * 31;
        Integer num = this.subtitleOverrideRes;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "WelcomeState(forceDarkTheme=" + this.forceDarkTheme + ", subtitleOverrideRes=" + this.subtitleOverrideRes + ")";
    }

    public WelcomeState(boolean z, Integer num) {
        this.forceDarkTheme = z;
        this.subtitleOverrideRes = num;
    }

    public /* synthetic */ WelcomeState(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num);
    }

    public final boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }

    public final Integer getSubtitleOverrideRes() {
        return this.subtitleOverrideRes;
    }
}
