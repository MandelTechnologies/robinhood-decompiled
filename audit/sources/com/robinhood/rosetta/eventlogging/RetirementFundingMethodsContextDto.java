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
import com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext;
import com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContextDto;
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

/* compiled from: RetirementFundingMethodsContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005 !\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Surrogate;)V", "selected_funding_method", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "selected_funding_method_identifier", "", "(Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;Ljava/lang/String;)V", "getSelected_funding_method", "()Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "getSelected_funding_method_identifier", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "RetirementFundingMethodDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RetirementFundingMethodsContextDto implements Dto3<RetirementFundingMethodsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RetirementFundingMethodsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RetirementFundingMethodsContextDto, RetirementFundingMethodsContext>> binaryBase64Serializer$delegate;
    private static final RetirementFundingMethodsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RetirementFundingMethodsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RetirementFundingMethodsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final RetirementFundingMethodDto getSelected_funding_method() {
        return this.surrogate.getSelected_funding_method();
    }

    public final String getSelected_funding_method_identifier() {
        return this.surrogate.getSelected_funding_method_identifier();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RetirementFundingMethodsContextDto(RetirementFundingMethodDto selected_funding_method, String selected_funding_method_identifier) {
        this(new Surrogate(selected_funding_method, selected_funding_method_identifier));
        Intrinsics.checkNotNullParameter(selected_funding_method, "selected_funding_method");
        Intrinsics.checkNotNullParameter(selected_funding_method_identifier, "selected_funding_method_identifier");
    }

    public /* synthetic */ RetirementFundingMethodsContextDto(RetirementFundingMethodDto retirementFundingMethodDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RetirementFundingMethodDto.INSTANCE.getZeroValue() : retirementFundingMethodDto, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ RetirementFundingMethodsContextDto copy$default(RetirementFundingMethodsContextDto retirementFundingMethodsContextDto, RetirementFundingMethodDto retirementFundingMethodDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            retirementFundingMethodDto = retirementFundingMethodsContextDto.surrogate.getSelected_funding_method();
        }
        if ((i & 2) != 0) {
            str = retirementFundingMethodsContextDto.surrogate.getSelected_funding_method_identifier();
        }
        return retirementFundingMethodsContextDto.copy(retirementFundingMethodDto, str);
    }

    public final RetirementFundingMethodsContextDto copy(RetirementFundingMethodDto selected_funding_method, String selected_funding_method_identifier) {
        Intrinsics.checkNotNullParameter(selected_funding_method, "selected_funding_method");
        Intrinsics.checkNotNullParameter(selected_funding_method_identifier, "selected_funding_method_identifier");
        return new RetirementFundingMethodsContextDto(new Surrogate(selected_funding_method, selected_funding_method_identifier));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RetirementFundingMethodsContext toProto() {
        return new RetirementFundingMethodsContext((RetirementFundingMethodsContext.RetirementFundingMethod) this.surrogate.getSelected_funding_method().toProto(), this.surrogate.getSelected_funding_method_identifier(), null, 4, null);
    }

    public String toString() {
        return "[RetirementFundingMethodsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RetirementFundingMethodsContextDto) && Intrinsics.areEqual(((RetirementFundingMethodsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: RetirementFundingMethodsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Surrogate;", "", "selected_funding_method", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "selected_funding_method_identifier", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSelected_funding_method$annotations", "()V", "getSelected_funding_method", "()Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "getSelected_funding_method_identifier$annotations", "getSelected_funding_method_identifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RetirementFundingMethodDto selected_funding_method;
        private final String selected_funding_method_identifier;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((RetirementFundingMethodDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, RetirementFundingMethodDto retirementFundingMethodDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                retirementFundingMethodDto = surrogate.selected_funding_method;
            }
            if ((i & 2) != 0) {
                str = surrogate.selected_funding_method_identifier;
            }
            return surrogate.copy(retirementFundingMethodDto, str);
        }

        @SerialName("selectedFundingMethod")
        @JsonAnnotations2(names = {"selected_funding_method"})
        public static /* synthetic */ void getSelected_funding_method$annotations() {
        }

        @SerialName("selectedFundingMethodIdentifier")
        @JsonAnnotations2(names = {"selected_funding_method_identifier"})
        public static /* synthetic */ void getSelected_funding_method_identifier$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final RetirementFundingMethodDto getSelected_funding_method() {
            return this.selected_funding_method;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSelected_funding_method_identifier() {
            return this.selected_funding_method_identifier;
        }

        public final Surrogate copy(RetirementFundingMethodDto selected_funding_method, String selected_funding_method_identifier) {
            Intrinsics.checkNotNullParameter(selected_funding_method, "selected_funding_method");
            Intrinsics.checkNotNullParameter(selected_funding_method_identifier, "selected_funding_method_identifier");
            return new Surrogate(selected_funding_method, selected_funding_method_identifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.selected_funding_method == surrogate.selected_funding_method && Intrinsics.areEqual(this.selected_funding_method_identifier, surrogate.selected_funding_method_identifier);
        }

        public int hashCode() {
            return (this.selected_funding_method.hashCode() * 31) + this.selected_funding_method_identifier.hashCode();
        }

        public String toString() {
            return "Surrogate(selected_funding_method=" + this.selected_funding_method + ", selected_funding_method_identifier=" + this.selected_funding_method_identifier + ")";
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RetirementFundingMethodsContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, RetirementFundingMethodDto retirementFundingMethodDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.selected_funding_method = (i & 1) == 0 ? RetirementFundingMethodDto.INSTANCE.getZeroValue() : retirementFundingMethodDto;
            if ((i & 2) == 0) {
                this.selected_funding_method_identifier = "";
            } else {
                this.selected_funding_method_identifier = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.selected_funding_method != RetirementFundingMethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, RetirementFundingMethodDto.Serializer.INSTANCE, self.selected_funding_method);
            }
            if (Intrinsics.areEqual(self.selected_funding_method_identifier, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.selected_funding_method_identifier);
        }

        public Surrogate(RetirementFundingMethodDto selected_funding_method, String selected_funding_method_identifier) {
            Intrinsics.checkNotNullParameter(selected_funding_method, "selected_funding_method");
            Intrinsics.checkNotNullParameter(selected_funding_method_identifier, "selected_funding_method_identifier");
            this.selected_funding_method = selected_funding_method;
            this.selected_funding_method_identifier = selected_funding_method_identifier;
        }

        public final RetirementFundingMethodDto getSelected_funding_method() {
            return this.selected_funding_method;
        }

        public /* synthetic */ Surrogate(RetirementFundingMethodDto retirementFundingMethodDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? RetirementFundingMethodDto.INSTANCE.getZeroValue() : retirementFundingMethodDto, (i & 2) != 0 ? "" : str);
        }

        public final String getSelected_funding_method_identifier() {
            return this.selected_funding_method_identifier;
        }
    }

    /* compiled from: RetirementFundingMethodsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RetirementFundingMethodsContextDto, RetirementFundingMethodsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RetirementFundingMethodsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RetirementFundingMethodsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RetirementFundingMethodsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) RetirementFundingMethodsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RetirementFundingMethodsContext> getProtoAdapter() {
            return RetirementFundingMethodsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RetirementFundingMethodsContextDto getZeroValue() {
            return RetirementFundingMethodsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RetirementFundingMethodsContextDto fromProto(RetirementFundingMethodsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RetirementFundingMethodsContextDto(new Surrogate(RetirementFundingMethodDto.INSTANCE.fromProto(proto.getSelected_funding_method()), proto.getSelected_funding_method_identifier()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RetirementFundingMethodsContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RetirementFundingMethodsContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RetirementFundingMethodsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CONTRIBUTION", "DIRECT_ROLLOVER", "ACATS", "INDIRECT_ROLLOVER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RetirementFundingMethodDto implements Dto2<RetirementFundingMethodsContext.RetirementFundingMethod>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RetirementFundingMethodDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RetirementFundingMethodDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RetirementFundingMethodDto, RetirementFundingMethodsContext.RetirementFundingMethod>> binaryBase64Serializer$delegate;
        public static final RetirementFundingMethodDto CONTRIBUTION = new CONTRIBUTION("CONTRIBUTION", 0);
        public static final RetirementFundingMethodDto DIRECT_ROLLOVER = new DIRECT_ROLLOVER("DIRECT_ROLLOVER", 1);
        public static final RetirementFundingMethodDto ACATS = new ACATS("ACATS", 2);
        public static final RetirementFundingMethodDto INDIRECT_ROLLOVER = new INDIRECT_ROLLOVER("INDIRECT_ROLLOVER", 3);

        private static final /* synthetic */ RetirementFundingMethodDto[] $values() {
            return new RetirementFundingMethodDto[]{CONTRIBUTION, DIRECT_ROLLOVER, ACATS, INDIRECT_ROLLOVER};
        }

        public /* synthetic */ RetirementFundingMethodDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RetirementFundingMethodDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private RetirementFundingMethodDto(String str, int i) {
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto.RetirementFundingMethodDto.CONTRIBUTION", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONTRIBUTION extends RetirementFundingMethodDto {
            CONTRIBUTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RetirementFundingMethodsContext.RetirementFundingMethod toProto() {
                return RetirementFundingMethodsContext.RetirementFundingMethod.CONTRIBUTION;
            }
        }

        static {
            RetirementFundingMethodDto[] retirementFundingMethodDtoArr$values = $values();
            $VALUES = retirementFundingMethodDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(retirementFundingMethodDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContextDto$RetirementFundingMethodDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RetirementFundingMethodsContextDto.RetirementFundingMethodDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto.RetirementFundingMethodDto.DIRECT_ROLLOVER", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DIRECT_ROLLOVER extends RetirementFundingMethodDto {
            DIRECT_ROLLOVER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RetirementFundingMethodsContext.RetirementFundingMethod toProto() {
                return RetirementFundingMethodsContext.RetirementFundingMethod.DIRECT_ROLLOVER;
            }
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto.RetirementFundingMethodDto.ACATS", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACATS extends RetirementFundingMethodDto {
            ACATS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RetirementFundingMethodsContext.RetirementFundingMethod toProto() {
                return RetirementFundingMethodsContext.RetirementFundingMethod.ACATS;
            }
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto.RetirementFundingMethodDto.INDIRECT_ROLLOVER", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INDIRECT_ROLLOVER extends RetirementFundingMethodDto {
            INDIRECT_ROLLOVER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RetirementFundingMethodsContext.RetirementFundingMethod toProto() {
                return RetirementFundingMethodsContext.RetirementFundingMethod.INDIRECT_ROLLOVER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContext$RetirementFundingMethod;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RetirementFundingMethodDto, RetirementFundingMethodsContext.RetirementFundingMethod> {

            /* compiled from: RetirementFundingMethodsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RetirementFundingMethodsContext.RetirementFundingMethod.values().length];
                    try {
                        iArr[RetirementFundingMethodsContext.RetirementFundingMethod.CONTRIBUTION.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RetirementFundingMethodsContext.RetirementFundingMethod.DIRECT_ROLLOVER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RetirementFundingMethodsContext.RetirementFundingMethod.ACATS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RetirementFundingMethodsContext.RetirementFundingMethod.INDIRECT_ROLLOVER.ordinal()] = 4;
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

            public final KSerializer<RetirementFundingMethodDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RetirementFundingMethodDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RetirementFundingMethodDto> getBinaryBase64Serializer() {
                return (KSerializer) RetirementFundingMethodDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RetirementFundingMethodsContext.RetirementFundingMethod> getProtoAdapter() {
                return RetirementFundingMethodsContext.RetirementFundingMethod.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RetirementFundingMethodDto getZeroValue() {
                return RetirementFundingMethodDto.CONTRIBUTION;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RetirementFundingMethodDto fromProto(RetirementFundingMethodsContext.RetirementFundingMethod proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RetirementFundingMethodDto.CONTRIBUTION;
                }
                if (i == 2) {
                    return RetirementFundingMethodDto.DIRECT_ROLLOVER;
                }
                if (i == 3) {
                    return RetirementFundingMethodDto.ACATS;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return RetirementFundingMethodDto.INDIRECT_ROLLOVER;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RetirementFundingMethodsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$RetirementFundingMethodDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RetirementFundingMethodDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RetirementFundingMethodDto, RetirementFundingMethodsContext.RetirementFundingMethod> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RetirementFundingMethodsContext.RetirementFundingMethod", RetirementFundingMethodDto.getEntries(), RetirementFundingMethodDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RetirementFundingMethodDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RetirementFundingMethodDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RetirementFundingMethodDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RetirementFundingMethodDto valueOf(String str) {
            return (RetirementFundingMethodDto) Enum.valueOf(RetirementFundingMethodDto.class, str);
        }

        public static RetirementFundingMethodDto[] values() {
            return (RetirementFundingMethodDto[]) $VALUES.clone();
        }
    }

    /* compiled from: RetirementFundingMethodsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RetirementFundingMethodsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RetirementFundingMethodsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RetirementFundingMethodsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RetirementFundingMethodsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RetirementFundingMethodsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: RetirementFundingMethodsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RetirementFundingMethodsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContextDto";
        }
    }
}
