package com.robinhood.android.transfers.p271ui.max.i18n;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferEvent;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferFragment;
import com.robinhood.android.transfers.p271ui.max.i18n.PdtWarningCheck;
import com.robinhood.android.transfers.p271ui.max.i18n.creation.InternationalCreateTransferRequestFactory;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.android.transfers.preference.DefaultUkExternalTransferAccountPref;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.crypto.p314db.BrokerageBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
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
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: InternationalTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 C2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001CBk\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\u000e\u00102\u001a\u0002002\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000200J\u000e\u00106\u001a\u0002002\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u000200J\u0006\u0010:\u001a\u00020;J\u000e\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020>J\u0010\u0010?\u001a\u0002002\b\u0010@\u001a\u0004\u0018\u00010AJ\u0006\u0010B\u001a\u000200R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R)\u0010(\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010*0*0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b,\u0010-¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferViewState;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferStateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "fxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "internationalCreateTransferRequestFactory", "Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;", "defaultUkExternalTransferAccountPref", "Lcom/robinhood/prefs/StringPreference;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferStateProvider;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/android/transfers/ui/max/i18n/creation/InternationalCreateTransferRequestFactory;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "pdtWarningCheck", "Lcom/robinhood/android/transfers/ui/max/i18n/PdtWarningCheck;", "getPdtWarningCheck", "()Lcom/robinhood/android/transfers/ui/max/i18n/PdtWarningCheck;", "pdtWarningCheck$delegate", "Lkotlin/Lazy;", "localityFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "kotlin.jvm.PlatformType", "getLocalityFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "localityFlow$delegate", "onCreate", "", "onStart", "setSessionId", "sessionId", "Ljava/util/UUID;", "currencySwitcherSelected", "numpadItemSelected", "keyEvent", "Landroid/view/KeyEvent;", "continueSelected", "onBackPressed", "", "transferContinueSelected", "amount", "Lcom/robinhood/models/util/Money;", "externalAccountSelected", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "onAccountSelected", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InternationalTransferDuxo extends BaseDuxo3<InternationalTransferDataState, InternationalTransferViewState, InternationalTransferEvent> implements HasSavedState {
    private final BalancesStore balancesStore;
    private final StringPreference defaultUkExternalTransferAccountPref;
    private final FxRatesProvider fxRatesProvider;
    private final InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory;

    /* renamed from: localityFlow$delegate, reason: from kotlin metadata */
    private final Lazy localityFlow;
    private final LazyMoshi moshi;

    /* renamed from: pdtWarningCheck$delegate, reason: from kotlin metadata */
    private final Lazy pdtWarningCheck;
    private final TraderPortfolioStore portfolioStore;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;
    private final TransfersBonfireApi transfersBonfireApi;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final MoneyInputConsumer inputKeyEventConsumer = new MoneyInputConsumer(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT), true);

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternationalTransferDuxo(InternationalTransferStateProvider stateProvider, UserStore userStore, FxRatesProvider fxRatesProvider, BalancesStore balancesStore, TraderPortfolioStore portfolioStore, TransfersBonfireApi transfersBonfireApi, TransferAccountStore transferAccountStore, InternationalCreateTransferRequestFactory internationalCreateTransferRequestFactory, @DefaultUkExternalTransferAccountPref StringPreference defaultUkExternalTransferAccountPref, LazyMoshi moshi, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(fxRatesProvider, "fxRatesProvider");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(internationalCreateTransferRequestFactory, "internationalCreateTransferRequestFactory");
        Intrinsics.checkNotNullParameter(defaultUkExternalTransferAccountPref, "defaultUkExternalTransferAccountPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(InternationalTransferDuxo9.toInitialState(((InternationalTransferFragment.Args) companion.getArgs(savedStateHandle)).getTransferDirection(), defaultUkExternalTransferAccountPref.get(), ((InternationalTransferFragment.Args) companion.getArgs(savedStateHandle)).getAmount(), ((InternationalTransferFragment.Args) companion.getArgs(savedStateHandle)).getEntryPoint()), stateProvider, duxoBundle);
        this.userStore = userStore;
        this.fxRatesProvider = fxRatesProvider;
        this.balancesStore = balancesStore;
        this.portfolioStore = portfolioStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferAccountStore = transferAccountStore;
        this.internationalCreateTransferRequestFactory = internationalCreateTransferRequestFactory;
        this.defaultUkExternalTransferAccountPref = defaultUkExternalTransferAccountPref;
        this.moshi = moshi;
        this.savedStateHandle = savedStateHandle;
        this.pdtWarningCheck = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternationalTransferDuxo.pdtWarningCheck_delegate$lambda$0();
            }
        });
        this.localityFlow = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternationalTransferDuxo.localityFlow_delegate$lambda$1(this.f$0);
            }
        });
    }

    private final PdtWarningCheck getPdtWarningCheck() {
        return (PdtWarningCheck) this.pdtWarningCheck.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PdtWarningCheck pdtWarningCheck_delegate$lambda$0() {
        return new PdtWarningCheck();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedFlow<CountryCode.Supported> getLocalityFlow() {
        return (SharedFlow) this.localityFlow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedFlow localityFlow_delegate$lambda$1(InternationalTransferDuxo internationalTransferDuxo) {
        ObservableSource map = internationalTransferDuxo.userStore.getUser().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$localityFlow$2$1
            @Override // io.reactivex.functions.Function
            public final CountryCode.Supported apply(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOrigin().getLocality();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return FlowKt.shareIn(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null)), internationalTransferDuxo.getLifecycleScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C307431(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C307442(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C307453(null));
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {94}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$1 */
    static final class C307431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307431(Continuation<? super C307431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferDuxo.this.new C307431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$1$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CountryCode.Supported, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternationalTransferDuxo internationalTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CountryCode.Supported supported, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(supported, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$1$1$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506151 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
                final /* synthetic */ CountryCode.Supported $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506151(CountryCode.Supported supported, Continuation<? super C506151> continuation) {
                    super(2, continuation);
                    this.$it = supported;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506151 c506151 = new C506151(this.$it, continuation);
                    c506151.L$0 = obj;
                    return c506151;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
                    return ((C506151) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, null, null, null, false, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, this.$it, 4194303, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506151((CountryCode.Supported) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow localityFlow = InternationalTransferDuxo.this.getLocalityFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransferDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(localityFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$2", m3645f = "InternationalTransferDuxo.kt", m3646l = {103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$2 */
    static final class C307442 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307442(Continuation<? super C307442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferDuxo.this.new C307442(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FxRatesProvider fxRatesProvider = InternationalTransferDuxo.this.fxRatesProvider;
                Duration durationOfSeconds = Duration.ofSeconds(15L);
                Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
                Flow<ApiFxQuote> flowStreamFxRate = fxRatesProvider.streamFxRate(durationOfSeconds);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternationalTransferDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamFxRate, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/fx/api/ApiFxQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$2$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ApiFxQuote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternationalTransferDuxo internationalTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiFxQuote apiFxQuote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(apiFxQuote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$2$1$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506161 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
                final /* synthetic */ ApiFxQuote $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506161(ApiFxQuote apiFxQuote, Continuation<? super C506161> continuation) {
                    super(2, continuation);
                    this.$it = apiFxQuote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506161 c506161 = new C506161(this.$it, continuation);
                    c506161.L$0 = obj;
                    return c506161;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
                    return ((C506161) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, Instant.now(), this.$it, null, false, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388595, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506161((ApiFxQuote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3", m3645f = "InternationalTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3 */
    static final class C307453 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C307453(Continuation<? super C307453> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307453 c307453 = InternationalTransferDuxo.this.new C307453(continuation);
            c307453.L$0 = obj;
            return c307453;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307453) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(InternationalTransferDuxo.this.getLocalityFlow(), new AnonymousClass1((CoroutineScope) this.L$0, InternationalTransferDuxo.this, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InternationalTransferDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMapLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CountryCode.Supported, Continuation<? super Result<? extends ApiDisclosureUIResponse>>, Object> {
            final /* synthetic */ CoroutineScope $$this$repeatOnLifecycle;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CoroutineScope coroutineScope, InternationalTransferDuxo internationalTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$repeatOnLifecycle = coroutineScope;
                this.this$0 = internationalTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$repeatOnLifecycle, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CountryCode.Supported supported, Continuation<? super Result<ApiDisclosureUIResponse>> continuation) {
                return ((AnonymousClass1) create(supported, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CountryCode.Supported supported, Continuation<? super Result<? extends ApiDisclosureUIResponse>> continuation) {
                return invoke2(supported, (Continuation<? super Result<ApiDisclosureUIResponse>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objM28550constructorimpl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CountryCode.Supported supported = (CountryCode.Supported) this.L$0;
                        InternationalTransferDuxo internationalTransferDuxo = this.this$0;
                        Result.Companion companion = Result.INSTANCE;
                        TransfersBonfireApi transfersBonfireApi = internationalTransferDuxo.transfersBonfireApi;
                        Intrinsics.checkNotNull(supported);
                        DisclosureLocation disclosureLocation = Locality2.getDisclosureLocation(supported);
                        Companion companion2 = InternationalTransferDuxo.INSTANCE;
                        ApiTransferAccount.TransferAccountType defaultSourceAccountType = Locality2.getDefaultSourceAccountType(supported, ((InternationalTransferFragment.Args) companion2.getArgs((HasSavedState) internationalTransferDuxo)).getTransferDirection());
                        ApiTransferAccount.TransferAccountType defaultSinkAccountType = Locality2.getDefaultSinkAccountType(supported, ((InternationalTransferFragment.Args) companion2.getArgs((HasSavedState) internationalTransferDuxo)).getTransferDirection());
                        this.label = 1;
                        obj = TransfersBonfireApi.DefaultImpls.getDisclosure$default(transfersBonfireApi, disclosureLocation, null, defaultSourceAccountType, defaultSinkAccountType, null, null, this, 50, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    objM28550constructorimpl = Result.m28550constructorimpl((ApiDisclosureUIResponse) obj);
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                return Result.m28549boximpl(objM28550constructorimpl);
            }
        }

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lkotlin/Result;", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3$2", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Result<? extends ApiDisclosureUIResponse>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InternationalTransferDuxo internationalTransferDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends ApiDisclosureUIResponse> result, Continuation<? super Unit> continuation) {
                return invoke(result.getValue(), continuation);
            }

            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Result.m28549boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3$2$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
                final /* synthetic */ Object $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Object obj, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
                    return ((AnonymousClass1) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) this.L$0;
                    Object obj2 = this.$it;
                    if (Result.m28555isFailureimpl(obj2)) {
                        obj2 = null;
                    }
                    return InternationalTransferDataState.copy$default(internationalTransferDataState, null, null, null, null, null, false, null, false, null, false, null, false, null, null, null, null, (ApiDisclosureUIResponse) obj2, null, null, null, null, null, null, 8323071, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1(((Result) this.L$0).getValue(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.transferAccountStore.refresh(true);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C307461(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C307472(null), 3, null);
        BalancesStore.refreshIndividualAccount$default(this.balancesStore, false, 1, null);
        LifecycleHost.DefaultImpls.bind$default(this, asObservable(this.balancesStore.streamIndividualAccountBrokerageBalances()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferDuxo.onStart$lambda$2(this.f$0, (BrokerageBalances) obj);
            }
        });
        this.portfolioStore.refreshIndividualAccountPortfolio(false);
        LifecycleHost.DefaultImpls.bind$default(this, this.portfolioStore.getIndividualAccountPortfolio(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferDuxo.onStart$lambda$3(this.f$0, (Portfolio) obj);
            }
        });
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$1 */
    static final class C307461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307461(Continuation<? super C307461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferDuxo.this.new C307461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(InternationalTransferDuxo.this.getLocalityFlow(), new C30735x651538b1(null, InternationalTransferDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InternationalTransferDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$1$2", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends TransferAccount>, ? extends CountryCode.Supported>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InternationalTransferDuxo internationalTransferDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends TransferAccount>, ? extends CountryCode.Supported> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<? extends List<TransferAccount>, ? extends CountryCode.Supported>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<? extends List<TransferAccount>, ? extends CountryCode.Supported> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$1$2$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
                final /* synthetic */ List<TransferAccount> $accounts;
                final /* synthetic */ CountryCode.Supported $locality;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CountryCode.Supported supported, List<TransferAccount> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$locality = supported;
                    this.$accounts = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$locality, this.$accounts, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
                    return ((AnonymousClass1) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    Object next;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) this.L$0;
                    CountryCode.Supported supported = this.$locality;
                    Intrinsics.checkNotNull(supported);
                    ApiTransferAccount.TransferAccountType defaultSourceAccountType = Locality2.getDefaultSourceAccountType(supported, internationalTransferDataState.getTransferDirection());
                    CountryCode.Supported supported2 = this.$locality;
                    Intrinsics.checkNotNull(supported2);
                    ApiTransferAccount.TransferAccountType defaultSinkAccountType = Locality2.getDefaultSinkAccountType(supported2, internationalTransferDataState.getTransferDirection());
                    List<TransferAccount> list = this.$accounts;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        obj2 = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((TransferAccount) next).getType() == defaultSourceAccountType) {
                            break;
                        }
                    }
                    TransferAccount transferAccount = (TransferAccount) next;
                    Iterator<T> it2 = this.$accounts.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((TransferAccount) next2).getType() == defaultSinkAccountType) {
                            obj2 = next2;
                            break;
                        }
                    }
                    return InternationalTransferDataState.copy$default(internationalTransferDataState, null, null, null, null, null, false, null, false, null, false, null, false, list, transferAccount, (TransferAccount) obj2, null, null, null, null, null, null, null, null, 8359935, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    Tuples2 tuples2 = (Tuples2) this.L$0;
                    List list = (List) tuples2.component1();
                    this.this$0.applyMutation(new AnonymousClass1((CountryCode.Supported) tuples2.component2(), list, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2", m3645f = "InternationalTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2 */
    static final class C307472 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C307472(Continuation<? super C307472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternationalTransferDuxo.this.new C307472(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C307472) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(InternationalTransferDuxo.this.getStateFlow(), new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo.onStart.2.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((InternationalTransferViewState) obj2).getTransferSummaryRequest();
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<ApiTransferSummaryRequest>() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ApiTransferSummaryRequest> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C307382(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$invokeSuspend$$inlined$map$1$2 */
                    public static final class C307382<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$invokeSuspend$$inlined$map$1$2", m3645f = "InternationalTransferDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C307382.this.emit(null, this);
                            }
                        }

                        public C307382(FlowCollector flowCollector) {
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
                                ApiTransferSummaryRequest transferSummaryRequest = ((InternationalTransferViewState) obj).getTransferSummaryRequest();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(transferSummaryRequest, anonymousClass1) == coroutine_suspended) {
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
                }, new C30737xbc332990(null, InternationalTransferDuxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(InternationalTransferDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n"}, m3636d2 = {"<anonymous>", "", "transferSummaryState", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "Lkotlin/internal/Exact;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$4", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<TransferSummaryState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternationalTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(InternationalTransferDuxo internationalTransferDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = internationalTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransferSummaryState transferSummaryState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(transferSummaryState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternationalTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$4$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onStart$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
                final /* synthetic */ TransferSummaryState $transferSummaryState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TransferSummaryState transferSummaryState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$transferSummaryState = transferSummaryState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transferSummaryState, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
                    return ((AnonymousClass1) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, null, null, null, false, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, this.$transferSummaryState, null, 6291455, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((TransferSummaryState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(InternationalTransferDuxo internationalTransferDuxo, BrokerageBalances brokerageBalances) {
        Intrinsics.checkNotNullParameter(brokerageBalances, "brokerageBalances");
        internationalTransferDuxo.applyMutation(new InternationalTransferDuxo6(brokerageBalances, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(InternationalTransferDuxo internationalTransferDuxo, Portfolio portfolio) {
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        internationalTransferDuxo.applyMutation(new InternationalTransferDuxo7(portfolio, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$setSessionId$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$setSessionId$1 */
    static final class C307481 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        final /* synthetic */ UUID $sessionId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307481(UUID uuid, Continuation<? super C307481> continuation) {
            super(2, continuation);
            this.$sessionId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307481 c307481 = new C307481(this.$sessionId, continuation);
            c307481.L$0 = obj;
            return c307481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307481) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, this.$sessionId, null, null, null, null, false, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388606, null);
        }
    }

    public final void setSessionId(UUID sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        applyMutation(new C307481(sessionId, null));
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$currencySwitcherSelected$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$currencySwitcherSelected$1 */
    static final class C307391 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C307391(Continuation<? super C307391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307391 c307391 = new C307391(continuation);
            c307391.L$0 = obj;
            return c307391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307391) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Currency localCurrency;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) this.L$0;
            Money amount = internationalTransferDataState.getAmount();
            CountryCode.Supported locality = internationalTransferDataState.getLocality();
            if (locality == null || (localCurrency = Locality2.getLocalCurrency(locality)) == null) {
                return internationalTransferDataState;
            }
            Tuples2<Money, String> toggledCurrencyAmountAndString = InternationalTransferCurrencyUtils.getToggledCurrencyAmountAndString(amount, localCurrency, internationalTransferDataState.getTransferDirection(), internationalTransferDataState.getFxQuote());
            return InternationalTransferDataState.copy$default(internationalTransferDataState, null, toggledCurrencyAmountAndString.component1(), null, null, toggledCurrencyAmountAndString.component2(), false, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388557, null);
        }
    }

    public final void currencySwitcherSelected() {
        applyMutation(new C307391(null));
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$numpadItemSelected$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$numpadItemSelected$1 */
    static final class C307411 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307411(KeyEvent keyEvent, Continuation<? super C307411> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307411 c307411 = new C307411(this.$keyEvent, continuation);
            c307411.L$0 = obj;
            return c307411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307411) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) this.L$0;
                MoneyInputConsumer moneyInputConsumer = InternationalTransferDuxo.inputKeyEventConsumer;
                BigDecimal decimalValue = internationalTransferDataState.getAmount().getDecimalValue();
                char[] charArray = internationalTransferDataState.getInputChars().toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = moneyInputConsumer.consume(new InputKeyEventConsumer.InputState(decimalValue, charArray), this.$keyEvent);
                return InternationalTransferDataState.copy$default(internationalTransferDataState, null, Money.copy$default(internationalTransferDataState.getAmount(), null, inputStateConsume.component1(), 1, null), null, null, new String(inputStateConsume.getInput()), true, null, false, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388557, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void numpadItemSelected(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C307411(keyEvent, null));
    }

    public final void continueSelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferDuxo.continueSelected$lambda$5(this.f$0, (InternationalTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit continueSelected$lambda$5(InternationalTransferDuxo internationalTransferDuxo, InternationalTransferDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getFxQuote() == null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            internationalTransferDuxo.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(0, companion.invoke(C30065R.string.general_error_something_went_wrong, new Object[0]), companion.invoke(C30065R.string.uk_transfer_generic_error_message, new Object[0]), companion.invoke(C11048R.string.general_label_dismiss, new Object[0]), null, 17, null));
            return Unit.INSTANCE;
        }
        if (state.getTransferDirection() == TransferDirection.WITHDRAW && state.getExternalAccount() == null) {
            int i = C30065R.id.dialog_id_uk_withdrawal_no_external_account_selected;
            StringResource.Companion companion2 = StringResource.INSTANCE;
            internationalTransferDuxo.submit(new InternationalTransferEvent.ShowTransferCreationGenericError(i, companion2.invoke(C30065R.string.uk_withdrawal_no_bank_account_selected_error_title, new Object[0]), companion2.invoke(C30065R.string.uk_withdrawal_no_bank_account_selected_error_text, new Object[0]), companion2.invoke(C30065R.string.uk_withdrawal_no_bank_account_selected_error_positive_button, new Object[0]), companion2.invoke(C11048R.string.general_label_cancel, new Object[0])));
            return Unit.INSTANCE;
        }
        InternationalTransferEvent internationalTransferEventCheck = internationalTransferDuxo.getPdtWarningCheck().check(new PdtWarningCheck.Input(state.getAmount().getDecimalValue(), state.getBrokerageBalances(), state.getPortfolio(), state.getTransferDirection()));
        if (internationalTransferEventCheck != null) {
            internationalTransferDuxo.submit(internationalTransferEventCheck);
            return Unit.INSTANCE;
        }
        internationalTransferDuxo.applyMutation(new InternationalTransferDuxo3(internationalTransferDuxo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onBackPressed$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onBackPressed$1 */
    static final class C307421 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: InternationalTransferDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$onBackPressed$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferMode.values().length];
                try {
                    iArr[TransferMode.EDIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferMode.REVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C307421(Continuation<? super C307421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307421 c307421 = InternationalTransferDuxo.this.new C307421(continuation);
            c307421.L$0 = obj;
            return c307421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307421) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternationalTransferDataState internationalTransferDataState = (InternationalTransferDataState) this.L$0;
            int i = WhenMappings.$EnumSwitchMapping$0[internationalTransferDataState.getMode().ordinal()];
            if (i == 1) {
                InternationalTransferDuxo.this.submit(InternationalTransferEvent.Exit.INSTANCE);
                return internationalTransferDataState;
            }
            if (i == 2) {
                return !internationalTransferDataState.getMakingTransfer() ? InternationalTransferDataState.copy$default(internationalTransferDataState, null, null, null, null, null, false, TransferMode.EDIT, true, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388383, null) : internationalTransferDataState;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean onBackPressed() {
        applyMutation(new C307421(null));
        return true;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$transferContinueSelected$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$transferContinueSelected$1 */
    static final class C307491 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C307491(Continuation<? super C307491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307491 c307491 = new C307491(continuation);
            c307491.L$0 = obj;
            return c307491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307491) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, null, null, null, false, null, false, null, true, null, false, null, null, null, null, null, null, null, null, null, null, null, 8388095, null);
        }
    }

    public final void transferContinueSelected(final Money amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        applyMutation(new C307491(null));
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferDuxo.transferContinueSelected$lambda$6(this.f$0, amount, (InternationalTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit transferContinueSelected$lambda$6(InternationalTransferDuxo internationalTransferDuxo, Money money, InternationalTransferDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(internationalTransferDuxo.getLifecycleScope(), null, null, new InternationalTransferDuxo8(internationalTransferDuxo, state, money, null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$externalAccountSelected$1", m3645f = "InternationalTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$externalAccountSelected$1 */
    static final class C307401 extends ContinuationImpl7 implements Function2<InternationalTransferDataState, Continuation<? super InternationalTransferDataState>, Object> {
        final /* synthetic */ TransferAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C307401(TransferAccount transferAccount, Continuation<? super C307401> continuation) {
            super(2, continuation);
            this.$account = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C307401 c307401 = new C307401(this.$account, continuation);
            c307401.L$0 = obj;
            return c307401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternationalTransferDataState internationalTransferDataState, Continuation<? super InternationalTransferDataState> continuation) {
            return ((C307401) create(internationalTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternationalTransferDataState.copy$default((InternationalTransferDataState) this.L$0, null, null, null, null, null, false, null, false, null, false, this.$account, true, null, null, null, null, null, null, null, null, null, null, null, 8385535, null);
        }
    }

    public final void externalAccountSelected(TransferAccount account) {
        applyMutation(new C307401(account, null));
    }

    public final void onAccountSelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.InternationalTransferDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalTransferDuxo.onAccountSelected$lambda$8(this.f$0, (InternationalTransferDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccountSelected$lambda$8(InternationalTransferDuxo internationalTransferDuxo, InternationalTransferDataState it) {
        TransferAccountDirection transferAccountDirection;
        Intrinsics.checkNotNullParameter(it, "it");
        List<TransferAccount> accounts2 = it.getAccounts();
        if (accounts2 != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[it.getTransferDirection().ordinal()];
            if (i == 1) {
                transferAccountDirection = TransferAccountDirection.SOURCE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                transferAccountDirection = TransferAccountDirection.SINK;
            }
            TransferAccountDirection transferAccountDirection2 = transferAccountDirection;
            internationalTransferDuxo.submit(new InternationalTransferEvent.SelectAccount(new TransferAccountSelectionKey(null, transferAccountDirection2, accounts2, null, true, null, null, false, null, Boolean.TRUE, null, null, null, it.getEventContext(), null, null, 56577, null)));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InternationalTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferDuxo;", "Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferFragment$Args;", "<init>", "()V", "inputKeyEventConsumer", "Lcom/robinhood/android/transfers/ui/max/i18n/MoneyInputConsumer;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternationalTransferDuxo, InternationalTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternationalTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternationalTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternationalTransferFragment.Args getArgs(InternationalTransferDuxo internationalTransferDuxo) {
            return (InternationalTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internationalTransferDuxo);
        }
    }
}
