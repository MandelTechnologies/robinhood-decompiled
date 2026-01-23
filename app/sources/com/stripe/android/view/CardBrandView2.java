package com.stripe.android.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.stripe.android.R$id;
import com.stripe.android.R$layout;
import com.stripe.android.model.CardBrand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardBrandView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/view/BrandAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/model/CardBrand;", "context", "Landroid/content/Context;", "brands", "", "selectedBrand", "(Landroid/content/Context;Ljava/util/List;Lcom/stripe/android/model/CardBrand;)V", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "areAllItemsEnabled", "", "getCount", "", "getItem", "position", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "isEnabled", "updateView", "", "view", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.view.BrandAdapter, reason: use source file name */
/* loaded from: classes26.dex */
public final class CardBrandView2 extends ArrayAdapter<CardBrand> {
    private final List<CardBrand> brands;
    private final StripeColorUtils colorUtils;
    private final LayoutInflater inflater;
    private final CardBrand selectedBrand;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int position) {
        return position != 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardBrandView2(Context context, List<? extends CardBrand> brands, CardBrand cardBrand) {
        super(context, 0, brands);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(brands, "brands");
        this.brands = brands;
        this.selectedBrand = cardBrand;
        this.inflater = LayoutInflater.from(context);
        this.colorUtils = new StripeColorUtils(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (position == 0) {
            viewInflate = this.inflater.inflate(R$layout.stripe_select_card_brand_view, parent, false);
        } else {
            viewInflate = this.inflater.inflate(R$layout.stripe_card_brand_choice_list_view, parent, false);
        }
        if (position > 0) {
            Intrinsics.checkNotNull(viewInflate);
            updateView(viewInflate, position);
        }
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public CardBrand getItem(int position) {
        if (position == 0) {
            return null;
        }
        return (CardBrand) super.getItem(position - 1);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        if (this.brands.isEmpty()) {
            return 0;
        }
        return this.brands.size() + 1;
    }

    private final void updateView(View view, int position) {
        CardBrand cardBrand = (CardBrand) CollectionsKt.getOrNull(this.brands, position - 1);
        if (cardBrand != null) {
            boolean z = cardBrand == this.selectedBrand;
            ImageView imageView = (ImageView) view.findViewById(R$id.brand_icon);
            if (imageView != null) {
                imageView.setBackgroundResource(cardBrand.getIcon());
            }
            ImageView imageView2 = (ImageView) view.findViewById(R$id.brand_check);
            if (z) {
                imageView2.setVisibility(0);
                imageView2.setColorFilter(this.colorUtils.getColorPrimary());
            } else {
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) view.findViewById(R$id.brand_text);
            if (textView != null) {
                Intrinsics.checkNotNull(textView);
                textView.setText(cardBrand.getDisplayName());
                if (z) {
                    textView.setTextColor(this.colorUtils.getColorPrimary());
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    textView.setTypeface(Typeface.DEFAULT);
                }
            }
        }
    }
}
