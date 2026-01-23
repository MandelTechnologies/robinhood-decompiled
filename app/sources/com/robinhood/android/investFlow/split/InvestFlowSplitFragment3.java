package com.robinhood.android.investFlow.split;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.split.InvestFlowSplitAdapter;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowSplitFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"com/robinhood/android/investFlow/split/InvestFlowSplitFragment$resetCallbacks$1", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter$Callbacks;", "enableReset", "", "onAllocationChanged", "onUntradableInstrumentClicked", "assetId", "Ljava/util/UUID;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$resetCallbacks$1, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestFlowSplitFragment3 implements InvestFlowSplitAdapter.Callbacks {
    final /* synthetic */ InvestFlowSplitFragment this$0;

    InvestFlowSplitFragment3(InvestFlowSplitFragment investFlowSplitFragment) {
        this.this$0 = investFlowSplitFragment;
    }

    @Override // com.robinhood.android.investFlow.split.InvestFlowSplitAdapter.Callbacks
    public void enableReset() throws Resources.NotFoundException {
        this.this$0.requireActivity().invalidateOptionsMenu();
        this.this$0.setMenuColor();
    }

    @Override // com.robinhood.android.investFlow.split.InvestFlowSplitAdapter.Callbacks
    public void onAllocationChanged() {
        this.this$0.getDuxo().setCustomAssetAllocations(this.this$0.splitAdapter.getCustomAllocation());
    }

    @Override // com.robinhood.android.investFlow.split.InvestFlowSplitAdapter.Callbacks
    public void onUntradableInstrumentClicked(final UUID assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        InvestFlowSplitFragment investFlowSplitFragment = this.this$0;
        Observable<InvestFlowSplitViewState> observableTake = investFlowSplitFragment.getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(investFlowSplitFragment, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null);
        final InvestFlowSplitFragment investFlowSplitFragment2 = this.this$0;
        scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$resetCallbacks$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitFragment3.onUntradableInstrumentClicked$lambda$0(assetId, investFlowSplitFragment2, (InvestFlowSplitViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUntradableInstrumentClicked$lambda$0(UUID uuid, InvestFlowSplitFragment investFlowSplitFragment, InvestFlowSplitViewState investFlowSplitViewState) {
        StringResource untradableDialogMessage;
        StringResource untradableDialogTitle = investFlowSplitViewState.getUntradableDialogTitle(uuid);
        if (untradableDialogTitle != null && (untradableDialogMessage = investFlowSplitViewState.getUntradableDialogMessage(uuid)) != null) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = investFlowSplitFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_split_untradable_alert);
            Resources resources = investFlowSplitFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            RhDialogFragment.Builder title = id.setTitle(untradableDialogTitle.getText(resources));
            Resources resources2 = investFlowSplitFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            RhDialogFragment.Builder positiveButton = title.setMessage(untradableDialogMessage.getText(resources2)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
            FragmentManager childFragmentManager = investFlowSplitFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "untradable_alert", false, 4, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
