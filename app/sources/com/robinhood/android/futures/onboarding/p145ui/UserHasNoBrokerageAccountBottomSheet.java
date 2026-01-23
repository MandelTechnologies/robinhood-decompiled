package com.robinhood.android.futures.onboarding.p145ui;

import android.content.res.Resources;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.futures.onboarding.C17293R;
import com.robinhood.android.libdesignsystem.C20690R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserHasNoBrokerageAccountBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"NO_BROKERAGE_ACCOUNT_DIALOG_ID", "", "showUserHasNoBrokerageAccountBottomSheet", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment;", "res", "Landroid/content/res/Resources;", "isEventsContracts", "", "feature-futures-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.UserHasNoBrokerageAccountBottomSheetKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class UserHasNoBrokerageAccountBottomSheet {
    public static final int NO_BROKERAGE_ACCOUNT_DIALOG_ID = 73462;

    public static final RhBottomSheetDialogFragment showUserHasNoBrokerageAccountBottomSheet(Resources res, boolean z) {
        String string2;
        Intrinsics.checkNotNullParameter(res, "res");
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        String string3 = res.getString(C17293R.string.futures_error_no_brokerage_account_title);
        if (z) {
            string2 = res.getString(C17293R.string.futures_error_no_brokerage_account_body_events);
        } else {
            string2 = res.getString(C17293R.string.futures_error_no_brokerage_account_body);
        }
        return (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(NO_BROKERAGE_ACCOUNT_DIALOG_ID, string3, null, string2, null, res.getString(C11048R.string.general_label_sign_up), null, res.getString(C11048R.string.general_label_dismiss), Integer.valueOf(C20690R.drawable.pict_mono_rds_documents), false, false, null, null, null, false, true, false, false, null, Boolean.FALSE, null, 1539668, null));
    }
}
