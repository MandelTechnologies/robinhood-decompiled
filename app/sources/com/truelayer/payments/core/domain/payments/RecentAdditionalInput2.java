package com.truelayer.payments.core.domain.payments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecentAdditionalInput.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m3636d2 = {"mapDistinct", "", "", "", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.domain.payments.RecentAdditionalInputKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RecentAdditionalInput2 {
    public static final Map<String, List<RecentAdditionalInput>> mapDistinct(List<RecentAdditionalInput> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<RecentAdditionalInput> list2 = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (hashSet.add(((RecentAdditionalInput) obj).getInputId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((RecentAdditionalInput) it.next()).getInputId());
        }
        Set<String> set = CollectionsKt.toSet(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : set) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                if (Intrinsics.areEqual(((RecentAdditionalInput) obj2).getInputId(), str)) {
                    arrayList3.add(obj2);
                }
            }
            linkedHashMap.put(str, CollectionsKt.toList(arrayList3));
        }
        return linkedHashMap;
    }
}
