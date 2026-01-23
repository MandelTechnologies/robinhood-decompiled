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

/* compiled from: IndividualBeneficiaryInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryInfo;", "Lcom/squareup/wire/Message;", "", "first_name", "", "last_name", GovernmentIdNfcScan.dateOfBirthName, "relationship", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationship;", "email", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationship;Ljava/lang/String;Lokio/ByteString;)V", "getFirst_name", "()Ljava/lang/String;", "getLast_name", "getDate_of_birth", "getRelationship", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationship;", "getEmail", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndividualBeneficiaryInfo extends Message {

    @JvmField
    public static final ProtoAdapter<IndividualBeneficiaryInfo> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateOfBirth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String date_of_birth;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firstName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String first_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String last_name;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryRelationship#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final BeneficiaryRelationship relationship;

    public IndividualBeneficiaryInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ IndividualBeneficiaryInfo(String str, String str2, String str3, BeneficiaryRelationship beneficiaryRelationship, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED : beneficiaryRelationship, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8835newBuilder();
    }

    public final String getFirst_name() {
        return this.first_name;
    }

    public final String getLast_name() {
        return this.last_name;
    }

    public final String getDate_of_birth() {
        return this.date_of_birth;
    }

    public final BeneficiaryRelationship getRelationship() {
        return this.relationship;
    }

    public final String getEmail() {
        return this.email;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndividualBeneficiaryInfo(String first_name, String last_name, String date_of_birth, BeneficiaryRelationship relationship, String email, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(first_name, "first_name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.relationship = relationship;
        this.email = email;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8835newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IndividualBeneficiaryInfo)) {
            return false;
        }
        IndividualBeneficiaryInfo individualBeneficiaryInfo = (IndividualBeneficiaryInfo) other;
        return Intrinsics.areEqual(unknownFields(), individualBeneficiaryInfo.unknownFields()) && Intrinsics.areEqual(this.first_name, individualBeneficiaryInfo.first_name) && Intrinsics.areEqual(this.last_name, individualBeneficiaryInfo.last_name) && Intrinsics.areEqual(this.date_of_birth, individualBeneficiaryInfo.date_of_birth) && this.relationship == individualBeneficiaryInfo.relationship && Intrinsics.areEqual(this.email, individualBeneficiaryInfo.email);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.first_name.hashCode()) * 37) + this.last_name.hashCode()) * 37) + this.date_of_birth.hashCode()) * 37) + this.relationship.hashCode()) * 37) + this.email.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("first_name=" + Internal.sanitize(this.first_name));
        arrayList.add("last_name=" + Internal.sanitize(this.last_name));
        arrayList.add("date_of_birth=" + Internal.sanitize(this.date_of_birth));
        arrayList.add("relationship=" + this.relationship);
        arrayList.add("email=" + Internal.sanitize(this.email));
        return CollectionsKt.joinToString$default(arrayList, ", ", "IndividualBeneficiaryInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IndividualBeneficiaryInfo copy$default(IndividualBeneficiaryInfo individualBeneficiaryInfo, String str, String str2, String str3, BeneficiaryRelationship beneficiaryRelationship, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = individualBeneficiaryInfo.first_name;
        }
        if ((i & 2) != 0) {
            str2 = individualBeneficiaryInfo.last_name;
        }
        if ((i & 4) != 0) {
            str3 = individualBeneficiaryInfo.date_of_birth;
        }
        if ((i & 8) != 0) {
            beneficiaryRelationship = individualBeneficiaryInfo.relationship;
        }
        if ((i & 16) != 0) {
            str4 = individualBeneficiaryInfo.email;
        }
        if ((i & 32) != 0) {
            byteString = individualBeneficiaryInfo.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return individualBeneficiaryInfo.copy(str, str2, str3, beneficiaryRelationship, str5, byteString2);
    }

    public final IndividualBeneficiaryInfo copy(String first_name, String last_name, String date_of_birth, BeneficiaryRelationship relationship, String email, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(first_name, "first_name");
        Intrinsics.checkNotNullParameter(last_name, "last_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IndividualBeneficiaryInfo(first_name, last_name, date_of_birth, relationship, email, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndividualBeneficiaryInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IndividualBeneficiaryInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.IndividualBeneficiaryInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IndividualBeneficiaryInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFirst_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFirst_name());
                }
                if (!Intrinsics.areEqual(value.getLast_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLast_name());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDate_of_birth());
                }
                if (value.getRelationship() != BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED) {
                    size += BeneficiaryRelationship.ADAPTER.encodedSizeWithTag(4, value.getRelationship());
                }
                return !Intrinsics.areEqual(value.getEmail(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getEmail()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IndividualBeneficiaryInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFirst_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFirst_name());
                }
                if (!Intrinsics.areEqual(value.getLast_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLast_name());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDate_of_birth());
                }
                if (value.getRelationship() != BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED) {
                    BeneficiaryRelationship.ADAPTER.encodeWithTag(writer, 4, (int) value.getRelationship());
                }
                if (!Intrinsics.areEqual(value.getEmail(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEmail());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IndividualBeneficiaryInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getEmail(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getEmail());
                }
                if (value.getRelationship() != BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED) {
                    BeneficiaryRelationship.ADAPTER.encodeWithTag(writer, 4, (int) value.getRelationship());
                }
                if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDate_of_birth());
                }
                if (!Intrinsics.areEqual(value.getLast_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLast_name());
                }
                if (Intrinsics.areEqual(value.getFirst_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFirst_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IndividualBeneficiaryInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryRelationship beneficiaryRelationshipDecode = BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    BeneficiaryRelationship beneficiaryRelationship = beneficiaryRelationshipDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new IndividualBeneficiaryInfo(strDecode, strDecode2, strDecode3, beneficiaryRelationship, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                beneficiaryRelationshipDecode = BeneficiaryRelationship.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 5) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IndividualBeneficiaryInfo redact(IndividualBeneficiaryInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IndividualBeneficiaryInfo.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
