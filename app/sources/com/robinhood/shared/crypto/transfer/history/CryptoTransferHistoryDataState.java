package com.robinhood.shared.crypto.transfer.history;

import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.crypto.p315ui.transfer.CryptoTransferHistoryDetail;
import com.robinhood.models.serverdriven.experimental.api.HistoryDetailAction;
import com.robinhood.models.serverdriven.experimental.api.NavigationMenuTextButton;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTransferHistoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u000f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/history/CryptoTransferHistoryDataState;", "", ErrorResponse.DETAIL, "Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetail;", "<init>", "(Lcom/robinhood/models/crypto/ui/transfer/CryptoTransferHistoryDetail;)V", "isLoading", "", "()Z", "mobileMenuItem", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationMenuTextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/HistoryDetailAction;", "getMobileMenuItem", "()Lcom/robinhood/models/serverdriven/experimental/api/NavigationMenuTextButton;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferHistoryDataState {
    public static final int $stable = 8;
    private final CryptoTransferHistoryDetail detail;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoTransferHistoryDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final CryptoTransferHistoryDetail getDetail() {
        return this.detail;
    }

    public static /* synthetic */ CryptoTransferHistoryDataState copy$default(CryptoTransferHistoryDataState cryptoTransferHistoryDataState, CryptoTransferHistoryDetail cryptoTransferHistoryDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTransferHistoryDetail = cryptoTransferHistoryDataState.detail;
        }
        return cryptoTransferHistoryDataState.copy(cryptoTransferHistoryDetail);
    }

    public final CryptoTransferHistoryDataState copy(CryptoTransferHistoryDetail detail) {
        return new CryptoTransferHistoryDataState(detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoTransferHistoryDataState) && Intrinsics.areEqual(this.detail, ((CryptoTransferHistoryDataState) other).detail);
    }

    public int hashCode() {
        CryptoTransferHistoryDetail cryptoTransferHistoryDetail = this.detail;
        if (cryptoTransferHistoryDetail == null) {
            return 0;
        }
        return cryptoTransferHistoryDetail.hashCode();
    }

    public String toString() {
        return "CryptoTransferHistoryDataState(detail=" + this.detail + ")";
    }

    public CryptoTransferHistoryDataState(CryptoTransferHistoryDetail cryptoTransferHistoryDetail) {
        this.detail = cryptoTransferHistoryDetail;
    }

    public /* synthetic */ CryptoTransferHistoryDataState(CryptoTransferHistoryDetail cryptoTransferHistoryDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoTransferHistoryDetail);
    }

    public final boolean isLoading() {
        return this.detail == null;
    }

    public final NavigationMenuTextButton<HistoryDetailAction> getMobileMenuItem() {
        CryptoTransferHistoryDetail cryptoTransferHistoryDetail = this.detail;
        if (cryptoTransferHistoryDetail != null) {
            return cryptoTransferHistoryDetail.getMobileMenuItem();
        }
        return null;
    }

    public final ImmutableList<UIComponent<HistoryDetailAction>> getComponents() {
        List<UIComponent<HistoryDetailAction>> components;
        ImmutableList<UIComponent<HistoryDetailAction>> immutableList;
        CryptoTransferHistoryDetail cryptoTransferHistoryDetail = this.detail;
        return (cryptoTransferHistoryDetail == null || (components = cryptoTransferHistoryDetail.getComponents()) == null || (immutableList = extensions2.toImmutableList(components)) == null) ? extensions2.persistentListOf() : immutableList;
    }
}
