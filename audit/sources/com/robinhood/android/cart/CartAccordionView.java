package com.robinhood.android.cart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CartAccordionView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u0018\u0019B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cart/CartAccordionView;", "Lcom/robinhood/android/cart/CartAccordionRowView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/cart/CartChipsViewData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTxt", "Landroid/widget/TextView;", "chipsRecyclerView", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "callbacks", "Lcom/robinhood/android/cart/CartAccordionView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cart/CartAccordionView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/cart/CartAccordionView$Callbacks;)V", "bind", "", "state", "toggleExpanded", "Callbacks", "Companion", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CartAccordionView extends CartAccordionRowView implements Bindable<CartChipsViewData> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Callbacks callbacks;
    private final CuratedListChipRecyclerView chipsRecyclerView;
    private final TextView titleTxt;

    /* compiled from: CartAccordionView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cart/CartAccordionView$Callbacks;", "", "onChipClick", "", "id", "Ljava/util/UUID;", "toggleExpanded", "isExpanded", "", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChipClick(UUID id);

        void toggleExpanded(boolean isExpanded);
    }

    public /* synthetic */ CartAccordionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartAccordionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        inflateAccordionBody(C9955R.layout.merge_cart_accordion_body);
        View viewFindViewById = findViewById(C9955R.id.chips_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C9955R.id.chips_recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) viewFindViewById2;
        this.chipsRecyclerView = curatedListChipRecyclerView;
        curatedListChipRecyclerView.addItemDecoration(new PaddingItemDecoration(context) { // from class: com.robinhood.android.cart.CartAccordionView.1
            private final int sideSpacing;

            {
                this.sideSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
            }

            @Override // com.robinhood.utils.p409ui.view.recyclerview.PaddingItemDecoration
            protected int getRightPadding(RecyclerView.Adapter<?> adapter, int position) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                return this.sideSpacing;
            }
        });
        curatedListChipRecyclerView.setCallbacks(new CuratedListChipRecyclerView.Callbacks() { // from class: com.robinhood.android.cart.CartAccordionView.2
            @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
            public void onChipClick(CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Callbacks callbacks = CartAccordionView.this.getCallbacks();
                if (callbacks != null) {
                    callbacks.onChipClick(data.getId());
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
    public void bind(CartChipsViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.titleTxt.setText(state.getTitle());
        CuratedListChipRecyclerView curatedListChipRecyclerView = this.chipsRecyclerView;
        curatedListChipRecyclerView.setRowCount(state.getChipRowCount());
        curatedListChipRecyclerView.bind(state.getViewModels());
        super.setExpandable(state.getExpandable() || getIsExpanded());
    }

    @Override // com.robinhood.android.cart.CartAccordionRowView
    public void toggleExpanded() {
        if (super.getIsExpandable()) {
            super.toggleExpanded();
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.toggleExpanded(getIsExpanded());
            }
        }
    }

    /* compiled from: CartAccordionView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cart/CartAccordionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cart/CartAccordionView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CartAccordionView> {
        private final /* synthetic */ Inflater<CartAccordionView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CartAccordionView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CartAccordionView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C9955R.layout.include_cart_accordion_view);
        }
    }
}
