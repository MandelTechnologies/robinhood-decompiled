package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: ComboOrderDetailContextDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000eH\u0016J\b\u0010&\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006+"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Surrogate;)V", "order_id", "", "underlying_symbol", "limit_price", "", "quantity", "", "order_state", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V", "getOrder_id", "()Ljava/lang/String;", "getUnderlying_symbol", "getLimit_price", "()F", "getQuantity", "()I", "getOrder_state", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class ComboOrderDetailContextDto implements Dto3<ComboOrderDetailContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ComboOrderDetailContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ComboOrderDetailContextDto, ComboOrderDetailContext>> binaryBase64Serializer$delegate;
    private static final ComboOrderDetailContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ComboOrderDetailContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ComboOrderDetailContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final String getUnderlying_symbol() {
        return this.surrogate.getUnderlying_symbol();
    }

    public final float getLimit_price() {
        return this.surrogate.getLimit_price();
    }

    public final int getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final String getOrder_state() {
        return this.surrogate.getOrder_state();
    }

    public /* synthetic */ ComboOrderDetailContextDto(String str, String str2, float f, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComboOrderDetailContextDto(String order_id, String underlying_symbol, float f, int i, String order_state) {
        this(new Surrogate(order_id, underlying_symbol, f, i, order_state));
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
    }

    public static /* synthetic */ ComboOrderDetailContextDto copy$default(ComboOrderDetailContextDto comboOrderDetailContextDto, String str, String str2, float f, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = comboOrderDetailContextDto.surrogate.getOrder_id();
        }
        if ((i2 & 2) != 0) {
            str2 = comboOrderDetailContextDto.surrogate.getUnderlying_symbol();
        }
        if ((i2 & 4) != 0) {
            f = comboOrderDetailContextDto.surrogate.getLimit_price();
        }
        if ((i2 & 8) != 0) {
            i = comboOrderDetailContextDto.surrogate.getQuantity();
        }
        if ((i2 & 16) != 0) {
            str3 = comboOrderDetailContextDto.surrogate.getOrder_state();
        }
        String str4 = str3;
        float f2 = f;
        return comboOrderDetailContextDto.copy(str, str2, f2, i, str4);
    }

    public final ComboOrderDetailContextDto copy(String order_id, String underlying_symbol, float limit_price, int quantity, String order_state) {
        Intrinsics.checkNotNullParameter(order_id, "order_id");
        Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        return new ComboOrderDetailContextDto(new Surrogate(order_id, underlying_symbol, limit_price, quantity, order_state));
    }

    @Override // com.robinhood.idl.Dto
    public ComboOrderDetailContext toProto() {
        return new ComboOrderDetailContext(this.surrogate.getOrder_id(), this.surrogate.getUnderlying_symbol(), this.surrogate.getLimit_price(), this.surrogate.getQuantity(), this.surrogate.getOrder_state(), null, 32, null);
    }

    public String toString() {
        return "[ComboOrderDetailContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ComboOrderDetailContextDto) && Intrinsics.areEqual(((ComboOrderDetailContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: ComboOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 62\u00020\u0001:\u000256BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fBI\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0018\u0010$\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\tHÆ\u0003J\u0018\u0010%\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\fHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\b\u0002\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t2\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J%\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0001¢\u0006\u0002\b4R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R+\u0010\u0005\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR+\u0010\n\u001a\u00110\u000b¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Surrogate;", "", "order_id", "", "underlying_symbol", "limit_price", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "quantity", "", "Lcom/robinhood/idl/serialization/Int32Serializer;", "order_state", "<init>", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;FILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Ljava/lang/String;", "getUnderlying_symbol$annotations", "getUnderlying_symbol", "getLimit_price$annotations", "getLimit_price", "()F", "getQuantity$annotations", "getQuantity", "()I", "getOrder_state$annotations", "getOrder_state", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final float limit_price;
        private final String order_id;
        private final String order_state;
        private final int quantity;
        private final String underlying_symbol;

        public Surrogate() {
            this((String) null, (String) null, 0.0f, 0, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, float f, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surrogate.order_id;
            }
            if ((i2 & 2) != 0) {
                str2 = surrogate.underlying_symbol;
            }
            if ((i2 & 4) != 0) {
                f = surrogate.limit_price;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.quantity;
            }
            if ((i2 & 16) != 0) {
                str3 = surrogate.order_state;
            }
            String str4 = str3;
            float f2 = f;
            return surrogate.copy(str, str2, f2, i, str4);
        }

        @SerialName("limitPrice")
        @JsonAnnotations2(names = {"limit_price"})
        public static /* synthetic */ void getLimit_price$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderState")
        @JsonAnnotations2(names = {"order_state"})
        public static /* synthetic */ void getOrder_state$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("underlyingSymbol")
        @JsonAnnotations2(names = {"underlying_symbol"})
        public static /* synthetic */ void getUnderlying_symbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUnderlying_symbol() {
            return this.underlying_symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final float getLimit_price() {
            return this.limit_price;
        }

        /* renamed from: component4, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOrder_state() {
            return this.order_state;
        }

        public final Surrogate copy(String order_id, String underlying_symbol, float limit_price, int quantity, String order_state) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            return new Surrogate(order_id, underlying_symbol, limit_price, quantity, order_state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.underlying_symbol, surrogate.underlying_symbol) && Float.compare(this.limit_price, surrogate.limit_price) == 0 && this.quantity == surrogate.quantity && Intrinsics.areEqual(this.order_state, surrogate.order_state);
        }

        public int hashCode() {
            return (((((((this.order_id.hashCode() * 31) + this.underlying_symbol.hashCode()) * 31) + Float.hashCode(this.limit_price)) * 31) + Integer.hashCode(this.quantity)) * 31) + this.order_state.hashCode();
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", underlying_symbol=" + this.underlying_symbol + ", limit_price=" + this.limit_price + ", quantity=" + this.quantity + ", order_state=" + this.order_state + ")";
        }

        /* compiled from: ComboOrderDetailContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ComboOrderDetailContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, float f, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = "";
            } else {
                this.order_id = str;
            }
            if ((i & 2) == 0) {
                this.underlying_symbol = "";
            } else {
                this.underlying_symbol = str2;
            }
            if ((i & 4) == 0) {
                this.limit_price = 0.0f;
            } else {
                this.limit_price = f;
            }
            if ((i & 8) == 0) {
                this.quantity = 0;
            } else {
                this.quantity = i2;
            }
            if ((i & 16) == 0) {
                this.order_state = "";
            } else {
                this.order_state = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.order_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.order_id);
            }
            if (!Intrinsics.areEqual(self.underlying_symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.underlying_symbol);
            }
            if (Float.compare(self.limit_price, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.limit_price));
            }
            int i = self.quantity;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (Intrinsics.areEqual(self.order_state, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.order_state);
        }

        public Surrogate(String order_id, String underlying_symbol, float f, int i, String order_state) {
            Intrinsics.checkNotNullParameter(order_id, "order_id");
            Intrinsics.checkNotNullParameter(underlying_symbol, "underlying_symbol");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            this.order_id = order_id;
            this.underlying_symbol = underlying_symbol;
            this.limit_price = f;
            this.quantity = i;
            this.order_state = order_state;
        }

        public /* synthetic */ Surrogate(String str, String str2, float f, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str3);
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final String getUnderlying_symbol() {
            return this.underlying_symbol;
        }

        public final float getLimit_price() {
            return this.limit_price;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final String getOrder_state() {
            return this.order_state;
        }
    }

    /* compiled from: ComboOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto;", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ComboOrderDetailContextDto, ComboOrderDetailContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ComboOrderDetailContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ComboOrderDetailContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ComboOrderDetailContextDto> getBinaryBase64Serializer() {
            return (KSerializer) ComboOrderDetailContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ComboOrderDetailContext> getProtoAdapter() {
            return ComboOrderDetailContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ComboOrderDetailContextDto getZeroValue() {
            return ComboOrderDetailContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ComboOrderDetailContextDto fromProto(ComboOrderDetailContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ComboOrderDetailContextDto(new Surrogate(proto.getOrder_id(), proto.getUnderlying_symbol(), proto.getLimit_price(), proto.getQuantity(), proto.getOrder_state()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ComboOrderDetailContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ComboOrderDetailContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ComboOrderDetailContextDto(null, null, 0.0f, 0, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ComboOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ComboOrderDetailContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ComboOrderDetailContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ComboOrderDetailContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ComboOrderDetailContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ComboOrderDetailContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ComboOrderDetailContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ComboOrderDetailContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ComboOrderDetailContextDto";
        }
    }
}
