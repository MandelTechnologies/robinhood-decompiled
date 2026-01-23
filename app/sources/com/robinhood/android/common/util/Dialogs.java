package com.robinhood.android.common.util;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dialogs.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/util/Dialogs;", "", "<init>", "()V", "showMfaVerificationResentDialog", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "phoneNumber", "", "useDesignSystemStyle", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class Dialogs {
    public static final int $stable = 0;
    public static final Dialogs INSTANCE = new Dialogs();

    private Dialogs() {
    }

    @JvmStatic
    public static final void showMfaVerificationResentDialog(FragmentActivity activity, String phoneNumber, boolean useDesignSystemStyle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(activity).setTitle(C11048R.string.setting_mfa_sms_verify_resend_confirmation_title, new Object[0]).setUseDesignSystemOverlay(useDesignSystemStyle).setMessage(C11048R.string.setting_mfa_sms_verify_resend_confirmation_summary, phoneNumber).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "mfaVerificationResentialog", false, 4, null);
    }
}
