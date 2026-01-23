package com.robinhood.android.shareholderexperience.eventinfo;

import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.expandablecontent.p136ui.ExpandableContentSectionItemView;
import com.robinhood.models.p355ui.UiExpandableContentSection;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventInfoFaqAdapter.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/eventinfo/EventInfoFaqAdapter;", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView$Callbacks;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/expandablecontent/ui/ExpandableContentSectionItemView;", "Lcom/robinhood/models/ui/UiExpandableContentSection;", "onRowItemClicked", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "expandedIndex", "getExpandedIndex", "()I", "setExpandedIndex", "(I)V", "onBindViewHolder", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "position", "onContentSectionClicked", "section", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class EventInfoFaqAdapter extends GenericListAdapter<ExpandableContentSectionItemView, UiExpandableContentSection> implements ExpandableContentSectionItemView.Callbacks {
    public static final int $stable = 8;
    private int expandedIndex;
    private final Function1<Integer, Unit> onRowItemClicked;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(UiExpandableContentSection byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventInfoFaqAdapter(Function1<? super Integer, Unit> onRowItemClicked) {
        super(ExpandableContentSectionItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.shareholderexperience.eventinfo.EventInfoFaqAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventInfoFaqAdapter._init_$lambda$0((UiExpandableContentSection) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(onRowItemClicked, "onRowItemClicked");
        this.onRowItemClicked = onRowItemClicked;
        this.expandedIndex = -1;
    }

    public final int getExpandedIndex() {
        return this.expandedIndex;
    }

    public final void setExpandedIndex(int i) {
        this.expandedIndex = i;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<ExpandableContentSectionItemView> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ExpandableContentSectionItemView expandableContentSectionItemView = (ExpandableContentSectionItemView) holder.getView();
        expandableContentSectionItemView.setShowBottomDivider(true);
        ViewsKt.setHorizontalPadding(expandableContentSectionItemView, ViewsKt.getDimensionPixelSize(expandableContentSectionItemView, C13997R.dimen.rds_spacing_medium));
        expandableContentSectionItemView.setCallbacks(this);
        expandableContentSectionItemView.setExpanded(this.expandedIndex == position);
        expandableContentSectionItemView.bind(getItem(position));
    }

    @Override // com.robinhood.android.expandablecontent.ui.ExpandableContentSectionItemView.Callbacks
    public void onContentSectionClicked(UiExpandableContentSection section) {
        int i;
        Intrinsics.checkNotNullParameter(section, "section");
        int iIndexOf = getCurrentList().indexOf(section);
        if (iIndexOf <= -1 || iIndexOf == (i = this.expandedIndex)) {
            iIndexOf = -1;
        } else {
            this.onRowItemClicked.invoke(Integer.valueOf(i));
        }
        this.expandedIndex = iIndexOf;
    }
}
