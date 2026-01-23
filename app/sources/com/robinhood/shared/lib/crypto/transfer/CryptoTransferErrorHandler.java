package com.robinhood.shared.lib.crypto.transfer;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.Bundle2;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/lib/crypto/transfer/CryptoTransferErrorHandler;", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activity", "Landroid/app/Activity;", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "buttonText", "", "negativeButtonText", "titleOverride", "", "cancelable", "", "<init>", "(Landroid/app/Activity;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "Ljava/lang/Integer;", "handleError", "t", "", "handleNonNetworkError", "showError", "", "errorResponse", "Lcom/robinhood/models/api/ErrorCodedErrorResponse;", "Companion", "lib-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferErrorHandler extends ActivityErrorHandler<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_THEME_OVERLAY = C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome;
    private static final String ERROR_PASS_THROUGH_ARG = "errorCodePassThroughArg";
    private final Integer buttonText;
    private final boolean cancelable;
    private final Integer negativeButtonText;
    private final String titleOverride;
    private final StringResource titleText;

    public /* synthetic */ CryptoTransferErrorHandler(Activity activity, StringResource stringResource, Integer num, Integer num2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, stringResource, num, num2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferErrorHandler(Activity activity, StringResource stringResource, Integer num, Integer num2, String str, boolean z) {
        super(activity, true, C11048R.id.dialog_id_generic_error, Integer.valueOf(DEFAULT_THEME_OVERLAY));
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.titleText = stringResource;
        this.buttonText = num;
        this.negativeButtonText = num2;
        this.titleOverride = str;
        this.cancelable = z;
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    public boolean handleError(Throwable t, boolean handleNonNetworkError) {
        Intrinsics.checkNotNullParameter(t, "t");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
        if (errorResponse3 != null) {
            showError(errorResponse3);
            return true;
        }
        return super.handleError(t, handleNonNetworkError);
    }

    private final void showError(ErrorResponse3 errorResponse) {
        Context context = getContextRef().get();
        if (context != null) {
            AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
            if (appCompatActivityRequireActivityBaseContext.isFinishing()) {
                return;
            }
            RhDialogFragment.Builder cancelable = RhDialogFragment.INSTANCE.create(appCompatActivityRequireActivityBaseContext).setTheme(DEFAULT_THEME_OVERLAY).setId(C11048R.id.dialog_id_generic_error).setMessage(errorResponse.getError_message()).setPassthroughArgs(INSTANCE.getPassThroughArgs(errorResponse)).setCancelable(this.cancelable);
            String str = this.titleOverride;
            if (str != null) {
                cancelable.setTitle(str);
            } else {
                StringResource stringResource = this.titleText;
                if (stringResource != null) {
                    Resources resources = appCompatActivityRequireActivityBaseContext.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    cancelable.setTitle(stringResource.getText(resources));
                } else {
                    cancelable.setTitle(C11048R.string.general_error_title, new Object[0]);
                }
            }
            Integer num = this.buttonText;
            if (num != null) {
                cancelable.setPositiveButton(num.intValue(), new Object[0]);
            }
            Integer num2 = this.negativeButtonText;
            if (num2 != null) {
                cancelable.setNegativeButton(num2.intValue(), new Object[0]);
            }
            FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(cancelable, supportFragmentManager, "error", false, 4, null);
        }
    }

    /* compiled from: CryptoTransferErrorHandler.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fR\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00058F¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/lib/crypto/transfer/CryptoTransferErrorHandler$Companion;", "", "<init>", "()V", "passThroughArgs", "Landroid/os/Bundle;", "Lcom/robinhood/models/api/ErrorCodedErrorResponse;", "getPassThroughArgs", "(Lcom/robinhood/models/api/ErrorCodedErrorResponse;)Landroid/os/Bundle;", "errorCodedErrorResponse", "getErrorCodedErrorResponse$annotations", "(Landroid/os/Bundle;)V", "getErrorCodedErrorResponse", "(Landroid/os/Bundle;)Lcom/robinhood/models/api/ErrorCodedErrorResponse;", "ERROR_PASS_THROUGH_ARG", "", "DEFAULT_THEME_OVERLAY", "", "handle", "", "activity", "Landroid/app/Activity;", "throwable", "", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "buttonText", "negativeButtonText", "titleOverride", "cancelable", "", "(Landroid/app/Activity;Ljava/lang/Throwable;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Z)V", "lib-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getErrorCodedErrorResponse$annotations(Bundle bundle) {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle getPassThroughArgs(ErrorResponse3 errorResponse3) {
            return Bundle2.bundleOf(Tuples4.m3642to(CryptoTransferErrorHandler.ERROR_PASS_THROUGH_ARG, errorResponse3));
        }

        public final ErrorResponse3 getErrorCodedErrorResponse(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            return (ErrorResponse3) bundle.getParcelable(CryptoTransferErrorHandler.ERROR_PASS_THROUGH_ARG);
        }

        public static /* synthetic */ void handle$default(Companion companion, Activity activity, Throwable th, StringResource stringResource, Integer num, Integer num2, String str, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                stringResource = null;
            }
            if ((i & 8) != 0) {
                num = null;
            }
            if ((i & 16) != 0) {
                num2 = null;
            }
            if ((i & 32) != 0) {
                str = null;
            }
            if ((i & 64) != 0) {
                z = true;
            }
            companion.handle(activity, th, stringResource, num, num2, str, z);
        }

        public final void handle(Activity activity, Throwable throwable, StringResource titleText, Integer buttonText, Integer negativeButtonText, String titleOverride, boolean cancelable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            AbsErrorHandler.handleError$default(new CryptoTransferErrorHandler(activity, titleText, buttonText, negativeButtonText, titleOverride, cancelable), throwable, false, 2, null);
        }
    }
}
