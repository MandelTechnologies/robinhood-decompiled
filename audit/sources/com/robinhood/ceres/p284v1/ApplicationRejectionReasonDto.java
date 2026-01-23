package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicationRejectionReasonDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001f B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006!"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/ApplicationRejectionReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "APPLICATION_REJECTION_REASON_UNSPECIFIED", "FUNDING_REQUIREMENT_NOT_MET", "TRADING_EXPERIENCE_NOT_MET", "FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS", "MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS", "INVALID_TAX_WITHHOLDING_CATEGORY", "MANUALLY_REJECTED", "TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS", "TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS", "NOT_A_US_CITIZEN", "AGE_TRADING_EXPERIENCE_INCONSISTENCY", "REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER", "FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS", "RISK_TOLERANCE_REQUIREMENT_NOT_MET", "SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET", "EXPERIENCE_SCORE_UNDER_5", "APPROPRIATENESS_SCORE_UNDER_35", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class ApplicationRejectionReasonDto implements Dto2<ApplicationRejectionReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApplicationRejectionReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ApplicationRejectionReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ApplicationRejectionReasonDto, ApplicationRejectionReason>> binaryBase64Serializer$delegate;
    public static final ApplicationRejectionReasonDto APPLICATION_REJECTION_REASON_UNSPECIFIED = new ApplicationRejectionReasonDto("APPLICATION_REJECTION_REASON_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.APPLICATION_REJECTION_REASON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.APPLICATION_REJECTION_REASON_UNSPECIFIED;
        }
    };
    public static final ApplicationRejectionReasonDto FUNDING_REQUIREMENT_NOT_MET = new ApplicationRejectionReasonDto("FUNDING_REQUIREMENT_NOT_MET", 1) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.FUNDING_REQUIREMENT_NOT_MET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.FUNDING_REQUIREMENT_NOT_MET;
        }
    };
    public static final ApplicationRejectionReasonDto TRADING_EXPERIENCE_NOT_MET = new ApplicationRejectionReasonDto("TRADING_EXPERIENCE_NOT_MET", 2) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.TRADING_EXPERIENCE_NOT_MET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.TRADING_EXPERIENCE_NOT_MET;
        }
    };
    public static final ApplicationRejectionReasonDto FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS = new ApplicationRejectionReasonDto("FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS", 3) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS;
        }
    };
    public static final ApplicationRejectionReasonDto MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS = new ApplicationRejectionReasonDto("MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS", 4) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS;
        }
    };
    public static final ApplicationRejectionReasonDto INVALID_TAX_WITHHOLDING_CATEGORY = new ApplicationRejectionReasonDto("INVALID_TAX_WITHHOLDING_CATEGORY", 5) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.INVALID_TAX_WITHHOLDING_CATEGORY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.INVALID_TAX_WITHHOLDING_CATEGORY;
        }
    };
    public static final ApplicationRejectionReasonDto MANUALLY_REJECTED = new ApplicationRejectionReasonDto("MANUALLY_REJECTED", 6) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.MANUALLY_REJECTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.MANUALLY_REJECTED;
        }
    };
    public static final ApplicationRejectionReasonDto TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS = new ApplicationRejectionReasonDto("TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS", 7) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS;
        }
    };
    public static final ApplicationRejectionReasonDto TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS = new ApplicationRejectionReasonDto("TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS", 8) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS;
        }
    };
    public static final ApplicationRejectionReasonDto NOT_A_US_CITIZEN = new ApplicationRejectionReasonDto("NOT_A_US_CITIZEN", 9) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.NOT_A_US_CITIZEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.NOT_A_US_CITIZEN;
        }
    };
    public static final ApplicationRejectionReasonDto AGE_TRADING_EXPERIENCE_INCONSISTENCY = new ApplicationRejectionReasonDto("AGE_TRADING_EXPERIENCE_INCONSISTENCY", 10) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.AGE_TRADING_EXPERIENCE_INCONSISTENCY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.AGE_TRADING_EXPERIENCE_INCONSISTENCY;
        }
    };
    public static final ApplicationRejectionReasonDto REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER = new ApplicationRejectionReasonDto("REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER", 11) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
        }
    };
    public static final ApplicationRejectionReasonDto FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS = new ApplicationRejectionReasonDto("FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS", 12) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS;
        }
    };
    public static final ApplicationRejectionReasonDto RISK_TOLERANCE_REQUIREMENT_NOT_MET = new ApplicationRejectionReasonDto("RISK_TOLERANCE_REQUIREMENT_NOT_MET", 13) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.RISK_TOLERANCE_REQUIREMENT_NOT_MET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.RISK_TOLERANCE_REQUIREMENT_NOT_MET;
        }
    };
    public static final ApplicationRejectionReasonDto SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET = new ApplicationRejectionReasonDto("SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET", 14) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET;
        }
    };
    public static final ApplicationRejectionReasonDto EXPERIENCE_SCORE_UNDER_5 = new ApplicationRejectionReasonDto("EXPERIENCE_SCORE_UNDER_5", 15) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.EXPERIENCE_SCORE_UNDER_5
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.EXPERIENCE_SCORE_UNDER_5;
        }
    };
    public static final ApplicationRejectionReasonDto APPROPRIATENESS_SCORE_UNDER_35 = new ApplicationRejectionReasonDto("APPROPRIATENESS_SCORE_UNDER_35", 16) { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto.APPROPRIATENESS_SCORE_UNDER_35
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ApplicationRejectionReason toProto() {
            return ApplicationRejectionReason.APPROPRIATENESS_SCORE_UNDER_35;
        }
    };

    private static final /* synthetic */ ApplicationRejectionReasonDto[] $values() {
        return new ApplicationRejectionReasonDto[]{APPLICATION_REJECTION_REASON_UNSPECIFIED, FUNDING_REQUIREMENT_NOT_MET, TRADING_EXPERIENCE_NOT_MET, FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS, MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS, INVALID_TAX_WITHHOLDING_CATEGORY, MANUALLY_REJECTED, TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS, TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS, NOT_A_US_CITIZEN, AGE_TRADING_EXPERIENCE_INCONSISTENCY, REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER, FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS, RISK_TOLERANCE_REQUIREMENT_NOT_MET, SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET, EXPERIENCE_SCORE_UNDER_5, APPROPRIATENESS_SCORE_UNDER_35};
    }

    public /* synthetic */ ApplicationRejectionReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ApplicationRejectionReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ApplicationRejectionReasonDto(String str, int i) {
    }

    static {
        ApplicationRejectionReasonDto[] applicationRejectionReasonDtoArr$values = $values();
        $VALUES = applicationRejectionReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(applicationRejectionReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ApplicationRejectionReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApplicationRejectionReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ApplicationRejectionReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "Lcom/robinhood/ceres/v1/ApplicationRejectionReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ApplicationRejectionReasonDto, ApplicationRejectionReason> {

        /* compiled from: ApplicationRejectionReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApplicationRejectionReason.values().length];
                try {
                    iArr[ApplicationRejectionReason.APPLICATION_REJECTION_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApplicationRejectionReason.FUNDING_REQUIREMENT_NOT_MET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApplicationRejectionReason.TRADING_EXPERIENCE_NOT_MET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApplicationRejectionReason.FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApplicationRejectionReason.MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ApplicationRejectionReason.INVALID_TAX_WITHHOLDING_CATEGORY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ApplicationRejectionReason.MANUALLY_REJECTED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ApplicationRejectionReason.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ApplicationRejectionReason.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ApplicationRejectionReason.NOT_A_US_CITIZEN.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ApplicationRejectionReason.AGE_TRADING_EXPERIENCE_INCONSISTENCY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ApplicationRejectionReason.REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ApplicationRejectionReason.FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ApplicationRejectionReason.RISK_TOLERANCE_REQUIREMENT_NOT_MET.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ApplicationRejectionReason.SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ApplicationRejectionReason.EXPERIENCE_SCORE_UNDER_5.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ApplicationRejectionReason.APPROPRIATENESS_SCORE_UNDER_35.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ApplicationRejectionReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ApplicationRejectionReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ApplicationRejectionReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) ApplicationRejectionReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ApplicationRejectionReason> getProtoAdapter() {
            return ApplicationRejectionReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ApplicationRejectionReasonDto getZeroValue() {
            return ApplicationRejectionReasonDto.APPLICATION_REJECTION_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ApplicationRejectionReasonDto fromProto(ApplicationRejectionReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ApplicationRejectionReasonDto.APPLICATION_REJECTION_REASON_UNSPECIFIED;
                case 2:
                    return ApplicationRejectionReasonDto.FUNDING_REQUIREMENT_NOT_MET;
                case 3:
                    return ApplicationRejectionReasonDto.TRADING_EXPERIENCE_NOT_MET;
                case 4:
                    return ApplicationRejectionReasonDto.FIRST_APPLICATION_MANUALLY_REJECTED_WITHIN_60_DAYS;
                case 5:
                    return ApplicationRejectionReasonDto.MULTIPLE_APPLICATIONS_MANUALLY_REJECTED_WITHIN_180_DAYS;
                case 6:
                    return ApplicationRejectionReasonDto.INVALID_TAX_WITHHOLDING_CATEGORY;
                case 7:
                    return ApplicationRejectionReasonDto.MANUALLY_REJECTED;
                case 8:
                    return ApplicationRejectionReasonDto.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_60_DAYS;
                case 9:
                    return ApplicationRejectionReasonDto.TWO_APPLICATIONS_MANUALLY_REJECTED_WITHIN_30_DAYS;
                case 10:
                    return ApplicationRejectionReasonDto.NOT_A_US_CITIZEN;
                case 11:
                    return ApplicationRejectionReasonDto.AGE_TRADING_EXPERIENCE_INCONSISTENCY;
                case 12:
                    return ApplicationRejectionReasonDto.REJECTION_REASON_REGULATORY_QUESTIONS_HAVE_YES_ANSWER;
                case 13:
                    return ApplicationRejectionReasonDto.FIVE_APPLICATIONS_REJECTED_WITHIN_30_DAYS;
                case 14:
                    return ApplicationRejectionReasonDto.RISK_TOLERANCE_REQUIREMENT_NOT_MET;
                case 15:
                    return ApplicationRejectionReasonDto.SOURCE_OF_FUNDS_REQUIREMENT_NOT_MET;
                case 16:
                    return ApplicationRejectionReasonDto.EXPERIENCE_SCORE_UNDER_5;
                case 17:
                    return ApplicationRejectionReasonDto.APPROPRIATENESS_SCORE_UNDER_35;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ApplicationRejectionReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ApplicationRejectionReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ApplicationRejectionReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ApplicationRejectionReasonDto, ApplicationRejectionReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.ApplicationRejectionReason", ApplicationRejectionReasonDto.getEntries(), ApplicationRejectionReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ApplicationRejectionReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ApplicationRejectionReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ApplicationRejectionReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ApplicationRejectionReasonDto valueOf(String str) {
        return (ApplicationRejectionReasonDto) Enum.valueOf(ApplicationRejectionReasonDto.class, str);
    }

    public static ApplicationRejectionReasonDto[] values() {
        return (ApplicationRejectionReasonDto[]) $VALUES.clone();
    }
}
