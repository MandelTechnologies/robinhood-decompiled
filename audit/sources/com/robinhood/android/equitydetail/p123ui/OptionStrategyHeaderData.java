package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.HeaderData;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p320db.OptionChainCollateral;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import com.robinhood.models.p355ui.UiOptionEvent;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003Jo\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/OptionStrategyHeaderData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "optionChainCollateral", "Lcom/robinhood/models/db/OptionChainCollateral;", "aggregateOptionPositions", "", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "aggregateOptionQuotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/AggregateOptionQuote;", "optionEventsHeldForExercise", "Lcom/robinhood/models/ui/UiOptionEvent;", "totalContracts", "Ljava/math/BigDecimal;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "inProfitAndLossAverageCostRetirement", "", "<init>", "(Lcom/robinhood/models/db/OptionChainCollateral;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/api/BrokerageAccountType;Z)V", "getOptionChainCollateral", "()Lcom/robinhood/models/db/OptionChainCollateral;", "getAggregateOptionPositions", "()Ljava/util/List;", "getAggregateOptionQuotes", "()Ljava/util/Map;", "getOptionEventsHeldForExercise", "getTotalContracts", "()Ljava/math/BigDecimal;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getInProfitAndLossAverageCostRetirement", "()Z", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "getHeaderData", "()Lcom/robinhood/android/equitydetail/ui/HeaderData$FromResource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OptionStrategyHeaderData extends DetailData {
    public static final int $stable = 8;
    private final BrokerageAccountType accountType;
    private final List<UiAggregateOptionPosition> aggregateOptionPositions;
    private final Map<UUID, AggregateOptionQuote> aggregateOptionQuotes;
    private final HeaderData.FromResource headerData;
    private final boolean inProfitAndLossAverageCostRetirement;
    private final OptionChainCollateral optionChainCollateral;
    private final List<UiOptionEvent> optionEventsHeldForExercise;
    private final ApiStockDetail.Section section;
    private final BigDecimal totalContracts;

    public static /* synthetic */ OptionStrategyHeaderData copy$default(OptionStrategyHeaderData optionStrategyHeaderData, OptionChainCollateral optionChainCollateral, List list, Map map, List list2, BigDecimal bigDecimal, BrokerageAccountType brokerageAccountType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainCollateral = optionStrategyHeaderData.optionChainCollateral;
        }
        if ((i & 2) != 0) {
            list = optionStrategyHeaderData.aggregateOptionPositions;
        }
        if ((i & 4) != 0) {
            map = optionStrategyHeaderData.aggregateOptionQuotes;
        }
        if ((i & 8) != 0) {
            list2 = optionStrategyHeaderData.optionEventsHeldForExercise;
        }
        if ((i & 16) != 0) {
            bigDecimal = optionStrategyHeaderData.totalContracts;
        }
        if ((i & 32) != 0) {
            brokerageAccountType = optionStrategyHeaderData.accountType;
        }
        if ((i & 64) != 0) {
            z = optionStrategyHeaderData.inProfitAndLossAverageCostRetirement;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        boolean z2 = z;
        BigDecimal bigDecimal2 = bigDecimal;
        Map map2 = map;
        return optionStrategyHeaderData.copy(optionChainCollateral, list, map2, list2, bigDecimal2, brokerageAccountType2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainCollateral getOptionChainCollateral() {
        return this.optionChainCollateral;
    }

    public final List<UiAggregateOptionPosition> component2() {
        return this.aggregateOptionPositions;
    }

    public final Map<UUID, AggregateOptionQuote> component3() {
        return this.aggregateOptionQuotes;
    }

    public final List<UiOptionEvent> component4() {
        return this.optionEventsHeldForExercise;
    }

    /* renamed from: component5, reason: from getter */
    public final BigDecimal getTotalContracts() {
        return this.totalContracts;
    }

    /* renamed from: component6, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInProfitAndLossAverageCostRetirement() {
        return this.inProfitAndLossAverageCostRetirement;
    }

    public final OptionStrategyHeaderData copy(OptionChainCollateral optionChainCollateral, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> aggregateOptionQuotes, List<UiOptionEvent> optionEventsHeldForExercise, BigDecimal totalContracts, BrokerageAccountType accountType, boolean inProfitAndLossAverageCostRetirement) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(totalContracts, "totalContracts");
        return new OptionStrategyHeaderData(optionChainCollateral, aggregateOptionPositions, aggregateOptionQuotes, optionEventsHeldForExercise, totalContracts, accountType, inProfitAndLossAverageCostRetirement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyHeaderData)) {
            return false;
        }
        OptionStrategyHeaderData optionStrategyHeaderData = (OptionStrategyHeaderData) other;
        return Intrinsics.areEqual(this.optionChainCollateral, optionStrategyHeaderData.optionChainCollateral) && Intrinsics.areEqual(this.aggregateOptionPositions, optionStrategyHeaderData.aggregateOptionPositions) && Intrinsics.areEqual(this.aggregateOptionQuotes, optionStrategyHeaderData.aggregateOptionQuotes) && Intrinsics.areEqual(this.optionEventsHeldForExercise, optionStrategyHeaderData.optionEventsHeldForExercise) && Intrinsics.areEqual(this.totalContracts, optionStrategyHeaderData.totalContracts) && this.accountType == optionStrategyHeaderData.accountType && this.inProfitAndLossAverageCostRetirement == optionStrategyHeaderData.inProfitAndLossAverageCostRetirement;
    }

    public int hashCode() {
        OptionChainCollateral optionChainCollateral = this.optionChainCollateral;
        int iHashCode = (((optionChainCollateral == null ? 0 : optionChainCollateral.hashCode()) * 31) + this.aggregateOptionPositions.hashCode()) * 31;
        Map<UUID, AggregateOptionQuote> map = this.aggregateOptionQuotes;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<UiOptionEvent> list = this.optionEventsHeldForExercise;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.totalContracts.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.accountType;
        return ((iHashCode3 + (brokerageAccountType != null ? brokerageAccountType.hashCode() : 0)) * 31) + Boolean.hashCode(this.inProfitAndLossAverageCostRetirement);
    }

    public String toString() {
        return "OptionStrategyHeaderData(optionChainCollateral=" + this.optionChainCollateral + ", aggregateOptionPositions=" + this.aggregateOptionPositions + ", aggregateOptionQuotes=" + this.aggregateOptionQuotes + ", optionEventsHeldForExercise=" + this.optionEventsHeldForExercise + ", totalContracts=" + this.totalContracts + ", accountType=" + this.accountType + ", inProfitAndLossAverageCostRetirement=" + this.inProfitAndLossAverageCostRetirement + ")";
    }

    public final OptionChainCollateral getOptionChainCollateral() {
        return this.optionChainCollateral;
    }

    public final List<UiAggregateOptionPosition> getAggregateOptionPositions() {
        return this.aggregateOptionPositions;
    }

    public final Map<UUID, AggregateOptionQuote> getAggregateOptionQuotes() {
        return this.aggregateOptionQuotes;
    }

    public final List<UiOptionEvent> getOptionEventsHeldForExercise() {
        return this.optionEventsHeldForExercise;
    }

    public final BigDecimal getTotalContracts() {
        return this.totalContracts;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final boolean getInProfitAndLossAverageCostRetirement() {
        return this.inProfitAndLossAverageCostRetirement;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OptionStrategyHeaderData(OptionChainCollateral optionChainCollateral, List<? extends UiAggregateOptionPosition> aggregateOptionPositions, Map<UUID, ? extends AggregateOptionQuote> map, List<UiOptionEvent> list, BigDecimal totalContracts, BrokerageAccountType brokerageAccountType, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        Intrinsics.checkNotNullParameter(totalContracts, "totalContracts");
        this.optionChainCollateral = optionChainCollateral;
        this.aggregateOptionPositions = aggregateOptionPositions;
        this.aggregateOptionQuotes = map;
        this.optionEventsHeldForExercise = list;
        this.totalContracts = totalContracts;
        this.accountType = brokerageAccountType;
        this.inProfitAndLossAverageCostRetirement = z;
        this.section = ApiStockDetail.Section.OPTIONS;
        this.headerData = new HeaderData.FromResource(C15314R.string.instrument_detail_options_label, getSection(), null, 4, null);
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
