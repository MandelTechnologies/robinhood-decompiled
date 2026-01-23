package com.robinhood.android.educationtour.interfaces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.view.ComponentActivity;
import com.robinhood.android.educationtour.EducationTourOverlayFragment;
import com.robinhood.tooltips.TooltipActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationTourActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;", "Lcom/robinhood/tooltips/TooltipActivity;", "handleBackPressed", "", "lib-education-tour_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface EducationTourActivity extends TooltipActivity {
    boolean handleBackPressed();

    /* compiled from: EducationTourActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean handleBackPressed(EducationTourActivity educationTourActivity) {
            if (educationTourActivity instanceof AppCompatActivity) {
                if (EducationTourActivity2.getEducationTourOverlayFragment(educationTourActivity) == null) {
                    return false;
                }
                Fragment educationTourOverlayFragment = EducationTourActivity2.getEducationTourOverlayFragment(educationTourActivity);
                EducationTourOverlayFragment educationTourOverlayFragment2 = educationTourOverlayFragment instanceof EducationTourOverlayFragment ? (EducationTourOverlayFragment) educationTourOverlayFragment : null;
                Boolean boolValueOf = educationTourOverlayFragment2 != null ? Boolean.valueOf(educationTourOverlayFragment2.getIsShowingOutro()) : null;
                ((ComponentActivity) educationTourActivity).getOnBackPressedDispatcher().onBackPressed();
                return Intrinsics.areEqual(boolValueOf, Boolean.FALSE);
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
