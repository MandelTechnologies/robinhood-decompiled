package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.models.p320db.OptionChain;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: OptionsSimulatedReturnSliderLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "", "<init>", "()V", "Price", "Time", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionsSimulatedReturnSliderLaunchMode {
    public static final int $stable = 0;

    public /* synthetic */ OptionsSimulatedReturnSliderLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsSimulatedReturnSliderLaunchMode() {
    }

    /* compiled from: OptionsSimulatedReturnSliderLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Price;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/UUID;)V", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Price extends OptionsSimulatedReturnSliderLaunchMode {
        public static final int $stable = 8;
        private final UUID underlyingId;
        private final OptionChain.UnderlyingType underlyingType;

        public static /* synthetic */ Price copy$default(Price price, OptionChain.UnderlyingType underlyingType, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                underlyingType = price.underlyingType;
            }
            if ((i & 2) != 0) {
                uuid = price.underlyingId;
            }
            return price.copy(underlyingType, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getUnderlyingId() {
            return this.underlyingId;
        }

        public final Price copy(OptionChain.UnderlyingType underlyingType, UUID underlyingId) {
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
            return new Price(underlyingType, underlyingId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return this.underlyingType == price.underlyingType && Intrinsics.areEqual(this.underlyingId, price.underlyingId);
        }

        public int hashCode() {
            return (this.underlyingType.hashCode() * 31) + this.underlyingId.hashCode();
        }

        public String toString() {
            return "Price(underlyingType=" + this.underlyingType + ", underlyingId=" + this.underlyingId + ")";
        }

        public final OptionChain.UnderlyingType getUnderlyingType() {
            return this.underlyingType;
        }

        public final UUID getUnderlyingId() {
            return this.underlyingId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Price(OptionChain.UnderlyingType underlyingType, UUID underlyingId) {
            super(null);
            Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
            Intrinsics.checkNotNullParameter(underlyingId, "underlyingId");
            this.underlyingType = underlyingType;
            this.underlyingId = underlyingId;
        }
    }

    /* compiled from: OptionsSimulatedReturnSliderLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "<init>", "()V", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionChain;", "j$/time/LocalDate", "getOptionChainToExpDateForExpTime", "()Lkotlin/Pair;", "optionChainToExpDateForExpTime", "Default", "PortfolioRiskAnalyzer", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time$Default;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time$PortfolioRiskAnalyzer;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Time extends OptionsSimulatedReturnSliderLaunchMode {
        public static final int $stable = 0;

        public /* synthetic */ Time(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Tuples2<OptionChain, LocalDate> getOptionChainToExpDateForExpTime();

        private Time() {
            super(null);
        }

        /* compiled from: OptionsSimulatedReturnSliderLaunchMode.kt */
        @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time$Default;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "Lcom/robinhood/models/db/OptionChain;", "optionChain", "j$/time/LocalDate", "earliestExpirationDate", "<init>", "(Lcom/robinhood/models/db/OptionChain;Lj$/time/LocalDate;)V", "component1", "()Lcom/robinhood/models/db/OptionChain;", "component2", "()Lj$/time/LocalDate;", "copy", "(Lcom/robinhood/models/db/OptionChain;Lj$/time/LocalDate;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time$Default;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/OptionChain;", "getOptionChain", "Lj$/time/LocalDate;", "getEarliestExpirationDate", "Lkotlin/Pair;", "getOptionChainToExpDateForExpTime", "()Lkotlin/Pair;", "optionChainToExpDateForExpTime", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Default extends Time {
            public static final int $stable = 8;
            private final LocalDate earliestExpirationDate;
            private final OptionChain optionChain;

            public static /* synthetic */ Default copy$default(Default r0, OptionChain optionChain, LocalDate localDate, int i, Object obj) {
                if ((i & 1) != 0) {
                    optionChain = r0.optionChain;
                }
                if ((i & 2) != 0) {
                    localDate = r0.earliestExpirationDate;
                }
                return r0.copy(optionChain, localDate);
            }

            /* renamed from: component1, reason: from getter */
            public final OptionChain getOptionChain() {
                return this.optionChain;
            }

            /* renamed from: component2, reason: from getter */
            public final LocalDate getEarliestExpirationDate() {
                return this.earliestExpirationDate;
            }

            public final Default copy(OptionChain optionChain, LocalDate earliestExpirationDate) {
                Intrinsics.checkNotNullParameter(optionChain, "optionChain");
                Intrinsics.checkNotNullParameter(earliestExpirationDate, "earliestExpirationDate");
                return new Default(optionChain, earliestExpirationDate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r5 = (Default) other;
                return Intrinsics.areEqual(this.optionChain, r5.optionChain) && Intrinsics.areEqual(this.earliestExpirationDate, r5.earliestExpirationDate);
            }

            public int hashCode() {
                return (this.optionChain.hashCode() * 31) + this.earliestExpirationDate.hashCode();
            }

            public String toString() {
                return "Default(optionChain=" + this.optionChain + ", earliestExpirationDate=" + this.earliestExpirationDate + ")";
            }

            public final OptionChain getOptionChain() {
                return this.optionChain;
            }

            public final LocalDate getEarliestExpirationDate() {
                return this.earliestExpirationDate;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(OptionChain optionChain, LocalDate earliestExpirationDate) {
                super(null);
                Intrinsics.checkNotNullParameter(optionChain, "optionChain");
                Intrinsics.checkNotNullParameter(earliestExpirationDate, "earliestExpirationDate");
                this.optionChain = optionChain;
                this.earliestExpirationDate = earliestExpirationDate;
            }

            @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode.Time
            public Tuples2<OptionChain, LocalDate> getOptionChainToExpDateForExpTime() {
                return Tuples4.m3642to(this.optionChain, this.earliestExpirationDate);
            }
        }

        /* compiled from: OptionsSimulatedReturnSliderLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time$PortfolioRiskAnalyzer;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "", "Lcom/robinhood/models/db/OptionChain;", "", "j$/time/LocalDate", "chainToExpirationDatesWithDuplicates", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time$PortfolioRiskAnalyzer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getChainToExpirationDatesWithDuplicates", "showEmptySlider", "Z", "getShowEmptySlider", "()Z", "Lkotlin/Pair;", "getOptionChainToExpDateForExpTime", "()Lkotlin/Pair;", "optionChainToExpDateForExpTime", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final /* data */ class PortfolioRiskAnalyzer extends Time {
            public static final int $stable = 8;
            private final Map<OptionChain, List<LocalDate>> chainToExpirationDatesWithDuplicates;
            private final boolean showEmptySlider;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ PortfolioRiskAnalyzer copy$default(PortfolioRiskAnalyzer portfolioRiskAnalyzer, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = portfolioRiskAnalyzer.chainToExpirationDatesWithDuplicates;
                }
                return portfolioRiskAnalyzer.copy(map);
            }

            public final Map<OptionChain, List<LocalDate>> component1() {
                return this.chainToExpirationDatesWithDuplicates;
            }

            public final PortfolioRiskAnalyzer copy(Map<OptionChain, ? extends List<LocalDate>> chainToExpirationDatesWithDuplicates) {
                Intrinsics.checkNotNullParameter(chainToExpirationDatesWithDuplicates, "chainToExpirationDatesWithDuplicates");
                return new PortfolioRiskAnalyzer(chainToExpirationDatesWithDuplicates);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PortfolioRiskAnalyzer) && Intrinsics.areEqual(this.chainToExpirationDatesWithDuplicates, ((PortfolioRiskAnalyzer) other).chainToExpirationDatesWithDuplicates);
            }

            public int hashCode() {
                return this.chainToExpirationDatesWithDuplicates.hashCode();
            }

            public String toString() {
                return "PortfolioRiskAnalyzer(chainToExpirationDatesWithDuplicates=" + this.chainToExpirationDatesWithDuplicates + ")";
            }

            public final Map<OptionChain, List<LocalDate>> getChainToExpirationDatesWithDuplicates() {
                return this.chainToExpirationDatesWithDuplicates;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public PortfolioRiskAnalyzer(Map<OptionChain, ? extends List<LocalDate>> chainToExpirationDatesWithDuplicates) {
                super(null);
                Intrinsics.checkNotNullParameter(chainToExpirationDatesWithDuplicates, "chainToExpirationDatesWithDuplicates");
                this.chainToExpirationDatesWithDuplicates = chainToExpirationDatesWithDuplicates;
                this.showEmptySlider = chainToExpirationDatesWithDuplicates.isEmpty();
            }

            public final boolean getShowEmptySlider() {
                return this.showEmptySlider;
            }

            @Override // com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode.Time
            public Tuples2<OptionChain, LocalDate> getOptionChainToExpDateForExpTime() {
                LocalDate localDate;
                Map<OptionChain, List<LocalDate>> map = this.chainToExpirationDatesWithDuplicates;
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    if (it2.hasNext()) {
                        LocalDate localDate2 = (LocalDate) it2.next();
                        while (it2.hasNext()) {
                            LocalDate localDate3 = (LocalDate) it2.next();
                            if (localDate2.compareTo(localDate3) < 0) {
                                localDate2 = localDate3;
                            }
                        }
                        localDate = localDate2;
                    } else {
                        localDate = null;
                    }
                    linkedHashMap.put(key, localDate);
                }
                List list = MapsKt.toList(linkedHashMap);
                ArrayList arrayList = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Tuples2 nullable = PairUtils.toNullable((Tuples2) it3.next());
                    if (nullable != null) {
                        arrayList.add(nullable);
                    }
                }
                return (Tuples2) CollectionsKt.maxWithOrNull(arrayList, new Comparator() { // from class: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode$Time$PortfolioRiskAnalyzer$optionChainToExpDateForExpTime$1
                    @Override // java.util.Comparator
                    public final int compare(Tuples2<OptionChain, LocalDate> tuples2, Tuples2<OptionChain, LocalDate> tuples22) {
                        OptionChain optionChainComponent1 = tuples2.component1();
                        LocalDate localDateComponent2 = tuples2.component2();
                        tuples22.component1();
                        LocalDate localDateComponent22 = tuples22.component2();
                        if (localDateComponent2.isAfter(localDateComponent22)) {
                            return 1;
                        }
                        if (localDateComponent2.isBefore(localDateComponent22)) {
                            return -1;
                        }
                        if (optionChainComponent1.getIsLateClosing()) {
                            return 1;
                        }
                        return optionChainComponent1.getSettleOnOpen() ? -1 : 0;
                    }
                });
            }
        }
    }
}
