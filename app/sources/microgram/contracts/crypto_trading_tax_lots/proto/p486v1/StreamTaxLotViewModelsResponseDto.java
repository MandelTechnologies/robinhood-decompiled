package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import android.os.Parcel;
import android.os.Parcelable;
import cbc.service.p048v1.TermType;
import cbc.service.p048v1.TermTypeDto;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
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
import kotlinx.serialization.internal.StringSerializer;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponse;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponseDto;
import nummus.p512v1.SortDirection;
import nummus.p512v1.SortDirectionDto;
import nummus.p512v1.TaxLotSortType;
import nummus.p512v1.TaxLotSortTypeDto;

/* compiled from: StreamTaxLotViewModelsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*)+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006/"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;)V", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "headers", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto;", "tax_lot_rows", "", "has_next", "(Ljava/util/List;Ljava/util/List;Z)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;", "getHeaders", "()Ljava/util/List;", "getTax_lot_rows", "getHas_next", "()Z", "Companion", "Surrogate", "HeaderDto", "TaxLotRowDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class StreamTaxLotViewModelsResponseDto implements Dto3<StreamTaxLotViewModelsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamTaxLotViewModelsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamTaxLotViewModelsResponseDto, StreamTaxLotViewModelsResponse>> binaryBase64Serializer$delegate;
    private static final StreamTaxLotViewModelsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamTaxLotViewModelsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamTaxLotViewModelsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<HeaderDto> getHeaders() {
        return this.surrogate.getHeaders();
    }

    public final List<TaxLotRowDto> getTax_lot_rows() {
        return this.surrogate.getTax_lot_rows();
    }

    public final boolean getHas_next() {
        return this.surrogate.getHas_next();
    }

    public /* synthetic */ StreamTaxLotViewModelsResponseDto(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamTaxLotViewModelsResponseDto(List<HeaderDto> headers, List<TaxLotRowDto> tax_lot_rows, boolean z) {
        this(new Surrogate(headers, tax_lot_rows, z));
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tax_lot_rows, "tax_lot_rows");
    }

    @Override // com.robinhood.idl.Dto
    public StreamTaxLotViewModelsResponse toProto() {
        List<HeaderDto> headers = this.surrogate.getHeaders();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(headers, 10));
        Iterator<T> it = headers.iterator();
        while (it.hasNext()) {
            arrayList.add(((HeaderDto) it.next()).toProto());
        }
        List<TaxLotRowDto> tax_lot_rows = this.surrogate.getTax_lot_rows();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_rows, 10));
        Iterator<T> it2 = tax_lot_rows.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TaxLotRowDto) it2.next()).toProto());
        }
        return new StreamTaxLotViewModelsResponse(arrayList, arrayList2, this.surrogate.getHas_next(), null, 8, null);
    }

    public String toString() {
        return "[StreamTaxLotViewModelsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamTaxLotViewModelsResponseDto) && Intrinsics.areEqual(((StreamTaxLotViewModelsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b+\u0010%\u001a\u0004\b)\u0010*¨\u0006."}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;", "", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "headers", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto;", "tax_lot_rows", "", "has_next", "<init>", "(Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "getHeaders$annotations", "()V", "getTax_lot_rows", "getTax_lot_rows$annotations", "Z", "getHas_next", "()Z", "getHas_next$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean has_next;
        private final List<HeaderDto> headers;
        private final List<TaxLotRowDto> tax_lot_rows;

        public Surrogate() {
            this((List) null, (List) null, false, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(HeaderDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(TaxLotRowDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.headers, surrogate.headers) && Intrinsics.areEqual(this.tax_lot_rows, surrogate.tax_lot_rows) && this.has_next == surrogate.has_next;
        }

        public int hashCode() {
            return (((this.headers.hashCode() * 31) + this.tax_lot_rows.hashCode()) * 31) + Boolean.hashCode(this.has_next);
        }

        public String toString() {
            return "Surrogate(headers=" + this.headers + ", tax_lot_rows=" + this.tax_lot_rows + ", has_next=" + this.has_next + ")";
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamTaxLotViewModelsResponseDto$Surrogate$$serializer.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotViewModelsResponseDto.Surrogate._childSerializers$_anonymous_();
                }
            }), LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotViewModelsResponseDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null};
        }

        public /* synthetic */ Surrogate(int i, List list, List list2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.headers = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.tax_lot_rows = CollectionsKt.emptyList();
            } else {
                this.tax_lot_rows = list2;
            }
            if ((i & 4) == 0) {
                this.has_next = false;
            } else {
                this.has_next = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.headers, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.headers);
            }
            if (!Intrinsics.areEqual(self.tax_lot_rows, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.tax_lot_rows);
            }
            boolean z = self.has_next;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
        }

        public Surrogate(List<HeaderDto> headers, List<TaxLotRowDto> tax_lot_rows, boolean z) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(tax_lot_rows, "tax_lot_rows");
            this.headers = headers;
            this.tax_lot_rows = tax_lot_rows;
            this.has_next = z;
        }

        public final List<HeaderDto> getHeaders() {
            return this.headers;
        }

        public /* synthetic */ Surrogate(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z);
        }

        public final List<TaxLotRowDto> getTax_lot_rows() {
            return this.tax_lot_rows;
        }

        public final boolean getHas_next() {
            return this.has_next;
        }
    }

    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamTaxLotViewModelsResponseDto, StreamTaxLotViewModelsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamTaxLotViewModelsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotViewModelsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamTaxLotViewModelsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamTaxLotViewModelsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamTaxLotViewModelsResponse> getProtoAdapter() {
            return StreamTaxLotViewModelsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotViewModelsResponseDto getZeroValue() {
            return StreamTaxLotViewModelsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamTaxLotViewModelsResponseDto fromProto(StreamTaxLotViewModelsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<StreamTaxLotViewModelsResponse.Header> headers = proto.getHeaders();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(headers, 10));
            Iterator<T> it = headers.iterator();
            while (it.hasNext()) {
                arrayList.add(HeaderDto.INSTANCE.fromProto((StreamTaxLotViewModelsResponse.Header) it.next()));
            }
            List<StreamTaxLotViewModelsResponse.TaxLotRow> tax_lot_rows = proto.getTax_lot_rows();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lot_rows, 10));
            Iterator<T> it2 = tax_lot_rows.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TaxLotRowDto.INSTANCE.fromProto((StreamTaxLotViewModelsResponse.TaxLotRow) it2.next()));
            }
            return new StreamTaxLotViewModelsResponseDto(new Surrogate(arrayList, arrayList2, proto.getHas_next()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamTaxLotViewModelsResponseDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new StreamTaxLotViewModelsResponseDto(null, null, false, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;", "type", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;", "getType", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "SortableDto", "NonSortableDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class HeaderDto implements Dto3<StreamTaxLotViewModelsResponse.Header>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<HeaderDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<HeaderDto, StreamTaxLotViewModelsResponse.Header>> binaryBase64Serializer$delegate;
        private static final HeaderDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ HeaderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private HeaderDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final TypeDto getType() {
            if (this.surrogate.getSortable() != null) {
                return new TypeDto.Sortable(this.surrogate.getSortable());
            }
            if (this.surrogate.getNon_sortable() != null) {
                return new TypeDto.NonSortable(this.surrogate.getNon_sortable());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public HeaderDto(TypeDto typeDto) {
            TypeDto.Sortable sortable = typeDto instanceof TypeDto.Sortable ? (TypeDto.Sortable) typeDto : null;
            SortableDto value = sortable != null ? sortable.getValue() : null;
            TypeDto.NonSortable nonSortable = typeDto instanceof TypeDto.NonSortable ? (TypeDto.NonSortable) typeDto : null;
            this(new Surrogate(value, nonSortable != null ? nonSortable.getValue() : null));
        }

        public /* synthetic */ HeaderDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : typeDto);
        }

        @Override // com.robinhood.idl.Dto
        public StreamTaxLotViewModelsResponse.Header toProto() {
            SortableDto sortable = this.surrogate.getSortable();
            StreamTaxLotViewModelsResponse.Header.Sortable proto = sortable != null ? sortable.toProto() : null;
            NonSortableDto non_sortable = this.surrogate.getNon_sortable();
            return new StreamTaxLotViewModelsResponse.Header(proto, non_sortable != null ? non_sortable.toProto() : null, null, 4, null);
        }

        public String toString() {
            return "[HeaderDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof HeaderDto) && Intrinsics.areEqual(((HeaderDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "sortable", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "non_sortable", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "getSortable", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "getSortable$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "getNon_sortable", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "getNon_sortable$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final NonSortableDto non_sortable;
            private final SortableDto sortable;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((SortableDto) null, (NonSortableDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.sortable, surrogate.sortable) && Intrinsics.areEqual(this.non_sortable, surrogate.non_sortable);
            }

            public int hashCode() {
                SortableDto sortableDto = this.sortable;
                int iHashCode = (sortableDto == null ? 0 : sortableDto.hashCode()) * 31;
                NonSortableDto nonSortableDto = this.non_sortable;
                return iHashCode + (nonSortableDto != null ? nonSortableDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(sortable=" + this.sortable + ", non_sortable=" + this.non_sortable + ")";
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C46465x266c4a1d.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, SortableDto sortableDto, NonSortableDto nonSortableDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.sortable = null;
                } else {
                    this.sortable = sortableDto;
                }
                if ((i & 2) == 0) {
                    this.non_sortable = null;
                } else {
                    this.non_sortable = nonSortableDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                SortableDto sortableDto = self.sortable;
                if (sortableDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, SortableDto.Serializer.INSTANCE, sortableDto);
                }
                NonSortableDto nonSortableDto = self.non_sortable;
                if (nonSortableDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, NonSortableDto.Serializer.INSTANCE, nonSortableDto);
                }
            }

            public Surrogate(SortableDto sortableDto, NonSortableDto nonSortableDto) {
                this.sortable = sortableDto;
                this.non_sortable = nonSortableDto;
            }

            public /* synthetic */ Surrogate(SortableDto sortableDto, NonSortableDto nonSortableDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : sortableDto, (i & 2) != 0 ? null : nonSortableDto);
            }

            public final SortableDto getSortable() {
                return this.sortable;
            }

            public final NonSortableDto getNon_sortable() {
                return this.non_sortable;
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<HeaderDto, StreamTaxLotViewModelsResponse.Header> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<HeaderDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<HeaderDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<HeaderDto> getBinaryBase64Serializer() {
                return (KSerializer) HeaderDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamTaxLotViewModelsResponse.Header> getProtoAdapter() {
                return StreamTaxLotViewModelsResponse.Header.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HeaderDto getZeroValue() {
                return HeaderDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HeaderDto fromProto(StreamTaxLotViewModelsResponse.Header proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                StreamTaxLotViewModelsResponse.Header.Sortable sortable = proto.getSortable();
                DefaultConstructorMarker defaultConstructorMarker = null;
                SortableDto sortableDtoFromProto = sortable != null ? SortableDto.INSTANCE.fromProto(sortable) : null;
                StreamTaxLotViewModelsResponse.Header.NonSortable non_sortable = proto.getNon_sortable();
                return new HeaderDto(new Surrogate(sortableDtoFromProto, non_sortable != null ? NonSortableDto.INSTANCE.fromProto(non_sortable) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$HeaderDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotViewModelsResponseDto.HeaderDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new HeaderDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Sortable", "NonSortable", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto$NonSortable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto$Sortable;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class TypeDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TypeDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto$Sortable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Sortable extends TypeDto {
                private final SortableDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Sortable) && Intrinsics.areEqual(this.value, ((Sortable) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Sortable(value=" + this.value + ")";
                }

                public final SortableDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Sortable(SortableDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto$NonSortable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class NonSortable extends TypeDto {
                private final NonSortableDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NonSortable) && Intrinsics.areEqual(this.value, ((NonSortable) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "NonSortable(value=" + this.value + ")";
                }

                public final NonSortableDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NonSortable(NonSortableDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<TypeDto, StreamTaxLotViewModelsResponse.Header> {
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
                public ProtoAdapter<StreamTaxLotViewModelsResponse.Header> getProtoAdapter() {
                    return StreamTaxLotViewModelsResponse.Header.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(StreamTaxLotViewModelsResponse.Header proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getSortable() != null) {
                        return new Sortable(SortableDto.INSTANCE.fromProto(proto.getSortable()));
                    }
                    if (proto.getNon_sortable() != null) {
                        return new NonSortable(NonSortableDto.INSTANCE.fromProto(proto.getNon_sortable()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0013¨\u0006."}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;)V", "Lnummus/v1/TaxLotSortTypeDto;", "sort_type", "Lnummus/v1/SortDirectionDto;", "sort_direction", "next_sort_direction", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "(Lnummus/v1/TaxLotSortTypeDto;Lnummus/v1/SortDirectionDto;Lnummus/v1/SortDirectionDto;Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;", "getSort_type", "()Lnummus/v1/TaxLotSortTypeDto;", "getSort_direction", "()Lnummus/v1/SortDirectionDto;", "getNext_sort_direction", "getDisplay_name", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SortableDto implements Dto3<StreamTaxLotViewModelsResponse.Header.Sortable>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<SortableDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SortableDto, StreamTaxLotViewModelsResponse.Header.Sortable>> binaryBase64Serializer$delegate;
            private static final SortableDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ SortableDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SortableDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final TaxLotSortTypeDto getSort_type() {
                return this.surrogate.getSort_type();
            }

            public final SortDirectionDto getSort_direction() {
                return this.surrogate.getSort_direction();
            }

            public final SortDirectionDto getNext_sort_direction() {
                return this.surrogate.getNext_sort_direction();
            }

            public final String getDisplay_name() {
                return this.surrogate.getDisplay_name();
            }

            public /* synthetic */ SortableDto(TaxLotSortTypeDto taxLotSortTypeDto, SortDirectionDto sortDirectionDto, SortDirectionDto sortDirectionDto2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? TaxLotSortTypeDto.INSTANCE.getZeroValue() : taxLotSortTypeDto, (i & 2) != 0 ? null : sortDirectionDto, (i & 4) != 0 ? SortDirectionDto.INSTANCE.getZeroValue() : sortDirectionDto2, (i & 8) != 0 ? "" : str);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public SortableDto(TaxLotSortTypeDto sort_type, SortDirectionDto sortDirectionDto, SortDirectionDto next_sort_direction, String display_name) {
                this(new Surrogate(sort_type, sortDirectionDto, next_sort_direction, display_name));
                Intrinsics.checkNotNullParameter(sort_type, "sort_type");
                Intrinsics.checkNotNullParameter(next_sort_direction, "next_sort_direction");
                Intrinsics.checkNotNullParameter(display_name, "display_name");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamTaxLotViewModelsResponse.Header.Sortable toProto() {
                TaxLotSortType taxLotSortType = (TaxLotSortType) this.surrogate.getSort_type().toProto();
                SortDirectionDto sort_direction = this.surrogate.getSort_direction();
                return new StreamTaxLotViewModelsResponse.Header.Sortable(taxLotSortType, sort_direction != null ? (SortDirection) sort_direction.toProto() : null, (SortDirection) this.surrogate.getNext_sort_direction().toProto(), this.surrogate.getDisplay_name(), null, 16, null);
            }

            public String toString() {
                return "[SortableDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof SortableDto) && Intrinsics.areEqual(((SortableDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;", "", "Lnummus/v1/TaxLotSortTypeDto;", "sort_type", "Lnummus/v1/SortDirectionDto;", "sort_direction", "next_sort_direction", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "<init>", "(Lnummus/v1/TaxLotSortTypeDto;Lnummus/v1/SortDirectionDto;Lnummus/v1/SortDirectionDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILnummus/v1/TaxLotSortTypeDto;Lnummus/v1/SortDirectionDto;Lnummus/v1/SortDirectionDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnummus/v1/TaxLotSortTypeDto;", "getSort_type", "()Lnummus/v1/TaxLotSortTypeDto;", "getSort_type$annotations", "()V", "Lnummus/v1/SortDirectionDto;", "getSort_direction", "()Lnummus/v1/SortDirectionDto;", "getSort_direction$annotations", "getNext_sort_direction", "getNext_sort_direction$annotations", "Ljava/lang/String;", "getDisplay_name", "getDisplay_name$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String display_name;
                private final SortDirectionDto next_sort_direction;
                private final SortDirectionDto sort_direction;
                private final TaxLotSortTypeDto sort_type;

                public Surrogate() {
                    this((TaxLotSortTypeDto) null, (SortDirectionDto) null, (SortDirectionDto) null, (String) null, 15, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return this.sort_type == surrogate.sort_type && this.sort_direction == surrogate.sort_direction && this.next_sort_direction == surrogate.next_sort_direction && Intrinsics.areEqual(this.display_name, surrogate.display_name);
                }

                public int hashCode() {
                    int iHashCode = this.sort_type.hashCode() * 31;
                    SortDirectionDto sortDirectionDto = this.sort_direction;
                    return ((((iHashCode + (sortDirectionDto == null ? 0 : sortDirectionDto.hashCode())) * 31) + this.next_sort_direction.hashCode()) * 31) + this.display_name.hashCode();
                }

                public String toString() {
                    return "Surrogate(sort_type=" + this.sort_type + ", sort_direction=" + this.sort_direction + ", next_sort_direction=" + this.next_sort_direction + ", display_name=" + this.display_name + ")";
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C46464x7344a360.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, TaxLotSortTypeDto taxLotSortTypeDto, SortDirectionDto sortDirectionDto, SortDirectionDto sortDirectionDto2, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    this.sort_type = (i & 1) == 0 ? TaxLotSortTypeDto.INSTANCE.getZeroValue() : taxLotSortTypeDto;
                    if ((i & 2) == 0) {
                        this.sort_direction = null;
                    } else {
                        this.sort_direction = sortDirectionDto;
                    }
                    if ((i & 4) == 0) {
                        this.next_sort_direction = SortDirectionDto.INSTANCE.getZeroValue();
                    } else {
                        this.next_sort_direction = sortDirectionDto2;
                    }
                    if ((i & 8) == 0) {
                        this.display_name = "";
                    } else {
                        this.display_name = str;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (self.sort_type != TaxLotSortTypeDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 0, TaxLotSortTypeDto.Serializer.INSTANCE, self.sort_type);
                    }
                    SortDirectionDto sortDirectionDto = self.sort_direction;
                    if (sortDirectionDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, SortDirectionDto.Serializer.INSTANCE, sortDirectionDto);
                    }
                    if (self.next_sort_direction != SortDirectionDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 2, SortDirectionDto.Serializer.INSTANCE, self.next_sort_direction);
                    }
                    if (Intrinsics.areEqual(self.display_name, "")) {
                        return;
                    }
                    output.encodeStringElement(serialDesc, 3, self.display_name);
                }

                public Surrogate(TaxLotSortTypeDto sort_type, SortDirectionDto sortDirectionDto, SortDirectionDto next_sort_direction, String display_name) {
                    Intrinsics.checkNotNullParameter(sort_type, "sort_type");
                    Intrinsics.checkNotNullParameter(next_sort_direction, "next_sort_direction");
                    Intrinsics.checkNotNullParameter(display_name, "display_name");
                    this.sort_type = sort_type;
                    this.sort_direction = sortDirectionDto;
                    this.next_sort_direction = next_sort_direction;
                    this.display_name = display_name;
                }

                public final TaxLotSortTypeDto getSort_type() {
                    return this.sort_type;
                }

                public /* synthetic */ Surrogate(TaxLotSortTypeDto taxLotSortTypeDto, SortDirectionDto sortDirectionDto, SortDirectionDto sortDirectionDto2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? TaxLotSortTypeDto.INSTANCE.getZeroValue() : taxLotSortTypeDto, (i & 2) != 0 ? null : sortDirectionDto, (i & 4) != 0 ? SortDirectionDto.INSTANCE.getZeroValue() : sortDirectionDto2, (i & 8) != 0 ? "" : str);
                }

                public final SortDirectionDto getSort_direction() {
                    return this.sort_direction;
                }

                public final SortDirectionDto getNext_sort_direction() {
                    return this.next_sort_direction;
                }

                public final String getDisplay_name() {
                    return this.display_name;
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$Sortable;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<SortableDto, StreamTaxLotViewModelsResponse.Header.Sortable> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SortableDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SortableDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SortableDto> getBinaryBase64Serializer() {
                    return (KSerializer) SortableDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotViewModelsResponse.Header.Sortable> getProtoAdapter() {
                    return StreamTaxLotViewModelsResponse.Header.Sortable.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SortableDto getZeroValue() {
                    return SortableDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SortableDto fromProto(StreamTaxLotViewModelsResponse.Header.Sortable proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    TaxLotSortTypeDto taxLotSortTypeDtoFromProto = TaxLotSortTypeDto.INSTANCE.fromProto(proto.getSort_type());
                    SortDirection sort_direction = proto.getSort_direction();
                    return new SortableDto(new Surrogate(taxLotSortTypeDtoFromProto, sort_direction != null ? SortDirectionDto.INSTANCE.fromProto(sort_direction) : null, SortDirectionDto.INSTANCE.fromProto(proto.getNext_sort_direction()), proto.getDisplay_name()), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotViewModelsResponseDto.HeaderDto.SortableDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new SortableDto(null, null, null, null, 15, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<SortableDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.Header.Sortable", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SortableDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public SortableDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new SortableDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$HeaderDto$SortableDto";
                }
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000e¨\u0006$"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;)V", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "(Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;", "getDisplay_name", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class NonSortableDto implements Dto3<StreamTaxLotViewModelsResponse.Header.NonSortable>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<NonSortableDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<NonSortableDto, StreamTaxLotViewModelsResponse.Header.NonSortable>> binaryBase64Serializer$delegate;
            private static final NonSortableDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ NonSortableDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private NonSortableDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final String getDisplay_name() {
                return this.surrogate.getDisplay_name();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public NonSortableDto(String display_name) {
                this(new Surrogate(display_name));
                Intrinsics.checkNotNullParameter(display_name, "display_name");
            }

            public /* synthetic */ NonSortableDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamTaxLotViewModelsResponse.Header.NonSortable toProto() {
                return new StreamTaxLotViewModelsResponse.Header.NonSortable(this.surrogate.getDisplay_name(), null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[NonSortableDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof NonSortableDto) && Intrinsics.areEqual(((NonSortableDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015¨\u0006\""}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;", "", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplay_name", "getDisplay_name$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String display_name;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.display_name, ((Surrogate) other).display_name);
                }

                public int hashCode() {
                    return this.display_name.hashCode();
                }

                public String toString() {
                    return "Surrogate(display_name=" + this.display_name + ")";
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C46462xf0c513cd.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.display_name = "";
                    } else {
                        this.display_name = str;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (Intrinsics.areEqual(self.display_name, "")) {
                        return;
                    }
                    output.encodeStringElement(serialDesc, 0, self.display_name);
                }

                public Surrogate(String display_name) {
                    Intrinsics.checkNotNullParameter(display_name, "display_name");
                    this.display_name = display_name;
                }

                public final String getDisplay_name() {
                    return this.display_name;
                }

                public /* synthetic */ Surrogate(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str);
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$Header$NonSortable;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<NonSortableDto, StreamTaxLotViewModelsResponse.Header.NonSortable> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<NonSortableDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<NonSortableDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<NonSortableDto> getBinaryBase64Serializer() {
                    return (KSerializer) NonSortableDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotViewModelsResponse.Header.NonSortable> getProtoAdapter() {
                    return StreamTaxLotViewModelsResponse.Header.NonSortable.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public NonSortableDto getZeroValue() {
                    return NonSortableDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public NonSortableDto fromProto(StreamTaxLotViewModelsResponse.Header.NonSortable proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new NonSortableDto(new Surrogate(proto.getDisplay_name()), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotViewModelsResponseDto.HeaderDto.NonSortableDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new NonSortableDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<NonSortableDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.Header.NonSortable", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, NonSortableDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public NonSortableDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new NonSortableDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4189_5)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$HeaderDto$NonSortableDto";
                }
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<HeaderDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.Header", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, HeaderDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public HeaderDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new HeaderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$HeaderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$HeaderDto";
            }
        }
    }

    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*)+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006/"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;)V", "", "id", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto;", "cells", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "disabled_content", "(Ljava/lang/String;Ljava/util/List;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;", "getId", "getCells", "()Ljava/util/List;", "getDisabled_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "Companion", "Surrogate", "CellDto", "DisabledContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxLotRowDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TaxLotRowDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TaxLotRowDto, StreamTaxLotViewModelsResponse.TaxLotRow>> binaryBase64Serializer$delegate;
        private static final TaxLotRowDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TaxLotRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TaxLotRowDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getId() {
            return this.surrogate.getId();
        }

        public final List<CellDto> getCells() {
            return this.surrogate.getCells();
        }

        public final DisabledContentDto getDisabled_content() {
            return this.surrogate.getDisabled_content();
        }

        public /* synthetic */ TaxLotRowDto(String str, List list, DisabledContentDto disabledContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : disabledContentDto);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaxLotRowDto(String id, List<CellDto> cells, DisabledContentDto disabledContentDto) {
            this(new Surrogate(id, cells, disabledContentDto));
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(cells, "cells");
        }

        @Override // com.robinhood.idl.Dto
        public StreamTaxLotViewModelsResponse.TaxLotRow toProto() {
            String id = this.surrogate.getId();
            List<CellDto> cells = this.surrogate.getCells();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cells, 10));
            Iterator<T> it = cells.iterator();
            while (it.hasNext()) {
                arrayList.add(((CellDto) it.next()).toProto());
            }
            DisabledContentDto disabled_content = this.surrogate.getDisabled_content();
            return new StreamTaxLotViewModelsResponse.TaxLotRow(id, arrayList, disabled_content != null ? disabled_content.toProto() : null, null, 8, null);
        }

        public String toString() {
            return "[TaxLotRowDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TaxLotRowDto) && Intrinsics.areEqual(((TaxLotRowDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;", "", "", "id", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto;", "cells", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "disabled_content", "<init>", "(Ljava/lang/String;Ljava/util/List;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "getCells$annotations", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "getDisabled_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "getDisabled_content$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<CellDto> cells;
            private final DisabledContentDto disabled_content;
            private final String id;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null};

            public Surrogate() {
                this((String) null, (List) null, (DisabledContentDto) null, 7, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(CellDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.cells, surrogate.cells) && Intrinsics.areEqual(this.disabled_content, surrogate.disabled_content);
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.cells.hashCode()) * 31;
                DisabledContentDto disabledContentDto = this.disabled_content;
                return iHashCode + (disabledContentDto == null ? 0 : disabledContentDto.hashCode());
            }

            public String toString() {
                return "Surrogate(id=" + this.id + ", cells=" + this.cells + ", disabled_content=" + this.disabled_content + ")";
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return C46494xfb687b4c.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, List list, DisabledContentDto disabledContentDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.id = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.cells = CollectionsKt.emptyList();
                } else {
                    this.cells = list;
                }
                if ((i & 4) == 0) {
                    this.disabled_content = null;
                } else {
                    this.disabled_content = disabledContentDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.id, "")) {
                    output.encodeStringElement(serialDesc, 0, self.id);
                }
                if (!Intrinsics.areEqual(self.cells, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.cells);
                }
                DisabledContentDto disabledContentDto = self.disabled_content;
                if (disabledContentDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, DisabledContentDto.Serializer.INSTANCE, disabledContentDto);
                }
            }

            public Surrogate(String id, List<CellDto> cells, DisabledContentDto disabledContentDto) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.id = id;
                this.cells = cells;
                this.disabled_content = disabledContentDto;
            }

            public final String getId() {
                return this.id;
            }

            public /* synthetic */ Surrogate(String str, List list, DisabledContentDto disabledContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : disabledContentDto);
            }

            public final List<CellDto> getCells() {
                return this.cells;
            }

            public final DisabledContentDto getDisabled_content() {
                return this.disabled_content;
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<TaxLotRowDto, StreamTaxLotViewModelsResponse.TaxLotRow> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TaxLotRowDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotRowDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TaxLotRowDto> getBinaryBase64Serializer() {
                return (KSerializer) TaxLotRowDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow> getProtoAdapter() {
                return StreamTaxLotViewModelsResponse.TaxLotRow.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotRowDto getZeroValue() {
                return TaxLotRowDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TaxLotRowDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String id = proto.getId();
                List<StreamTaxLotViewModelsResponse.TaxLotRow.Cell> cells = proto.getCells();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cells, 10));
                Iterator<T> it = cells.iterator();
                while (it.hasNext()) {
                    arrayList.add(CellDto.INSTANCE.fromProto((StreamTaxLotViewModelsResponse.TaxLotRow.Cell) it.next()));
                }
                StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent disabled_content = proto.getDisabled_content();
                return new TaxLotRowDto(new Surrogate(id, arrayList, disabled_content != null ? DisabledContentDto.INSTANCE.fromProto(disabled_content) : null), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new TaxLotRowDto(null, null, null, 7, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n#\"$%&'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006,"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "type", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;", "getType", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "DateDto", "CostPerUnitDto", "GainLossDto", "AvailableQuantityDto", "SelectedQuantityDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class CellDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<CellDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<CellDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell>> binaryBase64Serializer$delegate;
            private static final CellDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ CellDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private CellDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final TypeDto getType() {
                if (this.surrogate.getDate() != null) {
                    return new TypeDto.Date(this.surrogate.getDate());
                }
                if (this.surrogate.getCost_per_unit() != null) {
                    return new TypeDto.CostPerUnit(this.surrogate.getCost_per_unit());
                }
                if (this.surrogate.getGain_loss() != null) {
                    return new TypeDto.GainLoss(this.surrogate.getGain_loss());
                }
                if (this.surrogate.getAvailable_quantity() != null) {
                    return new TypeDto.AvailableQuantity(this.surrogate.getAvailable_quantity());
                }
                if (this.surrogate.getSelected_quantity() != null) {
                    return new TypeDto.SelectedQuantity(this.surrogate.getSelected_quantity());
                }
                return null;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public CellDto(TypeDto typeDto) {
                TypeDto.Date date = typeDto instanceof TypeDto.Date ? (TypeDto.Date) typeDto : null;
                DateDto value = date != null ? date.getValue() : null;
                TypeDto.CostPerUnit costPerUnit = typeDto instanceof TypeDto.CostPerUnit ? (TypeDto.CostPerUnit) typeDto : null;
                CostPerUnitDto value2 = costPerUnit != null ? costPerUnit.getValue() : null;
                TypeDto.GainLoss gainLoss = typeDto instanceof TypeDto.GainLoss ? (TypeDto.GainLoss) typeDto : null;
                GainLossDto value3 = gainLoss != null ? gainLoss.getValue() : null;
                TypeDto.AvailableQuantity availableQuantity = typeDto instanceof TypeDto.AvailableQuantity ? (TypeDto.AvailableQuantity) typeDto : null;
                AvailableQuantityDto value4 = availableQuantity != null ? availableQuantity.getValue() : null;
                TypeDto.SelectedQuantity selectedQuantity = typeDto instanceof TypeDto.SelectedQuantity ? (TypeDto.SelectedQuantity) typeDto : null;
                this(new Surrogate(value, value2, value3, value4, selectedQuantity != null ? selectedQuantity.getValue() : null));
            }

            public /* synthetic */ CellDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : typeDto);
            }

            @Override // com.robinhood.idl.Dto
            public StreamTaxLotViewModelsResponse.TaxLotRow.Cell toProto() {
                DateDto date = this.surrogate.getDate();
                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date proto = date != null ? date.toProto() : null;
                CostPerUnitDto cost_per_unit = this.surrogate.getCost_per_unit();
                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit proto2 = cost_per_unit != null ? cost_per_unit.toProto() : null;
                GainLossDto gain_loss = this.surrogate.getGain_loss();
                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss proto3 = gain_loss != null ? gain_loss.toProto() : null;
                AvailableQuantityDto available_quantity = this.surrogate.getAvailable_quantity();
                StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity proto4 = available_quantity != null ? available_quantity.toProto() : null;
                SelectedQuantityDto selected_quantity = this.surrogate.getSelected_quantity();
                return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell(proto, proto2, proto3, proto4, selected_quantity != null ? selected_quantity.toProto() : null, null, 32, null);
            }

            public String toString() {
                return "[CellDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof CellDto) && Intrinsics.areEqual(((CellDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", InquiryField.DateField.TYPE, "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "cost_per_unit", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "gain_loss", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "available_quantity", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "selected_quantity", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "getDate", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "getDate$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "getCost_per_unit", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "getCost_per_unit$annotations", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "getGain_loss", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "getGain_loss$annotations", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "getAvailable_quantity", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "getAvailable_quantity$annotations", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "getSelected_quantity", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "getSelected_quantity$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final AvailableQuantityDto available_quantity;
                private final CostPerUnitDto cost_per_unit;
                private final DateDto date;
                private final GainLossDto gain_loss;
                private final SelectedQuantityDto selected_quantity;

                public Surrogate() {
                    this((DateDto) null, (CostPerUnitDto) null, (GainLossDto) null, (AvailableQuantityDto) null, (SelectedQuantityDto) null, 31, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.date, surrogate.date) && Intrinsics.areEqual(this.cost_per_unit, surrogate.cost_per_unit) && Intrinsics.areEqual(this.gain_loss, surrogate.gain_loss) && Intrinsics.areEqual(this.available_quantity, surrogate.available_quantity) && Intrinsics.areEqual(this.selected_quantity, surrogate.selected_quantity);
                }

                public int hashCode() {
                    DateDto dateDto = this.date;
                    int iHashCode = (dateDto == null ? 0 : dateDto.hashCode()) * 31;
                    CostPerUnitDto costPerUnitDto = this.cost_per_unit;
                    int iHashCode2 = (iHashCode + (costPerUnitDto == null ? 0 : costPerUnitDto.hashCode())) * 31;
                    GainLossDto gainLossDto = this.gain_loss;
                    int iHashCode3 = (iHashCode2 + (gainLossDto == null ? 0 : gainLossDto.hashCode())) * 31;
                    AvailableQuantityDto availableQuantityDto = this.available_quantity;
                    int iHashCode4 = (iHashCode3 + (availableQuantityDto == null ? 0 : availableQuantityDto.hashCode())) * 31;
                    SelectedQuantityDto selectedQuantityDto = this.selected_quantity;
                    return iHashCode4 + (selectedQuantityDto != null ? selectedQuantityDto.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(date=" + this.date + ", cost_per_unit=" + this.cost_per_unit + ", gain_loss=" + this.gain_loss + ", available_quantity=" + this.available_quantity + ", selected_quantity=" + this.selected_quantity + ")";
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C46488x1f4694e5.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, DateDto dateDto, CostPerUnitDto costPerUnitDto, GainLossDto gainLossDto, AvailableQuantityDto availableQuantityDto, SelectedQuantityDto selectedQuantityDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.date = null;
                    } else {
                        this.date = dateDto;
                    }
                    if ((i & 2) == 0) {
                        this.cost_per_unit = null;
                    } else {
                        this.cost_per_unit = costPerUnitDto;
                    }
                    if ((i & 4) == 0) {
                        this.gain_loss = null;
                    } else {
                        this.gain_loss = gainLossDto;
                    }
                    if ((i & 8) == 0) {
                        this.available_quantity = null;
                    } else {
                        this.available_quantity = availableQuantityDto;
                    }
                    if ((i & 16) == 0) {
                        this.selected_quantity = null;
                    } else {
                        this.selected_quantity = selectedQuantityDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    DateDto dateDto = self.date;
                    if (dateDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, DateDto.Serializer.INSTANCE, dateDto);
                    }
                    CostPerUnitDto costPerUnitDto = self.cost_per_unit;
                    if (costPerUnitDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, CostPerUnitDto.Serializer.INSTANCE, costPerUnitDto);
                    }
                    GainLossDto gainLossDto = self.gain_loss;
                    if (gainLossDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, GainLossDto.Serializer.INSTANCE, gainLossDto);
                    }
                    AvailableQuantityDto availableQuantityDto = self.available_quantity;
                    if (availableQuantityDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 3, AvailableQuantityDto.Serializer.INSTANCE, availableQuantityDto);
                    }
                    SelectedQuantityDto selectedQuantityDto = self.selected_quantity;
                    if (selectedQuantityDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 4, SelectedQuantityDto.Serializer.INSTANCE, selectedQuantityDto);
                    }
                }

                public Surrogate(DateDto dateDto, CostPerUnitDto costPerUnitDto, GainLossDto gainLossDto, AvailableQuantityDto availableQuantityDto, SelectedQuantityDto selectedQuantityDto) {
                    this.date = dateDto;
                    this.cost_per_unit = costPerUnitDto;
                    this.gain_loss = gainLossDto;
                    this.available_quantity = availableQuantityDto;
                    this.selected_quantity = selectedQuantityDto;
                }

                public /* synthetic */ Surrogate(DateDto dateDto, CostPerUnitDto costPerUnitDto, GainLossDto gainLossDto, AvailableQuantityDto availableQuantityDto, SelectedQuantityDto selectedQuantityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : dateDto, (i & 2) != 0 ? null : costPerUnitDto, (i & 4) != 0 ? null : gainLossDto, (i & 8) != 0 ? null : availableQuantityDto, (i & 16) != 0 ? null : selectedQuantityDto);
                }

                public final DateDto getDate() {
                    return this.date;
                }

                public final CostPerUnitDto getCost_per_unit() {
                    return this.cost_per_unit;
                }

                public final GainLossDto getGain_loss() {
                    return this.gain_loss;
                }

                public final AvailableQuantityDto getAvailable_quantity() {
                    return this.available_quantity;
                }

                public final SelectedQuantityDto getSelected_quantity() {
                    return this.selected_quantity;
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<CellDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<CellDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<CellDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<CellDto> getBinaryBase64Serializer() {
                    return (KSerializer) CellDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell> getProtoAdapter() {
                    return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public CellDto getZeroValue() {
                    return CellDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public CellDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date date = proto.getDate();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    DateDto dateDtoFromProto = date != null ? DateDto.INSTANCE.fromProto(date) : null;
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit cost_per_unit = proto.getCost_per_unit();
                    CostPerUnitDto costPerUnitDtoFromProto = cost_per_unit != null ? CostPerUnitDto.INSTANCE.fromProto(cost_per_unit) : null;
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss gain_loss = proto.getGain_loss();
                    GainLossDto gainLossDtoFromProto = gain_loss != null ? GainLossDto.INSTANCE.fromProto(gain_loss) : null;
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity available_quantity = proto.getAvailable_quantity();
                    AvailableQuantityDto availableQuantityDtoFromProto = available_quantity != null ? AvailableQuantityDto.INSTANCE.fromProto(available_quantity) : null;
                    StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity selected_quantity = proto.getSelected_quantity();
                    return new CellDto(new Surrogate(dateDtoFromProto, costPerUnitDtoFromProto, gainLossDtoFromProto, availableQuantityDtoFromProto, selected_quantity != null ? SelectedQuantityDto.INSTANCE.fromProto(selected_quantity) : null), defaultConstructorMarker);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new CellDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Date", "CostPerUnit", "GainLoss", "AvailableQuantity", "SelectedQuantity", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$AvailableQuantity;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$CostPerUnit;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$Date;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$GainLoss;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$SelectedQuantity;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @RhGenerated
            public static abstract class TypeDto implements Dto4 {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private TypeDto() {
                }

                @Override // com.robinhood.idl.Dto
                public Void toProto() {
                    return Dto4.DefaultImpls.toProto(this);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$Date;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class Date extends TypeDto {
                    private final DateDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Date) && Intrinsics.areEqual(this.value, ((Date) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Date(value=" + this.value + ")";
                    }

                    public final DateDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Date(DateDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$CostPerUnit;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class CostPerUnit extends TypeDto {
                    private final CostPerUnitDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof CostPerUnit) && Intrinsics.areEqual(this.value, ((CostPerUnit) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "CostPerUnit(value=" + this.value + ")";
                    }

                    public final CostPerUnitDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public CostPerUnit(CostPerUnitDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$GainLoss;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class GainLoss extends TypeDto {
                    private final GainLossDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof GainLoss) && Intrinsics.areEqual(this.value, ((GainLoss) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "GainLoss(value=" + this.value + ")";
                    }

                    public final GainLossDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public GainLoss(GainLossDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$AvailableQuantity;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class AvailableQuantity extends TypeDto {
                    private final AvailableQuantityDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof AvailableQuantity) && Intrinsics.areEqual(this.value, ((AvailableQuantity) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "AvailableQuantity(value=" + this.value + ")";
                    }

                    public final AvailableQuantityDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AvailableQuantity(AvailableQuantityDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$SelectedQuantity;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class SelectedQuantity extends TypeDto {
                    private final SelectedQuantityDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof SelectedQuantity) && Intrinsics.areEqual(this.value, ((SelectedQuantity) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "SelectedQuantity(value=" + this.value + ")";
                    }

                    public final SelectedQuantityDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public SelectedQuantity(SelectedQuantityDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto4.Creator<TypeDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell> {
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
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TypeDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        if (proto.getDate() != null) {
                            return new Date(DateDto.INSTANCE.fromProto(proto.getDate()));
                        }
                        if (proto.getCost_per_unit() != null) {
                            return new CostPerUnit(CostPerUnitDto.INSTANCE.fromProto(proto.getCost_per_unit()));
                        }
                        if (proto.getGain_loss() != null) {
                            return new GainLoss(GainLossDto.INSTANCE.fromProto(proto.getGain_loss()));
                        }
                        if (proto.getAvailable_quantity() != null) {
                            return new AvailableQuantity(AvailableQuantityDto.INSTANCE.fromProto(proto.getAvailable_quantity()));
                        }
                        if (proto.getSelected_quantity() != null) {
                            return new SelectedQuantity(SelectedQuantityDto.INSTANCE.fromProto(proto.getSelected_quantity()));
                        }
                        return null;
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;)V", "", "display_date", "Lcbc/service/v1/TermTypeDto;", "term_type", "(Ljava/lang/String;Lcbc/service/v1/TermTypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;", "getDisplay_date", "getTerm_type", "()Lcbc/service/v1/TermTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class DateDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<DateDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<DateDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date>> binaryBase64Serializer$delegate;
                private static final DateDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ DateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private DateDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final String getDisplay_date() {
                    return this.surrogate.getDisplay_date();
                }

                public final TermTypeDto getTerm_type() {
                    return this.surrogate.getTerm_type();
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public DateDto(String display_date, TermTypeDto term_type) {
                    this(new Surrogate(display_date, term_type));
                    Intrinsics.checkNotNullParameter(display_date, "display_date");
                    Intrinsics.checkNotNullParameter(term_type, "term_type");
                }

                public /* synthetic */ DateDto(String str, TermTypeDto termTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date toProto() {
                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date(this.surrogate.getDisplay_date(), (TermType) this.surrogate.getTerm_type().toProto(), null, 4, null);
                }

                public String toString() {
                    return "[DateDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof DateDto) && Intrinsics.areEqual(((DateDto) other).surrogate, this.surrogate);
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
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;", "", "", "display_date", "Lcbc/service/v1/TermTypeDto;", "term_type", "<init>", "(Ljava/lang/String;Lcbc/service/v1/TermTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcbc/service/v1/TermTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplay_date", "getDisplay_date$annotations", "()V", "Lcbc/service/v1/TermTypeDto;", "getTerm_type", "()Lcbc/service/v1/TermTypeDto;", "getTerm_type$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final String display_date;
                    private final TermTypeDto term_type;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((String) null, (TermTypeDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.display_date, surrogate.display_date) && this.term_type == surrogate.term_type;
                    }

                    public int hashCode() {
                        return (this.display_date.hashCode() * 31) + this.term_type.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(display_date=" + this.display_date + ", term_type=" + this.term_type + ")";
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C46476xf4850cb2.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, String str, TermTypeDto termTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
                        this.display_date = (i & 1) == 0 ? "" : str;
                        if ((i & 2) == 0) {
                            this.term_type = TermTypeDto.INSTANCE.getZeroValue();
                        } else {
                            this.term_type = termTypeDto;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (!Intrinsics.areEqual(self.display_date, "")) {
                            output.encodeStringElement(serialDesc, 0, self.display_date);
                        }
                        if (self.term_type != TermTypeDto.INSTANCE.getZeroValue()) {
                            output.encodeSerializableElement(serialDesc, 1, TermTypeDto.Serializer.INSTANCE, self.term_type);
                        }
                    }

                    public Surrogate(String display_date, TermTypeDto term_type) {
                        Intrinsics.checkNotNullParameter(display_date, "display_date");
                        Intrinsics.checkNotNullParameter(term_type, "term_type");
                        this.display_date = display_date;
                        this.term_type = term_type;
                    }

                    public final String getDisplay_date() {
                        return this.display_date;
                    }

                    public /* synthetic */ Surrogate(String str, TermTypeDto termTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TermTypeDto.INSTANCE.getZeroValue() : termTypeDto);
                    }

                    public final TermTypeDto getTerm_type() {
                        return this.term_type;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$Date;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<DateDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<DateDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DateDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DateDto> getBinaryBase64Serializer() {
                        return (KSerializer) DateDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DateDto getZeroValue() {
                        return DateDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DateDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new DateDto(new Surrogate(proto.getDisplay_date(), TermTypeDto.INSTANCE.fromProto(proto.getTerm_type())), (DefaultConstructorMarker) null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.DateDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new DateDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<DateDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.Date", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, DateDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public DateDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new DateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                    public final String provideIntoMap() {
                        return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$DateDto";
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "cost_per_unit", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;", "getCost_per_unit", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class CostPerUnitDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<CostPerUnitDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<CostPerUnitDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit>> binaryBase64Serializer$delegate;
                private static final CostPerUnitDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ CostPerUnitDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private CostPerUnitDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final IdlDecimal getCost_per_unit() {
                    return this.surrogate.getCost_per_unit();
                }

                public CostPerUnitDto(IdlDecimal idlDecimal) {
                    this(new Surrogate(idlDecimal));
                }

                public /* synthetic */ CostPerUnitDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit toProto() {
                    IdlDecimal cost_per_unit = this.surrogate.getCost_per_unit();
                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit(cost_per_unit != null ? cost_per_unit.getStringValue() : null, null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[CostPerUnitDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof CostPerUnitDto) && Intrinsics.areEqual(((CostPerUnitDto) other).surrogate, this.surrogate);
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
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\"\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "cost_per_unit", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getCost_per_unit", "()Lcom/robinhood/idl/IdlDecimal;", "getCost_per_unit$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal cost_per_unit;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Surrogate) && Intrinsics.areEqual(this.cost_per_unit, ((Surrogate) other).cost_per_unit);
                    }

                    public int hashCode() {
                        IdlDecimal idlDecimal = this.cost_per_unit;
                        if (idlDecimal == null) {
                            return 0;
                        }
                        return idlDecimal.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(cost_per_unit=" + this.cost_per_unit + ")";
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C46474xf34c9516.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.cost_per_unit = null;
                        } else {
                            this.cost_per_unit = idlDecimal;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        IdlDecimal idlDecimal = self.cost_per_unit;
                        if (idlDecimal != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                        }
                    }

                    public Surrogate(IdlDecimal idlDecimal) {
                        this.cost_per_unit = idlDecimal;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : idlDecimal);
                    }

                    public final IdlDecimal getCost_per_unit() {
                        return this.cost_per_unit;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$CostPerUnit;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<CostPerUnitDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<CostPerUnitDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<CostPerUnitDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<CostPerUnitDto> getBinaryBase64Serializer() {
                        return (KSerializer) CostPerUnitDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public CostPerUnitDto getZeroValue() {
                        return CostPerUnitDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public CostPerUnitDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        String cost_per_unit = proto.getCost_per_unit();
                        return new CostPerUnitDto(new Surrogate(cost_per_unit != null ? new IdlDecimal(cost_per_unit) : null), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.CostPerUnitDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new CostPerUnitDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<CostPerUnitDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.CostPerUnit", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, CostPerUnitDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public CostPerUnitDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new CostPerUnitDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                    public final String provideIntoMap() {
                        return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$CostPerUnitDto";
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "gain_loss", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "gain_loss_content", "(Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;", "getGain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "Companion", "Surrogate", "GainLossContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class GainLossDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<GainLossDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<GainLossDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss>> binaryBase64Serializer$delegate;
                private static final GainLossDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ GainLossDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private GainLossDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final GainLossContentDto getGain_loss_content() {
                    return this.surrogate.getGain_loss_content();
                }

                public GainLossDto(IdlDecimal idlDecimal, GainLossContentDto gainLossContentDto) {
                    this(new Surrogate(idlDecimal, gainLossContentDto));
                }

                public /* synthetic */ GainLossDto(IdlDecimal idlDecimal, GainLossContentDto gainLossContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : gainLossContentDto);
                }

                @Override // com.robinhood.idl.Dto
                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss toProto() {
                    IdlDecimal gain_loss = this.surrogate.getGain_loss();
                    String stringValue = gain_loss != null ? gain_loss.getStringValue() : null;
                    GainLossContentDto gain_loss_content = this.surrogate.getGain_loss_content();
                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss(stringValue, gain_loss_content != null ? gain_loss_content.toProto() : null, null, 4, null);
                }

                public String toString() {
                    return "[GainLossDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof GainLossDto) && Intrinsics.areEqual(((GainLossDto) other).surrogate, this.surrogate);
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
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+B.\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)¨\u0006-"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "gain_loss", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "gain_loss_content", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getGain_loss", "()Lcom/robinhood/idl/IdlDecimal;", "getGain_loss$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "getGain_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "getGain_loss_content$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal gain_loss;
                    private final GainLossContentDto gain_loss_content;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((IdlDecimal) null, (GainLossContentDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.gain_loss, surrogate.gain_loss) && Intrinsics.areEqual(this.gain_loss_content, surrogate.gain_loss_content);
                    }

                    public int hashCode() {
                        IdlDecimal idlDecimal = this.gain_loss;
                        int iHashCode = (idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31;
                        GainLossContentDto gainLossContentDto = this.gain_loss_content;
                        return iHashCode + (gainLossContentDto != null ? gainLossContentDto.hashCode() : 0);
                    }

                    public String toString() {
                        return "Surrogate(gain_loss=" + this.gain_loss + ", gain_loss_content=" + this.gain_loss_content + ")";
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C46484x948b461e.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, GainLossContentDto gainLossContentDto, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.gain_loss = null;
                        } else {
                            this.gain_loss = idlDecimal;
                        }
                        if ((i & 2) == 0) {
                            this.gain_loss_content = null;
                        } else {
                            this.gain_loss_content = gainLossContentDto;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        IdlDecimal idlDecimal = self.gain_loss;
                        if (idlDecimal != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                        }
                        GainLossContentDto gainLossContentDto = self.gain_loss_content;
                        if (gainLossContentDto != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, GainLossContentDto.Serializer.INSTANCE, gainLossContentDto);
                        }
                    }

                    public Surrogate(IdlDecimal idlDecimal, GainLossContentDto gainLossContentDto) {
                        this.gain_loss = idlDecimal;
                        this.gain_loss_content = gainLossContentDto;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, GainLossContentDto gainLossContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : gainLossContentDto);
                    }

                    public final IdlDecimal getGain_loss() {
                        return this.gain_loss;
                    }

                    public final GainLossContentDto getGain_loss_content() {
                        return this.gain_loss_content;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<GainLossDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<GainLossDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<GainLossDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<GainLossDto> getBinaryBase64Serializer() {
                        return (KSerializer) GainLossDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public GainLossDto getZeroValue() {
                        return GainLossDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public GainLossDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        String gain_loss = proto.getGain_loss();
                        DefaultConstructorMarker defaultConstructorMarker = null;
                        IdlDecimal idlDecimal = gain_loss != null ? new IdlDecimal(gain_loss) : null;
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent gain_loss_content = proto.getGain_loss_content();
                        return new GainLossDto(new Surrogate(idlDecimal, gain_loss_content != null ? GainLossContentDto.INSTANCE.fromProto(gain_loss_content) : null), defaultConstructorMarker);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new GainLossDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;", "type", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;", "getType", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "GainContentDto", "LossContentDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class GainLossContentDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent>, Parcelable {

                    @JvmField
                    public static final Parcelable.Creator<GainLossContentDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<GainLossContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent>> binaryBase64Serializer$delegate;
                    private static final GainLossContentDto zeroValue;
                    private final Surrogate surrogate;

                    public /* synthetic */ GainLossContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                        this(surrogate);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private GainLossContentDto(Surrogate surrogate) {
                        this.surrogate = surrogate;
                    }

                    public final TypeDto getType() {
                        if (this.surrogate.getGain_content() != null) {
                            return new TypeDto.GainContent(this.surrogate.getGain_content());
                        }
                        if (this.surrogate.getLoss_content() != null) {
                            return new TypeDto.LossContent(this.surrogate.getLoss_content());
                        }
                        return null;
                    }

                    /* JADX WARN: Illegal instructions before constructor call */
                    public GainLossContentDto(TypeDto typeDto) {
                        TypeDto.GainContent gainContent = typeDto instanceof TypeDto.GainContent ? (TypeDto.GainContent) typeDto : null;
                        GainContentDto value = gainContent != null ? gainContent.getValue() : null;
                        TypeDto.LossContent lossContent = typeDto instanceof TypeDto.LossContent ? (TypeDto.LossContent) typeDto : null;
                        this(new Surrogate(value, lossContent != null ? lossContent.getValue() : null));
                    }

                    public /* synthetic */ GainLossContentDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : typeDto);
                    }

                    @Override // com.robinhood.idl.Dto
                    public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent toProto() {
                        GainContentDto gain_content = this.surrogate.getGain_content();
                        StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent proto = gain_content != null ? gain_content.toProto() : null;
                        LossContentDto loss_content = this.surrogate.getLoss_content();
                        return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent(proto, loss_content != null ? loss_content.toProto() : null, null, 4, null);
                    }

                    public String toString() {
                        return "[GainLossContentDto]:" + toProto();
                    }

                    public boolean equals(Object other) {
                        if (other != this) {
                            return (other instanceof GainLossContentDto) && Intrinsics.areEqual(((GainLossContentDto) other).surrogate, this.surrogate);
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
                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "loss_content", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "getGain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "getGain_content$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "getLoss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "getLoss_content$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable
                    static final /* data */ class Surrogate {

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);
                        private final GainContentDto gain_content;
                        private final LossContentDto loss_content;

                        /* JADX WARN: Multi-variable type inference failed */
                        public Surrogate() {
                            this((GainContentDto) null, (LossContentDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            if (!(other instanceof Surrogate)) {
                                return false;
                            }
                            Surrogate surrogate = (Surrogate) other;
                            return Intrinsics.areEqual(this.gain_content, surrogate.gain_content) && Intrinsics.areEqual(this.loss_content, surrogate.loss_content);
                        }

                        public int hashCode() {
                            GainContentDto gainContentDto = this.gain_content;
                            int iHashCode = (gainContentDto == null ? 0 : gainContentDto.hashCode()) * 31;
                            LossContentDto lossContentDto = this.loss_content;
                            return iHashCode + (lossContentDto != null ? lossContentDto.hashCode() : 0);
                        }

                        public String toString() {
                            return "Surrogate(gain_content=" + this.gain_content + ", loss_content=" + this.loss_content + ")";
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion {
                            private Companion() {
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final KSerializer<Surrogate> serializer() {
                                return C46483x68bab2fa.INSTANCE;
                            }
                        }

                        public /* synthetic */ Surrogate(int i, GainContentDto gainContentDto, LossContentDto lossContentDto, SerializationConstructorMarker serializationConstructorMarker) {
                            if ((i & 1) == 0) {
                                this.gain_content = null;
                            } else {
                                this.gain_content = gainContentDto;
                            }
                            if ((i & 2) == 0) {
                                this.loss_content = null;
                            } else {
                                this.loss_content = lossContentDto;
                            }
                        }

                        @JvmStatic
                        public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                            GainContentDto gainContentDto = self.gain_content;
                            if (gainContentDto != null) {
                                output.encodeNullableSerializableElement(serialDesc, 0, GainContentDto.Serializer.INSTANCE, gainContentDto);
                            }
                            LossContentDto lossContentDto = self.loss_content;
                            if (lossContentDto != null) {
                                output.encodeNullableSerializableElement(serialDesc, 1, LossContentDto.Serializer.INSTANCE, lossContentDto);
                            }
                        }

                        public Surrogate(GainContentDto gainContentDto, LossContentDto lossContentDto) {
                            this.gain_content = gainContentDto;
                            this.loss_content = lossContentDto;
                        }

                        public /* synthetic */ Surrogate(GainContentDto gainContentDto, LossContentDto lossContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? null : gainContentDto, (i & 2) != 0 ? null : lossContentDto);
                        }

                        public final GainContentDto getGain_content() {
                            return this.gain_content;
                        }

                        public final LossContentDto getLoss_content() {
                            return this.loss_content;
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    public static final class Companion implements Dto3.Creator<GainLossContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent> {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final KSerializer<GainLossContentDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<GainLossContentDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<GainLossContentDto> getBinaryBase64Serializer() {
                            return (KSerializer) GainLossContentDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent> getProtoAdapter() {
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public GainLossContentDto getZeroValue() {
                            return GainLossContentDto.zeroValue;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public GainLossContentDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent gain_content = proto.getGain_content();
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            GainContentDto gainContentDtoFromProto = gain_content != null ? GainContentDto.INSTANCE.fromProto(gain_content) : null;
                            StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent loss_content = proto.getLoss_content();
                            return new GainLossContentDto(new Surrogate(gainContentDtoFromProto, loss_content != null ? LossContentDto.INSTANCE.fromProto(loss_content) : null), defaultConstructorMarker);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    static {
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        zeroValue = new GainLossContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "GainContent", "LossContent", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto$GainContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto$LossContent;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @RhGenerated
                    public static abstract class TypeDto implements Dto4 {

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);

                        public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private TypeDto() {
                        }

                        @Override // com.robinhood.idl.Dto
                        public Void toProto() {
                            return Dto4.DefaultImpls.toProto(this);
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto$GainContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final /* data */ class GainContent extends TypeDto {
                            private final GainContentDto value;

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof GainContent) && Intrinsics.areEqual(this.value, ((GainContent) other).value);
                            }

                            public int hashCode() {
                                return this.value.hashCode();
                            }

                            public String toString() {
                                return "GainContent(value=" + this.value + ")";
                            }

                            public final GainContentDto getValue() {
                                return this.value;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public GainContent(GainContentDto value) {
                                super(null);
                                Intrinsics.checkNotNullParameter(value, "value");
                                this.value = value;
                            }
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto$LossContent;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final /* data */ class LossContent extends TypeDto {
                            private final LossContentDto value;

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof LossContent) && Intrinsics.areEqual(this.value, ((LossContent) other).value);
                            }

                            public int hashCode() {
                                return this.value.hashCode();
                            }

                            public String toString() {
                                return "LossContent(value=" + this.value + ")";
                            }

                            public final LossContentDto getValue() {
                                return this.value;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public LossContent(LossContentDto value) {
                                super(null);
                                Intrinsics.checkNotNullParameter(value, "value");
                                this.value = value;
                            }
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion implements Dto4.Creator<TypeDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent> {
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
                            public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent> getProtoAdapter() {
                                return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.ADAPTER;
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public TypeDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent proto) {
                                Intrinsics.checkNotNullParameter(proto, "proto");
                                if (proto.getGain_content() != null) {
                                    return new GainContent(GainContentDto.INSTANCE.fromProto(proto.getGain_content()));
                                }
                                if (proto.getLoss_content() != null) {
                                    return new LossContent(LossContentDto.INSTANCE.fromProto(proto.getLoss_content()));
                                }
                                return null;
                            }
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "gain_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;", "getGain_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable(with = Serializer.class)
                    @RhGenerated
                    public static final class GainContentDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent>, Parcelable {

                        @JvmField
                        public static final Parcelable.Creator<GainContentDto> CREATOR;

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE;
                        private static final Lazy<BinaryBase64DtoSerializer<GainContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent>> binaryBase64Serializer$delegate;
                        private static final GainContentDto zeroValue;
                        private final Surrogate surrogate;

                        public /* synthetic */ GainContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                            this(surrogate);
                        }

                        @Override // android.os.Parcelable
                        public int describeContents() {
                            return 0;
                        }

                        private GainContentDto(Surrogate surrogate) {
                            this.surrogate = surrogate;
                        }

                        public final IdlDecimal getGain_quote_amount() {
                            return this.surrogate.getGain_quote_amount();
                        }

                        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                        public GainContentDto(IdlDecimal gain_quote_amount) {
                            this(new Surrogate(gain_quote_amount));
                            Intrinsics.checkNotNullParameter(gain_quote_amount, "gain_quote_amount");
                        }

                        public /* synthetic */ GainContentDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.robinhood.idl.Dto
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent toProto() {
                            return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent(this.surrogate.getGain_quote_amount().getStringValue(), null, 2, 0 == true ? 1 : 0);
                        }

                        public String toString() {
                            return "[GainContentDto]:" + toProto();
                        }

                        public boolean equals(Object other) {
                            if (other != this) {
                                return (other instanceof GainContentDto) && Intrinsics.areEqual(((GainContentDto) other).surrogate, this.surrogate);
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
                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "gain_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getGain_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getGain_quote_amount$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @Serializable
                        static final /* data */ class Surrogate {

                            /* renamed from: Companion, reason: from kotlin metadata */
                            public static final Companion INSTANCE = new Companion(null);
                            private final IdlDecimal gain_quote_amount;

                            /* JADX WARN: Multi-variable type inference failed */
                            public Surrogate() {
                                this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof Surrogate) && Intrinsics.areEqual(this.gain_quote_amount, ((Surrogate) other).gain_quote_amount);
                            }

                            public int hashCode() {
                                return this.gain_quote_amount.hashCode();
                            }

                            public String toString() {
                                return "Surrogate(gain_quote_amount=" + this.gain_quote_amount + ")";
                            }

                            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                            public static final class Companion {
                                private Companion() {
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    this();
                                }

                                public final KSerializer<Surrogate> serializer() {
                                    return C46480x1300e0db.INSTANCE;
                                }
                            }

                            public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                                if ((i & 1) == 0) {
                                    this.gain_quote_amount = new IdlDecimal("");
                                } else {
                                    this.gain_quote_amount = idlDecimal;
                                }
                            }

                            @JvmStatic
                            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                                if (Intrinsics.areEqual(self.gain_quote_amount, new IdlDecimal(""))) {
                                    return;
                                }
                                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.gain_quote_amount);
                            }

                            public Surrogate(IdlDecimal gain_quote_amount) {
                                Intrinsics.checkNotNullParameter(gain_quote_amount, "gain_quote_amount");
                                this.gain_quote_amount = gain_quote_amount;
                            }

                            public final IdlDecimal getGain_quote_amount() {
                                return this.gain_quote_amount;
                            }

                            public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                            }
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$GainContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion implements Dto3.Creator<GainContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent> {
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            private Companion() {
                            }

                            public final KSerializer<GainContentDto> serializer() {
                                return Serializer.INSTANCE;
                            }

                            @Override // com.robinhood.idl.Dto.SerializableCreator
                            public KSerializer<GainContentDto> getDefaultSerializer() {
                                return serializer();
                            }

                            @Override // com.robinhood.idl.Dto.SerializableCreator
                            public KSerializer<GainContentDto> getBinaryBase64Serializer() {
                                return (KSerializer) GainContentDto.binaryBase64Serializer$delegate.getValue();
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent> getProtoAdapter() {
                                return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent.ADAPTER;
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public GainContentDto getZeroValue() {
                                return GainContentDto.zeroValue;
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public GainContentDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent proto) {
                                Intrinsics.checkNotNullParameter(proto, "proto");
                                return new GainContentDto(new Surrogate(new IdlDecimal(proto.getGain_quote_amount())), null);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        static {
                            Companion companion = new Companion(null);
                            INSTANCE = companion;
                            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.GainContentDto.binaryBase64Serializer_delegate$lambda$0();
                                }
                            });
                            zeroValue = new GainContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                            CREATOR = new DtoParcelableCreator(companion);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                            return new BinaryBase64DtoSerializer(INSTANCE);
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Serializer implements KSerializer<GainContentDto> {
                            public static final Serializer INSTANCE = new Serializer();
                            private static final SerialDescriptor descriptor;
                            private static final KSerializer<Surrogate> surrogateSerializer;

                            private Serializer() {
                            }

                            static {
                                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                                surrogateSerializer = kSerializerSerializer;
                                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.GainContent", kSerializerSerializer.getDescriptor());
                            }

                            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                            public SerialDescriptor getDescriptor() {
                                return descriptor;
                            }

                            @Override // kotlinx.serialization.KSerializer3
                            public void serialize(Encoding4 encoder, GainContentDto value) {
                                Intrinsics.checkNotNullParameter(encoder, "encoder");
                                Intrinsics.checkNotNullParameter(value, "value");
                                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                            }

                            @Override // kotlinx.serialization.KSerializer2
                            public GainContentDto deserialize(Decoding2 decoder) {
                                Intrinsics.checkNotNullParameter(decoder, "decoder");
                                return new GainContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                            }
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class MultibindingModule {
                            public static final MultibindingModule INSTANCE = new MultibindingModule();

                            private MultibindingModule() {
                            }

                            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                            public final String provideIntoMap() {
                                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$GainContentDto";
                            }
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "loss_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;", "getLoss_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @Serializable(with = Serializer.class)
                    @RhGenerated
                    public static final class LossContentDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent>, Parcelable {

                        @JvmField
                        public static final Parcelable.Creator<LossContentDto> CREATOR;

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE;
                        private static final Lazy<BinaryBase64DtoSerializer<LossContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent>> binaryBase64Serializer$delegate;
                        private static final LossContentDto zeroValue;
                        private final Surrogate surrogate;

                        public /* synthetic */ LossContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                            this(surrogate);
                        }

                        @Override // android.os.Parcelable
                        public int describeContents() {
                            return 0;
                        }

                        private LossContentDto(Surrogate surrogate) {
                            this.surrogate = surrogate;
                        }

                        public final IdlDecimal getLoss_quote_amount() {
                            return this.surrogate.getLoss_quote_amount();
                        }

                        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                        public LossContentDto(IdlDecimal loss_quote_amount) {
                            this(new Surrogate(loss_quote_amount));
                            Intrinsics.checkNotNullParameter(loss_quote_amount, "loss_quote_amount");
                        }

                        public /* synthetic */ LossContentDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.robinhood.idl.Dto
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent toProto() {
                            return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent(this.surrogate.getLoss_quote_amount().getStringValue(), null, 2, 0 == true ? 1 : 0);
                        }

                        public String toString() {
                            return "[LossContentDto]:" + toProto();
                        }

                        public boolean equals(Object other) {
                            if (other != this) {
                                return (other instanceof LossContentDto) && Intrinsics.areEqual(((LossContentDto) other).surrogate, this.surrogate);
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
                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "loss_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getLoss_quote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getLoss_quote_amount$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @Serializable
                        static final /* data */ class Surrogate {

                            /* renamed from: Companion, reason: from kotlin metadata */
                            public static final Companion INSTANCE = new Companion(null);
                            private final IdlDecimal loss_quote_amount;

                            /* JADX WARN: Multi-variable type inference failed */
                            public Surrogate() {
                                this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                            }

                            public boolean equals(Object other) {
                                if (this == other) {
                                    return true;
                                }
                                return (other instanceof Surrogate) && Intrinsics.areEqual(this.loss_quote_amount, ((Surrogate) other).loss_quote_amount);
                            }

                            public int hashCode() {
                                return this.loss_quote_amount.hashCode();
                            }

                            public String toString() {
                                return "Surrogate(loss_quote_amount=" + this.loss_quote_amount + ")";
                            }

                            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                            public static final class Companion {
                                private Companion() {
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    this();
                                }

                                public final KSerializer<Surrogate> serializer() {
                                    return C46482xd08bcc7f.INSTANCE;
                                }
                            }

                            public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                                if ((i & 1) == 0) {
                                    this.loss_quote_amount = new IdlDecimal("");
                                } else {
                                    this.loss_quote_amount = idlDecimal;
                                }
                            }

                            @JvmStatic
                            public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                                if (Intrinsics.areEqual(self.loss_quote_amount, new IdlDecimal(""))) {
                                    return;
                                }
                                output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.loss_quote_amount);
                            }

                            public Surrogate(IdlDecimal loss_quote_amount) {
                                Intrinsics.checkNotNullParameter(loss_quote_amount, "loss_quote_amount");
                                this.loss_quote_amount = loss_quote_amount;
                            }

                            public final IdlDecimal getLoss_quote_amount() {
                                return this.loss_quote_amount;
                            }

                            public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                            }
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$GainLoss$GainLossContent$LossContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Companion implements Dto3.Creator<LossContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent> {
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            private Companion() {
                            }

                            public final KSerializer<LossContentDto> serializer() {
                                return Serializer.INSTANCE;
                            }

                            @Override // com.robinhood.idl.Dto.SerializableCreator
                            public KSerializer<LossContentDto> getDefaultSerializer() {
                                return serializer();
                            }

                            @Override // com.robinhood.idl.Dto.SerializableCreator
                            public KSerializer<LossContentDto> getBinaryBase64Serializer() {
                                return (KSerializer) LossContentDto.binaryBase64Serializer$delegate.getValue();
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent> getProtoAdapter() {
                                return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent.ADAPTER;
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public LossContentDto getZeroValue() {
                                return LossContentDto.zeroValue;
                            }

                            @Override // com.robinhood.idl.Dto.Creator
                            public LossContentDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent proto) {
                                Intrinsics.checkNotNullParameter(proto, "proto");
                                return new LossContentDto(new Surrogate(new IdlDecimal(proto.getLoss_quote_amount())), null);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        static {
                            Companion companion = new Companion(null);
                            INSTANCE = companion;
                            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.GainLossDto.GainLossContentDto.LossContentDto.binaryBase64Serializer_delegate$lambda$0();
                                }
                            });
                            zeroValue = new LossContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                            CREATOR = new DtoParcelableCreator(companion);
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                            return new BinaryBase64DtoSerializer(INSTANCE);
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class Serializer implements KSerializer<LossContentDto> {
                            public static final Serializer INSTANCE = new Serializer();
                            private static final SerialDescriptor descriptor;
                            private static final KSerializer<Surrogate> surrogateSerializer;

                            private Serializer() {
                            }

                            static {
                                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                                surrogateSerializer = kSerializerSerializer;
                                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent.LossContent", kSerializerSerializer.getDescriptor());
                            }

                            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                            public SerialDescriptor getDescriptor() {
                                return descriptor;
                            }

                            @Override // kotlinx.serialization.KSerializer3
                            public void serialize(Encoding4 encoder, LossContentDto value) {
                                Intrinsics.checkNotNullParameter(encoder, "encoder");
                                Intrinsics.checkNotNullParameter(value, "value");
                                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                            }

                            @Override // kotlinx.serialization.KSerializer2
                            public LossContentDto deserialize(Decoding2 decoder) {
                                Intrinsics.checkNotNullParameter(decoder, "decoder");
                                return new LossContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                            }
                        }

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public static final class MultibindingModule {
                            public static final MultibindingModule INSTANCE = new MultibindingModule();

                            private MultibindingModule() {
                            }

                            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                            public final String provideIntoMap() {
                                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$LossContentDto";
                            }
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<GainLossContentDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private static final SerialDescriptor descriptor;
                        private static final KSerializer<Surrogate> surrogateSerializer;

                        private Serializer() {
                        }

                        static {
                            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                            surrogateSerializer = kSerializerSerializer;
                            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss.GainLossContent", kSerializerSerializer.getDescriptor());
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return descriptor;
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, GainLossContentDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                        }

                        @Override // kotlinx.serialization.KSerializer2
                        public GainLossContentDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return new GainLossContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class MultibindingModule {
                        public static final MultibindingModule INSTANCE = new MultibindingModule();

                        private MultibindingModule() {
                        }

                        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                        public final String provideIntoMap() {
                            return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$GainLossContentDto";
                        }
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<GainLossDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.GainLoss", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, GainLossDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public GainLossDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new GainLossDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4188_4)
                    public final String provideIntoMap() {
                        return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$GainLossDto";
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "available_quantity", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;", "getAvailable_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class AvailableQuantityDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<AvailableQuantityDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<AvailableQuantityDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity>> binaryBase64Serializer$delegate;
                private static final AvailableQuantityDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ AvailableQuantityDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private AvailableQuantityDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final IdlDecimal getAvailable_quantity() {
                    return this.surrogate.getAvailable_quantity();
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public AvailableQuantityDto(IdlDecimal available_quantity) {
                    this(new Surrogate(available_quantity));
                    Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                }

                public /* synthetic */ AvailableQuantityDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity toProto() {
                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity(this.surrogate.getAvailable_quantity().getStringValue(), null, 2, 0 == true ? 1 : 0);
                }

                public String toString() {
                    return "[AvailableQuantityDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof AvailableQuantityDto) && Intrinsics.areEqual(((AvailableQuantityDto) other).surrogate, this.surrogate);
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
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B \u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "available_quantity", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAvailable_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getAvailable_quantity$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final IdlDecimal available_quantity;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Surrogate() {
                        this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Surrogate) && Intrinsics.areEqual(this.available_quantity, ((Surrogate) other).available_quantity);
                    }

                    public int hashCode() {
                        return this.available_quantity.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(available_quantity=" + this.available_quantity + ")";
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C46472x415b8296.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.available_quantity = new IdlDecimal("");
                        } else {
                            this.available_quantity = idlDecimal;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (Intrinsics.areEqual(self.available_quantity, new IdlDecimal(""))) {
                            return;
                        }
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.available_quantity);
                    }

                    public Surrogate(IdlDecimal available_quantity) {
                        Intrinsics.checkNotNullParameter(available_quantity, "available_quantity");
                        this.available_quantity = available_quantity;
                    }

                    public final IdlDecimal getAvailable_quantity() {
                        return this.available_quantity;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$AvailableQuantity;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<AvailableQuantityDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<AvailableQuantityDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AvailableQuantityDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<AvailableQuantityDto> getBinaryBase64Serializer() {
                        return (KSerializer) AvailableQuantityDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AvailableQuantityDto getZeroValue() {
                        return AvailableQuantityDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public AvailableQuantityDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new AvailableQuantityDto(new Surrogate(new IdlDecimal(proto.getAvailable_quantity())), null);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.AvailableQuantityDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new AvailableQuantityDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<AvailableQuantityDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.AvailableQuantity", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, AvailableQuantityDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public AvailableQuantityDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new AvailableQuantityDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                    public final String provideIntoMap() {
                        return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$AvailableQuantityDto";
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005-,./0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010*R\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010&¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "selected_quantity", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "check_state", "", "formatted_selected_quantity", "", "is_error", "hint_quantity", "(Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;Ljava/lang/String;ZLcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;", "getSelected_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getCheck_state", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "getFormatted_selected_quantity", "()Z", "getHint_quantity", "Companion", "Surrogate", "CheckStateDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class SelectedQuantityDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<SelectedQuantityDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<SelectedQuantityDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity>> binaryBase64Serializer$delegate;
                private static final SelectedQuantityDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ SelectedQuantityDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private SelectedQuantityDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final IdlDecimal getSelected_quantity() {
                    return this.surrogate.getSelected_quantity();
                }

                public final CheckStateDto getCheck_state() {
                    return this.surrogate.getCheck_state();
                }

                public final String getFormatted_selected_quantity() {
                    return this.surrogate.getFormatted_selected_quantity();
                }

                public final boolean is_error() {
                    return this.surrogate.getIs_error();
                }

                public final IdlDecimal getHint_quantity() {
                    return this.surrogate.getHint_quantity();
                }

                public /* synthetic */ SelectedQuantityDto(IdlDecimal idlDecimal, CheckStateDto checkStateDto, String str, boolean z, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? CheckStateDto.INSTANCE.getZeroValue() : checkStateDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public SelectedQuantityDto(IdlDecimal idlDecimal, CheckStateDto check_state, String str, boolean z, IdlDecimal hint_quantity) {
                    this(new Surrogate(idlDecimal, check_state, str, z, hint_quantity));
                    Intrinsics.checkNotNullParameter(check_state, "check_state");
                    Intrinsics.checkNotNullParameter(hint_quantity, "hint_quantity");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.robinhood.idl.Dto
                public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity toProto() {
                    IdlDecimal selected_quantity = this.surrogate.getSelected_quantity();
                    return new StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity(selected_quantity != null ? selected_quantity.getStringValue() : null, (StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState) this.surrogate.getCheck_state().toProto(), this.surrogate.getFormatted_selected_quantity(), this.surrogate.getIs_error(), this.surrogate.getHint_quantity().getStringValue(), null, 32, null);
                }

                public String toString() {
                    return "[SelectedQuantityDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof SelectedQuantityDto) && Intrinsics.areEqual(((SelectedQuantityDto) other).surrogate, this.surrogate);
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
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000276B[\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u000e\u0010\u000fBK\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001fR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b3\u0010)\u001a\u0004\b\f\u00102R/\u0010\r\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010'¨\u00068"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "selected_quantity", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "check_state", "", "formatted_selected_quantity", "", "is_error", "hint_quantity", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;Ljava/lang/String;ZLcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;Ljava/lang/String;ZLcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getSelected_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getSelected_quantity$annotations", "()V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "getCheck_state", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "getCheck_state$annotations", "Ljava/lang/String;", "getFormatted_selected_quantity", "getFormatted_selected_quantity$annotations", "Z", "()Z", "is_error$annotations", "getHint_quantity", "getHint_quantity$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final CheckStateDto check_state;
                    private final String formatted_selected_quantity;
                    private final IdlDecimal hint_quantity;
                    private final boolean is_error;
                    private final IdlDecimal selected_quantity;

                    public Surrogate() {
                        this((IdlDecimal) null, (CheckStateDto) null, (String) null, false, (IdlDecimal) null, 31, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.selected_quantity, surrogate.selected_quantity) && this.check_state == surrogate.check_state && Intrinsics.areEqual(this.formatted_selected_quantity, surrogate.formatted_selected_quantity) && this.is_error == surrogate.is_error && Intrinsics.areEqual(this.hint_quantity, surrogate.hint_quantity);
                    }

                    public int hashCode() {
                        IdlDecimal idlDecimal = this.selected_quantity;
                        int iHashCode = (((idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31) + this.check_state.hashCode()) * 31;
                        String str = this.formatted_selected_quantity;
                        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_error)) * 31) + this.hint_quantity.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(selected_quantity=" + this.selected_quantity + ", check_state=" + this.check_state + ", formatted_selected_quantity=" + this.formatted_selected_quantity + ", is_error=" + this.is_error + ", hint_quantity=" + this.hint_quantity + ")";
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C46487x5544c69a.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, CheckStateDto checkStateDto, String str, boolean z, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.selected_quantity = null;
                        } else {
                            this.selected_quantity = idlDecimal;
                        }
                        if ((i & 2) == 0) {
                            this.check_state = CheckStateDto.INSTANCE.getZeroValue();
                        } else {
                            this.check_state = checkStateDto;
                        }
                        if ((i & 4) == 0) {
                            this.formatted_selected_quantity = null;
                        } else {
                            this.formatted_selected_quantity = str;
                        }
                        if ((i & 8) == 0) {
                            this.is_error = false;
                        } else {
                            this.is_error = z;
                        }
                        if ((i & 16) == 0) {
                            this.hint_quantity = new IdlDecimal("");
                        } else {
                            this.hint_quantity = idlDecimal2;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        IdlDecimal idlDecimal = self.selected_quantity;
                        if (idlDecimal != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                        }
                        if (self.check_state != CheckStateDto.INSTANCE.getZeroValue()) {
                            output.encodeSerializableElement(serialDesc, 1, CheckStateDto.Serializer.INSTANCE, self.check_state);
                        }
                        String str = self.formatted_selected_quantity;
                        if (str != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
                        }
                        boolean z = self.is_error;
                        if (z) {
                            output.encodeBooleanElement(serialDesc, 3, z);
                        }
                        if (Intrinsics.areEqual(self.hint_quantity, new IdlDecimal(""))) {
                            return;
                        }
                        output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.hint_quantity);
                    }

                    public Surrogate(IdlDecimal idlDecimal, CheckStateDto check_state, String str, boolean z, IdlDecimal hint_quantity) {
                        Intrinsics.checkNotNullParameter(check_state, "check_state");
                        Intrinsics.checkNotNullParameter(hint_quantity, "hint_quantity");
                        this.selected_quantity = idlDecimal;
                        this.check_state = check_state;
                        this.formatted_selected_quantity = str;
                        this.is_error = z;
                        this.hint_quantity = hint_quantity;
                    }

                    public final IdlDecimal getSelected_quantity() {
                        return this.selected_quantity;
                    }

                    public final CheckStateDto getCheck_state() {
                        return this.check_state;
                    }

                    public /* synthetic */ Surrogate(IdlDecimal idlDecimal, CheckStateDto checkStateDto, String str, boolean z, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? CheckStateDto.INSTANCE.getZeroValue() : checkStateDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new IdlDecimal("") : idlDecimal2);
                    }

                    public final String getFormatted_selected_quantity() {
                        return this.formatted_selected_quantity;
                    }

                    /* renamed from: is_error, reason: from getter */
                    public final boolean getIs_error() {
                        return this.is_error;
                    }

                    public final IdlDecimal getHint_quantity() {
                        return this.hint_quantity;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                public static final class Companion implements Dto3.Creator<SelectedQuantityDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<SelectedQuantityDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SelectedQuantityDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<SelectedQuantityDto> getBinaryBase64Serializer() {
                        return (KSerializer) SelectedQuantityDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SelectedQuantityDto getZeroValue() {
                        return SelectedQuantityDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public SelectedQuantityDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        String selected_quantity = proto.getSelected_quantity();
                        return new SelectedQuantityDto(new Surrogate(selected_quantity != null ? new IdlDecimal(selected_quantity) : null, CheckStateDto.INSTANCE.fromProto(proto.getCheck_state()), proto.getFormatted_selected_quantity(), proto.getIs_error(), new IdlDecimal(proto.getHint_quantity())), null);
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new SelectedQuantityDto(null, null, null, false, null, 31, null);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECK_STATE_UNSPECIFIED", "CHECK_STATE_UNCHECKED", "CHECK_STATE_HALF_CHECKED", "CHECK_STATE_CHECKED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable(with = Serializer.class)
                @RhGenerated
                public static final class CheckStateDto implements Dto2<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState>, Parcelable {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ CheckStateDto[] $VALUES;

                    @JvmField
                    public static final Parcelable.Creator<CheckStateDto> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    private static final Lazy<BinaryBase64DtoSerializer<CheckStateDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState>> binaryBase64Serializer$delegate;
                    public static final CheckStateDto CHECK_STATE_UNSPECIFIED = new CHECK_STATE_UNSPECIFIED("CHECK_STATE_UNSPECIFIED", 0);
                    public static final CheckStateDto CHECK_STATE_UNCHECKED = new CHECK_STATE_UNCHECKED("CHECK_STATE_UNCHECKED", 1);
                    public static final CheckStateDto CHECK_STATE_HALF_CHECKED = new CHECK_STATE_HALF_CHECKED("CHECK_STATE_HALF_CHECKED", 2);
                    public static final CheckStateDto CHECK_STATE_CHECKED = new CHECK_STATE_CHECKED("CHECK_STATE_CHECKED", 3);

                    private static final /* synthetic */ CheckStateDto[] $values() {
                        return new CheckStateDto[]{CHECK_STATE_UNSPECIFIED, CHECK_STATE_UNCHECKED, CHECK_STATE_HALF_CHECKED, CHECK_STATE_CHECKED};
                    }

                    public /* synthetic */ CheckStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this(str, i);
                    }

                    public static EnumEntries<CheckStateDto> getEntries() {
                        return $ENTRIES;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    private CheckStateDto(String str, int i) {
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_UNSPECIFIED", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "toProto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    static final class CHECK_STATE_UNSPECIFIED extends CheckStateDto {
                        CHECK_STATE_UNSPECIFIED(String str, int i) {
                            super(str, i, null);
                        }

                        @Override // com.robinhood.idl.Dto
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState toProto() {
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNSPECIFIED;
                        }
                    }

                    static {
                        CheckStateDto[] checkStateDtoArr$values = $values();
                        $VALUES = checkStateDtoArr$values;
                        $ENTRIES = EnumEntries2.enumEntries(checkStateDtoArr$values);
                        Companion companion = new Companion(null);
                        INSTANCE = companion;
                        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.binaryBase64Serializer_delegate$lambda$0();
                            }
                        });
                        CREATOR = new DtoParcelableCreator(companion);
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_UNCHECKED", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "toProto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    static final class CHECK_STATE_UNCHECKED extends CheckStateDto {
                        CHECK_STATE_UNCHECKED(String str, int i) {
                            super(str, i, null);
                        }

                        @Override // com.robinhood.idl.Dto
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState toProto() {
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNCHECKED;
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_HALF_CHECKED", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "toProto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    static final class CHECK_STATE_HALF_CHECKED extends CheckStateDto {
                        CHECK_STATE_HALF_CHECKED(String str, int i) {
                            super(str, i, null);
                        }

                        @Override // com.robinhood.idl.Dto
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState toProto() {
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_HALF_CHECKED;
                        }
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"microgram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto.TaxLotRowDto.CellDto.SelectedQuantityDto.CheckStateDto.CHECK_STATE_CHECKED", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "toProto", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    static final class CHECK_STATE_CHECKED extends CheckStateDto {
                        CHECK_STATE_CHECKED(String str, int i) {
                            super(str, i, null);
                        }

                        @Override // com.robinhood.idl.Dto
                        public StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState toProto() {
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_CHECKED;
                        }
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$Cell$SelectedQuantity$CheckState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion implements Dto2.Creator<CheckStateDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState> {

                        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.values().length];
                                try {
                                    iArr[StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNSPECIFIED.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_UNCHECKED.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_HALF_CHECKED.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.CHECK_STATE_CHECKED.ordinal()] = 4;
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

                        public final KSerializer<CheckStateDto> serializer() {
                            return Serializer.INSTANCE;
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<CheckStateDto> getDefaultSerializer() {
                            return serializer();
                        }

                        @Override // com.robinhood.idl.Dto.SerializableCreator
                        public KSerializer<CheckStateDto> getBinaryBase64Serializer() {
                            return (KSerializer) CheckStateDto.binaryBase64Serializer$delegate.getValue();
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState> getProtoAdapter() {
                            return StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState.ADAPTER;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public CheckStateDto getZeroValue() {
                            return CheckStateDto.CHECK_STATE_UNSPECIFIED;
                        }

                        @Override // com.robinhood.idl.Dto.Creator
                        public CheckStateDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState proto) {
                            Intrinsics.checkNotNullParameter(proto, "proto");
                            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                            if (i == 1) {
                                return CheckStateDto.CHECK_STATE_UNSPECIFIED;
                            }
                            if (i == 2) {
                                return CheckStateDto.CHECK_STATE_UNCHECKED;
                            }
                            if (i == 3) {
                                return CheckStateDto.CHECK_STATE_HALF_CHECKED;
                            }
                            if (i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return CheckStateDto.CHECK_STATE_CHECKED;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                        return new BinaryBase64DtoSerializer(INSTANCE);
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$CheckStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Serializer implements KSerializer<CheckStateDto> {
                        public static final Serializer INSTANCE = new Serializer();
                        private final /* synthetic */ EnumDtoSerializer<CheckStateDto, StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity.CheckState", CheckStateDto.getEntries(), CheckStateDto.INSTANCE.getZeroValue());

                        @Override // kotlinx.serialization.KSerializer2
                        public CheckStateDto deserialize(Decoding2 decoder) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            return (CheckStateDto) this.$$delegate_0.deserialize(decoder);
                        }

                        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                        public SerialDescriptor getDescriptor() {
                            return this.$$delegate_0.getDescriptor();
                        }

                        @Override // kotlinx.serialization.KSerializer3
                        public void serialize(Encoding4 encoder, CheckStateDto value) {
                            Intrinsics.checkNotNullParameter(encoder, "encoder");
                            Intrinsics.checkNotNullParameter(value, "value");
                            this.$$delegate_0.serialize(encoder, (Enum) value);
                        }

                        private Serializer() {
                        }
                    }

                    public static CheckStateDto valueOf(String str) {
                        return (CheckStateDto) Enum.valueOf(CheckStateDto.class, str);
                    }

                    public static CheckStateDto[] values() {
                        return (CheckStateDto[]) $VALUES.clone();
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<SelectedQuantityDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell.SelectedQuantity", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, SelectedQuantityDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public SelectedQuantityDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new SelectedQuantityDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                    public final String provideIntoMap() {
                        return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$SelectedQuantityDto";
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<CellDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.Cell", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, CellDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public CellDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new CellDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4187_3)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$CellDto";
                }
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006%$&'()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;)V", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto;", "type", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "getDismissable_alert", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "dismissable_alert", "Companion", "Surrogate", "TypeDto", "DismissableAlertDto", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class DisabledContentDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<DisabledContentDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<DisabledContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent>> binaryBase64Serializer$delegate;
            private static final DisabledContentDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ DisabledContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private DisabledContentDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final DismissableAlertDto getDismissable_alert() {
                return this.surrogate.getDismissable_alert();
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public DisabledContentDto(TypeDto typeDto) {
                TypeDto.DismissableAlert dismissableAlert = typeDto instanceof TypeDto.DismissableAlert ? (TypeDto.DismissableAlert) typeDto : null;
                this(new Surrogate(dismissableAlert != null ? dismissableAlert.getValue() : null));
            }

            public /* synthetic */ DisabledContentDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : typeDto);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent toProto() {
                DismissableAlertDto dismissable_alert = this.surrogate.getDismissable_alert();
                return new StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent(dismissable_alert != null ? dismissable_alert.toProto() : null, null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[DisabledContentDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof DisabledContentDto) && Intrinsics.areEqual(((DisabledContentDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "dismissable_alert", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "getDismissable_alert", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "getDismissable_alert$annotations", "()V", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final DismissableAlertDto dismissable_alert;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((DismissableAlertDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.dismissable_alert, ((Surrogate) other).dismissable_alert);
                }

                public int hashCode() {
                    DismissableAlertDto dismissableAlertDto = this.dismissable_alert;
                    if (dismissableAlertDto == null) {
                        return 0;
                    }
                    return dismissableAlertDto.hashCode();
                }

                public String toString() {
                    return "Surrogate(dismissable_alert=" + this.dismissable_alert + ")";
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return C46492x951a0646.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, DismissableAlertDto dismissableAlertDto, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.dismissable_alert = null;
                    } else {
                        this.dismissable_alert = dismissableAlertDto;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    DismissableAlertDto dismissableAlertDto = self.dismissable_alert;
                    if (dismissableAlertDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, DismissableAlertDto.Serializer.INSTANCE, dismissableAlertDto);
                    }
                }

                public Surrogate(DismissableAlertDto dismissableAlertDto) {
                    this.dismissable_alert = dismissableAlertDto;
                }

                public /* synthetic */ Surrogate(DismissableAlertDto dismissableAlertDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : dismissableAlertDto);
                }

                public final DismissableAlertDto getDismissable_alert() {
                    return this.dismissable_alert;
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<DisabledContentDto, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<DisabledContentDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<DisabledContentDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<DisabledContentDto> getBinaryBase64Serializer() {
                    return (KSerializer) DisabledContentDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent> getProtoAdapter() {
                    return StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DisabledContentDto getZeroValue() {
                    return DisabledContentDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public DisabledContentDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert dismissable_alert = proto.getDismissable_alert();
                    return new DisabledContentDto(new Surrogate(dismissable_alert != null ? DismissableAlertDto.INSTANCE.fromProto(dismissable_alert) : null), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new DisabledContentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "DismissableAlert", "Companion", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto$DismissableAlert;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @RhGenerated
            public static abstract class TypeDto implements Dto4 {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private TypeDto() {
                }

                @Override // com.robinhood.idl.Dto
                public Void toProto() {
                    return Dto4.DefaultImpls.toProto(this);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto$DismissableAlert;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "value", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "getValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final /* data */ class DismissableAlert extends TypeDto {
                    private final DismissableAlertDto value;

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof DismissableAlert) && Intrinsics.areEqual(this.value, ((DismissableAlert) other).value);
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "DismissableAlert(value=" + this.value + ")";
                    }

                    public final DismissableAlertDto getValue() {
                        return this.value;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public DismissableAlert(DismissableAlertDto value) {
                        super(null);
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.value = value;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$TypeDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto4.Creator<TypeDto, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent> {
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
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public TypeDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        if (proto.getDismissable_alert() != null) {
                            return new DismissableAlert(DismissableAlertDto.INSTANCE.fromProto(proto.getDismissable_alert()));
                        }
                        return null;
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;)V", "", "title", CarResultComposable2.BODY, "analytics_identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;", "getTitle", "getBody", "getAnalytics_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable(with = Serializer.class)
            @RhGenerated
            public static final class DismissableAlertDto implements Dto3<StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert>, Parcelable {

                @JvmField
                public static final Parcelable.Creator<DismissableAlertDto> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private static final Lazy<BinaryBase64DtoSerializer<DismissableAlertDto, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert>> binaryBase64Serializer$delegate;
                private static final DismissableAlertDto zeroValue;
                private final Surrogate surrogate;

                public /* synthetic */ DismissableAlertDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                    this(surrogate);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                private DismissableAlertDto(Surrogate surrogate) {
                    this.surrogate = surrogate;
                }

                public final String getTitle() {
                    return this.surrogate.getTitle();
                }

                public final String getBody() {
                    return this.surrogate.getBody();
                }

                public final String getAnalytics_identifier() {
                    return this.surrogate.getAnalytics_identifier();
                }

                public /* synthetic */ DismissableAlertDto(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public DismissableAlertDto(String title, String body, String analytics_identifier) {
                    this(new Surrogate(title, body, analytics_identifier));
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(body, "body");
                    Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                }

                @Override // com.robinhood.idl.Dto
                public StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert toProto() {
                    return new StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert(this.surrogate.getTitle(), this.surrogate.getBody(), this.surrogate.getAnalytics_identifier(), null, 8, null);
                }

                public String toString() {
                    return "[DismissableAlertDto]:" + toProto();
                }

                public boolean equals(Object other) {
                    if (other != this) {
                        return (other instanceof DismissableAlertDto) && Intrinsics.areEqual(((DismissableAlertDto) other).surrogate, this.surrogate);
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
                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;", "", "", "title", CarResultComposable2.BODY, "analytics_identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBody", "getBody$annotations", "getAnalytics_identifier", "getAnalytics_identifier$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                @Serializable
                static final /* data */ class Surrogate {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private final String analytics_identifier;
                    private final String body;
                    private final String title;

                    public Surrogate() {
                        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Surrogate)) {
                            return false;
                        }
                        Surrogate surrogate = (Surrogate) other;
                        return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.body, surrogate.body) && Intrinsics.areEqual(this.analytics_identifier, surrogate.analytics_identifier);
                    }

                    public int hashCode() {
                        return (((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.analytics_identifier.hashCode();
                    }

                    public String toString() {
                        return "Surrogate(title=" + this.title + ", body=" + this.body + ", analytics_identifier=" + this.analytics_identifier + ")";
                    }

                    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public static final class Companion {
                        private Companion() {
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final KSerializer<Surrogate> serializer() {
                            return C46491xbe0cc129.INSTANCE;
                        }
                    }

                    public /* synthetic */ Surrogate(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.title = "";
                        } else {
                            this.title = str;
                        }
                        if ((i & 2) == 0) {
                            this.body = "";
                        } else {
                            this.body = str2;
                        }
                        if ((i & 4) == 0) {
                            this.analytics_identifier = "";
                        } else {
                            this.analytics_identifier = str3;
                        }
                    }

                    @JvmStatic
                    public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                        if (!Intrinsics.areEqual(self.title, "")) {
                            output.encodeStringElement(serialDesc, 0, self.title);
                        }
                        if (!Intrinsics.areEqual(self.body, "")) {
                            output.encodeStringElement(serialDesc, 1, self.body);
                        }
                        if (Intrinsics.areEqual(self.analytics_identifier, "")) {
                            return;
                        }
                        output.encodeStringElement(serialDesc, 2, self.analytics_identifier);
                    }

                    public Surrogate(String title, String body, String analytics_identifier) {
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(body, "body");
                        Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                        this.title = title;
                        this.body = body;
                        this.analytics_identifier = analytics_identifier;
                    }

                    public /* synthetic */ Surrogate(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public final String getBody() {
                        return this.body;
                    }

                    public final String getAnalytics_identifier() {
                        return this.analytics_identifier;
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponse$TaxLotRow$DisabledContent$DismissableAlert;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion implements Dto3.Creator<DismissableAlertDto, StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert> {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final KSerializer<DismissableAlertDto> serializer() {
                        return Serializer.INSTANCE;
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DismissableAlertDto> getDefaultSerializer() {
                        return serializer();
                    }

                    @Override // com.robinhood.idl.Dto.SerializableCreator
                    public KSerializer<DismissableAlertDto> getBinaryBase64Serializer() {
                        return (KSerializer) DismissableAlertDto.binaryBase64Serializer$delegate.getValue();
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public ProtoAdapter<StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert> getProtoAdapter() {
                        return StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert.ADAPTER;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DismissableAlertDto getZeroValue() {
                        return DismissableAlertDto.zeroValue;
                    }

                    @Override // com.robinhood.idl.Dto.Creator
                    public DismissableAlertDto fromProto(StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert proto) {
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        return new DismissableAlertDto(new Surrogate(proto.getTitle(), proto.getBody(), proto.getAnalytics_identifier()), null);
                    }
                }

                static {
                    Companion companion = new Companion(null);
                    INSTANCE = companion;
                    binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StreamTaxLotViewModelsResponseDto.TaxLotRowDto.DisabledContentDto.DismissableAlertDto.binaryBase64Serializer_delegate$lambda$0();
                        }
                    });
                    zeroValue = new DismissableAlertDto(null, null, null, 7, null);
                    CREATOR = new DtoParcelableCreator(companion);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                    return new BinaryBase64DtoSerializer(INSTANCE);
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Serializer implements KSerializer<DismissableAlertDto> {
                    public static final Serializer INSTANCE = new Serializer();
                    private static final SerialDescriptor descriptor;
                    private static final KSerializer<Surrogate> surrogateSerializer;

                    private Serializer() {
                    }

                    static {
                        KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                        surrogateSerializer = kSerializerSerializer;
                        descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent.DismissableAlert", kSerializerSerializer.getDescriptor());
                    }

                    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // kotlinx.serialization.KSerializer3
                    public void serialize(Encoding4 encoder, DismissableAlertDto value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                    }

                    @Override // kotlinx.serialization.KSerializer2
                    public DismissableAlertDto deserialize(Decoding2 decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return new DismissableAlertDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                    }
                }

                /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class MultibindingModule {
                    public static final MultibindingModule INSTANCE = new MultibindingModule();

                    private MultibindingModule() {
                    }

                    @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                    public final String provideIntoMap() {
                        return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$DismissableAlertDto";
                    }
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<DisabledContentDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow.DisabledContent", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, DisabledContentDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public DisabledContentDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new DisabledContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                public final String provideIntoMap() {
                    return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto$DisabledContentDto";
                }
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TaxLotRowDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse.TaxLotRow", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TaxLotRowDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TaxLotRowDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TaxLotRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$TaxLotRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto$TaxLotRowDto";
            }
        }
    }

    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamTaxLotViewModelsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamTaxLotViewModelsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamTaxLotViewModelsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamTaxLotViewModelsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamTaxLotViewModelsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamTaxLotViewModelsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamTaxLotViewModelsResponseDto";
        }
    }
}
