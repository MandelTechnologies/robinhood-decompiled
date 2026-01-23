package com.robinhood.viewmode;

import com.robinhood.android.common.extensions.CuratedListViewModes;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.models.p320db.CuratedListViewMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewModeSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¨\u0006\u0004"}, m3636d2 = {"toSecurityViewModes", "", "Lcom/robinhood/android/common/util/SecurityViewMode;", "Lcom/robinhood/models/db/CuratedListViewMode;", "feature-lib-watchlist_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.viewmode.ViewModeSelectionViewStateKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ViewModeSelectionViewState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SecurityViewMode> toSecurityViewModes(List<? extends CuratedListViewMode> list) {
        List<? extends CuratedListViewMode> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(CuratedListViewModes.toSecurityViewMode((CuratedListViewMode) it.next()));
        }
        return arrayList;
    }
}
