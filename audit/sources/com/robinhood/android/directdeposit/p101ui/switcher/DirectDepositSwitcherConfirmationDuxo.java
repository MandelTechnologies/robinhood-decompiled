package com.robinhood.android.directdeposit.p101ui.switcher;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.directdeposit.p101ui.switcher.DirectDepositSwitcherConfirmationDuxo2;
import com.robinhood.android.directdeposit.p101ui.switcher.DirectDepositSwitcherConfirmationFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositSwitcherConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0012\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState;", "Lcom/robinhood/android/udf/HasSavedState;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onPrimaryButtonClicked", "enrollInEarlyPay", "state", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationState$Loaded;", "DirectDepositSwitcherException", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectDepositSwitcherConfirmationDuxo extends OldBaseDuxo<DirectDepositSwitcherConfirmationDuxo2> implements HasSavedState {
    private static final long EP_TIMEOUT_SECONDS = 3;
    private final EarlyPayEnrollmentStore earlyPayEnrollmentStore;
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
    public DirectDepositSwitcherConfirmationDuxo(EarlyPayEnrollmentStore earlyPayEnrollmentStore, SavedStateHandle savedStateHandle) {
        super(DirectDepositSwitcherConfirmationDuxo2.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        if (((DirectDepositSwitcherConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getShowEarlyPayHook()) {
            EarlyPayEnrollmentStore.refresh$default(this.earlyPayEnrollmentStore, false, 1, null);
            Single<EarlyPayEnrollment> singleTimeout = this.earlyPayEnrollmentStore.streamEnrollment().firstOrError().timeout(3L, TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(singleTimeout, "timeout(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleTimeout, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectDepositSwitcherConfirmationDuxo.onStart$lambda$1(this.f$0, (EarlyPayEnrollment) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DirectDepositSwitcherConfirmationDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
                }
            });
            return;
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.onStart$lambda$4(this.f$0, (DirectDepositSwitcherConfirmationDuxo2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(final DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, final EarlyPayEnrollment earlyPayEnrollment) {
        directDepositSwitcherConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.onStart$lambda$1$lambda$0(this.f$0, earlyPayEnrollment, (DirectDepositSwitcherConfirmationDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSwitcherConfirmationDuxo2 onStart$lambda$1$lambda$0(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, EarlyPayEnrollment earlyPayEnrollment, DirectDepositSwitcherConfirmationDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DirectDepositSwitcherConfirmationDuxo2.Loaded(((DirectDepositSwitcherConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) directDepositSwitcherConfirmationDuxo)).getShowEarlyPayHook(), earlyPayEnrollment, null, false, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(final DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        directDepositSwitcherConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.onStart$lambda$3$lambda$2(this.f$0, (DirectDepositSwitcherConfirmationDuxo2) obj);
            }
        });
        if (!(throwable instanceof TimeoutException)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new DirectDepositSwitcherException(throwable), false, null, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSwitcherConfirmationDuxo2 onStart$lambda$3$lambda$2(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, DirectDepositSwitcherConfirmationDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DirectDepositSwitcherConfirmationDuxo2.Loaded(((DirectDepositSwitcherConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) directDepositSwitcherConfirmationDuxo)).getShowEarlyPayHook(), null, null, false, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSwitcherConfirmationDuxo2 onStart$lambda$4(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, DirectDepositSwitcherConfirmationDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DirectDepositSwitcherConfirmationDuxo2.Loaded(((DirectDepositSwitcherConfirmationFragment.Args) INSTANCE.getArgs((HasSavedState) directDepositSwitcherConfirmationDuxo)).getShowEarlyPayHook(), null, null, false, null, 28, null);
    }

    public final void onPrimaryButtonClicked() {
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.onPrimaryButtonClicked$lambda$5(this.f$0, (DirectDepositSwitcherConfirmationDuxo2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSwitcherConfirmationDuxo2 onPrimaryButtonClicked$lambda$5(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, DirectDepositSwitcherConfirmationDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (!(applyMutation instanceof DirectDepositSwitcherConfirmationDuxo2.Loaded)) {
            return applyMutation;
        }
        DirectDepositSwitcherConfirmationDuxo2.Loaded loaded = (DirectDepositSwitcherConfirmationDuxo2.Loaded) applyMutation;
        if (loaded.getIsEarlyPayHookVisible()) {
            directDepositSwitcherConfirmationDuxo.enrollInEarlyPay(loaded);
            return DirectDepositSwitcherConfirmationDuxo2.Loaded.copy$default(loaded, false, null, null, true, null, 23, null);
        }
        return DirectDepositSwitcherConfirmationDuxo2.Loaded.copy$default(loaded, false, null, new UiEvent(Unit.INSTANCE), false, null, 27, null);
    }

    private final void enrollInEarlyPay(final DirectDepositSwitcherConfirmationDuxo2.Loaded state) {
        LifecycleHost.DefaultImpls.bind$default(this, this.earlyPayEnrollmentStore.updateEnrollment(true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.enrollInEarlyPay$lambda$7(this.f$0, state, (ApiEarlyPayEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.enrollInEarlyPay$lambda$9(this.f$0, state, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInEarlyPay$lambda$7(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, final DirectDepositSwitcherConfirmationDuxo2.Loaded loaded, final ApiEarlyPayEnrollment enrollment) {
        Intrinsics.checkNotNullParameter(enrollment, "enrollment");
        directDepositSwitcherConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.enrollInEarlyPay$lambda$7$lambda$6(enrollment, loaded, (DirectDepositSwitcherConfirmationDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSwitcherConfirmationDuxo2 enrollInEarlyPay$lambda$7$lambda$6(ApiEarlyPayEnrollment apiEarlyPayEnrollment, DirectDepositSwitcherConfirmationDuxo2.Loaded loaded, DirectDepositSwitcherConfirmationDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectDepositSwitcherConfirmationDuxo2.Loaded.copy$default(loaded, false, null, null, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(apiEarlyPayEnrollment))), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enrollInEarlyPay$lambda$9(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo, final DirectDepositSwitcherConfirmationDuxo2.Loaded loaded, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        directDepositSwitcherConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.switcher.DirectDepositSwitcherConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositSwitcherConfirmationDuxo.enrollInEarlyPay$lambda$9$lambda$8(throwable, loaded, (DirectDepositSwitcherConfirmationDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositSwitcherConfirmationDuxo2 enrollInEarlyPay$lambda$9$lambda$8(Throwable th, DirectDepositSwitcherConfirmationDuxo2.Loaded loaded, DirectDepositSwitcherConfirmationDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return DirectDepositSwitcherConfirmationDuxo2.Loaded.copy$default(loaded, false, null, null, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))), 7, null);
    }

    /* compiled from: DirectDepositSwitcherConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationDuxo$DirectDepositSwitcherException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DirectDepositSwitcherException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectDepositSwitcherException(Throwable cause) {
            super(cause);
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    /* compiled from: DirectDepositSwitcherConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationDuxo;", "Lcom/robinhood/android/directdeposit/ui/switcher/DirectDepositSwitcherConfirmationFragment$Args;", "<init>", "()V", "EP_TIMEOUT_SECONDS", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectDepositSwitcherConfirmationDuxo, DirectDepositSwitcherConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectDepositSwitcherConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DirectDepositSwitcherConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectDepositSwitcherConfirmationFragment.Args getArgs(DirectDepositSwitcherConfirmationDuxo directDepositSwitcherConfirmationDuxo) {
            return (DirectDepositSwitcherConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, directDepositSwitcherConfirmationDuxo);
        }
    }
}
