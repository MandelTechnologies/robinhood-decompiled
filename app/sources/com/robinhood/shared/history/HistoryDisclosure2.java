package com.robinhood.shared.history;

import android.content.res.Resources;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HistoryDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toParagraph", "", "", "Lcom/robinhood/shared/history/HistoryDisclosure;", "resources", "Landroid/content/res/Resources;", "lib-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.HistoryDisclosureKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class HistoryDisclosure2 {
    public static final CharSequence toParagraph(Collection<? extends HistoryDisclosure> collection, Resources resources) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        List listSortedWith = CollectionsKt.sortedWith(collection, new Comparator() { // from class: com.robinhood.shared.history.HistoryDisclosureKt$toParagraph$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((HistoryDisclosure) t).ordinal()), Integer.valueOf(((HistoryDisclosure) t2).ordinal()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(StringResource.INSTANCE.invoke(((HistoryDisclosure) it.next()).getDisclosureId(), new Object[0]));
        }
        return StringResources6.toSpannedString(arrayList, resources, PlaceholderUtils.XXShortPlaceholderText);
    }
}
