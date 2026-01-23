package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import nummus.p512v1.CorpActionPaymentStateDto;
import nummus.p512v1.CorpActionSplitDto;
import p479j$.time.Instant;

/* compiled from: CorpActionSplitPaymentDto.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0019\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0019\u0010\u0016\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138F¢\u0006\u0006\u001a\u0004\b3\u00102¨\u00068"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CorpActionSplitPayment;", "Landroid/os/Parcelable;", "Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;)V", "", "id", "account_id", "Lcom/robinhood/idl/IdlDecimal;", "new_shares", "old_shares", "Lnummus/v1/CorpActionSplitDto;", "split", "Lnummus/v1/CorpActionPaymentStateDto;", "corp_action_payment_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "paid_at", "updated_at", "created_at", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lnummus/v1/CorpActionSplitDto;Lnummus/v1/CorpActionPaymentStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "toProto", "()Lnummus/v1/CorpActionSplitPayment;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;", "getId", "getSplit", "()Lnummus/v1/CorpActionSplitDto;", "getCorp_action_payment_state", "()Lnummus/v1/CorpActionPaymentStateDto;", "getUpdated_at", "()Lj$/time/Instant;", "getCreated_at", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CorpActionSplitPaymentDto implements Dto3<CorpActionSplitPayment>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CorpActionSplitPaymentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CorpActionSplitPaymentDto, CorpActionSplitPayment>> binaryBase64Serializer$delegate;
    private static final CorpActionSplitPaymentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CorpActionSplitPaymentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CorpActionSplitPaymentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final CorpActionSplitDto getSplit() {
        return this.surrogate.getSplit();
    }

    public final CorpActionPaymentStateDto getCorp_action_payment_state() {
        return this.surrogate.getCorp_action_payment_state();
    }

    public final Instant getUpdated_at() {
        return this.surrogate.getUpdated_at();
    }

    public final Instant getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public /* synthetic */ CorpActionSplitPaymentDto(String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, CorpActionSplitDto corpActionSplitDto, CorpActionPaymentStateDto corpActionPaymentStateDto, Instant instant, Instant instant2, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? null : corpActionSplitDto, (i & 32) != 0 ? CorpActionPaymentStateDto.INSTANCE.getZeroValue() : corpActionPaymentStateDto, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CorpActionSplitPaymentDto(String id, String account_id, IdlDecimal new_shares, IdlDecimal old_shares, CorpActionSplitDto corpActionSplitDto, CorpActionPaymentStateDto corp_action_payment_state, Instant instant, Instant instant2, Instant instant3) {
        this(new Surrogate(id, account_id, new_shares, old_shares, corpActionSplitDto, corp_action_payment_state, instant, instant2, instant3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(new_shares, "new_shares");
        Intrinsics.checkNotNullParameter(old_shares, "old_shares");
        Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CorpActionSplitPayment toProto() {
        String id = this.surrogate.getId();
        String account_id = this.surrogate.getAccount_id();
        String stringValue = this.surrogate.getNew_shares().getStringValue();
        String stringValue2 = this.surrogate.getOld_shares().getStringValue();
        CorpActionSplitDto split = this.surrogate.getSplit();
        return new CorpActionSplitPayment(id, account_id, stringValue, stringValue2, split != null ? split.toProto() : null, (CorpActionPaymentState) this.surrogate.getCorp_action_payment_state().toProto(), this.surrogate.getPaid_at(), this.surrogate.getUpdated_at(), this.surrogate.getCreated_at(), null, 512, null);
    }

    public String toString() {
        return "[CorpActionSplitPaymentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CorpActionSplitPaymentDto) && Intrinsics.areEqual(((CorpActionSplitPaymentDto) other).surrogate, this.surrogate);
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
    /* compiled from: CorpActionSplitPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002JIBó\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012.\b\u0002\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011\u0012.\b\u0002\u0010\u0014\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\u0004\b\u0015\u0010\u0016Bu\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ'\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010&R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010&R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00103\u0012\u0004\b6\u00100\u001a\u0004\b4\u00105R/\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b8\u00100\u001a\u0004\b7\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00109\u0012\u0004\b<\u00100\u001a\u0004\b:\u0010;R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u00100\u001a\u0004\b>\u0010?RF\u0010\u0012\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010A\u0012\u0004\bD\u00100\u001a\u0004\bB\u0010CRF\u0010\u0013\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010A\u0012\u0004\bF\u00100\u001a\u0004\bE\u0010CRF\u0010\u0014\u001a(\u0018\u00010\u000fj\u0013\u0018\u0001`\u0010¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0011¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010A\u0012\u0004\bH\u00100\u001a\u0004\bG\u0010C¨\u0006K"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;", "", "", "id", "account_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "new_shares", "old_shares", "Lnummus/v1/CorpActionSplitDto;", "split", "Lnummus/v1/CorpActionPaymentStateDto;", "corp_action_payment_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "paid_at", "updated_at", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lnummus/v1/CorpActionSplitDto;Lnummus/v1/CorpActionPaymentStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lnummus/v1/CorpActionSplitDto;Lnummus/v1/CorpActionPaymentStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_id", "getAccount_id$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getNew_shares", "()Lcom/robinhood/idl/IdlDecimal;", "getNew_shares$annotations", "getOld_shares", "getOld_shares$annotations", "Lnummus/v1/CorpActionSplitDto;", "getSplit", "()Lnummus/v1/CorpActionSplitDto;", "getSplit$annotations", "Lnummus/v1/CorpActionPaymentStateDto;", "getCorp_action_payment_state", "()Lnummus/v1/CorpActionPaymentStateDto;", "getCorp_action_payment_state$annotations", "Lj$/time/Instant;", "getPaid_at", "()Lj$/time/Instant;", "getPaid_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getCreated_at", "getCreated_at$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final CorpActionPaymentStateDto corp_action_payment_state;
        private final Instant created_at;
        private final String id;
        private final IdlDecimal new_shares;
        private final IdlDecimal old_shares;
        private final Instant paid_at;
        private final CorpActionSplitDto split;
        private final Instant updated_at;

        public Surrogate() {
            this((String) null, (String) null, (IdlDecimal) null, (IdlDecimal) null, (CorpActionSplitDto) null, (CorpActionPaymentStateDto) null, (Instant) null, (Instant) null, (Instant) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.new_shares, surrogate.new_shares) && Intrinsics.areEqual(this.old_shares, surrogate.old_shares) && Intrinsics.areEqual(this.split, surrogate.split) && this.corp_action_payment_state == surrogate.corp_action_payment_state && Intrinsics.areEqual(this.paid_at, surrogate.paid_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.created_at, surrogate.created_at);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.new_shares.hashCode()) * 31) + this.old_shares.hashCode()) * 31;
            CorpActionSplitDto corpActionSplitDto = this.split;
            int iHashCode2 = (((iHashCode + (corpActionSplitDto == null ? 0 : corpActionSplitDto.hashCode())) * 31) + this.corp_action_payment_state.hashCode()) * 31;
            Instant instant = this.paid_at;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode4 = (iHashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.created_at;
            return iHashCode4 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", new_shares=" + this.new_shares + ", old_shares=" + this.old_shares + ", split=" + this.split + ", corp_action_payment_state=" + this.corp_action_payment_state + ", paid_at=" + this.paid_at + ", updated_at=" + this.updated_at + ", created_at=" + this.created_at + ")";
        }

        /* compiled from: CorpActionSplitPaymentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CorpActionSplitPaymentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, CorpActionSplitDto corpActionSplitDto, CorpActionPaymentStateDto corpActionPaymentStateDto, Instant instant, Instant instant2, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 4) == 0) {
                this.new_shares = new IdlDecimal("");
            } else {
                this.new_shares = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.old_shares = new IdlDecimal("");
            } else {
                this.old_shares = idlDecimal2;
            }
            if ((i & 16) == 0) {
                this.split = null;
            } else {
                this.split = corpActionSplitDto;
            }
            if ((i & 32) == 0) {
                this.corp_action_payment_state = CorpActionPaymentStateDto.INSTANCE.getZeroValue();
            } else {
                this.corp_action_payment_state = corpActionPaymentStateDto;
            }
            if ((i & 64) == 0) {
                this.paid_at = null;
            } else {
                this.paid_at = instant;
            }
            if ((i & 128) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 256) == 0) {
                this.created_at = null;
            } else {
                this.created_at = instant3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_id);
            }
            if (!Intrinsics.areEqual(self.new_shares, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.new_shares);
            }
            if (!Intrinsics.areEqual(self.old_shares, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 3, IdlDecimalSerializer.INSTANCE, self.old_shares);
            }
            CorpActionSplitDto corpActionSplitDto = self.split;
            if (corpActionSplitDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, CorpActionSplitDto.Serializer.INSTANCE, corpActionSplitDto);
            }
            if (self.corp_action_payment_state != CorpActionPaymentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, CorpActionPaymentStateDto.Serializer.INSTANCE, self.corp_action_payment_state);
            }
            Instant instant = self.paid_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.created_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(String id, String account_id, IdlDecimal new_shares, IdlDecimal old_shares, CorpActionSplitDto corpActionSplitDto, CorpActionPaymentStateDto corp_action_payment_state, Instant instant, Instant instant2, Instant instant3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(new_shares, "new_shares");
            Intrinsics.checkNotNullParameter(old_shares, "old_shares");
            Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
            this.id = id;
            this.account_id = account_id;
            this.new_shares = new_shares;
            this.old_shares = old_shares;
            this.split = corpActionSplitDto;
            this.corp_action_payment_state = corp_action_payment_state;
            this.paid_at = instant;
            this.updated_at = instant2;
            this.created_at = instant3;
        }

        public /* synthetic */ Surrogate(String str, String str2, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, CorpActionSplitDto corpActionSplitDto, CorpActionPaymentStateDto corpActionPaymentStateDto, Instant instant, Instant instant2, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 16) != 0 ? null : corpActionSplitDto, (i & 32) != 0 ? CorpActionPaymentStateDto.INSTANCE.getZeroValue() : corpActionPaymentStateDto, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? null : instant2, (i & 256) != 0 ? null : instant3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final IdlDecimal getNew_shares() {
            return this.new_shares;
        }

        public final IdlDecimal getOld_shares() {
            return this.old_shares;
        }

        public final CorpActionSplitDto getSplit() {
            return this.split;
        }

        public final CorpActionPaymentStateDto getCorp_action_payment_state() {
            return this.corp_action_payment_state;
        }

        public final Instant getPaid_at() {
            return this.paid_at;
        }

        public final Instant getUpdated_at() {
            return this.updated_at;
        }

        public final Instant getCreated_at() {
            return this.created_at;
        }
    }

    /* compiled from: CorpActionSplitPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CorpActionSplitPaymentDto;", "Lnummus/v1/CorpActionSplitPayment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CorpActionSplitPaymentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CorpActionSplitPaymentDto, CorpActionSplitPayment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CorpActionSplitPaymentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionSplitPaymentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionSplitPaymentDto> getBinaryBase64Serializer() {
            return (KSerializer) CorpActionSplitPaymentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CorpActionSplitPayment> getProtoAdapter() {
            return CorpActionSplitPayment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionSplitPaymentDto getZeroValue() {
            return CorpActionSplitPaymentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionSplitPaymentDto fromProto(CorpActionSplitPayment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_id = proto.getAccount_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getNew_shares());
            IdlDecimal idlDecimal2 = new IdlDecimal(proto.getOld_shares());
            CorpActionSplit split = proto.getSplit();
            return new CorpActionSplitPaymentDto(new Surrogate(id, account_id, idlDecimal, idlDecimal2, split != null ? CorpActionSplitDto.INSTANCE.fromProto(split) : null, CorpActionPaymentStateDto.INSTANCE.fromProto(proto.getCorp_action_payment_state()), proto.getPaid_at(), proto.getUpdated_at(), proto.getCreated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CorpActionSplitPaymentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CorpActionSplitPaymentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CorpActionSplitPaymentDto(null, null, null, null, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CorpActionSplitPaymentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionSplitPaymentDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CorpActionSplitPaymentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CorpActionSplitPaymentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CorpActionSplitPayment", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CorpActionSplitPaymentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CorpActionSplitPaymentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CorpActionSplitPaymentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CorpActionSplitPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CorpActionSplitPaymentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "nummus.v1.CorpActionSplitPaymentDto";
        }
    }
}
