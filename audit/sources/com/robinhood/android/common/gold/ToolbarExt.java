package com.robinhood.android.common.gold;

import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ToolbarExt.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t\u001a.\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\u000f"}, m3636d2 = {"configureToolbarWithSegmentActivity", "", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "initialProgressBarSegmentIdx", "", "initialProgressBarSegmentProgress", "", "progressBarNumSegments", "progressBarVisible", "", "configureToolbarWithSegmentProgress", "progressBarSegmentIdx", "progressBarSegmentProgress", "titleContent", "", "feature-lib-gold_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.gold.ToolbarExtKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ToolbarExt {
    public static /* synthetic */ void configureToolbarWithSegmentActivity$default(RhToolbar rhToolbar, int i, float f, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = true;
        }
        configureToolbarWithSegmentActivity(rhToolbar, i, f, i2, z);
    }

    public static final void configureToolbarWithSegmentActivity(RhToolbar rhToolbar, int i, float f, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        RdsSegmentedProgressBar progressBar = rhToolbar.getProgressBar();
        progressBar.setVisibility(z ? 0 : 8);
        if (z) {
            progressBar.setNumSegments(i2);
            progressBar.setProgress(i, f, false);
        }
    }

    public static /* synthetic */ void configureToolbarWithSegmentProgress$default(RhToolbar rhToolbar, int i, float f, String str, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        configureToolbarWithSegmentProgress(rhToolbar, i, f, str, z);
    }

    public static final void configureToolbarWithSegmentProgress(RhToolbar rhToolbar, int i, float f, String str, boolean z) {
        Intrinsics.checkNotNullParameter(rhToolbar, "<this>");
        rhToolbar.getProgressBar().setVisibility(z ? 0 : 8);
        if (z) {
            rhToolbar.setTitle(str);
            rhToolbar.getProgressBar().setProgress(i, f, true);
        }
    }
}
