package advisory.proto.p008v1;

import advisory.proto.p008v1.AdvisoryFeeDataDto;
import advisory.proto.p008v1.AdvisoryFeeDto;
import advisory.proto.p008v1.FeeStateDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.WireInstantSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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

/* compiled from: AdvisoryFeeDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00045467B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BU\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00068"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryFee;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;)V", "", "id", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "transaction_time", "account_number", "Ladvisory/proto/v1/FeeStateDto;", "state", "", "Ladvisory/proto/v1/AdvisoryFeeDataDto;", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Ladvisory/proto/v1/FeeStateDto;Ljava/util/List;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryFee;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;", "getId", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getTransaction_time", "()Lj$/time/Instant;", "getAccount_number", "getState", "()Ladvisory/proto/v1/FeeStateDto;", "getData", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AdvisoryFeeDto implements Dto3<AdvisoryFee>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryFeeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryFeeDto, AdvisoryFee>> binaryBase64Serializer$delegate;
    private static final AdvisoryFeeDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryFeeDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryFeeDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final MoneyDto getAmount() {
        return this.surrogate.getAmount();
    }

    public final Instant getTransaction_time() {
        return this.surrogate.getTransaction_time();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final FeeStateDto getState() {
        return this.surrogate.getState();
    }

    public final List<AdvisoryFeeDataDto> getData() {
        return this.surrogate.getData();
    }

    public /* synthetic */ AdvisoryFeeDto(String str, MoneyDto moneyDto, Instant instant, String str2, FeeStateDto feeStateDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? FeeStateDto.INSTANCE.getZeroValue() : feeStateDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisoryFeeDto(String id, MoneyDto moneyDto, Instant instant, String account_number, FeeStateDto state, List<AdvisoryFeeDataDto> data) {
        this(new Surrogate(id, moneyDto, instant, account_number, state, data));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvisoryFee toProto() {
        String id = this.surrogate.getId();
        MoneyDto amount = this.surrogate.getAmount();
        Money proto = amount != null ? amount.toProto() : null;
        Instant transaction_time = this.surrogate.getTransaction_time();
        String account_number = this.surrogate.getAccount_number();
        FeeState feeState = (FeeState) this.surrogate.getState().toProto();
        List<AdvisoryFeeDataDto> data = this.surrogate.getData();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdvisoryFeeDataDto) it.next()).toProto());
        }
        return new AdvisoryFee(id, proto, transaction_time, account_number, feeState, arrayList, null, 64, null);
    }

    public String toString() {
        return "[AdvisoryFeeDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryFeeDto) && Intrinsics.areEqual(((AdvisoryFeeDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012.\b\u0002\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013B]\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100RF\u0010\u000b\u001a(\u0018\u00010\u0006j\u0013\u0018\u0001`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u0010-\u001a\u0004\b3\u00104R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010*\u0012\u0004\b7\u0010-\u001a\u0004\b6\u0010#R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010<\u0012\u0004\b?\u0010-\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;", "", "", "id", "Lcom/robinhood/rosetta/common/MoneyDto;", "amount", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/WireInstantSerializer;", "transaction_time", "account_number", "Ladvisory/proto/v1/FeeStateDto;", "state", "", "Ladvisory/proto/v1/AdvisoryFeeDataDto;", WebsocketGatewayConstants.DATA_KEY, "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Ladvisory/proto/v1/FeeStateDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/robinhood/rosetta/common/MoneyDto;Lj$/time/Instant;Ljava/lang/String;Ladvisory/proto/v1/FeeStateDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getAmount$annotations", "Lj$/time/Instant;", "getTransaction_time", "()Lj$/time/Instant;", "getTransaction_time$annotations", "getAccount_number", "getAccount_number$annotations", "Ladvisory/proto/v1/FeeStateDto;", "getState", "()Ladvisory/proto/v1/FeeStateDto;", "getState$annotations", "Ljava/util/List;", "getData", "()Ljava/util/List;", "getData$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_number;
        private final MoneyDto amount;
        private final List<AdvisoryFeeDataDto> data;
        private final String id;
        private final FeeStateDto state;
        private final Instant transaction_time;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.AdvisoryFeeDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryFeeDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((String) null, (MoneyDto) null, (Instant) null, (String) null, (FeeStateDto) null, (List) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AdvisoryFeeDataDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.transaction_time, surrogate.transaction_time) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.state == surrogate.state && Intrinsics.areEqual(this.data, surrogate.data);
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            MoneyDto moneyDto = this.amount;
            int iHashCode2 = (iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31;
            Instant instant = this.transaction_time;
            return ((((((iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 31) + this.account_number.hashCode()) * 31) + this.state.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", amount=" + this.amount + ", transaction_time=" + this.transaction_time + ", account_number=" + this.account_number + ", state=" + this.state + ", data=" + this.data + ")";
        }

        /* compiled from: AdvisoryFeeDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryFeeDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, Instant instant, String str2, FeeStateDto feeStateDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.amount = null;
            } else {
                this.amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.transaction_time = null;
            } else {
                this.transaction_time = instant;
            }
            if ((i & 8) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str2;
            }
            if ((i & 16) == 0) {
                this.state = FeeStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = feeStateDto;
            }
            if ((i & 32) == 0) {
                this.data = CollectionsKt.emptyList();
            } else {
                this.data = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            MoneyDto moneyDto = self.amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            Instant instant = self.transaction_time;
            if (instant != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, WireInstantSerializer.INSTANCE, instant);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_number);
            }
            if (self.state != FeeStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, FeeStateDto.Serializer.INSTANCE, self.state);
            }
            if (Intrinsics.areEqual(self.data, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.data);
        }

        public Surrogate(String id, MoneyDto moneyDto, Instant instant, String account_number, FeeStateDto state, List<AdvisoryFeeDataDto> data) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(data, "data");
            this.id = id;
            this.amount = moneyDto;
            this.transaction_time = instant;
            this.account_number = account_number;
            this.state = state;
            this.data = data;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, Instant instant, String str2, FeeStateDto feeStateDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? FeeStateDto.INSTANCE.getZeroValue() : feeStateDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final String getId() {
            return this.id;
        }

        public final MoneyDto getAmount() {
            return this.amount;
        }

        public final Instant getTransaction_time() {
            return this.transaction_time;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final FeeStateDto getState() {
            return this.state;
        }

        public final List<AdvisoryFeeDataDto> getData() {
            return this.data;
        }
    }

    /* compiled from: AdvisoryFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryFeeDto;", "Ladvisory/proto/v1/AdvisoryFee;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryFeeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryFeeDto, AdvisoryFee> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryFeeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryFeeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryFeeDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryFeeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryFee> getProtoAdapter() {
            return AdvisoryFee.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryFeeDto getZeroValue() {
            return AdvisoryFeeDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryFeeDto fromProto(AdvisoryFee proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            Money amount = proto.getAmount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = amount != null ? MoneyDto.INSTANCE.fromProto(amount) : null;
            Instant transaction_time = proto.getTransaction_time();
            String account_number = proto.getAccount_number();
            FeeStateDto feeStateDtoFromProto = FeeStateDto.INSTANCE.fromProto(proto.getState());
            List<AdvisoryFeeData> data = proto.getData();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(AdvisoryFeeDataDto.INSTANCE.fromProto((AdvisoryFeeData) it.next()));
            }
            return new AdvisoryFeeDto(new Surrogate(id, moneyDtoFromProto, transaction_time, account_number, feeStateDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryFeeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryFeeDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AdvisoryFeeDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryFeeDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryFeeDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryFeeDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisoryFeeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryFee", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryFeeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryFeeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryFeeDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryFeeDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryFeeDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryFeeDto";
        }
    }
}
