package com.robinhood.android.optionsstrategybuilder.extensions;

import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.calculator.FilterChoicesData;
import com.robinhood.models.p320db.AggregateOptionPositionLeg;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: OptionStrategyChainTemplates.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001\u001a\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016\u001a\"\u0010%\u001a\u00020!*\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u001a$\u0010)\u001a\u0004\u0018\u00010\u0011*\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001\u001a\u0018\u0010*\u001a\u00020+*\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0001\u001a\u0018\u0010.\u001a\u00020+*\u00020\u00062\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0001\u001a\u001e\u00103\u001a\u00020\u0018*\u00020\u001b2\b\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u00020\u0018\u001a(\u00107\u001a\b\u0012\u0004\u0012\u00020908*\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u000209082\b\b\u0002\u0010<\u001a\u00020\u0018\u001a$\u0010=\u001a\u00020+2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0001H\u0002\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u0015\u0010\u0017\u001a\u00020\u0018*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019\"\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\"\u0019\u0010 \u001a\u0004\u0018\u00010!*\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010/\u001a\u000200*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u0010@\u001a\u0004\u0018\u00010\u0002*\u00020\u00068F¢\u0006\u0006\u001a\u0004\bA\u0010B\"\u0017\u0010C\u001a\u0004\u0018\u00010D*\u00020\n8F¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006G"}, m3636d2 = {"filters", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$Filter;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;", "getFilters", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;)Ljava/util/List;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate;)Ljava/util/List;", "filterTypesForQuery", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "getFilterTypesForQuery", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate;)Ljava/util/Set;", "filterTypesForClientSideFiltering", "getFilterTypesForClientSideFiltering", "getInitialChoicesForDates", "", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "dateStates", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getInitialChoicesForClientSideFilters", "filterChoicesData", "Lcom/robinhood/android/optionsstrategybuilder/calculator/FilterChoicesData;", "isMultiLeg", "", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate;)Z", "firstLegTemplate", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;", "getFirstLegTemplate", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate;)Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;", "secondLegTemplate", "getSecondLegTemplate", "asIndex", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$InitialValueType;", "getAsIndex", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$InitialValueType;)Ljava/lang/Integer;", "getDefaultIndex", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", InquiryField.ChoicesField.TYPE, "getDefaultChoice", "getRowTitle", "", "legs", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Strategy$Leg;", "getBottomSheetTitle", "positionType", "Lcom/robinhood/models/db/OptionPositionType;", "getPositionType", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$OptionLegTemplate;)Lcom/robinhood/models/db/OptionPositionType;", "validateLeg", "leg", "Lcom/robinhood/models/db/AggregateOptionPositionLeg;", "checkOpposite", "filterPositions", "Lkotlin/sequences/Sequence;", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$StrategyTemplate;", "positions", "filterOpposite", "getString", "titleFormat", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FormatSection;", "singleNearDateFilter", "getSingleNearDateFilter", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate;)Lcom/robinhood/models/db/OptionStrategyChainTemplate$Filter;", "performanceName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "getPerformanceName", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;)Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "feature-options-strategy-builder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplatesKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionStrategyChainTemplates {

    /* compiled from: OptionStrategyChainTemplates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplatesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

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
            int[] iArr2 = new int[OptionStrategyChainTemplate.InitialValueType.values().length];
            try {
                iArr2[OptionStrategyChainTemplate.InitialValueType.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OptionStrategyChainTemplate.InitialValueType.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[OptionStrategyChainTemplate.InitialValueType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionStrategyChainTemplate.DefaultValueType.values().length];
            try {
                iArr3[OptionStrategyChainTemplate.DefaultValueType.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OptionStrategyChainTemplate.DefaultValueType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OptionStrategyChainTemplate.DefaultValueType.SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionStrategyChainTemplate.DefaultValueType.CLOSEST_TO_EQUITY_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OrderPositionEffect.values().length];
            try {
                iArr4[OrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[OrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OrderSide.values().length];
            try {
                iArr5[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[OptionStrategyChainTemplate.FormatSection.VariableFormatSection.VariableType.values().length];
            try {
                iArr6[OptionStrategyChainTemplate.FormatSection.VariableFormatSection.VariableType.CHAIN_SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[OptionStrategyChainTemplate.FormatSection.VariableFormatSection.VariableType.UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static final List<OptionStrategyChainTemplate.Filter> getFilters(OptionStrategyChainTemplate.FilterGroup filterGroup) {
        Intrinsics.checkNotNullParameter(filterGroup, "<this>");
        if (filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup) {
            return CollectionsKt.listOf(((OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup) filterGroup).getFilter());
        }
        if (filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) {
            OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup rangeFilterGroup = (OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) filterGroup;
            return CollectionsKt.listOf((Object[]) new OptionStrategyChainTemplate.Filter[]{rangeFilterGroup.getStartFilter(), rangeFilterGroup.getEndFilter()});
        }
        if (filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.Unsupported) {
            return CollectionsKt.emptyList();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List<OptionStrategyChainTemplate.Filter> getFilters(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        List<OptionStrategyChainTemplate.FilterGroup> filterGroups = optionStrategyChainTemplate.getFilterGroups();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterGroups, 10));
        Iterator<T> it = filterGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(getFilters((OptionStrategyChainTemplate.FilterGroup) it.next()));
        }
        return CollectionsKt.flatten(arrayList);
    }

    public static final Set<OptionStrategyChainTemplate.FilterType> getFilterTypesForQuery(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        List<OptionStrategyChainTemplate.OptionInstrumentQueryParams.DynamicParam> dynamicParams = optionStrategyChainTemplate.getOptionInstrumentQuery().getDynamicParams();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = dynamicParams.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((OptionStrategyChainTemplate.OptionInstrumentQueryParams.DynamicParam) it.next()).getFilters());
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final Set<OptionStrategyChainTemplate.FilterType> getFilterTypesForClientSideFiltering(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        List<OptionStrategyChainTemplate.Filter> filters = getFilters(optionStrategyChainTemplate);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filters, 10));
        Iterator<T> it = filters.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionStrategyChainTemplate.Filter) it.next()).getFilterType());
        }
        return CollectionsKt.subtract(arrayList, getFilterTypesForQuery(optionStrategyChainTemplate));
    }

    public static final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getInitialChoicesForDates(OptionStrategyChainTemplate optionStrategyChainTemplate, List<OptionChainExpirationDateState> dateStates) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        Intrinsics.checkNotNullParameter(dateStates, "dateStates");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (OptionStrategyChainTemplate.Filter filter : getFilters(optionStrategyChainTemplate)) {
            OptionStrategyChainTemplate.FilterType filterType = filter.getFilterType();
            Integer asIndex = getAsIndex(filter.getInitialValue());
            if (asIndex != null && (iIntValue = asIndex.intValue()) >= 0 && iIntValue < dateStates.size()) {
                int i = WhenMappings.$EnumSwitchMapping$0[filter.getFilterType().ordinal()];
                if (i == 1 || i == 2) {
                    linkedHashMap.put(filterType, new OptionStrategyBuilderViewState.Choice.DateChoice(dateStates.get(iIntValue).getExpirationDate(), dateStates.get(iIntValue).getUiOptionChain()));
                } else if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return linkedHashMap;
    }

    public static final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getInitialChoicesForClientSideFilters(OptionStrategyChainTemplate optionStrategyChainTemplate, FilterChoicesData filterChoicesData) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        Intrinsics.checkNotNullParameter(filterChoicesData, "filterChoicesData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<OptionStrategyChainTemplate.Filter> filters = getFilters(optionStrategyChainTemplate);
        ArrayList<OptionStrategyChainTemplate.Filter> arrayList = new ArrayList();
        for (Object obj : filters) {
            if (getFilterTypesForClientSideFiltering(optionStrategyChainTemplate).contains(((OptionStrategyChainTemplate.Filter) obj).getFilterType())) {
                arrayList.add(obj);
            }
        }
        for (OptionStrategyChainTemplate.Filter filter : arrayList) {
            OptionStrategyChainTemplate.FilterType filterType = filter.getFilterType();
            Integer asIndex = getAsIndex(filter.getInitialValue());
            if (asIndex != null) {
                int iIntValue = asIndex.intValue();
                List<OptionStrategyBuilderViewState.Choice> listEmptyList = filterChoicesData.getFilterChoices().get(filterType);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                OptionStrategyBuilderViewState.Choice choice = (OptionStrategyBuilderViewState.Choice) CollectionsKt.getOrNull(listEmptyList, iIntValue);
                if (choice != null) {
                    linkedHashMap.put(filterType, choice);
                }
            }
        }
        return linkedHashMap;
    }

    public static final boolean isMultiLeg(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = optionStrategyChainTemplate.getStrategyTemplate();
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) {
            return true;
        }
        if ((strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) || (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final OptionStrategyChainTemplate.OptionLegTemplate getFirstLegTemplate(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = optionStrategyChainTemplate.getStrategyTemplate();
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) {
            return ((OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) strategyTemplate).getFirstLeg();
        }
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) {
            return ((OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) strategyTemplate).getFirstLeg();
        }
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final OptionStrategyChainTemplate.OptionLegTemplate getSecondLegTemplate(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        OptionStrategyChainTemplate.StrategyTemplate strategyTemplate = optionStrategyChainTemplate.getStrategyTemplate();
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) {
            return null;
        }
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) {
            return ((OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) strategyTemplate).getSecondLeg();
        }
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Integer getAsIndex(OptionStrategyChainTemplate.InitialValueType initialValueType) {
        int i = initialValueType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[initialValueType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getDefaultIndex(OptionStrategyChainTemplate.Filter filter, UnderlyingQuote underlyingQuote, List<? extends OptionStrategyBuilderViewState.Choice> choices) {
        BigDecimal currentValue;
        Object next;
        Intrinsics.checkNotNullParameter(filter, "<this>");
        Intrinsics.checkNotNullParameter(choices, "choices");
        OptionStrategyChainTemplate.DefaultValueType defaultValue = filter.getDefaultValue();
        int i = defaultValue == null ? -1 : WhenMappings.$EnumSwitchMapping$2[defaultValue.ordinal()];
        if (i == -1 || i == 1 || i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (underlyingQuote != null && (currentValue = underlyingQuote.getCurrentValue()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = choices.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Integer numValueOf = Integer.valueOf(i2);
                BigDecimal bigDecimalDistanceFromUnderlyingQuote = ((OptionStrategyBuilderViewState.Choice) next2).distanceFromUnderlyingQuote(currentValue);
                Tuples2 tuples2M3642to = bigDecimalDistanceFromUnderlyingQuote != null ? Tuples4.m3642to(numValueOf, bigDecimalDistanceFromUnderlyingQuote) : null;
                if (tuples2M3642to != null) {
                    arrayList.add(tuples2M3642to);
                }
                i2 = i3;
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    BigDecimal bigDecimal = (BigDecimal) ((Tuples2) next).component2();
                    do {
                        Object next3 = it2.next();
                        BigDecimal bigDecimal2 = (BigDecimal) ((Tuples2) next3).component2();
                        if (bigDecimal.compareTo(bigDecimal2) > 0) {
                            next = next3;
                            bigDecimal = bigDecimal2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Tuples2 tuples2 = (Tuples2) next;
            Integer num = tuples2 != null ? (Integer) tuples2.getFirst() : null;
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    public static final OptionStrategyBuilderViewState.Choice getDefaultChoice(OptionStrategyChainTemplate.Filter filter, UnderlyingQuote underlyingQuote, List<? extends OptionStrategyBuilderViewState.Choice> choices) {
        Intrinsics.checkNotNullParameter(filter, "<this>");
        Intrinsics.checkNotNullParameter(choices, "choices");
        return (OptionStrategyBuilderViewState.Choice) CollectionsKt.getOrNull(choices, getDefaultIndex(filter, underlyingQuote, choices));
    }

    public static final String getRowTitle(OptionStrategyChainTemplate optionStrategyChainTemplate, List<OptionStrategyBuilderViewState.Strategy.Leg> legs) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        Intrinsics.checkNotNullParameter(legs, "legs");
        return getString(optionStrategyChainTemplate.getRowTitleFormat(), legs);
    }

    public static final String getBottomSheetTitle(OptionStrategyChainTemplate optionStrategyChainTemplate, List<OptionStrategyBuilderViewState.Strategy.Leg> legs) {
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        Intrinsics.checkNotNullParameter(legs, "legs");
        return getString(optionStrategyChainTemplate.getBottomSheetTitleFormat(), legs);
    }

    public static final OptionPositionType getPositionType(OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate) {
        Intrinsics.checkNotNullParameter(optionLegTemplate, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[optionLegTemplate.getSide().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$3[optionLegTemplate.getPositionEffect().ordinal()];
            if (i2 == 1) {
                return OptionPositionType.LONG;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return OptionPositionType.SHORT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.$EnumSwitchMapping$3[optionLegTemplate.getPositionEffect().ordinal()];
        if (i3 == 1) {
            return OptionPositionType.SHORT;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionPositionType.LONG;
    }

    public static /* synthetic */ boolean validateLeg$default(OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate, AggregateOptionPositionLeg aggregateOptionPositionLeg, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return validateLeg(optionLegTemplate, aggregateOptionPositionLeg, z);
    }

    public static final boolean validateLeg(OptionStrategyChainTemplate.OptionLegTemplate optionLegTemplate, AggregateOptionPositionLeg aggregateOptionPositionLeg, boolean z) {
        Intrinsics.checkNotNullParameter(optionLegTemplate, "<this>");
        if (aggregateOptionPositionLeg == null || optionLegTemplate.getRatioQuantity() != aggregateOptionPositionLeg.getRatioQuantity().intValue() || optionLegTemplate.getOptionType() != aggregateOptionPositionLeg.getContractType()) {
            return false;
        }
        if (z || getPositionType(optionLegTemplate) == aggregateOptionPositionLeg.getPositionType()) {
            return (z && getPositionType(optionLegTemplate) == aggregateOptionPositionLeg.getPositionType()) ? false : true;
        }
        return false;
    }

    public static /* synthetic */ Sequence filterPositions$default(OptionStrategyChainTemplate.StrategyTemplate strategyTemplate, Sequence sequence, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return filterPositions(strategyTemplate, sequence, z);
    }

    public static final Sequence<UiAggregateOptionPosition> filterPositions(final OptionStrategyChainTemplate.StrategyTemplate strategyTemplate, Sequence<? extends UiAggregateOptionPosition> positions, final boolean z) {
        Intrinsics.checkNotNullParameter(strategyTemplate, "<this>");
        Intrinsics.checkNotNullParameter(positions, "positions");
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) {
            return SequencesKt.filter(positions, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplatesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OptionStrategyChainTemplates.filterPositions$lambda$7(strategyTemplate, z, (UiAggregateOptionPosition) obj));
                }
            });
        }
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) {
            return SequencesKt.filter(positions, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplatesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OptionStrategyChainTemplates.filterPositions$lambda$8(strategyTemplate, z, (UiAggregateOptionPosition) obj));
                }
            });
        }
        if (strategyTemplate instanceof OptionStrategyChainTemplate.StrategyTemplate.Unsupported) {
            return SequencesKt.emptySequence();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filterPositions$lambda$7(OptionStrategyChainTemplate.StrategyTemplate strategyTemplate, boolean z, UiAggregateOptionPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        return validateLeg(((OptionStrategyChainTemplate.StrategyTemplate.OneLegStrategyTemplate) strategyTemplate).getFirstLeg(), (AggregateOptionPositionLeg) CollectionsKt.singleOrNull((List) position.getLegs()), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean filterPositions$lambda$8(OptionStrategyChainTemplate.StrategyTemplate strategyTemplate, boolean z, UiAggregateOptionPosition position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (position.getLegs().size() != 2) {
            return false;
        }
        OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate twoLegStrategyTemplate = (OptionStrategyChainTemplate.StrategyTemplate.TwoLegStrategyTemplate) strategyTemplate;
        return (validateLeg(twoLegStrategyTemplate.getFirstLeg(), position.getLegs().get(0), z) && validateLeg(twoLegStrategyTemplate.getSecondLeg(), position.getLegs().get(1), z)) || (validateLeg(twoLegStrategyTemplate.getFirstLeg(), position.getLegs().get(1), z) && validateLeg(twoLegStrategyTemplate.getSecondLeg(), position.getLegs().get(0), z));
    }

    private static final String getString(List<? extends OptionStrategyChainTemplate.FormatSection> list, List<OptionStrategyBuilderViewState.Strategy.Leg> list2) {
        OptionInstrument optionInstrument;
        String chainSymbol;
        Object next;
        StringBuilder sb = new StringBuilder();
        for (OptionStrategyChainTemplate.FormatSection formatSection : list) {
            if (formatSection instanceof OptionStrategyChainTemplate.FormatSection.StringFormatSection) {
                chainSymbol = ((OptionStrategyChainTemplate.FormatSection.StringFormatSection) formatSection).getValue();
            } else if (!(formatSection instanceof OptionStrategyChainTemplate.FormatSection.StrikeFormatSection)) {
                if (formatSection instanceof OptionStrategyChainTemplate.FormatSection.VariableFormatSection) {
                    int i = WhenMappings.$EnumSwitchMapping$5[((OptionStrategyChainTemplate.FormatSection.VariableFormatSection) formatSection).getVariableType().ordinal()];
                    if (i == 1) {
                        OptionStrategyBuilderViewState.Strategy.Leg leg = (OptionStrategyBuilderViewState.Strategy.Leg) CollectionsKt.firstOrNull((List) list2);
                        if (leg != null && (optionInstrument = leg.getOptionInstrument()) != null) {
                            chainSymbol = optionInstrument.getChainSymbol();
                        }
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(formatSection instanceof OptionStrategyChainTemplate.FormatSection.Unsupported)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((OptionStrategyBuilderViewState.Strategy.Leg) next).getOptionLegTemplate().getIndex() == ((OptionStrategyChainTemplate.FormatSection.StrikeFormatSection) formatSection).getStrikeIndex()) {
                        break;
                    }
                }
                OptionStrategyBuilderViewState.Strategy.Leg leg2 = (OptionStrategyBuilderViewState.Strategy.Leg) next;
                chainSymbol = leg2 != null ? OptionUnderlyings.getStrikeFormatter(leg2.getUiOptionChain().getUnderlyingType()).format(leg2.getOptionInstrument().getStrikePrice()) : null;
            }
            if (chainSymbol != null) {
                sb.append(chainSymbol);
            }
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public static final OptionStrategyChainTemplate.Filter getSingleNearDateFilter(OptionStrategyChainTemplate optionStrategyChainTemplate) {
        OptionStrategyChainTemplate.Filter filter;
        Intrinsics.checkNotNullParameter(optionStrategyChainTemplate, "<this>");
        OptionStrategyChainTemplate.FilterGroup filterGroup = (OptionStrategyChainTemplate.FilterGroup) CollectionsKt.singleOrNull((List) optionStrategyChainTemplate.getFilterGroups());
        OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup singleFilterGroup = filterGroup instanceof OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup ? (OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup) filterGroup : null;
        if (singleFilterGroup == null || (filter = singleFilterGroup.getFilter()) == null || filter.getFilterType() != OptionStrategyChainTemplate.FilterType.NEAR_DATE) {
            return null;
        }
        return filter;
    }

    public static final PerformanceMetricEventData.Name getPerformanceName(OptionStrategyChainTemplate.FilterType filterType) {
        Intrinsics.checkNotNullParameter(filterType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[filterType.ordinal()];
        if (i == 1) {
            return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_NEAR_FILTER;
        }
        if (i == 2) {
            return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_FAR_FILTER;
        }
        if (i == 3) {
            return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_STRIKE_FILTER;
        }
        if (i == 4) {
            return PerformanceMetricEventData.Name.OPTIONS_STRATEGY_CHAIN_SPREAD_WIDTH_FILTER;
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
