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
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContextDto;
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

/* compiled from: PaymentLinkingContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\u001d\u001e\u001f !B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Surrogate;)V", "entry_point", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "(Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;)V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EntryPointDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PaymentLinkingContextDto implements Dto3<PaymentLinkingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PaymentLinkingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PaymentLinkingContextDto, PaymentLinkingContext>> binaryBase64Serializer$delegate;
    private static final PaymentLinkingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PaymentLinkingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PaymentLinkingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentLinkingContextDto(EntryPointDto entry_point) {
        this(new Surrogate(entry_point));
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
    }

    public /* synthetic */ PaymentLinkingContextDto(EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto);
    }

    public static /* synthetic */ PaymentLinkingContextDto copy$default(PaymentLinkingContextDto paymentLinkingContextDto, EntryPointDto entryPointDto, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPointDto = paymentLinkingContextDto.surrogate.getEntry_point();
        }
        return paymentLinkingContextDto.copy(entryPointDto);
    }

    public final PaymentLinkingContextDto copy(EntryPointDto entry_point) {
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        return new PaymentLinkingContextDto(new Surrogate(entry_point));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PaymentLinkingContext toProto() {
        return new PaymentLinkingContext((PaymentLinkingContext.EntryPoint) this.surrogate.getEntry_point().toProto(), null, 2, null);
    }

    public String toString() {
        return "[PaymentLinkingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PaymentLinkingContextDto) && Intrinsics.areEqual(((PaymentLinkingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: PaymentLinkingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Surrogate;", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEntry_point$annotations", "()V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EntryPointDto entry_point;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((EntryPointDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EntryPointDto entryPointDto, int i, Object obj) {
            if ((i & 1) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            return surrogate.copy(entryPointDto);
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final Surrogate copy(EntryPointDto entry_point) {
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            return new Surrogate(entry_point);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.entry_point == ((Surrogate) other).entry_point;
        }

        public int hashCode() {
            return this.entry_point.hashCode();
        }

        public String toString() {
            return "Surrogate(entry_point=" + this.entry_point + ")";
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PaymentLinkingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EntryPointDto entryPointDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
        }

        public Surrogate(EntryPointDto entry_point) {
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            this.entry_point = entry_point;
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public /* synthetic */ Surrogate(EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto);
        }
    }

    /* compiled from: PaymentLinkingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PaymentLinkingContextDto, PaymentLinkingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PaymentLinkingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PaymentLinkingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PaymentLinkingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) PaymentLinkingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PaymentLinkingContext> getProtoAdapter() {
            return PaymentLinkingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PaymentLinkingContextDto getZeroValue() {
            return PaymentLinkingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PaymentLinkingContextDto fromProto(PaymentLinkingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PaymentLinkingContextDto(new Surrogate(EntryPointDto.INSTANCE.fromProto(proto.getEntry_point())), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PaymentLinkingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentLinkingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PaymentLinkingContextDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentLinkingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "LINKED_ACCOUNTS_SECTION", "TRANSFER_ACCOUNT_SELECTION", "WITHDRAWAL_CONFIRMATION", "FIRST_TRADE_RECOMMENDATION", "MAX_TRANSFER_REVIEW", "DEEPLINK", "LINKED_ACCOUNTS_SECTION_ACTION_SHEET", "CATPAY", "USER_SIGN_UP", "PLAID_FALLBACK", "MENU_OF_OPTIONS", "TRANSFERS_V2_REVIEW", "CRYPTO_CHECKOUT_ACCOUNT_SELECTION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<PaymentLinkingContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, PaymentLinkingContext.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto LINKED_ACCOUNTS_SECTION = new LINKED_ACCOUNTS_SECTION("LINKED_ACCOUNTS_SECTION", 1);
        public static final EntryPointDto TRANSFER_ACCOUNT_SELECTION = new TRANSFER_ACCOUNT_SELECTION("TRANSFER_ACCOUNT_SELECTION", 2);
        public static final EntryPointDto WITHDRAWAL_CONFIRMATION = new WITHDRAWAL_CONFIRMATION("WITHDRAWAL_CONFIRMATION", 3);
        public static final EntryPointDto FIRST_TRADE_RECOMMENDATION = new FIRST_TRADE_RECOMMENDATION("FIRST_TRADE_RECOMMENDATION", 4);
        public static final EntryPointDto MAX_TRANSFER_REVIEW = new MAX_TRANSFER_REVIEW("MAX_TRANSFER_REVIEW", 5);
        public static final EntryPointDto DEEPLINK = new DEEPLINK("DEEPLINK", 6);
        public static final EntryPointDto LINKED_ACCOUNTS_SECTION_ACTION_SHEET = new LINKED_ACCOUNTS_SECTION_ACTION_SHEET("LINKED_ACCOUNTS_SECTION_ACTION_SHEET", 7);
        public static final EntryPointDto CATPAY = new CATPAY("CATPAY", 8);
        public static final EntryPointDto USER_SIGN_UP = new USER_SIGN_UP("USER_SIGN_UP", 9);
        public static final EntryPointDto PLAID_FALLBACK = new PLAID_FALLBACK("PLAID_FALLBACK", 10);
        public static final EntryPointDto MENU_OF_OPTIONS = new MENU_OF_OPTIONS("MENU_OF_OPTIONS", 11);
        public static final EntryPointDto TRANSFERS_V2_REVIEW = new TRANSFERS_V2_REVIEW("TRANSFERS_V2_REVIEW", 12);
        public static final EntryPointDto CRYPTO_CHECKOUT_ACCOUNT_SELECTION = new CRYPTO_CHECKOUT_ACCOUNT_SELECTION("CRYPTO_CHECKOUT_ACCOUNT_SELECTION", 13);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, LINKED_ACCOUNTS_SECTION, TRANSFER_ACCOUNT_SELECTION, WITHDRAWAL_CONFIRMATION, FIRST_TRADE_RECOMMENDATION, MAX_TRANSFER_REVIEW, DEEPLINK, LINKED_ACCOUNTS_SECTION_ACTION_SHEET, CATPAY, USER_SIGN_UP, PLAID_FALLBACK, MENU_OF_OPTIONS, TRANSFERS_V2_REVIEW, CRYPTO_CHECKOUT_ACCOUNT_SELECTION};
        }

        public /* synthetic */ EntryPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            }
        }

        private EntryPointDto(String str, int i) {
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PaymentLinkingContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentLinkingContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.LINKED_ACCOUNTS_SECTION", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINKED_ACCOUNTS_SECTION extends EntryPointDto {
            LINKED_ACCOUNTS_SECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.LINKED_ACCOUNTS_SECTION;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.TRANSFER_ACCOUNT_SELECTION", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFER_ACCOUNT_SELECTION extends EntryPointDto {
            TRANSFER_ACCOUNT_SELECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.WITHDRAWAL_CONFIRMATION", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WITHDRAWAL_CONFIRMATION extends EntryPointDto {
            WITHDRAWAL_CONFIRMATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.WITHDRAWAL_CONFIRMATION;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.FIRST_TRADE_RECOMMENDATION", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIRST_TRADE_RECOMMENDATION extends EntryPointDto {
            FIRST_TRADE_RECOMMENDATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.FIRST_TRADE_RECOMMENDATION;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.MAX_TRANSFER_REVIEW", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MAX_TRANSFER_REVIEW extends EntryPointDto {
            MAX_TRANSFER_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.MAX_TRANSFER_REVIEW;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.DEEPLINK", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEEPLINK extends EntryPointDto {
            DEEPLINK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.DEEPLINK;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.LINKED_ACCOUNTS_SECTION_ACTION_SHEET", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINKED_ACCOUNTS_SECTION_ACTION_SHEET extends EntryPointDto {
            LINKED_ACCOUNTS_SECTION_ACTION_SHEET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.LINKED_ACCOUNTS_SECTION_ACTION_SHEET;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.CATPAY", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CATPAY extends EntryPointDto {
            CATPAY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.CATPAY;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.USER_SIGN_UP", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER_SIGN_UP extends EntryPointDto {
            USER_SIGN_UP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.USER_SIGN_UP;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.PLAID_FALLBACK", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PLAID_FALLBACK extends EntryPointDto {
            PLAID_FALLBACK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.PLAID_FALLBACK;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.MENU_OF_OPTIONS", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MENU_OF_OPTIONS extends EntryPointDto {
            MENU_OF_OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.TRANSFERS_V2_REVIEW", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRANSFERS_V2_REVIEW extends EntryPointDto {
            TRANSFERS_V2_REVIEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.TRANSFERS_V2_REVIEW;
            }
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PaymentLinkingContextDto.EntryPointDto.CRYPTO_CHECKOUT_ACCOUNT_SELECTION", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        static final class CRYPTO_CHECKOUT_ACCOUNT_SELECTION extends EntryPointDto {
            CRYPTO_CHECKOUT_ACCOUNT_SELECTION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PaymentLinkingContext.EntryPoint toProto() {
                return PaymentLinkingContext.EntryPoint.CRYPTO_CHECKOUT_ACCOUNT_SELECTION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, PaymentLinkingContext.EntryPoint> {

            /* compiled from: PaymentLinkingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PaymentLinkingContext.EntryPoint.values().length];
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.LINKED_ACCOUNTS_SECTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.WITHDRAWAL_CONFIRMATION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.FIRST_TRADE_RECOMMENDATION.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.MAX_TRANSFER_REVIEW.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.DEEPLINK.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.LINKED_ACCOUNTS_SECTION_ACTION_SHEET.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.CATPAY.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.USER_SIGN_UP.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.PLAID_FALLBACK.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.TRANSFERS_V2_REVIEW.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[PaymentLinkingContext.EntryPoint.CRYPTO_CHECKOUT_ACCOUNT_SELECTION.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EntryPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PaymentLinkingContext.EntryPoint> getProtoAdapter() {
                return PaymentLinkingContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(PaymentLinkingContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.LINKED_ACCOUNTS_SECTION;
                    case 3:
                        return EntryPointDto.TRANSFER_ACCOUNT_SELECTION;
                    case 4:
                        return EntryPointDto.WITHDRAWAL_CONFIRMATION;
                    case 5:
                        return EntryPointDto.FIRST_TRADE_RECOMMENDATION;
                    case 6:
                        return EntryPointDto.MAX_TRANSFER_REVIEW;
                    case 7:
                        return EntryPointDto.DEEPLINK;
                    case 8:
                        return EntryPointDto.LINKED_ACCOUNTS_SECTION_ACTION_SHEET;
                    case 9:
                        return EntryPointDto.CATPAY;
                    case 10:
                        return EntryPointDto.USER_SIGN_UP;
                    case 11:
                        return EntryPointDto.PLAID_FALLBACK;
                    case 12:
                        return EntryPointDto.MENU_OF_OPTIONS;
                    case 13:
                        return EntryPointDto.TRANSFERS_V2_REVIEW;
                    case 14:
                        return EntryPointDto.CRYPTO_CHECKOUT_ACCOUNT_SELECTION;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PaymentLinkingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, PaymentLinkingContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PaymentLinkingContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryPointDto valueOf(String str) {
            return (EntryPointDto) Enum.valueOf(EntryPointDto.class, str);
        }

        public static EntryPointDto[] values() {
            return (EntryPointDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentLinkingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PaymentLinkingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PaymentLinkingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PaymentLinkingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PaymentLinkingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PaymentLinkingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PaymentLinkingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PaymentLinkingContextDto";
        }
    }
}
