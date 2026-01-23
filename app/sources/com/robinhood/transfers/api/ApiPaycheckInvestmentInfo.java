package com.robinhood.transfers.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.squareup.moshi.JsonClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiPaycheckInvestmentInfo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiPaycheckInvestmentInfo;", "Landroid/os/Parcelable;", "asset_type", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "symbol", "", "investment_log_id", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/lang/String;Ljava/util/UUID;)V", "getAsset_type", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getSymbol", "()Ljava/lang/String;", "getInvestment_log_id", "()Ljava/util/UUID;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApiPaycheckInvestmentInfo implements Parcelable {
    public static final Parcelable.Creator<ApiPaycheckInvestmentInfo> CREATOR = new Creator();
    private final ApiAssetType asset_type;
    private final UUID investment_log_id;
    private final String symbol;

    /* compiled from: ApiPaycheckInvestmentInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiPaycheckInvestmentInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiPaycheckInvestmentInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiPaycheckInvestmentInfo(ApiAssetType.valueOf(parcel.readString()), parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiPaycheckInvestmentInfo[] newArray(int i) {
            return new ApiPaycheckInvestmentInfo[i];
        }
    }

    public static /* synthetic */ ApiPaycheckInvestmentInfo copy$default(ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo, ApiAssetType apiAssetType, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAssetType = apiPaycheckInvestmentInfo.asset_type;
        }
        if ((i & 2) != 0) {
            str = apiPaycheckInvestmentInfo.symbol;
        }
        if ((i & 4) != 0) {
            uuid = apiPaycheckInvestmentInfo.investment_log_id;
        }
        return apiPaycheckInvestmentInfo.copy(apiAssetType, str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAssetType getAsset_type() {
        return this.asset_type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getInvestment_log_id() {
        return this.investment_log_id;
    }

    public final ApiPaycheckInvestmentInfo copy(ApiAssetType asset_type, String symbol, UUID investment_log_id) {
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(investment_log_id, "investment_log_id");
        return new ApiPaycheckInvestmentInfo(asset_type, symbol, investment_log_id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiPaycheckInvestmentInfo)) {
            return false;
        }
        ApiPaycheckInvestmentInfo apiPaycheckInvestmentInfo = (ApiPaycheckInvestmentInfo) other;
        return this.asset_type == apiPaycheckInvestmentInfo.asset_type && Intrinsics.areEqual(this.symbol, apiPaycheckInvestmentInfo.symbol) && Intrinsics.areEqual(this.investment_log_id, apiPaycheckInvestmentInfo.investment_log_id);
    }

    public int hashCode() {
        int iHashCode = this.asset_type.hashCode() * 31;
        String str = this.symbol;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.investment_log_id.hashCode();
    }

    public String toString() {
        return "ApiPaycheckInvestmentInfo(asset_type=" + this.asset_type + ", symbol=" + this.symbol + ", investment_log_id=" + this.investment_log_id + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.asset_type.name());
        dest.writeString(this.symbol);
        dest.writeSerializable(this.investment_log_id);
    }

    public ApiPaycheckInvestmentInfo(ApiAssetType asset_type, String str, UUID investment_log_id) {
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(investment_log_id, "investment_log_id");
        this.asset_type = asset_type;
        this.symbol = str;
        this.investment_log_id = investment_log_id;
    }

    public final ApiAssetType getAsset_type() {
        return this.asset_type;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final UUID getInvestment_log_id() {
        return this.investment_log_id;
    }
}
