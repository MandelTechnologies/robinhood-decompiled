package com.robinhood.android.optionschain.strategybuilder;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter2;
import com.robinhood.models.p320db.OptionStrategyBuilder;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionStrategyBuilderAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "onCardClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/optionschain/strategybuilder/BuilderData$StrategyCardData;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "onSentimentChanged", "Lcom/robinhood/models/db/OptionStrategyBuilder$SentimentFilter;", "getOnSentimentChanged", "()Lkotlin/jvm/functions/Function1;", "setOnSentimentChanged", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemViewType", "ViewType", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderAdapter extends ListAdapter<OptionStrategyBuilderAdapter2, SimpleViewHolder> {
    public static final int SPAN_SIZE = 2;
    private final Function1<OptionStrategyBuilderAdapter2.StrategyCardData, Unit> onCardClicked;
    private Function1<? super OptionStrategyBuilder.SentimentFilter, Unit> onSentimentChanged;
    public static final int $stable = 8;
    private static final OptionStrategyBuilderAdapter3 DIFF_CALLBACK = new DiffUtil.ItemCallback<OptionStrategyBuilderAdapter2>() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(OptionStrategyBuilderAdapter2 oldItem, OptionStrategyBuilderAdapter2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof OptionStrategyBuilderAdapter2.HeaderData) && (newItem instanceof OptionStrategyBuilderAdapter2.HeaderData)) {
                return Intrinsics.areEqual(((OptionStrategyBuilderAdapter2.HeaderData) oldItem).getSentiments(), ((OptionStrategyBuilderAdapter2.HeaderData) newItem).getSentiments());
            }
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(OptionStrategyBuilderAdapter2 oldItem, OptionStrategyBuilderAdapter2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof OptionStrategyBuilderAdapter2.HeaderData) && (newItem instanceof OptionStrategyBuilderAdapter2.HeaderData)) {
                return Intrinsics.areEqual(((OptionStrategyBuilderAdapter2.HeaderData) oldItem).getSentiments(), ((OptionStrategyBuilderAdapter2.HeaderData) newItem).getSentiments());
            }
            return Intrinsics.areEqual(oldItem, newItem);
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyBuilderAdapter(Function1<? super OptionStrategyBuilderAdapter2.StrategyCardData, Unit> onCardClicked) {
        super(DIFF_CALLBACK);
        Intrinsics.checkNotNullParameter(onCardClicked, "onCardClicked");
        this.onCardClicked = onCardClicked;
    }

    public final Function1<OptionStrategyBuilder.SentimentFilter, Unit> getOnSentimentChanged() {
        return this.onSentimentChanged;
    }

    public final void setOnSentimentChanged(Function1<? super OptionStrategyBuilder.SentimentFilter, Unit> function1) {
        this.onSentimentChanged = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.VIEW_TYPE_HEADER.ordinal()) {
            return new SimpleViewHolder(OptionStrategyBuilderHeaderView.INSTANCE.inflate(parent));
        }
        if (viewType == ViewType.VIEW_TYPE_TITLE.ordinal()) {
            return new SimpleViewHolder(OptionStrategyBuilderTitleView.INSTANCE.inflate(parent));
        }
        if (viewType == ViewType.VIEW_TYPE_SUBTITLE.ordinal()) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C24135R.layout.include_option_strategy_builder_subtitle_view, false, 2, null));
        }
        if (viewType == ViewType.VIEW_TYPE_STRATEGY_CARD.ordinal()) {
            return new SimpleViewHolder(OptionStrategyBuilderCardView.INSTANCE.inflate(parent));
        }
        Preconditions.INSTANCE.failUnknownEnumKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        final OptionStrategyBuilderAdapter2 item = getItem(position);
        if (item instanceof OptionStrategyBuilderAdapter2.HeaderData) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView");
            ((OptionStrategyBuilderHeaderView) view).bind((OptionStrategyBuilderAdapter2.HeaderData) item, this.onSentimentChanged);
            return;
        }
        if (item instanceof OptionStrategyBuilderAdapter2.TitleData) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderTitleView");
            ((OptionStrategyBuilderTitleView) view).bind((OptionStrategyBuilderAdapter2.TitleData) item);
            return;
        }
        if (item instanceof OptionStrategyBuilderAdapter2.SubtitleData) {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            ((RhTextView) view).setText(((OptionStrategyBuilderAdapter2.SubtitleData) item).getSubtitle());
            return;
        }
        if (!(item instanceof OptionStrategyBuilderAdapter2.StrategyCardData)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderCardView");
        OptionStrategyBuilderCardView optionStrategyBuilderCardView = (OptionStrategyBuilderCardView) view;
        optionStrategyBuilderCardView.bind((OptionStrategyBuilderAdapter2.StrategyCardData) item);
        Unit unit = Unit.INSTANCE;
        ViewGroup.LayoutParams layoutParams = optionStrategyBuilderCardView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        int spanIndex = ((GridLayoutManager.LayoutParams) layoutParams).getSpanIndex();
        if (spanIndex == 0) {
            List<OptionStrategyBuilderAdapter2> currentList = getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            Object orNull = CollectionsKt.getOrNull(currentList, position + 1);
            OptionStrategyBuilderAdapter2.StrategyCardData strategyCardData = (OptionStrategyBuilderAdapter2.StrategyCardData) (((OptionStrategyBuilderAdapter2) orNull) instanceof OptionStrategyBuilderAdapter2.StrategyCardData ? orNull : null);
            if (strategyCardData != null) {
                optionStrategyBuilderCardView.getBindings().optionsStrategyBuilderCardViewTitlePlaceholder.setText(strategyCardData.getStrategyCard().getTitle());
            }
        } else if (spanIndex == 1) {
            List<OptionStrategyBuilderAdapter2> currentList2 = getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList2, "getCurrentList(...)");
            Object orNull2 = CollectionsKt.getOrNull(currentList2, position - 1);
            OptionStrategyBuilderAdapter2.StrategyCardData strategyCardData2 = (OptionStrategyBuilderAdapter2.StrategyCardData) (((OptionStrategyBuilderAdapter2) orNull2) instanceof OptionStrategyBuilderAdapter2.StrategyCardData ? orNull2 : null);
            if (strategyCardData2 != null) {
                optionStrategyBuilderCardView.getBindings().optionsStrategyBuilderCardViewTitlePlaceholder.setText(strategyCardData2.getStrategyCard().getTitle());
            }
        }
        OnClickListeners.onClick(view, new Function0() { // from class: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderAdapter.onBindViewHolder$lambda$4$lambda$3$lambda$2(this.f$0, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$3$lambda$2(OptionStrategyBuilderAdapter optionStrategyBuilderAdapter, OptionStrategyBuilderAdapter2 optionStrategyBuilderAdapter2) {
        optionStrategyBuilderAdapter.onCardClicked.invoke(optionStrategyBuilderAdapter2);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getViewType().ordinal();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionStrategyBuilderAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/optionschain/strategybuilder/OptionStrategyBuilderAdapter$ViewType;", "", "spanCount", "", "<init>", "(Ljava/lang/String;II)V", "getSpanCount", "()I", "VIEW_TYPE_HEADER", "VIEW_TYPE_TITLE", "VIEW_TYPE_SUBTITLE", "VIEW_TYPE_STRATEGY_CARD", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        private final int spanCount;
        public static final ViewType VIEW_TYPE_HEADER = new ViewType("VIEW_TYPE_HEADER", 0, 2);
        public static final ViewType VIEW_TYPE_TITLE = new ViewType("VIEW_TYPE_TITLE", 1, 2);
        public static final ViewType VIEW_TYPE_SUBTITLE = new ViewType("VIEW_TYPE_SUBTITLE", 2, 2);
        public static final ViewType VIEW_TYPE_STRATEGY_CARD = new ViewType("VIEW_TYPE_STRATEGY_CARD", 3, 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{VIEW_TYPE_HEADER, VIEW_TYPE_TITLE, VIEW_TYPE_SUBTITLE, VIEW_TYPE_STRATEGY_CARD};
        }

        public static EnumEntries<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i, int i2) {
            this.spanCount = i2;
        }

        public final int getSpanCount() {
            return this.spanCount;
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
