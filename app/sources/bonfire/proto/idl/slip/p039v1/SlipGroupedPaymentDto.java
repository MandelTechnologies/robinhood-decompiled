package bonfire.proto.idl.slip.p039v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.slip.p039v1.SlipGroupedPaymentDto;
import bonfire.proto.idl.slip.p039v1.SlipGroupedPaymentItemDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SlipGroupedPaymentDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00042134B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0017R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b/\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00065"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/slip/v1/SlipGroupedPayment;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;)V", "", "id", "account_number", "record_date", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentItemDto;", "payments", "withheld_amount", "net_credit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lbonfire/proto/idl/slip/v1/SlipGroupedPayment;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;", "getId", "getAccount_number", "getRecord_date", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getPayments", "()Ljava/util/List;", "getWithheld_amount", "getNet_credit", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class SlipGroupedPaymentDto implements Dto3<SlipGroupedPayment>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SlipGroupedPaymentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SlipGroupedPaymentDto, SlipGroupedPayment>> binaryBase64Serializer$delegate;
    private static final SlipGroupedPaymentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SlipGroupedPaymentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SlipGroupedPaymentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getRecord_date() {
        return this.surrogate.getRecord_date();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final List<SlipGroupedPaymentItemDto> getPayments() {
        return this.surrogate.getPayments();
    }

    public final MoneyDto getWithheld_amount() {
        return this.surrogate.getWithheld_amount();
    }

    public final MoneyDto getNet_credit() {
        return this.surrogate.getNet_credit();
    }

    public /* synthetic */ SlipGroupedPaymentDto(String str, String str2, String str3, MoneyDto moneyDto, List list, MoneyDto moneyDto2, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : moneyDto2, (i & 64) != 0 ? null : moneyDto3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SlipGroupedPaymentDto(String id, String account_number, String record_date, MoneyDto moneyDto, List<SlipGroupedPaymentItemDto> payments, MoneyDto moneyDto2, MoneyDto moneyDto3) {
        this(new Surrogate(id, account_number, record_date, moneyDto, payments, moneyDto2, moneyDto3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(record_date, "record_date");
        Intrinsics.checkNotNullParameter(payments, "payments");
    }

    @Override // com.robinhood.idl.Dto
    public SlipGroupedPayment toProto() {
        String id = this.surrogate.getId();
        String account_number = this.surrogate.getAccount_number();
        String record_date = this.surrogate.getRecord_date();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        List<SlipGroupedPaymentItemDto> payments = this.surrogate.getPayments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(payments, 10));
        Iterator<T> it = payments.iterator();
        while (it.hasNext()) {
            arrayList.add(((SlipGroupedPaymentItemDto) it.next()).toProto());
        }
        MoneyDto withheld_amount = this.surrogate.getWithheld_amount();
        Money proto2 = withheld_amount != null ? withheld_amount.toProto() : null;
        MoneyDto net_credit = this.surrogate.getNet_credit();
        return new SlipGroupedPayment(id, account_number, record_date, proto, arrayList, proto2, net_credit != null ? net_credit.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[SlipGroupedPaymentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SlipGroupedPaymentDto) && Intrinsics.areEqual(((SlipGroupedPaymentDto) other).surrogate, this.surrogate);
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
    /* compiled from: SlipGroupedPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0083\b\u0018\u0000 92\u00020\u0001:\u0002:9BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b6\u0010(\u001a\u0004\b5\u0010/R\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010-\u0012\u0004\b8\u0010(\u001a\u0004\b7\u0010/¨\u0006;"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;", "", "", "id", "account_number", "record_date", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentItemDto;", "payments", "withheld_amount", "net_credit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_slip_v1_externalRelease", "(Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "getRecord_date", "getRecord_date$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Ljava/util/List;", "getPayments", "()Ljava/util/List;", "getPayments$annotations", "getWithheld_amount", "getWithheld_amount$annotations", "getNet_credit", "getNet_credit$annotations", "Companion", "$serializer", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final MoneyDto amount;
        private final String id;
        private final MoneyDto net_credit;
        private final List<SlipGroupedPaymentItemDto> payments;
        private final String record_date;
        private final MoneyDto withheld_amount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.slip.v1.SlipGroupedPaymentDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipGroupedPaymentDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (MoneyDto) null, (List) null, (MoneyDto) null, (MoneyDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SlipGroupedPaymentItemDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.record_date, surrogate.record_date) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.payments, surrogate.payments) && Intrinsics.areEqual(this.withheld_amount, surrogate.withheld_amount) && Intrinsics.areEqual(this.net_credit, surrogate.net_credit);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31) + this.record_date.hashCode()) * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.payments.hashCode()) * 31;
            MoneyDto moneyDto2 = this.withheld_amount;
            int iHashCode3 = (iHashCode2 + (moneyDto2 == null ? 0 : moneyDto2.hashCode())) * 31;
            MoneyDto moneyDto3 = this.net_credit;
            return iHashCode3 + (moneyDto3 != null ? moneyDto3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", record_date=" + this.record_date + ", amount=" + this.amount + ", payments=" + this.payments + ", withheld_amount=" + this.withheld_amount + ", net_credit=" + this.net_credit + ")";
        }

        /* compiled from: SlipGroupedPaymentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SlipGroupedPaymentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, MoneyDto moneyDto, List list, MoneyDto moneyDto2, MoneyDto moneyDto3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 4) == 0) {
                this.record_date = "";
            } else {
                this.record_date = str3;
            }
            if ((i & 8) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 16) == 0) {
                this.payments = CollectionsKt.emptyList();
            } else {
                this.payments = list;
            }
            if ((i & 32) == 0) {
                this.withheld_amount = null;
            } else {
                this.withheld_amount = moneyDto2;
            }
            if ((i & 64) == 0) {
                this.net_credit = null;
            } else {
                this.net_credit = moneyDto3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_slip_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            if (!Intrinsics.areEqual(self.record_date, "")) {
                output.encodeStringElement(serialDesc, 2, self.record_date);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.payments, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.payments);
            }
            MoneyDto moneyDto2 = self.withheld_amount;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            MoneyDto moneyDto3 = self.net_credit;
            if (moneyDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto3);
            }
        }

        public Surrogate(String id, String account_number, String record_date, MoneyDto moneyDto, List<SlipGroupedPaymentItemDto> payments, MoneyDto moneyDto2, MoneyDto moneyDto3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(record_date, "record_date");
            Intrinsics.checkNotNullParameter(payments, "payments");
            this.id = id;
            this.account_number = account_number;
            this.record_date = record_date;
            this.amount = moneyDto;
            this.payments = payments;
            this.withheld_amount = moneyDto2;
            this.net_credit = moneyDto3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, MoneyDto moneyDto, List list, MoneyDto moneyDto2, MoneyDto moneyDto3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : moneyDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : moneyDto2, (i & 64) != 0 ? null : moneyDto3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getRecord_date() {
            return this.record_date;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final List<SlipGroupedPaymentItemDto> getPayments() {
            return this.payments;
        }

        public final MoneyDto getWithheld_amount() {
            return this.withheld_amount;
        }

        public final MoneyDto getNet_credit() {
            return this.net_credit;
        }
    }

    /* compiled from: SlipGroupedPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto;", "Lbonfire/proto/idl/slip/v1/SlipGroupedPayment;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SlipGroupedPaymentDto, SlipGroupedPayment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SlipGroupedPaymentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SlipGroupedPaymentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SlipGroupedPaymentDto> getBinaryBase64Serializer() {
            return (KSerializer) SlipGroupedPaymentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SlipGroupedPayment> getProtoAdapter() {
            return SlipGroupedPayment.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SlipGroupedPaymentDto getZeroValue() {
            return SlipGroupedPaymentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SlipGroupedPaymentDto fromProto(SlipGroupedPayment proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_number = proto.getAccount_number();
            String record_date = proto.getRecord_date();
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            List<SlipGroupedPaymentItem> payments = proto.getPayments();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(payments, 10));
            Iterator<T> it = payments.iterator();
            while (it.hasNext()) {
                arrayList.add(SlipGroupedPaymentItemDto.INSTANCE.fromProto((SlipGroupedPaymentItem) it.next()));
            }
            Money withheld_amount = proto.getWithheld_amount();
            MoneyDto moneyDtoFromProto2 = withheld_amount != null ? MoneyDto.INSTANCE.fromProto(withheld_amount) : null;
            Money net_credit = proto.getNet_credit();
            return new SlipGroupedPaymentDto(new Surrogate(id, account_number, record_date, moneyDtoFromProto, arrayList, moneyDtoFromProto2, net_credit != null ? MoneyDto.INSTANCE.fromProto(net_credit) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.slip.v1.SlipGroupedPaymentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipGroupedPaymentDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new SlipGroupedPaymentDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SlipGroupedPaymentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SlipGroupedPaymentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.slip.v1.SlipGroupedPayment", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SlipGroupedPaymentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SlipGroupedPaymentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SlipGroupedPaymentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SlipGroupedPaymentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/slip/v1/SlipGroupedPaymentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.slip.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.slip.v1.SlipGroupedPaymentDto";
        }
    }
}
