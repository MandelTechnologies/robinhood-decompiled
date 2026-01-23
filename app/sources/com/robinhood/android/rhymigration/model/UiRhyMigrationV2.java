package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationV2.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u001b\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\rHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u001b\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\rHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003JÓ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0006\u0010:\u001a\u00020;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020;HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationV2;", "Landroid/os/Parcelable;", "title1", "", "body1", "header2", "body2", "brokerageHeader", "brokerageBody", "spendingHeader", "spendingBody", "tableTitle", "tableRows", "", "Lkotlin/Pair;", "faqTitle", "faqRows", "disclaimerText", "shutdownTitle", "shutdownSubtitle", "shutdownBodyValueProps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle1", "()Ljava/lang/String;", "getBody1", "getHeader2", "getBody2", "getBrokerageHeader", "getBrokerageBody", "getSpendingHeader", "getSpendingBody", "getTableTitle", "getTableRows", "()Ljava/util/List;", "getFaqTitle", "getFaqRows", "getDisclaimerText", "getShutdownTitle", "getShutdownSubtitle", "getShutdownBodyValueProps", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationV2 implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigrationV2> CREATOR = new Creator();
    private final String body1;
    private final String body2;
    private final String brokerageBody;
    private final String brokerageHeader;
    private final String disclaimerText;
    private final List<Tuples2<String, String>> faqRows;
    private final String faqTitle;
    private final String header2;
    private final List<String> shutdownBodyValueProps;
    private final String shutdownSubtitle;
    private final String shutdownTitle;
    private final String spendingBody;
    private final String spendingHeader;
    private final List<Tuples2<String, String>> tableRows;
    private final String tableTitle;
    private final String title1;

    /* compiled from: UiRhyMigrationV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            String string11 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readSerializable());
            }
            return new UiRhyMigrationV2(string2, string3, string4, string5, string6, string7, string8, string9, string10, arrayList, string11, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationV2[] newArray(int i) {
            return new UiRhyMigrationV2[i];
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle1() {
        return this.title1;
    }

    public final List<Tuples2<String, String>> component10() {
        return this.tableRows;
    }

    /* renamed from: component11, reason: from getter */
    public final String getFaqTitle() {
        return this.faqTitle;
    }

    public final List<Tuples2<String, String>> component12() {
        return this.faqRows;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    /* renamed from: component14, reason: from getter */
    public final String getShutdownTitle() {
        return this.shutdownTitle;
    }

    /* renamed from: component15, reason: from getter */
    public final String getShutdownSubtitle() {
        return this.shutdownSubtitle;
    }

    public final List<String> component16() {
        return this.shutdownBodyValueProps;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody1() {
        return this.body1;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeader2() {
        return this.header2;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBody2() {
        return this.body2;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBrokerageHeader() {
        return this.brokerageHeader;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBrokerageBody() {
        return this.brokerageBody;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSpendingHeader() {
        return this.spendingHeader;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSpendingBody() {
        return this.spendingBody;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTableTitle() {
        return this.tableTitle;
    }

    public final UiRhyMigrationV2 copy(String title1, String body1, String header2, String body2, String brokerageHeader, String brokerageBody, String spendingHeader, String spendingBody, String tableTitle, List<Tuples2<String, String>> tableRows, String faqTitle, List<Tuples2<String, String>> faqRows, String disclaimerText, String shutdownTitle, String shutdownSubtitle, List<String> shutdownBodyValueProps) {
        Intrinsics.checkNotNullParameter(title1, "title1");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(header2, "header2");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(brokerageHeader, "brokerageHeader");
        Intrinsics.checkNotNullParameter(brokerageBody, "brokerageBody");
        Intrinsics.checkNotNullParameter(spendingHeader, "spendingHeader");
        Intrinsics.checkNotNullParameter(spendingBody, "spendingBody");
        Intrinsics.checkNotNullParameter(tableTitle, "tableTitle");
        Intrinsics.checkNotNullParameter(tableRows, "tableRows");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(faqRows, "faqRows");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        Intrinsics.checkNotNullParameter(shutdownTitle, "shutdownTitle");
        Intrinsics.checkNotNullParameter(shutdownSubtitle, "shutdownSubtitle");
        Intrinsics.checkNotNullParameter(shutdownBodyValueProps, "shutdownBodyValueProps");
        return new UiRhyMigrationV2(title1, body1, header2, body2, brokerageHeader, brokerageBody, spendingHeader, spendingBody, tableTitle, tableRows, faqTitle, faqRows, disclaimerText, shutdownTitle, shutdownSubtitle, shutdownBodyValueProps);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationV2)) {
            return false;
        }
        UiRhyMigrationV2 uiRhyMigrationV2 = (UiRhyMigrationV2) other;
        return Intrinsics.areEqual(this.title1, uiRhyMigrationV2.title1) && Intrinsics.areEqual(this.body1, uiRhyMigrationV2.body1) && Intrinsics.areEqual(this.header2, uiRhyMigrationV2.header2) && Intrinsics.areEqual(this.body2, uiRhyMigrationV2.body2) && Intrinsics.areEqual(this.brokerageHeader, uiRhyMigrationV2.brokerageHeader) && Intrinsics.areEqual(this.brokerageBody, uiRhyMigrationV2.brokerageBody) && Intrinsics.areEqual(this.spendingHeader, uiRhyMigrationV2.spendingHeader) && Intrinsics.areEqual(this.spendingBody, uiRhyMigrationV2.spendingBody) && Intrinsics.areEqual(this.tableTitle, uiRhyMigrationV2.tableTitle) && Intrinsics.areEqual(this.tableRows, uiRhyMigrationV2.tableRows) && Intrinsics.areEqual(this.faqTitle, uiRhyMigrationV2.faqTitle) && Intrinsics.areEqual(this.faqRows, uiRhyMigrationV2.faqRows) && Intrinsics.areEqual(this.disclaimerText, uiRhyMigrationV2.disclaimerText) && Intrinsics.areEqual(this.shutdownTitle, uiRhyMigrationV2.shutdownTitle) && Intrinsics.areEqual(this.shutdownSubtitle, uiRhyMigrationV2.shutdownSubtitle) && Intrinsics.areEqual(this.shutdownBodyValueProps, uiRhyMigrationV2.shutdownBodyValueProps);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.title1.hashCode() * 31) + this.body1.hashCode()) * 31) + this.header2.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.brokerageHeader.hashCode()) * 31) + this.brokerageBody.hashCode()) * 31) + this.spendingHeader.hashCode()) * 31) + this.spendingBody.hashCode()) * 31) + this.tableTitle.hashCode()) * 31) + this.tableRows.hashCode()) * 31) + this.faqTitle.hashCode()) * 31) + this.faqRows.hashCode()) * 31) + this.disclaimerText.hashCode()) * 31) + this.shutdownTitle.hashCode()) * 31) + this.shutdownSubtitle.hashCode()) * 31) + this.shutdownBodyValueProps.hashCode();
    }

    public String toString() {
        return "UiRhyMigrationV2(title1=" + this.title1 + ", body1=" + this.body1 + ", header2=" + this.header2 + ", body2=" + this.body2 + ", brokerageHeader=" + this.brokerageHeader + ", brokerageBody=" + this.brokerageBody + ", spendingHeader=" + this.spendingHeader + ", spendingBody=" + this.spendingBody + ", tableTitle=" + this.tableTitle + ", tableRows=" + this.tableRows + ", faqTitle=" + this.faqTitle + ", faqRows=" + this.faqRows + ", disclaimerText=" + this.disclaimerText + ", shutdownTitle=" + this.shutdownTitle + ", shutdownSubtitle=" + this.shutdownSubtitle + ", shutdownBodyValueProps=" + this.shutdownBodyValueProps + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title1);
        dest.writeString(this.body1);
        dest.writeString(this.header2);
        dest.writeString(this.body2);
        dest.writeString(this.brokerageHeader);
        dest.writeString(this.brokerageBody);
        dest.writeString(this.spendingHeader);
        dest.writeString(this.spendingBody);
        dest.writeString(this.tableTitle);
        List<Tuples2<String, String>> list = this.tableRows;
        dest.writeInt(list.size());
        Iterator<Tuples2<String, String>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeSerializable(it.next());
        }
        dest.writeString(this.faqTitle);
        List<Tuples2<String, String>> list2 = this.faqRows;
        dest.writeInt(list2.size());
        Iterator<Tuples2<String, String>> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeSerializable(it2.next());
        }
        dest.writeString(this.disclaimerText);
        dest.writeString(this.shutdownTitle);
        dest.writeString(this.shutdownSubtitle);
        dest.writeStringList(this.shutdownBodyValueProps);
    }

    public UiRhyMigrationV2(String title1, String body1, String header2, String body2, String brokerageHeader, String brokerageBody, String spendingHeader, String spendingBody, String tableTitle, List<Tuples2<String, String>> tableRows, String faqTitle, List<Tuples2<String, String>> faqRows, String disclaimerText, String shutdownTitle, String shutdownSubtitle, List<String> shutdownBodyValueProps) {
        Intrinsics.checkNotNullParameter(title1, "title1");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(header2, "header2");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(brokerageHeader, "brokerageHeader");
        Intrinsics.checkNotNullParameter(brokerageBody, "brokerageBody");
        Intrinsics.checkNotNullParameter(spendingHeader, "spendingHeader");
        Intrinsics.checkNotNullParameter(spendingBody, "spendingBody");
        Intrinsics.checkNotNullParameter(tableTitle, "tableTitle");
        Intrinsics.checkNotNullParameter(tableRows, "tableRows");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(faqRows, "faqRows");
        Intrinsics.checkNotNullParameter(disclaimerText, "disclaimerText");
        Intrinsics.checkNotNullParameter(shutdownTitle, "shutdownTitle");
        Intrinsics.checkNotNullParameter(shutdownSubtitle, "shutdownSubtitle");
        Intrinsics.checkNotNullParameter(shutdownBodyValueProps, "shutdownBodyValueProps");
        this.title1 = title1;
        this.body1 = body1;
        this.header2 = header2;
        this.body2 = body2;
        this.brokerageHeader = brokerageHeader;
        this.brokerageBody = brokerageBody;
        this.spendingHeader = spendingHeader;
        this.spendingBody = spendingBody;
        this.tableTitle = tableTitle;
        this.tableRows = tableRows;
        this.faqTitle = faqTitle;
        this.faqRows = faqRows;
        this.disclaimerText = disclaimerText;
        this.shutdownTitle = shutdownTitle;
        this.shutdownSubtitle = shutdownSubtitle;
        this.shutdownBodyValueProps = shutdownBodyValueProps;
    }

    public final String getTitle1() {
        return this.title1;
    }

    public final String getBody1() {
        return this.body1;
    }

    public final String getHeader2() {
        return this.header2;
    }

    public final String getBody2() {
        return this.body2;
    }

    public final String getBrokerageHeader() {
        return this.brokerageHeader;
    }

    public final String getBrokerageBody() {
        return this.brokerageBody;
    }

    public final String getSpendingHeader() {
        return this.spendingHeader;
    }

    public final String getSpendingBody() {
        return this.spendingBody;
    }

    public final String getTableTitle() {
        return this.tableTitle;
    }

    public final List<Tuples2<String, String>> getTableRows() {
        return this.tableRows;
    }

    public final String getFaqTitle() {
        return this.faqTitle;
    }

    public final List<Tuples2<String, String>> getFaqRows() {
        return this.faqRows;
    }

    public final String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final String getShutdownTitle() {
        return this.shutdownTitle;
    }

    public final String getShutdownSubtitle() {
        return this.shutdownSubtitle;
    }

    public final List<String> getShutdownBodyValueProps() {
        return this.shutdownBodyValueProps;
    }
}
