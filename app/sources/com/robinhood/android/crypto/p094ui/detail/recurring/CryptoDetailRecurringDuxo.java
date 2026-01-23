package com.robinhood.android.crypto.p094ui.detail.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringEvent;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.regiongate.RecurringInvestmentRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.fee.CryptoOrderMonetizationModel;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.store.base.InstrumentRecurringTradabilityStore;
import com.robinhood.store.base.InvestmentScheduleStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoDetailRecurringDuxo.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001*Bq\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010&\u001a\u00020'H\u0016J\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020'R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringViewState;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo$InitArgs;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringStateProvider;", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "investmentScheduleStore", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringStateProvider;Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/store/base/InvestmentScheduleStore;Lcom/robinhood/store/base/InstrumentRecurringTradabilityStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "args", "onCreate", "", "onLaunchRecurringClicked", "onFeeUnsupportedRecurringAlertContinue", "InitArgs", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailRecurringDuxo extends BaseDuxo3<CryptoDetailRecurringDataState, CryptoDetailRecurringViewState, CryptoDetailRecurringEvent> implements HasArgs<InitArgs> {
    public static final int $stable = 8;
    private final InitArgs args;
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider;
    private final CurrencyPairV2Store currencyPairStore;
    private final InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore;
    private final InvestmentScheduleKeyResolver investmentScheduleKeyResolver;
    private final InvestmentScheduleStore investmentScheduleStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDetailRecurringDuxo(AppType appType, DuxoBundle duxoBundle, CryptoDetailRecurringStateProvider stateProvider, InvestmentScheduleKeyResolver investmentScheduleKeyResolver, CryptoAccountProvider cryptoAccountProvider, CryptoHoldingStore cryptoHoldingStore, InvestmentScheduleStore investmentScheduleStore, InstrumentRecurringTradabilityStore instrumentRecurringTradabilityStore, RegionGateProvider regionGateProvider, CurrencyPairV2Store currencyPairStore, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle) {
        super(new CryptoDetailRecurringDataState(null, null, null, null, false, false, false, null, appType, investmentScheduleKeyResolver, null, 1279, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "investmentScheduleKeyResolver");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.regionGateProvider = regionGateProvider;
        this.currencyPairStore = currencyPairStore;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.args = (InitArgs) getArgs(getSavedStateHandle());
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C134511(null), 3, null);
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C134522(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134533(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134544(null));
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, RecurringInvestmentRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailRecurringDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134556(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134567(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C134578(null), 3, null);
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C134589(null));
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$1 */
    static final class C134511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134511(Continuation<? super C134511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134511(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoDetailRecurringDuxo.this.currencyPairStore.streamCurrencyPair(CryptoDetailRecurringDuxo.this.args.getCurrencyPairId())), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$1$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497881 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497881(UiCurrencyPair uiCurrencyPair, Continuation<? super C497881> continuation) {
                    super(2, continuation);
                    this.$it = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497881 c497881 = new C497881(this.$it, continuation);
                    c497881.L$0 = obj;
                    return c497881;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497881) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, this.$it, null, null, null, false, false, false, null, null, null, null, 2046, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497881((UiCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$2", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$2 */
    static final class C134522 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134522(Continuation<? super C134522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134522(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiCryptoHolding> flowStreamCryptoHoldingsForCurrencyPairId = CryptoDetailRecurringDuxo.this.cryptoHoldingStore.streamCryptoHoldingsForCurrencyPairId(new CryptoAccountSwitcherLocation.Detail(CryptoDetailRecurringDuxo.this.args.getCurrencyPairId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoHoldingsForCurrencyPairId, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "holding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$2$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCryptoHolding, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCryptoHolding uiCryptoHolding, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCryptoHolding, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$2$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497891 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ UiCryptoHolding $holding;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497891(UiCryptoHolding uiCryptoHolding, Continuation<? super C497891> continuation) {
                    super(2, continuation);
                    this.$holding = uiCryptoHolding;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497891 c497891 = new C497891(this.$holding, continuation);
                    c497891.L$0 = obj;
                    return c497891;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497891) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, this.$holding, null, null, false, false, false, null, null, null, null, 2045, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497891((UiCryptoHolding) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$3", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$3 */
    static final class C134533 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134533(Continuation<? super C134533> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134533(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134533) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<InvestmentSchedule>> flowStreamInvestmentSchedulesBySelectedAccount = CryptoDetailRecurringDuxo.this.investmentScheduleStore.streamInvestmentSchedulesBySelectedAccount(new CryptoAccountSwitcherLocation.Detail(CryptoDetailRecurringDuxo.this.args.getCurrencyPairId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamInvestmentSchedulesBySelectedAccount, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "schedules", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$3$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends InvestmentSchedule>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends InvestmentSchedule> list, Continuation<? super Unit> continuation) {
                return invoke2((List<InvestmentSchedule>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<InvestmentSchedule> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$3$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497901 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ List<InvestmentSchedule> $schedules;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497901(List<InvestmentSchedule> list, Continuation<? super C497901> continuation) {
                    super(2, continuation);
                    this.$schedules = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497901 c497901 = new C497901(this.$schedules, continuation);
                    c497901.L$0 = obj;
                    return c497901;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497901) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, null, this.$schedules, null, false, false, false, null, null, null, null, 2043, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497901((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$4", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$4 */
    static final class C134544 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134544(Continuation<? super C134544> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134544(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134544) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<InstrumentRecurringTradability> flowStreamRecurringInstrumentTradableByAssetType = CryptoDetailRecurringDuxo.this.instrumentRecurringTradabilityStore.streamRecurringInstrumentTradableByAssetType(InstrumentRecurringTradabilityStore.AssetType.CRYPTO, CryptoDetailRecurringDuxo.this.args.getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamRecurringInstrumentTradableByAssetType, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "recurringTradability", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$4$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentRecurringTradability, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentRecurringTradability instrumentRecurringTradability, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(instrumentRecurringTradability, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$4$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497911 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ InstrumentRecurringTradability $recurringTradability;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497911(InstrumentRecurringTradability instrumentRecurringTradability, Continuation<? super C497911> continuation) {
                    super(2, continuation);
                    this.$recurringTradability = instrumentRecurringTradability;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497911 c497911 = new C497911(this.$recurringTradability, continuation);
                    c497911.L$0 = obj;
                    return c497911;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497911) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, null, null, this.$recurringTradability, false, false, false, null, null, null, null, 2039, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497911((InstrumentRecurringTradability) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, boolean z) {
        cryptoDetailRecurringDuxo.applyMutation(new CryptoDetailRecurringDuxo2(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$6", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$6 */
    static final class C134556 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134556(Continuation<? super C134556> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134556(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134556) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoEuRecurringExperiment = CryptoDetailRecurringDuxo.this.cryptoExperimentsStore.streamCryptoEuRecurringExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoEuRecurringExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$6$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$6$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$6$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497921 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497921(boolean z, Continuation<? super C497921> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497921 c497921 = new C497921(this.$it, continuation);
                    c497921.L$0 = obj;
                    return c497921;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497921) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, null, null, null, false, this.$it, false, null, null, null, null, 2015, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497921(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$7", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$7 */
    static final class C134567 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134567(Continuation<? super C134567> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134567(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134567) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowStreamCryptoRecurringOrdersVTExperiment = CryptoDetailRecurringDuxo.this.cryptoExperimentsStore.streamCryptoRecurringOrdersVTExperiment();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCryptoRecurringOrdersVTExperiment, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$7$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$7$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$7$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497931 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497931(boolean z, Continuation<? super C497931> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497931 c497931 = new C497931(this.$it, continuation);
                    c497931.L$0 = obj;
                    return c497931;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497931) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, null, null, null, false, false, this.$it, null, null, null, null, 1983, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497931(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$8", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$8 */
    static final class C134578 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134578(Continuation<? super C134578> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134578(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134578) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$8$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
            int I$0;
            int I$1;
            int I$2;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                return ((AnonymousClass1) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object obj2;
                int i;
                int i2;
                CryptoDetailRecurringDataState cryptoDetailRecurringDataState;
                int i3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.label;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoDetailRecurringDataState cryptoDetailRecurringDataState2 = (CryptoDetailRecurringDataState) this.L$0;
                    CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = this.this$0.cryptoOrderMonetizationModelProvider;
                    UUID currencyPairId = this.this$0.args.getCurrencyPairId();
                    this.L$0 = cryptoDetailRecurringDataState2;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    obj2 = cryptoOrderMonetizationModelProvider.get(currencyPairId, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 0;
                    i2 = 0;
                    cryptoDetailRecurringDataState = cryptoDetailRecurringDataState2;
                    i3 = 0;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$2;
                    int i5 = this.I$1;
                    int i6 = this.I$0;
                    CryptoDetailRecurringDataState cryptoDetailRecurringDataState3 = (CryptoDetailRecurringDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    cryptoDetailRecurringDataState = cryptoDetailRecurringDataState3;
                    i3 = i6;
                    i2 = i5;
                    obj2 = obj;
                }
                return CryptoDetailRecurringDataState.copy$default(cryptoDetailRecurringDataState, null, null, null, null, i3 != 0, i2 != 0, i != 0, (CryptoOrderMonetizationModel) obj2, null, null, null, 1919, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo = CryptoDetailRecurringDuxo.this;
            cryptoDetailRecurringDuxo.applyMutation(new AnonymousClass1(cryptoDetailRecurringDuxo, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$9", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$9 */
    static final class C134589 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134589(Continuation<? super C134589> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDetailRecurringDuxo.this.new C134589(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134589) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen$default = Operators.connectWhen$default(CryptoDetailRecurringDuxo.this.cryptoAccountProvider.streamAccountNumber(new CryptoAccountSwitcherLocation.Detail(CryptoDetailRecurringDuxo.this.args.getCurrencyPairId())), CryptoDetailRecurringDuxo.this.cryptoExperimentsStore.streamCryptoMibExperiment(), null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoDetailRecurringDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowConnectWhen$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$9$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$9$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDetailRecurringDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailRecurringDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailRecurringDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$9$1$1", m3645f = "CryptoDetailRecurringDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497941 extends ContinuationImpl7 implements Function2<CryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState>, Object> {
                final /* synthetic */ String $accountNumber;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497941(String str, Continuation<? super C497941> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497941 c497941 = new C497941(this.$accountNumber, continuation);
                    c497941.L$0 = obj;
                    return c497941;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDetailRecurringDataState cryptoDetailRecurringDataState, Continuation<? super CryptoDetailRecurringDataState> continuation) {
                    return ((C497941) create(cryptoDetailRecurringDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDetailRecurringDataState.copy$default((CryptoDetailRecurringDataState) this.L$0, null, null, null, null, false, false, false, null, null, null, this.$accountNumber, 1023, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497941((String) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onLaunchRecurringClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailRecurringDuxo.onLaunchRecurringClicked$lambda$1(this.f$0, (CryptoDetailRecurringDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLaunchRecurringClicked$lambda$1(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, CryptoDetailRecurringDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoDetailRecurringEvent recurringEvent = dataState.getRecurringEvent();
        if (recurringEvent != null) {
            cryptoDetailRecurringDuxo.submit(recurringEvent);
        }
        return Unit.INSTANCE;
    }

    public final void onFeeUnsupportedRecurringAlertContinue() {
        withDataState(new Function1() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailRecurringDuxo.onFeeUnsupportedRecurringAlertContinue$lambda$2(this.f$0, (CryptoDetailRecurringDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFeeUnsupportedRecurringAlertContinue$lambda$2(CryptoDetailRecurringDuxo cryptoDetailRecurringDuxo, CryptoDetailRecurringDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UiCurrencyPair currencyPair = it.getCurrencyPair();
        if (currencyPair == null) {
            return Unit.INSTANCE;
        }
        cryptoDetailRecurringDuxo.submit(new CryptoDetailRecurringEvent.EnterRecurringFlow(cryptoDetailRecurringDuxo.investmentScheduleKeyResolver.getRecurringCreationKey(currencyPair, null)));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoDetailRecurringDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/recurring/CryptoDetailRecurringDuxo$InitArgs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID currencyPairId;

        /* compiled from: CryptoDetailRecurringDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = initArgs.currencyPairId;
            }
            return initArgs.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final InitArgs copy(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new InitArgs(currencyPairId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.currencyPairId, ((InitArgs) other).currencyPairId);
        }

        public int hashCode() {
            return this.currencyPairId.hashCode();
        }

        public String toString() {
            return "InitArgs(currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
        }

        public InitArgs(UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.currencyPairId = currencyPairId;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }
    }
}
