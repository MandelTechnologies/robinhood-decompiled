package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.FuturesContractDto;
import com.robinhood.arsenal.proto.p281v1.idl.TradabilityInfoDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.i18n.Affiliate;
import com.robinhood.rosetta.i18n.AffiliateDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetFuturesContractWithTradabilityResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Surrogate;)V", "contract", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "tradability_info", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;)V", "getContract", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getTradability_info", "()Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class GetFuturesContractWithTradabilityResponseDto implements Dto3<GetFuturesContractWithTradabilityResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetFuturesContractWithTradabilityResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetFuturesContractWithTradabilityResponseDto, GetFuturesContractWithTradabilityResponse>> binaryBase64Serializer$delegate;
    private static final GetFuturesContractWithTradabilityResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetFuturesContractWithTradabilityResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetFuturesContractWithTradabilityResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FuturesContractDto getContract() {
        return this.surrogate.getContract();
    }

    public final AffiliateDto getAffiliate() {
        return this.surrogate.getAffiliate();
    }

    public final TradabilityInfoDto getTradability_info() {
        return this.surrogate.getTradability_info();
    }

    public /* synthetic */ GetFuturesContractWithTradabilityResponseDto(FuturesContractDto futuresContractDto, AffiliateDto affiliateDto, TradabilityInfoDto tradabilityInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresContractDto, (i & 2) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i & 4) != 0 ? null : tradabilityInfoDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetFuturesContractWithTradabilityResponseDto(FuturesContractDto futuresContractDto, AffiliateDto affiliate, TradabilityInfoDto tradabilityInfoDto) {
        this(new Surrogate(futuresContractDto, affiliate, tradabilityInfoDto));
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
    }

    public static /* synthetic */ GetFuturesContractWithTradabilityResponseDto copy$default(GetFuturesContractWithTradabilityResponseDto getFuturesContractWithTradabilityResponseDto, FuturesContractDto futuresContractDto, AffiliateDto affiliateDto, TradabilityInfoDto tradabilityInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresContractDto = getFuturesContractWithTradabilityResponseDto.surrogate.getContract();
        }
        if ((i & 2) != 0) {
            affiliateDto = getFuturesContractWithTradabilityResponseDto.surrogate.getAffiliate();
        }
        if ((i & 4) != 0) {
            tradabilityInfoDto = getFuturesContractWithTradabilityResponseDto.surrogate.getTradability_info();
        }
        return getFuturesContractWithTradabilityResponseDto.copy(futuresContractDto, affiliateDto, tradabilityInfoDto);
    }

    public final GetFuturesContractWithTradabilityResponseDto copy(FuturesContractDto contract, AffiliateDto affiliate, TradabilityInfoDto tradability_info) {
        Intrinsics.checkNotNullParameter(affiliate, "affiliate");
        return new GetFuturesContractWithTradabilityResponseDto(new Surrogate(contract, affiliate, tradability_info));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetFuturesContractWithTradabilityResponse toProto() {
        FuturesContractDto contract = this.surrogate.getContract();
        FuturesContract proto = contract != null ? contract.toProto() : null;
        Affiliate affiliate = (Affiliate) this.surrogate.getAffiliate().toProto();
        TradabilityInfoDto tradability_info = this.surrogate.getTradability_info();
        return new GetFuturesContractWithTradabilityResponse(proto, affiliate, tradability_info != null ? tradability_info.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetFuturesContractWithTradabilityResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetFuturesContractWithTradabilityResponseDto) && Intrinsics.areEqual(((GetFuturesContractWithTradabilityResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetFuturesContractWithTradabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Surrogate;", "", "contract", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "tradability_info", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract$annotations", "()V", "getContract", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesContractDto;", "getAffiliate$annotations", "getAffiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getTradability_info$annotations", "getTradability_info", "()Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AffiliateDto affiliate;
        private final FuturesContractDto contract;
        private final TradabilityInfoDto tradability_info;

        public Surrogate() {
            this((FuturesContractDto) null, (AffiliateDto) null, (TradabilityInfoDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FuturesContractDto futuresContractDto, AffiliateDto affiliateDto, TradabilityInfoDto tradabilityInfoDto, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresContractDto = surrogate.contract;
            }
            if ((i & 2) != 0) {
                affiliateDto = surrogate.affiliate;
            }
            if ((i & 4) != 0) {
                tradabilityInfoDto = surrogate.tradability_info;
            }
            return surrogate.copy(futuresContractDto, affiliateDto, tradabilityInfoDto);
        }

        @SerialName("affiliate")
        @JsonAnnotations2(names = {"affiliate"})
        public static /* synthetic */ void getAffiliate$annotations() {
        }

        @SerialName("contract")
        @JsonAnnotations2(names = {"contract"})
        public static /* synthetic */ void getContract$annotations() {
        }

        @SerialName("tradabilityInfo")
        @JsonAnnotations2(names = {"tradability_info"})
        public static /* synthetic */ void getTradability_info$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesContractDto getContract() {
            return this.contract;
        }

        /* renamed from: component2, reason: from getter */
        public final AffiliateDto getAffiliate() {
            return this.affiliate;
        }

        /* renamed from: component3, reason: from getter */
        public final TradabilityInfoDto getTradability_info() {
            return this.tradability_info;
        }

        public final Surrogate copy(FuturesContractDto contract, AffiliateDto affiliate, TradabilityInfoDto tradability_info) {
            Intrinsics.checkNotNullParameter(affiliate, "affiliate");
            return new Surrogate(contract, affiliate, tradability_info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract, surrogate.contract) && this.affiliate == surrogate.affiliate && Intrinsics.areEqual(this.tradability_info, surrogate.tradability_info);
        }

        public int hashCode() {
            FuturesContractDto futuresContractDto = this.contract;
            int iHashCode = (((futuresContractDto == null ? 0 : futuresContractDto.hashCode()) * 31) + this.affiliate.hashCode()) * 31;
            TradabilityInfoDto tradabilityInfoDto = this.tradability_info;
            return iHashCode + (tradabilityInfoDto != null ? tradabilityInfoDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(contract=" + this.contract + ", affiliate=" + this.affiliate + ", tradability_info=" + this.tradability_info + ")";
        }

        /* compiled from: GetFuturesContractWithTradabilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetFuturesContractWithTradabilityResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FuturesContractDto futuresContractDto, AffiliateDto affiliateDto, TradabilityInfoDto tradabilityInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contract = null;
            } else {
                this.contract = futuresContractDto;
            }
            if ((i & 2) == 0) {
                this.affiliate = AffiliateDto.INSTANCE.getZeroValue();
            } else {
                this.affiliate = affiliateDto;
            }
            if ((i & 4) == 0) {
                this.tradability_info = null;
            } else {
                this.tradability_info = tradabilityInfoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            FuturesContractDto futuresContractDto = self.contract;
            if (futuresContractDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FuturesContractDto.Serializer.INSTANCE, futuresContractDto);
            }
            if (self.affiliate != AffiliateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AffiliateDto.Serializer.INSTANCE, self.affiliate);
            }
            TradabilityInfoDto tradabilityInfoDto = self.tradability_info;
            if (tradabilityInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TradabilityInfoDto.Serializer.INSTANCE, tradabilityInfoDto);
            }
        }

        public Surrogate(FuturesContractDto futuresContractDto, AffiliateDto affiliate, TradabilityInfoDto tradabilityInfoDto) {
            Intrinsics.checkNotNullParameter(affiliate, "affiliate");
            this.contract = futuresContractDto;
            this.affiliate = affiliate;
            this.tradability_info = tradabilityInfoDto;
        }

        public final FuturesContractDto getContract() {
            return this.contract;
        }

        public final AffiliateDto getAffiliate() {
            return this.affiliate;
        }

        public /* synthetic */ Surrogate(FuturesContractDto futuresContractDto, AffiliateDto affiliateDto, TradabilityInfoDto tradabilityInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : futuresContractDto, (i & 2) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i & 4) != 0 ? null : tradabilityInfoDto);
        }

        public final TradabilityInfoDto getTradability_info() {
            return this.tradability_info;
        }
    }

    /* compiled from: GetFuturesContractWithTradabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetFuturesContractWithTradabilityResponseDto, GetFuturesContractWithTradabilityResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetFuturesContractWithTradabilityResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFuturesContractWithTradabilityResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetFuturesContractWithTradabilityResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetFuturesContractWithTradabilityResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetFuturesContractWithTradabilityResponse> getProtoAdapter() {
            return GetFuturesContractWithTradabilityResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFuturesContractWithTradabilityResponseDto getZeroValue() {
            return GetFuturesContractWithTradabilityResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetFuturesContractWithTradabilityResponseDto fromProto(GetFuturesContractWithTradabilityResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FuturesContract contract = proto.getContract();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FuturesContractDto futuresContractDtoFromProto = contract != null ? FuturesContractDto.INSTANCE.fromProto(contract) : null;
            AffiliateDto affiliateDtoFromProto = AffiliateDto.INSTANCE.fromProto(proto.getAffiliate());
            TradabilityInfo tradability_info = proto.getTradability_info();
            return new GetFuturesContractWithTradabilityResponseDto(new Surrogate(futuresContractDtoFromProto, affiliateDtoFromProto, tradability_info != null ? TradabilityInfoDto.INSTANCE.fromProto(tradability_info) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.GetFuturesContractWithTradabilityResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetFuturesContractWithTradabilityResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetFuturesContractWithTradabilityResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetFuturesContractWithTradabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetFuturesContractWithTradabilityResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.GetFuturesContractWithTradabilityResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetFuturesContractWithTradabilityResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetFuturesContractWithTradabilityResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetFuturesContractWithTradabilityResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetFuturesContractWithTradabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetFuturesContractWithTradabilityResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.GetFuturesContractWithTradabilityResponseDto";
        }
    }
}
