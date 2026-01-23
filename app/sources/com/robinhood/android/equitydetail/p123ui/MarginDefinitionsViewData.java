package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.android.margin.experiments.MarginRatioIndicator;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.MarginRequirements;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003JK\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u0011\u0010\"\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0015¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/MarginDefinitionsViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "symbol", "fields", "", "Lcom/robinhood/models/db/MarginRequirements$MarginFieldWithDefinition;", "showMarginHub", "", "isHighRisk", "marginRatioIndicatorVariant", "Lcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;)V", "getAccountNumber", "()Ljava/lang/String;", "getSymbol", "getFields", "()Ljava/util/List;", "getShowMarginHub", "()Z", "getMarginRatioIndicatorVariant", "()Lcom/robinhood/android/margin/experiments/MarginRatioIndicator$Variant;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "showRatioBanner", "getShowRatioBanner", "showHighRiskIndicator", "getShowHighRiskIndicator", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MarginDefinitionsViewData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<MarginRequirements.MarginFieldWithDefinition> fields;
    private final HeaderData.FromResource headerData;
    private final boolean isHighRisk;
    private final MarginRatioIndicator.Variant marginRatioIndicatorVariant;
    private final ApiStockDetail.Section section;
    private final boolean showMarginHub;
    private final String symbol;

    public static /* synthetic */ MarginDefinitionsViewData copy$default(MarginDefinitionsViewData marginDefinitionsViewData, String str, String str2, List list, boolean z, boolean z2, MarginRatioIndicator.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginDefinitionsViewData.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = marginDefinitionsViewData.symbol;
        }
        if ((i & 4) != 0) {
            list = marginDefinitionsViewData.fields;
        }
        if ((i & 8) != 0) {
            z = marginDefinitionsViewData.showMarginHub;
        }
        if ((i & 16) != 0) {
            z2 = marginDefinitionsViewData.isHighRisk;
        }
        if ((i & 32) != 0) {
            variant = marginDefinitionsViewData.marginRatioIndicatorVariant;
        }
        boolean z3 = z2;
        MarginRatioIndicator.Variant variant2 = variant;
        return marginDefinitionsViewData.copy(str, str2, list, z, z3, variant2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final List<MarginRequirements.MarginFieldWithDefinition> component3() {
        return this.fields;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowMarginHub() {
        return this.showMarginHub;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsHighRisk() {
        return this.isHighRisk;
    }

    /* renamed from: component6, reason: from getter */
    public final MarginRatioIndicator.Variant getMarginRatioIndicatorVariant() {
        return this.marginRatioIndicatorVariant;
    }

    public final MarginDefinitionsViewData copy(String accountNumber, String symbol, List<MarginRequirements.MarginFieldWithDefinition> fields, boolean showMarginHub, boolean isHighRisk, MarginRatioIndicator.Variant marginRatioIndicatorVariant) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(marginRatioIndicatorVariant, "marginRatioIndicatorVariant");
        return new MarginDefinitionsViewData(accountNumber, symbol, fields, showMarginHub, isHighRisk, marginRatioIndicatorVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginDefinitionsViewData)) {
            return false;
        }
        MarginDefinitionsViewData marginDefinitionsViewData = (MarginDefinitionsViewData) other;
        return Intrinsics.areEqual(this.accountNumber, marginDefinitionsViewData.accountNumber) && Intrinsics.areEqual(this.symbol, marginDefinitionsViewData.symbol) && Intrinsics.areEqual(this.fields, marginDefinitionsViewData.fields) && this.showMarginHub == marginDefinitionsViewData.showMarginHub && this.isHighRisk == marginDefinitionsViewData.isHighRisk && this.marginRatioIndicatorVariant == marginDefinitionsViewData.marginRatioIndicatorVariant;
    }

    public int hashCode() {
        return (((((((((this.accountNumber.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.fields.hashCode()) * 31) + Boolean.hashCode(this.showMarginHub)) * 31) + Boolean.hashCode(this.isHighRisk)) * 31) + this.marginRatioIndicatorVariant.hashCode();
    }

    public String toString() {
        return "MarginDefinitionsViewData(accountNumber=" + this.accountNumber + ", symbol=" + this.symbol + ", fields=" + this.fields + ", showMarginHub=" + this.showMarginHub + ", isHighRisk=" + this.isHighRisk + ", marginRatioIndicatorVariant=" + this.marginRatioIndicatorVariant + ")";
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final List<MarginRequirements.MarginFieldWithDefinition> getFields() {
        return this.fields;
    }

    public final boolean getShowMarginHub() {
        return this.showMarginHub;
    }

    public final boolean isHighRisk() {
        return this.isHighRisk;
    }

    public final MarginRatioIndicator.Variant getMarginRatioIndicatorVariant() {
        return this.marginRatioIndicatorVariant;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginDefinitionsViewData(String accountNumber, String symbol, List<MarginRequirements.MarginFieldWithDefinition> fields, boolean z, boolean z2, MarginRatioIndicator.Variant marginRatioIndicatorVariant) {
        super(null);
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(marginRatioIndicatorVariant, "marginRatioIndicatorVariant");
        this.accountNumber = accountNumber;
        this.symbol = symbol;
        this.fields = fields;
        this.showMarginHub = z;
        this.isHighRisk = z2;
        this.marginRatioIndicatorVariant = marginRatioIndicatorVariant;
        this.section = ApiStockDetail.Section.MARGIN_REQUIREMENTS;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_margin_requirements_title, getSection(), null, 4, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public HeaderData.FromResource getHeaderData() {
        return this.headerData;
    }

    public final boolean getShowRatioBanner() {
        if (!this.isHighRisk) {
            return false;
        }
        MarginRatioIndicator.Variant variant = this.marginRatioIndicatorVariant;
        return variant == MarginRatioIndicator.Variant.VARIANT2 || variant == MarginRatioIndicator.Variant.VARIANT3;
    }

    public final boolean getShowHighRiskIndicator() {
        if (!this.isHighRisk) {
            return false;
        }
        MarginRatioIndicator.Variant variant = this.marginRatioIndicatorVariant;
        return variant == MarginRatioIndicator.Variant.VARIANT1 || variant == MarginRatioIndicator.Variant.VARIANT3;
    }
}
