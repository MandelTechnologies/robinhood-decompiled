package com.robinhood.android.common.mcduckling.p084ui.address;

import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/address/AddressSelectionState;", "", "isLoading", "", "billingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "shippingAddresses", "", "loadAddressesError", "Lcom/robinhood/udf/UiEvent;", "", "saveAddressError", "<init>", "(ZLcom/robinhood/android/common/mcduckling/address/CardShippingAddress;Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "()Z", "getBillingAddress", "()Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "getShippingAddresses", "()Ljava/util/List;", "getLoadAddressesError", "()Lcom/robinhood/udf/UiEvent;", "getSaveAddressError", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AddressSelectionState {
    private final CardShippingAddress billingAddress;
    private final boolean isLoading;
    private final UiEvent<Throwable> loadAddressesError;
    private final UiEvent<Throwable> saveAddressError;
    private final List<CardShippingAddress> shippingAddresses;

    public AddressSelectionState() {
        this(false, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AddressSelectionState copy$default(AddressSelectionState addressSelectionState, boolean z, CardShippingAddress cardShippingAddress, List list, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addressSelectionState.isLoading;
        }
        if ((i & 2) != 0) {
            cardShippingAddress = addressSelectionState.billingAddress;
        }
        if ((i & 4) != 0) {
            list = addressSelectionState.shippingAddresses;
        }
        if ((i & 8) != 0) {
            uiEvent = addressSelectionState.loadAddressesError;
        }
        if ((i & 16) != 0) {
            uiEvent2 = addressSelectionState.saveAddressError;
        }
        UiEvent uiEvent3 = uiEvent2;
        List list2 = list;
        return addressSelectionState.copy(z, cardShippingAddress, list2, uiEvent, uiEvent3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final CardShippingAddress getBillingAddress() {
        return this.billingAddress;
    }

    public final List<CardShippingAddress> component3() {
        return this.shippingAddresses;
    }

    public final UiEvent<Throwable> component4() {
        return this.loadAddressesError;
    }

    public final UiEvent<Throwable> component5() {
        return this.saveAddressError;
    }

    public final AddressSelectionState copy(boolean isLoading, CardShippingAddress billingAddress, List<CardShippingAddress> shippingAddresses, UiEvent<Throwable> loadAddressesError, UiEvent<Throwable> saveAddressError) {
        Intrinsics.checkNotNullParameter(shippingAddresses, "shippingAddresses");
        return new AddressSelectionState(isLoading, billingAddress, shippingAddresses, loadAddressesError, saveAddressError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSelectionState)) {
            return false;
        }
        AddressSelectionState addressSelectionState = (AddressSelectionState) other;
        return this.isLoading == addressSelectionState.isLoading && Intrinsics.areEqual(this.billingAddress, addressSelectionState.billingAddress) && Intrinsics.areEqual(this.shippingAddresses, addressSelectionState.shippingAddresses) && Intrinsics.areEqual(this.loadAddressesError, addressSelectionState.loadAddressesError) && Intrinsics.areEqual(this.saveAddressError, addressSelectionState.saveAddressError);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        CardShippingAddress cardShippingAddress = this.billingAddress;
        int iHashCode2 = (((iHashCode + (cardShippingAddress == null ? 0 : cardShippingAddress.hashCode())) * 31) + this.shippingAddresses.hashCode()) * 31;
        UiEvent<Throwable> uiEvent = this.loadAddressesError;
        int iHashCode3 = (iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Throwable> uiEvent2 = this.saveAddressError;
        return iHashCode3 + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
    }

    public String toString() {
        return "AddressSelectionState(isLoading=" + this.isLoading + ", billingAddress=" + this.billingAddress + ", shippingAddresses=" + this.shippingAddresses + ", loadAddressesError=" + this.loadAddressesError + ", saveAddressError=" + this.saveAddressError + ")";
    }

    public AddressSelectionState(boolean z, CardShippingAddress cardShippingAddress, List<CardShippingAddress> shippingAddresses, UiEvent<Throwable> uiEvent, UiEvent<Throwable> uiEvent2) {
        Intrinsics.checkNotNullParameter(shippingAddresses, "shippingAddresses");
        this.isLoading = z;
        this.billingAddress = cardShippingAddress;
        this.shippingAddresses = shippingAddresses;
        this.loadAddressesError = uiEvent;
        this.saveAddressError = uiEvent2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final CardShippingAddress getBillingAddress() {
        return this.billingAddress;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AddressSelectionState(boolean r2, com.robinhood.android.common.mcduckling.address.CardShippingAddress r3, java.util.List r4, com.robinhood.udf.UiEvent r5, com.robinhood.udf.UiEvent r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L13
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            r5 = r0
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L23
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L29
        L23:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L29:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.mcduckling.p084ui.address.AddressSelectionState.<init>(boolean, com.robinhood.android.common.mcduckling.address.CardShippingAddress, java.util.List, com.robinhood.udf.UiEvent, com.robinhood.udf.UiEvent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<CardShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public final UiEvent<Throwable> getLoadAddressesError() {
        return this.loadAddressesError;
    }

    public final UiEvent<Throwable> getSaveAddressError() {
        return this.saveAddressError;
    }
}
