package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;

/* compiled from: OrderSendLogDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000489:;B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0006\u0010\u0018Jz\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u00020\u0013H\u0016J\u0018\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0013H\u0016J\b\u00107\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLogDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OrderSendLog;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Surrogate;)V", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", InquiryField.DateField.TYPE, "Lcom/robinhood/rosetta/mainst/TimeDto;", "sent_at", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "confirmed_at", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "count", "", "quantity", "session_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "cl_ord_id", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getDate", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getSent_at", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getConfirmed_at", "getRoute", "()Lrosetta/mainst/RouteDto;", "getCount", "()I", "getQuantity", "getSession_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getCl_ord_id", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class OrderSendLogDto implements Dto3<OrderSendLog>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderSendLogDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderSendLogDto, OrderSendLog>> binaryBase64Serializer$delegate;
    private static final OrderSendLogDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderSendLogDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderSendLogDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final TimeDto getDate() {
        return this.surrogate.getDate();
    }

    public final TimeDto getSent_at() {
        return this.surrogate.getSent_at();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final TimeDto getConfirmed_at() {
        return this.surrogate.getConfirmed_at();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final int getCount() {
        return this.surrogate.getCount();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final NullableStringDto getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final NullableStringDto getCl_ord_id() {
        return this.surrogate.getCl_ord_id();
    }

    public /* synthetic */ OrderSendLogDto(UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto routeDto, int i, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? null : timeDto, (i2 & 4) != 0 ? null : timeDto2, (i2 & 8) != 0 ? null : decimalDto, (i2 & 16) != 0 ? null : timeDto3, (i2 & 32) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : decimalDto2, (i2 & 256) != 0 ? null : nullableStringDto, (i2 & 512) != 0 ? null : nullableStringDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderSendLogDto(UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto route, int i, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2) {
        this(new Surrogate(uUIDDto, timeDto, timeDto2, decimalDto, timeDto3, route, i, decimalDto2, nullableStringDto, nullableStringDto2));
        Intrinsics.checkNotNullParameter(route, "route");
    }

    public static /* synthetic */ OrderSendLogDto copy$default(OrderSendLogDto orderSendLogDto, UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto routeDto, int i, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uUIDDto = orderSendLogDto.surrogate.getOrder_id();
        }
        if ((i2 & 2) != 0) {
            timeDto = orderSendLogDto.surrogate.getDate();
        }
        if ((i2 & 4) != 0) {
            timeDto2 = orderSendLogDto.surrogate.getSent_at();
        }
        if ((i2 & 8) != 0) {
            decimalDto = orderSendLogDto.surrogate.getPrice();
        }
        if ((i2 & 16) != 0) {
            timeDto3 = orderSendLogDto.surrogate.getConfirmed_at();
        }
        if ((i2 & 32) != 0) {
            routeDto = orderSendLogDto.surrogate.getRoute();
        }
        if ((i2 & 64) != 0) {
            i = orderSendLogDto.surrogate.getCount();
        }
        if ((i2 & 128) != 0) {
            decimalDto2 = orderSendLogDto.surrogate.getQuantity();
        }
        if ((i2 & 256) != 0) {
            nullableStringDto = orderSendLogDto.surrogate.getSession_id();
        }
        if ((i2 & 512) != 0) {
            nullableStringDto2 = orderSendLogDto.surrogate.getCl_ord_id();
        }
        NullableStringDto nullableStringDto3 = nullableStringDto;
        NullableStringDto nullableStringDto4 = nullableStringDto2;
        int i3 = i;
        DecimalDto decimalDto3 = decimalDto2;
        TimeDto timeDto4 = timeDto3;
        RouteDto routeDto2 = routeDto;
        return orderSendLogDto.copy(uUIDDto, timeDto, timeDto2, decimalDto, timeDto4, routeDto2, i3, decimalDto3, nullableStringDto3, nullableStringDto4);
    }

    public final OrderSendLogDto copy(UUIDDto order_id, TimeDto date, TimeDto sent_at, DecimalDto price, TimeDto confirmed_at, RouteDto route, int count, DecimalDto quantity, NullableStringDto session_id, NullableStringDto cl_ord_id) {
        Intrinsics.checkNotNullParameter(route, "route");
        return new OrderSendLogDto(new Surrogate(order_id, date, sent_at, price, confirmed_at, route, count, quantity, session_id, cl_ord_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderSendLog toProto() {
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto = order_id != null ? order_id.toProto() : null;
        TimeDto date = this.surrogate.getDate();
        Time proto2 = date != null ? date.toProto() : null;
        TimeDto sent_at = this.surrogate.getSent_at();
        Time proto3 = sent_at != null ? sent_at.toProto() : null;
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto4 = price != null ? price.toProto() : null;
        TimeDto confirmed_at = this.surrogate.getConfirmed_at();
        Time proto5 = confirmed_at != null ? confirmed_at.toProto() : null;
        Route route = (Route) this.surrogate.getRoute().toProto();
        int count = this.surrogate.getCount();
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto6 = quantity != null ? quantity.toProto() : null;
        NullableStringDto session_id = this.surrogate.getSession_id();
        NullableString proto7 = session_id != null ? session_id.toProto() : null;
        NullableStringDto cl_ord_id = this.surrogate.getCl_ord_id();
        return new OrderSendLog(proto, proto2, proto3, proto4, proto5, route, count, proto6, proto7, cl_ord_id != null ? cl_ord_id.toProto() : null, null, 1024, null);
    }

    public String toString() {
        return "[OrderSendLogDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderSendLogDto) && Intrinsics.areEqual(((OrderSendLogDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderSendLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002OPB\u008a\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B}\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001aJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u0018\u0010<\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u008c\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0017\b\u0002\u0010\f\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\rHÖ\u0001J\t\u0010E\u001a\u00020FHÖ\u0001J%\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010!R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010!R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010+R+\u0010\f\u001a\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010&R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001c\u001a\u0004\b2\u00103R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001c\u001a\u0004\b5\u00103¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Surrogate;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", InquiryField.DateField.TYPE, "Lcom/robinhood/rosetta/mainst/TimeDto;", "sent_at", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "confirmed_at", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "quantity", "session_id", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "cl_ord_id", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/RouteDto;ILcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOrder_id$annotations", "()V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getDate$annotations", "getDate", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getSent_at$annotations", "getSent_at", "getPrice$annotations", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getConfirmed_at$annotations", "getConfirmed_at", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getCount$annotations", "getCount", "()I", "getQuantity$annotations", "getQuantity", "getSession_id$annotations", "getSession_id", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getCl_ord_id$annotations", "getCl_ord_id", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final NullableStringDto cl_ord_id;
        private final TimeDto confirmed_at;
        private final int count;
        private final TimeDto date;
        private final UUIDDto order_id;
        private final DecimalDto price;
        private final DecimalDto quantity;
        private final RouteDto route;
        private final TimeDto sent_at;
        private final NullableStringDto session_id;

        public Surrogate() {
            this((UUIDDto) null, (TimeDto) null, (TimeDto) null, (DecimalDto) null, (TimeDto) null, (RouteDto) null, 0, (DecimalDto) null, (NullableStringDto) null, (NullableStringDto) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto routeDto, int i, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uUIDDto = surrogate.order_id;
            }
            if ((i2 & 2) != 0) {
                timeDto = surrogate.date;
            }
            if ((i2 & 4) != 0) {
                timeDto2 = surrogate.sent_at;
            }
            if ((i2 & 8) != 0) {
                decimalDto = surrogate.price;
            }
            if ((i2 & 16) != 0) {
                timeDto3 = surrogate.confirmed_at;
            }
            if ((i2 & 32) != 0) {
                routeDto = surrogate.route;
            }
            if ((i2 & 64) != 0) {
                i = surrogate.count;
            }
            if ((i2 & 128) != 0) {
                decimalDto2 = surrogate.quantity;
            }
            if ((i2 & 256) != 0) {
                nullableStringDto = surrogate.session_id;
            }
            if ((i2 & 512) != 0) {
                nullableStringDto2 = surrogate.cl_ord_id;
            }
            NullableStringDto nullableStringDto3 = nullableStringDto;
            NullableStringDto nullableStringDto4 = nullableStringDto2;
            int i3 = i;
            DecimalDto decimalDto3 = decimalDto2;
            TimeDto timeDto4 = timeDto3;
            RouteDto routeDto2 = routeDto;
            return surrogate.copy(uUIDDto, timeDto, timeDto2, decimalDto, timeDto4, routeDto2, i3, decimalDto3, nullableStringDto3, nullableStringDto4);
        }

        @SerialName("clOrdId")
        @JsonAnnotations2(names = {"cl_ord_id"})
        public static /* synthetic */ void getCl_ord_id$annotations() {
        }

        @SerialName("confirmedAt")
        @JsonAnnotations2(names = {"confirmed_at"})
        public static /* synthetic */ void getConfirmed_at$annotations() {
        }

        @SerialName("count")
        @JsonAnnotations2(names = {"count"})
        public static /* synthetic */ void getCount$annotations() {
        }

        @SerialName(InquiryField.DateField.TYPE)
        @JsonAnnotations2(names = {InquiryField.DateField.TYPE})
        public static /* synthetic */ void getDate$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        @SerialName("sentAt")
        @JsonAnnotations2(names = {"sent_at"})
        public static /* synthetic */ void getSent_at$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component10, reason: from getter */
        public final NullableStringDto getCl_ord_id() {
            return this.cl_ord_id;
        }

        /* renamed from: component2, reason: from getter */
        public final TimeDto getDate() {
            return this.date;
        }

        /* renamed from: component3, reason: from getter */
        public final TimeDto getSent_at() {
            return this.sent_at;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getConfirmed_at() {
            return this.confirmed_at;
        }

        /* renamed from: component6, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component7, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component8, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component9, reason: from getter */
        public final NullableStringDto getSession_id() {
            return this.session_id;
        }

        public final Surrogate copy(UUIDDto order_id, TimeDto date, TimeDto sent_at, DecimalDto price, TimeDto confirmed_at, RouteDto route, int count, DecimalDto quantity, NullableStringDto session_id, NullableStringDto cl_ord_id) {
            Intrinsics.checkNotNullParameter(route, "route");
            return new Surrogate(order_id, date, sent_at, price, confirmed_at, route, count, quantity, session_id, cl_ord_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_id, surrogate.order_id) && Intrinsics.areEqual(this.date, surrogate.date) && Intrinsics.areEqual(this.sent_at, surrogate.sent_at) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.confirmed_at, surrogate.confirmed_at) && this.route == surrogate.route && this.count == surrogate.count && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.session_id, surrogate.session_id) && Intrinsics.areEqual(this.cl_ord_id, surrogate.cl_ord_id);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.order_id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            TimeDto timeDto = this.date;
            int iHashCode2 = (iHashCode + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.sent_at;
            int iHashCode3 = (iHashCode2 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31;
            DecimalDto decimalDto = this.price;
            int iHashCode4 = (iHashCode3 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            TimeDto timeDto3 = this.confirmed_at;
            int iHashCode5 = (((((iHashCode4 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31) + this.route.hashCode()) * 31) + Integer.hashCode(this.count)) * 31;
            DecimalDto decimalDto2 = this.quantity;
            int iHashCode6 = (iHashCode5 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            NullableStringDto nullableStringDto = this.session_id;
            int iHashCode7 = (iHashCode6 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31;
            NullableStringDto nullableStringDto2 = this.cl_ord_id;
            return iHashCode7 + (nullableStringDto2 != null ? nullableStringDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(order_id=" + this.order_id + ", date=" + this.date + ", sent_at=" + this.sent_at + ", price=" + this.price + ", confirmed_at=" + this.confirmed_at + ", route=" + this.route + ", count=" + this.count + ", quantity=" + this.quantity + ", session_id=" + this.session_id + ", cl_ord_id=" + this.cl_ord_id + ")";
        }

        /* compiled from: OrderSendLogDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderSendLogDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto routeDto, int i2, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.date = null;
            } else {
                this.date = timeDto;
            }
            if ((i & 4) == 0) {
                this.sent_at = null;
            } else {
                this.sent_at = timeDto2;
            }
            if ((i & 8) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto;
            }
            if ((i & 16) == 0) {
                this.confirmed_at = null;
            } else {
                this.confirmed_at = timeDto3;
            }
            if ((i & 32) == 0) {
                this.route = RouteDto.INSTANCE.getZeroValue();
            } else {
                this.route = routeDto;
            }
            if ((i & 64) == 0) {
                this.count = 0;
            } else {
                this.count = i2;
            }
            if ((i & 128) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto2;
            }
            if ((i & 256) == 0) {
                this.session_id = null;
            } else {
                this.session_id = nullableStringDto;
            }
            if ((i & 512) == 0) {
                this.cl_ord_id = null;
            } else {
                this.cl_ord_id = nullableStringDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UUIDDto uUIDDto = self.order_id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            TimeDto timeDto = self.date;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.sent_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            DecimalDto decimalDto = self.price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            TimeDto timeDto3 = self.confirmed_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, RouteDto.Serializer.INSTANCE, self.route);
            }
            int i = self.count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            DecimalDto decimalDto2 = self.quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            NullableStringDto nullableStringDto = self.session_id;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            NullableStringDto nullableStringDto2 = self.cl_ord_id;
            if (nullableStringDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, NullableStringDto.Serializer.INSTANCE, nullableStringDto2);
            }
        }

        public Surrogate(UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto route, int i, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.order_id = uUIDDto;
            this.date = timeDto;
            this.sent_at = timeDto2;
            this.price = decimalDto;
            this.confirmed_at = timeDto3;
            this.route = route;
            this.count = i;
            this.quantity = decimalDto2;
            this.session_id = nullableStringDto;
            this.cl_ord_id = nullableStringDto2;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final TimeDto getDate() {
            return this.date;
        }

        public final TimeDto getSent_at() {
            return this.sent_at;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final TimeDto getConfirmed_at() {
            return this.confirmed_at;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public /* synthetic */ Surrogate(UUIDDto uUIDDto, TimeDto timeDto, TimeDto timeDto2, DecimalDto decimalDto, TimeDto timeDto3, RouteDto routeDto, int i, DecimalDto decimalDto2, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : uUIDDto, (i2 & 2) != 0 ? null : timeDto, (i2 & 4) != 0 ? null : timeDto2, (i2 & 8) != 0 ? null : decimalDto, (i2 & 16) != 0 ? null : timeDto3, (i2 & 32) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : decimalDto2, (i2 & 256) != 0 ? null : nullableStringDto, (i2 & 512) != 0 ? null : nullableStringDto2);
        }

        public final int getCount() {
            return this.count;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final NullableStringDto getSession_id() {
            return this.session_id;
        }

        public final NullableStringDto getCl_ord_id() {
            return this.cl_ord_id;
        }
    }

    /* compiled from: OrderSendLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto;", "Lcom/robinhood/rosetta/mainst/OrderSendLog;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderSendLogDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderSendLogDto, OrderSendLog> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderSendLogDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderSendLogDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderSendLogDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderSendLogDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderSendLog> getProtoAdapter() {
            return OrderSendLog.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderSendLogDto getZeroValue() {
            return OrderSendLogDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderSendLogDto fromProto(OrderSendLog proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID order_id = proto.getOrder_id();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UUIDDto uUIDDtoFromProto = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            Time date = proto.getDate();
            TimeDto timeDtoFromProto = date != null ? TimeDto.INSTANCE.fromProto(date) : null;
            Time sent_at = proto.getSent_at();
            TimeDto timeDtoFromProto2 = sent_at != null ? TimeDto.INSTANCE.fromProto(sent_at) : null;
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Time confirmed_at = proto.getConfirmed_at();
            TimeDto timeDtoFromProto3 = confirmed_at != null ? TimeDto.INSTANCE.fromProto(confirmed_at) : null;
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            int count = proto.getCount();
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto2 = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            NullableString session_id = proto.getSession_id();
            NullableStringDto nullableStringDtoFromProto = session_id != null ? NullableStringDto.INSTANCE.fromProto(session_id) : null;
            NullableString cl_ord_id = proto.getCl_ord_id();
            return new OrderSendLogDto(new Surrogate(uUIDDtoFromProto, timeDtoFromProto, timeDtoFromProto2, decimalDtoFromProto, timeDtoFromProto3, routeDtoFromProto, count, decimalDtoFromProto2, nullableStringDtoFromProto, cl_ord_id != null ? NullableStringDto.INSTANCE.fromProto(cl_ord_id) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderSendLogDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderSendLogDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OrderSendLogDto(null, null, null, null, null, null, 0, null, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderSendLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderSendLogDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OrderSendLog", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderSendLogDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderSendLogDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderSendLogDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderSendLogDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderSendLogDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderSendLogDto";
        }
    }
}
