package com.robinhood.android.verification.email;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"showVerificationPrivacyDisclosure", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "tag", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "feature-lib-verification_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.verification.email.ActivityUtilsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ActivityUtils {
    public static final void showVerificationPrivacyDisclosure(BaseFragment baseFragment, String tag, AppType appType) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(appType, "appType");
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder title = companion.create(contextRequireContext).setId(C20682R.id.dialog_id_privacy_policy_disclosure).setTitle(C20682R.string.email_verification_privacy_disclosure, new Object[0]);
        Resources resources = baseFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder theme = title.setMessage(ResourceUtils.getEmailVerificationDisclosure(resources, appType)).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setTheme(C20682R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome_Onboarding);
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, tag, false, 4, null);
    }
}
