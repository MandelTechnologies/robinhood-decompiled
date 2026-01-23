package com.robinhood.android.common.search.p087ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringChipsView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0017\u0018B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringChipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/common/search/ui/RecurringChipsViewData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "recyclerView", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "callbacks", "Lcom/robinhood/android/common/search/ui/RecurringChipsView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/search/ui/RecurringChipsView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/search/ui/RecurringChipsView$Callbacks;)V", "bind", "", "state", "Callbacks", "Companion", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringChipsView extends ConstraintLayout implements Bindable<RecurringChipsViewData> {
    private Callbacks callbacks;
    private final CuratedListChipRecyclerView recyclerView;
    private final TextView titleTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RecurringChipsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringChipsView$Callbacks;", "", "onChipContentClick", "", "id", "Ljava/util/UUID;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChipContentClick(UUID id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringChipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11798R.layout.merge_recurring_chips, true);
        View viewFindViewById = findViewById(C11798R.id.recurring_chips_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11798R.id.recurring_chips_recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) viewFindViewById2;
        this.recyclerView = curatedListChipRecyclerView;
        curatedListChipRecyclerView.setCallbacks(new CuratedListChipRecyclerView.Callbacks() { // from class: com.robinhood.android.common.search.ui.RecurringChipsView.1
            @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
            public void onChipClick(CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Callbacks callbacks = RecurringChipsView.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onChipContentClick(data.getId());
                }
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RecurringChipsViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.titleTxt.setText(state.getTitle());
        this.recyclerView.setRowCount(state.getChipRowCount());
        this.recyclerView.bind(state.getViewModels());
    }

    /* compiled from: RecurringChipsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/RecurringChipsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/search/ui/RecurringChipsView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RecurringChipsView> {
        private final /* synthetic */ Inflater<RecurringChipsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RecurringChipsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RecurringChipsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11798R.layout.include_recurring_chips_view);
        }
    }
}
