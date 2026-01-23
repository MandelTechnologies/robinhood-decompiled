package com.robinhood.shared.formats.crypto;

import android.view.KeyEvent;
import com.robinhood.models.crypto.InstrumentDefinition;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CryptoInstrumentInputHelper.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJR\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001fJN\u0010#\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010%JT\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010*\u001a\u00020\u001fJF\u0010+\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00192\b\b\u0002\u0010(\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0012\u001a\u00020\n*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "", "currencyInputInfoPair", "Lcom/robinhood/shared/formats/crypto/CurrencyInputInfoPair;", "<init>", "(Lcom/robinhood/shared/formats/crypto/CurrencyInputInfoPair;)V", "instrument", "Lcom/robinhood/models/crypto/InstrumentDefinition;", "(Lcom/robinhood/models/crypto/InstrumentDefinition;)V", "quoteCurrencyInputHelper", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "getQuoteCurrencyInputHelper", "()Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "quoteCurrencyInputHelper$delegate", "Lkotlin/Lazy;", "assetCurrencyInputHelper", "getAssetCurrencyInputHelper", "assetCurrencyInputHelper$delegate", "currencyInputHelper", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getCurrencyInputHelper", "(Lcom/robinhood/shared/formats/crypto/CryptoInputMode;)Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "processKeyEvent", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;", "keyEvent", "Landroid/view/KeyEvent;", "oldString", "inputMode", "isSpaced", "", "showCurrencySymbol", "forceCurrencyFormatter", "allowEmpty", "processKeyEventBlocking", "Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "(Landroid/view/KeyEvent;Ljava/lang/String;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;ZZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processAmount", "amount", "roundingMode", "Ljava/math/RoundingMode;", "forceHideDecimalSeparator", "processAmountBlocking", "(Ljava/math/BigDecimal;Ljava/math/RoundingMode;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-formats-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoInstrumentInputHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: assetCurrencyInputHelper$delegate, reason: from kotlin metadata */
    private final Lazy assetCurrencyInputHelper;
    private final CurrencyInputInfoPair currencyInputInfoPair;

    /* renamed from: quoteCurrencyInputHelper$delegate, reason: from kotlin metadata */
    private final Lazy quoteCurrencyInputHelper;

    /* compiled from: CryptoInstrumentInputHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptoInstrumentInputHelper(CurrencyInputInfoPair currencyInputInfoPair) {
        Intrinsics.checkNotNullParameter(currencyInputInfoPair, "currencyInputInfoPair");
        this.currencyInputInfoPair = currencyInputInfoPair;
        this.quoteCurrencyInputHelper = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoInstrumentInputHelper.quoteCurrencyInputHelper_delegate$lambda$0(this.f$0);
            }
        });
        this.assetCurrencyInputHelper = LazyKt.lazy(new Function0() { // from class: com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoInstrumentInputHelper.assetCurrencyInputHelper_delegate$lambda$1(this.f$0);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoInstrumentInputHelper(InstrumentDefinition instrument) {
        this(INSTANCE.getToCurrencyInputInfoPair(instrument));
        Intrinsics.checkNotNullParameter(instrument, "instrument");
    }

    private final CurrencyInputHelper getQuoteCurrencyInputHelper() {
        return (CurrencyInputHelper) this.quoteCurrencyInputHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CurrencyInputHelper quoteCurrencyInputHelper_delegate$lambda$0(CryptoInstrumentInputHelper cryptoInstrumentInputHelper) {
        return new CurrencyInputHelper(cryptoInstrumentInputHelper.currencyInputInfoPair.getQuoteCurrencyInfo(), null, 2, 0 == true ? 1 : 0);
    }

    private final CurrencyInputHelper getAssetCurrencyInputHelper() {
        return (CurrencyInputHelper) this.assetCurrencyInputHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CurrencyInputHelper assetCurrencyInputHelper_delegate$lambda$1(CryptoInstrumentInputHelper cryptoInstrumentInputHelper) {
        return new CurrencyInputHelper(cryptoInstrumentInputHelper.currencyInputInfoPair.getAssetCurrencyInfo(), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurrencyInputHelper getCurrencyInputHelper(CryptoInputMode cryptoInputMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[cryptoInputMode.ordinal()];
        if (i == 1) {
            return getQuoteCurrencyInputHelper();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getAssetCurrencyInputHelper();
    }

    public static /* synthetic */ Tuples2 processKeyEvent$default(CryptoInstrumentInputHelper cryptoInstrumentInputHelper, KeyEvent keyEvent, String str, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        return cryptoInstrumentInputHelper.processKeyEvent(keyEvent, str, cryptoInputMode, z, z2, z3, z4);
    }

    public final Tuples2<String, BigDecimal> processKeyEvent(KeyEvent keyEvent, String oldString, CryptoInputMode inputMode, boolean isSpaced, boolean showCurrencySymbol, boolean forceCurrencyFormatter, boolean allowEmpty) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(oldString, "oldString");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        return getCurrencyInputHelper(inputMode).processKeyEvent(keyEvent, oldString, isSpaced, showCurrencySymbol, forceCurrencyFormatter, allowEmpty);
    }

    public static /* synthetic */ Object processKeyEventBlocking$default(CryptoInstrumentInputHelper cryptoInstrumentInputHelper, KeyEvent keyEvent, String str, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, boolean z4, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        return cryptoInstrumentInputHelper.processKeyEventBlocking(keyEvent, str, cryptoInputMode, z, z2, z3, z4, continuation);
    }

    /* compiled from: CryptoInstrumentInputHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper$processKeyEventBlocking$2", m3645f = "CryptoInstrumentInputHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper$processKeyEventBlocking$2 */
    static final class C389602 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CryptoFormattedAmount>, Object> {
        final /* synthetic */ boolean $allowEmpty;
        final /* synthetic */ boolean $forceCurrencyFormatter;
        final /* synthetic */ CryptoInputMode $inputMode;
        final /* synthetic */ boolean $isSpaced;
        final /* synthetic */ KeyEvent $keyEvent;
        final /* synthetic */ String $oldString;
        final /* synthetic */ boolean $showCurrencySymbol;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C389602(KeyEvent keyEvent, String str, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, boolean z4, Continuation<? super C389602> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
            this.$oldString = str;
            this.$inputMode = cryptoInputMode;
            this.$isSpaced = z;
            this.$showCurrencySymbol = z2;
            this.$forceCurrencyFormatter = z3;
            this.$allowEmpty = z4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoInstrumentInputHelper.this.new C389602(this.$keyEvent, this.$oldString, this.$inputMode, this.$isSpaced, this.$showCurrencySymbol, this.$forceCurrencyFormatter, this.$allowEmpty, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CryptoFormattedAmount> continuation) {
            return ((C389602) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2<String, BigDecimal> tuples2ProcessKeyEvent = CryptoInstrumentInputHelper.this.processKeyEvent(this.$keyEvent, this.$oldString, this.$inputMode, this.$isSpaced, this.$showCurrencySymbol, this.$forceCurrencyFormatter, this.$allowEmpty);
            return new CryptoFormattedAmount(tuples2ProcessKeyEvent.component2(), tuples2ProcessKeyEvent.component1());
        }
    }

    public final Object processKeyEventBlocking(KeyEvent keyEvent, String str, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, boolean z4, Continuation<? super CryptoFormattedAmount> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new C389602(keyEvent, str, cryptoInputMode, z, z2, z3, z4, null), continuation);
    }

    public static /* synthetic */ Tuples2 processAmount$default(CryptoInstrumentInputHelper cryptoInstrumentInputHelper, BigDecimal bigDecimal, RoundingMode roundingMode, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        boolean z5;
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper2;
        BigDecimal bigDecimal2;
        CryptoInputMode cryptoInputMode2;
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        boolean z6 = (i & 8) != 0 ? false : z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        boolean z7 = z2;
        boolean z8 = (i & 32) != 0 ? false : z3;
        if ((i & 64) != 0) {
            z5 = false;
            bigDecimal2 = bigDecimal;
            cryptoInputMode2 = cryptoInputMode;
            cryptoInstrumentInputHelper2 = cryptoInstrumentInputHelper;
        } else {
            z5 = z4;
            cryptoInstrumentInputHelper2 = cryptoInstrumentInputHelper;
            bigDecimal2 = bigDecimal;
            cryptoInputMode2 = cryptoInputMode;
        }
        return cryptoInstrumentInputHelper2.processAmount(bigDecimal2, roundingMode2, cryptoInputMode2, z6, z7, z8, z5);
    }

    public final Tuples2<String, BigDecimal> processAmount(BigDecimal amount, RoundingMode roundingMode, CryptoInputMode inputMode, boolean isSpaced, boolean showCurrencySymbol, boolean forceCurrencyFormatter, boolean forceHideDecimalSeparator) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        return getCurrencyInputHelper(inputMode).processAmount(amount, roundingMode, isSpaced, showCurrencySymbol, forceCurrencyFormatter, forceHideDecimalSeparator);
    }

    public static /* synthetic */ Object processAmountBlocking$default(CryptoInstrumentInputHelper cryptoInstrumentInputHelper, BigDecimal bigDecimal, RoundingMode roundingMode, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, Continuation continuation, int i, Object obj) {
        boolean z4;
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper2;
        BigDecimal bigDecimal2;
        CryptoInputMode cryptoInputMode2;
        Continuation continuation2;
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        boolean z5 = (i & 8) != 0 ? false : z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z4 = false;
            bigDecimal2 = bigDecimal;
            cryptoInputMode2 = cryptoInputMode;
            continuation2 = continuation;
            cryptoInstrumentInputHelper2 = cryptoInstrumentInputHelper;
        } else {
            z4 = z3;
            cryptoInstrumentInputHelper2 = cryptoInstrumentInputHelper;
            bigDecimal2 = bigDecimal;
            cryptoInputMode2 = cryptoInputMode;
            continuation2 = continuation;
        }
        return cryptoInstrumentInputHelper2.processAmountBlocking(bigDecimal2, roundingMode2, cryptoInputMode2, z5, z6, z4, continuation2);
    }

    /* compiled from: CryptoInstrumentInputHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/formats/crypto/CryptoFormattedAmount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper$processAmountBlocking$2", m3645f = "CryptoInstrumentInputHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper$processAmountBlocking$2 */
    static final class C389592 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CryptoFormattedAmount>, Object> {
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ boolean $forceCurrencyFormatter;
        final /* synthetic */ CryptoInputMode $inputMode;
        final /* synthetic */ boolean $isSpaced;
        final /* synthetic */ RoundingMode $roundingMode;
        final /* synthetic */ boolean $showCurrencySymbol;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C389592(CryptoInputMode cryptoInputMode, BigDecimal bigDecimal, RoundingMode roundingMode, boolean z, boolean z2, boolean z3, Continuation<? super C389592> continuation) {
            super(2, continuation);
            this.$inputMode = cryptoInputMode;
            this.$amount = bigDecimal;
            this.$roundingMode = roundingMode;
            this.$isSpaced = z;
            this.$showCurrencySymbol = z2;
            this.$forceCurrencyFormatter = z3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoInstrumentInputHelper.this.new C389592(this.$inputMode, this.$amount, this.$roundingMode, this.$isSpaced, this.$showCurrencySymbol, this.$forceCurrencyFormatter, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CryptoFormattedAmount> continuation) {
            return ((C389592) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2ProcessAmount$default = CurrencyInputHelper.processAmount$default(CryptoInstrumentInputHelper.this.getCurrencyInputHelper(this.$inputMode), this.$amount, this.$roundingMode, this.$isSpaced, this.$showCurrencySymbol, this.$forceCurrencyFormatter, false, 32, null);
            return new CryptoFormattedAmount((BigDecimal) tuples2ProcessAmount$default.component2(), (String) tuples2ProcessAmount$default.component1());
        }
    }

    public final Object processAmountBlocking(BigDecimal bigDecimal, RoundingMode roundingMode, CryptoInputMode cryptoInputMode, boolean z, boolean z2, boolean z3, Continuation<? super CryptoFormattedAmount> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new C389592(cryptoInputMode, bigDecimal, roundingMode, z, z2, z3, null), continuation);
    }

    /* compiled from: CryptoInstrumentInputHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper$Companion;", "", "<init>", "()V", "toCurrencyInputInfoPair", "Lcom/robinhood/shared/formats/crypto/CurrencyInputInfoPair;", "Lcom/robinhood/models/crypto/InstrumentDefinition;", "getToCurrencyInputInfoPair", "(Lcom/robinhood/models/crypto/InstrumentDefinition;)Lcom/robinhood/shared/formats/crypto/CurrencyInputInfoPair;", "lib-formats-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CurrencyInputInfoPair getToCurrencyInputInfoPair(InstrumentDefinition instrumentDefinition) {
            return new CurrencyInputInfoPair(CurrencyInputInfoPair2.getToCurrencyInputInfo(instrumentDefinition.getQuoteCurrencyForCost()), CurrencyInputInfoPair2.getToCurrencyInputInfo(instrumentDefinition.getAssetCurrencyForCost()));
        }
    }
}
