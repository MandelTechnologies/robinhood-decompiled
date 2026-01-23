package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractColumnDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractColumnTypeDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractElementDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ContractColumnDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0006\u0010\u0013JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\tH\u0016J\u0013\u0010!\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u00060"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumn;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Surrogate;)V", "name", "", "contract_column_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;", "associated_contract_ids", "", "contract_elements", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractElementDto;", "event_long_description", "has_no_contracts", "", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getContract_column_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;", "getAssociated_contract_ids", "()Ljava/util/List;", "getContract_elements", "getEvent_long_description", "getHas_no_contracts", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ContractColumnDto implements Dto3<ContractColumn>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractColumnDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractColumnDto, ContractColumn>> binaryBase64Serializer$delegate;
    private static final ContractColumnDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractColumnDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractColumnDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getName() {
        return this.surrogate.getName();
    }

    public final ContractColumnTypeDto getContract_column_type() {
        return this.surrogate.getContract_column_type();
    }

    public final List<String> getAssociated_contract_ids() {
        return this.surrogate.getAssociated_contract_ids();
    }

    public final List<ContractElementDto> getContract_elements() {
        return this.surrogate.getContract_elements();
    }

    public final String getEvent_long_description() {
        return this.surrogate.getEvent_long_description();
    }

    public final boolean getHas_no_contracts() {
        return this.surrogate.getHas_no_contracts();
    }

    public /* synthetic */ ContractColumnDto(String str, ContractColumnTypeDto contractColumnTypeDto, List list, List list2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ContractColumnTypeDto.INSTANCE.getZeroValue() : contractColumnTypeDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractColumnDto(String name, ContractColumnTypeDto contract_column_type, List<String> associated_contract_ids, List<ContractElementDto> contract_elements, String event_long_description, boolean z) {
        this(new Surrogate(name, contract_column_type, associated_contract_ids, contract_elements, event_long_description, z));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contract_column_type, "contract_column_type");
        Intrinsics.checkNotNullParameter(associated_contract_ids, "associated_contract_ids");
        Intrinsics.checkNotNullParameter(contract_elements, "contract_elements");
        Intrinsics.checkNotNullParameter(event_long_description, "event_long_description");
    }

    public static /* synthetic */ ContractColumnDto copy$default(ContractColumnDto contractColumnDto, String str, ContractColumnTypeDto contractColumnTypeDto, List list, List list2, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractColumnDto.surrogate.getName();
        }
        if ((i & 2) != 0) {
            contractColumnTypeDto = contractColumnDto.surrogate.getContract_column_type();
        }
        if ((i & 4) != 0) {
            list = contractColumnDto.surrogate.getAssociated_contract_ids();
        }
        if ((i & 8) != 0) {
            list2 = contractColumnDto.surrogate.getContract_elements();
        }
        if ((i & 16) != 0) {
            str2 = contractColumnDto.surrogate.getEvent_long_description();
        }
        if ((i & 32) != 0) {
            z = contractColumnDto.surrogate.getHas_no_contracts();
        }
        String str3 = str2;
        boolean z2 = z;
        return contractColumnDto.copy(str, contractColumnTypeDto, list, list2, str3, z2);
    }

    public final ContractColumnDto copy(String name, ContractColumnTypeDto contract_column_type, List<String> associated_contract_ids, List<ContractElementDto> contract_elements, String event_long_description, boolean has_no_contracts) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contract_column_type, "contract_column_type");
        Intrinsics.checkNotNullParameter(associated_contract_ids, "associated_contract_ids");
        Intrinsics.checkNotNullParameter(contract_elements, "contract_elements");
        Intrinsics.checkNotNullParameter(event_long_description, "event_long_description");
        return new ContractColumnDto(new Surrogate(name, contract_column_type, associated_contract_ids, contract_elements, event_long_description, has_no_contracts));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ContractColumn toProto() {
        String name = this.surrogate.getName();
        ContractColumnType contractColumnType = (ContractColumnType) this.surrogate.getContract_column_type().toProto();
        List<String> associated_contract_ids = this.surrogate.getAssociated_contract_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(associated_contract_ids, 10));
        Iterator<T> it = associated_contract_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List<ContractElementDto> contract_elements = this.surrogate.getContract_elements();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contract_elements, 10));
        Iterator<T> it2 = contract_elements.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ContractElementDto) it2.next()).toProto());
        }
        return new ContractColumn(name, contractColumnType, arrayList, arrayList2, this.surrogate.getEvent_long_description(), this.surrogate.getHas_no_contracts(), null, 64, null);
    }

    public String toString() {
        return "[ContractColumnDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractColumnDto) && Intrinsics.areEqual(((ContractColumnDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractColumnDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 92\u00020\u0001:\u000289BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003JQ\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0010HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J%\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010$¨\u0006:"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Surrogate;", "", "name", "", "contract_column_type", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;", "associated_contract_ids", "", "contract_elements", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractElementDto;", "event_long_description", "has_no_contracts", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getContract_column_type$annotations", "getContract_column_type", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnTypeDto;", "getAssociated_contract_ids$annotations", "getAssociated_contract_ids", "()Ljava/util/List;", "getContract_elements$annotations", "getContract_elements", "getEvent_long_description$annotations", "getEvent_long_description", "getHas_no_contracts$annotations", "getHas_no_contracts", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> associated_contract_ids;
        private final ContractColumnTypeDto contract_column_type;
        private final List<ContractElementDto> contract_elements;
        private final String event_long_description;
        private final boolean has_no_contracts;
        private final String name;

        public Surrogate() {
            this((String) null, (ContractColumnTypeDto) null, (List) null, (List) null, (String) null, false, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(ContractElementDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ContractColumnTypeDto contractColumnTypeDto, List list, List list2, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.name;
            }
            if ((i & 2) != 0) {
                contractColumnTypeDto = surrogate.contract_column_type;
            }
            if ((i & 4) != 0) {
                list = surrogate.associated_contract_ids;
            }
            if ((i & 8) != 0) {
                list2 = surrogate.contract_elements;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.event_long_description;
            }
            if ((i & 32) != 0) {
                z = surrogate.has_no_contracts;
            }
            String str3 = str2;
            boolean z2 = z;
            return surrogate.copy(str, contractColumnTypeDto, list, list2, str3, z2);
        }

        @SerialName("associatedContractIds")
        @JsonAnnotations2(names = {"associated_contract_ids"})
        public static /* synthetic */ void getAssociated_contract_ids$annotations() {
        }

        @SerialName("contractColumnType")
        @JsonAnnotations2(names = {"contract_column_type"})
        public static /* synthetic */ void getContract_column_type$annotations() {
        }

        @SerialName("contractElements")
        @JsonAnnotations2(names = {"contract_elements"})
        public static /* synthetic */ void getContract_elements$annotations() {
        }

        @SerialName("eventLongDescription")
        @JsonAnnotations2(names = {"event_long_description"})
        public static /* synthetic */ void getEvent_long_description$annotations() {
        }

        @SerialName("hasNoContracts")
        @JsonAnnotations2(names = {"has_no_contracts"})
        public static /* synthetic */ void getHas_no_contracts$annotations() {
        }

        @SerialName("name")
        @JsonAnnotations2(names = {"name"})
        public static /* synthetic */ void getName$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final ContractColumnTypeDto getContract_column_type() {
            return this.contract_column_type;
        }

        public final List<String> component3() {
            return this.associated_contract_ids;
        }

        public final List<ContractElementDto> component4() {
            return this.contract_elements;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEvent_long_description() {
            return this.event_long_description;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getHas_no_contracts() {
            return this.has_no_contracts;
        }

        public final Surrogate copy(String name, ContractColumnTypeDto contract_column_type, List<String> associated_contract_ids, List<ContractElementDto> contract_elements, String event_long_description, boolean has_no_contracts) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(contract_column_type, "contract_column_type");
            Intrinsics.checkNotNullParameter(associated_contract_ids, "associated_contract_ids");
            Intrinsics.checkNotNullParameter(contract_elements, "contract_elements");
            Intrinsics.checkNotNullParameter(event_long_description, "event_long_description");
            return new Surrogate(name, contract_column_type, associated_contract_ids, contract_elements, event_long_description, has_no_contracts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.name, surrogate.name) && this.contract_column_type == surrogate.contract_column_type && Intrinsics.areEqual(this.associated_contract_ids, surrogate.associated_contract_ids) && Intrinsics.areEqual(this.contract_elements, surrogate.contract_elements) && Intrinsics.areEqual(this.event_long_description, surrogate.event_long_description) && this.has_no_contracts == surrogate.has_no_contracts;
        }

        public int hashCode() {
            return (((((((((this.name.hashCode() * 31) + this.contract_column_type.hashCode()) * 31) + this.associated_contract_ids.hashCode()) * 31) + this.contract_elements.hashCode()) * 31) + this.event_long_description.hashCode()) * 31) + Boolean.hashCode(this.has_no_contracts);
        }

        public String toString() {
            return "Surrogate(name=" + this.name + ", contract_column_type=" + this.contract_column_type + ", associated_contract_ids=" + this.associated_contract_ids + ", contract_elements=" + this.contract_elements + ", event_long_description=" + this.event_long_description + ", has_no_contracts=" + this.has_no_contracts + ")";
        }

        /* compiled from: ContractColumnDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractColumnDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractColumnDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractColumnDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractColumnDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractColumnDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null};
        }

        public /* synthetic */ Surrogate(int i, String str, ContractColumnTypeDto contractColumnTypeDto, List list, List list2, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.name = "";
            } else {
                this.name = str;
            }
            if ((i & 2) == 0) {
                this.contract_column_type = ContractColumnTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contract_column_type = contractColumnTypeDto;
            }
            if ((i & 4) == 0) {
                this.associated_contract_ids = CollectionsKt.emptyList();
            } else {
                this.associated_contract_ids = list;
            }
            if ((i & 8) == 0) {
                this.contract_elements = CollectionsKt.emptyList();
            } else {
                this.contract_elements = list2;
            }
            if ((i & 16) == 0) {
                this.event_long_description = "";
            } else {
                this.event_long_description = str2;
            }
            if ((i & 32) == 0) {
                this.has_no_contracts = false;
            } else {
                this.has_no_contracts = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 0, self.name);
            }
            if (self.contract_column_type != ContractColumnTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, ContractColumnTypeDto.Serializer.INSTANCE, self.contract_column_type);
            }
            if (!Intrinsics.areEqual(self.associated_contract_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.associated_contract_ids);
            }
            if (!Intrinsics.areEqual(self.contract_elements, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.contract_elements);
            }
            if (!Intrinsics.areEqual(self.event_long_description, "")) {
                output.encodeStringElement(serialDesc, 4, self.event_long_description);
            }
            boolean z = self.has_no_contracts;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
        }

        public Surrogate(String name, ContractColumnTypeDto contract_column_type, List<String> associated_contract_ids, List<ContractElementDto> contract_elements, String event_long_description, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(contract_column_type, "contract_column_type");
            Intrinsics.checkNotNullParameter(associated_contract_ids, "associated_contract_ids");
            Intrinsics.checkNotNullParameter(contract_elements, "contract_elements");
            Intrinsics.checkNotNullParameter(event_long_description, "event_long_description");
            this.name = name;
            this.contract_column_type = contract_column_type;
            this.associated_contract_ids = associated_contract_ids;
            this.contract_elements = contract_elements;
            this.event_long_description = event_long_description;
            this.has_no_contracts = z;
        }

        public /* synthetic */ Surrogate(String str, ContractColumnTypeDto contractColumnTypeDto, List list, List list2, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ContractColumnTypeDto.INSTANCE.getZeroValue() : contractColumnTypeDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? false : z);
        }

        public final String getName() {
            return this.name;
        }

        public final ContractColumnTypeDto getContract_column_type() {
            return this.contract_column_type;
        }

        public final List<String> getAssociated_contract_ids() {
            return this.associated_contract_ids;
        }

        public final List<ContractElementDto> getContract_elements() {
            return this.contract_elements;
        }

        public final String getEvent_long_description() {
            return this.event_long_description;
        }

        public final boolean getHas_no_contracts() {
            return this.has_no_contracts;
        }
    }

    /* compiled from: ContractColumnDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumn;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ContractColumnDto, ContractColumn> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractColumnDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractColumnDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractColumnDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractColumnDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContractColumn> getProtoAdapter() {
            return ContractColumn.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractColumnDto getZeroValue() {
            return ContractColumnDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractColumnDto fromProto(ContractColumn proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String name = proto.getName();
            ContractColumnTypeDto contractColumnTypeDtoFromProto = ContractColumnTypeDto.INSTANCE.fromProto(proto.getContract_column_type());
            List<String> associated_contract_ids = proto.getAssociated_contract_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(associated_contract_ids, 10));
            Iterator<T> it = associated_contract_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            List<ContractElement> contract_elements = proto.getContract_elements();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(contract_elements, 10));
            Iterator<T> it2 = contract_elements.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ContractElementDto.INSTANCE.fromProto((ContractElement) it2.next()));
            }
            return new ContractColumnDto(new Surrogate(name, contractColumnTypeDtoFromProto, arrayList, arrayList2, proto.getEvent_long_description(), proto.getHas_no_contracts()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractColumnDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractColumnDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new ContractColumnDto(null, null, null, null, null, false, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractColumnDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContractColumnDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.ContractColumn", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractColumnDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractColumnDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractColumnDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractColumnDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractColumnDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.ContractColumnDto";
        }
    }
}
