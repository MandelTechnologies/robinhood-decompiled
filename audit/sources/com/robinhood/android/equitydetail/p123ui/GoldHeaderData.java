package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import kotlin.Metadata;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/GoldHeaderData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "textResId", "", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "<init>", "(ILcom/robinhood/models/api/bonfire/ApiStockDetail$Section;)V", "getTextResId", "()I", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "getHeaderData$annotations", "()V", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/DetailData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GoldHeaderData extends DetailData {
    public static final int $stable = 8;
    private final DetailData headerData;
    private final ApiStockDetail.Section section;
    private final int textResId;

    public static /* synthetic */ GoldHeaderData copy$default(GoldHeaderData goldHeaderData, int i, ApiStockDetail.Section section, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = goldHeaderData.textResId;
        }
        if ((i2 & 2) != 0) {
            section = goldHeaderData.section;
        }
        return goldHeaderData.copy(i, section);
    }

    public static /* synthetic */ void getHeaderData$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextResId() {
        return this.textResId;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiStockDetail.Section getSection() {
        return this.section;
    }

    public final GoldHeaderData copy(int textResId, ApiStockDetail.Section section) {
        return new GoldHeaderData(textResId, section);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldHeaderData)) {
            return false;
        }
        GoldHeaderData goldHeaderData = (GoldHeaderData) other;
        return this.textResId == goldHeaderData.textResId && this.section == goldHeaderData.section;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.textResId) * 31;
        ApiStockDetail.Section section = this.section;
        return iHashCode + (section == null ? 0 : section.hashCode());
    }

    public String toString() {
        return "GoldHeaderData(textResId=" + this.textResId + ", section=" + this.section + ")";
    }

    public final int getTextResId() {
        return this.textResId;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    public GoldHeaderData(int i, ApiStockDetail.Section section) {
        super(null);
        this.textResId = i;
        this.section = section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public final DetailData getHeaderData() {
        return this.headerData;
    }
}
