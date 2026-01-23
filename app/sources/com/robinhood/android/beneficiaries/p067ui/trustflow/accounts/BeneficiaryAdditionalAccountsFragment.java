package com.robinhood.android.beneficiaries.p067ui.trustflow.accounts;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateAdditionalAccountsBinding;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountViewModel;
import com.robinhood.android.beneficiaries.p067ui.trustflow.BeneficiaryTrustFlowToolbarViewState;
import com.robinhood.android.beneficiaries.p067ui.trustflow.accounts.BeneficiaryAdditionalAccountsEvent;
import com.robinhood.android.beneficiaries.p067ui.trustflow.accounts.BeneficiaryAdditionalAccountsViewState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.selectioncontrol.RdsCheckBoxRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003CDEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020<H\u0002J\t\u0010=\u001a\u00020>H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082.¢\u0006\u0002\n\u0000R(\u0010$\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010#0'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Callbacks;", "callbacks$delegate", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "selectedAccounts", "", "", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/view/ViewGroup;", "Lkotlin/Pair;", "accountsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsCheckBoxRowView;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState$AccountRowData;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "viewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryAdditionalAccountsFragment extends BaseRhBottomSheetDialogHostFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<RdsCheckBoxRowView, BeneficiaryAdditionalAccountsViewState.AccountRowData> accountsAdapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final CompositeAdapter compositeAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final SingleItemAdapter<ViewGroup, Tuples2<String, String>> headerAdapter;
    public Markwon markwon;
    private Set<String> selectedAccounts;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryAdditionalAccountsFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryAdditionalAccountsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Callbacks;", "", "onSubmitAdditionalAccounts", "", "additionalAccounts", "", "", "additionalAgreements", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSubmitAdditionalAccounts(List<String> additionalAccounts, List<ApiBeneficiaryAgreementViewModel> additionalAgreements);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

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

    public BeneficiaryAdditionalAccountsFragment() {
        super(C9637R.layout.fragment_beneficiary_create_additional_accounts);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryAdditionalAccountsFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, BeneficiaryAdditionalAccountsDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        int i = C9637R.layout.include_beneficiary_account_list_header;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        SingleItemAdapter<ViewGroup, Tuples2<String, String>> singleItemAdapterM2991of = companion.m2991of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BeneficiaryAdditionalAccountsFragment.headerAdapter$lambda$0(this.f$0, (ViewGroup) obj, (Tuples2) obj2);
            }
        });
        this.headerAdapter = singleItemAdapterM2991of;
        GenericListAdapter<RdsCheckBoxRowView, BeneficiaryAdditionalAccountsViewState.AccountRowData> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(RdsCheckBoxRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryAdditionalAccountsFragment.accountsAdapter$lambda$1((BeneficiaryAdditionalAccountsViewState.AccountRowData) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BeneficiaryAdditionalAccountsFragment.accountsAdapter$lambda$3(this.f$0, (RdsCheckBoxRowView) obj, (BeneficiaryAdditionalAccountsViewState.AccountRowData) obj2);
            }
        });
        this.accountsAdapter = genericListAdapterM2987of;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterM2991of, genericListAdapterM2987of});
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_ACCOUNT_SELECTION, null, ((Args) INSTANCE.getArgs((Fragment) this)).getAccountViewModel().getLogging_identifier(), null, 10, null);
    }

    private final FragmentBeneficiaryCreateAdditionalAccountsBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateAdditionalAccountsBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryAdditionalAccountsDuxo getDuxo() {
        return (BeneficiaryAdditionalAccountsDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit headerAdapter$lambda$0(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, ViewGroup of, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        ((TextView) of.findViewById(C9637R.id.header)).setText(str);
        TextView textView = (TextView) of.findViewById(C9637R.id.subtitle);
        Markwon markwon = beneficiaryAdditionalAccountsFragment.getMarkwon();
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(markwon.toMarkdown(str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object accountsAdapter$lambda$1(BeneficiaryAdditionalAccountsViewState.AccountRowData byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getAccount().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountsAdapter$lambda$3(final BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, RdsCheckBoxRowView of, final BeneficiaryAdditionalAccountsViewState.AccountRowData data) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(data, "data");
        final ApiCreateBeneficiaryAccountRow account = data.getAccount();
        of.setPrimaryText(account.getName());
        of.setSecondaryText(account.getSubtitle());
        of.setChecked(data.isSelected());
        of.setEnabled(account.is_enabled());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryAdditionalAccountsFragment.accountsAdapter$lambda$3$lambda$2(this.f$0, account, data);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountsAdapter$lambda$3$lambda$2(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, ApiCreateBeneficiaryAccountRow apiCreateBeneficiaryAccountRow, BeneficiaryAdditionalAccountsViewState.AccountRowData accountRowData) {
        beneficiaryAdditionalAccountsFragment.getDuxo().selectAccount(apiCreateBeneficiaryAccountRow, !accountRowData.isSelected());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getBeneficiaryId() == null) {
            toolbar.setTitle(C9637R.string.beneficiary_create_steps_title_create);
        } else {
            toolbar.setTitle(C9637R.string.beneficiary_create_steps_title_edit);
        }
        toolbar.getProgressBar().setVisibility(0);
        toolbar.getProgressBar().setNumSegments(((Args) companion.getArgs((Fragment) this)).getToolbarViewState().getStepCount());
        toolbar.getProgressBar().setProgress(((Args) companion.getArgs((Fragment) this)).getToolbarViewState().getStepIndex(), ((Args) companion.getArgs((Fragment) this)).getToolbarViewState().getStepProgress(), true);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(contextRequireContext, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C98091(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C98102(null), 1, null);
        getViewBinding().recyclerView.setAdapter(this.compositeAdapter);
        getViewBinding().saveButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment.onViewCreated.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BeneficiaryAdditionalAccountsDuxo duxo = BeneficiaryAdditionalAccountsFragment.this.getDuxo();
                Set<String> set = BeneficiaryAdditionalAccountsFragment.this.selectedAccounts;
                if (set == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selectedAccounts");
                    set = null;
                }
                duxo.validateAdditionalAccounts(set);
            }
        });
    }

    /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1", m3645f = "BeneficiaryAdditionalAccountsFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1 */
    static final class C98091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C98091(Continuation<? super C98091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98091 c98091 = BeneficiaryAdditionalAccountsFragment.this.new C98091(continuation);
            c98091.L$0 = obj;
            return c98091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C98091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1$1", m3645f = "BeneficiaryAdditionalAccountsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BeneficiaryAdditionalAccountsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryAdditionalAccountsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1$1$1", m3645f = "BeneficiaryAdditionalAccountsFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496411 extends ContinuationImpl7 implements Function2<Event<BeneficiaryAdditionalAccountsEvent>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BeneficiaryAdditionalAccountsFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496411(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, Continuation<? super C496411> continuation) {
                    super(2, continuation);
                    this.this$0 = beneficiaryAdditionalAccountsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496411 c496411 = new C496411(this.this$0, continuation);
                    c496411.L$0 = obj;
                    return c496411;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Event<BeneficiaryAdditionalAccountsEvent> event, Continuation<? super Unit> continuation) {
                    return ((C496411) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    EventConsumer eventConsumer;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final Event event = (Event) this.L$0;
                    if (event != null) {
                        final BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment = this.this$0;
                        if ((event.getData() instanceof BeneficiaryAdditionalAccountsEvent.Error) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                            eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$1$1$1$invokeSuspend$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m11427invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m11427invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AbsErrorHandler.handleError$default(beneficiaryAdditionalAccountsFragment.getActivityErrorHandler(), ((BeneficiaryAdditionalAccountsEvent.Error) event.getData()).getThrowable(), false, 2, null);
                                }
                            });
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Event<BeneficiaryAdditionalAccountsEvent>> eventFlow = this.this$0.getDuxo().getEventFlow();
                    C496411 c496411 = new C496411(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(eventFlow, c496411, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(BeneficiaryAdditionalAccountsFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$2", m3645f = "BeneficiaryAdditionalAccountsFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$2 */
    static final class C98102 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C98102(Continuation<? super C98102> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C98102 c98102 = BeneficiaryAdditionalAccountsFragment.this.new C98102(continuation);
            c98102.L$0 = obj;
            return c98102;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C98102) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$2$1", m3645f = "BeneficiaryAdditionalAccountsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BeneficiaryAdditionalAccountsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryAdditionalAccountsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C496421 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ BeneficiaryAdditionalAccountsFragment $tmp0;

                C496421(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment) {
                    this.$tmp0 = beneficiaryAdditionalAccountsFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, BeneficiaryAdditionalAccountsFragment.class, "bind", "bind(Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(BeneficiaryAdditionalAccountsViewState beneficiaryAdditionalAccountsViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, beneficiaryAdditionalAccountsViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((BeneficiaryAdditionalAccountsViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<BeneficiaryAdditionalAccountsViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C496421 c496421 = new C496421(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c496421, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bind(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, BeneficiaryAdditionalAccountsViewState beneficiaryAdditionalAccountsViewState, Continuation continuation) {
                beneficiaryAdditionalAccountsFragment.bind(beneficiaryAdditionalAccountsViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(BeneficiaryAdditionalAccountsFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(BeneficiaryAdditionalAccountsViewState viewState) {
        this.selectedAccounts = viewState.getSelectedAccounts();
        this.headerAdapter.setData(Tuples4.m3642to(viewState.getTitle(), viewState.getSubtitleMarkdown()));
        this.accountsAdapter.submitList(viewState.getAccountRowItems());
        getViewBinding().saveButton.setLoading(viewState.isLoading());
        ImmutableList<ApiBeneficiaryAgreementViewModel> additionalAgreements = viewState.getAdditionalAgreements();
        if (additionalAgreements != null) {
            getCallbacks().onSubmitAdditionalAccounts(CollectionsKt.toList(viewState.getSelectedAccounts()), additionalAgreements);
        }
    }

    /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "beneficiaryId", "Ljava/util/UUID;", "accountViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "toolbarViewState", "Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;)V", "getAccountNumber", "()Ljava/lang/String;", "getBeneficiaryId", "()Ljava/util/UUID;", "getAccountViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "getToolbarViewState", "()Lcom/robinhood/android/beneficiaries/ui/trustflow/BeneficiaryTrustFlowToolbarViewState;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final ApiCreateBeneficiaryAccountViewModel accountViewModel;
        private final UUID beneficiaryId;
        private final BeneficiaryTrustFlowToolbarViewState toolbarViewState;

        /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), (ApiCreateBeneficiaryAccountViewModel) parcel.readParcelable(Args.class.getClassLoader()), BeneficiaryTrustFlowToolbarViewState.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeSerializable(this.beneficiaryId);
            dest.writeParcelable(this.accountViewModel, flags);
            this.toolbarViewState.writeToParcel(dest, flags);
        }

        public Args(String accountNumber, UUID uuid, ApiCreateBeneficiaryAccountViewModel accountViewModel, BeneficiaryTrustFlowToolbarViewState toolbarViewState) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(accountViewModel, "accountViewModel");
            Intrinsics.checkNotNullParameter(toolbarViewState, "toolbarViewState");
            this.accountNumber = accountNumber;
            this.beneficiaryId = uuid;
            this.accountViewModel = accountViewModel;
            this.toolbarViewState = toolbarViewState;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final UUID getBeneficiaryId() {
            return this.beneficiaryId;
        }

        public final ApiCreateBeneficiaryAccountViewModel getAccountViewModel() {
            return this.accountViewModel;
        }

        public final BeneficiaryTrustFlowToolbarViewState getToolbarViewState() {
            return this.toolbarViewState;
        }
    }

    /* compiled from: BeneficiaryAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryAdditionalAccountsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryAdditionalAccountsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryAdditionalAccountsFragment newInstance(Args args) {
            return (BeneficiaryAdditionalAccountsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryAdditionalAccountsFragment beneficiaryAdditionalAccountsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryAdditionalAccountsFragment, args);
        }
    }
}
