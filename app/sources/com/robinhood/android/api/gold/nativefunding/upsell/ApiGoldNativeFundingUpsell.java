package com.robinhood.android.api.gold.nativefunding.upsell;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.onboardingupsell.ApiChooseApyScreenContent;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldNativeFundingUpsell.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/api/gold/nativefunding/upsell/ApiGoldNativeFundingUpsell;", "Landroid/os/Parcelable;", "earnExtraDepositScreen", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "startEarningDepositScreen", "Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;", "fundingUpsellSource", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;Ljava/lang/String;)V", "getEarnExtraDepositScreen", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getStartEarningDepositScreen", "()Lcom/robinhood/models/onboardingupsell/ApiChooseApyScreenContent;", "getFundingUpsellSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-api-gold-native-funding-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApiGoldNativeFundingUpsell implements Parcelable {
    public static final Parcelable.Creator<ApiGoldNativeFundingUpsell> CREATOR = new Creator();
    private final StandardPageTemplate<OnboardingFundingUpsellAction> earnExtraDepositScreen;
    private final String fundingUpsellSource;
    private final ApiChooseApyScreenContent startEarningDepositScreen;

    /* compiled from: ApiGoldNativeFundingUpsell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldNativeFundingUpsell> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldNativeFundingUpsell createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldNativeFundingUpsell((StandardPageTemplate) parcel.readParcelable(ApiGoldNativeFundingUpsell.class.getClassLoader()), (ApiChooseApyScreenContent) parcel.readParcelable(ApiGoldNativeFundingUpsell.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldNativeFundingUpsell[] newArray(int i) {
            return new ApiGoldNativeFundingUpsell[i];
        }
    }

    public ApiGoldNativeFundingUpsell() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiGoldNativeFundingUpsell copy$default(ApiGoldNativeFundingUpsell apiGoldNativeFundingUpsell, StandardPageTemplate standardPageTemplate, ApiChooseApyScreenContent apiChooseApyScreenContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            standardPageTemplate = apiGoldNativeFundingUpsell.earnExtraDepositScreen;
        }
        if ((i & 2) != 0) {
            apiChooseApyScreenContent = apiGoldNativeFundingUpsell.startEarningDepositScreen;
        }
        if ((i & 4) != 0) {
            str = apiGoldNativeFundingUpsell.fundingUpsellSource;
        }
        return apiGoldNativeFundingUpsell.copy(standardPageTemplate, apiChooseApyScreenContent, str);
    }

    public final StandardPageTemplate<OnboardingFundingUpsellAction> component1() {
        return this.earnExtraDepositScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiChooseApyScreenContent getStartEarningDepositScreen() {
        return this.startEarningDepositScreen;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFundingUpsellSource() {
        return this.fundingUpsellSource;
    }

    public final ApiGoldNativeFundingUpsell copy(@Json(name = "earn_extra_deposit_screen") StandardPageTemplate<? extends OnboardingFundingUpsellAction> earnExtraDepositScreen, @Json(name = "start_earning_deposit_screen") ApiChooseApyScreenContent startEarningDepositScreen, @Json(name = "funding_upsell_source") String fundingUpsellSource) {
        return new ApiGoldNativeFundingUpsell(earnExtraDepositScreen, startEarningDepositScreen, fundingUpsellSource);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldNativeFundingUpsell)) {
            return false;
        }
        ApiGoldNativeFundingUpsell apiGoldNativeFundingUpsell = (ApiGoldNativeFundingUpsell) other;
        return Intrinsics.areEqual(this.earnExtraDepositScreen, apiGoldNativeFundingUpsell.earnExtraDepositScreen) && Intrinsics.areEqual(this.startEarningDepositScreen, apiGoldNativeFundingUpsell.startEarningDepositScreen) && Intrinsics.areEqual(this.fundingUpsellSource, apiGoldNativeFundingUpsell.fundingUpsellSource);
    }

    public int hashCode() {
        StandardPageTemplate<OnboardingFundingUpsellAction> standardPageTemplate = this.earnExtraDepositScreen;
        int iHashCode = (standardPageTemplate == null ? 0 : standardPageTemplate.hashCode()) * 31;
        ApiChooseApyScreenContent apiChooseApyScreenContent = this.startEarningDepositScreen;
        int iHashCode2 = (iHashCode + (apiChooseApyScreenContent == null ? 0 : apiChooseApyScreenContent.hashCode())) * 31;
        String str = this.fundingUpsellSource;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldNativeFundingUpsell(earnExtraDepositScreen=" + this.earnExtraDepositScreen + ", startEarningDepositScreen=" + this.startEarningDepositScreen + ", fundingUpsellSource=" + this.fundingUpsellSource + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.earnExtraDepositScreen, flags);
        dest.writeParcelable(this.startEarningDepositScreen, flags);
        dest.writeString(this.fundingUpsellSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldNativeFundingUpsell(@Json(name = "earn_extra_deposit_screen") StandardPageTemplate<? extends OnboardingFundingUpsellAction> standardPageTemplate, @Json(name = "start_earning_deposit_screen") ApiChooseApyScreenContent apiChooseApyScreenContent, @Json(name = "funding_upsell_source") String str) {
        this.earnExtraDepositScreen = standardPageTemplate;
        this.startEarningDepositScreen = apiChooseApyScreenContent;
        this.fundingUpsellSource = str;
    }

    public /* synthetic */ ApiGoldNativeFundingUpsell(StandardPageTemplate standardPageTemplate, ApiChooseApyScreenContent apiChooseApyScreenContent, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : standardPageTemplate, (i & 2) != 0 ? null : apiChooseApyScreenContent, (i & 4) != 0 ? null : str);
    }

    public final StandardPageTemplate<OnboardingFundingUpsellAction> getEarnExtraDepositScreen() {
        return this.earnExtraDepositScreen;
    }

    public final ApiChooseApyScreenContent getStartEarningDepositScreen() {
        return this.startEarningDepositScreen;
    }

    public final String getFundingUpsellSource() {
        return this.fundingUpsellSource;
    }
}
