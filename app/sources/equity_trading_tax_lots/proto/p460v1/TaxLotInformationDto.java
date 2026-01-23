package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.TaxLotTermDto;
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
import p479j$.time.Instant;

/* compiled from: TaxLotInformationDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;)V", "", "id", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "term", "Lcom/robinhood/rosetta/common/MoneyDto;", "cost_basis", "Lcom/robinhood/idl/IdlDecimal;", "available_shares", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "purchase_date", "", "is_selectable", "lot_date", "(Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;ZLj$/time/Instant;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class TaxLotInformationDto implements Dto3<TaxLotInformation>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLotInformationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotInformationDto, TaxLotInformation>> binaryBase64Serializer$delegate;
    private static final TaxLotInformationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLotInformationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotInformationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ TaxLotInformationDto(String str, TaxLotTermDto taxLotTermDto, MoneyDto moneyDto, IdlDecimal idlDecimal, Instant instant, boolean z, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotTermDto.INSTANCE.getZeroValue() : taxLotTermDto, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : instant2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLotInformationDto(String id, TaxLotTermDto term, MoneyDto moneyDto, IdlDecimal available_shares, Instant instant, boolean z, Instant instant2) {
        this(new Surrogate(id, term, moneyDto, available_shares, instant, z, instant2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(available_shares, "available_shares");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxLotInformation toProto() {
        String id = this.surrogate.getId();
        TaxLotTerm taxLotTerm = (TaxLotTerm) this.surrogate.getTerm().toProto();
        MoneyDto cost_basis = this.surrogate.getCost_basis();
        return new TaxLotInformation(id, taxLotTerm, cost_basis != null ? cost_basis.toProto() : null, this.surrogate.getAvailable_shares().getStringValue(), this.surrogate.getPurchase_date(), this.surrogate.getIs_selectable(), this.surrogate.getLot_date(), null, 128, null);
    }

    public String toString() {
        return "[TaxLotInformationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLotInformationDto) && Intrinsics.areEqual(((TaxLotInformationDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLotInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBª\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012.\b\u0002\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0014\u0010\u0015B_\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109RF\u0010\u0010\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010?\u0012\u0004\bA\u0010.\u001a\u0004\b\u0012\u0010@RF\u0010\u0013\u001a(\u0018\u00010\rj\u0013\u0018\u0001`\u000e¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010;\u0012\u0004\bC\u0010.\u001a\u0004\bB\u0010=¨\u0006F"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;", "", "", "id", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "term", "Lcom/robinhood/rosetta/common/MoneyDto;", "cost_basis", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "available_shares", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "purchase_date", "", "is_selectable", "lot_date", "<init>", "(Ljava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;ZLj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lj$/time/Instant;ZLj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "getTerm", "()Lequity_trading_tax_lots/proto/v1/TaxLotTermDto;", "getTerm$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getCost_basis", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCost_basis$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getAvailable_shares", "()Lcom/robinhood/idl/IdlDecimal;", "getAvailable_shares$annotations", "Lj$/time/Instant;", "getPurchase_date", "()Lj$/time/Instant;", "getPurchase_date$annotations", "Z", "()Z", "is_selectable$annotations", "getLot_date", "getLot_date$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal available_shares;
        private final MoneyDto cost_basis;
        private final String id;
        private final boolean is_selectable;
        private final Instant lot_date;
        private final Instant purchase_date;
        private final TaxLotTermDto term;

        public Surrogate() {
            this((String) null, (TaxLotTermDto) null, (MoneyDto) null, (IdlDecimal) null, (Instant) null, false, (Instant) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.term == surrogate.term && Intrinsics.areEqual(this.cost_basis, surrogate.cost_basis) && Intrinsics.areEqual(this.available_shares, surrogate.available_shares) && Intrinsics.areEqual(this.purchase_date, surrogate.purchase_date) && this.is_selectable == surrogate.is_selectable && Intrinsics.areEqual(this.lot_date, surrogate.lot_date);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.term.hashCode()) * 31;
            MoneyDto moneyDto = this.cost_basis;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.available_shares.hashCode()) * 31;
            Instant instant = this.purchase_date;
            int iHashCode3 = (((iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31) + Boolean.hashCode(this.is_selectable)) * 31;
            Instant instant2 = this.lot_date;
            return iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", term=" + this.term + ", cost_basis=" + this.cost_basis + ", available_shares=" + this.available_shares + ", purchase_date=" + this.purchase_date + ", is_selectable=" + this.is_selectable + ", lot_date=" + this.lot_date + ")";
        }

        /* compiled from: TaxLotInformationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLotInformationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TaxLotTermDto taxLotTermDto, MoneyDto moneyDto, IdlDecimal idlDecimal, Instant instant, boolean z, Instant instant2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.term = TaxLotTermDto.INSTANCE.getZeroValue();
            } else {
                this.term = taxLotTermDto;
            }
            if ((i & 4) == 0) {
                this.cost_basis = null;
            } else {
                this.cost_basis = moneyDto;
            }
            if ((i & 8) == 0) {
                this.available_shares = new IdlDecimal("");
            } else {
                this.available_shares = idlDecimal;
            }
            if ((i & 16) == 0) {
                this.purchase_date = null;
            } else {
                this.purchase_date = instant;
            }
            if ((i & 32) == 0) {
                this.is_selectable = false;
            } else {
                this.is_selectable = z;
            }
            if ((i & 64) == 0) {
                this.lot_date = null;
            } else {
                this.lot_date = instant2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.term != TaxLotTermDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TaxLotTermDto.Serializer.INSTANCE, self.term);
            }
            MoneyDto moneyDto = self.cost_basis;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.available_shares, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.available_shares);
            }
            Instant instant = self.purchase_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, WireInstantSerializer.INSTANCE, instant);
            }
            boolean z = self.is_selectable;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            Instant instant2 = self.lot_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant2);
            }
        }

        public Surrogate(String id, TaxLotTermDto term, MoneyDto moneyDto, IdlDecimal available_shares, Instant instant, boolean z, Instant instant2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(term, "term");
            Intrinsics.checkNotNullParameter(available_shares, "available_shares");
            this.id = id;
            this.term = term;
            this.cost_basis = moneyDto;
            this.available_shares = available_shares;
            this.purchase_date = instant;
            this.is_selectable = z;
            this.lot_date = instant2;
        }

        public /* synthetic */ Surrogate(String str, TaxLotTermDto taxLotTermDto, MoneyDto moneyDto, IdlDecimal idlDecimal, Instant instant, boolean z, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxLotTermDto.INSTANCE.getZeroValue() : taxLotTermDto, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : instant2);
        }

        public final String getId() {
            return this.id;
        }

        public final TaxLotTermDto getTerm() {
            return this.term;
        }

        public final MoneyDto getCost_basis() {
            return this.cost_basis;
        }

        public final IdlDecimal getAvailable_shares() {
            return this.available_shares;
        }

        public final Instant getPurchase_date() {
            return this.purchase_date;
        }

        /* renamed from: is_selectable, reason: from getter */
        public final boolean getIs_selectable() {
            return this.is_selectable;
        }

        public final Instant getLot_date() {
            return this.lot_date;
        }
    }

    /* compiled from: TaxLotInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto;", "Lequity_trading_tax_lots/proto/v1/TaxLotInformation;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLotInformationDto, TaxLotInformation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotInformationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotInformationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotInformationDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotInformationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotInformation> getProtoAdapter() {
            return TaxLotInformation.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotInformationDto getZeroValue() {
            return TaxLotInformationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotInformationDto fromProto(TaxLotInformation proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            TaxLotTermDto taxLotTermDtoFromProto = TaxLotTermDto.INSTANCE.fromProto(proto.getTerm());
            Money cost_basis = proto.getCost_basis();
            return new TaxLotInformationDto(new Surrogate(id, taxLotTermDtoFromProto, cost_basis != null ? MoneyDto.INSTANCE.fromProto(cost_basis) : null, new IdlDecimal(proto.getAvailable_shares()), proto.getPurchase_date(), proto.getIs_selectable(), proto.getLot_date()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.TaxLotInformationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotInformationDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLotInformationDto(null, null, null, null, null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLotInformationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLotInformationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.TaxLotInformation", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotInformationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotInformationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLotInformationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLotInformationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/TaxLotInformationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.TaxLotInformationDto";
        }
    }
}
