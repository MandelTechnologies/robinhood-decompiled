package crypto_portkey.service.p443v1;

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

/* compiled from: MigrationInitiateAckData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationInitiateAckData;", "Lcom/squareup/wire/Message;", "", "partner_migration_code", "", "status", "failure_code", "failure_reason", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPartner_migration_code", "()Ljava/lang/String;", "getStatus", "getFailure_code", "getFailure_reason", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationInitiateAckData extends Message {

    @JvmField
    public static final ProtoAdapter<MigrationInitiateAckData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String failure_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String partner_migration_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String status;

    public MigrationInitiateAckData() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ MigrationInitiateAckData(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27905newBuilder();
    }

    public final String getPartner_migration_code() {
        return this.partner_migration_code;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getFailure_code() {
        return this.failure_code;
    }

    public final String getFailure_reason() {
        return this.failure_reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationInitiateAckData(String partner_migration_code, String status, String failure_code, String failure_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(failure_code, "failure_code");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.partner_migration_code = partner_migration_code;
        this.status = status;
        this.failure_code = failure_code;
        this.failure_reason = failure_reason;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27905newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MigrationInitiateAckData)) {
            return false;
        }
        MigrationInitiateAckData migrationInitiateAckData = (MigrationInitiateAckData) other;
        return Intrinsics.areEqual(unknownFields(), migrationInitiateAckData.unknownFields()) && Intrinsics.areEqual(this.partner_migration_code, migrationInitiateAckData.partner_migration_code) && Intrinsics.areEqual(this.status, migrationInitiateAckData.status) && Intrinsics.areEqual(this.failure_code, migrationInitiateAckData.failure_code) && Intrinsics.areEqual(this.failure_reason, migrationInitiateAckData.failure_reason);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.partner_migration_code.hashCode()) * 37) + this.status.hashCode()) * 37) + this.failure_code.hashCode()) * 37) + this.failure_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("partner_migration_code=" + Internal.sanitize(this.partner_migration_code));
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("failure_code=" + Internal.sanitize(this.failure_code));
        arrayList.add("failure_reason=" + Internal.sanitize(this.failure_reason));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MigrationInitiateAckData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MigrationInitiateAckData copy$default(MigrationInitiateAckData migrationInitiateAckData, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = migrationInitiateAckData.partner_migration_code;
        }
        if ((i & 2) != 0) {
            str2 = migrationInitiateAckData.status;
        }
        if ((i & 4) != 0) {
            str3 = migrationInitiateAckData.failure_code;
        }
        if ((i & 8) != 0) {
            str4 = migrationInitiateAckData.failure_reason;
        }
        if ((i & 16) != 0) {
            byteString = migrationInitiateAckData.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return migrationInitiateAckData.copy(str, str2, str5, str4, byteString2);
    }

    public final MigrationInitiateAckData copy(String partner_migration_code, String status, String failure_code, String failure_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(failure_code, "failure_code");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MigrationInitiateAckData(partner_migration_code, status, failure_code, failure_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationInitiateAckData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MigrationInitiateAckData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.MigrationInitiateAckData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MigrationInitiateAckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getFailure_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getFailure_code());
                }
                return !Intrinsics.areEqual(value.getFailure_reason(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getFailure_reason()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MigrationInitiateAckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getFailure_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFailure_code());
                }
                if (!Intrinsics.areEqual(value.getFailure_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFailure_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MigrationInitiateAckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFailure_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getFailure_reason());
                }
                if (!Intrinsics.areEqual(value.getFailure_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFailure_code());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStatus());
                }
                if (Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MigrationInitiateAckData redact(MigrationInitiateAckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MigrationInitiateAckData.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MigrationInitiateAckData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MigrationInitiateAckData(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
