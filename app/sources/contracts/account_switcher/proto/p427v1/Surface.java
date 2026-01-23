package contracts.account_switcher.proto.p427v1;

import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
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

/* compiled from: Surface.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcontracts/account_switcher/proto/v1/Surface;", "Lcom/squareup/wire/Message;", "", "acats", "Lcontracts/account_switcher/proto/v1/SurfaceAcats;", TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, "Lcontracts/account_switcher/proto/v1/SurfaceTradeAccountSwitcher;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/account_switcher/proto/v1/SurfaceAcats;Lcontracts/account_switcher/proto/v1/SurfaceTradeAccountSwitcher;Lokio/ByteString;)V", "getAcats", "()Lcontracts/account_switcher/proto/v1/SurfaceAcats;", "getTrade", "()Lcontracts/account_switcher/proto/v1/SurfaceTradeAccountSwitcher;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "contracts.account_switcher.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Surface extends Message {

    @JvmField
    public static final ProtoAdapter<Surface> ADAPTER;

    @WireField(adapter = "contracts.account_switcher.proto.v1.SurfaceAcats#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final SurfaceAcats acats;

    @WireField(adapter = "contracts.account_switcher.proto.v1.SurfaceTradeAccountSwitcher#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
    private final SurfaceTradeAccountSwitcher trade;

    public Surface() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27612newBuilder();
    }

    public final SurfaceAcats getAcats() {
        return this.acats;
    }

    public final SurfaceTradeAccountSwitcher getTrade() {
        return this.trade;
    }

    public /* synthetic */ Surface(SurfaceAcats surfaceAcats, SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcher, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : surfaceAcats, (i & 2) != 0 ? null : surfaceTradeAccountSwitcher, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Surface(SurfaceAcats surfaceAcats, SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcher, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.acats = surfaceAcats;
        this.trade = surfaceTradeAccountSwitcher;
        if (Internal.countNonNull(surfaceAcats, surfaceTradeAccountSwitcher) > 1) {
            throw new IllegalArgumentException("At most one of acats, trade may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27612newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Surface)) {
            return false;
        }
        Surface surface = (Surface) other;
        return Intrinsics.areEqual(unknownFields(), surface.unknownFields()) && Intrinsics.areEqual(this.acats, surface.acats) && Intrinsics.areEqual(this.trade, surface.trade);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SurfaceAcats surfaceAcats = this.acats;
        int iHashCode2 = (iHashCode + (surfaceAcats != null ? surfaceAcats.hashCode() : 0)) * 37;
        SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcher = this.trade;
        int iHashCode3 = iHashCode2 + (surfaceTradeAccountSwitcher != null ? surfaceTradeAccountSwitcher.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SurfaceAcats surfaceAcats = this.acats;
        if (surfaceAcats != null) {
            arrayList.add("acats=" + surfaceAcats);
        }
        SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcher = this.trade;
        if (surfaceTradeAccountSwitcher != null) {
            arrayList.add("trade=" + surfaceTradeAccountSwitcher);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Surface{", "}", 0, null, null, 56, null);
    }

    public final Surface copy(SurfaceAcats acats, SurfaceTradeAccountSwitcher trade, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Surface(acats, trade, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Surface.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Surface>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.account_switcher.proto.v1.Surface$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Surface value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SurfaceAcats.ADAPTER.encodedSizeWithTag(1, value.getAcats()) + SurfaceTradeAccountSwitcher.ADAPTER.encodedSizeWithTag(2, value.getTrade());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Surface value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SurfaceAcats.ADAPTER.encodeWithTag(writer, 1, (int) value.getAcats());
                SurfaceTradeAccountSwitcher.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrade());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Surface value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SurfaceTradeAccountSwitcher.ADAPTER.encodeWithTag(writer, 2, (int) value.getTrade());
                SurfaceAcats.ADAPTER.encodeWithTag(writer, 1, (int) value.getAcats());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Surface redact(Surface value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SurfaceAcats acats = value.getAcats();
                SurfaceAcats surfaceAcatsRedact = acats != null ? SurfaceAcats.ADAPTER.redact(acats) : null;
                SurfaceTradeAccountSwitcher trade = value.getTrade();
                return value.copy(surfaceAcatsRedact, trade != null ? SurfaceTradeAccountSwitcher.ADAPTER.redact(trade) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Surface decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SurfaceAcats surfaceAcatsDecode = null;
                SurfaceTradeAccountSwitcher surfaceTradeAccountSwitcherDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Surface(surfaceAcatsDecode, surfaceTradeAccountSwitcherDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        surfaceAcatsDecode = SurfaceAcats.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        surfaceTradeAccountSwitcherDecode = SurfaceTradeAccountSwitcher.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
