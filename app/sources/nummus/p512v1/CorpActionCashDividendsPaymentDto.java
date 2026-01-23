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
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
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
import nummus.p512v1.CorpActionCashDividendsDto;
import nummus.p512v1.CorpActionPaymentStateDto;
import p479j$.time.Instant;

/* compiled from: CorpActionCashDividendsPaymentDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004:9;<B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0097\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0006\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0019\u0010\u0018\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168F¢\u0006\u0006\u001a\u0004\b8\u00107¨\u0006="}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPaymentDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/CorpActionCashDividendsPayment;", "Landroid/os/Parcelable;", "Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;)V", "", "id", "account_id", "Lcom/robinhood/idl/IdlDecimal;", "position", "Lcom/robinhood/rosetta/common/MoneyDto;", "gross_amount", "withholding_amount", "net_amount", "Lnummus/v1/CorpActionCashDividendsDto;", "dividends", "Lnummus/v1/CorpActionPaymentStateDto;", "corp_action_payment_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "paid_at", "updated_at", "created_at", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lnummus/v1/CorpActionCashDividendsDto;Lnummus/v1/CorpActionPaymentStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "toProto", "()Lnummus/v1/CorpActionCashDividendsPayment;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;", "getId", "getNet_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getDividends", "()Lnummus/v1/CorpActionCashDividendsDto;", "getCorp_action_payment_state", "()Lnummus/v1/CorpActionPaymentStateDto;", "getUpdated_at", "()Lj$/time/Instant;", "getCreated_at", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class CorpActionCashDividendsPaymentDto implements Dto3<CorpActionCashDividendsPayment>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CorpActionCashDividendsPaymentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CorpActionCashDividendsPaymentDto, CorpActionCashDividendsPayment>> binaryBase64Serializer$delegate;
    private static final CorpActionCashDividendsPaymentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CorpActionCashDividendsPaymentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CorpActionCashDividendsPaymentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final MoneyDto getNet_amount() {
        return this.surrogate.getNet_amount();
    }

    public final CorpActionCashDividendsDto getDividends() {
        return this.surrogate.getDividends();
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

    public /* synthetic */ CorpActionCashDividendsPaymentDto(String str, String str2, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, CorpActionCashDividendsDto corpActionCashDividendsDto, CorpActionPaymentStateDto corpActionPaymentStateDto, Instant instant, Instant instant2, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) != 0 ? null : moneyDto3, (i & 64) != 0 ? null : corpActionCashDividendsDto, (i & 128) != 0 ? CorpActionPaymentStateDto.INSTANCE.getZeroValue() : corpActionPaymentStateDto, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CorpActionCashDividendsPaymentDto(String id, String account_id, IdlDecimal position, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, CorpActionCashDividendsDto corpActionCashDividendsDto, CorpActionPaymentStateDto corp_action_payment_state, Instant instant, Instant instant2, Instant instant3) {
        this(new Surrogate(id, account_id, position, moneyDto, moneyDto2, moneyDto3, corpActionCashDividendsDto, corp_action_payment_state, instant, instant2, instant3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CorpActionCashDividendsPayment toProto() {
        String id = this.surrogate.getId();
        String account_id = this.surrogate.getAccount_id();
        String stringValue = this.surrogate.getPosition().getStringValue();
        MoneyDto gross_amount = this.surrogate.getGross_amount();
        Money proto = gross_amount != null ? gross_amount.toProto() : null;
        MoneyDto withholding_amount = this.surrogate.getWithholding_amount();
        Money proto2 = withholding_amount != null ? withholding_amount.toProto() : null;
        MoneyDto net_amount = this.surrogate.getNet_amount();
        Money proto3 = net_amount != null ? net_amount.toProto() : null;
        CorpActionCashDividendsDto dividends = this.surrogate.getDividends();
        return new CorpActionCashDividendsPayment(id, account_id, stringValue, proto, proto2, proto3, dividends != null ? dividends.toProto() : null, (CorpActionPaymentState) this.surrogate.getCorp_action_payment_state().toProto(), this.surrogate.getPaid_at(), this.surrogate.getUpdated_at(), this.surrogate.getCreated_at(), null, 2048, null);
    }

    public String toString() {
        return "[CorpActionCashDividendsPaymentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CorpActionCashDividendsPaymentDto) && Intrinsics.areEqual(((CorpActionCashDividendsPaymentDto) other).surrogate, this.surrogate);
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
    /* compiled from: CorpActionCashDividendsPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b'\b\u0083\b\u0018\u0000 R2\u00020\u0001:\u0002SRBþ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012.\b\u0002\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014\u0012.\b\u0002\u0010\u0016\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014\u0012.\b\u0002\u0010\u0017\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\u0004\b\u0018\u0010\u0019B\u0089\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ'\u0010'\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010)R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00100\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010)R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b9\u00103\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010:\u0012\u0004\b=\u00103\u001a\u0004\b;\u0010<R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\b?\u00103\u001a\u0004\b>\u0010<R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010:\u0012\u0004\bA\u00103\u001a\u0004\b@\u0010<R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010B\u0012\u0004\bE\u00103\u001a\u0004\bC\u0010DR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010F\u0012\u0004\bI\u00103\u001a\u0004\bG\u0010HRF\u0010\u0015\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010J\u0012\u0004\bM\u00103\u001a\u0004\bK\u0010LRF\u0010\u0016\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010J\u0012\u0004\bO\u00103\u001a\u0004\bN\u0010LRF\u0010\u0017\u001a(\u0018\u00010\u0012j\u0013\u0018\u0001`\u0013¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u0014¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010J\u0012\u0004\bQ\u00103\u001a\u0004\bP\u0010L¨\u0006T"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;", "", "", "id", "account_id", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "position", "Lcom/robinhood/rosetta/common/MoneyDto;", "gross_amount", "withholding_amount", "net_amount", "Lnummus/v1/CorpActionCashDividendsDto;", "dividends", "Lnummus/v1/CorpActionPaymentStateDto;", "corp_action_payment_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "paid_at", "updated_at", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lnummus/v1/CorpActionCashDividendsDto;Lnummus/v1/CorpActionPaymentStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lnummus/v1/CorpActionCashDividendsDto;Lnummus/v1/CorpActionPaymentStateDto;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_id", "getAccount_id$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getPosition", "()Lcom/robinhood/idl/IdlDecimal;", "getPosition$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getGross_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getGross_amount$annotations", "getWithholding_amount", "getWithholding_amount$annotations", "getNet_amount", "getNet_amount$annotations", "Lnummus/v1/CorpActionCashDividendsDto;", "getDividends", "()Lnummus/v1/CorpActionCashDividendsDto;", "getDividends$annotations", "Lnummus/v1/CorpActionPaymentStateDto;", "getCorp_action_payment_state", "()Lnummus/v1/CorpActionPaymentStateDto;", "getCorp_action_payment_state$annotations", "Lj$/time/Instant;", "getPaid_at", "()Lj$/time/Instant;", "getPaid_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "getCreated_at", "getCreated_at$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final CorpActionPaymentStateDto corp_action_payment_state;
        private final Instant created_at;
        private final CorpActionCashDividendsDto dividends;
        private final MoneyDto gross_amount;
        private final String id;
        private final MoneyDto net_amount;
        private final Instant paid_at;
        private final IdlDecimal position;
        private final Instant updated_at;
        private final MoneyDto withholding_amount;

        public Surrogate() {
            this((String) null, (String) null, (IdlDecimal) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (CorpActionCashDividendsDto) null, (CorpActionPaymentStateDto) null, (Instant) null, (Instant) null, (Instant) null, 2047, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.position, surrogate.position) && Intrinsics.areEqual(this.gross_amount, surrogate.gross_amount) && Intrinsics.areEqual(this.withholding_amount, surrogate.withholding_amount) && Intrinsics.areEqual(this.net_amount, surrogate.net_amount) && Intrinsics.areEqual(this.dividends, surrogate.dividends) && this.corp_action_payment_state == surrogate.corp_action_payment_state && Intrinsics.areEqual(this.paid_at, surrogate.paid_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && Intrinsics.areEqual(this.created_at, surrogate.created_at);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.account_id.hashCode()) * 31) + this.position.hashCode()) * 31;
            MoneyDto moneyDto = this.gross_amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.withholding_amount;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.net_amount;
            int iHashCode4 = (iHashCode3 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            CorpActionCashDividendsDto corpActionCashDividendsDto = this.dividends;
            int iHashCode5 = (((iHashCode4 + (corpActionCashDividendsDto == null ? 0 : corpActionCashDividendsDto.hashCode())) * 31) + this.corp_action_payment_state.hashCode()) * 31;
            Instant instant = this.paid_at;
            int iHashCode6 = (iHashCode5 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.updated_at;
            int iHashCode7 = (iHashCode6 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
            Instant instant3 = this.created_at;
            return iHashCode7 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_id=" + this.account_id + ", position=" + this.position + ", gross_amount=" + this.gross_amount + ", withholding_amount=" + this.withholding_amount + ", net_amount=" + this.net_amount + ", dividends=" + this.dividends + ", corp_action_payment_state=" + this.corp_action_payment_state + ", paid_at=" + this.paid_at + ", updated_at=" + this.updated_at + ", created_at=" + this.created_at + ")";
        }

        /* compiled from: CorpActionCashDividendsPaymentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CorpActionCashDividendsPaymentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, CorpActionCashDividendsDto corpActionCashDividendsDto, CorpActionPaymentStateDto corpActionPaymentStateDto, Instant instant, Instant instant2, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.position = new IdlDecimal("");
            } else {
                this.position = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.gross_amount = null;
            } else {
                this.gross_amount = moneyDto;
            }
            if ((i & 16) == 0) {
                this.withholding_amount = null;
            } else {
                this.withholding_amount = moneyDto2;
            }
            if ((i & 32) == 0) {
                this.net_amount = null;
            } else {
                this.net_amount = moneyDto3;
            }
            if ((i & 64) == 0) {
                this.dividends = null;
            } else {
                this.dividends = corpActionCashDividendsDto;
            }
            if ((i & 128) == 0) {
                this.corp_action_payment_state = CorpActionPaymentStateDto.INSTANCE.getZeroValue();
            } else {
                this.corp_action_payment_state = corpActionPaymentStateDto;
            }
            if ((i & 256) == 0) {
                this.paid_at = null;
            } else {
                this.paid_at = instant;
            }
            if ((i & 512) == 0) {
                this.updated_at = null;
            } else {
                this.updated_at = instant2;
            }
            if ((i & 1024) == 0) {
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
            if (!Intrinsics.areEqual(self.position, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.position);
            }
            MoneyDto moneyDto = self.gross_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.withholding_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.net_amount;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            CorpActionCashDividendsDto corpActionCashDividendsDto = self.dividends;
            if (corpActionCashDividendsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, CorpActionCashDividendsDto.Serializer.INSTANCE, corpActionCashDividendsDto);
            }
            if (self.corp_action_payment_state != CorpActionPaymentStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 7, CorpActionPaymentStateDto.Serializer.INSTANCE, self.corp_action_payment_state);
            }
            Instant instant = self.paid_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.updated_at;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, WireInstantSerializer.INSTANCE, instant2);
            }
            Instant instant3 = self.created_at;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(String id, String account_id, IdlDecimal position, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, CorpActionCashDividendsDto corpActionCashDividendsDto, CorpActionPaymentStateDto corp_action_payment_state, Instant instant, Instant instant2, Instant instant3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(corp_action_payment_state, "corp_action_payment_state");
            this.id = id;
            this.account_id = account_id;
            this.position = position;
            this.gross_amount = moneyDto;
            this.withholding_amount = moneyDto2;
            this.net_amount = moneyDto3;
            this.dividends = corpActionCashDividendsDto;
            this.corp_action_payment_state = corp_action_payment_state;
            this.paid_at = instant;
            this.updated_at = instant2;
            this.created_at = instant3;
        }

        public /* synthetic */ Surrogate(String str, String str2, IdlDecimal idlDecimal, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, CorpActionCashDividendsDto corpActionCashDividendsDto, CorpActionPaymentStateDto corpActionPaymentStateDto, Instant instant, Instant instant2, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? null : moneyDto2, (i & 32) != 0 ? null : moneyDto3, (i & 64) != 0 ? null : corpActionCashDividendsDto, (i & 128) != 0 ? CorpActionPaymentStateDto.INSTANCE.getZeroValue() : corpActionPaymentStateDto, (i & 256) != 0 ? null : instant, (i & 512) != 0 ? null : instant2, (i & 1024) != 0 ? null : instant3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final IdlDecimal getPosition() {
            return this.position;
        }

        public final MoneyDto getGross_amount() {
            return this.gross_amount;
        }

        public final MoneyDto getWithholding_amount() {
            return this.withholding_amount;
        }

        public final MoneyDto getNet_amount() {
            return this.net_amount;
        }

        public final CorpActionCashDividendsDto getDividends() {
            return this.dividends;
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

    /* compiled from: CorpActionCashDividendsPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPaymentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/CorpActionCashDividendsPaymentDto;", "Lnummus/v1/CorpActionCashDividendsPayment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/CorpActionCashDividendsPaymentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CorpActionCashDividendsPaymentDto, CorpActionCashDividendsPayment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CorpActionCashDividendsPaymentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionCashDividendsPaymentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CorpActionCashDividendsPaymentDto> getBinaryBase64Serializer() {
            return (KSerializer) CorpActionCashDividendsPaymentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CorpActionCashDividendsPayment> getProtoAdapter() {
            return CorpActionCashDividendsPayment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionCashDividendsPaymentDto getZeroValue() {
            return CorpActionCashDividendsPaymentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CorpActionCashDividendsPaymentDto fromProto(CorpActionCashDividendsPayment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_id = proto.getAccount_id();
            IdlDecimal idlDecimal = new IdlDecimal(proto.getPosition());
            Money gross_amount = proto.getGross_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = gross_amount != null ? MoneyDto.INSTANCE.fromProto(gross_amount) : null;
            Money withholding_amount = proto.getWithholding_amount();
            MoneyDto moneyDtoFromProto2 = withholding_amount != null ? MoneyDto.INSTANCE.fromProto(withholding_amount) : null;
            Money net_amount = proto.getNet_amount();
            MoneyDto moneyDtoFromProto3 = net_amount != null ? MoneyDto.INSTANCE.fromProto(net_amount) : null;
            CorpActionCashDividends dividends = proto.getDividends();
            return new CorpActionCashDividendsPaymentDto(new Surrogate(id, account_id, idlDecimal, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, dividends != null ? CorpActionCashDividendsDto.INSTANCE.fromProto(dividends) : null, CorpActionPaymentStateDto.INSTANCE.fromProto(proto.getCorp_action_payment_state()), proto.getPaid_at(), proto.getUpdated_at(), proto.getCreated_at()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.CorpActionCashDividendsPaymentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CorpActionCashDividendsPaymentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CorpActionCashDividendsPaymentDto(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CorpActionCashDividendsPaymentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPaymentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/CorpActionCashDividendsPaymentDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/CorpActionCashDividendsPaymentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CorpActionCashDividendsPaymentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.CorpActionCashDividendsPayment", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CorpActionCashDividendsPaymentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CorpActionCashDividendsPaymentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CorpActionCashDividendsPaymentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CorpActionCashDividendsPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/CorpActionCashDividendsPaymentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "nummus.v1.CorpActionCashDividendsPaymentDto";
        }
    }
}
