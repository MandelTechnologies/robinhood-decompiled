package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.plaid.internal.AbstractC5974U;
import com.plaid.internal.AbstractC6010Y;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptionsKt;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import java.io.File;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.V4 */
/* loaded from: classes16.dex */
public final class C5988V4 {

    /* renamed from: a */
    public final C5826D6 f1767a;

    /* renamed from: b */
    public final C6029a0 f1768b;

    /* renamed from: c */
    public final C7112j0 f1769c;

    public C5988V4(Application context, SentryProject.LinkSdk sentryProject, String sdkVersion, AbstractC6010Y.a crashProvider, C7252x5 retrofitFactory, C7077f5 environmentProvider, C5885K2 crashInterceptor) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sentryProject, "sentryProject");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(crashProvider, "crashProvider");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(environmentProvider, "environmentProvider");
        Intrinsics.checkNotNullParameter(crashInterceptor, "crashInterceptor");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CrashApiOptions crashApiOptions = CrashApiOptionsKt.toCrashOptions(sentryProject, resources, sdkVersion);
        C5983V c5983v = new C5983V(retrofitFactory);
        crashProvider.getClass();
        AbstractC5974U.a crashApiClass = AbstractC6010Y.a.f1842b;
        Intrinsics.checkNotNullParameter(crashApiClass, "crashApiClass");
        C5826D6 c5826d6M1329a = c5983v.m1329a(crashApiClass.f1733a);
        this.f1767a = c5826d6M1329a;
        Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
        c5826d6M1329a.f1325c = crashApiOptions;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        C6029a0 crashReportFactory = new C6029a0(applicationContext, crashApiOptions, environmentProvider);
        this.f1768b = crashReportFactory;
        Context application = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(application, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashReportFactory, "crashReportFactory");
        File filesDir = application.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        C7082g0 c7082g0 = new C7082g0(new C6044b5(filesDir, "plaid-sdk/crashes"), crashReportFactory);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        C7112j0 c7112j0 = new C7112j0(applicationContext2, c7082g0, crashApiClass, crashApiOptions);
        this.f1769c = c7112j0;
        new C5961S4(crashReportFactory, c7112j0, crashInterceptor).m1311a();
    }

    /* renamed from: a */
    public final void m1331a(AbstractC5992W crumb) {
        Breadcrumb crumb2;
        Intrinsics.checkNotNullParameter(crumb, "crumb");
        C6029a0 c6029a0 = this.f1768b;
        if (crumb instanceof C6005X3) {
            C6005X3 c6005x3 = (C6005X3) crumb;
            crumb2 = new Breadcrumb(Breadcrumb.Type.NAVIGATION, crumb.f1786a, AbstractC5992W.m1336a(c6005x3.f1822d), c6005x3.f1820b, null, c6005x3.f1821c, 16, null);
        } else {
            if (!(crumb instanceof C7266z1)) {
                throw new NoWhenBranchMatchedException();
            }
            Breadcrumb.Type type2 = Breadcrumb.Type.DEFAULT;
            C7266z1 c7266z1 = (C7266z1) crumb;
            String str = c7266z1.f3335b;
            Map<String, String> map = c7266z1.f3336c;
            int i = c7266z1.f3337d;
            Map mutableMap = MapsKt.toMutableMap(map);
            mutableMap.put("level", AbstractC5992W.m1336a(i).name());
            crumb2 = new Breadcrumb(type2, crumb.f1786a, AbstractC5992W.m1336a(c7266z1.f3337d), str, null, mutableMap, 16, null);
        }
        c6029a0.getClass();
        Intrinsics.checkNotNullParameter(crumb2, "crumb");
        C7234v6<Breadcrumb> c7234v6 = c6029a0.f1891e;
        if (c7234v6.f3244a.get(c7234v6.f3246c) != null) {
            c7234v6.f3245b = (c7234v6.f3245b + 1) % 50;
        }
        c7234v6.f3244a.set(c7234v6.f3246c, crumb2);
        c7234v6.f3246c = (c7234v6.f3246c + 1) % 50;
        int i2 = c7234v6.f3247d;
        if (i2 != 50) {
            c7234v6.f3247d = i2 + 1;
        }
    }
}
