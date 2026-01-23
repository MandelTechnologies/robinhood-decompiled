package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.PerpetualDetailComponentType;
import crypto_perpetuals.common.p435v1.TradingStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetPerpabilityResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPerpabilityResponse;", "Lcom/squareup/wire/Message;", "", "perpetual_contract_id", "", "component_types", "", "Lcrypto_perpetuals/common/v1/PerpetualDetailComponentType;", "trading_status", "Lcrypto_perpetuals/common/v1/TradingStatus;", "banner_message", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcrypto_perpetuals/common/v1/TradingStatus;Ljava/lang/String;Lokio/ByteString;)V", "getPerpetual_contract_id", "()Ljava/lang/String;", "getTrading_status", "()Lcrypto_perpetuals/common/v1/TradingStatus;", "getBanner_message", "getComponent_types", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetPerpabilityResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPerpabilityResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bannerMessage", schemaIndex = 3, tag = 4)
    private final String banner_message;

    @WireField(adapter = "crypto_perpetuals.common.v1.PerpetualDetailComponentType#ADAPTER", jsonName = "componentTypes", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<PerpetualDetailComponentType> component_types;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "perpetualContractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String perpetual_contract_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.TradingStatus#ADAPTER", jsonName = "tradingStatus", schemaIndex = 2, tag = 3)
    private final TradingStatus trading_status;

    public GetPerpabilityResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27873newBuilder();
    }

    public final String getPerpetual_contract_id() {
        return this.perpetual_contract_id;
    }

    public /* synthetic */ GetPerpabilityResponse(String str, List list, TradingStatus tradingStatus, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : tradingStatus, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TradingStatus getTrading_status() {
        return this.trading_status;
    }

    public final String getBanner_message() {
        return this.banner_message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPerpabilityResponse(String perpetual_contract_id, List<? extends PerpetualDetailComponentType> component_types, TradingStatus tradingStatus, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(component_types, "component_types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.perpetual_contract_id = perpetual_contract_id;
        this.trading_status = tradingStatus;
        this.banner_message = str;
        this.component_types = Internal.immutableCopyOf("component_types", component_types);
    }

    public final List<PerpetualDetailComponentType> getComponent_types() {
        return this.component_types;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27873newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPerpabilityResponse)) {
            return false;
        }
        GetPerpabilityResponse getPerpabilityResponse = (GetPerpabilityResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPerpabilityResponse.unknownFields()) && Intrinsics.areEqual(this.perpetual_contract_id, getPerpabilityResponse.perpetual_contract_id) && Intrinsics.areEqual(this.component_types, getPerpabilityResponse.component_types) && this.trading_status == getPerpabilityResponse.trading_status && Intrinsics.areEqual(this.banner_message, getPerpabilityResponse.banner_message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.perpetual_contract_id.hashCode()) * 37) + this.component_types.hashCode()) * 37;
        TradingStatus tradingStatus = this.trading_status;
        int iHashCode2 = (iHashCode + (tradingStatus != null ? tradingStatus.hashCode() : 0)) * 37;
        String str = this.banner_message;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("perpetual_contract_id=" + Internal.sanitize(this.perpetual_contract_id));
        if (!this.component_types.isEmpty()) {
            arrayList.add("component_types=" + this.component_types);
        }
        TradingStatus tradingStatus = this.trading_status;
        if (tradingStatus != null) {
            arrayList.add("trading_status=" + tradingStatus);
        }
        String str = this.banner_message;
        if (str != null) {
            arrayList.add("banner_message=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPerpabilityResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPerpabilityResponse copy$default(GetPerpabilityResponse getPerpabilityResponse, String str, List list, TradingStatus tradingStatus, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPerpabilityResponse.perpetual_contract_id;
        }
        if ((i & 2) != 0) {
            list = getPerpabilityResponse.component_types;
        }
        if ((i & 4) != 0) {
            tradingStatus = getPerpabilityResponse.trading_status;
        }
        if ((i & 8) != 0) {
            str2 = getPerpabilityResponse.banner_message;
        }
        if ((i & 16) != 0) {
            byteString = getPerpabilityResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        TradingStatus tradingStatus2 = tradingStatus;
        return getPerpabilityResponse.copy(str, list, tradingStatus2, str2, byteString2);
    }

    public final GetPerpabilityResponse copy(String perpetual_contract_id, List<? extends PerpetualDetailComponentType> component_types, TradingStatus trading_status, String banner_message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(component_types, "component_types");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPerpabilityResponse(perpetual_contract_id, component_types, trading_status, banner_message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPerpabilityResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPerpabilityResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.GetPerpabilityResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPerpabilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPerpetual_contract_id());
                }
                return size + PerpetualDetailComponentType.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getComponent_types()) + TradingStatus.ADAPTER.encodedSizeWithTag(3, value.getTrading_status()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBanner_message());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPerpabilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPerpetual_contract_id());
                }
                PerpetualDetailComponentType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getComponent_types());
                TradingStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getTrading_status());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getBanner_message());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPerpabilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getBanner_message());
                TradingStatus.ADAPTER.encodeWithTag(writer, 3, (int) value.getTrading_status());
                PerpetualDetailComponentType.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getComponent_types());
                if (Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getPerpetual_contract_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPerpabilityResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                TradingStatus tradingStatusDecode = null;
                String strDecode2 = null;
                while (true) {
                    String str = strDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetPerpabilityResponse(str, arrayList, tradingStatusDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag != 1) {
                            if (iNextTag == 2) {
                                try {
                                    PerpetualDetailComponentType.ADAPTER.tryDecode(reader, arrayList);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                try {
                                    tradingStatusDecode = TradingStatus.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                            } else if (iNextTag == 4) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                    strDecode = ProtoAdapter.STRING.decode(reader);
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPerpabilityResponse redact(GetPerpabilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetPerpabilityResponse.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }
}
