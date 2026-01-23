package com.robinhood.android.optionsstrategybuilder.pills;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.pills.PillAdapter;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PillAdapter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00162\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0003\u0014\u0015\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00020\u00062\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "onClickNudgeToolEntry", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "initialNearDateExpand", "Lcom/robinhood/udf/UiEvent;", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "Item", "DiffCallback", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PillAdapter extends ListAdapter<Item, GenericViewHolder<?>> {
    public static final int VIEW_TYPE_NUDGE_TOOL = 2;
    public static final int VIEW_TYPE_RANGE_FILTER = 4;
    public static final int VIEW_TYPE_SINGLE_FILTER = 3;
    public static final int VIEW_TYPE_UNSUPPORTED = 5;
    private final UiEvent<Unit> initialNearDateExpand;
    private final Function0<Unit> onClickNudgeToolEntry;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillAdapter(Function0<Unit> onClickNudgeToolEntry) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(onClickNudgeToolEntry, "onClickNudgeToolEntry");
        this.onClickNudgeToolEntry = onClickNudgeToolEntry;
        this.initialNearDateExpand = new UiEvent<>(Unit.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<?> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 2) {
            return new GenericViewHolder<>(ViewGroups.inflate$default(parent, C24876R.layout.include_nudge_tool_rds_chip, false, 2, null));
        }
        if (viewType == 3) {
            return new GenericViewHolder<>(SinglePillView.INSTANCE.inflate(parent));
        }
        if (viewType == 4) {
            return new GenericViewHolder<>(RangePillsView.INSTANCE.inflate(parent));
        }
        if (viewType == 5) {
            return new GenericViewHolder<>(new View(parent.getContext()));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<?> holder, int position) {
        PillView pillView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Item item = getItem(position);
        if (item instanceof Item.SingleFilterPill) {
            View view = holder.getView();
            pillView = view instanceof SinglePillView ? (SinglePillView) view : null;
            if (pillView == null) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(holder.getView());
                throw new ExceptionsH();
            }
            pillView.bind(((Item.SingleFilterPill) item).getPillViewState(), this.initialNearDateExpand);
            return;
        }
        if (item instanceof Item.RangeFilterPill) {
            View view2 = holder.getView();
            pillView = view2 instanceof RangePillsView ? (RangePillsView) view2 : null;
            if (pillView == null) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(holder.getView());
                throw new ExceptionsH();
            }
            pillView.bind(((Item.RangeFilterPill) item).getPillViewState(), this.initialNearDateExpand);
            return;
        }
        if (!(item instanceof Item.NudgeToolEntry)) {
            throw new NoWhenBranchMatchedException();
        }
        OnClickListeners.onClick(holder.getView(), this.onClickNudgeToolEntry);
    }

    /* compiled from: PillAdapter.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "viewType", "", "identifier", "", "<init>", "(ILjava/lang/Object;)V", "getViewType", "()I", "getIdentifier", "()Ljava/lang/Object;", "nearDateSelectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "getNearDateSelectorArgs", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "NudgeToolEntry", "SingleFilterPill", "RangeFilterPill", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item$NudgeToolEntry;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item$RangeFilterPill;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item$SingleFilterPill;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Item implements EducationTourViewData {
        public static final int $stable = 8;
        private final Object identifier;
        private final PillView.SelectorArgs nearDateSelectorArgs;
        private final int viewType;

        public /* synthetic */ Item(int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, obj);
        }

        private Item(int i, Object obj) {
            this.viewType = i;
            this.identifier = obj;
        }

        public final Object getIdentifier() {
            return this.identifier;
        }

        public final int getViewType() {
            return this.viewType;
        }

        public PillView.SelectorArgs getNearDateSelectorArgs() {
            return this.nearDateSelectorArgs;
        }

        /* compiled from: PillAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item$NudgeToolEntry;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "elementIds", "", "", "<init>", "(Ljava/util/List;)V", "getElementIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NudgeToolEntry extends Item {
            public static final int $stable = 8;
            private final List<String> elementIds;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NudgeToolEntry copy$default(NudgeToolEntry nudgeToolEntry, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = nudgeToolEntry.elementIds;
                }
                return nudgeToolEntry.copy(list);
            }

            public final List<String> component1() {
                return this.elementIds;
            }

            public final NudgeToolEntry copy(List<String> elementIds) {
                Intrinsics.checkNotNullParameter(elementIds, "elementIds");
                return new NudgeToolEntry(elementIds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NudgeToolEntry) && Intrinsics.areEqual(this.elementIds, ((NudgeToolEntry) other).elementIds);
            }

            public int hashCode() {
                return this.elementIds.hashCode();
            }

            public String toString() {
                return "NudgeToolEntry(elementIds=" + this.elementIds + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NudgeToolEntry(List<String> elementIds) {
                super(2, Unit.INSTANCE, null);
                Intrinsics.checkNotNullParameter(elementIds, "elementIds");
                this.elementIds = elementIds;
            }

            @Override // com.robinhood.android.educationtour.interfaces.EducationTourViewData
            public List<String> getElementIds() {
                return this.elementIds;
            }
        }

        /* compiled from: PillAdapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item$SingleFilterPill;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "pillViewState", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup$SingleFilterGroup;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;)V", "getPillViewState", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "elementIds", "", "", "getElementIds", "()Ljava/util/List;", "nearDateSelectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "getNearDateSelectorArgs", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SingleFilterPill extends Item {
            public static final int $stable = 8;
            private final List<String> elementIds;
            private final PillView.State<OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup> pillViewState;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SingleFilterPill copy$default(SingleFilterPill singleFilterPill, PillView.State state, int i, Object obj) {
                if ((i & 1) != 0) {
                    state = singleFilterPill.pillViewState;
                }
                return singleFilterPill.copy(state);
            }

            public final PillView.State<OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup> component1() {
                return this.pillViewState;
            }

            public final SingleFilterPill copy(PillView.State<OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup> pillViewState) {
                Intrinsics.checkNotNullParameter(pillViewState, "pillViewState");
                return new SingleFilterPill(pillViewState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleFilterPill) && Intrinsics.areEqual(this.pillViewState, ((SingleFilterPill) other).pillViewState);
            }

            public int hashCode() {
                return this.pillViewState.hashCode();
            }

            public String toString() {
                return "SingleFilterPill(pillViewState=" + this.pillViewState + ")";
            }

            public final PillView.State<OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup> getPillViewState() {
                return this.pillViewState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFilterPill(PillView.State<OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup> pillViewState) {
                super(3, CollectionsKt.joinToString$default(OptionStrategyChainTemplates.getFilters(pillViewState.getFilterGroup()), null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.pills.PillAdapter$Item$SingleFilterPill$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PillAdapter.Item.SingleFilterPill._init_$lambda$0((OptionStrategyChainTemplate.Filter) obj);
                    }
                }, 31, null), null);
                Intrinsics.checkNotNullParameter(pillViewState, "pillViewState");
                this.pillViewState = pillViewState;
                this.elementIds = CollectionsKt.mutableListOf(((OptionStrategyChainTemplate.FilterGroup.SingleFilterGroup) pillViewState.getFilterGroup()).getFilter().getFilterType().getServerValue());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence _init_$lambda$0(OptionStrategyChainTemplate.Filter it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getFilterType().name();
            }

            @Override // com.robinhood.android.educationtour.interfaces.EducationTourViewData
            public List<String> getElementIds() {
                return this.elementIds;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.pills.PillAdapter.Item
            public PillView.SelectorArgs getNearDateSelectorArgs() {
                return this.pillViewState.getSelectorArgsMap().get(OptionStrategyChainTemplate.FilterType.NEAR_DATE);
            }
        }

        /* compiled from: PillAdapter.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item$RangeFilterPill;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "pillViewState", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "Lcom/robinhood/models/db/OptionStrategyChainTemplate$FilterGroup$RangeFilterGroup;", "<init>", "(Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;)V", "getPillViewState", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$State;", "elementIds", "", "", "getElementIds", "()Ljava/util/List;", "nearDateSelectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "getNearDateSelectorArgs", "()Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RangeFilterPill extends Item {
            public static final int $stable = 8;
            private final List<String> elementIds;
            private final PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup> pillViewState;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RangeFilterPill copy$default(RangeFilterPill rangeFilterPill, PillView.State state, int i, Object obj) {
                if ((i & 1) != 0) {
                    state = rangeFilterPill.pillViewState;
                }
                return rangeFilterPill.copy(state);
            }

            public final PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup> component1() {
                return this.pillViewState;
            }

            public final RangeFilterPill copy(PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup> pillViewState) {
                Intrinsics.checkNotNullParameter(pillViewState, "pillViewState");
                return new RangeFilterPill(pillViewState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RangeFilterPill) && Intrinsics.areEqual(this.pillViewState, ((RangeFilterPill) other).pillViewState);
            }

            public int hashCode() {
                return this.pillViewState.hashCode();
            }

            public String toString() {
                return "RangeFilterPill(pillViewState=" + this.pillViewState + ")";
            }

            public final PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup> getPillViewState() {
                return this.pillViewState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RangeFilterPill(PillView.State<OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup> pillViewState) {
                super(4, CollectionsKt.joinToString$default(OptionStrategyChainTemplates.getFilters(pillViewState.getFilterGroup()), null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.pills.PillAdapter$Item$RangeFilterPill$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PillAdapter.Item.RangeFilterPill._init_$lambda$0((OptionStrategyChainTemplate.Filter) obj);
                    }
                }, 31, null), null);
                Intrinsics.checkNotNullParameter(pillViewState, "pillViewState");
                this.pillViewState = pillViewState;
                this.elementIds = CollectionsKt.mutableListOf(((OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) pillViewState.getFilterGroup()).getStartFilter().getFilterType().getServerValue(), ((OptionStrategyChainTemplate.FilterGroup.RangeFilterGroup) pillViewState.getFilterGroup()).getEndFilter().getFilterType().getServerValue());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CharSequence _init_$lambda$0(OptionStrategyChainTemplate.Filter it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getFilterType().name();
            }

            @Override // com.robinhood.android.educationtour.interfaces.EducationTourViewData
            public List<String> getElementIds() {
                return this.elementIds;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.pills.PillAdapter.Item
            public PillView.SelectorArgs getNearDateSelectorArgs() {
                return this.pillViewState.getSelectorArgsMap().get(OptionStrategyChainTemplate.FilterType.NEAR_DATE);
            }
        }
    }

    /* compiled from: PillAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillAdapter$Item;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "getChangePayload", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallback extends DiffUtil.ItemCallback<Item> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        /* renamed from: getChangePayload, reason: avoid collision after fix types in other method */
        public void getChangePayload2(Item oldItem, Item newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
        }

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public /* bridge */ /* synthetic */ Object getChangePayload(Item item, Item item2) {
            getChangePayload2(item, item2);
            return Unit.INSTANCE;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Item oldItem, Item newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getIdentifier(), newItem.getIdentifier());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Item oldItem, Item newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
