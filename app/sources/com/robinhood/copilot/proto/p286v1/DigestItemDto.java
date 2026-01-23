package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.copilot.proto.p286v1.DigestItemTypeDto;
import com.robinhood.copilot.proto.p286v1.GenericDigestItemDto;
import com.robinhood.copilot.proto.p286v1.ReturnDriverDigestItemDto;
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

/* compiled from: DigestItemDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/DigestItem;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/DigestItemDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/DigestItemDto$Surrogate;)V", "item_type", "Lcom/robinhood/copilot/proto/v1/DigestItemTypeDto;", "generic_item", "Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;", "return_driver_item", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "(Lcom/robinhood/copilot/proto/v1/DigestItemTypeDto;Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;)V", "getItem_type", "()Lcom/robinhood/copilot/proto/v1/DigestItemTypeDto;", "getGeneric_item", "()Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;", "getReturn_driver_item", "()Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class DigestItemDto implements Dto3<DigestItem>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<DigestItemDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<DigestItemDto, DigestItem>> binaryBase64Serializer$delegate;
    private static final DigestItemDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ DigestItemDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private DigestItemDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final DigestItemTypeDto getItem_type() {
        return this.surrogate.getItem_type();
    }

    public final GenericDigestItemDto getGeneric_item() {
        return this.surrogate.getGeneric_item();
    }

    public final ReturnDriverDigestItemDto getReturn_driver_item() {
        return this.surrogate.getReturn_driver_item();
    }

    public /* synthetic */ DigestItemDto(DigestItemTypeDto digestItemTypeDto, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DigestItemTypeDto.INSTANCE.getZeroValue() : digestItemTypeDto, (i & 2) != 0 ? null : genericDigestItemDto, (i & 4) != 0 ? null : returnDriverDigestItemDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DigestItemDto(DigestItemTypeDto item_type, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto) {
        this(new Surrogate(item_type, genericDigestItemDto, returnDriverDigestItemDto));
        Intrinsics.checkNotNullParameter(item_type, "item_type");
    }

    public static /* synthetic */ DigestItemDto copy$default(DigestItemDto digestItemDto, DigestItemTypeDto digestItemTypeDto, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto, int i, Object obj) {
        if ((i & 1) != 0) {
            digestItemTypeDto = digestItemDto.surrogate.getItem_type();
        }
        if ((i & 2) != 0) {
            genericDigestItemDto = digestItemDto.surrogate.getGeneric_item();
        }
        if ((i & 4) != 0) {
            returnDriverDigestItemDto = digestItemDto.surrogate.getReturn_driver_item();
        }
        return digestItemDto.copy(digestItemTypeDto, genericDigestItemDto, returnDriverDigestItemDto);
    }

    public final DigestItemDto copy(DigestItemTypeDto item_type, GenericDigestItemDto generic_item, ReturnDriverDigestItemDto return_driver_item) {
        Intrinsics.checkNotNullParameter(item_type, "item_type");
        return new DigestItemDto(new Surrogate(item_type, generic_item, return_driver_item));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public DigestItem toProto() {
        DigestItemType digestItemType = (DigestItemType) this.surrogate.getItem_type().toProto();
        GenericDigestItemDto generic_item = this.surrogate.getGeneric_item();
        GenericDigestItem proto = generic_item != null ? generic_item.toProto() : null;
        ReturnDriverDigestItemDto return_driver_item = this.surrogate.getReturn_driver_item();
        return new DigestItem(digestItemType, proto, return_driver_item != null ? return_driver_item.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[DigestItemDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof DigestItemDto) && Intrinsics.areEqual(((DigestItemDto) other).surrogate, this.surrogate);
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
    /* compiled from: DigestItemDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemDto$Surrogate;", "", "item_type", "Lcom/robinhood/copilot/proto/v1/DigestItemTypeDto;", "generic_item", "Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;", "return_driver_item", "Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "<init>", "(Lcom/robinhood/copilot/proto/v1/DigestItemTypeDto;Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/copilot/proto/v1/DigestItemTypeDto;Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getItem_type$annotations", "()V", "getItem_type", "()Lcom/robinhood/copilot/proto/v1/DigestItemTypeDto;", "getGeneric_item$annotations", "getGeneric_item", "()Lcom/robinhood/copilot/proto/v1/GenericDigestItemDto;", "getReturn_driver_item$annotations", "getReturn_driver_item", "()Lcom/robinhood/copilot/proto/v1/ReturnDriverDigestItemDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GenericDigestItemDto generic_item;
        private final DigestItemTypeDto item_type;
        private final ReturnDriverDigestItemDto return_driver_item;

        public Surrogate() {
            this((DigestItemTypeDto) null, (GenericDigestItemDto) null, (ReturnDriverDigestItemDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, DigestItemTypeDto digestItemTypeDto, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto, int i, Object obj) {
            if ((i & 1) != 0) {
                digestItemTypeDto = surrogate.item_type;
            }
            if ((i & 2) != 0) {
                genericDigestItemDto = surrogate.generic_item;
            }
            if ((i & 4) != 0) {
                returnDriverDigestItemDto = surrogate.return_driver_item;
            }
            return surrogate.copy(digestItemTypeDto, genericDigestItemDto, returnDriverDigestItemDto);
        }

        @SerialName("genericItem")
        @JsonAnnotations2(names = {"generic_item"})
        public static /* synthetic */ void getGeneric_item$annotations() {
        }

        @SerialName("itemType")
        @JsonAnnotations2(names = {"item_type"})
        public static /* synthetic */ void getItem_type$annotations() {
        }

        @SerialName("returnDriverItem")
        @JsonAnnotations2(names = {"return_driver_item"})
        public static /* synthetic */ void getReturn_driver_item$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final DigestItemTypeDto getItem_type() {
            return this.item_type;
        }

        /* renamed from: component2, reason: from getter */
        public final GenericDigestItemDto getGeneric_item() {
            return this.generic_item;
        }

        /* renamed from: component3, reason: from getter */
        public final ReturnDriverDigestItemDto getReturn_driver_item() {
            return this.return_driver_item;
        }

        public final Surrogate copy(DigestItemTypeDto item_type, GenericDigestItemDto generic_item, ReturnDriverDigestItemDto return_driver_item) {
            Intrinsics.checkNotNullParameter(item_type, "item_type");
            return new Surrogate(item_type, generic_item, return_driver_item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.item_type == surrogate.item_type && Intrinsics.areEqual(this.generic_item, surrogate.generic_item) && Intrinsics.areEqual(this.return_driver_item, surrogate.return_driver_item);
        }

        public int hashCode() {
            int iHashCode = this.item_type.hashCode() * 31;
            GenericDigestItemDto genericDigestItemDto = this.generic_item;
            int iHashCode2 = (iHashCode + (genericDigestItemDto == null ? 0 : genericDigestItemDto.hashCode())) * 31;
            ReturnDriverDigestItemDto returnDriverDigestItemDto = this.return_driver_item;
            return iHashCode2 + (returnDriverDigestItemDto != null ? returnDriverDigestItemDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(item_type=" + this.item_type + ", generic_item=" + this.generic_item + ", return_driver_item=" + this.return_driver_item + ")";
        }

        /* compiled from: DigestItemDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/DigestItemDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return DigestItemDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DigestItemTypeDto digestItemTypeDto, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.item_type = (i & 1) == 0 ? DigestItemTypeDto.INSTANCE.getZeroValue() : digestItemTypeDto;
            if ((i & 2) == 0) {
                this.generic_item = null;
            } else {
                this.generic_item = genericDigestItemDto;
            }
            if ((i & 4) == 0) {
                this.return_driver_item = null;
            } else {
                this.return_driver_item = returnDriverDigestItemDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.item_type != DigestItemTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, DigestItemTypeDto.Serializer.INSTANCE, self.item_type);
            }
            GenericDigestItemDto genericDigestItemDto = self.generic_item;
            if (genericDigestItemDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, GenericDigestItemDto.Serializer.INSTANCE, genericDigestItemDto);
            }
            ReturnDriverDigestItemDto returnDriverDigestItemDto = self.return_driver_item;
            if (returnDriverDigestItemDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ReturnDriverDigestItemDto.Serializer.INSTANCE, returnDriverDigestItemDto);
            }
        }

        public Surrogate(DigestItemTypeDto item_type, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto) {
            Intrinsics.checkNotNullParameter(item_type, "item_type");
            this.item_type = item_type;
            this.generic_item = genericDigestItemDto;
            this.return_driver_item = returnDriverDigestItemDto;
        }

        public final DigestItemTypeDto getItem_type() {
            return this.item_type;
        }

        public /* synthetic */ Surrogate(DigestItemTypeDto digestItemTypeDto, GenericDigestItemDto genericDigestItemDto, ReturnDriverDigestItemDto returnDriverDigestItemDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DigestItemTypeDto.INSTANCE.getZeroValue() : digestItemTypeDto, (i & 2) != 0 ? null : genericDigestItemDto, (i & 4) != 0 ? null : returnDriverDigestItemDto);
        }

        public final GenericDigestItemDto getGeneric_item() {
            return this.generic_item;
        }

        public final ReturnDriverDigestItemDto getReturn_driver_item() {
            return this.return_driver_item;
        }
    }

    /* compiled from: DigestItemDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/DigestItemDto;", "Lcom/robinhood/copilot/proto/v1/DigestItem;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/DigestItemDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<DigestItemDto, DigestItem> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DigestItemDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DigestItemDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<DigestItemDto> getBinaryBase64Serializer() {
            return (KSerializer) DigestItemDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<DigestItem> getProtoAdapter() {
            return DigestItem.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DigestItemDto getZeroValue() {
            return DigestItemDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public DigestItemDto fromProto(DigestItem proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DigestItemTypeDto digestItemTypeDtoFromProto = DigestItemTypeDto.INSTANCE.fromProto(proto.getItem_type());
            GenericDigestItem generic_item = proto.getGeneric_item();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GenericDigestItemDto genericDigestItemDtoFromProto = generic_item != null ? GenericDigestItemDto.INSTANCE.fromProto(generic_item) : null;
            ReturnDriverDigestItem return_driver_item = proto.getReturn_driver_item();
            return new DigestItemDto(new Surrogate(digestItemTypeDtoFromProto, genericDigestItemDtoFromProto, return_driver_item != null ? ReturnDriverDigestItemDto.INSTANCE.fromProto(return_driver_item) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.DigestItemDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DigestItemDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new DigestItemDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: DigestItemDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/DigestItemDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/DigestItemDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<DigestItemDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.DigestItem", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, DigestItemDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public DigestItemDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new DigestItemDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: DigestItemDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.DigestItemDto";
        }
    }
}
