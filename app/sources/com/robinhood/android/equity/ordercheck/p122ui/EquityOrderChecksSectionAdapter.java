package com.robinhood.android.equity.ordercheck.p122ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderChecksSectionAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksSectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$Section;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "<init>", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "ViewType", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityOrderChecksSectionAdapter extends ListAdapter<VisibleEquityOrderChecksAlert.Section, GenericViewHolder<? extends View>> {
    public static final int $stable = 8;

    /* compiled from: EquityOrderChecksSectionAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.BREAKDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EquityOrderChecksSectionAdapter() {
        super(new DiffUtil.ItemCallback<VisibleEquityOrderChecksAlert.Section>() { // from class: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksSectionAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(VisibleEquityOrderChecksAlert.Section oldItem, VisibleEquityOrderChecksAlert.Section newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return true;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(VisibleEquityOrderChecksAlert.Section oldItem, VisibleEquityOrderChecksAlert.Section newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if ((oldItem instanceof VisibleEquityOrderChecksAlert.Section.BreakdownSection) && (newItem instanceof VisibleEquityOrderChecksAlert.Section.BreakdownSection)) {
                    return Intrinsics.areEqual(((VisibleEquityOrderChecksAlert.Section.BreakdownSection) oldItem).getTitle(), ((VisibleEquityOrderChecksAlert.Section.BreakdownSection) newItem).getTitle());
                }
                return false;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (WhenMappings.$EnumSwitchMapping$0[ViewType.values()[viewType].ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new GenericViewHolder<>(EquityOrderChecksBreakdownSectionView.INSTANCE.inflate(parent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        VisibleEquityOrderChecksAlert.Section item = getItem(position);
        if (item instanceof VisibleEquityOrderChecksAlert.Section.BreakdownSection) {
            View view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksBreakdownSectionView");
            ((EquityOrderChecksBreakdownSectionView) view).bind((VisibleEquityOrderChecksAlert.Section.BreakdownSection) item);
        } else if (!Intrinsics.areEqual(item, VisibleEquityOrderChecksAlert.Section.UnknownSection.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (getItem(position) instanceof VisibleEquityOrderChecksAlert.Section.BreakdownSection) {
            return ViewType.BREAKDOWN.ordinal();
        }
        return -1;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderChecksSectionAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksSectionAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "BREAKDOWN", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType BREAKDOWN = new ViewType("BREAKDOWN", 0);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{BREAKDOWN};
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
