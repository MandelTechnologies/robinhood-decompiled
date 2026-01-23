package rosetta.portfolio.p541v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.common.CurrencyDto;
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
import rosetta.portfolio.p541v1.AssetClassDto;
import rosetta.portfolio.p541v1.GetRealizedPerformanceSummaryRequestDto;
import rosetta.portfolio.p541v1.SpanDto;

/* compiled from: GetRealizedPerformanceSummaryRequestDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequest;", "Landroid/os/Parcelable;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;)V", "", "rhs_account_number", "", "Lrosetta/portfolio/v1/SpanDto;", "spans", "Lrosetta/portfolio/v1/AssetClassDto;", "asset_classes", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/CurrencyDto;)V", "toProto", "()Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;", "getRhs_account_number", "getSpans", "()Ljava/util/List;", "getAsset_classes", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes23.dex */
public final class GetRealizedPerformanceSummaryRequestDto implements Dto3<GetRealizedPerformanceSummaryRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetRealizedPerformanceSummaryRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetRealizedPerformanceSummaryRequestDto, GetRealizedPerformanceSummaryRequest>> binaryBase64Serializer$delegate;
    private static final GetRealizedPerformanceSummaryRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetRealizedPerformanceSummaryRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetRealizedPerformanceSummaryRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final List<SpanDto> getSpans() {
        return this.surrogate.getSpans();
    }

    public final List<AssetClassDto> getAsset_classes() {
        return this.surrogate.getAsset_classes();
    }

    public final CurrencyDto getDisplay_currency() {
        return this.surrogate.getDisplay_currency();
    }

    public /* synthetic */ GetRealizedPerformanceSummaryRequestDto(String str, List list, List list2, CurrencyDto currencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetRealizedPerformanceSummaryRequestDto(String rhs_account_number, List<? extends SpanDto> spans, List<? extends AssetClassDto> asset_classes, CurrencyDto display_currency) {
        this(new Surrogate(rhs_account_number, spans, asset_classes, display_currency));
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
        Intrinsics.checkNotNullParameter(display_currency, "display_currency");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetRealizedPerformanceSummaryRequest toProto() {
        String rhs_account_number = this.surrogate.getRhs_account_number();
        List<SpanDto> spans = this.surrogate.getSpans();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans, 10));
        Iterator<T> it = spans.iterator();
        while (it.hasNext()) {
            arrayList.add((Span) ((SpanDto) it.next()).toProto());
        }
        List<AssetClassDto> asset_classes = this.surrogate.getAsset_classes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
        Iterator<T> it2 = asset_classes.iterator();
        while (it2.hasNext()) {
            arrayList2.add((AssetClass) ((AssetClassDto) it2.next()).toProto());
        }
        return new GetRealizedPerformanceSummaryRequest(rhs_account_number, arrayList, arrayList2, (Currency) this.surrogate.getDisplay_currency().toProto(), null, 16, null);
    }

    public String toString() {
        return "[GetRealizedPerformanceSummaryRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetRealizedPerformanceSummaryRequestDto) && Intrinsics.areEqual(((GetRealizedPerformanceSummaryRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetRealizedPerformanceSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b,\u0010&\u001a\u0004\b+\u0010)R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010&\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;", "", "", "rhs_account_number", "", "Lrosetta/portfolio/v1/SpanDto;", "spans", "Lrosetta/portfolio/v1/AssetClassDto;", "asset_classes", "Lcom/robinhood/rosetta/common/CurrencyDto;", "display_currency", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/CurrencyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/rosetta/common/CurrencyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$portfolio_v1_externalRelease", "(Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRhs_account_number", "getRhs_account_number$annotations", "()V", "Ljava/util/List;", "getSpans", "()Ljava/util/List;", "getSpans$annotations", "getAsset_classes", "getAsset_classes$annotations", "Lcom/robinhood/rosetta/common/CurrencyDto;", "getDisplay_currency", "()Lcom/robinhood/rosetta/common/CurrencyDto;", "getDisplay_currency$annotations", "Companion", "$serializer", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<AssetClassDto> asset_classes;
        private final CurrencyDto display_currency;
        private final String rhs_account_number;
        private final List<SpanDto> spans;

        public Surrogate() {
            this((String) null, (List) null, (List) null, (CurrencyDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(SpanDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(AssetClassDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && Intrinsics.areEqual(this.spans, surrogate.spans) && Intrinsics.areEqual(this.asset_classes, surrogate.asset_classes) && this.display_currency == surrogate.display_currency;
        }

        public int hashCode() {
            return (((((this.rhs_account_number.hashCode() * 31) + this.spans.hashCode()) * 31) + this.asset_classes.hashCode()) * 31) + this.display_currency.hashCode();
        }

        public String toString() {
            return "Surrogate(rhs_account_number=" + this.rhs_account_number + ", spans=" + this.spans + ", asset_classes=" + this.asset_classes + ", display_currency=" + this.display_currency + ")";
        }

        /* compiled from: GetRealizedPerformanceSummaryRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetRealizedPerformanceSummaryRequestDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rosetta.portfolio.v1.GetRealizedPerformanceSummaryRequestDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetRealizedPerformanceSummaryRequestDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: rosetta.portfolio.v1.GetRealizedPerformanceSummaryRequestDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetRealizedPerformanceSummaryRequestDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, String str, List list, List list2, CurrencyDto currencyDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.rhs_account_number = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.spans = CollectionsKt.emptyList();
            } else {
                this.spans = list;
            }
            if ((i & 4) == 0) {
                this.asset_classes = CollectionsKt.emptyList();
            } else {
                this.asset_classes = list2;
            }
            if ((i & 8) == 0) {
                this.display_currency = CurrencyDto.INSTANCE.getZeroValue();
            } else {
                this.display_currency = currencyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$portfolio_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.rhs_account_number, "")) {
                output.encodeStringElement(serialDesc, 0, self.rhs_account_number);
            }
            if (!Intrinsics.areEqual(self.spans, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.spans);
            }
            if (!Intrinsics.areEqual(self.asset_classes, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.asset_classes);
            }
            if (self.display_currency != CurrencyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, CurrencyDto.Serializer.INSTANCE, self.display_currency);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String rhs_account_number, List<? extends SpanDto> spans, List<? extends AssetClassDto> asset_classes, CurrencyDto display_currency) {
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            Intrinsics.checkNotNullParameter(spans, "spans");
            Intrinsics.checkNotNullParameter(asset_classes, "asset_classes");
            Intrinsics.checkNotNullParameter(display_currency, "display_currency");
            this.rhs_account_number = rhs_account_number;
            this.spans = spans;
            this.asset_classes = asset_classes;
            this.display_currency = display_currency;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public /* synthetic */ Surrogate(String str, List list, List list2, CurrencyDto currencyDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CurrencyDto.INSTANCE.getZeroValue() : currencyDto);
        }

        public final List<SpanDto> getSpans() {
            return this.spans;
        }

        public final List<AssetClassDto> getAsset_classes() {
            return this.asset_classes;
        }

        public final CurrencyDto getDisplay_currency() {
            return this.display_currency;
        }
    }

    /* compiled from: GetRealizedPerformanceSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetRealizedPerformanceSummaryRequestDto, GetRealizedPerformanceSummaryRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetRealizedPerformanceSummaryRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedPerformanceSummaryRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetRealizedPerformanceSummaryRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetRealizedPerformanceSummaryRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetRealizedPerformanceSummaryRequest> getProtoAdapter() {
            return GetRealizedPerformanceSummaryRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedPerformanceSummaryRequestDto getZeroValue() {
            return GetRealizedPerformanceSummaryRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetRealizedPerformanceSummaryRequestDto fromProto(GetRealizedPerformanceSummaryRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String rhs_account_number = proto.getRhs_account_number();
            List<Span> spans = proto.getSpans();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(spans, 10));
            Iterator<T> it = spans.iterator();
            while (it.hasNext()) {
                arrayList.add(SpanDto.INSTANCE.fromProto((Span) it.next()));
            }
            List<AssetClass> asset_classes = proto.getAsset_classes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(asset_classes, 10));
            Iterator<T> it2 = asset_classes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(AssetClassDto.INSTANCE.fromProto((AssetClass) it2.next()));
            }
            return new GetRealizedPerformanceSummaryRequestDto(new Surrogate(rhs_account_number, arrayList, arrayList2, CurrencyDto.INSTANCE.fromProto(proto.getDisplay_currency())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.portfolio.v1.GetRealizedPerformanceSummaryRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetRealizedPerformanceSummaryRequestDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new GetRealizedPerformanceSummaryRequestDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetRealizedPerformanceSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<GetRealizedPerformanceSummaryRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.portfolio.v1.GetRealizedPerformanceSummaryRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetRealizedPerformanceSummaryRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetRealizedPerformanceSummaryRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetRealizedPerformanceSummaryRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetRealizedPerformanceSummaryRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/portfolio/v1/GetRealizedPerformanceSummaryRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rosetta.portfolio.v1.GetRealizedPerformanceSummaryRequestDto";
        }
    }
}
