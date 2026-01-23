package com.robinhood.android.dashboard.recurring;

import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
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
import p479j$.time.LocalDate;

/* compiled from: InvestmentScheduleExtensions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003*\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0002\u0010\b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"MaxItemsForSummary", "", "toSummarizedStatefulHistoryEvents", "", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "maxItems", "lib-dashboard-recurring_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.recurring.InvestmentScheduleExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class InvestmentScheduleExtensions {
    private static final int MaxItemsForSummary = 3;

    public static /* synthetic */ List toSummarizedStatefulHistoryEvents$default(List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return toSummarizedStatefulHistoryEvents(list, i);
    }

    public static final List<StatefulHistoryEvent<HistoryEvent>> toSummarizedStatefulHistoryEvents(List<InvestmentSchedule> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((InvestmentSchedule) obj).isBrokerageCashTransfer()) {
                arrayList.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.dashboard.recurring.InvestmentScheduleExtensionsKt$toSummarizedStatefulHistoryEvents$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                LocalDate nextInvestmentDate = ((InvestmentSchedule) t).getNextInvestmentDate();
                if (nextInvestmentDate == null) {
                    nextInvestmentDate = LocalDate.MAX;
                }
                LocalDate nextInvestmentDate2 = ((InvestmentSchedule) t2).getNextInvestmentDate();
                if (nextInvestmentDate2 == null) {
                    nextInvestmentDate2 = LocalDate.MAX;
                }
                return ComparisonsKt.compareValues(nextInvestmentDate, nextInvestmentDate2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listSortedWith) {
            if (((InvestmentSchedule) obj2).isActive()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listSortedWith) {
            if (((InvestmentSchedule) obj3).isPaused()) {
                arrayList3.add(obj3);
            }
        }
        List listTake = CollectionsKt.take(CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3), i);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it = listTake.iterator();
        while (it.hasNext()) {
            arrayList4.add(((HistoryEvent) it.next()).toStatefulHistoryEvent());
        }
        return arrayList4;
    }
}
