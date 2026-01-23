package options_product.service;

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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import options_product.service.FailureResponseMetadata;
import options_product.service.FailureResponseMetadataDto;

/* compiled from: FailureResponseMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006+*,-./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014¨\u00060"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/FailureResponseMetadata;", "Landroid/os/Parcelable;", "Loptions_product/service/FailureResponseMetadataDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/FailureResponseMetadataDto$Surrogate;)V", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "failure_type", "", "message_override", "primary_cta_deeplink_action", "primary_cta_message_override", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "graphic_type", "(Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;)V", "toProto", "()Loptions_product/service/FailureResponseMetadata;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/FailureResponseMetadataDto$Surrogate;", "getFailure_type", "()Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "getMessage_override", "getPrimary_cta_deeplink_action", "getPrimary_cta_message_override", "Companion", "Surrogate", "FailureTypeDto", "GraphicTypeDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class FailureResponseMetadataDto implements Dto3<FailureResponseMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FailureResponseMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FailureResponseMetadataDto, FailureResponseMetadata>> binaryBase64Serializer$delegate;
    private static final FailureResponseMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FailureResponseMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FailureResponseMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FailureTypeDto getFailure_type() {
        return this.surrogate.getFailure_type();
    }

    public final String getMessage_override() {
        return this.surrogate.getMessage_override();
    }

    public final String getPrimary_cta_deeplink_action() {
        return this.surrogate.getPrimary_cta_deeplink_action();
    }

    public final String getPrimary_cta_message_override() {
        return this.surrogate.getPrimary_cta_message_override();
    }

    public /* synthetic */ FailureResponseMetadataDto(FailureTypeDto failureTypeDto, String str, String str2, String str3, GraphicTypeDto graphicTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FailureTypeDto.INSTANCE.getZeroValue() : failureTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? GraphicTypeDto.INSTANCE.getZeroValue() : graphicTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FailureResponseMetadataDto(FailureTypeDto failure_type, String str, String str2, String str3, GraphicTypeDto graphic_type) {
        this(new Surrogate(failure_type, str, str2, str3, graphic_type));
        Intrinsics.checkNotNullParameter(failure_type, "failure_type");
        Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public FailureResponseMetadata toProto() {
        return new FailureResponseMetadata((FailureResponseMetadata.FailureType) this.surrogate.getFailure_type().toProto(), this.surrogate.getMessage_override(), this.surrogate.getPrimary_cta_deeplink_action(), this.surrogate.getPrimary_cta_message_override(), (FailureResponseMetadata.GraphicType) this.surrogate.getGraphic_type().toProto(), null, 32, null);
    }

    public String toString() {
        return "[FailureResponseMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FailureResponseMetadataDto) && Intrinsics.areEqual(((FailureResponseMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: FailureResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b-\u0010&\u001a\u0004\b,\u0010\u001bR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$Surrogate;", "", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "failure_type", "", "message_override", "primary_cta_deeplink_action", "primary_cta_message_override", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "graphic_type", "<init>", "(Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILoptions_product/service/FailureResponseMetadataDto$FailureTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/FailureResponseMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "getFailure_type", "()Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "getFailure_type$annotations", "()V", "Ljava/lang/String;", "getMessage_override", "getMessage_override$annotations", "getPrimary_cta_deeplink_action", "getPrimary_cta_deeplink_action$annotations", "getPrimary_cta_message_override", "getPrimary_cta_message_override$annotations", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "getGraphic_type", "()Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "getGraphic_type$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FailureTypeDto failure_type;
        private final GraphicTypeDto graphic_type;
        private final String message_override;
        private final String primary_cta_deeplink_action;
        private final String primary_cta_message_override;

        public Surrogate() {
            this((FailureTypeDto) null, (String) null, (String) null, (String) null, (GraphicTypeDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.failure_type == surrogate.failure_type && Intrinsics.areEqual(this.message_override, surrogate.message_override) && Intrinsics.areEqual(this.primary_cta_deeplink_action, surrogate.primary_cta_deeplink_action) && Intrinsics.areEqual(this.primary_cta_message_override, surrogate.primary_cta_message_override) && this.graphic_type == surrogate.graphic_type;
        }

        public int hashCode() {
            int iHashCode = this.failure_type.hashCode() * 31;
            String str = this.message_override;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.primary_cta_deeplink_action;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.primary_cta_message_override;
            return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.graphic_type.hashCode();
        }

        public String toString() {
            return "Surrogate(failure_type=" + this.failure_type + ", message_override=" + this.message_override + ", primary_cta_deeplink_action=" + this.primary_cta_deeplink_action + ", primary_cta_message_override=" + this.primary_cta_message_override + ", graphic_type=" + this.graphic_type + ")";
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/FailureResponseMetadataDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FailureResponseMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FailureTypeDto failureTypeDto, String str, String str2, String str3, GraphicTypeDto graphicTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.failure_type = (i & 1) == 0 ? FailureTypeDto.INSTANCE.getZeroValue() : failureTypeDto;
            if ((i & 2) == 0) {
                this.message_override = null;
            } else {
                this.message_override = str;
            }
            if ((i & 4) == 0) {
                this.primary_cta_deeplink_action = null;
            } else {
                this.primary_cta_deeplink_action = str2;
            }
            if ((i & 8) == 0) {
                this.primary_cta_message_override = null;
            } else {
                this.primary_cta_message_override = str3;
            }
            if ((i & 16) == 0) {
                this.graphic_type = GraphicTypeDto.INSTANCE.getZeroValue();
            } else {
                this.graphic_type = graphicTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.failure_type != FailureTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, FailureTypeDto.Serializer.INSTANCE, self.failure_type);
            }
            String str = self.message_override;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            String str2 = self.primary_cta_deeplink_action;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.primary_cta_message_override;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str3);
            }
            if (self.graphic_type != GraphicTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, GraphicTypeDto.Serializer.INSTANCE, self.graphic_type);
            }
        }

        public Surrogate(FailureTypeDto failure_type, String str, String str2, String str3, GraphicTypeDto graphic_type) {
            Intrinsics.checkNotNullParameter(failure_type, "failure_type");
            Intrinsics.checkNotNullParameter(graphic_type, "graphic_type");
            this.failure_type = failure_type;
            this.message_override = str;
            this.primary_cta_deeplink_action = str2;
            this.primary_cta_message_override = str3;
            this.graphic_type = graphic_type;
        }

        public final FailureTypeDto getFailure_type() {
            return this.failure_type;
        }

        public /* synthetic */ Surrogate(FailureTypeDto failureTypeDto, String str, String str2, String str3, GraphicTypeDto graphicTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? FailureTypeDto.INSTANCE.getZeroValue() : failureTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? GraphicTypeDto.INSTANCE.getZeroValue() : graphicTypeDto);
        }

        public final String getMessage_override() {
            return this.message_override;
        }

        public final String getPrimary_cta_deeplink_action() {
            return this.primary_cta_deeplink_action;
        }

        public final String getPrimary_cta_message_override() {
            return this.primary_cta_message_override;
        }

        public final GraphicTypeDto getGraphic_type() {
            return this.graphic_type;
        }
    }

    /* compiled from: FailureResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/FailureResponseMetadataDto;", "Loptions_product/service/FailureResponseMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/FailureResponseMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<FailureResponseMetadataDto, FailureResponseMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FailureResponseMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FailureResponseMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FailureResponseMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) FailureResponseMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FailureResponseMetadata> getProtoAdapter() {
            return FailureResponseMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FailureResponseMetadataDto getZeroValue() {
            return FailureResponseMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FailureResponseMetadataDto fromProto(FailureResponseMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new FailureResponseMetadataDto(new Surrogate(FailureTypeDto.INSTANCE.fromProto(proto.getFailure_type()), proto.getMessage_override(), proto.getPrimary_cta_deeplink_action(), proto.getPrimary_cta_message_override(), GraphicTypeDto.INSTANCE.fromProto(proto.getGraphic_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.FailureResponseMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FailureResponseMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FailureResponseMetadataDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FailureResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\"#B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006$"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/FailureResponseMetadata$FailureType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FAILURE_UNSPECIFIED", "HARD_REJECT", "MANUAL_REVIEW_L2", "MANUAL_REVIEW_L3", "NOT_SUITABLE", "PENDING", "PROFESSIONAL_TRADER", "L2_TO_L3_FAILURE", "NOT_SUITABLE_RETRY_AVAILABLE", "NOT_SUITABLE_IP", "NOT_SUITABLE_V2", "RHSG_CAR_FAILURE_RETRY_AVAILABLE", "JA_NOT_ELIGIBLE", "JA_L2_NOT_ELIGIBLE", "JA_MANUAL_REVIEW", "JA_L2_MANUAL_REVIEW", "JA_COOWNER_MANUAL_REVIEW", "JA_BOTH_MANUAL_REVIEW", "JA_BOTH_L2_MANUAL_REVIEW", "IN_REVIEW_NO_ACTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FailureTypeDto implements Dto2<FailureResponseMetadata.FailureType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FailureTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FailureTypeDto, FailureResponseMetadata.FailureType>> binaryBase64Serializer$delegate;
        public static final FailureTypeDto FAILURE_UNSPECIFIED = new FAILURE_UNSPECIFIED("FAILURE_UNSPECIFIED", 0);
        public static final FailureTypeDto HARD_REJECT = new HARD_REJECT("HARD_REJECT", 1);
        public static final FailureTypeDto MANUAL_REVIEW_L2 = new MANUAL_REVIEW_L2("MANUAL_REVIEW_L2", 2);
        public static final FailureTypeDto MANUAL_REVIEW_L3 = new MANUAL_REVIEW_L3("MANUAL_REVIEW_L3", 3);
        public static final FailureTypeDto NOT_SUITABLE = new NOT_SUITABLE("NOT_SUITABLE", 4);
        public static final FailureTypeDto PENDING = new PENDING("PENDING", 5);
        public static final FailureTypeDto PROFESSIONAL_TRADER = new PROFESSIONAL_TRADER("PROFESSIONAL_TRADER", 6);
        public static final FailureTypeDto L2_TO_L3_FAILURE = new L2_TO_L3_FAILURE("L2_TO_L3_FAILURE", 7);
        public static final FailureTypeDto NOT_SUITABLE_RETRY_AVAILABLE = new NOT_SUITABLE_RETRY_AVAILABLE("NOT_SUITABLE_RETRY_AVAILABLE", 8);
        public static final FailureTypeDto NOT_SUITABLE_IP = new NOT_SUITABLE_IP("NOT_SUITABLE_IP", 9);
        public static final FailureTypeDto NOT_SUITABLE_V2 = new NOT_SUITABLE_V2("NOT_SUITABLE_V2", 10);
        public static final FailureTypeDto RHSG_CAR_FAILURE_RETRY_AVAILABLE = new RHSG_CAR_FAILURE_RETRY_AVAILABLE("RHSG_CAR_FAILURE_RETRY_AVAILABLE", 11);
        public static final FailureTypeDto JA_NOT_ELIGIBLE = new JA_NOT_ELIGIBLE("JA_NOT_ELIGIBLE", 12);
        public static final FailureTypeDto JA_L2_NOT_ELIGIBLE = new JA_L2_NOT_ELIGIBLE("JA_L2_NOT_ELIGIBLE", 13);
        public static final FailureTypeDto JA_MANUAL_REVIEW = new JA_MANUAL_REVIEW("JA_MANUAL_REVIEW", 14);
        public static final FailureTypeDto JA_L2_MANUAL_REVIEW = new JA_L2_MANUAL_REVIEW("JA_L2_MANUAL_REVIEW", 15);
        public static final FailureTypeDto JA_COOWNER_MANUAL_REVIEW = new JA_COOWNER_MANUAL_REVIEW("JA_COOWNER_MANUAL_REVIEW", 16);
        public static final FailureTypeDto JA_BOTH_MANUAL_REVIEW = new JA_BOTH_MANUAL_REVIEW("JA_BOTH_MANUAL_REVIEW", 17);
        public static final FailureTypeDto JA_BOTH_L2_MANUAL_REVIEW = new JA_BOTH_L2_MANUAL_REVIEW("JA_BOTH_L2_MANUAL_REVIEW", 18);
        public static final FailureTypeDto IN_REVIEW_NO_ACTION = new IN_REVIEW_NO_ACTION("IN_REVIEW_NO_ACTION", 19);

        private static final /* synthetic */ FailureTypeDto[] $values() {
            return new FailureTypeDto[]{FAILURE_UNSPECIFIED, HARD_REJECT, MANUAL_REVIEW_L2, MANUAL_REVIEW_L3, NOT_SUITABLE, PENDING, PROFESSIONAL_TRADER, L2_TO_L3_FAILURE, NOT_SUITABLE_RETRY_AVAILABLE, NOT_SUITABLE_IP, NOT_SUITABLE_V2, RHSG_CAR_FAILURE_RETRY_AVAILABLE, JA_NOT_ELIGIBLE, JA_L2_NOT_ELIGIBLE, JA_MANUAL_REVIEW, JA_L2_MANUAL_REVIEW, JA_COOWNER_MANUAL_REVIEW, JA_BOTH_MANUAL_REVIEW, JA_BOTH_L2_MANUAL_REVIEW, IN_REVIEW_NO_ACTION};
        }

        public /* synthetic */ FailureTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FailureTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.FAILURE_UNSPECIFIED", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILURE_UNSPECIFIED extends FailureTypeDto {
            FAILURE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.FAILURE_UNSPECIFIED;
            }
        }

        private FailureTypeDto(String str, int i) {
        }

        static {
            FailureTypeDto[] failureTypeDtoArr$values = $values();
            $VALUES = failureTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(failureTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.FailureResponseMetadataDto$FailureTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FailureResponseMetadataDto.FailureTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.HARD_REJECT", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HARD_REJECT extends FailureTypeDto {
            HARD_REJECT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.HARD_REJECT;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.MANUAL_REVIEW_L2", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MANUAL_REVIEW_L2 extends FailureTypeDto {
            MANUAL_REVIEW_L2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.MANUAL_REVIEW_L2;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.MANUAL_REVIEW_L3", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MANUAL_REVIEW_L3 extends FailureTypeDto {
            MANUAL_REVIEW_L3(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.MANUAL_REVIEW_L3;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOT_SUITABLE extends FailureTypeDto {
            NOT_SUITABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.NOT_SUITABLE;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.PENDING", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING extends FailureTypeDto {
            PENDING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.PENDING;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.PROFESSIONAL_TRADER", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROFESSIONAL_TRADER extends FailureTypeDto {
            PROFESSIONAL_TRADER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.PROFESSIONAL_TRADER;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.L2_TO_L3_FAILURE", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class L2_TO_L3_FAILURE extends FailureTypeDto {
            L2_TO_L3_FAILURE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.L2_TO_L3_FAILURE;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_RETRY_AVAILABLE", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NOT_SUITABLE_RETRY_AVAILABLE extends FailureTypeDto {
            NOT_SUITABLE_RETRY_AVAILABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.NOT_SUITABLE_RETRY_AVAILABLE;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_IP", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class NOT_SUITABLE_IP extends FailureTypeDto {
            NOT_SUITABLE_IP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.NOT_SUITABLE_IP;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.NOT_SUITABLE_V2", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class NOT_SUITABLE_V2 extends FailureTypeDto {
            NOT_SUITABLE_V2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.NOT_SUITABLE_V2;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.RHSG_CAR_FAILURE_RETRY_AVAILABLE", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class RHSG_CAR_FAILURE_RETRY_AVAILABLE extends FailureTypeDto {
            RHSG_CAR_FAILURE_RETRY_AVAILABLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.RHSG_CAR_FAILURE_RETRY_AVAILABLE;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_NOT_ELIGIBLE", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_NOT_ELIGIBLE extends FailureTypeDto {
            JA_NOT_ELIGIBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_NOT_ELIGIBLE;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_L2_NOT_ELIGIBLE", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_L2_NOT_ELIGIBLE extends FailureTypeDto {
            JA_L2_NOT_ELIGIBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_L2_NOT_ELIGIBLE;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_MANUAL_REVIEW", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_MANUAL_REVIEW extends FailureTypeDto {
            JA_MANUAL_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_MANUAL_REVIEW;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_L2_MANUAL_REVIEW", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_L2_MANUAL_REVIEW extends FailureTypeDto {
            JA_L2_MANUAL_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_L2_MANUAL_REVIEW;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_COOWNER_MANUAL_REVIEW", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_COOWNER_MANUAL_REVIEW extends FailureTypeDto {
            JA_COOWNER_MANUAL_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_COOWNER_MANUAL_REVIEW;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_BOTH_MANUAL_REVIEW", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_BOTH_MANUAL_REVIEW extends FailureTypeDto {
            JA_BOTH_MANUAL_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_BOTH_MANUAL_REVIEW;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.JA_BOTH_L2_MANUAL_REVIEW", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class JA_BOTH_L2_MANUAL_REVIEW extends FailureTypeDto {
            JA_BOTH_L2_MANUAL_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.JA_BOTH_L2_MANUAL_REVIEW;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.FailureTypeDto.IN_REVIEW_NO_ACTION", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$FailureType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class IN_REVIEW_NO_ACTION extends FailureTypeDto {
            IN_REVIEW_NO_ACTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.FailureType toProto() {
                return FailureResponseMetadata.FailureType.IN_REVIEW_NO_ACTION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "Loptions_product/service/FailureResponseMetadata$FailureType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FailureTypeDto, FailureResponseMetadata.FailureType> {

            /* compiled from: FailureResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FailureResponseMetadata.FailureType.values().length];
                    try {
                        iArr[FailureResponseMetadata.FailureType.FAILURE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.HARD_REJECT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.MANUAL_REVIEW_L2.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.MANUAL_REVIEW_L3.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.NOT_SUITABLE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.PENDING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.PROFESSIONAL_TRADER.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.L2_TO_L3_FAILURE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.NOT_SUITABLE_RETRY_AVAILABLE.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.NOT_SUITABLE_IP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.NOT_SUITABLE_V2.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.RHSG_CAR_FAILURE_RETRY_AVAILABLE.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_NOT_ELIGIBLE.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_L2_NOT_ELIGIBLE.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_MANUAL_REVIEW.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_L2_MANUAL_REVIEW.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_COOWNER_MANUAL_REVIEW.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_BOTH_MANUAL_REVIEW.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.JA_BOTH_L2_MANUAL_REVIEW.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[FailureResponseMetadata.FailureType.IN_REVIEW_NO_ACTION.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FailureTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FailureTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FailureTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) FailureTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FailureResponseMetadata.FailureType> getProtoAdapter() {
                return FailureResponseMetadata.FailureType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FailureTypeDto getZeroValue() {
                return FailureTypeDto.FAILURE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FailureTypeDto fromProto(FailureResponseMetadata.FailureType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return FailureTypeDto.FAILURE_UNSPECIFIED;
                    case 2:
                        return FailureTypeDto.HARD_REJECT;
                    case 3:
                        return FailureTypeDto.MANUAL_REVIEW_L2;
                    case 4:
                        return FailureTypeDto.MANUAL_REVIEW_L3;
                    case 5:
                        return FailureTypeDto.NOT_SUITABLE;
                    case 6:
                        return FailureTypeDto.PENDING;
                    case 7:
                        return FailureTypeDto.PROFESSIONAL_TRADER;
                    case 8:
                        return FailureTypeDto.L2_TO_L3_FAILURE;
                    case 9:
                        return FailureTypeDto.NOT_SUITABLE_RETRY_AVAILABLE;
                    case 10:
                        return FailureTypeDto.NOT_SUITABLE_IP;
                    case 11:
                        return FailureTypeDto.NOT_SUITABLE_V2;
                    case 12:
                        return FailureTypeDto.RHSG_CAR_FAILURE_RETRY_AVAILABLE;
                    case 13:
                        return FailureTypeDto.JA_NOT_ELIGIBLE;
                    case 14:
                        return FailureTypeDto.JA_L2_NOT_ELIGIBLE;
                    case 15:
                        return FailureTypeDto.JA_MANUAL_REVIEW;
                    case 16:
                        return FailureTypeDto.JA_L2_MANUAL_REVIEW;
                    case 17:
                        return FailureTypeDto.JA_COOWNER_MANUAL_REVIEW;
                    case 18:
                        return FailureTypeDto.JA_BOTH_MANUAL_REVIEW;
                    case 19:
                        return FailureTypeDto.JA_BOTH_L2_MANUAL_REVIEW;
                    case 20:
                        return FailureTypeDto.IN_REVIEW_NO_ACTION;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/FailureResponseMetadataDto$FailureTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<FailureTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FailureTypeDto, FailureResponseMetadata.FailureType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.FailureResponseMetadata.FailureType", FailureTypeDto.getEntries(), FailureTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FailureTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FailureTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FailureTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FailureTypeDto valueOf(String str) {
            return (FailureTypeDto) Enum.valueOf(FailureTypeDto.class, str);
        }

        public static FailureTypeDto[] values() {
            return (FailureTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FailureResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "GRAPHIC_TYPE_UNSPECIFIED", "GRAPHIC_TYPE_INDIVIDUAL", "GRAPHIC_TYPE_RETIREMENT", "GRAPHIC_TYPE_JOINT_ACCOUNT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    /* loaded from: classes25.dex */
    public static final class GraphicTypeDto implements Dto2<FailureResponseMetadata.GraphicType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GraphicTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<GraphicTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<GraphicTypeDto, FailureResponseMetadata.GraphicType>> binaryBase64Serializer$delegate;
        public static final GraphicTypeDto GRAPHIC_TYPE_UNSPECIFIED = new GRAPHIC_TYPE_UNSPECIFIED("GRAPHIC_TYPE_UNSPECIFIED", 0);
        public static final GraphicTypeDto GRAPHIC_TYPE_INDIVIDUAL = new GRAPHIC_TYPE_INDIVIDUAL("GRAPHIC_TYPE_INDIVIDUAL", 1);
        public static final GraphicTypeDto GRAPHIC_TYPE_RETIREMENT = new GRAPHIC_TYPE_RETIREMENT("GRAPHIC_TYPE_RETIREMENT", 2);
        public static final GraphicTypeDto GRAPHIC_TYPE_JOINT_ACCOUNT = new GRAPHIC_TYPE_JOINT_ACCOUNT("GRAPHIC_TYPE_JOINT_ACCOUNT", 3);

        private static final /* synthetic */ GraphicTypeDto[] $values() {
            return new GraphicTypeDto[]{GRAPHIC_TYPE_UNSPECIFIED, GRAPHIC_TYPE_INDIVIDUAL, GRAPHIC_TYPE_RETIREMENT, GRAPHIC_TYPE_JOINT_ACCOUNT};
        }

        public /* synthetic */ GraphicTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<GraphicTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_UNSPECIFIED", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_UNSPECIFIED extends GraphicTypeDto {
            GRAPHIC_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.GraphicType toProto() {
                return FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED;
            }
        }

        private GraphicTypeDto(String str, int i) {
        }

        static {
            GraphicTypeDto[] graphicTypeDtoArr$values = $values();
            $VALUES = graphicTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(graphicTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.FailureResponseMetadataDto$GraphicTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FailureResponseMetadataDto.GraphicTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_INDIVIDUAL", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_INDIVIDUAL extends GraphicTypeDto {
            GRAPHIC_TYPE_INDIVIDUAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.GraphicType toProto() {
                return FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_INDIVIDUAL;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_RETIREMENT", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_RETIREMENT extends GraphicTypeDto {
            GRAPHIC_TYPE_RETIREMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.GraphicType toProto() {
                return FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_RETIREMENT;
            }
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/FailureResponseMetadataDto.GraphicTypeDto.GRAPHIC_TYPE_JOINT_ACCOUNT", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "toProto", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GRAPHIC_TYPE_JOINT_ACCOUNT extends GraphicTypeDto {
            GRAPHIC_TYPE_JOINT_ACCOUNT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public FailureResponseMetadata.GraphicType toProto() {
                return FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_JOINT_ACCOUNT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "Loptions_product/service/FailureResponseMetadata$GraphicType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<GraphicTypeDto, FailureResponseMetadata.GraphicType> {

            /* compiled from: FailureResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FailureResponseMetadata.GraphicType.values().length];
                    try {
                        iArr[FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_INDIVIDUAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_RETIREMENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[FailureResponseMetadata.GraphicType.GRAPHIC_TYPE_JOINT_ACCOUNT.ordinal()] = 4;
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

            public final KSerializer<GraphicTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GraphicTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<GraphicTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) GraphicTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<FailureResponseMetadata.GraphicType> getProtoAdapter() {
                return FailureResponseMetadata.GraphicType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GraphicTypeDto getZeroValue() {
                return GraphicTypeDto.GRAPHIC_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public GraphicTypeDto fromProto(FailureResponseMetadata.GraphicType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return GraphicTypeDto.GRAPHIC_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return GraphicTypeDto.GRAPHIC_TYPE_INDIVIDUAL;
                }
                if (i == 3) {
                    return GraphicTypeDto.GRAPHIC_TYPE_RETIREMENT;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return GraphicTypeDto.GRAPHIC_TYPE_JOINT_ACCOUNT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: FailureResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/FailureResponseMetadataDto$GraphicTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<GraphicTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<GraphicTypeDto, FailureResponseMetadata.GraphicType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.FailureResponseMetadata.GraphicType", GraphicTypeDto.getEntries(), GraphicTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public GraphicTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (GraphicTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, GraphicTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static GraphicTypeDto valueOf(String str) {
            return (GraphicTypeDto) Enum.valueOf(GraphicTypeDto.class, str);
        }

        public static GraphicTypeDto[] values() {
            return (GraphicTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: FailureResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/FailureResponseMetadataDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/FailureResponseMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<FailureResponseMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.FailureResponseMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FailureResponseMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FailureResponseMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FailureResponseMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FailureResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/FailureResponseMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "options_product.service.FailureResponseMetadataDto";
        }
    }
}
