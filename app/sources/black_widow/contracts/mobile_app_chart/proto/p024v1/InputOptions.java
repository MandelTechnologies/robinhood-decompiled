package black_widow.contracts.mobile_app_chart.proto.p024v1;

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

/* compiled from: InputOptions.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/InputOptions;", "Lcom/squareup/wire/Message;", "", AnnotatedPrivateKey.LABEL, "", "value", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "description", "is_disabled", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;Ljava/lang/String;ZLokio/ByteString;)V", "getLabel", "()Ljava/lang/String;", "getValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterValue;", "getDescription", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InputOptions extends Message {

    @JvmField
    public static final ProtoAdapter<InputOptions> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isDisabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean is_disabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String label;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterValue#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IndicatorParameterValue value;

    public InputOptions() {
        this(null, null, null, false, null, 31, null);
    }

    public /* synthetic */ InputOptions(String str, IndicatorParameterValue indicatorParameterValue, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : indicatorParameterValue, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8617newBuilder();
    }

    public final String getLabel() {
        return this.label;
    }

    public final IndicatorParameterValue getValue() {
        return this.value;
    }

    public final String getDescription() {
        return this.description;
    }

    /* renamed from: is_disabled, reason: from getter */
    public final boolean getIs_disabled() {
        return this.is_disabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputOptions(String label, IndicatorParameterValue indicatorParameterValue, String description, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.label = label;
        this.value = indicatorParameterValue;
        this.description = description;
        this.is_disabled = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8617newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InputOptions)) {
            return false;
        }
        InputOptions inputOptions = (InputOptions) other;
        return Intrinsics.areEqual(unknownFields(), inputOptions.unknownFields()) && Intrinsics.areEqual(this.label, inputOptions.label) && Intrinsics.areEqual(this.value, inputOptions.value) && Intrinsics.areEqual(this.description, inputOptions.description) && this.is_disabled == inputOptions.is_disabled;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.label.hashCode()) * 37;
        IndicatorParameterValue indicatorParameterValue = this.value;
        int iHashCode2 = ((((iHashCode + (indicatorParameterValue != null ? indicatorParameterValue.hashCode() : 0)) * 37) + this.description.hashCode()) * 37) + Boolean.hashCode(this.is_disabled);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("label=" + Internal.sanitize(this.label));
        IndicatorParameterValue indicatorParameterValue = this.value;
        if (indicatorParameterValue != null) {
            arrayList.add("value=" + indicatorParameterValue);
        }
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("is_disabled=" + this.is_disabled);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InputOptions{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InputOptions copy$default(InputOptions inputOptions, String str, IndicatorParameterValue indicatorParameterValue, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inputOptions.label;
        }
        if ((i & 2) != 0) {
            indicatorParameterValue = inputOptions.value;
        }
        if ((i & 4) != 0) {
            str2 = inputOptions.description;
        }
        if ((i & 8) != 0) {
            z = inputOptions.is_disabled;
        }
        if ((i & 16) != 0) {
            byteString = inputOptions.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str3 = str2;
        return inputOptions.copy(str, indicatorParameterValue, str3, z, byteString2);
    }

    public final InputOptions copy(String label, IndicatorParameterValue value, String description, boolean is_disabled, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InputOptions(label, value, description, is_disabled, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputOptions.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InputOptions>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.InputOptions$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InputOptions value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getLabel());
                }
                if (value.getValue() != null) {
                    size += IndicatorParameterValue.ADAPTER.encodedSizeWithTag(2, value.getValue());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDescription());
                }
                return value.getIs_disabled() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getIs_disabled())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InputOptions value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getLabel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
                }
                if (value.getValue() != null) {
                    IndicatorParameterValue.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InputOptions value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_disabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) Boolean.valueOf(value.getIs_disabled()));
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDescription());
                }
                if (value.getValue() != null) {
                    IndicatorParameterValue.ADAPTER.encodeWithTag(writer, 2, (int) value.getValue());
                }
                if (Intrinsics.areEqual(value.getLabel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getLabel());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InputOptions redact(InputOptions value) {
                Intrinsics.checkNotNullParameter(value, "value");
                IndicatorParameterValue value2 = value.getValue();
                return InputOptions.copy$default(value, null, value2 != null ? IndicatorParameterValue.ADAPTER.redact(value2) : null, null, false, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InputOptions decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                IndicatorParameterValue indicatorParameterValueDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new InputOptions(strDecode, indicatorParameterValueDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        indicatorParameterValueDecode = IndicatorParameterValue.ADAPTER.decode(reader);
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
