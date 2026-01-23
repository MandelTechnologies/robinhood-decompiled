package microgram.p507ui.p508v1;

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

/* compiled from: LoggingContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J9\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, m3636d2 = {"Lmicrogram/ui/v1/LoggingContext;", "Lcom/squareup/wire/Message;", "", "entry_point_identifier", "", "ms_since_last_resurrection_seen", "", "seen_resurrection_count", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)V", "getEntry_point_identifier", "()Ljava/lang/String;", "getMs_since_last_resurrection_seen", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSeen_resurrection_count", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lokio/ByteString;)Lmicrogram/ui/v1/LoggingContext;", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class LoggingContext extends Message {

    @JvmField
    public static final ProtoAdapter<LoggingContext> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entryPointIdentifier", schemaIndex = 0, tag = 1)
    private final String entry_point_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "msSinceLastResurrectionSeen", schemaIndex = 1, tag = 2)
    private final Long ms_since_last_resurrection_seen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "seenResurrectionCount", schemaIndex = 2, tag = 3)
    private final Long seen_resurrection_count;

    public LoggingContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29258newBuilder();
    }

    public final String getEntry_point_identifier() {
        return this.entry_point_identifier;
    }

    public final Long getMs_since_last_resurrection_seen() {
        return this.ms_since_last_resurrection_seen;
    }

    public final Long getSeen_resurrection_count() {
        return this.seen_resurrection_count;
    }

    public /* synthetic */ LoggingContext(String str, Long l, Long l2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingContext(String str, Long l, Long l2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point_identifier = str;
        this.ms_since_last_resurrection_seen = l;
        this.seen_resurrection_count = l2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29258newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof LoggingContext)) {
            return false;
        }
        LoggingContext loggingContext = (LoggingContext) other;
        return Intrinsics.areEqual(unknownFields(), loggingContext.unknownFields()) && Intrinsics.areEqual(this.entry_point_identifier, loggingContext.entry_point_identifier) && Intrinsics.areEqual(this.ms_since_last_resurrection_seen, loggingContext.ms_since_last_resurrection_seen) && Intrinsics.areEqual(this.seen_resurrection_count, loggingContext.seen_resurrection_count);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.entry_point_identifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.ms_since_last_resurrection_seen;
        int iHashCode3 = (iHashCode2 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.seen_resurrection_count;
        int iHashCode4 = iHashCode3 + (l2 != null ? l2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entry_point_identifier;
        if (str != null) {
            arrayList.add("entry_point_identifier=" + Internal.sanitize(str));
        }
        Long l = this.ms_since_last_resurrection_seen;
        if (l != null) {
            arrayList.add("ms_since_last_resurrection_seen=" + l);
        }
        Long l2 = this.seen_resurrection_count;
        if (l2 != null) {
            arrayList.add("seen_resurrection_count=" + l2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoggingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ LoggingContext copy$default(LoggingContext loggingContext, String str, Long l, Long l2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggingContext.entry_point_identifier;
        }
        if ((i & 2) != 0) {
            l = loggingContext.ms_since_last_resurrection_seen;
        }
        if ((i & 4) != 0) {
            l2 = loggingContext.seen_resurrection_count;
        }
        if ((i & 8) != 0) {
            byteString = loggingContext.unknownFields();
        }
        return loggingContext.copy(str, l, l2, byteString);
    }

    public final LoggingContext copy(String entry_point_identifier, Long ms_since_last_resurrection_seen, Long seen_resurrection_count, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new LoggingContext(entry_point_identifier, ms_since_last_resurrection_seen, seen_resurrection_count, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LoggingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<LoggingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.LoggingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LoggingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEntry_point_identifier());
                ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
                return size + protoAdapter.encodedSizeWithTag(2, value.getMs_since_last_resurrection_seen()) + protoAdapter.encodedSizeWithTag(3, value.getSeen_resurrection_count());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LoggingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntry_point_identifier());
                ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMs_since_last_resurrection_seen());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSeen_resurrection_count());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LoggingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getSeen_resurrection_count());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getMs_since_last_resurrection_seen());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntry_point_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LoggingContext redact(LoggingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return LoggingContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LoggingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                Long lDecode = null;
                Long lDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new LoggingContext(strDecode, lDecode, lDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        lDecode = ProtoAdapter.INT64.decode(reader);
                    } else if (iNextTag == 3) {
                        lDecode2 = ProtoAdapter.INT64.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
