package com.plaid.internal;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.g0 */
/* loaded from: classes16.dex */
public final class C7082g0 {

    /* renamed from: a */
    public final C6044b5 f2786a;

    /* renamed from: b */
    public final C6029a0 f2787b;

    /* renamed from: c */
    public final Gson f2788c;

    /* renamed from: d */
    public final Type f2789d;

    public C7082g0(C6044b5 storage, C6029a0 crashReportFactory) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
        this.f2786a = storage;
        this.f2787b = crashReportFactory;
        this.f2788c = new Gson();
        this.f2789d = new C6039b0().getType();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1509a(C7082g0 c7082g0, String str, Type type2, ContinuationImpl continuationImpl) throws JsonSyntaxException {
        C7062e0 c7062e0;
        if (continuationImpl instanceof C7062e0) {
            c7062e0 = (C7062e0) continuationImpl;
            int i = c7062e0.f2740e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7062e0.f2740e = i - Integer.MIN_VALUE;
            } else {
                c7062e0 = new C7062e0(c7082g0, continuationImpl);
            }
        }
        Object objWithContext = c7062e0.f2738c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c7062e0.f2740e;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            C6044b5 c6044b5 = c7082g0.f2786a;
            c7062e0.f2736a = c7082g0;
            c7062e0.f2737b = type2;
            c7062e0.f2740e = 1;
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C6015Y4(c6044b5, str, null), c7062e0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            type2 = c7062e0.f2737b;
            c7082g0 = c7062e0.f2736a;
            ResultKt.throwOnFailure(objWithContext);
        }
        Object objFromJson = c7082g0.f2788c.fromJson((String) objWithContext, type2);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return objFromJson;
    }

    /* renamed from: a */
    public static String m1510a() {
        return UUID.randomUUID() + ".txt";
    }
}
