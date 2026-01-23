package com.robinhood.android.cortex.digest.asset.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFragmentKey;
import com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentEvent;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AssetDigestOnboardingParentDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFragmentKey;", "assetDigestOnboardingStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pollDigestUntilAgreementSigned", "Companion", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestOnboardingParentDuxo extends BaseDuxo5<Unit, AssetDigestOnboardingParentEvent> implements HasArgs<AssetDigestOnboardingFragmentKey> {
    private final AssetDigestOnboardingStore assetDigestOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public AssetDigestOnboardingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
        return (AssetDigestOnboardingFragmentKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestOnboardingParentDuxo(AssetDigestOnboardingStore assetDigestOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.assetDigestOnboardingStore = assetDigestOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AssetDigestOnboardingParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentDuxo$pollDigestUntilAgreementSigned$1", m3645f = "AssetDigestOnboardingParentDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentDuxo$pollDigestUntilAgreementSigned$1 */
    static final class C120251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120251(Continuation<? super C120251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120251 c120251 = AssetDigestOnboardingParentDuxo.this.new C120251(continuation);
            c120251.L$0 = obj;
            return c120251;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AssetDigestOnboardingParentDuxo assetDigestOnboardingParentDuxo = AssetDigestOnboardingParentDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    final Flow<AssetDigestOnboarding> flowPollOnboarding = assetDigestOnboardingParentDuxo.assetDigestOnboardingStore.pollOnboarding(((AssetDigestOnboardingFragmentKey) AssetDigestOnboardingParentDuxo.INSTANCE.getArgs((HasSavedState) assetDigestOnboardingParentDuxo)).getFlowType().toCopilotOnboardingRequestFlowType());
                    Flow<AssetDigestOnboarding> flow = new Flow<AssetDigestOnboarding>() { // from class: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$filter$1$2", m3645f = "AssetDigestOnboardingParentDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.cortex.digest.asset.onboarding.AssetDigestOnboardingParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (((AssetDigestOnboarding) obj).getHasSignedAgreement()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AssetDigestOnboarding> flowCollector, Continuation continuation) {
                            Object objCollect = flowPollOnboarding.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    Duration.Companion companion2 = Duration.INSTANCE;
                    Flow flowM28821timeoutHG0u8IE = FlowKt.m28821timeoutHG0u8IE(flow, Duration3.toDuration(20, DurationUnitJvm.SECONDS));
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowM28821timeoutHG0u8IE, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((AssetDigestOnboarding) obj);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AssetDigestOnboardingParentDuxo assetDigestOnboardingParentDuxo2 = AssetDigestOnboardingParentDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                if (thM28553exceptionOrNullimpl instanceof Timeout4) {
                    assetDigestOnboardingParentDuxo2.submit(AssetDigestOnboardingParentEvent.Timeout.INSTANCE);
                } else {
                    throw thM28553exceptionOrNullimpl;
                }
            }
            AssetDigestOnboardingParentDuxo assetDigestOnboardingParentDuxo3 = AssetDigestOnboardingParentDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                if (((AssetDigestOnboarding) objM28550constructorimpl) != null) {
                    assetDigestOnboardingParentDuxo3.submit(AssetDigestOnboardingParentEvent.Loaded.INSTANCE);
                } else {
                    assetDigestOnboardingParentDuxo3.submit(AssetDigestOnboardingParentEvent.Timeout.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void pollDigestUntilAgreementSigned() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C120251(null), 3, null);
    }

    /* compiled from: AssetDigestOnboardingParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo;", "Lcom/robinhood/android/cortex/contracts/AssetDigestOnboardingFragmentKey;", "<init>", "()V", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AssetDigestOnboardingParentDuxo, AssetDigestOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AssetDigestOnboardingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AssetDigestOnboardingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AssetDigestOnboardingFragmentKey getArgs(AssetDigestOnboardingParentDuxo assetDigestOnboardingParentDuxo) {
            return (AssetDigestOnboardingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, assetDigestOnboardingParentDuxo);
        }
    }
}
