package com.robinhood.staticcontent.model.productmarketing;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductMarketingContent.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "Landroid/os/Parcelable;", "productIdentifier", "", "pageTitle", "productDescription", "", "features", "", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;)V", "getProductIdentifier", "()Ljava/lang/String;", "getPageTitle", "getProductDescription", "()Ljava/lang/CharSequence;", "getFeatures", "()Ljava/util/List;", "getDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Feature", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductMarketingContent implements Parcelable {
    public static final Parcelable.Creator<ProductMarketingContent> CREATOR = new Creator();
    private final DisclosureContent disclosure;
    private final List<Feature> features;
    private final String pageTitle;
    private final CharSequence productDescription;
    private final String productIdentifier;

    /* compiled from: ProductMarketingContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductMarketingContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductMarketingContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Feature.CREATOR.createFromParcel(parcel));
            }
            return new ProductMarketingContent(string2, string3, charSequence, arrayList, parcel.readInt() == 0 ? null : DisclosureContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductMarketingContent[] newArray(int i) {
            return new ProductMarketingContent[i];
        }
    }

    public static /* synthetic */ ProductMarketingContent copy$default(ProductMarketingContent productMarketingContent, String str, String str2, CharSequence charSequence, List list, DisclosureContent disclosureContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productMarketingContent.productIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = productMarketingContent.pageTitle;
        }
        if ((i & 4) != 0) {
            charSequence = productMarketingContent.productDescription;
        }
        if ((i & 8) != 0) {
            list = productMarketingContent.features;
        }
        if ((i & 16) != 0) {
            disclosureContent = productMarketingContent.disclosure;
        }
        DisclosureContent disclosureContent2 = disclosureContent;
        CharSequence charSequence2 = charSequence;
        return productMarketingContent.copy(str, str2, charSequence2, list, disclosureContent2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getProductDescription() {
        return this.productDescription;
    }

    public final List<Feature> component4() {
        return this.features;
    }

    /* renamed from: component5, reason: from getter */
    public final DisclosureContent getDisclosure() {
        return this.disclosure;
    }

    public final ProductMarketingContent copy(String productIdentifier, String pageTitle, CharSequence productDescription, List<Feature> features, DisclosureContent disclosure) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(features, "features");
        return new ProductMarketingContent(productIdentifier, pageTitle, productDescription, features, disclosure);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMarketingContent)) {
            return false;
        }
        ProductMarketingContent productMarketingContent = (ProductMarketingContent) other;
        return Intrinsics.areEqual(this.productIdentifier, productMarketingContent.productIdentifier) && Intrinsics.areEqual(this.pageTitle, productMarketingContent.pageTitle) && Intrinsics.areEqual(this.productDescription, productMarketingContent.productDescription) && Intrinsics.areEqual(this.features, productMarketingContent.features) && Intrinsics.areEqual(this.disclosure, productMarketingContent.disclosure);
    }

    public int hashCode() {
        int iHashCode = this.productIdentifier.hashCode() * 31;
        String str = this.pageTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.productDescription;
        int iHashCode3 = (((iHashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.features.hashCode()) * 31;
        DisclosureContent disclosureContent = this.disclosure;
        return iHashCode3 + (disclosureContent != null ? disclosureContent.hashCode() : 0);
    }

    public String toString() {
        String str = this.productIdentifier;
        String str2 = this.pageTitle;
        CharSequence charSequence = this.productDescription;
        return "ProductMarketingContent(productIdentifier=" + str + ", pageTitle=" + str2 + ", productDescription=" + ((Object) charSequence) + ", features=" + this.features + ", disclosure=" + this.disclosure + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.productIdentifier);
        dest.writeString(this.pageTitle);
        TextUtils.writeToParcel(this.productDescription, dest, flags);
        List<Feature> list = this.features;
        dest.writeInt(list.size());
        Iterator<Feature> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        DisclosureContent disclosureContent = this.disclosure;
        if (disclosureContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            disclosureContent.writeToParcel(dest, flags);
        }
    }

    public ProductMarketingContent(String productIdentifier, String str, CharSequence charSequence, List<Feature> features, DisclosureContent disclosureContent) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(features, "features");
        this.productIdentifier = productIdentifier;
        this.pageTitle = str;
        this.productDescription = charSequence;
        this.features = features;
        this.disclosure = disclosureContent;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final CharSequence getProductDescription() {
        return this.productDescription;
    }

    public final List<Feature> getFeatures() {
        return this.features;
    }

    public final DisclosureContent getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: ProductMarketingContent.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "Landroid/os/Parcelable;", "identifier", "", "title", "description", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "pictogram", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;)V", "getIdentifier", "()Ljava/lang/String;", "getTitle", "getDescription", "()Ljava/lang/CharSequence;", "getDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/DisclosureContent;", "getPictogram", "()Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Feature implements Parcelable {
        public static final Parcelable.Creator<Feature> CREATOR = new Creator();
        private final CharSequence description;
        private final DisclosureContent disclosure;
        private final String identifier;
        private final ProductMarketingPictogram pictogram;
        private final String title;

        /* compiled from: ProductMarketingContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Feature> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Feature createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Feature(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DisclosureContent.CREATOR.createFromParcel(parcel), (ProductMarketingPictogram) parcel.readParcelable(Feature.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Feature[] newArray(int i) {
                return new Feature[i];
            }
        }

        public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, CharSequence charSequence, DisclosureContent disclosureContent, ProductMarketingPictogram productMarketingPictogram, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feature.identifier;
            }
            if ((i & 2) != 0) {
                str2 = feature.title;
            }
            if ((i & 4) != 0) {
                charSequence = feature.description;
            }
            if ((i & 8) != 0) {
                disclosureContent = feature.disclosure;
            }
            if ((i & 16) != 0) {
                productMarketingPictogram = feature.pictogram;
            }
            ProductMarketingPictogram productMarketingPictogram2 = productMarketingPictogram;
            CharSequence charSequence2 = charSequence;
            return feature.copy(str, str2, charSequence2, disclosureContent, productMarketingPictogram2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final DisclosureContent getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component5, reason: from getter */
        public final ProductMarketingPictogram getPictogram() {
            return this.pictogram;
        }

        public final Feature copy(String identifier, String title, CharSequence description, DisclosureContent disclosure, ProductMarketingPictogram pictogram) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Feature(identifier, title, description, disclosure, pictogram);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Feature)) {
                return false;
            }
            Feature feature = (Feature) other;
            return Intrinsics.areEqual(this.identifier, feature.identifier) && Intrinsics.areEqual(this.title, feature.title) && Intrinsics.areEqual(this.description, feature.description) && Intrinsics.areEqual(this.disclosure, feature.disclosure) && Intrinsics.areEqual(this.pictogram, feature.pictogram);
        }

        public int hashCode() {
            int iHashCode = ((((this.identifier.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
            DisclosureContent disclosureContent = this.disclosure;
            int iHashCode2 = (iHashCode + (disclosureContent == null ? 0 : disclosureContent.hashCode())) * 31;
            ProductMarketingPictogram productMarketingPictogram = this.pictogram;
            return iHashCode2 + (productMarketingPictogram != null ? productMarketingPictogram.hashCode() : 0);
        }

        public String toString() {
            String str = this.identifier;
            String str2 = this.title;
            CharSequence charSequence = this.description;
            return "Feature(identifier=" + str + ", title=" + str2 + ", description=" + ((Object) charSequence) + ", disclosure=" + this.disclosure + ", pictogram=" + this.pictogram + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.identifier);
            dest.writeString(this.title);
            TextUtils.writeToParcel(this.description, dest, flags);
            DisclosureContent disclosureContent = this.disclosure;
            if (disclosureContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                disclosureContent.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.pictogram, flags);
        }

        public Feature(String identifier, String title, CharSequence description, DisclosureContent disclosureContent, ProductMarketingPictogram productMarketingPictogram) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.identifier = identifier;
            this.title = title;
            this.description = description;
            this.disclosure = disclosureContent;
            this.pictogram = productMarketingPictogram;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getTitle() {
            return this.title;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final DisclosureContent getDisclosure() {
            return this.disclosure;
        }

        public final ProductMarketingPictogram getPictogram() {
            return this.pictogram;
        }
    }
}
