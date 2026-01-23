package advisory.proto.p008v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetReturnsBreakdownResponseDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bm\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0018R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0018¨\u00067"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetReturnsBreakdownResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;)V", "", "account_number", "span", "Lcom/robinhood/rosetta/common/MoneyDto;", "income", "advisory_fee", "total_returns", "appreciation", "span_description", "", "show_bottom_sheet", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;ZLjava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/GetReturnsBreakdownResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;", "getAccount_number", "getSpan", "getIncome", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAdvisory_fee", "getTotal_returns", "getAppreciation", "getSpan_description", "getShow_bottom_sheet", "()Z", "getLearn_more", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetReturnsBreakdownResponseDto implements Dto3<GetReturnsBreakdownResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetReturnsBreakdownResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetReturnsBreakdownResponseDto, GetReturnsBreakdownResponse>> binaryBase64Serializer$delegate;
    private static final GetReturnsBreakdownResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetReturnsBreakdownResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetReturnsBreakdownResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getSpan() {
        return this.surrogate.getSpan();
    }

    public final MoneyDto getIncome() {
        return this.surrogate.getIncome();
    }

    public final MoneyDto getAdvisory_fee() {
        return this.surrogate.getAdvisory_fee();
    }

    public final MoneyDto getTotal_returns() {
        return this.surrogate.getTotal_returns();
    }

    public final MoneyDto getAppreciation() {
        return this.surrogate.getAppreciation();
    }

    public final String getSpan_description() {
        return this.surrogate.getSpan_description();
    }

    public final boolean getShow_bottom_sheet() {
        return this.surrogate.getShow_bottom_sheet();
    }

    public final String getLearn_more() {
        return this.surrogate.getLearn_more();
    }

    public /* synthetic */ GetReturnsBreakdownResponseDto(String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? null : moneyDto3, (i & 32) != 0 ? null : moneyDto4, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetReturnsBreakdownResponseDto(String account_number, String span, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, String span_description, boolean z, String str) {
        this(new Surrogate(account_number, span, moneyDto, moneyDto2, moneyDto3, moneyDto4, span_description, z, str));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(span_description, "span_description");
    }

    @Override // com.robinhood.idl.Dto
    public GetReturnsBreakdownResponse toProto() {
        String account_number = this.surrogate.getAccount_number();
        String span = this.surrogate.getSpan();
        MoneyDto income = this.surrogate.getIncome();
        Money proto = income != null ? income.toProto() : null;
        MoneyDto advisory_fee = this.surrogate.getAdvisory_fee();
        Money proto2 = advisory_fee != null ? advisory_fee.toProto() : null;
        MoneyDto total_returns = this.surrogate.getTotal_returns();
        Money proto3 = total_returns != null ? total_returns.toProto() : null;
        MoneyDto appreciation = this.surrogate.getAppreciation();
        return new GetReturnsBreakdownResponse(account_number, span, proto, proto2, proto3, appreciation != null ? appreciation.toProto() : null, this.surrogate.getSpan_description(), this.surrogate.getShow_bottom_sheet(), this.surrogate.getLearn_more(), null, 512, null);
    }

    public String toString() {
        return "[GetReturnsBreakdownResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetReturnsBreakdownResponseDto) && Intrinsics.areEqual(((GetReturnsBreakdownResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetReturnsBreakdownResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010-R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b2\u0010(\u001a\u0004\b1\u0010-R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010-R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010\u001fR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b<\u0010(\u001a\u0004\b;\u0010\u001f¨\u0006?"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;", "", "", "account_number", "span", "Lcom/robinhood/rosetta/common/MoneyDto;", "income", "advisory_fee", "total_returns", "appreciation", "span_description", "", "show_bottom_sheet", AnalyticsStrings.BUTTON_PROFIT_LOSS_CHART_LEARN_MORE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getSpan", "getSpan$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getIncome", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getIncome$annotations", "getAdvisory_fee", "getAdvisory_fee$annotations", "getTotal_returns", "getTotal_returns$annotations", "getAppreciation", "getAppreciation$annotations", "getSpan_description", "getSpan_description$annotations", "Z", "getShow_bottom_sheet", "()Z", "getShow_bottom_sheet$annotations", "getLearn_more", "getLearn_more$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final MoneyDto advisory_fee;
        private final MoneyDto appreciation;
        private final MoneyDto income;
        private final String learn_more;
        private final boolean show_bottom_sheet;
        private final String span;
        private final String span_description;
        private final MoneyDto total_returns;

        public Surrogate() {
            this((String) null, (String) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (MoneyDto) null, (String) null, false, (String) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.span, surrogate.span) && Intrinsics.areEqual(this.income, surrogate.income) && Intrinsics.areEqual(this.advisory_fee, surrogate.advisory_fee) && Intrinsics.areEqual(this.total_returns, surrogate.total_returns) && Intrinsics.areEqual(this.appreciation, surrogate.appreciation) && Intrinsics.areEqual(this.span_description, surrogate.span_description) && this.show_bottom_sheet == surrogate.show_bottom_sheet && Intrinsics.areEqual(this.learn_more, surrogate.learn_more);
        }

        public int hashCode() {
            int iHashCode = ((this.account_number.hashCode() * 31) + this.span.hashCode()) * 31;
            MoneyDto moneyDto = this.income;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.advisory_fee;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.total_returns;
            int iHashCode4 = (iHashCode3 + (moneyDto3 == null ? 0 : moneyDto3.hashCode())) * 31;
            MoneyDto moneyDto4 = this.appreciation;
            int iHashCode5 = (((((iHashCode4 + (moneyDto4 == null ? 0 : moneyDto4.hashCode())) * 31) + this.span_description.hashCode()) * 31) + Boolean.hashCode(this.show_bottom_sheet)) * 31;
            String str = this.learn_more;
            return iHashCode5 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", span=" + this.span + ", income=" + this.income + ", advisory_fee=" + this.advisory_fee + ", total_returns=" + this.total_returns + ", appreciation=" + this.appreciation + ", span_description=" + this.span_description + ", show_bottom_sheet=" + this.show_bottom_sheet + ", learn_more=" + this.learn_more + ")";
        }

        /* compiled from: GetReturnsBreakdownResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetReturnsBreakdownResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, String str3, boolean z, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.span = "";
            } else {
                this.span = str2;
            }
            if ((i & 4) == 0) {
                this.income = null;
            } else {
                this.income = moneyDto;
            }
            if ((i & 8) == 0) {
                this.advisory_fee = null;
            } else {
                this.advisory_fee = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.total_returns = null;
            } else {
                this.total_returns = moneyDto3;
            }
            if ((i & 32) == 0) {
                this.appreciation = null;
            } else {
                this.appreciation = moneyDto4;
            }
            if ((i & 64) == 0) {
                this.span_description = "";
            } else {
                this.span_description = str3;
            }
            if ((i & 128) == 0) {
                this.show_bottom_sheet = false;
            } else {
                this.show_bottom_sheet = z;
            }
            if ((i & 256) == 0) {
                this.learn_more = null;
            } else {
                this.learn_more = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.span, "")) {
                output.encodeStringElement(serialDesc, 1, self.span);
            }
            MoneyDto moneyDto = self.income;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.advisory_fee;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.total_returns;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
            MoneyDto moneyDto4 = self.appreciation;
            if (moneyDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto4);
            }
            if (!Intrinsics.areEqual(self.span_description, "")) {
                output.encodeStringElement(serialDesc, 6, self.span_description);
            }
            boolean z = self.show_bottom_sheet;
            if (z) {
                output.encodeBooleanElement(serialDesc, 7, z);
            }
            String str = self.learn_more;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String account_number, String span, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, String span_description, boolean z, String str) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(span, "span");
            Intrinsics.checkNotNullParameter(span_description, "span_description");
            this.account_number = account_number;
            this.span = span;
            this.income = moneyDto;
            this.advisory_fee = moneyDto2;
            this.total_returns = moneyDto3;
            this.appreciation = moneyDto4;
            this.span_description = span_description;
            this.show_bottom_sheet = z;
            this.learn_more = str;
        }

        public /* synthetic */ Surrogate(String str, String str2, MoneyDto moneyDto, MoneyDto moneyDto2, MoneyDto moneyDto3, MoneyDto moneyDto4, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : moneyDto, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? null : moneyDto3, (i & 32) != 0 ? null : moneyDto4, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : str4);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getSpan() {
            return this.span;
        }

        public final MoneyDto getIncome() {
            return this.income;
        }

        public final MoneyDto getAdvisory_fee() {
            return this.advisory_fee;
        }

        public final MoneyDto getTotal_returns() {
            return this.total_returns;
        }

        public final MoneyDto getAppreciation() {
            return this.appreciation;
        }

        public final String getSpan_description() {
            return this.span_description;
        }

        public final boolean getShow_bottom_sheet() {
            return this.show_bottom_sheet;
        }

        public final String getLearn_more() {
            return this.learn_more;
        }
    }

    /* compiled from: GetReturnsBreakdownResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto;", "Ladvisory/proto/v1/GetReturnsBreakdownResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetReturnsBreakdownResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetReturnsBreakdownResponseDto, GetReturnsBreakdownResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetReturnsBreakdownResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetReturnsBreakdownResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetReturnsBreakdownResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetReturnsBreakdownResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetReturnsBreakdownResponse> getProtoAdapter() {
            return GetReturnsBreakdownResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetReturnsBreakdownResponseDto getZeroValue() {
            return GetReturnsBreakdownResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetReturnsBreakdownResponseDto fromProto(GetReturnsBreakdownResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String span = proto.getSpan();
            Money income = proto.getIncome();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = income != null ? MoneyDto.INSTANCE.fromProto(income) : null;
            Money advisory_fee = proto.getAdvisory_fee();
            MoneyDto moneyDtoFromProto2 = advisory_fee != null ? MoneyDto.INSTANCE.fromProto(advisory_fee) : null;
            Money total_returns = proto.getTotal_returns();
            MoneyDto moneyDtoFromProto3 = total_returns != null ? MoneyDto.INSTANCE.fromProto(total_returns) : null;
            Money appreciation = proto.getAppreciation();
            return new GetReturnsBreakdownResponseDto(new Surrogate(account_number, span, moneyDtoFromProto, moneyDtoFromProto2, moneyDtoFromProto3, appreciation != null ? MoneyDto.INSTANCE.fromProto(appreciation) : null, proto.getSpan_description(), proto.getShow_bottom_sheet(), proto.getLearn_more()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetReturnsBreakdownResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetReturnsBreakdownResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetReturnsBreakdownResponseDto(null, null, null, null, null, null, null, false, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetReturnsBreakdownResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<GetReturnsBreakdownResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetReturnsBreakdownResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetReturnsBreakdownResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetReturnsBreakdownResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetReturnsBreakdownResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetReturnsBreakdownResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetReturnsBreakdownResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetReturnsBreakdownResponseDto";
        }
    }
}
