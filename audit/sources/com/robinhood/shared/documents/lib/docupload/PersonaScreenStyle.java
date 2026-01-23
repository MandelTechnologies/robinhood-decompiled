package com.robinhood.shared.documents.lib.docupload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonaFlowStyle.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/PersonaScreenStyle;", "Landroid/os/Parcelable;", "photoIdContent", "Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;", "selfieIdContent", "gdprContent", "<init>", "(Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;)V", "getPhotoIdContent", "()Lcom/robinhood/shared/documents/lib/docupload/DocumentBasedPersonaScreenContent;", "getSelfieIdContent", "getGdprContent", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PersonaScreenStyle implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PersonaScreenStyle> CREATOR = new Creator();
    private final DocumentBasedPersonaScreenContent gdprContent;
    private final DocumentBasedPersonaScreenContent photoIdContent;
    private final DocumentBasedPersonaScreenContent selfieIdContent;

    /* compiled from: PersonaFlowStyle.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PersonaScreenStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonaScreenStyle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<DocumentBasedPersonaScreenContent> creator = DocumentBasedPersonaScreenContent.CREATOR;
            return new PersonaScreenStyle(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonaScreenStyle[] newArray(int i) {
            return new PersonaScreenStyle[i];
        }
    }

    public static /* synthetic */ PersonaScreenStyle copy$default(PersonaScreenStyle personaScreenStyle, DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent, DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent2, DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent3, int i, Object obj) {
        if ((i & 1) != 0) {
            documentBasedPersonaScreenContent = personaScreenStyle.photoIdContent;
        }
        if ((i & 2) != 0) {
            documentBasedPersonaScreenContent2 = personaScreenStyle.selfieIdContent;
        }
        if ((i & 4) != 0) {
            documentBasedPersonaScreenContent3 = personaScreenStyle.gdprContent;
        }
        return personaScreenStyle.copy(documentBasedPersonaScreenContent, documentBasedPersonaScreenContent2, documentBasedPersonaScreenContent3);
    }

    /* renamed from: component1, reason: from getter */
    public final DocumentBasedPersonaScreenContent getPhotoIdContent() {
        return this.photoIdContent;
    }

    /* renamed from: component2, reason: from getter */
    public final DocumentBasedPersonaScreenContent getSelfieIdContent() {
        return this.selfieIdContent;
    }

    /* renamed from: component3, reason: from getter */
    public final DocumentBasedPersonaScreenContent getGdprContent() {
        return this.gdprContent;
    }

    public final PersonaScreenStyle copy(DocumentBasedPersonaScreenContent photoIdContent, DocumentBasedPersonaScreenContent selfieIdContent, DocumentBasedPersonaScreenContent gdprContent) {
        Intrinsics.checkNotNullParameter(photoIdContent, "photoIdContent");
        Intrinsics.checkNotNullParameter(selfieIdContent, "selfieIdContent");
        return new PersonaScreenStyle(photoIdContent, selfieIdContent, gdprContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonaScreenStyle)) {
            return false;
        }
        PersonaScreenStyle personaScreenStyle = (PersonaScreenStyle) other;
        return Intrinsics.areEqual(this.photoIdContent, personaScreenStyle.photoIdContent) && Intrinsics.areEqual(this.selfieIdContent, personaScreenStyle.selfieIdContent) && Intrinsics.areEqual(this.gdprContent, personaScreenStyle.gdprContent);
    }

    public int hashCode() {
        int iHashCode = ((this.photoIdContent.hashCode() * 31) + this.selfieIdContent.hashCode()) * 31;
        DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent = this.gdprContent;
        return iHashCode + (documentBasedPersonaScreenContent == null ? 0 : documentBasedPersonaScreenContent.hashCode());
    }

    public String toString() {
        return "PersonaScreenStyle(photoIdContent=" + this.photoIdContent + ", selfieIdContent=" + this.selfieIdContent + ", gdprContent=" + this.gdprContent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.photoIdContent.writeToParcel(dest, flags);
        this.selfieIdContent.writeToParcel(dest, flags);
        DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent = this.gdprContent;
        if (documentBasedPersonaScreenContent == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            documentBasedPersonaScreenContent.writeToParcel(dest, flags);
        }
    }

    public PersonaScreenStyle(DocumentBasedPersonaScreenContent photoIdContent, DocumentBasedPersonaScreenContent selfieIdContent, DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent) {
        Intrinsics.checkNotNullParameter(photoIdContent, "photoIdContent");
        Intrinsics.checkNotNullParameter(selfieIdContent, "selfieIdContent");
        this.photoIdContent = photoIdContent;
        this.selfieIdContent = selfieIdContent;
        this.gdprContent = documentBasedPersonaScreenContent;
    }

    public /* synthetic */ PersonaScreenStyle(DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent, DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent2, DocumentBasedPersonaScreenContent documentBasedPersonaScreenContent3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentBasedPersonaScreenContent, documentBasedPersonaScreenContent2, (i & 4) != 0 ? null : documentBasedPersonaScreenContent3);
    }

    public final DocumentBasedPersonaScreenContent getPhotoIdContent() {
        return this.photoIdContent;
    }

    public final DocumentBasedPersonaScreenContent getSelfieIdContent() {
        return this.selfieIdContent;
    }

    public final DocumentBasedPersonaScreenContent getGdprContent() {
        return this.gdprContent;
    }
}
