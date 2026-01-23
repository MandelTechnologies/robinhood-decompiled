package bff_money_movement.service.p019v1;

import accio.service.p003v1.Provider;
import accio.service.p003v1.ProviderDto;
import accio.service.p003v1.Purpose;
import accio.service.p003v1.PurposeDto;
import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.PlaidPrepareLinkDetailsDto;
import bff_money_movement.service.p019v1.PrepareLinkRequestDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PrepareLinkRequestDto.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005*)+,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006."}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/PrepareLinkRequest;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;)V", "Laccio/service/v1/ProviderDto;", "provider", "", "Laccio/service/v1/PurposeDto;", "purposes", "", "", "metadata", "", "is_update_mode", "institution_id", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto;", ErrorBundle.DETAIL_ENTRY, "(Laccio/service/v1/ProviderDto;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto;)V", "toProto", "()Lbff_money_movement/service/v1/PrepareLinkRequest;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;", "Companion", "Surrogate", "DetailsDto", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class PrepareLinkRequestDto implements Dto3<PrepareLinkRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PrepareLinkRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PrepareLinkRequestDto, PrepareLinkRequest>> binaryBase64Serializer$delegate;
    private static final PrepareLinkRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PrepareLinkRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PrepareLinkRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ PrepareLinkRequestDto(ProviderDto providerDto, List list, Map map, boolean z, String str, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProviderDto.INSTANCE.getZeroValue() : providerDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : detailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrepareLinkRequestDto(ProviderDto provider, List<? extends PurposeDto> purposes, Map<String, String> metadata, boolean z, String institution_id, DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        DetailsDto.PlaidDetails plaidDetails = detailsDto instanceof DetailsDto.PlaidDetails ? (DetailsDto.PlaidDetails) detailsDto : null;
        this(new Surrogate(provider, purposes, metadata, z, institution_id, plaidDetails != null ? plaidDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PrepareLinkRequest toProto() {
        Provider provider = (Provider) this.surrogate.getProvider().toProto();
        List<PurposeDto> purposes = this.surrogate.getPurposes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
        Iterator<T> it = purposes.iterator();
        while (it.hasNext()) {
            arrayList.add((Purpose) ((PurposeDto) it.next()).toProto());
        }
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getMetadata().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        boolean is_update_mode = this.surrogate.getIs_update_mode();
        String institution_id = this.surrogate.getInstitution_id();
        PlaidPrepareLinkDetailsDto plaid_details = this.surrogate.getPlaid_details();
        return new PrepareLinkRequest(provider, arrayList, linkedHashMap, is_update_mode, institution_id, plaid_details != null ? plaid_details.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[PrepareLinkRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PrepareLinkRequestDto) && Intrinsics.areEqual(((PrepareLinkRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: PrepareLinkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0083\b\u0018\u0000 =2\u00020\u0001:\u0002>=BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b5\u0010*\u001a\u0004\b\u000b\u00104R \u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00106\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;", "", "Laccio/service/v1/ProviderDto;", "provider", "", "Laccio/service/v1/PurposeDto;", "purposes", "", "", "metadata", "", "is_update_mode", "institution_id", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "plaid_details", "<init>", "(Laccio/service/v1/ProviderDto;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILaccio/service/v1/ProviderDto;Ljava/util/List;Ljava/util/Map;ZLjava/lang/String;Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Laccio/service/v1/ProviderDto;", "getProvider", "()Laccio/service/v1/ProviderDto;", "getProvider$annotations", "()V", "Ljava/util/List;", "getPurposes", "()Ljava/util/List;", "getPurposes$annotations", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "getMetadata$annotations", "Z", "()Z", "is_update_mode$annotations", "Ljava/lang/String;", "getInstitution_id", "getInstitution_id$annotations", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "getPlaid_details", "()Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "getPlaid_details$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String institution_id;
        private final boolean is_update_mode;
        private final Map<String, String> metadata;
        private final PlaidPrepareLinkDetailsDto plaid_details;
        private final ProviderDto provider;
        private final List<PurposeDto> purposes;

        public Surrogate() {
            this((ProviderDto) null, (List) null, (Map) null, false, (String) null, (PlaidPrepareLinkDetailsDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(PurposeDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.provider == surrogate.provider && Intrinsics.areEqual(this.purposes, surrogate.purposes) && Intrinsics.areEqual(this.metadata, surrogate.metadata) && this.is_update_mode == surrogate.is_update_mode && Intrinsics.areEqual(this.institution_id, surrogate.institution_id) && Intrinsics.areEqual(this.plaid_details, surrogate.plaid_details);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.provider.hashCode() * 31) + this.purposes.hashCode()) * 31) + this.metadata.hashCode()) * 31) + Boolean.hashCode(this.is_update_mode)) * 31) + this.institution_id.hashCode()) * 31;
            PlaidPrepareLinkDetailsDto plaidPrepareLinkDetailsDto = this.plaid_details;
            return iHashCode + (plaidPrepareLinkDetailsDto == null ? 0 : plaidPrepareLinkDetailsDto.hashCode());
        }

        public String toString() {
            return "Surrogate(provider=" + this.provider + ", purposes=" + this.purposes + ", metadata=" + this.metadata + ", is_update_mode=" + this.is_update_mode + ", institution_id=" + this.institution_id + ", plaid_details=" + this.plaid_details + ")";
        }

        /* compiled from: PrepareLinkRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PrepareLinkRequestDto3.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.PrepareLinkRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PrepareLinkRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_money_movement.service.v1.PrepareLinkRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PrepareLinkRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null};
        }

        public /* synthetic */ Surrogate(int i, ProviderDto providerDto, List list, Map map, boolean z, String str, PlaidPrepareLinkDetailsDto plaidPrepareLinkDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.provider = (i & 1) == 0 ? ProviderDto.INSTANCE.getZeroValue() : providerDto;
            if ((i & 2) == 0) {
                this.purposes = CollectionsKt.emptyList();
            } else {
                this.purposes = list;
            }
            if ((i & 4) == 0) {
                this.metadata = MapsKt.emptyMap();
            } else {
                this.metadata = map;
            }
            if ((i & 8) == 0) {
                this.is_update_mode = false;
            } else {
                this.is_update_mode = z;
            }
            if ((i & 16) == 0) {
                this.institution_id = "";
            } else {
                this.institution_id = str;
            }
            if ((i & 32) == 0) {
                this.plaid_details = null;
            } else {
                this.plaid_details = plaidPrepareLinkDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (self.provider != ProviderDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ProviderDto.Serializer.INSTANCE, self.provider);
            }
            if (!Intrinsics.areEqual(self.purposes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.purposes);
            }
            if (!Intrinsics.areEqual(self.metadata, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.metadata);
            }
            boolean z = self.is_update_mode;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            if (!Intrinsics.areEqual(self.institution_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.institution_id);
            }
            PlaidPrepareLinkDetailsDto plaidPrepareLinkDetailsDto = self.plaid_details;
            if (plaidPrepareLinkDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, PlaidPrepareLinkDetailsDto.Serializer.INSTANCE, plaidPrepareLinkDetailsDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(ProviderDto provider, List<? extends PurposeDto> purposes, Map<String, String> metadata, boolean z, String institution_id, PlaidPrepareLinkDetailsDto plaidPrepareLinkDetailsDto) {
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(purposes, "purposes");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            this.provider = provider;
            this.purposes = purposes;
            this.metadata = metadata;
            this.is_update_mode = z;
            this.institution_id = institution_id;
            this.plaid_details = plaidPrepareLinkDetailsDto;
        }

        public final ProviderDto getProvider() {
            return this.provider;
        }

        public /* synthetic */ Surrogate(ProviderDto providerDto, List list, Map map, boolean z, String str, PlaidPrepareLinkDetailsDto plaidPrepareLinkDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ProviderDto.INSTANCE.getZeroValue() : providerDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : plaidPrepareLinkDetailsDto);
        }

        public final List<PurposeDto> getPurposes() {
            return this.purposes;
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        /* renamed from: is_update_mode, reason: from getter */
        public final boolean getIs_update_mode() {
            return this.is_update_mode;
        }

        public final String getInstitution_id() {
            return this.institution_id;
        }

        public final PlaidPrepareLinkDetailsDto getPlaid_details() {
            return this.plaid_details;
        }
    }

    /* compiled from: PrepareLinkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto;", "Lbff_money_movement/service/v1/PrepareLinkRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/PrepareLinkRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PrepareLinkRequestDto, PrepareLinkRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PrepareLinkRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PrepareLinkRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PrepareLinkRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) PrepareLinkRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PrepareLinkRequest> getProtoAdapter() {
            return PrepareLinkRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PrepareLinkRequestDto getZeroValue() {
            return PrepareLinkRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PrepareLinkRequestDto fromProto(PrepareLinkRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ProviderDto providerDtoFromProto = ProviderDto.INSTANCE.fromProto(proto.getProvider());
            List<Purpose> purposes = proto.getPurposes();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(purposes, 10));
            Iterator<T> it = purposes.iterator();
            while (it.hasNext()) {
                arrayList.add(PurposeDto.INSTANCE.fromProto((Purpose) it.next()));
            }
            Set<Map.Entry<String, String>> setEntrySet = proto.getMetadata().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            boolean zIs_update_mode = proto.getIs_update_mode();
            String institution_id = proto.getInstitution_id();
            PlaidPrepareLinkDetails plaid_details = proto.getPlaid_details();
            return new PrepareLinkRequestDto(new Surrogate(providerDtoFromProto, arrayList, linkedHashMap, zIs_update_mode, institution_id, plaid_details != null ? PlaidPrepareLinkDetailsDto.INSTANCE.fromProto(plaid_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.PrepareLinkRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrepareLinkRequestDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new PrepareLinkRequestDto(null, null, null, false, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PrepareLinkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "PlaidDetails", "Companion", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto$PlaidDetails;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: PrepareLinkRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto$PlaidDetails;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto;", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "value", "<init>", "(Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "getValue", "()Lbff_money_movement/service/v1/PlaidPrepareLinkDetailsDto;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PlaidDetails extends DetailsDto {
            private final PlaidPrepareLinkDetailsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PlaidDetails) && Intrinsics.areEqual(this.value, ((PlaidDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PlaidDetails(value=" + this.value + ")";
            }

            public final PlaidPrepareLinkDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlaidDetails(PlaidPrepareLinkDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: PrepareLinkRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$DetailsDto;", "Lbff_money_movement/service/v1/PrepareLinkRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DetailsDto, PrepareLinkRequest> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PrepareLinkRequest> getProtoAdapter() {
                return PrepareLinkRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(PrepareLinkRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getPlaid_details() != null) {
                    return new PlaidDetails(PlaidPrepareLinkDetailsDto.INSTANCE.fromProto(proto.getPlaid_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: PrepareLinkRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/PrepareLinkRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/PrepareLinkRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<PrepareLinkRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.PrepareLinkRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PrepareLinkRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PrepareLinkRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PrepareLinkRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PrepareLinkRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/PrepareLinkRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.PrepareLinkRequestDto";
        }
    }
}
