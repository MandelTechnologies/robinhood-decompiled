package crypto_perpetuals.common.p435v1;

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

/* compiled from: FXQuoteDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$#%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuoteDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/common/v1/FXQuote;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;)V", "", "from_currency_code", "to_currency_code", "Lcom/robinhood/idl/IdlDecimal;", "exchange_rate", "haircut", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcrypto_perpetuals/common/v1/FXQuote;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class FXQuoteDto implements Dto3<FXQuote>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FXQuoteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FXQuoteDto, FXQuote>> binaryBase64Serializer$delegate;
    private static final FXQuoteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FXQuoteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FXQuoteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ FXQuoteDto(String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : idlDecimal2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FXQuoteDto(String from_currency_code, String to_currency_code, IdlDecimal exchange_rate, IdlDecimal idlDecimal) {
        this(new Surrogate(from_currency_code, to_currency_code, exchange_rate, idlDecimal));
        Intrinsics.checkNotNullParameter(from_currency_code, "from_currency_code");
        Intrinsics.checkNotNullParameter(to_currency_code, "to_currency_code");
        Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
    }

    @Override // com.robinhood.idl.Dto
    public FXQuote toProto() {
        String from_currency_code = this.surrogate.getFrom_currency_code();
        String to_currency_code = this.surrogate.getTo_currency_code();
        String stringValue = this.surrogate.getExchange_rate().getStringValue();
        IdlDecimal haircut = this.surrogate.getHaircut();
        return new FXQuote(from_currency_code, to_currency_code, stringValue, haircut != null ? haircut.getStringValue() : null, null, 16, null);
    }

    public String toString() {
        return "[FXQuoteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FXQuoteDto) && Intrinsics.areEqual(((FXQuoteDto) other).surrogate, this.surrogate);
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
    /* compiled from: FXQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\u000b\u0010\fBC\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+R1\u0010\n\u001a\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010)\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010+¨\u00061"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;", "", "", "from_currency_code", "to_currency_code", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "exchange_rate", "haircut", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_common_v1_externalRelease", "(Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFrom_currency_code", "getFrom_currency_code$annotations", "()V", "getTo_currency_code", "getTo_currency_code$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getExchange_rate", "()Lcom/robinhood/idl/IdlDecimal;", "getExchange_rate$annotations", "getHaircut", "getHaircut$annotations", "Companion", "$serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal exchange_rate;
        private final String from_currency_code;
        private final IdlDecimal haircut;
        private final String to_currency_code;

        public Surrogate() {
            this((String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.from_currency_code, surrogate.from_currency_code) && Intrinsics.areEqual(this.to_currency_code, surrogate.to_currency_code) && Intrinsics.areEqual(this.exchange_rate, surrogate.exchange_rate) && Intrinsics.areEqual(this.haircut, surrogate.haircut);
        }

        public int hashCode() {
            int iHashCode = ((((this.from_currency_code.hashCode() * 31) + this.to_currency_code.hashCode()) * 31) + this.exchange_rate.hashCode()) * 31;
            IdlDecimal idlDecimal = this.haircut;
            return iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode());
        }

        public String toString() {
            return "Surrogate(from_currency_code=" + this.from_currency_code + ", to_currency_code=" + this.to_currency_code + ", exchange_rate=" + this.exchange_rate + ", haircut=" + this.haircut + ")";
        }

        /* compiled from: FXQuoteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FXQuoteDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.from_currency_code = "";
            } else {
                this.from_currency_code = str;
            }
            if ((i & 2) == 0) {
                this.to_currency_code = "";
            } else {
                this.to_currency_code = str2;
            }
            if ((i & 4) == 0) {
                this.exchange_rate = new IdlDecimal("");
            } else {
                this.exchange_rate = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.haircut = null;
            } else {
                this.haircut = idlDecimal2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_common_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.from_currency_code, "")) {
                output.encodeStringElement(serialDesc, 0, self.from_currency_code);
            }
            if (!Intrinsics.areEqual(self.to_currency_code, "")) {
                output.encodeStringElement(serialDesc, 1, self.to_currency_code);
            }
            if (!Intrinsics.areEqual(self.exchange_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.exchange_rate);
            }
            IdlDecimal idlDecimal = self.haircut;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
        }

        public Surrogate(String from_currency_code, String to_currency_code, IdlDecimal exchange_rate, IdlDecimal idlDecimal) {
            Intrinsics.checkNotNullParameter(from_currency_code, "from_currency_code");
            Intrinsics.checkNotNullParameter(to_currency_code, "to_currency_code");
            Intrinsics.checkNotNullParameter(exchange_rate, "exchange_rate");
            this.from_currency_code = from_currency_code;
            this.to_currency_code = to_currency_code;
            this.exchange_rate = exchange_rate;
            this.haircut = idlDecimal;
        }

        public /* synthetic */ Surrogate(String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : idlDecimal2);
        }

        public final String getFrom_currency_code() {
            return this.from_currency_code;
        }

        public final String getTo_currency_code() {
            return this.to_currency_code;
        }

        public final IdlDecimal getExchange_rate() {
            return this.exchange_rate;
        }

        public final IdlDecimal getHaircut() {
            return this.haircut;
        }
    }

    /* compiled from: FXQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuoteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "Lcrypto_perpetuals/common/v1/FXQuote;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FXQuoteDto, FXQuote> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FXQuoteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXQuoteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXQuoteDto> getBinaryBase64Serializer() {
            return (KSerializer) FXQuoteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FXQuote> getProtoAdapter() {
            return FXQuote.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXQuoteDto getZeroValue() {
            return FXQuoteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXQuoteDto fromProto(FXQuote proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String from_currency_code = proto.getFrom_currency_code();
            String to_currency_code = proto.getTo_currency_code();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getExchange_rate());
            String haircut = proto.getHaircut();
            return new FXQuoteDto(new Surrogate(from_currency_code, to_currency_code, idlDecimal, haircut != null ? new IdlDecimal(haircut) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.common.v1.FXQuoteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FXQuoteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FXQuoteDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FXQuoteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuoteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/common/v1/FXQuoteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<FXQuoteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.common.v1.FXQuote", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FXQuoteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FXQuoteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FXQuoteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FXQuoteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/FXQuoteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "crypto_perpetuals.common.v1.FXQuoteDto";
        }
    }
}
