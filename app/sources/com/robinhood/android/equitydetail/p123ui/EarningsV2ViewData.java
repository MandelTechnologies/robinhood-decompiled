package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.YearQuarter;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/EarningsV2ViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "instrumentUuid", "Ljava/util/UUID;", "earnings", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;)V", "getInstrumentUuid", "()Ljava/util/UUID;", "getEarnings", "()Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/DetailData;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EarningsV2ViewData extends DetailData {
    public static final int $stable = 8;
    private final UiEarnings earnings;
    private final UUID instrumentUuid;
    private final ApiStockDetail.Section section;

    public static /* synthetic */ EarningsV2ViewData copy$default(EarningsV2ViewData earningsV2ViewData, UUID uuid, UiEarnings uiEarnings, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = earningsV2ViewData.instrumentUuid;
        }
        if ((i & 2) != 0) {
            uiEarnings = earningsV2ViewData.earnings;
        }
        return earningsV2ViewData.copy(uuid, uiEarnings);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentUuid() {
        return this.instrumentUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final UiEarnings getEarnings() {
        return this.earnings;
    }

    public final EarningsV2ViewData copy(UUID instrumentUuid, UiEarnings earnings) {
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Intrinsics.checkNotNullParameter(earnings, "earnings");
        return new EarningsV2ViewData(instrumentUuid, earnings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarningsV2ViewData)) {
            return false;
        }
        EarningsV2ViewData earningsV2ViewData = (EarningsV2ViewData) other;
        return Intrinsics.areEqual(this.instrumentUuid, earningsV2ViewData.instrumentUuid) && Intrinsics.areEqual(this.earnings, earningsV2ViewData.earnings);
    }

    public int hashCode() {
        return (this.instrumentUuid.hashCode() * 31) + this.earnings.hashCode();
    }

    public String toString() {
        return "EarningsV2ViewData(instrumentUuid=" + this.instrumentUuid + ", earnings=" + this.earnings + ")";
    }

    public final UUID getInstrumentUuid() {
        return this.instrumentUuid;
    }

    public final UiEarnings getEarnings() {
        return this.earnings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsV2ViewData(UUID instrumentUuid, UiEarnings earnings) {
        super(null);
        Intrinsics.checkNotNullParameter(instrumentUuid, "instrumentUuid");
        Intrinsics.checkNotNullParameter(earnings, "earnings");
        this.instrumentUuid = instrumentUuid;
        this.earnings = earnings;
        this.section = ApiStockDetail.Section.EARNINGS;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public DetailData getHeaderData() {
        YearQuarter yearQuarter;
        Earning mostRecentEarning = this.earnings.getMostRecentEarning();
        Integer numValueOf = (mostRecentEarning == null || (yearQuarter = mostRecentEarning.getYearQuarter()) == null) ? null : Integer.valueOf(yearQuarter.getQuarterValue());
        if (numValueOf != null) {
            return new HeaderData.FromResource(C15314R.string.earnings_title, CollectionsKt.listOf(numValueOf), getSection(), null, 8, null);
        }
        return new HeaderData.FromResource(C15314R.string.earnings_title_default, getSection(), null, 4, null);
    }
}
