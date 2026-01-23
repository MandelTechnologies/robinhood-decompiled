package com.robinhood.android.challenge.verification;

import android.telephony.PhoneNumberUtils;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogInfo;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogTag;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogType;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import java.util.Locale;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ChallengeVerificationDataState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0001?Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u00103\u001a\u00020\u000bHÂ\u0003J\t\u00104\u001a\u00020\tHÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u00106\u001a\u00020\u000bHÂ\u0003J\t\u00107\u001a\u00020\u000bHÂ\u0003J\t\u00108\u001a\u00020\u000bHÂ\u0003Jw\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\u0013\u0010:\u001a\u00020\u000b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0016\u0010&\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0011\u0010-\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001a¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "user", "Lcom/robinhood/models/db/sheriff/User;", "profileInfo", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "email", "", "isSubmittingChallenge", "", "flowId", "fallbackCtaText", "isEmbeddedInPathfinder", "isSmsUarKillswitchEnabled", "isAppUarKillswitchEnabled", "<init>", "(Lcom/robinhood/models/api/Challenge;Lcom/robinhood/models/db/sheriff/User;Lcom/robinhood/models/ui/identi/UiProfileInfo;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZ)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getProfileInfo", "()Lcom/robinhood/models/ui/identi/UiProfileInfo;", "isLoading", "()Z", "isLoggedIn", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "title", "getTitle", "getChallengeDialogInfo", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogInfo;", "type", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogType;", "formattedPhoneNumber", "getFormattedPhoneNumber", "()Ljava/lang/String;", "username", "getUsername", "helpButtonVisible", "getHelpButtonVisible", "hideSmsUarFallback", "getHideSmsUarFallback", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChallengeVerificationDataState {
    public static final String DIALOG_PASSTHROUGH_BUNDLE = "dialogPassThrough";
    private final Challenge challenge;
    private final String email;
    private final String fallbackCtaText;
    private final String flowId;
    private final boolean isAppUarKillswitchEnabled;
    private final boolean isEmbeddedInPathfinder;
    private final boolean isSmsUarKillswitchEnabled;
    private final boolean isSubmittingChallenge;
    private final UiProfileInfo profileInfo;
    private final User user;
    public static final int $stable = 8;

    /* compiled from: ChallengeVerificationDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr2 = new int[Challenge.Status.values().length];
            try {
                iArr2[Challenge.Status.ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Challenge.Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Challenge.Status.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Challenge.Status.VALIDATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Challenge.Status.REDEEMED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ChallengeDialogType.values().length];
            try {
                iArr3[ChallengeDialogType.RESEND_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ChallengeDialogType.RESEND_CODE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ChallengeDialogType.SUBMISSION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[ChallengeDialogType.TIME_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[ChallengeDialogType.START_UAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* renamed from: component10, reason: from getter */
    private final boolean getIsAppUarKillswitchEnabled() {
        return this.isAppUarKillswitchEnabled;
    }

    /* renamed from: component4, reason: from getter */
    private final String getEmail() {
        return this.email;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getIsSubmittingChallenge() {
        return this.isSubmittingChallenge;
    }

    /* renamed from: component6, reason: from getter */
    private final String getFlowId() {
        return this.flowId;
    }

    /* renamed from: component7, reason: from getter */
    private final String getFallbackCtaText() {
        return this.fallbackCtaText;
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getIsEmbeddedInPathfinder() {
        return this.isEmbeddedInPathfinder;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getIsSmsUarKillswitchEnabled() {
        return this.isSmsUarKillswitchEnabled;
    }

    public static /* synthetic */ ChallengeVerificationDataState copy$default(ChallengeVerificationDataState challengeVerificationDataState, Challenge challenge, User user, UiProfileInfo uiProfileInfo, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge = challengeVerificationDataState.challenge;
        }
        if ((i & 2) != 0) {
            user = challengeVerificationDataState.user;
        }
        if ((i & 4) != 0) {
            uiProfileInfo = challengeVerificationDataState.profileInfo;
        }
        if ((i & 8) != 0) {
            str = challengeVerificationDataState.email;
        }
        if ((i & 16) != 0) {
            z = challengeVerificationDataState.isSubmittingChallenge;
        }
        if ((i & 32) != 0) {
            str2 = challengeVerificationDataState.flowId;
        }
        if ((i & 64) != 0) {
            str3 = challengeVerificationDataState.fallbackCtaText;
        }
        if ((i & 128) != 0) {
            z2 = challengeVerificationDataState.isEmbeddedInPathfinder;
        }
        if ((i & 256) != 0) {
            z3 = challengeVerificationDataState.isSmsUarKillswitchEnabled;
        }
        if ((i & 512) != 0) {
            z4 = challengeVerificationDataState.isAppUarKillswitchEnabled;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        String str4 = str3;
        boolean z7 = z2;
        boolean z8 = z;
        String str5 = str2;
        return challengeVerificationDataState.copy(challenge, user, uiProfileInfo, str, z8, str5, str4, z7, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final Challenge getChallenge() {
        return this.challenge;
    }

    /* renamed from: component2, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component3, reason: from getter */
    public final UiProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public final ChallengeVerificationDataState copy(Challenge challenge, User user, UiProfileInfo profileInfo, String email, boolean isSubmittingChallenge, String flowId, String fallbackCtaText, boolean isEmbeddedInPathfinder, boolean isSmsUarKillswitchEnabled, boolean isAppUarKillswitchEnabled) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        return new ChallengeVerificationDataState(challenge, user, profileInfo, email, isSubmittingChallenge, flowId, fallbackCtaText, isEmbeddedInPathfinder, isSmsUarKillswitchEnabled, isAppUarKillswitchEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeVerificationDataState)) {
            return false;
        }
        ChallengeVerificationDataState challengeVerificationDataState = (ChallengeVerificationDataState) other;
        return Intrinsics.areEqual(this.challenge, challengeVerificationDataState.challenge) && Intrinsics.areEqual(this.user, challengeVerificationDataState.user) && Intrinsics.areEqual(this.profileInfo, challengeVerificationDataState.profileInfo) && Intrinsics.areEqual(this.email, challengeVerificationDataState.email) && this.isSubmittingChallenge == challengeVerificationDataState.isSubmittingChallenge && Intrinsics.areEqual(this.flowId, challengeVerificationDataState.flowId) && Intrinsics.areEqual(this.fallbackCtaText, challengeVerificationDataState.fallbackCtaText) && this.isEmbeddedInPathfinder == challengeVerificationDataState.isEmbeddedInPathfinder && this.isSmsUarKillswitchEnabled == challengeVerificationDataState.isSmsUarKillswitchEnabled && this.isAppUarKillswitchEnabled == challengeVerificationDataState.isAppUarKillswitchEnabled;
    }

    public int hashCode() {
        Challenge challenge = this.challenge;
        int iHashCode = (challenge == null ? 0 : challenge.hashCode()) * 31;
        User user = this.user;
        int iHashCode2 = (iHashCode + (user == null ? 0 : user.hashCode())) * 31;
        UiProfileInfo uiProfileInfo = this.profileInfo;
        int iHashCode3 = (iHashCode2 + (uiProfileInfo == null ? 0 : uiProfileInfo.hashCode())) * 31;
        String str = this.email;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSubmittingChallenge)) * 31) + this.flowId.hashCode()) * 31;
        String str2 = this.fallbackCtaText;
        return ((((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEmbeddedInPathfinder)) * 31) + Boolean.hashCode(this.isSmsUarKillswitchEnabled)) * 31) + Boolean.hashCode(this.isAppUarKillswitchEnabled);
    }

    public String toString() {
        return "ChallengeVerificationDataState(challenge=" + this.challenge + ", user=" + this.user + ", profileInfo=" + this.profileInfo + ", email=" + this.email + ", isSubmittingChallenge=" + this.isSubmittingChallenge + ", flowId=" + this.flowId + ", fallbackCtaText=" + this.fallbackCtaText + ", isEmbeddedInPathfinder=" + this.isEmbeddedInPathfinder + ", isSmsUarKillswitchEnabled=" + this.isSmsUarKillswitchEnabled + ", isAppUarKillswitchEnabled=" + this.isAppUarKillswitchEnabled + ")";
    }

    public ChallengeVerificationDataState(Challenge challenge, User user, UiProfileInfo uiProfileInfo, String str, boolean z, String flowId, String str2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        this.challenge = challenge;
        this.user = user;
        this.profileInfo = uiProfileInfo;
        this.email = str;
        this.isSubmittingChallenge = z;
        this.flowId = flowId;
        this.fallbackCtaText = str2;
        this.isEmbeddedInPathfinder = z2;
        this.isSmsUarKillswitchEnabled = z3;
        this.isAppUarKillswitchEnabled = z4;
    }

    public /* synthetic */ ChallengeVerificationDataState(Challenge challenge, User user, UiProfileInfo uiProfileInfo, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : challenge, (i & 2) != 0 ? null : user, (i & 4) != 0 ? null : uiProfileInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z, str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? false : z4);
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final User getUser() {
        return this.user;
    }

    public final UiProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public final boolean isLoading() {
        return this.challenge == null || this.isSubmittingChallenge;
    }

    public final boolean isLoggedIn() {
        return this.user != null;
    }

    public final StringResource getSubtitle() {
        Challenge challenge = this.challenge;
        if ((challenge != null ? challenge.getSubtitle() : null) != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            String subtitle = this.challenge.getSubtitle();
            Intrinsics.checkNotNull(subtitle);
            return companion.invoke(subtitle);
        }
        Challenge challenge2 = this.challenge;
        Challenge.Type type2 = challenge2 != null ? challenge2.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
            case 1:
                return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_subtitle_auth_app_default, new Object[0]);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
                UiProfileInfo uiProfileInfo = this.profileInfo;
                String phoneNumber = uiProfileInfo != null ? uiProfileInfo.getPhoneNumber() : null;
                if (phoneNumber != null && !StringsKt.isBlank(phoneNumber)) {
                    StringResource.Companion companion2 = StringResource.INSTANCE;
                    int i = C39076R.string.challenge_verification_subtitle_sms_logged_in;
                    String formattedPhoneNumber = getFormattedPhoneNumber();
                    Intrinsics.checkNotNull(formattedPhoneNumber);
                    return companion2.invoke(i, formattedPhoneNumber);
                }
                return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_subtitle_sms_logged_out, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke("");
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge);
                throw new ExceptionsH();
        }
    }

    public final StringResource getTitle() {
        Challenge challenge = this.challenge;
        if ((challenge != null ? challenge.getTitle() : null) != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            String title = this.challenge.getTitle();
            Intrinsics.checkNotNull(title);
            return companion.invoke(title);
        }
        Challenge challenge2 = this.challenge;
        Challenge.Type type2 = challenge2 != null ? challenge2.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
            case 1:
                return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_title_auth_app_default, new Object[0]);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
                return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_title_sms, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_title_email, new Object[0]);
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge);
                throw new ExceptionsH();
        }
    }

    public final ChallengeDialogInfo getChallengeDialogInfo(ChallengeDialogType type2) {
        StringResource stringResourceInvoke;
        int i;
        Intrinsics.checkNotNullParameter(type2, "type");
        int i2 = WhenMappings.$EnumSwitchMapping$2[type2.ordinal()];
        if (i2 == 1) {
            Challenge challenge = this.challenge;
            if ((challenge != null ? challenge.getType() : null) != Challenge.Type.SMS) {
                Challenge challenge2 = this.challenge;
                if ((challenge2 != null ? challenge2.getType() : null) != Challenge.Type.EMAIL) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            Challenge challenge3 = this.challenge;
            if ((challenge3 != null ? challenge3.getType() : null) == Challenge.Type.EMAIL) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_resend_message_email, new Object[0]);
            } else {
                UiProfileInfo uiProfileInfo = this.profileInfo;
                String phoneNumber = uiProfileInfo != null ? uiProfileInfo.getPhoneNumber() : null;
                if (phoneNumber == null || phoneNumber.length() == 0) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_resend_message_unauthed_sms, new Object[0]);
                } else {
                    StringResource.Companion companion = StringResource.INSTANCE;
                    int i3 = C39076R.string.challenge_verification_dialog_resend_message;
                    String formattedPhoneNumber = getFormattedPhoneNumber();
                    Intrinsics.checkNotNull(formattedPhoneNumber);
                    stringResourceInvoke = companion.invoke(i3, formattedPhoneNumber);
                }
            }
            return new ChallengeDialogInfo(null, C39076R.string.challenge_verification_dialog_resend_title, stringResourceInvoke, null, null, null, ChallengeDialogTag.TAG_DIALOG_RESEND, false, null, 441, null);
        }
        if (i2 == 2) {
            Challenge challenge4 = this.challenge;
            if ((challenge4 != null ? challenge4.getType() : null) != Challenge.Type.SMS) {
                throw new IllegalStateException("Check failed.");
            }
            return new ChallengeDialogInfo(null, C11048R.string.general_error_title, StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_resend_rate_limit_message, new Object[0]), null, null, null, ChallengeDialogTag.TAG_DIALOG_RESEND_ERROR, false, null, 441, null);
        }
        if (i2 == 3) {
            Challenge challenge5 = this.challenge;
            Challenge.Status status = challenge5 != null ? challenge5.getStatus() : null;
            int i4 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i4 != -1) {
                if (i4 == 1) {
                    if (Intrinsics.areEqual(this.flowId, Challenge.Flow.BACKUP_CODE.getId())) {
                        return new ChallengeDialogInfo(null, C39076R.string.challenge_verification_dialog_wrong_backup_code_title, StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_wrong_backup_code_msg, new Object[0]), null, null, null, ChallengeDialogTag.TAG_DIALOG_ISSUED, true, null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, null);
                    }
                    return new ChallengeDialogInfo(null, C39076R.string.challenge_verification_dialog_wrong_code_title, StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_wrong_code_msg, new Object[0]), null, null, null, ChallengeDialogTag.TAG_DIALOG_ISSUED, true, null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, null);
                }
                if (i4 == 2) {
                    return new ChallengeDialogInfo(Integer.valueOf(C10497R.id.dialog_id_challenge_response_attempts_exhausted), C39076R.string.challenge_verification_dialog_attempts_exhausted_title, StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_attempts_exhausted_msg, new Object[0]), null, Integer.valueOf(C11048R.string.general_label_contact_support), Integer.valueOf(C11048R.string.general_label_dismiss), ChallengeDialogTag.TAG_DIALOG_FAILED, false, null, 392, null);
                }
                if (i4 == 3) {
                    return new ChallengeDialogInfo(Integer.valueOf(C10497R.id.dialog_id_challenge_response_timeout), C39076R.string.challenge_verification_dialog_timeout_title, StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_timeout_msg, new Object[0]), Tuples4.m3642to(DIALOG_PASSTHROUGH_BUNDLE, this.challenge.getId()), null, null, ChallengeDialogTag.TAG_DIALOG_EXPIRED, false, null, 432, null);
                }
                if (i4 != 4 && i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge);
            throw new ExceptionsH();
        }
        if (i2 == 4) {
            Integer numValueOf = Integer.valueOf(C10497R.id.dialog_id_challenge_response_timeout);
            int i5 = C39076R.string.challenge_verification_dialog_timeout_title;
            StringResource stringResourceInvoke2 = StringResource.INSTANCE.invoke(C39076R.string.challenge_verification_dialog_timeout_msg, new Object[0]);
            Challenge challenge6 = this.challenge;
            return new ChallengeDialogInfo(numValueOf, i5, stringResourceInvoke2, Tuples4.m3642to(DIALOG_PASSTHROUGH_BUNDLE, challenge6 != null ? challenge6.getId() : null), null, null, ChallengeDialogTag.TAG_DIALOG_EXPIRED, false, null, 432, null);
        }
        if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        int i6 = C39076R.id.dialog_id_uar_log_out_confirm;
        Challenge challenge7 = this.challenge;
        Challenge.Type type3 = challenge7 != null ? challenge7.getType() : null;
        int i7 = type3 != null ? WhenMappings.$EnumSwitchMapping$0[type3.ordinal()] : -1;
        if (i7 == 1) {
            i = C39076R.string.challenge_verification_help_update_authenticator_app;
        } else if (i7 == 2) {
            i = C39076R.string.challenge_verification_help_update_phone_number;
        } else {
            Preconditions preconditions = Preconditions.INSTANCE;
            Challenge challenge8 = this.challenge;
            preconditions.failUnexpectedItemKotlin(challenge8 != null ? challenge8.getType() : null);
            throw new ExceptionsH();
        }
        int i8 = i;
        StringResource stringResourceInvoke3 = StringResource.INSTANCE.invoke(C39076R.string.uar_log_out_dialog_message, new Object[0]);
        int i9 = C11048R.string.general_label_continue;
        int i10 = C11048R.string.general_label_cancel;
        int i11 = C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome;
        User user = this.user;
        Intrinsics.checkNotNull(user);
        return new ChallengeDialogInfo(Integer.valueOf(i6), i8, stringResourceInvoke3, Tuples4.m3642to(DIALOG_PASSTHROUGH_BUNDLE, new ChallengeDialogInfo.StartUar(user.getUsername(), this.challenge.getType())), Integer.valueOf(i9), Integer.valueOf(i10), ChallengeDialogTag.TAG_DIALOG_START_UAR, false, Integer.valueOf(i11), 128, null);
    }

    private final String getFormattedPhoneNumber() {
        String country;
        User.Origin origin;
        CountryCode.Supported locality;
        UiProfileInfo uiProfileInfo = this.profileInfo;
        String phoneNumber = null;
        if (uiProfileInfo != null) {
            User user = this.user;
            if (user == null || (origin = user.getOrigin()) == null || (locality = origin.getLocality()) == null || (country = locality.getIso3166CountryCode()) == null) {
                country = Locale.US.getCountry();
            }
            String numberToE164 = PhoneNumberUtils.formatNumberToE164(uiProfileInfo.getPhoneNumber(), country);
            if (!Intrinsics.areEqual(country, Locale.US.getCountry())) {
                phoneNumber = uiProfileInfo.getPhoneNumber();
            } else if (numberToE164 != null) {
                phoneNumber = com.robinhood.utils.extensions.StringsKt.fromE164ToNanpPhoneNumber(numberToE164);
            }
            if (phoneNumber == null) {
                return uiProfileInfo.getPhoneNumber();
            }
        }
        return phoneNumber;
    }

    public final String getUsername() {
        String username;
        User user = this.user;
        return (user == null || (username = user.getUsername()) == null) ? this.email : username;
    }

    public final boolean getHelpButtonVisible() {
        if (!this.isAppUarKillswitchEnabled) {
            return true;
        }
        Challenge challenge = this.challenge;
        return ((challenge != null ? challenge.getType() : null) == Challenge.Type.AUTH_APP && this.fallbackCtaText == null && Intrinsics.areEqual(this.flowId, Challenge.Flow.LOGIN.getId()) && this.isEmbeddedInPathfinder) ? false : true;
    }

    public final boolean getHideSmsUarFallback() {
        if (!this.isSmsUarKillswitchEnabled) {
            return false;
        }
        Challenge challenge = this.challenge;
        return (challenge != null ? challenge.getType() : null) == Challenge.Type.SMS && this.fallbackCtaText == null && Intrinsics.areEqual(this.flowId, Challenge.Flow.LOGIN.getId()) && this.isEmbeddedInPathfinder;
    }
}
