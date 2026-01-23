package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: Stripe3ds2Fingerprint.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "Landroid/os/Parcelable;", "", "source", "directoryServerName", "serverTransactionId", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "directoryServerEncryption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;)V", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "sdkData", "(Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSource", "getDirectoryServerName", "getServerTransactionId", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "getDirectoryServerEncryption", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "DirectoryServerEncryption", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Stripe3ds2Fingerprint implements Parcelable {
    public static final Parcelable.Creator<Stripe3ds2Fingerprint> CREATOR = new Creator();
    private final DirectoryServerEncryption directoryServerEncryption;
    private final String directoryServerName;
    private final String serverTransactionId;
    private final String source;

    /* compiled from: Stripe3ds2Fingerprint.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Stripe3ds2Fingerprint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2Fingerprint(parcel.readString(), parcel.readString(), parcel.readString(), DirectoryServerEncryption.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2Fingerprint[] newArray(int i) {
            return new Stripe3ds2Fingerprint[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2Fingerprint)) {
            return false;
        }
        Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) other;
        return Intrinsics.areEqual(this.source, stripe3ds2Fingerprint.source) && Intrinsics.areEqual(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && Intrinsics.areEqual(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && Intrinsics.areEqual(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
    }

    public int hashCode() {
        return (((((this.source.hashCode() * 31) + this.directoryServerName.hashCode()) * 31) + this.serverTransactionId.hashCode()) * 31) + this.directoryServerEncryption.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.source + ", directoryServerName=" + this.directoryServerName + ", serverTransactionId=" + this.serverTransactionId + ", directoryServerEncryption=" + this.directoryServerEncryption + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.source);
        parcel.writeString(this.directoryServerName);
        parcel.writeString(this.serverTransactionId);
        this.directoryServerEncryption.writeToParcel(parcel, flags);
    }

    public Stripe3ds2Fingerprint(String source, String directoryServerName, String serverTransactionId, DirectoryServerEncryption directoryServerEncryption) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
        Intrinsics.checkNotNullParameter(serverTransactionId, "serverTransactionId");
        Intrinsics.checkNotNullParameter(directoryServerEncryption, "directoryServerEncryption");
        this.source = source;
        this.directoryServerName = directoryServerName;
        this.serverTransactionId = serverTransactionId;
        this.directoryServerEncryption = directoryServerEncryption;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stripe3ds2Fingerprint(StripeIntent.NextActionData.SdkData.Use3DS2 sdkData) throws CertificateException {
        this(sdkData.getSource(), sdkData.getServerName(), sdkData.getTransactionId(), new DirectoryServerEncryption(sdkData.getServerEncryption().getDirectoryServerId(), sdkData.getServerEncryption().getDsCertificateData(), sdkData.getServerEncryption().getRootCertsData(), sdkData.getServerEncryption().getKeyId()));
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
    }

    /* compiled from: Stripe3ds2Fingerprint.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001)B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b(\u0010\u0010¨\u0006*"}, m3636d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "Landroid/os/Parcelable;", "", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "keyId", "<init>", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)V", "dsCertificateData", "rootCertsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDirectoryServerId", "Ljava/security/PublicKey;", "getDirectoryServerPublicKey", "()Ljava/security/PublicKey;", "Ljava/util/List;", "getRootCerts", "()Ljava/util/List;", "getKeyId", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class DirectoryServerEncryption implements Parcelable {
        private final String directoryServerId;
        private final PublicKey directoryServerPublicKey;
        private final String keyId;
        private final List<X509Certificate> rootCerts;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<DirectoryServerEncryption> CREATOR = new Creator();

        /* compiled from: Stripe3ds2Fingerprint.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<DirectoryServerEncryption> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new DirectoryServerEncryption(string2, publicKey, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectoryServerEncryption[] newArray(int i) {
                return new DirectoryServerEncryption[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectoryServerEncryption)) {
                return false;
            }
            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) other;
            return Intrinsics.areEqual(this.directoryServerId, directoryServerEncryption.directoryServerId) && Intrinsics.areEqual(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && Intrinsics.areEqual(this.rootCerts, directoryServerEncryption.rootCerts) && Intrinsics.areEqual(this.keyId, directoryServerEncryption.keyId);
        }

        public int hashCode() {
            int iHashCode = ((((this.directoryServerId.hashCode() * 31) + this.directoryServerPublicKey.hashCode()) * 31) + this.rootCerts.hashCode()) * 31;
            String str = this.keyId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.directoryServerId + ", directoryServerPublicKey=" + this.directoryServerPublicKey + ", rootCerts=" + this.rootCerts + ", keyId=" + this.keyId + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.directoryServerId);
            parcel.writeSerializable(this.directoryServerPublicKey);
            List<X509Certificate> list = this.rootCerts;
            parcel.writeInt(list.size());
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeSerializable(it.next());
            }
            parcel.writeString(this.keyId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DirectoryServerEncryption(String directoryServerId, PublicKey directoryServerPublicKey, List<? extends X509Certificate> rootCerts, String str) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(directoryServerPublicKey, "directoryServerPublicKey");
            Intrinsics.checkNotNullParameter(rootCerts, "rootCerts");
            this.directoryServerId = directoryServerId;
            this.directoryServerPublicKey = directoryServerPublicKey;
            this.rootCerts = rootCerts;
            this.keyId = str;
        }

        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        public final List<X509Certificate> getRootCerts() {
            return this.rootCerts;
        }

        public final String getKeyId() {
            return this.keyId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DirectoryServerEncryption(String directoryServerId, String dsCertificateData, List<String> rootCertsData, String str) {
            Intrinsics.checkNotNullParameter(directoryServerId, "directoryServerId");
            Intrinsics.checkNotNullParameter(dsCertificateData, "dsCertificateData");
            Intrinsics.checkNotNullParameter(rootCertsData, "rootCertsData");
            Companion companion = Companion;
            PublicKey publicKey = companion.generateCertificate(dsCertificateData).getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "getPublicKey(...)");
            this(directoryServerId, publicKey, (List<? extends X509Certificate>) companion.generateCertificates(rootCertsData), str);
        }

        /* compiled from: Stripe3ds2Fingerprint.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¨\u0006\n"}, m3636d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion;", "", "()V", "generateCertificate", "Ljava/security/cert/X509Certificate;", "certificateData", "", "generateCertificates", "", "certificatesData", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List<X509Certificate> generateCertificates(List<String> certificatesData) throws CertificateException {
                List<String> list = certificatesData;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(DirectoryServerEncryption.Companion.generateCertificate((String) it.next()));
                }
                return arrayList;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate generateCertificate(String certificateData) throws CertificateException {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = certificateData.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) certificateGenerateCertificate;
            }
        }
    }
}
