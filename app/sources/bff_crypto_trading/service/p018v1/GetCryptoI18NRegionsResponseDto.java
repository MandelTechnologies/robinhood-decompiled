package bff_crypto_trading.service.p018v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_crypto_trading.service.p018v1.GetCryptoI18NRegionsResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.i18n.Locality;
import com.robinhood.rosetta.i18n.LocalityDto;
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

/* compiled from: GetCryptoI18NRegionsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponse;", "Landroid/os/Parcelable;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;)V", "", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "results", "primary_regions", "secondary_regions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toProto", "()Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;", "getResults", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GetCryptoI18NRegionsResponseDto implements Dto3<GetCryptoI18NRegionsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoI18NRegionsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoI18NRegionsResponseDto, GetCryptoI18NRegionsResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoI18NRegionsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoI18NRegionsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoI18NRegionsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<LocalityDto> getResults() {
        return this.surrogate.getResults();
    }

    public /* synthetic */ GetCryptoI18NRegionsResponseDto(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetCryptoI18NRegionsResponseDto(List<? extends LocalityDto> results, List<? extends LocalityDto> primary_regions, List<? extends LocalityDto> secondary_regions) {
        this(new Surrogate(results, primary_regions, secondary_regions));
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(primary_regions, "primary_regions");
        Intrinsics.checkNotNullParameter(secondary_regions, "secondary_regions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCryptoI18NRegionsResponse toProto() {
        List<LocalityDto> results = this.surrogate.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator<T> it = results.iterator();
        while (it.hasNext()) {
            arrayList.add((Locality) ((LocalityDto) it.next()).toProto());
        }
        List<LocalityDto> primary_regions = this.surrogate.getPrimary_regions();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primary_regions, 10));
        Iterator<T> it2 = primary_regions.iterator();
        while (it2.hasNext()) {
            arrayList2.add((Locality) ((LocalityDto) it2.next()).toProto());
        }
        List<LocalityDto> secondary_regions = this.surrogate.getSecondary_regions();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(secondary_regions, 10));
        Iterator<T> it3 = secondary_regions.iterator();
        while (it3.hasNext()) {
            arrayList3.add((Locality) ((LocalityDto) it3.next()).toProto());
        }
        return new GetCryptoI18NRegionsResponse(arrayList, arrayList2, arrayList3, null, 8, null);
    }

    public String toString() {
        return "[GetCryptoI18NRegionsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoI18NRegionsResponseDto) && Intrinsics.areEqual(((GetCryptoI18NRegionsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoI18NRegionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b(\u0010$\u001a\u0004\b'\u0010\"¨\u0006+"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;", "", "", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "results", "primary_regions", "secondary_regions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_crypto_trading_service_v1_externalRelease", "(Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getResults", "()Ljava/util/List;", "getResults$annotations", "()V", "getPrimary_regions", "getPrimary_regions$annotations", "getSecondary_regions", "getSecondary_regions$annotations", "Companion", "$serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<LocalityDto> primary_regions;
        private final List<LocalityDto> results;
        private final List<LocalityDto> secondary_regions;

        public Surrogate() {
            this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(LocalityDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(LocalityDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(LocalityDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.results, surrogate.results) && Intrinsics.areEqual(this.primary_regions, surrogate.primary_regions) && Intrinsics.areEqual(this.secondary_regions, surrogate.secondary_regions);
        }

        public int hashCode() {
            return (((this.results.hashCode() * 31) + this.primary_regions.hashCode()) * 31) + this.secondary_regions.hashCode();
        }

        public String toString() {
            return "Surrogate(results=" + this.results + ", primary_regions=" + this.primary_regions + ", secondary_regions=" + this.secondary_regions + ")";
        }

        /* compiled from: GetCryptoI18NRegionsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoI18NRegionsResponseDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoI18NRegionsResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoI18NRegionsResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponseDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetCryptoI18NRegionsResponseDto.Surrogate._childSerializers$_anonymous_$1();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
            this.results = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.primary_regions = CollectionsKt.emptyList();
            } else {
                this.primary_regions = list2;
            }
            if ((i & 4) == 0) {
                this.secondary_regions = CollectionsKt.emptyList();
            } else {
                this.secondary_regions = list3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_crypto_trading_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.results, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.results);
            }
            if (!Intrinsics.areEqual(self.primary_regions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.primary_regions);
            }
            if (Intrinsics.areEqual(self.secondary_regions, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.secondary_regions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(List<? extends LocalityDto> results, List<? extends LocalityDto> primary_regions, List<? extends LocalityDto> secondary_regions) {
            Intrinsics.checkNotNullParameter(results, "results");
            Intrinsics.checkNotNullParameter(primary_regions, "primary_regions");
            Intrinsics.checkNotNullParameter(secondary_regions, "secondary_regions");
            this.results = results;
            this.primary_regions = primary_regions;
            this.secondary_regions = secondary_regions;
        }

        public final List<LocalityDto> getResults() {
            return this.results;
        }

        public /* synthetic */ Surrogate(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3);
        }

        public final List<LocalityDto> getPrimary_regions() {
            return this.primary_regions;
        }

        public final List<LocalityDto> getSecondary_regions() {
            return this.secondary_regions;
        }
    }

    /* compiled from: GetCryptoI18NRegionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoI18NRegionsResponseDto, GetCryptoI18NRegionsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoI18NRegionsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoI18NRegionsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoI18NRegionsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoI18NRegionsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoI18NRegionsResponse> getProtoAdapter() {
            return GetCryptoI18NRegionsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoI18NRegionsResponseDto getZeroValue() {
            return GetCryptoI18NRegionsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoI18NRegionsResponseDto fromProto(GetCryptoI18NRegionsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<Locality> results = proto.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(LocalityDto.INSTANCE.fromProto((Locality) it.next()));
            }
            List<Locality> primary_regions = proto.getPrimary_regions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(primary_regions, 10));
            Iterator<T> it2 = primary_regions.iterator();
            while (it2.hasNext()) {
                arrayList2.add(LocalityDto.INSTANCE.fromProto((Locality) it2.next()));
            }
            List<Locality> secondary_regions = proto.getSecondary_regions();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(secondary_regions, 10));
            Iterator<T> it3 = secondary_regions.iterator();
            while (it3.hasNext()) {
                arrayList3.add(LocalityDto.INSTANCE.fromProto((Locality) it3.next()));
            }
            return new GetCryptoI18NRegionsResponseDto(new Surrogate(arrayList, arrayList2, arrayList3), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoI18NRegionsResponseDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new GetCryptoI18NRegionsResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoI18NRegionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetCryptoI18NRegionsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoI18NRegionsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoI18NRegionsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoI18NRegionsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCryptoI18NRegionsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_crypto_trading/service/v1/GetCryptoI18NRegionsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bff_crypto_trading.service.v1.GetCryptoI18NRegionsResponseDto";
        }
    }
}
