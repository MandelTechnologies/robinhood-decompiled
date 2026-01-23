package microgram.contracts.invest_tab_highlights.proto.p494v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
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
import microgram.contracts.invest_tab_highlights.proto.p494v1.DayNightColorDto;

/* compiled from: ContractContentDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;)V", "", "contract_name", "score", "Lcom/robinhood/idl/IdlDecimal;", "last_trade_price", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;", ResourceTypes.COLOR, "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;)V", "toProto", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;", "getContract_name", "getScore", "getLast_trade_price", "()Lcom/robinhood/idl/IdlDecimal;", "getColor", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class ContractContentDto implements Dto3<ContractContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractContentDto, ContractContent>> binaryBase64Serializer$delegate;
    private static final ContractContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_name() {
        return this.surrogate.getContract_name();
    }

    public final String getScore() {
        return this.surrogate.getScore();
    }

    public final IdlDecimal getLast_trade_price() {
        return this.surrogate.getLast_trade_price();
    }

    public final DayNightColorDto getColor() {
        return this.surrogate.getColor();
    }

    public /* synthetic */ ContractContentDto(String str, String str2, IdlDecimal idlDecimal, DayNightColorDto dayNightColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : dayNightColorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractContentDto(String contract_name, String score, IdlDecimal last_trade_price, DayNightColorDto dayNightColorDto) {
        this(new Surrogate(contract_name, score, last_trade_price, dayNightColorDto));
        Intrinsics.checkNotNullParameter(contract_name, "contract_name");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
    }

    @Override // com.robinhood.idl.Dto
    public ContractContent toProto() {
        String contract_name = this.surrogate.getContract_name();
        String score = this.surrogate.getScore();
        String stringValue = this.surrogate.getLast_trade_price().getStringValue();
        DayNightColorDto color = this.surrogate.getColor();
        return new ContractContent(contract_name, score, stringValue, color != null ? color.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[ContractContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractContentDto) && Intrinsics.areEqual(((ContractContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractContentDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B@\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBC\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;", "", "", "contract_name", "score", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "last_trade_price", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;", ResourceTypes.COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContract_name", "getContract_name$annotations", "()V", "getScore", "getScore$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getLast_trade_price", "()Lcom/robinhood/idl/IdlDecimal;", "getLast_trade_price$annotations", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;", "getColor", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/DayNightColorDto;", "getColor$annotations", "Companion", "$serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DayNightColorDto color;
        private final String contract_name;
        private final IdlDecimal last_trade_price;
        private final String score;

        public Surrogate() {
            this((String) null, (String) null, (IdlDecimal) null, (DayNightColorDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_name, surrogate.contract_name) && Intrinsics.areEqual(this.score, surrogate.score) && Intrinsics.areEqual(this.last_trade_price, surrogate.last_trade_price) && Intrinsics.areEqual(this.color, surrogate.color);
        }

        public int hashCode() {
            int iHashCode = ((((this.contract_name.hashCode() * 31) + this.score.hashCode()) * 31) + this.last_trade_price.hashCode()) * 31;
            DayNightColorDto dayNightColorDto = this.color;
            return iHashCode + (dayNightColorDto == null ? 0 : dayNightColorDto.hashCode());
        }

        public String toString() {
            return "Surrogate(contract_name=" + this.contract_name + ", score=" + this.score + ", last_trade_price=" + this.last_trade_price + ", color=" + this.color + ")";
        }

        /* compiled from: ContractContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractContentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IdlDecimal idlDecimal, DayNightColorDto dayNightColorDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract_name = "";
            } else {
                this.contract_name = str;
            }
            if ((i & 2) == 0) {
                this.score = "";
            } else {
                this.score = str2;
            }
            if ((i & 4) == 0) {
                this.last_trade_price = new IdlDecimal("");
            } else {
                this.last_trade_price = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.color = null;
            } else {
                this.color = dayNightColorDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease */
        public static final /* synthetic */ void m3750x47065b30(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_name);
            }
            if (!Intrinsics.areEqual(self.score, "")) {
                output.encodeStringElement(serialDesc, 1, self.score);
            }
            if (!Intrinsics.areEqual(self.last_trade_price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.last_trade_price);
            }
            DayNightColorDto dayNightColorDto = self.color;
            if (dayNightColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DayNightColorDto.Serializer.INSTANCE, dayNightColorDto);
            }
        }

        public Surrogate(String contract_name, String score, IdlDecimal last_trade_price, DayNightColorDto dayNightColorDto) {
            Intrinsics.checkNotNullParameter(contract_name, "contract_name");
            Intrinsics.checkNotNullParameter(score, "score");
            Intrinsics.checkNotNullParameter(last_trade_price, "last_trade_price");
            this.contract_name = contract_name;
            this.score = score;
            this.last_trade_price = last_trade_price;
            this.color = dayNightColorDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, IdlDecimal idlDecimal, DayNightColorDto dayNightColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : dayNightColorDto);
        }

        public final String getContract_name() {
            return this.contract_name;
        }

        public final String getScore() {
            return this.score;
        }

        public final IdlDecimal getLast_trade_price() {
            return this.last_trade_price;
        }

        public final DayNightColorDto getColor() {
            return this.color;
        }
    }

    /* compiled from: ContractContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ContractContentDto, ContractContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractContentDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContractContent> getProtoAdapter() {
            return ContractContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractContentDto getZeroValue() {
            return ContractContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractContentDto fromProto(ContractContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String contract_name = proto.getContract_name();
            String score = proto.getScore();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getLast_trade_price());
            DayNightColor color = proto.getColor();
            return new ContractContentDto(new Surrogate(contract_name, score, idlDecimal, color != null ? DayNightColorDto.INSTANCE.fromProto(color) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.ContractContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractContentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ContractContentDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContractContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.invest_tab_highlights.proto.v1.ContractContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "microgram.contracts.invest_tab_highlights.proto.v1.ContractContentDto";
        }
    }
}
