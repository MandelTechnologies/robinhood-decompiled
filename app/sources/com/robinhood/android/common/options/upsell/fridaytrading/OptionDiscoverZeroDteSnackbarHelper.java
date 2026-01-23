package com.robinhood.android.common.options.upsell.fridaytrading;

import android.view.View;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionDiscoverZeroDteSnackbarHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0007"}, m3636d2 = {"showDiscoverZeroDteSnackbar", "", "view", "Landroid/view/View;", "showOptionSettings", "Lkotlin/Function0;", "dismissCallback", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarHelperKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OptionDiscoverZeroDteSnackbarHelper {
    public static final void showDiscoverZeroDteSnackbar(View view, final Function0<Unit> showOptionSettings, final Function0<Unit> dismissCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(showOptionSettings, "showOptionSettings");
        Intrinsics.checkNotNullParameter(dismissCallback, "dismissCallback");
        RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(view, C11303R.string.discover_zero_dte_snackbar_content, 0);
        RdsSnackbar.setAction$default(rdsSnackbarMake, C11303R.string.discover_zero_dte_snackbar_action, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarHelperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionDiscoverZeroDteSnackbarHelper.showDiscoverZeroDteSnackbar$lambda$2$lambda$0(showOptionSettings);
            }
        }, 14, (Object) null);
        rdsSnackbarMake.addDismissCallback(new Function2() { // from class: com.robinhood.android.common.options.upsell.fridaytrading.OptionDiscoverZeroDteSnackbarHelperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionDiscoverZeroDteSnackbarHelper.showDiscoverZeroDteSnackbar$lambda$2$lambda$1(dismissCallback, (RdsSnackbar) obj, ((Integer) obj2).intValue());
            }
        });
        rdsSnackbarMake.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDiscoverZeroDteSnackbar$lambda$2$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDiscoverZeroDteSnackbar$lambda$2$lambda$1(Function0 function0, RdsSnackbar rdsSnackbar, int i) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
