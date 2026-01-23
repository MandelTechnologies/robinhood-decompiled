package com.robinhood.android.crypto.p094ui.detail.description;

import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import md_server_proxy.service.p483v1.KeyInfoDocumentDto;

/* compiled from: CryptoDescriptionDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionViewState;", "", "description", "Lcom/robinhood/utils/resource/StringResource;", "fundamentalList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/compose/bento/component/rows/BentoDataRowState;", "shouldShowFundamental", "", "keyInfoDoc", "Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "isVisible", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;ZLmd_server_proxy/service/v1/KeyInfoDocumentDto;Z)V", "getDescription", "()Lcom/robinhood/utils/resource/StringResource;", "getFundamentalList", "()Lkotlinx/collections/immutable/ImmutableList;", "getShouldShowFundamental", "()Z", "getKeyInfoDoc", "()Lmd_server_proxy/service/v1/KeyInfoDocumentDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDescriptionViewState {
    public static final int $stable = 8;
    private final StringResource description;
    private final ImmutableList<BentoDataRowState> fundamentalList;
    private final boolean isVisible;
    private final KeyInfoDocumentDto keyInfoDoc;
    private final boolean shouldShowFundamental;

    public static /* synthetic */ CryptoDescriptionViewState copy$default(CryptoDescriptionViewState cryptoDescriptionViewState, StringResource stringResource, ImmutableList immutableList, boolean z, KeyInfoDocumentDto keyInfoDocumentDto, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoDescriptionViewState.description;
        }
        if ((i & 2) != 0) {
            immutableList = cryptoDescriptionViewState.fundamentalList;
        }
        if ((i & 4) != 0) {
            z = cryptoDescriptionViewState.shouldShowFundamental;
        }
        if ((i & 8) != 0) {
            keyInfoDocumentDto = cryptoDescriptionViewState.keyInfoDoc;
        }
        if ((i & 16) != 0) {
            z2 = cryptoDescriptionViewState.isVisible;
        }
        boolean z3 = z2;
        boolean z4 = z;
        return cryptoDescriptionViewState.copy(stringResource, immutableList, z4, keyInfoDocumentDto, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getDescription() {
        return this.description;
    }

    public final ImmutableList<BentoDataRowState> component2() {
        return this.fundamentalList;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowFundamental() {
        return this.shouldShowFundamental;
    }

    /* renamed from: component4, reason: from getter */
    public final KeyInfoDocumentDto getKeyInfoDoc() {
        return this.keyInfoDoc;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final CryptoDescriptionViewState copy(StringResource description, ImmutableList<BentoDataRowState> fundamentalList, boolean shouldShowFundamental, KeyInfoDocumentDto keyInfoDoc, boolean isVisible) {
        Intrinsics.checkNotNullParameter(fundamentalList, "fundamentalList");
        return new CryptoDescriptionViewState(description, fundamentalList, shouldShowFundamental, keyInfoDoc, isVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDescriptionViewState)) {
            return false;
        }
        CryptoDescriptionViewState cryptoDescriptionViewState = (CryptoDescriptionViewState) other;
        return Intrinsics.areEqual(this.description, cryptoDescriptionViewState.description) && Intrinsics.areEqual(this.fundamentalList, cryptoDescriptionViewState.fundamentalList) && this.shouldShowFundamental == cryptoDescriptionViewState.shouldShowFundamental && Intrinsics.areEqual(this.keyInfoDoc, cryptoDescriptionViewState.keyInfoDoc) && this.isVisible == cryptoDescriptionViewState.isVisible;
    }

    public int hashCode() {
        StringResource stringResource = this.description;
        int iHashCode = (((((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.fundamentalList.hashCode()) * 31) + Boolean.hashCode(this.shouldShowFundamental)) * 31;
        KeyInfoDocumentDto keyInfoDocumentDto = this.keyInfoDoc;
        return ((iHashCode + (keyInfoDocumentDto != null ? keyInfoDocumentDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.isVisible);
    }

    public String toString() {
        return "CryptoDescriptionViewState(description=" + this.description + ", fundamentalList=" + this.fundamentalList + ", shouldShowFundamental=" + this.shouldShowFundamental + ", keyInfoDoc=" + this.keyInfoDoc + ", isVisible=" + this.isVisible + ")";
    }

    public CryptoDescriptionViewState(StringResource stringResource, ImmutableList<BentoDataRowState> fundamentalList, boolean z, KeyInfoDocumentDto keyInfoDocumentDto, boolean z2) {
        Intrinsics.checkNotNullParameter(fundamentalList, "fundamentalList");
        this.description = stringResource;
        this.fundamentalList = fundamentalList;
        this.shouldShowFundamental = z;
        this.keyInfoDoc = keyInfoDocumentDto;
        this.isVisible = z2;
    }

    public final StringResource getDescription() {
        return this.description;
    }

    public final ImmutableList<BentoDataRowState> getFundamentalList() {
        return this.fundamentalList;
    }

    public final boolean getShouldShowFundamental() {
        return this.shouldShowFundamental;
    }

    public final KeyInfoDocumentDto getKeyInfoDoc() {
        return this.keyInfoDoc;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
