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
import options_product.service.JAPendingApplicationResponseMetadata;
import options_product.service.JAPendingApplicationResponseMetadataDto;

/* compiled from: JAPendingApplicationResponseMetadataDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/JAPendingApplicationResponseMetadata;", "Landroid/os/Parcelable;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;)V", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "upgrade_type_in_copy", "(Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;)V", "toProto", "()Loptions_product/service/JAPendingApplicationResponseMetadata;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;", "getUpgrade_type_in_copy", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "Companion", "Surrogate", "UpgradeTypeInCopyDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class JAPendingApplicationResponseMetadataDto implements Dto3<JAPendingApplicationResponseMetadata>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<JAPendingApplicationResponseMetadataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<JAPendingApplicationResponseMetadataDto, JAPendingApplicationResponseMetadata>> binaryBase64Serializer$delegate;
    private static final JAPendingApplicationResponseMetadataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ JAPendingApplicationResponseMetadataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private JAPendingApplicationResponseMetadataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UpgradeTypeInCopyDto getUpgrade_type_in_copy() {
        return this.surrogate.getUpgrade_type_in_copy();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JAPendingApplicationResponseMetadataDto(UpgradeTypeInCopyDto upgrade_type_in_copy) {
        this(new Surrogate(upgrade_type_in_copy));
        Intrinsics.checkNotNullParameter(upgrade_type_in_copy, "upgrade_type_in_copy");
    }

    public /* synthetic */ JAPendingApplicationResponseMetadataDto(UpgradeTypeInCopyDto upgradeTypeInCopyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UpgradeTypeInCopyDto.INSTANCE.getZeroValue() : upgradeTypeInCopyDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public JAPendingApplicationResponseMetadata toProto() {
        return new JAPendingApplicationResponseMetadata((JAPendingApplicationResponseMetadata.UpgradeTypeInCopy) this.surrogate.getUpgrade_type_in_copy().toProto(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[JAPendingApplicationResponseMetadataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof JAPendingApplicationResponseMetadataDto) && Intrinsics.areEqual(((JAPendingApplicationResponseMetadataDto) other).surrogate, this.surrogate);
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
    /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;", "", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "upgrade_type_in_copy", "<init>", "(Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILoptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "getUpgrade_type_in_copy", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "getUpgrade_type_in_copy$annotations", "()V", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UpgradeTypeInCopyDto upgrade_type_in_copy;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((UpgradeTypeInCopyDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.upgrade_type_in_copy == ((Surrogate) other).upgrade_type_in_copy;
        }

        public int hashCode() {
            return this.upgrade_type_in_copy.hashCode();
        }

        public String toString() {
            return "Surrogate(upgrade_type_in_copy=" + this.upgrade_type_in_copy + ")";
        }

        /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return JAPendingApplicationResponseMetadataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UpgradeTypeInCopyDto upgradeTypeInCopyDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.upgrade_type_in_copy = UpgradeTypeInCopyDto.INSTANCE.getZeroValue();
            } else {
                this.upgrade_type_in_copy = upgradeTypeInCopyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.upgrade_type_in_copy != UpgradeTypeInCopyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, UpgradeTypeInCopyDto.Serializer.INSTANCE, self.upgrade_type_in_copy);
            }
        }

        public Surrogate(UpgradeTypeInCopyDto upgrade_type_in_copy) {
            Intrinsics.checkNotNullParameter(upgrade_type_in_copy, "upgrade_type_in_copy");
            this.upgrade_type_in_copy = upgrade_type_in_copy;
        }

        public final UpgradeTypeInCopyDto getUpgrade_type_in_copy() {
            return this.upgrade_type_in_copy;
        }

        public /* synthetic */ Surrogate(UpgradeTypeInCopyDto upgradeTypeInCopyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UpgradeTypeInCopyDto.INSTANCE.getZeroValue() : upgradeTypeInCopyDto);
        }
    }

    /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "Loptions_product/service/JAPendingApplicationResponseMetadata;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<JAPendingApplicationResponseMetadataDto, JAPendingApplicationResponseMetadata> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<JAPendingApplicationResponseMetadataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<JAPendingApplicationResponseMetadataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<JAPendingApplicationResponseMetadataDto> getBinaryBase64Serializer() {
            return (KSerializer) JAPendingApplicationResponseMetadataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<JAPendingApplicationResponseMetadata> getProtoAdapter() {
            return JAPendingApplicationResponseMetadata.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public JAPendingApplicationResponseMetadataDto getZeroValue() {
            return JAPendingApplicationResponseMetadataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public JAPendingApplicationResponseMetadataDto fromProto(JAPendingApplicationResponseMetadata proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new JAPendingApplicationResponseMetadataDto(new Surrogate(UpgradeTypeInCopyDto.INSTANCE.fromProto(proto.getUpgrade_type_in_copy())), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.JAPendingApplicationResponseMetadataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return JAPendingApplicationResponseMetadataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new JAPendingApplicationResponseMetadataDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "Lcom/robinhood/idl/EnumDto;", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UPGRADE_TYPE_UNSPECIFIED", "L0_TO_L2", "L2_TO_L3", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class UpgradeTypeInCopyDto implements Dto2<JAPendingApplicationResponseMetadata.UpgradeTypeInCopy>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpgradeTypeInCopyDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<UpgradeTypeInCopyDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UpgradeTypeInCopyDto, JAPendingApplicationResponseMetadata.UpgradeTypeInCopy>> binaryBase64Serializer$delegate;
        public static final UpgradeTypeInCopyDto UPGRADE_TYPE_UNSPECIFIED = new UPGRADE_TYPE_UNSPECIFIED("UPGRADE_TYPE_UNSPECIFIED", 0);
        public static final UpgradeTypeInCopyDto L0_TO_L2 = new L0_TO_L2("L0_TO_L2", 1);
        public static final UpgradeTypeInCopyDto L2_TO_L3 = new L2_TO_L3("L2_TO_L3", 2);

        private static final /* synthetic */ UpgradeTypeInCopyDto[] $values() {
            return new UpgradeTypeInCopyDto[]{UPGRADE_TYPE_UNSPECIFIED, L0_TO_L2, L2_TO_L3};
        }

        public /* synthetic */ UpgradeTypeInCopyDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<UpgradeTypeInCopyDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private UpgradeTypeInCopyDto(String str, int i) {
        }

        /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto.UPGRADE_TYPE_UNSPECIFIED", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "toProto", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPGRADE_TYPE_UNSPECIFIED extends UpgradeTypeInCopyDto {
            UPGRADE_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public JAPendingApplicationResponseMetadata.UpgradeTypeInCopy toProto() {
                return JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED;
            }
        }

        static {
            UpgradeTypeInCopyDto[] upgradeTypeInCopyDtoArr$values = $values();
            $VALUES = upgradeTypeInCopyDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upgradeTypeInCopyDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto.L0_TO_L2", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "toProto", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class L0_TO_L2 extends UpgradeTypeInCopyDto {
            L0_TO_L2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public JAPendingApplicationResponseMetadata.UpgradeTypeInCopy toProto() {
                return JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.L0_TO_L2;
            }
        }

        /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"options_product/service/JAPendingApplicationResponseMetadataDto.UpgradeTypeInCopyDto.L2_TO_L3", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "toProto", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class L2_TO_L3 extends UpgradeTypeInCopyDto {
            L2_TO_L3(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public JAPendingApplicationResponseMetadata.UpgradeTypeInCopy toProto() {
                return JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.L2_TO_L3;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "Loptions_product/service/JAPendingApplicationResponseMetadata$UpgradeTypeInCopy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<UpgradeTypeInCopyDto, JAPendingApplicationResponseMetadata.UpgradeTypeInCopy> {

            /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.values().length];
                    try {
                        iArr[JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.UPGRADE_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.L0_TO_L2.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.L2_TO_L3.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UpgradeTypeInCopyDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UpgradeTypeInCopyDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UpgradeTypeInCopyDto> getBinaryBase64Serializer() {
                return (KSerializer) UpgradeTypeInCopyDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<JAPendingApplicationResponseMetadata.UpgradeTypeInCopy> getProtoAdapter() {
                return JAPendingApplicationResponseMetadata.UpgradeTypeInCopy.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UpgradeTypeInCopyDto getZeroValue() {
                return UpgradeTypeInCopyDto.UPGRADE_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UpgradeTypeInCopyDto fromProto(JAPendingApplicationResponseMetadata.UpgradeTypeInCopy proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return UpgradeTypeInCopyDto.UPGRADE_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return UpgradeTypeInCopyDto.L0_TO_L2;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return UpgradeTypeInCopyDto.L2_TO_L3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$UpgradeTypeInCopyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<UpgradeTypeInCopyDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<UpgradeTypeInCopyDto, JAPendingApplicationResponseMetadata.UpgradeTypeInCopy> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/options_product.service.JAPendingApplicationResponseMetadata.UpgradeTypeInCopy", UpgradeTypeInCopyDto.getEntries(), UpgradeTypeInCopyDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public UpgradeTypeInCopyDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (UpgradeTypeInCopyDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UpgradeTypeInCopyDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static UpgradeTypeInCopyDto valueOf(String str) {
            return (UpgradeTypeInCopyDto) Enum.valueOf(UpgradeTypeInCopyDto.class, str);
        }

        public static UpgradeTypeInCopyDto[] values() {
            return (UpgradeTypeInCopyDto[]) $VALUES.clone();
        }
    }

    /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/JAPendingApplicationResponseMetadataDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/JAPendingApplicationResponseMetadataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<JAPendingApplicationResponseMetadataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.JAPendingApplicationResponseMetadata", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, JAPendingApplicationResponseMetadataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public JAPendingApplicationResponseMetadataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new JAPendingApplicationResponseMetadataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: JAPendingApplicationResponseMetadataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/JAPendingApplicationResponseMetadataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "options_product.service.JAPendingApplicationResponseMetadataDto";
        }
    }
}
