package com.robinhood.android.goldearningspotential.microgram;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldEarningsCalculatorUiModel.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "Landroid/os/Parcelable;", "dismissLabel", "", "bodyMarkdown", "bodyComponents", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDismissLabel", "()Ljava/lang/String;", "getBodyMarkdown", "getBodyComponents", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldEarningsCalculatorAlertContentUiModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GoldEarningsCalculatorAlertContentUiModel> CREATOR = new Creator();
    private final List<String> bodyComponents;
    private final String bodyMarkdown;
    private final String dismissLabel;
    private final String title;

    /* compiled from: GoldEarningsCalculatorUiModel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldEarningsCalculatorAlertContentUiModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldEarningsCalculatorAlertContentUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldEarningsCalculatorAlertContentUiModel(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldEarningsCalculatorAlertContentUiModel[] newArray(int i) {
            return new GoldEarningsCalculatorAlertContentUiModel[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldEarningsCalculatorAlertContentUiModel copy$default(GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldEarningsCalculatorAlertContentUiModel.dismissLabel;
        }
        if ((i & 2) != 0) {
            str2 = goldEarningsCalculatorAlertContentUiModel.bodyMarkdown;
        }
        if ((i & 4) != 0) {
            list = goldEarningsCalculatorAlertContentUiModel.bodyComponents;
        }
        if ((i & 8) != 0) {
            str3 = goldEarningsCalculatorAlertContentUiModel.title;
        }
        return goldEarningsCalculatorAlertContentUiModel.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDismissLabel() {
        return this.dismissLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final List<String> component3() {
        return this.bodyComponents;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final GoldEarningsCalculatorAlertContentUiModel copy(String dismissLabel, String bodyMarkdown, List<String> bodyComponents, String title) {
        Intrinsics.checkNotNullParameter(dismissLabel, "dismissLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        return new GoldEarningsCalculatorAlertContentUiModel(dismissLabel, bodyMarkdown, bodyComponents, title);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsCalculatorAlertContentUiModel)) {
            return false;
        }
        GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel = (GoldEarningsCalculatorAlertContentUiModel) other;
        return Intrinsics.areEqual(this.dismissLabel, goldEarningsCalculatorAlertContentUiModel.dismissLabel) && Intrinsics.areEqual(this.bodyMarkdown, goldEarningsCalculatorAlertContentUiModel.bodyMarkdown) && Intrinsics.areEqual(this.bodyComponents, goldEarningsCalculatorAlertContentUiModel.bodyComponents) && Intrinsics.areEqual(this.title, goldEarningsCalculatorAlertContentUiModel.title);
    }

    public int hashCode() {
        int iHashCode = this.dismissLabel.hashCode() * 31;
        String str = this.bodyMarkdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.bodyComponents;
        return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "GoldEarningsCalculatorAlertContentUiModel(dismissLabel=" + this.dismissLabel + ", bodyMarkdown=" + this.bodyMarkdown + ", bodyComponents=" + this.bodyComponents + ", title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.dismissLabel);
        dest.writeString(this.bodyMarkdown);
        dest.writeStringList(this.bodyComponents);
        dest.writeString(this.title);
    }

    public GoldEarningsCalculatorAlertContentUiModel(String dismissLabel, String str, List<String> list, String title) {
        Intrinsics.checkNotNullParameter(dismissLabel, "dismissLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        this.dismissLabel = dismissLabel;
        this.bodyMarkdown = str;
        this.bodyComponents = list;
        this.title = title;
    }

    public final String getDismissLabel() {
        return this.dismissLabel;
    }

    public final String getBodyMarkdown() {
        return this.bodyMarkdown;
    }

    public final List<String> getBodyComponents() {
        return this.bodyComponents;
    }

    public final String getTitle() {
        return this.title;
    }
}
