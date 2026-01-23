package com.robinhood.shared.crypto.transfer.verification.exchange;

import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: ExchangeDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState;", "", "enabled", "", "loading", "results", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row;", "query", "", "selection", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "<init>", "(ZZLkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;)V", "getEnabled", "()Z", "getLoading", "getResults", "()Lkotlinx/collections/immutable/ImmutableList;", "getQuery", "()Ljava/lang/String;", "getSelection", "()Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Row", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ExchangeViewState {
    public static final int $stable = 8;
    private final boolean enabled;
    private final boolean loading;
    private final String query;
    private final ImmutableList<Row> results;
    private final ApiCryptoVaspResponse.Vasp selection;

    public static /* synthetic */ ExchangeViewState copy$default(ExchangeViewState exchangeViewState, boolean z, boolean z2, ImmutableList immutableList, String str, ApiCryptoVaspResponse.Vasp vasp, int i, Object obj) {
        if ((i & 1) != 0) {
            z = exchangeViewState.enabled;
        }
        if ((i & 2) != 0) {
            z2 = exchangeViewState.loading;
        }
        if ((i & 4) != 0) {
            immutableList = exchangeViewState.results;
        }
        if ((i & 8) != 0) {
            str = exchangeViewState.query;
        }
        if ((i & 16) != 0) {
            vasp = exchangeViewState.selection;
        }
        ApiCryptoVaspResponse.Vasp vasp2 = vasp;
        ImmutableList immutableList2 = immutableList;
        return exchangeViewState.copy(z, z2, immutableList2, str, vasp2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    public final ImmutableList<Row> component3() {
        return this.results;
    }

    /* renamed from: component4, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiCryptoVaspResponse.Vasp getSelection() {
        return this.selection;
    }

    public final ExchangeViewState copy(boolean enabled, boolean loading, ImmutableList<? extends Row> results, String query, ApiCryptoVaspResponse.Vasp selection) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(query, "query");
        return new ExchangeViewState(enabled, loading, results, query, selection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeViewState)) {
            return false;
        }
        ExchangeViewState exchangeViewState = (ExchangeViewState) other;
        return this.enabled == exchangeViewState.enabled && this.loading == exchangeViewState.loading && Intrinsics.areEqual(this.results, exchangeViewState.results) && Intrinsics.areEqual(this.query, exchangeViewState.query) && Intrinsics.areEqual(this.selection, exchangeViewState.selection);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.loading)) * 31) + this.results.hashCode()) * 31) + this.query.hashCode()) * 31;
        ApiCryptoVaspResponse.Vasp vasp = this.selection;
        return iHashCode + (vasp == null ? 0 : vasp.hashCode());
    }

    public String toString() {
        return "ExchangeViewState(enabled=" + this.enabled + ", loading=" + this.loading + ", results=" + this.results + ", query=" + this.query + ", selection=" + this.selection + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExchangeViewState(boolean z, boolean z2, ImmutableList<? extends Row> results, String query, ApiCryptoVaspResponse.Vasp vasp) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(query, "query");
        this.enabled = z;
        this.loading = z2;
        this.results = results;
        this.query = query;
        this.selection = vasp;
    }

    public /* synthetic */ ExchangeViewState(boolean z, boolean z2, ImmutableList immutableList, String str, ApiCryptoVaspResponse.Vasp vasp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, immutableList, str, (i & 16) != 0 ? null : vasp);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final ImmutableList<Row> getResults() {
        return this.results;
    }

    public final String getQuery() {
        return this.query;
    }

    public final ApiCryptoVaspResponse.Vasp getSelection() {
        return this.selection;
    }

    /* compiled from: ExchangeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row;", "", "Vasp", "Empty", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row$Empty;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row$Vasp;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Row {

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row$Vasp;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row;", "bentoBaseRowState", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "vasp", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;)V", "getBentoBaseRowState", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "getVasp", "()Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Vasp implements Row {
            public static final int $stable = 8;
            private final BentoBaseRowState bentoBaseRowState;
            private final ApiCryptoVaspResponse.Vasp vasp;

            public static /* synthetic */ Vasp copy$default(Vasp vasp, BentoBaseRowState bentoBaseRowState, ApiCryptoVaspResponse.Vasp vasp2, int i, Object obj) {
                if ((i & 1) != 0) {
                    bentoBaseRowState = vasp.bentoBaseRowState;
                }
                if ((i & 2) != 0) {
                    vasp2 = vasp.vasp;
                }
                return vasp.copy(bentoBaseRowState, vasp2);
            }

            /* renamed from: component1, reason: from getter */
            public final BentoBaseRowState getBentoBaseRowState() {
                return this.bentoBaseRowState;
            }

            /* renamed from: component2, reason: from getter */
            public final ApiCryptoVaspResponse.Vasp getVasp() {
                return this.vasp;
            }

            public final Vasp copy(BentoBaseRowState bentoBaseRowState, ApiCryptoVaspResponse.Vasp vasp) {
                Intrinsics.checkNotNullParameter(bentoBaseRowState, "bentoBaseRowState");
                Intrinsics.checkNotNullParameter(vasp, "vasp");
                return new Vasp(bentoBaseRowState, vasp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Vasp)) {
                    return false;
                }
                Vasp vasp = (Vasp) other;
                return Intrinsics.areEqual(this.bentoBaseRowState, vasp.bentoBaseRowState) && Intrinsics.areEqual(this.vasp, vasp.vasp);
            }

            public int hashCode() {
                return (this.bentoBaseRowState.hashCode() * 31) + this.vasp.hashCode();
            }

            public String toString() {
                return "Vasp(bentoBaseRowState=" + this.bentoBaseRowState + ", vasp=" + this.vasp + ")";
            }

            public Vasp(BentoBaseRowState bentoBaseRowState, ApiCryptoVaspResponse.Vasp vasp) {
                Intrinsics.checkNotNullParameter(bentoBaseRowState, "bentoBaseRowState");
                Intrinsics.checkNotNullParameter(vasp, "vasp");
                this.bentoBaseRowState = bentoBaseRowState;
                this.vasp = vasp;
            }

            public final BentoBaseRowState getBentoBaseRowState() {
                return this.bentoBaseRowState;
            }

            public final ApiCryptoVaspResponse.Vasp getVasp() {
                return this.vasp;
            }
        }

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row$Empty;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Empty implements Row {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            public boolean equals(Object other) {
                return this == other || (other instanceof Empty);
            }

            public int hashCode() {
                return 776178770;
            }

            public String toString() {
                return "Empty";
            }

            private Empty() {
            }
        }
    }
}
