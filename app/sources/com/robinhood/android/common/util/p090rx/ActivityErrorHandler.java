package com.robinhood.android.common.util.p090rx;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.WebviewDialogFragment;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ActivityErrorHandler.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "T", "Lcom/robinhood/android/common/util/rx/ContextErrorHandler;", "activity", "Landroid/app/Activity;", "forceAsDialog", "", "errorDialogId", "", "errorDialogThemeOverride", "<init>", "(Landroid/app/Activity;ZILjava/lang/Integer;)V", "Ljava/lang/Integer;", "handleUnknownHttpError", "throwable", "", "handleUnknownError", "showShortError", "", "message", "", "showLongError", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class ActivityErrorHandler<T> extends ContextErrorHandler<T> {
    private final int errorDialogId;
    private final Integer errorDialogThemeOverride;
    private final boolean forceAsDialog;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static boolean showServerErrorsInDialog = BuildFlavors.INSTANCE.isDebugOrInternal();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActivityErrorHandler(Activity activity) {
        this(activity, false, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActivityErrorHandler(Activity activity, boolean z) {
        this(activity, z, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActivityErrorHandler(Activity activity, boolean z, int i) {
        this(activity, z, i, null, 8, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @JvmStatic
    @JvmOverloads
    public static final void handle(Activity activity, Throwable th) throws Throwable {
        INSTANCE.handle(activity, th);
    }

    @JvmStatic
    @JvmOverloads
    public static final void handle(Activity activity, Throwable th, boolean z) throws Throwable {
        INSTANCE.handle(activity, th, z);
    }

    @JvmStatic
    @JvmOverloads
    public static final void handle(Activity activity, Throwable th, boolean z, boolean z2) throws Throwable {
        INSTANCE.handle(activity, th, z, z2);
    }

    @JvmStatic
    @JvmOverloads
    public static final void handle(Activity activity, Throwable th, boolean z, boolean z2, int i) throws Throwable {
        INSTANCE.handle(activity, th, z, z2, i);
    }

    @JvmStatic
    @JvmOverloads
    public static final void handle(Activity activity, Throwable th, boolean z, boolean z2, int i, Integer num) throws Throwable {
        INSTANCE.handle(activity, th, z, z2, i, num);
    }

    public /* synthetic */ ActivityErrorHandler(Activity activity, boolean z, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? C11048R.id.dialog_id_generic_error : i, (i2 & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActivityErrorHandler(Activity activity, boolean z, int i, Integer num) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.forceAsDialog = z;
        this.errorDialogId = i;
        this.errorDialogThemeOverride = num;
    }

    @Override // com.robinhood.android.common.util.p090rx.ContextErrorHandler, com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleUnknownHttpError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        HttpException httpException = (HttpException) Throwables.findCause(throwable, HttpException.class);
        Context context = getContextRef().get();
        if (showServerErrorsInDialog && context != null && (context instanceof AppCompatActivity) && httpException != null && httpException.code() >= 500) {
            try {
                Response<?> response = httpException.response();
                Intrinsics.checkNotNull(response);
                ResponseBody responseBodyErrorBody = response.errorBody();
                Intrinsics.checkNotNull(responseBodyErrorBody);
                WebviewDialogFragment.INSTANCE.show(responseBodyErrorBody.string(), (AppCompatActivity) context);
                return true;
            } catch (Exception unused) {
            }
        }
        return super.handleUnknownHttpError(throwable);
    }

    @Override // com.robinhood.android.common.util.p090rx.ContextErrorHandler, com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleUnknownError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (this.forceAsDialog) {
            showLongError(getGenericNonNetworkError());
            return true;
        }
        showShortError(getGenericNonNetworkError());
        return true;
    }

    @Override // com.robinhood.android.common.util.p090rx.ContextErrorHandler
    protected void showShortError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Context context = getContextRef().get();
        if (context != null) {
            AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
            if (!this.forceAsDialog) {
                if (appCompatActivityRequireActivityBaseContext.isFinishing()) {
                    return;
                }
                Snackbars.showLarge(appCompatActivityRequireActivityBaseContext, message, -1);
                return;
            }
            showLongError(message);
        }
    }

    @Override // com.robinhood.android.common.util.p090rx.ContextErrorHandler
    protected void showLongError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Context context = getContextRef().get();
        if (context != null) {
            AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
            if (appCompatActivityRequireActivityBaseContext.isFinishing()) {
                return;
            }
            RhDialogFragment.Builder builderCreate = RhDialogFragment.INSTANCE.create(appCompatActivityRequireActivityBaseContext);
            Integer num = this.errorDialogThemeOverride;
            if (num != null) {
                builderCreate.setTheme(num.intValue());
            }
            RhDialogFragment.Builder message2 = builderCreate.setId(this.errorDialogId).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
            FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(message2, supportFragmentManager, "error", false, 4, null);
        }
    }

    /* compiled from: ActivityErrorHandler.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0016R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/ActivityErrorHandler$Companion;", "", "<init>", "()V", "showServerErrorsInDialog", "", "getShowServerErrorsInDialog$annotations", "getShowServerErrorsInDialog", "()Z", "setShowServerErrorsInDialog", "(Z)V", "handle", "", "activity", "Landroid/app/Activity;", "throwable", "", "forceAsDialog", "handleNonNetworkError", "errorDialogId", "", "errorDialogThemeOverride", "(Landroid/app/Activity;Ljava/lang/Throwable;ZZILjava/lang/Integer;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getShowServerErrorsInDialog$annotations() {
        }

        @JvmStatic
        @JvmOverloads
        public final void handle(Activity activity, Throwable throwable) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            handle$default(this, activity, throwable, false, false, 0, null, 60, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void handle(Activity activity, Throwable throwable, boolean z) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            handle$default(this, activity, throwable, z, false, 0, null, 56, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void handle(Activity activity, Throwable throwable, boolean z, boolean z2) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            handle$default(this, activity, throwable, z, z2, 0, null, 48, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void handle(Activity activity, Throwable throwable, boolean z, boolean z2, int i) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            handle$default(this, activity, throwable, z, z2, i, null, 32, null);
        }

        private Companion() {
        }

        public final boolean getShowServerErrorsInDialog() {
            return ActivityErrorHandler.showServerErrorsInDialog;
        }

        public final void setShowServerErrorsInDialog(boolean z) {
            ActivityErrorHandler.showServerErrorsInDialog = z;
        }

        public static /* synthetic */ void handle$default(Companion companion, Activity activity, Throwable th, boolean z, boolean z2, int i, Integer num, int i2, Object obj) throws Throwable {
            if ((i2 & 4) != 0) {
                z = false;
            }
            if ((i2 & 8) != 0) {
                z2 = false;
            }
            if ((i2 & 16) != 0) {
                i = C11048R.id.dialog_id_generic_error;
            }
            if ((i2 & 32) != 0) {
                num = null;
            }
            companion.handle(activity, th, z, z2, i, num);
        }

        @JvmStatic
        @JvmOverloads
        public final void handle(Activity activity, Throwable throwable, boolean forceAsDialog, boolean handleNonNetworkError, int errorDialogId, Integer errorDialogThemeOverride) throws Throwable {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (!new ActivityErrorHandler(activity, forceAsDialog, errorDialogId, errorDialogThemeOverride).handleError(throwable, handleNonNetworkError)) {
                throw throwable;
            }
        }
    }
}
