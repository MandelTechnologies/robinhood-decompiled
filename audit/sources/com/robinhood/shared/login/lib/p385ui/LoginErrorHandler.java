package com.robinhood.shared.login.lib.p385ui;

import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.FieldErrorListErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import com.robinhood.models.api.GenericErrorResponse;
import com.robinhood.models.api.RecoverAppMfaErrorResponse;
import com.robinhood.models.api.UserLockoutErrorResponse;
import com.robinhood.shared.login.lib.C39090R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoginErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u001c\u001dB=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginErrorHandler;", "T", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "activity", "Landroid/app/Activity;", "errorDialogThemeOverride", "", "onChallengeErrorResponse", "Lkotlin/Function1;", "Lcom/robinhood/models/api/Challenge;", "", "genericResponseType", "Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "<init>", "(Landroid/app/Activity;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;)V", "Ljava/lang/Integer;", "handleErrorResponse", "", "errorResponse", "Lcom/robinhood/models/api/ErrorResponse;", "getLockoutDialogContent", "Lcom/robinhood/shared/login/lib/ui/LoginErrorHandler$DialogContent;", "Lcom/robinhood/models/api/UserLockoutErrorResponse;", "showCreateAccountErrorDialog", ErrorResponse.DETAIL, "", "showUserLockoutDialog", "dialogContent", "DialogContent", "Companion", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class LoginErrorHandler<T> extends ActivityErrorHandler<T> {
    private static final String ERROR_CODE_OFAC_LOCKOUT = "ofac_locked";
    private static final String TAG_USER_EMAIL_UNRECOGNIZED = "unrecognized-email";
    private static final String TAG_USER_LOCKOUT_DIALOG = "user-lockout";
    private final Activity activity;
    private final Integer errorDialogThemeOverride;
    private final LoginErrorHandler2 genericResponseType;
    private final Function1<Challenge, Unit> onChallengeErrorResponse;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LoginErrorHandler(Activity activity, Integer num, Function1 function1, LoginErrorHandler2 loginErrorHandler2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? LoginErrorHandler2.DEFAULT : loginErrorHandler2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoginErrorHandler(Activity activity, Integer num, Function1<? super Challenge, Unit> function1, LoginErrorHandler2 genericResponseType) {
        super(activity, true, 0, num, 4, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(genericResponseType, "genericResponseType");
        this.activity = activity;
        this.errorDialogThemeOverride = num;
        this.onChallengeErrorResponse = function1;
        this.genericResponseType = genericResponseType;
    }

    /* compiled from: LoginErrorHandler.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginErrorHandler$DialogContent;", "", "dialogId", "", "message", "", "positiveButtonRes", "title", "<init>", "(ILjava/lang/String;ILjava/lang/String;)V", "getDialogId", "()I", "getMessage", "()Ljava/lang/String;", "getPositiveButtonRes", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogContent {
        public static final int $stable = 0;
        private final int dialogId;
        private final String message;
        private final int positiveButtonRes;
        private final String title;

        public static /* synthetic */ DialogContent copy$default(DialogContent dialogContent, int i, String str, int i2, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = dialogContent.dialogId;
            }
            if ((i3 & 2) != 0) {
                str = dialogContent.message;
            }
            if ((i3 & 4) != 0) {
                i2 = dialogContent.positiveButtonRes;
            }
            if ((i3 & 8) != 0) {
                str2 = dialogContent.title;
            }
            return dialogContent.copy(i, str, i2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDialogId() {
            return this.dialogId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPositiveButtonRes() {
            return this.positiveButtonRes;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final DialogContent copy(int dialogId, String message, int positiveButtonRes, String title) {
            return new DialogContent(dialogId, message, positiveButtonRes, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogContent)) {
                return false;
            }
            DialogContent dialogContent = (DialogContent) other;
            return this.dialogId == dialogContent.dialogId && Intrinsics.areEqual(this.message, dialogContent.message) && this.positiveButtonRes == dialogContent.positiveButtonRes && Intrinsics.areEqual(this.title, dialogContent.title);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.dialogId) * 31;
            String str = this.message;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.positiveButtonRes)) * 31;
            String str2 = this.title;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "DialogContent(dialogId=" + this.dialogId + ", message=" + this.message + ", positiveButtonRes=" + this.positiveButtonRes + ", title=" + this.title + ")";
        }

        public DialogContent(int i, String str, int i2, String str2) {
            this.dialogId = i;
            this.message = str;
            this.positiveButtonRes = i2;
            this.title = str2;
        }

        public final int getDialogId() {
            return this.dialogId;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getPositiveButtonRes() {
            return this.positiveButtonRes;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    public boolean handleErrorResponse(ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        if ((errorResponse instanceof ErrorResponse3) || (errorResponse instanceof FieldErrorListErrorResponse) || (errorResponse instanceof RecoverAppMfaErrorResponse) || (errorResponse instanceof GenericAlertErrorResponse)) {
            return super.handleErrorResponse(errorResponse);
        }
        if (errorResponse instanceof GenericErrorResponse) {
            if (this.genericResponseType == LoginErrorHandler2.CREATE_ACCOUNT && !this.activity.isFinishing()) {
                showCreateAccountErrorDialog(((GenericErrorResponse) errorResponse).getError_message());
                return true;
            }
            return super.handleErrorResponse(errorResponse);
        }
        if (errorResponse instanceof ChallengeErrorResponse) {
            Function1<Challenge, Unit> function1 = this.onChallengeErrorResponse;
            if (function1 != null) {
                function1.invoke(((ChallengeErrorResponse) errorResponse).getChallenge());
                return true;
            }
            return super.handleErrorResponse(errorResponse);
        }
        if (!(errorResponse instanceof UserLockoutErrorResponse)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.activity.isFinishing()) {
            showUserLockoutDialog(getLockoutDialogContent((UserLockoutErrorResponse) errorResponse));
        }
        return true;
    }

    private final DialogContent getLockoutDialogContent(UserLockoutErrorResponse errorResponse) {
        if (errorResponse.getForcePasswordReset()) {
            return new DialogContent(C39090R.id.dialog_id_account_lockout_manual_password_reset, this.activity.getString(C39090R.string.account_lockout_message_password_reset), C39090R.string.account_lockout_dialog_manual_password_reset_action, this.activity.getString(C39090R.string.account_lockout_dialog_title));
        }
        if (Intrinsics.areEqual(errorResponse.getErrorCode(), ERROR_CODE_OFAC_LOCKOUT)) {
            return new DialogContent(C39090R.id.dialog_id_account_lockout_contact_support, errorResponse.getError_message(), C39090R.string.account_lockout_dialog_contact_support_action, errorResponse.getTitle());
        }
        return new DialogContent(C39090R.id.dialog_id_account_lockout_contact_support, this.activity.getString(C39090R.string.account_lockout_message_contact_support), C39090R.string.account_lockout_dialog_contact_support_action, this.activity.getString(C39090R.string.account_lockout_dialog_title));
    }

    private final void showCreateAccountErrorDialog(String detail) {
        String string2;
        RhDialogFragment.Builder builderCreate = RhDialogFragment.INSTANCE.create(this.activity);
        Integer num = this.errorDialogThemeOverride;
        if (num != null) {
            builderCreate.setTheme(num.intValue());
        }
        builderCreate.setId(C39090R.id.dialog_id_error_with_create_account_cta);
        builderCreate.setLayoutRes(C13997R.layout.dialog_fragment_design_system);
        builderCreate.setTitle(this.activity.getString(C39090R.string.login_email_unrecognized_title));
        boolean z = detail != null;
        if (z) {
            string2 = this.activity.getString(C39090R.string.login_email_unrecognized_desc, detail);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = this.activity.getString(C39090R.string.login_email_unrecognized_create_new_account);
        }
        builderCreate.setMessage(string2);
        builderCreate.setPositiveButton(this.activity.getString(C39090R.string.login_create_account));
        builderCreate.setNegativeButton(this.activity.getString(C39090R.string.login_email_unrecognized_deny));
        FragmentManager supportFragmentManager = Contexts7.requireBaseActivityBaseContext(this.activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, supportFragmentManager, TAG_USER_EMAIL_UNRECOGNIZED, false, 4, null);
    }

    private final void showUserLockoutDialog(DialogContent dialogContent) {
        RhDialogFragment.Builder builderCreate = RhDialogFragment.INSTANCE.create(this.activity);
        Integer num = this.errorDialogThemeOverride;
        if (num != null) {
            builderCreate.setTheme(num.intValue());
        }
        builderCreate.setId(dialogContent.getDialogId());
        builderCreate.setLayoutRes(C13997R.layout.dialog_fragment_design_system);
        builderCreate.setTitle(dialogContent.getTitle());
        builderCreate.setMessage(dialogContent.getMessage());
        builderCreate.setPositiveButton(dialogContent.getPositiveButtonRes(), new Object[0]);
        FragmentManager supportFragmentManager = Contexts7.requireBaseActivityBaseContext(this.activity).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, supportFragmentManager, TAG_USER_LOCKOUT_DIALOG, false, 4, null);
    }

    /* compiled from: LoginErrorHandler.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/login/lib/ui/LoginErrorHandler$Companion;", "", "<init>", "()V", "TAG_USER_LOCKOUT_DIALOG", "", "ERROR_CODE_OFAC_LOCKOUT", "TAG_USER_EMAIL_UNRECOGNIZED", "handleError", "", "activity", "Landroid/app/Activity;", "throwable", "", "isAchromatic", "", "genericResponseType", "Lcom/robinhood/shared/login/lib/ui/GenericLoginErrorResponseType;", "onChallengeErrorResponse", "Lkotlin/Function1;", "Lcom/robinhood/models/api/Challenge;", "feature-lib-login_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void handleError$default(Companion companion, Activity activity, Throwable th, boolean z, LoginErrorHandler2 loginErrorHandler2, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                loginErrorHandler2 = LoginErrorHandler2.DEFAULT;
            }
            LoginErrorHandler2 loginErrorHandler22 = loginErrorHandler2;
            if ((i & 16) != 0) {
                function1 = null;
            }
            companion.handleError(activity, th, z2, loginErrorHandler22, function1);
        }

        public final void handleError(Activity activity, Throwable throwable, boolean isAchromatic, LoginErrorHandler2 genericResponseType, Function1<? super Challenge, Unit> onChallengeErrorResponse) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(genericResponseType, "genericResponseType");
            if (!AbsErrorHandler.handleError$default(new LoginErrorHandler(activity, isAchromatic ? Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome) : null, onChallengeErrorResponse, genericResponseType), throwable, false, 2, null)) {
                throw new RuntimeException(throwable);
            }
        }
    }
}
