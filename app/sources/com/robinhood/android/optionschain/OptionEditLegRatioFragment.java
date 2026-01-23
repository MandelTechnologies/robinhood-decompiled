package com.robinhood.android.optionschain;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionEditLegRatioFragmentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.optionsstring.common.OptionInstruments;
import com.robinhood.android.options.optionsstring.common.OptionLegBundles;
import com.robinhood.android.optionschain.OptionEditLegRatioFragment;
import com.robinhood.android.optionschain.databinding.FragmentOptionEditLegRatioBinding;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OptionEditLegRatioFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0003/01B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u001eH\u0002J\t\u0010(\u001a\u00020)H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/optionschain/OptionEditLegRatioDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/OptionEditLegRatioDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "state", "Lcom/robinhood/android/optionschain/OptionEditLegRatioViewState;", "binding", "Lcom/robinhood/android/optionschain/databinding/FragmentOptionEditLegRatioBinding;", "getBinding", "()Lcom/robinhood/android/optionschain/databinding/FragmentOptionEditLegRatioBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "optionOrderLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "showZeroRatioDialog", "showAllSameRatioDialog", "showRatioLimitDialog", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "LegViewHolder", "EditLegAdapter", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionEditLegRatioFragment extends BaseFragment implements RegionGated {
    public static final String ERROR_ALERT_RATIO_LIMIT_IDENTIFIER = "ratio_limit";
    public static final String ERROR_ALERT_SAME_RATIO_IDENTIFIER = "same_ratio";
    public static final String ERROR_ALERT_ZERO_RATIO_IDENTIFIER = "zero_ratio";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final ActivityResultLauncher<Intent> optionOrderLauncher;
    private OptionEditLegRatioViewState state;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionEditLegRatioFragment.class, "binding", "getBinding()Lcom/robinhood/android/optionschain/databinding/FragmentOptionEditLegRatioBinding;", 0))};

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

    /* JADX WARN: Multi-variable type inference failed */
    public OptionEditLegRatioFragment() {
        super(C24135R.layout.fragment_option_edit_leg_ratio);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionEditLegRatioDuxo.class);
        this.state = new OptionEditLegRatioViewState(null, 1, 0 == true ? 1 : 0);
        this.binding = ViewBinding5.viewBinding(this, OptionEditLegRatioFragment3.INSTANCE);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment$optionOrderLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    fragmentActivityRequireActivity.setResult(-1);
                    fragmentActivityRequireActivity.finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.optionOrderLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionEditLegRatioDuxo getDuxo() {
        return (OptionEditLegRatioDuxo) this.duxo.getValue();
    }

    private final FragmentOptionEditLegRatioBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionEditLegRatioBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().setOptionOrderBundle(((OptionEditLegRatioFragmentKey) INSTANCE.getArgs((Fragment) this)).getOptionOrderIntentKeyWithBundle().getOptionOrderBundle());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<OptionEditLegRatioViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEditLegRatioFragment.onStart$lambda$0(this.f$0, (OptionEditLegRatioViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionEditLegRatioViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getIsSubmitButtomEnabled());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionEditLegRatioFragment.onStart$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, new Screen(Screen.Name.OPTION_EDIT_LEG_RATIO, null, null, null, 14, null), null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(OptionEditLegRatioFragment optionEditLegRatioFragment, OptionEditLegRatioViewState optionEditLegRatioViewState) {
        Intrinsics.checkNotNull(optionEditLegRatioViewState);
        optionEditLegRatioFragment.state = optionEditLegRatioViewState;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(OptionEditLegRatioFragment optionEditLegRatioFragment, Boolean bool) {
        RdsNumpadContainerView rdsNumpadContainerView = optionEditLegRatioFragment.getBinding().optionEditLegRatioNumpad;
        Intrinsics.checkNotNull(bool);
        rdsNumpadContainerView.setButtonEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        requireActivity().getWindow().setSoftInputMode(3);
        RecyclerView recyclerView = getBinding().optionEditLegRatioRecyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new EditLegAdapter());
        recyclerView.setItemAnimator(null);
        RdsNumpadContainerView rdsNumpadContainerView = getBinding().optionEditLegRatioNumpad;
        rdsNumpadContainerView.useDefaultKeyHandler();
        rdsNumpadContainerView.setOnButtonClick(new Function0() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionEditLegRatioFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(OptionEditLegRatioFragment optionEditLegRatioFragment) {
        if (optionEditLegRatioFragment.state.getHasZeroRatio()) {
            optionEditLegRatioFragment.showZeroRatioDialog();
        } else if (optionEditLegRatioFragment.state.getIsAllSameNonOneRatio()) {
            optionEditLegRatioFragment.showAllSameRatioDialog();
        } else if (optionEditLegRatioFragment.state.getShowRatioLimitErrorDialog()) {
            optionEditLegRatioFragment.showRatioLimitDialog();
        } else {
            ActivityResultLauncher<Intent> activityResultLauncher = optionEditLegRatioFragment.optionOrderLauncher;
            Navigator navigator = optionEditLegRatioFragment.getNavigator();
            Context contextRequireContext = optionEditLegRatioFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKeyWithBundle = ((OptionEditLegRatioFragmentKey) INSTANCE.getArgs((Fragment) optionEditLegRatioFragment)).getOptionOrderIntentKeyWithBundle();
            activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, optionOrderIntentKeyWithBundle.copy((16379 & 1) != 0 ? optionOrderIntentKeyWithBundle.defaultPricingSettingOverride : null, (16379 & 2) != 0 ? optionOrderIntentKeyWithBundle.initialAccountNumber : null, (16379 & 4) != 0 ? optionOrderIntentKeyWithBundle.optionOrderBundle : optionEditLegRatioFragment.state.getEditedOptionOrderBundle(optionOrderIntentKeyWithBundle.getOptionOrderBundle()), (16379 & 8) != 0 ? optionOrderIntentKeyWithBundle.orderToReplace : null, (16379 & 16) != 0 ? optionOrderIntentKeyWithBundle.orderIdToPlaceAgain : null, (16379 & 32) != 0 ? optionOrderIntentKeyWithBundle.prefilledOrderType : null, (16379 & 64) != 0 ? optionOrderIntentKeyWithBundle.prefilledTimeInForce : null, (16379 & 128) != 0 ? optionOrderIntentKeyWithBundle.shouldSetInitialFocusToLimitPrice : false, (16379 & 256) != 0 ? optionOrderIntentKeyWithBundle.shouldSetInitialFocusToStopPrice : false, (16379 & 512) != 0 ? optionOrderIntentKeyWithBundle.shouldIgnoreDefaultPricing : false, (16379 & 1024) != 0 ? optionOrderIntentKeyWithBundle.chainDisplayModeForLogging : null, (16379 & 2048) != 0 ? optionOrderIntentKeyWithBundle.source : null, (16379 & 4096) != 0 ? optionOrderIntentKeyWithBundle.strategyCode : null, (16379 & 8192) != 0 ? optionOrderIntentKeyWithBundle.transitionReason : null), null, false, 12, null));
        }
        return Unit.INSTANCE;
    }

    private final void showZeroRatioDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(C24135R.string.option_edit_leg_ratio_error_zero_ratio_title, new Object[0]).setMessage(C24135R.string.option_edit_leg_ratio_error_zero_ratio_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, ERROR_ALERT_ZERO_RATIO_IDENTIFIER, false, 4, null);
        OptionEditLegRatioFragment5.logErrorAlertAppear(getEventLogger(), ERROR_ALERT_ZERO_RATIO_IDENTIFIER);
    }

    private final void showAllSameRatioDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(C24135R.string.option_edit_leg_ratio_error_same_ratio_title, new Object[0]).setMessage(C24135R.string.option_edit_leg_ratio_error_same_ratio_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, ERROR_ALERT_SAME_RATIO_IDENTIFIER, false, 4, null);
        OptionEditLegRatioFragment5.logErrorAlertAppear(getEventLogger(), ERROR_ALERT_SAME_RATIO_IDENTIFIER);
    }

    private final void showRatioLimitDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(getString(C24135R.string.option_edit_leg_ratio_error_ratio_limit_title, 9)).setMessage(C24135R.string.option_edit_leg_ratio_error_ratio_limit_message, new Object[0]).setPositiveButton(C11048R.string.general_label_okay, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, ERROR_ALERT_RATIO_LIMIT_IDENTIFIER, false, 4, null);
        OptionEditLegRatioFragment5.logErrorAlertAppear(getEventLogger(), ERROR_ALERT_RATIO_LIMIT_IDENTIFIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionEditLegRatioFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment$LegViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment;Landroid/view/View;)V", "titleTxt", "Landroid/widget/TextView;", "subtitleTxt", "ratioEdt", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "disposable", "Lio/reactivex/disposables/Disposable;", "bind", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    final class LegViewHolder extends RecyclerView.ViewHolder {
        private Disposable disposable;
        private final RdsTextInputEditText ratioEdt;
        private final TextView subtitleTxt;
        final /* synthetic */ OptionEditLegRatioFragment this$0;
        private final TextView titleTxt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegViewHolder(OptionEditLegRatioFragment optionEditLegRatioFragment, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = optionEditLegRatioFragment;
            View viewFindViewById = itemView.findViewById(C24135R.id.edit_leg_ratio_row_title);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleTxt = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C24135R.id.edit_leg_ratio_row_subtitle);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.subtitleTxt = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(C24135R.id.edit_leg_ratio_row_contracts_edt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            RdsTextInputEditText rdsTextInputEditText = (RdsTextInputEditText) viewFindViewById3;
            this.ratioEdt = rdsTextInputEditText;
            LifecycleHost.DefaultImpls.bind$default(optionEditLegRatioFragment, ObservablesAndroid.observeOnMainThread(rdsTextInputEditText.focusChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment$LegViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionEditLegRatioFragment.LegViewHolder._init_$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(LegViewHolder legViewHolder, boolean z) {
            Editable text;
            if (z && (text = legViewHolder.ratioEdt.getText()) != null) {
                legViewHolder.ratioEdt.setSelection(text.length());
            }
            return Unit.INSTANCE;
        }

        public final void bind(final int index) {
            Disposable disposable = this.disposable;
            if (disposable != null) {
                disposable.dispose();
            }
            OptionLegBundle optionLegBundle = ((OptionEditLegRatioFragmentKey) OptionEditLegRatioFragment.INSTANCE.getArgs((Fragment) this.this$0)).getOptionOrderIntentKeyWithBundle().getOptionOrderBundle().getLegBundles().get(index);
            UiOptionChain uiOptionChain = optionLegBundle.getOptionConfigurationBundle().getOptionChainBundle().getUiOptionChain();
            TextView textView = this.titleTxt;
            OptionInstrument optionInstrument = optionLegBundle.getOptionInstrument();
            Resources resources = this.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            textView.setText(OptionInstruments.getInstrumentDetailRowTitleString(optionInstrument, resources, uiOptionChain.getUnderlyingType()));
            TextView textView2 = this.subtitleTxt;
            Resources resources2 = this.itemView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            textView2.setText(OptionLegBundles.getShoppingCartSubtitle(optionLegBundle, resources2, uiOptionChain.getOptionChain().getSettleOnOpen()));
            this.ratioEdt.setHint(String.valueOf(optionLegBundle.getRatio()));
            String editedRatioString = this.this$0.state.getEditedRatioString(index);
            this.ratioEdt.setText(editedRatioString);
            if (this.ratioEdt.hasFocus()) {
                this.ratioEdt.setSelection(editedRatioString.length());
            }
            Observable<CharSequence> observableSkipInitialValue = RxTextView.textChanges(this.ratioEdt).skipInitialValue();
            final OptionEditLegRatioFragment optionEditLegRatioFragment = this.this$0;
            this.disposable = observableSkipInitialValue.subscribe(new Consumer() { // from class: com.robinhood.android.optionschain.OptionEditLegRatioFragment$LegViewHolder$bind$1
                @Override // io.reactivex.functions.Consumer
                public final void accept(CharSequence charSequence) {
                    OptionEditLegRatioDuxo duxo = optionEditLegRatioFragment.getDuxo();
                    int i = index;
                    Intrinsics.checkNotNull(charSequence);
                    duxo.updateLegRatio(i, charSequence);
                }
            });
        }
    }

    /* compiled from: OptionEditLegRatioFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment$EditLegAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment$LegViewHolder;", "Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment;", "<init>", "(Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class EditLegAdapter extends RecyclerView.Adapter<LegViewHolder> {
        public EditLegAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public LegViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new LegViewHolder(OptionEditLegRatioFragment.this, ViewGroups.inflate$default(parent, C24135R.layout.row_edit_leg_ratio, false, 2, null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(LegViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.bind(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount */
        public int getSize() {
            return ((OptionEditLegRatioFragmentKey) OptionEditLegRatioFragment.INSTANCE.getArgs((Fragment) OptionEditLegRatioFragment.this)).getOptionOrderIntentKeyWithBundle().getOptionOrderBundle().getLegBundles().size();
        }
    }

    /* compiled from: OptionEditLegRatioFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/optionschain/OptionEditLegRatioFragment;", "Lcom/robinhood/android/options/contracts/OptionEditLegRatioFragmentKey;", "<init>", "()V", "ERROR_ALERT_ZERO_RATIO_IDENTIFIER", "", "ERROR_ALERT_SAME_RATIO_IDENTIFIER", "ERROR_ALERT_RATIO_LIMIT_IDENTIFIER", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OptionEditLegRatioFragment, OptionEditLegRatioFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OptionEditLegRatioFragmentKey optionEditLegRatioFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, optionEditLegRatioFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionEditLegRatioFragmentKey getArgs(OptionEditLegRatioFragment optionEditLegRatioFragment) {
            return (OptionEditLegRatioFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionEditLegRatioFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionEditLegRatioFragment newInstance(OptionEditLegRatioFragmentKey optionEditLegRatioFragmentKey) {
            return (OptionEditLegRatioFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionEditLegRatioFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionEditLegRatioFragment optionEditLegRatioFragment, OptionEditLegRatioFragmentKey optionEditLegRatioFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionEditLegRatioFragment, optionEditLegRatioFragmentKey);
        }
    }
}
