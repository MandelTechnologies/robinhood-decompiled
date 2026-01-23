package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p355ui.Pricebook;
import com.robinhood.models.p355ui.UiPricebookPair;
import com.robinhood.models.util.Money;
import com.robinhood.shared.iac.infobanner.InfoBannerComponentView;
import com.robinhood.test.idler.TrackedListAdapter;
import com.robinhood.utils.extensions.ViewGroups;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PricebookAdapter.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001e\u001f !B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter;", "Lcom/robinhood/test/idler/TrackedListAdapter;", "", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "value", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "viewState", "getViewState", "()Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "setViewState", "(Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;)V", "dataList", "", "pricebookPairs", "Lcom/robinhood/models/ui/UiPricebookPair;", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "DiffCallbacks", "ViewType", "ViewHolder", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class PricebookAdapter extends TrackedListAdapter<Object, ViewHolder> {
    private static final int BOOK_HEADER_SENTINEL = 2;
    private static final int GRAPH_HEADER_SENTINEL = 1;
    private static final int IAC_INFO_BANNER_SENTINEL = 0;
    private final Context context;
    private List<? extends Object> dataList;
    private List<UiPricebookPair> pricebookPairs;
    private Level2ViewState viewState;
    public static final int $stable = 8;

    /* compiled from: PricebookAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.GRAPH_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.BOOK_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ViewType.BID_ASK_ROW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ViewType.IAC_INFO_BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PricebookAdapter(Context context) {
        super(DiffCallbacks.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.dataList = CollectionsKt.emptyList();
        this.pricebookPairs = CollectionsKt.emptyList();
    }

    /* compiled from: PricebookAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$DiffCallbacks;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class DiffCallbacks extends DiffUtil.ItemCallback<Object> {
        public static final DiffCallbacks INSTANCE = new DiffCallbacks();

        private DiffCallbacks() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (Intrinsics.areEqual(oldItem, (Object) 1)) {
                return Intrinsics.areEqual(newItem, (Object) 1);
            }
            if (Intrinsics.areEqual(oldItem, (Object) 2)) {
                return Intrinsics.areEqual(newItem, (Object) 2);
            }
            if (oldItem instanceof UiPricebookPair) {
                return (newItem instanceof UiPricebookPair) && ((UiPricebookPair) oldItem).getIndex() == ((UiPricebookPair) newItem).getIndex();
            }
            if (Intrinsics.areEqual(oldItem, (Object) 0)) {
                return Intrinsics.areEqual(newItem, (Object) 0);
            }
            throw new AssertionError("impossible item " + oldItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (Intrinsics.areEqual(oldItem, (Object) 1) && Intrinsics.areEqual(newItem, (Object) 1)) {
                return false;
            }
            if (Intrinsics.areEqual(oldItem, (Object) 2) && Intrinsics.areEqual(newItem, (Object) 2)) {
                return true;
            }
            return Intrinsics.areEqual(oldItem, (Object) 0) && Intrinsics.areEqual(newItem, (Object) 0);
        }
    }

    public final Level2ViewState getViewState() {
        return this.viewState;
    }

    public final void setViewState(Level2ViewState level2ViewState) {
        Pricebook pricebook;
        this.viewState = level2ViewState;
        List<UiPricebookPair> sortedPairs = (level2ViewState == null || (pricebook = level2ViewState.getPricebook()) == null) ? null : pricebook.getSortedPairs();
        if (sortedPairs == null) {
            sortedPairs = CollectionsKt.emptyList();
        }
        this.pricebookPairs = sortedPairs;
        List<? extends Object> listPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2}), (Iterable) this.pricebookPairs);
        this.dataList = listPlus;
        submitList(listPlus);
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return ViewType.IAC_INFO_BANNER.ordinal();
        }
        if (position == 1) {
            return ViewType.GRAPH_HEADER.ordinal();
        }
        if (position == 2) {
            return ViewType.BOOK_HEADER.ordinal();
        }
        return ViewType.BID_ASK_ROW.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$0[ViewType.INSTANCE.getValues().get(viewType).ordinal()];
        if (i == 1) {
            return new ViewHolder.GraphHeader(Level2HeaderView.INSTANCE.inflate(parent));
        }
        if (i == 2) {
            return new ViewHolder.BookHeader(ViewGroups.inflate$default(parent, C15314R.layout.row_level_2_pricebook_header, false, 2, null));
        }
        if (i == 3) {
            return new ViewHolder.Row(ViewGroups.inflate$default(parent, C15314R.layout.row_level_2_price, false, 2, null));
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new ViewHolder.IacInfoBanner(new InfoBannerComponentView(this.context, null, 2, null));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof ViewHolder.GraphHeader) {
            ((ViewHolder.GraphHeader) holder).bind(this.viewState);
            return;
        }
        if (holder instanceof ViewHolder.Row) {
            Object obj = this.dataList.get(position);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.models.ui.UiPricebookPair");
            ((ViewHolder.Row) holder).bind((UiPricebookPair) obj);
        } else {
            if (holder instanceof ViewHolder.BookHeader) {
                return;
            }
            if (!(holder instanceof ViewHolder.IacInfoBanner)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ViewHolder.IacInfoBanner) holder).bind(this.viewState);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PricebookAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "GRAPH_HEADER", "BOOK_HEADER", "BID_ASK_ROW", "IAC_INFO_BANNER", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final EnumEntries<ViewType> values;
        public static final ViewType GRAPH_HEADER = new ViewType("GRAPH_HEADER", 0);
        public static final ViewType BOOK_HEADER = new ViewType("BOOK_HEADER", 1);
        public static final ViewType BID_ASK_ROW = new ViewType("BID_ASK_ROW", 2);
        public static final ViewType IAC_INFO_BANNER = new ViewType("IAC_INFO_BANNER", 3);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{GRAPH_HEADER, BOOK_HEADER, BID_ASK_ROW, IAC_INFO_BANNER};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(viewTypeArr$values);
            INSTANCE = new Companion(null);
            values = getEntries();
        }

        /* compiled from: PricebookAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewType$Companion;", "", "<init>", "()V", "values", "Lkotlin/enums/EnumEntries;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewType;", "getValues", "()Lkotlin/enums/EnumEntries;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final EnumEntries<ViewType> getValues() {
                return ViewType.values;
            }
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: PricebookAdapter.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "IacInfoBanner", "GraphHeader", "BookHeader", "Row", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$BookHeader;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$GraphHeader;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$IacInfoBanner;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$Row;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        public /* synthetic */ ViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        private ViewHolder(View view) {
            super(view);
        }

        /* compiled from: PricebookAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$IacInfoBanner;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder;", "infoBannerComponentView", "Lcom/robinhood/shared/iac/infobanner/InfoBannerComponentView;", "<init>", "(Lcom/robinhood/shared/iac/infobanner/InfoBannerComponentView;)V", "bind", "", "state", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class IacInfoBanner extends ViewHolder {
            public static final int $stable = 8;
            private final InfoBannerComponentView infoBannerComponentView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IacInfoBanner(InfoBannerComponentView infoBannerComponentView) {
                super(infoBannerComponentView, null);
                Intrinsics.checkNotNullParameter(infoBannerComponentView, "infoBannerComponentView");
                this.infoBannerComponentView = infoBannerComponentView;
            }

            public final void bind(Level2ViewState state) {
                this.infoBannerComponentView.bind(state != null ? state.getAccountNumber() : null, IacInfoBannerLocation.INFO_BANNER_STOCK_L2_DETAIL_TOP_LEVEL, PaddingKt.m5139PaddingValuesa9UjIt4$default(0.0f, C2002Dp.m7995constructorimpl(8), 0.0f, 0.0f, 13, null));
            }
        }

        /* compiled from: PricebookAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$GraphHeader;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder;", "headerView", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2HeaderView;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2HeaderView;)V", "bind", "", "state", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class GraphHeader extends ViewHolder {
            public static final int $stable = 8;
            private final Level2HeaderView headerView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GraphHeader(Level2HeaderView headerView) {
                super(headerView, null);
                Intrinsics.checkNotNullParameter(headerView, "headerView");
                this.headerView = headerView;
            }

            public final void bind(Level2ViewState state) {
                this.headerView.bindData(state);
            }
        }

        /* compiled from: PricebookAdapter.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$BookHeader;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class BookHeader extends ViewHolder {
            public static final int $stable = 8;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BookHeader(View itemView) {
                super(itemView, null);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
            }
        }

        /* compiled from: PricebookAdapter.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder$Row;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bidQuantityTxt", "Landroid/widget/TextView;", "bidPriceTxt", "askQuantityTxt", "askPriceTxt", "bind", "", "pricebookPair", "Lcom/robinhood/models/ui/UiPricebookPair;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Row extends ViewHolder {
            public static final int $stable = 8;
            private final TextView askPriceTxt;
            private final TextView askQuantityTxt;
            private final TextView bidPriceTxt;
            private final TextView bidQuantityTxt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Row(View itemView) {
                super(itemView, null);
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                View viewFindViewById = itemView.findViewById(C15314R.id.bid_quantity_txt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.bidQuantityTxt = (TextView) viewFindViewById;
                View viewFindViewById2 = itemView.findViewById(C15314R.id.bid_price_txt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                this.bidPriceTxt = (TextView) viewFindViewById2;
                View viewFindViewById3 = itemView.findViewById(C15314R.id.ask_quantity_txt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                this.askQuantityTxt = (TextView) viewFindViewById3;
                View viewFindViewById4 = itemView.findViewById(C15314R.id.ask_price_txt);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                this.askPriceTxt = (TextView) viewFindViewById4;
            }

            public final void bind(UiPricebookPair pricebookPair) {
                Money price;
                BigDecimal quantity;
                Money price2;
                BigDecimal quantity2;
                Intrinsics.checkNotNullParameter(pricebookPair, "pricebookPair");
                Pricebook.Entry bid = pricebookPair.getBid();
                Pricebook.Entry ask = pricebookPair.getAsk();
                String str = null;
                this.bidQuantityTxt.setText((bid == null || (quantity2 = bid.getQuantity()) == null) ? null : BigDecimals2.truncateLarge$default(quantity2, Formats.getIntegerFormat(), true, 0, null, 12, null));
                this.bidPriceTxt.setText((bid == null || (price2 = bid.getPrice()) == null) ? null : Money.format$default(price2, null, false, null, false, 0, null, false, null, false, false, 1023, null));
                this.askQuantityTxt.setText((ask == null || (quantity = ask.getQuantity()) == null) ? null : BigDecimals2.truncateLarge$default(quantity, Formats.getIntegerFormat(), true, 0, null, 12, null));
                TextView textView = this.askPriceTxt;
                if (ask != null && (price = ask.getPrice()) != null) {
                    str = Money.format$default(price, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                }
                textView.setText(str);
            }
        }
    }
}
