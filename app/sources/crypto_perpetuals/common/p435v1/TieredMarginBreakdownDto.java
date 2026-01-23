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

/* compiled from: TieredMarginBreakdownDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014¨\u0006."}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdown;", "Landroid/os/Parcelable;", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "leverage", "Lcrypto_perpetuals/common/v1/MoneyDto;", "notional_size", "initial_margin_rate", "margin_required", "", "description", "(Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;)V", "toProto", "()Lcrypto_perpetuals/common/v1/TieredMarginBreakdown;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;", "getLeverage", "()Lcom/robinhood/idl/IdlDecimal;", "getMargin_required", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getDescription", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class TieredMarginBreakdownDto implements Dto3<TieredMarginBreakdown>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TieredMarginBreakdownDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TieredMarginBreakdownDto, TieredMarginBreakdown>> binaryBase64Serializer$delegate;
    private static final TieredMarginBreakdownDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TieredMarginBreakdownDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TieredMarginBreakdownDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final MoneyDto getMargin_required() {
        return this.surrogate.getMargin_required();
    }

    public final String getDescription() {
        return this.surrogate.getDescription();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TieredMarginBreakdownDto(com.robinhood.idl.IdlDecimal r3, crypto_perpetuals.common.p435v1.MoneyDto r4, com.robinhood.idl.IdlDecimal r5, crypto_perpetuals.common.p435v1.MoneyDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r9 = r8 & 1
            java.lang.String r0 = ""
            if (r9 == 0) goto Lb
            com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
            r3.<init>(r0)
        Lb:
            r9 = r8 & 2
            r1 = 0
            if (r9 == 0) goto L11
            r4 = r1
        L11:
            r9 = r8 & 4
            if (r9 == 0) goto L1a
            com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
            r5.<init>(r0)
        L1a:
            r9 = r8 & 8
            if (r9 == 0) goto L1f
            r6 = r1
        L1f:
            r8 = r8 & 16
            if (r8 == 0) goto L2a
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L30
        L2a:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L30:
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.common.p435v1.TieredMarginBreakdownDto.<init>(com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TieredMarginBreakdownDto(IdlDecimal leverage, MoneyDto moneyDto, IdlDecimal initial_margin_rate, MoneyDto moneyDto2, String description) {
        this(new Surrogate(leverage, moneyDto, initial_margin_rate, moneyDto2, description));
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(initial_margin_rate, "initial_margin_rate");
        Intrinsics.checkNotNullParameter(description, "description");
    }

    @Override // com.robinhood.idl.Dto
    public TieredMarginBreakdown toProto() {
        String stringValue = this.surrogate.getLeverage().getStringValue();
        MoneyDto notional_size = this.surrogate.getNotional_size();
        Money proto = notional_size != null ? notional_size.toProto() : null;
        String stringValue2 = this.surrogate.getInitial_margin_rate().getStringValue();
        MoneyDto margin_required = this.surrogate.getMargin_required();
        return new TieredMarginBreakdown(stringValue, proto, stringValue2, margin_required != null ? margin_required.toProto() : null, this.surrogate.getDescription(), null, 32, null);
    }

    public String toString() {
        return "[TieredMarginBreakdownDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TieredMarginBreakdownDto) && Intrinsics.areEqual(((TieredMarginBreakdownDto) other).surrogate, this.surrogate);
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
    /* compiled from: TieredMarginBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265B[\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBM\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R/\u0010\t\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b1\u0010)\u001a\u0004\b0\u0010,R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001e¨\u00067"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "leverage", "Lcrypto_perpetuals/common/v1/MoneyDto;", "notional_size", "initial_margin_rate", "margin_required", "", "description", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Lcom/robinhood/idl/IdlDecimal;Lcrypto_perpetuals/common/v1/MoneyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_perpetuals_common_v1_externalRelease", "(Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getLeverage", "()Lcom/robinhood/idl/IdlDecimal;", "getLeverage$annotations", "()V", "Lcrypto_perpetuals/common/v1/MoneyDto;", "getNotional_size", "()Lcrypto_perpetuals/common/v1/MoneyDto;", "getNotional_size$annotations", "getInitial_margin_rate", "getInitial_margin_rate$annotations", "getMargin_required", "getMargin_required$annotations", "Ljava/lang/String;", "getDescription", "getDescription$annotations", "Companion", "$serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String description;
        private final IdlDecimal initial_margin_rate;
        private final IdlDecimal leverage;
        private final MoneyDto margin_required;
        private final MoneyDto notional_size;

        public Surrogate() {
            this((IdlDecimal) null, (MoneyDto) null, (IdlDecimal) null, (MoneyDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.leverage, surrogate.leverage) && Intrinsics.areEqual(this.notional_size, surrogate.notional_size) && Intrinsics.areEqual(this.initial_margin_rate, surrogate.initial_margin_rate) && Intrinsics.areEqual(this.margin_required, surrogate.margin_required) && Intrinsics.areEqual(this.description, surrogate.description);
        }

        public int hashCode() {
            int iHashCode = this.leverage.hashCode() * 31;
            MoneyDto moneyDto = this.notional_size;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.initial_margin_rate.hashCode()) * 31;
            MoneyDto moneyDto2 = this.margin_required;
            return ((iHashCode2 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.description.hashCode();
        }

        public String toString() {
            return "Surrogate(leverage=" + this.leverage + ", notional_size=" + this.notional_size + ", initial_margin_rate=" + this.initial_margin_rate + ", margin_required=" + this.margin_required + ", description=" + this.description + ")";
        }

        /* compiled from: TieredMarginBreakdownDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TieredMarginBreakdownDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, MoneyDto moneyDto, IdlDecimal idlDecimal2, MoneyDto moneyDto2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.leverage = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.notional_size = null;
            } else {
                this.notional_size = moneyDto;
            }
            if ((i & 4) == 0) {
                this.initial_margin_rate = new IdlDecimal("");
            } else {
                this.initial_margin_rate = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.margin_required = null;
            } else {
                this.margin_required = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.description = "";
            } else {
                this.description = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_perpetuals_common_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.leverage, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.leverage);
            }
            MoneyDto moneyDto = self.notional_size;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.initial_margin_rate, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.initial_margin_rate);
            }
            MoneyDto moneyDto2 = self.margin_required;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (Intrinsics.areEqual(self.description, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.description);
        }

        public Surrogate(IdlDecimal leverage, MoneyDto moneyDto, IdlDecimal initial_margin_rate, MoneyDto moneyDto2, String description) {
            Intrinsics.checkNotNullParameter(leverage, "leverage");
            Intrinsics.checkNotNullParameter(initial_margin_rate, "initial_margin_rate");
            Intrinsics.checkNotNullParameter(description, "description");
            this.leverage = leverage;
            this.notional_size = moneyDto;
            this.initial_margin_rate = initial_margin_rate;
            this.margin_required = moneyDto2;
            this.description = description;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.idl.IdlDecimal r3, crypto_perpetuals.common.p435v1.MoneyDto r4, com.robinhood.idl.IdlDecimal r5, crypto_perpetuals.common.p435v1.MoneyDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r2 = this;
                r9 = r8 & 1
                java.lang.String r0 = ""
                if (r9 == 0) goto Lb
                com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                r3.<init>(r0)
            Lb:
                r9 = r8 & 2
                r1 = 0
                if (r9 == 0) goto L11
                r4 = r1
            L11:
                r9 = r8 & 4
                if (r9 == 0) goto L1a
                com.robinhood.idl.IdlDecimal r5 = new com.robinhood.idl.IdlDecimal
                r5.<init>(r0)
            L1a:
                r9 = r8 & 8
                if (r9 == 0) goto L1f
                r6 = r1
            L1f:
                r8 = r8 & 16
                if (r8 == 0) goto L2a
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L30
            L2a:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L30:
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_perpetuals.common.p435v1.TieredMarginBreakdownDto.Surrogate.<init>(com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, com.robinhood.idl.IdlDecimal, crypto_perpetuals.common.v1.MoneyDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getLeverage() {
            return this.leverage;
        }

        public final MoneyDto getNotional_size() {
            return this.notional_size;
        }

        public final IdlDecimal getInitial_margin_rate() {
            return this.initial_margin_rate;
        }

        public final MoneyDto getMargin_required() {
            return this.margin_required;
        }

        public final String getDescription() {
            return this.description;
        }
    }

    /* compiled from: TieredMarginBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto;", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdown;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TieredMarginBreakdownDto, TieredMarginBreakdown> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TieredMarginBreakdownDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TieredMarginBreakdownDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TieredMarginBreakdownDto> getBinaryBase64Serializer() {
            return (KSerializer) TieredMarginBreakdownDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TieredMarginBreakdown> getProtoAdapter() {
            return TieredMarginBreakdown.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TieredMarginBreakdownDto getZeroValue() {
            return TieredMarginBreakdownDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TieredMarginBreakdownDto fromProto(TieredMarginBreakdown proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IdlDecimal idlDecimal = new IdlDecimal(proto.getLeverage());
            Money notional_size = proto.getNotional_size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = notional_size != null ? MoneyDto.INSTANCE.fromProto(notional_size) : null;
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getInitial_margin_rate());
            Money margin_required = proto.getMargin_required();
            return new TieredMarginBreakdownDto(new Surrogate(idlDecimal, moneyDtoFromProto, idlDecimal2, margin_required != null ? MoneyDto.INSTANCE.fromProto(margin_required) : null, proto.getDescription()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_perpetuals.common.v1.TieredMarginBreakdownDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TieredMarginBreakdownDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TieredMarginBreakdownDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TieredMarginBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TieredMarginBreakdownDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_perpetuals.common.v1.TieredMarginBreakdown", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TieredMarginBreakdownDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TieredMarginBreakdownDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TieredMarginBreakdownDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TieredMarginBreakdownDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TieredMarginBreakdownDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "crypto_perpetuals.common.v1.TieredMarginBreakdownDto";
        }
    }
}
