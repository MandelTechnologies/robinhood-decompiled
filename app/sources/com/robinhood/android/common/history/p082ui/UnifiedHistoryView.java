package com.robinhood.android.common.history.p082ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryListView;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UnifiedHistoryView.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0003?@AB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010$\u001a\u00020%H\u0014J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0016J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u000200J \u00103\u001a\u00020%2\u0018\u00104\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(06j\u0002`7\u0018\u000105J\u000e\u00108\u001a\u00020%2\u0006\u00109\u001a\u000200J\u000e\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<J\u0010\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/UnifiedHistoryView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/android/common/history/ui/HistoryListView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emptyStateTxt", "Landroid/widget/TextView;", "historyList", "Lcom/robinhood/android/common/history/ui/HistoryListView;", "placeholderList", "Landroidx/recyclerview/widget/RecyclerView;", "value", "", "isFromCryptoSource", "()Z", "setFromCryptoSource", "(Z)V", "callbacks", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;)V", "alwaysShowMore", "getAlwaysShowMore", "setAlwaysShowMore", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "itemAnimator", "getItemAnimator", "()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;", "setItemAnimator", "(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V", "onAttachedToWindow", "", "doOnTransactionDetailRequested", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "onShowAllClicked", "onSummaryBadgeClicked", "bindSource", "source", "", "setMaxItemsShown", "maxItemsShown", "", "setViewType", "viewType", "bind", "historyItems", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "showPlaceholders", "size", "setRecycledViewPool", "pool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "togglePlaceholderVisibility", "isPlaceholderVisible", "Callbacks", "PlaceholderAdapter", "Companion", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class UnifiedHistoryView extends FrameLayout implements HistoryListView.Callbacks {
    private boolean alwaysShowMore;
    private Callbacks callbacks;
    private final TextView emptyStateTxt;
    private final HistoryListView historyList;
    private final RecyclerView placeholderList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UnifiedHistoryView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "", "doOnTransactionDetailRequested", "", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "onRecentHistoryShowAllClicked", "onSummaryBadgeClicked", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: UnifiedHistoryView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void doOnTransactionDetailRequested(Callbacks callbacks, HistoryEvent historyEvent) {
                Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
            }

            public static void onSummaryBadgeClicked(Callbacks callbacks, HistoryEvent historyEvent) {
                Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
            }
        }

        void doOnTransactionDetailRequested(HistoryEvent historyEvent);

        void onRecentHistoryShowAllClicked();

        void onSummaryBadgeClicked(HistoryEvent historyEvent);
    }

    public /* synthetic */ UnifiedHistoryView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11183R.layout.merge_unified_history_view, true);
        setClipChildren(false);
        setClipToPadding(false);
        View viewFindViewById = findViewById(C11183R.id.unified_history_empty_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.emptyStateTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C11183R.id.unified_history_list_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.historyList = (HistoryListView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C11183R.id.unified_history_placeholder_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.placeholderList = (RecyclerView) viewFindViewById3;
    }

    public final void setFromCryptoSource(boolean z) {
        this.historyList.setFromCryptoSource(z);
    }

    public final boolean isFromCryptoSource() {
        return this.historyList.getIsFromCryptoSource();
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final boolean getAlwaysShowMore() {
        return this.alwaysShowMore;
    }

    public final void setAlwaysShowMore(boolean z) {
        this.alwaysShowMore = z;
        this.historyList.setAlwaysShowMore(z);
    }

    public final RecyclerView.ItemAnimator getItemAnimator() {
        return this.historyList.getItemAnimator();
    }

    public final void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        this.historyList.setItemAnimator(itemAnimator);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(Views.baseActivity(this).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.history.ui.UnifiedHistoryView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifiedHistoryView.onAttachedToWindow$lambda$0(this.f$0, (DayNightOverlay) obj);
            }
        });
        this.historyList.setCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$0(UnifiedHistoryView unifiedHistoryView, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(unifiedHistoryView), it, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.history.ui.HistoryListView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.doOnTransactionDetailRequested(historyEvent);
        }
    }

    @Override // com.robinhood.android.common.history.ui.HistoryListView.Callbacks
    public void onShowAllClicked() {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onRecentHistoryShowAllClicked();
        }
    }

    @Override // com.robinhood.android.common.history.ui.HistoryListView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onSummaryBadgeClicked(historyEvent);
        }
    }

    public final void bindSource(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.historyList.bindSource(source);
    }

    public final void setMaxItemsShown(int maxItemsShown) {
        this.historyList.setMaxItemsShown(maxItemsShown);
    }

    public final void setViewType(int viewType) {
        this.historyList.setViewType(viewType);
    }

    public final void bind(PagedList<StatefulHistoryEvent<HistoryEvent>> historyItems) {
        if (historyItems == null) {
            return;
        }
        togglePlaceholderVisibility(false);
        if (historyItems.isEmpty()) {
            this.emptyStateTxt.setVisibility(0);
            this.historyList.setVisibility(8);
        } else {
            this.emptyStateTxt.setVisibility(8);
            this.historyList.setVisibility(0);
            this.historyList.bind(historyItems);
        }
    }

    public final void showPlaceholders(int size) {
        this.placeholderList.setAdapter(new PlaceholderAdapter(size));
        togglePlaceholderVisibility(true);
    }

    public final void setRecycledViewPool(RecyclerView.RecycledViewPool pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.historyList.setRecycledViewPool(pool);
    }

    private final void togglePlaceholderVisibility(boolean isPlaceholderVisible) {
        this.historyList.setVisibility(!isPlaceholderVisible ? 0 : 8);
        this.placeholderList.setVisibility(isPlaceholderVisible ? 0 : 8);
    }

    /* compiled from: UnifiedHistoryView.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$PlaceholderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "size", "", "<init>", "(I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "", "holder", "position", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class PlaceholderAdapter extends RecyclerView.Adapter<SimpleViewHolder> {
        private final int size;

        public PlaceholderAdapter(int i) {
            this.size = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new SimpleViewHolder(HistoryRowView.Companion.HistoryRowInflater.INSTANCE.inflate(parent));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: getItemCount, reason: from getter */
        public int getSize() {
            return this.size;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SimpleViewHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.common.history.ui.HistoryRowView");
            ((HistoryRowView) view).setPlaceholder(true);
        }
    }

    /* compiled from: UnifiedHistoryView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<UnifiedHistoryView> {
        private final /* synthetic */ Inflater<UnifiedHistoryView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public UnifiedHistoryView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (UnifiedHistoryView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11183R.layout.include_unified_history);
        }
    }
}
