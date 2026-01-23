package com.robinhood.android.rhy.referral.welcome;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyEvent;
import com.robinhood.android.rhy.referral.welcome.WelcomeRhyViewState;
import com.robinhood.android.rhyonboarding.contracts.WelcomeRhyKey;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.logging.RhyGlobalLoggingContext;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore;
import com.robinhood.rhy.referral.RhyReferralOnboardingStore4;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.staticcontent.store.disclosure.RealDisclosureStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: WelcomeRhyDuxo.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001$BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "realDisclosureStore", "Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;", "rhyReferralOnboardingStore", "Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "rhyGlobalLoggingContext", "Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;", "stateProvider", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/staticcontent/store/disclosure/RealDisclosureStore;Lcom/robinhood/rhy/referral/RhyReferralOnboardingStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/librobinhood/logging/RhyGlobalLoggingContext;Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "isLoggedInRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "onResume", "", "onStart", "onDialogPrimaryCta", "ctaConfig", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig;", "onContinueClicked", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyViewState$CtaConfig$Continue;", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class WelcomeRhyDuxo extends BaseDuxo3<WelcomeRhyDataState, WelcomeRhyViewState, WelcomeRhyEvent> implements HasSavedState {
    private static final String LANDING_PAGE_DISCLOSURE_CONTENTFUL_ID = "4RnTKfvSDNh3tgs83jfD7w";
    private final AuthManager authManager;
    private final BehaviorRelay<Boolean> isLoggedInRelay;
    private final RealDisclosureStore realDisclosureStore;
    private final RhyGlobalLoggingContext rhyGlobalLoggingContext;
    private final RhyReferralOnboardingStore rhyReferralOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeRhyDuxo(RealDisclosureStore realDisclosureStore, RhyReferralOnboardingStore rhyReferralOnboardingStore, AuthManager authManager, RhyGlobalLoggingContext rhyGlobalLoggingContext, WelcomeRhyStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new WelcomeRhyDataState(authManager.isLoggedIn(), null, null, null, ((WelcomeRhyKey) INSTANCE.getArgs(savedStateHandle)).getReferralCode(), 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(realDisclosureStore, "realDisclosureStore");
        Intrinsics.checkNotNullParameter(rhyReferralOnboardingStore, "rhyReferralOnboardingStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(rhyGlobalLoggingContext, "rhyGlobalLoggingContext");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.realDisclosureStore = realDisclosureStore;
        this.rhyReferralOnboardingStore = rhyReferralOnboardingStore;
        this.authManager = authManager;
        this.rhyGlobalLoggingContext = rhyGlobalLoggingContext;
        this.savedStateHandle = savedStateHandle;
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.isLoggedInRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.isLoggedInRelay.accept(Boolean.valueOf(this.authManager.isLoggedIn()));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = this.isLoggedInRelay.distinctUntilChanged().doOnNext(new Consumer() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo.onStart.1

            /* compiled from: WelcomeRhyDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$1$1", m3645f = "WelcomeRhyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WelcomeRhyDataState, Continuation<? super WelcomeRhyDataState>, Object> {
                final /* synthetic */ Boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Boolean bool, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = bool;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(WelcomeRhyDataState welcomeRhyDataState, Continuation<? super WelcomeRhyDataState> continuation) {
                    return ((AnonymousClass1) create(welcomeRhyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    WelcomeRhyDataState welcomeRhyDataState = (WelcomeRhyDataState) this.L$0;
                    Boolean bool = this.$it;
                    Intrinsics.checkNotNull(bool);
                    return WelcomeRhyDataState.copy$default(welcomeRhyDataState, bool.booleanValue(), null, null, null, null, 30, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                WelcomeRhyDuxo.this.applyMutation(new AnonymousClass1(bool, null));
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo.onStart.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Boolean bool) {
                WelcomeRhyDuxo.this.rhyGlobalLoggingContext.refresh();
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo.onStart.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RhyReferralOnboardingStore4> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return WelcomeRhyDuxo.this.rhyReferralOnboardingStore.getPostAuthOutAction(((WelcomeRhyKey) WelcomeRhyDuxo.INSTANCE.getArgs((HasSavedState) WelcomeRhyDuxo.this)).getReferralCode());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelcomeRhyDuxo.onStart$lambda$0(this.f$0, (RhyReferralOnboardingStore4) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C275576(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(WelcomeRhyDuxo welcomeRhyDuxo, RhyReferralOnboardingStore4 rhyReferralOnboardingStore4) {
        welcomeRhyDuxo.applyMutation(new WelcomeRhyDuxo2(rhyReferralOnboardingStore4, null));
        return Unit.INSTANCE;
    }

    /* compiled from: WelcomeRhyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$6", m3645f = "WelcomeRhyDuxo.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$6 */
    static final class C275576 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C275576(Continuation<? super C275576> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WelcomeRhyDuxo.this.new C275576(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C275576) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C275576 c275576;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RealDisclosureStore realDisclosureStore = WelcomeRhyDuxo.this.realDisclosureStore;
                this.label = 1;
                c275576 = this;
                obj = ContentStore.DefaultImpls.load$default(realDisclosureStore, WelcomeRhyDuxo.LANDING_PAGE_DISCLOSURE_CONTENTFUL_ID, null, c275576, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c275576 = this;
            }
            WelcomeRhyDuxo.this.applyMutation(new AnonymousClass1((DisclosureContent) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: WelcomeRhyDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$6$1", m3645f = "WelcomeRhyDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhy.referral.welcome.WelcomeRhyDuxo$onStart$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<WelcomeRhyDataState, Continuation<? super WelcomeRhyDataState>, Object> {
            final /* synthetic */ DisclosureContent $content;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DisclosureContent disclosureContent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$content = disclosureContent;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$content, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WelcomeRhyDataState welcomeRhyDataState, Continuation<? super WelcomeRhyDataState> continuation) {
                return ((AnonymousClass1) create(welcomeRhyDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return WelcomeRhyDataState.copy$default((WelcomeRhyDataState) this.L$0, false, null, this.$content, null, null, 27, null);
            }
        }
    }

    public final void onDialogPrimaryCta(WelcomeRhyViewState.CtaConfig ctaConfig) {
        RhyReferralOnboardingStore4 outAction;
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        WelcomeRhyViewState.CtaConfig.Continue r2 = ctaConfig instanceof WelcomeRhyViewState.CtaConfig.Continue ? (WelcomeRhyViewState.CtaConfig.Continue) ctaConfig : null;
        if (r2 == null || (outAction = r2.getOutAction()) == null) {
            return;
        }
        if (outAction instanceof RhyReferralOnboardingStore4.Dialog) {
            submit(new WelcomeRhyEvent.Navigate(((RhyReferralOnboardingStore4.Dialog) outAction).getIntentKey()));
        } else {
            if (!(outAction instanceof RhyReferralOnboardingStore4.Direct)) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new WelcomeRhyEvent.Navigate(((RhyReferralOnboardingStore4.Direct) outAction).getIntentKey()));
        }
    }

    public final void onContinueClicked(WelcomeRhyViewState.CtaConfig.Continue ctaConfig) {
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        RhyReferralOnboardingStore4 outAction = ctaConfig.getOutAction();
        if (outAction instanceof RhyReferralOnboardingStore4.Dialog) {
            submit(new WelcomeRhyEvent.ShowDialog(((RhyReferralOnboardingStore4.Dialog) ctaConfig.getOutAction()).getDialogContent()));
        } else if (outAction instanceof RhyReferralOnboardingStore4.Direct) {
            submit(new WelcomeRhyEvent.Navigate(((RhyReferralOnboardingStore4.Direct) ctaConfig.getOutAction()).getIntentKey()));
        } else if (outAction != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: WelcomeRhyDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rhy/referral/welcome/WelcomeRhyDuxo;", "Lcom/robinhood/android/rhyonboarding/contracts/WelcomeRhyKey;", "<init>", "()V", "LANDING_PAGE_DISCLOSURE_CONTENTFUL_ID", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<WelcomeRhyDuxo, WelcomeRhyKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WelcomeRhyKey getArgs(SavedStateHandle savedStateHandle) {
            return (WelcomeRhyKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WelcomeRhyKey getArgs(WelcomeRhyDuxo welcomeRhyDuxo) {
            return (WelcomeRhyKey) DuxoCompanion.DefaultImpls.getArgs(this, welcomeRhyDuxo);
        }
    }
}
