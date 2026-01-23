package com.robinhood.android.crypto.pulse.lib.entry;

import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.robinhood.android.cortex.contracts.AssetDigestFragmentKey;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment;
import com.robinhood.android.cortex.contracts.AssetDigestValuePropsExperiment2;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.CryptoPulseStore;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: CryptoPulseEntryPointDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDataState;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState;", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointEvent;", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "cryptoPulseStore", "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentsProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;Lcom/robinhood/experiments/ExperimentsProvider;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointStateProvider;)V", "", "onCreate", "()V", "Lcom/robinhood/android/cortex/models/asset/AssetDigest;", "instrumentDigest", "onShowDigestDetailClicked", "(Lcom/robinhood/android/cortex/models/asset/AssetDigest;)V", "Lcom/robinhood/librobinhood/data/store/CryptoPulseStore;", "Lcom/robinhood/experiments/ExperimentsProvider;", "lib-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseEntryPointDuxo extends BaseDuxo3<CryptoPulseEntryPointDataState, CryptoPulseEntryPointViewState, CryptoPulseEntryPointEvent> {
    public static final int $stable = 8;
    private final CryptoPulseStore cryptoPulseStore;
    private final ExperimentsProvider experimentsProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPulseEntryPointDuxo(CryptoPulseStore cryptoPulseStore, ExperimentsProvider experimentsProvider, Clock clock, DuxoBundle duxoBundle, CryptoPulseEntryPointStateProvider stateProvider) {
        super(new CryptoPulseEntryPointDataState(clock, null, null, 6, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoPulseStore, "cryptoPulseStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoPulseStore = cryptoPulseStore;
        this.experimentsProvider = experimentsProvider;
    }

    /* compiled from: CryptoPulseEntryPointDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointDuxo$onCreate$1", m3645f = "CryptoPulseEntryPointDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointDuxo$onCreate$1 */
    static final class C129471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129471(Continuation<? super C129471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseEntryPointDuxo.this.new C129471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoPulseEntryPointDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointDuxo$onCreate$1$1", m3645f = "CryptoPulseEntryPointDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoPulseEntryPointDataState, Continuation<? super CryptoPulseEntryPointDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseEntryPointDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulseEntryPointDuxo cryptoPulseEntryPointDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseEntryPointDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoPulseEntryPointDataState cryptoPulseEntryPointDataState, Continuation<? super CryptoPulseEntryPointDataState> continuation) {
                return ((AnonymousClass1) create(cryptoPulseEntryPointDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CryptoPulseEntryPointDataState cryptoPulseEntryPointDataState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoPulseEntryPointDataState cryptoPulseEntryPointDataState2 = (CryptoPulseEntryPointDataState) this.L$0;
                    CryptoPulseStore cryptoPulseStore = this.this$0.cryptoPulseStore;
                    this.L$0 = cryptoPulseEntryPointDataState2;
                    this.label = 1;
                    Object pulsePreview = cryptoPulseStore.getPulsePreview(this);
                    if (pulsePreview == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cryptoPulseEntryPointDataState = cryptoPulseEntryPointDataState2;
                    obj = pulsePreview;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoPulseEntryPointDataState = (CryptoPulseEntryPointDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return CryptoPulseEntryPointDataState.copy$default(cryptoPulseEntryPointDataState, null, null, (GetCryptoPulsePreviewResponseDto) obj, 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoPulseEntryPointDuxo cryptoPulseEntryPointDuxo = CryptoPulseEntryPointDuxo.this;
            cryptoPulseEntryPointDuxo.applyMutation(new AnonymousClass1(cryptoPulseEntryPointDuxo, null));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C129471(null));
    }

    /* compiled from: CryptoPulseEntryPointDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointDuxo$onShowDigestDetailClicked$1", m3645f = "CryptoPulseEntryPointDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointDuxo$onShowDigestDetailClicked$1 */
    static final class C129481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetDigest $instrumentDigest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C129481(AssetDigest assetDigest, Continuation<? super C129481> continuation) {
            super(2, continuation);
            this.$instrumentDigest = assetDigest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseEntryPointDuxo.this.new C129481(this.$instrumentDigest, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(CryptoPulseEntryPointDuxo.this.experimentsProvider, AssetDigestValuePropsExperiment.INSTANCE, AssetDigestValuePropsExperiment2.CONTROL, false, 4, null);
                this.label = 1;
                obj = FlowKt.first(flowCoStreamVariant$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CryptoPulseEntryPointDuxo.this.submit(new CryptoPulseEntryPointEvent.ShowDigestFragment(new AssetDigestFragmentKey(this.$instrumentDigest, (AssetDigestValuePropsExperiment2) obj)));
            return Unit.INSTANCE;
        }
    }

    public final void onShowDigestDetailClicked(AssetDigest instrumentDigest) {
        Intrinsics.checkNotNullParameter(instrumentDigest, "instrumentDigest");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129481(instrumentDigest, null), 3, null);
    }
}
