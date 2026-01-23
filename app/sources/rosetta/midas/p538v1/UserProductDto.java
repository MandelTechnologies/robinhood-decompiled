package rosetta.midas.p538v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
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
import rosetta.midas.p538v1.GoldCardProductDto;
import rosetta.midas.p538v1.PrivateBankingProductDto;
import rosetta.midas.p538v1.SageMortgageProductDto;

/* compiled from: UserProductDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lrosetta/midas/v1/UserProductDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/midas/v1/UserProduct;", "Landroid/os/Parcelable;", "Lrosetta/midas/v1/UserProductDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/midas/v1/UserProductDto$Surrogate;)V", "Lrosetta/midas/v1/GoldCardProductDto;", "gold_card_product", "Lrosetta/midas/v1/PrivateBankingProductDto;", "private_banking_product", "Lrosetta/midas/v1/SageMortgageProductDto;", "sage_mortgage_product", "(Lrosetta/midas/v1/GoldCardProductDto;Lrosetta/midas/v1/PrivateBankingProductDto;Lrosetta/midas/v1/SageMortgageProductDto;)V", "toProto", "()Lrosetta/midas/v1/UserProduct;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/midas/v1/UserProductDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class UserProductDto implements Dto3<UserProduct>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UserProductDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UserProductDto, UserProduct>> binaryBase64Serializer$delegate;
    private static final UserProductDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UserProductDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UserProductDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ UserProductDto(GoldCardProductDto goldCardProductDto, PrivateBankingProductDto privateBankingProductDto, SageMortgageProductDto sageMortgageProductDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GoldCardProductDto.INSTANCE.getZeroValue() : goldCardProductDto, (i & 2) != 0 ? PrivateBankingProductDto.INSTANCE.getZeroValue() : privateBankingProductDto, (i & 4) != 0 ? SageMortgageProductDto.INSTANCE.getZeroValue() : sageMortgageProductDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserProductDto(GoldCardProductDto gold_card_product, PrivateBankingProductDto private_banking_product, SageMortgageProductDto sage_mortgage_product) {
        this(new Surrogate(gold_card_product, private_banking_product, sage_mortgage_product));
        Intrinsics.checkNotNullParameter(gold_card_product, "gold_card_product");
        Intrinsics.checkNotNullParameter(private_banking_product, "private_banking_product");
        Intrinsics.checkNotNullParameter(sage_mortgage_product, "sage_mortgage_product");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UserProduct toProto() {
        return new UserProduct((GoldCardProduct) this.surrogate.getGold_card_product().toProto(), (PrivateBankingProduct) this.surrogate.getPrivate_banking_product().toProto(), (SageMortgageProduct) this.surrogate.getSage_mortgage_product().toProto(), null, 8, null);
    }

    public String toString() {
        return "[UserProductDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UserProductDto) && Intrinsics.areEqual(((UserProductDto) other).surrogate, this.surrogate);
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
    /* compiled from: UserProductDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lrosetta/midas/v1/UserProductDto$Surrogate;", "", "Lrosetta/midas/v1/GoldCardProductDto;", "gold_card_product", "Lrosetta/midas/v1/PrivateBankingProductDto;", "private_banking_product", "Lrosetta/midas/v1/SageMortgageProductDto;", "sage_mortgage_product", "<init>", "(Lrosetta/midas/v1/GoldCardProductDto;Lrosetta/midas/v1/PrivateBankingProductDto;Lrosetta/midas/v1/SageMortgageProductDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/midas/v1/GoldCardProductDto;Lrosetta/midas/v1/PrivateBankingProductDto;Lrosetta/midas/v1/SageMortgageProductDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_midas_v1_externalRelease", "(Lrosetta/midas/v1/UserProductDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/midas/v1/GoldCardProductDto;", "getGold_card_product", "()Lrosetta/midas/v1/GoldCardProductDto;", "getGold_card_product$annotations", "()V", "Lrosetta/midas/v1/PrivateBankingProductDto;", "getPrivate_banking_product", "()Lrosetta/midas/v1/PrivateBankingProductDto;", "getPrivate_banking_product$annotations", "Lrosetta/midas/v1/SageMortgageProductDto;", "getSage_mortgage_product", "()Lrosetta/midas/v1/SageMortgageProductDto;", "getSage_mortgage_product$annotations", "Companion", "$serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GoldCardProductDto gold_card_product;
        private final PrivateBankingProductDto private_banking_product;
        private final SageMortgageProductDto sage_mortgage_product;

        public Surrogate() {
            this((GoldCardProductDto) null, (PrivateBankingProductDto) null, (SageMortgageProductDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.gold_card_product == surrogate.gold_card_product && this.private_banking_product == surrogate.private_banking_product && this.sage_mortgage_product == surrogate.sage_mortgage_product;
        }

        public int hashCode() {
            return (((this.gold_card_product.hashCode() * 31) + this.private_banking_product.hashCode()) * 31) + this.sage_mortgage_product.hashCode();
        }

        public String toString() {
            return "Surrogate(gold_card_product=" + this.gold_card_product + ", private_banking_product=" + this.private_banking_product + ", sage_mortgage_product=" + this.sage_mortgage_product + ")";
        }

        /* compiled from: UserProductDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/midas/v1/UserProductDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/UserProductDto$Surrogate;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UserProductDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GoldCardProductDto goldCardProductDto, PrivateBankingProductDto privateBankingProductDto, SageMortgageProductDto sageMortgageProductDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.gold_card_product = (i & 1) == 0 ? GoldCardProductDto.INSTANCE.getZeroValue() : goldCardProductDto;
            if ((i & 2) == 0) {
                this.private_banking_product = PrivateBankingProductDto.INSTANCE.getZeroValue();
            } else {
                this.private_banking_product = privateBankingProductDto;
            }
            if ((i & 4) == 0) {
                this.sage_mortgage_product = SageMortgageProductDto.INSTANCE.getZeroValue();
            } else {
                this.sage_mortgage_product = sageMortgageProductDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_midas_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.gold_card_product != GoldCardProductDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, GoldCardProductDto.Serializer.INSTANCE, self.gold_card_product);
            }
            if (self.private_banking_product != PrivateBankingProductDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, PrivateBankingProductDto.Serializer.INSTANCE, self.private_banking_product);
            }
            if (self.sage_mortgage_product != SageMortgageProductDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SageMortgageProductDto.Serializer.INSTANCE, self.sage_mortgage_product);
            }
        }

        public Surrogate(GoldCardProductDto gold_card_product, PrivateBankingProductDto private_banking_product, SageMortgageProductDto sage_mortgage_product) {
            Intrinsics.checkNotNullParameter(gold_card_product, "gold_card_product");
            Intrinsics.checkNotNullParameter(private_banking_product, "private_banking_product");
            Intrinsics.checkNotNullParameter(sage_mortgage_product, "sage_mortgage_product");
            this.gold_card_product = gold_card_product;
            this.private_banking_product = private_banking_product;
            this.sage_mortgage_product = sage_mortgage_product;
        }

        public final GoldCardProductDto getGold_card_product() {
            return this.gold_card_product;
        }

        public /* synthetic */ Surrogate(GoldCardProductDto goldCardProductDto, PrivateBankingProductDto privateBankingProductDto, SageMortgageProductDto sageMortgageProductDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? GoldCardProductDto.INSTANCE.getZeroValue() : goldCardProductDto, (i & 2) != 0 ? PrivateBankingProductDto.INSTANCE.getZeroValue() : privateBankingProductDto, (i & 4) != 0 ? SageMortgageProductDto.INSTANCE.getZeroValue() : sageMortgageProductDto);
        }

        public final PrivateBankingProductDto getPrivate_banking_product() {
            return this.private_banking_product;
        }

        public final SageMortgageProductDto getSage_mortgage_product() {
            return this.sage_mortgage_product;
        }
    }

    /* compiled from: UserProductDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/midas/v1/UserProductDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/midas/v1/UserProductDto;", "Lrosetta/midas/v1/UserProduct;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/midas/v1/UserProductDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<UserProductDto, UserProduct> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UserProductDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserProductDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UserProductDto> getBinaryBase64Serializer() {
            return (KSerializer) UserProductDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UserProduct> getProtoAdapter() {
            return UserProduct.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserProductDto getZeroValue() {
            return UserProductDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UserProductDto fromProto(UserProduct proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new UserProductDto(new Surrogate(GoldCardProductDto.INSTANCE.fromProto(proto.getGold_card_product()), PrivateBankingProductDto.INSTANCE.fromProto(proto.getPrivate_banking_product()), SageMortgageProductDto.INSTANCE.fromProto(proto.getSage_mortgage_product())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.midas.v1.UserProductDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserProductDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UserProductDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UserProductDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/midas/v1/UserProductDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/midas/v1/UserProductDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/midas/v1/UserProductDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UserProductDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.midas.v1.UserProduct", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UserProductDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UserProductDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UserProductDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UserProductDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/midas/v1/UserProductDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rosetta.midas.v1.UserProductDto";
        }
    }
}
