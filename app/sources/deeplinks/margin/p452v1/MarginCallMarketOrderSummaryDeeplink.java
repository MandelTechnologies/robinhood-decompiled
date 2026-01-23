package deeplinks.margin.p452v1;

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

/* compiled from: MarginCallMarketOrderSummaryDeeplink.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001c"}, m3636d2 = {"Ldeeplinks/margin/v1/MarginCallMarketOrderSummaryDeeplink;", "Lcom/squareup/wire/Message;", "", "account_number", "", "close_positions_count", "", "estimated_value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)V", "getAccount_number", "()Ljava/lang/String;", "getClose_positions_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEstimated_value", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lokio/ByteString;)Ldeeplinks/margin/v1/MarginCallMarketOrderSummaryDeeplink;", "Companion", "deeplinks.margin_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class MarginCallMarketOrderSummaryDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<MarginCallMarketOrderSummaryDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    private final Integer close_positions_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String estimated_value;

    public MarginCallMarketOrderSummaryDeeplink() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27950newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public /* synthetic */ MarginCallMarketOrderSummaryDeeplink(String str, Integer num, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Integer getClose_positions_count() {
        return this.close_positions_count;
    }

    public final String getEstimated_value() {
        return this.estimated_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginCallMarketOrderSummaryDeeplink(String account_number, Integer num, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.close_positions_count = num;
        this.estimated_value = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27950newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MarginCallMarketOrderSummaryDeeplink)) {
            return false;
        }
        MarginCallMarketOrderSummaryDeeplink marginCallMarketOrderSummaryDeeplink = (MarginCallMarketOrderSummaryDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), marginCallMarketOrderSummaryDeeplink.unknownFields()) && Intrinsics.areEqual(this.account_number, marginCallMarketOrderSummaryDeeplink.account_number) && Intrinsics.areEqual(this.close_positions_count, marginCallMarketOrderSummaryDeeplink.close_positions_count) && Intrinsics.areEqual(this.estimated_value, marginCallMarketOrderSummaryDeeplink.estimated_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37;
        Integer num = this.close_positions_count;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.estimated_value;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        Integer num = this.close_positions_count;
        if (num != null) {
            arrayList.add("close_positions_count=" + num);
        }
        String str = this.estimated_value;
        if (str != null) {
            arrayList.add("estimated_value=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarginCallMarketOrderSummaryDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MarginCallMarketOrderSummaryDeeplink copy$default(MarginCallMarketOrderSummaryDeeplink marginCallMarketOrderSummaryDeeplink, String str, Integer num, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marginCallMarketOrderSummaryDeeplink.account_number;
        }
        if ((i & 2) != 0) {
            num = marginCallMarketOrderSummaryDeeplink.close_positions_count;
        }
        if ((i & 4) != 0) {
            str2 = marginCallMarketOrderSummaryDeeplink.estimated_value;
        }
        if ((i & 8) != 0) {
            byteString = marginCallMarketOrderSummaryDeeplink.unknownFields();
        }
        return marginCallMarketOrderSummaryDeeplink.copy(str, num, str2, byteString);
    }

    public final MarginCallMarketOrderSummaryDeeplink copy(String account_number, Integer close_positions_count, String estimated_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MarginCallMarketOrderSummaryDeeplink(account_number, close_positions_count, estimated_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MarginCallMarketOrderSummaryDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MarginCallMarketOrderSummaryDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.margin.v1.MarginCallMarketOrderSummaryDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MarginCallMarketOrderSummaryDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                return size + ProtoAdapter.INT32.encodedSizeWithTag(2, value.getClose_positions_count()) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getEstimated_value());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MarginCallMarketOrderSummaryDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getClose_positions_count());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEstimated_value());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MarginCallMarketOrderSummaryDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEstimated_value());
                ProtoAdapter.INT32.encodeWithTag(writer, 2, (int) value.getClose_positions_count());
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MarginCallMarketOrderSummaryDeeplink redact(MarginCallMarketOrderSummaryDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MarginCallMarketOrderSummaryDeeplink.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MarginCallMarketOrderSummaryDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Integer numDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MarginCallMarketOrderSummaryDeeplink(strDecode, numDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        numDecode = ProtoAdapter.INT32.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
