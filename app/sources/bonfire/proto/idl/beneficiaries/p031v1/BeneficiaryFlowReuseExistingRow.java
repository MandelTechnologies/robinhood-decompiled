package bonfire.proto.idl.beneficiaries.p031v1;

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

/* compiled from: BeneficiaryFlowReuseExistingRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowReuseExistingRow;", "Lcom/squareup/wire/Message;", "", "full_name", "", "beneficiary_id", "logging_identifier", "is_enabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getFull_name", "()Ljava/lang/String;", "getBeneficiary_id", "getLogging_identifier", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowReuseExistingRow extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowReuseExistingRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "beneficiaryId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String beneficiary_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fullName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String full_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String logging_identifier;

    public BeneficiaryFlowReuseExistingRow() {
        this(null, null, null, false, null, 31, null);
    }

    public /* synthetic */ BeneficiaryFlowReuseExistingRow(String str, String str2, String str3, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8812newBuilder();
    }

    public final String getFull_name() {
        return this.full_name;
    }

    public final String getBeneficiary_id() {
        return this.beneficiary_id;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* renamed from: is_enabled, reason: from getter */
    public final boolean getIs_enabled() {
        return this.is_enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowReuseExistingRow(String full_name, String beneficiary_id, String logging_identifier, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(beneficiary_id, "beneficiary_id");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.full_name = full_name;
        this.beneficiary_id = beneficiary_id;
        this.logging_identifier = logging_identifier;
        this.is_enabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8812newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowReuseExistingRow)) {
            return false;
        }
        BeneficiaryFlowReuseExistingRow beneficiaryFlowReuseExistingRow = (BeneficiaryFlowReuseExistingRow) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowReuseExistingRow.unknownFields()) && Intrinsics.areEqual(this.full_name, beneficiaryFlowReuseExistingRow.full_name) && Intrinsics.areEqual(this.beneficiary_id, beneficiaryFlowReuseExistingRow.beneficiary_id) && Intrinsics.areEqual(this.logging_identifier, beneficiaryFlowReuseExistingRow.logging_identifier) && this.is_enabled == beneficiaryFlowReuseExistingRow.is_enabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.full_name.hashCode()) * 37) + this.beneficiary_id.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37) + Boolean.hashCode(this.is_enabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("full_name=" + Internal.sanitize(this.full_name));
        arrayList.add("beneficiary_id=" + Internal.sanitize(this.beneficiary_id));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        arrayList.add("is_enabled=" + this.is_enabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowReuseExistingRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowReuseExistingRow copy$default(BeneficiaryFlowReuseExistingRow beneficiaryFlowReuseExistingRow, String str, String str2, String str3, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowReuseExistingRow.full_name;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowReuseExistingRow.beneficiary_id;
        }
        if ((i & 4) != 0) {
            str3 = beneficiaryFlowReuseExistingRow.logging_identifier;
        }
        if ((i & 8) != 0) {
            z = beneficiaryFlowReuseExistingRow.is_enabled;
        }
        if ((i & 16) != 0) {
            byteString = beneficiaryFlowReuseExistingRow.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return beneficiaryFlowReuseExistingRow.copy(str, str2, str4, z, byteString2);
    }

    public final BeneficiaryFlowReuseExistingRow copy(String full_name, String beneficiary_id, String logging_identifier, boolean is_enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(beneficiary_id, "beneficiary_id");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowReuseExistingRow(full_name, beneficiary_id, logging_identifier, is_enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowReuseExistingRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowReuseExistingRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowReuseExistingRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowReuseExistingRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFull_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFull_name());
                }
                if (!Intrinsics.areEqual(value.getBeneficiary_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBeneficiary_id());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_identifier());
                }
                return value.getIs_enabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_enabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowReuseExistingRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFull_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFull_name());
                }
                if (!Intrinsics.areEqual(value.getBeneficiary_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowReuseExistingRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getBeneficiary_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getBeneficiary_id());
                }
                if (Intrinsics.areEqual(value.getFull_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFull_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowReuseExistingRow redact(BeneficiaryFlowReuseExistingRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowReuseExistingRow.copy$default(value, null, null, null, false, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowReuseExistingRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                boolean zBooleanValue = false;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowReuseExistingRow(strDecode, strDecode3, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
