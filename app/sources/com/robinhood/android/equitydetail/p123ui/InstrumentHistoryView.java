package com.robinhood.android.equitydetail.p123ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.common.history.p082ui.HistoryEventDiffCallbacks;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.SortableHistoryItem;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentHistoryView.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ,2\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015J6\u0010\u001c\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017J\u001a\u0010!\u001a\u00020\u00152\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\u0016J\u0018\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u0015H\u0016J&\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00052\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\u0016J\b\u0010 \u001a\u00020\u0019H\u0016R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010(\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentHistoryView;", "Lcom/robinhood/android/common/ui/view/ListWithMoreView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "instrument", "Lcom/robinhood/models/db/Instrument;", "_viewType", "", "_onMoreClicked", "Lkotlin/Function1;", "Ljava/util/UUID;", "", "setViewType", "viewType", "setData", "items", "", "Lcom/robinhood/models/SortableHistoryItem;", "onMoreClicked", "getViewType", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "createView", "parent", "Landroid/view/ViewGroup;", "bindView", "view", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentHistoryView extends Hammer_InstrumentHistoryView<StatefulHistoryEvent<? extends HistoryEvent>, HistoryRowView> {
    public static final int MAX_ITEMS_SHOWN = 4;
    private Function1<? super UUID, Unit> _onMoreClicked;
    private int _viewType;
    private Instrument instrument;
    public Navigator navigator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentHistoryView(Context context, AttributeSet attrs) {
        super(context, attrs, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setMaxNumItemsShown(4);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final void setViewType(int viewType) {
        this._viewType = viewType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(InstrumentHistoryView instrumentHistoryView, Instrument instrument, List list, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        instrumentHistoryView.setData(instrument, list, function1);
    }

    public final void setData(Instrument instrument, List<? extends SortableHistoryItem> items, Function1<? super UUID, Unit> onMoreClicked) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.instrument = instrument;
        this._onMoreClicked = onMoreClicked;
        List<? extends SortableHistoryItem> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SortableHistoryItem sortableHistoryItem : list) {
            StatefulHistoryEvent.Companion companion = StatefulHistoryEvent.INSTANCE;
            Intrinsics.checkNotNull(sortableHistoryItem, "null cannot be cast to non-null type com.robinhood.shared.models.history.shared.HistoryEvent");
            arrayList.add(companion.m2830of((HistoryEvent) sortableHistoryItem));
        }
        setData(arrayList, items.size());
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public int getViewType(StatefulHistoryEvent<? extends HistoryEvent> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this._viewType;
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public HistoryRowView createView(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View viewInflate = ContextSystemServices.getLayoutInflater(context).inflate(C15314R.layout.include_instrument_history_row, parent, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.common.history.ui.HistoryRowView");
        return (HistoryRowView) viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void bindView(HistoryRowView view, StatefulHistoryEvent<? extends HistoryEvent> item) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (item == null) {
            return;
        }
        view.bind(item);
        view.bindSource(AnalyticsStrings.BUTTON_GROUP_TITLE_SDP_HISTORY);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public void onMoreClicked() {
        UUID id;
        Function1<? super UUID, Unit> function1;
        Instrument instrument = this.instrument;
        if (instrument == null || (id = instrument.getId()) == null || (function1 = this._onMoreClicked) == null) {
            return;
        }
        function1.invoke(id);
    }

    @Override // com.robinhood.android.common.p088ui.view.ListWithMoreView
    public DiffUtil.ItemCallback<? super StatefulHistoryEvent<?>> getDiffCallback() {
        return HistoryEventDiffCallbacks.getDiffCallback(StatefulHistoryEvent.INSTANCE);
    }

    /* compiled from: InstrumentHistoryView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentHistoryView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/InstrumentHistoryView;", "<init>", "()V", "MAX_ITEMS_SHOWN", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<InstrumentHistoryView> {
        private final /* synthetic */ Inflater<InstrumentHistoryView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InstrumentHistoryView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InstrumentHistoryView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_instrument_history_view);
        }
    }
}
