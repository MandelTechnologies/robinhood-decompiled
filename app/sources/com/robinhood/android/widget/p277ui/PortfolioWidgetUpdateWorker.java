package com.robinhood.android.widget.p277ui;

import android.app.PendingIntent;
import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.robinhood.android.widget.p277ui.PortfolioWidgetUpdateReceiver;
import com.robinhood.utils.logging.CrashReporter;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PortfolioWidgetUpdateWorker.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "updater", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "getUpdater", "()Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;", "setUpdater", "(Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdater;)V", "updateDispatcher", "Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "getUpdateDispatcher", "()Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;", "setUpdateDispatcher", "(Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateDispatcher;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PortfolioWidgetUpdateWorker extends Hammer_PortfolioWidgetUpdateWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String UNIQUE_WORK_NAME = "widget_update";
    public PortfolioWidgetUpdateDispatcher updateDispatcher;
    public PortfolioWidgetUpdater updater;

    /* compiled from: PortfolioWidgetUpdateWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.widget.ui.PortfolioWidgetUpdateWorker", m3645f = "PortfolioWidgetUpdateWorker.kt", m3646l = {30}, m3647m = "doWork")
    /* renamed from: com.robinhood.android.widget.ui.PortfolioWidgetUpdateWorker$doWork$1 */
    static final class C314821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C314821(Continuation<? super C314821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PortfolioWidgetUpdateWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioWidgetUpdateWorker(Context appContext, WorkerParameters params) {
        super(appContext, params, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public final PortfolioWidgetUpdater getUpdater() {
        PortfolioWidgetUpdater portfolioWidgetUpdater = this.updater;
        if (portfolioWidgetUpdater != null) {
            return portfolioWidgetUpdater;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updater");
        return null;
    }

    public final void setUpdater(PortfolioWidgetUpdater portfolioWidgetUpdater) {
        Intrinsics.checkNotNullParameter(portfolioWidgetUpdater, "<set-?>");
        this.updater = portfolioWidgetUpdater;
    }

    public final PortfolioWidgetUpdateDispatcher getUpdateDispatcher() {
        PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher = this.updateDispatcher;
        if (portfolioWidgetUpdateDispatcher != null) {
            return portfolioWidgetUpdateDispatcher;
        }
        Intrinsics.throwUninitializedPropertyAccessException("updateDispatcher");
        return null;
    }

    public final void setUpdateDispatcher(PortfolioWidgetUpdateDispatcher portfolioWidgetUpdateDispatcher) {
        Intrinsics.checkNotNullParameter(portfolioWidgetUpdateDispatcher, "<set-?>");
        this.updateDispatcher = portfolioWidgetUpdateDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C314821 c314821;
        if (continuation instanceof C314821) {
            c314821 = (C314821) continuation;
            int i = c314821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c314821.label = i - Integer.MIN_VALUE;
            } else {
                c314821 = new C314821(continuation);
            }
        }
        Object obj = c314821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c314821.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                PortfolioWidgetUpdater updater = getUpdater();
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                boolean z = getInputData().getBoolean("force", false);
                PortfolioWidgetUpdateReceiver.Companion companion = PortfolioWidgetUpdateReceiver.INSTANCE;
                Context applicationContext2 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                PendingIntent updatePendingIntent$feature_widget_externalDebug = companion.getUpdatePendingIntent$feature_widget_externalDebug(applicationContext2, true);
                c314821.label = 1;
                if (updater.handleUpdate(applicationContext, z, updatePendingIntent$feature_widget_externalDebug, c314821) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PortfolioWidgetUpdateDispatcher updateDispatcher = getUpdateDispatcher();
            Context applicationContext3 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
            updateDispatcher.scheduleUpdate(applicationContext3, false, false);
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            Intrinsics.checkNotNull(resultSuccess);
            return resultSuccess;
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
            ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
            Intrinsics.checkNotNull(resultRetry);
            return resultRetry;
        }
    }

    /* compiled from: PortfolioWidgetUpdateWorker.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/widget/ui/PortfolioWidgetUpdateWorker$Companion;", "", "<init>", "()V", "UNIQUE_WORK_NAME", "", "enqueueUnique", "Landroidx/work/Operation;", "context", "Landroid/content/Context;", "force", "", "initialDelayMs", "", "updatePeriodMs", "cancel", "feature-widget_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Operation enqueueUnique(Context context, boolean force, long initialDelayMs, long updatePeriodMs) {
            Intrinsics.checkNotNullParameter(context, "context");
            boolean z = initialDelayMs == 0;
            WorkManager workManager = WorkManager.getInstance(context);
            ExistingWorkPolicy existingWorkPolicy = z ? ExistingWorkPolicy.REPLACE : ExistingWorkPolicy.KEEP;
            OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder(PortfolioWidgetUpdateWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).setRequiresBatteryNotLow(!z).build());
            Tuples2[] tuples2Arr = {Tuples4.m3642to("force", Boolean.valueOf(force))};
            Data.Builder builder = new Data.Builder();
            Tuples2 tuples2 = tuples2Arr[0];
            builder.put((String) tuples2.getFirst(), tuples2.getSecond());
            Data dataBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
            OneTimeWorkRequest.Builder inputData = constraints.setInputData(dataBuild);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Operation operationEnqueueUniqueWork = workManager.enqueueUniqueWork(PortfolioWidgetUpdateWorker.UNIQUE_WORK_NAME, existingWorkPolicy, inputData.setInitialDelay(initialDelayMs, timeUnit).setBackoffCriteria(BackoffPolicy.LINEAR, updatePeriodMs, timeUnit).build());
            Intrinsics.checkNotNullExpressionValue(operationEnqueueUniqueWork, "enqueueUniqueWork(...)");
            return operationEnqueueUniqueWork;
        }

        public final Operation cancel(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Operation operationCancelUniqueWork = WorkManager.getInstance(context).cancelUniqueWork(PortfolioWidgetUpdateWorker.UNIQUE_WORK_NAME);
            Intrinsics.checkNotNullExpressionValue(operationCancelUniqueWork, "cancelUniqueWork(...)");
            return operationCancelUniqueWork;
        }
    }
}
