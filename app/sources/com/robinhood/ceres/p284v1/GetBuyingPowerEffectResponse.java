package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Money;
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

/* compiled from: GetBuyingPowerEffectResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016Jn\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetBuyingPowerEffectResponse;", "Lcom/squareup/wire/Message;", "", "buying_power_effect", "Lcom/robinhood/rosetta/common/Money;", "total_fee", "stale_data", "", "total_commission", "total_gold_savings", "estimated_margin_required", "buying_power_before_order", "buying_power_after_order", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;ZLcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getBuying_power_effect", "()Lcom/robinhood/rosetta/common/Money;", "getTotal_fee", "getStale_data", "()Z", "getTotal_commission", "getTotal_gold_savings", "getEstimated_margin_required", "getBuying_power_before_order$annotations", "()V", "getBuying_power_before_order", "getBuying_power_after_order$annotations", "getBuying_power_after_order", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetBuyingPowerEffectResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetBuyingPowerEffectResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "buyingPowerAfterOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 2)
    private final Money buying_power_after_order;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "buyingPowerBeforeOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 1)
    private final Money buying_power_before_order;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "buyingPowerEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 3)
    private final Money buying_power_effect;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "estimatedMarginRequired", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 8)
    private final Money estimated_margin_required;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "staleData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 5)
    private final boolean stale_data;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalCommission", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 6)
    private final Money total_commission;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 4)
    private final Money total_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalGoldSavings", schemaIndex = 4, tag = 7)
    private final Money total_gold_savings;

    public GetBuyingPowerEffectResponse() {
        this(null, null, false, null, null, null, null, null, null, 511, null);
    }

    @Deprecated
    public static /* synthetic */ void getBuying_power_after_order$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getBuying_power_before_order$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20337newBuilder();
    }

    public final Money getBuying_power_effect() {
        return this.buying_power_effect;
    }

    public final Money getTotal_fee() {
        return this.total_fee;
    }

    public final boolean getStale_data() {
        return this.stale_data;
    }

    public final Money getTotal_commission() {
        return this.total_commission;
    }

    public final Money getTotal_gold_savings() {
        return this.total_gold_savings;
    }

    public final Money getEstimated_margin_required() {
        return this.estimated_margin_required;
    }

    public final Money getBuying_power_before_order() {
        return this.buying_power_before_order;
    }

    public final Money getBuying_power_after_order() {
        return this.buying_power_after_order;
    }

    public /* synthetic */ GetBuyingPowerEffectResponse(Money money, Money money2, boolean z, Money money3, Money money4, Money money5, Money money6, Money money7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : money3, (i & 16) != 0 ? null : money4, (i & 32) != 0 ? null : money5, (i & 64) != 0 ? null : money6, (i & 128) != 0 ? null : money7, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBuyingPowerEffectResponse(Money money, Money money2, boolean z, Money money3, Money money4, Money money5, Money money6, Money money7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.buying_power_effect = money;
        this.total_fee = money2;
        this.stale_data = z;
        this.total_commission = money3;
        this.total_gold_savings = money4;
        this.estimated_margin_required = money5;
        this.buying_power_before_order = money6;
        this.buying_power_after_order = money7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20337newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetBuyingPowerEffectResponse)) {
            return false;
        }
        GetBuyingPowerEffectResponse getBuyingPowerEffectResponse = (GetBuyingPowerEffectResponse) other;
        return Intrinsics.areEqual(unknownFields(), getBuyingPowerEffectResponse.unknownFields()) && Intrinsics.areEqual(this.buying_power_effect, getBuyingPowerEffectResponse.buying_power_effect) && Intrinsics.areEqual(this.total_fee, getBuyingPowerEffectResponse.total_fee) && this.stale_data == getBuyingPowerEffectResponse.stale_data && Intrinsics.areEqual(this.total_commission, getBuyingPowerEffectResponse.total_commission) && Intrinsics.areEqual(this.total_gold_savings, getBuyingPowerEffectResponse.total_gold_savings) && Intrinsics.areEqual(this.estimated_margin_required, getBuyingPowerEffectResponse.estimated_margin_required) && Intrinsics.areEqual(this.buying_power_before_order, getBuyingPowerEffectResponse.buying_power_before_order) && Intrinsics.areEqual(this.buying_power_after_order, getBuyingPowerEffectResponse.buying_power_after_order);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.buying_power_effect;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_fee;
        int iHashCode3 = (((iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37) + Boolean.hashCode(this.stale_data)) * 37;
        Money money3 = this.total_commission;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.total_gold_savings;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.estimated_margin_required;
        int iHashCode6 = (iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.buying_power_before_order;
        int iHashCode7 = (iHashCode6 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Money money7 = this.buying_power_after_order;
        int iHashCode8 = iHashCode7 + (money7 != null ? money7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.buying_power_effect;
        if (money != null) {
            arrayList.add("buying_power_effect=" + money);
        }
        Money money2 = this.total_fee;
        if (money2 != null) {
            arrayList.add("total_fee=" + money2);
        }
        arrayList.add("stale_data=" + this.stale_data);
        Money money3 = this.total_commission;
        if (money3 != null) {
            arrayList.add("total_commission=" + money3);
        }
        Money money4 = this.total_gold_savings;
        if (money4 != null) {
            arrayList.add("total_gold_savings=" + money4);
        }
        Money money5 = this.estimated_margin_required;
        if (money5 != null) {
            arrayList.add("estimated_margin_required=" + money5);
        }
        Money money6 = this.buying_power_before_order;
        if (money6 != null) {
            arrayList.add("buying_power_before_order=" + money6);
        }
        Money money7 = this.buying_power_after_order;
        if (money7 != null) {
            arrayList.add("buying_power_after_order=" + money7);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBuyingPowerEffectResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetBuyingPowerEffectResponse copy$default(GetBuyingPowerEffectResponse getBuyingPowerEffectResponse, Money money, Money money2, boolean z, Money money3, Money money4, Money money5, Money money6, Money money7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = getBuyingPowerEffectResponse.buying_power_effect;
        }
        if ((i & 2) != 0) {
            money2 = getBuyingPowerEffectResponse.total_fee;
        }
        if ((i & 4) != 0) {
            z = getBuyingPowerEffectResponse.stale_data;
        }
        if ((i & 8) != 0) {
            money3 = getBuyingPowerEffectResponse.total_commission;
        }
        if ((i & 16) != 0) {
            money4 = getBuyingPowerEffectResponse.total_gold_savings;
        }
        if ((i & 32) != 0) {
            money5 = getBuyingPowerEffectResponse.estimated_margin_required;
        }
        if ((i & 64) != 0) {
            money6 = getBuyingPowerEffectResponse.buying_power_before_order;
        }
        if ((i & 128) != 0) {
            money7 = getBuyingPowerEffectResponse.buying_power_after_order;
        }
        if ((i & 256) != 0) {
            byteString = getBuyingPowerEffectResponse.unknownFields();
        }
        Money money8 = money7;
        ByteString byteString2 = byteString;
        Money money9 = money5;
        Money money10 = money6;
        Money money11 = money4;
        boolean z2 = z;
        return getBuyingPowerEffectResponse.copy(money, money2, z2, money3, money11, money9, money10, money8, byteString2);
    }

    public final GetBuyingPowerEffectResponse copy(Money buying_power_effect, Money total_fee, boolean stale_data, Money total_commission, Money total_gold_savings, Money estimated_margin_required, Money buying_power_before_order, Money buying_power_after_order, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetBuyingPowerEffectResponse(buying_power_effect, total_fee, stale_data, total_commission, total_gold_savings, estimated_margin_required, buying_power_before_order, buying_power_after_order, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetBuyingPowerEffectResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetBuyingPowerEffectResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetBuyingPowerEffectResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetBuyingPowerEffectResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBuying_power_effect() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getBuying_power_effect());
                }
                if (value.getTotal_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getTotal_fee());
                }
                if (value.getStale_data()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getStale_data()));
                }
                if (value.getTotal_commission() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getTotal_commission());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(7, value.getTotal_gold_savings());
                if (value.getEstimated_margin_required() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getEstimated_margin_required());
                }
                if (value.getBuying_power_before_order() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(1, value.getBuying_power_before_order());
                }
                return value.getBuying_power_after_order() != null ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, value.getBuying_power_after_order()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetBuyingPowerEffectResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBuying_power_effect() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getBuying_power_effect());
                }
                if (value.getTotal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getTotal_fee());
                }
                if (value.getStale_data()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getStale_data()));
                }
                if (value.getTotal_commission() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getTotal_commission());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTotal_gold_savings());
                if (value.getEstimated_margin_required() != null) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getEstimated_margin_required());
                }
                if (value.getBuying_power_before_order() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getBuying_power_before_order());
                }
                if (value.getBuying_power_after_order() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getBuying_power_after_order());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetBuyingPowerEffectResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getBuying_power_after_order() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getBuying_power_after_order());
                }
                if (value.getBuying_power_before_order() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getBuying_power_before_order());
                }
                if (value.getEstimated_margin_required() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 8, (int) value.getEstimated_margin_required());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getTotal_gold_savings());
                if (value.getTotal_commission() != null) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_commission());
                }
                if (value.getStale_data()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getStale_data()));
                }
                if (value.getTotal_fee() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getTotal_fee());
                }
                if (value.getBuying_power_effect() != null) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getBuying_power_effect());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetBuyingPowerEffectResponse redact(GetBuyingPowerEffectResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money buying_power_effect = value.getBuying_power_effect();
                Money moneyRedact = buying_power_effect != null ? Money.ADAPTER.redact(buying_power_effect) : null;
                Money total_fee = value.getTotal_fee();
                Money moneyRedact2 = total_fee != null ? Money.ADAPTER.redact(total_fee) : null;
                Money total_commission = value.getTotal_commission();
                Money moneyRedact3 = total_commission != null ? Money.ADAPTER.redact(total_commission) : null;
                Money total_gold_savings = value.getTotal_gold_savings();
                Money moneyRedact4 = total_gold_savings != null ? Money.ADAPTER.redact(total_gold_savings) : null;
                Money estimated_margin_required = value.getEstimated_margin_required();
                Money moneyRedact5 = estimated_margin_required != null ? Money.ADAPTER.redact(estimated_margin_required) : null;
                Money buying_power_before_order = value.getBuying_power_before_order();
                Money moneyRedact6 = buying_power_before_order != null ? Money.ADAPTER.redact(buying_power_before_order) : null;
                Money buying_power_after_order = value.getBuying_power_after_order();
                return GetBuyingPowerEffectResponse.copy$default(value, moneyRedact, moneyRedact2, false, moneyRedact3, moneyRedact4, moneyRedact5, moneyRedact6, buying_power_after_order != null ? Money.ADAPTER.redact(buying_power_after_order) : null, ByteString.EMPTY, 4, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetBuyingPowerEffectResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                Money moneyDecode6 = null;
                boolean zBooleanValue = false;
                Money moneyDecode7 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                moneyDecode6 = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                moneyDecode7 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetBuyingPowerEffectResponse(moneyDecode, moneyDecode7, zBooleanValue, moneyDecode2, moneyDecode3, moneyDecode4, moneyDecode5, moneyDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
