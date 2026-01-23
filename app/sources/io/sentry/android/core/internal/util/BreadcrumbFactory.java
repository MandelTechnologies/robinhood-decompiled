package io.sentry.android.core.internal.util;

import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;

/* loaded from: classes21.dex */
public class BreadcrumbFactory {
    public static Breadcrumb forSession(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("session");
        breadcrumb.setData("state", str);
        breadcrumb.setCategory("app.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        return breadcrumb;
    }
}
