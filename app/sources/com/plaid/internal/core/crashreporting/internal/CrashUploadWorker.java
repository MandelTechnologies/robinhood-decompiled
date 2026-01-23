package com.plaid.internal.core.crashreporting.internal;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.gson.Gson;
import com.plaid.internal.C5826D6;
import com.plaid.internal.C5983V;
import com.plaid.internal.C6029a0;
import com.plaid.internal.C6044b5;
import com.plaid.internal.C6049c0;
import com.plaid.internal.C7052d0;
import com.plaid.internal.C7082g0;
import com.plaid.internal.C7092h0;
import com.plaid.internal.C7252x5;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/plaid/internal/core/crashreporting/internal/CrashUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "crash-reporting_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class CrashUploadWorker extends CoroutineWorker {

    /* renamed from: a */
    public final C7252x5 f1952a;

    /* renamed from: b */
    public final Gson f1953b;

    @DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker", m3645f = "CrashUploadWorker.kt", m3646l = {35}, m3647m = "doWork")
    /* renamed from: com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$a */
    public static final class C6058a extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f1954a;

        /* renamed from: c */
        public int f1956c;

        public C6058a(Continuation<? super C6058a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.f1954a = obj;
            this.f1956c |= Integer.MIN_VALUE;
            return CrashUploadWorker.this.doWork(this);
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$doWork$2", m3645f = "CrashUploadWorker.kt", m3646l = {36, 39, 40}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.core.crashreporting.internal.CrashUploadWorker$b */
    public static final class C6059b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {

        /* renamed from: a */
        public List f1957a;

        /* renamed from: b */
        public int f1958b;

        /* renamed from: c */
        public final /* synthetic */ C7082g0 f1959c;

        /* renamed from: d */
        public final /* synthetic */ C5826D6 f1960d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6059b(C7082g0 c7082g0, C5826D6 c5826d6, Continuation continuation) {
            super(2, continuation);
            this.f1959c = c7082g0;
            this.f1960d = c5826d6;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C6059b(this.f1959c, this.f1960d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
            return new C6059b(this.f1959c, this.f1960d, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r7.m1179a(r1, r6) != r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1958b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7082g0 c7082g0 = this.f1959c;
                this.f1958b = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new C7052d0(c7082g0, null), this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ListenableWorker.Result.success();
                }
                list = this.f1957a;
                ResultKt.throwOnFailure(obj);
                C5826D6 c5826d6 = this.f1960d;
                this.f1957a = null;
                this.f1958b = 3;
            }
            list = (List) obj;
            C7082g0 c7082g02 = this.f1959c;
            this.f1957a = list;
            this.f1958b = 2;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C6049c0(c7082g02, null), this);
            if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objWithContext = Unit.INSTANCE;
            }
            if (objWithContext != coroutine_suspended) {
                C5826D6 c5826d62 = this.f1960d;
                this.f1957a = null;
                this.f1958b = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrashUploadWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        this.f1952a = C7252x5.f3298d.m1655a(null);
        this.f1953b = new Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C6058a c6058a;
        if (continuation instanceof C6058a) {
            c6058a = (C6058a) continuation;
            int i = c6058a.f1956c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6058a.f1956c = i - Integer.MIN_VALUE;
            } else {
                c6058a = new C6058a(continuation);
            }
        }
        Object objWithContext = c6058a.f1954a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c6058a.f1956c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            Data inputData = getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
            C5826D6 c5826d6M1329a = new C5983V(this.f1952a).m1329a(inputData.getString("crashesApiClass"));
            CrashApiOptions crashApiOptions = (CrashApiOptions) this.f1953b.fromJson(inputData.getString("crashOptions"), CrashApiOptions.class);
            if (crashApiOptions == null) {
                throw new IllegalArgumentException("No crash options provided");
            }
            Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
            c5826d6M1329a.f1325c = crashApiOptions;
            Context application = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(application, "getApplicationContext(...)");
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Data inputData2 = getInputData();
            Intrinsics.checkNotNullExpressionValue(inputData2, "getInputData(...)");
            CrashApiOptions crashApiOptions2 = (CrashApiOptions) this.f1953b.fromJson(inputData2.getString("crashOptions"), CrashApiOptions.class);
            if (crashApiOptions2 == null) {
                throw new IllegalArgumentException("No crash options provided");
            }
            C6029a0 crashReportFactory = new C6029a0(applicationContext, crashApiOptions2, C7092h0.f2823a);
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
            File filesDir = application.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
            C7082g0 c7082g0 = new C7082g0(new C6044b5(filesDir, "plaid-sdk/crashes"), crashReportFactory);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C6059b c6059b = new C6059b(c7082g0, c5826d6M1329a, null);
            c6058a.f1956c = 1;
            objWithContext = BuildersKt.withContext(io2, c6059b, c6058a);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }
}
