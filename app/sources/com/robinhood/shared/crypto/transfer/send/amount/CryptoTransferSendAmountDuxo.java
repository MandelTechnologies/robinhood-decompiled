package com.robinhood.shared.crypto.transfer.send.amount;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoQuoteStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ErrorResponse3;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferLimits;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferWithdrawal;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.transfers.CryptoTransferVerificationIntentKey;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountEvent;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountFragment;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.formats.crypto.CryptoInstrumentInputHelper;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.BiPredicate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAmountDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001CB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001bJJ\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010*2\b\u00100\u001a\u0004\u0018\u00010*2\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u000205H\u0002J\u001d\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020*H\u0001¢\u0006\u0002\b;J\u0010\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020$H\u0002J\u0006\u0010>\u001a\u00020\u001bJ\u0006\u0010?\u001a\u00020\u001bJ\u000e\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020BR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006D"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoQuoteStore", "Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;Lcom/robinhood/librobinhood/data/store/CryptoQuoteStore;Lcom/robinhood/shared/app/type/AppType;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "value", "", "verifying", "getVerifying", "()Z", "setVerifying", "(Z)V", "onStart", "", "checkForInsufficientHoldings", "config", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferConfig;", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "changeCryptoInputMode", "mode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "sendAll", "prepareWithdrawal", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", PlaceTypes.ADDRESS, "", "amount", "Ljava/math/BigDecimal;", "isAmountInFiat", "isFullAmountBeingSent", "networkCode", "addressTag", "loggingSessionId", "Ljava/util/UUID;", "warnWithdrawal", "withdrawal", "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferWithdrawal;", "wrapThrowable", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$CryptoValidationErrorWrapper;", "t", "", "assetCurrencyCode", "wrapThrowable$feature_crypto_transfer_externalDebug", "updateToolbarItemEvent", "cryptoInputMode", "showCryptoInputModeSelector", "resetAmountOverLimitErrorState", "saveAmountState", "amountState", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$AmountState;", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendAmountDuxo extends BaseDuxo5<CryptoTransferSendAmountViewState, CryptoTransferSendAmountEvent> implements HasSavedState {
    private static final String SAVED_AMOUNT_STATE_KEY = "saved_amount_state_key";
    private static final String VERIFYING = "verifying_handle_key";
    private final CryptoQuoteStore cryptoQuoteStore;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorResponse3.ErrorCode.values().length];
            try {
                iArr[ErrorResponse3.ErrorCode.WITHDRAWAL_AMOUNT_TOO_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INSUFFICENT_FUNDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.LIMIT_EXCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.HIGH_AMOUNT_RISK_REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_WITHDRAWAL_ADDRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.WITHDRAWAL_RESTRICTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_OR_EXPIRED_FEE_TOKEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.DEPOSIT_RESTRICTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.SERVICE_UNAVAILABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.USER_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.MFA_STATE_INVALID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.RISK_REJECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.NO_CRYPTO_ACCOUNT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.INVALID_DEPOSIT_TO_REFUND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.MISSING_MARITAL_OR_DEPENDENTS_INFO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.GENERIC_1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ErrorResponse3.ErrorCode.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public CryptoTransferSendAmountDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoTransfersStore cryptoTransfersStore, CryptoQuoteStore cryptoQuoteStore, AppType appType) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoQuoteStore, "cryptoQuoteStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Companion companion = INSTANCE;
        CryptoTransferSendAmountFragment.Args args = (CryptoTransferSendAmountFragment.Args) companion.getArgs(savedStateHandle);
        CryptoInstrumentInputHelper cryptoInstrumentInputHelper = new CryptoInstrumentInputHelper(args.getUiCurrencyPair());
        BigDecimal bigDecimal = new BigDecimal("0");
        BigDecimal previouslySavedCryptoAmount = args.getPreviouslySavedCryptoAmount();
        if (previouslySavedCryptoAmount == null) {
            CryptoTransferSendAmountViewState.AmountState amountState = (CryptoTransferSendAmountViewState.AmountState) savedStateHandle.get(SAVED_AMOUNT_STATE_KEY);
            previouslySavedCryptoAmount = amountState != null ? amountState.getCryptoAmount() : null;
            if (previouslySavedCryptoAmount == null) {
                previouslySavedCryptoAmount = bigDecimal;
            }
        }
        Tuples2 tuples2ProcessAmount$default = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, previouslySavedCryptoAmount, null, CryptoInputMode.ASSET_CURRENCY, true, false, false, false, 114, null);
        String str = (String) tuples2ProcessAmount$default.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2ProcessAmount$default.component2();
        BigDecimal previouslySavedFiatAmount = args.getPreviouslySavedFiatAmount();
        if (previouslySavedFiatAmount == null) {
            CryptoTransferSendAmountViewState.AmountState amountState2 = (CryptoTransferSendAmountViewState.AmountState) savedStateHandle.get(SAVED_AMOUNT_STATE_KEY);
            previouslySavedFiatAmount = amountState2 != null ? amountState2.getFiatAmount() : null;
            if (previouslySavedFiatAmount == null) {
                previouslySavedFiatAmount = bigDecimal;
            }
        }
        CryptoInputMode cryptoInputMode = CryptoInputMode.QUOTE_CURRENCY;
        Tuples2 tuples2ProcessAmount$default2 = CryptoInstrumentInputHelper.processAmount$default(cryptoInstrumentInputHelper, previouslySavedFiatAmount, RoundingMode.HALF_UP, cryptoInputMode, false, false, false, false, 120, null);
        String str2 = (String) tuples2ProcessAmount$default2.component1();
        BigDecimal bigDecimal3 = (BigDecimal) tuples2ProcessAmount$default2.component2();
        UiCurrencyPair uiCurrencyPair = args.getUiCurrencyPair();
        CryptoInputMode cryptoInputMode2 = null;
        String addressTag = args.getAddressTag();
        CryptoInputMode previouslySavedCryptoInputMode = args.getPreviouslySavedCryptoInputMode();
        if (previouslySavedCryptoInputMode == null) {
            CryptoTransferSendAmountViewState.AmountState amountState3 = (CryptoTransferSendAmountViewState.AmountState) savedStateHandle.get(SAVED_AMOUNT_STATE_KEY);
            cryptoInputMode2 = amountState3 != null ? amountState3.getCryptoInputMode() : cryptoInputMode2;
            previouslySavedCryptoInputMode = cryptoInputMode2 == null ? cryptoInputMode : cryptoInputMode2;
        }
        super(new CryptoTransferSendAmountViewState(false, 0, addressTag, appType, previouslySavedCryptoInputMode, bigDecimal2, bigDecimal3, false, uiCurrencyPair, null, null, null, cryptoInstrumentInputHelper, str, str2, args.getSelectedNetwork(), 3712, null), duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoQuoteStore = cryptoQuoteStore;
        CryptoInputMode previouslySavedCryptoInputMode2 = ((CryptoTransferSendAmountFragment.Args) companion.getArgs((HasSavedState) this)).getPreviouslySavedCryptoInputMode();
        updateToolbarItemEvent(previouslySavedCryptoInputMode2 == null ? cryptoInputMode : previouslySavedCryptoInputMode2);
    }

    private final void setVerifying(boolean z) {
        getSavedStateHandle().set(VERIFYING, Boolean.valueOf(z));
    }

    private final boolean getVerifying() {
        return Intrinsics.areEqual(getSavedStateHandle().get(VERIFYING), Boolean.TRUE);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        if (!getVerifying()) {
            applyMutation(new C383061(null));
            LifecycleHost.DefaultImpls.bind$default(this, CryptoTransfersStore.streamTransferConfig$default(this.cryptoTransfersStore, CryptoTransferAction.SEND, ((CryptoTransferSendAmountFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiCurrencyPair().getAssetCurrency(), null, 4, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendAmountDuxo.onStart$lambda$1(this.f$0, (CryptoTransferConfig) obj);
                }
            });
        }
        Observable<CryptoQuote> observableDistinctUntilChanged = this.cryptoQuoteStore.getPollCryptoQuote().asObservable(new CryptoQuoteStore.CryptoQuoteArgs(((CryptoTransferSendAmountFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getUiCurrencyPair().getId(), null, null, 6, null)).distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo.onStart.3
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(CryptoQuote r1, CryptoQuote r2) {
                Intrinsics.checkNotNullParameter(r1, "r1");
                Intrinsics.checkNotNullParameter(r2, "r2");
                return Intrinsics.areEqual(r1.getMarkPrice(), r2.getMarkPrice());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendAmountDuxo.onStart$lambda$2(this.f$0, (CryptoQuote) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoTransfersStore.streamLimits(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendAmountDuxo.onStart$lambda$3(this.f$0, (CryptoTransferLimits) obj);
            }
        });
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$onStart$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$onStart$1 */
    static final class C383061 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383061(Continuation<? super C383061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383061 c383061 = new C383061(continuation);
            c383061.L$0 = obj;
            return c383061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
            return ((C383061) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendAmountViewState.copy$default((CryptoTransferSendAmountViewState) this.L$0, true, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 65534, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo2(it, null));
        cryptoTransferSendAmountDuxo.checkForInsufficientHoldings(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoQuote cryptoQuote) {
        cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo3(cryptoQuote, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferLimits it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo4(it, null));
        return Unit.INSTANCE;
    }

    private final void checkForInsufficientHoldings(CryptoTransferConfig config) {
        int i;
        if (BigDecimals7.isZero(config.getTransferableQuantity())) {
            Companion companion = INSTANCE;
            boolean isFromGateway = ((CryptoTransferSendAmountFragment.Args) companion.getArgs((HasSavedState) this)).getIsFromGateway();
            StringResource.Companion companion2 = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion2.invoke(C37934R.string.crypto_send_error_message, ((CryptoTransferSendAmountFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getAssetCurrency().getCode());
            StringResource stringResourceInvoke2 = companion2.invoke(C37934R.string.crypto_send_error_buy_action, ((CryptoTransferSendAmountFragment.Args) companion.getArgs((HasSavedState) this)).getUiCurrencyPair().getAssetCurrency().getCode());
            if (((CryptoTransferSendAmountFragment.Args) companion.getArgs((HasSavedState) this)).getIsFromGateway()) {
                i = C37934R.string.crypto_send_error_back_to_wallet;
            } else {
                i = C11048R.string.general_label_not_now;
            }
            submit(new CryptoTransferSendAmountEvent.InsufficientHoldings(isFromGateway, stringResourceInvoke, stringResourceInvoke2, companion2.invoke(i, new Object[0])));
        }
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$consumeKeyEvent$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$consumeKeyEvent$1 */
    static final class C383051 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C383051(KeyEvent keyEvent, Continuation<? super C383051> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383051 c383051 = new C383051(this.$keyEvent, continuation);
            c383051.L$0 = obj;
            return c383051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
            return ((C383051) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((CryptoTransferSendAmountViewState) this.L$0).mutateWith(this.$keyEvent);
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C383051(keyEvent, null));
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$changeCryptoInputMode$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$changeCryptoInputMode$1 */
    static final class C383041 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
        final /* synthetic */ CryptoInputMode $mode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C383041(CryptoInputMode cryptoInputMode, Continuation<? super C383041> continuation) {
            super(2, continuation);
            this.$mode = cryptoInputMode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383041 c383041 = new C383041(this.$mode, continuation);
            c383041.L$0 = obj;
            return c383041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
            return ((C383041) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendAmountViewState.copy$default((CryptoTransferSendAmountViewState) this.L$0, false, 0, null, null, this.$mode, null, null, false, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    public final void changeCryptoInputMode(CryptoInputMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        applyMutation(new C383041(mode, null));
        updateToolbarItemEvent(mode);
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$sendAll$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$sendAll$1 */
    static final class C383101 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383101(Continuation<? super C383101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383101 c383101 = CryptoTransferSendAmountDuxo.this.new C383101(continuation);
            c383101.L$0 = obj;
            return c383101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
            return ((C383101) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoTransferSendAmountViewState cryptoTransferSendAmountViewStateMutateToSendAll = ((CryptoTransferSendAmountViewState) this.L$0).mutateToSendAll();
            CryptoTransferSendAmountDuxo.this.updateToolbarItemEvent(cryptoTransferSendAmountViewStateMutateToSendAll.getCryptoInputMode());
            return cryptoTransferSendAmountViewStateMutateToSendAll;
        }
    }

    public final void sendAll() {
        applyMutation(new C383101(null));
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$prepareWithdrawal$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$prepareWithdrawal$1 */
    static final class C383081 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383081(Continuation<? super C383081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383081 c383081 = new C383081(continuation);
            c383081.L$0 = obj;
            return c383081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
            return ((C383081) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendAmountViewState.copy$default((CryptoTransferSendAmountViewState) this.L$0, true, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 65534, null);
        }
    }

    public final void prepareWithdrawal(final UiCurrencyPair uiCurrencyPair, String address, BigDecimal amount, boolean isAmountInFiat, boolean isFullAmountBeingSent, String networkCode, String addressTag, final UUID loggingSessionId) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(loggingSessionId, "loggingSessionId");
        applyMutation(new C383081(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.cryptoTransfersStore.prepareWithdrawal(address, amount, isAmountInFiat, uiCurrencyPair, !isFullAmountBeingSent, networkCode, addressTag, loggingSessionId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendAmountDuxo.prepareWithdrawal$lambda$5(this.f$0, uiCurrencyPair, loggingSessionId, (CryptoTransferWithdrawal) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendAmountDuxo.prepareWithdrawal$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareWithdrawal$lambda$5(final CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, UiCurrencyPair uiCurrencyPair, UUID uuid, final CryptoTransferWithdrawal withdrawal) {
        Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
        cryptoTransferSendAmountDuxo.setVerifying(Intrinsics.areEqual(withdrawal.getOwnershipVerificationRequired(), Boolean.TRUE) && withdrawal.getOwnershipVerificationId() != null);
        if (cryptoTransferSendAmountDuxo.getVerifying()) {
            cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo5(null));
            CryptoTransferVerificationIntentKey.LoggingContext loggingContext = new CryptoTransferVerificationIntentKey.LoggingContext(uiCurrencyPair.getAssetCurrency().getId(), uuid, withdrawal.getWithdrawalId());
            UUID ownershipVerificationId = withdrawal.getOwnershipVerificationId();
            if (ownershipVerificationId == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            cryptoTransferSendAmountDuxo.submit(new CryptoTransferSendAmountEvent.VerifyAddressOwnership(new CryptoTransferVerificationIntentKey.Withdrawal(loggingContext, ownershipVerificationId)));
        } else if (withdrawal.getPreReviewSheet() != null) {
            cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo6(null));
            cryptoTransferSendAmountDuxo.warnWithdrawal(withdrawal);
        } else {
            cryptoTransferSendAmountDuxo.withDataState(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendAmountDuxo.prepareWithdrawal$lambda$5$lambda$4(this.f$0, withdrawal, (CryptoTransferSendAmountViewState) obj);
                }
            });
            cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo7(null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareWithdrawal$lambda$5$lambda$4(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferWithdrawal cryptoTransferWithdrawal, CryptoTransferSendAmountViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        cryptoTransferSendAmountDuxo.submit(new CryptoTransferSendAmountEvent.WithdrawalPrepared(new CryptoTransferSendAmountViewState.WithdrawalAttempt(state.getCryptoInputMode(), state.getCryptoAmount(), state.getFiatAmount(), cryptoTransferWithdrawal, state.isFullAmount())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit prepareWithdrawal$lambda$6(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            cryptoTransferSendAmountDuxo.applyMutation(new CryptoTransferSendAmountDuxo8(null));
            cryptoTransferSendAmountDuxo.submit(new CryptoTransferSendAmountEvent.InputErrorEvent(cryptoTransferSendAmountDuxo.wrapThrowable$feature_crypto_transfer_externalDebug(t, ((CryptoTransferSendAmountFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoTransferSendAmountDuxo)).getUiCurrencyPair().getAssetCurrency().getCode())));
            return Unit.INSTANCE;
        }
        throw t;
    }

    private final void warnWithdrawal(final CryptoTransferWithdrawal withdrawal) {
        final ApiCryptoTransferWithdrawal.PreReviewBottomSheet preReviewSheet = withdrawal.getPreReviewSheet();
        if (preReviewSheet != null) {
            withDataState(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoTransferSendAmountDuxo.warnWithdrawal$lambda$7(this.f$0, withdrawal, preReviewSheet, (CryptoTransferSendAmountViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit warnWithdrawal$lambda$7(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferWithdrawal cryptoTransferWithdrawal, ApiCryptoTransferWithdrawal.PreReviewBottomSheet preReviewBottomSheet, CryptoTransferSendAmountViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        cryptoTransferSendAmountDuxo.submit(new CryptoTransferSendAmountEvent.ShowWarnSheet(new CryptoTransferSendAmountViewState.CryptoTransferSendWarningSheetState(new CryptoTransferSendAmountViewState.WithdrawalAttempt(state.getCryptoInputMode(), state.getCryptoAmount(), state.getFiatAmount(), cryptoTransferWithdrawal, state.isFullAmount()), preReviewBottomSheet)));
        return Unit.INSTANCE;
    }

    public final CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper wrapThrowable$feature_crypto_transfer_externalDebug(Throwable t, String assetCurrencyCode) {
        boolean z;
        Integer numValueOf;
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(t, "t");
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(t);
        ErrorResponse3 errorResponse3 = errorResponseExtractErrorResponse instanceof ErrorResponse3 ? (ErrorResponse3) errorResponseExtractErrorResponse : null;
        ErrorResponse3.ErrorCode error_code = errorResponse3 != null ? errorResponse3.getError_code() : null;
        switch (error_code == null ? -1 : WhenMappings.$EnumSwitchMapping$0[error_code.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                z = true;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                z = false;
                break;
        }
        ErrorResponse3.ErrorCode error_code2 = errorResponse3 != null ? errorResponse3.getError_code() : null;
        int i = error_code2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[error_code2.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            numValueOf = Integer.valueOf(C37934R.string.crypto_send_error_cta);
        } else {
            numValueOf = i != 5 ? null : Integer.valueOf(C37934R.string.crypto_send_address_error_btn);
        }
        ErrorResponse3.ErrorCode error_code3 = errorResponse3 != null ? errorResponse3.getError_code() : null;
        int i2 = error_code3 != null ? WhenMappings.$EnumSwitchMapping$0[error_code3.ordinal()] : -1;
        if (i2 == 3) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C37934R.string.crypto_amount_exceeds_limit, new Object[0]);
        } else if (i2 == 4) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C37934R.string.crypto_high_amount_risk, new Object[0]);
        } else {
            stringResourceInvoke = i2 != 5 ? null : StringResource.INSTANCE.invoke(C37934R.string.crypto_send_address_error_title, assetCurrencyCode);
        }
        return new CryptoTransferSendAmountViewState.CryptoValidationErrorWrapper(stringResourceInvoke, numValueOf, errorResponse3 != null ? errorResponse3.getError_title() : null, errorResponse3 != null ? errorResponse3.getError_code() : null, errorResponse3 != null ? errorResponse3.getRedirect_deep_link() : null, z, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateToolbarItemEvent(final CryptoInputMode cryptoInputMode) {
        withDataState(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendAmountDuxo.updateToolbarItemEvent$lambda$8(this.f$0, cryptoInputMode, (CryptoTransferSendAmountViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateToolbarItemEvent$lambda$8(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoInputMode cryptoInputMode, CryptoTransferSendAmountViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        cryptoTransferSendAmountDuxo.submit(new CryptoTransferSendAmountEvent.UpdateToolbarItem(state.codeForInputMode(cryptoInputMode)));
        return Unit.INSTANCE;
    }

    public final void showCryptoInputModeSelector() {
        withDataState(new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferSendAmountDuxo.showCryptoInputModeSelector$lambda$9(this.f$0, (CryptoTransferSendAmountViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCryptoInputModeSelector$lambda$9(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo, CryptoTransferSendAmountViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        cryptoTransferSendAmountDuxo.submit(new CryptoTransferSendAmountEvent.ShowInputModeSelector(new InputModeSelectorSheetContentState(((CryptoTransferSendAmountFragment.Args) INSTANCE.getArgs((HasSavedState) cryptoTransferSendAmountDuxo)).getUiCurrencyPair(), state.getAppType())));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$resetAmountOverLimitErrorState$1", m3645f = "CryptoTransferSendAmountDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountDuxo$resetAmountOverLimitErrorState$1 */
    static final class C383091 extends ContinuationImpl7 implements Function2<CryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C383091(Continuation<? super C383091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C383091 c383091 = new C383091(continuation);
            c383091.L$0 = obj;
            return c383091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTransferSendAmountViewState cryptoTransferSendAmountViewState, Continuation<? super CryptoTransferSendAmountViewState> continuation) {
            return ((C383091) create(cryptoTransferSendAmountViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTransferSendAmountViewState.copy$default((CryptoTransferSendAmountViewState) this.L$0, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    public final void resetAmountOverLimitErrorState() {
        applyMutation(new C383091(null));
    }

    public final void saveAmountState(CryptoTransferSendAmountViewState.AmountState amountState) {
        Intrinsics.checkNotNullParameter(amountState, "amountState");
        getSavedStateHandle().set(SAVED_AMOUNT_STATE_KEY, amountState);
    }

    /* compiled from: CryptoTransferSendAmountDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountDuxo;", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountFragment$Args;", "<init>", "()V", "VERIFYING", "", "SAVED_AMOUNT_STATE_KEY", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTransferSendAmountDuxo, CryptoTransferSendAmountFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSendAmountFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTransferSendAmountFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTransferSendAmountFragment.Args getArgs(CryptoTransferSendAmountDuxo cryptoTransferSendAmountDuxo) {
            return (CryptoTransferSendAmountFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTransferSendAmountDuxo);
        }
    }
}
