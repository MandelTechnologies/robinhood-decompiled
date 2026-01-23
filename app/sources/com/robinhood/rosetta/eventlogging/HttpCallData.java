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

/* compiled from: HttpCallData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "Lcom/squareup/wire/Message;", "", "call", "Lcom/robinhood/rosetta/eventlogging/HttpCall;", "measurements", "Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurements;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCall;Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurements;Lokio/ByteString;)V", "getCall", "()Lcom/robinhood/rosetta/eventlogging/HttpCall;", "getMeasurements", "()Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurements;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class HttpCallData extends Message {

    @JvmField
    public static final ProtoAdapter<HttpCallData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final HttpCall call;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCallMeasurements#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final HttpCallMeasurements measurements;

    public HttpCallData() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24300newBuilder();
    }

    public final HttpCall getCall() {
        return this.call;
    }

    public final HttpCallMeasurements getMeasurements() {
        return this.measurements;
    }

    public /* synthetic */ HttpCallData(HttpCall httpCall, HttpCallMeasurements httpCallMeasurements, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : httpCall, (i & 2) != 0 ? null : httpCallMeasurements, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallData(HttpCall httpCall, HttpCallMeasurements httpCallMeasurements, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.call = httpCall;
        this.measurements = httpCallMeasurements;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24300newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HttpCallData)) {
            return false;
        }
        HttpCallData httpCallData = (HttpCallData) other;
        return Intrinsics.areEqual(unknownFields(), httpCallData.unknownFields()) && Intrinsics.areEqual(this.call, httpCallData.call) && Intrinsics.areEqual(this.measurements, httpCallData.measurements);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        HttpCall httpCall = this.call;
        int iHashCode2 = (iHashCode + (httpCall != null ? httpCall.hashCode() : 0)) * 37;
        HttpCallMeasurements httpCallMeasurements = this.measurements;
        int iHashCode3 = iHashCode2 + (httpCallMeasurements != null ? httpCallMeasurements.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        HttpCall httpCall = this.call;
        if (httpCall != null) {
            arrayList.add("call=" + httpCall);
        }
        HttpCallMeasurements httpCallMeasurements = this.measurements;
        if (httpCallMeasurements != null) {
            arrayList.add("measurements=" + httpCallMeasurements);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HttpCallData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HttpCallData copy$default(HttpCallData httpCallData, HttpCall httpCall, HttpCallMeasurements httpCallMeasurements, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            httpCall = httpCallData.call;
        }
        if ((i & 2) != 0) {
            httpCallMeasurements = httpCallData.measurements;
        }
        if ((i & 4) != 0) {
            byteString = httpCallData.unknownFields();
        }
        return httpCallData.copy(httpCall, httpCallMeasurements, byteString);
    }

    public final HttpCallData copy(HttpCall call, HttpCallMeasurements measurements, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HttpCallData(call, measurements, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpCallData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HttpCallData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.HttpCallData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HttpCallData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCall() != null) {
                    size += HttpCall.ADAPTER.encodedSizeWithTag(1, value.getCall());
                }
                return value.getMeasurements() != null ? size + HttpCallMeasurements.ADAPTER.encodedSizeWithTag(2, value.getMeasurements()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HttpCallData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCall() != null) {
                    HttpCall.ADAPTER.encodeWithTag(writer, 1, (int) value.getCall());
                }
                if (value.getMeasurements() != null) {
                    HttpCallMeasurements.ADAPTER.encodeWithTag(writer, 2, (int) value.getMeasurements());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HttpCallData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getMeasurements() != null) {
                    HttpCallMeasurements.ADAPTER.encodeWithTag(writer, 2, (int) value.getMeasurements());
                }
                if (value.getCall() != null) {
                    HttpCall.ADAPTER.encodeWithTag(writer, 1, (int) value.getCall());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HttpCallData redact(HttpCallData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                HttpCall call = value.getCall();
                HttpCall httpCallRedact = call != null ? HttpCall.ADAPTER.redact(call) : null;
                HttpCallMeasurements measurements = value.getMeasurements();
                return value.copy(httpCallRedact, measurements != null ? HttpCallMeasurements.ADAPTER.redact(measurements) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HttpCallData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                HttpCall httpCallDecode = null;
                HttpCallMeasurements httpCallMeasurementsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new HttpCallData(httpCallDecode, httpCallMeasurementsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        httpCallDecode = HttpCall.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        httpCallMeasurementsDecode = HttpCallMeasurements.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
