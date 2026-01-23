package com.stripe.android.cards;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.model.AccountRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InMemoryCardAccountRangeStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/cards/InMemoryCardAccountRangeStore;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "()V", PlaceTypes.STORE, "", "Lcom/stripe/android/cards/Bin;", "", "Lcom/stripe/android/model/AccountRange;", "contains", "", "bin", "(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "", "accountRanges", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InMemoryCardAccountRangeStore implements CardAccountRangeStore {
    private final Map<Bin, List<AccountRange>> store = new LinkedHashMap();

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object get(Bin bin, Continuation<? super List<AccountRange>> continuation) {
        List<AccountRange> list = this.store.get(bin);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public void save(Bin bin, List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.store.put(bin, accountRanges);
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object contains(Bin bin, Continuation<? super Boolean> continuation) {
        return boxing.boxBoolean(this.store.containsKey(bin));
    }
}
