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

/* compiled from: CryptoPostTradeFeeTierStatusContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoPostTradeFeeTierStatusContext;", "Lcom/squareup/wire/Message;", "", "current_fee_tier", "", "remaining_volume", "unknownFields", "Lokio/ByteString;", "<init>", "(DDLokio/ByteString;)V", "getCurrent_fee_tier", "()D", "getRemaining_volume", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CryptoPostTradeFeeTierStatusContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoPostTradeFeeTierStatusContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "currentFeeTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double current_fee_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "remainingVolume", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double remaining_volume;

    public CryptoPostTradeFeeTierStatusContext() {
        this(0.0d, 0.0d, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24158newBuilder();
    }

    public final double getCurrent_fee_tier() {
        return this.current_fee_tier;
    }

    public final double getRemaining_volume() {
        return this.remaining_volume;
    }

    public /* synthetic */ CryptoPostTradeFeeTierStatusContext(double d, double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPostTradeFeeTierStatusContext(double d, double d2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.current_fee_tier = d;
        this.remaining_volume = d2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24158newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoPostTradeFeeTierStatusContext)) {
            return false;
        }
        CryptoPostTradeFeeTierStatusContext cryptoPostTradeFeeTierStatusContext = (CryptoPostTradeFeeTierStatusContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoPostTradeFeeTierStatusContext.unknownFields()) && this.current_fee_tier == cryptoPostTradeFeeTierStatusContext.current_fee_tier && this.remaining_volume == cryptoPostTradeFeeTierStatusContext.remaining_volume;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.current_fee_tier)) * 37) + Double.hashCode(this.remaining_volume);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("current_fee_tier=" + this.current_fee_tier);
        arrayList.add("remaining_volume=" + this.remaining_volume);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoPostTradeFeeTierStatusContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoPostTradeFeeTierStatusContext copy$default(CryptoPostTradeFeeTierStatusContext cryptoPostTradeFeeTierStatusContext, double d, double d2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cryptoPostTradeFeeTierStatusContext.current_fee_tier;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = cryptoPostTradeFeeTierStatusContext.remaining_volume;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            byteString = cryptoPostTradeFeeTierStatusContext.unknownFields();
        }
        return cryptoPostTradeFeeTierStatusContext.copy(d3, d4, byteString);
    }

    public final CryptoPostTradeFeeTierStatusContext copy(double current_fee_tier, double remaining_volume, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoPostTradeFeeTierStatusContext(current_fee_tier, remaining_volume, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoPostTradeFeeTierStatusContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoPostTradeFeeTierStatusContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoPostTradeFeeTierStatusContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoPostTradeFeeTierStatusContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getCurrent_fee_tier());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getCurrent_fee_tier()));
                }
                return !Double.valueOf(value.getRemaining_volume()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getRemaining_volume())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoPostTradeFeeTierStatusContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getCurrent_fee_tier());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getCurrent_fee_tier()));
                }
                if (!Double.valueOf(value.getRemaining_volume()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getRemaining_volume()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoPostTradeFeeTierStatusContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getRemaining_volume());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getRemaining_volume()));
                }
                if (Double.valueOf(value.getCurrent_fee_tier()).equals(dValueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getCurrent_fee_tier()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoPostTradeFeeTierStatusContext redact(CryptoPostTradeFeeTierStatusContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoPostTradeFeeTierStatusContext.copy$default(value, 0.0d, 0.0d, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoPostTradeFeeTierStatusContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoPostTradeFeeTierStatusContext(dDoubleValue, dDoubleValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
