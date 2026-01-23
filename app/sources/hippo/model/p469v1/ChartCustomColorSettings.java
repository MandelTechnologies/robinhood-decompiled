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

/* compiled from: ChartCustomColorSettings.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lhippo/model/v1/ChartCustomColorSettings;", "Lcom/squareup/wire/Message;", "", "candle_body", "Lhippo/model/v1/HideableCustomColorSettings;", "candle_border", "candle_wicks", "other_chart_types", "Lhippo/model/v1/CustomColorSettings;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/HideableCustomColorSettings;Lhippo/model/v1/HideableCustomColorSettings;Lhippo/model/v1/HideableCustomColorSettings;Lhippo/model/v1/CustomColorSettings;Lokio/ByteString;)V", "getCandle_body", "()Lhippo/model/v1/HideableCustomColorSettings;", "getCandle_border", "getCandle_wicks", "getOther_chart_types", "()Lhippo/model/v1/CustomColorSettings;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ChartCustomColorSettings extends Message {

    @JvmField
    public static final ProtoAdapter<ChartCustomColorSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.HideableCustomColorSettings#ADAPTER", jsonName = "candleBody", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final HideableCustomColorSettings candle_body;

    @WireField(adapter = "hippo.model.v1.HideableCustomColorSettings#ADAPTER", jsonName = "candleBorder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final HideableCustomColorSettings candle_border;

    @WireField(adapter = "hippo.model.v1.HideableCustomColorSettings#ADAPTER", jsonName = "candleWicks", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final HideableCustomColorSettings candle_wicks;

    @WireField(adapter = "hippo.model.v1.CustomColorSettings#ADAPTER", jsonName = "otherChartTypes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CustomColorSettings other_chart_types;

    public ChartCustomColorSettings() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28234newBuilder();
    }

    public final HideableCustomColorSettings getCandle_body() {
        return this.candle_body;
    }

    public final HideableCustomColorSettings getCandle_border() {
        return this.candle_border;
    }

    public final HideableCustomColorSettings getCandle_wicks() {
        return this.candle_wicks;
    }

    public final CustomColorSettings getOther_chart_types() {
        return this.other_chart_types;
    }

    public /* synthetic */ ChartCustomColorSettings(HideableCustomColorSettings hideableCustomColorSettings, HideableCustomColorSettings hideableCustomColorSettings2, HideableCustomColorSettings hideableCustomColorSettings3, CustomColorSettings customColorSettings, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hideableCustomColorSettings, (i & 2) != 0 ? null : hideableCustomColorSettings2, (i & 4) != 0 ? null : hideableCustomColorSettings3, (i & 8) != 0 ? null : customColorSettings, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartCustomColorSettings(HideableCustomColorSettings hideableCustomColorSettings, HideableCustomColorSettings hideableCustomColorSettings2, HideableCustomColorSettings hideableCustomColorSettings3, CustomColorSettings customColorSettings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.candle_body = hideableCustomColorSettings;
        this.candle_border = hideableCustomColorSettings2;
        this.candle_wicks = hideableCustomColorSettings3;
        this.other_chart_types = customColorSettings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28234newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartCustomColorSettings)) {
            return false;
        }
        ChartCustomColorSettings chartCustomColorSettings = (ChartCustomColorSettings) other;
        return Intrinsics.areEqual(unknownFields(), chartCustomColorSettings.unknownFields()) && Intrinsics.areEqual(this.candle_body, chartCustomColorSettings.candle_body) && Intrinsics.areEqual(this.candle_border, chartCustomColorSettings.candle_border) && Intrinsics.areEqual(this.candle_wicks, chartCustomColorSettings.candle_wicks) && Intrinsics.areEqual(this.other_chart_types, chartCustomColorSettings.other_chart_types);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        HideableCustomColorSettings hideableCustomColorSettings = this.candle_body;
        int iHashCode2 = (iHashCode + (hideableCustomColorSettings != null ? hideableCustomColorSettings.hashCode() : 0)) * 37;
        HideableCustomColorSettings hideableCustomColorSettings2 = this.candle_border;
        int iHashCode3 = (iHashCode2 + (hideableCustomColorSettings2 != null ? hideableCustomColorSettings2.hashCode() : 0)) * 37;
        HideableCustomColorSettings hideableCustomColorSettings3 = this.candle_wicks;
        int iHashCode4 = (iHashCode3 + (hideableCustomColorSettings3 != null ? hideableCustomColorSettings3.hashCode() : 0)) * 37;
        CustomColorSettings customColorSettings = this.other_chart_types;
        int iHashCode5 = iHashCode4 + (customColorSettings != null ? customColorSettings.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        HideableCustomColorSettings hideableCustomColorSettings = this.candle_body;
        if (hideableCustomColorSettings != null) {
            arrayList.add("candle_body=" + hideableCustomColorSettings);
        }
        HideableCustomColorSettings hideableCustomColorSettings2 = this.candle_border;
        if (hideableCustomColorSettings2 != null) {
            arrayList.add("candle_border=" + hideableCustomColorSettings2);
        }
        HideableCustomColorSettings hideableCustomColorSettings3 = this.candle_wicks;
        if (hideableCustomColorSettings3 != null) {
            arrayList.add("candle_wicks=" + hideableCustomColorSettings3);
        }
        CustomColorSettings customColorSettings = this.other_chart_types;
        if (customColorSettings != null) {
            arrayList.add("other_chart_types=" + customColorSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartCustomColorSettings{", "}", 0, null, null, 56, null);
    }

    public final ChartCustomColorSettings copy(HideableCustomColorSettings candle_body, HideableCustomColorSettings candle_border, HideableCustomColorSettings candle_wicks, CustomColorSettings other_chart_types, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartCustomColorSettings(candle_body, candle_border, candle_wicks, other_chart_types, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartCustomColorSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartCustomColorSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.ChartCustomColorSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartCustomColorSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCandle_body() != null) {
                    size += HideableCustomColorSettings.ADAPTER.encodedSizeWithTag(1, value.getCandle_body());
                }
                if (value.getCandle_border() != null) {
                    size += HideableCustomColorSettings.ADAPTER.encodedSizeWithTag(2, value.getCandle_border());
                }
                if (value.getCandle_wicks() != null) {
                    size += HideableCustomColorSettings.ADAPTER.encodedSizeWithTag(3, value.getCandle_wicks());
                }
                return value.getOther_chart_types() != null ? size + CustomColorSettings.ADAPTER.encodedSizeWithTag(4, value.getOther_chart_types()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartCustomColorSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCandle_body() != null) {
                    HideableCustomColorSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getCandle_body());
                }
                if (value.getCandle_border() != null) {
                    HideableCustomColorSettings.ADAPTER.encodeWithTag(writer, 2, (int) value.getCandle_border());
                }
                if (value.getCandle_wicks() != null) {
                    HideableCustomColorSettings.ADAPTER.encodeWithTag(writer, 3, (int) value.getCandle_wicks());
                }
                if (value.getOther_chart_types() != null) {
                    CustomColorSettings.ADAPTER.encodeWithTag(writer, 4, (int) value.getOther_chart_types());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartCustomColorSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOther_chart_types() != null) {
                    CustomColorSettings.ADAPTER.encodeWithTag(writer, 4, (int) value.getOther_chart_types());
                }
                if (value.getCandle_wicks() != null) {
                    HideableCustomColorSettings.ADAPTER.encodeWithTag(writer, 3, (int) value.getCandle_wicks());
                }
                if (value.getCandle_border() != null) {
                    HideableCustomColorSettings.ADAPTER.encodeWithTag(writer, 2, (int) value.getCandle_border());
                }
                if (value.getCandle_body() != null) {
                    HideableCustomColorSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getCandle_body());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartCustomColorSettings redact(ChartCustomColorSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                HideableCustomColorSettings candle_body = value.getCandle_body();
                HideableCustomColorSettings hideableCustomColorSettingsRedact = candle_body != null ? HideableCustomColorSettings.ADAPTER.redact(candle_body) : null;
                HideableCustomColorSettings candle_border = value.getCandle_border();
                HideableCustomColorSettings hideableCustomColorSettingsRedact2 = candle_border != null ? HideableCustomColorSettings.ADAPTER.redact(candle_border) : null;
                HideableCustomColorSettings candle_wicks = value.getCandle_wicks();
                HideableCustomColorSettings hideableCustomColorSettingsRedact3 = candle_wicks != null ? HideableCustomColorSettings.ADAPTER.redact(candle_wicks) : null;
                CustomColorSettings other_chart_types = value.getOther_chart_types();
                return value.copy(hideableCustomColorSettingsRedact, hideableCustomColorSettingsRedact2, hideableCustomColorSettingsRedact3, other_chart_types != null ? CustomColorSettings.ADAPTER.redact(other_chart_types) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartCustomColorSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                HideableCustomColorSettings hideableCustomColorSettingsDecode = null;
                HideableCustomColorSettings hideableCustomColorSettingsDecode2 = null;
                HideableCustomColorSettings hideableCustomColorSettingsDecode3 = null;
                CustomColorSettings customColorSettingsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ChartCustomColorSettings(hideableCustomColorSettingsDecode, hideableCustomColorSettingsDecode2, hideableCustomColorSettingsDecode3, customColorSettingsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        hideableCustomColorSettingsDecode = HideableCustomColorSettings.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        hideableCustomColorSettingsDecode2 = HideableCustomColorSettings.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        hideableCustomColorSettingsDecode3 = HideableCustomColorSettings.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        customColorSettingsDecode = CustomColorSettings.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
