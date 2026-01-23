package advisory.proto.p008v1;

import advisory.proto.p008v1.GetTaxGainsAndLossesAccountSnapshotDto;
import advisory.proto.p008v1.GetTaxGainsAndLossesSectionDto;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetTaxGainsAndLossesAccountSnapshotDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u0006/"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshot;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;)V", "", "account_number", "", "Ladvisory/proto/v1/GetTaxGainsAndLossesSectionDto;", "sections", "account_display_name", "account_icon", "disclosure_markdown", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshot;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;", "getAccount_number", "getSections", "()Ljava/util/List;", "getAccount_display_name", "getAccount_icon", "getDisclosure_markdown", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetTaxGainsAndLossesAccountSnapshotDto implements Dto3<GetTaxGainsAndLossesAccountSnapshot>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTaxGainsAndLossesAccountSnapshotDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTaxGainsAndLossesAccountSnapshotDto, GetTaxGainsAndLossesAccountSnapshot>> binaryBase64Serializer$delegate;
    private static final GetTaxGainsAndLossesAccountSnapshotDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTaxGainsAndLossesAccountSnapshotDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTaxGainsAndLossesAccountSnapshotDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final List<GetTaxGainsAndLossesSectionDto> getSections() {
        return this.surrogate.getSections();
    }

    public final String getAccount_display_name() {
        return this.surrogate.getAccount_display_name();
    }

    public final String getAccount_icon() {
        return this.surrogate.getAccount_icon();
    }

    public final String getDisclosure_markdown() {
        return this.surrogate.getDisclosure_markdown();
    }

    public /* synthetic */ GetTaxGainsAndLossesAccountSnapshotDto(String str, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTaxGainsAndLossesAccountSnapshotDto(String account_number, List<GetTaxGainsAndLossesSectionDto> sections, String account_display_name, String account_icon, String str) {
        this(new Surrogate(account_number, sections, account_display_name, account_icon, str));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(account_display_name, "account_display_name");
        Intrinsics.checkNotNullParameter(account_icon, "account_icon");
    }

    @Override // com.robinhood.idl.Dto
    public GetTaxGainsAndLossesAccountSnapshot toProto() {
        String account_number = this.surrogate.getAccount_number();
        List<GetTaxGainsAndLossesSectionDto> sections = this.surrogate.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(((GetTaxGainsAndLossesSectionDto) it.next()).toProto());
        }
        return new GetTaxGainsAndLossesAccountSnapshot(account_number, arrayList, this.surrogate.getAccount_display_name(), this.surrogate.getAccount_icon(), this.surrogate.getDisclosure_markdown(), null, 32, null);
    }

    public String toString() {
        return "[GetTaxGainsAndLossesAccountSnapshotDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTaxGainsAndLossesAccountSnapshotDto) && Intrinsics.areEqual(((GetTaxGainsAndLossesAccountSnapshotDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTaxGainsAndLossesAccountSnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010\u001b¨\u00062"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;", "", "", "account_number", "", "Ladvisory/proto/v1/GetTaxGainsAndLossesSectionDto;", "sections", "account_display_name", "account_icon", "disclosure_markdown", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "getSections$annotations", "getAccount_display_name", "getAccount_display_name$annotations", "getAccount_icon", "getAccount_icon$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_display_name;
        private final String account_icon;
        private final String account_number;
        private final String disclosure_markdown;
        private final List<GetTaxGainsAndLossesSectionDto> sections;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.GetTaxGainsAndLossesAccountSnapshotDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxGainsAndLossesAccountSnapshotDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(GetTaxGainsAndLossesSectionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.sections, surrogate.sections) && Intrinsics.areEqual(this.account_display_name, surrogate.account_display_name) && Intrinsics.areEqual(this.account_icon, surrogate.account_icon) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown);
        }

        public int hashCode() {
            int iHashCode = ((((((this.account_number.hashCode() * 31) + this.sections.hashCode()) * 31) + this.account_display_name.hashCode()) * 31) + this.account_icon.hashCode()) * 31;
            String str = this.disclosure_markdown;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", sections=" + this.sections + ", account_display_name=" + this.account_display_name + ", account_icon=" + this.account_icon + ", disclosure_markdown=" + this.disclosure_markdown + ")";
        }

        /* compiled from: GetTaxGainsAndLossesAccountSnapshotDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTaxGainsAndLossesAccountSnapshotDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.sections = CollectionsKt.emptyList();
            } else {
                this.sections = list;
            }
            if ((i & 4) == 0) {
                this.account_display_name = "";
            } else {
                this.account_display_name = str2;
            }
            if ((i & 8) == 0) {
                this.account_icon = "";
            } else {
                this.account_icon = str3;
            }
            if ((i & 16) == 0) {
                this.disclosure_markdown = null;
            } else {
                this.disclosure_markdown = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_number);
            }
            if (!Intrinsics.areEqual(self.sections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.sections);
            }
            if (!Intrinsics.areEqual(self.account_display_name, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_display_name);
            }
            if (!Intrinsics.areEqual(self.account_icon, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_icon);
            }
            String str = self.disclosure_markdown;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(String account_number, List<GetTaxGainsAndLossesSectionDto> sections, String account_display_name, String account_icon, String str) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(sections, "sections");
            Intrinsics.checkNotNullParameter(account_display_name, "account_display_name");
            Intrinsics.checkNotNullParameter(account_icon, "account_icon");
            this.account_number = account_number;
            this.sections = sections;
            this.account_display_name = account_display_name;
            this.account_icon = account_icon;
            this.disclosure_markdown = str;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final List<GetTaxGainsAndLossesSectionDto> getSections() {
            return this.sections;
        }

        public final String getAccount_display_name() {
            return this.account_display_name;
        }

        public final String getAccount_icon() {
            return this.account_icon;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }
    }

    /* compiled from: GetTaxGainsAndLossesAccountSnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto;", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshot;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTaxGainsAndLossesAccountSnapshotDto, GetTaxGainsAndLossesAccountSnapshot> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTaxGainsAndLossesAccountSnapshotDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxGainsAndLossesAccountSnapshotDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxGainsAndLossesAccountSnapshotDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTaxGainsAndLossesAccountSnapshotDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTaxGainsAndLossesAccountSnapshot> getProtoAdapter() {
            return GetTaxGainsAndLossesAccountSnapshot.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxGainsAndLossesAccountSnapshotDto getZeroValue() {
            return GetTaxGainsAndLossesAccountSnapshotDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxGainsAndLossesAccountSnapshotDto fromProto(GetTaxGainsAndLossesAccountSnapshot proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            List<GetTaxGainsAndLossesSection> sections = proto.getSections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                arrayList.add(GetTaxGainsAndLossesSectionDto.INSTANCE.fromProto((GetTaxGainsAndLossesSection) it.next()));
            }
            return new GetTaxGainsAndLossesAccountSnapshotDto(new Surrogate(account_number, arrayList, proto.getAccount_display_name(), proto.getAccount_icon(), proto.getDisclosure_markdown()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetTaxGainsAndLossesAccountSnapshotDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxGainsAndLossesAccountSnapshotDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetTaxGainsAndLossesAccountSnapshotDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTaxGainsAndLossesAccountSnapshotDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetTaxGainsAndLossesAccountSnapshotDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetTaxGainsAndLossesAccountSnapshot", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTaxGainsAndLossesAccountSnapshotDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTaxGainsAndLossesAccountSnapshotDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTaxGainsAndLossesAccountSnapshotDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTaxGainsAndLossesAccountSnapshotDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxGainsAndLossesAccountSnapshotDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetTaxGainsAndLossesAccountSnapshotDto";
        }
    }
}
