package com.robinhood.prediction_markets.proto.p361v1.combo;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboProposal;
import com.robinhood.prediction_markets.proto.p361v1.idl.ComboProposalDto;
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

/* compiled from: GetComboProposalsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Surrogate;)V", "best_yes_bid", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;", "best_no_bid", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;)V", "getBest_yes_bid", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;", "getBest_no_bid", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class GetComboProposalsResponseDto implements Dto3<GetComboProposalsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetComboProposalsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetComboProposalsResponseDto, GetComboProposalsResponse>> binaryBase64Serializer$delegate;
    private static final GetComboProposalsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetComboProposalsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetComboProposalsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ComboProposalDto getBest_yes_bid() {
        return this.surrogate.getBest_yes_bid();
    }

    public final ComboProposalDto getBest_no_bid() {
        return this.surrogate.getBest_no_bid();
    }

    public GetComboProposalsResponseDto(ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2) {
        this(new Surrogate(comboProposalDto, comboProposalDto2));
    }

    public /* synthetic */ GetComboProposalsResponseDto(ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comboProposalDto, (i & 2) != 0 ? null : comboProposalDto2);
    }

    public static /* synthetic */ GetComboProposalsResponseDto copy$default(GetComboProposalsResponseDto getComboProposalsResponseDto, ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            comboProposalDto = getComboProposalsResponseDto.surrogate.getBest_yes_bid();
        }
        if ((i & 2) != 0) {
            comboProposalDto2 = getComboProposalsResponseDto.surrogate.getBest_no_bid();
        }
        return getComboProposalsResponseDto.copy(comboProposalDto, comboProposalDto2);
    }

    public final GetComboProposalsResponseDto copy(ComboProposalDto best_yes_bid, ComboProposalDto best_no_bid) {
        return new GetComboProposalsResponseDto(new Surrogate(best_yes_bid, best_no_bid));
    }

    @Override // com.robinhood.idl.Dto
    public GetComboProposalsResponse toProto() {
        ComboProposalDto best_yes_bid = this.surrogate.getBest_yes_bid();
        ComboProposal proto = best_yes_bid != null ? best_yes_bid.toProto() : null;
        ComboProposalDto best_no_bid = this.surrogate.getBest_no_bid();
        return new GetComboProposalsResponse(proto, best_no_bid != null ? best_no_bid.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetComboProposalsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetComboProposalsResponseDto) && Intrinsics.areEqual(((GetComboProposalsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetComboProposalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Surrogate;", "", "best_yes_bid", "Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;", "best_no_bid", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getBest_yes_bid$annotations", "()V", "getBest_yes_bid", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ComboProposalDto;", "getBest_no_bid$annotations", "getBest_no_bid", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ComboProposalDto best_no_bid;
        private final ComboProposalDto best_yes_bid;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ComboProposalDto) null, (ComboProposalDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                comboProposalDto = surrogate.best_yes_bid;
            }
            if ((i & 2) != 0) {
                comboProposalDto2 = surrogate.best_no_bid;
            }
            return surrogate.copy(comboProposalDto, comboProposalDto2);
        }

        @SerialName("bestNoBid")
        @JsonAnnotations2(names = {"best_no_bid"})
        public static /* synthetic */ void getBest_no_bid$annotations() {
        }

        @SerialName("bestYesBid")
        @JsonAnnotations2(names = {"best_yes_bid"})
        public static /* synthetic */ void getBest_yes_bid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ComboProposalDto getBest_yes_bid() {
            return this.best_yes_bid;
        }

        /* renamed from: component2, reason: from getter */
        public final ComboProposalDto getBest_no_bid() {
            return this.best_no_bid;
        }

        public final Surrogate copy(ComboProposalDto best_yes_bid, ComboProposalDto best_no_bid) {
            return new Surrogate(best_yes_bid, best_no_bid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.best_yes_bid, surrogate.best_yes_bid) && Intrinsics.areEqual(this.best_no_bid, surrogate.best_no_bid);
        }

        public int hashCode() {
            ComboProposalDto comboProposalDto = this.best_yes_bid;
            int iHashCode = (comboProposalDto == null ? 0 : comboProposalDto.hashCode()) * 31;
            ComboProposalDto comboProposalDto2 = this.best_no_bid;
            return iHashCode + (comboProposalDto2 != null ? comboProposalDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(best_yes_bid=" + this.best_yes_bid + ", best_no_bid=" + this.best_no_bid + ")";
        }

        /* compiled from: GetComboProposalsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetComboProposalsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.best_yes_bid = null;
            } else {
                this.best_yes_bid = comboProposalDto;
            }
            if ((i & 2) == 0) {
                this.best_no_bid = null;
            } else {
                this.best_no_bid = comboProposalDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ComboProposalDto comboProposalDto = self.best_yes_bid;
            if (comboProposalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ComboProposalDto.Serializer.INSTANCE, comboProposalDto);
            }
            ComboProposalDto comboProposalDto2 = self.best_no_bid;
            if (comboProposalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ComboProposalDto.Serializer.INSTANCE, comboProposalDto2);
            }
        }

        public Surrogate(ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2) {
            this.best_yes_bid = comboProposalDto;
            this.best_no_bid = comboProposalDto2;
        }

        public /* synthetic */ Surrogate(ComboProposalDto comboProposalDto, ComboProposalDto comboProposalDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : comboProposalDto, (i & 2) != 0 ? null : comboProposalDto2);
        }

        public final ComboProposalDto getBest_yes_bid() {
            return this.best_yes_bid;
        }

        public final ComboProposalDto getBest_no_bid() {
            return this.best_no_bid;
        }
    }

    /* compiled from: GetComboProposalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetComboProposalsResponseDto, GetComboProposalsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetComboProposalsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetComboProposalsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetComboProposalsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetComboProposalsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetComboProposalsResponse> getProtoAdapter() {
            return GetComboProposalsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetComboProposalsResponseDto getZeroValue() {
            return GetComboProposalsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetComboProposalsResponseDto fromProto(GetComboProposalsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ComboProposal best_yes_bid = proto.getBest_yes_bid();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ComboProposalDto comboProposalDtoFromProto = best_yes_bid != null ? ComboProposalDto.INSTANCE.fromProto(best_yes_bid) : null;
            ComboProposal best_no_bid = proto.getBest_no_bid();
            return new GetComboProposalsResponseDto(new Surrogate(comboProposalDtoFromProto, best_no_bid != null ? ComboProposalDto.INSTANCE.fromProto(best_no_bid) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.combo.GetComboProposalsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetComboProposalsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetComboProposalsResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetComboProposalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetComboProposalsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.GetComboProposalsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetComboProposalsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetComboProposalsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetComboProposalsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetComboProposalsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/combo/GetComboProposalsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.combo.GetComboProposalsResponseDto";
        }
    }
}
