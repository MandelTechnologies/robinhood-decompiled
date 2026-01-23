package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.FuturesTradabilityDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: TradabilityInfoDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Surrogate;)V", "base_tradability", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "affiliate_tradability", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;)V", "getBase_tradability", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "getAffiliate_tradability", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class TradabilityInfoDto implements Dto3<TradabilityInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TradabilityInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TradabilityInfoDto, TradabilityInfo>> binaryBase64Serializer$delegate;
    private static final TradabilityInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TradabilityInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TradabilityInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FuturesTradabilityDto getBase_tradability() {
        return this.surrogate.getBase_tradability();
    }

    public final FuturesTradabilityDto getAffiliate_tradability() {
        return this.surrogate.getAffiliate_tradability();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TradabilityInfoDto(FuturesTradabilityDto base_tradability, FuturesTradabilityDto affiliate_tradability) {
        this(new Surrogate(base_tradability, affiliate_tradability));
        Intrinsics.checkNotNullParameter(base_tradability, "base_tradability");
        Intrinsics.checkNotNullParameter(affiliate_tradability, "affiliate_tradability");
    }

    public /* synthetic */ TradabilityInfoDto(FuturesTradabilityDto futuresTradabilityDto, FuturesTradabilityDto futuresTradabilityDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto, (i & 2) != 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto2);
    }

    public static /* synthetic */ TradabilityInfoDto copy$default(TradabilityInfoDto tradabilityInfoDto, FuturesTradabilityDto futuresTradabilityDto, FuturesTradabilityDto futuresTradabilityDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresTradabilityDto = tradabilityInfoDto.surrogate.getBase_tradability();
        }
        if ((i & 2) != 0) {
            futuresTradabilityDto2 = tradabilityInfoDto.surrogate.getAffiliate_tradability();
        }
        return tradabilityInfoDto.copy(futuresTradabilityDto, futuresTradabilityDto2);
    }

    public final TradabilityInfoDto copy(FuturesTradabilityDto base_tradability, FuturesTradabilityDto affiliate_tradability) {
        Intrinsics.checkNotNullParameter(base_tradability, "base_tradability");
        Intrinsics.checkNotNullParameter(affiliate_tradability, "affiliate_tradability");
        return new TradabilityInfoDto(new Surrogate(base_tradability, affiliate_tradability));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TradabilityInfo toProto() {
        return new TradabilityInfo((FuturesTradability) this.surrogate.getBase_tradability().toProto(), (FuturesTradability) this.surrogate.getAffiliate_tradability().toProto(), null, 4, null);
    }

    public String toString() {
        return "[TradabilityInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TradabilityInfoDto) && Intrinsics.areEqual(((TradabilityInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: TradabilityInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Surrogate;", "", "base_tradability", "Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "affiliate_tradability", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBase_tradability$annotations", "()V", "getBase_tradability", "()Lcom/robinhood/arsenal/proto/v1/idl/FuturesTradabilityDto;", "getAffiliate_tradability$annotations", "getAffiliate_tradability", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FuturesTradabilityDto affiliate_tradability;
        private final FuturesTradabilityDto base_tradability;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((FuturesTradabilityDto) null, (FuturesTradabilityDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FuturesTradabilityDto futuresTradabilityDto, FuturesTradabilityDto futuresTradabilityDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresTradabilityDto = surrogate.base_tradability;
            }
            if ((i & 2) != 0) {
                futuresTradabilityDto2 = surrogate.affiliate_tradability;
            }
            return surrogate.copy(futuresTradabilityDto, futuresTradabilityDto2);
        }

        @SerialName("affiliateTradability")
        @JsonAnnotations2(names = {"affiliate_tradability"})
        public static /* synthetic */ void getAffiliate_tradability$annotations() {
        }

        @SerialName("baseTradability")
        @JsonAnnotations2(names = {"base_tradability"})
        public static /* synthetic */ void getBase_tradability$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesTradabilityDto getBase_tradability() {
            return this.base_tradability;
        }

        /* renamed from: component2, reason: from getter */
        public final FuturesTradabilityDto getAffiliate_tradability() {
            return this.affiliate_tradability;
        }

        public final Surrogate copy(FuturesTradabilityDto base_tradability, FuturesTradabilityDto affiliate_tradability) {
            Intrinsics.checkNotNullParameter(base_tradability, "base_tradability");
            Intrinsics.checkNotNullParameter(affiliate_tradability, "affiliate_tradability");
            return new Surrogate(base_tradability, affiliate_tradability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.base_tradability == surrogate.base_tradability && this.affiliate_tradability == surrogate.affiliate_tradability;
        }

        public int hashCode() {
            return (this.base_tradability.hashCode() * 31) + this.affiliate_tradability.hashCode();
        }

        public String toString() {
            return "Surrogate(base_tradability=" + this.base_tradability + ", affiliate_tradability=" + this.affiliate_tradability + ")";
        }

        /* compiled from: TradabilityInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TradabilityInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FuturesTradabilityDto futuresTradabilityDto, FuturesTradabilityDto futuresTradabilityDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.base_tradability = (i & 1) == 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto;
            if ((i & 2) == 0) {
                this.affiliate_tradability = FuturesTradabilityDto.INSTANCE.getZeroValue();
            } else {
                this.affiliate_tradability = futuresTradabilityDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            FuturesTradabilityDto futuresTradabilityDto = self.base_tradability;
            FuturesTradabilityDto.Companion companion = FuturesTradabilityDto.INSTANCE;
            if (futuresTradabilityDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FuturesTradabilityDto.Serializer.INSTANCE, self.base_tradability);
            }
            if (self.affiliate_tradability != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, FuturesTradabilityDto.Serializer.INSTANCE, self.affiliate_tradability);
            }
        }

        public Surrogate(FuturesTradabilityDto base_tradability, FuturesTradabilityDto affiliate_tradability) {
            Intrinsics.checkNotNullParameter(base_tradability, "base_tradability");
            Intrinsics.checkNotNullParameter(affiliate_tradability, "affiliate_tradability");
            this.base_tradability = base_tradability;
            this.affiliate_tradability = affiliate_tradability;
        }

        public final FuturesTradabilityDto getBase_tradability() {
            return this.base_tradability;
        }

        public /* synthetic */ Surrogate(FuturesTradabilityDto futuresTradabilityDto, FuturesTradabilityDto futuresTradabilityDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto, (i & 2) != 0 ? FuturesTradabilityDto.INSTANCE.getZeroValue() : futuresTradabilityDto2);
        }

        public final FuturesTradabilityDto getAffiliate_tradability() {
            return this.affiliate_tradability;
        }
    }

    /* compiled from: TradabilityInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<TradabilityInfoDto, TradabilityInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradabilityInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TradabilityInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TradabilityInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) TradabilityInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TradabilityInfo> getProtoAdapter() {
            return TradabilityInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TradabilityInfoDto getZeroValue() {
            return TradabilityInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TradabilityInfoDto fromProto(TradabilityInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FuturesTradabilityDto.Companion companion = FuturesTradabilityDto.INSTANCE;
            return new TradabilityInfoDto(new Surrogate(companion.fromProto(proto.getBase_tradability()), companion.fromProto(proto.getAffiliate_tradability())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.TradabilityInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradabilityInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TradabilityInfoDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TradabilityInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TradabilityInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.TradabilityInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TradabilityInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TradabilityInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TradabilityInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: TradabilityInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/TradabilityInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.TradabilityInfoDto";
        }
    }
}
