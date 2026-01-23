package com.robinhood.android.wires.p278ui.thirdparty;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MicrogramSource;

/* compiled from: WiresThirdPartyDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyDataState;", "", "source", "Lmicrogram/android/MicrogramSource;", "mode", "Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;", "continueEnabled", "", "acknowledgementChecked", "showedScamPrevention", "makingRequest", "continueScamButtonClicked", "<init>", "(Lmicrogram/android/MicrogramSource;Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;ZZZZZ)V", "getSource", "()Lmicrogram/android/MicrogramSource;", "getMode", "()Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;", "getContinueEnabled", "()Z", "getAcknowledgementChecked", "getShowedScamPrevention", "getMakingRequest", "getContinueScamButtonClicked", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WiresThirdPartyDataState {
    public static final int $stable = 8;
    private final boolean acknowledgementChecked;
    private final boolean continueEnabled;
    private final boolean continueScamButtonClicked;
    private final boolean makingRequest;
    private final WiresThirdPartyPageMode mode;
    private final boolean showedScamPrevention;
    private final MicrogramSource source;

    public static /* synthetic */ WiresThirdPartyDataState copy$default(WiresThirdPartyDataState wiresThirdPartyDataState, MicrogramSource microgramSource, WiresThirdPartyPageMode wiresThirdPartyPageMode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            microgramSource = wiresThirdPartyDataState.source;
        }
        if ((i & 2) != 0) {
            wiresThirdPartyPageMode = wiresThirdPartyDataState.mode;
        }
        if ((i & 4) != 0) {
            z = wiresThirdPartyDataState.continueEnabled;
        }
        if ((i & 8) != 0) {
            z2 = wiresThirdPartyDataState.acknowledgementChecked;
        }
        if ((i & 16) != 0) {
            z3 = wiresThirdPartyDataState.showedScamPrevention;
        }
        if ((i & 32) != 0) {
            z4 = wiresThirdPartyDataState.makingRequest;
        }
        if ((i & 64) != 0) {
            z5 = wiresThirdPartyDataState.continueScamButtonClicked;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        boolean z9 = z;
        return wiresThirdPartyDataState.copy(microgramSource, wiresThirdPartyPageMode, z9, z2, z8, z6, z7);
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
    public final boolean getShowedScamPrevention() {
        return this.showedScamPrevention;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getMakingRequest() {
        return this.makingRequest;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getContinueScamButtonClicked() {
        return this.continueScamButtonClicked;
    }

    public final WiresThirdPartyDataState copy(MicrogramSource source, WiresThirdPartyPageMode mode, boolean continueEnabled, boolean acknowledgementChecked, boolean showedScamPrevention, boolean makingRequest, boolean continueScamButtonClicked) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new WiresThirdPartyDataState(source, mode, continueEnabled, acknowledgementChecked, showedScamPrevention, makingRequest, continueScamButtonClicked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiresThirdPartyDataState)) {
            return false;
        }
        WiresThirdPartyDataState wiresThirdPartyDataState = (WiresThirdPartyDataState) other;
        return Intrinsics.areEqual(this.source, wiresThirdPartyDataState.source) && this.mode == wiresThirdPartyDataState.mode && this.continueEnabled == wiresThirdPartyDataState.continueEnabled && this.acknowledgementChecked == wiresThirdPartyDataState.acknowledgementChecked && this.showedScamPrevention == wiresThirdPartyDataState.showedScamPrevention && this.makingRequest == wiresThirdPartyDataState.makingRequest && this.continueScamButtonClicked == wiresThirdPartyDataState.continueScamButtonClicked;
    }

    public int hashCode() {
        MicrogramSource microgramSource = this.source;
        return ((((((((((((microgramSource == null ? 0 : microgramSource.hashCode()) * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.continueEnabled)) * 31) + Boolean.hashCode(this.acknowledgementChecked)) * 31) + Boolean.hashCode(this.showedScamPrevention)) * 31) + Boolean.hashCode(this.makingRequest)) * 31) + Boolean.hashCode(this.continueScamButtonClicked);
    }

    public String toString() {
        return "WiresThirdPartyDataState(source=" + this.source + ", mode=" + this.mode + ", continueEnabled=" + this.continueEnabled + ", acknowledgementChecked=" + this.acknowledgementChecked + ", showedScamPrevention=" + this.showedScamPrevention + ", makingRequest=" + this.makingRequest + ", continueScamButtonClicked=" + this.continueScamButtonClicked + ")";
    }

    public WiresThirdPartyDataState(MicrogramSource microgramSource, WiresThirdPartyPageMode mode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.source = microgramSource;
        this.mode = mode;
        this.continueEnabled = z;
        this.acknowledgementChecked = z2;
        this.showedScamPrevention = z3;
        this.makingRequest = z4;
        this.continueScamButtonClicked = z5;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WiresThirdPartyDataState(microgram.android.MicrogramSource r2, com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyPageMode r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto Lb
            r4 = r0
        Lb:
            r10 = r9 & 8
            if (r10 == 0) goto L10
            r5 = r0
        L10:
            r10 = r9 & 16
            if (r10 == 0) goto L15
            r6 = r0
        L15:
            r10 = r9 & 32
            if (r10 == 0) goto L1a
            r7 = r0
        L1a:
            r9 = r9 & 64
            if (r9 == 0) goto L27
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2f
        L27:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2f:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.wires.p278ui.thirdparty.WiresThirdPartyDataState.<init>(microgram.android.MicrogramSource, com.robinhood.android.wires.ui.thirdparty.WiresThirdPartyPageMode, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public final boolean getShowedScamPrevention() {
        return this.showedScamPrevention;
    }

    public final boolean getMakingRequest() {
        return this.makingRequest;
    }

    public final boolean getContinueScamButtonClicked() {
        return this.continueScamButtonClicked;
    }
}
