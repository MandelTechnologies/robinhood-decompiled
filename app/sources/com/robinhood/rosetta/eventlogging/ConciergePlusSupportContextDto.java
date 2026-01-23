package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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

/* compiled from: ConciergePlusSupportContextDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Surrogate;)V", "has_seen_estate_onboarding", "", "has_seen_tax_onboarding", "is_pilot_full", "(ZZZ)V", "getHas_seen_estate_onboarding", "()Z", "getHas_seen_tax_onboarding", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ConciergePlusSupportContextDto implements Dto3<ConciergePlusSupportContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ConciergePlusSupportContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ConciergePlusSupportContextDto, ConciergePlusSupportContext>> binaryBase64Serializer$delegate;
    private static final ConciergePlusSupportContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ConciergePlusSupportContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ConciergePlusSupportContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getHas_seen_estate_onboarding() {
        return this.surrogate.getHas_seen_estate_onboarding();
    }

    public final boolean getHas_seen_tax_onboarding() {
        return this.surrogate.getHas_seen_tax_onboarding();
    }

    public final boolean is_pilot_full() {
        return this.surrogate.is_pilot_full();
    }

    public /* synthetic */ ConciergePlusSupportContextDto(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public ConciergePlusSupportContextDto(boolean z, boolean z2, boolean z3) {
        this(new Surrogate(z, z2, z3));
    }

    public static /* synthetic */ ConciergePlusSupportContextDto copy$default(ConciergePlusSupportContextDto conciergePlusSupportContextDto, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conciergePlusSupportContextDto.surrogate.getHas_seen_estate_onboarding();
        }
        if ((i & 2) != 0) {
            z2 = conciergePlusSupportContextDto.surrogate.getHas_seen_tax_onboarding();
        }
        if ((i & 4) != 0) {
            z3 = conciergePlusSupportContextDto.surrogate.is_pilot_full();
        }
        return conciergePlusSupportContextDto.copy(z, z2, z3);
    }

    public final ConciergePlusSupportContextDto copy(boolean has_seen_estate_onboarding, boolean has_seen_tax_onboarding, boolean is_pilot_full) {
        return new ConciergePlusSupportContextDto(new Surrogate(has_seen_estate_onboarding, has_seen_tax_onboarding, is_pilot_full));
    }

    @Override // com.robinhood.idl.Dto
    public ConciergePlusSupportContext toProto() {
        return new ConciergePlusSupportContext(this.surrogate.getHas_seen_estate_onboarding(), this.surrogate.getHas_seen_tax_onboarding(), this.surrogate.is_pilot_full(), null, 8, null);
    }

    public String toString() {
        return "[ConciergePlusSupportContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ConciergePlusSupportContextDto) && Intrinsics.areEqual(((ConciergePlusSupportContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: ConciergePlusSupportContextDto.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0005\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Surrogate;", "", "has_seen_estate_onboarding", "", "has_seen_tax_onboarding", "is_pilot_full", "<init>", "(ZZZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHas_seen_estate_onboarding$annotations", "()V", "getHas_seen_estate_onboarding", "()Z", "getHas_seen_tax_onboarding$annotations", "getHas_seen_tax_onboarding", "is_pilot_full$annotations", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean has_seen_estate_onboarding;
        private final boolean has_seen_tax_onboarding;
        private final boolean is_pilot_full;

        public Surrogate() {
            this(false, false, false, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = surrogate.has_seen_estate_onboarding;
            }
            if ((i & 2) != 0) {
                z2 = surrogate.has_seen_tax_onboarding;
            }
            if ((i & 4) != 0) {
                z3 = surrogate.is_pilot_full;
            }
            return surrogate.copy(z, z2, z3);
        }

        @SerialName("hasSeenEstateOnboarding")
        @JsonAnnotations2(names = {"has_seen_estate_onboarding"})
        public static /* synthetic */ void getHas_seen_estate_onboarding$annotations() {
        }

        @SerialName("hasSeenTaxOnboarding")
        @JsonAnnotations2(names = {"has_seen_tax_onboarding"})
        public static /* synthetic */ void getHas_seen_tax_onboarding$annotations() {
        }

        @SerialName("isPilotFull")
        @JsonAnnotations2(names = {"is_pilot_full"})
        public static /* synthetic */ void is_pilot_full$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHas_seen_estate_onboarding() {
            return this.has_seen_estate_onboarding;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHas_seen_tax_onboarding() {
            return this.has_seen_tax_onboarding;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIs_pilot_full() {
            return this.is_pilot_full;
        }

        public final Surrogate copy(boolean has_seen_estate_onboarding, boolean has_seen_tax_onboarding, boolean is_pilot_full) {
            return new Surrogate(has_seen_estate_onboarding, has_seen_tax_onboarding, is_pilot_full);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.has_seen_estate_onboarding == surrogate.has_seen_estate_onboarding && this.has_seen_tax_onboarding == surrogate.has_seen_tax_onboarding && this.is_pilot_full == surrogate.is_pilot_full;
        }

        public int hashCode() {
            return (((java.lang.Boolean.hashCode(this.has_seen_estate_onboarding) * 31) + java.lang.Boolean.hashCode(this.has_seen_tax_onboarding)) * 31) + java.lang.Boolean.hashCode(this.is_pilot_full);
        }

        public String toString() {
            return "Surrogate(has_seen_estate_onboarding=" + this.has_seen_estate_onboarding + ", has_seen_tax_onboarding=" + this.has_seen_tax_onboarding + ", is_pilot_full=" + this.is_pilot_full + ")";
        }

        /* compiled from: ConciergePlusSupportContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ConciergePlusSupportContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, boolean z2, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.has_seen_estate_onboarding = false;
            } else {
                this.has_seen_estate_onboarding = z;
            }
            if ((i & 2) == 0) {
                this.has_seen_tax_onboarding = false;
            } else {
                this.has_seen_tax_onboarding = z2;
            }
            if ((i & 4) == 0) {
                this.is_pilot_full = false;
            } else {
                this.is_pilot_full = z3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.has_seen_estate_onboarding;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            boolean z2 = self.has_seen_tax_onboarding;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 1, z2);
            }
            boolean z3 = self.is_pilot_full;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 2, z3);
            }
        }

        public Surrogate(boolean z, boolean z2, boolean z3) {
            this.has_seen_estate_onboarding = z;
            this.has_seen_tax_onboarding = z2;
            this.is_pilot_full = z3;
        }

        public /* synthetic */ Surrogate(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
        }

        public final boolean getHas_seen_estate_onboarding() {
            return this.has_seen_estate_onboarding;
        }

        public final boolean getHas_seen_tax_onboarding() {
            return this.has_seen_tax_onboarding;
        }

        public final boolean is_pilot_full() {
            return this.is_pilot_full;
        }
    }

    /* compiled from: ConciergePlusSupportContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto;", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ConciergePlusSupportContextDto, ConciergePlusSupportContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ConciergePlusSupportContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConciergePlusSupportContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ConciergePlusSupportContextDto> getBinaryBase64Serializer() {
            return (KSerializer) ConciergePlusSupportContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ConciergePlusSupportContext> getProtoAdapter() {
            return ConciergePlusSupportContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConciergePlusSupportContextDto getZeroValue() {
            return ConciergePlusSupportContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ConciergePlusSupportContextDto fromProto(ConciergePlusSupportContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ConciergePlusSupportContextDto(new Surrogate(proto.getHas_seen_estate_onboarding(), proto.getHas_seen_tax_onboarding(), proto.getIs_pilot_full()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ConciergePlusSupportContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConciergePlusSupportContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ConciergePlusSupportContextDto(false, false, false, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ConciergePlusSupportContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ConciergePlusSupportContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ConciergePlusSupportContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ConciergePlusSupportContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ConciergePlusSupportContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ConciergePlusSupportContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ConciergePlusSupportContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergePlusSupportContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ConciergePlusSupportContextDto";
        }
    }
}
