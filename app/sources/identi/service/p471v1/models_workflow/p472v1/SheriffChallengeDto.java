package identi.service.p471v1.models_workflow.p472v1;

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
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.SheriffChallenge;
import identi.service.p471v1.models_workflow.p472v1.SheriffChallengeDto;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p479j$.time.Instant;

/* compiled from: SheriffChallengeDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006213456B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u0019\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00067"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;)V", "", "id", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "type", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "status", "", "remaining_retries", ErrorResponse.REMAINING_ATTEMPTS, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "expires_at", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;IILj$/time/Instant;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;", "getId", "getType", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "getStatus", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "getRemaining_retries", "getRemaining_attempts", "getExpires_at", "()Lj$/time/Instant;", "Companion", "Surrogate", "TypeDto", "StatusDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class SheriffChallengeDto implements Dto3<SheriffChallenge>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SheriffChallengeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SheriffChallengeDto, SheriffChallenge>> binaryBase64Serializer$delegate;
    private static final SheriffChallengeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SheriffChallengeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SheriffChallengeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final TypeDto getType() {
        return this.surrogate.getType();
    }

    public final StatusDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final int getRemaining_retries() {
        return this.surrogate.getRemaining_retries();
    }

    public final int getRemaining_attempts() {
        return this.surrogate.getRemaining_attempts();
    }

    public final Instant getExpires_at() {
        return this.surrogate.getExpires_at();
    }

    public /* synthetic */ SheriffChallengeDto(String str, TypeDto typeDto, StatusDto statusDto, int i, int i2, Instant instant, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i3 & 4) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : instant);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SheriffChallengeDto(String id, TypeDto type2, StatusDto status, int i, int i2, Instant instant) {
        this(new Surrogate(id, type2, status, i, i2, instant));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SheriffChallenge toProto() {
        return new SheriffChallenge(this.surrogate.getId(), (SheriffChallenge.Type) this.surrogate.getType().toProto(), (SheriffChallenge.Status) this.surrogate.getStatus().toProto(), this.surrogate.getRemaining_retries(), this.surrogate.getRemaining_attempts(), this.surrogate.getExpires_at(), null, 64, null);
    }

    public String toString() {
        return "[SheriffChallengeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SheriffChallengeDto) && Intrinsics.areEqual(((SheriffChallengeDto) other).surrogate, this.surrogate);
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
    /* compiled from: SheriffChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 >2\u00020\u0001:\u0002?>B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b\u0012.\b\u0002\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0012\u0010\u0013BS\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010,\u001a\u0004\b2\u00103R/\u0010\f\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b7\u0010,\u001a\u0004\b6\u0010$R/\u0010\r\u001a\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b9\u0010,\u001a\u0004\b8\u0010$RF\u0010\u0011\u001a(\u0018\u00010\u000ej\u0013\u0018\u0001`\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010:\u0012\u0004\b=\u0010,\u001a\u0004\b;\u0010<¨\u0006@"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;", "", "", "id", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "type", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "status", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "remaining_retries", ErrorResponse.REMAINING_ATTEMPTS, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "expires_at", "<init>", "(Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;IILj$/time/Instant;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;IILj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "getType", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "getType$annotations", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "getStatus", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "getStatus$annotations", "I", "getRemaining_retries", "getRemaining_retries$annotations", "getRemaining_attempts", "getRemaining_attempts$annotations", "Lj$/time/Instant;", "getExpires_at", "()Lj$/time/Instant;", "getExpires_at$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Instant expires_at;
        private final String id;
        private final int remaining_attempts;
        private final int remaining_retries;
        private final StatusDto status;
        private final TypeDto type;

        public Surrogate() {
            this((String) null, (TypeDto) null, (StatusDto) null, 0, 0, (Instant) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.type == surrogate.type && this.status == surrogate.status && this.remaining_retries == surrogate.remaining_retries && this.remaining_attempts == surrogate.remaining_attempts && Intrinsics.areEqual(this.expires_at, surrogate.expires_at);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.remaining_retries)) * 31) + Integer.hashCode(this.remaining_attempts)) * 31;
            Instant instant = this.expires_at;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", type=" + this.type + ", status=" + this.status + ", remaining_retries=" + this.remaining_retries + ", remaining_attempts=" + this.remaining_attempts + ", expires_at=" + this.expires_at + ")";
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SheriffChallengeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TypeDto typeDto, StatusDto statusDto, int i2, int i3, Instant instant, SerializationConstructorMarker serializationConstructorMarker) {
            this.id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.type = TypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = typeDto;
            }
            if ((i & 4) == 0) {
                this.status = StatusDto.INSTANCE.getZeroValue();
            } else {
                this.status = statusDto;
            }
            if ((i & 8) == 0) {
                this.remaining_retries = 0;
            } else {
                this.remaining_retries = i2;
            }
            if ((i & 16) == 0) {
                this.remaining_attempts = 0;
            } else {
                this.remaining_attempts = i3;
            }
            if ((i & 32) == 0) {
                this.expires_at = null;
            } else {
                this.expires_at = instant;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TypeDto.Serializer.INSTANCE, self.type);
            }
            if (self.status != StatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, StatusDto.Serializer.INSTANCE, self.status);
            }
            int i = self.remaining_retries;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.remaining_attempts;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            Instant instant = self.expires_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, WireInstantSerializer.INSTANCE, instant);
            }
        }

        public Surrogate(String id, TypeDto type2, StatusDto status, int i, int i2, Instant instant) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            this.id = id;
            this.type = type2;
            this.status = status;
            this.remaining_retries = i;
            this.remaining_attempts = i2;
            this.expires_at = instant;
        }

        public final String getId() {
            return this.id;
        }

        public /* synthetic */ Surrogate(String str, TypeDto typeDto, StatusDto statusDto, int i, int i2, Instant instant, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i3 & 4) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : instant);
        }

        public final TypeDto getType() {
            return this.type;
        }

        public final StatusDto getStatus() {
            return this.status;
        }

        public final int getRemaining_retries() {
            return this.remaining_retries;
        }

        public final int getRemaining_attempts() {
            return this.remaining_attempts;
        }

        public final Instant getExpires_at() {
            return this.expires_at;
        }
    }

    /* compiled from: SheriffChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<SheriffChallengeDto, SheriffChallenge> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SheriffChallengeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SheriffChallengeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SheriffChallengeDto> getBinaryBase64Serializer() {
            return (KSerializer) SheriffChallengeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SheriffChallenge> getProtoAdapter() {
            return SheriffChallenge.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SheriffChallengeDto getZeroValue() {
            return SheriffChallengeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SheriffChallengeDto fromProto(SheriffChallenge proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new SheriffChallengeDto(new Surrogate(proto.getId(), TypeDto.INSTANCE.fromProto(proto.getType()), StatusDto.INSTANCE.fromProto(proto.getStatus()), proto.getRemaining_retries(), proto.getRemaining_attempts(), proto.getExpires_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.SheriffChallengeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SheriffChallengeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SheriffChallengeDto(null, null, null, 0, 0, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SheriffChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "EMAIL", "SMS", "APP", "PROMPT", "WEBAUTHN", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TypeDto implements Dto2<SheriffChallenge.Type>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<TypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TypeDto, SheriffChallenge.Type>> binaryBase64Serializer$delegate;
        public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final TypeDto EMAIL = new EMAIL("EMAIL", 1);
        public static final TypeDto SMS = new SMS("SMS", 2);
        public static final TypeDto APP = new APP("APP", 3);
        public static final TypeDto PROMPT = new PROMPT("PROMPT", 4);
        public static final TypeDto WEBAUTHN = new WEBAUTHN("WEBAUTHN", 5);

        private static final /* synthetic */ TypeDto[] $values() {
            return new TypeDto[]{TYPE_UNSPECIFIED, EMAIL, SMS, APP, PROMPT, WEBAUTHN};
        }

        public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<TypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.TypeDto.TYPE_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends TypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Type toProto() {
                return SheriffChallenge.Type.TYPE_UNSPECIFIED;
            }
        }

        private TypeDto(String str, int i) {
        }

        static {
            TypeDto[] typeDtoArr$values = $values();
            $VALUES = typeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.SheriffChallengeDto$TypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SheriffChallengeDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.TypeDto.EMAIL", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL extends TypeDto {
            EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Type toProto() {
                return SheriffChallenge.Type.EMAIL;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.TypeDto.SMS", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SMS extends TypeDto {
            SMS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Type toProto() {
                return SheriffChallenge.Type.SMS;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.TypeDto.APP", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APP extends TypeDto {
            APP(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Type toProto() {
                return SheriffChallenge.Type.APP;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.TypeDto.PROMPT", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROMPT extends TypeDto {
            PROMPT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Type toProto() {
                return SheriffChallenge.Type.PROMPT;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.TypeDto.WEBAUTHN", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class WEBAUTHN extends TypeDto {
            WEBAUTHN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Type toProto() {
                return SheriffChallenge.Type.WEBAUTHN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<TypeDto, SheriffChallenge.Type> {

            /* compiled from: SheriffChallengeDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheriffChallenge.Type.values().length];
                    try {
                        iArr[SheriffChallenge.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheriffChallenge.Type.EMAIL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheriffChallenge.Type.SMS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SheriffChallenge.Type.APP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SheriffChallenge.Type.PROMPT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SheriffChallenge.Type.WEBAUTHN.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TypeDto> getBinaryBase64Serializer() {
                return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SheriffChallenge.Type> getProtoAdapter() {
                return SheriffChallenge.Type.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto getZeroValue() {
                return TypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(SheriffChallenge.Type proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return TypeDto.TYPE_UNSPECIFIED;
                    case 2:
                        return TypeDto.EMAIL;
                    case 3:
                        return TypeDto.SMS;
                    case 4:
                        return TypeDto.APP;
                    case 5:
                        return TypeDto.PROMPT;
                    case 6:
                        return TypeDto.WEBAUTHN;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<TypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<TypeDto, SheriffChallenge.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.SheriffChallenge.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public TypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (TypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SheriffChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_UNSPECIFIED", "ISSUED", "VALIDATED", "REDEEMED", "EXPIRED", "FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StatusDto implements Dto2<SheriffChallenge.Status>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StatusDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StatusDto, SheriffChallenge.Status>> binaryBase64Serializer$delegate;
        public static final StatusDto STATUS_UNSPECIFIED = new STATUS_UNSPECIFIED("STATUS_UNSPECIFIED", 0);
        public static final StatusDto ISSUED = new ISSUED("ISSUED", 1);
        public static final StatusDto VALIDATED = new VALIDATED("VALIDATED", 2);
        public static final StatusDto REDEEMED = new REDEEMED("REDEEMED", 3);
        public static final StatusDto EXPIRED = new EXPIRED("EXPIRED", 4);
        public static final StatusDto FAILED = new FAILED("FAILED", 5);

        private static final /* synthetic */ StatusDto[] $values() {
            return new StatusDto[]{STATUS_UNSPECIFIED, ISSUED, VALIDATED, REDEEMED, EXPIRED, FAILED};
        }

        public /* synthetic */ StatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StatusDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.StatusDto.STATUS_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATUS_UNSPECIFIED extends StatusDto {
            STATUS_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Status toProto() {
                return SheriffChallenge.Status.STATUS_UNSPECIFIED;
            }
        }

        private StatusDto(String str, int i) {
        }

        static {
            StatusDto[] statusDtoArr$values = $values();
            $VALUES = statusDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.SheriffChallengeDto$StatusDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SheriffChallengeDto.StatusDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.StatusDto.ISSUED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ISSUED extends StatusDto {
            ISSUED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Status toProto() {
                return SheriffChallenge.Status.ISSUED;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.StatusDto.VALIDATED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VALIDATED extends StatusDto {
            VALIDATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Status toProto() {
                return SheriffChallenge.Status.VALIDATED;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.StatusDto.REDEEMED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REDEEMED extends StatusDto {
            REDEEMED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Status toProto() {
                return SheriffChallenge.Status.REDEEMED;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.StatusDto.EXPIRED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXPIRED extends StatusDto {
            EXPIRED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Status toProto() {
                return SheriffChallenge.Status.EXPIRED;
            }
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SheriffChallengeDto.StatusDto.FAILED", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends StatusDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public SheriffChallenge.Status toProto() {
                return SheriffChallenge.Status.FAILED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "Lidenti/service/v1/models_workflow/v1/SheriffChallenge$Status;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StatusDto, SheriffChallenge.Status> {

            /* compiled from: SheriffChallengeDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheriffChallenge.Status.values().length];
                    try {
                        iArr[SheriffChallenge.Status.STATUS_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheriffChallenge.Status.ISSUED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheriffChallenge.Status.VALIDATED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SheriffChallenge.Status.REDEEMED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[SheriffChallenge.Status.EXPIRED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[SheriffChallenge.Status.FAILED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<StatusDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StatusDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<StatusDto> getBinaryBase64Serializer() {
                return (KSerializer) StatusDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<SheriffChallenge.Status> getProtoAdapter() {
                return SheriffChallenge.Status.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto getZeroValue() {
                return StatusDto.STATUS_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StatusDto fromProto(SheriffChallenge.Status proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return StatusDto.STATUS_UNSPECIFIED;
                    case 2:
                        return StatusDto.ISSUED;
                    case 3:
                        return StatusDto.VALIDATED;
                    case 4:
                        return StatusDto.REDEEMED;
                    case 5:
                        return StatusDto.EXPIRED;
                    case 6:
                        return StatusDto.FAILED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: SheriffChallengeDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$StatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<StatusDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StatusDto, SheriffChallenge.Status> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.SheriffChallenge.Status", StatusDto.getEntries(), StatusDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StatusDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StatusDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StatusDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }
    }

    /* compiled from: SheriffChallengeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<SheriffChallengeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.SheriffChallenge", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SheriffChallengeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SheriffChallengeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SheriffChallengeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SheriffChallengeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SheriffChallengeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.SheriffChallengeDto";
        }
    }
}
