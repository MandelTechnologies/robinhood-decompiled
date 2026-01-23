package com.robinhood.android.retirement.partnerships.details;

import android.content.Context;
import android.net.Uri;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementPartnershipDetails;
import com.robinhood.android.retirement.lib.partnerships.RetirementPartnershipDetailCallbacks;
import com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.RetirementPartnershipDetailAction;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ExceptionsH;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: RetirementPartnershipsDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\r\u0010#\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u001eH\u0016J\b\u0010&\u001a\u00020\u001eH\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\t\u0010,\u001a\u00020\u001aH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementPartnershipDetailAction;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailScreenCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "duxo", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/retirement/lib/partnerships/RetirementPartnershipDetailCallbacks;", "getCallbacks", "()Lcom/robinhood/android/retirement/lib/partnerships/RetirementPartnershipDetailCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onRefreshClick", "onBackClick", "handle", "action", "handleEvent", "event", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailEvent;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-partnerships_externalDebug", "viewState", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementPartnershipsDetailFragment extends ActionHandlingFragment<RetirementPartnershipDetailAction> implements RetirementPartnershipsDetailScreen3, RegionGated {
    public Markwon markwon;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementPartnershipsDetailFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/retirement/lib/partnerships/RetirementPartnershipDetailCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementPartnershipsDetailDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RetirementPartnershipDetailCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RetirementPartnershipDetailCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RetirementPartnershipsDetailFragment retirementPartnershipsDetailFragment, int i, Composer composer, int i2) {
        retirementPartnershipsDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RetirementPartnershipsDetailDuxo getDuxo() {
        return (RetirementPartnershipsDetailDuxo) this.duxo.getValue();
    }

    private final RetirementPartnershipDetailCallbacks getCallbacks() {
        return (RetirementPartnershipDetailCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* compiled from: RetirementPartnershipsDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment$onViewCreated$1", m3645f = "RetirementPartnershipsDetailFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment$onViewCreated$1 */
    static final class C271571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C271571(Continuation<? super C271571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RetirementPartnershipsDetailFragment.this.new C271571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C271571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<RetirementPartnershipsDetailEvent>> eventFlow = RetirementPartnershipsDetailFragment.this.getDuxo().getEventFlow();
                final RetirementPartnershipsDetailFragment retirementPartnershipsDetailFragment = RetirementPartnershipsDetailFragment.this;
                FlowCollector<? super Event<RetirementPartnershipsDetailEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RetirementPartnershipsDetailEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RetirementPartnershipsDetailEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RetirementPartnershipsDetailEvent> eventConsumerInvoke;
                        if (event != null) {
                            final RetirementPartnershipsDetailFragment retirementPartnershipsDetailFragment2 = retirementPartnershipsDetailFragment;
                            if ((event.getData() instanceof RetirementPartnershipsDetailEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m18190invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18190invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        retirementPartnershipsDetailFragment2.handleEvent((RetirementPartnershipsDetailEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C271571(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1539826661);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1539826661, i2, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment.ComposeContent (RetirementPartnershipsDetailFragment.kt:47)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1409936006, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1409936006, i3, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment.ComposeContent.<anonymous> (RetirementPartnershipsDetailFragment.kt:50)");
                    }
                    final RetirementPartnershipsDetailFragment retirementPartnershipsDetailFragment = RetirementPartnershipsDetailFragment.this;
                    final SnapshotState4<RetirementPartnershipsDetailViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ActionHandlingFragment2.ContentWithDialog(retirementPartnershipsDetailFragment, ComposableLambda3.rememberComposableLambda(1236851998, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(1236851998, i4, -1, "com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment.ComposeContent.<anonymous>.<anonymous> (RetirementPartnershipsDetailFragment.kt:51)");
                            }
                            RetirementPartnershipsDetailScreen4.RetirementPartnershipDetailsScreen(RetirementPartnershipsDetailFragment.ComposeContent$lambda$0(snapshotState4), retirementPartnershipsDetailFragment, null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementPartnershipsDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreen3
    public void onRefreshClick() {
        getDuxo().refreshData();
    }

    @Override // com.robinhood.android.retirement.partnerships.details.RetirementPartnershipsDetailScreen3
    public void onBackClick() {
        requireActivity().onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo15941handle(RetirementPartnershipDetailAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof RetirementPartnershipDetailAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink$default(this, ((RetirementPartnershipDetailAction.Deeplink) action).getValue2(), null, 2, null);
        }
        if (action instanceof RetirementPartnershipDetailAction.Dismiss) {
            onBackClick();
            return true;
        }
        if (action instanceof RetirementPartnershipDetailAction.InfoAlert) {
            return ActionHandlingFragment.handleAlert$default(this, ((RetirementPartnershipDetailAction.InfoAlert) action).getValue2(), null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
        if (!(action instanceof RetirementPartnershipDetailAction.RetirementClaimPartnershipOffer)) {
            throw new NoWhenBranchMatchedException();
        }
        getDuxo().claimPartnershipAndDeeplink(((RetirementPartnershipDetailAction.RetirementClaimPartnershipOffer) action).getValue2());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetirementPartnershipsDetailViewState ComposeContent$lambda$0(SnapshotState4<? extends RetirementPartnershipsDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(RetirementPartnershipsDetailEvent event) {
        if (event instanceof RetirementPartnershipsDetailEvent.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((RetirementPartnershipsDetailEvent.Deeplink) event).getDeeplink()), null, null, false, null, 60, null);
            return;
        }
        if (event instanceof RetirementPartnershipsDetailEvent.DisplayAlert) {
            ActionHandlingFragment.handleAlert$default(this, ((RetirementPartnershipsDetailEvent.DisplayAlert) event).getAlert(), null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return;
        }
        if (event instanceof RetirementPartnershipsDetailEvent.ClaimError) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((RetirementPartnershipsDetailEvent.ClaimError) event).getError(), false, 2, null);
        } else if (event instanceof RetirementPartnershipsDetailEvent.NoPartnership) {
            requireActivity().onBackPressed();
        } else {
            if (!(event instanceof RetirementPartnershipsDetailEvent.ClaimComplete)) {
                throw new NoWhenBranchMatchedException();
            }
            getCallbacks().onPartnershipClaimed(((RetirementPartnershipDetails) INSTANCE.getArgs((Fragment) this)).getNextOnboardingStep());
        }
    }

    /* compiled from: RetirementPartnershipsDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/retirement/partnerships/details/RetirementPartnershipsDetailFragment;", "Lcom/robinhood/android/retirement/contracts/RetirementPartnershipDetails;", "<init>", "()V", "feature-retirement-partnerships_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<RetirementPartnershipsDetailFragment, RetirementPartnershipDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RetirementPartnershipDetails retirementPartnershipDetails) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, retirementPartnershipDetails);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RetirementPartnershipDetails getArgs(RetirementPartnershipsDetailFragment retirementPartnershipsDetailFragment) {
            return (RetirementPartnershipDetails) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, retirementPartnershipsDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementPartnershipsDetailFragment newInstance(RetirementPartnershipDetails retirementPartnershipDetails) {
            return (RetirementPartnershipsDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, retirementPartnershipDetails);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementPartnershipsDetailFragment retirementPartnershipsDetailFragment, RetirementPartnershipDetails retirementPartnershipDetails) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, retirementPartnershipsDetailFragment, retirementPartnershipDetails);
        }
    }
}
