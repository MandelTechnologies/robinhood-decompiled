package black_widow.contracts.mobile_app_chart.proto.p024v1;

import android.os.Parcel;
import android.os.Parcelable;
import black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesOrderSideDto;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: EquitiesLimitOrderPayloadDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B=\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010*R\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010*¨\u0006/"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "Lcom/robinhood/idl/MessageDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;", "Landroid/os/Parcelable;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;", "surrogate", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;)V", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;", "side", "Lcom/robinhood/idl/IdlDecimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "", "is_sell_all", "is_buy_all", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZZ)V", "toProto", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;", "getSide", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;", "getPrice", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class EquitiesLimitOrderPayloadDto implements Dto3<EquitiesLimitOrderPayload>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EquitiesLimitOrderPayloadDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EquitiesLimitOrderPayloadDto, EquitiesLimitOrderPayload>> binaryBase64Serializer$delegate;
    private static final EquitiesLimitOrderPayloadDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EquitiesLimitOrderPayloadDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EquitiesLimitOrderPayloadDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EquitiesOrderSideDto getSide() {
        return this.surrogate.getSide();
    }

    public final IdlDecimal getPrice() {
        return this.surrogate.getPrice();
    }

    public final IdlDecimal getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final boolean is_sell_all() {
        return this.surrogate.getIs_sell_all();
    }

    public final boolean is_buy_all() {
        return this.surrogate.getIs_buy_all();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ EquitiesLimitOrderPayloadDto(black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesOrderSideDto r2, com.robinhood.idl.IdlDecimal r3, com.robinhood.idl.IdlDecimal r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto La
            black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSideDto$Companion r2 = black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesOrderSideDto.INSTANCE
            black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSideDto r2 = r2.getZeroValue()
        La:
            r8 = r7 & 2
            if (r8 == 0) goto L15
            com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
            java.lang.String r8 = ""
            r3.<init>(r8)
        L15:
            r8 = r7 & 4
            if (r8 == 0) goto L1a
            r4 = 0
        L1a:
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L20
            r5 = r0
        L20:
            r7 = r7 & 16
            if (r7 == 0) goto L2b
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L31
        L2b:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L31:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesLimitOrderPayloadDto.<init>(black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSideDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EquitiesLimitOrderPayloadDto(EquitiesOrderSideDto side, IdlDecimal price, IdlDecimal idlDecimal, boolean z, boolean z2) {
        this(new Surrogate(side, price, idlDecimal, z, z2));
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(price, "price");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public EquitiesLimitOrderPayload toProto() {
        EquitiesOrderSide equitiesOrderSide = (EquitiesOrderSide) this.surrogate.getSide().toProto();
        String stringValue = this.surrogate.getPrice().getStringValue();
        IdlDecimal quantity = this.surrogate.getQuantity();
        return new EquitiesLimitOrderPayload(equitiesOrderSide, stringValue, quantity != null ? quantity.getStringValue() : null, this.surrogate.getIs_sell_all(), this.surrogate.getIs_buy_all(), null, 32, null);
    }

    public String toString() {
        return "[EquitiesLimitOrderPayloadDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EquitiesLimitOrderPayloadDto) && Intrinsics.areEqual(((EquitiesLimitOrderPayloadDto) other).surrogate, this.surrogate);
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
    /* compiled from: EquitiesLimitOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eBI\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R/\u0010\b\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R1\u0010\t\u001a\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010,R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00100\u0012\u0004\b2\u0010)\u001a\u0004\b\u000b\u00101R \u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b\f\u00101¨\u00066"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;", "side", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "quantity", "", "is_sell_all", "is_buy_all", "<init>", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$black_widow_mobile_chart_externalRelease", "(Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;", "getSide", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;", "getSide$annotations", "()V", "Lcom/robinhood/idl/IdlDecimal;", "getPrice", "()Lcom/robinhood/idl/IdlDecimal;", "getPrice$annotations", "getQuantity", "getQuantity$annotations", "Z", "()Z", "is_sell_all$annotations", "is_buy_all$annotations", "Companion", "$serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_buy_all;
        private final boolean is_sell_all;
        private final IdlDecimal price;
        private final IdlDecimal quantity;
        private final EquitiesOrderSideDto side;

        public Surrogate() {
            this((EquitiesOrderSideDto) null, (IdlDecimal) null, (IdlDecimal) null, false, false, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.side == surrogate.side && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && this.is_sell_all == surrogate.is_sell_all && this.is_buy_all == surrogate.is_buy_all;
        }

        public int hashCode() {
            int iHashCode = ((this.side.hashCode() * 31) + this.price.hashCode()) * 31;
            IdlDecimal idlDecimal = this.quantity;
            return ((((iHashCode + (idlDecimal == null ? 0 : idlDecimal.hashCode())) * 31) + Boolean.hashCode(this.is_sell_all)) * 31) + Boolean.hashCode(this.is_buy_all);
        }

        public String toString() {
            return "Surrogate(side=" + this.side + ", price=" + this.price + ", quantity=" + this.quantity + ", is_sell_all=" + this.is_sell_all + ", is_buy_all=" + this.is_buy_all + ")";
        }

        /* compiled from: EquitiesLimitOrderPayloadDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EquitiesLimitOrderPayloadDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EquitiesOrderSideDto equitiesOrderSideDto, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            this.side = (i & 1) == 0 ? EquitiesOrderSideDto.INSTANCE.getZeroValue() : equitiesOrderSideDto;
            if ((i & 2) == 0) {
                this.price = new IdlDecimal("");
            } else {
                this.price = idlDecimal;
            }
            if ((i & 4) == 0) {
                this.quantity = null;
            } else {
                this.quantity = idlDecimal2;
            }
            if ((i & 8) == 0) {
                this.is_sell_all = false;
            } else {
                this.is_sell_all = z;
            }
            if ((i & 16) == 0) {
                this.is_buy_all = false;
            } else {
                this.is_buy_all = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$black_widow_mobile_chart_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.side != EquitiesOrderSideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EquitiesOrderSideDto.Serializer.INSTANCE, self.side);
            }
            if (!Intrinsics.areEqual(self.price, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.price);
            }
            IdlDecimal idlDecimal = self.quantity;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            boolean z = self.is_sell_all;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            boolean z2 = self.is_buy_all;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 4, z2);
            }
        }

        public Surrogate(EquitiesOrderSideDto side, IdlDecimal price, IdlDecimal idlDecimal, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(price, "price");
            this.side = side;
            this.price = price;
            this.quantity = idlDecimal;
            this.is_sell_all = z;
            this.is_buy_all = z2;
        }

        public final EquitiesOrderSideDto getSide() {
            return this.side;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesOrderSideDto r2, com.robinhood.idl.IdlDecimal r3, com.robinhood.idl.IdlDecimal r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSideDto$Companion r2 = black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesOrderSideDto.INSTANCE
                black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSideDto r2 = r2.getZeroValue()
            La:
                r8 = r7 & 2
                if (r8 == 0) goto L15
                com.robinhood.idl.IdlDecimal r3 = new com.robinhood.idl.IdlDecimal
                java.lang.String r8 = ""
                r3.<init>(r8)
            L15:
                r8 = r7 & 4
                if (r8 == 0) goto L1a
                r4 = 0
            L1a:
                r8 = r7 & 8
                r0 = 0
                if (r8 == 0) goto L20
                r5 = r0
            L20:
                r7 = r7 & 16
                if (r7 == 0) goto L2b
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L31
            L2b:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L31:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesLimitOrderPayloadDto.Surrogate.<init>(black_widow.contracts.mobile_app_chart.proto.v1.EquitiesOrderSideDto, com.robinhood.idl.IdlDecimal, com.robinhood.idl.IdlDecimal, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IdlDecimal getPrice() {
            return this.price;
        }

        public final IdlDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: is_sell_all, reason: from getter */
        public final boolean getIs_sell_all() {
            return this.is_sell_all;
        }

        /* renamed from: is_buy_all, reason: from getter */
        public final boolean getIs_buy_all() {
            return this.is_buy_all;
        }
    }

    /* compiled from: EquitiesLimitOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayload;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EquitiesLimitOrderPayloadDto, EquitiesLimitOrderPayload> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EquitiesLimitOrderPayloadDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquitiesLimitOrderPayloadDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EquitiesLimitOrderPayloadDto> getBinaryBase64Serializer() {
            return (KSerializer) EquitiesLimitOrderPayloadDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EquitiesLimitOrderPayload> getProtoAdapter() {
            return EquitiesLimitOrderPayload.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquitiesLimitOrderPayloadDto getZeroValue() {
            return EquitiesLimitOrderPayloadDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EquitiesLimitOrderPayloadDto fromProto(EquitiesLimitOrderPayload proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EquitiesOrderSideDto equitiesOrderSideDtoFromProto = EquitiesOrderSideDto.INSTANCE.fromProto(proto.getSide());
            IdlDecimal idlDecimal = new IdlDecimal(proto.getPrice());
            String quantity = proto.getQuantity();
            return new EquitiesLimitOrderPayloadDto(new Surrogate(equitiesOrderSideDtoFromProto, idlDecimal, quantity != null ? new IdlDecimal(quantity) : null, proto.getIs_sell_all(), proto.getIs_buy_all()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: black_widow.contracts.mobile_app_chart.proto.v1.EquitiesLimitOrderPayloadDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquitiesLimitOrderPayloadDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EquitiesLimitOrderPayloadDto(null, null, null, false, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EquitiesLimitOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto;", "<init>", "()V", "surrogateSerializer", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EquitiesLimitOrderPayloadDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/black_widow.contracts.mobile_app_chart.proto.v1.EquitiesLimitOrderPayload", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EquitiesLimitOrderPayloadDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EquitiesLimitOrderPayloadDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EquitiesLimitOrderPayloadDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EquitiesLimitOrderPayloadDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesLimitOrderPayloadDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "black_widow.contracts.mobile_app_chart.proto.v1.EquitiesLimitOrderPayloadDto";
        }
    }
}
