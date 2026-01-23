package com.robinhood.android.advisory.portfolio.update;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioFragmentKey;
import com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioResultsKey;
import com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileEvent;
import com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: UpdateInvestorProfileFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\r\u0010 \u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDuxo;", "getDuxo", "()Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-advisory-portfolio_externalDebug", "viewState", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UpdateInvestorProfileFragment extends GenericComposeFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UpdateInvestorProfileFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(AdvisoryRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UpdateInvestorProfileDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AdvisoryUpdatePortfolioFragmentKey.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof AdvisoryUpdatePortfolioFragmentKey.Callbacks)) {
                parentFragment = null;
            }
            AdvisoryUpdatePortfolioFragmentKey.Callbacks callbacks = (AdvisoryUpdatePortfolioFragmentKey.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof AdvisoryUpdatePortfolioFragmentKey.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(UpdateInvestorProfileFragment updateInvestorProfileFragment, int i, Composer composer, int i2) {
        updateInvestorProfileFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateInvestorProfileDuxo getDuxo() {
        return (UpdateInvestorProfileDuxo) this.duxo.getValue();
    }

    private final AdvisoryUpdatePortfolioFragmentKey.Callbacks getCallbacks() {
        return (AdvisoryUpdatePortfolioFragmentKey.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: UpdateInvestorProfileFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$onViewCreated$1", m3645f = "UpdateInvestorProfileFragment.kt", m3646l = {39}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$onViewCreated$1 */
    static final class C92261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C92261(Continuation<? super C92261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdateInvestorProfileFragment.this.new C92261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(UpdateInvestorProfileFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdateInvestorProfileFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: UpdateInvestorProfileFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$onViewCreated$1$1", m3645f = "UpdateInvestorProfileFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<UpdateInvestorProfileEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UpdateInvestorProfileFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UpdateInvestorProfileFragment updateInvestorProfileFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = updateInvestorProfileFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<UpdateInvestorProfileEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
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
                final UpdateInvestorProfileFragment updateInvestorProfileFragment = this.this$0;
                if ((event.getData() instanceof UpdateInvestorProfileEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m11182invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m11182invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            updateInvestorProfileFragment.handleEvent((UpdateInvestorProfileEvent) event.getData());
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C92261(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(UpdateInvestorProfileEvent event) {
        if (event instanceof UpdateInvestorProfileEvent.ShowResults) {
            requireBaseActivity().onBackPressed();
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new AdvisoryUpdatePortfolioResultsKey(((UpdateInvestorProfileEvent.ShowResults) event).getAccountNumber()), false, false, false, false, null, false, null, null, 1020, null);
            return;
        }
        if (!(event instanceof UpdateInvestorProfileEvent.Done)) {
            throw new NoWhenBranchMatchedException();
        }
        getCallbacks().onInvestorProfileUpdateComplete(((UpdateInvestorProfileEvent.Done) event).getNextScreenTitle());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-53634225);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53634225, i2, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment.ComposeContent (UpdateInvestorProfileFragment.kt:64)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1401071972, true, new C92251(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateInvestorProfileFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UpdateInvestorProfileFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$ComposeContent$1 */
    static final class C92251 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UpdateInvestorProfileViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C92251(SnapshotState4<? extends UpdateInvestorProfileViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1401071972, i, -1, "com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment.ComposeContent.<anonymous> (UpdateInvestorProfileFragment.kt:68)");
            }
            UpdateInvestorProfileViewState updateInvestorProfileViewStateComposeContent$lambda$0 = UpdateInvestorProfileFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UpdateInvestorProfileFragment.this);
            final UpdateInvestorProfileFragment updateInvestorProfileFragment = UpdateInvestorProfileFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.portfolio.update.UpdateInvestorProfileFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateInvestorProfileFragment.C92251.invoke$lambda$1$lambda$0(updateInvestorProfileFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UpdateInvestorProfileScreen3.UpdateInvestorProfileScreen(updateInvestorProfileViewStateComposeContent$lambda$0, (Function0) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UpdateInvestorProfileFragment updateInvestorProfileFragment) {
            updateInvestorProfileFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UpdateInvestorProfileFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/advisory/portfolio/update/UpdateInvestorProfileFragment;", "Lcom/robinhood/android/advisory/contracts/AdvisoryUpdatePortfolioFragmentKey;", "<init>", "()V", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UpdateInvestorProfileFragment, AdvisoryUpdatePortfolioFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AdvisoryUpdatePortfolioFragmentKey advisoryUpdatePortfolioFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, advisoryUpdatePortfolioFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvisoryUpdatePortfolioFragmentKey getArgs(UpdateInvestorProfileFragment updateInvestorProfileFragment) {
            return (AdvisoryUpdatePortfolioFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, updateInvestorProfileFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UpdateInvestorProfileFragment newInstance(AdvisoryUpdatePortfolioFragmentKey advisoryUpdatePortfolioFragmentKey) {
            return (UpdateInvestorProfileFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, advisoryUpdatePortfolioFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UpdateInvestorProfileFragment updateInvestorProfileFragment, AdvisoryUpdatePortfolioFragmentKey advisoryUpdatePortfolioFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, updateInvestorProfileFragment, advisoryUpdatePortfolioFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateInvestorProfileViewState ComposeContent$lambda$0(SnapshotState4<? extends UpdateInvestorProfileViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
