package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CbcTestCardDelegate.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/stripe/android/cards/CbcTestCardDelegate;", "", "()V", "testAccountRanges", "", "", "", "Lcom/stripe/android/model/AccountRange;", "onCardNumberChanged", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CbcTestCardDelegate {
    public static final int $stable;
    public static final CbcTestCardDelegate INSTANCE = new CbcTestCardDelegate();
    private static final Map<String, List<AccountRange>> testAccountRanges;

    private CbcTestCardDelegate() {
    }

    static {
        BinRange binRange = new BinRange("4000000000000000", "4999999999999999");
        AccountRange.BrandInfo brandInfo = AccountRange.BrandInfo.CartesBancaires;
        testAccountRanges = MapsKt.mapOf(Tuples4.m3642to("4000002500001001", CollectionsKt.listOf((Object[]) new AccountRange[]{new AccountRange(binRange, 16, brandInfo, null, 8, null), new AccountRange(new BinRange("4000000000000000", "4999999999999999"), 16, AccountRange.BrandInfo.Visa, null, 8, null)})), Tuples4.m3642to("5555552500001001", CollectionsKt.listOf((Object[]) new AccountRange[]{new AccountRange(new BinRange("5100000000000000", "5599999999999999"), 16, brandInfo, null, 8, null), new AccountRange(new BinRange("5100000000000000", "5599999999999999"), 16, AccountRange.BrandInfo.Mastercard, null, 8, null)})));
        $stable = 8;
    }

    public final List<AccountRange> onCardNumberChanged(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        Map<String, List<AccountRange>> map = testAccountRanges;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, List<AccountRange>>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, List<AccountRange>> next = it.next();
            if (StringsKt.startsWith$default(cardNumber.getNormalized(), next.getKey(), false, 2, (Object) null)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.singleOrNull(linkedHashMap.entrySet());
        List<AccountRange> list = entry != null ? (List) entry.getValue() : null;
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
