package com.robinhood.android.cortex.digest.asset.splash;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.copilot.p032v1.FlowTypeDto;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashEvent;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashFragment;
import com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashViewState;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AssetDigestSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashViewState;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Args;", "assetDigestOnboardingStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;Lcom/robinhood/experiments/ExperimentsProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestSplashDuxo extends BaseDuxo5<AssetDigestSplashViewState, AssetDigestSplashEvent> implements HasArgs<AssetDigestSplashFragment.Args> {
    private final AssetDigestOnboardingStore assetDigestOnboardingStore;
    private final ExperimentsProvider experimentsProvider;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public AssetDigestSplashFragment.Args getArgs(SavedStateHandle savedStateHandle) {
        return (AssetDigestSplashFragment.Args) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestSplashDuxo(AssetDigestOnboardingStore assetDigestOnboardingStore, ExperimentsProvider experimentsProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(AssetDigestSplashViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.assetDigestOnboardingStore = assetDigestOnboardingStore;
        this.experimentsProvider = experimentsProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenCreated(new C120581(null));
    }

    /* compiled from: AssetDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1", m3645f = "AssetDigestSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1 */
    static final class C120581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120581(Continuation<? super C120581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120581 c120581 = AssetDigestSplashDuxo.this.new C120581(continuation);
            c120581.L$0 = obj;
            return c120581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AssetDigestSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1$1", m3645f = "AssetDigestSplashDuxo.kt", m3646l = {34, 58}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.asset.splash.AssetDigestSplashDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AssetDigestSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AssetDigestSplashDuxo assetDigestSplashDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = assetDigestSplashDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r3, r5, r13) == r1) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM28550constructorimpl;
                Object obj2;
                Flow flowOnStart;
                Throwable thM28553exceptionOrNullimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AssetDigestSplashDuxo assetDigestSplashDuxo = this.this$0;
                    Result.Companion companion2 = Result.INSTANCE;
                    AssetDigestOnboardingStore assetDigestOnboardingStore = assetDigestSplashDuxo.assetDigestOnboardingStore;
                    FlowTypeDto copilotOnboardingRequestFlowType = ((AssetDigestSplashFragment.Args) AssetDigestSplashDuxo.INSTANCE.getArgs((HasArgs) assetDigestSplashDuxo)).getFlowType().toCopilotOnboardingRequestFlowType();
                    this.label = 1;
                    obj = assetDigestOnboardingStore.fetchOnboarding(copilotOnboardingRequestFlowType, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.L$0;
                        ResultKt.throwOnFailure(obj);
                        AssetDigestSplashDuxo assetDigestSplashDuxo2 = this.this$0;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                        if (thM28553exceptionOrNullimpl != null) {
                            assetDigestSplashDuxo2.submit(new AssetDigestSplashEvent.Error(thM28553exceptionOrNullimpl));
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((AssetDigestOnboarding) obj);
                obj2 = objM28550constructorimpl;
                AssetDigestSplashDuxo assetDigestSplashDuxo3 = this.this$0;
                if (Result.m28556isSuccessimpl(obj2)) {
                    AssetDigestOnboarding assetDigestOnboarding = (AssetDigestOnboarding) obj2;
                    if (assetDigestOnboarding.getHasSignedAgreement() && assetDigestOnboarding.getHasGoldOrNotRequired()) {
                        assetDigestSplashDuxo3.submit(new AssetDigestSplashEvent.SkipSplash(true, assetDigestOnboarding.getHasGoldOrNotRequired()));
                    } else {
                        if (((AssetDigestSplashFragment.Args) AssetDigestSplashDuxo.INSTANCE.getArgs((HasArgs) assetDigestSplashDuxo3)).getSkipVideo()) {
                            flowOnStart = FlowKt.flowOf(boxing.boxBoolean(true));
                        } else {
                            flowOnStart = FlowKt.onStart(ExperimentsProvider.DefaultImpls.streamStateFlow$default(assetDigestSplashDuxo3.experimentsProvider, new Experiment[]{AssetDigestVideoKillswitch.INSTANCE}, false, null, 6, null), new AssetDigestSplashDuxo3(null));
                        }
                        AssetDigestSplashDuxo2 assetDigestSplashDuxo22 = new AssetDigestSplashDuxo2(assetDigestSplashDuxo3, assetDigestOnboarding, null);
                        this.L$0 = obj2;
                        this.label = 2;
                    }
                }
                AssetDigestSplashDuxo assetDigestSplashDuxo23 = this.this$0;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(obj2);
                if (thM28553exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(AssetDigestSplashDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AssetDigestSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashDuxo;", "Lcom/robinhood/android/cortex/digest/asset/splash/AssetDigestSplashFragment$Args;", "<init>", "()V", "lib-cortex-digest-asset-splash_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<AssetDigestSplashDuxo, AssetDigestSplashFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public AssetDigestSplashFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AssetDigestSplashFragment.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public AssetDigestSplashFragment.Args getArgs(AssetDigestSplashDuxo assetDigestSplashDuxo) {
            return (AssetDigestSplashFragment.Args) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, assetDigestSplashDuxo);
        }
    }
}
