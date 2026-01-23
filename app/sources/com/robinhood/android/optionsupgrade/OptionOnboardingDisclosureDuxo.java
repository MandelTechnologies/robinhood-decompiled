package com.robinhood.android.optionsupgrade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates2;
import com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureStates4;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.logging.CrashReporter;
import java.util.concurrent.TimeoutException;
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
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: OptionOnboardingDisclosureDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000 \u001b2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\u0006\u0010\u001a\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureViewState;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "stateProvider", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setLoadingNextScreens", "loading", "", "dismissSigningErrorDialog", "loadAgreement", "logLoadingTimeout", "signAgreement", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public class OptionOnboardingDisclosureDuxo extends BaseDuxo3<OptionOnboardingDisclosureDataState, OptionOnboardingDisclosureViewState, OptionOnboardingDisclosureStates4> implements HasSavedState {
    private final AgreementsStore agreementsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOnboardingDisclosureDuxo(AgreementsStore agreementsStore, OptionOnboardingDisclosureStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new OptionOnboardingDisclosureDataState(null, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.agreementsStore = agreementsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C249311(null));
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$onCreate$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$onCreate$1 */
    static final class C249311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C249311(Continuation<? super C249311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDisclosureDuxo.this.new C249311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OptionOnboardingDisclosureDuxo.this.loadAgreement();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$setLoadingNextScreens$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$setLoadingNextScreens$1 */
    static final class C249321 extends ContinuationImpl7 implements Function2<OptionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState>, Object> {
        final /* synthetic */ boolean $loading;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C249321(boolean z, Continuation<? super C249321> continuation) {
            super(2, continuation);
            this.$loading = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249321 c249321 = new C249321(this.$loading, continuation);
            c249321.L$0 = obj;
            return c249321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState> continuation) {
            return ((C249321) create(optionOnboardingDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDisclosureDataState.copy$default((OptionOnboardingDisclosureDataState) this.L$0, null, null, this.$loading, 3, null);
        }
    }

    public final void setLoadingNextScreens(boolean loading) {
        applyMutation(new C249321(loading, null));
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$dismissSigningErrorDialog$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$dismissSigningErrorDialog$1 */
    static final class C249271 extends ContinuationImpl7 implements Function2<OptionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C249271(Continuation<? super C249271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C249271 c249271 = new C249271(continuation);
            c249271.L$0 = obj;
            return c249271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState, Continuation<? super OptionOnboardingDisclosureDataState> continuation) {
            return ((C249271) create(optionOnboardingDisclosureDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OptionOnboardingDisclosureDataState.copy$default((OptionOnboardingDisclosureDataState) this.L$0, null, null, false, 5, null);
        }
    }

    public final void dismissSigningErrorDialog() {
        applyMutation(new C249271(null));
    }

    public final void loadAgreement() {
        withDataState(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingDisclosureDuxo.loadAgreement$lambda$0(this.f$0, (OptionOnboardingDisclosureDataState) obj);
            }
        });
        logLoadingTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAgreement$lambda$0(OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo, OptionOnboardingDisclosureDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (OptionOnboardingDisclosureStates5.canLoadAgain(ds.getAgreementLoadingState())) {
            BuildersKt__Builders_commonKt.launch$default(optionOnboardingDisclosureDuxo.getLifecycleScope(), null, null, new OptionOnboardingDisclosureDuxo2(optionOnboardingDisclosureDuxo, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$logLoadingTimeout$1", m3645f = "OptionOnboardingDisclosureDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$logLoadingTimeout$1 */
    static final class C249301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C249301(Continuation<? super C249301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingDisclosureDuxo.this.new C249301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C249301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(1, DurationUnitJvm.MINUTES);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            OptionOnboardingDisclosureDuxo.this.withDataState(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$logLoadingTimeout$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return OptionOnboardingDisclosureDuxo.C249301.invokeSuspend$lambda$0((OptionOnboardingDisclosureDataState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(OptionOnboardingDisclosureDataState optionOnboardingDisclosureDataState) {
            if (!(optionOnboardingDisclosureDataState.getAgreementLoadingState() instanceof OptionOnboardingDisclosureStates2.Success)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new TimeoutException("Cannot load option agreement in 1min"), false, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    protected void logLoadingTimeout() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C249301(null), 3, null);
    }

    public final void signAgreement() {
        withDataState(new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingDisclosureDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOnboardingDisclosureDuxo.signAgreement$lambda$1(this.f$0, (OptionOnboardingDisclosureDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit signAgreement$lambda$1(OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo, OptionOnboardingDisclosureDataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getSigningLoadingState() instanceof OptionOnboardingDisclosureStates2.Success) {
            optionOnboardingDisclosureDuxo.submit(OptionOnboardingDisclosureStates4.GoToNextScreen.INSTANCE);
        } else if ((ds.getAgreementLoadingState() instanceof OptionOnboardingDisclosureStates2.Success) && !(ds.getSigningLoadingState() instanceof OptionOnboardingDisclosureStates2.Loading)) {
            BuildersKt__Builders_commonKt.launch$default(optionOnboardingDisclosureDuxo.getLifecycleScope(), null, null, new OptionOnboardingDisclosureDuxo3(optionOnboardingDisclosureDuxo, ds, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOnboardingDisclosureDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingDisclosureDuxo;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$Disclosure;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionOnboardingDisclosureDuxo, ScreenArgs.Disclosure> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenArgs.Disclosure getArgs(SavedStateHandle savedStateHandle) {
            return (ScreenArgs.Disclosure) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ScreenArgs.Disclosure getArgs(OptionOnboardingDisclosureDuxo optionOnboardingDisclosureDuxo) {
            return (ScreenArgs.Disclosure) DuxoCompanion.DefaultImpls.getArgs(this, optionOnboardingDisclosureDuxo);
        }
    }
}
