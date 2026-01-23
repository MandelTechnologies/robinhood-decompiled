package com.robinhood.android.investmentstracker;

import accio.service.p003v1.SpanDto;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.futures.charts.DisplaySpans;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentsTrackerUtilityFunctions.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a,\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0000¨\u0006\u000f"}, m3636d2 = {"getSpanOptionList", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/charts/models/db/SpanOption;", "spanOption", "loadingNewSpan", "", "updateModelForTypeAndDraw", "", "", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "firstDraw", "model", "insertAboveDisclaimer", "toSpanDto", "Laccio/service/v1/SpanDto;", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerUtilityFunctionsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerUtilityFunctions {
    public static final ImmutableList3<SpanOption> getSpanOptionList(SpanOption spanOption, boolean z) {
        SpanOption spanOption2 = new SpanOption(DisplaySpans.WEEK, "span_1w", Intrinsics.areEqual(spanOption != null ? spanOption.getQueryValue() : null, "span_1w") && z);
        SpanOption spanOption3 = new SpanOption(DisplaySpans.MONTH, "span_1m", Intrinsics.areEqual(spanOption != null ? spanOption.getQueryValue() : null, "span_1m") && z);
        SpanOption spanOption4 = new SpanOption(DisplaySpans.THREE_MONTHS, "span_3m", Intrinsics.areEqual(spanOption != null ? spanOption.getQueryValue() : null, "span_3m") && z);
        SpanOption spanOption5 = new SpanOption(DisplaySpans.YTD, "span_ytd", Intrinsics.areEqual(spanOption != null ? spanOption.getQueryValue() : null, "span_ytd") && z);
        boolean z2 = false;
        SpanOption spanOption6 = new SpanOption(DisplaySpans.YEAR, "span_1y", Intrinsics.areEqual(spanOption != null ? spanOption.getQueryValue() : null, "span_1y") && z);
        if (Intrinsics.areEqual(spanOption != null ? spanOption.getQueryValue() : null, "span_all") && z) {
            z2 = true;
        }
        return extensions2.persistentListOf(spanOption2, spanOption3, spanOption4, spanOption5, spanOption6, new SpanOption(DisplaySpans.ALL, "span_all", z2));
    }

    public static /* synthetic */ void updateModelForTypeAndDraw$default(List list, boolean z, InvestmentsTrackerComponent investmentsTrackerComponent, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        updateModelForTypeAndDraw(list, z, investmentsTrackerComponent, z2);
    }

    public static final void updateModelForTypeAndDraw(List<InvestmentsTrackerComponent> list, boolean z, InvestmentsTrackerComponent model, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        if (z) {
            list.add(model);
            return;
        }
        Iterator<InvestmentsTrackerComponent> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), model.getId())) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            if (z2 && !list.isEmpty()) {
                list.add(list.size() - 1, model);
                return;
            } else {
                list.add(model);
                return;
            }
        }
        list.set(i, model);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final SpanDto toSpanDto(SpanOption spanOption) {
        Intrinsics.checkNotNullParameter(spanOption, "<this>");
        String queryValue = spanOption.getQueryValue();
        switch (queryValue.hashCode()) {
            case -2011842703:
                if (queryValue.equals("span_1m")) {
                    return SpanDto.SPAN_1M;
                }
                break;
            case -2011842691:
                if (queryValue.equals("span_1y")) {
                    return SpanDto.SPAN_1Y;
                }
                break;
            case -2011842641:
                if (queryValue.equals("span_3m")) {
                    return SpanDto.SPAN_3M;
                }
                break;
            case 2057431852:
                if (queryValue.equals("span_all")) {
                    return SpanDto.SPAN_ALL;
                }
                break;
            case 2057455156:
                if (queryValue.equals("span_ytd")) {
                    return SpanDto.SPAN_YTD;
                }
                break;
        }
        return SpanDto.SPAN_1M;
    }
}
