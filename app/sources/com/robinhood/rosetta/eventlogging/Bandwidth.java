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

/* compiled from: Bandwidth.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Bandwidth;", "Lcom/squareup/wire/Message;", "", "upstream_kbps", "", "downstream_kbps", "unknownFields", "Lokio/ByteString;", "<init>", "(IILokio/ByteString;)V", "getUpstream_kbps", "()I", "getDownstream_kbps", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Bandwidth extends Message {

    @JvmField
    public static final ProtoAdapter<Bandwidth> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "downstreamKbps", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final int downstream_kbps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "upstreamKbps", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int upstream_kbps;

    public Bandwidth() {
        this(0, 0, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24029newBuilder();
    }

    public final int getUpstream_kbps() {
        return this.upstream_kbps;
    }

    public final int getDownstream_kbps() {
        return this.downstream_kbps;
    }

    public /* synthetic */ Bandwidth(int i, int i2, ByteString byteString, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bandwidth(int i, int i2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.upstream_kbps = i;
        this.downstream_kbps = i2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24029newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Bandwidth)) {
            return false;
        }
        Bandwidth bandwidth = (Bandwidth) other;
        return Intrinsics.areEqual(unknownFields(), bandwidth.unknownFields()) && this.upstream_kbps == bandwidth.upstream_kbps && this.downstream_kbps == bandwidth.downstream_kbps;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.upstream_kbps)) * 37) + Integer.hashCode(this.downstream_kbps);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("upstream_kbps=" + this.upstream_kbps);
        arrayList.add("downstream_kbps=" + this.downstream_kbps);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Bandwidth{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Bandwidth copy$default(Bandwidth bandwidth, int i, int i2, ByteString byteString, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bandwidth.upstream_kbps;
        }
        if ((i3 & 2) != 0) {
            i2 = bandwidth.downstream_kbps;
        }
        if ((i3 & 4) != 0) {
            byteString = bandwidth.unknownFields();
        }
        return bandwidth.copy(i, i2, byteString);
    }

    public final Bandwidth copy(int upstream_kbps, int downstream_kbps, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Bandwidth(upstream_kbps, downstream_kbps, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Bandwidth.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Bandwidth>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Bandwidth$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Bandwidth value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUpstream_kbps() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getUpstream_kbps()));
                }
                return value.getDownstream_kbps() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getDownstream_kbps())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Bandwidth value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUpstream_kbps() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getUpstream_kbps()));
                }
                if (value.getDownstream_kbps() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getDownstream_kbps()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Bandwidth value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDownstream_kbps() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) Integer.valueOf(value.getDownstream_kbps()));
                }
                if (value.getUpstream_kbps() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) Integer.valueOf(value.getUpstream_kbps()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Bandwidth redact(Bandwidth value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Bandwidth.copy$default(value, 0, 0, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Bandwidth decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                int iIntValue = 0;
                int iIntValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Bandwidth(iIntValue, iIntValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
