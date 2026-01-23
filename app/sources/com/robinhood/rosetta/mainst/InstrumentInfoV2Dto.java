package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.mainst.CurrencyDetailsDto;
import com.robinhood.rosetta.mainst.CurrencyPairDetailsDto;
import com.robinhood.rosetta.mainst.EquityDetailsDto;
import com.robinhood.rosetta.mainst.OptionDetailsDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import org.bouncycastle.i18n.ErrorBundle;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;

/* compiled from: InstrumentInfoV2Dto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000556789B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ(\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020(H\u0016J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020.H\u0016J\b\u00104\u001a\u00020.H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "type", "Lrosetta/mainst/InstrumentTypeDto;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getType", "()Lrosetta/mainst/InstrumentTypeDto;", "getDetails", "()Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "equity_details", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "getEquity_details", "()Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "option_details", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "getOption_details", "()Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "currency_details", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "getCurrency_details", "()Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "currency_pair_details", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DetailsDto", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class InstrumentInfoV2Dto implements Dto3<InstrumentInfoV2>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InstrumentInfoV2Dto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InstrumentInfoV2Dto, InstrumentInfoV2>> binaryBase64Serializer$delegate;
    private static final InstrumentInfoV2Dto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InstrumentInfoV2Dto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InstrumentInfoV2Dto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final InstrumentTypeDto getType() {
        return this.surrogate.getType();
    }

    public final DetailsDto getDetails() {
        if (this.surrogate.getEquity_details() != null) {
            return new DetailsDto.EquityDetails(this.surrogate.getEquity_details());
        }
        if (this.surrogate.getOption_details() != null) {
            return new DetailsDto.OptionDetails(this.surrogate.getOption_details());
        }
        if (this.surrogate.getCurrency_details() != null) {
            return new DetailsDto.CurrencyDetails(this.surrogate.getCurrency_details());
        }
        if (this.surrogate.getCurrency_pair_details() != null) {
            return new DetailsDto.CurrencyPairDetails(this.surrogate.getCurrency_pair_details());
        }
        return null;
    }

    public final EquityDetailsDto getEquity_details() {
        return this.surrogate.getEquity_details();
    }

    public final OptionDetailsDto getOption_details() {
        return this.surrogate.getOption_details();
    }

    public final CurrencyDetailsDto getCurrency_details() {
        return this.surrogate.getCurrency_details();
    }

    public final CurrencyPairDetailsDto getCurrency_pair_details() {
        return this.surrogate.getCurrency_pair_details();
    }

    public /* synthetic */ InstrumentInfoV2Dto(UUIDDto uUIDDto, InstrumentTypeDto instrumentTypeDto, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 4) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InstrumentInfoV2Dto(UUIDDto uUIDDto, InstrumentTypeDto type2, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(type2, "type");
        DetailsDto.EquityDetails equityDetails = detailsDto instanceof DetailsDto.EquityDetails ? (DetailsDto.EquityDetails) detailsDto : null;
        EquityDetailsDto value = equityDetails != null ? equityDetails.getValue() : null;
        DetailsDto.OptionDetails optionDetails = detailsDto instanceof DetailsDto.OptionDetails ? (DetailsDto.OptionDetails) detailsDto : null;
        OptionDetailsDto value2 = optionDetails != null ? optionDetails.getValue() : null;
        DetailsDto.CurrencyDetails currencyDetails = detailsDto instanceof DetailsDto.CurrencyDetails ? (DetailsDto.CurrencyDetails) detailsDto : null;
        CurrencyDetailsDto value3 = currencyDetails != null ? currencyDetails.getValue() : null;
        DetailsDto.CurrencyPairDetails currencyPairDetails = detailsDto instanceof DetailsDto.CurrencyPairDetails ? (DetailsDto.CurrencyPairDetails) detailsDto : null;
        this(new Surrogate(uUIDDto, type2, value, value2, value3, currencyPairDetails != null ? currencyPairDetails.getValue() : null));
    }

    public static /* synthetic */ InstrumentInfoV2Dto copy$default(InstrumentInfoV2Dto instrumentInfoV2Dto, UUIDDto uUIDDto, InstrumentTypeDto instrumentTypeDto, DetailsDto detailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            uUIDDto = instrumentInfoV2Dto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            instrumentTypeDto = instrumentInfoV2Dto.surrogate.getType();
        }
        if ((i & 4) != 0) {
            detailsDto = instrumentInfoV2Dto.getDetails();
        }
        return instrumentInfoV2Dto.copy(uUIDDto, instrumentTypeDto, detailsDto);
    }

    public final InstrumentInfoV2Dto copy(UUIDDto id, InstrumentTypeDto type2, DetailsDto details) {
        Intrinsics.checkNotNullParameter(type2, "type");
        DetailsDto.EquityDetails equityDetails = details instanceof DetailsDto.EquityDetails ? (DetailsDto.EquityDetails) details : null;
        EquityDetailsDto value = equityDetails != null ? equityDetails.getValue() : null;
        DetailsDto.OptionDetails optionDetails = details instanceof DetailsDto.OptionDetails ? (DetailsDto.OptionDetails) details : null;
        OptionDetailsDto value2 = optionDetails != null ? optionDetails.getValue() : null;
        DetailsDto.CurrencyDetails currencyDetails = details instanceof DetailsDto.CurrencyDetails ? (DetailsDto.CurrencyDetails) details : null;
        CurrencyDetailsDto value3 = currencyDetails != null ? currencyDetails.getValue() : null;
        DetailsDto.CurrencyPairDetails currencyPairDetails = details instanceof DetailsDto.CurrencyPairDetails ? (DetailsDto.CurrencyPairDetails) details : null;
        return new InstrumentInfoV2Dto(new Surrogate(id, type2, value, value2, value3, currencyPairDetails != null ? currencyPairDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InstrumentInfoV2 toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getType().toProto();
        EquityDetailsDto equity_details = this.surrogate.getEquity_details();
        EquityDetails proto2 = equity_details != null ? equity_details.toProto() : null;
        OptionDetailsDto option_details = this.surrogate.getOption_details();
        OptionDetails proto3 = option_details != null ? option_details.toProto() : null;
        CurrencyDetailsDto currency_details = this.surrogate.getCurrency_details();
        CurrencyDetails proto4 = currency_details != null ? currency_details.toProto() : null;
        CurrencyPairDetailsDto currency_pair_details = this.surrogate.getCurrency_pair_details();
        return new InstrumentInfoV2(proto, instrumentType, proto2, proto3, proto4, currency_pair_details != null ? currency_pair_details.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[InstrumentInfoV2Dto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InstrumentInfoV2Dto) && Intrinsics.areEqual(((InstrumentInfoV2Dto) other).surrogate, this.surrogate);
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
    /* compiled from: InstrumentInfoV2Dto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002=>BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0011HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006?"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "type", "Lrosetta/mainst/InstrumentTypeDto;", "equity_details", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "option_details", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "currency_details", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "currency_pair_details", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/EquityDetailsDto;Lcom/robinhood/rosetta/mainst/OptionDetailsDto;Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/EquityDetailsDto;Lcom/robinhood/rosetta/mainst/OptionDetailsDto;Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getType$annotations", "getType", "()Lrosetta/mainst/InstrumentTypeDto;", "getEquity_details$annotations", "getEquity_details", "()Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "getOption_details$annotations", "getOption_details", "()Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "getCurrency_details$annotations", "getCurrency_details", "()Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "getCurrency_pair_details$annotations", "getCurrency_pair_details", "()Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CurrencyDetailsDto currency_details;
        private final CurrencyPairDetailsDto currency_pair_details;
        private final EquityDetailsDto equity_details;
        private final UUIDDto id;
        private final OptionDetailsDto option_details;
        private final InstrumentTypeDto type;

        public Surrogate() {
            this((UUIDDto) null, (InstrumentTypeDto) null, (EquityDetailsDto) null, (OptionDetailsDto) null, (CurrencyDetailsDto) null, (CurrencyPairDetailsDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, InstrumentTypeDto instrumentTypeDto, EquityDetailsDto equityDetailsDto, OptionDetailsDto optionDetailsDto, CurrencyDetailsDto currencyDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                uUIDDto = surrogate.id;
            }
            if ((i & 2) != 0) {
                instrumentTypeDto = surrogate.type;
            }
            if ((i & 4) != 0) {
                equityDetailsDto = surrogate.equity_details;
            }
            if ((i & 8) != 0) {
                optionDetailsDto = surrogate.option_details;
            }
            if ((i & 16) != 0) {
                currencyDetailsDto = surrogate.currency_details;
            }
            if ((i & 32) != 0) {
                currencyPairDetailsDto = surrogate.currency_pair_details;
            }
            CurrencyDetailsDto currencyDetailsDto2 = currencyDetailsDto;
            CurrencyPairDetailsDto currencyPairDetailsDto2 = currencyPairDetailsDto;
            return surrogate.copy(uUIDDto, instrumentTypeDto, equityDetailsDto, optionDetailsDto, currencyDetailsDto2, currencyPairDetailsDto2);
        }

        @SerialName("currencyDetails")
        @JsonAnnotations2(names = {"currency_details"})
        public static /* synthetic */ void getCurrency_details$annotations() {
        }

        @SerialName("currencyPairDetails")
        @JsonAnnotations2(names = {"currency_pair_details"})
        public static /* synthetic */ void getCurrency_pair_details$annotations() {
        }

        @SerialName("equityDetails")
        @JsonAnnotations2(names = {"equity_details"})
        public static /* synthetic */ void getEquity_details$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("optionDetails")
        @JsonAnnotations2(names = {"option_details"})
        public static /* synthetic */ void getOption_details$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final InstrumentTypeDto getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final EquityDetailsDto getEquity_details() {
            return this.equity_details;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionDetailsDto getOption_details() {
            return this.option_details;
        }

        /* renamed from: component5, reason: from getter */
        public final CurrencyDetailsDto getCurrency_details() {
            return this.currency_details;
        }

        /* renamed from: component6, reason: from getter */
        public final CurrencyPairDetailsDto getCurrency_pair_details() {
            return this.currency_pair_details;
        }

        public final Surrogate copy(UUIDDto id, InstrumentTypeDto type2, EquityDetailsDto equity_details, OptionDetailsDto option_details, CurrencyDetailsDto currency_details, CurrencyPairDetailsDto currency_pair_details) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Surrogate(id, type2, equity_details, option_details, currency_details, currency_pair_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.type == surrogate.type && Intrinsics.areEqual(this.equity_details, surrogate.equity_details) && Intrinsics.areEqual(this.option_details, surrogate.option_details) && Intrinsics.areEqual(this.currency_details, surrogate.currency_details) && Intrinsics.areEqual(this.currency_pair_details, surrogate.currency_pair_details);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (((uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31) + this.type.hashCode()) * 31;
            EquityDetailsDto equityDetailsDto = this.equity_details;
            int iHashCode2 = (iHashCode + (equityDetailsDto == null ? 0 : equityDetailsDto.hashCode())) * 31;
            OptionDetailsDto optionDetailsDto = this.option_details;
            int iHashCode3 = (iHashCode2 + (optionDetailsDto == null ? 0 : optionDetailsDto.hashCode())) * 31;
            CurrencyDetailsDto currencyDetailsDto = this.currency_details;
            int iHashCode4 = (iHashCode3 + (currencyDetailsDto == null ? 0 : currencyDetailsDto.hashCode())) * 31;
            CurrencyPairDetailsDto currencyPairDetailsDto = this.currency_pair_details;
            return iHashCode4 + (currencyPairDetailsDto != null ? currencyPairDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", type=" + this.type + ", equity_details=" + this.equity_details + ", option_details=" + this.option_details + ", currency_details=" + this.currency_details + ", currency_pair_details=" + this.currency_pair_details + ")";
        }

        /* compiled from: InstrumentInfoV2Dto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InstrumentInfoV2Dto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, InstrumentTypeDto instrumentTypeDto, EquityDetailsDto equityDetailsDto, OptionDetailsDto optionDetailsDto, CurrencyDetailsDto currencyDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.type = InstrumentTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = instrumentTypeDto;
            }
            if ((i & 4) == 0) {
                this.equity_details = null;
            } else {
                this.equity_details = equityDetailsDto;
            }
            if ((i & 8) == 0) {
                this.option_details = null;
            } else {
                this.option_details = optionDetailsDto;
            }
            if ((i & 16) == 0) {
                this.currency_details = null;
            } else {
                this.currency_details = currencyDetailsDto;
            }
            if ((i & 32) == 0) {
                this.currency_pair_details = null;
            } else {
                this.currency_pair_details = currencyPairDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            if (self.type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, InstrumentTypeDto.Serializer.INSTANCE, self.type);
            }
            EquityDetailsDto equityDetailsDto = self.equity_details;
            if (equityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, EquityDetailsDto.Serializer.INSTANCE, equityDetailsDto);
            }
            OptionDetailsDto optionDetailsDto = self.option_details;
            if (optionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, OptionDetailsDto.Serializer.INSTANCE, optionDetailsDto);
            }
            CurrencyDetailsDto currencyDetailsDto = self.currency_details;
            if (currencyDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CurrencyDetailsDto.Serializer.INSTANCE, currencyDetailsDto);
            }
            CurrencyPairDetailsDto currencyPairDetailsDto = self.currency_pair_details;
            if (currencyPairDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CurrencyPairDetailsDto.Serializer.INSTANCE, currencyPairDetailsDto);
            }
        }

        public Surrogate(UUIDDto uUIDDto, InstrumentTypeDto type2, EquityDetailsDto equityDetailsDto, OptionDetailsDto optionDetailsDto, CurrencyDetailsDto currencyDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.id = uUIDDto;
            this.type = type2;
            this.equity_details = equityDetailsDto;
            this.option_details = optionDetailsDto;
            this.currency_details = currencyDetailsDto;
            this.currency_pair_details = currencyPairDetailsDto;
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final InstrumentTypeDto getType() {
            return this.type;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, InstrumentTypeDto instrumentTypeDto, EquityDetailsDto equityDetailsDto, OptionDetailsDto optionDetailsDto, CurrencyDetailsDto currencyDetailsDto, CurrencyPairDetailsDto currencyPairDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uUIDDto, (i & 2) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i & 4) != 0 ? null : equityDetailsDto, (i & 8) != 0 ? null : optionDetailsDto, (i & 16) != 0 ? null : currencyDetailsDto, (i & 32) != 0 ? null : currencyPairDetailsDto);
        }

        public final EquityDetailsDto getEquity_details() {
            return this.equity_details;
        }

        public final OptionDetailsDto getOption_details() {
            return this.option_details;
        }

        public final CurrencyDetailsDto getCurrency_details() {
            return this.currency_details;
        }

        public final CurrencyPairDetailsDto getCurrency_pair_details() {
            return this.currency_pair_details;
        }
    }

    /* compiled from: InstrumentInfoV2Dto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InstrumentInfoV2Dto, InstrumentInfoV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InstrumentInfoV2Dto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentInfoV2Dto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InstrumentInfoV2Dto> getBinaryBase64Serializer() {
            return (KSerializer) InstrumentInfoV2Dto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InstrumentInfoV2> getProtoAdapter() {
            return InstrumentInfoV2.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentInfoV2Dto getZeroValue() {
            return InstrumentInfoV2Dto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InstrumentInfoV2Dto fromProto(InstrumentInfoV2 proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getType());
            EquityDetails equity_details = proto.getEquity_details();
            EquityDetailsDto equityDetailsDtoFromProto = equity_details != null ? EquityDetailsDto.INSTANCE.fromProto(equity_details) : null;
            OptionDetails option_details = proto.getOption_details();
            OptionDetailsDto optionDetailsDtoFromProto = option_details != null ? OptionDetailsDto.INSTANCE.fromProto(option_details) : null;
            CurrencyDetails currency_details = proto.getCurrency_details();
            CurrencyDetailsDto currencyDetailsDtoFromProto = currency_details != null ? CurrencyDetailsDto.INSTANCE.fromProto(currency_details) : null;
            CurrencyPairDetails currency_pair_details = proto.getCurrency_pair_details();
            return new InstrumentInfoV2Dto(new Surrogate(uUIDDtoFromProto, instrumentTypeDtoFromProto, equityDetailsDtoFromProto, optionDetailsDtoFromProto, currencyDetailsDtoFromProto, currency_pair_details != null ? CurrencyPairDetailsDto.INSTANCE.fromProto(currency_pair_details) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.InstrumentInfoV2Dto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstrumentInfoV2Dto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InstrumentInfoV2Dto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InstrumentInfoV2Dto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EquityDetails", "OptionDetails", "CurrencyDetails", "CurrencyPairDetails", "Companion", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$CurrencyDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$CurrencyPairDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$EquityDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$OptionDetails;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: InstrumentInfoV2Dto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$EquityDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/EquityDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/EquityDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquityDetails extends DetailsDto {
            private final EquityDetailsDto value;

            public static /* synthetic */ EquityDetails copy$default(EquityDetails equityDetails, EquityDetailsDto equityDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    equityDetailsDto = equityDetails.value;
                }
                return equityDetails.copy(equityDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final EquityDetailsDto getValue() {
                return this.value;
            }

            public final EquityDetails copy(EquityDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new EquityDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EquityDetails) && Intrinsics.areEqual(this.value, ((EquityDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EquityDetails(value=" + this.value + ")";
            }

            public final EquityDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EquityDetails(EquityDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: InstrumentInfoV2Dto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$OptionDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/OptionDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/OptionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OptionDetails extends DetailsDto {
            private final OptionDetailsDto value;

            public static /* synthetic */ OptionDetails copy$default(OptionDetails optionDetails, OptionDetailsDto optionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    optionDetailsDto = optionDetails.value;
                }
                return optionDetails.copy(optionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final OptionDetailsDto getValue() {
                return this.value;
            }

            public final OptionDetails copy(OptionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new OptionDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OptionDetails) && Intrinsics.areEqual(this.value, ((OptionDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OptionDetails(value=" + this.value + ")";
            }

            public final OptionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionDetails(OptionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: InstrumentInfoV2Dto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$CurrencyDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/CurrencyDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CurrencyDetails extends DetailsDto {
            private final CurrencyDetailsDto value;

            public static /* synthetic */ CurrencyDetails copy$default(CurrencyDetails currencyDetails, CurrencyDetailsDto currencyDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    currencyDetailsDto = currencyDetails.value;
                }
                return currencyDetails.copy(currencyDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CurrencyDetailsDto getValue() {
                return this.value;
            }

            public final CurrencyDetails copy(CurrencyDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CurrencyDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CurrencyDetails) && Intrinsics.areEqual(this.value, ((CurrencyDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CurrencyDetails(value=" + this.value + ")";
            }

            public final CurrencyDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CurrencyDetails(CurrencyDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: InstrumentInfoV2Dto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$CurrencyPairDetails;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/CurrencyPairDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CurrencyPairDetails extends DetailsDto {
            private final CurrencyPairDetailsDto value;

            public static /* synthetic */ CurrencyPairDetails copy$default(CurrencyPairDetails currencyPairDetails, CurrencyPairDetailsDto currencyPairDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    currencyPairDetailsDto = currencyPairDetails.value;
                }
                return currencyPairDetails.copy(currencyPairDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final CurrencyPairDetailsDto getValue() {
                return this.value;
            }

            public final CurrencyPairDetails copy(CurrencyPairDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new CurrencyPairDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CurrencyPairDetails) && Intrinsics.areEqual(this.value, ((CurrencyPairDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CurrencyPairDetails(value=" + this.value + ")";
            }

            public final CurrencyPairDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CurrencyPairDetails(CurrencyPairDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: InstrumentInfoV2Dto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$DetailsDto;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Companion implements Dto4.Creator<DetailsDto, InstrumentInfoV2> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<InstrumentInfoV2> getProtoAdapter() {
                return InstrumentInfoV2.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(InstrumentInfoV2 proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEquity_details() != null) {
                    return new EquityDetails(EquityDetailsDto.INSTANCE.fromProto(proto.getEquity_details()));
                }
                if (proto.getOption_details() != null) {
                    return new OptionDetails(OptionDetailsDto.INSTANCE.fromProto(proto.getOption_details()));
                }
                if (proto.getCurrency_details() != null) {
                    return new CurrencyDetails(CurrencyDetailsDto.INSTANCE.fromProto(proto.getCurrency_details()));
                }
                if (proto.getCurrency_pair_details() != null) {
                    return new CurrencyPairDetails(CurrencyPairDetailsDto.INSTANCE.fromProto(proto.getCurrency_pair_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: InstrumentInfoV2Dto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InstrumentInfoV2Dto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.InstrumentInfoV2", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InstrumentInfoV2Dto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InstrumentInfoV2Dto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InstrumentInfoV2Dto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InstrumentInfoV2Dto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.InstrumentInfoV2Dto";
        }
    }
}
