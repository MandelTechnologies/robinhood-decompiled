package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import bff_money_movement.service.p019v1.RobinhoodAccountDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
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

/* compiled from: GetNonOriginatedTransferInfoRequestDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;)V", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "transfer_type", "Lcom/robinhood/rosetta/common/CurrencyDto;", "currency", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "robinhood_account", "(Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lbff_money_movement/service/v1/RobinhoodAccountDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;", "getTransfer_type", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getRobinhood_account", "()Lbff_money_movement/service/v1/RobinhoodAccountDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetNonOriginatedTransferInfoRequestDto implements Dto3<GetNonOriginatedTransferInfoRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetNonOriginatedTransferInfoRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetNonOriginatedTransferInfoRequestDto, GetNonOriginatedTransferInfoRequest>> binaryBase64Serializer$delegate;
    private static final GetNonOriginatedTransferInfoRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetNonOriginatedTransferInfoRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetNonOriginatedTransferInfoRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final NonOriginatedTransferTypeDto getTransfer_type() {
        return this.surrogate.getTransfer_type();
    }

    public final CurrencyDto getCurrency() {
        return this.surrogate.getCurrency();
    }

    public final RobinhoodAccountDto getRobinhood_account() {
        return this.surrogate.getRobinhood_account();
    }

    public /* synthetic */ GetNonOriginatedTransferInfoRequestDto(NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, RobinhoodAccountDto robinhoodAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NonOriginatedTransferTypeDto.INSTANCE.getZeroValue() : nonOriginatedTransferTypeDto, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? null : robinhoodAccountDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetNonOriginatedTransferInfoRequestDto(NonOriginatedTransferTypeDto transfer_type, CurrencyDto currency, RobinhoodAccountDto robinhoodAccountDto) {
        this(new Surrogate(transfer_type, currency, robinhoodAccountDto));
        Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
        Intrinsics.checkNotNullParameter(currency, "currency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetNonOriginatedTransferInfoRequest toProto() {
        NonOriginatedTransferType nonOriginatedTransferType = (NonOriginatedTransferType) this.surrogate.getTransfer_type().toProto();
        Currency currency = (Currency) this.surrogate.getCurrency().toProto();
        RobinhoodAccountDto robinhood_account = this.surrogate.getRobinhood_account();
        return new GetNonOriginatedTransferInfoRequest(nonOriginatedTransferType, currency, robinhood_account != null ? robinhood_account.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetNonOriginatedTransferInfoRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetNonOriginatedTransferInfoRequestDto) && Intrinsics.areEqual(((GetNonOriginatedTransferInfoRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetNonOriginatedTransferInfoRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;", "", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "transfer_type", "Lcom/robinhood/rosetta/common/CurrencyDto;", "currency", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "robinhood_account", "<init>", "(Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lbff_money_movement/service/v1/RobinhoodAccountDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/NonOriginatedTransferTypeDto;Lcom/robinhood/rosetta/common/CurrencyDto;Lbff_money_movement/service/v1/RobinhoodAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "getTransfer_type", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "getTransfer_type$annotations", "()V", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getCurrency$annotations", "Lbff_money_movement/service/v1/RobinhoodAccountDto;", "getRobinhood_account", "()Lbff_money_movement/service/v1/RobinhoodAccountDto;", "getRobinhood_account$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyDto currency;
        private final RobinhoodAccountDto robinhood_account;
        private final NonOriginatedTransferTypeDto transfer_type;

        public Surrogate() {
            this((NonOriginatedTransferTypeDto) null, (CurrencyDto) null, (RobinhoodAccountDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.transfer_type == surrogate.transfer_type && this.currency == surrogate.currency && Intrinsics.areEqual(this.robinhood_account, surrogate.robinhood_account);
        }

        public int hashCode() {
            int iHashCode = ((this.transfer_type.hashCode() * 31) + this.currency.hashCode()) * 31;
            RobinhoodAccountDto robinhoodAccountDto = this.robinhood_account;
            return iHashCode + (robinhoodAccountDto == null ? 0 : robinhoodAccountDto.hashCode());
        }

        public String toString() {
            return "Surrogate(transfer_type=" + this.transfer_type + ", currency=" + this.currency + ", robinhood_account=" + this.robinhood_account + ")";
        }

        /* compiled from: GetNonOriginatedTransferInfoRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetNonOriginatedTransferInfoRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, RobinhoodAccountDto robinhoodAccountDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.transfer_type = (i & 1) == 0 ? NonOriginatedTransferTypeDto.INSTANCE.getZeroValue() : nonOriginatedTransferTypeDto;
            if ((i & 2) == 0) {
                this.currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.currency = currencyDto;
            }
            if ((i & 4) == 0) {
                this.robinhood_account = null;
            } else {
                this.robinhood_account = robinhoodAccountDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.transfer_type != NonOriginatedTransferTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, NonOriginatedTransferTypeDto.Serializer.INSTANCE, self.transfer_type);
            }
            if (self.currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CurrencyDto.Serializer.INSTANCE, self.currency);
            }
            RobinhoodAccountDto robinhoodAccountDto = self.robinhood_account;
            if (robinhoodAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, RobinhoodAccountDto.Serializer.INSTANCE, robinhoodAccountDto);
            }
        }

        public Surrogate(NonOriginatedTransferTypeDto transfer_type, CurrencyDto currency, RobinhoodAccountDto robinhoodAccountDto) {
            Intrinsics.checkNotNullParameter(transfer_type, "transfer_type");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.transfer_type = transfer_type;
            this.currency = currency;
            this.robinhood_account = robinhoodAccountDto;
        }

        public final NonOriginatedTransferTypeDto getTransfer_type() {
            return this.transfer_type;
        }

        public /* synthetic */ Surrogate(NonOriginatedTransferTypeDto nonOriginatedTransferTypeDto, CurrencyDto currencyDto, RobinhoodAccountDto robinhoodAccountDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? NonOriginatedTransferTypeDto.INSTANCE.getZeroValue() : nonOriginatedTransferTypeDto, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 4) != 0 ? null : robinhoodAccountDto);
        }

        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        public final RobinhoodAccountDto getRobinhood_account() {
            return this.robinhood_account;
        }
    }

    /* compiled from: GetNonOriginatedTransferInfoRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetNonOriginatedTransferInfoRequestDto, GetNonOriginatedTransferInfoRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNonOriginatedTransferInfoRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNonOriginatedTransferInfoRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNonOriginatedTransferInfoRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetNonOriginatedTransferInfoRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetNonOriginatedTransferInfoRequest> getProtoAdapter() {
            return GetNonOriginatedTransferInfoRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNonOriginatedTransferInfoRequestDto getZeroValue() {
            return GetNonOriginatedTransferInfoRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNonOriginatedTransferInfoRequestDto fromProto(GetNonOriginatedTransferInfoRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            NonOriginatedTransferTypeDto nonOriginatedTransferTypeDtoFromProto = NonOriginatedTransferTypeDto.INSTANCE.fromProto(proto.getTransfer_type());
            CurrencyDto currencyDtoFromProto = CurrencyDto.INSTANCE.fromProto(proto.getCurrency());
            RobinhoodAccount robinhood_account = proto.getRobinhood_account();
            return new GetNonOriginatedTransferInfoRequestDto(new Surrogate(nonOriginatedTransferTypeDtoFromProto, currencyDtoFromProto, robinhood_account != null ? RobinhoodAccountDto.INSTANCE.fromProto(robinhood_account) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetNonOriginatedTransferInfoRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNonOriginatedTransferInfoRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetNonOriginatedTransferInfoRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetNonOriginatedTransferInfoRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetNonOriginatedTransferInfoRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetNonOriginatedTransferInfoRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetNonOriginatedTransferInfoRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetNonOriginatedTransferInfoRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetNonOriginatedTransferInfoRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetNonOriginatedTransferInfoRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetNonOriginatedTransferInfoRequestDto";
        }
    }
}
