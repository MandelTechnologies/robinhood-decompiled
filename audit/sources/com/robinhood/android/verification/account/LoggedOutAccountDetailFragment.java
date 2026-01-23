package com.robinhood.android.verification.account;

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
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.verification.account.LoggedOutAccountDetailEvent;
import com.robinhood.android.verification.account.LoggedOutAccountDetailFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.p355ui.PhoneNumber;
import com.robinhood.prefs.Installation;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.support.contracts.pathfinder.LoggedOutAccountDetailFragmentKey;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LoggedOutAccountDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\r\u0010%\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010&R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "installation", "Lcom/robinhood/prefs/Installation;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "setInstallation", "(Lcom/robinhood/prefs/Installation;)V", "duxo", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "previousSoftInputMode", "", "phoneNumberVisualTransformation", "Lcom/robinhood/android/verification/account/PatternTemplateVisualTransformation;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-verification_externalDebug", "state", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class LoggedOutAccountDetailFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public Installation installation;
    private int previousSoftInputMode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, LoggedOutAccountDetailDuxo.class);
    private final PatternTemplateVisualTransformation phoneNumberVisualTransformation = new PatternTemplateVisualTransformation(PatternTemplateVisualTransformation.INTERNATIONAL_US_NUMBER_TEMPLATE, 0, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment, int i, Composer composer, int i2) {
        loggedOutAccountDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    public final Installation getInstallation() {
        Installation installation = this.installation;
        if (installation != null) {
            return installation;
        }
        Intrinsics.throwUninitializedPropertyAccessException("installation");
        return null;
    }

    public final void setInstallation(Installation installation) {
        Intrinsics.checkNotNullParameter(installation, "<set-?>");
        this.installation = installation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoggedOutAccountDetailDuxo getDuxo() {
        return (LoggedOutAccountDetailDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return String.valueOf(((LoggedOutAccountDetailFragmentKey) INSTANCE.getArgs((Fragment) this)).getInquiryId());
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.CX_ACCOUNT_DETAIL_PAGE, null, getScreenDescription(), null, 10, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C313881(null), 1, null);
    }

    /* compiled from: LoggedOutAccountDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$onViewCreated$1", m3645f = "LoggedOutAccountDetailFragment.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$onViewCreated$1 */
    static final class C313881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313881(Continuation<? super C313881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoggedOutAccountDetailFragment.this.new C313881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(LoggedOutAccountDetailFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LoggedOutAccountDetailFragment.this, null);
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

        /* compiled from: LoggedOutAccountDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$onViewCreated$1$1", m3645f = "LoggedOutAccountDetailFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<LoggedOutAccountDetailEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LoggedOutAccountDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = loggedOutAccountDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<LoggedOutAccountDetailEvent> event, Continuation<? super Unit> continuation) {
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
                final LoggedOutAccountDetailFragment loggedOutAccountDetailFragment = this.this$0;
                if ((event.getData() instanceof LoggedOutAccountDetailEvent.SendInputErrorEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                    eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                            m20035invoke(obj2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m20035invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Throwable error = ((LoggedOutAccountDetailEvent.SendInputErrorEvent) event.getData()).getError();
                            if (!AbsErrorHandler.handleError$default(loggedOutAccountDetailFragment.getActivityErrorHandler(), error, false, 2, null)) {
                                throw error;
                            }
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.previousSoftInputMode = 18;
        requireActivity().getWindow().setSoftInputMode(16);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireActivity().getWindow().setSoftInputMode(this.previousSoftInputMode);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-778697343);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-778697343, i2, -1, "com.robinhood.android.verification.account.LoggedOutAccountDetailFragment.ComposeContent (LoggedOutAccountDetailFragment.kt:78)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-2017077140, true, new C313871(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoggedOutAccountDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: LoggedOutAccountDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$ComposeContent$1 */
    static final class C313871 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<LoggedOutAccountDetailViewState> $state$delegate;

        C313871(SnapshotState4<LoggedOutAccountDetailViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-2017077140, i, -1, "com.robinhood.android.verification.account.LoggedOutAccountDetailFragment.ComposeContent.<anonymous> (LoggedOutAccountDetailFragment.kt:84)");
            }
            LoggedOutAccountDetailViewState loggedOutAccountDetailViewStateComposeContent$lambda$0 = LoggedOutAccountDetailFragment.ComposeContent$lambda$0(this.$state$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(LoggedOutAccountDetailFragment.this);
            final LoggedOutAccountDetailFragment loggedOutAccountDetailFragment = LoggedOutAccountDetailFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoggedOutAccountDetailFragment.C313871.invoke$lambda$1$lambda$0(loggedOutAccountDetailFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(LoggedOutAccountDetailFragment.this);
            final LoggedOutAccountDetailFragment loggedOutAccountDetailFragment2 = LoggedOutAccountDetailFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoggedOutAccountDetailFragment.C313871.invoke$lambda$3$lambda$2(loggedOutAccountDetailFragment2, (PhoneNumber) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(LoggedOutAccountDetailFragment.this);
            final LoggedOutAccountDetailFragment loggedOutAccountDetailFragment3 = LoggedOutAccountDetailFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function2() { // from class: com.robinhood.android.verification.account.LoggedOutAccountDetailFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoggedOutAccountDetailFragment.C313871.invoke$lambda$5$lambda$4(loggedOutAccountDetailFragment3, (String) obj, (PhoneNumber) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            LoggedOutAccountDetailComposabale.LoggedOutAccountDetailComposable(loggedOutAccountDetailViewStateComposeContent$lambda$0, function1, function12, (Function2) objRememberedValue3, LoggedOutAccountDetailFragment.this.phoneNumberVisualTransformation, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            loggedOutAccountDetailFragment.getDuxo().handleEmailChanged(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment, PhoneNumber it) {
            Intrinsics.checkNotNullParameter(it, "it");
            loggedOutAccountDetailFragment.getDuxo().handleNumberChanged(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment, String email, PhoneNumber phoneNumber) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            loggedOutAccountDetailFragment.getDuxo().handleContinueClicked(loggedOutAccountDetailFragment.getInstallation().mo2745id(), email, phoneNumber);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoggedOutAccountDetailViewState ComposeContent$lambda$0(SnapshotState4<LoggedOutAccountDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: LoggedOutAccountDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/LoggedOutAccountDetailFragmentKey;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LoggedOutAccountDetailFragment, LoggedOutAccountDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LoggedOutAccountDetailFragmentKey loggedOutAccountDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, loggedOutAccountDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LoggedOutAccountDetailFragmentKey getArgs(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment) {
            return (LoggedOutAccountDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, loggedOutAccountDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoggedOutAccountDetailFragment newInstance(LoggedOutAccountDetailFragmentKey loggedOutAccountDetailFragmentKey) {
            return (LoggedOutAccountDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, loggedOutAccountDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoggedOutAccountDetailFragment loggedOutAccountDetailFragment, LoggedOutAccountDetailFragmentKey loggedOutAccountDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, loggedOutAccountDetailFragment, loggedOutAccountDetailFragmentKey);
        }
    }
}
