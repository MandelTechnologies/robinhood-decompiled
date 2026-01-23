package com.robinhood.shared.stepupverification.plaid;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.security.contracts.PlaidAuthenticationFragmentKey;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo;
import com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationEvent;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PlaidAuthenticationDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0012J8\u0010\u001a\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationViewState;", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onLinkSuccess", "", "publicToken", "", "institutionId", "accountId", "showFallbackDialog", "onFallbackDialogDismissed", "onUseFallback", "sendInput", "status", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PlaidAuthenticationDuxo extends BaseDuxo5<PlaidAuthenticationViewState, PlaidAuthenticationEvent> implements HasSavedState {
    private static final String STATUS_ABANDON = "customer_abandon";
    private static final String STATUS_FALLBACK = "fallback";
    private static final long TIMEOUT_MILLIS = 10000;
    private final EventLogger eventLogger;
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidAuthenticationDuxo(PathfinderStore pathfinderStore, EventLogger eventLogger, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new PlaidAuthenticationViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    public final void onLinkSuccess(String publicToken, String institutionId, String accountId) {
        Intrinsics.checkNotNullParameter(publicToken, "publicToken");
        CrashReporter.INSTANCE.log("sending plaid token to Pathfinder");
        sendInput$default(this, publicToken, institutionId, accountId, null, 8, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C399041(null), 3, null);
    }

    /* compiled from: PlaidAuthenticationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$onLinkSuccess$1", m3645f = "PlaidAuthenticationDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$onLinkSuccess$1 */
    static final class C399041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C399041(Continuation<? super C399041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidAuthenticationDuxo.this.new C399041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(10000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Pathfinder did not end the flow"), false, null, 4, null);
            PlaidAuthenticationDuxo.this.submit(PlaidAuthenticationEvent.Timeout.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PlaidAuthenticationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$showFallbackDialog$1", m3645f = "PlaidAuthenticationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$showFallbackDialog$1 */
    static final class C399071 extends ContinuationImpl7 implements Function2<PlaidAuthenticationViewState, Continuation<? super PlaidAuthenticationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C399071(Continuation<? super C399071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399071 c399071 = new C399071(continuation);
            c399071.L$0 = obj;
            return c399071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidAuthenticationViewState plaidAuthenticationViewState, Continuation<? super PlaidAuthenticationViewState> continuation) {
            return ((C399071) create(plaidAuthenticationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((PlaidAuthenticationViewState) this.L$0).copy(true);
        }
    }

    public final void showFallbackDialog() {
        applyMutation(new C399071(null));
    }

    public final void onFallbackDialogDismissed() {
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        Screen screen = new Screen(Screen.Name.PLAID_AUTHENTICATION, null, null, null, 14, null);
        String string2 = ((PlaidAuthenticationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, null, null, null, null, null, null, null, null, null, string2, null, 3071, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null), false, 44, null);
        applyMutation(new C399031(null));
        sendInput$default(this, null, null, null, STATUS_ABANDON, 7, null);
    }

    /* compiled from: PlaidAuthenticationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$onFallbackDialogDismissed$1", m3645f = "PlaidAuthenticationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$onFallbackDialogDismissed$1 */
    static final class C399031 extends ContinuationImpl7 implements Function2<PlaidAuthenticationViewState, Continuation<? super PlaidAuthenticationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C399031(Continuation<? super C399031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399031 c399031 = new C399031(continuation);
            c399031.L$0 = obj;
            return c399031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidAuthenticationViewState plaidAuthenticationViewState, Continuation<? super PlaidAuthenticationViewState> continuation) {
            return ((C399031) create(plaidAuthenticationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((PlaidAuthenticationViewState) this.L$0).copy(false);
        }
    }

    public final void onUseFallback() {
        EventLogger eventLogger = this.eventLogger;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CHALLENGE_FALLBACK;
        Screen screen = new Screen(Screen.Name.PLAID_AUTHENTICATION, null, null, null, 14, null);
        String string2 = ((PlaidAuthenticationFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getInquiryId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChallengeContext(null, null, null, null, null, null, null, null, null, null, string2, null, 3071, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -4097, -1, -1, -1, 16383, null), false, 44, null);
        applyMutation(new C399051(null));
        sendInput$default(this, null, null, null, STATUS_FALLBACK, 7, null);
    }

    /* compiled from: PlaidAuthenticationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$onUseFallback$1", m3645f = "PlaidAuthenticationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$onUseFallback$1 */
    static final class C399051 extends ContinuationImpl7 implements Function2<PlaidAuthenticationViewState, Continuation<? super PlaidAuthenticationViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C399051(Continuation<? super C399051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399051 c399051 = new C399051(continuation);
            c399051.L$0 = obj;
            return c399051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PlaidAuthenticationViewState plaidAuthenticationViewState, Continuation<? super PlaidAuthenticationViewState> continuation) {
            return ((C399051) create(plaidAuthenticationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((PlaidAuthenticationViewState) this.L$0).copy(false);
        }
    }

    static /* synthetic */ void sendInput$default(PlaidAuthenticationDuxo plaidAuthenticationDuxo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        plaidAuthenticationDuxo.sendInput(str, str2, str3, str4);
    }

    /* compiled from: PlaidAuthenticationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$sendInput$1", m3645f = "PlaidAuthenticationDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$sendInput$1 */
    static final class C399061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountId;
        final /* synthetic */ String $institutionId;
        final /* synthetic */ String $publicToken;
        final /* synthetic */ String $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399061(String str, String str2, String str3, String str4, Continuation<? super C399061> continuation) {
            super(2, continuation);
            this.$publicToken = str;
            this.$institutionId = str2;
            this.$accountId = str3;
            this.$status = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidAuthenticationDuxo.this.new C399061(this.$publicToken, this.$institutionId, this.$accountId, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C399061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderStore pathfinderStore = PlaidAuthenticationDuxo.this.pathfinderStore;
                Companion companion = PlaidAuthenticationDuxo.INSTANCE;
                UUID inquiryId = ((PlaidAuthenticationFragmentKey) companion.getArgs((HasSavedState) PlaidAuthenticationDuxo.this)).getInquiryId();
                int sequence = ((PlaidAuthenticationFragmentKey) companion.getArgs((HasSavedState) PlaidAuthenticationDuxo.this)).getUserViewState().getSequence();
                UserViewInput.PlaidAuthentication plaidAuthentication = new UserViewInput.PlaidAuthentication(this.$publicToken, this.$institutionId, this.$accountId, this.$status);
                final PlaidAuthenticationDuxo plaidAuthenticationDuxo = PlaidAuthenticationDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.stepupverification.plaid.PlaidAuthenticationDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(PlaidAuthenticationDuxo.C399061.invokeSuspend$lambda$0(plaidAuthenticationDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, plaidAuthentication, function1, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(PlaidAuthenticationDuxo plaidAuthenticationDuxo, Throwable th) {
            if (!Throwables.isNetworkRelated(th)) {
                return false;
            }
            plaidAuthenticationDuxo.submit(new PlaidAuthenticationEvent.Error(th));
            return true;
        }
    }

    private final void sendInput(String publicToken, String institutionId, String accountId, String status) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C399061(publicToken, institutionId, accountId, status, null), 3, null);
    }

    /* compiled from: PlaidAuthenticationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/stepupverification/plaid/PlaidAuthenticationDuxo;", "Lcom/robinhood/android/security/contracts/PlaidAuthenticationFragmentKey;", "<init>", "()V", "STATUS_ABANDON", "", "STATUS_FALLBACK", "TIMEOUT_MILLIS", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PlaidAuthenticationDuxo, PlaidAuthenticationFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PlaidAuthenticationFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PlaidAuthenticationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PlaidAuthenticationFragmentKey getArgs(PlaidAuthenticationDuxo plaidAuthenticationDuxo) {
            return (PlaidAuthenticationFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, plaidAuthenticationDuxo);
        }
    }
}
