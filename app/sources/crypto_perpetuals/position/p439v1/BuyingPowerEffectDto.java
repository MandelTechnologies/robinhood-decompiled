package crypto_perpetuals.position.p439v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_perpetuals.common.p435v1.FXQuote;
import crypto_perpetuals.common.p435v1.FXQuoteDto;
import crypto_perpetuals.common.p435v1.Money;
import crypto_perpetuals.common.p435v1.MoneyDto;
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

/* compiled from: BuyingPowerEffectDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;)V", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "Lcrypto_perpetuals/common/v1/MoneyDto;", "usd_margin", "eur_margin", "estimated_total", "(Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;)V", "toProto", "()Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;", "getEstimated_total", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class BuyingPowerEffectDto implements Dto3<BuyingPowerEffect>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BuyingPowerEffectDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BuyingPowerEffectDto, BuyingPowerEffect>> binaryBase64Serializer$delegate;
    private static final BuyingPowerEffectDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BuyingPowerEffectDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BuyingPowerEffectDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MoneyDto getEstimated_total() {
        return this.surrogate.getEstimated_total();
    }

    public /* synthetic */ BuyingPowerEffectDto(FXQuoteDto fXQuoteDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fXQuoteDto, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : moneyDto3);
    }

    public BuyingPowerEffectDto(FXQuoteDto fXQuoteDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3) {
        this(new Surrogate(fXQuoteDto, moneyDto, moneyDto2, moneyDto3));
    }

    @Override // com.robinhood.idl.Dto
    public BuyingPowerEffect toProto() {
        FXQuoteDto fx_quote = this.surrogate.getFx_quote();
        FXQuote proto = fx_quote != null ? fx_quote.toProto() : null;
        MoneyDto usd_margin = this.surrogate.getUsd_margin();
        Money proto2 = usd_margin != null ? usd_margin.toProto() : null;
        MoneyDto eur_margin = this.surrogate.getEur_margin();
        Money proto3 = eur_margin != null ? eur_margin.toProto() : null;
        MoneyDto estimated_total = this.surrogate.getEstimated_total();
        return new BuyingPowerEffect(proto, proto2, proto3, estimated_total != null ? estimated_total.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[BuyingPowerEffectDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BuyingPowerEffectDto) && Intrinsics.areEqual(((BuyingPowerEffectDto) other).surrogate, this.surrogate);
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
    /* compiled from: BuyingPowerEffectDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010(¨\u00060"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;", "", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "fx_quote", "Lcrypto_perpetuals/common/v1/MoneyDto;", "usd_margin", "eur_margin", "estimated_total", "<init>", "(Lcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto_perpetuals/common/v1/FXQuoteDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lcrypto_perpetuals/common/v1/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_position_v1_externalRelease", "(Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote", "()Lcrypto_perpetuals/common/v1/FXQuoteDto;", "getFx_quote$annotations", "()V", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getUsd_margin", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getUsd_margin$annotations", "getEur_margin", "getEur_margin$annotations", "getEstimated_total", "getEstimated_total$annotations", "Companion", "$serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MoneyDto estimated_total;
        private final MoneyDto eur_margin;
        private final FXQuoteDto fx_quote;
        private final MoneyDto usd_margin;

        public Surrogate() {
            this((FXQuoteDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.fx_quote, surrogate.fx_quote) && Intrinsics.areEqual(this.usd_margin, surrogate.usd_margin) && Intrinsics.areEqual(this.eur_margin, surrogate.eur_margin) && Intrinsics.areEqual(this.estimated_total, surrogate.estimated_total);
        }

        public int hashCode() {
            FXQuoteDto fXQuoteDto = this.fx_quote;
            int iHashCode = (fXQuoteDto == null ? 0 : fXQuoteDto.hashCode()) * 31;
            MoneyDto moneyDto = this.usd_margin;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.eur_margin;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.estimated_total;
            return iHashCode3 + (moneyDto3 != null ? moneyDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(fx_quote=" + this.fx_quote + ", usd_margin=" + this.usd_margin + ", eur_margin=" + this.eur_margin + ", estimated_total=" + this.estimated_total + ")";
        }

        /* compiled from: BuyingPowerEffectDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BuyingPowerEffectDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FXQuoteDto fXQuoteDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.fx_quote = null;
            } else {
                this.fx_quote = fXQuoteDto;
            }
            if ((i & 2) == 0) {
                this.usd_margin = null;
            } else {
                this.usd_margin = moneyDto;
            }
            if ((i & 4) == 0) {
                this.eur_margin = null;
            } else {
                this.eur_margin = moneyDto2;
            }
            if ((i & 8) == 0) {
                this.estimated_total = null;
            } else {
                this.estimated_total = moneyDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_position_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            FXQuoteDto fXQuoteDto = self.fx_quote;
            if (fXQuoteDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FXQuoteDto.Serializer.INSTANCE, fXQuoteDto);
            }
            MoneyDto moneyDto = self.usd_margin;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.eur_margin;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.estimated_total;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
        }

        public Surrogate(FXQuoteDto fXQuoteDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3) {
            this.fx_quote = fXQuoteDto;
            this.usd_margin = moneyDto;
            this.eur_margin = moneyDto2;
            this.estimated_total = moneyDto3;
        }

        public /* synthetic */ Surrogate(FXQuoteDto fXQuoteDto, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fXQuoteDto, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : moneyDto2, (i & 8) != 0 ? null : moneyDto3);
        }

        public final FXQuoteDto getFx_quote() {
            return this.fx_quote;
        }

        public final MoneyDto getUsd_margin() {
            return this.usd_margin;
        }

        public final MoneyDto getEur_margin() {
            return this.eur_margin;
        }

        public final MoneyDto getEstimated_total() {
            return this.estimated_total;
        }
    }

    /* compiled from: BuyingPowerEffectDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "Lcrypto_perpetuals/position/v1/BuyingPowerEffect;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BuyingPowerEffectDto, BuyingPowerEffect> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BuyingPowerEffectDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BuyingPowerEffectDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BuyingPowerEffectDto> getBinaryBase64Serializer() {
            return (KSerializer) BuyingPowerEffectDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BuyingPowerEffect> getProtoAdapter() {
            return BuyingPowerEffect.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BuyingPowerEffectDto getZeroValue() {
            return BuyingPowerEffectDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BuyingPowerEffectDto fromProto(BuyingPowerEffect proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FXQuote fx_quote = proto.getFx_quote();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FXQuoteDto fXQuoteDtoFromProto = fx_quote != null ? FXQuoteDto.INSTANCE.fromProto(fx_quote) : null;
            Money usd_margin = proto.getUsd_margin();
            MoneyDto moneyDtoFromProto = usd_margin != null ? MoneyDto.INSTANCE.fromProto(usd_margin) : null;
            Money eur_margin = proto.getEur_margin();
            MoneyDto moneyDtoFromProto2 = eur_margin != null ? MoneyDto.INSTANCE.fromProto(eur_margin) : null;
            Money estimated_total = proto.getEstimated_total();
            return new BuyingPowerEffectDto(new Surrogate(fXQuoteDtoFromProto, moneyDtoFromProto, moneyDtoFromProto2, estimated_total != null ? MoneyDto.INSTANCE.fromProto(estimated_total) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.position.v1.BuyingPowerEffectDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyingPowerEffectDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BuyingPowerEffectDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BuyingPowerEffectDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BuyingPowerEffectDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.position.v1.BuyingPowerEffect", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BuyingPowerEffectDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BuyingPowerEffectDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BuyingPowerEffectDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BuyingPowerEffectDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/position/v1/BuyingPowerEffectDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.position.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "crypto_perpetuals.position.v1.BuyingPowerEffectDto";
        }
    }
}
