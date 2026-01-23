package com.robinhood.android.lib.breadcrumbs;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportBreadcrumb.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, m3636d2 = {"typesString", "", "", "Lcom/robinhood/android/lib/breadcrumbs/GenericSupportBreadcrumb;", "lib-breadcrumbs_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SupportBreadcrumb5 {
    public static final String typesString(List<? extends SupportBreadcrumb2> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportBreadcrumb5.typesString$lambda$0((SupportBreadcrumb2) obj);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence typesString$lambda$0(SupportBreadcrumb2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType().getServerValue();
    }
}
