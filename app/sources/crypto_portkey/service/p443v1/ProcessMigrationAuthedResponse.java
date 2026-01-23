package crypto_portkey.service.p443v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.ErrorResponse;
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

/* compiled from: ProcessMigrationAuthedResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010 \u001a\u00020\u0002H\u0017J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\nH\u0016Ju\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010(R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b¨\u0006*"}, m3636d2 = {"Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponse;", "Lcom/squareup/wire/Message;", "", "balance_data", "Lcrypto_portkey/service/v1/PartnerBalanceData;", "success", "", ErrorResponse.ERROR_CODE, "Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;", "error_message", "", "error_details", "error_deeplink", "migration_status", "migration_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_portkey/service/v1/PartnerBalanceData;Ljava/lang/Boolean;Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getBalance_data", "()Lcrypto_portkey/service/v1/PartnerBalanceData;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError_code", "()Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;", "getError_message", "()Ljava/lang/String;", "getError_details", "getError_deeplink", "getMigration_status", "getMigration_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lcrypto_portkey/service/v1/PartnerBalanceData;Ljava/lang/Boolean;Lcrypto_portkey/service/v1/MigrationAuthedErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcrypto_portkey/service/v1/ProcessMigrationAuthedResponse;", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ProcessMigrationAuthedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ProcessMigrationAuthedResponse> ADAPTER;

    @WireField(adapter = "crypto_portkey.service.v1.PartnerBalanceData#ADAPTER", schemaIndex = 0, tag = 1)
    private final PartnerBalanceData balance_data;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationAuthedErrorCode#ADAPTER", schemaIndex = 2, tag = 3)
    private final MigrationAuthedErrorCode error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String error_deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String error_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String migration_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String migration_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    private final Boolean success;

    public ProcessMigrationAuthedResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27919newBuilder();
    }

    public final PartnerBalanceData getBalance_data() {
        return this.balance_data;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final MigrationAuthedErrorCode getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_details() {
        return this.error_details;
    }

    public final String getError_deeplink() {
        return this.error_deeplink;
    }

    public final String getMigration_status() {
        return this.migration_status;
    }

    public final String getMigration_id() {
        return this.migration_id;
    }

    public /* synthetic */ ProcessMigrationAuthedResponse(PartnerBalanceData partnerBalanceData, Boolean bool, MigrationAuthedErrorCode migrationAuthedErrorCode, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : partnerBalanceData, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : migrationAuthedErrorCode, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessMigrationAuthedResponse(PartnerBalanceData partnerBalanceData, Boolean bool, MigrationAuthedErrorCode migrationAuthedErrorCode, String str, String str2, String str3, String str4, String str5, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.balance_data = partnerBalanceData;
        this.success = bool;
        this.error_code = migrationAuthedErrorCode;
        this.error_message = str;
        this.error_details = str2;
        this.error_deeplink = str3;
        this.migration_status = str4;
        this.migration_id = str5;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27919newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ProcessMigrationAuthedResponse)) {
            return false;
        }
        ProcessMigrationAuthedResponse processMigrationAuthedResponse = (ProcessMigrationAuthedResponse) other;
        return Intrinsics.areEqual(unknownFields(), processMigrationAuthedResponse.unknownFields()) && Intrinsics.areEqual(this.balance_data, processMigrationAuthedResponse.balance_data) && Intrinsics.areEqual(this.success, processMigrationAuthedResponse.success) && this.error_code == processMigrationAuthedResponse.error_code && Intrinsics.areEqual(this.error_message, processMigrationAuthedResponse.error_message) && Intrinsics.areEqual(this.error_details, processMigrationAuthedResponse.error_details) && Intrinsics.areEqual(this.error_deeplink, processMigrationAuthedResponse.error_deeplink) && Intrinsics.areEqual(this.migration_status, processMigrationAuthedResponse.migration_status) && Intrinsics.areEqual(this.migration_id, processMigrationAuthedResponse.migration_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        PartnerBalanceData partnerBalanceData = this.balance_data;
        int iHashCode2 = (iHashCode + (partnerBalanceData != null ? partnerBalanceData.hashCode() : 0)) * 37;
        Boolean bool = this.success;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        MigrationAuthedErrorCode migrationAuthedErrorCode = this.error_code;
        int iHashCode4 = (iHashCode3 + (migrationAuthedErrorCode != null ? migrationAuthedErrorCode.hashCode() : 0)) * 37;
        String str = this.error_message;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.error_details;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.error_deeplink;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.migration_status;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.migration_id;
        int iHashCode9 = iHashCode8 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        PartnerBalanceData partnerBalanceData = this.balance_data;
        if (partnerBalanceData != null) {
            arrayList.add("balance_data=" + partnerBalanceData);
        }
        Boolean bool = this.success;
        if (bool != null) {
            arrayList.add("success=" + bool);
        }
        MigrationAuthedErrorCode migrationAuthedErrorCode = this.error_code;
        if (migrationAuthedErrorCode != null) {
            arrayList.add("error_code=" + migrationAuthedErrorCode);
        }
        String str = this.error_message;
        if (str != null) {
            arrayList.add("error_message=" + Internal.sanitize(str));
        }
        String str2 = this.error_details;
        if (str2 != null) {
            arrayList.add("error_details=" + Internal.sanitize(str2));
        }
        String str3 = this.error_deeplink;
        if (str3 != null) {
            arrayList.add("error_deeplink=" + Internal.sanitize(str3));
        }
        String str4 = this.migration_status;
        if (str4 != null) {
            arrayList.add("migration_status=" + Internal.sanitize(str4));
        }
        String str5 = this.migration_id;
        if (str5 != null) {
            arrayList.add("migration_id=" + Internal.sanitize(str5));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProcessMigrationAuthedResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ProcessMigrationAuthedResponse copy$default(ProcessMigrationAuthedResponse processMigrationAuthedResponse, PartnerBalanceData partnerBalanceData, Boolean bool, MigrationAuthedErrorCode migrationAuthedErrorCode, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            partnerBalanceData = processMigrationAuthedResponse.balance_data;
        }
        if ((i & 2) != 0) {
            bool = processMigrationAuthedResponse.success;
        }
        if ((i & 4) != 0) {
            migrationAuthedErrorCode = processMigrationAuthedResponse.error_code;
        }
        if ((i & 8) != 0) {
            str = processMigrationAuthedResponse.error_message;
        }
        if ((i & 16) != 0) {
            str2 = processMigrationAuthedResponse.error_details;
        }
        if ((i & 32) != 0) {
            str3 = processMigrationAuthedResponse.error_deeplink;
        }
        if ((i & 64) != 0) {
            str4 = processMigrationAuthedResponse.migration_status;
        }
        if ((i & 128) != 0) {
            str5 = processMigrationAuthedResponse.migration_id;
        }
        if ((i & 256) != 0) {
            byteString = processMigrationAuthedResponse.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        MigrationAuthedErrorCode migrationAuthedErrorCode2 = migrationAuthedErrorCode;
        return processMigrationAuthedResponse.copy(partnerBalanceData, bool, migrationAuthedErrorCode2, str, str9, str7, str8, str6, byteString2);
    }

    public final ProcessMigrationAuthedResponse copy(PartnerBalanceData balance_data, Boolean success, MigrationAuthedErrorCode error_code, String error_message, String error_details, String error_deeplink, String migration_status, String migration_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ProcessMigrationAuthedResponse(balance_data, success, error_code, error_message, error_details, error_deeplink, migration_status, migration_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProcessMigrationAuthedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ProcessMigrationAuthedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.ProcessMigrationAuthedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ProcessMigrationAuthedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + PartnerBalanceData.ADAPTER.encodedSizeWithTag(1, value.getBalance_data()) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.getSuccess()) + MigrationAuthedErrorCode.ADAPTER.encodedSizeWithTag(3, value.getError_code());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(4, value.getError_message()) + protoAdapter.encodedSizeWithTag(5, value.getError_details()) + protoAdapter.encodedSizeWithTag(6, value.getError_deeplink()) + protoAdapter.encodedSizeWithTag(7, value.getMigration_status()) + protoAdapter.encodedSizeWithTag(8, value.getMigration_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ProcessMigrationAuthedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                PartnerBalanceData.ADAPTER.encodeWithTag(writer, 1, (int) value.getBalance_data());
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getSuccess());
                MigrationAuthedErrorCode.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_code());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getError_message());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getError_details());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getError_deeplink());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getMigration_status());
                protoAdapter.encodeWithTag(writer, 8, (int) value.getMigration_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ProcessMigrationAuthedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getMigration_id());
                protoAdapter.encodeWithTag(writer, 7, (int) value.getMigration_status());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getError_deeplink());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getError_details());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getError_message());
                MigrationAuthedErrorCode.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_code());
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) value.getSuccess());
                PartnerBalanceData.ADAPTER.encodeWithTag(writer, 1, (int) value.getBalance_data());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ProcessMigrationAuthedResponse redact(ProcessMigrationAuthedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PartnerBalanceData balance_data = value.getBalance_data();
                return ProcessMigrationAuthedResponse.copy$default(value, balance_data != null ? PartnerBalanceData.ADAPTER.redact(balance_data) : null, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ProcessMigrationAuthedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PartnerBalanceData partnerBalanceDataDecode = null;
                Boolean boolDecode = null;
                MigrationAuthedErrorCode migrationAuthedErrorCodeDecode = null;
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = null;
                String strDecode5 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                partnerBalanceDataDecode = PartnerBalanceData.ADAPTER.decode(reader);
                                break;
                            case 2:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 3:
                                try {
                                    migrationAuthedErrorCodeDecode = MigrationAuthedErrorCode.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ProcessMigrationAuthedResponse(partnerBalanceDataDecode, boolDecode, migrationAuthedErrorCodeDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
