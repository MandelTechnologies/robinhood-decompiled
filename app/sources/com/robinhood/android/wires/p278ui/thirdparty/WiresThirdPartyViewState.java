package com.robinhood.android.wires.p278ui.thirdparty;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramSource;

/* compiled from: WiresThirdPartyViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyViewState;", "", "source", "Lmicrogram/android/MicrogramSource;", "mode", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;", "continueEnabled", "", "acknowledgementChecked", "showLoading", "<init>", "(Lmicrogram/android/MicrogramSource;Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;ZZZ)V", "getSource", "()Lmicrogram/android/MicrogramSource;", "getMode", "()Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;", "getContinueEnabled", "()Z", "getAcknowledgementChecked", "getShowLoading", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WiresThirdPartyViewState {
    public static final int $stable = 8;
    private final boolean acknowledgementChecked;
    private final boolean continueEnabled;
    private final WiresThirdPartyPageMode mode;
    private final boolean showLoading;
    private final MicrogramSource source;

    public static /* synthetic */ WiresThirdPartyViewState copy$default(WiresThirdPartyViewState wiresThirdPartyViewState, MicrogramSource microgramSource, WiresThirdPartyPageMode wiresThirdPartyPageMode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramSource = wiresThirdPartyViewState.source;
        }
        if ((i & 2) != 0) {
            wiresThirdPartyPageMode = wiresThirdPartyViewState.mode;
        }
        if ((i & 4) != 0) {
            z = wiresThirdPartyViewState.continueEnabled;
        }
        if ((i & 8) != 0) {
            z2 = wiresThirdPartyViewState.acknowledgementChecked;
        }
        if ((i & 16) != 0) {
            z3 = wiresThirdPartyViewState.showLoading;
        }
        boolean z4 = z3;
        boolean z5 = z;
        return wiresThirdPartyViewState.copy(microgramSource, wiresThirdPartyPageMode, z5, z2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final MicrogramSource getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final WiresThirdPartyPageMode getMode() {
        return this.mode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getContinueEnabled() {
        return this.continueEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAcknowledgementChecked() {
        return this.acknowledgementChecked;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final WiresThirdPartyViewState copy(MicrogramSource source, WiresThirdPartyPageMode mode, boolean continueEnabled, boolean acknowledgementChecked, boolean showLoading) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new WiresThirdPartyViewState(source, mode, continueEnabled, acknowledgementChecked, showLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiresThirdPartyViewState)) {
            return false;
        }
        WiresThirdPartyViewState wiresThirdPartyViewState = (WiresThirdPartyViewState) other;
        return Intrinsics.areEqual(this.source, wiresThirdPartyViewState.source) && this.mode == wiresThirdPartyViewState.mode && this.continueEnabled == wiresThirdPartyViewState.continueEnabled && this.acknowledgementChecked == wiresThirdPartyViewState.acknowledgementChecked && this.showLoading == wiresThirdPartyViewState.showLoading;
    }

    public int hashCode() {
        MicrogramSource microgramSource = this.source;
        return ((((((((microgramSource == null ? 0 : microgramSource.hashCode()) * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.continueEnabled)) * 31) + Boolean.hashCode(this.acknowledgementChecked)) * 31) + Boolean.hashCode(this.showLoading);
    }

    public String toString() {
        return "WiresThirdPartyViewState(source=" + this.source + ", mode=" + this.mode + ", continueEnabled=" + this.continueEnabled + ", acknowledgementChecked=" + this.acknowledgementChecked + ", showLoading=" + this.showLoading + ")";
    }

    public WiresThirdPartyViewState(MicrogramSource microgramSource, WiresThirdPartyPageMode mode, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.source = microgramSource;
        this.mode = mode;
        this.continueEnabled = z;
        this.acknowledgementChecked = z2;
        this.showLoading = z3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WiresThirdPartyViewState(microgram.android.MicrogramSource r2, com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyPageMode r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto Lb
            r4 = r0
        Lb:
            r8 = r7 & 8
            if (r8 == 0) goto L10
            r5 = r0
        L10:
            r7 = r7 & 16
            if (r7 == 0) goto L1b
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L21
        L1b:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L21:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyViewState.<init>(microgram.android.MicrogramSource, com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyPageMode, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final MicrogramSource getSource() {
        return this.source;
    }

    public final WiresThirdPartyPageMode getMode() {
        return this.mode;
    }

    public final boolean getContinueEnabled() {
        return this.continueEnabled;
    }

    public final boolean getAcknowledgementChecked() {
        return this.acknowledgementChecked;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }
}
