package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/RelatedIndustryViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "relatedIndustryLists", "", "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "<init>", "(Ljava/util/List;)V", "getRelatedIndustryLists", "()Ljava/util/List;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RelatedIndustryViewData extends DetailData {
    public static final int $stable = 8;
    private final HeaderData.FromResource headerData;
    private final List<CuratedListChipItem> relatedIndustryLists;
    private final ApiStockDetail.Section section;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelatedIndustryViewData copy$default(RelatedIndustryViewData relatedIndustryViewData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = relatedIndustryViewData.relatedIndustryLists;
        }
        return relatedIndustryViewData.copy(list);
    }

    public final List<CuratedListChipItem> component1() {
        return this.relatedIndustryLists;
    }

    public final RelatedIndustryViewData copy(List<CuratedListChipItem> relatedIndustryLists) {
        Intrinsics.checkNotNullParameter(relatedIndustryLists, "relatedIndustryLists");
        return new RelatedIndustryViewData(relatedIndustryLists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RelatedIndustryViewData) && Intrinsics.areEqual(this.relatedIndustryLists, ((RelatedIndustryViewData) other).relatedIndustryLists);
    }

    public int hashCode() {
        return this.relatedIndustryLists.hashCode();
    }

    public String toString() {
        return "RelatedIndustryViewData(relatedIndustryLists=" + this.relatedIndustryLists + ")";
    }

    public final List<CuratedListChipItem> getRelatedIndustryLists() {
        return this.relatedIndustryLists;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedIndustryViewData(List<CuratedListChipItem> relatedIndustryLists) {
        super(null);
        Intrinsics.checkNotNullParameter(relatedIndustryLists, "relatedIndustryLists");
        this.relatedIndustryLists = relatedIndustryLists;
        this.section = ApiStockDetail.Section.RELATED_LISTS;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_related_lists, getSection(), null, 4, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public HeaderData.FromResource getHeaderData() {
        return this.headerData;
    }
}
