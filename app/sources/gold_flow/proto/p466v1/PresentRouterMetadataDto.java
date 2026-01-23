package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.ActionDto;
import gold_flow.proto.p466v1.PresentationTypeDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: PresentRouterMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/PresentRouterMetadata;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;)V", "", "screen_logging_identifier", "Lgold_flow/proto/v1/PresentationTypeDto;", "presentation_type", "Lgold_flow/proto/v1/ActionDto;", "custom_back_action", "", "dismiss_on_custom_back_action", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/ActionDto;Ljava/lang/Boolean;)V", "toProto", "()Lgold_flow/proto/v1/PresentRouterMetadata;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class PresentRouterMetadataDto implements Dto3<PresentRouterMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PresentRouterMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PresentRouterMetadataDto, PresentRouterMetadata>> binaryBase64Serializer$delegate;
    private static final PresentRouterMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PresentRouterMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PresentRouterMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ PresentRouterMetadataDto(String str, PresentationTypeDto presentationTypeDto, ActionDto actionDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : presentationTypeDto, (i & 4) != 0 ? null : actionDto, (i & 8) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentRouterMetadataDto(String screen_logging_identifier, PresentationTypeDto presentationTypeDto, ActionDto actionDto, Boolean bool) {
        this(new Surrogate(screen_logging_identifier, presentationTypeDto, actionDto, bool));
        Intrinsics.checkNotNullParameter(screen_logging_identifier, "screen_logging_identifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PresentRouterMetadata toProto() {
        String screen_logging_identifier = this.surrogate.getScreen_logging_identifier();
        PresentationTypeDto presentation_type = this.surrogate.getPresentation_type();
        PresentationType presentationType = presentation_type != null ? (PresentationType) presentation_type.toProto() : null;
        ActionDto custom_back_action = this.surrogate.getCustom_back_action();
        return new PresentRouterMetadata(screen_logging_identifier, presentationType, custom_back_action != null ? custom_back_action.toProto() : null, this.surrogate.getDismiss_on_custom_back_action(), null, 16, null);
    }

    public String toString() {
        return "[PresentRouterMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PresentRouterMetadataDto) && Intrinsics.areEqual(((PresentRouterMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: PresentRouterMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b0\u0010$\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;", "", "", "screen_logging_identifier", "Lgold_flow/proto/v1/PresentationTypeDto;", "presentation_type", "Lgold_flow/proto/v1/ActionDto;", "custom_back_action", "", "dismiss_on_custom_back_action", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/ActionDto;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/ActionDto;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreen_logging_identifier", "getScreen_logging_identifier$annotations", "()V", "Lgold_flow/proto/v1/PresentationTypeDto;", "getPresentation_type", "()Lgold_flow/proto/v1/PresentationTypeDto;", "getPresentation_type$annotations", "Lgold_flow/proto/v1/ActionDto;", "getCustom_back_action", "()Lgold_flow/proto/v1/ActionDto;", "getCustom_back_action$annotations", "Ljava/lang/Boolean;", "getDismiss_on_custom_back_action", "()Ljava/lang/Boolean;", "getDismiss_on_custom_back_action$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto custom_back_action;
        private final Boolean dismiss_on_custom_back_action;
        private final PresentationTypeDto presentation_type;
        private final String screen_logging_identifier;

        public Surrogate() {
            this((String) null, (PresentationTypeDto) null, (ActionDto) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.screen_logging_identifier, surrogate.screen_logging_identifier) && this.presentation_type == surrogate.presentation_type && Intrinsics.areEqual(this.custom_back_action, surrogate.custom_back_action) && Intrinsics.areEqual(this.dismiss_on_custom_back_action, surrogate.dismiss_on_custom_back_action);
        }

        public int hashCode() {
            int iHashCode = this.screen_logging_identifier.hashCode() * 31;
            PresentationTypeDto presentationTypeDto = this.presentation_type;
            int iHashCode2 = (iHashCode + (presentationTypeDto == null ? 0 : presentationTypeDto.hashCode())) * 31;
            ActionDto actionDto = this.custom_back_action;
            int iHashCode3 = (iHashCode2 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
            Boolean bool = this.dismiss_on_custom_back_action;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(screen_logging_identifier=" + this.screen_logging_identifier + ", presentation_type=" + this.presentation_type + ", custom_back_action=" + this.custom_back_action + ", dismiss_on_custom_back_action=" + this.dismiss_on_custom_back_action + ")";
        }

        /* compiled from: PresentRouterMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PresentRouterMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, PresentationTypeDto presentationTypeDto, ActionDto actionDto, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            this.screen_logging_identifier = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.presentation_type = null;
            } else {
                this.presentation_type = presentationTypeDto;
            }
            if ((i & 4) == 0) {
                this.custom_back_action = null;
            } else {
                this.custom_back_action = actionDto;
            }
            if ((i & 8) == 0) {
                this.dismiss_on_custom_back_action = null;
            } else {
                this.dismiss_on_custom_back_action = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.screen_logging_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.screen_logging_identifier);
            }
            PresentationTypeDto presentationTypeDto = self.presentation_type;
            if (presentationTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PresentationTypeDto.Serializer.INSTANCE, presentationTypeDto);
            }
            ActionDto actionDto = self.custom_back_action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ActionDto.Serializer.INSTANCE, actionDto);
            }
            Boolean bool = self.dismiss_on_custom_back_action;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(String screen_logging_identifier, PresentationTypeDto presentationTypeDto, ActionDto actionDto, Boolean bool) {
            Intrinsics.checkNotNullParameter(screen_logging_identifier, "screen_logging_identifier");
            this.screen_logging_identifier = screen_logging_identifier;
            this.presentation_type = presentationTypeDto;
            this.custom_back_action = actionDto;
            this.dismiss_on_custom_back_action = bool;
        }

        public final String getScreen_logging_identifier() {
            return this.screen_logging_identifier;
        }

        public /* synthetic */ Surrogate(String str, PresentationTypeDto presentationTypeDto, ActionDto actionDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : presentationTypeDto, (i & 4) != 0 ? null : actionDto, (i & 8) != 0 ? null : bool);
        }

        public final PresentationTypeDto getPresentation_type() {
            return this.presentation_type;
        }

        public final ActionDto getCustom_back_action() {
            return this.custom_back_action;
        }

        public final Boolean getDismiss_on_custom_back_action() {
            return this.dismiss_on_custom_back_action;
        }
    }

    /* compiled from: PresentRouterMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/PresentRouterMetadataDto;", "Lgold_flow/proto/v1/PresentRouterMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/PresentRouterMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PresentRouterMetadataDto, PresentRouterMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PresentRouterMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PresentRouterMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PresentRouterMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) PresentRouterMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PresentRouterMetadata> getProtoAdapter() {
            return PresentRouterMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PresentRouterMetadataDto getZeroValue() {
            return PresentRouterMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PresentRouterMetadataDto fromProto(PresentRouterMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String screen_logging_identifier = proto.getScreen_logging_identifier();
            PresentationType presentation_type = proto.getPresentation_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            PresentationTypeDto presentationTypeDtoFromProto = presentation_type != null ? PresentationTypeDto.INSTANCE.fromProto(presentation_type) : null;
            Action custom_back_action = proto.getCustom_back_action();
            return new PresentRouterMetadataDto(new Surrogate(screen_logging_identifier, presentationTypeDtoFromProto, custom_back_action != null ? ActionDto.INSTANCE.fromProto(custom_back_action) : null, proto.getDismiss_on_custom_back_action()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.PresentRouterMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PresentRouterMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PresentRouterMetadataDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PresentRouterMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/PresentRouterMetadataDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/PresentRouterMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PresentRouterMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.PresentRouterMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PresentRouterMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PresentRouterMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PresentRouterMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PresentRouterMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/PresentRouterMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.PresentRouterMetadataDto";
        }
    }
}
