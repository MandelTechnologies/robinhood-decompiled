package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p355ui.CryptoCuratedListEligible;
import com.robinhood.models.p355ui.CuratedListEligible;
import com.robinhood.models.p355ui.FuturesCuratedListEligible;
import com.robinhood.models.p355ui.IndexCuratedListEligible;
import com.robinhood.models.p355ui.InstrumentCuratedListEligible;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.serverdriven.experimental.api.InstrumentType;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestingMonitorStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorDataState;", "Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/main/InvestingMonitorViewState;", "<init>", "()V", "reduce", "dataState", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class InvestingMonitorStateProvider implements StateProvider<InvestingMonitorDataState, InvestingMonitorViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InvestingMonitorViewState reduce(InvestingMonitorDataState dataState) {
        CuratedList first;
        InvestingMonitorAsset investingMonitorAsset;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isLoading()) {
            return InvestingMonitorViewState.Loading.INSTANCE;
        }
        if (dataState.getCuratedListInfoPairs().isEmpty()) {
            return InvestingMonitorViewState.Empty.INSTANCE;
        }
        List<Tuples2<CuratedList, List<CuratedListEligible>>> curatedListInfoPairs = dataState.getCuratedListInfoPairs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(curatedListInfoPairs, 10));
        Iterator<T> it = curatedListInfoPairs.iterator();
        InvestingMonitorPage investingMonitorPage = null;
        while (it.hasNext()) {
            Tuples2 tuples2 = (Tuples2) it.next();
            CuratedList curatedList = (CuratedList) tuples2.getFirst();
            List<CuratedListEligible> list = (List) tuples2.getSecond();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CuratedListEligible curatedListEligible : list) {
                if (curatedListEligible instanceof InstrumentCuratedListEligible) {
                    investingMonitorAsset = new InvestingMonitorAsset(((InstrumentCuratedListEligible) curatedListEligible).getCuratedListItem().getId(), curatedListEligible, InstrumentType.EQUITY);
                } else if (curatedListEligible instanceof CryptoCuratedListEligible) {
                    investingMonitorAsset = new InvestingMonitorAsset(((CryptoCuratedListEligible) curatedListEligible).getCuratedListItem().getId(), curatedListEligible, InstrumentType.CRYPTO);
                } else if (curatedListEligible instanceof FuturesCuratedListEligible) {
                    investingMonitorAsset = new InvestingMonitorAsset(((FuturesCuratedListEligible) curatedListEligible).getCuratedListItem().getId(), curatedListEligible, InstrumentType.FUTURE);
                } else if (curatedListEligible instanceof IndexCuratedListEligible) {
                    investingMonitorAsset = new InvestingMonitorAsset(((IndexCuratedListEligible) curatedListEligible).getCuratedListItem().getId(), curatedListEligible, InstrumentType.INDEX);
                } else {
                    if (!(curatedListEligible instanceof OptionStrategyCuratedListEligible)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    investingMonitorAsset = new InvestingMonitorAsset(((OptionStrategyCuratedListEligible) curatedListEligible).getCuratedListItem().getId(), curatedListEligible, InstrumentType.OPTION_STRATEGY);
                }
                arrayList2.add(investingMonitorAsset);
            }
            ImmutableList3 persistentList = extensions2.toPersistentList(arrayList2);
            UUID id = curatedList.getId();
            Tuples2<CuratedList, String> curatedListRenameInProgress = dataState.getCuratedListRenameInProgress();
            InvestingMonitorPage investingMonitorPage2 = new InvestingMonitorPage(Intrinsics.areEqual(id, (curatedListRenameInProgress == null || (first = curatedListRenameInProgress.getFirst()) == null) ? null : first.getId()) ? dataState.getCuratedListRenameInProgress().getSecond() : curatedList.getDisplayName(), persistentList, curatedList);
            if (dataState.getRecentlyCreatedCuratedListItems().contains(curatedList)) {
                investingMonitorPage = investingMonitorPage2;
            }
            arrayList.add(investingMonitorPage2);
        }
        ImmutableList3 persistentList2 = extensions2.toPersistentList(arrayList);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((InvestingMonitorPage) it2.next()).getTabTitle());
        }
        return new InvestingMonitorViewState.Loaded(null, persistentList2, extensions2.toPersistentList(arrayList3), investingMonitorPage != null ? new UiEvent(investingMonitorPage) : null, dataState.getSortingInProgressListId(), dataState.getViewMode(), 1, null);
    }
}
