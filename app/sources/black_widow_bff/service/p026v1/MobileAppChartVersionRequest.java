package black_widow_bff.service.p026v1;

import black_widow_bff.model.p025v1.AppChannel;
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

/* compiled from: MobileAppChartVersionRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionRequest;", "Lcom/squareup/wire/Message;", "", "app_channel", "Lblack_widow_bff/model/v1/AppChannel;", "client_cached_chart_version", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow_bff/model/v1/AppChannel;Ljava/lang/String;Lokio/ByteString;)V", "getApp_channel", "()Lblack_widow_bff/model/v1/AppChannel;", "getClient_cached_chart_version", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MobileAppChartVersionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<MobileAppChartVersionRequest> ADAPTER;

    @WireField(adapter = "black_widow_bff.model.v1.AppChannel#ADAPTER", jsonName = "appChannel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AppChannel app_channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE", jsonName = "clientCachedChartVersion", schemaIndex = 1, tag = 2)
    private final String client_cached_chart_version;

    public MobileAppChartVersionRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8688newBuilder();
    }

    public final AppChannel getApp_channel() {
        return this.app_channel;
    }

    public /* synthetic */ MobileAppChartVersionRequest(AppChannel appChannel, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AppChannel.APP_CHANNEL_UNSPECIFIED : appChannel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getClient_cached_chart_version() {
        return this.client_cached_chart_version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileAppChartVersionRequest(AppChannel app_channel, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(app_channel, "app_channel");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.app_channel = app_channel;
        this.client_cached_chart_version = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8688newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MobileAppChartVersionRequest)) {
            return false;
        }
        MobileAppChartVersionRequest mobileAppChartVersionRequest = (MobileAppChartVersionRequest) other;
        return Intrinsics.areEqual(unknownFields(), mobileAppChartVersionRequest.unknownFields()) && this.app_channel == mobileAppChartVersionRequest.app_channel && Intrinsics.areEqual(this.client_cached_chart_version, mobileAppChartVersionRequest.client_cached_chart_version);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.app_channel.hashCode()) * 37;
        String str = this.client_cached_chart_version;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("app_channel=" + this.app_channel);
        String str = this.client_cached_chart_version;
        if (str != null) {
            arrayList.add("client_cached_chart_version=" + str);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MobileAppChartVersionRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MobileAppChartVersionRequest copy$default(MobileAppChartVersionRequest mobileAppChartVersionRequest, AppChannel appChannel, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            appChannel = mobileAppChartVersionRequest.app_channel;
        }
        if ((i & 2) != 0) {
            str = mobileAppChartVersionRequest.client_cached_chart_version;
        }
        if ((i & 4) != 0) {
            byteString = mobileAppChartVersionRequest.unknownFields();
        }
        return mobileAppChartVersionRequest.copy(appChannel, str, byteString);
    }

    public final MobileAppChartVersionRequest copy(AppChannel app_channel, String client_cached_chart_version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(app_channel, "app_channel");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MobileAppChartVersionRequest(app_channel, client_cached_chart_version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MobileAppChartVersionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MobileAppChartVersionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow_bff.service.v1.MobileAppChartVersionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MobileAppChartVersionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getApp_channel() != AppChannel.APP_CHANNEL_UNSPECIFIED) {
                    size += AppChannel.ADAPTER.encodedSizeWithTag(1, value.getApp_channel());
                }
                return value.getClient_cached_chart_version() != null ? size + ProtoAdapter.STRING_VALUE.encodedSizeWithTag(2, value.getClient_cached_chart_version()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MobileAppChartVersionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getApp_channel() != AppChannel.APP_CHANNEL_UNSPECIFIED) {
                    AppChannel.ADAPTER.encodeWithTag(writer, 1, (int) value.getApp_channel());
                }
                if (value.getClient_cached_chart_version() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 2, (int) value.getClient_cached_chart_version());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MobileAppChartVersionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getClient_cached_chart_version() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 2, (int) value.getClient_cached_chart_version());
                }
                if (value.getApp_channel() != AppChannel.APP_CHANNEL_UNSPECIFIED) {
                    AppChannel.ADAPTER.encodeWithTag(writer, 1, (int) value.getApp_channel());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MobileAppChartVersionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AppChannel appChannelDecode = AppChannel.APP_CHANNEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MobileAppChartVersionRequest(appChannelDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            appChannelDecode = AppChannel.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING_VALUE.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MobileAppChartVersionRequest redact(MobileAppChartVersionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String client_cached_chart_version = value.getClient_cached_chart_version();
                return MobileAppChartVersionRequest.copy$default(value, null, client_cached_chart_version != null ? ProtoAdapter.STRING_VALUE.redact(client_cached_chart_version) : null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
