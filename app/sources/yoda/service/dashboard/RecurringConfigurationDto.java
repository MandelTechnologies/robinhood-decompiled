package yoda.service.dashboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import yoda.service.dashboard.DepositInfoDto;
import yoda.service.dashboard.ProjectionFrequencyDto;
import yoda.service.dashboard.RecurringConfigurationDto;

/* compiled from: RecurringConfigurationDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfigurationDto;", "Lcom/robinhood/idl/MessageDto;", "Lyoda/service/dashboard/RecurringConfiguration;", "Landroid/os/Parcelable;", "Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;", "surrogate", "<init>", "(Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;)V", "Lyoda/service/dashboard/ProjectionFrequencyDto;", "deposit_frequency", "", "Lyoda/service/dashboard/DepositInfoDto;", "deposits", "(Lyoda/service/dashboard/ProjectionFrequencyDto;Ljava/util/List;)V", "toProto", "()Lyoda/service/dashboard/RecurringConfiguration;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;", "getDeposit_frequency", "()Lyoda/service/dashboard/ProjectionFrequencyDto;", "getDeposits", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class RecurringConfigurationDto implements Dto3<RecurringConfiguration>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RecurringConfigurationDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RecurringConfigurationDto, RecurringConfiguration>> binaryBase64Serializer$delegate;
    private static final RecurringConfigurationDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RecurringConfigurationDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RecurringConfigurationDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ProjectionFrequencyDto getDeposit_frequency() {
        return this.surrogate.getDeposit_frequency();
    }

    public final List<DepositInfoDto> getDeposits() {
        return this.surrogate.getDeposits();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecurringConfigurationDto(ProjectionFrequencyDto deposit_frequency, List<DepositInfoDto> deposits) {
        this(new Surrogate(deposit_frequency, deposits));
        Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
        Intrinsics.checkNotNullParameter(deposits, "deposits");
    }

    public /* synthetic */ RecurringConfigurationDto(ProjectionFrequencyDto projectionFrequencyDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProjectionFrequencyDto.INSTANCE.getZeroValue() : projectionFrequencyDto, (List<DepositInfoDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RecurringConfiguration toProto() {
        ProjectionFrequency projectionFrequency = (ProjectionFrequency) this.surrogate.getDeposit_frequency().toProto();
        List<DepositInfoDto> deposits = this.surrogate.getDeposits();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(deposits, 10));
        Iterator<T> it = deposits.iterator();
        while (it.hasNext()) {
            arrayList.add(((DepositInfoDto) it.next()).toProto());
        }
        return new RecurringConfiguration(projectionFrequency, arrayList, null, 4, null);
    }

    public String toString() {
        return "[RecurringConfigurationDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RecurringConfigurationDto) && Intrinsics.areEqual(((RecurringConfigurationDto) other).surrogate, this.surrogate);
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
    /* compiled from: RecurringConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;", "", "Lyoda/service/dashboard/ProjectionFrequencyDto;", "deposit_frequency", "", "Lyoda/service/dashboard/DepositInfoDto;", "deposits", "<init>", "(Lyoda/service/dashboard/ProjectionFrequencyDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILyoda/service/dashboard/ProjectionFrequencyDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$yoda_v1_dashboard_externalRelease", "(Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lyoda/service/dashboard/ProjectionFrequencyDto;", "getDeposit_frequency", "()Lyoda/service/dashboard/ProjectionFrequencyDto;", "getDeposit_frequency$annotations", "()V", "Ljava/util/List;", "getDeposits", "()Ljava/util/List;", "getDeposits$annotations", "Companion", "$serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final ProjectionFrequencyDto deposit_frequency;
        private final List<DepositInfoDto> deposits;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: yoda.service.dashboard.RecurringConfigurationDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringConfigurationDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ProjectionFrequencyDto) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(DepositInfoDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.deposit_frequency == surrogate.deposit_frequency && Intrinsics.areEqual(this.deposits, surrogate.deposits);
        }

        public int hashCode() {
            return (this.deposit_frequency.hashCode() * 31) + this.deposits.hashCode();
        }

        public String toString() {
            return "Surrogate(deposit_frequency=" + this.deposit_frequency + ", deposits=" + this.deposits + ")";
        }

        /* compiled from: RecurringConfigurationDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RecurringConfigurationDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ProjectionFrequencyDto projectionFrequencyDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.deposit_frequency = (i & 1) == 0 ? ProjectionFrequencyDto.INSTANCE.getZeroValue() : projectionFrequencyDto;
            if ((i & 2) == 0) {
                this.deposits = CollectionsKt.emptyList();
            } else {
                this.deposits = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$yoda_v1_dashboard_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.deposit_frequency != ProjectionFrequencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ProjectionFrequencyDto.Serializer.INSTANCE, self.deposit_frequency);
            }
            if (Intrinsics.areEqual(self.deposits, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.deposits);
        }

        public Surrogate(ProjectionFrequencyDto deposit_frequency, List<DepositInfoDto> deposits) {
            Intrinsics.checkNotNullParameter(deposit_frequency, "deposit_frequency");
            Intrinsics.checkNotNullParameter(deposits, "deposits");
            this.deposit_frequency = deposit_frequency;
            this.deposits = deposits;
        }

        public final ProjectionFrequencyDto getDeposit_frequency() {
            return this.deposit_frequency;
        }

        public /* synthetic */ Surrogate(ProjectionFrequencyDto projectionFrequencyDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ProjectionFrequencyDto.INSTANCE.getZeroValue() : projectionFrequencyDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<DepositInfoDto> getDeposits() {
            return this.deposits;
        }
    }

    /* compiled from: RecurringConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfigurationDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lyoda/service/dashboard/RecurringConfigurationDto;", "Lyoda/service/dashboard/RecurringConfiguration;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/RecurringConfigurationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RecurringConfigurationDto, RecurringConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecurringConfigurationDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecurringConfigurationDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecurringConfigurationDto> getBinaryBase64Serializer() {
            return (KSerializer) RecurringConfigurationDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RecurringConfiguration> getProtoAdapter() {
            return RecurringConfiguration.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecurringConfigurationDto getZeroValue() {
            return RecurringConfigurationDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecurringConfigurationDto fromProto(RecurringConfiguration proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ProjectionFrequencyDto projectionFrequencyDtoFromProto = ProjectionFrequencyDto.INSTANCE.fromProto(proto.getDeposit_frequency());
            List<DepositInfo> deposits = proto.getDeposits();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(deposits, 10));
            Iterator<T> it = deposits.iterator();
            while (it.hasNext()) {
                arrayList.add(DepositInfoDto.INSTANCE.fromProto((DepositInfo) it.next()));
            }
            return new RecurringConfigurationDto(new Surrogate(projectionFrequencyDtoFromProto, arrayList), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.RecurringConfigurationDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringConfigurationDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new RecurringConfigurationDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RecurringConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfigurationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/RecurringConfigurationDto;", "<init>", "()V", "surrogateSerializer", "Lyoda/service/dashboard/RecurringConfigurationDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RecurringConfigurationDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/yoda.service.dashboard.RecurringConfiguration", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RecurringConfigurationDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RecurringConfigurationDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RecurringConfigurationDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: RecurringConfigurationDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lyoda/service/dashboard/RecurringConfigurationDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "yoda.service.dashboard.RecurringConfigurationDto";
        }
    }
}
