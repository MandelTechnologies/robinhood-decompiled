package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.interfaces.EducationTourViewData;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\r¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/NewsFeedViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "Lcom/robinhood/android/educationtour/interfaces/EducationTourViewData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "newsFeedContent", "", "Lcom/robinhood/android/newsfeed/model/Content;", "<init>", "(Lcom/robinhood/models/db/Instrument;Ljava/util/List;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getNewsFeedContent", "()Ljava/util/List;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "elementIds", "", "", "getElementIds", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NewsFeedViewData extends DetailData implements EducationTourViewData {
    public static final int $stable = 8;
    private final List<String> elementIds;
    private final HeaderData.FromResource headerData;
    private final Instrument instrument;
    private final List<Content> newsFeedContent;
    private final ApiStockDetail.Section section;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsFeedViewData copy$default(NewsFeedViewData newsFeedViewData, Instrument instrument, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = newsFeedViewData.instrument;
        }
        if ((i & 2) != 0) {
            list = newsFeedViewData.newsFeedContent;
        }
        return newsFeedViewData.copy(instrument, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<Content> component2() {
        return this.newsFeedContent;
    }

    public final NewsFeedViewData copy(Instrument instrument, List<? extends Content> newsFeedContent) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(newsFeedContent, "newsFeedContent");
        return new NewsFeedViewData(instrument, newsFeedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewsFeedViewData)) {
            return false;
        }
        NewsFeedViewData newsFeedViewData = (NewsFeedViewData) other;
        return Intrinsics.areEqual(this.instrument, newsFeedViewData.instrument) && Intrinsics.areEqual(this.newsFeedContent, newsFeedViewData.newsFeedContent);
    }

    public int hashCode() {
        return (this.instrument.hashCode() * 31) + this.newsFeedContent.hashCode();
    }

    public String toString() {
        return "NewsFeedViewData(instrument=" + this.instrument + ", newsFeedContent=" + this.newsFeedContent + ")";
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final List<Content> getNewsFeedContent() {
        return this.newsFeedContent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NewsFeedViewData(Instrument instrument, List<? extends Content> newsFeedContent) {
        super(null);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(newsFeedContent, "newsFeedContent");
        this.instrument = instrument;
        this.newsFeedContent = newsFeedContent;
        this.section = ApiStockDetail.Section.NEWS;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_news_label, getSection(), EducationTourElementIds.NEWS_HEADER_ELEMENT_ID);
        this.elementIds = CollectionsKt.mutableListOf(EducationTourElementIds.NEWS_ROW_0_ELEMENT_ID, EducationTourElementIds.NEWS_ROW_1_ELEMENT_ID, EducationTourElementIds.NEWS_ROW_2_ELEMENT_ID, EducationTourElementIds.NEWS_TICKER_ROW_0_ELEMENT_ID, EducationTourElementIds.NEWS_TICKER_ROW_1_ELEMENT_ID, EducationTourElementIds.NEWS_TICKER_ROW_2_ELEMENT_ID);
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
