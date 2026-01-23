package com.robinhood.android.listsoptions.optionwatchlist;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.views.OptionStrategyRowView;
import com.robinhood.android.common.views.OptionStrategyRowViewHolder;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p355ui.OptionStrategyCuratedListEligible;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionWatchlistHubContentAdapter.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR*\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/ui/OptionStrategyCuratedListEligible;", "Lcom/robinhood/android/common/views/OptionStrategyRowViewHolder;", "callbacks", "Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter$Callbacks;", "isExpired", "", "<init>", "(Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter$Callbacks;Z)V", "getCallbacks", "()Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter$Callbacks;", "()Z", "newValue", "", "highlightedRowIndex", "getHighlightedRowIndex", "()Ljava/lang/Integer;", "setHighlightedRowIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "payloads", "", "", "notifyItemActivatedStateChanged", "Callbacks", "Companion", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OptionWatchlistHubContentAdapter extends ListAdapter<OptionStrategyCuratedListEligible, OptionStrategyRowViewHolder> {
    private static final int ONLY_UPDATE_ACTIVATED_STATE = 42;
    private final Callbacks callbacks;
    private Integer highlightedRowIndex;
    private final boolean isExpired;
    private static final ThemedResourceReference<ColorStateList> TEXT_COLOR_DISABLED = new ThemedResourceReference<>(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorForeground3);

    /* compiled from: OptionWatchlistHubContentAdapter.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/OptionWatchlistHubContentAdapter$Callbacks;", "", "onExpiredOptionStrategyRowTapped", "", "strategyCode", "", "onQuoteClicked", "onStrategyRowBound", "rowView", "Landroid/view/View;", "showAggregateDetail", "initialStrategyCode", "strategyCodeList", "", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onExpiredOptionStrategyRowTapped(String strategyCode);

        void onQuoteClicked();

        void onStrategyRowBound(View rowView);

        void showAggregateDetail(String initialStrategyCode, List<String> strategyCodeList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((OptionStrategyRowViewHolder) viewHolder, i, (List<Object>) list);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    /* renamed from: isExpired, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionWatchlistHubContentAdapter(Callbacks callbacks, boolean z) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((OptionStrategyCuratedListEligible) obj).getStrategyCode();
            }
        }));
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        this.isExpired = z;
    }

    public final Integer getHighlightedRowIndex() {
        return this.highlightedRowIndex;
    }

    public final void setHighlightedRowIndex(Integer num) {
        Integer num2 = this.highlightedRowIndex;
        if (num != null) {
            notifyItemActivatedStateChanged(num.intValue());
        }
        if (num2 != null) {
            notifyItemActivatedStateChanged(num2.intValue());
        }
        this.highlightedRowIndex = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public OptionStrategyRowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        OptionStrategyRowView optionStrategyRowViewInflate = OptionStrategyRowView.INSTANCE.inflate(parent);
        if (this.isExpired) {
            RhTextView nameTxt = optionStrategyRowViewInflate.getNameTxt();
            ThemedResourceReference<ColorStateList> themedResourceReference = TEXT_COLOR_DISABLED;
            ScarletManager2.overrideAttribute(nameTxt, R.attr.textColor, themedResourceReference);
            ScarletManager2.overrideAttribute(optionStrategyRowViewInflate.getDetailTxt(), R.attr.textColor, themedResourceReference);
        } else {
            RhTextView nameTxt2 = optionStrategyRowViewInflate.getNameTxt();
            ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
            ScarletManager2.overrideAttribute(nameTxt2, R.attr.textColor, themeAttributes.getTEXT_COLOR_PRIMARY());
            ScarletManager2.overrideAttribute(optionStrategyRowViewInflate.getDetailTxt(), R.attr.textColor, themeAttributes.getTEXT_COLOR_SECONDARY());
        }
        return new OptionStrategyRowViewHolder(optionStrategyRowViewInflate);
    }

    public void onBindViewHolder(OptionStrategyRowViewHolder holder, int position, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.contains(42)) {
            OptionStrategyRowView rowView = holder.getRowView();
            Integer num = this.highlightedRowIndex;
            rowView.setActivated(num != null && position == num.intValue());
            return;
        }
        super.onBindViewHolder((OptionWatchlistHubContentAdapter) holder, position, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(OptionStrategyRowViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final OptionStrategyCuratedListEligible item = getItem(position);
        OptionStrategyRowView rowView = holder.getRowView();
        CuratedListItem curatedListItem = item.getCuratedListItem();
        boolean z = this.isExpired;
        UiOptionStrategyInfo optionStrategyInfo = item.getOptionStrategyInfo();
        rowView.bind(new OptionStrategyRowView.Data(curatedListItem, z, optionStrategyInfo != null ? optionStrategyInfo.getOptionChain() : null, item.getStrategyCode(), item.getOptionStrategyInfo()));
        this.callbacks.onStrategyRowBound(rowView);
        rowView.setOnQuoteClick(new OptionWatchlistHubContentAdapter2(this.callbacks));
        Integer num = this.highlightedRowIndex;
        rowView.setActivated(num != null && position == num.intValue());
        OnClickListeners.onClick(rowView, new Function0() { // from class: com.robinhood.android.listsoptions.optionwatchlist.OptionWatchlistHubContentAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionWatchlistHubContentAdapter.onBindViewHolder$lambda$3$lambda$2(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$3$lambda$2(OptionWatchlistHubContentAdapter optionWatchlistHubContentAdapter, OptionStrategyCuratedListEligible optionStrategyCuratedListEligible) {
        if (optionWatchlistHubContentAdapter.isExpired) {
            optionWatchlistHubContentAdapter.callbacks.onExpiredOptionStrategyRowTapped(optionStrategyCuratedListEligible.getStrategyCode());
        } else {
            Callbacks callbacks = optionWatchlistHubContentAdapter.callbacks;
            String strategyCode = optionStrategyCuratedListEligible.getStrategyCode();
            List<OptionStrategyCuratedListEligible> currentList = optionWatchlistHubContentAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            List<OptionStrategyCuratedListEligible> list = currentList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((OptionStrategyCuratedListEligible) it.next()).getStrategyCode());
            }
            callbacks.showAggregateDetail(strategyCode, arrayList);
        }
        return Unit.INSTANCE;
    }

    private final void notifyItemActivatedStateChanged(int position) {
        notifyItemChanged(position, CollectionsKt.mutableListOf(42));
    }
}
