package microgram.contracts.equity_short_interest.proto.p488v1;

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
import rh_server_driven_ui.p531v1.ChartGroup;

/* compiled from: StreamShortInterestSectionResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponse;", "Lcom/squareup/wire/Message;", "", "title", "", "chart", "Lrh_server_driven_ui/v1/ChartGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ChartGroup;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getChart", "()Lrh_server_driven_ui/v1/ChartGroup;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "microgram.contracts.equity_short_interest.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamShortInterestSectionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamShortInterestSectionResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartGroup#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChartGroup chart;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public StreamShortInterestSectionResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29078newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ StreamShortInterestSectionResponse(String str, ChartGroup chartGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : chartGroup, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final ChartGroup getChart() {
        return this.chart;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamShortInterestSectionResponse(String title, ChartGroup chartGroup, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.chart = chartGroup;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29078newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamShortInterestSectionResponse)) {
            return false;
        }
        StreamShortInterestSectionResponse streamShortInterestSectionResponse = (StreamShortInterestSectionResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamShortInterestSectionResponse.unknownFields()) && Intrinsics.areEqual(this.title, streamShortInterestSectionResponse.title) && Intrinsics.areEqual(this.chart, streamShortInterestSectionResponse.chart);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37;
        ChartGroup chartGroup = this.chart;
        int iHashCode2 = iHashCode + (chartGroup != null ? chartGroup.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        ChartGroup chartGroup = this.chart;
        if (chartGroup != null) {
            arrayList.add("chart=" + chartGroup);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamShortInterestSectionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamShortInterestSectionResponse copy$default(StreamShortInterestSectionResponse streamShortInterestSectionResponse, String str, ChartGroup chartGroup, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamShortInterestSectionResponse.title;
        }
        if ((i & 2) != 0) {
            chartGroup = streamShortInterestSectionResponse.chart;
        }
        if ((i & 4) != 0) {
            byteString = streamShortInterestSectionResponse.unknownFields();
        }
        return streamShortInterestSectionResponse.copy(str, chartGroup, byteString);
    }

    public final StreamShortInterestSectionResponse copy(String title, ChartGroup chart, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamShortInterestSectionResponse(title, chart, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamShortInterestSectionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamShortInterestSectionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.equity_short_interest.proto.v1.StreamShortInterestSectionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamShortInterestSectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return value.getChart() != null ? size + ChartGroup.ADAPTER.encodedSizeWithTag(2, value.getChart()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamShortInterestSectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getChart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 2, (int) value.getChart());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamShortInterestSectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getChart() != null) {
                    ChartGroup.ADAPTER.encodeWithTag(writer, 2, (int) value.getChart());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamShortInterestSectionResponse redact(StreamShortInterestSectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ChartGroup chart = value.getChart();
                return StreamShortInterestSectionResponse.copy$default(value, null, chart != null ? ChartGroup.ADAPTER.redact(chart) : null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamShortInterestSectionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ChartGroup chartGroupDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamShortInterestSectionResponse(strDecode, chartGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        chartGroupDecode = ChartGroup.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
