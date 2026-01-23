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
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContextDto;
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

/* compiled from: BuyingPowerRowContextDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005 !\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Surrogate;)V", "margin_health_state", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "hasAccountDeficit", "", "(Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;Z)V", "getMargin_health_state", "()Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "getHasAccountDeficit", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "MarginHealthStateDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class BuyingPowerRowContextDto implements Dto3<BuyingPowerRowContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BuyingPowerRowContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BuyingPowerRowContextDto, BuyingPowerRowContext>> binaryBase64Serializer$delegate;
    private static final BuyingPowerRowContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BuyingPowerRowContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BuyingPowerRowContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MarginHealthStateDto getMargin_health_state() {
        return this.surrogate.getMargin_health_state();
    }

    public final boolean getHasAccountDeficit() {
        return this.surrogate.getHasAccountDeficit();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyingPowerRowContextDto(MarginHealthStateDto margin_health_state, boolean z) {
        this(new Surrogate(margin_health_state, z));
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
    }

    public /* synthetic */ BuyingPowerRowContextDto(MarginHealthStateDto marginHealthStateDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MarginHealthStateDto.INSTANCE.getZeroValue() : marginHealthStateDto, (i & 2) != 0 ? false : z);
    }

    public static /* synthetic */ BuyingPowerRowContextDto copy$default(BuyingPowerRowContextDto buyingPowerRowContextDto, MarginHealthStateDto marginHealthStateDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            marginHealthStateDto = buyingPowerRowContextDto.surrogate.getMargin_health_state();
        }
        if ((i & 2) != 0) {
            z = buyingPowerRowContextDto.surrogate.getHasAccountDeficit();
        }
        return buyingPowerRowContextDto.copy(marginHealthStateDto, z);
    }

    public final BuyingPowerRowContextDto copy(MarginHealthStateDto margin_health_state, boolean hasAccountDeficit) {
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        return new BuyingPowerRowContextDto(new Surrogate(margin_health_state, hasAccountDeficit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BuyingPowerRowContext toProto() {
        return new BuyingPowerRowContext((BuyingPowerRowContext.MarginHealthState) this.surrogate.getMargin_health_state().toProto(), this.surrogate.getHasAccountDeficit(), null, 4, null);
    }

    public String toString() {
        return "[BuyingPowerRowContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BuyingPowerRowContextDto) && Intrinsics.areEqual(((BuyingPowerRowContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: BuyingPowerRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Surrogate;", "", "margin_health_state", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "hasAccountDeficit", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMargin_health_state$annotations", "()V", "getMargin_health_state", "()Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "getHasAccountDeficit$annotations", "getHasAccountDeficit", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean hasAccountDeficit;
        private final MarginHealthStateDto margin_health_state;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MarginHealthStateDto) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MarginHealthStateDto marginHealthStateDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                marginHealthStateDto = surrogate.margin_health_state;
            }
            if ((i & 2) != 0) {
                z = surrogate.hasAccountDeficit;
            }
            return surrogate.copy(marginHealthStateDto, z);
        }

        @SerialName("hasAccountDeficit")
        @JsonAnnotations2(names = {"hasAccountDeficit"})
        public static /* synthetic */ void getHasAccountDeficit$annotations() {
        }

        @SerialName("marginHealthState")
        @JsonAnnotations2(names = {"margin_health_state"})
        public static /* synthetic */ void getMargin_health_state$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MarginHealthStateDto getMargin_health_state() {
            return this.margin_health_state;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getHasAccountDeficit() {
            return this.hasAccountDeficit;
        }

        public final Surrogate copy(MarginHealthStateDto margin_health_state, boolean hasAccountDeficit) {
            Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
            return new Surrogate(margin_health_state, hasAccountDeficit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.margin_health_state == surrogate.margin_health_state && this.hasAccountDeficit == surrogate.hasAccountDeficit;
        }

        public int hashCode() {
            return (this.margin_health_state.hashCode() * 31) + java.lang.Boolean.hashCode(this.hasAccountDeficit);
        }

        public String toString() {
            return "Surrogate(margin_health_state=" + this.margin_health_state + ", hasAccountDeficit=" + this.hasAccountDeficit + ")";
        }

        /* compiled from: BuyingPowerRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BuyingPowerRowContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MarginHealthStateDto marginHealthStateDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.margin_health_state = (i & 1) == 0 ? MarginHealthStateDto.INSTANCE.getZeroValue() : marginHealthStateDto;
            if ((i & 2) == 0) {
                this.hasAccountDeficit = false;
            } else {
                this.hasAccountDeficit = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.margin_health_state != MarginHealthStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MarginHealthStateDto.Serializer.INSTANCE, self.margin_health_state);
            }
            boolean z = self.hasAccountDeficit;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
        }

        public Surrogate(MarginHealthStateDto margin_health_state, boolean z) {
            Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
            this.margin_health_state = margin_health_state;
            this.hasAccountDeficit = z;
        }

        public final MarginHealthStateDto getMargin_health_state() {
            return this.margin_health_state;
        }

        public /* synthetic */ Surrogate(MarginHealthStateDto marginHealthStateDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MarginHealthStateDto.INSTANCE.getZeroValue() : marginHealthStateDto, (i & 2) != 0 ? false : z);
        }

        public final boolean getHasAccountDeficit() {
            return this.hasAccountDeficit;
        }
    }

    /* compiled from: BuyingPowerRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BuyingPowerRowContextDto, BuyingPowerRowContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BuyingPowerRowContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BuyingPowerRowContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BuyingPowerRowContextDto> getBinaryBase64Serializer() {
            return (KSerializer) BuyingPowerRowContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BuyingPowerRowContext> getProtoAdapter() {
            return BuyingPowerRowContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BuyingPowerRowContextDto getZeroValue() {
            return BuyingPowerRowContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BuyingPowerRowContextDto fromProto(BuyingPowerRowContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BuyingPowerRowContextDto(new Surrogate(MarginHealthStateDto.INSTANCE.fromProto(proto.getMargin_health_state()), proto.getHasAccountDeficit()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.BuyingPowerRowContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyingPowerRowContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BuyingPowerRowContextDto(0 == true ? 1 : 0, false, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BuyingPowerRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "HEALTHY", "MODERATE", "RISKY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MarginHealthStateDto implements Dto2<BuyingPowerRowContext.MarginHealthState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MarginHealthStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MarginHealthStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MarginHealthStateDto HEALTHY = new HEALTHY("HEALTHY", 0);
        public static final MarginHealthStateDto MODERATE = new MODERATE("MODERATE", 1);
        public static final MarginHealthStateDto RISKY = new RISKY("RISKY", 2);
        private static final Lazy<BinaryBase64DtoSerializer<MarginHealthStateDto, BuyingPowerRowContext.MarginHealthState>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ MarginHealthStateDto[] $values() {
            return new MarginHealthStateDto[]{HEALTHY, MODERATE, RISKY};
        }

        public /* synthetic */ MarginHealthStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MarginHealthStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private MarginHealthStateDto(String str, int i) {
        }

        /* compiled from: BuyingPowerRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto.MarginHealthStateDto.HEALTHY", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HEALTHY extends MarginHealthStateDto {
            HEALTHY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public BuyingPowerRowContext.MarginHealthState toProto() {
                return BuyingPowerRowContext.MarginHealthState.HEALTHY;
            }
        }

        static {
            MarginHealthStateDto[] marginHealthStateDtoArr$values = $values();
            $VALUES = marginHealthStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(marginHealthStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.BuyingPowerRowContextDto$MarginHealthStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BuyingPowerRowContextDto.MarginHealthStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: BuyingPowerRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto.MarginHealthStateDto.MODERATE", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MODERATE extends MarginHealthStateDto {
            MODERATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public BuyingPowerRowContext.MarginHealthState toProto() {
                return BuyingPowerRowContext.MarginHealthState.MODERATE;
            }
        }

        /* compiled from: BuyingPowerRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto.MarginHealthStateDto.RISKY", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RISKY extends MarginHealthStateDto {
            RISKY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public BuyingPowerRowContext.MarginHealthState toProto() {
                return BuyingPowerRowContext.MarginHealthState.RISKY;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: BuyingPowerRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContext$MarginHealthState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MarginHealthStateDto, BuyingPowerRowContext.MarginHealthState> {

            /* compiled from: BuyingPowerRowContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BuyingPowerRowContext.MarginHealthState.values().length];
                    try {
                        iArr[BuyingPowerRowContext.MarginHealthState.HEALTHY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BuyingPowerRowContext.MarginHealthState.MODERATE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BuyingPowerRowContext.MarginHealthState.RISKY.ordinal()] = 3;
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

            public final KSerializer<MarginHealthStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginHealthStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MarginHealthStateDto> getBinaryBase64Serializer() {
                return (KSerializer) MarginHealthStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<BuyingPowerRowContext.MarginHealthState> getProtoAdapter() {
                return BuyingPowerRowContext.MarginHealthState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginHealthStateDto getZeroValue() {
                return MarginHealthStateDto.HEALTHY;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MarginHealthStateDto fromProto(BuyingPowerRowContext.MarginHealthState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return MarginHealthStateDto.HEALTHY;
                }
                if (i == 2) {
                    return MarginHealthStateDto.MODERATE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return MarginHealthStateDto.RISKY;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: BuyingPowerRowContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MarginHealthStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MarginHealthStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MarginHealthStateDto, BuyingPowerRowContext.MarginHealthState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.BuyingPowerRowContext.MarginHealthState", MarginHealthStateDto.getEntries(), MarginHealthStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MarginHealthStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MarginHealthStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MarginHealthStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MarginHealthStateDto valueOf(String str) {
            return (MarginHealthStateDto) Enum.valueOf(MarginHealthStateDto.class, str);
        }

        public static MarginHealthStateDto[] values() {
            return (MarginHealthStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: BuyingPowerRowContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<BuyingPowerRowContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.BuyingPowerRowContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BuyingPowerRowContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BuyingPowerRowContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BuyingPowerRowContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: BuyingPowerRowContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerRowContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.BuyingPowerRowContextDto";
        }
    }
}
