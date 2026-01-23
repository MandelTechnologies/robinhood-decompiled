package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.minerva.RhyMigrationVariables;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigration.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0012HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0085\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0006\u0010;\u001a\u00020<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020<HÖ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020<R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "Landroid/os/Parcelable;", "featurePage1", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "featurePage2", "featurePage3", "contrastPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "reviewPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "cardPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "agreement1", "Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;", "agreement2", "loadingAnimation", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "variables", "Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "upsellPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;", "optOutPage", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdown;", "<init>", "(Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;Lcom/robinhood/models/api/minerva/RhyMigrationVariables;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdown;)V", "getFeaturePage1", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "getFeaturePage2", "getFeaturePage3", "getContrastPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "getReviewPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "getCardPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "getAgreement1", "()Lcom/robinhood/android/rhymigration/model/UiFancyAgreementBrief;", "getAgreement2", "getLoadingAnimation", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "getVariables", "()Lcom/robinhood/models/api/minerva/RhyMigrationVariables;", "getUpsellPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;", "getOptOutPage", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdown;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigration implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigration> CREATOR = new Creator();
    private final UiFancyAgreementBrief agreement1;
    private final UiFancyAgreementBrief agreement2;
    private final UiRhyMigrationCardPage cardPage;
    private final UiRhyMigrationContrastPage contrastPage;
    private final UiRhyMigrationFeaturePage featurePage1;
    private final UiRhyMigrationFeaturePage featurePage2;
    private final UiRhyMigrationFeaturePage featurePage3;
    private final UiRhyMigrationLoadingAnimation loadingAnimation;
    private final UiRhyMigrationCmShutdown optOutPage;
    private final UiRhyMigrationReviewPage reviewPage;
    private final UiRhyMigrationCmShutdownUpsell upsellPage;
    private final RhyMigrationVariables variables;

    /* compiled from: UiRhyMigration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigration createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<UiRhyMigrationFeaturePage> creator = UiRhyMigrationFeaturePage.CREATOR;
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePageCreateFromParcel = creator.createFromParcel(parcel);
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePageCreateFromParcel2 = creator.createFromParcel(parcel);
            UiRhyMigrationFeaturePage uiRhyMigrationFeaturePageCreateFromParcel3 = creator.createFromParcel(parcel);
            UiRhyMigrationContrastPage uiRhyMigrationContrastPageCreateFromParcel = UiRhyMigrationContrastPage.CREATOR.createFromParcel(parcel);
            UiRhyMigrationReviewPage uiRhyMigrationReviewPageCreateFromParcel = UiRhyMigrationReviewPage.CREATOR.createFromParcel(parcel);
            UiRhyMigrationCardPage uiRhyMigrationCardPageCreateFromParcel = UiRhyMigrationCardPage.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<UiFancyAgreementBrief> creator2 = UiFancyAgreementBrief.CREATOR;
            return new UiRhyMigration(uiRhyMigrationFeaturePageCreateFromParcel, uiRhyMigrationFeaturePageCreateFromParcel2, uiRhyMigrationFeaturePageCreateFromParcel3, uiRhyMigrationContrastPageCreateFromParcel, uiRhyMigrationReviewPageCreateFromParcel, uiRhyMigrationCardPageCreateFromParcel, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), UiRhyMigrationLoadingAnimation.CREATOR.createFromParcel(parcel), (RhyMigrationVariables) parcel.readParcelable(UiRhyMigration.class.getClassLoader()), parcel.readInt() == 0 ? null : UiRhyMigrationCmShutdownUpsell.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UiRhyMigrationCmShutdown.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigration[] newArray(int i) {
            return new UiRhyMigration[i];
        }
    }

    public static /* synthetic */ UiRhyMigration copy$default(UiRhyMigration uiRhyMigration, UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage, UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage2, UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage3, UiRhyMigrationContrastPage uiRhyMigrationContrastPage, UiRhyMigrationReviewPage uiRhyMigrationReviewPage, UiRhyMigrationCardPage uiRhyMigrationCardPage, UiFancyAgreementBrief uiFancyAgreementBrief, UiFancyAgreementBrief uiFancyAgreementBrief2, UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation, RhyMigrationVariables rhyMigrationVariables, UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell, UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown, int i, Object obj) {
        if ((i & 1) != 0) {
            uiRhyMigrationFeaturePage = uiRhyMigration.featurePage1;
        }
        if ((i & 2) != 0) {
            uiRhyMigrationFeaturePage2 = uiRhyMigration.featurePage2;
        }
        if ((i & 4) != 0) {
            uiRhyMigrationFeaturePage3 = uiRhyMigration.featurePage3;
        }
        if ((i & 8) != 0) {
            uiRhyMigrationContrastPage = uiRhyMigration.contrastPage;
        }
        if ((i & 16) != 0) {
            uiRhyMigrationReviewPage = uiRhyMigration.reviewPage;
        }
        if ((i & 32) != 0) {
            uiRhyMigrationCardPage = uiRhyMigration.cardPage;
        }
        if ((i & 64) != 0) {
            uiFancyAgreementBrief = uiRhyMigration.agreement1;
        }
        if ((i & 128) != 0) {
            uiFancyAgreementBrief2 = uiRhyMigration.agreement2;
        }
        if ((i & 256) != 0) {
            uiRhyMigrationLoadingAnimation = uiRhyMigration.loadingAnimation;
        }
        if ((i & 512) != 0) {
            rhyMigrationVariables = uiRhyMigration.variables;
        }
        if ((i & 1024) != 0) {
            uiRhyMigrationCmShutdownUpsell = uiRhyMigration.upsellPage;
        }
        if ((i & 2048) != 0) {
            uiRhyMigrationCmShutdown = uiRhyMigration.optOutPage;
        }
        UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell2 = uiRhyMigrationCmShutdownUpsell;
        UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown2 = uiRhyMigrationCmShutdown;
        UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation2 = uiRhyMigrationLoadingAnimation;
        RhyMigrationVariables rhyMigrationVariables2 = rhyMigrationVariables;
        UiFancyAgreementBrief uiFancyAgreementBrief3 = uiFancyAgreementBrief;
        UiFancyAgreementBrief uiFancyAgreementBrief4 = uiFancyAgreementBrief2;
        UiRhyMigrationReviewPage uiRhyMigrationReviewPage2 = uiRhyMigrationReviewPage;
        UiRhyMigrationCardPage uiRhyMigrationCardPage2 = uiRhyMigrationCardPage;
        return uiRhyMigration.copy(uiRhyMigrationFeaturePage, uiRhyMigrationFeaturePage2, uiRhyMigrationFeaturePage3, uiRhyMigrationContrastPage, uiRhyMigrationReviewPage2, uiRhyMigrationCardPage2, uiFancyAgreementBrief3, uiFancyAgreementBrief4, uiRhyMigrationLoadingAnimation2, rhyMigrationVariables2, uiRhyMigrationCmShutdownUpsell2, uiRhyMigrationCmShutdown2);
    }

    /* renamed from: component1, reason: from getter */
    public final UiRhyMigrationFeaturePage getFeaturePage1() {
        return this.featurePage1;
    }

    /* renamed from: component10, reason: from getter */
    public final RhyMigrationVariables getVariables() {
        return this.variables;
    }

    /* renamed from: component11, reason: from getter */
    public final UiRhyMigrationCmShutdownUpsell getUpsellPage() {
        return this.upsellPage;
    }

    /* renamed from: component12, reason: from getter */
    public final UiRhyMigrationCmShutdown getOptOutPage() {
        return this.optOutPage;
    }

    /* renamed from: component2, reason: from getter */
    public final UiRhyMigrationFeaturePage getFeaturePage2() {
        return this.featurePage2;
    }

    /* renamed from: component3, reason: from getter */
    public final UiRhyMigrationFeaturePage getFeaturePage3() {
        return this.featurePage3;
    }

    /* renamed from: component4, reason: from getter */
    public final UiRhyMigrationContrastPage getContrastPage() {
        return this.contrastPage;
    }

    /* renamed from: component5, reason: from getter */
    public final UiRhyMigrationReviewPage getReviewPage() {
        return this.reviewPage;
    }

    /* renamed from: component6, reason: from getter */
    public final UiRhyMigrationCardPage getCardPage() {
        return this.cardPage;
    }

    /* renamed from: component7, reason: from getter */
    public final UiFancyAgreementBrief getAgreement1() {
        return this.agreement1;
    }

    /* renamed from: component8, reason: from getter */
    public final UiFancyAgreementBrief getAgreement2() {
        return this.agreement2;
    }

    /* renamed from: component9, reason: from getter */
    public final UiRhyMigrationLoadingAnimation getLoadingAnimation() {
        return this.loadingAnimation;
    }

    public final UiRhyMigration copy(UiRhyMigrationFeaturePage featurePage1, UiRhyMigrationFeaturePage featurePage2, UiRhyMigrationFeaturePage featurePage3, UiRhyMigrationContrastPage contrastPage, UiRhyMigrationReviewPage reviewPage, UiRhyMigrationCardPage cardPage, UiFancyAgreementBrief agreement1, UiFancyAgreementBrief agreement2, UiRhyMigrationLoadingAnimation loadingAnimation, RhyMigrationVariables variables, UiRhyMigrationCmShutdownUpsell upsellPage, UiRhyMigrationCmShutdown optOutPage) {
        Intrinsics.checkNotNullParameter(featurePage1, "featurePage1");
        Intrinsics.checkNotNullParameter(featurePage2, "featurePage2");
        Intrinsics.checkNotNullParameter(featurePage3, "featurePage3");
        Intrinsics.checkNotNullParameter(contrastPage, "contrastPage");
        Intrinsics.checkNotNullParameter(reviewPage, "reviewPage");
        Intrinsics.checkNotNullParameter(cardPage, "cardPage");
        Intrinsics.checkNotNullParameter(agreement1, "agreement1");
        Intrinsics.checkNotNullParameter(agreement2, "agreement2");
        Intrinsics.checkNotNullParameter(loadingAnimation, "loadingAnimation");
        Intrinsics.checkNotNullParameter(variables, "variables");
        return new UiRhyMigration(featurePage1, featurePage2, featurePage3, contrastPage, reviewPage, cardPage, agreement1, agreement2, loadingAnimation, variables, upsellPage, optOutPage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigration)) {
            return false;
        }
        UiRhyMigration uiRhyMigration = (UiRhyMigration) other;
        return Intrinsics.areEqual(this.featurePage1, uiRhyMigration.featurePage1) && Intrinsics.areEqual(this.featurePage2, uiRhyMigration.featurePage2) && Intrinsics.areEqual(this.featurePage3, uiRhyMigration.featurePage3) && Intrinsics.areEqual(this.contrastPage, uiRhyMigration.contrastPage) && Intrinsics.areEqual(this.reviewPage, uiRhyMigration.reviewPage) && Intrinsics.areEqual(this.cardPage, uiRhyMigration.cardPage) && Intrinsics.areEqual(this.agreement1, uiRhyMigration.agreement1) && Intrinsics.areEqual(this.agreement2, uiRhyMigration.agreement2) && Intrinsics.areEqual(this.loadingAnimation, uiRhyMigration.loadingAnimation) && Intrinsics.areEqual(this.variables, uiRhyMigration.variables) && Intrinsics.areEqual(this.upsellPage, uiRhyMigration.upsellPage) && Intrinsics.areEqual(this.optOutPage, uiRhyMigration.optOutPage);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.featurePage1.hashCode() * 31) + this.featurePage2.hashCode()) * 31) + this.featurePage3.hashCode()) * 31) + this.contrastPage.hashCode()) * 31) + this.reviewPage.hashCode()) * 31) + this.cardPage.hashCode()) * 31) + this.agreement1.hashCode()) * 31) + this.agreement2.hashCode()) * 31) + this.loadingAnimation.hashCode()) * 31) + this.variables.hashCode()) * 31;
        UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell = this.upsellPage;
        int iHashCode2 = (iHashCode + (uiRhyMigrationCmShutdownUpsell == null ? 0 : uiRhyMigrationCmShutdownUpsell.hashCode())) * 31;
        UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown = this.optOutPage;
        return iHashCode2 + (uiRhyMigrationCmShutdown != null ? uiRhyMigrationCmShutdown.hashCode() : 0);
    }

    public String toString() {
        return "UiRhyMigration(featurePage1=" + this.featurePage1 + ", featurePage2=" + this.featurePage2 + ", featurePage3=" + this.featurePage3 + ", contrastPage=" + this.contrastPage + ", reviewPage=" + this.reviewPage + ", cardPage=" + this.cardPage + ", agreement1=" + this.agreement1 + ", agreement2=" + this.agreement2 + ", loadingAnimation=" + this.loadingAnimation + ", variables=" + this.variables + ", upsellPage=" + this.upsellPage + ", optOutPage=" + this.optOutPage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.featurePage1.writeToParcel(dest, flags);
        this.featurePage2.writeToParcel(dest, flags);
        this.featurePage3.writeToParcel(dest, flags);
        this.contrastPage.writeToParcel(dest, flags);
        this.reviewPage.writeToParcel(dest, flags);
        this.cardPage.writeToParcel(dest, flags);
        this.agreement1.writeToParcel(dest, flags);
        this.agreement2.writeToParcel(dest, flags);
        this.loadingAnimation.writeToParcel(dest, flags);
        dest.writeParcelable(this.variables, flags);
        UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell = this.upsellPage;
        if (uiRhyMigrationCmShutdownUpsell == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uiRhyMigrationCmShutdownUpsell.writeToParcel(dest, flags);
        }
        UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown = this.optOutPage;
        if (uiRhyMigrationCmShutdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uiRhyMigrationCmShutdown.writeToParcel(dest, flags);
        }
    }

    public UiRhyMigration(UiRhyMigrationFeaturePage featurePage1, UiRhyMigrationFeaturePage featurePage2, UiRhyMigrationFeaturePage featurePage3, UiRhyMigrationContrastPage contrastPage, UiRhyMigrationReviewPage reviewPage, UiRhyMigrationCardPage cardPage, UiFancyAgreementBrief agreement1, UiFancyAgreementBrief agreement2, UiRhyMigrationLoadingAnimation loadingAnimation, RhyMigrationVariables variables, UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell, UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown) {
        Intrinsics.checkNotNullParameter(featurePage1, "featurePage1");
        Intrinsics.checkNotNullParameter(featurePage2, "featurePage2");
        Intrinsics.checkNotNullParameter(featurePage3, "featurePage3");
        Intrinsics.checkNotNullParameter(contrastPage, "contrastPage");
        Intrinsics.checkNotNullParameter(reviewPage, "reviewPage");
        Intrinsics.checkNotNullParameter(cardPage, "cardPage");
        Intrinsics.checkNotNullParameter(agreement1, "agreement1");
        Intrinsics.checkNotNullParameter(agreement2, "agreement2");
        Intrinsics.checkNotNullParameter(loadingAnimation, "loadingAnimation");
        Intrinsics.checkNotNullParameter(variables, "variables");
        this.featurePage1 = featurePage1;
        this.featurePage2 = featurePage2;
        this.featurePage3 = featurePage3;
        this.contrastPage = contrastPage;
        this.reviewPage = reviewPage;
        this.cardPage = cardPage;
        this.agreement1 = agreement1;
        this.agreement2 = agreement2;
        this.loadingAnimation = loadingAnimation;
        this.variables = variables;
        this.upsellPage = uiRhyMigrationCmShutdownUpsell;
        this.optOutPage = uiRhyMigrationCmShutdown;
    }

    public final UiRhyMigrationFeaturePage getFeaturePage1() {
        return this.featurePage1;
    }

    public final UiRhyMigrationFeaturePage getFeaturePage2() {
        return this.featurePage2;
    }

    public final UiRhyMigrationFeaturePage getFeaturePage3() {
        return this.featurePage3;
    }

    public final UiRhyMigrationContrastPage getContrastPage() {
        return this.contrastPage;
    }

    public final UiRhyMigrationReviewPage getReviewPage() {
        return this.reviewPage;
    }

    public final UiRhyMigrationCardPage getCardPage() {
        return this.cardPage;
    }

    public final UiFancyAgreementBrief getAgreement1() {
        return this.agreement1;
    }

    public final UiFancyAgreementBrief getAgreement2() {
        return this.agreement2;
    }

    public final UiRhyMigrationLoadingAnimation getLoadingAnimation() {
        return this.loadingAnimation;
    }

    public final RhyMigrationVariables getVariables() {
        return this.variables;
    }

    public final UiRhyMigrationCmShutdownUpsell getUpsellPage() {
        return this.upsellPage;
    }

    public final UiRhyMigrationCmShutdown getOptOutPage() {
        return this.optOutPage;
    }
}
