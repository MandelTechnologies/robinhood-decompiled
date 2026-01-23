package com.robinhood.android.common.history.p082ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.paging.LoadState;
import androidx.paging.LoadType;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.p088ui.view.ListWithMoreView;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: HistoryListView.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0001@B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010)\u001a\u00020 2\u0006\u0010'\u001a\u00020(J\u000e\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u000eJ\u000e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000eJ\u001e\u0010.\u001a\u00020 2\u0016\u0010/\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u001bJ \u00100\u001a\u00020 2\u0016\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u001bH\u0002J \u00102\u001a\u00020\u00102\u0016\u00103\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u001bH\u0002J\b\u00104\u001a\u00020 H\u0014J\u001e\u00105\u001a\u00020\u000e2\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\u0016J\u0018\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u0002092\u0006\u0010+\u001a\u00020\u000eH\u0016J&\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020\u00052\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\u0016J\u0010\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020 2\u0006\u0010=\u001a\u00020\u0003H\u0016J\b\u0010?\u001a\u00020 H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u00158VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryListView;", "Lcom/robinhood/android/common/ui/view/ListWithMoreView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "Lcom/robinhood/android/common/history/ui/HistoryRowView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_viewType", "", "isFromCryptoSource", "", "()Z", "setFromCryptoSource", "(Z)V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffCallback$annotations", "()V", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "pagedData", "Landroidx/paging/PagedList;", "pagedListCallback", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", "callbacks", "Lcom/robinhood/android/common/history/ui/HistoryListView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/history/ui/HistoryListView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/history/ui/HistoryListView$Callbacks;)V", "source", "", "bindSource", "setViewType", "viewType", "setMaxItemsShown", "maxItemsShown", "bind", "historyEvents", "setDataSnapshot", WebsocketGatewayConstants.DATA_KEY, "areEventsLoaded", "pagedList", "onAttachedToWindow", "getViewType", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "view", "doOnTransactionDetailRequested", "historyEvent", "onSummaryBadgeClicked", "onMoreClicked", "Callbacks", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class HistoryListView extends ListWithMoreView<StatefulHistoryEvent<? extends HistoryEvent>, HistoryRowView> implements HistoryRowView.Callbacks {
    public static final int $stable = 8;
    private int _viewType;
    private Callbacks callbacks;
    private boolean isFromCryptoSource;
    private PagedList<StatefulHistoryEvent<HistoryEvent>> pagedData;
    private final Function2<LoadType, LoadState, Unit> pagedListCallback;
    private String source;

    /* compiled from: HistoryListView.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryListView$Callbacks;", "", "doOnTransactionDetailRequested", "", "historyEvent", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "onShowAllClicked", "onSummaryBadgeClicked", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {

        /* compiled from: HistoryListView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static void onSummaryBadgeClicked(Callbacks callbacks, HistoryEvent historyEvent) {
                Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
            }
        }

        void doOnTransactionDetailRequested(HistoryEvent historyEvent);

        void onShowAllClicked();

        void onSummaryBadgeClicked(HistoryEvent historyEvent);
    }

    public static /* synthetic */ void getDiffCallback$annotations() {
    }

    public /* synthetic */ HistoryListView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        getRecyclerView().setHasFixedSize(false);
        setMaxNumItemsShown(5);
        this.pagedListCallback = new Function2() { // from class: com.robinhood.android.common.history.ui.HistoryListView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HistoryListView.pagedListCallback$lambda$1(this.f$0, (LoadType) obj, (LoadState) obj2);
            }
        };
        this.source = AnalyticsStrings.BUTTON_GROUP_TITLE_HISTORY;
    }

    /* renamed from: isFromCryptoSource, reason: from getter */
    public final boolean getIsFromCryptoSource() {
        return this.isFromCryptoSource;
    }

    public final void setFromCryptoSource(boolean z) {
        this.isFromCryptoSource = z;
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public DiffUtil.ItemCallback<? super StatefulHistoryEvent<? extends HistoryEvent>> getDiffCallback() {
        DiffUtil.ItemCallback diffCallback = HistoryEventDiffCallbacks.getDiffCallback(StatefulHistoryEvent.INSTANCE);
        Intrinsics.checkNotNull(diffCallback, "null cannot be cast to non-null type androidx.recyclerview.widget.DiffUtil.ItemCallback<in com.robinhood.shared.models.history.shared.StatefulHistoryEvent<*>?>");
        return diffCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pagedListCallback$lambda$1(HistoryListView historyListView, LoadType loadType, LoadState state) {
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList;
        Intrinsics.checkNotNullParameter(loadType, "<unused var>");
        Intrinsics.checkNotNullParameter(state, "state");
        if ((state instanceof LoadState.NotLoading) && (pagedList = historyListView.pagedData) != null && historyListView.areEventsLoaded(pagedList)) {
            historyListView.setDataSnapshot(pagedList);
        }
        return Unit.INSTANCE;
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final void bindSource(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    public final void setViewType(int viewType) {
        this._viewType = viewType;
    }

    public final void setMaxItemsShown(int maxItemsShown) {
        setMaxNumItemsShown(maxItemsShown);
    }

    public final void bind(PagedList<StatefulHistoryEvent<HistoryEvent>> historyEvents) {
        Intrinsics.checkNotNullParameter(historyEvents, "historyEvents");
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.pagedData;
        if (pagedList != null) {
            pagedList.removeWeakLoadStateListener(this.pagedListCallback);
        }
        historyEvents.addWeakLoadStateListener(this.pagedListCallback);
        this.pagedData = historyEvents;
        if (areEventsLoaded(historyEvents)) {
            setDataSnapshot(historyEvents);
            return;
        }
        if (historyEvents.isEmpty()) {
            return;
        }
        Iterator<StatefulHistoryEvent<HistoryEvent>> it = historyEvents.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() == null) {
                break;
            } else {
                i++;
            }
        }
        historyEvents.loadAround(RangesKt.coerceIn(i, 0, CollectionsKt.getLastIndex(historyEvents)));
    }

    private final void setDataSnapshot(PagedList<StatefulHistoryEvent<HistoryEvent>> data) {
        int size = data.size();
        if (size >= getMaxNumItemsShown()) {
            size = getMaxNumItemsShown();
        }
        setData(data.snapshot().subList(0, size), data.size());
    }

    private final boolean areEventsLoaded(PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList) {
        List<StatefulHistoryEvent<HistoryEvent>> listSubList = pagedList.subList(0, RangesKt.coerceAtMost(pagedList.size(), getMaxNumItemsShown()));
        Intrinsics.checkNotNullExpressionValue(listSubList, "subList(...)");
        List<StatefulHistoryEvent<HistoryEvent>> list = listSubList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((StatefulHistoryEvent) it.next()) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(Views.baseActivity(this).getDayNightStyleChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryListView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryListView.onAttachedToWindow$lambda$5(this.f$0, (DayNightOverlay) obj);
            }
        });
        ViewDisposerKt.bindTo$default(Views.baseActivity(this).getColorSchemeChanges(), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.history.ui.HistoryListView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryListView.onAttachedToWindow$lambda$6(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(HistoryListView historyListView, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(historyListView), overlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(HistoryListView historyListView, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScarletManager2.getScarletManager(historyListView).putOverlay((ColorScheme) tuples2.component1(), Boolean.valueOf(!((Boolean) tuples2.component2()).booleanValue()));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public int getViewType(StatefulHistoryEvent<? extends HistoryEvent> item) {
        return this._viewType;
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public HistoryRowView createView(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return HistoryRowView.Companion.HistoryRowInflater.INSTANCE.inflate(parent);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void bindView(HistoryRowView view, StatefulHistoryEvent<? extends HistoryEvent> item) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.bindSource(this.source);
        view.bind(item);
        view.setCallbacks(this);
        view.setFromCryptoSource(this.isFromCryptoSource);
    }

    @Override // com.robinhood.android.common.history.ui.HistoryRowView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.doOnTransactionDetailRequested(historyEvent);
        }
    }

    @Override // com.robinhood.android.common.history.ui.HistoryRowView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        Intrinsics.checkNotNullParameter(historyEvent, "historyEvent");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onSummaryBadgeClicked(historyEvent);
        }
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void onMoreClicked() {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onShowAllClicked();
        }
    }
}
