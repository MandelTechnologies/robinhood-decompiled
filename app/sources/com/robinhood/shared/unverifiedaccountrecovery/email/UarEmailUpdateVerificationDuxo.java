package com.robinhood.shared.unverifiedaccountrecovery.email;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo;
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

/* compiled from: UarEmailUpdateVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sendInput", "", "action", "Lcom/robinhood/models/api/pathfinder/contexts/CtaAction;", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UarEmailUpdateVerificationDuxo extends OldBaseDuxo<UarEmailUpdateVerificationViewState> implements HasSavedState {
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
    /* JADX WARN: Multi-variable type inference failed */
    public UarEmailUpdateVerificationDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle) {
        super(new UarEmailUpdateVerificationViewState(false, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void sendInput(CtaAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        String target = action.getTarget();
        if (target != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C411651(target, action, null), 3, null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("CTA Action type UPDATE_INQUIRY was found but value id is null"), false, null, 6, null);
        }
    }

    /* compiled from: UarEmailUpdateVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1", m3645f = "UarEmailUpdateVerificationDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1 */
    static final class C411651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CtaAction $action;
        final /* synthetic */ String $actionTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C411651(String str, CtaAction ctaAction, Continuation<? super C411651> continuation) {
            super(2, continuation);
            this.$actionTarget = str;
            this.$action = ctaAction;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UarEmailUpdateVerificationDuxo.this.new C411651(this.$actionTarget, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C411651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C411651 c411651;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UarEmailUpdateVerificationDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UarEmailUpdateVerificationDuxo.C411651.invokeSuspend$lambda$0((UarEmailUpdateVerificationViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = UarEmailUpdateVerificationDuxo.this.pathfinderStore;
                Companion companion = UarEmailUpdateVerificationDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.UarEmailUpdateVerification) companion.getArgs((HasSavedState) UarEmailUpdateVerificationDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.UarEmailUpdateVerification) companion.getArgs((HasSavedState) UarEmailUpdateVerificationDuxo.this)).getUserViewState().getSequence();
                UserViewInput.UarEmailUpdateVerification uarEmailUpdateVerification = new UserViewInput.UarEmailUpdateVerification(this.$actionTarget);
                final UarEmailUpdateVerificationDuxo uarEmailUpdateVerificationDuxo = UarEmailUpdateVerificationDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(UarEmailUpdateVerificationDuxo.C411651.invokeSuspend$lambda$3(uarEmailUpdateVerificationDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c411651 = this;
                obj = pathfinderStore.handleUserInput(inquiryId, sequence, uarEmailUpdateVerification, function1, c411651);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c411651 = this;
            }
            if (((UserViewState) obj) != null) {
                UarEmailUpdateVerificationDuxo uarEmailUpdateVerificationDuxo2 = UarEmailUpdateVerificationDuxo.this;
                final CtaAction ctaAction = c411651.$action;
                uarEmailUpdateVerificationDuxo2.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UarEmailUpdateVerificationDuxo.C411651.invokeSuspend$lambda$4(ctaAction, (UarEmailUpdateVerificationViewState) obj2);
                    }
                });
            }
            UarEmailUpdateVerificationDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UarEmailUpdateVerificationDuxo.C411651.invokeSuspend$lambda$5((UarEmailUpdateVerificationViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarEmailUpdateVerificationViewState invokeSuspend$lambda$0(UarEmailUpdateVerificationViewState uarEmailUpdateVerificationViewState) {
            return UarEmailUpdateVerificationViewState.copy$default(uarEmailUpdateVerificationViewState, true, null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(UarEmailUpdateVerificationDuxo uarEmailUpdateVerificationDuxo, final Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                uarEmailUpdateVerificationDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationDuxo$sendInput$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarEmailUpdateVerificationDuxo.C411651.invokeSuspend$lambda$3$lambda$2$lambda$1(th, (UarEmailUpdateVerificationViewState) obj);
                    }
                });
            }
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarEmailUpdateVerificationViewState invokeSuspend$lambda$3$lambda$2$lambda$1(Throwable th, UarEmailUpdateVerificationViewState uarEmailUpdateVerificationViewState) {
            return UarEmailUpdateVerificationViewState.copy$default(uarEmailUpdateVerificationViewState, false, null, new ComposeUiEvent(th), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarEmailUpdateVerificationViewState invokeSuspend$lambda$4(CtaAction ctaAction, UarEmailUpdateVerificationViewState uarEmailUpdateVerificationViewState) {
            return UarEmailUpdateVerificationViewState.copy$default(uarEmailUpdateVerificationViewState, false, new ComposeUiEvent(ctaAction), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarEmailUpdateVerificationViewState invokeSuspend$lambda$5(UarEmailUpdateVerificationViewState uarEmailUpdateVerificationViewState) {
            return UarEmailUpdateVerificationViewState.copy$default(uarEmailUpdateVerificationViewState, false, null, null, 6, null);
        }
    }

    /* compiled from: UarEmailUpdateVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateVerification;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UarEmailUpdateVerificationDuxo, LegacyFragmentKey.UarEmailUpdateVerification> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.UarEmailUpdateVerification getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.UarEmailUpdateVerification) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.UarEmailUpdateVerification getArgs(UarEmailUpdateVerificationDuxo uarEmailUpdateVerificationDuxo) {
            return (LegacyFragmentKey.UarEmailUpdateVerification) DuxoCompanion.DefaultImpls.getArgs(this, uarEmailUpdateVerificationDuxo);
        }
    }
}
