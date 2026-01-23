package hippo.service.p470v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import hippo.model.p469v1.AppSettings;
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

/* compiled from: GetAppSettingsResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lhippo/service/v1/GetAppSettingsResponse;", "Lcom/squareup/wire/Message;", "", "app_settings", "Lhippo/model/v1/AppSettings;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/AppSettings;Lokio/ByteString;)V", "getApp_settings", "()Lhippo/model/v1/AppSettings;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetAppSettingsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAppSettingsResponse> ADAPTER;

    @WireField(adapter = "hippo.model.v1.AppSettings#ADAPTER", jsonName = "appSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AppSettings app_settings;

    /* JADX WARN: Multi-variable type inference failed */
    public GetAppSettingsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28264newBuilder();
    }

    public final AppSettings getApp_settings() {
        return this.app_settings;
    }

    public /* synthetic */ GetAppSettingsResponse(AppSettings appSettings, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appSettings, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppSettingsResponse(AppSettings appSettings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.app_settings = appSettings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28264newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAppSettingsResponse)) {
            return false;
        }
        GetAppSettingsResponse getAppSettingsResponse = (GetAppSettingsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAppSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.app_settings, getAppSettingsResponse.app_settings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AppSettings appSettings = this.app_settings;
        int iHashCode2 = iHashCode + (appSettings != null ? appSettings.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AppSettings appSettings = this.app_settings;
        if (appSettings != null) {
            arrayList.add("app_settings=" + appSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppSettingsResponse{", "}", 0, null, null, 56, null);
    }

    public final GetAppSettingsResponse copy(AppSettings app_settings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAppSettingsResponse(app_settings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAppSettingsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAppSettingsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.service.v1.GetAppSettingsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAppSettingsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getApp_settings() != null ? size + AppSettings.ADAPTER.encodedSizeWithTag(1, value.getApp_settings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAppSettingsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getApp_settings() != null) {
                    AppSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getApp_settings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAppSettingsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getApp_settings() != null) {
                    AppSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getApp_settings());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAppSettingsResponse redact(GetAppSettingsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AppSettings app_settings = value.getApp_settings();
                return value.copy(app_settings != null ? AppSettings.ADAPTER.redact(app_settings) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAppSettingsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                AppSettings appSettingsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAppSettingsResponse(appSettingsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        appSettingsDecode = AppSettings.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
