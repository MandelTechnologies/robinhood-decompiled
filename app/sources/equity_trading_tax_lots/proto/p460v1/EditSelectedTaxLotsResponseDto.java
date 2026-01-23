package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.EditSelectedTaxLotsResponseDto;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelectionDto;
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

/* compiled from: EditSelectedTaxLotsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponse;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;)V", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelectionDto;", "tax_lots_selection", "", "order_id", "instrument_id", "rhs_account_number", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class EditSelectedTaxLotsResponseDto implements Dto3<EditSelectedTaxLotsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EditSelectedTaxLotsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EditSelectedTaxLotsResponseDto, EditSelectedTaxLotsResponse>> binaryBase64Serializer$delegate;
    private static final EditSelectedTaxLotsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EditSelectedTaxLotsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EditSelectedTaxLotsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ EditSelectedTaxLotsResponseDto(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditSelectedTaxLotsResponseDto(List<TaxLotSelectionDto> tax_lots_selection, String order_id, String instrument_id, String rhs_account_number) {
        this(new Surrogate(tax_lots_selection, order_id, instrument_id, rhs_account_number));
        Intrinsics.checkNotNullParameter(tax_lots_selection, "tax_lots_selection");
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
    }

    @Override // com.robinhood.idl.Dto
    public EditSelectedTaxLotsResponse toProto() {
        List<TaxLotSelectionDto> tax_lots_selection = this.surrogate.getTax_lots_selection();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lots_selection, 10));
        Iterator<T> it = tax_lots_selection.iterator();
        while (it.hasNext()) {
            arrayList.add(((TaxLotSelectionDto) it.next()).toProto());
        }
        return new EditSelectedTaxLotsResponse(arrayList, this.surrogate.getOrder_id(), this.surrogate.getInstrument_id(), this.surrogate.getRhs_account_number(), null, 16, null);
    }

    public String toString() {
        return "[EditSelectedTaxLotsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EditSelectedTaxLotsResponseDto) && Intrinsics.areEqual(((EditSelectedTaxLotsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: EditSelectedTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B5\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001a¨\u0006/"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;", "", "", "Lequity_trading_tax_lots/proto/v1/TaxLotSelectionDto;", "tax_lots_selection", "", "order_id", "instrument_id", "rhs_account_number", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTax_lots_selection", "()Ljava/util/List;", "getTax_lots_selection$annotations", "()V", "Ljava/lang/String;", "getOrder_id", "getOrder_id$annotations", "getInstrument_id", "getInstrument_id$annotations", "getRhs_account_number", "getRhs_account_number$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String instrument_id;
        private final String order_id;
        private final String rhs_account_number;
        private final List<TaxLotSelectionDto> tax_lots_selection;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: equity_trading_tax_lots.proto.v1.EditSelectedTaxLotsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditSelectedTaxLotsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((List) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TaxLotSelectionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.tax_lots_selection, surrogate.tax_lots_selection) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number);
        }

        public int hashCode() {
            return (((((this.tax_lots_selection.hashCode() * 31) + this.order_id.hashCode()) * 31) + this.instrument_id.hashCode()) * 31) + this.rhs_account_number.hashCode();
        }

        public String toString() {
            return "Surrogate(tax_lots_selection=" + this.tax_lots_selection + ", order_id=" + this.order_id + ", instrument_id=" + this.instrument_id + ", rhs_account_number=" + this.rhs_account_number + ")";
        }

        /* compiled from: EditSelectedTaxLotsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EditSelectedTaxLotsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.tax_lots_selection = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 4) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str2;
            }
            if ((i & 8) == 0) {
                this.rhs_account_number = "";
            } else {
                this.rhs_account_number = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.tax_lots_selection, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.tax_lots_selection);
            }
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.order_id);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.instrument_id);
            }
            if (Intrinsics.areEqual(self.rhs_account_number, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.rhs_account_number);
        }

        public Surrogate(List<TaxLotSelectionDto> tax_lots_selection, String order_id, String instrument_id, String rhs_account_number) {
            Intrinsics.checkNotNullParameter(tax_lots_selection, "tax_lots_selection");
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
            this.tax_lots_selection = tax_lots_selection;
            this.order_id = order_id;
            this.instrument_id = instrument_id;
            this.rhs_account_number = rhs_account_number;
        }

        public final List<TaxLotSelectionDto> getTax_lots_selection() {
            return this.tax_lots_selection;
        }

        public /* synthetic */ Surrogate(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }
    }

    /* compiled from: EditSelectedTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EditSelectedTaxLotsResponseDto, EditSelectedTaxLotsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EditSelectedTaxLotsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EditSelectedTaxLotsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EditSelectedTaxLotsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) EditSelectedTaxLotsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EditSelectedTaxLotsResponse> getProtoAdapter() {
            return EditSelectedTaxLotsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EditSelectedTaxLotsResponseDto getZeroValue() {
            return EditSelectedTaxLotsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EditSelectedTaxLotsResponseDto fromProto(EditSelectedTaxLotsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<TaxLotSelection> tax_lots_selection = proto.getTax_lots_selection();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tax_lots_selection, 10));
            Iterator<T> it = tax_lots_selection.iterator();
            while (it.hasNext()) {
                arrayList.add(TaxLotSelectionDto.INSTANCE.fromProto((TaxLotSelection) it.next()));
            }
            return new EditSelectedTaxLotsResponseDto(new Surrogate(arrayList, proto.getOrder_id(), proto.getInstrument_id(), proto.getRhs_account_number()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.EditSelectedTaxLotsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditSelectedTaxLotsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new EditSelectedTaxLotsResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EditSelectedTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<EditSelectedTaxLotsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.EditSelectedTaxLotsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EditSelectedTaxLotsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EditSelectedTaxLotsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EditSelectedTaxLotsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EditSelectedTaxLotsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/EditSelectedTaxLotsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.EditSelectedTaxLotsResponseDto";
        }
    }
}
