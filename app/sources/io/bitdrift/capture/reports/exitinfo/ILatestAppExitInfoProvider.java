package io.bitdrift.capture.reports.exitinfo;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import kotlin.Metadata;

/* compiled from: ILatestAppExitInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;", "", "get", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "activityManager", "Landroid/app/ActivityManager;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ILatestAppExitInfoProvider {
    @TargetApi(30)
    ILatestAppExitInfoProvider2 get(ActivityManager activityManager);
}
