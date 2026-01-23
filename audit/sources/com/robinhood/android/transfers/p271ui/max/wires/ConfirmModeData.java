package com.robinhood.android.transfers.p271ui.max.wires;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputDataState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/wires/ConfirmModeData;", "", "detailsConfirmed", "", "temporaryBankName", "", "username", PlaceTypes.ADDRESS, "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailsConfirmed", "()Z", "getTemporaryBankName", "()Ljava/lang/String;", "getUsername", "getAddress", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ConfirmModeData {
    public static final int $stable = 0;
    private final String address;
    private final boolean detailsConfirmed;
    private final String temporaryBankName;
    private final String username;

    public static /* synthetic */ ConfirmModeData copy$default(ConfirmModeData confirmModeData, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confirmModeData.detailsConfirmed;
        }
        if ((i & 2) != 0) {
            str = confirmModeData.temporaryBankName;
        }
        if ((i & 4) != 0) {
            str2 = confirmModeData.username;
        }
        if ((i & 8) != 0) {
            str3 = confirmModeData.address;
        }
        return confirmModeData.copy(z, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDetailsConfirmed() {
        return this.detailsConfirmed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTemporaryBankName() {
        return this.temporaryBankName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final ConfirmModeData copy(boolean detailsConfirmed, String temporaryBankName, String username, String address) {
        Intrinsics.checkNotNullParameter(temporaryBankName, "temporaryBankName");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ConfirmModeData(detailsConfirmed, temporaryBankName, username, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmModeData)) {
            return false;
        }
        ConfirmModeData confirmModeData = (ConfirmModeData) other;
        return this.detailsConfirmed == confirmModeData.detailsConfirmed && Intrinsics.areEqual(this.temporaryBankName, confirmModeData.temporaryBankName) && Intrinsics.areEqual(this.username, confirmModeData.username) && Intrinsics.areEqual(this.address, confirmModeData.address);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.detailsConfirmed) * 31) + this.temporaryBankName.hashCode()) * 31) + this.username.hashCode()) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "ConfirmModeData(detailsConfirmed=" + this.detailsConfirmed + ", temporaryBankName=" + this.temporaryBankName + ", username=" + this.username + ", address=" + this.address + ")";
    }

    public ConfirmModeData(boolean z, String temporaryBankName, String username, String address) {
        Intrinsics.checkNotNullParameter(temporaryBankName, "temporaryBankName");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(address, "address");
        this.detailsConfirmed = z;
        this.temporaryBankName = temporaryBankName;
        this.username = username;
        this.address = address;
    }

    public final boolean getDetailsConfirmed() {
        return this.detailsConfirmed;
    }

    public final String getTemporaryBankName() {
        return this.temporaryBankName;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getAddress() {
        return this.address;
    }
}
