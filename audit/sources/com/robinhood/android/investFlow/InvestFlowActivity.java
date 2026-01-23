package com.robinhood.android.investFlow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.investflow.allocationprovider.IllegalAllocationException;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.FragmentContainerLayout;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.embeddedDetail.EmbeddedDetailArgs;
import com.robinhood.android.embeddedDetail.EmbeddedDetailFragment;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertFragment;
import com.robinhood.android.investFlow.InvestFlowViewState;
import com.robinhood.android.investFlow.amount.InvestFlowAmountFragment;
import com.robinhood.android.investFlow.core.InvestFlowBasketItem;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.databinding.ActivityInvestFlowBinding;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyArgs;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment;
import com.robinhood.android.investFlow.search.InvestFlowSearchArgs;
import com.robinhood.android.investFlow.search.InvestFlowSearchFragment;
import com.robinhood.android.investFlow.split.InvestFlowSplitArgs;
import com.robinhood.android.investFlow.split.InvestFlowSplitFragment;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowManifest;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.lib.onboarding.RetirementPostSignupFlowLauncher;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: InvestFlowActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f:\u0002\u0093\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J/\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u000eJ\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u000eJ\u0019\u0010-\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020+H\u0014¢\u0006\u0004\b4\u0010.J\u001d\u00108\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0016¢\u0006\u0004\b8\u00109J;\u0010@\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\u0006\u00100\u001a\u00020<2\u0006\u0010=\u001a\u00020\"2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00110>H\u0016¢\u0006\u0004\b@\u0010AJ'\u0010F\u001a\u00020\u00112\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020\"H\u0016¢\u0006\u0004\bF\u0010GJ5\u0010N\u001a\u00020\u00112\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010J2\b\u0010L\u001a\u0004\u0018\u00010B2\u0006\u0010M\u001a\u00020\"H\u0016¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020\u00112\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P05H\u0016¢\u0006\u0004\bR\u00109J\u0017\u0010T\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\u001dH\u0016¢\u0006\u0004\bT\u0010UJ\u0019\u0010X\u001a\u00020\u00112\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00112\u0006\u0010S\u001a\u00020ZH\u0016¢\u0006\u0004\b[\u0010\\J+\u0010]\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\"2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\b]\u0010^J)\u0010b\u001a\u00020\u00112\u0006\u0010_\u001a\u00020B2\u0006\u0010D\u001a\u00020/2\b\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\bb\u0010cJ'\u0010d\u001a\u00020\u00112\u0006\u0010_\u001a\u00020B2\u0006\u0010D\u001a\u00020/2\u0006\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\bd\u0010cJ\u000f\u0010e\u001a\u00020\u0011H\u0017¢\u0006\u0004\be\u0010\u000eJ\u0017\u0010h\u001a\u00020\"2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ\u0015\u0010l\u001a\u00020\u00112\u0006\u0010k\u001a\u00020j¢\u0006\u0004\bl\u0010mJ!\u0010o\u001a\u00020\"2\u0006\u00100\u001a\u00020/2\b\u0010n\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\bo\u0010pJ\u0010\u0010q\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\bq\u0010$R\u001b\u0010w\u001a\u00020r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R2\u0010\u0086\u0001\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020~8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/investFlow/search/InvestFlowSearchFragment$Callbacks;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment$Callbacks;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$Callbacks;", "Lcom/robinhood/android/investFlow/frequency/InvestFlowFrequencyFragment$Callbacks;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment$Callbacks;", "Lcom/robinhood/android/investFlow/recurring/InvestFlowRecurringFragment$ActivityCallbacks;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Callbacks;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Callbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "<init>", "()V", "Lcom/robinhood/android/investFlow/InvestFlowViewState;", "state", "", "setViewState", "(Lcom/robinhood/android/investFlow/InvestFlowViewState;)V", "", "accountNumber", "showDiscoveryPage", "(Ljava/lang/String;)V", "showFrequencyPage", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;", "manifest", "Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;", "allocationProviderArgs", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "selectedFrequency", "showAllocationPage", "(Ljava/lang/String;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowManifest;Lcom/robinhood/android/recurring/contracts/investflow/AllocationStrategy;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)V", "showIllegalAllocationDialog", "", "shouldPromptForLockscreen", "()Z", "setupSubmitToolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "finish", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "id", "onDialogDismissed", "(I)V", "outState", "onSaveInstanceState", "", "Lcom/robinhood/android/investFlow/core/InvestFlowBasketItem;", "selectedItems", "completeSearch", "(Ljava/util/List;)V", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "apiAssetType", "Ljava/util/UUID;", "inBasket", "Lkotlin/Function1;", "onPrimaryButtonClicked", "showEmbeddedDetail", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;ZLkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/models/util/Money;", "amount", "count", "forceDefaultAllocation", "onAmountEntered", "(Lcom/robinhood/models/util/Money;IZ)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "sourceOfFunds", "Lcom/robinhood/models/db/AchRelationship;", "achRelationship", "accountBuyingPower", "isBackup", "onPaymentMethodSelected", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/util/Money;Z)V", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "assetAllocations", "onSplitConfirmed", "frequency", "onFrequencySelected", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;)V", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "nbboResponse", "runOneTimeOrderCheck", "(Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;)V", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;", "updateFrequency", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency$Recurring;)V", "updatePaymentMethod", "(ZLcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/models/db/AchRelationship;)V", "totalAmount", "j$/time/LocalDate", "startDate", "onRecurringBackPress", "(Lcom/robinhood/models/util/Money;ILj$/time/LocalDate;)V", "runRecurringOrderCheck", "onBackPressed", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "button", "onActionClicked", "(Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;)Z", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "allocation", "updateLoggingAllocation", "(Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;)V", "passthroughArgs", "onPositiveButtonClicked", "(ILandroid/os/Bundle;)Z", "onDismissUnsupportedFeatureDialog", "Lcom/robinhood/android/investFlow/databinding/ActivityInvestFlowBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding$feature_invest_flow_externalDebug", "()Lcom/robinhood/android/investFlow/databinding/ActivityInvestFlowBinding;", "binding", "Lcom/robinhood/android/investFlow/InvestFlowDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/investFlow/InvestFlowDuxo;", "duxo", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "<set-?>", "currentFlowStep$delegate", "Lkotlin/properties/ReadWriteProperty;", "getCurrentFlowStep", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", "setCurrentFlowStep", "(Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;)V", "currentFlowStep", "equityOrderCheckAlertCallbacks", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertFragment$Callbacks;", "Lio/reactivex/Observable;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreData;", "getCoreDataObservable", "()Lio/reactivex/Observable;", "coreDataObservable", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowActivity extends BaseActivity implements RhDialogFragment.OnDismissListener, RegionGated, InvestFlowSearchFragment.Callbacks, InvestFlowAmountFragment.Callbacks, InvestFlowSplitFragment.Callbacks, InvestFlowFrequencyFragment.Callbacks, InvestFlowMultipleNbboFragment.Callbacks, InvestFlowRecurringFragment.ActivityCallbacks, InvestFlowPaymentMethodFragment.Callbacks, EquityOrderChecksAlertFragment.Callbacks, InvestFlowCoreDataProvider {
    private static final String ILLEGAL_ALLOCATION_TAG = "invest_flow_illegal_allocation_dialog";
    private static final String INVEST_FLOW_CURRENT_STEP = "invest_flow_current_step";
    private EquityOrderChecksAlertFragment.Callbacks equityOrderCheckAlertCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowActivity.class, "binding", "getBinding$feature_invest_flow_externalDebug()Lcom/robinhood/android/investFlow/databinding/ActivityInvestFlowBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(InvestFlowActivity.class, "currentFlowStep", "getCurrentFlowStep()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowStep;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, InvestFlowActivity2.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, InvestFlowDuxo.class);

    /* renamed from: currentFlowStep$delegate, reason: from kotlin metadata */
    private final Interfaces3 currentFlowStep = (Interfaces3) BindSavedState2.savedParcelable(this, InvestFlowStep.Discovery.INSTANCE).provideDelegate(this, $$delegatedProperties[1]);

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final ActivityInvestFlowBinding getBinding$feature_invest_flow_externalDebug() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityInvestFlowBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestFlowDuxo getDuxo() {
        return (InvestFlowDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestFlowStep getCurrentFlowStep() {
        return (InvestFlowStep) this.currentFlowStep.getValue(this, $$delegatedProperties[1]);
    }

    private final void setCurrentFlowStep(InvestFlowStep investFlowStep) {
        this.currentFlowStep.setValue(this, $$delegatedProperties[1], investFlowStep);
    }

    @Override // com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider
    public Observable<InvestFlowCoreData> getCoreDataObservable() {
        Observable<InvestFlowViewState> states = getDuxo().getStates();
        final InvestFlowActivity3 investFlowActivity3 = new PropertyReference1Impl() { // from class: com.robinhood.android.investFlow.InvestFlowActivity$coreDataObservable$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((InvestFlowViewState) obj).getCoreData();
            }
        };
        Observable<InvestFlowCoreData> observableDistinctUntilChanged = states.map(new Function(investFlowActivity3) { // from class: com.robinhood.android.investFlow.InvestFlowActivity$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(investFlowActivity3, "function");
                this.function = investFlowActivity3;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return RetirementLastKnownEntryPointManager.INSTANCE.isAuthenticationRequired();
    }

    public final void setupSubmitToolbar() {
        getWindow().setStatusBarColor(ThemeColors.getThemeColor(this, C20690R.attr.colorPrimary));
        super.hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        RetirementPostSignupFlowLauncher.launchPostSignUpIfFromOnboardingUpsell(getNavigator(), this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C19349R.layout.activity_invest_flow);
        Companion companion = INSTANCE;
        String accountNumber = ((InvestFlowIntentKey) companion.getExtras((Activity) this)).getAccountNumber();
        getDuxo().setAccountNumber(accountNumber);
        if (savedInstanceState == null) {
            InvestFlowStep initialStep = ((InvestFlowIntentKey) companion.getExtras((Activity) this)).getInitialStep();
            InvestFlowStep.Discovery discovery = InvestFlowStep.Discovery.INSTANCE;
            if (Intrinsics.areEqual(initialStep, discovery)) {
                setCurrentFlowStep(discovery);
                Intrinsics.checkNotNull(accountNumber);
                if (accountNumber.length() <= 0) {
                    throw new IllegalStateException("need an account number to start from the discovery screen");
                }
                showDiscoveryPage(accountNumber);
            } else {
                InvestFlowStep.Frequency frequency = InvestFlowStep.Frequency.INSTANCE;
                if (Intrinsics.areEqual(initialStep, frequency)) {
                    List<UUID> instrumentIds = ((InvestFlowIntentKey) companion.getExtras((Activity) this)).getManifest().getInstrumentIds();
                    if (instrumentIds.isEmpty()) {
                        throw new IllegalStateException("must provide selected uuids if start from the frequency screen");
                    }
                    Intrinsics.checkNotNull(accountNumber);
                    if (accountNumber.length() <= 0) {
                        throw new IllegalStateException("need an account number to start from the frequency screen");
                    }
                    getDuxo().setSelectedItemsFromExternal(instrumentIds);
                    setCurrentFlowStep(frequency);
                    showFrequencyPage(accountNumber);
                } else {
                    InvestFlowStep.Allocation allocation = InvestFlowStep.Allocation.INSTANCE;
                    if (Intrinsics.areEqual(initialStep, allocation)) {
                        InvestFlowFrequency selectedFrequency = ((InvestFlowIntentKey) companion.getExtras((Activity) this)).getSelectedFrequency();
                        if (accountNumber == null) {
                            throw new IllegalStateException("need an account number");
                        }
                        if (selectedFrequency == null) {
                            throw new IllegalStateException("need selected frequency");
                        }
                        InvestFlowManifest manifest = ((InvestFlowIntentKey) companion.getExtras((Activity) this)).getManifest();
                        if (manifest.getInstrumentIds().isEmpty()) {
                            throw new IllegalStateException("must provide selected uuids if start from the allocation screen");
                        }
                        getDuxo().setSelectedItemsFromExternal(manifest.getInstrumentIds());
                        getDuxo().setRecurringFrequency(InvestFlowFrequency.Once.INSTANCE, "asset home invest flow");
                        setCurrentFlowStep(allocation);
                        showAllocationPage(accountNumber, manifest, ((InvestFlowIntentKey) companion.getExtras((Activity) this)).getAllocationStrategy(), selectedFrequency);
                    } else {
                        throw new IllegalStateException("only support ENTRY, DISCOVERY, FREQUENCY, ALLOCATION as initialStep");
                    }
                }
            }
        } else {
            InvestFlowStep investFlowStep = (InvestFlowStep) savedInstanceState.getParcelable(INVEST_FLOW_CURRENT_STEP);
            if (investFlowStep == null) {
                investFlowStep = InvestFlowStep.Discovery.INSTANCE;
            }
            setCurrentFlowStep(investFlowStep);
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193417(this));
    }

    /* compiled from: InvestFlowActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.InvestFlowActivity$onCreate$7 */
    /* synthetic */ class C193417 extends FunctionReferenceImpl implements Function1<InvestFlowViewState, Unit> {
        C193417(Object obj) {
            super(1, obj, InvestFlowActivity.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/InvestFlowViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowViewState investFlowViewState) throws Throwable {
            invoke2(investFlowViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowActivity) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C19349R.id.dialog_id_invalid_account_type) {
            finish();
        } else if (id == C11048R.id.dialog_id_generic_error) {
            getOnBackPressedDispatcher().onBackPressed();
        }
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable(INVEST_FLOW_CURRENT_STEP, getCurrentFlowStep());
    }

    @Override // com.robinhood.android.investFlow.search.InvestFlowSearchFragment.Callbacks
    public void completeSearch(List<? extends InvestFlowBasketItem> selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        getDuxo().setSelectedItems(selectedItems);
        getDuxo().advanceFlow(getCurrentFlowStep());
    }

    @Override // com.robinhood.android.investFlow.search.InvestFlowSearchFragment.Callbacks
    public void showEmbeddedDetail(ApiAssetType apiAssetType, UUID id, boolean inBasket, Function1<? super UUID, Unit> onPrimaryButtonClicked) {
        Intrinsics.checkNotNullParameter(apiAssetType, "apiAssetType");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClicked, "onPrimaryButtonClicked");
        getDuxo().showEmbeddedDetail(apiAssetType, id, inBasket, onPrimaryButtonClicked);
    }

    @Override // com.robinhood.android.investFlow.amount.InvestFlowAmountFragment.Callbacks
    public void onAmountEntered(Money amount, int count, boolean forceDefaultAllocation) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        getDuxo().setTotal(amount, count, forceDefaultAllocation, InvestFlowStep.Amount.INSTANCE, true);
    }

    @Override // com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment.Callbacks
    public void onPaymentMethodSelected(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, Money accountBuyingPower, boolean isBackup) {
        if (!isBackup) {
            getDuxo().setPrimaryPaymentMethod(sourceOfFunds, achRelationship, accountBuyingPower);
        } else {
            getDuxo().setBackupPaymentMethod(sourceOfFunds, achRelationship);
        }
        getDuxo().advanceFlow(getCurrentFlowStep());
    }

    @Override // com.robinhood.android.investFlow.split.InvestFlowSplitFragment.Callbacks
    public void onSplitConfirmed(List<ApiAssetAllocation> assetAllocations) {
        Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
        getDuxo().setAssetAmounts(assetAllocations);
        getDuxo().advanceFlow(InvestFlowStep.Allocation.INSTANCE);
    }

    @Override // com.robinhood.android.investFlow.frequency.InvestFlowFrequencyFragment.Callbacks
    public void onFrequencySelected(InvestFlowFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        InvestFlowDuxo duxo = getDuxo();
        String simpleName = Reflection.getOrCreateKotlinClass(InvestFlowFrequencyFragment.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
        }
        duxo.setRecurringFrequency(frequency, simpleName);
        getDuxo().advanceFlow(InvestFlowStep.Frequency.INSTANCE);
    }

    @Override // com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment.Callbacks
    public void runOneTimeOrderCheck(ApiInvestFlowNbboResponse nbboResponse) {
        getDuxo().setNbboResponse(nbboResponse);
        getDuxo().advanceFlow(getCurrentFlowStep());
    }

    @Override // com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment.ActivityCallbacks
    public void updateFrequency(InvestFlowFrequency.Recurring frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        InvestFlowDuxo duxo = getDuxo();
        String simpleName = Reflection.getOrCreateKotlinClass(InvestFlowRecurringFragment.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "g";
        }
        duxo.setRecurringFrequency(frequency, simpleName);
    }

    @Override // com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment.ActivityCallbacks
    public void updatePaymentMethod(boolean isBackup, ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship) {
        if (!isBackup) {
            InvestFlowDuxo.setPrimaryPaymentMethod$default(getDuxo(), sourceOfFunds, achRelationship, null, 4, null);
        } else {
            getDuxo().setBackupPaymentMethod(sourceOfFunds, achRelationship);
        }
    }

    @Override // com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment.ActivityCallbacks
    public void onRecurringBackPress(Money totalAmount, int count, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        InvestFlowDuxo.setTotal$default(getDuxo(), totalAmount, count, false, null, false, 24, null);
        if (startDate != null) {
            getDuxo().setStartDate(startDate);
        }
    }

    @Override // com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment.ActivityCallbacks
    public void runRecurringOrderCheck(Money totalAmount, int count, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        InvestFlowDuxo.setTotal$default(getDuxo(), totalAmount, count, false, null, false, 24, null);
        getDuxo().setStartDate(startDate);
        getDuxo().advanceFlow(getCurrentFlowStep());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        InvestFlowStep currentFlowStep;
        super.onBackPressed();
        InvestFlowViewState investFlowViewStateBlockingFirst = getDuxo().getStates().blockingFirst();
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment == null || (currentFlowStep = InvestFlowStepExtension.mapToInvestFlowStep$default(currentFragment, Boolean.valueOf(investFlowViewStateBlockingFirst.isRecurring()), investFlowViewStateBlockingFirst.getNumTargets(), null, 4, null)) == null) {
            currentFlowStep = getCurrentFlowStep();
        }
        setCurrentFlowStep(currentFlowStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final InvestFlowViewState state) throws Throwable {
        InvestFlowActivity investFlowActivity;
        Throwable thConsume;
        InvestFlowStep investFlowStepConsume;
        VisibleEquityOrderChecksAlert visibleEquityOrderChecksAlertConsume;
        final InvestFlowViewState.EmbeddedDetailData embeddedDetailDataConsume;
        UiEvent<Unit> invalidAccountTypeUiEvent = state.getInvalidAccountTypeUiEvent();
        if ((invalidAccountTypeUiEvent != null ? invalidAccountTypeUiEvent.consume() : null) != null) {
            RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setId(C19349R.id.dialog_id_invalid_account_type).setTitle(C19349R.string.invest_flow_invalid_account_type_dialog_title, new Object[0]).setMessage(C19349R.string.invest_flow_invalid_account_type_dialog_message, new Object[0]).setPositiveButton(C19349R.string.invest_flow_invalid_account_type_dialog_cta, new Object[0]);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "invest-flow-invalid-account-type", false, 4, null);
        }
        UiEvent<InvestFlowViewState.EmbeddedDetailData> showEmbeddedDetailUiEvent = state.getShowEmbeddedDetailUiEvent();
        if (showEmbeddedDetailUiEvent != null && (embeddedDetailDataConsume = showEmbeddedDetailUiEvent.consume()) != null) {
            EmbeddedDetailFragment embeddedDetailFragment = (EmbeddedDetailFragment) EmbeddedDetailFragment.INSTANCE.newInstance((Parcelable) new EmbeddedDetailArgs(embeddedDetailDataConsume.getApiAssetType(), embeddedDetailDataConsume.getId(), embeddedDetailDataConsume.getInBasket(), embeddedDetailDataConsume.getBasketFull()));
            embeddedDetailFragment.setCallbacks(new EmbeddedDetailFragment.Callbacks() { // from class: com.robinhood.android.investFlow.InvestFlowActivity$setViewState$1$1
                @Override // com.robinhood.android.embeddedDetail.EmbeddedDetailFragment.Callbacks
                public void onPrimaryButtonClick(UUID id) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    embeddedDetailDataConsume.getOnPrimaryButtonClicked().invoke(id);
                    this.getSupportFragmentManager().popBackStackImmediate();
                }
            });
            com.robinhood.utils.extensions.Activity.hideKeyboard$default(this, false, 1, null);
            replaceFragment(embeddedDetailFragment);
        }
        UiEvent<VisibleEquityOrderChecksAlert> orderCheckUiEvent = state.getOrderCheckUiEvent();
        if (orderCheckUiEvent != null && (visibleEquityOrderChecksAlertConsume = orderCheckUiEvent.consume()) != null) {
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.EquityOrderChecksAlert(visibleEquityOrderChecksAlertConsume), null, 2, null).show(getSupportFragmentManager(), "server-side-order-check-failure");
        }
        UiEvent<InvestFlowStep> flowNavigationUiEvent = state.getFlowNavigationUiEvent();
        if (flowNavigationUiEvent != null && (investFlowStepConsume = flowNavigationUiEvent.consume()) != null) {
            if (Intrinsics.areEqual(investFlowStepConsume, InvestFlowStep.Complete.INSTANCE)) {
                finish();
            } else {
                replaceFragment(InvestFlowStepExtension.mapToFragment(investFlowStepConsume, state));
                setCurrentFlowStep(investFlowStepConsume);
            }
        }
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent == null || (thConsume = errorEvent.consume()) == null) {
            investFlowActivity = this;
        } else if (thConsume instanceof IllegalAllocationException) {
            showIllegalAllocationDialog();
            investFlowActivity = this;
        } else {
            investFlowActivity = this;
            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, investFlowActivity, thConsume, true, false, 0, null, 56, null);
        }
        investFlowActivity.equityOrderCheckAlertCallbacks = new EquityOrderChecksAlertFragment.Callbacks() { // from class: com.robinhood.android.investFlow.InvestFlowActivity.setViewState.5
            @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
            public boolean onActionClicked(ServerDrivenButton button) {
                Intrinsics.checkNotNullParameter(button, "button");
                if (state.getFailedOrderRequest() != null && state.getAccountNumber() != null) {
                    GenericAction typedAction = button.getTypedAction();
                    if (Intrinsics.areEqual(typedAction, GenericAction.DismissAction.INSTANCE)) {
                        this.getDuxo().advanceFlow(this.getCurrentFlowStep());
                    } else if (typedAction instanceof GenericAction.DeeplinkAction) {
                        Navigator.DefaultImpls.handleDeepLink$default(this.getNavigator(), this, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 44, null);
                    }
                }
                this.getDuxo().clearErrorState();
                return true;
            }
        };
    }

    private final void showDiscoveryPage(String accountNumber) {
        FragmentContainerLayout fragmentContainer = getBinding$feature_invest_flow_externalDebug().fragmentContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
        ScarletManager2.overrideAttribute(fragmentContainer, android.R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
        setFragment(C19349R.id.fragment_container, InvestFlowSearchFragment.INSTANCE.newInstance((Parcelable) new InvestFlowSearchArgs(null, accountNumber, ((InvestFlowIntentKey) INSTANCE.getExtras((Activity) this)).getLoggingParams(), 1, null)));
    }

    private final void showFrequencyPage(String accountNumber) {
        setFragment(C19349R.id.fragment_container, InvestFlowFrequencyFragment.INSTANCE.newInstance((Parcelable) new InvestFlowFrequencyArgs(false, null, ((InvestFlowIntentKey) INSTANCE.getExtras((Activity) this)).getRecurringOnly(), accountNumber, 3, null)));
    }

    private final void showAllocationPage(String accountNumber, InvestFlowManifest manifest, AllocationStrategy allocationProviderArgs, InvestFlowFrequency selectedFrequency) {
        setFragment(C19349R.id.fragment_container, InvestFlowSplitFragment.INSTANCE.newInstance((Parcelable) new InvestFlowSplitArgs(accountNumber, null, manifest, false, allocationProviderArgs, selectedFrequency)));
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        EquityOrderChecksAlertFragment.Callbacks callbacks = this.equityOrderCheckAlertCallbacks;
        if (callbacks == null) {
            Intrinsics.throwUninitializedPropertyAccessException("equityOrderCheckAlertCallbacks");
            callbacks = null;
        }
        return callbacks.onActionClicked(button);
    }

    public final void updateLoggingAllocation(InvestFlowContext.Allocation allocation) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        getDuxo().updateLoggingAllocation(allocation);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C19349R.id.dialog_id_illegal_allocation) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void showIllegalAllocationDialog() {
        int i;
        RhDialogFragment.Builder title = RhDialogFragment.INSTANCE.create(this).setId(C19349R.id.dialog_id_illegal_allocation).setTitle(C11048R.string.general_error_title, new Object[0]);
        if (BuildFlavors.INSTANCE.isDebugOrInternal()) {
            i = C19349R.string.invest_flow_allocation_error_internal_message;
        } else {
            i = C19349R.string.invest_flow_allocation_error_external_message;
        }
        RhDialogFragment.Builder message = title.setMessage(i, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, ILLEGAL_ALLOCATION_TAG, false, 4, null);
    }

    /* compiled from: InvestFlowActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/investFlow/InvestFlowActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/investFlow/InvestFlowActivity;", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowIntentKey;", "<init>", "()V", "INVEST_FLOW_CURRENT_STEP", "", "ILLEGAL_ALLOCATION_TAG", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<InvestFlowActivity, InvestFlowIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public InvestFlowIntentKey getExtras(InvestFlowActivity investFlowActivity) {
            return (InvestFlowIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, investFlowActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, InvestFlowIntentKey investFlowIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, investFlowIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, InvestFlowIntentKey investFlowIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, investFlowIntentKey);
        }
    }
}
