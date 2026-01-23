package com.robinhood.copilot.proto.p286v1;

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

/* compiled from: BottomSheet.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BottomSheet;", "Lcom/squareup/wire/Message;", "", "analyst_price_targets", "Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargets;", "peer_average", "Lcom/robinhood/copilot/proto/v1/PeerAverage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargets;Lcom/robinhood/copilot/proto/v1/PeerAverage;Lokio/ByteString;)V", "getAnalyst_price_targets", "()Lcom/robinhood/copilot/proto/v1/TopAnalystPriceTargets;", "getPeer_average", "()Lcom/robinhood/copilot/proto/v1/PeerAverage;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BottomSheet extends Message {

    @JvmField
    public static final ProtoAdapter<BottomSheet> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.TopAnalystPriceTargets#ADAPTER", jsonName = "analystPriceTargets", oneofName = "content", schemaIndex = 0, tag = 1)
    private final TopAnalystPriceTargets analyst_price_targets;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.PeerAverage#ADAPTER", jsonName = "peerAverage", oneofName = "content", schemaIndex = 1, tag = 2)
    private final PeerAverage peer_average;

    public BottomSheet() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22072newBuilder();
    }

    public final TopAnalystPriceTargets getAnalyst_price_targets() {
        return this.analyst_price_targets;
    }

    public final PeerAverage getPeer_average() {
        return this.peer_average;
    }

    public /* synthetic */ BottomSheet(TopAnalystPriceTargets topAnalystPriceTargets, PeerAverage peerAverage, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : topAnalystPriceTargets, (i & 2) != 0 ? null : peerAverage, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheet(TopAnalystPriceTargets topAnalystPriceTargets, PeerAverage peerAverage, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.analyst_price_targets = topAnalystPriceTargets;
        this.peer_average = peerAverage;
        if (Internal.countNonNull(topAnalystPriceTargets, peerAverage) > 1) {
            throw new IllegalArgumentException("At most one of analyst_price_targets, peer_average may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22072newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BottomSheet)) {
            return false;
        }
        BottomSheet bottomSheet = (BottomSheet) other;
        return Intrinsics.areEqual(unknownFields(), bottomSheet.unknownFields()) && Intrinsics.areEqual(this.analyst_price_targets, bottomSheet.analyst_price_targets) && Intrinsics.areEqual(this.peer_average, bottomSheet.peer_average);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        TopAnalystPriceTargets topAnalystPriceTargets = this.analyst_price_targets;
        int iHashCode2 = (iHashCode + (topAnalystPriceTargets != null ? topAnalystPriceTargets.hashCode() : 0)) * 37;
        PeerAverage peerAverage = this.peer_average;
        int iHashCode3 = iHashCode2 + (peerAverage != null ? peerAverage.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        TopAnalystPriceTargets topAnalystPriceTargets = this.analyst_price_targets;
        if (topAnalystPriceTargets != null) {
            arrayList.add("analyst_price_targets=" + topAnalystPriceTargets);
        }
        PeerAverage peerAverage = this.peer_average;
        if (peerAverage != null) {
            arrayList.add("peer_average=" + peerAverage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BottomSheet{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, TopAnalystPriceTargets topAnalystPriceTargets, PeerAverage peerAverage, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            topAnalystPriceTargets = bottomSheet.analyst_price_targets;
        }
        if ((i & 2) != 0) {
            peerAverage = bottomSheet.peer_average;
        }
        if ((i & 4) != 0) {
            byteString = bottomSheet.unknownFields();
        }
        return bottomSheet.copy(topAnalystPriceTargets, peerAverage, byteString);
    }

    public final BottomSheet copy(TopAnalystPriceTargets analyst_price_targets, PeerAverage peer_average, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BottomSheet(analyst_price_targets, peer_average, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BottomSheet.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BottomSheet>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.BottomSheet$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BottomSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + TopAnalystPriceTargets.ADAPTER.encodedSizeWithTag(1, value.getAnalyst_price_targets()) + PeerAverage.ADAPTER.encodedSizeWithTag(2, value.getPeer_average());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BottomSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                TopAnalystPriceTargets.ADAPTER.encodeWithTag(writer, 1, (int) value.getAnalyst_price_targets());
                PeerAverage.ADAPTER.encodeWithTag(writer, 2, (int) value.getPeer_average());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BottomSheet value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PeerAverage.ADAPTER.encodeWithTag(writer, 2, (int) value.getPeer_average());
                TopAnalystPriceTargets.ADAPTER.encodeWithTag(writer, 1, (int) value.getAnalyst_price_targets());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheet redact(BottomSheet value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TopAnalystPriceTargets analyst_price_targets = value.getAnalyst_price_targets();
                TopAnalystPriceTargets topAnalystPriceTargetsRedact = analyst_price_targets != null ? TopAnalystPriceTargets.ADAPTER.redact(analyst_price_targets) : null;
                PeerAverage peer_average = value.getPeer_average();
                return value.copy(topAnalystPriceTargetsRedact, peer_average != null ? PeerAverage.ADAPTER.redact(peer_average) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BottomSheet decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                TopAnalystPriceTargets topAnalystPriceTargetsDecode = null;
                PeerAverage peerAverageDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BottomSheet(topAnalystPriceTargetsDecode, peerAverageDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        topAnalystPriceTargetsDecode = TopAnalystPriceTargets.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        peerAverageDecode = PeerAverage.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
