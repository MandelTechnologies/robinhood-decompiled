package com.robinhood.rosetta.eventlogging;

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

/* compiled from: IpoaAllocationCylinderContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaAllocationCylinderContext;", "Lcom/squareup/wire/Message;", "", "instrument_id", "", "projected_allocated_shares", "", "total_ipo_shares", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;JJLokio/ByteString;)V", "getInstrument_id", "()Ljava/lang/String;", "getProjected_allocated_shares", "()J", "getTotal_ipo_shares", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class IpoaAllocationCylinderContext extends Message {

    @JvmField
    public static final ProtoAdapter<IpoaAllocationCylinderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String instrument_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "projectedAllocatedShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long projected_allocated_shares;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "totalIpoShares", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long total_ipo_shares;

    public IpoaAllocationCylinderContext() {
        this(null, 0L, 0L, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24321newBuilder();
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public /* synthetic */ IpoaAllocationCylinderContext(String str, long j, long j2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final long getProjected_allocated_shares() {
        return this.projected_allocated_shares;
    }

    public final long getTotal_ipo_shares() {
        return this.total_ipo_shares;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoaAllocationCylinderContext(String instrument_id, long j, long j2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.instrument_id = instrument_id;
        this.projected_allocated_shares = j;
        this.total_ipo_shares = j2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24321newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IpoaAllocationCylinderContext)) {
            return false;
        }
        IpoaAllocationCylinderContext ipoaAllocationCylinderContext = (IpoaAllocationCylinderContext) other;
        return Intrinsics.areEqual(unknownFields(), ipoaAllocationCylinderContext.unknownFields()) && Intrinsics.areEqual(this.instrument_id, ipoaAllocationCylinderContext.instrument_id) && this.projected_allocated_shares == ipoaAllocationCylinderContext.projected_allocated_shares && this.total_ipo_shares == ipoaAllocationCylinderContext.total_ipo_shares;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.instrument_id.hashCode()) * 37) + Long.hashCode(this.projected_allocated_shares)) * 37) + Long.hashCode(this.total_ipo_shares);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        arrayList.add("projected_allocated_shares=" + this.projected_allocated_shares);
        arrayList.add("total_ipo_shares=" + this.total_ipo_shares);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IpoaAllocationCylinderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IpoaAllocationCylinderContext copy$default(IpoaAllocationCylinderContext ipoaAllocationCylinderContext, String str, long j, long j2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipoaAllocationCylinderContext.instrument_id;
        }
        if ((i & 2) != 0) {
            j = ipoaAllocationCylinderContext.projected_allocated_shares;
        }
        if ((i & 4) != 0) {
            j2 = ipoaAllocationCylinderContext.total_ipo_shares;
        }
        if ((i & 8) != 0) {
            byteString = ipoaAllocationCylinderContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        return ipoaAllocationCylinderContext.copy(str, j, j2, byteString2);
    }

    public final IpoaAllocationCylinderContext copy(String instrument_id, long projected_allocated_shares, long total_ipo_shares, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IpoaAllocationCylinderContext(instrument_id, projected_allocated_shares, total_ipo_shares, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IpoaAllocationCylinderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IpoaAllocationCylinderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.IpoaAllocationCylinderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IpoaAllocationCylinderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstrument_id());
                }
                if (value.getProjected_allocated_shares() != 0) {
                    size += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(value.getProjected_allocated_shares()));
                }
                return value.getTotal_ipo_shares() != 0 ? size + ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(value.getTotal_ipo_shares())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IpoaAllocationCylinderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
                }
                if (value.getProjected_allocated_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (value.getTotal_ipo_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getTotal_ipo_shares()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IpoaAllocationCylinderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTotal_ipo_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, (int) Long.valueOf(value.getTotal_ipo_shares()));
                }
                if (value.getProjected_allocated_shares() != 0) {
                    ProtoAdapter.INT64.encodeWithTag(writer, 2, (int) Long.valueOf(value.getProjected_allocated_shares()));
                }
                if (Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstrument_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IpoaAllocationCylinderContext redact(IpoaAllocationCylinderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IpoaAllocationCylinderContext.copy$default(value, null, 0L, 0L, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IpoaAllocationCylinderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                long jLongValue = 0;
                long jLongValue2 = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IpoaAllocationCylinderContext(strDecode, jLongValue, jLongValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                    } else if (iNextTag == 3) {
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
