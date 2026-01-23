package com.robinhood.android.fund.breakdown;

import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FundBreakdownViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState$Loaded;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState$Loading;", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface FundBreakdownViewState {

    /* compiled from: FundBreakdownViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState$Loading;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements FundBreakdownViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1668127904;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: FundBreakdownViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState$Loaded;", "Lcom/robinhood/android/fund/breakdown/FundBreakdownViewState;", "instrumentSymbol", "", "lastUpdatedString", "Lcom/robinhood/utils/resource/StringResource;", CryptoDetailSource.HOLDINGS, "", "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "focusedHolding", "weightedAverageCashYield", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;Lcom/robinhood/models/db/bonfire/etp/EtpHolding;Lcom/robinhood/utils/resource/StringResource;)V", "getInstrumentSymbol", "()Ljava/lang/String;", "getLastUpdatedString", "()Lcom/robinhood/utils/resource/StringResource;", "getHoldings", "()Ljava/util/List;", "getFocusedHolding", "()Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "getWeightedAverageCashYield", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-fund-breakdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements FundBreakdownViewState {
        public static final int $stable = 8;
        private final EtpHolding focusedHolding;
        private final List<EtpHolding> holdings;
        private final String instrumentSymbol;
        private final StringResource lastUpdatedString;
        private final StringResource weightedAverageCashYield;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, StringResource stringResource, List list, EtpHolding etpHolding, StringResource stringResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.instrumentSymbol;
            }
            if ((i & 2) != 0) {
                stringResource = loaded.lastUpdatedString;
            }
            if ((i & 4) != 0) {
                list = loaded.holdings;
            }
            if ((i & 8) != 0) {
                etpHolding = loaded.focusedHolding;
            }
            if ((i & 16) != 0) {
                stringResource2 = loaded.weightedAverageCashYield;
            }
            StringResource stringResource3 = stringResource2;
            List list2 = list;
            return loaded.copy(str, stringResource, list2, etpHolding, stringResource3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getLastUpdatedString() {
            return this.lastUpdatedString;
        }

        public final List<EtpHolding> component3() {
            return this.holdings;
        }

        /* renamed from: component4, reason: from getter */
        public final EtpHolding getFocusedHolding() {
            return this.focusedHolding;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getWeightedAverageCashYield() {
            return this.weightedAverageCashYield;
        }

        public final Loaded copy(String instrumentSymbol, StringResource lastUpdatedString, List<EtpHolding> holdings, EtpHolding focusedHolding, StringResource weightedAverageCashYield) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(holdings, "holdings");
            return new Loaded(instrumentSymbol, lastUpdatedString, holdings, focusedHolding, weightedAverageCashYield);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.instrumentSymbol, loaded.instrumentSymbol) && Intrinsics.areEqual(this.lastUpdatedString, loaded.lastUpdatedString) && Intrinsics.areEqual(this.holdings, loaded.holdings) && Intrinsics.areEqual(this.focusedHolding, loaded.focusedHolding) && Intrinsics.areEqual(this.weightedAverageCashYield, loaded.weightedAverageCashYield);
        }

        public int hashCode() {
            int iHashCode = this.instrumentSymbol.hashCode() * 31;
            StringResource stringResource = this.lastUpdatedString;
            int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.holdings.hashCode()) * 31;
            EtpHolding etpHolding = this.focusedHolding;
            int iHashCode3 = (iHashCode2 + (etpHolding == null ? 0 : etpHolding.hashCode())) * 31;
            StringResource stringResource2 = this.weightedAverageCashYield;
            return iHashCode3 + (stringResource2 != null ? stringResource2.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(instrumentSymbol=" + this.instrumentSymbol + ", lastUpdatedString=" + this.lastUpdatedString + ", holdings=" + this.holdings + ", focusedHolding=" + this.focusedHolding + ", weightedAverageCashYield=" + this.weightedAverageCashYield + ")";
        }

        public Loaded(String instrumentSymbol, StringResource stringResource, List<EtpHolding> holdings, EtpHolding etpHolding, StringResource stringResource2) {
            Intrinsics.checkNotNullParameter(instrumentSymbol, "instrumentSymbol");
            Intrinsics.checkNotNullParameter(holdings, "holdings");
            this.instrumentSymbol = instrumentSymbol;
            this.lastUpdatedString = stringResource;
            this.holdings = holdings;
            this.focusedHolding = etpHolding;
            this.weightedAverageCashYield = stringResource2;
        }

        public final String getInstrumentSymbol() {
            return this.instrumentSymbol;
        }

        public final StringResource getLastUpdatedString() {
            return this.lastUpdatedString;
        }

        public final List<EtpHolding> getHoldings() {
            return this.holdings;
        }

        public final EtpHolding getFocusedHolding() {
            return this.focusedHolding;
        }

        public final StringResource getWeightedAverageCashYield() {
            return this.weightedAverageCashYield;
        }
    }
}
