package advisory.proto.p008v1;

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

/* compiled from: ManagementStyleSelectionCta.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionCta;", "Lcom/squareup/wire/Message;", "", "text", "", "cta_type", "Ladvisory/proto/v1/ManagementStyleSelectionCtaType;", "is_primary", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/ManagementStyleSelectionCtaType;ZLokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getCta_type", "()Ladvisory/proto/v1/ManagementStyleSelectionCtaType;", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ManagementStyleSelectionCta extends Message {

    @JvmField
    public static final ProtoAdapter<ManagementStyleSelectionCta> ADAPTER;

    @WireField(adapter = "advisory.proto.v1.ManagementStyleSelectionCtaType#ADAPTER", jsonName = "ctaType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ManagementStyleSelectionCtaType cta_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPrimary", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean is_primary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public ManagementStyleSelectionCta() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4508newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ ManagementStyleSelectionCta(String str, ManagementStyleSelectionCtaType managementStyleSelectionCtaType, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ManagementStyleSelectionCtaType.CTA_LAUNCH_UNSPECIFIED : managementStyleSelectionCtaType, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ManagementStyleSelectionCtaType getCta_type() {
        return this.cta_type;
    }

    /* renamed from: is_primary, reason: from getter */
    public final boolean getIs_primary() {
        return this.is_primary;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementStyleSelectionCta(String text, ManagementStyleSelectionCtaType cta_type, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(cta_type, "cta_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.cta_type = cta_type;
        this.is_primary = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4508newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ManagementStyleSelectionCta)) {
            return false;
        }
        ManagementStyleSelectionCta managementStyleSelectionCta = (ManagementStyleSelectionCta) other;
        return Intrinsics.areEqual(unknownFields(), managementStyleSelectionCta.unknownFields()) && Intrinsics.areEqual(this.text, managementStyleSelectionCta.text) && this.cta_type == managementStyleSelectionCta.cta_type && this.is_primary == managementStyleSelectionCta.is_primary;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37) + this.cta_type.hashCode()) * 37) + Boolean.hashCode(this.is_primary);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        arrayList.add("cta_type=" + this.cta_type);
        arrayList.add("is_primary=" + this.is_primary);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagementStyleSelectionCta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ManagementStyleSelectionCta copy$default(ManagementStyleSelectionCta managementStyleSelectionCta, String str, ManagementStyleSelectionCtaType managementStyleSelectionCtaType, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = managementStyleSelectionCta.text;
        }
        if ((i & 2) != 0) {
            managementStyleSelectionCtaType = managementStyleSelectionCta.cta_type;
        }
        if ((i & 4) != 0) {
            z = managementStyleSelectionCta.is_primary;
        }
        if ((i & 8) != 0) {
            byteString = managementStyleSelectionCta.unknownFields();
        }
        return managementStyleSelectionCta.copy(str, managementStyleSelectionCtaType, z, byteString);
    }

    public final ManagementStyleSelectionCta copy(String text, ManagementStyleSelectionCtaType cta_type, boolean is_primary, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(cta_type, "cta_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ManagementStyleSelectionCta(text, cta_type, is_primary, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagementStyleSelectionCta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ManagementStyleSelectionCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ManagementStyleSelectionCta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagementStyleSelectionCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                if (value.getCta_type() != ManagementStyleSelectionCtaType.CTA_LAUNCH_UNSPECIFIED) {
                    size += ManagementStyleSelectionCtaType.ADAPTER.encodedSizeWithTag(2, value.getCta_type());
                }
                return value.getIs_primary() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_primary())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagementStyleSelectionCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getCta_type() != ManagementStyleSelectionCtaType.CTA_LAUNCH_UNSPECIFIED) {
                    ManagementStyleSelectionCtaType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCta_type());
                }
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_primary()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagementStyleSelectionCta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_primary()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_primary()));
                }
                if (value.getCta_type() != ManagementStyleSelectionCtaType.CTA_LAUNCH_UNSPECIFIED) {
                    ManagementStyleSelectionCtaType.ADAPTER.encodeWithTag(writer, 2, (int) value.getCta_type());
                }
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleSelectionCta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ManagementStyleSelectionCtaType managementStyleSelectionCtaTypeDecode = ManagementStyleSelectionCtaType.CTA_LAUNCH_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ManagementStyleSelectionCta(strDecode, managementStyleSelectionCtaTypeDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            managementStyleSelectionCtaTypeDecode = ManagementStyleSelectionCtaType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagementStyleSelectionCta redact(ManagementStyleSelectionCta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ManagementStyleSelectionCta.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }
        };
    }
}
