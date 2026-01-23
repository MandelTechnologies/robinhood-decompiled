package com.robinhood.android.cortex.digest.asset;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.digest.asset.AssetDigestParentEvent;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.agreements.contracts.IdentiAgreementKey;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Lazy;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AssetDigestParentFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0013H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020(H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Callbacks;", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementKey$Callbacks;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentDuxo;", "getDuxo", "()Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "isAgreementSubmitting", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onBackPressed", "onSubmissionStateChanged", "isSubmitting", "onSkipSplash", "hasSignedAgreement", "hasGoldOrNotRequired", "onContinueClick", "onAgreementAccepted", "createSplashFragment", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment;", "variant", "Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "createAgreementFragment", "Landroidx/fragment/app/Fragment;", "Companion", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AssetDigestParentFragment extends BaseFragment implements AssetDigestSplashFragment.Callbacks, IdentiAgreementKey.Callbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private boolean isAgreementSubmitting;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AssetDigestParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AssetDigestValuePropsExperiment2.values().length];
            try {
                iArr[AssetDigestValuePropsExperiment2.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetDigestValuePropsExperiment2.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetDigestValuePropsExperiment2.STATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AssetType3.values().length];
            try {
                iArr2[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AssetDigestParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.duxo = DuxosKt.duxo(this, AssetDigestParentDuxo.class);
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
    public final AssetDigestParentDuxo getDuxo() {
        return (AssetDigestParentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Fragment fragmentCreateAgreementFragment;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            AssetDigest instrumentDigest = ((AssetDigestFragmentKey) companion.getArgs((Fragment) this)).getInstrumentDigest();
            if (instrumentDigest instanceof AssetDigest.HasSignedAgreement) {
                fragmentCreateAgreementFragment = AssetDigestFragment.INSTANCE.newInstance((Parcelable) instrumentDigest);
            } else {
                if (!(instrumentDigest instanceof AssetDigest.NeedsAgreement)) {
                    throw new NoWhenBranchMatchedException();
                }
                AssetDigestValuePropsExperiment2 variant = ((AssetDigestFragmentKey) companion.getArgs((Fragment) this)).getVariant();
                int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
                if (i == 1) {
                    fragmentCreateAgreementFragment = createAgreementFragment();
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fragmentCreateAgreementFragment = createSplashFragment(variant);
                }
            }
            setFragment(C11048R.id.fragment_container, fragmentCreateAgreementFragment);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C120161(null), 1, null);
    }

    /* compiled from: AssetDigestParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestParentFragment$onViewCreated$1", m3645f = "AssetDigestParentFragment.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestParentFragment$onViewCreated$1 */
    static final class C120161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C120161(Continuation<? super C120161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AssetDigestParentFragment.this.new C120161(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AssetDigestParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestParentFragment$onViewCreated$1$1", m3645f = "AssetDigestParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestParentFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<AssetDigestParentEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AssetDigestParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AssetDigestParentFragment assetDigestParentFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = assetDigestParentFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<AssetDigestParentEvent> event, Continuation<? super Unit> continuation) {
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
                    final AssetDigestParentFragment assetDigestParentFragment = this.this$0;
                    if ((event.getData() instanceof AssetDigestParentEvent.Loaded) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m12556invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12556invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AssetDigestParentEvent.Loaded loaded = (AssetDigestParentEvent.Loaded) event.getData();
                                assetDigestParentFragment.isAgreementSubmitting = false;
                                BaseFragment.popEntireFragmentBackstack$default(assetDigestParentFragment, false, 1, null);
                                assetDigestParentFragment.replaceFragmentWithoutBackStack(AssetDigestFragment.INSTANCE.newInstance((Parcelable) loaded.getInstrumentDigest()));
                            }
                        });
                    }
                }
                if (event != null) {
                    final AssetDigestParentFragment assetDigestParentFragment2 = this.this$0;
                    if ((event.getData() instanceof AssetDigestParentEvent.Timeout) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m12557invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m12557invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                assetDigestParentFragment2.isAgreementSubmitting = false;
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new Exception("Copilot agreement polling timeout exceeded"), true, null, 4, null);
                                assetDigestParentFragment2.requireBaseActivity().onBackPressed();
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
                StateFlow<Event<AssetDigestParentEvent>> eventFlow = AssetDigestParentFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AssetDigestParentFragment.this, null);
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

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onSubmissionStateChanged(boolean isSubmitting) {
        this.isAgreementSubmitting = isSubmitting;
        if (isSubmitting) {
            EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, new Screen(Screen.Name.CORTEX_DIGEST_ONBOARDING_AGREEMENT, null, null, null, 14, null), new Component(null, "submit", null, 5, null), null, null, false, 57, null);
        }
    }

    @Override // com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment.Callbacks
    public void onSkipSplash(boolean hasSignedAgreement, boolean hasGoldOrNotRequired) {
        throw new IllegalStateException("Should never be called");
    }

    @Override // com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment.Callbacks
    public void onContinueClick(boolean hasSignedAgreement, boolean hasGoldOrNotRequired) {
        replaceFragment(createAgreementFragment());
    }

    @Override // com.robinhood.shared.agreements.contracts.IdentiAgreementKey.Callbacks
    public void onAgreementAccepted() {
        getDuxo().pollDigestUntilAgreementSigned();
    }

    private final AssetDigestSplashFragment createSplashFragment(AssetDigestValuePropsExperiment2 variant) {
        AssetDigestSplashFragment.Companion companion = AssetDigestSplashFragment.INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                z = false;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return (AssetDigestSplashFragment) companion.newInstance((Parcelable) new AssetDigestSplashFragment.Args("cortex_digest_upsell_section", null, z, 2, null));
        }
        throw new IllegalStateException("Unexpected variant when creating splash fragment");
    }

    private final Fragment createAgreementFragment() {
        String str;
        Navigator navigator = getNavigator();
        IdentiAgreementType.ClientDriven clientDriven = IdentiAgreementType.ClientDriven.COPILOT_DIGEST;
        Screen.Name name = Screen.Name.CORTEX_DIGEST_ONBOARDING_AGREEMENT;
        int i = WhenMappings.$EnumSwitchMapping$1[((AssetDigestFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentDigest().getInstrumentType().ordinal()];
        if (i == 1) {
            str = "cortex_sdp_digest_preview";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "cortex_cdp_digest_preview";
        }
        return Navigator.DefaultImpls.createFragment$default(navigator, new IdentiAgreementKey(clientDriven, null, new Screen(name, str, null, null, 12, null), 2, null), null, 2, null);
    }

    /* compiled from: AssetDigestParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentFragment;", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "()V", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AssetDigestParentFragment, AssetDigestFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AssetDigestFragmentKey assetDigestFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, assetDigestFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AssetDigestFragmentKey getArgs(AssetDigestParentFragment assetDigestParentFragment) {
            return (AssetDigestFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, assetDigestParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AssetDigestParentFragment newInstance(AssetDigestFragmentKey assetDigestFragmentKey) {
            return (AssetDigestParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, assetDigestFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AssetDigestParentFragment assetDigestParentFragment, AssetDigestFragmentKey assetDigestFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, assetDigestParentFragment, assetDigestFragmentKey);
        }
    }
}
