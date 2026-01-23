package nimbus.service.p511v1;

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
import nimbus.service.p511v1.EquityPositionDto;
import nimbus.service.p511v1.PreSubmissionChecksRequestDto;
import nimbus.service.p511v1.TransferAccountInfoDto;

/* compiled from: PreSubmissionChecksRequestDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lnimbus/service/v1/PreSubmissionChecksRequest;", "Landroid/os/Parcelable;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;", "surrogate", "<init>", "(Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;)V", "Lnimbus/service/v1/TransferAccountInfoDto;", "source_account", "destination_account", "Lcom/robinhood/idl/IdlDecimal;", "cash_amount", "", "Lnimbus/service/v1/EquityPositionDto;", "equity_positions", "(Lnimbus/service/v1/TransferAccountInfoDto;Lnimbus/service/v1/TransferAccountInfoDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)V", "toProto", "()Lnimbus/service/v1/PreSubmissionChecksRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class PreSubmissionChecksRequestDto implements Dto3<PreSubmissionChecksRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PreSubmissionChecksRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PreSubmissionChecksRequestDto, PreSubmissionChecksRequest>> binaryBase64Serializer$delegate;
    private static final PreSubmissionChecksRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PreSubmissionChecksRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PreSubmissionChecksRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ PreSubmissionChecksRequestDto(TransferAccountInfoDto transferAccountInfoDto, TransferAccountInfoDto transferAccountInfoDto2, IdlDecimal idlDecimal, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transferAccountInfoDto, (i & 2) != 0 ? null : transferAccountInfoDto2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreSubmissionChecksRequestDto(TransferAccountInfoDto transferAccountInfoDto, TransferAccountInfoDto transferAccountInfoDto2, IdlDecimal cash_amount, List<EquityPositionDto> equity_positions) {
        this(new Surrogate(transferAccountInfoDto, transferAccountInfoDto2, cash_amount, equity_positions));
        Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
        Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
    }

    @Override // com.robinhood.idl.Dto
    public PreSubmissionChecksRequest toProto() {
        TransferAccountInfoDto source_account = this.surrogate.getSource_account();
        TransferAccountInfo proto = source_account != null ? source_account.toProto() : null;
        TransferAccountInfoDto destination_account = this.surrogate.getDestination_account();
        TransferAccountInfo proto2 = destination_account != null ? destination_account.toProto() : null;
        String stringValue = this.surrogate.getCash_amount().getStringValue();
        List<EquityPositionDto> equity_positions = this.surrogate.getEquity_positions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_positions, 10));
        Iterator<T> it = equity_positions.iterator();
        while (it.hasNext()) {
            arrayList.add(((EquityPositionDto) it.next()).toProto());
        }
        return new PreSubmissionChecksRequest(proto, proto2, stringValue, arrayList, null, 16, null);
    }

    public String toString() {
        return "[PreSubmissionChecksRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PreSubmissionChecksRequestDto) && Intrinsics.areEqual(((PreSubmissionChecksRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: PreSubmissionChecksRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265BH\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eBI\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103¨\u00067"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;", "", "Lnimbus/service/v1/TransferAccountInfoDto;", "source_account", "destination_account", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "cash_amount", "", "Lnimbus/service/v1/EquityPositionDto;", "equity_positions", "<init>", "(Lnimbus/service/v1/TransferAccountInfoDto;Lnimbus/service/v1/TransferAccountInfoDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILnimbus/service/v1/TransferAccountInfoDto;Lnimbus/service/v1/TransferAccountInfoDto;Lcom/robinhood/idl/IdlDecimal;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nimbus_v1_externalRelease", "(Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnimbus/service/v1/TransferAccountInfoDto;", "getSource_account", "()Lnimbus/service/v1/TransferAccountInfoDto;", "getSource_account$annotations", "()V", "getDestination_account", "getDestination_account$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getCash_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getCash_amount$annotations", "Ljava/util/List;", "getEquity_positions", "()Ljava/util/List;", "getEquity_positions$annotations", "Companion", "$serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final IdlDecimal cash_amount;
        private final TransferAccountInfoDto destination_account;
        private final List<EquityPositionDto> equity_positions;
        private final TransferAccountInfoDto source_account;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: nimbus.service.v1.PreSubmissionChecksRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreSubmissionChecksRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((TransferAccountInfoDto) null, (TransferAccountInfoDto) null, (IdlDecimal) null, (List) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(EquityPositionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.source_account, surrogate.source_account) && Intrinsics.areEqual(this.destination_account, surrogate.destination_account) && Intrinsics.areEqual(this.cash_amount, surrogate.cash_amount) && Intrinsics.areEqual(this.equity_positions, surrogate.equity_positions);
        }

        public int hashCode() {
            TransferAccountInfoDto transferAccountInfoDto = this.source_account;
            int iHashCode = (transferAccountInfoDto == null ? 0 : transferAccountInfoDto.hashCode()) * 31;
            TransferAccountInfoDto transferAccountInfoDto2 = this.destination_account;
            return ((((iHashCode + (transferAccountInfoDto2 != null ? transferAccountInfoDto2.hashCode() : 0)) * 31) + this.cash_amount.hashCode()) * 31) + this.equity_positions.hashCode();
        }

        public String toString() {
            return "Surrogate(source_account=" + this.source_account + ", destination_account=" + this.destination_account + ", cash_amount=" + this.cash_amount + ", equity_positions=" + this.equity_positions + ")";
        }

        /* compiled from: PreSubmissionChecksRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PreSubmissionChecksRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TransferAccountInfoDto transferAccountInfoDto, TransferAccountInfoDto transferAccountInfoDto2, IdlDecimal idlDecimal, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.source_account = null;
            } else {
                this.source_account = transferAccountInfoDto;
            }
            if ((i & 2) == 0) {
                this.destination_account = null;
            } else {
                this.destination_account = transferAccountInfoDto2;
            }
            if ((i & 4) == 0) {
                this.cash_amount = new IdlDecimal("");
            } else {
                this.cash_amount = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.equity_positions = CollectionsKt.emptyList();
            } else {
                this.equity_positions = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nimbus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            TransferAccountInfoDto transferAccountInfoDto = self.source_account;
            if (transferAccountInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TransferAccountInfoDto.Serializer.INSTANCE, transferAccountInfoDto);
            }
            TransferAccountInfoDto transferAccountInfoDto2 = self.destination_account;
            if (transferAccountInfoDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TransferAccountInfoDto.Serializer.INSTANCE, transferAccountInfoDto2);
            }
            if (!Intrinsics.areEqual(self.cash_amount, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.cash_amount);
            }
            if (Intrinsics.areEqual(self.equity_positions, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.equity_positions);
        }

        public Surrogate(TransferAccountInfoDto transferAccountInfoDto, TransferAccountInfoDto transferAccountInfoDto2, IdlDecimal cash_amount, List<EquityPositionDto> equity_positions) {
            Intrinsics.checkNotNullParameter(cash_amount, "cash_amount");
            Intrinsics.checkNotNullParameter(equity_positions, "equity_positions");
            this.source_account = transferAccountInfoDto;
            this.destination_account = transferAccountInfoDto2;
            this.cash_amount = cash_amount;
            this.equity_positions = equity_positions;
        }

        public final TransferAccountInfoDto getSource_account() {
            return this.source_account;
        }

        public final TransferAccountInfoDto getDestination_account() {
            return this.destination_account;
        }

        public final IdlDecimal getCash_amount() {
            return this.cash_amount;
        }

        public /* synthetic */ Surrogate(TransferAccountInfoDto transferAccountInfoDto, TransferAccountInfoDto transferAccountInfoDto2, IdlDecimal idlDecimal, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : transferAccountInfoDto, (i & 2) != 0 ? null : transferAccountInfoDto2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<EquityPositionDto> getEquity_positions() {
            return this.equity_positions;
        }
    }

    /* compiled from: PreSubmissionChecksRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "Lnimbus/service/v1/PreSubmissionChecksRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PreSubmissionChecksRequestDto, PreSubmissionChecksRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PreSubmissionChecksRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PreSubmissionChecksRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PreSubmissionChecksRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) PreSubmissionChecksRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PreSubmissionChecksRequest> getProtoAdapter() {
            return PreSubmissionChecksRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PreSubmissionChecksRequestDto getZeroValue() {
            return PreSubmissionChecksRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PreSubmissionChecksRequestDto fromProto(PreSubmissionChecksRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TransferAccountInfo source_account = proto.getSource_account();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TransferAccountInfoDto transferAccountInfoDtoFromProto = source_account != null ? TransferAccountInfoDto.INSTANCE.fromProto(source_account) : null;
            TransferAccountInfo destination_account = proto.getDestination_account();
            TransferAccountInfoDto transferAccountInfoDtoFromProto2 = destination_account != null ? TransferAccountInfoDto.INSTANCE.fromProto(destination_account) : null;
            IdlDecimal idlDecimal = new IdlDecimal(proto.getCash_amount());
            List<EquityPosition> equity_positions = proto.getEquity_positions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity_positions, 10));
            Iterator<T> it = equity_positions.iterator();
            while (it.hasNext()) {
                arrayList.add(EquityPositionDto.INSTANCE.fromProto((EquityPosition) it.next()));
            }
            return new PreSubmissionChecksRequestDto(new Surrogate(transferAccountInfoDtoFromProto, transferAccountInfoDtoFromProto2, idlDecimal, arrayList), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nimbus.service.v1.PreSubmissionChecksRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreSubmissionChecksRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new PreSubmissionChecksRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PreSubmissionChecksRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnimbus/service/v1/PreSubmissionChecksRequestDto;", "<init>", "()V", "surrogateSerializer", "Lnimbus/service/v1/PreSubmissionChecksRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Serializer implements KSerializer<PreSubmissionChecksRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nimbus.service.v1.PreSubmissionChecksRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PreSubmissionChecksRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PreSubmissionChecksRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PreSubmissionChecksRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PreSubmissionChecksRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnimbus/service/v1/PreSubmissionChecksRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "nimbus.service.v1.PreSubmissionChecksRequestDto";
        }
    }
}
