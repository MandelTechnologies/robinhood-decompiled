package com.robinhood.android.acatsin.partials.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.partials.adapter.BuildPartialItem;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.row.RdsHeaderRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildPartialAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0019\u001a\u001bB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$Callbacks;", "editable", "", "<init>", "(Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$Callbacks;Z)V", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$Callbacks;", "getEditable", "()Z", "getItemViewType", "", "position", "onCreateViewHolder", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Callbacks", "DiffCallback", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class BuildPartialAdapter extends ListAdapter<BuildPartialItem, RecyclerView.ViewHolder> {
    public static final int TYPE_ADD_ASSET = 1;
    public static final int TYPE_ASSET = 2;
    public static final int TYPE_HEADER = 0;
    private final Callbacks callbacks;
    private final boolean editable;
    public static final int $stable = 8;

    /* compiled from: BuildPartialAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$Callbacks;", "", "onAddAssetClicked", "", "addAssetItem", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem$AddAsset;", "onEditAssetClicked", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAddAssetClicked(BuildPartialItem.AddAsset addAssetItem);

        void onEditAssetClicked(UiAcatsAsset asset);
    }

    public /* synthetic */ BuildPartialAdapter(Callbacks callbacks, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(callbacks, (i & 2) != 0 ? true : z);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildPartialAdapter(Callbacks callbacks, boolean z) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.editable = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new SimpleViewHolder(RdsHeaderRowView.INSTANCE.inflate(parent));
        }
        if (viewType == 1 || viewType == 2) {
            return new SimpleViewHolder(RdsRowView.INSTANCE.inflate(parent));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final BuildPartialItem item = getItem(position);
        if (item instanceof BuildPartialItem.Header) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsHeaderRowView");
            RowExtensions.bindHeader((RdsHeaderRowView) view, (BuildPartialItem.Header) item);
            return;
        }
        if (item instanceof BuildPartialItem.AddAsset) {
            View view2 = holder.itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
            RowExtensions.bindAddAsset((RdsRowView) view2, (BuildPartialItem.AddAsset) item);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BuildPartialAdapter.onBindViewHolder$lambda$0(this.f$0, item);
                }
            });
            return;
        }
        if (!(item instanceof BuildPartialItem.Asset)) {
            throw new NoWhenBranchMatchedException();
        }
        View view3 = holder.itemView;
        Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.designsystem.row.RdsRowView");
        RowExtensions.bindAsset((RdsRowView) view3, (BuildPartialItem.Asset) item, this.editable);
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        OnClickListeners.onClick(itemView2, new Function0() { // from class: com.robinhood.android.acatsin.partials.adapter.BuildPartialAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuildPartialAdapter.onBindViewHolder$lambda$1(this.f$0, item);
            }
        });
        holder.itemView.setClickable(this.editable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(BuildPartialAdapter buildPartialAdapter, BuildPartialItem buildPartialItem) {
        buildPartialAdapter.callbacks.onAddAssetClicked((BuildPartialItem.AddAsset) buildPartialItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(BuildPartialAdapter buildPartialAdapter, BuildPartialItem buildPartialItem) {
        buildPartialAdapter.callbacks.onEditAssetClicked(((BuildPartialItem.Asset) buildPartialItem).getAsset());
        return Unit.INSTANCE;
    }

    /* compiled from: BuildPartialAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/acatsin/partials/adapter/BuildPartialItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<BuildPartialItem> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(BuildPartialItem oldItem, BuildPartialItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (newItem.getViewType() != oldItem.getViewType()) {
                return false;
            }
            return oldItem.areItemsTheSame(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(BuildPartialItem oldItem, BuildPartialItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.areContentsTheSame(newItem);
        }
    }
}
