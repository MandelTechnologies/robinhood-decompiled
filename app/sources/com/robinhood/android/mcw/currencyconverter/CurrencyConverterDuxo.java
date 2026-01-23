package com.robinhood.android.mcw.currencyconverter;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.store.mcw.McwStore;
import com.robinhood.android.lib.store.mcw.data.ConversionFxRate;
import com.robinhood.android.lib.store.mcw.data.ConvertibleCurrency;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.mcw.currencyconverter.models.ConversionField;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterDataState;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterEvent;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterInternalError;
import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterViewState;
import com.robinhood.android.mcw.currencyconverter.models.TriggerAction;
import com.robinhood.android.mcw.currencyconverter.util.Calculators;
import com.robinhood.android.mcw.currencyconverter.util.Converters2;
import com.robinhood.android.mcw.currencyconverter.util.Formatters;
import com.robinhood.android.regiongate.FxFeeRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.bento.util.BentoCurrency;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: CurrencyConverterDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 A2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001ABI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020!2\n\u0010#\u001a\u00060$j\u0002`%2\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*2\u0006\u0010&\u001a\u00020'J\u0006\u0010+\u001a\u00020!J\u000e\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.J\u0016\u0010/\u001a\u00020!2\u0006\u00100\u001a\u0002012\u0006\u0010)\u001a\u00020*J\u0016\u00102\u001a\u00020!2\u0006\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020'J\u0006\u00105\u001a\u00020!J&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001f*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u00107\u001a\u000208H\u0002J2\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001f*\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020:0\u001f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J \u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020@H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001f0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterViewState;", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "mcwStore", "Lcom/robinhood/android/lib/store/mcw/McwStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/store/mcw/McwStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "convertibleCurrenciesFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "fxDirectionFlow", "Lkotlin/Pair;", "onCreate", "", "onKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "displayedTargetAmount", "", "focusOn", "field", "Lcom/robinhood/android/mcw/currencyconverter/models/ConversionField;", "swapCurrencies", "setFractionOfBalance", "fraction", "Ljava/math/BigDecimal;", "updateCurrency", "target", "Lcom/robinhood/compose/bento/util/BentoCurrency;", "convertCurrency", "displayedFromAmount", "displayedToAmount", "dismissInternalError", "getDefaultDirectionOf", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "toConvertibleCurrencyDirection", "Ljava/util/Currency;", "currencies", "applyFxRateMutation", "fromCurrency", "toCurrency", "fxRate", "Lcom/robinhood/android/lib/store/mcw/data/ConversionFxRate;", "Companion", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CurrencyConverterDuxo extends BaseDuxo3<CurrencyConverterDataState, CurrencyConverterViewState, CurrencyConverterEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final StateFlow2<List<ConvertibleCurrency>> convertibleCurrenciesFlow;
    private final StateFlow2<Tuples2<ConvertibleCurrency, ConvertibleCurrency>> fxDirectionFlow;
    private final MarketHoursStore marketHoursStore;
    private final McwStore mcwStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConversionField.values().length];
            try {
                iArr[ConversionField.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConversionField.f4551TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyConverterDuxo(AccountProvider accountProvider, UserStore userStore, McwStore mcwStore, RegionGateProvider regionGateProvider, MarketHoursStore marketHoursStore, SavedStateHandle savedStateHandle, CurrencyConverterStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(CurrencyConverterDataState.INSTANCE.createWith((CurrencyConverterKey) INSTANCE.getArgs(savedStateHandle)), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(mcwStore, "mcwStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.userStore = userStore;
        this.mcwStore = mcwStore;
        this.regionGateProvider = regionGateProvider;
        this.marketHoursStore = marketHoursStore;
        this.savedStateHandle = savedStateHandle;
        this.convertibleCurrenciesFlow = StateFlow4.MutableStateFlow(null);
        this.fxDirectionFlow = StateFlow4.MutableStateFlow(null);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C216971(null));
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1 */
    static final class C216971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C216971(Continuation<? super C216971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216971 c216971 = CurrencyConverterDuxo.this.new C216971(continuation);
            c216971.L$0 = obj;
            return c216971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C216971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CurrencyConverterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterDuxo;
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
                    Flow flowM28818catch = FlowKt.m28818catch(Context7.buffer$default(RxConvert.asFlow(this.this$0.marketHoursStore.getMarketHoursToday()), Integer.MAX_VALUE, null, 2, null), new C502791(this.this$0, null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/db/MarketHours;", "error", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502791 extends ContinuationImpl7 implements Function3<FlowCollector<? super MarketHours>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502791(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super C502791> continuation) {
                    super(3, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super MarketHours> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    C502791 c502791 = new C502791(this.this$0, continuation);
                    c502791.L$0 = th;
                    return c502791.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    if (!Throwables.isNetworkRelated(th)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    }
                    this.this$0.applyMutation(new C502801(null));
                    return Unit.INSTANCE;
                }

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502801 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C502801(Continuation<? super C502801> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502801 c502801 = new C502801(continuation);
                        c502801.L$0 = obj;
                        return c502801;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((C502801) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : CurrencyConverterInternalError.Fatal.INSTANCE, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                    }
                }
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$2", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarketHours marketHours, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(marketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$2$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C502811 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502811(MarketHours marketHours, Continuation<? super C502811> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502811 c502811 = new C502811(this.$marketHours, continuation);
                        c502811.L$0 = obj;
                        return c502811;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((C502811) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : this.$marketHours, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C502811((MarketHours) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CurrencyConverterDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CurrencyConverterDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(CurrencyConverterDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(CurrencyConverterDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(CurrencyConverterDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(CurrencyConverterDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2", m3645f = "CurrencyConverterDuxo.kt", m3646l = {115}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CurrencyConverterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterDuxo;
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
                    Observable<Instant> observableStreamTime = this.this$0.marketHoursStore.streamTime();
                    final CurrencyConverterDuxo currencyConverterDuxo = this.this$0;
                    Observable<Instant> observableDoOnNext = observableStreamTime.doOnNext(new Consumer() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo.onCreate.1.2.1
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Instant instant) {
                            currencyConverterDuxo.marketHoursStore.refreshToday(false);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
                    Flow flowM28818catch = FlowKt.m28818catch(Context7.buffer$default(RxConvert.asFlow(observableDoOnNext), Integer.MAX_VALUE, null, 2, null), new C502822(this.this$0, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "j$/time/Instant", "kotlin.jvm.PlatformType", "", "error", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$2", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$2, reason: invalid class name and collision with other inner class name */
            static final class C502822 extends ContinuationImpl7 implements Function3<FlowCollector<? super Instant>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502822(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super C502822> continuation) {
                    super(3, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super Instant> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    C502822 c502822 = new C502822(this.this$0, continuation);
                    c502822.L$0 = th;
                    return c502822.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    if (!Throwables.isNetworkRelated(th)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    }
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$2$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
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
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((AnonymousClass1) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : CurrencyConverterInternalError.Fatal.INSTANCE, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                    }
                }
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"j$/time/Instant", "kotlin.jvm.PlatformType", "currentTime", "", "<anonymous>", "(Lj$/time/Instant;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$3", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Instant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instant instant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(instant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$3$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
                    final /* synthetic */ Instant $currentTime;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Instant instant, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$currentTime = instant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentTime, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((AnonymousClass1) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : this.$currentTime, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Instant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$3", m3645f = "CurrencyConverterDuxo.kt", m3646l = {577, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ CurrencyConverterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
            
                if (r1.emit(r13, r12) != r0) goto L47;
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #1 {all -> 0x0027, blocks: (B:11:0x0023, B:31:0x0077, B:33:0x0080, B:36:0x008a, B:37:0x008e, B:39:0x0094, B:42:0x00a5, B:43:0x00ac, B:28:0x0066), top: B:61:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:11:0x0023, B:31:0x0077, B:33:0x0080, B:36:0x008a, B:37:0x008e, B:39:0x0094, B:42:0x00a5, B:43:0x00ac, B:28:0x0066), top: B:61:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x00e7 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:15:0x002c, B:25:0x005b, B:54:0x00e7, B:55:0x00ee, B:20:0x0038, B:22:0x0048), top: B:61:0x000a }] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                String accountNumber;
                String str;
                List list;
                Iterator it;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            accountNumber = ((CurrencyConverterKey) CurrencyConverterDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getAccountNumber();
                            if (accountNumber == null) {
                                Single<Optional<String>> individualAccountNumber = this.this$0.accountProvider.getIndividualAccountNumber();
                                this.label = 1;
                                obj = RxAwait3.await(individualAccountNumber, this);
                                if (obj == coroutine_suspended) {
                                }
                            } else {
                                str = accountNumber;
                                if (str == null) {
                                    McwStore mcwStore = this.this$0.mcwStore;
                                    this.L$0 = str;
                                    this.label = 2;
                                    obj = mcwStore.fetchConvertibleCurrencies(str, this);
                                    if (obj != coroutine_suspended) {
                                        List list2 = (List) obj;
                                        list = list2;
                                        if (list instanceof Collection) {
                                        }
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                        }
                                        this.this$0.applyMutation(new AnonymousClass1(str, list2, null));
                                        StateFlow2 stateFlow2 = this.this$0.convertibleCurrenciesFlow;
                                        this.L$0 = null;
                                        this.label = 3;
                                    }
                                } else {
                                    throw new IllegalArgumentException("Could not find individual account number and no account number was passed in");
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            str = (String) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            List list22 = (List) obj;
                            list = list22;
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (Converters2.toBentoCurrency(((ConvertibleCurrency) it.next()).getCurrency()) == null) {
                                        throw new IllegalStateException("Unsupported currency found in convertible currencies");
                                    }
                                }
                            }
                            this.this$0.applyMutation(new AnonymousClass1(str, list22, null));
                            StateFlow2 stateFlow22 = this.this$0.convertibleCurrenciesFlow;
                            this.L$0 = null;
                            this.label = 3;
                        }
                        accountNumber = (String) ((Optional) obj).getOrNull();
                        str = accountNumber;
                        if (str == null) {
                        }
                    } catch (Throwable th) {
                        if (!Throwables.isNetworkRelated(th)) {
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                        }
                        this.this$0.applyMutation(new CurrencyConverterDuxo$onCreate$1$3$accountNumber$2(null));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    if (!Throwables.isNetworkRelated(th2)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th2, false, null, 6, null);
                    }
                    this.this$0.applyMutation(new CurrencyConverterDuxo$onCreate$1$3$convertibleCurrencies$3(null));
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$3$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
                final /* synthetic */ String $accountNumber;
                final /* synthetic */ List<ConvertibleCurrency> $convertibleCurrencies;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, List<ConvertibleCurrency> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                    this.$convertibleCurrencies = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountNumber, this.$convertibleCurrencies, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                    return ((AnonymousClass1) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                    return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : this.$accountNumber, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : this.$convertibleCurrencies, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                }
            }
        }

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4", m3645f = "CurrencyConverterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CurrencyConverterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
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
                    final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(FlowKt.flowCombine(Context7.buffer$default(RxConvert.asFlow(this.this$0.userStore.getUser()), Integer.MAX_VALUE, null, 2, null), this.this$0.convertibleCurrenciesFlow, new AnonymousClass1(null))));
                    final CurrencyConverterDuxo currencyConverterDuxo = this.this$0;
                    Flow flowM28818catch = FlowKt.m28818catch(new Flow<Tuples2<? extends ConvertibleCurrency, ? extends ConvertibleCurrency>>() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends ConvertibleCurrency, ? extends ConvertibleCurrency>> flowCollector, Continuation continuation) {
                            Object objCollect = flowDistinctUntilChanged.collect(new C216912(flowCollector, currencyConverterDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2 */
                        public static final class C216912<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ CurrencyConverterDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2", m3645f = "CurrencyConverterDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C216912.this.emit(null, this);
                                }
                            }

                            public C216912(FlowCollector flowCollector, CurrencyConverterDuxo currencyConverterDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = currencyConverterDuxo;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                Tuples2 defaultDirectionOf;
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
                                    Tuples2 tuples2 = (Tuples2) obj;
                                    CountryCode.Supported supported = (CountryCode.Supported) tuples2.component1();
                                    List list = (List) tuples2.component2();
                                    Tuples2<Currency, Currency> direction = ((CurrencyConverterKey) CurrencyConverterDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getDirection();
                                    if (direction == null || (defaultDirectionOf = this.this$0.toConvertibleCurrencyDirection(direction, list)) == null) {
                                        defaultDirectionOf = this.this$0.getDefaultDirectionOf(list, supported);
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(defaultDirectionOf, anonymousClass1) == coroutine_suspended) {
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
                    }, new AnonymousClass3(this.this$0, null));
                    C502834 c502834 = new C502834(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, c502834, this) == coroutine_suspended) {
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

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "user", "Lcom/robinhood/models/db/sheriff/User;", "currencies"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<User, List<? extends ConvertibleCurrency>, Continuation<? super Tuples2<? extends CountryCode.Supported, ? extends List<? extends ConvertibleCurrency>>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(User user, List<ConvertibleCurrency> list, Continuation<? super Tuples2<? extends CountryCode.Supported, ? extends List<ConvertibleCurrency>>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = user;
                    anonymousClass1.L$1 = list;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(User user, List<? extends ConvertibleCurrency> list, Continuation<? super Tuples2<? extends CountryCode.Supported, ? extends List<? extends ConvertibleCurrency>>> continuation) {
                    return invoke2(user, (List<ConvertibleCurrency>) list, (Continuation<? super Tuples2<? extends CountryCode.Supported, ? extends List<ConvertibleCurrency>>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    User user = (User) this.L$0;
                    List list = (List) this.L$1;
                    if (list != null) {
                        return Tuples4.m3642to(user.getOrigin().getLocality(), list);
                    }
                    return null;
                }
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "error", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$3", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples2<? extends ConvertibleCurrency, ? extends ConvertibleCurrency>>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(3, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples2<? extends ConvertibleCurrency, ? extends ConvertibleCurrency>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    return invoke2((FlowCollector<? super Tuples2<ConvertibleCurrency, ConvertibleCurrency>>) flowCollector, th, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FlowCollector<? super Tuples2<ConvertibleCurrency, ConvertibleCurrency>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = th;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Throwable th = (Throwable) this.L$0;
                    if (!Throwables.isNetworkRelated(th)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    }
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$3$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
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
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((AnonymousClass1) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : CurrencyConverterInternalError.Fatal.INSTANCE, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                    }
                }
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "direction", "Lkotlin/Pair;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$4", m3645f = "CurrencyConverterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$4$4, reason: invalid class name and collision with other inner class name */
            static final class C502834 extends ContinuationImpl7 implements Function2<Tuples2<? extends ConvertibleCurrency, ? extends ConvertibleCurrency>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502834(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super C502834> continuation) {
                    super(2, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502834 c502834 = new C502834(this.this$0, continuation);
                    c502834.L$0 = obj;
                    return c502834;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ConvertibleCurrency, ? extends ConvertibleCurrency> tuples2, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples2<ConvertibleCurrency, ConvertibleCurrency>) tuples2, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples2<ConvertibleCurrency, ConvertibleCurrency> tuples2, Continuation<? super Unit> continuation) {
                    return ((C502834) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples2 tuples2 = (Tuples2) this.L$0;
                        StateFlow2 stateFlow2 = this.this$0.fxDirectionFlow;
                        this.label = 1;
                        if (stateFlow2.emit(tuples2, this) == coroutine_suspended) {
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

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5", m3645f = "CurrencyConverterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CurrencyConverterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterDuxo;
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
                    Flow flowM28818catch = FlowKt.m28818catch(FlowKt.transformLatest(FlowKt.filterNotNull(this.this$0.fxDirectionFlow), new C21692xf74bff58(null, this.this$0)), new AnonymousClass2(this.this$0, null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM28818catch, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Triple;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "Lcom/robinhood/android/lib/store/mcw/data/ConversionFxRate;", "error", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5$2", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super Tuples3<? extends ConvertibleCurrency, ? extends ConvertibleCurrency, ? extends ConversionFxRate>>, Throwable, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Tuples3<? extends ConvertibleCurrency, ? extends ConvertibleCurrency, ? extends ConversionFxRate>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    return invoke2((FlowCollector<? super Tuples3<ConvertibleCurrency, ConvertibleCurrency, ConversionFxRate>>) flowCollector, th, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(FlowCollector<? super Tuples3<ConvertibleCurrency, ConvertibleCurrency, ConversionFxRate>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = th;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5$2$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
                    final /* synthetic */ Throwable $error;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Throwable th, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$error = th;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$error, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((AnonymousClass1) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        Result.Companion companion = Result.INSTANCE;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(this.$error))), (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Throwable) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", "Lcom/robinhood/android/lib/store/mcw/data/ConvertibleCurrency;", "Lcom/robinhood/android/lib/store/mcw/data/ConversionFxRate;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5$3", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$5$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples3<? extends ConvertibleCurrency, ? extends ConvertibleCurrency, ? extends ConversionFxRate>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = currencyConverterDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends ConvertibleCurrency, ? extends ConvertibleCurrency, ? extends ConversionFxRate> tuples3, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples3<ConvertibleCurrency, ConvertibleCurrency, ConversionFxRate>) tuples3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples3<ConvertibleCurrency, ConvertibleCurrency, ConversionFxRate> tuples3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples3 tuples3 = (Tuples3) this.L$0;
                        this.this$0.applyFxRateMutation((ConvertibleCurrency) tuples3.component1(), (ConvertibleCurrency) tuples3.component2(), (ConversionFxRate) tuples3.component3());
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$6", m3645f = "CurrencyConverterDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CurrencyConverterDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = currencyConverterDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CurrencyConverterDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$6$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ CurrencyConverterDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = currencyConverterDuxo;
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

                /* compiled from: CurrencyConverterDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$6$1$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onCreate$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C502841 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C502841(boolean z, Continuation<? super C502841> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C502841 c502841 = new C502841(this.$it, continuation);
                        c502841.L$0 = obj;
                        return c502841;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
                        return ((C502841) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
                        return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : boxing.boxBoolean(this.$it));
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502841(this.Z$0, null));
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, FxFeeRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onKeyEvent$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$onKeyEvent$1 */
    static final class C216981 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
        final /* synthetic */ String $displayedTargetAmount;
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216981(String str, KeyEvent keyEvent, Continuation<? super C216981> continuation) {
            super(2, continuation);
            this.$displayedTargetAmount = str;
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216981 c216981 = new C216981(this.$displayedTargetAmount, this.$keyEvent, continuation);
            c216981.L$0 = obj;
            return c216981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
            return ((C216981) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String prevAmount;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            if (currencyConverterDataState.getPrevAmount() == null) {
                return currencyConverterDataState;
            }
            if (Intrinsics.areEqual(Formatters.withoutGroupSeparators(this.$displayedTargetAmount), currencyConverterDataState.getNextAmount())) {
                prevAmount = currencyConverterDataState.getNextAmount();
            } else {
                prevAmount = currencyConverterDataState.getPrevAmount();
            }
            String strMutatedWithKeyEvent = Calculators.mutatedWithKeyEvent(prevAmount, this.$keyEvent);
            return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : KeyEvents2.isDelete(this.$keyEvent) ? strMutatedWithKeyEvent : prevAmount, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : strMutatedWithKeyEvent, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
        }
    }

    public final void onKeyEvent(KeyEvent keyEvent, String displayedTargetAmount) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(displayedTargetAmount, "displayedTargetAmount");
        applyMutation(new C216981(displayedTargetAmount, keyEvent, null));
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$focusOn$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$focusOn$1 */
    static final class C216961 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
        final /* synthetic */ String $displayedTargetAmount;
        final /* synthetic */ ConversionField $field;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216961(ConversionField conversionField, String str, Continuation<? super C216961> continuation) {
            super(2, continuation);
            this.$field = conversionField;
            this.$displayedTargetAmount = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216961 c216961 = new C216961(this.$field, this.$displayedTargetAmount, continuation);
            c216961.L$0 = obj;
            return c216961;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
            return ((C216961) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ConvertibleCurrency targetCurrency;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            Result<ConversionFxRate> resultM16506getFxRatexLWZpok = currencyConverterDataState.m16506getFxRatexLWZpok();
            if (resultM16506getFxRatexLWZpok != null) {
                Object value = resultM16506getFxRatexLWZpok.getValue();
                if (Result.m28555isFailureimpl(value)) {
                    value = null;
                }
                ConversionFxRate conversionFxRate = (ConversionFxRate) value;
                if (conversionFxRate != null && (targetCurrency = currencyConverterDataState.getTargetCurrency()) != null && this.$field != currencyConverterDataState.getTargetField()) {
                    BigDecimal bigDecimalConvertedTo = Calculators.convertedTo(new BigDecimal(Formatters.withoutGroupSeparators(this.$displayedTargetAmount)), this.$field, conversionFxRate.getBidPrice());
                    BigDecimal bigDecimalBoundedBy = Calculators.boundedBy(bigDecimalConvertedTo, targetCurrency.getTransactionMin(), targetCurrency.getTransactionMax(), this.$field == ConversionField.FROM ? targetCurrency.getBalance() : null);
                    ConversionField conversionField = this.$field;
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    String plainString = bigDecimalBoundedBy.setScale(2, roundingMode).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    String strWithoutTrailingZeros = Formatters.withoutTrailingZeros(plainString);
                    String plainString2 = bigDecimalConvertedTo.setScale(2, roundingMode).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                    return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : conversionField, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : strWithoutTrailingZeros, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : Formatters.withoutTrailingZeros(plainString2), (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
                }
            }
            return currencyConverterDataState;
        }
    }

    public final void focusOn(ConversionField field, String displayedTargetAmount) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(displayedTargetAmount, "displayedTargetAmount");
        applyMutation(new C216961(field, displayedTargetAmount, null));
    }

    public final void swapCurrencies() {
        withDataState(new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyConverterDuxo.swapCurrencies$lambda$0(this.f$0, (CurrencyConverterDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit swapCurrencies$lambda$0(CurrencyConverterDuxo currencyConverterDuxo, CurrencyConverterDataState ds) {
        ConvertibleCurrency toCurrency;
        Intrinsics.checkNotNullParameter(ds, "ds");
        ConvertibleCurrency fromCurrency = ds.getFromCurrency();
        if (fromCurrency != null && (toCurrency = ds.getToCurrency()) != null) {
            BuildersKt__Builders_commonKt.launch$default(currencyConverterDuxo.getLifecycleScope(), null, null, new CurrencyConverterDuxo$swapCurrencies$1$1(currencyConverterDuxo, toCurrency, fromCurrency, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$setFractionOfBalance$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$setFractionOfBalance$1 */
    static final class C216991 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
        final /* synthetic */ BigDecimal $fraction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216991(BigDecimal bigDecimal, Continuation<? super C216991> continuation) {
            super(2, continuation);
            this.$fraction = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216991 c216991 = new C216991(this.$fraction, continuation);
            c216991.L$0 = obj;
            return c216991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
            return ((C216991) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            ConvertibleCurrency fromCurrency = currencyConverterDataState.getFromCurrency();
            if (fromCurrency == null) {
                return currencyConverterDataState;
            }
            BigDecimal bigDecimalMultiply = fromCurrency.getBalance().multiply(this.$fraction);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal scale = bigDecimalMultiply.setScale(2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNull(scale);
            BigDecimal bigDecimalBoundedBy = Calculators.boundedBy(scale, fromCurrency.getTransactionMin(), fromCurrency.getTransactionMax(), fromCurrency.getBalance());
            ConversionField conversionField = ConversionField.FROM;
            String plainString = bigDecimalBoundedBy.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            String strWithoutTrailingZeros = Formatters.withoutTrailingZeros(plainString);
            String plainString2 = scale.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
            return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : conversionField, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : strWithoutTrailingZeros, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : Formatters.withoutTrailingZeros(plainString2), (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
        }
    }

    public final void setFractionOfBalance(BigDecimal fraction) {
        Intrinsics.checkNotNullParameter(fraction, "fraction");
        applyMutation(new C216991(fraction, null));
    }

    public final void updateCurrency(final BentoCurrency target, final ConversionField field) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(field, "field");
        withDataState(new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyConverterDuxo.updateCurrency$lambda$3(field, target, this, (CurrencyConverterDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCurrency$lambda$3(ConversionField conversionField, BentoCurrency bentoCurrency, CurrencyConverterDuxo currencyConverterDuxo, CurrencyConverterDataState ds) {
        ConvertibleCurrency toCurrency;
        Object next;
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(ds, "ds");
        ConvertibleCurrency fromCurrency = ds.getFromCurrency();
        if (fromCurrency != null && (toCurrency = ds.getToCurrency()) != null) {
            if ((conversionField == ConversionField.FROM && Intrinsics.areEqual(bentoCurrency.getCurrencyCode(), fromCurrency.getCurrency().getCurrencyCode())) || (conversionField == ConversionField.f4551TO && Intrinsics.areEqual(bentoCurrency.getCurrencyCode(), toCurrency.getCurrency().getCurrencyCode()))) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(bentoCurrency.getCurrencyCode(), fromCurrency.getCurrency().getCurrencyCode()) || Intrinsics.areEqual(bentoCurrency.getCurrencyCode(), toCurrency.getCurrency().getCurrencyCode())) {
                currencyConverterDuxo.applyMutation(new CurrencyConverterDuxo$updateCurrency$1$1(null));
                BuildersKt__Builders_commonKt.launch$default(currencyConverterDuxo.getLifecycleScope(), null, null, new CurrencyConverterDuxo$updateCurrency$1$2(currencyConverterDuxo, toCurrency, fromCurrency, null), 3, null);
            } else {
                if (ds.getConvertibleCurrencies().isEmpty()) {
                    return Unit.INSTANCE;
                }
                Iterator<T> it = ds.getConvertibleCurrencies().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.areEqual(((ConvertibleCurrency) next).getCurrency().getCurrencyCode(), bentoCurrency.getCurrencyCode())) {
                        break;
                    }
                }
                ConvertibleCurrency convertibleCurrency = (ConvertibleCurrency) next;
                if (convertibleCurrency == null) {
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException(bentoCurrency.getCurrencyCode() + " not available to convert"), false, null, 6, null);
                    currencyConverterDuxo.applyMutation(new CurrencyConverterDuxo$updateCurrency$1$targetCurrency$2$1(null));
                    return Unit.INSTANCE;
                }
                int i = WhenMappings.$EnumSwitchMapping$0[conversionField.ordinal()];
                if (i == 1) {
                    tuples2M3642to = Tuples4.m3642to(convertibleCurrency, toCurrency);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tuples2M3642to = Tuples4.m3642to(fromCurrency, convertibleCurrency);
                }
                ConvertibleCurrency convertibleCurrency2 = (ConvertibleCurrency) tuples2M3642to.component1();
                ConvertibleCurrency convertibleCurrency3 = (ConvertibleCurrency) tuples2M3642to.component2();
                currencyConverterDuxo.applyMutation(new CurrencyConverterDuxo$updateCurrency$1$3(null));
                BuildersKt__Builders_commonKt.launch$default(currencyConverterDuxo.getLifecycleScope(), null, null, new CurrencyConverterDuxo$updateCurrency$1$4(currencyConverterDuxo, convertibleCurrency2, convertibleCurrency3, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void convertCurrency(final String displayedFromAmount, final String displayedToAmount) {
        Intrinsics.checkNotNullParameter(displayedFromAmount, "displayedFromAmount");
        Intrinsics.checkNotNullParameter(displayedToAmount, "displayedToAmount");
        withDataState(new Function1() { // from class: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CurrencyConverterDuxo.convertCurrency$lambda$4(displayedFromAmount, displayedToAmount, this, (CurrencyConverterDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertCurrency$lambda$4(String str, String str2, CurrencyConverterDuxo currencyConverterDuxo, CurrencyConverterDataState ds) {
        String accountNumber;
        ConvertibleCurrency toCurrency;
        ConvertibleCurrency targetCurrency;
        ConvertibleCurrency otherCurrency;
        BigDecimal bigDecimal;
        String str3;
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (!ds.getConversionInProgress() && (accountNumber = ds.getAccountNumber()) != null) {
            Result<ConversionFxRate> resultM16506getFxRatexLWZpok = ds.m16506getFxRatexLWZpok();
            if (resultM16506getFxRatexLWZpok != null) {
                Object value = resultM16506getFxRatexLWZpok.getValue();
                if (Result.m28555isFailureimpl(value)) {
                    value = null;
                }
                ConversionFxRate conversionFxRate = (ConversionFxRate) value;
                if (conversionFxRate != null) {
                    ConvertibleCurrency fromCurrency = ds.getFromCurrency();
                    if (fromCurrency != null && (toCurrency = ds.getToCurrency()) != null && (targetCurrency = ds.getTargetCurrency()) != null && (otherCurrency = ds.getOtherCurrency()) != null) {
                        BigDecimal bigDecimal2 = new BigDecimal(Formatters.withoutGroupSeparators(str));
                        BigDecimal bigDecimal3 = new BigDecimal(Formatters.withoutGroupSeparators(str2));
                        int i = WhenMappings.$EnumSwitchMapping$0[ds.getTargetField().ordinal()];
                        if (i == 1) {
                            bigDecimal = bigDecimal2;
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bigDecimal = bigDecimal3;
                        }
                        if (BigDecimals7.isZero(bigDecimal)) {
                            return Unit.INSTANCE;
                        }
                        BigDecimal bigDecimalConvertedTo = Calculators.convertedTo(bigDecimal, ds.getTargetField().getOther(), conversionFxRate.getBidPrice());
                        if (bigDecimalConvertedTo.compareTo(otherCurrency.getTransactionMin()) < 0) {
                            str3 = accountNumber;
                            stringResourceInvoke = StringResource.INSTANCE.invoke(C21706R.string.under_other_min_error, targetCurrency.getCurrency().getCurrencyCode(), otherCurrency.getCurrency().getCurrencyCode(), Money.formatCompact$default(Money3.toMoney(otherCurrency.getTransactionMin(), otherCurrency.getCurrency()), null, null, 0, 3, null));
                        } else {
                            str3 = accountNumber;
                            stringResourceInvoke = bigDecimalConvertedTo.compareTo(otherCurrency.getTransactionMax()) > 0 ? StringResource.INSTANCE.invoke(C21706R.string.over_other_max_error, targetCurrency.getCurrency().getCurrencyCode(), otherCurrency.getCurrency().getCurrencyCode(), Money.formatCompact$default(Money3.toMoney(otherCurrency.getTransactionMax(), otherCurrency.getCurrency()), null, null, 0, 3, null)) : null;
                        }
                        if (stringResourceInvoke != null) {
                            currencyConverterDuxo.applyMutation(new CurrencyConverterDuxo$convertCurrency$1$1(stringResourceInvoke, null));
                            return Unit.INSTANCE;
                        }
                        currencyConverterDuxo.applyMutation(new CurrencyConverterDuxo$convertCurrency$1$2(null));
                        currencyConverterDuxo.applyMutation(new CurrencyConverterDuxo$convertCurrency$1$3(currencyConverterDuxo, str3, conversionFxRate, bigDecimal2, fromCurrency, toCurrency, bigDecimal3, null));
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$dismissInternalError$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$dismissInternalError$1 */
    static final class C216951 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C216951(Continuation<? super C216951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216951 c216951 = new C216951(continuation);
            c216951.L$0 = obj;
            return c216951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
            return ((C216951) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : null, (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : null, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : null, (24323 & 32) != 0 ? currencyConverterDataState.targetField : null, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : null, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : null, (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : null, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
        }
    }

    public final void dismissInternalError() {
        applyMutation(new C216951(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Tuples2<ConvertibleCurrency, ConvertibleCurrency> getDefaultDirectionOf(List<ConvertibleCurrency> list, CountryCode.Supported supported) {
        Object obj;
        Object next;
        ConvertibleCurrency convertibleCurrency;
        Currency currency = Converters2.getCurrency(supported);
        if (currency == null) {
            throw new IllegalStateException(("Cannot map " + supported + " to a currency").toString());
        }
        List<ConvertibleCurrency> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ConvertibleCurrency) next).getCurrency(), currency)) {
                break;
            }
        }
        ConvertibleCurrency convertibleCurrency2 = (ConvertibleCurrency) next;
        if (convertibleCurrency2 == null) {
            throw new IllegalStateException((currency + " not available to convert").toString());
        }
        if (Intrinsics.areEqual(convertibleCurrency2.getCurrency(), Currencies.USD)) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (!Intrinsics.areEqual(((ConvertibleCurrency) next2).getCurrency(), Currencies.USD)) {
                    obj = next2;
                    break;
                }
            }
            convertibleCurrency = (ConvertibleCurrency) obj;
            if (convertibleCurrency == null) {
                throw new IllegalStateException("No non-USD currency available to convert");
            }
        } else {
            Iterator<T> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (Intrinsics.areEqual(((ConvertibleCurrency) next3).getCurrency(), Currencies.USD)) {
                    obj = next3;
                    break;
                }
            }
            convertibleCurrency = (ConvertibleCurrency) obj;
            if (convertibleCurrency == null) {
                throw new IllegalStateException("USD currency not available to convert");
            }
        }
        return Tuples4.m3642to(convertibleCurrency2, convertibleCurrency);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Tuples2<ConvertibleCurrency, ConvertibleCurrency> toConvertibleCurrencyDirection(Tuples2<Currency, Currency> tuples2, List<ConvertibleCurrency> list) {
        Object obj;
        Object next;
        List<ConvertibleCurrency> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ConvertibleCurrency) next).getCurrency(), tuples2.getFirst())) {
                break;
            }
        }
        ConvertibleCurrency convertibleCurrency = (ConvertibleCurrency) next;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((ConvertibleCurrency) next2).getCurrency(), tuples2.getSecond())) {
                obj = next2;
                break;
            }
        }
        ConvertibleCurrency convertibleCurrency2 = (ConvertibleCurrency) obj;
        if (convertibleCurrency == null) {
            throw new IllegalArgumentException((tuples2.getFirst().getCurrencyCode() + " not available to convert").toString());
        }
        if (convertibleCurrency2 == null) {
            throw new IllegalArgumentException((tuples2.getSecond().getCurrencyCode() + " not available to convert").toString());
        }
        if (Intrinsics.areEqual(convertibleCurrency, convertibleCurrency2)) {
            throw new IllegalArgumentException("from and to currencies cannot be the same");
        }
        return Tuples4.m3642to(convertibleCurrency, convertibleCurrency2);
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$applyFxRateMutation$1", m3645f = "CurrencyConverterDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$applyFxRateMutation$1 */
    static final class C216941 extends ContinuationImpl7 implements Function2<CurrencyConverterDataState, Continuation<? super CurrencyConverterDataState>, Object> {
        final /* synthetic */ ConvertibleCurrency $fromCurrency;
        final /* synthetic */ ConversionFxRate $fxRate;
        final /* synthetic */ ConvertibleCurrency $toCurrency;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CurrencyConverterDuxo this$0;

        /* compiled from: CurrencyConverterDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterDuxo$applyFxRateMutation$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[TriggerAction.values().length];
                try {
                    iArr[TriggerAction.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TriggerAction.SWITCH_CURRENCY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TriggerAction.SWAP_CURRENCIES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ConversionField.values().length];
                try {
                    iArr2[ConversionField.FROM.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ConversionField.f4551TO.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216941(ConversionFxRate conversionFxRate, ConvertibleCurrency convertibleCurrency, ConvertibleCurrency convertibleCurrency2, CurrencyConverterDuxo currencyConverterDuxo, Continuation<? super C216941> continuation) {
            super(2, continuation);
            this.$fxRate = conversionFxRate;
            this.$fromCurrency = convertibleCurrency;
            this.$toCurrency = convertibleCurrency2;
            this.this$0 = currencyConverterDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216941 c216941 = new C216941(this.$fxRate, this.$fromCurrency, this.$toCurrency, this.this$0, continuation);
            c216941.L$0 = obj;
            return c216941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CurrencyConverterDataState currencyConverterDataState, Continuation<? super CurrencyConverterDataState> continuation) {
            return ((C216941) create(currencyConverterDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ConversionField targetField;
            ConvertibleCurrency convertibleCurrency;
            String prevAmount;
            BigDecimal amountTo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrencyConverterDataState currencyConverterDataState = (CurrencyConverterDataState) this.L$0;
            if (!Intrinsics.areEqual(this.$fxRate.getSymbol(), this.$fromCurrency.getCurrency().getCurrencyCode() + this.$toCurrency.getCurrency().getCurrencyCode())) {
                return currencyConverterDataState;
            }
            TriggerAction triggerAction = currencyConverterDataState.getTriggerAction();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[triggerAction.ordinal()];
            if (i == 1 || i == 2) {
                targetField = currencyConverterDataState.getTargetField();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                targetField = currencyConverterDataState.getTargetField().getOther();
            }
            ConversionField conversionField = targetField;
            int i2 = WhenMappings.$EnumSwitchMapping$1[conversionField.ordinal()];
            if (i2 == 1) {
                convertibleCurrency = this.$fromCurrency;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                convertibleCurrency = this.$toCurrency;
            }
            BigDecimal balance = this.$fromCurrency.getBalance();
            boolean z = conversionField == ConversionField.f4551TO;
            ConversionFxRate conversionFxRate = this.$fxRate;
            if (z) {
                balance = Calculators.convertedTo(balance, conversionField, conversionFxRate.getBidPrice());
            }
            CurrencyConverterDuxo currencyConverterDuxo = this.this$0;
            int i3 = iArr[currencyConverterDataState.getTriggerAction().ordinal()];
            if (i3 == 1) {
                prevAmount = currencyConverterDataState.getPrevAmount();
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                prevAmount = currencyConverterDataState.getNextAmount();
            }
            if (prevAmount != null) {
                amountTo = new BigDecimal(prevAmount);
            } else {
                Companion companion = CurrencyConverterDuxo.INSTANCE;
                amountTo = ((CurrencyConverterKey) companion.getArgs((HasSavedState) currencyConverterDuxo)).getAmountTo();
                if (amountTo == null && (amountTo = ((CurrencyConverterKey) companion.getArgs((HasSavedState) currencyConverterDuxo)).getAmountFrom()) == null) {
                    amountTo = BigDecimal.ZERO;
                }
            }
            Intrinsics.checkNotNullExpressionValue(amountTo, "run(...)");
            String plainString = Calculators.boundedBy(amountTo, convertibleCurrency.getTransactionMin(), convertibleCurrency.getTransactionMax(), balance).setScale(2, RoundingMode.HALF_UP).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
            String strWithoutTrailingZeros = Formatters.withoutTrailingZeros(plainString);
            Result.Companion companion2 = Result.INSTANCE;
            return currencyConverterDataState.copy((24323 & 1) != 0 ? currencyConverterDataState.accountNumber : null, (24323 & 2) != 0 ? currencyConverterDataState.convertibleCurrencies : null, (24323 & 4) != 0 ? currencyConverterDataState.fxRate : Result.m28549boximpl(Result.m28550constructorimpl(this.$fxRate)), (24323 & 8) != 0 ? currencyConverterDataState.fromCurrency : this.$fromCurrency, (24323 & 16) != 0 ? currencyConverterDataState.toCurrency : this.$toCurrency, (24323 & 32) != 0 ? currencyConverterDataState.targetField : conversionField, (24323 & 64) != 0 ? currencyConverterDataState.prevAmount : strWithoutTrailingZeros, (24323 & 128) != 0 ? currencyConverterDataState.nextAmount : currencyConverterDataState.getNextAmount(), (24323 & 256) != 0 ? currencyConverterDataState.submissionError : null, (24323 & 512) != 0 ? currencyConverterDataState.conversionInProgress : false, (24323 & 1024) != 0 ? currencyConverterDataState.marketHours : null, (24323 & 2048) != 0 ? currencyConverterDataState.currentTime : null, (24323 & 4096) != 0 ? currencyConverterDataState.internalError : null, (24323 & 8192) != 0 ? currencyConverterDataState.triggerAction : TriggerAction.NONE, (24323 & 16384) != 0 ? currencyConverterDataState.isFxFeeEnabled : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFxRateMutation(ConvertibleCurrency fromCurrency, ConvertibleCurrency toCurrency, ConversionFxRate fxRate) {
        applyMutation(new C216941(fxRate, fromCurrency, toCurrency, this, null));
    }

    /* compiled from: CurrencyConverterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDuxo;", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterKey;", "<init>", "()V", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CurrencyConverterDuxo, CurrencyConverterKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CurrencyConverterKey getArgs(SavedStateHandle savedStateHandle) {
            return (CurrencyConverterKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CurrencyConverterKey getArgs(CurrencyConverterDuxo currencyConverterDuxo) {
            return (CurrencyConverterKey) DuxoCompanion.DefaultImpls.getArgs(this, currencyConverterDuxo);
        }
    }
}
