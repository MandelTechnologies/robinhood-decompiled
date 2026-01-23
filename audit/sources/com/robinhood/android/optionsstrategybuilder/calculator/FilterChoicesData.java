package com.robinhood.android.optionsstrategybuilder.calculator;

import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.extensions.StrikeConditions;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;

/* compiled from: FilterChoicesData.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017JX\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u001bR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b/\u0010\u0017R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b0\u0010\u0017R\u0017\u00101\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u00106\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R)\u0010=\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00020:8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "", "", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "adjustedExpirationDateStates", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "template", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "Lcom/robinhood/models/db/OptionInstrument;", "firstLegOptionInstruments", "secondLegOptionInstruments", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/OptionStrategyChainTemplate;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/List;Ljava/util/List;)V", "", "strikeIndex", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$StrikeChoice;", "getStrikeChoices", "(Ljava/lang/Integer;Lcom/robinhood/models/db/OptionChain$UnderlyingType;)Ljava/util/List;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice$SpreadWidthChoice;", "getSpreadWidthChoices", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;)Ljava/util/List;", "component1", "()Ljava/util/List;", "component2", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "component3", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "component4", "component5", "copy", "(Ljava/util/List;Lcom/robinhood/models/db/OptionStrategyChainTemplate;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/List;Ljava/util/List;)Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAdjustedExpirationDateStates", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "getTemplate", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getUnderlyingType", "getFirstLegOptionInstruments", "getSecondLegOptionInstruments", "hasStrategies", "Z", "getHasStrategies", "()Z", "j$/time/Instant", "selloutTime", "Lj$/time/Instant;", "getSelloutTime", "()Lj$/time/Instant;", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "filterChoices", "Ljava/util/Map;", "getFilterChoices", "()Ljava/util/Map;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class FilterChoicesData {
    public static final int $stable = 8;
    private final List<OptionChainExpirationDateState> adjustedExpirationDateStates;
    private final Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> filterChoices;
    private final List<OptionInstrument> firstLegOptionInstruments;
    private final boolean hasStrategies;
    private final List<OptionInstrument> secondLegOptionInstruments;
    private final Instant selloutTime;
    private final OptionStrategyChainTemplate template;
    private final OptionChain.UnderlyingType underlyingType;

    /* compiled from: FilterChoicesData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionStrategyChainTemplate.FilterType.values().length];
            try {
                iArr[OptionStrategyChainTemplate.FilterType.NEAR_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyChainTemplate.FilterType.FAR_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStrategyChainTemplate.FilterType.STRIKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionStrategyChainTemplate.FilterType.SPREAD_WIDTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionStrategyChainTemplate.FilterType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ FilterChoicesData copy$default(FilterChoicesData filterChoicesData, List list, OptionStrategyChainTemplate optionStrategyChainTemplate, OptionChain.UnderlyingType underlyingType, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filterChoicesData.adjustedExpirationDateStates;
        }
        if ((i & 2) != 0) {
            optionStrategyChainTemplate = filterChoicesData.template;
        }
        if ((i & 4) != 0) {
            underlyingType = filterChoicesData.underlyingType;
        }
        if ((i & 8) != 0) {
            list2 = filterChoicesData.firstLegOptionInstruments;
        }
        if ((i & 16) != 0) {
            list3 = filterChoicesData.secondLegOptionInstruments;
        }
        List list4 = list3;
        OptionChain.UnderlyingType underlyingType2 = underlyingType;
        return filterChoicesData.copy(list, optionStrategyChainTemplate, underlyingType2, list2, list4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getSpreadWidthChoices$lambda$8(BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return null;
    }

    public final List<OptionChainExpirationDateState> component1() {
        return this.adjustedExpirationDateStates;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionStrategyChainTemplate getTemplate() {
        return this.template;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final List<OptionInstrument> component4() {
        return this.firstLegOptionInstruments;
    }

    public final List<OptionInstrument> component5() {
        return this.secondLegOptionInstruments;
    }

    public final FilterChoicesData copy(List<OptionChainExpirationDateState> adjustedExpirationDateStates, OptionStrategyChainTemplate template, OptionChain.UnderlyingType underlyingType, List<OptionInstrument> firstLegOptionInstruments, List<OptionInstrument> secondLegOptionInstruments) {
        Intrinsics.checkNotNullParameter(adjustedExpirationDateStates, "adjustedExpirationDateStates");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return new FilterChoicesData(adjustedExpirationDateStates, template, underlyingType, firstLegOptionInstruments, secondLegOptionInstruments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterChoicesData)) {
            return false;
        }
        FilterChoicesData filterChoicesData = (FilterChoicesData) other;
        return Intrinsics.areEqual(this.adjustedExpirationDateStates, filterChoicesData.adjustedExpirationDateStates) && Intrinsics.areEqual(this.template, filterChoicesData.template) && this.underlyingType == filterChoicesData.underlyingType && Intrinsics.areEqual(this.firstLegOptionInstruments, filterChoicesData.firstLegOptionInstruments) && Intrinsics.areEqual(this.secondLegOptionInstruments, filterChoicesData.secondLegOptionInstruments);
    }

    public int hashCode() {
        int iHashCode = ((((this.adjustedExpirationDateStates.hashCode() * 31) + this.template.hashCode()) * 31) + this.underlyingType.hashCode()) * 31;
        List<OptionInstrument> list = this.firstLegOptionInstruments;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<OptionInstrument> list2 = this.secondLegOptionInstruments;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "FilterChoicesData(adjustedExpirationDateStates=" + this.adjustedExpirationDateStates + ", template=" + this.template + ", underlyingType=" + this.underlyingType + ", firstLegOptionInstruments=" + this.firstLegOptionInstruments + ", secondLegOptionInstruments=" + this.secondLegOptionInstruments + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FilterChoicesData(List<OptionChainExpirationDateState> adjustedExpirationDateStates, OptionStrategyChainTemplate template, OptionChain.UnderlyingType underlyingType, List<OptionInstrument> list, List<OptionInstrument> list2) {
        List<OptionInstrument> list3;
        Object strikeChoices;
        OptionInstrument optionInstrument;
        Intrinsics.checkNotNullParameter(adjustedExpirationDateStates, "adjustedExpirationDateStates");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.adjustedExpirationDateStates = adjustedExpirationDateStates;
        this.template = template;
        this.underlyingType = underlyingType;
        this.firstLegOptionInstruments = list;
        this.secondLegOptionInstruments = list2;
        OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = template.getStrategyTemplate();
        boolean z = false;
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) {
            List<OptionInstrument> list4 = list;
            if (list4 != null && !list4.isEmpty()) {
                z = true;
            }
        } else if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) {
            List<OptionInstrument> list5 = list;
            if (list5 != null && !list5.isEmpty() && (list3 = list2) != null && !list3.isEmpty()) {
            }
        } else if (!(strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported)) {
            throw new NoWhenBranchMatchedException();
        }
        this.hasStrategies = z;
        this.selloutTime = (list == null || (optionInstrument = (OptionInstrument) CollectionsKt.firstOrNull((List) list)) == null) ? null : optionInstrument.getSelloutDatetime();
        List<OptionStrategyChainTemplate.Filter> filters = OptionStrategyChainTemplates.getFilters(template);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(filters, 10)), 16));
        for (OptionStrategyChainTemplate.Filter filter : filters) {
            int i = WhenMappings.$EnumSwitchMapping$0[filter.getFilterType().ordinal()];
            if (i == 1 || i == 2) {
                List<OptionChainExpirationDateState> list6 = this.adjustedExpirationDateStates;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                for (OptionChainExpirationDateState optionChainExpirationDateState : list6) {
                    arrayList.add(new OptionStrategyBuilderViewState.Choice.DateChoice(optionChainExpirationDateState.getExpirationDate(), optionChainExpirationDateState.getUiOptionChain()));
                }
                strikeChoices = arrayList;
            } else if (i == 3) {
                strikeChoices = getStrikeChoices(filter.getStrikeIndex(), this.underlyingType);
            } else if (i == 4) {
                strikeChoices = getSpreadWidthChoices(this.underlyingType);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                strikeChoices = CollectionsKt.emptyList();
            }
            Tuples2 tuples2M3642to = Tuples4.m3642to(filter.getFilterType(), strikeChoices);
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        this.filterChoices = linkedHashMap;
    }

    public final List<OptionChainExpirationDateState> getAdjustedExpirationDateStates() {
        return this.adjustedExpirationDateStates;
    }

    public final OptionStrategyChainTemplate getTemplate() {
        return this.template;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public /* synthetic */ FilterChoicesData(List list, OptionStrategyChainTemplate optionStrategyChainTemplate, OptionChain.UnderlyingType underlyingType, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, optionStrategyChainTemplate, underlyingType, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3);
    }

    public final List<OptionInstrument> getFirstLegOptionInstruments() {
        return this.firstLegOptionInstruments;
    }

    public final List<OptionInstrument> getSecondLegOptionInstruments() {
        return this.secondLegOptionInstruments;
    }

    public final boolean getHasStrategies() {
        return this.hasStrategies;
    }

    public final Instant getSelloutTime() {
        return this.selloutTime;
    }

    public final Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> getFilterChoices() {
        return this.filterChoices;
    }

    private final List<OptionStrategyBuilderViewState.Choice.StrikeChoice> getStrikeChoices(Integer strikeIndex, OptionChain.UnderlyingType underlyingType) {
        if (strikeIndex != null && strikeIndex.intValue() == 0) {
            List<OptionInstrument> listEmptyList = this.firstLegOptionInstruments;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List<OptionInstrument> list = listEmptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionInstrument) it.next()).getStrikePrice());
            }
            SortedSet<BigDecimal> sortedSet = CollectionsKt.toSortedSet(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedSet, 10));
            for (BigDecimal bigDecimal : sortedSet) {
                Intrinsics.checkNotNull(bigDecimal);
                arrayList2.add(new OptionStrategyBuilderViewState.Choice.StrikeChoice(bigDecimal, strikeIndex.intValue(), underlyingType));
            }
            return CollectionsKt.reversed(arrayList2);
        }
        if (strikeIndex == null || strikeIndex.intValue() != 1) {
            return CollectionsKt.emptyList();
        }
        List<OptionInstrument> listEmptyList2 = this.secondLegOptionInstruments;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List<OptionInstrument> list2 = listEmptyList2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((OptionInstrument) it2.next()).getStrikePrice());
        }
        SortedSet<BigDecimal> sortedSet2 = CollectionsKt.toSortedSet(arrayList3);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedSet2, 10));
        for (BigDecimal bigDecimal2 : sortedSet2) {
            Intrinsics.checkNotNull(bigDecimal2);
            arrayList4.add(new OptionStrategyBuilderViewState.Choice.StrikeChoice(bigDecimal2, strikeIndex.intValue(), underlyingType));
        }
        return CollectionsKt.reversed(arrayList4);
    }

    private final List<OptionStrategyBuilderViewState.Choice.SpreadWidthChoice> getSpreadWidthChoices(OptionChain.UnderlyingType underlyingType) {
        OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = this.template.getStrategyTemplate();
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) {
            return CollectionsKt.emptyList();
        }
        if (!(strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate)) {
            if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported) {
                return CollectionsKt.emptyList();
            }
            throw new NoWhenBranchMatchedException();
        }
        OptionStrategyChainTemplate.StrikeCondition strikeCondition = ((OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) strategyTemplate).getStrikeCondition();
        List<OptionInstrument> listEmptyList = this.firstLegOptionInstruments;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<OptionInstrument> list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionInstrument) it.next()).getStrikePrice());
        }
        SortedSet<BigDecimal> sortedSet = CollectionsKt.toSortedSet(arrayList);
        List<OptionInstrument> listEmptyList2 = this.secondLegOptionInstruments;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List<OptionInstrument> list2 = listEmptyList2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OptionInstrument) it2.next()).getStrikePrice());
        }
        TreeSet treeSet = (TreeSet) CollectionsKt.toCollection(arrayList2, new TreeSet());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (BigDecimal bigDecimal : sortedSet) {
            for (BigDecimal bigDecimal2 : StrikeConditions.getSecondValuesSatisfyingStrikeCondition(strikeCondition, bigDecimal, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.calculator.FilterChoicesData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FilterChoicesData.getSpreadWidthChoices$lambda$8((BigDecimal) obj);
                }
            }, treeSet)) {
                if (bigDecimal.compareTo(bigDecimal2) != 0) {
                    Intrinsics.checkNotNull(bigDecimal);
                    BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                    linkedHashSet.add(bigDecimalAbs);
                }
            }
        }
        SortedSet<BigDecimal> sortedSet2 = CollectionsKt.toSortedSet(linkedHashSet);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedSet2, 10));
        for (BigDecimal bigDecimal3 : sortedSet2) {
            Intrinsics.checkNotNull(bigDecimal3);
            arrayList3.add(new OptionStrategyBuilderViewState.Choice.SpreadWidthChoice(bigDecimal3, underlyingType));
        }
        return arrayList3;
    }
}
