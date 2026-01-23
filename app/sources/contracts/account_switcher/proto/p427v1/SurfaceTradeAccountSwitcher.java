package contracts.account_switcher.proto.p427v1;

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

/* compiled from: SurfaceTradeAccountSwitcher.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J(\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/SurfaceTradeAccountSwitcher;", "Lcom/squareup/wire/Message;", "", "active_account_number", "", "trade_account_switcher", "Lcontracts/account_switcher/proto/v1/TradeAccountSwitcher;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcontracts/account_switcher/proto/v1/TradeAccountSwitcher;Lokio/ByteString;)V", "getActive_account_number", "()Ljava/lang/String;", "getTrade_account_switcher", "()Lcontracts/account_switcher/proto/v1/TradeAccountSwitcher;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SurfaceTradeAccountSwitcher extends Message {

    @JvmField
    public static final ProtoAdapter<SurfaceTradeAccountSwitcher> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activeAccountNumber", schemaIndex = 0, tag = 1)
    private final String active_account_number;

    @WireField(adapter = "contracts.account_switcher.proto.v1.TradeAccountSwitcher#ADAPTER", jsonName = "tradeAccountSwitcher", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TradeAccountSwitcher trade_account_switcher;

    public SurfaceTradeAccountSwitcher() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27615newBuilder();
    }

    public final String getActive_account_number() {
        return this.active_account_number;
    }

    public final TradeAccountSwitcher getTrade_account_switcher() {
        return this.trade_account_switcher;
    }

    public /* synthetic */ SurfaceTradeAccountSwitcher(String str, TradeAccountSwitcher tradeAccountSwitcher, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : tradeAccountSwitcher, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurfaceTradeAccountSwitcher(String str, TradeAccountSwitcher tradeAccountSwitcher, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.active_account_number = str;
        this.trade_account_switcher = tradeAccountSwitcher;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27615newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SurfaceTradeAccountSwitcher)) {
            return false;
        }
        SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcher = (SurfaceTradeAccountSwitcher) other;
        return Intrinsics.areEqual(unknownFields(), surfaceTradeAccountSwitcher.unknownFields()) && Intrinsics.areEqual(this.active_account_number, surfaceTradeAccountSwitcher.active_account_number) && Intrinsics.areEqual(this.trade_account_switcher, surfaceTradeAccountSwitcher.trade_account_switcher);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.active_account_number;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        TradeAccountSwitcher tradeAccountSwitcher = this.trade_account_switcher;
        int iHashCode3 = iHashCode2 + (tradeAccountSwitcher != null ? tradeAccountSwitcher.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.active_account_number;
        if (str != null) {
            arrayList.add("active_account_number=" + Internal.sanitize(str));
        }
        TradeAccountSwitcher tradeAccountSwitcher = this.trade_account_switcher;
        if (tradeAccountSwitcher != null) {
            arrayList.add("trade_account_switcher=" + tradeAccountSwitcher);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SurfaceTradeAccountSwitcher{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SurfaceTradeAccountSwitcher copy$default(SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcher, String str, TradeAccountSwitcher tradeAccountSwitcher, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surfaceTradeAccountSwitcher.active_account_number;
        }
        if ((i & 2) != 0) {
            tradeAccountSwitcher = surfaceTradeAccountSwitcher.trade_account_switcher;
        }
        if ((i & 4) != 0) {
            byteString = surfaceTradeAccountSwitcher.unknownFields();
        }
        return surfaceTradeAccountSwitcher.copy(str, tradeAccountSwitcher, byteString);
    }

    public final SurfaceTradeAccountSwitcher copy(String active_account_number, TradeAccountSwitcher trade_account_switcher, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SurfaceTradeAccountSwitcher(active_account_number, trade_account_switcher, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SurfaceTradeAccountSwitcher.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SurfaceTradeAccountSwitcher>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.account_switcher.proto.v1.SurfaceTradeAccountSwitcher$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SurfaceTradeAccountSwitcher value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getActive_account_number());
                return value.getTrade_account_switcher() != null ? size + TradeAccountSwitcher.ADAPTER.encodedSizeWithTag(2, value.getTrade_account_switcher()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SurfaceTradeAccountSwitcher value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getActive_account_number());
                if (value.getTrade_account_switcher() != null) {
                    TradeAccountSwitcher.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrade_account_switcher());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SurfaceTradeAccountSwitcher value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTrade_account_switcher() != null) {
                    TradeAccountSwitcher.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrade_account_switcher());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getActive_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SurfaceTradeAccountSwitcher redact(SurfaceTradeAccountSwitcher value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TradeAccountSwitcher trade_account_switcher = value.getTrade_account_switcher();
                return SurfaceTradeAccountSwitcher.copy$default(value, null, trade_account_switcher != null ? TradeAccountSwitcher.ADAPTER.redact(trade_account_switcher) : null, ByteString.EMPTY, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SurfaceTradeAccountSwitcher decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                TradeAccountSwitcher tradeAccountSwitcherDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SurfaceTradeAccountSwitcher(strDecode, tradeAccountSwitcherDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        tradeAccountSwitcherDecode = TradeAccountSwitcher.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
