package com.robinhood.android.equitydetail.p123ui.analystoverview;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRow3;
import com.robinhood.android.equitydetail.p123ui.component.SdpDataRowType;
import com.robinhood.models.api.ApiAnalystOverview;
import com.robinhood.models.p320db.AnalystOverview;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.util.Money;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import p479j$.time.Instant;

/* compiled from: AnalystOverviewData.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u001d\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u00105\u001a\u00020\u00112\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u001fHÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000fR\u0014\u0010&\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010(\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000fR\u0014\u0010*\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u0014\u0010,\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000fR\u0014\u0010.\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001dR\u0014\u00100\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u000f¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystoverview/AnalystOverviewData;", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "analystOverview", "Lcom/robinhood/models/db/AnalystOverview;", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/AnalystOverview;)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getAnalystOverview", "()Lcom/robinhood/models/db/AnalystOverview;", "title", "Lcom/robinhood/utils/resource/StringResource;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "showNewDot", "", "getShowNewDot", "()Z", "updatedAtText", "getUpdatedAtText", "dataRows", "", "Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "getDataRows", "()Ljava/util/List;", "morningstarRatingRowData", "getMorningstarRatingRowData", "()Lcom/robinhood/android/equitydetail/ui/component/SdpDataRowState;", "filledStars", "", "getFilledStars", "()I", "moatRowData", "getMoatRowData", "moatValueText", "getMoatValueText", "fairValueRowData", "getFairValueRowData", "fairValueText", "getFairValueText", "uncertaintyRowData", "getUncertaintyRowData", "uncertaintyText", "getUncertaintyText", "stewardshipRowData", "getStewardshipRowData", "stewardshipText", "getStewardshipText", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class AnalystOverviewData {
    public static final int $stable = 8;
    private final AnalystOverview analystOverview;
    private final Instrument instrument;

    /* compiled from: AnalystOverviewData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ApiAnalystOverview.EconomicMoat.values().length];
            try {
                iArr[ApiAnalystOverview.EconomicMoat.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAnalystOverview.EconomicMoat.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAnalystOverview.EconomicMoat.WIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiAnalystOverview.Uncertainty.values().length];
            try {
                iArr2[ApiAnalystOverview.Uncertainty.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiAnalystOverview.Uncertainty.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiAnalystOverview.Uncertainty.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiAnalystOverview.Uncertainty.VERY_HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiAnalystOverview.Uncertainty.EXTREME.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiAnalystOverview.Stewardship.values().length];
            try {
                iArr3[ApiAnalystOverview.Stewardship.POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiAnalystOverview.Stewardship.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiAnalystOverview.Stewardship.EXEMPLARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static /* synthetic */ AnalystOverviewData copy$default(AnalystOverviewData analystOverviewData, Instrument instrument, AnalystOverview analystOverview, int i, Object obj) {
        if ((i & 1) != 0) {
            instrument = analystOverviewData.instrument;
        }
        if ((i & 2) != 0) {
            analystOverview = analystOverviewData.analystOverview;
        }
        return analystOverviewData.copy(instrument, analystOverview);
    }

    /* renamed from: component1, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final AnalystOverview getAnalystOverview() {
        return this.analystOverview;
    }

    public final AnalystOverviewData copy(Instrument instrument, AnalystOverview analystOverview) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(analystOverview, "analystOverview");
        return new AnalystOverviewData(instrument, analystOverview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalystOverviewData)) {
            return false;
        }
        AnalystOverviewData analystOverviewData = (AnalystOverviewData) other;
        return Intrinsics.areEqual(this.instrument, analystOverviewData.instrument) && Intrinsics.areEqual(this.analystOverview, analystOverviewData.analystOverview);
    }

    public int hashCode() {
        return (this.instrument.hashCode() * 31) + this.analystOverview.hashCode();
    }

    public String toString() {
        return "AnalystOverviewData(instrument=" + this.instrument + ", analystOverview=" + this.analystOverview + ")";
    }

    public AnalystOverviewData(Instrument instrument, AnalystOverview analystOverview) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(analystOverview, "analystOverview");
        this.instrument = instrument;
        this.analystOverview = analystOverview;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final AnalystOverview getAnalystOverview() {
        return this.analystOverview;
    }

    public final StringResource getTitle() {
        String reportTitle = this.analystOverview.getReportTitle();
        if (reportTitle != null) {
            return StringResource.INSTANCE.invoke(reportTitle);
        }
        return null;
    }

    public final boolean getShowNewDot() {
        Integer daysSinceUpdated = this.analystOverview.getDaysSinceUpdated();
        return daysSinceUpdated != null && daysSinceUpdated.intValue() == 0;
    }

    public final StringResource getUpdatedAtText() {
        Integer daysSinceUpdated = this.analystOverview.getDaysSinceUpdated();
        if (daysSinceUpdated == null) {
            return null;
        }
        if (daysSinceUpdated.intValue() == 0) {
            return StringResource.INSTANCE.invoke(C15314R.string.instrument_detail_analyst_report_updated_at_today, new Object[0]);
        }
        if (daysSinceUpdated.intValue() == 1) {
            return StringResource.INSTANCE.invoke(C15314R.string.instrument_detail_analyst_report_updated_at_yesterday, new Object[0]);
        }
        if (new PrimitiveRanges2(2, 7).contains(daysSinceUpdated.intValue())) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C15314R.string.instrument_detail_analyst_report_updated_at_this_week;
            Integer daysSinceUpdated2 = this.analystOverview.getDaysSinceUpdated();
            Intrinsics.checkNotNull(daysSinceUpdated2);
            return companion.invoke(i, daysSinceUpdated2);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i2 = C15314R.string.instrument_detail_analyst_report_updated_at;
        InstantFormatter instantFormatter = InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE;
        Instant updatedAtForDisplay = this.analystOverview.getUpdatedAtForDisplay();
        Intrinsics.checkNotNull(updatedAtForDisplay);
        return companion2.invoke(i2, instantFormatter.format(updatedAtForDisplay));
    }

    public final List<SdpDataRow3> getDataRows() {
        return CollectionsKt.listOf((Object[]) new SdpDataRow3[]{getMorningstarRatingRowData(), getMoatRowData(), getFairValueRowData(), getUncertaintyRowData(), getStewardshipRowData()});
    }

    private final SdpDataRow3 getMorningstarRatingRowData() {
        return new SdpDataRow3.StarRating(SdpDataRowType.AnalystOverviewMorningstarRating, AnalystOverviewData2.getMorningstarRowDataTestTag(), getFilledStars());
    }

    private final int getFilledStars() {
        Integer starRating = this.analystOverview.getStarRating();
        if (starRating != null) {
            return starRating.intValue();
        }
        return 0;
    }

    private final SdpDataRow3 getMoatRowData() {
        return new SdpDataRow3.Default(SdpDataRowType.AnalystOverviewEconomicMoat, AnalystOverviewData2.getMoatRowDataTestTag(), getMoatValueText(), null, null, null, 56, null);
    }

    private final StringResource getMoatValueText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        ApiAnalystOverview.EconomicMoat economicMoat = this.analystOverview.getEconomicMoat();
        int i2 = economicMoat == null ? -1 : WhenMappings.$EnumSwitchMapping$0[economicMoat.ordinal()];
        if (i2 == -1) {
            i = C41827R.string.general_label_n_a;
        } else if (i2 == 1) {
            i = C15314R.string.analyst_report_moat_none;
        } else if (i2 == 2) {
            i = C15314R.string.analyst_report_moat_narrow;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C15314R.string.analyst_report_moat_wide;
        }
        return companion.invoke(i, new Object[0]);
    }

    private final SdpDataRow3 getFairValueRowData() {
        return new SdpDataRow3.Default(SdpDataRowType.AnalystOverviewFairValue, AnalystOverviewData2.getFairValueRowDataTestTag(), getFairValueText(), null, null, null, 56, null);
    }

    private final StringResource getFairValueText() {
        String str;
        StringResource stringResourceInvoke;
        Money fairValue = this.analystOverview.getFairValue();
        return (fairValue == null || (str = Money.format$default(fairValue, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(str)) == null) ? StringResource.INSTANCE.invoke(C41827R.string.general_label_n_a, new Object[0]) : stringResourceInvoke;
    }

    private final SdpDataRow3 getUncertaintyRowData() {
        return new SdpDataRow3.Default(SdpDataRowType.AnalystOverviewUncertainty, AnalystOverviewData2.getUncertaintyRowDataTestTag(), getUncertaintyText(), null, null, null, 56, null);
    }

    private final StringResource getUncertaintyText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        ApiAnalystOverview.Uncertainty uncertainty = this.analystOverview.getUncertainty();
        int i2 = uncertainty == null ? -1 : WhenMappings.$EnumSwitchMapping$1[uncertainty.ordinal()];
        if (i2 == -1) {
            i = C41827R.string.general_label_n_a;
        } else if (i2 == 1) {
            i = C15314R.string.analyst_report_uncertainty_low;
        } else if (i2 == 2) {
            i = C15314R.string.analyst_report_uncertainty_medium;
        } else if (i2 == 3) {
            i = C15314R.string.analyst_report_uncertainty_high;
        } else if (i2 == 4) {
            i = C15314R.string.analyst_report_uncertainty_very_high;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C15314R.string.analyst_report_uncertainty_extreme;
        }
        return companion.invoke(i, new Object[0]);
    }

    private final SdpDataRow3 getStewardshipRowData() {
        return new SdpDataRow3.Default(SdpDataRowType.AnalystOverviewStewardship, AnalystOverviewData2.getStewardshipRowDataTestTag(), getStewardshipText(), null, null, null, 56, null);
    }

    private final StringResource getStewardshipText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        ApiAnalystOverview.Stewardship stewardship = this.analystOverview.getStewardship();
        int i2 = stewardship == null ? -1 : WhenMappings.$EnumSwitchMapping$2[stewardship.ordinal()];
        if (i2 == -1) {
            i = C41827R.string.general_label_n_a;
        } else if (i2 == 1) {
            i = C15314R.string.analyst_report_stewardship_poor;
        } else if (i2 == 2) {
            i = C15314R.string.analyst_report_stewardship_standard;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C15314R.string.analyst_report_stewardship_exemplary;
        }
        return companion.invoke(i, new Object[0]);
    }
}
