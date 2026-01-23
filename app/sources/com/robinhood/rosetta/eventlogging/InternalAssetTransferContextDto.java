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
import rosetta.account.BrokerageAccountType;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: InternalAssetTransferContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f !\"B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Surrogate;)V", "source_account_type", "Lrosetta/account/BrokerageAccountTypeDto;", "destination_account_type", "(Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/BrokerageAccountTypeDto;)V", "getSource_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getDestination_account_type", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class InternalAssetTransferContextDto implements Dto3<InternalAssetTransferContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InternalAssetTransferContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InternalAssetTransferContextDto, InternalAssetTransferContext>> binaryBase64Serializer$delegate;
    private static final InternalAssetTransferContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InternalAssetTransferContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InternalAssetTransferContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final BrokerageAccountTypeDto getSource_account_type() {
        return this.surrogate.getSource_account_type();
    }

    public final BrokerageAccountTypeDto getDestination_account_type() {
        return this.surrogate.getDestination_account_type();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InternalAssetTransferContextDto(BrokerageAccountTypeDto source_account_type, BrokerageAccountTypeDto destination_account_type) {
        this(new Surrogate(source_account_type, destination_account_type));
        Intrinsics.checkNotNullParameter(source_account_type, "source_account_type");
        Intrinsics.checkNotNullParameter(destination_account_type, "destination_account_type");
    }

    public /* synthetic */ InternalAssetTransferContextDto(BrokerageAccountTypeDto brokerageAccountTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto2);
    }

    public static /* synthetic */ InternalAssetTransferContextDto copy$default(InternalAssetTransferContextDto internalAssetTransferContextDto, BrokerageAccountTypeDto brokerageAccountTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountTypeDto = internalAssetTransferContextDto.surrogate.getSource_account_type();
        }
        if ((i & 2) != 0) {
            brokerageAccountTypeDto2 = internalAssetTransferContextDto.surrogate.getDestination_account_type();
        }
        return internalAssetTransferContextDto.copy(brokerageAccountTypeDto, brokerageAccountTypeDto2);
    }

    public final InternalAssetTransferContextDto copy(BrokerageAccountTypeDto source_account_type, BrokerageAccountTypeDto destination_account_type) {
        Intrinsics.checkNotNullParameter(source_account_type, "source_account_type");
        Intrinsics.checkNotNullParameter(destination_account_type, "destination_account_type");
        return new InternalAssetTransferContextDto(new Surrogate(source_account_type, destination_account_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public InternalAssetTransferContext toProto() {
        return new InternalAssetTransferContext((BrokerageAccountType) this.surrogate.getSource_account_type().toProto(), (BrokerageAccountType) this.surrogate.getDestination_account_type().toProto(), null, 4, null);
    }

    public String toString() {
        return "[InternalAssetTransferContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InternalAssetTransferContextDto) && Intrinsics.areEqual(((InternalAssetTransferContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: InternalAssetTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Surrogate;", "", "source_account_type", "Lrosetta/account/BrokerageAccountTypeDto;", "destination_account_type", "<init>", "(Lrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/BrokerageAccountTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILrosetta/account/BrokerageAccountTypeDto;Lrosetta/account/BrokerageAccountTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSource_account_type$annotations", "()V", "getSource_account_type", "()Lrosetta/account/BrokerageAccountTypeDto;", "getDestination_account_type$annotations", "getDestination_account_type", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BrokerageAccountTypeDto destination_account_type;
        private final BrokerageAccountTypeDto source_account_type;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((BrokerageAccountTypeDto) null, (BrokerageAccountTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, BrokerageAccountTypeDto brokerageAccountTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountTypeDto = surrogate.source_account_type;
            }
            if ((i & 2) != 0) {
                brokerageAccountTypeDto2 = surrogate.destination_account_type;
            }
            return surrogate.copy(brokerageAccountTypeDto, brokerageAccountTypeDto2);
        }

        @SerialName("destinationAccountType")
        @JsonAnnotations2(names = {"destination_account_type"})
        public static /* synthetic */ void getDestination_account_type$annotations() {
        }

        @SerialName("sourceAccountType")
        @JsonAnnotations2(names = {"source_account_type"})
        public static /* synthetic */ void getSource_account_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountTypeDto getSource_account_type() {
            return this.source_account_type;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountTypeDto getDestination_account_type() {
            return this.destination_account_type;
        }

        public final Surrogate copy(BrokerageAccountTypeDto source_account_type, BrokerageAccountTypeDto destination_account_type) {
            Intrinsics.checkNotNullParameter(source_account_type, "source_account_type");
            Intrinsics.checkNotNullParameter(destination_account_type, "destination_account_type");
            return new Surrogate(source_account_type, destination_account_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.source_account_type == surrogate.source_account_type && this.destination_account_type == surrogate.destination_account_type;
        }

        public int hashCode() {
            return (this.source_account_type.hashCode() * 31) + this.destination_account_type.hashCode();
        }

        public String toString() {
            return "Surrogate(source_account_type=" + this.source_account_type + ", destination_account_type=" + this.destination_account_type + ")";
        }

        /* compiled from: InternalAssetTransferContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InternalAssetTransferContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BrokerageAccountTypeDto brokerageAccountTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.source_account_type = (i & 1) == 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto;
            if ((i & 2) == 0) {
                this.destination_account_type = BrokerageAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.destination_account_type = brokerageAccountTypeDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            BrokerageAccountTypeDto brokerageAccountTypeDto = self.source_account_type;
            BrokerageAccountTypeDto.Companion companion = BrokerageAccountTypeDto.INSTANCE;
            if (brokerageAccountTypeDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BrokerageAccountTypeDto.Serializer.INSTANCE, self.source_account_type);
            }
            if (self.destination_account_type != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, BrokerageAccountTypeDto.Serializer.INSTANCE, self.destination_account_type);
            }
        }

        public Surrogate(BrokerageAccountTypeDto source_account_type, BrokerageAccountTypeDto destination_account_type) {
            Intrinsics.checkNotNullParameter(source_account_type, "source_account_type");
            Intrinsics.checkNotNullParameter(destination_account_type, "destination_account_type");
            this.source_account_type = source_account_type;
            this.destination_account_type = destination_account_type;
        }

        public final BrokerageAccountTypeDto getSource_account_type() {
            return this.source_account_type;
        }

        public /* synthetic */ Surrogate(BrokerageAccountTypeDto brokerageAccountTypeDto, BrokerageAccountTypeDto brokerageAccountTypeDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto, (i & 2) != 0 ? BrokerageAccountTypeDto.INSTANCE.getZeroValue() : brokerageAccountTypeDto2);
        }

        public final BrokerageAccountTypeDto getDestination_account_type() {
            return this.destination_account_type;
        }
    }

    /* compiled from: InternalAssetTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto;", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<InternalAssetTransferContextDto, InternalAssetTransferContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InternalAssetTransferContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InternalAssetTransferContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InternalAssetTransferContextDto> getBinaryBase64Serializer() {
            return (KSerializer) InternalAssetTransferContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InternalAssetTransferContext> getProtoAdapter() {
            return InternalAssetTransferContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InternalAssetTransferContextDto getZeroValue() {
            return InternalAssetTransferContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InternalAssetTransferContextDto fromProto(InternalAssetTransferContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BrokerageAccountTypeDto.Companion companion = BrokerageAccountTypeDto.INSTANCE;
            return new InternalAssetTransferContextDto(new Surrogate(companion.fromProto(proto.getSource_account_type()), companion.fromProto(proto.getDestination_account_type())), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.InternalAssetTransferContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InternalAssetTransferContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InternalAssetTransferContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InternalAssetTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<InternalAssetTransferContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.InternalAssetTransferContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InternalAssetTransferContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InternalAssetTransferContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InternalAssetTransferContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: InternalAssetTransferContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/InternalAssetTransferContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.InternalAssetTransferContextDto";
        }
    }
}
