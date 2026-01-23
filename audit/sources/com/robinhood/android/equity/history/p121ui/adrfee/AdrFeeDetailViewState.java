package com.robinhood.android.equity.history.p121ui.adrfee;

import com.robinhood.models.api.ApiAdrFee;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdrFeeDetailViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState;", "", "feeViewState", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$FeeViewState;", "instrumentSymbol", "", "instrumentName", "accountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "disclosureMarkdown", "<init>", "(Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$FeeViewState;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getFeeViewState", "()Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$FeeViewState;", "getInstrumentSymbol", "()Ljava/lang/String;", "getInstrumentName", "getAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getDisclosureMarkdown", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "FeeViewState", "SalesTaxItem", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdrFeeDetailViewState {
    public static final int $stable = 8;
    private final StringResource accountDisplayName;
    private final String disclosureMarkdown;
    private final FeeViewState feeViewState;
    private final String instrumentName;
    private final String instrumentSymbol;

    public static /* synthetic */ AdrFeeDetailViewState copy$default(AdrFeeDetailViewState adrFeeDetailViewState, FeeViewState feeViewState, String str, String str2, StringResource stringResource, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            feeViewState = adrFeeDetailViewState.feeViewState;
        }
        if ((i & 2) != 0) {
            str = adrFeeDetailViewState.instrumentSymbol;
        }
        if ((i & 4) != 0) {
            str2 = adrFeeDetailViewState.instrumentName;
        }
        if ((i & 8) != 0) {
            stringResource = adrFeeDetailViewState.accountDisplayName;
        }
        if ((i & 16) != 0) {
            str3 = adrFeeDetailViewState.disclosureMarkdown;
        }
        String str4 = str3;
        String str5 = str2;
        return adrFeeDetailViewState.copy(feeViewState, str, str5, stringResource, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final FeeViewState getFeeViewState() {
        return this.feeViewState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final AdrFeeDetailViewState copy(FeeViewState feeViewState, String instrumentSymbol, String instrumentName, StringResource accountDisplayName, String disclosureMarkdown) {
        return new AdrFeeDetailViewState(feeViewState, instrumentSymbol, instrumentName, accountDisplayName, disclosureMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdrFeeDetailViewState)) {
            return false;
        }
        AdrFeeDetailViewState adrFeeDetailViewState = (AdrFeeDetailViewState) other;
        return Intrinsics.areEqual(this.feeViewState, adrFeeDetailViewState.feeViewState) && Intrinsics.areEqual(this.instrumentSymbol, adrFeeDetailViewState.instrumentSymbol) && Intrinsics.areEqual(this.instrumentName, adrFeeDetailViewState.instrumentName) && Intrinsics.areEqual(this.accountDisplayName, adrFeeDetailViewState.accountDisplayName) && Intrinsics.areEqual(this.disclosureMarkdown, adrFeeDetailViewState.disclosureMarkdown);
    }

    public int hashCode() {
        FeeViewState feeViewState = this.feeViewState;
        int iHashCode = (feeViewState == null ? 0 : feeViewState.hashCode()) * 31;
        String str = this.instrumentSymbol;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.instrumentName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        StringResource stringResource = this.accountDisplayName;
        int iHashCode4 = (iHashCode3 + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        String str3 = this.disclosureMarkdown;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AdrFeeDetailViewState(feeViewState=" + this.feeViewState + ", instrumentSymbol=" + this.instrumentSymbol + ", instrumentName=" + this.instrumentName + ", accountDisplayName=" + this.accountDisplayName + ", disclosureMarkdown=" + this.disclosureMarkdown + ")";
    }

    public AdrFeeDetailViewState(FeeViewState feeViewState, String str, String str2, StringResource stringResource, String str3) {
        this.feeViewState = feeViewState;
        this.instrumentSymbol = str;
        this.instrumentName = str2;
        this.accountDisplayName = stringResource;
        this.disclosureMarkdown = str3;
    }

    public final FeeViewState getFeeViewState() {
        return this.feeViewState;
    }

    public final String getInstrumentSymbol() {
        return this.instrumentSymbol;
    }

    public final String getInstrumentName() {
        return this.instrumentName;
    }

    public final StringResource getAccountDisplayName() {
        return this.accountDisplayName;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* compiled from: AdrFeeDetailViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JY\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$FeeViewState;", "", "paidAt", "", "recordDate", "amount", "position", "rate", "state", "Lcom/robinhood/models/api/ApiAdrFee$State;", "salesTaxes", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$SalesTaxItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/ApiAdrFee$State;Lkotlinx/collections/immutable/ImmutableList;)V", "getPaidAt", "()Ljava/lang/String;", "getRecordDate", "getAmount", "getPosition", "getRate", "getState", "()Lcom/robinhood/models/api/ApiAdrFee$State;", "getSalesTaxes", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FeeViewState {
        public static final int $stable = 8;
        private final String amount;
        private final String paidAt;
        private final String position;
        private final String rate;
        private final String recordDate;
        private final ImmutableList<SalesTaxItem> salesTaxes;
        private final ApiAdrFee.State state;

        public static /* synthetic */ FeeViewState copy$default(FeeViewState feeViewState, String str, String str2, String str3, String str4, String str5, ApiAdrFee.State state, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feeViewState.paidAt;
            }
            if ((i & 2) != 0) {
                str2 = feeViewState.recordDate;
            }
            if ((i & 4) != 0) {
                str3 = feeViewState.amount;
            }
            if ((i & 8) != 0) {
                str4 = feeViewState.position;
            }
            if ((i & 16) != 0) {
                str5 = feeViewState.rate;
            }
            if ((i & 32) != 0) {
                state = feeViewState.state;
            }
            if ((i & 64) != 0) {
                immutableList = feeViewState.salesTaxes;
            }
            ApiAdrFee.State state2 = state;
            ImmutableList immutableList2 = immutableList;
            String str6 = str5;
            String str7 = str3;
            return feeViewState.copy(str, str2, str7, str4, str6, state2, immutableList2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaidAt() {
            return this.paidAt;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRecordDate() {
            return this.recordDate;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPosition() {
            return this.position;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRate() {
            return this.rate;
        }

        /* renamed from: component6, reason: from getter */
        public final ApiAdrFee.State getState() {
            return this.state;
        }

        public final ImmutableList<SalesTaxItem> component7() {
            return this.salesTaxes;
        }

        public final FeeViewState copy(String paidAt, String recordDate, String amount, String position, String rate, ApiAdrFee.State state, ImmutableList<SalesTaxItem> salesTaxes) {
            Intrinsics.checkNotNullParameter(recordDate, "recordDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(state, "state");
            return new FeeViewState(paidAt, recordDate, amount, position, rate, state, salesTaxes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeeViewState)) {
                return false;
            }
            FeeViewState feeViewState = (FeeViewState) other;
            return Intrinsics.areEqual(this.paidAt, feeViewState.paidAt) && Intrinsics.areEqual(this.recordDate, feeViewState.recordDate) && Intrinsics.areEqual(this.amount, feeViewState.amount) && Intrinsics.areEqual(this.position, feeViewState.position) && Intrinsics.areEqual(this.rate, feeViewState.rate) && this.state == feeViewState.state && Intrinsics.areEqual(this.salesTaxes, feeViewState.salesTaxes);
        }

        public int hashCode() {
            String str = this.paidAt;
            int iHashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.recordDate.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.position.hashCode()) * 31) + this.rate.hashCode()) * 31) + this.state.hashCode()) * 31;
            ImmutableList<SalesTaxItem> immutableList = this.salesTaxes;
            return iHashCode + (immutableList != null ? immutableList.hashCode() : 0);
        }

        public String toString() {
            return "FeeViewState(paidAt=" + this.paidAt + ", recordDate=" + this.recordDate + ", amount=" + this.amount + ", position=" + this.position + ", rate=" + this.rate + ", state=" + this.state + ", salesTaxes=" + this.salesTaxes + ")";
        }

        public FeeViewState(String str, String recordDate, String amount, String position, String rate, ApiAdrFee.State state, ImmutableList<SalesTaxItem> immutableList) {
            Intrinsics.checkNotNullParameter(recordDate, "recordDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(state, "state");
            this.paidAt = str;
            this.recordDate = recordDate;
            this.amount = amount;
            this.position = position;
            this.rate = rate;
            this.state = state;
            this.salesTaxes = immutableList;
        }

        public /* synthetic */ FeeViewState(String str, String str2, String str3, String str4, String str5, ApiAdrFee.State state, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, state, (i & 64) != 0 ? null : immutableList);
        }

        public final String getPaidAt() {
            return this.paidAt;
        }

        public final String getRecordDate() {
            return this.recordDate;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getPosition() {
            return this.position;
        }

        public final String getRate() {
            return this.rate;
        }

        public final ApiAdrFee.State getState() {
            return this.state;
        }

        public final ImmutableList<SalesTaxItem> getSalesTaxes() {
            return this.salesTaxes;
        }
    }

    /* compiled from: AdrFeeDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/adrfee/AdrFeeDetailViewState$SalesTaxItem;", "", "displayName", "", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "getDisplayName", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SalesTaxItem {
        public static final int $stable = 8;
        private final BigDecimal amount;
        private final String displayName;

        public static /* synthetic */ SalesTaxItem copy$default(SalesTaxItem salesTaxItem, String str, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                str = salesTaxItem.displayName;
            }
            if ((i & 2) != 0) {
                bigDecimal = salesTaxItem.amount;
            }
            return salesTaxItem.copy(str, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final SalesTaxItem copy(String displayName, BigDecimal amount) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new SalesTaxItem(displayName, amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SalesTaxItem)) {
                return false;
            }
            SalesTaxItem salesTaxItem = (SalesTaxItem) other;
            return Intrinsics.areEqual(this.displayName, salesTaxItem.displayName) && Intrinsics.areEqual(this.amount, salesTaxItem.amount);
        }

        public int hashCode() {
            return (this.displayName.hashCode() * 31) + this.amount.hashCode();
        }

        public String toString() {
            return "SalesTaxItem(displayName=" + this.displayName + ", amount=" + this.amount + ")";
        }

        public SalesTaxItem(String displayName, BigDecimal amount) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.displayName = displayName;
            this.amount = amount;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }
    }
}
