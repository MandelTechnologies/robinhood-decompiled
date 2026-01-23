package com.robinhood.shared.crypto.transfer.send.address.manage;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddSavedAddressViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState;", "", "contentState", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState;", "<init>", "(Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState;)V", "getContentState", "()Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState;", "isLoading", "", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "ContentState", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoAddSavedAddressViewState {
    public static final int $stable = 8;
    private final ContentState contentState;

    public static /* synthetic */ CryptoAddSavedAddressViewState copy$default(CryptoAddSavedAddressViewState cryptoAddSavedAddressViewState, ContentState contentState, int i, Object obj) {
        if ((i & 1) != 0) {
            contentState = cryptoAddSavedAddressViewState.contentState;
        }
        return cryptoAddSavedAddressViewState.copy(contentState);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentState getContentState() {
        return this.contentState;
    }

    public final CryptoAddSavedAddressViewState copy(ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        return new CryptoAddSavedAddressViewState(contentState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoAddSavedAddressViewState) && Intrinsics.areEqual(this.contentState, ((CryptoAddSavedAddressViewState) other).contentState);
    }

    public int hashCode() {
        return this.contentState.hashCode();
    }

    public String toString() {
        return "CryptoAddSavedAddressViewState(contentState=" + this.contentState + ")";
    }

    public CryptoAddSavedAddressViewState(ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        this.contentState = contentState;
    }

    public final ContentState getContentState() {
        return this.contentState;
    }

    public final boolean isLoading() {
        return this.contentState instanceof ContentState.Loading;
    }

    /* compiled from: CryptoAddSavedAddressViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState;", "", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "Loading", "Loaded", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState$Loaded;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState$Loading;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ContentState {
        StringResource getPageTitle();

        /* compiled from: CryptoAddSavedAddressViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState$Loading;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState;", "<init>", "()V", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements ContentState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1970040094;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }

            @Override // com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressViewState.ContentState
            public StringResource getPageTitle() {
                return StringResource.INSTANCE.invoke("---------------------------");
            }
        }

        /* compiled from: CryptoAddSavedAddressViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState$Loaded;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressViewState$ContentState;", "pageTitle", "Lcom/robinhood/utils/resource/StringResource;", "apiCurrencyCode", "", "currencyCode", "maxAddressLength", "", "placeholderText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;)V", "getPageTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getApiCurrencyCode", "()Ljava/lang/String;", "getCurrencyCode", "getMaxAddressLength", "()I", "getPlaceholderText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements ContentState {
            public static final int $stable = StringResource.$stable;
            private final String apiCurrencyCode;
            private final String currencyCode;
            private final int maxAddressLength;
            private final StringResource pageTitle;
            private final StringResource placeholderText;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, String str, String str2, int i, StringResource stringResource2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    stringResource = loaded.pageTitle;
                }
                if ((i2 & 2) != 0) {
                    str = loaded.apiCurrencyCode;
                }
                if ((i2 & 4) != 0) {
                    str2 = loaded.currencyCode;
                }
                if ((i2 & 8) != 0) {
                    i = loaded.maxAddressLength;
                }
                if ((i2 & 16) != 0) {
                    stringResource2 = loaded.placeholderText;
                }
                StringResource stringResource3 = stringResource2;
                String str3 = str2;
                return loaded.copy(stringResource, str, str3, i, stringResource3);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getPageTitle() {
                return this.pageTitle;
            }

            /* renamed from: component2, reason: from getter */
            public final String getApiCurrencyCode() {
                return this.apiCurrencyCode;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCurrencyCode() {
                return this.currencyCode;
            }

            /* renamed from: component4, reason: from getter */
            public final int getMaxAddressLength() {
                return this.maxAddressLength;
            }

            /* renamed from: component5, reason: from getter */
            public final StringResource getPlaceholderText() {
                return this.placeholderText;
            }

            public final Loaded copy(StringResource pageTitle, String apiCurrencyCode, String currencyCode, int maxAddressLength, StringResource placeholderText) {
                Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
                Intrinsics.checkNotNullParameter(apiCurrencyCode, "apiCurrencyCode");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                return new Loaded(pageTitle, apiCurrencyCode, currencyCode, maxAddressLength, placeholderText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.pageTitle, loaded.pageTitle) && Intrinsics.areEqual(this.apiCurrencyCode, loaded.apiCurrencyCode) && Intrinsics.areEqual(this.currencyCode, loaded.currencyCode) && this.maxAddressLength == loaded.maxAddressLength && Intrinsics.areEqual(this.placeholderText, loaded.placeholderText);
            }

            public int hashCode() {
                int iHashCode = ((((((this.pageTitle.hashCode() * 31) + this.apiCurrencyCode.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + Integer.hashCode(this.maxAddressLength)) * 31;
                StringResource stringResource = this.placeholderText;
                return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
            }

            public String toString() {
                return "Loaded(pageTitle=" + this.pageTitle + ", apiCurrencyCode=" + this.apiCurrencyCode + ", currencyCode=" + this.currencyCode + ", maxAddressLength=" + this.maxAddressLength + ", placeholderText=" + this.placeholderText + ")";
            }

            public Loaded(StringResource pageTitle, String apiCurrencyCode, String currencyCode, int i, StringResource stringResource) {
                Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
                Intrinsics.checkNotNullParameter(apiCurrencyCode, "apiCurrencyCode");
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                this.pageTitle = pageTitle;
                this.apiCurrencyCode = apiCurrencyCode;
                this.currencyCode = currencyCode;
                this.maxAddressLength = i;
                this.placeholderText = stringResource;
            }

            @Override // com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressViewState.ContentState
            public StringResource getPageTitle() {
                return this.pageTitle;
            }

            public final String getApiCurrencyCode() {
                return this.apiCurrencyCode;
            }

            public final String getCurrencyCode() {
                return this.currencyCode;
            }

            public final int getMaxAddressLength() {
                return this.maxAddressLength;
            }

            public final StringResource getPlaceholderText() {
                return this.placeholderText;
            }
        }
    }
}
