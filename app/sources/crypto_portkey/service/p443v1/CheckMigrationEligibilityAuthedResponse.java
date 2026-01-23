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

/* compiled from: CheckMigrationEligibilityAuthedResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016JJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcrypto_portkey/service/v1/CheckMigrationEligibilityAuthedResponse;", "Lcom/squareup/wire/Message;", "", "eligibility_status", "Lcrypto_portkey/service/v1/MigrationEligibilityStatus;", "failure_reason", "", "partner_migration_code", "migration_id", "current_state", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_portkey/service/v1/MigrationEligibilityStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getEligibility_status", "()Lcrypto_portkey/service/v1/MigrationEligibilityStatus;", "getFailure_reason", "()Ljava/lang/String;", "getPartner_migration_code", "getMigration_id", "getCurrent_state", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CheckMigrationEligibilityAuthedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CheckMigrationEligibilityAuthedResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String current_state;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationEligibilityStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MigrationEligibilityStatus eligibility_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String migration_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String partner_migration_code;

    public CheckMigrationEligibilityAuthedResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27899newBuilder();
    }

    public final MigrationEligibilityStatus getEligibility_status() {
        return this.eligibility_status;
    }

    public /* synthetic */ CheckMigrationEligibilityAuthedResponse(MigrationEligibilityStatus migrationEligibilityStatus, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED : migrationEligibilityStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getFailure_reason() {
        return this.failure_reason;
    }

    public final String getPartner_migration_code() {
        return this.partner_migration_code;
    }

    public final String getMigration_id() {
        return this.migration_id;
    }

    public final String getCurrent_state() {
        return this.current_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckMigrationEligibilityAuthedResponse(MigrationEligibilityStatus eligibility_status, String str, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.eligibility_status = eligibility_status;
        this.failure_reason = str;
        this.partner_migration_code = str2;
        this.migration_id = str3;
        this.current_state = str4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27899newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CheckMigrationEligibilityAuthedResponse)) {
            return false;
        }
        CheckMigrationEligibilityAuthedResponse checkMigrationEligibilityAuthedResponse = (CheckMigrationEligibilityAuthedResponse) other;
        return Intrinsics.areEqual(unknownFields(), checkMigrationEligibilityAuthedResponse.unknownFields()) && this.eligibility_status == checkMigrationEligibilityAuthedResponse.eligibility_status && Intrinsics.areEqual(this.failure_reason, checkMigrationEligibilityAuthedResponse.failure_reason) && Intrinsics.areEqual(this.partner_migration_code, checkMigrationEligibilityAuthedResponse.partner_migration_code) && Intrinsics.areEqual(this.migration_id, checkMigrationEligibilityAuthedResponse.migration_id) && Intrinsics.areEqual(this.current_state, checkMigrationEligibilityAuthedResponse.current_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.eligibility_status.hashCode()) * 37;
        String str = this.failure_reason;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.partner_migration_code;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.migration_id;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.current_state;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("eligibility_status=" + this.eligibility_status);
        String str = this.failure_reason;
        if (str != null) {
            arrayList.add("failure_reason=" + Internal.sanitize(str));
        }
        String str2 = this.partner_migration_code;
        if (str2 != null) {
            arrayList.add("partner_migration_code=" + Internal.sanitize(str2));
        }
        String str3 = this.migration_id;
        if (str3 != null) {
            arrayList.add("migration_id=" + Internal.sanitize(str3));
        }
        String str4 = this.current_state;
        if (str4 != null) {
            arrayList.add("current_state=" + Internal.sanitize(str4));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CheckMigrationEligibilityAuthedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CheckMigrationEligibilityAuthedResponse copy$default(CheckMigrationEligibilityAuthedResponse checkMigrationEligibilityAuthedResponse, MigrationEligibilityStatus migrationEligibilityStatus, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            migrationEligibilityStatus = checkMigrationEligibilityAuthedResponse.eligibility_status;
        }
        if ((i & 2) != 0) {
            str = checkMigrationEligibilityAuthedResponse.failure_reason;
        }
        if ((i & 4) != 0) {
            str2 = checkMigrationEligibilityAuthedResponse.partner_migration_code;
        }
        if ((i & 8) != 0) {
            str3 = checkMigrationEligibilityAuthedResponse.migration_id;
        }
        if ((i & 16) != 0) {
            str4 = checkMigrationEligibilityAuthedResponse.current_state;
        }
        if ((i & 32) != 0) {
            byteString = checkMigrationEligibilityAuthedResponse.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return checkMigrationEligibilityAuthedResponse.copy(migrationEligibilityStatus, str, str2, str3, str5, byteString2);
    }

    public final CheckMigrationEligibilityAuthedResponse copy(MigrationEligibilityStatus eligibility_status, String failure_reason, String partner_migration_code, String migration_id, String current_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(eligibility_status, "eligibility_status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CheckMigrationEligibilityAuthedResponse(eligibility_status, failure_reason, partner_migration_code, migration_id, current_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckMigrationEligibilityAuthedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CheckMigrationEligibilityAuthedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.CheckMigrationEligibilityAuthedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CheckMigrationEligibilityAuthedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEligibility_status() != MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED) {
                    size += MigrationEligibilityStatus.ADAPTER.encodedSizeWithTag(1, value.getEligibility_status());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getFailure_reason()) + protoAdapter.encodedSizeWithTag(3, value.getPartner_migration_code()) + protoAdapter.encodedSizeWithTag(4, value.getMigration_id()) + protoAdapter.encodedSizeWithTag(5, value.getCurrent_state());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CheckMigrationEligibilityAuthedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEligibility_status() != MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED) {
                    MigrationEligibilityStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getEligibility_status());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getFailure_reason());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPartner_migration_code());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMigration_id());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCurrent_state());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CheckMigrationEligibilityAuthedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getCurrent_state());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getMigration_id());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getPartner_migration_code());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getFailure_reason());
                if (value.getEligibility_status() != MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED) {
                    MigrationEligibilityStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getEligibility_status());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CheckMigrationEligibilityAuthedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MigrationEligibilityStatus migrationEligibilityStatusDecode = MigrationEligibilityStatus.MIGRATION_ELIGIBILITY_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                while (true) {
                    MigrationEligibilityStatus migrationEligibilityStatus = migrationEligibilityStatusDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CheckMigrationEligibilityAuthedResponse(migrationEligibilityStatus, strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                migrationEligibilityStatusDecode = MigrationEligibilityStatus.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CheckMigrationEligibilityAuthedResponse redact(CheckMigrationEligibilityAuthedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CheckMigrationEligibilityAuthedResponse.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
