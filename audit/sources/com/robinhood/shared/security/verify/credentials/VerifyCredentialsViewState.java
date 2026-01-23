package com.robinhood.shared.security.verify.credentials;

import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerifyCredentialsViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "", "progress", "", "showBackButton", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "subtitleRes", "<init>", "(FZILjava/lang/Integer;)V", "getProgress", "()F", "getShowBackButton", "()Z", "getTitleRes", "()I", "getSubtitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "ReviewEmail", "UpdateEmail", "CheckYourEmail", "ReviewPassword", "UpdatePassword", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$CheckYourEmail;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$ReviewEmail;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$ReviewPassword;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$UpdateEmail;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$UpdatePassword;", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class VerifyCredentialsViewState {
    public static final int $stable = 0;
    private final float progress;
    private final boolean showBackButton;
    private final Integer subtitleRes;
    private final int titleRes;

    public /* synthetic */ VerifyCredentialsViewState(float f, boolean z, int i, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, z, i, num);
    }

    private VerifyCredentialsViewState(float f, boolean z, int i, Integer num) {
        this.progress = f;
        this.showBackButton = z;
        this.titleRes = i;
        this.subtitleRes = num;
    }

    public /* synthetic */ VerifyCredentialsViewState(float f, boolean z, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i2 & 2) != 0 ? true : z, i, (i2 & 8) != 0 ? null : num, null);
    }

    public final float getProgress() {
        return this.progress;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    /* compiled from: VerifyCredentialsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$ReviewEmail;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReviewEmail extends VerifyCredentialsViewState {
        public static final int $stable = 0;
        public static final ReviewEmail INSTANCE = new ReviewEmail();

        public boolean equals(Object other) {
            return this == other || (other instanceof ReviewEmail);
        }

        public int hashCode() {
            return 783538636;
        }

        public String toString() {
            return "ReviewEmail";
        }

        private ReviewEmail() {
            super(0.16f, false, C39685R.string.review_email_title, Integer.valueOf(C39685R.string.review_email_subtitle), null);
        }
    }

    /* compiled from: VerifyCredentialsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$UpdateEmail;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdateEmail extends VerifyCredentialsViewState {
        public static final int $stable = 0;
        public static final UpdateEmail INSTANCE = new UpdateEmail();

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdateEmail);
        }

        public int hashCode() {
            return -1149839621;
        }

        public String toString() {
            return "UpdateEmail";
        }

        private UpdateEmail() {
            super(0.25f, false, C39685R.string.update_email_title, null, 10, null);
        }
    }

    /* compiled from: VerifyCredentialsViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$CheckYourEmail;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CheckYourEmail extends VerifyCredentialsViewState {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ CheckYourEmail copy$default(CheckYourEmail checkYourEmail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkYourEmail.email;
            }
            return checkYourEmail.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final CheckYourEmail copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new CheckYourEmail(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CheckYourEmail) && Intrinsics.areEqual(this.email, ((CheckYourEmail) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "CheckYourEmail(email=" + this.email + ")";
        }

        public final String getEmail() {
            return this.email;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckYourEmail(String email) {
            super(0.5f, false, C39685R.string.check_your_email_title, Integer.valueOf(C39685R.string.check_your_email_subtitle), 2, null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }
    }

    /* compiled from: VerifyCredentialsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$ReviewPassword;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReviewPassword extends VerifyCredentialsViewState {
        public static final int $stable = 0;
        public static final ReviewPassword INSTANCE = new ReviewPassword();

        public boolean equals(Object other) {
            return this == other || (other instanceof ReviewPassword);
        }

        public int hashCode() {
            return -291815829;
        }

        public String toString() {
            return "ReviewPassword";
        }

        private ReviewPassword() {
            super(0.75f, false, C39685R.string.review_password_title, Integer.valueOf(C39685R.string.review_password_subtitle), 2, null);
        }
    }

    /* compiled from: VerifyCredentialsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState$UpdatePassword;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-verify-credentials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdatePassword extends VerifyCredentialsViewState {
        public static final int $stable = 0;
        public static final UpdatePassword INSTANCE = new UpdatePassword();

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdatePassword);
        }

        public int hashCode() {
            return -2052030756;
        }

        public String toString() {
            return "UpdatePassword";
        }

        private UpdatePassword() {
            super(1.0f, false, C39685R.string.update_password_title, null, 10, null);
        }
    }
}
