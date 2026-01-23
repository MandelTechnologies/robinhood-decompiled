package com.robinhood.rosetta.cashier;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetails;
import com.robinhood.rosetta.brokerage.BrokerageAccountingDetailsDto;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetails;
import com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetailsDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ4\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Surrogate;)V", "type", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "original_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "settle_amount", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "getType", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "getOriginal_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getSettle_amount", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CheckoutCardDisputeFeeTypeDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CheckoutCardDisputeFeeDetailsDto implements Dto3<CheckoutCardDisputeFeeDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CheckoutCardDisputeFeeDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardDisputeFeeDetailsDto, CheckoutCardDisputeFeeDetails>> binaryBase64Serializer$delegate;
    private static final CheckoutCardDisputeFeeDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CheckoutCardDisputeFeeDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CheckoutCardDisputeFeeDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CheckoutCardDisputeFeeTypeDto getType() {
        return this.surrogate.getType();
    }

    public final MoneyDto getOriginal_amount() {
        return this.surrogate.getOriginal_amount();
    }

    public final MoneyDto getSettle_amount() {
        return this.surrogate.getSettle_amount();
    }

    public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
        return this.surrogate.getBrokerage_accounting_details();
    }

    public /* synthetic */ CheckoutCardDisputeFeeDetailsDto(CheckoutCardDisputeFeeTypeDto checkoutCardDisputeFeeTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckoutCardDisputeFeeTypeDto.INSTANCE.getZeroValue() : checkoutCardDisputeFeeTypeDto, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : brokerageAccountingDetailsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckoutCardDisputeFeeDetailsDto(CheckoutCardDisputeFeeTypeDto type2, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
        this(new Surrogate(type2, moneyDto, moneyDto2, brokerageAccountingDetailsDto));
        Intrinsics.checkNotNullParameter(type2, "type");
    }

    public static /* synthetic */ CheckoutCardDisputeFeeDetailsDto copy$default(CheckoutCardDisputeFeeDetailsDto checkoutCardDisputeFeeDetailsDto, CheckoutCardDisputeFeeTypeDto checkoutCardDisputeFeeTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            checkoutCardDisputeFeeTypeDto = checkoutCardDisputeFeeDetailsDto.surrogate.getType();
        }
        if ((i & 2) != 0) {
            moneyDto = checkoutCardDisputeFeeDetailsDto.surrogate.getOriginal_amount();
        }
        if ((i & 4) != 0) {
            moneyDto2 = checkoutCardDisputeFeeDetailsDto.surrogate.getSettle_amount();
        }
        if ((i & 8) != 0) {
            brokerageAccountingDetailsDto = checkoutCardDisputeFeeDetailsDto.surrogate.getBrokerage_accounting_details();
        }
        return checkoutCardDisputeFeeDetailsDto.copy(checkoutCardDisputeFeeTypeDto, moneyDto, moneyDto2, brokerageAccountingDetailsDto);
    }

    public final CheckoutCardDisputeFeeDetailsDto copy(CheckoutCardDisputeFeeTypeDto type2, MoneyDto original_amount, MoneyDto settle_amount, BrokerageAccountingDetailsDto brokerage_accounting_details) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return new CheckoutCardDisputeFeeDetailsDto(new Surrogate(type2, original_amount, settle_amount, brokerage_accounting_details));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CheckoutCardDisputeFeeDetails toProto() {
        CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType checkoutCardDisputeFeeType = (CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType) this.surrogate.getType().toProto();
        MoneyDto original_amount = this.surrogate.getOriginal_amount();
        Money proto = original_amount != null ? original_amount.toProto() : null;
        MoneyDto settle_amount = this.surrogate.getSettle_amount();
        Money proto2 = settle_amount != null ? settle_amount.toProto() : null;
        BrokerageAccountingDetailsDto brokerage_accounting_details = this.surrogate.getBrokerage_accounting_details();
        return new CheckoutCardDisputeFeeDetails(checkoutCardDisputeFeeType, proto, proto2, brokerage_accounting_details != null ? brokerage_accounting_details.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[CheckoutCardDisputeFeeDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CheckoutCardDisputeFeeDetailsDto) && Intrinsics.areEqual(((CheckoutCardDisputeFeeDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Surrogate;", "", "type", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "original_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "settle_amount", "brokerage_accounting_details", "Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "getOriginal_amount$annotations", "getOriginal_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getSettle_amount$annotations", "getSettle_amount", "getBrokerage_accounting_details$annotations", "getBrokerage_accounting_details", "()Lcom/robinhood/rosetta/brokerage/BrokerageAccountingDetailsDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountingDetailsDto brokerage_accounting_details;
        private final MoneyDto original_amount;
        private final MoneyDto settle_amount;
        private final CheckoutCardDisputeFeeTypeDto type;

        public Surrogate() {
            this((CheckoutCardDisputeFeeTypeDto) null, (MoneyDto) null, (MoneyDto) null, (BrokerageAccountingDetailsDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CheckoutCardDisputeFeeTypeDto checkoutCardDisputeFeeTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                checkoutCardDisputeFeeTypeDto = surrogate.type;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.original_amount;
            }
            if ((i & 4) != 0) {
                moneyDto2 = surrogate.settle_amount;
            }
            if ((i & 8) != 0) {
                brokerageAccountingDetailsDto = surrogate.brokerage_accounting_details;
            }
            return surrogate.copy(checkoutCardDisputeFeeTypeDto, moneyDto, moneyDto2, brokerageAccountingDetailsDto);
        }

        @SerialName("brokerageAccountingDetails")
        @JsonAnnotations2(names = {"brokerage_accounting_details"})
        public static /* synthetic */ void getBrokerage_accounting_details$annotations() {
        }

        @SerialName("originalAmount")
        @JsonAnnotations2(names = {"original_amount"})
        public static /* synthetic */ void getOriginal_amount$annotations() {
        }

        @SerialName("settleAmount")
        @JsonAnnotations2(names = {"settle_amount"})
        public static /* synthetic */ void getSettle_amount$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CheckoutCardDisputeFeeTypeDto getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getOriginal_amount() {
            return this.original_amount;
        }

        /* renamed from: component3, reason: from getter */
        public final MoneyDto getSettle_amount() {
            return this.settle_amount;
        }

        /* renamed from: component4, reason: from getter */
        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }

        public final Surrogate copy(CheckoutCardDisputeFeeTypeDto type2, MoneyDto original_amount, MoneyDto settle_amount, BrokerageAccountingDetailsDto brokerage_accounting_details) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Surrogate(type2, original_amount, settle_amount, brokerage_accounting_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.type == surrogate.type && Intrinsics.areEqual(this.original_amount, surrogate.original_amount) && Intrinsics.areEqual(this.settle_amount, surrogate.settle_amount) && Intrinsics.areEqual(this.brokerage_accounting_details, surrogate.brokerage_accounting_details);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            MoneyDto moneyDto = this.original_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.settle_amount;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = this.brokerage_accounting_details;
            return iHashCode3 + (brokerageAccountingDetailsDto != null ? brokerageAccountingDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(type=" + this.type + ", original_amount=" + this.original_amount + ", settle_amount=" + this.settle_amount + ", brokerage_accounting_details=" + this.brokerage_accounting_details + ")";
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CheckoutCardDisputeFeeDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CheckoutCardDisputeFeeTypeDto checkoutCardDisputeFeeTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.type = (i & 1) == 0 ? CheckoutCardDisputeFeeTypeDto.INSTANCE.getZeroValue() : checkoutCardDisputeFeeTypeDto;
            if ((i & 2) == 0) {
                this.original_amount = null;
            } else {
                this.original_amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.settle_amount = null;
            } else {
                this.settle_amount = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.brokerage_accounting_details = null;
            } else {
                this.brokerage_accounting_details = brokerageAccountingDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.type != CheckoutCardDisputeFeeTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, CheckoutCardDisputeFeeTypeDto.Serializer.INSTANCE, self.type);
            }
            MoneyDto moneyDto = self.original_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.settle_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            BrokerageAccountingDetailsDto brokerageAccountingDetailsDto = self.brokerage_accounting_details;
            if (brokerageAccountingDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BrokerageAccountingDetailsDto.Serializer.INSTANCE, brokerageAccountingDetailsDto);
            }
        }

        public Surrogate(CheckoutCardDisputeFeeTypeDto type2, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.original_amount = moneyDto;
            this.settle_amount = moneyDto2;
            this.brokerage_accounting_details = brokerageAccountingDetailsDto;
        }

        public final CheckoutCardDisputeFeeTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(CheckoutCardDisputeFeeTypeDto checkoutCardDisputeFeeTypeDto, MoneyDto moneyDto, MoneyDto moneyDto2, BrokerageAccountingDetailsDto brokerageAccountingDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CheckoutCardDisputeFeeTypeDto.INSTANCE.getZeroValue() : checkoutCardDisputeFeeTypeDto, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : brokerageAccountingDetailsDto);
        }

        public final MoneyDto getOriginal_amount() {
            return this.original_amount;
        }

        public final MoneyDto getSettle_amount() {
            return this.settle_amount;
        }

        public final BrokerageAccountingDetailsDto getBrokerage_accounting_details() {
            return this.brokerage_accounting_details;
        }
    }

    /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CheckoutCardDisputeFeeDetailsDto, CheckoutCardDisputeFeeDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutCardDisputeFeeDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardDisputeFeeDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardDisputeFeeDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CheckoutCardDisputeFeeDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CheckoutCardDisputeFeeDetails> getProtoAdapter() {
            return CheckoutCardDisputeFeeDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardDisputeFeeDetailsDto getZeroValue() {
            return CheckoutCardDisputeFeeDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardDisputeFeeDetailsDto fromProto(CheckoutCardDisputeFeeDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CheckoutCardDisputeFeeTypeDto checkoutCardDisputeFeeTypeDtoFromProto = CheckoutCardDisputeFeeTypeDto.INSTANCE.fromProto(proto.getType());
            Money original_amount = proto.getOriginal_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = original_amount != null ? MoneyDto.INSTANCE.fromProto(original_amount) : null;
            Money settle_amount = proto.getSettle_amount();
            MoneyDto moneyDtoFromProto2 = settle_amount != null ? MoneyDto.INSTANCE.fromProto(settle_amount) : null;
            BrokerageAccountingDetails brokerage_accounting_details = proto.getBrokerage_accounting_details();
            return new CheckoutCardDisputeFeeDetailsDto(new Surrogate(checkoutCardDisputeFeeTypeDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, brokerage_accounting_details != null ? BrokerageAccountingDetailsDto.INSTANCE.fromProto(brokerage_accounting_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckoutCardDisputeFeeDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CheckoutCardDisputeFeeDetailsDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED", "CHARGEBACK_FEE", "SCHEME_CHARGEBACK_FIXED_FEE", "SCHEME_CHARGEBACK_VARIABLE_FEE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckoutCardDisputeFeeTypeDto implements Dto2<CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardDisputeFeeTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckoutCardDisputeFeeTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardDisputeFeeTypeDto, CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType>> binaryBase64Serializer$delegate;
        public static final CheckoutCardDisputeFeeTypeDto CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED = new CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED("CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED", 0);
        public static final CheckoutCardDisputeFeeTypeDto CHARGEBACK_FEE = new CHARGEBACK_FEE("CHARGEBACK_FEE", 1);
        public static final CheckoutCardDisputeFeeTypeDto SCHEME_CHARGEBACK_FIXED_FEE = new SCHEME_CHARGEBACK_FIXED_FEE("SCHEME_CHARGEBACK_FIXED_FEE", 2);
        public static final CheckoutCardDisputeFeeTypeDto SCHEME_CHARGEBACK_VARIABLE_FEE = new SCHEME_CHARGEBACK_VARIABLE_FEE("SCHEME_CHARGEBACK_VARIABLE_FEE", 3);

        private static final /* synthetic */ CheckoutCardDisputeFeeTypeDto[] $values() {
            return new CheckoutCardDisputeFeeTypeDto[]{CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED, CHARGEBACK_FEE, SCHEME_CHARGEBACK_FIXED_FEE, SCHEME_CHARGEBACK_VARIABLE_FEE};
        }

        public /* synthetic */ CheckoutCardDisputeFeeTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckoutCardDisputeFeeTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CheckoutCardDisputeFeeTypeDto(String str, int i) {
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto.CheckoutCardDisputeFeeTypeDto.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED extends CheckoutCardDisputeFeeTypeDto {
            CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType toProto() {
                return CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED;
            }
        }

        static {
            CheckoutCardDisputeFeeTypeDto[] checkoutCardDisputeFeeTypeDtoArr$values = $values();
            $VALUES = checkoutCardDisputeFeeTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardDisputeFeeTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CheckoutCardDisputeFeeDetailsDto.CheckoutCardDisputeFeeTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto.CheckoutCardDisputeFeeTypeDto.CHARGEBACK_FEE", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHARGEBACK_FEE extends CheckoutCardDisputeFeeTypeDto {
            CHARGEBACK_FEE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType toProto() {
                return CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHARGEBACK_FEE;
            }
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto.CheckoutCardDisputeFeeTypeDto.SCHEME_CHARGEBACK_FIXED_FEE", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCHEME_CHARGEBACK_FIXED_FEE extends CheckoutCardDisputeFeeTypeDto {
            SCHEME_CHARGEBACK_FIXED_FEE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType toProto() {
                return CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.SCHEME_CHARGEBACK_FIXED_FEE;
            }
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto.CheckoutCardDisputeFeeTypeDto.SCHEME_CHARGEBACK_VARIABLE_FEE", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SCHEME_CHARGEBACK_VARIABLE_FEE extends CheckoutCardDisputeFeeTypeDto {
            SCHEME_CHARGEBACK_VARIABLE_FEE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType toProto() {
                return CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.SCHEME_CHARGEBACK_VARIABLE_FEE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetails$CheckoutCardDisputeFeeType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckoutCardDisputeFeeTypeDto, CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType> {

            /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.values().length];
                    try {
                        iArr[CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.CHARGEBACK_FEE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.SCHEME_CHARGEBACK_FIXED_FEE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.SCHEME_CHARGEBACK_VARIABLE_FEE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CheckoutCardDisputeFeeTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardDisputeFeeTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardDisputeFeeTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckoutCardDisputeFeeTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType> getProtoAdapter() {
                return CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardDisputeFeeTypeDto getZeroValue() {
                return CheckoutCardDisputeFeeTypeDto.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardDisputeFeeTypeDto fromProto(CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CheckoutCardDisputeFeeTypeDto.CHECKOUT_CARD_DISPUTE_FEE_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CheckoutCardDisputeFeeTypeDto.CHARGEBACK_FEE;
                }
                if (i == 3) {
                    return CheckoutCardDisputeFeeTypeDto.SCHEME_CHARGEBACK_FIXED_FEE;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return CheckoutCardDisputeFeeTypeDto.SCHEME_CHARGEBACK_VARIABLE_FEE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$CheckoutCardDisputeFeeTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CheckoutCardDisputeFeeTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckoutCardDisputeFeeTypeDto, CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.CheckoutCardDisputeFeeDetails.CheckoutCardDisputeFeeType", CheckoutCardDisputeFeeTypeDto.getEntries(), CheckoutCardDisputeFeeTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckoutCardDisputeFeeTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckoutCardDisputeFeeTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckoutCardDisputeFeeTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckoutCardDisputeFeeTypeDto valueOf(String str) {
            return (CheckoutCardDisputeFeeTypeDto) Enum.valueOf(CheckoutCardDisputeFeeTypeDto.class, str);
        }

        public static CheckoutCardDisputeFeeTypeDto[] values() {
            return (CheckoutCardDisputeFeeTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CheckoutCardDisputeFeeDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.CheckoutCardDisputeFeeDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CheckoutCardDisputeFeeDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CheckoutCardDisputeFeeDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CheckoutCardDisputeFeeDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CheckoutCardDisputeFeeDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardDisputeFeeDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.CheckoutCardDisputeFeeDetailsDto";
        }
    }
}
