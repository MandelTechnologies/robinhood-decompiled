package com.robinhood.work;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.Operation;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PeriodicWorker.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/work/PeriodicWorker;", "", "workName", "", "workerClass", "Ljava/lang/Class;", "Landroidx/work/ListenableWorker;", "repeatIntervalTime", "", "repeatIntervalTimeUnit", "Ljava/util/concurrent/TimeUnit;", "constraints", "Landroidx/work/Constraints;", "policy", "Landroidx/work/ExistingPeriodicWorkPolicy;", "oldWorkName", "<init>", "(Ljava/lang/String;Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;Landroidx/work/Constraints;Landroidx/work/ExistingPeriodicWorkPolicy;Ljava/lang/String;)V", "schedule", "Lkotlin/Pair;", "Ljava/util/UUID;", "Landroidx/work/Operation;", "context", "Landroid/content/Context;", "cancel", "", "lib-work_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public class PeriodicWorker {
    private final Constraints constraints;
    private final String oldWorkName;
    private final ExistingPeriodicWorkPolicy policy;
    private final long repeatIntervalTime;
    private final TimeUnit repeatIntervalTimeUnit;
    private final String workName;
    private final Class<? extends ListenableWorker> workerClass;

    public PeriodicWorker(String workName, Class<? extends ListenableWorker> workerClass, long j, TimeUnit repeatIntervalTimeUnit, Constraints constraints, ExistingPeriodicWorkPolicy policy, String str) {
        Intrinsics.checkNotNullParameter(workName, "workName");
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.workName = workName;
        this.workerClass = workerClass;
        this.repeatIntervalTime = j;
        this.repeatIntervalTimeUnit = repeatIntervalTimeUnit;
        this.constraints = constraints;
        this.policy = policy;
        this.oldWorkName = str;
    }

    public /* synthetic */ PeriodicWorker(String str, Class cls, long j, TimeUnit timeUnit, Constraints constraints, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cls, j, timeUnit, (i & 16) != 0 ? null : constraints, (i & 32) != 0 ? ExistingPeriodicWorkPolicy.KEEP : existingPeriodicWorkPolicy, (i & 64) != 0 ? null : str2);
    }

    public final Tuples2<UUID, Operation> schedule(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WorkManager workManager = WorkManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        PeriodicWorkRequest.Builder builder = new PeriodicWorkRequest.Builder(this.workerClass, this.repeatIntervalTime, this.repeatIntervalTimeUnit);
        Constraints constraints = this.constraints;
        if (constraints != null) {
            builder.setConstraints(constraints);
        }
        PeriodicWorkRequest periodicWorkRequestBuild = builder.build();
        String str = this.oldWorkName;
        if (str != null) {
            workManager.cancelUniqueWork(str);
        }
        Operation operationEnqueueUniquePeriodicWork = workManager.enqueueUniquePeriodicWork(this.workName, this.policy, periodicWorkRequestBuild);
        Intrinsics.checkNotNullExpressionValue(operationEnqueueUniquePeriodicWork, "enqueueUniquePeriodicWork(...)");
        return Tuples4.m3642to(periodicWorkRequestBuild.getId(), operationEnqueueUniquePeriodicWork);
    }

    public final void cancel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WorkManager workManager = WorkManager.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        String str = this.oldWorkName;
        if (str != null) {
            workManager.cancelUniqueWork(str);
        }
        workManager.cancelUniqueWork(this.workName);
    }
}
