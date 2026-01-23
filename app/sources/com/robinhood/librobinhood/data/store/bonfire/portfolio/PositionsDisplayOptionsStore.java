package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.PositionsDisplayOptions;
import com.robinhood.android.models.portfolio.PositionsDisplayOptionsDao;
import com.robinhood.android.models.portfolio.SelectedPositionsDisplayOption;
import com.robinhood.android.models.portfolio.SelectedPositionsDisplayOptionDao;
import com.robinhood.android.models.portfolio.api.ApiPositionsDisplayOptions;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: PositionsDisplayOptionsStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\u0010 \u001a\u00060\u0016j\u0002`!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "Lcom/robinhood/store/Store;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "displayOptionsDao", "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptionsDao;", "selectedPositionsDisplayOptionDao", "Lcom/robinhood/android/models/portfolio/SelectedPositionsDisplayOptionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/portfolio/PortfolioApi;Lcom/robinhood/android/models/portfolio/PositionsDisplayOptionsDao;Lcom/robinhood/android/models/portfolio/SelectedPositionsDisplayOptionDao;Lcom/robinhood/store/StoreBundle;)V", "displayOptionsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore$DisplayOptionsRequestParams;", "Lcom/robinhood/android/models/portfolio/api/ApiPositionsDisplayOptions;", "displayOptionsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/models/portfolio/PositionsDisplayOptions;", "streamDisplayOptions", "Lio/reactivex/Observable;", "accountNumber", "", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "streamSelectedPositionsDisplayOption", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/portfolio/SelectedPositionsDisplayOption;", "updateSelectedPositionDisplayOption", "", "displayOption", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "DisplayOptionsRequestParams", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PositionsDisplayOptionsStore extends Store {
    public static final String DEFAULT_DISPLAY_TYPE = "last-price";
    private final PositionsDisplayOptionsDao displayOptionsDao;
    private final Endpoint<DisplayOptionsRequestParams, ApiPositionsDisplayOptions> displayOptionsEndpoint;
    private final Query<DisplayOptionsRequestParams, PositionsDisplayOptions> displayOptionsQuery;
    private final PortfolioApi portfolioApi;
    private final SelectedPositionsDisplayOptionDao selectedPositionsDisplayOptionDao;
    private static final Duration DISPLAY_OPTIONS_STALE_TIME = Duration.ofMinutes(5);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsDisplayOptionsStore(PortfolioApi portfolioApi, PositionsDisplayOptionsDao displayOptionsDao, SelectedPositionsDisplayOptionDao selectedPositionsDisplayOptionDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        Intrinsics.checkNotNullParameter(displayOptionsDao, "displayOptionsDao");
        Intrinsics.checkNotNullParameter(selectedPositionsDisplayOptionDao, "selectedPositionsDisplayOptionDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.portfolioApi = portfolioApi;
        this.displayOptionsDao = displayOptionsDao;
        this.selectedPositionsDisplayOptionDao = selectedPositionsDisplayOptionDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration DISPLAY_OPTIONS_STALE_TIME2 = DISPLAY_OPTIONS_STALE_TIME;
        Intrinsics.checkNotNullExpressionValue(DISPLAY_OPTIONS_STALE_TIME2, "DISPLAY_OPTIONS_STALE_TIME");
        Endpoint<DisplayOptionsRequestParams, ApiPositionsDisplayOptions> endpointCreateWithParams = companion.createWithParams(new PositionsDisplayOptionsStore2(this, null), logoutKillswitch, new PositionsDisplayOptionsStore3(this, null), clock, new DefaultStaleDecider(DISPLAY_OPTIONS_STALE_TIME2, storeBundle.getClock()));
        this.displayOptionsEndpoint = endpointCreateWithParams;
        this.displayOptionsQuery = Store.create$default(this, Query.INSTANCE, "positionValueDisplayOptionsQuery", CollectionsKt.listOf(new RefreshEach(new PositionsDisplayOptionsStore4(endpointCreateWithParams))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PositionsDisplayOptionsStore.displayOptionsQuery$lambda$0(this.f$0, (PositionsDisplayOptionsStore.DisplayOptionsRequestParams) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow displayOptionsQuery$lambda$0(PositionsDisplayOptionsStore positionsDisplayOptionsStore, DisplayOptionsRequestParams displayOptionsRequestParams) {
        Intrinsics.checkNotNullParameter(displayOptionsRequestParams, "<destruct>");
        return positionsDisplayOptionsStore.displayOptionsDao.stream(displayOptionsRequestParams.getAccountNumber(), displayOptionsRequestParams.getInstrumentType(), displayOptionsRequestParams.getDisplayCurrency());
    }

    public static /* synthetic */ Observable streamDisplayOptions$default(PositionsDisplayOptionsStore positionsDisplayOptionsStore, String str, PositionInstrumentType positionInstrumentType, DisplayCurrency displayCurrency, int i, Object obj) {
        if ((i & 4) != 0) {
            displayCurrency = null;
        }
        return positionsDisplayOptionsStore.streamDisplayOptions(str, positionInstrumentType, displayCurrency);
    }

    public final Observable<PositionsDisplayOptions> streamDisplayOptions(String accountNumber, PositionInstrumentType instrumentType, DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        if (displayCurrency == null) {
            displayCurrency = DisplayCurrency.USD;
        }
        return asObservable(this.displayOptionsQuery.asFlow(new DisplayOptionsRequestParams(accountNumber, instrumentType, displayCurrency)));
    }

    public final Observable<Optional<SelectedPositionsDisplayOption>> streamSelectedPositionsDisplayOption(String accountNumber, PositionInstrumentType instrumentType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        return asObservable(FlowKt.distinctUntilChanged(FlowKt.onStart(Operators.toOptionals(FlowKt.filterNotNull(this.selectedPositionsDisplayOptionDao.stream(accountNumber, instrumentType))), new C346791(null))));
    }

    /* compiled from: PositionsDisplayOptionsStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/models/portfolio/SelectedPositionsDisplayOption;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$streamSelectedPositionsDisplayOption$1", m3645f = "PositionsDisplayOptionsStore.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$streamSelectedPositionsDisplayOption$1 */
    static final class C346791 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends SelectedPositionsDisplayOption>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C346791(Continuation<? super C346791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C346791 c346791 = new C346791(continuation);
            c346791.L$0 = obj;
            return c346791;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends SelectedPositionsDisplayOption>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<SelectedPositionsDisplayOption>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<SelectedPositionsDisplayOption>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C346791) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Optional2 optional2 = Optional2.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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

    /* compiled from: PositionsDisplayOptionsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$updateSelectedPositionDisplayOption$1", m3645f = "PositionsDisplayOptionsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore$updateSelectedPositionDisplayOption$1 */
    static final class C346801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $displayOption;
        final /* synthetic */ PositionInstrumentType $instrumentType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C346801(String str, PositionInstrumentType positionInstrumentType, String str2, Continuation<? super C346801> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$instrumentType = positionInstrumentType;
            this.$displayOption = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionsDisplayOptionsStore.this.new C346801(this.$accountNumber, this.$instrumentType, this.$displayOption, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C346801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PositionsDisplayOptionsStore.this.selectedPositionsDisplayOptionDao.insert(new SelectedPositionsDisplayOption(this.$accountNumber, this.$instrumentType, this.$displayOption));
            return Unit.INSTANCE;
        }
    }

    public final void updateSelectedPositionDisplayOption(String accountNumber, PositionInstrumentType instrumentType, String displayOption) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(displayOption, "displayOption");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C346801(accountNumber, instrumentType, displayOption, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PositionsDisplayOptionsStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore$DisplayOptionsRequestParams;", "", "accountNumber", "", "instrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "displayCurrency", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;)V", "getAccountNumber", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getDisplayCurrency", "()Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class DisplayOptionsRequestParams {
        private final String accountNumber;
        private final DisplayCurrency displayCurrency;
        private final PositionInstrumentType instrumentType;

        public static /* synthetic */ DisplayOptionsRequestParams copy$default(DisplayOptionsRequestParams displayOptionsRequestParams, String str, PositionInstrumentType positionInstrumentType, DisplayCurrency displayCurrency, int i, Object obj) {
            if ((i & 1) != 0) {
                str = displayOptionsRequestParams.accountNumber;
            }
            if ((i & 2) != 0) {
                positionInstrumentType = displayOptionsRequestParams.instrumentType;
            }
            if ((i & 4) != 0) {
                displayCurrency = displayOptionsRequestParams.displayCurrency;
            }
            return displayOptionsRequestParams.copy(str, positionInstrumentType, displayCurrency);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        /* renamed from: component3, reason: from getter */
        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }

        public final DisplayOptionsRequestParams copy(String accountNumber, PositionInstrumentType instrumentType, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            return new DisplayOptionsRequestParams(accountNumber, instrumentType, displayCurrency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayOptionsRequestParams)) {
                return false;
            }
            DisplayOptionsRequestParams displayOptionsRequestParams = (DisplayOptionsRequestParams) other;
            return Intrinsics.areEqual(this.accountNumber, displayOptionsRequestParams.accountNumber) && this.instrumentType == displayOptionsRequestParams.instrumentType && this.displayCurrency == displayOptionsRequestParams.displayCurrency;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.instrumentType.hashCode()) * 31) + this.displayCurrency.hashCode();
        }

        public String toString() {
            return "DisplayOptionsRequestParams(accountNumber=" + this.accountNumber + ", instrumentType=" + this.instrumentType + ", displayCurrency=" + this.displayCurrency + ")";
        }

        public DisplayOptionsRequestParams(String accountNumber, PositionInstrumentType instrumentType, DisplayCurrency displayCurrency) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
            this.accountNumber = accountNumber;
            this.instrumentType = instrumentType;
            this.displayCurrency = displayCurrency;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PositionInstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final DisplayCurrency getDisplayCurrency() {
            return this.displayCurrency;
        }
    }
}
