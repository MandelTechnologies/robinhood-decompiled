package billy_mays.service.p023v1;

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

/* compiled from: BoostedRateInformation.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lbilly_mays/service/v1/BoostedRateInformation;", "Lcom/squareup/wire/Message;", "", "boosted_apy", "", "original_apy", "days_remaining", "", "unknownFields", "Lokio/ByteString;", "<init>", "(DDILokio/ByteString;)V", "getBoosted_apy", "()D", "getOriginal_apy", "getDays_remaining", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "Companion", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class BoostedRateInformation extends Message {

    @JvmField
    public static final ProtoAdapter<BoostedRateInformation> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "boostedApy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final double boosted_apy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "daysRemaining", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int days_remaining;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "originalApy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double original_apy;

    public BoostedRateInformation() {
        this(0.0d, 0.0d, 0, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8544newBuilder();
    }

    public final double getBoosted_apy() {
        return this.boosted_apy;
    }

    public final double getOriginal_apy() {
        return this.original_apy;
    }

    public final int getDays_remaining() {
        return this.days_remaining;
    }

    public /* synthetic */ BoostedRateInformation(double d, double d2, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostedRateInformation(double d, double d2, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.boosted_apy = d;
        this.original_apy = d2;
        this.days_remaining = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8544newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BoostedRateInformation)) {
            return false;
        }
        BoostedRateInformation boostedRateInformation = (BoostedRateInformation) other;
        return Intrinsics.areEqual(unknownFields(), boostedRateInformation.unknownFields()) && this.boosted_apy == boostedRateInformation.boosted_apy && this.original_apy == boostedRateInformation.original_apy && this.days_remaining == boostedRateInformation.days_remaining;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.boosted_apy)) * 37) + Double.hashCode(this.original_apy)) * 37) + Integer.hashCode(this.days_remaining);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("boosted_apy=" + this.boosted_apy);
        arrayList.add("original_apy=" + this.original_apy);
        arrayList.add("days_remaining=" + this.days_remaining);
        return CollectionsKt.joinToString$default(arrayList, ", ", "BoostedRateInformation{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BoostedRateInformation copy$default(BoostedRateInformation boostedRateInformation, double d, double d2, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = boostedRateInformation.boosted_apy;
        }
        double d3 = d;
        if ((i2 & 2) != 0) {
            d2 = boostedRateInformation.original_apy;
        }
        double d4 = d2;
        if ((i2 & 4) != 0) {
            i = boostedRateInformation.days_remaining;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            byteString = boostedRateInformation.unknownFields();
        }
        return boostedRateInformation.copy(d3, d4, i3, byteString);
    }

    public final BoostedRateInformation copy(double boosted_apy, double original_apy, int days_remaining, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BoostedRateInformation(boosted_apy, original_apy, days_remaining, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BoostedRateInformation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BoostedRateInformation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: billy_mays.service.v1.BoostedRateInformation$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BoostedRateInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                Double dValueOf = Double.valueOf(value.getBoosted_apy());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getBoosted_apy()));
                }
                if (!Double.valueOf(value.getOriginal_apy()).equals(dValueOf2)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getOriginal_apy()));
                }
                return value.getDays_remaining() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getDays_remaining())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BoostedRateInformation value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Double dValueOf = Double.valueOf(value.getBoosted_apy());
                Double dValueOf2 = Double.valueOf(0.0d);
                if (!dValueOf.equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getBoosted_apy()));
                }
                if (!Double.valueOf(value.getOriginal_apy()).equals(dValueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getOriginal_apy()));
                }
                if (value.getDays_remaining() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getDays_remaining()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BoostedRateInformation value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getDays_remaining() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, (int) Integer.valueOf(value.getDays_remaining()));
                }
                if (!Double.valueOf(value.getOriginal_apy()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getOriginal_apy()));
                }
                if (Double.valueOf(value.getBoosted_apy()).equals(dValueOf)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getBoosted_apy()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BoostedRateInformation redact(BoostedRateInformation value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BoostedRateInformation.copy$default(value, 0.0d, 0.0d, 0, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BoostedRateInformation decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                int iIntValue = 0;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BoostedRateInformation(dDoubleValue, dDoubleValue2, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
