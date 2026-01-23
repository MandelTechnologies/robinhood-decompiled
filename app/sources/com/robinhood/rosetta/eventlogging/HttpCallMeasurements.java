package com.robinhood.rosetta.eventlogging;

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

/* compiled from: HttpCallMeasurements.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurements;", "Lcom/squareup/wire/Message;", "", "total_duration_ms", "", "request_duration_ms", "unknownFields", "Lokio/ByteString;", "<init>", "(JJLokio/ByteString;)V", "getTotal_duration_ms", "()J", "getRequest_duration_ms", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class HttpCallMeasurements extends Message {

    @JvmField
    public static final ProtoAdapter<HttpCallMeasurements> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "requestDurationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long request_duration_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "totalDurationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long total_duration_ms;

    public HttpCallMeasurements() {
        this(0L, 0L, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24305newBuilder();
    }

    public final long getTotal_duration_ms() {
        return this.total_duration_ms;
    }

    public final long getRequest_duration_ms() {
        return this.request_duration_ms;
    }

    public /* synthetic */ HttpCallMeasurements(long j, long j2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallMeasurements(long j, long j2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_duration_ms = j;
        this.request_duration_ms = j2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24305newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HttpCallMeasurements)) {
            return false;
        }
        HttpCallMeasurements httpCallMeasurements = (HttpCallMeasurements) other;
        return Intrinsics.areEqual(unknownFields(), httpCallMeasurements.unknownFields()) && this.total_duration_ms == httpCallMeasurements.total_duration_ms && this.request_duration_ms == httpCallMeasurements.request_duration_ms;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.total_duration_ms)) * 37) + Long.hashCode(this.request_duration_ms);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("total_duration_ms=" + this.total_duration_ms);
        arrayList.add("request_duration_ms=" + this.request_duration_ms);
        return CollectionsKt.joinToString$default(arrayList, ", ", "HttpCallMeasurements{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HttpCallMeasurements copy$default(HttpCallMeasurements httpCallMeasurements, long j, long j2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = httpCallMeasurements.total_duration_ms;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = httpCallMeasurements.request_duration_ms;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            byteString = httpCallMeasurements.unknownFields();
        }
        return httpCallMeasurements.copy(j3, j4, byteString);
    }

    public final HttpCallMeasurements copy(long total_duration_ms, long request_duration_ms, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HttpCallMeasurements(total_duration_ms, request_duration_ms, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpCallMeasurements.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HttpCallMeasurements>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.HttpCallMeasurements$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HttpCallMeasurements value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_duration_ms() != 0) {
                    size += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getTotal_duration_ms()));
                }
                return value.getRequest_duration_ms() != 0 ? size + ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getRequest_duration_ms())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HttpCallMeasurements value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_duration_ms() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getTotal_duration_ms()));
                }
                if (value.getRequest_duration_ms() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getRequest_duration_ms()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HttpCallMeasurements value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRequest_duration_ms() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getRequest_duration_ms()));
                }
                if (value.getTotal_duration_ms() != 0) {
                    ProtoAdapter.UINT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getTotal_duration_ms()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HttpCallMeasurements redact(HttpCallMeasurements value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return HttpCallMeasurements.copy$default(value, 0L, 0L, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HttpCallMeasurements decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new HttpCallMeasurements(jLongValue, jLongValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                    } else if (iNextTag == 2) {
                        jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
