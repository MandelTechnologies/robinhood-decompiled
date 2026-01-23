package crypto_portkey.service.p443v1;

import com.plaid.internal.EnumC7081g;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: MigrationFinalizeAckData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016JR\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckData;", "Lcom/squareup/wire/Message;", "", "partner_migration_code", "", "rh_migration_code", "status", "transactions", "", "Lcrypto_portkey/service/v1/MigrationFinalizeTransaction;", "failure_code", "failure_reason", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPartner_migration_code", "()Ljava/lang/String;", "getRh_migration_code", "getStatus", "getFailure_code", "getFailure_reason", "getTransactions", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MigrationFinalizeAckData extends Message {

    @JvmField
    public static final ProtoAdapter<MigrationFinalizeAckData> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String failure_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String failure_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String partner_migration_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String rh_migration_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String status;

    @WireField(adapter = "crypto_portkey.service.v1.MigrationFinalizeTransaction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<MigrationFinalizeTransaction> transactions;

    public MigrationFinalizeAckData() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ MigrationFinalizeAckData(String str, String str2, String str3, List list, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27903newBuilder();
    }

    public final String getPartner_migration_code() {
        return this.partner_migration_code;
    }

    public final String getRh_migration_code() {
        return this.rh_migration_code;
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
    public MigrationFinalizeAckData(String partner_migration_code, String rh_migration_code, String status, List<MigrationFinalizeTransaction> transactions, String failure_code, String failure_reason, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(failure_code, "failure_code");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.partner_migration_code = partner_migration_code;
        this.rh_migration_code = rh_migration_code;
        this.status = status;
        this.failure_code = failure_code;
        this.failure_reason = failure_reason;
        this.transactions = Internal.immutableCopyOf("transactions", transactions);
    }

    public final List<MigrationFinalizeTransaction> getTransactions() {
        return this.transactions;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27903newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MigrationFinalizeAckData)) {
            return false;
        }
        MigrationFinalizeAckData migrationFinalizeAckData = (MigrationFinalizeAckData) other;
        return Intrinsics.areEqual(unknownFields(), migrationFinalizeAckData.unknownFields()) && Intrinsics.areEqual(this.partner_migration_code, migrationFinalizeAckData.partner_migration_code) && Intrinsics.areEqual(this.rh_migration_code, migrationFinalizeAckData.rh_migration_code) && Intrinsics.areEqual(this.status, migrationFinalizeAckData.status) && Intrinsics.areEqual(this.transactions, migrationFinalizeAckData.transactions) && Intrinsics.areEqual(this.failure_code, migrationFinalizeAckData.failure_code) && Intrinsics.areEqual(this.failure_reason, migrationFinalizeAckData.failure_reason);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.partner_migration_code.hashCode()) * 37) + this.rh_migration_code.hashCode()) * 37) + this.status.hashCode()) * 37) + this.transactions.hashCode()) * 37) + this.failure_code.hashCode()) * 37) + this.failure_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("partner_migration_code=" + Internal.sanitize(this.partner_migration_code));
        arrayList.add("rh_migration_code=" + Internal.sanitize(this.rh_migration_code));
        arrayList.add("status=" + Internal.sanitize(this.status));
        if (!this.transactions.isEmpty()) {
            arrayList.add("transactions=" + this.transactions);
        }
        arrayList.add("failure_code=" + Internal.sanitize(this.failure_code));
        arrayList.add("failure_reason=" + Internal.sanitize(this.failure_reason));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MigrationFinalizeAckData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MigrationFinalizeAckData copy$default(MigrationFinalizeAckData migrationFinalizeAckData, String str, String str2, String str3, List list, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = migrationFinalizeAckData.partner_migration_code;
        }
        if ((i & 2) != 0) {
            str2 = migrationFinalizeAckData.rh_migration_code;
        }
        if ((i & 4) != 0) {
            str3 = migrationFinalizeAckData.status;
        }
        if ((i & 8) != 0) {
            list = migrationFinalizeAckData.transactions;
        }
        if ((i & 16) != 0) {
            str4 = migrationFinalizeAckData.failure_code;
        }
        if ((i & 32) != 0) {
            str5 = migrationFinalizeAckData.failure_reason;
        }
        if ((i & 64) != 0) {
            byteString = migrationFinalizeAckData.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str3;
        return migrationFinalizeAckData.copy(str, str2, str8, list, str7, str6, byteString2);
    }

    public final MigrationFinalizeAckData copy(String partner_migration_code, String rh_migration_code, String status, List<MigrationFinalizeTransaction> transactions, String failure_code, String failure_reason, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(failure_code, "failure_code");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MigrationFinalizeAckData(partner_migration_code, rh_migration_code, status, transactions, failure_code, failure_reason, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MigrationFinalizeAckData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MigrationFinalizeAckData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_portkey.service.v1.MigrationFinalizeAckData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MigrationFinalizeAckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRh_migration_code());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getStatus());
                }
                int iEncodedSizeWithTag = size + MigrationFinalizeTransaction.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getTransactions());
                if (!Intrinsics.areEqual(value.getFailure_code(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getFailure_code());
                }
                return !Intrinsics.areEqual(value.getFailure_reason(), "") ? iEncodedSizeWithTag + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFailure_reason()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MigrationFinalizeAckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRh_migration_code());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                MigrationFinalizeTransaction.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getTransactions());
                if (!Intrinsics.areEqual(value.getFailure_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFailure_code());
                }
                if (!Intrinsics.areEqual(value.getFailure_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFailure_reason());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MigrationFinalizeAckData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFailure_reason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFailure_reason());
                }
                if (!Intrinsics.areEqual(value.getFailure_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getFailure_code());
                }
                MigrationFinalizeTransaction.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getTransactions());
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getRh_migration_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getRh_migration_code());
                }
                if (Intrinsics.areEqual(value.getPartner_migration_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPartner_migration_code());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MigrationFinalizeAckData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                arrayList.add(MigrationFinalizeTransaction.ADAPTER.decode(reader));
                                break;
                            case 5:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new MigrationFinalizeAckData(strDecode, strDecode2, strDecode3, arrayList, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MigrationFinalizeAckData redact(MigrationFinalizeAckData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MigrationFinalizeAckData.copy$default(value, null, null, null, Internal.m26823redactElements(value.getTransactions(), MigrationFinalizeTransaction.ADAPTER), null, null, ByteString.EMPTY, 55, null);
            }
        };
    }
}
