package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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

/* compiled from: FractionalOrderDetailsDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Surrogate;)V", "dollar_based_amount", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "original_firm_account", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;)V", "getDollar_based_amount", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getOriginal_firm_account", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class FractionalOrderDetailsDto implements Dto3<FractionalOrderDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FractionalOrderDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FractionalOrderDetailsDto, FractionalOrderDetails>> binaryBase64Serializer$delegate;
    private static final FractionalOrderDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FractionalOrderDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FractionalOrderDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DecimalDto getDollar_based_amount() {
        return this.surrogate.getDollar_based_amount();
    }

    public final NullableStringDto getOriginal_firm_account() {
        return this.surrogate.getOriginal_firm_account();
    }

    public FractionalOrderDetailsDto(DecimalDto decimalDto, NullableStringDto nullableStringDto) {
        this(new Surrogate(decimalDto, nullableStringDto));
    }

    public /* synthetic */ FractionalOrderDetailsDto(DecimalDto decimalDto, NullableStringDto nullableStringDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : nullableStringDto);
    }

    public static /* synthetic */ FractionalOrderDetailsDto copy$default(FractionalOrderDetailsDto fractionalOrderDetailsDto, DecimalDto decimalDto, NullableStringDto nullableStringDto, int i, Object obj) {
        if ((i & 1) != 0) {
            decimalDto = fractionalOrderDetailsDto.surrogate.getDollar_based_amount();
        }
        if ((i & 2) != 0) {
            nullableStringDto = fractionalOrderDetailsDto.surrogate.getOriginal_firm_account();
        }
        return fractionalOrderDetailsDto.copy(decimalDto, nullableStringDto);
    }

    public final FractionalOrderDetailsDto copy(DecimalDto dollar_based_amount, NullableStringDto original_firm_account) {
        return new FractionalOrderDetailsDto(new Surrogate(dollar_based_amount, original_firm_account));
    }

    @Override // com.robinhood.idl.Dto
    public FractionalOrderDetails toProto() {
        DecimalDto dollar_based_amount = this.surrogate.getDollar_based_amount();
        Decimal proto = dollar_based_amount != null ? dollar_based_amount.toProto() : null;
        NullableStringDto original_firm_account = this.surrogate.getOriginal_firm_account();
        return new FractionalOrderDetails(proto, original_firm_account != null ? original_firm_account.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[FractionalOrderDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FractionalOrderDetailsDto) && Intrinsics.areEqual(((FractionalOrderDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: FractionalOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Surrogate;", "", "dollar_based_amount", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "original_firm_account", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDollar_based_amount$annotations", "()V", "getDollar_based_amount", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getOriginal_firm_account$annotations", "getOriginal_firm_account", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DecimalDto dollar_based_amount;
        private final NullableStringDto original_firm_account;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((DecimalDto) null, (NullableStringDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DecimalDto decimalDto, NullableStringDto nullableStringDto, int i, Object obj) {
            if ((i & 1) != 0) {
                decimalDto = surrogate.dollar_based_amount;
            }
            if ((i & 2) != 0) {
                nullableStringDto = surrogate.original_firm_account;
            }
            return surrogate.copy(decimalDto, nullableStringDto);
        }

        @SerialName("dollarBasedAmount")
        @JsonAnnotations2(names = {"dollar_based_amount"})
        public static /* synthetic */ void getDollar_based_amount$annotations() {
        }

        @SerialName("originalFirmAccount")
        @JsonAnnotations2(names = {"original_firm_account"})
        public static /* synthetic */ void getOriginal_firm_account$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DecimalDto getDollar_based_amount() {
            return this.dollar_based_amount;
        }

        /* renamed from: component2, reason: from getter */
        public final NullableStringDto getOriginal_firm_account() {
            return this.original_firm_account;
        }

        public final Surrogate copy(DecimalDto dollar_based_amount, NullableStringDto original_firm_account) {
            return new Surrogate(dollar_based_amount, original_firm_account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.dollar_based_amount, surrogate.dollar_based_amount) && Intrinsics.areEqual(this.original_firm_account, surrogate.original_firm_account);
        }

        public int hashCode() {
            DecimalDto decimalDto = this.dollar_based_amount;
            int iHashCode = (decimalDto == null ? 0 : decimalDto.hashCode()) * 31;
            NullableStringDto nullableStringDto = this.original_firm_account;
            return iHashCode + (nullableStringDto != null ? nullableStringDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(dollar_based_amount=" + this.dollar_based_amount + ", original_firm_account=" + this.original_firm_account + ")";
        }

        /* compiled from: FractionalOrderDetailsDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FractionalOrderDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DecimalDto decimalDto, NullableStringDto nullableStringDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.dollar_based_amount = null;
            } else {
                this.dollar_based_amount = decimalDto;
            }
            if ((i & 2) == 0) {
                this.original_firm_account = null;
            } else {
                this.original_firm_account = nullableStringDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DecimalDto decimalDto = self.dollar_based_amount;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            NullableStringDto nullableStringDto = self.original_firm_account;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
        }

        public Surrogate(DecimalDto decimalDto, NullableStringDto nullableStringDto) {
            this.dollar_based_amount = decimalDto;
            this.original_firm_account = nullableStringDto;
        }

        public /* synthetic */ Surrogate(DecimalDto decimalDto, NullableStringDto nullableStringDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : decimalDto, (i & 2) != 0 ? null : nullableStringDto);
        }

        public final DecimalDto getDollar_based_amount() {
            return this.dollar_based_amount;
        }

        public final NullableStringDto getOriginal_firm_account() {
            return this.original_firm_account;
        }
    }

    /* compiled from: FractionalOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FractionalOrderDetailsDto, FractionalOrderDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FractionalOrderDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FractionalOrderDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FractionalOrderDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) FractionalOrderDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FractionalOrderDetails> getProtoAdapter() {
            return FractionalOrderDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FractionalOrderDetailsDto getZeroValue() {
            return FractionalOrderDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FractionalOrderDetailsDto fromProto(FractionalOrderDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Decimal dollar_based_amount = proto.getDollar_based_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DecimalDto decimalDtoFromProto = dollar_based_amount != null ? DecimalDto.INSTANCE.fromProto(dollar_based_amount) : null;
            NullableString original_firm_account = proto.getOriginal_firm_account();
            return new FractionalOrderDetailsDto(new Surrogate(decimalDtoFromProto, original_firm_account != null ? NullableStringDto.INSTANCE.fromProto(original_firm_account) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.FractionalOrderDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FractionalOrderDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FractionalOrderDetailsDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FractionalOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<FractionalOrderDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.FractionalOrderDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FractionalOrderDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FractionalOrderDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FractionalOrderDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: FractionalOrderDetailsDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.FractionalOrderDetailsDto";
        }
    }
}
