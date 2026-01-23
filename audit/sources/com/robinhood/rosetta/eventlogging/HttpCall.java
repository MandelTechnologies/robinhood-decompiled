package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.HttpCall;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: HttpCall.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007!\"#$%&'B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall;", "Lcom/squareup/wire/Message;", "", "outcome", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "request", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;", "response", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;", "error", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;Lokio/ByteString;)V", "getOutcome", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "getRequest", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;", "getResponse", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;", "getError", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Outcome", "Request", "Response", "Error", "Method", "Protocol", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class HttpCall extends Message {

    @JvmField
    public static final ProtoAdapter<HttpCall> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Error#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final Error error;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Outcome#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final Outcome outcome;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Request#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final Request request;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Response#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final Response response;

    public HttpCall() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24296newBuilder();
    }

    public final Outcome getOutcome() {
        return this.outcome;
    }

    public /* synthetic */ HttpCall(Outcome outcome, Request request, Response response, Error error, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Outcome.OUTCOME_UNSPECIFIED : outcome, (i & 2) != 0 ? null : request, (i & 4) != 0 ? null : response, (i & 8) != 0 ? null : error, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Request getRequest() {
        return this.request;
    }

    public final Response getResponse() {
        return this.response;
    }

    public final Error getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCall(Outcome outcome, Request request, Response response, Error error, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.outcome = outcome;
        this.request = request;
        this.response = response;
        this.error = error;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24296newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HttpCall)) {
            return false;
        }
        HttpCall httpCall = (HttpCall) other;
        return Intrinsics.areEqual(unknownFields(), httpCall.unknownFields()) && this.outcome == httpCall.outcome && Intrinsics.areEqual(this.request, httpCall.request) && Intrinsics.areEqual(this.response, httpCall.response) && Intrinsics.areEqual(this.error, httpCall.error);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.outcome.hashCode()) * 37;
        Request request = this.request;
        int iHashCode2 = (iHashCode + (request != null ? request.hashCode() : 0)) * 37;
        Response response = this.response;
        int iHashCode3 = (iHashCode2 + (response != null ? response.hashCode() : 0)) * 37;
        Error error = this.error;
        int iHashCode4 = iHashCode3 + (error != null ? error.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("outcome=" + this.outcome);
        Request request = this.request;
        if (request != null) {
            arrayList.add("request=" + request);
        }
        Response response = this.response;
        if (response != null) {
            arrayList.add("response=" + response);
        }
        Error error = this.error;
        if (error != null) {
            arrayList.add("error=" + error);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HttpCall{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HttpCall copy$default(HttpCall httpCall, Outcome outcome, Request request, Response response, Error error, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            outcome = httpCall.outcome;
        }
        if ((i & 2) != 0) {
            request = httpCall.request;
        }
        if ((i & 4) != 0) {
            response = httpCall.response;
        }
        if ((i & 8) != 0) {
            error = httpCall.error;
        }
        if ((i & 16) != 0) {
            byteString = httpCall.unknownFields();
        }
        ByteString byteString2 = byteString;
        Response response2 = response;
        return httpCall.copy(outcome, request, response2, error, byteString2);
    }

    public final HttpCall copy(Outcome outcome, Request request, Response response, Error error, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HttpCall(outcome, request, response, error, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HttpCall.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HttpCall>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HttpCall value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOutcome() != HttpCall.Outcome.OUTCOME_UNSPECIFIED) {
                    size += HttpCall.Outcome.ADAPTER.encodedSizeWithTag(2, value.getOutcome());
                }
                if (value.getRequest() != null) {
                    size += HttpCall.Request.ADAPTER.encodedSizeWithTag(3, value.getRequest());
                }
                if (value.getResponse() != null) {
                    size += HttpCall.Response.ADAPTER.encodedSizeWithTag(4, value.getResponse());
                }
                return value.getError() != null ? size + HttpCall.Error.ADAPTER.encodedSizeWithTag(5, value.getError()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HttpCall value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOutcome() != HttpCall.Outcome.OUTCOME_UNSPECIFIED) {
                    HttpCall.Outcome.ADAPTER.encodeWithTag(writer, 2, (int) value.getOutcome());
                }
                if (value.getRequest() != null) {
                    HttpCall.Request.ADAPTER.encodeWithTag(writer, 3, (int) value.getRequest());
                }
                if (value.getResponse() != null) {
                    HttpCall.Response.ADAPTER.encodeWithTag(writer, 4, (int) value.getResponse());
                }
                if (value.getError() != null) {
                    HttpCall.Error.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HttpCall value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getError() != null) {
                    HttpCall.Error.ADAPTER.encodeWithTag(writer, 5, (int) value.getError());
                }
                if (value.getResponse() != null) {
                    HttpCall.Response.ADAPTER.encodeWithTag(writer, 4, (int) value.getResponse());
                }
                if (value.getRequest() != null) {
                    HttpCall.Request.ADAPTER.encodeWithTag(writer, 3, (int) value.getRequest());
                }
                if (value.getOutcome() != HttpCall.Outcome.OUTCOME_UNSPECIFIED) {
                    HttpCall.Outcome.ADAPTER.encodeWithTag(writer, 2, (int) value.getOutcome());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HttpCall decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                HttpCall.Outcome outcomeDecode = HttpCall.Outcome.OUTCOME_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                HttpCall.Request requestDecode = null;
                HttpCall.Response responseDecode = null;
                HttpCall.Error errorDecode = null;
                while (true) {
                    HttpCall.Outcome outcome = outcomeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new HttpCall(outcome, requestDecode, responseDecode, errorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 2) {
                            try {
                                outcomeDecode = HttpCall.Outcome.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            requestDecode = HttpCall.Request.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            responseDecode = HttpCall.Response.ADAPTER.decode(reader);
                        } else if (iNextTag == 5) {
                            errorDecode = HttpCall.Error.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HttpCall redact(HttpCall value) {
                Intrinsics.checkNotNullParameter(value, "value");
                HttpCall.Request request = value.getRequest();
                HttpCall.Request requestRedact = request != null ? HttpCall.Request.ADAPTER.redact(request) : null;
                HttpCall.Response response = value.getResponse();
                HttpCall.Response responseRedact = response != null ? HttpCall.Response.ADAPTER.redact(response) : null;
                HttpCall.Error error = value.getError();
                return HttpCall.copy$default(value, null, requestRedact, responseRedact, error != null ? HttpCall.Error.ADAPTER.redact(error) : null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpCall.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OUTCOME_UNSPECIFIED", "COMPLETED", "FAILED", "CANCELED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Outcome implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Outcome[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Outcome> ADAPTER;
        public static final Outcome CANCELED;
        public static final Outcome COMPLETED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Outcome FAILED;
        public static final Outcome OUTCOME_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Outcome[] $values() {
            return new Outcome[]{OUTCOME_UNSPECIFIED, COMPLETED, FAILED, CANCELED};
        }

        @JvmStatic
        public static final Outcome fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Outcome> getEntries() {
            return $ENTRIES;
        }

        private Outcome(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Outcome outcome = new Outcome("OUTCOME_UNSPECIFIED", 0, 0);
            OUTCOME_UNSPECIFIED = outcome;
            COMPLETED = new Outcome("COMPLETED", 1, 1);
            FAILED = new Outcome("FAILED", 2, 2);
            CANCELED = new Outcome("CANCELED", 3, 3);
            Outcome[] outcomeArr$values = $values();
            $VALUES = outcomeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(outcomeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Outcome.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Outcome>(orCreateKotlinClass, syntax, outcome) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Outcome$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public HttpCall.Outcome fromValue(int value) {
                    return HttpCall.Outcome.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: HttpCall.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Outcome fromValue(int value) {
                if (value == 0) {
                    return Outcome.OUTCOME_UNSPECIFIED;
                }
                if (value == 1) {
                    return Outcome.COMPLETED;
                }
                if (value == 2) {
                    return Outcome.FAILED;
                }
                if (value != 3) {
                    return null;
                }
                return Outcome.CANCELED;
            }
        }

        public static Outcome valueOf(String str) {
            return (Outcome) Enum.valueOf(Outcome.class, str);
        }

        public static Outcome[] values() {
            return (Outcome[]) $VALUES.clone();
        }
    }

    /* compiled from: HttpCall.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;", "Lcom/squareup/wire/Message;", "", "method", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;Ljava/lang/String;Lokio/ByteString;)V", "getMethod", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "getUrl", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Request extends Message {

        @JvmField
        public static final ProtoAdapter<Request> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Method#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Method method;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String url;

        public Request() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24298newBuilder();
        }

        public final Method getMethod() {
            return this.method;
        }

        public /* synthetic */ Request(Method method, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Method.METHOD_UNSPECIFIED : method, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(Method method, String url, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.method = method;
            this.url = url;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24298newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(unknownFields(), request.unknownFields()) && this.method == request.method && Intrinsics.areEqual(this.url, request.url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.method.hashCode()) * 37) + this.url.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("method=" + this.method);
            arrayList.add("url=" + Internal.sanitize(this.url));
            return CollectionsKt.joinToString$default(arrayList, ", ", "Request{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Request copy$default(Request request, Method method, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                method = request.method;
            }
            if ((i & 2) != 0) {
                str = request.url;
            }
            if ((i & 4) != 0) {
                byteString = request.unknownFields();
            }
            return request.copy(method, str, byteString);
        }

        public final Request copy(Method method, String url, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Request(method, url, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Request.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Request>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Request$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(HttpCall.Request value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getMethod() != HttpCall.Method.METHOD_UNSPECIFIED) {
                        size += HttpCall.Method.ADAPTER.encodedSizeWithTag(1, value.getMethod());
                    }
                    return !Intrinsics.areEqual(value.getUrl(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUrl()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, HttpCall.Request value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getMethod() != HttpCall.Method.METHOD_UNSPECIFIED) {
                        HttpCall.Method.ADAPTER.encodeWithTag(writer, 1, (int) value.getMethod());
                    }
                    if (!Intrinsics.areEqual(value.getUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, HttpCall.Request value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getUrl(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUrl());
                    }
                    if (value.getMethod() != HttpCall.Method.METHOD_UNSPECIFIED) {
                        HttpCall.Method.ADAPTER.encodeWithTag(writer, 1, (int) value.getMethod());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public HttpCall.Request decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    HttpCall.Method methodDecode = HttpCall.Method.METHOD_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new HttpCall.Request(methodDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                methodDecode = HttpCall.Method.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public HttpCall.Request redact(HttpCall.Request value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return HttpCall.Request.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: HttpCall.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;", "Lcom/squareup/wire/Message;", "", "source", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "protocol", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "message", "", "code", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;Ljava/lang/String;ILokio/ByteString;)V", "getSource", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "getProtocol", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "getMessage", "()Ljava/lang/String;", "getCode", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Source", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Response extends Message {

        @JvmField
        public static final ProtoAdapter<Response> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final int code;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String message;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Protocol#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Protocol protocol;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Response$Source#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Source source;

        public Response() {
            this(null, null, null, 0, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24299newBuilder();
        }

        public final Source getSource() {
            return this.source;
        }

        public /* synthetic */ Response(Source source, Protocol protocol, String str, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Source.SOURCE_UNSPECIFIED : source, (i2 & 2) != 0 ? Protocol.PROTOCOL_UNSPECIFIED : protocol, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Protocol getProtocol() {
            return this.protocol;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getCode() {
            return this.code;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Response(Source source, Protocol protocol, String message, int i, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.source = source;
            this.protocol = protocol;
            this.message = message;
            this.code = i;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24299newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(unknownFields(), response.unknownFields()) && this.source == response.source && this.protocol == response.protocol && Intrinsics.areEqual(this.message, response.message) && this.code == response.code;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + this.source.hashCode()) * 37) + this.protocol.hashCode()) * 37) + this.message.hashCode()) * 37) + Integer.hashCode(this.code);
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("source=" + this.source);
            arrayList.add("protocol=" + this.protocol);
            arrayList.add("message=" + Internal.sanitize(this.message));
            arrayList.add("code=" + this.code);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Response{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Response copy$default(Response response, Source source, Protocol protocol, String str, int i, ByteString byteString, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                source = response.source;
            }
            if ((i2 & 2) != 0) {
                protocol = response.protocol;
            }
            if ((i2 & 4) != 0) {
                str = response.message;
            }
            if ((i2 & 8) != 0) {
                i = response.code;
            }
            if ((i2 & 16) != 0) {
                byteString = response.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str2 = str;
            return response.copy(source, protocol, str2, i, byteString2);
        }

        public final Response copy(Source source, Protocol protocol, String message, int code, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Response(source, protocol, message, code, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Response.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Response>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Response$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(HttpCall.Response value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getSource() != HttpCall.Response.Source.SOURCE_UNSPECIFIED) {
                        size += HttpCall.Response.Source.ADAPTER.encodedSizeWithTag(1, value.getSource());
                    }
                    if (value.getProtocol() != HttpCall.Protocol.PROTOCOL_UNSPECIFIED) {
                        size += HttpCall.Protocol.ADAPTER.encodedSizeWithTag(2, value.getProtocol());
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMessage());
                    }
                    return value.getCode() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getCode())) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, HttpCall.Response value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getSource() != HttpCall.Response.Source.SOURCE_UNSPECIFIED) {
                        HttpCall.Response.Source.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource());
                    }
                    if (value.getProtocol() != HttpCall.Protocol.PROTOCOL_UNSPECIFIED) {
                        HttpCall.Protocol.ADAPTER.encodeWithTag(writer, 2, (int) value.getProtocol());
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage());
                    }
                    if (value.getCode() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCode()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, HttpCall.Response value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getCode() != 0) {
                        ProtoAdapter.INT32.encodeWithTag(writer, 4, (int) Integer.valueOf(value.getCode()));
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getMessage());
                    }
                    if (value.getProtocol() != HttpCall.Protocol.PROTOCOL_UNSPECIFIED) {
                        HttpCall.Protocol.ADAPTER.encodeWithTag(writer, 2, (int) value.getProtocol());
                    }
                    if (value.getSource() != HttpCall.Response.Source.SOURCE_UNSPECIFIED) {
                        HttpCall.Response.Source.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public HttpCall.Response decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    HttpCall.Response.Source sourceDecode = HttpCall.Response.Source.SOURCE_UNSPECIFIED;
                    HttpCall.Protocol protocol = HttpCall.Protocol.PROTOCOL_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    int iIntValue = 0;
                    String strDecode = "";
                    HttpCall.Protocol protocolDecode = protocol;
                    while (true) {
                        HttpCall.Response.Source source = sourceDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new HttpCall.Response(source, protocolDecode, strDecode, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    sourceDecode = HttpCall.Response.Source.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                try {
                                    protocolDecode = HttpCall.Protocol.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public HttpCall.Response redact(HttpCall.Response value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return HttpCall.Response.copy$default(value, null, null, null, 0, ByteString.EMPTY, 15, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HttpCall.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SOURCE_UNSPECIFIED", "CACHE_ONLY", "NETWORK_ONLY", "CACHE_AND_NETWORK", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Source implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Source> ADAPTER;
            public static final Source CACHE_AND_NETWORK;
            public static final Source CACHE_ONLY;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Source NETWORK_ONLY;
            public static final Source SOURCE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Source[] $values() {
                return new Source[]{SOURCE_UNSPECIFIED, CACHE_ONLY, NETWORK_ONLY, CACHE_AND_NETWORK};
            }

            @JvmStatic
            public static final Source fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Source> getEntries() {
                return $ENTRIES;
            }

            private Source(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Source source = new Source("SOURCE_UNSPECIFIED", 0, 0);
                SOURCE_UNSPECIFIED = source;
                CACHE_ONLY = new Source("CACHE_ONLY", 1, 1);
                NETWORK_ONLY = new Source("NETWORK_ONLY", 2, 2);
                CACHE_AND_NETWORK = new Source("CACHE_AND_NETWORK", 3, 3);
                Source[] sourceArr$values = $values();
                $VALUES = sourceArr$values;
                $ENTRIES = EnumEntries2.enumEntries(sourceArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Source.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Source>(orCreateKotlinClass, syntax, source) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Response$Source$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public HttpCall.Response.Source fromValue(int value) {
                        return HttpCall.Response.Source.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: HttpCall.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Source fromValue(int value) {
                    if (value == 0) {
                        return Source.SOURCE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Source.CACHE_ONLY;
                    }
                    if (value == 2) {
                        return Source.NETWORK_ONLY;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Source.CACHE_AND_NETWORK;
                }
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: HttpCall.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;", "Lcom/squareup/wire/Message;", "", "type", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;Ljava/lang/String;Lokio/ByteString;)V", "getType", "()Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "getMessage", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends Message {

        @JvmField
        public static final ProtoAdapter<Error> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String message;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCall$Error$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Type type;

        public Error() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24297newBuilder();
        }

        public final Type getType() {
            return this.type;
        }

        public /* synthetic */ Error(Type type2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getMessage() {
            return this.message;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Type type2, String message, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.type = type2;
            this.message = message;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24297newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && this.type == error.type && Intrinsics.areEqual(this.message, error.message);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.message.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("type=" + this.type);
            arrayList.add("message=" + Internal.sanitize(this.message));
            return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Error copy$default(Error error, Type type2, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = error.type;
            }
            if ((i & 2) != 0) {
                str = error.message;
            }
            if ((i & 4) != 0) {
                byteString = error.unknownFields();
            }
            return error.copy(type2, str, byteString);
        }

        public final Error copy(Type type2, String message, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Error(type2, message, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Error.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Error>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Error$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(HttpCall.Error value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getType() != HttpCall.Error.Type.TYPE_UNSPECIFIED) {
                        size += HttpCall.Error.Type.ADAPTER.encodedSizeWithTag(1, value.getType());
                    }
                    return !Intrinsics.areEqual(value.getMessage(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, HttpCall.Error value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getType() != HttpCall.Error.Type.TYPE_UNSPECIFIED) {
                        HttpCall.Error.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, HttpCall.Error value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                    }
                    if (value.getType() != HttpCall.Error.Type.TYPE_UNSPECIFIED) {
                        HttpCall.Error.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public HttpCall.Error decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    HttpCall.Error.Type typeDecode = HttpCall.Error.Type.TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new HttpCall.Error(typeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                typeDecode = HttpCall.Error.Type.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public HttpCall.Error redact(HttpCall.Error value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return HttpCall.Error.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HttpCall.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "GENERAL_IO", "GENERAL_TIMEOUT", "UNKNOWN_HOST", "CONNECT_FAILURE", "NO_ROUTE_TO_HOST", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Type> ADAPTER;
            public static final Type CONNECT_FAILURE;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Type GENERAL_IO;
            public static final Type GENERAL_TIMEOUT;
            public static final Type NO_ROUTE_TO_HOST;
            public static final Type TYPE_UNSPECIFIED;
            public static final Type UNKNOWN_HOST;
            private final int value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TYPE_UNSPECIFIED, GENERAL_IO, GENERAL_TIMEOUT, UNKNOWN_HOST, CONNECT_FAILURE, NO_ROUTE_TO_HOST};
            }

            @JvmStatic
            public static final Type fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
                TYPE_UNSPECIFIED = type2;
                GENERAL_IO = new Type("GENERAL_IO", 1, 1);
                GENERAL_TIMEOUT = new Type("GENERAL_TIMEOUT", 2, 2);
                UNKNOWN_HOST = new Type("UNKNOWN_HOST", 3, 3);
                CONNECT_FAILURE = new Type("CONNECT_FAILURE", 4, 4);
                NO_ROUTE_TO_HOST = new Type("NO_ROUTE_TO_HOST", 5, 5);
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Error$Type$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public HttpCall.Error.Type fromValue(int value) {
                        return HttpCall.Error.Type.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: HttpCall.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Type fromValue(int value) {
                    if (value == 0) {
                        return Type.TYPE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Type.GENERAL_IO;
                    }
                    if (value == 2) {
                        return Type.GENERAL_TIMEOUT;
                    }
                    if (value == 3) {
                        return Type.UNKNOWN_HOST;
                    }
                    if (value == 4) {
                        return Type.CONNECT_FAILURE;
                    }
                    if (value != 5) {
                        return null;
                    }
                    return Type.NO_ROUTE_TO_HOST;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpCall.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "METHOD_UNSPECIFIED", "GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "CONNECT", "TRACE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Method implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Method> ADAPTER;
        public static final Method CONNECT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Method DELETE;
        public static final Method GET;
        public static final Method HEAD;
        public static final Method METHOD_UNSPECIFIED;
        public static final Method OPTIONS;
        public static final Method PATCH;
        public static final Method POST;
        public static final Method PUT;
        public static final Method TRACE;
        private final int value;

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{METHOD_UNSPECIFIED, GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, CONNECT, TRACE};
        }

        @JvmStatic
        public static final Method fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Method> getEntries() {
            return $ENTRIES;
        }

        private Method(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Method method = new Method("METHOD_UNSPECIFIED", 0, 0);
            METHOD_UNSPECIFIED = method;
            GET = new Method("GET", 1, 1);
            POST = new Method("POST", 2, 2);
            PUT = new Method("PUT", 3, 3);
            PATCH = new Method("PATCH", 4, 4);
            DELETE = new Method("DELETE", 5, 5);
            OPTIONS = new Method("OPTIONS", 6, 6);
            HEAD = new Method("HEAD", 7, 7);
            CONNECT = new Method("CONNECT", 8, 8);
            TRACE = new Method("TRACE", 9, 9);
            Method[] methodArr$values = $values();
            $VALUES = methodArr$values;
            $ENTRIES = EnumEntries2.enumEntries(methodArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Method.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Method>(orCreateKotlinClass, syntax, method) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Method$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public HttpCall.Method fromValue(int value) {
                    return HttpCall.Method.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: HttpCall.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Method$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Method fromValue(int value) {
                switch (value) {
                    case 0:
                        return Method.METHOD_UNSPECIFIED;
                    case 1:
                        return Method.GET;
                    case 2:
                        return Method.POST;
                    case 3:
                        return Method.PUT;
                    case 4:
                        return Method.PATCH;
                    case 5:
                        return Method.DELETE;
                    case 6:
                        return Method.OPTIONS;
                    case 7:
                        return Method.HEAD;
                    case 8:
                        return Method.CONNECT;
                    case 9:
                        return Method.TRACE;
                    default:
                        return null;
                }
            }
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpCall.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PROTOCOL_UNSPECIFIED", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Protocol implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Protocol[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Protocol> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Protocol H2_PRIOR_KNOWLEDGE;
        public static final Protocol HTTP_1_0;
        public static final Protocol HTTP_1_1;
        public static final Protocol HTTP_2;
        public static final Protocol PROTOCOL_UNSPECIFIED;
        public static final Protocol QUIC;
        public static final Protocol SPDY_3;
        private final int value;

        private static final /* synthetic */ Protocol[] $values() {
            return new Protocol[]{PROTOCOL_UNSPECIFIED, HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC};
        }

        @JvmStatic
        public static final Protocol fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Protocol> getEntries() {
            return $ENTRIES;
        }

        private Protocol(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Protocol protocol = new Protocol("PROTOCOL_UNSPECIFIED", 0, 0);
            PROTOCOL_UNSPECIFIED = protocol;
            HTTP_1_0 = new Protocol("HTTP_1_0", 1, 1);
            HTTP_1_1 = new Protocol("HTTP_1_1", 2, 2);
            SPDY_3 = new Protocol("SPDY_3", 3, 3);
            HTTP_2 = new Protocol("HTTP_2", 4, 4);
            H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 5, 5);
            QUIC = new Protocol("QUIC", 6, 6);
            Protocol[] protocolArr$values = $values();
            $VALUES = protocolArr$values;
            $ENTRIES = EnumEntries2.enumEntries(protocolArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Protocol.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Protocol>(orCreateKotlinClass, syntax, protocol) { // from class: com.robinhood.rosetta.eventlogging.HttpCall$Protocol$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public HttpCall.Protocol fromValue(int value) {
                    return HttpCall.Protocol.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: HttpCall.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Protocol fromValue(int value) {
                switch (value) {
                    case 0:
                        return Protocol.PROTOCOL_UNSPECIFIED;
                    case 1:
                        return Protocol.HTTP_1_0;
                    case 2:
                        return Protocol.HTTP_1_1;
                    case 3:
                        return Protocol.SPDY_3;
                    case 4:
                        return Protocol.HTTP_2;
                    case 5:
                        return Protocol.H2_PRIOR_KNOWLEDGE;
                    case 6:
                        return Protocol.QUIC;
                    default:
                        return null;
                }
            }
        }

        public static Protocol valueOf(String str) {
            return (Protocol) Enum.valueOf(Protocol.class, str);
        }

        public static Protocol[] values() {
            return (Protocol[]) $VALUES.clone();
        }
    }
}
