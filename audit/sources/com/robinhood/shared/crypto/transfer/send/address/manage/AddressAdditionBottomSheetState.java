package com.robinhood.shared.crypto.transfer.send.address.manage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddSavedAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/AddressAdditionBottomSheetState;", "", PlaceTypes.ADDRESS, "", "apiCurrencyCode", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getApiCurrencyCode", "getCurrencyCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AddressAdditionBottomSheetState {
    public static final int $stable = 0;
    private final String address;
    private final String apiCurrencyCode;
    private final String currencyCode;

    public static /* synthetic */ AddressAdditionBottomSheetState copy$default(AddressAdditionBottomSheetState addressAdditionBottomSheetState, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressAdditionBottomSheetState.address;
        }
        if ((i & 2) != 0) {
            str2 = addressAdditionBottomSheetState.apiCurrencyCode;
        }
        if ((i & 4) != 0) {
            str3 = addressAdditionBottomSheetState.currencyCode;
        }
        return addressAdditionBottomSheetState.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApiCurrencyCode() {
        return this.apiCurrencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final AddressAdditionBottomSheetState copy(String address, String apiCurrencyCode, String currencyCode) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(apiCurrencyCode, "apiCurrencyCode");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new AddressAdditionBottomSheetState(address, apiCurrencyCode, currencyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressAdditionBottomSheetState)) {
            return false;
        }
        AddressAdditionBottomSheetState addressAdditionBottomSheetState = (AddressAdditionBottomSheetState) other;
        return Intrinsics.areEqual(this.address, addressAdditionBottomSheetState.address) && Intrinsics.areEqual(this.apiCurrencyCode, addressAdditionBottomSheetState.apiCurrencyCode) && Intrinsics.areEqual(this.currencyCode, addressAdditionBottomSheetState.currencyCode);
    }

    public int hashCode() {
        return (((this.address.hashCode() * 31) + this.apiCurrencyCode.hashCode()) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "AddressAdditionBottomSheetState(address=" + this.address + ", apiCurrencyCode=" + this.apiCurrencyCode + ", currencyCode=" + this.currencyCode + ")";
    }

    public AddressAdditionBottomSheetState(String address, String apiCurrencyCode, String currencyCode) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(apiCurrencyCode, "apiCurrencyCode");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.address = address;
        this.apiCurrencyCode = apiCurrencyCode;
        this.currencyCode = currencyCode;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getApiCurrencyCode() {
        return this.apiCurrencyCode;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }
}
