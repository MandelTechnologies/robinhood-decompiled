package com.robinhood.android.cash.cushion.error;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CashCushionUpdateErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/error/CashCushionUpdateErrorHandler;", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "handleError", "", "t", "", "handleNonNetworkError", "showError", "", "Companion", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CashCushionUpdateErrorHandler extends ActivityErrorHandler<Object> {
    private static final String NO_BROKERAGE_ACCOUNT_EXPECTED_DETAIL = "no_brokerage_account";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ActivityErrorHandler.$stable;
    private static final int DEFAULT_THEME_OVERLAY = C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashCushionUpdateErrorHandler(Activity activity) {
        super(activity, false, C11048R.id.dialog_id_generic_error, Integer.valueOf(DEFAULT_THEME_OVERLAY), 2, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.robinhood.android.util.p275rx.AbsErrorHandler
    public boolean handleError(Throwable t, boolean handleNonNetworkError) {
        Intrinsics.checkNotNullParameter(t, "t");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
        if (Intrinsics.areEqual(errorResponse3 != null ? errorResponse3.getError_message() : null, NO_BROKERAGE_ACCOUNT_EXPECTED_DETAIL)) {
            showError();
            return true;
        }
        return super.handleError(t, handleNonNetworkError);
    }

    private final void showError() {
        Context context = getContextRef().get();
        if (context != null) {
            AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
            if (appCompatActivityRequireActivityBaseContext.isFinishing()) {
                return;
            }
            CashCushionBrokerageRequiredDialogFragment cashCushionBrokerageRequiredDialogFragment = new CashCushionBrokerageRequiredDialogFragment();
            FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            cashCushionBrokerageRequiredDialogFragment.show(supportFragmentManager, "showCashCushionBrokerageAccountRequiredDialog");
        }
    }

    /* compiled from: CashCushionUpdateErrorHandler.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cash/cushion/error/CashCushionUpdateErrorHandler$Companion;", "", "<init>", "()V", "NO_BROKERAGE_ACCOUNT_EXPECTED_DETAIL", "", "DEFAULT_THEME_OVERLAY", "", "handle", "", "activity", "Landroid/app/Activity;", "throwable", "", "feature-lib-cash-cushion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean handle(Activity activity, Throwable throwable) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return AbsErrorHandler.handleError$default(new CashCushionUpdateErrorHandler(activity), throwable, false, 2, null);
        }
    }
}
