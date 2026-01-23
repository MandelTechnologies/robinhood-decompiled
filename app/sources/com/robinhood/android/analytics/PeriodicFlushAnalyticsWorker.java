package com.robinhood.android.analytics;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import com.robinhood.analytics.Analytics;
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

/* compiled from: PeriodicFlushAnalyticsWorker.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/analytics/PeriodicFlushAnalyticsWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "analytics", "Lcom/robinhood/analytics/Analytics;", "getAnalytics", "()Lcom/robinhood/analytics/Analytics;", "setAnalytics", "(Lcom/robinhood/analytics/Analytics;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Provisions", "lib-analytics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class PeriodicFlushAnalyticsWorker extends Hammer_PeriodicFlushAnalyticsWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public Analytics analytics;

    /* compiled from: PeriodicFlushAnalyticsWorker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.analytics.PeriodicFlushAnalyticsWorker", m3645f = "PeriodicFlushAnalyticsWorker.kt", m3646l = {30}, m3647m = "doWork")
    /* renamed from: com.robinhood.android.analytics.PeriodicFlushAnalyticsWorker$doWork$1 */
    static final class C95241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C95241(Continuation<? super C95241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PeriodicFlushAnalyticsWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicFlushAnalyticsWorker(Context context, WorkerParameters params) {
        super(context, params, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public final Analytics getAnalytics() {
        Analytics analytics = this.analytics;
        if (analytics != null) {
            return analytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(Analytics analytics) {
        Intrinsics.checkNotNullParameter(analytics, "<set-?>");
        this.analytics = analytics;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C95241 c95241;
        ListenableWorker.Result resultRetry;
        String str;
        if (continuation instanceof C95241) {
            c95241 = (C95241) continuation;
            int i = c95241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c95241.label = i - Integer.MIN_VALUE;
            } else {
                c95241 = new C95241(continuation);
            }
        }
        Object objUploadAnalytics = c95241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c95241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadAnalytics);
            Analytics analytics = getAnalytics();
            c95241.label = 1;
            objUploadAnalytics = analytics.uploadAnalytics(c95241);
            if (objUploadAnalytics == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUploadAnalytics);
        }
        if (((Boolean) objUploadAnalytics).booleanValue()) {
            resultRetry = ListenableWorker.Result.success();
            str = "success(...)";
        } else {
            resultRetry = ListenableWorker.Result.retry();
            str = "retry(...)";
        }
        Intrinsics.checkNotNullExpressionValue(resultRetry, str);
        return resultRetry;
    }

    /* compiled from: PeriodicFlushAnalyticsWorker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/analytics/PeriodicFlushAnalyticsWorker$Companion;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "lib-analytics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends PeriodicWorker {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super("rh_periodic_flush_analytics_work", PeriodicFlushAnalyticsWorker.class, 12L, TimeUnit.HOURS, new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).setRequiresDeviceIdle(true).build(), ExistingPeriodicWorkPolicy.UPDATE, null, 64, null);
        }
    }

    /* compiled from: PeriodicFlushAnalyticsWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/analytics/PeriodicFlushAnalyticsWorker$Provisions;", "", "<init>", "()V", "provide", "Lcom/robinhood/work/PeriodicWorker;", "lib-analytics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Provisions {
        public static final Provisions INSTANCE = new Provisions();

        private Provisions() {
        }

        public final PeriodicWorker provide() {
            return PeriodicFlushAnalyticsWorker.INSTANCE;
        }
    }
}
