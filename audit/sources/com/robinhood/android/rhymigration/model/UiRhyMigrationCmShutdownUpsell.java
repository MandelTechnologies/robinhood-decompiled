package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.staticcontent.model.IdentifiableTitleAndBody;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationCmShutdownUpsell.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\bHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0014HÆ\u0003J§\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000208HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000208R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;", "Landroid/os/Parcelable;", "title", "", "subtitle", "primaryCta", "secondaryCta", "accountComparison", "", "Lcom/robinhood/staticcontent/model/IdentifiableTitleAndBody;", "comparisonTableTitle", "comparisonTableSubtitle", "comparisonTableHeader", "comparisonTableTitleAndBody", "faqTitle", "faqDropdown", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "showAllTitle", "showAllLink", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/staticcontent/model/disclosure/Disclosure;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryCta", "getSecondaryCta", "getAccountComparison", "()Ljava/util/List;", "getComparisonTableTitle", "getComparisonTableSubtitle", "getComparisonTableHeader", "getComparisonTableTitleAndBody", "getFaqTitle", "getFaqDropdown", "getShowAllTitle", "getShowAllLink", "getDisclosure", "()Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationCmShutdownUpsell implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigrationCmShutdownUpsell> CREATOR = new Creator();
    private final List<IdentifiableTitleAndBody> accountComparison;
    private final String comparisonTableHeader;
    private final String comparisonTableSubtitle;
    private final String comparisonTableTitle;
    private final List<IdentifiableTitleAndBody> comparisonTableTitleAndBody;
    private final Disclosure disclosure;
    private final List<TitleAndBody> faqDropdown;
    private final String faqTitle;
    private final String primaryCta;
    private final String secondaryCta;
    private final String showAllLink;
    private final String showAllTitle;
    private final String subtitle;
    private final String title;

    /* compiled from: UiRhyMigrationCmShutdownUpsell.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationCmShutdownUpsell> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationCmShutdownUpsell createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(UiRhyMigrationCmShutdownUpsell.class.getClassLoader()));
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(UiRhyMigrationCmShutdownUpsell.class.getClassLoader()));
            }
            String string9 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readParcelable(UiRhyMigrationCmShutdownUpsell.class.getClassLoader()));
            }
            return new UiRhyMigrationCmShutdownUpsell(string2, string3, string4, string5, arrayList, string6, string7, string8, arrayList2, string9, arrayList3, parcel.readString(), parcel.readString(), (Disclosure) parcel.readParcelable(UiRhyMigrationCmShutdownUpsell.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationCmShutdownUpsell[] newArray(int i) {
            return new UiRhyMigrationCmShutdownUpsell[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final String getFaqTitle() {
        return this.faqTitle;
    }

    public final List<TitleAndBody> component11() {
        return this.faqDropdown;
    }

    /* renamed from: component12, reason: from getter */
    public final String getShowAllTitle() {
        return this.showAllTitle;
    }

    /* renamed from: component13, reason: from getter */
    public final String getShowAllLink() {
        return this.showAllLink;
    }

    /* renamed from: component14, reason: from getter */
    public final Disclosure getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    public final List<IdentifiableTitleAndBody> component5() {
        return this.accountComparison;
    }

    /* renamed from: component6, reason: from getter */
    public final String getComparisonTableTitle() {
        return this.comparisonTableTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getComparisonTableSubtitle() {
        return this.comparisonTableSubtitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getComparisonTableHeader() {
        return this.comparisonTableHeader;
    }

    public final List<IdentifiableTitleAndBody> component9() {
        return this.comparisonTableTitleAndBody;
    }

    public final UiRhyMigrationCmShutdownUpsell copy(String title, String subtitle, String primaryCta, String secondaryCta, List<IdentifiableTitleAndBody> accountComparison, String comparisonTableTitle, String comparisonTableSubtitle, String comparisonTableHeader, List<IdentifiableTitleAndBody> comparisonTableTitleAndBody, String faqTitle, List<TitleAndBody> faqDropdown, String showAllTitle, String showAllLink, Disclosure disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        Intrinsics.checkNotNullParameter(accountComparison, "accountComparison");
        Intrinsics.checkNotNullParameter(comparisonTableTitle, "comparisonTableTitle");
        Intrinsics.checkNotNullParameter(comparisonTableSubtitle, "comparisonTableSubtitle");
        Intrinsics.checkNotNullParameter(comparisonTableHeader, "comparisonTableHeader");
        Intrinsics.checkNotNullParameter(comparisonTableTitleAndBody, "comparisonTableTitleAndBody");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(faqDropdown, "faqDropdown");
        Intrinsics.checkNotNullParameter(showAllTitle, "showAllTitle");
        Intrinsics.checkNotNullParameter(showAllLink, "showAllLink");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        return new UiRhyMigrationCmShutdownUpsell(title, subtitle, primaryCta, secondaryCta, accountComparison, comparisonTableTitle, comparisonTableSubtitle, comparisonTableHeader, comparisonTableTitleAndBody, faqTitle, faqDropdown, showAllTitle, showAllLink, disclosure);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationCmShutdownUpsell)) {
            return false;
        }
        UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell = (UiRhyMigrationCmShutdownUpsell) other;
        return Intrinsics.areEqual(this.title, uiRhyMigrationCmShutdownUpsell.title) && Intrinsics.areEqual(this.subtitle, uiRhyMigrationCmShutdownUpsell.subtitle) && Intrinsics.areEqual(this.primaryCta, uiRhyMigrationCmShutdownUpsell.primaryCta) && Intrinsics.areEqual(this.secondaryCta, uiRhyMigrationCmShutdownUpsell.secondaryCta) && Intrinsics.areEqual(this.accountComparison, uiRhyMigrationCmShutdownUpsell.accountComparison) && Intrinsics.areEqual(this.comparisonTableTitle, uiRhyMigrationCmShutdownUpsell.comparisonTableTitle) && Intrinsics.areEqual(this.comparisonTableSubtitle, uiRhyMigrationCmShutdownUpsell.comparisonTableSubtitle) && Intrinsics.areEqual(this.comparisonTableHeader, uiRhyMigrationCmShutdownUpsell.comparisonTableHeader) && Intrinsics.areEqual(this.comparisonTableTitleAndBody, uiRhyMigrationCmShutdownUpsell.comparisonTableTitleAndBody) && Intrinsics.areEqual(this.faqTitle, uiRhyMigrationCmShutdownUpsell.faqTitle) && Intrinsics.areEqual(this.faqDropdown, uiRhyMigrationCmShutdownUpsell.faqDropdown) && Intrinsics.areEqual(this.showAllTitle, uiRhyMigrationCmShutdownUpsell.showAllTitle) && Intrinsics.areEqual(this.showAllLink, uiRhyMigrationCmShutdownUpsell.showAllLink) && Intrinsics.areEqual(this.disclosure, uiRhyMigrationCmShutdownUpsell.disclosure);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.primaryCta.hashCode()) * 31) + this.secondaryCta.hashCode()) * 31) + this.accountComparison.hashCode()) * 31) + this.comparisonTableTitle.hashCode()) * 31) + this.comparisonTableSubtitle.hashCode()) * 31) + this.comparisonTableHeader.hashCode()) * 31) + this.comparisonTableTitleAndBody.hashCode()) * 31) + this.faqTitle.hashCode()) * 31) + this.faqDropdown.hashCode()) * 31) + this.showAllTitle.hashCode()) * 31) + this.showAllLink.hashCode()) * 31) + this.disclosure.hashCode();
    }

    public String toString() {
        return "UiRhyMigrationCmShutdownUpsell(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", accountComparison=" + this.accountComparison + ", comparisonTableTitle=" + this.comparisonTableTitle + ", comparisonTableSubtitle=" + this.comparisonTableSubtitle + ", comparisonTableHeader=" + this.comparisonTableHeader + ", comparisonTableTitleAndBody=" + this.comparisonTableTitleAndBody + ", faqTitle=" + this.faqTitle + ", faqDropdown=" + this.faqDropdown + ", showAllTitle=" + this.showAllTitle + ", showAllLink=" + this.showAllLink + ", disclosure=" + this.disclosure + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.primaryCta);
        dest.writeString(this.secondaryCta);
        List<IdentifiableTitleAndBody> list = this.accountComparison;
        dest.writeInt(list.size());
        Iterator<IdentifiableTitleAndBody> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeString(this.comparisonTableTitle);
        dest.writeString(this.comparisonTableSubtitle);
        dest.writeString(this.comparisonTableHeader);
        List<IdentifiableTitleAndBody> list2 = this.comparisonTableTitleAndBody;
        dest.writeInt(list2.size());
        Iterator<IdentifiableTitleAndBody> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.faqTitle);
        List<TitleAndBody> list3 = this.faqDropdown;
        dest.writeInt(list3.size());
        Iterator<TitleAndBody> it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeParcelable(it3.next(), flags);
        }
        dest.writeString(this.showAllTitle);
        dest.writeString(this.showAllLink);
        dest.writeParcelable(this.disclosure, flags);
    }

    public UiRhyMigrationCmShutdownUpsell(String title, String subtitle, String primaryCta, String secondaryCta, List<IdentifiableTitleAndBody> accountComparison, String comparisonTableTitle, String comparisonTableSubtitle, String comparisonTableHeader, List<IdentifiableTitleAndBody> comparisonTableTitleAndBody, String faqTitle, List<TitleAndBody> faqDropdown, String showAllTitle, String showAllLink, Disclosure disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        Intrinsics.checkNotNullParameter(accountComparison, "accountComparison");
        Intrinsics.checkNotNullParameter(comparisonTableTitle, "comparisonTableTitle");
        Intrinsics.checkNotNullParameter(comparisonTableSubtitle, "comparisonTableSubtitle");
        Intrinsics.checkNotNullParameter(comparisonTableHeader, "comparisonTableHeader");
        Intrinsics.checkNotNullParameter(comparisonTableTitleAndBody, "comparisonTableTitleAndBody");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(faqDropdown, "faqDropdown");
        Intrinsics.checkNotNullParameter(showAllTitle, "showAllTitle");
        Intrinsics.checkNotNullParameter(showAllLink, "showAllLink");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.title = title;
        this.subtitle = subtitle;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
        this.accountComparison = accountComparison;
        this.comparisonTableTitle = comparisonTableTitle;
        this.comparisonTableSubtitle = comparisonTableSubtitle;
        this.comparisonTableHeader = comparisonTableHeader;
        this.comparisonTableTitleAndBody = comparisonTableTitleAndBody;
        this.faqTitle = faqTitle;
        this.faqDropdown = faqDropdown;
        this.showAllTitle = showAllTitle;
        this.showAllLink = showAllLink;
        this.disclosure = disclosure;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    public final List<IdentifiableTitleAndBody> getAccountComparison() {
        return this.accountComparison;
    }

    public final String getComparisonTableTitle() {
        return this.comparisonTableTitle;
    }

    public final String getComparisonTableSubtitle() {
        return this.comparisonTableSubtitle;
    }

    public final String getComparisonTableHeader() {
        return this.comparisonTableHeader;
    }

    public final List<IdentifiableTitleAndBody> getComparisonTableTitleAndBody() {
        return this.comparisonTableTitleAndBody;
    }

    public final String getFaqTitle() {
        return this.faqTitle;
    }

    public final List<TitleAndBody> getFaqDropdown() {
        return this.faqDropdown;
    }

    public final String getShowAllTitle() {
        return this.showAllTitle;
    }

    public final String getShowAllLink() {
        return this.showAllLink;
    }

    public final Disclosure getDisclosure() {
        return this.disclosure;
    }
}
