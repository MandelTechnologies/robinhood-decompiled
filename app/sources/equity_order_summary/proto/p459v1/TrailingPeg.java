package equity_order_summary.proto.p459v1;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import rosetta.order.PegType;

/* compiled from: TrailingPeg.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J7\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001cR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lequity_order_summary/proto/v1/TrailingPeg;", "Lcom/squareup/wire/Message;", "", "percentage", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "", "peg_type", "Lrosetta/order/PegType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lrosetta/order/PegType;Lokio/ByteString;)V", "getPercentage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrice", "()Ljava/lang/String;", "getPeg_type", "()Lrosetta/order/PegType;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lrosetta/order/PegType;Lokio/ByteString;)Lequity_order_summary/proto/v1/TrailingPeg;", "Companion", "equity_order_summary.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class TrailingPeg extends Message {

    @JvmField
    public static final ProtoAdapter<TrailingPeg> ADAPTER;

    @WireField(adapter = "rosetta.order.PegType#ADAPTER", jsonName = "pegType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PegType peg_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
    private final Integer percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String price;

    public TrailingPeg() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28024newBuilder();
    }

    public final Integer getPercentage() {
        return this.percentage;
    }

    public final String getPrice() {
        return this.price;
    }

    public final PegType getPeg_type() {
        return this.peg_type;
    }

    public /* synthetic */ TrailingPeg(Integer num, String str, PegType pegType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? PegType.PEG_TYPE_UNSPECIFIED : pegType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrailingPeg(Integer num, String str, PegType peg_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.percentage = num;
        this.price = str;
        this.peg_type = peg_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28024newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TrailingPeg)) {
            return false;
        }
        TrailingPeg trailingPeg = (TrailingPeg) other;
        return Intrinsics.areEqual(unknownFields(), trailingPeg.unknownFields()) && Intrinsics.areEqual(this.percentage, trailingPeg.percentage) && Intrinsics.areEqual(this.price, trailingPeg.price) && this.peg_type == trailingPeg.peg_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.percentage;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.price;
        int iHashCode3 = ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.peg_type.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.percentage;
        if (num != null) {
            arrayList.add("percentage=" + num);
        }
        String str = this.price;
        if (str != null) {
            arrayList.add("price=" + Internal.sanitize(str));
        }
        arrayList.add("peg_type=" + this.peg_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "TrailingPeg{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TrailingPeg copy$default(TrailingPeg trailingPeg, Integer num, String str, PegType pegType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            num = trailingPeg.percentage;
        }
        if ((i & 2) != 0) {
            str = trailingPeg.price;
        }
        if ((i & 4) != 0) {
            pegType = trailingPeg.peg_type;
        }
        if ((i & 8) != 0) {
            byteString = trailingPeg.unknownFields();
        }
        return trailingPeg.copy(num, str, pegType, byteString);
    }

    public final TrailingPeg copy(Integer percentage, String price, PegType peg_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TrailingPeg(percentage, price, peg_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TrailingPeg.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TrailingPeg>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: equity_order_summary.proto.v1.TrailingPeg$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TrailingPeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.INT32.encodedSizeWithTag(1, value.getPercentage()) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPrice());
                return value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED ? size + PegType.ADAPTER.encodedSizeWithTag(3, value.getPeg_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TrailingPeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) value.getPercentage());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrice());
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 3, (int) value.getPeg_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TrailingPeg value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 3, (int) value.getPeg_type());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPrice());
                ProtoAdapter.INT32.encodeWithTag(writer, 1, (int) value.getPercentage());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TrailingPeg decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PegType pegTypeDecode = PegType.PEG_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Integer numDecode = null;
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TrailingPeg(numDecode, strDecode, pegTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            pegTypeDecode = PegType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TrailingPeg redact(TrailingPeg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TrailingPeg.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
