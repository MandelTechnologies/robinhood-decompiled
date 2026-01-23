package advisory.proto.p008v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import rh_server_driven_ui.p531v1.ThemedColor;

/* compiled from: ModelPortfolioChangeRow.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Ladvisory/proto/v1/ModelPortfolioChangeRow;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "original_value", "new_value", "value_color", "Lrh_server_driven_ui/v1/ThemedColor;", "description", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColor;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getOriginal_value", "getNew_value", "getValue_color", "()Lrh_server_driven_ui/v1/ThemedColor;", "getDescription", "getLogging_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ModelPortfolioChangeRow extends Message {

    @JvmField
    public static final ProtoAdapter<ModelPortfolioChangeRow> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String new_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "originalValue", schemaIndex = 1, tag = 2)
    private final String original_value;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedColor#ADAPTER", jsonName = "valueColor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ThemedColor value_color;

    public ModelPortfolioChangeRow() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ModelPortfolioChangeRow(String str, String str2, String str3, ThemedColor themedColor, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : themedColor, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4521newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOriginal_value() {
        return this.original_value;
    }

    public final String getNew_value() {
        return this.new_value;
    }

    public final ThemedColor getValue_color() {
        return this.value_color;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelPortfolioChangeRow(String label, String str, String new_value, ThemedColor themedColor, String description, String logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(new_value, "new_value");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.original_value = str;
        this.new_value = new_value;
        this.value_color = themedColor;
        this.description = description;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4521newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ModelPortfolioChangeRow)) {
            return false;
        }
        ModelPortfolioChangeRow modelPortfolioChangeRow = (ModelPortfolioChangeRow) other;
        return Intrinsics.areEqual(unknownFields(), modelPortfolioChangeRow.unknownFields()) && Intrinsics.areEqual(this.label, modelPortfolioChangeRow.label) && Intrinsics.areEqual(this.original_value, modelPortfolioChangeRow.original_value) && Intrinsics.areEqual(this.new_value, modelPortfolioChangeRow.new_value) && Intrinsics.areEqual(this.value_color, modelPortfolioChangeRow.value_color) && Intrinsics.areEqual(this.description, modelPortfolioChangeRow.description) && Intrinsics.areEqual(this.logging_identifier, modelPortfolioChangeRow.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37;
        String str = this.original_value;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.new_value.hashCode()) * 37;
        ThemedColor themedColor = this.value_color;
        int iHashCode3 = ((((iHashCode2 + (themedColor != null ? themedColor.hashCode() : 0)) * 37) + this.description.hashCode()) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        String str = this.original_value;
        if (str != null) {
            arrayList.add("original_value=" + Internal.sanitize(str));
        }
        arrayList.add("new_value=" + Internal.sanitize(this.new_value));
        ThemedColor themedColor = this.value_color;
        if (themedColor != null) {
            arrayList.add("value_color=" + themedColor);
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ModelPortfolioChangeRow{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ModelPortfolioChangeRow copy$default(ModelPortfolioChangeRow modelPortfolioChangeRow, String str, String str2, String str3, ThemedColor themedColor, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelPortfolioChangeRow.label;
        }
        if ((i & 2) != 0) {
            str2 = modelPortfolioChangeRow.original_value;
        }
        if ((i & 4) != 0) {
            str3 = modelPortfolioChangeRow.new_value;
        }
        if ((i & 8) != 0) {
            themedColor = modelPortfolioChangeRow.value_color;
        }
        if ((i & 16) != 0) {
            str4 = modelPortfolioChangeRow.description;
        }
        if ((i & 32) != 0) {
            str5 = modelPortfolioChangeRow.logging_identifier;
        }
        if ((i & 64) != 0) {
            byteString = modelPortfolioChangeRow.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        String str8 = str3;
        return modelPortfolioChangeRow.copy(str, str2, str8, themedColor, str7, str6, byteString2);
    }

    public final ModelPortfolioChangeRow copy(String label, String original_value, String new_value, ThemedColor value_color, String description, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(new_value, "new_value");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ModelPortfolioChangeRow(label, original_value, new_value, value_color, description, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ModelPortfolioChangeRow.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ModelPortfolioChangeRow>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: advisory.proto.v1.ModelPortfolioChangeRow$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ModelPortfolioChangeRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getOriginal_value());
                if (!Intrinsics.areEqual(value.getNew_value(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getNew_value());
                }
                if (value.getValue_color() != null) {
                    iEncodedSizeWithTag += ThemedColor.ADAPTER.encodedSizeWithTag(4, value.getValue_color());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getDescription());
                }
                return !Intrinsics.areEqual(value.getLogging_identifier(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getLogging_identifier()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ModelPortfolioChangeRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getOriginal_value());
                if (!Intrinsics.areEqual(value.getNew_value(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getNew_value());
                }
                if (value.getValue_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getValue_color());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ModelPortfolioChangeRow value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getLogging_identifier());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDescription());
                }
                if (value.getValue_color() != null) {
                    ThemedColor.ADAPTER.encodeWithTag(writer, 4, (int) value.getValue_color());
                }
                if (!Intrinsics.areEqual(value.getNew_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_value());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getOriginal_value());
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ModelPortfolioChangeRow redact(ModelPortfolioChangeRow value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ThemedColor value_color = value.getValue_color();
                return ModelPortfolioChangeRow.copy$default(value, null, null, null, value_color != null ? ThemedColor.ADAPTER.redact(value_color) : null, null, null, ByteString.EMPTY, 55, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ModelPortfolioChangeRow decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                ThemedColor themedColorDecode = null;
                String strDecode5 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                themedColorDecode = ThemedColor.ADAPTER.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ModelPortfolioChangeRow(strDecode, strDecode4, strDecode5, themedColorDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
