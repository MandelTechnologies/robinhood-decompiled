package hippo.service.p470v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import hippo.model.p469v1.AppType;
import hippo.model.p469v1.ChartWidgetTypeSettings;
import hippo.model.p469v1.LadderWidgetTypeSettings;
import hippo.model.p469v1.WidgetType;
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

/* compiled from: UpdateWidgetTypeSettingsRequest.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JF\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lhippo/service/v1/UpdateWidgetTypeSettingsRequest;", "Lcom/squareup/wire/Message;", "", "id", "", "widget_type", "Lhippo/model/v1/WidgetType;", "chart_widget_type_settings", "Lhippo/model/v1/ChartWidgetTypeSettings;", "ladder_widget_type_settings", "Lhippo/model/v1/LadderWidgetTypeSettings;", "app_type", "Lhippo/model/v1/AppType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lhippo/model/v1/WidgetType;Lhippo/model/v1/ChartWidgetTypeSettings;Lhippo/model/v1/LadderWidgetTypeSettings;Lhippo/model/v1/AppType;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getWidget_type", "()Lhippo/model/v1/WidgetType;", "getChart_widget_type_settings", "()Lhippo/model/v1/ChartWidgetTypeSettings;", "getLadder_widget_type_settings", "()Lhippo/model/v1/LadderWidgetTypeSettings;", "getApp_type", "()Lhippo/model/v1/AppType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UpdateWidgetTypeSettingsRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateWidgetTypeSettingsRequest> ADAPTER;

    @WireField(adapter = "hippo.model.v1.AppType#ADAPTER", jsonName = "appType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final AppType app_type;

    @WireField(adapter = "hippo.model.v1.ChartWidgetTypeSettings#ADAPTER", jsonName = "chartWidgetTypeSettings", oneofName = "settings", schemaIndex = 2, tag = 3)
    private final ChartWidgetTypeSettings chart_widget_type_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "hippo.model.v1.LadderWidgetTypeSettings#ADAPTER", jsonName = "ladderWidgetTypeSettings", oneofName = "settings", schemaIndex = 3, tag = 5)
    private final LadderWidgetTypeSettings ladder_widget_type_settings;

    @WireField(adapter = "hippo.model.v1.WidgetType#ADAPTER", jsonName = "widgetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final WidgetType widget_type;

    public UpdateWidgetTypeSettingsRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28271newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ UpdateWidgetTypeSettingsRequest(String str, WidgetType widgetType, ChartWidgetTypeSettings chartWidgetTypeSettings, LadderWidgetTypeSettings ladderWidgetTypeSettings, AppType appType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? WidgetType.WIDGET_TYPE_UNSPECIFIED : widgetType, (i & 4) != 0 ? null : chartWidgetTypeSettings, (i & 8) != 0 ? null : ladderWidgetTypeSettings, (i & 16) != 0 ? AppType.APP_TYPE_UNSPECIFIED : appType, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final WidgetType getWidget_type() {
        return this.widget_type;
    }

    public final ChartWidgetTypeSettings getChart_widget_type_settings() {
        return this.chart_widget_type_settings;
    }

    public final LadderWidgetTypeSettings getLadder_widget_type_settings() {
        return this.ladder_widget_type_settings;
    }

    public final AppType getApp_type() {
        return this.app_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateWidgetTypeSettingsRequest(String id, WidgetType widget_type, ChartWidgetTypeSettings chartWidgetTypeSettings, LadderWidgetTypeSettings ladderWidgetTypeSettings, AppType app_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(widget_type, "widget_type");
        Intrinsics.checkNotNullParameter(app_type, "app_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.widget_type = widget_type;
        this.chart_widget_type_settings = chartWidgetTypeSettings;
        this.ladder_widget_type_settings = ladderWidgetTypeSettings;
        this.app_type = app_type;
        if (Internal.countNonNull(chartWidgetTypeSettings, ladderWidgetTypeSettings) > 1) {
            throw new IllegalArgumentException("At most one of chart_widget_type_settings, ladder_widget_type_settings may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28271newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateWidgetTypeSettingsRequest)) {
            return false;
        }
        UpdateWidgetTypeSettingsRequest updateWidgetTypeSettingsRequest = (UpdateWidgetTypeSettingsRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateWidgetTypeSettingsRequest.unknownFields()) && Intrinsics.areEqual(this.id, updateWidgetTypeSettingsRequest.id) && this.widget_type == updateWidgetTypeSettingsRequest.widget_type && Intrinsics.areEqual(this.chart_widget_type_settings, updateWidgetTypeSettingsRequest.chart_widget_type_settings) && Intrinsics.areEqual(this.ladder_widget_type_settings, updateWidgetTypeSettingsRequest.ladder_widget_type_settings) && this.app_type == updateWidgetTypeSettingsRequest.app_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.widget_type.hashCode()) * 37;
        ChartWidgetTypeSettings chartWidgetTypeSettings = this.chart_widget_type_settings;
        int iHashCode2 = (iHashCode + (chartWidgetTypeSettings != null ? chartWidgetTypeSettings.hashCode() : 0)) * 37;
        LadderWidgetTypeSettings ladderWidgetTypeSettings = this.ladder_widget_type_settings;
        int iHashCode3 = ((iHashCode2 + (ladderWidgetTypeSettings != null ? ladderWidgetTypeSettings.hashCode() : 0)) * 37) + this.app_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("widget_type=" + this.widget_type);
        ChartWidgetTypeSettings chartWidgetTypeSettings = this.chart_widget_type_settings;
        if (chartWidgetTypeSettings != null) {
            arrayList.add("chart_widget_type_settings=" + chartWidgetTypeSettings);
        }
        LadderWidgetTypeSettings ladderWidgetTypeSettings = this.ladder_widget_type_settings;
        if (ladderWidgetTypeSettings != null) {
            arrayList.add("ladder_widget_type_settings=" + ladderWidgetTypeSettings);
        }
        arrayList.add("app_type=" + this.app_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateWidgetTypeSettingsRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateWidgetTypeSettingsRequest copy$default(UpdateWidgetTypeSettingsRequest updateWidgetTypeSettingsRequest, String str, WidgetType widgetType, ChartWidgetTypeSettings chartWidgetTypeSettings, LadderWidgetTypeSettings ladderWidgetTypeSettings, AppType appType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateWidgetTypeSettingsRequest.id;
        }
        if ((i & 2) != 0) {
            widgetType = updateWidgetTypeSettingsRequest.widget_type;
        }
        if ((i & 4) != 0) {
            chartWidgetTypeSettings = updateWidgetTypeSettingsRequest.chart_widget_type_settings;
        }
        if ((i & 8) != 0) {
            ladderWidgetTypeSettings = updateWidgetTypeSettingsRequest.ladder_widget_type_settings;
        }
        if ((i & 16) != 0) {
            appType = updateWidgetTypeSettingsRequest.app_type;
        }
        if ((i & 32) != 0) {
            byteString = updateWidgetTypeSettingsRequest.unknownFields();
        }
        AppType appType2 = appType;
        ByteString byteString2 = byteString;
        return updateWidgetTypeSettingsRequest.copy(str, widgetType, chartWidgetTypeSettings, ladderWidgetTypeSettings, appType2, byteString2);
    }

    public final UpdateWidgetTypeSettingsRequest copy(String id, WidgetType widget_type, ChartWidgetTypeSettings chart_widget_type_settings, LadderWidgetTypeSettings ladder_widget_type_settings, AppType app_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(widget_type, "widget_type");
        Intrinsics.checkNotNullParameter(app_type, "app_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateWidgetTypeSettingsRequest(id, widget_type, chart_widget_type_settings, ladder_widget_type_settings, app_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateWidgetTypeSettingsRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateWidgetTypeSettingsRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.service.v1.UpdateWidgetTypeSettingsRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateWidgetTypeSettingsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (value.getWidget_type() != WidgetType.WIDGET_TYPE_UNSPECIFIED) {
                    size += WidgetType.ADAPTER.encodedSizeWithTag(2, value.getWidget_type());
                }
                int iEncodedSizeWithTag = size + ChartWidgetTypeSettings.ADAPTER.encodedSizeWithTag(3, value.getChart_widget_type_settings()) + LadderWidgetTypeSettings.ADAPTER.encodedSizeWithTag(5, value.getLadder_widget_type_settings());
                return value.getApp_type() != AppType.APP_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + AppType.ADAPTER.encodedSizeWithTag(4, value.getApp_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateWidgetTypeSettingsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getWidget_type() != WidgetType.WIDGET_TYPE_UNSPECIFIED) {
                    WidgetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getWidget_type());
                }
                if (value.getApp_type() != AppType.APP_TYPE_UNSPECIFIED) {
                    AppType.ADAPTER.encodeWithTag(writer, 4, (int) value.getApp_type());
                }
                ChartWidgetTypeSettings.ADAPTER.encodeWithTag(writer, 3, (int) value.getChart_widget_type_settings());
                LadderWidgetTypeSettings.ADAPTER.encodeWithTag(writer, 5, (int) value.getLadder_widget_type_settings());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateWidgetTypeSettingsRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                LadderWidgetTypeSettings.ADAPTER.encodeWithTag(writer, 5, (int) value.getLadder_widget_type_settings());
                ChartWidgetTypeSettings.ADAPTER.encodeWithTag(writer, 3, (int) value.getChart_widget_type_settings());
                if (value.getApp_type() != AppType.APP_TYPE_UNSPECIFIED) {
                    AppType.ADAPTER.encodeWithTag(writer, 4, (int) value.getApp_type());
                }
                if (value.getWidget_type() != WidgetType.WIDGET_TYPE_UNSPECIFIED) {
                    WidgetType.ADAPTER.encodeWithTag(writer, 2, (int) value.getWidget_type());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateWidgetTypeSettingsRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                WidgetType widgetTypeDecode = WidgetType.WIDGET_TYPE_UNSPECIFIED;
                AppType appType = AppType.APP_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ChartWidgetTypeSettings chartWidgetTypeSettingsDecode = null;
                LadderWidgetTypeSettings ladderWidgetTypeSettingsDecode = null;
                String strDecode = "";
                AppType appTypeDecode = appType;
                while (true) {
                    WidgetType widgetType = widgetTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new UpdateWidgetTypeSettingsRequest(strDecode, widgetType, chartWidgetTypeSettingsDecode, ladderWidgetTypeSettingsDecode, appTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                widgetTypeDecode = WidgetType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            chartWidgetTypeSettingsDecode = ChartWidgetTypeSettings.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            try {
                                appTypeDecode = AppType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 5) {
                            ladderWidgetTypeSettingsDecode = LadderWidgetTypeSettings.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateWidgetTypeSettingsRequest redact(UpdateWidgetTypeSettingsRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChartWidgetTypeSettings chart_widget_type_settings = value.getChart_widget_type_settings();
                ChartWidgetTypeSettings chartWidgetTypeSettingsRedact = chart_widget_type_settings != null ? ChartWidgetTypeSettings.ADAPTER.redact(chart_widget_type_settings) : null;
                LadderWidgetTypeSettings ladder_widget_type_settings = value.getLadder_widget_type_settings();
                return UpdateWidgetTypeSettingsRequest.copy$default(value, null, null, chartWidgetTypeSettingsRedact, ladder_widget_type_settings != null ? LadderWidgetTypeSettings.ADAPTER.redact(ladder_widget_type_settings) : null, null, ByteString.EMPTY, 19, null);
            }
        };
    }
}
