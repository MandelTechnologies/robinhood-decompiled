package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.CatpayOrderContext;
import com.robinhood.rosetta.eventlogging.CatpayOrderContextDto;
import com.robinhood.rosetta.eventlogging.CatpayOrderEventDataDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: CatpayOrderContextDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005!\"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Surrogate;)V", "order_event_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "amount_input_chips", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;)V", "getOrder_event_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "getAmount_input_chips", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CatpayAmountInputChipsDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CatpayOrderContextDto implements Dto3<CatpayOrderContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CatpayOrderContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CatpayOrderContextDto, CatpayOrderContext>> binaryBase64Serializer$delegate;
    private static final CatpayOrderContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CatpayOrderContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CatpayOrderContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CatpayOrderEventDataDto getOrder_event_data() {
        return this.surrogate.getOrder_event_data();
    }

    public final CatpayAmountInputChipsDto getAmount_input_chips() {
        return this.surrogate.getAmount_input_chips();
    }

    public CatpayOrderContextDto(CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto) {
        this(new Surrogate(catpayOrderEventDataDto, catpayAmountInputChipsDto));
    }

    public /* synthetic */ CatpayOrderContextDto(CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catpayOrderEventDataDto, (i & 2) != 0 ? null : catpayAmountInputChipsDto);
    }

    public static /* synthetic */ CatpayOrderContextDto copy$default(CatpayOrderContextDto catpayOrderContextDto, CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            catpayOrderEventDataDto = catpayOrderContextDto.surrogate.getOrder_event_data();
        }
        if ((i & 2) != 0) {
            catpayAmountInputChipsDto = catpayOrderContextDto.surrogate.getAmount_input_chips();
        }
        return catpayOrderContextDto.copy(catpayOrderEventDataDto, catpayAmountInputChipsDto);
    }

    public final CatpayOrderContextDto copy(CatpayOrderEventDataDto order_event_data, CatpayAmountInputChipsDto amount_input_chips) {
        return new CatpayOrderContextDto(new Surrogate(order_event_data, amount_input_chips));
    }

    @Override // com.robinhood.idl.Dto
    public CatpayOrderContext toProto() {
        CatpayOrderEventDataDto order_event_data = this.surrogate.getOrder_event_data();
        CatpayOrderEventData proto = order_event_data != null ? order_event_data.toProto() : null;
        CatpayAmountInputChipsDto amount_input_chips = this.surrogate.getAmount_input_chips();
        return new CatpayOrderContext(proto, amount_input_chips != null ? amount_input_chips.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[CatpayOrderContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CatpayOrderContextDto) && Intrinsics.areEqual(((CatpayOrderContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CatpayOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Surrogate;", "", "order_event_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "amount_input_chips", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_event_data$annotations", "()V", "getOrder_event_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventDataDto;", "getAmount_input_chips$annotations", "getAmount_input_chips", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CatpayAmountInputChipsDto amount_input_chips;
        private final CatpayOrderEventDataDto order_event_data;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((CatpayOrderEventDataDto) null, (CatpayAmountInputChipsDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                catpayOrderEventDataDto = surrogate.order_event_data;
            }
            if ((i & 2) != 0) {
                catpayAmountInputChipsDto = surrogate.amount_input_chips;
            }
            return surrogate.copy(catpayOrderEventDataDto, catpayAmountInputChipsDto);
        }

        @SerialName("amountInputChips")
        @JsonAnnotations2(names = {"amount_input_chips"})
        public static /* synthetic */ void getAmount_input_chips$annotations() {
        }

        @SerialName("orderEventData")
        @JsonAnnotations2(names = {"order_event_data"})
        public static /* synthetic */ void getOrder_event_data$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CatpayOrderEventDataDto getOrder_event_data() {
            return this.order_event_data;
        }

        /* renamed from: component2, reason: from getter */
        public final CatpayAmountInputChipsDto getAmount_input_chips() {
            return this.amount_input_chips;
        }

        public final Surrogate copy(CatpayOrderEventDataDto order_event_data, CatpayAmountInputChipsDto amount_input_chips) {
            return new Surrogate(order_event_data, amount_input_chips);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_event_data, surrogate.order_event_data) && Intrinsics.areEqual(this.amount_input_chips, surrogate.amount_input_chips);
        }

        public int hashCode() {
            CatpayOrderEventDataDto catpayOrderEventDataDto = this.order_event_data;
            int iHashCode = (catpayOrderEventDataDto == null ? 0 : catpayOrderEventDataDto.hashCode()) * 31;
            CatpayAmountInputChipsDto catpayAmountInputChipsDto = this.amount_input_chips;
            return iHashCode + (catpayAmountInputChipsDto != null ? catpayAmountInputChipsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_event_data=" + this.order_event_data + ", amount_input_chips=" + this.amount_input_chips + ")";
        }

        /* compiled from: CatpayOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CatpayOrderContextDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_event_data = null;
            } else {
                this.order_event_data = catpayOrderEventDataDto;
            }
            if ((i & 2) == 0) {
                this.amount_input_chips = null;
            } else {
                this.amount_input_chips = catpayAmountInputChipsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CatpayOrderEventDataDto catpayOrderEventDataDto = self.order_event_data;
            if (catpayOrderEventDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CatpayOrderEventDataDto.Serializer.INSTANCE, catpayOrderEventDataDto);
            }
            CatpayAmountInputChipsDto catpayAmountInputChipsDto = self.amount_input_chips;
            if (catpayAmountInputChipsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CatpayAmountInputChipsDto.Serializer.INSTANCE, catpayAmountInputChipsDto);
            }
        }

        public Surrogate(CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto) {
            this.order_event_data = catpayOrderEventDataDto;
            this.amount_input_chips = catpayAmountInputChipsDto;
        }

        public /* synthetic */ Surrogate(CatpayOrderEventDataDto catpayOrderEventDataDto, CatpayAmountInputChipsDto catpayAmountInputChipsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : catpayOrderEventDataDto, (i & 2) != 0 ? null : catpayAmountInputChipsDto);
        }

        public final CatpayOrderEventDataDto getOrder_event_data() {
            return this.order_event_data;
        }

        public final CatpayAmountInputChipsDto getAmount_input_chips() {
            return this.amount_input_chips;
        }
    }

    /* compiled from: CatpayOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CatpayOrderContextDto, CatpayOrderContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CatpayOrderContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CatpayOrderContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CatpayOrderContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CatpayOrderContext> getProtoAdapter() {
            return CatpayOrderContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderContextDto getZeroValue() {
            return CatpayOrderContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CatpayOrderContextDto fromProto(CatpayOrderContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CatpayOrderEventData order_event_data = proto.getOrder_event_data();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CatpayOrderEventDataDto catpayOrderEventDataDtoFromProto = order_event_data != null ? CatpayOrderEventDataDto.INSTANCE.fromProto(order_event_data) : null;
            CatpayOrderContext.CatpayAmountInputChips amount_input_chips = proto.getAmount_input_chips();
            return new CatpayOrderContextDto(new Surrogate(catpayOrderEventDataDtoFromProto, amount_input_chips != null ? CatpayAmountInputChipsDto.INSTANCE.fromProto(amount_input_chips) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatpayOrderContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CatpayOrderContextDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CatpayOrderContextDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ \u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext$CatpayAmountInputChips;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate;)V", "suggested_amounts", "", "", "selected_amount", "(Ljava/util/List;Ljava/lang/String;)V", "getSuggested_amounts", "()Ljava/util/List;", "getSelected_amount", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayAmountInputChipsDto implements Dto3<CatpayOrderContext.CatpayAmountInputChips>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CatpayAmountInputChipsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CatpayAmountInputChipsDto, CatpayOrderContext.CatpayAmountInputChips>> binaryBase64Serializer$delegate;
        private static final CatpayAmountInputChipsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CatpayAmountInputChipsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CatpayAmountInputChipsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final java.util.List<String> getSuggested_amounts() {
            return this.surrogate.getSuggested_amounts();
        }

        public final String getSelected_amount() {
            return this.surrogate.getSelected_amount();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CatpayAmountInputChipsDto(java.util.List<String> suggested_amounts, String selected_amount) {
            this(new Surrogate(suggested_amounts, selected_amount));
            Intrinsics.checkNotNullParameter(suggested_amounts, "suggested_amounts");
            Intrinsics.checkNotNullParameter(selected_amount, "selected_amount");
        }

        public /* synthetic */ CatpayAmountInputChipsDto(java.util.List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((java.util.List<String>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list), (i & 2) != 0 ? "" : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CatpayAmountInputChipsDto copy$default(CatpayAmountInputChipsDto catpayAmountInputChipsDto, java.util.List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = catpayAmountInputChipsDto.surrogate.getSuggested_amounts();
            }
            if ((i & 2) != 0) {
                str = catpayAmountInputChipsDto.surrogate.getSelected_amount();
            }
            return catpayAmountInputChipsDto.copy(list, str);
        }

        public final CatpayAmountInputChipsDto copy(java.util.List<String> suggested_amounts, String selected_amount) {
            Intrinsics.checkNotNullParameter(suggested_amounts, "suggested_amounts");
            Intrinsics.checkNotNullParameter(selected_amount, "selected_amount");
            return new CatpayAmountInputChipsDto(new Surrogate(suggested_amounts, selected_amount));
        }

        @Override // com.robinhood.idl.Dto
        public CatpayOrderContext.CatpayAmountInputChips toProto() {
            java.util.List<String> suggested_amounts = this.surrogate.getSuggested_amounts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(suggested_amounts, 10));
            Iterator<T> it = suggested_amounts.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new CatpayOrderContext.CatpayAmountInputChips(arrayList, this.surrogate.getSelected_amount(), null, 4, null);
        }

        public String toString() {
            return "[CatpayAmountInputChipsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CatpayAmountInputChipsDto) && Intrinsics.areEqual(((CatpayAmountInputChipsDto) other).surrogate, this.surrogate);
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
        /* compiled from: CatpayOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J#\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate;", "", "suggested_amounts", "", "", "selected_amount", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSuggested_amounts$annotations", "()V", "getSuggested_amounts", "()Ljava/util/List;", "getSelected_amount$annotations", "getSelected_amount", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final String selected_amount;
            private final java.util.List<String> suggested_amounts;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayOrderContextDto.CatpayAmountInputChipsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null};

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((java.util.List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, java.util.List list, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = surrogate.suggested_amounts;
                }
                if ((i & 2) != 0) {
                    str = surrogate.selected_amount;
                }
                return surrogate.copy(list, str);
            }

            @SerialName("selectedAmount")
            @JsonAnnotations2(names = {"selected_amount"})
            public static /* synthetic */ void getSelected_amount$annotations() {
            }

            @SerialName("suggestedAmounts")
            @JsonAnnotations2(names = {"suggested_amounts"})
            public static /* synthetic */ void getSuggested_amounts$annotations() {
            }

            public final java.util.List<String> component1() {
                return this.suggested_amounts;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSelected_amount() {
                return this.selected_amount;
            }

            public final Surrogate copy(java.util.List<String> suggested_amounts, String selected_amount) {
                Intrinsics.checkNotNullParameter(suggested_amounts, "suggested_amounts");
                Intrinsics.checkNotNullParameter(selected_amount, "selected_amount");
                return new Surrogate(suggested_amounts, selected_amount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.suggested_amounts, surrogate.suggested_amounts) && Intrinsics.areEqual(this.selected_amount, surrogate.selected_amount);
            }

            public int hashCode() {
                return (this.suggested_amounts.hashCode() * 31) + this.selected_amount.hashCode();
            }

            public String toString() {
                return "Surrogate(suggested_amounts=" + this.suggested_amounts + ", selected_amount=" + this.selected_amount + ")";
            }

            /* compiled from: CatpayOrderContextDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CatpayOrderContextDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, java.util.List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
                this.suggested_amounts = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
                if ((i & 2) == 0) {
                    this.selected_amount = "";
                } else {
                    this.selected_amount = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.suggested_amounts, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.suggested_amounts);
                }
                if (Intrinsics.areEqual(self.selected_amount, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 1, self.selected_amount);
            }

            public Surrogate(java.util.List<String> suggested_amounts, String selected_amount) {
                Intrinsics.checkNotNullParameter(suggested_amounts, "suggested_amounts");
                Intrinsics.checkNotNullParameter(selected_amount, "selected_amount");
                this.suggested_amounts = suggested_amounts;
                this.selected_amount = selected_amount;
            }

            public final java.util.List<String> getSuggested_amounts() {
                return this.suggested_amounts;
            }

            public /* synthetic */ Surrogate(java.util.List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str);
            }

            public final String getSelected_amount() {
                return this.selected_amount;
            }
        }

        /* compiled from: CatpayOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext$CatpayAmountInputChips;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CatpayAmountInputChipsDto, CatpayOrderContext.CatpayAmountInputChips> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CatpayAmountInputChipsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayAmountInputChipsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CatpayAmountInputChipsDto> getBinaryBase64Serializer() {
                return (KSerializer) CatpayAmountInputChipsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CatpayOrderContext.CatpayAmountInputChips> getProtoAdapter() {
                return CatpayOrderContext.CatpayAmountInputChips.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayAmountInputChipsDto getZeroValue() {
                return CatpayAmountInputChipsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CatpayAmountInputChipsDto fromProto(CatpayOrderContext.CatpayAmountInputChips proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                java.util.List<String> suggested_amounts = proto.getSuggested_amounts();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(suggested_amounts, 10));
                Iterator<T> it = suggested_amounts.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return new CatpayAmountInputChipsDto(new Surrogate(arrayList, proto.getSelected_amount()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderContextDto$CatpayAmountInputChipsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CatpayOrderContextDto.CatpayAmountInputChipsDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new CatpayAmountInputChipsDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CatpayOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<CatpayAmountInputChipsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayOrderContext.CatpayAmountInputChips", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CatpayAmountInputChipsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CatpayAmountInputChipsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CatpayAmountInputChipsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: CatpayOrderContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$CatpayAmountInputChipsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.CatpayOrderContextDto$CatpayAmountInputChipsDto";
            }
        }
    }

    /* compiled from: CatpayOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CatpayOrderContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CatpayOrderContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CatpayOrderContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CatpayOrderContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CatpayOrderContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: CatpayOrderContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CatpayOrderContextDto";
        }
    }
}
