package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.directipo.models.p292db.IpoQuote;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/IpoGraphLayoutData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrument", "Lcom/robinhood/models/db/Instrument;", "ipoQuote", "Lcom/robinhood/directipo/models/db/IpoQuote;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/directipo/models/db/IpoQuote;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getIpoQuote", "()Lcom/robinhood/directipo/models/db/IpoQuote;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IpoGraphLayoutData extends DetailData {
    public static final int $stable = 8;
    private final Instrument instrument;
    private final IpoQuote ipoQuote;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ IpoGraphLayoutData copy$default(IpoGraphLayoutData ipoGraphLayoutData, Instrument instrument, IpoQuote ipoQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = ipoGraphLayoutData.instrument;
        }
        if ((i & 2) != 0) {
            ipoQuote = ipoGraphLayoutData.ipoQuote;
        }
        return ipoGraphLayoutData.copy(instrument, ipoQuote);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final IpoQuote getIpoQuote() {
        return this.ipoQuote;
    }

    public final IpoGraphLayoutData copy(Instrument instrument, IpoQuote ipoQuote) {
        Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
        return new IpoGraphLayoutData(instrument, ipoQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpoGraphLayoutData)) {
            return false;
        }
        IpoGraphLayoutData ipoGraphLayoutData = (IpoGraphLayoutData) other;
        return Intrinsics.areEqual(this.instrument, ipoGraphLayoutData.instrument) && Intrinsics.areEqual(this.ipoQuote, ipoGraphLayoutData.ipoQuote);
    }

    public int hashCode() {
        Instrument instrument = this.instrument;
        return ((instrument == null ? 0 : instrument.hashCode()) * 31) + this.ipoQuote.hashCode();
    }

    public String toString() {
        return "IpoGraphLayoutData(instrument=" + this.instrument + ", ipoQuote=" + this.ipoQuote + ")";
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final IpoQuote getIpoQuote() {
        return this.ipoQuote;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoGraphLayoutData(Instrument instrument, IpoQuote ipoQuote) {
        super(null);
        Intrinsics.checkNotNullParameter(ipoQuote, "ipoQuote");
        this.instrument = instrument;
        this.ipoQuote = ipoQuote;
        this.section = ApiStockDetail.Section.CHART;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }
}
