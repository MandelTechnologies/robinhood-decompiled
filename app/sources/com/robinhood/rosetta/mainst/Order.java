package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.i18n.Affiliate;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import rosetta.mainst.Capacity;
import rosetta.mainst.InstrumentType;
import rosetta.mainst.MarginMode;
import rosetta.mainst.MarketState;
import rosetta.mainst.OrderState;
import rosetta.mainst.OrderTrigger;
import rosetta.mainst.OrderType;
import rosetta.mainst.PositionEffect;
import rosetta.mainst.Route;
import rosetta.mainst.Side;
import rosetta.mainst.TimeInForce;
import rosetta.order.AccountType;
import rosetta.order.Agent;
import rosetta.order.ClientService;
import rosetta.order.CurrencyDenomination;
import rosetta.order.HandlingInstruction;
import rosetta.order.MarketHours;
import rosetta.order.PegType;
import rosetta.order.ResponseCategory;
import rosetta.order.WaitingCategory;

/* compiled from: Order.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bo\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 è\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002è\u0001Bñ\u0006\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0!\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010/\u001a\u00020\b\u0012\b\b\u0002\u00100\u001a\u000201\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00108\u001a\u000209\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000103\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020<0!\u0012\b\b\u0002\u0010=\u001a\u000209\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010?\u001a\u000209\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010A\u001a\u00020B\u0012\b\b\u0002\u0010C\u001a\u00020D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020H0!\u0012\b\b\u0002\u0010I\u001a\u00020J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020N0!\u0012\b\b\u0002\u0010O\u001a\u00020P\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020V0!\u0012\b\b\u0002\u0010W\u001a\u00020X\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010]\u001a\u00020^\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0!\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010c\u001a\u00020d\u0012\b\b\u0002\u0010e\u001a\u00020f\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010R\u0012\b\b\u0002\u0010i\u001a\u00020j\u0012\b\b\u0002\u0010k\u001a\u00020l\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010p\u001a\u00020q\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u0010s\u001a\u00020t¢\u0006\u0004\bu\u0010vJ\t\u0010á\u0001\u001a\u00020\u0002H\u0017J\u0016\u0010â\u0001\u001a\u00020$2\n\u0010ã\u0001\u001a\u0005\u0018\u00010ä\u0001H\u0096\u0002J\t\u0010å\u0001\u001a\u00020+H\u0016J\t\u0010æ\u0001\u001a\u00020\bH\u0016Jñ\u0006\u0010ç\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020-0!2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010/\u001a\u00020\b2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u00107\u001a\u0004\u0018\u0001032\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u0001032\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020<0!2\b\b\u0002\u0010=\u001a\u0002092\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010?\u001a\u0002092\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\u000e\b\u0002\u0010G\u001a\b\u0012\u0004\u0012\u00020H0!2\b\b\u0002\u0010I\u001a\u00020J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u000e\b\u0002\u0010M\u001a\b\u0012\u0004\u0012\u00020N0!2\b\b\u0002\u0010O\u001a\u00020P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\u000e\b\u0002\u0010U\u001a\b\u0012\u0004\u0012\u00020V0!2\b\b\u0002\u0010W\u001a\u00020X2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010]\u001a\u00020^2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0!2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010c\u001a\u00020d2\b\b\u0002\u0010e\u001a\u00020f2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010R2\b\b\u0002\u0010i\u001a\u00020j2\b\b\u0002\u0010k\u001a\u00020l2\n\b\u0002\u0010m\u001a\u0004\u0018\u0001032\n\b\u0002\u0010n\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010p\u001a\u00020q2\n\b\u0002\u0010r\u001a\u0004\u0018\u0001032\b\b\u0002\u0010s\u001a\u00020tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010xR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010xR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0017\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0082\u0001R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0082\u0001R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001R\u0018\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0091\u0001R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0091\u0001R\u0018\u0010#\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010%\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0091\u0001R\u0019\u0010&\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010xR\u0019\u0010'\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010xR\u0018\u0010(\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010*\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010.\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u0091\u0001R\u0017\u0010/\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010|R\u0018\u00100\u001a\u0002018\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u00102\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¢\u0001R\u001a\u00105\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010\u0091\u0001R\u001a\u00106\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010\u0091\u0001R\u001a\u00107\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¦\u0001\u0010¢\u0001R\u0018\u00108\u001a\u0002098\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010:\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010¢\u0001R\u0018\u0010=\u001a\u0002098\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010¨\u0001R\u001a\u0010>\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010\u0091\u0001R\u0018\u0010?\u001a\u0002098\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010¨\u0001R\u001a\u0010@\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u0091\u0001R\u0018\u0010A\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010C\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b°\u0001\u0010±\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b²\u0001\u0010³\u0001R\u0018\u0010I\u001a\u00020J8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010K\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010O\u001a\u00020P8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010Q\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001R\u001a\u0010S\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010W\u001a\u00020X8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010Y\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010»\u0001R\u001a\u0010Z\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0001\u0010\u0082\u0001R\u001a\u0010[\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010\u0082\u0001R\u001a\u0010\\\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÃ\u0001\u0010\u0082\u0001R\u0018\u0010]\u001a\u00020^8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010_\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010xR\u001a\u0010a\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010\u0082\u0001R\u0019\u0010b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bÈ\u0001\u0010xR\u0018\u0010c\u001a\u00020d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010e\u001a\u00020f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bË\u0001\u0010Ì\u0001R\u001a\u0010g\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÍ\u0001\u0010\u0082\u0001R\u001a\u0010h\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÎ\u0001\u0010»\u0001R\u0018\u0010i\u001a\u00020j8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010k\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001a\u0010m\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÓ\u0001\u0010¢\u0001R\u001a\u0010n\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÔ\u0001\u0010³\u0001R\u001a\u0010o\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÕ\u0001\u0010\u0091\u0001R\u0018\u0010p\u001a\u00020q8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÖ\u0001\u0010×\u0001R\u001a\u0010r\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bØ\u0001\u0010¢\u0001R\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÛ\u0001\u0010Ú\u0001R\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÜ\u0001\u0010Ú\u0001R\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020H0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÝ\u0001\u0010Ú\u0001R\u001e\u0010M\u001a\b\u0012\u0004\u0012\u00020N0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÞ\u0001\u0010Ú\u0001R\u001e\u0010U\u001a\b\u0012\u0004\u0012\u00020V0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bß\u0001\u0010Ú\u0001R\u001e\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bà\u0001\u0010Ú\u0001¨\u0006é\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/Order;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "instrument_id", "parent_order_id", "account_number", "", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "side", "Lrosetta/mainst/Side;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/rosetta/mainst/Decimal;", "stop_price", "trailing_peg", "last_trail_price", "quantity", "cancelled_quantity", "peg_type", "Lrosetta/order/PegType;", "trigger", "Lrosetta/mainst/OrderTrigger;", "time_in_force", "Lrosetta/mainst/TimeInForce;", "state", "Lrosetta/mainst/OrderState;", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "received_at", "last_transaction_at", "executions", "", "Lcom/robinhood/rosetta/mainst/Execution;", "extended_hours", "", "stop_triggered_at", "user_currency", "asset_currency", "type", "Lrosetta/mainst/OrderType;", "update_count", "", "legs", "Lcom/robinhood/rosetta/mainst/OrderLeg;", "last_sent_at", "fix_conn_id", "market_state", "Lrosetta/mainst/MarketState;", "clearing_firm", "Lcom/robinhood/rosetta/mainst/NullableString;", "response_text", "to_cancel_at", "to_send_at", "venue_id", "created_agent", "Lrosetta/order/Agent;", "cl_ord_id", "send_logs", "Lcom/robinhood/rosetta/mainst/OrderSendLog;", "cancel_open_agent", "cancel_open_time", "cancel_close_agent", "cancel_close_time", "created_service", "Lrosetta/order/ClientService;", "created_affiliate", "Lcom/robinhood/rosetta/i18n/Affiliate;", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableInt;", "instruments", "Lcom/robinhood/rosetta/mainst/InstrumentInfo;", "response_category", "Lrosetta/order/ResponseCategory;", "metadata", "Lcom/robinhood/rosetta/mainst/OrderMetadata;", "handling_instructions", "Lrosetta/order/HandlingInstruction;", "market_hours", "Lrosetta/order/MarketHours;", "pro_trader", "Lcom/robinhood/rosetta/mainst/NullableBool;", "expire_date", "Lcom/robinhood/rosetta/common/Date;", "instruments_v2", "Lcom/robinhood/rosetta/mainst/InstrumentInfoV2;", "waiting_category", "Lrosetta/order/WaitingCategory;", "force_route", "notional", "max_quantity", "reserved_buying_power", "instrument_type", "Lrosetta/mainst/InstrumentType;", "replacement_order_id", "ChildMarkets", "quantity_to_replace", "list_root_id", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/order/AccountType;", "margin_mode", "Lrosetta/mainst/MarginMode;", "leverage", "reduce_only", "currency_denomination", "Lrosetta/order/CurrencyDenomination;", "position_effect", "Lrosetta/mainst/PositionEffect;", "position_id", "active_ttl_seconds", "to_expire_at", "capacity", "Lrosetta/mainst/Capacity;", "force_fix_line", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Ljava/lang/String;Lrosetta/mainst/Route;Lrosetta/mainst/Side;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/order/PegType;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/TimeInForce;Lrosetta/mainst/OrderState;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Ljava/util/List;ZLcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/OrderType;ILjava/util/List;Lcom/robinhood/rosetta/mainst/Time;Ljava/lang/String;Lrosetta/mainst/MarketState;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/NullableString;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/NullableString;Ljava/util/List;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/ClientService;Lcom/robinhood/rosetta/i18n/Affiliate;Lcom/robinhood/rosetta/mainst/NullableInt;Ljava/util/List;Lrosetta/order/ResponseCategory;Lcom/robinhood/rosetta/mainst/OrderMetadata;Ljava/util/List;Lrosetta/order/MarketHours;Lcom/robinhood/rosetta/mainst/NullableBool;Lcom/robinhood/rosetta/common/Date;Ljava/util/List;Lrosetta/order/WaitingCategory;Lcom/robinhood/rosetta/mainst/NullableBool;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/InstrumentType;Lcom/robinhood/rosetta/mainst/UUID;Ljava/util/List;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/order/AccountType;Lrosetta/mainst/MarginMode;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableBool;Lrosetta/order/CurrencyDenomination;Lrosetta/mainst/PositionEffect;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableInt;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/Capacity;Lcom/robinhood/rosetta/mainst/NullableString;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getInstrument_id", "getParent_order_id", "getAccount_number", "()Ljava/lang/String;", "getRoute", "()Lrosetta/mainst/Route;", "getSide", "()Lrosetta/mainst/Side;", "getPrice", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getStop_price", "getTrailing_peg", "getLast_trail_price", "getQuantity", "getCancelled_quantity", "getPeg_type", "()Lrosetta/order/PegType;", "getTrigger", "()Lrosetta/mainst/OrderTrigger;", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "getState", "()Lrosetta/mainst/OrderState;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getReceived_at", "getLast_transaction_at", "getExtended_hours", "()Z", "getStop_triggered_at", "getUser_currency", "getAsset_currency", "getType", "()Lrosetta/mainst/OrderType;", "getUpdate_count", "()I", "getLast_sent_at", "getFix_conn_id", "getMarket_state", "()Lrosetta/mainst/MarketState;", "getClearing_firm", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getResponse_text", "getTo_cancel_at", "getTo_send_at", "getVenue_id", "getCreated_agent", "()Lrosetta/order/Agent;", "getCl_ord_id", "getCancel_open_agent", "getCancel_open_time", "getCancel_close_agent", "getCancel_close_time", "getCreated_service", "()Lrosetta/order/ClientService;", "getCreated_affiliate", "()Lcom/robinhood/rosetta/i18n/Affiliate;", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableInt;", "getResponse_category", "()Lrosetta/order/ResponseCategory;", "getMetadata", "()Lcom/robinhood/rosetta/mainst/OrderMetadata;", "getMarket_hours", "()Lrosetta/order/MarketHours;", "getPro_trader", "()Lcom/robinhood/rosetta/mainst/NullableBool;", "getExpire_date", "()Lcom/robinhood/rosetta/common/Date;", "getWaiting_category", "()Lrosetta/order/WaitingCategory;", "getForce_route", "getNotional", "getMax_quantity", "getReserved_buying_power", "getInstrument_type", "()Lrosetta/mainst/InstrumentType;", "getReplacement_order_id", "getQuantity_to_replace", "getList_root_id", "getAccount_type", "()Lrosetta/order/AccountType;", "getMargin_mode", "()Lrosetta/mainst/MarginMode;", "getLeverage", "getReduce_only", "getCurrency_denomination", "()Lrosetta/order/CurrencyDenomination;", "getPosition_effect", "()Lrosetta/mainst/PositionEffect;", "getPosition_id", "getActive_ttl_seconds", "getTo_expire_at", "getCapacity", "()Lrosetta/mainst/Capacity;", "getForce_fix_line", "getExecutions", "()Ljava/util/List;", "getLegs", "getSend_logs", "getInstruments", "getHandling_instructions", "getInstruments_v2", "getChildMarkets", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Order extends Message {

    @JvmField
    public static final ProtoAdapter<Order> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 60, tag = 64)
    private final List<String> ChildMarkets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final String account_number;

    @WireField(adapter = "rosetta.order.AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 63, tag = 67)
    private final AccountType account_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableInt#ADAPTER", jsonName = "activeTtlSeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 70, tag = 74)
    private final NullableInt active_ttl_seconds;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "assetCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 19)
    private final UUID asset_currency;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelCloseAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 40, tag = 42)
    private final Agent cancel_close_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelCloseTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 43)
    private final Time cancel_close_time;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelOpenAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 40)
    private final Agent cancel_open_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelOpenTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 41)
    private final Time cancel_open_time;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "cancelledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 9)
    private final Decimal cancelled_quantity;

    @WireField(adapter = "rosetta.mainst.Capacity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, tag = 76)
    private final Capacity capacity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "clOrdId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 32)
    private final NullableString cl_ord_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "clearingFirm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 26)
    private final NullableString clearing_firm;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Affiliate#ADAPTER", jsonName = "createdAffiliate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 43, tag = 48)
    private final Affiliate created_affiliate;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "createdAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 31)
    private final Agent created_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 13)
    private final Time created_at;

    @WireField(adapter = "rosetta.order.ClientService#ADAPTER", jsonName = "createdService", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 46)
    private final ClientService created_service;

    @WireField(adapter = "rosetta.order.CurrencyDenomination#ADAPTER", jsonName = "currencyDenomination", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 67, tag = EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE)
    private final CurrencyDenomination currency_denomination;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Execution#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 16)
    private final List<Execution> executions;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "expireDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 51, tag = 55)
    private final Date expire_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "extendedHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 17)
    private final boolean extended_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fixConnId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 24)
    private final String fix_conn_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "forceFixLine", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 73, tag = 77)
    private final NullableString force_fix_line;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableBool#ADAPTER", jsonName = "forceRoute", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 54, tag = 58)
    private final NullableBool force_route;

    @WireField(adapter = "rosetta.order.HandlingInstruction#ADAPTER", jsonName = "handlingInstructions", label = WireField.Label.REPEATED, schemaIndex = 48, tag = 52)
    private final List<HandlingInstruction> handling_instructions;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID instrument_id;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 58, tag = 62)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.InstrumentInfo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 45, tag = 34)
    private final List<InstrumentInfo> instruments;

    @WireField(adapter = "com.robinhood.rosetta.mainst.InstrumentInfoV2#ADAPTER", jsonName = "instrumentsV2", label = WireField.Label.REPEATED, schemaIndex = 52, tag = 56)
    private final List<InstrumentInfoV2> instruments_v2;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "lastSentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 23)
    private final Time last_sent_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "lastTrailPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 36)
    private final Decimal last_trail_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "lastTransactionAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 15)
    private final Time last_transaction_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderLeg#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 26, tag = 22)
    private final List<OrderLeg> legs;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 65, tag = 69)
    private final Decimal leverage;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "listRootId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 62, tag = 66)
    private final UUID list_root_id;

    @WireField(adapter = "rosetta.mainst.MarginMode#ADAPTER", jsonName = "marginMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 64, tag = EnumC7081g.SDK_ASSET_ICON_HOME_VALUE)
    private final MarginMode margin_mode;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", jsonName = "marketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 49, tag = 53)
    private final MarketHours market_hours;

    @WireField(adapter = "rosetta.mainst.MarketState#ADAPTER", jsonName = "marketState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 25)
    private final MarketState market_state;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "maxQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 56, tag = 60)
    private final Decimal max_quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderMetadata#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 47, tag = 51)
    private final OrderMetadata metadata;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 55, tag = 59)
    private final Decimal notional;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "parentOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 45)
    private final UUID parent_order_id;

    @WireField(adapter = "rosetta.order.PegType#ADAPTER", jsonName = "pegType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 37)
    private final PegType peg_type;

    @WireField(adapter = "rosetta.mainst.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, tag = EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 69, tag = 73)
    private final NullableString position_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableBool#ADAPTER", jsonName = "proTrader", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 50, tag = 54)
    private final NullableBool pro_trader;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 8)
    private final Decimal quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "quantityToReplace", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 61, tag = 65)
    private final Decimal quantity_to_replace;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "receivedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 14)
    private final Time received_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableBool#ADAPTER", jsonName = "reduceOnly", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 66, tag = 70)
    private final NullableBool reduce_only;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "replacementOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 59, tag = 63)
    private final UUID replacement_order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "reservedBuyingPower", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 57, tag = 61)
    private final Decimal reserved_buying_power;

    @WireField(adapter = "rosetta.order.ResponseCategory#ADAPTER", jsonName = "responseCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 46, tag = 50)
    private final ResponseCategory response_category;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "responseText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 27)
    private final NullableString response_text;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderSendLog#ADAPTER", jsonName = "sendLogs", label = WireField.Label.REPEATED, schemaIndex = 37, tag = 33)
    private final List<OrderSendLog> send_logs;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableInt#ADAPTER", jsonName = "serviceShardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 44, tag = 49)
    private final NullableInt service_shard_id;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final Side side;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 12)
    private final OrderState state;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final Decimal stop_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "stopTriggeredAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 39)
    private final Time stop_triggered_at;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 11)
    private final TimeInForce time_in_force;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "toCancelAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 28)
    private final Time to_cancel_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "toExpireAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, tag = 75)
    private final Time to_expire_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "toSendAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 29)
    private final Time to_send_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "trailingPeg", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 35)
    private final Decimal trailing_peg;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 10)
    private final OrderTrigger trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 20)
    private final OrderType type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "updateCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 21)
    private final int update_count;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "userCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 18)
    private final UUID user_currency;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "venueId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 30)
    private final NullableString venue_id;

    @WireField(adapter = "rosetta.order.WaitingCategory#ADAPTER", jsonName = "waitingCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 53, tag = 57)
    private final WaitingCategory waiting_category;

    public Order() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 2047, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Order(UUID uuid, UUID uuid2, UUID uuid3, String str, Route route, Side side, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, PegType pegType, OrderTrigger orderTrigger, TimeInForce timeInForce, OrderState orderState, Time time, Time time2, Time time3, List list, boolean z, Time time4, UUID uuid4, UUID uuid5, OrderType orderType, int i, List list2, Time time5, String str2, MarketState marketState, NullableString nullableString, NullableString nullableString2, Time time6, Time time7, NullableString nullableString3, Agent agent, NullableString nullableString4, List list3, Agent agent2, Time time8, Agent agent3, Time time9, ClientService clientService, Affiliate affiliate, NullableInt nullableInt, List list4, ResponseCategory responseCategory, OrderMetadata orderMetadata, List list5, MarketHours marketHours, NullableBool nullableBool, Date date, List list6, WaitingCategory waitingCategory, NullableBool nullableBool2, Decimal decimal7, Decimal decimal8, Decimal decimal9, InstrumentType instrumentType, UUID uuid6, List list7, Decimal decimal10, UUID uuid7, AccountType accountType, MarginMode marginMode, Decimal decimal11, NullableBool nullableBool3, CurrencyDenomination currencyDenomination, PositionEffect positionEffect, NullableString nullableString5, NullableInt nullableInt2, Time time10, Capacity capacity, NullableString nullableString6, ByteString byteString, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        UUID uuid8 = (i2 & 1) != 0 ? null : uuid;
        UUID uuid9 = (i2 & 2) != 0 ? null : uuid2;
        UUID uuid10 = (i2 & 4) != 0 ? null : uuid3;
        String str3 = (i2 & 8) != 0 ? "" : str;
        Route route2 = (i2 & 16) != 0 ? Route.ROUTE_UNSPECIFIED : route;
        Side side2 = (i2 & 32) != 0 ? Side.SIDE_UNSPECIFIED : side;
        Decimal decimal12 = (i2 & 64) != 0 ? null : decimal;
        Decimal decimal13 = (i2 & 128) != 0 ? null : decimal2;
        Decimal decimal14 = (i2 & 256) != 0 ? null : decimal3;
        Decimal decimal15 = (i2 & 512) != 0 ? null : decimal4;
        Decimal decimal16 = (i2 & 1024) != 0 ? null : decimal5;
        Decimal decimal17 = (i2 & 2048) != 0 ? null : decimal6;
        UUID uuid11 = uuid8;
        PegType pegType2 = (i2 & 4096) != 0 ? PegType.PEG_TYPE_UNSPECIFIED : pegType;
        OrderTrigger orderTrigger2 = (i2 & 8192) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger;
        TimeInForce timeInForce2 = (i2 & 16384) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce;
        OrderState orderState2 = (i2 & 32768) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState;
        Time time11 = (i2 & 65536) != 0 ? null : time;
        Time time12 = (i2 & 131072) != 0 ? null : time2;
        Time time13 = (i2 & 262144) != 0 ? null : time3;
        List listEmptyList = (i2 & 524288) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i2 & 1048576) != 0 ? false : z;
        Time time14 = (i2 & 2097152) != 0 ? null : time4;
        UUID uuid12 = (i2 & 4194304) != 0 ? null : uuid4;
        UUID uuid13 = (i2 & 8388608) != 0 ? null : uuid5;
        OrderType orderType2 = (i2 & 16777216) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType;
        int i5 = (i2 & 33554432) != 0 ? 0 : i;
        List listEmptyList2 = (i2 & 67108864) != 0 ? CollectionsKt.emptyList() : list2;
        Time time15 = (i2 & 134217728) != 0 ? null : time5;
        String str4 = (i2 & 268435456) == 0 ? str2 : "";
        MarketState marketState2 = (i2 & 536870912) != 0 ? MarketState.MARKET_STATE_UNSPECIFIED : marketState;
        NullableString nullableString7 = (i2 & 1073741824) != 0 ? null : nullableString;
        NullableString nullableString8 = (i2 & Integer.MIN_VALUE) != 0 ? null : nullableString2;
        this(uuid11, uuid9, uuid10, str3, route2, side2, decimal12, decimal13, decimal14, decimal15, decimal16, decimal17, pegType2, orderTrigger2, timeInForce2, orderState2, time11, time12, time13, listEmptyList, z2, time14, uuid12, uuid13, orderType2, i5, listEmptyList2, time15, str4, marketState2, nullableString7, nullableString8, (i3 & 1) != 0 ? null : time6, (i3 & 2) != 0 ? null : time7, (i3 & 4) != 0 ? null : nullableString3, (i3 & 8) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i3 & 16) != 0 ? null : nullableString4, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 64) != 0 ? Agent.AGENT_UNSPECIFIED : agent2, (i3 & 128) != 0 ? null : time8, (i3 & 256) != 0 ? Agent.AGENT_UNSPECIFIED : agent3, (i3 & 512) != 0 ? null : time9, (i3 & 1024) != 0 ? ClientService.CLIENT_SERVICE_UNSPECIFIED : clientService, (i3 & 2048) != 0 ? Affiliate.AFFILIATE_UNSPECIFIED : affiliate, (i3 & 4096) != 0 ? null : nullableInt, (i3 & 8192) != 0 ? CollectionsKt.emptyList() : list4, (i3 & 16384) != 0 ? ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED : responseCategory, (i3 & 32768) != 0 ? null : orderMetadata, (i3 & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i3 & 131072) != 0 ? MarketHours.MARKET_HOURS_UNSPECIFIED : marketHours, (i3 & 262144) != 0 ? null : nullableBool, (i3 & 524288) != 0 ? null : date, (i3 & 1048576) != 0 ? CollectionsKt.emptyList() : list6, (i3 & 2097152) != 0 ? WaitingCategory.WAITING_CATEGORY_UNSPECIFIED : waitingCategory, (i3 & 4194304) != 0 ? null : nullableBool2, (i3 & 8388608) != 0 ? null : decimal7, (i3 & 16777216) != 0 ? null : decimal8, (i3 & 33554432) != 0 ? null : decimal9, (i3 & 67108864) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i3 & 134217728) != 0 ? null : uuid6, (i3 & 268435456) != 0 ? CollectionsKt.emptyList() : list7, (i3 & 536870912) != 0 ? null : decimal10, (i3 & 1073741824) != 0 ? null : uuid7, (i3 & Integer.MIN_VALUE) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i4 & 1) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i4 & 2) != 0 ? null : decimal11, (i4 & 4) != 0 ? null : nullableBool3, (i4 & 8) != 0 ? CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED : currencyDenomination, (i4 & 16) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i4 & 32) != 0 ? null : nullableString5, (i4 & 64) != 0 ? null : nullableInt2, (i4 & 128) != 0 ? null : time10, (i4 & 256) != 0 ? Capacity.CAPACITY_UNSPECIFIED : capacity, (i4 & 512) != 0 ? null : nullableString6, (i4 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24682newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final UUID getParent_order_id() {
        return this.parent_order_id;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final Side getSide() {
        return this.side;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Decimal getStop_price() {
        return this.stop_price;
    }

    public final Decimal getTrailing_peg() {
        return this.trailing_peg;
    }

    public final Decimal getLast_trail_price() {
        return this.last_trail_price;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final Decimal getCancelled_quantity() {
        return this.cancelled_quantity;
    }

    public final PegType getPeg_type() {
        return this.peg_type;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final OrderState getState() {
        return this.state;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getReceived_at() {
        return this.received_at;
    }

    public final Time getLast_transaction_at() {
        return this.last_transaction_at;
    }

    public final boolean getExtended_hours() {
        return this.extended_hours;
    }

    public final Time getStop_triggered_at() {
        return this.stop_triggered_at;
    }

    public final UUID getUser_currency() {
        return this.user_currency;
    }

    public final UUID getAsset_currency() {
        return this.asset_currency;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final int getUpdate_count() {
        return this.update_count;
    }

    public final Time getLast_sent_at() {
        return this.last_sent_at;
    }

    public final String getFix_conn_id() {
        return this.fix_conn_id;
    }

    public final MarketState getMarket_state() {
        return this.market_state;
    }

    public final NullableString getClearing_firm() {
        return this.clearing_firm;
    }

    public final NullableString getResponse_text() {
        return this.response_text;
    }

    public final Time getTo_cancel_at() {
        return this.to_cancel_at;
    }

    public final Time getTo_send_at() {
        return this.to_send_at;
    }

    public final NullableString getVenue_id() {
        return this.venue_id;
    }

    public final Agent getCreated_agent() {
        return this.created_agent;
    }

    public final NullableString getCl_ord_id() {
        return this.cl_ord_id;
    }

    public final Agent getCancel_open_agent() {
        return this.cancel_open_agent;
    }

    public final Time getCancel_open_time() {
        return this.cancel_open_time;
    }

    public final Agent getCancel_close_agent() {
        return this.cancel_close_agent;
    }

    public final Time getCancel_close_time() {
        return this.cancel_close_time;
    }

    public final ClientService getCreated_service() {
        return this.created_service;
    }

    public final Affiliate getCreated_affiliate() {
        return this.created_affiliate;
    }

    public final NullableInt getService_shard_id() {
        return this.service_shard_id;
    }

    public final ResponseCategory getResponse_category() {
        return this.response_category;
    }

    public final OrderMetadata getMetadata() {
        return this.metadata;
    }

    public final MarketHours getMarket_hours() {
        return this.market_hours;
    }

    public final NullableBool getPro_trader() {
        return this.pro_trader;
    }

    public final Date getExpire_date() {
        return this.expire_date;
    }

    public final WaitingCategory getWaiting_category() {
        return this.waiting_category;
    }

    public final NullableBool getForce_route() {
        return this.force_route;
    }

    public final Decimal getNotional() {
        return this.notional;
    }

    public final Decimal getMax_quantity() {
        return this.max_quantity;
    }

    public final Decimal getReserved_buying_power() {
        return this.reserved_buying_power;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final UUID getReplacement_order_id() {
        return this.replacement_order_id;
    }

    public final Decimal getQuantity_to_replace() {
        return this.quantity_to_replace;
    }

    public final UUID getList_root_id() {
        return this.list_root_id;
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    public final MarginMode getMargin_mode() {
        return this.margin_mode;
    }

    public final Decimal getLeverage() {
        return this.leverage;
    }

    public final NullableBool getReduce_only() {
        return this.reduce_only;
    }

    public final CurrencyDenomination getCurrency_denomination() {
        return this.currency_denomination;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final NullableString getPosition_id() {
        return this.position_id;
    }

    public final NullableInt getActive_ttl_seconds() {
        return this.active_ttl_seconds;
    }

    public final Time getTo_expire_at() {
        return this.to_expire_at;
    }

    public final Capacity getCapacity() {
        return this.capacity;
    }

    public final NullableString getForce_fix_line() {
        return this.force_fix_line;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Order(UUID uuid, UUID uuid2, UUID uuid3, String account_number, Route route, Side side, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, PegType peg_type, OrderTrigger trigger, TimeInForce time_in_force, OrderState state, Time time, Time time2, Time time3, List<Execution> executions, boolean z, Time time4, UUID uuid4, UUID uuid5, OrderType type2, int i, List<OrderLeg> legs, Time time5, String fix_conn_id, MarketState market_state, NullableString nullableString, NullableString nullableString2, Time time6, Time time7, NullableString nullableString3, Agent created_agent, NullableString nullableString4, List<OrderSendLog> send_logs, Agent cancel_open_agent, Time time8, Agent cancel_close_agent, Time time9, ClientService created_service, Affiliate created_affiliate, NullableInt nullableInt, List<InstrumentInfo> instruments, ResponseCategory response_category, OrderMetadata orderMetadata, List<? extends HandlingInstruction> handling_instructions, MarketHours market_hours, NullableBool nullableBool, Date date, List<InstrumentInfoV2> instruments_v2, WaitingCategory waiting_category, NullableBool nullableBool2, Decimal decimal7, Decimal decimal8, Decimal decimal9, InstrumentType instrument_type, UUID uuid6, List<String> ChildMarkets, Decimal decimal10, UUID uuid7, AccountType account_type, MarginMode margin_mode, Decimal decimal11, NullableBool nullableBool3, CurrencyDenomination currency_denomination, PositionEffect position_effect, NullableString nullableString5, NullableInt nullableInt2, Time time10, Capacity capacity, NullableString nullableString6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.instrument_id = uuid2;
        this.parent_order_id = uuid3;
        this.account_number = account_number;
        this.route = route;
        this.side = side;
        this.price = decimal;
        this.stop_price = decimal2;
        this.trailing_peg = decimal3;
        this.last_trail_price = decimal4;
        this.quantity = decimal5;
        this.cancelled_quantity = decimal6;
        this.peg_type = peg_type;
        this.trigger = trigger;
        this.time_in_force = time_in_force;
        this.state = state;
        this.created_at = time;
        this.received_at = time2;
        this.last_transaction_at = time3;
        this.extended_hours = z;
        this.stop_triggered_at = time4;
        this.user_currency = uuid4;
        this.asset_currency = uuid5;
        this.type = type2;
        this.update_count = i;
        this.last_sent_at = time5;
        this.fix_conn_id = fix_conn_id;
        this.market_state = market_state;
        this.clearing_firm = nullableString;
        this.response_text = nullableString2;
        this.to_cancel_at = time6;
        this.to_send_at = time7;
        this.venue_id = nullableString3;
        this.created_agent = created_agent;
        this.cl_ord_id = nullableString4;
        this.cancel_open_agent = cancel_open_agent;
        this.cancel_open_time = time8;
        this.cancel_close_agent = cancel_close_agent;
        this.cancel_close_time = time9;
        this.created_service = created_service;
        this.created_affiliate = created_affiliate;
        this.service_shard_id = nullableInt;
        this.response_category = response_category;
        this.metadata = orderMetadata;
        this.market_hours = market_hours;
        this.pro_trader = nullableBool;
        this.expire_date = date;
        this.waiting_category = waiting_category;
        this.force_route = nullableBool2;
        this.notional = decimal7;
        this.max_quantity = decimal8;
        this.reserved_buying_power = decimal9;
        this.instrument_type = instrument_type;
        this.replacement_order_id = uuid6;
        this.quantity_to_replace = decimal10;
        this.list_root_id = uuid7;
        this.account_type = account_type;
        this.margin_mode = margin_mode;
        this.leverage = decimal11;
        this.reduce_only = nullableBool3;
        this.currency_denomination = currency_denomination;
        this.position_effect = position_effect;
        this.position_id = nullableString5;
        this.active_ttl_seconds = nullableInt2;
        this.to_expire_at = time10;
        this.capacity = capacity;
        this.force_fix_line = nullableString6;
        this.executions = Internal.immutableCopyOf("executions", executions);
        this.legs = Internal.immutableCopyOf("legs", legs);
        this.send_logs = Internal.immutableCopyOf("send_logs", send_logs);
        this.instruments = Internal.immutableCopyOf("instruments", instruments);
        this.handling_instructions = Internal.immutableCopyOf("handling_instructions", handling_instructions);
        this.instruments_v2 = Internal.immutableCopyOf("instruments_v2", instruments_v2);
        this.ChildMarkets = Internal.immutableCopyOf("ChildMarkets", ChildMarkets);
    }

    public final List<Execution> getExecutions() {
        return this.executions;
    }

    public final List<OrderLeg> getLegs() {
        return this.legs;
    }

    public final List<OrderSendLog> getSend_logs() {
        return this.send_logs;
    }

    public final List<InstrumentInfo> getInstruments() {
        return this.instruments;
    }

    public final List<HandlingInstruction> getHandling_instructions() {
        return this.handling_instructions;
    }

    public final List<InstrumentInfoV2> getInstruments_v2() {
        return this.instruments_v2;
    }

    public final List<String> getChildMarkets() {
        return this.ChildMarkets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24682newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Order)) {
            return false;
        }
        Order order = (Order) other;
        return Intrinsics.areEqual(unknownFields(), order.unknownFields()) && Intrinsics.areEqual(this.id, order.id) && Intrinsics.areEqual(this.instrument_id, order.instrument_id) && Intrinsics.areEqual(this.parent_order_id, order.parent_order_id) && Intrinsics.areEqual(this.account_number, order.account_number) && this.route == order.route && this.side == order.side && Intrinsics.areEqual(this.price, order.price) && Intrinsics.areEqual(this.stop_price, order.stop_price) && Intrinsics.areEqual(this.trailing_peg, order.trailing_peg) && Intrinsics.areEqual(this.last_trail_price, order.last_trail_price) && Intrinsics.areEqual(this.quantity, order.quantity) && Intrinsics.areEqual(this.cancelled_quantity, order.cancelled_quantity) && this.peg_type == order.peg_type && this.trigger == order.trigger && this.time_in_force == order.time_in_force && this.state == order.state && Intrinsics.areEqual(this.created_at, order.created_at) && Intrinsics.areEqual(this.received_at, order.received_at) && Intrinsics.areEqual(this.last_transaction_at, order.last_transaction_at) && Intrinsics.areEqual(this.executions, order.executions) && this.extended_hours == order.extended_hours && Intrinsics.areEqual(this.stop_triggered_at, order.stop_triggered_at) && Intrinsics.areEqual(this.user_currency, order.user_currency) && Intrinsics.areEqual(this.asset_currency, order.asset_currency) && this.type == order.type && this.update_count == order.update_count && Intrinsics.areEqual(this.legs, order.legs) && Intrinsics.areEqual(this.last_sent_at, order.last_sent_at) && Intrinsics.areEqual(this.fix_conn_id, order.fix_conn_id) && this.market_state == order.market_state && Intrinsics.areEqual(this.clearing_firm, order.clearing_firm) && Intrinsics.areEqual(this.response_text, order.response_text) && Intrinsics.areEqual(this.to_cancel_at, order.to_cancel_at) && Intrinsics.areEqual(this.to_send_at, order.to_send_at) && Intrinsics.areEqual(this.venue_id, order.venue_id) && this.created_agent == order.created_agent && Intrinsics.areEqual(this.cl_ord_id, order.cl_ord_id) && Intrinsics.areEqual(this.send_logs, order.send_logs) && this.cancel_open_agent == order.cancel_open_agent && Intrinsics.areEqual(this.cancel_open_time, order.cancel_open_time) && this.cancel_close_agent == order.cancel_close_agent && Intrinsics.areEqual(this.cancel_close_time, order.cancel_close_time) && this.created_service == order.created_service && this.created_affiliate == order.created_affiliate && Intrinsics.areEqual(this.service_shard_id, order.service_shard_id) && Intrinsics.areEqual(this.instruments, order.instruments) && this.response_category == order.response_category && Intrinsics.areEqual(this.metadata, order.metadata) && Intrinsics.areEqual(this.handling_instructions, order.handling_instructions) && this.market_hours == order.market_hours && Intrinsics.areEqual(this.pro_trader, order.pro_trader) && Intrinsics.areEqual(this.expire_date, order.expire_date) && Intrinsics.areEqual(this.instruments_v2, order.instruments_v2) && this.waiting_category == order.waiting_category && Intrinsics.areEqual(this.force_route, order.force_route) && Intrinsics.areEqual(this.notional, order.notional) && Intrinsics.areEqual(this.max_quantity, order.max_quantity) && Intrinsics.areEqual(this.reserved_buying_power, order.reserved_buying_power) && this.instrument_type == order.instrument_type && Intrinsics.areEqual(this.replacement_order_id, order.replacement_order_id) && Intrinsics.areEqual(this.ChildMarkets, order.ChildMarkets) && Intrinsics.areEqual(this.quantity_to_replace, order.quantity_to_replace) && Intrinsics.areEqual(this.list_root_id, order.list_root_id) && this.account_type == order.account_type && this.margin_mode == order.margin_mode && Intrinsics.areEqual(this.leverage, order.leverage) && Intrinsics.areEqual(this.reduce_only, order.reduce_only) && this.currency_denomination == order.currency_denomination && this.position_effect == order.position_effect && Intrinsics.areEqual(this.position_id, order.position_id) && Intrinsics.areEqual(this.active_ttl_seconds, order.active_ttl_seconds) && Intrinsics.areEqual(this.to_expire_at, order.to_expire_at) && this.capacity == order.capacity && Intrinsics.areEqual(this.force_fix_line, order.force_fix_line);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.instrument_id;
        int iHashCode3 = (iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37;
        UUID uuid3 = this.parent_order_id;
        int iHashCode4 = (((((((iHashCode3 + (uuid3 != null ? uuid3.hashCode() : 0)) * 37) + this.account_number.hashCode()) * 37) + this.route.hashCode()) * 37) + this.side.hashCode()) * 37;
        Decimal decimal = this.price;
        int iHashCode5 = (iHashCode4 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.stop_price;
        int iHashCode6 = (iHashCode5 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.trailing_peg;
        int iHashCode7 = (iHashCode6 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.last_trail_price;
        int iHashCode8 = (iHashCode7 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37;
        Decimal decimal5 = this.quantity;
        int iHashCode9 = (iHashCode8 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.cancelled_quantity;
        int iHashCode10 = (((((((((iHashCode9 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37) + this.peg_type.hashCode()) * 37) + this.trigger.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + this.state.hashCode()) * 37;
        Time time = this.created_at;
        int iHashCode11 = (iHashCode10 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.received_at;
        int iHashCode12 = (iHashCode11 + (time2 != null ? time2.hashCode() : 0)) * 37;
        Time time3 = this.last_transaction_at;
        int iHashCode13 = (((((iHashCode12 + (time3 != null ? time3.hashCode() : 0)) * 37) + this.executions.hashCode()) * 37) + Boolean.hashCode(this.extended_hours)) * 37;
        Time time4 = this.stop_triggered_at;
        int iHashCode14 = (iHashCode13 + (time4 != null ? time4.hashCode() : 0)) * 37;
        UUID uuid4 = this.user_currency;
        int iHashCode15 = (iHashCode14 + (uuid4 != null ? uuid4.hashCode() : 0)) * 37;
        UUID uuid5 = this.asset_currency;
        int iHashCode16 = (((((((iHashCode15 + (uuid5 != null ? uuid5.hashCode() : 0)) * 37) + this.type.hashCode()) * 37) + Integer.hashCode(this.update_count)) * 37) + this.legs.hashCode()) * 37;
        Time time5 = this.last_sent_at;
        int iHashCode17 = (((((iHashCode16 + (time5 != null ? time5.hashCode() : 0)) * 37) + this.fix_conn_id.hashCode()) * 37) + this.market_state.hashCode()) * 37;
        NullableString nullableString = this.clearing_firm;
        int iHashCode18 = (iHashCode17 + (nullableString != null ? nullableString.hashCode() : 0)) * 37;
        NullableString nullableString2 = this.response_text;
        int iHashCode19 = (iHashCode18 + (nullableString2 != null ? nullableString2.hashCode() : 0)) * 37;
        Time time6 = this.to_cancel_at;
        int iHashCode20 = (iHashCode19 + (time6 != null ? time6.hashCode() : 0)) * 37;
        Time time7 = this.to_send_at;
        int iHashCode21 = (iHashCode20 + (time7 != null ? time7.hashCode() : 0)) * 37;
        NullableString nullableString3 = this.venue_id;
        int iHashCode22 = (((iHashCode21 + (nullableString3 != null ? nullableString3.hashCode() : 0)) * 37) + this.created_agent.hashCode()) * 37;
        NullableString nullableString4 = this.cl_ord_id;
        int iHashCode23 = (((((iHashCode22 + (nullableString4 != null ? nullableString4.hashCode() : 0)) * 37) + this.send_logs.hashCode()) * 37) + this.cancel_open_agent.hashCode()) * 37;
        Time time8 = this.cancel_open_time;
        int iHashCode24 = (((iHashCode23 + (time8 != null ? time8.hashCode() : 0)) * 37) + this.cancel_close_agent.hashCode()) * 37;
        Time time9 = this.cancel_close_time;
        int iHashCode25 = (((((iHashCode24 + (time9 != null ? time9.hashCode() : 0)) * 37) + this.created_service.hashCode()) * 37) + this.created_affiliate.hashCode()) * 37;
        NullableInt nullableInt = this.service_shard_id;
        int iHashCode26 = (((((iHashCode25 + (nullableInt != null ? nullableInt.hashCode() : 0)) * 37) + this.instruments.hashCode()) * 37) + this.response_category.hashCode()) * 37;
        OrderMetadata orderMetadata = this.metadata;
        int iHashCode27 = (((((iHashCode26 + (orderMetadata != null ? orderMetadata.hashCode() : 0)) * 37) + this.handling_instructions.hashCode()) * 37) + this.market_hours.hashCode()) * 37;
        NullableBool nullableBool = this.pro_trader;
        int iHashCode28 = (iHashCode27 + (nullableBool != null ? nullableBool.hashCode() : 0)) * 37;
        Date date = this.expire_date;
        int iHashCode29 = (((((iHashCode28 + (date != null ? date.hashCode() : 0)) * 37) + this.instruments_v2.hashCode()) * 37) + this.waiting_category.hashCode()) * 37;
        NullableBool nullableBool2 = this.force_route;
        int iHashCode30 = (iHashCode29 + (nullableBool2 != null ? nullableBool2.hashCode() : 0)) * 37;
        Decimal decimal7 = this.notional;
        int iHashCode31 = (iHashCode30 + (decimal7 != null ? decimal7.hashCode() : 0)) * 37;
        Decimal decimal8 = this.max_quantity;
        int iHashCode32 = (iHashCode31 + (decimal8 != null ? decimal8.hashCode() : 0)) * 37;
        Decimal decimal9 = this.reserved_buying_power;
        int iHashCode33 = (((iHashCode32 + (decimal9 != null ? decimal9.hashCode() : 0)) * 37) + this.instrument_type.hashCode()) * 37;
        UUID uuid6 = this.replacement_order_id;
        int iHashCode34 = (((iHashCode33 + (uuid6 != null ? uuid6.hashCode() : 0)) * 37) + this.ChildMarkets.hashCode()) * 37;
        Decimal decimal10 = this.quantity_to_replace;
        int iHashCode35 = (iHashCode34 + (decimal10 != null ? decimal10.hashCode() : 0)) * 37;
        UUID uuid7 = this.list_root_id;
        int iHashCode36 = (((((iHashCode35 + (uuid7 != null ? uuid7.hashCode() : 0)) * 37) + this.account_type.hashCode()) * 37) + this.margin_mode.hashCode()) * 37;
        Decimal decimal11 = this.leverage;
        int iHashCode37 = (iHashCode36 + (decimal11 != null ? decimal11.hashCode() : 0)) * 37;
        NullableBool nullableBool3 = this.reduce_only;
        int iHashCode38 = (((((iHashCode37 + (nullableBool3 != null ? nullableBool3.hashCode() : 0)) * 37) + this.currency_denomination.hashCode()) * 37) + this.position_effect.hashCode()) * 37;
        NullableString nullableString5 = this.position_id;
        int iHashCode39 = (iHashCode38 + (nullableString5 != null ? nullableString5.hashCode() : 0)) * 37;
        NullableInt nullableInt2 = this.active_ttl_seconds;
        int iHashCode40 = (iHashCode39 + (nullableInt2 != null ? nullableInt2.hashCode() : 0)) * 37;
        Time time10 = this.to_expire_at;
        int iHashCode41 = (((iHashCode40 + (time10 != null ? time10.hashCode() : 0)) * 37) + this.capacity.hashCode()) * 37;
        NullableString nullableString6 = this.force_fix_line;
        int iHashCode42 = iHashCode41 + (nullableString6 != null ? nullableString6.hashCode() : 0);
        this.hashCode = iHashCode42;
        return iHashCode42;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        UUID uuid2 = this.instrument_id;
        if (uuid2 != null) {
            arrayList.add("instrument_id=" + uuid2);
        }
        UUID uuid3 = this.parent_order_id;
        if (uuid3 != null) {
            arrayList.add("parent_order_id=" + uuid3);
        }
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("route=" + this.route);
        arrayList.add("side=" + this.side);
        Decimal decimal = this.price;
        if (decimal != null) {
            arrayList.add("price=" + decimal);
        }
        Decimal decimal2 = this.stop_price;
        if (decimal2 != null) {
            arrayList.add("stop_price=" + decimal2);
        }
        Decimal decimal3 = this.trailing_peg;
        if (decimal3 != null) {
            arrayList.add("trailing_peg=" + decimal3);
        }
        Decimal decimal4 = this.last_trail_price;
        if (decimal4 != null) {
            arrayList.add("last_trail_price=" + decimal4);
        }
        Decimal decimal5 = this.quantity;
        if (decimal5 != null) {
            arrayList.add("quantity=" + decimal5);
        }
        Decimal decimal6 = this.cancelled_quantity;
        if (decimal6 != null) {
            arrayList.add("cancelled_quantity=" + decimal6);
        }
        arrayList.add("peg_type=" + this.peg_type);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("state=" + this.state);
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.received_at;
        if (time2 != null) {
            arrayList.add("received_at=" + time2);
        }
        Time time3 = this.last_transaction_at;
        if (time3 != null) {
            arrayList.add("last_transaction_at=" + time3);
        }
        if (!this.executions.isEmpty()) {
            arrayList.add("executions=" + this.executions);
        }
        arrayList.add("extended_hours=" + this.extended_hours);
        Time time4 = this.stop_triggered_at;
        if (time4 != null) {
            arrayList.add("stop_triggered_at=" + time4);
        }
        UUID uuid4 = this.user_currency;
        if (uuid4 != null) {
            arrayList.add("user_currency=" + uuid4);
        }
        UUID uuid5 = this.asset_currency;
        if (uuid5 != null) {
            arrayList.add("asset_currency=" + uuid5);
        }
        arrayList.add("type=" + this.type);
        arrayList.add("update_count=" + this.update_count);
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        Time time5 = this.last_sent_at;
        if (time5 != null) {
            arrayList.add("last_sent_at=" + time5);
        }
        arrayList.add("fix_conn_id=" + Internal.sanitize(this.fix_conn_id));
        arrayList.add("market_state=" + this.market_state);
        NullableString nullableString = this.clearing_firm;
        if (nullableString != null) {
            arrayList.add("clearing_firm=" + nullableString);
        }
        NullableString nullableString2 = this.response_text;
        if (nullableString2 != null) {
            arrayList.add("response_text=" + nullableString2);
        }
        Time time6 = this.to_cancel_at;
        if (time6 != null) {
            arrayList.add("to_cancel_at=" + time6);
        }
        Time time7 = this.to_send_at;
        if (time7 != null) {
            arrayList.add("to_send_at=" + time7);
        }
        NullableString nullableString3 = this.venue_id;
        if (nullableString3 != null) {
            arrayList.add("venue_id=" + nullableString3);
        }
        arrayList.add("created_agent=" + this.created_agent);
        NullableString nullableString4 = this.cl_ord_id;
        if (nullableString4 != null) {
            arrayList.add("cl_ord_id=" + nullableString4);
        }
        if (!this.send_logs.isEmpty()) {
            arrayList.add("send_logs=" + this.send_logs);
        }
        arrayList.add("cancel_open_agent=" + this.cancel_open_agent);
        Time time8 = this.cancel_open_time;
        if (time8 != null) {
            arrayList.add("cancel_open_time=" + time8);
        }
        arrayList.add("cancel_close_agent=" + this.cancel_close_agent);
        Time time9 = this.cancel_close_time;
        if (time9 != null) {
            arrayList.add("cancel_close_time=" + time9);
        }
        arrayList.add("created_service=" + this.created_service);
        arrayList.add("created_affiliate=" + this.created_affiliate);
        NullableInt nullableInt = this.service_shard_id;
        if (nullableInt != null) {
            arrayList.add("service_shard_id=" + nullableInt);
        }
        if (!this.instruments.isEmpty()) {
            arrayList.add("instruments=" + this.instruments);
        }
        arrayList.add("response_category=" + this.response_category);
        OrderMetadata orderMetadata = this.metadata;
        if (orderMetadata != null) {
            arrayList.add("metadata=" + orderMetadata);
        }
        if (!this.handling_instructions.isEmpty()) {
            arrayList.add("handling_instructions=" + this.handling_instructions);
        }
        arrayList.add("market_hours=" + this.market_hours);
        NullableBool nullableBool = this.pro_trader;
        if (nullableBool != null) {
            arrayList.add("pro_trader=" + nullableBool);
        }
        Date date = this.expire_date;
        if (date != null) {
            arrayList.add("expire_date=" + date);
        }
        if (!this.instruments_v2.isEmpty()) {
            arrayList.add("instruments_v2=" + this.instruments_v2);
        }
        arrayList.add("waiting_category=" + this.waiting_category);
        NullableBool nullableBool2 = this.force_route;
        if (nullableBool2 != null) {
            arrayList.add("force_route=" + nullableBool2);
        }
        Decimal decimal7 = this.notional;
        if (decimal7 != null) {
            arrayList.add("notional=" + decimal7);
        }
        Decimal decimal8 = this.max_quantity;
        if (decimal8 != null) {
            arrayList.add("max_quantity=" + decimal8);
        }
        Decimal decimal9 = this.reserved_buying_power;
        if (decimal9 != null) {
            arrayList.add("reserved_buying_power=" + decimal9);
        }
        arrayList.add("instrument_type=" + this.instrument_type);
        UUID uuid6 = this.replacement_order_id;
        if (uuid6 != null) {
            arrayList.add("replacement_order_id=" + uuid6);
        }
        if (!this.ChildMarkets.isEmpty()) {
            arrayList.add("ChildMarkets=" + Internal.sanitize(this.ChildMarkets));
        }
        Decimal decimal10 = this.quantity_to_replace;
        if (decimal10 != null) {
            arrayList.add("quantity_to_replace=" + decimal10);
        }
        UUID uuid7 = this.list_root_id;
        if (uuid7 != null) {
            arrayList.add("list_root_id=" + uuid7);
        }
        arrayList.add("account_type=" + this.account_type);
        arrayList.add("margin_mode=" + this.margin_mode);
        Decimal decimal11 = this.leverage;
        if (decimal11 != null) {
            arrayList.add("leverage=" + decimal11);
        }
        NullableBool nullableBool3 = this.reduce_only;
        if (nullableBool3 != null) {
            arrayList.add("reduce_only=" + nullableBool3);
        }
        arrayList.add("currency_denomination=" + this.currency_denomination);
        arrayList.add("position_effect=" + this.position_effect);
        NullableString nullableString5 = this.position_id;
        if (nullableString5 != null) {
            arrayList.add("position_id=" + nullableString5);
        }
        NullableInt nullableInt2 = this.active_ttl_seconds;
        if (nullableInt2 != null) {
            arrayList.add("active_ttl_seconds=" + nullableInt2);
        }
        Time time10 = this.to_expire_at;
        if (time10 != null) {
            arrayList.add("to_expire_at=" + time10);
        }
        arrayList.add("capacity=" + this.capacity);
        NullableString nullableString6 = this.force_fix_line;
        if (nullableString6 != null) {
            arrayList.add("force_fix_line=" + nullableString6);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Order{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Order copy$default(Order order, UUID uuid, UUID uuid2, UUID uuid3, String str, Route route, Side side, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, PegType pegType, OrderTrigger orderTrigger, TimeInForce timeInForce, OrderState orderState, Time time, Time time2, Time time3, List list, boolean z, Time time4, UUID uuid4, UUID uuid5, OrderType orderType, int i, List list2, Time time5, String str2, MarketState marketState, NullableString nullableString, NullableString nullableString2, Time time6, Time time7, NullableString nullableString3, Agent agent, NullableString nullableString4, List list3, Agent agent2, Time time8, Agent agent3, Time time9, ClientService clientService, Affiliate affiliate, NullableInt nullableInt, List list4, ResponseCategory responseCategory, OrderMetadata orderMetadata, List list5, MarketHours marketHours, NullableBool nullableBool, Date date, List list6, WaitingCategory waitingCategory, NullableBool nullableBool2, Decimal decimal7, Decimal decimal8, Decimal decimal9, InstrumentType instrumentType, UUID uuid6, List list7, Decimal decimal10, UUID uuid7, AccountType accountType, MarginMode marginMode, Decimal decimal11, NullableBool nullableBool3, CurrencyDenomination currencyDenomination, PositionEffect positionEffect, NullableString nullableString5, NullableInt nullableInt2, Time time10, Capacity capacity, NullableString nullableString6, ByteString byteString, int i2, int i3, int i4, Object obj) {
        UUID uuid8 = (i2 & 1) != 0 ? order.id : uuid;
        return order.copy(uuid8, (i2 & 2) != 0 ? order.instrument_id : uuid2, (i2 & 4) != 0 ? order.parent_order_id : uuid3, (i2 & 8) != 0 ? order.account_number : str, (i2 & 16) != 0 ? order.route : route, (i2 & 32) != 0 ? order.side : side, (i2 & 64) != 0 ? order.price : decimal, (i2 & 128) != 0 ? order.stop_price : decimal2, (i2 & 256) != 0 ? order.trailing_peg : decimal3, (i2 & 512) != 0 ? order.last_trail_price : decimal4, (i2 & 1024) != 0 ? order.quantity : decimal5, (i2 & 2048) != 0 ? order.cancelled_quantity : decimal6, (i2 & 4096) != 0 ? order.peg_type : pegType, (i2 & 8192) != 0 ? order.trigger : orderTrigger, (i2 & 16384) != 0 ? order.time_in_force : timeInForce, (i2 & 32768) != 0 ? order.state : orderState, (i2 & 65536) != 0 ? order.created_at : time, (i2 & 131072) != 0 ? order.received_at : time2, (i2 & 262144) != 0 ? order.last_transaction_at : time3, (i2 & 524288) != 0 ? order.executions : list, (i2 & 1048576) != 0 ? order.extended_hours : z, (i2 & 2097152) != 0 ? order.stop_triggered_at : time4, (i2 & 4194304) != 0 ? order.user_currency : uuid4, (i2 & 8388608) != 0 ? order.asset_currency : uuid5, (i2 & 16777216) != 0 ? order.type : orderType, (i2 & 33554432) != 0 ? order.update_count : i, (i2 & 67108864) != 0 ? order.legs : list2, (i2 & 134217728) != 0 ? order.last_sent_at : time5, (i2 & 268435456) != 0 ? order.fix_conn_id : str2, (i2 & 536870912) != 0 ? order.market_state : marketState, (i2 & 1073741824) != 0 ? order.clearing_firm : nullableString, (i2 & Integer.MIN_VALUE) != 0 ? order.response_text : nullableString2, (i3 & 1) != 0 ? order.to_cancel_at : time6, (i3 & 2) != 0 ? order.to_send_at : time7, (i3 & 4) != 0 ? order.venue_id : nullableString3, (i3 & 8) != 0 ? order.created_agent : agent, (i3 & 16) != 0 ? order.cl_ord_id : nullableString4, (i3 & 32) != 0 ? order.send_logs : list3, (i3 & 64) != 0 ? order.cancel_open_agent : agent2, (i3 & 128) != 0 ? order.cancel_open_time : time8, (i3 & 256) != 0 ? order.cancel_close_agent : agent3, (i3 & 512) != 0 ? order.cancel_close_time : time9, (i3 & 1024) != 0 ? order.created_service : clientService, (i3 & 2048) != 0 ? order.created_affiliate : affiliate, (i3 & 4096) != 0 ? order.service_shard_id : nullableInt, (i3 & 8192) != 0 ? order.instruments : list4, (i3 & 16384) != 0 ? order.response_category : responseCategory, (i3 & 32768) != 0 ? order.metadata : orderMetadata, (i3 & 65536) != 0 ? order.handling_instructions : list5, (i3 & 131072) != 0 ? order.market_hours : marketHours, (i3 & 262144) != 0 ? order.pro_trader : nullableBool, (i3 & 524288) != 0 ? order.expire_date : date, (i3 & 1048576) != 0 ? order.instruments_v2 : list6, (i3 & 2097152) != 0 ? order.waiting_category : waitingCategory, (i3 & 4194304) != 0 ? order.force_route : nullableBool2, (i3 & 8388608) != 0 ? order.notional : decimal7, (i3 & 16777216) != 0 ? order.max_quantity : decimal8, (i3 & 33554432) != 0 ? order.reserved_buying_power : decimal9, (i3 & 67108864) != 0 ? order.instrument_type : instrumentType, (i3 & 134217728) != 0 ? order.replacement_order_id : uuid6, (i3 & 268435456) != 0 ? order.ChildMarkets : list7, (i3 & 536870912) != 0 ? order.quantity_to_replace : decimal10, (i3 & 1073741824) != 0 ? order.list_root_id : uuid7, (i3 & Integer.MIN_VALUE) != 0 ? order.account_type : accountType, (i4 & 1) != 0 ? order.margin_mode : marginMode, (i4 & 2) != 0 ? order.leverage : decimal11, (i4 & 4) != 0 ? order.reduce_only : nullableBool3, (i4 & 8) != 0 ? order.currency_denomination : currencyDenomination, (i4 & 16) != 0 ? order.position_effect : positionEffect, (i4 & 32) != 0 ? order.position_id : nullableString5, (i4 & 64) != 0 ? order.active_ttl_seconds : nullableInt2, (i4 & 128) != 0 ? order.to_expire_at : time10, (i4 & 256) != 0 ? order.capacity : capacity, (i4 & 512) != 0 ? order.force_fix_line : nullableString6, (i4 & 1024) != 0 ? order.unknownFields() : byteString);
    }

    public final Order copy(UUID id, UUID instrument_id, UUID parent_order_id, String account_number, Route route, Side side, Decimal price, Decimal stop_price, Decimal trailing_peg, Decimal last_trail_price, Decimal quantity, Decimal cancelled_quantity, PegType peg_type, OrderTrigger trigger, TimeInForce time_in_force, OrderState state, Time created_at, Time received_at, Time last_transaction_at, List<Execution> executions, boolean extended_hours, Time stop_triggered_at, UUID user_currency, UUID asset_currency, OrderType type2, int update_count, List<OrderLeg> legs, Time last_sent_at, String fix_conn_id, MarketState market_state, NullableString clearing_firm, NullableString response_text, Time to_cancel_at, Time to_send_at, NullableString venue_id, Agent created_agent, NullableString cl_ord_id, List<OrderSendLog> send_logs, Agent cancel_open_agent, Time cancel_open_time, Agent cancel_close_agent, Time cancel_close_time, ClientService created_service, Affiliate created_affiliate, NullableInt service_shard_id, List<InstrumentInfo> instruments, ResponseCategory response_category, OrderMetadata metadata, List<? extends HandlingInstruction> handling_instructions, MarketHours market_hours, NullableBool pro_trader, Date expire_date, List<InstrumentInfoV2> instruments_v2, WaitingCategory waiting_category, NullableBool force_route, Decimal notional, Decimal max_quantity, Decimal reserved_buying_power, InstrumentType instrument_type, UUID replacement_order_id, List<String> ChildMarkets, Decimal quantity_to_replace, UUID list_root_id, AccountType account_type, MarginMode margin_mode, Decimal leverage, NullableBool reduce_only, CurrencyDenomination currency_denomination, PositionEffect position_effect, NullableString position_id, NullableInt active_ttl_seconds, Time to_expire_at, Capacity capacity, NullableString force_fix_line, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Order(id, instrument_id, parent_order_id, account_number, route, side, price, stop_price, trailing_peg, last_trail_price, quantity, cancelled_quantity, peg_type, trigger, time_in_force, state, created_at, received_at, last_transaction_at, executions, extended_hours, stop_triggered_at, user_currency, asset_currency, type2, update_count, legs, last_sent_at, fix_conn_id, market_state, clearing_firm, response_text, to_cancel_at, to_send_at, venue_id, created_agent, cl_ord_id, send_logs, cancel_open_agent, cancel_open_time, cancel_close_agent, cancel_close_time, created_service, created_affiliate, service_shard_id, instruments, response_category, metadata, handling_instructions, market_hours, pro_trader, expire_date, instruments_v2, waiting_category, force_route, notional, max_quantity, reserved_buying_power, instrument_type, replacement_order_id, ChildMarkets, quantity_to_replace, list_root_id, account_type, margin_mode, leverage, reduce_only, currency_denomination, position_effect, position_id, active_ttl_seconds, to_expire_at, capacity, force_fix_line, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Order.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Order>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.Order$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Order value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getInstrument_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (value.getParent_order_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(45, value.getParent_order_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    size += Route.ADAPTER.encodedSizeWithTag(4, value.getRoute());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(5, value.getSide());
                }
                if (value.getPrice() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(6, value.getPrice());
                }
                if (value.getStop_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getStop_price());
                }
                if (value.getTrailing_peg() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(35, value.getTrailing_peg());
                }
                if (value.getLast_trail_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(36, value.getLast_trail_price());
                }
                if (value.getQuantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getQuantity());
                }
                if (value.getCancelled_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(9, value.getCancelled_quantity());
                }
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    size += PegType.ADAPTER.encodedSizeWithTag(37, value.getPeg_type());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    size += OrderTrigger.ADAPTER.encodedSizeWithTag(10, value.getTrigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    size += TimeInForce.ADAPTER.encodedSizeWithTag(11, value.getTime_in_force());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    size += OrderState.ADAPTER.encodedSizeWithTag(12, value.getState());
                }
                if (value.getCreated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(13, value.getCreated_at());
                }
                if (value.getReceived_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(14, value.getReceived_at());
                }
                if (value.getLast_transaction_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(15, value.getLast_transaction_at());
                }
                int iEncodedSizeWithTag = size + Execution.ADAPTER.asRepeated().encodedSizeWithTag(16, value.getExecutions());
                if (value.getExtended_hours()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getExtended_hours()));
                }
                if (value.getStop_triggered_at() != null) {
                    iEncodedSizeWithTag += Time.ADAPTER.encodedSizeWithTag(39, value.getStop_triggered_at());
                }
                if (value.getUser_currency() != null) {
                    iEncodedSizeWithTag += UUID.ADAPTER.encodedSizeWithTag(18, value.getUser_currency());
                }
                if (value.getAsset_currency() != null) {
                    iEncodedSizeWithTag += UUID.ADAPTER.encodedSizeWithTag(19, value.getAsset_currency());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag += OrderType.ADAPTER.encodedSizeWithTag(20, value.getType());
                }
                if (value.getUpdate_count() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.getUpdate_count()));
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + OrderLeg.ADAPTER.asRepeated().encodedSizeWithTag(22, value.getLegs());
                if (value.getLast_sent_at() != null) {
                    iEncodedSizeWithTag2 += Time.ADAPTER.encodedSizeWithTag(23, value.getLast_sent_at());
                }
                if (!Intrinsics.areEqual(value.getFix_conn_id(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(24, value.getFix_conn_id());
                }
                if (value.getMarket_state() != MarketState.MARKET_STATE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += MarketState.ADAPTER.encodedSizeWithTag(25, value.getMarket_state());
                }
                if (value.getClearing_firm() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(26, value.getClearing_firm());
                }
                if (value.getResponse_text() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(27, value.getResponse_text());
                }
                if (value.getTo_cancel_at() != null) {
                    iEncodedSizeWithTag2 += Time.ADAPTER.encodedSizeWithTag(28, value.getTo_cancel_at());
                }
                if (value.getTo_send_at() != null) {
                    iEncodedSizeWithTag2 += Time.ADAPTER.encodedSizeWithTag(29, value.getTo_send_at());
                }
                if (value.getVenue_id() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(30, value.getVenue_id());
                }
                Agent created_agent = value.getCreated_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (created_agent != agent) {
                    iEncodedSizeWithTag2 += Agent.ADAPTER.encodedSizeWithTag(31, value.getCreated_agent());
                }
                if (value.getCl_ord_id() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(32, value.getCl_ord_id());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + OrderSendLog.ADAPTER.asRepeated().encodedSizeWithTag(33, value.getSend_logs());
                if (value.getCancel_open_agent() != agent) {
                    iEncodedSizeWithTag3 += Agent.ADAPTER.encodedSizeWithTag(40, value.getCancel_open_agent());
                }
                if (value.getCancel_open_time() != null) {
                    iEncodedSizeWithTag3 += Time.ADAPTER.encodedSizeWithTag(41, value.getCancel_open_time());
                }
                if (value.getCancel_close_agent() != agent) {
                    iEncodedSizeWithTag3 += Agent.ADAPTER.encodedSizeWithTag(42, value.getCancel_close_agent());
                }
                if (value.getCancel_close_time() != null) {
                    iEncodedSizeWithTag3 += Time.ADAPTER.encodedSizeWithTag(43, value.getCancel_close_time());
                }
                if (value.getCreated_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    iEncodedSizeWithTag3 += ClientService.ADAPTER.encodedSizeWithTag(46, value.getCreated_service());
                }
                if (value.getCreated_affiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    iEncodedSizeWithTag3 += Affiliate.ADAPTER.encodedSizeWithTag(48, value.getCreated_affiliate());
                }
                if (value.getService_shard_id() != null) {
                    iEncodedSizeWithTag3 += NullableInt.ADAPTER.encodedSizeWithTag(49, value.getService_shard_id());
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + InstrumentInfo.ADAPTER.asRepeated().encodedSizeWithTag(34, value.getInstruments());
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += ResponseCategory.ADAPTER.encodedSizeWithTag(50, value.getResponse_category());
                }
                if (value.getMetadata() != null) {
                    iEncodedSizeWithTag4 += OrderMetadata.ADAPTER.encodedSizeWithTag(51, value.getMetadata());
                }
                int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + HandlingInstruction.ADAPTER.asRepeated().encodedSizeWithTag(52, value.getHandling_instructions());
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    iEncodedSizeWithTag5 += MarketHours.ADAPTER.encodedSizeWithTag(53, value.getMarket_hours());
                }
                if (value.getPro_trader() != null) {
                    iEncodedSizeWithTag5 += NullableBool.ADAPTER.encodedSizeWithTag(54, value.getPro_trader());
                }
                if (value.getExpire_date() != null) {
                    iEncodedSizeWithTag5 += Date.ADAPTER.encodedSizeWithTag(55, value.getExpire_date());
                }
                int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + InstrumentInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(56, value.getInstruments_v2());
                if (value.getWaiting_category() != WaitingCategory.WAITING_CATEGORY_UNSPECIFIED) {
                    iEncodedSizeWithTag6 += WaitingCategory.ADAPTER.encodedSizeWithTag(57, value.getWaiting_category());
                }
                if (value.getForce_route() != null) {
                    iEncodedSizeWithTag6 += NullableBool.ADAPTER.encodedSizeWithTag(58, value.getForce_route());
                }
                if (value.getNotional() != null) {
                    iEncodedSizeWithTag6 += Decimal.ADAPTER.encodedSizeWithTag(59, value.getNotional());
                }
                if (value.getMax_quantity() != null) {
                    iEncodedSizeWithTag6 += Decimal.ADAPTER.encodedSizeWithTag(60, value.getMax_quantity());
                }
                if (value.getReserved_buying_power() != null) {
                    iEncodedSizeWithTag6 += Decimal.ADAPTER.encodedSizeWithTag(61, value.getReserved_buying_power());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag6 += InstrumentType.ADAPTER.encodedSizeWithTag(62, value.getInstrument_type());
                }
                if (value.getReplacement_order_id() != null) {
                    iEncodedSizeWithTag6 += UUID.ADAPTER.encodedSizeWithTag(63, value.getReplacement_order_id());
                }
                int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(64, value.getChildMarkets());
                if (value.getQuantity_to_replace() != null) {
                    iEncodedSizeWithTag7 += Decimal.ADAPTER.encodedSizeWithTag(65, value.getQuantity_to_replace());
                }
                if (value.getList_root_id() != null) {
                    iEncodedSizeWithTag7 += UUID.ADAPTER.encodedSizeWithTag(66, value.getList_root_id());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag7 += AccountType.ADAPTER.encodedSizeWithTag(67, value.getAccount_type());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    iEncodedSizeWithTag7 += MarginMode.ADAPTER.encodedSizeWithTag(68, value.getMargin_mode());
                }
                if (value.getLeverage() != null) {
                    iEncodedSizeWithTag7 += Decimal.ADAPTER.encodedSizeWithTag(69, value.getLeverage());
                }
                if (value.getReduce_only() != null) {
                    iEncodedSizeWithTag7 += NullableBool.ADAPTER.encodedSizeWithTag(70, value.getReduce_only());
                }
                if (value.getCurrency_denomination() != CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED) {
                    iEncodedSizeWithTag7 += CurrencyDenomination.ADAPTER.encodedSizeWithTag(71, value.getCurrency_denomination());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    iEncodedSizeWithTag7 += PositionEffect.ADAPTER.encodedSizeWithTag(72, value.getPosition_effect());
                }
                if (value.getPosition_id() != null) {
                    iEncodedSizeWithTag7 += NullableString.ADAPTER.encodedSizeWithTag(73, value.getPosition_id());
                }
                if (value.getActive_ttl_seconds() != null) {
                    iEncodedSizeWithTag7 += NullableInt.ADAPTER.encodedSizeWithTag(74, value.getActive_ttl_seconds());
                }
                if (value.getTo_expire_at() != null) {
                    iEncodedSizeWithTag7 += Time.ADAPTER.encodedSizeWithTag(75, value.getTo_expire_at());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    iEncodedSizeWithTag7 += Capacity.ADAPTER.encodedSizeWithTag(76, value.getCapacity());
                }
                return value.getForce_fix_line() != null ? iEncodedSizeWithTag7 + NullableString.ADAPTER.encodedSizeWithTag(77, value.getForce_fix_line()) : iEncodedSizeWithTag7;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Order value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getParent_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 45, (int) value.getParent_order_id());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 4, (int) value.getRoute());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getSide());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 6, (int) value.getPrice());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getStop_price());
                }
                if (value.getTrailing_peg() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 35, (int) value.getTrailing_peg());
                }
                if (value.getLast_trail_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 36, (int) value.getLast_trail_price());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuantity());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getCancelled_quantity());
                }
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 37, (int) value.getPeg_type());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 10, (int) value.getTrigger());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 11, (int) value.getTime_in_force());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 12, (int) value.getState());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 13, (int) value.getCreated_at());
                }
                if (value.getReceived_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 14, (int) value.getReceived_at());
                }
                if (value.getLast_transaction_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getLast_transaction_at());
                }
                Execution.ADAPTER.asRepeated().encodeWithTag(writer, 16, (int) value.getExecutions());
                if (value.getExtended_hours()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getExtended_hours()));
                }
                if (value.getStop_triggered_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 39, (int) value.getStop_triggered_at());
                }
                if (value.getUser_currency() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 18, (int) value.getUser_currency());
                }
                if (value.getAsset_currency() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 19, (int) value.getAsset_currency());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 20, (int) value.getType());
                }
                if (value.getUpdate_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getUpdate_count()));
                }
                OrderLeg.ADAPTER.asRepeated().encodeWithTag(writer, 22, (int) value.getLegs());
                if (value.getLast_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 23, (int) value.getLast_sent_at());
                }
                if (!Intrinsics.areEqual(value.getFix_conn_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 24, (int) value.getFix_conn_id());
                }
                if (value.getMarket_state() != MarketState.MARKET_STATE_UNSPECIFIED) {
                    MarketState.ADAPTER.encodeWithTag(writer, 25, (int) value.getMarket_state());
                }
                if (value.getClearing_firm() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 26, (int) value.getClearing_firm());
                }
                if (value.getResponse_text() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 27, (int) value.getResponse_text());
                }
                if (value.getTo_cancel_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 28, (int) value.getTo_cancel_at());
                }
                if (value.getTo_send_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 29, (int) value.getTo_send_at());
                }
                if (value.getVenue_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 30, (int) value.getVenue_id());
                }
                Agent created_agent = value.getCreated_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (created_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 31, (int) value.getCreated_agent());
                }
                if (value.getCl_ord_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 32, (int) value.getCl_ord_id());
                }
                OrderSendLog.ADAPTER.asRepeated().encodeWithTag(writer, 33, (int) value.getSend_logs());
                if (value.getCancel_open_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 40, (int) value.getCancel_open_agent());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 41, (int) value.getCancel_open_time());
                }
                if (value.getCancel_close_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 42, (int) value.getCancel_close_agent());
                }
                if (value.getCancel_close_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 43, (int) value.getCancel_close_time());
                }
                if (value.getCreated_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    ClientService.ADAPTER.encodeWithTag(writer, 46, (int) value.getCreated_service());
                }
                if (value.getCreated_affiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 48, (int) value.getCreated_affiliate());
                }
                if (value.getService_shard_id() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 49, (int) value.getService_shard_id());
                }
                InstrumentInfo.ADAPTER.asRepeated().encodeWithTag(writer, 34, (int) value.getInstruments());
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 50, (int) value.getResponse_category());
                }
                if (value.getMetadata() != null) {
                    OrderMetadata.ADAPTER.encodeWithTag(writer, 51, (int) value.getMetadata());
                }
                HandlingInstruction.ADAPTER.asRepeated().encodeWithTag(writer, 52, (int) value.getHandling_instructions());
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 53, (int) value.getMarket_hours());
                }
                if (value.getPro_trader() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 54, (int) value.getPro_trader());
                }
                if (value.getExpire_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 55, (int) value.getExpire_date());
                }
                InstrumentInfoV2.ADAPTER.asRepeated().encodeWithTag(writer, 56, (int) value.getInstruments_v2());
                if (value.getWaiting_category() != WaitingCategory.WAITING_CATEGORY_UNSPECIFIED) {
                    WaitingCategory.ADAPTER.encodeWithTag(writer, 57, (int) value.getWaiting_category());
                }
                if (value.getForce_route() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 58, (int) value.getForce_route());
                }
                if (value.getNotional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 59, (int) value.getNotional());
                }
                if (value.getMax_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 60, (int) value.getMax_quantity());
                }
                if (value.getReserved_buying_power() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 61, (int) value.getReserved_buying_power());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 62, (int) value.getInstrument_type());
                }
                if (value.getReplacement_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 63, (int) value.getReplacement_order_id());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 64, (int) value.getChildMarkets());
                if (value.getQuantity_to_replace() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 65, (int) value.getQuantity_to_replace());
                }
                if (value.getList_root_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 66, (int) value.getList_root_id());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 67, (int) value.getAccount_type());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 68, (int) value.getMargin_mode());
                }
                if (value.getLeverage() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 69, (int) value.getLeverage());
                }
                if (value.getReduce_only() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 70, (int) value.getReduce_only());
                }
                if (value.getCurrency_denomination() != CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED) {
                    CurrencyDenomination.ADAPTER.encodeWithTag(writer, 71, (int) value.getCurrency_denomination());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 72, (int) value.getPosition_effect());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 73, (int) value.getPosition_id());
                }
                if (value.getActive_ttl_seconds() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 74, (int) value.getActive_ttl_seconds());
                }
                if (value.getTo_expire_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 75, (int) value.getTo_expire_at());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    Capacity.ADAPTER.encodeWithTag(writer, 76, (int) value.getCapacity());
                }
                if (value.getForce_fix_line() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 77, (int) value.getForce_fix_line());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Order value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getForce_fix_line() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 77, (int) value.getForce_fix_line());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    Capacity.ADAPTER.encodeWithTag(writer, 76, (int) value.getCapacity());
                }
                if (value.getTo_expire_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 75, (int) value.getTo_expire_at());
                }
                if (value.getActive_ttl_seconds() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 74, (int) value.getActive_ttl_seconds());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 73, (int) value.getPosition_id());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 72, (int) value.getPosition_effect());
                }
                if (value.getCurrency_denomination() != CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED) {
                    CurrencyDenomination.ADAPTER.encodeWithTag(writer, 71, (int) value.getCurrency_denomination());
                }
                if (value.getReduce_only() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 70, (int) value.getReduce_only());
                }
                if (value.getLeverage() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 69, (int) value.getLeverage());
                }
                if (value.getMargin_mode() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 68, (int) value.getMargin_mode());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 67, (int) value.getAccount_type());
                }
                if (value.getList_root_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 66, (int) value.getList_root_id());
                }
                if (value.getQuantity_to_replace() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 65, (int) value.getQuantity_to_replace());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 64, (int) value.getChildMarkets());
                if (value.getReplacement_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 63, (int) value.getReplacement_order_id());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 62, (int) value.getInstrument_type());
                }
                if (value.getReserved_buying_power() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 61, (int) value.getReserved_buying_power());
                }
                if (value.getMax_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 60, (int) value.getMax_quantity());
                }
                if (value.getNotional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 59, (int) value.getNotional());
                }
                if (value.getForce_route() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 58, (int) value.getForce_route());
                }
                if (value.getWaiting_category() != WaitingCategory.WAITING_CATEGORY_UNSPECIFIED) {
                    WaitingCategory.ADAPTER.encodeWithTag(writer, 57, (int) value.getWaiting_category());
                }
                InstrumentInfoV2.ADAPTER.asRepeated().encodeWithTag(writer, 56, (int) value.getInstruments_v2());
                if (value.getExpire_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 55, (int) value.getExpire_date());
                }
                if (value.getPro_trader() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 54, (int) value.getPro_trader());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 53, (int) value.getMarket_hours());
                }
                HandlingInstruction.ADAPTER.asRepeated().encodeWithTag(writer, 52, (int) value.getHandling_instructions());
                if (value.getMetadata() != null) {
                    OrderMetadata.ADAPTER.encodeWithTag(writer, 51, (int) value.getMetadata());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 50, (int) value.getResponse_category());
                }
                InstrumentInfo.ADAPTER.asRepeated().encodeWithTag(writer, 34, (int) value.getInstruments());
                if (value.getService_shard_id() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 49, (int) value.getService_shard_id());
                }
                if (value.getCreated_affiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 48, (int) value.getCreated_affiliate());
                }
                if (value.getCreated_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    ClientService.ADAPTER.encodeWithTag(writer, 46, (int) value.getCreated_service());
                }
                if (value.getCancel_close_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 43, (int) value.getCancel_close_time());
                }
                Agent cancel_close_agent = value.getCancel_close_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (cancel_close_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 42, (int) value.getCancel_close_agent());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 41, (int) value.getCancel_open_time());
                }
                if (value.getCancel_open_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 40, (int) value.getCancel_open_agent());
                }
                OrderSendLog.ADAPTER.asRepeated().encodeWithTag(writer, 33, (int) value.getSend_logs());
                if (value.getCl_ord_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 32, (int) value.getCl_ord_id());
                }
                if (value.getCreated_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 31, (int) value.getCreated_agent());
                }
                if (value.getVenue_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 30, (int) value.getVenue_id());
                }
                if (value.getTo_send_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 29, (int) value.getTo_send_at());
                }
                if (value.getTo_cancel_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 28, (int) value.getTo_cancel_at());
                }
                if (value.getResponse_text() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 27, (int) value.getResponse_text());
                }
                if (value.getClearing_firm() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 26, (int) value.getClearing_firm());
                }
                if (value.getMarket_state() != MarketState.MARKET_STATE_UNSPECIFIED) {
                    MarketState.ADAPTER.encodeWithTag(writer, 25, (int) value.getMarket_state());
                }
                if (!Intrinsics.areEqual(value.getFix_conn_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 24, (int) value.getFix_conn_id());
                }
                if (value.getLast_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 23, (int) value.getLast_sent_at());
                }
                OrderLeg.ADAPTER.asRepeated().encodeWithTag(writer, 22, (int) value.getLegs());
                if (value.getUpdate_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 21, (int) Integer.valueOf(value.getUpdate_count()));
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 20, (int) value.getType());
                }
                if (value.getAsset_currency() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 19, (int) value.getAsset_currency());
                }
                if (value.getUser_currency() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 18, (int) value.getUser_currency());
                }
                if (value.getStop_triggered_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 39, (int) value.getStop_triggered_at());
                }
                if (value.getExtended_hours()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getExtended_hours()));
                }
                Execution.ADAPTER.asRepeated().encodeWithTag(writer, 16, (int) value.getExecutions());
                if (value.getLast_transaction_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 15, (int) value.getLast_transaction_at());
                }
                if (value.getReceived_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 14, (int) value.getReceived_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 13, (int) value.getCreated_at());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 12, (int) value.getState());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 11, (int) value.getTime_in_force());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 10, (int) value.getTrigger());
                }
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 37, (int) value.getPeg_type());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getCancelled_quantity());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuantity());
                }
                if (value.getLast_trail_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 36, (int) value.getLast_trail_price());
                }
                if (value.getTrailing_peg() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 35, (int) value.getTrailing_peg());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getStop_price());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 6, (int) value.getPrice());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 5, (int) value.getSide());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 4, (int) value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (value.getParent_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 45, (int) value.getParent_order_id());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Order decode(ProtoReader reader) throws IOException {
                OrderType orderType;
                Agent agent;
                Agent agent2;
                Route routeDecode;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Route route = Route.ROUTE_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                PegType pegType = PegType.PEG_TYPE_UNSPECIFIED;
                OrderTrigger orderTrigger = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                OrderType orderType2 = OrderType.ORDER_TYPE_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                MarketState marketState = MarketState.MARKET_STATE_UNSPECIFIED;
                Agent agent3 = Agent.AGENT_UNSPECIFIED;
                ArrayList arrayList3 = new ArrayList();
                ClientService clientService = ClientService.CLIENT_SERVICE_UNSPECIFIED;
                Affiliate affiliate = Affiliate.AFFILIATE_UNSPECIFIED;
                ArrayList arrayList4 = new ArrayList();
                ResponseCategory responseCategory = ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
                Side sideDecode = side;
                ArrayList arrayList5 = new ArrayList();
                MarketHours marketHours = MarketHours.MARKET_HOURS_UNSPECIFIED;
                PegType pegTypeDecode = pegType;
                ArrayList arrayList6 = new ArrayList();
                WaitingCategory waitingCategory = WaitingCategory.WAITING_CATEGORY_UNSPECIFIED;
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                OrderTrigger orderTriggerDecode = orderTrigger;
                ArrayList arrayList7 = new ArrayList();
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                MarginMode marginMode = MarginMode.MARGIN_MODE_UNSPECIFIED;
                CurrencyDenomination currencyDenomination = CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED;
                PositionEffect positionEffect = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                Capacity capacity = Capacity.CAPACITY_UNSPECIFIED;
                TimeInForce timeInForceDecode = timeInForce;
                OrderState orderStateDecode = orderState;
                long jBeginMessage = reader.beginMessage();
                Route route2 = route;
                UUID uuid = null;
                UUID uuid2 = null;
                UUID uuid3 = null;
                Decimal decimal = null;
                Decimal decimal2 = null;
                Decimal decimal3 = null;
                Decimal decimal4 = null;
                Decimal decimal5 = null;
                Decimal decimal6 = null;
                Time time = null;
                Time time2 = null;
                Time time3 = null;
                Time time4 = null;
                UUID uuid4 = null;
                UUID uuid5 = null;
                Time time5 = null;
                NullableString nullableString = null;
                NullableString nullableString2 = null;
                Time time6 = null;
                Time time7 = null;
                NullableString nullableString3 = null;
                NullableString nullableString4 = null;
                Time time8 = null;
                Time time9 = null;
                NullableInt nullableInt = null;
                OrderMetadata orderMetadata = null;
                NullableBool nullableBool = null;
                Date date = null;
                NullableBool nullableBool2 = null;
                Decimal decimal7 = null;
                Decimal decimal8 = null;
                Decimal decimal9 = null;
                UUID uuid6 = null;
                Decimal decimal10 = null;
                UUID uuid7 = null;
                Decimal decimal11 = null;
                NullableBool nullableBool3 = null;
                NullableString nullableString5 = null;
                NullableInt nullableInt2 = null;
                Time time10 = null;
                NullableString nullableString6 = null;
                String str = "";
                String str2 = str;
                boolean z = false;
                int i = 0;
                CurrencyDenomination currencyDenominationDecode = currencyDenomination;
                PositionEffect positionEffectDecode = positionEffect;
                Capacity capacityDecode = capacity;
                InstrumentType instrumentTypeDecode = instrumentType;
                AccountType accountTypeDecode = accountType;
                MarginMode marginModeDecode = marginMode;
                ResponseCategory responseCategoryDecode = responseCategory;
                MarketHours marketHoursDecode = marketHours;
                WaitingCategory waitingCategoryDecode = waitingCategory;
                Agent agentDecode = agent3;
                ClientService clientServiceDecode = clientService;
                Affiliate affiliateDecode = affiliate;
                MarketState marketStateDecode = marketState;
                Agent agentDecode2 = agentDecode;
                Agent agentDecode3 = agentDecode2;
                OrderType orderTypeDecode = orderType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Order(uuid, uuid2, uuid3, str, route2, sideDecode, decimal, decimal2, decimal3, decimal4, decimal5, decimal6, pegTypeDecode, orderTriggerDecode, timeInForceDecode, orderStateDecode, time, time2, time3, arrayList, z, time4, uuid4, uuid5, orderTypeDecode, i, arrayList2, time5, str2, marketStateDecode, nullableString, nullableString2, time6, time7, nullableString3, agentDecode2, nullableString4, arrayList3, agentDecode3, time8, agentDecode, time9, clientServiceDecode, affiliateDecode, nullableInt, arrayList4, responseCategoryDecode, orderMetadata, arrayList5, marketHoursDecode, nullableBool, date, arrayList6, waitingCategoryDecode, nullableBool2, decimal7, decimal8, decimal9, instrumentTypeDecode, uuid6, arrayList7, decimal10, uuid7, accountTypeDecode, marginModeDecode, decimal11, nullableBool3, currencyDenominationDecode, positionEffectDecode, nullableString5, nullableInt2, time10, capacityDecode, nullableString6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    switch (iNextTag) {
                        case 1:
                            UUID uuidDecode = UUID.ADAPTER.decode(reader);
                            Unit unit = Unit.INSTANCE;
                            uuid = uuidDecode;
                            break;
                        case 2:
                            UUID uuidDecode2 = UUID.ADAPTER.decode(reader);
                            Unit unit2 = Unit.INSTANCE;
                            uuid2 = uuidDecode2;
                            break;
                        case 3:
                            String strDecode = ProtoAdapter.STRING.decode(reader);
                            Unit unit3 = Unit.INSTANCE;
                            str = strDecode;
                            break;
                        case 4:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                routeDecode = Route.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                routeDecode = route2;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            route2 = routeDecode;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 5:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            Unit unit5 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 6:
                            Decimal decimalDecode = Decimal.ADAPTER.decode(reader);
                            Unit unit6 = Unit.INSTANCE;
                            decimal = decimalDecode;
                            break;
                        case 7:
                            Decimal decimalDecode2 = Decimal.ADAPTER.decode(reader);
                            Unit unit7 = Unit.INSTANCE;
                            decimal2 = decimalDecode2;
                            break;
                        case 8:
                            Decimal decimalDecode3 = Decimal.ADAPTER.decode(reader);
                            Unit unit8 = Unit.INSTANCE;
                            decimal5 = decimalDecode3;
                            break;
                        case 9:
                            Decimal decimalDecode4 = Decimal.ADAPTER.decode(reader);
                            Unit unit9 = Unit.INSTANCE;
                            decimal6 = decimalDecode4;
                            break;
                        case 10:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            Unit unit10 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 11:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            Unit unit11 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 12:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                orderStateDecode = OrderState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            Unit unit12 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 13:
                            Time timeDecode = Time.ADAPTER.decode(reader);
                            Unit unit13 = Unit.INSTANCE;
                            time = timeDecode;
                            break;
                        case 14:
                            Time timeDecode2 = Time.ADAPTER.decode(reader);
                            Unit unit14 = Unit.INSTANCE;
                            time2 = timeDecode2;
                            break;
                        case 15:
                            Time timeDecode3 = Time.ADAPTER.decode(reader);
                            Unit unit15 = Unit.INSTANCE;
                            time3 = timeDecode3;
                            break;
                        case 16:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            arrayList.add(Execution.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 17:
                            boolean zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            Unit unit16 = Unit.INSTANCE;
                            z = zBooleanValue;
                            break;
                        case 18:
                            UUID uuidDecode3 = UUID.ADAPTER.decode(reader);
                            Unit unit17 = Unit.INSTANCE;
                            uuid4 = uuidDecode3;
                            break;
                        case 19:
                            UUID uuidDecode4 = UUID.ADAPTER.decode(reader);
                            Unit unit18 = Unit.INSTANCE;
                            uuid5 = uuidDecode4;
                            break;
                        case 20:
                            OrderType orderType3 = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                orderTypeDecode = orderType3;
                            }
                            Unit unit19 = Unit.INSTANCE;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 21:
                            int iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            Unit unit20 = Unit.INSTANCE;
                            i = iIntValue;
                            break;
                        case 22:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            arrayList2.add(OrderLeg.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 23:
                            Time timeDecode4 = Time.ADAPTER.decode(reader);
                            Unit unit21 = Unit.INSTANCE;
                            time5 = timeDecode4;
                            break;
                        case 24:
                            String strDecode2 = ProtoAdapter.STRING.decode(reader);
                            Unit unit22 = Unit.INSTANCE;
                            str2 = strDecode2;
                            break;
                        case 25:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                marketStateDecode = MarketState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            Unit unit23 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 26:
                            NullableString nullableStringDecode = NullableString.ADAPTER.decode(reader);
                            Unit unit24 = Unit.INSTANCE;
                            nullableString = nullableStringDecode;
                            break;
                        case 27:
                            NullableString nullableStringDecode2 = NullableString.ADAPTER.decode(reader);
                            Unit unit25 = Unit.INSTANCE;
                            nullableString2 = nullableStringDecode2;
                            break;
                        case 28:
                            Time timeDecode5 = Time.ADAPTER.decode(reader);
                            Unit unit26 = Unit.INSTANCE;
                            time6 = timeDecode5;
                            break;
                        case 29:
                            Time timeDecode6 = Time.ADAPTER.decode(reader);
                            Unit unit27 = Unit.INSTANCE;
                            time7 = timeDecode6;
                            break;
                        case 30:
                            NullableString nullableStringDecode3 = NullableString.ADAPTER.decode(reader);
                            Unit unit28 = Unit.INSTANCE;
                            nullableString3 = nullableStringDecode3;
                            break;
                        case 31:
                            OrderType orderType4 = orderTypeDecode;
                            Agent agent4 = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                agentDecode2 = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                agentDecode2 = agent4;
                            }
                            Unit unit29 = Unit.INSTANCE;
                            orderTypeDecode = orderType4;
                            agentDecode3 = agent2;
                            break;
                        case 32:
                            NullableString nullableStringDecode4 = NullableString.ADAPTER.decode(reader);
                            Unit unit30 = Unit.INSTANCE;
                            nullableString4 = nullableStringDecode4;
                            break;
                        case 33:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            arrayList3.add(OrderSendLog.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 34:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            arrayList4.add(InstrumentInfo.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 35:
                            Decimal decimalDecode5 = Decimal.ADAPTER.decode(reader);
                            Unit unit31 = Unit.INSTANCE;
                            decimal3 = decimalDecode5;
                            break;
                        case 36:
                            Decimal decimalDecode6 = Decimal.ADAPTER.decode(reader);
                            Unit unit32 = Unit.INSTANCE;
                            decimal4 = decimalDecode6;
                            break;
                        case 37:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                pegTypeDecode = PegType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                            }
                            Unit unit33 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 38:
                        case 44:
                        case 47:
                        default:
                            reader.readUnknownField(iNextTag);
                            Unit unit34 = Unit.INSTANCE;
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 39:
                            Time timeDecode7 = Time.ADAPTER.decode(reader);
                            Unit unit35 = Unit.INSTANCE;
                            time4 = timeDecode7;
                            break;
                        case 40:
                            OrderType orderType5 = orderTypeDecode;
                            Agent agent5 = agentDecode2;
                            Agent agent6 = agentDecode3;
                            try {
                                agentDecode3 = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                agentDecode3 = agent6;
                            }
                            Unit unit36 = Unit.INSTANCE;
                            orderTypeDecode = orderType5;
                            agentDecode2 = agent5;
                            break;
                        case 41:
                            Time timeDecode8 = Time.ADAPTER.decode(reader);
                            Unit unit37 = Unit.INSTANCE;
                            time8 = timeDecode8;
                            break;
                        case 42:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                agentDecode = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                            }
                            Unit unit38 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 43:
                            Time timeDecode9 = Time.ADAPTER.decode(reader);
                            Unit unit39 = Unit.INSTANCE;
                            time9 = timeDecode9;
                            break;
                        case 45:
                            UUID uuidDecode5 = UUID.ADAPTER.decode(reader);
                            Unit unit40 = Unit.INSTANCE;
                            uuid3 = uuidDecode5;
                            break;
                        case 46:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                clientServiceDecode = ClientService.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e12.value));
                            }
                            Unit unit41 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 48:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                affiliateDecode = Affiliate.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e13.value));
                            }
                            Unit unit42 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 49:
                            NullableInt nullableIntDecode = NullableInt.ADAPTER.decode(reader);
                            Unit unit43 = Unit.INSTANCE;
                            nullableInt = nullableIntDecode;
                            break;
                        case 50:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                responseCategoryDecode = ResponseCategory.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e14.value));
                            }
                            Unit unit44 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 51:
                            OrderMetadata orderMetadataDecode = OrderMetadata.ADAPTER.decode(reader);
                            Unit unit45 = Unit.INSTANCE;
                            orderMetadata = orderMetadataDecode;
                            break;
                        case 52:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                HandlingInstruction.ADAPTER.tryDecode(reader, arrayList5);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e15.value));
                            }
                            Unit unit46 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 53:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                marketHoursDecode = MarketHours.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e16.value));
                            }
                            Unit unit47 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 54:
                            NullableBool nullableBoolDecode = NullableBool.ADAPTER.decode(reader);
                            Unit unit48 = Unit.INSTANCE;
                            nullableBool = nullableBoolDecode;
                            break;
                        case 55:
                            Date dateDecode = Date.ADAPTER.decode(reader);
                            Unit unit49 = Unit.INSTANCE;
                            date = dateDecode;
                            break;
                        case 56:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            arrayList6.add(InstrumentInfoV2.ADAPTER.decode(reader));
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 57:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                waitingCategoryDecode = WaitingCategory.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e17.value));
                            }
                            Unit unit50 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 58:
                            NullableBool nullableBoolDecode2 = NullableBool.ADAPTER.decode(reader);
                            Unit unit51 = Unit.INSTANCE;
                            nullableBool2 = nullableBoolDecode2;
                            break;
                        case 59:
                            Decimal decimalDecode7 = Decimal.ADAPTER.decode(reader);
                            Unit unit52 = Unit.INSTANCE;
                            decimal7 = decimalDecode7;
                            break;
                        case 60:
                            Decimal decimalDecode8 = Decimal.ADAPTER.decode(reader);
                            Unit unit53 = Unit.INSTANCE;
                            decimal8 = decimalDecode8;
                            break;
                        case 61:
                            Decimal decimalDecode9 = Decimal.ADAPTER.decode(reader);
                            Unit unit54 = Unit.INSTANCE;
                            decimal9 = decimalDecode9;
                            break;
                        case 62:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e18) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e18.value));
                            }
                            Unit unit55 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 63:
                            UUID uuidDecode6 = UUID.ADAPTER.decode(reader);
                            Unit unit56 = Unit.INSTANCE;
                            uuid6 = uuidDecode6;
                            break;
                        case 64:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            arrayList7.add(ProtoAdapter.STRING.decode(reader));
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 65:
                            Decimal decimalDecode10 = Decimal.ADAPTER.decode(reader);
                            Unit unit57 = Unit.INSTANCE;
                            decimal10 = decimalDecode10;
                            break;
                        case 66:
                            UUID uuidDecode7 = UUID.ADAPTER.decode(reader);
                            Unit unit58 = Unit.INSTANCE;
                            uuid7 = uuidDecode7;
                            break;
                        case 67:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                accountTypeDecode = AccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e19) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e19.value));
                            }
                            Unit unit59 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case SDK_ASSET_ICON_HOME_VALUE:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                marginModeDecode = MarginMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e20) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e20.value));
                            }
                            Unit unit60 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 69:
                            Decimal decimalDecode11 = Decimal.ADAPTER.decode(reader);
                            Unit unit61 = Unit.INSTANCE;
                            decimal11 = decimalDecode11;
                            break;
                        case 70:
                            NullableBool nullableBoolDecode3 = NullableBool.ADAPTER.decode(reader);
                            Unit unit62 = Unit.INSTANCE;
                            nullableBool3 = nullableBoolDecode3;
                            break;
                        case SDK_ASSET_ICON_GUIDE_VALUE:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                currencyDenominationDecode = CurrencyDenomination.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e21) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e21.value));
                            }
                            Unit unit63 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case SDK_ASSET_ICON_GLOBE_VALUE:
                            orderType = orderTypeDecode;
                            agent = agentDecode2;
                            agent2 = agentDecode3;
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e22) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e22.value));
                            }
                            Unit unit64 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 73:
                            NullableString nullableStringDecode5 = NullableString.ADAPTER.decode(reader);
                            Unit unit65 = Unit.INSTANCE;
                            nullableString5 = nullableStringDecode5;
                            break;
                        case 74:
                            NullableInt nullableIntDecode2 = NullableInt.ADAPTER.decode(reader);
                            Unit unit66 = Unit.INSTANCE;
                            nullableInt2 = nullableIntDecode2;
                            break;
                        case 75:
                            Time timeDecode10 = Time.ADAPTER.decode(reader);
                            Unit unit67 = Unit.INSTANCE;
                            time10 = timeDecode10;
                            break;
                        case 76:
                            try {
                                capacityDecode = Capacity.ADAPTER.decode(reader);
                                orderType = orderTypeDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode3;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e23) {
                                orderType = orderTypeDecode;
                                agent = agentDecode2;
                                agent2 = agentDecode3;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e23.value));
                            }
                            Unit unit68 = Unit.INSTANCE;
                            orderTypeDecode = orderType;
                            agentDecode2 = agent;
                            agentDecode3 = agent2;
                            break;
                        case 77:
                            NullableString nullableStringDecode6 = NullableString.ADAPTER.decode(reader);
                            Unit unit69 = Unit.INSTANCE;
                            nullableString6 = nullableStringDecode6;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Order redact(Order value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                UUID instrument_id = value.getInstrument_id();
                UUID uuidRedact2 = instrument_id != null ? UUID.ADAPTER.redact(instrument_id) : null;
                UUID parent_order_id = value.getParent_order_id();
                UUID uuidRedact3 = parent_order_id != null ? UUID.ADAPTER.redact(parent_order_id) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact = price != null ? Decimal.ADAPTER.redact(price) : null;
                Decimal stop_price = value.getStop_price();
                Decimal decimalRedact2 = stop_price != null ? Decimal.ADAPTER.redact(stop_price) : null;
                Decimal trailing_peg = value.getTrailing_peg();
                Decimal decimalRedact3 = trailing_peg != null ? Decimal.ADAPTER.redact(trailing_peg) : null;
                Decimal last_trail_price = value.getLast_trail_price();
                Decimal decimalRedact4 = last_trail_price != null ? Decimal.ADAPTER.redact(last_trail_price) : null;
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact5 = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                Decimal cancelled_quantity = value.getCancelled_quantity();
                Decimal decimalRedact6 = cancelled_quantity != null ? Decimal.ADAPTER.redact(cancelled_quantity) : null;
                Time created_at = value.getCreated_at();
                Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time received_at = value.getReceived_at();
                Time timeRedact2 = received_at != null ? Time.ADAPTER.redact(received_at) : null;
                Time last_transaction_at = value.getLast_transaction_at();
                Time timeRedact3 = last_transaction_at != null ? Time.ADAPTER.redact(last_transaction_at) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getExecutions(), Execution.ADAPTER);
                Time stop_triggered_at = value.getStop_triggered_at();
                Time timeRedact4 = stop_triggered_at != null ? Time.ADAPTER.redact(stop_triggered_at) : null;
                UUID user_currency = value.getUser_currency();
                UUID uuidRedact4 = user_currency != null ? UUID.ADAPTER.redact(user_currency) : null;
                UUID asset_currency = value.getAsset_currency();
                UUID uuidRedact5 = asset_currency != null ? UUID.ADAPTER.redact(asset_currency) : null;
                List listM26823redactElements2 = Internal.m26823redactElements(value.getLegs(), OrderLeg.ADAPTER);
                Time last_sent_at = value.getLast_sent_at();
                Time timeRedact5 = last_sent_at != null ? Time.ADAPTER.redact(last_sent_at) : null;
                NullableString clearing_firm = value.getClearing_firm();
                NullableString nullableStringRedact = clearing_firm != null ? NullableString.ADAPTER.redact(clearing_firm) : null;
                NullableString response_text = value.getResponse_text();
                NullableString nullableStringRedact2 = response_text != null ? NullableString.ADAPTER.redact(response_text) : null;
                Time to_cancel_at = value.getTo_cancel_at();
                Time timeRedact6 = to_cancel_at != null ? Time.ADAPTER.redact(to_cancel_at) : null;
                Time to_send_at = value.getTo_send_at();
                Time timeRedact7 = to_send_at != null ? Time.ADAPTER.redact(to_send_at) : null;
                NullableString venue_id = value.getVenue_id();
                NullableString nullableStringRedact3 = venue_id != null ? NullableString.ADAPTER.redact(venue_id) : null;
                NullableString cl_ord_id = value.getCl_ord_id();
                NullableString nullableStringRedact4 = cl_ord_id != null ? NullableString.ADAPTER.redact(cl_ord_id) : null;
                List listM26823redactElements3 = Internal.m26823redactElements(value.getSend_logs(), OrderSendLog.ADAPTER);
                Time cancel_open_time = value.getCancel_open_time();
                Time timeRedact8 = cancel_open_time != null ? Time.ADAPTER.redact(cancel_open_time) : null;
                Time cancel_close_time = value.getCancel_close_time();
                Time timeRedact9 = cancel_close_time != null ? Time.ADAPTER.redact(cancel_close_time) : null;
                NullableInt service_shard_id = value.getService_shard_id();
                NullableInt nullableIntRedact = service_shard_id != null ? NullableInt.ADAPTER.redact(service_shard_id) : null;
                List listM26823redactElements4 = Internal.m26823redactElements(value.getInstruments(), InstrumentInfo.ADAPTER);
                OrderMetadata metadata = value.getMetadata();
                OrderMetadata orderMetadataRedact = metadata != null ? OrderMetadata.ADAPTER.redact(metadata) : null;
                NullableBool pro_trader = value.getPro_trader();
                NullableBool nullableBoolRedact = pro_trader != null ? NullableBool.ADAPTER.redact(pro_trader) : null;
                Date expire_date = value.getExpire_date();
                Date dateRedact = expire_date != null ? Date.ADAPTER.redact(expire_date) : null;
                List listM26823redactElements5 = Internal.m26823redactElements(value.getInstruments_v2(), InstrumentInfoV2.ADAPTER);
                NullableBool force_route = value.getForce_route();
                NullableBool nullableBoolRedact2 = force_route != null ? NullableBool.ADAPTER.redact(force_route) : null;
                Decimal notional = value.getNotional();
                Decimal decimalRedact7 = notional != null ? Decimal.ADAPTER.redact(notional) : null;
                Decimal max_quantity = value.getMax_quantity();
                Decimal decimalRedact8 = max_quantity != null ? Decimal.ADAPTER.redact(max_quantity) : null;
                Decimal reserved_buying_power = value.getReserved_buying_power();
                Decimal decimalRedact9 = reserved_buying_power != null ? Decimal.ADAPTER.redact(reserved_buying_power) : null;
                UUID replacement_order_id = value.getReplacement_order_id();
                UUID uuidRedact6 = replacement_order_id != null ? UUID.ADAPTER.redact(replacement_order_id) : null;
                Decimal quantity_to_replace = value.getQuantity_to_replace();
                Decimal decimalRedact10 = quantity_to_replace != null ? Decimal.ADAPTER.redact(quantity_to_replace) : null;
                UUID list_root_id = value.getList_root_id();
                UUID uuidRedact7 = list_root_id != null ? UUID.ADAPTER.redact(list_root_id) : null;
                Decimal leverage = value.getLeverage();
                Decimal decimalRedact11 = leverage != null ? Decimal.ADAPTER.redact(leverage) : null;
                NullableBool reduce_only = value.getReduce_only();
                NullableBool nullableBoolRedact3 = reduce_only != null ? NullableBool.ADAPTER.redact(reduce_only) : null;
                NullableString position_id = value.getPosition_id();
                NullableString nullableStringRedact5 = position_id != null ? NullableString.ADAPTER.redact(position_id) : null;
                NullableInt active_ttl_seconds = value.getActive_ttl_seconds();
                NullableInt nullableIntRedact2 = active_ttl_seconds != null ? NullableInt.ADAPTER.redact(active_ttl_seconds) : null;
                Time to_expire_at = value.getTo_expire_at();
                Time timeRedact10 = to_expire_at != null ? Time.ADAPTER.redact(to_expire_at) : null;
                NullableString force_fix_line = value.getForce_fix_line();
                return Order.copy$default(value, uuidRedact, uuidRedact2, uuidRedact3, null, null, null, decimalRedact, decimalRedact2, decimalRedact3, decimalRedact4, decimalRedact5, decimalRedact6, null, null, null, null, timeRedact, timeRedact2, timeRedact3, listM26823redactElements, false, timeRedact4, uuidRedact4, uuidRedact5, null, 0, listM26823redactElements2, timeRedact5, null, null, nullableStringRedact, nullableStringRedact2, timeRedact6, timeRedact7, nullableStringRedact3, null, nullableStringRedact4, listM26823redactElements3, null, timeRedact8, null, timeRedact9, null, null, nullableIntRedact, listM26823redactElements4, null, orderMetadataRedact, null, null, nullableBoolRedact, dateRedact, listM26823redactElements5, null, nullableBoolRedact2, decimalRedact7, decimalRedact8, decimalRedact9, null, uuidRedact6, null, decimalRedact10, uuidRedact7, null, null, decimalRedact11, nullableBoolRedact3, null, null, nullableStringRedact5, nullableIntRedact2, timeRedact10, null, force_fix_line != null ? NullableString.ADAPTER.redact(force_fix_line) : null, ByteString.EMPTY, 856748088, -1809625784, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, null);
            }
        };
    }
}
