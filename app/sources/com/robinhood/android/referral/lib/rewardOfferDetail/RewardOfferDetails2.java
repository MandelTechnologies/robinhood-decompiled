package com.robinhood.android.referral.lib.rewardOfferDetail;

import android.os.Parcelable;
import com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetailsSectionViewType;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetails;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetailsSection;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferDetailsSectionRenderingType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardOfferDetails.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toRewardOfferDetails", "Lcom/robinhood/android/referral/lib/rewardOfferDetail/RewardOfferDetails;", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferDetails;", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.lib.rewardOfferDetail.RewardOfferDetailsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardOfferDetails2 {
    public static final RewardOfferDetails toRewardOfferDetails(ApiRewardOfferDetails apiRewardOfferDetails) {
        Parcelable disclosure;
        Intrinsics.checkNotNullParameter(apiRewardOfferDetails, "<this>");
        UUID id = apiRewardOfferDetails.getId();
        List<ApiRewardOfferDetailsSection> sections = apiRewardOfferDetails.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            ApiRewardOfferDetailsSectionRenderingType rendering_type = ((ApiRewardOfferDetailsSection) it.next()).getRendering_type();
            if (rendering_type instanceof ApiRewardOfferDetailsSectionRenderingType.AnimatedHeader) {
                disclosure = new RewardOfferDetailsSectionViewType.AnimatedHeader(((ApiRewardOfferDetailsSectionRenderingType.AnimatedHeader) rendering_type).getData());
            } else if (rendering_type instanceof ApiRewardOfferDetailsSectionRenderingType.ImageHeader) {
                disclosure = new RewardOfferDetailsSectionViewType.ImageHeader(((ApiRewardOfferDetailsSectionRenderingType.ImageHeader) rendering_type).getData());
            } else if (rendering_type instanceof ApiRewardOfferDetailsSectionRenderingType.MarqueeRow) {
                disclosure = new RewardOfferDetailsSectionViewType.MarqueeRow(((ApiRewardOfferDetailsSectionRenderingType.MarqueeRow) rendering_type).getData());
            } else if (rendering_type instanceof ApiRewardOfferDetailsSectionRenderingType.Bullet) {
                disclosure = new RewardOfferDetailsSectionViewType.Bullet(((ApiRewardOfferDetailsSectionRenderingType.Bullet) rendering_type).getData());
            } else if (rendering_type instanceof ApiRewardOfferDetailsSectionRenderingType.Disclosure) {
                disclosure = new RewardOfferDetailsSectionViewType.Disclosure(((ApiRewardOfferDetailsSectionRenderingType.Disclosure) rendering_type).getData().getText().toDbModel());
            } else {
                disclosure = RewardOfferDetailsSectionViewType.Unsupported.INSTANCE;
            }
            arrayList.add(disclosure);
        }
        return new RewardOfferDetails(id, arrayList, apiRewardOfferDetails.getPrimary_button(), apiRewardOfferDetails.getSecondary_button());
    }
}
