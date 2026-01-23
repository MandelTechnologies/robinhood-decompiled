package com.robinhood.rosetta.brokerage;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: CashHoldDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/brokerage/CashHold;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/brokerage/CashHoldDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/brokerage/CashHoldDto$Surrogate;)V", "held_amount", "", "outgoing_amount", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "short_held_amount", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;)V", "getHeld_amount", "()Ljava/lang/String;", "getOutgoing_amount", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getShort_held_amount", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CashHoldDto implements Dto3<CashHold>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CashHoldDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CashHoldDto, CashHold>> binaryBase64Serializer$delegate;
    private static final CashHoldDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CashHoldDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CashHoldDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getHeld_amount() {
        return this.surrogate.getHeld_amount();
    }

    public final String getOutgoing_amount() {
        return this.surrogate.getOutgoing_amount();
    }

    public final CurrencyDto getCurrency() {
        return this.surrogate.getCurrency();
    }

    public final String getShort_held_amount() {
        return this.surrogate.getShort_held_amount();
    }

    public /* synthetic */ CashHoldDto(String str, String str2, CurrencyDto currencyDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 8) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashHoldDto(String held_amount, String outgoing_amount, CurrencyDto currency, String short_held_amount) {
        this(new Surrogate(held_amount, outgoing_amount, currency, short_held_amount));
        Intrinsics.checkNotNullParameter(held_amount, "held_amount");
        Intrinsics.checkNotNullParameter(outgoing_amount, "outgoing_amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(short_held_amount, "short_held_amount");
    }

    public static /* synthetic */ CashHoldDto copy$default(CashHoldDto cashHoldDto, String str, String str2, CurrencyDto currencyDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashHoldDto.surrogate.getHeld_amount();
        }
        if ((i & 2) != 0) {
            str2 = cashHoldDto.surrogate.getOutgoing_amount();
        }
        if ((i & 4) != 0) {
            currencyDto = cashHoldDto.surrogate.getCurrency();
        }
        if ((i & 8) != 0) {
            str3 = cashHoldDto.surrogate.getShort_held_amount();
        }
        return cashHoldDto.copy(str, str2, currencyDto, str3);
    }

    public final CashHoldDto copy(String held_amount, String outgoing_amount, CurrencyDto currency, String short_held_amount) {
        Intrinsics.checkNotNullParameter(held_amount, "held_amount");
        Intrinsics.checkNotNullParameter(outgoing_amount, "outgoing_amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(short_held_amount, "short_held_amount");
        return new CashHoldDto(new Surrogate(held_amount, outgoing_amount, currency, short_held_amount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CashHold toProto() {
        return new CashHold(this.surrogate.getHeld_amount(), this.surrogate.getOutgoing_amount(), (Currency) this.surrogate.getCurrency().toProto(), this.surrogate.getShort_held_amount(), null, 16, null);
    }

    public String toString() {
        return "[CashHoldDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CashHoldDto) && Intrinsics.areEqual(((CashHoldDto) other).surrogate, this.surrogate);
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
    /* compiled from: CashHoldDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHoldDto$Surrogate;", "", "held_amount", "", "outgoing_amount", "currency", "Lcom/robinhood/rosetta/common/CurrencyDto;", "short_held_amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/CurrencyDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeld_amount$annotations", "()V", "getHeld_amount", "()Ljava/lang/String;", "getOutgoing_amount$annotations", "getOutgoing_amount", "getCurrency$annotations", "getCurrency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getShort_held_amount$annotations", "getShort_held_amount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_brokerage_externalRelease", "$serializer", "Companion", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyDto currency;
        private final String held_amount;
        private final String outgoing_amount;
        private final String short_held_amount;

        public Surrogate() {
            this((String) null, (String) null, (CurrencyDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, CurrencyDto currencyDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.held_amount;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.outgoing_amount;
            }
            if ((i & 4) != 0) {
                currencyDto = surrogate.currency;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.short_held_amount;
            }
            return surrogate.copy(str, str2, currencyDto, str3);
        }

        @SerialName("currency")
        @JsonAnnotations2(names = {"currency"})
        public static /* synthetic */ void getCurrency$annotations() {
        }

        @SerialName("heldAmount")
        @JsonAnnotations2(names = {"held_amount"})
        public static /* synthetic */ void getHeld_amount$annotations() {
        }

        @SerialName("outgoingAmount")
        @JsonAnnotations2(names = {"outgoing_amount"})
        public static /* synthetic */ void getOutgoing_amount$annotations() {
        }

        @SerialName("shortHeldAmount")
        @JsonAnnotations2(names = {"short_held_amount"})
        public static /* synthetic */ void getShort_held_amount$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeld_amount() {
            return this.held_amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOutgoing_amount() {
            return this.outgoing_amount;
        }

        /* renamed from: component3, reason: from getter */
        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        /* renamed from: component4, reason: from getter */
        public final String getShort_held_amount() {
            return this.short_held_amount;
        }

        public final Surrogate copy(String held_amount, String outgoing_amount, CurrencyDto currency, String short_held_amount) {
            Intrinsics.checkNotNullParameter(held_amount, "held_amount");
            Intrinsics.checkNotNullParameter(outgoing_amount, "outgoing_amount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(short_held_amount, "short_held_amount");
            return new Surrogate(held_amount, outgoing_amount, currency, short_held_amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.held_amount, surrogate.held_amount) && Intrinsics.areEqual(this.outgoing_amount, surrogate.outgoing_amount) && this.currency == surrogate.currency && Intrinsics.areEqual(this.short_held_amount, surrogate.short_held_amount);
        }

        public int hashCode() {
            return (((((this.held_amount.hashCode() * 31) + this.outgoing_amount.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.short_held_amount.hashCode();
        }

        public String toString() {
            return "Surrogate(held_amount=" + this.held_amount + ", outgoing_amount=" + this.outgoing_amount + ", currency=" + this.currency + ", short_held_amount=" + this.short_held_amount + ")";
        }

        /* compiled from: CashHoldDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHoldDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/CashHoldDto$Surrogate;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CashHoldDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, CurrencyDto currencyDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.held_amount = "";
            } else {
                this.held_amount = str;
            }
            if ((i & 2) == 0) {
                this.outgoing_amount = "";
            } else {
                this.outgoing_amount = str2;
            }
            if ((i & 4) == 0) {
                this.currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.currency = currencyDto;
            }
            if ((i & 8) == 0) {
                this.short_held_amount = "";
            } else {
                this.short_held_amount = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_brokerage_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.held_amount, "")) {
                output.encodeStringElement(serialDesc, 0, self.held_amount);
            }
            if (!Intrinsics.areEqual(self.outgoing_amount, "")) {
                output.encodeStringElement(serialDesc, 1, self.outgoing_amount);
            }
            if (self.currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CurrencyDto.Serializer.INSTANCE, self.currency);
            }
            if (Intrinsics.areEqual(self.short_held_amount, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.short_held_amount);
        }

        public Surrogate(String held_amount, String outgoing_amount, CurrencyDto currency, String short_held_amount) {
            Intrinsics.checkNotNullParameter(held_amount, "held_amount");
            Intrinsics.checkNotNullParameter(outgoing_amount, "outgoing_amount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(short_held_amount, "short_held_amount");
            this.held_amount = held_amount;
            this.outgoing_amount = outgoing_amount;
            this.currency = currency;
            this.short_held_amount = short_held_amount;
        }

        public /* synthetic */ Surrogate(String str, String str2, CurrencyDto currencyDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto, (i & 8) != 0 ? "" : str3);
        }

        public final String getHeld_amount() {
            return this.held_amount;
        }

        public final String getOutgoing_amount() {
            return this.outgoing_amount;
        }

        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        public final String getShort_held_amount() {
            return this.short_held_amount;
        }
    }

    /* compiled from: CashHoldDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHoldDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "Lcom/robinhood/rosetta/brokerage/CashHold;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CashHoldDto, CashHold> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CashHoldDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashHoldDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CashHoldDto> getBinaryBase64Serializer() {
            return (KSerializer) CashHoldDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CashHold> getProtoAdapter() {
            return CashHold.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashHoldDto getZeroValue() {
            return CashHoldDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CashHoldDto fromProto(CashHold proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CashHoldDto(new Surrogate(proto.getHeld_amount(), proto.getOutgoing_amount(), CurrencyDto.INSTANCE.fromProto(proto.getCurrency()), proto.getShort_held_amount()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.brokerage.CashHoldDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CashHoldDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CashHoldDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CashHoldDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHoldDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/brokerage/CashHoldDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/brokerage/CashHoldDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CashHoldDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.brokerage.CashHold", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CashHoldDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CashHoldDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CashHoldDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CashHoldDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/brokerage/CashHoldDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.brokerage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.brokerage.CashHoldDto";
        }
    }
}
