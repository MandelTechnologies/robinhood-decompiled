package com.robinhood.android.cortex.digest.asset;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cortex.digest.asset.AssetDigestEvent;
import com.robinhood.android.cortex.digest.asset.AssetDigestViewState;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.models.asset.AssetDigest;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.android.cortex.store.asset.AssetDigestTimestamps;
import com.robinhood.android.cortex.store.feedback.DigestFeedbackStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CurrencyPairStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: AssetDigestDuxo.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004BQ\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ!\u0010\"\u001a\u00020\u001a2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001a¢\u0006\u0004\b$\u0010\u001cJ\u0015\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001a¢\u0006\u0004\b(\u0010\u001cJ\u0015\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001a¢\u0006\u0004\b-\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/AssetDigestDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoQuoteStore", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "assetDigestStore", "Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "feedbackStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lj$/time/Clock;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onCreate", "()V", "refresh", "Lkotlin/Pair;", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feedbackBottomSheetParams", "showFeedbackBottomSheet", "(Lkotlin/Pair;)V", "hideFeedbackBottomSheet", "newFeedback", "submitFeedback", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;)V", "hideBreakingNewsBottomSheet", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;", "source", "showSelectedSourceBottomSheet", "(Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState$ArticleSourceContent;)V", "hideSelectedSourceBottomSheet", "Lj$/time/Clock;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore;", "Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "getInitArgs", "()Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;", "initArgs", "feature-cortex-digest-asset_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestDuxo extends BaseDuxo5<AssetDigestViewState, AssetDigestEvent> implements HasArgs<AssetDigest.HasSignedAgreement> {
    public static final int $stable = 8;
    private final AssetDigestStore assetDigestStore;
    private final Clock clock;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CurrencyPairStore currencyPairStore;
    private final DigestFeedbackStore feedbackStore;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public AssetDigest.HasSignedAgreement getArgs(SavedStateHandle savedStateHandle) {
        return (AssetDigest.HasSignedAgreement) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AssetDigestDuxo(Clock clock, InstrumentStore instrumentStore, QuoteStore quoteStore, CurrencyPairStore currencyPairStore, CryptoQuoteStore cryptoQuoteStore, AssetDigestStore assetDigestStore, DigestFeedbackStore feedbackStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(assetDigestStore, "assetDigestStore");
        Intrinsics.checkNotNullParameter(feedbackStore, "feedbackStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Instant instantNow = Instant.now(clock);
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        super(new AssetDigestViewState(instantNow, null, null, null, null, null, null, null, false, null, false, null, 4094, null), duxoBundle);
        this.clock = clock;
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.assetDigestStore = assetDigestStore;
        this.feedbackStore = feedbackStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetDigest.HasSignedAgreement getInitArgs() {
        return (AssetDigest.HasSignedAgreement) getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        applyMutation(new C120041(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C120052(null));
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$1 */
    static final class C120041 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120041(Continuation<? super C120041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120041 c120041 = AssetDigestDuxo.this.new C120041(continuation);
            c120041.L$0 = obj;
            return c120041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120041) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, AssetDigestDuxo.this.getInitArgs(), null, null, false, null, false, null, 4063, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2 */
    static final class C120052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120052(Continuation<? super C120052> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120052 c120052 = AssetDigestDuxo.this.new C120052(continuation);
            c120052.L$0 = obj;
            return c120052;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AssetDigestDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1", m3645f = "AssetDigestDuxo.kt", m3646l = {69, 86}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AssetDigestDuxo this$0;

            /* compiled from: AssetDigestDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AssetType3.values().length];
                    try {
                        iArr[AssetType3.STOCKS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AssetType3.CRYPTO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = assetDigestDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r12, r1, r11) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r12, r1, r11) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i2 = WhenMappings.$EnumSwitchMapping$0[this.this$0.getInitArgs().getInstrumentType().ordinal()];
                    if (i2 == 1) {
                        Flow flowCombine = Operators.combine(Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument(this.this$0.getInitArgs().getInstrumentId())), Integer.MAX_VALUE, null, 2, null), this.this$0.quoteStore.getStreamQuote().asFlow(this.this$0.getInitArgs().getInstrumentId()));
                        C497011 c497011 = new C497011(this.this$0, null);
                        this.label = 1;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Flow flowCombine2 = Operators.combine(Context7.buffer$default(RxConvert.asFlow(this.this$0.currencyPairStore.streamCurrencyPair(this.this$0.getInitArgs().getInstrumentId())), Integer.MAX_VALUE, null, 2, null), this.this$0.cryptoQuoteStore.getPollCryptoQuote().asFlow(new CryptoQuoteStore.CryptoQuoteArgs(this.this$0.getInitArgs().getInstrumentId(), null, null, 6, null)));
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AssetDigestDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Instrument;", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497011 extends ContinuationImpl7 implements Function2<Tuples2<? extends Instrument, ? extends Quote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497011(AssetDigestDuxo assetDigestDuxo, Continuation<? super C497011> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497011 c497011 = new C497011(this.this$0, continuation);
                    c497011.L$0 = obj;
                    return c497011;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Instrument, ? extends Quote> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<Instrument, Quote>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<Instrument, Quote> tuples2, Continuation<? super Unit> continuation) {
                    return ((C497011) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$1$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497021 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
                    final /* synthetic */ Instrument $instrument;
                    final /* synthetic */ Quote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497021(Instrument instrument, Quote quote, Continuation<? super C497021> continuation) {
                        super(2, continuation);
                        this.$instrument = instrument;
                        this.$quote = quote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497021 c497021 = new C497021(this.$instrument, this.$quote, continuation);
                        c497021.L$0 = obj;
                        return c497021;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
                        return ((C497021) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, this.$instrument, this.$quote, null, null, null, null, null, false, null, false, null, 4089, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        this.this$0.applyMutation(new C497021((Instrument) tuples2.component1(), (Quote) tuples2.component2(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: AssetDigestDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "Lcom/robinhood/models/crypto/db/CryptoQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$2", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends UiCurrencyPair, ? extends CryptoQuote>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UiCurrencyPair, ? extends CryptoQuote> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<UiCurrencyPair, CryptoQuote>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<UiCurrencyPair, CryptoQuote> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$2$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C497031 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
                    final /* synthetic */ CryptoQuote $cryptoQuote;
                    final /* synthetic */ UiCurrencyPair $currencyPair;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497031(UiCurrencyPair uiCurrencyPair, CryptoQuote cryptoQuote, Continuation<? super C497031> continuation) {
                        super(2, continuation);
                        this.$currencyPair = uiCurrencyPair;
                        this.$cryptoQuote = cryptoQuote;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497031 c497031 = new C497031(this.$currencyPair, this.$cryptoQuote, continuation);
                        c497031.L$0 = obj;
                        return c497031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
                        return ((C497031) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, this.$currencyPair, this.$cryptoQuote, null, null, null, false, null, false, null, 4071, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        this.this$0.applyMutation(new C497031((UiCurrencyPair) tuples2.component1(), (CryptoQuote) tuples2.component2(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AssetDigestDuxo.this, null), 3, null);
                final Flow<AssetDigest> digest = AssetDigestDuxo.this.assetDigestStore.getDigest(AssetDigestDuxo.this.getInitArgs().getAccountNumber(), AssetDigestDuxo.this.getInitArgs().getInstrumentId(), AssetDigestDuxo.this.getInitArgs().getInstrumentType());
                SharedFlow sharedFlowShareIn = FlowKt.shareIn(new Flow<AssetDigest.HasSignedAgreement>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2 */
                    public static final class C120002<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AssetDigestDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return C120002.this.emit(null, this);
                            }
                        }

                        public C120002(FlowCollector flowCollector) {
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
                        Object objCollect = digest.collect(new C120002(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, AssetDigestDuxo.this.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sharedFlowShareIn, AssetDigestDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sharedFlowShareIn, AssetDigestDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(sharedFlowShareIn, AssetDigestDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AssetDigestDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$2", m3645f = "AssetDigestDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AssetDigest.HasSignedAgreement> $digestFlow;
            int label;
            final /* synthetic */ AssetDigestDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SharedFlow<AssetDigest.HasSignedAgreement> sharedFlow, AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$digestFlow = sharedFlow;
                this.this$0 = assetDigestDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$digestFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow<AssetDigest.HasSignedAgreement> sharedFlow = this.$digestFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: AssetDigestDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "digest", "Lcom/robinhood/android/cortex/models/asset/AssetDigest$HasSignedAgreement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$2$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetDigest.HasSignedAgreement, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AssetDigest.HasSignedAgreement hasSignedAgreement, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(hasSignedAgreement, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$2$1$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497041 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
                    final /* synthetic */ AssetDigest.HasSignedAgreement $digest;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497041(AssetDigest.HasSignedAgreement hasSignedAgreement, Continuation<? super C497041> continuation) {
                        super(2, continuation);
                        this.$digest = hasSignedAgreement;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497041 c497041 = new C497041(this.$digest, continuation);
                        c497041.L$0 = obj;
                        return c497041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
                        return ((C497041) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((AssetDigestViewState) this.L$0).applyUpdatedDigest(this.$digest);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C497041((AssetDigest.HasSignedAgreement) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AssetDigestDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3", m3645f = "AssetDigestDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AssetDigest.HasSignedAgreement> $digestFlow;
            int label;
            final /* synthetic */ AssetDigestDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SharedFlow<AssetDigest.HasSignedAgreement> sharedFlow, AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$digestFlow = sharedFlow;
                this.this$0 = assetDigestDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$digestFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final SharedFlow<AssetDigest.HasSignedAgreement> sharedFlow = this.$digestFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = sharedFlow.collect(new C119992(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1$2 */
                        public static final class C119992<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1$2", m3645f = "AssetDigestDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C119992.this.emit(null, this);
                                }
                            }

                            public C119992(FlowCollector flowCollector) {
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
                                    String digestId = ((AssetDigest.HasSignedAgreement) obj).getDigestId();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(digestId, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
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
                    }), new C11998x27ff6bfe(null, this.this$0));
                    C497053 c497053 = new C497053(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, c497053, this) == coroutine_suspended) {
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

            /* compiled from: AssetDigestDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$3", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$3, reason: invalid class name and collision with other inner class name */
            static final class C497053 extends ContinuationImpl7 implements Function2<DigestFeedback, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497053(AssetDigestDuxo assetDigestDuxo, Continuation<? super C497053> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497053 c497053 = new C497053(this.this$0, continuation);
                    c497053.L$0 = obj;
                    return c497053;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DigestFeedback digestFeedback, Continuation<? super Unit> continuation) {
                    return ((C497053) create(digestFeedback, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$3$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$3$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
                    final /* synthetic */ DigestFeedback $feedback;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DigestFeedback digestFeedback, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$feedback = digestFeedback;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$feedback, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
                        return ((AnonymousClass1) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, this.$feedback, null, false, null, false, null, 4031, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((DigestFeedback) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AssetDigestDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$4", m3645f = "AssetDigestDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<AssetDigest.HasSignedAgreement> $digestFlow;
            int label;
            final /* synthetic */ AssetDigestDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SharedFlow<AssetDigest.HasSignedAgreement> sharedFlow, AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$digestFlow = sharedFlow;
                this.this$0 = assetDigestDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$digestFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Instant> timestampUpdateFlow = AssetDigestTimestamps.getTimestampUpdateFlow(this.$digestFlow, this.this$0.clock);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(timestampUpdateFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: AssetDigestDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/Instant", "now", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$4$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AssetDigestDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AssetDigestDuxo assetDigestDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = assetDigestDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AssetDigestDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$4$1$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$onCreate$2$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497061 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
                    final /* synthetic */ Instant $now;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497061(Instant instant, Continuation<? super C497061> continuation) {
                        super(2, continuation);
                        this.$now = instant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497061 c497061 = new C497061(this.$now, continuation);
                        c497061.L$0 = obj;
                        return c497061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
                        return ((C497061) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, this.$now, null, null, null, null, null, null, null, false, null, false, null, 4094, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C497061((Instant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$refresh$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$refresh$1 */
    static final class C120061 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120061(Continuation<? super C120061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120061 c120061 = new C120061(continuation);
            c120061.L$0 = obj;
            return c120061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120061) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AssetDigestViewState) this.L$0).swapToPendingDigest();
        }
    }

    public final void refresh() {
        applyMutation(new C120061(null));
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$showFeedbackBottomSheet$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$showFeedbackBottomSheet$1 */
    static final class C120071 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        final /* synthetic */ Tuples2<DigestFeedbackType, DigestFeedback> $feedbackBottomSheetParams;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C120071(Tuples2<? extends DigestFeedbackType, ? extends DigestFeedback> tuples2, Continuation<? super C120071> continuation) {
            super(2, continuation);
            this.$feedbackBottomSheetParams = tuples2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120071 c120071 = new C120071(this.$feedbackBottomSheetParams, continuation);
            c120071.L$0 = obj;
            return c120071;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120071) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, false, this.$feedbackBottomSheetParams, false, null, 3583, null);
        }
    }

    public final void showFeedbackBottomSheet(Tuples2<? extends DigestFeedbackType, ? extends DigestFeedback> feedbackBottomSheetParams) {
        Intrinsics.checkNotNullParameter(feedbackBottomSheetParams, "feedbackBottomSheetParams");
        applyMutation(new C120071(feedbackBottomSheetParams, null));
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$hideFeedbackBottomSheet$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$hideFeedbackBottomSheet$1 */
    static final class C120021 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120021(Continuation<? super C120021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120021 c120021 = new C120021(continuation);
            c120021.L$0 = obj;
            return c120021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120021) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, false, null, 3583, null);
        }
    }

    public final void hideFeedbackBottomSheet() {
        applyMutation(new C120021(null));
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$submitFeedback$1", m3645f = "AssetDigestDuxo.kt", m3646l = {167}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$submitFeedback$1 */
    static final class C120091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DigestFeedback $newFeedback;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C120091(DigestFeedback digestFeedback, Continuation<? super C120091> continuation) {
            super(2, continuation);
            this.$newFeedback = digestFeedback;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120091 c120091 = AssetDigestDuxo.this.new C120091(this.$newFeedback, continuation);
            c120091.L$0 = obj;
            return c120091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C120091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AssetDigestDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$submitFeedback$1$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$submitFeedback$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
                return ((AnonymousClass1) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, true, null, false, null, 3839, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AssetDigestDuxo.this.applyMutation(new AnonymousClass1(null));
                    AssetDigestDuxo assetDigestDuxo = AssetDigestDuxo.this;
                    DigestFeedback digestFeedback = this.$newFeedback;
                    Result.Companion companion = Result.INSTANCE;
                    DigestFeedbackStore digestFeedbackStore = assetDigestDuxo.feedbackStore;
                    this.label = 1;
                    obj = digestFeedbackStore.submitFeedback(digestFeedback, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((DigestFeedback) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AssetDigestDuxo assetDigestDuxo2 = AssetDigestDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                assetDigestDuxo2.submit(new AssetDigestEvent.Error(thM28553exceptionOrNullimpl));
                assetDigestDuxo2.applyMutation(new AssetDigestDuxo2(null));
            }
            AssetDigestDuxo assetDigestDuxo3 = AssetDigestDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                assetDigestDuxo3.submit(AssetDigestEvent.ShowFeedbackSuccessSnackbar.INSTANCE);
                assetDigestDuxo3.applyMutation(new AssetDigestDuxo3((DigestFeedback) objM28550constructorimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void submitFeedback(DigestFeedback newFeedback) {
        Intrinsics.checkNotNullParameter(newFeedback, "newFeedback");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C120091(newFeedback, null), 3, null);
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$hideBreakingNewsBottomSheet$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$hideBreakingNewsBottomSheet$1 */
    static final class C120011 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120011(Continuation<? super C120011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120011 c120011 = new C120011(continuation);
            c120011.L$0 = obj;
            return c120011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120011) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, true, null, 3071, null);
        }
    }

    public final void hideBreakingNewsBottomSheet() {
        applyMutation(new C120011(null));
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$showSelectedSourceBottomSheet$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$showSelectedSourceBottomSheet$1 */
    static final class C120081 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        final /* synthetic */ AssetDigestViewState.ArticleSourceContent $source;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C120081(AssetDigestViewState.ArticleSourceContent articleSourceContent, Continuation<? super C120081> continuation) {
            super(2, continuation);
            this.$source = articleSourceContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120081 c120081 = new C120081(this.$source, continuation);
            c120081.L$0 = obj;
            return c120081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120081) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, false, this.$source, 2047, null);
        }
    }

    public final void showSelectedSourceBottomSheet(AssetDigestViewState.ArticleSourceContent source) {
        Intrinsics.checkNotNullParameter(source, "source");
        applyMutation(new C120081(source, null));
    }

    /* compiled from: AssetDigestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/digest/asset/AssetDigestViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$hideSelectedSourceBottomSheet$1", m3645f = "AssetDigestDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestDuxo$hideSelectedSourceBottomSheet$1 */
    static final class C120031 extends ContinuationImpl7 implements Function2<AssetDigestViewState, Continuation<? super AssetDigestViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C120031(Continuation<? super C120031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C120031 c120031 = new C120031(continuation);
            c120031.L$0 = obj;
            return c120031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetDigestViewState assetDigestViewState, Continuation<? super AssetDigestViewState> continuation) {
            return ((C120031) create(assetDigestViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AssetDigestViewState.copy$default((AssetDigestViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, false, null, 2047, null);
        }
    }

    public final void hideSelectedSourceBottomSheet() {
        applyMutation(new C120031(null));
    }
}
