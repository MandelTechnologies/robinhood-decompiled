package search_coprocessor.p542v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import search_coprocessor.p542v1.CustomColorDto;
import search_coprocessor.p542v1.MultiContractsHeroDetails;
import search_coprocessor.p542v1.MultiContractsHeroDetailsDto;

/* compiled from: MultiContractsHeroDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006,+-./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00061"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;)V", "", "title", "headline", "", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "contracts", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", ResourceTypes.STYLE, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;)V", "toProto", "()Lsearch_coprocessor/v1/MultiContractsHeroDetails;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;", "getTitle", "getHeadline", "getContracts", "()Ljava/util/List;", "getStyle", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "Companion", "Surrogate", "ContractInfoDto", "DisplayStyleDto", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes28.dex */
public final class MultiContractsHeroDetailsDto implements Dto3<MultiContractsHeroDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MultiContractsHeroDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MultiContractsHeroDetailsDto, MultiContractsHeroDetails>> binaryBase64Serializer$delegate;
    private static final MultiContractsHeroDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MultiContractsHeroDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MultiContractsHeroDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getHeadline() {
        return this.surrogate.getHeadline();
    }

    public final List<ContractInfoDto> getContracts() {
        return this.surrogate.getContracts();
    }

    public final DisplayStyleDto getStyle() {
        return this.surrogate.getStyle();
    }

    public /* synthetic */ MultiContractsHeroDetailsDto(String str, String str2, List list, DisplayStyleDto displayStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? DisplayStyleDto.INSTANCE.getZeroValue() : displayStyleDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiContractsHeroDetailsDto(String title, String headline, List<ContractInfoDto> contracts2, DisplayStyleDto style) {
        this(new Surrogate(title, headline, contracts2, style));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(contracts2, "contracts");
        Intrinsics.checkNotNullParameter(style, "style");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public MultiContractsHeroDetails toProto() {
        String title = this.surrogate.getTitle();
        String headline = this.surrogate.getHeadline();
        List<ContractInfoDto> contracts2 = this.surrogate.getContracts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
        Iterator<T> it = contracts2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContractInfoDto) it.next()).toProto());
        }
        return new MultiContractsHeroDetails(title, headline, arrayList, (MultiContractsHeroDetails.DisplayStyle) this.surrogate.getStyle().toProto(), null, 16, null);
    }

    public String toString() {
        return "[MultiContractsHeroDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MultiContractsHeroDetailsDto) && Intrinsics.areEqual(((MultiContractsHeroDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: MultiContractsHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;", "", "", "title", "headline", "", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "contracts", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", ResourceTypes.STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getHeadline", "getHeadline$annotations", "Ljava/util/List;", "getContracts", "()Ljava/util/List;", "getContracts$annotations", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "getStyle", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "getStyle$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<ContractInfoDto> contracts;
        private final String headline;
        private final DisplayStyleDto style;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: search_coprocessor.v1.MultiContractsHeroDetailsDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiContractsHeroDetailsDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((String) null, (String) null, (List) null, (DisplayStyleDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ContractInfoDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.headline, surrogate.headline) && Intrinsics.areEqual(this.contracts, surrogate.contracts) && this.style == surrogate.style;
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.headline.hashCode()) * 31) + this.contracts.hashCode()) * 31) + this.style.hashCode();
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", headline=" + this.headline + ", contracts=" + this.contracts + ", style=" + this.style + ")";
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MultiContractsHeroDetailsDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, List list, DisplayStyleDto displayStyleDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.headline = "";
            } else {
                this.headline = str2;
            }
            if ((i & 4) == 0) {
                this.contracts = CollectionsKt.emptyList();
            } else {
                this.contracts = list;
            }
            if ((i & 8) == 0) {
                this.style = DisplayStyleDto.INSTANCE.getZeroValue();
            } else {
                this.style = displayStyleDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.headline, "")) {
                output.encodeStringElement(serialDesc, 1, self.headline);
            }
            if (!Intrinsics.areEqual(self.contracts, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.contracts);
            }
            if (self.style != DisplayStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, DisplayStyleDto.Serializer.INSTANCE, self.style);
            }
        }

        public Surrogate(String title, String headline, List<ContractInfoDto> contracts2, DisplayStyleDto style) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(contracts2, "contracts");
            Intrinsics.checkNotNullParameter(style, "style");
            this.title = title;
            this.headline = headline;
            this.contracts = contracts2;
            this.style = style;
        }

        public /* synthetic */ Surrogate(String str, String str2, List list, DisplayStyleDto displayStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? DisplayStyleDto.INSTANCE.getZeroValue() : displayStyleDto);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final List<ContractInfoDto> getContracts() {
            return this.contracts;
        }

        public final DisplayStyleDto getStyle() {
            return this.style;
        }
    }

    /* compiled from: MultiContractsHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MultiContractsHeroDetailsDto, MultiContractsHeroDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MultiContractsHeroDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MultiContractsHeroDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MultiContractsHeroDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) MultiContractsHeroDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MultiContractsHeroDetails> getProtoAdapter() {
            return MultiContractsHeroDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MultiContractsHeroDetailsDto getZeroValue() {
            return MultiContractsHeroDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MultiContractsHeroDetailsDto fromProto(MultiContractsHeroDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String headline = proto.getHeadline();
            List<MultiContractsHeroDetails.ContractInfo> contracts2 = proto.getContracts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contracts2, 10));
            Iterator<T> it = contracts2.iterator();
            while (it.hasNext()) {
                arrayList.add(ContractInfoDto.INSTANCE.fromProto((MultiContractsHeroDetails.ContractInfo) it.next()));
            }
            return new MultiContractsHeroDetailsDto(new Surrogate(title, headline, arrayList, DisplayStyleDto.INSTANCE.fromProto(proto.getStyle())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.MultiContractsHeroDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiContractsHeroDetailsDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new MultiContractsHeroDetailsDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MultiContractsHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$ContractInfo;", "Landroid/os/Parcelable;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;", "surrogate", "<init>", "(Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;)V", "", "id", "title", "display_value", "", "graph_relative_length", "Lsearch_coprocessor/v1/CustomColorDto;", ResourceTypes.COLOR, "", "highlighted", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLsearch_coprocessor/v1/CustomColorDto;Z)V", "toProto", "()Lsearch_coprocessor/v1/MultiContractsHeroDetails$ContractInfo;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;", "getId", "getTitle", "getDisplay_value", "getGraph_relative_length", "()D", "getColor", "()Lsearch_coprocessor/v1/CustomColorDto;", "getHighlighted", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ContractInfoDto implements Dto3<MultiContractsHeroDetails.ContractInfo>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ContractInfoDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ContractInfoDto, MultiContractsHeroDetails.ContractInfo>> binaryBase64Serializer$delegate;
        private static final ContractInfoDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ContractInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ContractInfoDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getId() {
            return this.surrogate.getId();
        }

        public final String getTitle() {
            return this.surrogate.getTitle();
        }

        public final String getDisplay_value() {
            return this.surrogate.getDisplay_value();
        }

        public final double getGraph_relative_length() {
            return this.surrogate.getGraph_relative_length();
        }

        public final CustomColorDto getColor() {
            return this.surrogate.getColor();
        }

        public final boolean getHighlighted() {
            return this.surrogate.getHighlighted();
        }

        public /* synthetic */ ContractInfoDto(String str, String str2, String str3, double d, CustomColorDto customColorDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? null : customColorDto, (i & 32) != 0 ? false : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ContractInfoDto(String id, String title, String display_value, double d, CustomColorDto customColorDto, boolean z) {
            this(new Surrogate(id, title, display_value, d, customColorDto, z));
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(display_value, "display_value");
        }

        @Override // com.robinhood.idl.Dto
        public MultiContractsHeroDetails.ContractInfo toProto() {
            String id = this.surrogate.getId();
            String title = this.surrogate.getTitle();
            String display_value = this.surrogate.getDisplay_value();
            double graph_relative_length = this.surrogate.getGraph_relative_length();
            CustomColorDto color = this.surrogate.getColor();
            return new MultiContractsHeroDetails.ContractInfo(id, title, display_value, graph_relative_length, color != null ? color.toProto() : null, this.surrogate.getHighlighted(), null, 64, null);
        }

        public String toString() {
            return "[ContractInfoDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ContractInfoDto) && Intrinsics.areEqual(((ContractInfoDto) other).surrogate, this.surrogate);
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
        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BT\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010 R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010 R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;", "", "", "id", "title", "display_value", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "graph_relative_length", "Lsearch_coprocessor/v1/CustomColorDto;", ResourceTypes.COLOR, "", "highlighted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLsearch_coprocessor/v1/CustomColorDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLsearch_coprocessor/v1/CustomColorDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_coprocessor_v1_externalRelease", "(Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "getDisplay_value", "getDisplay_value$annotations", "D", "getGraph_relative_length", "()D", "getGraph_relative_length$annotations", "Lsearch_coprocessor/v1/CustomColorDto;", "getColor", "()Lsearch_coprocessor/v1/CustomColorDto;", "getColor$annotations", "Z", "getHighlighted", "()Z", "getHighlighted$annotations", "Companion", "$serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CustomColorDto color;
            private final String display_value;
            private final double graph_relative_length;
            private final boolean highlighted;
            private final String id;
            private final String title;

            public Surrogate() {
                this((String) null, (String) null, (String) null, 0.0d, (CustomColorDto) null, false, 63, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.display_value, surrogate.display_value) && Double.compare(this.graph_relative_length, surrogate.graph_relative_length) == 0 && Intrinsics.areEqual(this.color, surrogate.color) && this.highlighted == surrogate.highlighted;
            }

            public int hashCode() {
                int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.display_value.hashCode()) * 31) + Double.hashCode(this.graph_relative_length)) * 31;
                CustomColorDto customColorDto = this.color;
                return ((iHashCode + (customColorDto == null ? 0 : customColorDto.hashCode())) * 31) + Boolean.hashCode(this.highlighted);
            }

            public String toString() {
                return "Surrogate(id=" + this.id + ", title=" + this.title + ", display_value=" + this.display_value + ", graph_relative_length=" + this.graph_relative_length + ", color=" + this.color + ", highlighted=" + this.highlighted + ")";
            }

            /* compiled from: MultiContractsHeroDetailsDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return MultiContractsHeroDetailsDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, String str2, String str3, double d, CustomColorDto customColorDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.id = "";
                } else {
                    this.id = str;
                }
                if ((i & 2) == 0) {
                    this.title = "";
                } else {
                    this.title = str2;
                }
                if ((i & 4) == 0) {
                    this.display_value = "";
                } else {
                    this.display_value = str3;
                }
                if ((i & 8) == 0) {
                    this.graph_relative_length = 0.0d;
                } else {
                    this.graph_relative_length = d;
                }
                if ((i & 16) == 0) {
                    this.color = null;
                } else {
                    this.color = customColorDto;
                }
                if ((i & 32) == 0) {
                    this.highlighted = false;
                } else {
                    this.highlighted = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$search_coprocessor_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.id);
                }
                if (!Intrinsics.areEqual(self.title, "")) {
                    output.encodeStringElement(serialDesc, 1, self.title);
                }
                if (!Intrinsics.areEqual(self.display_value, "")) {
                    output.encodeStringElement(serialDesc, 2, self.display_value);
                }
                if (Double.compare(self.graph_relative_length, 0.0d) != 0) {
                    output.encodeSerializableElement(serialDesc, 3, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.graph_relative_length));
                }
                CustomColorDto customColorDto = self.color;
                if (customColorDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, CustomColorDto.Serializer.INSTANCE, customColorDto);
                }
                boolean z = self.highlighted;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 5, z);
                }
            }

            public Surrogate(String id, String title, String display_value, double d, CustomColorDto customColorDto, boolean z) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(display_value, "display_value");
                this.id = id;
                this.title = title;
                this.display_value = display_value;
                this.graph_relative_length = d;
                this.color = customColorDto;
                this.highlighted = z;
            }

            public /* synthetic */ Surrogate(String str, String str2, String str3, double d, CustomColorDto customColorDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0.0d : d, (i & 16) != 0 ? null : customColorDto, (i & 32) != 0 ? false : z);
            }

            public final String getId() {
                return this.id;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getDisplay_value() {
                return this.display_value;
            }

            public final double getGraph_relative_length() {
                return this.graph_relative_length;
            }

            public final CustomColorDto getColor() {
                return this.color;
            }

            public final boolean getHighlighted() {
                return this.highlighted;
            }
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$ContractInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ContractInfoDto, MultiContractsHeroDetails.ContractInfo> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ContractInfoDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContractInfoDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ContractInfoDto> getBinaryBase64Serializer() {
                return (KSerializer) ContractInfoDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MultiContractsHeroDetails.ContractInfo> getProtoAdapter() {
                return MultiContractsHeroDetails.ContractInfo.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContractInfoDto getZeroValue() {
                return ContractInfoDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ContractInfoDto fromProto(MultiContractsHeroDetails.ContractInfo proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String id = proto.getId();
                String title = proto.getTitle();
                String display_value = proto.getDisplay_value();
                double graph_relative_length = proto.getGraph_relative_length();
                CustomColor color = proto.getColor();
                return new ContractInfoDto(new Surrogate(id, title, display_value, graph_relative_length, color != null ? CustomColorDto.INSTANCE.fromProto(color) : null, proto.getHighlighted()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.MultiContractsHeroDetailsDto$ContractInfoDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiContractsHeroDetailsDto.ContractInfoDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ContractInfoDto(null, null, null, 0.0d, null, false, 63, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ContractInfoDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.MultiContractsHeroDetails.ContractInfo", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ContractInfoDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ContractInfoDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ContractInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$ContractInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "search_coprocessor.v1.MultiContractsHeroDetailsDto$ContractInfoDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultiContractsHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "Lcom/robinhood/idl/EnumDto;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_STYLE_UNSPECIFIED", "BREAKDOWN_BAR", "DISTRIBUTION_CHART", "STACKED_BARS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class DisplayStyleDto implements Dto2<MultiContractsHeroDetails.DisplayStyle>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ DisplayStyleDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<DisplayStyleDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<DisplayStyleDto, MultiContractsHeroDetails.DisplayStyle>> binaryBase64Serializer$delegate;
        public static final DisplayStyleDto DISPLAY_STYLE_UNSPECIFIED = new DISPLAY_STYLE_UNSPECIFIED("DISPLAY_STYLE_UNSPECIFIED", 0);
        public static final DisplayStyleDto BREAKDOWN_BAR = new BREAKDOWN_BAR("BREAKDOWN_BAR", 1);
        public static final DisplayStyleDto DISTRIBUTION_CHART = new DISTRIBUTION_CHART("DISTRIBUTION_CHART", 2);
        public static final DisplayStyleDto STACKED_BARS = new STACKED_BARS("STACKED_BARS", 3);

        private static final /* synthetic */ DisplayStyleDto[] $values() {
            return new DisplayStyleDto[]{DISPLAY_STYLE_UNSPECIFIED, BREAKDOWN_BAR, DISTRIBUTION_CHART, STACKED_BARS};
        }

        public /* synthetic */ DisplayStyleDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<DisplayStyleDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private DisplayStyleDto(String str, int i) {
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/MultiContractsHeroDetailsDto.DisplayStyleDto.DISPLAY_STYLE_UNSPECIFIED", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "toProto", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISPLAY_STYLE_UNSPECIFIED extends DisplayStyleDto {
            DISPLAY_STYLE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MultiContractsHeroDetails.DisplayStyle toProto() {
                return MultiContractsHeroDetails.DisplayStyle.DISPLAY_STYLE_UNSPECIFIED;
            }
        }

        static {
            DisplayStyleDto[] displayStyleDtoArr$values = $values();
            $VALUES = displayStyleDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(displayStyleDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: search_coprocessor.v1.MultiContractsHeroDetailsDto$DisplayStyleDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MultiContractsHeroDetailsDto.DisplayStyleDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/MultiContractsHeroDetailsDto.DisplayStyleDto.BREAKDOWN_BAR", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "toProto", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BREAKDOWN_BAR extends DisplayStyleDto {
            BREAKDOWN_BAR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MultiContractsHeroDetails.DisplayStyle toProto() {
                return MultiContractsHeroDetails.DisplayStyle.BREAKDOWN_BAR;
            }
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/MultiContractsHeroDetailsDto.DisplayStyleDto.DISTRIBUTION_CHART", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "toProto", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISTRIBUTION_CHART extends DisplayStyleDto {
            DISTRIBUTION_CHART(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MultiContractsHeroDetails.DisplayStyle toProto() {
                return MultiContractsHeroDetails.DisplayStyle.DISTRIBUTION_CHART;
            }
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"search_coprocessor/v1/MultiContractsHeroDetailsDto.DisplayStyleDto.STACKED_BARS", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "toProto", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STACKED_BARS extends DisplayStyleDto {
            STACKED_BARS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public MultiContractsHeroDetails.DisplayStyle toProto() {
                return MultiContractsHeroDetails.DisplayStyle.STACKED_BARS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "Lsearch_coprocessor/v1/MultiContractsHeroDetails$DisplayStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<DisplayStyleDto, MultiContractsHeroDetails.DisplayStyle> {

            /* compiled from: MultiContractsHeroDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[MultiContractsHeroDetails.DisplayStyle.values().length];
                    try {
                        iArr[MultiContractsHeroDetails.DisplayStyle.DISPLAY_STYLE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[MultiContractsHeroDetails.DisplayStyle.BREAKDOWN_BAR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[MultiContractsHeroDetails.DisplayStyle.DISTRIBUTION_CHART.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[MultiContractsHeroDetails.DisplayStyle.STACKED_BARS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<DisplayStyleDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DisplayStyleDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<DisplayStyleDto> getBinaryBase64Serializer() {
                return (KSerializer) DisplayStyleDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<MultiContractsHeroDetails.DisplayStyle> getProtoAdapter() {
                return MultiContractsHeroDetails.DisplayStyle.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DisplayStyleDto getZeroValue() {
                return DisplayStyleDto.DISPLAY_STYLE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DisplayStyleDto fromProto(MultiContractsHeroDetails.DisplayStyle proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return DisplayStyleDto.DISPLAY_STYLE_UNSPECIFIED;
                }
                if (i == 2) {
                    return DisplayStyleDto.BREAKDOWN_BAR;
                }
                if (i == 3) {
                    return DisplayStyleDto.DISTRIBUTION_CHART;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return DisplayStyleDto.STACKED_BARS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: MultiContractsHeroDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$DisplayStyleDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<DisplayStyleDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<DisplayStyleDto, MultiContractsHeroDetails.DisplayStyle> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/search_coprocessor.v1.MultiContractsHeroDetails.DisplayStyle", DisplayStyleDto.getEntries(), DisplayStyleDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public DisplayStyleDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (DisplayStyleDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, DisplayStyleDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static DisplayStyleDto valueOf(String str) {
            return (DisplayStyleDto) Enum.valueOf(DisplayStyleDto.class, str);
        }

        public static DisplayStyleDto[] values() {
            return (DisplayStyleDto[]) $VALUES.clone();
        }
    }

    /* compiled from: MultiContractsHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MultiContractsHeroDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/search_coprocessor.v1.MultiContractsHeroDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MultiContractsHeroDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MultiContractsHeroDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MultiContractsHeroDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MultiContractsHeroDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lsearch_coprocessor/v1/MultiContractsHeroDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "search_coprocessor.v1.MultiContractsHeroDetailsDto";
        }
    }
}
