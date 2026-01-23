package microgram.p507ui.p508v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.LaunchRouterRequestDto;
import microgram.p507ui.p508v1.NavigationTypeDto;

/* compiled from: LaunchRouterRequestDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchRouterRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/ui/v1/LaunchRouterRequest;", "Landroid/os/Parcelable;", "Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;)V", "Lmicrogram/ui/v1/InitialScreenDataDto;", "initial_screen_data", "Lmicrogram/ui/v1/NavigationTypeDto;", "navigation_type", "", "", "metadata", "(Lmicrogram/ui/v1/InitialScreenDataDto;Lmicrogram/ui/v1/NavigationTypeDto;Ljava/util/Map;)V", "toProto", "()Lmicrogram/ui/v1/LaunchRouterRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;", "getInitial_screen_data", "()Lmicrogram/ui/v1/InitialScreenDataDto;", "getMetadata", "()Ljava/util/Map;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class LaunchRouterRequestDto implements Dto3<LaunchRouterRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<LaunchRouterRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<LaunchRouterRequestDto, LaunchRouterRequest>> binaryBase64Serializer$delegate;
    private static final LaunchRouterRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ LaunchRouterRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LaunchRouterRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InitialScreenDataDto getInitial_screen_data() {
        return this.surrogate.getInitial_screen_data();
    }

    public final Map<String, String> getMetadata() {
        return this.surrogate.getMetadata();
    }

    public /* synthetic */ LaunchRouterRequestDto(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigationTypeDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : initialScreenDataDto, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LaunchRouterRequestDto(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigation_type, Map<String, String> metadata) {
        this(new Surrogate(initialScreenDataDto, navigation_type, metadata));
        Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public LaunchRouterRequest toProto() {
        InitialScreenDataDto initial_screen_data = this.surrogate.getInitial_screen_data();
        InitialScreenData proto = initial_screen_data != null ? initial_screen_data.toProto() : null;
        NavigationType navigationType = (NavigationType) this.surrogate.getNavigation_type().toProto();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getMetadata().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new LaunchRouterRequest(proto, navigationType, linkedHashMap, null, 8, null);
    }

    public String toString() {
        return "[LaunchRouterRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof LaunchRouterRequestDto) && Intrinsics.areEqual(((LaunchRouterRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: LaunchRouterRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;", "", "Lmicrogram/ui/v1/InitialScreenDataDto;", "initial_screen_data", "Lmicrogram/ui/v1/NavigationTypeDto;", "navigation_type", "", "", "metadata", "<init>", "(Lmicrogram/ui/v1/InitialScreenDataDto;Lmicrogram/ui/v1/NavigationTypeDto;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/v1/InitialScreenDataDto;Lmicrogram/ui/v1/NavigationTypeDto;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui_v1_externalRelease", "(Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/v1/InitialScreenDataDto;", "getInitial_screen_data", "()Lmicrogram/ui/v1/InitialScreenDataDto;", "getInitial_screen_data$annotations", "()V", "Lmicrogram/ui/v1/NavigationTypeDto;", "getNavigation_type", "()Lmicrogram/ui/v1/NavigationTypeDto;", "getNavigation_type$annotations", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "getMetadata$annotations", "Companion", "$serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final InitialScreenDataDto initial_screen_data;
        private final Map<String, String> metadata;
        private final NavigationTypeDto navigation_type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.ui.v1.LaunchRouterRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchRouterRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        public Surrogate() {
            this((InitialScreenDataDto) null, (NavigationTypeDto) null, (Map) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
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
            return Intrinsics.areEqual(this.initial_screen_data, surrogate.initial_screen_data) && this.navigation_type == surrogate.navigation_type && Intrinsics.areEqual(this.metadata, surrogate.metadata);
        }

        public int hashCode() {
            InitialScreenDataDto initialScreenDataDto = this.initial_screen_data;
            return ((((initialScreenDataDto == null ? 0 : initialScreenDataDto.hashCode()) * 31) + this.navigation_type.hashCode()) * 31) + this.metadata.hashCode();
        }

        public String toString() {
            return "Surrogate(initial_screen_data=" + this.initial_screen_data + ", navigation_type=" + this.navigation_type + ", metadata=" + this.metadata + ")";
        }

        /* compiled from: LaunchRouterRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return LaunchRouterRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigationTypeDto, Map map, SerializationConstructorMarker serializationConstructorMarker) {
            this.initial_screen_data = (i & 1) == 0 ? null : initialScreenDataDto;
            if ((i & 2) == 0) {
                this.navigation_type = NavigationTypeDto.INSTANCE.getZeroValue();
            } else {
                this.navigation_type = navigationTypeDto;
            }
            if ((i & 4) == 0) {
                this.metadata = MapsKt.emptyMap();
            } else {
                this.metadata = map;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_ui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            InitialScreenDataDto initialScreenDataDto = self.initial_screen_data;
            if (initialScreenDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, InitialScreenDataDto.Serializer.INSTANCE, initialScreenDataDto);
            }
            if (self.navigation_type != NavigationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, NavigationTypeDto.Serializer.INSTANCE, self.navigation_type);
            }
            if (Intrinsics.areEqual(self.metadata, MapsKt.emptyMap())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.metadata);
        }

        public Surrogate(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigation_type, Map<String, String> metadata) {
            Intrinsics.checkNotNullParameter(navigation_type, "navigation_type");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.initial_screen_data = initialScreenDataDto;
            this.navigation_type = navigation_type;
            this.metadata = metadata;
        }

        public final InitialScreenDataDto getInitial_screen_data() {
            return this.initial_screen_data;
        }

        public final NavigationTypeDto getNavigation_type() {
            return this.navigation_type;
        }

        public /* synthetic */ Surrogate(InitialScreenDataDto initialScreenDataDto, NavigationTypeDto navigationTypeDto, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : initialScreenDataDto, (i & 2) != 0 ? NavigationTypeDto.INSTANCE.getZeroValue() : navigationTypeDto, (i & 4) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }
    }

    /* compiled from: LaunchRouterRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchRouterRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/ui/v1/LaunchRouterRequestDto;", "Lmicrogram/ui/v1/LaunchRouterRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/ui/v1/LaunchRouterRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<LaunchRouterRequestDto, LaunchRouterRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LaunchRouterRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LaunchRouterRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<LaunchRouterRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) LaunchRouterRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<LaunchRouterRequest> getProtoAdapter() {
            return LaunchRouterRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LaunchRouterRequestDto getZeroValue() {
            return LaunchRouterRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public LaunchRouterRequestDto fromProto(LaunchRouterRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            InitialScreenData initial_screen_data = proto.getInitial_screen_data();
            DefaultConstructorMarker defaultConstructorMarker = null;
            InitialScreenDataDto initialScreenDataDtoFromProto = initial_screen_data != null ? InitialScreenDataDto.INSTANCE.fromProto(initial_screen_data) : null;
            NavigationTypeDto navigationTypeDtoFromProto = NavigationTypeDto.INSTANCE.fromProto(proto.getNavigation_type());
            Set<Map.Entry<String, String>> setEntrySet = proto.getMetadata().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new LaunchRouterRequestDto(new Surrogate(initialScreenDataDtoFromProto, navigationTypeDtoFromProto, linkedHashMap), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.ui.v1.LaunchRouterRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchRouterRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new LaunchRouterRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: LaunchRouterRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchRouterRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/v1/LaunchRouterRequestDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/ui/v1/LaunchRouterRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<LaunchRouterRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.ui.v1.LaunchRouterRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, LaunchRouterRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public LaunchRouterRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new LaunchRouterRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: LaunchRouterRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/v1/LaunchRouterRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "microgram.ui.v1.LaunchRouterRequestDto";
        }
    }
}
