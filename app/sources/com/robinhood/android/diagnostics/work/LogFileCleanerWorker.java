package com.robinhood.android.diagnostics.work;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.robinhood.android.diagnostics.event.annotation.DiagnosticEvents;
import com.robinhood.android.diagnostics.file.LogFileManager;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.work.PeriodicWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LogFileCleanerWorker.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "logFileManager", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "getLogFileManager", "()Lcom/robinhood/android/diagnostics/file/LogFileManager;", "setLogFileManager", "(Lcom/robinhood/android/diagnostics/file/LogFileManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WorkerEntryPoint", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class LogFileCleanerWorker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @DiagnosticEvents
    public LogFileManager logFileManager;

    /* compiled from: LogFileCleanerWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker$WorkerEntryPoint;", "", "inject", "", "worker", "Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface WorkerEntryPoint {
        void inject(LogFileCleanerWorker worker);
    }

    /* compiled from: LogFileCleanerWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.work.LogFileCleanerWorker", m3645f = "LogFileCleanerWorker.kt", m3646l = {27}, m3647m = "doWork")
    /* renamed from: com.robinhood.android.diagnostics.work.LogFileCleanerWorker$doWork$1 */
    static final class C140421 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C140421(Continuation<? super C140421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogFileCleanerWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogFileCleanerWorker(Context context, WorkerParameters params) {
        ComponentCallbacks2 componentCallbacks2;
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        ((WorkerEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
    }

    public final LogFileManager getLogFileManager() {
        LogFileManager logFileManager = this.logFileManager;
        if (logFileManager != null) {
            return logFileManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logFileManager");
        return null;
    }

    public final void setLogFileManager(LogFileManager logFileManager) {
        Intrinsics.checkNotNullParameter(logFileManager, "<set-?>");
        this.logFileManager = logFileManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C140421 c140421;
        if (continuation instanceof C140421) {
            c140421 = (C140421) continuation;
            int i = c140421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c140421.label = i - Integer.MIN_VALUE;
            } else {
                c140421 = new C140421(continuation);
            }
        }
        Object obj = c140421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c140421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            LogFileManager logFileManager = getLogFileManager();
            c140421.label = 1;
            if (logFileManager.deleteStaleFiles(c140421) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "success(...)");
        return resultSuccess;
    }

    /* compiled from: LogFileCleanerWorker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/work/LogFileCleanerWorker$Companion;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends PeriodicWorker {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super("rh_diagnostics_log_file_cleaner", LogFileCleanerWorker.class, 1L, TimeUnit.DAYS, null, null, null, 112, null);
        }
    }
}
