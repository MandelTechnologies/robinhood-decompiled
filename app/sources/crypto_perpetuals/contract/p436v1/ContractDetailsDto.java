package crypto_perpetuals.contract.p436v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: ContractDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B»\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0016¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b2\u0010!R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/contract/v1/ContractDetails;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;)V", "", "contract_id", "Lcom/robinhood/idl/IdlDecimal;", BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, BidAskDetails3.ASK_PRICE, BidAskDetails3.ASK_SIZE, "last_traded_price", "price_change_24", "price_percentage_change_24", "mark_price", "index_price", "funding_rate", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "funding_time", "open_interest", "volume_24", "high_24", "low_24", "open_24", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcrypto_perpetuals/contract/v1/ContractDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;", "getContract_id", "getFunding_time", "()Lj$/time/Instant;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class ContractDetailsDto implements Dto3<ContractDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractDetailsDto, ContractDetails>> binaryBase64Serializer$delegate;
    private static final ContractDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final Instant getFunding_time() {
        return this.surrogate.getFunding_time();
    }

    public /* synthetic */ ContractDetailsDto(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, Instant instant, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        IdlDecimal idlDecimal16;
        IdlDecimal idlDecimal17;
        String str2;
        IdlDecimal idlDecimal18;
        IdlDecimal idlDecimal19;
        IdlDecimal idlDecimal20;
        IdlDecimal idlDecimal21;
        IdlDecimal idlDecimal22;
        IdlDecimal idlDecimal23;
        IdlDecimal idlDecimal24;
        IdlDecimal idlDecimal25;
        IdlDecimal idlDecimal26;
        IdlDecimal idlDecimal27;
        IdlDecimal idlDecimal28;
        Instant instant2;
        IdlDecimal idlDecimal29;
        IdlDecimal idlDecimal30;
        String str3 = (i & 1) != 0 ? "" : str;
        IdlDecimal idlDecimal31 = (i & 2) != 0 ? new IdlDecimal("") : idlDecimal;
        IdlDecimal idlDecimal32 = (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2;
        IdlDecimal idlDecimal33 = (i & 8) != 0 ? new IdlDecimal("") : idlDecimal3;
        IdlDecimal idlDecimal34 = (i & 16) != 0 ? new IdlDecimal("") : idlDecimal4;
        IdlDecimal idlDecimal35 = (i & 32) != 0 ? new IdlDecimal("") : idlDecimal5;
        IdlDecimal idlDecimal36 = (i & 64) != 0 ? new IdlDecimal("") : idlDecimal6;
        IdlDecimal idlDecimal37 = (i & 128) != 0 ? new IdlDecimal("") : idlDecimal7;
        IdlDecimal idlDecimal38 = (i & 256) != 0 ? new IdlDecimal("") : idlDecimal8;
        IdlDecimal idlDecimal39 = (i & 512) != 0 ? new IdlDecimal("") : idlDecimal9;
        IdlDecimal idlDecimal40 = (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal10;
        Instant instant3 = (i & 2048) != 0 ? null : instant;
        IdlDecimal idlDecimal41 = (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal11;
        IdlDecimal idlDecimal42 = (i & 8192) != 0 ? new IdlDecimal("") : idlDecimal12;
        String str4 = str3;
        IdlDecimal idlDecimal43 = (i & 16384) != 0 ? new IdlDecimal("") : idlDecimal13;
        IdlDecimal idlDecimal44 = (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal14;
        if ((i & 65536) != 0) {
            idlDecimal17 = idlDecimal44;
            idlDecimal16 = new IdlDecimal("");
            idlDecimal18 = idlDecimal43;
            idlDecimal19 = idlDecimal31;
            idlDecimal20 = idlDecimal32;
            idlDecimal21 = idlDecimal33;
            idlDecimal22 = idlDecimal34;
            idlDecimal23 = idlDecimal35;
            idlDecimal24 = idlDecimal36;
            idlDecimal25 = idlDecimal37;
            idlDecimal26 = idlDecimal38;
            idlDecimal27 = idlDecimal39;
            idlDecimal28 = idlDecimal40;
            instant2 = instant3;
            idlDecimal29 = idlDecimal41;
            idlDecimal30 = idlDecimal42;
            str2 = str4;
        } else {
            idlDecimal16 = idlDecimal15;
            idlDecimal17 = idlDecimal44;
            str2 = str4;
            idlDecimal18 = idlDecimal43;
            idlDecimal19 = idlDecimal31;
            idlDecimal20 = idlDecimal32;
            idlDecimal21 = idlDecimal33;
            idlDecimal22 = idlDecimal34;
            idlDecimal23 = idlDecimal35;
            idlDecimal24 = idlDecimal36;
            idlDecimal25 = idlDecimal37;
            idlDecimal26 = idlDecimal38;
            idlDecimal27 = idlDecimal39;
            idlDecimal28 = idlDecimal40;
            instant2 = instant3;
            idlDecimal29 = idlDecimal41;
            idlDecimal30 = idlDecimal42;
        }
        this(str2, idlDecimal19, idlDecimal20, idlDecimal21, idlDecimal22, idlDecimal23, idlDecimal24, idlDecimal25, idlDecimal26, idlDecimal27, idlDecimal28, instant2, idlDecimal29, idlDecimal30, idlDecimal18, idlDecimal17, idlDecimal16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractDetailsDto(String contract_id, IdlDecimal bid_price, IdlDecimal bid_size, IdlDecimal ask_price, IdlDecimal ask_size, IdlDecimal last_traded_price, IdlDecimal price_change_24, IdlDecimal price_percentage_change_24, IdlDecimal mark_price, IdlDecimal index_price, IdlDecimal funding_rate, Instant instant, IdlDecimal open_interest, IdlDecimal volume_24, IdlDecimal high_24, IdlDecimal low_24, IdlDecimal open_24) {
        this(new Surrogate(contract_id, bid_price, bid_size, ask_price, ask_size, last_traded_price, price_change_24, price_percentage_change_24, mark_price, index_price, funding_rate, instant, open_interest, volume_24, high_24, low_24, open_24));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(bid_price, "bid_price");
        Intrinsics.checkNotNullParameter(bid_size, "bid_size");
        Intrinsics.checkNotNullParameter(ask_price, "ask_price");
        Intrinsics.checkNotNullParameter(ask_size, "ask_size");
        Intrinsics.checkNotNullParameter(last_traded_price, "last_traded_price");
        Intrinsics.checkNotNullParameter(price_change_24, "price_change_24");
        Intrinsics.checkNotNullParameter(price_percentage_change_24, "price_percentage_change_24");
        Intrinsics.checkNotNullParameter(mark_price, "mark_price");
        Intrinsics.checkNotNullParameter(index_price, "index_price");
        Intrinsics.checkNotNullParameter(funding_rate, "funding_rate");
        Intrinsics.checkNotNullParameter(open_interest, "open_interest");
        Intrinsics.checkNotNullParameter(volume_24, "volume_24");
        Intrinsics.checkNotNullParameter(high_24, "high_24");
        Intrinsics.checkNotNullParameter(low_24, "low_24");
        Intrinsics.checkNotNullParameter(open_24, "open_24");
    }

    @Override // com.robinhood.idl.Dto
    public ContractDetails toProto() {
        return new ContractDetails(this.surrogate.getContract_id(), this.surrogate.getBid_price().getStringValue(), this.surrogate.getBid_size().getStringValue(), this.surrogate.getAsk_price().getStringValue(), this.surrogate.getAsk_size().getStringValue(), this.surrogate.getLast_traded_price().getStringValue(), this.surrogate.getPrice_change_24().getStringValue(), this.surrogate.getPrice_percentage_change_24().getStringValue(), this.surrogate.getMark_price().getStringValue(), this.surrogate.getIndex_price().getStringValue(), this.surrogate.getFunding_rate().getStringValue(), this.surrogate.getFunding_time(), this.surrogate.getOpen_interest().getStringValue(), this.surrogate.getVolume_24().getStringValue(), this.surrogate.getHigh_24().getStringValue(), this.surrogate.getLow_24().getStringValue(), this.surrogate.getOpen_24().getStringValue(), null, 131072, null);
    }

    public String toString() {
        return "[ContractDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractDetailsDto) && Intrinsics.areEqual(((ContractDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b-\b\u0083\b\u0018\u0000 [2\u00020\u0001:\u0002\\[B¸\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u000e\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0011\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0014\u0012\u0017\b\u0002\u0010\u0016\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0017\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0018\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u0019\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0017\b\u0002\u0010\u001a\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007¢\u0006\u0004\b\u001b\u0010\u001cBÅ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J'\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010,R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b:\u00106\u001a\u0004\b8\u00109R/\u0010\t\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b<\u00106\u001a\u0004\b;\u00109R/\u0010\n\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b>\u00106\u001a\u0004\b=\u00109R/\u0010\u000b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\b@\u00106\u001a\u0004\b?\u00109R/\u0010\f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\bB\u00106\u001a\u0004\bA\u00109R/\u0010\r\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\bD\u00106\u001a\u0004\bC\u00109R/\u0010\u000e\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\bF\u00106\u001a\u0004\bE\u00109R/\u0010\u000f\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00107\u0012\u0004\bH\u00106\u001a\u0004\bG\u00109R/\u0010\u0010\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00107\u0012\u0004\bJ\u00106\u001a\u0004\bI\u00109R/\u0010\u0011\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00107\u0012\u0004\bL\u00106\u001a\u0004\bK\u00109RF\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010M\u0012\u0004\bP\u00106\u001a\u0004\bN\u0010OR/\u0010\u0016\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u00107\u0012\u0004\bR\u00106\u001a\u0004\bQ\u00109R/\u0010\u0017\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00107\u0012\u0004\bT\u00106\u001a\u0004\bS\u00109R/\u0010\u0018\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u00107\u0012\u0004\bV\u00106\u001a\u0004\bU\u00109R/\u0010\u0019\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00107\u0012\u0004\bX\u00106\u001a\u0004\bW\u00109R/\u0010\u001a\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u00107\u0012\u0004\bZ\u00106\u001a\u0004\bY\u00109¨\u0006]"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;", "", "", "contract_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", BidAskDetails3.BID_PRICE, BidAskDetails3.BID_SIZE, BidAskDetails3.ASK_PRICE, BidAskDetails3.ASK_SIZE, "last_traded_price", "price_change_24", "price_percentage_change_24", "mark_price", "index_price", "funding_rate", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "funding_time", "open_interest", "volume_24", "high_24", "low_24", "open_24", "<init>", "(Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_contract_v1_externalRelease", "(Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContract_id", "getContract_id$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getBid_price", "()Lcom/robinhood/idl/IdlDecimal;", "getBid_price$annotations", "getBid_size", "getBid_size$annotations", "getAsk_price", "getAsk_price$annotations", "getAsk_size", "getAsk_size$annotations", "getLast_traded_price", "getLast_traded_price$annotations", "getPrice_change_24", "getPrice_change_24$annotations", "getPrice_percentage_change_24", "getPrice_percentage_change_24$annotations", "getMark_price", "getMark_price$annotations", "getIndex_price", "getIndex_price$annotations", "getFunding_rate", "getFunding_rate$annotations", "Lj$/time/Instant;", "getFunding_time", "()Lj$/time/Instant;", "getFunding_time$annotations", "getOpen_interest", "getOpen_interest$annotations", "getVolume_24", "getVolume_24$annotations", "getHigh_24", "getHigh_24$annotations", "getLow_24", "getLow_24$annotations", "getOpen_24", "getOpen_24$annotations", "Companion", "$serializer", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal ask_price;
        private final IdlDecimal ask_size;
        private final IdlDecimal bid_price;
        private final IdlDecimal bid_size;
        private final String contract_id;
        private final IdlDecimal funding_rate;
        private final Instant funding_time;
        private final IdlDecimal high_24;
        private final IdlDecimal index_price;
        private final IdlDecimal last_traded_price;
        private final IdlDecimal low_24;
        private final IdlDecimal mark_price;
        private final IdlDecimal open_24;
        private final IdlDecimal open_interest;
        private final IdlDecimal price_change_24;
        private final IdlDecimal price_percentage_change_24;
        private final IdlDecimal volume_24;

        public Surrogate() {
            this((String) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (Instant) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 131071, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price) && Intrinsics.areEqual(this.bid_size, surrogate.bid_size) && Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.ask_size, surrogate.ask_size) && Intrinsics.areEqual(this.last_traded_price, surrogate.last_traded_price) && Intrinsics.areEqual(this.price_change_24, surrogate.price_change_24) && Intrinsics.areEqual(this.price_percentage_change_24, surrogate.price_percentage_change_24) && Intrinsics.areEqual(this.mark_price, surrogate.mark_price) && Intrinsics.areEqual(this.index_price, surrogate.index_price) && Intrinsics.areEqual(this.funding_rate, surrogate.funding_rate) && Intrinsics.areEqual(this.funding_time, surrogate.funding_time) && Intrinsics.areEqual(this.open_interest, surrogate.open_interest) && Intrinsics.areEqual(this.volume_24, surrogate.volume_24) && Intrinsics.areEqual(this.high_24, surrogate.high_24) && Intrinsics.areEqual(this.low_24, surrogate.low_24) && Intrinsics.areEqual(this.open_24, surrogate.open_24);
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((this.contract_id.hashCode() * 31) + this.bid_price.hashCode()) * 31) + this.bid_size.hashCode()) * 31) + this.ask_price.hashCode()) * 31) + this.ask_size.hashCode()) * 31) + this.last_traded_price.hashCode()) * 31) + this.price_change_24.hashCode()) * 31) + this.price_percentage_change_24.hashCode()) * 31) + this.mark_price.hashCode()) * 31) + this.index_price.hashCode()) * 31) + this.funding_rate.hashCode()) * 31;
            Instant instant = this.funding_time;
            return ((((((((((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.open_interest.hashCode()) * 31) + this.volume_24.hashCode()) * 31) + this.high_24.hashCode()) * 31) + this.low_24.hashCode()) * 31) + this.open_24.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", bid_price=" + this.bid_price + ", bid_size=" + this.bid_size + ", ask_price=" + this.ask_price + ", ask_size=" + this.ask_size + ", last_traded_price=" + this.last_traded_price + ", price_change_24=" + this.price_change_24 + ", price_percentage_change_24=" + this.price_percentage_change_24 + ", mark_price=" + this.mark_price + ", index_price=" + this.index_price + ", funding_rate=" + this.funding_rate + ", funding_time=" + this.funding_time + ", open_interest=" + this.open_interest + ", volume_24=" + this.volume_24 + ", high_24=" + this.high_24 + ", low_24=" + this.low_24 + ", open_24=" + this.open_24 + ")";
        }

        /* compiled from: ContractDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, Instant instant, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_id = "";
            } else {
                this.contract_id = str;
            }
            if ((i & 2) == 0) {
                this.bid_price = new IdlDecimal("");
            } else {
                this.bid_price = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.bid_size = new IdlDecimal("");
            } else {
                this.bid_size = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.ask_price = new IdlDecimal("");
            } else {
                this.ask_price = idlDecimal3;
            }
            if ((i & 16) == 0) {
                this.ask_size = new IdlDecimal("");
            } else {
                this.ask_size = idlDecimal4;
            }
            if ((i & 32) == 0) {
                this.last_traded_price = new IdlDecimal("");
            } else {
                this.last_traded_price = idlDecimal5;
            }
            if ((i & 64) == 0) {
                this.price_change_24 = new IdlDecimal("");
            } else {
                this.price_change_24 = idlDecimal6;
            }
            if ((i & 128) == 0) {
                this.price_percentage_change_24 = new IdlDecimal("");
            } else {
                this.price_percentage_change_24 = idlDecimal7;
            }
            if ((i & 256) == 0) {
                this.mark_price = new IdlDecimal("");
            } else {
                this.mark_price = idlDecimal8;
            }
            if ((i & 512) == 0) {
                this.index_price = new IdlDecimal("");
            } else {
                this.index_price = idlDecimal9;
            }
            if ((i & 1024) == 0) {
                this.funding_rate = new IdlDecimal("");
            } else {
                this.funding_rate = idlDecimal10;
            }
            if ((i & 2048) == 0) {
                this.funding_time = null;
            } else {
                this.funding_time = instant;
            }
            this.open_interest = (i & 4096) == 0 ? new IdlDecimal("") : idlDecimal11;
            this.volume_24 = (i & 8192) == 0 ? new IdlDecimal("") : idlDecimal12;
            this.high_24 = (i & 16384) == 0 ? new IdlDecimal("") : idlDecimal13;
            this.low_24 = (32768 & i) == 0 ? new IdlDecimal("") : idlDecimal14;
            this.open_24 = (i & 65536) == 0 ? new IdlDecimal("") : idlDecimal15;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_contract_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            if (!Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.bid_price);
            }
            if (!Intrinsics.areEqual(self.bid_size, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.bid_size);
            }
            if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.ask_price);
            }
            if (!Intrinsics.areEqual(self.ask_size, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.ask_size);
            }
            if (!Intrinsics.areEqual(self.last_traded_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 5, IdlDecimalSerializer.INSTANCE, self.last_traded_price);
            }
            if (!Intrinsics.areEqual(self.price_change_24, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 6, IdlDecimalSerializer.INSTANCE, self.price_change_24);
            }
            if (!Intrinsics.areEqual(self.price_percentage_change_24, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 7, IdlDecimalSerializer.INSTANCE, self.price_percentage_change_24);
            }
            if (!Intrinsics.areEqual(self.mark_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 8, IdlDecimalSerializer.INSTANCE, self.mark_price);
            }
            if (!Intrinsics.areEqual(self.index_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 9, IdlDecimalSerializer.INSTANCE, self.index_price);
            }
            if (!Intrinsics.areEqual(self.funding_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 10, IdlDecimalSerializer.INSTANCE, self.funding_rate);
            }
            Instant instant = self.funding_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.open_interest, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 12, IdlDecimalSerializer.INSTANCE, self.open_interest);
            }
            if (!Intrinsics.areEqual(self.volume_24, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 13, IdlDecimalSerializer.INSTANCE, self.volume_24);
            }
            if (!Intrinsics.areEqual(self.high_24, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 14, IdlDecimalSerializer.INSTANCE, self.high_24);
            }
            if (!Intrinsics.areEqual(self.low_24, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 15, IdlDecimalSerializer.INSTANCE, self.low_24);
            }
            if (Intrinsics.areEqual(self.open_24, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 16, IdlDecimalSerializer.INSTANCE, self.open_24);
        }

        public Surrogate(String contract_id, IdlDecimal bid_price, IdlDecimal bid_size, IdlDecimal ask_price, IdlDecimal ask_size, IdlDecimal last_traded_price, IdlDecimal price_change_24, IdlDecimal price_percentage_change_24, IdlDecimal mark_price, IdlDecimal index_price, IdlDecimal funding_rate, Instant instant, IdlDecimal open_interest, IdlDecimal volume_24, IdlDecimal high_24, IdlDecimal low_24, IdlDecimal open_24) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            Intrinsics.checkNotNullParameter(bid_size, "bid_size");
            Intrinsics.checkNotNullParameter(ask_price, "ask_price");
            Intrinsics.checkNotNullParameter(ask_size, "ask_size");
            Intrinsics.checkNotNullParameter(last_traded_price, "last_traded_price");
            Intrinsics.checkNotNullParameter(price_change_24, "price_change_24");
            Intrinsics.checkNotNullParameter(price_percentage_change_24, "price_percentage_change_24");
            Intrinsics.checkNotNullParameter(mark_price, "mark_price");
            Intrinsics.checkNotNullParameter(index_price, "index_price");
            Intrinsics.checkNotNullParameter(funding_rate, "funding_rate");
            Intrinsics.checkNotNullParameter(open_interest, "open_interest");
            Intrinsics.checkNotNullParameter(volume_24, "volume_24");
            Intrinsics.checkNotNullParameter(high_24, "high_24");
            Intrinsics.checkNotNullParameter(low_24, "low_24");
            Intrinsics.checkNotNullParameter(open_24, "open_24");
            this.contract_id = contract_id;
            this.bid_price = bid_price;
            this.bid_size = bid_size;
            this.ask_price = ask_price;
            this.ask_size = ask_size;
            this.last_traded_price = last_traded_price;
            this.price_change_24 = price_change_24;
            this.price_percentage_change_24 = price_percentage_change_24;
            this.mark_price = mark_price;
            this.index_price = index_price;
            this.funding_rate = funding_rate;
            this.funding_time = instant;
            this.open_interest = open_interest;
            this.volume_24 = volume_24;
            this.high_24 = high_24;
            this.low_24 = low_24;
            this.open_24 = open_24;
        }

        public /* synthetic */ Surrogate(String str, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, IdlDecimal idlDecimal4, IdlDecimal idlDecimal5, IdlDecimal idlDecimal6, IdlDecimal idlDecimal7, IdlDecimal idlDecimal8, IdlDecimal idlDecimal9, IdlDecimal idlDecimal10, Instant instant, IdlDecimal idlDecimal11, IdlDecimal idlDecimal12, IdlDecimal idlDecimal13, IdlDecimal idlDecimal14, IdlDecimal idlDecimal15, int i, DefaultConstructorMarker defaultConstructorMarker) {
            IdlDecimal idlDecimal16;
            IdlDecimal idlDecimal17;
            String str2;
            IdlDecimal idlDecimal18;
            IdlDecimal idlDecimal19;
            IdlDecimal idlDecimal20;
            IdlDecimal idlDecimal21;
            IdlDecimal idlDecimal22;
            IdlDecimal idlDecimal23;
            IdlDecimal idlDecimal24;
            IdlDecimal idlDecimal25;
            IdlDecimal idlDecimal26;
            IdlDecimal idlDecimal27;
            IdlDecimal idlDecimal28;
            Instant instant2;
            IdlDecimal idlDecimal29;
            IdlDecimal idlDecimal30;
            String str3 = (i & 1) != 0 ? "" : str;
            IdlDecimal idlDecimal31 = (i & 2) != 0 ? new IdlDecimal("") : idlDecimal;
            IdlDecimal idlDecimal32 = (i & 4) != 0 ? new IdlDecimal("") : idlDecimal2;
            IdlDecimal idlDecimal33 = (i & 8) != 0 ? new IdlDecimal("") : idlDecimal3;
            IdlDecimal idlDecimal34 = (i & 16) != 0 ? new IdlDecimal("") : idlDecimal4;
            IdlDecimal idlDecimal35 = (i & 32) != 0 ? new IdlDecimal("") : idlDecimal5;
            IdlDecimal idlDecimal36 = (i & 64) != 0 ? new IdlDecimal("") : idlDecimal6;
            IdlDecimal idlDecimal37 = (i & 128) != 0 ? new IdlDecimal("") : idlDecimal7;
            IdlDecimal idlDecimal38 = (i & 256) != 0 ? new IdlDecimal("") : idlDecimal8;
            IdlDecimal idlDecimal39 = (i & 512) != 0 ? new IdlDecimal("") : idlDecimal9;
            IdlDecimal idlDecimal40 = (i & 1024) != 0 ? new IdlDecimal("") : idlDecimal10;
            Instant instant3 = (i & 2048) != 0 ? null : instant;
            IdlDecimal idlDecimal41 = (i & 4096) != 0 ? new IdlDecimal("") : idlDecimal11;
            IdlDecimal idlDecimal42 = (i & 8192) != 0 ? new IdlDecimal("") : idlDecimal12;
            String str4 = str3;
            IdlDecimal idlDecimal43 = (i & 16384) != 0 ? new IdlDecimal("") : idlDecimal13;
            IdlDecimal idlDecimal44 = (i & 32768) != 0 ? new IdlDecimal("") : idlDecimal14;
            if ((i & 65536) != 0) {
                idlDecimal17 = idlDecimal44;
                idlDecimal16 = new IdlDecimal("");
                idlDecimal18 = idlDecimal43;
                idlDecimal19 = idlDecimal31;
                idlDecimal20 = idlDecimal32;
                idlDecimal21 = idlDecimal33;
                idlDecimal22 = idlDecimal34;
                idlDecimal23 = idlDecimal35;
                idlDecimal24 = idlDecimal36;
                idlDecimal25 = idlDecimal37;
                idlDecimal26 = idlDecimal38;
                idlDecimal27 = idlDecimal39;
                idlDecimal28 = idlDecimal40;
                instant2 = instant3;
                idlDecimal29 = idlDecimal41;
                idlDecimal30 = idlDecimal42;
                str2 = str4;
            } else {
                idlDecimal16 = idlDecimal15;
                idlDecimal17 = idlDecimal44;
                str2 = str4;
                idlDecimal18 = idlDecimal43;
                idlDecimal19 = idlDecimal31;
                idlDecimal20 = idlDecimal32;
                idlDecimal21 = idlDecimal33;
                idlDecimal22 = idlDecimal34;
                idlDecimal23 = idlDecimal35;
                idlDecimal24 = idlDecimal36;
                idlDecimal25 = idlDecimal37;
                idlDecimal26 = idlDecimal38;
                idlDecimal27 = idlDecimal39;
                idlDecimal28 = idlDecimal40;
                instant2 = instant3;
                idlDecimal29 = idlDecimal41;
                idlDecimal30 = idlDecimal42;
            }
            this(str2, idlDecimal19, idlDecimal20, idlDecimal21, idlDecimal22, idlDecimal23, idlDecimal24, idlDecimal25, idlDecimal26, idlDecimal27, idlDecimal28, instant2, idlDecimal29, idlDecimal30, idlDecimal18, idlDecimal17, idlDecimal16);
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final IdlDecimal getBid_price() {
            return this.bid_price;
        }

        public final IdlDecimal getBid_size() {
            return this.bid_size;
        }

        public final IdlDecimal getAsk_price() {
            return this.ask_price;
        }

        public final IdlDecimal getAsk_size() {
            return this.ask_size;
        }

        public final IdlDecimal getLast_traded_price() {
            return this.last_traded_price;
        }

        public final IdlDecimal getPrice_change_24() {
            return this.price_change_24;
        }

        public final IdlDecimal getPrice_percentage_change_24() {
            return this.price_percentage_change_24;
        }

        public final IdlDecimal getMark_price() {
            return this.mark_price;
        }

        public final IdlDecimal getIndex_price() {
            return this.index_price;
        }

        public final IdlDecimal getFunding_rate() {
            return this.funding_rate;
        }

        public final Instant getFunding_time() {
            return this.funding_time;
        }

        public final IdlDecimal getOpen_interest() {
            return this.open_interest;
        }

        public final IdlDecimal getVolume_24() {
            return this.volume_24;
        }

        public final IdlDecimal getHigh_24() {
            return this.high_24;
        }

        public final IdlDecimal getLow_24() {
            return this.low_24;
        }

        public final IdlDecimal getOpen_24() {
            return this.open_24;
        }
    }

    /* compiled from: ContractDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/contract/v1/ContractDetailsDto;", "Lcrypto_perpetuals/contract/v1/ContractDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/contract/v1/ContractDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ContractDetailsDto, ContractDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContractDetails> getProtoAdapter() {
            return ContractDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractDetailsDto getZeroValue() {
            return ContractDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractDetailsDto fromProto(ContractDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ContractDetailsDto(new Surrogate(proto.getContract_id(), new IdlDecimal(proto.getBid_price()), new IdlDecimal(proto.getBid_size()), new IdlDecimal(proto.getAsk_price()), new IdlDecimal(proto.getAsk_size()), new IdlDecimal(proto.getLast_traded_price()), new IdlDecimal(proto.getPrice_change_24()), new IdlDecimal(proto.getPrice_percentage_change_24()), new IdlDecimal(proto.getMark_price()), new IdlDecimal(proto.getIndex_price()), new IdlDecimal(proto.getFunding_rate()), proto.getFunding_time(), new IdlDecimal(proto.getOpen_interest()), new IdlDecimal(proto.getVolume_24()), new IdlDecimal(proto.getHigh_24()), new IdlDecimal(proto.getLow_24()), new IdlDecimal(proto.getOpen_24())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.contract.v1.ContractDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ContractDetailsDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/contract/v1/ContractDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/contract/v1/ContractDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<ContractDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.contract.v1.ContractDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/contract/v1/ContractDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.contract.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "crypto_perpetuals.contract.v1.ContractDetailsDto";
        }
    }
}
