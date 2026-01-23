package bonfire.proto.idl.margin.p036v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.margin.p036v1.MarginInvestingStateDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityContextDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountIneligibilityContentModelDto;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetMultiAccountEligibilityResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010&R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;)V", "", "account_number", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "context", "", "is_eligible", "Lbonfire/proto/idl/margin/v1/MarginInvestingStateDto;", "margin_investing_state", "Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;", "ineligibility_content", "(Ljava/lang/String;Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;ZLbonfire/proto/idl/margin/v1/MarginInvestingStateDto;Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;)V", "toProto", "()Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;", "()Z", "getMargin_investing_state", "()Lbonfire/proto/idl/margin/v1/MarginInvestingStateDto;", "getIneligibility_content", "()Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetMultiAccountEligibilityResponseDto implements Dto3<GetMultiAccountEligibilityResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMultiAccountEligibilityResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponse>> binaryBase64Serializer$delegate;
    private static final GetMultiAccountEligibilityResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMultiAccountEligibilityResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMultiAccountEligibilityResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean is_eligible() {
        return this.surrogate.getIs_eligible();
    }

    public final MarginInvestingStateDto getMargin_investing_state() {
        return this.surrogate.getMargin_investing_state();
    }

    public final MultiAccountIneligibilityContentModelDto getIneligibility_content() {
        return this.surrogate.getIneligibility_content();
    }

    public /* synthetic */ GetMultiAccountEligibilityResponseDto(String str, MultiAccountEligibilityContextDto multiAccountEligibilityContextDto, boolean z, MarginInvestingStateDto marginInvestingStateDto, MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MultiAccountEligibilityContextDto.INSTANCE.getZeroValue() : multiAccountEligibilityContextDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? MarginInvestingStateDto.INSTANCE.getZeroValue() : marginInvestingStateDto, (i & 16) != 0 ? null : multiAccountIneligibilityContentModelDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMultiAccountEligibilityResponseDto(String account_number, MultiAccountEligibilityContextDto context, boolean z, MarginInvestingStateDto margin_investing_state, MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto) {
        this(new Surrogate(account_number, context, z, margin_investing_state, multiAccountIneligibilityContentModelDto));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(margin_investing_state, "margin_investing_state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetMultiAccountEligibilityResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        MultiAccountEligibilityContext multiAccountEligibilityContext = (MultiAccountEligibilityContext) this.surrogate.getContext().toProto();
        boolean is_eligible = this.surrogate.getIs_eligible();
        MarginInvestingState marginInvestingState = (MarginInvestingState) this.surrogate.getMargin_investing_state().toProto();
        MultiAccountIneligibilityContentModelDto ineligibility_content = this.surrogate.getIneligibility_content();
        return new GetMultiAccountEligibilityResponse(account_number, multiAccountEligibilityContext, is_eligible, marginInvestingState, ineligibility_content != null ? ineligibility_content.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[GetMultiAccountEligibilityResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMultiAccountEligibilityResponseDto) && Intrinsics.areEqual(((GetMultiAccountEligibilityResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMultiAccountEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b-\u0010&\u001a\u0004\b\u0007\u0010,R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u0010&\u001a\u0004\b3\u00104¨\u00068"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;", "", "", "account_number", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "context", "", "is_eligible", "Lbonfire/proto/idl/margin/v1/MarginInvestingStateDto;", "margin_investing_state", "Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;", "ineligibility_content", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;ZLbonfire/proto/idl/margin/v1/MarginInvestingStateDto;Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;ZLbonfire/proto/idl/margin/v1/MarginInvestingStateDto;Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_maintenance_table_v1_externalRelease", "(Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "getContext", "()Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "getContext$annotations", "Z", "()Z", "is_eligible$annotations", "Lbonfire/proto/idl/margin/v1/MarginInvestingStateDto;", "getMargin_investing_state", "()Lbonfire/proto/idl/margin/v1/MarginInvestingStateDto;", "getMargin_investing_state$annotations", "Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;", "getIneligibility_content", "()Lbonfire/proto/idl/margin/v1/MultiAccountIneligibilityContentModelDto;", "getIneligibility_content$annotations", "Companion", "$serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final MultiAccountEligibilityContextDto context;
        private final MultiAccountIneligibilityContentModelDto ineligibility_content;
        private final boolean is_eligible;
        private final MarginInvestingStateDto margin_investing_state;

        public Surrogate() {
            this((String) null, (MultiAccountEligibilityContextDto) null, false, (MarginInvestingStateDto) null, (MultiAccountIneligibilityContentModelDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.context == surrogate.context && this.is_eligible == surrogate.is_eligible && this.margin_investing_state == surrogate.margin_investing_state && Intrinsics.areEqual(this.ineligibility_content, surrogate.ineligibility_content);
        }

        public int hashCode() {
            int iHashCode = ((((((this.account_number.hashCode() * 31) + this.context.hashCode()) * 31) + Boolean.hashCode(this.is_eligible)) * 31) + this.margin_investing_state.hashCode()) * 31;
            MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto = this.ineligibility_content;
            return iHashCode + (multiAccountIneligibilityContentModelDto == null ? 0 : multiAccountIneligibilityContentModelDto.hashCode());
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", context=" + this.context + ", is_eligible=" + this.is_eligible + ", margin_investing_state=" + this.margin_investing_state + ", ineligibility_content=" + this.ineligibility_content + ")";
        }

        /* compiled from: GetMultiAccountEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMultiAccountEligibilityResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MultiAccountEligibilityContextDto multiAccountEligibilityContextDto, boolean z, MarginInvestingStateDto marginInvestingStateDto, MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.context = MultiAccountEligibilityContextDto.INSTANCE.getZeroValue();
            } else {
                this.context = multiAccountEligibilityContextDto;
            }
            if ((i & 4) == 0) {
                this.is_eligible = false;
            } else {
                this.is_eligible = z;
            }
            if ((i & 8) == 0) {
                this.margin_investing_state = MarginInvestingStateDto.INSTANCE.getZeroValue();
            } else {
                this.margin_investing_state = marginInvestingStateDto;
            }
            if ((i & 16) == 0) {
                this.ineligibility_content = null;
            } else {
                this.ineligibility_content = multiAccountIneligibilityContentModelDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_maintenance_table_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (self.context != MultiAccountEligibilityContextDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, MultiAccountEligibilityContextDto.Serializer.INSTANCE, self.context);
            }
            boolean z = self.is_eligible;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (self.margin_investing_state != MarginInvestingStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, MarginInvestingStateDto.Serializer.INSTANCE, self.margin_investing_state);
            }
            MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto = self.ineligibility_content;
            if (multiAccountIneligibilityContentModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MultiAccountIneligibilityContentModelDto.Serializer.INSTANCE, multiAccountIneligibilityContentModelDto);
            }
        }

        public Surrogate(String account_number, MultiAccountEligibilityContextDto context, boolean z, MarginInvestingStateDto margin_investing_state, MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(margin_investing_state, "margin_investing_state");
            this.account_number = account_number;
            this.context = context;
            this.is_eligible = z;
            this.margin_investing_state = margin_investing_state;
            this.ineligibility_content = multiAccountIneligibilityContentModelDto;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public /* synthetic */ Surrogate(String str, MultiAccountEligibilityContextDto multiAccountEligibilityContextDto, boolean z, MarginInvestingStateDto marginInvestingStateDto, MultiAccountIneligibilityContentModelDto multiAccountIneligibilityContentModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MultiAccountEligibilityContextDto.INSTANCE.getZeroValue() : multiAccountEligibilityContextDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? MarginInvestingStateDto.INSTANCE.getZeroValue() : marginInvestingStateDto, (i & 16) != 0 ? null : multiAccountIneligibilityContentModelDto);
        }

        public final MultiAccountEligibilityContextDto getContext() {
            return this.context;
        }

        /* renamed from: is_eligible, reason: from getter */
        public final boolean getIs_eligible() {
            return this.is_eligible;
        }

        public final MarginInvestingStateDto getMargin_investing_state() {
            return this.margin_investing_state;
        }

        public final MultiAccountIneligibilityContentModelDto getIneligibility_content() {
            return this.ineligibility_content;
        }
    }

    /* compiled from: GetMultiAccountEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetMultiAccountEligibilityResponseDto, GetMultiAccountEligibilityResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMultiAccountEligibilityResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMultiAccountEligibilityResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMultiAccountEligibilityResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMultiAccountEligibilityResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMultiAccountEligibilityResponse> getProtoAdapter() {
            return GetMultiAccountEligibilityResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMultiAccountEligibilityResponseDto getZeroValue() {
            return GetMultiAccountEligibilityResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMultiAccountEligibilityResponseDto fromProto(GetMultiAccountEligibilityResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            MultiAccountEligibilityContextDto multiAccountEligibilityContextDtoFromProto = MultiAccountEligibilityContextDto.INSTANCE.fromProto(proto.getContext());
            boolean zIs_eligible = proto.getIs_eligible();
            MarginInvestingStateDto marginInvestingStateDtoFromProto = MarginInvestingStateDto.INSTANCE.fromProto(proto.getMargin_investing_state());
            MultiAccountIneligibilityContentModel ineligibility_content = proto.getIneligibility_content();
            return new GetMultiAccountEligibilityResponseDto(new Surrogate(account_number, multiAccountEligibilityContextDtoFromProto, zIs_eligible, marginInvestingStateDtoFromProto, ineligibility_content != null ? MultiAccountIneligibilityContentModelDto.INSTANCE.fromProto(ineligibility_content) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMultiAccountEligibilityResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetMultiAccountEligibilityResponseDto(null, null, false, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMultiAccountEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMultiAccountEligibilityResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMultiAccountEligibilityResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMultiAccountEligibilityResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMultiAccountEligibilityResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetMultiAccountEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.margin.v1.GetMultiAccountEligibilityResponseDto";
        }
    }
}
