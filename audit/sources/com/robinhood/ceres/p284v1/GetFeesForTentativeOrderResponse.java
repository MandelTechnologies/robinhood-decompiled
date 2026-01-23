package com.robinhood.ceres.p284v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetFeesForTentativeOrderResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016JX\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponse;", "Lcom/squareup/wire/Message;", "", "total_fee", "Lcom/robinhood/rosetta/common/Money;", "total_commission", "total_gold_savings", "total_fee_per_contract", "total_commission_per_contract", "total_gold_savings_per_contract", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lokio/ByteString;)V", "getTotal_fee", "()Lcom/robinhood/rosetta/common/Money;", "getTotal_commission", "getTotal_gold_savings", "getTotal_fee_per_contract", "getTotal_commission_per_contract", "getTotal_gold_savings_per_contract", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetFeesForTentativeOrderResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetFeesForTentativeOrderResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalCommission", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money total_commission;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalCommissionPerContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money total_commission_per_contract;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money total_fee;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalFeePerContract", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money total_fee_per_contract;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalGoldSavings", schemaIndex = 2, tag = 3)
    private final Money total_gold_savings;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "totalGoldSavingsPerContract", schemaIndex = 5, tag = 6)
    private final Money total_gold_savings_per_contract;

    public GetFeesForTentativeOrderResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20363newBuilder();
    }

    public final Money getTotal_fee() {
        return this.total_fee;
    }

    public final Money getTotal_commission() {
        return this.total_commission;
    }

    public final Money getTotal_gold_savings() {
        return this.total_gold_savings;
    }

    public final Money getTotal_fee_per_contract() {
        return this.total_fee_per_contract;
    }

    public final Money getTotal_commission_per_contract() {
        return this.total_commission_per_contract;
    }

    public final Money getTotal_gold_savings_per_contract() {
        return this.total_gold_savings_per_contract;
    }

    public /* synthetic */ GetFeesForTentativeOrderResponse(Money money, Money money2, Money money3, Money money4, Money money5, Money money6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : money4, (i & 16) != 0 ? null : money5, (i & 32) != 0 ? null : money6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeesForTentativeOrderResponse(Money money, Money money2, Money money3, Money money4, Money money5, Money money6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.total_fee = money;
        this.total_commission = money2;
        this.total_gold_savings = money3;
        this.total_fee_per_contract = money4;
        this.total_commission_per_contract = money5;
        this.total_gold_savings_per_contract = money6;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20363newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetFeesForTentativeOrderResponse)) {
            return false;
        }
        GetFeesForTentativeOrderResponse getFeesForTentativeOrderResponse = (GetFeesForTentativeOrderResponse) other;
        return Intrinsics.areEqual(unknownFields(), getFeesForTentativeOrderResponse.unknownFields()) && Intrinsics.areEqual(this.total_fee, getFeesForTentativeOrderResponse.total_fee) && Intrinsics.areEqual(this.total_commission, getFeesForTentativeOrderResponse.total_commission) && Intrinsics.areEqual(this.total_gold_savings, getFeesForTentativeOrderResponse.total_gold_savings) && Intrinsics.areEqual(this.total_fee_per_contract, getFeesForTentativeOrderResponse.total_fee_per_contract) && Intrinsics.areEqual(this.total_commission_per_contract, getFeesForTentativeOrderResponse.total_commission_per_contract) && Intrinsics.areEqual(this.total_gold_savings_per_contract, getFeesForTentativeOrderResponse.total_gold_savings_per_contract);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.total_fee;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.total_commission;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.total_gold_savings;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.total_fee_per_contract;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.total_commission_per_contract;
        int iHashCode6 = (iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.total_gold_savings_per_contract;
        int iHashCode7 = iHashCode6 + (money6 != null ? money6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.total_fee;
        if (money != null) {
            arrayList.add("total_fee=" + money);
        }
        Money money2 = this.total_commission;
        if (money2 != null) {
            arrayList.add("total_commission=" + money2);
        }
        Money money3 = this.total_gold_savings;
        if (money3 != null) {
            arrayList.add("total_gold_savings=" + money3);
        }
        Money money4 = this.total_fee_per_contract;
        if (money4 != null) {
            arrayList.add("total_fee_per_contract=" + money4);
        }
        Money money5 = this.total_commission_per_contract;
        if (money5 != null) {
            arrayList.add("total_commission_per_contract=" + money5);
        }
        Money money6 = this.total_gold_savings_per_contract;
        if (money6 != null) {
            arrayList.add("total_gold_savings_per_contract=" + money6);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFeesForTentativeOrderResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetFeesForTentativeOrderResponse copy$default(GetFeesForTentativeOrderResponse getFeesForTentativeOrderResponse, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = getFeesForTentativeOrderResponse.total_fee;
        }
        if ((i & 2) != 0) {
            money2 = getFeesForTentativeOrderResponse.total_commission;
        }
        if ((i & 4) != 0) {
            money3 = getFeesForTentativeOrderResponse.total_gold_savings;
        }
        if ((i & 8) != 0) {
            money4 = getFeesForTentativeOrderResponse.total_fee_per_contract;
        }
        if ((i & 16) != 0) {
            money5 = getFeesForTentativeOrderResponse.total_commission_per_contract;
        }
        if ((i & 32) != 0) {
            money6 = getFeesForTentativeOrderResponse.total_gold_savings_per_contract;
        }
        if ((i & 64) != 0) {
            byteString = getFeesForTentativeOrderResponse.unknownFields();
        }
        Money money7 = money6;
        ByteString byteString2 = byteString;
        Money money8 = money5;
        Money money9 = money3;
        return getFeesForTentativeOrderResponse.copy(money, money2, money9, money4, money8, money7, byteString2);
    }

    public final GetFeesForTentativeOrderResponse copy(Money total_fee, Money total_commission, Money total_gold_savings, Money total_fee_per_contract, Money total_commission_per_contract, Money total_gold_savings_per_contract, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetFeesForTentativeOrderResponse(total_fee, total_commission, total_gold_savings, total_fee_per_contract, total_commission_per_contract, total_gold_savings_per_contract, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetFeesForTentativeOrderResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetFeesForTentativeOrderResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetFeesForTentativeOrderResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetFeesForTentativeOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getTotal_fee() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getTotal_fee());
                }
                if (value.getTotal_commission() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getTotal_commission());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getTotal_gold_savings());
                if (value.getTotal_fee_per_contract() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getTotal_fee_per_contract());
                }
                if (value.getTotal_commission_per_contract() != null) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getTotal_commission_per_contract());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(6, value.getTotal_gold_savings_per_contract());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetFeesForTentativeOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getTotal_fee() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getTotal_fee());
                }
                if (value.getTotal_commission() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getTotal_commission());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTotal_gold_savings());
                if (value.getTotal_fee_per_contract() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getTotal_fee_per_contract());
                }
                if (value.getTotal_commission_per_contract() != null) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getTotal_commission_per_contract());
                }
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_gold_savings_per_contract());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetFeesForTentativeOrderResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getTotal_gold_savings_per_contract());
                if (value.getTotal_commission_per_contract() != null) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getTotal_commission_per_contract());
                }
                if (value.getTotal_fee_per_contract() != null) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getTotal_fee_per_contract());
                }
                protoAdapter.encodeWithTag(writer, 3, (int) value.getTotal_gold_savings());
                if (value.getTotal_commission() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTotal_commission());
                }
                if (value.getTotal_fee() != null) {
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getTotal_fee());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetFeesForTentativeOrderResponse redact(GetFeesForTentativeOrderResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money total_fee = value.getTotal_fee();
                Money moneyRedact = total_fee != null ? Money.ADAPTER.redact(total_fee) : null;
                Money total_commission = value.getTotal_commission();
                Money moneyRedact2 = total_commission != null ? Money.ADAPTER.redact(total_commission) : null;
                Money total_gold_savings = value.getTotal_gold_savings();
                Money moneyRedact3 = total_gold_savings != null ? Money.ADAPTER.redact(total_gold_savings) : null;
                Money total_fee_per_contract = value.getTotal_fee_per_contract();
                Money moneyRedact4 = total_fee_per_contract != null ? Money.ADAPTER.redact(total_fee_per_contract) : null;
                Money total_commission_per_contract = value.getTotal_commission_per_contract();
                Money moneyRedact5 = total_commission_per_contract != null ? Money.ADAPTER.redact(total_commission_per_contract) : null;
                Money total_gold_savings_per_contract = value.getTotal_gold_savings_per_contract();
                return value.copy(moneyRedact, moneyRedact2, moneyRedact3, moneyRedact4, moneyRedact5, total_gold_savings_per_contract != null ? Money.ADAPTER.redact(total_gold_savings_per_contract) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetFeesForTentativeOrderResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                Money moneyDecode6 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode6 = Money.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetFeesForTentativeOrderResponse(moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, moneyDecode5, moneyDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
