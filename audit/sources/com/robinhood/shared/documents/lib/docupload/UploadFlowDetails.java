package com.robinhood.shared.documents.lib.docupload;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.DocUploadCapturedDocument;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploadFlowDetails.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u001f\u001a\u00020\u0000J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tHÆ\u0003Je\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tHÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u00067"}, m3636d2 = {"Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "Landroid/os/Parcelable;", "documentType", "Lcom/robinhood/models/api/IdDocument$Type;", "requestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "forCrypto", "", "captureQueue", "", "Lcom/robinhood/models/api/IdDocument$Side;", "captured", "Lcom/robinhood/models/api/DocUploadCapturedDocument;", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "allowedCaptureMethods", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$AllowedCaptureMethods;", "<init>", "(Lcom/robinhood/models/api/IdDocument$Type;Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;ZLjava/util/List;Ljava/util/List;Lcom/robinhood/iso/countrycode/CountryCode;Ljava/util/List;)V", "getDocumentType", "()Lcom/robinhood/models/api/IdDocument$Type;", "getRequestType", "()Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "getForCrypto", "()Z", "getCaptureQueue", "()Ljava/util/List;", "getCaptured", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getAllowedCaptureMethods", "copyPoppingCaptureQueue", "copyConfirmingCapture", "document", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-doc-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class UploadFlowDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UploadFlowDetails> CREATOR = new Creator();
    private final List<ApiDocumentRequest.AllowedCaptureMethods> allowedCaptureMethods;
    private final List<IdDocument.Side> captureQueue;
    private final List<DocUploadCapturedDocument> captured;
    private final CountryCode countryCode;
    private final IdDocument.Type documentType;
    private final boolean forCrypto;
    private final ApiDocumentRequest.Type requestType;

    /* compiled from: UploadFlowDetails.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UploadFlowDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadFlowDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IdDocument.Type typeValueOf = IdDocument.Type.valueOf(parcel.readString());
            ApiDocumentRequest.Type typeValueOf2 = ApiDocumentRequest.Type.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(IdDocument.Side.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(parcel.readParcelable(UploadFlowDetails.class.getClassLoader()));
            }
            CountryCode countryCode = (CountryCode) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList.add(ApiDocumentRequest.AllowedCaptureMethods.valueOf(parcel.readString()));
                }
            }
            return new UploadFlowDetails(typeValueOf, typeValueOf2, z, arrayList2, arrayList3, countryCode, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UploadFlowDetails[] newArray(int i) {
            return new UploadFlowDetails[i];
        }
    }

    public static /* synthetic */ UploadFlowDetails copy$default(UploadFlowDetails uploadFlowDetails, IdDocument.Type type2, ApiDocumentRequest.Type type3, boolean z, List list, List list2, CountryCode countryCode, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = uploadFlowDetails.documentType;
        }
        if ((i & 2) != 0) {
            type3 = uploadFlowDetails.requestType;
        }
        if ((i & 4) != 0) {
            z = uploadFlowDetails.forCrypto;
        }
        if ((i & 8) != 0) {
            list = uploadFlowDetails.captureQueue;
        }
        if ((i & 16) != 0) {
            list2 = uploadFlowDetails.captured;
        }
        if ((i & 32) != 0) {
            countryCode = uploadFlowDetails.countryCode;
        }
        if ((i & 64) != 0) {
            list3 = uploadFlowDetails.allowedCaptureMethods;
        }
        CountryCode countryCode2 = countryCode;
        List list4 = list3;
        List list5 = list2;
        boolean z2 = z;
        return uploadFlowDetails.copy(type2, type3, z2, list, list5, countryCode2, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final IdDocument.Type getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiDocumentRequest.Type getRequestType() {
        return this.requestType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getForCrypto() {
        return this.forCrypto;
    }

    public final List<IdDocument.Side> component4() {
        return this.captureQueue;
    }

    public final List<DocUploadCapturedDocument> component5() {
        return this.captured;
    }

    /* renamed from: component6, reason: from getter */
    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    public final List<ApiDocumentRequest.AllowedCaptureMethods> component7() {
        return this.allowedCaptureMethods;
    }

    public final UploadFlowDetails copy(IdDocument.Type documentType, ApiDocumentRequest.Type requestType, boolean forCrypto, List<? extends IdDocument.Side> captureQueue, List<? extends DocUploadCapturedDocument> captured, CountryCode countryCode, List<? extends ApiDocumentRequest.AllowedCaptureMethods> allowedCaptureMethods) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(captureQueue, "captureQueue");
        Intrinsics.checkNotNullParameter(captured, "captured");
        return new UploadFlowDetails(documentType, requestType, forCrypto, captureQueue, captured, countryCode, allowedCaptureMethods);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFlowDetails)) {
            return false;
        }
        UploadFlowDetails uploadFlowDetails = (UploadFlowDetails) other;
        return this.documentType == uploadFlowDetails.documentType && this.requestType == uploadFlowDetails.requestType && this.forCrypto == uploadFlowDetails.forCrypto && Intrinsics.areEqual(this.captureQueue, uploadFlowDetails.captureQueue) && Intrinsics.areEqual(this.captured, uploadFlowDetails.captured) && Intrinsics.areEqual(this.countryCode, uploadFlowDetails.countryCode) && Intrinsics.areEqual(this.allowedCaptureMethods, uploadFlowDetails.allowedCaptureMethods);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.documentType.hashCode() * 31) + this.requestType.hashCode()) * 31) + Boolean.hashCode(this.forCrypto)) * 31) + this.captureQueue.hashCode()) * 31) + this.captured.hashCode()) * 31;
        CountryCode countryCode = this.countryCode;
        int iHashCode2 = (iHashCode + (countryCode == null ? 0 : countryCode.hashCode())) * 31;
        List<ApiDocumentRequest.AllowedCaptureMethods> list = this.allowedCaptureMethods;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UploadFlowDetails(documentType=" + this.documentType + ", requestType=" + this.requestType + ", forCrypto=" + this.forCrypto + ", captureQueue=" + this.captureQueue + ", captured=" + this.captured + ", countryCode=" + this.countryCode + ", allowedCaptureMethods=" + this.allowedCaptureMethods + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.documentType.name());
        dest.writeString(this.requestType.name());
        dest.writeInt(this.forCrypto ? 1 : 0);
        List<IdDocument.Side> list = this.captureQueue;
        dest.writeInt(list.size());
        Iterator<IdDocument.Side> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        List<DocUploadCapturedDocument> list2 = this.captured;
        dest.writeInt(list2.size());
        Iterator<DocUploadCapturedDocument> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeSerializable(this.countryCode);
        List<ApiDocumentRequest.AllowedCaptureMethods> list3 = this.allowedCaptureMethods;
        if (list3 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list3.size());
        Iterator<ApiDocumentRequest.AllowedCaptureMethods> it3 = list3.iterator();
        while (it3.hasNext()) {
            dest.writeString(it3.next().name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UploadFlowDetails(IdDocument.Type documentType, ApiDocumentRequest.Type requestType, boolean z, List<? extends IdDocument.Side> captureQueue, List<? extends DocUploadCapturedDocument> captured, CountryCode countryCode, List<? extends ApiDocumentRequest.AllowedCaptureMethods> list) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(captureQueue, "captureQueue");
        Intrinsics.checkNotNullParameter(captured, "captured");
        this.documentType = documentType;
        this.requestType = requestType;
        this.forCrypto = z;
        this.captureQueue = captureQueue;
        this.captured = captured;
        this.countryCode = countryCode;
        this.allowedCaptureMethods = list;
    }

    public final IdDocument.Type getDocumentType() {
        return this.documentType;
    }

    public final ApiDocumentRequest.Type getRequestType() {
        return this.requestType;
    }

    public final boolean getForCrypto() {
        return this.forCrypto;
    }

    public /* synthetic */ UploadFlowDetails(IdDocument.Type type2, ApiDocumentRequest.Type type3, boolean z, List list, List list2, CountryCode countryCode, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, type3, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? null : countryCode, (i & 64) != 0 ? null : list3);
    }

    public final List<IdDocument.Side> getCaptureQueue() {
        return this.captureQueue;
    }

    public final List<DocUploadCapturedDocument> getCaptured() {
        return this.captured;
    }

    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    public final List<ApiDocumentRequest.AllowedCaptureMethods> getAllowedCaptureMethods() {
        return this.allowedCaptureMethods;
    }

    public final UploadFlowDetails copyPoppingCaptureQueue() {
        return copy$default(this, null, null, false, CollectionsKt.drop(this.captureQueue, 1), null, null, null, 119, null);
    }

    public final UploadFlowDetails copyConfirmingCapture(DocUploadCapturedDocument document) {
        Intrinsics.checkNotNullParameter(document, "document");
        return copy$default(this, null, null, false, null, CollectionsKt.plus((Collection<? extends DocUploadCapturedDocument>) this.captured, document), null, null, 111, null);
    }
}
