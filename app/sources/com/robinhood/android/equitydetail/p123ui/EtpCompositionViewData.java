package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.shared.common.etpcomposition.C37462R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/EtpCompositionViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/db/EtpDetails;", "<init>", "(Lcom/robinhood/models/db/EtpDetails;)V", "getDetails", "()Lcom/robinhood/models/db/EtpDetails;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "elementIds", "", "", "getElementIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EtpCompositionViewData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;
    private final EtpDetails details;
    private final List<String> elementIds;
    private final HeaderData.FromResource headerData;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ EtpCompositionViewData copy$default(EtpCompositionViewData etpCompositionViewData, EtpDetails etpDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            etpDetails = etpCompositionViewData.details;
        }
        return etpCompositionViewData.copy(etpDetails);
    }

    /* renamed from: component1, reason: from getter */
    public final EtpDetails getDetails() {
        return this.details;
    }

    public final EtpCompositionViewData copy(EtpDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new EtpCompositionViewData(details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EtpCompositionViewData) && Intrinsics.areEqual(this.details, ((EtpCompositionViewData) other).details);
    }

    public int hashCode() {
        return this.details.hashCode();
    }

    public String toString() {
        return "EtpCompositionViewData(details=" + this.details + ")";
    }

    public final EtpDetails getDetails() {
        return this.details;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpCompositionViewData(EtpDetails details) {
        super(null);
        Intrinsics.checkNotNullParameter(details, "details");
        this.details = details;
        this.section = ApiStockDetail.Section.ETP_COMPOSITION;
        this.headerData = new HeaderData.FromResource(C37462R.string.etp_composition_title, getSection(), EducationTourElementIds.ETP_DIST_HEADER_ELEMENT_ID);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.addAll(CollectionsKt.listOf((Object[]) new String[]{EducationTourElementIds.ETP_DIST_SECTORS_ELEMENT_ID, EducationTourElementIds.ETP_DIST_TOP_HOLDINGS_ELEMENT_ID, EducationTourElementIds.ETP_DIST_CHART_ELEMENT_ID, EducationTourElementIds.ETP_DIST_LEGENDS_ELEMENT_ID}));
        int iMax = Integer.max(details.getSectors().size(), details.getHoldings().size()) - 1;
        for (int i = 0; i < iMax; i++) {
            listCreateListBuilder.add(EducationTourElementIds.ETP_DIST_LEGEND_ITEM_ELEMENT_ID_PREFIX + i);
        }
        this.elementIds = CollectionsKt.toMutableList((Collection) CollectionsKt.build(listCreateListBuilder));
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
