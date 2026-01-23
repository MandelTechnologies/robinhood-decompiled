package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
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
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.gold.contracts.GoldRejoinIntentKey;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.match.MatchAgreementState;
import com.robinhood.android.retirement.match.MatchAgreementsScreen4;
import com.robinhood.android.retirement.match.MatchAgreementsScreen5;
import com.robinhood.android.transfers.p271ui.retirement.contributions.ContributionBundle;
import com.robinhood.android.transfers.p271ui.retirement.contributions.ContributionSubmitterCallbacks;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.EligibilityDeterminerCallbacks;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementEvent;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ContributionAndAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\r\u0010\u001e\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "goldRejoinAgreementLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease", "state", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ContributionAndAgreementFragment extends GenericActionHandlingFragment implements RhDialogFragment.OnDismissListener {
    private static final int NAVIGATE_BACK_AFTER_DISMISS_DIALOG_ID = 999;
    private static final String RETIREMENT_FLOW = "ira_contribution";
    private static final String RETIREMENT_MATCH_RATE_PENDING_DOWNGRADE = "retirement_match_rate_pending_downgrade";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ContributionAndAgreementFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ContributionAndAgreementDuxo.class);
    private final ActivityResultLauncher<Intent> goldRejoinAgreementLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ContributionAndAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ContributionAndAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Callbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionSubmitterCallbacks;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/EligibilityDeterminerCallbacks;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ContributionSubmitterCallbacks, EligibilityDeterminerCallbacks {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ContributionAndAgreementFragment contributionAndAgreementFragment, int i, Composer composer, int i2) {
        contributionAndAgreementFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public ContributionAndAgreementFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$goldRejoinAgreementLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.getDuxo().onGoldRejoinFlowCompleted();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.goldRejoinAgreementLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public final ContributionAndAgreementDuxo getDuxo() {
        return (ContributionAndAgreementDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C310851(null), 1, null);
    }

    /* compiled from: ContributionAndAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$onViewCreated$1", m3645f = "ContributionAndAgreementFragment.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$onViewCreated$1 */
    static final class C310851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310851(Continuation<? super C310851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContributionAndAgreementFragment.this.new C310851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ContributionAndAgreementFragment.this.getDuxo().getEventFlow());
                final ContributionAndAgreementFragment contributionAndAgreementFragment = ContributionAndAgreementFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<ContributionAndAgreementEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<ContributionAndAgreementEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<ContributionAndAgreementEvent> eventConsumerInvoke;
                        EventConsumer<ContributionAndAgreementEvent> eventConsumerInvoke2;
                        EventConsumer<ContributionAndAgreementEvent> eventConsumerInvoke3;
                        EventConsumer<ContributionAndAgreementEvent> eventConsumerInvoke4;
                        final ContributionAndAgreementFragment contributionAndAgreementFragment2 = contributionAndAgreementFragment;
                        if ((event.getData() instanceof ContributionAndAgreementEvent.NotEligible) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19945invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19945invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    contributionAndAgreementFragment2.getCallbacks().onNotEligible();
                                }
                            });
                        }
                        final ContributionAndAgreementFragment contributionAndAgreementFragment3 = contributionAndAgreementFragment;
                        if ((event.getData() instanceof ContributionAndAgreementEvent.NetworkError) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m19946invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19946invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ContributionAndAgreementEvent.NetworkError networkError = (ContributionAndAgreementEvent.NetworkError) event.getData();
                                    if (networkError.getNavigateBackAfterDialogDismiss()) {
                                        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                                        FragmentActivity fragmentActivityRequireActivity = contributionAndAgreementFragment3.requireActivity();
                                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                                        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, networkError.getThrowable(), false, false, 999, null, 44, null);
                                        return;
                                    }
                                    ActivityErrorHandler.Companion companion2 = ActivityErrorHandler.INSTANCE;
                                    FragmentActivity fragmentActivityRequireActivity2 = contributionAndAgreementFragment3.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                                    ActivityErrorHandler.Companion.handle$default(companion2, fragmentActivityRequireActivity2, networkError.getThrowable(), false, false, 0, null, 60, null);
                                }
                            });
                        }
                        final ContributionAndAgreementFragment contributionAndAgreementFragment4 = contributionAndAgreementFragment;
                        if ((event.getData() instanceof ContributionAndAgreementEvent.SuccessfulTransfer) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19947invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19947invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    contributionAndAgreementFragment4.getCallbacks().onSuccessfulContribution(((ContributionAndAgreementEvent.SuccessfulTransfer) event.getData()).getPostTransferFlow());
                                }
                            });
                        }
                        final ContributionAndAgreementFragment contributionAndAgreementFragment5 = contributionAndAgreementFragment;
                        if ((event.getData() instanceof ContributionAndAgreementEvent.LaunchGoldRejoinFlow) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m19948invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m19948invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator navigator = contributionAndAgreementFragment5.getNavigator();
                                    Context contextRequireContext = contributionAndAgreementFragment5.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    contributionAndAgreementFragment5.goldRejoinAgreementLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new GoldRejoinIntentKey("ira_contribution", "retirement_match_rate_pending_downgrade"), null, false, 12, null));
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContributionAndAgreementViewState ComposeContent$lambda$0(SnapshotState4<ContributionAndAgreementViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == 999) {
            requireActivity().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(38622533);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38622533, i2, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent (ContributionAndAgreementFragment.kt:92)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1979065606, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1979065606, i3, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.<anonymous> (ContributionAndAgreementFragment.kt:100)");
                    }
                    final ContributionAndAgreementFragment contributionAndAgreementFragment = ContributionAndAgreementFragment.this;
                    final SnapshotState4<ContributionAndAgreementViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ActionHandlingFragment2.ContentWithDialog(contributionAndAgreementFragment, ComposableLambda3.rememberComposableLambda(1425168086, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(1425168086, i4, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.<anonymous>.<anonymous> (ContributionAndAgreementFragment.kt:101)");
                            }
                            final SnapshotState4<ContributionAndAgreementViewState> snapshotState42 = snapshotState4;
                            final ContributionAndAgreementFragment contributionAndAgreementFragment2 = contributionAndAgreementFragment;
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2127318059, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2127318059, i5, -1, "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (ContributionAndAgreementFragment.kt:102)");
                                    }
                                    MatchAgreementState matchAgreementState = new MatchAgreementState(ContributionAndAgreementFragment.ComposeContent$lambda$0(snapshotState42).getAgreementsViewModel(), ContributionAndAgreementFragment.ComposeContent$lambda$0(snapshotState42).isSweepAgreementChecked(), ContributionAndAgreementFragment.ComposeContent$lambda$0(snapshotState42).isAgreeButtonLoading());
                                    final ContributionAndAgreementFragment contributionAndAgreementFragment3 = contributionAndAgreementFragment2;
                                    final SnapshotState4<ContributionAndAgreementViewState> snapshotState43 = snapshotState42;
                                    MatchAgreementsScreen5.MatchAgreementsScreen(matchAgreementState, new MatchAgreementsScreen4() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment.ComposeContent.1.1.1.1
                                        @Override // com.robinhood.android.retirement.match.MatchAgreementsScreen4
                                        public void onSweepAgreementToggled(boolean enabled) {
                                            contributionAndAgreementFragment3.getDuxo().onSweepAgreementToggled(enabled);
                                        }

                                        @Override // com.robinhood.android.retirement.match.MatchAgreementsScreen4
                                        public void onClickAgreeCta() {
                                            contributionAndAgreementFragment3.getDuxo().onAgreeClicked(ContributionAndAgreementFragment.ComposeContent$lambda$0(snapshotState43).getAgreementsViewModel(), ContributionAndAgreementFragment.ComposeContent$lambda$0(snapshotState43).isSweepAgreementChecked());
                                        }
                                    }, ContributionAndAgreementFragment2.INSTANCE.m19944getLambda$560629241$feature_transfers_externalRelease(), null, null, composer4, MatchAgreementState.$stable | 384, 24);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContributionAndAgreementFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ContributionAndAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Args;", "Landroid/os/Parcelable;", "contributionBundle", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "loadOnlyAgreements", "", "showGoldRejoinFlow", "<init>", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;ZZ)V", "getContributionBundle", "()Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "getLoadOnlyAgreements", "()Z", "getShowGoldRejoinFlow", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ContributionBundle contributionBundle;
        private final boolean loadOnlyAgreements;
        private final boolean showGoldRejoinFlow;

        /* compiled from: ContributionAndAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ContributionBundle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ContributionBundle contributionBundle, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                contributionBundle = args.contributionBundle;
            }
            if ((i & 2) != 0) {
                z = args.loadOnlyAgreements;
            }
            if ((i & 4) != 0) {
                z2 = args.showGoldRejoinFlow;
            }
            return args.copy(contributionBundle, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ContributionBundle getContributionBundle() {
            return this.contributionBundle;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLoadOnlyAgreements() {
            return this.loadOnlyAgreements;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowGoldRejoinFlow() {
            return this.showGoldRejoinFlow;
        }

        public final Args copy(ContributionBundle contributionBundle, boolean loadOnlyAgreements, boolean showGoldRejoinFlow) {
            Intrinsics.checkNotNullParameter(contributionBundle, "contributionBundle");
            return new Args(contributionBundle, loadOnlyAgreements, showGoldRejoinFlow);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.contributionBundle, args.contributionBundle) && this.loadOnlyAgreements == args.loadOnlyAgreements && this.showGoldRejoinFlow == args.showGoldRejoinFlow;
        }

        public int hashCode() {
            return (((this.contributionBundle.hashCode() * 31) + Boolean.hashCode(this.loadOnlyAgreements)) * 31) + Boolean.hashCode(this.showGoldRejoinFlow);
        }

        public String toString() {
            return "Args(contributionBundle=" + this.contributionBundle + ", loadOnlyAgreements=" + this.loadOnlyAgreements + ", showGoldRejoinFlow=" + this.showGoldRejoinFlow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.contributionBundle.writeToParcel(dest, flags);
            dest.writeInt(this.loadOnlyAgreements ? 1 : 0);
            dest.writeInt(this.showGoldRejoinFlow ? 1 : 0);
        }

        public Args(ContributionBundle contributionBundle, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(contributionBundle, "contributionBundle");
            this.contributionBundle = contributionBundle;
            this.loadOnlyAgreements = z;
            this.showGoldRejoinFlow = z2;
        }

        public /* synthetic */ Args(ContributionBundle contributionBundle, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(contributionBundle, z, (i & 4) != 0 ? false : z2);
        }

        public final ContributionBundle getContributionBundle() {
            return this.contributionBundle;
        }

        public final boolean getLoadOnlyAgreements() {
            return this.loadOnlyAgreements;
        }

        public final boolean getShowGoldRejoinFlow() {
            return this.showGoldRejoinFlow;
        }
    }

    /* compiled from: ContributionAndAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Args;", "<init>", "()V", "NAVIGATE_BACK_AFTER_DISMISS_DIALOG_ID", "", "RETIREMENT_MATCH_RATE_PENDING_DOWNGRADE", "", "RETIREMENT_FLOW", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ContributionAndAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ContributionAndAgreementFragment contributionAndAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, contributionAndAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ContributionAndAgreementFragment newInstance(Args args) {
            return (ContributionAndAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ContributionAndAgreementFragment contributionAndAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, contributionAndAgreementFragment, args);
        }
    }
}
