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

/* compiled from: IpoAccessListVideoContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoAccessListVideoContext;", "Lcom/squareup/wire/Message;", "", "time_elapsed_ms", "", "total_duration_ms", "unknownFields", "Lokio/ByteString;", "<init>", "(JJLokio/ByteString;)V", "getTime_elapsed_ms", "()J", "getTotal_duration_ms", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class IpoAccessListVideoContext extends Message {

    @JvmField
    public static final ProtoAdapter<IpoAccessListVideoContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "timeElapsedMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long time_elapsed_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "totalDurationMs", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long total_duration_ms;

    public IpoAccessListVideoContext() {
        this(0L, 0L, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24320newBuilder();
    }

    public final long getTime_elapsed_ms() {
        return this.time_elapsed_ms;
    }

    public final long getTotal_duration_ms() {
        return this.total_duration_ms;
    }

    public /* synthetic */ IpoAccessListVideoContext(long j, long j2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoAccessListVideoContext(long j, long j2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.time_elapsed_ms = j;
        this.total_duration_ms = j2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24320newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IpoAccessListVideoContext)) {
            return false;
        }
        IpoAccessListVideoContext ipoAccessListVideoContext = (IpoAccessListVideoContext) other;
        return Intrinsics.areEqual(unknownFields(), ipoAccessListVideoContext.unknownFields()) && this.time_elapsed_ms == ipoAccessListVideoContext.time_elapsed_ms && this.total_duration_ms == ipoAccessListVideoContext.total_duration_ms;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.time_elapsed_ms)) * 37) + Long.hashCode(this.total_duration_ms);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("time_elapsed_ms=" + this.time_elapsed_ms);
        arrayList.add("total_duration_ms=" + this.total_duration_ms);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IpoAccessListVideoContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IpoAccessListVideoContext copy$default(IpoAccessListVideoContext ipoAccessListVideoContext, long j, long j2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ipoAccessListVideoContext.time_elapsed_ms;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ipoAccessListVideoContext.total_duration_ms;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            byteString = ipoAccessListVideoContext.unknownFields();
        }
        return ipoAccessListVideoContext.copy(j3, j4, byteString);
    }

    public final IpoAccessListVideoContext copy(long time_elapsed_ms, long total_duration_ms, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IpoAccessListVideoContext(time_elapsed_ms, total_duration_ms, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IpoAccessListVideoContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IpoAccessListVideoContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.IpoAccessListVideoContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IpoAccessListVideoContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTime_elapsed_ms() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getTime_elapsed_ms()));
                }
                return value.getTotal_duration_ms() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getTotal_duration_ms())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IpoAccessListVideoContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTime_elapsed_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getTime_elapsed_ms()));
                }
                if (value.getTotal_duration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getTotal_duration_ms()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IpoAccessListVideoContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_duration_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getTotal_duration_ms()));
                }
                if (value.getTime_elapsed_ms() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, (int) Long.valueOf(value.getTime_elapsed_ms()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IpoAccessListVideoContext redact(IpoAccessListVideoContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IpoAccessListVideoContext.copy$default(value, 0L, 0L, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IpoAccessListVideoContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                long jLongValue = 0;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IpoAccessListVideoContext(jLongValue, jLongValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 2) {
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
