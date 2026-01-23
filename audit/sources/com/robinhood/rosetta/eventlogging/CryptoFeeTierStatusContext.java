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

/* compiled from: CryptoFeeTierStatusContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoFeeTierStatusContext;", "Lcom/squareup/wire/Message;", "", "current_fee_tier", "", "next_fee_tier", "required_volume", "current_volume", "unknownFields", "Lokio/ByteString;", "<init>", "(DDDDLokio/ByteString;)V", "getCurrent_fee_tier", "()D", "getNext_fee_tier", "getRequired_volume", "getCurrent_volume", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CryptoFeeTierStatusContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoFeeTierStatusContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "currentFeeTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double current_fee_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "currentVolume", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double current_volume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "nextFeeTier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double next_fee_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "requiredVolume", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double required_volume;

    public CryptoFeeTierStatusContext() {
        this(0.0d, 0.0d, 0.0d, 0.0d, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24150newBuilder();
    }

    public final double getCurrent_fee_tier() {
        return this.current_fee_tier;
    }

    public final double getNext_fee_tier() {
        return this.next_fee_tier;
    }

    public final double getRequired_volume() {
        return this.required_volume;
    }

    public final double getCurrent_volume() {
        return this.current_volume;
    }

    public /* synthetic */ CryptoFeeTierStatusContext(double d, double d2, double d3, double d4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoFeeTierStatusContext(double d, double d2, double d3, double d4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.current_fee_tier = d;
        this.next_fee_tier = d2;
        this.required_volume = d3;
        this.current_volume = d4;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24150newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoFeeTierStatusContext)) {
            return false;
        }
        CryptoFeeTierStatusContext cryptoFeeTierStatusContext = (CryptoFeeTierStatusContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoFeeTierStatusContext.unknownFields()) && this.current_fee_tier == cryptoFeeTierStatusContext.current_fee_tier && this.next_fee_tier == cryptoFeeTierStatusContext.next_fee_tier && this.required_volume == cryptoFeeTierStatusContext.required_volume && this.current_volume == cryptoFeeTierStatusContext.current_volume;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + Double.hashCode(this.current_fee_tier)) * 37) + Double.hashCode(this.next_fee_tier)) * 37) + Double.hashCode(this.required_volume)) * 37) + Double.hashCode(this.current_volume);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("current_fee_tier=" + this.current_fee_tier);
        arrayList.add("next_fee_tier=" + this.next_fee_tier);
        arrayList.add("required_volume=" + this.required_volume);
        arrayList.add("current_volume=" + this.current_volume);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoFeeTierStatusContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoFeeTierStatusContext copy$default(CryptoFeeTierStatusContext cryptoFeeTierStatusContext, double d, double d2, double d3, double d4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d = cryptoFeeTierStatusContext.current_fee_tier;
        }
        double d5 = d;
        if ((i & 2) != 0) {
            d2 = cryptoFeeTierStatusContext.next_fee_tier;
        }
        return cryptoFeeTierStatusContext.copy(d5, d2, (i & 4) != 0 ? cryptoFeeTierStatusContext.required_volume : d3, (i & 8) != 0 ? cryptoFeeTierStatusContext.current_volume : d4, (i & 16) != 0 ? cryptoFeeTierStatusContext.unknownFields() : byteString);
    }

    public final CryptoFeeTierStatusContext copy(double current_fee_tier, double next_fee_tier, double required_volume, double current_volume, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoFeeTierStatusContext(current_fee_tier, next_fee_tier, required_volume, current_volume, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoFeeTierStatusContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoFeeTierStatusContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoFeeTierStatusContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getCurrent_fee_tier());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getCurrent_fee_tier()));
                }
                if (!Double.valueOf(value.getNext_fee_tier()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getNext_fee_tier()));
                }
                if (!Double.valueOf(value.getRequired_volume()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getRequired_volume()));
                }
                return !Double.valueOf(value.getCurrent_volume()).equals(dValueOf2) ? size + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getCurrent_volume())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoFeeTierStatusContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getCurrent_fee_tier());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getCurrent_fee_tier()));
                }
                if (!Double.valueOf(value.getNext_fee_tier()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getNext_fee_tier()));
                }
                if (!Double.valueOf(value.getRequired_volume()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getRequired_volume()));
                }
                if (!Double.valueOf(value.getCurrent_volume()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getCurrent_volume()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoFeeTierStatusContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Double dValueOf = Double.valueOf(value.getCurrent_volume());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getCurrent_volume()));
                }
                if (!Double.valueOf(value.getRequired_volume()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getRequired_volume()));
                }
                if (!Double.valueOf(value.getNext_fee_tier()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getNext_fee_tier()));
                }
                if (Double.valueOf(value.getCurrent_fee_tier()).equals(dValueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getCurrent_fee_tier()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoFeeTierStatusContext redact(CryptoFeeTierStatusContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoFeeTierStatusContext.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoFeeTierStatusContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoFeeTierStatusContext(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 4) {
                        dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
