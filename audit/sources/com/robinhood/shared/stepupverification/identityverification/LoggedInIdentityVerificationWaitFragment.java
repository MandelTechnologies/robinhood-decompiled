package com.robinhood.shared.stepupverification.identityverification;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.lib.pathfinder.C20366R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.api.pathfinder.UserViewInputRequest;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Duration;

/* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/LoggedInIdentityVerificationWaitFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "getPathfinderStore", "()Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "setPathfinderStore", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onStart", "", "onDialogDismissed", "id", "", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LoggedInIdentityVerificationWaitFragment extends BaseFragment implements AutoLoggableFragment {
    private static final long DEFAULT_POLLING_INTERVAL_SECONDS = 5;
    private static final long POLLING_TIMEOUT_MILLIS = 240000;
    private static final String TIMEOUT_DIALOG_TAG = "timeout-dialog";
    public EventLogger eventLogger;
    private final Screen eventScreen;
    public PathfinderStore pathfinderStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    public LoggedInIdentityVerificationWaitFragment() {
        super(C20366R.layout.fragment_verification_wait);
        this.eventScreen = new Screen(Screen.Name.LOGGED_IN_IDENTITY_VERIFICATION_WAIT, null, null, null, 14, null);
    }

    public final PathfinderStore getPathfinderStore() {
        PathfinderStore pathfinderStore = this.pathfinderStore;
        if (pathfinderStore != null) {
            return pathfinderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pathfinderStore");
        return null;
    }

    public final void setPathfinderStore(PathfinderStore pathfinderStore) {
        Intrinsics.checkNotNullParameter(pathfinderStore, "<set-?>");
        this.pathfinderStore = pathfinderStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        long jLongValue;
        super.onStart();
        Long pollingInterval = ((LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait) INSTANCE.getArgs((Fragment) this)).getUserViewState().getPollingInterval();
        if (pollingInterval != null) {
            jLongValue = pollingInterval.longValue();
        } else {
            CrashReporter.INSTANCE.log("Polling interval was not provided to UarSelfieVerificationWaitFragment!");
            jLongValue = 5;
        }
        getLifecycleScope().launchWhenStarted(new C398581(jLongValue, null));
    }

    /* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1", m3645f = "LoggedInIdentityVerificationWaitFragment.kt", m3646l = {83}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1 */
    static final class C398581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $pollingInterval;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C398581(long j, Continuation<? super C398581> continuation) {
            super(2, continuation);
            this.$pollingInterval = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C398581 c398581 = LoggedInIdentityVerificationWaitFragment.this.new C398581(this.$pollingInterval, continuation);
            c398581.L$0 = obj;
            return c398581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PathfinderStore pathfinderStore = LoggedInIdentityVerificationWaitFragment.this.getPathfinderStore();
                Companion companion = LoggedInIdentityVerificationWaitFragment.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait) companion.getArgs((Fragment) LoggedInIdentityVerificationWaitFragment.this)).getInquiryId();
                UserViewInputRequest userViewInputRequest = new UserViewInputRequest(((LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait) companion.getArgs((Fragment) LoggedInIdentityVerificationWaitFragment.this)).getUserViewState().getSequence(), new UserViewInput.LoggedInIdentityVerificationWait(false));
                Duration durationOfSeconds = Duration.ofSeconds(this.$pollingInterval);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                Flow flowTakeWhile = FlowKt.takeWhile(FlowKt.combine(pathfinderStore.poll(inquiryId, userViewInputRequest, durationOfSeconds), FlowKt.shareIn(FlowKt.flow(new LoggedInIdentityVerificationWaitFragment2(LoggedInIdentityVerificationWaitFragment.this, null)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1), new AnonymousClass1(LoggedInIdentityVerificationWaitFragment.this, null)), new AnonymousClass2(null));
                this.label = 1;
                if (FlowKt.collect(flowTakeWhile, this) == coroutine_suspended) {
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

        /* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "continuePolling"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1$1", m3645f = "LoggedInIdentityVerificationWaitFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<UserViewState, Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ LoggedInIdentityVerificationWaitFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LoggedInIdentityVerificationWaitFragment loggedInIdentityVerificationWaitFragment, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = loggedInIdentityVerificationWaitFragment;
            }

            public final Object invoke(UserViewState userViewState, boolean z, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(UserViewState userViewState, Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(userViewState, bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0 && this.this$0.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED));
            }
        }

        /* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
        @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1$2", m3645f = "LoggedInIdentityVerificationWaitFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return boxing.boxBoolean(this.Z$0);
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        super.onDialogDismissed(id);
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, null, false, 56, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C398571(null), 3, null);
    }

    /* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onDialogDismissed$1", m3645f = "LoggedInIdentityVerificationWaitFragment.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.identityverification.LoggedInIdentityVerificationWaitFragment$onDialogDismissed$1 */
    static final class C398571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C398571(Continuation<? super C398571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoggedInIdentityVerificationWaitFragment.this.new C398571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C398571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderStore pathfinderStore = LoggedInIdentityVerificationWaitFragment.this.getPathfinderStore();
                Companion companion = LoggedInIdentityVerificationWaitFragment.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait) companion.getArgs((Fragment) LoggedInIdentityVerificationWaitFragment.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait) companion.getArgs((Fragment) LoggedInIdentityVerificationWaitFragment.this)).getUserViewState().getSequence();
                UserViewInput.LoggedInIdentityVerificationWait loggedInIdentityVerificationWait = new UserViewInput.LoggedInIdentityVerificationWait(true);
                this.label = 1;
                if (PathfinderStore.handleUserInput$default(pathfinderStore, inquiryId, sequence, loggedInIdentityVerificationWait, null, this, 8, null) == coroutine_suspended) {
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

    /* compiled from: LoggedInIdentityVerificationWaitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/identityverification/LoggedInIdentityVerificationWaitFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/identityverification/LoggedInIdentityVerificationWaitFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderLoggedInIdentityVerificationWait;", "<init>", "()V", "DEFAULT_POLLING_INTERVAL_SECONDS", "", "POLLING_TIMEOUT_MILLIS", "TIMEOUT_DIALOG_TAG", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LoggedInIdentityVerificationWaitFragment, LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait pathfinderLoggedInIdentityVerificationWait) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderLoggedInIdentityVerificationWait);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait getArgs(LoggedInIdentityVerificationWaitFragment loggedInIdentityVerificationWaitFragment) {
            return (LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, loggedInIdentityVerificationWaitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoggedInIdentityVerificationWaitFragment newInstance(LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait pathfinderLoggedInIdentityVerificationWait) {
            return (LoggedInIdentityVerificationWaitFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderLoggedInIdentityVerificationWait);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoggedInIdentityVerificationWaitFragment loggedInIdentityVerificationWaitFragment, LegacyFragmentKey.PathfinderLoggedInIdentityVerificationWait pathfinderLoggedInIdentityVerificationWait) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, loggedInIdentityVerificationWaitFragment, pathfinderLoggedInIdentityVerificationWait);
        }
    }
}
