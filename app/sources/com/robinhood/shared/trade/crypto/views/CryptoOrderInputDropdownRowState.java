package com.robinhood.shared.trade.crypto.views;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderInputDropdownRow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/views/CryptoOrderInputDropdownRowState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "dropdownText", "includeBottomDivider", "", "isLoading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "getDropdownText", "getIncludeBottomDivider", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoOrderInputDropdownRowState {
    public static final int $stable = StringResource.$stable;
    private final StringResource dropdownText;
    private final boolean includeBottomDivider;
    private final boolean isLoading;
    private final StringResource text;

    public static /* synthetic */ CryptoOrderInputDropdownRowState copy$default(CryptoOrderInputDropdownRowState cryptoOrderInputDropdownRowState, StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoOrderInputDropdownRowState.text;
        }
        if ((i & 2) != 0) {
            stringResource2 = cryptoOrderInputDropdownRowState.dropdownText;
        }
        if ((i & 4) != 0) {
            z = cryptoOrderInputDropdownRowState.includeBottomDivider;
        }
        if ((i & 8) != 0) {
            z2 = cryptoOrderInputDropdownRowState.isLoading;
        }
        return cryptoOrderInputDropdownRowState.copy(stringResource, stringResource2, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getDropdownText() {
        return this.dropdownText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CryptoOrderInputDropdownRowState copy(StringResource text, StringResource dropdownText, boolean includeBottomDivider, boolean isLoading) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dropdownText, "dropdownText");
        return new CryptoOrderInputDropdownRowState(text, dropdownText, includeBottomDivider, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoOrderInputDropdownRowState)) {
            return false;
        }
        CryptoOrderInputDropdownRowState cryptoOrderInputDropdownRowState = (CryptoOrderInputDropdownRowState) other;
        return Intrinsics.areEqual(this.text, cryptoOrderInputDropdownRowState.text) && Intrinsics.areEqual(this.dropdownText, cryptoOrderInputDropdownRowState.dropdownText) && this.includeBottomDivider == cryptoOrderInputDropdownRowState.includeBottomDivider && this.isLoading == cryptoOrderInputDropdownRowState.isLoading;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.dropdownText.hashCode()) * 31) + Boolean.hashCode(this.includeBottomDivider)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "CryptoOrderInputDropdownRowState(text=" + this.text + ", dropdownText=" + this.dropdownText + ", includeBottomDivider=" + this.includeBottomDivider + ", isLoading=" + this.isLoading + ")";
    }

    public CryptoOrderInputDropdownRowState(StringResource text, StringResource dropdownText, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dropdownText, "dropdownText");
        this.text = text;
        this.dropdownText = dropdownText;
        this.includeBottomDivider = z;
        this.isLoading = z2;
    }

    public /* synthetic */ CryptoOrderInputDropdownRowState(StringResource stringResource, StringResource stringResource2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, stringResource2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }

    public final StringResource getText() {
        return this.text;
    }

    public final StringResource getDropdownText() {
        return this.dropdownText;
    }

    public final boolean getIncludeBottomDivider() {
        return this.includeBottomDivider;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
