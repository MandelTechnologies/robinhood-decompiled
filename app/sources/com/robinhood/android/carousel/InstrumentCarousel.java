package com.robinhood.android.carousel;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.carousel.InstrumentCarousel;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.LoggedRecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentCarousel.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u001f B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0013\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0013\u001a\f0\u0014R\b\u0012\u0004\u0012\u00028\u00000\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/carousel/InstrumentCarousel;", "T", "", "Lcom/robinhood/android/common/ui/view/LoggedRecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardButtonGroupTitle", "", "getCardButtonGroupTitle", "()Ljava/lang/String;", "setCardButtonGroupTitle", "(Ljava/lang/String;)V", "cardButtonTitle", "getCardButtonTitle", "setCardButtonTitle", "adapter", "Lcom/robinhood/android/carousel/InstrumentCarousel$Adapter;", "bindItems", "", "items", "", "getItem", "position", "", "(I)Ljava/lang/Object;", "createInstrumentCard", "Lcom/robinhood/android/carousel/InstrumentCard;", "Adapter", "SpaceItemDecoration", "lib-instrument-carousel_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class InstrumentCarousel<T> extends LoggedRecyclerView {
    private final InstrumentCarousel<T>.Adapter adapter;
    private String cardButtonGroupTitle;
    private String cardButtonTitle;

    public abstract InstrumentCard<T> createInstrumentCard(Context context, String cardButtonGroupTitle, String cardButtonTitle);

    public /* synthetic */ InstrumentCarousel(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        InstrumentCarousel<T>.Adapter adapter = new Adapter();
        this.adapter = adapter;
        setLayoutManager(new LinearLayoutManager(context, 0, false));
        setHasFixedSize(true);
        addItemDecoration(new SpaceItemDecoration(getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_small)));
        setAdapter(adapter);
    }

    public final String getCardButtonGroupTitle() {
        return this.cardButtonGroupTitle;
    }

    public final void setCardButtonGroupTitle(String str) {
        this.cardButtonGroupTitle = str;
    }

    public final String getCardButtonTitle() {
        return this.cardButtonTitle;
    }

    public final void setCardButtonTitle(String str) {
        this.cardButtonTitle = str;
    }

    public final void bindItems(List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.adapter.submitList(items);
    }

    public final T getItem(int position) {
        return this.adapter.getItem(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InstrumentCarousel.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J$\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/carousel/InstrumentCarousel$Adapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Lcom/robinhood/android/carousel/InstrumentCard;", "<init>", "(Lcom/robinhood/android/carousel/InstrumentCarousel;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "getItem", "(I)Ljava/lang/Object;", "lib-instrument-carousel_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class Adapter extends ListAdapter<T, GenericViewHolder<? extends InstrumentCard<T>>> {
        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _init_$lambda$0(Object obj) {
            return obj;
        }

        public Adapter() {
            super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.carousel.InstrumentCarousel$Adapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstrumentCarousel.Adapter._init_$lambda$0(obj);
                }
            }));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public GenericViewHolder<InstrumentCard<T>> onCreateViewHolder(ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            InstrumentCarousel<T> instrumentCarousel = InstrumentCarousel.this;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new GenericViewHolder<>(instrumentCarousel.createInstrumentCard(context, InstrumentCarousel.this.getCardButtonGroupTitle(), InstrumentCarousel.this.getCardButtonTitle()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(GenericViewHolder<? extends InstrumentCard<T>> holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            ((InstrumentCard) holder.getView()).bind$lib_instrument_carousel_externalDebug(getItem(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int position) {
            return C11048R.id.instrument_carousel_card_id;
        }

        @Override // androidx.recyclerview.widget.ListAdapter
        public T getItem(int position) {
            T t = (T) super.getItem(position);
            Intrinsics.checkNotNullExpressionValue(t, "getItem(...)");
            return t;
        }
    }

    /* compiled from: InstrumentCarousel.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/carousel/InstrumentCarousel$SpaceItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "space", "", "<init>", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "lib-instrument-carousel_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SpaceItemDecoration extends RecyclerView.ItemDecoration {
        private final int space;

        public SpaceItemDecoration(int i) {
            this.space = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (parent.getChildAdapterPosition(view) != 0) {
                outRect.left = this.space;
            }
        }
    }
}
