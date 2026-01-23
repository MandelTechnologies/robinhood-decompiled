package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.i18n.Affiliate;
import com.robinhood.rosetta.i18n.AffiliateDto;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.FractionalOrderDetailsDto;
import com.robinhood.rosetta.mainst.IPOOrderDetailsDto;
import com.robinhood.rosetta.mainst.NullableBoolDto;
import com.robinhood.rosetta.mainst.NullableIntDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.robinhood.rosetta.mainst.OrderMetadataDto;
import com.robinhood.rosetta.mainst.OrderModificationDto;
import com.robinhood.rosetta.mainst.OrderUpdateDto;
import com.robinhood.rosetta.mainst.OrderUpdateExecutionDto;
import com.robinhood.rosetta.mainst.OrderUpdateLegDto;
import com.robinhood.rosetta.mainst.ReplacesOrderDetailsDto;
import com.robinhood.rosetta.mainst.TimeDto;
import com.robinhood.rosetta.mainst.UUIDDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.MarginMode;
import rosetta.mainst.MarginModeDto;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderStateDto;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderType;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.PositionEffect;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.Route;
import rosetta.mainst.RouteDto;
import rosetta.mainst.Side;
import rosetta.mainst.SideDto;
import rosetta.mainst.TimeInForce;
import rosetta.mainst.TimeInForceDto;
import rosetta.order.AccountType;
import rosetta.order.AccountTypeDto;
import rosetta.order.Agent;
import rosetta.order.AgentDto;
import rosetta.order.ClientService;
import rosetta.order.ClientServiceDto;
import rosetta.order.CurrencyDenomination;
import rosetta.order.CurrencyDenominationDto;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;
import rosetta.order.PegType;
import rosetta.order.PegTypeDto;
import rosetta.order.ResponseCategory;
import rosetta.order.ResponseCategoryDto;
import rosetta.order.WaitingCategory;
import rosetta.order.WaitingCategoryDto;

