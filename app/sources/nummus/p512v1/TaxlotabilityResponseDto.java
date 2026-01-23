package nummus.p512v1;

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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import nummus.p512v1.TaxlotabilityResponse;
import nummus.p512v1.TaxlotabilityResponseDto;
import nummus.p512v1.TaxlotabilityStateDto;

/* compiled from: TaxlotabilityResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005)(*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/TaxlotabilityResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/TaxlotabilityResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/TaxlotabilityResponseDto$Surrogate;)V", "", "currency_pair_id", "Lnummus/v1/TaxlotabilityStateDto;", "state", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "disabled_alert", "account_id", "(Ljava/lang/String;Lnummus/v1/TaxlotabilityStateDto;Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/TaxlotabilityResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/TaxlotabilityResponseDto$Surrogate;", "getState", "()Lnummus/v1/TaxlotabilityStateDto;", "getDisabled_alert", "()Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "Companion", "Surrogate", "TaxlotabilityAlertDto", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class TaxlotabilityResponseDto implements Dto3<TaxlotabilityResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxlotabilityResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxlotabilityResponseDto, TaxlotabilityResponse>> binaryBase64Serializer$delegate;
    private static final TaxlotabilityResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxlotabilityResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxlotabilityResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TaxlotabilityStateDto getState() {
        return this.surrogate.getState();
    }

    public final TaxlotabilityAlertDto getDisabled_alert() {
        return this.surrogate.getDisabled_alert();
    }

    public /* synthetic */ TaxlotabilityResponseDto(String str, TaxlotabilityStateDto taxlotabilityStateDto, TaxlotabilityAlertDto taxlotabilityAlertDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxlotabilityStateDto.INSTANCE.getZeroValue() : taxlotabilityStateDto, (i & 4) != 0 ? null : taxlotabilityAlertDto, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxlotabilityResponseDto(String currency_pair_id, TaxlotabilityStateDto state, TaxlotabilityAlertDto taxlotabilityAlertDto, String str) {
        this(new Surrogate(currency_pair_id, state, taxlotabilityAlertDto, str));
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxlotabilityResponse toProto() {
        String currency_pair_id = this.surrogate.getCurrency_pair_id();
        TaxlotabilityState taxlotabilityState = (TaxlotabilityState) this.surrogate.getState().toProto();
        TaxlotabilityAlertDto disabled_alert = this.surrogate.getDisabled_alert();
        return new TaxlotabilityResponse(currency_pair_id, taxlotabilityState, disabled_alert != null ? disabled_alert.toProto() : null, this.surrogate.getAccount_id(), null, 16, null);
    }

    public String toString() {
        return "[TaxlotabilityResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxlotabilityResponseDto) && Intrinsics.areEqual(((TaxlotabilityResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxlotabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010!\u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$Surrogate;", "", "", "currency_pair_id", "Lnummus/v1/TaxlotabilityStateDto;", "state", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "disabled_alert", "account_id", "<init>", "(Ljava/lang/String;Lnummus/v1/TaxlotabilityStateDto;Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lnummus/v1/TaxlotabilityStateDto;Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/TaxlotabilityResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "()V", "Lnummus/v1/TaxlotabilityStateDto;", "getState", "()Lnummus/v1/TaxlotabilityStateDto;", "getState$annotations", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "getDisabled_alert", "()Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "getDisabled_alert$annotations", "getAccount_id", "getAccount_id$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String currency_pair_id;
        private final TaxlotabilityAlertDto disabled_alert;
        private final TaxlotabilityStateDto state;

        public Surrogate() {
            this((String) null, (TaxlotabilityStateDto) null, (TaxlotabilityAlertDto) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id) && this.state == surrogate.state && Intrinsics.areEqual(this.disabled_alert, surrogate.disabled_alert) && Intrinsics.areEqual(this.account_id, surrogate.account_id);
        }

        public int hashCode() {
            int iHashCode = ((this.currency_pair_id.hashCode() * 31) + this.state.hashCode()) * 31;
            TaxlotabilityAlertDto taxlotabilityAlertDto = this.disabled_alert;
            int iHashCode2 = (iHashCode + (taxlotabilityAlertDto == null ? 0 : taxlotabilityAlertDto.hashCode())) * 31;
            String str = this.account_id;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(currency_pair_id=" + this.currency_pair_id + ", state=" + this.state + ", disabled_alert=" + this.disabled_alert + ", account_id=" + this.account_id + ")";
        }

        /* compiled from: TaxlotabilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxlotabilityResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxlotabilityResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TaxlotabilityStateDto taxlotabilityStateDto, TaxlotabilityAlertDto taxlotabilityAlertDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.currency_pair_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.state = TaxlotabilityStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = taxlotabilityStateDto;
            }
            if ((i & 4) == 0) {
                this.disabled_alert = null;
            } else {
                this.disabled_alert = taxlotabilityAlertDto;
            }
            if ((i & 8) == 0) {
                this.account_id = null;
            } else {
                this.account_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.currency_pair_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.currency_pair_id);
            }
            if (self.state != TaxlotabilityStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TaxlotabilityStateDto.Serializer.INSTANCE, self.state);
            }
            TaxlotabilityAlertDto taxlotabilityAlertDto = self.disabled_alert;
            if (taxlotabilityAlertDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TaxlotabilityAlertDto.Serializer.INSTANCE, taxlotabilityAlertDto);
            }
            String str = self.account_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String currency_pair_id, TaxlotabilityStateDto state, TaxlotabilityAlertDto taxlotabilityAlertDto, String str) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.currency_pair_id = currency_pair_id;
            this.state = state;
            this.disabled_alert = taxlotabilityAlertDto;
            this.account_id = str;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public /* synthetic */ Surrogate(String str, TaxlotabilityStateDto taxlotabilityStateDto, TaxlotabilityAlertDto taxlotabilityAlertDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxlotabilityStateDto.INSTANCE.getZeroValue() : taxlotabilityStateDto, (i & 4) != 0 ? null : taxlotabilityAlertDto, (i & 8) != 0 ? null : str2);
        }

        public final TaxlotabilityStateDto getState() {
            return this.state;
        }

        public final TaxlotabilityAlertDto getDisabled_alert() {
            return this.disabled_alert;
        }

        public final String getAccount_id() {
            return this.account_id;
        }
    }

    /* compiled from: TaxlotabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/TaxlotabilityResponseDto;", "Lnummus/v1/TaxlotabilityResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/TaxlotabilityResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxlotabilityResponseDto, TaxlotabilityResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxlotabilityResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxlotabilityResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxlotabilityResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxlotabilityResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxlotabilityResponse> getProtoAdapter() {
            return TaxlotabilityResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxlotabilityResponseDto getZeroValue() {
            return TaxlotabilityResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxlotabilityResponseDto fromProto(TaxlotabilityResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String currency_pair_id = proto.getCurrency_pair_id();
            TaxlotabilityStateDto taxlotabilityStateDtoFromProto = TaxlotabilityStateDto.INSTANCE.fromProto(proto.getState());
            TaxlotabilityResponse.TaxlotabilityAlert disabled_alert = proto.getDisabled_alert();
            return new TaxlotabilityResponseDto(new Surrogate(currency_pair_id, taxlotabilityStateDtoFromProto, disabled_alert != null ? TaxlotabilityAlertDto.INSTANCE.fromProto(disabled_alert) : null, proto.getAccount_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.TaxlotabilityResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxlotabilityResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxlotabilityResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxlotabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;", "Landroid/os/Parcelable;", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;)V", "", "title", "message", "dismiss_cta_text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;", "getTitle", "getMessage", "getDismiss_cta_text", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TaxlotabilityAlertDto implements Dto3<TaxlotabilityResponse.TaxlotabilityAlert>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxlotabilityAlertDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxlotabilityAlertDto, TaxlotabilityResponse.TaxlotabilityAlert>> binaryBase64Serializer$delegate;
        private static final TaxlotabilityAlertDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxlotabilityAlertDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxlotabilityAlertDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final String getMessage() {
            return this.surrogate.getMessage();
        }

        public final String getDismiss_cta_text() {
            return this.surrogate.getDismiss_cta_text();
        }

        public /* synthetic */ TaxlotabilityAlertDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaxlotabilityAlertDto(String title, String message, String dismiss_cta_text) {
            this(new Surrogate(title, message, dismiss_cta_text));
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(dismiss_cta_text, "dismiss_cta_text");
        }

        @Override // com.robinhood.idl.Dto
        public TaxlotabilityResponse.TaxlotabilityAlert toProto() {
            return new TaxlotabilityResponse.TaxlotabilityAlert(this.surrogate.getTitle(), this.surrogate.getMessage(), this.surrogate.getDismiss_cta_text(), null, 8, null);
        }

        public String toString() {
            return "[TaxlotabilityAlertDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxlotabilityAlertDto) && Intrinsics.areEqual(((TaxlotabilityAlertDto) other).surrogate, this.surrogate);
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
        /* compiled from: TaxlotabilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;", "", "", "title", "message", "dismiss_cta_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getMessage", "getMessage$annotations", "getDismiss_cta_text", "getDismiss_cta_text$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String dismiss_cta_text;
            private final String message;
            private final String title;

            public Surrogate() {
                this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.message, surrogate.message) && Intrinsics.areEqual(this.dismiss_cta_text, surrogate.dismiss_cta_text);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.dismiss_cta_text.hashCode();
            }

            public String toString() {
                return "Surrogate(title=" + this.title + ", message=" + this.message + ", dismiss_cta_text=" + this.dismiss_cta_text + ")";
            }

            /* compiled from: TaxlotabilityResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return TaxlotabilityResponseDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.title = "";
                } else {
                    this.title = str;
                }
                if ((i & 2) == 0) {
                    this.message = "";
                } else {
                    this.message = str2;
                }
                if ((i & 4) == 0) {
                    this.dismiss_cta_text = "";
                } else {
                    this.dismiss_cta_text = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 0, self.title);
                }
                if (!Intrinsics.areEqual(self.message, "")) {
                    output.encodeStringElement(serialDesc, 1, self.message);
                }
                if (Intrinsics.areEqual(self.dismiss_cta_text, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 2, self.dismiss_cta_text);
            }

            public Surrogate(String title, String message, String dismiss_cta_text) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(dismiss_cta_text, "dismiss_cta_text");
                this.title = title;
                this.message = message;
                this.dismiss_cta_text = dismiss_cta_text;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getMessage() {
                return this.message;
            }

            public final String getDismiss_cta_text() {
                return this.dismiss_cta_text;
            }
        }

        /* compiled from: TaxlotabilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<TaxlotabilityAlertDto, TaxlotabilityResponse.TaxlotabilityAlert> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxlotabilityAlertDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxlotabilityAlertDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxlotabilityAlertDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxlotabilityAlertDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TaxlotabilityResponse.TaxlotabilityAlert> getProtoAdapter() {
                return TaxlotabilityResponse.TaxlotabilityAlert.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxlotabilityAlertDto getZeroValue() {
                return TaxlotabilityAlertDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxlotabilityAlertDto fromProto(TaxlotabilityResponse.TaxlotabilityAlert proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new TaxlotabilityAlertDto(new Surrogate(proto.getTitle(), proto.getMessage(), proto.getDismiss_cta_text()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.TaxlotabilityResponseDto$TaxlotabilityAlertDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaxlotabilityResponseDto.TaxlotabilityAlertDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TaxlotabilityAlertDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TaxlotabilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxlotabilityAlertDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.TaxlotabilityResponse.TaxlotabilityAlert", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxlotabilityAlertDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxlotabilityAlertDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxlotabilityAlertDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: TaxlotabilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$TaxlotabilityAlertDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4188_4)
            public final String provideIntoMap() {
                return "nummus.v1.TaxlotabilityResponseDto$TaxlotabilityAlertDto";
            }
        }
    }

    /* compiled from: TaxlotabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxlotabilityResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/TaxlotabilityResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxlotabilityResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.TaxlotabilityResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxlotabilityResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxlotabilityResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxlotabilityResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxlotabilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "nummus.v1.TaxlotabilityResponseDto";
        }
    }
}
