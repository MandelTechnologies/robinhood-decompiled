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
import com.robinhood.rosetta.eventlogging.ComponentDto;
import com.robinhood.rosetta.eventlogging.ErrorEventData;
import com.robinhood.rosetta.eventlogging.ErrorEventDataDto;
import com.robinhood.rosetta.eventlogging.ScreenDto;
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

/* compiled from: ErrorEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006./0123B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0013JF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tJ\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Surrogate;)V", "tag", "", "screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "error_type", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "feature_surface", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "personal_information_free_log", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcom/robinhood/rosetta/eventlogging/ComponentDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "getFeature_surface", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "getPersonal_information_free_log", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ErrorTypeDto", "FeatureSurfaceDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ErrorEventDataDto implements Dto3<ErrorEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ErrorEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ErrorEventDataDto, ErrorEventData>> binaryBase64Serializer$delegate;
    private static final ErrorEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ErrorEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ErrorEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTag() {
        return this.surrogate.getTag();
    }

    public final ScreenDto getScreen() {
        return this.surrogate.getScreen();
    }

    public final ComponentDto getComponent() {
        return this.surrogate.getComponent();
    }

    public final ErrorTypeDto getError_type() {
        return this.surrogate.getError_type();
    }

    public final FeatureSurfaceDto getFeature_surface() {
        return this.surrogate.getFeature_surface();
    }

    public final String getPersonal_information_free_log() {
        return this.surrogate.getPersonal_information_free_log();
    }

    public /* synthetic */ ErrorEventDataDto(String str, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto errorTypeDto, FeatureSurfaceDto featureSurfaceDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : screenDto, (i & 4) != 0 ? null : componentDto, (i & 8) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto, (i & 16) != 0 ? FeatureSurfaceDto.INSTANCE.getZeroValue() : featureSurfaceDto, (i & 32) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorEventDataDto(String tag, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto error_type, FeatureSurfaceDto feature_surface, String personal_information_free_log) {
        this(new Surrogate(tag, screenDto, componentDto, error_type, feature_surface, personal_information_free_log));
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(feature_surface, "feature_surface");
        Intrinsics.checkNotNullParameter(personal_information_free_log, "personal_information_free_log");
    }

    public static /* synthetic */ ErrorEventDataDto copy$default(ErrorEventDataDto errorEventDataDto, String str, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto errorTypeDto, FeatureSurfaceDto featureSurfaceDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorEventDataDto.surrogate.getTag();
        }
        if ((i & 2) != 0) {
            screenDto = errorEventDataDto.surrogate.getScreen();
        }
        if ((i & 4) != 0) {
            componentDto = errorEventDataDto.surrogate.getComponent();
        }
        if ((i & 8) != 0) {
            errorTypeDto = errorEventDataDto.surrogate.getError_type();
        }
        if ((i & 16) != 0) {
            featureSurfaceDto = errorEventDataDto.surrogate.getFeature_surface();
        }
        if ((i & 32) != 0) {
            str2 = errorEventDataDto.surrogate.getPersonal_information_free_log();
        }
        FeatureSurfaceDto featureSurfaceDto2 = featureSurfaceDto;
        String str3 = str2;
        return errorEventDataDto.copy(str, screenDto, componentDto, errorTypeDto, featureSurfaceDto2, str3);
    }

    public final ErrorEventDataDto copy(String tag, ScreenDto screen, ComponentDto component, ErrorTypeDto error_type, FeatureSurfaceDto feature_surface, String personal_information_free_log) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(feature_surface, "feature_surface");
        Intrinsics.checkNotNullParameter(personal_information_free_log, "personal_information_free_log");
        return new ErrorEventDataDto(new Surrogate(tag, screen, component, error_type, feature_surface, personal_information_free_log));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ErrorEventData toProto() {
        String tag = this.surrogate.getTag();
        ScreenDto screen = this.surrogate.getScreen();
        Screen proto = screen != null ? screen.toProto() : null;
        ComponentDto component = this.surrogate.getComponent();
        return new ErrorEventData(tag, proto, component != null ? component.toProto() : null, (ErrorEventData.ErrorType) this.surrogate.getError_type().toProto(), (ErrorEventData.FeatureSurface) this.surrogate.getFeature_surface().toProto(), this.surrogate.getPersonal_information_free_log(), null, 64, null);
    }

    public String toString() {
        return "[ErrorEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ErrorEventDataDto) && Intrinsics.areEqual(((ErrorEventDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: ErrorEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002:;BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003JI\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0010HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J%\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0001¢\u0006\u0002\b9R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Surrogate;", "", "tag", "", "screen", "Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "component", "Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "error_type", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "feature_surface", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "personal_information_free_log", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcom/robinhood/rosetta/eventlogging/ComponentDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ScreenDto;Lcom/robinhood/rosetta/eventlogging/ComponentDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTag$annotations", "()V", "getTag", "()Ljava/lang/String;", "getScreen$annotations", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/ScreenDto;", "getComponent$annotations", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/ComponentDto;", "getError_type$annotations", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "getFeature_surface$annotations", "getFeature_surface", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "getPersonal_information_free_log$annotations", "getPersonal_information_free_log", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ComponentDto component;
        private final ErrorTypeDto error_type;
        private final FeatureSurfaceDto feature_surface;
        private final String personal_information_free_log;
        private final ScreenDto screen;
        private final String tag;

        public Surrogate() {
            this((String) null, (ScreenDto) null, (ComponentDto) null, (ErrorTypeDto) null, (FeatureSurfaceDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto errorTypeDto, FeatureSurfaceDto featureSurfaceDto, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.tag;
            }
            if ((i & 2) != 0) {
                screenDto = surrogate.screen;
            }
            if ((i & 4) != 0) {
                componentDto = surrogate.component;
            }
            if ((i & 8) != 0) {
                errorTypeDto = surrogate.error_type;
            }
            if ((i & 16) != 0) {
                featureSurfaceDto = surrogate.feature_surface;
            }
            if ((i & 32) != 0) {
                str2 = surrogate.personal_information_free_log;
            }
            FeatureSurfaceDto featureSurfaceDto2 = featureSurfaceDto;
            String str3 = str2;
            return surrogate.copy(str, screenDto, componentDto, errorTypeDto, featureSurfaceDto2, str3);
        }

        @SerialName("component")
        @JsonAnnotations2(names = {"component"})
        public static /* synthetic */ void getComponent$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("featureSurface")
        @JsonAnnotations2(names = {"feature_surface"})
        public static /* synthetic */ void getFeature_surface$annotations() {
        }

        @SerialName("personalInformationFreeLog")
        @JsonAnnotations2(names = {"personal_information_free_log"})
        public static /* synthetic */ void getPersonal_information_free_log$annotations() {
        }

        @SerialName("screen")
        @JsonAnnotations2(names = {"screen"})
        public static /* synthetic */ void getScreen$annotations() {
        }

        @SerialName("tag")
        @JsonAnnotations2(names = {"tag"})
        public static /* synthetic */ void getTag$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component2, reason: from getter */
        public final ScreenDto getScreen() {
            return this.screen;
        }

        /* renamed from: component3, reason: from getter */
        public final ComponentDto getComponent() {
            return this.component;
        }

        /* renamed from: component4, reason: from getter */
        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        /* renamed from: component5, reason: from getter */
        public final FeatureSurfaceDto getFeature_surface() {
            return this.feature_surface;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPersonal_information_free_log() {
            return this.personal_information_free_log;
        }

        public final Surrogate copy(String tag, ScreenDto screen, ComponentDto component, ErrorTypeDto error_type, FeatureSurfaceDto feature_surface, String personal_information_free_log) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(feature_surface, "feature_surface");
            Intrinsics.checkNotNullParameter(personal_information_free_log, "personal_information_free_log");
            return new Surrogate(tag, screen, component, error_type, feature_surface, personal_information_free_log);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.tag, surrogate.tag) && Intrinsics.areEqual(this.screen, surrogate.screen) && Intrinsics.areEqual(this.component, surrogate.component) && this.error_type == surrogate.error_type && this.feature_surface == surrogate.feature_surface && Intrinsics.areEqual(this.personal_information_free_log, surrogate.personal_information_free_log);
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            ScreenDto screenDto = this.screen;
            int iHashCode2 = (iHashCode + (screenDto == null ? 0 : screenDto.hashCode())) * 31;
            ComponentDto componentDto = this.component;
            return ((((((iHashCode2 + (componentDto != null ? componentDto.hashCode() : 0)) * 31) + this.error_type.hashCode()) * 31) + this.feature_surface.hashCode()) * 31) + this.personal_information_free_log.hashCode();
        }

        public String toString() {
            return "Surrogate(tag=" + this.tag + ", screen=" + this.screen + ", component=" + this.component + ", error_type=" + this.error_type + ", feature_surface=" + this.feature_surface + ", personal_information_free_log=" + this.personal_information_free_log + ")";
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ErrorEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto errorTypeDto, FeatureSurfaceDto featureSurfaceDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.tag = "";
            } else {
                this.tag = str;
            }
            if ((i & 2) == 0) {
                this.screen = null;
            } else {
                this.screen = screenDto;
            }
            if ((i & 4) == 0) {
                this.component = null;
            } else {
                this.component = componentDto;
            }
            if ((i & 8) == 0) {
                this.error_type = ErrorTypeDto.INSTANCE.getZeroValue();
            } else {
                this.error_type = errorTypeDto;
            }
            if ((i & 16) == 0) {
                this.feature_surface = FeatureSurfaceDto.INSTANCE.getZeroValue();
            } else {
                this.feature_surface = featureSurfaceDto;
            }
            if ((i & 32) == 0) {
                this.personal_information_free_log = "";
            } else {
                this.personal_information_free_log = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.tag, "")) {
                output.encodeStringElement(serialDesc, 0, self.tag);
            }
            ScreenDto screenDto = self.screen;
            if (screenDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ScreenDto.Serializer.INSTANCE, screenDto);
            }
            ComponentDto componentDto = self.component;
            if (componentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ComponentDto.Serializer.INSTANCE, componentDto);
            }
            if (self.error_type != ErrorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, ErrorTypeDto.Serializer.INSTANCE, self.error_type);
            }
            if (self.feature_surface != FeatureSurfaceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, FeatureSurfaceDto.Serializer.INSTANCE, self.feature_surface);
            }
            if (Intrinsics.areEqual(self.personal_information_free_log, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.personal_information_free_log);
        }

        public Surrogate(String tag, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto error_type, FeatureSurfaceDto feature_surface, String personal_information_free_log) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(feature_surface, "feature_surface");
            Intrinsics.checkNotNullParameter(personal_information_free_log, "personal_information_free_log");
            this.tag = tag;
            this.screen = screenDto;
            this.component = componentDto;
            this.error_type = error_type;
            this.feature_surface = feature_surface;
            this.personal_information_free_log = personal_information_free_log;
        }

        public /* synthetic */ Surrogate(String str, ScreenDto screenDto, ComponentDto componentDto, ErrorTypeDto errorTypeDto, FeatureSurfaceDto featureSurfaceDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : screenDto, (i & 4) != 0 ? null : componentDto, (i & 8) != 0 ? ErrorTypeDto.INSTANCE.getZeroValue() : errorTypeDto, (i & 16) != 0 ? FeatureSurfaceDto.INSTANCE.getZeroValue() : featureSurfaceDto, (i & 32) != 0 ? "" : str2);
        }

        public final String getTag() {
            return this.tag;
        }

        public final ScreenDto getScreen() {
            return this.screen;
        }

        public final ComponentDto getComponent() {
            return this.component;
        }

        public final ErrorTypeDto getError_type() {
            return this.error_type;
        }

        public final FeatureSurfaceDto getFeature_surface() {
            return this.feature_surface;
        }

        public final String getPersonal_information_free_log() {
            return this.personal_information_free_log;
        }
    }

    /* compiled from: ErrorEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ErrorEventDataDto, ErrorEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ErrorEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ErrorEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ErrorEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) ErrorEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ErrorEventData> getProtoAdapter() {
            return ErrorEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ErrorEventDataDto getZeroValue() {
            return ErrorEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ErrorEventDataDto fromProto(ErrorEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String tag = proto.getTag();
            Screen screen = proto.getScreen();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ScreenDto screenDtoFromProto = screen != null ? ScreenDto.INSTANCE.fromProto(screen) : null;
            Component component = proto.getComponent();
            return new ErrorEventDataDto(new Surrogate(tag, screenDtoFromProto, component != null ? ComponentDto.INSTANCE.fromProto(component) : null, ErrorTypeDto.INSTANCE.fromProto(proto.getError_type()), FeatureSurfaceDto.INSTANCE.fromProto(proto.getFeature_surface()), proto.getPersonal_information_free_log()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ErrorEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ErrorEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ErrorEventDataDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_TYPE_UNSPECIFIED", "FAILURE_TO_LOAD", "NETWORK_ERROR", "CRASH", "UNHANDLED_SUSPENSE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorTypeDto implements Dto2<ErrorEventData.ErrorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ErrorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorTypeDto, ErrorEventData.ErrorType>> binaryBase64Serializer$delegate;
        public static final ErrorTypeDto ERROR_TYPE_UNSPECIFIED = new ERROR_TYPE_UNSPECIFIED("ERROR_TYPE_UNSPECIFIED", 0);
        public static final ErrorTypeDto FAILURE_TO_LOAD = new FAILURE_TO_LOAD("FAILURE_TO_LOAD", 1);
        public static final ErrorTypeDto NETWORK_ERROR = new NETWORK_ERROR("NETWORK_ERROR", 2);
        public static final ErrorTypeDto CRASH = new CRASH("CRASH", 3);
        public static final ErrorTypeDto UNHANDLED_SUSPENSE = new UNHANDLED_SUSPENSE("UNHANDLED_SUSPENSE", 4);

        private static final /* synthetic */ ErrorTypeDto[] $values() {
            return new ErrorTypeDto[]{ERROR_TYPE_UNSPECIFIED, FAILURE_TO_LOAD, NETWORK_ERROR, CRASH, UNHANDLED_SUSPENSE};
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

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ErrorEventDataDto.ErrorTypeDto.ERROR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_TYPE_UNSPECIFIED extends ErrorTypeDto {
            ERROR_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ErrorEventData.ErrorType toProto() {
                return ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ErrorEventDataDto$ErrorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ErrorEventDataDto.ErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ErrorEventDataDto.ErrorTypeDto.FAILURE_TO_LOAD", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILURE_TO_LOAD extends ErrorTypeDto {
            FAILURE_TO_LOAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ErrorEventData.ErrorType toProto() {
                return ErrorEventData.ErrorType.FAILURE_TO_LOAD;
            }
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ErrorEventDataDto.ErrorTypeDto.NETWORK_ERROR", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NETWORK_ERROR extends ErrorTypeDto {
            NETWORK_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ErrorEventData.ErrorType toProto() {
                return ErrorEventData.ErrorType.NETWORK_ERROR;
            }
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ErrorEventDataDto.ErrorTypeDto.CRASH", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CRASH extends ErrorTypeDto {
            CRASH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ErrorEventData.ErrorType toProto() {
                return ErrorEventData.ErrorType.CRASH;
            }
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ErrorEventDataDto.ErrorTypeDto.UNHANDLED_SUSPENSE", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNHANDLED_SUSPENSE extends ErrorTypeDto {
            UNHANDLED_SUSPENSE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ErrorEventData.ErrorType toProto() {
                return ErrorEventData.ErrorType.UNHANDLED_SUSPENSE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$ErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ErrorTypeDto, ErrorEventData.ErrorType> {

            /* compiled from: ErrorEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ErrorEventData.ErrorType.values().length];
                    try {
                        iArr[ErrorEventData.ErrorType.ERROR_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ErrorEventData.ErrorType.FAILURE_TO_LOAD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ErrorEventData.ErrorType.NETWORK_ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ErrorEventData.ErrorType.CRASH.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ErrorEventData.ErrorType.UNHANDLED_SUSPENSE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
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
            public ProtoAdapter<ErrorEventData.ErrorType> getProtoAdapter() {
                return ErrorEventData.ErrorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto getZeroValue() {
                return ErrorTypeDto.ERROR_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorTypeDto fromProto(ErrorEventData.ErrorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return ErrorTypeDto.ERROR_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return ErrorTypeDto.FAILURE_TO_LOAD;
                }
                if (i == 3) {
                    return ErrorTypeDto.NETWORK_ERROR;
                }
                if (i == 4) {
                    return ErrorTypeDto.CRASH;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return ErrorTypeDto.UNHANDLED_SUSPENSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$ErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ErrorTypeDto, ErrorEventData.ErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ErrorEventData.ErrorType", ErrorTypeDto.getEntries(), ErrorTypeDto.INSTANCE.getZeroValue());

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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ErrorEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016j\u0002\b\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURE_SURFACE_UNSPECIFIED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FeatureSurfaceDto implements Dto2<ErrorEventData.FeatureSurface>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FeatureSurfaceDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FeatureSurfaceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FeatureSurfaceDto FEATURE_SURFACE_UNSPECIFIED = new FEATURE_SURFACE_UNSPECIFIED("FEATURE_SURFACE_UNSPECIFIED", 0);
        private static final Lazy<BinaryBase64DtoSerializer<FeatureSurfaceDto, ErrorEventData.FeatureSurface>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ FeatureSurfaceDto[] $values() {
            return new FeatureSurfaceDto[]{FEATURE_SURFACE_UNSPECIFIED};
        }

        public /* synthetic */ FeatureSurfaceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FeatureSurfaceDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ErrorEventDataDto.FeatureSurfaceDto.FEATURE_SURFACE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FEATURE_SURFACE_UNSPECIFIED extends FeatureSurfaceDto {
            FEATURE_SURFACE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ErrorEventData.FeatureSurface toProto() {
                return ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED;
            }
        }

        private FeatureSurfaceDto(String str, int i) {
        }

        static {
            FeatureSurfaceDto[] featureSurfaceDtoArr$values = $values();
            $VALUES = featureSurfaceDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(featureSurfaceDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ErrorEventDataDto$FeatureSurfaceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ErrorEventDataDto.FeatureSurfaceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData$FeatureSurface;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FeatureSurfaceDto, ErrorEventData.FeatureSurface> {

            /* compiled from: ErrorEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ErrorEventData.FeatureSurface.values().length];
                    try {
                        iArr[ErrorEventData.FeatureSurface.FEATURE_SURFACE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FeatureSurfaceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FeatureSurfaceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FeatureSurfaceDto> getBinaryBase64Serializer() {
                return (KSerializer) FeatureSurfaceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ErrorEventData.FeatureSurface> getProtoAdapter() {
                return ErrorEventData.FeatureSurface.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FeatureSurfaceDto getZeroValue() {
                return FeatureSurfaceDto.FEATURE_SURFACE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FeatureSurfaceDto fromProto(ErrorEventData.FeatureSurface proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                return FeatureSurfaceDto.FEATURE_SURFACE_UNSPECIFIED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ErrorEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$FeatureSurfaceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<FeatureSurfaceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FeatureSurfaceDto, ErrorEventData.FeatureSurface> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ErrorEventData.FeatureSurface", FeatureSurfaceDto.getEntries(), FeatureSurfaceDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FeatureSurfaceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FeatureSurfaceDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FeatureSurfaceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FeatureSurfaceDto valueOf(String str) {
            return (FeatureSurfaceDto) Enum.valueOf(FeatureSurfaceDto.class, str);
        }

        public static FeatureSurfaceDto[] values() {
            return (FeatureSurfaceDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ErrorEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ErrorEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ErrorEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ErrorEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ErrorEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ErrorEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ErrorEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ErrorEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ErrorEventDataDto";
        }
    }
}
