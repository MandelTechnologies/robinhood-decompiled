package com.robinhood.android.cash.atm.p069ui;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.android.cash.atm.p069ui.AtmAdapter2;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AtmAdapter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u000bJ\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0082\u000e¢\u0006\n\n\u0002\u0010\u000f\"\u0004\b\r\u0010\u000e¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/cash/atm/ui/AtmViewHolder;", "<init>", "()V", "items", "", "Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem;", "userLocation", "Landroid/location/Location;", "newValue", "", "highlightedRowIndex", "setHighlightedRowIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "updateViewState", "", "viewState", "Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState;", "getAtmPosition", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "(Lcom/robinhood/models/api/minerva/Atm;)Ljava/lang/Integer;", "highlightAtmFromPosition", "atmPosition", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "getItemViewType", "RowItem", "Companion", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtmAdapter extends RecyclerView.Adapter<AtmAdapter2> {
    private static final int VIEW_TYPE_ATM = 1;
    private static final int VIEW_TYPE_HEADER = 0;
    private Integer highlightedRowIndex;
    private final List<RowItem> items = CollectionsKt.mutableListOf(new RowItem.Header(0, true));
    private Location userLocation;
    public static final int $stable = 8;

    private final void setHighlightedRowIndex(Integer num) {
        Integer num2 = this.highlightedRowIndex;
        if (num != null) {
            notifyItemChanged(num.intValue());
        }
        if (num2 != null) {
            notifyItemChanged(num2.intValue());
        }
        this.highlightedRowIndex = num;
    }

    public final void updateViewState(AtmFinderViewState viewState) {
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        this.items.clear();
        this.items.add(new RowItem.Header(viewState.getFilteredAtms().size(), viewState.getLoading()));
        if (!viewState.getLoading()) {
            this.userLocation = viewState.getUserLocation();
            List<RowItem> list = this.items;
            List<Atm> filteredAtms = viewState.getFilteredAtms();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filteredAtms, 10));
            Iterator<T> it = filteredAtms.iterator();
            while (it.hasNext()) {
                arrayList.add(new RowItem.Item((Atm) it.next()));
            }
            list.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    public final Integer getAtmPosition(Atm atm) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        Iterator<RowItem> it = this.items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            RowItem next = it.next();
            if ((next instanceof RowItem.Item) && Intrinsics.areEqual(((RowItem.Item) next).getAtm(), atm)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() != -1) {
            return numValueOf;
        }
        return null;
    }

    public final Atm highlightAtmFromPosition(int atmPosition) {
        Object orNull = CollectionsKt.getOrNull(this.items, atmPosition);
        RowItem.Item item = orNull instanceof RowItem.Item ? (RowItem.Item) orNull : null;
        if (item == null) {
            return null;
        }
        setHighlightedRowIndex(Integer.valueOf(atmPosition));
        return item.getAtm();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public AtmAdapter2 onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new AtmAdapter2.Header(ViewGroups.inflate(parent, C9956R.layout.row_atm_header, false));
        }
        if (viewType == 1) {
            return new AtmAdapter2.Item(ViewGroups.inflate(parent, C9956R.layout.row_atm_detail, false));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(AtmAdapter2 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RowItem rowItem = this.items.get(position);
        if (holder instanceof AtmAdapter2.Header) {
            Intrinsics.checkNotNull(rowItem, "null cannot be cast to non-null type com.robinhood.android.cash.atm.ui.AtmAdapter.RowItem.Header");
            RowItem.Header header = (RowItem.Header) rowItem;
            ((AtmAdapter2.Header) holder).bind(header.getAtmCount(), header.getIsLoading());
        } else {
            if (!(holder instanceof AtmAdapter2.Item)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(rowItem, "null cannot be cast to non-null type com.robinhood.android.cash.atm.ui.AtmAdapter.RowItem.Item");
            RowItem.Item item = (RowItem.Item) rowItem;
            View view = holder.itemView;
            Integer num = this.highlightedRowIndex;
            view.setSelected(num != null && position == num.intValue());
            ((AtmAdapter2.Item) holder).bind(item.getAtm(), holder.itemView.isSelected(), this.userLocation);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.items.get(position).getViewType();
    }

    /* compiled from: AtmAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "Header", "Item", "Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem$Header;", "Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem$Item;", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RowItem {
        public static final int $stable = 0;
        private final int viewType;

        public /* synthetic */ RowItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        private RowItem(int i) {
            this.viewType = i;
        }

        public final int getViewType() {
            return this.viewType;
        }

        /* compiled from: AtmAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem$Header;", "Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem;", "atmCount", "", "isLoading", "", "<init>", "(IZ)V", "getAtmCount", "()I", "()Z", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Header extends RowItem {
            public static final int $stable = 0;
            private final int atmCount;
            private final boolean isLoading;

            public Header(int i, boolean z) {
                super(0, null);
                this.atmCount = i;
                this.isLoading = z;
            }

            public final int getAtmCount() {
                return this.atmCount;
            }

            /* renamed from: isLoading, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }
        }

        /* compiled from: AtmAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem$Item;", "Lcom/robinhood/android/cash/atm/ui/AtmAdapter$RowItem;", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "<init>", "(Lcom/robinhood/models/api/minerva/Atm;)V", "getAtm", "()Lcom/robinhood/models/api/minerva/Atm;", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Item extends RowItem {
            public static final int $stable = 8;
            private final Atm atm;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Item(Atm atm) {
                super(1, null);
                Intrinsics.checkNotNullParameter(atm, "atm");
                this.atm = atm;
            }

            public final Atm getAtm() {
                return this.atm;
            }
        }
    }
}
