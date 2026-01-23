package microgram.android.internal.bundle.signature;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PackageSignature.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/android/internal/bundle/signature/PackageSignature;", "Lcom/squareup/wire/Message;", "", "signatureData", "Lokio/ByteString;", "keyId", "", "version", "", "unknownFields", "<init>", "(Lokio/ByteString;Ljava/lang/String;JLokio/ByteString;)V", "getSignatureData", "()Lokio/ByteString;", "getKeyId", "()Ljava/lang/String;", "getVersion", "()J", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PackageSignature extends Message {

    @JvmField
    public static final ProtoAdapter<PackageSignature> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String keyId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ByteString signatureData;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long version;

    public PackageSignature() {
        this(null, null, 0L, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28948newBuilder();
    }

    public final ByteString getSignatureData() {
        return this.signatureData;
    }

    public /* synthetic */ PackageSignature(ByteString byteString, String str, long j, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ByteString.EMPTY : byteString, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? ByteString.EMPTY : byteString2);
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final long getVersion() {
        return this.version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageSignature(ByteString signatureData, String keyId, long j, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(signatureData, "signatureData");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.signatureData = signatureData;
        this.keyId = keyId;
        this.version = j;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28948newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PackageSignature)) {
            return false;
        }
        PackageSignature packageSignature = (PackageSignature) other;
        return Intrinsics.areEqual(unknownFields(), packageSignature.unknownFields()) && Intrinsics.areEqual(this.signatureData, packageSignature.signatureData) && Intrinsics.areEqual(this.keyId, packageSignature.keyId) && this.version == packageSignature.version;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.signatureData.hashCode()) * 37) + this.keyId.hashCode()) * 37) + Long.hashCode(this.version);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("signatureData=" + this.signatureData);
        arrayList.add("keyId=" + Internal.sanitize(this.keyId));
        arrayList.add("version=" + this.version);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PackageSignature{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PackageSignature copy$default(PackageSignature packageSignature, ByteString byteString, String str, long j, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            byteString = packageSignature.signatureData;
        }
        if ((i & 2) != 0) {
            str = packageSignature.keyId;
        }
        if ((i & 4) != 0) {
            j = packageSignature.version;
        }
        if ((i & 8) != 0) {
            byteString2 = packageSignature.unknownFields();
        }
        ByteString byteString3 = byteString2;
        return packageSignature.copy(byteString, str, j, byteString3);
    }

    public final PackageSignature copy(ByteString signatureData, String keyId, long version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(signatureData, "signatureData");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PackageSignature(signatureData, keyId, version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PackageSignature.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PackageSignature>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.android.internal.bundle.signature.PackageSignature$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PackageSignature value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSignatureData(), ByteString.EMPTY)) {
                    size += ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getSignatureData());
                }
                if (!Intrinsics.areEqual(value.getKeyId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getKeyId());
                }
                return value.getVersion() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getVersion())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PackageSignature value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSignatureData(), ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSignatureData());
                }
                if (!Intrinsics.areEqual(value.getKeyId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getKeyId());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getVersion()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PackageSignature value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getVersion()));
                }
                if (!Intrinsics.areEqual(value.getKeyId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getKeyId());
                }
                if (Intrinsics.areEqual(value.getSignatureData(), ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, (int) value.getSignatureData());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PackageSignature decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ByteString byteStringDecode = ByteString.EMPTY;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                while (true) {
                    long j = jLongValue;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PackageSignature(byteStringDecode, strDecode, j, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag != 3) {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PackageSignature redact(PackageSignature value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PackageSignature.copy$default(value, null, null, 0L, ByteString.EMPTY, 7, null);
            }
        };
    }
}
