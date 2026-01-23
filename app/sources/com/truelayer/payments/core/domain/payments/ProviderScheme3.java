package com.truelayer.payments.core.domain.payments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProviderScheme.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m3636d2 = {"toSchemeIdList", "", "", "Lcom/truelayer/payments/core/domain/payments/ProviderScheme;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.domain.payments.ProviderSchemeKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ProviderScheme3 {
    public static final List<String> toSchemeIdList(List<ProviderScheme> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ProviderScheme> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProviderScheme) it.next()).getId());
        }
        return arrayList;
    }
}
