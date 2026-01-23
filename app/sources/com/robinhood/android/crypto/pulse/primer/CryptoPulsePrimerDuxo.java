package com.robinhood.android.crypto.pulse.primer;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoUsPulseExperiment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoPulsePrimerDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/primer/CryptoPulsePrimerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/crypto/pulse/primer/CryptoPulsePrimerViewState;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulsePrimerDuxo extends BaseDuxo4<CryptoPulsePrimerViewState> {
    public static final int $stable = 8;
    private final CryptoExperimentsStore cryptoExperimentsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPulsePrimerDuxo(CryptoExperimentsStore cryptoExperimentsStore, DuxoBundle duxoBundle) {
        super(new CryptoPulsePrimerViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    /* compiled from: CryptoPulsePrimerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1", m3645f = "CryptoPulsePrimerDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1 */
    static final class C129611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C129611(Continuation<? super C129611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulsePrimerDuxo.this.new C129611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoUsPulseExperiment.Variant> flowStreamCryptoPulseExperiment = CryptoPulsePrimerDuxo.this.cryptoExperimentsStore.streamCryptoPulseExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPulsePrimerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoPulseExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPulsePrimerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/CryptoUsPulseExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1$1", m3645f = "CryptoPulsePrimerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoUsPulseExperiment.Variant, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulsePrimerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulsePrimerDuxo cryptoPulsePrimerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulsePrimerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoUsPulseExperiment.Variant variant, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPulsePrimerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/primer/CryptoPulsePrimerViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1$1$1", m3645f = "CryptoPulsePrimerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497381 extends ContinuationImpl7 implements Function2<CryptoPulsePrimerViewState, Continuation<? super CryptoPulsePrimerViewState>, Object> {
                final /* synthetic */ CryptoUsPulseExperiment.Variant $it;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: CryptoPulsePrimerDuxo.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.crypto.pulse.primer.CryptoPulsePrimerDuxo$onCreate$1$1$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoUsPulseExperiment.Variant.values().length];
                        try {
                            iArr[CryptoUsPulseExperiment.Variant.CONTROL.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoUsPulseExperiment.Variant.MEMBER_CHT_SEPARATE_COMPONENT_CHART_ITEM_HEADER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[CryptoUsPulseExperiment.Variant.MEMBER_CHT_HOLDINGS_COMPONENT_CHART_ITEM_HEADER.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[CryptoUsPulseExperiment.Variant.MEMBER_CHT_SEPARATE_COMPONENT_CONDENSED_ITEM_HEADER.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[CryptoUsPulseExperiment.Variant.MEMBER_CHT_HOLDINGS_COMPONENT_CONDENSED_ITEM_HEADER.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497381(CryptoUsPulseExperiment.Variant variant, Continuation<? super C497381> continuation) {
                    super(2, continuation);
                    this.$it = variant;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497381 c497381 = new C497381(this.$it, continuation);
                    c497381.L$0 = obj;
                    return c497381;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPulsePrimerViewState cryptoPulsePrimerViewState, Continuation<? super CryptoPulsePrimerViewState> continuation) {
                    return ((C497381) create(cryptoPulsePrimerViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    String str;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CryptoPulsePrimerViewState cryptoPulsePrimerViewState = (CryptoPulsePrimerViewState) this.L$0;
                    int i = WhenMappings.$EnumSwitchMapping$0[this.$it.ordinal()];
                    if (i == 1) {
                        str = null;
                    } else if (i == 2 || i == 3) {
                        str = "https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/crypto_pulse/pulse_primer_position_details_feed_image.png";
                    } else {
                        if (i != 4 && i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "https://brokerage-static.s3.us-east-1.amazonaws.com/app_assets/crypto_pulse/pulse_primer_condensed_feed_image.png";
                    }
                    return cryptoPulsePrimerViewState.copy(str);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497381((CryptoUsPulseExperiment.Variant) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C129611(null));
    }
}
