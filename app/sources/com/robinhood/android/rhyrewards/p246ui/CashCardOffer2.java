package com.robinhood.android.rhyrewards.p246ui;

import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.rhy.referral.api.RhyReferralVariant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CashCardOffer.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"j$/time/Clock", Card.Icon.CLOCK, "j$/time/Instant", "expiredAt", "Lkotlin/Pair;", "", "", "getTimeToExpiration", "(Lj$/time/Clock;Lj$/time/Instant;)Lkotlin/Pair;", "", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "merchantOffers", "Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;", "rhyReferralVariant", "maxMerchantOffers", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "combineOffersCarousel", "(Ljava/util/List;Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;Ljava/lang/Integer;)Ljava/util/List;", "combineOffersFullScreen", "(Ljava/util/List;Lcom/robinhood/models/rhy/referral/api/RhyReferralVariant;)Ljava/util/List;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhyrewards.ui.CashCardOfferKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class CashCardOffer2 {
    public static final Tuples2<Integer, Long> getTimeToExpiration(Clock clock, Instant expiredAt) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(expiredAt, "expiredAt");
        Instant instant = clock.instant();
        Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
        Duration durationBetween = Duration.between(instant, expiredAt);
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        long days = durationBetween.toDays();
        if (days >= 365) {
            return new Tuples2<>(Integer.valueOf(C27650R.string.cash_merchant_rewards_offer_expiration_y), Long.valueOf(days / 365));
        }
        if (days >= 30) {
            return new Tuples2<>(Integer.valueOf(C27650R.string.cash_merchant_rewards_offer_expiration_m), Long.valueOf(days / 30));
        }
        if (days >= 7) {
            return new Tuples2<>(Integer.valueOf(C27650R.string.cash_merchant_rewards_offer_expiration_w), Long.valueOf(days / 7));
        }
        if (days > 0) {
            return new Tuples2<>(Integer.valueOf(C27650R.string.cash_merchant_rewards_offer_expiration_d), Long.valueOf(days));
        }
        if (durationBetween.toHours() >= 1) {
            return new Tuples2<>(Integer.valueOf(C27650R.string.cash_merchant_rewards_offer_expiration_h), Long.valueOf(durationBetween.toHours()));
        }
        return new Tuples2<>(Integer.valueOf(C27650R.string.cash_merchant_rewards_offer_expiration_min), Long.valueOf(durationBetween.toMinutes()));
    }

    public static /* synthetic */ List combineOffersCarousel$default(List list, RhyReferralVariant rhyReferralVariant, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return combineOffersCarousel(list, rhyReferralVariant, num);
    }

    public static final List<CashCardOffer> combineOffersCarousel(List<MerchantOfferV2> merchantOffers, RhyReferralVariant rhyReferralVariant, Integer num) {
        Intrinsics.checkNotNullParameter(merchantOffers, "merchantOffers");
        if (num != null && merchantOffers.size() > num.intValue()) {
            merchantOffers = merchantOffers.subList(0, num.intValue());
        }
        List<MerchantOfferV2> list = merchantOffers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new CashCardOffer.Merchant((MerchantOfferV2) it.next()));
        }
        List<CashCardOffer> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (rhyReferralVariant != null && rhyReferralVariant != RhyReferralVariant.UNKNOWN) {
            mutableList.add(0, new CashCardOffer.RhyReferral(rhyReferralVariant));
        }
        return mutableList;
    }

    public static final List<CashCardOffer> combineOffersFullScreen(List<MerchantOfferV2> merchantOffers, RhyReferralVariant rhyReferralVariant) {
        Intrinsics.checkNotNullParameter(merchantOffers, "merchantOffers");
        List<MerchantOfferV2> list = merchantOffers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new CashCardOffer.Merchant((MerchantOfferV2) it.next()));
        }
        List<CashCardOffer> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (rhyReferralVariant != null && rhyReferralVariant != RhyReferralVariant.UNKNOWN) {
            List<CashCardOffer> list2 = mutableList;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (CashCardOffer cashCardOffer : list2) {
                    CashCardOffer.Merchant merchant = cashCardOffer instanceof CashCardOffer.Merchant ? (CashCardOffer.Merchant) cashCardOffer : null;
                    if (merchant != null && merchant.getShouldTakeFullWidth() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            mutableList.add(i, new CashCardOffer.RhyReferral(rhyReferralVariant));
        }
        return mutableList;
    }
}
