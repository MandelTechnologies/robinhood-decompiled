package com.robinhood.android.advancedchart.config;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorViewState;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartAddIndicatorBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartAddIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AdvancedChartAddIndicatorFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "binding", "Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartAddIndicatorBinding;", "getBinding", "()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartAddIndicatorBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDuxo;", "getDuxo", "()Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/advancedchart/config/IndicatorTypeListItem;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onDialogDismissed", "bindState", "state", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartAddIndicatorFragment extends BaseFragment implements RhDialogFragment.OnClickListener, RhDialogFragment.OnDismissListener {
    public static final String ERROR_MESSAGE_KEY = "error_message_key";
    private final GenericListAdapter<RdsRowView, IndicatorTypeListItem> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedChartAddIndicatorFragment.class, "binding", "getBinding()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartAddIndicatorBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AdvancedChartAddIndicatorFragment() {
        super(C8502R.layout.fragment_advanced_chart_add_indicator);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, AdvancedChartAddIndicatorFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AdvancedChartAddIndicatorDuxo.class);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedChartAddIndicatorFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (IndicatorTypeListItem) obj2);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FragmentAdvancedChartAddIndicatorBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAdvancedChartAddIndicatorBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedChartAddIndicatorDuxo getDuxo() {
        return (AdvancedChartAddIndicatorDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final AdvancedChartAddIndicatorFragment advancedChartAddIndicatorFragment, RdsRowView of, final IndicatorTypeListItem item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        StringResource primaryText = item.getPrimaryText();
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setPrimaryText(primaryText.getText(resources));
        StringResource secondaryText = item.getSecondaryText();
        Resources resources2 = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        of.setSecondaryText(secondaryText.getText(resources2));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartAddIndicatorFragment.adapter$lambda$1$lambda$0(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(AdvancedChartAddIndicatorFragment advancedChartAddIndicatorFragment, IndicatorTypeListItem indicatorTypeListItem) {
        advancedChartAddIndicatorFragment.getDuxo().onIndicatorTypeSelected(indicatorTypeListItem.getType());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().recyclerView.setAdapter(this.adapter);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        BaseFragment.collectDuxoState$default(this, null, new C85061(null), 1, null);
    }

    /* compiled from: AdvancedChartAddIndicatorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorFragment$onViewCreated$1", m3645f = "AdvancedChartAddIndicatorFragment.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorFragment$onViewCreated$1 */
    static final class C85061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C85061(Continuation<? super C85061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedChartAddIndicatorFragment.this.new C85061(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C85061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvancedChartAddIndicatorFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AdvancedChartAddIndicatorFragment $tmp0;

            AnonymousClass1(AdvancedChartAddIndicatorFragment advancedChartAddIndicatorFragment) {
                this.$tmp0 = advancedChartAddIndicatorFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AdvancedChartAddIndicatorFragment.class, "bindState", "bindState(Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AdvancedChartAddIndicatorViewState advancedChartAddIndicatorViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$bindState = C85061.invokeSuspend$bindState(this.$tmp0, advancedChartAddIndicatorViewState, continuation);
                return objInvokeSuspend$bindState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AdvancedChartAddIndicatorViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AdvancedChartAddIndicatorViewState> stateFlow = AdvancedChartAddIndicatorFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvancedChartAddIndicatorFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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
        public static final /* synthetic */ Object invokeSuspend$bindState(AdvancedChartAddIndicatorFragment advancedChartAddIndicatorFragment, AdvancedChartAddIndicatorViewState advancedChartAddIndicatorViewState, Continuation continuation) throws Resources.NotFoundException {
            advancedChartAddIndicatorFragment.bindState(advancedChartAddIndicatorViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        getDuxo().resetSelectedIndicator();
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        getDuxo().resetSelectedIndicator();
        super.onDialogDismissed(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(AdvancedChartAddIndicatorViewState state) throws Resources.NotFoundException {
        if (!Intrinsics.areEqual(state, AdvancedChartAddIndicatorViewState.Loading.INSTANCE)) {
            if (state instanceof AdvancedChartAddIndicatorViewState.Loaded) {
                ShimmerLoadingView loadingView = getBinding().loadingView;
                Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
                loadingView.setVisibility(8);
                this.adapter.submitList(((AdvancedChartAddIndicatorViewState.Loaded) state).getIndicatorsList());
                return;
            }
            if (state instanceof AdvancedChartAddIndicatorViewState.Error) {
                ShimmerLoadingView loadingView2 = getBinding().loadingView;
                Intrinsics.checkNotNullExpressionValue(loadingView2, "loadingView");
                loadingView2.setVisibility(8);
                AdvancedChartAddIndicatorViewState.Error error = (AdvancedChartAddIndicatorViewState.Error) state;
                StringResource title = error.getTitle();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = title.getText(resources);
                StringResource message = error.getMessage();
                Resources resources2 = getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                CharSequence text2 = message.getText(resources2);
                Bundle bundle = new Bundle();
                bundle.putCharSequence(ERROR_MESSAGE_KEY, text2);
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder passthroughArgs = companion.create(contextRequireContext).setId(C11048R.id.dialog_id_generic_error).setTitle(text).setMessage(text2).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setPassthroughArgs(bundle);
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                RhDialogFragment.Builder.show$default(passthroughArgs, parentFragmentManager, "error", false, 4, null);
                getDuxo().logOnErrorShown(text2.toString());
                return;
            }
            if (!(state instanceof AdvancedChartAddIndicatorViewState.SelectedType)) {
                throw new NoWhenBranchMatchedException();
            }
            requireActivity().finish();
            Navigator navigator = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext2, new AdvancedChartEditIndicatorFragmentKey(((AdvancedChartAddIndicatorFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId(), new AdvancedChartEditIndicatorLaunchMode.Adding(((AdvancedChartAddIndicatorViewState.SelectedType) state).getType())), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return;
        }
        ShimmerLoadingView loadingView3 = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView3, "loadingView");
        loadingView3.setVisibility(0);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* compiled from: AdvancedChartAddIndicatorFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartAddIndicatorFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorFragment;", "<init>", "()V", "ERROR_MESSAGE_KEY", "", "createFragment", "key", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AdvancedChartAddIndicatorFragmentKey>, FragmentWithArgsCompanion<AdvancedChartAddIndicatorFragment, AdvancedChartAddIndicatorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvancedChartAddIndicatorFragmentKey getArgs(AdvancedChartAddIndicatorFragment advancedChartAddIndicatorFragment) {
            return (AdvancedChartAddIndicatorFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advancedChartAddIndicatorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvancedChartAddIndicatorFragment newInstance(AdvancedChartAddIndicatorFragmentKey advancedChartAddIndicatorFragmentKey) {
            return (AdvancedChartAddIndicatorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, advancedChartAddIndicatorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvancedChartAddIndicatorFragment advancedChartAddIndicatorFragment, AdvancedChartAddIndicatorFragmentKey advancedChartAddIndicatorFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advancedChartAddIndicatorFragment, advancedChartAddIndicatorFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AdvancedChartAddIndicatorFragment createFragment(AdvancedChartAddIndicatorFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AdvancedChartAddIndicatorFragment) AdvancedChartAddIndicatorFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
