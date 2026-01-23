package com.robinhood.shared.stepupverification.challenge.sms;

import android.telephony.PhoneNumberUtils;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.resource.StringResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SmsChallengeDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0002\b\"JA\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDataState;", "", "isLoading", "", "inputText", "", "fallbackCtaText", "userCountryCode", "profileInfo", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/ui/identi/UiProfileInfo;)V", "()Z", "getInputText", "()Ljava/lang/String;", "getUserCountryCode$feature_step_up_verification_externalDebug", "getProfileInfo$feature_step_up_verification_externalDebug", "()Lcom/robinhood/models/ui/identi/UiProfileInfo;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "fallbackText", "getFallbackText", "resendCodeSuccessAlertBody", "getResendCodeSuccessAlertBody", "formattedPhoneNumber", "getFormattedPhoneNumber", "component1", "component2", "component3", "component4", "component4$feature_step_up_verification_externalDebug", "component5", "component5$feature_step_up_verification_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class SmsChallengeDataState {
    public static final int $stable = 8;
    private final String fallbackCtaText;
    private final String inputText;
    private final boolean isLoading;
    private final UiProfileInfo profileInfo;
    private final String userCountryCode;

    public SmsChallengeDataState() {
        this(false, null, null, null, null, 31, null);
    }

    /* renamed from: component3, reason: from getter */
    private final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    public static /* synthetic */ SmsChallengeDataState copy$default(SmsChallengeDataState smsChallengeDataState, boolean z, String str, String str2, String str3, UiProfileInfo uiProfileInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = smsChallengeDataState.isLoading;
        }
        if ((i & 2) != 0) {
            str = smsChallengeDataState.inputText;
        }
        if ((i & 4) != 0) {
            str2 = smsChallengeDataState.fallbackCtaText;
        }
        if ((i & 8) != 0) {
            str3 = smsChallengeDataState.userCountryCode;
        }
        if ((i & 16) != 0) {
            uiProfileInfo = smsChallengeDataState.profileInfo;
        }
        UiProfileInfo uiProfileInfo2 = uiProfileInfo;
        String str4 = str2;
        return smsChallengeDataState.copy(z, str, str4, str3, uiProfileInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    /* renamed from: component4$feature_step_up_verification_externalDebug, reason: from getter */
    public final String getUserCountryCode() {
        return this.userCountryCode;
    }

    /* renamed from: component5$feature_step_up_verification_externalDebug, reason: from getter */
    public final UiProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public final SmsChallengeDataState copy(boolean isLoading, String inputText, String fallbackCtaText, String userCountryCode, UiProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        return new SmsChallengeDataState(isLoading, inputText, fallbackCtaText, userCountryCode, profileInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmsChallengeDataState)) {
            return false;
        }
        SmsChallengeDataState smsChallengeDataState = (SmsChallengeDataState) other;
        return this.isLoading == smsChallengeDataState.isLoading && Intrinsics.areEqual(this.inputText, smsChallengeDataState.inputText) && Intrinsics.areEqual(this.fallbackCtaText, smsChallengeDataState.fallbackCtaText) && Intrinsics.areEqual(this.userCountryCode, smsChallengeDataState.userCountryCode) && Intrinsics.areEqual(this.profileInfo, smsChallengeDataState.profileInfo);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.inputText.hashCode()) * 31;
        String str = this.fallbackCtaText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userCountryCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiProfileInfo uiProfileInfo = this.profileInfo;
        return iHashCode3 + (uiProfileInfo != null ? uiProfileInfo.hashCode() : 0);
    }

    public String toString() {
        return "SmsChallengeDataState(isLoading=" + this.isLoading + ", inputText=" + this.inputText + ", fallbackCtaText=" + this.fallbackCtaText + ", userCountryCode=" + this.userCountryCode + ", profileInfo=" + this.profileInfo + ")";
    }

    public SmsChallengeDataState(boolean z, String inputText, String str, String str2, UiProfileInfo uiProfileInfo) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.isLoading = z;
        this.inputText = inputText;
        this.fallbackCtaText = str;
        this.userCountryCode = str2;
        this.profileInfo = uiProfileInfo;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SmsChallengeDataState(boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.robinhood.models.p355ui.identi.UiProfileInfo r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDataState.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, com.robinhood.models.ui.identi.UiProfileInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final String getUserCountryCode$feature_step_up_verification_externalDebug() {
        return this.userCountryCode;
    }

    public final UiProfileInfo getProfileInfo$feature_step_up_verification_externalDebug() {
        return this.profileInfo;
    }

    public final StringResource getSubtitle() {
        StringResource stringResourceInvoke;
        String formattedPhoneNumber = getFormattedPhoneNumber();
        return (formattedPhoneNumber == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_subtitle_sms_logged_in, formattedPhoneNumber)) == null) ? StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_subtitle_sms_logged_out, new Object[0]) : stringResourceInvoke;
    }

    public final StringResource getFallbackText() {
        String str = this.fallbackCtaText;
        if (str != null) {
            return StringResource.INSTANCE.invoke(str);
        }
        return null;
    }

    public final StringResource getResendCodeSuccessAlertBody() {
        StringResource stringResourceInvoke;
        String formattedPhoneNumber = getFormattedPhoneNumber();
        return (formattedPhoneNumber == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_resend_message, formattedPhoneNumber)) == null) ? StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_resend_message_unauthed_sms, new Object[0]) : stringResourceInvoke;
    }

    private final String getFormattedPhoneNumber() {
        String strFromE164ToNanpPhoneNumber;
        if (this.profileInfo == null) {
            return null;
        }
        if (Intrinsics.areEqual(this.userCountryCode, Locale.US.getCountry())) {
            String numberToE164 = PhoneNumberUtils.formatNumberToE164(this.profileInfo.getPhoneNumber(), this.userCountryCode);
            return (numberToE164 == null || (strFromE164ToNanpPhoneNumber = StringsKt.fromE164ToNanpPhoneNumber(numberToE164)) == null) ? this.profileInfo.getPhoneNumber() : strFromE164ToNanpPhoneNumber;
        }
        return this.profileInfo.getPhoneNumber();
    }
}
