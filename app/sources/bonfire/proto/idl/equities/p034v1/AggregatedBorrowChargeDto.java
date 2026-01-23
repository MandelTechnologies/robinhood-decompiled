package bonfire.proto.idl.equities.p034v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.equities.p034v1.AggregatedBorrowChargeDto;
import bonfire.proto.idl.equities.p034v1.BorrowChargeDto;
import bonfire.proto.idl.equities.p034v1.StatusChoicesDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
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
import p479j$.time.Instant;

/* compiled from: AggregatedBorrowChargeDto.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007By\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020!H\u0016¢\u0006\u0004\b*\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001bR\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0019\u0010\u0016\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8F¢\u0006\u0006\u001a\u0004\b7\u0010/¨\u0006<"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowCharge;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;)V", "", "id", "account_number", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "billing_end_date", "billing_start_date", "Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "status", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_charge_amount", "", "Lbonfire/proto/idl/equities/v1/BorrowChargeDto;", "charges", "charge_date", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/equities/v1/StatusChoicesDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lj$/time/Instant;)V", "toProto", "()Lbonfire/proto/idl/equities/v1/AggregatedBorrowCharge;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;", "getId", "getAccount_number", "getBilling_end_date", "()Lj$/time/Instant;", "getBilling_start_date", "getStatus", "()Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "getTotal_charge_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getCharges", "()Ljava/util/List;", "getCharge_date", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class AggregatedBorrowChargeDto implements Dto3<AggregatedBorrowCharge>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AggregatedBorrowChargeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AggregatedBorrowChargeDto, AggregatedBorrowCharge>> binaryBase64Serializer$delegate;
    private static final AggregatedBorrowChargeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AggregatedBorrowChargeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AggregatedBorrowChargeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final Instant getBilling_end_date() {
        return this.surrogate.getBilling_end_date();
    }

    public final Instant getBilling_start_date() {
        return this.surrogate.getBilling_start_date();
    }

    public final StatusChoicesDto getStatus() {
        return this.surrogate.getStatus();
    }

    public final MoneyDto getTotal_charge_amount() {
        return this.surrogate.getTotal_charge_amount();
    }

    public final List<BorrowChargeDto> getCharges() {
        return this.surrogate.getCharges();
    }

    public final Instant getCharge_date() {
        return this.surrogate.getCharge_date();
    }

    public /* synthetic */ AggregatedBorrowChargeDto(String str, String str2, Instant instant, Instant instant2, StatusChoicesDto statusChoicesDto, MoneyDto moneyDto, List list, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? StatusChoicesDto.INSTANCE.getZeroValue() : statusChoicesDto, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : instant3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AggregatedBorrowChargeDto(String id, String account_number, Instant instant, Instant instant2, StatusChoicesDto status, MoneyDto moneyDto, List<BorrowChargeDto> charges, Instant instant3) {
        this(new Surrogate(id, account_number, instant, instant2, status, moneyDto, charges, instant3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(charges, "charges");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AggregatedBorrowCharge toProto() {
        String id = this.surrogate.getId();
        String account_number = this.surrogate.getAccount_number();
        Instant billing_end_date = this.surrogate.getBilling_end_date();
        Instant billing_start_date = this.surrogate.getBilling_start_date();
        StatusChoices statusChoices = (StatusChoices) this.surrogate.getStatus().toProto();
        MoneyDto total_charge_amount = this.surrogate.getTotal_charge_amount();
        Money proto = total_charge_amount != null ? total_charge_amount.toProto() : null;
        List<BorrowChargeDto> charges = this.surrogate.getCharges();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charges, 10));
        Iterator<T> it = charges.iterator();
        while (it.hasNext()) {
            arrayList.add(((BorrowChargeDto) it.next()).toProto());
        }
        return new AggregatedBorrowCharge(id, account_number, billing_end_date, billing_start_date, statusChoices, proto, arrayList, this.surrogate.getCharge_date(), null, 256, null);
    }

    public String toString() {
        return "[AggregatedBorrowChargeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AggregatedBorrowChargeDto) && Intrinsics.areEqual(((AggregatedBorrowChargeDto) other).surrogate, this.surrogate);
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
    /* compiled from: AggregatedBorrowChargeDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0083\b\u0018\u0000 F2\u00020\u0001:\u0002GFBÑ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012.\b\u0002\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012.\b\u0002\u0010\u0013\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b\u0014\u0010\u0015Bq\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ'\u0010#\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010%RF\u0010\n\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b5\u0010/\u001a\u0004\b3\u00104RF\u0010\u000b\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b7\u0010/\u001a\u0004\b6\u00104R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>R&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010BRF\u0010\u0013\u001a(\u0018\u00010\u0005j\u0013\u0018\u0001`\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00102\u0012\u0004\bE\u0010/\u001a\u0004\bD\u00104¨\u0006H"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;", "", "", "id", "account_number", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "billing_end_date", "billing_start_date", "Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "status", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_charge_amount", "", "Lbonfire/proto/idl/equities/v1/BorrowChargeDto;", "charges", "charge_date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/equities/v1/StatusChoicesDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lj$/time/Instant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/equities/v1/StatusChoicesDto;Lcom/robinhood/rosetta/common/MoneyDto;Ljava/util/List;Lj$/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_equities_v1_externalRelease", "(Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "Lj$/time/Instant;", "getBilling_end_date", "()Lj$/time/Instant;", "getBilling_end_date$annotations", "getBilling_start_date", "getBilling_start_date$annotations", "Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "getStatus", "()Lbonfire/proto/idl/equities/v1/StatusChoicesDto;", "getStatus$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_charge_amount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_charge_amount$annotations", "Ljava/util/List;", "getCharges", "()Ljava/util/List;", "getCharges$annotations", "getCharge_date", "getCharge_date$annotations", "Companion", "$serializer", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final Instant billing_end_date;
        private final Instant billing_start_date;
        private final Instant charge_date;
        private final List<BorrowChargeDto> charges;
        private final String id;
        private final StatusChoicesDto status;
        private final MoneyDto total_charge_amount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.equities.v1.AggregatedBorrowChargeDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AggregatedBorrowChargeDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (Instant) null, (Instant) null, (StatusChoicesDto) null, (MoneyDto) null, (List) null, (Instant) null, 255, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(BorrowChargeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.billing_end_date, surrogate.billing_end_date) && Intrinsics.areEqual(this.billing_start_date, surrogate.billing_start_date) && this.status == surrogate.status && Intrinsics.areEqual(this.total_charge_amount, surrogate.total_charge_amount) && Intrinsics.areEqual(this.charges, surrogate.charges) && Intrinsics.areEqual(this.charge_date, surrogate.charge_date);
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31;
            Instant instant = this.billing_end_date;
            int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.billing_start_date;
            int iHashCode3 = (((iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.status.hashCode()) * 31;
            MoneyDto moneyDto = this.total_charge_amount;
            int iHashCode4 = (((iHashCode3 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + this.charges.hashCode()) * 31;
            Instant instant3 = this.charge_date;
            return iHashCode4 + (instant3 != null ? instant3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", billing_end_date=" + this.billing_end_date + ", billing_start_date=" + this.billing_start_date + ", status=" + this.status + ", total_charge_amount=" + this.total_charge_amount + ", charges=" + this.charges + ", charge_date=" + this.charge_date + ")";
        }

        /* compiled from: AggregatedBorrowChargeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AggregatedBorrowChargeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Instant instant, Instant instant2, StatusChoicesDto statusChoicesDto, MoneyDto moneyDto, List list, Instant instant3, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.billing_end_date = null;
            } else {
                this.billing_end_date = instant;
            }
            if ((i & 8) == 0) {
                this.billing_start_date = null;
            } else {
                this.billing_start_date = instant2;
            }
            if ((i & 16) == 0) {
                this.status = StatusChoicesDto.INSTANCE.getZeroValue();
            } else {
                this.status = statusChoicesDto;
            }
            if ((i & 32) == 0) {
                this.total_charge_amount = null;
            } else {
                this.total_charge_amount = moneyDto;
            }
            if ((i & 64) == 0) {
                this.charges = CollectionsKt.emptyList();
            } else {
                this.charges = list;
            }
            if ((i & 128) == 0) {
                this.charge_date = null;
            } else {
                this.charge_date = instant3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_equities_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            Instant instant = self.billing_end_date;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            Instant instant2 = self.billing_start_date;
            if (instant2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant2);
            }
            if (self.status != StatusChoicesDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, StatusChoicesDto.Serializer.INSTANCE, self.status);
            }
            MoneyDto moneyDto = self.total_charge_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (!Intrinsics.areEqual(self.charges, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.charges);
            }
            Instant instant3 = self.charge_date;
            if (instant3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, WireInstantSerializer.INSTANCE, instant3);
            }
        }

        public Surrogate(String id, String account_number, Instant instant, Instant instant2, StatusChoicesDto status, MoneyDto moneyDto, List<BorrowChargeDto> charges, Instant instant3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(charges, "charges");
            this.id = id;
            this.account_number = account_number;
            this.billing_end_date = instant;
            this.billing_start_date = instant2;
            this.status = status;
            this.total_charge_amount = moneyDto;
            this.charges = charges;
            this.charge_date = instant3;
        }

        public /* synthetic */ Surrogate(String str, String str2, Instant instant, Instant instant2, StatusChoicesDto statusChoicesDto, MoneyDto moneyDto, List list, Instant instant3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? StatusChoicesDto.INSTANCE.getZeroValue() : statusChoicesDto, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : instant3);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final Instant getBilling_end_date() {
            return this.billing_end_date;
        }

        public final Instant getBilling_start_date() {
            return this.billing_start_date;
        }

        public final StatusChoicesDto getStatus() {
            return this.status;
        }

        public final MoneyDto getTotal_charge_amount() {
            return this.total_charge_amount;
        }

        public final List<BorrowChargeDto> getCharges() {
            return this.charges;
        }

        public final Instant getCharge_date() {
            return this.charge_date;
        }
    }

    /* compiled from: AggregatedBorrowChargeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowCharge;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AggregatedBorrowChargeDto, AggregatedBorrowCharge> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AggregatedBorrowChargeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AggregatedBorrowChargeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AggregatedBorrowChargeDto> getBinaryBase64Serializer() {
            return (KSerializer) AggregatedBorrowChargeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AggregatedBorrowCharge> getProtoAdapter() {
            return AggregatedBorrowCharge.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AggregatedBorrowChargeDto getZeroValue() {
            return AggregatedBorrowChargeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AggregatedBorrowChargeDto fromProto(AggregatedBorrowCharge proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_number = proto.getAccount_number();
            Instant billing_end_date = proto.getBilling_end_date();
            Instant billing_start_date = proto.getBilling_start_date();
            StatusChoicesDto statusChoicesDtoFromProto = StatusChoicesDto.INSTANCE.fromProto(proto.getStatus());
            Money total_charge_amount = proto.getTotal_charge_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = total_charge_amount != null ? MoneyDto.INSTANCE.fromProto(total_charge_amount) : null;
            List<BorrowCharge> charges = proto.getCharges();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(charges, 10));
            Iterator<T> it = charges.iterator();
            while (it.hasNext()) {
                arrayList.add(BorrowChargeDto.INSTANCE.fromProto((BorrowCharge) it.next()));
            }
            return new AggregatedBorrowChargeDto(new Surrogate(id, account_number, billing_end_date, billing_start_date, statusChoicesDtoFromProto, moneyDtoFromProto, arrayList, proto.getCharge_date()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.equities.v1.AggregatedBorrowChargeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AggregatedBorrowChargeDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AggregatedBorrowChargeDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AggregatedBorrowChargeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AggregatedBorrowChargeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.equities.v1.AggregatedBorrowCharge", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AggregatedBorrowChargeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AggregatedBorrowChargeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AggregatedBorrowChargeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AggregatedBorrowChargeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.equities.v1.AggregatedBorrowChargeDto";
        }
    }
}
