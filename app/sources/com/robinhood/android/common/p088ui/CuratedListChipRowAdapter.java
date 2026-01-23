package com.robinhood.android.common.p088ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.CuratedListChipRowView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListChipRowAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$Callbacks;)V", "bind", "", "curatedLists", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemViewType", "getItem", "getPosition", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Callbacks", "DiffCallback", "ChipItemDecoration", "ViewType", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CuratedListChipRowAdapter extends ListAdapter<CuratedListChipItem, RecyclerView.ViewHolder> {
    public Callbacks callbacks;

    /* compiled from: CuratedListChipRowAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$Callbacks;", "", "onChipClick", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: CuratedListChipRowAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onChipClick(Callbacks callbacks, CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
            }
        }

        void onChipClick(CuratedListChipItem data);
    }

    /* compiled from: CuratedListChipRowAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.ACTION_CHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.ICON_CHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CuratedListChipRowAdapter() {
        super(DiffCallback.INSTANCE);
    }

    public final Callbacks getCallbacks() {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            return callbacks;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
        return null;
    }

    public final void setCallbacks(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    public final void bind(List<CuratedListChipItem> curatedLists) {
        Intrinsics.checkNotNullParameter(curatedLists, "curatedLists");
        submitList(curatedLists);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CuratedListChipRowView curatedListChipRowViewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i = WhenMappings.$EnumSwitchMapping$0[ViewType.getEntries().get(viewType).ordinal()];
        if (i == 1) {
            curatedListChipRowViewInflate = CuratedListChipRowView.INSTANCE.inflate(parent);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            curatedListChipRowViewInflate = CuratedListChipRowView.IconChipInflater.INSTANCE.inflate(parent);
        }
        return new SimpleViewHolder(curatedListChipRowViewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CuratedListChipItem item = getItem(position);
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.common.ui.CuratedListChipRowView");
        ((CuratedListChipRowView) view).bind(item, new Function1() { // from class: com.robinhood.android.common.ui.CuratedListChipRowAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListChipRowAdapter.onBindViewHolder$lambda$0(this.f$0, (CuratedListChipItem) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(CuratedListChipRowAdapter curatedListChipRowAdapter, CuratedListChipItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        curatedListChipRowAdapter.getCallbacks().onChipClick(it);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ViewType viewType;
        if (getItem(position).isIconChip()) {
            viewType = ViewType.ICON_CHIP;
        } else {
            viewType = ViewType.ACTION_CHIP;
        }
        return viewType.ordinal();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public CuratedListChipItem getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (CuratedListChipItem) item;
    }

    public final int getPosition(CuratedListChipItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List<CuratedListChipItem> currentList = getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<CuratedListChipItem> it = currentList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getId(), item.getId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* compiled from: CuratedListChipRowAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<CuratedListChipItem> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(CuratedListChipItem oldItem, CuratedListChipItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(CuratedListChipItem oldItem, CuratedListChipItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* compiled from: CuratedListChipRowAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$ChipItemDecoration;", "Lcom/robinhood/utils/ui/view/recyclerview/PaddingItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sideSpacing", "", "getRightPadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChipItemDecoration extends PaddingItemDecoration {
        private final int sideSpacing;

        public ChipItemDecoration(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.sideSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
        }

        @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
        protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            if (position == adapter.getSize() - 1) {
                return 0;
            }
            return this.sideSpacing;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CuratedListChipRowAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_CHIP", "ICON_CHIP", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType ACTION_CHIP = new ViewType("ACTION_CHIP", 0);
        public static final ViewType ICON_CHIP = new ViewType("ICON_CHIP", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{ACTION_CHIP, ICON_CHIP};
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
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }
}
