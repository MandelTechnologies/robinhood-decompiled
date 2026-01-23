package com.robinhood.shared.crypto.transfer.verification.exchange;

import androidx.compose.p011ui.graphics.Color;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeViewState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ExchangeDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÂ\u0003J5\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;", "", "loading", "", "query", "", "selection", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "response", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse;", "<init>", "(ZLjava/lang/String;Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse;)V", "getLoading", "()Z", "getQuery", "()Ljava/lang/String;", "getSelection", "()Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "results", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState$Row;", "getResults", "()Lkotlinx/collections/immutable/ImmutableList;", "enabled", "getEnabled", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final /* data */ class ExchangeDataState {
    public static final int $stable = 8;
    private final boolean loading;
    private final String query;
    private final ApiCryptoVaspResponse response;
    private final ApiCryptoVaspResponse.Vasp selection;

    public ExchangeDataState() {
        this(false, null, null, null, 15, null);
    }

    /* renamed from: component4, reason: from getter */
    private final ApiCryptoVaspResponse getResponse() {
        return this.response;
    }

    public static /* synthetic */ ExchangeDataState copy$default(ExchangeDataState exchangeDataState, boolean z, String str, ApiCryptoVaspResponse.Vasp vasp, ApiCryptoVaspResponse apiCryptoVaspResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = exchangeDataState.loading;
        }
        if ((i & 2) != 0) {
            str = exchangeDataState.query;
        }
        if ((i & 4) != 0) {
            vasp = exchangeDataState.selection;
        }
        if ((i & 8) != 0) {
            apiCryptoVaspResponse = exchangeDataState.response;
        }
        return exchangeDataState.copy(z, str, vasp, apiCryptoVaspResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCryptoVaspResponse.Vasp getSelection() {
        return this.selection;
    }

    public final ExchangeDataState copy(boolean loading, String query, ApiCryptoVaspResponse.Vasp selection, ApiCryptoVaspResponse response) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new ExchangeDataState(loading, query, selection, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeDataState)) {
            return false;
        }
        ExchangeDataState exchangeDataState = (ExchangeDataState) other;
        return this.loading == exchangeDataState.loading && Intrinsics.areEqual(this.query, exchangeDataState.query) && Intrinsics.areEqual(this.selection, exchangeDataState.selection) && Intrinsics.areEqual(this.response, exchangeDataState.response);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.loading) * 31) + this.query.hashCode()) * 31;
        ApiCryptoVaspResponse.Vasp vasp = this.selection;
        int iHashCode2 = (iHashCode + (vasp == null ? 0 : vasp.hashCode())) * 31;
        ApiCryptoVaspResponse apiCryptoVaspResponse = this.response;
        return iHashCode2 + (apiCryptoVaspResponse != null ? apiCryptoVaspResponse.hashCode() : 0);
    }

    public String toString() {
        return "ExchangeDataState(loading=" + this.loading + ", query=" + this.query + ", selection=" + this.selection + ", response=" + this.response + ")";
    }

    public ExchangeDataState(boolean z, String query, ApiCryptoVaspResponse.Vasp vasp, ApiCryptoVaspResponse apiCryptoVaspResponse) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.loading = z;
        this.query = query;
        this.selection = vasp;
        this.response = apiCryptoVaspResponse;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public /* synthetic */ ExchangeDataState(boolean z, String str, ApiCryptoVaspResponse.Vasp vasp, ApiCryptoVaspResponse apiCryptoVaspResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : vasp, (i & 8) != 0 ? null : apiCryptoVaspResponse);
    }

    public final String getQuery() {
        return this.query;
    }

    public final ApiCryptoVaspResponse.Vasp getSelection() {
        return this.selection;
    }

    public final ImmutableList<ExchangeViewState.Row> getResults() {
        ApiCryptoVaspResponse apiCryptoVaspResponse = this.response;
        if (apiCryptoVaspResponse == null) {
            return extensions2.persistentListOf();
        }
        if (apiCryptoVaspResponse.getVasps().isEmpty()) {
            return extensions2.persistentListOf(ExchangeViewState.Row.Empty.INSTANCE);
        }
        ImmutableList<ApiCryptoVaspResponse.Vasp> vasps = this.response.getVasps();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(vasps, 10));
        for (ApiCryptoVaspResponse.Vasp vasp : vasps) {
            arrayList.add(new ExchangeViewState.Row.Vasp(new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(vasp.getName()), null, Intrinsics.areEqual(vasp, this.selection) ? new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null, null, false, false, 117, null), vasp));
        }
        return extensions2.toImmutableList(arrayList);
    }

    public final boolean getEnabled() {
        return this.selection != null;
    }
}