/* compiled from: OrderUpdateDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Û\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\nÚ\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BË\u0005\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0014\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u00101\u001a\u00020\u001b\u0012\b\b\u0002\u00102\u001a\u000203\u0012\b\b\u0002\u00104\u001a\u000205\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\b\b\u0002\u00108\u001a\u00020+\u0012\b\b\u0002\u00109\u001a\u00020:\u0012\b\b\u0002\u0010;\u001a\u00020<\u0012\b\b\u0002\u0010=\u001a\u00020>\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010B\u001a\u00020C\u0012\b\b\u0002\u0010D\u001a\u00020E\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010G\u001a\u00020H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0014\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010P\u001a\u00020\u001b\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010Y\u001a\u00020Z\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010_\u001a\u00020`\u0012\b\b\u0002\u0010a\u001a\u00020b\u0012\b\b\u0002\u0010c\u001a\u00020d\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010g¢\u0006\u0004\b\u0006\u0010hJÉ\u0005\u0010Í\u0001\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00142\b\b\u0002\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u00101\u001a\u00020\u001b2\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u0002052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u00020+2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010G\u001a\u00020H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00142\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010P\u001a\u00020\u001b2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010_\u001a\u00020`2\b\b\u0002\u0010a\u001a\u00020b2\b\b\u0002\u0010c\u001a\u00020d2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010gJ\t\u0010Î\u0001\u001a\u00020\u0002H\u0016J\t\u0010Ï\u0001\u001a\u00020\u001bH\u0016J\u0016\u0010Ð\u0001\u001a\u00020/2\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ò\u0001H\u0096\u0002J\t\u0010Ó\u0001\u001a\u00020\u0017H\u0016J\u001d\u0010Ô\u0001\u001a\u00030Õ\u00012\b\u0010Ö\u0001\u001a\u00030×\u00012\u0007\u0010Ø\u0001\u001a\u00020\u0017H\u0016J\t\u0010Ù\u0001\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bk\u0010jR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\br\u0010qR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b~\u0010oR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010oR\u0014\u0010 \u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010oR\u0014\u0010!\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010oR\u0014\u0010\"\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010jR\u0015\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00148F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010uR\u0013\u0010'\u001a\u00020(8F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0014\u0010)\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010qR\u0013\u0010*\u001a\u00020+8F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0013\u0010,\u001a\u00020+8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0014\u0010-\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010oR\u0012\u0010.\u001a\u00020/8F¢\u0006\u0007\u001a\u0005\b.\u0010\u008d\u0001R\u0014\u00100\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010qR\u0012\u00101\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010{R\u0013\u00102\u001a\u0002038F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0013\u00104\u001a\u0002058F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0015\u00106\u001a\u0004\u0018\u0001078F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0013\u00108\u001a\u00020+8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u008a\u0001R\u0013\u00109\u001a\u00020:8F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0013\u0010;\u001a\u00020<8F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0013\u0010=\u001a\u00020>8F¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0013\u0010?\u001a\u00020@8F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0015\u0010A\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u0084\u0001R\u0013\u0010B\u001a\u00020C8F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0013\u0010D\u001a\u00020E8F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0014\u0010F\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010oR\u0013\u0010G\u001a\u00020H8F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00148F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010uR\u0014\u0010M\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010oR\u0014\u0010N\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010qR\u0014\u0010O\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010qR\u0012\u0010P\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010{R\u0014\u0010Q\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010oR\u0014\u0010R\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010jR\u0014\u0010S\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010jR\u0015\u0010T\u001a\u0004\u0018\u00010U8F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0014\u0010V\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010oR\u0014\u0010W\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010oR\u0014\u0010X\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010qR\u0013\u0010Y\u001a\u00020Z8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0014\u0010[\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010oR\u0015\u0010\\\u001a\u0004\u0018\u00010]8F¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001R\u0014\u0010^\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010jR\u0013\u0010_\u001a\u00020`8F¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0013\u0010a\u001a\u00020b8F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0013\u0010c\u001a\u00020d8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010e\u001a\u0004\u0018\u00010$8F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010\u0084\u0001R\u0015\u0010f\u001a\u0004\u0018\u00010g8F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0017\u0010Å\u0001\u001a\u0005\u0018\u00010Æ\u00018F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010É\u0001\u001a\u0005\u0018\u00010Ê\u00018F¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001¨\u0006ß\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/OrderUpdate;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "order_id", "state", "Lrosetta/mainst/OrderStateDto;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "last_transaction_at", "stop_triggered_at", "executions", "", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto;", "version", "", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "account_number", "", "side", "Lrosetta/mainst/SideDto;", "quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "last_trail_price", "instrument_id", "clearing_firm", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "legs", "Lcom/robinhood/rosetta/mainst/OrderUpdateLegDto;", "response_category", "Lrosetta/order/ResponseCategoryDto;", "update_created_at", "cancel_open_agent", "Lrosetta/order/AgentDto;", "cancel_close_agent", "last_trail_price_with_collar", "is_heartbeat", "", "last_sent_at", "mainst_shard_id", "order_created_service", "Lrosetta/order/ClientServiceDto;", "created_affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "created_agent", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "peg_type", "Lrosetta/order/PegTypeDto;", "market_hours", "Lrosetta/order/MarketHoursDto;", "response_text", "trigger", "Lrosetta/mainst/OrderTriggerDto;", "type", "Lrosetta/mainst/OrderTypeDto;", "executed_quantity", "waiting_category", "Lrosetta/order/WaitingCategoryDto;", "metadata", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "modifications", "Lcom/robinhood/rosetta/mainst/OrderModificationDto;", "estimated_notional", "cancel_open_time", "cancel_close_time", "symbol", "trailing_peg", "list_root_id", "replacement_order_id", "replaces_order", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "notional", "cancelled_notional", "cancel_triggering_time", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/order/AccountTypeDto;", "leverage", "reduce_only", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "bulk_event_id", "currency_denomination", "Lrosetta/order/CurrencyDenominationDto;", "margin_mode_v2", "Lrosetta/mainst/MarginModeDto;", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "position_id", "ExtraDetails", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/List;ILrosetta/mainst/RouteDto;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/util/List;Lrosetta/order/ResponseCategoryDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lrosetta/order/ClientServiceDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lrosetta/order/AgentDto;Lrosetta/mainst/TimeInForceDto;Lrosetta/mainst/InstrumentTypeDto;Lrosetta/order/PegTypeDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/order/WaitingCategoryDto;Lcom/robinhood/rosetta/mainst/OrderMetadataDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AccountTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/order/CurrencyDenominationDto;Lrosetta/mainst/MarginModeDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getOrder_id", "getState", "()Lrosetta/mainst/OrderStateDto;", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getLast_transaction_at", "getStop_triggered_at", "getExecutions", "()Ljava/util/List;", "getVersion", "()I", "getRoute", "()Lrosetta/mainst/RouteDto;", "getAccount_number", "()Ljava/lang/String;", "getSide", "()Lrosetta/mainst/SideDto;", "getQuantity", "getPrice", "getStop_price", "getLast_trail_price", "getInstrument_id", "getClearing_firm", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getLegs", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getUpdate_created_at", "getCancel_open_agent", "()Lrosetta/order/AgentDto;", "getCancel_close_agent", "getLast_trail_price_with_collar", "()Z", "getLast_sent_at", "getMainst_shard_id", "getOrder_created_service", "()Lrosetta/order/ClientServiceDto;", "getCreated_affiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getCreated_agent", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getPeg_type", "()Lrosetta/order/PegTypeDto;", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getResponse_text", "getTrigger", "()Lrosetta/mainst/OrderTriggerDto;", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getExecuted_quantity", "getWaiting_category", "()Lrosetta/order/WaitingCategoryDto;", "getMetadata", "()Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "getModifications", "getEstimated_notional", "getCancel_open_time", "getCancel_close_time", "getSymbol", "getTrailing_peg", "getList_root_id", "getReplacement_order_id", "getReplaces_order", "()Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "getNotional", "getCancelled_notional", "getCancel_triggering_time", "getAccount_type", "()Lrosetta/order/AccountTypeDto;", "getLeverage", "getReduce_only", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getBulk_event_id", "getCurrency_denomination", "()Lrosetta/order/CurrencyDenominationDto;", "getMargin_mode_v2", "()Lrosetta/mainst/MarginModeDto;", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getPosition_id", "getExtraDetails", "()Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;", "fractional_details", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "getFractional_details", "()Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "ipo_details", "Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;", "getIpo_details", "()Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "ExtraDetailsDto", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class OrderUpdateDto implements Dto3<OrderUpdate>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderUpdateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderUpdateDto, OrderUpdate>> binaryBase64Serializer$delegate;
    private static final OrderUpdateDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderUpdateDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderUpdateDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final UUIDDto getOrder_id() {
        return this.surrogate.getOrder_id();
    }

    public final OrderStateDto getState() {
        return this.surrogate.getState();
    }

    public final DecimalDto getCancelled_quantity() {
        return this.surrogate.getCancelled_quantity();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getLast_transaction_at() {
        return this.surrogate.getLast_transaction_at();
    }

    public final TimeDto getStop_triggered_at() {
        return this.surrogate.getStop_triggered_at();
    }

    public final List<OrderUpdateExecutionDto> getExecutions() {
        return this.surrogate.getExecutions();
    }

    public final int getVersion() {
        return this.surrogate.getVersion();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final DecimalDto getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final DecimalDto getLast_trail_price() {
        return this.surrogate.getLast_trail_price();
    }

    public final UUIDDto getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final NullableStringDto getClearing_firm() {
        return this.surrogate.getClearing_firm();
    }

    public final List<OrderUpdateLegDto> getLegs() {
        return this.surrogate.getLegs();
    }

    public final ResponseCategoryDto getResponse_category() {
        return this.surrogate.getResponse_category();
    }

    public final TimeDto getUpdate_created_at() {
        return this.surrogate.getUpdate_created_at();
    }

    public final AgentDto getCancel_open_agent() {
        return this.surrogate.getCancel_open_agent();
    }

    public final AgentDto getCancel_close_agent() {
        return this.surrogate.getCancel_close_agent();
    }

    public final DecimalDto getLast_trail_price_with_collar() {
        return this.surrogate.getLast_trail_price_with_collar();
    }

    public final boolean is_heartbeat() {
        return this.surrogate.is_heartbeat();
    }

    public final TimeDto getLast_sent_at() {
        return this.surrogate.getLast_sent_at();
    }

    public final String getMainst_shard_id() {
        return this.surrogate.getMainst_shard_id();
    }

    public final ClientServiceDto getOrder_created_service() {
        return this.surrogate.getOrder_created_service();
    }

    public final AffiliateDto getCreated_affiliate() {
        return this.surrogate.getCreated_affiliate();
    }

    public final NullableIntDto getService_shard_id() {
        return this.surrogate.getService_shard_id();
    }

    public final AgentDto getCreated_agent() {
        return this.surrogate.getCreated_agent();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final PegTypeDto getPeg_type() {
        return this.surrogate.getPeg_type();
    }

    public final MarketHoursDto getMarket_hours() {
        return this.surrogate.getMarket_hours();
    }

    public final NullableStringDto getResponse_text() {
        return this.surrogate.getResponse_text();
    }

    public final OrderTriggerDto getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final DecimalDto getExecuted_quantity() {
        return this.surrogate.getExecuted_quantity();
    }

    public final WaitingCategoryDto getWaiting_category() {
        return this.surrogate.getWaiting_category();
    }

    public final OrderMetadataDto getMetadata() {
        return this.surrogate.getMetadata();
    }

    public final List<OrderModificationDto> getModifications() {
        return this.surrogate.getModifications();
    }

    public final DecimalDto getEstimated_notional() {
        return this.surrogate.getEstimated_notional();
    }

    public final TimeDto getCancel_open_time() {
        return this.surrogate.getCancel_open_time();
    }

    public final TimeDto getCancel_close_time() {
        return this.surrogate.getCancel_close_time();
    }

    public final String getSymbol() {
        return this.surrogate.getSymbol();
    }

    public final DecimalDto getTrailing_peg() {
        return this.surrogate.getTrailing_peg();
    }

    public final UUIDDto getList_root_id() {
        return this.surrogate.getList_root_id();
    }

    public final UUIDDto getReplacement_order_id() {
        return this.surrogate.getReplacement_order_id();
    }

    public final ReplacesOrderDetailsDto getReplaces_order() {
        return this.surrogate.getReplaces_order();
    }

    public final DecimalDto getNotional() {
        return this.surrogate.getNotional();
    }

    public final DecimalDto getCancelled_notional() {
        return this.surrogate.getCancelled_notional();
    }

    public final TimeDto getCancel_triggering_time() {
        return this.surrogate.getCancel_triggering_time();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final DecimalDto getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final NullableBoolDto getReduce_only() {
        return this.surrogate.getReduce_only();
    }

    public final UUIDDto getBulk_event_id() {
        return this.surrogate.getBulk_event_id();
    }

    public final CurrencyDenominationDto getCurrency_denomination() {
        return this.surrogate.getCurrency_denomination();
    }

    public final MarginModeDto getMargin_mode_v2() {
        return this.surrogate.getMargin_mode_v2();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final NullableStringDto getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final ExtraDetailsDto getExtraDetails() {
        if (this.surrogate.getFractional_details() != null) {
            return new ExtraDetailsDto.FractionalDetails(this.surrogate.getFractional_details());
        }
        if (this.surrogate.getIpo_details() != null) {
            return new ExtraDetailsDto.IpoDetails(this.surrogate.getIpo_details());
        }
        return null;
    }

    public final FractionalOrderDetailsDto getFractional_details() {
        return this.surrogate.getFractional_details();
    }

    public final IPOOrderDetailsDto getIpo_details() {
        return this.surrogate.getIpo_details();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderUpdateDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, OrderStateDto orderStateDto, DecimalDto decimalDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, int i, RouteDto routeDto, String str, SideDto sideDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, UUIDDto uUIDDto3, NullableStringDto nullableStringDto, List list2, ResponseCategoryDto responseCategoryDto, TimeDto timeDto4, AgentDto agentDto, AgentDto agentDto2, DecimalDto decimalDto6, boolean z, TimeDto timeDto5, String str2, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, AgentDto agentDto3, TimeInForceDto timeInForceDto, InstrumentTypeDto instrumentTypeDto, PegTypeDto pegTypeDto, MarketHoursDto marketHoursDto, NullableStringDto nullableStringDto2, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto7, WaitingCategoryDto waitingCategoryDto, OrderMetadataDto orderMetadataDto, List list3, DecimalDto decimalDto8, TimeDto timeDto6, TimeDto timeDto7, String str3, DecimalDto decimalDto9, UUIDDto uUIDDto4, UUIDDto uUIDDto5, ReplacesOrderDetailsDto replacesOrderDetailsDto, DecimalDto decimalDto10, DecimalDto decimalDto11, TimeDto timeDto8, AccountTypeDto accountTypeDto, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto6, CurrencyDenominationDto currencyDenominationDto, MarginModeDto marginModeDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto3, ExtraDetailsDto extraDetailsDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        UUIDDto uUIDDto7 = (i2 & 1) != 0 ? null : uUIDDto;
        this(uUIDDto7, (i2 & 2) != 0 ? null : uUIDDto2, (i2 & 4) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i2 & 8) != 0 ? null : decimalDto, (i2 & 16) != 0 ? null : timeDto, (i2 & 32) != 0 ? null : timeDto2, (i2 & 64) != 0 ? null : timeDto3, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 1024) != 0 ? "" : str, (i2 & 2048) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 4096) != 0 ? null : decimalDto2, (i2 & 8192) != 0 ? null : decimalDto3, (i2 & 16384) != 0 ? null : decimalDto4, (i2 & 32768) != 0 ? null : decimalDto5, (i2 & 65536) != 0 ? null : uUIDDto3, (i2 & 131072) != 0 ? null : nullableStringDto, (i2 & 262144) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 524288) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i2 & 1048576) != 0 ? null : timeDto4, (i2 & 2097152) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i2 & 4194304) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i2 & 8388608) != 0 ? null : decimalDto6, (i2 & 16777216) != 0 ? false : z, (i2 & 33554432) != 0 ? null : timeDto5, (i2 & 67108864) != 0 ? "" : str2, (i2 & 134217728) != 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto, (i2 & 268435456) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i2 & 536870912) != 0 ? null : nullableIntDto, (i2 & 1073741824) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto3, (i2 & Integer.MIN_VALUE) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i3 & 1) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i3 & 2) != 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto, (i3 & 4) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i3 & 8) != 0 ? null : nullableStringDto2, (i3 & 16) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i3 & 32) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i3 & 64) != 0 ? null : decimalDto7, (i3 & 128) != 0 ? WaitingCategoryDto.INSTANCE.getZeroValue() : waitingCategoryDto, (i3 & 256) != 0 ? null : orderMetadataDto, (i3 & 512) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 1024) != 0 ? null : decimalDto8, (i3 & 2048) != 0 ? null : timeDto6, (i3 & 4096) != 0 ? null : timeDto7, (i3 & 8192) == 0 ? str3 : "", (i3 & 16384) != 0 ? null : decimalDto9, (i3 & 32768) != 0 ? null : uUIDDto4, (i3 & 65536) != 0 ? null : uUIDDto5, (i3 & 131072) != 0 ? null : replacesOrderDetailsDto, (i3 & 262144) != 0 ? null : decimalDto10, (i3 & 524288) != 0 ? null : decimalDto11, (i3 & 1048576) != 0 ? null : timeDto8, (i3 & 2097152) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i3 & 4194304) != 0 ? null : decimalDto12, (i3 & 8388608) != 0 ? null : nullableBoolDto, (i3 & 16777216) != 0 ? null : uUIDDto6, (i3 & 33554432) != 0 ? CurrencyDenominationDto.INSTANCE.getZeroValue() : currencyDenominationDto, (i3 & 67108864) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i3 & 134217728) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i3 & 268435456) != 0 ? null : nullableStringDto3, (i3 & 536870912) != 0 ? null : extraDetailsDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderUpdateDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, OrderStateDto state, DecimalDto decimalDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List<OrderUpdateExecutionDto> executions, int i, RouteDto route, String account_number, SideDto side, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, UUIDDto uUIDDto3, NullableStringDto nullableStringDto, List<OrderUpdateLegDto> legs, ResponseCategoryDto response_category, TimeDto timeDto4, AgentDto cancel_open_agent, AgentDto cancel_close_agent, DecimalDto decimalDto6, boolean z, TimeDto timeDto5, String mainst_shard_id, ClientServiceDto order_created_service, AffiliateDto created_affiliate, NullableIntDto nullableIntDto, AgentDto created_agent, TimeInForceDto time_in_force, InstrumentTypeDto instrument_type, PegTypeDto peg_type, MarketHoursDto market_hours, NullableStringDto nullableStringDto2, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto decimalDto7, WaitingCategoryDto waiting_category, OrderMetadataDto orderMetadataDto, List<OrderModificationDto> modifications, DecimalDto decimalDto8, TimeDto timeDto6, TimeDto timeDto7, String symbol, DecimalDto decimalDto9, UUIDDto uUIDDto4, UUIDDto uUIDDto5, ReplacesOrderDetailsDto replacesOrderDetailsDto, DecimalDto decimalDto10, DecimalDto decimalDto11, TimeDto timeDto8, AccountTypeDto account_type, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto6, CurrencyDenominationDto currency_denomination, MarginModeDto margin_mode_v2, PositionEffectDto position_effect, NullableStringDto nullableStringDto3, ExtraDetailsDto extraDetailsDto) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(mainst_shard_id, "mainst_shard_id");
        Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
        Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
        Intrinsics.checkNotNullParameter(modifications, "modifications");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
        Intrinsics.checkNotNullParameter(margin_mode_v2, "margin_mode_v2");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        ExtraDetailsDto.FractionalDetails fractionalDetails = extraDetailsDto instanceof ExtraDetailsDto.FractionalDetails ? (ExtraDetailsDto.FractionalDetails) extraDetailsDto : null;
        FractionalOrderDetailsDto value = fractionalDetails != null ? fractionalDetails.getValue() : null;
        ExtraDetailsDto.IpoDetails ipoDetails = extraDetailsDto instanceof ExtraDetailsDto.IpoDetails ? (ExtraDetailsDto.IpoDetails) extraDetailsDto : null;
        this(new Surrogate(uUIDDto, uUIDDto2, state, decimalDto, timeDto, timeDto2, timeDto3, executions, i, route, account_number, side, decimalDto2, decimalDto3, decimalDto4, decimalDto5, uUIDDto3, nullableStringDto, legs, response_category, timeDto4, cancel_open_agent, cancel_close_agent, decimalDto6, z, timeDto5, mainst_shard_id, order_created_service, created_affiliate, nullableIntDto, created_agent, time_in_force, instrument_type, peg_type, market_hours, nullableStringDto2, trigger, type2, decimalDto7, waiting_category, orderMetadataDto, modifications, decimalDto8, timeDto6, timeDto7, symbol, decimalDto9, uUIDDto4, uUIDDto5, replacesOrderDetailsDto, decimalDto10, decimalDto11, timeDto8, account_type, decimalDto12, nullableBoolDto, uUIDDto6, currency_denomination, margin_mode_v2, position_effect, nullableStringDto3, value, ipoDetails != null ? ipoDetails.getValue() : null));
    }

    public final OrderUpdateDto copy(UUIDDto id, UUIDDto order_id, OrderStateDto state, DecimalDto cancelled_quantity, TimeDto created_at, TimeDto last_transaction_at, TimeDto stop_triggered_at, List<OrderUpdateExecutionDto> executions, int version, RouteDto route, String account_number, SideDto side, DecimalDto quantity, DecimalDto price, DecimalDto stop_price, DecimalDto last_trail_price, UUIDDto instrument_id, NullableStringDto clearing_firm, List<OrderUpdateLegDto> legs, ResponseCategoryDto response_category, TimeDto update_created_at, AgentDto cancel_open_agent, AgentDto cancel_close_agent, DecimalDto last_trail_price_with_collar, boolean is_heartbeat, TimeDto last_sent_at, String mainst_shard_id, ClientServiceDto order_created_service, AffiliateDto created_affiliate, NullableIntDto service_shard_id, AgentDto created_agent, TimeInForceDto time_in_force, InstrumentTypeDto instrument_type, PegTypeDto peg_type, MarketHoursDto market_hours, NullableStringDto response_text, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto executed_quantity, WaitingCategoryDto waiting_category, OrderMetadataDto metadata, List<OrderModificationDto> modifications, DecimalDto estimated_notional, TimeDto cancel_open_time, TimeDto cancel_close_time, String symbol, DecimalDto trailing_peg, UUIDDto list_root_id, UUIDDto replacement_order_id, ReplacesOrderDetailsDto replaces_order, DecimalDto notional, DecimalDto cancelled_notional, TimeDto cancel_triggering_time, AccountTypeDto account_type, DecimalDto leverage, NullableBoolDto reduce_only, UUIDDto bulk_event_id, CurrencyDenominationDto currency_denomination, MarginModeDto margin_mode_v2, PositionEffectDto position_effect, NullableStringDto position_id, ExtraDetailsDto ExtraDetails) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(mainst_shard_id, "mainst_shard_id");
        Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
        Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
        Intrinsics.checkNotNullParameter(modifications, "modifications");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
        Intrinsics.checkNotNullParameter(margin_mode_v2, "margin_mode_v2");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        ExtraDetailsDto.FractionalDetails fractionalDetails = ExtraDetails instanceof ExtraDetailsDto.FractionalDetails ? (ExtraDetailsDto.FractionalDetails) ExtraDetails : null;
        FractionalOrderDetailsDto value = fractionalDetails != null ? fractionalDetails.getValue() : null;
        ExtraDetailsDto.IpoDetails ipoDetails = ExtraDetails instanceof ExtraDetailsDto.IpoDetails ? (ExtraDetailsDto.IpoDetails) ExtraDetails : null;
        return new OrderUpdateDto(new Surrogate(id, order_id, state, cancelled_quantity, created_at, last_transaction_at, stop_triggered_at, executions, version, route, account_number, side, quantity, price, stop_price, last_trail_price, instrument_id, clearing_firm, legs, response_category, update_created_at, cancel_open_agent, cancel_close_agent, last_trail_price_with_collar, is_heartbeat, last_sent_at, mainst_shard_id, order_created_service, created_affiliate, service_shard_id, created_agent, time_in_force, instrument_type, peg_type, market_hours, response_text, trigger, type2, executed_quantity, waiting_category, metadata, modifications, estimated_notional, cancel_open_time, cancel_close_time, symbol, trailing_peg, list_root_id, replacement_order_id, replaces_order, notional, cancelled_notional, cancel_triggering_time, account_type, leverage, reduce_only, bulk_event_id, currency_denomination, margin_mode_v2, position_effect, position_id, value, ipoDetails != null ? ipoDetails.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OrderUpdate toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        UUIDDto order_id = this.surrogate.getOrder_id();
        UUID proto2 = order_id != null ? order_id.toProto() : null;
        OrderState orderState = (OrderState) this.surrogate.getState().toProto();
        DecimalDto cancelled_quantity = this.surrogate.getCancelled_quantity();
        Decimal proto3 = cancelled_quantity != null ? cancelled_quantity.toProto() : null;
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto4 = created_at != null ? created_at.toProto() : null;
        TimeDto last_transaction_at = this.surrogate.getLast_transaction_at();
        Time proto5 = last_transaction_at != null ? last_transaction_at.toProto() : null;
        TimeDto stop_triggered_at = this.surrogate.getStop_triggered_at();
        Time proto6 = stop_triggered_at != null ? stop_triggered_at.toProto() : null;
        List<OrderUpdateExecutionDto> executions = this.surrogate.getExecutions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
        Iterator<T> it = executions.iterator();
        while (it.hasNext()) {
            arrayList.add(((OrderUpdateExecutionDto) it.next()).toProto());
        }
        int version = this.surrogate.getVersion();
        Route route = (Route) this.surrogate.getRoute().toProto();
        String account_number = this.surrogate.getAccount_number();
        Side side = (Side) this.surrogate.getSide().toProto();
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto7 = quantity != null ? quantity.toProto() : null;
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto8 = price != null ? price.toProto() : null;
        DecimalDto stop_price = this.surrogate.getStop_price();
        Decimal proto9 = stop_price != null ? stop_price.toProto() : null;
        DecimalDto last_trail_price = this.surrogate.getLast_trail_price();
        Decimal proto10 = last_trail_price != null ? last_trail_price.toProto() : null;
        UUIDDto instrument_id = this.surrogate.getInstrument_id();
        UUID proto11 = instrument_id != null ? instrument_id.toProto() : null;
        NullableStringDto clearing_firm = this.surrogate.getClearing_firm();
        NullableString proto12 = clearing_firm != null ? clearing_firm.toProto() : null;
        List<OrderUpdateLegDto> legs = this.surrogate.getLegs();
        UUID uuid = proto;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it2 = legs.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OrderUpdateLegDto) it2.next()).toProto());
        }
        ResponseCategory responseCategory = (ResponseCategory) this.surrogate.getResponse_category().toProto();
        TimeDto update_created_at = this.surrogate.getUpdate_created_at();
        Time proto13 = update_created_at != null ? update_created_at.toProto() : null;
        Agent agent = (Agent) this.surrogate.getCancel_open_agent().toProto();
        Agent agent2 = (Agent) this.surrogate.getCancel_close_agent().toProto();
        DecimalDto last_trail_price_with_collar = this.surrogate.getLast_trail_price_with_collar();
        Decimal proto14 = last_trail_price_with_collar != null ? last_trail_price_with_collar.toProto() : null;
        boolean zIs_heartbeat = this.surrogate.is_heartbeat();
        TimeDto last_sent_at = this.surrogate.getLast_sent_at();
        Time proto15 = last_sent_at != null ? last_sent_at.toProto() : null;
        String mainst_shard_id = this.surrogate.getMainst_shard_id();
        ClientService clientService = (ClientService) this.surrogate.getOrder_created_service().toProto();
        Affiliate affiliate = (Affiliate) this.surrogate.getCreated_affiliate().toProto();
        NullableIntDto service_shard_id = this.surrogate.getService_shard_id();
        NullableInt proto16 = service_shard_id != null ? service_shard_id.toProto() : null;
        Agent agent3 = (Agent) this.surrogate.getCreated_agent().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getInstrument_type().toProto();
        PegType pegType = (PegType) this.surrogate.getPeg_type().toProto();
        MarketHours marketHours = (MarketHours) this.surrogate.getMarket_hours().toProto();
        NullableStringDto response_text = this.surrogate.getResponse_text();
        NullableString proto17 = response_text != null ? response_text.toProto() : null;
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getTrigger().toProto();
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        DecimalDto executed_quantity = this.surrogate.getExecuted_quantity();
        Decimal proto18 = executed_quantity != null ? executed_quantity.toProto() : null;
        WaitingCategory waitingCategory = (WaitingCategory) this.surrogate.getWaiting_category().toProto();
        OrderMetadataDto metadata = this.surrogate.getMetadata();
        OrderMetadata proto19 = metadata != null ? metadata.toProto() : null;
        List<OrderModificationDto> modifications = this.surrogate.getModifications();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(modifications, 10));
        Iterator<T> it3 = modifications.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((OrderModificationDto) it3.next()).toProto());
        }
        DecimalDto estimated_notional = this.surrogate.getEstimated_notional();
        Decimal proto20 = estimated_notional != null ? estimated_notional.toProto() : null;
        TimeDto cancel_open_time = this.surrogate.getCancel_open_time();
        Time proto21 = cancel_open_time != null ? cancel_open_time.toProto() : null;
        TimeDto cancel_close_time = this.surrogate.getCancel_close_time();
        Time proto22 = cancel_close_time != null ? cancel_close_time.toProto() : null;
        String symbol = this.surrogate.getSymbol();
        DecimalDto trailing_peg = this.surrogate.getTrailing_peg();
        Decimal proto23 = trailing_peg != null ? trailing_peg.toProto() : null;
        UUIDDto list_root_id = this.surrogate.getList_root_id();
        UUID proto24 = list_root_id != null ? list_root_id.toProto() : null;
        UUIDDto replacement_order_id = this.surrogate.getReplacement_order_id();
        UUID proto25 = replacement_order_id != null ? replacement_order_id.toProto() : null;
        ReplacesOrderDetailsDto replaces_order = this.surrogate.getReplaces_order();
        ReplacesOrderDetails proto26 = replaces_order != null ? replaces_order.toProto() : null;
        DecimalDto notional = this.surrogate.getNotional();
        Decimal proto27 = notional != null ? notional.toProto() : null;
        DecimalDto cancelled_notional = this.surrogate.getCancelled_notional();
        Decimal proto28 = cancelled_notional != null ? cancelled_notional.toProto() : null;
        TimeDto cancel_triggering_time = this.surrogate.getCancel_triggering_time();
        Time proto29 = cancel_triggering_time != null ? cancel_triggering_time.toProto() : null;
        AccountType accountType = (AccountType) this.surrogate.getAccount_type().toProto();
        DecimalDto leverage = this.surrogate.getLeverage();
        Decimal proto30 = leverage != null ? leverage.toProto() : null;
        NullableBoolDto reduce_only = this.surrogate.getReduce_only();
        NullableBool proto31 = reduce_only != null ? reduce_only.toProto() : null;
        UUIDDto bulk_event_id = this.surrogate.getBulk_event_id();
        UUID proto32 = bulk_event_id != null ? bulk_event_id.toProto() : null;
        CurrencyDenomination currencyDenomination = (CurrencyDenomination) this.surrogate.getCurrency_denomination().toProto();
        MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode_v2().toProto();
        PositionEffect positionEffect = (PositionEffect) this.surrogate.getPosition_effect().toProto();
        NullableStringDto position_id = this.surrogate.getPosition_id();
        NullableString proto33 = position_id != null ? position_id.toProto() : null;
        FractionalOrderDetailsDto fractional_details = this.surrogate.getFractional_details();
        FractionalOrderDetails proto34 = fractional_details != null ? fractional_details.toProto() : null;
        IPOOrderDetailsDto ipo_details = this.surrogate.getIpo_details();
        return new OrderUpdate(uuid, proto2, orderState, proto3, proto4, proto5, proto6, arrayList, version, route, account_number, side, proto7, proto8, proto9, proto10, proto11, proto12, arrayList2, responseCategory, proto13, agent, agent2, proto14, zIs_heartbeat, proto15, mainst_shard_id, clientService, affiliate, proto16, agent3, timeInForce, instrumentType, pegType, marketHours, proto17, orderTrigger, orderType, proto18, proto34, ipo_details != null ? ipo_details.toProto() : null, waitingCategory, proto19, arrayList3, proto20, proto21, proto22, symbol, proto23, proto24, proto25, proto26, proto27, proto28, proto29, accountType, proto30, proto31, proto32, currencyDenomination, marginMode, positionEffect, proto33, null, 0, Integer.MIN_VALUE, null);
    }

    public String toString() {
        return "[OrderUpdateDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderUpdateDto) && Intrinsics.areEqual(((OrderUpdateDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000¡\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\bä\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 Ù\u00022\u00020\u0001:\u0004Ø\u0002Ù\u0002Bä\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010.\u001a\u00020\u0018\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\b\b\u0002\u00101\u001a\u000202\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00105\u001a\u00020(\u0012\b\b\u0002\u00106\u001a\u000207\u0012\b\b\u0002\u00108\u001a\u000209\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\b\b\u0002\u0010<\u001a\u00020=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\b\b\u0002\u0010A\u001a\u00020B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010D\u001a\u00020E\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u000e\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010M\u001a\u00020\u0018\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010V\u001a\u00020W\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\\\u001a\u00020]\u0012\b\b\u0002\u0010^\u001a\u00020_\u0012\b\b\u0002\u0010`\u001a\u00020a\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010d\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010f¢\u0006\u0004\bg\u0010hB§\u0005\b\u0010\u0012\u0006\u0010i\u001a\u00020\u0011\u0012\u0006\u0010j\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010\n\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010+\u001a\u00020,\u0012\b\u0010-\u001a\u0004\u0018\u00010\n\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u000102\u0012\b\u00103\u001a\u0004\u0018\u000104\u0012\b\u00105\u001a\u0004\u0018\u00010(\u0012\b\u00106\u001a\u0004\u0018\u000107\u0012\b\u00108\u001a\u0004\u0018\u000109\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\b\u0010<\u001a\u0004\u0018\u00010=\u0012\b\u0010>\u001a\u0004\u0018\u00010!\u0012\b\u0010?\u001a\u0004\u0018\u00010@\u0012\b\u0010A\u001a\u0004\u0018\u00010B\u0012\b\u0010C\u001a\u0004\u0018\u00010\b\u0012\b\u0010D\u001a\u0004\u0018\u00010E\u0012\b\u0010F\u001a\u0004\u0018\u00010G\u0012\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\u000e\u0012\b\u0010J\u001a\u0004\u0018\u00010\b\u0012\b\u0010K\u001a\u0004\u0018\u00010\n\u0012\b\u0010L\u001a\u0004\u0018\u00010\n\u0012\b\u0010M\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010N\u001a\u0004\u0018\u00010\b\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010Q\u001a\u0004\u0018\u00010R\u0012\b\u0010S\u001a\u0004\u0018\u00010\b\u0012\b\u0010T\u001a\u0004\u0018\u00010\b\u0012\b\u0010U\u001a\u0004\u0018\u00010\n\u0012\b\u0010V\u001a\u0004\u0018\u00010W\u0012\b\u0010X\u001a\u0004\u0018\u00010\b\u0012\b\u0010Y\u001a\u0004\u0018\u00010Z\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\\\u001a\u0004\u0018\u00010]\u0012\b\u0010^\u001a\u0004\u0018\u00010_\u0012\b\u0010`\u001a\u0004\u0018\u00010a\u0012\b\u0010b\u001a\u0004\u0018\u00010!\u0012\b\u0010c\u001a\u0004\u0018\u00010d\u0012\b\u0010e\u001a\u0004\u0018\u00010f\u0012\b\u0010k\u001a\u0004\u0018\u00010l¢\u0006\u0004\bg\u0010mJ\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0006HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010\u0093\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0019\u0010\u0094\u0002\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u0014HÆ\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0018HÆ\u0003J\n\u0010\u0097\u0002\u001a\u00020\u001aHÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010!HÆ\u0003J\u0010\u0010\u009e\u0002\u001a\b\u0012\u0004\u0012\u00020#0\u000eHÆ\u0003J\n\u0010\u009f\u0002\u001a\u00020%HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010¡\u0002\u001a\u00020(HÆ\u0003J\n\u0010¢\u0002\u001a\u00020(HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010¤\u0002\u001a\u00020,HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010¦\u0002\u001a\u00020\u0018HÆ\u0003J\n\u0010§\u0002\u001a\u000200HÆ\u0003J\n\u0010¨\u0002\u001a\u000202HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u000104HÆ\u0003J\n\u0010ª\u0002\u001a\u00020(HÆ\u0003J\n\u0010«\u0002\u001a\u000207HÆ\u0003J\n\u0010¬\u0002\u001a\u000209HÆ\u0003J\n\u0010\u00ad\u0002\u001a\u00020;HÆ\u0003J\n\u0010®\u0002\u001a\u00020=HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010!HÆ\u0003J\n\u0010°\u0002\u001a\u00020@HÆ\u0003J\n\u0010±\u0002\u001a\u00020BHÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\n\u0010³\u0002\u001a\u00020EHÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010GHÆ\u0003J\u0010\u0010µ\u0002\u001a\b\u0012\u0004\u0012\u00020I0\u000eHÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010·\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010¹\u0002\u001a\u00020\u0018HÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010RHÆ\u0003J\f\u0010¾\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010¿\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010À\u0002\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010Á\u0002\u001a\u00020WHÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010\bHÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010ZHÆ\u0003J\f\u0010Ä\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Å\u0002\u001a\u00020]HÆ\u0003J\n\u0010Æ\u0002\u001a\u00020_HÆ\u0003J\n\u0010Ç\u0002\u001a\u00020aHÆ\u0003J\f\u0010È\u0002\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010É\u0002\u001a\u0004\u0018\u00010dHÆ\u0003J\f\u0010Ê\u0002\u001a\u0004\u0018\u00010fHÆ\u0003Jç\u0005\u0010Ë\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0017\b\u0002\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010.\u001a\u00020\u00182\b\b\u0002\u0010/\u001a\u0002002\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u00020(2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010D\u001a\u00020E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\u000e\b\u0002\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u000e2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010M\u001a\u00020\u00182\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010V\u001a\u00020W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\\\u001a\u00020]2\b\b\u0002\u0010^\u001a\u00020_2\b\b\u0002\u0010`\u001a\u00020a2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010d2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010fHÆ\u0001J\u0015\u0010Ì\u0002\u001a\u00020,2\t\u0010Í\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Î\u0002\u001a\u00020\u0011HÖ\u0001J\n\u0010Ï\u0002\u001a\u00020\u0018HÖ\u0001J-\u0010Ð\u0002\u001a\u00030Ñ\u00022\u0007\u0010Ò\u0002\u001a\u00020\u00002\b\u0010Ó\u0002\u001a\u00030Ô\u00022\b\u0010Õ\u0002\u001a\u00030Ö\u0002H\u0001¢\u0006\u0003\b×\u0002R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u0010o\u001a\u0004\bs\u0010qR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bt\u0010o\u001a\u0004\bu\u0010vR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bw\u0010o\u001a\u0004\bx\u0010yR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bz\u0010o\u001a\u0004\b{\u0010|R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b}\u0010o\u001a\u0004\b~\u0010|R\u001f\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b\u007f\u0010o\u001a\u0005\b\u0080\u0001\u0010|R%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0081\u0001\u0010o\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R.\u0010\u0010\u001a\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\t0\u00148\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0001\u0010o\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0087\u0001\u0010o\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008a\u0001\u0010o\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001f\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008d\u0001\u0010o\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0090\u0001\u0010o\u001a\u0005\b\u0091\u0001\u0010yR \u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0092\u0001\u0010o\u001a\u0005\b\u0093\u0001\u0010yR \u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0094\u0001\u0010o\u001a\u0005\b\u0095\u0001\u0010yR \u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0096\u0001\u0010o\u001a\u0005\b\u0097\u0001\u0010yR \u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u0098\u0001\u0010o\u001a\u0005\b\u0099\u0001\u0010qR!\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009a\u0001\u0010o\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R%\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009d\u0001\u0010o\u001a\u0006\b\u009e\u0001\u0010\u0083\u0001R\u001f\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009f\u0001\u0010o\u001a\u0006\b \u0001\u0010¡\u0001R \u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b¢\u0001\u0010o\u001a\u0005\b£\u0001\u0010|R\u001f\u0010'\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¤\u0001\u0010o\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001f\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b§\u0001\u0010o\u001a\u0006\b¨\u0001\u0010¦\u0001R \u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b©\u0001\u0010o\u001a\u0005\bª\u0001\u0010yR\u001e\u0010+\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b«\u0001\u0010o\u001a\u0005\b+\u0010¬\u0001R \u0010-\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\b\u00ad\u0001\u0010o\u001a\u0005\b®\u0001\u0010|R\u001f\u0010.\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¯\u0001\u0010o\u001a\u0006\b°\u0001\u0010\u008c\u0001R\u001f\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b±\u0001\u0010o\u001a\u0006\b²\u0001\u0010³\u0001R\u001f\u00101\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b´\u0001\u0010o\u001a\u0006\bµ\u0001\u0010¶\u0001R!\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b·\u0001\u0010o\u001a\u0006\b¸\u0001\u0010¹\u0001R\u001f\u00105\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bº\u0001\u0010o\u001a\u0006\b»\u0001\u0010¦\u0001R\u001f\u00106\u001a\u0002078\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¼\u0001\u0010o\u001a\u0006\b½\u0001\u0010¾\u0001R\u001f\u00108\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¿\u0001\u0010o\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001f\u0010:\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÂ\u0001\u0010o\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001f\u0010<\u001a\u00020=8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÅ\u0001\u0010o\u001a\u0006\bÆ\u0001\u0010Ç\u0001R!\u0010>\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÈ\u0001\u0010o\u001a\u0006\bÉ\u0001\u0010\u009c\u0001R\u001f\u0010?\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÊ\u0001\u0010o\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001f\u0010A\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÍ\u0001\u0010o\u001a\u0006\bÎ\u0001\u0010Ï\u0001R \u0010C\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÐ\u0001\u0010o\u001a\u0005\bÑ\u0001\u0010yR\u001f\u0010D\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÒ\u0001\u0010o\u001a\u0006\bÓ\u0001\u0010Ô\u0001R!\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÕ\u0001\u0010o\u001a\u0006\bÖ\u0001\u0010×\u0001R%\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u000e8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bØ\u0001\u0010o\u001a\u0006\bÙ\u0001\u0010\u0083\u0001R \u0010J\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÚ\u0001\u0010o\u001a\u0005\bÛ\u0001\u0010yR \u0010K\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÜ\u0001\u0010o\u001a\u0005\bÝ\u0001\u0010|R \u0010L\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bÞ\u0001\u0010o\u001a\u0005\bß\u0001\u0010|R\u001f\u0010M\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bà\u0001\u0010o\u001a\u0006\bá\u0001\u0010\u008c\u0001R \u0010N\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bâ\u0001\u0010o\u001a\u0005\bã\u0001\u0010yR \u0010O\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bä\u0001\u0010o\u001a\u0005\bå\u0001\u0010qR \u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bæ\u0001\u0010o\u001a\u0005\bç\u0001\u0010qR!\u0010Q\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bè\u0001\u0010o\u001a\u0006\bé\u0001\u0010ê\u0001R \u0010S\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bë\u0001\u0010o\u001a\u0005\bì\u0001\u0010yR \u0010T\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bí\u0001\u0010o\u001a\u0005\bî\u0001\u0010yR \u0010U\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bï\u0001\u0010o\u001a\u0005\bð\u0001\u0010|R\u001f\u0010V\u001a\u00020W8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bñ\u0001\u0010o\u001a\u0006\bò\u0001\u0010ó\u0001R \u0010X\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bô\u0001\u0010o\u001a\u0005\bõ\u0001\u0010yR!\u0010Y\u001a\u0004\u0018\u00010Z8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bö\u0001\u0010o\u001a\u0006\b÷\u0001\u0010ø\u0001R \u0010[\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0000\u0012\u0005\bù\u0001\u0010o\u001a\u0005\bú\u0001\u0010qR\u001f\u0010\\\u001a\u00020]8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bû\u0001\u0010o\u001a\u0006\bü\u0001\u0010ý\u0001R\u001f\u0010^\u001a\u00020_8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bþ\u0001\u0010o\u001a\u0006\bÿ\u0001\u0010\u0080\u0002R\u001f\u0010`\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0081\u0002\u0010o\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010b\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0002\u0010o\u001a\u0006\b\u0085\u0002\u0010\u009c\u0001R!\u0010c\u001a\u0004\u0018\u00010d8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0086\u0002\u0010o\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R!\u0010e\u001a\u0004\u0018\u00010f8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0089\u0002\u0010o\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002¨\u0006Ú\u0002"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "order_id", "state", "Lrosetta/mainst/OrderStateDto;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/DecimalDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "last_transaction_at", "stop_triggered_at", "executions", "", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecutionDto;", "version", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "account_number", "", "side", "Lrosetta/mainst/SideDto;", "quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "last_trail_price", "instrument_id", "clearing_firm", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "legs", "Lcom/robinhood/rosetta/mainst/OrderUpdateLegDto;", "response_category", "Lrosetta/order/ResponseCategoryDto;", "update_created_at", "cancel_open_agent", "Lrosetta/order/AgentDto;", "cancel_close_agent", "last_trail_price_with_collar", "is_heartbeat", "", "last_sent_at", "mainst_shard_id", "order_created_service", "Lrosetta/order/ClientServiceDto;", "created_affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "created_agent", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "peg_type", "Lrosetta/order/PegTypeDto;", "market_hours", "Lrosetta/order/MarketHoursDto;", "response_text", "trigger", "Lrosetta/mainst/OrderTriggerDto;", "type", "Lrosetta/mainst/OrderTypeDto;", "executed_quantity", "waiting_category", "Lrosetta/order/WaitingCategoryDto;", "metadata", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "modifications", "Lcom/robinhood/rosetta/mainst/OrderModificationDto;", "estimated_notional", "cancel_open_time", "cancel_close_time", "symbol", "trailing_peg", "list_root_id", "replacement_order_id", "replaces_order", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "notional", "cancelled_notional", "cancel_triggering_time", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/order/AccountTypeDto;", "leverage", "reduce_only", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "bulk_event_id", "currency_denomination", "Lrosetta/order/CurrencyDenominationDto;", "margin_mode_v2", "Lrosetta/mainst/MarginModeDto;", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "position_id", "fractional_details", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "ipo_details", "Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/List;ILrosetta/mainst/RouteDto;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/util/List;Lrosetta/order/ResponseCategoryDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lrosetta/order/ClientServiceDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lrosetta/order/AgentDto;Lrosetta/mainst/TimeInForceDto;Lrosetta/mainst/InstrumentTypeDto;Lrosetta/order/PegTypeDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/order/WaitingCategoryDto;Lcom/robinhood/rosetta/mainst/OrderMetadataDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AccountTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/order/CurrencyDenominationDto;Lrosetta/mainst/MarginModeDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;)V", "seen0", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/List;ILrosetta/mainst/RouteDto;Ljava/lang/String;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/util/List;Lrosetta/order/ResponseCategoryDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/DecimalDto;ZLcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lrosetta/order/ClientServiceDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lrosetta/order/AgentDto;Lrosetta/mainst/TimeInForceDto;Lrosetta/mainst/InstrumentTypeDto;Lrosetta/order/PegTypeDto;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/OrderTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/order/WaitingCategoryDto;Lcom/robinhood/rosetta/mainst/OrderMetadataDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AccountTypeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/order/CurrencyDenominationDto;Lrosetta/mainst/MarginModeDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getOrder_id$annotations", "getOrder_id", "getState$annotations", "getState", "()Lrosetta/mainst/OrderStateDto;", "getCancelled_quantity$annotations", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getCreated_at$annotations", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getLast_transaction_at$annotations", "getLast_transaction_at", "getStop_triggered_at$annotations", "getStop_triggered_at", "getExecutions$annotations", "getExecutions", "()Ljava/util/List;", "getVersion$annotations", "getVersion", "()I", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getAccount_number$annotations", "getAccount_number", "()Ljava/lang/String;", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getQuantity$annotations", "getQuantity", "getPrice$annotations", "getPrice", "getStop_price$annotations", "getStop_price", "getLast_trail_price$annotations", "getLast_trail_price", "getInstrument_id$annotations", "getInstrument_id", "getClearing_firm$annotations", "getClearing_firm", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getLegs$annotations", "getLegs", "getResponse_category$annotations", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getUpdate_created_at$annotations", "getUpdate_created_at", "getCancel_open_agent$annotations", "getCancel_open_agent", "()Lrosetta/order/AgentDto;", "getCancel_close_agent$annotations", "getCancel_close_agent", "getLast_trail_price_with_collar$annotations", "getLast_trail_price_with_collar", "is_heartbeat$annotations", "()Z", "getLast_sent_at$annotations", "getLast_sent_at", "getMainst_shard_id$annotations", "getMainst_shard_id", "getOrder_created_service$annotations", "getOrder_created_service", "()Lrosetta/order/ClientServiceDto;", "getCreated_affiliate$annotations", "getCreated_affiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getService_shard_id$annotations", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getCreated_agent$annotations", "getCreated_agent", "getTime_in_force$annotations", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getInstrument_type$annotations", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getPeg_type$annotations", "getPeg_type", "()Lrosetta/order/PegTypeDto;", "getMarket_hours$annotations", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getResponse_text$annotations", "getResponse_text", "getTrigger$annotations", "getTrigger", "()Lrosetta/mainst/OrderTriggerDto;", "getType$annotations", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getExecuted_quantity$annotations", "getExecuted_quantity", "getWaiting_category$annotations", "getWaiting_category", "()Lrosetta/order/WaitingCategoryDto;", "getMetadata$annotations", "getMetadata", "()Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "getModifications$annotations", "getModifications", "getEstimated_notional$annotations", "getEstimated_notional", "getCancel_open_time$annotations", "getCancel_open_time", "getCancel_close_time$annotations", "getCancel_close_time", "getSymbol$annotations", "getSymbol", "getTrailing_peg$annotations", "getTrailing_peg", "getList_root_id$annotations", "getList_root_id", "getReplacement_order_id$annotations", "getReplacement_order_id", "getReplaces_order$annotations", "getReplaces_order", "()Lcom/robinhood/rosetta/mainst/ReplacesOrderDetailsDto;", "getNotional$annotations", "getNotional", "getCancelled_notional$annotations", "getCancelled_notional", "getCancel_triggering_time$annotations", "getCancel_triggering_time", "getAccount_type$annotations", "getAccount_type", "()Lrosetta/order/AccountTypeDto;", "getLeverage$annotations", "getLeverage", "getReduce_only$annotations", "getReduce_only", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getBulk_event_id$annotations", "getBulk_event_id", "getCurrency_denomination$annotations", "getCurrency_denomination", "()Lrosetta/order/CurrencyDenominationDto;", "getMargin_mode_v2$annotations", "getMargin_mode_v2", "()Lrosetta/mainst/MarginModeDto;", "getPosition_effect$annotations", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getPosition_id$annotations", "getPosition_id", "getFractional_details$annotations", "getFractional_details", "()Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "getIpo_details$annotations", "getIpo_details", "()Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final AccountTypeDto account_type;
        private final UUIDDto bulk_event_id;
        private final AgentDto cancel_close_agent;
        private final TimeDto cancel_close_time;
        private final AgentDto cancel_open_agent;
        private final TimeDto cancel_open_time;
        private final TimeDto cancel_triggering_time;
        private final DecimalDto cancelled_notional;
        private final DecimalDto cancelled_quantity;
        private final NullableStringDto clearing_firm;
        private final AffiliateDto created_affiliate;
        private final AgentDto created_agent;
        private final TimeDto created_at;
        private final CurrencyDenominationDto currency_denomination;
        private final DecimalDto estimated_notional;
        private final DecimalDto executed_quantity;
        private final List<OrderUpdateExecutionDto> executions;
        private final FractionalOrderDetailsDto fractional_details;
        private final UUIDDto id;
        private final UUIDDto instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final IPOOrderDetailsDto ipo_details;
        private final boolean is_heartbeat;
        private final TimeDto last_sent_at;
        private final DecimalDto last_trail_price;
        private final DecimalDto last_trail_price_with_collar;
        private final TimeDto last_transaction_at;
        private final List<OrderUpdateLegDto> legs;
        private final DecimalDto leverage;
        private final UUIDDto list_root_id;
        private final String mainst_shard_id;
        private final MarginModeDto margin_mode_v2;
        private final MarketHoursDto market_hours;
        private final OrderMetadataDto metadata;
        private final List<OrderModificationDto> modifications;
        private final DecimalDto notional;
        private final ClientServiceDto order_created_service;
        private final UUIDDto order_id;
        private final PegTypeDto peg_type;
        private final PositionEffectDto position_effect;
        private final NullableStringDto position_id;
        private final DecimalDto price;
        private final DecimalDto quantity;
        private final NullableBoolDto reduce_only;
        private final UUIDDto replacement_order_id;
        private final ReplacesOrderDetailsDto replaces_order;
        private final ResponseCategoryDto response_category;
        private final NullableStringDto response_text;
        private final RouteDto route;
        private final NullableIntDto service_shard_id;
        private final SideDto side;
        private final OrderStateDto state;
        private final DecimalDto stop_price;
        private final TimeDto stop_triggered_at;
        private final String symbol;
        private final TimeInForceDto time_in_force;
        private final DecimalDto trailing_peg;
        private final OrderTriggerDto trigger;
        private final OrderTypeDto type;
        private final TimeDto update_created_at;
        private final int version;
        private final WaitingCategoryDto waiting_category;

        public Surrogate() {
            this((UUIDDto) null, (UUIDDto) null, (OrderStateDto) null, (DecimalDto) null, (TimeDto) null, (TimeDto) null, (TimeDto) null, (List) null, 0, (RouteDto) null, (String) null, (SideDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (UUIDDto) null, (NullableStringDto) null, (List) null, (ResponseCategoryDto) null, (TimeDto) null, (AgentDto) null, (AgentDto) null, (DecimalDto) null, false, (TimeDto) null, (String) null, (ClientServiceDto) null, (AffiliateDto) null, (NullableIntDto) null, (AgentDto) null, (TimeInForceDto) null, (InstrumentTypeDto) null, (PegTypeDto) null, (MarketHoursDto) null, (NullableStringDto) null, (OrderTriggerDto) null, (OrderTypeDto) null, (DecimalDto) null, (WaitingCategoryDto) null, (OrderMetadataDto) null, (List) null, (DecimalDto) null, (TimeDto) null, (TimeDto) null, (String) null, (DecimalDto) null, (UUIDDto) null, (UUIDDto) null, (ReplacesOrderDetailsDto) null, (DecimalDto) null, (DecimalDto) null, (TimeDto) null, (AccountTypeDto) null, (DecimalDto) null, (NullableBoolDto) null, (UUIDDto) null, (CurrencyDenominationDto) null, (MarginModeDto) null, (PositionEffectDto) null, (NullableStringDto) null, (FractionalOrderDetailsDto) null, (IPOOrderDetailsDto) null, -1, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(OrderUpdateExecutionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(OrderUpdateLegDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(OrderModificationDto.Serializer.INSTANCE);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("bulkEventId")
        @JsonAnnotations2(names = {"bulk_event_id"})
        public static /* synthetic */ void getBulk_event_id$annotations() {
        }

        @SerialName("cancelCloseAgent")
        @JsonAnnotations2(names = {"cancel_close_agent"})
        public static /* synthetic */ void getCancel_close_agent$annotations() {
        }

        @SerialName("cancelCloseTime")
        @JsonAnnotations2(names = {"cancel_close_time"})
        public static /* synthetic */ void getCancel_close_time$annotations() {
        }

        @SerialName("cancelOpenAgent")
        @JsonAnnotations2(names = {"cancel_open_agent"})
        public static /* synthetic */ void getCancel_open_agent$annotations() {
        }

        @SerialName("cancelOpenTime")
        @JsonAnnotations2(names = {"cancel_open_time"})
        public static /* synthetic */ void getCancel_open_time$annotations() {
        }

        @SerialName("cancelTriggeringTime")
        @JsonAnnotations2(names = {"cancel_triggering_time"})
        public static /* synthetic */ void getCancel_triggering_time$annotations() {
        }

        @SerialName("cancelledNotional")
        @JsonAnnotations2(names = {"cancelled_notional"})
        public static /* synthetic */ void getCancelled_notional$annotations() {
        }

        @SerialName("cancelledQuantity")
        @JsonAnnotations2(names = {"cancelled_quantity"})
        public static /* synthetic */ void getCancelled_quantity$annotations() {
        }

        @SerialName("clearingFirm")
        @JsonAnnotations2(names = {"clearing_firm"})
        public static /* synthetic */ void getClearing_firm$annotations() {
        }

        @SerialName("createdAffiliate")
        @JsonAnnotations2(names = {"created_affiliate"})
        public static /* synthetic */ void getCreated_affiliate$annotations() {
        }

        @SerialName("createdAgent")
        @JsonAnnotations2(names = {"created_agent"})
        public static /* synthetic */ void getCreated_agent$annotations() {
        }

        @SerialName("createdAt")
        @JsonAnnotations2(names = {"created_at"})
        public static /* synthetic */ void getCreated_at$annotations() {
        }

        @SerialName("currencyDenomination")
        @JsonAnnotations2(names = {"currency_denomination"})
        public static /* synthetic */ void getCurrency_denomination$annotations() {
        }

        @SerialName("estimatedNotional")
        @JsonAnnotations2(names = {"estimated_notional"})
        public static /* synthetic */ void getEstimated_notional$annotations() {
        }

        @SerialName("executedQuantity")
        @JsonAnnotations2(names = {"executed_quantity"})
        public static /* synthetic */ void getExecuted_quantity$annotations() {
        }

        @SerialName("executions")
        @JsonAnnotations2(names = {"executions"})
        public static /* synthetic */ void getExecutions$annotations() {
        }

        @SerialName("fractionalDetails")
        @JsonAnnotations2(names = {"fractional_details"})
        public static /* synthetic */ void getFractional_details$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("instrumentId")
        @JsonAnnotations2(names = {"instrument_id"})
        public static /* synthetic */ void getInstrument_id$annotations() {
        }

        @SerialName("instrumentType")
        @JsonAnnotations2(names = {"instrument_type"})
        public static /* synthetic */ void getInstrument_type$annotations() {
        }

        @SerialName("ipoDetails")
        @JsonAnnotations2(names = {"ipo_details"})
        public static /* synthetic */ void getIpo_details$annotations() {
        }

        @SerialName("lastSentAt")
        @JsonAnnotations2(names = {"last_sent_at"})
        public static /* synthetic */ void getLast_sent_at$annotations() {
        }

        @SerialName("lastTrailPrice")
        @JsonAnnotations2(names = {"last_trail_price"})
        public static /* synthetic */ void getLast_trail_price$annotations() {
        }

        @SerialName("lastTrailPriceWithCollar")
        @JsonAnnotations2(names = {"last_trail_price_with_collar"})
        public static /* synthetic */ void getLast_trail_price_with_collar$annotations() {
        }

        @SerialName("lastTransactionAt")
        @JsonAnnotations2(names = {"last_transaction_at"})
        public static /* synthetic */ void getLast_transaction_at$annotations() {
        }

        @SerialName("legs")
        @JsonAnnotations2(names = {"legs"})
        public static /* synthetic */ void getLegs$annotations() {
        }

        @SerialName("leverage")
        @JsonAnnotations2(names = {"leverage"})
        public static /* synthetic */ void getLeverage$annotations() {
        }

        @SerialName("listRootId")
        @JsonAnnotations2(names = {"list_root_id"})
        public static /* synthetic */ void getList_root_id$annotations() {
        }

        @SerialName("mainstShardId")
        @JsonAnnotations2(names = {"mainst_shard_id"})
        public static /* synthetic */ void getMainst_shard_id$annotations() {
        }

        @SerialName("marginModeV2")
        @JsonAnnotations2(names = {"margin_mode_v2"})
        public static /* synthetic */ void getMargin_mode_v2$annotations() {
        }

        @SerialName("marketHours")
        @JsonAnnotations2(names = {"market_hours"})
        public static /* synthetic */ void getMarket_hours$annotations() {
        }

        @SerialName("metadata")
        @JsonAnnotations2(names = {"metadata"})
        public static /* synthetic */ void getMetadata$annotations() {
        }

        @SerialName("modifications")
        @JsonAnnotations2(names = {"modifications"})
        public static /* synthetic */ void getModifications$annotations() {
        }

        @SerialName("notional")
        @JsonAnnotations2(names = {"notional"})
        public static /* synthetic */ void getNotional$annotations() {
        }

        @SerialName("orderCreatedService")
        @JsonAnnotations2(names = {"order_created_service"})
        public static /* synthetic */ void getOrder_created_service$annotations() {
        }

        @SerialName("orderId")
        @JsonAnnotations2(names = {"order_id"})
        public static /* synthetic */ void getOrder_id$annotations() {
        }

        @SerialName("pegType")
        @JsonAnnotations2(names = {"peg_type"})
        public static /* synthetic */ void getPeg_type$annotations() {
        }

        @SerialName("positionEffect")
        @JsonAnnotations2(names = {"position_effect"})
        public static /* synthetic */ void getPosition_effect$annotations() {
        }

        @SerialName("positionId")
        @JsonAnnotations2(names = {"position_id"})
        public static /* synthetic */ void getPosition_id$annotations() {
        }

        @SerialName(AnalyticsStrings.TAG_SORT_ORDER_PRICE)
        @JsonAnnotations2(names = {AnalyticsStrings.TAG_SORT_ORDER_PRICE})
        public static /* synthetic */ void getPrice$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("reduceOnly")
        @JsonAnnotations2(names = {"reduce_only"})
        public static /* synthetic */ void getReduce_only$annotations() {
        }

        @SerialName("replacementOrderId")
        @JsonAnnotations2(names = {"replacement_order_id"})
        public static /* synthetic */ void getReplacement_order_id$annotations() {
        }

        @SerialName("replacesOrder")
        @JsonAnnotations2(names = {"replaces_order"})
        public static /* synthetic */ void getReplaces_order$annotations() {
        }

        @SerialName("responseCategory")
        @JsonAnnotations2(names = {"response_category"})
        public static /* synthetic */ void getResponse_category$annotations() {
        }

        @SerialName("responseText")
        @JsonAnnotations2(names = {"response_text"})
        public static /* synthetic */ void getResponse_text$annotations() {
        }

        @SerialName(PlaceTypes.ROUTE)
        @JsonAnnotations2(names = {PlaceTypes.ROUTE})
        public static /* synthetic */ void getRoute$annotations() {
        }

        @SerialName("serviceShardId")
        @JsonAnnotations2(names = {"service_shard_id"})
        public static /* synthetic */ void getService_shard_id$annotations() {
        }

        @SerialName("side")
        @JsonAnnotations2(names = {"side"})
        public static /* synthetic */ void getSide$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("stopPrice")
        @JsonAnnotations2(names = {"stop_price"})
        public static /* synthetic */ void getStop_price$annotations() {
        }

        @SerialName("stopTriggeredAt")
        @JsonAnnotations2(names = {"stop_triggered_at"})
        public static /* synthetic */ void getStop_triggered_at$annotations() {
        }

        @SerialName("symbol")
        @JsonAnnotations2(names = {"symbol"})
        public static /* synthetic */ void getSymbol$annotations() {
        }

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("trailingPeg")
        @JsonAnnotations2(names = {"trailing_peg"})
        public static /* synthetic */ void getTrailing_peg$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        @SerialName("updateCreatedAt")
        @JsonAnnotations2(names = {"update_created_at"})
        public static /* synthetic */ void getUpdate_created_at$annotations() {
        }

        @SerialName("version")
        @JsonAnnotations2(names = {"version"})
        public static /* synthetic */ void getVersion$annotations() {
        }

        @SerialName("waitingCategory")
        @JsonAnnotations2(names = {"waiting_category"})
        public static /* synthetic */ void getWaiting_category$annotations() {
        }

        @SerialName("isHeartbeat")
        @JsonAnnotations2(names = {"is_heartbeat"})
        public static /* synthetic */ void is_heartbeat$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component11, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component12, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component13, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component14, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component15, reason: from getter */
        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component16, reason: from getter */
        public final DecimalDto getLast_trail_price() {
            return this.last_trail_price;
        }

        /* renamed from: component17, reason: from getter */
        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        /* renamed from: component18, reason: from getter */
        public final NullableStringDto getClearing_firm() {
            return this.clearing_firm;
        }

        public final List<OrderUpdateLegDto> component19() {
            return this.legs;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        /* renamed from: component20, reason: from getter */
        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        /* renamed from: component21, reason: from getter */
        public final TimeDto getUpdate_created_at() {
            return this.update_created_at;
        }

        /* renamed from: component22, reason: from getter */
        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        /* renamed from: component23, reason: from getter */
        public final AgentDto getCancel_close_agent() {
            return this.cancel_close_agent;
        }

        /* renamed from: component24, reason: from getter */
        public final DecimalDto getLast_trail_price_with_collar() {
            return this.last_trail_price_with_collar;
        }

        /* renamed from: component25, reason: from getter */
        public final boolean getIs_heartbeat() {
            return this.is_heartbeat;
        }

        /* renamed from: component26, reason: from getter */
        public final TimeDto getLast_sent_at() {
            return this.last_sent_at;
        }

        /* renamed from: component27, reason: from getter */
        public final String getMainst_shard_id() {
            return this.mainst_shard_id;
        }

        /* renamed from: component28, reason: from getter */
        public final ClientServiceDto getOrder_created_service() {
            return this.order_created_service;
        }

        /* renamed from: component29, reason: from getter */
        public final AffiliateDto getCreated_affiliate() {
            return this.created_affiliate;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderStateDto getState() {
            return this.state;
        }

        /* renamed from: component30, reason: from getter */
        public final NullableIntDto getService_shard_id() {
            return this.service_shard_id;
        }

        /* renamed from: component31, reason: from getter */
        public final AgentDto getCreated_agent() {
            return this.created_agent;
        }

        /* renamed from: component32, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component33, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        /* renamed from: component34, reason: from getter */
        public final PegTypeDto getPeg_type() {
            return this.peg_type;
        }

        /* renamed from: component35, reason: from getter */
        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        /* renamed from: component36, reason: from getter */
        public final NullableStringDto getResponse_text() {
            return this.response_text;
        }

        /* renamed from: component37, reason: from getter */
        public final OrderTriggerDto getTrigger() {
            return this.trigger;
        }

        /* renamed from: component38, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component39, reason: from getter */
        public final DecimalDto getExecuted_quantity() {
            return this.executed_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        /* renamed from: component40, reason: from getter */
        public final WaitingCategoryDto getWaiting_category() {
            return this.waiting_category;
        }

        /* renamed from: component41, reason: from getter */
        public final OrderMetadataDto getMetadata() {
            return this.metadata;
        }

        public final List<OrderModificationDto> component42() {
            return this.modifications;
        }

        /* renamed from: component43, reason: from getter */
        public final DecimalDto getEstimated_notional() {
            return this.estimated_notional;
        }

        /* renamed from: component44, reason: from getter */
        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        /* renamed from: component45, reason: from getter */
        public final TimeDto getCancel_close_time() {
            return this.cancel_close_time;
        }

        /* renamed from: component46, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component47, reason: from getter */
        public final DecimalDto getTrailing_peg() {
            return this.trailing_peg;
        }

        /* renamed from: component48, reason: from getter */
        public final UUIDDto getList_root_id() {
            return this.list_root_id;
        }

        /* renamed from: component49, reason: from getter */
        public final UUIDDto getReplacement_order_id() {
            return this.replacement_order_id;
        }

        /* renamed from: component5, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component50, reason: from getter */
        public final ReplacesOrderDetailsDto getReplaces_order() {
            return this.replaces_order;
        }

        /* renamed from: component51, reason: from getter */
        public final DecimalDto getNotional() {
            return this.notional;
        }

        /* renamed from: component52, reason: from getter */
        public final DecimalDto getCancelled_notional() {
            return this.cancelled_notional;
        }

        /* renamed from: component53, reason: from getter */
        public final TimeDto getCancel_triggering_time() {
            return this.cancel_triggering_time;
        }

        /* renamed from: component54, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component55, reason: from getter */
        public final DecimalDto getLeverage() {
            return this.leverage;
        }

        /* renamed from: component56, reason: from getter */
        public final NullableBoolDto getReduce_only() {
            return this.reduce_only;
        }

        /* renamed from: component57, reason: from getter */
        public final UUIDDto getBulk_event_id() {
            return this.bulk_event_id;
        }

        /* renamed from: component58, reason: from getter */
        public final CurrencyDenominationDto getCurrency_denomination() {
            return this.currency_denomination;
        }

        /* renamed from: component59, reason: from getter */
        public final MarginModeDto getMargin_mode_v2() {
            return this.margin_mode_v2;
        }

        /* renamed from: component6, reason: from getter */
        public final TimeDto getLast_transaction_at() {
            return this.last_transaction_at;
        }

        /* renamed from: component60, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component61, reason: from getter */
        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        /* renamed from: component62, reason: from getter */
        public final FractionalOrderDetailsDto getFractional_details() {
            return this.fractional_details;
        }

        /* renamed from: component63, reason: from getter */
        public final IPOOrderDetailsDto getIpo_details() {
            return this.ipo_details;
        }

        /* renamed from: component7, reason: from getter */
        public final TimeDto getStop_triggered_at() {
            return this.stop_triggered_at;
        }

        public final List<OrderUpdateExecutionDto> component8() {
            return this.executions;
        }

        /* renamed from: component9, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public final Surrogate copy(UUIDDto id, UUIDDto order_id, OrderStateDto state, DecimalDto cancelled_quantity, TimeDto created_at, TimeDto last_transaction_at, TimeDto stop_triggered_at, List<OrderUpdateExecutionDto> executions, int version, RouteDto route, String account_number, SideDto side, DecimalDto quantity, DecimalDto price, DecimalDto stop_price, DecimalDto last_trail_price, UUIDDto instrument_id, NullableStringDto clearing_firm, List<OrderUpdateLegDto> legs, ResponseCategoryDto response_category, TimeDto update_created_at, AgentDto cancel_open_agent, AgentDto cancel_close_agent, DecimalDto last_trail_price_with_collar, boolean is_heartbeat, TimeDto last_sent_at, String mainst_shard_id, ClientServiceDto order_created_service, AffiliateDto created_affiliate, NullableIntDto service_shard_id, AgentDto created_agent, TimeInForceDto time_in_force, InstrumentTypeDto instrument_type, PegTypeDto peg_type, MarketHoursDto market_hours, NullableStringDto response_text, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto executed_quantity, WaitingCategoryDto waiting_category, OrderMetadataDto metadata, List<OrderModificationDto> modifications, DecimalDto estimated_notional, TimeDto cancel_open_time, TimeDto cancel_close_time, String symbol, DecimalDto trailing_peg, UUIDDto list_root_id, UUIDDto replacement_order_id, ReplacesOrderDetailsDto replaces_order, DecimalDto notional, DecimalDto cancelled_notional, TimeDto cancel_triggering_time, AccountTypeDto account_type, DecimalDto leverage, NullableBoolDto reduce_only, UUIDDto bulk_event_id, CurrencyDenominationDto currency_denomination, MarginModeDto margin_mode_v2, PositionEffectDto position_effect, NullableStringDto position_id, FractionalOrderDetailsDto fractional_details, IPOOrderDetailsDto ipo_details) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
            Intrinsics.checkNotNullParameter(mainst_shard_id, "mainst_shard_id");
            Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
            Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
            Intrinsics.checkNotNullParameter(created_agent, "created_agent");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(peg_type, "peg_type");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
            Intrinsics.checkNotNullParameter(modifications, "modifications");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
            Intrinsics.checkNotNullParameter(margin_mode_v2, "margin_mode_v2");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            return new Surrogate(id, order_id, state, cancelled_quantity, created_at, last_transaction_at, stop_triggered_at, executions, version, route, account_number, side, quantity, price, stop_price, last_trail_price, instrument_id, clearing_firm, legs, response_category, update_created_at, cancel_open_agent, cancel_close_agent, last_trail_price_with_collar, is_heartbeat, last_sent_at, mainst_shard_id, order_created_service, created_affiliate, service_shard_id, created_agent, time_in_force, instrument_type, peg_type, market_hours, response_text, trigger, type2, executed_quantity, waiting_category, metadata, modifications, estimated_notional, cancel_open_time, cancel_close_time, symbol, trailing_peg, list_root_id, replacement_order_id, replaces_order, notional, cancelled_notional, cancel_triggering_time, account_type, leverage, reduce_only, bulk_event_id, currency_denomination, margin_mode_v2, position_effect, position_id, fractional_details, ipo_details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.order_id, surrogate.order_id) && this.state == surrogate.state && Intrinsics.areEqual(this.cancelled_quantity, surrogate.cancelled_quantity) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.last_transaction_at, surrogate.last_transaction_at) && Intrinsics.areEqual(this.stop_triggered_at, surrogate.stop_triggered_at) && Intrinsics.areEqual(this.executions, surrogate.executions) && this.version == surrogate.version && this.route == surrogate.route && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.side == surrogate.side && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.last_trail_price, surrogate.last_trail_price) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.clearing_firm, surrogate.clearing_firm) && Intrinsics.areEqual(this.legs, surrogate.legs) && this.response_category == surrogate.response_category && Intrinsics.areEqual(this.update_created_at, surrogate.update_created_at) && this.cancel_open_agent == surrogate.cancel_open_agent && this.cancel_close_agent == surrogate.cancel_close_agent && Intrinsics.areEqual(this.last_trail_price_with_collar, surrogate.last_trail_price_with_collar) && this.is_heartbeat == surrogate.is_heartbeat && Intrinsics.areEqual(this.last_sent_at, surrogate.last_sent_at) && Intrinsics.areEqual(this.mainst_shard_id, surrogate.mainst_shard_id) && this.order_created_service == surrogate.order_created_service && this.created_affiliate == surrogate.created_affiliate && Intrinsics.areEqual(this.service_shard_id, surrogate.service_shard_id) && this.created_agent == surrogate.created_agent && this.time_in_force == surrogate.time_in_force && this.instrument_type == surrogate.instrument_type && this.peg_type == surrogate.peg_type && this.market_hours == surrogate.market_hours && Intrinsics.areEqual(this.response_text, surrogate.response_text) && this.trigger == surrogate.trigger && this.type == surrogate.type && Intrinsics.areEqual(this.executed_quantity, surrogate.executed_quantity) && this.waiting_category == surrogate.waiting_category && Intrinsics.areEqual(this.metadata, surrogate.metadata) && Intrinsics.areEqual(this.modifications, surrogate.modifications) && Intrinsics.areEqual(this.estimated_notional, surrogate.estimated_notional) && Intrinsics.areEqual(this.cancel_open_time, surrogate.cancel_open_time) && Intrinsics.areEqual(this.cancel_close_time, surrogate.cancel_close_time) && Intrinsics.areEqual(this.symbol, surrogate.symbol) && Intrinsics.areEqual(this.trailing_peg, surrogate.trailing_peg) && Intrinsics.areEqual(this.list_root_id, surrogate.list_root_id) && Intrinsics.areEqual(this.replacement_order_id, surrogate.replacement_order_id) && Intrinsics.areEqual(this.replaces_order, surrogate.replaces_order) && Intrinsics.areEqual(this.notional, surrogate.notional) && Intrinsics.areEqual(this.cancelled_notional, surrogate.cancelled_notional) && Intrinsics.areEqual(this.cancel_triggering_time, surrogate.cancel_triggering_time) && this.account_type == surrogate.account_type && Intrinsics.areEqual(this.leverage, surrogate.leverage) && Intrinsics.areEqual(this.reduce_only, surrogate.reduce_only) && Intrinsics.areEqual(this.bulk_event_id, surrogate.bulk_event_id) && this.currency_denomination == surrogate.currency_denomination && this.margin_mode_v2 == surrogate.margin_mode_v2 && this.position_effect == surrogate.position_effect && Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.fractional_details, surrogate.fractional_details) && Intrinsics.areEqual(this.ipo_details, surrogate.ipo_details);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.order_id;
            int iHashCode2 = (((iHashCode + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31) + this.state.hashCode()) * 31;
            DecimalDto decimalDto = this.cancelled_quantity;
            int iHashCode3 = (iHashCode2 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            TimeDto timeDto = this.created_at;
            int iHashCode4 = (iHashCode3 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.last_transaction_at;
            int iHashCode5 = (iHashCode4 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31;
            TimeDto timeDto3 = this.stop_triggered_at;
            int iHashCode6 = (((((((((((iHashCode5 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31) + this.executions.hashCode()) * 31) + Integer.hashCode(this.version)) * 31) + this.route.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.side.hashCode()) * 31;
            DecimalDto decimalDto2 = this.quantity;
            int iHashCode7 = (iHashCode6 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.price;
            int iHashCode8 = (iHashCode7 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.stop_price;
            int iHashCode9 = (iHashCode8 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31;
            DecimalDto decimalDto5 = this.last_trail_price;
            int iHashCode10 = (iHashCode9 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            UUIDDto uUIDDto3 = this.instrument_id;
            int iHashCode11 = (iHashCode10 + (uUIDDto3 == null ? 0 : uUIDDto3.hashCode())) * 31;
            NullableStringDto nullableStringDto = this.clearing_firm;
            int iHashCode12 = (((((iHashCode11 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31) + this.legs.hashCode()) * 31) + this.response_category.hashCode()) * 31;
            TimeDto timeDto4 = this.update_created_at;
            int iHashCode13 = (((((iHashCode12 + (timeDto4 == null ? 0 : timeDto4.hashCode())) * 31) + this.cancel_open_agent.hashCode()) * 31) + this.cancel_close_agent.hashCode()) * 31;
            DecimalDto decimalDto6 = this.last_trail_price_with_collar;
            int iHashCode14 = (((iHashCode13 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31) + Boolean.hashCode(this.is_heartbeat)) * 31;
            TimeDto timeDto5 = this.last_sent_at;
            int iHashCode15 = (((((((iHashCode14 + (timeDto5 == null ? 0 : timeDto5.hashCode())) * 31) + this.mainst_shard_id.hashCode()) * 31) + this.order_created_service.hashCode()) * 31) + this.created_affiliate.hashCode()) * 31;
            NullableIntDto nullableIntDto = this.service_shard_id;
            int iHashCode16 = (((((((((((iHashCode15 + (nullableIntDto == null ? 0 : nullableIntDto.hashCode())) * 31) + this.created_agent.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + this.instrument_type.hashCode()) * 31) + this.peg_type.hashCode()) * 31) + this.market_hours.hashCode()) * 31;
            NullableStringDto nullableStringDto2 = this.response_text;
            int iHashCode17 = (((((iHashCode16 + (nullableStringDto2 == null ? 0 : nullableStringDto2.hashCode())) * 31) + this.trigger.hashCode()) * 31) + this.type.hashCode()) * 31;
            DecimalDto decimalDto7 = this.executed_quantity;
            int iHashCode18 = (((iHashCode17 + (decimalDto7 == null ? 0 : decimalDto7.hashCode())) * 31) + this.waiting_category.hashCode()) * 31;
            OrderMetadataDto orderMetadataDto = this.metadata;
            int iHashCode19 = (((iHashCode18 + (orderMetadataDto == null ? 0 : orderMetadataDto.hashCode())) * 31) + this.modifications.hashCode()) * 31;
            DecimalDto decimalDto8 = this.estimated_notional;
            int iHashCode20 = (iHashCode19 + (decimalDto8 == null ? 0 : decimalDto8.hashCode())) * 31;
            TimeDto timeDto6 = this.cancel_open_time;
            int iHashCode21 = (iHashCode20 + (timeDto6 == null ? 0 : timeDto6.hashCode())) * 31;
            TimeDto timeDto7 = this.cancel_close_time;
            int iHashCode22 = (((iHashCode21 + (timeDto7 == null ? 0 : timeDto7.hashCode())) * 31) + this.symbol.hashCode()) * 31;
            DecimalDto decimalDto9 = this.trailing_peg;
            int iHashCode23 = (iHashCode22 + (decimalDto9 == null ? 0 : decimalDto9.hashCode())) * 31;
            UUIDDto uUIDDto4 = this.list_root_id;
            int iHashCode24 = (iHashCode23 + (uUIDDto4 == null ? 0 : uUIDDto4.hashCode())) * 31;
            UUIDDto uUIDDto5 = this.replacement_order_id;
            int iHashCode25 = (iHashCode24 + (uUIDDto5 == null ? 0 : uUIDDto5.hashCode())) * 31;
            ReplacesOrderDetailsDto replacesOrderDetailsDto = this.replaces_order;
            int iHashCode26 = (iHashCode25 + (replacesOrderDetailsDto == null ? 0 : replacesOrderDetailsDto.hashCode())) * 31;
            DecimalDto decimalDto10 = this.notional;
            int iHashCode27 = (iHashCode26 + (decimalDto10 == null ? 0 : decimalDto10.hashCode())) * 31;
            DecimalDto decimalDto11 = this.cancelled_notional;
            int iHashCode28 = (iHashCode27 + (decimalDto11 == null ? 0 : decimalDto11.hashCode())) * 31;
            TimeDto timeDto8 = this.cancel_triggering_time;
            int iHashCode29 = (((iHashCode28 + (timeDto8 == null ? 0 : timeDto8.hashCode())) * 31) + this.account_type.hashCode()) * 31;
            DecimalDto decimalDto12 = this.leverage;
            int iHashCode30 = (iHashCode29 + (decimalDto12 == null ? 0 : decimalDto12.hashCode())) * 31;
            NullableBoolDto nullableBoolDto = this.reduce_only;
            int iHashCode31 = (iHashCode30 + (nullableBoolDto == null ? 0 : nullableBoolDto.hashCode())) * 31;
            UUIDDto uUIDDto6 = this.bulk_event_id;
            int iHashCode32 = (((((((iHashCode31 + (uUIDDto6 == null ? 0 : uUIDDto6.hashCode())) * 31) + this.currency_denomination.hashCode()) * 31) + this.margin_mode_v2.hashCode()) * 31) + this.position_effect.hashCode()) * 31;
            NullableStringDto nullableStringDto3 = this.position_id;
            int iHashCode33 = (iHashCode32 + (nullableStringDto3 == null ? 0 : nullableStringDto3.hashCode())) * 31;
            FractionalOrderDetailsDto fractionalOrderDetailsDto = this.fractional_details;
            int iHashCode34 = (iHashCode33 + (fractionalOrderDetailsDto == null ? 0 : fractionalOrderDetailsDto.hashCode())) * 31;
            IPOOrderDetailsDto iPOOrderDetailsDto = this.ipo_details;
            return iHashCode34 + (iPOOrderDetailsDto != null ? iPOOrderDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", order_id=" + this.order_id + ", state=" + this.state + ", cancelled_quantity=" + this.cancelled_quantity + ", created_at=" + this.created_at + ", last_transaction_at=" + this.last_transaction_at + ", stop_triggered_at=" + this.stop_triggered_at + ", executions=" + this.executions + ", version=" + this.version + ", route=" + this.route + ", account_number=" + this.account_number + ", side=" + this.side + ", quantity=" + this.quantity + ", price=" + this.price + ", stop_price=" + this.stop_price + ", last_trail_price=" + this.last_trail_price + ", instrument_id=" + this.instrument_id + ", clearing_firm=" + this.clearing_firm + ", legs=" + this.legs + ", response_category=" + this.response_category + ", update_created_at=" + this.update_created_at + ", cancel_open_agent=" + this.cancel_open_agent + ", cancel_close_agent=" + this.cancel_close_agent + ", last_trail_price_with_collar=" + this.last_trail_price_with_collar + ", is_heartbeat=" + this.is_heartbeat + ", last_sent_at=" + this.last_sent_at + ", mainst_shard_id=" + this.mainst_shard_id + ", order_created_service=" + this.order_created_service + ", created_affiliate=" + this.created_affiliate + ", service_shard_id=" + this.service_shard_id + ", created_agent=" + this.created_agent + ", time_in_force=" + this.time_in_force + ", instrument_type=" + this.instrument_type + ", peg_type=" + this.peg_type + ", market_hours=" + this.market_hours + ", response_text=" + this.response_text + ", trigger=" + this.trigger + ", type=" + this.type + ", executed_quantity=" + this.executed_quantity + ", waiting_category=" + this.waiting_category + ", metadata=" + this.metadata + ", modifications=" + this.modifications + ", estimated_notional=" + this.estimated_notional + ", cancel_open_time=" + this.cancel_open_time + ", cancel_close_time=" + this.cancel_close_time + ", symbol=" + this.symbol + ", trailing_peg=" + this.trailing_peg + ", list_root_id=" + this.list_root_id + ", replacement_order_id=" + this.replacement_order_id + ", replaces_order=" + this.replaces_order + ", notional=" + this.notional + ", cancelled_notional=" + this.cancelled_notional + ", cancel_triggering_time=" + this.cancel_triggering_time + ", account_type=" + this.account_type + ", leverage=" + this.leverage + ", reduce_only=" + this.reduce_only + ", bulk_event_id=" + this.bulk_event_id + ", currency_denomination=" + this.currency_denomination + ", margin_mode_v2=" + this.margin_mode_v2 + ", position_effect=" + this.position_effect + ", position_id=" + this.position_id + ", fractional_details=" + this.fractional_details + ", ipo_details=" + this.ipo_details + ")";
        }

        /* compiled from: OrderUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderUpdateDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderUpdateDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderUpdateDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderUpdateDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderUpdateDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderUpdateDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderUpdateDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, int i2, UUIDDto uUIDDto, UUIDDto uUIDDto2, OrderStateDto orderStateDto, DecimalDto decimalDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, int i3, RouteDto routeDto, String str, SideDto sideDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, UUIDDto uUIDDto3, NullableStringDto nullableStringDto, List list2, ResponseCategoryDto responseCategoryDto, TimeDto timeDto4, AgentDto agentDto, AgentDto agentDto2, DecimalDto decimalDto6, boolean z, TimeDto timeDto5, String str2, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, AgentDto agentDto3, TimeInForceDto timeInForceDto, InstrumentTypeDto instrumentTypeDto, PegTypeDto pegTypeDto, MarketHoursDto marketHoursDto, NullableStringDto nullableStringDto2, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto7, WaitingCategoryDto waitingCategoryDto, OrderMetadataDto orderMetadataDto, List list3, DecimalDto decimalDto8, TimeDto timeDto6, TimeDto timeDto7, String str3, DecimalDto decimalDto9, UUIDDto uUIDDto4, UUIDDto uUIDDto5, ReplacesOrderDetailsDto replacesOrderDetailsDto, DecimalDto decimalDto10, DecimalDto decimalDto11, TimeDto timeDto8, AccountTypeDto accountTypeDto, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto6, CurrencyDenominationDto currencyDenominationDto, MarginModeDto marginModeDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto3, FractionalOrderDetailsDto fractionalOrderDetailsDto, IPOOrderDetailsDto iPOOrderDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.order_id = null;
            } else {
                this.order_id = uUIDDto2;
            }
            if ((i & 4) == 0) {
                this.state = OrderStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = orderStateDto;
            }
            if ((i & 8) == 0) {
                this.cancelled_quantity = null;
            } else {
                this.cancelled_quantity = decimalDto;
            }
            if ((i & 16) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto;
            }
            if ((i & 32) == 0) {
                this.last_transaction_at = null;
            } else {
                this.last_transaction_at = timeDto2;
            }
            if ((i & 64) == 0) {
                this.stop_triggered_at = null;
            } else {
                this.stop_triggered_at = timeDto3;
            }
            if ((i & 128) == 0) {
                this.executions = CollectionsKt.emptyList();
            } else {
                this.executions = list;
            }
            if ((i & 256) == 0) {
                this.version = 0;
            } else {
                this.version = i3;
            }
            this.route = (i & 512) == 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
            if ((i & 1024) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            this.side = (i & 2048) == 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            if ((i & 4096) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto2;
            }
            if ((i & 8192) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto3;
            }
            if ((i & 16384) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = decimalDto4;
            }
            if ((i & 32768) == 0) {
                this.last_trail_price = null;
            } else {
                this.last_trail_price = decimalDto5;
            }
            if ((i & 65536) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = uUIDDto3;
            }
            if ((i & 131072) == 0) {
                this.clearing_firm = null;
            } else {
                this.clearing_firm = nullableStringDto;
            }
            this.legs = (i & 262144) == 0 ? CollectionsKt.emptyList() : list2;
            this.response_category = (524288 & i) == 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto;
            if ((1048576 & i) == 0) {
                this.update_created_at = null;
            } else {
                this.update_created_at = timeDto4;
            }
            this.cancel_open_agent = (2097152 & i) == 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto;
            this.cancel_close_agent = (4194304 & i) == 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2;
            if ((8388608 & i) == 0) {
                this.last_trail_price_with_collar = null;
            } else {
                this.last_trail_price_with_collar = decimalDto6;
            }
            this.is_heartbeat = (16777216 & i) != 0 ? z : false;
            if ((33554432 & i) == 0) {
                this.last_sent_at = null;
            } else {
                this.last_sent_at = timeDto5;
            }
            if ((67108864 & i) == 0) {
                this.mainst_shard_id = "";
            } else {
                this.mainst_shard_id = str2;
            }
            this.order_created_service = (134217728 & i) == 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto;
            this.created_affiliate = (268435456 & i) == 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto;
            if ((536870912 & i) == 0) {
                this.service_shard_id = null;
            } else {
                this.service_shard_id = nullableIntDto;
            }
            this.created_agent = (1073741824 & i) == 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto3;
            this.time_in_force = (i & Integer.MIN_VALUE) == 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
            this.instrument_type = (i2 & 1) == 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto;
            this.peg_type = (i2 & 2) == 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto;
            this.market_hours = (i2 & 4) == 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto;
            if ((i2 & 8) == 0) {
                this.response_text = null;
            } else {
                this.response_text = nullableStringDto2;
            }
            this.trigger = (i2 & 16) == 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto;
            this.type = (i2 & 32) == 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto;
            if ((i2 & 64) == 0) {
                this.executed_quantity = null;
            } else {
                this.executed_quantity = decimalDto7;
            }
            this.waiting_category = (i2 & 128) == 0 ? WaitingCategoryDto.INSTANCE.getZeroValue() : waitingCategoryDto;
            if ((i2 & 256) == 0) {
                this.metadata = null;
            } else {
                this.metadata = orderMetadataDto;
            }
            this.modifications = (i2 & 512) == 0 ? CollectionsKt.emptyList() : list3;
            if ((i2 & 1024) == 0) {
                this.estimated_notional = null;
            } else {
                this.estimated_notional = decimalDto8;
            }
            if ((i2 & 2048) == 0) {
                this.cancel_open_time = null;
            } else {
                this.cancel_open_time = timeDto6;
            }
            if ((i2 & 4096) == 0) {
                this.cancel_close_time = null;
            } else {
                this.cancel_close_time = timeDto7;
            }
            if ((i2 & 8192) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i2 & 16384) == 0) {
                this.trailing_peg = null;
            } else {
                this.trailing_peg = decimalDto9;
            }
            if ((i2 & 32768) == 0) {
                this.list_root_id = null;
            } else {
                this.list_root_id = uUIDDto4;
            }
            if ((i2 & 65536) == 0) {
                this.replacement_order_id = null;
            } else {
                this.replacement_order_id = uUIDDto5;
            }
            if ((i2 & 131072) == 0) {
                this.replaces_order = null;
            } else {
                this.replaces_order = replacesOrderDetailsDto;
            }
            if ((i2 & 262144) == 0) {
                this.notional = null;
            } else {
                this.notional = decimalDto10;
            }
            if ((524288 & i2) == 0) {
                this.cancelled_notional = null;
            } else {
                this.cancelled_notional = decimalDto11;
            }
            if ((1048576 & i2) == 0) {
                this.cancel_triggering_time = null;
            } else {
                this.cancel_triggering_time = timeDto8;
            }
            this.account_type = (2097152 & i2) == 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto;
            if ((4194304 & i2) == 0) {
                this.leverage = null;
            } else {
                this.leverage = decimalDto12;
            }
            if ((8388608 & i2) == 0) {
                this.reduce_only = null;
            } else {
                this.reduce_only = nullableBoolDto;
            }
            if ((16777216 & i2) == 0) {
                this.bulk_event_id = null;
            } else {
                this.bulk_event_id = uUIDDto6;
            }
            this.currency_denomination = (33554432 & i2) == 0 ? CurrencyDenominationDto.INSTANCE.getZeroValue() : currencyDenominationDto;
            this.margin_mode_v2 = (67108864 & i2) == 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto;
            this.position_effect = (134217728 & i2) == 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto;
            if ((268435456 & i2) == 0) {
                this.position_id = null;
            } else {
                this.position_id = nullableStringDto3;
            }
            if ((536870912 & i2) == 0) {
                this.fractional_details = null;
            } else {
                this.fractional_details = fractionalOrderDetailsDto;
            }
            if ((1073741824 & i2) == 0) {
                this.ipo_details = null;
            } else {
                this.ipo_details = iPOOrderDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.order_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            if (self.state != OrderStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, OrderStateDto.Serializer.INSTANCE, self.state);
            }
            DecimalDto decimalDto = self.cancelled_quantity;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            TimeDto timeDto = self.created_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.last_transaction_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            TimeDto timeDto3 = self.stop_triggered_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            if (!Intrinsics.areEqual(self.executions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.executions);
            }
            int i = self.version;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 9, RouteDto.Serializer.INSTANCE, self.route);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 10, self.account_number);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 11, SideDto.Serializer.INSTANCE, self.side);
            }
            DecimalDto decimalDto2 = self.quantity;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.price;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.stop_price;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            DecimalDto decimalDto5 = self.last_trail_price;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            UUIDDto uUIDDto3 = self.instrument_id;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
            NullableStringDto nullableStringDto = self.clearing_firm;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 18, lazyArr[18].getValue(), self.legs);
            }
            if (self.response_category != ResponseCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 19, ResponseCategoryDto.Serializer.INSTANCE, self.response_category);
            }
            TimeDto timeDto4 = self.update_created_at;
            if (timeDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, TimeDto.Serializer.INSTANCE, timeDto4);
            }
            AgentDto agentDto = self.cancel_open_agent;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            if (agentDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 21, AgentDto.Serializer.INSTANCE, self.cancel_open_agent);
            }
            if (self.cancel_close_agent != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 22, AgentDto.Serializer.INSTANCE, self.cancel_close_agent);
            }
            DecimalDto decimalDto6 = self.last_trail_price_with_collar;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            boolean z = self.is_heartbeat;
            if (z) {
                output.encodeBooleanElement(serialDesc, 24, z);
            }
            TimeDto timeDto5 = self.last_sent_at;
            if (timeDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, TimeDto.Serializer.INSTANCE, timeDto5);
            }
            if (!Intrinsics.areEqual(self.mainst_shard_id, "")) {
                output.encodeStringElement(serialDesc, 26, self.mainst_shard_id);
            }
            if (self.order_created_service != ClientServiceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 27, ClientServiceDto.Serializer.INSTANCE, self.order_created_service);
            }
            if (self.created_affiliate != AffiliateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 28, AffiliateDto.Serializer.INSTANCE, self.created_affiliate);
            }
            NullableIntDto nullableIntDto = self.service_shard_id;
            if (nullableIntDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, NullableIntDto.Serializer.INSTANCE, nullableIntDto);
            }
            if (self.created_agent != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 30, AgentDto.Serializer.INSTANCE, self.created_agent);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 31, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 32, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            if (self.peg_type != PegTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 33, PegTypeDto.Serializer.INSTANCE, self.peg_type);
            }
            if (self.market_hours != MarketHoursDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 34, MarketHoursDto.Serializer.INSTANCE, self.market_hours);
            }
            NullableStringDto nullableStringDto2 = self.response_text;
            if (nullableStringDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, NullableStringDto.Serializer.INSTANCE, nullableStringDto2);
            }
            if (self.trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 36, OrderTriggerDto.Serializer.INSTANCE, self.trigger);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 37, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            DecimalDto decimalDto7 = self.executed_quantity;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 38, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
            if (self.waiting_category != WaitingCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 39, WaitingCategoryDto.Serializer.INSTANCE, self.waiting_category);
            }
            OrderMetadataDto orderMetadataDto = self.metadata;
            if (orderMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 40, OrderMetadataDto.Serializer.INSTANCE, orderMetadataDto);
            }
            if (!Intrinsics.areEqual(self.modifications, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 41, lazyArr[41].getValue(), self.modifications);
            }
            DecimalDto decimalDto8 = self.estimated_notional;
            if (decimalDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 42, DecimalDto.Serializer.INSTANCE, decimalDto8);
            }
            TimeDto timeDto6 = self.cancel_open_time;
            if (timeDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 43, TimeDto.Serializer.INSTANCE, timeDto6);
            }
            TimeDto timeDto7 = self.cancel_close_time;
            if (timeDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 44, TimeDto.Serializer.INSTANCE, timeDto7);
            }
            if (!Intrinsics.areEqual(self.symbol, "")) {
                output.encodeStringElement(serialDesc, 45, self.symbol);
            }
            DecimalDto decimalDto9 = self.trailing_peg;
            if (decimalDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 46, DecimalDto.Serializer.INSTANCE, decimalDto9);
            }
            UUIDDto uUIDDto4 = self.list_root_id;
            if (uUIDDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 47, UUIDDto.Serializer.INSTANCE, uUIDDto4);
            }
            UUIDDto uUIDDto5 = self.replacement_order_id;
            if (uUIDDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 48, UUIDDto.Serializer.INSTANCE, uUIDDto5);
            }
            ReplacesOrderDetailsDto replacesOrderDetailsDto = self.replaces_order;
            if (replacesOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 49, ReplacesOrderDetailsDto.Serializer.INSTANCE, replacesOrderDetailsDto);
            }
            DecimalDto decimalDto10 = self.notional;
            if (decimalDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 50, DecimalDto.Serializer.INSTANCE, decimalDto10);
            }
            DecimalDto decimalDto11 = self.cancelled_notional;
            if (decimalDto11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 51, DecimalDto.Serializer.INSTANCE, decimalDto11);
            }
            TimeDto timeDto8 = self.cancel_triggering_time;
            if (timeDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 52, TimeDto.Serializer.INSTANCE, timeDto8);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 53, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            DecimalDto decimalDto12 = self.leverage;
            if (decimalDto12 != null) {
                output.encodeNullableSerializableElement(serialDesc, 54, DecimalDto.Serializer.INSTANCE, decimalDto12);
            }
            NullableBoolDto nullableBoolDto = self.reduce_only;
            if (nullableBoolDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 55, NullableBoolDto.Serializer.INSTANCE, nullableBoolDto);
            }
            UUIDDto uUIDDto6 = self.bulk_event_id;
            if (uUIDDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 56, UUIDDto.Serializer.INSTANCE, uUIDDto6);
            }
            if (self.currency_denomination != CurrencyDenominationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 57, CurrencyDenominationDto.Serializer.INSTANCE, self.currency_denomination);
            }
            if (self.margin_mode_v2 != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 58, MarginModeDto.Serializer.INSTANCE, self.margin_mode_v2);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 59, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            NullableStringDto nullableStringDto3 = self.position_id;
            if (nullableStringDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 60, NullableStringDto.Serializer.INSTANCE, nullableStringDto3);
            }
            FractionalOrderDetailsDto fractionalOrderDetailsDto = self.fractional_details;
            if (fractionalOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 61, FractionalOrderDetailsDto.Serializer.INSTANCE, fractionalOrderDetailsDto);
            }
            IPOOrderDetailsDto iPOOrderDetailsDto = self.ipo_details;
            if (iPOOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 62, IPOOrderDetailsDto.Serializer.INSTANCE, iPOOrderDetailsDto);
            }
        }

        public Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, OrderStateDto state, DecimalDto decimalDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List<OrderUpdateExecutionDto> executions, int i, RouteDto route, String account_number, SideDto side, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, UUIDDto uUIDDto3, NullableStringDto nullableStringDto, List<OrderUpdateLegDto> legs, ResponseCategoryDto response_category, TimeDto timeDto4, AgentDto cancel_open_agent, AgentDto cancel_close_agent, DecimalDto decimalDto6, boolean z, TimeDto timeDto5, String mainst_shard_id, ClientServiceDto order_created_service, AffiliateDto created_affiliate, NullableIntDto nullableIntDto, AgentDto created_agent, TimeInForceDto time_in_force, InstrumentTypeDto instrument_type, PegTypeDto peg_type, MarketHoursDto market_hours, NullableStringDto nullableStringDto2, OrderTriggerDto trigger, OrderTypeDto type2, DecimalDto decimalDto7, WaitingCategoryDto waiting_category, OrderMetadataDto orderMetadataDto, List<OrderModificationDto> modifications, DecimalDto decimalDto8, TimeDto timeDto6, TimeDto timeDto7, String symbol, DecimalDto decimalDto9, UUIDDto uUIDDto4, UUIDDto uUIDDto5, ReplacesOrderDetailsDto replacesOrderDetailsDto, DecimalDto decimalDto10, DecimalDto decimalDto11, TimeDto timeDto8, AccountTypeDto account_type, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto6, CurrencyDenominationDto currency_denomination, MarginModeDto margin_mode_v2, PositionEffectDto position_effect, NullableStringDto nullableStringDto3, FractionalOrderDetailsDto fractionalOrderDetailsDto, IPOOrderDetailsDto iPOOrderDetailsDto) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
            Intrinsics.checkNotNullParameter(mainst_shard_id, "mainst_shard_id");
            Intrinsics.checkNotNullParameter(order_created_service, "order_created_service");
            Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
            Intrinsics.checkNotNullParameter(created_agent, "created_agent");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(peg_type, "peg_type");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
            Intrinsics.checkNotNullParameter(modifications, "modifications");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
            Intrinsics.checkNotNullParameter(margin_mode_v2, "margin_mode_v2");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            this.id = uUIDDto;
            this.order_id = uUIDDto2;
            this.state = state;
            this.cancelled_quantity = decimalDto;
            this.created_at = timeDto;
            this.last_transaction_at = timeDto2;
            this.stop_triggered_at = timeDto3;
            this.executions = executions;
            this.version = i;
            this.route = route;
            this.account_number = account_number;
            this.side = side;
            this.quantity = decimalDto2;
            this.price = decimalDto3;
            this.stop_price = decimalDto4;
            this.last_trail_price = decimalDto5;
            this.instrument_id = uUIDDto3;
            this.clearing_firm = nullableStringDto;
            this.legs = legs;
            this.response_category = response_category;
            this.update_created_at = timeDto4;
            this.cancel_open_agent = cancel_open_agent;
            this.cancel_close_agent = cancel_close_agent;
            this.last_trail_price_with_collar = decimalDto6;
            this.is_heartbeat = z;
            this.last_sent_at = timeDto5;
            this.mainst_shard_id = mainst_shard_id;
            this.order_created_service = order_created_service;
            this.created_affiliate = created_affiliate;
            this.service_shard_id = nullableIntDto;
            this.created_agent = created_agent;
            this.time_in_force = time_in_force;
            this.instrument_type = instrument_type;
            this.peg_type = peg_type;
            this.market_hours = market_hours;
            this.response_text = nullableStringDto2;
            this.trigger = trigger;
            this.type = type2;
            this.executed_quantity = decimalDto7;
            this.waiting_category = waiting_category;
            this.metadata = orderMetadataDto;
            this.modifications = modifications;
            this.estimated_notional = decimalDto8;
            this.cancel_open_time = timeDto6;
            this.cancel_close_time = timeDto7;
            this.symbol = symbol;
            this.trailing_peg = decimalDto9;
            this.list_root_id = uUIDDto4;
            this.replacement_order_id = uUIDDto5;
            this.replaces_order = replacesOrderDetailsDto;
            this.notional = decimalDto10;
            this.cancelled_notional = decimalDto11;
            this.cancel_triggering_time = timeDto8;
            this.account_type = account_type;
            this.leverage = decimalDto12;
            this.reduce_only = nullableBoolDto;
            this.bulk_event_id = uUIDDto6;
            this.currency_denomination = currency_denomination;
            this.margin_mode_v2 = margin_mode_v2;
            this.position_effect = position_effect;
            this.position_id = nullableStringDto3;
            this.fractional_details = fractionalOrderDetailsDto;
            this.ipo_details = iPOOrderDetailsDto;
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final UUIDDto getOrder_id() {
            return this.order_id;
        }

        public final OrderStateDto getState() {
            return this.state;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, OrderStateDto orderStateDto, DecimalDto decimalDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, int i, RouteDto routeDto, String str, SideDto sideDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, UUIDDto uUIDDto3, NullableStringDto nullableStringDto, List list2, ResponseCategoryDto responseCategoryDto, TimeDto timeDto4, AgentDto agentDto, AgentDto agentDto2, DecimalDto decimalDto6, boolean z, TimeDto timeDto5, String str2, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, AgentDto agentDto3, TimeInForceDto timeInForceDto, InstrumentTypeDto instrumentTypeDto, PegTypeDto pegTypeDto, MarketHoursDto marketHoursDto, NullableStringDto nullableStringDto2, OrderTriggerDto orderTriggerDto, OrderTypeDto orderTypeDto, DecimalDto decimalDto7, WaitingCategoryDto waitingCategoryDto, OrderMetadataDto orderMetadataDto, List list3, DecimalDto decimalDto8, TimeDto timeDto6, TimeDto timeDto7, String str3, DecimalDto decimalDto9, UUIDDto uUIDDto4, UUIDDto uUIDDto5, ReplacesOrderDetailsDto replacesOrderDetailsDto, DecimalDto decimalDto10, DecimalDto decimalDto11, TimeDto timeDto8, AccountTypeDto accountTypeDto, DecimalDto decimalDto12, NullableBoolDto nullableBoolDto, UUIDDto uUIDDto6, CurrencyDenominationDto currencyDenominationDto, MarginModeDto marginModeDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto3, FractionalOrderDetailsDto fractionalOrderDetailsDto, IPOOrderDetailsDto iPOOrderDetailsDto, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            UUIDDto uUIDDto7 = (i2 & 1) != 0 ? null : uUIDDto;
            this(uUIDDto7, (i2 & 2) != 0 ? null : uUIDDto2, (i2 & 4) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto, (i2 & 8) != 0 ? null : decimalDto, (i2 & 16) != 0 ? null : timeDto, (i2 & 32) != 0 ? null : timeDto2, (i2 & 64) != 0 ? null : timeDto3, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto, (i2 & 1024) != 0 ? "" : str, (i2 & 2048) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto, (i2 & 4096) != 0 ? null : decimalDto2, (i2 & 8192) != 0 ? null : decimalDto3, (i2 & 16384) != 0 ? null : decimalDto4, (i2 & 32768) != 0 ? null : decimalDto5, (i2 & 65536) != 0 ? null : uUIDDto3, (i2 & 131072) != 0 ? null : nullableStringDto, (i2 & 262144) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 524288) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i2 & 1048576) != 0 ? null : timeDto4, (i2 & 2097152) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i2 & 4194304) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i2 & 8388608) != 0 ? null : decimalDto6, (i2 & 16777216) != 0 ? false : z, (i2 & 33554432) != 0 ? null : timeDto5, (i2 & 67108864) != 0 ? "" : str2, (i2 & 134217728) != 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto, (i2 & 268435456) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i2 & 536870912) != 0 ? null : nullableIntDto, (i2 & 1073741824) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto3, (i2 & Integer.MIN_VALUE) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto, (i3 & 1) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i3 & 2) != 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto, (i3 & 4) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i3 & 8) != 0 ? null : nullableStringDto2, (i3 & 16) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto, (i3 & 32) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto, (i3 & 64) != 0 ? null : decimalDto7, (i3 & 128) != 0 ? WaitingCategoryDto.INSTANCE.getZeroValue() : waitingCategoryDto, (i3 & 256) != 0 ? null : orderMetadataDto, (i3 & 512) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 1024) != 0 ? null : decimalDto8, (i3 & 2048) != 0 ? null : timeDto6, (i3 & 4096) != 0 ? null : timeDto7, (i3 & 8192) == 0 ? str3 : "", (i3 & 16384) != 0 ? null : decimalDto9, (i3 & 32768) != 0 ? null : uUIDDto4, (i3 & 65536) != 0 ? null : uUIDDto5, (i3 & 131072) != 0 ? null : replacesOrderDetailsDto, (i3 & 262144) != 0 ? null : decimalDto10, (i3 & 524288) != 0 ? null : decimalDto11, (i3 & 1048576) != 0 ? null : timeDto8, (i3 & 2097152) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i3 & 4194304) != 0 ? null : decimalDto12, (i3 & 8388608) != 0 ? null : nullableBoolDto, (i3 & 16777216) != 0 ? null : uUIDDto6, (i3 & 33554432) != 0 ? CurrencyDenominationDto.INSTANCE.getZeroValue() : currencyDenominationDto, (i3 & 67108864) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i3 & 134217728) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i3 & 268435456) != 0 ? null : nullableStringDto3, (i3 & 536870912) != 0 ? null : fractionalOrderDetailsDto, (i3 & 1073741824) != 0 ? null : iPOOrderDetailsDto);
        }

        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getLast_transaction_at() {
            return this.last_transaction_at;
        }

        public final TimeDto getStop_triggered_at() {
            return this.stop_triggered_at;
        }

        public final List<OrderUpdateExecutionDto> getExecutions() {
            return this.executions;
        }

        public final int getVersion() {
            return this.version;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        public final DecimalDto getLast_trail_price() {
            return this.last_trail_price;
        }

        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final NullableStringDto getClearing_firm() {
            return this.clearing_firm;
        }

        public final List<OrderUpdateLegDto> getLegs() {
            return this.legs;
        }

        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        public final TimeDto getUpdate_created_at() {
            return this.update_created_at;
        }

        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        public final AgentDto getCancel_close_agent() {
            return this.cancel_close_agent;
        }

        public final DecimalDto getLast_trail_price_with_collar() {
            return this.last_trail_price_with_collar;
        }

        public final boolean is_heartbeat() {
            return this.is_heartbeat;
        }

        public final TimeDto getLast_sent_at() {
            return this.last_sent_at;
        }

        public final String getMainst_shard_id() {
            return this.mainst_shard_id;
        }

        public final ClientServiceDto getOrder_created_service() {
            return this.order_created_service;
        }

        public final AffiliateDto getCreated_affiliate() {
            return this.created_affiliate;
        }

        public final NullableIntDto getService_shard_id() {
            return this.service_shard_id;
        }

        public final AgentDto getCreated_agent() {
            return this.created_agent;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final PegTypeDto getPeg_type() {
            return this.peg_type;
        }

        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final NullableStringDto getResponse_text() {
            return this.response_text;
        }

        public final OrderTriggerDto getTrigger() {
            return this.trigger;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final DecimalDto getExecuted_quantity() {
            return this.executed_quantity;
        }

        public final WaitingCategoryDto getWaiting_category() {
            return this.waiting_category;
        }

        public final OrderMetadataDto getMetadata() {
            return this.metadata;
        }

        public final List<OrderModificationDto> getModifications() {
            return this.modifications;
        }

        public final DecimalDto getEstimated_notional() {
            return this.estimated_notional;
        }

        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        public final TimeDto getCancel_close_time() {
            return this.cancel_close_time;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        public final DecimalDto getTrailing_peg() {
            return this.trailing_peg;
        }

        public final UUIDDto getList_root_id() {
            return this.list_root_id;
        }

        public final UUIDDto getReplacement_order_id() {
            return this.replacement_order_id;
        }

        public final ReplacesOrderDetailsDto getReplaces_order() {
            return this.replaces_order;
        }

        public final DecimalDto getNotional() {
            return this.notional;
        }

        public final DecimalDto getCancelled_notional() {
            return this.cancelled_notional;
        }

        public final TimeDto getCancel_triggering_time() {
            return this.cancel_triggering_time;
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final DecimalDto getLeverage() {
            return this.leverage;
        }

        public final NullableBoolDto getReduce_only() {
            return this.reduce_only;
        }

        public final UUIDDto getBulk_event_id() {
            return this.bulk_event_id;
        }

        public final CurrencyDenominationDto getCurrency_denomination() {
            return this.currency_denomination;
        }

        public final MarginModeDto getMargin_mode_v2() {
            return this.margin_mode_v2;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        public final FractionalOrderDetailsDto getFractional_details() {
            return this.fractional_details;
        }

        public final IPOOrderDetailsDto getIpo_details() {
            return this.ipo_details;
        }
    }

    /* compiled from: OrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto;", "Lcom/robinhood/rosetta/mainst/OrderUpdate;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderUpdateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderUpdateDto, OrderUpdate> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderUpdateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderUpdateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderUpdateDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderUpdateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OrderUpdate> getProtoAdapter() {
            return OrderUpdate.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderUpdateDto getZeroValue() {
            return OrderUpdateDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderUpdateDto fromProto(OrderUpdate proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            UUID order_id = proto.getOrder_id();
            UUIDDto uUIDDtoFromProto2 = order_id != null ? UUIDDto.INSTANCE.fromProto(order_id) : null;
            OrderStateDto orderStateDtoFromProto = OrderStateDto.INSTANCE.fromProto(proto.getState());
            Decimal cancelled_quantity = proto.getCancelled_quantity();
            DecimalDto decimalDtoFromProto = cancelled_quantity != null ? DecimalDto.INSTANCE.fromProto(cancelled_quantity) : null;
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time last_transaction_at = proto.getLast_transaction_at();
            TimeDto timeDtoFromProto2 = last_transaction_at != null ? TimeDto.INSTANCE.fromProto(last_transaction_at) : null;
            Time stop_triggered_at = proto.getStop_triggered_at();
            TimeDto timeDtoFromProto3 = stop_triggered_at != null ? TimeDto.INSTANCE.fromProto(stop_triggered_at) : null;
            List<OrderUpdateExecution> executions = proto.getExecutions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
            Iterator<T> it = executions.iterator();
            while (it.hasNext()) {
                arrayList.add(OrderUpdateExecutionDto.INSTANCE.fromProto((OrderUpdateExecution) it.next()));
            }
            int version = proto.getVersion();
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            String account_number = proto.getAccount_number();
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto2 = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto3 = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Decimal stop_price = proto.getStop_price();
            DecimalDto decimalDtoFromProto4 = stop_price != null ? DecimalDto.INSTANCE.fromProto(stop_price) : null;
            Decimal last_trail_price = proto.getLast_trail_price();
            DecimalDto decimalDtoFromProto5 = last_trail_price != null ? DecimalDto.INSTANCE.fromProto(last_trail_price) : null;
            UUID instrument_id = proto.getInstrument_id();
            UUIDDto uUIDDtoFromProto3 = instrument_id != null ? UUIDDto.INSTANCE.fromProto(instrument_id) : null;
            NullableString clearing_firm = proto.getClearing_firm();
            NullableStringDto nullableStringDtoFromProto = clearing_firm != null ? NullableStringDto.INSTANCE.fromProto(clearing_firm) : null;
            List<OrderUpdateLeg> legs = proto.getLegs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it2 = legs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(OrderUpdateLegDto.INSTANCE.fromProto((OrderUpdateLeg) it2.next()));
            }
            ResponseCategoryDto responseCategoryDtoFromProto = ResponseCategoryDto.INSTANCE.fromProto(proto.getResponse_category());
            Time update_created_at = proto.getUpdate_created_at();
            TimeDto timeDtoFromProto4 = update_created_at != null ? TimeDto.INSTANCE.fromProto(update_created_at) : null;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            AgentDto agentDtoFromProto = companion.fromProto(proto.getCancel_open_agent());
            AgentDto agentDtoFromProto2 = companion.fromProto(proto.getCancel_close_agent());
            Decimal last_trail_price_with_collar = proto.getLast_trail_price_with_collar();
            DecimalDto decimalDtoFromProto6 = last_trail_price_with_collar != null ? DecimalDto.INSTANCE.fromProto(last_trail_price_with_collar) : null;
            boolean is_heartbeat = proto.getIs_heartbeat();
            Time last_sent_at = proto.getLast_sent_at();
            TimeDto timeDtoFromProto5 = last_sent_at != null ? TimeDto.INSTANCE.fromProto(last_sent_at) : null;
            String mainst_shard_id = proto.getMainst_shard_id();
            ClientServiceDto clientServiceDtoFromProto = ClientServiceDto.INSTANCE.fromProto(proto.getOrder_created_service());
            AffiliateDto affiliateDtoFromProto = AffiliateDto.INSTANCE.fromProto(proto.getCreated_affiliate());
            NullableInt service_shard_id = proto.getService_shard_id();
            NullableIntDto nullableIntDtoFromProto = service_shard_id != null ? NullableIntDto.INSTANCE.fromProto(service_shard_id) : null;
            AgentDto agentDtoFromProto3 = companion.fromProto(proto.getCreated_agent());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type());
            PegTypeDto pegTypeDtoFromProto = PegTypeDto.INSTANCE.fromProto(proto.getPeg_type());
            MarketHoursDto marketHoursDtoFromProto = MarketHoursDto.INSTANCE.fromProto(proto.getMarket_hours());
            NullableString response_text = proto.getResponse_text();
            NullableStringDto nullableStringDtoFromProto2 = response_text != null ? NullableStringDto.INSTANCE.fromProto(response_text) : null;
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getTrigger());
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            Decimal executed_quantity = proto.getExecuted_quantity();
            DecimalDto decimalDtoFromProto7 = executed_quantity != null ? DecimalDto.INSTANCE.fromProto(executed_quantity) : null;
            WaitingCategoryDto waitingCategoryDtoFromProto = WaitingCategoryDto.INSTANCE.fromProto(proto.getWaiting_category());
            OrderMetadata metadata = proto.getMetadata();
            OrderMetadataDto orderMetadataDtoFromProto = metadata != null ? OrderMetadataDto.INSTANCE.fromProto(metadata) : null;
            List<OrderModification> modifications = proto.getModifications();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(modifications, 10));
            for (Iterator it3 = modifications.iterator(); it3.hasNext(); it3 = it3) {
                arrayList3.add(OrderModificationDto.INSTANCE.fromProto((OrderModification) it3.next()));
            }
            Decimal estimated_notional = proto.getEstimated_notional();
            DecimalDto decimalDtoFromProto8 = estimated_notional != null ? DecimalDto.INSTANCE.fromProto(estimated_notional) : null;
            Time cancel_open_time = proto.getCancel_open_time();
            TimeDto timeDtoFromProto6 = cancel_open_time != null ? TimeDto.INSTANCE.fromProto(cancel_open_time) : null;
            Time cancel_close_time = proto.getCancel_close_time();
            TimeDto timeDtoFromProto7 = cancel_close_time != null ? TimeDto.INSTANCE.fromProto(cancel_close_time) : null;
            String symbol = proto.getSymbol();
            Decimal trailing_peg = proto.getTrailing_peg();
            DecimalDto decimalDtoFromProto9 = trailing_peg != null ? DecimalDto.INSTANCE.fromProto(trailing_peg) : null;
            UUID list_root_id = proto.getList_root_id();
            UUIDDto uUIDDtoFromProto4 = list_root_id != null ? UUIDDto.INSTANCE.fromProto(list_root_id) : null;
            UUID replacement_order_id = proto.getReplacement_order_id();
            UUIDDto uUIDDtoFromProto5 = replacement_order_id != null ? UUIDDto.INSTANCE.fromProto(replacement_order_id) : null;
            ReplacesOrderDetails replaces_order = proto.getReplaces_order();
            ReplacesOrderDetailsDto replacesOrderDetailsDtoFromProto = replaces_order != null ? ReplacesOrderDetailsDto.INSTANCE.fromProto(replaces_order) : null;
            Decimal notional = proto.getNotional();
            DecimalDto decimalDtoFromProto10 = notional != null ? DecimalDto.INSTANCE.fromProto(notional) : null;
            Decimal cancelled_notional = proto.getCancelled_notional();
            DecimalDto decimalDtoFromProto11 = cancelled_notional != null ? DecimalDto.INSTANCE.fromProto(cancelled_notional) : null;
            Time cancel_triggering_time = proto.getCancel_triggering_time();
            TimeDto timeDtoFromProto8 = cancel_triggering_time != null ? TimeDto.INSTANCE.fromProto(cancel_triggering_time) : null;
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
            Decimal leverage = proto.getLeverage();
            DecimalDto decimalDtoFromProto12 = leverage != null ? DecimalDto.INSTANCE.fromProto(leverage) : null;
            NullableBool reduce_only = proto.getReduce_only();
            NullableBoolDto nullableBoolDtoFromProto = reduce_only != null ? NullableBoolDto.INSTANCE.fromProto(reduce_only) : null;
            UUID bulk_event_id = proto.getBulk_event_id();
            UUIDDto uUIDDtoFromProto6 = bulk_event_id != null ? UUIDDto.INSTANCE.fromProto(bulk_event_id) : null;
            CurrencyDenominationDto currencyDenominationDtoFromProto = CurrencyDenominationDto.INSTANCE.fromProto(proto.getCurrency_denomination());
            MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode_v2());
            PositionEffectDto positionEffectDtoFromProto = PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect());
            NullableString position_id = proto.getPosition_id();
            NullableStringDto nullableStringDtoFromProto3 = position_id != null ? NullableStringDto.INSTANCE.fromProto(position_id) : null;
            FractionalOrderDetails fractional_details = proto.getFractional_details();
            FractionalOrderDetailsDto fractionalOrderDetailsDtoFromProto = fractional_details != null ? FractionalOrderDetailsDto.INSTANCE.fromProto(fractional_details) : null;
            IPOOrderDetails ipo_details = proto.getIpo_details();
            return new OrderUpdateDto(new Surrogate(uUIDDtoFromProto, uUIDDtoFromProto2, orderStateDtoFromProto, decimalDtoFromProto, timeDtoFromProto, timeDtoFromProto2, timeDtoFromProto3, arrayList, version, routeDtoFromProto, account_number, sideDtoFromProto, decimalDtoFromProto2, decimalDtoFromProto3, decimalDtoFromProto4, decimalDtoFromProto5, uUIDDtoFromProto3, nullableStringDtoFromProto, arrayList2, responseCategoryDtoFromProto, timeDtoFromProto4, agentDtoFromProto, agentDtoFromProto2, decimalDtoFromProto6, is_heartbeat, timeDtoFromProto5, mainst_shard_id, clientServiceDtoFromProto, affiliateDtoFromProto, nullableIntDtoFromProto, agentDtoFromProto3, timeInForceDtoFromProto, instrumentTypeDtoFromProto, pegTypeDtoFromProto, marketHoursDtoFromProto, nullableStringDtoFromProto2, orderTriggerDtoFromProto, orderTypeDtoFromProto, decimalDtoFromProto7, waitingCategoryDtoFromProto, orderMetadataDtoFromProto, arrayList3, decimalDtoFromProto8, timeDtoFromProto6, timeDtoFromProto7, symbol, decimalDtoFromProto9, uUIDDtoFromProto4, uUIDDtoFromProto5, replacesOrderDetailsDtoFromProto, decimalDtoFromProto10, decimalDtoFromProto11, timeDtoFromProto8, accountTypeDtoFromProto, decimalDtoFromProto12, nullableBoolDtoFromProto, uUIDDtoFromProto6, currencyDenominationDtoFromProto, marginModeDtoFromProto, positionEffectDtoFromProto, nullableStringDtoFromProto3, fractionalOrderDetailsDtoFromProto, ipo_details != null ? IPOOrderDetailsDto.INSTANCE.fromProto(ipo_details) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderUpdateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderUpdateDto.binaryBase64Serializer_delegate$lambda$3();
            }
        });
        zeroValue = new OrderUpdateDto(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1073741823, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$3() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "FractionalDetails", "IpoDetails", "Companion", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto$FractionalDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto$IpoDetails;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ExtraDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ExtraDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ExtraDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: OrderUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto$FractionalDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/FractionalOrderDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FractionalDetails extends ExtraDetailsDto {
            private final FractionalOrderDetailsDto value;

            public static /* synthetic */ FractionalDetails copy$default(FractionalDetails fractionalDetails, FractionalOrderDetailsDto fractionalOrderDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    fractionalOrderDetailsDto = fractionalDetails.value;
                }
                return fractionalDetails.copy(fractionalOrderDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final FractionalOrderDetailsDto getValue() {
                return this.value;
            }

            public final FractionalDetails copy(FractionalOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new FractionalDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FractionalDetails) && Intrinsics.areEqual(this.value, ((FractionalDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FractionalDetails(value=" + this.value + ")";
            }

            public final FractionalOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FractionalDetails(FractionalOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto$IpoDetails;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;", "value", "Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;", "<init>", "(Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;)V", "getValue", "()Lcom/robinhood/rosetta/mainst/IPOOrderDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IpoDetails extends ExtraDetailsDto {
            private final IPOOrderDetailsDto value;

            public static /* synthetic */ IpoDetails copy$default(IpoDetails ipoDetails, IPOOrderDetailsDto iPOOrderDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    iPOOrderDetailsDto = ipoDetails.value;
                }
                return ipoDetails.copy(iPOOrderDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final IPOOrderDetailsDto getValue() {
                return this.value;
            }

            public final IpoDetails copy(IPOOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new IpoDetails(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IpoDetails) && Intrinsics.areEqual(this.value, ((IpoDetails) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IpoDetails(value=" + this.value + ")";
            }

            public final IPOOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IpoDetails(IPOOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: OrderUpdateDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$ExtraDetailsDto;", "Lcom/robinhood/rosetta/mainst/OrderUpdate;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Companion implements Dto4.Creator<ExtraDetailsDto, OrderUpdate> {
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
            public ProtoAdapter<OrderUpdate> getProtoAdapter() {
                return OrderUpdate.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExtraDetailsDto fromProto(OrderUpdate proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getFractional_details() != null) {
                    return new FractionalDetails(FractionalOrderDetailsDto.INSTANCE.fromProto(proto.getFractional_details()));
                }
                if (proto.getIpo_details() != null) {
                    return new IpoDetails(IPOOrderDetailsDto.INSTANCE.fromProto(proto.getIpo_details()));
                }
                return null;
            }
        }
    }

    /* compiled from: OrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderUpdateDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OrderUpdateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.OrderUpdate", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderUpdateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderUpdateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderUpdateDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderUpdateDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdateDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderUpdateDto";
        }
    }
}
