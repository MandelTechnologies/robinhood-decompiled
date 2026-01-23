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

/* compiled from: MigrationKickoffAckData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationKickoffAckData;", "Lcom/squareup/wire/Message;", "", "partner_migration_code", "", "rh_migration_code", "eligible", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getPartner_migration_code", "()Ljava/lang/String;", "getRh_migration_code", "getEligible", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationKickoffAckData extends Message {

    @JvmField
    public static final ProtoAdapter<MigrationKickoffAckData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean eligible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String partner_migration_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String rh_migration_code;

    public MigrationKickoffAckData() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ MigrationKickoffAckData(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27906newBuilder();
    }

    public final String getPartner_migration_code() {
        return this.partner_migration_code;
    }

    public final String getRh_migration_code() {
        return this.rh_migration_code;
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationKickoffAckData(String partner_migration_code, String rh_migration_code, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.partner_migration_code = partner_migration_code;
        this.rh_migration_code = rh_migration_code;
        this.eligible = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27906newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MigrationKickoffAckData)) {
            return false;
        }
        MigrationKickoffAckData migrationKickoffAckData = (MigrationKickoffAckData) other;
        return Intrinsics.areEqual(unknownFields(), migrationKickoffAckData.unknownFields()) && Intrinsics.areEqual(this.partner_migration_code, migrationKickoffAckData.partner_migration_code) && Intrinsics.areEqual(this.rh_migration_code, migrationKickoffAckData.rh_migration_code) && this.eligible == migrationKickoffAckData.eligible;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.partner_migration_code.hashCode()) * 37) + this.rh_migration_code.hashCode()) * 37) + Boolean.hashCode(this.eligible);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("partner_migration_code=" + Internal.sanitize(this.partner_migration_code));
        arrayList.add("rh_migration_code=" + Internal.sanitize(this.rh_migration_code));
        arrayList.add("eligible=" + this.eligible);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MigrationKickoffAckData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MigrationKickoffAckData copy$default(MigrationKickoffAckData migrationKickoffAckData, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = migrationKickoffAckData.partner_migration_code;
        }
        if ((i & 2) != 0) {
            str2 = migrationKickoffAckData.rh_migration_code;
        }
        if ((i & 4) != 0) {
            z = migrationKickoffAckData.eligible;
        }
        if ((i & 8) != 0) {
            byteString = migrationKickoffAckData.unknownFields();
        }
        return migrationKickoffAckData.copy(str, str2, z, byteString);
    }

    public final MigrationKickoffAckData copy(String partner_migration_code, String rh_migration_code, boolean eligible, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MigrationKickoffAckData(partner_migration_code, rh_migration_code, eligible, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationKickoffAckData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MigrationKickoffAckData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.MigrationKickoffAckData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MigrationKickoffAckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRh_migration_code());
                }
                return value.getEligible() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getEligible())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MigrationKickoffAckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRh_migration_code());
                }
                if (value.getEligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getEligible()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MigrationKickoffAckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getEligible()));
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRh_migration_code());
                }
                if (Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MigrationKickoffAckData redact(MigrationKickoffAckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MigrationKickoffAckData.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MigrationKickoffAckData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MigrationKickoffAckData(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
