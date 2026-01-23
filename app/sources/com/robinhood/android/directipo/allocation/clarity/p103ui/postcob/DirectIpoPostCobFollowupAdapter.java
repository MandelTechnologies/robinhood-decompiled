package com.robinhood.android.directipo.allocation.clarity.p103ui.postcob;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.p106ui.C14228R;
import com.robinhood.android.directipo.p106ui.allocation.DirectIpoAllocationClarityCardHookView;
import com.robinhood.models.p355ui.bonfire.UiDirectIpoPostCobFollowupSection;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoPostCobFollowupAdapter.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/postcob/DirectIpoPostCobFollowupAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowupSection;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "<init>", "()V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoPostCobFollowupAdapter extends ListAdapter<UiDirectIpoPostCobFollowupSection, SimpleViewHolder> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoPostCobFollowupAdapter() {
        super(DiffCallbacks.Equality.INSTANCE);
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        UiDirectIpoPostCobFollowupSection item = getItem(position);
        if (item instanceof UiDirectIpoPostCobFollowupSection.Banner) {
            return C14172R.layout.include_allocation_clarity_banner;
        }
        if (item instanceof UiDirectIpoPostCobFollowupSection.CardHook) {
            return C14228R.layout.include_allocation_clarity_card_hook_view;
        }
        if (item instanceof UiDirectIpoPostCobFollowupSection.CenteredTitleSubtitle) {
            return C14172R.layout.include_allocation_clarity_title_and_subtitle;
        }
        if (Intrinsics.areEqual(item, UiDirectIpoPostCobFollowupSection.Divider.INSTANCE)) {
            return C14172R.layout.include_allocation_clarity_divider;
        }
        if (item instanceof UiDirectIpoPostCobFollowupSection.Pictogram) {
            return C14172R.layout.include_allocation_clarity_pictogram;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new SimpleViewHolder(ViewGroups.inflate(parent, viewType, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        UiDirectIpoPostCobFollowupSection item = getItem(position);
        if (item instanceof UiDirectIpoPostCobFollowupSection.Banner) {
            TextView textView = (TextView) holder.itemView.findViewById(C14172R.id.allocation_clarity_banner_text);
            Intrinsics.checkNotNull(textView);
            UiDirectIpoPostCobFollowupSection.Banner banner = (UiDirectIpoPostCobFollowupSection.Banner) item;
            TextViewsKt.setDrawables$default(textView, banner.getIcon().getResourceId(), 0, 0, 0, true, 14, (Object) null);
            textView.setText(banner.getLabel());
            return;
        }
        if (item instanceof UiDirectIpoPostCobFollowupSection.CardHook) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.directipo.ui.allocation.DirectIpoAllocationClarityCardHookView");
            UiDirectIpoPostCobFollowupSection.CardHook cardHook = (UiDirectIpoPostCobFollowupSection.CardHook) item;
            ((DirectIpoAllocationClarityCardHookView) view).bind(cardHook.getCardHook(), cardHook.getLoggingContext());
            return;
        }
        if (item instanceof UiDirectIpoPostCobFollowupSection.CenteredTitleSubtitle) {
            UiDirectIpoPostCobFollowupSection.CenteredTitleSubtitle centeredTitleSubtitle = (UiDirectIpoPostCobFollowupSection.CenteredTitleSubtitle) item;
            ((TextView) holder.itemView.findViewById(C14172R.id.allocation_clarity_title)).setText(centeredTitleSubtitle.getTitle());
            ((TextView) holder.itemView.findViewById(C14172R.id.allocation_clarity_subtitle)).setText(centeredTitleSubtitle.getSubtitle());
        } else {
            if (Intrinsics.areEqual(item, UiDirectIpoPostCobFollowupSection.Divider.INSTANCE)) {
                return;
            }
            if (!(item instanceof UiDirectIpoPostCobFollowupSection.Pictogram)) {
                throw new NoWhenBranchMatchedException();
            }
            RdsPogView rdsPogView = (RdsPogView) holder.itemView.findViewById(C14172R.id.allocation_clarity_pictogram_pog);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            rdsPogView.setPictogram(ViewsKt.getDrawable(itemView, ((UiDirectIpoPostCobFollowupSection.Pictogram) item).getPictogram().getResourceId()));
        }
    }
}
