package com.robinhood.android.doc.serverdriven.parent;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrFlowState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jk\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowState;", "Landroid/os/Parcelable;", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode;", "defaultDocumentType", "", "selectedDocumentType", "selectedCountry", "pdfToUpload", "Lcom/robinhood/models/api/PdfDocument;", "captureQueue", "", "Lcom/robinhood/models/api/IdDocument$Side;", "frontPhotoToUpload", "Lcom/robinhood/models/api/PhotoDocument;", "backPhotoToUpload", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode;Lcom/robinhood/models/api/PdfDocument;Ljava/util/List;Lcom/robinhood/models/api/PhotoDocument;Lcom/robinhood/models/api/PhotoDocument;)V", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getDefaultDocumentType", "()Ljava/lang/String;", "getSelectedDocumentType", "getSelectedCountry", "getPdfToUpload", "()Lcom/robinhood/models/api/PdfDocument;", "getCaptureQueue", "()Ljava/util/List;", "getFrontPhotoToUpload", "()Lcom/robinhood/models/api/PhotoDocument;", "getBackPhotoToUpload", "documentTypeToUpload", "getDocumentTypeToUpload", "countryToUpload", "getCountryToUpload", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SddrFlowState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SddrFlowState> CREATOR = new Creator();
    private final PhotoDocument backPhotoToUpload;
    private final List<IdDocument.Side> captureQueue;
    private final String defaultDocumentType;
    private final PhotoDocument frontPhotoToUpload;
    private final PdfDocument pdfToUpload;
    private final CountryCode selectedCountry;
    private final String selectedDocumentType;
    private final CountryCode userLocality;

    /* compiled from: SddrFlowState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SddrFlowState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SddrFlowState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CountryCode countryCode = (CountryCode) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            CountryCode countryCode2 = (CountryCode) parcel.readSerializable();
            PdfDocument docUploadCapturedDocument2 = (PdfDocument) parcel.readParcelable(SddrFlowState.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(IdDocument.Side.valueOf(parcel.readString()));
            }
            return new SddrFlowState(countryCode, string2, string3, countryCode2, docUploadCapturedDocument2, arrayList, (PhotoDocument) parcel.readParcelable(SddrFlowState.class.getClassLoader()), (PhotoDocument) parcel.readParcelable(SddrFlowState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SddrFlowState[] newArray(int i) {
            return new SddrFlowState[i];
        }
    }

    public static /* synthetic */ SddrFlowState copy$default(SddrFlowState sddrFlowState, CountryCode countryCode, String str, String str2, CountryCode countryCode2, PdfDocument docUploadCapturedDocument2, List list, PhotoDocument docUploadCapturedDocument3, PhotoDocument docUploadCapturedDocument32, int i, Object obj) {
        if ((i & 1) != 0) {
            countryCode = sddrFlowState.userLocality;
        }
        if ((i & 2) != 0) {
            str = sddrFlowState.defaultDocumentType;
        }
        if ((i & 4) != 0) {
            str2 = sddrFlowState.selectedDocumentType;
        }
        if ((i & 8) != 0) {
            countryCode2 = sddrFlowState.selectedCountry;
        }
        if ((i & 16) != 0) {
            docUploadCapturedDocument2 = sddrFlowState.pdfToUpload;
        }
        if ((i & 32) != 0) {
            list = sddrFlowState.captureQueue;
        }
        if ((i & 64) != 0) {
            docUploadCapturedDocument3 = sddrFlowState.frontPhotoToUpload;
        }
        if ((i & 128) != 0) {
            docUploadCapturedDocument32 = sddrFlowState.backPhotoToUpload;
        }
        PhotoDocument docUploadCapturedDocument33 = docUploadCapturedDocument3;
        PhotoDocument docUploadCapturedDocument34 = docUploadCapturedDocument32;
        PdfDocument docUploadCapturedDocument22 = docUploadCapturedDocument2;
        List list2 = list;
        return sddrFlowState.copy(countryCode, str, str2, countryCode2, docUploadCapturedDocument22, list2, docUploadCapturedDocument33, docUploadCapturedDocument34);
    }

    /* renamed from: component1, reason: from getter */
    public final CountryCode getUserLocality() {
        return this.userLocality;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDefaultDocumentType() {
        return this.defaultDocumentType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedDocumentType() {
        return this.selectedDocumentType;
    }

    /* renamed from: component4, reason: from getter */
    public final CountryCode getSelectedCountry() {
        return this.selectedCountry;
    }

    /* renamed from: component5, reason: from getter */
    public final PdfDocument getPdfToUpload() {
        return this.pdfToUpload;
    }

    public final List<IdDocument.Side> component6() {
        return this.captureQueue;
    }

    /* renamed from: component7, reason: from getter */
    public final PhotoDocument getFrontPhotoToUpload() {
        return this.frontPhotoToUpload;
    }

    /* renamed from: component8, reason: from getter */
    public final PhotoDocument getBackPhotoToUpload() {
        return this.backPhotoToUpload;
    }

    public final SddrFlowState copy(CountryCode userLocality, String defaultDocumentType, String selectedDocumentType, CountryCode selectedCountry, PdfDocument pdfToUpload, List<? extends IdDocument.Side> captureQueue, PhotoDocument frontPhotoToUpload, PhotoDocument backPhotoToUpload) {
        Intrinsics.checkNotNullParameter(defaultDocumentType, "defaultDocumentType");
        Intrinsics.checkNotNullParameter(captureQueue, "captureQueue");
        return new SddrFlowState(userLocality, defaultDocumentType, selectedDocumentType, selectedCountry, pdfToUpload, captureQueue, frontPhotoToUpload, backPhotoToUpload);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SddrFlowState)) {
            return false;
        }
        SddrFlowState sddrFlowState = (SddrFlowState) other;
        return Intrinsics.areEqual(this.userLocality, sddrFlowState.userLocality) && Intrinsics.areEqual(this.defaultDocumentType, sddrFlowState.defaultDocumentType) && Intrinsics.areEqual(this.selectedDocumentType, sddrFlowState.selectedDocumentType) && Intrinsics.areEqual(this.selectedCountry, sddrFlowState.selectedCountry) && Intrinsics.areEqual(this.pdfToUpload, sddrFlowState.pdfToUpload) && Intrinsics.areEqual(this.captureQueue, sddrFlowState.captureQueue) && Intrinsics.areEqual(this.frontPhotoToUpload, sddrFlowState.frontPhotoToUpload) && Intrinsics.areEqual(this.backPhotoToUpload, sddrFlowState.backPhotoToUpload);
    }

    public int hashCode() {
        CountryCode countryCode = this.userLocality;
        int iHashCode = (((countryCode == null ? 0 : countryCode.hashCode()) * 31) + this.defaultDocumentType.hashCode()) * 31;
        String str = this.selectedDocumentType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CountryCode countryCode2 = this.selectedCountry;
        int iHashCode3 = (iHashCode2 + (countryCode2 == null ? 0 : countryCode2.hashCode())) * 31;
        PdfDocument docUploadCapturedDocument2 = this.pdfToUpload;
        int iHashCode4 = (((iHashCode3 + (docUploadCapturedDocument2 == null ? 0 : docUploadCapturedDocument2.hashCode())) * 31) + this.captureQueue.hashCode()) * 31;
        PhotoDocument docUploadCapturedDocument3 = this.frontPhotoToUpload;
        int iHashCode5 = (iHashCode4 + (docUploadCapturedDocument3 == null ? 0 : docUploadCapturedDocument3.hashCode())) * 31;
        PhotoDocument docUploadCapturedDocument32 = this.backPhotoToUpload;
        return iHashCode5 + (docUploadCapturedDocument32 != null ? docUploadCapturedDocument32.hashCode() : 0);
    }

    public String toString() {
        return "SddrFlowState(userLocality=" + this.userLocality + ", defaultDocumentType=" + this.defaultDocumentType + ", selectedDocumentType=" + this.selectedDocumentType + ", selectedCountry=" + this.selectedCountry + ", pdfToUpload=" + this.pdfToUpload + ", captureQueue=" + this.captureQueue + ", frontPhotoToUpload=" + this.frontPhotoToUpload + ", backPhotoToUpload=" + this.backPhotoToUpload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.userLocality);
        dest.writeString(this.defaultDocumentType);
        dest.writeString(this.selectedDocumentType);
        dest.writeSerializable(this.selectedCountry);
        dest.writeParcelable(this.pdfToUpload, flags);
        List<IdDocument.Side> list = this.captureQueue;
        dest.writeInt(list.size());
        Iterator<IdDocument.Side> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeParcelable(this.frontPhotoToUpload, flags);
        dest.writeParcelable(this.backPhotoToUpload, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SddrFlowState(CountryCode countryCode, String defaultDocumentType, String str, CountryCode countryCode2, PdfDocument docUploadCapturedDocument2, List<? extends IdDocument.Side> captureQueue, PhotoDocument docUploadCapturedDocument3, PhotoDocument docUploadCapturedDocument32) {
        Intrinsics.checkNotNullParameter(defaultDocumentType, "defaultDocumentType");
        Intrinsics.checkNotNullParameter(captureQueue, "captureQueue");
        this.userLocality = countryCode;
        this.defaultDocumentType = defaultDocumentType;
        this.selectedDocumentType = str;
        this.selectedCountry = countryCode2;
        this.pdfToUpload = docUploadCapturedDocument2;
        this.captureQueue = captureQueue;
        this.frontPhotoToUpload = docUploadCapturedDocument3;
        this.backPhotoToUpload = docUploadCapturedDocument32;
    }

    public final CountryCode getUserLocality() {
        return this.userLocality;
    }

    public final String getDefaultDocumentType() {
        return this.defaultDocumentType;
    }

    public final String getSelectedDocumentType() {
        return this.selectedDocumentType;
    }

    public final CountryCode getSelectedCountry() {
        return this.selectedCountry;
    }

    public final PdfDocument getPdfToUpload() {
        return this.pdfToUpload;
    }

    public /* synthetic */ SddrFlowState(CountryCode countryCode, String str, String str2, CountryCode countryCode2, PdfDocument docUploadCapturedDocument2, List list, PhotoDocument docUploadCapturedDocument3, PhotoDocument docUploadCapturedDocument32, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(countryCode, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : countryCode2, (i & 16) != 0 ? null : docUploadCapturedDocument2, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : docUploadCapturedDocument3, (i & 128) != 0 ? null : docUploadCapturedDocument32);
    }

    public final List<IdDocument.Side> getCaptureQueue() {
        return this.captureQueue;
    }

    public final PhotoDocument getFrontPhotoToUpload() {
        return this.frontPhotoToUpload;
    }

    public final PhotoDocument getBackPhotoToUpload() {
        return this.backPhotoToUpload;
    }

    public final String getDocumentTypeToUpload() {
        String str = this.selectedDocumentType;
        return str == null ? this.defaultDocumentType : str;
    }

    public final CountryCode getCountryToUpload() {
        CountryCode countryCode = this.selectedCountry;
        return countryCode == null ? this.userLocality : countryCode;
    }
}
