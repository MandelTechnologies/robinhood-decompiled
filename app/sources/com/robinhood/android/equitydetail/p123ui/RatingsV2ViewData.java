package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.InstrumentRatings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/RatingsV2ViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "ratings", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;)V", "getRatings", "()Lcom/robinhood/shared/equities/models/instrumentdetails/db/InstrumentRatings;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "elementIds", "", "", "getElementIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RatingsV2ViewData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;
    private final List<String> elementIds;
    private final HeaderData.FromResource headerData;
    private final InstrumentRatings ratings;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ RatingsV2ViewData copy$default(RatingsV2ViewData ratingsV2ViewData, InstrumentRatings instrumentRatings, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentRatings = ratingsV2ViewData.ratings;
        }
        return ratingsV2ViewData.copy(instrumentRatings);
    }

    /* renamed from: component1, reason: from getter */
    public final InstrumentRatings getRatings() {
        return this.ratings;
    }

    public final RatingsV2ViewData copy(InstrumentRatings ratings) {
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        return new RatingsV2ViewData(ratings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RatingsV2ViewData) && Intrinsics.areEqual(this.ratings, ((RatingsV2ViewData) other).ratings);
    }

    public int hashCode() {
        return this.ratings.hashCode();
    }

    public String toString() {
        return "RatingsV2ViewData(ratings=" + this.ratings + ")";
    }

    public final InstrumentRatings getRatings() {
        return this.ratings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingsV2ViewData(InstrumentRatings ratings) {
        HeaderData.FromResource fromResource;
        super(null);
        Intrinsics.checkNotNullParameter(ratings, "ratings");
        this.ratings = ratings;
        this.section = ApiStockDetail.Section.ANALYST_RATINGS;
        InstrumentRatings.Summary summary = ratings.getSummary();
        int totalNumRatings = summary != null ? summary.getTotalNumRatings() : 0;
        if (totalNumRatings == 0) {
            fromResource = new HeaderData.FromResource(C15314R.string.instrument_detail_ratings_label_without_rating_count, getSection(), EducationTourElementIds.ANALYST_RATINGS_HEADER_ELEMENT_ID);
        } else {
            fromResource = new HeaderData.FromResource(C15314R.string.instrument_detail_ratings_label_with_rating_count, CollectionsKt.listOf(Integer.valueOf(totalNumRatings)), getSection(), EducationTourElementIds.ANALYST_RATINGS_HEADER_ELEMENT_ID);
        }
        this.headerData = fromResource;
        this.elementIds = CollectionsKt.mutableListOf(EducationTourElementIds.ANALYST_RATINGS_SUMMARY_ELEMENT_ID, EducationTourElementIds.ANALYST_RATINGS_CIRCLE_ELEMENT_ID);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public HeaderData.FromResource getHeaderData() {
        return this.headerData;
    }

    @Override // com.robinhood.android.educationtour.interfaces.EducationTourViewData
    public List<String> getElementIds() {
        return this.elementIds;
    }
}
