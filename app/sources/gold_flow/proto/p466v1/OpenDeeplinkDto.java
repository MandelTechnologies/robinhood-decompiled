package gold_flow.proto.p466v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold_flow.proto.p466v1.OpenDeeplinkDto;
import gold_flow.proto.p466v1.PresentationTypeDto;
import gold_flow.proto.p466v1.TransitionAnimationDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: OpenDeeplinkDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BI\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold_flow/proto/v1/OpenDeeplink;", "Landroid/os/Parcelable;", "Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;)V", "", "deeplink_uri", "Lgold_flow/proto/v1/PresentationTypeDto;", "presentation_type", "Lgold_flow/proto/v1/TransitionAnimationDto;", "transition_animation", "", "generic_args", "", "should_open_externally", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/TransitionAnimationDto;Ljava/util/Map;Ljava/lang/Boolean;)V", "toProto", "()Lgold_flow/proto/v1/OpenDeeplink;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class OpenDeeplinkDto implements Dto3<OpenDeeplink>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OpenDeeplinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OpenDeeplinkDto, OpenDeeplink>> binaryBase64Serializer$delegate;
    private static final OpenDeeplinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OpenDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OpenDeeplinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ OpenDeeplinkDto(String str, PresentationTypeDto presentationTypeDto, TransitionAnimationDto transitionAnimationDto, Map map, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? PresentationTypeDto.INSTANCE.getZeroValue() : presentationTypeDto, (i & 4) != 0 ? TransitionAnimationDto.INSTANCE.getZeroValue() : transitionAnimationDto, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? null : bool);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OpenDeeplinkDto(String deeplink_uri, PresentationTypeDto presentation_type, TransitionAnimationDto transition_animation, Map<String, String> generic_args, Boolean bool) {
        this(new Surrogate(deeplink_uri, presentation_type, transition_animation, generic_args, bool));
        Intrinsics.checkNotNullParameter(deeplink_uri, "deeplink_uri");
        Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
        Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
        Intrinsics.checkNotNullParameter(generic_args, "generic_args");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OpenDeeplink toProto() {
        String deeplink_uri = this.surrogate.getDeeplink_uri();
        PresentationType presentationType = (PresentationType) this.surrogate.getPresentation_type().toProto();
        TransitionAnimation transitionAnimation = (TransitionAnimation) this.surrogate.getTransition_animation().toProto();
        Set<Map.Entry<String, String>> setEntrySet = this.surrogate.getGeneric_args().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return new OpenDeeplink(deeplink_uri, presentationType, transitionAnimation, linkedHashMap, this.surrogate.getShould_open_externally(), null, 32, null);
    }

    public String toString() {
        return "[OpenDeeplinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OpenDeeplinkDto) && Intrinsics.areEqual(((OpenDeeplinkDto) other).surrogate, this.surrogate);
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
    /* compiled from: OpenDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u0010&\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;", "", "", "deeplink_uri", "Lgold_flow/proto/v1/PresentationTypeDto;", "presentation_type", "Lgold_flow/proto/v1/TransitionAnimationDto;", "transition_animation", "", "generic_args", "", "should_open_externally", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/TransitionAnimationDto;Ljava/util/Map;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lgold_flow/proto/v1/PresentationTypeDto;Lgold_flow/proto/v1/TransitionAnimationDto;Ljava/util/Map;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_flow_v1_externalRelease", "(Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink_uri", "getDeeplink_uri$annotations", "()V", "Lgold_flow/proto/v1/PresentationTypeDto;", "getPresentation_type", "()Lgold_flow/proto/v1/PresentationTypeDto;", "getPresentation_type$annotations", "Lgold_flow/proto/v1/TransitionAnimationDto;", "getTransition_animation", "()Lgold_flow/proto/v1/TransitionAnimationDto;", "getTransition_animation$annotations", "Ljava/util/Map;", "getGeneric_args", "()Ljava/util/Map;", "getGeneric_args$annotations", "Ljava/lang/Boolean;", "getShould_open_externally", "()Ljava/lang/Boolean;", "getShould_open_externally$annotations", "Companion", "$serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String deeplink_uri;
        private final Map<String, String> generic_args;
        private final PresentationTypeDto presentation_type;
        private final Boolean should_open_externally;
        private final TransitionAnimationDto transition_animation;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: gold_flow.proto.v1.OpenDeeplinkDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenDeeplinkDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (PresentationTypeDto) null, (TransitionAnimationDto) null, (Map) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
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
            return Intrinsics.areEqual(this.deeplink_uri, surrogate.deeplink_uri) && this.presentation_type == surrogate.presentation_type && this.transition_animation == surrogate.transition_animation && Intrinsics.areEqual(this.generic_args, surrogate.generic_args) && Intrinsics.areEqual(this.should_open_externally, surrogate.should_open_externally);
        }

        public int hashCode() {
            int iHashCode = ((((((this.deeplink_uri.hashCode() * 31) + this.presentation_type.hashCode()) * 31) + this.transition_animation.hashCode()) * 31) + this.generic_args.hashCode()) * 31;
            Boolean bool = this.should_open_externally;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "Surrogate(deeplink_uri=" + this.deeplink_uri + ", presentation_type=" + this.presentation_type + ", transition_animation=" + this.transition_animation + ", generic_args=" + this.generic_args + ", should_open_externally=" + this.should_open_externally + ")";
        }

        /* compiled from: OpenDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OpenDeeplinkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, PresentationTypeDto presentationTypeDto, TransitionAnimationDto transitionAnimationDto, Map map, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            this.deeplink_uri = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.presentation_type = PresentationTypeDto.INSTANCE.getZeroValue();
            } else {
                this.presentation_type = presentationTypeDto;
            }
            if ((i & 4) == 0) {
                this.transition_animation = TransitionAnimationDto.INSTANCE.getZeroValue();
            } else {
                this.transition_animation = transitionAnimationDto;
            }
            if ((i & 8) == 0) {
                this.generic_args = MapsKt.emptyMap();
            } else {
                this.generic_args = map;
            }
            if ((i & 16) == 0) {
                this.should_open_externally = null;
            } else {
                this.should_open_externally = bool;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_flow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.deeplink_uri, "")) {
                output.encodeStringElement(serialDesc, 0, self.deeplink_uri);
            }
            if (self.presentation_type != PresentationTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, PresentationTypeDto.Serializer.INSTANCE, self.presentation_type);
            }
            if (self.transition_animation != TransitionAnimationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, TransitionAnimationDto.Serializer.INSTANCE, self.transition_animation);
            }
            if (!Intrinsics.areEqual(self.generic_args, MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.generic_args);
            }
            Boolean bool = self.should_open_externally;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, bool);
            }
        }

        public Surrogate(String deeplink_uri, PresentationTypeDto presentation_type, TransitionAnimationDto transition_animation, Map<String, String> generic_args, Boolean bool) {
            Intrinsics.checkNotNullParameter(deeplink_uri, "deeplink_uri");
            Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
            Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
            Intrinsics.checkNotNullParameter(generic_args, "generic_args");
            this.deeplink_uri = deeplink_uri;
            this.presentation_type = presentation_type;
            this.transition_animation = transition_animation;
            this.generic_args = generic_args;
            this.should_open_externally = bool;
        }

        public final String getDeeplink_uri() {
            return this.deeplink_uri;
        }

        public /* synthetic */ Surrogate(String str, PresentationTypeDto presentationTypeDto, TransitionAnimationDto transitionAnimationDto, Map map, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? PresentationTypeDto.INSTANCE.getZeroValue() : presentationTypeDto, (i & 4) != 0 ? TransitionAnimationDto.INSTANCE.getZeroValue() : transitionAnimationDto, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? null : bool);
        }

        public final PresentationTypeDto getPresentation_type() {
            return this.presentation_type;
        }

        public final TransitionAnimationDto getTransition_animation() {
            return this.transition_animation;
        }

        public final Map<String, String> getGeneric_args() {
            return this.generic_args;
        }

        public final Boolean getShould_open_externally() {
            return this.should_open_externally;
        }
    }

    /* compiled from: OpenDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold_flow/proto/v1/OpenDeeplinkDto;", "Lgold_flow/proto/v1/OpenDeeplink;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/OpenDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OpenDeeplinkDto, OpenDeeplink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OpenDeeplinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OpenDeeplinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OpenDeeplinkDto> getBinaryBase64Serializer() {
            return (KSerializer) OpenDeeplinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OpenDeeplink> getProtoAdapter() {
            return OpenDeeplink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OpenDeeplinkDto getZeroValue() {
            return OpenDeeplinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OpenDeeplinkDto fromProto(OpenDeeplink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String deeplink_uri = proto.getDeeplink_uri();
            PresentationTypeDto presentationTypeDtoFromProto = PresentationTypeDto.INSTANCE.fromProto(proto.getPresentation_type());
            TransitionAnimationDto transitionAnimationDtoFromProto = TransitionAnimationDto.INSTANCE.fromProto(proto.getTransition_animation());
            Set<Map.Entry<String, String>> setEntrySet = proto.getGeneric_args().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Tuples2 tuples2M3642to = Tuples4.m3642to((String) entry.getKey(), (String) entry.getValue());
                linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            return new OpenDeeplinkDto(new Surrogate(deeplink_uri, presentationTypeDtoFromProto, transitionAnimationDtoFromProto, linkedHashMap, proto.getShould_open_externally()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.OpenDeeplinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenDeeplinkDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new OpenDeeplinkDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OpenDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/OpenDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Lgold_flow/proto/v1/OpenDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<OpenDeeplinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold_flow.proto.v1.OpenDeeplink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OpenDeeplinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OpenDeeplinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OpenDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OpenDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "gold_flow.proto.v1.OpenDeeplinkDto";
        }
    }
}
