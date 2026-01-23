package com.plaid.internal;

import com.google.gson.GsonBuilder;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashContextTypeAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

@SourceDebugExtension
/* renamed from: com.plaid.internal.D6 */
/* loaded from: classes16.dex */
public final class C5826D6 {

    /* renamed from: a */
    public final C7252x5 f1323a;

    /* renamed from: b */
    public final Lazy f1324b;

    /* renamed from: c */
    public CrashApiOptions f1325c;

    /* renamed from: com.plaid.internal.D6$a */
    public static final class a extends Lambda implements Function0<InterfaceC5844F6> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC5844F6 invoke() {
            C7252x5 c7252x5 = C5826D6.this.f1323a;
            CrashApiOptions crashApiOptions = C5826D6.this.f1325c;
            if (crashApiOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                crashApiOptions = null;
            }
            return (InterfaceC5844F6) c7252x5.m1654a("https://analytics.plaid.com/sentry/api/" + crashApiOptions.getProjectId() + "/", new C5798A5(new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").registerTypeAdapter(CrashContext.class, new CrashContextTypeAdapter()).create(), 2)).create(InterfaceC5844F6.class);
        }
    }

    public C5826D6(C7252x5 retrofitFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        this.f1323a = retrofitFactory;
        this.f1324b = LazyKt.lazy(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1178a(Crash crash, ContinuationImpl continuationImpl) {
        C5799A6 c5799a6;
        if (continuationImpl instanceof C5799A6) {
            c5799a6 = (C5799A6) continuationImpl;
            int i = c5799a6.f1235c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5799a6.f1235c = i - Integer.MIN_VALUE;
            } else {
                c5799a6 = new C5799A6(this, continuationImpl);
            }
        }
        Object objM1194a = c5799a6.f1233a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5799a6.f1235c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objM1194a);
            Object value = this.f1324b.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            InterfaceC5844F6 interfaceC5844F6 = (InterfaceC5844F6) value;
            String strM1180a = m1180a();
            CrashApiOptions crashApiOptions = this.f1325c;
            if (crashApiOptions == null) {
                Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                crashApiOptions = null;
            }
            String apiKey = crashApiOptions.getApiKey();
            c5799a6.f1235c = 1;
            objM1194a = interfaceC5844F6.m1194a(strM1180a, apiKey, crash, c5799a6);
            if (objM1194a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM1194a);
        }
        return boxing.boxBoolean(!((AbstractC6043b4) objM1194a).m1370a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1179a(List list, ContinuationImpl continuationImpl) {
        C5808B6 c5808b6;
        ArrayList arrayList;
        if (continuationImpl instanceof C5808B6) {
            c5808b6 = (C5808B6) continuationImpl;
            int i = c5808b6.f1283d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5808b6.f1283d = i - Integer.MIN_VALUE;
            } else {
                c5808b6 = new C5808B6(this, continuationImpl);
            }
        }
        Object obj = c5808b6.f1281b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5808b6.f1283d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C5817C6 c5817c6 = new C5817C6(list, arrayList2, this, null);
            c5808b6.f1280a = arrayList2;
            c5808b6.f1283d = 1;
            if (BuildersKt.withContext(io2, c5817c6, c5808b6) == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c5808b6.f1280a;
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((AbstractC6043b4) obj2).m1370a()) {
                arrayList3.add(obj2);
            }
        }
        return boxing.boxBoolean(!CollectionsKt.any(arrayList3));
    }

    /* renamed from: a */
    public final String m1180a() {
        CrashApiOptions crashApiOptions = this.f1325c;
        if (crashApiOptions == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
            crashApiOptions = null;
        }
        return "Sentry sentry_version=6,sentry_key=" + crashApiOptions.getApiKey();
    }
}
