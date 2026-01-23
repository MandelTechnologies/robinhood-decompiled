package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FeeSchemeDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: FeeInfoDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0006\u0010\u0012JN\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\tH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00060"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/FeeInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/FeeInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/FeeInfoDto$Surrogate;)V", "root_symbol", "", "fee_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "effective_from_date", "Lcom/robinhood/rosetta/common/DateDto;", "effective_through_date", "id", "fee_scheme", "Lcom/robinhood/ceres/v1/FeeSchemeDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeSchemeDto;)V", "getRoot_symbol", "()Ljava/lang/String;", "getFee_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getEffective_from_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getEffective_through_date", "getId", "getFee_scheme", "()Lcom/robinhood/ceres/v1/FeeSchemeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class FeeInfoDto implements Dto3<FeeInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FeeInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FeeInfoDto, FeeInfo>> binaryBase64Serializer$delegate;
    private static final FeeInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FeeInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FeeInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRoot_symbol() {
        return this.surrogate.getRoot_symbol();
    }

    public final MoneyDto getFee_amount() {
        return this.surrogate.getFee_amount();
    }

    public final DateDto getEffective_from_date() {
        return this.surrogate.getEffective_from_date();
    }

    public final DateDto getEffective_through_date() {
        return this.surrogate.getEffective_through_date();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final FeeSchemeDto getFee_scheme() {
        return this.surrogate.getFee_scheme();
    }

    public /* synthetic */ FeeInfoDto(String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : dateDto, (i & 8) != 0 ? null : dateDto2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : feeSchemeDto);
    }

    public FeeInfoDto(String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto) {
        this(new Surrogate(str, moneyDto, dateDto, dateDto2, str2, feeSchemeDto));
    }

    public static /* synthetic */ FeeInfoDto copy$default(FeeInfoDto feeInfoDto, String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feeInfoDto.surrogate.getRoot_symbol();
        }
        if ((i & 2) != 0) {
            moneyDto = feeInfoDto.surrogate.getFee_amount();
        }
        if ((i & 4) != 0) {
            dateDto = feeInfoDto.surrogate.getEffective_from_date();
        }
        if ((i & 8) != 0) {
            dateDto2 = feeInfoDto.surrogate.getEffective_through_date();
        }
        if ((i & 16) != 0) {
            str2 = feeInfoDto.surrogate.getId();
        }
        if ((i & 32) != 0) {
            feeSchemeDto = feeInfoDto.surrogate.getFee_scheme();
        }
        String str3 = str2;
        FeeSchemeDto feeSchemeDto2 = feeSchemeDto;
        return feeInfoDto.copy(str, moneyDto, dateDto, dateDto2, str3, feeSchemeDto2);
    }

    public final FeeInfoDto copy(String root_symbol, MoneyDto fee_amount, DateDto effective_from_date, DateDto effective_through_date, String id, FeeSchemeDto fee_scheme) {
        return new FeeInfoDto(new Surrogate(root_symbol, fee_amount, effective_from_date, effective_through_date, id, fee_scheme));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FeeInfo toProto() {
        String root_symbol = this.surrogate.getRoot_symbol();
        MoneyDto fee_amount = this.surrogate.getFee_amount();
        Money proto = fee_amount != null ? fee_amount.toProto() : null;
        DateDto effective_from_date = this.surrogate.getEffective_from_date();
        Date proto2 = effective_from_date != null ? effective_from_date.toProto() : null;
        DateDto effective_through_date = this.surrogate.getEffective_through_date();
        Date proto3 = effective_through_date != null ? effective_through_date.toProto() : null;
        String id = this.surrogate.getId();
        FeeSchemeDto fee_scheme = this.surrogate.getFee_scheme();
        return new FeeInfo(root_symbol, proto, proto2, proto3, id, fee_scheme != null ? (FeeScheme) fee_scheme.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[FeeInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FeeInfoDto) && Intrinsics.areEqual(((FeeInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: FeeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006:"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfoDto$Surrogate;", "", "root_symbol", "", "fee_amount", "Lcom/robinhood/rosetta/common/MoneyDto;", "effective_from_date", "Lcom/robinhood/rosetta/common/DateDto;", "effective_through_date", "id", "fee_scheme", "Lcom/robinhood/ceres/v1/FeeSchemeDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeSchemeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/FeeSchemeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRoot_symbol$annotations", "()V", "getRoot_symbol", "()Ljava/lang/String;", "getFee_amount$annotations", "getFee_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getEffective_from_date$annotations", "getEffective_from_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getEffective_through_date$annotations", "getEffective_through_date", "getId$annotations", "getId", "getFee_scheme$annotations", "getFee_scheme", "()Lcom/robinhood/ceres/v1/FeeSchemeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DateDto effective_from_date;
        private final DateDto effective_through_date;
        private final MoneyDto fee_amount;
        private final FeeSchemeDto fee_scheme;
        private final String id;
        private final String root_symbol;

        public Surrogate() {
            this((String) null, (MoneyDto) null, (DateDto) null, (DateDto) null, (String) null, (FeeSchemeDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.root_symbol;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.fee_amount;
            }
            if ((i & 4) != 0) {
                dateDto = surrogate.effective_from_date;
            }
            if ((i & 8) != 0) {
                dateDto2 = surrogate.effective_through_date;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.id;
            }
            if ((i & 32) != 0) {
                feeSchemeDto = surrogate.fee_scheme;
            }
            String str3 = str2;
            FeeSchemeDto feeSchemeDto2 = feeSchemeDto;
            return surrogate.copy(str, moneyDto, dateDto, dateDto2, str3, feeSchemeDto2);
        }

        @SerialName("effectiveFromDate")
        @JsonAnnotations2(names = {"effective_from_date"})
        public static /* synthetic */ void getEffective_from_date$annotations() {
        }

        @SerialName("effectiveThroughDate")
        @JsonAnnotations2(names = {"effective_through_date"})
        public static /* synthetic */ void getEffective_through_date$annotations() {
        }

        @SerialName("feeAmount")
        @JsonAnnotations2(names = {"fee_amount"})
        public static /* synthetic */ void getFee_amount$annotations() {
        }

        @SerialName("feeScheme")
        @JsonAnnotations2(names = {"fee_scheme"})
        public static /* synthetic */ void getFee_scheme$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("rootSymbol")
        @JsonAnnotations2(names = {"root_symbol"})
        public static /* synthetic */ void getRoot_symbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoot_symbol() {
            return this.root_symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getFee_amount() {
            return this.fee_amount;
        }

        /* renamed from: component3, reason: from getter */
        public final DateDto getEffective_from_date() {
            return this.effective_from_date;
        }

        /* renamed from: component4, reason: from getter */
        public final DateDto getEffective_through_date() {
            return this.effective_through_date;
        }

        /* renamed from: component5, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component6, reason: from getter */
        public final FeeSchemeDto getFee_scheme() {
            return this.fee_scheme;
        }

        public final Surrogate copy(String root_symbol, MoneyDto fee_amount, DateDto effective_from_date, DateDto effective_through_date, String id, FeeSchemeDto fee_scheme) {
            return new Surrogate(root_symbol, fee_amount, effective_from_date, effective_through_date, id, fee_scheme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.root_symbol, surrogate.root_symbol) && Intrinsics.areEqual(this.fee_amount, surrogate.fee_amount) && Intrinsics.areEqual(this.effective_from_date, surrogate.effective_from_date) && Intrinsics.areEqual(this.effective_through_date, surrogate.effective_through_date) && Intrinsics.areEqual(this.id, surrogate.id) && this.fee_scheme == surrogate.fee_scheme;
        }

        public int hashCode() {
            String str = this.root_symbol;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            MoneyDto moneyDto = this.fee_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            DateDto dateDto = this.effective_from_date;
            int iHashCode3 = (iHashCode2 + (dateDto == null ? 0 : dateDto.hashCode())) * 31;
            DateDto dateDto2 = this.effective_through_date;
            int iHashCode4 = (iHashCode3 + (dateDto2 == null ? 0 : dateDto2.hashCode())) * 31;
            String str2 = this.id;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            FeeSchemeDto feeSchemeDto = this.fee_scheme;
            return iHashCode5 + (feeSchemeDto != null ? feeSchemeDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(root_symbol=" + this.root_symbol + ", fee_amount=" + this.fee_amount + ", effective_from_date=" + this.effective_from_date + ", effective_through_date=" + this.effective_through_date + ", id=" + this.id + ", fee_scheme=" + this.fee_scheme + ")";
        }

        /* compiled from: FeeInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeInfoDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FeeInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.root_symbol = null;
            } else {
                this.root_symbol = str;
            }
            if ((i & 2) == 0) {
                this.fee_amount = null;
            } else {
                this.fee_amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.effective_from_date = null;
            } else {
                this.effective_from_date = dateDto;
            }
            if ((i & 8) == 0) {
                this.effective_through_date = null;
            } else {
                this.effective_through_date = dateDto2;
            }
            if ((i & 16) == 0) {
                this.id = null;
            } else {
                this.id = str2;
            }
            if ((i & 32) == 0) {
                this.fee_scheme = null;
            } else {
                this.fee_scheme = feeSchemeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.root_symbol;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            MoneyDto moneyDto = self.fee_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            DateDto dateDto = self.effective_from_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DateDto.Serializer.INSTANCE, dateDto);
            }
            DateDto dateDto2 = self.effective_through_date;
            if (dateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DateDto.Serializer.INSTANCE, dateDto2);
            }
            String str2 = self.id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
            }
            FeeSchemeDto feeSchemeDto = self.fee_scheme;
            if (feeSchemeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FeeSchemeDto.Serializer.INSTANCE, feeSchemeDto);
            }
        }

        public Surrogate(String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto) {
            this.root_symbol = str;
            this.fee_amount = moneyDto;
            this.effective_from_date = dateDto;
            this.effective_through_date = dateDto2;
            this.id = str2;
            this.fee_scheme = feeSchemeDto;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, DateDto dateDto, DateDto dateDto2, String str2, FeeSchemeDto feeSchemeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : dateDto, (i & 8) != 0 ? null : dateDto2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : feeSchemeDto);
        }

        public final String getRoot_symbol() {
            return this.root_symbol;
        }

        public final MoneyDto getFee_amount() {
            return this.fee_amount;
        }

        public final DateDto getEffective_from_date() {
            return this.effective_from_date;
        }

        public final DateDto getEffective_through_date() {
            return this.effective_through_date;
        }

        public final String getId() {
            return this.id;
        }

        public final FeeSchemeDto getFee_scheme() {
            return this.fee_scheme;
        }
    }

    /* compiled from: FeeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/FeeInfoDto;", "Lcom/robinhood/ceres/v1/FeeInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/FeeInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FeeInfoDto, FeeInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeeInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FeeInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) FeeInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FeeInfo> getProtoAdapter() {
            return FeeInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeInfoDto getZeroValue() {
            return FeeInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FeeInfoDto fromProto(FeeInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String root_symbol = proto.getRoot_symbol();
            Money fee_amount = proto.getFee_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = fee_amount != null ? MoneyDto.INSTANCE.fromProto(fee_amount) : null;
            Date effective_from_date = proto.getEffective_from_date();
            DateDto dateDtoFromProto = effective_from_date != null ? DateDto.INSTANCE.fromProto(effective_from_date) : null;
            Date effective_through_date = proto.getEffective_through_date();
            DateDto dateDtoFromProto2 = effective_through_date != null ? DateDto.INSTANCE.fromProto(effective_through_date) : null;
            String id = proto.getId();
            FeeScheme fee_scheme = proto.getFee_scheme();
            return new FeeInfoDto(new Surrogate(root_symbol, moneyDtoFromProto, dateDtoFromProto, dateDtoFromProto2, id, fee_scheme != null ? FeeSchemeDto.INSTANCE.fromProto(fee_scheme) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.FeeInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FeeInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FeeInfoDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FeeInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/FeeInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/FeeInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<FeeInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.FeeInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FeeInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FeeInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FeeInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FeeInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.FeeInfoDto";
        }
    }
}
