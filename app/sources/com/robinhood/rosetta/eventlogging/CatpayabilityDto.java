package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.CatpayabilityItemDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CatpayabilityDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\rJ6\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/Catpayability;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Surrogate;)V", "withdraw", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;", "buy_withdraw", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "sell_deposit", "(Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;)V", "getWithdraw", "()Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;", "getBuy_withdraw", "getDeposit", "getSell_deposit", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayabilityDto implements Dto3<Catpayability>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayabilityDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayabilityDto, Catpayability>> binaryBase64Serializer$delegate;
    private static final CatpayabilityDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayabilityDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayabilityDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CatpayabilityItemDto getWithdraw() {
        return this.surrogate.getWithdraw();
    }

    public final CatpayabilityItemDto getBuy_withdraw() {
        return this.surrogate.getBuy_withdraw();
    }

    public final CatpayabilityItemDto getDeposit() {
        return this.surrogate.getDeposit();
    }

    public final CatpayabilityItemDto getSell_deposit() {
        return this.surrogate.getSell_deposit();
    }

    public /* synthetic */ CatpayabilityDto(CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catpayabilityItemDto, (i & 2) != 0 ? null : catpayabilityItemDto2, (i & 4) != 0 ? null : catpayabilityItemDto3, (i & 8) != 0 ? null : catpayabilityItemDto4);
    }

    public CatpayabilityDto(CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4) {
        this(new Surrogate(catpayabilityItemDto, catpayabilityItemDto2, catpayabilityItemDto3, catpayabilityItemDto4));
    }

    public static /* synthetic */ CatpayabilityDto copy$default(CatpayabilityDto catpayabilityDto, CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            catpayabilityItemDto = catpayabilityDto.surrogate.getWithdraw();
        }
        if ((i & 2) != 0) {
            catpayabilityItemDto2 = catpayabilityDto.surrogate.getBuy_withdraw();
        }
        if ((i & 4) != 0) {
            catpayabilityItemDto3 = catpayabilityDto.surrogate.getDeposit();
        }
        if ((i & 8) != 0) {
            catpayabilityItemDto4 = catpayabilityDto.surrogate.getSell_deposit();
        }
        return catpayabilityDto.copy(catpayabilityItemDto, catpayabilityItemDto2, catpayabilityItemDto3, catpayabilityItemDto4);
    }

    public final CatpayabilityDto copy(CatpayabilityItemDto withdraw, CatpayabilityItemDto buy_withdraw, CatpayabilityItemDto deposit, CatpayabilityItemDto sell_deposit) {
        return new CatpayabilityDto(new Surrogate(withdraw, buy_withdraw, deposit, sell_deposit));
    }

    @Override // com.robinhood.idl.Dto
    public Catpayability toProto() {
        CatpayabilityItemDto withdraw = this.surrogate.getWithdraw();
        CatpayabilityItem proto = withdraw != null ? withdraw.toProto() : null;
        CatpayabilityItemDto buy_withdraw = this.surrogate.getBuy_withdraw();
        CatpayabilityItem proto2 = buy_withdraw != null ? buy_withdraw.toProto() : null;
        CatpayabilityItemDto deposit = this.surrogate.getDeposit();
        CatpayabilityItem proto3 = deposit != null ? deposit.toProto() : null;
        CatpayabilityItemDto sell_deposit = this.surrogate.getSell_deposit();
        return new Catpayability(proto, proto2, proto3, sell_deposit != null ? sell_deposit.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CatpayabilityDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayabilityDto) && Intrinsics.areEqual(((CatpayabilityDto) other).surrogate, this.surrogate);
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
    /* compiled from: CatpayabilityDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Surrogate;", "", "withdraw", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;", "buy_withdraw", CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, "sell_deposit", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getWithdraw$annotations", "()V", "getWithdraw", "()Lcom/robinhood/rosetta/eventlogging/CatpayabilityItemDto;", "getBuy_withdraw$annotations", "getBuy_withdraw", "getDeposit$annotations", "getDeposit", "getSell_deposit$annotations", "getSell_deposit", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CatpayabilityItemDto buy_withdraw;
        private final CatpayabilityItemDto deposit;
        private final CatpayabilityItemDto sell_deposit;
        private final CatpayabilityItemDto withdraw;

        public Surrogate() {
            this((CatpayabilityItemDto) null, (CatpayabilityItemDto) null, (CatpayabilityItemDto) null, (CatpayabilityItemDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4, int i, Object obj) {
            if ((i & 1) != 0) {
                catpayabilityItemDto = surrogate.withdraw;
            }
            if ((i & 2) != 0) {
                catpayabilityItemDto2 = surrogate.buy_withdraw;
            }
            if ((i & 4) != 0) {
                catpayabilityItemDto3 = surrogate.deposit;
            }
            if ((i & 8) != 0) {
                catpayabilityItemDto4 = surrogate.sell_deposit;
            }
            return surrogate.copy(catpayabilityItemDto, catpayabilityItemDto2, catpayabilityItemDto3, catpayabilityItemDto4);
        }

        @SerialName("buyWithdraw")
        @JsonAnnotations2(names = {"buy_withdraw"})
        public static /* synthetic */ void getBuy_withdraw$annotations() {
        }

        @SerialName(CryptoCostBasisDetailsListDuxo.SOURCE_TYPE)
        @JsonAnnotations2(names = {CryptoCostBasisDetailsListDuxo.SOURCE_TYPE})
        public static /* synthetic */ void getDeposit$annotations() {
        }

        @SerialName("sellDeposit")
        @JsonAnnotations2(names = {"sell_deposit"})
        public static /* synthetic */ void getSell_deposit$annotations() {
        }

        @SerialName("withdraw")
        @JsonAnnotations2(names = {"withdraw"})
        public static /* synthetic */ void getWithdraw$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CatpayabilityItemDto getWithdraw() {
            return this.withdraw;
        }

        /* renamed from: component2, reason: from getter */
        public final CatpayabilityItemDto getBuy_withdraw() {
            return this.buy_withdraw;
        }

        /* renamed from: component3, reason: from getter */
        public final CatpayabilityItemDto getDeposit() {
            return this.deposit;
        }

        /* renamed from: component4, reason: from getter */
        public final CatpayabilityItemDto getSell_deposit() {
            return this.sell_deposit;
        }

        public final Surrogate copy(CatpayabilityItemDto withdraw, CatpayabilityItemDto buy_withdraw, CatpayabilityItemDto deposit, CatpayabilityItemDto sell_deposit) {
            return new Surrogate(withdraw, buy_withdraw, deposit, sell_deposit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.withdraw, surrogate.withdraw) && Intrinsics.areEqual(this.buy_withdraw, surrogate.buy_withdraw) && Intrinsics.areEqual(this.deposit, surrogate.deposit) && Intrinsics.areEqual(this.sell_deposit, surrogate.sell_deposit);
        }

        public int hashCode() {
            CatpayabilityItemDto catpayabilityItemDto = this.withdraw;
            int iHashCode = (catpayabilityItemDto == null ? 0 : catpayabilityItemDto.hashCode()) * 31;
            CatpayabilityItemDto catpayabilityItemDto2 = this.buy_withdraw;
            int iHashCode2 = (iHashCode + (catpayabilityItemDto2 == null ? 0 : catpayabilityItemDto2.hashCode())) * 31;
            CatpayabilityItemDto catpayabilityItemDto3 = this.deposit;
            int iHashCode3 = (iHashCode2 + (catpayabilityItemDto3 == null ? 0 : catpayabilityItemDto3.hashCode())) * 31;
            CatpayabilityItemDto catpayabilityItemDto4 = this.sell_deposit;
            return iHashCode3 + (catpayabilityItemDto4 != null ? catpayabilityItemDto4.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(withdraw=" + this.withdraw + ", buy_withdraw=" + this.buy_withdraw + ", deposit=" + this.deposit + ", sell_deposit=" + this.sell_deposit + ")";
        }

        /* compiled from: CatpayabilityDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayabilityDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.withdraw = null;
            } else {
                this.withdraw = catpayabilityItemDto;
            }
            if ((i & 2) == 0) {
                this.buy_withdraw = null;
            } else {
                this.buy_withdraw = catpayabilityItemDto2;
            }
            if ((i & 4) == 0) {
                this.deposit = null;
            } else {
                this.deposit = catpayabilityItemDto3;
            }
            if ((i & 8) == 0) {
                this.sell_deposit = null;
            } else {
                this.sell_deposit = catpayabilityItemDto4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CatpayabilityItemDto catpayabilityItemDto = self.withdraw;
            if (catpayabilityItemDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CatpayabilityItemDto.Serializer.INSTANCE, catpayabilityItemDto);
            }
            CatpayabilityItemDto catpayabilityItemDto2 = self.buy_withdraw;
            if (catpayabilityItemDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CatpayabilityItemDto.Serializer.INSTANCE, catpayabilityItemDto2);
            }
            CatpayabilityItemDto catpayabilityItemDto3 = self.deposit;
            if (catpayabilityItemDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, CatpayabilityItemDto.Serializer.INSTANCE, catpayabilityItemDto3);
            }
            CatpayabilityItemDto catpayabilityItemDto4 = self.sell_deposit;
            if (catpayabilityItemDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CatpayabilityItemDto.Serializer.INSTANCE, catpayabilityItemDto4);
            }
        }

        public Surrogate(CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4) {
            this.withdraw = catpayabilityItemDto;
            this.buy_withdraw = catpayabilityItemDto2;
            this.deposit = catpayabilityItemDto3;
            this.sell_deposit = catpayabilityItemDto4;
        }

        public /* synthetic */ Surrogate(CatpayabilityItemDto catpayabilityItemDto, CatpayabilityItemDto catpayabilityItemDto2, CatpayabilityItemDto catpayabilityItemDto3, CatpayabilityItemDto catpayabilityItemDto4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : catpayabilityItemDto, (i & 2) != 0 ? null : catpayabilityItemDto2, (i & 4) != 0 ? null : catpayabilityItemDto3, (i & 8) != 0 ? null : catpayabilityItemDto4);
        }

        public final CatpayabilityItemDto getWithdraw() {
            return this.withdraw;
        }

        public final CatpayabilityItemDto getBuy_withdraw() {
            return this.buy_withdraw;
        }

        public final CatpayabilityItemDto getDeposit() {
            return this.deposit;
        }

        public final CatpayabilityItemDto getSell_deposit() {
            return this.sell_deposit;
        }
    }

    /* compiled from: CatpayabilityDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "Lcom/robinhood/rosetta/eventlogging/Catpayability;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CatpayabilityDto, Catpayability> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayabilityDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayabilityDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayabilityDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayabilityDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Catpayability> getProtoAdapter() {
            return Catpayability.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayabilityDto getZeroValue() {
            return CatpayabilityDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayabilityDto fromProto(Catpayability proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CatpayabilityItem withdraw = proto.getWithdraw();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CatpayabilityItemDto catpayabilityItemDtoFromProto = withdraw != null ? CatpayabilityItemDto.INSTANCE.fromProto(withdraw) : null;
            CatpayabilityItem buy_withdraw = proto.getBuy_withdraw();
            CatpayabilityItemDto catpayabilityItemDtoFromProto2 = buy_withdraw != null ? CatpayabilityItemDto.INSTANCE.fromProto(buy_withdraw) : null;
            CatpayabilityItem deposit = proto.getDeposit();
            CatpayabilityItemDto catpayabilityItemDtoFromProto3 = deposit != null ? CatpayabilityItemDto.INSTANCE.fromProto(deposit) : null;
            CatpayabilityItem sell_deposit = proto.getSell_deposit();
            return new CatpayabilityDto(new Surrogate(catpayabilityItemDtoFromProto, catpayabilityItemDtoFromProto2, catpayabilityItemDtoFromProto3, sell_deposit != null ? CatpayabilityItemDto.INSTANCE.fromProto(sell_deposit) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayabilityDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayabilityDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayabilityDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CatpayabilityDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayabilityDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.Catpayability", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayabilityDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayabilityDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayabilityDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CatpayabilityDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayabilityDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayabilityDto";
        }
    }
}
