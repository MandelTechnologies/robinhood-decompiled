package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003JÃ\u0001\u0010D\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0003\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0006\u0010E\u001a\u00020FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020FHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\u0016\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020FR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHub;", "Landroid/os/Parcelable;", "imagePath", "", "headerTitle", "title", "cardSection", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCardSection;", "featureSection", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeatureSection;", "billingSection", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;", "billingSectionV2", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "fullWidthCta", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBanner;", "disclosureMarkdown", "earningsTracker", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsTracker;", "infoTag", "Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "switchPlansCta", "Lcom/robinhood/android/gold/lib/hub/api/GoldHubSwitchPlansCta;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCardSection;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeatureSection;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Lcom/robinhood/models/serverdriven/experimental/api/Button;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBanner;Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsTracker;Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;Lcom/robinhood/android/gold/lib/hub/api/GoldHubSwitchPlansCta;)V", "getImagePath", "()Ljava/lang/String;", "getHeaderTitle", "getTitle", "getCardSection", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubCardSection;", "getFeatureSection", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeatureSection;", "getBillingSection", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;", "getBillingSectionV2", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "getFullWidthCta", "()Lcom/robinhood/models/serverdriven/experimental/api/Button;", "getBanner", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBanner;", "getDisclosureMarkdown", "getEarningsTracker", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldEarningsTracker;", "getInfoTag", "()Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;", "getSwitchPlansCta", "()Lcom/robinhood/android/gold/lib/hub/api/GoldHubSwitchPlansCta;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHub implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHub> CREATOR = new Creator();
    private final ApiGoldHubBanner banner;
    private final ApiGoldHubBillingSection billingSection;
    private final ApiGoldHubBillingSection billingSectionV2;
    private final ApiGoldHubCardSection cardSection;
    private final TextButton<GoldHubAction> cta;
    private final String disclosureMarkdown;
    private final ApiGoldEarningsTracker earningsTracker;
    private final ApiGoldHubFeatureSection featureSection;
    private final Button<GoldHubAction> fullWidthCta;
    private final String headerTitle;
    private final String imagePath;
    private final InfoTag<GenericAction> infoTag;
    private final GoldHubSwitchPlansCta switchPlansCta;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHub> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHub createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldHub(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ApiGoldHubCardSection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApiGoldHubFeatureSection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApiGoldHubBillingSection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ApiGoldHubBillingSection.CREATOR.createFromParcel(parcel), (TextButton) parcel.readParcelable(ApiGoldHub.class.getClassLoader()), (Button) parcel.readParcelable(ApiGoldHub.class.getClassLoader()), parcel.readInt() == 0 ? null : ApiGoldHubBanner.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ApiGoldEarningsTracker.CREATOR.createFromParcel(parcel), (InfoTag) parcel.readParcelable(ApiGoldHub.class.getClassLoader()), parcel.readInt() != 0 ? GoldHubSwitchPlansCta.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHub[] newArray(int i) {
            return new ApiGoldHub[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* renamed from: component10, reason: from getter */
    public final ApiGoldHubBanner getBanner() {
        return this.banner;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component12, reason: from getter */
    public final ApiGoldEarningsTracker getEarningsTracker() {
        return this.earningsTracker;
    }

    public final InfoTag<GenericAction> component13() {
        return this.infoTag;
    }

    /* renamed from: component14, reason: from getter */
    public final GoldHubSwitchPlansCta getSwitchPlansCta() {
        return this.switchPlansCta;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiGoldHubCardSection getCardSection() {
        return this.cardSection;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiGoldHubFeatureSection getFeatureSection() {
        return this.featureSection;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiGoldHubBillingSection getBillingSection() {
        return this.billingSection;
    }

    /* renamed from: component7, reason: from getter */
    public final ApiGoldHubBillingSection getBillingSectionV2() {
        return this.billingSectionV2;
    }

    public final TextButton<GoldHubAction> component8() {
        return this.cta;
    }

    public final Button<GoldHubAction> component9() {
        return this.fullWidthCta;
    }

    public final ApiGoldHub copy(@Json(name = "image_path") String imagePath, @Json(name = "header_title") String headerTitle, String title, @Json(name = "card_section") ApiGoldHubCardSection cardSection, @Json(name = "feature_section") ApiGoldHubFeatureSection featureSection, @Json(name = "billing_section") ApiGoldHubBillingSection billingSection, @Json(name = "billing_section_v2") ApiGoldHubBillingSection billingSectionV2, @Json(name = AccountOverviewOptionsSettingCard4.CTA) TextButton<? extends GoldHubAction> cta, @Json(name = "full_width_cta") Button<? extends GoldHubAction> fullWidthCta, ApiGoldHubBanner banner, @Json(name = "disclosure_markdown") String disclosureMarkdown, @Json(name = "gold_earnings_tracker") ApiGoldEarningsTracker earningsTracker, @Json(name = "info_tag") InfoTag<? extends GenericAction> infoTag, @Json(name = "switch_plans_cta") GoldHubSwitchPlansCta switchPlansCta) {
        return new ApiGoldHub(imagePath, headerTitle, title, cardSection, featureSection, billingSection, billingSectionV2, cta, fullWidthCta, banner, disclosureMarkdown, earningsTracker, infoTag, switchPlansCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHub)) {
            return false;
        }
        ApiGoldHub apiGoldHub = (ApiGoldHub) other;
        return Intrinsics.areEqual(this.imagePath, apiGoldHub.imagePath) && Intrinsics.areEqual(this.headerTitle, apiGoldHub.headerTitle) && Intrinsics.areEqual(this.title, apiGoldHub.title) && Intrinsics.areEqual(this.cardSection, apiGoldHub.cardSection) && Intrinsics.areEqual(this.featureSection, apiGoldHub.featureSection) && Intrinsics.areEqual(this.billingSection, apiGoldHub.billingSection) && Intrinsics.areEqual(this.billingSectionV2, apiGoldHub.billingSectionV2) && Intrinsics.areEqual(this.cta, apiGoldHub.cta) && Intrinsics.areEqual(this.fullWidthCta, apiGoldHub.fullWidthCta) && Intrinsics.areEqual(this.banner, apiGoldHub.banner) && Intrinsics.areEqual(this.disclosureMarkdown, apiGoldHub.disclosureMarkdown) && Intrinsics.areEqual(this.earningsTracker, apiGoldHub.earningsTracker) && Intrinsics.areEqual(this.infoTag, apiGoldHub.infoTag) && Intrinsics.areEqual(this.switchPlansCta, apiGoldHub.switchPlansCta);
    }

    public int hashCode() {
        String str = this.imagePath;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headerTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ApiGoldHubCardSection apiGoldHubCardSection = this.cardSection;
        int iHashCode4 = (iHashCode3 + (apiGoldHubCardSection == null ? 0 : apiGoldHubCardSection.hashCode())) * 31;
        ApiGoldHubFeatureSection apiGoldHubFeatureSection = this.featureSection;
        int iHashCode5 = (iHashCode4 + (apiGoldHubFeatureSection == null ? 0 : apiGoldHubFeatureSection.hashCode())) * 31;
        ApiGoldHubBillingSection apiGoldHubBillingSection = this.billingSection;
        int iHashCode6 = (iHashCode5 + (apiGoldHubBillingSection == null ? 0 : apiGoldHubBillingSection.hashCode())) * 31;
        ApiGoldHubBillingSection apiGoldHubBillingSection2 = this.billingSectionV2;
        int iHashCode7 = (iHashCode6 + (apiGoldHubBillingSection2 == null ? 0 : apiGoldHubBillingSection2.hashCode())) * 31;
        TextButton<GoldHubAction> textButton = this.cta;
        int iHashCode8 = (iHashCode7 + (textButton == null ? 0 : textButton.hashCode())) * 31;
        Button<GoldHubAction> button = this.fullWidthCta;
        int iHashCode9 = (iHashCode8 + (button == null ? 0 : button.hashCode())) * 31;
        ApiGoldHubBanner apiGoldHubBanner = this.banner;
        int iHashCode10 = (iHashCode9 + (apiGoldHubBanner == null ? 0 : apiGoldHubBanner.hashCode())) * 31;
        String str4 = this.disclosureMarkdown;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ApiGoldEarningsTracker apiGoldEarningsTracker = this.earningsTracker;
        int iHashCode12 = (iHashCode11 + (apiGoldEarningsTracker == null ? 0 : apiGoldEarningsTracker.hashCode())) * 31;
        InfoTag<GenericAction> infoTag = this.infoTag;
        int iHashCode13 = (iHashCode12 + (infoTag == null ? 0 : infoTag.hashCode())) * 31;
        GoldHubSwitchPlansCta goldHubSwitchPlansCta = this.switchPlansCta;
        return iHashCode13 + (goldHubSwitchPlansCta != null ? goldHubSwitchPlansCta.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldHub(imagePath=" + this.imagePath + ", headerTitle=" + this.headerTitle + ", title=" + this.title + ", cardSection=" + this.cardSection + ", featureSection=" + this.featureSection + ", billingSection=" + this.billingSection + ", billingSectionV2=" + this.billingSectionV2 + ", cta=" + this.cta + ", fullWidthCta=" + this.fullWidthCta + ", banner=" + this.banner + ", disclosureMarkdown=" + this.disclosureMarkdown + ", earningsTracker=" + this.earningsTracker + ", infoTag=" + this.infoTag + ", switchPlansCta=" + this.switchPlansCta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.imagePath);
        dest.writeString(this.headerTitle);
        dest.writeString(this.title);
        ApiGoldHubCardSection apiGoldHubCardSection = this.cardSection;
        if (apiGoldHubCardSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubCardSection.writeToParcel(dest, flags);
        }
        ApiGoldHubFeatureSection apiGoldHubFeatureSection = this.featureSection;
        if (apiGoldHubFeatureSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubFeatureSection.writeToParcel(dest, flags);
        }
        ApiGoldHubBillingSection apiGoldHubBillingSection = this.billingSection;
        if (apiGoldHubBillingSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubBillingSection.writeToParcel(dest, flags);
        }
        ApiGoldHubBillingSection apiGoldHubBillingSection2 = this.billingSectionV2;
        if (apiGoldHubBillingSection2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubBillingSection2.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.cta, flags);
        dest.writeParcelable(this.fullWidthCta, flags);
        ApiGoldHubBanner apiGoldHubBanner = this.banner;
        if (apiGoldHubBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubBanner.writeToParcel(dest, flags);
        }
        dest.writeString(this.disclosureMarkdown);
        ApiGoldEarningsTracker apiGoldEarningsTracker = this.earningsTracker;
        if (apiGoldEarningsTracker == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldEarningsTracker.writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.infoTag, flags);
        GoldHubSwitchPlansCta goldHubSwitchPlansCta = this.switchPlansCta;
        if (goldHubSwitchPlansCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            goldHubSwitchPlansCta.writeToParcel(dest, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldHub(@Json(name = "image_path") String str, @Json(name = "header_title") String str2, String str3, @Json(name = "card_section") ApiGoldHubCardSection apiGoldHubCardSection, @Json(name = "feature_section") ApiGoldHubFeatureSection apiGoldHubFeatureSection, @Json(name = "billing_section") ApiGoldHubBillingSection apiGoldHubBillingSection, @Json(name = "billing_section_v2") ApiGoldHubBillingSection apiGoldHubBillingSection2, @Json(name = AccountOverviewOptionsSettingCard4.CTA) TextButton<? extends GoldHubAction> textButton, @Json(name = "full_width_cta") Button<? extends GoldHubAction> button, ApiGoldHubBanner apiGoldHubBanner, @Json(name = "disclosure_markdown") String str4, @Json(name = "gold_earnings_tracker") ApiGoldEarningsTracker apiGoldEarningsTracker, @Json(name = "info_tag") InfoTag<? extends GenericAction> infoTag, @Json(name = "switch_plans_cta") GoldHubSwitchPlansCta goldHubSwitchPlansCta) {
        this.imagePath = str;
        this.headerTitle = str2;
        this.title = str3;
        this.cardSection = apiGoldHubCardSection;
        this.featureSection = apiGoldHubFeatureSection;
        this.billingSection = apiGoldHubBillingSection;
        this.billingSectionV2 = apiGoldHubBillingSection2;
        this.cta = textButton;
        this.fullWidthCta = button;
        this.banner = apiGoldHubBanner;
        this.disclosureMarkdown = str4;
        this.earningsTracker = apiGoldEarningsTracker;
        this.infoTag = infoTag;
        this.switchPlansCta = goldHubSwitchPlansCta;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ApiGoldHubCardSection getCardSection() {
        return this.cardSection;
    }

    public final ApiGoldHubFeatureSection getFeatureSection() {
        return this.featureSection;
    }

    public final ApiGoldHubBillingSection getBillingSection() {
        return this.billingSection;
    }

    public final ApiGoldHubBillingSection getBillingSectionV2() {
        return this.billingSectionV2;
    }

    public final TextButton<GoldHubAction> getCta() {
        return this.cta;
    }

    public final Button<GoldHubAction> getFullWidthCta() {
        return this.fullWidthCta;
    }

    public final ApiGoldHubBanner getBanner() {
        return this.banner;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final ApiGoldEarningsTracker getEarningsTracker() {
        return this.earningsTracker;
    }

    public final InfoTag<GenericAction> getInfoTag() {
        return this.infoTag;
    }

    public final GoldHubSwitchPlansCta getSwitchPlansCta() {
        return this.switchPlansCta;
    }
}
