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

/* compiled from: BeneficiaryFlowBeneficiaryTypeCard.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryTypeCard;", "Lcom/squareup/wire/Message;", "", "title", "", "description", "type", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "is_enabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;ZLokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getType", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowBeneficiaryTypeCard extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowBeneficiaryTypeCard> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final BeneficiaryType type;

    public BeneficiaryFlowBeneficiaryTypeCard() {
        this(null, null, null, false, null, 31, null);
    }

    public /* synthetic */ BeneficiaryFlowBeneficiaryTypeCard(String str, String str2, BeneficiaryType beneficiaryType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? BeneficiaryType.BENEFICIARY_TYPE_UNSPECIFIED : beneficiaryType, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8803newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final BeneficiaryType getType() {
        return this.type;
    }

    /* renamed from: is_enabled, reason: from getter */
    public final boolean getIs_enabled() {
        return this.is_enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowBeneficiaryTypeCard(String title, String description, BeneficiaryType type2, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.type = type2;
        this.is_enabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8803newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowBeneficiaryTypeCard)) {
            return false;
        }
        BeneficiaryFlowBeneficiaryTypeCard beneficiaryFlowBeneficiaryTypeCard = (BeneficiaryFlowBeneficiaryTypeCard) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowBeneficiaryTypeCard.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowBeneficiaryTypeCard.title) && Intrinsics.areEqual(this.description, beneficiaryFlowBeneficiaryTypeCard.description) && this.type == beneficiaryFlowBeneficiaryTypeCard.type && this.is_enabled == beneficiaryFlowBeneficiaryTypeCard.is_enabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.type.hashCode()) * 37) + Boolean.hashCode(this.is_enabled);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("type=" + this.type);
        arrayList.add("is_enabled=" + this.is_enabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowBeneficiaryTypeCard{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BeneficiaryFlowBeneficiaryTypeCard copy$default(BeneficiaryFlowBeneficiaryTypeCard beneficiaryFlowBeneficiaryTypeCard, String str, String str2, BeneficiaryType beneficiaryType, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowBeneficiaryTypeCard.title;
        }
        if ((i & 2) != 0) {
            str2 = beneficiaryFlowBeneficiaryTypeCard.description;
        }
        if ((i & 4) != 0) {
            beneficiaryType = beneficiaryFlowBeneficiaryTypeCard.type;
        }
        if ((i & 8) != 0) {
            z = beneficiaryFlowBeneficiaryTypeCard.is_enabled;
        }
        if ((i & 16) != 0) {
            byteString = beneficiaryFlowBeneficiaryTypeCard.unknownFields();
        }
        ByteString byteString2 = byteString;
        BeneficiaryType beneficiaryType2 = beneficiaryType;
        return beneficiaryFlowBeneficiaryTypeCard.copy(str, str2, beneficiaryType2, z, byteString2);
    }

    public final BeneficiaryFlowBeneficiaryTypeCard copy(String title, String description, BeneficiaryType type2, boolean is_enabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowBeneficiaryTypeCard(title, description, type2, is_enabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowBeneficiaryTypeCard.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowBeneficiaryTypeCard>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryTypeCard$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowBeneficiaryTypeCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getType() != BeneficiaryType.BENEFICIARY_TYPE_UNSPECIFIED) {
                    size += BeneficiaryType.ADAPTER.encodedSizeWithTag(3, value.getType());
                }
                return value.getIs_enabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_enabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowBeneficiaryTypeCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getType() != BeneficiaryType.BENEFICIARY_TYPE_UNSPECIFIED) {
                    BeneficiaryType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
                }
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowBeneficiaryTypeCard value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_enabled()));
                }
                if (value.getType() != BeneficiaryType.BENEFICIARY_TYPE_UNSPECIFIED) {
                    BeneficiaryType.ADAPTER.encodeWithTag(writer, 3, (int) value.getType());
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
            public BeneficiaryFlowBeneficiaryTypeCard decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BeneficiaryType beneficiaryType = BeneficiaryType.BENEFICIARY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                BeneficiaryType beneficiaryTypeDecode = beneficiaryType;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowBeneficiaryTypeCard(strDecode2, strDecode, beneficiaryTypeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            beneficiaryTypeDecode = BeneficiaryType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowBeneficiaryTypeCard redact(BeneficiaryFlowBeneficiaryTypeCard value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowBeneficiaryTypeCard.copy$default(value, null, null, null, false, ByteString.EMPTY, 15, null);
            }
        };
    }
}
