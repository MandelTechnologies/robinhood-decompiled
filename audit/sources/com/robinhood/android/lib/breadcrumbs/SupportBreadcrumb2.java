package com.robinhood.android.lib.breadcrumbs;

import kotlin.Metadata;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SupportBreadcrumb.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "", "type", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", "getType", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumbType;", ErrorBundle.DETAIL_ENTRY, "getDetails", "()Ljava/lang/Object;", "source", "", "getSource", "()Ljava/lang/String;", "lib-breadcrumbs_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.breadcrumbs.GenericSupportBreadcrumb, reason: use source file name */
/* loaded from: classes8.dex */
public interface SupportBreadcrumb2 {
    Object getDetails();

    String getSource();

    SupportBreadcrumbType getType();
}
