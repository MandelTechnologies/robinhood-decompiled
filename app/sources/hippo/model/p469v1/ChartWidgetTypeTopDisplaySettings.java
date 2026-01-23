package hippo.model.p469v1;

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

/* compiled from: ChartWidgetTypeTopDisplaySettings.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010!R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0017\u0010\u0010¨\u0006#"}, m3636d2 = {"Lhippo/model/v1/ChartWidgetTypeTopDisplaySettings;", "Lcom/squareup/wire/Message;", "", "show_open", "", "show_close", "show_high", "show_low", "show_volume", "show_range", "show_change", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "getShow_open", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShow_close", "getShow_high", "getShow_low", "getShow_volume", "getShow_range", "getShow_change", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lhippo/model/v1/ChartWidgetTypeTopDisplaySettings;", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ChartWidgetTypeTopDisplaySettings extends Message {

    @JvmField
    public static final ProtoAdapter<ChartWidgetTypeTopDisplaySettings> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showChange", schemaIndex = 6, tag = 7)
    private final Boolean show_change;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showClose", schemaIndex = 1, tag = 2)
    private final Boolean show_close;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showHigh", schemaIndex = 2, tag = 3)
    private final Boolean show_high;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showLow", schemaIndex = 3, tag = 4)
    private final Boolean show_low;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showOpen", schemaIndex = 0, tag = 1)
    private final Boolean show_open;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showRange", schemaIndex = 5, tag = 6)
    private final Boolean show_range;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showVolume", schemaIndex = 4, tag = 5)
    private final Boolean show_volume;

    public ChartWidgetTypeTopDisplaySettings() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28236newBuilder();
    }

    public final Boolean getShow_open() {
        return this.show_open;
    }

    public final Boolean getShow_close() {
        return this.show_close;
    }

    public final Boolean getShow_high() {
        return this.show_high;
    }

    public final Boolean getShow_low() {
        return this.show_low;
    }

    public final Boolean getShow_volume() {
        return this.show_volume;
    }

    public final Boolean getShow_range() {
        return this.show_range;
    }

    public final Boolean getShow_change() {
        return this.show_change;
    }

    public /* synthetic */ ChartWidgetTypeTopDisplaySettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : bool6, (i & 64) != 0 ? null : bool7, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartWidgetTypeTopDisplaySettings(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.show_open = bool;
        this.show_close = bool2;
        this.show_high = bool3;
        this.show_low = bool4;
        this.show_volume = bool5;
        this.show_range = bool6;
        this.show_change = bool7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28236newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartWidgetTypeTopDisplaySettings)) {
            return false;
        }
        ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettings = (ChartWidgetTypeTopDisplaySettings) other;
        return Intrinsics.areEqual(unknownFields(), chartWidgetTypeTopDisplaySettings.unknownFields()) && Intrinsics.areEqual(this.show_open, chartWidgetTypeTopDisplaySettings.show_open) && Intrinsics.areEqual(this.show_close, chartWidgetTypeTopDisplaySettings.show_close) && Intrinsics.areEqual(this.show_high, chartWidgetTypeTopDisplaySettings.show_high) && Intrinsics.areEqual(this.show_low, chartWidgetTypeTopDisplaySettings.show_low) && Intrinsics.areEqual(this.show_volume, chartWidgetTypeTopDisplaySettings.show_volume) && Intrinsics.areEqual(this.show_range, chartWidgetTypeTopDisplaySettings.show_range) && Intrinsics.areEqual(this.show_change, chartWidgetTypeTopDisplaySettings.show_change);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.show_open;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.show_close;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.show_high;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.show_low;
        int iHashCode5 = (iHashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.show_volume;
        int iHashCode6 = (iHashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.show_range;
        int iHashCode7 = (iHashCode6 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.show_change;
        int iHashCode8 = iHashCode7 + (bool7 != null ? bool7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.show_open;
        if (bool != null) {
            arrayList.add("show_open=" + bool);
        }
        Boolean bool2 = this.show_close;
        if (bool2 != null) {
            arrayList.add("show_close=" + bool2);
        }
        Boolean bool3 = this.show_high;
        if (bool3 != null) {
            arrayList.add("show_high=" + bool3);
        }
        Boolean bool4 = this.show_low;
        if (bool4 != null) {
            arrayList.add("show_low=" + bool4);
        }
        Boolean bool5 = this.show_volume;
        if (bool5 != null) {
            arrayList.add("show_volume=" + bool5);
        }
        Boolean bool6 = this.show_range;
        if (bool6 != null) {
            arrayList.add("show_range=" + bool6);
        }
        Boolean bool7 = this.show_change;
        if (bool7 != null) {
            arrayList.add("show_change=" + bool7);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartWidgetTypeTopDisplaySettings{", "}", 0, null, null, 56, null);
    }

    public final ChartWidgetTypeTopDisplaySettings copy(Boolean show_open, Boolean show_close, Boolean show_high, Boolean show_low, Boolean show_volume, Boolean show_range, Boolean show_change, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartWidgetTypeTopDisplaySettings(show_open, show_close, show_high, show_low, show_volume, show_range, show_change, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartWidgetTypeTopDisplaySettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartWidgetTypeTopDisplaySettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.ChartWidgetTypeTopDisplaySettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartWidgetTypeTopDisplaySettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getShow_open() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(1, value.getShow_open());
                }
                if (value.getShow_close() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(2, value.getShow_close());
                }
                if (value.getShow_high() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(3, value.getShow_high());
                }
                if (value.getShow_low() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(4, value.getShow_low());
                }
                if (value.getShow_volume() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(5, value.getShow_volume());
                }
                if (value.getShow_range() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(6, value.getShow_range());
                }
                return value.getShow_change() != null ? size + ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(7, value.getShow_change()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartWidgetTypeTopDisplaySettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getShow_open() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 1, (int) value.getShow_open());
                }
                if (value.getShow_close() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 2, (int) value.getShow_close());
                }
                if (value.getShow_high() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 3, (int) value.getShow_high());
                }
                if (value.getShow_low() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 4, (int) value.getShow_low());
                }
                if (value.getShow_volume() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 5, (int) value.getShow_volume());
                }
                if (value.getShow_range() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 6, (int) value.getShow_range());
                }
                if (value.getShow_change() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 7, (int) value.getShow_change());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartWidgetTypeTopDisplaySettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getShow_change() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 7, (int) value.getShow_change());
                }
                if (value.getShow_range() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 6, (int) value.getShow_range());
                }
                if (value.getShow_volume() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 5, (int) value.getShow_volume());
                }
                if (value.getShow_low() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 4, (int) value.getShow_low());
                }
                if (value.getShow_high() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 3, (int) value.getShow_high());
                }
                if (value.getShow_close() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 2, (int) value.getShow_close());
                }
                if (value.getShow_open() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 1, (int) value.getShow_open());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartWidgetTypeTopDisplaySettings redact(ChartWidgetTypeTopDisplaySettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Boolean show_open = value.getShow_open();
                Boolean boolRedact = show_open != null ? ProtoAdapter.BOOL_VALUE.redact(show_open) : null;
                Boolean show_close = value.getShow_close();
                Boolean boolRedact2 = show_close != null ? ProtoAdapter.BOOL_VALUE.redact(show_close) : null;
                Boolean show_high = value.getShow_high();
                Boolean boolRedact3 = show_high != null ? ProtoAdapter.BOOL_VALUE.redact(show_high) : null;
                Boolean show_low = value.getShow_low();
                Boolean boolRedact4 = show_low != null ? ProtoAdapter.BOOL_VALUE.redact(show_low) : null;
                Boolean show_volume = value.getShow_volume();
                Boolean boolRedact5 = show_volume != null ? ProtoAdapter.BOOL_VALUE.redact(show_volume) : null;
                Boolean show_range = value.getShow_range();
                Boolean boolRedact6 = show_range != null ? ProtoAdapter.BOOL_VALUE.redact(show_range) : null;
                Boolean show_change = value.getShow_change();
                return value.copy(boolRedact, boolRedact2, boolRedact3, boolRedact4, boolRedact5, boolRedact6, show_change != null ? ProtoAdapter.BOOL_VALUE.redact(show_change) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartWidgetTypeTopDisplaySettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                Boolean boolDecode3 = null;
                Boolean boolDecode4 = null;
                Boolean boolDecode5 = null;
                Boolean boolDecode6 = null;
                Boolean boolDecode7 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                boolDecode = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 2:
                                boolDecode2 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 3:
                                boolDecode3 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 4:
                                boolDecode4 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 5:
                                boolDecode5 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 6:
                                boolDecode6 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 7:
                                boolDecode7 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ChartWidgetTypeTopDisplaySettings(boolDecode, boolDecode2, boolDecode3, boolDecode4, boolDecode5, boolDecode6, boolDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
