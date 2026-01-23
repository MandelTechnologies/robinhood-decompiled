package crypto_perpetuals.settlement.p441v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.Money;
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
import p479j$.time.Instant;

/* compiled from: Settlement.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\u0018\u0000 G2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB×\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)JÝ\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010)R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b.\u0010)R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b/\u0010)R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b0\u0010)R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b7\u00106R\"\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b;\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b<\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b@\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\bA\u00106R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\"\u0010\u0018\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\bE\u0010:R\"\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\bF\u0010:¨\u0006H"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/Settlement;", "Lcom/squareup/wire/Message;", "", "", "id", "position_id", "account_id", "contract_id", "Lcrypto_perpetuals/common/v1/MarginMode;", "margin_mode", "Lcrypto_perpetuals/common/v1/Money;", "settlement_price", "strike_price", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "settlement_time", "amount_settled", "amount_from_price", "Lcrypto_perpetuals/settlement/v1/SettlementFees;", "amount_from_fees", "amount_from_funding", "amount_from_socialized_loss", "Lcrypto_perpetuals/settlement/v1/SettlementType;", "settlement_type", "created_at", "updated_at", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginMode;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lj$/time/Instant;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/settlement/v1/SettlementFees;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/settlement/v1/SettlementType;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginMode;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lj$/time/Instant;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/settlement/v1/SettlementFees;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/settlement/v1/SettlementType;Lj$/time/Instant;Lj$/time/Instant;Lokio/ByteString;)Lcrypto_perpetuals/settlement/v1/Settlement;", "Ljava/lang/String;", "getId", "getPosition_id", "getAccount_id", "getContract_id", "Lcrypto_perpetuals/common/v1/MarginMode;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginMode;", "Lcrypto_perpetuals/common/v1/Money;", "getSettlement_price", "()Lcrypto_perpetuals/common/v1/Money;", "getStrike_price", "Lj$/time/Instant;", "getSettlement_time", "()Lj$/time/Instant;", "getAmount_settled", "getAmount_from_price", "Lcrypto_perpetuals/settlement/v1/SettlementFees;", "getAmount_from_fees", "()Lcrypto_perpetuals/settlement/v1/SettlementFees;", "getAmount_from_funding", "getAmount_from_socialized_loss", "Lcrypto_perpetuals/settlement/v1/SettlementType;", "getSettlement_type", "()Lcrypto_perpetuals/settlement/v1/SettlementType;", "getCreated_at", "getUpdated_at", "Companion", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class Settlement extends Message {

    @JvmField
    public static final ProtoAdapter<Settlement> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_id;

    @WireField(adapter = "crypto_perpetuals.settlement.v1.SettlementFees#ADAPTER", jsonName = "amountFromFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final SettlementFees amount_from_fees;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "amountFromFunding", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Money amount_from_funding;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "amountFromPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Money amount_from_price;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "amountFromSocializedLoss", schemaIndex = 12, tag = 13)
    private final Money amount_from_socialized_loss;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "amountSettled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Money amount_settled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 30)
    private final Instant created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "crypto_perpetuals.common.v1.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final MarginMode margin_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String position_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "settlementPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money settlement_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "settlementTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Instant settlement_time;

    @WireField(adapter = "crypto_perpetuals.settlement.v1.SettlementType#ADAPTER", jsonName = "settlementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final SettlementType settlement_type;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "strikePrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money strike_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 31)
    private final Instant updated_at;

    public Settlement() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public /* synthetic */ Settlement(String str, String str2, String str3, String str4, MarginMode marginMode, Money money, Money money2, Instant instant, Money money3, Money money4, SettlementFees settlementFees, Money money5, Money money6, SettlementType settlementType, Instant instant2, Instant instant3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : money3, (i & 512) != 0 ? null : money4, (i & 1024) != 0 ? null : settlementFees, (i & 2048) != 0 ? null : money5, (i & 4096) != 0 ? null : money6, (i & 8192) != 0 ? SettlementType.SETTLEMENT_TYPE_UNSPECIFIED : settlementType, (i & 16384) != 0 ? null : instant2, (i & 32768) != 0 ? null : instant3, (i & 65536) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27892newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getPosition_id() {
        return this.position_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final Money getSettlement_price() {
        return this.settlement_price;
    }

    public final Money getStrike_price() {
        return this.strike_price;
    }

    public final Instant getSettlement_time() {
        return this.settlement_time;
    }

    public final Money getAmount_settled() {
        return this.amount_settled;
    }

    public final Money getAmount_from_price() {
        return this.amount_from_price;
    }

    public final SettlementFees getAmount_from_fees() {
        return this.amount_from_fees;
    }

    public final Money getAmount_from_funding() {
        return this.amount_from_funding;
    }

    public final Money getAmount_from_socialized_loss() {
        return this.amount_from_socialized_loss;
    }

    public final SettlementType getSettlement_type() {
        return this.settlement_type;
    }

    public final Instant getCreated_at() {
        return this.created_at;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Settlement(String id, String position_id, String account_id, String contract_id, MarginMode margin_mode, Money money, Money money2, Instant instant, Money money3, Money money4, SettlementFees settlementFees, Money money5, Money money6, SettlementType settlement_type, Instant instant2, Instant instant3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(settlement_type, "settlement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.position_id = position_id;
        this.account_id = account_id;
        this.contract_id = contract_id;
        this.margin_mode = margin_mode;
        this.settlement_price = money;
        this.strike_price = money2;
        this.settlement_time = instant;
        this.amount_settled = money3;
        this.amount_from_price = money4;
        this.amount_from_fees = settlementFees;
        this.amount_from_funding = money5;
        this.amount_from_socialized_loss = money6;
        this.settlement_type = settlement_type;
        this.created_at = instant2;
        this.updated_at = instant3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27892newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Settlement)) {
            return false;
        }
        Settlement settlement = (Settlement) other;
        return Intrinsics.areEqual(unknownFields(), settlement.unknownFields()) && Intrinsics.areEqual(this.id, settlement.id) && Intrinsics.areEqual(this.position_id, settlement.position_id) && Intrinsics.areEqual(this.account_id, settlement.account_id) && Intrinsics.areEqual(this.contract_id, settlement.contract_id) && this.margin_mode == settlement.margin_mode && Intrinsics.areEqual(this.settlement_price, settlement.settlement_price) && Intrinsics.areEqual(this.strike_price, settlement.strike_price) && Intrinsics.areEqual(this.settlement_time, settlement.settlement_time) && Intrinsics.areEqual(this.amount_settled, settlement.amount_settled) && Intrinsics.areEqual(this.amount_from_price, settlement.amount_from_price) && Intrinsics.areEqual(this.amount_from_fees, settlement.amount_from_fees) && Intrinsics.areEqual(this.amount_from_funding, settlement.amount_from_funding) && Intrinsics.areEqual(this.amount_from_socialized_loss, settlement.amount_from_socialized_loss) && this.settlement_type == settlement.settlement_type && Intrinsics.areEqual(this.created_at, settlement.created_at) && Intrinsics.areEqual(this.updated_at, settlement.updated_at);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.position_id.hashCode()) * 37) + this.account_id.hashCode()) * 37) + this.contract_id.hashCode()) * 37) + this.margin_mode.hashCode()) * 37;
        Money money = this.settlement_price;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.strike_price;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Instant instant = this.settlement_time;
        int iHashCode4 = (iHashCode3 + (instant != null ? instant.hashCode() : 0)) * 37;
        Money money3 = this.amount_settled;
        int iHashCode5 = (iHashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.amount_from_price;
        int iHashCode6 = (iHashCode5 + (money4 != null ? money4.hashCode() : 0)) * 37;
        SettlementFees settlementFees = this.amount_from_fees;
        int iHashCode7 = (iHashCode6 + (settlementFees != null ? settlementFees.hashCode() : 0)) * 37;
        Money money5 = this.amount_from_funding;
        int iHashCode8 = (iHashCode7 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.amount_from_socialized_loss;
        int iHashCode9 = (((iHashCode8 + (money6 != null ? money6.hashCode() : 0)) * 37) + this.settlement_type.hashCode()) * 37;
        Instant instant2 = this.created_at;
        int iHashCode10 = (iHashCode9 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.updated_at;
        int iHashCode11 = iHashCode10 + (instant3 != null ? instant3.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("position_id=" + Internal.sanitize(this.position_id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("margin_mode=" + this.margin_mode);
        Money money = this.settlement_price;
        if (money != null) {
            arrayList.add("settlement_price=" + money);
        }
        Money money2 = this.strike_price;
        if (money2 != null) {
            arrayList.add("strike_price=" + money2);
        }
        Instant instant = this.settlement_time;
        if (instant != null) {
            arrayList.add("settlement_time=" + instant);
        }
        Money money3 = this.amount_settled;
        if (money3 != null) {
            arrayList.add("amount_settled=" + money3);
        }
        Money money4 = this.amount_from_price;
        if (money4 != null) {
            arrayList.add("amount_from_price=" + money4);
        }
        SettlementFees settlementFees = this.amount_from_fees;
        if (settlementFees != null) {
            arrayList.add("amount_from_fees=" + settlementFees);
        }
        Money money5 = this.amount_from_funding;
        if (money5 != null) {
            arrayList.add("amount_from_funding=" + money5);
        }
        Money money6 = this.amount_from_socialized_loss;
        if (money6 != null) {
            arrayList.add("amount_from_socialized_loss=" + money6);
        }
        arrayList.add("settlement_type=" + this.settlement_type);
        Instant instant2 = this.created_at;
        if (instant2 != null) {
            arrayList.add("created_at=" + instant2);
        }
        Instant instant3 = this.updated_at;
        if (instant3 != null) {
            arrayList.add("updated_at=" + instant3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Settlement{", "}", 0, null, null, 56, null);
    }

    public final Settlement copy(String id, String position_id, String account_id, String contract_id, MarginMode margin_mode, Money settlement_price, Money strike_price, Instant settlement_time, Money amount_settled, Money amount_from_price, SettlementFees amount_from_fees, Money amount_from_funding, Money amount_from_socialized_loss, SettlementType settlement_type, Instant created_at, Instant updated_at, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(settlement_type, "settlement_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Settlement(id, position_id, account_id, contract_id, margin_mode, settlement_price, strike_price, settlement_time, amount_settled, amount_from_price, amount_from_fees, amount_from_funding, amount_from_socialized_loss, settlement_type, created_at, updated_at, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Settlement.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Settlement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.settlement.v1.Settlement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Settlement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPosition_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getContract_id());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    size += MarginMode.ADAPTER.encodedSizeWithTag(5, value.getMargin_mode());
                }
                if (value.getSettlement_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getSettlement_price());
                }
                if (value.getStrike_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getStrike_price());
                }
                if (value.getSettlement_time() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getSettlement_time());
                }
                if (value.getAmount_settled() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(9, value.getAmount_settled());
                }
                if (value.getAmount_from_price() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(10, value.getAmount_from_price());
                }
                if (value.getAmount_from_fees() != null) {
                    size += SettlementFees.ADAPTER.encodedSizeWithTag(11, value.getAmount_from_fees());
                }
                if (value.getAmount_from_funding() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(12, value.getAmount_from_funding());
                }
                int iEncodedSizeWithTag = size + Money.ADAPTER.encodedSizeWithTag(13, value.getAmount_from_socialized_loss());
                if (value.getSettlement_type() != SettlementType.SETTLEMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += SettlementType.ADAPTER.encodedSizeWithTag(14, value.getSettlement_type());
                }
                if (value.getCreated_at() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(30, value.getCreated_at());
                }
                return value.getUpdated_at() != null ? iEncodedSizeWithTag + ProtoAdapter.INSTANT.encodedSizeWithTag(31, value.getUpdated_at()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Settlement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPosition_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContract_id());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getMargin_mode());
                }
                if (value.getSettlement_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getSettlement_price());
                }
                if (value.getStrike_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getStrike_price());
                }
                if (value.getSettlement_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getSettlement_time());
                }
                if (value.getAmount_settled() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 9, (int) value.getAmount_settled());
                }
                if (value.getAmount_from_price() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 10, (int) value.getAmount_from_price());
                }
                if (value.getAmount_from_fees() != null) {
                    SettlementFees.ADAPTER.encodeWithTag(writer, 11, (int) value.getAmount_from_fees());
                }
                if (value.getAmount_from_funding() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 12, (int) value.getAmount_from_funding());
                }
                Money.ADAPTER.encodeWithTag(writer, 13, (int) value.getAmount_from_socialized_loss());
                if (value.getSettlement_type() != SettlementType.SETTLEMENT_TYPE_UNSPECIFIED) {
                    SettlementType.ADAPTER.encodeWithTag(writer, 14, (int) value.getSettlement_type());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 30, (int) value.getCreated_at());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 31, (int) value.getUpdated_at());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Settlement value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 31, (int) value.getUpdated_at());
                }
                if (value.getCreated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 30, (int) value.getCreated_at());
                }
                if (value.getSettlement_type() != SettlementType.SETTLEMENT_TYPE_UNSPECIFIED) {
                    SettlementType.ADAPTER.encodeWithTag(writer, 14, (int) value.getSettlement_type());
                }
                ProtoAdapter<Money> protoAdapter = Money.ADAPTER;
                protoAdapter.encodeWithTag(writer, 13, (int) value.getAmount_from_socialized_loss());
                if (value.getAmount_from_funding() != null) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getAmount_from_funding());
                }
                if (value.getAmount_from_fees() != null) {
                    SettlementFees.ADAPTER.encodeWithTag(writer, 11, (int) value.getAmount_from_fees());
                }
                if (value.getAmount_from_price() != null) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getAmount_from_price());
                }
                if (value.getAmount_settled() != null) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getAmount_settled());
                }
                if (value.getSettlement_time() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 8, (int) value.getSettlement_time());
                }
                if (value.getStrike_price() != null) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getStrike_price());
                }
                if (value.getSettlement_price() != null) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getSettlement_price());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 5, (int) value.getMargin_mode());
                }
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getPosition_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPosition_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Settlement decode(ProtoReader reader) throws IOException {
                SettlementType settlementType;
                String str;
                String str2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                MarginMode marginMode = MarginMode.MARGIN_MODE_UNSPECIFIED;
                SettlementType settlementType2 = SettlementType.SETTLEMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                MarginMode marginModeDecode = marginMode;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Instant instantDecode = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                SettlementFees settlementFeesDecode = null;
                Money moneyDecode5 = null;
                Money moneyDecode6 = null;
                Instant instantDecode2 = null;
                Instant instantDecode3 = null;
                SettlementType settlementTypeDecode = settlementType2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Settlement(strDecode4, strDecode, strDecode2, strDecode3, marginModeDecode, moneyDecode, moneyDecode2, instantDecode, moneyDecode3, moneyDecode4, settlementFeesDecode, moneyDecode5, moneyDecode6, settlementTypeDecode, instantDecode2, instantDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 30) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag != 31) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                settlementType = settlementTypeDecode;
                                str = strDecode4;
                                str2 = strDecode;
                                try {
                                    marginModeDecode = MarginMode.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                continue;
                            case 9:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                settlementFeesDecode = SettlementFees.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                moneyDecode6 = Money.ADAPTER.decode(reader);
                                continue;
                            case 14:
                                try {
                                    settlementTypeDecode = SettlementType.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    settlementType = settlementTypeDecode;
                                    str = strDecode4;
                                    str2 = strDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                settlementType = settlementTypeDecode;
                                str = strDecode4;
                                str2 = strDecode;
                                break;
                        }
                        settlementTypeDecode = settlementType;
                        strDecode4 = str;
                        strDecode = str2;
                    } else {
                        instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Settlement redact(Settlement value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money settlement_price = value.getSettlement_price();
                Money moneyRedact = settlement_price != null ? Money.ADAPTER.redact(settlement_price) : null;
                Money strike_price = value.getStrike_price();
                Money moneyRedact2 = strike_price != null ? Money.ADAPTER.redact(strike_price) : null;
                Instant settlement_time = value.getSettlement_time();
                Instant instantRedact = settlement_time != null ? ProtoAdapter.INSTANT.redact(settlement_time) : null;
                Money amount_settled = value.getAmount_settled();
                Money moneyRedact3 = amount_settled != null ? Money.ADAPTER.redact(amount_settled) : null;
                Money amount_from_price = value.getAmount_from_price();
                Money moneyRedact4 = amount_from_price != null ? Money.ADAPTER.redact(amount_from_price) : null;
                SettlementFees amount_from_fees = value.getAmount_from_fees();
                SettlementFees settlementFeesRedact = amount_from_fees != null ? SettlementFees.ADAPTER.redact(amount_from_fees) : null;
                Money amount_from_funding = value.getAmount_from_funding();
                Money moneyRedact5 = amount_from_funding != null ? Money.ADAPTER.redact(amount_from_funding) : null;
                Money amount_from_socialized_loss = value.getAmount_from_socialized_loss();
                Money moneyRedact6 = amount_from_socialized_loss != null ? Money.ADAPTER.redact(amount_from_socialized_loss) : null;
                Instant created_at = value.getCreated_at();
                Instant instantRedact2 = created_at != null ? ProtoAdapter.INSTANT.redact(created_at) : null;
                Instant updated_at = value.getUpdated_at();
                return value.copy((8223 & 1) != 0 ? value.id : null, (8223 & 2) != 0 ? value.position_id : null, (8223 & 4) != 0 ? value.account_id : null, (8223 & 8) != 0 ? value.contract_id : null, (8223 & 16) != 0 ? value.margin_mode : null, (8223 & 32) != 0 ? value.settlement_price : moneyRedact, (8223 & 64) != 0 ? value.strike_price : moneyRedact2, (8223 & 128) != 0 ? value.settlement_time : instantRedact, (8223 & 256) != 0 ? value.amount_settled : moneyRedact3, (8223 & 512) != 0 ? value.amount_from_price : moneyRedact4, (8223 & 1024) != 0 ? value.amount_from_fees : settlementFeesRedact, (8223 & 2048) != 0 ? value.amount_from_funding : moneyRedact5, (8223 & 4096) != 0 ? value.amount_from_socialized_loss : moneyRedact6, (8223 & 8192) != 0 ? value.settlement_type : null, (8223 & 16384) != 0 ? value.created_at : instantRedact2, (8223 & 32768) != 0 ? value.updated_at : updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null, (8223 & 65536) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
