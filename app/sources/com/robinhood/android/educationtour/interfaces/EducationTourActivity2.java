package com.robinhood.android.educationtour.interfaces;

import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.educationtour.C14469R;
import com.robinhood.android.educationtour.EducationTourOverlayFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTourActivity.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"showEducationTourOverlayFragment", "", "Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;", "screenName", "", "screenUniqueId", "educationTourCallbacks", "Lcom/robinhood/android/educationtour/interfaces/EducationTourCallbacks;", "isCrypto", "", "useTemporaryToolbar", "noSkip", "hideEducationTourOverlayFragment", EducationTourOverlayFragment.EDUCATION_TOUR_OVERLAY_TAG, "Landroidx/fragment/app/Fragment;", "getEducationTourOverlayFragment", "(Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;)Landroidx/fragment/app/Fragment;", "lib-education-tour_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.educationtour.interfaces.EducationTourActivityKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EducationTourActivity2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showEducationTourOverlayFragment(EducationTourActivity educationTourActivity, String screenName, String str, EducationTourCallbacks educationTourCallbacks, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(educationTourActivity, "<this>");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        if (!(educationTourActivity instanceof AppCompatActivity)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (getEducationTourOverlayFragment(educationTourActivity) == null) {
            FragmentActivity fragmentActivity = (FragmentActivity) educationTourActivity;
            if (fragmentActivity.getSupportFragmentManager().isStateSaved()) {
                return;
            }
            EducationTourOverlayFragment educationTourOverlayFragment = (EducationTourOverlayFragment) EducationTourOverlayFragment.INSTANCE.newInstance((Parcelable) new EducationTourOverlayFragment.Args(screenName, str, z, z2, z3));
            educationTourOverlayFragment.setCallbacks(educationTourCallbacks);
            fragmentActivity.getSupportFragmentManager().beginTransaction().setTransition(4099).add(C14469R.id.education_tour_container, educationTourOverlayFragment, EducationTourOverlayFragment.EDUCATION_TOUR_OVERLAY_TAG).commit();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void hideEducationTourOverlayFragment(EducationTourActivity educationTourActivity) {
        Intrinsics.checkNotNullParameter(educationTourActivity, "<this>");
        if (!(educationTourActivity instanceof AppCompatActivity)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Fragment educationTourOverlayFragment = getEducationTourOverlayFragment(educationTourActivity);
        if (educationTourOverlayFragment != null) {
            ((FragmentActivity) educationTourActivity).getSupportFragmentManager().beginTransaction().remove(educationTourOverlayFragment).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment getEducationTourOverlayFragment(EducationTourActivity educationTourActivity) {
        Intrinsics.checkNotNull(educationTourActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return ((AppCompatActivity) educationTourActivity).getSupportFragmentManager().findFragmentByTag(EducationTourOverlayFragment.EDUCATION_TOUR_OVERLAY_TAG);
    }
}
