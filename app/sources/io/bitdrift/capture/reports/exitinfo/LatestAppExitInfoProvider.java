package io.bitdrift.capture.reports.exitinfo;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import androidx.work.impl.utils.ForceStopRunnable$$ExternalSyntheticApiModelOutline1;
import io.bitdrift.capture.reports.exitinfo.ILatestAppExitInfoProvider2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LatestAppExitInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/reports/exitinfo/LatestAppExitInfoProvider;", "Lio/bitdrift/capture/reports/exitinfo/ILatestAppExitInfoProvider;", "<init>", "()V", "Landroid/app/ActivityManager;", "activityManager", "Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "get", "(Landroid/app/ActivityManager;)Lio/bitdrift/capture/reports/exitinfo/LatestAppExitReasonResult;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class LatestAppExitInfoProvider implements ILatestAppExitInfoProvider {
    public static final LatestAppExitInfoProvider INSTANCE = new LatestAppExitInfoProvider();

    private LatestAppExitInfoProvider() {
    }

    @Override // io.bitdrift.capture.reports.exitinfo.ILatestAppExitInfoProvider
    @TargetApi(30)
    public ILatestAppExitInfoProvider2 get(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Object obj = null;
        try {
            List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
            Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
            Iterator it = historicalProcessExitReasons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m709m(next).getProcessName(), Application.getProcessName())) {
                    obj = next;
                    break;
                }
            }
            ApplicationExitInfo applicationExitInfoM709m = ForceStopRunnable$$ExternalSyntheticApiModelOutline1.m709m(obj);
            if (historicalProcessExitReasons.isEmpty()) {
                return ILatestAppExitInfoProvider2.Empty.INSTANCE;
            }
            if (applicationExitInfoM709m == null) {
                return ILatestAppExitInfoProvider2.ProcessNameNotFound.INSTANCE;
            }
            return new ILatestAppExitInfoProvider2.Valid(applicationExitInfoM709m);
        } catch (Throwable th) {
            return new ILatestAppExitInfoProvider2.Error("Failed to retrieve ProcessExitReasons from ActivityManager", th);
        }
    }
}
