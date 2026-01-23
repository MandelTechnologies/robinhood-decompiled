package com.robinhood.android.equitydetail.p123ui.etp;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpItemsAdapter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$Callbacks;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$Callbacks;)V", "displayType", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDisplayType;", "getDisplayType", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDisplayType;", "setDisplayType", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDisplayType;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemViewType", "getItemId", "", "Callbacks", "ViewHolder", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EtpItemsAdapter extends ListAdapter<EtpCompositionItemHolder, ViewHolder> {
    public static final int $stable = 8;
    private final Callbacks callbacks;
    private EtpCompositionViewState3 displayType;

    /* compiled from: EtpItemsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$Callbacks;", "", "onItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onItemSelected(EtpCompositionItemHolder item);
    }

    /* compiled from: EtpItemsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EtpCompositionViewState3.values().length];
            try {
                iArr[EtpCompositionViewState3.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EtpCompositionViewState3.FLAT_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpItemsAdapter(Callbacks callbacks) {
        super(EtpCompositionItemHolder.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.displayType = EtpCompositionViewState3.GRID;
        setHasStableIds(true);
    }

    public final EtpCompositionViewState3 getDisplayType() {
        return this.displayType;
    }

    public final void setDisplayType(EtpCompositionViewState3 etpCompositionViewState3) {
        Intrinsics.checkNotNullParameter(etpCompositionViewState3, "<set-?>");
        this.displayType = etpCompositionViewState3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EtpCompositionItemHolder item = getItem(position);
        Intrinsics.checkNotNull(item);
        holder.bind(item);
        holder.getView().setClickable(item.getIsClickable());
        ViewsKt.setEducationTourId(holder.getView(), EducationTourElementIds.ETP_DIST_LEGEND_ITEM_ELEMENT_ID_PREFIX + position);
        if (item.getIsClickable()) {
            OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpItemsAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EtpItemsAdapter.onBindViewHolder$lambda$0(this.f$0, item);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(EtpItemsAdapter etpItemsAdapter, EtpCompositionItemHolder etpCompositionItemHolder) {
        Callbacks callbacks = etpItemsAdapter.callbacks;
        Intrinsics.checkNotNull(etpCompositionItemHolder);
        callbacks.onItemSelected(etpCompositionItemHolder);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$0[EtpCompositionViewState3.values()[viewType].ordinal()];
        if (i == 1) {
            return new ViewHolder.GridItem(EtpItemGridRowView.INSTANCE.inflate(parent));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new ViewHolder.FlatListItem(EtpItemFlatListRowView.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.displayType.ordinal();
    }

    /* compiled from: EtpItemsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "GridItem", "FlatListItem", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder$FlatListItem;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder$GridItem;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final View view;

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private ViewHolder(View view) {
            super(view);
            this.view = view;
        }

        public View getView() {
            return this.view;
        }

        /* compiled from: EtpItemsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder$GridItem;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder;", "view", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemGridRowView;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpItemGridRowView;)V", "getView", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpItemGridRowView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GridItem extends ViewHolder {
            public static final int $stable = 8;
            private final EtpItemGridRowView view;

            public static /* synthetic */ GridItem copy$default(GridItem gridItem, EtpItemGridRowView etpItemGridRowView, int i, Object obj) {
                if ((i & 1) != 0) {
                    etpItemGridRowView = gridItem.view;
                }
                return gridItem.copy(etpItemGridRowView);
            }

            /* renamed from: component1, reason: from getter */
            public final EtpItemGridRowView getView() {
                return this.view;
            }

            public final GridItem copy(EtpItemGridRowView view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return new GridItem(view);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GridItem) && Intrinsics.areEqual(this.view, ((GridItem) other).view);
            }

            public int hashCode() {
                return this.view.hashCode();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
            public String toString() {
                return "GridItem(view=" + this.view + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GridItem(EtpItemGridRowView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @Override // com.robinhood.android.equitydetail.ui.etp.EtpItemsAdapter.ViewHolder
            public EtpItemGridRowView getView() {
                return this.view;
            }
        }

        /* compiled from: EtpItemsAdapter.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder$FlatListItem;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$ViewHolder;", "view", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemFlatListRowView;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpItemFlatListRowView;)V", "getView", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpItemFlatListRowView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FlatListItem extends ViewHolder {
            public static final int $stable = 8;
            private final EtpItemFlatListRowView view;

            public static /* synthetic */ FlatListItem copy$default(FlatListItem flatListItem, EtpItemFlatListRowView etpItemFlatListRowView, int i, Object obj) {
                if ((i & 1) != 0) {
                    etpItemFlatListRowView = flatListItem.view;
                }
                return flatListItem.copy(etpItemFlatListRowView);
            }

            /* renamed from: component1, reason: from getter */
            public final EtpItemFlatListRowView getView() {
                return this.view;
            }

            public final FlatListItem copy(EtpItemFlatListRowView view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return new FlatListItem(view);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FlatListItem) && Intrinsics.areEqual(this.view, ((FlatListItem) other).view);
            }

            public int hashCode() {
                return this.view.hashCode();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
            public String toString() {
                return "FlatListItem(view=" + this.view + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlatListItem(EtpItemFlatListRowView view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @Override // com.robinhood.android.equitydetail.ui.etp.EtpItemsAdapter.ViewHolder
            public EtpItemFlatListRowView getView() {
                return this.view;
            }
        }

        public final void bind(EtpCompositionItemHolder item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (this instanceof FlatListItem) {
                ((FlatListItem) this).getView().bind(item);
            } else {
                if (!(this instanceof GridItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((GridItem) this).getView().bind(item);
            }
        }
    }
}
