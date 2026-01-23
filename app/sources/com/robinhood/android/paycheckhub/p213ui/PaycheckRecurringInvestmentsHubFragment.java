package com.robinhood.android.paycheckhub.p213ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.databinding.FragmentPaycheckRecurringInvestmentsHubBinding;
import com.robinhood.android.rhy.contracts.PaycheckRecurringInvestmentsOnboardingIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckRecurringInvestmentsHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020#H\u0016J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020#2\u0006\u00107\u001a\u000208H\u0002J\u001e\u00109\u001a\u00020#2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020#H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR%\u0010\u001f\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0 ¢\u0006\u0002\b$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo;", "getDuxo", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckRecurringInvestmentsHubBinding;", "getBinding", "()Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckRecurringInvestmentsHubBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "investmentScheduleBind", "Lkotlin/Function2;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "", "Lkotlin/ExtensionFunctionType;", "stocksAndEtfsInvestmentScheduleAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "cryptoInvestmentScheduleAdapter", "brokerageCashScheduleAdapter", "retirementScheduleAdapter", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "bind", "state", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubViewState;", "createNewRecurringInvestment", "assetCategory", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "sypIntro", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "showDisclaimerDialog", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsHubFragment extends BaseFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<RdsRowView, UiPaycheckInvestmentSchedule> brokerageCashScheduleAdapter;
    private final GenericListAdapter<RdsRowView, UiPaycheckInvestmentSchedule> cryptoInvestmentScheduleAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    private final Function2<RdsRowView, UiPaycheckInvestmentSchedule, Unit> investmentScheduleBind;
    private final GenericListAdapter<RdsRowView, UiPaycheckInvestmentSchedule> retirementScheduleAdapter;
    private final GenericListAdapter<RdsRowView, UiPaycheckInvestmentSchedule> stocksAndEtfsInvestmentScheduleAdapter;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PaycheckRecurringInvestmentsHubFragment.class, "binding", "getBinding()Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckRecurringInvestmentsHubBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public PaycheckRecurringInvestmentsHubFragment() {
        super(C25434R.layout.fragment_paycheck_recurring_investments_hub);
        this.eventScreen = new Screen(Screen.Name.PAYCHECK_INVESTMENT_HUB, null, null, null, 14, null);
        this.duxo = OldDuxos.oldDuxo(this, PaycheckRecurringInvestmentsHubDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, PaycheckRecurringInvestmentsHubFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
        Function2<RdsRowView, UiPaycheckInvestmentSchedule, Unit> function2 = new Function2() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PaycheckRecurringInvestmentsHubFragment.investmentScheduleBind$lambda$1(this.f$0, (RdsRowView) obj, (UiPaycheckInvestmentSchedule) obj2);
            }
        };
        this.investmentScheduleBind = function2;
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.stocksAndEtfsInvestmentScheduleAdapter = companion.m2987of(companion2, equality, function2);
        this.cryptoInvestmentScheduleAdapter = companion.m2987of(companion2, equality, function2);
        this.brokerageCashScheduleAdapter = companion.m2987of(companion2, equality, function2);
        this.retirementScheduleAdapter = companion.m2987of(companion2, equality, function2);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
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

    private final PaycheckRecurringInvestmentsHubDuxo getDuxo() {
        return (PaycheckRecurringInvestmentsHubDuxo) this.duxo.getValue();
    }

    private final FragmentPaycheckRecurringInvestmentsHubBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPaycheckRecurringInvestmentsHubBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit investmentScheduleBind$lambda$1(final PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment, final RdsRowView rdsRowView, final UiPaycheckInvestmentSchedule paycheckInvestmentSchedule) throws Resources.NotFoundException {
        CharSequence text;
        Intrinsics.checkNotNullParameter(rdsRowView, "<this>");
        Intrinsics.checkNotNullParameter(paycheckInvestmentSchedule, "paycheckInvestmentSchedule");
        StringResource paycheckRecurringPrimaryText = UiPaycheckInvestmentSchedules2.getPaycheckRecurringPrimaryText(paycheckInvestmentSchedule);
        Resources resources = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsRowView.setPrimaryText(paycheckRecurringPrimaryText.getText(resources));
        StringResource paycheckRecurringSecondaryText = UiPaycheckInvestmentSchedules2.getPaycheckRecurringSecondaryText(paycheckInvestmentSchedule);
        if (paycheckRecurringSecondaryText != null) {
            Resources resources2 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = paycheckRecurringSecondaryText.getText(resources2);
        } else {
            text = null;
        }
        rdsRowView.setSecondaryText(text);
        rdsRowView.setPrimaryMetadataTextColor(UiPaycheckInvestmentSchedules2.getPaycheckRecurringPrimaryMetadataTextColor(paycheckInvestmentSchedule));
        rdsRowView.setMetadataPrimaryText(UiPaycheckInvestmentSchedules2.getPaycheckRecurringMetadataPrimaryText(paycheckInvestmentSchedule));
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsHubFragment.investmentScheduleBind$lambda$1$lambda$0(this.f$0, rdsRowView, paycheckInvestmentSchedule);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit investmentScheduleBind$lambda$1$lambda$0(PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment, RdsRowView rdsRowView, UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule) {
        Navigator navigator = paycheckRecurringInvestmentsHubFragment.getNavigator();
        android.content.Context context = rdsRowView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new InvestmentScheduleSettingsFragmentKey(uiPaycheckInvestmentSchedule.getInvestmentScheduleId(), false, 2, null), false, true, false, false, null, false, null, null, 992, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
        FragmentPaycheckRecurringInvestmentsHubBinding binding = getBinding();
        binding.stocksAndEtfsRecyclerView.setAdapter(this.stocksAndEtfsInvestmentScheduleAdapter);
        binding.cryptoRecyclerView.setAdapter(this.cryptoInvestmentScheduleAdapter);
        binding.brokerageCashRecyclerView.setAdapter(this.brokerageCashScheduleAdapter);
        binding.retirementRecyclerView.setAdapter(this.retirementScheduleAdapter);
        RdsButton rdsButton = binding.createNewPaycheckInvestmentButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsHubFragment.onViewCreated$lambda$6$lambda$5$lambda$3(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaycheckRecurringInvestmentsHubFragment.onViewCreated$lambda$6$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$6$lambda$5$lambda$3(PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment) {
        return new UserInteractionEventDescriptor(null, paycheckRecurringInvestmentsHubFragment.getEventScreen(), UserInteractionEventData.Action.CREATE_PAYCHECK_INVESTMENT, null, null, null, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5$lambda$4(PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment) {
        createNewRecurringInvestment$default(paycheckRecurringInvestmentsHubFragment, null, PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.NONE, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C254561(this));
    }

    /* compiled from: PaycheckRecurringInvestmentsHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubFragment$onStart$1 */
    /* synthetic */ class C254561 extends FunctionReferenceImpl implements Function1<PaycheckRecurringInvestmentsHubViewState, Unit> {
        C254561(Object obj) {
            super(1, obj, PaycheckRecurringInvestmentsHubFragment.class, "bind", "bind(Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaycheckRecurringInvestmentsHubViewState paycheckRecurringInvestmentsHubViewState) {
            invoke2(paycheckRecurringInvestmentsHubViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PaycheckRecurringInvestmentsHubViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((PaycheckRecurringInvestmentsHubFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(PaycheckRecurringInvestmentsHubViewState state) {
        FragmentPaycheckRecurringInvestmentsHubBinding binding = getBinding();
        binding.paycheckRecurringInvestmentsTotalAmountInvested.setValueText(StringResources6.getText(this, state.getTotalAmountInvestedValueText()));
        binding.paycheckRecurringInvestmentsLastUpdated.setValueText(StringResources6.getText(this, state.getLastUpdatedAtValueText()));
        binding.paycheckRecurringInvestmentsActiveCount.setValueText(StringResources6.getText(this, state.getTotalActiveRecurringInvestmentsValueText()));
        binding.paycheckRecurringInvestmentsPausedCount.setValueText(StringResources6.getText(this, state.getTotalPausedRecurringInvestmentsValueText()));
        this.stocksAndEtfsInvestmentScheduleAdapter.submitList(state.getStockAndEtfsRecurringInvestments());
        RhTextView stocksAndEtfsEmptyMessage = binding.stocksAndEtfsEmptyMessage;
        Intrinsics.checkNotNullExpressionValue(stocksAndEtfsEmptyMessage, "stocksAndEtfsEmptyMessage");
        stocksAndEtfsEmptyMessage.setVisibility(state.getIsStocksAndEtfsEmptyMessageVisible() ? 0 : 8);
        this.cryptoInvestmentScheduleAdapter.submitList(state.getCryptoRecurringInvestments());
        RhTextView cryptoEmptyMessage = binding.cryptoEmptyMessage;
        Intrinsics.checkNotNullExpressionValue(cryptoEmptyMessage, "cryptoEmptyMessage");
        cryptoEmptyMessage.setVisibility(state.getIsCryptoEmptyContentVisible() ? 0 : 8);
        RhTextView paycheckRecurringInvestmentDisclaimer = binding.paycheckRecurringInvestmentDisclaimer;
        Intrinsics.checkNotNullExpressionValue(paycheckRecurringInvestmentDisclaimer, "paycheckRecurringInvestmentDisclaimer");
        int i = C25434R.string.paycheck_recurring_investment_disclaimer_collapsed;
        int i2 = C25434R.string.paycheck_recurring_investment_disclaimer_expand_cta;
        String string2 = com.robinhood.utils.extensions.ViewsKt.getString(paycheckRecurringInvestmentDisclaimer, i);
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        TextViewsKt.setTextWithLearnMore((TextView) paycheckRecurringInvestmentDisclaimer, (CharSequence) string2, true, true, numValueOf != null ? com.robinhood.utils.extensions.ViewsKt.getString(paycheckRecurringInvestmentDisclaimer, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.paycheckhub.ui.PaycheckRecurringInvestmentsHubFragment$bind$lambda$8$$inlined$setTextWithLearnMore$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.showDisclaimerDialog();
            }
        }, 1, (DefaultConstructorMarker) null));
        RhTextView brokerageCashEmptyMessage = binding.brokerageCashEmptyMessage;
        Intrinsics.checkNotNullExpressionValue(brokerageCashEmptyMessage, "brokerageCashEmptyMessage");
        brokerageCashEmptyMessage.setVisibility(state.getBrokerageCashEmptyContentVisible() ? 0 : 8);
        this.brokerageCashScheduleAdapter.submitList(state.getBrokerageCashRecurringTransfers());
        RhTextView rhTextView = binding.brokerageCashEmptyMessage;
        StringResource brokerageCashEmptyMessageText = state.getBrokerageCashEmptyMessageText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(brokerageCashEmptyMessageText.getText(resources));
        RhTextView retirementEmptyMessage = binding.retirementEmptyMessage;
        Intrinsics.checkNotNullExpressionValue(retirementEmptyMessage, "retirementEmptyMessage");
        retirementEmptyMessage.setVisibility(state.getRetirementEmptyContentVisible() ? 0 : 8);
        RhTextView rhTextView2 = binding.retirementEmptyMessage;
        StringResource retirementEmptyMessageText = state.getRetirementEmptyMessageText();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(retirementEmptyMessageText.getText(resources2));
        this.retirementScheduleAdapter.submitList(state.getRetirementRecurringTransfers());
    }

    static /* synthetic */ void createNewRecurringInvestment$default(PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment, RecurringInvestmentCategory recurringInvestmentCategory, PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro sypIntro, int i, Object obj) {
        if ((i & 1) != 0) {
            recurringInvestmentCategory = null;
        }
        if ((i & 2) != 0) {
            sypIntro = PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.INTRO_WITH_DIRECT_DEPOSIT;
        }
        paycheckRecurringInvestmentsHubFragment.createNewRecurringInvestment(recurringInvestmentCategory, sypIntro);
    }

    private final void createNewRecurringInvestment(RecurringInvestmentCategory assetCategory, PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro sypIntro) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PaycheckRecurringInvestmentsOnboardingIntentKey.PreSelectedCategory(assetCategory, sypIntro), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDisclaimerDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setId(C25434R.id.dialog_id_recurring_disclaimer).setUseDesignSystemOverlay(true).setMessage(C25434R.string.paycheck_recurring_investment_disclaimer_expanded, new Object[0]).setPositiveButton(C25434R.string.paycheck_recurring_investment_disclaimer_cta, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "rhy-syp-paycheck-recurring-disclaimer", false, 4, null);
    }

    /* compiled from: PaycheckRecurringInvestmentsHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PaycheckRecurringInvestmentsHub;", "<init>", "()V", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PaycheckRecurringInvestmentsHubFragment, LegacyFragmentKey.PaycheckRecurringInvestmentsHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PaycheckRecurringInvestmentsHub paycheckRecurringInvestmentsHub) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, paycheckRecurringInvestmentsHub);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PaycheckRecurringInvestmentsHub getArgs(PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment) {
            return (LegacyFragmentKey.PaycheckRecurringInvestmentsHub) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, paycheckRecurringInvestmentsHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PaycheckRecurringInvestmentsHubFragment newInstance(LegacyFragmentKey.PaycheckRecurringInvestmentsHub paycheckRecurringInvestmentsHub) {
            return (PaycheckRecurringInvestmentsHubFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, paycheckRecurringInvestmentsHub);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PaycheckRecurringInvestmentsHubFragment paycheckRecurringInvestmentsHubFragment, LegacyFragmentKey.PaycheckRecurringInvestmentsHub paycheckRecurringInvestmentsHub) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, paycheckRecurringInvestmentsHubFragment, paycheckRecurringInvestmentsHub);
        }
    }
}
