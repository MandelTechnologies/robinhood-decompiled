package com.robinhood.android.redesigninvesting.store.badges;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.redesign.dao.HighlightImpressionDao;
import com.robinhood.android.redesign.model.AssetQuote;
import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.android.redesigninvesting.models.badges.InvestingBadge;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettings;
import com.robinhood.android.redesigninvesting.shared.util.PriceAlertUtils;
import com.robinhood.models.advanced.alert.p302db.AdvancedAlert;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: InvestingBadgeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/models/badges/InvestingBadge;", "priceAlert", "Lcom/robinhood/models/advanced/alert/db/AdvancedAlert;", "quote", "Lcom/robinhood/android/redesign/model/AssetQuote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$1", m3645f = "InvestingBadgeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 192, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingBadgeStore8 extends ContinuationImpl7 implements Function3<AdvancedAlert, AssetQuote, Continuation<? super InvestingBadge>, Object> {
    final /* synthetic */ RedesignSettings $settings;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    final /* synthetic */ InvestingBadgeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingBadgeStore8(InvestingBadgeStore investingBadgeStore, RedesignSettings redesignSettings, Continuation<? super InvestingBadgeStore8> continuation) {
        super(3, continuation);
        this.this$0 = investingBadgeStore;
        this.$settings = redesignSettings;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AdvancedAlert advancedAlert, AssetQuote assetQuote, Continuation<? super InvestingBadge> continuation) {
        InvestingBadgeStore8 investingBadgeStore8 = new InvestingBadgeStore8(this.this$0, this.$settings, continuation);
        investingBadgeStore8.L$0 = advancedAlert;
        investingBadgeStore8.L$1 = assetQuote;
        return investingBadgeStore8.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0289  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0168 -> B:59:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01ab -> B:57:0x01ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01ae -> B:59:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x027b -> B:92:0x027c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0281 -> B:95:0x0282). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdvancedAlert advancedAlert;
        AssetQuote assetQuote;
        Object impressions;
        Iterator it;
        RedesignSettings redesignSettings;
        Collection collection;
        Map map;
        InvestingBadgeStore investingBadgeStore;
        final AssetQuote assetQuote2;
        AdvancedAlert advancedAlert2;
        Object obj2;
        AlertHubSettingItem alertHubSettingItem;
        Iterator it2;
        RedesignSettings redesignSettings2;
        InvestingBadgeStore investingBadgeStore2;
        Collection collection2;
        final Money money$default;
        String id;
        final Money money$default2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        char c = 2;
        int i2 = 1;
        Currency currency = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            advancedAlert = (AdvancedAlert) this.L$0;
            assetQuote = (AssetQuote) this.L$1;
            List<AlertHubSettingItem> settings = advancedAlert.getSettings();
            ArrayList arrayList = new ArrayList();
            for (AlertHubSettingItem alertHubSettingItem2 : settings) {
                String id2 = alertHubSettingItem2 != null ? alertHubSettingItem2.getId() : null;
                if (id2 != null) {
                    arrayList.add(id2);
                }
            }
            HighlightImpressionDao highlightImpressionDao = this.this$0.highlightImpressionDao;
            this.L$0 = advancedAlert;
            this.L$1 = assetQuote;
            this.label = 1;
            impressions = highlightImpressionDao.getImpressions(arrayList, this);
            if (impressions == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            assetQuote = (AssetQuote) this.L$1;
            advancedAlert = (AdvancedAlert) this.L$0;
            ResultKt.throwOnFailure(obj);
            impressions = obj;
        } else if (i == 2) {
            boolean z = this.Z$0;
            Object next = this.L$7;
            it = (Iterator) this.L$6;
            collection = (Collection) this.L$5;
            investingBadgeStore = (InvestingBadgeStore) this.L$4;
            redesignSettings = (RedesignSettings) this.L$3;
            map = (Map) this.L$2;
            assetQuote2 = (AssetQuote) this.L$1;
            advancedAlert2 = (AdvancedAlert) this.L$0;
            ResultKt.throwOnFailure(obj);
            char c2 = 2;
            Object obj3 = coroutine_suspended;
            boolean zIsPriceAlertEligibleForDisplay = z;
            if (zIsPriceAlertEligibleForDisplay) {
                collection.add(next);
            }
            coroutine_suspended = obj3;
            i2 = 1;
            currency = null;
            c = c2;
            if (it.hasNext()) {
                next = it.next();
                AlertHubSettingItem.PriceAbove priceAbove = (AlertHubSettingItem.PriceAbove) next;
                BigDecimal price = priceAbove.getPrice();
                if (price == null || (money$default = Money3.toMoney$default(price, currency, i2, currency)) == null || (id = priceAbove.getId()) == null) {
                    c2 = c;
                    obj3 = coroutine_suspended;
                    zIsPriceAlertEligibleForDisplay = false;
                } else {
                    Object obj4 = coroutine_suspended;
                    zIsPriceAlertEligibleForDisplay = PriceAlertUtils.INSTANCE.isPriceAlertEligibleForDisplay((HighlightImpression) map.get(id), redesignSettings.getHighlightSettings(), investingBadgeStore.clock, new Function0() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(InvestingBadgeStore8.invokeSuspend$lambda$4$lambda$3(assetQuote2, money$default));
                        }
                    });
                    if (zIsPriceAlertEligibleForDisplay) {
                        this.L$0 = advancedAlert2;
                        this.L$1 = assetQuote2;
                        this.L$2 = map;
                        this.L$3 = redesignSettings;
                        this.L$4 = investingBadgeStore;
                        this.L$5 = collection;
                        this.L$6 = it;
                        this.L$7 = next;
                        this.Z$0 = zIsPriceAlertEligibleForDisplay;
                        c2 = 2;
                        this.label = 2;
                        obj3 = obj4;
                        if (investingBadgeStore.markPriceAlertGenerated$lib_store_badges_externalDebug(id, this) == obj3) {
                            return obj3;
                        }
                        z = zIsPriceAlertEligibleForDisplay;
                        boolean zIsPriceAlertEligibleForDisplay2 = z;
                    } else {
                        obj3 = obj4;
                        c2 = 2;
                    }
                }
                if (zIsPriceAlertEligibleForDisplay2) {
                }
                coroutine_suspended = obj3;
                i2 = 1;
                currency = null;
                c = c2;
                if (it.hasNext()) {
                    obj2 = coroutine_suspended;
                    AlertHubSettingItem alertHubSettingItem3 = (AlertHubSettingItem) CollectionsKt.firstOrNull((List) collection);
                    List<AlertHubSettingItem> settings2 = advancedAlert2.getSettings();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : settings2) {
                        if (obj5 instanceof AlertHubSettingItem.PriceBelow) {
                            arrayList2.add(obj5);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : arrayList2) {
                        if (((AlertHubSettingItem.PriceBelow) obj6).getEnabled()) {
                            arrayList3.add(obj6);
                        }
                    }
                    RedesignSettings redesignSettings3 = this.$settings;
                    InvestingBadgeStore investingBadgeStore3 = this.this$0;
                    ArrayList arrayList4 = new ArrayList();
                    alertHubSettingItem = alertHubSettingItem3;
                    it2 = arrayList3.iterator();
                    redesignSettings2 = redesignSettings3;
                    investingBadgeStore2 = investingBadgeStore3;
                    collection2 = arrayList4;
                    if (it2.hasNext()) {
                    }
                }
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z2 = this.Z$0;
            Object obj7 = this.L$7;
            it2 = (Iterator) this.L$6;
            collection2 = (Collection) this.L$5;
            investingBadgeStore2 = (InvestingBadgeStore) this.L$4;
            redesignSettings2 = (RedesignSettings) this.L$3;
            alertHubSettingItem = (AlertHubSettingItem) this.L$2;
            map = (Map) this.L$1;
            assetQuote2 = (AssetQuote) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object obj8 = coroutine_suspended;
            Object next2 = obj7;
            boolean zIsPriceAlertEligibleForDisplay3 = z2;
            if (zIsPriceAlertEligibleForDisplay3) {
                collection2.add(next2);
            }
            obj2 = obj8;
            if (it2.hasNext()) {
                next2 = it2.next();
                AlertHubSettingItem.PriceBelow priceBelow = (AlertHubSettingItem.PriceBelow) next2;
                BigDecimal price2 = priceBelow.getPrice();
                if (price2 == null || (money$default2 = Money3.toMoney$default(price2, null, 1, null)) == null) {
                    obj8 = obj2;
                    zIsPriceAlertEligibleForDisplay3 = false;
                } else {
                    String id3 = priceBelow.getId();
                    if (id3 == null) {
                        obj8 = obj2;
                        zIsPriceAlertEligibleForDisplay3 = false;
                    } else {
                        Object obj9 = obj2;
                        zIsPriceAlertEligibleForDisplay3 = PriceAlertUtils.INSTANCE.isPriceAlertEligibleForDisplay((HighlightImpression) map.get(id3), redesignSettings2.getHighlightSettings(), investingBadgeStore2.clock, new Function0() { // from class: com.robinhood.android.redesigninvesting.store.badges.InvestingBadgeStore$streamPriceAlerts$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(InvestingBadgeStore8.invokeSuspend$lambda$7$lambda$6(assetQuote2, money$default2));
                            }
                        });
                        if (zIsPriceAlertEligibleForDisplay3) {
                            this.L$0 = assetQuote2;
                            this.L$1 = map;
                            this.L$2 = alertHubSettingItem;
                            this.L$3 = redesignSettings2;
                            this.L$4 = investingBadgeStore2;
                            this.L$5 = collection2;
                            this.L$6 = it2;
                            this.L$7 = next2;
                            this.Z$0 = zIsPriceAlertEligibleForDisplay3;
                            this.label = 3;
                            obj8 = obj9;
                            if (investingBadgeStore2.markPriceAlertGenerated$lib_store_badges_externalDebug(id3, this) == obj8) {
                                return obj8;
                            }
                            z2 = zIsPriceAlertEligibleForDisplay3;
                            boolean zIsPriceAlertEligibleForDisplay32 = z2;
                        } else {
                            obj8 = obj9;
                        }
                    }
                }
                if (zIsPriceAlertEligibleForDisplay32) {
                }
                obj2 = obj8;
                if (it2.hasNext()) {
                    AlertHubSettingItem alertHubSettingItem4 = (AlertHubSettingItem) CollectionsKt.firstOrNull((List) collection2);
                    String id4 = alertHubSettingItem != null ? alertHubSettingItem.getId() : null;
                    String id5 = alertHubSettingItem4 != null ? alertHubSettingItem4.getId() : null;
                    return id4 != null ? new InvestingBadge.PriceAlertAbove(id4) : id5 != null ? new InvestingBadge.PriceAlertBelow(id5) : InvestingBadge.None.INSTANCE;
                }
            }
        }
        Iterable iterable = (Iterable) impressions;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object obj10 : iterable) {
            linkedHashMap.put(((HighlightImpression) obj10).getImpressionId(), obj10);
        }
        List<AlertHubSettingItem> settings3 = advancedAlert.getSettings();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj11 : settings3) {
            if (obj11 instanceof AlertHubSettingItem.PriceAbove) {
                arrayList5.add(obj11);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj12 : arrayList5) {
            if (((AlertHubSettingItem.PriceAbove) obj12).getEnabled()) {
                arrayList6.add(obj12);
            }
        }
        RedesignSettings redesignSettings4 = this.$settings;
        InvestingBadgeStore investingBadgeStore4 = this.this$0;
        ArrayList arrayList7 = new ArrayList();
        it = arrayList6.iterator();
        redesignSettings = redesignSettings4;
        collection = arrayList7;
        map = linkedHashMap;
        investingBadgeStore = investingBadgeStore4;
        assetQuote2 = assetQuote;
        advancedAlert2 = advancedAlert;
        if (it.hasNext()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$4$lambda$3(AssetQuote assetQuote, Money money) {
        return assetQuote.getPreviousCloseReference().compareTo(money) < 0 && money.compareTo(assetQuote.getLastTradePrice()) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$7$lambda$6(AssetQuote assetQuote, Money money) {
        return assetQuote.getLastTradePrice().compareTo(money) < 0 && money.compareTo(assetQuote.getPreviousCloseReference()) < 0;
    }
}
