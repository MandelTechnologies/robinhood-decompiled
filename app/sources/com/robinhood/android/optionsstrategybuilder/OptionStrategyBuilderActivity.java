package com.robinhood.android.optionsstrategybuilder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.educationtour.interfaces.EducationTourActivity;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.options.contracts.OptionStrategyBuilderIntentKey;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment;
import com.robinhood.android.optionsstrategybuilder.databinding.ActivityOptionStrategyBuilderBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionStrategyBuilderActivity.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H\u0016J\t\u00103\u001a\u000204H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "getOptionChainStore", "()Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "setOptionChainStore", "(Lcom/robinhood/librobinhood/data/store/OptionChainStore;)V", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "getOptionMarketHoursStore", "()Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "setOptionMarketHoursStore", "(Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;)V", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "getOptionSettingsStore", "()Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "setOptionSettingsStore", "(Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;)V", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "getOptionStrategyBuilderStore", "()Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "setOptionStrategyBuilderStore", "(Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;)V", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "binding", "Lcom/robinhood/android/optionsstrategybuilder/databinding/ActivityOptionStrategyBuilderBinding;", "getBinding", "()Lcom/robinhood/android/optionsstrategybuilder/databinding/ActivityOptionStrategyBuilderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "launchStrategyBuilderFragment", "onBackPressed", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderActivity extends BaseActivity implements EducationTourActivity, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public OptionChainStore optionChainStore;
    public OptionMarketHoursStore optionMarketHoursStore;
    public OptionSettingsStore optionSettingsStore;
    public OptionStrategyBuilderStore optionStrategyBuilderStore;
    public TooltipManager tooltipManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyBuilderActivity.class, "binding", "getBinding()Lcom/robinhood/android/optionsstrategybuilder/databinding/ActivityOptionStrategyBuilderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourActivity
    public boolean handleBackPressed() {
        return EducationTourActivity.DefaultImpls.handleBackPressed(this);
    }

    public OptionStrategyBuilderActivity() {
        super(C24876R.layout.activity_option_strategy_builder);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, OptionStrategyBuilderActivity2.INSTANCE);
    }

    public final OptionChainStore getOptionChainStore() {
        OptionChainStore optionChainStore = this.optionChainStore;
        if (optionChainStore != null) {
            return optionChainStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionChainStore");
        return null;
    }

    public final void setOptionChainStore(OptionChainStore optionChainStore) {
        Intrinsics.checkNotNullParameter(optionChainStore, "<set-?>");
        this.optionChainStore = optionChainStore;
    }

    public final OptionMarketHoursStore getOptionMarketHoursStore() {
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore;
        if (optionMarketHoursStore != null) {
            return optionMarketHoursStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionMarketHoursStore");
        return null;
    }

    public final void setOptionMarketHoursStore(OptionMarketHoursStore optionMarketHoursStore) {
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "<set-?>");
        this.optionMarketHoursStore = optionMarketHoursStore;
    }

    public final OptionSettingsStore getOptionSettingsStore() {
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore;
        if (optionSettingsStore != null) {
            return optionSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionSettingsStore");
        return null;
    }

    public final void setOptionSettingsStore(OptionSettingsStore optionSettingsStore) {
        Intrinsics.checkNotNullParameter(optionSettingsStore, "<set-?>");
        this.optionSettingsStore = optionSettingsStore;
    }

    public final OptionStrategyBuilderStore getOptionStrategyBuilderStore() {
        OptionStrategyBuilderStore optionStrategyBuilderStore = this.optionStrategyBuilderStore;
        if (optionStrategyBuilderStore != null) {
            return optionStrategyBuilderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionStrategyBuilderStore");
        return null;
    }

    public final void setOptionStrategyBuilderStore(OptionStrategyBuilderStore optionStrategyBuilderStore) {
        Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "<set-?>");
        this.optionStrategyBuilderStore = optionStrategyBuilderStore;
    }

    @Override // com.robinhood.tooltips.TooltipActivity
    public TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    private final ActivityOptionStrategyBuilderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityOptionStrategyBuilderBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (((OptionStrategyBuilderIntentKey) INSTANCE.getExtras((Activity) this)).getUiOptionChains().isEmpty()) {
            throw new IllegalStateException("Strategy builder requires at least one option chain");
        }
        if (savedInstanceState == null) {
            launchStrategyBuilderFragment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    private final void launchStrategyBuilderFragment() {
        getBinding().rdsLoadingView.show();
        Observables observables = Observables.INSTANCE;
        OptionSettingsStore optionSettingsStore = getOptionSettingsStore();
        Companion companion = INSTANCE;
        Observable map = observables.combineLatest(optionSettingsStore.streamTradeOnExpirationState(((OptionStrategyBuilderIntentKey) companion.getExtras((Activity) this)).getInitialAccountNumber()), getOptionMarketHoursStore().streamCurrentOrNextMarketDates(), getOptionStrategyBuilderStore().getStreamOptionStrategyChainTemplate().asObservable(((OptionStrategyBuilderIntentKey) companion.getExtras((Activity) this)).getStrategyId())).take(1L).map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderActivity.launchStrategyBuilderFragment.1
            @Override // io.reactivex.functions.Function
            public final OptionStrategyBuilderFragment.Args apply(Tuples3<? extends OptionSettings.TradingOnExpirationState, OptionCurrentOrNextMarketDates, OptionStrategyChainTemplate> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                OptionSettings.TradingOnExpirationState tradingOnExpirationStateComponent1 = tuples3.component1();
                OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDatesComponent2 = tuples3.component2();
                OptionStrategyChainTemplate optionStrategyChainTemplateComponent3 = tuples3.component3();
                Companion companion2 = OptionStrategyBuilderActivity.INSTANCE;
                return new OptionStrategyBuilderFragment.Args(((OptionStrategyBuilderIntentKey) companion2.getExtras((Activity) OptionStrategyBuilderActivity.this)).getInitialAccountNumber(), ((OptionStrategyBuilderIntentKey) companion2.getExtras((Activity) OptionStrategyBuilderActivity.this)).getStrategyId(), optionStrategyChainTemplateComponent3, ((OptionStrategyBuilderIntentKey) companion2.getExtras((Activity) OptionStrategyBuilderActivity.this)).getUiOptionChains(), tradingOnExpirationStateComponent1, optionCurrentOrNextMarketDatesComponent2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderActivity.launchStrategyBuilderFragment$lambda$1(this.f$0, (OptionStrategyBuilderFragment.Args) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchStrategyBuilderFragment$lambda$1(OptionStrategyBuilderActivity optionStrategyBuilderActivity, OptionStrategyBuilderFragment.Args args) {
        optionStrategyBuilderActivity.getBinding().rdsLoadingView.hide();
        int i = C24876R.id.fragment_container;
        OptionStrategyBuilderFragment.Companion companion = OptionStrategyBuilderFragment.INSTANCE;
        Intrinsics.checkNotNull(args);
        optionStrategyBuilderActivity.setFragment(i, companion.newInstance((Parcelable) args));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (handleBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    /* compiled from: OptionStrategyBuilderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderActivity;", "Lcom/robinhood/android/options/contracts/OptionStrategyBuilderIntentKey;", "<init>", "()V", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<OptionStrategyBuilderActivity, OptionStrategyBuilderIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public OptionStrategyBuilderIntentKey getExtras(OptionStrategyBuilderActivity optionStrategyBuilderActivity) {
            return (OptionStrategyBuilderIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, optionStrategyBuilderActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, OptionStrategyBuilderIntentKey optionStrategyBuilderIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, optionStrategyBuilderIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, OptionStrategyBuilderIntentKey optionStrategyBuilderIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, optionStrategyBuilderIntentKey);
        }
    }
}
