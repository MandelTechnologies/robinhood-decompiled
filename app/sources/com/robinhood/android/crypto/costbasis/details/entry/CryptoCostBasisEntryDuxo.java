package com.robinhood.android.crypto.costbasis.details.entry;

import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo;
import com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryEvent;
import com.robinhood.android.crypto.costbasis.details.entry.InputRow;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorResponse;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrors4;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import com.robinhood.models.crypto.p314db.costbasis.CryptoCostBasisDetails;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.formats.crypto.CryptoFormattedAmount;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.shared.formats.crypto.CurrencyInputInfoPair;
import com.robinhood.shared.formats.crypto.CurrencyInputInfoPair2;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.time.Time4;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeParseException;

/* compiled from: CryptoCostBasisEntryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 J2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002KJB9\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020 *\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J$\u0010-\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(2\n\u0010,\u001a\u00060*j\u0002`+H\u0086@¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020\u00152\u0006\u0010/\u001a\u00020(H\u0086@¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u00152\f\u00103\u001a\b\u0012\u0004\u0012\u00020(02¢\u0006\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00190<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010A\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010@\u0018\u00010?0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R*\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u0010'\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryViewState;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "cryptoCostBasisStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairV2Store", "Landroid/content/res/Resources;", "resources", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Landroid/content/res/Resources;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryStateProvider;)V", "", "collectPurchaseDate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectCoinQuantity", "", "rawInput", "j$/time/Instant", "parseDate", "(Ljava/lang/String;)Lj$/time/Instant;", "", "inlineErrorField", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "toValidationResult", "(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "t", "handleError", "(Ljava/lang/Throwable;)V", "onCreate", "()V", "Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;", "focusedRow", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "keyEvent", "consumeKeyEvent", "(Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;Landroid/view/KeyEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inputRow", "validateInput", "(Lcom/robinhood/android/crypto/costbasis/details/entry/InputRow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/collections/immutable/ImmutableList;", "inputRows", "submit", "(Lkotlinx/collections/immutable/ImmutableList;)V", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "Landroid/content/res/Resources;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "purchaseDateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "coinQuantityFlow", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "helper", "Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "getHelper", "()Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;", "setHelper", "(Lcom/robinhood/shared/formats/crypto/CryptoInstrumentInputHelper;)V", "getHelper$annotations", "Companion", "ValidationResult", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoCostBasisEntryDuxo extends BaseDuxo3<CryptoCostBasisEntryDataState, CryptoCostBasisEntryViewState, CryptoCostBasisEntryEvent> implements HasArgs<CostBasisEntryArgs> {
    private static final String VALIDATION_FIELD_COIN_QUANTITY = "quantity";
    private static final String VALIDATION_FIELD_PURCHASE_DATE = "acquisition_date";
    private final StateFlow2<Tuples2<String, BigDecimal>> coinQuantityFlow;
    private final CryptoCostBasisStore cryptoCostBasisStore;
    private final CurrencyPairV2Store currencyPairV2Store;
    private CryptoInstrumentInputHelper helper;
    private final StateFlow2<String> purchaseDateFlow;
    private final Resources resources;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputRow.Type.values().length];
            try {
                iArr[InputRow.Type.PURCHASE_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputRow.Type.COIN_QUANTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputRow.Type.TOTAL_COST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "consumeKeyEvent")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$1 */
    static final class C128231 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C128231(Continuation<? super C128231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoCostBasisEntryDuxo.this.consumeKeyEvent(null, null, this);
        }
    }

    public static /* synthetic */ void getHelper$annotations() {
    }

    @Override // com.robinhood.android.udf.HasArgs
    public CostBasisEntryArgs getArgs(SavedStateHandle savedStateHandle) {
        return (CostBasisEntryArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCostBasisEntryDuxo(CryptoCostBasisStore cryptoCostBasisStore, CurrencyPairV2Store currencyPairV2Store, Resources resources, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoCostBasisEntryStateProvider stateProvider) {
        super(new CryptoCostBasisEntryDataState(null, null, null, null, null, null, null, false, false, 511, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoCostBasisStore = cryptoCostBasisStore;
        this.currencyPairV2Store = currencyPairV2Store;
        this.resources = resources;
        this.savedStateHandle = savedStateHandle;
        this.purchaseDateFlow = StateFlow4.MutableStateFlow("");
        this.coinQuantityFlow = StateFlow4.MutableStateFlow(null);
    }

    public final CryptoInstrumentInputHelper getHelper() {
        return this.helper;
    }

    public final void setHelper(CryptoInstrumentInputHelper cryptoInstrumentInputHelper) {
        this.helper = cryptoInstrumentInputHelper;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C128271(null));
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1 */
    static final class C128271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C128271(Continuation<? super C128271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128271 c128271 = CryptoCostBasisEntryDuxo.this.new C128271(continuation);
            c128271.L$0 = obj;
            return c128271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {97}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoCostBasisEntryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CryptoCostBasisStore cryptoCostBasisStore = this.this$0.cryptoCostBasisStore;
                        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.this$0;
                        UUID sourceId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getSourceId();
                        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo2 = this.this$0;
                        UUID accountId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo2.getArgs(cryptoCostBasisEntryDuxo2.getSavedStateHandle())).getAccountId();
                        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo3 = this.this$0;
                        Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(cryptoCostBasisStore.streamCostBasisDetails(accountId, sourceId, ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo3.getArgs(cryptoCostBasisEntryDuxo3.getSavedStateHandle())).getSourceType()), new C497301(this.this$0, null)), new C12818x6ca8e02f(null, this.this$0));
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    if (!(th instanceof CancellationException)) {
                        this.this$0.handleError(th);
                    } else {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoCostBasisEntryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "costBasisDetails", "Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497301 extends ContinuationImpl7 implements Function2<CryptoCostBasisDetails, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497301(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Continuation<? super C497301> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoCostBasisEntryDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497301 c497301 = new C497301(this.this$0, continuation);
                    c497301.L$0 = obj;
                    return c497301;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoCostBasisDetails cryptoCostBasisDetails, Continuation<? super Unit> continuation) {
                    return ((C497301) create(cryptoCostBasisDetails, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoCostBasisEntryDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$1$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C497311 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
                    final /* synthetic */ CryptoCostBasisDetails $costBasisDetails;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497311(CryptoCostBasisDetails cryptoCostBasisDetails, Continuation<? super C497311> continuation) {
                        super(2, continuation);
                        this.$costBasisDetails = cryptoCostBasisDetails;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497311 c497311 = new C497311(this.$costBasisDetails, continuation);
                        c497311.L$0 = obj;
                        return c497311;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                        return ((C497311) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, this.$costBasisDetails, null, null, null, null, null, null, false, false, 510, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C497311((CryptoCostBasisDetails) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: CryptoCostBasisEntryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$3", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoCostBasisEntryDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UiCurrencyPair uiCurrencyPair = (UiCurrencyPair) this.L$0;
                    this.this$0.setHelper(new CryptoInstrumentInputHelper(new CurrencyInputInfoPair(CurrencyInputInfoPair2.getToCurrencyInputInfo(uiCurrencyPair.getQuoteCurrencyForCost()), CurrencyInputInfoPair2.getToCurrencyInputInfo(uiCurrencyPair.getAssetCurrency()))));
                    this.this$0.applyMutation(new C497321(uiCurrencyPair, null));
                    return Unit.INSTANCE;
                }

                /* compiled from: CryptoCostBasisEntryDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$3$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C497321 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $currencyPair;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C497321(UiCurrencyPair uiCurrencyPair, Continuation<? super C497321> continuation) {
                        super(2, continuation);
                        this.$currencyPair = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C497321 c497321 = new C497321(this.$currencyPair, continuation);
                        c497321.L$0 = obj;
                        return c497321;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                        return ((C497321) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, this.$currencyPair, null, null, null, null, null, false, false, 509, null);
                    }
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoCostBasisEntryDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoCostBasisEntryDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoCostBasisEntryDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {120}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoCostBasisEntryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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
                    CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.this$0;
                    this.label = 1;
                    if (cryptoCostBasisEntryDuxo.collectPurchaseDate(this) == coroutine_suspended) {
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

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$3", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoCostBasisEntryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
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
                    CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.this$0;
                    this.label = 1;
                    if (cryptoCostBasisEntryDuxo.collectCoinQuantity(this) == coroutine_suspended) {
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r2 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r2 == r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object consumeKeyEvent(InputRow inputRow, KeyEvent keyEvent, Continuation<? super Unit> continuation) {
        C128231 c128231;
        if (continuation instanceof C128231) {
            c128231 = (C128231) continuation;
            int i = c128231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c128231.label = i - Integer.MIN_VALUE;
            } else {
                c128231 = new C128231(continuation);
            }
        }
        C128231 c1282312 = c128231;
        Object objProcessKeyEventBlocking$default = c1282312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1282312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objProcessKeyEventBlocking$default);
            int i3 = WhenMappings.$EnumSwitchMapping$0[inputRow.getType().ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    CryptoInstrumentInputHelper cryptoInstrumentInputHelper = this.helper;
                    if (cryptoInstrumentInputHelper == null) {
                        return Unit.INSTANCE;
                    }
                    String value = inputRow.getValue();
                    CryptoInputMode cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
                    c1282312.label = 1;
                    objProcessKeyEventBlocking$default = CryptoInstrumentInputHelper.processKeyEventBlocking$default(cryptoInstrumentInputHelper, keyEvent, value, cryptoInputMode, false, false, false, true, c1282312, 40, null);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CryptoInstrumentInputHelper cryptoInstrumentInputHelper2 = this.helper;
                    if (cryptoInstrumentInputHelper2 == null) {
                        return Unit.INSTANCE;
                    }
                    String value2 = inputRow.getValue();
                    CryptoInputMode cryptoInputMode2 = CryptoInputMode.QUOTE_CURRENCY;
                    c1282312.label = 2;
                    objProcessKeyEventBlocking$default = CryptoInstrumentInputHelper.processKeyEventBlocking$default(cryptoInstrumentInputHelper2, keyEvent, value2, cryptoInputMode2, false, true, false, true, c1282312, 40, null);
                }
                return coroutine_suspended;
            }
            Intrinsics.checkNotNull(inputRow, "null cannot be cast to non-null type com.robinhood.android.crypto.costbasis.details.entry.InputRow.Text");
            String rawValue = ((InputRow.Text) inputRow).getRawValue();
            if (KeyEvents2.isDigit(keyEvent) && rawValue.length() < 6) {
                rawValue = rawValue + keyEvent.getNumber();
            } else if (KeyEvents2.isDelete(keyEvent) && rawValue.length() > 0) {
                rawValue = StringsKt.dropLast(rawValue, 1);
            }
            applyMutation(new C128242(rawValue, null));
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objProcessKeyEventBlocking$default);
            applyMutation(new C128253((CryptoFormattedAmount) objProcessKeyEventBlocking$default, null));
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objProcessKeyEventBlocking$default);
            applyMutation(new C128264((CryptoFormattedAmount) objProcessKeyEventBlocking$default, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$2 */
    static final class C128242 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
        final /* synthetic */ String $newValue;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128242(String str, Continuation<? super C128242> continuation) {
            super(2, continuation);
            this.$newValue = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128242 c128242 = new C128242(this.$newValue, continuation);
            c128242.L$0 = obj;
            return c128242;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
            return ((C128242) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, this.$newValue, null, null, null, null, false, false, 507, null);
        }
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$3", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$3 */
    static final class C128253 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
        final /* synthetic */ CryptoFormattedAmount $processedUserInput;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128253(CryptoFormattedAmount cryptoFormattedAmount, Continuation<? super C128253> continuation) {
            super(2, continuation);
            this.$processedUserInput = cryptoFormattedAmount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128253 c128253 = new C128253(this.$processedUserInput, continuation);
            c128253.L$0 = obj;
            return c128253;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
            return ((C128253) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, this.$processedUserInput, null, null, null, false, false, 503, null);
        }
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$4", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$consumeKeyEvent$4 */
    static final class C128264 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
        final /* synthetic */ CryptoFormattedAmount $processedUserInput;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128264(CryptoFormattedAmount cryptoFormattedAmount, Continuation<? super C128264> continuation) {
            super(2, continuation);
            this.$processedUserInput = cryptoFormattedAmount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128264 c128264 = new C128264(this.$processedUserInput, continuation);
            c128264.L$0 = obj;
            return c128264;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
            return ((C128264) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, this.$processedUserInput, null, null, false, false, 495, null);
        }
    }

    public final Object validateInput(InputRow inputRow, Continuation<? super Unit> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[inputRow.getType().ordinal()];
        if (i == 1) {
            Object objEmit = this.purchaseDateFlow.emit(inputRow.getValue(), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(inputRow, "null cannot be cast to non-null type com.robinhood.android.crypto.costbasis.details.entry.InputRow.Number");
        InputRow.Number number = (InputRow.Number) inputRow;
        Object objEmit2 = this.coinQuantityFlow.emit(Tuples4.m3642to(number.getValue(), number.getRawValue()), continuation);
        return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$2 */
    static final class C128212 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        C128212(Continuation<? super C128212> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisEntryDuxo.this.new C128212(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C128212) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$2$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
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
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, true, false, 351, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectPurchaseDate(Continuation<? super Unit> continuation) {
        final Flow flowDebounce = Time4.debounce(FlowKt.onEach(this.purchaseDateFlow, new C128212(null)), Durations.INSTANCE.getONE_SECOND());
        Object objCollectLatest = FlowKt.collectLatest(new Flow<ValidationResult>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoCostBasisEntryDuxo.ValidationResult> flowCollector, Continuation continuation2) {
                Object objCollect = flowDebounce.collect(new C128172(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$$inlined$map$1$2 */
            public static final class C128172<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$$inlined$map$1$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {56, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C128172.this.emit(null, this);
                    }
                }

                public C128172(FlowCollector flowCollector, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = cryptoCostBasisEntryDuxo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
                
                    if (r13.emit(r15, r9) == r1) goto L45;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    Instant date;
                    FlowCollector flowCollector2;
                    Object obj2;
                    FlowCollector flowCollector3;
                    Object objM28550constructorimpl;
                    Throwable thM28553exceptionOrNullimpl;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    Object obj3 = anonymousClass12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass12.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        flowCollector = this.$this_unsafeFlow;
                        String str = (String) obj;
                        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.this$0;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            date = cryptoCostBasisEntryDuxo.parseDate(str);
                        } catch (Throwable th) {
                            th = th;
                            flowCollector2 = flowCollector;
                            Result.Companion companion2 = Result.INSTANCE;
                            flowCollector3 = flowCollector2;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            anonymousClass12.L$0 = null;
                            anonymousClass12.label = 2;
                        }
                        if (date != null) {
                            CryptoCostBasisStore cryptoCostBasisStore = cryptoCostBasisEntryDuxo.cryptoCostBasisStore;
                            UUID sourceId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getSourceId();
                            UUID accountId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getAccountId();
                            String sourceType = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getSourceType();
                            anonymousClass12.L$0 = flowCollector;
                            anonymousClass12.label = 1;
                            if (CryptoCostBasisStore.validateLotInput$default(cryptoCostBasisStore, accountId, sourceId, sourceType, "acquisition_date", date, null, anonymousClass12, 32, null) != coroutine_suspended) {
                                flowCollector2 = flowCollector;
                            }
                            return coroutine_suspended;
                        }
                        obj2 = CryptoCostBasisEntryDuxo.ValidationResult.Skipped.INSTANCE;
                        flowCollector = flowCollector;
                        objM28550constructorimpl = Result.m28550constructorimpl(obj2);
                        flowCollector3 = flowCollector;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                            if (thM28553exceptionOrNullimpl instanceof DateTimeParseException) {
                                String string2 = this.this$0.resources.getString(C12782R.string.cost_basis_detail_entry_error_purchase_date);
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                objM28550constructorimpl = new CryptoCostBasisEntryDuxo.ValidationResult.Fail(string2);
                            } else {
                                objM28550constructorimpl = this.this$0.toValidationResult(thM28553exceptionOrNullimpl, "acquisition_date");
                            }
                        }
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 2;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        flowCollector2 = (FlowCollector) anonymousClass12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion22 = Result.INSTANCE;
                            flowCollector3 = flowCollector2;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            anonymousClass12.L$0 = null;
                            anonymousClass12.label = 2;
                        }
                    }
                    flowCollector = flowCollector2;
                    obj2 = CryptoCostBasisEntryDuxo.ValidationResult.Pass.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(obj2);
                    flowCollector3 = flowCollector;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    anonymousClass12.L$0 = null;
                    anonymousClass12.label = 2;
                }
            }
        }, new C128224(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4 */
    static final class C128224 extends ContinuationImpl7 implements Function2<ValidationResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C128224(Continuation<? super C128224> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128224 c128224 = CryptoCostBasisEntryDuxo.this.new C128224(continuation);
            c128224.L$0 = obj;
            return c128224;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ValidationResult validationResult, Continuation<? super Unit> continuation) {
            return ((C128224) create(validationResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ValidationResult validationResult = (ValidationResult) this.L$0;
            if (validationResult instanceof ValidationResult.Fail) {
                CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass1(validationResult, null));
            } else if (validationResult instanceof ValidationResult.UnresolvedError) {
                CryptoCostBasisEntryDuxo.this.handleError(((ValidationResult.UnresolvedError) validationResult).getT());
            } else if (Intrinsics.areEqual(validationResult, ValidationResult.Pass.INSTANCE)) {
                CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass2(null));
            } else if (!Intrinsics.areEqual(validationResult, ValidationResult.Skipped.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            final /* synthetic */ ValidationResult $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ValidationResult validationResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = validationResult;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, ((ValidationResult.Fail) this.$result).getErrorMessage(), null, false, false, 479, null);
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass2) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, false, false, 479, null);
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4$3", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectPurchaseDate$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass3) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, false, false, 383, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectCoinQuantity(Continuation<? super Unit> continuation) {
        final Flow flowDebounce = Time4.debounce(FlowKt.onEach(FlowKt.filterNotNull(this.coinQuantityFlow), new C128192(null)), Durations.INSTANCE.getONE_SECOND());
        Object objCollectLatest = FlowKt.collectLatest(new Flow<ValidationResult>() { // from class: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super CryptoCostBasisEntryDuxo.ValidationResult> flowCollector, Continuation continuation2) {
                Object objCollect = flowDebounce.collect(new C128162(flowCollector, this), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$$inlined$map$1$2 */
            public static final class C128162<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ CryptoCostBasisEntryDuxo this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$$inlined$map$1$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {55, 50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C128162.this.emit(null, this);
                    }
                }

                public C128162(FlowCollector flowCollector, CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = cryptoCostBasisEntryDuxo;
                }

                /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
                
                    if (r15.emit(r0, r9) == r1) goto L45;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    FlowCollector flowCollector;
                    Object obj2;
                    FlowCollector flowCollector2;
                    Object objM28550constructorimpl;
                    FlowCollector flowCollector3;
                    Throwable thM28553exceptionOrNullimpl;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    Object obj3 = anonymousClass12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass12.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj3);
                        FlowCollector flowCollector4 = this.$this_unsafeFlow;
                        Tuples2 tuples2 = (Tuples2) obj;
                        String str = (String) tuples2.component1();
                        BigDecimal bigDecimal = (BigDecimal) tuples2.component2();
                        CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo = this.this$0;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                        } catch (Throwable th) {
                            th = th;
                            flowCollector = flowCollector4;
                            Result.Companion companion2 = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            flowCollector3 = flowCollector;
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            anonymousClass12.L$0 = null;
                            anonymousClass12.label = 2;
                        }
                        if (!StringsKt.isBlank(str) && bigDecimal != null) {
                            CryptoCostBasisStore cryptoCostBasisStore = cryptoCostBasisEntryDuxo.cryptoCostBasisStore;
                            UUID sourceId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getSourceId();
                            UUID accountId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getAccountId();
                            String sourceType = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo.getArgs(cryptoCostBasisEntryDuxo.getSavedStateHandle())).getSourceType();
                            anonymousClass12.L$0 = flowCollector4;
                            anonymousClass12.label = 1;
                            if (CryptoCostBasisStore.validateLotInput$default(cryptoCostBasisStore, accountId, sourceId, sourceType, "quantity", null, bigDecimal, anonymousClass12, 16, null) != coroutine_suspended) {
                                flowCollector2 = flowCollector4;
                            }
                            return coroutine_suspended;
                        }
                        obj2 = CryptoCostBasisEntryDuxo.ValidationResult.Skipped.INSTANCE;
                        flowCollector = flowCollector4;
                        objM28550constructorimpl = Result.m28550constructorimpl(obj2);
                        flowCollector3 = flowCollector;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                            objM28550constructorimpl = this.this$0.toValidationResult(thM28553exceptionOrNullimpl, "quantity");
                        }
                        anonymousClass12.L$0 = null;
                        anonymousClass12.label = 2;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            return Unit.INSTANCE;
                        }
                        flowCollector = (FlowCollector) anonymousClass12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj3);
                            flowCollector2 = flowCollector;
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion22 = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            flowCollector3 = flowCollector;
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            anonymousClass12.L$0 = null;
                            anonymousClass12.label = 2;
                        }
                    }
                    obj2 = CryptoCostBasisEntryDuxo.ValidationResult.Pass.INSTANCE;
                    flowCollector = flowCollector2;
                    objM28550constructorimpl = Result.m28550constructorimpl(obj2);
                    flowCollector3 = flowCollector;
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                    }
                    anonymousClass12.L$0 = null;
                    anonymousClass12.label = 2;
                }
            }
        }, new C128204(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$2 */
    static final class C128192 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
        int label;

        C128192(Continuation<? super C128192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisEntryDuxo.this.new C128192(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends BigDecimal> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<String, ? extends BigDecimal>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<String, ? extends BigDecimal> tuples2, Continuation<? super Unit> continuation) {
            return ((C128192) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$2$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
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
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, true, false, EnumC7081g.f2781x2ba65ba3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass1(null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4 */
    static final class C128204 extends ContinuationImpl7 implements Function2<ValidationResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C128204(Continuation<? super C128204> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128204 c128204 = CryptoCostBasisEntryDuxo.this.new C128204(continuation);
            c128204.L$0 = obj;
            return c128204;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ValidationResult validationResult, Continuation<? super Unit> continuation) {
            return ((C128204) create(validationResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ValidationResult validationResult = (ValidationResult) this.L$0;
            if (validationResult instanceof ValidationResult.Fail) {
                CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass1(validationResult, null));
            } else if (validationResult instanceof ValidationResult.UnresolvedError) {
                CryptoCostBasisEntryDuxo.this.handleError(((ValidationResult.UnresolvedError) validationResult).getT());
            } else if (Intrinsics.areEqual(validationResult, ValidationResult.Pass.INSTANCE)) {
                CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass2(null));
            } else if (!Intrinsics.areEqual(validationResult, ValidationResult.Skipped.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            final /* synthetic */ ValidationResult $result;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ValidationResult validationResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$result = validationResult;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, ((ValidationResult.Fail) this.$result).getErrorMessage(), false, false, 447, null);
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass2) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, false, false, 447, null);
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4$3", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$collectCoinQuantity$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass3) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, false, false, 383, null);
            }
        }
    }

    public final void submit(ImmutableList<? extends InputRow> inputRows) {
        InputRow next;
        Instant instant;
        InputRow next2;
        InputRow next3;
        String value;
        Instant date;
        Intrinsics.checkNotNullParameter(inputRows, "inputRows");
        Iterator<? extends InputRow> it = inputRows.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.getType() == InputRow.Type.PURCHASE_DATE) {
                    break;
                }
            }
        }
        InputRow inputRow = next;
        if (inputRow == null || (value = inputRow.getValue()) == null) {
            instant = null;
        } else {
            try {
                date = parseDate(value);
            } catch (Throwable unused) {
                date = null;
            }
            instant = date;
        }
        Iterator<? extends InputRow> it2 = inputRows.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (next2.getType() == InputRow.Type.COIN_QUANTITY) {
                    break;
                }
            }
        }
        InputRow.Number number = next2 instanceof InputRow.Number ? (InputRow.Number) next2 : null;
        BigDecimal rawValue = number != null ? number.getRawValue() : null;
        Iterator<? extends InputRow> it3 = inputRows.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it3.next();
                if (next3.getType() == InputRow.Type.TOTAL_COST) {
                    break;
                }
            }
        }
        InputRow.Number number2 = next3 instanceof InputRow.Number ? (InputRow.Number) next3 : null;
        BigDecimal rawValue2 = number2 != null ? number2.getRawValue() : null;
        if (instant != null && rawValue != null && rawValue2 != null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C128281(instant, rawValue, rawValue2, null), 3, null);
            return;
        }
        handleError(new IllegalArgumentException("Invalid input values!\ninputRows: " + inputRows + "\npurchaseDate: " + instant + "\ncoinQuantity: " + rawValue + "\ntotalCost: " + rawValue2));
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$submit$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {332}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$submit$1 */
    static final class C128281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BigDecimal $coinQuantity;
        final /* synthetic */ Instant $purchaseDate;
        final /* synthetic */ BigDecimal $totalCost;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128281(Instant instant, BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super C128281> continuation) {
            super(2, continuation);
            this.$purchaseDate = instant;
            this.$coinQuantity = bigDecimal;
            this.$totalCost = bigDecimal2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisEntryDuxo.this.new C128281(this.$purchaseDate, this.$coinQuantity, this.$totalCost, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #3 {all -> 0x009d, blocks: (B:24:0x0089, B:26:0x008d, B:32:0x00a0), top: B:41:0x0089 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: all -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x009d, blocks: (B:24:0x0089, B:26:0x008d, B:32:0x00a0), top: B:41:0x0089 }] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C128281 c128281;
            Throwable th;
            CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoCostBasisStore cryptoCostBasisStore = CryptoCostBasisEntryDuxo.this.cryptoCostBasisStore;
                    CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo2 = CryptoCostBasisEntryDuxo.this;
                    UUID sourceId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo2.getArgs(cryptoCostBasisEntryDuxo2.getSavedStateHandle())).getSourceId();
                    CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo3 = CryptoCostBasisEntryDuxo.this;
                    UUID accountId = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo3.getArgs(cryptoCostBasisEntryDuxo3.getSavedStateHandle())).getAccountId();
                    CryptoCostBasisEntryDuxo cryptoCostBasisEntryDuxo4 = CryptoCostBasisEntryDuxo.this;
                    String sourceType = ((CostBasisEntryArgs) cryptoCostBasisEntryDuxo4.getArgs(cryptoCostBasisEntryDuxo4.getSavedStateHandle())).getSourceType();
                    Instant instant = this.$purchaseDate;
                    BigDecimal bigDecimal = this.$coinQuantity;
                    BigDecimal bigDecimal2 = this.$totalCost;
                    this.label = 1;
                    c128281 = this;
                    try {
                        if (cryptoCostBasisStore.submitLotInput(accountId, sourceId, sourceType, instant, bigDecimal, bigDecimal2, c128281) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!(th instanceof CancellationException)) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c128281 = this;
                    th = th;
                    if (!(th instanceof CancellationException)) {
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c128281 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c128281 = this;
                    try {
                        if (!(th instanceof CancellationException)) {
                            CryptoCostBasisEntryDuxo.this.handleError(th);
                            cryptoCostBasisEntryDuxo = CryptoCostBasisEntryDuxo.this;
                            anonymousClass2 = new AnonymousClass2(null);
                            cryptoCostBasisEntryDuxo.applyMutation(anonymousClass2);
                            return Unit.INSTANCE;
                        }
                        throw th;
                    } catch (Throwable th5) {
                        CryptoCostBasisEntryDuxo.this.applyMutation(new AnonymousClass2(null));
                        throw th5;
                    }
                }
            }
            CryptoCostBasisEntryDuxo.this.submit((CryptoCostBasisEntryDuxo) CryptoCostBasisEntryEvent.Submitted.INSTANCE);
            cryptoCostBasisEntryDuxo = CryptoCostBasisEntryDuxo.this;
            anonymousClass2 = new AnonymousClass2(null);
            cryptoCostBasisEntryDuxo.applyMutation(anonymousClass2);
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$submit$1$1", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$submit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
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
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, false, true, 255, null);
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$submit$1$2", m3645f = "CryptoCostBasisEntryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryDuxo$submit$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisEntryDataState cryptoCostBasisEntryDataState, Continuation<? super CryptoCostBasisEntryDataState> continuation) {
                return ((AnonymousClass2) create(cryptoCostBasisEntryDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoCostBasisEntryDataState.copy$default((CryptoCostBasisEntryDataState) this.L$0, null, null, null, null, null, null, null, false, false, 255, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instant parseDate(String rawInput) {
        if (rawInput.length() != 8) {
            return null;
        }
        return LocalDate.parse(rawInput, DateTimeFormatter.ofPattern(CryptoCostBasisEntryDataState.PURCHASE_DATE_FORMAT)).atStartOfDay().mo3396g(ZoneId.systemDefault()).toInstant();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidationResult toValidationResult(Throwable th, String str) throws Throwable {
        Map<String, String> fieldErrorMessages;
        if (th instanceof CancellationException) {
            throw th;
        }
        if (Throwables.isNetworkRelated(th)) {
            CostBasisErrorResponse costBasisErrorResponseExtractCostBasisErrorResponse = CostBasisErrors4.extractCostBasisErrorResponse(th);
            String str2 = (costBasisErrorResponseExtractCostBasisErrorResponse == null || (fieldErrorMessages = costBasisErrorResponseExtractCostBasisErrorResponse.getFieldErrorMessages()) == null) ? null : fieldErrorMessages.get(str);
            if (str2 == null) {
                return ValidationResult.Skipped.INSTANCE;
            }
            return new ValidationResult.Fail(str2);
        }
        return new ValidationResult.UnresolvedError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) {
        if (!Throwables.isNetworkRelated(t)) {
            CrashReporter.INSTANCE.reportNonFatal(t, false, new EventMetadata(SentryTeam.CRYPTO, MapsKt.mapOf(Tuples4.m3642to("feature", "CryptoCostBasis")), MapsKt.mapOf(Tuples4.m3642to("source_id", ((CostBasisEntryArgs) getArgs(getSavedStateHandle())).getSourceId()))));
        }
        submit((CryptoCostBasisEntryDuxo) new CryptoCostBasisEntryEvent.Error(CostBasisErrors4.extractCostBasisErrorDetails(t)));
    }

    /* compiled from: CryptoCostBasisEntryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "", "Pass", "Skipped", "Fail", "UnresolvedError", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$Fail;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$Pass;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$Skipped;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$UnresolvedError;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ValidationResult {

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$Pass;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Pass implements ValidationResult {
            public static final int $stable = 0;
            public static final Pass INSTANCE = new Pass();

            public boolean equals(Object other) {
                return this == other || (other instanceof Pass);
            }

            public int hashCode() {
                return -1202279005;
            }

            public String toString() {
                return "Pass";
            }

            private Pass() {
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$Skipped;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Skipped implements ValidationResult {
            public static final int $stable = 0;
            public static final Skipped INSTANCE = new Skipped();

            public boolean equals(Object other) {
                return this == other || (other instanceof Skipped);
            }

            public int hashCode() {
                return 1578032222;
            }

            public String toString() {
                return "Skipped";
            }

            private Skipped() {
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$Fail;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Fail implements ValidationResult {
            public static final int $stable = 0;
            private final String errorMessage;

            public static /* synthetic */ Fail copy$default(Fail fail, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fail.errorMessage;
                }
                return fail.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final Fail copy(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new Fail(errorMessage);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Fail) && Intrinsics.areEqual(this.errorMessage, ((Fail) other).errorMessage);
            }

            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            public String toString() {
                return "Fail(errorMessage=" + this.errorMessage + ")";
            }

            public Fail(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.errorMessage = errorMessage;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }
        }

        /* compiled from: CryptoCostBasisEntryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult$UnresolvedError;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryDuxo$ValidationResult;", "t", "", "<init>", "(Ljava/lang/Throwable;)V", "getT", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnresolvedError implements ValidationResult {
            public static final int $stable = 8;
            private final Throwable t;

            public static /* synthetic */ UnresolvedError copy$default(UnresolvedError unresolvedError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = unresolvedError.t;
                }
                return unresolvedError.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getT() {
                return this.t;
            }

            public final UnresolvedError copy(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                return new UnresolvedError(t);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnresolvedError) && Intrinsics.areEqual(this.t, ((UnresolvedError) other).t);
            }

            public int hashCode() {
                return this.t.hashCode();
            }

            public String toString() {
                return "UnresolvedError(t=" + this.t + ")";
            }

            public UnresolvedError(Throwable t) {
                Intrinsics.checkNotNullParameter(t, "t");
                this.t = t;
            }

            public final Throwable getT() {
                return this.t;
            }
        }
    }
}
