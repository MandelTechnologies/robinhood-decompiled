package com.robinhood.android.acatsin.coowner.review;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerReviewState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"assetsValue", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "getAssetsValue", "(Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;)Lcom/robinhood/utils/resource/StringResource;", "feature-acats-in-coowner_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewStateKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewState3 {
    public static final StringResource getAssetsValue(AcatsTransfer acatsTransfer) {
        Intrinsics.checkNotNullParameter(acatsTransfer, "<this>");
        if (acatsTransfer.getAssets().isEmpty()) {
            return null;
        }
        return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C7686R.plurals.acats_in_review_assets_count, acatsTransfer.getAssets().size()), Integer.valueOf(acatsTransfer.getAssets().size()));
    }
}
