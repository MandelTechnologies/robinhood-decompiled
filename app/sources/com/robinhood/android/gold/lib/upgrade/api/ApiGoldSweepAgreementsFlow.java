package com.robinhood.android.gold.lib.upgrade.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GoldSwitchPlanUpsellAction;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldSweepAgreementsFlow.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019Jd\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020(HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u000b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;", "Landroid/os/Parcelable;", "goldSweepAgreements", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "promotion", "", "postSuccessActionSheet", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldSwitchPlanUpsellAction;", "onlyShowGoldAgreement", "", "isTitleCenterAligned", "titleProgressBar", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "disableSparkleButtonStyling", "<init>", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;ZLjava/lang/Boolean;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;Ljava/lang/Boolean;)V", "getGoldSweepAgreements", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;", "getPromotion", "()Ljava/lang/String;", "getPostSuccessActionSheet", "()Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "getOnlyShowGoldAgreement", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitleProgressBar", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "getDisableSparkleButtonStyling", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldSweepAgreements;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;ZLjava/lang/Boolean;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;Ljava/lang/Boolean;)Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldSweepAgreementsFlow;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldSweepAgreementsFlow implements Parcelable {
    public static final Parcelable.Creator<ApiGoldSweepAgreementsFlow> CREATOR = new Creator();
    private final Boolean disableSparkleButtonStyling;
    private final ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements;
    private final Boolean isTitleCenterAligned;
    private final boolean onlyShowGoldAgreement;
    private final AlertAction<GoldSwitchPlanUpsellAction> postSuccessActionSheet;
    private final String promotion;
    private final ApiGoldAgreementsProgressBar titleProgressBar;

    /* compiled from: ApiGoldSweepAgreementsFlow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldSweepAgreementsFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldSweepAgreementsFlow createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreementsCreateFromParcel = ApiGoldUpgradeFlow.ApiGoldSweepAgreements.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            AlertAction alertAction = (AlertAction) parcel.readParcelable(ApiGoldSweepAgreementsFlow.class.getClassLoader());
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0 ? true : z);
            }
            ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBarCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldAgreementsProgressBar.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolValueOf2 = Boolean.valueOf(z);
            }
            return new ApiGoldSweepAgreementsFlow(apiGoldSweepAgreementsCreateFromParcel, string2, alertAction, z2, boolValueOf, apiGoldAgreementsProgressBarCreateFromParcel, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldSweepAgreementsFlow[] newArray(int i) {
            return new ApiGoldSweepAgreementsFlow[i];
        }
    }

    public static /* synthetic */ ApiGoldSweepAgreementsFlow copy$default(ApiGoldSweepAgreementsFlow apiGoldSweepAgreementsFlow, ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, String str, AlertAction alertAction, boolean z, Boolean bool, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiGoldSweepAgreements = apiGoldSweepAgreementsFlow.goldSweepAgreements;
        }
        if ((i & 2) != 0) {
            str = apiGoldSweepAgreementsFlow.promotion;
        }
        if ((i & 4) != 0) {
            alertAction = apiGoldSweepAgreementsFlow.postSuccessActionSheet;
        }
        if ((i & 8) != 0) {
            z = apiGoldSweepAgreementsFlow.onlyShowGoldAgreement;
        }
        if ((i & 16) != 0) {
            bool = apiGoldSweepAgreementsFlow.isTitleCenterAligned;
        }
        if ((i & 32) != 0) {
            apiGoldAgreementsProgressBar = apiGoldSweepAgreementsFlow.titleProgressBar;
        }
        if ((i & 64) != 0) {
            bool2 = apiGoldSweepAgreementsFlow.disableSparkleButtonStyling;
        }
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar2 = apiGoldAgreementsProgressBar;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        AlertAction alertAction2 = alertAction;
        return apiGoldSweepAgreementsFlow.copy(apiGoldSweepAgreements, str, alertAction2, z, bool4, apiGoldAgreementsProgressBar2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPromotion() {
        return this.promotion;
    }

    public final AlertAction<GoldSwitchPlanUpsellAction> component3() {
        return this.postSuccessActionSheet;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getOnlyShowGoldAgreement() {
        return this.onlyShowGoldAgreement;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsTitleCenterAligned() {
        return this.isTitleCenterAligned;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
        return this.titleProgressBar;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getDisableSparkleButtonStyling() {
        return this.disableSparkleButtonStyling;
    }

    public final ApiGoldSweepAgreementsFlow copy(ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, String promotion, @Json(name = "post_success_action_sheet") AlertAction<? extends GoldSwitchPlanUpsellAction> postSuccessActionSheet, @Json(name = "only_show_gold_agreement") boolean onlyShowGoldAgreement, @Json(name = "is_title_center_aligned") Boolean isTitleCenterAligned, @Json(name = "title_progress_bar") ApiGoldAgreementsProgressBar titleProgressBar, @Json(name = "disable_sparkle_button_styling") Boolean disableSparkleButtonStyling) {
        Intrinsics.checkNotNullParameter(goldSweepAgreements, "goldSweepAgreements");
        return new ApiGoldSweepAgreementsFlow(goldSweepAgreements, promotion, postSuccessActionSheet, onlyShowGoldAgreement, isTitleCenterAligned, titleProgressBar, disableSparkleButtonStyling);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldSweepAgreementsFlow)) {
            return false;
        }
        ApiGoldSweepAgreementsFlow apiGoldSweepAgreementsFlow = (ApiGoldSweepAgreementsFlow) other;
        return Intrinsics.areEqual(this.goldSweepAgreements, apiGoldSweepAgreementsFlow.goldSweepAgreements) && Intrinsics.areEqual(this.promotion, apiGoldSweepAgreementsFlow.promotion) && Intrinsics.areEqual(this.postSuccessActionSheet, apiGoldSweepAgreementsFlow.postSuccessActionSheet) && this.onlyShowGoldAgreement == apiGoldSweepAgreementsFlow.onlyShowGoldAgreement && Intrinsics.areEqual(this.isTitleCenterAligned, apiGoldSweepAgreementsFlow.isTitleCenterAligned) && Intrinsics.areEqual(this.titleProgressBar, apiGoldSweepAgreementsFlow.titleProgressBar) && Intrinsics.areEqual(this.disableSparkleButtonStyling, apiGoldSweepAgreementsFlow.disableSparkleButtonStyling);
    }

    public int hashCode() {
        int iHashCode = this.goldSweepAgreements.hashCode() * 31;
        String str = this.promotion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AlertAction<GoldSwitchPlanUpsellAction> alertAction = this.postSuccessActionSheet;
        int iHashCode3 = (((iHashCode2 + (alertAction == null ? 0 : alertAction.hashCode())) * 31) + Boolean.hashCode(this.onlyShowGoldAgreement)) * 31;
        Boolean bool = this.isTitleCenterAligned;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = this.titleProgressBar;
        int iHashCode5 = (iHashCode4 + (apiGoldAgreementsProgressBar == null ? 0 : apiGoldAgreementsProgressBar.hashCode())) * 31;
        Boolean bool2 = this.disableSparkleButtonStyling;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldSweepAgreementsFlow(goldSweepAgreements=" + this.goldSweepAgreements + ", promotion=" + this.promotion + ", postSuccessActionSheet=" + this.postSuccessActionSheet + ", onlyShowGoldAgreement=" + this.onlyShowGoldAgreement + ", isTitleCenterAligned=" + this.isTitleCenterAligned + ", titleProgressBar=" + this.titleProgressBar + ", disableSparkleButtonStyling=" + this.disableSparkleButtonStyling + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.goldSweepAgreements.writeToParcel(dest, flags);
        dest.writeString(this.promotion);
        dest.writeParcelable(this.postSuccessActionSheet, flags);
        dest.writeInt(this.onlyShowGoldAgreement ? 1 : 0);
        Boolean bool = this.isTitleCenterAligned;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = this.titleProgressBar;
        if (apiGoldAgreementsProgressBar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldAgreementsProgressBar.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.disableSparkleButtonStyling;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldSweepAgreementsFlow(ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements, String str, @Json(name = "post_success_action_sheet") AlertAction<? extends GoldSwitchPlanUpsellAction> alertAction, @Json(name = "only_show_gold_agreement") boolean z, @Json(name = "is_title_center_aligned") Boolean bool, @Json(name = "title_progress_bar") ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, @Json(name = "disable_sparkle_button_styling") Boolean bool2) {
        Intrinsics.checkNotNullParameter(goldSweepAgreements, "goldSweepAgreements");
        this.goldSweepAgreements = goldSweepAgreements;
        this.promotion = str;
        this.postSuccessActionSheet = alertAction;
        this.onlyShowGoldAgreement = z;
        this.isTitleCenterAligned = bool;
        this.titleProgressBar = apiGoldAgreementsProgressBar;
        this.disableSparkleButtonStyling = bool2;
    }

    public final ApiGoldUpgradeFlow.ApiGoldSweepAgreements getGoldSweepAgreements() {
        return this.goldSweepAgreements;
    }

    public final String getPromotion() {
        return this.promotion;
    }

    public final AlertAction<GoldSwitchPlanUpsellAction> getPostSuccessActionSheet() {
        return this.postSuccessActionSheet;
    }

    public final boolean getOnlyShowGoldAgreement() {
        return this.onlyShowGoldAgreement;
    }

    public final Boolean isTitleCenterAligned() {
        return this.isTitleCenterAligned;
    }

    public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
        return this.titleProgressBar;
    }

    public /* synthetic */ ApiGoldSweepAgreementsFlow(ApiGoldUpgradeFlow.ApiGoldSweepAgreements apiGoldSweepAgreements, String str, AlertAction alertAction, boolean z, Boolean bool, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiGoldSweepAgreements, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : alertAction, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : apiGoldAgreementsProgressBar, (i & 64) != 0 ? Boolean.FALSE : bool2);
    }

    public final Boolean getDisableSparkleButtonStyling() {
        return this.disableSparkleButtonStyling;
    }
}
