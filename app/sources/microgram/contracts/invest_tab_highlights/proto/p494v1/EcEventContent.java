package microgram.contracts.invest_tab_highlights.proto.p494v1;

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

/* compiled from: EcEventContent.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J<\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;", "Lcom/squareup/wire/Message;", "", "left_contract", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;", "right_contract", "status", "", "is_live", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;Ljava/lang/String;ZLokio/ByteString;)V", "getLeft_contract", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;", "getRight_contract", "getStatus", "()Ljava/lang/String;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class EcEventContent extends Message {

    @JvmField
    public static final ProtoAdapter<EcEventContent> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isLive", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_live;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.ContractContent#ADAPTER", jsonName = "leftContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ContractContent left_contract;

    @WireField(adapter = "microgram.contracts.invest_tab_highlights.proto.v1.ContractContent#ADAPTER", jsonName = "rightContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ContractContent right_contract;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String status;

    public EcEventContent() {
        this(null, null, null, false, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29122newBuilder();
    }

    public final ContractContent getLeft_contract() {
        return this.left_contract;
    }

    public final ContractContent getRight_contract() {
        return this.right_contract;
    }

    public final String getStatus() {
        return this.status;
    }

    public /* synthetic */ EcEventContent(ContractContent contractContent, ContractContent contractContent2, String str, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contractContent, (i & 2) != 0 ? null : contractContent2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* renamed from: is_live, reason: from getter */
    public final boolean getIs_live() {
        return this.is_live;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcEventContent(ContractContent contractContent, ContractContent contractContent2, String status, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.left_contract = contractContent;
        this.right_contract = contractContent2;
        this.status = status;
        this.is_live = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29122newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EcEventContent)) {
            return false;
        }
        EcEventContent ecEventContent = (EcEventContent) other;
        return Intrinsics.areEqual(unknownFields(), ecEventContent.unknownFields()) && Intrinsics.areEqual(this.left_contract, ecEventContent.left_contract) && Intrinsics.areEqual(this.right_contract, ecEventContent.right_contract) && Intrinsics.areEqual(this.status, ecEventContent.status) && this.is_live == ecEventContent.is_live;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ContractContent contractContent = this.left_contract;
        int iHashCode2 = (iHashCode + (contractContent != null ? contractContent.hashCode() : 0)) * 37;
        ContractContent contractContent2 = this.right_contract;
        int iHashCode3 = ((((iHashCode2 + (contractContent2 != null ? contractContent2.hashCode() : 0)) * 37) + this.status.hashCode()) * 37) + Boolean.hashCode(this.is_live);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ContractContent contractContent = this.left_contract;
        if (contractContent != null) {
            arrayList.add("left_contract=" + contractContent);
        }
        ContractContent contractContent2 = this.right_contract;
        if (contractContent2 != null) {
            arrayList.add("right_contract=" + contractContent2);
        }
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("is_live=" + this.is_live);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EcEventContent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EcEventContent copy$default(EcEventContent ecEventContent, ContractContent contractContent, ContractContent contractContent2, String str, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            contractContent = ecEventContent.left_contract;
        }
        if ((i & 2) != 0) {
            contractContent2 = ecEventContent.right_contract;
        }
        if ((i & 4) != 0) {
            str = ecEventContent.status;
        }
        if ((i & 8) != 0) {
            z = ecEventContent.is_live;
        }
        if ((i & 16) != 0) {
            byteString = ecEventContent.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str2 = str;
        return ecEventContent.copy(contractContent, contractContent2, str2, z, byteString2);
    }

    public final EcEventContent copy(ContractContent left_contract, ContractContent right_contract, String status, boolean is_live, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EcEventContent(left_contract, right_contract, status, is_live, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EcEventContent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EcEventContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.invest_tab_highlights.proto.v1.EcEventContent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EcEventContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLeft_contract() != null) {
                    size += ContractContent.ADAPTER.encodedSizeWithTag(1, value.getLeft_contract());
                }
                if (value.getRight_contract() != null) {
                    size += ContractContent.ADAPTER.encodedSizeWithTag(2, value.getRight_contract());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getStatus());
                }
                return value.getIs_live() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_live())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EcEventContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLeft_contract() != null) {
                    ContractContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getLeft_contract());
                }
                if (value.getRight_contract() != null) {
                    ContractContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getRight_contract());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                if (value.getIs_live()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_live()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EcEventContent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_live()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_live()));
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getStatus());
                }
                if (value.getRight_contract() != null) {
                    ContractContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getRight_contract());
                }
                if (value.getLeft_contract() != null) {
                    ContractContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getLeft_contract());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EcEventContent redact(EcEventContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ContractContent left_contract = value.getLeft_contract();
                ContractContent contractContentRedact = left_contract != null ? ContractContent.ADAPTER.redact(left_contract) : null;
                ContractContent right_contract = value.getRight_contract();
                return EcEventContent.copy$default(value, contractContentRedact, right_contract != null ? ContractContent.ADAPTER.redact(right_contract) : null, null, false, ByteString.EMPTY, 12, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EcEventContent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ContractContent contractContentDecode = null;
                boolean zBooleanValue = false;
                String strDecode = "";
                ContractContent contractContentDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EcEventContent(contractContentDecode, contractContentDecode2, strDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        contractContentDecode = ContractContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        contractContentDecode2 = ContractContent.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
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
