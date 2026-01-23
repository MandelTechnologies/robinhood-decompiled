package com.robinhood.android.optionsrolling.p209ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.ViewGroup2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.jakewharton.rxbinding3.view.RxView;
import com.robinhood.android.common.options.rolling.OptionRollingContentful;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.instant.p160ui.InstantCashUtils;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.android.optionsrolling.databinding.FragmentOptionRollingBinding;
import com.robinhood.android.optionsrolling.overlay.OptionRollingStrategyOverlay;
import com.robinhood.android.optionsrolling.p209ui.OptionRollingStrategyViewState;
import com.robinhood.android.optionsrolling.p209ui.view.OptionRollingBottomSheetFragment;
import com.robinhood.android.optionsrolling.p209ui.view.RollingContractCardView;
import com.robinhood.android.optionsrolling.p209ui.view.RollingSubheaderView;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.moshi.jsonadapter.JsonPrimitive;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;

/* compiled from: OptionRollingStrategyFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u0003:\u000256B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u001a\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J\b\u0010+\u001a\u00020\u0018H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\b\u0010-\u001a\u00020\u0018H\u0016J\t\u0010.\u001a\u00020/H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/optionsrolling/ui/view/OptionRollingBottomSheetFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "bindings", "Lcom/robinhood/android/optionsrolling/databinding/FragmentOptionRollingBinding;", "getBindings", "()Lcom/robinhood/android/optionsrolling/databinding/FragmentOptionRollingBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "contractSelectorLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "orderFormLauncher", "onAttach", "", "context", "Landroid/content/Context;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onStart", "onStop", "onGoBack", "onViewAccountHistory", "onUpgradeInstant", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionRollingStrategyFragment extends BaseFragment implements OptionRollingBottomSheetFragment.Callbacks, RegionGated {
    public static final String BOTTOM_SHEET_BUNDLE = "bottom_sheet_bundle";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final ActivityResultLauncher<Intent> contractSelectorLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> orderFormLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionRollingStrategyFragment.class, "bindings", "getBindings()Lcom/robinhood/android/optionsrolling/databinding/FragmentOptionRollingBinding;", 0))};

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

    public OptionRollingStrategyFragment() {
        super(C24772R.layout.fragment_option_rolling);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, OptionRollingStrategyFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionRollingStrategyDuxo.class);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$contractSelectorLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intent data = result.getData();
                OptionInstrument optionInstrument = data != null ? (OptionInstrument) data.getParcelableExtra(OptionChainLaunchMode.SingleLegAction.Roll.EXTRA_SELECTED_INSTRUMENT) : null;
                if (result.getResultCode() != -1 || optionInstrument == null) {
                    return;
                }
                this.this$0.getDuxo().setSelectedContract(optionInstrument);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.contractSelectorLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$orderFormLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.orderFormLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOptionRollingBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionRollingBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionRollingStrategyDuxo getDuxo() {
        return (OptionRollingStrategyDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C24772R.menu.options_rolling_menu, menu);
        View actionView = menu.findItem(C24772R.id.disclosure_item).getActionView();
        Intrinsics.checkNotNull(actionView, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
        final RhTextView rhTextView = (RhTextView) actionView;
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$createOptionsMenu$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionRollingStrategyViewState) it).getRiskDisclosureContentful();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.createOptionsMenu$lambda$2(rhTextView, this, (OptionRollingContentful) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$createOptionsMenu$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionRollingStrategyViewState) it).getRiskDisclosureMenuItemStringRes());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.createOptionsMenu$lambda$5(rhTextView, this, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOptionsMenu$lambda$2(RhTextView rhTextView, final OptionRollingStrategyFragment optionRollingStrategyFragment, final OptionRollingContentful riskDisclosureContentful) {
        Intrinsics.checkNotNullParameter(riskDisclosureContentful, "riskDisclosureContentful");
        OnClickListeners.onClick(rhTextView, new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRollingStrategyFragment.createOptionsMenu$lambda$2$lambda$1(this.f$0, riskDisclosureContentful);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOptionsMenu$lambda$2$lambda$1(OptionRollingStrategyFragment optionRollingStrategyFragment, OptionRollingContentful optionRollingContentful) {
        Navigator navigator = optionRollingStrategyFragment.getNavigator();
        Context contextRequireContext = optionRollingStrategyFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RemoteDisclosureKey(optionRollingContentful.getContentfulId(), null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createOptionsMenu$lambda$5(RhTextView rhTextView, OptionRollingStrategyFragment optionRollingStrategyFragment, Optional optional) {
        String string2;
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        Integer num = (Integer) optional.component1();
        if (num == null || (string2 = optionRollingStrategyFragment.getString(num.intValue())) == null) {
            string2 = "";
        }
        rhTextView.setText(string2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBindings().loading.show();
        getDuxo().logRollingIntroAppearEvent();
        final ScrollView scrollView = getBindings().scrollView;
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onViewCreated$1$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View contentDivider = this.this$0.getBindings().contentDivider;
                Intrinsics.checkNotNullExpressionValue(contentDivider, "contentDivider");
                int height = scrollView.getHeight();
                ScrollView scrollView2 = scrollView;
                Intrinsics.checkNotNull(scrollView2);
                contentDivider.setVisibility(height < ((View) SequencesKt.first(ViewGroup2.getChildren(scrollView2))).getHeight() ? 0 : 8);
            }
        });
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(final RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$configureToolbar$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) ((OptionRollingStrategyViewState) it).getToolbarTitle(resources);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.configureToolbar$lambda$8(toolbar, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$8(RhToolbar rhToolbar, String toolbarTitle) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        rhToolbar.setTitle(toolbarTitle);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionRollingStrategyViewState optionRollingStrategyViewState = (OptionRollingStrategyViewState) it;
                return Optional3.asOptional((optionRollingStrategyViewState.getExistingOptionInstrument() == null || optionRollingStrategyViewState.getExistingOpeningPositionType() == null) ? null : Tuples4.m3642to(optionRollingStrategyViewState.getExistingOptionInstrument(), optionRollingStrategyViewState.getExistingOpeningPositionType()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$10(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getExistingPositionCardData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$12(this.f$0, (RollingContractCardView.RollingContractCardData) obj);
            }
        });
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getExistingPositionQuote());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map3)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C247976(getBindings().optionsCurrentPositionCard));
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getExistingContractStatsKey());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$16(this.f$0, (OptionStatisticsFragmentKey) obj);
            }
        });
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getSelectedPositionCardData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableRefCount = ObservablesKt.filterIsPresent(map5).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableDistinctUntilChanged4 = observableRefCount.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C247989(getBindings().optionsSelectedPositionCard));
        Observable observableTake = observableRefCount.take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$18(this.f$0, (RollingContractCardView.RollingContractCardData) obj);
            }
        });
        RollingContractCardView optionsSelectedPositionCard = getBindings().optionsSelectedPositionCard;
        Intrinsics.checkNotNullExpressionValue(optionsSelectedPositionCard, "optionsSelectedPositionCard");
        OnClickListeners.onClick(optionsSelectedPositionCard, new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRollingStrategyFragment.onResume$lambda$23(this.f$0);
            }
        });
        Observable<R> map6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getSelectedOptionInstrumentQuote());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        Observable observableDistinctUntilChanged5 = ObservablesKt.filterIsPresent(map6).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C2479613(getBindings().optionsSelectedPositionCard));
        Observable<R> map7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getSelectedPositionStatsData());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$7<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map7).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$27(this.f$0, (RollingSubheaderView.RollingSubheaderData) obj);
            }
        });
        Observable<R> map8 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getContractSelectorIntentKey());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$8<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        Observable observableDistinctUntilChanged7 = ObservablesKt.filterIsPresent(map8).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$30(this.f$0, (OptionChainIntentKey) obj);
            }
        });
        Observable<R> map9 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getOptionOrderFormIntentKey());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$9<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map9, "map(...)");
        Observable observableDistinctUntilChanged8 = ObservablesKt.filterIsPresent(map9).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged8), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$33(this.f$0, (OptionOrderIntentKey.FromOptionOrderBundle) obj);
            }
        });
        RdsTextButton optionsRollingLearnMore = getBindings().optionsRollingLearnMore;
        Intrinsics.checkNotNullExpressionValue(optionsRollingLearnMore, "optionsRollingLearnMore");
        OnClickListeners.onClick(optionsRollingLearnMore, new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRollingStrategyFragment.onResume$lambda$34(this.f$0);
            }
        });
        Observable<R> map10 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionRollingStrategyViewState) it).getRollingBlockingState());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionRollingStrategyFragment$onResume$$inlined$mapNotNull$10<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map10, "map(...)");
        Observable observableDistinctUntilChanged9 = ObservablesKt.filterIsPresent(map10).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged9), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$38(this.f$0, (OptionRollingStrategyViewState.RollingBlockingState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(OptionRollingStrategyFragment optionRollingStrategyFragment, Tuples2 tuples2) {
        OptionInstrument optionInstrument = (OptionInstrument) tuples2.component1();
        OptionPositionType optionPositionType = (OptionPositionType) tuples2.component2();
        int i = C24772R.string.options_rolling_title_text;
        OptionStrategyType optionStrategyTypeFrom = OptionStrategyType.INSTANCE.from(optionPositionType, optionInstrument.getContractType());
        Resources resources = optionRollingStrategyFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = optionRollingStrategyFragment.getString(i, OptionExtensions.getName(optionStrategyTypeFrom, resources, 1));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        optionRollingStrategyFragment.getBindings().optionsRollingTitle.setText(string2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(OptionRollingStrategyFragment optionRollingStrategyFragment, RollingContractCardView.RollingContractCardData rollingContractCardData) {
        RollingContractCardView rollingContractCardView = optionRollingStrategyFragment.getBindings().optionsCurrentPositionCard;
        Intrinsics.checkNotNull(rollingContractCardData);
        rollingContractCardView.bind(rollingContractCardData);
        optionRollingStrategyFragment.getBindings().loading.hide();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionRollingStrategyFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$6 */
    /* synthetic */ class C247976 extends FunctionReferenceImpl implements Function1<OptionQuote, Unit> {
        C247976(Object obj) {
            super(1, obj, RollingContractCardView.class, "bindQuote", "bindQuote(Lcom/robinhood/models/db/OptionQuote;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionQuote optionQuote) {
            invoke2(optionQuote);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionQuote p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RollingContractCardView) this.receiver).bindQuote(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16(final OptionRollingStrategyFragment optionRollingStrategyFragment, final OptionStatisticsFragmentKey optionStatisticsFragmentKey) {
        RollingContractCardView optionsCurrentPositionCard = optionRollingStrategyFragment.getBindings().optionsCurrentPositionCard;
        Intrinsics.checkNotNullExpressionValue(optionsCurrentPositionCard, "optionsCurrentPositionCard");
        OnClickListeners.onClick(optionsCurrentPositionCard, new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRollingStrategyFragment.onResume$lambda$16$lambda$15(this.f$0, optionStatisticsFragmentKey);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$16$lambda$15(OptionRollingStrategyFragment optionRollingStrategyFragment, OptionStatisticsFragmentKey optionStatisticsFragmentKey) {
        OptionRollingStrategyDuxo duxo = optionRollingStrategyFragment.getDuxo();
        Intrinsics.checkNotNull(optionStatisticsFragmentKey);
        duxo.logRollingStatisticsBottomSheet(optionStatisticsFragmentKey, OrderPositionEffect.CLOSE);
        Navigator navigator = optionRollingStrategyFragment.getNavigator();
        Context contextRequireContext = optionRollingStrategyFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, optionStatisticsFragmentKey, false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionRollingStrategyFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$9 */
    /* synthetic */ class C247989 extends FunctionReferenceImpl implements Function1<RollingContractCardView.RollingContractCardData, Unit> {
        C247989(Object obj) {
            super(1, obj, RollingContractCardView.class, "bind", "bind(Lcom/robinhood/android/optionsrolling/ui/view/RollingContractCardView$RollingContractCardData;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RollingContractCardView.RollingContractCardData rollingContractCardData) {
            invoke2(rollingContractCardData);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RollingContractCardView.RollingContractCardData p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RollingContractCardView) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$18(OptionRollingStrategyFragment optionRollingStrategyFragment, RollingContractCardView.RollingContractCardData rollingContractCardData) {
        optionRollingStrategyFragment.getDuxo().logRollingSummaryAppearEvent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$23(final OptionRollingStrategyFragment optionRollingStrategyFragment) {
        Observable<R> map = optionRollingStrategyFragment.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$lambda$23$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Object right;
                Intrinsics.checkNotNullParameter(it, "it");
                OptionRollingStrategyViewState optionRollingStrategyViewState = (OptionRollingStrategyViewState) it;
                OptionChainIntentKey initialContractSelectorIntentKey = optionRollingStrategyViewState.getInitialContractSelectorIntentKey();
                if (initialContractSelectorIntentKey != null) {
                    right = new Either.Left(initialContractSelectorIntentKey);
                } else {
                    OptionStatisticsFragmentKey selectedContractStatsKey = optionRollingStrategyViewState.getSelectedContractStatsKey();
                    right = selectedContractStatsKey != null ? new Either.Right(selectedContractStatsKey) : null;
                }
                return Optional3.asOptional(right);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24794xa9a813b<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(optionRollingStrategyFragment, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onResume$lambda$23$lambda$22(this.f$0, (Either) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$23$lambda$22(OptionRollingStrategyFragment optionRollingStrategyFragment, Either either) {
        if (either instanceof Either.Left) {
            ActivityResultLauncher<Intent> activityResultLauncher = optionRollingStrategyFragment.contractSelectorLauncher;
            Navigator navigator = optionRollingStrategyFragment.getNavigator();
            Context contextRequireContext = optionRollingStrategyFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, (IntentKey) ((Either.Left) either).getValue(), null, false, 12, null));
        } else {
            if (!(either instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionStatisticsFragmentKey optionStatisticsFragmentKey = (OptionStatisticsFragmentKey) ((Either.Right) either).getValue();
            optionRollingStrategyFragment.getDuxo().logRollingStatisticsBottomSheet(optionStatisticsFragmentKey, OrderPositionEffect.OPEN);
            Navigator navigator2 = optionRollingStrategyFragment.getNavigator();
            Context contextRequireContext2 = optionRollingStrategyFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator2, contextRequireContext2, optionStatisticsFragmentKey, false, false, false, null, false, null, false, false, null, null, 4084, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionRollingStrategyFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$onResume$13 */
    /* synthetic */ class C2479613 extends FunctionReferenceImpl implements Function1<OptionQuote, Unit> {
        C2479613(Object obj) {
            super(1, obj, RollingContractCardView.class, "bindQuote", "bindQuote(Lcom/robinhood/models/db/OptionQuote;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionQuote optionQuote) {
            invoke2(optionQuote);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionQuote p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RollingContractCardView) this.receiver).bindQuote(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$27(OptionRollingStrategyFragment optionRollingStrategyFragment, RollingSubheaderView.RollingSubheaderData rollingSubheaderData) throws Resources.NotFoundException {
        FragmentOptionRollingBinding bindings = optionRollingStrategyFragment.getBindings();
        RdsTextButton optionsRollingLearnMore = bindings.optionsRollingLearnMore;
        Intrinsics.checkNotNullExpressionValue(optionsRollingLearnMore, "optionsRollingLearnMore");
        optionsRollingLearnMore.setVisibility(rollingSubheaderData instanceof RollingSubheaderView.RollingSubheaderData.SelectContract ? 0 : 8);
        Group optionsRollingSummaryViews = bindings.optionsRollingSummaryViews;
        Intrinsics.checkNotNullExpressionValue(optionsRollingSummaryViews, "optionsRollingSummaryViews");
        optionsRollingSummaryViews.setVisibility(rollingSubheaderData instanceof RollingSubheaderView.RollingSubheaderData.RollingStats ? 0 : 8);
        RollingSubheaderView rollingSubheaderView = bindings.optionsRollingSubheaderView;
        Intrinsics.checkNotNull(rollingSubheaderData);
        rollingSubheaderView.bind(rollingSubheaderData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$30(final OptionRollingStrategyFragment optionRollingStrategyFragment, final OptionChainIntentKey optionChainIntentKey) {
        RdsButton optionsRollingEditContractBtn = optionRollingStrategyFragment.getBindings().optionsRollingEditContractBtn;
        Intrinsics.checkNotNullExpressionValue(optionsRollingEditContractBtn, "optionsRollingEditContractBtn");
        OnClickListeners.onClick(optionsRollingEditContractBtn, new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRollingStrategyFragment.onResume$lambda$30$lambda$29(this.f$0, optionChainIntentKey);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$30$lambda$29(OptionRollingStrategyFragment optionRollingStrategyFragment, OptionChainIntentKey optionChainIntentKey) {
        ActivityResultLauncher<Intent> activityResultLauncher = optionRollingStrategyFragment.contractSelectorLauncher;
        Navigator navigator = optionRollingStrategyFragment.getNavigator();
        Context contextRequireContext = optionRollingStrategyFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(optionChainIntentKey);
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, optionChainIntentKey, null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$33(final OptionRollingStrategyFragment optionRollingStrategyFragment, final OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        RdsButton optionsRollingContinueBtn = optionRollingStrategyFragment.getBindings().optionsRollingContinueBtn;
        Intrinsics.checkNotNullExpressionValue(optionsRollingContinueBtn, "optionsRollingContinueBtn");
        OnClickListeners.onClick(optionsRollingContinueBtn, new Function0() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionRollingStrategyFragment.onResume$lambda$33$lambda$32(this.f$0, fromOptionOrderBundle);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$33$lambda$32(OptionRollingStrategyFragment optionRollingStrategyFragment, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle) {
        ActivityResultLauncher<Intent> activityResultLauncher = optionRollingStrategyFragment.orderFormLauncher;
        Navigator navigator = optionRollingStrategyFragment.getNavigator();
        Context contextRequireContext = optionRollingStrategyFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(fromOptionOrderBundle);
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, fromOptionOrderBundle, null, false, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$34(OptionRollingStrategyFragment optionRollingStrategyFragment) {
        optionRollingStrategyFragment.getDuxo().optionsRollingLearnMoreClicked();
        Navigator navigator = optionRollingStrategyFragment.getNavigator();
        Context contextRequireContext = optionRollingStrategyFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new EducationLessonFragmentKeys2(OptionRollingContentful.OPTIONS_ROLLING_LEARN_MORE.getContentfulId(), "SOURCE_STRATEGY_ROLL"), false, false, true, false, null, false, null, null, 1004, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$38(OptionRollingStrategyFragment optionRollingStrategyFragment, OptionRollingStrategyViewState.RollingBlockingState rollingBlockingState) throws Resources.NotFoundException {
        OptionRollingStrategyDuxo duxo = optionRollingStrategyFragment.getDuxo();
        Intrinsics.checkNotNull(rollingBlockingState);
        duxo.logRollingBlockingState(rollingBlockingState);
        OptionRollingBottomSheetFragment.Companion companion = OptionRollingBottomSheetFragment.INSTANCE;
        int i = C24772R.id.dialog_id_options_rolling_bottom_sheet;
        StringResource title = rollingBlockingState.getTitle();
        Resources resources = optionRollingStrategyFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = title.getText(resources);
        StringResource description = rollingBlockingState.getDescription();
        Resources resources2 = optionRollingStrategyFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        CharSequence text2 = description.getText(resources2);
        StringResource secondaryButtonTitle = rollingBlockingState.getSecondaryButtonTitle();
        Resources resources3 = optionRollingStrategyFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        CharSequence text3 = secondaryButtonTitle.getText(resources3);
        Bundle bundle = new Bundle();
        bundle.putSerializable(BOTTOM_SHEET_BUNDLE, rollingBlockingState);
        OptionRollingBottomSheetFragment optionRollingBottomSheetFragment = (OptionRollingBottomSheetFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, text, null, text2, null, null, null, text3, null, false, false, null, bundle, null, false, true, false, false, null, null, null, 2060148, null));
        FragmentManager childFragmentManager = optionRollingStrategyFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        optionRollingBottomSheetFragment.show(childFragmentManager, "rollingBlockingState");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScarletManager.putOverlay$default(getScarletManager(), OptionRollingStrategyOverlay.INSTANCE, null, 2, null);
        final RhToolbar rhToolbarRequireToolbar = requireToolbar();
        LifecycleHost.DefaultImpls.bind$default(this, RxView.layoutChanges(rhToolbarRequireToolbar), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onStart$lambda$40$lambda$39(this.f$0, rhToolbarRequireToolbar, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$40$lambda$39(OptionRollingStrategyFragment optionRollingStrategyFragment, RhToolbar rhToolbar, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View toolbarBottom = optionRollingStrategyFragment.getBindings().toolbarBottom;
        Intrinsics.checkNotNullExpressionValue(toolbarBottom, "toolbarBottom");
        ViewsKt.setMarginTop(toolbarBottom, rhToolbar.getBottom());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ScarletManager.removeOverlay$default(getScarletManager(), OptionRollingStrategyOverlay.INSTANCE.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.optionsrolling.ui.view.OptionRollingBottomSheetFragment.Callbacks
    public void onGoBack() {
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment.onGoBack.1
            @Override // io.reactivex.functions.Function
            public final Optional<Map<String, JsonPrimitive<?>>> apply(OptionRollingStrategyViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getInstantCashSwitchToMarginInputParams());
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onGoBack$lambda$41(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGoBack$lambda$41(OptionRollingStrategyFragment optionRollingStrategyFragment, Optional optional) {
        if (((Map) optional.getOrNull()) != null) {
            optionRollingStrategyFragment.getDuxo().logDismissRollingUnsupportedInCashBottomSheet();
        }
        optionRollingStrategyFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionsrolling.ui.view.OptionRollingBottomSheetFragment.Callbacks
    public void onViewAccountHistory() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new AccountsHistoryContract.Key(null, null, null, null, false, null, 63, null), false, false, false, false, null, false, null, null, 1020, null);
        requireActivity().finish();
    }

    @Override // com.robinhood.android.optionsrolling.ui.view.OptionRollingBottomSheetFragment.Callbacks
    public void onUpgradeInstant() {
        Observable observableTake = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment.onUpgradeInstant.1
            @Override // io.reactivex.functions.Function
            public final Optional<Map<String, JsonPrimitive<?>>> apply(OptionRollingStrategyViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getInstantCashSwitchToMarginInputParams());
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionRollingStrategyFragment.onUpgradeInstant$lambda$42(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpgradeInstant$lambda$42(OptionRollingStrategyFragment optionRollingStrategyFragment, Optional optional) {
        Map map = (Map) optional.getOrNull();
        if (map != null) {
            optionRollingStrategyFragment.getDuxo().logLaunchMarginUpgrade();
            Navigator navigator = optionRollingStrategyFragment.getNavigator();
            Context contextRequireContext = optionRollingStrategyFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            optionRollingStrategyFragment.startActivity(InstantCashUtils.createIntentForMarginUpgrade(navigator, contextRequireContext, map));
        } else {
            Navigator navigator2 = optionRollingStrategyFragment.getNavigator();
            Context contextRequireContext2 = optionRollingStrategyFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, new LegacyIntentKey.InstantUpgrade(((Args) INSTANCE.getArgs((Fragment) optionRollingStrategyFragment)).getAccountNumber()), null, false, null, null, 60, null);
        }
        optionRollingStrategyFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* compiled from: OptionRollingStrategyFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "strategyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getStrategyCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final String strategyCode;

        /* compiled from: OptionRollingStrategyFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.strategyCode;
            }
            return args.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final Args copy(String accountNumber, String strategyCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            return new Args(accountNumber, strategyCode);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.strategyCode, args.strategyCode);
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.strategyCode.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", strategyCode=" + this.strategyCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeString(this.strategyCode);
        }

        public Args(String accountNumber, String strategyCode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            this.accountNumber = accountNumber;
            this.strategyCode = strategyCode;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }
    }

    /* compiled from: OptionRollingStrategyFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyFragment;", "Lcom/robinhood/android/optionsrolling/ui/OptionRollingStrategyFragment$Args;", "<init>", "()V", "BOTTOM_SHEET_BUNDLE", "", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionRollingStrategyFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionRollingStrategyFragment optionRollingStrategyFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionRollingStrategyFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionRollingStrategyFragment newInstance(Args args) {
            return (OptionRollingStrategyFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionRollingStrategyFragment optionRollingStrategyFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionRollingStrategyFragment, args);
        }
    }
}
