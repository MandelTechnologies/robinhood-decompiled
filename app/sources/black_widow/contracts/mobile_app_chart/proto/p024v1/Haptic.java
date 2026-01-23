package black_widow.contracts.mobile_app_chart.proto.p024v1;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: Haptic.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/Haptic;", "Lcom/squareup/wire/Message;", "", ResourceTypes.STYLE, "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyle;Lokio/ByteString;)V", "getStyle", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyle;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Haptic extends Message {

    @JvmField
    public static final ProtoAdapter<Haptic> ADAPTER;

    @WireField(adapter = "black_widow.contracts.mobile_app_chart.proto.v1.HapticStyle#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final HapticStyle style;

    /* JADX WARN: Multi-variable type inference failed */
    public Haptic() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8597newBuilder();
    }

    public final HapticStyle getStyle() {
        return this.style;
    }

    public /* synthetic */ Haptic(HapticStyle hapticStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HapticStyle.HAPTIC_STYLE_UNSPECIFIED : hapticStyle, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Haptic(HapticStyle style, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.style = style;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8597newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Haptic)) {
            return false;
        }
        Haptic haptic = (Haptic) other;
        return Intrinsics.areEqual(unknownFields(), haptic.unknownFields()) && this.style == haptic.style;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.style.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("style=" + this.style);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Haptic{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Haptic copy$default(Haptic haptic, HapticStyle hapticStyle, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            hapticStyle = haptic.style;
        }
        if ((i & 2) != 0) {
            byteString = haptic.unknownFields();
        }
        return haptic.copy(hapticStyle, byteString);
    }

    public final Haptic copy(HapticStyle style, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Haptic(style, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Haptic.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Haptic>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.Haptic$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Haptic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getStyle() != HapticStyle.HAPTIC_STYLE_UNSPECIFIED ? size + HapticStyle.ADAPTER.encodedSizeWithTag(1, value.getStyle()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Haptic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStyle() != HapticStyle.HAPTIC_STYLE_UNSPECIFIED) {
                    HapticStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Haptic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStyle() != HapticStyle.HAPTIC_STYLE_UNSPECIFIED) {
                    HapticStyle.ADAPTER.encodeWithTag(writer, 1, (int) value.getStyle());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Haptic decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                HapticStyle hapticStyleDecode = HapticStyle.HAPTIC_STYLE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Haptic(hapticStyleDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            hapticStyleDecode = HapticStyle.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Haptic redact(Haptic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Haptic.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
