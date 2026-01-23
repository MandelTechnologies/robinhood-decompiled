package bonfire.proto.idl.advisory.p030v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisory.p030v1.SwipeToSubmitDetailsContextDto;
import bonfire.proto.idl.transfers.p040v1.TransferAccountType;
import bonfire.proto.idl.transfers.p040v1.TransferAccountTypeDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetAdvisorySwipeToSubmitDetailsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequest;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;)V", "", "account_number", "transfer_amount_display_string", "source_account_display_name", "transfer_account_type", "Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;", "context", "Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;", "source_transfer_account_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;)V", "toProto", "()Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;", "getAccount_number", "getTransfer_amount_display_string", "getSource_account_display_name", "getTransfer_account_type", "getContext", "()Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;", "getSource_transfer_account_type", "()Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetAdvisorySwipeToSubmitDetailsRequestDto implements Dto3<GetAdvisorySwipeToSubmitDetailsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAdvisorySwipeToSubmitDetailsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAdvisorySwipeToSubmitDetailsRequestDto, GetAdvisorySwipeToSubmitDetailsRequest>> binaryBase64Serializer$delegate;
    private static final GetAdvisorySwipeToSubmitDetailsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAdvisorySwipeToSubmitDetailsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAdvisorySwipeToSubmitDetailsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getTransfer_amount_display_string() {
        return this.surrogate.getTransfer_amount_display_string();
    }

    public final String getSource_account_display_name() {
        return this.surrogate.getSource_account_display_name();
    }

    public final String getTransfer_account_type() {
        return this.surrogate.getTransfer_account_type();
    }

    public final SwipeToSubmitDetailsContextDto getContext() {
        return this.surrogate.getContext();
    }

    public final TransferAccountTypeDto getSource_transfer_account_type() {
        return this.surrogate.getSource_transfer_account_type();
    }

    public /* synthetic */ GetAdvisorySwipeToSubmitDetailsRequestDto(String str, String str2, String str3, String str4, SwipeToSubmitDetailsContextDto swipeToSubmitDetailsContextDto, TransferAccountTypeDto transferAccountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? SwipeToSubmitDetailsContextDto.INSTANCE.getZeroValue() : swipeToSubmitDetailsContextDto, (i & 32) != 0 ? TransferAccountTypeDto.INSTANCE.getZeroValue() : transferAccountTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAdvisorySwipeToSubmitDetailsRequestDto(String account_number, String transfer_amount_display_string, String source_account_display_name, String transfer_account_type, SwipeToSubmitDetailsContextDto context, TransferAccountTypeDto source_transfer_account_type) {
        this(new Surrogate(account_number, transfer_amount_display_string, source_account_display_name, transfer_account_type, context, source_transfer_account_type));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(transfer_amount_display_string, "transfer_amount_display_string");
        Intrinsics.checkNotNullParameter(source_account_display_name, "source_account_display_name");
        Intrinsics.checkNotNullParameter(transfer_account_type, "transfer_account_type");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source_transfer_account_type, "source_transfer_account_type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAdvisorySwipeToSubmitDetailsRequest toProto() {
        return new GetAdvisorySwipeToSubmitDetailsRequest(this.surrogate.getAccount_number(), this.surrogate.getTransfer_amount_display_string(), this.surrogate.getSource_account_display_name(), this.surrogate.getTransfer_account_type(), (SwipeToSubmitDetailsContext) this.surrogate.getContext().toProto(), (TransferAccountType) this.surrogate.getSource_transfer_account_type().toProto(), null, 64, null);
    }

    public String toString() {
        return "[GetAdvisorySwipeToSubmitDetailsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAdvisorySwipeToSubmitDetailsRequestDto) && Intrinsics.areEqual(((GetAdvisorySwipeToSubmitDetailsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAdvisorySwipeToSubmitDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010\u001cR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010&\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;", "", "", "account_number", "transfer_amount_display_string", "source_account_display_name", "transfer_account_type", "Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;", "context", "Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;", "source_transfer_account_type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_advisory_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getTransfer_amount_display_string", "getTransfer_amount_display_string$annotations", "getSource_account_display_name", "getSource_account_display_name$annotations", "getTransfer_account_type", "getTransfer_account_type$annotations", "Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;", "getContext", "()Lbonfire/proto/idl/advisory/v1/SwipeToSubmitDetailsContextDto;", "getContext$annotations", "Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;", "getSource_transfer_account_type", "()Lbonfire/proto/idl/transfers/v1/TransferAccountTypeDto;", "getSource_transfer_account_type$annotations", "Companion", "$serializer", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final SwipeToSubmitDetailsContextDto context;
        private final String source_account_display_name;
        private final TransferAccountTypeDto source_transfer_account_type;
        private final String transfer_account_type;
        private final String transfer_amount_display_string;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (SwipeToSubmitDetailsContextDto) null, (TransferAccountTypeDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.transfer_amount_display_string, surrogate.transfer_amount_display_string) && Intrinsics.areEqual(this.source_account_display_name, surrogate.source_account_display_name) && Intrinsics.areEqual(this.transfer_account_type, surrogate.transfer_account_type) && this.context == surrogate.context && this.source_transfer_account_type == surrogate.source_transfer_account_type;
        }

        public int hashCode() {
            return (((((((((this.account_number.hashCode() * 31) + this.transfer_amount_display_string.hashCode()) * 31) + this.source_account_display_name.hashCode()) * 31) + this.transfer_account_type.hashCode()) * 31) + this.context.hashCode()) * 31) + this.source_transfer_account_type.hashCode();
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", transfer_amount_display_string=" + this.transfer_amount_display_string + ", source_account_display_name=" + this.source_account_display_name + ", transfer_account_type=" + this.transfer_account_type + ", context=" + this.context + ", source_transfer_account_type=" + this.source_transfer_account_type + ")";
        }

        /* compiled from: GetAdvisorySwipeToSubmitDetailsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAdvisorySwipeToSubmitDetailsRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, SwipeToSubmitDetailsContextDto swipeToSubmitDetailsContextDto, TransferAccountTypeDto transferAccountTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.transfer_amount_display_string = "";
            } else {
                this.transfer_amount_display_string = str2;
            }
            if ((i & 4) == 0) {
                this.source_account_display_name = "";
            } else {
                this.source_account_display_name = str3;
            }
            if ((i & 8) == 0) {
                this.transfer_account_type = "";
            } else {
                this.transfer_account_type = str4;
            }
            if ((i & 16) == 0) {
                this.context = SwipeToSubmitDetailsContextDto.INSTANCE.getZeroValue();
            } else {
                this.context = swipeToSubmitDetailsContextDto;
            }
            if ((i & 32) == 0) {
                this.source_transfer_account_type = TransferAccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.source_transfer_account_type = transferAccountTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_advisory_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.transfer_amount_display_string, "")) {
                output.encodeStringElement(serialDesc, 1, self.transfer_amount_display_string);
            }
            if (!Intrinsics.areEqual(self.source_account_display_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.source_account_display_name);
            }
            if (!Intrinsics.areEqual(self.transfer_account_type, "")) {
                output.encodeStringElement(serialDesc, 3, self.transfer_account_type);
            }
            if (self.context != SwipeToSubmitDetailsContextDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, SwipeToSubmitDetailsContextDto.Serializer.INSTANCE, self.context);
            }
            if (self.source_transfer_account_type != TransferAccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, TransferAccountTypeDto.Serializer.INSTANCE, self.source_transfer_account_type);
            }
        }

        public Surrogate(String account_number, String transfer_amount_display_string, String source_account_display_name, String transfer_account_type, SwipeToSubmitDetailsContextDto context, TransferAccountTypeDto source_transfer_account_type) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(transfer_amount_display_string, "transfer_amount_display_string");
            Intrinsics.checkNotNullParameter(source_account_display_name, "source_account_display_name");
            Intrinsics.checkNotNullParameter(transfer_account_type, "transfer_account_type");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(source_transfer_account_type, "source_transfer_account_type");
            this.account_number = account_number;
            this.transfer_amount_display_string = transfer_amount_display_string;
            this.source_account_display_name = source_account_display_name;
            this.transfer_account_type = transfer_account_type;
            this.context = context;
            this.source_transfer_account_type = source_transfer_account_type;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, SwipeToSubmitDetailsContextDto swipeToSubmitDetailsContextDto, TransferAccountTypeDto transferAccountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? SwipeToSubmitDetailsContextDto.INSTANCE.getZeroValue() : swipeToSubmitDetailsContextDto, (i & 32) != 0 ? TransferAccountTypeDto.INSTANCE.getZeroValue() : transferAccountTypeDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getTransfer_amount_display_string() {
            return this.transfer_amount_display_string;
        }

        public final String getSource_account_display_name() {
            return this.source_account_display_name;
        }

        public final String getTransfer_account_type() {
            return this.transfer_account_type;
        }

        public final SwipeToSubmitDetailsContextDto getContext() {
            return this.context;
        }

        public final TransferAccountTypeDto getSource_transfer_account_type() {
            return this.source_transfer_account_type;
        }
    }

    /* compiled from: GetAdvisorySwipeToSubmitDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetAdvisorySwipeToSubmitDetailsRequestDto, GetAdvisorySwipeToSubmitDetailsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAdvisorySwipeToSubmitDetailsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAdvisorySwipeToSubmitDetailsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAdvisorySwipeToSubmitDetailsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAdvisorySwipeToSubmitDetailsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAdvisorySwipeToSubmitDetailsRequest> getProtoAdapter() {
            return GetAdvisorySwipeToSubmitDetailsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAdvisorySwipeToSubmitDetailsRequestDto getZeroValue() {
            return GetAdvisorySwipeToSubmitDetailsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAdvisorySwipeToSubmitDetailsRequestDto fromProto(GetAdvisorySwipeToSubmitDetailsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetAdvisorySwipeToSubmitDetailsRequestDto(new Surrogate(proto.getAccount_number(), proto.getTransfer_amount_display_string(), proto.getSource_account_display_name(), proto.getTransfer_account_type(), SwipeToSubmitDetailsContextDto.INSTANCE.fromProto(proto.getContext()), TransferAccountTypeDto.INSTANCE.fromProto(proto.getSource_transfer_account_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisory.v1.GetAdvisorySwipeToSubmitDetailsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAdvisorySwipeToSubmitDetailsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAdvisorySwipeToSubmitDetailsRequestDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAdvisorySwipeToSubmitDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAdvisorySwipeToSubmitDetailsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisory.v1.GetAdvisorySwipeToSubmitDetailsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAdvisorySwipeToSubmitDetailsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAdvisorySwipeToSubmitDetailsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAdvisorySwipeToSubmitDetailsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAdvisorySwipeToSubmitDetailsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisory/v1/GetAdvisorySwipeToSubmitDetailsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.advisory_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisory.v1.GetAdvisorySwipeToSubmitDetailsRequestDto";
        }
    }
}
