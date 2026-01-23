package com.robinhood.shared.unverifiedaccountrecovery.phone;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo;
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

/* compiled from: UarSmsMfaEnrollPhoneInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "sendInput", "", "phoneNumber", "", "action", "Lcom/robinhood/models/api/pathfinder/contexts/CtaAction;", "setInternationalInfo", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/common/util/InternationalInfo;", "Companion", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class UarSmsMfaEnrollPhoneInputDuxo extends OldBaseDuxo<UarSmsMfaEnrollPhoneInputViewState> implements HasSavedState {
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
    public UarSmsMfaEnrollPhoneInputDuxo(PathfinderStore pathfinderStore, SavedStateHandle savedStateHandle) {
        super(new UarSmsMfaEnrollPhoneInputViewState(null, false, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void sendInput(String phoneNumber, CtaAction action) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(action, "action");
        String target = action.getTarget();
        if (target != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C412031(phoneNumber, target, null), 3, null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("CTA Action type UPDATE_INQUIRY was found but value id is null"), false, null, 6, null);
        }
    }

    /* compiled from: UarSmsMfaEnrollPhoneInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$sendInput$1", m3645f = "UarSmsMfaEnrollPhoneInputDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$sendInput$1 */
    static final class C412031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $actionTarget;
        final /* synthetic */ String $phoneNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C412031(String str, String str2, Continuation<? super C412031> continuation) {
            super(2, continuation);
            this.$phoneNumber = str;
            this.$actionTarget = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UarSmsMfaEnrollPhoneInputDuxo.this.new C412031(this.$phoneNumber, this.$actionTarget, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C412031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C412031 c412031;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UarSmsMfaEnrollPhoneInputDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$sendInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UarSmsMfaEnrollPhoneInputDuxo.C412031.invokeSuspend$lambda$0((UarSmsMfaEnrollPhoneInputViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = UarSmsMfaEnrollPhoneInputDuxo.this.pathfinderStore;
                Companion companion = UarSmsMfaEnrollPhoneInputDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput) companion.getArgs((HasSavedState) UarSmsMfaEnrollPhoneInputDuxo.this)).getInquiryId();
                int sequence = ((LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput) companion.getArgs((HasSavedState) UarSmsMfaEnrollPhoneInputDuxo.this)).getUserViewState().getSequence();
                UserViewInput.SmsMfaEnrollPhoneInput smsMfaEnrollPhoneInput = new UserViewInput.SmsMfaEnrollPhoneInput(this.$phoneNumber, this.$actionTarget);
                final UarSmsMfaEnrollPhoneInputDuxo uarSmsMfaEnrollPhoneInputDuxo = UarSmsMfaEnrollPhoneInputDuxo.this;
                Function1<? super Throwable, Boolean> function1 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$sendInput$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(UarSmsMfaEnrollPhoneInputDuxo.C412031.invokeSuspend$lambda$3(uarSmsMfaEnrollPhoneInputDuxo, (Throwable) obj2));
                    }
                };
                this.label = 1;
                c412031 = this;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, smsMfaEnrollPhoneInput, function1, c412031) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c412031 = this;
            }
            UarSmsMfaEnrollPhoneInputDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$sendInput$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UarSmsMfaEnrollPhoneInputDuxo.C412031.invokeSuspend$lambda$4((UarSmsMfaEnrollPhoneInputViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarSmsMfaEnrollPhoneInputViewState invokeSuspend$lambda$0(UarSmsMfaEnrollPhoneInputViewState uarSmsMfaEnrollPhoneInputViewState) {
            return UarSmsMfaEnrollPhoneInputViewState.copy$default(uarSmsMfaEnrollPhoneInputViewState, null, true, null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$3(UarSmsMfaEnrollPhoneInputDuxo uarSmsMfaEnrollPhoneInputDuxo, final Throwable th) {
            boolean zIsNetworkRelated = Throwables.isNetworkRelated(th);
            if (zIsNetworkRelated) {
                uarSmsMfaEnrollPhoneInputDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$sendInput$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarSmsMfaEnrollPhoneInputDuxo.C412031.invokeSuspend$lambda$3$lambda$2$lambda$1(th, (UarSmsMfaEnrollPhoneInputViewState) obj);
                    }
                });
            }
            return zIsNetworkRelated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarSmsMfaEnrollPhoneInputViewState invokeSuspend$lambda$3$lambda$2$lambda$1(Throwable th, UarSmsMfaEnrollPhoneInputViewState uarSmsMfaEnrollPhoneInputViewState) {
            return UarSmsMfaEnrollPhoneInputViewState.copy$default(uarSmsMfaEnrollPhoneInputViewState, null, false, new ComposeUiEvent(th), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UarSmsMfaEnrollPhoneInputViewState invokeSuspend$lambda$4(UarSmsMfaEnrollPhoneInputViewState uarSmsMfaEnrollPhoneInputViewState) {
            return UarSmsMfaEnrollPhoneInputViewState.copy$default(uarSmsMfaEnrollPhoneInputViewState, null, false, null, 5, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UarSmsMfaEnrollPhoneInputViewState setInternationalInfo$lambda$1(InternationalInfo internationalInfo, UarSmsMfaEnrollPhoneInputViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return UarSmsMfaEnrollPhoneInputViewState.copy$default(applyMutation, internationalInfo, false, null, 6, null);
    }

    public final void setInternationalInfo(final InternationalInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        applyMutation(new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.UarSmsMfaEnrollPhoneInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UarSmsMfaEnrollPhoneInputDuxo.setInternationalInfo$lambda$1(info, (UarSmsMfaEnrollPhoneInputViewState) obj);
            }
        });
    }

    /* compiled from: UarSmsMfaEnrollPhoneInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/UarSmsMfaEnrollPhoneInputDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollPhoneInput;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<UarSmsMfaEnrollPhoneInputDuxo, LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput getArgs(UarSmsMfaEnrollPhoneInputDuxo uarSmsMfaEnrollPhoneInputDuxo) {
            return (LegacyFragmentKey.PathfinderSmsMfaEnrollPhoneInput) DuxoCompanion.DefaultImpls.getArgs(this, uarSmsMfaEnrollPhoneInputDuxo);
        }
    }
}
