package com.robinhood.shared.lib.challenge.deviceapproval;

import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceApprovalChallengeDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010#\u001a\u00020\u0005HÂ\u0003J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÂ\u0003J\t\u0010&\u001a\u00020\u0005HÂ\u0003JS\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState;", "", "challengeStatus", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState$ChallengeStatus;", "isLoading", "", "fallbackCtaText", "", "isAuthenticated", "isRhc", "challengeDeviceLabel", "challengeHasFallback", "<init>", "(Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState$ChallengeStatus;ZLjava/lang/String;ZZLjava/lang/String;Z)V", "getChallengeStatus", "()Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState$ChallengeStatus;", "()Z", "showLoadingLottie", "getShowLoadingLottie", "challengeCompleted", "getChallengeCompleted", "headerRes", "Lcom/robinhood/utils/resource/StringResource;", "getHeaderRes", "()Lcom/robinhood/utils/resource/StringResource;", "bodyRes", "getBodyRes", "secondaryCtaRes", "getSecondaryCtaRes", "isButtonBarVisible", "helperTextRes", "getHelperTextRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ChallengeStatus", "lib-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DeviceApprovalChallengeDataState {
    public static final int $stable = 0;
    private final String challengeDeviceLabel;
    private final boolean challengeHasFallback;
    private final ChallengeStatus challengeStatus;
    private final String fallbackCtaText;
    private final boolean isAuthenticated;
    private final boolean isLoading;
    private final boolean isRhc;

    /* compiled from: DeviceApprovalChallengeDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChallengeStatus.values().length];
            try {
                iArr[ChallengeStatus.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChallengeStatus.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChallengeStatus.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChallengeStatus.COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChallengeStatus.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getIsRhc() {
        return this.isRhc;
    }

    /* renamed from: component6, reason: from getter */
    private final String getChallengeDeviceLabel() {
        return this.challengeDeviceLabel;
    }

    /* renamed from: component7, reason: from getter */
    private final boolean getChallengeHasFallback() {
        return this.challengeHasFallback;
    }

    public static /* synthetic */ DeviceApprovalChallengeDataState copy$default(DeviceApprovalChallengeDataState deviceApprovalChallengeDataState, ChallengeStatus challengeStatus, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeStatus = deviceApprovalChallengeDataState.challengeStatus;
        }
        if ((i & 2) != 0) {
            z = deviceApprovalChallengeDataState.isLoading;
        }
        if ((i & 4) != 0) {
            str = deviceApprovalChallengeDataState.fallbackCtaText;
        }
        if ((i & 8) != 0) {
            z2 = deviceApprovalChallengeDataState.isAuthenticated;
        }
        if ((i & 16) != 0) {
            z3 = deviceApprovalChallengeDataState.isRhc;
        }
        if ((i & 32) != 0) {
            str2 = deviceApprovalChallengeDataState.challengeDeviceLabel;
        }
        if ((i & 64) != 0) {
            z4 = deviceApprovalChallengeDataState.challengeHasFallback;
        }
        String str3 = str2;
        boolean z5 = z4;
        boolean z6 = z3;
        String str4 = str;
        return deviceApprovalChallengeDataState.copy(challengeStatus, z, str4, z2, z6, str3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final ChallengeStatus getChallengeStatus() {
        return this.challengeStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final DeviceApprovalChallengeDataState copy(ChallengeStatus challengeStatus, boolean isLoading, String fallbackCtaText, boolean isAuthenticated, boolean isRhc, String challengeDeviceLabel, boolean challengeHasFallback) {
        Intrinsics.checkNotNullParameter(challengeStatus, "challengeStatus");
        return new DeviceApprovalChallengeDataState(challengeStatus, isLoading, fallbackCtaText, isAuthenticated, isRhc, challengeDeviceLabel, challengeHasFallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceApprovalChallengeDataState)) {
            return false;
        }
        DeviceApprovalChallengeDataState deviceApprovalChallengeDataState = (DeviceApprovalChallengeDataState) other;
        return this.challengeStatus == deviceApprovalChallengeDataState.challengeStatus && this.isLoading == deviceApprovalChallengeDataState.isLoading && Intrinsics.areEqual(this.fallbackCtaText, deviceApprovalChallengeDataState.fallbackCtaText) && this.isAuthenticated == deviceApprovalChallengeDataState.isAuthenticated && this.isRhc == deviceApprovalChallengeDataState.isRhc && Intrinsics.areEqual(this.challengeDeviceLabel, deviceApprovalChallengeDataState.challengeDeviceLabel) && this.challengeHasFallback == deviceApprovalChallengeDataState.challengeHasFallback;
    }

    public int hashCode() {
        int iHashCode = ((this.challengeStatus.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str = this.fallbackCtaText;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isAuthenticated)) * 31) + Boolean.hashCode(this.isRhc)) * 31;
        String str2 = this.challengeDeviceLabel;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.challengeHasFallback);
    }

    public String toString() {
        return "DeviceApprovalChallengeDataState(challengeStatus=" + this.challengeStatus + ", isLoading=" + this.isLoading + ", fallbackCtaText=" + this.fallbackCtaText + ", isAuthenticated=" + this.isAuthenticated + ", isRhc=" + this.isRhc + ", challengeDeviceLabel=" + this.challengeDeviceLabel + ", challengeHasFallback=" + this.challengeHasFallback + ")";
    }

    public DeviceApprovalChallengeDataState(ChallengeStatus challengeStatus, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4) {
        Intrinsics.checkNotNullParameter(challengeStatus, "challengeStatus");
        this.challengeStatus = challengeStatus;
        this.isLoading = z;
        this.fallbackCtaText = str;
        this.isAuthenticated = z2;
        this.isRhc = z3;
        this.challengeDeviceLabel = str2;
        this.challengeHasFallback = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DeviceApprovalChallengeDataState(com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState.ChallengeStatus r2, boolean r3, java.lang.String r4, boolean r5, boolean r6, java.lang.String r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState$ChallengeStatus r2 = com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState.ChallengeStatus.LOADING
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 8
            if (r10 == 0) goto L11
            r5 = r0
        L11:
            r10 = r9 & 32
            if (r10 == 0) goto L16
            r7 = 0
        L16:
            r9 = r9 & 64
            if (r9 == 0) goto L23
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2b
        L23:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState.<init>(com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeDataState$ChallengeStatus, boolean, java.lang.String, boolean, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ChallengeStatus getChallengeStatus() {
        return this.challengeStatus;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceApprovalChallengeDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeDataState$ChallengeStatus;", "", "<init>", "(Ljava/lang/String;I)V", "BLOCKED", "COMPLETE", "ERROR", "LOADING", "TIMEOUT", "lib-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChallengeStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeStatus[] $VALUES;
        public static final ChallengeStatus BLOCKED = new ChallengeStatus("BLOCKED", 0);
        public static final ChallengeStatus COMPLETE = new ChallengeStatus("COMPLETE", 1);
        public static final ChallengeStatus ERROR = new ChallengeStatus("ERROR", 2);
        public static final ChallengeStatus LOADING = new ChallengeStatus("LOADING", 3);
        public static final ChallengeStatus TIMEOUT = new ChallengeStatus("TIMEOUT", 4);

        private static final /* synthetic */ ChallengeStatus[] $values() {
            return new ChallengeStatus[]{BLOCKED, COMPLETE, ERROR, LOADING, TIMEOUT};
        }

        public static EnumEntries<ChallengeStatus> getEntries() {
            return $ENTRIES;
        }

        private ChallengeStatus(String str, int i) {
        }

        static {
            ChallengeStatus[] challengeStatusArr$values = $values();
            $VALUES = challengeStatusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeStatusArr$values);
        }

        public static ChallengeStatus valueOf(String str) {
            return (ChallengeStatus) Enum.valueOf(ChallengeStatus.class, str);
        }

        public static ChallengeStatus[] values() {
            return (ChallengeStatus[]) $VALUES.clone();
        }
    }

    public final boolean getShowLoadingLottie() {
        ChallengeStatus challengeStatus = this.challengeStatus;
        return challengeStatus == ChallengeStatus.LOADING || challengeStatus == ChallengeStatus.COMPLETE;
    }

    public final boolean getChallengeCompleted() {
        return this.challengeStatus == ChallengeStatus.COMPLETE;
    }

    public final StringResource getHeaderRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.challengeStatus.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_waiting_title, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_denied_title, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_timeout_title, new Object[0]);
        }
        if (i == 4) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_untrusted_challenge_complete_title, new Object[0]);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_error_title, new Object[0]);
    }

    public final StringResource getBodyRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.challengeStatus.ordinal()];
        if (i == 1) {
            String str = this.challengeDeviceLabel;
            if (str != null) {
                if (this.isRhc) {
                    return StringResource.INSTANCE.invoke(C39076R.string.gated_crypto_prompts_verification_waiting_body_rhc, str);
                }
                return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_waiting_body, str);
            }
            if (this.isRhc) {
                StringResource.Companion companion = StringResource.INSTANCE;
                return companion.invoke(C39076R.string.gated_crypto_prompts_verification_waiting_body_rhc, companion.invoke(C39076R.string.prompts_verification_your_other_device, new Object[0]));
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            return companion2.invoke(C39076R.string.prompts_verification_waiting_body, companion2.invoke(C39076R.string.prompts_verification_your_other_device, new Object[0]));
        }
        if (i == 2) {
            if (this.isAuthenticated) {
                return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_denied_body, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_denied_login_body, new Object[0]);
        }
        if (i != 3) {
            if (i == 4) {
                return StringResource.INSTANCE.invoke("");
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_error_body, new Object[0]);
        }
        String str2 = this.challengeDeviceLabel;
        if (str2 != null) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_timeout_body, str2);
        }
        StringResource.Companion companion3 = StringResource.INSTANCE;
        return companion3.invoke(C39076R.string.prompts_verification_timeout_body, companion3.invoke(C39076R.string.prompts_verification_your_other_device, new Object[0]));
    }

    public final StringResource getSecondaryCtaRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.challengeStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C39076R.string.prompts_untrusted_need_help_btn_label, new Object[0]);
            }
            if (i != 3) {
                if (i == 4) {
                    return StringResource.INSTANCE.invoke("");
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        String str = this.fallbackCtaText;
        if (str != null) {
            return StringResource.INSTANCE.invoke(str);
        }
        if (this.challengeHasFallback) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_send_sms_cta_text, new Object[0]);
        }
        return null;
    }

    public final boolean isButtonBarVisible() {
        ChallengeStatus challengeStatus = this.challengeStatus;
        return (challengeStatus == ChallengeStatus.COMPLETE || challengeStatus == ChallengeStatus.BLOCKED) ? false : true;
    }

    public final StringResource getHelperTextRes() {
        if (this.challengeStatus == ChallengeStatus.LOADING) {
            return StringResource.INSTANCE.invoke(C39076R.string.prompts_verification_helper_text, new Object[0]);
        }
        return null;
    }
}
