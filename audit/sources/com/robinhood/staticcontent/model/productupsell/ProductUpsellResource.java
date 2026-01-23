package com.robinhood.staticcontent.model.productupsell;

import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellResource.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002$%B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001f\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource;", "", CarResultComposable2.BODY, "", "headerImage", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "identifier", "primaryCta", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource$CtaButton;", "secondaryCta", "title", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeaderImage", "()Lcom/robinhood/contentful/model/ResourceLink;", "getIdentifier", "getPrimaryCta", "getSecondaryCta", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON, "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ProductUpsellResource {
    public static final String CONTENT_TYPE_ID = "productUpsell";
    private final String body;
    private final ResourceLink<AssetResource<?>> headerImage;
    private final String identifier;
    private final ResourceLink<EntryResource<CtaButton>> primaryCta;
    private final ResourceLink<EntryResource<CtaButton>> secondaryCta;
    private final String title;

    public static /* synthetic */ ProductUpsellResource copy$default(ProductUpsellResource productUpsellResource, String str, ResourceLink resourceLink, String str2, ResourceLink resourceLink2, ResourceLink resourceLink3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productUpsellResource.body;
        }
        if ((i & 2) != 0) {
            resourceLink = productUpsellResource.headerImage;
        }
        if ((i & 4) != 0) {
            str2 = productUpsellResource.identifier;
        }
        if ((i & 8) != 0) {
            resourceLink2 = productUpsellResource.primaryCta;
        }
        if ((i & 16) != 0) {
            resourceLink3 = productUpsellResource.secondaryCta;
        }
        if ((i & 32) != 0) {
            str3 = productUpsellResource.title;
        }
        ResourceLink resourceLink4 = resourceLink3;
        String str4 = str3;
        return productUpsellResource.copy(str, resourceLink, str2, resourceLink2, resourceLink4, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final ResourceLink<AssetResource<?>> component2() {
        return this.headerImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    public final ResourceLink<EntryResource<CtaButton>> component4() {
        return this.primaryCta;
    }

    public final ResourceLink<EntryResource<CtaButton>> component5() {
        return this.secondaryCta;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ProductUpsellResource copy(String body, ResourceLink<AssetResource<?>> headerImage, String identifier, ResourceLink<EntryResource<CtaButton>> primaryCta, ResourceLink<EntryResource<CtaButton>> secondaryCta, String title) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(title, "title");
        return new ProductUpsellResource(body, headerImage, identifier, primaryCta, secondaryCta, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUpsellResource)) {
            return false;
        }
        ProductUpsellResource productUpsellResource = (ProductUpsellResource) other;
        return Intrinsics.areEqual(this.body, productUpsellResource.body) && Intrinsics.areEqual(this.headerImage, productUpsellResource.headerImage) && Intrinsics.areEqual(this.identifier, productUpsellResource.identifier) && Intrinsics.areEqual(this.primaryCta, productUpsellResource.primaryCta) && Intrinsics.areEqual(this.secondaryCta, productUpsellResource.secondaryCta) && Intrinsics.areEqual(this.title, productUpsellResource.title);
    }

    public int hashCode() {
        int iHashCode = ((((((this.body.hashCode() * 31) + this.headerImage.hashCode()) * 31) + this.identifier.hashCode()) * 31) + this.primaryCta.hashCode()) * 31;
        ResourceLink<EntryResource<CtaButton>> resourceLink = this.secondaryCta;
        return ((iHashCode + (resourceLink == null ? 0 : resourceLink.hashCode())) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "ProductUpsellResource(body=" + this.body + ", headerImage=" + this.headerImage + ", identifier=" + this.identifier + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", title=" + this.title + ")";
    }

    public ProductUpsellResource(String body, ResourceLink<AssetResource<?>> headerImage, String identifier, ResourceLink<EntryResource<CtaButton>> primaryCta, ResourceLink<EntryResource<CtaButton>> resourceLink, String title) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(title, "title");
        this.body = body;
        this.headerImage = headerImage;
        this.identifier = identifier;
        this.primaryCta = primaryCta;
        this.secondaryCta = resourceLink;
        this.title = title;
    }

    public final String getBody() {
        return this.body;
    }

    public final ResourceLink<AssetResource<?>> getHeaderImage() {
        return this.headerImage;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ResourceLink<EntryResource<CtaButton>> getPrimaryCta() {
        return this.primaryCta;
    }

    public final ResourceLink<EntryResource<CtaButton>> getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getTitle() {
        return this.title;
    }

    /* compiled from: ProductUpsellResource.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productupsell/ProductUpsellResource$CtaButton;", "", "actionType", "", "actionUri", "title", "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "getActionUri", "getTitle", "getIdentifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CtaButton {
        public static final String CONTENT_TYPE_ID = "productUpsellCta";
        private final String actionType;
        private final String actionUri;
        private final String identifier;
        private final String title;

        public static /* synthetic */ CtaButton copy$default(CtaButton ctaButton, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ctaButton.actionType;
            }
            if ((i & 2) != 0) {
                str2 = ctaButton.actionUri;
            }
            if ((i & 4) != 0) {
                str3 = ctaButton.title;
            }
            if ((i & 8) != 0) {
                str4 = ctaButton.identifier;
            }
            return ctaButton.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getActionType() {
            return this.actionType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getActionUri() {
            return this.actionUri;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final CtaButton copy(String actionType, String actionUri, String title, String identifier) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new CtaButton(actionType, actionUri, title, identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CtaButton)) {
                return false;
            }
            CtaButton ctaButton = (CtaButton) other;
            return Intrinsics.areEqual(this.actionType, ctaButton.actionType) && Intrinsics.areEqual(this.actionUri, ctaButton.actionUri) && Intrinsics.areEqual(this.title, ctaButton.title) && Intrinsics.areEqual(this.identifier, ctaButton.identifier);
        }

        public int hashCode() {
            int iHashCode = this.actionType.hashCode() * 31;
            String str = this.actionUri;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.identifier.hashCode();
        }

        public String toString() {
            return "CtaButton(actionType=" + this.actionType + ", actionUri=" + this.actionUri + ", title=" + this.title + ", identifier=" + this.identifier + ")";
        }

        public CtaButton(String actionType, String str, String title, String identifier) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.actionType = actionType;
            this.actionUri = str;
            this.title = title;
            this.identifier = identifier;
        }

        public final String getActionType() {
            return this.actionType;
        }

        public final String getActionUri() {
            return this.actionUri;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }
}
