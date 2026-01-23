package com.robinhood.android.maxonboarding;

import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ToolbarExt.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a-\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"configureMaxActivity", "", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "initProgress", "Lcom/robinhood/android/maxonboarding/OnboardingProgress;", "isFromRhfOnboarding", "", "configureMaxFragment", "progress", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "(Lcom/robinhood/android/common/ui/view/RhToolbar;Lcom/robinhood/android/maxonboarding/OnboardingProgress;Ljava/lang/Integer;Z)V", "feature-lib-max-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.maxonboarding.ToolbarExtKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ToolbarExt2 {
    public static /* synthetic */ void configureMaxActivity$default(RhToolbar rhToolbar, OnboardingProgress onboardingProgress, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        configureMaxActivity(rhToolbar, onboardingProgress, z);
    }

    public static final void configureMaxActivity(RhToolbar rhToolbar, OnboardingProgress initProgress, boolean z) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        Intrinsics.checkNotNullParameter(initProgress, "initProgress");
        RdsSegmentedProgressBar progressBar = rhToolbar.getProgressBar();
        progressBar.setVisibility(z ? 0 : 8);
        if (z) {
            progressBar.setNumSegments(5);
            progressBar.setProgress(initProgress.getSegmentIdx(), initProgress.getProgress(), false);
        }
    }

    public static /* synthetic */ void configureMaxFragment$default(RhToolbar rhToolbar, OnboardingProgress onboardingProgress, Integer num, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        configureMaxFragment(rhToolbar, onboardingProgress, num, z);
    }

    public static final void configureMaxFragment(RhToolbar rhToolbar, OnboardingProgress progress, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        Intrinsics.checkNotNullParameter(progress, "progress");
        rhToolbar.getProgressBar().setVisibility(z ? 0 : 8);
        if (z) {
            if (num != null) {
                rhToolbar.setTitle(num.intValue());
            }
            rhToolbar.getProgressBar().setProgress(progress.getSegmentIdx(), progress.getProgress(), true);
        }
    }
}
