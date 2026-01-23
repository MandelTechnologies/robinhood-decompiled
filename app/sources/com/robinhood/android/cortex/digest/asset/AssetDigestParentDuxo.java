package com.robinhood.android.cortex.digest.asset;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.digest.asset.AssetDigestParentEvent;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: AssetDigestParentDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0013\u001a\u00020\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "assetDigestStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "initArgs", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "getInitArgs", "()Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "pollDigestUntilAgreementSigned", "Companion", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestParentDuxo extends BaseDuxo5<Unit, AssetDigestParentEvent> implements HasSavedState {
    private final AssetDigestStore assetDigestStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestParentDuxo(AssetDigestStore assetDigestStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.assetDigestStore = assetDigestStore;
        this.savedStateHandle = savedStateHandle;
    }

    private final AssetDigestFragmentKey getInitArgs() {
        return (AssetDigestFragmentKey) INSTANCE.getArgs(getSavedStateHandle());
    }

    public final void pollDigestUntilAgreementSigned() {
        AssetDigest instrumentDigest = getInitArgs().getInstrumentDigest();
        if (instrumentDigest instanceof AssetDigest.HasSignedAgreement) {
            submit(new AssetDigestParentEvent.Loaded((AssetDigest.HasSignedAgreement) instrumentDigest));
        } else {
            if (instrumentDigest instanceof AssetDigest.NeedsAgreement) {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C120131(instrumentDigest, null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: AssetDigestParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestParentDuxo$pollDigestUntilAgreementSigned$1", m3645f = "AssetDigestParentDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestParentDuxo$pollDigestUntilAgreementSigned$1 */
    static final class C120131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetDigest $instrumentDigest;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C120131(AssetDigest assetDigest, Continuation<? super C120131> continuation) {
            super(2, continuation);
            this.$instrumentDigest = assetDigest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120131 c120131 = AssetDigestParentDuxo.this.new C120131(this.$instrumentDigest, continuation);
            c120131.L$0 = obj;
            return c120131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AssetDigestParentDuxo assetDigestParentDuxo = AssetDigestParentDuxo.this;
                    AssetDigest assetDigest = this.$instrumentDigest;
                    Result.Companion companion = Result.INSTANCE;
                    final Flow<AssetDigest> flowPollDigest = assetDigestParentDuxo.assetDigestStore.pollDigest(((AssetDigest.NeedsAgreement) assetDigest).getAccountNumber(), ((AssetDigest.NeedsAgreement) assetDigest).getInstrumentId(), ((AssetDigest.NeedsAgreement) assetDigest).getInstrumentType());
                    Flow<AssetDigest.HasSignedAgreement> flow = new Flow<AssetDigest.HasSignedAgreement>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2", m3645f = "AssetDigestParentDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestParentDuxo$pollDigestUntilAgreementSigned$1$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
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
                                    AssetDigest assetDigest = (AssetDigest) obj;
                                    AssetDigest.HasSignedAgreement hasSignedAgreement = assetDigest instanceof AssetDigest.HasSignedAgreement ? (AssetDigest.HasSignedAgreement) assetDigest : null;
                                    if (hasSignedAgreement != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(hasSignedAgreement, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super AssetDigest.HasSignedAgreement> flowCollector, Continuation continuation) {
                            Object objCollect = flowPollDigest.collect(new AnonymousClass2(flowCollector), continuation);
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
                objM28550constructorimpl = Result.m28550constructorimpl((AssetDigest.HasSignedAgreement) obj);
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AssetDigestParentDuxo assetDigestParentDuxo2 = AssetDigestParentDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                if (thM28553exceptionOrNullimpl instanceof Timeout4) {
                    assetDigestParentDuxo2.submit(AssetDigestParentEvent.Timeout.INSTANCE);
                } else {
                    throw thM28553exceptionOrNullimpl;
                }
            }
            AssetDigestParentDuxo assetDigestParentDuxo3 = AssetDigestParentDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                AssetDigest.HasSignedAgreement hasSignedAgreement = (AssetDigest.HasSignedAgreement) objM28550constructorimpl;
                if (hasSignedAgreement != null) {
                    assetDigestParentDuxo3.submit(new AssetDigestParentEvent.Loaded(hasSignedAgreement));
                } else {
                    assetDigestParentDuxo3.submit(AssetDigestParentEvent.Timeout.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AssetDigestParentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestParentDuxo;", "Lcom/robinhood/android/cortex/contracts/AssetDigestFragmentKey;", "<init>", "()V", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AssetDigestParentDuxo, AssetDigestFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AssetDigestFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (AssetDigestFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AssetDigestFragmentKey getArgs(AssetDigestParentDuxo assetDigestParentDuxo) {
            return (AssetDigestFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, assetDigestParentDuxo);
        }
    }
}
