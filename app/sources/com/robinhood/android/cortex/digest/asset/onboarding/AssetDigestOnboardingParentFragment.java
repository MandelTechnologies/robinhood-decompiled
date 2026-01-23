package com.robinhood.android.cortex.digest.asset.onboarding;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFragmentKey;
import com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentEvent;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeContract;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.agreements.contracts.IdentiAgreementKey;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AssetDigestOnboardingParentFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0016J\u0018\u0010'\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\rH\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J \u0010+\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0002J\b\u0010-\u001a\u00020\u001dH\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001a \u001b*\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Callbacks;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo;", "getDuxo", "()Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "isAgreementSubmitting", "goldUpgradeFlowLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeIntentKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onBackPressed", "onSkipSplash", "hasSignedAgreement", "hasGoldOrNotRequired", "onContinueClick", "onSubmissionStateChanged", "isSubmitting", "onAgreementAccepted", "showAgreementOrGoldOnboarding", "withoutBackstack", "showSearch", "Companion", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestOnboardingParentFragment extends BaseFragment implements AssetDigestSplashFragment.Callbacks, IdentiAgreementKey.Callbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldUpgradeIntentKey>> goldUpgradeFlowLauncher;
    private boolean isAgreementSubmitting;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    public AssetDigestOnboardingParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.duxo = DuxosKt.duxo(this, AssetDigestOnboardingParentDuxo.class);
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldUpgradeIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new GoldUpgradeContract(new Function0() { // from class: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$goldUpgradeFlowLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(GoldUpgradeContract.Result result) {
                if ((result instanceof GoldUpgradeContract.Result.Completed) && ((GoldUpgradeContract.Result.Completed) result).isSuccessful()) {
                    this.this$0.showSearch();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.goldUpgradeFlowLauncher = activityResultLauncherRegisterForActivityResult;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetDigestOnboardingParentDuxo getDuxo() {
        return (AssetDigestOnboardingParentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            AssetDigestSplashFragment.Companion companion = AssetDigestSplashFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new AssetDigestSplashFragment.Args(((AssetDigestOnboardingFragmentKey) companion2.getArgs((Fragment) this)).getSource(), ((AssetDigestOnboardingFragmentKey) companion2.getArgs((Fragment) this)).getFlowType(), ((AssetDigestOnboardingFragmentKey) companion2.getArgs((Fragment) this)).getSkipSplash())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C120291(null), 1, null);
    }

    /* compiled from: AssetDigestOnboardingParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$onViewCreated$1", m3645f = "AssetDigestOnboardingParentFragment.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$onViewCreated$1 */
    static final class C120291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C120291(Continuation<? super C120291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AssetDigestOnboardingParentFragment.this.new C120291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AssetDigestOnboardingParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$onViewCreated$1$1", m3645f = "AssetDigestOnboardingParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<AssetDigestOnboardingParentEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AssetDigestOnboardingParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AssetDigestOnboardingParentFragment assetDigestOnboardingParentFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = assetDigestOnboardingParentFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<AssetDigestOnboardingParentEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final AssetDigestOnboardingParentFragment assetDigestOnboardingParentFragment = this.this$0;
                    if ((event.getData() instanceof AssetDigestOnboardingParentEvent.Loaded) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m12562invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12562invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                assetDigestOnboardingParentFragment.showSearch();
                            }
                        });
                    }
                }
                if (event != null) {
                    final AssetDigestOnboardingParentFragment assetDigestOnboardingParentFragment2 = this.this$0;
                    if ((event.getData() instanceof AssetDigestOnboardingParentEvent.Timeout) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m12563invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12563invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Copilot agreement polling timeout exceeded"), true, null, 4, null);
                                assetDigestOnboardingParentFragment2.showSearch();
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AssetDigestOnboardingParentEvent>> eventFlow = AssetDigestOnboardingParentFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AssetDigestOnboardingParentFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (this.isAgreementSubmitting) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment.Callbacks
    public void onSkipSplash(boolean hasSignedAgreement, boolean hasGoldOrNotRequired) {
        showAgreementOrGoldOnboarding(hasSignedAgreement, hasGoldOrNotRequired, true);
    }

    @Override // com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment.Callbacks
    public void onContinueClick(boolean hasSignedAgreement, boolean hasGoldOrNotRequired) {
        showAgreementOrGoldOnboarding(hasSignedAgreement, hasGoldOrNotRequired, false);
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onSubmissionStateChanged(boolean isSubmitting) {
        this.isAgreementSubmitting = isSubmitting;
        if (isSubmitting) {
            EventLogger eventLogger = getEventLogger();
            Screen.Name name = Screen.Name.CORTEX_DIGEST_ONBOARDING_AGREEMENT;
            String source = ((AssetDigestOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
            if (source == null) {
                source = "";
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, source, null, null, 12, null), new Component(null, "submit", null, 5, null), null, null, false, 57, null);
        }
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onAgreementAccepted() {
        getDuxo().pollDigestUntilAgreementSigned();
    }

    private final void showAgreementOrGoldOnboarding(boolean hasSignedAgreement, boolean hasGoldOrNotRequired, boolean withoutBackstack) {
        if (!hasGoldOrNotRequired) {
            ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<GoldUpgradeIntentKey>> activityResultLauncher = this.goldUpgradeFlowLauncher;
            String source = ((AssetDigestOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
            if (source == null) {
                source = "cortex_digest_onboarding";
            }
            activityResultLauncher.launch(new NavigationActivityResultContract.NavigationParams<>(new GoldUpgradeIntentKey(source, GoldFeature.CORTEX_DIGEST, null, null, null, false, 60, null), null, false, 6, null));
            return;
        }
        if (hasSignedAgreement) {
            showSearch();
            return;
        }
        Navigator navigator = getNavigator();
        IdentiAgreementType.ClientDriven clientDriven = IdentiAgreementType.ClientDriven.COPILOT_DIGEST;
        Screen.Name name = Screen.Name.CORTEX_DIGEST_ONBOARDING_AGREEMENT;
        String source2 = ((AssetDigestOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
        if (source2 == null) {
            source2 = "";
        }
        Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(navigator, new IdentiAgreementKey(clientDriven, null, new Screen(name, source2, null, null, 12, null), 2, null), null, 2, null);
        if (withoutBackstack) {
            replaceFragmentWithoutBackStack(fragmentCreateFragment$default);
        } else {
            replaceFragment(fragmentCreateFragment$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSearch() {
        this.isAgreementSubmitting = false;
        BaseFragment.popEntireFragmentBackstack$default(this, false, 1, null);
        Navigator navigator = getNavigator();
        SearchSelectorLaunchMode.Copilot copilot = SearchSelectorLaunchMode.Copilot.INSTANCE;
        Screen.Name name = Screen.Name.CORTEX_DIGEST_ONBOARDING_SEARCH;
        String source = ((AssetDigestOnboardingFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        replaceFragmentWithoutBackStack(Navigator.DefaultImpls.createFragment$default(navigator, new SearchSelector(copilot, new Screen(name, source, null, null, 12, null), null, 4, null), null, 2, null));
    }

    /* compiled from: AssetDigestOnboardingParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentFragment;", "Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFragmentKey;", "<init>", "()V", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AssetDigestOnboardingParentFragment, AssetDigestOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AssetDigestOnboardingFragmentKey assetDigestOnboardingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, assetDigestOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AssetDigestOnboardingFragmentKey getArgs(AssetDigestOnboardingParentFragment assetDigestOnboardingParentFragment) {
            return (AssetDigestOnboardingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, assetDigestOnboardingParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AssetDigestOnboardingParentFragment newInstance(AssetDigestOnboardingFragmentKey assetDigestOnboardingFragmentKey) {
            return (AssetDigestOnboardingParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, assetDigestOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AssetDigestOnboardingParentFragment assetDigestOnboardingParentFragment, AssetDigestOnboardingFragmentKey assetDigestOnboardingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, assetDigestOnboardingParentFragment, assetDigestOnboardingFragmentKey);
        }
    }
}
