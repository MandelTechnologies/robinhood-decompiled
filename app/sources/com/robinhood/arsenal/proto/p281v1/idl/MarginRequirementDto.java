package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.CurrencyDto;
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

/* compiled from: MarginRequirementDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirement;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Surrogate;)V", AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT, "Lcom/robinhood/idl/IdlDecimal;", "currency", "Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;)V", "getMargin_requirement", "()Lcom/robinhood/idl/IdlDecimal;", "getCurrency", "()Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class MarginRequirementDto implements Dto3<MarginRequirement>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginRequirementDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginRequirementDto, MarginRequirement>> binaryBase64Serializer$delegate;
    private static final MarginRequirementDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginRequirementDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginRequirementDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final IdlDecimal getMargin_requirement() {
        return this.surrogate.getMargin_requirement();
    }

    public final CurrencyDto getCurrency() {
        return this.surrogate.getCurrency();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginRequirementDto(IdlDecimal margin_requirement, CurrencyDto currency) {
        this(new Surrogate(margin_requirement, currency));
        Intrinsics.checkNotNullParameter(margin_requirement, "margin_requirement");
        Intrinsics.checkNotNullParameter(currency, "currency");
    }

    public /* synthetic */ MarginRequirementDto(IdlDecimal idlDecimal, CurrencyDto currencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto);
    }

    public static /* synthetic */ MarginRequirementDto copy$default(MarginRequirementDto marginRequirementDto, IdlDecimal idlDecimal, CurrencyDto currencyDto, int i, Object obj) {
        if ((i & 1) != 0) {
            idlDecimal = marginRequirementDto.surrogate.getMargin_requirement();
        }
        if ((i & 2) != 0) {
            currencyDto = marginRequirementDto.surrogate.getCurrency();
        }
        return marginRequirementDto.copy(idlDecimal, currencyDto);
    }

    public final MarginRequirementDto copy(IdlDecimal margin_requirement, CurrencyDto currency) {
        Intrinsics.checkNotNullParameter(margin_requirement, "margin_requirement");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new MarginRequirementDto(new Surrogate(margin_requirement, currency));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MarginRequirement toProto() {
        return new MarginRequirement(this.surrogate.getMargin_requirement().getStringValue(), (Currency) this.surrogate.getCurrency().toProto(), null, 4, null);
    }

    public String toString() {
        return "[MarginRequirementDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginRequirementDto) && Intrinsics.areEqual(((MarginRequirementDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginRequirementDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B*\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB/\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\u0018\u0010\u0017\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J,\u0010\u0019\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Surrogate;", "", AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT, "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "currency", "Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMargin_requirement$annotations", "()V", "getMargin_requirement", "()Lcom/robinhood/idl/IdlDecimal;", "getCurrency$annotations", "getCurrency", "()Lcom/robinhood/arsenal/proto/v1/idl/CurrencyDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyDto currency;
        private final IdlDecimal margin_requirement;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((IdlDecimal) null, (CurrencyDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, IdlDecimal idlDecimal, CurrencyDto currencyDto, int i, Object obj) {
            if ((i & 1) != 0) {
                idlDecimal = surrogate.margin_requirement;
            }
            if ((i & 2) != 0) {
                currencyDto = surrogate.currency;
            }
            return surrogate.copy(idlDecimal, currencyDto);
        }

        @SerialName("currency")
        @JsonAnnotations2(names = {"currency"})
        public static /* synthetic */ void getCurrency$annotations() {
        }

        @SerialName("marginRequirement")
        @JsonAnnotations2(names = {AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT})
        public static /* synthetic */ void getMargin_requirement$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final IdlDecimal getMargin_requirement() {
            return this.margin_requirement;
        }

        /* renamed from: component2, reason: from getter */
        public final CurrencyDto getCurrency() {
            return this.currency;
        }

        public final Surrogate copy(IdlDecimal margin_requirement, CurrencyDto currency) {
            Intrinsics.checkNotNullParameter(margin_requirement, "margin_requirement");
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new Surrogate(margin_requirement, currency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.margin_requirement, surrogate.margin_requirement) && this.currency == surrogate.currency;
        }

        public int hashCode() {
            return (this.margin_requirement.hashCode() * 31) + this.currency.hashCode();
        }

        public String toString() {
            return "Surrogate(margin_requirement=" + this.margin_requirement + ", currency=" + this.currency + ")";
        }

        /* compiled from: MarginRequirementDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginRequirementDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, CurrencyDto currencyDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.margin_requirement = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
            if ((i & 2) == 0) {
                this.currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.currency = currencyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.margin_requirement, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.margin_requirement);
            }
            if (self.currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CurrencyDto.Serializer.INSTANCE, self.currency);
            }
        }

        public Surrogate(IdlDecimal margin_requirement, CurrencyDto currency) {
            Intrinsics.checkNotNullParameter(margin_requirement, "margin_requirement");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.margin_requirement = margin_requirement;
            this.currency = currency;
        }

        public final IdlDecimal getMargin_requirement() {
            return this.margin_requirement;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, CurrencyDto currencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto);
        }

        public final CurrencyDto getCurrency() {
            return this.currency;
        }
    }

    /* compiled from: MarginRequirementDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirement;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MarginRequirementDto, MarginRequirement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginRequirementDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginRequirementDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginRequirementDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginRequirementDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginRequirement> getProtoAdapter() {
            return MarginRequirement.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginRequirementDto getZeroValue() {
            return MarginRequirementDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginRequirementDto fromProto(MarginRequirement proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MarginRequirementDto(new Surrogate(new IdlDecimal(proto.getMargin_requirement()), CurrencyDto.INSTANCE.fromProto(proto.getCurrency())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.MarginRequirementDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginRequirementDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginRequirementDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginRequirementDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer implements KSerializer<MarginRequirementDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.MarginRequirement", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginRequirementDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginRequirementDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginRequirementDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: MarginRequirementDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/MarginRequirementDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.MarginRequirementDto";
        }
    }
}
