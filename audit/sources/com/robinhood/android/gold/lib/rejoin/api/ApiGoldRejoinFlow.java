package com.robinhood.android.gold.lib.rejoin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsDuxo;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldRejoinFlow.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/lib/rejoin/api/ApiGoldRejoinFlow;", "Landroid/os/Parcelable;", "goldAgreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "goldConfirmation", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;)V", "getGoldAgreement", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "getGoldSweepAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "getGoldConfirmation", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldConfirmation;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-rejoin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldRejoinFlow implements Parcelable {
    public static final Parcelable.Creator<ApiGoldRejoinFlow> CREATOR = new Creator();
    private final ApiGoldSweepAgreement goldAgreement;
    private final ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation;
    private final ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;

    /* compiled from: ApiGoldRejoinFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldRejoinFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldRejoinFlow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldRejoinFlow((ApiGoldSweepAgreement) parcel.readParcelable(ApiGoldRejoinFlow.class.getClassLoader()), (ApiGoldUpgradeFlow.ApiGoldSweepAgreements) parcel.readParcelable(ApiGoldRejoinFlow.class.getClassLoader()), (ApiGoldUpgradeFlow.ApiGoldConfirmation) parcel.readParcelable(ApiGoldRejoinFlow.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldRejoinFlow[] newArray(int i) {
            return new ApiGoldRejoinFlow[i];
        }
    }

    public static /* synthetic */ ApiGoldRejoinFlow copy$default(ApiGoldRejoinFlow apiGoldRejoinFlow, ApiGoldSweepAgreement apiGoldSweepAgreement, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation, int i, Object obj) {
        if ((i & 1) != 0) {
            apiGoldSweepAgreement = apiGoldRejoinFlow.goldAgreement;
        }
        if ((i & 2) != 0) {
            apiGoldSweepAgreements = apiGoldRejoinFlow.goldSweepAgreements;
        }
        if ((i & 4) != 0) {
            apiGoldConfirmation = apiGoldRejoinFlow.goldConfirmation;
        }
        return apiGoldRejoinFlow.copy(apiGoldSweepAgreement, apiGoldSweepAgreements, apiGoldConfirmation);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiGoldSweepAgreement getGoldAgreement() {
        return this.goldAgreement;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiGoldUpgradeFlow.ApiGoldConfirmation getGoldConfirmation() {
        return this.goldConfirmation;
    }

    public final ApiGoldRejoinFlow copy(@Json(name = FinalTermsDuxo.GOLD_AGREEMENT_NAME) ApiGoldSweepAgreement goldAgreement, @Json(name = "gold_sweep_agreements") ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, @Json(name = "gold_confirmation") ApiGoldUpgradeFlow.ApiGoldConfirmation goldConfirmation) {
        return new ApiGoldRejoinFlow(goldAgreement, goldSweepAgreements, goldConfirmation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldRejoinFlow)) {
            return false;
        }
        ApiGoldRejoinFlow apiGoldRejoinFlow = (ApiGoldRejoinFlow) other;
        return Intrinsics.areEqual(this.goldAgreement, apiGoldRejoinFlow.goldAgreement) && Intrinsics.areEqual(this.goldSweepAgreements, apiGoldRejoinFlow.goldSweepAgreements) && Intrinsics.areEqual(this.goldConfirmation, apiGoldRejoinFlow.goldConfirmation);
    }

    public int hashCode() {
        ApiGoldSweepAgreement apiGoldSweepAgreement = this.goldAgreement;
        int iHashCode = (apiGoldSweepAgreement == null ? 0 : apiGoldSweepAgreement.hashCode()) * 31;
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements = this.goldSweepAgreements;
        int iHashCode2 = (iHashCode + (apiGoldSweepAgreements == null ? 0 : apiGoldSweepAgreements.hashCode())) * 31;
        ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation = this.goldConfirmation;
        return iHashCode2 + (apiGoldConfirmation != null ? apiGoldConfirmation.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldRejoinFlow(goldAgreement=" + this.goldAgreement + ", goldSweepAgreements=" + this.goldSweepAgreements + ", goldConfirmation=" + this.goldConfirmation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.goldAgreement, flags);
        dest.writeParcelable(this.goldSweepAgreements, flags);
        dest.writeParcelable(this.goldConfirmation, flags);
    }

    public ApiGoldRejoinFlow(@Json(name = FinalTermsDuxo.GOLD_AGREEMENT_NAME) ApiGoldSweepAgreement apiGoldSweepAgreement, @Json(name = "gold_sweep_agreements") ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, @Json(name = "gold_confirmation") ApiGoldUpgradeFlow.ApiGoldConfirmation apiGoldConfirmation) {
        this.goldAgreement = apiGoldSweepAgreement;
        this.goldSweepAgreements = apiGoldSweepAgreements;
        this.goldConfirmation = apiGoldConfirmation;
    }

    public final ApiGoldSweepAgreement getGoldAgreement() {
        return this.goldAgreement;
    }

    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    public final ApiGoldUpgradeFlow.ApiGoldConfirmation getGoldConfirmation() {
        return this.goldConfirmation;
    }
}
