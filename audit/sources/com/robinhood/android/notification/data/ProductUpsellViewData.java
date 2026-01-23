package com.robinhood.android.notification.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellViewData.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0082\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0007J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0007HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "Landroid/os/Parcelable;", "title", "", CarResultComposable2.BODY, "headerImageUrl", "optionHeaderBackgroundColor", "", "identifier", "primaryCtaText", "primaryActionType", "Lcom/robinhood/android/notification/data/ProductUpsellActionType;", "primaryCtaIdentifier", "secondaryCtaText", "secondaryActionType", "secondaryCtaIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/notification/data/ProductUpsellActionType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/notification/data/ProductUpsellActionType;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getHeaderImageUrl", "getOptionHeaderBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIdentifier", "getPrimaryCtaText", "getPrimaryActionType", "()Lcom/robinhood/android/notification/data/ProductUpsellActionType;", "getPrimaryCtaIdentifier", "getSecondaryCtaText", "getSecondaryActionType", "getSecondaryCtaIdentifier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/notification/data/ProductUpsellActionType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/notification/data/ProductUpsellActionType;Ljava/lang/String;)Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProductUpsellViewData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ProductUpsellViewData> CREATOR = new Creator();
    private final String body;
    private final String headerImageUrl;
    private final String identifier;
    private final Integer optionHeaderBackgroundColor;
    private final ProductUpsellActionType primaryActionType;
    private final String primaryCtaIdentifier;
    private final String primaryCtaText;
    private final ProductUpsellActionType secondaryActionType;
    private final String secondaryCtaIdentifier;
    private final String secondaryCtaText;
    private final String title;

    /* compiled from: ProductUpsellViewData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductUpsellViewData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductUpsellViewData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductUpsellViewData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), ProductUpsellActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), ProductUpsellActionType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductUpsellViewData[] newArray(int i) {
            return new ProductUpsellViewData[i];
        }
    }

    public static /* synthetic */ ProductUpsellViewData copy$default(ProductUpsellViewData productUpsellViewData, String str, String str2, String str3, Integer num, String str4, String str5, ProductUpsellActionType productUpsellActionType, String str6, String str7, ProductUpsellActionType productUpsellActionType2, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productUpsellViewData.title;
        }
        if ((i & 2) != 0) {
            str2 = productUpsellViewData.body;
        }
        if ((i & 4) != 0) {
            str3 = productUpsellViewData.headerImageUrl;
        }
        if ((i & 8) != 0) {
            num = productUpsellViewData.optionHeaderBackgroundColor;
        }
        if ((i & 16) != 0) {
            str4 = productUpsellViewData.identifier;
        }
        if ((i & 32) != 0) {
            str5 = productUpsellViewData.primaryCtaText;
        }
        if ((i & 64) != 0) {
            productUpsellActionType = productUpsellViewData.primaryActionType;
        }
        if ((i & 128) != 0) {
            str6 = productUpsellViewData.primaryCtaIdentifier;
        }
        if ((i & 256) != 0) {
            str7 = productUpsellViewData.secondaryCtaText;
        }
        if ((i & 512) != 0) {
            productUpsellActionType2 = productUpsellViewData.secondaryActionType;
        }
        if ((i & 1024) != 0) {
            str8 = productUpsellViewData.secondaryCtaIdentifier;
        }
        ProductUpsellActionType productUpsellActionType3 = productUpsellActionType2;
        String str9 = str8;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        ProductUpsellActionType productUpsellActionType4 = productUpsellActionType;
        String str13 = str4;
        String str14 = str3;
        return productUpsellViewData.copy(str, str2, str14, num, str13, str12, productUpsellActionType4, str10, str11, productUpsellActionType3, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final ProductUpsellActionType getSecondaryActionType() {
        return this.secondaryActionType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSecondaryCtaIdentifier() {
        return this.secondaryCtaIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getOptionHeaderBackgroundColor() {
        return this.optionHeaderBackgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component7, reason: from getter */
    public final ProductUpsellActionType getPrimaryActionType() {
        return this.primaryActionType;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPrimaryCtaIdentifier() {
        return this.primaryCtaIdentifier;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final ProductUpsellViewData copy(String title, String body, String headerImageUrl, Integer optionHeaderBackgroundColor, String identifier, String primaryCtaText, ProductUpsellActionType primaryActionType, String primaryCtaIdentifier, String secondaryCtaText, ProductUpsellActionType secondaryActionType, String secondaryCtaIdentifier) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(primaryActionType, "primaryActionType");
        Intrinsics.checkNotNullParameter(primaryCtaIdentifier, "primaryCtaIdentifier");
        Intrinsics.checkNotNullParameter(secondaryActionType, "secondaryActionType");
        return new ProductUpsellViewData(title, body, headerImageUrl, optionHeaderBackgroundColor, identifier, primaryCtaText, primaryActionType, primaryCtaIdentifier, secondaryCtaText, secondaryActionType, secondaryCtaIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUpsellViewData)) {
            return false;
        }
        ProductUpsellViewData productUpsellViewData = (ProductUpsellViewData) other;
        return Intrinsics.areEqual(this.title, productUpsellViewData.title) && Intrinsics.areEqual(this.body, productUpsellViewData.body) && Intrinsics.areEqual(this.headerImageUrl, productUpsellViewData.headerImageUrl) && Intrinsics.areEqual(this.optionHeaderBackgroundColor, productUpsellViewData.optionHeaderBackgroundColor) && Intrinsics.areEqual(this.identifier, productUpsellViewData.identifier) && Intrinsics.areEqual(this.primaryCtaText, productUpsellViewData.primaryCtaText) && this.primaryActionType == productUpsellViewData.primaryActionType && Intrinsics.areEqual(this.primaryCtaIdentifier, productUpsellViewData.primaryCtaIdentifier) && Intrinsics.areEqual(this.secondaryCtaText, productUpsellViewData.secondaryCtaText) && this.secondaryActionType == productUpsellViewData.secondaryActionType && Intrinsics.areEqual(this.secondaryCtaIdentifier, productUpsellViewData.secondaryCtaIdentifier);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.headerImageUrl.hashCode()) * 31;
        Integer num = this.optionHeaderBackgroundColor;
        int iHashCode2 = (((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.identifier.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31) + this.primaryActionType.hashCode()) * 31) + this.primaryCtaIdentifier.hashCode()) * 31;
        String str = this.secondaryCtaText;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.secondaryActionType.hashCode()) * 31;
        String str2 = this.secondaryCtaIdentifier;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ProductUpsellViewData(title=" + this.title + ", body=" + this.body + ", headerImageUrl=" + this.headerImageUrl + ", optionHeaderBackgroundColor=" + this.optionHeaderBackgroundColor + ", identifier=" + this.identifier + ", primaryCtaText=" + this.primaryCtaText + ", primaryActionType=" + this.primaryActionType + ", primaryCtaIdentifier=" + this.primaryCtaIdentifier + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryActionType=" + this.secondaryActionType + ", secondaryCtaIdentifier=" + this.secondaryCtaIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.headerImageUrl);
        Integer num = this.optionHeaderBackgroundColor;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.identifier);
        dest.writeString(this.primaryCtaText);
        dest.writeString(this.primaryActionType.name());
        dest.writeString(this.primaryCtaIdentifier);
        dest.writeString(this.secondaryCtaText);
        dest.writeString(this.secondaryActionType.name());
        dest.writeString(this.secondaryCtaIdentifier);
    }

    public ProductUpsellViewData(String title, String body, String headerImageUrl, Integer num, String identifier, String primaryCtaText, ProductUpsellActionType primaryActionType, String primaryCtaIdentifier, String str, ProductUpsellActionType secondaryActionType, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(primaryActionType, "primaryActionType");
        Intrinsics.checkNotNullParameter(primaryCtaIdentifier, "primaryCtaIdentifier");
        Intrinsics.checkNotNullParameter(secondaryActionType, "secondaryActionType");
        this.title = title;
        this.body = body;
        this.headerImageUrl = headerImageUrl;
        this.optionHeaderBackgroundColor = num;
        this.identifier = identifier;
        this.primaryCtaText = primaryCtaText;
        this.primaryActionType = primaryActionType;
        this.primaryCtaIdentifier = primaryCtaIdentifier;
        this.secondaryCtaText = str;
        this.secondaryActionType = secondaryActionType;
        this.secondaryCtaIdentifier = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public /* synthetic */ ProductUpsellViewData(String str, String str2, String str3, Integer num, String str4, String str5, ProductUpsellActionType productUpsellActionType, String str6, String str7, ProductUpsellActionType productUpsellActionType2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? 0 : num, str4, str5, productUpsellActionType, str6, str7, productUpsellActionType2, str8);
    }

    public final Integer getOptionHeaderBackgroundColor() {
        return this.optionHeaderBackgroundColor;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final ProductUpsellActionType getPrimaryActionType() {
        return this.primaryActionType;
    }

    public final String getPrimaryCtaIdentifier() {
        return this.primaryCtaIdentifier;
    }

    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final ProductUpsellActionType getSecondaryActionType() {
        return this.secondaryActionType;
    }

    public final String getSecondaryCtaIdentifier() {
        return this.secondaryCtaIdentifier;
    }
}
