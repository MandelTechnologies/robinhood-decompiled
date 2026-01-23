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

/* compiled from: BeneficiaryFlowBeneficiaryRoleCard.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "role", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "logging_identifier", "is_enabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;Ljava/lang/String;ZLokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getRole", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "getLogging_identifier", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowBeneficiaryRoleCard extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowBeneficiaryRoleCard> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String logging_identifier;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryRole#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BeneficiaryRole role;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowBeneficiaryRoleCard() {
        this(null, null, null, null, false, null, 63, null);
    }

    public /* synthetic */ BeneficiaryFlowBeneficiaryRoleCard(String str, String str2, BeneficiaryRole beneficiaryRole, String str3, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BeneficiaryRole.BENEFICIARY_ROLE_UNSPECIFIED : beneficiaryRole, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8801newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final BeneficiaryRole getRole() {
        return this.role;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* renamed from: is_enabled, reason: from getter */
    public final boolean getIs_enabled() {
        return this.is_enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowBeneficiaryRoleCard(String title, String description, BeneficiaryRole role, String logging_identifier, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.role = role;
        this.logging_identifier = logging_identifier;
        this.is_enabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8801newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowBeneficiaryRoleCard)) {
            return false;
        }
        BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard = (BeneficiaryFlowBeneficiaryRoleCard) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowBeneficiaryRoleCard.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowBeneficiaryRoleCard.title) && Intrinsics.areEqual(this.description, beneficiaryFlowBeneficiaryRoleCard.description) && this.role == beneficiaryFlowBeneficiaryRoleCard.role && Intrinsics.areEqual(this.logging_identifier, beneficiaryFlowBeneficiaryRoleCard.logging_identifier) && this.is_enabled == beneficiaryFlowBeneficiaryRoleCard.is_enabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.role.hashCode()) * 37) + this.logging_identifier.hashCode()) * 37) + Boolean.hashCode(this.is_enabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("role=" + this.role);
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        arrayList.add("is_enabled=" + this.is_enabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowBeneficiaryRoleCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowBeneficiaryRoleCard copy$default(BeneficiaryFlowBeneficiaryRoleCard beneficiaryFlowBeneficiaryRoleCard, String str, String str2, BeneficiaryRole beneficiaryRole, String str3, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowBeneficiaryRoleCard.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowBeneficiaryRoleCard.description;
        }
        if ((i & 4) != 0) {
            beneficiaryRole = beneficiaryFlowBeneficiaryRoleCard.role;
        }
        if ((i & 8) != 0) {
            str3 = beneficiaryFlowBeneficiaryRoleCard.logging_identifier;
        }
        if ((i & 16) != 0) {
            z = beneficiaryFlowBeneficiaryRoleCard.is_enabled;
        }
        if ((i & 32) != 0) {
            byteString = beneficiaryFlowBeneficiaryRoleCard.unknownFields();
        }
        boolean z2 = z;
        ByteString byteString2 = byteString;
        return beneficiaryFlowBeneficiaryRoleCard.copy(str, str2, beneficiaryRole, str3, z2, byteString2);
    }

    public final BeneficiaryFlowBeneficiaryRoleCard copy(String title, String description, BeneficiaryRole role, String logging_identifier, boolean is_enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowBeneficiaryRoleCard(title, description, role, logging_identifier, is_enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowBeneficiaryRoleCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowBeneficiaryRoleCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowBeneficiaryRoleCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getRole() != BeneficiaryRole.BENEFICIARY_ROLE_UNSPECIFIED) {
                    size += BeneficiaryRole.ADAPTER.encodedSizeWithTag(3, value.getRole());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getLogging_identifier());
                }
                return value.getIs_enabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_enabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowBeneficiaryRoleCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getRole() != BeneficiaryRole.BENEFICIARY_ROLE_UNSPECIFIED) {
                    BeneficiaryRole.ADAPTER.encodeWithTag(writer, 3, (int) value.getRole());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowBeneficiaryRoleCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getLogging_identifier());
                }
                if (value.getRole() != BeneficiaryRole.BENEFICIARY_ROLE_UNSPECIFIED) {
                    BeneficiaryRole.ADAPTER.encodeWithTag(writer, 3, (int) value.getRole());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowBeneficiaryRoleCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryRole beneficiaryRole = BeneficiaryRole.BENEFICIARY_ROLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                boolean zBooleanValue = false;
                BeneficiaryRole beneficiaryRoleDecode = beneficiaryRole;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowBeneficiaryRoleCard(strDecode3, strDecode, beneficiaryRoleDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            beneficiaryRoleDecode = BeneficiaryRole.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowBeneficiaryRoleCard redact(BeneficiaryFlowBeneficiaryRoleCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowBeneficiaryRoleCard.copy$default(value, null, null, null, null, false, ByteString.EMPTY, 31, null);
            }
        };
    }
}
