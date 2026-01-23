package com.robinhood.android.resumeapplication;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.models.api.bonfire.ChurnedFundingV2Content;
import com.robinhood.models.api.bonfire.FundingUpsellContent;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse8;
import com.robinhood.models.api.bonfire.ResumeApplicationTakeoverLoggingInfo;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResumeApplication.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\t\u0010@\u001a\u00020\u001aHÆ\u0003J¡\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\u0006\u0010B\u001a\u00020CJ\u0013\u0010D\u001a\u00020\u00062\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020CHÖ\u0001J\t\u0010H\u001a\u00020\bHÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020CR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplication;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "variant", "Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "showWelcomeBack", "", "firstName", "", "title", "subtitle", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "fundingUpsellContent", "Lcom/robinhood/models/api/bonfire/FundingUpsellContent;", "churnedFundingV2Content", "Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;", "fundingUpsellVariant", "welcomeBackBackgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "welcomeBackImageSource", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "detailsScreenContent", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "takeoverLoggingInfo", "Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "<init>", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/RichText;Lcom/robinhood/models/api/bonfire/FundingUpsellContent;Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;)V", "getVariant", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "getShowWelcomeBack", "()Z", "getFirstName", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDisclosure", "()Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "getFundingUpsellContent", "()Lcom/robinhood/models/api/bonfire/FundingUpsellContent;", "getChurnedFundingV2Content", "()Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;", "getFundingUpsellVariant", "getWelcomeBackBackgroundColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "getWelcomeBackImageSource", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedImageSource;", "getDetailsScreenContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getTakeoverLoggingInfo", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ResumeApplication implements IntentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ResumeApplication> CREATOR = new Creator();
    private final ChurnedFundingV2Content churnedFundingV2Content;
    private final StandardPageTemplate<GenericAction> detailsScreenContent;
    private final RichText disclosure;
    private final String firstName;
    private final FundingUpsellContent fundingUpsellContent;
    private final String fundingUpsellVariant;
    private final boolean showWelcomeBack;
    private final String subtitle;
    private final ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo;
    private final String title;
    private final ResumeApplicationResponse8 variant;
    private final ThemedColor welcomeBackBackgroundColor;
    private final ThemedImageSource welcomeBackImageSource;

    /* compiled from: ResumeApplication.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ResumeApplication> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResumeApplication createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResumeApplication(ResumeApplicationResponse8.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), (RichText) parcel.readParcelable(ResumeApplication.class.getClassLoader()), (FundingUpsellContent) parcel.readParcelable(ResumeApplication.class.getClassLoader()), (ChurnedFundingV2Content) parcel.readParcelable(ResumeApplication.class.getClassLoader()), parcel.readString(), (ThemedColor) parcel.readParcelable(ResumeApplication.class.getClassLoader()), (ThemedImageSource) parcel.readParcelable(ResumeApplication.class.getClassLoader()), (StandardPageTemplate) parcel.readParcelable(ResumeApplication.class.getClassLoader()), (ResumeApplicationTakeoverLoggingInfo) parcel.readParcelable(ResumeApplication.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResumeApplication[] newArray(int i) {
            return new ResumeApplication[i];
        }
    }

    public static /* synthetic */ ResumeApplication copy$default(ResumeApplication resumeApplication, ResumeApplicationResponse8 resumeApplicationResponse8, boolean z, String str, String str2, String str3, RichText richText, FundingUpsellContent fundingUpsellContent, ChurnedFundingV2Content churnedFundingV2Content, String str4, ThemedColor themedColor, ThemedImageSource themedImageSource, StandardPageTemplate standardPageTemplate, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            resumeApplicationResponse8 = resumeApplication.variant;
        }
        return resumeApplication.copy(resumeApplicationResponse8, (i & 2) != 0 ? resumeApplication.showWelcomeBack : z, (i & 4) != 0 ? resumeApplication.firstName : str, (i & 8) != 0 ? resumeApplication.title : str2, (i & 16) != 0 ? resumeApplication.subtitle : str3, (i & 32) != 0 ? resumeApplication.disclosure : richText, (i & 64) != 0 ? resumeApplication.fundingUpsellContent : fundingUpsellContent, (i & 128) != 0 ? resumeApplication.churnedFundingV2Content : churnedFundingV2Content, (i & 256) != 0 ? resumeApplication.fundingUpsellVariant : str4, (i & 512) != 0 ? resumeApplication.welcomeBackBackgroundColor : themedColor, (i & 1024) != 0 ? resumeApplication.welcomeBackImageSource : themedImageSource, (i & 2048) != 0 ? resumeApplication.detailsScreenContent : standardPageTemplate, (i & 4096) != 0 ? resumeApplication.takeoverLoggingInfo : resumeApplicationTakeoverLoggingInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final ResumeApplicationResponse8 getVariant() {
        return this.variant;
    }

    /* renamed from: component10, reason: from getter */
    public final ThemedColor getWelcomeBackBackgroundColor() {
        return this.welcomeBackBackgroundColor;
    }

    /* renamed from: component11, reason: from getter */
    public final ThemedImageSource getWelcomeBackImageSource() {
        return this.welcomeBackImageSource;
    }

    public final StandardPageTemplate<GenericAction> component12() {
        return this.detailsScreenContent;
    }

    /* renamed from: component13, reason: from getter */
    public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
        return this.takeoverLoggingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowWelcomeBack() {
        return this.showWelcomeBack;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final RichText getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component7, reason: from getter */
    public final FundingUpsellContent getFundingUpsellContent() {
        return this.fundingUpsellContent;
    }

    /* renamed from: component8, reason: from getter */
    public final ChurnedFundingV2Content getChurnedFundingV2Content() {
        return this.churnedFundingV2Content;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFundingUpsellVariant() {
        return this.fundingUpsellVariant;
    }

    public final ResumeApplication copy(ResumeApplicationResponse8 variant, boolean showWelcomeBack, String firstName, String title, String subtitle, RichText disclosure, FundingUpsellContent fundingUpsellContent, ChurnedFundingV2Content churnedFundingV2Content, String fundingUpsellVariant, ThemedColor welcomeBackBackgroundColor, ThemedImageSource welcomeBackImageSource, StandardPageTemplate<? extends GenericAction> detailsScreenContent, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
        return new ResumeApplication(variant, showWelcomeBack, firstName, title, subtitle, disclosure, fundingUpsellContent, churnedFundingV2Content, fundingUpsellVariant, welcomeBackBackgroundColor, welcomeBackImageSource, detailsScreenContent, takeoverLoggingInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumeApplication)) {
            return false;
        }
        ResumeApplication resumeApplication = (ResumeApplication) other;
        return this.variant == resumeApplication.variant && this.showWelcomeBack == resumeApplication.showWelcomeBack && Intrinsics.areEqual(this.firstName, resumeApplication.firstName) && Intrinsics.areEqual(this.title, resumeApplication.title) && Intrinsics.areEqual(this.subtitle, resumeApplication.subtitle) && Intrinsics.areEqual(this.disclosure, resumeApplication.disclosure) && Intrinsics.areEqual(this.fundingUpsellContent, resumeApplication.fundingUpsellContent) && Intrinsics.areEqual(this.churnedFundingV2Content, resumeApplication.churnedFundingV2Content) && Intrinsics.areEqual(this.fundingUpsellVariant, resumeApplication.fundingUpsellVariant) && Intrinsics.areEqual(this.welcomeBackBackgroundColor, resumeApplication.welcomeBackBackgroundColor) && Intrinsics.areEqual(this.welcomeBackImageSource, resumeApplication.welcomeBackImageSource) && Intrinsics.areEqual(this.detailsScreenContent, resumeApplication.detailsScreenContent) && Intrinsics.areEqual(this.takeoverLoggingInfo, resumeApplication.takeoverLoggingInfo);
    }

    public int hashCode() {
        int iHashCode = ((this.variant.hashCode() * 31) + Boolean.hashCode(this.showWelcomeBack)) * 31;
        String str = this.firstName;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        RichText richText = this.disclosure;
        int iHashCode3 = (iHashCode2 + (richText == null ? 0 : richText.hashCode())) * 31;
        FundingUpsellContent fundingUpsellContent = this.fundingUpsellContent;
        int iHashCode4 = (iHashCode3 + (fundingUpsellContent == null ? 0 : fundingUpsellContent.hashCode())) * 31;
        ChurnedFundingV2Content churnedFundingV2Content = this.churnedFundingV2Content;
        int iHashCode5 = (iHashCode4 + (churnedFundingV2Content == null ? 0 : churnedFundingV2Content.hashCode())) * 31;
        String str2 = this.fundingUpsellVariant;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemedColor themedColor = this.welcomeBackBackgroundColor;
        int iHashCode7 = (iHashCode6 + (themedColor == null ? 0 : themedColor.hashCode())) * 31;
        ThemedImageSource themedImageSource = this.welcomeBackImageSource;
        int iHashCode8 = (iHashCode7 + (themedImageSource == null ? 0 : themedImageSource.hashCode())) * 31;
        StandardPageTemplate<GenericAction> standardPageTemplate = this.detailsScreenContent;
        return ((iHashCode8 + (standardPageTemplate != null ? standardPageTemplate.hashCode() : 0)) * 31) + this.takeoverLoggingInfo.hashCode();
    }

    public String toString() {
        return "ResumeApplication(variant=" + this.variant + ", showWelcomeBack=" + this.showWelcomeBack + ", firstName=" + this.firstName + ", title=" + this.title + ", subtitle=" + this.subtitle + ", disclosure=" + this.disclosure + ", fundingUpsellContent=" + this.fundingUpsellContent + ", churnedFundingV2Content=" + this.churnedFundingV2Content + ", fundingUpsellVariant=" + this.fundingUpsellVariant + ", welcomeBackBackgroundColor=" + this.welcomeBackBackgroundColor + ", welcomeBackImageSource=" + this.welcomeBackImageSource + ", detailsScreenContent=" + this.detailsScreenContent + ", takeoverLoggingInfo=" + this.takeoverLoggingInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.variant.name());
        dest.writeInt(this.showWelcomeBack ? 1 : 0);
        dest.writeString(this.firstName);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeParcelable(this.disclosure, flags);
        dest.writeParcelable(this.fundingUpsellContent, flags);
        dest.writeParcelable(this.churnedFundingV2Content, flags);
        dest.writeString(this.fundingUpsellVariant);
        dest.writeParcelable(this.welcomeBackBackgroundColor, flags);
        dest.writeParcelable(this.welcomeBackImageSource, flags);
        dest.writeParcelable(this.detailsScreenContent, flags);
        dest.writeParcelable(this.takeoverLoggingInfo, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeApplication(ResumeApplicationResponse8 variant, boolean z, String str, String title, String subtitle, RichText richText, FundingUpsellContent fundingUpsellContent, ChurnedFundingV2Content churnedFundingV2Content, String str2, ThemedColor themedColor, ThemedImageSource themedImageSource, StandardPageTemplate<? extends GenericAction> standardPageTemplate, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
        this.variant = variant;
        this.showWelcomeBack = z;
        this.firstName = str;
        this.title = title;
        this.subtitle = subtitle;
        this.disclosure = richText;
        this.fundingUpsellContent = fundingUpsellContent;
        this.churnedFundingV2Content = churnedFundingV2Content;
        this.fundingUpsellVariant = str2;
        this.welcomeBackBackgroundColor = themedColor;
        this.welcomeBackImageSource = themedImageSource;
        this.detailsScreenContent = standardPageTemplate;
        this.takeoverLoggingInfo = takeoverLoggingInfo;
    }

    public final ResumeApplicationResponse8 getVariant() {
        return this.variant;
    }

    public final boolean getShowWelcomeBack() {
        return this.showWelcomeBack;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final RichText getDisclosure() {
        return this.disclosure;
    }

    public final FundingUpsellContent getFundingUpsellContent() {
        return this.fundingUpsellContent;
    }

    public final ChurnedFundingV2Content getChurnedFundingV2Content() {
        return this.churnedFundingV2Content;
    }

    public final String getFundingUpsellVariant() {
        return this.fundingUpsellVariant;
    }

    public final ThemedColor getWelcomeBackBackgroundColor() {
        return this.welcomeBackBackgroundColor;
    }

    public final ThemedImageSource getWelcomeBackImageSource() {
        return this.welcomeBackImageSource;
    }

    public final StandardPageTemplate<GenericAction> getDetailsScreenContent() {
        return this.detailsScreenContent;
    }

    public /* synthetic */ ResumeApplication(ResumeApplicationResponse8 resumeApplicationResponse8, boolean z, String str, String str2, String str3, RichText richText, FundingUpsellContent fundingUpsellContent, ChurnedFundingV2Content churnedFundingV2Content, String str4, ThemedColor themedColor, ThemedImageSource themedImageSource, StandardPageTemplate standardPageTemplate, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resumeApplicationResponse8, z, str, str2, str3, (i & 32) != 0 ? null : richText, (i & 64) != 0 ? null : fundingUpsellContent, churnedFundingV2Content, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : themedColor, (i & 1024) != 0 ? null : themedImageSource, (i & 2048) != 0 ? null : standardPageTemplate, (i & 4096) != 0 ? new ResumeApplicationTakeoverLoggingInfo(0L, 0, null, null) : resumeApplicationTakeoverLoggingInfo);
    }

    public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
        return this.takeoverLoggingInfo;
    }
}
