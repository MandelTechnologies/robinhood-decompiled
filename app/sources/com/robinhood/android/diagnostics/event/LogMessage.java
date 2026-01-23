package com.robinhood.android.diagnostics.event;

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

/* compiled from: LogMessage.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/LogMessage;", "Lcom/squareup/wire/Message;", "", "level", "Lcom/robinhood/android/diagnostics/event/LogLevel;", "tag", "", "message", "stack_trace", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/android/diagnostics/event/LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLevel", "()Lcom/robinhood/android/diagnostics/event/LogLevel;", "getTag", "()Ljava/lang/String;", "getMessage", "getStack_trace", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LogMessage extends Message {

    @JvmField
    public static final ProtoAdapter<LogMessage> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.android.diagnostics.event.LogLevel#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final LogLevel level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
    private final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stackTrace", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 5)
    private final String stack_trace;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final String tag;

    public LogMessage() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m13298newBuilder();
    }

    public final LogLevel getLevel() {
        return this.level;
    }

    public /* synthetic */ LogMessage(LogLevel logLevel, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LogLevel.LOG_LEVEL_UNSPECIFIED : logLevel, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStack_trace() {
        return this.stack_trace;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogMessage(LogLevel level, String tag, String message, String stack_trace, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stack_trace, "stack_trace");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.level = level;
        this.tag = tag;
        this.message = message;
        this.stack_trace = stack_trace;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m13298newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LogMessage)) {
            return false;
        }
        LogMessage logMessage = (LogMessage) other;
        return Intrinsics.areEqual(unknownFields(), logMessage.unknownFields()) && this.level == logMessage.level && Intrinsics.areEqual(this.tag, logMessage.tag) && Intrinsics.areEqual(this.message, logMessage.message) && Intrinsics.areEqual(this.stack_trace, logMessage.stack_trace);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.level.hashCode()) * 37) + this.tag.hashCode()) * 37) + this.message.hashCode()) * 37) + this.stack_trace.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("level=" + this.level);
        arrayList.add("tag=" + Internal.sanitize(this.tag));
        arrayList.add("message=" + Internal.sanitize(this.message));
        arrayList.add("stack_trace=" + Internal.sanitize(this.stack_trace));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LogMessage{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LogMessage copy$default(LogMessage logMessage, LogLevel logLevel, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel = logMessage.level;
        }
        if ((i & 2) != 0) {
            str = logMessage.tag;
        }
        if ((i & 4) != 0) {
            str2 = logMessage.message;
        }
        if ((i & 8) != 0) {
            str3 = logMessage.stack_trace;
        }
        if ((i & 16) != 0) {
            byteString = logMessage.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return logMessage.copy(logLevel, str, str4, str3, byteString2);
    }

    public final LogMessage copy(LogLevel level, String tag, String message, String stack_trace, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stack_trace, "stack_trace");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LogMessage(level, tag, message, stack_trace, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LogMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LogMessage>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.android.diagnostics.event.LogMessage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LogMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getLevel() != LogLevel.LOG_LEVEL_UNSPECIFIED) {
                    size += LogLevel.ADAPTER.encodedSizeWithTag(2, value.getLevel());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTag());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMessage());
                }
                return !Intrinsics.areEqual(value.getStack_trace(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getStack_trace()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LogMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getLevel() != LogLevel.LOG_LEVEL_UNSPECIFIED) {
                    LogLevel.ADAPTER.encodeWithTag(writer, 2, (int) value.getLevel());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTag());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getStack_trace(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getStack_trace());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LogMessage value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getStack_trace(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getStack_trace());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMessage());
                }
                if (!Intrinsics.areEqual(value.getTag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTag());
                }
                if (value.getLevel() != LogLevel.LOG_LEVEL_UNSPECIFIED) {
                    LogLevel.ADAPTER.encodeWithTag(writer, 2, (int) value.getLevel());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LogMessage decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LogLevel logLevelDecode = LogLevel.LOG_LEVEL_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    LogLevel logLevel = logLevelDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new LogMessage(logLevel, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 2) {
                            try {
                                logLevelDecode = LogLevel.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LogMessage redact(LogMessage value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LogMessage.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
