package com.robinhood.utils.p409ui.view.recyclerview;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.utils.extensions.Arrays2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CompositeAdapter.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004/012B'\b\u0002\u0012\u001c\u0010\u0003\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005j\u0002`\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bB'\b\u0016\u0012\u001c\b\u0001\u0010\u0003\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0004\"\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0007\u0010\tB\u001d\b\u0016\u0012\u0012\b\u0001\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J&\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001e\u0010(\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005j\u0002`\u00062\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u000eJ!\u0010+\u001a\u00020\u000e\"\f\b\u0000\u0010,*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010-\u001a\u0002H,¢\u0006\u0002\u0010.R&\u0010\u0003\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005j\u0002`\u00060\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u00063"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter$DelegatedViewHolder;", "children", "", "Lkotlin/collections/IndexedValue;", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapterChild;", "<init>", "([Lkotlin/collections/IndexedValue;)V", "([Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "", "(Ljava/util/List;)V", "[Lkotlin/collections/IndexedValue;", "getItemCount", "", "setHasStableIds", "", "hasStableIds", "", "onAttachedToRecyclerView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onDetachedFromRecyclerView", "getItemId", "", "position", "getItemViewType", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "payloads", "", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onViewRecycled", "onFailedToRecycleView", "childForViewType", "adapterPositionToTarget", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter$Target;", "getFirstItemPositionOf", "T", "adapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)I", "DelegatedViewHolder", "Target", "ChildObserver", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CompositeAdapter extends RecyclerView.Adapter<DelegatedViewHolder> {
    private static final int CHILD_VIEW_TYPE_MASK = 16777215;
    private static final int COMPOSITE_VIEW_TYPE_MASK = -16777216;
    private static final int VIEW_TYPE_SHIFT = 24;
    private final IndexedValue<RecyclerView.Adapter<?>>[] children;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((DelegatedViewHolder) viewHolder, i, (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CompositeAdapter(IndexedValue<? extends RecyclerView.Adapter<?>>[] indexedValueArr) {
        this.children = indexedValueArr;
        int length = indexedValueArr.length;
        if (1 > length || length >= 257) {
            throw new IllegalArgumentException(("Only 1..256 children are supported (" + indexedValueArr.length + " provided)").toString());
        }
        for (IndexedValue indexedValue : indexedValueArr) {
            ((RecyclerView.Adapter) indexedValue.getValue()).registerAdapterDataObserver(new ChildObserver(this, indexedValue));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAdapter(RecyclerView.Adapter<?>... children) {
        this((IndexedValue<? extends RecyclerView.Adapter<?>>[]) Arrays2.arrayWithIndex(children));
        Intrinsics.checkNotNullParameter(children, "children");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAdapter(List<? extends RecyclerView.Adapter<?>> children) {
        this((IndexedValue<? extends RecyclerView.Adapter<?>>[]) Arrays2.arrayWithIndex(children.toArray(new RecyclerView.Adapter[0])));
        Intrinsics.checkNotNullParameter(children, "children");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        int size = 0;
        for (IndexedValue<RecyclerView.Adapter<?>> indexedValue : this.children) {
            size += indexedValue.getValue().getSize();
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean hasStableIds) {
        for (IndexedValue<RecyclerView.Adapter<?>> indexedValue : this.children) {
            indexedValue.getValue().setHasStableIds(hasStableIds);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        for (IndexedValue<RecyclerView.Adapter<?>> indexedValue : this.children) {
            indexedValue.getValue().onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        for (IndexedValue<RecyclerView.Adapter<?>> indexedValue : this.children) {
            indexedValue.getValue().onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        Target targetAdapterPositionToTarget = adapterPositionToTarget(position);
        IndexedValue<RecyclerView.Adapter<?>> indexedValueComponent1 = targetAdapterPositionToTarget.component1();
        return indexedValueComponent1.getValue().getItemId(targetAdapterPositionToTarget.getChildPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Target targetAdapterPositionToTarget = adapterPositionToTarget(position);
        IndexedValue<RecyclerView.Adapter<?>> indexedValueComponent1 = targetAdapterPositionToTarget.component1();
        return INSTANCE.childViewTypeToCompositeViewType(indexedValueComponent1.getValue().getItemViewType(targetAdapterPositionToTarget.getChildPosition()), indexedValueComponent1.getIndex());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DelegatedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView.Adapter<?> value = childForViewType(viewType).getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
        RecyclerView.Adapter<?> adapter = value;
        RecyclerView.ViewHolder viewHolderCreateViewHolder = adapter.createViewHolder(parent, INSTANCE.compositeViewTypeToChildViewType(viewType));
        Intrinsics.checkNotNullExpressionValue(viewHolderCreateViewHolder, "createViewHolder(...)");
        return new DelegatedViewHolder(adapter, viewHolderCreateViewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(DelegatedViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getAdapter$lib_utils_ui_externalDebug().bindViewHolder(holder.getDelegate(), adapterPositionToTarget(position).getChildPosition());
    }

    public void onBindViewHolder(DelegatedViewHolder holder, int position, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder(holder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(DelegatedViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getAdapter$lib_utils_ui_externalDebug().onViewAttachedToWindow(holder.getDelegate());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(DelegatedViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getAdapter$lib_utils_ui_externalDebug().onViewDetachedFromWindow(holder.getDelegate());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(DelegatedViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getAdapter$lib_utils_ui_externalDebug().onViewRecycled(holder.getDelegate());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(DelegatedViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        return holder.getAdapter$lib_utils_ui_externalDebug().onFailedToRecycleView(holder.getDelegate());
    }

    private final IndexedValue<RecyclerView.Adapter<?>> childForViewType(int viewType) {
        return this.children[INSTANCE.compositeViewTypeToChildIndex(viewType)];
    }

    public final Target adapterPositionToTarget(int position) {
        IndexedValue<RecyclerView.Adapter<?>>[] indexedValueArr = this.children;
        int i = 0;
        IndexedValue<RecyclerView.Adapter<?>> indexedValue = indexedValueArr[0];
        while (position - indexedValue.getValue().getSize() >= 0) {
            i++;
            position -= indexedValue.getValue().getSize();
            indexedValue = indexedValueArr[i];
        }
        return new Target(indexedValue, position);
    }

    public final <T extends RecyclerView.Adapter<?>> int getFirstItemPositionOf(T adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int size = 0;
        for (IndexedValue<RecyclerView.Adapter<?>> indexedValue : this.children) {
            if (Intrinsics.areEqual(indexedValue.getValue(), adapter)) {
                break;
            }
            size += indexedValue.getValue().getSize();
        }
        return size;
    }

    /* compiled from: CompositeAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter$DelegatedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "delegate", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "getAdapter$lib_utils_ui_externalDebug", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getDelegate$lib_utils_ui_externalDebug", "()Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DelegatedViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final RecyclerView.Adapter<RecyclerView.ViewHolder> adapter;
        private final RecyclerView.ViewHolder delegate;

        public final RecyclerView.Adapter<RecyclerView.ViewHolder> getAdapter$lib_utils_ui_externalDebug() {
            return this.adapter;
        }

        /* renamed from: getDelegate$lib_utils_ui_externalDebug, reason: from getter */
        public final RecyclerView.ViewHolder getDelegate() {
            return this.delegate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DelegatedViewHolder(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter, RecyclerView.ViewHolder delegate) {
            super(delegate.itemView);
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.adapter = adapter;
            this.delegate = delegate;
        }
    }

    /* compiled from: CompositeAdapter.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0014\u0010\u0002\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0002`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0002`\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter$Target;", "", "child", "Lkotlin/collections/IndexedValue;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapterChild;", "childPosition", "", "<init>", "(Lkotlin/collections/IndexedValue;I)V", "getChild", "()Lkotlin/collections/IndexedValue;", "getChildPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Target {
        public static final int $stable = 8;
        private final IndexedValue<RecyclerView.Adapter<?>> child;
        private final int childPosition;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Target copy$default(Target target, IndexedValue indexedValue, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                indexedValue = target.child;
            }
            if ((i2 & 2) != 0) {
                i = target.childPosition;
            }
            return target.copy(indexedValue, i);
        }

        public final IndexedValue<RecyclerView.Adapter<?>> component1() {
            return this.child;
        }

        /* renamed from: component2, reason: from getter */
        public final int getChildPosition() {
            return this.childPosition;
        }

        public final Target copy(IndexedValue<? extends RecyclerView.Adapter<?>> child, int childPosition) {
            Intrinsics.checkNotNullParameter(child, "child");
            return new Target(child, childPosition);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Target)) {
                return false;
            }
            Target target = (Target) other;
            return Intrinsics.areEqual(this.child, target.child) && this.childPosition == target.childPosition;
        }

        public int hashCode() {
            return (this.child.hashCode() * 31) + Integer.hashCode(this.childPosition);
        }

        public String toString() {
            return "Target(child=" + this.child + ", childPosition=" + this.childPosition + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Target(IndexedValue<? extends RecyclerView.Adapter<?>> child, int i) {
            Intrinsics.checkNotNullParameter(child, "child");
            this.child = child;
            this.childPosition = i;
        }

        public final IndexedValue<RecyclerView.Adapter<?>> getChild() {
            return this.child;
        }

        public final int getChildPosition() {
            return this.childPosition;
        }
    }

    /* compiled from: CompositeAdapter.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J \u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\"\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001c\u0010\u0002\u001a\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter$ChildObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "child", "Lkotlin/collections/IndexedValue;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapterChild;", "<init>", "(Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;Lkotlin/collections/IndexedValue;)V", "computeOffset", "", "project", "position", "onChanged", "", "onItemRangeRemoved", "positionStart", "itemCount", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeInserted", "onItemRangeChanged", "payload", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class ChildObserver extends RecyclerView.AdapterDataObserver {
        private final IndexedValue<RecyclerView.Adapter<?>> child;
        final /* synthetic */ CompositeAdapter this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public ChildObserver(CompositeAdapter compositeAdapter, IndexedValue<? extends RecyclerView.Adapter<?>> child) {
            Intrinsics.checkNotNullParameter(child, "child");
            this.this$0 = compositeAdapter;
            this.child = child;
        }

        private final int computeOffset() {
            int index = this.child.getIndex();
            int size = 0;
            for (int i = 0; i < index; i++) {
                size += ((RecyclerView.Adapter) this.this$0.children[i].getValue()).getSize();
            }
            return size;
        }

        private final int project(int position) {
            return computeOffset() + position;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.this$0.notifyItemRangeChanged(project(0), this.child.getValue().getSize());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            this.this$0.notifyItemRangeRemoved(project(positionStart), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            if (itemCount != 1) {
                throw new IllegalArgumentException("RecyclerView only supports individual move callbacks right now anyway");
            }
            int iComputeOffset = computeOffset();
            this.this$0.notifyItemMoved(fromPosition + iComputeOffset, iComputeOffset + toPosition);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int positionStart, int itemCount) {
            this.this$0.notifyItemRangeInserted(project(positionStart), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount) {
            this.this$0.notifyItemRangeChanged(project(positionStart), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            this.this$0.notifyItemRangeChanged(project(positionStart), itemCount, payload);
        }
    }

    /* compiled from: CompositeAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u00020\t*\u00020\u0005H\u0002J\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\f\u0010\f\u001a\u00020\u0005*\u00020\u0005H\u0002J\f\u0010\r\u001a\u00020\u0005*\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter$Companion;", "", "<init>", "()V", "COMPOSITE_VIEW_TYPE_MASK", "", "CHILD_VIEW_TYPE_MASK", "VIEW_TYPE_SHIFT", "isValidChildViewType", "", "childViewTypeToCompositeViewType", "childIndex", "compositeViewTypeToChildIndex", "compositeViewTypeToChildViewType", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int compositeViewTypeToChildIndex(int i) {
            return i >>> 24;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int compositeViewTypeToChildViewType(int i) {
            return i & CompositeAdapter.CHILD_VIEW_TYPE_MASK;
        }

        private final boolean isValidChildViewType(int i) {
            return (i & CompositeAdapter.COMPOSITE_VIEW_TYPE_MASK) == 0;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int childViewTypeToCompositeViewType(int i, int i2) {
            if (isValidChildViewType(i)) {
                return i | (i2 << 24);
            }
            throw new IllegalArgumentException(("View type must not use upper eight bits: " + i).toString());
        }
    }
}
