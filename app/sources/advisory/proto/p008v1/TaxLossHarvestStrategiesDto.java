package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestStrategiesBannerDto;
import advisory.proto.p008v1.TaxLossHarvestStrategiesDto;
import advisory.proto.p008v1.TaxLossHarvestStrategyDto;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
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

/* compiled from: TaxLossHarvestStrategiesDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestStrategies;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;)V", "", "title", "", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto;", "strategies", "disclosure_markdown", "Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestStrategies;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;", "getTitle", "getStrategies", "()Ljava/util/List;", "getDisclosure_markdown", "getBanner", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class TaxLossHarvestStrategiesDto implements Dto3<TaxLossHarvestStrategies>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestStrategiesDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestStrategiesDto, TaxLossHarvestStrategies>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestStrategiesDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestStrategiesDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestStrategiesDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final List<TaxLossHarvestStrategyDto> getStrategies() {
        return this.surrogate.getStrategies();
    }

    public final String getDisclosure_markdown() {
        return this.surrogate.getDisclosure_markdown();
    }

    public final TaxLossHarvestStrategiesBannerDto getBanner() {
        return this.surrogate.getBanner();
    }

    public /* synthetic */ TaxLossHarvestStrategiesDto(String str, List list, String str2, TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : taxLossHarvestStrategiesBannerDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestStrategiesDto(String title, List<TaxLossHarvestStrategyDto> strategies, String disclosure_markdown, TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto) {
        this(new Surrogate(title, strategies, disclosure_markdown, taxLossHarvestStrategiesBannerDto));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
    }

    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestStrategies toProto() {
        String title = this.surrogate.getTitle();
        List<TaxLossHarvestStrategyDto> strategies = this.surrogate.getStrategies();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(strategies, 10));
        Iterator<T> it = strategies.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLossHarvestStrategyDto) it.next()).toProto());
        }
        String disclosure_markdown = this.surrogate.getDisclosure_markdown();
        TaxLossHarvestStrategiesBannerDto banner = this.surrogate.getBanner();
        return new TaxLossHarvestStrategies(title, arrayList, disclosure_markdown, banner != null ? banner.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[TaxLossHarvestStrategiesDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestStrategiesDto) && Intrinsics.areEqual(((TaxLossHarvestStrategiesDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestStrategiesDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;", "", "", "title", "", "Ladvisory/proto/v1/TaxLossHarvestStrategyDto;", "strategies", "disclosure_markdown", "Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getStrategies", "()Ljava/util/List;", "getStrategies$annotations", "getDisclosure_markdown", "getDisclosure_markdown$annotations", "Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;", "getBanner", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesBannerDto;", "getBanner$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final TaxLossHarvestStrategiesBannerDto banner;
        private final String disclosure_markdown;
        private final List<TaxLossHarvestStrategyDto> strategies;
        private final String title;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: advisory.proto.v1.TaxLossHarvestStrategiesDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestStrategiesDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (TaxLossHarvestStrategiesBannerDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLossHarvestStrategyDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.strategies, surrogate.strategies) && Intrinsics.areEqual(this.disclosure_markdown, surrogate.disclosure_markdown) && Intrinsics.areEqual(this.banner, surrogate.banner);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.strategies.hashCode()) * 31) + this.disclosure_markdown.hashCode()) * 31;
            TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto = this.banner;
            return iHashCode + (taxLossHarvestStrategiesBannerDto == null ? 0 : taxLossHarvestStrategiesBannerDto.hashCode());
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", strategies=" + this.strategies + ", disclosure_markdown=" + this.disclosure_markdown + ", banner=" + this.banner + ")";
        }

        /* compiled from: TaxLossHarvestStrategiesDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestStrategiesDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.strategies = CollectionsKt.emptyList();
            } else {
                this.strategies = list;
            }
            if ((i & 4) == 0) {
                this.disclosure_markdown = "";
            } else {
                this.disclosure_markdown = str2;
            }
            if ((i & 8) == 0) {
                this.banner = null;
            } else {
                this.banner = taxLossHarvestStrategiesBannerDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!Intrinsics.areEqual(self.strategies, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.strategies);
            }
            if (!Intrinsics.areEqual(self.disclosure_markdown, "")) {
                output.encodeStringElement(serialDesc, 2, self.disclosure_markdown);
            }
            TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto = self.banner;
            if (taxLossHarvestStrategiesBannerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TaxLossHarvestStrategiesBannerDto.Serializer.INSTANCE, taxLossHarvestStrategiesBannerDto);
            }
        }

        public Surrogate(String title, List<TaxLossHarvestStrategyDto> strategies, String disclosure_markdown, TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(strategies, "strategies");
            Intrinsics.checkNotNullParameter(disclosure_markdown, "disclosure_markdown");
            this.title = title;
            this.strategies = strategies;
            this.disclosure_markdown = disclosure_markdown;
            this.banner = taxLossHarvestStrategiesBannerDto;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, TaxLossHarvestStrategiesBannerDto taxLossHarvestStrategiesBannerDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : taxLossHarvestStrategiesBannerDto);
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<TaxLossHarvestStrategyDto> getStrategies() {
            return this.strategies;
        }

        public final String getDisclosure_markdown() {
            return this.disclosure_markdown;
        }

        public final TaxLossHarvestStrategiesBannerDto getBanner() {
            return this.banner;
        }
    }

    /* compiled from: TaxLossHarvestStrategiesDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "Ladvisory/proto/v1/TaxLossHarvestStrategies;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestStrategiesDto, TaxLossHarvestStrategies> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestStrategiesDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestStrategiesDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestStrategiesDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestStrategiesDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestStrategies> getProtoAdapter() {
            return TaxLossHarvestStrategies.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestStrategiesDto getZeroValue() {
            return TaxLossHarvestStrategiesDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestStrategiesDto fromProto(TaxLossHarvestStrategies proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            List<TaxLossHarvestStrategy> strategies = proto.getStrategies();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(strategies, 10));
            Iterator<T> it = strategies.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLossHarvestStrategyDto.INSTANCE.fromProto((TaxLossHarvestStrategy) it.next()));
            }
            String disclosure_markdown = proto.getDisclosure_markdown();
            TaxLossHarvestStrategiesBanner banner = proto.getBanner();
            return new TaxLossHarvestStrategiesDto(new Surrogate(title, arrayList, disclosure_markdown, banner != null ? TaxLossHarvestStrategiesBannerDto.INSTANCE.fromProto(banner) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestStrategiesDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestStrategiesDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TaxLossHarvestStrategiesDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestStrategiesDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestStrategiesDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestStrategies", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestStrategiesDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestStrategiesDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestStrategiesDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestStrategiesDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestStrategiesDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestStrategiesDto";
        }
    }
}
