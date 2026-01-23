package com.robinhood.android.optionsstrategybuilder.pills;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.pills.PillView.State;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: PillView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003:\u0003\u0015\u0016\u0017B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH&¢\u0006\u0002\u0010\u000fJ;\u0010\n\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0004¢\u0006\u0002\u0010\u0014¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillView;", "C", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bind", "", "state", "initialNearDateExpand", "Lcom/robinhood/udf/UiEvent;", "(Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;Lcom/robinhood/udf/UiEvent;)V", "Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "getFilter", "Lkotlin/Function1;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$Filter;", "(Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;Lkotlin/jvm/functions/Function1;Lcom/robinhood/udf/UiEvent;)V", "State", "SelectorArgs", "DisabledMode", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public abstract class PillView<C extends State<?>> extends LinearLayout {
    public static final int $stable = 8;

    public abstract void bind(C state, UiEvent<Unit> initialNearDateExpand);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
    }

    protected final void bind(final StrategyBuilderChip strategyBuilderChip, final C state, Function1<? super C, OptionStrategyChainTemplate.Filter> getFilter, UiEvent<Unit> initialNearDateExpand) {
        Intrinsics.checkNotNullParameter(strategyBuilderChip, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(getFilter, "getFilter");
        Intrinsics.checkNotNullParameter(initialNearDateExpand, "initialNearDateExpand");
        OptionStrategyChainTemplate.Filter filterInvoke = getFilter.invoke(state);
        OptionStrategyBuilderViewState.Choice choice = state.getSelectedChoices().get(filterInvoke.getFilterType());
        strategyBuilderChip.setSelected(state.getUserEditedFilters().contains(filterInvoke.getFilterType()) && filterInvoke.getHighlightOnUserEdit() && choice != null);
        String pillName = filterInvoke.getPillName();
        List<OptionStrategyBuilderViewState.Choice> listEmptyList = state.getChoices().get(filterInvoke.getFilterType());
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        strategyBuilderChip.setText(pillName, choice, listEmptyList);
        ServerToBentoAssetMapper2 icon = filterInvoke.getIcon();
        strategyBuilderChip.setIconDrawable(icon != null ? ViewsKt.getDrawable(strategyBuilderChip, icon.getResourceId()) : null);
        strategyBuilderChip.getDropdownIcon().setVisibility(filterInvoke.getShowCaret() ? 0 : 8);
        final SelectorArgs selectorArgs = state.getSelectorArgsMap().get(filterInvoke.getFilterType());
        if (selectorArgs == null || selectorArgs.getChoices().isEmpty()) {
            return;
        }
        final Function0 function0 = new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pills.PillView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PillView.bind$lambda$1(state, strategyBuilderChip, selectorArgs);
            }
        };
        if (state.getShouldUseEducationId()) {
            com.robinhood.android.educationtour.extensions.ViewsKt.setEducationTourId(strategyBuilderChip, filterInvoke.getFilterType().getServerValue());
        }
        if (filterInvoke.getFilterType() == OptionStrategyChainTemplate.FilterType.NEAR_DATE && initialNearDateExpand.consume() != null) {
            function0.invoke();
        }
        OnClickListeners.onClick(strategyBuilderChip, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.pills.PillView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PillView.bind$lambda$2(function0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(State state, StrategyBuilderChip strategyBuilderChip, SelectorArgs selectorArgs) {
        state.getOnClick().invoke(strategyBuilderChip, selectorArgs);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: PillView.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\u008c\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010%\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J\u001b\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eHÆ\u0003J \u0010*\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0015HÆ\u0003J£\u0001\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u001f\b\u0002\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R(\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "T", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;", "", "filterGroup", "selectorArgsMap", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "selectedChoices", "userEditedFilters", "", "onClick", "Lkotlin/Function2;", "Lcom/robinhood/android/optionsstrategybuilder/pills/StrategyBuilderChip;", "", "Lkotlin/ExtensionFunctionType;", "shouldUseEducationId", "", "<init>", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Z)V", "getFilterGroup", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;", "getSelectorArgsMap", "()Ljava/util/Map;", "getChoices", "getSelectedChoices", "getUserEditedFilters", "()Ljava/util/Set;", "getOnClick", "()Lkotlin/jvm/functions/Function2;", "getShouldUseEducationId", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Z)Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "equals", "other", "hashCode", "", "toString", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class State<T extends OptionStrategyChainTemplate.FilterGroup> {
        public static final int $stable = 8;
        private final Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> choices;
        private final T filterGroup;
        private final Function2<StrategyBuilderChip, SelectorArgs, Unit> onClick;
        private final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices;
        private final Map<OptionStrategyChainTemplate.FilterType, SelectorArgs> selectorArgsMap;
        private final boolean shouldUseEducationId;
        private final Set<OptionStrategyChainTemplate.FilterType> userEditedFilters;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, OptionStrategyChainTemplate.FilterGroup filterGroup, Map map, Map map2, Map map3, Set set, Function2 function2, boolean z, int i, Object obj) {
            T t = filterGroup;
            if ((i & 1) != 0) {
                t = state.filterGroup;
            }
            if ((i & 2) != 0) {
                map = state.selectorArgsMap;
            }
            if ((i & 4) != 0) {
                map2 = state.choices;
            }
            if ((i & 8) != 0) {
                map3 = state.selectedChoices;
            }
            if ((i & 16) != 0) {
                set = state.userEditedFilters;
            }
            if ((i & 32) != 0) {
                function2 = state.onClick;
            }
            if ((i & 64) != 0) {
                z = state.shouldUseEducationId;
            }
            Function2 function22 = function2;
            boolean z2 = z;
            Set set2 = set;
            Map map4 = map2;
            return state.copy(t, map, map4, map3, set2, function22, z2);
        }

        public final T component1() {
            return this.filterGroup;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, SelectorArgs> component2() {
            return this.selectorArgsMap;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> component3() {
            return this.choices;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> component4() {
            return this.selectedChoices;
        }

        public final Set<OptionStrategyChainTemplate.FilterType> component5() {
            return this.userEditedFilters;
        }

        public final Function2<StrategyBuilderChip, SelectorArgs, Unit> component6() {
            return this.onClick;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldUseEducationId() {
            return this.shouldUseEducationId;
        }

        public final State<T> copy(T filterGroup, Map<OptionStrategyChainTemplate.FilterType, SelectorArgs> selectorArgsMap, Map<OptionStrategyChainTemplate.FilterType, ? extends List<? extends OptionStrategyBuilderViewState.Choice>> choices, Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, Set<? extends OptionStrategyChainTemplate.FilterType> userEditedFilters, Function2<? super StrategyBuilderChip, ? super SelectorArgs, Unit> onClick, boolean shouldUseEducationId) {
            Intrinsics.checkNotNullParameter(filterGroup, "filterGroup");
            Intrinsics.checkNotNullParameter(selectorArgsMap, "selectorArgsMap");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
            Intrinsics.checkNotNullParameter(userEditedFilters, "userEditedFilters");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return new State<>(filterGroup, selectorArgsMap, choices, selectedChoices, userEditedFilters, onClick, shouldUseEducationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.filterGroup, state.filterGroup) && Intrinsics.areEqual(this.selectorArgsMap, state.selectorArgsMap) && Intrinsics.areEqual(this.choices, state.choices) && Intrinsics.areEqual(this.selectedChoices, state.selectedChoices) && Intrinsics.areEqual(this.userEditedFilters, state.userEditedFilters) && Intrinsics.areEqual(this.onClick, state.onClick) && this.shouldUseEducationId == state.shouldUseEducationId;
        }

        public int hashCode() {
            return (((((((((((this.filterGroup.hashCode() * 31) + this.selectorArgsMap.hashCode()) * 31) + this.choices.hashCode()) * 31) + this.selectedChoices.hashCode()) * 31) + this.userEditedFilters.hashCode()) * 31) + this.onClick.hashCode()) * 31) + Boolean.hashCode(this.shouldUseEducationId);
        }

        public String toString() {
            return "State(filterGroup=" + this.filterGroup + ", selectorArgsMap=" + this.selectorArgsMap + ", choices=" + this.choices + ", selectedChoices=" + this.selectedChoices + ", userEditedFilters=" + this.userEditedFilters + ", onClick=" + this.onClick + ", shouldUseEducationId=" + this.shouldUseEducationId + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public State(T filterGroup, Map<OptionStrategyChainTemplate.FilterType, SelectorArgs> selectorArgsMap, Map<OptionStrategyChainTemplate.FilterType, ? extends List<? extends OptionStrategyBuilderViewState.Choice>> choices, Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, Set<? extends OptionStrategyChainTemplate.FilterType> userEditedFilters, Function2<? super StrategyBuilderChip, ? super SelectorArgs, Unit> onClick, boolean z) {
            Intrinsics.checkNotNullParameter(filterGroup, "filterGroup");
            Intrinsics.checkNotNullParameter(selectorArgsMap, "selectorArgsMap");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
            Intrinsics.checkNotNullParameter(userEditedFilters, "userEditedFilters");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            this.filterGroup = filterGroup;
            this.selectorArgsMap = selectorArgsMap;
            this.choices = choices;
            this.selectedChoices = selectedChoices;
            this.userEditedFilters = userEditedFilters;
            this.onClick = onClick;
            this.shouldUseEducationId = z;
        }

        public final T getFilterGroup() {
            return this.filterGroup;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, SelectorArgs> getSelectorArgsMap() {
            return this.selectorArgsMap;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, List<OptionStrategyBuilderViewState.Choice>> getChoices() {
            return this.choices;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getSelectedChoices() {
            return this.selectedChoices;
        }

        public /* synthetic */ State(OptionStrategyChainTemplate.FilterGroup filterGroup, Map map, Map map2, Map map3, Set set, Function2 function2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(filterGroup, map, map2, map3, (i & 16) != 0 ? SetsKt.emptySet() : set, function2, (i & 64) != 0 ? true : z);
        }

        public final Set<OptionStrategyChainTemplate.FilterType> getUserEditedFilters() {
            return this.userEditedFilters;
        }

        public final Function2<StrategyBuilderChip, SelectorArgs, Unit> getOnClick() {
            return this.onClick;
        }

        public final boolean getShouldUseEducationId() {
            return this.shouldUseEducationId;
        }
    }

    /* compiled from: PillView.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000234BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\n2\u0006\u0010\u001f\u001a\u00020\u001eJ\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u001f\u001a\u00020\u001eJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010&\u001a\u00020\u001eJ\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u001eHÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "Landroid/os/Parcelable;", "filter", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$Filter;", "forceRule", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$ForceRule;", InquiryField.ChoicesField.TYPE, "", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "selectedChoices", "", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "disabledIndex", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$DisabledMode;", "<init>", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$Filter;Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$ForceRule;Ljava/util/List;Ljava/util/Map;Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$DisabledMode;)V", "getFilter", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$Filter;", "getForceRule", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$ForceRule;", "getChoices", "()Ljava/util/List;", "getSelectedChoices", "()Ljava/util/Map;", "getDisabledIndex", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$DisabledMode;", "selectedChoice", "getSelectedChoice", "()Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderViewState$Choice;", "getSelectedIndexes", "", "newSelectedIndex", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ForceRule", "Rule", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class SelectorArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SelectorArgs> CREATOR = new Creator();
        private final List<OptionStrategyBuilderViewState.Choice> choices;
        private final DisabledMode disabledIndex;
        private final OptionStrategyChainTemplate.Filter filter;
        private final ForceRule forceRule;
        private final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> selectedChoices;

        /* compiled from: PillView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectorArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectorArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OptionStrategyChainTemplate.Filter filter = (OptionStrategyChainTemplate.Filter) parcel.readParcelable(SelectorArgs.class.getClassLoader());
                ForceRule forceRuleCreateFromParcel = parcel.readInt() == 0 ? null : ForceRule.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SelectorArgs.class.getClassLoader()));
                }
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap.put(OptionStrategyChainTemplate.FilterType.valueOf(parcel.readString()), parcel.readParcelable(SelectorArgs.class.getClassLoader()));
                }
                return new SelectorArgs(filter, forceRuleCreateFromParcel, arrayList, linkedHashMap, parcel.readInt() != 0 ? DisabledMode.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectorArgs[] newArray(int i) {
                return new SelectorArgs[i];
            }
        }

        /* compiled from: PillView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Rule.values().length];
                try {
                    iArr[Rule.MUST_BE_LESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Rule.MUST_BE_GREATER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ SelectorArgs copy$default(SelectorArgs selectorArgs, OptionStrategyChainTemplate.Filter filter, ForceRule forceRule, List list, Map map, DisabledMode disabledMode, int i, Object obj) {
            if ((i & 1) != 0) {
                filter = selectorArgs.filter;
            }
            if ((i & 2) != 0) {
                forceRule = selectorArgs.forceRule;
            }
            if ((i & 4) != 0) {
                list = selectorArgs.choices;
            }
            if ((i & 8) != 0) {
                map = selectorArgs.selectedChoices;
            }
            if ((i & 16) != 0) {
                disabledMode = selectorArgs.disabledIndex;
            }
            DisabledMode disabledMode2 = disabledMode;
            List list2 = list;
            return selectorArgs.copy(filter, forceRule, list2, map, disabledMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStrategyChainTemplate.Filter getFilter() {
            return this.filter;
        }

        /* renamed from: component2, reason: from getter */
        public final ForceRule getForceRule() {
            return this.forceRule;
        }

        public final List<OptionStrategyBuilderViewState.Choice> component3() {
            return this.choices;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> component4() {
            return this.selectedChoices;
        }

        /* renamed from: component5, reason: from getter */
        public final DisabledMode getDisabledIndex() {
            return this.disabledIndex;
        }

        public final SelectorArgs copy(OptionStrategyChainTemplate.Filter filter, ForceRule forceRule, List<? extends OptionStrategyBuilderViewState.Choice> choices, Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, DisabledMode disabledIndex) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
            return new SelectorArgs(filter, forceRule, choices, selectedChoices, disabledIndex);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectorArgs)) {
                return false;
            }
            SelectorArgs selectorArgs = (SelectorArgs) other;
            return Intrinsics.areEqual(this.filter, selectorArgs.filter) && Intrinsics.areEqual(this.forceRule, selectorArgs.forceRule) && Intrinsics.areEqual(this.choices, selectorArgs.choices) && Intrinsics.areEqual(this.selectedChoices, selectorArgs.selectedChoices) && this.disabledIndex == selectorArgs.disabledIndex;
        }

        public int hashCode() {
            int iHashCode = this.filter.hashCode() * 31;
            ForceRule forceRule = this.forceRule;
            int iHashCode2 = (((((iHashCode + (forceRule == null ? 0 : forceRule.hashCode())) * 31) + this.choices.hashCode()) * 31) + this.selectedChoices.hashCode()) * 31;
            DisabledMode disabledMode = this.disabledIndex;
            return iHashCode2 + (disabledMode != null ? disabledMode.hashCode() : 0);
        }

        public String toString() {
            return "SelectorArgs(filter=" + this.filter + ", forceRule=" + this.forceRule + ", choices=" + this.choices + ", selectedChoices=" + this.selectedChoices + ", disabledIndex=" + this.disabledIndex + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.filter, flags);
            ForceRule forceRule = this.forceRule;
            if (forceRule == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                forceRule.writeToParcel(dest, flags);
            }
            List<OptionStrategyBuilderViewState.Choice> list = this.choices;
            dest.writeInt(list.size());
            Iterator<OptionStrategyBuilderViewState.Choice> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> map = this.selectedChoices;
            dest.writeInt(map.size());
            for (Map.Entry<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> entry : map.entrySet()) {
                dest.writeString(entry.getKey().name());
                dest.writeParcelable(entry.getValue(), flags);
            }
            DisabledMode disabledMode = this.disabledIndex;
            if (disabledMode == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(disabledMode.name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SelectorArgs(OptionStrategyChainTemplate.Filter filter, ForceRule forceRule, List<? extends OptionStrategyBuilderViewState.Choice> choices, Map<OptionStrategyChainTemplate.FilterType, ? extends OptionStrategyBuilderViewState.Choice> selectedChoices, DisabledMode disabledMode) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(choices, "choices");
            Intrinsics.checkNotNullParameter(selectedChoices, "selectedChoices");
            this.filter = filter;
            this.forceRule = forceRule;
            this.choices = choices;
            this.selectedChoices = selectedChoices;
            this.disabledIndex = disabledMode;
        }

        public final OptionStrategyChainTemplate.Filter getFilter() {
            return this.filter;
        }

        public final ForceRule getForceRule() {
            return this.forceRule;
        }

        public final List<OptionStrategyBuilderViewState.Choice> getChoices() {
            return this.choices;
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getSelectedChoices() {
            return this.selectedChoices;
        }

        public final DisabledMode getDisabledIndex() {
            return this.disabledIndex;
        }

        public final OptionStrategyBuilderViewState.Choice getSelectedChoice() {
            return this.selectedChoices.get(this.filter.getFilterType());
        }

        public final Map<OptionStrategyChainTemplate.FilterType, Integer> getSelectedIndexes(int newSelectedIndex) {
            Tuples2 tuples2M3642to;
            Tuples2 tuples2M3642to2 = Tuples4.m3642to(this.filter.getFilterType(), Integer.valueOf(newSelectedIndex));
            ForceRule forceRule = this.forceRule;
            if (forceRule == null) {
                return MapsKt.mapOf(tuples2M3642to2);
            }
            OptionStrategyBuilderViewState.Choice choice = this.selectedChoices.get(forceRule.getFilterType());
            Integer num = null;
            if (choice != null) {
                Integer numValueOf = Integer.valueOf(this.choices.indexOf(choice));
                if (numValueOf.intValue() != -1) {
                    num = numValueOf;
                }
            }
            int i = WhenMappings.$EnumSwitchMapping$0[this.forceRule.getRule().ordinal()];
            if (i == 1) {
                int i2 = newSelectedIndex - 1;
                tuples2M3642to = Tuples4.m3642to(this.forceRule.getFilterType(), Integer.valueOf(RangesKt.coerceIn(num != null ? num.intValue() : i2, 0, i2)));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = newSelectedIndex + 1;
                tuples2M3642to = Tuples4.m3642to(this.forceRule.getFilterType(), Integer.valueOf(RangesKt.coerceIn(num != null ? num.intValue() : i3, i3, CollectionsKt.getLastIndex(this.choices))));
            }
            return MapsKt.mapOf(tuples2M3642to2, tuples2M3642to);
        }

        public final Map<OptionStrategyChainTemplate.FilterType, OptionStrategyBuilderViewState.Choice> getSelectedChoices(int newSelectedIndex) {
            Map<OptionStrategyChainTemplate.FilterType, Integer> selectedIndexes = getSelectedIndexes(newSelectedIndex);
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(selectedIndexes.size()));
            Iterator<T> it = selectedIndexes.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), this.choices.get(((Number) entry.getValue()).intValue()));
            }
            return linkedHashMap;
        }

        /* compiled from: PillView.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$ForceRule;", "Landroid/os/Parcelable;", "filterType", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "rule", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$Rule;", "<init>", "(Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$Rule;)V", "getFilterType", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterType;", "getRule", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$Rule;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ForceRule implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ForceRule> CREATOR = new Creator();
            private final OptionStrategyChainTemplate.FilterType filterType;
            private final Rule rule;

            /* compiled from: PillView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ForceRule> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForceRule createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ForceRule(OptionStrategyChainTemplate.FilterType.valueOf(parcel.readString()), Rule.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ForceRule[] newArray(int i) {
                    return new ForceRule[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.filterType.name());
                dest.writeString(this.rule.name());
            }

            public ForceRule(OptionStrategyChainTemplate.FilterType filterType, Rule rule) {
                Intrinsics.checkNotNullParameter(filterType, "filterType");
                Intrinsics.checkNotNullParameter(rule, "rule");
                this.filterType = filterType;
                this.rule = rule;
            }

            public final OptionStrategyChainTemplate.FilterType getFilterType() {
                return this.filterType;
            }

            public final Rule getRule() {
                return this.rule;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PillView.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs$Rule;", "", "<init>", "(Ljava/lang/String;I)V", "MUST_BE_LESS", "MUST_BE_GREATER", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Rule {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Rule[] $VALUES;
            public static final Rule MUST_BE_LESS = new Rule("MUST_BE_LESS", 0);
            public static final Rule MUST_BE_GREATER = new Rule("MUST_BE_GREATER", 1);

            private static final /* synthetic */ Rule[] $values() {
                return new Rule[]{MUST_BE_LESS, MUST_BE_GREATER};
            }

            public static EnumEntries<Rule> getEntries() {
                return $ENTRIES;
            }

            private Rule(String str, int i) {
            }

            static {
                Rule[] ruleArr$values = $values();
                $VALUES = ruleArr$values;
                $ENTRIES = EnumEntries2.enumEntries(ruleArr$values);
            }

            public static Rule valueOf(String str) {
                return (Rule) Enum.valueOf(Rule.class, str);
            }

            public static Rule[] values() {
                return (Rule[]) $VALUES.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PillView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$DisabledMode;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "LAST", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisabledMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisabledMode[] $VALUES;
        public static final DisabledMode FIRST = new DisabledMode("FIRST", 0);
        public static final DisabledMode LAST = new DisabledMode("LAST", 1);

        private static final /* synthetic */ DisabledMode[] $values() {
            return new DisabledMode[]{FIRST, LAST};
        }

        public static EnumEntries<DisabledMode> getEntries() {
            return $ENTRIES;
        }

        static {
            DisabledMode[] disabledModeArr$values = $values();
            $VALUES = disabledModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(disabledModeArr$values);
        }

        private DisabledMode(String str, int i) {
        }

        public static DisabledMode valueOf(String str) {
            return (DisabledMode) Enum.valueOf(DisabledMode.class, str);
        }

        public static DisabledMode[] values() {
            return (DisabledMode[]) $VALUES.clone();
        }
    }
}
