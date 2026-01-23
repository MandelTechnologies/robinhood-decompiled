package com.robinhood.android.securitycenter.p251ui;

import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.Mfa;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityCenterDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J{\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u001bHÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0013\u0010\u0004\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0013\u0010\u0005\u001a\u00020\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b \u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterDataState;", "", "isLoading", "", "isBiometricsAuthEnabled", "isPinEnabled", "mfa", "Lcom/robinhood/models/api/Mfa;", "showMfaRow", "isMatchaEnabled", "showPasskeyRow", "securitySubtitle", "", "showPasskeyExistsDialog", "showPasskeyErrorDialog", "showPasskeySuccessBottomSheet", "<init>", "(ZZZLcom/robinhood/models/api/Mfa;ZZZLjava/lang/String;ZZZ)V", "()Z", "getShowMfaRow", "getShowPasskeyRow", "getSecuritySubtitle", "()Ljava/lang/String;", "getShowPasskeyExistsDialog", "getShowPasskeyErrorDialog", "getShowPasskeySuccessBottomSheet", "mfaRowSummaryRes", "", "getMfaRowSummaryRes", "()Ljava/lang/Integer;", "isMfaEnabled", "deviceSecurityResId", "getDeviceSecurityResId", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SecurityCenterDataState {
    public static final int $stable = 8;
    private final Integer deviceSecurityResId;
    private final boolean isBiometricsAuthEnabled;
    private final boolean isLoading;
    private final boolean isMatchaEnabled;
    private final boolean isPinEnabled;
    private final Mfa mfa;
    private final String securitySubtitle;
    private final boolean showMfaRow;
    private final boolean showPasskeyErrorDialog;
    private final boolean showPasskeyExistsDialog;
    private final boolean showPasskeyRow;
    private final boolean showPasskeySuccessBottomSheet;

    /* compiled from: SecurityCenterDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.PROMPTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SecurityCenterDataState() {
        this(false, false, false, null, false, false, false, null, false, false, false, 2047, null);
    }

    /* renamed from: component4, reason: from getter */
    private final Mfa getMfa() {
        return this.mfa;
    }

    public static /* synthetic */ SecurityCenterDataState copy$default(SecurityCenterDataState securityCenterDataState, boolean z, boolean z2, boolean z3, Mfa mfa, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, boolean z9, int i, Object obj) {
        if ((i & 1) != 0) {
            z = securityCenterDataState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = securityCenterDataState.isBiometricsAuthEnabled;
        }
        if ((i & 4) != 0) {
            z3 = securityCenterDataState.isPinEnabled;
        }
        if ((i & 8) != 0) {
            mfa = securityCenterDataState.mfa;
        }
        if ((i & 16) != 0) {
            z4 = securityCenterDataState.showMfaRow;
        }
        if ((i & 32) != 0) {
            z5 = securityCenterDataState.isMatchaEnabled;
        }
        if ((i & 64) != 0) {
            z6 = securityCenterDataState.showPasskeyRow;
        }
        if ((i & 128) != 0) {
            str = securityCenterDataState.securitySubtitle;
        }
        if ((i & 256) != 0) {
            z7 = securityCenterDataState.showPasskeyExistsDialog;
        }
        if ((i & 512) != 0) {
            z8 = securityCenterDataState.showPasskeyErrorDialog;
        }
        if ((i & 1024) != 0) {
            z9 = securityCenterDataState.showPasskeySuccessBottomSheet;
        }
        boolean z10 = z8;
        boolean z11 = z9;
        String str2 = str;
        boolean z12 = z7;
        boolean z13 = z5;
        boolean z14 = z6;
        boolean z15 = z4;
        boolean z16 = z3;
        return securityCenterDataState.copy(z, z2, z16, mfa, z15, z13, z14, str2, z12, z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowPasskeyErrorDialog() {
        return this.showPasskeyErrorDialog;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowPasskeySuccessBottomSheet() {
        return this.showPasskeySuccessBottomSheet;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBiometricsAuthEnabled() {
        return this.isBiometricsAuthEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPinEnabled() {
        return this.isPinEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowMfaRow() {
        return this.showMfaRow;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsMatchaEnabled() {
        return this.isMatchaEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowPasskeyRow() {
        return this.showPasskeyRow;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSecuritySubtitle() {
        return this.securitySubtitle;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowPasskeyExistsDialog() {
        return this.showPasskeyExistsDialog;
    }

    public final SecurityCenterDataState copy(boolean isLoading, boolean isBiometricsAuthEnabled, boolean isPinEnabled, Mfa mfa, boolean showMfaRow, boolean isMatchaEnabled, boolean showPasskeyRow, String securitySubtitle, boolean showPasskeyExistsDialog, boolean showPasskeyErrorDialog, boolean showPasskeySuccessBottomSheet) {
        return new SecurityCenterDataState(isLoading, isBiometricsAuthEnabled, isPinEnabled, mfa, showMfaRow, isMatchaEnabled, showPasskeyRow, securitySubtitle, showPasskeyExistsDialog, showPasskeyErrorDialog, showPasskeySuccessBottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityCenterDataState)) {
            return false;
        }
        SecurityCenterDataState securityCenterDataState = (SecurityCenterDataState) other;
        return this.isLoading == securityCenterDataState.isLoading && this.isBiometricsAuthEnabled == securityCenterDataState.isBiometricsAuthEnabled && this.isPinEnabled == securityCenterDataState.isPinEnabled && Intrinsics.areEqual(this.mfa, securityCenterDataState.mfa) && this.showMfaRow == securityCenterDataState.showMfaRow && this.isMatchaEnabled == securityCenterDataState.isMatchaEnabled && this.showPasskeyRow == securityCenterDataState.showPasskeyRow && Intrinsics.areEqual(this.securitySubtitle, securityCenterDataState.securitySubtitle) && this.showPasskeyExistsDialog == securityCenterDataState.showPasskeyExistsDialog && this.showPasskeyErrorDialog == securityCenterDataState.showPasskeyErrorDialog && this.showPasskeySuccessBottomSheet == securityCenterDataState.showPasskeySuccessBottomSheet;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isBiometricsAuthEnabled)) * 31) + Boolean.hashCode(this.isPinEnabled)) * 31;
        Mfa mfa = this.mfa;
        int iHashCode2 = (((((((iHashCode + (mfa == null ? 0 : mfa.hashCode())) * 31) + Boolean.hashCode(this.showMfaRow)) * 31) + Boolean.hashCode(this.isMatchaEnabled)) * 31) + Boolean.hashCode(this.showPasskeyRow)) * 31;
        String str = this.securitySubtitle;
        return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.showPasskeyExistsDialog)) * 31) + Boolean.hashCode(this.showPasskeyErrorDialog)) * 31) + Boolean.hashCode(this.showPasskeySuccessBottomSheet);
    }

    public String toString() {
        return "SecurityCenterDataState(isLoading=" + this.isLoading + ", isBiometricsAuthEnabled=" + this.isBiometricsAuthEnabled + ", isPinEnabled=" + this.isPinEnabled + ", mfa=" + this.mfa + ", showMfaRow=" + this.showMfaRow + ", isMatchaEnabled=" + this.isMatchaEnabled + ", showPasskeyRow=" + this.showPasskeyRow + ", securitySubtitle=" + this.securitySubtitle + ", showPasskeyExistsDialog=" + this.showPasskeyExistsDialog + ", showPasskeyErrorDialog=" + this.showPasskeyErrorDialog + ", showPasskeySuccessBottomSheet=" + this.showPasskeySuccessBottomSheet + ")";
    }

    public SecurityCenterDataState(boolean z, boolean z2, boolean z3, Mfa mfa, boolean z4, boolean z5, boolean z6, String str, boolean z7, boolean z8, boolean z9) {
        Integer numValueOf;
        int i;
        this.isLoading = z;
        this.isBiometricsAuthEnabled = z2;
        this.isPinEnabled = z3;
        this.mfa = mfa;
        this.showMfaRow = z4;
        this.isMatchaEnabled = z5;
        this.showPasskeyRow = z6;
        this.securitySubtitle = str;
        this.showPasskeyExistsDialog = z7;
        this.showPasskeyErrorDialog = z8;
        this.showPasskeySuccessBottomSheet = z9;
        if (z2) {
            if (z3) {
                i = C28186R.string.security_center_device_security_biometric_pin;
            } else {
                i = C28186R.string.security_center_device_security_biometric;
            }
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = z3 ? Integer.valueOf(C28186R.string.security_center_device_security_pin) : null;
        }
        this.deviceSecurityResId = numValueOf;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SecurityCenterDataState(boolean r3, boolean r4, boolean r5, com.robinhood.models.api.Mfa r6, boolean r7, boolean r8, boolean r9, java.lang.String r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r2 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L5
            r3 = 1
        L5:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto Lb
            r4 = r0
        Lb:
            r15 = r14 & 4
            if (r15 == 0) goto L10
            r5 = r0
        L10:
            r15 = r14 & 8
            r1 = 0
            if (r15 == 0) goto L16
            r6 = r1
        L16:
            r15 = r14 & 16
            if (r15 == 0) goto L1b
            r7 = r0
        L1b:
            r15 = r14 & 32
            if (r15 == 0) goto L20
            r8 = r0
        L20:
            r15 = r14 & 64
            if (r15 == 0) goto L25
            r9 = r0
        L25:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L2a
            r10 = r1
        L2a:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L2f
            r11 = r0
        L2f:
            r15 = r14 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L34
            r12 = r0
        L34:
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L45
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L51
        L45:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L51:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.securitycenter.p251ui.SecurityCenterDataState.<init>(boolean, boolean, boolean, com.robinhood.models.api.Mfa, boolean, boolean, boolean, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isBiometricsAuthEnabled() {
        return this.isBiometricsAuthEnabled;
    }

    public final boolean isPinEnabled() {
        return this.isPinEnabled;
    }

    public final boolean getShowMfaRow() {
        return this.showMfaRow;
    }

    public final boolean isMatchaEnabled() {
        return this.isMatchaEnabled;
    }

    public final boolean getShowPasskeyRow() {
        return this.showPasskeyRow;
    }

    public final String getSecuritySubtitle() {
        return this.securitySubtitle;
    }

    public final boolean getShowPasskeyExistsDialog() {
        return this.showPasskeyExistsDialog;
    }

    public final boolean getShowPasskeyErrorDialog() {
        return this.showPasskeyErrorDialog;
    }

    public final boolean getShowPasskeySuccessBottomSheet() {
        return this.showPasskeySuccessBottomSheet;
    }

    public final Integer getMfaRowSummaryRes() {
        int i;
        Mfa mfa = this.mfa;
        if (mfa == null || !mfa.getEnabled()) {
            return null;
        }
        Challenge.Type challengeType = this.mfa.getChallengeType();
        int i2 = challengeType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[challengeType.ordinal()];
        if (i2 == 1) {
            i = C28186R.string.security_center_mfa_enabled_sms;
        } else if (i2 == 2) {
            i = C28186R.string.security_center_mfa_enabled_app;
        } else if (i2 == 3) {
            i = C28186R.string.security_center_mfa_enabled_prompts;
        } else {
            Preconditions.INSTANCE.failUnknownEnumKotlin(this.mfa.getChallengeType());
            throw new ExceptionsH();
        }
        return Integer.valueOf(i);
    }

    public final boolean isMfaEnabled() {
        Mfa mfa = this.mfa;
        return mfa != null && mfa.getEnabled();
    }

    public final Integer getDeviceSecurityResId() {
        return this.deviceSecurityResId;
    }
}
