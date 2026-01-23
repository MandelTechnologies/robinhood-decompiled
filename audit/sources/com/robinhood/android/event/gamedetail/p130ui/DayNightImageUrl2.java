package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import kotlin.Metadata;

/* compiled from: DayNightImageUrl.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {MarkdownText4.TagImageUrl, "Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.DayNightImageUrlKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class DayNightImageUrl2 {
    public static final DayNightImageUrl imageUrl(ContractDisplayDetails contractDisplayDetails) {
        return new DayNightImageUrl(contractDisplayDetails != null ? contractDisplayDetails.getLightImageUrl() : null, contractDisplayDetails != null ? contractDisplayDetails.getDarkImageUrl() : null);
    }
}
