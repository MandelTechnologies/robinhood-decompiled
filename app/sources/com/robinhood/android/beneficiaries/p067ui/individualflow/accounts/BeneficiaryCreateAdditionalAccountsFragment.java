package com.robinhood.android.beneficiaries.p067ui.individualflow.accounts;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateAdditionalAccountsBinding;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStep;
import com.robinhood.android.beneficiaries.p067ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsViewState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.selectioncontrol.RdsCheckBoxRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.Set;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u0001:\u0003@ABB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u001a\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0010\u0010=\u001a\u0002052\u0006\u0010>\u001a\u00020?H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082.¢\u0006\u0002\n\u0000R(\u0010*\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010)0-0+X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "<init>", "()V", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Callbacks;", "callbacks$delegate", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "selectedAccounts", "", "", "headerAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/view/ViewGroup;", "Lkotlin/Pair;", "accountsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsCheckBoxRowView;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState$AccountRowData;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "viewState", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateAdditionalAccountsFragment extends BaseBeneficiaryCreateStepFragment {
    private final GenericListAdapter<RdsCheckBoxRowView, BeneficiaryCreateAdditionalAccountsViewState.AccountRowData> accountsAdapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final CompositeAdapter compositeAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final SingleItemAdapter<ViewGroup, Tuples2<String, String>> headerAdapter;
    public Markwon markwon;
    private Set<String> selectedAccounts;
    private final BeneficiaryCreateStep step;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateAdditionalAccountsFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAdditionalAccountsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateAdditionalAccountsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Callbacks;", "", "onSubmitAdditionalAccounts", "", "additionalAccounts", "", "", "additionalAgreements", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSubmitAdditionalAccounts(List<String> additionalAccounts, List<ApiBeneficiaryAgreementViewModel> additionalAgreements);
    }

    public BeneficiaryCreateAdditionalAccountsFragment() {
        super(C9637R.layout.fragment_beneficiary_create_additional_accounts);
        this.step = BeneficiaryCreateStep.ADDITIONAL_ACCOUNTS;
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryCreateAdditionalAccountsFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, BeneficiaryCreateAdditionalAccountsDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$special$$inlined$parentFragmentCallbacks$1
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
        SingleItemAdapter<ViewGroup, Tuples2<String, String>> singleItemAdapterM2991of = companion.m2991of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BeneficiaryCreateAdditionalAccountsFragment.headerAdapter$lambda$0(this.f$0, (ViewGroup) obj, (Tuples2) obj2);
            }
        });
        this.headerAdapter = singleItemAdapterM2991of;
        GenericListAdapter<RdsCheckBoxRowView, BeneficiaryCreateAdditionalAccountsViewState.AccountRowData> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(RdsCheckBoxRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateAdditionalAccountsFragment.accountsAdapter$lambda$1((BeneficiaryCreateAdditionalAccountsViewState.AccountRowData) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BeneficiaryCreateAdditionalAccountsFragment.accountsAdapter$lambda$3(this.f$0, (RdsCheckBoxRowView) obj, (BeneficiaryCreateAdditionalAccountsViewState.AccountRowData) obj2);
            }
        });
        this.accountsAdapter = genericListAdapterM2987of;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterM2991of, genericListAdapterM2987of});
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public BeneficiaryCreateStep getStep() {
        return this.step;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_ACCOUNT_SELECTION, null, ((Args) INSTANCE.getArgs((Fragment) this)).getAccountViewModel().getLogging_identifier(), null, 10, null);
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public ApiCreateBeneficiaryConfiguration getConfiguration() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
    }

    private final FragmentBeneficiaryCreateAdditionalAccountsBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateAdditionalAccountsBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryCreateAdditionalAccountsDuxo getDuxo() {
        return (BeneficiaryCreateAdditionalAccountsDuxo) this.duxo.getValue();
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
    public static final Unit headerAdapter$lambda$0(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment, ViewGroup of, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        ((TextView) of.findViewById(C9637R.id.header)).setText(str);
        TextView textView = (TextView) of.findViewById(C9637R.id.subtitle);
        Markwon markwon = beneficiaryCreateAdditionalAccountsFragment.getMarkwon();
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(markwon.toMarkdown(str2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object accountsAdapter$lambda$1(BeneficiaryCreateAdditionalAccountsViewState.AccountRowData byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getAccount().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountsAdapter$lambda$3(final BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment, RdsCheckBoxRowView of, final BeneficiaryCreateAdditionalAccountsViewState.AccountRowData data) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(data, "data");
        final ApiCreateBeneficiaryAccountRow account = data.getAccount();
        of.setPrimaryText(account.getName());
        of.setSecondaryText(account.getSubtitle());
        of.setChecked(data.isSelected());
        of.setEnabled(account.is_enabled());
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryCreateAdditionalAccountsFragment.accountsAdapter$lambda$3$lambda$2(this.f$0, account, data);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountsAdapter$lambda$3$lambda$2(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment, ApiCreateBeneficiaryAccountRow apiCreateBeneficiaryAccountRow, BeneficiaryCreateAdditionalAccountsViewState.AccountRowData accountRowData) {
        beneficiaryCreateAdditionalAccountsFragment.getDuxo().selectAccount(apiCreateBeneficiaryAccountRow, !accountRowData.isSelected());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Context contextRequireContext = requireContext();
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
        BaseFragment.collectDuxoState$default(this, null, new C97101(null), 1, null);
        getViewBinding().recyclerView.setAdapter(this.compositeAdapter);
        getViewBinding().saveButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment.onViewCreated.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BeneficiaryCreateAdditionalAccountsDuxo duxo = BeneficiaryCreateAdditionalAccountsFragment.this.getDuxo();
                Set<String> set = BeneficiaryCreateAdditionalAccountsFragment.this.selectedAccounts;
                if (set == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("selectedAccounts");
                    set = null;
                }
                duxo.validateAdditionalAccounts(set);
            }
        });
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$onViewCreated$1", m3645f = "BeneficiaryCreateAdditionalAccountsFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$onViewCreated$1 */
    static final class C97101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C97101(Continuation<? super C97101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97101 c97101 = BeneficiaryCreateAdditionalAccountsFragment.this.new C97101(continuation);
            c97101.L$0 = obj;
            return c97101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$onViewCreated$1$1", m3645f = "BeneficiaryCreateAdditionalAccountsFragment.kt", m3646l = {111}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BeneficiaryCreateAdditionalAccountsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryCreateAdditionalAccountsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C496371 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ BeneficiaryCreateAdditionalAccountsFragment $tmp0;

                C496371(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment) {
                    this.$tmp0 = beneficiaryCreateAdditionalAccountsFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, BeneficiaryCreateAdditionalAccountsFragment.class, "bind", "bind(Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(BeneficiaryCreateAdditionalAccountsViewState beneficiaryCreateAdditionalAccountsViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, beneficiaryCreateAdditionalAccountsViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((BeneficiaryCreateAdditionalAccountsViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<BeneficiaryCreateAdditionalAccountsViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C496371 c496371 = new C496371(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c496371, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment, BeneficiaryCreateAdditionalAccountsViewState beneficiaryCreateAdditionalAccountsViewState, Continuation continuation) {
                beneficiaryCreateAdditionalAccountsFragment.bind(beneficiaryCreateAdditionalAccountsViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(BeneficiaryCreateAdditionalAccountsFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(BeneficiaryCreateAdditionalAccountsViewState viewState) {
        Throwable thConsume;
        this.selectedAccounts = viewState.getSelectedAccounts();
        this.headerAdapter.setData(Tuples4.m3642to(viewState.getTitle(), viewState.getSubtitleMarkdown()));
        this.accountsAdapter.submitList(viewState.getAccountRowItems());
        getViewBinding().saveButton.setLoading(viewState.isLoading());
        List<ApiBeneficiaryAgreementViewModel> additionalAgreements = viewState.getAdditionalAgreements();
        if (additionalAgreements != null) {
            getCallbacks().onSubmitAdditionalAccounts(CollectionsKt.toList(viewState.getSelectedAccounts()), additionalAgreements);
        }
        UiEvent<Throwable> error = viewState.getError();
        if (error == null || (thConsume = error.consume()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Args;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "accountViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "relationship", "", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;Ljava/lang/String;)V", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getAccountViewModel", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "getRelationship", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiCreateBeneficiaryAccountViewModel accountViewModel;
        private final ApiCreateBeneficiaryConfiguration configuration;
        private final String relationship;

        /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiCreateBeneficiaryConfiguration) parcel.readParcelable(Args.class.getClassLoader()), (ApiCreateBeneficiaryAccountViewModel) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString());
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
            dest.writeParcelable(this.configuration, flags);
            dest.writeParcelable(this.accountViewModel, flags);
            dest.writeString(this.relationship);
        }

        public Args(ApiCreateBeneficiaryConfiguration configuration, ApiCreateBeneficiaryAccountViewModel accountViewModel, String relationship) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(accountViewModel, "accountViewModel");
            Intrinsics.checkNotNullParameter(relationship, "relationship");
            this.configuration = configuration;
            this.accountViewModel = accountViewModel;
            this.relationship = relationship;
        }

        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }

        public final ApiCreateBeneficiaryAccountViewModel getAccountViewModel() {
            return this.accountViewModel;
        }

        public final String getRelationship() {
            return this.relationship;
        }
    }

    /* compiled from: BeneficiaryCreateAdditionalAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateAdditionalAccountsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateAdditionalAccountsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateAdditionalAccountsFragment newInstance(Args args) {
            return (BeneficiaryCreateAdditionalAccountsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateAdditionalAccountsFragment beneficiaryCreateAdditionalAccountsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateAdditionalAccountsFragment, args);
        }
    }
}
