package com.robinhood.compose.common.checklist;

import com.robinhood.compose.common.checklist.ChecklistItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChecklistUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, m3636d2 = {"createChecklistItems", "", "Lcom/robinhood/compose/common/checklist/ChecklistItem;", "titles", "", "currentIndex", "", "currentError", "Lcom/robinhood/compose/common/checklist/ChecklistItem$Error;", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.checklist.ChecklistUtilsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ChecklistUtils {
    public static /* synthetic */ List createChecklistItems$default(List list, int i, ChecklistItem.Error error, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            error = null;
        }
        return createChecklistItems(list, i, error);
    }

    public static final List<ChecklistItem> createChecklistItems(List<String> titles, int i, ChecklistItem.Error error) {
        Object notStarted;
        Intrinsics.checkNotNullParameter(titles, "titles");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : titles) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (error == null || i3 <= i) {
                arrayList.add(obj);
            }
            i3 = i4;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj2 : arrayList) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj2;
            if (i2 < i) {
                notStarted = new ChecklistItem.Success(str);
            } else if (i2 == i) {
                notStarted = error != null ? error : new ChecklistItem.Loading(str);
            } else {
                notStarted = new ChecklistItem.NotStarted(str);
            }
            arrayList2.add(notStarted);
            i2 = i5;
        }
        return arrayList2;
    }
}
