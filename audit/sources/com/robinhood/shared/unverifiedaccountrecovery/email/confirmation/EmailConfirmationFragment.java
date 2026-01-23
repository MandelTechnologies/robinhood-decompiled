package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.support.contracts.pathfinder.EmailConfirmationFragmentKey;
import com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationEvent;
import com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
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

/* compiled from: EmailConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pathfinderCallbacks", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "getPathfinderCallbacks", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "pathfinderCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-unverified-account-recovery_externalDebug", "state", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EmailConfirmationFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, EmailConfirmationDuxo.class);

    /* renamed from: pathfinderCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 pathfinderCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PathfinderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmailConfirmationFragment.class, "pathfinderCallbacks", "getPathfinderCallbacks()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(EmailConfirmationFragment emailConfirmationFragment, int i, Composer composer, int i2) {
        emailConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailConfirmationDuxo getDuxo() {
        return (EmailConfirmationDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderFragmentCallbacks getPathfinderCallbacks() {
        return (PathfinderFragmentCallbacks) this.pathfinderCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C411761(null), 1, null);
    }

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$onViewCreated$1", m3645f = "EmailConfirmationFragment.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$onViewCreated$1 */
    static final class C411761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C411761(Continuation<? super C411761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EmailConfirmationFragment.this.new C411761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(EmailConfirmationFragment.this.getDuxo().getEventFlow());
                final EmailConfirmationFragment emailConfirmationFragment = EmailConfirmationFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<EmailConfirmationEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<EmailConfirmationEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<EmailConfirmationEvent> eventConsumerInvoke;
                        EventConsumer<EmailConfirmationEvent> eventConsumerInvoke2;
                        final EmailConfirmationFragment emailConfirmationFragment2 = emailConfirmationFragment;
                        if ((event.getData() instanceof EmailConfirmationEvent.SendInputErrorEvent) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                    m26381invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m26381invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Throwable throwable = ((EmailConfirmationEvent.SendInputErrorEvent) event.getData()).getThrowable();
                                    if (!AbsErrorHandler.handleError$default(emailConfirmationFragment2.getActivityErrorHandler(), throwable, false, 2, null)) {
                                        throw throwable;
                                    }
                                }
                            });
                        }
                        final EmailConfirmationFragment emailConfirmationFragment3 = emailConfirmationFragment;
                        if ((event.getData() instanceof EmailConfirmationEvent.RouteToLogin) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m26382invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m26382invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Navigator navigator = emailConfirmationFragment3.getNavigator();
                                    Context contextRequireContext = emailConfirmationFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD() + "://"), null, null, false, null, 60, null);
                                    emailConfirmationFragment3.getPathfinderCallbacks().dismissFlow();
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-450981529);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-450981529, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment.ComposeContent (EmailConfirmationFragment.kt:49)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-702756548, true, new C411751(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7), this), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmailConfirmationFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$ComposeContent$1 */
    static final class C411751 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<EmailConfirmationViewState> $state$delegate;
        final /* synthetic */ EmailConfirmationFragment this$0;

        C411751(SnapshotState4<EmailConfirmationViewState> snapshotState4, EmailConfirmationFragment emailConfirmationFragment) {
            this.$state$delegate = snapshotState4;
            this.this$0 = emailConfirmationFragment;
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
                ComposerKt.traceEventStart(-702756548, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment.ComposeContent.<anonymous> (EmailConfirmationFragment.kt:53)");
            }
            EmailConfirmationViewState emailConfirmationViewStateComposeContent$lambda$0 = EmailConfirmationFragment.ComposeContent$lambda$0(this.$state$delegate);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$state$delegate) | composer.changedInstance(this.this$0);
            final EmailConfirmationFragment emailConfirmationFragment = this.this$0;
            final SnapshotState4<EmailConfirmationViewState> snapshotState4 = this.$state$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EmailConfirmationFragment.C411751.invoke$lambda$1$lambda$0(emailConfirmationFragment, snapshotState4, (EmailConfirmationInputOption) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EmailConfirmationComposable.EmailConfirmationComposable(emailConfirmationViewStateComposeContent$lambda$0, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EmailConfirmationFragment emailConfirmationFragment, SnapshotState4 snapshotState4, EmailConfirmationInputOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            if (!EmailConfirmationFragment.ComposeContent$lambda$0(snapshotState4).getIsSendingUserInput()) {
                emailConfirmationFragment.getDuxo().sendUserInput$feature_unverified_account_recovery_externalDebug(option);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: EmailConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/EmailConfirmationFragmentKey;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<EmailConfirmationFragment, EmailConfirmationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(EmailConfirmationFragmentKey emailConfirmationFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, emailConfirmationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public EmailConfirmationFragmentKey getArgs(EmailConfirmationFragment emailConfirmationFragment) {
            return (EmailConfirmationFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, emailConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public EmailConfirmationFragment newInstance(EmailConfirmationFragmentKey emailConfirmationFragmentKey) {
            return (EmailConfirmationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, emailConfirmationFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(EmailConfirmationFragment emailConfirmationFragment, EmailConfirmationFragmentKey emailConfirmationFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, emailConfirmationFragment, emailConfirmationFragmentKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmailConfirmationViewState ComposeContent$lambda$0(SnapshotState4<EmailConfirmationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
