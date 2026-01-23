package futures_onboarding_value_props.proto.p463v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetValuePropPagesRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetValuePropPagesRequest;", "Lcom/squareup/wire/Message;", "", "type", "Lfutures_onboarding_value_props/proto/v1/Type;", "locale", "Lfutures_onboarding_value_props/proto/v1/Locale;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lfutures_onboarding_value_props/proto/v1/Type;Lfutures_onboarding_value_props/proto/v1/Locale;Lokio/ByteString;)V", "getType", "()Lfutures_onboarding_value_props/proto/v1/Type;", "getLocale", "()Lfutures_onboarding_value_props/proto/v1/Locale;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetValuePropPagesRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetValuePropPagesRequest> ADAPTER;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.Locale#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Locale locale;

    @WireField(adapter = "futures_onboarding_value_props.proto.v1.Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Type type;

    public GetValuePropPagesRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28105newBuilder();
    }

    public final Type getType() {
        return this.type;
    }

    public /* synthetic */ GetValuePropPagesRequest(Type type2, Locale locale, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 2) != 0 ? Locale.LOCALE_UNSPECIFIED : locale, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Locale getLocale() {
        return this.locale;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetValuePropPagesRequest(Type type2, Locale locale, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.type = type2;
        this.locale = locale;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28105newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetValuePropPagesRequest)) {
            return false;
        }
        GetValuePropPagesRequest getValuePropPagesRequest = (GetValuePropPagesRequest) other;
        return Intrinsics.areEqual(unknownFields(), getValuePropPagesRequest.unknownFields()) && this.type == getValuePropPagesRequest.type && this.locale == getValuePropPagesRequest.locale;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.locale.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("type=" + this.type);
        arrayList.add("locale=" + this.locale);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetValuePropPagesRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetValuePropPagesRequest copy$default(GetValuePropPagesRequest getValuePropPagesRequest, Type type2, Locale locale, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = getValuePropPagesRequest.type;
        }
        if ((i & 2) != 0) {
            locale = getValuePropPagesRequest.locale;
        }
        if ((i & 4) != 0) {
            byteString = getValuePropPagesRequest.unknownFields();
        }
        return getValuePropPagesRequest.copy(type2, locale, byteString);
    }

    public final GetValuePropPagesRequest copy(Type type2, Locale locale, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetValuePropPagesRequest(type2, locale, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetValuePropPagesRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetValuePropPagesRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_onboarding_value_props.proto.v1.GetValuePropPagesRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetValuePropPagesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getType() != Type.TYPE_UNSPECIFIED) {
                    size += Type.ADAPTER.encodedSizeWithTag(1, value.getType());
                }
                return value.getLocale() != Locale.LOCALE_UNSPECIFIED ? size + Locale.ADAPTER.encodedSizeWithTag(2, value.getLocale()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetValuePropPagesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getType() != Type.TYPE_UNSPECIFIED) {
                    Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
                if (value.getLocale() != Locale.LOCALE_UNSPECIFIED) {
                    Locale.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocale());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetValuePropPagesRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getLocale() != Locale.LOCALE_UNSPECIFIED) {
                    Locale.ADAPTER.encodeWithTag(writer, 2, (int) value.getLocale());
                }
                if (value.getType() != Type.TYPE_UNSPECIFIED) {
                    Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetValuePropPagesRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Type typeDecode = Type.TYPE_UNSPECIFIED;
                Locale localeDecode = Locale.LOCALE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetValuePropPagesRequest(typeDecode, localeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            typeDecode = Type.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            localeDecode = Locale.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetValuePropPagesRequest redact(GetValuePropPagesRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetValuePropPagesRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
