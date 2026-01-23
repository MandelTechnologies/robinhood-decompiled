package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.OrderType;
import rosetta.order.Platform;

/* compiled from: OrderMetadata.kt */
@kotlin.Metadata(m3635d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016R-\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"com/robinhood/rosetta/mainst/OrderMetadata$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/mainst/OrderMetadata;", "upstream_event_tagsAdapter", "", "", "getUpstream_event_tagsAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "upstream_event_tagsAdapter$delegate", "Lkotlin/Lazy;", "encodedSize", "", "value", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "Lcom/squareup/wire/ReverseProtoWriter;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "redact", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.rosetta.mainst.OrderMetadata$Companion$ADAPTER$1, reason: use source file name */
/* loaded from: classes21.dex */
public final class OrderMetadata2 extends ProtoAdapter<OrderMetadata> {

    /* renamed from: upstream_event_tagsAdapter$delegate, reason: from kotlin metadata */
    private final Lazy upstream_event_tagsAdapter;

    OrderMetadata2(FieldEncoding fieldEncoding, KClass<OrderMetadata> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/rosetta.mainst.OrderMetadata", syntax, (Object) null, "rosetta/rosetta/mainst/mainst.proto");
        this.upstream_event_tagsAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderMetadata$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderMetadata2.upstream_event_tagsAdapter_delegate$lambda$0();
            }
        });
    }

    private final ProtoAdapter<Map<String, String>> getUpstream_event_tagsAdapter() {
        return (ProtoAdapter) this.upstream_event_tagsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter upstream_event_tagsAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(OrderMetadata value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size() + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.getFlags());
        if (value.getPrevious_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
            size += OrderType.ADAPTER.encodedSizeWithTag(2, value.getPrevious_type());
        }
        if (value.getClient_marketdata() != null) {
            size += ClientMarketdata.ADAPTER.encodedSizeWithTag(3, value.getClient_marketdata());
        }
        if (value.getRhf_marketdata() != null) {
            size += RhfMarketdata.ADAPTER.encodedSizeWithTag(4, value.getRhf_marketdata());
        }
        if (value.getPlatform() != Platform.ORDER_PLATFORM_UNSPECIFIED) {
            size += Platform.ADAPTER.encodedSizeWithTag(5, value.getPlatform());
        }
        return size + getUpstream_event_tagsAdapter().encodedSizeWithTag(6, value.getUpstream_event_tags());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, OrderMetadata value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getFlags());
        if (value.getPrevious_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
            OrderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrevious_type());
        }
        if (value.getClient_marketdata() != null) {
            ClientMarketdata.ADAPTER.encodeWithTag(writer, 3, (int) value.getClient_marketdata());
        }
        if (value.getRhf_marketdata() != null) {
            RhfMarketdata.ADAPTER.encodeWithTag(writer, 4, (int) value.getRhf_marketdata());
        }
        if (value.getPlatform() != Platform.ORDER_PLATFORM_UNSPECIFIED) {
            Platform.ADAPTER.encodeWithTag(writer, 5, (int) value.getPlatform());
        }
        getUpstream_event_tagsAdapter().encodeWithTag(writer, 6, (int) value.getUpstream_event_tags());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, OrderMetadata value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        getUpstream_event_tagsAdapter().encodeWithTag(writer, 6, (int) value.getUpstream_event_tags());
        if (value.getPlatform() != Platform.ORDER_PLATFORM_UNSPECIFIED) {
            Platform.ADAPTER.encodeWithTag(writer, 5, (int) value.getPlatform());
        }
        if (value.getRhf_marketdata() != null) {
            RhfMarketdata.ADAPTER.encodeWithTag(writer, 4, (int) value.getRhf_marketdata());
        }
        if (value.getClient_marketdata() != null) {
            ClientMarketdata.ADAPTER.encodeWithTag(writer, 3, (int) value.getClient_marketdata());
        }
        if (value.getPrevious_type() != OrderType.ORDER_TYPE_UNSPECIFIED) {
            OrderType.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrevious_type());
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getFlags());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public OrderMetadata decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        ArrayList arrayList = new ArrayList();
        OrderType orderTypeDecode = OrderType.ORDER_TYPE_UNSPECIFIED;
        Platform platform = Platform.ORDER_PLATFORM_UNSPECIFIED;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long jBeginMessage = reader.beginMessage();
        ClientMarketdata clientMarketdataDecode = null;
        RhfMarketdata rhfMarketdataDecode = null;
        Platform platformDecode = platform;
        while (true) {
            OrderType orderType = orderTypeDecode;
            while (true) {
                int iNextTag = reader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                            break;
                        case 2:
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            clientMarketdataDecode = ClientMarketdata.ADAPTER.decode(reader);
                            break;
                        case 4:
                            rhfMarketdataDecode = RhfMarketdata.ADAPTER.decode(reader);
                            break;
                        case 5:
                            try {
                                platformDecode = Platform.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 6:
                            linkedHashMap.putAll(getUpstream_event_tagsAdapter().decode(reader));
                            break;
                        default:
                            reader.readUnknownField(iNextTag);
                            break;
                    }
                } else {
                    return new OrderMetadata(arrayList, orderType, clientMarketdataDecode, rhfMarketdataDecode, platformDecode, linkedHashMap, reader.endMessageAndGetUnknownFields(jBeginMessage));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public OrderMetadata redact(OrderMetadata value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ClientMarketdata client_marketdata = value.getClient_marketdata();
        ClientMarketdata clientMarketdataRedact = client_marketdata != null ? ClientMarketdata.ADAPTER.redact(client_marketdata) : null;
        RhfMarketdata rhf_marketdata = value.getRhf_marketdata();
        return OrderMetadata.copy$default(value, null, null, clientMarketdataRedact, rhf_marketdata != null ? RhfMarketdata.ADAPTER.redact(rhf_marketdata) : null, null, null, ByteString.EMPTY, 51, null);
    }
}
