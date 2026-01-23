package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
import com.robinhood.ceres.p284v1.GetOrdersRequestDto;
import com.robinhood.ceres.p284v1.OrderRejectReasonDto;
import com.robinhood.ceres.p284v1.ShardNumberDto;
import com.robinhood.ceres.p284v1.ShardRegionDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderStateDto;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;

/* compiled from: GetOrdersRequestDto.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004WXYZB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0087\u0002\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0004\b\u0006\u0010)J\u0089\u0002\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(¢\u0006\u0002\u0010JJ\b\u0010K\u001a\u00020\u0002H\u0016J\b\u0010L\u001a\u00020\tH\u0016J\u0013\u0010M\u001a\u00020\u001f2\b\u0010N\u001a\u0004\u0018\u00010OH\u0096\u0002J\b\u0010P\u001a\u00020\u0010H\u0016J\u0018\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0010H\u0016J\b\u0010V\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b.\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b2\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b3\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b8\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b9\u0010+R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b:\u0010+R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b;\u0010+R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b<\u0010+R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010?R\u0013\u0010 \u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0013\u0010$\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bD\u0010+R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006["}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/GetOrdersRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate;)V", "account_id", "", "order_state", "", "Lrosetta/mainst/OrderStateDto;", "contract_id", "cursor", "page_size", "", "account_number", "order_id", "order_type", "Lrosetta/mainst/OrderTypeDto;", "order_side", "Lrosetta/mainst/SideDto;", "start_date", "end_date", "comma_separated_order_state", "updated_at_start_time", "updated_at_end_time", "order_trigger", "Lrosetta/mainst/OrderTriggerDto;", "is_download_csv", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "reject_reason", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "rhs_account_number", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegionDto;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumberDto;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTriggerDto;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)V", "getAccount_id", "()Ljava/lang/String;", "getOrder_state", "()Ljava/util/List;", "getContract_id", "getCursor", "getPage_size", "()Ljava/lang/Integer;", "getAccount_number", "getOrder_id", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getOrder_side", "()Lrosetta/mainst/SideDto;", "getStart_date", "getEnd_date", "getComma_separated_order_state", "getUpdated_at_start_time", "getUpdated_at_end_time", "getOrder_trigger", "()Lrosetta/mainst/OrderTriggerDto;", "()Ljava/lang/Boolean;", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getReject_reason", "()Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "getRhs_account_number", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegionDto;", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumberDto;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTriggerDto;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class GetOrdersRequestDto implements Dto3<GetOrdersRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetOrdersRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetOrdersRequestDto, GetOrdersRequest>> binaryBase64Serializer$delegate;
    private static final GetOrdersRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetOrdersRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetOrdersRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_id() {
        return this.surrogate.getAccount_id();
    }

    public final List<OrderStateDto> getOrder_state() {
        return this.surrogate.getOrder_state();
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final String getCursor() {
        return this.surrogate.getCursor();
    }

    public final Integer getPage_size() {
        return this.surrogate.getPage_size();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderTypeDto getOrder_type() {
        return this.surrogate.getOrder_type();
    }

    public final SideDto getOrder_side() {
        return this.surrogate.getOrder_side();
    }

    public final String getStart_date() {
        return this.surrogate.getStart_date();
    }

    public final String getEnd_date() {
        return this.surrogate.getEnd_date();
    }

    public final String getComma_separated_order_state() {
        return this.surrogate.getComma_separated_order_state();
    }

    public final String getUpdated_at_start_time() {
        return this.surrogate.getUpdated_at_start_time();
    }

    public final String getUpdated_at_end_time() {
        return this.surrogate.getUpdated_at_end_time();
    }

    public final OrderTriggerDto getOrder_trigger() {
        return this.surrogate.getOrder_trigger();
    }

    public final Boolean is_download_csv() {
        return this.surrogate.is_download_csv();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final OrderRejectReasonDto getReject_reason() {
        return this.surrogate.getReject_reason();
    }

    public final String getRhs_account_number() {
        return this.surrogate.getRhs_account_number();
    }

    public final ShardRegionDto getShard_region() {
        return this.surrogate.getShard_region();
    }

    public final ShardNumberDto getShard_number() {
        return this.surrogate.getShard_number();
    }

    public /* synthetic */ GetOrdersRequestDto(String str, List list, String str2, String str3, Integer num, String str4, String str5, OrderTypeDto orderTypeDto, SideDto sideDto, String str6, String str7, String str8, String str9, String str10, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str11, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : orderTypeDto, (i & 256) != 0 ? null : sideDto, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : orderTriggerDto, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : futuresContractTypeDto, (i & 131072) != 0 ? null : orderRejectReasonDto, (i & 262144) != 0 ? null : str11, (i & 524288) != 0 ? null : shardRegionDto, (i & 1048576) != 0 ? null : shardNumberDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetOrdersRequestDto(String account_id, List<? extends OrderStateDto> order_state, String str, String str2, Integer num, String str3, String str4, OrderTypeDto orderTypeDto, SideDto sideDto, String str5, String str6, String str7, String str8, String str9, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str10, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto) {
        this(new Surrogate(account_id, order_state, str, str2, num, str3, str4, orderTypeDto, sideDto, str5, str6, str7, str8, str9, orderTriggerDto, bool, futuresContractTypeDto, orderRejectReasonDto, str10, shardRegionDto, shardNumberDto));
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
    }

    public static /* synthetic */ GetOrdersRequestDto copy$default(GetOrdersRequestDto getOrdersRequestDto, String str, List list, String str2, String str3, Integer num, String str4, String str5, OrderTypeDto orderTypeDto, SideDto sideDto, String str6, String str7, String str8, String str9, String str10, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str11, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, Object obj) {
        ShardNumberDto shard_number;
        ShardRegionDto shardRegionDto2;
        String account_id = (i & 1) != 0 ? getOrdersRequestDto.surrogate.getAccount_id() : str;
        List order_state = (i & 2) != 0 ? getOrdersRequestDto.surrogate.getOrder_state() : list;
        String contract_id = (i & 4) != 0 ? getOrdersRequestDto.surrogate.getContract_id() : str2;
        String cursor = (i & 8) != 0 ? getOrdersRequestDto.surrogate.getCursor() : str3;
        Integer page_size = (i & 16) != 0 ? getOrdersRequestDto.surrogate.getPage_size() : num;
        String account_number = (i & 32) != 0 ? getOrdersRequestDto.surrogate.getAccount_number() : str4;
        String order_id = (i & 64) != 0 ? getOrdersRequestDto.surrogate.getOrder_id() : str5;
        OrderTypeDto order_type = (i & 128) != 0 ? getOrdersRequestDto.surrogate.getOrder_type() : orderTypeDto;
        SideDto order_side = (i & 256) != 0 ? getOrdersRequestDto.surrogate.getOrder_side() : sideDto;
        String start_date = (i & 512) != 0 ? getOrdersRequestDto.surrogate.getStart_date() : str6;
        String end_date = (i & 1024) != 0 ? getOrdersRequestDto.surrogate.getEnd_date() : str7;
        String comma_separated_order_state = (i & 2048) != 0 ? getOrdersRequestDto.surrogate.getComma_separated_order_state() : str8;
        String updated_at_start_time = (i & 4096) != 0 ? getOrdersRequestDto.surrogate.getUpdated_at_start_time() : str9;
        String updated_at_end_time = (i & 8192) != 0 ? getOrdersRequestDto.surrogate.getUpdated_at_end_time() : str10;
        String str12 = account_id;
        OrderTriggerDto order_trigger = (i & 16384) != 0 ? getOrdersRequestDto.surrogate.getOrder_trigger() : orderTriggerDto;
        Boolean boolIs_download_csv = (i & 32768) != 0 ? getOrdersRequestDto.surrogate.is_download_csv() : bool;
        FuturesContractTypeDto contract_type = (i & 65536) != 0 ? getOrdersRequestDto.surrogate.getContract_type() : futuresContractTypeDto;
        OrderRejectReasonDto reject_reason = (i & 131072) != 0 ? getOrdersRequestDto.surrogate.getReject_reason() : orderRejectReasonDto;
        String rhs_account_number = (i & 262144) != 0 ? getOrdersRequestDto.surrogate.getRhs_account_number() : str11;
        ShardRegionDto shard_region = (i & 524288) != 0 ? getOrdersRequestDto.surrogate.getShard_region() : shardRegionDto;
        if ((i & 1048576) != 0) {
            shardRegionDto2 = shard_region;
            shard_number = getOrdersRequestDto.surrogate.getShard_number();
        } else {
            shard_number = shardNumberDto;
            shardRegionDto2 = shard_region;
        }
        return getOrdersRequestDto.copy(str12, order_state, contract_id, cursor, page_size, account_number, order_id, order_type, order_side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, order_trigger, boolIs_download_csv, contract_type, reject_reason, rhs_account_number, shardRegionDto2, shard_number);
    }

    public final GetOrdersRequestDto copy(String account_id, List<? extends OrderStateDto> order_state, String contract_id, String cursor, Integer page_size, String account_number, String order_id, OrderTypeDto order_type, SideDto order_side, String start_date, String end_date, String comma_separated_order_state, String updated_at_start_time, String updated_at_end_time, OrderTriggerDto order_trigger, Boolean is_download_csv, FuturesContractTypeDto contract_type, OrderRejectReasonDto reject_reason, String rhs_account_number, ShardRegionDto shard_region, ShardNumberDto shard_number) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(order_state, "order_state");
        return new GetOrdersRequestDto(new Surrogate(account_id, order_state, contract_id, cursor, page_size, account_number, order_id, order_type, order_side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, order_trigger, is_download_csv, contract_type, reject_reason, rhs_account_number, shard_region, shard_number));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetOrdersRequest toProto() {
        String account_id = this.surrogate.getAccount_id();
        List<OrderStateDto> order_state = this.surrogate.getOrder_state();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_state, 10));
        Iterator<T> it = order_state.iterator();
        while (it.hasNext()) {
            arrayList.add((OrderState) ((OrderStateDto) it.next()).toProto());
        }
        String contract_id = this.surrogate.getContract_id();
        String cursor = this.surrogate.getCursor();
        Integer page_size = this.surrogate.getPage_size();
        String account_number = this.surrogate.getAccount_number();
        String order_id = this.surrogate.getOrder_id();
        OrderTypeDto order_type = this.surrogate.getOrder_type();
        OrderType orderType = order_type != null ? (OrderType) order_type.toProto() : null;
        SideDto order_side = this.surrogate.getOrder_side();
        Side side = order_side != null ? (Side) order_side.toProto() : null;
        String start_date = this.surrogate.getStart_date();
        String end_date = this.surrogate.getEnd_date();
        String comma_separated_order_state = this.surrogate.getComma_separated_order_state();
        String updated_at_start_time = this.surrogate.getUpdated_at_start_time();
        String updated_at_end_time = this.surrogate.getUpdated_at_end_time();
        OrderTriggerDto order_trigger = this.surrogate.getOrder_trigger();
        OrderTrigger orderTrigger = order_trigger != null ? (OrderTrigger) order_trigger.toProto() : null;
        Boolean boolIs_download_csv = this.surrogate.is_download_csv();
        FuturesContractTypeDto contract_type = this.surrogate.getContract_type();
        FuturesContractType futuresContractType = contract_type != null ? (FuturesContractType) contract_type.toProto() : null;
        OrderRejectReasonDto reject_reason = this.surrogate.getReject_reason();
        OrderRejectReason orderRejectReason = reject_reason != null ? (OrderRejectReason) reject_reason.toProto() : null;
        String rhs_account_number = this.surrogate.getRhs_account_number();
        ShardRegionDto shard_region = this.surrogate.getShard_region();
        ShardRegion shardRegion = shard_region != null ? (ShardRegion) shard_region.toProto() : null;
        ShardNumberDto shard_number = this.surrogate.getShard_number();
        return new GetOrdersRequest(account_id, arrayList, contract_id, cursor, page_size, account_number, order_id, orderType, side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, orderTrigger, boolIs_download_csv, futuresContractType, orderRejectReason, rhs_account_number, shardRegion, shard_number != null ? (ShardNumber) shard_number.toProto() : null, null, 2097152, null);
    }

    public String toString() {
        return "[GetOrdersRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetOrdersRequestDto) && Intrinsics.areEqual(((GetOrdersRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetOrdersRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bT\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0086\u0001\u0087\u0001B\u0094\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'Bó\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b&\u0010+J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010g\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0002\u00109J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0002\u0010SJ\u000b\u0010s\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010%HÆ\u0003J\u009b\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0019\b\u0002\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0002\u0010yJ\u0013\u0010z\u001a\u00020\u001c2\b\u0010{\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010|\u001a\u00020\nHÖ\u0001J\t\u0010}\u001a\u00020\u0003HÖ\u0001J+\u0010~\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0001¢\u0006\u0003\b\u0085\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010-\u001a\u0004\b1\u00102R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010-\u001a\u0004\b4\u0010/R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010-\u001a\u0004\b6\u0010/R/\u0010\t\u001a\u0013\u0018\u00010\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010:\u0012\u0004\b7\u0010-\u001a\u0004\b8\u00109R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010-\u001a\u0004\b<\u0010/R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010-\u001a\u0004\b>\u0010/R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010-\u001a\u0004\b@\u0010AR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010-\u001a\u0004\bC\u0010DR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010-\u001a\u0004\bF\u0010/R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010-\u001a\u0004\bH\u0010/R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010-\u001a\u0004\bJ\u0010/R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010-\u001a\u0004\bL\u0010/R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010-\u001a\u0004\bN\u0010/R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010-\u001a\u0004\bP\u0010QR \u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010T\u0012\u0004\bR\u0010-\u001a\u0004\b\u001b\u0010SR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010-\u001a\u0004\bV\u0010WR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bX\u0010-\u001a\u0004\bY\u0010ZR\u001e\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010-\u001a\u0004\b\\\u0010/R\u001e\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010-\u001a\u0004\b^\u0010_R\u001e\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u0010-\u001a\u0004\ba\u0010b¨\u0006\u0088\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate;", "", "account_id", "", "order_state", "", "Lrosetta/mainst/OrderStateDto;", "contract_id", "cursor", "page_size", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "account_number", "order_id", "order_type", "Lrosetta/mainst/OrderTypeDto;", "order_side", "Lrosetta/mainst/SideDto;", "start_date", "end_date", "comma_separated_order_state", "updated_at_start_time", "updated_at_end_time", "order_trigger", "Lrosetta/mainst/OrderTriggerDto;", "is_download_csv", "", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "reject_reason", "Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "rhs_account_number", "shard_region", "Lcom/robinhood/ceres/v1/ShardRegionDto;", "shard_number", "Lcom/robinhood/ceres/v1/ShardNumberDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTriggerDto;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTriggerDto;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount_id$annotations", "()V", "getAccount_id", "()Ljava/lang/String;", "getOrder_state$annotations", "getOrder_state", "()Ljava/util/List;", "getContract_id$annotations", "getContract_id", "getCursor$annotations", "getCursor", "getPage_size$annotations", "getPage_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAccount_number$annotations", "getAccount_number", "getOrder_id$annotations", "getOrder_id", "getOrder_type$annotations", "getOrder_type", "()Lrosetta/mainst/OrderTypeDto;", "getOrder_side$annotations", "getOrder_side", "()Lrosetta/mainst/SideDto;", "getStart_date$annotations", "getStart_date", "getEnd_date$annotations", "getEnd_date", "getComma_separated_order_state$annotations", "getComma_separated_order_state", "getUpdated_at_start_time$annotations", "getUpdated_at_start_time", "getUpdated_at_end_time$annotations", "getUpdated_at_end_time", "getOrder_trigger$annotations", "getOrder_trigger", "()Lrosetta/mainst/OrderTriggerDto;", "is_download_csv$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getReject_reason$annotations", "getReject_reason", "()Lcom/robinhood/ceres/v1/OrderRejectReasonDto;", "getRhs_account_number$annotations", "getRhs_account_number", "getShard_region$annotations", "getShard_region", "()Lcom/robinhood/ceres/v1/ShardRegionDto;", "getShard_number$annotations", "getShard_number", "()Lcom/robinhood/ceres/v1/ShardNumberDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTypeDto;Lrosetta/mainst/SideDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrosetta/mainst/OrderTriggerDto;Ljava/lang/Boolean;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;Lcom/robinhood/ceres/v1/OrderRejectReasonDto;Ljava/lang/String;Lcom/robinhood/ceres/v1/ShardRegionDto;Lcom/robinhood/ceres/v1/ShardNumberDto;)Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_id;
        private final String account_number;
        private final String comma_separated_order_state;
        private final String contract_id;
        private final FuturesContractTypeDto contract_type;
        private final String cursor;
        private final String end_date;
        private final Boolean is_download_csv;
        private final String order_id;
        private final SideDto order_side;
        private final List<OrderStateDto> order_state;
        private final OrderTriggerDto order_trigger;
        private final OrderTypeDto order_type;
        private final Integer page_size;
        private final OrderRejectReasonDto reject_reason;
        private final String rhs_account_number;
        private final ShardNumberDto shard_number;
        private final ShardRegionDto shard_region;
        private final String start_date;
        private final String updated_at_end_time;
        private final String updated_at_start_time;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.GetOrdersRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetOrdersRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((String) null, (List) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (OrderTypeDto) null, (SideDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (OrderTriggerDto) null, (Boolean) null, (FuturesContractTypeDto) null, (OrderRejectReasonDto) null, (String) null, (ShardRegionDto) null, (ShardNumberDto) null, 2097151, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderStateDto.Serializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, List list, String str2, String str3, Integer num, String str4, String str5, OrderTypeDto orderTypeDto, SideDto sideDto, String str6, String str7, String str8, String str9, String str10, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str11, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, Object obj) {
            ShardNumberDto shardNumberDto2;
            ShardRegionDto shardRegionDto2;
            String str12 = (i & 1) != 0 ? surrogate.account_id : str;
            List list2 = (i & 2) != 0 ? surrogate.order_state : list;
            String str13 = (i & 4) != 0 ? surrogate.contract_id : str2;
            String str14 = (i & 8) != 0 ? surrogate.cursor : str3;
            Integer num2 = (i & 16) != 0 ? surrogate.page_size : num;
            String str15 = (i & 32) != 0 ? surrogate.account_number : str4;
            String str16 = (i & 64) != 0 ? surrogate.order_id : str5;
            OrderTypeDto orderTypeDto2 = (i & 128) != 0 ? surrogate.order_type : orderTypeDto;
            SideDto sideDto2 = (i & 256) != 0 ? surrogate.order_side : sideDto;
            String str17 = (i & 512) != 0 ? surrogate.start_date : str6;
            String str18 = (i & 1024) != 0 ? surrogate.end_date : str7;
            String str19 = (i & 2048) != 0 ? surrogate.comma_separated_order_state : str8;
            String str20 = (i & 4096) != 0 ? surrogate.updated_at_start_time : str9;
            String str21 = (i & 8192) != 0 ? surrogate.updated_at_end_time : str10;
            String str22 = str12;
            OrderTriggerDto orderTriggerDto2 = (i & 16384) != 0 ? surrogate.order_trigger : orderTriggerDto;
            Boolean bool2 = (i & 32768) != 0 ? surrogate.is_download_csv : bool;
            FuturesContractTypeDto futuresContractTypeDto2 = (i & 65536) != 0 ? surrogate.contract_type : futuresContractTypeDto;
            OrderRejectReasonDto orderRejectReasonDto2 = (i & 131072) != 0 ? surrogate.reject_reason : orderRejectReasonDto;
            String str23 = (i & 262144) != 0 ? surrogate.rhs_account_number : str11;
            ShardRegionDto shardRegionDto3 = (i & 524288) != 0 ? surrogate.shard_region : shardRegionDto;
            if ((i & 1048576) != 0) {
                shardRegionDto2 = shardRegionDto3;
                shardNumberDto2 = surrogate.shard_number;
            } else {
                shardNumberDto2 = shardNumberDto;
                shardRegionDto2 = shardRegionDto3;
            }
            return surrogate.copy(str22, list2, str13, str14, num2, str15, str16, orderTypeDto2, sideDto2, str17, str18, str19, str20, str21, orderTriggerDto2, bool2, futuresContractTypeDto2, orderRejectReasonDto2, str23, shardRegionDto2, shardNumberDto2);
        }

        @SerialName("accountId")
        @JsonAnnotations2(names = {"account_id"})
        public static /* synthetic */ void getAccount_id$annotations() {
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("commaSeparatedOrderState")
        @JsonAnnotations2(names = {"comma_separated_order_state"})
        public static /* synthetic */ void getComma_separated_order_state$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("cursor")
        @JsonAnnotations2(names = {"cursor"})
        public static /* synthetic */ void getCursor$annotations() {
        }

        @SerialName("endDate")
        @JsonAnnotations2(names = {"end_date"})
        public static /* synthetic */ void getEnd_date$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("orderSide")
        @JsonAnnotations2(names = {"order_side"})
        public static /* synthetic */ void getOrder_side$annotations() {
        }

        @SerialName("orderState")
        @JsonAnnotations2(names = {"order_state"})
        public static /* synthetic */ void getOrder_state$annotations() {
        }

        @SerialName("orderTrigger")
        @JsonAnnotations2(names = {"order_trigger"})
        public static /* synthetic */ void getOrder_trigger$annotations() {
        }

        @SerialName("orderType")
        @JsonAnnotations2(names = {"order_type"})
        public static /* synthetic */ void getOrder_type$annotations() {
        }

        @SerialName("pageSize")
        @JsonAnnotations2(names = {"page_size"})
        public static /* synthetic */ void getPage_size$annotations() {
        }

        @SerialName("rejectReason")
        @JsonAnnotations2(names = {"reject_reason"})
        public static /* synthetic */ void getReject_reason$annotations() {
        }

        @SerialName("rhsAccountNumber")
        @JsonAnnotations2(names = {"rhs_account_number"})
        public static /* synthetic */ void getRhs_account_number$annotations() {
        }

        @SerialName("shardNumber")
        @JsonAnnotations2(names = {"shard_number"})
        public static /* synthetic */ void getShard_number$annotations() {
        }

        @SerialName("shardRegion")
        @JsonAnnotations2(names = {"shard_region"})
        public static /* synthetic */ void getShard_region$annotations() {
        }

        @SerialName("startDate")
        @JsonAnnotations2(names = {"start_date"})
        public static /* synthetic */ void getStart_date$annotations() {
        }

        @SerialName("updatedAtEndTime")
        @JsonAnnotations2(names = {"updated_at_end_time"})
        public static /* synthetic */ void getUpdated_at_end_time$annotations() {
        }

        @SerialName("updatedAtStartTime")
        @JsonAnnotations2(names = {"updated_at_start_time"})
        public static /* synthetic */ void getUpdated_at_start_time$annotations() {
        }

        @SerialName("isDownloadCsv")
        @JsonAnnotations2(names = {"is_download_csv"})
        public static /* synthetic */ void is_download_csv$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount_id() {
            return this.account_id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getStart_date() {
            return this.start_date;
        }

        /* renamed from: component11, reason: from getter */
        public final String getEnd_date() {
            return this.end_date;
        }

        /* renamed from: component12, reason: from getter */
        public final String getComma_separated_order_state() {
            return this.comma_separated_order_state;
        }

        /* renamed from: component13, reason: from getter */
        public final String getUpdated_at_start_time() {
            return this.updated_at_start_time;
        }

        /* renamed from: component14, reason: from getter */
        public final String getUpdated_at_end_time() {
            return this.updated_at_end_time;
        }

        /* renamed from: component15, reason: from getter */
        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        /* renamed from: component16, reason: from getter */
        public final Boolean getIs_download_csv() {
            return this.is_download_csv;
        }

        /* renamed from: component17, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component18, reason: from getter */
        public final OrderRejectReasonDto getReject_reason() {
            return this.reject_reason;
        }

        /* renamed from: component19, reason: from getter */
        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final List<OrderStateDto> component2() {
            return this.order_state;
        }

        /* renamed from: component20, reason: from getter */
        public final ShardRegionDto getShard_region() {
            return this.shard_region;
        }

        /* renamed from: component21, reason: from getter */
        public final ShardNumberDto getShard_number() {
            return this.shard_number;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCursor() {
            return this.cursor;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getPage_size() {
            return this.page_size;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component8, reason: from getter */
        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        /* renamed from: component9, reason: from getter */
        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final Surrogate copy(String account_id, List<? extends OrderStateDto> order_state, String contract_id, String cursor, Integer page_size, String account_number, String order_id, OrderTypeDto order_type, SideDto order_side, String start_date, String end_date, String comma_separated_order_state, String updated_at_start_time, String updated_at_end_time, OrderTriggerDto order_trigger, Boolean is_download_csv, FuturesContractTypeDto contract_type, OrderRejectReasonDto reject_reason, String rhs_account_number, ShardRegionDto shard_region, ShardNumberDto shard_number) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            return new Surrogate(account_id, order_state, contract_id, cursor, page_size, account_number, order_id, order_type, order_side, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, order_trigger, is_download_csv, contract_type, reject_reason, rhs_account_number, shard_region, shard_number);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.order_state, surrogate.order_state) && Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && Intrinsics.areEqual(this.cursor, surrogate.cursor) && Intrinsics.areEqual(this.page_size, surrogate.page_size) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.order_type == surrogate.order_type && this.order_side == surrogate.order_side && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.end_date, surrogate.end_date) && Intrinsics.areEqual(this.comma_separated_order_state, surrogate.comma_separated_order_state) && Intrinsics.areEqual(this.updated_at_start_time, surrogate.updated_at_start_time) && Intrinsics.areEqual(this.updated_at_end_time, surrogate.updated_at_end_time) && this.order_trigger == surrogate.order_trigger && Intrinsics.areEqual(this.is_download_csv, surrogate.is_download_csv) && this.contract_type == surrogate.contract_type && this.reject_reason == surrogate.reject_reason && Intrinsics.areEqual(this.rhs_account_number, surrogate.rhs_account_number) && this.shard_region == surrogate.shard_region && this.shard_number == surrogate.shard_number;
        }

        public int hashCode() {
            int iHashCode = ((this.account_id.hashCode() * 31) + this.order_state.hashCode()) * 31;
            String str = this.contract_id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cursor;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.page_size;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.account_number;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.order_id;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            OrderTypeDto orderTypeDto = this.order_type;
            int iHashCode7 = (iHashCode6 + (orderTypeDto == null ? 0 : orderTypeDto.hashCode())) * 31;
            SideDto sideDto = this.order_side;
            int iHashCode8 = (iHashCode7 + (sideDto == null ? 0 : sideDto.hashCode())) * 31;
            String str5 = this.start_date;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.end_date;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.comma_separated_order_state;
            int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.updated_at_start_time;
            int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.updated_at_end_time;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            OrderTriggerDto orderTriggerDto = this.order_trigger;
            int iHashCode14 = (iHashCode13 + (orderTriggerDto == null ? 0 : orderTriggerDto.hashCode())) * 31;
            Boolean bool = this.is_download_csv;
            int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
            FuturesContractTypeDto futuresContractTypeDto = this.contract_type;
            int iHashCode16 = (iHashCode15 + (futuresContractTypeDto == null ? 0 : futuresContractTypeDto.hashCode())) * 31;
            OrderRejectReasonDto orderRejectReasonDto = this.reject_reason;
            int iHashCode17 = (iHashCode16 + (orderRejectReasonDto == null ? 0 : orderRejectReasonDto.hashCode())) * 31;
            String str10 = this.rhs_account_number;
            int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
            ShardRegionDto shardRegionDto = this.shard_region;
            int iHashCode19 = (iHashCode18 + (shardRegionDto == null ? 0 : shardRegionDto.hashCode())) * 31;
            ShardNumberDto shardNumberDto = this.shard_number;
            return iHashCode19 + (shardNumberDto != null ? shardNumberDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_id=" + this.account_id + ", order_state=" + this.order_state + ", contract_id=" + this.contract_id + ", cursor=" + this.cursor + ", page_size=" + this.page_size + ", account_number=" + this.account_number + ", order_id=" + this.order_id + ", order_type=" + this.order_type + ", order_side=" + this.order_side + ", start_date=" + this.start_date + ", end_date=" + this.end_date + ", comma_separated_order_state=" + this.comma_separated_order_state + ", updated_at_start_time=" + this.updated_at_start_time + ", updated_at_end_time=" + this.updated_at_end_time + ", order_trigger=" + this.order_trigger + ", is_download_csv=" + this.is_download_csv + ", contract_type=" + this.contract_type + ", reject_reason=" + this.reject_reason + ", rhs_account_number=" + this.rhs_account_number + ", shard_region=" + this.shard_region + ", shard_number=" + this.shard_number + ")";
        }

        /* compiled from: GetOrdersRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetOrdersRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, List list, String str2, String str3, Integer num, String str4, String str5, OrderTypeDto orderTypeDto, SideDto sideDto, String str6, String str7, String str8, String str9, String str10, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str11, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.account_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.order_state = CollectionsKt.emptyList();
            } else {
                this.order_state = list;
            }
            if ((i & 4) == 0) {
                this.contract_id = null;
            } else {
                this.contract_id = str2;
            }
            if ((i & 8) == 0) {
                this.cursor = null;
            } else {
                this.cursor = str3;
            }
            if ((i & 16) == 0) {
                this.page_size = null;
            } else {
                this.page_size = num;
            }
            if ((i & 32) == 0) {
                this.account_number = null;
            } else {
                this.account_number = str4;
            }
            if ((i & 64) == 0) {
                this.order_id = null;
            } else {
                this.order_id = str5;
            }
            if ((i & 128) == 0) {
                this.order_type = null;
            } else {
                this.order_type = orderTypeDto;
            }
            if ((i & 256) == 0) {
                this.order_side = null;
            } else {
                this.order_side = sideDto;
            }
            if ((i & 512) == 0) {
                this.start_date = null;
            } else {
                this.start_date = str6;
            }
            if ((i & 1024) == 0) {
                this.end_date = null;
            } else {
                this.end_date = str7;
            }
            if ((i & 2048) == 0) {
                this.comma_separated_order_state = null;
            } else {
                this.comma_separated_order_state = str8;
            }
            if ((i & 4096) == 0) {
                this.updated_at_start_time = null;
            } else {
                this.updated_at_start_time = str9;
            }
            if ((i & 8192) == 0) {
                this.updated_at_end_time = null;
            } else {
                this.updated_at_end_time = str10;
            }
            if ((i & 16384) == 0) {
                this.order_trigger = null;
            } else {
                this.order_trigger = orderTriggerDto;
            }
            if ((32768 & i) == 0) {
                this.is_download_csv = null;
            } else {
                this.is_download_csv = bool;
            }
            if ((65536 & i) == 0) {
                this.contract_type = null;
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            if ((131072 & i) == 0) {
                this.reject_reason = null;
            } else {
                this.reject_reason = orderRejectReasonDto;
            }
            if ((262144 & i) == 0) {
                this.rhs_account_number = null;
            } else {
                this.rhs_account_number = str11;
            }
            if ((524288 & i) == 0) {
                this.shard_region = null;
            } else {
                this.shard_region = shardRegionDto;
            }
            if ((i & 1048576) == 0) {
                this.shard_number = null;
            } else {
                this.shard_number = shardNumberDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.account_id);
            }
            if (!Intrinsics.areEqual(self.order_state, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.order_state);
            }
            String str = self.contract_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            String str2 = self.cursor;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str2);
            }
            Integer num = self.page_size;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            String str3 = self.account_number;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str3);
            }
            String str4 = self.order_id;
            if (str4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, str4);
            }
            OrderTypeDto orderTypeDto = self.order_type;
            if (orderTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, OrderTypeDto.Serializer.INSTANCE, orderTypeDto);
            }
            SideDto sideDto = self.order_side;
            if (sideDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SideDto.Serializer.INSTANCE, sideDto);
            }
            String str5 = self.start_date;
            if (str5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str5);
            }
            String str6 = self.end_date;
            if (str6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, str6);
            }
            String str7 = self.comma_separated_order_state;
            if (str7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, str7);
            }
            String str8 = self.updated_at_start_time;
            if (str8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, str8);
            }
            String str9 = self.updated_at_end_time;
            if (str9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, str9);
            }
            OrderTriggerDto orderTriggerDto = self.order_trigger;
            if (orderTriggerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, OrderTriggerDto.Serializer.INSTANCE, orderTriggerDto);
            }
            Boolean bool = self.is_download_csv;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, BooleanSerializer.INSTANCE, bool);
            }
            FuturesContractTypeDto futuresContractTypeDto = self.contract_type;
            if (futuresContractTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, FuturesContractTypeDto.Serializer.INSTANCE, futuresContractTypeDto);
            }
            OrderRejectReasonDto orderRejectReasonDto = self.reject_reason;
            if (orderRejectReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, OrderRejectReasonDto.Serializer.INSTANCE, orderRejectReasonDto);
            }
            String str10 = self.rhs_account_number;
            if (str10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, StringSerializer.INSTANCE, str10);
            }
            ShardRegionDto shardRegionDto = self.shard_region;
            if (shardRegionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, ShardRegionDto.Serializer.INSTANCE, shardRegionDto);
            }
            ShardNumberDto shardNumberDto = self.shard_number;
            if (shardNumberDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, ShardNumberDto.Serializer.INSTANCE, shardNumberDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(String account_id, List<? extends OrderStateDto> order_state, String str, String str2, Integer num, String str3, String str4, OrderTypeDto orderTypeDto, SideDto sideDto, String str5, String str6, String str7, String str8, String str9, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str10, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto) {
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(order_state, "order_state");
            this.account_id = account_id;
            this.order_state = order_state;
            this.contract_id = str;
            this.cursor = str2;
            this.page_size = num;
            this.account_number = str3;
            this.order_id = str4;
            this.order_type = orderTypeDto;
            this.order_side = sideDto;
            this.start_date = str5;
            this.end_date = str6;
            this.comma_separated_order_state = str7;
            this.updated_at_start_time = str8;
            this.updated_at_end_time = str9;
            this.order_trigger = orderTriggerDto;
            this.is_download_csv = bool;
            this.contract_type = futuresContractTypeDto;
            this.reject_reason = orderRejectReasonDto;
            this.rhs_account_number = str10;
            this.shard_region = shardRegionDto;
            this.shard_number = shardNumberDto;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public /* synthetic */ Surrogate(String str, List list, String str2, String str3, Integer num, String str4, String str5, OrderTypeDto orderTypeDto, SideDto sideDto, String str6, String str7, String str8, String str9, String str10, OrderTriggerDto orderTriggerDto, Boolean bool, FuturesContractTypeDto futuresContractTypeDto, OrderRejectReasonDto orderRejectReasonDto, String str11, ShardRegionDto shardRegionDto, ShardNumberDto shardNumberDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : orderTypeDto, (i & 256) != 0 ? null : sideDto, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : orderTriggerDto, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : futuresContractTypeDto, (i & 131072) != 0 ? null : orderRejectReasonDto, (i & 262144) != 0 ? null : str11, (i & 524288) != 0 ? null : shardRegionDto, (i & 1048576) != 0 ? null : shardNumberDto);
        }

        public final List<OrderStateDto> getOrder_state() {
            return this.order_state;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public final String getCursor() {
            return this.cursor;
        }

        public final Integer getPage_size() {
            return this.page_size;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getOrder_id() {
            return this.order_id;
        }

        public final OrderTypeDto getOrder_type() {
            return this.order_type;
        }

        public final SideDto getOrder_side() {
            return this.order_side;
        }

        public final String getStart_date() {
            return this.start_date;
        }

        public final String getEnd_date() {
            return this.end_date;
        }

        public final String getComma_separated_order_state() {
            return this.comma_separated_order_state;
        }

        public final String getUpdated_at_start_time() {
            return this.updated_at_start_time;
        }

        public final String getUpdated_at_end_time() {
            return this.updated_at_end_time;
        }

        public final OrderTriggerDto getOrder_trigger() {
            return this.order_trigger;
        }

        public final Boolean is_download_csv() {
            return this.is_download_csv;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final OrderRejectReasonDto getReject_reason() {
            return this.reject_reason;
        }

        public final String getRhs_account_number() {
            return this.rhs_account_number;
        }

        public final ShardRegionDto getShard_region() {
            return this.shard_region;
        }

        public final ShardNumberDto getShard_number() {
            return this.shard_number;
        }
    }

    /* compiled from: GetOrdersRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "Lcom/robinhood/ceres/v1/GetOrdersRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetOrdersRequestDto, GetOrdersRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetOrdersRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrdersRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetOrdersRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetOrdersRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetOrdersRequest> getProtoAdapter() {
            return GetOrdersRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrdersRequestDto getZeroValue() {
            return GetOrdersRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetOrdersRequestDto fromProto(GetOrdersRequest proto) {
            OrderTypeDto orderTypeDto;
            OrderTriggerDto orderTriggerDtoFromProto;
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_id = proto.getAccount_id();
            List<OrderState> order_state = proto.getOrder_state();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(order_state, 10));
            Iterator<T> it = order_state.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderStateDto.INSTANCE.fromProto((OrderState) it.next()));
            }
            String contract_id = proto.getContract_id();
            String cursor = proto.getCursor();
            Integer page_size = proto.getPage_size();
            String account_number = proto.getAccount_number();
            String order_id = proto.getOrder_id();
            OrderType order_type = proto.getOrder_type();
            OrderTypeDto orderTypeDtoFromProto = order_type != null ? OrderTypeDto.INSTANCE.fromProto(order_type) : null;
            Side order_side = proto.getOrder_side();
            SideDto sideDtoFromProto = order_side != null ? SideDto.INSTANCE.fromProto(order_side) : null;
            String start_date = proto.getStart_date();
            String end_date = proto.getEnd_date();
            String comma_separated_order_state = proto.getComma_separated_order_state();
            String updated_at_start_time = proto.getUpdated_at_start_time();
            String updated_at_end_time = proto.getUpdated_at_end_time();
            OrderTrigger order_trigger = proto.getOrder_trigger();
            if (order_trigger != null) {
                OrderTypeDto orderTypeDto2 = orderTypeDtoFromProto;
                orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(order_trigger);
                orderTypeDto = orderTypeDto2;
            } else {
                orderTypeDto = orderTypeDtoFromProto;
                orderTriggerDtoFromProto = null;
            }
            Boolean is_download_csv = proto.getIs_download_csv();
            OrderTriggerDto orderTriggerDto = orderTriggerDtoFromProto;
            FuturesContractType contract_type = proto.getContract_type();
            FuturesContractTypeDto futuresContractTypeDtoFromProto = contract_type != null ? FuturesContractTypeDto.INSTANCE.fromProto(contract_type) : null;
            OrderRejectReason reject_reason = proto.getReject_reason();
            FuturesContractTypeDto futuresContractTypeDto = futuresContractTypeDtoFromProto;
            OrderRejectReasonDto orderRejectReasonDtoFromProto = reject_reason != null ? OrderRejectReasonDto.INSTANCE.fromProto(reject_reason) : null;
            String rhs_account_number = proto.getRhs_account_number();
            ShardRegion shard_region = proto.getShard_region();
            OrderRejectReasonDto orderRejectReasonDto = orderRejectReasonDtoFromProto;
            ShardRegionDto shardRegionDtoFromProto = shard_region != null ? ShardRegionDto.INSTANCE.fromProto(shard_region) : null;
            ShardNumber shard_number = proto.getShard_number();
            return new GetOrdersRequestDto(new Surrogate(account_id, arrayList, contract_id, cursor, page_size, account_number, order_id, orderTypeDto, sideDtoFromProto, start_date, end_date, comma_separated_order_state, updated_at_start_time, updated_at_end_time, orderTriggerDto, is_download_csv, futuresContractTypeDto, orderRejectReasonDto, rhs_account_number, shardRegionDtoFromProto, shard_number != null ? ShardNumberDto.INSTANCE.fromProto(shard_number) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.GetOrdersRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetOrdersRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetOrdersRequestDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetOrdersRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/GetOrdersRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetOrdersRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.GetOrdersRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetOrdersRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetOrdersRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetOrdersRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetOrdersRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetOrdersRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.GetOrdersRequestDto";
        }
    }
}
