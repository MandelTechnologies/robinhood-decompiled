package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import com.plaid.internal.C5807B5;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.v5 */
/* loaded from: classes16.dex */
public final class C7233v5 implements Factory<C5807B5> {

    /* renamed from: a */
    public final Factory f3243a;

    public C7233v5(C7117j5 c7117j5, Factory factory) {
        this.f3243a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application context = (Application) this.f3243a.get();
        Intrinsics.checkNotNullParameter(context, "application");
        C5807B5.a aVar = C5807B5.f1277b;
        Intrinsics.checkNotNullParameter(context, "context");
        C5807B5 c5807b5 = C5807B5.f1278c;
        if (c5807b5 == null) {
            synchronized (aVar) {
                c5807b5 = C5807B5.f1278c;
                if (c5807b5 == null) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    c5807b5 = new C5807B5(applicationContext);
                    C5807B5.f1278c = c5807b5;
                }
            }
        }
        return (C5807B5) Preconditions.checkNotNullFromProvides(c5807b5);
    }
}
