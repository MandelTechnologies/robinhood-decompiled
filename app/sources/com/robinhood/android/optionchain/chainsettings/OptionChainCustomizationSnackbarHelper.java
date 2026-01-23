package com.robinhood.android.optionchain.chainsettings;

import android.view.View;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationSnackbarHelper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\r"}, m3636d2 = {"showCustomizationSnackbar", "", "view", "Landroid/view/View;", "chainCustomizationErrorEvent", "Lcom/robinhood/android/optionchain/chainsettings/OptionChainCustomizationErrorEvent;", "showCustomizationPage", "Lkotlin/Function0;", "genericErrorHandler", "Lkotlin/Function1;", "", "", "showMetricSavedSnackbar", "feature-lib-option-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationSnackbarHelperKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionChainCustomizationSnackbarHelper {
    public static final void showCustomizationSnackbar(View view, OptionChainCustomizationErrorEvent chainCustomizationErrorEvent, final Function0<Unit> showCustomizationPage, Function1<? super Throwable, Boolean> genericErrorHandler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(chainCustomizationErrorEvent, "chainCustomizationErrorEvent");
        Intrinsics.checkNotNullParameter(showCustomizationPage, "showCustomizationPage");
        Intrinsics.checkNotNullParameter(genericErrorHandler, "genericErrorHandler");
        if (Intrinsics.areEqual(chainCustomizationErrorEvent, OptionChainCustomizationErrorEvent.OptionServiceDown.INSTANCE)) {
            RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(view, C22987R.string.option_chain_customization_option_service_down_snackbar_title, -1);
            rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_info_16dp);
            rdsSnackbarMake.show();
        } else if (Intrinsics.areEqual(chainCustomizationErrorEvent, OptionChainCustomizationErrorEvent.RemovedMetricType.INSTANCE)) {
            RdsSnackbar rdsSnackbarMake2 = RdsSnackbar.INSTANCE.make(view, C22987R.string.option_chain_customization_removed_metric_snackbar_title, -1);
            RdsSnackbar.setAction$default(rdsSnackbarMake2, C22987R.string.option_chain_customization_removed_metric_snackbar_action, false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationSnackbarHelperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionChainCustomizationSnackbarHelper.showCustomizationSnackbar$lambda$2$lambda$1(showCustomizationPage);
                }
            }, 14, (Object) null);
            rdsSnackbarMake2.show();
        } else if (Intrinsics.areEqual(chainCustomizationErrorEvent, OptionChainCustomizationErrorEvent.UnsupportedMetricType.INSTANCE)) {
            RdsSnackbar rdsSnackbarMake3 = RdsSnackbar.INSTANCE.make(view, C22987R.string.option_chain_customization_unsupported_metric_snackbar_title, -1);
            rdsSnackbarMake3.setLeadingIcon(C20690R.drawable.ic_rds_info_16dp);
            rdsSnackbarMake3.show();
        } else {
            if (!(chainCustomizationErrorEvent instanceof OptionChainCustomizationErrorEvent.GenericError)) {
                throw new NoWhenBranchMatchedException();
            }
            genericErrorHandler.invoke(((OptionChainCustomizationErrorEvent.GenericError) chainCustomizationErrorEvent).getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCustomizationSnackbar$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void showMetricSavedSnackbar(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(view, C22987R.string.option_chain_customization_metric_saved_snackbar_title, -1);
        rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_checkmark_16dp);
        rdsSnackbarMake.show();
    }
}
