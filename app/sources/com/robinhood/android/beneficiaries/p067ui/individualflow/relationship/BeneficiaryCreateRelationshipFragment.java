package com.robinhood.android.beneficiaries.p067ui.individualflow.relationship;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateRelationshipBinding;
import com.robinhood.android.beneficiaries.extension.Fragments;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRelationshipViewModel;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStep;
import com.robinhood.android.beneficiaries.p067ui.individualflow.relationship.BeneficiaryCreateRelationshipViewState;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
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

/* compiled from: BeneficiaryCreateRelationshipFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020,H\u0016J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateRelationshipBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateRelationshipBinding;", "viewBinding$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState$RowState;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setViewState", "viewState", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState;", "Callbacks", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateRelationshipFragment extends BaseBeneficiaryCreateStepFragment {
    private final GenericListAdapter<RdsRowView, BeneficiaryCreateRelationshipViewState.RowState> adapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;
    private final BeneficiaryCreateStep step;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateRelationshipFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateRelationshipFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateRelationshipBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateRelationshipFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment$Callbacks;", "", "onRelationshipSelected", "", "relationship", "", "agreement", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRelationshipSelected(String relationship, ApiBeneficiaryAgreementViewModel agreement);
    }

    public BeneficiaryCreateRelationshipFragment() {
        super(C9637R.layout.fragment_beneficiary_create_relationship);
        this.step = BeneficiaryCreateStep.RELATIONSHIP;
        this.duxo = OldDuxos.oldDuxo(this, BeneficiaryCreateRelationshipDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryCreateRelationshipFragment3.INSTANCE);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryCreateRelationshipFragment.adapter$lambda$0((BeneficiaryCreateRelationshipViewState.RowState) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BeneficiaryCreateRelationshipFragment.adapter$lambda$2(this.f$0, (RdsRowView) obj, (BeneficiaryCreateRelationshipViewState.RowState) obj2);
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_RELATIONSHIP_INPUT, null, null, null, 14, null);
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

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public BeneficiaryCreateStep getStep() {
        return this.step;
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public ApiCreateBeneficiaryConfiguration getConfiguration() {
        return (ApiCreateBeneficiaryConfiguration) INSTANCE.getArgs((Fragment) this);
    }

    private final BeneficiaryCreateRelationshipDuxo getDuxo() {
        return (BeneficiaryCreateRelationshipDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentBeneficiaryCreateRelationshipBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateRelationshipBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object adapter$lambda$0(BeneficiaryCreateRelationshipViewState.RowState byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getRow().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final BeneficiaryCreateRelationshipFragment beneficiaryCreateRelationshipFragment, RdsRowView of, BeneficiaryCreateRelationshipViewState.RowState rowState) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(rowState, "rowState");
        final ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow row = rowState.getRow();
        boolean isRowEnabled = rowState.getIsRowEnabled();
        of.setPrimaryText(row.getName());
        of.setEnabled(isRowEnabled);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BeneficiaryCreateRelationshipFragment.adapter$lambda$2$lambda$1(this.f$0, row);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(BeneficiaryCreateRelationshipFragment beneficiaryCreateRelationshipFragment, ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow relationshipRow) {
        beneficiaryCreateRelationshipFragment.getDuxo().validateRelationship(relationshipRow.getValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getViewBinding().beneficiaryCreateRelationshipTitle;
        Companion companion = INSTANCE;
        rhTextView.setText(((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getRelationship_view_model().getTitle());
        String subtitle_markdown = ((ApiCreateBeneficiaryConfiguration) companion.getArgs((Fragment) this)).getRelationship_view_model().getSubtitle_markdown();
        if (subtitle_markdown != null) {
            getViewBinding().beneficiaryCreateRelationshipSubtitle.setText(getMarkwon().toMarkdown(subtitle_markdown));
            RhTextView beneficiaryCreateRelationshipSubtitle = getViewBinding().beneficiaryCreateRelationshipSubtitle;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateRelationshipSubtitle, "beneficiaryCreateRelationshipSubtitle");
            beneficiaryCreateRelationshipSubtitle.setVisibility(0);
        }
        getViewBinding().beneficiaryCreateRelationshipRecyclerView.setAdapter(this.adapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C97391(this));
        Observable<BeneficiaryCreateRelationshipViewState> states = getDuxo().getStates();
        final C97402 c97402 = new PropertyReference1Impl() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment.onStart.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((BeneficiaryCreateRelationshipViewState) obj).getRowStates();
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c97402) { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c97402, "function");
                this.function = c97402;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C97413(this.adapter));
    }

    /* compiled from: BeneficiaryCreateRelationshipFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$onStart$1 */
    /* synthetic */ class C97391 extends FunctionReferenceImpl implements Function1<BeneficiaryCreateRelationshipViewState, Unit> {
        C97391(Object obj) {
            super(1, obj, BeneficiaryCreateRelationshipFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BeneficiaryCreateRelationshipViewState beneficiaryCreateRelationshipViewState) throws Throwable {
            invoke2(beneficiaryCreateRelationshipViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BeneficiaryCreateRelationshipViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BeneficiaryCreateRelationshipFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: BeneficiaryCreateRelationshipFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment$onStart$3 */
    /* synthetic */ class C97413 extends FunctionReferenceImpl implements Function1<List<? extends BeneficiaryCreateRelationshipViewState.RowState>, Unit> {
        C97413(Object obj) {
            super(1, obj, GenericListAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BeneficiaryCreateRelationshipViewState.RowState> list) {
            invoke2((List<BeneficiaryCreateRelationshipViewState.RowState>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<BeneficiaryCreateRelationshipViewState.RowState> list) {
            ((GenericListAdapter) this.receiver).submitList(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(BeneficiaryCreateRelationshipViewState viewState) throws Throwable {
        Tuples2<String, ApiBeneficiaryAgreementViewModel> tuples2Consume;
        GenericAlertContent<GenericAction> genericAlertContentConsume;
        Throwable thConsume;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(viewState.isLoading());
        }
        UiEvent<Throwable> error = viewState.getError();
        if (error != null && (thConsume = error.consume()) != null && !AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
            throw thConsume;
        }
        UiEvent<GenericAlertContent<GenericAction>> validationError = viewState.getValidationError();
        if (validationError != null && (genericAlertContentConsume = validationError.consume()) != null) {
            setSheetListener(Fragments.showSduiAlertSheet(this, genericAlertContentConsume, getMarkwon()));
        }
        UiEvent<Tuples2<String, ApiBeneficiaryAgreementViewModel>> success = viewState.getSuccess();
        if (success == null || (tuples2Consume = success.consume()) == null) {
            return;
        }
        getCallbacks().onRelationshipSelected(tuples2Consume.component1(), tuples2Consume.component2());
    }

    /* compiled from: BeneficiaryCreateRelationshipFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateRelationshipFragment, ApiCreateBeneficiaryConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateRelationshipFragment beneficiaryCreateRelationshipFragment) {
            return (ApiCreateBeneficiaryConfiguration) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateRelationshipFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateRelationshipFragment newInstance(ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            return (BeneficiaryCreateRelationshipFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiCreateBeneficiaryConfiguration);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateRelationshipFragment beneficiaryCreateRelationshipFragment, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateRelationshipFragment, apiCreateBeneficiaryConfiguration);
        }
    }
}
