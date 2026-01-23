package com.robinhood.android.challenge.verification;

import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationHelpBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001f\u001a\u00020\bHÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÂ\u0003J=\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000eHÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001a¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationHelpBottomSheetViewState;", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "isLoggedIn", "", "isEmbeddedInPathfinder", "appType", "Lcom/robinhood/shared/app/type/AppType;", "fallbackCtaText", "", "<init>", "(Lcom/robinhood/models/api/Challenge;ZZLcom/robinhood/shared/app/type/AppType;Ljava/lang/String;)V", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "getTitleRes", "()I", "fallbackText", "Lcom/robinhood/utils/resource/StringResource;", "getFallbackText", "()Lcom/robinhood/utils/resource/StringResource;", "subtitleRes", "getSubtitleRes", "dismissButtonRes", "getDismissButtonRes", "isResendCodeButtonVisible", "()Z", "isLoggedInUarRecoveryEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChallengeVerificationHelpBottomSheetViewState {
    public static final int $stable = 8;
    private final AppType appType;
    private final Challenge challenge;
    private final String fallbackCtaText;
    private final boolean isEmbeddedInPathfinder;
    private final boolean isLoggedIn;

    /* compiled from: ChallengeVerificationHelpBottomSheetViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Challenge.Type.BACKUP_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Challenge.Type.PROMPTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Challenge.Type.WEBAUTHN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Challenge.Type.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Challenge getChallenge() {
        return this.challenge;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component3, reason: from getter */
    private final boolean getIsEmbeddedInPathfinder() {
        return this.isEmbeddedInPathfinder;
    }

    /* renamed from: component4, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component5, reason: from getter */
    private final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    public static /* synthetic */ ChallengeVerificationHelpBottomSheetViewState copy$default(ChallengeVerificationHelpBottomSheetViewState challengeVerificationHelpBottomSheetViewState, Challenge challenge, boolean z, boolean z2, AppType appType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge = challengeVerificationHelpBottomSheetViewState.challenge;
        }
        if ((i & 2) != 0) {
            z = challengeVerificationHelpBottomSheetViewState.isLoggedIn;
        }
        if ((i & 4) != 0) {
            z2 = challengeVerificationHelpBottomSheetViewState.isEmbeddedInPathfinder;
        }
        if ((i & 8) != 0) {
            appType = challengeVerificationHelpBottomSheetViewState.appType;
        }
        if ((i & 16) != 0) {
            str = challengeVerificationHelpBottomSheetViewState.fallbackCtaText;
        }
        String str2 = str;
        boolean z3 = z2;
        return challengeVerificationHelpBottomSheetViewState.copy(challenge, z, z3, appType, str2);
    }

    public final ChallengeVerificationHelpBottomSheetViewState copy(Challenge challenge, boolean isLoggedIn, boolean isEmbeddedInPathfinder, AppType appType, String fallbackCtaText) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new ChallengeVerificationHelpBottomSheetViewState(challenge, isLoggedIn, isEmbeddedInPathfinder, appType, fallbackCtaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeVerificationHelpBottomSheetViewState)) {
            return false;
        }
        ChallengeVerificationHelpBottomSheetViewState challengeVerificationHelpBottomSheetViewState = (ChallengeVerificationHelpBottomSheetViewState) other;
        return Intrinsics.areEqual(this.challenge, challengeVerificationHelpBottomSheetViewState.challenge) && this.isLoggedIn == challengeVerificationHelpBottomSheetViewState.isLoggedIn && this.isEmbeddedInPathfinder == challengeVerificationHelpBottomSheetViewState.isEmbeddedInPathfinder && this.appType == challengeVerificationHelpBottomSheetViewState.appType && Intrinsics.areEqual(this.fallbackCtaText, challengeVerificationHelpBottomSheetViewState.fallbackCtaText);
    }

    public int hashCode() {
        int iHashCode = ((((((this.challenge.hashCode() * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isEmbeddedInPathfinder)) * 31) + this.appType.hashCode()) * 31;
        String str = this.fallbackCtaText;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChallengeVerificationHelpBottomSheetViewState(challenge=" + this.challenge + ", isLoggedIn=" + this.isLoggedIn + ", isEmbeddedInPathfinder=" + this.isEmbeddedInPathfinder + ", appType=" + this.appType + ", fallbackCtaText=" + this.fallbackCtaText + ")";
    }

    public ChallengeVerificationHelpBottomSheetViewState(Challenge challenge, boolean z, boolean z2, AppType appType, String str) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.challenge = challenge;
        this.isLoggedIn = z;
        this.isEmbeddedInPathfinder = z2;
        this.appType = appType;
        this.fallbackCtaText = str;
    }

    public final int getTitleRes() {
        if (this.appType != AppType.RHC && (this.isEmbeddedInPathfinder || this.challenge.getType() == Challenge.Type.SMS || this.challenge.getType() == Challenge.Type.AUTH_APP)) {
            return C39076R.string.uar_challenge_verification_help_bottom_sheet_title;
        }
        return C39076R.string.challenge_verification_help_bottom_sheet_title;
    }

    public final StringResource getFallbackText() {
        if (this.appType == AppType.RHC) {
            return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_help_contact_support, new Object[0]);
        }
        String str = this.fallbackCtaText;
        if (str != null) {
            return StringResource.INSTANCE.invoke(str);
        }
        if (this.challenge.getType() == Challenge.Type.SMS) {
            return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_help_update_phone_number, new Object[0]);
        }
        if (this.challenge.getType() == Challenge.Type.AUTH_APP) {
            return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_help_update_authenticator_app, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_help_contact_support, new Object[0]);
    }

    public final int getSubtitleRes() {
        if (this.isEmbeddedInPathfinder && this.appType != AppType.RHC) {
            return C39076R.string.f6219xa1969736;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[this.challenge.getType().ordinal()]) {
            case 1:
                return C39076R.string.uar_challenge_verification_help_bottom_sheet_auth_subtitle;
            case 2:
                return C39076R.string.uar_challenge_verification_help_bottom_sheet_sms_subtitle;
            case 3:
                return C39076R.string.challenge_verification_help_bottom_sheet_email_subtitle;
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getDismissButtonRes() {
        if (this.isEmbeddedInPathfinder || this.challenge.getType() == Challenge.Type.SMS || this.challenge.getType() == Challenge.Type.AUTH_APP) {
            return C11048R.string.general_label_cancel;
        }
        return C11048R.string.general_label_dismiss;
    }

    public final boolean isResendCodeButtonVisible() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.challenge.getType().ordinal()]) {
            case 1:
                return false;
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge);
                throw new ExceptionsH();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLoggedInUarRecoveryEnabled() {
        if (this.isLoggedIn) {
            return this.challenge.getType() == Challenge.Type.SMS || this.challenge.getType() == Challenge.Type.AUTH_APP;
        }
        return false;
    }
}
