package com.robinhood.android.slip.onboarding.hub;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.compose.LocalityProvider;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsEvent;
import com.robinhood.android.slip.onboarding.hub.p256ui.SettingsToggleAlertViewState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.shared.account.contracts.switcher.AccountToggleData;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SlipHubSettingsMultiAccountsFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\r\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-slip_externalDebug", "viewState", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipHubSettingsMultiAccountsFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SlipHubSettingsMultiAccountsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SlipHubSettingsMultiAccountsFragment slipHubSettingsMultiAccountsFragment, int i, Composer composer, int i2) {
        slipHubSettingsMultiAccountsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final SlipHubSettingsMultiAccountsDuxo getDuxo() {
        return (SlipHubSettingsMultiAccountsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C286801(null), 1, null);
    }

    /* compiled from: SlipHubSettingsMultiAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$onViewCreated$1", m3645f = "SlipHubSettingsMultiAccountsFragment.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$onViewCreated$1 */
    static final class C286801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C286801(Continuation<? super C286801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipHubSettingsMultiAccountsFragment.this.new C286801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C286801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SlipHubSettingsMultiAccountsFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SlipHubSettingsMultiAccountsFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: SlipHubSettingsMultiAccountsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ SlipHubSettingsMultiAccountsFragment $tmp0;

            AnonymousClass1(SlipHubSettingsMultiAccountsFragment slipHubSettingsMultiAccountsFragment) {
                this.$tmp0 = slipHubSettingsMultiAccountsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, SlipHubSettingsMultiAccountsFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<SlipHubSettingsMultiAccountsEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C286801.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<SlipHubSettingsMultiAccountsEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(SlipHubSettingsMultiAccountsFragment slipHubSettingsMultiAccountsFragment, Event event, Continuation continuation) {
            slipHubSettingsMultiAccountsFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<SlipHubSettingsMultiAccountsEvent> event) {
        EventConsumer<SlipHubSettingsMultiAccountsEvent> eventConsumerInvoke;
        EventConsumer<SlipHubSettingsMultiAccountsEvent> eventConsumerInvoke2;
        EventConsumer<SlipHubSettingsMultiAccountsEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof SlipHubSettingsMultiAccountsEvent.AccountToggledMessage) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m18991invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18991invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipHubSettingsMultiAccountsEvent.AccountToggledMessage accountToggledMessage = (SlipHubSettingsMultiAccountsEvent.AccountToggledMessage) event.getData();
                    RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                    View viewRequireView = this.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                    companion.make(viewRequireView, accountToggledMessage.getMessage(), -1).setLeadingIcon(C13997R.drawable.svg_ic_checkmark_24dp).show();
                }
            });
        }
        if ((event.getData() instanceof SlipHubSettingsMultiAccountsEvent.Error) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                    m18992invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m18992invoke(Object it) throws Throwable {
                    Intrinsics.checkNotNullParameter(it, "it");
                    SlipHubSettingsMultiAccountsEvent.Error error = (SlipHubSettingsMultiAccountsEvent.Error) event.getData();
                    ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, error.getThrowable(), false, false, 0, null, 60, null);
                }
            });
        }
        if (!(event.getData() instanceof SlipHubSettingsMultiAccountsEvent.Deeplink) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18993invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m18993invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SlipHubSettingsMultiAccountsEvent.Deeplink deeplink = (SlipHubSettingsMultiAccountsEvent.Deeplink) event.getData();
                Navigator navigator = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(deeplink.getUrl()), null, DeepLinkOrigin.Internal.INSTANCE, false, null, 52, null);
            }
        });
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1824508591);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1824508591, i2, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment.ComposeContent (SlipHubSettingsMultiAccountsFragment.kt:41)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            LocalityProvider.LocalityProvider(null, ComposableLambda3.rememberComposableLambda(-1402298417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1402298417, i3, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment.ComposeContent.<anonymous> (SlipHubSettingsMultiAccountsFragment.kt:45)");
                    }
                    String title = SlipHubSettingsMultiAccountsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTitle();
                    String description = SlipHubSettingsMultiAccountsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getDescription();
                    AccountToggleData accountToggleData = SlipHubSettingsMultiAccountsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountToggleData();
                    SettingsToggleAlertViewState toggleAlertViewState = SlipHubSettingsMultiAccountsFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getToggleAlertViewState();
                    SlipHubSettingsMultiAccountsDuxo duxo = SlipHubSettingsMultiAccountsFragment.this.getDuxo();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(duxo);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SlipHubSettingsMultiAccountsFragment2(duxo);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    SlipHubSettingsMultiAccountsFragment5 slipHubSettingsMultiAccountsFragment5 = new SlipHubSettingsMultiAccountsFragment5((Function2) ((KFunction) objRememberedValue));
                    SlipHubSettingsMultiAccountsDuxo duxo2 = SlipHubSettingsMultiAccountsFragment.this.getDuxo();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(duxo2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new SlipHubSettingsMultiAccountsFragment3(duxo2);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Function2 function2 = (Function2) ((KFunction) objRememberedValue2);
                    SlipHubSettingsMultiAccountsDuxo duxo3 = SlipHubSettingsMultiAccountsFragment.this.getDuxo();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composer2.changedInstance(duxo3);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new SlipHubSettingsMultiAccountsFragment4(duxo3);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    SlipHubSettingsMultiAccountsContent.HubSettingsMultiAccounts(title, description, accountToggleData, toggleAlertViewState, slipHubSettingsMultiAccountsFragment5, function2, (Function0) ((KFunction) objRememberedValue3), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubSettingsMultiAccountsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipHubSettingsMultiAccountsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SlipHubSettingsMultiAccountsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/slip/onboarding/hub/SlipHubSettingsMultiAccountsFragment;", "<init>", "()V", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<SlipHubSettingsMultiAccountsFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((SlipHubSettingsMultiAccountsFragment) fragment);
        }

        public Void getArgs(SlipHubSettingsMultiAccountsFragment slipHubSettingsMultiAccountsFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, slipHubSettingsMultiAccountsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public SlipHubSettingsMultiAccountsFragment newInstance() {
            return (SlipHubSettingsMultiAccountsFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public SlipHubSettingsMultiAccountsFragment newInstance(Void r1) {
            return (SlipHubSettingsMultiAccountsFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SlipHubSettingsMultiAccountsViewState ComposeContent$lambda$0(SnapshotState4<SlipHubSettingsMultiAccountsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
