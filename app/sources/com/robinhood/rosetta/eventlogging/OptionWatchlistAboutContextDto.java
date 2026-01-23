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
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContextDto;
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

/* compiled from: OptionWatchlistAboutContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001d\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Surrogate;)V", "source_type", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "(Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;)V", "getSource_type", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SourceTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class OptionWatchlistAboutContextDto implements Dto3<OptionWatchlistAboutContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OptionWatchlistAboutContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionWatchlistAboutContextDto, OptionWatchlistAboutContext>> binaryBase64Serializer$delegate;
    private static final OptionWatchlistAboutContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionWatchlistAboutContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionWatchlistAboutContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SourceTypeDto getSource_type() {
        return this.surrogate.getSource_type();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionWatchlistAboutContextDto(SourceTypeDto source_type) {
        this(new Surrogate(source_type));
        Intrinsics.checkNotNullParameter(source_type, "source_type");
    }

    public /* synthetic */ OptionWatchlistAboutContextDto(SourceTypeDto sourceTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SourceTypeDto.INSTANCE.getZeroValue() : sourceTypeDto);
    }

    public static /* synthetic */ OptionWatchlistAboutContextDto copy$default(OptionWatchlistAboutContextDto optionWatchlistAboutContextDto, SourceTypeDto sourceTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceTypeDto = optionWatchlistAboutContextDto.surrogate.getSource_type();
        }
        return optionWatchlistAboutContextDto.copy(sourceTypeDto);
    }

    public final OptionWatchlistAboutContextDto copy(SourceTypeDto source_type) {
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        return new OptionWatchlistAboutContextDto(new Surrogate(source_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionWatchlistAboutContext toProto() {
        return new OptionWatchlistAboutContext((OptionWatchlistAboutContext.SourceType) this.surrogate.getSource_type().toProto(), null, 2, null);
    }

    public String toString() {
        return "[OptionWatchlistAboutContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionWatchlistAboutContextDto) && Intrinsics.areEqual(((OptionWatchlistAboutContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionWatchlistAboutContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Surrogate;", "", "source_type", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSource_type$annotations", "()V", "getSource_type", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final SourceTypeDto source_type;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((SourceTypeDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, SourceTypeDto sourceTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                sourceTypeDto = surrogate.source_type;
            }
            return surrogate.copy(sourceTypeDto);
        }

        @SerialName("sourceType")
        @JsonAnnotations2(names = {"source_type"})
        public static /* synthetic */ void getSource_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final SourceTypeDto getSource_type() {
            return this.source_type;
        }

        public final Surrogate copy(SourceTypeDto source_type) {
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            return new Surrogate(source_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.source_type == ((Surrogate) other).source_type;
        }

        public int hashCode() {
            return this.source_type.hashCode();
        }

        public String toString() {
            return "Surrogate(source_type=" + this.source_type + ")";
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionWatchlistAboutContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SourceTypeDto sourceTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.source_type = SourceTypeDto.INSTANCE.getZeroValue();
            } else {
                this.source_type = sourceTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.source_type != SourceTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, SourceTypeDto.Serializer.INSTANCE, self.source_type);
            }
        }

        public Surrogate(SourceTypeDto source_type) {
            Intrinsics.checkNotNullParameter(source_type, "source_type");
            this.source_type = source_type;
        }

        public final SourceTypeDto getSource_type() {
            return this.source_type;
        }

        public /* synthetic */ Surrogate(SourceTypeDto sourceTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SourceTypeDto.INSTANCE.getZeroValue() : sourceTypeDto);
        }
    }

    /* compiled from: OptionWatchlistAboutContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<OptionWatchlistAboutContextDto, OptionWatchlistAboutContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptionWatchlistAboutContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionWatchlistAboutContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionWatchlistAboutContextDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionWatchlistAboutContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionWatchlistAboutContext> getProtoAdapter() {
            return OptionWatchlistAboutContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionWatchlistAboutContextDto getZeroValue() {
            return OptionWatchlistAboutContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionWatchlistAboutContextDto fromProto(OptionWatchlistAboutContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new OptionWatchlistAboutContextDto(new Surrogate(SourceTypeDto.INSTANCE.fromProto(proto.getSource_type())), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionWatchlistAboutContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionWatchlistAboutContextDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionWatchlistAboutContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OTHER", "EMPTY_HUB", "DOUBLE_TAP_BOTTOM_SHEET", "INVESTMENT_PAGE_CARD", "MARKETING_EMAIL", "OPTION_CHAIN_PAGE", "PUSH_NOTIFICATION", "INBOX_MESSAGE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class SourceTypeDto implements Dto2<OptionWatchlistAboutContext.SourceType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<SourceTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<SourceTypeDto, OptionWatchlistAboutContext.SourceType>> binaryBase64Serializer$delegate;
        public static final SourceTypeDto OTHER = new OTHER("OTHER", 0);
        public static final SourceTypeDto EMPTY_HUB = new EMPTY_HUB("EMPTY_HUB", 1);
        public static final SourceTypeDto DOUBLE_TAP_BOTTOM_SHEET = new DOUBLE_TAP_BOTTOM_SHEET("DOUBLE_TAP_BOTTOM_SHEET", 2);
        public static final SourceTypeDto INVESTMENT_PAGE_CARD = new INVESTMENT_PAGE_CARD("INVESTMENT_PAGE_CARD", 3);
        public static final SourceTypeDto MARKETING_EMAIL = new MARKETING_EMAIL("MARKETING_EMAIL", 4);
        public static final SourceTypeDto OPTION_CHAIN_PAGE = new OPTION_CHAIN_PAGE("OPTION_CHAIN_PAGE", 5);
        public static final SourceTypeDto PUSH_NOTIFICATION = new PUSH_NOTIFICATION("PUSH_NOTIFICATION", 6);
        public static final SourceTypeDto INBOX_MESSAGE = new INBOX_MESSAGE("INBOX_MESSAGE", 7);

        private static final /* synthetic */ SourceTypeDto[] $values() {
            return new SourceTypeDto[]{OTHER, EMPTY_HUB, DOUBLE_TAP_BOTTOM_SHEET, INVESTMENT_PAGE_CARD, MARKETING_EMAIL, OPTION_CHAIN_PAGE, PUSH_NOTIFICATION, INBOX_MESSAGE};
        }

        public /* synthetic */ SourceTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<SourceTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.OTHER", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OTHER extends SourceTypeDto {
            OTHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.OTHER;
            }
        }

        private SourceTypeDto(String str, int i) {
        }

        static {
            SourceTypeDto[] sourceTypeDtoArr$values = $values();
            $VALUES = sourceTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContextDto$SourceTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionWatchlistAboutContextDto.SourceTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.EMPTY_HUB", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMPTY_HUB extends SourceTypeDto {
            EMPTY_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.EMPTY_HUB;
            }
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.DOUBLE_TAP_BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DOUBLE_TAP_BOTTOM_SHEET extends SourceTypeDto {
            DOUBLE_TAP_BOTTOM_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.DOUBLE_TAP_BOTTOM_SHEET;
            }
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.INVESTMENT_PAGE_CARD", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVESTMENT_PAGE_CARD extends SourceTypeDto {
            INVESTMENT_PAGE_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.INVESTMENT_PAGE_CARD;
            }
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.MARKETING_EMAIL", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MARKETING_EMAIL extends SourceTypeDto {
            MARKETING_EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.MARKETING_EMAIL;
            }
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.OPTION_CHAIN_PAGE", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTION_CHAIN_PAGE extends SourceTypeDto {
            OPTION_CHAIN_PAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.OPTION_CHAIN_PAGE;
            }
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.PUSH_NOTIFICATION", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION extends SourceTypeDto {
            PUSH_NOTIFICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.PUSH_NOTIFICATION;
            }
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto.SourceTypeDto.INBOX_MESSAGE", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX_MESSAGE extends SourceTypeDto {
            INBOX_MESSAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public OptionWatchlistAboutContext.SourceType toProto() {
                return OptionWatchlistAboutContext.SourceType.INBOX_MESSAGE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<SourceTypeDto, OptionWatchlistAboutContext.SourceType> {

            /* compiled from: OptionWatchlistAboutContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OptionWatchlistAboutContext.SourceType.values().length];
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.OTHER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.EMPTY_HUB.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.DOUBLE_TAP_BOTTOM_SHEET.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.INVESTMENT_PAGE_CARD.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.MARKETING_EMAIL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.OPTION_CHAIN_PAGE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.PUSH_NOTIFICATION.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[OptionWatchlistAboutContext.SourceType.INBOX_MESSAGE.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<SourceTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<SourceTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) SourceTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<OptionWatchlistAboutContext.SourceType> getProtoAdapter() {
                return OptionWatchlistAboutContext.SourceType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceTypeDto getZeroValue() {
                return SourceTypeDto.OTHER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public SourceTypeDto fromProto(OptionWatchlistAboutContext.SourceType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return SourceTypeDto.OTHER;
                    case 2:
                        return SourceTypeDto.EMPTY_HUB;
                    case 3:
                        return SourceTypeDto.DOUBLE_TAP_BOTTOM_SHEET;
                    case 4:
                        return SourceTypeDto.INVESTMENT_PAGE_CARD;
                    case 5:
                        return SourceTypeDto.MARKETING_EMAIL;
                    case 6:
                        return SourceTypeDto.OPTION_CHAIN_PAGE;
                    case 7:
                        return SourceTypeDto.PUSH_NOTIFICATION;
                    case 8:
                        return SourceTypeDto.INBOX_MESSAGE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: OptionWatchlistAboutContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$SourceTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<SourceTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<SourceTypeDto, OptionWatchlistAboutContext.SourceType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.OptionWatchlistAboutContext.SourceType", SourceTypeDto.getEntries(), SourceTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public SourceTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (SourceTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, SourceTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static SourceTypeDto valueOf(String str) {
            return (SourceTypeDto) Enum.valueOf(SourceTypeDto.class, str);
        }

        public static SourceTypeDto[] values() {
            return (SourceTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionWatchlistAboutContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OptionWatchlistAboutContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.OptionWatchlistAboutContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionWatchlistAboutContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionWatchlistAboutContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionWatchlistAboutContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionWatchlistAboutContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContextDto";
        }
    }
}
