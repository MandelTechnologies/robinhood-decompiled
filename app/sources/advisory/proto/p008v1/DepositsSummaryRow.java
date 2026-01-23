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

/* compiled from: DepositsSummaryRow.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Ladvisory/proto/v1/DepositsSummaryRow;", "Lcom/squareup/wire/Message;", "", "primary_label", "", "primary_value", "secondary_label", "secondary_value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPrimary_label", "()Ljava/lang/String;", "getPrimary_value", "getSecondary_label", "getSecondary_value", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class DepositsSummaryRow extends Message {

    @JvmField
    public static final ProtoAdapter<DepositsSummaryRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String primary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String primary_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryLabel", schemaIndex = 2, tag = 3)
    private final String secondary_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryValue", schemaIndex = 3, tag = 4)
    private final String secondary_value;

    public DepositsSummaryRow() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ DepositsSummaryRow(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4419newBuilder();
    }

    public final String getPrimary_label() {
        return this.primary_label;
    }

    public final String getPrimary_value() {
        return this.primary_value;
    }

    public final String getSecondary_label() {
        return this.secondary_label;
    }

    public final String getSecondary_value() {
        return this.secondary_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositsSummaryRow(String primary_label, String primary_value, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(primary_label, "primary_label");
        Intrinsics.checkNotNullParameter(primary_value, "primary_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.primary_label = primary_label;
        this.primary_value = primary_value;
        this.secondary_label = str;
        this.secondary_value = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4419newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DepositsSummaryRow)) {
            return false;
        }
        DepositsSummaryRow depositsSummaryRow = (DepositsSummaryRow) other;
        return Intrinsics.areEqual(unknownFields(), depositsSummaryRow.unknownFields()) && Intrinsics.areEqual(this.primary_label, depositsSummaryRow.primary_label) && Intrinsics.areEqual(this.primary_value, depositsSummaryRow.primary_value) && Intrinsics.areEqual(this.secondary_label, depositsSummaryRow.secondary_label) && Intrinsics.areEqual(this.secondary_value, depositsSummaryRow.secondary_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.primary_label.hashCode()) * 37) + this.primary_value.hashCode()) * 37;
        String str = this.secondary_label;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.secondary_value;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("primary_label=" + Internal.sanitize(this.primary_label));
        arrayList.add("primary_value=" + Internal.sanitize(this.primary_value));
        String str = this.secondary_label;
        if (str != null) {
            arrayList.add("secondary_label=" + Internal.sanitize(str));
        }
        String str2 = this.secondary_value;
        if (str2 != null) {
            arrayList.add("secondary_value=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DepositsSummaryRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DepositsSummaryRow copy$default(DepositsSummaryRow depositsSummaryRow, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositsSummaryRow.primary_label;
        }
        if ((i & 2) != 0) {
            str2 = depositsSummaryRow.primary_value;
        }
        if ((i & 4) != 0) {
            str3 = depositsSummaryRow.secondary_label;
        }
        if ((i & 8) != 0) {
            str4 = depositsSummaryRow.secondary_value;
        }
        if ((i & 16) != 0) {
            byteString = depositsSummaryRow.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return depositsSummaryRow.copy(str, str2, str5, str4, byteString2);
    }

    public final DepositsSummaryRow copy(String primary_label, String primary_value, String secondary_label, String secondary_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(primary_label, "primary_label");
        Intrinsics.checkNotNullParameter(primary_value, "primary_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DepositsSummaryRow(primary_label, primary_value, secondary_label, secondary_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositsSummaryRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DepositsSummaryRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.DepositsSummaryRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DepositsSummaryRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPrimary_label(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPrimary_label());
                }
                if (!Intrinsics.areEqual(value.getPrimary_value(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrimary_value());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(3, value.getSecondary_label()) + protoAdapter.encodedSizeWithTag(4, value.getSecondary_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DepositsSummaryRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPrimary_label(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrimary_label());
                }
                if (!Intrinsics.areEqual(value.getPrimary_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrimary_value());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSecondary_label());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSecondary_value());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DepositsSummaryRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSecondary_value());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSecondary_label());
                if (!Intrinsics.areEqual(value.getPrimary_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPrimary_value());
                }
                if (Intrinsics.areEqual(value.getPrimary_label(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getPrimary_label());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DepositsSummaryRow redact(DepositsSummaryRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DepositsSummaryRow.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DepositsSummaryRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = null;
                String strDecode4 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DepositsSummaryRow(strDecode, strDecode4, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
