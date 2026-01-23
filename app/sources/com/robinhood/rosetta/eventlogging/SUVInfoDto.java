package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.SUVInfo;
import com.robinhood.rosetta.eventlogging.SUVInfoDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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

/* compiled from: SUVInfoDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Surrogate;)V", "verification_workflow_id", "", "original_status", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "handling_result", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;)V", "getVerification_workflow_id", "()Ljava/lang/String;", "getOriginal_status", "()Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "getHandling_result", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SUVStatusDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class SUVInfoDto implements Dto3<SUVInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SUVInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SUVInfoDto, SUVInfo>> binaryBase64Serializer$delegate;
    private static final SUVInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SUVInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SUVInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getVerification_workflow_id() {
        return this.surrogate.getVerification_workflow_id();
    }

    public final SUVStatusDto getOriginal_status() {
        return this.surrogate.getOriginal_status();
    }

    public final SUVStatusDto getHandling_result() {
        return this.surrogate.getHandling_result();
    }

    public /* synthetic */ SUVInfoDto(String str, SUVStatusDto sUVStatusDto, SUVStatusDto sUVStatusDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SUVStatusDto.INSTANCE.getZeroValue() : sUVStatusDto, (i & 4) != 0 ? SUVStatusDto.INSTANCE.getZeroValue() : sUVStatusDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SUVInfoDto(String verification_workflow_id, SUVStatusDto original_status, SUVStatusDto handling_result) {
        this(new Surrogate(verification_workflow_id, original_status, handling_result));
        Intrinsics.checkNotNullParameter(verification_workflow_id, "verification_workflow_id");
        Intrinsics.checkNotNullParameter(original_status, "original_status");
        Intrinsics.checkNotNullParameter(handling_result, "handling_result");
    }

    public static /* synthetic */ SUVInfoDto copy$default(SUVInfoDto sUVInfoDto, String str, SUVStatusDto sUVStatusDto, SUVStatusDto sUVStatusDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sUVInfoDto.surrogate.getVerification_workflow_id();
        }
        if ((i & 2) != 0) {
            sUVStatusDto = sUVInfoDto.surrogate.getOriginal_status();
        }
        if ((i & 4) != 0) {
            sUVStatusDto2 = sUVInfoDto.surrogate.getHandling_result();
        }
        return sUVInfoDto.copy(str, sUVStatusDto, sUVStatusDto2);
    }

    public final SUVInfoDto copy(String verification_workflow_id, SUVStatusDto original_status, SUVStatusDto handling_result) {
        Intrinsics.checkNotNullParameter(verification_workflow_id, "verification_workflow_id");
        Intrinsics.checkNotNullParameter(original_status, "original_status");
        Intrinsics.checkNotNullParameter(handling_result, "handling_result");
        return new SUVInfoDto(new Surrogate(verification_workflow_id, original_status, handling_result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SUVInfo toProto() {
        return new SUVInfo(this.surrogate.getVerification_workflow_id(), (SUVInfo.SUVStatus) this.surrogate.getOriginal_status().toProto(), (SUVInfo.SUVStatus) this.surrogate.getHandling_result().toProto(), null, 8, null);
    }

    public String toString() {
        return "[SUVInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SUVInfoDto) && Intrinsics.areEqual(((SUVInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: SUVInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Surrogate;", "", "verification_workflow_id", "", "original_status", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "handling_result", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getVerification_workflow_id$annotations", "()V", "getVerification_workflow_id", "()Ljava/lang/String;", "getOriginal_status$annotations", "getOriginal_status", "()Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "getHandling_result$annotations", "getHandling_result", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SUVStatusDto handling_result;
        private final SUVStatusDto original_status;
        private final String verification_workflow_id;

        public Surrogate() {
            this((String) null, (SUVStatusDto) null, (SUVStatusDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, SUVStatusDto sUVStatusDto, SUVStatusDto sUVStatusDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.verification_workflow_id;
            }
            if ((i & 2) != 0) {
                sUVStatusDto = surrogate.original_status;
            }
            if ((i & 4) != 0) {
                sUVStatusDto2 = surrogate.handling_result;
            }
            return surrogate.copy(str, sUVStatusDto, sUVStatusDto2);
        }

        @SerialName("handlingResult")
        @JsonAnnotations2(names = {"handling_result"})
        public static /* synthetic */ void getHandling_result$annotations() {
        }

        @SerialName("originalStatus")
        @JsonAnnotations2(names = {"original_status"})
        public static /* synthetic */ void getOriginal_status$annotations() {
        }

        @SerialName("verificationWorkflowId")
        @JsonAnnotations2(names = {"verification_workflow_id"})
        public static /* synthetic */ void getVerification_workflow_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerification_workflow_id() {
            return this.verification_workflow_id;
        }

        /* renamed from: component2, reason: from getter */
        public final SUVStatusDto getOriginal_status() {
            return this.original_status;
        }

        /* renamed from: component3, reason: from getter */
        public final SUVStatusDto getHandling_result() {
            return this.handling_result;
        }

        public final Surrogate copy(String verification_workflow_id, SUVStatusDto original_status, SUVStatusDto handling_result) {
            Intrinsics.checkNotNullParameter(verification_workflow_id, "verification_workflow_id");
            Intrinsics.checkNotNullParameter(original_status, "original_status");
            Intrinsics.checkNotNullParameter(handling_result, "handling_result");
            return new Surrogate(verification_workflow_id, original_status, handling_result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.verification_workflow_id, surrogate.verification_workflow_id) && this.original_status == surrogate.original_status && this.handling_result == surrogate.handling_result;
        }

        public int hashCode() {
            return (((this.verification_workflow_id.hashCode() * 31) + this.original_status.hashCode()) * 31) + this.handling_result.hashCode();
        }

        public String toString() {
            return "Surrogate(verification_workflow_id=" + this.verification_workflow_id + ", original_status=" + this.original_status + ", handling_result=" + this.handling_result + ")";
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SUVInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, SUVStatusDto sUVStatusDto, SUVStatusDto sUVStatusDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.verification_workflow_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.original_status = SUVStatusDto.INSTANCE.getZeroValue();
            } else {
                this.original_status = sUVStatusDto;
            }
            if ((i & 4) == 0) {
                this.handling_result = SUVStatusDto.INSTANCE.getZeroValue();
            } else {
                this.handling_result = sUVStatusDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.verification_workflow_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.verification_workflow_id);
            }
            SUVStatusDto sUVStatusDto = self.original_status;
            SUVStatusDto.Companion companion = SUVStatusDto.INSTANCE;
            if (sUVStatusDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SUVStatusDto.Serializer.INSTANCE, self.original_status);
            }
            if (self.handling_result != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, SUVStatusDto.Serializer.INSTANCE, self.handling_result);
            }
        }

        public Surrogate(String verification_workflow_id, SUVStatusDto original_status, SUVStatusDto handling_result) {
            Intrinsics.checkNotNullParameter(verification_workflow_id, "verification_workflow_id");
            Intrinsics.checkNotNullParameter(original_status, "original_status");
            Intrinsics.checkNotNullParameter(handling_result, "handling_result");
            this.verification_workflow_id = verification_workflow_id;
            this.original_status = original_status;
            this.handling_result = handling_result;
        }

        public final String getVerification_workflow_id() {
            return this.verification_workflow_id;
        }

        public /* synthetic */ Surrogate(String str, SUVStatusDto sUVStatusDto, SUVStatusDto sUVStatusDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SUVStatusDto.INSTANCE.getZeroValue() : sUVStatusDto, (i & 4) != 0 ? SUVStatusDto.INSTANCE.getZeroValue() : sUVStatusDto2);
        }

        public final SUVStatusDto getOriginal_status() {
            return this.original_status;
        }

        public final SUVStatusDto getHandling_result() {
            return this.handling_result;
        }
    }

    /* compiled from: SUVInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "Lcom/robinhood/rosetta/eventlogging/SUVInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SUVInfoDto, SUVInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SUVInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SUVInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SUVInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) SUVInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SUVInfo> getProtoAdapter() {
            return SUVInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SUVInfoDto getZeroValue() {
            return SUVInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SUVInfoDto fromProto(SUVInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String verification_workflow_id = proto.getVerification_workflow_id();
            SUVStatusDto.Companion companion = SUVStatusDto.INSTANCE;
            return new SUVInfoDto(new Surrogate(verification_workflow_id, companion.fromProto(proto.getOriginal_status()), companion.fromProto(proto.getHandling_result())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SUVInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SUVInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SUVInfoDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SUVInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SUV_STATUS_UNSPECIFIED", "APPROVED", "CANCELED", "DENIED", "INTERNAL_PENDING", "USER_PENDING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SUVStatusDto implements Dto2<SUVInfo.SUVStatus>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SUVStatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SUVStatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SUVStatusDto, SUVInfo.SUVStatus>> binaryBase64Serializer$delegate;
        public static final SUVStatusDto SUV_STATUS_UNSPECIFIED = new SUV_STATUS_UNSPECIFIED("SUV_STATUS_UNSPECIFIED", 0);
        public static final SUVStatusDto APPROVED = new APPROVED("APPROVED", 1);
        public static final SUVStatusDto CANCELED = new CANCELED("CANCELED", 2);
        public static final SUVStatusDto DENIED = new DENIED("DENIED", 3);
        public static final SUVStatusDto INTERNAL_PENDING = new INTERNAL_PENDING("INTERNAL_PENDING", 4);
        public static final SUVStatusDto USER_PENDING = new USER_PENDING("USER_PENDING", 5);

        private static final /* synthetic */ SUVStatusDto[] $values() {
            return new SUVStatusDto[]{SUV_STATUS_UNSPECIFIED, APPROVED, CANCELED, DENIED, INTERNAL_PENDING, USER_PENDING};
        }

        public /* synthetic */ SUVStatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SUVStatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SUVInfoDto.SUVStatusDto.SUV_STATUS_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUV_STATUS_UNSPECIFIED extends SUVStatusDto {
            SUV_STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SUVInfo.SUVStatus toProto() {
                return SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED;
            }
        }

        private SUVStatusDto(String str, int i) {
        }

        static {
            SUVStatusDto[] sUVStatusDtoArr$values = $values();
            $VALUES = sUVStatusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sUVStatusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.SUVInfoDto$SUVStatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SUVInfoDto.SUVStatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SUVInfoDto.SUVStatusDto.APPROVED", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APPROVED extends SUVStatusDto {
            APPROVED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SUVInfo.SUVStatus toProto() {
                return SUVInfo.SUVStatus.APPROVED;
            }
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SUVInfoDto.SUVStatusDto.CANCELED", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED extends SUVStatusDto {
            CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SUVInfo.SUVStatus toProto() {
                return SUVInfo.SUVStatus.CANCELED;
            }
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SUVInfoDto.SUVStatusDto.DENIED", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DENIED extends SUVStatusDto {
            DENIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SUVInfo.SUVStatus toProto() {
                return SUVInfo.SUVStatus.DENIED;
            }
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SUVInfoDto.SUVStatusDto.INTERNAL_PENDING", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INTERNAL_PENDING extends SUVStatusDto {
            INTERNAL_PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SUVInfo.SUVStatus toProto() {
                return SUVInfo.SUVStatus.INTERNAL_PENDING;
            }
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/SUVInfoDto.SUVStatusDto.USER_PENDING", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER_PENDING extends SUVStatusDto {
            USER_PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SUVInfo.SUVStatus toProto() {
                return SUVInfo.SUVStatus.USER_PENDING;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SUVStatusDto, SUVInfo.SUVStatus> {

            /* compiled from: SUVInfoDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SUVInfo.SUVStatus.values().length];
                    try {
                        iArr[SUVInfo.SUVStatus.SUV_STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SUVInfo.SUVStatus.APPROVED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SUVInfo.SUVStatus.CANCELED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SUVInfo.SUVStatus.DENIED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SUVInfo.SUVStatus.INTERNAL_PENDING.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SUVInfo.SUVStatus.USER_PENDING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SUVStatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SUVStatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SUVStatusDto> getBinaryBase64Serializer() {
                return (KSerializer) SUVStatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SUVInfo.SUVStatus> getProtoAdapter() {
                return SUVInfo.SUVStatus.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SUVStatusDto getZeroValue() {
                return SUVStatusDto.SUV_STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SUVStatusDto fromProto(SUVInfo.SUVStatus proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SUVStatusDto.SUV_STATUS_UNSPECIFIED;
                    case 2:
                        return SUVStatusDto.APPROVED;
                    case 3:
                        return SUVStatusDto.CANCELED;
                    case 4:
                        return SUVStatusDto.DENIED;
                    case 5:
                        return SUVStatusDto.INTERNAL_PENDING;
                    case 6:
                        return SUVStatusDto.USER_PENDING;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SUVInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$SUVStatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SUVStatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SUVStatusDto, SUVInfo.SUVStatus> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.SUVInfo.SUVStatus", SUVStatusDto.getEntries(), SUVStatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SUVStatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SUVStatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SUVStatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SUVStatusDto valueOf(String str) {
            return (SUVStatusDto) Enum.valueOf(SUVStatusDto.class, str);
        }

        public static SUVStatusDto[] values() {
            return (SUVStatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SUVInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<SUVInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.SUVInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SUVInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SUVInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SUVInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SUVInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SUVInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.SUVInfoDto";
        }
    }
}
