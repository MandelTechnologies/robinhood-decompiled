package crypto_perpetuals.settlement.p441v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.MarginMode;
import crypto_perpetuals.common.p435v1.MarginModeDto;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.settlement.p441v1.SettlementFeesDto;
import crypto_perpetuals.settlement.p441v1.SettlementTypeDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: SettlementDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004GFHIB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BÏ\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0006\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b5\u0010#R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b;\u0010:R\u0019\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b?\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bB\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bC\u0010:R\u0011\u0010\u001c\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006J"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/settlement/v1/Settlement;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;)V", "", "id", "position_id", "account_id", "contract_id", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/MoneyDto;", "settlement_price", "strike_price", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "settlement_time", "amount_settled", "amount_from_price", "Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;", "amount_from_fees", "amount_from_funding", "amount_from_socialized_loss", "Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;", "settlement_type", "created_at", "updated_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lj$/time/Instant;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;Lj$/time/Instant;Lj$/time/Instant;)V", "toProto", "()Lcrypto_perpetuals/settlement/v1/Settlement;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;", "getId", "getPosition_id", "getContract_id", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getSettlement_price", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getStrike_price", "getSettlement_time", "()Lj$/time/Instant;", "getAmount_settled", "getAmount_from_price", "getAmount_from_fees", "()Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;", "getAmount_from_funding", "getAmount_from_socialized_loss", "getSettlement_type", "()Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class SettlementDto implements Dto3<Settlement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SettlementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SettlementDto, Settlement>> binaryBase64Serializer$delegate;
    private static final SettlementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SettlementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SettlementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final MoneyDto getSettlement_price() {
        return this.surrogate.getSettlement_price();
    }

    public final MoneyDto getStrike_price() {
        return this.surrogate.getStrike_price();
    }

    public final Instant getSettlement_time() {
        return this.surrogate.getSettlement_time();
    }

    public final MoneyDto getAmount_settled() {
        return this.surrogate.getAmount_settled();
    }

    public final MoneyDto getAmount_from_price() {
        return this.surrogate.getAmount_from_price();
    }

    public final SettlementFeesDto getAmount_from_fees() {
        return this.surrogate.getAmount_from_fees();
    }

    public final MoneyDto getAmount_from_funding() {
        return this.surrogate.getAmount_from_funding();
    }

    public final MoneyDto getAmount_from_socialized_loss() {
        return this.surrogate.getAmount_from_socialized_loss();
    }

    public final SettlementTypeDto getSettlement_type() {
        return this.surrogate.getSettlement_type();
    }

    public /* synthetic */ SettlementDto(String str, String str2, String str3, String str4, MarginModeDto marginModeDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, MoneyDto moneyDto3, MoneyDto moneyDto4, SettlementFeesDto settlementFeesDto, MoneyDto moneyDto5, MoneyDto moneyDto6, SettlementTypeDto settlementTypeDto, Instant instant2, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : moneyDto3, (i & 512) != 0 ? null : moneyDto4, (i & 1024) != 0 ? null : settlementFeesDto, (i & 2048) != 0 ? null : moneyDto5, (i & 4096) != 0 ? null : moneyDto6, (i & 8192) != 0 ? SettlementTypeDto.INSTANCE.getZeroValue() : settlementTypeDto, (i & 16384) != 0 ? null : instant2, (i & 32768) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettlementDto(String id, String position_id, String account_id, String contract_id, MarginModeDto margin_mode, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, MoneyDto moneyDto3, MoneyDto moneyDto4, SettlementFeesDto settlementFeesDto, MoneyDto moneyDto5, MoneyDto moneyDto6, SettlementTypeDto settlement_type, Instant instant2, Instant instant3) {
        this(new Surrogate(id, position_id, account_id, contract_id, margin_mode, moneyDto, moneyDto2, instant, moneyDto3, moneyDto4, settlementFeesDto, moneyDto5, moneyDto6, settlement_type, instant2, instant3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(position_id, "position_id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(settlement_type, "settlement_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Settlement toProto() {
        String id = this.surrogate.getId();
        String position_id = this.surrogate.getPosition_id();
        String account_id = this.surrogate.getAccount_id();
        String contract_id = this.surrogate.getContract_id();
        MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode().toProto();
        MoneyDto settlement_price = this.surrogate.getSettlement_price();
        Money proto = settlement_price != null ? settlement_price.toProto() : null;
        MoneyDto strike_price = this.surrogate.getStrike_price();
        Money proto2 = strike_price != null ? strike_price.toProto() : null;
        Instant settlement_time = this.surrogate.getSettlement_time();
        MoneyDto amount_settled = this.surrogate.getAmount_settled();
        Money proto3 = amount_settled != null ? amount_settled.toProto() : null;
        MoneyDto amount_from_price = this.surrogate.getAmount_from_price();
        Money proto4 = amount_from_price != null ? amount_from_price.toProto() : null;
        SettlementFeesDto amount_from_fees = this.surrogate.getAmount_from_fees();
        SettlementFees proto5 = amount_from_fees != null ? amount_from_fees.toProto() : null;
        MoneyDto amount_from_funding = this.surrogate.getAmount_from_funding();
        Money proto6 = amount_from_funding != null ? amount_from_funding.toProto() : null;
        MoneyDto amount_from_socialized_loss = this.surrogate.getAmount_from_socialized_loss();
        return new Settlement(id, position_id, account_id, contract_id, marginMode, proto, proto2, settlement_time, proto3, proto4, proto5, proto6, amount_from_socialized_loss != null ? amount_from_socialized_loss.toProto() : null, (SettlementType) this.surrogate.getSettlement_type().toProto(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), null, 65536, null);
    }

    public String toString() {
        return "[SettlementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SettlementDto) && Intrinsics.areEqual(((SettlementDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SettlementDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b1\b\u0083\b\u0018\u0000 `2\u00020\u0001:\u0002a`B§\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012.\b\u0002\u0010\u001a\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012.\b\u0002\u0010\u001b\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u001c\u0010\u001dB»\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\f\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010-R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00104\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010-R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b;\u00107\u001a\u0004\b:\u0010-R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b=\u00107\u001a\u0004\b<\u0010-R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010>\u0012\u0004\bA\u00107\u001a\u0004\b?\u0010@R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bE\u00107\u001a\u0004\bC\u0010DR\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010B\u0012\u0004\bG\u00107\u001a\u0004\bF\u0010DRF\u0010\u0011\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010H\u0012\u0004\bK\u00107\u001a\u0004\bI\u0010JR\"\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010B\u0012\u0004\bM\u00107\u001a\u0004\bL\u0010DR\"\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010B\u0012\u0004\bO\u00107\u001a\u0004\bN\u0010DR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010P\u0012\u0004\bS\u00107\u001a\u0004\bQ\u0010RR\"\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010B\u0012\u0004\bU\u00107\u001a\u0004\bT\u0010DR\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010B\u0012\u0004\bW\u00107\u001a\u0004\bV\u0010DR \u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010X\u0012\u0004\b[\u00107\u001a\u0004\bY\u0010ZRF\u0010\u001a\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010H\u0012\u0004\b]\u00107\u001a\u0004\b\\\u0010JRF\u0010\u001b\u001a(\u0018\u00010\fj\u0013\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010H\u0012\u0004\b_\u00107\u001a\u0004\b^\u0010J¨\u0006b"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;", "", "", "id", "position_id", "account_id", "contract_id", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "margin_mode", "Lcrypto_perpetuals/common/v1/MoneyDto;", "settlement_price", "strike_price", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "settlement_time", "amount_settled", "amount_from_price", "Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;", "amount_from_fees", "amount_from_funding", "amount_from_socialized_loss", "Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;", "settlement_type", "created_at", "updated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lj$/time/Instant;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/common/v1/MarginModeDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lj$/time/Instant;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_settlement_v1_externalRelease", "(Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getPosition_id", "getPosition_id$annotations", "getAccount_id", "getAccount_id$annotations", "getContract_id", "getContract_id$annotations", "Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode", "()Lcrypto_perpetuals/common/v1/MarginModeDto;", "getMargin_mode$annotations", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getSettlement_price", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getSettlement_price$annotations", "getStrike_price", "getStrike_price$annotations", "Lj$/time/Instant;", "getSettlement_time", "()Lj$/time/Instant;", "getSettlement_time$annotations", "getAmount_settled", "getAmount_settled$annotations", "getAmount_from_price", "getAmount_from_price$annotations", "Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;", "getAmount_from_fees", "()Lcrypto_perpetuals/settlement/v1/SettlementFeesDto;", "getAmount_from_fees$annotations", "getAmount_from_funding", "getAmount_from_funding$annotations", "getAmount_from_socialized_loss", "getAmount_from_socialized_loss$annotations", "Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;", "getSettlement_type", "()Lcrypto_perpetuals/settlement/v1/SettlementTypeDto;", "getSettlement_type$annotations", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Companion", "$serializer", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final SettlementFeesDto amount_from_fees;
        private final MoneyDto amount_from_funding;
        private final MoneyDto amount_from_price;
        private final MoneyDto amount_from_socialized_loss;
        private final MoneyDto amount_settled;
        private final String contract_id;
        private final Instant created_at;
        private final String id;
        private final MarginModeDto margin_mode;
        private final String position_id;
        private final MoneyDto settlement_price;
        private final Instant settlement_time;
        private final SettlementTypeDto settlement_type;
        private final MoneyDto strike_price;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (MarginModeDto) null, (MoneyDto) null, (MoneyDto) null, (Instant) null, (MoneyDto) null, (MoneyDto) null, (SettlementFeesDto) null, (MoneyDto) null, (MoneyDto) null, (SettlementTypeDto) null, (Instant) null, (Instant) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.margin_mode == surrogate.margin_mode && Intrinsics.areEqual(this.settlement_price, surrogate.settlement_price) && Intrinsics.areEqual(this.strike_price, surrogate.strike_price) && Intrinsics.areEqual(this.settlement_time, surrogate.settlement_time) && Intrinsics.areEqual(this.amount_settled, surrogate.amount_settled) && Intrinsics.areEqual(this.amount_from_price, surrogate.amount_from_price) && Intrinsics.areEqual(this.amount_from_fees, surrogate.amount_from_fees) && Intrinsics.areEqual(this.amount_from_funding, surrogate.amount_from_funding) && Intrinsics.areEqual(this.amount_from_socialized_loss, surrogate.amount_from_socialized_loss) && this.settlement_type == surrogate.settlement_type && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.position_id.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.contract_id.hashCode()) * 31) + this.margin_mode.hashCode()) * 31;
            MoneyDto moneyDto = this.settlement_price;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.strike_price;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            Instant instant = this.settlement_time;
            int iHashCode4 = (iHashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
            MoneyDto moneyDto3 = this.amount_settled;
            int iHashCode5 = (iHashCode4 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.amount_from_price;
            int iHashCode6 = (iHashCode5 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31;
            SettlementFeesDto settlementFeesDto = this.amount_from_fees;
            int iHashCode7 = (iHashCode6 + (settlementFeesDto == null ? 0 : settlementFeesDto.hashCode())) * 31;
            MoneyDto moneyDto5 = this.amount_from_funding;
            int iHashCode8 = (iHashCode7 + (moneyDto5 == null ? 0 : moneyDto5.hashCode())) * 31;
            MoneyDto moneyDto6 = this.amount_from_socialized_loss;
            int iHashCode9 = (((iHashCode8 + (moneyDto6 == null ? 0 : moneyDto6.hashCode())) * 31) + this.settlement_type.hashCode()) * 31;
            Instant instant2 = this.created_at;
            int iHashCode10 = (iHashCode9 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.updated_at;
            return iHashCode10 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", position_id=" + this.position_id + ", account_id=" + this.account_id + ", contract_id=" + this.contract_id + ", margin_mode=" + this.margin_mode + ", settlement_price=" + this.settlement_price + ", strike_price=" + this.strike_price + ", settlement_time=" + this.settlement_time + ", amount_settled=" + this.amount_settled + ", amount_from_price=" + this.amount_from_price + ", amount_from_fees=" + this.amount_from_fees + ", amount_from_funding=" + this.amount_from_funding + ", amount_from_socialized_loss=" + this.amount_from_socialized_loss + ", settlement_type=" + this.settlement_type + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ")";
        }

        /* compiled from: SettlementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SettlementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, MarginModeDto marginModeDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, MoneyDto moneyDto3, MoneyDto moneyDto4, SettlementFeesDto settlementFeesDto, MoneyDto moneyDto5, MoneyDto moneyDto6, SettlementTypeDto settlementTypeDto, Instant instant2, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.position_id = "";
            } else {
                this.position_id = str2;
            }
            if ((i & 4) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str3;
            }
            if ((i & 8) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str4;
            }
            if ((i & 16) == 0) {
                this.margin_mode = MarginModeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_mode = marginModeDto;
            }
            if ((i & 32) == 0) {
                this.settlement_price = null;
            } else {
                this.settlement_price = moneyDto;
            }
            if ((i & 64) == 0) {
                this.strike_price = null;
            } else {
                this.strike_price = moneyDto2;
            }
            if ((i & 128) == 0) {
                this.settlement_time = null;
            } else {
                this.settlement_time = instant;
            }
            if ((i & 256) == 0) {
                this.amount_settled = null;
            } else {
                this.amount_settled = moneyDto3;
            }
            if ((i & 512) == 0) {
                this.amount_from_price = null;
            } else {
                this.amount_from_price = moneyDto4;
            }
            if ((i & 1024) == 0) {
                this.amount_from_fees = null;
            } else {
                this.amount_from_fees = settlementFeesDto;
            }
            if ((i & 2048) == 0) {
                this.amount_from_funding = null;
            } else {
                this.amount_from_funding = moneyDto5;
            }
            if ((i & 4096) == 0) {
                this.amount_from_socialized_loss = null;
            } else {
                this.amount_from_socialized_loss = moneyDto6;
            }
            this.settlement_type = (i & 8192) == 0 ? SettlementTypeDto.INSTANCE.getZeroValue() : settlementTypeDto;
            if ((i & 16384) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant2;
            }
            if ((i & 32768) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_settlement_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.position_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.position_id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_id);
            }
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.contract_id);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            MoneyDto moneyDto = self.settlement_price;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.strike_price;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            Instant instant = self.settlement_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant);
            }
            MoneyDto moneyDto3 = self.amount_settled;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.amount_from_price;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            SettlementFeesDto settlementFeesDto = self.amount_from_fees;
            if (settlementFeesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, SettlementFeesDto.Serializer.INSTANCE, settlementFeesDto);
            }
            MoneyDto moneyDto5 = self.amount_from_funding;
            if (moneyDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, MoneyDto.Serializer.INSTANCE, moneyDto5);
            }
            MoneyDto moneyDto6 = self.amount_from_socialized_loss;
            if (moneyDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, MoneyDto.Serializer.INSTANCE, moneyDto6);
            }
            if (self.settlement_type != SettlementTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, SettlementTypeDto.Serializer.INSTANCE, self.settlement_type);
            }
            Instant instant2 = self.created_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.updated_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(String id, String position_id, String account_id, String contract_id, MarginModeDto margin_mode, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, MoneyDto moneyDto3, MoneyDto moneyDto4, SettlementFeesDto settlementFeesDto, MoneyDto moneyDto5, MoneyDto moneyDto6, SettlementTypeDto settlement_type, Instant instant2, Instant instant3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(position_id, "position_id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(settlement_type, "settlement_type");
            this.id = id;
            this.position_id = position_id;
            this.account_id = account_id;
            this.contract_id = contract_id;
            this.margin_mode = margin_mode;
            this.settlement_price = moneyDto;
            this.strike_price = moneyDto2;
            this.settlement_time = instant;
            this.amount_settled = moneyDto3;
            this.amount_from_price = moneyDto4;
            this.amount_from_fees = settlementFeesDto;
            this.amount_from_funding = moneyDto5;
            this.amount_from_socialized_loss = moneyDto6;
            this.settlement_type = settlement_type;
            this.created_at = instant2;
            this.updated_at = instant3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, MarginModeDto marginModeDto, MoneyDto moneyDto, MoneyDto moneyDto2, Instant instant, MoneyDto moneyDto3, MoneyDto moneyDto4, SettlementFeesDto settlementFeesDto, MoneyDto moneyDto5, MoneyDto moneyDto6, SettlementTypeDto settlementTypeDto, Instant instant2, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2, (i & 128) != 0 ? null : instant, (i & 256) != 0 ? null : moneyDto3, (i & 512) != 0 ? null : moneyDto4, (i & 1024) != 0 ? null : settlementFeesDto, (i & 2048) != 0 ? null : moneyDto5, (i & 4096) != 0 ? null : moneyDto6, (i & 8192) != 0 ? SettlementTypeDto.INSTANCE.getZeroValue() : settlementTypeDto, (i & 16384) != 0 ? null : instant2, (i & 32768) != 0 ? null : instant3);
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

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final MoneyDto getSettlement_price() {
            return this.settlement_price;
        }

        public final MoneyDto getStrike_price() {
            return this.strike_price;
        }

        public final Instant getSettlement_time() {
            return this.settlement_time;
        }

        public final MoneyDto getAmount_settled() {
            return this.amount_settled;
        }

        public final MoneyDto getAmount_from_price() {
            return this.amount_from_price;
        }

        public final SettlementFeesDto getAmount_from_fees() {
            return this.amount_from_fees;
        }

        public final MoneyDto getAmount_from_funding() {
            return this.amount_from_funding;
        }

        public final MoneyDto getAmount_from_socialized_loss() {
            return this.amount_from_socialized_loss;
        }

        public final SettlementTypeDto getSettlement_type() {
            return this.settlement_type;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }
    }

    /* compiled from: SettlementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/settlement/v1/SettlementDto;", "Lcrypto_perpetuals/settlement/v1/Settlement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/settlement/v1/SettlementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SettlementDto, Settlement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SettlementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SettlementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SettlementDto> getBinaryBase64Serializer() {
            return (KSerializer) SettlementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Settlement> getProtoAdapter() {
            return Settlement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SettlementDto getZeroValue() {
            return SettlementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SettlementDto fromProto(Settlement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String position_id = proto.getPosition_id();
            String account_id = proto.getAccount_id();
            String contract_id = proto.getContract_id();
            MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode());
            Money settlement_price = proto.getSettlement_price();
            MoneyDto moneyDtoFromProto = settlement_price != null ? MoneyDto.INSTANCE.fromProto(settlement_price) : null;
            Money strike_price = proto.getStrike_price();
            MoneyDto moneyDtoFromProto2 = strike_price != null ? MoneyDto.INSTANCE.fromProto(strike_price) : null;
            Instant settlement_time = proto.getSettlement_time();
            Money amount_settled = proto.getAmount_settled();
            MoneyDto moneyDtoFromProto3 = amount_settled != null ? MoneyDto.INSTANCE.fromProto(amount_settled) : null;
            Money amount_from_price = proto.getAmount_from_price();
            MoneyDto moneyDtoFromProto4 = amount_from_price != null ? MoneyDto.INSTANCE.fromProto(amount_from_price) : null;
            SettlementFees amount_from_fees = proto.getAmount_from_fees();
            SettlementFeesDto settlementFeesDtoFromProto = amount_from_fees != null ? SettlementFeesDto.INSTANCE.fromProto(amount_from_fees) : null;
            Money amount_from_funding = proto.getAmount_from_funding();
            MoneyDto moneyDtoFromProto5 = amount_from_funding != null ? MoneyDto.INSTANCE.fromProto(amount_from_funding) : null;
            Money amount_from_socialized_loss = proto.getAmount_from_socialized_loss();
            return new SettlementDto(new Surrogate(id, position_id, account_id, contract_id, marginModeDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, settlement_time, moneyDtoFromProto3, moneyDtoFromProto4, settlementFeesDtoFromProto, moneyDtoFromProto5, amount_from_socialized_loss != null ? MoneyDto.INSTANCE.fromProto(amount_from_socialized_loss) : null, SettlementTypeDto.INSTANCE.fromProto(proto.getSettlement_type()), proto.getCreated_at(), proto.getUpdated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.settlement.v1.SettlementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SettlementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SettlementDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SettlementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/settlement/v1/SettlementDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/settlement/v1/SettlementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SettlementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.settlement.v1.Settlement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SettlementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SettlementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SettlementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SettlementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/settlement/v1/SettlementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.settlement.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "crypto_perpetuals.settlement.v1.SettlementDto";
        }
    }
}
