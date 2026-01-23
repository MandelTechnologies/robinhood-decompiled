package com.robinhood.android.beneficiaries.p067ui.list;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryList;
import com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BeneficiaryListFragment.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0016J\r\u0010,\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002J\t\u00101\u001a\u00020)H\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Landroidx/core/view/MenuProvider;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDuxo;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "learnMoreMenuItem", "Landroid/view/MenuItem;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onPrepareMenu", "onMenuItemSelected", "", "menuItem", "onMenuClosed", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "refreshToolbarState", "viewState", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryListFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment, MenuProvider {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(BeneficiaryListCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, BeneficiaryListDuxo.class);
    private MenuItem learnMoreMenuItem;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryListFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(BeneficiaryListFragment beneficiaryListFragment, int i, Composer composer, int i2) {
        beneficiaryListFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_LIST, null, ((BeneficiariesFragmentKey.List) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryListCallbacks getCallbacks() {
        return (BeneficiaryListCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryListDuxo getDuxo() {
        return (BeneficiaryListDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.core.view.MenuHost");
        fragmentActivityRequireActivity.addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.STARTED);
        BaseFragment.collectDuxoState$default(this, null, new C97901(null), 1, null);
    }

    /* compiled from: BeneficiaryListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment$onViewCreated$1", m3645f = "BeneficiaryListFragment.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment$onViewCreated$1 */
    static final class C97901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97901(Continuation<? super C97901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryListFragment.this.new C97901(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ BeneficiaryListFragment $tmp0;

            AnonymousClass1(BeneficiaryListFragment beneficiaryListFragment) {
                this.$tmp0 = beneficiaryListFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, BeneficiaryListFragment.class, "refreshToolbarState", "refreshToolbarState(Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(BeneficiaryListViewState beneficiaryListViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$refreshToolbarState = C97901.invokeSuspend$refreshToolbarState(this.$tmp0, beneficiaryListViewState, continuation);
                return objInvokeSuspend$refreshToolbarState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$refreshToolbarState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((BeneficiaryListViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<BeneficiaryListViewState> stateFlow = BeneficiaryListFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryListFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$refreshToolbarState(BeneficiaryListFragment beneficiaryListFragment, BeneficiaryListViewState beneficiaryListViewState, Continuation continuation) {
            beneficiaryListFragment.refreshToolbarState(beneficiaryListViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        refreshToolbarState(getDuxo().getStateFlow().getValue());
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(C9637R.menu.menu_beneficiary_list, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public void onPrepareMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.learnMoreMenuItem = menu.findItem(C9637R.id.action_learn_more);
        refreshToolbarState(getDuxo().getStateFlow().getValue());
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        return menuItem.getItemId() == C9637R.id.action_learn_more;
    }

    @Override // androidx.core.view.MenuProvider
    public void onMenuClosed(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem menuItem = this.learnMoreMenuItem;
        if (menuItem != null) {
            menuItem.setOnMenuItemClickListener(null);
        }
        this.learnMoreMenuItem = null;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(549871416);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(549871416, i2, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment.ComposeContent (BeneficiaryListFragment.kt:81)");
            }
            final SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(272381773, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(272381773, i3, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment.ComposeContent.<anonymous> (BeneficiaryListFragment.kt:85)");
                    }
                    final BeneficiaryListFragment beneficiaryListFragment = BeneficiaryListFragment.this;
                    final SnapshotState4<BeneficiaryListViewState> snapshotState4 = snapshotState4CollectAsState;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(-1321021089, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1321021089, i4, -1, "com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment.ComposeContent.<anonymous>.<anonymous> (BeneficiaryListFragment.kt:86)");
                            }
                            BeneficiaryListComposable.BeneficiaryListComposable(BeneficiaryListFragment.ComposeContent$lambda$0(snapshotState4), beneficiaryListFragment.getCallbacks(), null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 24576, 15);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryListFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BeneficiaryListViewState ComposeContent$lambda$0(SnapshotState4<? extends BeneficiaryListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshToolbarState(BeneficiaryListViewState viewState) {
        final ApiBeneficiarySplashViewModel splashViewModel;
        BeneficiaryList.ViewModel viewModel;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(viewState instanceof BeneficiaryListViewState.Loading);
        }
        MenuItem menuItem = this.learnMoreMenuItem;
        if (menuItem != null) {
            BeneficiaryList beneficiaryList = viewState.getBeneficiaryList();
            if (((beneficiaryList == null || (viewModel = beneficiaryList.getViewModel()) == null) ? null : viewModel.getIneligibleViewModel()) == null && (splashViewModel = viewState.getSplashViewModel()) != null) {
                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.robinhood.android.beneficiaries.ui.list.BeneficiaryListFragment$refreshToolbarState$1$1$1
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.this$0.getCallbacks().onValuePropsClicked(splashViewModel);
                        return true;
                    }
                });
                menuItem.setVisible(true);
            } else {
                menuItem.setVisible(false);
            }
        }
        if (viewState instanceof BeneficiaryListViewState.Content) {
            RhToolbar rhToolbar2 = getRhToolbar();
            if (rhToolbar2 != null) {
                rhToolbar2.setTitle(((BeneficiaryListViewState.Content) viewState).getBeneficiaryList().getAccountName());
            }
            RhToolbar rhToolbar3 = getRhToolbar();
            if (rhToolbar3 != null) {
                rhToolbar3.setSubtitle(((BeneficiaryListViewState.Content) viewState).getBeneficiaryList().getAccountTypeSubtitle());
            }
        }
    }

    /* compiled from: BeneficiaryListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListFragment;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey$List;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryListFragment, BeneficiariesFragmentKey.List> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BeneficiariesFragmentKey.List getArgs(BeneficiaryListFragment beneficiaryListFragment) {
            return (BeneficiariesFragmentKey.List) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryListFragment newInstance(BeneficiariesFragmentKey.List list) {
            return (BeneficiaryListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, list);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryListFragment beneficiaryListFragment, BeneficiariesFragmentKey.List list) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryListFragment, list);
        }
    }
}
