package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.Plaid;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.K2 */
/* loaded from: classes16.dex */
public final class C5885K2 {

    /* renamed from: a */
    public final C7121k0 f1424a;

    /* renamed from: b */
    public final List<String> f1425b;

    public C5885K2(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C7121k0 c7121k0 = new C7121k0();
        this.f1424a = c7121k0;
        this.f1425b = CollectionsKt.listOf(LinkActivity.class.getName());
        application.registerActivityLifecycleCallbacks(c7121k0);
    }

    /* renamed from: a */
    public final boolean m1230a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Activity activity = this.f1424a.f2886a.get();
        if (activity == null || !this.f1425b.contains(activity.getClass().getName())) {
            return false;
        }
        Plaid.INSTANCE.setLinkResultAndFinish$link_sdk_release(activity, 6148, C5876J2.m1228b(throwable, null));
        C7121k0 c7121k0 = this.f1424a;
        WeakReference<Activity> weakReference = new WeakReference<>(null);
        c7121k0.getClass();
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        c7121k0.f2886a = weakReference;
        return true;
    }
}
