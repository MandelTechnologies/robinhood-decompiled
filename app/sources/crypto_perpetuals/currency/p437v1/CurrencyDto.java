package crypto_perpetuals.currency.p437v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.currency.p437v1.Currency;
import crypto_perpetuals.currency.p437v1.CurrencyDto;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: CurrencyDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-,./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00061"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/currency/v1/Currency;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;)V", "", "id", "code", "name", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "type", "Lcom/robinhood/idl/IdlDecimal;", "increment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcrypto_perpetuals/currency/v1/Currency;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;", "getId", "getCode", "getName", "getType", "()Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "getIncrement", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "CurrencyTypeDto", "Serializer", "MultibindingModule", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class CurrencyDto implements Dto3<Currency>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CurrencyDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CurrencyDto, Currency>> binaryBase64Serializer$delegate;
    private static final CurrencyDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CurrencyDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CurrencyDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getCode() {
        return this.surrogate.getCode();
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final CurrencyTypeDto getType() {
        return this.surrogate.getType();
    }

    public final IdlDecimal getIncrement() {
        return this.surrogate.getIncrement();
    }

    public /* synthetic */ CurrencyDto(String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrencyDto(String id, String code, String name, CurrencyTypeDto type2, IdlDecimal increment) {
        this(new Surrogate(id, code, name, type2, increment));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(increment, "increment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Currency toProto() {
        return new Currency(this.surrogate.getId(), this.surrogate.getCode(), this.surrogate.getName(), (Currency.CurrencyType) this.surrogate.getType().toProto(), this.surrogate.getIncrement().getStringValue(), null, 32, null);
    }

    public String toString() {
        return "[CurrencyDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CurrencyDto) && Intrinsics.areEqual(((CurrencyDto) other).surrogate, this.surrogate);
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
    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BH\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;", "", "", "id", "code", "name", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "type", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "increment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_currency_v1_externalRelease", "(Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getCode", "getCode$annotations", "getName", "getName$annotations", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "getType", "()Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "getType$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getIncrement", "()Lcom/robinhood/idl/IdlDecimal;", "getIncrement$annotations", "Companion", "$serializer", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String code;
        private final String id;
        private final IdlDecimal increment;
        private final String name;
        private final CurrencyTypeDto type;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (CurrencyTypeDto) null, (IdlDecimal) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.code, surrogate.code) && Intrinsics.areEqual(this.name, surrogate.name) && this.type == surrogate.type && Intrinsics.areEqual(this.increment, surrogate.increment);
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.code.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.increment.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", code=" + this.code + ", name=" + this.name + ", type=" + this.type + ", increment=" + this.increment + ")";
        }

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CurrencyDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.code = "";
            } else {
                this.code = str2;
            }
            if ((i & 4) == 0) {
                this.name = "";
            } else {
                this.name = str3;
            }
            if ((i & 8) == 0) {
                this.type = CurrencyTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = currencyTypeDto;
            }
            if ((i & 16) == 0) {
                this.increment = new IdlDecimal("");
            } else {
                this.increment = idlDecimal;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_currency_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.code, "")) {
                output.encodeStringElement(serialDesc, 1, self.code);
            }
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 2, self.name);
            }
            if (self.type != CurrencyTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CurrencyTypeDto.Serializer.INSTANCE, self.type);
            }
            if (Intrinsics.areEqual(self.increment, new IdlDecimal(""))) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.increment);
        }

        public Surrogate(String id, String code, String name, CurrencyTypeDto type2, IdlDecimal increment) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(increment, "increment");
            this.id = id;
            this.code = code;
            this.name = name;
            this.type = type2;
            this.increment = increment;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, CurrencyTypeDto currencyTypeDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CurrencyTypeDto.INSTANCE.getZeroValue() : currencyTypeDto, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal);
        }

        public final String getId() {
            return this.id;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getName() {
            return this.name;
        }

        public final CurrencyTypeDto getType() {
            return this.type;
        }

        public final IdlDecimal getIncrement() {
            return this.increment;
        }
    }

    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/currency/v1/CurrencyDto;", "Lcrypto_perpetuals/currency/v1/Currency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/currency/v1/CurrencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CurrencyDto, Currency> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CurrencyDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CurrencyDto> getBinaryBase64Serializer() {
            return (KSerializer) CurrencyDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Currency> getProtoAdapter() {
            return Currency.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyDto getZeroValue() {
            return CurrencyDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CurrencyDto fromProto(Currency proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CurrencyDto(new Surrogate(proto.getId(), proto.getCode(), proto.getName(), CurrencyTypeDto.INSTANCE.fromProto(proto.getType()), new IdlDecimal(proto.getIncrement())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.currency.v1.CurrencyDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurrencyDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CurrencyDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENCY_TYPE_UNSPECIFIED", "FIAT", "PERPETUAL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CurrencyTypeDto implements Dto2<Currency.CurrencyType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CurrencyTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CurrencyTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CurrencyTypeDto, Currency.CurrencyType>> binaryBase64Serializer$delegate;
        public static final CurrencyTypeDto CURRENCY_TYPE_UNSPECIFIED = new CURRENCY_TYPE_UNSPECIFIED("CURRENCY_TYPE_UNSPECIFIED", 0);
        public static final CurrencyTypeDto FIAT = new FIAT("FIAT", 1);
        public static final CurrencyTypeDto PERPETUAL = new PERPETUAL("PERPETUAL", 2);

        private static final /* synthetic */ CurrencyTypeDto[] $values() {
            return new CurrencyTypeDto[]{CURRENCY_TYPE_UNSPECIFIED, FIAT, PERPETUAL};
        }

        public /* synthetic */ CurrencyTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CurrencyTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/currency/v1/CurrencyDto.CurrencyTypeDto.CURRENCY_TYPE_UNSPECIFIED", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "toProto", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CURRENCY_TYPE_UNSPECIFIED extends CurrencyTypeDto {
            CURRENCY_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Currency.CurrencyType toProto() {
                return Currency.CurrencyType.CURRENCY_TYPE_UNSPECIFIED;
            }
        }

        private CurrencyTypeDto(String str, int i) {
        }

        static {
            CurrencyTypeDto[] currencyTypeDtoArr$values = $values();
            $VALUES = currencyTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(currencyTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.currency.v1.CurrencyDto$CurrencyTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyDto.CurrencyTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/currency/v1/CurrencyDto.CurrencyTypeDto.FIAT", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "toProto", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIAT extends CurrencyTypeDto {
            FIAT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Currency.CurrencyType toProto() {
                return Currency.CurrencyType.FIAT;
            }
        }

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"crypto_perpetuals/currency/v1/CurrencyDto.CurrencyTypeDto.PERPETUAL", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "toProto", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PERPETUAL extends CurrencyTypeDto {
            PERPETUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public Currency.CurrencyType toProto() {
                return Currency.CurrencyType.PERPETUAL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "Lcrypto_perpetuals/currency/v1/Currency$CurrencyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CurrencyTypeDto, Currency.CurrencyType> {

            /* compiled from: CurrencyDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes18.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Currency.CurrencyType.values().length];
                    try {
                        iArr[Currency.CurrencyType.CURRENCY_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Currency.CurrencyType.FIAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Currency.CurrencyType.PERPETUAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CurrencyTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CurrencyTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) CurrencyTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<Currency.CurrencyType> getProtoAdapter() {
                return Currency.CurrencyType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyTypeDto getZeroValue() {
                return CurrencyTypeDto.CURRENCY_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CurrencyTypeDto fromProto(Currency.CurrencyType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return CurrencyTypeDto.CURRENCY_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return CurrencyTypeDto.FIAT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return CurrencyTypeDto.PERPETUAL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CurrencyDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/currency/v1/CurrencyDto$CurrencyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public static final class Serializer implements KSerializer<CurrencyTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CurrencyTypeDto, Currency.CurrencyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/crypto_perpetuals.currency.v1.Currency.CurrencyType", CurrencyTypeDto.getEntries(), CurrencyTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CurrencyTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CurrencyTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CurrencyTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CurrencyTypeDto valueOf(String str) {
            return (CurrencyTypeDto) Enum.valueOf(CurrencyTypeDto.class, str);
        }

        public static CurrencyTypeDto[] values() {
            return (CurrencyTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/currency/v1/CurrencyDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/currency/v1/CurrencyDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<CurrencyDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.currency.v1.Currency", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CurrencyDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CurrencyDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CurrencyDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CurrencyDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/currency/v1/CurrencyDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.currency.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "crypto_perpetuals.currency.v1.CurrencyDto";
        }
    }
}
