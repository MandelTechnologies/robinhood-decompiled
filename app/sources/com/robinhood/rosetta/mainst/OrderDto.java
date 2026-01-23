package com.robinhood.rosetta.mainst;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.robinhood.rosetta.i18n.Affiliate;
import com.robinhood.rosetta.i18n.AffiliateDto;
import com.robinhood.rosetta.mainst.DecimalDto;
import com.robinhood.rosetta.mainst.ExecutionDto;
import com.robinhood.rosetta.mainst.InstrumentInfoDto;
import com.robinhood.rosetta.mainst.InstrumentInfoV2Dto;
import com.robinhood.rosetta.mainst.NullableBoolDto;
import com.robinhood.rosetta.mainst.NullableIntDto;
import com.robinhood.rosetta.mainst.NullableStringDto;
import com.robinhood.rosetta.mainst.OrderDto;
import com.robinhood.rosetta.mainst.OrderLegDto;
import com.robinhood.rosetta.mainst.OrderMetadataDto;
import com.robinhood.rosetta.mainst.OrderSendLogDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;
import rosetta.mainst.Capacity;
import rosetta.mainst.CapacityDto;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.InstrumentTypeDto;
import rosetta.mainst.MarginMode;
import rosetta.mainst.MarginModeDto;
import rosetta.mainst.MarketState;
import rosetta.mainst.MarketStateDto;
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
import rosetta.order.HandlingInstruction;
import rosetta.order.HandlingInstructionDto;
import rosetta.order.MarketHours;
import rosetta.order.MarketHoursDto;
import rosetta.order.PegType;
import rosetta.order.PegTypeDto;
import rosetta.order.ResponseCategory;
import rosetta.order.ResponseCategoryDto;
import rosetta.order.WaitingCategory;
import rosetta.order.WaitingCategoryDto;

