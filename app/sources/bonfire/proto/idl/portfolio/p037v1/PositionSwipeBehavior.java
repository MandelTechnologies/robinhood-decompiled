package bonfire.proto.idl.portfolio.p037v1;

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
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PositionSwipeBehavior.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B©\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010%\u001a\u00020\u0002H\u0017J\u0013\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\tH\u0016J¨\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\"\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionSwipeBehavior;", "Lcom/squareup/wire/Message;", "", "swipe_type", "Lbonfire/proto/idl/portfolio/v1/PositionSwipeType;", "actuation_percentage", "", "text", "", "", "text_color", "background_color", "background_opacity", "alert", "deeplink", "show_loading_indicator", "", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/portfolio/v1/PositionSwipeType;FLjava/util/Map;Ljava/util/Map;Ljava/util/Map;FLjava/util/Map;Ljava/lang/String;ZLjava/lang/String;Lokio/ByteString;)V", "getSwipe_type", "()Lbonfire/proto/idl/portfolio/v1/PositionSwipeType;", "getActuation_percentage", "()F", "getBackground_opacity", "getDeeplink", "()Ljava/lang/String;", "getShow_loading_indicator", "()Z", "getLogging_identifier", "getText", "()Ljava/util/Map;", "getText_color", "getBackground_color", "getAlert", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PositionSwipeBehavior extends Message {

    @JvmField
    public static final ProtoAdapter<PositionSwipeBehavior> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final float actuation_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Map<String, ?> alert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Map<String, ?> background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final float background_opacity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String deeplink;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean show_loading_indicator;

    @WireField(adapter = "bonfire.proto.idl.portfolio.v1.PositionSwipeType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final PositionSwipeType swipe_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Map<String, ?> text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Map<String, ?> text_color;

    public PositionSwipeBehavior() {
        this(null, 0.0f, null, null, null, 0.0f, null, null, false, null, null, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9033newBuilder();
    }

    public final PositionSwipeType getSwipe_type() {
        return this.swipe_type;
    }

    public /* synthetic */ PositionSwipeBehavior(PositionSwipeType positionSwipeType, float f, Map map, Map map2, Map map3, float f2, Map map4, String str, boolean z, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PositionSwipeType.PositionSwipeType_UNSPECIFIED : positionSwipeType, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? null : map3, (i & 32) != 0 ? 0.0f : f2, (i & 64) != 0 ? null : map4, (i & 128) != 0 ? null : str, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    public final float getActuation_percentage() {
        return this.actuation_percentage;
    }

    public final float getBackground_opacity() {
        return this.background_opacity;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final boolean getShow_loading_indicator() {
        return this.show_loading_indicator;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionSwipeBehavior(PositionSwipeType swipe_type, float f, Map<String, ?> map, Map<String, ?> map2, Map<String, ?> map3, float f2, Map<String, ?> map4, String str, boolean z, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(swipe_type, "swipe_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.swipe_type = swipe_type;
        this.actuation_percentage = f;
        this.background_opacity = f2;
        this.deeplink = str;
        this.show_loading_indicator = z;
        this.logging_identifier = str2;
        this.text = (Map) Internal.immutableCopyOfStruct("text", map);
        this.text_color = (Map) Internal.immutableCopyOfStruct("text_color", map2);
        this.background_color = (Map) Internal.immutableCopyOfStruct("background_color", map3);
        this.alert = (Map) Internal.immutableCopyOfStruct("alert", map4);
    }

    public final Map<String, ?> getText() {
        return this.text;
    }

    public final Map<String, ?> getText_color() {
        return this.text_color;
    }

    public final Map<String, ?> getBackground_color() {
        return this.background_color;
    }

    public final Map<String, ?> getAlert() {
        return this.alert;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9033newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PositionSwipeBehavior)) {
            return false;
        }
        PositionSwipeBehavior positionSwipeBehavior = (PositionSwipeBehavior) other;
        return Intrinsics.areEqual(unknownFields(), positionSwipeBehavior.unknownFields()) && this.swipe_type == positionSwipeBehavior.swipe_type && this.actuation_percentage == positionSwipeBehavior.actuation_percentage && Intrinsics.areEqual(this.text, positionSwipeBehavior.text) && Intrinsics.areEqual(this.text_color, positionSwipeBehavior.text_color) && Intrinsics.areEqual(this.background_color, positionSwipeBehavior.background_color) && this.background_opacity == positionSwipeBehavior.background_opacity && Intrinsics.areEqual(this.alert, positionSwipeBehavior.alert) && Intrinsics.areEqual(this.deeplink, positionSwipeBehavior.deeplink) && this.show_loading_indicator == positionSwipeBehavior.show_loading_indicator && Intrinsics.areEqual(this.logging_identifier, positionSwipeBehavior.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.swipe_type.hashCode()) * 37) + Float.hashCode(this.actuation_percentage)) * 37;
        Map<String, ?> map = this.text;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 37;
        Map<String, ?> map2 = this.text_color;
        int iHashCode3 = (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 37;
        Map<String, ?> map3 = this.background_color;
        int iHashCode4 = (((iHashCode3 + (map3 != null ? map3.hashCode() : 0)) * 37) + Float.hashCode(this.background_opacity)) * 37;
        Map<String, ?> map4 = this.alert;
        int iHashCode5 = (iHashCode4 + (map4 != null ? map4.hashCode() : 0)) * 37;
        String str = this.deeplink;
        int iHashCode6 = (((iHashCode5 + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.show_loading_indicator)) * 37;
        String str2 = this.logging_identifier;
        int iHashCode7 = iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("swipe_type=" + this.swipe_type);
        arrayList.add("actuation_percentage=" + this.actuation_percentage);
        Map<String, ?> map = this.text;
        if (map != null) {
            arrayList.add("text=" + map);
        }
        Map<String, ?> map2 = this.text_color;
        if (map2 != null) {
            arrayList.add("text_color=" + map2);
        }
        Map<String, ?> map3 = this.background_color;
        if (map3 != null) {
            arrayList.add("background_color=" + map3);
        }
        arrayList.add("background_opacity=" + this.background_opacity);
        Map<String, ?> map4 = this.alert;
        if (map4 != null) {
            arrayList.add("alert=" + map4);
        }
        String str = this.deeplink;
        if (str != null) {
            arrayList.add("deeplink=" + Internal.sanitize(str));
        }
        arrayList.add("show_loading_indicator=" + this.show_loading_indicator);
        String str2 = this.logging_identifier;
        if (str2 != null) {
            arrayList.add("logging_identifier=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PositionSwipeBehavior{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PositionSwipeBehavior copy$default(PositionSwipeBehavior positionSwipeBehavior, PositionSwipeType positionSwipeType, float f, Map map, Map map2, Map map3, float f2, Map map4, String str, boolean z, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            positionSwipeType = positionSwipeBehavior.swipe_type;
        }
        if ((i & 2) != 0) {
            f = positionSwipeBehavior.actuation_percentage;
        }
        if ((i & 4) != 0) {
            map = positionSwipeBehavior.text;
        }
        if ((i & 8) != 0) {
            map2 = positionSwipeBehavior.text_color;
        }
        if ((i & 16) != 0) {
            map3 = positionSwipeBehavior.background_color;
        }
        if ((i & 32) != 0) {
            f2 = positionSwipeBehavior.background_opacity;
        }
        if ((i & 64) != 0) {
            map4 = positionSwipeBehavior.alert;
        }
        if ((i & 128) != 0) {
            str = positionSwipeBehavior.deeplink;
        }
        if ((i & 256) != 0) {
            z = positionSwipeBehavior.show_loading_indicator;
        }
        if ((i & 512) != 0) {
            str2 = positionSwipeBehavior.logging_identifier;
        }
        if ((i & 1024) != 0) {
            byteString = positionSwipeBehavior.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        String str4 = str;
        boolean z2 = z;
        float f3 = f2;
        Map map5 = map4;
        Map map6 = map3;
        Map map7 = map;
        return positionSwipeBehavior.copy(positionSwipeType, f, map7, map2, map6, f3, map5, str4, z2, str3, byteString2);
    }

    public final PositionSwipeBehavior copy(PositionSwipeType swipe_type, float actuation_percentage, Map<String, ?> text, Map<String, ?> text_color, Map<String, ?> background_color, float background_opacity, Map<String, ?> alert, String deeplink, boolean show_loading_indicator, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(swipe_type, "swipe_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PositionSwipeBehavior(swipe_type, actuation_percentage, text, text_color, background_color, background_opacity, alert, deeplink, show_loading_indicator, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionSwipeBehavior.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PositionSwipeBehavior>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.portfolio.v1.PositionSwipeBehavior$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PositionSwipeBehavior value) {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSwipe_type() != PositionSwipeType.PositionSwipeType_UNSPECIFIED) {
                    size += PositionSwipeType.ADAPTER.encodedSizeWithTag(1, value.getSwipe_type());
                }
                if (!Float.valueOf(value.getActuation_percentage()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getActuation_percentage()));
                }
                if (value.getText() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(3, value.getText());
                }
                if (value.getText_color() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(4, value.getText_color());
                }
                if (value.getBackground_color() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(5, value.getBackground_color());
                }
                if (!Float.valueOf(value.getBackground_opacity()).equals(fValueOf)) {
                    size += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getBackground_opacity()));
                }
                if (value.getAlert() != null) {
                    size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(7, value.getAlert());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(8, value.getDeeplink());
                if (value.getShow_loading_indicator()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getShow_loading_indicator()));
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, value.getLogging_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PositionSwipeBehavior value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSwipe_type() != PositionSwipeType.PositionSwipeType_UNSPECIFIED) {
                    PositionSwipeType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSwipe_type());
                }
                if (!Float.valueOf(value.getActuation_percentage()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getActuation_percentage()));
                }
                if (value.getText() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (value.getText_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 4, (int) value.getText_color());
                }
                if (value.getBackground_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value.getBackground_color());
                }
                if (!Float.valueOf(value.getBackground_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getBackground_opacity()));
                }
                if (value.getAlert() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 7, (int) value.getAlert());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDeeplink());
                if (value.getShow_loading_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getShow_loading_indicator()));
                }
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLogging_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PositionSwipeBehavior value) throws IOException {
                Float fValueOf = Float.valueOf(0.0f);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 10, (int) value.getLogging_identifier());
                if (value.getShow_loading_indicator()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getShow_loading_indicator()));
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDeeplink());
                if (value.getAlert() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 7, (int) value.getAlert());
                }
                if (!Float.valueOf(value.getBackground_opacity()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 6, (int) Float.valueOf(value.getBackground_opacity()));
                }
                if (value.getBackground_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 5, (int) value.getBackground_color());
                }
                if (value.getText_color() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 4, (int) value.getText_color());
                }
                if (value.getText() != null) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 3, (int) value.getText());
                }
                if (!Float.valueOf(value.getActuation_percentage()).equals(fValueOf)) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, (int) Float.valueOf(value.getActuation_percentage()));
                }
                if (value.getSwipe_type() != PositionSwipeType.PositionSwipeType_UNSPECIFIED) {
                    PositionSwipeType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSwipe_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PositionSwipeBehavior decode(ProtoReader reader) throws IOException {
                PositionSwipeType positionSwipeType;
                Map<String, ?> map;
                Intrinsics.checkNotNullParameter(reader, "reader");
                PositionSwipeType positionSwipeType2 = PositionSwipeType.PositionSwipeType_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Map<String, ?> mapDecode = null;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                Map<String, ?> mapDecode2 = null;
                Map<String, ?> mapDecode3 = null;
                String strDecode = null;
                String strDecode2 = null;
                boolean zBooleanValue = false;
                PositionSwipeType positionSwipeTypeDecode = positionSwipeType2;
                Map<String, ?> mapDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                try {
                                    positionSwipeTypeDecode = PositionSwipeType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    positionSwipeType = positionSwipeTypeDecode;
                                    map = mapDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 2:
                                fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                continue;
                            case 3:
                                mapDecode = ProtoAdapter.STRUCT_MAP.decode(reader);
                                continue;
                            case 4:
                                mapDecode4 = ProtoAdapter.STRUCT_MAP.decode(reader);
                                continue;
                            case 5:
                                mapDecode2 = ProtoAdapter.STRUCT_MAP.decode(reader);
                                continue;
                            case 6:
                                fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                continue;
                            case 7:
                                mapDecode3 = ProtoAdapter.STRUCT_MAP.decode(reader);
                                continue;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 10:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                positionSwipeType = positionSwipeTypeDecode;
                                map = mapDecode;
                                break;
                        }
                        mapDecode = map;
                        positionSwipeTypeDecode = positionSwipeType;
                    } else {
                        return new PositionSwipeBehavior(positionSwipeTypeDecode, fFloatValue, mapDecode, mapDecode4, mapDecode2, fFloatValue2, mapDecode3, strDecode, zBooleanValue, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PositionSwipeBehavior redact(PositionSwipeBehavior value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Map<String, ?> text = value.getText();
                Map<String, ?> mapRedact = text != null ? ProtoAdapter.STRUCT_MAP.redact(text) : null;
                Map<String, ?> text_color = value.getText_color();
                Map<String, ?> mapRedact2 = text_color != null ? ProtoAdapter.STRUCT_MAP.redact(text_color) : null;
                Map<String, ?> background_color = value.getBackground_color();
                Map<String, ?> mapRedact3 = background_color != null ? ProtoAdapter.STRUCT_MAP.redact(background_color) : null;
                Map<String, ?> alert = value.getAlert();
                return PositionSwipeBehavior.copy$default(value, null, 0.0f, mapRedact, mapRedact2, mapRedact3, 0.0f, alert != null ? ProtoAdapter.STRUCT_MAP.redact(alert) : null, null, false, null, ByteString.EMPTY, 931, null);
            }
        };
    }
}
