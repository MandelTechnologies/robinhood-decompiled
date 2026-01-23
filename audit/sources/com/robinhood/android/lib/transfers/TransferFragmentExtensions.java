package com.robinhood.android.lib.transfers;

import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.GenericAlertErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFragmentExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"TAG_CREATE_TRANSFER_FAILURE_ALERT", "", "handleCreateTransferError", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "throwable", "", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.transfers.TransferFragmentExtensionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TransferFragmentExtensions {
    public static final String TAG_CREATE_TRANSFER_FAILURE_ALERT = "createTransferFailureAlert";

    public static final void handleCreateTransferError(BaseFragment baseFragment, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(throwable);
        if (errorResponseExtractErrorResponse instanceof GenericAlertErrorResponse) {
            Navigator.DefaultImpls.createDialogFragment$default(baseFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(((GenericAlertErrorResponse) errorResponseExtractErrorResponse).getAlert(), false, false, 0, 14, (DefaultConstructorMarker) null), null, 2, null).show(baseFragment.getChildFragmentManager(), TAG_CREATE_TRANSFER_FAILURE_ALERT);
            return;
        }
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
    }
}
