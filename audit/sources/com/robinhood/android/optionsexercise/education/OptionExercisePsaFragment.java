package com.robinhood.android.optionsexercise.education;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.optionsexercise.C24704R;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.common.strings.C32428R;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;

/* compiled from: OptionExercisePsaFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0003?@AB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u000201H\u0016J\b\u00107\u001a\u000201H\u0016J\t\u00108\u001a\u000209H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R!\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b&\u0010\"\u0012\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010 R!\u0010'\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b*\u0010\"\u0012\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010 R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b-\u0010.R\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment;", "Lcom/robinhood/android/common/onboarding/ui/BaseScrollableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "getMarketHoursStore", "()Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "setMarketHoursStore", "(Lcom/robinhood/android/markethours/data/store/MarketHoursStore;)V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "primaryButtonStringRes", "", "getPrimaryButtonStringRes", "()Ljava/lang/Integer;", "secondaryButtonStringRes", "getSecondaryButtonStringRes", "otmPsaDescription", "Landroid/widget/TextView;", "getOtmPsaDescription", "()Landroid/widget/TextView;", "otmPsaDescription$delegate", "Lkotlin/properties/ReadOnlyProperty;", "thirdTitle", "getThirdTitle$annotations", "getThirdTitle", "thirdTitle$delegate", "thirdDescription", "getThirdDescription$annotations", "getThirdDescription", "thirdDescription$delegate", "callbacks", "Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPrimaryBtnClicked", "onSecondaryBtnClicked", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExercisePsaFragment extends BaseScrollableFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public ExperimentsStore experimentsStore;
    public MarketHoursStore marketHoursStore;

    /* renamed from: otmPsaDescription$delegate, reason: from kotlin metadata */
    private final Interfaces2 otmPsaDescription;
    private final int primaryButtonStringRes;
    public RegionGateProvider regionGateProvider;
    private final int secondaryButtonStringRes;

    /* renamed from: thirdDescription$delegate, reason: from kotlin metadata */
    private final Interfaces2 thirdDescription;

    /* renamed from: thirdTitle$delegate, reason: from kotlin metadata */
    private final Interfaces2 thirdTitle;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionExercisePsaFragment.class, "otmPsaDescription", "getOtmPsaDescription()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExercisePsaFragment.class, "thirdTitle", "getThirdTitle()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExercisePsaFragment.class, "thirdDescription", "getThirdDescription()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionExercisePsaFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionExercisePsaFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Callbacks;", "", "onContinuePsa", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinuePsa();
    }

    /* compiled from: OptionExercisePsaFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static /* synthetic */ void getThirdDescription$annotations() {
    }

    private static /* synthetic */ void getThirdTitle$annotations() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionExercisePsaFragment() {
        super(C24704R.layout.fragment_option_exercise_psa);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.primaryButtonStringRes = C11048R.string.general_label_continue;
        this.secondaryButtonStringRes = C32428R.string.exercise_cancel_label;
        this.otmPsaDescription = bindView(C24704R.id.exercise_psa_first_description);
        this.thirdTitle = bindView(C24704R.id.exercise_psa_third_title);
        this.thirdDescription = bindView(C24704R.id.exercise_psa_third_description);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsexercise.education.OptionExercisePsaFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final MarketHoursStore getMarketHoursStore() {
        MarketHoursStore marketHoursStore = this.marketHoursStore;
        if (marketHoursStore != null) {
            return marketHoursStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursStore");
        return null;
    }

    public final void setMarketHoursStore(MarketHoursStore marketHoursStore) {
        Intrinsics.checkNotNullParameter(marketHoursStore, "<set-?>");
        this.marketHoursStore = marketHoursStore;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getPrimaryButtonStringRes() {
        return Integer.valueOf(this.primaryButtonStringRes);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public Integer getSecondaryButtonStringRes() {
        return Integer.valueOf(this.secondaryButtonStringRes);
    }

    private final TextView getOtmPsaDescription() {
        return (TextView) this.otmPsaDescription.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getThirdTitle() {
        return (TextView) this.thirdTitle.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getThirdDescription() {
        return (TextView) this.thirdDescription.getValue(this, $$delegatedProperties[2]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[3]);
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) this)).getContractType().ordinal()];
        if (i == 1) {
            getOtmPsaDescription().setText(getString(C24704R.string.exercise_psa_otm_description_call));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getOtmPsaDescription().setText(getString(C24704R.string.exercise_psa_otm_description_put));
        }
        Observable<Boolean> observableDistinctUntilChanged = ExperimentsKt.streamWithExperiment(getRegionGateProvider(), getExperimentsStore(), SubzeroRegionGate.INSTANCE, Experiments.OptionsShortSellingExercise.INSTANCE, true).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.education.OptionExercisePsaFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExercisePsaFragment.onViewCreated$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        Observable map = MarketHoursStore.getAndRefreshNextOpenMarketHours$default(getMarketHoursStore(), false, false, 3, null).map(new Function() { // from class: com.robinhood.android.optionsexercise.education.OptionExercisePsaFragment.onViewCreated.2
            @Override // io.reactivex.functions.Function
            public final Instant apply(MarketHours marketHours) {
                Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                if (((Args) OptionExercisePsaFragment.INSTANCE.getArgs((Fragment) OptionExercisePsaFragment.this)).getLateCloseState().getIsLateClosing()) {
                    Instant lateOptionClosesAt = marketHours.getLateOptionClosesAt();
                    return lateOptionClosesAt == null ? marketHours.getRegularClosesAt() : lateOptionClosesAt;
                }
                return marketHours.getRegularClosesAt();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.education.OptionExercisePsaFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExercisePsaFragment.onViewCreated$lambda$1(this.f$0, (Instant) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionExercisePsaFragment optionExercisePsaFragment, Boolean bool) {
        if (bool.booleanValue()) {
            optionExercisePsaFragment.getThirdTitle().setText(optionExercisePsaFragment.getString(C24704R.string.exercise_psa_short_selling_title));
            optionExercisePsaFragment.getThirdDescription().setText(optionExercisePsaFragment.getString(C24704R.string.exercise_psa_short_selling_description));
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[((Args) INSTANCE.getArgs((Fragment) optionExercisePsaFragment)).getContractType().ordinal()];
            if (i == 1) {
                optionExercisePsaFragment.getThirdTitle().setText(optionExercisePsaFragment.getString(C24704R.string.exercise_psa_cost_label_call));
                optionExercisePsaFragment.getThirdDescription().setText(optionExercisePsaFragment.getString(C24704R.string.exercise_psa_cost_description_call));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                optionExercisePsaFragment.getThirdTitle().setText(optionExercisePsaFragment.getString(C24704R.string.exercise_psa_cost_label_put));
                optionExercisePsaFragment.getThirdDescription().setText(optionExercisePsaFragment.getString(C24704R.string.exercise_psa_cost_description_put));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(OptionExercisePsaFragment optionExercisePsaFragment, Instant instant) {
        optionExercisePsaFragment.getDisclaimer().setVisibility(0);
        TextView disclaimer = optionExercisePsaFragment.getDisclaimer();
        int i = C24704R.string.exercise_psa_execution_disclaimer;
        Intrinsics.checkNotNull(instant);
        disclaimer.setText(optionExercisePsaFragment.getString(i, Instants2.toEasternTimeString(instant)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onPrimaryBtnClicked() {
        getCallbacks().onContinuePsa();
    }

    @Override // com.robinhood.android.common.onboarding.p085ui.BaseScrollableFragment
    public void onSecondaryBtnClicked() {
        requireActivity().finish();
    }

    /* compiled from: OptionExercisePsaFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Args;", "Landroid/os/Parcelable;", "contractType", "Lcom/robinhood/models/db/OptionContractType;", "lateCloseState", "Lcom/robinhood/models/db/OptionChain$LateCloseState;", "<init>", "(Lcom/robinhood/models/db/OptionContractType;Lcom/robinhood/models/db/OptionChain$LateCloseState;)V", "getContractType", "()Lcom/robinhood/models/db/OptionContractType;", "getLateCloseState", "()Lcom/robinhood/models/db/OptionChain$LateCloseState;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionContractType contractType;
        private final OptionChain.LateCloseState lateCloseState;

        /* compiled from: OptionExercisePsaFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(OptionContractType.valueOf(parcel.readString()), OptionChain.LateCloseState.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionContractType optionContractType, OptionChain.LateCloseState lateCloseState, int i, Object obj) {
            if ((i & 1) != 0) {
                optionContractType = args.contractType;
            }
            if ((i & 2) != 0) {
                lateCloseState = args.lateCloseState;
            }
            return args.copy(optionContractType, lateCloseState);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionContractType getContractType() {
            return this.contractType;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionChain.LateCloseState getLateCloseState() {
            return this.lateCloseState;
        }

        public final Args copy(OptionContractType contractType, OptionChain.LateCloseState lateCloseState) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
            return new Args(contractType, lateCloseState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return this.contractType == args.contractType && this.lateCloseState == args.lateCloseState;
        }

        public int hashCode() {
            return (this.contractType.hashCode() * 31) + this.lateCloseState.hashCode();
        }

        public String toString() {
            return "Args(contractType=" + this.contractType + ", lateCloseState=" + this.lateCloseState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.contractType.name());
            dest.writeString(this.lateCloseState.name());
        }

        public Args(OptionContractType contractType, OptionChain.LateCloseState lateCloseState) {
            Intrinsics.checkNotNullParameter(contractType, "contractType");
            Intrinsics.checkNotNullParameter(lateCloseState, "lateCloseState");
            this.contractType = contractType;
            this.lateCloseState = lateCloseState;
        }

        public final OptionContractType getContractType() {
            return this.contractType;
        }

        public final OptionChain.LateCloseState getLateCloseState() {
            return this.lateCloseState;
        }
    }

    /* compiled from: OptionExercisePsaFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment;", "Lcom/robinhood/android/optionsexercise/education/OptionExercisePsaFragment$Args;", "<init>", "()V", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionExercisePsaFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionExercisePsaFragment optionExercisePsaFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionExercisePsaFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionExercisePsaFragment newInstance(Args args) {
            return (OptionExercisePsaFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionExercisePsaFragment optionExercisePsaFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionExercisePsaFragment, args);
        }
    }
}
