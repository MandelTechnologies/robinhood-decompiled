package com.robinhood.android.equitydetail.p123ui;

import com.robinhood.models.api.bonfire.ApiStockDetail;
import com.robinhood.models.p320db.AggregateOptionQuote;
import com.robinhood.models.p355ui.UiAggregateOptionPosition;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailData.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/OptionStrategyViewData;", "Lcom/robinhood/android/equitydetail/ui/DetailData;", "accountNumber", "", "uiAggregateOptionPosition", "Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "aggregateOptionPositions", "", "Ljava/util/UUID;", "optionQuote", "Lcom/robinhood/models/db/AggregateOptionQuote;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/UiAggregateOptionPosition;Ljava/util/List;Lcom/robinhood/models/db/AggregateOptionQuote;)V", "getAccountNumber", "()Ljava/lang/String;", "getUiAggregateOptionPosition", "()Lcom/robinhood/models/ui/UiAggregateOptionPosition;", "getAggregateOptionPositions", "()Ljava/util/List;", "getOptionQuote", "()Lcom/robinhood/models/db/AggregateOptionQuote;", "section", "Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "getSection", "()Lcom/robinhood/models/api/bonfire/ApiStockDetail$Section;", "headerData", "", "getHeaderData", "()Ljava/lang/Void;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OptionStrategyViewData extends DetailData {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<UUID> aggregateOptionPositions;
    private final Void headerData;
    private final AggregateOptionQuote optionQuote;
    private final ApiStockDetail.Section section;
    private final UiAggregateOptionPosition uiAggregateOptionPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionStrategyViewData copy$default(OptionStrategyViewData optionStrategyViewData, String str, UiAggregateOptionPosition uiAggregateOptionPosition, List list, AggregateOptionQuote aggregateOptionQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionStrategyViewData.accountNumber;
        }
        if ((i & 2) != 0) {
            uiAggregateOptionPosition = optionStrategyViewData.uiAggregateOptionPosition;
        }
        if ((i & 4) != 0) {
            list = optionStrategyViewData.aggregateOptionPositions;
        }
        if ((i & 8) != 0) {
            aggregateOptionQuote = optionStrategyViewData.optionQuote;
        }
        return optionStrategyViewData.copy(str, uiAggregateOptionPosition, list, aggregateOptionQuote);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAggregateOptionPosition getUiAggregateOptionPosition() {
        return this.uiAggregateOptionPosition;
    }

    public final List<UUID> component3() {
        return this.aggregateOptionPositions;
    }

    /* renamed from: component4, reason: from getter */
    public final AggregateOptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    public final OptionStrategyViewData copy(String accountNumber, UiAggregateOptionPosition uiAggregateOptionPosition, List<UUID> aggregateOptionPositions, AggregateOptionQuote optionQuote) {
        Intrinsics.checkNotNullParameter(uiAggregateOptionPosition, "uiAggregateOptionPosition");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        return new OptionStrategyViewData(accountNumber, uiAggregateOptionPosition, aggregateOptionPositions, optionQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStrategyViewData)) {
            return false;
        }
        OptionStrategyViewData optionStrategyViewData = (OptionStrategyViewData) other;
        return Intrinsics.areEqual(this.accountNumber, optionStrategyViewData.accountNumber) && Intrinsics.areEqual(this.uiAggregateOptionPosition, optionStrategyViewData.uiAggregateOptionPosition) && Intrinsics.areEqual(this.aggregateOptionPositions, optionStrategyViewData.aggregateOptionPositions) && Intrinsics.areEqual(this.optionQuote, optionStrategyViewData.optionQuote);
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.uiAggregateOptionPosition.hashCode()) * 31) + this.aggregateOptionPositions.hashCode()) * 31;
        AggregateOptionQuote aggregateOptionQuote = this.optionQuote;
        return iHashCode + (aggregateOptionQuote != null ? aggregateOptionQuote.hashCode() : 0);
    }

    public String toString() {
        return "OptionStrategyViewData(accountNumber=" + this.accountNumber + ", uiAggregateOptionPosition=" + this.uiAggregateOptionPosition + ", aggregateOptionPositions=" + this.aggregateOptionPositions + ", optionQuote=" + this.optionQuote + ")";
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public /* bridge */ /* synthetic */ DetailData getHeaderData() {
        return (DetailData) getHeaderData();
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UiAggregateOptionPosition getUiAggregateOptionPosition() {
        return this.uiAggregateOptionPosition;
    }

    public final List<UUID> getAggregateOptionPositions() {
        return this.aggregateOptionPositions;
    }

    public final AggregateOptionQuote getOptionQuote() {
        return this.optionQuote;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyViewData(String str, UiAggregateOptionPosition uiAggregateOptionPosition, List<UUID> aggregateOptionPositions, AggregateOptionQuote aggregateOptionQuote) {
        super(null);
        Intrinsics.checkNotNullParameter(uiAggregateOptionPosition, "uiAggregateOptionPosition");
        Intrinsics.checkNotNullParameter(aggregateOptionPositions, "aggregateOptionPositions");
        this.accountNumber = str;
        this.uiAggregateOptionPosition = uiAggregateOptionPosition;
        this.aggregateOptionPositions = aggregateOptionPositions;
        this.optionQuote = aggregateOptionQuote;
        this.section = ApiStockDetail.Section.OPTIONS;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.DetailData
    public ApiStockDetail.Section getSection() {
        return this.section;
    }

    public Void getHeaderData() {
        return this.headerData;
    }
}
