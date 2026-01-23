package com.robinhood.android.odyssey.lib.utils;

import com.robinhood.android.designsystem.progress.RdsSegmentedProgressBar;
import com.robinhood.models.api.serverdrivenui.page.ApiSdNavigationHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ProgressBarUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"updateProgress", "", "progressBar", "Lcom/robinhood/android/designsystem/progress/RdsSegmentedProgressBar;", "progress", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdNavigationHeader$Progress;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.utils.ProgressBarUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ProgressBarUtils {
    public static final void updateProgress(RdsSegmentedProgressBar progressBar, ApiSdNavigationHeader.Progress progress) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(progress, "progress");
        float fCoerceIn = RangesKt.coerceIn(progress.getCurrent_section_progress() / 100.0f, 0.0f, 1.0f);
        progressBar.setNumSegments(progress.getSection_count());
        progressBar.setProgress(progress.getCurrent_section(), fCoerceIn, progressBar.getVisibility() == 0);
    }
}
