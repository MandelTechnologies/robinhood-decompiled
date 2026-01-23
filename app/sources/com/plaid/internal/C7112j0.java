package com.plaid.internal;

import android.content.Context;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.google.gson.Gson;
import com.plaid.internal.core.crashreporting.internal.CrashUploadWorker;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.j0 */
/* loaded from: classes16.dex */
public final class C7112j0 {

    /* renamed from: a */
    public final Context f2864a;

    /* renamed from: b */
    public final C7082g0 f2865b;

    /* renamed from: c */
    public final AbstractC5974U<?> f2866c;

    /* renamed from: d */
    public final CrashApiOptions f2867d;

    /* renamed from: e */
    public final Gson f2868e;

    public C7112j0(Context application, C7082g0 crashStorage, AbstractC5974U<?> crashApiClass, CrashApiOptions crashApiOptions) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashStorage, "crashStorage");
        Intrinsics.checkNotNullParameter(crashApiClass, "crashApiClass");
        Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
        this.f2864a = application;
        this.f2865b = crashStorage;
        this.f2866c = crashApiClass;
        this.f2867d = crashApiOptions;
        this.f2868e = new Gson();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1534a(Crash crash, ContinuationImpl continuationImpl) throws Throwable {
        C7102i0 c7102i0;
        C7112j0 c7112j0;
        if (continuationImpl instanceof C7102i0) {
            c7102i0 = (C7102i0) continuationImpl;
            int i = c7102i0.f2844d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7102i0.f2844d = i - Integer.MIN_VALUE;
            } else {
                c7102i0 = new C7102i0(this, continuationImpl);
            }
        }
        Object obj = c7102i0.f2842b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7102i0.f2844d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c7102i0.f2841a = this;
            c7102i0.f2844d = 1;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C7072f0(this.f2865b, new Crash[]{crash}, null), c7102i0);
            if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objWithContext = Unit.INSTANCE;
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            c7112j0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7112j0 = c7102i0.f2841a;
            ResultKt.throwOnFailure(obj);
        }
        c7112j0.getClass();
        Data dataBuild = new Data.Builder().putString("crashesApiClass", c7112j0.f2866c.f1733a).putString("crashOptions", c7112j0.f2868e.toJson(c7112j0.f2867d)).build();
        Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
        WorkManager.getInstance(c7112j0.f2864a).enqueue(new OneTimeWorkRequest.Builder(CrashUploadWorker.class).setInputData(dataBuild).build());
        return Unit.INSTANCE;
    }
}
