package com.robinhood.android.educationtour.extensions;

import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.educationtour.EducationTourOverlayFragment;
import com.robinhood.android.educationtour.interfaces.EducationTourActivity;
import com.robinhood.android.educationtour.interfaces.EducationTourActivity2;
import com.robinhood.android.educationtour.interfaces.EducationTourCallbacks;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragments.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\r\"\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"showEducationTour", "", "Lcom/robinhood/android/common/ui/BaseFragment;", "screenName", "", "screenUniqueId", "callbacks", "Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "useTemporaryToolbar", "", "noSkip", "educationTourActivity", "Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;", "Landroidx/fragment/app/Fragment;", "getEducationTourActivity", "(Landroidx/fragment/app/Fragment;)Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;", "hideEducationTour", "lib-education-tour_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.educationtour.extensions.BaseFragmentsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BaseFragments3 {
    public static /* synthetic */ void showEducationTour$default(BaseFragment baseFragment, String str, String str2, EducationTourCallbacks educationTourCallbacks, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            educationTourCallbacks = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        showEducationTour(baseFragment, str, str2, educationTourCallbacks, z, z2);
    }

    public static final void showEducationTour(final BaseFragment baseFragment, String screenName, String str, EducationTourCallbacks educationTourCallbacks, boolean z, boolean z2) {
        final EducationTourCallbacks educationTourCallbacks2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        EducationTourActivity educationTourActivity = getEducationTourActivity(baseFragment);
        if (educationTourActivity != null) {
            educationTourCallbacks2 = educationTourCallbacks;
            EducationTourActivity2.showEducationTourOverlayFragment(educationTourActivity, screenName, str, educationTourCallbacks2, baseFragment.getIsCrypto(), z, z2);
        } else {
            educationTourCallbacks2 = educationTourCallbacks;
        }
        FragmentActivity activity = baseFragment.getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.addCallback(baseFragment, new OnBackPressedCallback() { // from class: com.robinhood.android.educationtour.extensions.BaseFragmentsKt.showEducationTour.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentManager supportFragmentManager;
                FragmentActivity activity2 = baseFragment.getActivity();
                Fragment fragmentFindFragmentByTag = (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag(EducationTourOverlayFragment.EDUCATION_TOUR_OVERLAY_TAG);
                EducationTourOverlayFragment educationTourOverlayFragment = fragmentFindFragmentByTag instanceof EducationTourOverlayFragment ? (EducationTourOverlayFragment) fragmentFindFragmentByTag : null;
                if (educationTourOverlayFragment != null) {
                    educationTourOverlayFragment.logBackPressed();
                }
                BaseFragments3.hideEducationTour(baseFragment);
                EducationTourCallbacks educationTourCallbacks3 = educationTourCallbacks2;
                if (educationTourCallbacks3 != null) {
                    educationTourCallbacks3.onHideEducationTour();
                }
                remove();
            }
        });
    }

    private static final EducationTourActivity getEducationTourActivity(Fragment fragment) {
        KeyEventDispatcher.Component activity = fragment.getActivity();
        if (activity instanceof EducationTourActivity) {
            return (EducationTourActivity) activity;
        }
        return null;
    }

    public static final void hideEducationTour(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        EducationTourActivity educationTourActivity = getEducationTourActivity(fragment);
        if (educationTourActivity != null) {
            EducationTourActivity2.hideEducationTourOverlayFragment(educationTourActivity);
        }
    }
}
