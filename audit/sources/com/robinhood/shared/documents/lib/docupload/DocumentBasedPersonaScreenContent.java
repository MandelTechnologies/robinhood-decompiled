package com.robinhood.shared.documents.lib.docupload;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaFlowStyle.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010JB\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0003J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;", "Landroid/os/Parcelable;", "asset", "", "title", "subtitle", AccountOverviewOptionsSettingCard4.CTA, "secondaryCta", "<init>", "(IIIILjava/lang/Integer;)V", "getAsset", "()I", "getTitle", "getSubtitle", "getCta", "getSecondaryCta", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(IIIILjava/lang/Integer;)Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class DocumentBasedPersonaScreenContent implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DocumentBasedPersonaScreenContent> CREATOR = new Creator();
    private final int asset;
    private final int cta;
    private final Integer secondaryCta;
    private final int subtitle;
    private final int title;

    /* compiled from: PersonaFlowStyle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DocumentBasedPersonaScreenContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentBasedPersonaScreenContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentBasedPersonaScreenContent(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DocumentBasedPersonaScreenContent[] newArray(int i) {
            return new DocumentBasedPersonaScreenContent[i];
        }
    }

    public static /* synthetic */ DocumentBasedPersonaScreenContent copy$default(DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent, int i, int i2, int i3, int i4, Integer num, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = documentBasedPersonaScreenContent.asset;
        }
        if ((i5 & 2) != 0) {
            i2 = documentBasedPersonaScreenContent.title;
        }
        if ((i5 & 4) != 0) {
            i3 = documentBasedPersonaScreenContent.subtitle;
        }
        if ((i5 & 8) != 0) {
            i4 = documentBasedPersonaScreenContent.cta;
        }
        if ((i5 & 16) != 0) {
            num = documentBasedPersonaScreenContent.secondaryCta;
        }
        Integer num2 = num;
        int i6 = i3;
        return documentBasedPersonaScreenContent.copy(i, i2, i6, i4, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAsset() {
        return this.asset;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCta() {
        return this.cta;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSecondaryCta() {
        return this.secondaryCta;
    }

    public final DocumentBasedPersonaScreenContent copy(int asset, int title, int subtitle, int cta, Integer secondaryCta) {
        return new DocumentBasedPersonaScreenContent(asset, title, subtitle, cta, secondaryCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentBasedPersonaScreenContent)) {
            return false;
        }
        DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent = (DocumentBasedPersonaScreenContent) other;
        return this.asset == documentBasedPersonaScreenContent.asset && this.title == documentBasedPersonaScreenContent.title && this.subtitle == documentBasedPersonaScreenContent.subtitle && this.cta == documentBasedPersonaScreenContent.cta && Intrinsics.areEqual(this.secondaryCta, documentBasedPersonaScreenContent.secondaryCta);
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.asset) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.subtitle)) * 31) + Integer.hashCode(this.cta)) * 31;
        Integer num = this.secondaryCta;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "DocumentBasedPersonaScreenContent(asset=" + this.asset + ", title=" + this.title + ", subtitle=" + this.subtitle + ", cta=" + this.cta + ", secondaryCta=" + this.secondaryCta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.asset);
        dest.writeInt(this.title);
        dest.writeInt(this.subtitle);
        dest.writeInt(this.cta);
        Integer num = this.secondaryCta;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public DocumentBasedPersonaScreenContent(int i, int i2, int i3, int i4, Integer num) {
        this.asset = i;
        this.title = i2;
        this.subtitle = i3;
        this.cta = i4;
        this.secondaryCta = num;
    }

    public /* synthetic */ DocumentBasedPersonaScreenContent(int i, int i2, int i3, int i4, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : num);
    }

    public final int getAsset() {
        return this.asset;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getCta() {
        return this.cta;
    }

    public final Integer getSecondaryCta() {
        return this.secondaryCta;
    }
}
