package yoda.service.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import yoda.service.dashboard.AdvisorTradeDto;
import yoda.service.dashboard.AdvisorTradeStateDto;
import yoda.service.dashboard.OrderGroupDto;

/* compiled from: AdvisorTradeDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00047689B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b5\u00104¨\u0006:"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTradeDto;", "Lcom/robinhood/idl/MessageDto;", "Lyoda/service/dashboard/AdvisorTrade;", "Landroid/os/Parcelable;", "Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;", "surrogate", "<init>", "(Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;)V", "", "id", "account_number", "", "Lyoda/service/dashboard/OrderGroupDto;", "order_groups", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "initiated_at", "Lyoda/service/dashboard/AdvisorTradeStateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_bought", "total_sold", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lyoda/service/dashboard/AdvisorTradeStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lyoda/service/dashboard/AdvisorTrade;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;", "getId", "getAccount_number", "getOrder_groups", "()Ljava/util/List;", "getInitiated_at", "()Lj$/time/Instant;", "getState", "()Lyoda/service/dashboard/AdvisorTradeStateDto;", "getTotal_bought", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_sold", "Companion", "Surrogate", "Serializer", "MultibindingModule", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class AdvisorTradeDto implements Dto3<AdvisorTrade>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisorTradeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisorTradeDto, AdvisorTrade>> binaryBase64Serializer$delegate;
    private static final AdvisorTradeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisorTradeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisorTradeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final List<OrderGroupDto> getOrder_groups() {
        return this.surrogate.getOrder_groups();
    }

    public final Instant getInitiated_at() {
        return this.surrogate.getInitiated_at();
    }

    public final AdvisorTradeStateDto getState() {
        return this.surrogate.getState();
    }

    public final MoneyDto getTotal_bought() {
        return this.surrogate.getTotal_bought();
    }

    public final MoneyDto getTotal_sold() {
        return this.surrogate.getTotal_sold();
    }

    public /* synthetic */ AdvisorTradeDto(String str, String str2, List list, Instant instant, AdvisorTradeStateDto advisorTradeStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? AdvisorTradeStateDto.INSTANCE.getZeroValue() : advisorTradeStateDto, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisorTradeDto(String id, String account_number, List<OrderGroupDto> order_groups, Instant instant, AdvisorTradeStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2) {
        this(new Surrogate(id, account_number, order_groups, instant, state, moneyDto, moneyDto2));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(order_groups, "order_groups");
        Intrinsics.checkNotNullParameter(state, "state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvisorTrade toProto() {
        String id = this.surrogate.getId();
        String account_number = this.surrogate.getAccount_number();
        List<OrderGroupDto> order_groups = this.surrogate.getOrder_groups();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_groups, 10));
        Iterator<T> it = order_groups.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderGroupDto) it.next()).toProto());
        }
        Instant initiated_at = this.surrogate.getInitiated_at();
        AdvisorTradeState advisorTradeState = (AdvisorTradeState) this.surrogate.getState().toProto();
        MoneyDto total_bought = this.surrogate.getTotal_bought();
        Money proto = total_bought != null ? total_bought.toProto() : null;
        MoneyDto total_sold = this.surrogate.getTotal_sold();
        return new AdvisorTrade(id, account_number, arrayList, initiated_at, advisorTradeState, proto, total_sold != null ? total_sold.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[AdvisorTradeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisorTradeDto) && Intrinsics.areEqual(((AdvisorTradeDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisorTradeDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCB}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012.\b\u0002\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014Bg\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010$R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b4\u0010.\u001a\u0004\b2\u00103RF\u0010\r\u001a(\u0018\u00010\bj\u0013\u0018\u0001`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00105\u0012\u0004\b8\u0010.\u001a\u0004\b6\u00107R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00109\u0012\u0004\b<\u0010.\u001a\u0004\b:\u0010;R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\bB\u0010.\u001a\u0004\bA\u0010?¨\u0006E"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;", "", "", "id", "account_number", "", "Lyoda/service/dashboard/OrderGroupDto;", "order_groups", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "initiated_at", "Lyoda/service/dashboard/AdvisorTradeStateDto;", "state", "Lcom/robinhood/rosetta/common/MoneyDto;", "total_bought", "total_sold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lyoda/service/dashboard/AdvisorTradeStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Lyoda/service/dashboard/AdvisorTradeStateDto;Lcom/robinhood/rosetta/common/MoneyDto;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$yoda_v1_dashboard_externalRelease", "(Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAccount_number", "getAccount_number$annotations", "Ljava/util/List;", "getOrder_groups", "()Ljava/util/List;", "getOrder_groups$annotations", "Lj$/time/Instant;", "getInitiated_at", "()Lj$/time/Instant;", "getInitiated_at$annotations", "Lyoda/service/dashboard/AdvisorTradeStateDto;", "getState", "()Lyoda/service/dashboard/AdvisorTradeStateDto;", "getState$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_bought", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTotal_bought$annotations", "getTotal_sold", "getTotal_sold$annotations", "Companion", "$serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final String id;
        private final Instant initiated_at;
        private final List<OrderGroupDto> order_groups;
        private final AdvisorTradeStateDto state;
        private final MoneyDto total_bought;
        private final MoneyDto total_sold;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: yoda.service.dashboard.AdvisorTradeDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorTradeDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (Instant) null, (AdvisorTradeStateDto) null, (MoneyDto) null, (MoneyDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderGroupDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.order_groups, surrogate.order_groups) && Intrinsics.areEqual(this.initiated_at, surrogate.initiated_at) && this.state == surrogate.state && Intrinsics.areEqual(this.total_bought, surrogate.total_bought) && Intrinsics.areEqual(this.total_sold, surrogate.total_sold);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.account_number.hashCode()) * 31) + this.order_groups.hashCode()) * 31;
            Instant instant = this.initiated_at;
            int iHashCode2 = (((iHashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.state.hashCode()) * 31;
            MoneyDto moneyDto = this.total_bought;
            int iHashCode3 = (iHashCode2 + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            MoneyDto moneyDto2 = this.total_sold;
            return iHashCode3 + (moneyDto2 != null ? moneyDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", account_number=" + this.account_number + ", order_groups=" + this.order_groups + ", initiated_at=" + this.initiated_at + ", state=" + this.state + ", total_bought=" + this.total_bought + ", total_sold=" + this.total_sold + ")";
        }

        /* compiled from: AdvisorTradeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTradeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisorTradeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, Instant instant, AdvisorTradeStateDto advisorTradeStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, SerializationConstructorMarker serializationConstructorMarker) {
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
                this.order_groups = CollectionsKt.emptyList();
            } else {
                this.order_groups = list;
            }
            if ((i & 8) == 0) {
                this.initiated_at = null;
            } else {
                this.initiated_at = instant;
            }
            if ((i & 16) == 0) {
                this.state = AdvisorTradeStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = advisorTradeStateDto;
            }
            if ((i & 32) == 0) {
                this.total_bought = null;
            } else {
                this.total_bought = moneyDto;
            }
            if ((i & 64) == 0) {
                this.total_sold = null;
            } else {
                this.total_sold = moneyDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$yoda_v1_dashboard_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 1, self.account_number);
            }
            if (!Intrinsics.areEqual(self.order_groups, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.order_groups);
            }
            Instant instant = self.initiated_at;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, WireInstantSerializer.INSTANCE, instant);
            }
            if (self.state != AdvisorTradeStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, AdvisorTradeStateDto.Serializer.INSTANCE, self.state);
            }
            MoneyDto moneyDto = self.total_bought;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            MoneyDto moneyDto2 = self.total_sold;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
        }

        public Surrogate(String id, String account_number, List<OrderGroupDto> order_groups, Instant instant, AdvisorTradeStateDto state, MoneyDto moneyDto, MoneyDto moneyDto2) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(order_groups, "order_groups");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id;
            this.account_number = account_number;
            this.order_groups = order_groups;
            this.initiated_at = instant;
            this.state = state;
            this.total_bought = moneyDto;
            this.total_sold = moneyDto2;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, Instant instant, AdvisorTradeStateDto advisorTradeStateDto, MoneyDto moneyDto, MoneyDto moneyDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? AdvisorTradeStateDto.INSTANCE.getZeroValue() : advisorTradeStateDto, (i & 32) != 0 ? null : moneyDto, (i & 64) != 0 ? null : moneyDto2);
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final List<OrderGroupDto> getOrder_groups() {
            return this.order_groups;
        }

        public final Instant getInitiated_at() {
            return this.initiated_at;
        }

        public final AdvisorTradeStateDto getState() {
            return this.state;
        }

        public final MoneyDto getTotal_bought() {
            return this.total_bought;
        }

        public final MoneyDto getTotal_sold() {
            return this.total_sold;
        }
    }

    /* compiled from: AdvisorTradeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTradeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lyoda/service/dashboard/AdvisorTradeDto;", "Lyoda/service/dashboard/AdvisorTrade;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/AdvisorTradeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisorTradeDto, AdvisorTrade> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisorTradeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorTradeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorTradeDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisorTradeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisorTrade> getProtoAdapter() {
            return AdvisorTrade.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorTradeDto getZeroValue() {
            return AdvisorTradeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorTradeDto fromProto(AdvisorTrade proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            String account_number = proto.getAccount_number();
            List<OrderGroup> order_groups = proto.getOrder_groups();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_groups, 10));
            Iterator<T> it = order_groups.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderGroupDto.INSTANCE.fromProto((OrderGroup) it.next()));
            }
            Instant initiated_at = proto.getInitiated_at();
            AdvisorTradeStateDto advisorTradeStateDtoFromProto = AdvisorTradeStateDto.INSTANCE.fromProto(proto.getState());
            Money total_bought = proto.getTotal_bought();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = total_bought != null ? MoneyDto.INSTANCE.fromProto(total_bought) : null;
            Money total_sold = proto.getTotal_sold();
            return new AdvisorTradeDto(new Surrogate(id, account_number, arrayList, initiated_at, advisorTradeStateDtoFromProto, moneyDtoFromProto, total_sold != null ? MoneyDto.INSTANCE.fromProto(total_sold) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.AdvisorTradeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorTradeDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AdvisorTradeDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisorTradeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTradeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/AdvisorTradeDto;", "<init>", "()V", "surrogateSerializer", "Lyoda/service/dashboard/AdvisorTradeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisorTradeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/yoda.service.dashboard.AdvisorTrade", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisorTradeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisorTradeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisorTradeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisorTradeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lyoda/service/dashboard/AdvisorTradeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "yoda.service.dashboard.AdvisorTradeDto";
        }
    }
}
