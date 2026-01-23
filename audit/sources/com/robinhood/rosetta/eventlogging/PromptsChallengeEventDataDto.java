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
import com.robinhood.rosetta.eventlogging.PromptsChallengeEventData;
import com.robinhood.rosetta.eventlogging.PromptsChallengeEventDataDto;
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

/* compiled from: PromptsChallengeEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Surrogate;)V", "silent", "", "source_flow", "", "error_message", "error_type", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;)V", "getSilent", "()Z", "getSource_flow", "()Ljava/lang/String;", "getError_message", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ErrorTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PromptsChallengeEventDataDto implements Dto3<PromptsChallengeEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PromptsChallengeEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PromptsChallengeEventDataDto, PromptsChallengeEventData>> binaryBase64Serializer$delegate;
    private static final PromptsChallengeEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PromptsChallengeEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PromptsChallengeEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getSilent() {
        return this.surrogate.getSilent();
    }

    public final String getSource_flow() {
        return this.surrogate.getSource_flow();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public final ErrorTypeDto getError_type() {
        return this.surrogate.getError_type();
    }

    public /* synthetic */ PromptsChallengeEventDataDto(boolean z, String str, String str2, ErrorTypeDto errorTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromptsChallengeEventDataDto(boolean z, String source_flow, String error_message, ErrorTypeDto error_type) {
        this(new Surrogate(z, source_flow, error_message, error_type));
        Intrinsics.checkNotNullParameter(source_flow, "source_flow");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
    }

    public static /* synthetic */ PromptsChallengeEventDataDto copy$default(PromptsChallengeEventDataDto promptsChallengeEventDataDto, boolean z, String str, String str2, ErrorTypeDto errorTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = promptsChallengeEventDataDto.surrogate.getSilent();
        }
        if ((i & 2) != 0) {
            str = promptsChallengeEventDataDto.surrogate.getSource_flow();
        }
        if ((i & 4) != 0) {
            str2 = promptsChallengeEventDataDto.surrogate.getError_message();
        }
        if ((i & 8) != 0) {
            errorTypeDto = promptsChallengeEventDataDto.surrogate.getError_type();
        }
        return promptsChallengeEventDataDto.copy(z, str, str2, errorTypeDto);
    }

    public final PromptsChallengeEventDataDto copy(boolean silent, String source_flow, String error_message, ErrorTypeDto error_type) {
        Intrinsics.checkNotNullParameter(source_flow, "source_flow");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        return new PromptsChallengeEventDataDto(new Surrogate(silent, source_flow, error_message, error_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PromptsChallengeEventData toProto() {
        return new PromptsChallengeEventData(this.surrogate.getSilent(), this.surrogate.getSource_flow(), this.surrogate.getError_message(), (PromptsChallengeEventData.ErrorType) this.surrogate.getError_type().toProto(), null, 16, null);
    }

    public String toString() {
        return "[PromptsChallengeEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PromptsChallengeEventDataDto) && Intrinsics.areEqual(((PromptsChallengeEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PromptsChallengeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002-.B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J%\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Surrogate;", "", "silent", "", "source_flow", "", "error_message", "error_type", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSilent$annotations", "()V", "getSilent", "()Z", "getSource_flow$annotations", "getSource_flow", "()Ljava/lang/String;", "getError_message$annotations", "getError_message", "getError_type$annotations", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String error_message;
        private final ErrorTypeDto error_type;
        private final boolean silent;
        private final String source_flow;

        public Surrogate() {
            this(false, (String) null, (String) null, (ErrorTypeDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, String str, String str2, ErrorTypeDto errorTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                z = surrogate.silent;
            }
            if ((i & 2) != 0) {
                str = surrogate.source_flow;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.error_message;
            }
            if ((i & 8) != 0) {
                errorTypeDto = surrogate.error_type;
            }
            return surrogate.copy(z, str, str2, errorTypeDto);
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("silent")
        @JsonAnnotations2(names = {"silent"})
        public static /* synthetic */ void getSilent$annotations() {
        }

        @SerialName("sourceFlow")
        @JsonAnnotations2(names = {"source_flow"})
        public static /* synthetic */ void getSource_flow$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSilent() {
            return this.silent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource_flow() {
            return this.source_flow;
        }

        /* renamed from: component3, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        /* renamed from: component4, reason: from getter */
        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        public final Surrogate copy(boolean silent, String source_flow, String error_message, ErrorTypeDto error_type) {
            Intrinsics.checkNotNullParameter(source_flow, "source_flow");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            return new Surrogate(silent, source_flow, error_message, error_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.silent == surrogate.silent && Intrinsics.areEqual(this.source_flow, surrogate.source_flow) && Intrinsics.areEqual(this.error_message, surrogate.error_message) && this.error_type == surrogate.error_type;
        }

        public int hashCode() {
            return (((((java.lang.Boolean.hashCode(this.silent) * 31) + this.source_flow.hashCode()) * 31) + this.error_message.hashCode()) * 31) + this.error_type.hashCode();
        }

        public String toString() {
            return "Surrogate(silent=" + this.silent + ", source_flow=" + this.source_flow + ", error_message=" + this.error_message + ", error_type=" + this.error_type + ")";
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PromptsChallengeEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, String str, String str2, ErrorTypeDto errorTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.silent = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.source_flow = "";
            } else {
                this.source_flow = str;
            }
            if ((i & 4) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str2;
            }
            if ((i & 8) == 0) {
                this.error_type = ErrorTypeDto.INSTANCE.getZeroValue();
            } else {
                this.error_type = errorTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.silent;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (!Intrinsics.areEqual(self.source_flow, "")) {
                output.encodeStringElement(serialDesc, 1, self.source_flow);
            }
            if (!Intrinsics.areEqual(self.error_message, "")) {
                output.encodeStringElement(serialDesc, 2, self.error_message);
            }
            if (self.error_type != ErrorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ErrorTypeDto.Serializer.INSTANCE, self.error_type);
            }
        }

        public Surrogate(boolean z, String source_flow, String error_message, ErrorTypeDto error_type) {
            Intrinsics.checkNotNullParameter(source_flow, "source_flow");
            Intrinsics.checkNotNullParameter(error_message, "error_message");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            this.silent = z;
            this.source_flow = source_flow;
            this.error_message = error_message;
            this.error_type = error_type;
        }

        public /* synthetic */ Surrogate(boolean z, String str, String str2, ErrorTypeDto errorTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto);
        }

        public final boolean getSilent() {
            return this.silent;
        }

        public final String getSource_flow() {
            return this.source_flow;
        }

        public final String getError_message() {
            return this.error_message;
        }

        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }
    }

    /* compiled from: PromptsChallengeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PromptsChallengeEventDataDto, PromptsChallengeEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PromptsChallengeEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PromptsChallengeEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PromptsChallengeEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PromptsChallengeEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PromptsChallengeEventData> getProtoAdapter() {
            return PromptsChallengeEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PromptsChallengeEventDataDto getZeroValue() {
            return PromptsChallengeEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PromptsChallengeEventDataDto fromProto(PromptsChallengeEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PromptsChallengeEventDataDto(new Surrogate(proto.getSilent(), proto.getSource_flow(), proto.getError_message(), ErrorTypeDto.INSTANCE.fromProto(proto.getError_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PromptsChallengeEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PromptsChallengeEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PromptsChallengeEventDataDto(false, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PromptsChallengeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "TIMEOUT", "NO_CHALLENGE_FROM_TWILIO", "TWILIO_SDK_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorTypeDto implements Dto2<PromptsChallengeEventData.ErrorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorTypeDto, PromptsChallengeEventData.ErrorType>> binaryBase64Serializer$delegate;
        public static final ErrorTypeDto EVENT_TYPE_UNSPECIFIED = new EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED", 0);
        public static final ErrorTypeDto TIMEOUT = new TIMEOUT("TIMEOUT", 1);
        public static final ErrorTypeDto NO_CHALLENGE_FROM_TWILIO = new NO_CHALLENGE_FROM_TWILIO("NO_CHALLENGE_FROM_TWILIO", 2);
        public static final ErrorTypeDto TWILIO_SDK_ERROR = new TWILIO_SDK_ERROR("TWILIO_SDK_ERROR", 3);

        private static final /* synthetic */ ErrorTypeDto[] $values() {
            return new ErrorTypeDto[]{EVENT_TYPE_UNSPECIFIED, TIMEOUT, NO_CHALLENGE_FROM_TWILIO, TWILIO_SDK_ERROR};
        }

        public /* synthetic */ ErrorTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ErrorTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto.ErrorTypeDto.EVENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_TYPE_UNSPECIFIED extends ErrorTypeDto {
            EVENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PromptsChallengeEventData.ErrorType toProto() {
                return PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED;
            }
        }

        private ErrorTypeDto(String str, int i) {
        }

        static {
            ErrorTypeDto[] errorTypeDtoArr$values = $values();
            $VALUES = errorTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PromptsChallengeEventDataDto$ErrorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PromptsChallengeEventDataDto.ErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto.ErrorTypeDto.TIMEOUT", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TIMEOUT extends ErrorTypeDto {
            TIMEOUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PromptsChallengeEventData.ErrorType toProto() {
                return PromptsChallengeEventData.ErrorType.TIMEOUT;
            }
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto.ErrorTypeDto.NO_CHALLENGE_FROM_TWILIO", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NO_CHALLENGE_FROM_TWILIO extends ErrorTypeDto {
            NO_CHALLENGE_FROM_TWILIO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PromptsChallengeEventData.ErrorType toProto() {
                return PromptsChallengeEventData.ErrorType.NO_CHALLENGE_FROM_TWILIO;
            }
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto.ErrorTypeDto.TWILIO_SDK_ERROR", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TWILIO_SDK_ERROR extends ErrorTypeDto {
            TWILIO_SDK_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PromptsChallengeEventData.ErrorType toProto() {
                return PromptsChallengeEventData.ErrorType.TWILIO_SDK_ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData$ErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorTypeDto, PromptsChallengeEventData.ErrorType> {

            /* compiled from: PromptsChallengeEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PromptsChallengeEventData.ErrorType.values().length];
                    try {
                        iArr[PromptsChallengeEventData.ErrorType.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PromptsChallengeEventData.ErrorType.TIMEOUT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PromptsChallengeEventData.ErrorType.NO_CHALLENGE_FROM_TWILIO.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PromptsChallengeEventData.ErrorType.TWILIO_SDK_ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PromptsChallengeEventData.ErrorType> getProtoAdapter() {
                return PromptsChallengeEventData.ErrorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto getZeroValue() {
                return ErrorTypeDto.EVENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto fromProto(PromptsChallengeEventData.ErrorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ErrorTypeDto.EVENT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return ErrorTypeDto.TIMEOUT;
                }
                if (i == 3) {
                    return ErrorTypeDto.NO_CHALLENGE_FROM_TWILIO;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return ErrorTypeDto.TWILIO_SDK_ERROR;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PromptsChallengeEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$ErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorTypeDto, PromptsChallengeEventData.ErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PromptsChallengeEventData.ErrorType", ErrorTypeDto.getEntries(), ErrorTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ErrorTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ErrorTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ErrorTypeDto valueOf(String str) {
            return (ErrorTypeDto) Enum.valueOf(ErrorTypeDto.class, str);
        }

        public static ErrorTypeDto[] values() {
            return (ErrorTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PromptsChallengeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PromptsChallengeEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PromptsChallengeEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PromptsChallengeEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PromptsChallengeEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PromptsChallengeEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PromptsChallengeEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PromptsChallengeEventDataDto";
        }
    }
}
