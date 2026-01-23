package com.robinhood.transfers.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiManagedAccountTransferDetails.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiManagedAccountTransferDetails;", "Landroid/os/Parcelable;", "requested_amount", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "final_management_fee", "proceeds_from_asset_sale", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Money;Lcom/robinhood/models/serverdriven/experimental/api/Money;Lcom/robinhood/models/serverdriven/experimental/api/Money;)V", "getRequested_amount", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getFinal_management_fee", "getProceeds_from_asset_sale", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ApiManagedAccountTransferDetails implements Parcelable {
    public static final Parcelable.Creator<ApiManagedAccountTransferDetails> CREATOR = new Creator();
    private final Money final_management_fee;
    private final Money proceeds_from_asset_sale;
    private final Money requested_amount;

    /* compiled from: ApiManagedAccountTransferDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiManagedAccountTransferDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiManagedAccountTransferDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiManagedAccountTransferDetails((Money) parcel.readParcelable(ApiManagedAccountTransferDetails.class.getClassLoader()), (Money) parcel.readParcelable(ApiManagedAccountTransferDetails.class.getClassLoader()), (Money) parcel.readParcelable(ApiManagedAccountTransferDetails.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiManagedAccountTransferDetails[] newArray(int i) {
            return new ApiManagedAccountTransferDetails[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.requested_amount, flags);
        dest.writeParcelable(this.final_management_fee, flags);
        dest.writeParcelable(this.proceeds_from_asset_sale, flags);
    }

    public ApiManagedAccountTransferDetails(Money money, Money money2, Money money3) {
        this.requested_amount = money;
        this.final_management_fee = money2;
        this.proceeds_from_asset_sale = money3;
    }

    public final Money getRequested_amount() {
        return this.requested_amount;
    }

    public final Money getFinal_management_fee() {
        return this.final_management_fee;
    }

    public final Money getProceeds_from_asset_sale() {
        return this.proceeds_from_asset_sale;
    }
}
