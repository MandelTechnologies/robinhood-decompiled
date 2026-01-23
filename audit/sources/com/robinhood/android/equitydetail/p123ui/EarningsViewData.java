package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.threeten.extra.YearQuarter;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/EarningsViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "<init>", "()V", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "earningsTitle", "Lcom/robinhood/android/equitydetail/ui/HeaderData;", "getEarningsTitle", "()Lcom/robinhood/android/equitydetail/ui/HeaderData;", "headerData", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/DetailData;", "Brokeback", "Lcom/robinhood/android/equitydetail/ui/EarningsViewData$Brokeback;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class EarningsViewData extends DetailData {
    public static final int $stable = 8;
    private final ApiStockDetail.Section section;

    public /* synthetic */ EarningsViewData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract HeaderData getEarningsTitle();

    private EarningsViewData() {
        super(null);
        this.section = ApiStockDetail.Section.EARNINGS;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public DetailData getHeaderData() {
        HeaderData earningsTitle = getEarningsTitle();
        return earningsTitle != null ? earningsTitle : new HeaderData.FromResource(C15314R.string.earnings_title_default, getSection(), null, 4, null);
    }

    /* compiled from: DetailData.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/EarningsViewData$Brokeback;", "Lcom/robinhood/android/equitydetail/ui/EarningsViewData;", "earnings", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "<init>", "(Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;)V", "getEarnings", "()Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "earningsTitle", "Lcom/robinhood/android/equitydetail/ui/HeaderData;", "getEarningsTitle", "()Lcom/robinhood/android/equitydetail/ui/HeaderData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Brokeback extends EarningsViewData {
        public static final int $stable = 8;
        private final UiEarnings earnings;

        public static /* synthetic */ Brokeback copy$default(Brokeback brokeback, UiEarnings uiEarnings, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEarnings = brokeback.earnings;
            }
            return brokeback.copy(uiEarnings);
        }

        /* renamed from: component1, reason: from getter */
        public final UiEarnings getEarnings() {
            return this.earnings;
        }

        public final Brokeback copy(UiEarnings earnings) {
            Intrinsics.checkNotNullParameter(earnings, "earnings");
            return new Brokeback(earnings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Brokeback) && Intrinsics.areEqual(this.earnings, ((Brokeback) other).earnings);
        }

        public int hashCode() {
            return this.earnings.hashCode();
        }

        public String toString() {
            return "Brokeback(earnings=" + this.earnings + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Brokeback(UiEarnings earnings) {
            super(null);
            Intrinsics.checkNotNullParameter(earnings, "earnings");
            this.earnings = earnings;
        }

        public final UiEarnings getEarnings() {
            return this.earnings;
        }

        @Override // com.robinhood.android.equitydetail.p123ui.EarningsViewData
        public HeaderData getEarningsTitle() {
            YearQuarter yearQuarter;
            Earning mostRecentEarning = this.earnings.getMostRecentEarning();
            if (mostRecentEarning == null || (yearQuarter = mostRecentEarning.getYearQuarter()) == null) {
                return null;
            }
            return new HeaderData.FromResource(C15314R.string.earnings_title, CollectionsKt.listOf(Integer.valueOf(yearQuarter.getQuarterValue())), getSection(), null, 8, null);
        }
    }
}
