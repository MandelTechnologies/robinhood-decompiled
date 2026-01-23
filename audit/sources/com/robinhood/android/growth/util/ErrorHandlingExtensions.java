package com.robinhood.android.growth.util;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.growth.C18353R;
import com.robinhood.android.growth.model.ErrorData;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.serverdriven.api.ApiGenericAlert;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ErrorHandlingExtensions.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\f\u001a\u00020\t*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a$\u0010\u0010\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0016"}, m3636d2 = {"showAlert", "", "Landroidx/fragment/app/Fragment;", "alert", "Lcom/robinhood/models/serverdriven/db/GenericAlert;", "dialogTag", "", "handleError", "errorData", "Lcom/robinhood/android/growth/model/ErrorData;", "dialogId", "", "toErrorData", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "showAsDialog", "activity", "Landroid/app/Activity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getGenericAlert", "lib-growth_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.growth.util.ErrorHandlingExtensionsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ErrorHandlingExtensions {
    public static final void showAlert(Fragment fragment, GenericAlert alert, String dialogTag) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(dialogTag, "dialogTag");
        ClientComponentAlertFragment clientComponentAlertFragment = (ClientComponentAlertFragment) ClientComponentAlertFragment.INSTANCE.createDialogFragment((DialogFragmentKey) new LegacyDialogFragmentKey.ClientComponentAlert(alert, false, true, 0, 10, (DefaultConstructorMarker) null));
        clientComponentAlertFragment.setCancelable(false);
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        clientComponentAlertFragment.show(childFragmentManager, dialogTag);
    }

    public static final void handleError(Fragment fragment, ErrorData errorData, int i, String dialogTag) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        Intrinsics.checkNotNullParameter(dialogTag, "dialogTag");
        if (errorData.getAlert() != null) {
            showAlert(fragment, errorData.getAlert(), dialogTag);
        }
        Throwable error = errorData.getError();
        if (error != null) {
            FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            showAsDialog(error, fragmentActivityRequireActivity, parentFragmentManager, i);
        }
    }

    private static final GenericAlert getGenericAlert(Throwable th, LazyMoshi lazyMoshi) {
        HttpException httpException;
        Response<?> response;
        String strExtractErrorBodyString;
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = lazyMoshi.adapter(new TypeToken<ApiGenericAlert>() { // from class: com.robinhood.android.growth.util.ErrorHandlingExtensionsKt$getGenericAlert$$inlined$getAdapter$1
        }.getType());
        try {
            httpException = (HttpException) Throwables.findCause(th, HttpException.class);
        } catch (Exception unused) {
        }
        ApiGenericAlert apiGenericAlert = (httpException == null || (response = httpException.response()) == null || (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) == null) ? null : (ApiGenericAlert) jsonAdapterAdapter.fromJson(strExtractErrorBodyString);
        if (apiGenericAlert != null) {
            return apiGenericAlert.toDbModel();
        }
        return null;
    }

    public static final ErrorData toErrorData(Throwable th, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        GenericAlert genericAlert = getGenericAlert(th, moshi);
        if (genericAlert != null) {
            th = null;
        }
        return new ErrorData(genericAlert, th);
    }

    public static final void showAsDialog(Throwable th, Activity activity, FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (AbsErrorHandler.handleError$default(new ActivityErrorHandler(activity, true, i, null, 8, null), th, false, 2, null)) {
            return;
        }
        RhDialogFragment.Builder.show$default(RhDialogFragment.INSTANCE.create(activity).setId(i).setTitle(C18353R.string.redeem_gift_failed_dialog_title, new Object[0]).setMessage(C18353R.string.redeem_gift_failed_dialog_subtitle, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]), fragmentManager, "unexpected_error_dialog", false, 4, null);
    }
}
