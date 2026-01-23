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
import com.robinhood.rosetta.eventlogging.PostTransferActionContext;
import com.robinhood.rosetta.eventlogging.PostTransferActionContextDto;
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

/* compiled from: PostTransferActionContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001d\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Surrogate;)V", "post_transfer_action_type", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "(Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;)V", "getPost_transfer_action_type", "()Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "PostTransferActionTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PostTransferActionContextDto implements Dto3<PostTransferActionContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PostTransferActionContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PostTransferActionContextDto, PostTransferActionContext>> binaryBase64Serializer$delegate;
    private static final PostTransferActionContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PostTransferActionContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PostTransferActionContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PostTransferActionTypeDto getPost_transfer_action_type() {
        return this.surrogate.getPost_transfer_action_type();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostTransferActionContextDto(PostTransferActionTypeDto post_transfer_action_type) {
        this(new Surrogate(post_transfer_action_type));
        Intrinsics.checkNotNullParameter(post_transfer_action_type, "post_transfer_action_type");
    }

    public /* synthetic */ PostTransferActionContextDto(PostTransferActionTypeDto postTransferActionTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PostTransferActionTypeDto.INSTANCE.getZeroValue() : postTransferActionTypeDto);
    }

    public static /* synthetic */ PostTransferActionContextDto copy$default(PostTransferActionContextDto postTransferActionContextDto, PostTransferActionTypeDto postTransferActionTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            postTransferActionTypeDto = postTransferActionContextDto.surrogate.getPost_transfer_action_type();
        }
        return postTransferActionContextDto.copy(postTransferActionTypeDto);
    }

    public final PostTransferActionContextDto copy(PostTransferActionTypeDto post_transfer_action_type) {
        Intrinsics.checkNotNullParameter(post_transfer_action_type, "post_transfer_action_type");
        return new PostTransferActionContextDto(new Surrogate(post_transfer_action_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PostTransferActionContext toProto() {
        return new PostTransferActionContext((PostTransferActionContext.PostTransferActionType) this.surrogate.getPost_transfer_action_type().toProto(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[PostTransferActionContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PostTransferActionContextDto) && Intrinsics.areEqual(((PostTransferActionContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PostTransferActionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Surrogate;", "", "post_transfer_action_type", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPost_transfer_action_type$annotations", "()V", "getPost_transfer_action_type", "()Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final PostTransferActionTypeDto post_transfer_action_type;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((PostTransferActionTypeDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, PostTransferActionTypeDto postTransferActionTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                postTransferActionTypeDto = surrogate.post_transfer_action_type;
            }
            return surrogate.copy(postTransferActionTypeDto);
        }

        @SerialName("postTransferActionType")
        @JsonAnnotations2(names = {"post_transfer_action_type"})
        public static /* synthetic */ void getPost_transfer_action_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final PostTransferActionTypeDto getPost_transfer_action_type() {
            return this.post_transfer_action_type;
        }

        public final Surrogate copy(PostTransferActionTypeDto post_transfer_action_type) {
            Intrinsics.checkNotNullParameter(post_transfer_action_type, "post_transfer_action_type");
            return new Surrogate(post_transfer_action_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.post_transfer_action_type == ((Surrogate) other).post_transfer_action_type;
        }

        public int hashCode() {
            return this.post_transfer_action_type.hashCode();
        }

        public String toString() {
            return "Surrogate(post_transfer_action_type=" + this.post_transfer_action_type + ")";
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PostTransferActionContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PostTransferActionTypeDto postTransferActionTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.post_transfer_action_type = PostTransferActionTypeDto.INSTANCE.getZeroValue();
            } else {
                this.post_transfer_action_type = postTransferActionTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.post_transfer_action_type != PostTransferActionTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, PostTransferActionTypeDto.Serializer.INSTANCE, self.post_transfer_action_type);
            }
        }

        public Surrogate(PostTransferActionTypeDto post_transfer_action_type) {
            Intrinsics.checkNotNullParameter(post_transfer_action_type, "post_transfer_action_type");
            this.post_transfer_action_type = post_transfer_action_type;
        }

        public final PostTransferActionTypeDto getPost_transfer_action_type() {
            return this.post_transfer_action_type;
        }

        public /* synthetic */ Surrogate(PostTransferActionTypeDto postTransferActionTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PostTransferActionTypeDto.INSTANCE.getZeroValue() : postTransferActionTypeDto);
        }
    }

    /* compiled from: PostTransferActionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PostTransferActionContextDto, PostTransferActionContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PostTransferActionContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostTransferActionContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PostTransferActionContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PostTransferActionContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PostTransferActionContext> getProtoAdapter() {
            return PostTransferActionContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostTransferActionContextDto getZeroValue() {
            return PostTransferActionContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PostTransferActionContextDto fromProto(PostTransferActionContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PostTransferActionContextDto(new Surrogate(PostTransferActionTypeDto.INSTANCE.fromProto(proto.getPost_transfer_action_type())), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PostTransferActionContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostTransferActionContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PostTransferActionContextDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostTransferActionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "POST_TRANSFER_ACTION_TYPE_UNSPECIFIED", "RHS_RECURRING_UPSELL", "RHY_RECURRING_UPSELL", "GOLD_UPSELL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class PostTransferActionTypeDto implements Dto2<PostTransferActionContext.PostTransferActionType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PostTransferActionTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<PostTransferActionTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<PostTransferActionTypeDto, PostTransferActionContext.PostTransferActionType>> binaryBase64Serializer$delegate;
        public static final PostTransferActionTypeDto POST_TRANSFER_ACTION_TYPE_UNSPECIFIED = new POST_TRANSFER_ACTION_TYPE_UNSPECIFIED("POST_TRANSFER_ACTION_TYPE_UNSPECIFIED", 0);
        public static final PostTransferActionTypeDto RHS_RECURRING_UPSELL = new RHS_RECURRING_UPSELL("RHS_RECURRING_UPSELL", 1);
        public static final PostTransferActionTypeDto RHY_RECURRING_UPSELL = new RHY_RECURRING_UPSELL("RHY_RECURRING_UPSELL", 2);
        public static final PostTransferActionTypeDto GOLD_UPSELL = new GOLD_UPSELL("GOLD_UPSELL", 3);

        private static final /* synthetic */ PostTransferActionTypeDto[] $values() {
            return new PostTransferActionTypeDto[]{POST_TRANSFER_ACTION_TYPE_UNSPECIFIED, RHS_RECURRING_UPSELL, RHY_RECURRING_UPSELL, GOLD_UPSELL};
        }

        public /* synthetic */ PostTransferActionTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<PostTransferActionTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private PostTransferActionTypeDto(String str, int i) {
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PostTransferActionContextDto.PostTransferActionTypeDto.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST_TRANSFER_ACTION_TYPE_UNSPECIFIED extends PostTransferActionTypeDto {
            POST_TRANSFER_ACTION_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PostTransferActionContext.PostTransferActionType toProto() {
                return PostTransferActionContext.PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED;
            }
        }

        static {
            PostTransferActionTypeDto[] postTransferActionTypeDtoArr$values = $values();
            $VALUES = postTransferActionTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(postTransferActionTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PostTransferActionContextDto$PostTransferActionTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostTransferActionContextDto.PostTransferActionTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PostTransferActionContextDto.PostTransferActionTypeDto.RHS_RECURRING_UPSELL", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHS_RECURRING_UPSELL extends PostTransferActionTypeDto {
            RHS_RECURRING_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PostTransferActionContext.PostTransferActionType toProto() {
                return PostTransferActionContext.PostTransferActionType.RHS_RECURRING_UPSELL;
            }
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PostTransferActionContextDto.PostTransferActionTypeDto.RHY_RECURRING_UPSELL", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RHY_RECURRING_UPSELL extends PostTransferActionTypeDto {
            RHY_RECURRING_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PostTransferActionContext.PostTransferActionType toProto() {
                return PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL;
            }
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PostTransferActionContextDto.PostTransferActionTypeDto.GOLD_UPSELL", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GOLD_UPSELL extends PostTransferActionTypeDto {
            GOLD_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PostTransferActionContext.PostTransferActionType toProto() {
                return PostTransferActionContext.PostTransferActionType.GOLD_UPSELL;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContext$PostTransferActionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<PostTransferActionTypeDto, PostTransferActionContext.PostTransferActionType> {

            /* compiled from: PostTransferActionContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PostTransferActionContext.PostTransferActionType.values().length];
                    try {
                        iArr[PostTransferActionContext.PostTransferActionType.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PostTransferActionContext.PostTransferActionType.RHS_RECURRING_UPSELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PostTransferActionContext.PostTransferActionType.RHY_RECURRING_UPSELL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PostTransferActionContext.PostTransferActionType.GOLD_UPSELL.ordinal()] = 4;
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

            public final KSerializer<PostTransferActionTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PostTransferActionTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<PostTransferActionTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) PostTransferActionTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PostTransferActionContext.PostTransferActionType> getProtoAdapter() {
                return PostTransferActionContext.PostTransferActionType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PostTransferActionTypeDto getZeroValue() {
                return PostTransferActionTypeDto.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public PostTransferActionTypeDto fromProto(PostTransferActionContext.PostTransferActionType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return PostTransferActionTypeDto.POST_TRANSFER_ACTION_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return PostTransferActionTypeDto.RHS_RECURRING_UPSELL;
                }
                if (i == 3) {
                    return PostTransferActionTypeDto.RHY_RECURRING_UPSELL;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return PostTransferActionTypeDto.GOLD_UPSELL;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PostTransferActionContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$PostTransferActionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<PostTransferActionTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<PostTransferActionTypeDto, PostTransferActionContext.PostTransferActionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PostTransferActionContext.PostTransferActionType", PostTransferActionTypeDto.getEntries(), PostTransferActionTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public PostTransferActionTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (PostTransferActionTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, PostTransferActionTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static PostTransferActionTypeDto valueOf(String str) {
            return (PostTransferActionTypeDto) Enum.valueOf(PostTransferActionTypeDto.class, str);
        }

        public static PostTransferActionTypeDto[] values() {
            return (PostTransferActionTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PostTransferActionContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PostTransferActionContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PostTransferActionContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PostTransferActionContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PostTransferActionContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PostTransferActionContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PostTransferActionContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PostTransferActionContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PostTransferActionContextDto";
        }
    }
}
