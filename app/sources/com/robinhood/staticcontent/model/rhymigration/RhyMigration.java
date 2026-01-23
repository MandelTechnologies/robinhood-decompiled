package com.robinhood.staticcontent.model.rhymigration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.FancyAgreement;
import com.robinhood.staticcontent.model.MobileContentPage;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMigration.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003HÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003HÆ\u0003J\u0015\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003HÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003HÆ\u0003J\u0015\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003HÆ\u0003J\u0017\u00101\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0004\u0018\u00010\u0003HÆ\u0003J\u0095\u0002\u00103\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0014\b\u0002\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000205HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001J\u0016\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000205R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u001f\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001f\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b¨\u0006B"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigration;", "Landroid/os/Parcelable;", "featurePage1", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationFeaturePage;", "featurePage2", "featurePage3", "contrastPage", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationContrastPage;", "reviewPage", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationReviewPage;", "cardPageAndroidPhysical", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCardPage;", "cardPageAndroidVirtual", "agreement1", "Lcom/robinhood/staticcontent/model/FancyAgreement;", "agreement2", "loadingAnimation", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationLoadingAnimation;", "cmShutdownUpsellPage", "Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCmShutdownUpsell;", "optOutPage", "Lcom/robinhood/staticcontent/model/MobileContentPage;", "<init>", "(Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;)V", "getFeaturePage1", "()Lcom/robinhood/contentful/model/ResourceLink;", "getFeaturePage2", "getFeaturePage3", "getContrastPage", "getReviewPage", "getCardPageAndroidPhysical", "getCardPageAndroidVirtual", "getAgreement1", "getAgreement2", "getLoadingAnimation", "getCmShutdownUpsellPage", "getOptOutPage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhyMigration implements Parcelable {
    public static final Parcelable.Creator<RhyMigration> CREATOR = new Creator();
    private final ResourceLink<EntryResource<FancyAgreement>> agreement1;
    private final ResourceLink<EntryResource<FancyAgreement>> agreement2;
    private final ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidPhysical;
    private final ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidVirtual;
    private final ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> cmShutdownUpsellPage;
    private final ResourceLink<EntryResource<RhyMigrationContrastPage>> contrastPage;
    private final ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage1;
    private final ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage2;
    private final ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage3;
    private final ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> loadingAnimation;
    private final ResourceLink<EntryResource<MobileContentPage>> optOutPage;
    private final ResourceLink<EntryResource<RhyMigrationReviewPage>> reviewPage;

    /* compiled from: RhyMigration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<RhyMigration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyMigration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RhyMigration((ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()), (ResourceLink) parcel.readParcelable(RhyMigration.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyMigration[] newArray(int i) {
            return new RhyMigration[i];
        }
    }

    public static /* synthetic */ RhyMigration copy$default(RhyMigration rhyMigration, ResourceLink resourceLink, ResourceLink resourceLink2, ResourceLink resourceLink3, ResourceLink resourceLink4, ResourceLink resourceLink5, ResourceLink resourceLink6, ResourceLink resourceLink7, ResourceLink resourceLink8, ResourceLink resourceLink9, ResourceLink resourceLink10, ResourceLink resourceLink11, ResourceLink resourceLink12, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceLink = rhyMigration.featurePage1;
        }
        if ((i & 2) != 0) {
            resourceLink2 = rhyMigration.featurePage2;
        }
        if ((i & 4) != 0) {
            resourceLink3 = rhyMigration.featurePage3;
        }
        if ((i & 8) != 0) {
            resourceLink4 = rhyMigration.contrastPage;
        }
        if ((i & 16) != 0) {
            resourceLink5 = rhyMigration.reviewPage;
        }
        if ((i & 32) != 0) {
            resourceLink6 = rhyMigration.cardPageAndroidPhysical;
        }
        if ((i & 64) != 0) {
            resourceLink7 = rhyMigration.cardPageAndroidVirtual;
        }
        if ((i & 128) != 0) {
            resourceLink8 = rhyMigration.agreement1;
        }
        if ((i & 256) != 0) {
            resourceLink9 = rhyMigration.agreement2;
        }
        if ((i & 512) != 0) {
            resourceLink10 = rhyMigration.loadingAnimation;
        }
        if ((i & 1024) != 0) {
            resourceLink11 = rhyMigration.cmShutdownUpsellPage;
        }
        if ((i & 2048) != 0) {
            resourceLink12 = rhyMigration.optOutPage;
        }
        ResourceLink resourceLink13 = resourceLink11;
        ResourceLink resourceLink14 = resourceLink12;
        ResourceLink resourceLink15 = resourceLink9;
        ResourceLink resourceLink16 = resourceLink10;
        ResourceLink resourceLink17 = resourceLink7;
        ResourceLink resourceLink18 = resourceLink8;
        ResourceLink resourceLink19 = resourceLink5;
        ResourceLink resourceLink20 = resourceLink6;
        return rhyMigration.copy(resourceLink, resourceLink2, resourceLink3, resourceLink4, resourceLink19, resourceLink20, resourceLink17, resourceLink18, resourceLink15, resourceLink16, resourceLink13, resourceLink14);
    }

    public final ResourceLink<EntryResource<RhyMigrationFeaturePage>> component1() {
        return this.featurePage1;
    }

    public final ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> component10() {
        return this.loadingAnimation;
    }

    public final ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> component11() {
        return this.cmShutdownUpsellPage;
    }

    public final ResourceLink<EntryResource<MobileContentPage>> component12() {
        return this.optOutPage;
    }

    public final ResourceLink<EntryResource<RhyMigrationFeaturePage>> component2() {
        return this.featurePage2;
    }

    public final ResourceLink<EntryResource<RhyMigrationFeaturePage>> component3() {
        return this.featurePage3;
    }

    public final ResourceLink<EntryResource<RhyMigrationContrastPage>> component4() {
        return this.contrastPage;
    }

    public final ResourceLink<EntryResource<RhyMigrationReviewPage>> component5() {
        return this.reviewPage;
    }

    public final ResourceLink<EntryResource<RhyMigrationCardPage>> component6() {
        return this.cardPageAndroidPhysical;
    }

    public final ResourceLink<EntryResource<RhyMigrationCardPage>> component7() {
        return this.cardPageAndroidVirtual;
    }

    public final ResourceLink<EntryResource<FancyAgreement>> component8() {
        return this.agreement1;
    }

    public final ResourceLink<EntryResource<FancyAgreement>> component9() {
        return this.agreement2;
    }

    public final RhyMigration copy(ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage1, ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage2, ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage3, ResourceLink<EntryResource<RhyMigrationContrastPage>> contrastPage, ResourceLink<EntryResource<RhyMigrationReviewPage>> reviewPage, ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidPhysical, ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidVirtual, ResourceLink<EntryResource<FancyAgreement>> agreement1, ResourceLink<EntryResource<FancyAgreement>> agreement2, ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> loadingAnimation, ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> cmShutdownUpsellPage, ResourceLink<EntryResource<MobileContentPage>> optOutPage) {
        Intrinsics.checkNotNullParameter(featurePage1, "featurePage1");
        Intrinsics.checkNotNullParameter(featurePage2, "featurePage2");
        Intrinsics.checkNotNullParameter(featurePage3, "featurePage3");
        Intrinsics.checkNotNullParameter(contrastPage, "contrastPage");
        Intrinsics.checkNotNullParameter(reviewPage, "reviewPage");
        Intrinsics.checkNotNullParameter(cardPageAndroidPhysical, "cardPageAndroidPhysical");
        Intrinsics.checkNotNullParameter(cardPageAndroidVirtual, "cardPageAndroidVirtual");
        Intrinsics.checkNotNullParameter(agreement1, "agreement1");
        Intrinsics.checkNotNullParameter(agreement2, "agreement2");
        Intrinsics.checkNotNullParameter(loadingAnimation, "loadingAnimation");
        return new RhyMigration(featurePage1, featurePage2, featurePage3, contrastPage, reviewPage, cardPageAndroidPhysical, cardPageAndroidVirtual, agreement1, agreement2, loadingAnimation, cmShutdownUpsellPage, optOutPage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMigration)) {
            return false;
        }
        RhyMigration rhyMigration = (RhyMigration) other;
        return Intrinsics.areEqual(this.featurePage1, rhyMigration.featurePage1) && Intrinsics.areEqual(this.featurePage2, rhyMigration.featurePage2) && Intrinsics.areEqual(this.featurePage3, rhyMigration.featurePage3) && Intrinsics.areEqual(this.contrastPage, rhyMigration.contrastPage) && Intrinsics.areEqual(this.reviewPage, rhyMigration.reviewPage) && Intrinsics.areEqual(this.cardPageAndroidPhysical, rhyMigration.cardPageAndroidPhysical) && Intrinsics.areEqual(this.cardPageAndroidVirtual, rhyMigration.cardPageAndroidVirtual) && Intrinsics.areEqual(this.agreement1, rhyMigration.agreement1) && Intrinsics.areEqual(this.agreement2, rhyMigration.agreement2) && Intrinsics.areEqual(this.loadingAnimation, rhyMigration.loadingAnimation) && Intrinsics.areEqual(this.cmShutdownUpsellPage, rhyMigration.cmShutdownUpsellPage) && Intrinsics.areEqual(this.optOutPage, rhyMigration.optOutPage);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.featurePage1.hashCode() * 31) + this.featurePage2.hashCode()) * 31) + this.featurePage3.hashCode()) * 31) + this.contrastPage.hashCode()) * 31) + this.reviewPage.hashCode()) * 31) + this.cardPageAndroidPhysical.hashCode()) * 31) + this.cardPageAndroidVirtual.hashCode()) * 31) + this.agreement1.hashCode()) * 31) + this.agreement2.hashCode()) * 31) + this.loadingAnimation.hashCode()) * 31;
        ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> resourceLink = this.cmShutdownUpsellPage;
        int iHashCode2 = (iHashCode + (resourceLink == null ? 0 : resourceLink.hashCode())) * 31;
        ResourceLink<EntryResource<MobileContentPage>> resourceLink2 = this.optOutPage;
        return iHashCode2 + (resourceLink2 != null ? resourceLink2.hashCode() : 0);
    }

    public String toString() {
        return "RhyMigration(featurePage1=" + this.featurePage1 + ", featurePage2=" + this.featurePage2 + ", featurePage3=" + this.featurePage3 + ", contrastPage=" + this.contrastPage + ", reviewPage=" + this.reviewPage + ", cardPageAndroidPhysical=" + this.cardPageAndroidPhysical + ", cardPageAndroidVirtual=" + this.cardPageAndroidVirtual + ", agreement1=" + this.agreement1 + ", agreement2=" + this.agreement2 + ", loadingAnimation=" + this.loadingAnimation + ", cmShutdownUpsellPage=" + this.cmShutdownUpsellPage + ", optOutPage=" + this.optOutPage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.featurePage1, flags);
        dest.writeParcelable(this.featurePage2, flags);
        dest.writeParcelable(this.featurePage3, flags);
        dest.writeParcelable(this.contrastPage, flags);
        dest.writeParcelable(this.reviewPage, flags);
        dest.writeParcelable(this.cardPageAndroidPhysical, flags);
        dest.writeParcelable(this.cardPageAndroidVirtual, flags);
        dest.writeParcelable(this.agreement1, flags);
        dest.writeParcelable(this.agreement2, flags);
        dest.writeParcelable(this.loadingAnimation, flags);
        dest.writeParcelable(this.cmShutdownUpsellPage, flags);
        dest.writeParcelable(this.optOutPage, flags);
    }

    public RhyMigration(ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage1, ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage2, ResourceLink<EntryResource<RhyMigrationFeaturePage>> featurePage3, ResourceLink<EntryResource<RhyMigrationContrastPage>> contrastPage, ResourceLink<EntryResource<RhyMigrationReviewPage>> reviewPage, ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidPhysical, ResourceLink<EntryResource<RhyMigrationCardPage>> cardPageAndroidVirtual, ResourceLink<EntryResource<FancyAgreement>> agreement1, ResourceLink<EntryResource<FancyAgreement>> agreement2, ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> loadingAnimation, ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> resourceLink, ResourceLink<EntryResource<MobileContentPage>> resourceLink2) {
        Intrinsics.checkNotNullParameter(featurePage1, "featurePage1");
        Intrinsics.checkNotNullParameter(featurePage2, "featurePage2");
        Intrinsics.checkNotNullParameter(featurePage3, "featurePage3");
        Intrinsics.checkNotNullParameter(contrastPage, "contrastPage");
        Intrinsics.checkNotNullParameter(reviewPage, "reviewPage");
        Intrinsics.checkNotNullParameter(cardPageAndroidPhysical, "cardPageAndroidPhysical");
        Intrinsics.checkNotNullParameter(cardPageAndroidVirtual, "cardPageAndroidVirtual");
        Intrinsics.checkNotNullParameter(agreement1, "agreement1");
        Intrinsics.checkNotNullParameter(agreement2, "agreement2");
        Intrinsics.checkNotNullParameter(loadingAnimation, "loadingAnimation");
        this.featurePage1 = featurePage1;
        this.featurePage2 = featurePage2;
        this.featurePage3 = featurePage3;
        this.contrastPage = contrastPage;
        this.reviewPage = reviewPage;
        this.cardPageAndroidPhysical = cardPageAndroidPhysical;
        this.cardPageAndroidVirtual = cardPageAndroidVirtual;
        this.agreement1 = agreement1;
        this.agreement2 = agreement2;
        this.loadingAnimation = loadingAnimation;
        this.cmShutdownUpsellPage = resourceLink;
        this.optOutPage = resourceLink2;
    }

    public final ResourceLink<EntryResource<RhyMigrationFeaturePage>> getFeaturePage1() {
        return this.featurePage1;
    }

    public final ResourceLink<EntryResource<RhyMigrationFeaturePage>> getFeaturePage2() {
        return this.featurePage2;
    }

    public final ResourceLink<EntryResource<RhyMigrationFeaturePage>> getFeaturePage3() {
        return this.featurePage3;
    }

    public final ResourceLink<EntryResource<RhyMigrationContrastPage>> getContrastPage() {
        return this.contrastPage;
    }

    public final ResourceLink<EntryResource<RhyMigrationReviewPage>> getReviewPage() {
        return this.reviewPage;
    }

    public final ResourceLink<EntryResource<RhyMigrationCardPage>> getCardPageAndroidPhysical() {
        return this.cardPageAndroidPhysical;
    }

    public final ResourceLink<EntryResource<RhyMigrationCardPage>> getCardPageAndroidVirtual() {
        return this.cardPageAndroidVirtual;
    }

    public final ResourceLink<EntryResource<FancyAgreement>> getAgreement1() {
        return this.agreement1;
    }

    public final ResourceLink<EntryResource<FancyAgreement>> getAgreement2() {
        return this.agreement2;
    }

    public final ResourceLink<EntryResource<RhyMigrationLoadingAnimation>> getLoadingAnimation() {
        return this.loadingAnimation;
    }

    public final ResourceLink<EntryResource<RhyMigrationCmShutdownUpsell>> getCmShutdownUpsellPage() {
        return this.cmShutdownUpsellPage;
    }

    public final ResourceLink<EntryResource<MobileContentPage>> getOptOutPage() {
        return this.optOutPage;
    }
}
