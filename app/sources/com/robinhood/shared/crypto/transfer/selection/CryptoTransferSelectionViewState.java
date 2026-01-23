package com.robinhood.shared.crypto.transfer.selection;

import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoTransferSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/selection/CryptoTransferSelectionViewState;", "", "action", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/transfer/CryptoTransferOptions$TransferableCrypto;", "query", "", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "checkForUpsell", "", "<init>", "(Lcom/robinhood/models/api/transfer/CryptoTransferAction;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Z)V", "getAction", "()Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getQuery", "()Ljava/lang/String;", "getTrailingIcon", "()Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "getCheckForUpsell", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoTransferSelectionViewState {
    public static final int $stable = 8;
    private final CryptoTransferAction action;
    private final boolean checkForUpsell;
    private final ImmutableList<CryptoTransferOptions.TransferableCrypto> items;
    private final String query;
    private final BentoTextInput8.Icon.Size24 trailingIcon;

    public static /* synthetic */ CryptoTransferSelectionViewState copy$default(CryptoTransferSelectionViewState cryptoTransferSelectionViewState, CryptoTransferAction cryptoTransferAction, ImmutableList immutableList, String str, BentoTextInput8.Icon.Size24 size24, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTransferAction = cryptoTransferSelectionViewState.action;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoTransferSelectionViewState.items;
        }
        if ((i & 4) != 0) {
            str = cryptoTransferSelectionViewState.query;
        }
        if ((i & 8) != 0) {
            size24 = cryptoTransferSelectionViewState.trailingIcon;
        }
        if ((i & 16) != 0) {
            z = cryptoTransferSelectionViewState.checkForUpsell;
        }
        boolean z2 = z;
        String str2 = str;
        return cryptoTransferSelectionViewState.copy(cryptoTransferAction, immutableList, str2, size24, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoTransferAction getAction() {
        return this.action;
    }

    public final ImmutableList<CryptoTransferOptions.TransferableCrypto> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component4, reason: from getter */
    public final BentoTextInput8.Icon.Size24 getTrailingIcon() {
        return this.trailingIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }

    public final CryptoTransferSelectionViewState copy(CryptoTransferAction action, ImmutableList<CryptoTransferOptions.TransferableCrypto> items, String query, BentoTextInput8.Icon.Size24 trailingIcon, boolean checkForUpsell) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        return new CryptoTransferSelectionViewState(action, items, query, trailingIcon, checkForUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoTransferSelectionViewState)) {
            return false;
        }
        CryptoTransferSelectionViewState cryptoTransferSelectionViewState = (CryptoTransferSelectionViewState) other;
        return this.action == cryptoTransferSelectionViewState.action && Intrinsics.areEqual(this.items, cryptoTransferSelectionViewState.items) && Intrinsics.areEqual(this.query, cryptoTransferSelectionViewState.query) && Intrinsics.areEqual(this.trailingIcon, cryptoTransferSelectionViewState.trailingIcon) && this.checkForUpsell == cryptoTransferSelectionViewState.checkForUpsell;
    }

    public int hashCode() {
        CryptoTransferAction cryptoTransferAction = this.action;
        int iHashCode = (((((cryptoTransferAction == null ? 0 : cryptoTransferAction.hashCode()) * 31) + this.items.hashCode()) * 31) + this.query.hashCode()) * 31;
        BentoTextInput8.Icon.Size24 size24 = this.trailingIcon;
        return ((iHashCode + (size24 != null ? size24.hashCode() : 0)) * 31) + Boolean.hashCode(this.checkForUpsell);
    }

    public String toString() {
        return "CryptoTransferSelectionViewState(action=" + this.action + ", items=" + this.items + ", query=" + this.query + ", trailingIcon=" + this.trailingIcon + ", checkForUpsell=" + this.checkForUpsell + ")";
    }

    public CryptoTransferSelectionViewState(CryptoTransferAction cryptoTransferAction, ImmutableList<CryptoTransferOptions.TransferableCrypto> items, String query, BentoTextInput8.Icon.Size24 size24, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(query, "query");
        this.action = cryptoTransferAction;
        this.items = items;
        this.query = query;
        this.trailingIcon = size24;
        this.checkForUpsell = z;
    }

    public final CryptoTransferAction getAction() {
        return this.action;
    }

    public final ImmutableList<CryptoTransferOptions.TransferableCrypto> getItems() {
        return this.items;
    }

    public final String getQuery() {
        return this.query;
    }

    public final BentoTextInput8.Icon.Size24 getTrailingIcon() {
        return this.trailingIcon;
    }

    public final boolean getCheckForUpsell() {
        return this.checkForUpsell;
    }
}
