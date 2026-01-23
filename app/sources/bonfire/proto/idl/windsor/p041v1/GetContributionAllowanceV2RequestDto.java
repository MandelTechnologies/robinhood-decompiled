package bonfire.proto.idl.windsor.p041v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;
import windsor.transactions.p552v1.TransactionType;
import windsor.transactions.p552v1.TransactionTypeDto;

/* compiled from: GetContributionAllowanceV2RequestDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2Request;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;)V", "", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lwindsor/transactions/v1/TransactionTypeDto;", "transaction_type", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lwindsor/transactions/v1/TransactionTypeDto;)V", "toProto", "()Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2Request;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;", "getAccount_number", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getTransaction_type", "()Lwindsor/transactions/v1/TransactionTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetContributionAllowanceV2RequestDto implements Dto3<GetContributionAllowanceV2Request>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetContributionAllowanceV2RequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetContributionAllowanceV2RequestDto, GetContributionAllowanceV2Request>> binaryBase64Serializer$delegate;
    private static final GetContributionAllowanceV2RequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetContributionAllowanceV2RequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetContributionAllowanceV2RequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final BrokerageAccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final TransactionTypeDto getTransaction_type() {
        return this.surrogate.getTransaction_type();
    }

    public /* synthetic */ GetContributionAllowanceV2RequestDto(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, TransactionTypeDto transactionTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? TransactionTypeDto.INSTANCE.getZeroValue() : transactionTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetContributionAllowanceV2RequestDto(String account_number, BrokerageAccountTypeDto account_type, TransactionTypeDto transaction_type) {
        this(new Surrogate(account_number, account_type, transaction_type));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetContributionAllowanceV2Request toProto() {
        return new GetContributionAllowanceV2Request(this.surrogate.getAccount_number(), (BrokerageAccountType) this.surrogate.getAccount_type().toProto(), (TransactionType) this.surrogate.getTransaction_type().toProto(), null, 8, null);
    }

    public String toString() {
        return "[GetContributionAllowanceV2RequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetContributionAllowanceV2RequestDto) && Intrinsics.areEqual(((GetContributionAllowanceV2RequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetContributionAllowanceV2RequestDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010#\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;", "", "", "account_number", "Lrosetta/account/BrokerageAccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lwindsor/transactions/v1/TransactionTypeDto;", "transaction_type", "<init>", "(Ljava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lwindsor/transactions/v1/TransactionTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrosetta/account/BrokerageAccountTypeDto;Lwindsor/transactions/v1/TransactionTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$windsor_v1_externalRelease", "(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lrosetta/account/BrokerageAccountTypeDto;", "getAccount_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getAccount_type$annotations", "Lwindsor/transactions/v1/TransactionTypeDto;", "getTransaction_type", "()Lwindsor/transactions/v1/TransactionTypeDto;", "getTransaction_type$annotations", "Companion", "$serializer", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final BrokerageAccountTypeDto account_type;
        private final TransactionTypeDto transaction_type;

        public Surrogate() {
            this((String) null, (BrokerageAccountTypeDto) null, (TransactionTypeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.account_type == surrogate.account_type && this.transaction_type == surrogate.transaction_type;
        }

        public int hashCode() {
            return (((this.account_number.hashCode() * 31) + this.account_type.hashCode()) * 31) + this.transaction_type.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", account_type=" + this.account_type + ", transaction_type=" + this.transaction_type + ")";
        }

        /* compiled from: GetContributionAllowanceV2RequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetContributionAllowanceV2RequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, BrokerageAccountTypeDto brokerageAccountTypeDto, TransactionTypeDto transactionTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = brokerageAccountTypeDto;
            }
            if ((i & 4) == 0) {
                this.transaction_type = TransactionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.transaction_type = transactionTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$windsor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (self.account_type != BrokerageAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BrokerageAccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (self.transaction_type != TransactionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, TransactionTypeDto.Serializer.INSTANCE, self.transaction_type);
            }
        }

        public Surrogate(String account_number, BrokerageAccountTypeDto account_type, TransactionTypeDto transaction_type) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(transaction_type, "transaction_type");
            this.account_number = account_number;
            this.account_type = account_type;
            this.transaction_type = transaction_type;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public /* synthetic */ Surrogate(String str, BrokerageAccountTypeDto brokerageAccountTypeDto, TransactionTypeDto transactionTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 4) != 0 ? TransactionTypeDto.INSTANCE.getZeroValue() : transactionTypeDto);
        }

        public final BrokerageAccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final TransactionTypeDto getTransaction_type() {
            return this.transaction_type;
        }
    }

    /* compiled from: GetContributionAllowanceV2RequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2Request;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetContributionAllowanceV2RequestDto, GetContributionAllowanceV2Request> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetContributionAllowanceV2RequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetContributionAllowanceV2RequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetContributionAllowanceV2RequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetContributionAllowanceV2RequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetContributionAllowanceV2Request> getProtoAdapter() {
            return GetContributionAllowanceV2Request.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetContributionAllowanceV2RequestDto getZeroValue() {
            return GetContributionAllowanceV2RequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetContributionAllowanceV2RequestDto fromProto(GetContributionAllowanceV2Request proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetContributionAllowanceV2RequestDto(new Surrogate(proto.getAccount_number(), BrokerageAccountTypeDto.INSTANCE.fromProto(proto.getAccount_type()), TransactionTypeDto.INSTANCE.fromProto(proto.getTransaction_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.windsor.v1.GetContributionAllowanceV2RequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetContributionAllowanceV2RequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetContributionAllowanceV2RequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetContributionAllowanceV2RequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetContributionAllowanceV2RequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.windsor.v1.GetContributionAllowanceV2Request", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetContributionAllowanceV2RequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetContributionAllowanceV2RequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetContributionAllowanceV2RequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetContributionAllowanceV2RequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "windsor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.windsor.v1.GetContributionAllowanceV2RequestDto";
        }
    }
}
