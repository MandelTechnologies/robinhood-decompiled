package nummus.p512v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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
import nummus.p512v1.OrderTaxLotDetailDto;
import nummus.p512v1.TaxLotsForOrderResponseDto;

/* compiled from: TaxLotsForOrderResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BQ\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017¨\u00061"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/TaxLotsForOrderResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;)V", "", "order_id", "", "is_confirmed", "Lcom/robinhood/idl/IdlDecimal;", "total_gain_loss_amount", "", "Lnummus/v1/OrderTaxLotDetailDto;", "order_tax_lot_details", "next", "previous", "(Ljava/lang/String;ZLcom/robinhood/idl/IdlDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lnummus/v1/TaxLotsForOrderResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;", "()Z", "getTotal_gain_loss_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getOrder_tax_lot_details", "()Ljava/util/List;", "getNext", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class TaxLotsForOrderResponseDto implements Dto3<TaxLotsForOrderResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLotsForOrderResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLotsForOrderResponseDto, TaxLotsForOrderResponse>> binaryBase64Serializer$delegate;
    private static final TaxLotsForOrderResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLotsForOrderResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLotsForOrderResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean is_confirmed() {
        return this.surrogate.getIs_confirmed();
    }

    public final IdlDecimal getTotal_gain_loss_amount() {
        return this.surrogate.getTotal_gain_loss_amount();
    }

    public final List<OrderTaxLotDetailDto> getOrder_tax_lot_details() {
        return this.surrogate.getOrder_tax_lot_details();
    }

    public final String getNext() {
        return this.surrogate.getNext();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TaxLotsForOrderResponseDto(java.lang.String r2, boolean r3, com.robinhood.idl.IdlDecimal r4, java.util.List r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            r3 = 0
        Lb:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L19
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L19:
            r9 = r8 & 16
            if (r9 == 0) goto L1e
            r6 = r0
        L1e:
            r8 = r8 & 32
            if (r8 == 0) goto L2a
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L31
        L2a:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L31:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.TaxLotsForOrderResponseDto.<init>(java.lang.String, boolean, com.robinhood.idl.IdlDecimal, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLotsForOrderResponseDto(String order_id, boolean z, IdlDecimal idlDecimal, List<OrderTaxLotDetailDto> order_tax_lot_details, String str, String str2) {
        this(new Surrogate(order_id, z, idlDecimal, order_tax_lot_details, str, str2));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(order_tax_lot_details, "order_tax_lot_details");
    }

    @Override // com.robinhood.idl.Dto
    public TaxLotsForOrderResponse toProto() {
        String order_id = this.surrogate.getOrder_id();
        boolean is_confirmed = this.surrogate.getIs_confirmed();
        IdlDecimal total_gain_loss_amount = this.surrogate.getTotal_gain_loss_amount();
        String stringValue = total_gain_loss_amount != null ? total_gain_loss_amount.getStringValue() : null;
        List<OrderTaxLotDetailDto> order_tax_lot_details = this.surrogate.getOrder_tax_lot_details();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_tax_lot_details, 10));
        Iterator<T> it = order_tax_lot_details.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderTaxLotDetailDto) it.next()).toProto());
        }
        return new TaxLotsForOrderResponse(order_id, is_confirmed, stringValue, arrayList, this.surrogate.getNext(), this.surrogate.getPrevious(), null, 64, null);
    }

    public String toString() {
        return "[TaxLotsForOrderResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLotsForOrderResponseDto) && Intrinsics.areEqual(((TaxLotsForOrderResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLotsForOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:B^\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B[\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010+\u0012\u0004\b-\u0010*\u001a\u0004\b\u0005\u0010,R1\u0010\n\u001a\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010*\u001a\u0004\b/\u00100R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010'\u0012\u0004\b7\u0010*\u001a\u0004\b6\u0010!R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010'\u0012\u0004\b9\u0010*\u001a\u0004\b8\u0010!¨\u0006<"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;", "", "", "order_id", "", "is_confirmed", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "total_gain_loss_amount", "", "Lnummus/v1/OrderTaxLotDetailDto;", "order_tax_lot_details", "next", "previous", "<init>", "(Ljava/lang/String;ZLcom/robinhood/idl/IdlDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/robinhood/idl/IdlDecimal;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrder_id", "getOrder_id$annotations", "()V", "Z", "()Z", "is_confirmed$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getTotal_gain_loss_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getTotal_gain_loss_amount$annotations", "Ljava/util/List;", "getOrder_tax_lot_details", "()Ljava/util/List;", "getOrder_tax_lot_details$annotations", "getNext", "getNext$annotations", "getPrevious", "getPrevious$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final boolean is_confirmed;
        private final String next;
        private final String order_id;
        private final List<OrderTaxLotDetailDto> order_tax_lot_details;
        private final String previous;
        private final IdlDecimal total_gain_loss_amount;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: nummus.v1.TaxLotsForOrderResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotsForOrderResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, false, (IdlDecimal) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderTaxLotDetailDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.is_confirmed == surrogate.is_confirmed && Intrinsics.areEqual(this.total_gain_loss_amount, surrogate.total_gain_loss_amount) && Intrinsics.areEqual(this.order_tax_lot_details, surrogate.order_tax_lot_details) && Intrinsics.areEqual(this.next, surrogate.next) && Intrinsics.areEqual(this.previous, surrogate.previous);
        }

        public int hashCode() {
            int iHashCode = ((this.order_id.hashCode() * 31) + Boolean.hashCode(this.is_confirmed)) * 31;
            IdlDecimal idlDecimal = this.total_gain_loss_amount;
            int iHashCode2 = (((iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + this.order_tax_lot_details.hashCode()) * 31;
            String str = this.next;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.previous;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", is_confirmed=" + this.is_confirmed + ", total_gain_loss_amount=" + this.total_gain_loss_amount + ", order_tax_lot_details=" + this.order_tax_lot_details + ", next=" + this.next + ", previous=" + this.previous + ")";
        }

        /* compiled from: TaxLotsForOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLotsForOrderResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, IdlDecimal idlDecimal, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.order_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.is_confirmed = false;
            } else {
                this.is_confirmed = z;
            }
            if ((i & 4) == 0) {
                this.total_gain_loss_amount = null;
            } else {
                this.total_gain_loss_amount = idlDecimal;
            }
            if ((i & 8) == 0) {
                this.order_tax_lot_details = CollectionsKt.emptyList();
            } else {
                this.order_tax_lot_details = list;
            }
            if ((i & 16) == 0) {
                this.next = null;
            } else {
                this.next = str2;
            }
            if ((i & 32) == 0) {
                this.previous = null;
            } else {
                this.previous = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            boolean z = self.is_confirmed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            IdlDecimal idlDecimal = self.total_gain_loss_amount;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            if (!Intrinsics.areEqual(self.order_tax_lot_details, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.order_tax_lot_details);
            }
            String str = self.next;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            String str2 = self.previous;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String order_id, boolean z, IdlDecimal idlDecimal, List<OrderTaxLotDetailDto> order_tax_lot_details, String str, String str2) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(order_tax_lot_details, "order_tax_lot_details");
            this.order_id = order_id;
            this.is_confirmed = z;
            this.total_gain_loss_amount = idlDecimal;
            this.order_tax_lot_details = order_tax_lot_details;
            this.next = str;
            this.previous = str2;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, boolean r3, com.robinhood.idl.IdlDecimal r4, java.util.List r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto Lb
                r3 = 0
            Lb:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L11
                r4 = r0
            L11:
                r9 = r8 & 8
                if (r9 == 0) goto L19
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L19:
                r9 = r8 & 16
                if (r9 == 0) goto L1e
                r6 = r0
            L1e:
                r8 = r8 & 32
                if (r8 == 0) goto L2a
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L31
            L2a:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L31:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.TaxLotsForOrderResponseDto.Surrogate.<init>(java.lang.String, boolean, com.robinhood.idl.IdlDecimal, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* renamed from: is_confirmed, reason: from getter */
        public final boolean getIs_confirmed() {
            return this.is_confirmed;
        }

        public final IdlDecimal getTotal_gain_loss_amount() {
            return this.total_gain_loss_amount;
        }

        public final List<OrderTaxLotDetailDto> getOrder_tax_lot_details() {
            return this.order_tax_lot_details;
        }

        public final String getNext() {
            return this.next;
        }

        public final String getPrevious() {
            return this.previous;
        }
    }

    /* compiled from: TaxLotsForOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/TaxLotsForOrderResponseDto;", "Lnummus/v1/TaxLotsForOrderResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/TaxLotsForOrderResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLotsForOrderResponseDto, TaxLotsForOrderResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLotsForOrderResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotsForOrderResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLotsForOrderResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLotsForOrderResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLotsForOrderResponse> getProtoAdapter() {
            return TaxLotsForOrderResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotsForOrderResponseDto getZeroValue() {
            return TaxLotsForOrderResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLotsForOrderResponseDto fromProto(TaxLotsForOrderResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String order_id = proto.getOrder_id();
            boolean zIs_confirmed = proto.getIs_confirmed();
            String total_gain_loss_amount = proto.getTotal_gain_loss_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = total_gain_loss_amount != null ? new IdlDecimal(total_gain_loss_amount) : null;
            List<OrderTaxLotDetail> order_tax_lot_details = proto.getOrder_tax_lot_details();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_tax_lot_details, 10));
            Iterator<T> it = order_tax_lot_details.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderTaxLotDetailDto.INSTANCE.fromProto((OrderTaxLotDetail) it.next()));
            }
            return new TaxLotsForOrderResponseDto(new Surrogate(order_id, zIs_confirmed, idlDecimal, arrayList, proto.getNext(), proto.getPrevious()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.TaxLotsForOrderResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLotsForOrderResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new TaxLotsForOrderResponseDto(null, false, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLotsForOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/TaxLotsForOrderResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/TaxLotsForOrderResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLotsForOrderResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.TaxLotsForOrderResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLotsForOrderResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLotsForOrderResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLotsForOrderResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLotsForOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/TaxLotsForOrderResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "nummus.v1.TaxLotsForOrderResponseDto";
        }
    }
}
