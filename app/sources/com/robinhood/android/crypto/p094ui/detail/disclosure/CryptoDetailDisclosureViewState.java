package com.robinhood.android.crypto.p094ui.detail.disclosure;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureViewState;", "", "disclosureResource", "Lcom/robinhood/utils/resource/StringResource;", "disclosureLink", "Lcom/robinhood/android/crypto/ui/detail/disclosure/DisclosureLink;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/crypto/ui/detail/disclosure/DisclosureLink;)V", "getDisclosureResource", "()Lcom/robinhood/utils/resource/StringResource;", "getDisclosureLink", "()Lcom/robinhood/android/crypto/ui/detail/disclosure/DisclosureLink;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailDisclosureViewState {
    public static final int $stable = StringResource.$stable;
    private final DisclosureLink disclosureLink;
    private final StringResource disclosureResource;

    public static /* synthetic */ CryptoDetailDisclosureViewState copy$default(CryptoDetailDisclosureViewState cryptoDetailDisclosureViewState, StringResource stringResource, DisclosureLink disclosureLink, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoDetailDisclosureViewState.disclosureResource;
        }
        if ((i & 2) != 0) {
            disclosureLink = cryptoDetailDisclosureViewState.disclosureLink;
        }
        return cryptoDetailDisclosureViewState.copy(stringResource, disclosureLink);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getDisclosureResource() {
        return this.disclosureResource;
    }

    /* renamed from: component2, reason: from getter */
    public final DisclosureLink getDisclosureLink() {
        return this.disclosureLink;
    }

    public final CryptoDetailDisclosureViewState copy(StringResource disclosureResource, DisclosureLink disclosureLink) {
        Intrinsics.checkNotNullParameter(disclosureResource, "disclosureResource");
        return new CryptoDetailDisclosureViewState(disclosureResource, disclosureLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailDisclosureViewState)) {
            return false;
        }
        CryptoDetailDisclosureViewState cryptoDetailDisclosureViewState = (CryptoDetailDisclosureViewState) other;
        return Intrinsics.areEqual(this.disclosureResource, cryptoDetailDisclosureViewState.disclosureResource) && Intrinsics.areEqual(this.disclosureLink, cryptoDetailDisclosureViewState.disclosureLink);
    }

    public int hashCode() {
        int iHashCode = this.disclosureResource.hashCode() * 31;
        DisclosureLink disclosureLink = this.disclosureLink;
        return iHashCode + (disclosureLink == null ? 0 : disclosureLink.hashCode());
    }

    public String toString() {
        return "CryptoDetailDisclosureViewState(disclosureResource=" + this.disclosureResource + ", disclosureLink=" + this.disclosureLink + ")";
    }

    public CryptoDetailDisclosureViewState(StringResource disclosureResource, DisclosureLink disclosureLink) {
        Intrinsics.checkNotNullParameter(disclosureResource, "disclosureResource");
        this.disclosureResource = disclosureResource;
        this.disclosureLink = disclosureLink;
    }

    public final StringResource getDisclosureResource() {
        return this.disclosureResource;
    }

    public final DisclosureLink getDisclosureLink() {
        return this.disclosureLink;
    }
}
