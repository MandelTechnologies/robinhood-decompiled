package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.LogoutContext;
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

/* compiled from: LogoutContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LogoutContext;", "Lcom/squareup/wire/Message;", "", "cause", "Lcom/robinhood/rosetta/eventlogging/LogoutContext$Cause;", "source", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LogoutContext$Cause;Ljava/lang/String;Lokio/ByteString;)V", "getCause", "()Lcom/robinhood/rosetta/eventlogging/LogoutContext$Cause;", "getSource", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Cause", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LogoutContext extends Message {

    @JvmField
    public static final ProtoAdapter<LogoutContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.LogoutContext$Cause#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Cause cause;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String source;

    public LogoutContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24356newBuilder();
    }

    public final Cause getCause() {
        return this.cause;
    }

    public /* synthetic */ LogoutContext(Cause cause, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Cause.OTHER : cause, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutContext(Cause cause, String source, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.cause = cause;
        this.source = source;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24356newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LogoutContext)) {
            return false;
        }
        LogoutContext logoutContext = (LogoutContext) other;
        return Intrinsics.areEqual(unknownFields(), logoutContext.unknownFields()) && this.cause == logoutContext.cause && Intrinsics.areEqual(this.source, logoutContext.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.cause.hashCode()) * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cause=" + this.cause);
        arrayList.add("source=" + Internal.sanitize(this.source));
        return CollectionsKt.joinToString$default(arrayList, ", ", "LogoutContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LogoutContext copy$default(LogoutContext logoutContext, Cause cause, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            cause = logoutContext.cause;
        }
        if ((i & 2) != 0) {
            str = logoutContext.source;
        }
        if ((i & 4) != 0) {
            byteString = logoutContext.unknownFields();
        }
        return logoutContext.copy(cause, str, byteString);
    }

    public final LogoutContext copy(Cause cause, String source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LogoutContext(cause, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LogoutContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LogoutContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.LogoutContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LogoutContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getCause() != LogoutContext.Cause.OTHER) {
                    size += LogoutContext.Cause.ADAPTER.encodedSizeWithTag(1, value.getCause());
                }
                return !Intrinsics.areEqual(value.getSource(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LogoutContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getCause() != LogoutContext.Cause.OTHER) {
                    LogoutContext.Cause.ADAPTER.encodeWithTag(writer, 1, (int) value.getCause());
                }
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LogoutContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSource());
                }
                if (value.getCause() != LogoutContext.Cause.OTHER) {
                    LogoutContext.Cause.ADAPTER.encodeWithTag(writer, 1, (int) value.getCause());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public LogoutContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                LogoutContext.Cause causeDecode = LogoutContext.Cause.OTHER;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LogoutContext(causeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            causeDecode = LogoutContext.Cause.ADAPTER.decode(reader);
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
            public LogoutContext redact(LogoutContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LogoutContext.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogoutContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LogoutContext$Cause;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OTHER", "USER_INITIATED", "FORCE_LOGOUT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Cause implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Cause[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Cause> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Cause FORCE_LOGOUT;
        public static final Cause OTHER;
        public static final Cause USER_INITIATED;
        private final int value;

        private static final /* synthetic */ Cause[] $values() {
            return new Cause[]{OTHER, USER_INITIATED, FORCE_LOGOUT};
        }

        @JvmStatic
        public static final Cause fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Cause> getEntries() {
            return $ENTRIES;
        }

        private Cause(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Cause cause = new Cause("OTHER", 0, 0);
            OTHER = cause;
            USER_INITIATED = new Cause("USER_INITIATED", 1, 1);
            FORCE_LOGOUT = new Cause("FORCE_LOGOUT", 2, 2);
            Cause[] causeArr$values = $values();
            $VALUES = causeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(causeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Cause.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Cause>(orCreateKotlinClass, syntax, cause) { // from class: com.robinhood.rosetta.eventlogging.LogoutContext$Cause$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public LogoutContext.Cause fromValue(int value) {
                    return LogoutContext.Cause.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: LogoutContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LogoutContext$Cause$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/LogoutContext$Cause;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Cause fromValue(int value) {
                if (value == 0) {
                    return Cause.OTHER;
                }
                if (value == 1) {
                    return Cause.USER_INITIATED;
                }
                if (value != 2) {
                    return null;
                }
                return Cause.FORCE_LOGOUT;
            }
        }

        public static Cause valueOf(String str) {
            return (Cause) Enum.valueOf(Cause.class, str);
        }

        public static Cause[] values() {
            return (Cause[]) $VALUES.clone();
        }
    }
}