/* compiled from: OrderDto.kt */
@kotlin.Metadata(m3635d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bq\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ñ\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\bð\u0001ñ\u0001ò\u0001ó\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bé\u0006\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002020&\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u00104\u001a\u00020\r\u0012\b\b\u0002\u00105\u001a\u000206\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u0010=\u001a\u00020>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u000108\u0012\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020A0&\u0012\b\b\u0002\u0010B\u001a\u00020>\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010D\u001a\u00020>\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010F\u001a\u00020G\u0012\b\b\u0002\u0010H\u001a\u00020I\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\u000e\b\u0002\u0010L\u001a\b\u0012\u0004\u0012\u00020M0&\u0012\b\b\u0002\u0010N\u001a\u00020O\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q\u0012\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020S0&\u0012\b\b\u0002\u0010T\u001a\u00020U\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y\u0012\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0&\u0012\b\b\u0002\u0010\\\u001a\u00020]\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010b\u001a\u00020c\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0&\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010h\u001a\u00020i\u0012\b\b\u0002\u0010j\u001a\u00020k\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010W\u0012\b\b\u0002\u0010n\u001a\u00020o\u0012\b\b\u0002\u0010p\u001a\u00020q\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010u\u001a\u00020v\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u000108¢\u0006\u0004\b\u0006\u0010xJç\u0006\u0010ã\u0001\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002020&2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\"2\b\b\u0002\u00104\u001a\u00020\r2\b\b\u0002\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010<\u001a\u0004\u0018\u0001082\b\b\u0002\u0010=\u001a\u00020>2\n\b\u0002\u0010?\u001a\u0004\u0018\u0001082\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020A0&2\b\b\u0002\u0010B\u001a\u00020>2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010D\u001a\u00020>2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010F\u001a\u00020G2\b\b\u0002\u0010H\u001a\u00020I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\u000e\b\u0002\u0010L\u001a\b\u0012\u0004\u0012\u00020M0&2\b\b\u0002\u0010N\u001a\u00020O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020S0&2\b\b\u0002\u0010T\u001a\u00020U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\u000e\b\u0002\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0&2\b\b\u0002\u0010\\\u001a\u00020]2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010b\u001a\u00020c2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0&2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010h\u001a\u00020i2\b\b\u0002\u0010j\u001a\u00020k2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010m\u001a\u0004\u0018\u00010W2\b\b\u0002\u0010n\u001a\u00020o2\b\b\u0002\u0010p\u001a\u00020q2\n\b\u0002\u0010r\u001a\u0004\u0018\u0001082\n\b\u0002\u0010s\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010u\u001a\u00020v2\n\b\u0002\u0010w\u001a\u0004\u0018\u000108J\t\u0010ä\u0001\u001a\u00020\u0002H\u0016J\t\u0010å\u0001\u001a\u00020\rH\u0016J\u0016\u0010æ\u0001\u001a\u00020)2\n\u0010ç\u0001\u001a\u0005\u0018\u00010è\u0001H\u0096\u0002J\t\u0010é\u0001\u001a\u000200H\u0016J\u001d\u0010ê\u0001\u001a\u00030ë\u00012\b\u0010ì\u0001\u001a\u00030í\u00012\u0007\u0010î\u0001\u001a\u000200H\u0016J\t\u0010ï\u0001\u001a\u000200H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b{\u0010zR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b|\u0010zR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0012\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0013\u0010\u0010\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0084\u0001R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0084\u0001R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0084\u0001R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001R\u0013\u0010\u0019\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0013\u0010\u001b\u001a\u00020\u001c8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0013\u0010\u001d\u001a\u00020\u001e8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0013\u0010\u001f\u001a\u00020 8F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0015\u0010#\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0093\u0001R\u0015\u0010$\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001R\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0013\u0010(\u001a\u00020)8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0015\u0010*\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u0093\u0001R\u0014\u0010+\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010zR\u0014\u0010,\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010zR\u0013\u0010-\u001a\u00020.8F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0013\u0010/\u001a\u0002008F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u00101\u001a\b\u0012\u0004\u0012\u0002020&8F¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u0097\u0001R\u0015\u00103\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u0093\u0001R\u0012\u00104\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010~R\u0013\u00105\u001a\u0002068F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0015\u00107\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0015\u00109\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\b¨\u0001\u0010§\u0001R\u0015\u0010:\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b©\u0001\u0010\u0093\u0001R\u0015\u0010;\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\bª\u0001\u0010\u0093\u0001R\u0015\u0010<\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\b«\u0001\u0010§\u0001R\u0013\u0010=\u001a\u00020>8F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0015\u0010?\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\b®\u0001\u0010§\u0001R\u0019\u0010@\u001a\b\u0012\u0004\u0012\u00020A0&8F¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u0097\u0001R\u0013\u0010B\u001a\u00020>8F¢\u0006\b\u001a\u0006\b°\u0001\u0010\u00ad\u0001R\u0015\u0010C\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b±\u0001\u0010\u0093\u0001R\u0013\u0010D\u001a\u00020>8F¢\u0006\b\u001a\u0006\b²\u0001\u0010\u00ad\u0001R\u0015\u0010E\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\b³\u0001\u0010\u0093\u0001R\u0013\u0010F\u001a\u00020G8F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0013\u0010H\u001a\u00020I8F¢\u0006\b\u001a\u0006\b¶\u0001\u0010·\u0001R\u0015\u0010J\u001a\u0004\u0018\u00010K8F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010L\u001a\b\u0012\u0004\u0012\u00020M0&8F¢\u0006\b\u001a\u0006\bº\u0001\u0010\u0097\u0001R\u0013\u0010N\u001a\u00020O8F¢\u0006\b\u001a\u0006\b»\u0001\u0010¼\u0001R\u0015\u0010P\u001a\u0004\u0018\u00010Q8F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010R\u001a\b\u0012\u0004\u0012\u00020S0&8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010\u0097\u0001R\u0013\u0010T\u001a\u00020U8F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010V\u001a\u0004\u0018\u00010W8F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0015\u0010X\u001a\u0004\u0018\u00010Y8F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0&8F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010\u0097\u0001R\u0013\u0010\\\u001a\u00020]8F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0015\u0010^\u001a\u0004\u0018\u00010W8F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ã\u0001R\u0015\u0010_\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010\u0084\u0001R\u0015\u0010`\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\bË\u0001\u0010\u0084\u0001R\u0015\u0010a\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\bÌ\u0001\u0010\u0084\u0001R\u0013\u0010b\u001a\u00020c8F¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u0014\u0010d\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010zR\u0019\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0&8F¢\u0006\b\u001a\u0006\bÐ\u0001\u0010\u0097\u0001R\u0015\u0010f\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\bÑ\u0001\u0010\u0084\u0001R\u0014\u0010g\u001a\u0004\u0018\u00010\t8F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010zR\u0013\u0010h\u001a\u00020i8F¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0013\u0010j\u001a\u00020k8F¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010l\u001a\u0004\u0018\u00010\u00138F¢\u0006\b\u001a\u0006\b×\u0001\u0010\u0084\u0001R\u0015\u0010m\u001a\u0004\u0018\u00010W8F¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ã\u0001R\u0013\u0010n\u001a\u00020o8F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0013\u0010p\u001a\u00020q8F¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u0015\u0010r\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\bÝ\u0001\u0010§\u0001R\u0015\u0010s\u001a\u0004\u0018\u00010K8F¢\u0006\b\u001a\u0006\bÞ\u0001\u0010¹\u0001R\u0015\u0010t\u001a\u0004\u0018\u00010\"8F¢\u0006\b\u001a\u0006\bß\u0001\u0010\u0093\u0001R\u0013\u0010u\u001a\u00020v8F¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001R\u0015\u0010w\u001a\u0004\u0018\u0001088F¢\u0006\b\u001a\u0006\bâ\u0001\u0010§\u0001¨\u0006ô\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/mainst/Order;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/mainst/OrderDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/mainst/OrderDto$Surrogate;)V", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "instrument_id", "parent_order_id", "account_number", "", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "side", "Lrosetta/mainst/SideDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "stop_price", "trailing_peg", "last_trail_price", "quantity", "cancelled_quantity", "peg_type", "Lrosetta/order/PegTypeDto;", "trigger", "Lrosetta/mainst/OrderTriggerDto;", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "state", "Lrosetta/mainst/OrderStateDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "received_at", "last_transaction_at", "executions", "", "Lcom/robinhood/rosetta/mainst/ExecutionDto;", "extended_hours", "", "stop_triggered_at", "user_currency", "asset_currency", "type", "Lrosetta/mainst/OrderTypeDto;", "update_count", "", "legs", "Lcom/robinhood/rosetta/mainst/OrderLegDto;", "last_sent_at", "fix_conn_id", "market_state", "Lrosetta/mainst/MarketStateDto;", "clearing_firm", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "response_text", "to_cancel_at", "to_send_at", "venue_id", "created_agent", "Lrosetta/order/AgentDto;", "cl_ord_id", "send_logs", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto;", "cancel_open_agent", "cancel_open_time", "cancel_close_agent", "cancel_close_time", "created_service", "Lrosetta/order/ClientServiceDto;", "created_affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "instruments", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto;", "response_category", "Lrosetta/order/ResponseCategoryDto;", "metadata", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "handling_instructions", "Lrosetta/order/HandlingInstructionDto;", "market_hours", "Lrosetta/order/MarketHoursDto;", "pro_trader", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "expire_date", "Lcom/robinhood/rosetta/common/DateDto;", "instruments_v2", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto;", "waiting_category", "Lrosetta/order/WaitingCategoryDto;", "force_route", "notional", "max_quantity", "reserved_buying_power", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "replacement_order_id", "ChildMarkets", "quantity_to_replace", "list_root_id", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/order/AccountTypeDto;", "margin_mode", "Lrosetta/mainst/MarginModeDto;", "leverage", "reduce_only", "currency_denomination", "Lrosetta/order/CurrencyDenominationDto;", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "position_id", "active_ttl_seconds", "to_expire_at", "capacity", "Lrosetta/mainst/CapacityDto;", "force_fix_line", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/order/PegTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/List;ZLcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderTypeDto;ILjava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lrosetta/mainst/MarketStateDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/util/List;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/ClientServiceDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Ljava/util/List;Lrosetta/order/ResponseCategoryDto;Lcom/robinhood/rosetta/mainst/OrderMetadataDto;Ljava/util/List;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/util/List;Lrosetta/order/WaitingCategoryDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/order/AccountTypeDto;Lrosetta/mainst/MarginModeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lrosetta/order/CurrencyDenominationDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getInstrument_id", "getParent_order_id", "getAccount_number", "()Ljava/lang/String;", "getRoute", "()Lrosetta/mainst/RouteDto;", "getSide", "()Lrosetta/mainst/SideDto;", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getStop_price", "getTrailing_peg", "getLast_trail_price", "getQuantity", "getCancelled_quantity", "getPeg_type", "()Lrosetta/order/PegTypeDto;", "getTrigger", "()Lrosetta/mainst/OrderTriggerDto;", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getState", "()Lrosetta/mainst/OrderStateDto;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getReceived_at", "getLast_transaction_at", "getExecutions", "()Ljava/util/List;", "getExtended_hours", "()Z", "getStop_triggered_at", "getUser_currency", "getAsset_currency", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getUpdate_count", "()I", "getLegs", "getLast_sent_at", "getFix_conn_id", "getMarket_state", "()Lrosetta/mainst/MarketStateDto;", "getClearing_firm", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getResponse_text", "getTo_cancel_at", "getTo_send_at", "getVenue_id", "getCreated_agent", "()Lrosetta/order/AgentDto;", "getCl_ord_id", "getSend_logs", "getCancel_open_agent", "getCancel_open_time", "getCancel_close_agent", "getCancel_close_time", "getCreated_service", "()Lrosetta/order/ClientServiceDto;", "getCreated_affiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getInstruments", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getMetadata", "()Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "getHandling_instructions", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getPro_trader", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getExpire_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getInstruments_v2", "getWaiting_category", "()Lrosetta/order/WaitingCategoryDto;", "getForce_route", "getNotional", "getMax_quantity", "getReserved_buying_power", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getReplacement_order_id", "getChildMarkets", "getQuantity_to_replace", "getList_root_id", "getAccount_type", "()Lrosetta/order/AccountTypeDto;", "getMargin_mode", "()Lrosetta/mainst/MarginModeDto;", "getLeverage", "getReduce_only", "getCurrency_denomination", "()Lrosetta/order/CurrencyDenominationDto;", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getPosition_id", "getActive_ttl_seconds", "getTo_expire_at", "getCapacity", "()Lrosetta/mainst/CapacityDto;", "getForce_fix_line", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class OrderDto implements Dto3<Order>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<OrderDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OrderDto, Order>> binaryBase64Serializer$delegate;
    private static final OrderDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OrderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OrderDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UUIDDto getId() {
        return this.surrogate.getId();
    }

    public final UUIDDto getInstrument_id() {
        return this.surrogate.getInstrument_id();
    }

    public final UUIDDto getParent_order_id() {
        return this.surrogate.getParent_order_id();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final RouteDto getRoute() {
        return this.surrogate.getRoute();
    }

    public final SideDto getSide() {
        return this.surrogate.getSide();
    }

    public final DecimalDto getPrice() {
        return this.surrogate.getPrice();
    }

    public final DecimalDto getStop_price() {
        return this.surrogate.getStop_price();
    }

    public final DecimalDto getTrailing_peg() {
        return this.surrogate.getTrailing_peg();
    }

    public final DecimalDto getLast_trail_price() {
        return this.surrogate.getLast_trail_price();
    }

    public final DecimalDto getQuantity() {
        return this.surrogate.getQuantity();
    }

    public final DecimalDto getCancelled_quantity() {
        return this.surrogate.getCancelled_quantity();
    }

    public final PegTypeDto getPeg_type() {
        return this.surrogate.getPeg_type();
    }

    public final OrderTriggerDto getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final TimeInForceDto getTime_in_force() {
        return this.surrogate.getTime_in_force();
    }

    public final OrderStateDto getState() {
        return this.surrogate.getState();
    }

    public final TimeDto getCreated_at() {
        return this.surrogate.getCreated_at();
    }

    public final TimeDto getReceived_at() {
        return this.surrogate.getReceived_at();
    }

    public final TimeDto getLast_transaction_at() {
        return this.surrogate.getLast_transaction_at();
    }

    public final List<ExecutionDto> getExecutions() {
        return this.surrogate.getExecutions();
    }

    public final boolean getExtended_hours() {
        return this.surrogate.getExtended_hours();
    }

    public final TimeDto getStop_triggered_at() {
        return this.surrogate.getStop_triggered_at();
    }

    public final UUIDDto getUser_currency() {
        return this.surrogate.getUser_currency();
    }

    public final UUIDDto getAsset_currency() {
        return this.surrogate.getAsset_currency();
    }

    public final OrderTypeDto getType() {
        return this.surrogate.getType();
    }

    public final int getUpdate_count() {
        return this.surrogate.getUpdate_count();
    }

    public final List<OrderLegDto> getLegs() {
        return this.surrogate.getLegs();
    }

    public final TimeDto getLast_sent_at() {
        return this.surrogate.getLast_sent_at();
    }

    public final String getFix_conn_id() {
        return this.surrogate.getFix_conn_id();
    }

    public final MarketStateDto getMarket_state() {
        return this.surrogate.getMarket_state();
    }

    public final NullableStringDto getClearing_firm() {
        return this.surrogate.getClearing_firm();
    }

    public final NullableStringDto getResponse_text() {
        return this.surrogate.getResponse_text();
    }

    public final TimeDto getTo_cancel_at() {
        return this.surrogate.getTo_cancel_at();
    }

    public final TimeDto getTo_send_at() {
        return this.surrogate.getTo_send_at();
    }

    public final NullableStringDto getVenue_id() {
        return this.surrogate.getVenue_id();
    }

    public final AgentDto getCreated_agent() {
        return this.surrogate.getCreated_agent();
    }

    public final NullableStringDto getCl_ord_id() {
        return this.surrogate.getCl_ord_id();
    }

    public final List<OrderSendLogDto> getSend_logs() {
        return this.surrogate.getSend_logs();
    }

    public final AgentDto getCancel_open_agent() {
        return this.surrogate.getCancel_open_agent();
    }

    public final TimeDto getCancel_open_time() {
        return this.surrogate.getCancel_open_time();
    }

    public final AgentDto getCancel_close_agent() {
        return this.surrogate.getCancel_close_agent();
    }

    public final TimeDto getCancel_close_time() {
        return this.surrogate.getCancel_close_time();
    }

    public final ClientServiceDto getCreated_service() {
        return this.surrogate.getCreated_service();
    }

    public final AffiliateDto getCreated_affiliate() {
        return this.surrogate.getCreated_affiliate();
    }

    public final NullableIntDto getService_shard_id() {
        return this.surrogate.getService_shard_id();
    }

    public final List<InstrumentInfoDto> getInstruments() {
        return this.surrogate.getInstruments();
    }

    public final ResponseCategoryDto getResponse_category() {
        return this.surrogate.getResponse_category();
    }

    public final OrderMetadataDto getMetadata() {
        return this.surrogate.getMetadata();
    }

    public final List<HandlingInstructionDto> getHandling_instructions() {
        return this.surrogate.getHandling_instructions();
    }

    public final MarketHoursDto getMarket_hours() {
        return this.surrogate.getMarket_hours();
    }

    public final NullableBoolDto getPro_trader() {
        return this.surrogate.getPro_trader();
    }

    public final DateDto getExpire_date() {
        return this.surrogate.getExpire_date();
    }

    public final List<InstrumentInfoV2Dto> getInstruments_v2() {
        return this.surrogate.getInstruments_v2();
    }

    public final WaitingCategoryDto getWaiting_category() {
        return this.surrogate.getWaiting_category();
    }

    public final NullableBoolDto getForce_route() {
        return this.surrogate.getForce_route();
    }

    public final DecimalDto getNotional() {
        return this.surrogate.getNotional();
    }

    public final DecimalDto getMax_quantity() {
        return this.surrogate.getMax_quantity();
    }

    public final DecimalDto getReserved_buying_power() {
        return this.surrogate.getReserved_buying_power();
    }

    public final InstrumentTypeDto getInstrument_type() {
        return this.surrogate.getInstrument_type();
    }

    public final UUIDDto getReplacement_order_id() {
        return this.surrogate.getReplacement_order_id();
    }

    public final List<String> getChildMarkets() {
        return this.surrogate.getChildMarkets();
    }

    public final DecimalDto getQuantity_to_replace() {
        return this.surrogate.getQuantity_to_replace();
    }

    public final UUIDDto getList_root_id() {
        return this.surrogate.getList_root_id();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final MarginModeDto getMargin_mode() {
        return this.surrogate.getMargin_mode();
    }

    public final DecimalDto getLeverage() {
        return this.surrogate.getLeverage();
    }

    public final NullableBoolDto getReduce_only() {
        return this.surrogate.getReduce_only();
    }

    public final CurrencyDenominationDto getCurrency_denomination() {
        return this.surrogate.getCurrency_denomination();
    }

    public final PositionEffectDto getPosition_effect() {
        return this.surrogate.getPosition_effect();
    }

    public final NullableStringDto getPosition_id() {
        return this.surrogate.getPosition_id();
    }

    public final NullableIntDto getActive_ttl_seconds() {
        return this.surrogate.getActive_ttl_seconds();
    }

    public final TimeDto getTo_expire_at() {
        return this.surrogate.getTo_expire_at();
    }

    public final CapacityDto getCapacity() {
        return this.surrogate.getCapacity();
    }

    public final NullableStringDto getForce_fix_line() {
        return this.surrogate.getForce_fix_line();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String str, RouteDto routeDto, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto pegTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, OrderStateDto orderStateDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto orderTypeDto, int i, List list2, TimeDto timeDto5, String str2, MarketStateDto marketStateDto, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto agentDto, NullableStringDto nullableStringDto4, List list3, AgentDto agentDto2, TimeDto timeDto8, AgentDto agentDto3, TimeDto timeDto9, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, List list4, ResponseCategoryDto responseCategoryDto, OrderMetadataDto orderMetadataDto, List list5, MarketHoursDto marketHoursDto, NullableBoolDto nullableBoolDto, DateDto dateDto, List list6, WaitingCategoryDto waitingCategoryDto, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto6, List list7, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto accountTypeDto, MarginModeDto marginModeDto, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currencyDenominationDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacityDto, NullableStringDto nullableStringDto6, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        UUIDDto uUIDDto8 = (i2 & 1) != 0 ? null : uUIDDto;
        UUIDDto uUIDDto9 = (i2 & 2) != 0 ? null : uUIDDto2;
        UUIDDto uUIDDto10 = (i2 & 4) != 0 ? null : uUIDDto3;
        String str3 = (i2 & 8) != 0 ? "" : str;
        RouteDto zeroValue2 = (i2 & 16) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
        SideDto zeroValue3 = (i2 & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
        DecimalDto decimalDto12 = (i2 & 64) != 0 ? null : decimalDto;
        DecimalDto decimalDto13 = (i2 & 128) != 0 ? null : decimalDto2;
        DecimalDto decimalDto14 = (i2 & 256) != 0 ? null : decimalDto3;
        DecimalDto decimalDto15 = (i2 & 512) != 0 ? null : decimalDto4;
        DecimalDto decimalDto16 = (i2 & 1024) != 0 ? null : decimalDto5;
        DecimalDto decimalDto17 = (i2 & 2048) != 0 ? null : decimalDto6;
        UUIDDto uUIDDto11 = uUIDDto8;
        PegTypeDto zeroValue4 = (i2 & 4096) != 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto;
        OrderTriggerDto zeroValue5 = (i2 & 8192) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto;
        TimeInForceDto zeroValue6 = (i2 & 16384) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
        OrderStateDto zeroValue7 = (i2 & 32768) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto;
        TimeDto timeDto11 = (i2 & 65536) != 0 ? null : timeDto;
        TimeDto timeDto12 = (i2 & 131072) != 0 ? null : timeDto2;
        TimeDto timeDto13 = (i2 & 262144) != 0 ? null : timeDto3;
        List listEmptyList = (i2 & 524288) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i2 & 1048576) != 0 ? false : z;
        TimeDto timeDto14 = (i2 & 2097152) != 0 ? null : timeDto4;
        UUIDDto uUIDDto12 = (i2 & 4194304) != 0 ? null : uUIDDto4;
        UUIDDto uUIDDto13 = (i2 & 8388608) != 0 ? null : uUIDDto5;
        OrderTypeDto zeroValue8 = (i2 & 16777216) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto;
        int i5 = (i2 & 33554432) != 0 ? 0 : i;
        List listEmptyList2 = (i2 & 67108864) != 0 ? CollectionsKt.emptyList() : list2;
        TimeDto timeDto15 = (i2 & 134217728) != 0 ? null : timeDto5;
        String str4 = (i2 & 268435456) == 0 ? str2 : "";
        MarketStateDto zeroValue9 = (i2 & 536870912) != 0 ? MarketStateDto.INSTANCE.getZeroValue() : marketStateDto;
        NullableStringDto nullableStringDto7 = (i2 & 1073741824) != 0 ? null : nullableStringDto;
        NullableStringDto nullableStringDto8 = (i2 & Integer.MIN_VALUE) != 0 ? null : nullableStringDto2;
        this(uUIDDto11, uUIDDto9, uUIDDto10, str3, zeroValue2, zeroValue3, decimalDto12, decimalDto13, decimalDto14, decimalDto15, decimalDto16, decimalDto17, zeroValue4, zeroValue5, zeroValue6, zeroValue7, timeDto11, timeDto12, timeDto13, listEmptyList, z2, timeDto14, uUIDDto12, uUIDDto13, zeroValue8, i5, listEmptyList2, timeDto15, str4, zeroValue9, nullableStringDto7, nullableStringDto8, (i3 & 1) != 0 ? null : timeDto6, (i3 & 2) != 0 ? null : timeDto7, (i3 & 4) != 0 ? null : nullableStringDto3, (i3 & 8) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i3 & 16) != 0 ? null : nullableStringDto4, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 64) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i3 & 128) != 0 ? null : timeDto8, (i3 & 256) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto3, (i3 & 512) != 0 ? null : timeDto9, (i3 & 1024) != 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto, (i3 & 2048) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i3 & 4096) != 0 ? null : nullableIntDto, (i3 & 8192) != 0 ? CollectionsKt.emptyList() : list4, (i3 & 16384) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i3 & 32768) != 0 ? null : orderMetadataDto, (i3 & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i3 & 131072) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i3 & 262144) != 0 ? null : nullableBoolDto, (i3 & 524288) != 0 ? null : dateDto, (i3 & 1048576) != 0 ? CollectionsKt.emptyList() : list6, (i3 & 2097152) != 0 ? WaitingCategoryDto.INSTANCE.getZeroValue() : waitingCategoryDto, (i3 & 4194304) != 0 ? null : nullableBoolDto2, (i3 & 8388608) != 0 ? null : decimalDto7, (i3 & 16777216) != 0 ? null : decimalDto8, (i3 & 33554432) != 0 ? null : decimalDto9, (i3 & 67108864) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i3 & 134217728) != 0 ? null : uUIDDto6, (i3 & 268435456) != 0 ? CollectionsKt.emptyList() : list7, (i3 & 536870912) != 0 ? null : decimalDto10, (i3 & 1073741824) != 0 ? null : uUIDDto7, (i3 & Integer.MIN_VALUE) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i4 & 1) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i4 & 2) != 0 ? null : decimalDto11, (i4 & 4) != 0 ? null : nullableBoolDto3, (i4 & 8) != 0 ? CurrencyDenominationDto.INSTANCE.getZeroValue() : currencyDenominationDto, (i4 & 16) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i4 & 32) != 0 ? null : nullableStringDto5, (i4 & 64) != 0 ? null : nullableIntDto2, (i4 & 128) != 0 ? null : timeDto10, (i4 & 256) != 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto, (i4 & 512) != 0 ? null : nullableStringDto6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderDto(UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String account_number, RouteDto route, SideDto side, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto peg_type, OrderTriggerDto trigger, TimeInForceDto time_in_force, OrderStateDto state, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List<ExecutionDto> executions, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto type2, int i, List<OrderLegDto> legs, TimeDto timeDto5, String fix_conn_id, MarketStateDto market_state, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto created_agent, NullableStringDto nullableStringDto4, List<OrderSendLogDto> send_logs, AgentDto cancel_open_agent, TimeDto timeDto8, AgentDto cancel_close_agent, TimeDto timeDto9, ClientServiceDto created_service, AffiliateDto created_affiliate, NullableIntDto nullableIntDto, List<InstrumentInfoDto> instruments, ResponseCategoryDto response_category, OrderMetadataDto orderMetadataDto, List<? extends HandlingInstructionDto> handling_instructions, MarketHoursDto market_hours, NullableBoolDto nullableBoolDto, DateDto dateDto, List<InstrumentInfoV2Dto> instruments_v2, WaitingCategoryDto waiting_category, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrument_type, UUIDDto uUIDDto6, List<String> ChildMarkets, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto account_type, MarginModeDto margin_mode, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currency_denomination, PositionEffectDto position_effect, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacity, NullableStringDto nullableStringDto6) {
        this(new Surrogate(uUIDDto, uUIDDto2, uUIDDto3, account_number, route, side, decimalDto, decimalDto2, decimalDto3, decimalDto4, decimalDto5, decimalDto6, peg_type, trigger, time_in_force, state, timeDto, timeDto2, timeDto3, executions, z, timeDto4, uUIDDto4, uUIDDto5, type2, i, legs, timeDto5, fix_conn_id, market_state, nullableStringDto, nullableStringDto2, timeDto6, timeDto7, nullableStringDto3, created_agent, nullableStringDto4, send_logs, cancel_open_agent, timeDto8, cancel_close_agent, timeDto9, created_service, created_affiliate, nullableIntDto, instruments, response_category, orderMetadataDto, handling_instructions, market_hours, nullableBoolDto, dateDto, instruments_v2, waiting_category, nullableBoolDto2, decimalDto7, decimalDto8, decimalDto9, instrument_type, uUIDDto6, ChildMarkets, decimalDto10, uUIDDto7, account_type, margin_mode, decimalDto11, nullableBoolDto3, currency_denomination, position_effect, nullableStringDto5, nullableIntDto2, timeDto10, capacity, nullableStringDto6));
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
        Intrinsics.checkNotNullParameter(market_state, "market_state");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(send_logs, "send_logs");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(created_service, "created_service");
        Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(handling_instructions, "handling_instructions");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(instruments_v2, "instruments_v2");
        Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(ChildMarkets, "ChildMarkets");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
    }

    public static /* synthetic */ OrderDto copy$default(OrderDto orderDto, UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String str, RouteDto routeDto, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto pegTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, OrderStateDto orderStateDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto orderTypeDto, int i, List list2, TimeDto timeDto5, String str2, MarketStateDto marketStateDto, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto agentDto, NullableStringDto nullableStringDto4, List list3, AgentDto agentDto2, TimeDto timeDto8, AgentDto agentDto3, TimeDto timeDto9, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, List list4, ResponseCategoryDto responseCategoryDto, OrderMetadataDto orderMetadataDto, List list5, MarketHoursDto marketHoursDto, NullableBoolDto nullableBoolDto, DateDto dateDto, List list6, WaitingCategoryDto waitingCategoryDto, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto6, List list7, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto accountTypeDto, MarginModeDto marginModeDto, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currencyDenominationDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacityDto, NullableStringDto nullableStringDto6, int i2, int i3, int i4, Object obj) {
        UUIDDto id = (i2 & 1) != 0 ? orderDto.surrogate.getId() : uUIDDto;
        return orderDto.copy(id, (i2 & 2) != 0 ? orderDto.surrogate.getInstrument_id() : uUIDDto2, (i2 & 4) != 0 ? orderDto.surrogate.getParent_order_id() : uUIDDto3, (i2 & 8) != 0 ? orderDto.surrogate.getAccount_number() : str, (i2 & 16) != 0 ? orderDto.surrogate.getRoute() : routeDto, (i2 & 32) != 0 ? orderDto.surrogate.getSide() : sideDto, (i2 & 64) != 0 ? orderDto.surrogate.getPrice() : decimalDto, (i2 & 128) != 0 ? orderDto.surrogate.getStop_price() : decimalDto2, (i2 & 256) != 0 ? orderDto.surrogate.getTrailing_peg() : decimalDto3, (i2 & 512) != 0 ? orderDto.surrogate.getLast_trail_price() : decimalDto4, (i2 & 1024) != 0 ? orderDto.surrogate.getQuantity() : decimalDto5, (i2 & 2048) != 0 ? orderDto.surrogate.getCancelled_quantity() : decimalDto6, (i2 & 4096) != 0 ? orderDto.surrogate.getPeg_type() : pegTypeDto, (i2 & 8192) != 0 ? orderDto.surrogate.getTrigger() : orderTriggerDto, (i2 & 16384) != 0 ? orderDto.surrogate.getTime_in_force() : timeInForceDto, (i2 & 32768) != 0 ? orderDto.surrogate.getState() : orderStateDto, (i2 & 65536) != 0 ? orderDto.surrogate.getCreated_at() : timeDto, (i2 & 131072) != 0 ? orderDto.surrogate.getReceived_at() : timeDto2, (i2 & 262144) != 0 ? orderDto.surrogate.getLast_transaction_at() : timeDto3, (i2 & 524288) != 0 ? orderDto.surrogate.getExecutions() : list, (i2 & 1048576) != 0 ? orderDto.surrogate.getExtended_hours() : z, (i2 & 2097152) != 0 ? orderDto.surrogate.getStop_triggered_at() : timeDto4, (i2 & 4194304) != 0 ? orderDto.surrogate.getUser_currency() : uUIDDto4, (i2 & 8388608) != 0 ? orderDto.surrogate.getAsset_currency() : uUIDDto5, (i2 & 16777216) != 0 ? orderDto.surrogate.getType() : orderTypeDto, (i2 & 33554432) != 0 ? orderDto.surrogate.getUpdate_count() : i, (i2 & 67108864) != 0 ? orderDto.surrogate.getLegs() : list2, (i2 & 134217728) != 0 ? orderDto.surrogate.getLast_sent_at() : timeDto5, (i2 & 268435456) != 0 ? orderDto.surrogate.getFix_conn_id() : str2, (i2 & 536870912) != 0 ? orderDto.surrogate.getMarket_state() : marketStateDto, (i2 & 1073741824) != 0 ? orderDto.surrogate.getClearing_firm() : nullableStringDto, (i2 & Integer.MIN_VALUE) != 0 ? orderDto.surrogate.getResponse_text() : nullableStringDto2, (i3 & 1) != 0 ? orderDto.surrogate.getTo_cancel_at() : timeDto6, (i3 & 2) != 0 ? orderDto.surrogate.getTo_send_at() : timeDto7, (i3 & 4) != 0 ? orderDto.surrogate.getVenue_id() : nullableStringDto3, (i3 & 8) != 0 ? orderDto.surrogate.getCreated_agent() : agentDto, (i3 & 16) != 0 ? orderDto.surrogate.getCl_ord_id() : nullableStringDto4, (i3 & 32) != 0 ? orderDto.surrogate.getSend_logs() : list3, (i3 & 64) != 0 ? orderDto.surrogate.getCancel_open_agent() : agentDto2, (i3 & 128) != 0 ? orderDto.surrogate.getCancel_open_time() : timeDto8, (i3 & 256) != 0 ? orderDto.surrogate.getCancel_close_agent() : agentDto3, (i3 & 512) != 0 ? orderDto.surrogate.getCancel_close_time() : timeDto9, (i3 & 1024) != 0 ? orderDto.surrogate.getCreated_service() : clientServiceDto, (i3 & 2048) != 0 ? orderDto.surrogate.getCreated_affiliate() : affiliateDto, (i3 & 4096) != 0 ? orderDto.surrogate.getService_shard_id() : nullableIntDto, (i3 & 8192) != 0 ? orderDto.surrogate.getInstruments() : list4, (i3 & 16384) != 0 ? orderDto.surrogate.getResponse_category() : responseCategoryDto, (i3 & 32768) != 0 ? orderDto.surrogate.getMetadata() : orderMetadataDto, (i3 & 65536) != 0 ? orderDto.surrogate.getHandling_instructions() : list5, (i3 & 131072) != 0 ? orderDto.surrogate.getMarket_hours() : marketHoursDto, (i3 & 262144) != 0 ? orderDto.surrogate.getPro_trader() : nullableBoolDto, (i3 & 524288) != 0 ? orderDto.surrogate.getExpire_date() : dateDto, (i3 & 1048576) != 0 ? orderDto.surrogate.getInstruments_v2() : list6, (i3 & 2097152) != 0 ? orderDto.surrogate.getWaiting_category() : waitingCategoryDto, (i3 & 4194304) != 0 ? orderDto.surrogate.getForce_route() : nullableBoolDto2, (i3 & 8388608) != 0 ? orderDto.surrogate.getNotional() : decimalDto7, (i3 & 16777216) != 0 ? orderDto.surrogate.getMax_quantity() : decimalDto8, (i3 & 33554432) != 0 ? orderDto.surrogate.getReserved_buying_power() : decimalDto9, (i3 & 67108864) != 0 ? orderDto.surrogate.getInstrument_type() : instrumentTypeDto, (i3 & 134217728) != 0 ? orderDto.surrogate.getReplacement_order_id() : uUIDDto6, (i3 & 268435456) != 0 ? orderDto.surrogate.getChildMarkets() : list7, (i3 & 536870912) != 0 ? orderDto.surrogate.getQuantity_to_replace() : decimalDto10, (i3 & 1073741824) != 0 ? orderDto.surrogate.getList_root_id() : uUIDDto7, (i3 & Integer.MIN_VALUE) != 0 ? orderDto.surrogate.getAccount_type() : accountTypeDto, (i4 & 1) != 0 ? orderDto.surrogate.getMargin_mode() : marginModeDto, (i4 & 2) != 0 ? orderDto.surrogate.getLeverage() : decimalDto11, (i4 & 4) != 0 ? orderDto.surrogate.getReduce_only() : nullableBoolDto3, (i4 & 8) != 0 ? orderDto.surrogate.getCurrency_denomination() : currencyDenominationDto, (i4 & 16) != 0 ? orderDto.surrogate.getPosition_effect() : positionEffectDto, (i4 & 32) != 0 ? orderDto.surrogate.getPosition_id() : nullableStringDto5, (i4 & 64) != 0 ? orderDto.surrogate.getActive_ttl_seconds() : nullableIntDto2, (i4 & 128) != 0 ? orderDto.surrogate.getTo_expire_at() : timeDto10, (i4 & 256) != 0 ? orderDto.surrogate.getCapacity() : capacityDto, (i4 & 512) != 0 ? orderDto.surrogate.getForce_fix_line() : nullableStringDto6);
    }

    public final OrderDto copy(UUIDDto id, UUIDDto instrument_id, UUIDDto parent_order_id, String account_number, RouteDto route, SideDto side, DecimalDto price, DecimalDto stop_price, DecimalDto trailing_peg, DecimalDto last_trail_price, DecimalDto quantity, DecimalDto cancelled_quantity, PegTypeDto peg_type, OrderTriggerDto trigger, TimeInForceDto time_in_force, OrderStateDto state, TimeDto created_at, TimeDto received_at, TimeDto last_transaction_at, List<ExecutionDto> executions, boolean extended_hours, TimeDto stop_triggered_at, UUIDDto user_currency, UUIDDto asset_currency, OrderTypeDto type2, int update_count, List<OrderLegDto> legs, TimeDto last_sent_at, String fix_conn_id, MarketStateDto market_state, NullableStringDto clearing_firm, NullableStringDto response_text, TimeDto to_cancel_at, TimeDto to_send_at, NullableStringDto venue_id, AgentDto created_agent, NullableStringDto cl_ord_id, List<OrderSendLogDto> send_logs, AgentDto cancel_open_agent, TimeDto cancel_open_time, AgentDto cancel_close_agent, TimeDto cancel_close_time, ClientServiceDto created_service, AffiliateDto created_affiliate, NullableIntDto service_shard_id, List<InstrumentInfoDto> instruments, ResponseCategoryDto response_category, OrderMetadataDto metadata, List<? extends HandlingInstructionDto> handling_instructions, MarketHoursDto market_hours, NullableBoolDto pro_trader, DateDto expire_date, List<InstrumentInfoV2Dto> instruments_v2, WaitingCategoryDto waiting_category, NullableBoolDto force_route, DecimalDto notional, DecimalDto max_quantity, DecimalDto reserved_buying_power, InstrumentTypeDto instrument_type, UUIDDto replacement_order_id, List<String> ChildMarkets, DecimalDto quantity_to_replace, UUIDDto list_root_id, AccountTypeDto account_type, MarginModeDto margin_mode, DecimalDto leverage, NullableBoolDto reduce_only, CurrencyDenominationDto currency_denomination, PositionEffectDto position_effect, NullableStringDto position_id, NullableIntDto active_ttl_seconds, TimeDto to_expire_at, CapacityDto capacity, NullableStringDto force_fix_line) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(peg_type, "peg_type");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(executions, "executions");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(legs, "legs");
        Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
        Intrinsics.checkNotNullParameter(market_state, "market_state");
        Intrinsics.checkNotNullParameter(created_agent, "created_agent");
        Intrinsics.checkNotNullParameter(send_logs, "send_logs");
        Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
        Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
        Intrinsics.checkNotNullParameter(created_service, "created_service");
        Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(response_category, "response_category");
        Intrinsics.checkNotNullParameter(handling_instructions, "handling_instructions");
        Intrinsics.checkNotNullParameter(market_hours, "market_hours");
        Intrinsics.checkNotNullParameter(instruments_v2, "instruments_v2");
        Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(ChildMarkets, "ChildMarkets");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
        Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
        Intrinsics.checkNotNullParameter(position_effect, "position_effect");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        return new OrderDto(new Surrogate(id, instrument_id, parent_order_id, account_number, route, side, price, stop_price, trailing_peg, last_trail_price, quantity, cancelled_quantity, peg_type, trigger, time_in_force, state, created_at, received_at, last_transaction_at, executions, extended_hours, stop_triggered_at, user_currency, asset_currency, type2, update_count, legs, last_sent_at, fix_conn_id, market_state, clearing_firm, response_text, to_cancel_at, to_send_at, venue_id, created_agent, cl_ord_id, send_logs, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, created_service, created_affiliate, service_shard_id, instruments, response_category, metadata, handling_instructions, market_hours, pro_trader, expire_date, instruments_v2, waiting_category, force_route, notional, max_quantity, reserved_buying_power, instrument_type, replacement_order_id, ChildMarkets, quantity_to_replace, list_root_id, account_type, margin_mode, leverage, reduce_only, currency_denomination, position_effect, position_id, active_ttl_seconds, to_expire_at, capacity, force_fix_line));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Order toProto() {
        UUIDDto id = this.surrogate.getId();
        UUID proto = id != null ? id.toProto() : null;
        UUIDDto instrument_id = this.surrogate.getInstrument_id();
        UUID proto2 = instrument_id != null ? instrument_id.toProto() : null;
        UUIDDto parent_order_id = this.surrogate.getParent_order_id();
        UUID proto3 = parent_order_id != null ? parent_order_id.toProto() : null;
        String account_number = this.surrogate.getAccount_number();
        Route route = (Route) this.surrogate.getRoute().toProto();
        Side side = (Side) this.surrogate.getSide().toProto();
        DecimalDto price = this.surrogate.getPrice();
        Decimal proto4 = price != null ? price.toProto() : null;
        DecimalDto stop_price = this.surrogate.getStop_price();
        Decimal proto5 = stop_price != null ? stop_price.toProto() : null;
        DecimalDto trailing_peg = this.surrogate.getTrailing_peg();
        Decimal proto6 = trailing_peg != null ? trailing_peg.toProto() : null;
        DecimalDto last_trail_price = this.surrogate.getLast_trail_price();
        Decimal proto7 = last_trail_price != null ? last_trail_price.toProto() : null;
        DecimalDto quantity = this.surrogate.getQuantity();
        Decimal proto8 = quantity != null ? quantity.toProto() : null;
        DecimalDto cancelled_quantity = this.surrogate.getCancelled_quantity();
        Decimal proto9 = cancelled_quantity != null ? cancelled_quantity.toProto() : null;
        PegType pegType = (PegType) this.surrogate.getPeg_type().toProto();
        OrderTrigger orderTrigger = (OrderTrigger) this.surrogate.getTrigger().toProto();
        TimeInForce timeInForce = (TimeInForce) this.surrogate.getTime_in_force().toProto();
        OrderState orderState = (OrderState) this.surrogate.getState().toProto();
        TimeDto created_at = this.surrogate.getCreated_at();
        Time proto10 = created_at != null ? created_at.toProto() : null;
        TimeDto received_at = this.surrogate.getReceived_at();
        Time proto11 = received_at != null ? received_at.toProto() : null;
        TimeDto last_transaction_at = this.surrogate.getLast_transaction_at();
        Time proto12 = last_transaction_at != null ? last_transaction_at.toProto() : null;
        List<ExecutionDto> executions = this.surrogate.getExecutions();
        UUID uuid = proto;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
        Iterator<T> it = executions.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExecutionDto) it.next()).toProto());
        }
        boolean extended_hours = this.surrogate.getExtended_hours();
        TimeDto stop_triggered_at = this.surrogate.getStop_triggered_at();
        Time proto13 = stop_triggered_at != null ? stop_triggered_at.toProto() : null;
        UUIDDto user_currency = this.surrogate.getUser_currency();
        UUID proto14 = user_currency != null ? user_currency.toProto() : null;
        UUIDDto asset_currency = this.surrogate.getAsset_currency();
        UUID proto15 = asset_currency != null ? asset_currency.toProto() : null;
        OrderType orderType = (OrderType) this.surrogate.getType().toProto();
        int update_count = this.surrogate.getUpdate_count();
        List<OrderLegDto> legs = this.surrogate.getLegs();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
        Iterator<T> it2 = legs.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((OrderLegDto) it2.next()).toProto());
        }
        TimeDto last_sent_at = this.surrogate.getLast_sent_at();
        Time proto16 = last_sent_at != null ? last_sent_at.toProto() : null;
        String fix_conn_id = this.surrogate.getFix_conn_id();
        MarketState marketState = (MarketState) this.surrogate.getMarket_state().toProto();
        NullableStringDto clearing_firm = this.surrogate.getClearing_firm();
        NullableString proto17 = clearing_firm != null ? clearing_firm.toProto() : null;
        NullableStringDto response_text = this.surrogate.getResponse_text();
        NullableString proto18 = response_text != null ? response_text.toProto() : null;
        TimeDto to_cancel_at = this.surrogate.getTo_cancel_at();
        Time proto19 = to_cancel_at != null ? to_cancel_at.toProto() : null;
        TimeDto to_send_at = this.surrogate.getTo_send_at();
        Time proto20 = to_send_at != null ? to_send_at.toProto() : null;
        NullableStringDto venue_id = this.surrogate.getVenue_id();
        NullableString proto21 = venue_id != null ? venue_id.toProto() : null;
        Agent agent = (Agent) this.surrogate.getCreated_agent().toProto();
        NullableStringDto cl_ord_id = this.surrogate.getCl_ord_id();
        NullableString proto22 = cl_ord_id != null ? cl_ord_id.toProto() : null;
        List<OrderSendLogDto> send_logs = this.surrogate.getSend_logs();
        Time time = proto16;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(send_logs, 10));
        Iterator<T> it3 = send_logs.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((OrderSendLogDto) it3.next()).toProto());
        }
        Agent agent2 = (Agent) this.surrogate.getCancel_open_agent().toProto();
        TimeDto cancel_open_time = this.surrogate.getCancel_open_time();
        Time proto23 = cancel_open_time != null ? cancel_open_time.toProto() : null;
        Agent agent3 = (Agent) this.surrogate.getCancel_close_agent().toProto();
        TimeDto cancel_close_time = this.surrogate.getCancel_close_time();
        Time proto24 = cancel_close_time != null ? cancel_close_time.toProto() : null;
        ClientService clientService = (ClientService) this.surrogate.getCreated_service().toProto();
        Affiliate affiliate = (Affiliate) this.surrogate.getCreated_affiliate().toProto();
        NullableIntDto service_shard_id = this.surrogate.getService_shard_id();
        NullableInt proto25 = service_shard_id != null ? service_shard_id.toProto() : null;
        List<InstrumentInfoDto> instruments = this.surrogate.getInstruments();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instruments, 10));
        Iterator<T> it4 = instruments.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((InstrumentInfoDto) it4.next()).toProto());
        }
        ResponseCategory responseCategory = (ResponseCategory) this.surrogate.getResponse_category().toProto();
        OrderMetadataDto metadata = this.surrogate.getMetadata();
        OrderMetadata proto26 = metadata != null ? metadata.toProto() : null;
        List<HandlingInstructionDto> handling_instructions = this.surrogate.getHandling_instructions();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(handling_instructions, 10));
        Iterator<T> it5 = handling_instructions.iterator();
        while (it5.hasNext()) {
            arrayList5.add((HandlingInstruction) ((HandlingInstructionDto) it5.next()).toProto());
        }
        MarketHours marketHours = (MarketHours) this.surrogate.getMarket_hours().toProto();
        NullableBoolDto pro_trader = this.surrogate.getPro_trader();
        NullableBool proto27 = pro_trader != null ? pro_trader.toProto() : null;
        DateDto expire_date = this.surrogate.getExpire_date();
        Date proto28 = expire_date != null ? expire_date.toProto() : null;
        List<InstrumentInfoV2Dto> instruments_v2 = this.surrogate.getInstruments_v2();
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instruments_v2, 10));
        Iterator<T> it6 = instruments_v2.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((InstrumentInfoV2Dto) it6.next()).toProto());
        }
        WaitingCategory waitingCategory = (WaitingCategory) this.surrogate.getWaiting_category().toProto();
        NullableBoolDto force_route = this.surrogate.getForce_route();
        NullableBool proto29 = force_route != null ? force_route.toProto() : null;
        DecimalDto notional = this.surrogate.getNotional();
        Decimal proto30 = notional != null ? notional.toProto() : null;
        DecimalDto max_quantity = this.surrogate.getMax_quantity();
        Decimal proto31 = max_quantity != null ? max_quantity.toProto() : null;
        DecimalDto reserved_buying_power = this.surrogate.getReserved_buying_power();
        Decimal proto32 = reserved_buying_power != null ? reserved_buying_power.toProto() : null;
        InstrumentType instrumentType = (InstrumentType) this.surrogate.getInstrument_type().toProto();
        UUIDDto replacement_order_id = this.surrogate.getReplacement_order_id();
        UUID proto33 = replacement_order_id != null ? replacement_order_id.toProto() : null;
        List<String> childMarkets = this.surrogate.getChildMarkets();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(childMarkets, 10));
        Iterator<T> it7 = childMarkets.iterator();
        while (it7.hasNext()) {
            arrayList7.add((String) it7.next());
        }
        DecimalDto quantity_to_replace = this.surrogate.getQuantity_to_replace();
        Decimal proto34 = quantity_to_replace != null ? quantity_to_replace.toProto() : null;
        UUIDDto list_root_id = this.surrogate.getList_root_id();
        UUID proto35 = list_root_id != null ? list_root_id.toProto() : null;
        AccountType accountType = (AccountType) this.surrogate.getAccount_type().toProto();
        MarginMode marginMode = (MarginMode) this.surrogate.getMargin_mode().toProto();
        DecimalDto leverage = this.surrogate.getLeverage();
        Decimal proto36 = leverage != null ? leverage.toProto() : null;
        NullableBoolDto reduce_only = this.surrogate.getReduce_only();
        NullableBool proto37 = reduce_only != null ? reduce_only.toProto() : null;
        CurrencyDenomination currencyDenomination = (CurrencyDenomination) this.surrogate.getCurrency_denomination().toProto();
        PositionEffect positionEffect = (PositionEffect) this.surrogate.getPosition_effect().toProto();
        NullableStringDto position_id = this.surrogate.getPosition_id();
        NullableString proto38 = position_id != null ? position_id.toProto() : null;
        NullableIntDto active_ttl_seconds = this.surrogate.getActive_ttl_seconds();
        NullableInt proto39 = active_ttl_seconds != null ? active_ttl_seconds.toProto() : null;
        TimeDto to_expire_at = this.surrogate.getTo_expire_at();
        Time proto40 = to_expire_at != null ? to_expire_at.toProto() : null;
        Capacity capacity = (Capacity) this.surrogate.getCapacity().toProto();
        NullableStringDto force_fix_line = this.surrogate.getForce_fix_line();
        return new Order(uuid, proto2, proto3, account_number, route, side, proto4, proto5, proto6, proto7, proto8, proto9, pegType, orderTrigger, timeInForce, orderState, proto10, proto11, proto12, arrayList, extended_hours, proto13, proto14, proto15, orderType, update_count, arrayList2, time, fix_conn_id, marketState, proto17, proto18, proto19, proto20, proto21, agent, proto22, arrayList3, agent2, proto23, agent3, proto24, clientService, affiliate, proto25, arrayList4, responseCategory, proto26, arrayList5, marketHours, proto27, proto28, arrayList6, waitingCategory, proto29, proto30, proto31, proto32, instrumentType, proto33, arrayList7, proto34, proto35, accountType, marginMode, proto36, proto37, currencyDenomination, positionEffect, proto38, proto39, proto40, capacity, force_fix_line != null ? force_fix_line.toProto() : null, null, 0, 0, 1024, null);
    }

    public String toString() {
        return "[OrderDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OrderDto) && Intrinsics.areEqual(((OrderDto) other).surrogate, this.surrogate);
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
    /* compiled from: OrderDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000¯\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0003\b\u0086\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u008a\u00032\u00020\u0001:\u0004\u0089\u0003\u008a\u0003Bö\u0006\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010'\u001a\u00020(\u0012\u0017\b\u0002\u0010)\u001a\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\t0-\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 \u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u00101\u001a\u00020\u0007\u0012\b\b\u0002\u00102\u001a\u000203\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000105\u0012\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020>0 \u0012\b\b\u0002\u0010?\u001a\u00020;\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010A\u001a\u00020;\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010C\u001a\u00020D\u0012\b\b\u0002\u0010E\u001a\u00020F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 \u0012\b\b\u0002\u0010K\u001a\u00020L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020P0 \u0012\b\b\u0002\u0010Q\u001a\u00020R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V\u0012\u000e\b\u0002\u0010W\u001a\b\u0012\u0004\u0012\u00020X0 \u0012\b\b\u0002\u0010Y\u001a\u00020Z\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010_\u001a\u00020`\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070 \u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010e\u001a\u00020f\u0012\b\b\u0002\u0010g\u001a\u00020h\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010T\u0012\b\b\u0002\u0010k\u001a\u00020l\u0012\b\b\u0002\u0010m\u001a\u00020n\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010r\u001a\u00020s\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u000105¢\u0006\u0004\bu\u0010vBµ\u0006\b\u0010\u0012\u0006\u0010w\u001a\u00020*\u0012\u0006\u0010x\u001a\u00020*\u0012\u0006\u0010y\u001a\u00020*\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020#\u0012\b\u0010$\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020*\u0012\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010 \u0012\b\u00100\u001a\u0004\u0018\u00010\u001c\u0012\b\u00101\u001a\u0004\u0018\u00010\u0007\u0012\b\u00102\u001a\u0004\u0018\u000103\u0012\b\u00104\u001a\u0004\u0018\u000105\u0012\b\u00106\u001a\u0004\u0018\u000105\u0012\b\u00107\u001a\u0004\u0018\u00010\u001c\u0012\b\u00108\u001a\u0004\u0018\u00010\u001c\u0012\b\u00109\u001a\u0004\u0018\u000105\u0012\b\u0010:\u001a\u0004\u0018\u00010;\u0012\b\u0010<\u001a\u0004\u0018\u000105\u0012\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010 \u0012\b\u0010?\u001a\u0004\u0018\u00010;\u0012\b\u0010@\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010A\u001a\u0004\u0018\u00010;\u0012\b\u0010B\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010C\u001a\u0004\u0018\u00010D\u0012\b\u0010E\u001a\u0004\u0018\u00010F\u0012\b\u0010G\u001a\u0004\u0018\u00010H\u0012\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010 \u0012\b\u0010K\u001a\u0004\u0018\u00010L\u0012\b\u0010M\u001a\u0004\u0018\u00010N\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010 \u0012\b\u0010Q\u001a\u0004\u0018\u00010R\u0012\b\u0010S\u001a\u0004\u0018\u00010T\u0012\b\u0010U\u001a\u0004\u0018\u00010V\u0012\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010 \u0012\b\u0010Y\u001a\u0004\u0018\u00010Z\u0012\b\u0010[\u001a\u0004\u0018\u00010T\u0012\b\u0010\\\u001a\u0004\u0018\u00010\r\u0012\b\u0010]\u001a\u0004\u0018\u00010\r\u0012\b\u0010^\u001a\u0004\u0018\u00010\r\u0012\b\u0010_\u001a\u0004\u0018\u00010`\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010 \u0012\b\u0010c\u001a\u0004\u0018\u00010\r\u0012\b\u0010d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010e\u001a\u0004\u0018\u00010f\u0012\b\u0010g\u001a\u0004\u0018\u00010h\u0012\b\u0010i\u001a\u0004\u0018\u00010\r\u0012\b\u0010j\u001a\u0004\u0018\u00010T\u0012\b\u0010k\u001a\u0004\u0018\u00010l\u0012\b\u0010m\u001a\u0004\u0018\u00010n\u0012\b\u0010o\u001a\u0004\u0018\u000105\u0012\b\u0010p\u001a\u0004\u0018\u00010H\u0012\b\u0010q\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010r\u001a\u0004\u0018\u00010s\u0012\b\u0010t\u001a\u0004\u0018\u000105\u0012\b\u0010z\u001a\u0004\u0018\u00010{¢\u0006\u0004\bu\u0010|J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010µ\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010¶\u0002\u001a\u00020\tHÆ\u0003J\n\u0010·\u0002\u001a\u00020\u000bHÆ\u0003J\f\u0010¸\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010¹\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010º\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010»\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010¼\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010½\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010¾\u0002\u001a\u00020\u0014HÆ\u0003J\n\u0010¿\u0002\u001a\u00020\u0016HÆ\u0003J\n\u0010À\u0002\u001a\u00020\u0018HÆ\u0003J\n\u0010Á\u0002\u001a\u00020\u001aHÆ\u0003J\f\u0010Â\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Ã\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Ä\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u0010\u0010Å\u0002\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0003J\n\u0010Æ\u0002\u001a\u00020#HÆ\u0003J\f\u0010Ç\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010È\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ê\u0002\u001a\u00020(HÆ\u0003J\u0019\u0010Ë\u0002\u001a\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\t0-HÆ\u0003J\u0010\u0010Ì\u0002\u001a\b\u0012\u0004\u0012\u00020/0 HÆ\u0003J\f\u0010Í\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010Î\u0002\u001a\u00020\u0007HÆ\u0003J\n\u0010Ï\u0002\u001a\u000203HÆ\u0003J\f\u0010Ð\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010Ñ\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010Ò\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Ó\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010Ô\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\n\u0010Õ\u0002\u001a\u00020;HÆ\u0003J\f\u0010Ö\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\u0010\u0010×\u0002\u001a\b\u0012\u0004\u0012\u00020>0 HÆ\u0003J\n\u0010Ø\u0002\u001a\u00020;HÆ\u0003J\f\u0010Ù\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010Ú\u0002\u001a\u00020;HÆ\u0003J\f\u0010Û\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010Ü\u0002\u001a\u00020DHÆ\u0003J\n\u0010Ý\u0002\u001a\u00020FHÆ\u0003J\f\u0010Þ\u0002\u001a\u0004\u0018\u00010HHÆ\u0003J\u0010\u0010ß\u0002\u001a\b\u0012\u0004\u0012\u00020J0 HÆ\u0003J\n\u0010à\u0002\u001a\u00020LHÆ\u0003J\f\u0010á\u0002\u001a\u0004\u0018\u00010NHÆ\u0003J\u0010\u0010â\u0002\u001a\b\u0012\u0004\u0012\u00020P0 HÆ\u0003J\n\u0010ã\u0002\u001a\u00020RHÆ\u0003J\f\u0010ä\u0002\u001a\u0004\u0018\u00010THÆ\u0003J\f\u0010å\u0002\u001a\u0004\u0018\u00010VHÆ\u0003J\u0010\u0010æ\u0002\u001a\b\u0012\u0004\u0012\u00020X0 HÆ\u0003J\n\u0010ç\u0002\u001a\u00020ZHÆ\u0003J\f\u0010è\u0002\u001a\u0004\u0018\u00010THÆ\u0003J\f\u0010é\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010ê\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010ë\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\n\u0010ì\u0002\u001a\u00020`HÆ\u0003J\f\u0010í\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010î\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070 HÆ\u0003J\f\u0010ï\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010ð\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010ñ\u0002\u001a\u00020fHÆ\u0003J\n\u0010ò\u0002\u001a\u00020hHÆ\u0003J\f\u0010ó\u0002\u001a\u0004\u0018\u00010\rHÆ\u0003J\f\u0010ô\u0002\u001a\u0004\u0018\u00010THÆ\u0003J\n\u0010õ\u0002\u001a\u00020lHÆ\u0003J\n\u0010ö\u0002\u001a\u00020nHÆ\u0003J\f\u0010÷\u0002\u001a\u0004\u0018\u000105HÆ\u0003J\f\u0010ø\u0002\u001a\u0004\u0018\u00010HHÆ\u0003J\f\u0010ù\u0002\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\n\u0010ú\u0002\u001a\u00020sHÆ\u0003J\f\u0010û\u0002\u001a\u0004\u0018\u000105HÆ\u0003Jù\u0006\u0010ü\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020(2\u0017\b\u0002\u0010)\u001a\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\t0-2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u00101\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u0002032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00109\u001a\u0004\u0018\u0001052\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u0001052\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020>0 2\b\b\u0002\u0010?\u001a\u00020;2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010A\u001a\u00020;2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 2\b\b\u0002\u0010K\u001a\u00020L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u000e\b\u0002\u0010O\u001a\b\u0012\u0004\u0012\u00020P0 2\b\b\u0002\u0010Q\u001a\u00020R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\u000e\b\u0002\u0010W\u001a\b\u0012\u0004\u0012\u00020X0 2\b\b\u0002\u0010Y\u001a\u00020Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010_\u001a\u00020`2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070 2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010e\u001a\u00020f2\b\b\u0002\u0010g\u001a\u00020h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010k\u001a\u00020l2\b\b\u0002\u0010m\u001a\u00020n2\n\b\u0002\u0010o\u001a\u0004\u0018\u0001052\n\b\u0002\u0010p\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010r\u001a\u00020s2\n\b\u0002\u0010t\u001a\u0004\u0018\u000105HÆ\u0001J\u0015\u0010ý\u0002\u001a\u00020#2\t\u0010þ\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010ÿ\u0002\u001a\u00020*HÖ\u0001J\n\u0010\u0080\u0003\u001a\u00020\u0007HÖ\u0001J-\u0010\u0081\u0003\u001a\u00030\u0082\u00032\u0007\u0010\u0083\u0003\u001a\u00020\u00002\b\u0010\u0084\u0003\u001a\u00030\u0085\u00032\b\u0010\u0086\u0003\u001a\u00030\u0087\u0003H\u0001¢\u0006\u0003\b\u0088\u0003R\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0000\u0012\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R!\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0081\u0001\u0010~\u001a\u0006\b\u0082\u0001\u0010\u0080\u0001R!\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0083\u0001\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001R\u001f\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0085\u0001\u0010~\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0088\u0001\u0010~\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001f\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008b\u0001\u0010~\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R!\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008e\u0001\u0010~\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R!\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0091\u0001\u0010~\u001a\u0006\b\u0092\u0001\u0010\u0090\u0001R!\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0093\u0001\u0010~\u001a\u0006\b\u0094\u0001\u0010\u0090\u0001R!\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0095\u0001\u0010~\u001a\u0006\b\u0096\u0001\u0010\u0090\u0001R!\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0097\u0001\u0010~\u001a\u0006\b\u0098\u0001\u0010\u0090\u0001R!\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0099\u0001\u0010~\u001a\u0006\b\u009a\u0001\u0010\u0090\u0001R\u001f\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009b\u0001\u0010~\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001f\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009e\u0001\u0010~\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¡\u0001\u0010~\u001a\u0006\b¢\u0001\u0010£\u0001R\u001f\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¤\u0001\u0010~\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b§\u0001\u0010~\u001a\u0006\b¨\u0001\u0010©\u0001R!\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bª\u0001\u0010~\u001a\u0006\b«\u0001\u0010©\u0001R!\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¬\u0001\u0010~\u001a\u0006\b\u00ad\u0001\u0010©\u0001R%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b®\u0001\u0010~\u001a\u0006\b¯\u0001\u0010°\u0001R\u001f\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b±\u0001\u0010~\u001a\u0006\b²\u0001\u0010³\u0001R!\u0010$\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b´\u0001\u0010~\u001a\u0006\bµ\u0001\u0010©\u0001R!\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¶\u0001\u0010~\u001a\u0006\b·\u0001\u0010\u0080\u0001R!\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¸\u0001\u0010~\u001a\u0006\b¹\u0001\u0010\u0080\u0001R\u001f\u0010'\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bº\u0001\u0010~\u001a\u0006\b»\u0001\u0010¼\u0001R.\u0010)\u001a\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\t0-8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b½\u0001\u0010~\u001a\u0006\b¾\u0001\u0010¿\u0001R%\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÀ\u0001\u0010~\u001a\u0006\bÁ\u0001\u0010°\u0001R!\u00100\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÂ\u0001\u0010~\u001a\u0006\bÃ\u0001\u0010©\u0001R\u001f\u00101\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÄ\u0001\u0010~\u001a\u0006\bÅ\u0001\u0010\u0087\u0001R\u001f\u00102\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÆ\u0001\u0010~\u001a\u0006\bÇ\u0001\u0010È\u0001R!\u00104\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÉ\u0001\u0010~\u001a\u0006\bÊ\u0001\u0010Ë\u0001R!\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÌ\u0001\u0010~\u001a\u0006\bÍ\u0001\u0010Ë\u0001R!\u00107\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÎ\u0001\u0010~\u001a\u0006\bÏ\u0001\u0010©\u0001R!\u00108\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÐ\u0001\u0010~\u001a\u0006\bÑ\u0001\u0010©\u0001R!\u00109\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÒ\u0001\u0010~\u001a\u0006\bÓ\u0001\u0010Ë\u0001R\u001f\u0010:\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÔ\u0001\u0010~\u001a\u0006\bÕ\u0001\u0010Ö\u0001R!\u0010<\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b×\u0001\u0010~\u001a\u0006\bØ\u0001\u0010Ë\u0001R%\u0010=\u001a\b\u0012\u0004\u0012\u00020>0 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÙ\u0001\u0010~\u001a\u0006\bÚ\u0001\u0010°\u0001R\u001f\u0010?\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÛ\u0001\u0010~\u001a\u0006\bÜ\u0001\u0010Ö\u0001R!\u0010@\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÝ\u0001\u0010~\u001a\u0006\bÞ\u0001\u0010©\u0001R\u001f\u0010A\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bß\u0001\u0010~\u001a\u0006\bà\u0001\u0010Ö\u0001R!\u0010B\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bá\u0001\u0010~\u001a\u0006\bâ\u0001\u0010©\u0001R\u001f\u0010C\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bã\u0001\u0010~\u001a\u0006\bä\u0001\u0010å\u0001R\u001f\u0010E\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bæ\u0001\u0010~\u001a\u0006\bç\u0001\u0010è\u0001R!\u0010G\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bé\u0001\u0010~\u001a\u0006\bê\u0001\u0010ë\u0001R%\u0010I\u001a\b\u0012\u0004\u0012\u00020J0 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bì\u0001\u0010~\u001a\u0006\bí\u0001\u0010°\u0001R\u001f\u0010K\u001a\u00020L8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bî\u0001\u0010~\u001a\u0006\bï\u0001\u0010ð\u0001R!\u0010M\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bñ\u0001\u0010~\u001a\u0006\bò\u0001\u0010ó\u0001R%\u0010O\u001a\b\u0012\u0004\u0012\u00020P0 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bô\u0001\u0010~\u001a\u0006\bõ\u0001\u0010°\u0001R\u001f\u0010Q\u001a\u00020R8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bö\u0001\u0010~\u001a\u0006\b÷\u0001\u0010ø\u0001R!\u0010S\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bù\u0001\u0010~\u001a\u0006\bú\u0001\u0010û\u0001R!\u0010U\u001a\u0004\u0018\u00010V8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bü\u0001\u0010~\u001a\u0006\bý\u0001\u0010þ\u0001R%\u0010W\u001a\b\u0012\u0004\u0012\u00020X0 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\bÿ\u0001\u0010~\u001a\u0006\b\u0080\u0002\u0010°\u0001R\u001f\u0010Y\u001a\u00020Z8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0081\u0002\u0010~\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R!\u0010[\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0084\u0002\u0010~\u001a\u0006\b\u0085\u0002\u0010û\u0001R!\u0010\\\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0086\u0002\u0010~\u001a\u0006\b\u0087\u0002\u0010\u0090\u0001R!\u0010]\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0088\u0002\u0010~\u001a\u0006\b\u0089\u0002\u0010\u0090\u0001R!\u0010^\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008a\u0002\u0010~\u001a\u0006\b\u008b\u0002\u0010\u0090\u0001R\u001f\u0010_\u001a\u00020`8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008c\u0002\u0010~\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R!\u0010a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u008f\u0002\u0010~\u001a\u0006\b\u0090\u0002\u0010\u0080\u0001R%\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070 8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0091\u0002\u0010~\u001a\u0006\b\u0092\u0002\u0010°\u0001R!\u0010c\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0093\u0002\u0010~\u001a\u0006\b\u0094\u0002\u0010\u0090\u0001R!\u0010d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0095\u0002\u0010~\u001a\u0006\b\u0096\u0002\u0010\u0080\u0001R\u001f\u0010e\u001a\u00020f8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u0097\u0002\u0010~\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u001f\u0010g\u001a\u00020h8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009a\u0002\u0010~\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R!\u0010i\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009d\u0002\u0010~\u001a\u0006\b\u009e\u0002\u0010\u0090\u0001R!\u0010j\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u009f\u0002\u0010~\u001a\u0006\b \u0002\u0010û\u0001R\u001f\u0010k\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¡\u0002\u0010~\u001a\u0006\b¢\u0002\u0010£\u0002R\u001f\u0010m\u001a\u00020n8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b¤\u0002\u0010~\u001a\u0006\b¥\u0002\u0010¦\u0002R!\u0010o\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b§\u0002\u0010~\u001a\u0006\b¨\u0002\u0010Ë\u0001R!\u0010p\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b©\u0002\u0010~\u001a\u0006\bª\u0002\u0010ë\u0001R!\u0010q\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b«\u0002\u0010~\u001a\u0006\b¬\u0002\u0010©\u0001R\u001f\u0010r\u001a\u00020s8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b\u00ad\u0002\u0010~\u001a\u0006\b®\u0002\u0010¯\u0002R!\u0010t\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0005\b°\u0002\u0010~\u001a\u0006\b±\u0002\u0010Ë\u0001¨\u0006\u008b\u0003"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderDto$Surrogate;", "", "id", "Lcom/robinhood/rosetta/mainst/UUIDDto;", "instrument_id", "parent_order_id", "account_number", "", PlaceTypes.ROUTE, "Lrosetta/mainst/RouteDto;", "side", "Lrosetta/mainst/SideDto;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/DecimalDto;", "stop_price", "trailing_peg", "last_trail_price", "quantity", "cancelled_quantity", "peg_type", "Lrosetta/order/PegTypeDto;", "trigger", "Lrosetta/mainst/OrderTriggerDto;", "time_in_force", "Lrosetta/mainst/TimeInForceDto;", "state", "Lrosetta/mainst/OrderStateDto;", "created_at", "Lcom/robinhood/rosetta/mainst/TimeDto;", "received_at", "last_transaction_at", "executions", "", "Lcom/robinhood/rosetta/mainst/ExecutionDto;", "extended_hours", "", "stop_triggered_at", "user_currency", "asset_currency", "type", "Lrosetta/mainst/OrderTypeDto;", "update_count", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "legs", "Lcom/robinhood/rosetta/mainst/OrderLegDto;", "last_sent_at", "fix_conn_id", "market_state", "Lrosetta/mainst/MarketStateDto;", "clearing_firm", "Lcom/robinhood/rosetta/mainst/NullableStringDto;", "response_text", "to_cancel_at", "to_send_at", "venue_id", "created_agent", "Lrosetta/order/AgentDto;", "cl_ord_id", "send_logs", "Lcom/robinhood/rosetta/mainst/OrderSendLogDto;", "cancel_open_agent", "cancel_open_time", "cancel_close_agent", "cancel_close_time", "created_service", "Lrosetta/order/ClientServiceDto;", "created_affiliate", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableIntDto;", "instruments", "Lcom/robinhood/rosetta/mainst/InstrumentInfoDto;", "response_category", "Lrosetta/order/ResponseCategoryDto;", "metadata", "Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "handling_instructions", "Lrosetta/order/HandlingInstructionDto;", "market_hours", "Lrosetta/order/MarketHoursDto;", "pro_trader", "Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "expire_date", "Lcom/robinhood/rosetta/common/DateDto;", "instruments_v2", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2Dto;", "waiting_category", "Lrosetta/order/WaitingCategoryDto;", "force_route", "notional", "max_quantity", "reserved_buying_power", "instrument_type", "Lrosetta/mainst/InstrumentTypeDto;", "replacement_order_id", "ChildMarkets", "quantity_to_replace", "list_root_id", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/order/AccountTypeDto;", "margin_mode", "Lrosetta/mainst/MarginModeDto;", "leverage", "reduce_only", "currency_denomination", "Lrosetta/order/CurrencyDenominationDto;", "position_effect", "Lrosetta/mainst/PositionEffectDto;", "position_id", "active_ttl_seconds", "to_expire_at", "capacity", "Lrosetta/mainst/CapacityDto;", "force_fix_line", "<init>", "(Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/order/PegTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/List;ZLcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderTypeDto;ILjava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lrosetta/mainst/MarketStateDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/util/List;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/ClientServiceDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Ljava/util/List;Lrosetta/order/ResponseCategoryDto;Lcom/robinhood/rosetta/mainst/OrderMetadataDto;Ljava/util/List;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/util/List;Lrosetta/order/WaitingCategoryDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/order/AccountTypeDto;Lrosetta/mainst/MarginModeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lrosetta/order/CurrencyDenominationDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;)V", "seen0", "seen1", "seen2", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/lang/String;Lrosetta/mainst/RouteDto;Lrosetta/mainst/SideDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/order/PegTypeDto;Lrosetta/mainst/OrderTriggerDto;Lrosetta/mainst/TimeInForceDto;Lrosetta/mainst/OrderStateDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/util/List;ZLcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/mainst/OrderTypeDto;ILjava/util/List;Lcom/robinhood/rosetta/mainst/TimeDto;Ljava/lang/String;Lrosetta/mainst/MarketStateDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Ljava/util/List;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/AgentDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/order/ClientServiceDto;Lcom/robinhood/rosetta/i18n/AffiliateDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Ljava/util/List;Lrosetta/order/ResponseCategoryDto;Lcom/robinhood/rosetta/mainst/OrderMetadataDto;Ljava/util/List;Lrosetta/order/MarketHoursDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/common/DateDto;Ljava/util/List;Lrosetta/order/WaitingCategoryDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lrosetta/mainst/InstrumentTypeDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Ljava/util/List;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/UUIDDto;Lrosetta/order/AccountTypeDto;Lrosetta/mainst/MarginModeDto;Lcom/robinhood/rosetta/mainst/DecimalDto;Lcom/robinhood/rosetta/mainst/NullableBoolDto;Lrosetta/order/CurrencyDenominationDto;Lrosetta/mainst/PositionEffectDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lcom/robinhood/rosetta/mainst/NullableIntDto;Lcom/robinhood/rosetta/mainst/TimeDto;Lrosetta/mainst/CapacityDto;Lcom/robinhood/rosetta/mainst/NullableStringDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Lcom/robinhood/rosetta/mainst/UUIDDto;", "getInstrument_id$annotations", "getInstrument_id", "getParent_order_id$annotations", "getParent_order_id", "getAccount_number$annotations", "getAccount_number", "()Ljava/lang/String;", "getRoute$annotations", "getRoute", "()Lrosetta/mainst/RouteDto;", "getSide$annotations", "getSide", "()Lrosetta/mainst/SideDto;", "getPrice$annotations", "getPrice", "()Lcom/robinhood/rosetta/mainst/DecimalDto;", "getStop_price$annotations", "getStop_price", "getTrailing_peg$annotations", "getTrailing_peg", "getLast_trail_price$annotations", "getLast_trail_price", "getQuantity$annotations", "getQuantity", "getCancelled_quantity$annotations", "getCancelled_quantity", "getPeg_type$annotations", "getPeg_type", "()Lrosetta/order/PegTypeDto;", "getTrigger$annotations", "getTrigger", "()Lrosetta/mainst/OrderTriggerDto;", "getTime_in_force$annotations", "getTime_in_force", "()Lrosetta/mainst/TimeInForceDto;", "getState$annotations", "getState", "()Lrosetta/mainst/OrderStateDto;", "getCreated_at$annotations", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/TimeDto;", "getReceived_at$annotations", "getReceived_at", "getLast_transaction_at$annotations", "getLast_transaction_at", "getExecutions$annotations", "getExecutions", "()Ljava/util/List;", "getExtended_hours$annotations", "getExtended_hours", "()Z", "getStop_triggered_at$annotations", "getStop_triggered_at", "getUser_currency$annotations", "getUser_currency", "getAsset_currency$annotations", "getAsset_currency", "getType$annotations", "getType", "()Lrosetta/mainst/OrderTypeDto;", "getUpdate_count$annotations", "getUpdate_count", "()I", "getLegs$annotations", "getLegs", "getLast_sent_at$annotations", "getLast_sent_at", "getFix_conn_id$annotations", "getFix_conn_id", "getMarket_state$annotations", "getMarket_state", "()Lrosetta/mainst/MarketStateDto;", "getClearing_firm$annotations", "getClearing_firm", "()Lcom/robinhood/rosetta/mainst/NullableStringDto;", "getResponse_text$annotations", "getResponse_text", "getTo_cancel_at$annotations", "getTo_cancel_at", "getTo_send_at$annotations", "getTo_send_at", "getVenue_id$annotations", "getVenue_id", "getCreated_agent$annotations", "getCreated_agent", "()Lrosetta/order/AgentDto;", "getCl_ord_id$annotations", "getCl_ord_id", "getSend_logs$annotations", "getSend_logs", "getCancel_open_agent$annotations", "getCancel_open_agent", "getCancel_open_time$annotations", "getCancel_open_time", "getCancel_close_agent$annotations", "getCancel_close_agent", "getCancel_close_time$annotations", "getCancel_close_time", "getCreated_service$annotations", "getCreated_service", "()Lrosetta/order/ClientServiceDto;", "getCreated_affiliate$annotations", "getCreated_affiliate", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "getService_shard_id$annotations", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableIntDto;", "getInstruments$annotations", "getInstruments", "getResponse_category$annotations", "getResponse_category", "()Lrosetta/order/ResponseCategoryDto;", "getMetadata$annotations", "getMetadata", "()Lcom/robinhood/rosetta/mainst/OrderMetadataDto;", "getHandling_instructions$annotations", "getHandling_instructions", "getMarket_hours$annotations", "getMarket_hours", "()Lrosetta/order/MarketHoursDto;", "getPro_trader$annotations", "getPro_trader", "()Lcom/robinhood/rosetta/mainst/NullableBoolDto;", "getExpire_date$annotations", "getExpire_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getInstruments_v2$annotations", "getInstruments_v2", "getWaiting_category$annotations", "getWaiting_category", "()Lrosetta/order/WaitingCategoryDto;", "getForce_route$annotations", "getForce_route", "getNotional$annotations", "getNotional", "getMax_quantity$annotations", "getMax_quantity", "getReserved_buying_power$annotations", "getReserved_buying_power", "getInstrument_type$annotations", "getInstrument_type", "()Lrosetta/mainst/InstrumentTypeDto;", "getReplacement_order_id$annotations", "getReplacement_order_id", "getChildMarkets$annotations", "getChildMarkets", "getQuantity_to_replace$annotations", "getQuantity_to_replace", "getList_root_id$annotations", "getList_root_id", "getAccount_type$annotations", "getAccount_type", "()Lrosetta/order/AccountTypeDto;", "getMargin_mode$annotations", "getMargin_mode", "()Lrosetta/mainst/MarginModeDto;", "getLeverage$annotations", "getLeverage", "getReduce_only$annotations", "getReduce_only", "getCurrency_denomination$annotations", "getCurrency_denomination", "()Lrosetta/order/CurrencyDenominationDto;", "getPosition_effect$annotations", "getPosition_effect", "()Lrosetta/mainst/PositionEffectDto;", "getPosition_id$annotations", "getPosition_id", "getActive_ttl_seconds$annotations", "getActive_ttl_seconds", "getTo_expire_at$annotations", "getTo_expire_at", "getCapacity$annotations", "getCapacity", "()Lrosetta/mainst/CapacityDto;", "getForce_fix_line$annotations", "getForce_fix_line", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component70", "component71", "component72", "component73", "component74", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_mainst_externalRelease", "$serializer", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<String> ChildMarkets;
        private final String account_number;
        private final AccountTypeDto account_type;
        private final NullableIntDto active_ttl_seconds;
        private final UUIDDto asset_currency;
        private final AgentDto cancel_close_agent;
        private final TimeDto cancel_close_time;
        private final AgentDto cancel_open_agent;
        private final TimeDto cancel_open_time;
        private final DecimalDto cancelled_quantity;
        private final CapacityDto capacity;
        private final NullableStringDto cl_ord_id;
        private final NullableStringDto clearing_firm;
        private final AffiliateDto created_affiliate;
        private final AgentDto created_agent;
        private final TimeDto created_at;
        private final ClientServiceDto created_service;
        private final CurrencyDenominationDto currency_denomination;
        private final List<ExecutionDto> executions;
        private final DateDto expire_date;
        private final boolean extended_hours;
        private final String fix_conn_id;
        private final NullableStringDto force_fix_line;
        private final NullableBoolDto force_route;
        private final List<HandlingInstructionDto> handling_instructions;
        private final UUIDDto id;
        private final UUIDDto instrument_id;
        private final InstrumentTypeDto instrument_type;
        private final List<InstrumentInfoDto> instruments;
        private final List<InstrumentInfoV2Dto> instruments_v2;
        private final TimeDto last_sent_at;
        private final DecimalDto last_trail_price;
        private final TimeDto last_transaction_at;
        private final List<OrderLegDto> legs;
        private final DecimalDto leverage;
        private final UUIDDto list_root_id;
        private final MarginModeDto margin_mode;
        private final MarketHoursDto market_hours;
        private final MarketStateDto market_state;
        private final DecimalDto max_quantity;
        private final OrderMetadataDto metadata;
        private final DecimalDto notional;
        private final UUIDDto parent_order_id;
        private final PegTypeDto peg_type;
        private final PositionEffectDto position_effect;
        private final NullableStringDto position_id;
        private final DecimalDto price;
        private final NullableBoolDto pro_trader;
        private final DecimalDto quantity;
        private final DecimalDto quantity_to_replace;
        private final TimeDto received_at;
        private final NullableBoolDto reduce_only;
        private final UUIDDto replacement_order_id;
        private final DecimalDto reserved_buying_power;
        private final ResponseCategoryDto response_category;
        private final NullableStringDto response_text;
        private final RouteDto route;
        private final List<OrderSendLogDto> send_logs;
        private final NullableIntDto service_shard_id;
        private final SideDto side;
        private final OrderStateDto state;
        private final DecimalDto stop_price;
        private final TimeDto stop_triggered_at;
        private final TimeInForceDto time_in_force;
        private final TimeDto to_cancel_at;
        private final TimeDto to_expire_at;
        private final TimeDto to_send_at;
        private final DecimalDto trailing_peg;
        private final OrderTriggerDto trigger;
        private final OrderTypeDto type;
        private final int update_count;
        private final UUIDDto user_currency;
        private final NullableStringDto venue_id;
        private final WaitingCategoryDto waiting_category;

        public Surrogate() {
            this((UUIDDto) null, (UUIDDto) null, (UUIDDto) null, (String) null, (RouteDto) null, (SideDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (PegTypeDto) null, (OrderTriggerDto) null, (TimeInForceDto) null, (OrderStateDto) null, (TimeDto) null, (TimeDto) null, (TimeDto) null, (List) null, false, (TimeDto) null, (UUIDDto) null, (UUIDDto) null, (OrderTypeDto) null, 0, (List) null, (TimeDto) null, (String) null, (MarketStateDto) null, (NullableStringDto) null, (NullableStringDto) null, (TimeDto) null, (TimeDto) null, (NullableStringDto) null, (AgentDto) null, (NullableStringDto) null, (List) null, (AgentDto) null, (TimeDto) null, (AgentDto) null, (TimeDto) null, (ClientServiceDto) null, (AffiliateDto) null, (NullableIntDto) null, (List) null, (ResponseCategoryDto) null, (OrderMetadataDto) null, (List) null, (MarketHoursDto) null, (NullableBoolDto) null, (DateDto) null, (List) null, (WaitingCategoryDto) null, (NullableBoolDto) null, (DecimalDto) null, (DecimalDto) null, (DecimalDto) null, (InstrumentTypeDto) null, (UUIDDto) null, (List) null, (DecimalDto) null, (UUIDDto) null, (AccountTypeDto) null, (MarginModeDto) null, (DecimalDto) null, (NullableBoolDto) null, (CurrencyDenominationDto) null, (PositionEffectDto) null, (NullableStringDto) null, (NullableIntDto) null, (TimeDto) null, (CapacityDto) null, (NullableStringDto) null, -1, -1, 1023, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ExecutionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(OrderLegDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
            return new ArrayListSerializer(OrderSendLogDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
            return new ArrayListSerializer(InstrumentInfoDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
            return new ArrayListSerializer(HandlingInstructionDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
            return new ArrayListSerializer(InstrumentInfoV2Dto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String str, RouteDto routeDto, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto pegTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, OrderStateDto orderStateDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto orderTypeDto, int i, List list2, TimeDto timeDto5, String str2, MarketStateDto marketStateDto, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto agentDto, NullableStringDto nullableStringDto4, List list3, AgentDto agentDto2, TimeDto timeDto8, AgentDto agentDto3, TimeDto timeDto9, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, List list4, ResponseCategoryDto responseCategoryDto, OrderMetadataDto orderMetadataDto, List list5, MarketHoursDto marketHoursDto, NullableBoolDto nullableBoolDto, DateDto dateDto, List list6, WaitingCategoryDto waitingCategoryDto, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto6, List list7, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto accountTypeDto, MarginModeDto marginModeDto, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currencyDenominationDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacityDto, NullableStringDto nullableStringDto6, int i2, int i3, int i4, Object obj) {
            UUIDDto uUIDDto8 = (i2 & 1) != 0 ? surrogate.id : uUIDDto;
            return surrogate.copy(uUIDDto8, (i2 & 2) != 0 ? surrogate.instrument_id : uUIDDto2, (i2 & 4) != 0 ? surrogate.parent_order_id : uUIDDto3, (i2 & 8) != 0 ? surrogate.account_number : str, (i2 & 16) != 0 ? surrogate.route : routeDto, (i2 & 32) != 0 ? surrogate.side : sideDto, (i2 & 64) != 0 ? surrogate.price : decimalDto, (i2 & 128) != 0 ? surrogate.stop_price : decimalDto2, (i2 & 256) != 0 ? surrogate.trailing_peg : decimalDto3, (i2 & 512) != 0 ? surrogate.last_trail_price : decimalDto4, (i2 & 1024) != 0 ? surrogate.quantity : decimalDto5, (i2 & 2048) != 0 ? surrogate.cancelled_quantity : decimalDto6, (i2 & 4096) != 0 ? surrogate.peg_type : pegTypeDto, (i2 & 8192) != 0 ? surrogate.trigger : orderTriggerDto, (i2 & 16384) != 0 ? surrogate.time_in_force : timeInForceDto, (i2 & 32768) != 0 ? surrogate.state : orderStateDto, (i2 & 65536) != 0 ? surrogate.created_at : timeDto, (i2 & 131072) != 0 ? surrogate.received_at : timeDto2, (i2 & 262144) != 0 ? surrogate.last_transaction_at : timeDto3, (i2 & 524288) != 0 ? surrogate.executions : list, (i2 & 1048576) != 0 ? surrogate.extended_hours : z, (i2 & 2097152) != 0 ? surrogate.stop_triggered_at : timeDto4, (i2 & 4194304) != 0 ? surrogate.user_currency : uUIDDto4, (i2 & 8388608) != 0 ? surrogate.asset_currency : uUIDDto5, (i2 & 16777216) != 0 ? surrogate.type : orderTypeDto, (i2 & 33554432) != 0 ? surrogate.update_count : i, (i2 & 67108864) != 0 ? surrogate.legs : list2, (i2 & 134217728) != 0 ? surrogate.last_sent_at : timeDto5, (i2 & 268435456) != 0 ? surrogate.fix_conn_id : str2, (i2 & 536870912) != 0 ? surrogate.market_state : marketStateDto, (i2 & 1073741824) != 0 ? surrogate.clearing_firm : nullableStringDto, (i2 & Integer.MIN_VALUE) != 0 ? surrogate.response_text : nullableStringDto2, (i3 & 1) != 0 ? surrogate.to_cancel_at : timeDto6, (i3 & 2) != 0 ? surrogate.to_send_at : timeDto7, (i3 & 4) != 0 ? surrogate.venue_id : nullableStringDto3, (i3 & 8) != 0 ? surrogate.created_agent : agentDto, (i3 & 16) != 0 ? surrogate.cl_ord_id : nullableStringDto4, (i3 & 32) != 0 ? surrogate.send_logs : list3, (i3 & 64) != 0 ? surrogate.cancel_open_agent : agentDto2, (i3 & 128) != 0 ? surrogate.cancel_open_time : timeDto8, (i3 & 256) != 0 ? surrogate.cancel_close_agent : agentDto3, (i3 & 512) != 0 ? surrogate.cancel_close_time : timeDto9, (i3 & 1024) != 0 ? surrogate.created_service : clientServiceDto, (i3 & 2048) != 0 ? surrogate.created_affiliate : affiliateDto, (i3 & 4096) != 0 ? surrogate.service_shard_id : nullableIntDto, (i3 & 8192) != 0 ? surrogate.instruments : list4, (i3 & 16384) != 0 ? surrogate.response_category : responseCategoryDto, (i3 & 32768) != 0 ? surrogate.metadata : orderMetadataDto, (i3 & 65536) != 0 ? surrogate.handling_instructions : list5, (i3 & 131072) != 0 ? surrogate.market_hours : marketHoursDto, (i3 & 262144) != 0 ? surrogate.pro_trader : nullableBoolDto, (i3 & 524288) != 0 ? surrogate.expire_date : dateDto, (i3 & 1048576) != 0 ? surrogate.instruments_v2 : list6, (i3 & 2097152) != 0 ? surrogate.waiting_category : waitingCategoryDto, (i3 & 4194304) != 0 ? surrogate.force_route : nullableBoolDto2, (i3 & 8388608) != 0 ? surrogate.notional : decimalDto7, (i3 & 16777216) != 0 ? surrogate.max_quantity : decimalDto8, (i3 & 33554432) != 0 ? surrogate.reserved_buying_power : decimalDto9, (i3 & 67108864) != 0 ? surrogate.instrument_type : instrumentTypeDto, (i3 & 134217728) != 0 ? surrogate.replacement_order_id : uUIDDto6, (i3 & 268435456) != 0 ? surrogate.ChildMarkets : list7, (i3 & 536870912) != 0 ? surrogate.quantity_to_replace : decimalDto10, (i3 & 1073741824) != 0 ? surrogate.list_root_id : uUIDDto7, (i3 & Integer.MIN_VALUE) != 0 ? surrogate.account_type : accountTypeDto, (i4 & 1) != 0 ? surrogate.margin_mode : marginModeDto, (i4 & 2) != 0 ? surrogate.leverage : decimalDto11, (i4 & 4) != 0 ? surrogate.reduce_only : nullableBoolDto3, (i4 & 8) != 0 ? surrogate.currency_denomination : currencyDenominationDto, (i4 & 16) != 0 ? surrogate.position_effect : positionEffectDto, (i4 & 32) != 0 ? surrogate.position_id : nullableStringDto5, (i4 & 64) != 0 ? surrogate.active_ttl_seconds : nullableIntDto2, (i4 & 128) != 0 ? surrogate.to_expire_at : timeDto10, (i4 & 256) != 0 ? surrogate.capacity : capacityDto, (i4 & 512) != 0 ? surrogate.force_fix_line : nullableStringDto6);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("activeTtlSeconds")
        @JsonAnnotations2(names = {"active_ttl_seconds"})
        public static /* synthetic */ void getActive_ttl_seconds$annotations() {
        }

        @SerialName("assetCurrency")
        @JsonAnnotations2(names = {"asset_currency"})
        public static /* synthetic */ void getAsset_currency$annotations() {
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

        @SerialName("cancelledQuantity")
        @JsonAnnotations2(names = {"cancelled_quantity"})
        public static /* synthetic */ void getCancelled_quantity$annotations() {
        }

        @SerialName("capacity")
        @JsonAnnotations2(names = {"capacity"})
        public static /* synthetic */ void getCapacity$annotations() {
        }

        @SerialName("ChildMarkets")
        @JsonAnnotations2(names = {"ChildMarkets"})
        public static /* synthetic */ void getChildMarkets$annotations() {
        }

        @SerialName("clOrdId")
        @JsonAnnotations2(names = {"cl_ord_id"})
        public static /* synthetic */ void getCl_ord_id$annotations() {
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

        @SerialName("createdService")
        @JsonAnnotations2(names = {"created_service"})
        public static /* synthetic */ void getCreated_service$annotations() {
        }

        @SerialName("currencyDenomination")
        @JsonAnnotations2(names = {"currency_denomination"})
        public static /* synthetic */ void getCurrency_denomination$annotations() {
        }

        @SerialName("executions")
        @JsonAnnotations2(names = {"executions"})
        public static /* synthetic */ void getExecutions$annotations() {
        }

        @SerialName("expireDate")
        @JsonAnnotations2(names = {"expire_date"})
        public static /* synthetic */ void getExpire_date$annotations() {
        }

        @SerialName("extendedHours")
        @JsonAnnotations2(names = {"extended_hours"})
        public static /* synthetic */ void getExtended_hours$annotations() {
        }

        @SerialName("fixConnId")
        @JsonAnnotations2(names = {"fix_conn_id"})
        public static /* synthetic */ void getFix_conn_id$annotations() {
        }

        @SerialName("forceFixLine")
        @JsonAnnotations2(names = {"force_fix_line"})
        public static /* synthetic */ void getForce_fix_line$annotations() {
        }

        @SerialName("forceRoute")
        @JsonAnnotations2(names = {"force_route"})
        public static /* synthetic */ void getForce_route$annotations() {
        }

        @SerialName("handlingInstructions")
        @JsonAnnotations2(names = {"handling_instructions"})
        public static /* synthetic */ void getHandling_instructions$annotations() {
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

        @SerialName("instruments")
        @JsonAnnotations2(names = {"instruments"})
        public static /* synthetic */ void getInstruments$annotations() {
        }

        @SerialName("instrumentsV2")
        @JsonAnnotations2(names = {"instruments_v2"})
        public static /* synthetic */ void getInstruments_v2$annotations() {
        }

        @SerialName("lastSentAt")
        @JsonAnnotations2(names = {"last_sent_at"})
        public static /* synthetic */ void getLast_sent_at$annotations() {
        }

        @SerialName("lastTrailPrice")
        @JsonAnnotations2(names = {"last_trail_price"})
        public static /* synthetic */ void getLast_trail_price$annotations() {
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

        @SerialName("marginMode")
        @JsonAnnotations2(names = {"margin_mode"})
        public static /* synthetic */ void getMargin_mode$annotations() {
        }

        @SerialName("marketHours")
        @JsonAnnotations2(names = {"market_hours"})
        public static /* synthetic */ void getMarket_hours$annotations() {
        }

        @SerialName("marketState")
        @JsonAnnotations2(names = {"market_state"})
        public static /* synthetic */ void getMarket_state$annotations() {
        }

        @SerialName("maxQuantity")
        @JsonAnnotations2(names = {"max_quantity"})
        public static /* synthetic */ void getMax_quantity$annotations() {
        }

        @SerialName("metadata")
        @JsonAnnotations2(names = {"metadata"})
        public static /* synthetic */ void getMetadata$annotations() {
        }

        @SerialName("notional")
        @JsonAnnotations2(names = {"notional"})
        public static /* synthetic */ void getNotional$annotations() {
        }

        @SerialName("parentOrderId")
        @JsonAnnotations2(names = {"parent_order_id"})
        public static /* synthetic */ void getParent_order_id$annotations() {
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

        @SerialName("proTrader")
        @JsonAnnotations2(names = {"pro_trader"})
        public static /* synthetic */ void getPro_trader$annotations() {
        }

        @SerialName("quantity")
        @JsonAnnotations2(names = {"quantity"})
        public static /* synthetic */ void getQuantity$annotations() {
        }

        @SerialName("quantityToReplace")
        @JsonAnnotations2(names = {"quantity_to_replace"})
        public static /* synthetic */ void getQuantity_to_replace$annotations() {
        }

        @SerialName("receivedAt")
        @JsonAnnotations2(names = {"received_at"})
        public static /* synthetic */ void getReceived_at$annotations() {
        }

        @SerialName("reduceOnly")
        @JsonAnnotations2(names = {"reduce_only"})
        public static /* synthetic */ void getReduce_only$annotations() {
        }

        @SerialName("replacementOrderId")
        @JsonAnnotations2(names = {"replacement_order_id"})
        public static /* synthetic */ void getReplacement_order_id$annotations() {
        }

        @SerialName("reservedBuyingPower")
        @JsonAnnotations2(names = {"reserved_buying_power"})
        public static /* synthetic */ void getReserved_buying_power$annotations() {
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

        @SerialName("sendLogs")
        @JsonAnnotations2(names = {"send_logs"})
        public static /* synthetic */ void getSend_logs$annotations() {
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

        @SerialName("timeInForce")
        @JsonAnnotations2(names = {"time_in_force"})
        public static /* synthetic */ void getTime_in_force$annotations() {
        }

        @SerialName("toCancelAt")
        @JsonAnnotations2(names = {"to_cancel_at"})
        public static /* synthetic */ void getTo_cancel_at$annotations() {
        }

        @SerialName("toExpireAt")
        @JsonAnnotations2(names = {"to_expire_at"})
        public static /* synthetic */ void getTo_expire_at$annotations() {
        }

        @SerialName("toSendAt")
        @JsonAnnotations2(names = {"to_send_at"})
        public static /* synthetic */ void getTo_send_at$annotations() {
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

        @SerialName("updateCount")
        @JsonAnnotations2(names = {"update_count"})
        public static /* synthetic */ void getUpdate_count$annotations() {
        }

        @SerialName("userCurrency")
        @JsonAnnotations2(names = {"user_currency"})
        public static /* synthetic */ void getUser_currency$annotations() {
        }

        @SerialName("venueId")
        @JsonAnnotations2(names = {"venue_id"})
        public static /* synthetic */ void getVenue_id$annotations() {
        }

        @SerialName("waitingCategory")
        @JsonAnnotations2(names = {"waiting_category"})
        public static /* synthetic */ void getWaiting_category$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final UUIDDto getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final DecimalDto getLast_trail_price() {
            return this.last_trail_price;
        }

        /* renamed from: component11, reason: from getter */
        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        /* renamed from: component12, reason: from getter */
        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        /* renamed from: component13, reason: from getter */
        public final PegTypeDto getPeg_type() {
            return this.peg_type;
        }

        /* renamed from: component14, reason: from getter */
        public final OrderTriggerDto getTrigger() {
            return this.trigger;
        }

        /* renamed from: component15, reason: from getter */
        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        /* renamed from: component16, reason: from getter */
        public final OrderStateDto getState() {
            return this.state;
        }

        /* renamed from: component17, reason: from getter */
        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        /* renamed from: component18, reason: from getter */
        public final TimeDto getReceived_at() {
            return this.received_at;
        }

        /* renamed from: component19, reason: from getter */
        public final TimeDto getLast_transaction_at() {
            return this.last_transaction_at;
        }

        /* renamed from: component2, reason: from getter */
        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final List<ExecutionDto> component20() {
            return this.executions;
        }

        /* renamed from: component21, reason: from getter */
        public final boolean getExtended_hours() {
            return this.extended_hours;
        }

        /* renamed from: component22, reason: from getter */
        public final TimeDto getStop_triggered_at() {
            return this.stop_triggered_at;
        }

        /* renamed from: component23, reason: from getter */
        public final UUIDDto getUser_currency() {
            return this.user_currency;
        }

        /* renamed from: component24, reason: from getter */
        public final UUIDDto getAsset_currency() {
            return this.asset_currency;
        }

        /* renamed from: component25, reason: from getter */
        public final OrderTypeDto getType() {
            return this.type;
        }

        /* renamed from: component26, reason: from getter */
        public final int getUpdate_count() {
            return this.update_count;
        }

        public final List<OrderLegDto> component27() {
            return this.legs;
        }

        /* renamed from: component28, reason: from getter */
        public final TimeDto getLast_sent_at() {
            return this.last_sent_at;
        }

        /* renamed from: component29, reason: from getter */
        public final String getFix_conn_id() {
            return this.fix_conn_id;
        }

        /* renamed from: component3, reason: from getter */
        public final UUIDDto getParent_order_id() {
            return this.parent_order_id;
        }

        /* renamed from: component30, reason: from getter */
        public final MarketStateDto getMarket_state() {
            return this.market_state;
        }

        /* renamed from: component31, reason: from getter */
        public final NullableStringDto getClearing_firm() {
            return this.clearing_firm;
        }

        /* renamed from: component32, reason: from getter */
        public final NullableStringDto getResponse_text() {
            return this.response_text;
        }

        /* renamed from: component33, reason: from getter */
        public final TimeDto getTo_cancel_at() {
            return this.to_cancel_at;
        }

        /* renamed from: component34, reason: from getter */
        public final TimeDto getTo_send_at() {
            return this.to_send_at;
        }

        /* renamed from: component35, reason: from getter */
        public final NullableStringDto getVenue_id() {
            return this.venue_id;
        }

        /* renamed from: component36, reason: from getter */
        public final AgentDto getCreated_agent() {
            return this.created_agent;
        }

        /* renamed from: component37, reason: from getter */
        public final NullableStringDto getCl_ord_id() {
            return this.cl_ord_id;
        }

        public final List<OrderSendLogDto> component38() {
            return this.send_logs;
        }

        /* renamed from: component39, reason: from getter */
        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component40, reason: from getter */
        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        /* renamed from: component41, reason: from getter */
        public final AgentDto getCancel_close_agent() {
            return this.cancel_close_agent;
        }

        /* renamed from: component42, reason: from getter */
        public final TimeDto getCancel_close_time() {
            return this.cancel_close_time;
        }

        /* renamed from: component43, reason: from getter */
        public final ClientServiceDto getCreated_service() {
            return this.created_service;
        }

        /* renamed from: component44, reason: from getter */
        public final AffiliateDto getCreated_affiliate() {
            return this.created_affiliate;
        }

        /* renamed from: component45, reason: from getter */
        public final NullableIntDto getService_shard_id() {
            return this.service_shard_id;
        }

        public final List<InstrumentInfoDto> component46() {
            return this.instruments;
        }

        /* renamed from: component47, reason: from getter */
        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        /* renamed from: component48, reason: from getter */
        public final OrderMetadataDto getMetadata() {
            return this.metadata;
        }

        public final List<HandlingInstructionDto> component49() {
            return this.handling_instructions;
        }

        /* renamed from: component5, reason: from getter */
        public final RouteDto getRoute() {
            return this.route;
        }

        /* renamed from: component50, reason: from getter */
        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        /* renamed from: component51, reason: from getter */
        public final NullableBoolDto getPro_trader() {
            return this.pro_trader;
        }

        /* renamed from: component52, reason: from getter */
        public final DateDto getExpire_date() {
            return this.expire_date;
        }

        public final List<InstrumentInfoV2Dto> component53() {
            return this.instruments_v2;
        }

        /* renamed from: component54, reason: from getter */
        public final WaitingCategoryDto getWaiting_category() {
            return this.waiting_category;
        }

        /* renamed from: component55, reason: from getter */
        public final NullableBoolDto getForce_route() {
            return this.force_route;
        }

        /* renamed from: component56, reason: from getter */
        public final DecimalDto getNotional() {
            return this.notional;
        }

        /* renamed from: component57, reason: from getter */
        public final DecimalDto getMax_quantity() {
            return this.max_quantity;
        }

        /* renamed from: component58, reason: from getter */
        public final DecimalDto getReserved_buying_power() {
            return this.reserved_buying_power;
        }

        /* renamed from: component59, reason: from getter */
        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        /* renamed from: component6, reason: from getter */
        public final SideDto getSide() {
            return this.side;
        }

        /* renamed from: component60, reason: from getter */
        public final UUIDDto getReplacement_order_id() {
            return this.replacement_order_id;
        }

        public final List<String> component61() {
            return this.ChildMarkets;
        }

        /* renamed from: component62, reason: from getter */
        public final DecimalDto getQuantity_to_replace() {
            return this.quantity_to_replace;
        }

        /* renamed from: component63, reason: from getter */
        public final UUIDDto getList_root_id() {
            return this.list_root_id;
        }

        /* renamed from: component64, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component65, reason: from getter */
        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        /* renamed from: component66, reason: from getter */
        public final DecimalDto getLeverage() {
            return this.leverage;
        }

        /* renamed from: component67, reason: from getter */
        public final NullableBoolDto getReduce_only() {
            return this.reduce_only;
        }

        /* renamed from: component68, reason: from getter */
        public final CurrencyDenominationDto getCurrency_denomination() {
            return this.currency_denomination;
        }

        /* renamed from: component69, reason: from getter */
        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        /* renamed from: component7, reason: from getter */
        public final DecimalDto getPrice() {
            return this.price;
        }

        /* renamed from: component70, reason: from getter */
        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        /* renamed from: component71, reason: from getter */
        public final NullableIntDto getActive_ttl_seconds() {
            return this.active_ttl_seconds;
        }

        /* renamed from: component72, reason: from getter */
        public final TimeDto getTo_expire_at() {
            return this.to_expire_at;
        }

        /* renamed from: component73, reason: from getter */
        public final CapacityDto getCapacity() {
            return this.capacity;
        }

        /* renamed from: component74, reason: from getter */
        public final NullableStringDto getForce_fix_line() {
            return this.force_fix_line;
        }

        /* renamed from: component8, reason: from getter */
        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        /* renamed from: component9, reason: from getter */
        public final DecimalDto getTrailing_peg() {
            return this.trailing_peg;
        }

        public final Surrogate copy(UUIDDto id, UUIDDto instrument_id, UUIDDto parent_order_id, String account_number, RouteDto route, SideDto side, DecimalDto price, DecimalDto stop_price, DecimalDto trailing_peg, DecimalDto last_trail_price, DecimalDto quantity, DecimalDto cancelled_quantity, PegTypeDto peg_type, OrderTriggerDto trigger, TimeInForceDto time_in_force, OrderStateDto state, TimeDto created_at, TimeDto received_at, TimeDto last_transaction_at, List<ExecutionDto> executions, boolean extended_hours, TimeDto stop_triggered_at, UUIDDto user_currency, UUIDDto asset_currency, OrderTypeDto type2, int update_count, List<OrderLegDto> legs, TimeDto last_sent_at, String fix_conn_id, MarketStateDto market_state, NullableStringDto clearing_firm, NullableStringDto response_text, TimeDto to_cancel_at, TimeDto to_send_at, NullableStringDto venue_id, AgentDto created_agent, NullableStringDto cl_ord_id, List<OrderSendLogDto> send_logs, AgentDto cancel_open_agent, TimeDto cancel_open_time, AgentDto cancel_close_agent, TimeDto cancel_close_time, ClientServiceDto created_service, AffiliateDto created_affiliate, NullableIntDto service_shard_id, List<InstrumentInfoDto> instruments, ResponseCategoryDto response_category, OrderMetadataDto metadata, List<? extends HandlingInstructionDto> handling_instructions, MarketHoursDto market_hours, NullableBoolDto pro_trader, DateDto expire_date, List<InstrumentInfoV2Dto> instruments_v2, WaitingCategoryDto waiting_category, NullableBoolDto force_route, DecimalDto notional, DecimalDto max_quantity, DecimalDto reserved_buying_power, InstrumentTypeDto instrument_type, UUIDDto replacement_order_id, List<String> ChildMarkets, DecimalDto quantity_to_replace, UUIDDto list_root_id, AccountTypeDto account_type, MarginModeDto margin_mode, DecimalDto leverage, NullableBoolDto reduce_only, CurrencyDenominationDto currency_denomination, PositionEffectDto position_effect, NullableStringDto position_id, NullableIntDto active_ttl_seconds, TimeDto to_expire_at, CapacityDto capacity, NullableStringDto force_fix_line) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(peg_type, "peg_type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
            Intrinsics.checkNotNullParameter(market_state, "market_state");
            Intrinsics.checkNotNullParameter(created_agent, "created_agent");
            Intrinsics.checkNotNullParameter(send_logs, "send_logs");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
            Intrinsics.checkNotNullParameter(created_service, "created_service");
            Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
            Intrinsics.checkNotNullParameter(instruments, "instruments");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(handling_instructions, "handling_instructions");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(instruments_v2, "instruments_v2");
            Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(ChildMarkets, "ChildMarkets");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            return new Surrogate(id, instrument_id, parent_order_id, account_number, route, side, price, stop_price, trailing_peg, last_trail_price, quantity, cancelled_quantity, peg_type, trigger, time_in_force, state, created_at, received_at, last_transaction_at, executions, extended_hours, stop_triggered_at, user_currency, asset_currency, type2, update_count, legs, last_sent_at, fix_conn_id, market_state, clearing_firm, response_text, to_cancel_at, to_send_at, venue_id, created_agent, cl_ord_id, send_logs, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, created_service, created_affiliate, service_shard_id, instruments, response_category, metadata, handling_instructions, market_hours, pro_trader, expire_date, instruments_v2, waiting_category, force_route, notional, max_quantity, reserved_buying_power, instrument_type, replacement_order_id, ChildMarkets, quantity_to_replace, list_root_id, account_type, margin_mode, leverage, reduce_only, currency_denomination, position_effect, position_id, active_ttl_seconds, to_expire_at, capacity, force_fix_line);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.parent_order_id, surrogate.parent_order_id) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.route == surrogate.route && this.side == surrogate.side && Intrinsics.areEqual(this.price, surrogate.price) && Intrinsics.areEqual(this.stop_price, surrogate.stop_price) && Intrinsics.areEqual(this.trailing_peg, surrogate.trailing_peg) && Intrinsics.areEqual(this.last_trail_price, surrogate.last_trail_price) && Intrinsics.areEqual(this.quantity, surrogate.quantity) && Intrinsics.areEqual(this.cancelled_quantity, surrogate.cancelled_quantity) && this.peg_type == surrogate.peg_type && this.trigger == surrogate.trigger && this.time_in_force == surrogate.time_in_force && this.state == surrogate.state && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.received_at, surrogate.received_at) && Intrinsics.areEqual(this.last_transaction_at, surrogate.last_transaction_at) && Intrinsics.areEqual(this.executions, surrogate.executions) && this.extended_hours == surrogate.extended_hours && Intrinsics.areEqual(this.stop_triggered_at, surrogate.stop_triggered_at) && Intrinsics.areEqual(this.user_currency, surrogate.user_currency) && Intrinsics.areEqual(this.asset_currency, surrogate.asset_currency) && this.type == surrogate.type && this.update_count == surrogate.update_count && Intrinsics.areEqual(this.legs, surrogate.legs) && Intrinsics.areEqual(this.last_sent_at, surrogate.last_sent_at) && Intrinsics.areEqual(this.fix_conn_id, surrogate.fix_conn_id) && this.market_state == surrogate.market_state && Intrinsics.areEqual(this.clearing_firm, surrogate.clearing_firm) && Intrinsics.areEqual(this.response_text, surrogate.response_text) && Intrinsics.areEqual(this.to_cancel_at, surrogate.to_cancel_at) && Intrinsics.areEqual(this.to_send_at, surrogate.to_send_at) && Intrinsics.areEqual(this.venue_id, surrogate.venue_id) && this.created_agent == surrogate.created_agent && Intrinsics.areEqual(this.cl_ord_id, surrogate.cl_ord_id) && Intrinsics.areEqual(this.send_logs, surrogate.send_logs) && this.cancel_open_agent == surrogate.cancel_open_agent && Intrinsics.areEqual(this.cancel_open_time, surrogate.cancel_open_time) && this.cancel_close_agent == surrogate.cancel_close_agent && Intrinsics.areEqual(this.cancel_close_time, surrogate.cancel_close_time) && this.created_service == surrogate.created_service && this.created_affiliate == surrogate.created_affiliate && Intrinsics.areEqual(this.service_shard_id, surrogate.service_shard_id) && Intrinsics.areEqual(this.instruments, surrogate.instruments) && this.response_category == surrogate.response_category && Intrinsics.areEqual(this.metadata, surrogate.metadata) && Intrinsics.areEqual(this.handling_instructions, surrogate.handling_instructions) && this.market_hours == surrogate.market_hours && Intrinsics.areEqual(this.pro_trader, surrogate.pro_trader) && Intrinsics.areEqual(this.expire_date, surrogate.expire_date) && Intrinsics.areEqual(this.instruments_v2, surrogate.instruments_v2) && this.waiting_category == surrogate.waiting_category && Intrinsics.areEqual(this.force_route, surrogate.force_route) && Intrinsics.areEqual(this.notional, surrogate.notional) && Intrinsics.areEqual(this.max_quantity, surrogate.max_quantity) && Intrinsics.areEqual(this.reserved_buying_power, surrogate.reserved_buying_power) && this.instrument_type == surrogate.instrument_type && Intrinsics.areEqual(this.replacement_order_id, surrogate.replacement_order_id) && Intrinsics.areEqual(this.ChildMarkets, surrogate.ChildMarkets) && Intrinsics.areEqual(this.quantity_to_replace, surrogate.quantity_to_replace) && Intrinsics.areEqual(this.list_root_id, surrogate.list_root_id) && this.account_type == surrogate.account_type && this.margin_mode == surrogate.margin_mode && Intrinsics.areEqual(this.leverage, surrogate.leverage) && Intrinsics.areEqual(this.reduce_only, surrogate.reduce_only) && this.currency_denomination == surrogate.currency_denomination && this.position_effect == surrogate.position_effect && Intrinsics.areEqual(this.position_id, surrogate.position_id) && Intrinsics.areEqual(this.active_ttl_seconds, surrogate.active_ttl_seconds) && Intrinsics.areEqual(this.to_expire_at, surrogate.to_expire_at) && this.capacity == surrogate.capacity && Intrinsics.areEqual(this.force_fix_line, surrogate.force_fix_line);
        }

        public int hashCode() {
            UUIDDto uUIDDto = this.id;
            int iHashCode = (uUIDDto == null ? 0 : uUIDDto.hashCode()) * 31;
            UUIDDto uUIDDto2 = this.instrument_id;
            int iHashCode2 = (iHashCode + (uUIDDto2 == null ? 0 : uUIDDto2.hashCode())) * 31;
            UUIDDto uUIDDto3 = this.parent_order_id;
            int iHashCode3 = (((((((iHashCode2 + (uUIDDto3 == null ? 0 : uUIDDto3.hashCode())) * 31) + this.account_number.hashCode()) * 31) + this.route.hashCode()) * 31) + this.side.hashCode()) * 31;
            DecimalDto decimalDto = this.price;
            int iHashCode4 = (iHashCode3 + (decimalDto == null ? 0 : decimalDto.hashCode())) * 31;
            DecimalDto decimalDto2 = this.stop_price;
            int iHashCode5 = (iHashCode4 + (decimalDto2 == null ? 0 : decimalDto2.hashCode())) * 31;
            DecimalDto decimalDto3 = this.trailing_peg;
            int iHashCode6 = (iHashCode5 + (decimalDto3 == null ? 0 : decimalDto3.hashCode())) * 31;
            DecimalDto decimalDto4 = this.last_trail_price;
            int iHashCode7 = (iHashCode6 + (decimalDto4 == null ? 0 : decimalDto4.hashCode())) * 31;
            DecimalDto decimalDto5 = this.quantity;
            int iHashCode8 = (iHashCode7 + (decimalDto5 == null ? 0 : decimalDto5.hashCode())) * 31;
            DecimalDto decimalDto6 = this.cancelled_quantity;
            int iHashCode9 = (((((((((iHashCode8 + (decimalDto6 == null ? 0 : decimalDto6.hashCode())) * 31) + this.peg_type.hashCode()) * 31) + this.trigger.hashCode()) * 31) + this.time_in_force.hashCode()) * 31) + this.state.hashCode()) * 31;
            TimeDto timeDto = this.created_at;
            int iHashCode10 = (iHashCode9 + (timeDto == null ? 0 : timeDto.hashCode())) * 31;
            TimeDto timeDto2 = this.received_at;
            int iHashCode11 = (iHashCode10 + (timeDto2 == null ? 0 : timeDto2.hashCode())) * 31;
            TimeDto timeDto3 = this.last_transaction_at;
            int iHashCode12 = (((((iHashCode11 + (timeDto3 == null ? 0 : timeDto3.hashCode())) * 31) + this.executions.hashCode()) * 31) + Boolean.hashCode(this.extended_hours)) * 31;
            TimeDto timeDto4 = this.stop_triggered_at;
            int iHashCode13 = (iHashCode12 + (timeDto4 == null ? 0 : timeDto4.hashCode())) * 31;
            UUIDDto uUIDDto4 = this.user_currency;
            int iHashCode14 = (iHashCode13 + (uUIDDto4 == null ? 0 : uUIDDto4.hashCode())) * 31;
            UUIDDto uUIDDto5 = this.asset_currency;
            int iHashCode15 = (((((((iHashCode14 + (uUIDDto5 == null ? 0 : uUIDDto5.hashCode())) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.update_count)) * 31) + this.legs.hashCode()) * 31;
            TimeDto timeDto5 = this.last_sent_at;
            int iHashCode16 = (((((iHashCode15 + (timeDto5 == null ? 0 : timeDto5.hashCode())) * 31) + this.fix_conn_id.hashCode()) * 31) + this.market_state.hashCode()) * 31;
            NullableStringDto nullableStringDto = this.clearing_firm;
            int iHashCode17 = (iHashCode16 + (nullableStringDto == null ? 0 : nullableStringDto.hashCode())) * 31;
            NullableStringDto nullableStringDto2 = this.response_text;
            int iHashCode18 = (iHashCode17 + (nullableStringDto2 == null ? 0 : nullableStringDto2.hashCode())) * 31;
            TimeDto timeDto6 = this.to_cancel_at;
            int iHashCode19 = (iHashCode18 + (timeDto6 == null ? 0 : timeDto6.hashCode())) * 31;
            TimeDto timeDto7 = this.to_send_at;
            int iHashCode20 = (iHashCode19 + (timeDto7 == null ? 0 : timeDto7.hashCode())) * 31;
            NullableStringDto nullableStringDto3 = this.venue_id;
            int iHashCode21 = (((iHashCode20 + (nullableStringDto3 == null ? 0 : nullableStringDto3.hashCode())) * 31) + this.created_agent.hashCode()) * 31;
            NullableStringDto nullableStringDto4 = this.cl_ord_id;
            int iHashCode22 = (((((iHashCode21 + (nullableStringDto4 == null ? 0 : nullableStringDto4.hashCode())) * 31) + this.send_logs.hashCode()) * 31) + this.cancel_open_agent.hashCode()) * 31;
            TimeDto timeDto8 = this.cancel_open_time;
            int iHashCode23 = (((iHashCode22 + (timeDto8 == null ? 0 : timeDto8.hashCode())) * 31) + this.cancel_close_agent.hashCode()) * 31;
            TimeDto timeDto9 = this.cancel_close_time;
            int iHashCode24 = (((((iHashCode23 + (timeDto9 == null ? 0 : timeDto9.hashCode())) * 31) + this.created_service.hashCode()) * 31) + this.created_affiliate.hashCode()) * 31;
            NullableIntDto nullableIntDto = this.service_shard_id;
            int iHashCode25 = (((((iHashCode24 + (nullableIntDto == null ? 0 : nullableIntDto.hashCode())) * 31) + this.instruments.hashCode()) * 31) + this.response_category.hashCode()) * 31;
            OrderMetadataDto orderMetadataDto = this.metadata;
            int iHashCode26 = (((((iHashCode25 + (orderMetadataDto == null ? 0 : orderMetadataDto.hashCode())) * 31) + this.handling_instructions.hashCode()) * 31) + this.market_hours.hashCode()) * 31;
            NullableBoolDto nullableBoolDto = this.pro_trader;
            int iHashCode27 = (iHashCode26 + (nullableBoolDto == null ? 0 : nullableBoolDto.hashCode())) * 31;
            DateDto dateDto = this.expire_date;
            int iHashCode28 = (((((iHashCode27 + (dateDto == null ? 0 : dateDto.hashCode())) * 31) + this.instruments_v2.hashCode()) * 31) + this.waiting_category.hashCode()) * 31;
            NullableBoolDto nullableBoolDto2 = this.force_route;
            int iHashCode29 = (iHashCode28 + (nullableBoolDto2 == null ? 0 : nullableBoolDto2.hashCode())) * 31;
            DecimalDto decimalDto7 = this.notional;
            int iHashCode30 = (iHashCode29 + (decimalDto7 == null ? 0 : decimalDto7.hashCode())) * 31;
            DecimalDto decimalDto8 = this.max_quantity;
            int iHashCode31 = (iHashCode30 + (decimalDto8 == null ? 0 : decimalDto8.hashCode())) * 31;
            DecimalDto decimalDto9 = this.reserved_buying_power;
            int iHashCode32 = (((iHashCode31 + (decimalDto9 == null ? 0 : decimalDto9.hashCode())) * 31) + this.instrument_type.hashCode()) * 31;
            UUIDDto uUIDDto6 = this.replacement_order_id;
            int iHashCode33 = (((iHashCode32 + (uUIDDto6 == null ? 0 : uUIDDto6.hashCode())) * 31) + this.ChildMarkets.hashCode()) * 31;
            DecimalDto decimalDto10 = this.quantity_to_replace;
            int iHashCode34 = (iHashCode33 + (decimalDto10 == null ? 0 : decimalDto10.hashCode())) * 31;
            UUIDDto uUIDDto7 = this.list_root_id;
            int iHashCode35 = (((((iHashCode34 + (uUIDDto7 == null ? 0 : uUIDDto7.hashCode())) * 31) + this.account_type.hashCode()) * 31) + this.margin_mode.hashCode()) * 31;
            DecimalDto decimalDto11 = this.leverage;
            int iHashCode36 = (iHashCode35 + (decimalDto11 == null ? 0 : decimalDto11.hashCode())) * 31;
            NullableBoolDto nullableBoolDto3 = this.reduce_only;
            int iHashCode37 = (((((iHashCode36 + (nullableBoolDto3 == null ? 0 : nullableBoolDto3.hashCode())) * 31) + this.currency_denomination.hashCode()) * 31) + this.position_effect.hashCode()) * 31;
            NullableStringDto nullableStringDto5 = this.position_id;
            int iHashCode38 = (iHashCode37 + (nullableStringDto5 == null ? 0 : nullableStringDto5.hashCode())) * 31;
            NullableIntDto nullableIntDto2 = this.active_ttl_seconds;
            int iHashCode39 = (iHashCode38 + (nullableIntDto2 == null ? 0 : nullableIntDto2.hashCode())) * 31;
            TimeDto timeDto10 = this.to_expire_at;
            int iHashCode40 = (((iHashCode39 + (timeDto10 == null ? 0 : timeDto10.hashCode())) * 31) + this.capacity.hashCode()) * 31;
            NullableStringDto nullableStringDto6 = this.force_fix_line;
            return iHashCode40 + (nullableStringDto6 != null ? nullableStringDto6.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", instrument_id=" + this.instrument_id + ", parent_order_id=" + this.parent_order_id + ", account_number=" + this.account_number + ", route=" + this.route + ", side=" + this.side + ", price=" + this.price + ", stop_price=" + this.stop_price + ", trailing_peg=" + this.trailing_peg + ", last_trail_price=" + this.last_trail_price + ", quantity=" + this.quantity + ", cancelled_quantity=" + this.cancelled_quantity + ", peg_type=" + this.peg_type + ", trigger=" + this.trigger + ", time_in_force=" + this.time_in_force + ", state=" + this.state + ", created_at=" + this.created_at + ", received_at=" + this.received_at + ", last_transaction_at=" + this.last_transaction_at + ", executions=" + this.executions + ", extended_hours=" + this.extended_hours + ", stop_triggered_at=" + this.stop_triggered_at + ", user_currency=" + this.user_currency + ", asset_currency=" + this.asset_currency + ", type=" + this.type + ", update_count=" + this.update_count + ", legs=" + this.legs + ", last_sent_at=" + this.last_sent_at + ", fix_conn_id=" + this.fix_conn_id + ", market_state=" + this.market_state + ", clearing_firm=" + this.clearing_firm + ", response_text=" + this.response_text + ", to_cancel_at=" + this.to_cancel_at + ", to_send_at=" + this.to_send_at + ", venue_id=" + this.venue_id + ", created_agent=" + this.created_agent + ", cl_ord_id=" + this.cl_ord_id + ", send_logs=" + this.send_logs + ", cancel_open_agent=" + this.cancel_open_agent + ", cancel_open_time=" + this.cancel_open_time + ", cancel_close_agent=" + this.cancel_close_agent + ", cancel_close_time=" + this.cancel_close_time + ", created_service=" + this.created_service + ", created_affiliate=" + this.created_affiliate + ", service_shard_id=" + this.service_shard_id + ", instruments=" + this.instruments + ", response_category=" + this.response_category + ", metadata=" + this.metadata + ", handling_instructions=" + this.handling_instructions + ", market_hours=" + this.market_hours + ", pro_trader=" + this.pro_trader + ", expire_date=" + this.expire_date + ", instruments_v2=" + this.instruments_v2 + ", waiting_category=" + this.waiting_category + ", force_route=" + this.force_route + ", notional=" + this.notional + ", max_quantity=" + this.max_quantity + ", reserved_buying_power=" + this.reserved_buying_power + ", instrument_type=" + this.instrument_type + ", replacement_order_id=" + this.replacement_order_id + ", ChildMarkets=" + this.ChildMarkets + ", quantity_to_replace=" + this.quantity_to_replace + ", list_root_id=" + this.list_root_id + ", account_type=" + this.account_type + ", margin_mode=" + this.margin_mode + ", leverage=" + this.leverage + ", reduce_only=" + this.reduce_only + ", currency_denomination=" + this.currency_denomination + ", position_effect=" + this.position_effect + ", position_id=" + this.position_id + ", active_ttl_seconds=" + this.active_ttl_seconds + ", to_expire_at=" + this.to_expire_at + ", capacity=" + this.capacity + ", force_fix_line=" + this.force_fix_line + ")";
        }

        /* compiled from: OrderDto.kt */
        @kotlin.Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderDto$Surrogate;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OrderDto2.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null, null, null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_$1();
                }
            }), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_$2();
                }
            }), null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_$3();
                }
            }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_$4();
                }
            }), null, null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$Surrogate$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderDto.Surrogate._childSerializers$_anonymous_$5();
                }
            }), null, null, null, null, null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String str, RouteDto routeDto, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto pegTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, OrderStateDto orderStateDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto orderTypeDto, int i4, List list2, TimeDto timeDto5, String str2, MarketStateDto marketStateDto, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto agentDto, NullableStringDto nullableStringDto4, List list3, AgentDto agentDto2, TimeDto timeDto8, AgentDto agentDto3, TimeDto timeDto9, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, List list4, ResponseCategoryDto responseCategoryDto, OrderMetadataDto orderMetadataDto, List list5, MarketHoursDto marketHoursDto, NullableBoolDto nullableBoolDto, DateDto dateDto, List list6, WaitingCategoryDto waitingCategoryDto, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto6, List list7, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto accountTypeDto, MarginModeDto marginModeDto, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currencyDenominationDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacityDto, NullableStringDto nullableStringDto6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = uUIDDto;
            }
            if ((i & 2) == 0) {
                this.instrument_id = null;
            } else {
                this.instrument_id = uUIDDto2;
            }
            if ((i & 4) == 0) {
                this.parent_order_id = null;
            } else {
                this.parent_order_id = uUIDDto3;
            }
            if ((i & 8) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str;
            }
            if ((i & 16) == 0) {
                this.route = RouteDto.INSTANCE.getZeroValue();
            } else {
                this.route = routeDto;
            }
            if ((i & 32) == 0) {
                this.side = SideDto.INSTANCE.getZeroValue();
            } else {
                this.side = sideDto;
            }
            if ((i & 64) == 0) {
                this.price = null;
            } else {
                this.price = decimalDto;
            }
            if ((i & 128) == 0) {
                this.stop_price = null;
            } else {
                this.stop_price = decimalDto2;
            }
            if ((i & 256) == 0) {
                this.trailing_peg = null;
            } else {
                this.trailing_peg = decimalDto3;
            }
            if ((i & 512) == 0) {
                this.last_trail_price = null;
            } else {
                this.last_trail_price = decimalDto4;
            }
            if ((i & 1024) == 0) {
                this.quantity = null;
            } else {
                this.quantity = decimalDto5;
            }
            if ((i & 2048) == 0) {
                this.cancelled_quantity = null;
            } else {
                this.cancelled_quantity = decimalDto6;
            }
            this.peg_type = (i & 4096) == 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto;
            this.trigger = (i & 8192) == 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto;
            this.time_in_force = (i & 16384) == 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
            this.state = (i & 32768) == 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto;
            if ((i & 65536) == 0) {
                this.created_at = null;
            } else {
                this.created_at = timeDto;
            }
            if ((i & 131072) == 0) {
                this.received_at = null;
            } else {
                this.received_at = timeDto2;
            }
            if ((i & 262144) == 0) {
                this.last_transaction_at = null;
            } else {
                this.last_transaction_at = timeDto3;
            }
            this.executions = (i & 524288) == 0 ? CollectionsKt.emptyList() : list;
            this.extended_hours = (1048576 & i) == 0 ? false : z;
            if ((2097152 & i) == 0) {
                this.stop_triggered_at = null;
            } else {
                this.stop_triggered_at = timeDto4;
            }
            if ((4194304 & i) == 0) {
                this.user_currency = null;
            } else {
                this.user_currency = uUIDDto4;
            }
            if ((8388608 & i) == 0) {
                this.asset_currency = null;
            } else {
                this.asset_currency = uUIDDto5;
            }
            this.type = (16777216 & i) == 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto;
            this.update_count = (33554432 & i) == 0 ? 0 : i4;
            this.legs = (67108864 & i) == 0 ? CollectionsKt.emptyList() : list2;
            if ((134217728 & i) == 0) {
                this.last_sent_at = null;
            } else {
                this.last_sent_at = timeDto5;
            }
            this.fix_conn_id = (268435456 & i) != 0 ? str2 : "";
            this.market_state = (536870912 & i) == 0 ? MarketStateDto.INSTANCE.getZeroValue() : marketStateDto;
            if ((1073741824 & i) == 0) {
                this.clearing_firm = null;
            } else {
                this.clearing_firm = nullableStringDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.response_text = null;
            } else {
                this.response_text = nullableStringDto2;
            }
            if ((i2 & 1) == 0) {
                this.to_cancel_at = null;
            } else {
                this.to_cancel_at = timeDto6;
            }
            if ((i2 & 2) == 0) {
                this.to_send_at = null;
            } else {
                this.to_send_at = timeDto7;
            }
            if ((i2 & 4) == 0) {
                this.venue_id = null;
            } else {
                this.venue_id = nullableStringDto3;
            }
            this.created_agent = (i2 & 8) == 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto;
            if ((i2 & 16) == 0) {
                this.cl_ord_id = null;
            } else {
                this.cl_ord_id = nullableStringDto4;
            }
            this.send_logs = (i2 & 32) == 0 ? CollectionsKt.emptyList() : list3;
            this.cancel_open_agent = (i2 & 64) == 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2;
            if ((i2 & 128) == 0) {
                this.cancel_open_time = null;
            } else {
                this.cancel_open_time = timeDto8;
            }
            this.cancel_close_agent = (i2 & 256) == 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto3;
            if ((i2 & 512) == 0) {
                this.cancel_close_time = null;
            } else {
                this.cancel_close_time = timeDto9;
            }
            this.created_service = (i2 & 1024) == 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto;
            this.created_affiliate = (i2 & 2048) == 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto;
            if ((i2 & 4096) == 0) {
                this.service_shard_id = null;
            } else {
                this.service_shard_id = nullableIntDto;
            }
            this.instruments = (i2 & 8192) == 0 ? CollectionsKt.emptyList() : list4;
            this.response_category = (i2 & 16384) == 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto;
            if ((i2 & 32768) == 0) {
                this.metadata = null;
            } else {
                this.metadata = orderMetadataDto;
            }
            this.handling_instructions = (i2 & 65536) == 0 ? CollectionsKt.emptyList() : list5;
            this.market_hours = (i2 & 131072) == 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto;
            if ((i2 & 262144) == 0) {
                this.pro_trader = null;
            } else {
                this.pro_trader = nullableBoolDto;
            }
            if ((i2 & 524288) == 0) {
                this.expire_date = null;
            } else {
                this.expire_date = dateDto;
            }
            this.instruments_v2 = (1048576 & i2) == 0 ? CollectionsKt.emptyList() : list6;
            this.waiting_category = (2097152 & i2) == 0 ? WaitingCategoryDto.INSTANCE.getZeroValue() : waitingCategoryDto;
            if ((4194304 & i2) == 0) {
                this.force_route = null;
            } else {
                this.force_route = nullableBoolDto2;
            }
            if ((8388608 & i2) == 0) {
                this.notional = null;
            } else {
                this.notional = decimalDto7;
            }
            if ((16777216 & i2) == 0) {
                this.max_quantity = null;
            } else {
                this.max_quantity = decimalDto8;
            }
            if ((33554432 & i2) == 0) {
                this.reserved_buying_power = null;
            } else {
                this.reserved_buying_power = decimalDto9;
            }
            this.instrument_type = (67108864 & i2) == 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto;
            if ((134217728 & i2) == 0) {
                this.replacement_order_id = null;
            } else {
                this.replacement_order_id = uUIDDto6;
            }
            this.ChildMarkets = (268435456 & i2) == 0 ? CollectionsKt.emptyList() : list7;
            if ((536870912 & i2) == 0) {
                this.quantity_to_replace = null;
            } else {
                this.quantity_to_replace = decimalDto10;
            }
            if ((1073741824 & i2) == 0) {
                this.list_root_id = null;
            } else {
                this.list_root_id = uUIDDto7;
            }
            this.account_type = (Integer.MIN_VALUE & i2) == 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto;
            this.margin_mode = (i3 & 1) == 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto;
            if ((i3 & 2) == 0) {
                this.leverage = null;
            } else {
                this.leverage = decimalDto11;
            }
            if ((i3 & 4) == 0) {
                this.reduce_only = null;
            } else {
                this.reduce_only = nullableBoolDto3;
            }
            this.currency_denomination = (i3 & 8) == 0 ? CurrencyDenominationDto.INSTANCE.getZeroValue() : currencyDenominationDto;
            this.position_effect = (i3 & 16) == 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto;
            if ((i3 & 32) == 0) {
                this.position_id = null;
            } else {
                this.position_id = nullableStringDto5;
            }
            if ((i3 & 64) == 0) {
                this.active_ttl_seconds = null;
            } else {
                this.active_ttl_seconds = nullableIntDto2;
            }
            if ((i3 & 128) == 0) {
                this.to_expire_at = null;
            } else {
                this.to_expire_at = timeDto10;
            }
            this.capacity = (i3 & 256) == 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto;
            if ((i3 & 512) == 0) {
                this.force_fix_line = null;
            } else {
                this.force_fix_line = nullableStringDto6;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_mainst_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            UUIDDto uUIDDto = self.id;
            if (uUIDDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UUIDDto.Serializer.INSTANCE, uUIDDto);
            }
            UUIDDto uUIDDto2 = self.instrument_id;
            if (uUIDDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UUIDDto.Serializer.INSTANCE, uUIDDto2);
            }
            UUIDDto uUIDDto3 = self.parent_order_id;
            if (uUIDDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, UUIDDto.Serializer.INSTANCE, uUIDDto3);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_number);
            }
            if (self.route != RouteDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, RouteDto.Serializer.INSTANCE, self.route);
            }
            if (self.side != SideDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, SideDto.Serializer.INSTANCE, self.side);
            }
            DecimalDto decimalDto = self.price;
            if (decimalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, DecimalDto.Serializer.INSTANCE, decimalDto);
            }
            DecimalDto decimalDto2 = self.stop_price;
            if (decimalDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, DecimalDto.Serializer.INSTANCE, decimalDto2);
            }
            DecimalDto decimalDto3 = self.trailing_peg;
            if (decimalDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, DecimalDto.Serializer.INSTANCE, decimalDto3);
            }
            DecimalDto decimalDto4 = self.last_trail_price;
            if (decimalDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, DecimalDto.Serializer.INSTANCE, decimalDto4);
            }
            DecimalDto decimalDto5 = self.quantity;
            if (decimalDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, DecimalDto.Serializer.INSTANCE, decimalDto5);
            }
            DecimalDto decimalDto6 = self.cancelled_quantity;
            if (decimalDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, DecimalDto.Serializer.INSTANCE, decimalDto6);
            }
            if (self.peg_type != PegTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 12, PegTypeDto.Serializer.INSTANCE, self.peg_type);
            }
            if (self.trigger != OrderTriggerDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 13, OrderTriggerDto.Serializer.INSTANCE, self.trigger);
            }
            if (self.time_in_force != TimeInForceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 14, TimeInForceDto.Serializer.INSTANCE, self.time_in_force);
            }
            if (self.state != OrderStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 15, OrderStateDto.Serializer.INSTANCE, self.state);
            }
            TimeDto timeDto = self.created_at;
            if (timeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, TimeDto.Serializer.INSTANCE, timeDto);
            }
            TimeDto timeDto2 = self.received_at;
            if (timeDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, TimeDto.Serializer.INSTANCE, timeDto2);
            }
            TimeDto timeDto3 = self.last_transaction_at;
            if (timeDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, TimeDto.Serializer.INSTANCE, timeDto3);
            }
            if (!Intrinsics.areEqual(self.executions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 19, lazyArr[19].getValue(), self.executions);
            }
            boolean z = self.extended_hours;
            if (z) {
                output.encodeBooleanElement(serialDesc, 20, z);
            }
            TimeDto timeDto4 = self.stop_triggered_at;
            if (timeDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, TimeDto.Serializer.INSTANCE, timeDto4);
            }
            UUIDDto uUIDDto4 = self.user_currency;
            if (uUIDDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, UUIDDto.Serializer.INSTANCE, uUIDDto4);
            }
            UUIDDto uUIDDto5 = self.asset_currency;
            if (uUIDDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, UUIDDto.Serializer.INSTANCE, uUIDDto5);
            }
            if (self.type != OrderTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 24, OrderTypeDto.Serializer.INSTANCE, self.type);
            }
            int i = self.update_count;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 25, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (!Intrinsics.areEqual(self.legs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 26, lazyArr[26].getValue(), self.legs);
            }
            TimeDto timeDto5 = self.last_sent_at;
            if (timeDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, TimeDto.Serializer.INSTANCE, timeDto5);
            }
            if (!Intrinsics.areEqual(self.fix_conn_id, "")) {
                output.encodeStringElement(serialDesc, 28, self.fix_conn_id);
            }
            if (self.market_state != MarketStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 29, MarketStateDto.Serializer.INSTANCE, self.market_state);
            }
            NullableStringDto nullableStringDto = self.clearing_firm;
            if (nullableStringDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, NullableStringDto.Serializer.INSTANCE, nullableStringDto);
            }
            NullableStringDto nullableStringDto2 = self.response_text;
            if (nullableStringDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, NullableStringDto.Serializer.INSTANCE, nullableStringDto2);
            }
            TimeDto timeDto6 = self.to_cancel_at;
            if (timeDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, TimeDto.Serializer.INSTANCE, timeDto6);
            }
            TimeDto timeDto7 = self.to_send_at;
            if (timeDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, TimeDto.Serializer.INSTANCE, timeDto7);
            }
            NullableStringDto nullableStringDto3 = self.venue_id;
            if (nullableStringDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, NullableStringDto.Serializer.INSTANCE, nullableStringDto3);
            }
            AgentDto agentDto = self.created_agent;
            AgentDto.Companion companion = AgentDto.INSTANCE;
            if (agentDto != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 35, AgentDto.Serializer.INSTANCE, self.created_agent);
            }
            NullableStringDto nullableStringDto4 = self.cl_ord_id;
            if (nullableStringDto4 != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, NullableStringDto.Serializer.INSTANCE, nullableStringDto4);
            }
            if (!Intrinsics.areEqual(self.send_logs, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 37, lazyArr[37].getValue(), self.send_logs);
            }
            if (self.cancel_open_agent != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 38, AgentDto.Serializer.INSTANCE, self.cancel_open_agent);
            }
            TimeDto timeDto8 = self.cancel_open_time;
            if (timeDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, TimeDto.Serializer.INSTANCE, timeDto8);
            }
            if (self.cancel_close_agent != companion.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 40, AgentDto.Serializer.INSTANCE, self.cancel_close_agent);
            }
            TimeDto timeDto9 = self.cancel_close_time;
            if (timeDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 41, TimeDto.Serializer.INSTANCE, timeDto9);
            }
            if (self.created_service != ClientServiceDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 42, ClientServiceDto.Serializer.INSTANCE, self.created_service);
            }
            if (self.created_affiliate != AffiliateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 43, AffiliateDto.Serializer.INSTANCE, self.created_affiliate);
            }
            NullableIntDto nullableIntDto = self.service_shard_id;
            if (nullableIntDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 44, NullableIntDto.Serializer.INSTANCE, nullableIntDto);
            }
            if (!Intrinsics.areEqual(self.instruments, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 45, lazyArr[45].getValue(), self.instruments);
            }
            if (self.response_category != ResponseCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 46, ResponseCategoryDto.Serializer.INSTANCE, self.response_category);
            }
            OrderMetadataDto orderMetadataDto = self.metadata;
            if (orderMetadataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 47, OrderMetadataDto.Serializer.INSTANCE, orderMetadataDto);
            }
            if (!Intrinsics.areEqual(self.handling_instructions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 48, lazyArr[48].getValue(), self.handling_instructions);
            }
            if (self.market_hours != MarketHoursDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 49, MarketHoursDto.Serializer.INSTANCE, self.market_hours);
            }
            NullableBoolDto nullableBoolDto = self.pro_trader;
            if (nullableBoolDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 50, NullableBoolDto.Serializer.INSTANCE, nullableBoolDto);
            }
            DateDto dateDto = self.expire_date;
            if (dateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 51, DateDto.Serializer.INSTANCE, dateDto);
            }
            if (!Intrinsics.areEqual(self.instruments_v2, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 52, lazyArr[52].getValue(), self.instruments_v2);
            }
            if (self.waiting_category != WaitingCategoryDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 53, WaitingCategoryDto.Serializer.INSTANCE, self.waiting_category);
            }
            NullableBoolDto nullableBoolDto2 = self.force_route;
            if (nullableBoolDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 54, NullableBoolDto.Serializer.INSTANCE, nullableBoolDto2);
            }
            DecimalDto decimalDto7 = self.notional;
            if (decimalDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 55, DecimalDto.Serializer.INSTANCE, decimalDto7);
            }
            DecimalDto decimalDto8 = self.max_quantity;
            if (decimalDto8 != null) {
                output.encodeNullableSerializableElement(serialDesc, 56, DecimalDto.Serializer.INSTANCE, decimalDto8);
            }
            DecimalDto decimalDto9 = self.reserved_buying_power;
            if (decimalDto9 != null) {
                output.encodeNullableSerializableElement(serialDesc, 57, DecimalDto.Serializer.INSTANCE, decimalDto9);
            }
            if (self.instrument_type != InstrumentTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 58, InstrumentTypeDto.Serializer.INSTANCE, self.instrument_type);
            }
            UUIDDto uUIDDto6 = self.replacement_order_id;
            if (uUIDDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 59, UUIDDto.Serializer.INSTANCE, uUIDDto6);
            }
            if (!Intrinsics.areEqual(self.ChildMarkets, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 60, lazyArr[60].getValue(), self.ChildMarkets);
            }
            DecimalDto decimalDto10 = self.quantity_to_replace;
            if (decimalDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 61, DecimalDto.Serializer.INSTANCE, decimalDto10);
            }
            UUIDDto uUIDDto7 = self.list_root_id;
            if (uUIDDto7 != null) {
                output.encodeNullableSerializableElement(serialDesc, 62, UUIDDto.Serializer.INSTANCE, uUIDDto7);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 63, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            if (self.margin_mode != MarginModeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 64, MarginModeDto.Serializer.INSTANCE, self.margin_mode);
            }
            DecimalDto decimalDto11 = self.leverage;
            if (decimalDto11 != null) {
                output.encodeNullableSerializableElement(serialDesc, 65, DecimalDto.Serializer.INSTANCE, decimalDto11);
            }
            NullableBoolDto nullableBoolDto3 = self.reduce_only;
            if (nullableBoolDto3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 66, NullableBoolDto.Serializer.INSTANCE, nullableBoolDto3);
            }
            if (self.currency_denomination != CurrencyDenominationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 67, CurrencyDenominationDto.Serializer.INSTANCE, self.currency_denomination);
            }
            if (self.position_effect != PositionEffectDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 68, PositionEffectDto.Serializer.INSTANCE, self.position_effect);
            }
            NullableStringDto nullableStringDto5 = self.position_id;
            if (nullableStringDto5 != null) {
                output.encodeNullableSerializableElement(serialDesc, 69, NullableStringDto.Serializer.INSTANCE, nullableStringDto5);
            }
            NullableIntDto nullableIntDto2 = self.active_ttl_seconds;
            if (nullableIntDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 70, NullableIntDto.Serializer.INSTANCE, nullableIntDto2);
            }
            TimeDto timeDto10 = self.to_expire_at;
            if (timeDto10 != null) {
                output.encodeNullableSerializableElement(serialDesc, 71, TimeDto.Serializer.INSTANCE, timeDto10);
            }
            if (self.capacity != CapacityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 72, CapacityDto.Serializer.INSTANCE, self.capacity);
            }
            NullableStringDto nullableStringDto6 = self.force_fix_line;
            if (nullableStringDto6 != null) {
                output.encodeNullableSerializableElement(serialDesc, 73, NullableStringDto.Serializer.INSTANCE, nullableStringDto6);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String account_number, RouteDto route, SideDto side, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto peg_type, OrderTriggerDto trigger, TimeInForceDto time_in_force, OrderStateDto state, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List<ExecutionDto> executions, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto type2, int i, List<OrderLegDto> legs, TimeDto timeDto5, String fix_conn_id, MarketStateDto market_state, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto created_agent, NullableStringDto nullableStringDto4, List<OrderSendLogDto> send_logs, AgentDto cancel_open_agent, TimeDto timeDto8, AgentDto cancel_close_agent, TimeDto timeDto9, ClientServiceDto created_service, AffiliateDto created_affiliate, NullableIntDto nullableIntDto, List<InstrumentInfoDto> instruments, ResponseCategoryDto response_category, OrderMetadataDto orderMetadataDto, List<? extends HandlingInstructionDto> handling_instructions, MarketHoursDto market_hours, NullableBoolDto nullableBoolDto, DateDto dateDto, List<InstrumentInfoV2Dto> instruments_v2, WaitingCategoryDto waiting_category, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrument_type, UUIDDto uUIDDto6, List<String> ChildMarkets, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto account_type, MarginModeDto margin_mode, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currency_denomination, PositionEffectDto position_effect, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacity, NullableStringDto nullableStringDto6) {
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(peg_type, "peg_type");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(time_in_force, "time_in_force");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(executions, "executions");
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(legs, "legs");
            Intrinsics.checkNotNullParameter(fix_conn_id, "fix_conn_id");
            Intrinsics.checkNotNullParameter(market_state, "market_state");
            Intrinsics.checkNotNullParameter(created_agent, "created_agent");
            Intrinsics.checkNotNullParameter(send_logs, "send_logs");
            Intrinsics.checkNotNullParameter(cancel_open_agent, "cancel_open_agent");
            Intrinsics.checkNotNullParameter(cancel_close_agent, "cancel_close_agent");
            Intrinsics.checkNotNullParameter(created_service, "created_service");
            Intrinsics.checkNotNullParameter(created_affiliate, "created_affiliate");
            Intrinsics.checkNotNullParameter(instruments, "instruments");
            Intrinsics.checkNotNullParameter(response_category, "response_category");
            Intrinsics.checkNotNullParameter(handling_instructions, "handling_instructions");
            Intrinsics.checkNotNullParameter(market_hours, "market_hours");
            Intrinsics.checkNotNullParameter(instruments_v2, "instruments_v2");
            Intrinsics.checkNotNullParameter(waiting_category, "waiting_category");
            Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
            Intrinsics.checkNotNullParameter(ChildMarkets, "ChildMarkets");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(margin_mode, "margin_mode");
            Intrinsics.checkNotNullParameter(currency_denomination, "currency_denomination");
            Intrinsics.checkNotNullParameter(position_effect, "position_effect");
            Intrinsics.checkNotNullParameter(capacity, "capacity");
            this.id = uUIDDto;
            this.instrument_id = uUIDDto2;
            this.parent_order_id = uUIDDto3;
            this.account_number = account_number;
            this.route = route;
            this.side = side;
            this.price = decimalDto;
            this.stop_price = decimalDto2;
            this.trailing_peg = decimalDto3;
            this.last_trail_price = decimalDto4;
            this.quantity = decimalDto5;
            this.cancelled_quantity = decimalDto6;
            this.peg_type = peg_type;
            this.trigger = trigger;
            this.time_in_force = time_in_force;
            this.state = state;
            this.created_at = timeDto;
            this.received_at = timeDto2;
            this.last_transaction_at = timeDto3;
            this.executions = executions;
            this.extended_hours = z;
            this.stop_triggered_at = timeDto4;
            this.user_currency = uUIDDto4;
            this.asset_currency = uUIDDto5;
            this.type = type2;
            this.update_count = i;
            this.legs = legs;
            this.last_sent_at = timeDto5;
            this.fix_conn_id = fix_conn_id;
            this.market_state = market_state;
            this.clearing_firm = nullableStringDto;
            this.response_text = nullableStringDto2;
            this.to_cancel_at = timeDto6;
            this.to_send_at = timeDto7;
            this.venue_id = nullableStringDto3;
            this.created_agent = created_agent;
            this.cl_ord_id = nullableStringDto4;
            this.send_logs = send_logs;
            this.cancel_open_agent = cancel_open_agent;
            this.cancel_open_time = timeDto8;
            this.cancel_close_agent = cancel_close_agent;
            this.cancel_close_time = timeDto9;
            this.created_service = created_service;
            this.created_affiliate = created_affiliate;
            this.service_shard_id = nullableIntDto;
            this.instruments = instruments;
            this.response_category = response_category;
            this.metadata = orderMetadataDto;
            this.handling_instructions = handling_instructions;
            this.market_hours = market_hours;
            this.pro_trader = nullableBoolDto;
            this.expire_date = dateDto;
            this.instruments_v2 = instruments_v2;
            this.waiting_category = waiting_category;
            this.force_route = nullableBoolDto2;
            this.notional = decimalDto7;
            this.max_quantity = decimalDto8;
            this.reserved_buying_power = decimalDto9;
            this.instrument_type = instrument_type;
            this.replacement_order_id = uUIDDto6;
            this.ChildMarkets = ChildMarkets;
            this.quantity_to_replace = decimalDto10;
            this.list_root_id = uUIDDto7;
            this.account_type = account_type;
            this.margin_mode = margin_mode;
            this.leverage = decimalDto11;
            this.reduce_only = nullableBoolDto3;
            this.currency_denomination = currency_denomination;
            this.position_effect = position_effect;
            this.position_id = nullableStringDto5;
            this.active_ttl_seconds = nullableIntDto2;
            this.to_expire_at = timeDto10;
            this.capacity = capacity;
            this.force_fix_line = nullableStringDto6;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(UUIDDto uUIDDto, UUIDDto uUIDDto2, UUIDDto uUIDDto3, String str, RouteDto routeDto, SideDto sideDto, DecimalDto decimalDto, DecimalDto decimalDto2, DecimalDto decimalDto3, DecimalDto decimalDto4, DecimalDto decimalDto5, DecimalDto decimalDto6, PegTypeDto pegTypeDto, OrderTriggerDto orderTriggerDto, TimeInForceDto timeInForceDto, OrderStateDto orderStateDto, TimeDto timeDto, TimeDto timeDto2, TimeDto timeDto3, List list, boolean z, TimeDto timeDto4, UUIDDto uUIDDto4, UUIDDto uUIDDto5, OrderTypeDto orderTypeDto, int i, List list2, TimeDto timeDto5, String str2, MarketStateDto marketStateDto, NullableStringDto nullableStringDto, NullableStringDto nullableStringDto2, TimeDto timeDto6, TimeDto timeDto7, NullableStringDto nullableStringDto3, AgentDto agentDto, NullableStringDto nullableStringDto4, List list3, AgentDto agentDto2, TimeDto timeDto8, AgentDto agentDto3, TimeDto timeDto9, ClientServiceDto clientServiceDto, AffiliateDto affiliateDto, NullableIntDto nullableIntDto, List list4, ResponseCategoryDto responseCategoryDto, OrderMetadataDto orderMetadataDto, List list5, MarketHoursDto marketHoursDto, NullableBoolDto nullableBoolDto, DateDto dateDto, List list6, WaitingCategoryDto waitingCategoryDto, NullableBoolDto nullableBoolDto2, DecimalDto decimalDto7, DecimalDto decimalDto8, DecimalDto decimalDto9, InstrumentTypeDto instrumentTypeDto, UUIDDto uUIDDto6, List list7, DecimalDto decimalDto10, UUIDDto uUIDDto7, AccountTypeDto accountTypeDto, MarginModeDto marginModeDto, DecimalDto decimalDto11, NullableBoolDto nullableBoolDto3, CurrencyDenominationDto currencyDenominationDto, PositionEffectDto positionEffectDto, NullableStringDto nullableStringDto5, NullableIntDto nullableIntDto2, TimeDto timeDto10, CapacityDto capacityDto, NullableStringDto nullableStringDto6, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            UUIDDto uUIDDto8 = (i2 & 1) != 0 ? null : uUIDDto;
            UUIDDto uUIDDto9 = (i2 & 2) != 0 ? null : uUIDDto2;
            UUIDDto uUIDDto10 = (i2 & 4) != 0 ? null : uUIDDto3;
            String str3 = (i2 & 8) != 0 ? "" : str;
            RouteDto zeroValue = (i2 & 16) != 0 ? RouteDto.INSTANCE.getZeroValue() : routeDto;
            SideDto zeroValue2 = (i2 & 32) != 0 ? SideDto.INSTANCE.getZeroValue() : sideDto;
            DecimalDto decimalDto12 = (i2 & 64) != 0 ? null : decimalDto;
            DecimalDto decimalDto13 = (i2 & 128) != 0 ? null : decimalDto2;
            DecimalDto decimalDto14 = (i2 & 256) != 0 ? null : decimalDto3;
            DecimalDto decimalDto15 = (i2 & 512) != 0 ? null : decimalDto4;
            DecimalDto decimalDto16 = (i2 & 1024) != 0 ? null : decimalDto5;
            DecimalDto decimalDto17 = (i2 & 2048) != 0 ? null : decimalDto6;
            UUIDDto uUIDDto11 = uUIDDto8;
            PegTypeDto zeroValue3 = (i2 & 4096) != 0 ? PegTypeDto.INSTANCE.getZeroValue() : pegTypeDto;
            OrderTriggerDto zeroValue4 = (i2 & 8192) != 0 ? OrderTriggerDto.INSTANCE.getZeroValue() : orderTriggerDto;
            TimeInForceDto zeroValue5 = (i2 & 16384) != 0 ? TimeInForceDto.INSTANCE.getZeroValue() : timeInForceDto;
            OrderStateDto zeroValue6 = (i2 & 32768) != 0 ? OrderStateDto.INSTANCE.getZeroValue() : orderStateDto;
            TimeDto timeDto11 = (i2 & 65536) != 0 ? null : timeDto;
            TimeDto timeDto12 = (i2 & 131072) != 0 ? null : timeDto2;
            TimeDto timeDto13 = (i2 & 262144) != 0 ? null : timeDto3;
            List listEmptyList = (i2 & 524288) != 0 ? CollectionsKt.emptyList() : list;
            boolean z2 = (i2 & 1048576) != 0 ? false : z;
            TimeDto timeDto14 = (i2 & 2097152) != 0 ? null : timeDto4;
            UUIDDto uUIDDto12 = (i2 & 4194304) != 0 ? null : uUIDDto4;
            UUIDDto uUIDDto13 = (i2 & 8388608) != 0 ? null : uUIDDto5;
            OrderTypeDto zeroValue7 = (i2 & 16777216) != 0 ? OrderTypeDto.INSTANCE.getZeroValue() : orderTypeDto;
            int i5 = (i2 & 33554432) != 0 ? 0 : i;
            List listEmptyList2 = (i2 & 67108864) != 0 ? CollectionsKt.emptyList() : list2;
            TimeDto timeDto15 = (i2 & 134217728) != 0 ? null : timeDto5;
            String str4 = (i2 & 268435456) == 0 ? str2 : "";
            MarketStateDto zeroValue8 = (i2 & 536870912) != 0 ? MarketStateDto.INSTANCE.getZeroValue() : marketStateDto;
            NullableStringDto nullableStringDto7 = (i2 & 1073741824) != 0 ? null : nullableStringDto;
            NullableStringDto nullableStringDto8 = (i2 & Integer.MIN_VALUE) != 0 ? null : nullableStringDto2;
            this(uUIDDto11, uUIDDto9, uUIDDto10, str3, zeroValue, zeroValue2, decimalDto12, decimalDto13, decimalDto14, decimalDto15, decimalDto16, decimalDto17, zeroValue3, zeroValue4, zeroValue5, zeroValue6, timeDto11, timeDto12, timeDto13, listEmptyList, z2, timeDto14, uUIDDto12, uUIDDto13, zeroValue7, i5, listEmptyList2, timeDto15, str4, zeroValue8, nullableStringDto7, nullableStringDto8, (i3 & 1) != 0 ? null : timeDto6, (i3 & 2) != 0 ? null : timeDto7, (i3 & 4) != 0 ? null : nullableStringDto3, (i3 & 8) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto, (i3 & 16) != 0 ? null : nullableStringDto4, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 64) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto2, (i3 & 128) != 0 ? null : timeDto8, (i3 & 256) != 0 ? AgentDto.INSTANCE.getZeroValue() : agentDto3, (i3 & 512) != 0 ? null : timeDto9, (i3 & 1024) != 0 ? ClientServiceDto.INSTANCE.getZeroValue() : clientServiceDto, (i3 & 2048) != 0 ? AffiliateDto.INSTANCE.getZeroValue() : affiliateDto, (i3 & 4096) != 0 ? null : nullableIntDto, (i3 & 8192) != 0 ? CollectionsKt.emptyList() : list4, (i3 & 16384) != 0 ? ResponseCategoryDto.INSTANCE.getZeroValue() : responseCategoryDto, (i3 & 32768) != 0 ? null : orderMetadataDto, (i3 & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i3 & 131072) != 0 ? MarketHoursDto.INSTANCE.getZeroValue() : marketHoursDto, (i3 & 262144) != 0 ? null : nullableBoolDto, (i3 & 524288) != 0 ? null : dateDto, (i3 & 1048576) != 0 ? CollectionsKt.emptyList() : list6, (i3 & 2097152) != 0 ? WaitingCategoryDto.INSTANCE.getZeroValue() : waitingCategoryDto, (i3 & 4194304) != 0 ? null : nullableBoolDto2, (i3 & 8388608) != 0 ? null : decimalDto7, (i3 & 16777216) != 0 ? null : decimalDto8, (i3 & 33554432) != 0 ? null : decimalDto9, (i3 & 67108864) != 0 ? InstrumentTypeDto.INSTANCE.getZeroValue() : instrumentTypeDto, (i3 & 134217728) != 0 ? null : uUIDDto6, (i3 & 268435456) != 0 ? CollectionsKt.emptyList() : list7, (i3 & 536870912) != 0 ? null : decimalDto10, (i3 & 1073741824) != 0 ? null : uUIDDto7, (i3 & Integer.MIN_VALUE) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i4 & 1) != 0 ? MarginModeDto.INSTANCE.getZeroValue() : marginModeDto, (i4 & 2) != 0 ? null : decimalDto11, (i4 & 4) != 0 ? null : nullableBoolDto3, (i4 & 8) != 0 ? CurrencyDenominationDto.INSTANCE.getZeroValue() : currencyDenominationDto, (i4 & 16) != 0 ? PositionEffectDto.INSTANCE.getZeroValue() : positionEffectDto, (i4 & 32) != 0 ? null : nullableStringDto5, (i4 & 64) != 0 ? null : nullableIntDto2, (i4 & 128) != 0 ? null : timeDto10, (i4 & 256) != 0 ? CapacityDto.INSTANCE.getZeroValue() : capacityDto, (i4 & 512) != 0 ? null : nullableStringDto6);
        }

        public final UUIDDto getId() {
            return this.id;
        }

        public final UUIDDto getInstrument_id() {
            return this.instrument_id;
        }

        public final UUIDDto getParent_order_id() {
            return this.parent_order_id;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final RouteDto getRoute() {
            return this.route;
        }

        public final SideDto getSide() {
            return this.side;
        }

        public final DecimalDto getPrice() {
            return this.price;
        }

        public final DecimalDto getStop_price() {
            return this.stop_price;
        }

        public final DecimalDto getTrailing_peg() {
            return this.trailing_peg;
        }

        public final DecimalDto getLast_trail_price() {
            return this.last_trail_price;
        }

        public final DecimalDto getQuantity() {
            return this.quantity;
        }

        public final DecimalDto getCancelled_quantity() {
            return this.cancelled_quantity;
        }

        public final PegTypeDto getPeg_type() {
            return this.peg_type;
        }

        public final OrderTriggerDto getTrigger() {
            return this.trigger;
        }

        public final TimeInForceDto getTime_in_force() {
            return this.time_in_force;
        }

        public final OrderStateDto getState() {
            return this.state;
        }

        public final TimeDto getCreated_at() {
            return this.created_at;
        }

        public final TimeDto getReceived_at() {
            return this.received_at;
        }

        public final TimeDto getLast_transaction_at() {
            return this.last_transaction_at;
        }

        public final List<ExecutionDto> getExecutions() {
            return this.executions;
        }

        public final boolean getExtended_hours() {
            return this.extended_hours;
        }

        public final TimeDto getStop_triggered_at() {
            return this.stop_triggered_at;
        }

        public final UUIDDto getUser_currency() {
            return this.user_currency;
        }

        public final UUIDDto getAsset_currency() {
            return this.asset_currency;
        }

        public final OrderTypeDto getType() {
            return this.type;
        }

        public final int getUpdate_count() {
            return this.update_count;
        }

        public final List<OrderLegDto> getLegs() {
            return this.legs;
        }

        public final TimeDto getLast_sent_at() {
            return this.last_sent_at;
        }

        public final String getFix_conn_id() {
            return this.fix_conn_id;
        }

        public final MarketStateDto getMarket_state() {
            return this.market_state;
        }

        public final NullableStringDto getClearing_firm() {
            return this.clearing_firm;
        }

        public final NullableStringDto getResponse_text() {
            return this.response_text;
        }

        public final TimeDto getTo_cancel_at() {
            return this.to_cancel_at;
        }

        public final TimeDto getTo_send_at() {
            return this.to_send_at;
        }

        public final NullableStringDto getVenue_id() {
            return this.venue_id;
        }

        public final AgentDto getCreated_agent() {
            return this.created_agent;
        }

        public final NullableStringDto getCl_ord_id() {
            return this.cl_ord_id;
        }

        public final List<OrderSendLogDto> getSend_logs() {
            return this.send_logs;
        }

        public final AgentDto getCancel_open_agent() {
            return this.cancel_open_agent;
        }

        public final TimeDto getCancel_open_time() {
            return this.cancel_open_time;
        }

        public final AgentDto getCancel_close_agent() {
            return this.cancel_close_agent;
        }

        public final TimeDto getCancel_close_time() {
            return this.cancel_close_time;
        }

        public final ClientServiceDto getCreated_service() {
            return this.created_service;
        }

        public final AffiliateDto getCreated_affiliate() {
            return this.created_affiliate;
        }

        public final NullableIntDto getService_shard_id() {
            return this.service_shard_id;
        }

        public final List<InstrumentInfoDto> getInstruments() {
            return this.instruments;
        }

        public final ResponseCategoryDto getResponse_category() {
            return this.response_category;
        }

        public final OrderMetadataDto getMetadata() {
            return this.metadata;
        }

        public final List<HandlingInstructionDto> getHandling_instructions() {
            return this.handling_instructions;
        }

        public final MarketHoursDto getMarket_hours() {
            return this.market_hours;
        }

        public final NullableBoolDto getPro_trader() {
            return this.pro_trader;
        }

        public final DateDto getExpire_date() {
            return this.expire_date;
        }

        public final List<InstrumentInfoV2Dto> getInstruments_v2() {
            return this.instruments_v2;
        }

        public final WaitingCategoryDto getWaiting_category() {
            return this.waiting_category;
        }

        public final NullableBoolDto getForce_route() {
            return this.force_route;
        }

        public final DecimalDto getNotional() {
            return this.notional;
        }

        public final DecimalDto getMax_quantity() {
            return this.max_quantity;
        }

        public final DecimalDto getReserved_buying_power() {
            return this.reserved_buying_power;
        }

        public final InstrumentTypeDto getInstrument_type() {
            return this.instrument_type;
        }

        public final UUIDDto getReplacement_order_id() {
            return this.replacement_order_id;
        }

        public final List<String> getChildMarkets() {
            return this.ChildMarkets;
        }

        public final DecimalDto getQuantity_to_replace() {
            return this.quantity_to_replace;
        }

        public final UUIDDto getList_root_id() {
            return this.list_root_id;
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final MarginModeDto getMargin_mode() {
            return this.margin_mode;
        }

        public final DecimalDto getLeverage() {
            return this.leverage;
        }

        public final NullableBoolDto getReduce_only() {
            return this.reduce_only;
        }

        public final CurrencyDenominationDto getCurrency_denomination() {
            return this.currency_denomination;
        }

        public final PositionEffectDto getPosition_effect() {
            return this.position_effect;
        }

        public final NullableStringDto getPosition_id() {
            return this.position_id;
        }

        public final NullableIntDto getActive_ttl_seconds() {
            return this.active_ttl_seconds;
        }

        public final TimeDto getTo_expire_at() {
            return this.to_expire_at;
        }

        public final CapacityDto getCapacity() {
            return this.capacity;
        }

        public final NullableStringDto getForce_fix_line() {
            return this.force_fix_line;
        }
    }

    /* compiled from: OrderDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/mainst/OrderDto;", "Lcom/robinhood/rosetta/mainst/Order;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/mainst/OrderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OrderDto, Order> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OrderDto> getBinaryBase64Serializer() {
            return (KSerializer) OrderDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Order> getProtoAdapter() {
            return Order.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderDto getZeroValue() {
            return OrderDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OrderDto fromProto(Order proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UUID id = proto.getId();
            UUIDDto uUIDDtoFromProto = id != null ? UUIDDto.INSTANCE.fromProto(id) : null;
            UUID instrument_id = proto.getInstrument_id();
            UUIDDto uUIDDtoFromProto2 = instrument_id != null ? UUIDDto.INSTANCE.fromProto(instrument_id) : null;
            UUID parent_order_id = proto.getParent_order_id();
            UUIDDto uUIDDtoFromProto3 = parent_order_id != null ? UUIDDto.INSTANCE.fromProto(parent_order_id) : null;
            String account_number = proto.getAccount_number();
            RouteDto routeDtoFromProto = RouteDto.INSTANCE.fromProto(proto.getRoute());
            SideDto sideDtoFromProto = SideDto.INSTANCE.fromProto(proto.getSide());
            Decimal price = proto.getPrice();
            DecimalDto decimalDtoFromProto = price != null ? DecimalDto.INSTANCE.fromProto(price) : null;
            Decimal stop_price = proto.getStop_price();
            DecimalDto decimalDtoFromProto2 = stop_price != null ? DecimalDto.INSTANCE.fromProto(stop_price) : null;
            Decimal trailing_peg = proto.getTrailing_peg();
            DecimalDto decimalDtoFromProto3 = trailing_peg != null ? DecimalDto.INSTANCE.fromProto(trailing_peg) : null;
            Decimal last_trail_price = proto.getLast_trail_price();
            DecimalDto decimalDtoFromProto4 = last_trail_price != null ? DecimalDto.INSTANCE.fromProto(last_trail_price) : null;
            Decimal quantity = proto.getQuantity();
            DecimalDto decimalDtoFromProto5 = quantity != null ? DecimalDto.INSTANCE.fromProto(quantity) : null;
            Decimal cancelled_quantity = proto.getCancelled_quantity();
            DecimalDto decimalDtoFromProto6 = cancelled_quantity != null ? DecimalDto.INSTANCE.fromProto(cancelled_quantity) : null;
            PegTypeDto pegTypeDtoFromProto = PegTypeDto.INSTANCE.fromProto(proto.getPeg_type());
            OrderTriggerDto orderTriggerDtoFromProto = OrderTriggerDto.INSTANCE.fromProto(proto.getTrigger());
            TimeInForceDto timeInForceDtoFromProto = TimeInForceDto.INSTANCE.fromProto(proto.getTime_in_force());
            OrderStateDto orderStateDtoFromProto = OrderStateDto.INSTANCE.fromProto(proto.getState());
            Time created_at = proto.getCreated_at();
            TimeDto timeDtoFromProto = created_at != null ? TimeDto.INSTANCE.fromProto(created_at) : null;
            Time received_at = proto.getReceived_at();
            TimeDto timeDtoFromProto2 = received_at != null ? TimeDto.INSTANCE.fromProto(received_at) : null;
            Time last_transaction_at = proto.getLast_transaction_at();
            TimeDto timeDtoFromProto3 = last_transaction_at != null ? TimeDto.INSTANCE.fromProto(last_transaction_at) : null;
            List<Execution> executions = proto.getExecutions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(executions, 10));
            Iterator<T> it = executions.iterator();
            while (it.hasNext()) {
                arrayList.add(ExecutionDto.INSTANCE.fromProto((Execution) it.next()));
            }
            boolean extended_hours = proto.getExtended_hours();
            Time stop_triggered_at = proto.getStop_triggered_at();
            TimeDto timeDtoFromProto4 = stop_triggered_at != null ? TimeDto.INSTANCE.fromProto(stop_triggered_at) : null;
            UUID user_currency = proto.getUser_currency();
            UUIDDto uUIDDtoFromProto4 = user_currency != null ? UUIDDto.INSTANCE.fromProto(user_currency) : null;
            UUID asset_currency = proto.getAsset_currency();
            UUIDDto uUIDDtoFromProto5 = asset_currency != null ? UUIDDto.INSTANCE.fromProto(asset_currency) : null;
            OrderTypeDto orderTypeDtoFromProto = OrderTypeDto.INSTANCE.fromProto(proto.getType());
            int update_count = proto.getUpdate_count();
            List<OrderLeg> legs = proto.getLegs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it2 = legs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(OrderLegDto.INSTANCE.fromProto((OrderLeg) it2.next()));
            }
            Time last_sent_at = proto.getLast_sent_at();
            TimeDto timeDtoFromProto5 = last_sent_at != null ? TimeDto.INSTANCE.fromProto(last_sent_at) : null;
            String fix_conn_id = proto.getFix_conn_id();
            MarketStateDto marketStateDtoFromProto = MarketStateDto.INSTANCE.fromProto(proto.getMarket_state());
            NullableString clearing_firm = proto.getClearing_firm();
            NullableStringDto nullableStringDtoFromProto = clearing_firm != null ? NullableStringDto.INSTANCE.fromProto(clearing_firm) : null;
            NullableString response_text = proto.getResponse_text();
            NullableStringDto nullableStringDtoFromProto2 = response_text != null ? NullableStringDto.INSTANCE.fromProto(response_text) : null;
            Time to_cancel_at = proto.getTo_cancel_at();
            TimeDto timeDtoFromProto6 = to_cancel_at != null ? TimeDto.INSTANCE.fromProto(to_cancel_at) : null;
            Time to_send_at = proto.getTo_send_at();
            TimeDto timeDtoFromProto7 = to_send_at != null ? TimeDto.INSTANCE.fromProto(to_send_at) : null;
            NullableString venue_id = proto.getVenue_id();
            NullableStringDto nullableStringDtoFromProto3 = venue_id != null ? NullableStringDto.INSTANCE.fromProto(venue_id) : null;
            AgentDto agentDtoFromProto = AgentDto.INSTANCE.fromProto(proto.getCreated_agent());
            NullableString cl_ord_id = proto.getCl_ord_id();
            NullableStringDto nullableStringDtoFromProto4 = cl_ord_id != null ? NullableStringDto.INSTANCE.fromProto(cl_ord_id) : null;
            List<OrderSendLog> send_logs = proto.getSend_logs();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(send_logs, 10));
            Iterator<T> it3 = send_logs.iterator();
            while (it3.hasNext()) {
                arrayList3.add(OrderSendLogDto.INSTANCE.fromProto((OrderSendLog) it3.next()));
            }
            AgentDto.Companion companion = AgentDto.INSTANCE;
            AgentDto agentDtoFromProto2 = companion.fromProto(proto.getCancel_open_agent());
            Time cancel_open_time = proto.getCancel_open_time();
            TimeDto timeDtoFromProto8 = cancel_open_time != null ? TimeDto.INSTANCE.fromProto(cancel_open_time) : null;
            AgentDto agentDtoFromProto3 = companion.fromProto(proto.getCancel_close_agent());
            Time cancel_close_time = proto.getCancel_close_time();
            TimeDto timeDtoFromProto9 = cancel_close_time != null ? TimeDto.INSTANCE.fromProto(cancel_close_time) : null;
            ClientServiceDto clientServiceDtoFromProto = ClientServiceDto.INSTANCE.fromProto(proto.getCreated_service());
            AffiliateDto affiliateDtoFromProto = AffiliateDto.INSTANCE.fromProto(proto.getCreated_affiliate());
            NullableInt service_shard_id = proto.getService_shard_id();
            NullableIntDto nullableIntDtoFromProto = service_shard_id != null ? NullableIntDto.INSTANCE.fromProto(service_shard_id) : null;
            List<InstrumentInfo> instruments = proto.getInstruments();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instruments, 10));
            Iterator<T> it4 = instruments.iterator();
            while (it4.hasNext()) {
                arrayList4.add(InstrumentInfoDto.INSTANCE.fromProto((InstrumentInfo) it4.next()));
            }
            ResponseCategoryDto responseCategoryDtoFromProto = ResponseCategoryDto.INSTANCE.fromProto(proto.getResponse_category());
            OrderMetadata metadata = proto.getMetadata();
            OrderMetadataDto orderMetadataDtoFromProto = metadata != null ? OrderMetadataDto.INSTANCE.fromProto(metadata) : null;
            List<HandlingInstruction> handling_instructions = proto.getHandling_instructions();
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(handling_instructions, 10));
            Iterator<T> it5 = handling_instructions.iterator();
            while (it5.hasNext()) {
                arrayList5.add(HandlingInstructionDto.INSTANCE.fromProto((HandlingInstruction) it5.next()));
            }
            MarketHoursDto marketHoursDtoFromProto = MarketHoursDto.INSTANCE.fromProto(proto.getMarket_hours());
            NullableBool pro_trader = proto.getPro_trader();
            NullableBoolDto nullableBoolDtoFromProto = pro_trader != null ? NullableBoolDto.INSTANCE.fromProto(pro_trader) : null;
            Date expire_date = proto.getExpire_date();
            DateDto dateDtoFromProto = expire_date != null ? DateDto.INSTANCE.fromProto(expire_date) : null;
            List<InstrumentInfoV2> instruments_v2 = proto.getInstruments_v2();
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(instruments_v2, 10));
            Iterator<T> it6 = instruments_v2.iterator();
            while (it6.hasNext()) {
                arrayList6.add(InstrumentInfoV2Dto.INSTANCE.fromProto((InstrumentInfoV2) it6.next()));
            }
            WaitingCategoryDto waitingCategoryDtoFromProto = WaitingCategoryDto.INSTANCE.fromProto(proto.getWaiting_category());
            NullableBool force_route = proto.getForce_route();
            NullableBoolDto nullableBoolDtoFromProto2 = force_route != null ? NullableBoolDto.INSTANCE.fromProto(force_route) : null;
            Decimal notional = proto.getNotional();
            DecimalDto decimalDtoFromProto7 = notional != null ? DecimalDto.INSTANCE.fromProto(notional) : null;
            Decimal max_quantity = proto.getMax_quantity();
            DecimalDto decimalDtoFromProto8 = max_quantity != null ? DecimalDto.INSTANCE.fromProto(max_quantity) : null;
            Decimal reserved_buying_power = proto.getReserved_buying_power();
            DecimalDto decimalDtoFromProto9 = reserved_buying_power != null ? DecimalDto.INSTANCE.fromProto(reserved_buying_power) : null;
            InstrumentTypeDto instrumentTypeDtoFromProto = InstrumentTypeDto.INSTANCE.fromProto(proto.getInstrument_type());
            UUID replacement_order_id = proto.getReplacement_order_id();
            UUIDDto uUIDDtoFromProto6 = replacement_order_id != null ? UUIDDto.INSTANCE.fromProto(replacement_order_id) : null;
            List<String> childMarkets = proto.getChildMarkets();
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(childMarkets, 10));
            Iterator<T> it7 = childMarkets.iterator();
            while (it7.hasNext()) {
                arrayList7.add((String) it7.next());
            }
            Decimal quantity_to_replace = proto.getQuantity_to_replace();
            DecimalDto decimalDtoFromProto10 = quantity_to_replace != null ? DecimalDto.INSTANCE.fromProto(quantity_to_replace) : null;
            UUID list_root_id = proto.getList_root_id();
            UUIDDto uUIDDtoFromProto7 = list_root_id != null ? UUIDDto.INSTANCE.fromProto(list_root_id) : null;
            AccountTypeDto accountTypeDtoFromProto = AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type());
            MarginModeDto marginModeDtoFromProto = MarginModeDto.INSTANCE.fromProto(proto.getMargin_mode());
            Decimal leverage = proto.getLeverage();
            DecimalDto decimalDtoFromProto11 = leverage != null ? DecimalDto.INSTANCE.fromProto(leverage) : null;
            NullableBool reduce_only = proto.getReduce_only();
            NullableBoolDto nullableBoolDtoFromProto3 = reduce_only != null ? NullableBoolDto.INSTANCE.fromProto(reduce_only) : null;
            CurrencyDenominationDto currencyDenominationDtoFromProto = CurrencyDenominationDto.INSTANCE.fromProto(proto.getCurrency_denomination());
            PositionEffectDto positionEffectDtoFromProto = PositionEffectDto.INSTANCE.fromProto(proto.getPosition_effect());
            NullableString position_id = proto.getPosition_id();
            NullableStringDto nullableStringDtoFromProto5 = position_id != null ? NullableStringDto.INSTANCE.fromProto(position_id) : null;
            NullableInt active_ttl_seconds = proto.getActive_ttl_seconds();
            NullableIntDto nullableIntDtoFromProto2 = active_ttl_seconds != null ? NullableIntDto.INSTANCE.fromProto(active_ttl_seconds) : null;
            Time to_expire_at = proto.getTo_expire_at();
            TimeDto timeDtoFromProto10 = to_expire_at != null ? TimeDto.INSTANCE.fromProto(to_expire_at) : null;
            CapacityDto capacityDtoFromProto = CapacityDto.INSTANCE.fromProto(proto.getCapacity());
            NullableString force_fix_line = proto.getForce_fix_line();
            return new OrderDto(new Surrogate(uUIDDtoFromProto, uUIDDtoFromProto2, uUIDDtoFromProto3, account_number, routeDtoFromProto, sideDtoFromProto, decimalDtoFromProto, decimalDtoFromProto2, decimalDtoFromProto3, decimalDtoFromProto4, decimalDtoFromProto5, decimalDtoFromProto6, pegTypeDtoFromProto, orderTriggerDtoFromProto, timeInForceDtoFromProto, orderStateDtoFromProto, timeDtoFromProto, timeDtoFromProto2, timeDtoFromProto3, arrayList, extended_hours, timeDtoFromProto4, uUIDDtoFromProto4, uUIDDtoFromProto5, orderTypeDtoFromProto, update_count, arrayList2, timeDtoFromProto5, fix_conn_id, marketStateDtoFromProto, nullableStringDtoFromProto, nullableStringDtoFromProto2, timeDtoFromProto6, timeDtoFromProto7, nullableStringDtoFromProto3, agentDtoFromProto, nullableStringDtoFromProto4, arrayList3, agentDtoFromProto2, timeDtoFromProto8, agentDtoFromProto3, timeDtoFromProto9, clientServiceDtoFromProto, affiliateDtoFromProto, nullableIntDtoFromProto, arrayList4, responseCategoryDtoFromProto, orderMetadataDtoFromProto, arrayList5, marketHoursDtoFromProto, nullableBoolDtoFromProto, dateDtoFromProto, arrayList6, waitingCategoryDtoFromProto, nullableBoolDtoFromProto2, decimalDtoFromProto7, decimalDtoFromProto8, decimalDtoFromProto9, instrumentTypeDtoFromProto, uUIDDtoFromProto6, arrayList7, decimalDtoFromProto10, uUIDDtoFromProto7, accountTypeDtoFromProto, marginModeDtoFromProto, decimalDtoFromProto11, nullableBoolDtoFromProto3, currencyDenominationDtoFromProto, positionEffectDtoFromProto, nullableStringDtoFromProto5, nullableIntDtoFromProto2, timeDtoFromProto10, capacityDtoFromProto, force_fix_line != null ? NullableStringDto.INSTANCE.fromProto(force_fix_line) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.mainst.OrderDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderDto.binaryBase64Serializer_delegate$lambda$7();
            }
        });
        zeroValue = new OrderDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$7() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OrderDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/mainst/OrderDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/mainst/OrderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<OrderDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.mainst.Order", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OrderDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OrderDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OrderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OrderDto.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.mainst.OrderDto";
        }
    }
}
