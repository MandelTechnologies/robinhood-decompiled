package com.robinhood.android.optionsstrategybuilder.calculator;

import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.extensions.StrikeConditions;
import com.robinhood.android.optionsstrategybuilder.pills.PillAdapter;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.android.optionsstrategybuilder.pills.StrategyBuilderChip;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.logging.CrashReporter;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FilteredStrategiesListData.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0001QBC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ+\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00182\u001d\u00107\u001a\u0019\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020208¢\u0006\u0002\b;JT\u0010<\u001a\b\u0012\u0004\u0012\u0002H>0=\"\b\b\u0000\u0010>*\u00020?*\u0002H>2\u001d\u00107\u001a\u0019\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020208¢\u0006\u0002\b;2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020:0\u0005H\u0002¢\u0006\u0002\u0010AJ&\u0010B\u001a\b\u0012\u0004\u0012\u00020(0\u00182\u0006\u0010C\u001a\u00020D2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0018H\u0002J&\u0010E\u001a\b\u0012\u0004\u0012\u00020(0\u00182\u0006\u0010C\u001a\u00020F2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0018H\u0002J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u0017\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003JK\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0001J\u0013\u0010L\u001a\u00020\u001d2\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0018¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0013R\u0011\u0010-\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u00100\u001a\n\u0012\u0004\u0012\u000202\u0018\u000101¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData;", "", "filterChoicesData", "Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "selectedChoices", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "userEditedFilters", "", "previousStrategyIds", "", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "getFilterChoicesData", "()Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "getSelectedChoices", "()Ljava/util/Map;", "getUserEditedFilters", "()Ljava/util/Set;", "getPreviousStrategyIds", "template", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "firstLegOptionInstruments", "", "Lcom/robinhood/models/db/OptionInstrument;", "secondLegOptionInstruments", "filterChoices", "notEnoughFilters", "", InquiryField.ChoicesField.TYPE, EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/OptionStrategyChainTemplate$ValidConfiguration;", "getConfiguration", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$ValidConfiguration;", "scrollDefaultPosition", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$ScrollDefaultPosition;", "getScrollDefaultPosition", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$ScrollDefaultPosition;", "filteredStrategies", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy;", "getFilteredStrategies", "()Ljava/util/List;", "currentStrategyIds", "getCurrentStrategyIds", "strategyListChanged", "getStrategyListChanged", "()Z", "scrollEvent", "Lcom/robinhood/udf/UiEvent;", "", "getScrollEvent", "()Lcom/robinhood/udf/UiEvent;", "getPillAdapterItems", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "onClick", "Lkotlin/Function2;", "Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "Lkotlin/ExtensionFunctionType;", "getPillAdapterItem", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "T", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;", "selectorArgsMap", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;Lkotlin/jvm/functions/Function2;Ljava/util/Map;)Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "getSingleLegStrategies", "strategyTemplate", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$StrategyTemplate$OneLegStrategyTemplate;", "getTwoLegStrategies", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$StrategyTemplate$TwoLegStrategyTemplate;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class FilteredStrategiesListData {
    private final List<OptionStrategyBuilderViewState.Choice> choices;
    private final OptionStrategyChainTemplate.ValidConfiguration configuration;
    private final Set<String> currentStrategyIds;
    private final Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> filterChoices;
    private final FilterChoicesData filterChoicesData;
    private final List<OptionStrategyBuilderViewState.Strategy> filteredStrategies;
    private final List<OptionInstrument> firstLegOptionInstruments;
    private final boolean notEnoughFilters;
    private final Set<String> previousStrategyIds;
    private final OptionStrategyChainTemplate.ScrollDefaultPosition scrollDefaultPosition;
    private final UiEvent<Unit> scrollEvent;
    private final List<OptionInstrument> secondLegOptionInstruments;
    private final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices;
    private final boolean strategyListChanged;
    private final OptionStrategyChainTemplate template;
    private final Set<OptionStrategyChainTemplate.FilterType> userEditedFilters;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FilteredStrategiesListData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionStrategyChainTemplate.SortOrder.values().length];
            try {
                iArr[OptionStrategyChainTemplate.SortOrder.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionStrategyChainTemplate.SortOrder.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionStrategyChainTemplate.SortOrder.DESCENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilteredStrategiesListData copy$default(FilteredStrategiesListData filteredStrategiesListData, FilterChoicesData filterChoicesData, Map map, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            filterChoicesData = filteredStrategiesListData.filterChoicesData;
        }
        if ((i & 2) != 0) {
            map = filteredStrategiesListData.selectedChoices;
        }
        if ((i & 4) != 0) {
            set = filteredStrategiesListData.userEditedFilters;
        }
        if ((i & 8) != 0) {
            set2 = filteredStrategiesListData.previousStrategyIds;
        }
        return filteredStrategiesListData.copy(filterChoicesData, map, set, set2);
    }

    /* renamed from: component1, reason: from getter */
    public final FilterChoicesData getFilterChoicesData() {
        return this.filterChoicesData;
    }

    public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> component2() {
        return this.selectedChoices;
    }

    public final Set<OptionStrategyChainTemplate.FilterType> component3() {
        return this.userEditedFilters;
    }

    public final Set<String> component4() {
        return this.previousStrategyIds;
    }

    public final FilteredStrategiesListData copy(FilterChoicesData filterChoicesData, Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, Set<? extends OptionStrategyChainTemplate.FilterType> userEditedFilters, Set<String> previousStrategyIds) {
        Intrinsics.checkNotNullParameter(filterChoicesData, "filterChoicesData");
        Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
        Intrinsics.checkNotNullParameter(userEditedFilters, "userEditedFilters");
        Intrinsics.checkNotNullParameter(previousStrategyIds, "previousStrategyIds");
        return new FilteredStrategiesListData(filterChoicesData, selectedChoices, userEditedFilters, previousStrategyIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilteredStrategiesListData)) {
            return false;
        }
        FilteredStrategiesListData filteredStrategiesListData = (FilteredStrategiesListData) other;
        return Intrinsics.areEqual(this.filterChoicesData, filteredStrategiesListData.filterChoicesData) && Intrinsics.areEqual(this.selectedChoices, filteredStrategiesListData.selectedChoices) && Intrinsics.areEqual(this.userEditedFilters, filteredStrategiesListData.userEditedFilters) && Intrinsics.areEqual(this.previousStrategyIds, filteredStrategiesListData.previousStrategyIds);
    }

    public int hashCode() {
        return (((((this.filterChoicesData.hashCode() * 31) + this.selectedChoices.hashCode()) * 31) + this.userEditedFilters.hashCode()) * 31) + this.previousStrategyIds.hashCode();
    }

    public String toString() {
        return "FilteredStrategiesListData(filterChoicesData=" + this.filterChoicesData + ", selectedChoices=" + this.selectedChoices + ", userEditedFilters=" + this.userEditedFilters + ", previousStrategyIds=" + this.previousStrategyIds + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FilteredStrategiesListData(FilterChoicesData filterChoicesData, Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, Set<? extends OptionStrategyChainTemplate.FilterType> userEditedFilters, Set<String> previousStrategyIds) {
        boolean z;
        UiEvent<Unit> uiEvent;
        Object next;
        List<OptionStrategyBuilderViewState.Strategy> listEmptyList;
        Intrinsics.checkNotNullParameter(filterChoicesData, "filterChoicesData");
        Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
        Intrinsics.checkNotNullParameter(userEditedFilters, "userEditedFilters");
        Intrinsics.checkNotNullParameter(previousStrategyIds, "previousStrategyIds");
        this.filterChoicesData = filterChoicesData;
        this.selectedChoices = selectedChoices;
        this.userEditedFilters = userEditedFilters;
        this.previousStrategyIds = previousStrategyIds;
        OptionStrategyChainTemplate template = filterChoicesData.getTemplate();
        this.template = template;
        this.firstLegOptionInstruments = filterChoicesData.getFirstLegOptionInstruments();
        this.secondLegOptionInstruments = filterChoicesData.getSecondLegOptionInstruments();
        Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> filterChoices = filterChoicesData.getFilterChoices();
        this.filterChoices = filterChoices;
        Set<OptionStrategyChainTemplate.FilterType> setKeySet = filterChoices.keySet();
        OptionStrategyChainTemplate.FilterType filterType = OptionStrategyChainTemplate.FilterType.STRIKE;
        if (setKeySet.contains(filterType)) {
            Set<OptionStrategyChainTemplate.FilterType> setKeySet2 = filterChoices.keySet();
            OptionStrategyChainTemplate.FilterType filterType2 = OptionStrategyChainTemplate.FilterType.SPREAD_WIDTH;
            z = setKeySet2.contains(filterType2) && selectedChoices.get(filterType) == null && selectedChoices.get(filterType2) == null;
        }
        this.notEnoughFilters = z;
        List<OptionStrategyChainTemplate.Filter> filters = OptionStrategyChainTemplates.getFilters(template);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(this.selectedChoices.get(((OptionStrategyChainTemplate.Filter) it.next()).getFilterType()));
        }
        this.choices = arrayList;
        Iterator<T> it2 = this.template.getValidConfigurations().iterator();
        loop1: while (true) {
            uiEvent = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            OptionStrategyChainTemplate.ValidConfiguration validConfiguration = (OptionStrategyChainTemplate.ValidConfiguration) next;
            List<OptionStrategyChainTemplate.FilterType> nonEmptyFilters = validConfiguration.getNonEmptyFilters();
            if (!(nonEmptyFilters instanceof Collection) || !nonEmptyFilters.isEmpty()) {
                Iterator<T> it3 = nonEmptyFilters.iterator();
                while (it3.hasNext()) {
                    if (this.selectedChoices.get((OptionStrategyChainTemplate.FilterType) it3.next()) != null) {
                    }
                }
            }
            List<OptionStrategyChainTemplate.FilterType> emptyFilters = validConfiguration.getEmptyFilters();
            if (!(emptyFilters instanceof Collection) || !emptyFilters.isEmpty()) {
                Iterator<T> it4 = emptyFilters.iterator();
                while (it4.hasNext()) {
                    if (this.selectedChoices.get((OptionStrategyChainTemplate.FilterType) it4.next()) == null) {
                    }
                }
                break loop1;
            }
            break;
        }
        OptionStrategyChainTemplate.ValidConfiguration validConfiguration2 = (OptionStrategyChainTemplate.ValidConfiguration) next;
        this.configuration = validConfiguration2;
        this.scrollDefaultPosition = validConfiguration2 != null ? validConfiguration2.getScrollDefaultPosition() : null;
        if (this.notEnoughFilters) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = this.template.getStrategyTemplate();
            if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) {
                listEmptyList = getSingleLegStrategies((OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) strategyTemplate, this.choices);
            } else if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) {
                listEmptyList = getTwoLegStrategies((OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) strategyTemplate, this.choices);
            } else {
                if (!(strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                listEmptyList = CollectionsKt.emptyList();
            }
        }
        this.filteredStrategies = listEmptyList;
        List<OptionStrategyBuilderViewState.Strategy> list = listEmptyList;
        LinkedHashSet linkedHashSet = list instanceof Collection ? new LinkedHashSet(list.size()) : new LinkedHashSet();
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            linkedHashSet.add(((OptionStrategyBuilderViewState.Strategy) it5.next()).getIdentifier());
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        this.currentStrategyIds = setUnmodifiableSet;
        boolean zAreEqual = Intrinsics.areEqual(this.previousStrategyIds, setUnmodifiableSet);
        this.strategyListChanged = !zAreEqual;
        UiEvent<Unit> uiEvent2 = new UiEvent<>(Unit.INSTANCE);
        if (!setUnmodifiableSet.isEmpty() && !zAreEqual) {
            uiEvent = uiEvent2;
        }
        this.scrollEvent = uiEvent;
    }

    public final FilterChoicesData getFilterChoicesData() {
        return this.filterChoicesData;
    }

    public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getSelectedChoices() {
        return this.selectedChoices;
    }

    public /* synthetic */ FilteredStrategiesListData(FilterChoicesData filterChoicesData, Map map, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(filterChoicesData, map, (i & 4) != 0 ? SetsKt.emptySet() : set, set2);
    }

    public final Set<OptionStrategyChainTemplate.FilterType> getUserEditedFilters() {
        return this.userEditedFilters;
    }

    public final Set<String> getPreviousStrategyIds() {
        return this.previousStrategyIds;
    }

    public final OptionStrategyChainTemplate.ValidConfiguration getConfiguration() {
        return this.configuration;
    }

    public final OptionStrategyChainTemplate.ScrollDefaultPosition getScrollDefaultPosition() {
        return this.scrollDefaultPosition;
    }

    public final List<OptionStrategyBuilderViewState.Strategy> getFilteredStrategies() {
        return this.filteredStrategies;
    }

    public final Set<String> getCurrentStrategyIds() {
        return this.currentStrategyIds;
    }

    public final boolean getStrategyListChanged() {
        return this.strategyListChanged;
    }

    public final UiEvent<Unit> getScrollEvent() {
        return this.scrollEvent;
    }

    public final List<PillAdapter.Item> getPillAdapterItems(Function2<? super StrategyBuilderChip, ? super PillView.SelectorArgs, Unit> onClick) {
        EducationTourViewData rangeFilterPill;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        List<OptionStrategyChainTemplate.FilterGroup> filterGroups = this.template.getFilterGroups();
        ArrayList arrayList = new ArrayList();
        for (OptionStrategyChainTemplate.FilterGroup filterGroup : filterGroups) {
            if (filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup singleFilterGroup = (OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup) filterGroup;
                List<OptionStrategyBuilderViewState.Choice> list = this.filterChoicesData.getFilterChoices().get(singleFilterGroup.getFilter().getFilterType());
                if (list != null) {
                    linkedHashMap.put(singleFilterGroup.getFilter().getFilterType(), new PillView.SelectorArgs(singleFilterGroup.getFilter(), null, list, this.selectedChoices, null));
                }
                rangeFilterPill = new PillAdapter.Item.SingleFilterPill(getPillAdapterItem(filterGroup, onClick, linkedHashMap));
            } else if (filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup rangeFilterGroup = (OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) filterGroup;
                List<OptionStrategyBuilderViewState.Choice> list2 = this.filterChoicesData.getFilterChoices().get(rangeFilterGroup.getStartFilter().getFilterType());
                if (list2 != null) {
                    linkedHashMap2.put(rangeFilterGroup.getStartFilter().getFilterType(), new PillView.SelectorArgs(rangeFilterGroup.getStartFilter(), new PillView.SelectorArgs.ForceRule(rangeFilterGroup.getEndFilter().getFilterType(), PillView.SelectorArgs.Rule.MUST_BE_GREATER), list2, this.selectedChoices, PillView.DisabledMode.LAST));
                }
                List<OptionStrategyBuilderViewState.Choice> list3 = this.filterChoicesData.getFilterChoices().get(rangeFilterGroup.getEndFilter().getFilterType());
                if (list3 != null) {
                    linkedHashMap2.put(rangeFilterGroup.getEndFilter().getFilterType(), new PillView.SelectorArgs(rangeFilterGroup.getEndFilter(), new PillView.SelectorArgs.ForceRule(rangeFilterGroup.getStartFilter().getFilterType(), PillView.SelectorArgs.Rule.MUST_BE_LESS), list3, this.selectedChoices, PillView.DisabledMode.FIRST));
                }
                rangeFilterPill = new PillAdapter.Item.RangeFilterPill(getPillAdapterItem(filterGroup, onClick, linkedHashMap2));
            } else {
                if (!(filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
                rangeFilterPill = null;
            }
            if (rangeFilterPill != null) {
                arrayList.add(rangeFilterPill);
            }
        }
        return arrayList;
    }

    private final <T extends OptionStrategyChainTemplate.FilterGroup> PillView.State<T> getPillAdapterItem(T t, Function2<? super StrategyBuilderChip, ? super PillView.SelectorArgs, Unit> function2, Map<OptionStrategyChainTemplate.FilterType, PillView.SelectorArgs> map) {
        return new PillView.State<>(t, map, this.filterChoicesData.getFilterChoices(), this.selectedChoices, this.userEditedFilters, function2, OptionStrategyChainTemplates.getSingleNearDateFilter(this.template) == null);
    }

    private final List<OptionStrategyBuilderViewState.Strategy> getSingleLegStrategies(OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate strategyTemplate, List<? extends OptionStrategyBuilderViewState.Choice> choices) {
        List<OptionInstrument> listEmptyList = this.firstLegOptionInstruments;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            if (INSTANCE.satisfiesChoicesForFirstLeg((OptionInstrument) obj, choices)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        UiOptionChain uiOptionChainFromDateChoice = INSTANCE.getUiOptionChainFromDateChoice(choices);
        if (uiOptionChainFromDateChoice == null) {
            return CollectionsKt.emptyList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new OptionStrategyBuilderViewState.Strategy((List<OptionStrategyBuilderViewState.Strategy.Leg>) CollectionsKt.listOf(new OptionStrategyBuilderViewState.Strategy.Leg(uiOptionChainFromDateChoice, (OptionInstrument) it.next(), strategyTemplate.getFirstLeg())), this.template, uiOptionChainFromDateChoice));
        }
        return arrayList2;
    }

    private final List<OptionStrategyBuilderViewState.Strategy> getTwoLegStrategies(OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate strategyTemplate, List<? extends OptionStrategyBuilderViewState.Choice> choices) {
        List<OptionInstrument> listEmptyList = this.firstLegOptionInstruments;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList<OptionInstrument> arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            if (INSTANCE.satisfiesChoicesForFirstLeg((OptionInstrument) obj, choices)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List<OptionInstrument> listEmptyList2 = this.secondLegOptionInstruments;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        TreeSet treeSet = (TreeSet) CollectionsKt.toCollection(listEmptyList2, new TreeSet(Companion.OptionComparator.INSTANCE));
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : treeSet) {
            BigDecimal strikePrice = ((OptionInstrument) obj2).getStrikePrice();
            Object arrayList3 = linkedHashMap.get(strikePrice);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(strikePrice, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        UiOptionChain uiOptionChainFromDateChoice = INSTANCE.getUiOptionChainFromDateChoice(choices);
        if (uiOptionChainFromDateChoice == null) {
            return CollectionsKt.emptyList();
        }
        for (OptionInstrument optionInstrument : arrayList) {
            Collection secondValuesSatisfyingStrikeCondition = StrikeConditions.getSecondValuesSatisfyingStrikeCondition(strategyTemplate.getStrikeCondition(), optionInstrument, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.calculator.FilteredStrategiesListData$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return FilteredStrategiesListData.getTwoLegStrategies$lambda$10(linkedHashMap, (OptionInstrument) obj3);
                }
            }, treeSet);
            List arrayList4 = new ArrayList();
            for (Object obj3 : secondValuesSatisfyingStrikeCondition) {
                if (INSTANCE.satisfiesChoicesForSecondLeg((OptionInstrument) obj3, optionInstrument, choices)) {
                    arrayList4.add(obj3);
                }
            }
            int i = WhenMappings.$EnumSwitchMapping$0[strategyTemplate.getSecondLeg().getStrikeSortOrder().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList4 = CollectionsKt.reversed(arrayList4);
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList2.add(new OptionStrategyBuilderViewState.Strategy((List<OptionStrategyBuilderViewState.Strategy.Leg>) CollectionsKt.listOf((Object[]) new OptionStrategyBuilderViewState.Strategy.Leg[]{new OptionStrategyBuilderViewState.Strategy.Leg(uiOptionChainFromDateChoice, optionInstrument, strategyTemplate.getFirstLeg()), new OptionStrategyBuilderViewState.Strategy.Leg(uiOptionChainFromDateChoice, (OptionInstrument) it.next(), strategyTemplate.getSecondLeg())}), this.template, uiOptionChainFromDateChoice));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getTwoLegStrategies$lambda$10(Map map, OptionInstrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (List) map.get(it.getStrikePrice());
    }

    /* compiled from: FilteredStrategiesListData.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J$\u0010\n\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData$Companion;", "", "<init>", "()V", "satisfiesChoicesForFirstLeg", "", "Lcom/robinhood/models/db/OptionInstrument;", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "satisfiesChoicesForSecondLeg", "firstOptionInstrument", "getUiOptionChainFromDateChoice", "Lcom/robinhood/models/ui/UiOptionChain;", "OptionComparator", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* compiled from: FilteredStrategiesListData.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/calculator/FilteredStrategiesListData$Companion$OptionComparator;", "Ljava/util/Comparator;", "Lcom/robinhood/models/db/OptionInstrument;", "Lkotlin/Comparator;", "<init>", "()V", "compare", "", "leg1", "leg2", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        private static final class OptionComparator implements Comparator<OptionInstrument> {
            public static final OptionComparator INSTANCE = new OptionComparator();

            private OptionComparator() {
            }

            @Override // java.util.Comparator
            public int compare(OptionInstrument leg1, OptionInstrument leg2) {
                Intrinsics.checkNotNullParameter(leg1, "leg1");
                Intrinsics.checkNotNullParameter(leg2, "leg2");
                return leg1.getStrikePrice().compareTo(leg2.getStrikePrice());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean satisfiesChoicesForFirstLeg(OptionInstrument optionInstrument, List<? extends OptionStrategyBuilderViewState.Choice> list) {
            List<? extends OptionStrategyBuilderViewState.Choice> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (OptionStrategyBuilderViewState.Choice choice : list2) {
                if (choice instanceof OptionStrategyBuilderViewState.Choice.StrikeChoice) {
                    OptionStrategyBuilderViewState.Choice.StrikeChoice strikeChoice = (OptionStrategyBuilderViewState.Choice.StrikeChoice) choice;
                    if (strikeChoice.getStrikeIndex() == 0 && strikeChoice.getMoneyValue().compareTo(optionInstrument.getStrikePrice()) != 0) {
                        return false;
                    }
                } else if (!(choice instanceof OptionStrategyBuilderViewState.Choice.SpreadWidthChoice) && !(choice instanceof OptionStrategyBuilderViewState.Choice.DateChoice) && choice != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean satisfiesChoicesForSecondLeg(OptionInstrument optionInstrument, OptionInstrument optionInstrument2, List<? extends OptionStrategyBuilderViewState.Choice> list) {
            List<? extends OptionStrategyBuilderViewState.Choice> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return true;
            }
            for (OptionStrategyBuilderViewState.Choice choice : list2) {
                if (choice instanceof OptionStrategyBuilderViewState.Choice.StrikeChoice) {
                    OptionStrategyBuilderViewState.Choice.StrikeChoice strikeChoice = (OptionStrategyBuilderViewState.Choice.StrikeChoice) choice;
                    if (strikeChoice.getStrikeIndex() == 1 && strikeChoice.getMoneyValue().compareTo(optionInstrument.getStrikePrice()) != 0) {
                        return false;
                    }
                } else if (choice instanceof OptionStrategyBuilderViewState.Choice.SpreadWidthChoice) {
                    BigDecimal moneyValue = ((OptionStrategyBuilderViewState.Choice.SpreadWidthChoice) choice).getMoneyValue();
                    BigDecimal bigDecimalSubtract = optionInstrument2.getStrikePrice().subtract(optionInstrument.getStrikePrice());
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    if (moneyValue.compareTo(bigDecimalSubtract.abs()) != 0) {
                        return false;
                    }
                } else if (!(choice instanceof OptionStrategyBuilderViewState.Choice.DateChoice) && choice != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final UiOptionChain getUiOptionChainFromDateChoice(List<? extends OptionStrategyBuilderViewState.Choice> choices) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : choices) {
                if (obj instanceof OptionStrategyBuilderViewState.Choice.DateChoice) {
                    arrayList.add(obj);
                }
            }
            OptionStrategyBuilderViewState.Choice.DateChoice dateChoice = (OptionStrategyBuilderViewState.Choice.DateChoice) CollectionsKt.firstOrNull((List) arrayList);
            UiOptionChain uiOptionChain = dateChoice != null ? dateChoice.getUiOptionChain() : null;
            if (uiOptionChain == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Strategy builder: no DateChoice found in choices: " + choices), true, null, 4, null);
            }
            return uiOptionChain;
        }
    }
}
