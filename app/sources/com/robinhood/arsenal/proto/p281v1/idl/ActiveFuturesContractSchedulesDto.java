package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.arsenal.proto.p281v1.idl.ActiveFuturesContractScheduleDto;
import com.robinhood.arsenal.proto.p281v1.idl.ActiveFuturesContractSchedulesDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ActiveFuturesContractSchedulesDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0006\u0010\rJ \u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedules;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Surrogate;)V", "product_id", "", "active_futures_contract_schedules", "", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto;", "(Ljava/lang/String;Ljava/util/List;)V", "getProduct_id", "()Ljava/lang/String;", "getActive_futures_contract_schedules", "()Ljava/util/List;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ActiveFuturesContractSchedulesDto implements Dto3<ActiveFuturesContractSchedules>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActiveFuturesContractSchedulesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActiveFuturesContractSchedulesDto, ActiveFuturesContractSchedules>> binaryBase64Serializer$delegate;
    private static final ActiveFuturesContractSchedulesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActiveFuturesContractSchedulesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActiveFuturesContractSchedulesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getProduct_id() {
        return this.surrogate.getProduct_id();
    }

    public final List<ActiveFuturesContractScheduleDto> getActive_futures_contract_schedules() {
        return this.surrogate.getActive_futures_contract_schedules();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveFuturesContractSchedulesDto(String product_id, List<ActiveFuturesContractScheduleDto> active_futures_contract_schedules) {
        this(new Surrogate(product_id, active_futures_contract_schedules));
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(active_futures_contract_schedules, "active_futures_contract_schedules");
    }

    public /* synthetic */ ActiveFuturesContractSchedulesDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (List<ActiveFuturesContractScheduleDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActiveFuturesContractSchedulesDto copy$default(ActiveFuturesContractSchedulesDto activeFuturesContractSchedulesDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeFuturesContractSchedulesDto.surrogate.getProduct_id();
        }
        if ((i & 2) != 0) {
            list = activeFuturesContractSchedulesDto.surrogate.getActive_futures_contract_schedules();
        }
        return activeFuturesContractSchedulesDto.copy(str, list);
    }

    public final ActiveFuturesContractSchedulesDto copy(String product_id, List<ActiveFuturesContractScheduleDto> active_futures_contract_schedules) {
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        Intrinsics.checkNotNullParameter(active_futures_contract_schedules, "active_futures_contract_schedules");
        return new ActiveFuturesContractSchedulesDto(new Surrogate(product_id, active_futures_contract_schedules));
    }

    @Override // com.robinhood.idl.Dto
    public ActiveFuturesContractSchedules toProto() {
        String product_id = this.surrogate.getProduct_id();
        List<ActiveFuturesContractScheduleDto> active_futures_contract_schedules = this.surrogate.getActive_futures_contract_schedules();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(active_futures_contract_schedules, 10));
        Iterator<T> it = active_futures_contract_schedules.iterator();
        while (it.hasNext()) {
            arrayList.add(((ActiveFuturesContractScheduleDto) it.next()).toProto());
        }
        return new ActiveFuturesContractSchedules(product_id, arrayList, null, 4, null);
    }

    public String toString() {
        return "[ActiveFuturesContractSchedulesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActiveFuturesContractSchedulesDto) && Intrinsics.areEqual(((ActiveFuturesContractSchedulesDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActiveFuturesContractSchedulesDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Surrogate;", "", "product_id", "", "active_futures_contract_schedules", "", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getProduct_id$annotations", "()V", "getProduct_id", "()Ljava/lang/String;", "getActive_futures_contract_schedules$annotations", "getActive_futures_contract_schedules", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<ActiveFuturesContractScheduleDto> active_futures_contract_schedules;
        private final String product_id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.ActiveFuturesContractSchedulesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActiveFuturesContractSchedulesDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ActiveFuturesContractScheduleDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.product_id;
            }
            if ((i & 2) != 0) {
                list = surrogate.active_futures_contract_schedules;
            }
            return surrogate.copy(str, list);
        }

        @SerialName("activeFuturesContractSchedules")
        @JsonAnnotations2(names = {"active_futures_contract_schedules"})
        public static /* synthetic */ void getActive_futures_contract_schedules$annotations() {
        }

        @SerialName("productId")
        @JsonAnnotations2(names = {"product_id"})
        public static /* synthetic */ void getProduct_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getProduct_id() {
            return this.product_id;
        }

        public final List<ActiveFuturesContractScheduleDto> component2() {
            return this.active_futures_contract_schedules;
        }

        public final Surrogate copy(String product_id, List<ActiveFuturesContractScheduleDto> active_futures_contract_schedules) {
            Intrinsics.checkNotNullParameter(product_id, "product_id");
            Intrinsics.checkNotNullParameter(active_futures_contract_schedules, "active_futures_contract_schedules");
            return new Surrogate(product_id, active_futures_contract_schedules);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.product_id, surrogate.product_id) && Intrinsics.areEqual(this.active_futures_contract_schedules, surrogate.active_futures_contract_schedules);
        }

        public int hashCode() {
            return (this.product_id.hashCode() * 31) + this.active_futures_contract_schedules.hashCode();
        }

        public String toString() {
            return "Surrogate(product_id=" + this.product_id + ", active_futures_contract_schedules=" + this.active_futures_contract_schedules + ")";
        }

        /* compiled from: ActiveFuturesContractSchedulesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActiveFuturesContractSchedulesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.product_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.active_futures_contract_schedules = CollectionsKt.emptyList();
            } else {
                this.active_futures_contract_schedules = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.product_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.product_id);
            }
            if (Intrinsics.areEqual(self.active_futures_contract_schedules, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.active_futures_contract_schedules);
        }

        public Surrogate(String product_id, List<ActiveFuturesContractScheduleDto> active_futures_contract_schedules) {
            Intrinsics.checkNotNullParameter(product_id, "product_id");
            Intrinsics.checkNotNullParameter(active_futures_contract_schedules, "active_futures_contract_schedules");
            this.product_id = product_id;
            this.active_futures_contract_schedules = active_futures_contract_schedules;
        }

        public final String getProduct_id() {
            return this.product_id;
        }

        public /* synthetic */ Surrogate(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<ActiveFuturesContractScheduleDto> getActive_futures_contract_schedules() {
            return this.active_futures_contract_schedules;
        }
    }

    /* compiled from: ActiveFuturesContractSchedulesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedules;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ActiveFuturesContractSchedulesDto, ActiveFuturesContractSchedules> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActiveFuturesContractSchedulesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActiveFuturesContractSchedulesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActiveFuturesContractSchedulesDto> getBinaryBase64Serializer() {
            return (KSerializer) ActiveFuturesContractSchedulesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActiveFuturesContractSchedules> getProtoAdapter() {
            return ActiveFuturesContractSchedules.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActiveFuturesContractSchedulesDto getZeroValue() {
            return ActiveFuturesContractSchedulesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActiveFuturesContractSchedulesDto fromProto(ActiveFuturesContractSchedules proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String product_id = proto.getProduct_id();
            List<ActiveFuturesContractSchedule> active_futures_contract_schedules = proto.getActive_futures_contract_schedules();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(active_futures_contract_schedules, 10));
            Iterator<T> it = active_futures_contract_schedules.iterator();
            while (it.hasNext()) {
                arrayList.add(ActiveFuturesContractScheduleDto.INSTANCE.fromProto((ActiveFuturesContractSchedule) it.next()));
            }
            return new ActiveFuturesContractSchedulesDto(new Surrogate(product_id, arrayList), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.ActiveFuturesContractSchedulesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActiveFuturesContractSchedulesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ActiveFuturesContractSchedulesDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActiveFuturesContractSchedulesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ActiveFuturesContractSchedulesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.ActiveFuturesContractSchedules", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActiveFuturesContractSchedulesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActiveFuturesContractSchedulesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActiveFuturesContractSchedulesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: ActiveFuturesContractSchedulesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedulesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.ActiveFuturesContractSchedulesDto";
        }
    }
}
