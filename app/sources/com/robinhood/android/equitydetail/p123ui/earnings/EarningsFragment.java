package com.robinhood.android.equitydetail.p123ui.earnings;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.IncludeEarningsViewBinding;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.models.p355ui.InstrumentPosition;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.store.TraderEarningStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: EarningsFragment.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\"H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "earningStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "getEarningStore", "()Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "setEarningStore", "(Lcom/robinhood/shared/equities/models/store/TraderEarningStore;)V", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "getInstrumentPositionStore", "()Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "setInstrumentPositionStore", "(Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "allUpcomingEarnings", "", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Earning;", "instrumentPositionsMap", "", "Ljava/util/UUID;", "", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "refreshUi", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EarningsFragment extends BaseFragment {
    private List<Earning> allUpcomingEarnings;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public TraderEarningStore earningStore;
    public InstrumentPositionStore instrumentPositionStore;
    private Map<UUID, Integer> instrumentPositionsMap;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarningsFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public EarningsFragment() {
        super(C15314R.layout.include_earnings_view);
        this.binding = ViewBinding5.viewBinding(this, EarningsFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
    }

    public final TraderEarningStore getEarningStore() {
        TraderEarningStore traderEarningStore = this.earningStore;
        if (traderEarningStore != null) {
            return traderEarningStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("earningStore");
        return null;
    }

    public final void setEarningStore(TraderEarningStore traderEarningStore) {
        Intrinsics.checkNotNullParameter(traderEarningStore, "<set-?>");
        this.earningStore = traderEarningStore;
    }

    public final InstrumentPositionStore getInstrumentPositionStore() {
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore;
        if (instrumentPositionStore != null) {
            return instrumentPositionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("instrumentPositionStore");
        return null;
    }

    public final void setInstrumentPositionStore(InstrumentPositionStore instrumentPositionStore) {
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "<set-?>");
        this.instrumentPositionStore = instrumentPositionStore;
    }

    private final IncludeEarningsViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeEarningsViewBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getEarningStore().refreshAllUpcomingEarnings(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getEarningStore().getAllUpcomingEarnings()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.earnings.EarningsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarningsFragment.onResume$lambda$1(this.f$0, (Optional) obj);
            }
        });
        getInstrumentPositionStore().refreshIndividualAccountHoldingInstrumentPositions(false);
        Observable<R> map = getInstrumentPositionStore().getIndividualAccountHoldingInstrumentPositions().map(new Function() { // from class: com.robinhood.android.equitydetail.ui.earnings.EarningsFragment.onResume.2
            @Override // io.reactivex.functions.Function
            public final Map<UUID, Integer> apply(List<InstrumentPosition> instrumentPositions) {
                Intrinsics.checkNotNullParameter(instrumentPositions, "instrumentPositions");
                List<InstrumentPosition> list = instrumentPositions;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (InstrumentPosition instrumentPosition : list) {
                    linkedHashMap.put(instrumentPosition.getInstrument().getId(), Integer.valueOf(instrumentPosition.getPositionDisplayQuantity().intValue()));
                }
                return linkedHashMap;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.earnings.EarningsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarningsFragment.onResume$lambda$2(this.f$0, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(EarningsFragment earningsFragment, Optional optional) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        earningsFragment.allUpcomingEarnings = (List) optional.component1();
        earningsFragment.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(EarningsFragment earningsFragment, Map map) throws Resources.NotFoundException {
        earningsFragment.instrumentPositionsMap = map;
        earningsFragment.refreshUi();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C15314R.string.earnings_title_upcoming));
    }

    private final void refreshUi() throws Resources.NotFoundException {
        getBinding().getRoot().bind(this.allUpcomingEarnings, this.instrumentPositionsMap);
    }

    /* compiled from: EarningsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$Earnings;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.Earnings> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.Earnings key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new EarningsFragment();
        }
    }
}
