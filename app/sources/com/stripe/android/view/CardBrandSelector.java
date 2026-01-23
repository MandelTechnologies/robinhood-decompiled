package com.stripe.android.view;

import com.stripe.android.model.CardBrand;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardBrandSelector.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, m3636d2 = {"selectCardBrandToDisplay", "Lcom/stripe/android/model/CardBrand;", "userSelectedBrand", "possibleBrands", "", "merchantPreferredBrands", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.view.CardBrandSelectorKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class CardBrandSelector {
    public static final CardBrand selectCardBrandToDisplay(CardBrand cardBrand, List<? extends CardBrand> possibleBrands, List<? extends CardBrand> merchantPreferredBrands) {
        Intrinsics.checkNotNullParameter(possibleBrands, "possibleBrands");
        Intrinsics.checkNotNullParameter(merchantPreferredBrands, "merchantPreferredBrands");
        Object obj = null;
        if (cardBrand != CardBrand.Unknown && !CollectionsKt.contains(possibleBrands, cardBrand)) {
            cardBrand = null;
        }
        Iterator<T> it = merchantPreferredBrands.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (possibleBrands.contains((CardBrand) next)) {
                obj = next;
                break;
            }
        }
        CardBrand cardBrand2 = (CardBrand) obj;
        return cardBrand == null ? cardBrand2 == null ? CardBrand.Unknown : cardBrand2 : cardBrand;
    }
}
