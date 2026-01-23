package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent;
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
import p479j$.time.Instant;

/* compiled from: ClientApolloErrorEvent.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003234B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u001fR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b1\u0010\u001f¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "Lcom/squareup/wire/Message;", "", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "platform", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "error_type", "", "job_url", "name", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "context", "request", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lcom/robinhood/rosetta/eventlogging/ClientPlatform;Lj$/time/Instant;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent;", "Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/ClientPlatform;", "Lj$/time/Instant;", "getTimestamp", "()Lj$/time/Instant;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "Ljava/lang/String;", "getJob_url", "getName", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "getRequest", "Companion", "ErrorType", "Context", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ClientApolloErrorEvent extends Message {

    @JvmField
    public static final ProtoAdapter<ClientApolloErrorEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent$Context#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Context context;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent$ErrorType#ADAPTER", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final ErrorType error_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "jobUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String job_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String name;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String request;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Instant timestamp;

    public ClientApolloErrorEvent() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24072newBuilder();
    }

    public final ClientPlatform getPlatform() {
        return this.platform;
    }

    public /* synthetic */ ClientApolloErrorEvent(ClientPlatform clientPlatform, Instant instant, ErrorType errorType, String str, String str2, Context context, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ClientPlatform.DEFAULT_PLATFORM : clientPlatform, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? ErrorType.DEFAULT_ERROR_TYPE : errorType, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? Context.DEFAULT_CONTEXT_TYPE : context, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final ErrorType getError_type() {
        return this.error_type;
    }

    public final String getJob_url() {
        return this.job_url;
    }

    public final String getName() {
        return this.name;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getRequest() {
        return this.request;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientApolloErrorEvent(ClientPlatform platform, Instant instant, ErrorType error_type, String job_url, String name, Context context, String request, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(job_url, "job_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.platform = platform;
        this.timestamp = instant;
        this.error_type = error_type;
        this.job_url = job_url;
        this.name = name;
        this.context = context;
        this.request = request;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24072newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientApolloErrorEvent)) {
            return false;
        }
        ClientApolloErrorEvent clientApolloErrorEvent = (ClientApolloErrorEvent) other;
        return Intrinsics.areEqual(unknownFields(), clientApolloErrorEvent.unknownFields()) && this.platform == clientApolloErrorEvent.platform && Intrinsics.areEqual(this.timestamp, clientApolloErrorEvent.timestamp) && this.error_type == clientApolloErrorEvent.error_type && Intrinsics.areEqual(this.job_url, clientApolloErrorEvent.job_url) && Intrinsics.areEqual(this.name, clientApolloErrorEvent.name) && this.context == clientApolloErrorEvent.context && Intrinsics.areEqual(this.request, clientApolloErrorEvent.request);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.platform.hashCode()) * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = ((((((((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.error_type.hashCode()) * 37) + this.job_url.hashCode()) * 37) + this.name.hashCode()) * 37) + this.context.hashCode()) * 37) + this.request.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("platform=" + this.platform);
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        arrayList.add("error_type=" + this.error_type);
        arrayList.add("job_url=" + Internal.sanitize(this.job_url));
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("context=" + this.context);
        arrayList.add("request=" + Internal.sanitize(this.request));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientApolloErrorEvent{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ClientApolloErrorEvent copy$default(ClientApolloErrorEvent clientApolloErrorEvent, ClientPlatform clientPlatform, Instant instant, ErrorType errorType, String str, String str2, Context context, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            clientPlatform = clientApolloErrorEvent.platform;
        }
        if ((i & 2) != 0) {
            instant = clientApolloErrorEvent.timestamp;
        }
        if ((i & 4) != 0) {
            errorType = clientApolloErrorEvent.error_type;
        }
        if ((i & 8) != 0) {
            str = clientApolloErrorEvent.job_url;
        }
        if ((i & 16) != 0) {
            str2 = clientApolloErrorEvent.name;
        }
        if ((i & 32) != 0) {
            context = clientApolloErrorEvent.context;
        }
        if ((i & 64) != 0) {
            str3 = clientApolloErrorEvent.request;
        }
        if ((i & 128) != 0) {
            byteString = clientApolloErrorEvent.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        String str5 = str2;
        Context context2 = context;
        return clientApolloErrorEvent.copy(clientPlatform, instant, errorType, str, str5, context2, str4, byteString2);
    }

    public final ClientApolloErrorEvent copy(ClientPlatform platform, Instant timestamp, ErrorType error_type, String job_url, String name, Context context, String request, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(job_url, "job_url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ClientApolloErrorEvent(platform, timestamp, error_type, job_url, name, context, request, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ClientApolloErrorEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ClientApolloErrorEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClientApolloErrorEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    size += ClientPlatform.ADAPTER.encodedSizeWithTag(1, value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getTimestamp());
                }
                if (value.getError_type() != ClientApolloErrorEvent.ErrorType.DEFAULT_ERROR_TYPE) {
                    size += ClientApolloErrorEvent.ErrorType.ADAPTER.encodedSizeWithTag(3, value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getJob_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getJob_url());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getName());
                }
                if (value.getContext() != ClientApolloErrorEvent.Context.DEFAULT_CONTEXT_TYPE) {
                    size += ClientApolloErrorEvent.Context.ADAPTER.encodedSizeWithTag(6, value.getContext());
                }
                return !Intrinsics.areEqual(value.getRequest(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getRequest()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClientApolloErrorEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getError_type() != ClientApolloErrorEvent.ErrorType.DEFAULT_ERROR_TYPE) {
                    ClientApolloErrorEvent.ErrorType.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getJob_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getJob_url());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                }
                if (value.getContext() != ClientApolloErrorEvent.Context.DEFAULT_CONTEXT_TYPE) {
                    ClientApolloErrorEvent.Context.ADAPTER.encodeWithTag(writer, 6, (int) value.getContext());
                }
                if (!Intrinsics.areEqual(value.getRequest(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRequest());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClientApolloErrorEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getRequest(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getRequest());
                }
                if (value.getContext() != ClientApolloErrorEvent.Context.DEFAULT_CONTEXT_TYPE) {
                    ClientApolloErrorEvent.Context.ADAPTER.encodeWithTag(writer, 6, (int) value.getContext());
                }
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getJob_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getJob_url());
                }
                if (value.getError_type() != ClientApolloErrorEvent.ErrorType.DEFAULT_ERROR_TYPE) {
                    ClientApolloErrorEvent.ErrorType.ADAPTER.encodeWithTag(writer, 3, (int) value.getError_type());
                }
                if (value.getTimestamp() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 2, (int) value.getTimestamp());
                }
                if (value.getPlatform() != ClientPlatform.DEFAULT_PLATFORM) {
                    ClientPlatform.ADAPTER.encodeWithTag(writer, 1, (int) value.getPlatform());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ClientApolloErrorEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ClientPlatform clientPlatformDecode = ClientPlatform.DEFAULT_PLATFORM;
                ClientApolloErrorEvent.ErrorType errorType = ClientApolloErrorEvent.ErrorType.DEFAULT_ERROR_TYPE;
                ClientApolloErrorEvent.Context context = ClientApolloErrorEvent.Context.DEFAULT_CONTEXT_TYPE;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Instant instantDecode = null;
                ClientApolloErrorEvent.Context contextDecode = context;
                ClientApolloErrorEvent.ErrorType errorTypeDecode = errorType;
                while (true) {
                    ClientPlatform clientPlatform = clientPlatformDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        clientPlatformDecode = ClientPlatform.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    break;
                                case 3:
                                    try {
                                        errorTypeDecode = ClientApolloErrorEvent.ErrorType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        contextDecode = ClientApolloErrorEvent.Context.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 7:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ClientApolloErrorEvent(clientPlatform, instantDecode, errorTypeDecode, strDecode, strDecode2, contextDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClientApolloErrorEvent redact(ClientApolloErrorEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant timestamp = value.getTimestamp();
                return ClientApolloErrorEvent.copy$default(value, null, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, ByteString.EMPTY, 125, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientApolloErrorEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_ERROR_TYPE", "NAMESPACE_CREATION", "SERVICE_SPINUP", "TEST_DATA_API_RECIPE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class ErrorType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ErrorType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ErrorType DEFAULT_ERROR_TYPE;
        public static final ErrorType NAMESPACE_CREATION;
        public static final ErrorType SERVICE_SPINUP;
        public static final ErrorType TEST_DATA_API_RECIPE;
        private final int value;

        private static final /* synthetic */ ErrorType[] $values() {
            return new ErrorType[]{DEFAULT_ERROR_TYPE, NAMESPACE_CREATION, SERVICE_SPINUP, TEST_DATA_API_RECIPE};
        }

        @JvmStatic
        public static final ErrorType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ErrorType> getEntries() {
            return $ENTRIES;
        }

        private ErrorType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ErrorType errorType = new ErrorType("DEFAULT_ERROR_TYPE", 0, 0);
            DEFAULT_ERROR_TYPE = errorType;
            NAMESPACE_CREATION = new ErrorType("NAMESPACE_CREATION", 1, 1);
            SERVICE_SPINUP = new ErrorType("SERVICE_SPINUP", 2, 2);
            TEST_DATA_API_RECIPE = new ErrorType("TEST_DATA_API_RECIPE", 3, 3);
            ErrorType[] errorTypeArr$values = $values();
            $VALUES = errorTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ErrorType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ErrorType>(orCreateKotlinClass, syntax, errorType) { // from class: com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent$ErrorType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ClientApolloErrorEvent.ErrorType fromValue(int value) {
                    return ClientApolloErrorEvent.ErrorType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ClientApolloErrorEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$ErrorType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ErrorType fromValue(int value) {
                if (value == 0) {
                    return ErrorType.DEFAULT_ERROR_TYPE;
                }
                if (value == 1) {
                    return ErrorType.NAMESPACE_CREATION;
                }
                if (value == 2) {
                    return ErrorType.SERVICE_SPINUP;
                }
                if (value != 3) {
                    return null;
                }
                return ErrorType.TEST_DATA_API_RECIPE;
            }
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClientApolloErrorEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_CONTEXT_TYPE", "RECORD", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Context implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Context[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Context> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Context DEFAULT_CONTEXT_TYPE;
        public static final Context RECORD;
        private final int value;

        private static final /* synthetic */ Context[] $values() {
            return new Context[]{DEFAULT_CONTEXT_TYPE, RECORD};
        }

        @JvmStatic
        public static final Context fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Context> getEntries() {
            return $ENTRIES;
        }

        private Context(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Context context = new Context("DEFAULT_CONTEXT_TYPE", 0, 0);
            DEFAULT_CONTEXT_TYPE = context;
            RECORD = new Context("RECORD", 1, 1);
            Context[] contextArr$values = $values();
            $VALUES = contextArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contextArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Context.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Context>(orCreateKotlinClass, syntax, context) { // from class: com.robinhood.rosetta.eventlogging.ClientApolloErrorEvent$Context$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ClientApolloErrorEvent.Context fromValue(int value) {
                    return ClientApolloErrorEvent.Context.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ClientApolloErrorEvent.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ClientApolloErrorEvent$Context;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Context fromValue(int value) {
                if (value == 0) {
                    return Context.DEFAULT_CONTEXT_TYPE;
                }
                if (value != 1) {
                    return null;
                }
                return Context.RECORD;
            }
        }

        public static Context valueOf(String str) {
            return (Context) Enum.valueOf(Context.class, str);
        }

        public static Context[] values() {
            return (Context[]) $VALUES.clone();
        }
    }
}
