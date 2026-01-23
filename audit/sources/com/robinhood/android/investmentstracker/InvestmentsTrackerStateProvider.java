package com.robinhood.android.investmentstracker;

import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentsTrackerStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerViewState;", "<init>", "()V", "reduce", "dataState", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentsTrackerStateProvider implements StateProvider<InvestmentsTrackerDataState, InvestmentsTrackerViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InvestmentsTrackerViewState reduce(InvestmentsTrackerDataState dataState) {
        ImmutableList3 immutableList3PersistentListOf;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ArrayList arrayList = new ArrayList();
        List<InvestmentsTrackerComponent> components = dataState.getComponents();
        if (components != null) {
            Iterator<T> it = components.iterator();
            while (it.hasNext()) {
                arrayList.add(((InvestmentsTrackerComponent) it.next()).copyForView());
            }
        }
        List<InvestmentsTrackerComponent> components2 = dataState.getComponents();
        if (components2 == null || (immutableList3PersistentListOf = extensions2.toPersistentList(components2)) == null) {
            immutableList3PersistentListOf = extensions2.persistentListOf();
        }
        return new InvestmentsTrackerViewState(immutableList3PersistentListOf, dataState.getShowHomeHeader(), dataState.getAccountWasSelectedForThisNavigation(), dataState.getPoppingScreen(), dataState.getHeaderInfo(), dataState.getSwitcherData(), dataState.getNavigationTitle(), dataState.getUsingUpdateMode(), dataState.getUpdateModeAccountLinkId(), dataState.getAllocationBarData(), dataState.getOnboardingData(), dataState.getOnboardingBottomSheetPagePopupData(), dataState.getAgreementResponse(), dataState.getInfoSheetData(), dataState.getShowExoPlayer(), dataState.getAnalyticsState(), dataState.getShowLoadingPage());
    }
}
