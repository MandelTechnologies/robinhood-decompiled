package com.robinhood.android.acatsin.util;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PlaidBrokerAssetsHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"assetsEqualTo", "", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/PlaidBrokerAssets;", "assets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class PlaidBrokerAssetsHelper {
    public static final boolean assetsEqualTo(PlaidBrokerAssets plaidBrokerAssets, List<? extends UiAcatsAsset> assets) {
        Money money;
        Object next;
        Money money2;
        Object next2;
        Intrinsics.checkNotNullParameter(plaidBrokerAssets, "<this>");
        Intrinsics.checkNotNullParameter(assets, "assets");
        List<? extends UiAcatsAsset> list = assets;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof UiAcatsAsset.CashAsset) {
                arrayList.add(obj);
            }
        }
        com.robinhood.models.serverdriven.experimental.api.Money cash = plaidBrokerAssets.getCash();
        if (cash != null) {
            BigDecimal amount = cash.getAmount();
            Currency currency = Currency.getInstance(cash.getCurrency_code());
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
            money = Money3.toMoney(amount, currency);
        } else {
            money = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UiAcatsAsset.CashAsset) next).getCashType() == UiAcatsAsset.CashAsset.CashType.CASH) {
                break;
            }
        }
        UiAcatsAsset.CashAsset cashAsset = (UiAcatsAsset.CashAsset) next;
        boolean z = false;
        if (!Intrinsics.areEqual(money, cashAsset != null ? cashAsset.getAmount() : null)) {
            return false;
        }
        com.robinhood.models.serverdriven.experimental.api.Money margin = plaidBrokerAssets.getMargin();
        if (margin != null) {
            BigDecimal amount2 = margin.getAmount();
            Currency currency2 = Currency.getInstance(margin.getCurrency_code());
            Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
            money2 = Money3.toMoney(amount2, currency2);
        } else {
            money2 = null;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((UiAcatsAsset.CashAsset) next2).getCashType() == UiAcatsAsset.CashAsset.CashType.MARGIN) {
                break;
            }
        }
        UiAcatsAsset.CashAsset cashAsset2 = (UiAcatsAsset.CashAsset) next2;
        if (!Intrinsics.areEqual(money2, cashAsset2 != null ? cashAsset2.getAmount() : null)) {
            return false;
        }
        List listSortedWith = CollectionsKt.sortedWith(plaidBrokerAssets.getEquityAssets(), new Comparator() { // from class: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt$assetsEqualTo$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((EquityAsset) t).getInstrumentId(), ((EquityAsset) t2).getInstrumentId());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof UiAcatsAsset.EquityAsset) {
                arrayList2.add(obj2);
            }
        }
        List listSortedWith2 = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt$assetsEqualTo$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((UiAcatsAsset.EquityAsset) t).getInstrumentId().toString(), ((UiAcatsAsset.EquityAsset) t2).getInstrumentId().toString());
            }
        });
        if (listSortedWith.size() != listSortedWith2.size()) {
            return false;
        }
        List<Tuples2> listZip = CollectionsKt.zip(listSortedWith, listSortedWith2);
        if (!(listZip instanceof Collection) || !listZip.isEmpty()) {
            for (Tuples2 tuples2 : listZip) {
                EquityAsset equityAsset = (EquityAsset) tuples2.component1();
                UiAcatsAsset.EquityAsset equityAsset2 = (UiAcatsAsset.EquityAsset) tuples2.component2();
                if (Intrinsics.areEqual(equityAsset.getInstrumentId(), equityAsset2.getInstrumentId().toString())) {
                    int iIntValue = equityAsset.getQuantity().intValue();
                    Integer numShares = equityAsset2.getNumShares();
                    if (numShares != null && iIntValue == numShares.intValue()) {
                    }
                }
                return false;
            }
        }
        List listSortedWith3 = CollectionsKt.sortedWith(plaidBrokerAssets.getOptionAssets(), ComparisonsKt.compareBy(new Function1() { // from class: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return PlaidBrokerAssetsHelper.assetsEqualTo$lambda$7((OptionAsset) obj3);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return PlaidBrokerAssetsHelper.assetsEqualTo$lambda$8((OptionAsset) obj3);
            }
        }));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof UiAcatsAsset.OptionAsset) {
                arrayList3.add(obj3);
            }
        }
        List listSortedWith4 = CollectionsKt.sortedWith(arrayList3, ComparisonsKt.compareBy(new Function1() { // from class: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                return PlaidBrokerAssetsHelper.assetsEqualTo$lambda$9((UiAcatsAsset.OptionAsset) obj4);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.util.PlaidBrokerAssetsHelperKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                return PlaidBrokerAssetsHelper.assetsEqualTo$lambda$10((UiAcatsAsset.OptionAsset) obj4);
            }
        }));
        if (listSortedWith3.size() != listSortedWith4.size()) {
            return false;
        }
        List<Tuples2> listZip2 = CollectionsKt.zip(listSortedWith3, listSortedWith4);
        if (!(listZip2 instanceof Collection) || !listZip2.isEmpty()) {
            for (Tuples2 tuples22 : listZip2) {
                OptionAsset optionAsset = (OptionAsset) tuples22.component1();
                UiAcatsAsset.OptionAsset optionAsset2 = (UiAcatsAsset.OptionAsset) tuples22.component2();
                if (Intrinsics.areEqual(optionAsset.getInstrumentId(), optionAsset2.getInstrumentId().toString()) && Intrinsics.areEqual(optionAsset.getChainId(), optionAsset2.getOptionId().toString())) {
                    int iIntValue2 = optionAsset.getQuantity().intValue();
                    Integer numContracts = optionAsset2.getNumContracts();
                    if (numContracts != null && iIntValue2 == numContracts.intValue()) {
                    }
                }
                z = true;
            }
        }
        return !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable assetsEqualTo$lambda$7(OptionAsset it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInstrumentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable assetsEqualTo$lambda$8(OptionAsset it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getChainId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable assetsEqualTo$lambda$10(UiAcatsAsset.OptionAsset it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getOptionId().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable assetsEqualTo$lambda$9(UiAcatsAsset.OptionAsset it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInstrumentId().toString();
    }
}
