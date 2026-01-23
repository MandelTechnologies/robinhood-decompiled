package gold.proto.p464v1;

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

/* compiled from: GoldSageAgreement.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lgold/proto/v1/GoldSageAgreement;", "Lcom/squareup/wire/Message;", "", "agreement_id", "", "agreement_sha256", "agreement_type", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAgreement_id", "()Ljava/lang/String;", "getAgreement_sha256", "getAgreement_type", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GoldSageAgreement extends Message {

    @JvmField
    public static final ProtoAdapter<GoldSageAgreement> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String agreement_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementSha256", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String agreement_sha256;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String agreement_type;

    public GoldSageAgreement() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ GoldSageAgreement(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28131newBuilder();
    }

    public final String getAgreement_id() {
        return this.agreement_id;
    }

    public final String getAgreement_sha256() {
        return this.agreement_sha256;
    }

    public final String getAgreement_type() {
        return this.agreement_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSageAgreement(String agreement_id, String agreement_sha256, String agreement_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
        Intrinsics.checkNotNullParameter(agreement_sha256, "agreement_sha256");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.agreement_id = agreement_id;
        this.agreement_sha256 = agreement_sha256;
        this.agreement_type = agreement_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28131newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GoldSageAgreement)) {
            return false;
        }
        GoldSageAgreement goldSageAgreement = (GoldSageAgreement) other;
        return Intrinsics.areEqual(unknownFields(), goldSageAgreement.unknownFields()) && Intrinsics.areEqual(this.agreement_id, goldSageAgreement.agreement_id) && Intrinsics.areEqual(this.agreement_sha256, goldSageAgreement.agreement_sha256) && Intrinsics.areEqual(this.agreement_type, goldSageAgreement.agreement_type);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.agreement_id.hashCode()) * 37) + this.agreement_sha256.hashCode()) * 37) + this.agreement_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("agreement_id=" + Internal.sanitize(this.agreement_id));
        arrayList.add("agreement_sha256=" + Internal.sanitize(this.agreement_sha256));
        arrayList.add("agreement_type=" + Internal.sanitize(this.agreement_type));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GoldSageAgreement{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GoldSageAgreement copy$default(GoldSageAgreement goldSageAgreement, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldSageAgreement.agreement_id;
        }
        if ((i & 2) != 0) {
            str2 = goldSageAgreement.agreement_sha256;
        }
        if ((i & 4) != 0) {
            str3 = goldSageAgreement.agreement_type;
        }
        if ((i & 8) != 0) {
            byteString = goldSageAgreement.unknownFields();
        }
        return goldSageAgreement.copy(str, str2, str3, byteString);
    }

    public final GoldSageAgreement copy(String agreement_id, String agreement_sha256, String agreement_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
        Intrinsics.checkNotNullParameter(agreement_sha256, "agreement_sha256");
        Intrinsics.checkNotNullParameter(agreement_type, "agreement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GoldSageAgreement(agreement_id, agreement_sha256, agreement_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GoldSageAgreement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GoldSageAgreement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GoldSageAgreement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GoldSageAgreement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAgreement_id());
                }
                if (!Intrinsics.areEqual(value.getAgreement_sha256(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAgreement_sha256());
                }
                return !Intrinsics.areEqual(value.getAgreement_type(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAgreement_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GoldSageAgreement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAgreement_id());
                }
                if (!Intrinsics.areEqual(value.getAgreement_sha256(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_sha256());
                }
                if (!Intrinsics.areEqual(value.getAgreement_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAgreement_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GoldSageAgreement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAgreement_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAgreement_type());
                }
                if (!Intrinsics.areEqual(value.getAgreement_sha256(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_sha256());
                }
                if (Intrinsics.areEqual(value.getAgreement_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAgreement_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageAgreement redact(GoldSageAgreement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GoldSageAgreement.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GoldSageAgreement decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GoldSageAgreement(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
