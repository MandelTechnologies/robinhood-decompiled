package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractGroupDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.ContractGroupSectionDto;
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

/* compiled from: ContractGroupSectionDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSection;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Surrogate;)V", "title", "", "event_long_descriptions", "", "event_long_description_titles", "filter_set", "contract_group", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;)V", "getTitle", "()Ljava/lang/String;", "getEvent_long_descriptions", "()Ljava/util/List;", "getEvent_long_description_titles", "getFilter_set", "getContract_group", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class ContractGroupSectionDto implements Dto3<ContractGroupSection>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ContractGroupSectionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ContractGroupSectionDto, ContractGroupSection>> binaryBase64Serializer$delegate;
    private static final ContractGroupSectionDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ContractGroupSectionDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ContractGroupSectionDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<String> getEvent_long_descriptions() {
        return this.surrogate.getEvent_long_descriptions();
    }

    public final List<String> getEvent_long_description_titles() {
        return this.surrogate.getEvent_long_description_titles();
    }

    public final List<String> getFilter_set() {
        return this.surrogate.getFilter_set();
    }

    public final ContractGroupDto getContract_group() {
        return this.surrogate.getContract_group();
    }

    public /* synthetic */ ContractGroupSectionDto(String str, List list, List list2, List list3, ContractGroupDto contractGroupDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? null : contractGroupDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContractGroupSectionDto(String title, List<String> event_long_descriptions, List<String> event_long_description_titles, List<String> filter_set, ContractGroupDto contractGroupDto) {
        this(new Surrogate(title, event_long_descriptions, event_long_description_titles, filter_set, contractGroupDto));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(event_long_descriptions, "event_long_descriptions");
        Intrinsics.checkNotNullParameter(event_long_description_titles, "event_long_description_titles");
        Intrinsics.checkNotNullParameter(filter_set, "filter_set");
    }

    public static /* synthetic */ ContractGroupSectionDto copy$default(ContractGroupSectionDto contractGroupSectionDto, String str, List list, List list2, List list3, ContractGroupDto contractGroupDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractGroupSectionDto.surrogate.getTitle();
        }
        if ((i & 2) != 0) {
            list = contractGroupSectionDto.surrogate.getEvent_long_descriptions();
        }
        if ((i & 4) != 0) {
            list2 = contractGroupSectionDto.surrogate.getEvent_long_description_titles();
        }
        if ((i & 8) != 0) {
            list3 = contractGroupSectionDto.surrogate.getFilter_set();
        }
        if ((i & 16) != 0) {
            contractGroupDto = contractGroupSectionDto.surrogate.getContract_group();
        }
        ContractGroupDto contractGroupDto2 = contractGroupDto;
        List list4 = list2;
        return contractGroupSectionDto.copy(str, list, list4, list3, contractGroupDto2);
    }

    public final ContractGroupSectionDto copy(String title, List<String> event_long_descriptions, List<String> event_long_description_titles, List<String> filter_set, ContractGroupDto contract_group) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(event_long_descriptions, "event_long_descriptions");
        Intrinsics.checkNotNullParameter(event_long_description_titles, "event_long_description_titles");
        Intrinsics.checkNotNullParameter(filter_set, "filter_set");
        return new ContractGroupSectionDto(new Surrogate(title, event_long_descriptions, event_long_description_titles, filter_set, contract_group));
    }

    @Override // com.robinhood.idl.Dto
    public ContractGroupSection toProto() {
        String title = this.surrogate.getTitle();
        List<String> event_long_descriptions = this.surrogate.getEvent_long_descriptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_long_descriptions, 10));
        Iterator<T> it = event_long_descriptions.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        List<String> event_long_description_titles = this.surrogate.getEvent_long_description_titles();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_long_description_titles, 10));
        Iterator<T> it2 = event_long_description_titles.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        List<String> filter_set = this.surrogate.getFilter_set();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filter_set, 10));
        Iterator<T> it3 = filter_set.iterator();
        while (it3.hasNext()) {
            arrayList3.add((String) it3.next());
        }
        ContractGroupDto contract_group = this.surrogate.getContract_group();
        return new ContractGroupSection(title, arrayList, arrayList2, arrayList3, contract_group != null ? contract_group.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[ContractGroupSectionDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ContractGroupSectionDto) && Intrinsics.areEqual(((ContractGroupSectionDto) other).surrogate, this.surrogate);
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
    /* compiled from: ContractGroupSectionDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB_\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\rHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0017R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001e¨\u00064"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Surrogate;", "", "title", "", "event_long_descriptions", "", "event_long_description_titles", "filter_set", "contract_group", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getEvent_long_descriptions$annotations", "getEvent_long_descriptions", "()Ljava/util/List;", "getEvent_long_description_titles$annotations", "getEvent_long_description_titles", "getFilter_set$annotations", "getFilter_set", "getContract_group$annotations", "getContract_group", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ContractGroupDto contract_group;
        private final List<String> event_long_description_titles;
        private final List<String> event_long_descriptions;
        private final List<String> filter_set;
        private final String title;

        public Surrogate() {
            this((String) null, (List) null, (List) null, (List) null, (ContractGroupDto) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, List list2, List list3, ContractGroupDto contractGroupDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.title;
            }
            if ((i & 2) != 0) {
                list = surrogate.event_long_descriptions;
            }
            if ((i & 4) != 0) {
                list2 = surrogate.event_long_description_titles;
            }
            if ((i & 8) != 0) {
                list3 = surrogate.filter_set;
            }
            if ((i & 16) != 0) {
                contractGroupDto = surrogate.contract_group;
            }
            ContractGroupDto contractGroupDto2 = contractGroupDto;
            List list4 = list2;
            return surrogate.copy(str, list, list4, list3, contractGroupDto2);
        }

        @SerialName("contractGroup")
        @JsonAnnotations2(names = {"contract_group"})
        public static /* synthetic */ void getContract_group$annotations() {
        }

        @SerialName("eventLongDescriptionTitles")
        @JsonAnnotations2(names = {"event_long_description_titles"})
        public static /* synthetic */ void getEvent_long_description_titles$annotations() {
        }

        @SerialName("eventLongDescriptions")
        @JsonAnnotations2(names = {"event_long_descriptions"})
        public static /* synthetic */ void getEvent_long_descriptions$annotations() {
        }

        @SerialName("filterSet")
        @JsonAnnotations2(names = {"filter_set"})
        public static /* synthetic */ void getFilter_set$annotations() {
        }

        @SerialName("title")
        @JsonAnnotations2(names = {"title"})
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<String> component2() {
            return this.event_long_descriptions;
        }

        public final List<String> component3() {
            return this.event_long_description_titles;
        }

        public final List<String> component4() {
            return this.filter_set;
        }

        /* renamed from: component5, reason: from getter */
        public final ContractGroupDto getContract_group() {
            return this.contract_group;
        }

        public final Surrogate copy(String title, List<String> event_long_descriptions, List<String> event_long_description_titles, List<String> filter_set, ContractGroupDto contract_group) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(event_long_descriptions, "event_long_descriptions");
            Intrinsics.checkNotNullParameter(event_long_description_titles, "event_long_description_titles");
            Intrinsics.checkNotNullParameter(filter_set, "filter_set");
            return new Surrogate(title, event_long_descriptions, event_long_description_titles, filter_set, contract_group);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.event_long_descriptions, surrogate.event_long_descriptions) && Intrinsics.areEqual(this.event_long_description_titles, surrogate.event_long_description_titles) && Intrinsics.areEqual(this.filter_set, surrogate.filter_set) && Intrinsics.areEqual(this.contract_group, surrogate.contract_group);
        }

        public int hashCode() {
            int iHashCode = ((((((this.title.hashCode() * 31) + this.event_long_descriptions.hashCode()) * 31) + this.event_long_description_titles.hashCode()) * 31) + this.filter_set.hashCode()) * 31;
            ContractGroupDto contractGroupDto = this.contract_group;
            return iHashCode + (contractGroupDto == null ? 0 : contractGroupDto.hashCode());
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", event_long_descriptions=" + this.event_long_descriptions + ", event_long_description_titles=" + this.event_long_description_titles + ", filter_set=" + this.filter_set + ", contract_group=" + this.contract_group + ")";
        }

        /* compiled from: ContractGroupSectionDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ContractGroupSectionDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSectionDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractGroupSectionDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSectionDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractGroupSectionDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSectionDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContractGroupSectionDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, List list2, List list3, ContractGroupDto contractGroupDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.event_long_descriptions = CollectionsKt.emptyList();
            } else {
                this.event_long_descriptions = list;
            }
            if ((i & 4) == 0) {
                this.event_long_description_titles = CollectionsKt.emptyList();
            } else {
                this.event_long_description_titles = list2;
            }
            if ((i & 8) == 0) {
                this.filter_set = CollectionsKt.emptyList();
            } else {
                this.filter_set = list3;
            }
            if ((i & 16) == 0) {
                this.contract_group = null;
            } else {
                this.contract_group = contractGroupDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.event_long_descriptions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.event_long_descriptions);
            }
            if (!Intrinsics.areEqual(self.event_long_description_titles, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.event_long_description_titles);
            }
            if (!Intrinsics.areEqual(self.filter_set, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.filter_set);
            }
            ContractGroupDto contractGroupDto = self.contract_group;
            if (contractGroupDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ContractGroupDto.Serializer.INSTANCE, contractGroupDto);
            }
        }

        public Surrogate(String title, List<String> event_long_descriptions, List<String> event_long_description_titles, List<String> filter_set, ContractGroupDto contractGroupDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(event_long_descriptions, "event_long_descriptions");
            Intrinsics.checkNotNullParameter(event_long_description_titles, "event_long_description_titles");
            Intrinsics.checkNotNullParameter(filter_set, "filter_set");
            this.title = title;
            this.event_long_descriptions = event_long_descriptions;
            this.event_long_description_titles = event_long_description_titles;
            this.filter_set = filter_set;
            this.contract_group = contractGroupDto;
        }

        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ Surrogate(String str, List list, List list2, List list3, ContractGroupDto contractGroupDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? null : contractGroupDto);
        }

        public final List<String> getEvent_long_descriptions() {
            return this.event_long_descriptions;
        }

        public final List<String> getEvent_long_description_titles() {
            return this.event_long_description_titles;
        }

        public final List<String> getFilter_set() {
            return this.filter_set;
        }

        public final ContractGroupDto getContract_group() {
            return this.contract_group;
        }
    }

    /* compiled from: ContractGroupSectionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ContractGroupSectionDto, ContractGroupSection> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ContractGroupSectionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractGroupSectionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ContractGroupSectionDto> getBinaryBase64Serializer() {
            return (KSerializer) ContractGroupSectionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ContractGroupSection> getProtoAdapter() {
            return ContractGroupSection.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractGroupSectionDto getZeroValue() {
            return ContractGroupSectionDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ContractGroupSectionDto fromProto(ContractGroupSection proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            List<String> event_long_descriptions = proto.getEvent_long_descriptions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_long_descriptions, 10));
            Iterator<T> it = event_long_descriptions.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            List<String> event_long_description_titles = proto.getEvent_long_description_titles();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(event_long_description_titles, 10));
            Iterator<T> it2 = event_long_description_titles.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            List<String> filter_set = proto.getFilter_set();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filter_set, 10));
            Iterator<T> it3 = filter_set.iterator();
            while (it3.hasNext()) {
                arrayList3.add((String) it3.next());
            }
            ContractGroup contract_group = proto.getContract_group();
            return new ContractGroupSectionDto(new Surrogate(title, arrayList, arrayList2, arrayList3, contract_group != null ? ContractGroupDto.INSTANCE.fromProto(contract_group) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSectionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ContractGroupSectionDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new ContractGroupSectionDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ContractGroupSectionDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ContractGroupSectionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.ContractGroupSection", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ContractGroupSectionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ContractGroupSectionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ContractGroupSectionDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ContractGroupSectionDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/ContractGroupSectionDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.ContractGroupSectionDto";
        }
    }
}
