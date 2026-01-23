package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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

/* compiled from: ActiveFuturesContractScheduleDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedule;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Surrogate;)V", "futures_contract_id", "", "symbol", "start_date", "roll_time", "end_date", "product_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFutures_contract_id", "()Ljava/lang/String;", "getSymbol", "getStart_date", "getRoll_time", "getEnd_date", "getProduct_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes5.dex */
public final class ActiveFuturesContractScheduleDto implements Dto3<ActiveFuturesContractSchedule>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ActiveFuturesContractScheduleDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ActiveFuturesContractScheduleDto, ActiveFuturesContractSchedule>> binaryBase64Serializer$delegate;
    private static final ActiveFuturesContractScheduleDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ActiveFuturesContractScheduleDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ActiveFuturesContractScheduleDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFutures_contract_id() {
        return this.surrogate.getFutures_contract_id();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final String getStart_date() {
        return this.surrogate.getStart_date();
    }

    public final String getRoll_time() {
        return this.surrogate.getRoll_time();
    }

    public final String getEnd_date() {
        return this.surrogate.getEnd_date();
    }

    public final String getProduct_id() {
        return this.surrogate.getProduct_id();
    }

    public /* synthetic */ ActiveFuturesContractScheduleDto(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveFuturesContractScheduleDto(String futures_contract_id, String symbol, String start_date, String roll_time, String end_date, String product_id) {
        this(new Surrogate(futures_contract_id, symbol, start_date, roll_time, end_date, product_id));
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(roll_time, "roll_time");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
    }

    public static /* synthetic */ ActiveFuturesContractScheduleDto copy$default(ActiveFuturesContractScheduleDto activeFuturesContractScheduleDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeFuturesContractScheduleDto.surrogate.getFutures_contract_id();
        }
        if ((i & 2) != 0) {
            str2 = activeFuturesContractScheduleDto.surrogate.getSymbol();
        }
        if ((i & 4) != 0) {
            str3 = activeFuturesContractScheduleDto.surrogate.getStart_date();
        }
        if ((i & 8) != 0) {
            str4 = activeFuturesContractScheduleDto.surrogate.getRoll_time();
        }
        if ((i & 16) != 0) {
            str5 = activeFuturesContractScheduleDto.surrogate.getEnd_date();
        }
        if ((i & 32) != 0) {
            str6 = activeFuturesContractScheduleDto.surrogate.getProduct_id();
        }
        String str7 = str5;
        String str8 = str6;
        return activeFuturesContractScheduleDto.copy(str, str2, str3, str4, str7, str8);
    }

    public final ActiveFuturesContractScheduleDto copy(String futures_contract_id, String symbol, String start_date, String roll_time, String end_date, String product_id) {
        Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(start_date, "start_date");
        Intrinsics.checkNotNullParameter(roll_time, "roll_time");
        Intrinsics.checkNotNullParameter(end_date, "end_date");
        Intrinsics.checkNotNullParameter(product_id, "product_id");
        return new ActiveFuturesContractScheduleDto(new Surrogate(futures_contract_id, symbol, start_date, roll_time, end_date, product_id));
    }

    @Override // com.robinhood.idl.Dto
    public ActiveFuturesContractSchedule toProto() {
        return new ActiveFuturesContractSchedule(this.surrogate.getFutures_contract_id(), this.surrogate.getSymbol(), this.surrogate.getStart_date(), this.surrogate.getRoll_time(), this.surrogate.getEnd_date(), this.surrogate.getProduct_id(), null, 64, null);
    }

    public String toString() {
        return "[ActiveFuturesContractScheduleDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ActiveFuturesContractScheduleDto) && Intrinsics.areEqual(((ActiveFuturesContractScheduleDto) other).surrogate, this.surrogate);
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
    /* compiled from: ActiveFuturesContractScheduleDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u00064"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Surrogate;", "", "futures_contract_id", "", "symbol", "start_date", "roll_time", "end_date", "product_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFutures_contract_id$annotations", "()V", "getFutures_contract_id", "()Ljava/lang/String;", "getSymbol$annotations", "getSymbol", "getStart_date$annotations", "getStart_date", "getRoll_time$annotations", "getRoll_time", "getEnd_date$annotations", "getEnd_date", "getProduct_id$annotations", "getProduct_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String end_date;
        private final String futures_contract_id;
        private final String product_id;
        private final String roll_time;
        private final String start_date;
        private final String symbol;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.futures_contract_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.symbol;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.start_date;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.roll_time;
            }
            if ((i & 16) != 0) {
                str5 = surrogate.end_date;
            }
            if ((i & 32) != 0) {
                str6 = surrogate.product_id;
            }
            String str7 = str5;
            String str8 = str6;
            return surrogate.copy(str, str2, str3, str4, str7, str8);
        }

        @SerialName("endDate")
        @JsonAnnotations2(names = {"end_date"})
        public static /* synthetic */ void getEnd_date$annotations() {
        }

        @SerialName("futuresContractId")
        @JsonAnnotations2(names = {"futures_contract_id"})
        public static /* synthetic */ void getFutures_contract_id$annotations() {
        }

        @SerialName("productId")
        @JsonAnnotations2(names = {"product_id"})
        public static /* synthetic */ void getProduct_id$annotations() {
        }

        @SerialName("rollTime")
        @JsonAnnotations2(names = {"roll_time"})
        public static /* synthetic */ void getRoll_time$annotations() {
        }

        @SerialName("startDate")
        @JsonAnnotations2(names = {"start_date"})
        public static /* synthetic */ void getStart_date$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFutures_contract_id() {
            return this.futures_contract_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStart_date() {
            return this.start_date;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRoll_time() {
            return this.roll_time;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEnd_date() {
            return this.end_date;
        }

        /* renamed from: component6, reason: from getter */
        public final String getProduct_id() {
            return this.product_id;
        }

        public final Surrogate copy(String futures_contract_id, String symbol, String start_date, String roll_time, String end_date, String product_id) {
            Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(start_date, "start_date");
            Intrinsics.checkNotNullParameter(roll_time, "roll_time");
            Intrinsics.checkNotNullParameter(end_date, "end_date");
            Intrinsics.checkNotNullParameter(product_id, "product_id");
            return new Surrogate(futures_contract_id, symbol, start_date, roll_time, end_date, product_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.futures_contract_id, surrogate.futures_contract_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.roll_time, surrogate.roll_time) && Intrinsics.areEqual(this.end_date, surrogate.end_date) && Intrinsics.areEqual(this.product_id, surrogate.product_id);
        }

        public int hashCode() {
            return (((((((((this.futures_contract_id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.start_date.hashCode()) * 31) + this.roll_time.hashCode()) * 31) + this.end_date.hashCode()) * 31) + this.product_id.hashCode();
        }

        public String toString() {
            return "Surrogate(futures_contract_id=" + this.futures_contract_id + ", symbol=" + this.symbol + ", start_date=" + this.start_date + ", roll_time=" + this.roll_time + ", end_date=" + this.end_date + ", product_id=" + this.product_id + ")";
        }

        /* compiled from: ActiveFuturesContractScheduleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ActiveFuturesContractScheduleDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.futures_contract_id = "";
            } else {
                this.futures_contract_id = str;
            }
            if ((i & 2) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
            if ((i & 4) == 0) {
                this.start_date = "";
            } else {
                this.start_date = str3;
            }
            if ((i & 8) == 0) {
                this.roll_time = "";
            } else {
                this.roll_time = str4;
            }
            if ((i & 16) == 0) {
                this.end_date = "";
            } else {
                this.end_date = str5;
            }
            if ((i & 32) == 0) {
                this.product_id = "";
            } else {
                this.product_id = str6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.futures_contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.futures_contract_id);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 1, self.symbol);
            }
            if (!Intrinsics.areEqual(self.start_date, "")) {
                output.encodeStringElement(serialDesc, 2, self.start_date);
            }
            if (!Intrinsics.areEqual(self.roll_time, "")) {
                output.encodeStringElement(serialDesc, 3, self.roll_time);
            }
            if (!Intrinsics.areEqual(self.end_date, "")) {
                output.encodeStringElement(serialDesc, 4, self.end_date);
            }
            if (Intrinsics.areEqual(self.product_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.product_id);
        }

        public Surrogate(String futures_contract_id, String symbol, String start_date, String roll_time, String end_date, String product_id) {
            Intrinsics.checkNotNullParameter(futures_contract_id, "futures_contract_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(start_date, "start_date");
            Intrinsics.checkNotNullParameter(roll_time, "roll_time");
            Intrinsics.checkNotNullParameter(end_date, "end_date");
            Intrinsics.checkNotNullParameter(product_id, "product_id");
            this.futures_contract_id = futures_contract_id;
            this.symbol = symbol;
            this.start_date = start_date;
            this.roll_time = roll_time;
            this.end_date = end_date;
            this.product_id = product_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
        }

        public final String getFutures_contract_id() {
            return this.futures_contract_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final String getStart_date() {
            return this.start_date;
        }

        public final String getRoll_time() {
            return this.roll_time;
        }

        public final String getEnd_date() {
            return this.end_date;
        }

        public final String getProduct_id() {
            return this.product_id;
        }
    }

    /* compiled from: ActiveFuturesContractScheduleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractSchedule;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ActiveFuturesContractScheduleDto, ActiveFuturesContractSchedule> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ActiveFuturesContractScheduleDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActiveFuturesContractScheduleDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ActiveFuturesContractScheduleDto> getBinaryBase64Serializer() {
            return (KSerializer) ActiveFuturesContractScheduleDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ActiveFuturesContractSchedule> getProtoAdapter() {
            return ActiveFuturesContractSchedule.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActiveFuturesContractScheduleDto getZeroValue() {
            return ActiveFuturesContractScheduleDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ActiveFuturesContractScheduleDto fromProto(ActiveFuturesContractSchedule proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ActiveFuturesContractScheduleDto(new Surrogate(proto.getFutures_contract_id(), proto.getSymbol(), proto.getStart_date(), proto.getRoll_time(), proto.getEnd_date(), proto.getProduct_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.ActiveFuturesContractScheduleDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ActiveFuturesContractScheduleDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ActiveFuturesContractScheduleDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ActiveFuturesContractScheduleDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ActiveFuturesContractScheduleDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.ActiveFuturesContractSchedule", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ActiveFuturesContractScheduleDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ActiveFuturesContractScheduleDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ActiveFuturesContractScheduleDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ActiveFuturesContractScheduleDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ActiveFuturesContractScheduleDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.ActiveFuturesContractScheduleDto";
        }
    }
}
