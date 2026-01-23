package com.robinhood.android.common.util.extensions;

import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: Breadcrumbs.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"createBreadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", ErrorBundle.DETAIL_ENTRY, "", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.extensions.BreadcrumbsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Breadcrumbs2 {
    public static /* synthetic */ SupportBreadcrumb createBreadcrumb$default(UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable, SupportBreadcrumbType supportBreadcrumbType, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return createBreadcrumb(screenViewAnalyticable, supportBreadcrumbType, obj);
    }

    public static final SupportBreadcrumb createBreadcrumb(UiCallbacks.ScreenViewAnalyticable screenViewAnalyticable, SupportBreadcrumbType type2, Object obj) {
        Intrinsics.checkNotNullParameter(screenViewAnalyticable, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new SupportBreadcrumb(type2, obj, screenViewAnalyticable.getScreenName());
    }
}
