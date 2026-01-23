package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListRhListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005¨\u0006\t"}, m3636d2 = {"copyWithSelection", "", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter;", "filter", "filterId", "", "copyWithTooltip", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListViewState$Filter$Id;", "tooltipText", "feature-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListViewStateKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CuratedListRhListViewState3 {
    public static final List<CuratedListRhListViewState.Filter> copyWithSelection(List<CuratedListRhListViewState.Filter> list, CuratedListRhListViewState.Filter filter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        List<CuratedListRhListViewState.Filter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (CuratedListRhListViewState.Filter filter2 : list2) {
            arrayList.add(CuratedListRhListViewState.Filter.copy$default(filter2, null, 0, Intrinsics.areEqual(filter2.getId(), filter.getId()), null, null, 27, null));
        }
        return arrayList;
    }

    public static final List<CuratedListRhListViewState.Filter> copyWithSelection(List<CuratedListRhListViewState.Filter> list, String filterId) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        List<CuratedListRhListViewState.Filter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (CuratedListRhListViewState.Filter filter : list2) {
            arrayList.add(CuratedListRhListViewState.Filter.copy$default(filter, null, 0, Intrinsics.areEqual(filter.getId().getStringValue(), filterId), null, null, 27, null));
        }
        return arrayList;
    }

    public static final List<CuratedListRhListViewState.Filter> copyWithTooltip(List<CuratedListRhListViewState.Filter> list, CuratedListRhListViewState.Filter.InterfaceC20905Id filterId, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        List<CuratedListRhListViewState.Filter> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (CuratedListRhListViewState.Filter filterCopy$default : list2) {
            if (Intrinsics.areEqual(filterCopy$default.getId(), filterId)) {
                str2 = str;
                filterCopy$default = CuratedListRhListViewState.Filter.copy$default(filterCopy$default, null, 0, false, null, str2, 15, null);
            } else {
                str2 = str;
            }
            arrayList.add(filterCopy$default);
            str = str2;
        }
        return arrayList;
    }
}
