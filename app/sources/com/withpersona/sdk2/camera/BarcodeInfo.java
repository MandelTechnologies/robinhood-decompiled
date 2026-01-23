package com.withpersona.sdk2.camera;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BarcodeInfo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/BarcodeInfo;", "", "<init>", "()V", "Pdf417BarcodeInfo", "MrzBarcodeInfo", "Lcom/withpersona/sdk2/camera/BarcodeInfo$MrzBarcodeInfo;", "Lcom/withpersona/sdk2/camera/BarcodeInfo$Pdf417BarcodeInfo;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class BarcodeInfo {
    public /* synthetic */ BarcodeInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BarcodeInfo() {
    }

    /* compiled from: BarcodeInfo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/BarcodeInfo$Pdf417BarcodeInfo;", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "", "extractionRawPayload", "<init>", "(Ljava/lang/String;)V", "Lcom/withpersona/sdk2/camera/AamvaExtraction;", "values", "()Lcom/withpersona/sdk2/camera/AamvaExtraction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExtractionRawPayload", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Pdf417BarcodeInfo extends BarcodeInfo {
        private final String extractionRawPayload;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pdf417BarcodeInfo) && Intrinsics.areEqual(this.extractionRawPayload, ((Pdf417BarcodeInfo) other).extractionRawPayload);
        }

        public int hashCode() {
            return this.extractionRawPayload.hashCode();
        }

        public String toString() {
            return "Pdf417BarcodeInfo(extractionRawPayload=" + this.extractionRawPayload + ")";
        }

        public String getExtractionRawPayload() {
            return this.extractionRawPayload;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pdf417BarcodeInfo(String extractionRawPayload) {
            super(null);
            Intrinsics.checkNotNullParameter(extractionRawPayload, "extractionRawPayload");
            this.extractionRawPayload = extractionRawPayload;
        }

        public final AamvaExtraction values() {
            return AamvaExtraction.INSTANCE.fromString(getExtractionRawPayload());
        }
    }

    /* compiled from: BarcodeInfo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/BarcodeInfo$MrzBarcodeInfo;", "Lcom/withpersona/sdk2/camera/BarcodeInfo;", "", "extractionRawPayload", "identificationNumber", "Ljava/util/Date;", "birthdate", "expirationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExtractionRawPayload", "getIdentificationNumber", "Ljava/util/Date;", "getBirthdate", "()Ljava/util/Date;", "getExpirationDate", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class MrzBarcodeInfo extends BarcodeInfo {
        private final Date birthdate;
        private final Date expirationDate;
        private final String extractionRawPayload;
        private final String identificationNumber;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MrzBarcodeInfo)) {
                return false;
            }
            MrzBarcodeInfo mrzBarcodeInfo = (MrzBarcodeInfo) other;
            return Intrinsics.areEqual(this.extractionRawPayload, mrzBarcodeInfo.extractionRawPayload) && Intrinsics.areEqual(this.identificationNumber, mrzBarcodeInfo.identificationNumber) && Intrinsics.areEqual(this.birthdate, mrzBarcodeInfo.birthdate) && Intrinsics.areEqual(this.expirationDate, mrzBarcodeInfo.expirationDate);
        }

        public int hashCode() {
            int iHashCode = this.extractionRawPayload.hashCode() * 31;
            String str = this.identificationNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Date date = this.birthdate;
            int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.expirationDate;
            return iHashCode3 + (date2 != null ? date2.hashCode() : 0);
        }

        public String toString() {
            return "MrzBarcodeInfo(extractionRawPayload=" + this.extractionRawPayload + ", identificationNumber=" + this.identificationNumber + ", birthdate=" + this.birthdate + ", expirationDate=" + this.expirationDate + ")";
        }

        public String getExtractionRawPayload() {
            return this.extractionRawPayload;
        }

        public final Date getBirthdate() {
            return this.birthdate;
        }

        public final Date getExpirationDate() {
            return this.expirationDate;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MrzBarcodeInfo(String extractionRawPayload, String str, Date date, Date date2) {
            super(null);
            Intrinsics.checkNotNullParameter(extractionRawPayload, "extractionRawPayload");
            this.extractionRawPayload = extractionRawPayload;
            this.identificationNumber = str;
            this.birthdate = date;
            this.expirationDate = date2;
        }
    }
}
