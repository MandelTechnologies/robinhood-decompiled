package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.comboorders.detail.components.topbar.ComboOrderDetailTopbarComposable5;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CryptoStakingContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jb\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext;", "Lcom/squareup/wire/Message;", "", "asset_currency_code", "", "apy", "", "available_to_stake", "available_to_unstake", "staking_balance", "pending_earnings", "lifetime_earnings", "orderContext", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;DDDDDDLcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext;Lokio/ByteString;)V", "getAsset_currency_code", "()Ljava/lang/String;", "getApy", "()D", "getAvailable_to_stake", "getAvailable_to_unstake", "getStaking_balance", "getPending_earnings", "getLifetime_earnings", "getOrderContext", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "OrderContext", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoStakingContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoStakingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final double apy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "assetCurrencyCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String asset_currency_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "availableToStake", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final double available_to_stake;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "availableToUnstake", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final double available_to_unstake;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "lifetimeEarnings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double lifetime_earnings;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoStakingContext$OrderContext#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final OrderContext orderContext;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "pendingEarnings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double pending_earnings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "stakingBalance", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final double staking_balance;

    public CryptoStakingContext() {
        this(null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24163newBuilder();
    }

    public final String getAsset_currency_code() {
        return this.asset_currency_code;
    }

    public /* synthetic */ CryptoStakingContext(String str, double d, double d2, double d3, double d4, double d5, double d6, OrderContext orderContext, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.0d : d2, (i & 8) != 0 ? 0.0d : d3, (i & 16) != 0 ? 0.0d : d4, (i & 32) != 0 ? 0.0d : d5, (i & 64) == 0 ? d6 : 0.0d, (i & 128) != 0 ? null : orderContext, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final double getApy() {
        return this.apy;
    }

    public final double getAvailable_to_stake() {
        return this.available_to_stake;
    }

    public final double getAvailable_to_unstake() {
        return this.available_to_unstake;
    }

    public final double getStaking_balance() {
        return this.staking_balance;
    }

    public final double getPending_earnings() {
        return this.pending_earnings;
    }

    public final double getLifetime_earnings() {
        return this.lifetime_earnings;
    }

    public final OrderContext getOrderContext() {
        return this.orderContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStakingContext(String asset_currency_code, double d, double d2, double d3, double d4, double d5, double d6, OrderContext orderContext, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.asset_currency_code = asset_currency_code;
        this.apy = d;
        this.available_to_stake = d2;
        this.available_to_unstake = d3;
        this.staking_balance = d4;
        this.pending_earnings = d5;
        this.lifetime_earnings = d6;
        this.orderContext = orderContext;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24163newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoStakingContext)) {
            return false;
        }
        CryptoStakingContext cryptoStakingContext = (CryptoStakingContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoStakingContext.unknownFields()) && Intrinsics.areEqual(this.asset_currency_code, cryptoStakingContext.asset_currency_code) && this.apy == cryptoStakingContext.apy && this.available_to_stake == cryptoStakingContext.available_to_stake && this.available_to_unstake == cryptoStakingContext.available_to_unstake && this.staking_balance == cryptoStakingContext.staking_balance && this.pending_earnings == cryptoStakingContext.pending_earnings && this.lifetime_earnings == cryptoStakingContext.lifetime_earnings && Intrinsics.areEqual(this.orderContext, cryptoStakingContext.orderContext);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.asset_currency_code.hashCode()) * 37) + Double.hashCode(this.apy)) * 37) + Double.hashCode(this.available_to_stake)) * 37) + Double.hashCode(this.available_to_unstake)) * 37) + Double.hashCode(this.staking_balance)) * 37) + Double.hashCode(this.pending_earnings)) * 37) + Double.hashCode(this.lifetime_earnings)) * 37;
        OrderContext orderContext = this.orderContext;
        int iHashCode2 = iHashCode + (orderContext != null ? orderContext.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("asset_currency_code=" + Internal.sanitize(this.asset_currency_code));
        arrayList.add("apy=" + this.apy);
        arrayList.add("available_to_stake=" + this.available_to_stake);
        arrayList.add("available_to_unstake=" + this.available_to_unstake);
        arrayList.add("staking_balance=" + this.staking_balance);
        arrayList.add("pending_earnings=" + this.pending_earnings);
        arrayList.add("lifetime_earnings=" + this.lifetime_earnings);
        OrderContext orderContext = this.orderContext;
        if (orderContext != null) {
            arrayList.add("orderContext=" + orderContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoStakingContext{", "}", 0, null, null, 56, null);
    }

    public final CryptoStakingContext copy(String asset_currency_code, double apy, double available_to_stake, double available_to_unstake, double staking_balance, double pending_earnings, double lifetime_earnings, OrderContext orderContext, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(asset_currency_code, "asset_currency_code");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoStakingContext(asset_currency_code, apy, available_to_stake, available_to_unstake, staking_balance, pending_earnings, lifetime_earnings, orderContext, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoStakingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoStakingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoStakingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoStakingContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAsset_currency_code());
                }
                if (!Double.valueOf(value.getApy()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getApy()));
                }
                if (!Double.valueOf(value.getAvailable_to_stake()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getAvailable_to_stake()));
                }
                if (!Double.valueOf(value.getAvailable_to_unstake()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getAvailable_to_unstake()));
                }
                if (!Double.valueOf(value.getStaking_balance()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getStaking_balance()));
                }
                if (!Double.valueOf(value.getPending_earnings()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getPending_earnings()));
                }
                if (!Double.valueOf(value.getLifetime_earnings()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getLifetime_earnings()));
                }
                return value.getOrderContext() != null ? size + CryptoStakingContext.OrderContext.ADAPTER.encodedSizeWithTag(8, value.getOrderContext()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoStakingContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_currency_code());
                }
                if (!Double.valueOf(value.getApy()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getApy()));
                }
                if (!Double.valueOf(value.getAvailable_to_stake()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAvailable_to_stake()));
                }
                if (!Double.valueOf(value.getAvailable_to_unstake()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getAvailable_to_unstake()));
                }
                if (!Double.valueOf(value.getStaking_balance()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getStaking_balance()));
                }
                if (!Double.valueOf(value.getPending_earnings()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getPending_earnings()));
                }
                if (!Double.valueOf(value.getLifetime_earnings()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getLifetime_earnings()));
                }
                if (value.getOrderContext() != null) {
                    CryptoStakingContext.OrderContext.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrderContext());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoStakingContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOrderContext() != null) {
                    CryptoStakingContext.OrderContext.ADAPTER.encodeWithTag(writer, 8, (int) value.getOrderContext());
                }
                if (!Double.valueOf(value.getLifetime_earnings()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getLifetime_earnings()));
                }
                if (!Double.valueOf(value.getPending_earnings()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getPending_earnings()));
                }
                if (!Double.valueOf(value.getStaking_balance()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, (int) Double.valueOf(value.getStaking_balance()));
                }
                if (!Double.valueOf(value.getAvailable_to_unstake()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, (int) Double.valueOf(value.getAvailable_to_unstake()));
                }
                if (!Double.valueOf(value.getAvailable_to_stake()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, (int) Double.valueOf(value.getAvailable_to_stake()));
                }
                if (!Double.valueOf(value.getApy()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getApy()));
                }
                if (Intrinsics.areEqual(value.getAsset_currency_code(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAsset_currency_code());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoStakingContext redact(CryptoStakingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoStakingContext.OrderContext orderContext = value.getOrderContext();
                return value.copy((EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 1) != 0 ? value.asset_currency_code : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 2) != 0 ? value.apy : 0.0d, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 4) != 0 ? value.available_to_stake : 0.0d, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 8) != 0 ? value.available_to_unstake : 0.0d, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 16) != 0 ? value.staking_balance : 0.0d, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 32) != 0 ? value.pending_earnings : 0.0d, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 64) != 0 ? value.lifetime_earnings : 0.0d, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 128) != 0 ? value.orderContext : orderContext != null ? CryptoStakingContext.OrderContext.ADAPTER.redact(orderContext) : null, (EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE & 256) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoStakingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                CryptoStakingContext.OrderContext orderContextDecode = null;
                double dDoubleValue6 = 0.0d;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                dDoubleValue6 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 3:
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 4:
                                dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 5:
                                dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 6:
                                dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 7:
                                dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                break;
                            case 8:
                                orderContextDecode = CryptoStakingContext.OrderContext.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new CryptoStakingContext(str, dDoubleValue6, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, orderContextDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: CryptoStakingContext.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext;", "Lcom/squareup/wire/Message;", "", "input_amount", "", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", ComboOrderDetailTopbarComposable5.ORDER_STATUS, "", "unknownFields", "Lokio/ByteString;", "<init>", "(DLcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;Ljava/lang/String;Lokio/ByteString;)V", "getInput_amount", "()D", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "getOrder_status", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntryType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderContext extends Message {

        @JvmField
        public static final ProtoAdapter<OrderContext> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoStakingContext$OrderContext$EntryType#ADAPTER", jsonName = "entryType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final EntryType entry_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "inputAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final double input_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "orderStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String order_status;

        public OrderContext() {
            this(0.0d, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24164newBuilder();
        }

        public final double getInput_amount() {
            return this.input_amount;
        }

        public final EntryType getEntry_type() {
            return this.entry_type;
        }

        public /* synthetic */ OrderContext(double d, EntryType entryType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? EntryType.ENTRY_TYPE_UNSPECIFIED : entryType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getOrder_status() {
            return this.order_status;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderContext(double d, EntryType entry_type, String order_status, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(order_status, "order_status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.input_amount = d;
            this.entry_type = entry_type;
            this.order_status = order_status;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24164newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OrderContext)) {
                return false;
            }
            OrderContext orderContext = (OrderContext) other;
            return Intrinsics.areEqual(unknownFields(), orderContext.unknownFields()) && this.input_amount == orderContext.input_amount && this.entry_type == orderContext.entry_type && Intrinsics.areEqual(this.order_status, orderContext.order_status);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + Double.hashCode(this.input_amount)) * 37) + this.entry_type.hashCode()) * 37) + this.order_status.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("input_amount=" + this.input_amount);
            arrayList.add("entry_type=" + this.entry_type);
            arrayList.add("order_status=" + Internal.sanitize(this.order_status));
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderContext{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ OrderContext copy$default(OrderContext orderContext, double d, EntryType entryType, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = orderContext.input_amount;
            }
            double d2 = d;
            if ((i & 2) != 0) {
                entryType = orderContext.entry_type;
            }
            EntryType entryType2 = entryType;
            if ((i & 4) != 0) {
                str = orderContext.order_status;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                byteString = orderContext.unknownFields();
            }
            return orderContext.copy(d2, entryType2, str2, byteString);
        }

        public final OrderContext copy(double input_amount, EntryType entry_type, String order_status, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(entry_type, "entry_type");
            Intrinsics.checkNotNullParameter(order_status, "order_status");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new OrderContext(input_amount, entry_type, order_status, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderContext.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<OrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoStakingContext$OrderContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CryptoStakingContext.OrderContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Double.valueOf(value.getInput_amount()).equals(Double.valueOf(0.0d))) {
                        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getInput_amount()));
                    }
                    if (value.getEntry_type() != CryptoStakingContext.OrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                        size += CryptoStakingContext.OrderContext.EntryType.ADAPTER.encodedSizeWithTag(2, value.getEntry_type());
                    }
                    return !Intrinsics.areEqual(value.getOrder_status(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getOrder_status()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CryptoStakingContext.OrderContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Double.valueOf(value.getInput_amount()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getInput_amount()));
                    }
                    if (value.getEntry_type() != CryptoStakingContext.OrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                        CryptoStakingContext.OrderContext.EntryType.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_type());
                    }
                    if (!Intrinsics.areEqual(value.getOrder_status(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOrder_status());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CryptoStakingContext.OrderContext value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getOrder_status(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getOrder_status());
                    }
                    if (value.getEntry_type() != CryptoStakingContext.OrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                        CryptoStakingContext.OrderContext.EntryType.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_type());
                    }
                    if (Double.valueOf(value.getInput_amount()).equals(Double.valueOf(0.0d))) {
                        return;
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) Double.valueOf(value.getInput_amount()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CryptoStakingContext.OrderContext decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    CryptoStakingContext.OrderContext.EntryType entryTypeDecode = CryptoStakingContext.OrderContext.EntryType.ENTRY_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    double dDoubleValue = 0.0d;
                    while (true) {
                        CryptoStakingContext.OrderContext.EntryType entryType = entryTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new CryptoStakingContext.OrderContext(dDoubleValue, entryType, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else if (iNextTag == 2) {
                                try {
                                    entryTypeDecode = CryptoStakingContext.OrderContext.EntryType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CryptoStakingContext.OrderContext redact(CryptoStakingContext.OrderContext value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CryptoStakingContext.OrderContext.copy$default(value, 0.0d, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CryptoStakingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EntryType implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EntryType[] $VALUES;

            @JvmField
            public static final ProtoAdapter<EntryType> ADAPTER;
            public static final EntryType ASSET;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final EntryType ENTRY_TYPE_UNSPECIFIED;
            public static final EntryType QUOTE;
            private final int value;

            private static final /* synthetic */ EntryType[] $values() {
                return new EntryType[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
            }

            @JvmStatic
            public static final EntryType fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<EntryType> getEntries() {
                return $ENTRIES;
            }

            private EntryType(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final EntryType entryType = new EntryType("ENTRY_TYPE_UNSPECIFIED", 0, 0);
                ENTRY_TYPE_UNSPECIFIED = entryType;
                ASSET = new EntryType("ASSET", 1, 1);
                QUOTE = new EntryType("QUOTE", 2, 2);
                EntryType[] entryTypeArr$values = $values();
                $VALUES = entryTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(entryTypeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryType.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<EntryType>(orCreateKotlinClass, syntax, entryType) { // from class: com.robinhood.rosetta.eventlogging.CryptoStakingContext$OrderContext$EntryType$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public CryptoStakingContext.OrderContext.EntryType fromValue(int value) {
                        return CryptoStakingContext.OrderContext.EntryType.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: CryptoStakingContext.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final EntryType fromValue(int value) {
                    if (value == 0) {
                        return EntryType.ENTRY_TYPE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return EntryType.ASSET;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return EntryType.QUOTE;
                }
            }

            public static EntryType valueOf(String str) {
                return (EntryType) Enum.valueOf(EntryType.class, str);
            }

            public static EntryType[] values() {
                return (EntryType[]) $VALUES.clone();
            }
        }
    }
}
