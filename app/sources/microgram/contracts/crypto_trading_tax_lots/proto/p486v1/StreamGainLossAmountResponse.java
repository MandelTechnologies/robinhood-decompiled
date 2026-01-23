package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamGainLossAmountResponse;
import okio.ByteString;

/* compiled from: StreamGainLossAmountResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse;", "Lcom/squareup/wire/Message;", "", "gain_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent;Lokio/ByteString;)V", "getGain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "GainLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class StreamGainLossAmountResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamGainLossAmountResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$GainLossContent#ADAPTER", jsonName = "gainLossContent", schemaIndex = 0, tag = 1)
    private final GainLossContent gain_loss_content;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamGainLossAmountResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28992newBuilder();
    }

    public final GainLossContent getGain_loss_content() {
        return this.gain_loss_content;
    }

    public /* synthetic */ StreamGainLossAmountResponse(GainLossContent gainLossContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gainLossContent, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamGainLossAmountResponse(GainLossContent gainLossContent, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.gain_loss_content = gainLossContent;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28992newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamGainLossAmountResponse)) {
            return false;
        }
        StreamGainLossAmountResponse streamGainLossAmountResponse = (StreamGainLossAmountResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamGainLossAmountResponse.unknownFields()) && Intrinsics.areEqual(this.gain_loss_content, streamGainLossAmountResponse.gain_loss_content);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        GainLossContent gainLossContent = this.gain_loss_content;
        int iHashCode2 = iHashCode + (gainLossContent != null ? gainLossContent.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        GainLossContent gainLossContent = this.gain_loss_content;
        if (gainLossContent != null) {
            arrayList.add("gain_loss_content=" + gainLossContent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamGainLossAmountResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamGainLossAmountResponse copy(GainLossContent gain_loss_content, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamGainLossAmountResponse(gain_loss_content, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamGainLossAmountResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamGainLossAmountResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamGainLossAmountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StreamGainLossAmountResponse.GainLossContent.ADAPTER.encodedSizeWithTag(1, value.getGain_loss_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamGainLossAmountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StreamGainLossAmountResponse.GainLossContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getGain_loss_content());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamGainLossAmountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamGainLossAmountResponse.GainLossContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getGain_loss_content());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamGainLossAmountResponse redact(StreamGainLossAmountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StreamGainLossAmountResponse.GainLossContent gain_loss_content = value.getGain_loss_content();
                return value.copy(gain_loss_content != null ? StreamGainLossAmountResponse.GainLossContent.ADAPTER.redact(gain_loss_content) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamGainLossAmountResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                StreamGainLossAmountResponse.GainLossContent gainLossContentDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamGainLossAmountResponse(gainLossContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        gainLossContentDecode = StreamGainLossAmountResponse.GainLossContent.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: StreamGainLossAmountResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedGainContent;", "estimated_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedLossContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedGainContent;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedLossContent;Lokio/ByteString;)V", "getEstimated_gain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedGainContent;", "getEstimated_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedLossContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EstimatedGainContent", "EstimatedLossContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GainLossContent extends Message {

        @JvmField
        public static final ProtoAdapter<GainLossContent> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$GainLossContent$EstimatedGainContent#ADAPTER", jsonName = "estimatedGainContent", oneofName = "type", schemaIndex = 0, tag = 1)
        private final EstimatedGainContent estimated_gain_content;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$GainLossContent$EstimatedLossContent#ADAPTER", jsonName = "estimatedLossContent", oneofName = "type", schemaIndex = 1, tag = 2)
        private final EstimatedLossContent estimated_loss_content;

        public GainLossContent() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28993newBuilder();
        }

        public final EstimatedGainContent getEstimated_gain_content() {
            return this.estimated_gain_content;
        }

        public final EstimatedLossContent getEstimated_loss_content() {
            return this.estimated_loss_content;
        }

        public /* synthetic */ GainLossContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : estimatedGainContent, (i & 2) != 0 ? null : estimatedLossContent, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GainLossContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.estimated_gain_content = estimatedGainContent;
            this.estimated_loss_content = estimatedLossContent;
            if (Internal.countNonNull(estimatedGainContent, estimatedLossContent) > 1) {
                throw new IllegalArgumentException("At most one of estimated_gain_content, estimated_loss_content may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28993newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof GainLossContent)) {
                return false;
            }
            GainLossContent gainLossContent = (GainLossContent) other;
            return Intrinsics.areEqual(unknownFields(), gainLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_content, gainLossContent.estimated_gain_content) && Intrinsics.areEqual(this.estimated_loss_content, gainLossContent.estimated_loss_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            int iHashCode2 = (iHashCode + (estimatedGainContent != null ? estimatedGainContent.hashCode() : 0)) * 37;
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            int iHashCode3 = iHashCode2 + (estimatedLossContent != null ? estimatedLossContent.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            if (estimatedGainContent != null) {
                arrayList.add("estimated_gain_content=" + estimatedGainContent);
            }
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            if (estimatedLossContent != null) {
                arrayList.add("estimated_loss_content=" + estimatedLossContent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GainLossContent{", "}", 0, null, null, 56, null);
        }

        public final GainLossContent copy(EstimatedGainContent estimated_gain_content, EstimatedLossContent estimated_loss_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new GainLossContent(estimated_gain_content, estimated_loss_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GainLossContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<GainLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$GainLossContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamGainLossAmountResponse.GainLossContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent.ADAPTER.encodedSizeWithTag(1, value.getEstimated_gain_content()) + StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent.ADAPTER.encodedSizeWithTag(2, value.getEstimated_loss_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamGainLossAmountResponse.GainLossContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                    StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamGainLossAmountResponse.GainLossContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamGainLossAmountResponse.GainLossContent redact(StreamGainLossAmountResponse.GainLossContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent estimated_gain_content = value.getEstimated_gain_content();
                    StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent estimatedGainContentRedact = estimated_gain_content != null ? StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent.ADAPTER.redact(estimated_gain_content) : null;
                    StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent estimated_loss_content = value.getEstimated_loss_content();
                    return value.copy(estimatedGainContentRedact, estimated_loss_content != null ? StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent.ADAPTER.redact(estimated_loss_content) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamGainLossAmountResponse.GainLossContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent estimatedGainContentDecode = null;
                    StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent estimatedLossContentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamGainLossAmountResponse.GainLossContent(estimatedGainContentDecode, estimatedLossContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            estimatedGainContentDecode = StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            estimatedLossContentDecode = StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: StreamGainLossAmountResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedGainContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_gain_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedGainContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedGainContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedGainQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_gain_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedGainContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m28994newBuilder();
            }

            public final String getEstimated_gain_quote_amount() {
                return this.estimated_gain_quote_amount;
            }

            public /* synthetic */ EstimatedGainContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedGainContent(String estimated_gain_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_gain_quote_amount = estimated_gain_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m28994newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedGainContent)) {
                    return false;
                }
                EstimatedGainContent estimatedGainContent = (EstimatedGainContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedGainContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_quote_amount, estimatedGainContent.estimated_gain_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_gain_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_gain_quote_amount=" + Internal.sanitize(this.estimated_gain_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedGainContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedGainContent copy$default(EstimatedGainContent estimatedGainContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedGainContent.estimated_gain_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedGainContent.unknownFields();
                }
                return estimatedGainContent.copy(str, byteString);
            }

            public final EstimatedGainContent copy(String estimated_gain_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedGainContent(estimated_gain_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedGainContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedGainContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$GainLossContent$EstimatedGainContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_gain_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent redact(StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamGainLossAmountResponse.GainLossContent.EstimatedGainContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }
        }

        /* compiled from: StreamGainLossAmountResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamGainLossAmountResponse$GainLossContent$EstimatedLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_loss_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_loss_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedLossContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedLossContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedLossQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_loss_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedLossContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m28995newBuilder();
            }

            public final String getEstimated_loss_quote_amount() {
                return this.estimated_loss_quote_amount;
            }

            public /* synthetic */ EstimatedLossContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedLossContent(String estimated_loss_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_loss_quote_amount = estimated_loss_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m28995newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedLossContent)) {
                    return false;
                }
                EstimatedLossContent estimatedLossContent = (EstimatedLossContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_loss_quote_amount, estimatedLossContent.estimated_loss_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_loss_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_loss_quote_amount=" + Internal.sanitize(this.estimated_loss_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedLossContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedLossContent copy$default(EstimatedLossContent estimatedLossContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedLossContent.estimated_loss_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedLossContent.unknownFields();
                }
                return estimatedLossContent.copy(str, byteString);
            }

            public final EstimatedLossContent copy(String estimated_loss_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedLossContent(estimated_loss_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedLossContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamGainLossAmountResponse$GainLossContent$EstimatedLossContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_loss_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent redact(StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamGainLossAmountResponse.GainLossContent.EstimatedLossContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                };
            }
        }
    }
}
