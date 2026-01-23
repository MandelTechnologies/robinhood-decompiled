package com.robinhood.librobinhood.data.store;

import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionMarketHoursParam;
import com.robinhood.models.p320db.OptionMarketHoursParam2;
import com.robinhood.models.p320db.OptionTradingSession;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OptionMarketHoursStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000e¢\u0006\u0004\b%\u0010&J+\u0010(\u001a\b\u0012\u0004\u0012\u00020!0'2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b(\u0010)J5\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00170,0'2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150*¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100¨\u00061"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "optionsExtendedHoursEnabledStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/models/db/OptionMarketHoursParam;", "optionMarketHoursParam", "", "isIndexOptionsExtendedHoursEnabled", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/MarketHours;", "streamCurrentOrNextMarketHours", "(Lcom/robinhood/models/db/OptionMarketHoursParam;Z)Lio/reactivex/Observable;", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "marketHoursToday", "j$/time/LocalDate", "expirationDate", "j$/time/Instant", "now", "Lcom/robinhood/models/db/OptionTradingSession$EquityOptions;", "getCurrentEquityOptionTradingSession", "(Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/MarketHours;Lj$/time/LocalDate;Lj$/time/Instant;)Lcom/robinhood/models/db/OptionTradingSession$EquityOptions;", "Lcom/robinhood/models/db/OptionTradingSession$IndexOption;", "getCurrentIndexOptionTradingSession", "(Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/MarketHours;Lj$/time/LocalDate;Lj$/time/Instant;Z)Lcom/robinhood/models/db/OptionTradingSession$IndexOption;", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "Lcom/robinhood/models/db/OptionTradingSession;", "getCurrentOptionTradingSession", "(Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lcom/robinhood/models/db/MarketHours;Lj$/time/LocalDate;Lj$/time/Instant;Z)Lcom/robinhood/models/db/OptionTradingSession;", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "streamCurrentOrNextMarketDates", "()Lio/reactivex/Observable;", "Lkotlinx/coroutines/flow/Flow;", "currentOptionTradingSession", "(Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lj$/time/LocalDate;)Lkotlinx/coroutines/flow/Flow;", "", "expirationDates", "", "streamExpirationTimes", "(Lcom/robinhood/models/db/OptionChain;Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/OptionsExtendedHoursEnabledStore;", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionMarketHoursStore extends Store {
    private final MarketHoursStore marketHoursStore;
    private final OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore;

    /* compiled from: OptionMarketHoursStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionMarketHoursStore(OptionsExtendedHoursEnabledStore optionsExtendedHoursEnabledStore, MarketHoursStore marketHoursStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionsExtendedHoursEnabledStore, "optionsExtendedHoursEnabledStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionsExtendedHoursEnabledStore = optionsExtendedHoursEnabledStore;
        this.marketHoursStore = marketHoursStore;
    }

    public final Observable<OptionCurrentOrNextMarketDates> streamCurrentOrNextMarketDates() {
        Observable<OptionCurrentOrNextMarketDates> observableFlatMap = asObservable(this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled()).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionMarketHoursStore.streamCurrentOrNextMarketDates.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends OptionCurrentOrNextMarketDates> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.combineLatest(OptionMarketHoursStore.this.streamCurrentOrNextMarketHours(OptionMarketHoursParam.EQUITY_OPTION_NON_LATE_CLOSE, it.booleanValue()), OptionMarketHoursStore.this.streamCurrentOrNextMarketHours(OptionMarketHoursParam.EQUITY_OPTION_LATE_CLOSE, it.booleanValue()), OptionMarketHoursStore.this.streamCurrentOrNextMarketHours(OptionMarketHoursParam.INDEX_OPTION_0DTE, it.booleanValue()), OptionMarketHoursStore.this.streamCurrentOrNextMarketHours(OptionMarketHoursParam.INDEX_OPTION_NON_0DTE, it.booleanValue()), OptionMarketHoursStore.this.streamCurrentOrNextMarketHours(OptionMarketHoursParam.EXTENDED_HOURS_INDEX_OPTION_NON_0DTE, it.booleanValue()), new Function5() { // from class: com.robinhood.librobinhood.data.store.OptionMarketHoursStore.streamCurrentOrNextMarketDates.1.1
                    @Override // io.reactivex.functions.Function5
                    public final OptionCurrentOrNextMarketDates apply(MarketHours marketHours, MarketHours marketHoursWithLateClose, MarketHours marketHoursWithIndex0Dte, MarketHours marketHoursWithIndexNon0Dte, MarketHours marketHoursWithCurbEligibleIndexNon0Dte) {
                        Intrinsics.checkNotNullParameter(marketHours, "marketHours");
                        Intrinsics.checkNotNullParameter(marketHoursWithLateClose, "marketHoursWithLateClose");
                        Intrinsics.checkNotNullParameter(marketHoursWithIndex0Dte, "marketHoursWithIndex0Dte");
                        Intrinsics.checkNotNullParameter(marketHoursWithIndexNon0Dte, "marketHoursWithIndexNon0Dte");
                        Intrinsics.checkNotNullParameter(marketHoursWithCurbEligibleIndexNon0Dte, "marketHoursWithCurbEligibleIndexNon0Dte");
                        return new OptionCurrentOrNextMarketDates(marketHours.getDate(), marketHoursWithLateClose.getDate(), marketHoursWithIndex0Dte.getDate(), marketHoursWithIndexNon0Dte.getDate(), marketHoursWithCurbEligibleIndexNon0Dte.getDate());
                    }
                }).distinctUntilChanged();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<MarketHours> streamCurrentOrNextMarketHours(OptionMarketHoursParam optionMarketHoursParam, boolean isIndexOptionsExtendedHoursEnabled) {
        return this.marketHoursStore.getAndRefreshCurrentOrNextOpenMarketHoursForOptions(optionMarketHoursParam, isIndexOptionsExtendedHoursEnabled);
    }

    private final OptionTradingSession.EquityOptions getCurrentEquityOptionTradingSession(OptionChain optionChain, MarketHours marketHoursToday, LocalDate expirationDate, Instant now) {
        if (Instants.toLocalDate(now, ZoneIds.INSTANCE.getNEW_YORK()).compareTo((ChronoLocalDate) expirationDate) > 0) {
            return OptionTradingSession.EquityOptions.Closed.INSTANCE;
        }
        if (OptionMarketHoursParam2.isInOptionRegularTradingOpenHours(marketHoursToday, now, OptionMarketHoursParam2.getEquityOptionMarketHoursParam(optionChain.getIsLateClosing()))) {
            return OptionTradingSession.EquityOptions.Regular.INSTANCE;
        }
        return OptionTradingSession.EquityOptions.Closed.INSTANCE;
    }

    private final OptionTradingSession.IndexOption getCurrentIndexOptionTradingSession(OptionChain optionChain, MarketHours marketHoursToday, LocalDate expirationDate, Instant now, boolean isIndexOptionsExtendedHoursEnabled) {
        LocalDate localDate = Instants.toLocalDate(now, ZoneIds.INSTANCE.getNEW_YORK());
        if (localDate.compareTo((ChronoLocalDate) expirationDate) > 0) {
            return OptionTradingSession.IndexOption.Closed.INSTANCE;
        }
        if (Intrinsics.areEqual(localDate, expirationDate)) {
            if (optionChain.getSettleOnOpen()) {
                return OptionTradingSession.IndexOption.Closed.INSTANCE;
            }
            if (OptionMarketHoursParam2.isInOptionRegularTradingOpenHours(marketHoursToday, now, OptionMarketHoursParam.INDEX_OPTION_0DTE)) {
                return OptionTradingSession.IndexOption.Regular.INSTANCE;
            }
            return OptionTradingSession.IndexOption.Closed.INSTANCE;
        }
        OptionMarketHoursParam indexOptionMarketHoursParam = OptionMarketHoursParam2.getIndexOptionMarketHoursParam(optionChain, expirationDate, localDate);
        if (OptionMarketHoursParam2.isInOptionRegularTradingOpenHours(marketHoursToday, now, indexOptionMarketHoursParam)) {
            return OptionTradingSession.IndexOption.Regular.INSTANCE;
        }
        if (OptionMarketHoursParam2.isInIndexOptionCurbHours(marketHoursToday, now, indexOptionMarketHoursParam, isIndexOptionsExtendedHoursEnabled)) {
            return OptionTradingSession.IndexOption.Curb.INSTANCE;
        }
        return OptionTradingSession.IndexOption.Closed.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionTradingSession getCurrentOptionTradingSession(OptionChain optionChain, OptionChain.UnderlyingType underlyingType, MarketHours marketHoursToday, LocalDate expirationDate, Instant now, boolean isIndexOptionsExtendedHoursEnabled) {
        int i = WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
        if (i == 1) {
            return getCurrentEquityOptionTradingSession(optionChain, marketHoursToday, expirationDate, now);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return getCurrentIndexOptionTradingSession(optionChain, marketHoursToday, expirationDate, now, isIndexOptionsExtendedHoursEnabled);
    }

    public final Flow<OptionTradingSession> currentOptionTradingSession(OptionChain optionChain, OptionChain.UnderlyingType underlyingType, LocalDate expirationDate) {
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        return FlowKt.flowCombine(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.marketHoursStore.streamTime()), Integer.MAX_VALUE, null, 2, null), new C34043x4116777c(null, this)), this.optionsExtendedHoursEnabledStore.isIndexOptionsExtendedHoursEnabled(), new C340452(optionChain, underlyingType, expirationDate, null));
    }

    /* compiled from: OptionMarketHoursStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m3636d2 = {"Lkotlin/Pair;", "Lcom/robinhood/models/db/MarketHours;", "j$/time/Instant", "<destruct>", "", "isIndexOptionsExtendedHoursEnabled", "Lcom/robinhood/models/db/OptionTradingSession;", "<anonymous>", "(Lkotlin/Pair;Z)Lcom/robinhood/models/db/OptionTradingSession;"}, m3637k = 3, m3638mv = {2, 1, 0})
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionMarketHoursStore$currentOptionTradingSession$2", m3645f = "OptionMarketHoursStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OptionMarketHoursStore$currentOptionTradingSession$2 */
    static final class C340452 extends ContinuationImpl7 implements Function3<Tuples2<? extends MarketHours, ? extends Instant>, Boolean, Continuation<? super OptionTradingSession>, Object> {
        final /* synthetic */ LocalDate $expirationDate;
        final /* synthetic */ OptionChain $optionChain;
        final /* synthetic */ OptionChain.UnderlyingType $underlyingType;
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C340452(OptionChain optionChain, OptionChain.UnderlyingType underlyingType, LocalDate localDate, Continuation<? super C340452> continuation) {
            super(3, continuation);
            this.$optionChain = optionChain;
            this.$underlyingType = underlyingType;
            this.$expirationDate = localDate;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends MarketHours, ? extends Instant> tuples2, Boolean bool, Continuation<? super OptionTradingSession> continuation) {
            return invoke((Tuples2<MarketHours, Instant>) tuples2, bool.booleanValue(), continuation);
        }

        public final Object invoke(Tuples2<MarketHours, Instant> tuples2, boolean z, Continuation<? super OptionTradingSession> continuation) {
            C340452 c340452 = OptionMarketHoursStore.this.new C340452(this.$optionChain, this.$underlyingType, this.$expirationDate, continuation);
            c340452.L$0 = tuples2;
            c340452.Z$0 = z;
            return c340452.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                boolean z = this.Z$0;
                return OptionMarketHoursStore.this.getCurrentOptionTradingSession(this.$optionChain, this.$underlyingType, (MarketHours) tuples2.component1(), this.$expirationDate, (Instant) tuples2.component2(), z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Flow<Map<LocalDate, Instant>> streamExpirationTimes(final OptionChain optionChain, List<LocalDate> expirationDates) {
        Intrinsics.checkNotNullParameter(optionChain, "optionChain");
        Intrinsics.checkNotNullParameter(expirationDates, "expirationDates");
        Iterator<T> it = expirationDates.iterator();
        while (it.hasNext()) {
            this.marketHoursStore.refreshWithoutEviction(false, (LocalDate) it.next());
        }
        ObservableSource map = this.marketHoursStore.getMarketHoursList(expirationDates).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionMarketHoursStore.streamExpirationTimes.2
            @Override // io.reactivex.functions.Function
            public final Map<LocalDate, Instant> apply(List<MarketHours> marketHoursList) {
                Intrinsics.checkNotNullParameter(marketHoursList, "marketHoursList");
                List<MarketHours> list = marketHoursList;
                OptionChain optionChain2 = optionChain;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (MarketHours marketHours : list) {
                    Instant regularOpensAt = optionChain2.getSettleOnOpen() ? marketHours.getRegularOpensAt() : null;
                    Instant lateOptionClosesAt = optionChain2.getIsLateClosing() ? marketHours.getLateOptionClosesAt() : null;
                    if (regularOpensAt == null) {
                        regularOpensAt = lateOptionClosesAt == null ? marketHours.getRegularClosesAt() : lateOptionClosesAt;
                    }
                    Tuples2 tuples2M3642to = Tuples4.m3642to(marketHours.getDate(), regularOpensAt);
                    linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                }
                return linkedHashMap;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
    }
}
