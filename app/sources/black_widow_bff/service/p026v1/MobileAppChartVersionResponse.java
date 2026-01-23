package black_widow_bff.service.p026v1;

import black_widow_bff.model.p025v1.MobileAppChartUpdateAction;
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

/* compiled from: MobileAppChartVersionResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lblack_widow_bff/service/v1/MobileAppChartVersionResponse;", "Lcom/squareup/wire/Message;", "", "action", "Lblack_widow_bff/model/v1/MobileAppChartUpdateAction;", "chart_url", "", "chart_version", "unknownFields", "Lokio/ByteString;", "<init>", "(Lblack_widow_bff/model/v1/MobileAppChartUpdateAction;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAction", "()Lblack_widow_bff/model/v1/MobileAppChartUpdateAction;", "getChart_url", "()Ljava/lang/String;", "getChart_version", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "black_widow_bff.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MobileAppChartVersionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<MobileAppChartVersionResponse> ADAPTER;

    @WireField(adapter = "black_widow_bff.model.v1.MobileAppChartUpdateAction#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MobileAppChartUpdateAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chartUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String chart_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "chartVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String chart_version;

    public MobileAppChartVersionResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8690newBuilder();
    }

    public final MobileAppChartUpdateAction getAction() {
        return this.action;
    }

    public /* synthetic */ MobileAppChartVersionResponse(MobileAppChartUpdateAction mobileAppChartUpdateAction, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MobileAppChartUpdateAction.MOBILE_APP_CHART_UPDATE_ACTION_UNSPECIFIED : mobileAppChartUpdateAction, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getChart_url() {
        return this.chart_url;
    }

    public final String getChart_version() {
        return this.chart_version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileAppChartVersionResponse(MobileAppChartUpdateAction action, String chart_url, String chart_version, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chart_url, "chart_url");
        Intrinsics.checkNotNullParameter(chart_version, "chart_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.action = action;
        this.chart_url = chart_url;
        this.chart_version = chart_version;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8690newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MobileAppChartVersionResponse)) {
            return false;
        }
        MobileAppChartVersionResponse mobileAppChartVersionResponse = (MobileAppChartVersionResponse) other;
        return Intrinsics.areEqual(unknownFields(), mobileAppChartVersionResponse.unknownFields()) && this.action == mobileAppChartVersionResponse.action && Intrinsics.areEqual(this.chart_url, mobileAppChartVersionResponse.chart_url) && Intrinsics.areEqual(this.chart_version, mobileAppChartVersionResponse.chart_version);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.action.hashCode()) * 37) + this.chart_url.hashCode()) * 37) + this.chart_version.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("action=" + this.action);
        arrayList.add("chart_url=" + Internal.sanitize(this.chart_url));
        arrayList.add("chart_version=" + Internal.sanitize(this.chart_version));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MobileAppChartVersionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MobileAppChartVersionResponse copy$default(MobileAppChartVersionResponse mobileAppChartVersionResponse, MobileAppChartUpdateAction mobileAppChartUpdateAction, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            mobileAppChartUpdateAction = mobileAppChartVersionResponse.action;
        }
        if ((i & 2) != 0) {
            str = mobileAppChartVersionResponse.chart_url;
        }
        if ((i & 4) != 0) {
            str2 = mobileAppChartVersionResponse.chart_version;
        }
        if ((i & 8) != 0) {
            byteString = mobileAppChartVersionResponse.unknownFields();
        }
        return mobileAppChartVersionResponse.copy(mobileAppChartUpdateAction, str, str2, byteString);
    }

    public final MobileAppChartVersionResponse copy(MobileAppChartUpdateAction action, String chart_url, String chart_version, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(chart_url, "chart_url");
        Intrinsics.checkNotNullParameter(chart_version, "chart_version");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MobileAppChartVersionResponse(action, chart_url, chart_version, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MobileAppChartVersionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MobileAppChartVersionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: black_widow_bff.service.v1.MobileAppChartVersionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MobileAppChartVersionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getAction() != MobileAppChartUpdateAction.MOBILE_APP_CHART_UPDATE_ACTION_UNSPECIFIED) {
                    size += MobileAppChartUpdateAction.ADAPTER.encodedSizeWithTag(1, value.getAction());
                }
                if (!Intrinsics.areEqual(value.getChart_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getChart_url());
                }
                return !Intrinsics.areEqual(value.getChart_version(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getChart_version()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MobileAppChartVersionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getAction() != MobileAppChartUpdateAction.MOBILE_APP_CHART_UPDATE_ACTION_UNSPECIFIED) {
                    MobileAppChartUpdateAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
                if (!Intrinsics.areEqual(value.getChart_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getChart_url());
                }
                if (!Intrinsics.areEqual(value.getChart_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getChart_version());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MobileAppChartVersionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getChart_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getChart_version());
                }
                if (!Intrinsics.areEqual(value.getChart_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getChart_url());
                }
                if (value.getAction() != MobileAppChartUpdateAction.MOBILE_APP_CHART_UPDATE_ACTION_UNSPECIFIED) {
                    MobileAppChartUpdateAction.ADAPTER.encodeWithTag(writer, 1, (int) value.getAction());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MobileAppChartVersionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MobileAppChartUpdateAction mobileAppChartUpdateActionDecode = MobileAppChartUpdateAction.MOBILE_APP_CHART_UPDATE_ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MobileAppChartVersionResponse(mobileAppChartUpdateActionDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            mobileAppChartUpdateActionDecode = MobileAppChartUpdateAction.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MobileAppChartVersionResponse redact(MobileAppChartVersionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MobileAppChartVersionResponse.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
