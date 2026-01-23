package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.ApplicationRejectedResponseDto;
import com.robinhood.ceres.p284v1.ManualReviewRequiredResponseDto;
import com.robinhood.ceres.p284v1.SuccessfulAccountCreationResponseDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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

/* compiled from: CreateFuturesAccountResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005)*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Surrogate;)V", "create_futures_account_response", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "(Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;)V", "getCreate_futures_account_response", "()Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "manual_review_required_response", "Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;", "getManual_review_required_response", "()Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;", "successful_account_creation_response", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "getSuccessful_account_creation_response", "()Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "application_rejected_response", "Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;", "getApplication_rejected_response", "()Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CreateFuturesAccountResponseDto", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class CreateFuturesAccountResponseDto implements Dto3<CreateFuturesAccountResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CreateFuturesAccountResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CreateFuturesAccountResponseDto, CreateFuturesAccountResponse>> binaryBase64Serializer$delegate;
    private static final CreateFuturesAccountResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CreateFuturesAccountResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CreateFuturesAccountResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AbstractC50647CreateFuturesAccountResponseDto getCreate_futures_account_response() {
        if (this.surrogate.getManual_review_required_response() != null) {
            return new AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse(this.surrogate.getManual_review_required_response());
        }
        if (this.surrogate.getSuccessful_account_creation_response() != null) {
            return new AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse(this.surrogate.getSuccessful_account_creation_response());
        }
        if (this.surrogate.getApplication_rejected_response() != null) {
            return new AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse(this.surrogate.getApplication_rejected_response());
        }
        return null;
    }

    public final ManualReviewRequiredResponseDto getManual_review_required_response() {
        return this.surrogate.getManual_review_required_response();
    }

    public final SuccessfulAccountCreationResponseDto getSuccessful_account_creation_response() {
        return this.surrogate.getSuccessful_account_creation_response();
    }

    public final ApplicationRejectedResponseDto getApplication_rejected_response() {
        return this.surrogate.getApplication_rejected_response();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateFuturesAccountResponseDto(AbstractC50647CreateFuturesAccountResponseDto abstractC50647CreateFuturesAccountResponseDto) {
        AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse manualReviewRequiredResponse = abstractC50647CreateFuturesAccountResponseDto instanceof AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse ? (AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse) abstractC50647CreateFuturesAccountResponseDto : null;
        ManualReviewRequiredResponseDto value = manualReviewRequiredResponse != null ? manualReviewRequiredResponse.getValue() : null;
        AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse successfulAccountCreationResponse = abstractC50647CreateFuturesAccountResponseDto instanceof AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse ? (AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse) abstractC50647CreateFuturesAccountResponseDto : null;
        SuccessfulAccountCreationResponseDto value2 = successfulAccountCreationResponse != null ? successfulAccountCreationResponse.getValue() : null;
        AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse applicationRejectedResponse = abstractC50647CreateFuturesAccountResponseDto instanceof AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse ? (AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse) abstractC50647CreateFuturesAccountResponseDto : null;
        this(new Surrogate(value, value2, applicationRejectedResponse != null ? applicationRejectedResponse.getValue() : null));
    }

    public /* synthetic */ CreateFuturesAccountResponseDto(AbstractC50647CreateFuturesAccountResponseDto abstractC50647CreateFuturesAccountResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : abstractC50647CreateFuturesAccountResponseDto);
    }

    public static /* synthetic */ CreateFuturesAccountResponseDto copy$default(CreateFuturesAccountResponseDto createFuturesAccountResponseDto, AbstractC50647CreateFuturesAccountResponseDto abstractC50647CreateFuturesAccountResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC50647CreateFuturesAccountResponseDto = createFuturesAccountResponseDto.getCreate_futures_account_response();
        }
        return createFuturesAccountResponseDto.copy(abstractC50647CreateFuturesAccountResponseDto);
    }

    public final CreateFuturesAccountResponseDto copy(AbstractC50647CreateFuturesAccountResponseDto create_futures_account_response) {
        AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse manualReviewRequiredResponse = create_futures_account_response instanceof AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse ? (AbstractC50647CreateFuturesAccountResponseDto.ManualReviewRequiredResponse) create_futures_account_response : null;
        ManualReviewRequiredResponseDto value = manualReviewRequiredResponse != null ? manualReviewRequiredResponse.getValue() : null;
        AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse successfulAccountCreationResponse = create_futures_account_response instanceof AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse ? (AbstractC50647CreateFuturesAccountResponseDto.SuccessfulAccountCreationResponse) create_futures_account_response : null;
        SuccessfulAccountCreationResponseDto value2 = successfulAccountCreationResponse != null ? successfulAccountCreationResponse.getValue() : null;
        AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse applicationRejectedResponse = create_futures_account_response instanceof AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse ? (AbstractC50647CreateFuturesAccountResponseDto.ApplicationRejectedResponse) create_futures_account_response : null;
        return new CreateFuturesAccountResponseDto(new Surrogate(value, value2, applicationRejectedResponse != null ? applicationRejectedResponse.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public CreateFuturesAccountResponse toProto() {
        ManualReviewRequiredResponseDto manual_review_required_response = this.surrogate.getManual_review_required_response();
        ManualReviewRequiredResponse proto = manual_review_required_response != null ? manual_review_required_response.toProto() : null;
        SuccessfulAccountCreationResponseDto successful_account_creation_response = this.surrogate.getSuccessful_account_creation_response();
        SuccessfulAccountCreationResponse proto2 = successful_account_creation_response != null ? successful_account_creation_response.toProto() : null;
        ApplicationRejectedResponseDto application_rejected_response = this.surrogate.getApplication_rejected_response();
        return new CreateFuturesAccountResponse(proto, proto2, application_rejected_response != null ? application_rejected_response.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[com.robinhood.ceres.v1.CreateFuturesAccountResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CreateFuturesAccountResponseDto) && Intrinsics.areEqual(((CreateFuturesAccountResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CreateFuturesAccountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Surrogate;", "", "manual_review_required_response", "Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;", "successful_account_creation_response", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "application_rejected_response", "Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;", "<init>", "(Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getManual_review_required_response$annotations", "()V", "getManual_review_required_response", "()Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;", "getSuccessful_account_creation_response$annotations", "getSuccessful_account_creation_response", "()Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "getApplication_rejected_response$annotations", "getApplication_rejected_response", "()Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ApplicationRejectedResponseDto application_rejected_response;
        private final ManualReviewRequiredResponseDto manual_review_required_response;
        private final SuccessfulAccountCreationResponseDto successful_account_creation_response;

        public Surrogate() {
            this((ManualReviewRequiredResponseDto) null, (SuccessfulAccountCreationResponseDto) null, (ApplicationRejectedResponseDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ManualReviewRequiredResponseDto manualReviewRequiredResponseDto, SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto, ApplicationRejectedResponseDto applicationRejectedResponseDto, int i, Object obj) {
            if ((i & 1) != 0) {
                manualReviewRequiredResponseDto = surrogate.manual_review_required_response;
            }
            if ((i & 2) != 0) {
                successfulAccountCreationResponseDto = surrogate.successful_account_creation_response;
            }
            if ((i & 4) != 0) {
                applicationRejectedResponseDto = surrogate.application_rejected_response;
            }
            return surrogate.copy(manualReviewRequiredResponseDto, successfulAccountCreationResponseDto, applicationRejectedResponseDto);
        }

        @SerialName("applicationRejectedResponse")
        @JsonAnnotations2(names = {"application_rejected_response"})
        public static /* synthetic */ void getApplication_rejected_response$annotations() {
        }

        @SerialName("manualReviewRequiredResponse")
        @JsonAnnotations2(names = {"manual_review_required_response"})
        public static /* synthetic */ void getManual_review_required_response$annotations() {
        }

        @SerialName("successfulAccountCreationResponse")
        @JsonAnnotations2(names = {"successful_account_creation_response"})
        public static /* synthetic */ void getSuccessful_account_creation_response$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ManualReviewRequiredResponseDto getManual_review_required_response() {
            return this.manual_review_required_response;
        }

        /* renamed from: component2, reason: from getter */
        public final SuccessfulAccountCreationResponseDto getSuccessful_account_creation_response() {
            return this.successful_account_creation_response;
        }

        /* renamed from: component3, reason: from getter */
        public final ApplicationRejectedResponseDto getApplication_rejected_response() {
            return this.application_rejected_response;
        }

        public final Surrogate copy(ManualReviewRequiredResponseDto manual_review_required_response, SuccessfulAccountCreationResponseDto successful_account_creation_response, ApplicationRejectedResponseDto application_rejected_response) {
            return new Surrogate(manual_review_required_response, successful_account_creation_response, application_rejected_response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.manual_review_required_response, surrogate.manual_review_required_response) && Intrinsics.areEqual(this.successful_account_creation_response, surrogate.successful_account_creation_response) && Intrinsics.areEqual(this.application_rejected_response, surrogate.application_rejected_response);
        }

        public int hashCode() {
            ManualReviewRequiredResponseDto manualReviewRequiredResponseDto = this.manual_review_required_response;
            int iHashCode = (manualReviewRequiredResponseDto == null ? 0 : manualReviewRequiredResponseDto.hashCode()) * 31;
            SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto = this.successful_account_creation_response;
            int iHashCode2 = (iHashCode + (successfulAccountCreationResponseDto == null ? 0 : successfulAccountCreationResponseDto.hashCode())) * 31;
            ApplicationRejectedResponseDto applicationRejectedResponseDto = this.application_rejected_response;
            return iHashCode2 + (applicationRejectedResponseDto != null ? applicationRejectedResponseDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(manual_review_required_response=" + this.manual_review_required_response + ", successful_account_creation_response=" + this.successful_account_creation_response + ", application_rejected_response=" + this.application_rejected_response + ")";
        }

        /* compiled from: CreateFuturesAccountResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CreateFuturesAccountResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ManualReviewRequiredResponseDto manualReviewRequiredResponseDto, SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto, ApplicationRejectedResponseDto applicationRejectedResponseDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.manual_review_required_response = null;
            } else {
                this.manual_review_required_response = manualReviewRequiredResponseDto;
            }
            if ((i & 2) == 0) {
                this.successful_account_creation_response = null;
            } else {
                this.successful_account_creation_response = successfulAccountCreationResponseDto;
            }
            if ((i & 4) == 0) {
                this.application_rejected_response = null;
            } else {
                this.application_rejected_response = applicationRejectedResponseDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ManualReviewRequiredResponseDto manualReviewRequiredResponseDto = self.manual_review_required_response;
            if (manualReviewRequiredResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ManualReviewRequiredResponseDto.Serializer.INSTANCE, manualReviewRequiredResponseDto);
            }
            SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto = self.successful_account_creation_response;
            if (successfulAccountCreationResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SuccessfulAccountCreationResponseDto.Serializer.INSTANCE, successfulAccountCreationResponseDto);
            }
            ApplicationRejectedResponseDto applicationRejectedResponseDto = self.application_rejected_response;
            if (applicationRejectedResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ApplicationRejectedResponseDto.Serializer.INSTANCE, applicationRejectedResponseDto);
            }
        }

        public Surrogate(ManualReviewRequiredResponseDto manualReviewRequiredResponseDto, SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto, ApplicationRejectedResponseDto applicationRejectedResponseDto) {
            this.manual_review_required_response = manualReviewRequiredResponseDto;
            this.successful_account_creation_response = successfulAccountCreationResponseDto;
            this.application_rejected_response = applicationRejectedResponseDto;
        }

        public /* synthetic */ Surrogate(ManualReviewRequiredResponseDto manualReviewRequiredResponseDto, SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto, ApplicationRejectedResponseDto applicationRejectedResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : manualReviewRequiredResponseDto, (i & 2) != 0 ? null : successfulAccountCreationResponseDto, (i & 4) != 0 ? null : applicationRejectedResponseDto);
        }

        public final ManualReviewRequiredResponseDto getManual_review_required_response() {
            return this.manual_review_required_response;
        }

        public final SuccessfulAccountCreationResponseDto getSuccessful_account_creation_response() {
            return this.successful_account_creation_response;
        }

        public final ApplicationRejectedResponseDto getApplication_rejected_response() {
            return this.application_rejected_response;
        }
    }

    /* compiled from: CreateFuturesAccountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CreateFuturesAccountResponseDto, CreateFuturesAccountResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CreateFuturesAccountResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateFuturesAccountResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CreateFuturesAccountResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CreateFuturesAccountResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CreateFuturesAccountResponse> getProtoAdapter() {
            return CreateFuturesAccountResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateFuturesAccountResponseDto getZeroValue() {
            return CreateFuturesAccountResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CreateFuturesAccountResponseDto fromProto(CreateFuturesAccountResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ManualReviewRequiredResponse manual_review_required_response = proto.getManual_review_required_response();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ManualReviewRequiredResponseDto manualReviewRequiredResponseDtoFromProto = manual_review_required_response != null ? ManualReviewRequiredResponseDto.INSTANCE.fromProto(manual_review_required_response) : null;
            SuccessfulAccountCreationResponse successful_account_creation_response = proto.getSuccessful_account_creation_response();
            SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDtoFromProto = successful_account_creation_response != null ? SuccessfulAccountCreationResponseDto.INSTANCE.fromProto(successful_account_creation_response) : null;
            ApplicationRejectedResponse application_rejected_response = proto.getApplication_rejected_response();
            return new CreateFuturesAccountResponseDto(new Surrogate(manualReviewRequiredResponseDtoFromProto, successfulAccountCreationResponseDtoFromProto, application_rejected_response != null ? ApplicationRejectedResponseDto.INSTANCE.fromProto(application_rejected_response) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.CreateFuturesAccountResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateFuturesAccountResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CreateFuturesAccountResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CreateFuturesAccountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ManualReviewRequiredResponse", "SuccessfulAccountCreationResponse", "ApplicationRejectedResponse", "Companion", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$ApplicationRejectedResponse;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$ManualReviewRequiredResponse;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$SuccessfulAccountCreationResponse;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* renamed from: com.robinhood.ceres.v1.CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto, reason: collision with other inner class name */
    public static abstract class AbstractC50647CreateFuturesAccountResponseDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AbstractC50647CreateFuturesAccountResponseDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC50647CreateFuturesAccountResponseDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: CreateFuturesAccountResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$ManualReviewRequiredResponse;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "value", "Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;", "<init>", "(Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ManualReviewRequiredResponseDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.ceres.v1.CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$ManualReviewRequiredResponse, reason: from toString */
        public static final /* data */ class ManualReviewRequiredResponse extends AbstractC50647CreateFuturesAccountResponseDto {
            private final ManualReviewRequiredResponseDto value;

            public static /* synthetic */ ManualReviewRequiredResponse copy$default(ManualReviewRequiredResponse manualReviewRequiredResponse, ManualReviewRequiredResponseDto manualReviewRequiredResponseDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    manualReviewRequiredResponseDto = manualReviewRequiredResponse.value;
                }
                return manualReviewRequiredResponse.copy(manualReviewRequiredResponseDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ManualReviewRequiredResponseDto getValue() {
                return this.value;
            }

            public final ManualReviewRequiredResponse copy(ManualReviewRequiredResponseDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ManualReviewRequiredResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ManualReviewRequiredResponse) && Intrinsics.areEqual(this.value, ((ManualReviewRequiredResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ManualReviewRequiredResponse(value=" + this.value + ")";
            }

            public final ManualReviewRequiredResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ManualReviewRequiredResponse(ManualReviewRequiredResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateFuturesAccountResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$SuccessfulAccountCreationResponse;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "value", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "<init>", "(Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.ceres.v1.CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$SuccessfulAccountCreationResponse, reason: from toString */
        public static final /* data */ class SuccessfulAccountCreationResponse extends AbstractC50647CreateFuturesAccountResponseDto {
            private final SuccessfulAccountCreationResponseDto value;

            public static /* synthetic */ SuccessfulAccountCreationResponse copy$default(SuccessfulAccountCreationResponse successfulAccountCreationResponse, SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    successfulAccountCreationResponseDto = successfulAccountCreationResponse.value;
                }
                return successfulAccountCreationResponse.copy(successfulAccountCreationResponseDto);
            }

            /* renamed from: component1, reason: from getter */
            public final SuccessfulAccountCreationResponseDto getValue() {
                return this.value;
            }

            public final SuccessfulAccountCreationResponse copy(SuccessfulAccountCreationResponseDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SuccessfulAccountCreationResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuccessfulAccountCreationResponse) && Intrinsics.areEqual(this.value, ((SuccessfulAccountCreationResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SuccessfulAccountCreationResponse(value=" + this.value + ")";
            }

            public final SuccessfulAccountCreationResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessfulAccountCreationResponse(SuccessfulAccountCreationResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateFuturesAccountResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$ApplicationRejectedResponse;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "value", "Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;", "<init>", "(Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ApplicationRejectedResponseDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.ceres.v1.CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$ApplicationRejectedResponse, reason: from toString */
        public static final /* data */ class ApplicationRejectedResponse extends AbstractC50647CreateFuturesAccountResponseDto {
            private final ApplicationRejectedResponseDto value;

            public static /* synthetic */ ApplicationRejectedResponse copy$default(ApplicationRejectedResponse applicationRejectedResponse, ApplicationRejectedResponseDto applicationRejectedResponseDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    applicationRejectedResponseDto = applicationRejectedResponse.value;
                }
                return applicationRejectedResponse.copy(applicationRejectedResponseDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ApplicationRejectedResponseDto getValue() {
                return this.value;
            }

            public final ApplicationRejectedResponse copy(ApplicationRejectedResponseDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new ApplicationRejectedResponse(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApplicationRejectedResponse) && Intrinsics.areEqual(this.value, ((ApplicationRejectedResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ApplicationRejectedResponse(value=" + this.value + ")";
            }

            public final ApplicationRejectedResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplicationRejectedResponse(ApplicationRejectedResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: CreateFuturesAccountResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.ceres.v1.CreateFuturesAccountResponseDto$CreateFuturesAccountResponseDto$Companion, reason: from kotlin metadata */
        public static final class Companion implements Dto4.Creator<AbstractC50647CreateFuturesAccountResponseDto, CreateFuturesAccountResponse> {
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
            public ProtoAdapter<CreateFuturesAccountResponse> getProtoAdapter() {
                return CreateFuturesAccountResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AbstractC50647CreateFuturesAccountResponseDto fromProto(CreateFuturesAccountResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getManual_review_required_response() != null) {
                    return new ManualReviewRequiredResponse(ManualReviewRequiredResponseDto.INSTANCE.fromProto(proto.getManual_review_required_response()));
                }
                if (proto.getSuccessful_account_creation_response() != null) {
                    return new SuccessfulAccountCreationResponse(SuccessfulAccountCreationResponseDto.INSTANCE.fromProto(proto.getSuccessful_account_creation_response()));
                }
                if (proto.getApplication_rejected_response() != null) {
                    return new ApplicationRejectedResponse(ApplicationRejectedResponseDto.INSTANCE.fromProto(proto.getApplication_rejected_response()));
                }
                return null;
            }
        }
    }

    /* compiled from: CreateFuturesAccountResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CreateFuturesAccountResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.CreateFuturesAccountResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CreateFuturesAccountResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CreateFuturesAccountResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CreateFuturesAccountResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CreateFuturesAccountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.CreateFuturesAccountResponseDto";
        }
    }
}
