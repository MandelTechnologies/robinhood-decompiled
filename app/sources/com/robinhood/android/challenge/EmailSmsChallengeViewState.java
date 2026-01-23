package com.robinhood.android.challenge;

import android.content.res.Resources;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EmailSmsChallengeViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020)J\u0010\u0010+\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020)J\u0010\u0010,\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020)J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÂ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\rHÂ\u0003J\u0083\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\rHÆ\u0001J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010#\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001e¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeViewState;", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "replacedChallenge", "Lcom/robinhood/udf/UiEvent;", "user", "Lcom/robinhood/models/db/sheriff/User;", "unauthedUsername", "", "profileInfo", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "pending", "", "result", "Lcom/robinhood/android/challenge/EmailSmsChallengeResult;", "error", "", "isUserLoggedIn", "<init>", "(Lcom/robinhood/models/api/Challenge;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/db/sheriff/User;Ljava/lang/String;Lcom/robinhood/models/ui/identi/UiProfileInfo;ZLcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Z)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "getReplacedChallenge", "()Lcom/robinhood/udf/UiEvent;", "getUser", "()Lcom/robinhood/models/db/sheriff/User;", "getProfileInfo", "()Lcom/robinhood/models/ui/identi/UiProfileInfo;", "getPending", "()Z", "getResult", "getError", "canResendCode", "getCanResendCode", "canReplace", "getCanReplace", "resendButtonIsVisible", "getResendButtonIsVisible", "getTitleText", "res", "Landroid/content/res/Resources;", "getSummaryText", "getResendDialogMessage", "getSubtitleBtnText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class EmailSmsChallengeViewState {
    public static final int $stable = 8;
    private final boolean canReplace;
    private final boolean canResendCode;
    private final Challenge challenge;
    private final UiEvent<Throwable> error;
    private final boolean isUserLoggedIn;
    private final boolean pending;
    private final UiProfileInfo profileInfo;
    private final UiEvent<Challenge> replacedChallenge;
    private final boolean resendButtonIsVisible;
    private final UiEvent<EmailSmsChallengeResult> result;
    private final String unauthedUsername;
    private final User user;

    /* compiled from: EmailSmsChallengeViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Challenge.Type.values().length];
            try {
                iArr[Challenge.Type.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Challenge.Type.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Challenge.Type.AUTH_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Challenge.Type.BACKUP_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Challenge.Type.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Challenge.Type.PROMPTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Challenge.Type.WEBAUTHN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EmailSmsChallengeViewState() {
        this(null, null, null, null, null, false, null, null, false, 511, null);
    }

    /* renamed from: component4, reason: from getter */
    private final String getUnauthedUsername() {
        return this.unauthedUsername;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getIsUserLoggedIn() {
        return this.isUserLoggedIn;
    }

    public static /* synthetic */ EmailSmsChallengeViewState copy$default(EmailSmsChallengeViewState emailSmsChallengeViewState, Challenge challenge, UiEvent uiEvent, User user, String str, UiProfileInfo uiProfileInfo, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge = emailSmsChallengeViewState.challenge;
        }
        if ((i & 2) != 0) {
            uiEvent = emailSmsChallengeViewState.replacedChallenge;
        }
        if ((i & 4) != 0) {
            user = emailSmsChallengeViewState.user;
        }
        if ((i & 8) != 0) {
            str = emailSmsChallengeViewState.unauthedUsername;
        }
        if ((i & 16) != 0) {
            uiProfileInfo = emailSmsChallengeViewState.profileInfo;
        }
        if ((i & 32) != 0) {
            z = emailSmsChallengeViewState.pending;
        }
        if ((i & 64) != 0) {
            uiEvent2 = emailSmsChallengeViewState.result;
        }
        if ((i & 128) != 0) {
            uiEvent3 = emailSmsChallengeViewState.error;
        }
        if ((i & 256) != 0) {
            z2 = emailSmsChallengeViewState.isUserLoggedIn;
        }
        UiEvent uiEvent4 = uiEvent3;
        boolean z3 = z2;
        boolean z4 = z;
        UiEvent uiEvent5 = uiEvent2;
        UiProfileInfo uiProfileInfo2 = uiProfileInfo;
        User user2 = user;
        return emailSmsChallengeViewState.copy(challenge, uiEvent, user2, str, uiProfileInfo2, z4, uiEvent5, uiEvent4, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final UiEvent<Challenge> component2() {
        return this.replacedChallenge;
    }

    /* renamed from: component3, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* renamed from: component5, reason: from getter */
    public final UiProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPending() {
        return this.pending;
    }

    public final UiEvent<EmailSmsChallengeResult> component7() {
        return this.result;
    }

    public final UiEvent<Throwable> component8() {
        return this.error;
    }

    public final EmailSmsChallengeViewState copy(Challenge challenge, UiEvent<Challenge> replacedChallenge, User user, String unauthedUsername, UiProfileInfo profileInfo, boolean pending, UiEvent<EmailSmsChallengeResult> result, UiEvent<Throwable> error, boolean isUserLoggedIn) {
        return new EmailSmsChallengeViewState(challenge, replacedChallenge, user, unauthedUsername, profileInfo, pending, result, error, isUserLoggedIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailSmsChallengeViewState)) {
            return false;
        }
        EmailSmsChallengeViewState emailSmsChallengeViewState = (EmailSmsChallengeViewState) other;
        return Intrinsics.areEqual(this.challenge, emailSmsChallengeViewState.challenge) && Intrinsics.areEqual(this.replacedChallenge, emailSmsChallengeViewState.replacedChallenge) && Intrinsics.areEqual(this.user, emailSmsChallengeViewState.user) && Intrinsics.areEqual(this.unauthedUsername, emailSmsChallengeViewState.unauthedUsername) && Intrinsics.areEqual(this.profileInfo, emailSmsChallengeViewState.profileInfo) && this.pending == emailSmsChallengeViewState.pending && Intrinsics.areEqual(this.result, emailSmsChallengeViewState.result) && Intrinsics.areEqual(this.error, emailSmsChallengeViewState.error) && this.isUserLoggedIn == emailSmsChallengeViewState.isUserLoggedIn;
    }

    public int hashCode() {
        Challenge challenge = this.challenge;
        int iHashCode = (challenge == null ? 0 : challenge.hashCode()) * 31;
        UiEvent<Challenge> uiEvent = this.replacedChallenge;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        User user = this.user;
        int iHashCode3 = (iHashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        String str = this.unauthedUsername;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        UiProfileInfo uiProfileInfo = this.profileInfo;
        int iHashCode5 = (((iHashCode4 + (uiProfileInfo == null ? 0 : uiProfileInfo.hashCode())) * 31) + Boolean.hashCode(this.pending)) * 31;
        UiEvent<EmailSmsChallengeResult> uiEvent2 = this.result;
        int iHashCode6 = (iHashCode5 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent3 = this.error;
        return ((iHashCode6 + (uiEvent3 != null ? uiEvent3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUserLoggedIn);
    }

    public String toString() {
        return "EmailSmsChallengeViewState(challenge=" + this.challenge + ", replacedChallenge=" + this.replacedChallenge + ", user=" + this.user + ", unauthedUsername=" + this.unauthedUsername + ", profileInfo=" + this.profileInfo + ", pending=" + this.pending + ", result=" + this.result + ", error=" + this.error + ", isUserLoggedIn=" + this.isUserLoggedIn + ")";
    }

    public EmailSmsChallengeViewState(Challenge challenge, UiEvent<Challenge> uiEvent, User user, String str, UiProfileInfo uiProfileInfo, boolean z, UiEvent<EmailSmsChallengeResult> uiEvent2, UiEvent<Throwable> uiEvent3, boolean z2) {
        this.challenge = challenge;
        this.replacedChallenge = uiEvent;
        this.user = user;
        this.unauthedUsername = str;
        this.profileInfo = uiProfileInfo;
        this.pending = z;
        this.result = uiEvent2;
        this.error = uiEvent3;
        this.isUserLoggedIn = z2;
        boolean z3 = false;
        boolean z4 = (challenge != null ? challenge.getRemaining_retries() : 0) > 0;
        this.canResendCode = z4;
        this.canReplace = (challenge != null ? challenge.getAlternate_type() : null) != null;
        if (z4 && !z) {
            z3 = true;
        }
        this.resendButtonIsVisible = z3;
    }

    public /* synthetic */ EmailSmsChallengeViewState(Challenge challenge, UiEvent uiEvent, User user, String str, UiProfileInfo uiProfileInfo, boolean z, UiEvent uiEvent2, UiEvent uiEvent3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : challenge, (i & 2) != 0 ? null : uiEvent, (i & 4) != 0 ? null : user, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : uiProfileInfo, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : uiEvent2, (i & 128) != 0 ? null : uiEvent3, (i & 256) != 0 ? false : z2);
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final UiEvent<Challenge> getReplacedChallenge() {
        return this.replacedChallenge;
    }

    public final User getUser() {
        return this.user;
    }

    public final UiProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public final boolean getPending() {
        return this.pending;
    }

    public final UiEvent<EmailSmsChallengeResult> getResult() {
        return this.result;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean getCanResendCode() {
        return this.canResendCode;
    }

    public final boolean getCanReplace() {
        return this.canReplace;
    }

    public final boolean getResendButtonIsVisible() {
        return this.resendButtonIsVisible;
    }

    public final String getTitleText(Resources res) {
        Intrinsics.checkNotNullParameter(res, "res");
        Challenge challenge = this.challenge;
        Challenge.Type type2 = challenge != null ? challenge.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return res.getString(C39076R.string.challenge_response_title);
            case 2:
                return res.getString(C39076R.string.challenge_verification_title_sms);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge.getType());
                throw new ExceptionsH();
        }
    }

    public final String getSummaryText(Resources res) {
        String email;
        String string2;
        String phoneNumber;
        String string3;
        Intrinsics.checkNotNullParameter(res, "res");
        Challenge challenge = this.challenge;
        Challenge.Type type2 = challenge != null ? challenge.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                User user = this.user;
                if (user != null && (email = user.getEmail()) != null && (string2 = res.getString(C39076R.string.challenge_response_summary, email)) != null) {
                    return string2;
                }
                String string4 = res.getString(C39076R.string.challenge_response_summary_unauthed_email);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 2:
                UiProfileInfo uiProfileInfo = this.profileInfo;
                if (uiProfileInfo != null && (phoneNumber = uiProfileInfo.getPhoneNumber()) != null && (string3 = res.getString(C39076R.string.challenge_verification_subtitle_sms_logged_in, phoneNumber)) != null) {
                    return string3;
                }
                String string5 = res.getString(C39076R.string.challenge_verification_subtitle_sms_logged_out);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge.getType());
                throw new ExceptionsH();
        }
    }

    public final String getResendDialogMessage(Resources res) throws Resources.NotFoundException {
        String email;
        String string2;
        String phoneNumber;
        String string3;
        Intrinsics.checkNotNullParameter(res, "res");
        Challenge challenge = this.challenge;
        Challenge.Type type2 = challenge != null ? challenge.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                User user = this.user;
                if (user != null && (email = user.getEmail()) != null && (string2 = res.getString(C39076R.string.challenge_response_dialog_resend_message, email)) != null) {
                    return string2;
                }
                String string4 = res.getString(C39076R.string.challenge_response_dialog_resend_message_unauthed_email);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 2:
                UiProfileInfo uiProfileInfo = this.profileInfo;
                if (uiProfileInfo != null && (phoneNumber = uiProfileInfo.getPhoneNumber()) != null && (string3 = res.getString(C39076R.string.challenge_response_dialog_resend_message, phoneNumber)) != null) {
                    return string3;
                }
                String string5 = res.getString(C39076R.string.challenge_response_dialog_resend_message_unauthed_sms);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge.getType());
                throw new ExceptionsH();
        }
    }

    public final String getSubtitleBtnText(Resources res) {
        int i;
        Intrinsics.checkNotNullParameter(res, "res");
        Challenge challenge = this.challenge;
        if (challenge == null) {
            return null;
        }
        Challenge.Type alternate_type = challenge.getAlternate_type();
        Challenge.Type type2 = this.challenge.getType();
        Challenge.Type type3 = Challenge.Type.EMAIL;
        if (alternate_type == type3) {
            i = C39076R.string.challenge_response_replace_as_email;
        } else {
            Challenge.Type type4 = Challenge.Type.SMS;
            if (alternate_type == type4) {
                i = C39076R.string.challenge_response_replace_as_sms;
            } else if (type2 == type3) {
                i = C39076R.string.challenge_response_no_access_email;
            } else if (type2 == type4) {
                i = C39076R.string.challenge_response_no_access_sms;
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(this.challenge);
                throw new ExceptionsH();
            }
        }
        return res.getString(i);
    }
}
