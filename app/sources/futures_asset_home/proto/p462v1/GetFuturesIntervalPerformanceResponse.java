package futures_asset_home.proto.p462v1;

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

/* compiled from: GetFuturesIntervalPerformanceResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lfutures_asset_home/proto/v1/GetFuturesIntervalPerformanceResponse;", "Lcom/squareup/wire/Message;", "", "futures_interval_performance", "Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;Lokio/ByteString;)V", "getFutures_interval_performance", "()Lfutures_asset_home/proto/v1/FuturesIntervalPerformance;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetFuturesIntervalPerformanceResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFuturesIntervalPerformanceResponse> ADAPTER;

    @WireField(adapter = "futures_asset_home.proto.v1.FuturesIntervalPerformance#ADAPTER", jsonName = "futuresIntervalPerformance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final FuturesIntervalPerformance futures_interval_performance;

    /* JADX WARN: Multi-variable type inference failed */
    public GetFuturesIntervalPerformanceResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28096newBuilder();
    }

    public final FuturesIntervalPerformance getFutures_interval_performance() {
        return this.futures_interval_performance;
    }

    public /* synthetic */ GetFuturesIntervalPerformanceResponse(FuturesIntervalPerformance futuresIntervalPerformance, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresIntervalPerformance, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFuturesIntervalPerformanceResponse(FuturesIntervalPerformance futuresIntervalPerformance, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.futures_interval_performance = futuresIntervalPerformance;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28096newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFuturesIntervalPerformanceResponse)) {
            return false;
        }
        GetFuturesIntervalPerformanceResponse getFuturesIntervalPerformanceResponse = (GetFuturesIntervalPerformanceResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFuturesIntervalPerformanceResponse.unknownFields()) && Intrinsics.areEqual(this.futures_interval_performance, getFuturesIntervalPerformanceResponse.futures_interval_performance);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FuturesIntervalPerformance futuresIntervalPerformance = this.futures_interval_performance;
        int iHashCode2 = iHashCode + (futuresIntervalPerformance != null ? futuresIntervalPerformance.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FuturesIntervalPerformance futuresIntervalPerformance = this.futures_interval_performance;
        if (futuresIntervalPerformance != null) {
            arrayList.add("futures_interval_performance=" + futuresIntervalPerformance);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFuturesIntervalPerformanceResponse{", "}", 0, null, null, 56, null);
    }

    public final GetFuturesIntervalPerformanceResponse copy(FuturesIntervalPerformance futures_interval_performance, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFuturesIntervalPerformanceResponse(futures_interval_performance, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFuturesIntervalPerformanceResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFuturesIntervalPerformanceResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_asset_home.proto.v1.GetFuturesIntervalPerformanceResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFuturesIntervalPerformanceResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getFutures_interval_performance() != null ? size + FuturesIntervalPerformance.ADAPTER.encodedSizeWithTag(1, value.getFutures_interval_performance()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFuturesIntervalPerformanceResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFutures_interval_performance() != null) {
                    FuturesIntervalPerformance.ADAPTER.encodeWithTag(writer, 1, (int) value.getFutures_interval_performance());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFuturesIntervalPerformanceResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getFutures_interval_performance() != null) {
                    FuturesIntervalPerformance.ADAPTER.encodeWithTag(writer, 1, (int) value.getFutures_interval_performance());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesIntervalPerformanceResponse redact(GetFuturesIntervalPerformanceResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FuturesIntervalPerformance futures_interval_performance = value.getFutures_interval_performance();
                return value.copy(futures_interval_performance != null ? FuturesIntervalPerformance.ADAPTER.redact(futures_interval_performance) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFuturesIntervalPerformanceResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FuturesIntervalPerformance futuresIntervalPerformanceDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetFuturesIntervalPerformanceResponse(futuresIntervalPerformanceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        futuresIntervalPerformanceDecode = FuturesIntervalPerformance.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
