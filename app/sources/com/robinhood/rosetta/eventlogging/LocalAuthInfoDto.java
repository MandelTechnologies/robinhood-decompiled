package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: LocalAuthInfoDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0011J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u000bH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0016J\b\u0010'\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Surrogate;)V", "succeeded", "", ErrorResponse.ERROR_CODE, "", "error_domain", "", "error_description", "succeeded_result", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "(ZILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "getSucceeded", "()Z", "getError_code", "()I", "getError_domain", "()Ljava/lang/String;", "getError_description", "getSucceeded_result", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class LocalAuthInfoDto implements Dto3<LocalAuthInfo>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LocalAuthInfoDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LocalAuthInfoDto, LocalAuthInfo>> binaryBase64Serializer$delegate;
    private static final LocalAuthInfoDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LocalAuthInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LocalAuthInfoDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getSucceeded() {
        return this.surrogate.getSucceeded();
    }

    public final int getError_code() {
        return this.surrogate.getError_code();
    }

    public final String getError_domain() {
        return this.surrogate.getError_domain();
    }

    public final String getError_description() {
        return this.surrogate.getError_description();
    }

    public final BooleanDto getSucceeded_result() {
        return this.surrogate.getSucceeded_result();
    }

    public /* synthetic */ LocalAuthInfoDto(boolean z, int i, String str, String str2, BooleanDto booleanDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalAuthInfoDto(boolean z, int i, String error_domain, String error_description, BooleanDto succeeded_result) {
        this(new Surrogate(z, i, error_domain, error_description, succeeded_result));
        Intrinsics.checkNotNullParameter(error_domain, "error_domain");
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(succeeded_result, "succeeded_result");
    }

    public static /* synthetic */ LocalAuthInfoDto copy$default(LocalAuthInfoDto localAuthInfoDto, boolean z, int i, String str, String str2, BooleanDto booleanDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = localAuthInfoDto.surrogate.getSucceeded();
        }
        if ((i2 & 2) != 0) {
            i = localAuthInfoDto.surrogate.getError_code();
        }
        if ((i2 & 4) != 0) {
            str = localAuthInfoDto.surrogate.getError_domain();
        }
        if ((i2 & 8) != 0) {
            str2 = localAuthInfoDto.surrogate.getError_description();
        }
        if ((i2 & 16) != 0) {
            booleanDto = localAuthInfoDto.surrogate.getSucceeded_result();
        }
        BooleanDto booleanDto2 = booleanDto;
        String str3 = str;
        return localAuthInfoDto.copy(z, i, str3, str2, booleanDto2);
    }

    public final LocalAuthInfoDto copy(boolean succeeded, int error_code, String error_domain, String error_description, BooleanDto succeeded_result) {
        Intrinsics.checkNotNullParameter(error_domain, "error_domain");
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(succeeded_result, "succeeded_result");
        return new LocalAuthInfoDto(new Surrogate(succeeded, error_code, error_domain, error_description, succeeded_result));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LocalAuthInfo toProto() {
        return new LocalAuthInfo(this.surrogate.getSucceeded(), this.surrogate.getError_code(), this.surrogate.getError_domain(), this.surrogate.getError_description(), (Boolean) this.surrogate.getSucceeded_result().toProto(), null, 32, null);
    }

    public String toString() {
        return "[LocalAuthInfoDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LocalAuthInfoDto) && Intrinsics.areEqual(((LocalAuthInfoDto) other).surrogate, this.surrogate);
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
    /* compiled from: LocalAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256BH\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fBI\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0018\u0010$\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003JJ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Surrogate;", "", "succeeded", "", ErrorResponse.ERROR_CODE, "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "error_domain", "", "error_description", "succeeded_result", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSucceeded$annotations", "()V", "getSucceeded", "()Z", "getError_code$annotations", "getError_code", "()I", "getError_domain$annotations", "getError_domain", "()Ljava/lang/String;", "getError_description$annotations", "getError_description", "getSucceeded_result$annotations", "getSucceeded_result", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int error_code;
        private final String error_description;
        private final String error_domain;
        private final boolean succeeded;
        private final BooleanDto succeeded_result;

        public Surrogate() {
            this(false, 0, (String) null, (String) null, (BooleanDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, int i, String str, String str2, BooleanDto booleanDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = surrogate.succeeded;
            }
            if ((i2 & 2) != 0) {
                i = surrogate.error_code;
            }
            if ((i2 & 4) != 0) {
                str = surrogate.error_domain;
            }
            if ((i2 & 8) != 0) {
                str2 = surrogate.error_description;
            }
            if ((i2 & 16) != 0) {
                booleanDto = surrogate.succeeded_result;
            }
            BooleanDto booleanDto2 = booleanDto;
            String str3 = str;
            return surrogate.copy(z, i, str3, str2, booleanDto2);
        }

        @SerialName("errorCode")
        @JsonAnnotations2(names = {ErrorResponse.ERROR_CODE})
        public static /* synthetic */ void getError_code$annotations() {
        }

        @SerialName("errorDescription")
        @JsonAnnotations2(names = {"error_description"})
        public static /* synthetic */ void getError_description$annotations() {
        }

        @SerialName("errorDomain")
        @JsonAnnotations2(names = {"error_domain"})
        public static /* synthetic */ void getError_domain$annotations() {
        }

        @SerialName("succeeded")
        @JsonAnnotations2(names = {"succeeded"})
        public static /* synthetic */ void getSucceeded$annotations() {
        }

        @SerialName("succeededResult")
        @JsonAnnotations2(names = {"succeeded_result"})
        public static /* synthetic */ void getSucceeded_result$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSucceeded() {
            return this.succeeded;
        }

        /* renamed from: component2, reason: from getter */
        public final int getError_code() {
            return this.error_code;
        }

        /* renamed from: component3, reason: from getter */
        public final String getError_domain() {
            return this.error_domain;
        }

        /* renamed from: component4, reason: from getter */
        public final String getError_description() {
            return this.error_description;
        }

        /* renamed from: component5, reason: from getter */
        public final BooleanDto getSucceeded_result() {
            return this.succeeded_result;
        }

        public final Surrogate copy(boolean succeeded, int error_code, String error_domain, String error_description, BooleanDto succeeded_result) {
            Intrinsics.checkNotNullParameter(error_domain, "error_domain");
            Intrinsics.checkNotNullParameter(error_description, "error_description");
            Intrinsics.checkNotNullParameter(succeeded_result, "succeeded_result");
            return new Surrogate(succeeded, error_code, error_domain, error_description, succeeded_result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.succeeded == surrogate.succeeded && this.error_code == surrogate.error_code && Intrinsics.areEqual(this.error_domain, surrogate.error_domain) && Intrinsics.areEqual(this.error_description, surrogate.error_description) && this.succeeded_result == surrogate.succeeded_result;
        }

        public int hashCode() {
            return (((((((java.lang.Boolean.hashCode(this.succeeded) * 31) + Integer.hashCode(this.error_code)) * 31) + this.error_domain.hashCode()) * 31) + this.error_description.hashCode()) * 31) + this.succeeded_result.hashCode();
        }

        public String toString() {
            return "Surrogate(succeeded=" + this.succeeded + ", error_code=" + this.error_code + ", error_domain=" + this.error_domain + ", error_description=" + this.error_description + ", succeeded_result=" + this.succeeded_result + ")";
        }

        /* compiled from: LocalAuthInfoDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LocalAuthInfoDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, int i2, String str, String str2, BooleanDto booleanDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.succeeded = false;
            } else {
                this.succeeded = z;
            }
            if ((i & 2) == 0) {
                this.error_code = 0;
            } else {
                this.error_code = i2;
            }
            if ((i & 4) == 0) {
                this.error_domain = "";
            } else {
                this.error_domain = str;
            }
            if ((i & 8) == 0) {
                this.error_description = "";
            } else {
                this.error_description = str2;
            }
            if ((i & 16) == 0) {
                this.succeeded_result = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.succeeded_result = booleanDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.succeeded;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            int i = self.error_code;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.error_domain, "")) {
                output.encodeStringElement(serialDesc, 2, self.error_domain);
            }
            if (!Intrinsics.areEqual(self.error_description, "")) {
                output.encodeStringElement(serialDesc, 3, self.error_description);
            }
            if (self.succeeded_result != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, BooleanDto.Serializer.INSTANCE, self.succeeded_result);
            }
        }

        public Surrogate(boolean z, int i, String error_domain, String error_description, BooleanDto succeeded_result) {
            Intrinsics.checkNotNullParameter(error_domain, "error_domain");
            Intrinsics.checkNotNullParameter(error_description, "error_description");
            Intrinsics.checkNotNullParameter(succeeded_result, "succeeded_result");
            this.succeeded = z;
            this.error_code = i;
            this.error_domain = error_domain;
            this.error_description = error_description;
            this.succeeded_result = succeeded_result;
        }

        public /* synthetic */ Surrogate(boolean z, int i, String str, String str2, BooleanDto booleanDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto);
        }

        public final boolean getSucceeded() {
            return this.succeeded;
        }

        public final int getError_code() {
            return this.error_code;
        }

        public final String getError_domain() {
            return this.error_domain;
        }

        public final String getError_description() {
            return this.error_description;
        }

        public final BooleanDto getSucceeded_result() {
            return this.succeeded_result;
        }
    }

    /* compiled from: LocalAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<LocalAuthInfoDto, LocalAuthInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LocalAuthInfoDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LocalAuthInfoDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LocalAuthInfoDto> getBinaryBase64Serializer() {
            return (KSerializer) LocalAuthInfoDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LocalAuthInfo> getProtoAdapter() {
            return LocalAuthInfo.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LocalAuthInfoDto getZeroValue() {
            return LocalAuthInfoDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LocalAuthInfoDto fromProto(LocalAuthInfo proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new LocalAuthInfoDto(new Surrogate(proto.getSucceeded(), proto.getError_code(), proto.getError_domain(), proto.getError_description(), BooleanDto.INSTANCE.fromProto(proto.getSucceeded_result())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.LocalAuthInfoDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalAuthInfoDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new LocalAuthInfoDto(false, 0, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LocalAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<LocalAuthInfoDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.LocalAuthInfo", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LocalAuthInfoDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LocalAuthInfoDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LocalAuthInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LocalAuthInfoDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/LocalAuthInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.LocalAuthInfoDto";
        }
    }
}
