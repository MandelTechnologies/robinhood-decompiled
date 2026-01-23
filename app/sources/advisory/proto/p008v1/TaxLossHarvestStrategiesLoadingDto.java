package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestStrategiesLoadingDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TaxLossHarvestStrategiesLoadingDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;)V", "", "lottie_url_dark", "lottie_url_light", "", "loading_titles", "", "min_loading_time", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;D)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;", "getLottie_url_dark", "getLottie_url_light", "getLoading_titles", "()Ljava/util/List;", "getMin_loading_time", "()D", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategiesLoadingDto implements Dto3<TaxLossHarvestStrategiesLoading>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestStrategiesLoadingDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestStrategiesLoadingDto, TaxLossHarvestStrategiesLoading>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestStrategiesLoadingDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestStrategiesLoadingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestStrategiesLoadingDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLottie_url_dark() {
        return this.surrogate.getLottie_url_dark();
    }

    public final String getLottie_url_light() {
        return this.surrogate.getLottie_url_light();
    }

    public final List<String> getLoading_titles() {
        return this.surrogate.getLoading_titles();
    }

    public final double getMin_loading_time() {
        return this.surrogate.getMin_loading_time();
    }

    public /* synthetic */ TaxLossHarvestStrategiesLoadingDto(String str, String str2, List list, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? 0.0d : d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategiesLoadingDto(String lottie_url_dark, String lottie_url_light, List<String> loading_titles, double d) {
        this(new Surrogate(lottie_url_dark, lottie_url_light, loading_titles, d));
        Intrinsics.checkNotNullParameter(lottie_url_dark, "lottie_url_dark");
        Intrinsics.checkNotNullParameter(lottie_url_light, "lottie_url_light");
        Intrinsics.checkNotNullParameter(loading_titles, "loading_titles");
    }

    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestStrategiesLoading toProto() {
        String lottie_url_dark = this.surrogate.getLottie_url_dark();
        String lottie_url_light = this.surrogate.getLottie_url_light();
        List<String> loading_titles = this.surrogate.getLoading_titles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(loading_titles, 10));
        Iterator<T> it = loading_titles.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new TaxLossHarvestStrategiesLoading(lottie_url_dark, lottie_url_light, arrayList, this.surrogate.getMin_loading_time(), null, 16, null);
    }

    public String toString() {
        return "[TaxLossHarvestStrategiesLoadingDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestStrategiesLoadingDto) && Intrinsics.areEqual(((TaxLossHarvestStrategiesLoadingDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestStrategiesLoadingDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232BD\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n¢\u0006\u0004\b\f\u0010\rBG\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001dR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010'\u001a\u0004\b+\u0010,R/\u0010\u000b\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b1\u0010'\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;", "", "", "lottie_url_dark", "lottie_url_light", "", "loading_titles", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "min_loading_time", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLottie_url_dark", "getLottie_url_dark$annotations", "()V", "getLottie_url_light", "getLottie_url_light$annotations", "Ljava/util/List;", "getLoading_titles", "()Ljava/util/List;", "getLoading_titles$annotations", "D", "getMin_loading_time", "()D", "getMin_loading_time$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> loading_titles;
        private final String lottie_url_dark;
        private final String lottie_url_light;
        private final double min_loading_time;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.TaxLossHarvestStrategiesLoadingDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestStrategiesLoadingDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, 0.0d, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.lottie_url_dark, surrogate.lottie_url_dark) && Intrinsics.areEqual(this.lottie_url_light, surrogate.lottie_url_light) && Intrinsics.areEqual(this.loading_titles, surrogate.loading_titles) && Double.compare(this.min_loading_time, surrogate.min_loading_time) == 0;
        }

        public int hashCode() {
            return (((((this.lottie_url_dark.hashCode() * 31) + this.lottie_url_light.hashCode()) * 31) + this.loading_titles.hashCode()) * 31) + Double.hashCode(this.min_loading_time);
        }

        public String toString() {
            return "Surrogate(lottie_url_dark=" + this.lottie_url_dark + ", lottie_url_light=" + this.lottie_url_light + ", loading_titles=" + this.loading_titles + ", min_loading_time=" + this.min_loading_time + ")";
        }

        /* compiled from: TaxLossHarvestStrategiesLoadingDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestStrategiesLoadingDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, double d, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.lottie_url_dark = "";
            } else {
                this.lottie_url_dark = str;
            }
            if ((i & 2) == 0) {
                this.lottie_url_light = "";
            } else {
                this.lottie_url_light = str2;
            }
            if ((i & 4) == 0) {
                this.loading_titles = CollectionsKt.emptyList();
            } else {
                this.loading_titles = list;
            }
            if ((i & 8) == 0) {
                this.min_loading_time = 0.0d;
            } else {
                this.min_loading_time = d;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.lottie_url_dark, "")) {
                output.encodeStringElement(serialDesc, 0, self.lottie_url_dark);
            }
            if (!Intrinsics.areEqual(self.lottie_url_light, "")) {
                output.encodeStringElement(serialDesc, 1, self.lottie_url_light);
            }
            if (!Intrinsics.areEqual(self.loading_titles, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.loading_titles);
            }
            if (Double.compare(self.min_loading_time, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.min_loading_time));
            }
        }

        public Surrogate(String lottie_url_dark, String lottie_url_light, List<String> loading_titles, double d) {
            Intrinsics.checkNotNullParameter(lottie_url_dark, "lottie_url_dark");
            Intrinsics.checkNotNullParameter(lottie_url_light, "lottie_url_light");
            Intrinsics.checkNotNullParameter(loading_titles, "loading_titles");
            this.lottie_url_dark = lottie_url_dark;
            this.lottie_url_light = lottie_url_light;
            this.loading_titles = loading_titles;
            this.min_loading_time = d;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? 0.0d : d);
        }

        public final String getLottie_url_dark() {
            return this.lottie_url_dark;
        }

        public final String getLottie_url_light() {
            return this.lottie_url_light;
        }

        public final List<String> getLoading_titles() {
            return this.loading_titles;
        }

        public final double getMin_loading_time() {
            return this.min_loading_time;
        }
    }

    /* compiled from: TaxLossHarvestStrategiesLoadingDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoading;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestStrategiesLoadingDto, TaxLossHarvestStrategiesLoading> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestStrategiesLoadingDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestStrategiesLoadingDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestStrategiesLoadingDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestStrategiesLoadingDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestStrategiesLoading> getProtoAdapter() {
            return TaxLossHarvestStrategiesLoading.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestStrategiesLoadingDto getZeroValue() {
            return TaxLossHarvestStrategiesLoadingDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestStrategiesLoadingDto fromProto(TaxLossHarvestStrategiesLoading proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String lottie_url_dark = proto.getLottie_url_dark();
            String lottie_url_light = proto.getLottie_url_light();
            List<String> loading_titles = proto.getLoading_titles();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(loading_titles, 10));
            Iterator<T> it = loading_titles.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new TaxLossHarvestStrategiesLoadingDto(new Surrogate(lottie_url_dark, lottie_url_light, arrayList, proto.getMin_loading_time()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestStrategiesLoadingDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestStrategiesLoadingDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TaxLossHarvestStrategiesLoadingDto(null, null, null, 0.0d, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestStrategiesLoadingDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestStrategiesLoadingDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestStrategiesLoading", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestStrategiesLoadingDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestStrategiesLoadingDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestStrategiesLoadingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestStrategiesLoadingDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesLoadingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestStrategiesLoadingDto";
        }
    }
}
