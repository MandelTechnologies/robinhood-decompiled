package com.robinhood.android.referral.rewardoffers.offersList;

import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetails2;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.librobinhood.data.store.RewardOffersStore2;
import com.robinhood.models.api.rewardoffer.ApiRewardOffer;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferRenderingType;
import com.robinhood.utils.Either2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardOffersStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersDataState;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersViewState;", "<init>", "()V", "reduce", "dataState", "toViewType", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOffer;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardOffersStateProvider implements StateProvider<RewardOffersDataState, RewardOffersViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public RewardOffersViewState reduce(RewardOffersDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        RewardOffersStore2 value = dataState.getValue();
        if (value instanceof RewardOffersStore2.RewardOffers) {
            RewardOffersStore2.RewardOffers rewardOffers = (RewardOffersStore2.RewardOffers) value;
            List<ApiRewardOffer> rewardOffers2 = rewardOffers.getRewardOffers();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rewardOffers2, 10));
            Iterator<T> it = rewardOffers2.iterator();
            while (it.hasNext()) {
                arrayList.add(toViewType((ApiRewardOffer) it.next()));
            }
            return new RewardOffersViewState(Either2.asLeft(arrayList), rewardOffers.getInitialSource());
        }
        if (value instanceof RewardOffersStore2.RewardOfferDetails) {
            RewardOffersStore2.RewardOfferDetails rewardOfferDetails = (RewardOffersStore2.RewardOfferDetails) value;
            return new RewardOffersViewState(Either2.asRight(RewardOfferDetails2.toRewardOfferDetails(rewardOfferDetails.getRewardOfferDetails())), rewardOfferDetails.getInitialSource());
        }
        return new RewardOffersViewState(null, null, 3, null);
    }

    private final RewardOfferViewType toViewType(ApiRewardOffer apiRewardOffer) {
        ApiRewardOfferRenderingType rendering_type = apiRewardOffer.getRendering_type();
        if (rendering_type instanceof ApiRewardOfferRenderingType.Large) {
            return new RewardOfferViewType.Large(apiRewardOffer.getId(), ((ApiRewardOfferRenderingType.Large) rendering_type).getData());
        }
        if (rendering_type instanceof ApiRewardOfferRenderingType.Standard) {
            return new RewardOfferViewType.Standard(apiRewardOffer.getId(), ((ApiRewardOfferRenderingType.Standard) rendering_type).getData());
        }
        if (rendering_type instanceof ApiRewardOfferRenderingType.Completed) {
            return new RewardOfferViewType.Completed(apiRewardOffer.getId(), ((ApiRewardOfferRenderingType.Completed) rendering_type).getData());
        }
        return new RewardOfferViewType.Unsupported(apiRewardOffer.getId());
    }
}
