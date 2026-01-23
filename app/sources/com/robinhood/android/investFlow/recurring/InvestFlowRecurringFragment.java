package com.robinhood.android.investFlow.recurring;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.RecurringDatePickerActivity;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet;
import com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheetArgs;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.core.InvestFlowPaymentMethod;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowRecurringBinding;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
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
import p479j$.time.LocalDate;

/* compiled from: InvestFlowRecurringFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003KLMB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020 H\u0016J$\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0016J\"\u00101\u001a\u00020 2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020)H\u0016J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010=\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010>\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010?\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010@\u001a\u00020 2\u0006\u00109\u001a\u00020:H\u0002J\u0018\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020CH\u0002J\t\u0010E\u001a\u00020)H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GX\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Callbacks;", "Lcom/robinhood/android/common/recurring/bottomsheet/frequency/RecurringFrequencyBottomSheet$Callbacks;", "<init>", "()V", "activityCallbacks", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ActivityCallbacks;", "getActivityCallbacks", "()Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ActivityCallbacks;", "activityCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "parentFragmentCallbacks", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ParentFragmentCallbacks;", "getParentFragmentCallbacks", "()Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ParentFragmentCallbacks;", "parentFragmentCallbacks$delegate", "binding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "recurringAdapter", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onResume", "onPaymentMethodSelected", "isBackup", "", "paymentMethod", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "onFrequencySelected", "frequency", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "onBackPressed", "setViewState", "state", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;", "setSingleState", "setMultipleState", "showFrequencyBottomSheet", "showPrimaryPaymentMethodBottomSheet", "showBackupPaymentMethodBottomSheet", "showStartDateCalendar", "showDisclaimerBottomSheet", "title", "", "description", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "ActivityCallbacks", "ParentFragmentCallbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowRecurringFragment extends BaseFragment implements RegionGated, RecurringPaymentMethodBottomSheet.Callbacks, RecurringFrequencyBottomSheet.Callbacks {
    private static final int REQUEST_CODE_DATE_PICKER = 2000;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: activityCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 activityCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: parentFragmentCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 parentFragmentCallbacks;
    private InvestFlowRecurringAdapter recurringAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowRecurringFragment.class, "activityCallbacks", "getActivityCallbacks()Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ActivityCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowRecurringFragment.class, "parentFragmentCallbacks", "getParentFragmentCallbacks()Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ParentFragmentCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowRecurringFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowRecurringFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ActivityCallbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;", "frequency", "", "updateFrequency", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;)V", "", "isBackup", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "Lcom/robinhood/models/db/AchRelationship;", "achRelationship", "updatePaymentMethod", "(ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/models/db/AchRelationship;)V", "Lcom/robinhood/models/util/Money;", "totalAmount", "", "count", "j$/time/LocalDate", "startDate", "onRecurringBackPress", "(Lcom/robinhood/models/util/Money;ILj$/time/LocalDate;)V", "runRecurringOrderCheck", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ActivityCallbacks extends InvestFlowCoreDataProvider {
        void onRecurringBackPress(Money totalAmount, int count, LocalDate startDate);

        void runRecurringOrderCheck(Money totalAmount, int count, LocalDate startDate);

        void updateFrequency(InvestFlowFrequency.Recurring frequency);

        void updatePaymentMethod(boolean isBackup, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship);
    }

    /* compiled from: InvestFlowRecurringFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ParentFragmentCallbacks;", "", "onAmountSelected", "", "investmentScheduleId", "Ljava/util/UUID;", "initialAmount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "targetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ParentFragmentCallbacks {
        void onAmountSelected(UUID investmentScheduleId, InvestmentScheduleAmount initialAmount, ApiAssetType targetType);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InvestFlowRecurringFragment() {
        super(C19349R.layout.fragment_invest_flow_recurring);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE, RecurringInvestmentRegionGate.INSTANCE);
        this.activityCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ActivityCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InvestFlowRecurringFragment.ActivityCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.parentFragmentCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ParentFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, InvestFlowRecurringFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowRecurringDuxo.class);
        this.recurringAdapter = new InvestFlowRecurringAdapter();
    }

    private final ActivityCallbacks getActivityCallbacks() {
        return (ActivityCallbacks) this.activityCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final ParentFragmentCallbacks getParentFragmentCallbacks() {
        return (ParentFragmentCallbacks) this.parentFragmentCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final FragmentInvestFlowRecurringBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowRecurringBinding) value;
    }

    private final InvestFlowRecurringDuxo getDuxo() {
        return (InvestFlowRecurringDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, getActivityCallbacks().getCoreDataObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowRecurringFragment.onCreate$lambda$0(this.f$0, (InvestFlowCoreData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowCoreData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InvestFlowFrequency selectedFrequency = it.getSelectedFrequency();
        InvestFlowFrequency.Recurring recurring = selectedFrequency instanceof InvestFlowFrequency.Recurring ? (InvestFlowFrequency.Recurring) selectedFrequency : null;
        if (recurring == null) {
            throw new IllegalStateException("Frequency cannot change to non-recurring in recurring fragment");
        }
        investFlowRecurringFragment.getDuxo().onFrequencySelected(recurring.getFrequency());
        investFlowRecurringFragment.getDuxo().onPaymentMethodsUpdated(it.getPrimaryPaymentMethod(), it.getBackupPaymentMethod());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.recurringAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193841(this));
    }

    /* compiled from: InvestFlowRecurringFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$onResume$1 */
    /* synthetic */ class C193841 extends FunctionReferenceImpl implements Function1<InvestFlowRecurringViewState, Unit> {
        C193841(Object obj) {
            super(1, obj, InvestFlowRecurringFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowRecurringViewState investFlowRecurringViewState) throws Resources.NotFoundException {
            invoke2(investFlowRecurringViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowRecurringViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowRecurringFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet.Callbacks
    public void onPaymentMethodSelected(boolean isBackup, ApiInvestmentSchedule.SourceOfFunds paymentMethod, AchRelationship achRelationship) {
        getActivityCallbacks().updatePaymentMethod(isBackup, paymentMethod, achRelationship);
    }

    @Override // com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet.Callbacks
    public void onFrequencySelected(ApiInvestmentSchedule.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        getActivityCallbacks().updateFrequency(new InvestFlowFrequency.Recurring(frequency, null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2000) {
            Serializable serializableExtra = data != null ? data.getSerializableExtra(RecurringDatePickerActivity.ARG_SELECTED_DATE) : null;
            LocalDate localDate = serializableExtra instanceof LocalDate ? (LocalDate) serializableExtra : null;
            if (localDate != null) {
                getDuxo().selectStartDate(localDate);
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        InvestFlowRecurringViewState investFlowRecurringViewStateBlockingFirst = getDuxo().getStates().blockingFirst();
        getActivityCallbacks().onRecurringBackPress(investFlowRecurringViewStateBlockingFirst.getTotalAmount(), investFlowRecurringViewStateBlockingFirst.getNumInstruments(), investFlowRecurringViewStateBlockingFirst.getStartDate());
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final InvestFlowRecurringViewState state) throws Resources.NotFoundException {
        LocalDate localDateConsume;
        FragmentInvestFlowRecurringBinding binding = getBinding();
        if (state.getNumInstruments() == 1) {
            setSingleState(state);
        } else {
            setMultipleState(state);
        }
        InvestFlowRecurringFragment3.bindCommonViewState(binding, state, state.getBrokerageAccountType());
        RdsRowView frequencyRow = binding.frequencyRow;
        Intrinsics.checkNotNullExpressionValue(frequencyRow, "frequencyRow");
        OnClickListeners.onClick(frequencyRow, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setViewState$lambda$11$lambda$4(this.f$0, state);
            }
        });
        RdsRowView startDateRow = binding.startDateRow;
        Intrinsics.checkNotNullExpressionValue(startDateRow, "startDateRow");
        OnClickListeners.onClick(startDateRow, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setViewState$lambda$11$lambda$5(this.f$0, state);
            }
        });
        RdsRowView paymentMethodRow = binding.paymentMethodRow;
        Intrinsics.checkNotNullExpressionValue(paymentMethodRow, "paymentMethodRow");
        OnClickListeners.onClick(paymentMethodRow, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setViewState$lambda$11$lambda$6(this.f$0, state);
            }
        });
        RdsRowView backupPaymentMethodRow = binding.backupPaymentMethodRow;
        Intrinsics.checkNotNullExpressionValue(backupPaymentMethodRow, "backupPaymentMethodRow");
        OnClickListeners.onClick(backupPaymentMethodRow, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setViewState$lambda$11$lambda$7(this.f$0, state);
            }
        });
        RhTextView disclaimer = binding.disclaimer;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StringResource disclaimerText = state.getDisclaimerText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = disclaimerText.getText(resources);
        StringResource disclaimerCtaText = state.getDisclaimerCtaText();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        TextViewsKt.setTextWithLearnMore((TextView) disclaimer, text, false, true, disclaimerCtaText.getText(resources2).toString(), (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$setViewState$lambda$11$$inlined$setTextWithLearnMore$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InvestFlowRecurringFragment investFlowRecurringFragment = this.this$0;
                StringResource disclosureTitle = state.getDisclosureTitle();
                Resources resources3 = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                String string2 = disclosureTitle.getText(resources3).toString();
                StringResource disclosureDescription = state.getDisclosureDescription();
                Resources resources4 = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                investFlowRecurringFragment.showDisclaimerBottomSheet(string2, disclosureDescription.getText(resources4).toString());
            }
        }, 1, (DefaultConstructorMarker) null));
        final RdsButton rdsButton = binding.reviewButton;
        rdsButton.setEnabled(state.getReviewButtonEnabled());
        rdsButton.setLoading(state.isLoading());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setViewState$lambda$11$lambda$10$lambda$9(rdsButton, this);
            }
        });
        UiEvent<LocalDate> onReviewEvent = state.getOnReviewEvent();
        if (onReviewEvent == null || (localDateConsume = onReviewEvent.consume()) == null) {
            return;
        }
        getActivityCallbacks().runRecurringOrderCheck(state.getTotalAmount(), state.getNumInstruments(), localDateConsume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$4(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowRecurringViewState investFlowRecurringViewState) {
        investFlowRecurringFragment.showFrequencyBottomSheet(investFlowRecurringViewState);
        investFlowRecurringFragment.getDuxo().logRowTap(UserInteractionEventData.Action.SELECT_RECURRING_FREQUENCY, investFlowRecurringViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$5(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowRecurringViewState investFlowRecurringViewState) {
        investFlowRecurringFragment.showStartDateCalendar(investFlowRecurringViewState);
        investFlowRecurringFragment.getDuxo().logRowTap(UserInteractionEventData.Action.SET_RECURRING_START_DATE, investFlowRecurringViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$6(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowRecurringViewState investFlowRecurringViewState) {
        investFlowRecurringFragment.showPrimaryPaymentMethodBottomSheet(investFlowRecurringViewState);
        investFlowRecurringFragment.getDuxo().logRowTap(UserInteractionEventData.Action.ADD_PAYMENT_METHOD, investFlowRecurringViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$7(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowRecurringViewState investFlowRecurringViewState) {
        investFlowRecurringFragment.showBackupPaymentMethodBottomSheet(investFlowRecurringViewState);
        investFlowRecurringFragment.getDuxo().logRowTap(UserInteractionEventData.Action.SELECT_BACKUP_PAYMENT_METHOD, investFlowRecurringViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$11$lambda$10$lambda$9(RdsButton rdsButton, InvestFlowRecurringFragment investFlowRecurringFragment) {
        rdsButton.setLoading(true);
        investFlowRecurringFragment.getDuxo().onClickReviewBtn();
        return Unit.INSTANCE;
    }

    private final void setSingleState(final InvestFlowRecurringViewState state) {
        FragmentInvestFlowRecurringBinding binding = getBinding();
        ConstraintLayout totalRowContainer = binding.totalRowContainer;
        Intrinsics.checkNotNullExpressionValue(totalRowContainer, "totalRowContainer");
        totalRowContainer.setVisibility(8);
        RecyclerView recyclerView = binding.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(8);
        RdsTextButton expandBtn = binding.expandBtn;
        Intrinsics.checkNotNullExpressionValue(expandBtn, "expandBtn");
        expandBtn.setVisibility(8);
        View rowBottomDivider = binding.rowBottomDivider;
        Intrinsics.checkNotNullExpressionValue(rowBottomDivider, "rowBottomDivider");
        rowBottomDivider.setVisibility(8);
        RdsRowView rdsRowView = binding.amountRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(0);
        StringResource totalAmountMetadataPrimaryText = state.getTotalAmountMetadataPrimaryText();
        Resources resources = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsRowView.setMetadataPrimaryText(totalAmountMetadataPrimaryText.getText(resources));
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setSingleState$lambda$15$lambda$14$lambda$13(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSingleState$lambda$15$lambda$14$lambda$13(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowRecurringViewState investFlowRecurringViewState) {
        investFlowRecurringFragment.getParentFragmentCallbacks().onAmountSelected(investFlowRecurringViewState.getInstruments().get(0).getId(), new InvestmentScheduleAmount.Dollar(investFlowRecurringViewState.getTotalAmount()), ApiAssetType.EQUITY);
        return Unit.INSTANCE;
    }

    private final void setMultipleState(final InvestFlowRecurringViewState state) {
        final FragmentInvestFlowRecurringBinding binding = getBinding();
        this.recurringAdapter.setRows(state.getRows());
        RdsTextButton expandBtn = binding.expandBtn;
        Intrinsics.checkNotNullExpressionValue(expandBtn, "expandBtn");
        expandBtn.setVisibility(state.isExpandBtnVisible() ? 0 : 8);
        RdsTextButton rdsTextButton = binding.expandBtn;
        StringResource expandBtnText = state.getExpandBtnText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsTextButton.setText(expandBtnText.getText(resources));
        RdsTextButton expandBtn2 = binding.expandBtn;
        Intrinsics.checkNotNullExpressionValue(expandBtn2, "expandBtn");
        OnClickListeners.onClick(expandBtn2, new Function0() { // from class: com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowRecurringFragment.setMultipleState$lambda$17$lambda$16(state, this, binding);
            }
        });
        RhTextView rhTextView = binding.totalValueTxt;
        StringResource totalAmountMetadataPrimaryText = state.getTotalAmountMetadataPrimaryText();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView.setText(totalAmountMetadataPrimaryText.getText(resources2));
        RdsRowView amountRow = binding.amountRow;
        Intrinsics.checkNotNullExpressionValue(amountRow, "amountRow");
        amountRow.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMultipleState$lambda$17$lambda$16(InvestFlowRecurringViewState investFlowRecurringViewState, InvestFlowRecurringFragment investFlowRecurringFragment, FragmentInvestFlowRecurringBinding fragmentInvestFlowRecurringBinding) {
        investFlowRecurringViewState.toggleExpanded();
        investFlowRecurringFragment.recurringAdapter.setRows(investFlowRecurringViewState.getRows());
        RdsTextButton rdsTextButton = fragmentInvestFlowRecurringBinding.expandBtn;
        StringResource expandBtnText = investFlowRecurringViewState.getExpandBtnText();
        Resources resources = investFlowRecurringFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsTextButton.setText(expandBtnText.getText(resources));
        return Unit.INSTANCE;
    }

    private final void showFrequencyBottomSheet(InvestFlowRecurringViewState state) {
        RecurringFrequencyBottomSheet recurringFrequencyBottomSheetNewInstance = RecurringFrequencyBottomSheet.INSTANCE.newInstance(null, state.getFrequency(), state.isCrypto(), state.getStartDate(), null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recurringFrequencyBottomSheetNewInstance.show(childFragmentManager, "frequencySheet");
    }

    private final void showPrimaryPaymentMethodBottomSheet(InvestFlowRecurringViewState state) {
        RecurringPaymentMethodBottomSheet.Companion companion = RecurringPaymentMethodBottomSheet.INSTANCE;
        InvestFlowPaymentMethod primaryPaymentMethod = state.getPrimaryPaymentMethod();
        RecurringPaymentMethodBottomSheet recurringPaymentMethodBottomSheet = (RecurringPaymentMethodBottomSheet) companion.newInstance((Parcelable) new RecurringPaymentMethodBottomSheetArgs(null, primaryPaymentMethod != null ? primaryPaymentMethod.getSourceOfFunds() : null, state.getPrimaryPaymentMethod() instanceof InvestFlowPaymentMethod.Ach ? ((InvestFlowPaymentMethod.Ach) state.getPrimaryPaymentMethod()).getAchRelationship() : null, false, state.isCrypto(), null, ((InvestFlowRecurringArgs) INSTANCE.getArgs((Fragment) this)).getShowPaymentMethodAnnotation()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recurringPaymentMethodBottomSheet.show(childFragmentManager, "primaryPaymentMethodSheet");
    }

    private final void showBackupPaymentMethodBottomSheet(InvestFlowRecurringViewState state) {
        RecurringPaymentMethodBottomSheet.Companion companion = RecurringPaymentMethodBottomSheet.INSTANCE;
        InvestFlowPaymentMethod backupPaymentMethod = state.getBackupPaymentMethod();
        RecurringPaymentMethodBottomSheet recurringPaymentMethodBottomSheet = (RecurringPaymentMethodBottomSheet) companion.newInstance((Parcelable) new RecurringPaymentMethodBottomSheetArgs(null, backupPaymentMethod != null ? backupPaymentMethod.getSourceOfFunds() : null, state.getBackupPaymentMethod() instanceof InvestFlowPaymentMethod.Ach ? ((InvestFlowPaymentMethod.Ach) state.getBackupPaymentMethod()).getAchRelationship() : null, true, state.isCrypto(), null, ((InvestFlowRecurringArgs) INSTANCE.getArgs((Fragment) this)).getShowPaymentMethodAnnotation()));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recurringPaymentMethodBottomSheet.show(childFragmentManager, "backupPaymentMethodSheet");
    }

    private final void showStartDateCalendar(InvestFlowRecurringViewState state) {
        RecurringDatePickerActivity.Companion companion = RecurringDatePickerActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LocalDate startDate = state.getStartDate();
        Intrinsics.checkNotNull(startDate);
        startActivityForResult(companion.getIntent(contextRequireContext, startDate, state.isCrypto()), 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDisclaimerBottomSheet(String title, String description) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, title, null, description, null, getResources().getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE);
    }

    /* compiled from: InvestFlowRecurringFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringArgs;", "<init>", "()V", "REQUEST_CODE_DATE_PICKER", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowRecurringFragment, InvestFlowRecurringArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowRecurringArgs getArgs(InvestFlowRecurringFragment investFlowRecurringFragment) {
            return (InvestFlowRecurringArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowRecurringFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowRecurringFragment newInstance(InvestFlowRecurringArgs investFlowRecurringArgs) {
            return (InvestFlowRecurringFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowRecurringArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowRecurringFragment investFlowRecurringFragment, InvestFlowRecurringArgs investFlowRecurringArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowRecurringFragment, investFlowRecurringArgs);
        }
    }
}
