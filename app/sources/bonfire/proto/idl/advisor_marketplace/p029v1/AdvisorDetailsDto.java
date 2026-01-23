package bonfire.proto.idl.advisor_marketplace.p029v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDetailsAboutDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorDetailsDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorQuickFactsRowDto;
import bonfire.proto.idl.advisor_marketplace.p029v1.AdvisorValuePropDto;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: AdvisorDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006+"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;)V", "", "name", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;", "top_value_prop", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorQuickFactsRowDto;", "advisor_quick_facts", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;", "about_advisor", "hobbies", "(Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;Ljava/util/List;)V", "toProto", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class AdvisorDetailsDto implements Dto3<AdvisorDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisorDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisorDetailsDto, AdvisorDetails>> binaryBase64Serializer$delegate;
    private static final AdvisorDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisorDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisorDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ AdvisorDetailsDto(String str, AdvisorValuePropDto advisorValuePropDto, List list, AdvisorDetailsAboutDto advisorDetailsAboutDto, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : advisorValuePropDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : advisorDetailsAboutDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdvisorDetailsDto(String name, AdvisorValuePropDto advisorValuePropDto, List<AdvisorQuickFactsRowDto> advisor_quick_facts, AdvisorDetailsAboutDto advisorDetailsAboutDto, List<String> hobbies) {
        this(new Surrogate(name, advisorValuePropDto, advisor_quick_facts, advisorDetailsAboutDto, hobbies));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(advisor_quick_facts, "advisor_quick_facts");
        Intrinsics.checkNotNullParameter(hobbies, "hobbies");
    }

    @Override // com.robinhood.idl.Dto
    public AdvisorDetails toProto() {
        String name = this.surrogate.getName();
        AdvisorValuePropDto top_value_prop = this.surrogate.getTop_value_prop();
        AdvisorValueProp proto = top_value_prop != null ? top_value_prop.toProto() : null;
        List<AdvisorQuickFactsRowDto> advisor_quick_facts = this.surrogate.getAdvisor_quick_facts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(advisor_quick_facts, 10));
        Iterator<T> it = advisor_quick_facts.iterator();
        while (it.hasNext()) {
            arrayList.add(((AdvisorQuickFactsRowDto) it.next()).toProto());
        }
        AdvisorDetailsAboutDto about_advisor = this.surrogate.getAbout_advisor();
        AdvisorDetailsAbout proto2 = about_advisor != null ? about_advisor.toProto() : null;
        List<String> hobbies = this.surrogate.getHobbies();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(hobbies, 10));
        Iterator<T> it2 = hobbies.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        return new AdvisorDetails(name, proto, arrayList, proto2, arrayList2, null, 32, null);
    }

    public String toString() {
        return "[AdvisorDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisorDetailsDto) && Intrinsics.areEqual(((AdvisorDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010,\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010.¨\u00068"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;", "", "", "name", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;", "top_value_prop", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorQuickFactsRowDto;", "advisor_quick_facts", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;", "about_advisor", "hobbies", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease", "(Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;", "getTop_value_prop", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValuePropDto;", "getTop_value_prop$annotations", "Ljava/util/List;", "getAdvisor_quick_facts", "()Ljava/util/List;", "getAdvisor_quick_facts$annotations", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;", "getAbout_advisor", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAboutDto;", "getAbout_advisor$annotations", "getHobbies", "getHobbies$annotations", "Companion", "$serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdvisorDetailsAboutDto about_advisor;
        private final List<AdvisorQuickFactsRowDto> advisor_quick_facts;
        private final List<String> hobbies;
        private final String name;
        private final AdvisorValuePropDto top_value_prop;

        public Surrogate() {
            this((String) null, (AdvisorValuePropDto) null, (List) null, (AdvisorDetailsAboutDto) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(AdvisorQuickFactsRowDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
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
            return Intrinsics.areEqual(this.name, surrogate.name) && Intrinsics.areEqual(this.top_value_prop, surrogate.top_value_prop) && Intrinsics.areEqual(this.advisor_quick_facts, surrogate.advisor_quick_facts) && Intrinsics.areEqual(this.about_advisor, surrogate.about_advisor) && Intrinsics.areEqual(this.hobbies, surrogate.hobbies);
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            AdvisorValuePropDto advisorValuePropDto = this.top_value_prop;
            int iHashCode2 = (((iHashCode + (advisorValuePropDto == null ? 0 : advisorValuePropDto.hashCode())) * 31) + this.advisor_quick_facts.hashCode()) * 31;
            AdvisorDetailsAboutDto advisorDetailsAboutDto = this.about_advisor;
            return ((iHashCode2 + (advisorDetailsAboutDto != null ? advisorDetailsAboutDto.hashCode() : 0)) * 31) + this.hobbies.hashCode();
        }

        public String toString() {
            return "Surrogate(name=" + this.name + ", top_value_prop=" + this.top_value_prop + ", advisor_quick_facts=" + this.advisor_quick_facts + ", about_advisor=" + this.about_advisor + ", hobbies=" + this.hobbies + ")";
        }

        /* compiled from: AdvisorDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisorDetailsDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetailsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvisorDetailsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetailsDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AdvisorDetailsDto.Surrogate._childSerializers$_anonymous_$0();
                }
            })};
        }

        public /* synthetic */ Surrogate(int i, String str, AdvisorValuePropDto advisorValuePropDto, List list, AdvisorDetailsAboutDto advisorDetailsAboutDto, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            this.name = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.top_value_prop = null;
            } else {
                this.top_value_prop = advisorValuePropDto;
            }
            if ((i & 4) == 0) {
                this.advisor_quick_facts = CollectionsKt.emptyList();
            } else {
                this.advisor_quick_facts = list;
            }
            if ((i & 8) == 0) {
                this.about_advisor = null;
            } else {
                this.about_advisor = advisorDetailsAboutDto;
            }
            if ((i & 16) == 0) {
                this.hobbies = CollectionsKt.emptyList();
            } else {
                this.hobbies = list2;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$bonfire_proto_idl_advisor_marketplace_v1_externalRelease */
        public static final /* synthetic */ void m725x79713acb(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.name, "")) {
                output.encodeStringElement(serialDesc, 0, self.name);
            }
            AdvisorValuePropDto advisorValuePropDto = self.top_value_prop;
            if (advisorValuePropDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AdvisorValuePropDto.Serializer.INSTANCE, advisorValuePropDto);
            }
            if (!Intrinsics.areEqual(self.advisor_quick_facts, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.advisor_quick_facts);
            }
            AdvisorDetailsAboutDto advisorDetailsAboutDto = self.about_advisor;
            if (advisorDetailsAboutDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AdvisorDetailsAboutDto.Serializer.INSTANCE, advisorDetailsAboutDto);
            }
            if (Intrinsics.areEqual(self.hobbies, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.hobbies);
        }

        public Surrogate(String name, AdvisorValuePropDto advisorValuePropDto, List<AdvisorQuickFactsRowDto> advisor_quick_facts, AdvisorDetailsAboutDto advisorDetailsAboutDto, List<String> hobbies) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(advisor_quick_facts, "advisor_quick_facts");
            Intrinsics.checkNotNullParameter(hobbies, "hobbies");
            this.name = name;
            this.top_value_prop = advisorValuePropDto;
            this.advisor_quick_facts = advisor_quick_facts;
            this.about_advisor = advisorDetailsAboutDto;
            this.hobbies = hobbies;
        }

        public final String getName() {
            return this.name;
        }

        public /* synthetic */ Surrogate(String str, AdvisorValuePropDto advisorValuePropDto, List list, AdvisorDetailsAboutDto advisorDetailsAboutDto, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : advisorValuePropDto, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : advisorDetailsAboutDto, (i & 16) != 0 ? CollectionsKt.emptyList() : list2);
        }

        public final AdvisorValuePropDto getTop_value_prop() {
            return this.top_value_prop;
        }

        public final List<AdvisorQuickFactsRowDto> getAdvisor_quick_facts() {
            return this.advisor_quick_facts;
        }

        public final AdvisorDetailsAboutDto getAbout_advisor() {
            return this.about_advisor;
        }

        public final List<String> getHobbies() {
            return this.hobbies;
        }
    }

    /* compiled from: AdvisorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisorDetailsDto, AdvisorDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisorDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisorDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisorDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisorDetails> getProtoAdapter() {
            return AdvisorDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDetailsDto getZeroValue() {
            return AdvisorDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisorDetailsDto fromProto(AdvisorDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String name = proto.getName();
            AdvisorValueProp top_value_prop = proto.getTop_value_prop();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AdvisorValuePropDto advisorValuePropDtoFromProto = top_value_prop != null ? AdvisorValuePropDto.INSTANCE.fromProto(top_value_prop) : null;
            List<AdvisorQuickFactsRow> advisor_quick_facts = proto.getAdvisor_quick_facts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(advisor_quick_facts, 10));
            Iterator<T> it = advisor_quick_facts.iterator();
            while (it.hasNext()) {
                arrayList.add(AdvisorQuickFactsRowDto.INSTANCE.fromProto((AdvisorQuickFactsRow) it.next()));
            }
            AdvisorDetailsAbout about_advisor = proto.getAbout_advisor();
            AdvisorDetailsAboutDto advisorDetailsAboutDtoFromProto = about_advisor != null ? AdvisorDetailsAboutDto.INSTANCE.fromProto(about_advisor) : null;
            List<String> hobbies = proto.getHobbies();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(hobbies, 10));
            Iterator<T> it2 = hobbies.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            return new AdvisorDetailsDto(new Surrogate(name, advisorValuePropDtoFromProto, arrayList, advisorDetailsAboutDtoFromProto, arrayList2), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisorDetailsDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new AdvisorDetailsDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AdvisorDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisorDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisorDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisorDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisorDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetailsDto";
        }
    }
}
