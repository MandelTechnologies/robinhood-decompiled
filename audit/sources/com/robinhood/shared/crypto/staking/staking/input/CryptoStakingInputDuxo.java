package com.robinhood.shared.crypto.staking.staking.input;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.ApiAmountAvailableInfoScreen;
import com.robinhood.models.api.CryptoApiErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingPosition;
import com.robinhood.models.crypto.p314db.staking.StakingConfig;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.staking.AmountAvailableInfoScreen;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.AlertContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputEvent;
import com.robinhood.shared.crypto.staking.staking.input.SuggestedInputAmountState;
import com.robinhood.shared.crypto.staking.staking.utils.ErrorHandlingUtils;
import com.robinhood.shared.crypto.staking.staking.utils.StakingCrashReporter;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.UiCurrencyPairs3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CryptoStakingInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 M2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002LMBc\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010!\u001a\u00020\"H\u0016J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0012\u0010'\u001a\u00020\"2\n\u0010(\u001a\u00060)j\u0002`*J\u0006\u0010+\u001a\u00020\"J&\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\u0006\u0010%\u001a\u00020&2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J6\u00103\u001a\u00020\"2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&2\u0006\u00101\u001a\u000202J>\u00108\u001a\u00020\"2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0082@¢\u0006\u0002\u00109J\u0017\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>J6\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020B2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&2\u0006\u00101\u001a\u000202J \u0010C\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020;H\u0002J\u0018\u0010G\u001a\u00020\"2\u0006\u00101\u001a\u0002022\u0006\u0010H\u001a\u00020EH\u0002J$\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020E2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006N"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputViewState;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$InitArgs;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "isQuoteInputModePref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "getBottomSheetIdForStaking", "Lcom/robinhood/models/api/ApiAmountAvailableInfoScreen$IdType;", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "onNumpadKeyPress", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onInputModeSelected", "unstakeAll", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "idempotencyId", "Ljava/util/UUID;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "onReviewButtonClick", "amount", "Ljava/math/BigDecimal;", "amountType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;", "onReviewButtonClickInternal", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$AmountType;Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/util/UUID;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractInputErrorFromException", "Lcom/robinhood/models/api/CryptoApiErrorResponse;", "throwable", "", "extractInputErrorFromException$feature_crypto_staking_externalDebug", "onSuggestedAmountClick", "suggestedAmount", "type", "Lcom/robinhood/shared/crypto/staking/staking/input/SuggestedInputAmountState$Type;", "logInvalidInputErrorEvent", "currencySymbol", "", "inputError", "logInputNetworkErrorEvent", "errorResponse", "logNonFatal", "t", "step", "InitArgs", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CryptoStakingInputDuxo extends BaseDuxo3<CryptoStakingInputDataState, CryptoStakingInputViewState, CryptoStakingInputEvent> implements HasArgs<InitArgs> {
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CryptoStakingStore cryptoStakingStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final EventLogger eventLogger;
    private final BooleanPreference isQuoteInputModePref;
    private final LazyMoshi moshi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiCryptoStakingOrder.OrderType.values().length];
            try {
                iArr[ApiCryptoStakingOrder.OrderType.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoStakingOrder.OrderType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SuggestedInputAmountState.Type.values().length];
            try {
                iArr2[SuggestedInputAmountState.Type.FIAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SuggestedInputAmountState.Type.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m3647m = "onReviewButtonClickInternal")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClickInternal$1 */
    static final class C378191 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C378191(Continuation<? super C378191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoStakingInputDuxo.this.onReviewButtonClickInternal(null, null, null, null, null, null, this);
        }
    }

    /* renamed from: extractInputErrorFromException$feature_crypto_staking_externalDebug */
    public final CryptoApiErrorResponse m2777x31f43009(Throwable throwable) {
        HttpException httpException;
        ResponseBody responseBodyErrorBody;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        try {
            httpException = (HttpException) Throwables.findCause(throwable, HttpException.class);
        } catch (Throwable unused) {
        }
        if (httpException == null) {
            return null;
        }
        Response<?> response = httpException.response();
        String strString = (response == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string();
        JsonAdapter jsonAdapterAdapter = this.moshi.adapter(CryptoApiErrorResponse.class);
        if (strString != null) {
            return (CryptoApiErrorResponse) jsonAdapterAdapter.fromJson(strString);
        }
        return null;
    }

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoStakingInputDuxo(CryptoQuoteStore cryptoQuoteStore, CryptoStakingStore cryptoStakingStore, CurrencyPairV2Store currencyPairStore, CryptoHoldingStore cryptoHoldingStore, EventLogger eventLogger, LazyMoshi moshi, @StakingIsQuoteInputModePref BooleanPreference isQuoteInputModePref, SavedStateHandle savedStateHandle, AppType appType, CryptoStakingInputStateProvider stateProvider, DuxoBundle duxoBundle) {
        CryptoInputMode cryptoInputMode;
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(isQuoteInputModePref, "isQuoteInputModePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        ApiCryptoStakingOrder.OrderType orderType = ((InitArgs) companion.getArgs(savedStateHandle)).getOrderType();
        UUID idempotencyId = ((InitArgs) companion.getArgs(savedStateHandle)).getIdempotencyId();
        if (((InitArgs) companion.getArgs(savedStateHandle)).getPrefilledAssetAmount() == null && isQuoteInputModePref.get()) {
            cryptoInputMode = CryptoInputMode.QUOTE_CURRENCY;
        } else {
            cryptoInputMode = CryptoInputMode.ASSET_CURRENCY;
        }
        super(new CryptoStakingInputDataState(orderType, 0, idempotencyId, true, false, null, cryptoInputMode, null, appType, ((InitArgs) companion.getArgs(savedStateHandle)).getPrefilledAssetAmount(), null, null, null, null, null, null, null, null, 261298, null), stateProvider, duxoBundle);
        this.cryptoQuoteStore = cryptoQuoteStore;
        this.cryptoStakingStore = cryptoStakingStore;
        this.currencyPairStore = currencyPairStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.eventLogger = eventLogger;
        this.moshi = moshi;
        this.isQuoteInputModePref = isQuoteInputModePref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C378151(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C378162(null));
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1 */
    static final class C378151 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C378151(Continuation<? super C378151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378151 c378151 = CryptoStakingInputDuxo.this.new C378151(continuation);
            c378151.L$0 = obj;
            return c378151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoStakingInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingInputDuxo;
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
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Query<CryptoQuoteStore.CryptoQuoteArgs, CryptoQuote> pollCryptoQuote = this.this$0.cryptoQuoteStore.getPollCryptoQuote();
                    Companion companion = CryptoStakingInputDuxo.INSTANCE;
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(pollCryptoQuote.asFlow(new CryptoQuoteStore.CryptoQuoteArgs(((InitArgs) companion.getArgs((HasArgs) this.this$0)).getCurrencyPairId(), null, null, 6, null)), new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ((CryptoQuote) obj2).getMarkPrice();
                        }
                    });
                    final Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = this.this$0.currencyPairStore.streamCurrencyPairFlow(((InitArgs) companion.getArgs((HasArgs) this.this$0)).getCurrencyPairId());
                    Flow flowCombine = Operators.combine(flowDistinctUntilChangedBy, FlowKt.distinctUntilChanged(new Flow<UiCurrencyPair>() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2 */
                        public static final class C378142<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C378142.this.emit(null, this);
                                }
                            }

                            public C378142(FlowCollector flowCollector) {
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
                                    UiCurrencyPair uiCurrencyPairAdjustMinOrderQuantityIncrement = UiCurrencyPairs3.adjustMinOrderQuantityIncrement((UiCurrencyPair) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(uiCurrencyPairAdjustMinOrderQuantityIncrement, anonymousClass1) == coroutine_suspended) {
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

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UiCurrencyPair> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamCurrencyPairFlow.collect(new C378142(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: CryptoStakingInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$3", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples2<? extends CryptoQuote, ? extends UiCurrencyPair>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoStakingInputDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoStakingInputDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoQuote, ? extends UiCurrencyPair> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<CryptoQuote, UiCurrencyPair>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<CryptoQuote, UiCurrencyPair> tuples2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoStakingInputDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$3$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C506851 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
                    final /* synthetic */ UiCurrencyPair $currencyPair;
                    final /* synthetic */ CryptoQuote $quote;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506851(CryptoQuote cryptoQuote, UiCurrencyPair uiCurrencyPair, Continuation<? super C506851> continuation) {
                        super(2, continuation);
                        this.$quote = cryptoQuote;
                        this.$currencyPair = uiCurrencyPair;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C506851 c506851 = new C506851(this.$quote, this.$currencyPair, continuation);
                        c506851.L$0 = obj;
                        return c506851;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                        return ((C506851) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((CryptoStakingInputDataState) this.L$0).mutateWith(this.$quote, this.$currencyPair);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        this.this$0.applyMutation(new C506851((CryptoQuote) tuples2.component1(), (UiCurrencyPair) tuples2.component2(), null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoStakingInputDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoStakingInputDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CryptoStakingInputDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(CryptoStakingInputDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(CryptoStakingInputDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$2", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {112}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoStakingInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingInputDuxo;
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
                    CryptoStakingStore cryptoStakingStore = this.this$0.cryptoStakingStore;
                    Companion companion = CryptoStakingInputDuxo.INSTANCE;
                    cryptoStakingStore.refreshPosition(((InitArgs) companion.getArgs((HasArgs) this.this$0)).getCurrencyPairId());
                    Flow<CryptoStakingPosition> flowStreamPosition = this.this$0.cryptoStakingStore.streamPosition(((InitArgs) companion.getArgs((HasArgs) this.this$0)).getCurrencyPairId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamPosition, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoStakingInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/staking/CryptoStakingPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$2$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingPosition, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoStakingInputDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoStakingInputDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoStakingPosition cryptoStakingPosition, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(cryptoStakingPosition, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CryptoStakingInputDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$2$1$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C506861 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
                    final /* synthetic */ CryptoStakingPosition $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506861(CryptoStakingPosition cryptoStakingPosition, Continuation<? super C506861> continuation) {
                        super(2, continuation);
                        this.$it = cryptoStakingPosition;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C506861 c506861 = new C506861(this.$it, continuation);
                        c506861.L$0 = obj;
                        return c506861;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                        return ((C506861) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, null, null, null, null, null, null, null, null, this.$it, null, null, 229375, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C506861((CryptoStakingPosition) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$3", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {119}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoStakingInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingInputDuxo;
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
            public final Object invokeSuspend(Object obj) throws Throwable {
                AmountAvailableInfoScreen.InfoSheetData infoSheetData;
                AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CryptoStakingStore cryptoStakingStore = this.this$0.cryptoStakingStore;
                        CryptoStakingInputDuxo cryptoStakingInputDuxo = this.this$0;
                        Companion companion = CryptoStakingInputDuxo.INSTANCE;
                        ApiAmountAvailableInfoScreen.Request request = new ApiAmountAvailableInfoScreen.Request(cryptoStakingInputDuxo.getBottomSheetIdForStaking(((InitArgs) companion.getArgs((HasArgs) cryptoStakingInputDuxo)).getOrderType()), ApiAmountAvailableInfoScreen.ActionType.CRYPTO_YIELDS_ORDER_FLOW_ACTION, ((InitArgs) companion.getArgs((HasArgs) this.this$0)).getCurrencyPairId());
                        this.label = 1;
                        obj = cryptoStakingStore.getAmountAvailableInfoScreen(request, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    infoSheetData = ((AmountAvailableInfoScreen) obj).getInfoSheetData();
                    stakingOrderFlow = infoSheetData instanceof AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow ? (AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow) infoSheetData : null;
                } catch (Throwable th) {
                    ErrorHandlingUtils.throwIfCancellation(th);
                    if (!Throwables.isNetworkRelated(th)) {
                        CryptoStakingInputDuxo.logNonFatal$default(this.this$0, th, "amount_available_info_sheet", null, 4, null);
                    }
                }
                if (stakingOrderFlow != null) {
                    this.this$0.applyMutation(new AnonymousClass1(stakingOrderFlow, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException(("Expected StakingOrderFlow info sheet data but got " + infoSheetData).toString());
            }

            /* compiled from: CryptoStakingInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$3$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
                final /* synthetic */ AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow $stakingAmountInfoSheet;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AmountAvailableInfoScreen.InfoSheetData.StakingOrderFlow stakingOrderFlow, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$stakingAmountInfoSheet = stakingOrderFlow;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stakingAmountInfoSheet, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, this.$stakingAmountInfoSheet, null, null, null, null, null, null, null, null, null, null, 262015, null);
                }
            }
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$4", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoStakingInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                AnonymousClass4 anonymousClass4;
                Throwable th;
                Throwable th2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        CryptoStakingStore cryptoStakingStore = this.this$0.cryptoStakingStore;
                        Companion companion = CryptoStakingInputDuxo.INSTANCE;
                        UUID currencyPairId = ((InitArgs) companion.getArgs((HasArgs) this.this$0)).getCurrencyPairId();
                        ApiCryptoStakingOrder.OrderType orderType = ((InitArgs) companion.getArgs((HasArgs) this.this$0)).getOrderType();
                        this.label = 1;
                        anonymousClass4 = this;
                        try {
                            obj = CryptoStakingStore.fetchConfig$default(cryptoStakingStore, currencyPairId, orderType, null, anonymousClass4, 4, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            th2 = th;
                            ErrorHandlingUtils.throwIfCancellation(th2);
                            if (!Throwables.isNetworkRelated(th2)) {
                            }
                            anonymousClass4.this$0.submit(new CryptoStakingInputEvent.Error(th2));
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        anonymousClass4 = this;
                        th = th;
                        th2 = th;
                        ErrorHandlingUtils.throwIfCancellation(th2);
                        if (!Throwables.isNetworkRelated(th2)) {
                        }
                        anonymousClass4.this$0.submit(new CryptoStakingInputEvent.Error(th2));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                        anonymousClass4 = this;
                    } catch (Throwable th5) {
                        th = th5;
                        anonymousClass4 = this;
                        th2 = th;
                        ErrorHandlingUtils.throwIfCancellation(th2);
                        if (!Throwables.isNetworkRelated(th2)) {
                            CryptoStakingInputDuxo.logNonFatal$default(anonymousClass4.this$0, th2, "fetch_config", null, 4, null);
                        }
                        anonymousClass4.this$0.submit(new CryptoStakingInputEvent.Error(th2));
                        return Unit.INSTANCE;
                    }
                }
                anonymousClass4.this$0.applyMutation(new AnonymousClass1((StakingConfig) obj, null));
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoStakingInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$4$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
                final /* synthetic */ StakingConfig $config;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StakingConfig stakingConfig, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$config = stakingConfig;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$config, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, this.$config, 131071, null);
                }
            }
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$5", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoStakingInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.cryptoHoldingStore.refresh(true);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.cryptoHoldingStore.streamCryptoHoldings(((InitArgs) CryptoStakingInputDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId())), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: CryptoStakingInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$5$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends UiCryptoHolding>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CryptoStakingInputDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoStakingInputDuxo cryptoStakingInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = cryptoStakingInputDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<UiCryptoHolding> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UiCryptoHolding> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<UiCryptoHolding>) optional, continuation);
                }

                /* compiled from: CryptoStakingInputDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$5$1$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C506871 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
                    final /* synthetic */ UiCryptoHolding $holding;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C506871(UiCryptoHolding uiCryptoHolding, Continuation<? super C506871> continuation) {
                        super(2, continuation);
                        this.$holding = uiCryptoHolding;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C506871 c506871 = new C506871(this.$holding, continuation);
                        c506871.L$0 = obj;
                        return c506871;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                        return ((C506871) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, this.$holding, null, 196607, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C506871((UiCryptoHolding) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$2", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$2 */
    static final class C378162 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C378162(Continuation<? super C378162> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingInputDuxo.this.new C378162(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoStakingInputDuxo.this.submit(CryptoStakingInputEvent.AmountInputEvent.ForceRedrawEvent.INSTANCE);
            CryptoStakingInputDuxo.this.applyMutation(new AnonymousClass1(null));
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$2$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
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
            public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 262127, null);
            }
        }
    }

    public final ApiAmountAvailableInfoScreen.IdType getBottomSheetIdForStaking(ApiCryptoStakingOrder.OrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        int i = WhenMappings.$EnumSwitchMapping$0[orderType.ordinal()];
        if (i == 1) {
            return ApiAmountAvailableInfoScreen.IdType.STAKING_AVAILABILITY;
        }
        if (i == 2) {
            return ApiAmountAvailableInfoScreen.IdType.UNSTAKING_AVAILABILITY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiAmountAvailableInfoScreen.IdType.STAKING_AVAILABILITY;
    }

    public final void onNumpadKeyPress(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        withDataState(new Function1() { // from class: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoStakingInputDuxo.onNumpadKeyPress$lambda$0(keyEvent, this, (CryptoStakingInputDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNumpadKeyPress$lambda$0(KeyEvent keyEvent, CryptoStakingInputDuxo cryptoStakingInputDuxo, CryptoStakingInputDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoStakingInputDataState cryptoStakingInputDataStateMutateWith = dataState.mutateWith(keyEvent);
        if (cryptoStakingInputDataStateMutateWith.getShakeInputKey() > 0) {
            cryptoStakingInputDuxo.submit(CryptoStakingInputEvent.AmountInputEvent.ShakeInputEvent.INSTANCE);
        } else {
            cryptoStakingInputDuxo.applyMutation(new CryptoStakingInputDuxo2(cryptoStakingInputDataStateMutateWith, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onInputModeSelected$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onInputModeSelected$1 */
    static final class C378171 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C378171(Continuation<? super C378171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378171 c378171 = new C378171(continuation);
            c378171.L$0 = obj;
            return c378171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
            return ((C378171) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoStakingInputDataState cryptoStakingInputDataState = (CryptoStakingInputDataState) this.L$0;
            return cryptoStakingInputDataState.mutateWith(cryptoStakingInputDataState.getCryptoInputMode().getOther());
        }
    }

    public final void onInputModeSelected() {
        applyMutation(new C378171(null));
        submit(CryptoStakingInputEvent.AmountInputEvent.ModeChangedEvent.INSTANCE);
    }

    public final void unstakeAll(UiCurrencyPair currencyPair, ApiCryptoStakingOrder.OrderType orderType, UUID idempotencyId, UserInteractionEventDescriptor eventDescriptor) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        if (orderType != ApiCryptoStakingOrder.OrderType.WITHDRAW) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C378241(currencyPair, idempotencyId, orderType, eventDescriptor, null), 3, null);
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$unstakeAll$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$unstakeAll$1 */
    static final class C378241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiCurrencyPair $currencyPair;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ UUID $idempotencyId;
        final /* synthetic */ ApiCryptoStakingOrder.OrderType $orderType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C378241(UiCurrencyPair uiCurrencyPair, UUID uuid, ApiCryptoStakingOrder.OrderType orderType, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super C378241> continuation) {
            super(2, continuation);
            this.$currencyPair = uiCurrencyPair;
            this.$idempotencyId = uuid;
            this.$orderType = orderType;
            this.$eventDescriptor = userInteractionEventDescriptor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingInputDuxo.this.new C378241(this.$currencyPair, this.$idempotencyId, this.$orderType, this.$eventDescriptor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$unstakeAll$1$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$unstakeAll$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
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
            public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, 262127, null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
        
            if (r3.onReviewButtonClickInternal(r4, r5, r6, r7, r8, r9, r11) == r0) goto L19;
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
                CryptoStakingInputDuxo.this.applyMutation(new AnonymousClass1(null));
                Flow<CryptoStakingPosition> flowStreamPosition = CryptoStakingInputDuxo.this.cryptoStakingStore.streamPosition(this.$currencyPair.getId());
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamPosition, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CryptoStakingPosition cryptoStakingPosition = (CryptoStakingPosition) obj;
            if (cryptoStakingPosition == null) {
                return Unit.INSTANCE;
            }
            BigDecimal availableForWithdrawal = cryptoStakingPosition.getStaking().getAvailableForWithdrawal();
            ApiCryptoStakingOrder.AmountType amountType = ApiCryptoStakingOrder.AmountType.CRYPTOCURRENCY;
            CryptoStakingInputDuxo cryptoStakingInputDuxo = CryptoStakingInputDuxo.this;
            UiCurrencyPair uiCurrencyPair = this.$currencyPair;
            UUID uuid = this.$idempotencyId;
            ApiCryptoStakingOrder.OrderType orderType = this.$orderType;
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
            this.label = 2;
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClick$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClick$1 */
    static final class C378181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ ApiCryptoStakingOrder.AmountType $amountType;
        final /* synthetic */ UiCurrencyPair $currencyPair;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ UUID $idempotencyId;
        final /* synthetic */ ApiCryptoStakingOrder.OrderType $orderType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C378181(BigDecimal bigDecimal, ApiCryptoStakingOrder.AmountType amountType, UiCurrencyPair uiCurrencyPair, UUID uuid, ApiCryptoStakingOrder.OrderType orderType, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super C378181> continuation) {
            super(2, continuation);
            this.$amount = bigDecimal;
            this.$amountType = amountType;
            this.$currencyPair = uiCurrencyPair;
            this.$idempotencyId = uuid;
            this.$orderType = orderType;
            this.$eventDescriptor = userInteractionEventDescriptor;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingInputDuxo.this.new C378181(this.$amount, this.$amountType, this.$currencyPair, this.$idempotencyId, this.$orderType, this.$eventDescriptor, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClick$1$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClick$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
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
            public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, 262127, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoStakingInputDuxo.this.applyMutation(new AnonymousClass1(null));
                CryptoStakingInputDuxo cryptoStakingInputDuxo = CryptoStakingInputDuxo.this;
                BigDecimal bigDecimal = this.$amount;
                ApiCryptoStakingOrder.AmountType amountType = this.$amountType;
                UiCurrencyPair uiCurrencyPair = this.$currencyPair;
                UUID uuid = this.$idempotencyId;
                ApiCryptoStakingOrder.OrderType orderType = this.$orderType;
                UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                this.label = 1;
                if (cryptoStakingInputDuxo.onReviewButtonClickInternal(bigDecimal, amountType, uiCurrencyPair, uuid, orderType, userInteractionEventDescriptor, this) == coroutine_suspended) {
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

    public final void onReviewButtonClick(BigDecimal amount, ApiCryptoStakingOrder.AmountType amountType, UiCurrencyPair currencyPair, UUID idempotencyId, ApiCryptoStakingOrder.OrderType orderType, UserInteractionEventDescriptor eventDescriptor) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C378181(amount, amountType, currencyPair, idempotencyId, orderType, eventDescriptor, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onReviewButtonClickInternal(BigDecimal bigDecimal, ApiCryptoStakingOrder.AmountType amountType, UiCurrencyPair uiCurrencyPair, UUID uuid, ApiCryptoStakingOrder.OrderType orderType, UserInteractionEventDescriptor userInteractionEventDescriptor, Continuation<? super Unit> continuation) throws Throwable {
        C378191 c378191;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        Throwable th;
        UiCurrencyPair uiCurrencyPair2;
        ApiCryptoStakingOrder.OrderType orderType2;
        UUID uuid2;
        Throwable th2;
        CryptoApiErrorResponse cryptoApiErrorResponseM2777x31f43009;
        if (continuation instanceof C378191) {
            c378191 = (C378191) continuation;
            int i = c378191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c378191.label = i - Integer.MIN_VALUE;
            } else {
                c378191 = new C378191(continuation);
            }
        }
        C378191 c3781912 = c378191;
        Object objRequestOrder = c3781912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3781912.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRequestOrder);
            try {
                CryptoStakingStore cryptoStakingStore = this.cryptoStakingStore;
                UUID id = uiCurrencyPair.getId();
                c3781912.L$0 = uiCurrencyPair;
                c3781912.L$1 = uuid;
                c3781912.L$2 = orderType;
                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                try {
                    c3781912.L$3 = userInteractionEventDescriptor2;
                    c3781912.label = 1;
                    objRequestOrder = cryptoStakingStore.requestOrder(bigDecimal, amountType, id, uuid, orderType, c3781912);
                    if (objRequestOrder == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uuid2 = uuid;
                    orderType2 = orderType;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    uiCurrencyPair2 = uiCurrencyPair;
                    orderType2 = orderType;
                    th2 = th;
                    ErrorHandlingUtils.throwIfCancellation(th2);
                    cryptoApiErrorResponseM2777x31f43009 = m2777x31f43009(th2);
                    if (cryptoApiErrorResponseM2777x31f43009 != null) {
                    }
                    logNonFatal(th2, "submit_review", orderType2);
                    applyMutation(new C378213(null));
                    return Unit.INSTANCE;
                }
            } catch (Throwable th4) {
                th = th4;
                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor3 = (UserInteractionEventDescriptor) c3781912.L$3;
            orderType2 = (ApiCryptoStakingOrder.OrderType) c3781912.L$2;
            UUID uuid3 = (UUID) c3781912.L$1;
            uiCurrencyPair2 = (UiCurrencyPair) c3781912.L$0;
            try {
                ResultKt.throwOnFailure(objRequestOrder);
                userInteractionEventDescriptor2 = userInteractionEventDescriptor3;
                uuid2 = uuid3;
                uiCurrencyPair = uiCurrencyPair2;
            } catch (Throwable th5) {
                th2 = th5;
                userInteractionEventDescriptor2 = userInteractionEventDescriptor3;
                ErrorHandlingUtils.throwIfCancellation(th2);
                cryptoApiErrorResponseM2777x31f43009 = m2777x31f43009(th2);
                if (cryptoApiErrorResponseM2777x31f43009 != null) {
                    logInvalidInputErrorEvent(userInteractionEventDescriptor2, uiCurrencyPair2.getDisplaySymbol(), cryptoApiErrorResponseM2777x31f43009);
                    submit(new CryptoStakingInputEvent.InputError(cryptoApiErrorResponseM2777x31f43009));
                } else {
                    ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(th2);
                    String error = errorResponseExtractErrorResponse != null ? errorResponseExtractErrorResponse.getError() : null;
                    if (error == null) {
                        error = "";
                    }
                    logInputNetworkErrorEvent(userInteractionEventDescriptor2, error);
                    submit(new CryptoStakingInputEvent.Error(th2));
                }
                logNonFatal(th2, "submit_review", orderType2);
                applyMutation(new C378213(null));
                return Unit.INSTANCE;
            }
        }
        try {
            applyMutation(new C378202(null));
            submit(new CryptoStakingInputEvent.OrderRequested((UiCryptoStakingOrderModel) objRequestOrder, uuid2));
        } catch (Throwable th6) {
            th = th6;
            uiCurrencyPair2 = uiCurrencyPair;
            th2 = th;
            ErrorHandlingUtils.throwIfCancellation(th2);
            cryptoApiErrorResponseM2777x31f43009 = m2777x31f43009(th2);
            if (cryptoApiErrorResponseM2777x31f43009 != null) {
            }
            logNonFatal(th2, "submit_review", orderType2);
            applyMutation(new C378213(null));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClickInternal$2", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClickInternal$2 */
    static final class C378202 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C378202(Continuation<? super C378202> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378202 c378202 = new C378202(continuation);
            c378202.L$0 = obj;
            return c378202;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
            return ((C378202) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 262127, null);
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClickInternal$3", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onReviewButtonClickInternal$3 */
    static final class C378213 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C378213(Continuation<? super C378213> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378213 c378213 = new C378213(continuation);
            c378213.L$0 = obj;
            return c378213;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
            return ((C378213) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoStakingInputDataState.copy$default((CryptoStakingInputDataState) this.L$0, null, 0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, 262127, null);
        }
    }

    public final void onSuggestedAmountClick(BigDecimal suggestedAmount, SuggestedInputAmountState.Type type2, UiCurrencyPair currencyPair, UUID idempotencyId, ApiCryptoStakingOrder.OrderType orderType, UserInteractionEventDescriptor eventDescriptor) {
        Intrinsics.checkNotNullParameter(suggestedAmount, "suggestedAmount");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(eventDescriptor, "eventDescriptor");
        int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i == 1) {
            applyMutation(new C378221(suggestedAmount, null));
            onReviewButtonClick(suggestedAmount, ApiCryptoStakingOrder.AmountType.FIAT, currencyPair, idempotencyId, orderType, eventDescriptor);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            applyMutation(new C378232(suggestedAmount, null));
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onSuggestedAmountClick$1", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onSuggestedAmountClick$1 */
    static final class C378221 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
        final /* synthetic */ BigDecimal $suggestedAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C378221(BigDecimal bigDecimal, Continuation<? super C378221> continuation) {
            super(2, continuation);
            this.$suggestedAmount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378221 c378221 = new C378221(this.$suggestedAmount, continuation);
            c378221.L$0 = obj;
            return c378221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
            return ((C378221) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CryptoStakingInputDataState) this.L$0).mutateWithFiatAmount(this.$suggestedAmount);
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onSuggestedAmountClick$2", m3645f = "CryptoStakingInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo$onSuggestedAmountClick$2 */
    static final class C378232 extends ContinuationImpl7 implements Function2<CryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState>, Object> {
        final /* synthetic */ BigDecimal $suggestedAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C378232(BigDecimal bigDecimal, Continuation<? super C378232> continuation) {
            super(2, continuation);
            this.$suggestedAmount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C378232 c378232 = new C378232(this.$suggestedAmount, continuation);
            c378232.L$0 = obj;
            return c378232;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoStakingInputDataState cryptoStakingInputDataState, Continuation<? super CryptoStakingInputDataState> continuation) {
            return ((C378232) create(cryptoStakingInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CryptoStakingInputDataState) this.L$0).mutateWithPercentage(this.$suggestedAmount.floatValue());
        }
    }

    private final void logInvalidInputErrorEvent(UserInteractionEventDescriptor eventDescriptor, String currencySymbol, CryptoApiErrorResponse inputError) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Context.ProductTag productTag = null;
        int i4 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Screen screen = null;
        String str8 = null;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.APPEAR, eventDescriptor.getScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, inputError.getAlertAction().getAlert().getTitle(), null, 4, null), null, new Context(i, i2, i3, str, str2, str3, str4, productTag, i4, str5, str6, str7, screen, str8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CryptoStakingContext(currencySymbol, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 510, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -536870913, -1, 16383, null), null, null, 104, null), false, false, 6, null);
    }

    private final void logInputNetworkErrorEvent(UserInteractionEventDescriptor eventDescriptor, String errorResponse) {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, eventDescriptor.getScreen(), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AlertContext("Error", errorResponse, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2097153, -1, -1, -1, 16383, null), 9, null);
    }

    static /* synthetic */ void logNonFatal$default(CryptoStakingInputDuxo cryptoStakingInputDuxo, Throwable th, String str, ApiCryptoStakingOrder.OrderType orderType, int i, Object obj) {
        if ((i & 4) != 0) {
            orderType = null;
        }
        cryptoStakingInputDuxo.logNonFatal(th, str, orderType);
    }

    private final void logNonFatal(Throwable t, String step, ApiCryptoStakingOrder.OrderType orderType) {
        StakingCrashReporter.logNonFatal$default(StakingCrashReporter.INSTANCE, t, "order_amount_input", step, orderType, null, 16, null);
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$InitArgs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "orderType", "Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "idempotencyId", "prefilledAssetAmount", "Ljava/math/BigDecimal;", "entryPointIdentifier", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getOrderType", "()Lcom/robinhood/models/api/staking/ApiCryptoStakingOrder$OrderType;", "getIdempotencyId", "getPrefilledAssetAmount", "()Ljava/math/BigDecimal;", "getEntryPointIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final String entryPointIdentifier;
        private final UUID idempotencyId;
        private final ApiCryptoStakingOrder.OrderType orderType;
        private final BigDecimal prefilledAssetAmount;

        /* compiled from: CryptoStakingInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable(), ApiCryptoStakingOrder.OrderType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, ApiCryptoStakingOrder.OrderType orderType, UUID uuid2, BigDecimal bigDecimal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.currencyPairId;
            }
            if ((i & 2) != 0) {
                orderType = initArgs.orderType;
            }
            if ((i & 4) != 0) {
                uuid2 = initArgs.idempotencyId;
            }
            if ((i & 8) != 0) {
                bigDecimal = initArgs.prefilledAssetAmount;
            }
            if ((i & 16) != 0) {
                str = initArgs.entryPointIdentifier;
            }
            String str2 = str;
            UUID uuid3 = uuid2;
            return initArgs.copy(uuid, orderType, uuid3, bigDecimal, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCryptoStakingOrder.OrderType getOrderType() {
            return this.orderType;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getIdempotencyId() {
            return this.idempotencyId;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getPrefilledAssetAmount() {
            return this.prefilledAssetAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final InitArgs copy(UUID currencyPairId, ApiCryptoStakingOrder.OrderType orderType, UUID idempotencyId, BigDecimal prefilledAssetAmount, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
            return new InitArgs(currencyPairId, orderType, idempotencyId, prefilledAssetAmount, entryPointIdentifier);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.currencyPairId, initArgs.currencyPairId) && this.orderType == initArgs.orderType && Intrinsics.areEqual(this.idempotencyId, initArgs.idempotencyId) && Intrinsics.areEqual(this.prefilledAssetAmount, initArgs.prefilledAssetAmount) && Intrinsics.areEqual(this.entryPointIdentifier, initArgs.entryPointIdentifier);
        }

        public int hashCode() {
            int iHashCode = ((((this.currencyPairId.hashCode() * 31) + this.orderType.hashCode()) * 31) + this.idempotencyId.hashCode()) * 31;
            BigDecimal bigDecimal = this.prefilledAssetAmount;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str = this.entryPointIdentifier;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "InitArgs(currencyPairId=" + this.currencyPairId + ", orderType=" + this.orderType + ", idempotencyId=" + this.idempotencyId + ", prefilledAssetAmount=" + this.prefilledAssetAmount + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.orderType.name());
            dest.writeSerializable(this.idempotencyId);
            dest.writeSerializable(this.prefilledAssetAmount);
            dest.writeString(this.entryPointIdentifier);
        }

        public InitArgs(UUID currencyPairId, ApiCryptoStakingOrder.OrderType orderType, UUID idempotencyId, BigDecimal bigDecimal, String str) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
            this.currencyPairId = currencyPairId;
            this.orderType = orderType;
            this.idempotencyId = idempotencyId;
            this.prefilledAssetAmount = bigDecimal;
            this.entryPointIdentifier = str;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final ApiCryptoStakingOrder.OrderType getOrderType() {
            return this.orderType;
        }

        public final UUID getIdempotencyId() {
            return this.idempotencyId;
        }

        public final BigDecimal getPrefilledAssetAmount() {
            return this.prefilledAssetAmount;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }
    }

    /* compiled from: CryptoStakingInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$InitArgs;", "<init>", "()V", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoStakingInputDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(CryptoStakingInputDuxo cryptoStakingInputDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoStakingInputDuxo);
        }
    }
}
