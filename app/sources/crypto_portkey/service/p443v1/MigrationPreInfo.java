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
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
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

/* compiled from: MigrationPreInfo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationPreInfo;", "Lcom/squareup/wire/Message;", "", "hashed_ssn", "", "partner_email", "partner_migration_code", "name", GovernmentIdNfcScan.dateOfBirthName, "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getHashed_ssn", "()Ljava/lang/String;", "getPartner_email", "getPartner_migration_code", "getName", "getDate_of_birth", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationPreInfo extends Message {

    @JvmField
    public static final ProtoAdapter<MigrationPreInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateOfBirth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String date_of_birth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hashedSsn", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String hashed_ssn;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "partnerEmail", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String partner_email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "partnerMigrationCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String partner_migration_code;

    public MigrationPreInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ MigrationPreInfo(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27908newBuilder();
    }

    public final String getHashed_ssn() {
        return this.hashed_ssn;
    }

    public final String getPartner_email() {
        return this.partner_email;
    }

    public final String getPartner_migration_code() {
        return this.partner_migration_code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDate_of_birth() {
        return this.date_of_birth;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MigrationPreInfo(String hashed_ssn, String partner_email, String partner_migration_code, String name, String date_of_birth, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(hashed_ssn, "hashed_ssn");
        Intrinsics.checkNotNullParameter(partner_email, "partner_email");
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.hashed_ssn = hashed_ssn;
        this.partner_email = partner_email;
        this.partner_migration_code = partner_migration_code;
        this.name = name;
        this.date_of_birth = date_of_birth;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27908newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MigrationPreInfo)) {
            return false;
        }
        MigrationPreInfo migrationPreInfo = (MigrationPreInfo) other;
        return Intrinsics.areEqual(unknownFields(), migrationPreInfo.unknownFields()) && Intrinsics.areEqual(this.hashed_ssn, migrationPreInfo.hashed_ssn) && Intrinsics.areEqual(this.partner_email, migrationPreInfo.partner_email) && Intrinsics.areEqual(this.partner_migration_code, migrationPreInfo.partner_migration_code) && Intrinsics.areEqual(this.name, migrationPreInfo.name) && Intrinsics.areEqual(this.date_of_birth, migrationPreInfo.date_of_birth);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.hashed_ssn.hashCode()) * 37) + this.partner_email.hashCode()) * 37) + this.partner_migration_code.hashCode()) * 37) + this.name.hashCode()) * 37) + this.date_of_birth.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hashed_ssn=" + Internal.sanitize(this.hashed_ssn));
        arrayList.add("partner_email=" + Internal.sanitize(this.partner_email));
        arrayList.add("partner_migration_code=" + Internal.sanitize(this.partner_migration_code));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("date_of_birth=" + Internal.sanitize(this.date_of_birth));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MigrationPreInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MigrationPreInfo copy$default(MigrationPreInfo migrationPreInfo, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = migrationPreInfo.hashed_ssn;
        }
        if ((i & 2) != 0) {
            str2 = migrationPreInfo.partner_email;
        }
        if ((i & 4) != 0) {
            str3 = migrationPreInfo.partner_migration_code;
        }
        if ((i & 8) != 0) {
            str4 = migrationPreInfo.name;
        }
        if ((i & 16) != 0) {
            str5 = migrationPreInfo.date_of_birth;
        }
        if ((i & 32) != 0) {
            byteString = migrationPreInfo.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return migrationPreInfo.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final MigrationPreInfo copy(String hashed_ssn, String partner_email, String partner_migration_code, String name, String date_of_birth, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(hashed_ssn, "hashed_ssn");
        Intrinsics.checkNotNullParameter(partner_email, "partner_email");
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MigrationPreInfo(hashed_ssn, partner_email, partner_migration_code, name, date_of_birth, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationPreInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MigrationPreInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.MigrationPreInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MigrationPreInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHashed_ssn(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHashed_ssn());
                }
                if (!Intrinsics.areEqual(value.getPartner_email(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPartner_email());
                }
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getName());
                }
                return !Intrinsics.areEqual(value.getDate_of_birth(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDate_of_birth()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MigrationPreInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHashed_ssn(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHashed_ssn());
                }
                if (!Intrinsics.areEqual(value.getPartner_email(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPartner_email());
                }
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDate_of_birth());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MigrationPreInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDate_of_birth());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getPartner_email(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPartner_email());
                }
                if (Intrinsics.areEqual(value.getHashed_ssn(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHashed_ssn());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MigrationPreInfo redact(MigrationPreInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MigrationPreInfo.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MigrationPreInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MigrationPreInfo(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
