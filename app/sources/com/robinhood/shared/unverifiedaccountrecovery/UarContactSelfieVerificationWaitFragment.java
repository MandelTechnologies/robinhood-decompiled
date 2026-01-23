package com.robinhood.shared.unverifiedaccountrecovery;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycle;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.lib.pathfinder.C20366R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.api.pathfinder.UserViewInputRequest;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.prefs.Installation;
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
import p479j$.time.Duration;

/* compiled from: UarContactSelfieVerificationWaitFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationWaitFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "getPathfinderStore", "()Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "setPathfinderStore", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "installation", "Lcom/robinhood/prefs/Installation;", "getInstallation", "()Lcom/robinhood/prefs/Installation;", "setInstallation", "(Lcom/robinhood/prefs/Installation;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UarContactSelfieVerificationWaitFragment extends BaseFragment {
    private static final long DEFAULT_POLLING_INTERVAL_SECONDS = 5;
    private static final long POLLING_TIMEOUT_MILLIS = 120000;
    private static final String TIMEOUT_DIALOG_TAG = "timeout-dialog";
    public Installation installation;
    public PathfinderStore pathfinderStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UarContactSelfieVerificationWaitFragment() {
        super(C20366R.layout.fragment_verification_wait);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        long jLongValue;
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        Long pollingInterval = ((LegacyFragmentKey.UarContactSelfieVerificationWait) companion.getArgs((Fragment) this)).getUserViewState().getPollingInterval();
        if (pollingInterval != null) {
            jLongValue = pollingInterval.longValue();
        } else {
            CrashReporter.INSTANCE.log("Polling interval was not provided to UarSelfieVerificationWaitFragment!");
            jLongValue = 5;
        }
        PathfinderStore pathfinderStore = getPathfinderStore();
        UUID inquiryId = ((LegacyFragmentKey.UarContactSelfieVerificationWait) companion.getArgs((Fragment) this)).getInquiryId();
        UserViewInputRequest userViewInputRequest = new UserViewInputRequest(((LegacyFragmentKey.UarContactSelfieVerificationWait) companion.getArgs((Fragment) this)).getUserViewState().getSequence(), new UserViewInput.UarContactSelfieVerificationWait(getInstallation().mo2745id(), false));
        Duration durationOfSeconds = Duration.ofSeconds(jLongValue);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C411361(pathfinderStore.poll(inquiryId, userViewInputRequest, durationOfSeconds), FlowKt.flow(new UarContactSelfieVerificationWaitFragment2(this, null)), null), 3, null);
    }

    /* compiled from: UarContactSelfieVerificationWaitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1", m3645f = "UarContactSelfieVerificationWaitFragment.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1 */
    static final class C411361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<UserViewState> $poller;
        final /* synthetic */ Flow<Boolean> $shouldPoll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C411361(Flow<? extends UserViewState> flow, Flow<Boolean> flow2, Continuation<? super C411361> continuation) {
            super(2, continuation);
            this.$poller = flow;
            this.$shouldPoll = flow2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UarContactSelfieVerificationWaitFragment.this.new C411361(this.$poller, this.$shouldPoll, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UarContactSelfieVerificationWaitFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1$1", m3645f = "UarContactSelfieVerificationWaitFragment.kt", m3646l = {73}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UserViewState> $poller;
            final /* synthetic */ Flow<Boolean> $shouldPoll;
            int label;
            final /* synthetic */ UarContactSelfieVerificationWaitFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Flow<? extends UserViewState> flow, Flow<Boolean> flow2, UarContactSelfieVerificationWaitFragment uarContactSelfieVerificationWaitFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$poller = flow;
                this.$shouldPoll = flow2;
                this.this$0 = uarContactSelfieVerificationWaitFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$poller, this.$shouldPoll, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: UarContactSelfieVerificationWaitFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "continuePolling"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1$1$1", m3645f = "UarContactSelfieVerificationWaitFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C508211 extends ContinuationImpl7 implements Function3<UserViewState, Boolean, Continuation<? super Boolean>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ UarContactSelfieVerificationWaitFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C508211(UarContactSelfieVerificationWaitFragment uarContactSelfieVerificationWaitFragment, Continuation<? super C508211> continuation) {
                    super(3, continuation);
                    this.this$0 = uarContactSelfieVerificationWaitFragment;
                }

                public final Object invoke(UserViewState userViewState, boolean z, Continuation<? super Boolean> continuation) {
                    C508211 c508211 = new C508211(this.this$0, continuation);
                    c508211.Z$0 = z;
                    return c508211.invokeSuspend(Unit.INSTANCE);
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
                    return boxing.boxBoolean(this.Z$0 && this.this$0.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED));
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTakeWhile = FlowKt.takeWhile(FlowKt.combine(this.$poller, this.$shouldPoll, new C508211(this.this$0, null)), new AnonymousClass2(null));
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

            /* compiled from: UarContactSelfieVerificationWaitFragment.kt */
            @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1$1$2", m3645f = "UarContactSelfieVerificationWaitFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onCreate$1$1$2, reason: invalid class name */
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UarContactSelfieVerificationWaitFragment uarContactSelfieVerificationWaitFragment = UarContactSelfieVerificationWaitFragment.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$poller, this.$shouldPoll, uarContactSelfieVerificationWaitFragment, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(uarContactSelfieVerificationWaitFragment, state, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: UarContactSelfieVerificationWaitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onDialogDismissed$1", m3645f = "UarContactSelfieVerificationWaitFragment.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarContactSelfieVerificationWaitFragment$onDialogDismissed$1 */
    static final class C411371 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C411371(Continuation<? super C411371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UarContactSelfieVerificationWaitFragment.this.new C411371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderStore pathfinderStore = UarContactSelfieVerificationWaitFragment.this.getPathfinderStore();
                Companion companion = UarContactSelfieVerificationWaitFragment.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.UarContactSelfieVerificationWait) companion.getArgs((Fragment) UarContactSelfieVerificationWaitFragment.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.UarContactSelfieVerificationWait) companion.getArgs((Fragment) UarContactSelfieVerificationWaitFragment.this)).getUserViewState().getSequence();
                UserViewInput.UarContactSelfieVerificationWait uarContactSelfieVerificationWait = new UserViewInput.UarContactSelfieVerificationWait(UarContactSelfieVerificationWaitFragment.this.getInstallation().mo2745id(), true);
                this.label = 1;
                if (PathfinderStore.handleUserInput$default(pathfinderStore, inquiryId, sequence, uarContactSelfieVerificationWait, null, this, 8, null) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        super.onDialogDismissed(id);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C411371(null), 3, null);
    }

    /* compiled from: UarContactSelfieVerificationWaitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationWaitFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarContactSelfieVerificationWaitFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarContactSelfieVerificationWait;", "<init>", "()V", "DEFAULT_POLLING_INTERVAL_SECONDS", "", "POLLING_TIMEOUT_MILLIS", "TIMEOUT_DIALOG_TAG", "", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UarContactSelfieVerificationWaitFragment, LegacyFragmentKey.UarContactSelfieVerificationWait> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.UarContactSelfieVerificationWait uarContactSelfieVerificationWait) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, uarContactSelfieVerificationWait);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.UarContactSelfieVerificationWait getArgs(UarContactSelfieVerificationWaitFragment uarContactSelfieVerificationWaitFragment) {
            return (LegacyFragmentKey.UarContactSelfieVerificationWait) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uarContactSelfieVerificationWaitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UarContactSelfieVerificationWaitFragment newInstance(LegacyFragmentKey.UarContactSelfieVerificationWait uarContactSelfieVerificationWait) {
            return (UarContactSelfieVerificationWaitFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, uarContactSelfieVerificationWait);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UarContactSelfieVerificationWaitFragment uarContactSelfieVerificationWaitFragment, LegacyFragmentKey.UarContactSelfieVerificationWait uarContactSelfieVerificationWait) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uarContactSelfieVerificationWaitFragment, uarContactSelfieVerificationWait);
        }
    }
}
