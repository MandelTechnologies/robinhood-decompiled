package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DefaultStaticCardAccountRanges.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/cards/DefaultStaticCardAccountRanges;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "()V", "filter", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "first", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class DefaultStaticCardAccountRanges implements StaticCardAccountRanges {
    private static final List<AccountRange> ACCOUNTS;
    private static final List<AccountRange> AMEX_ACCOUNTS;
    private static final List<AccountRange> CARTES_BANCAIRES_ACCOUNT_RANGES;
    private static final List<AccountRange> DINERSCLUB14_ACCOUNT_RANGES;
    private static final List<AccountRange> DINERSCLUB16_ACCOUNT_RANGES;
    private static final List<AccountRange> DISCOVER_ACCOUNTS;
    private static final List<AccountRange> JCB_ACCOUNTS;
    private static final List<AccountRange> MASTERCARD_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY16_ACCOUNTS;
    private static final List<AccountRange> UNIONPAY19_ACCOUNTS;
    private static final List<AccountRange> VISA_ACCOUNTS;

    @Override // com.stripe.android.cards.StaticCardAccountRanges
    public AccountRange first(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        return (AccountRange) CollectionsKt.firstOrNull((List) filter(cardNumber));
    }

    @Override // com.stripe.android.cards.StaticCardAccountRanges
    public List<AccountRange> filter(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        List<AccountRange> list = ACCOUNTS;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AccountRange) obj).getBinRange().matches(cardNumber)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    static {
        Set of = SetsKt.setOf(new BinRange("4000000000000000", "4999999999999999"));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(of, 10));
        Iterator it = of.iterator();
        while (it.hasNext()) {
            arrayList.add(new AccountRange((BinRange) it.next(), 16, AccountRange.BrandInfo.Visa, null, 8, null));
        }
        VISA_ACCOUNTS = arrayList;
        Set of2 = SetsKt.setOf((Object[]) new BinRange[]{new BinRange("2221000000000000", "2720999999999999"), new BinRange("5100000000000000", "5599999999999999")});
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of2, 10));
        Iterator it2 = of2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new AccountRange((BinRange) it2.next(), 16, AccountRange.BrandInfo.Mastercard, null, 8, null));
        }
        MASTERCARD_ACCOUNTS = arrayList2;
        Set of3 = SetsKt.setOf((Object[]) new BinRange[]{new BinRange("340000000000000", "349999999999999"), new BinRange("370000000000000", "379999999999999")});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of3, 10));
        Iterator it3 = of3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new AccountRange((BinRange) it3.next(), 15, AccountRange.BrandInfo.AmericanExpress, null, 8, null));
        }
        AMEX_ACCOUNTS = arrayList3;
        Set of4 = SetsKt.setOf((Object[]) new BinRange[]{new BinRange("6000000000000000", "6099999999999999"), new BinRange("6400000000000000", "6499999999999999"), new BinRange("6500000000000000", "6599999999999999")});
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of4, 10));
        Iterator it4 = of4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new AccountRange((BinRange) it4.next(), 16, AccountRange.BrandInfo.Discover, null, 8, null));
        }
        DISCOVER_ACCOUNTS = arrayList4;
        Set of5 = SetsKt.setOf(new BinRange("3528000000000000", "3589999999999999"));
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of5, 10));
        Iterator it5 = of5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new AccountRange((BinRange) it5.next(), 16, AccountRange.BrandInfo.JCB, null, 8, null));
        }
        JCB_ACCOUNTS = arrayList5;
        Set of6 = SetsKt.setOf((Object[]) new BinRange[]{new BinRange("6200000000000000", "6216828049999999"), new BinRange("6216828060000000", "6299999999999999"), new BinRange("8100000000000000", "8199999999999999")});
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of6, 10));
        Iterator it6 = of6.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new AccountRange((BinRange) it6.next(), 16, AccountRange.BrandInfo.UnionPay, null, 8, null));
        }
        UNIONPAY16_ACCOUNTS = arrayList6;
        Set of7 = SetsKt.setOf(new BinRange("6216828050000000000", "6216828059999999999"));
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of7, 10));
        Iterator it7 = of7.iterator();
        while (it7.hasNext()) {
            arrayList7.add(new AccountRange((BinRange) it7.next(), 19, AccountRange.BrandInfo.UnionPay, null, 8, null));
        }
        UNIONPAY19_ACCOUNTS = arrayList7;
        Set of8 = SetsKt.setOf((Object[]) new BinRange[]{new BinRange("3000000000000000", "3059999999999999"), new BinRange("3095000000000000", "3095999999999999"), new BinRange("3800000000000000", "3999999999999999")});
        ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of8, 10));
        Iterator it8 = of8.iterator();
        while (it8.hasNext()) {
            arrayList8.add(new AccountRange((BinRange) it8.next(), 16, AccountRange.BrandInfo.DinersClub, null, 8, null));
        }
        DINERSCLUB16_ACCOUNT_RANGES = arrayList8;
        Set of9 = SetsKt.setOf(new BinRange("36000000000000", "36999999999999"));
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of9, 10));
        Iterator it9 = of9.iterator();
        while (it9.hasNext()) {
            arrayList9.add(new AccountRange((BinRange) it9.next(), 14, AccountRange.BrandInfo.DinersClub, null, 8, null));
        }
        DINERSCLUB14_ACCOUNT_RANGES = arrayList9;
        Set of10 = SetsKt.setOf((Object[]) new BinRange[]{new BinRange("4000002500001001", "4000002500001001"), new BinRange("5555552500001001", "5555552500001001")});
        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(of10, 10));
        Iterator it10 = of10.iterator();
        while (it10.hasNext()) {
            arrayList10.add(new AccountRange((BinRange) it10.next(), 16, AccountRange.BrandInfo.CartesBancaires, null, 8, null));
        }
        CARTES_BANCAIRES_ACCOUNT_RANGES = arrayList10;
        ACCOUNTS = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) VISA_ACCOUNTS, (Iterable) MASTERCARD_ACCOUNTS), (Iterable) AMEX_ACCOUNTS), (Iterable) DISCOVER_ACCOUNTS), (Iterable) JCB_ACCOUNTS), (Iterable) UNIONPAY16_ACCOUNTS), (Iterable) UNIONPAY19_ACCOUNTS), (Iterable) DINERSCLUB16_ACCOUNT_RANGES), (Iterable) DINERSCLUB14_ACCOUNT_RANGES), (Iterable) arrayList10);
    }
}
