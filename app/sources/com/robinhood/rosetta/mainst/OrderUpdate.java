package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
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
import rosetta.mainst.InstrumentType;
import rosetta.mainst.MarginMode;
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
import rosetta.order.MarketHours;
import rosetta.order.PegType;
import rosetta.order.ResponseCategory;
import rosetta.order.WaitingCategory;

/* compiled from: OrderUpdate.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\be\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 Ð\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Ð\u0001Bß\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010,\u001a\u00020\u0016\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\b\b\u0002\u0010/\u001a\u000200\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00103\u001a\u00020&\u0012\b\b\u0002\u00104\u001a\u000205\u0012\b\b\u0002\u00106\u001a\u000207\u0012\b\b\u0002\u00108\u001a\u000209\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010=\u001a\u00020>\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010F\u001a\u00020G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I\u0012\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000f\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010O\u001a\u00020\u0016\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010X\u001a\u00020Y\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010^\u001a\u00020_\u0012\b\b\u0002\u0010`\u001a\u00020a\u0012\b\b\u0002\u0010b\u001a\u00020c\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010e\u001a\u00020f¢\u0006\u0004\bg\u0010hJ\t\u0010É\u0001\u001a\u00020\u0002H\u0017J\u0016\u0010Ê\u0001\u001a\u00020*2\n\u0010Ë\u0001\u001a\u0005\u0018\u00010Ì\u0001H\u0096\u0002J\t\u0010Í\u0001\u001a\u00020\u0012H\u0016J\t\u0010Î\u0001\u001a\u00020\u0016H\u0016Jß\u0005\u0010Ï\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020&2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010F\u001a\u00020G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\u000e\b\u0002\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000f2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010O\u001a\u00020\u00162\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010X\u001a\u00020Y2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010^\u001a\u00020_2\b\b\u0002\u0010`\u001a\u00020a2\b\b\u0002\u0010b\u001a\u00020c2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010e\u001a\u00020fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010jR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010qR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010qR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010oR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010oR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010oR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010oR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010jR\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\"\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010qR\u0018\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010'\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010oR\u001f\u0010)\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0011\n\u0000\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b)\u0010\u008c\u0001R\u0019\u0010+\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010qR\u0017\u0010,\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010yR\u0018\u0010-\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010/\u001a\u0002008\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u00103\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0087\u0001R\u0018\u00104\u001a\u0002058\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u00106\u001a\u0002078\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u00108\u001a\u0002098\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010:\u001a\u00020;8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010<\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u0082\u0001R\u0018\u0010=\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010?\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010A\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010oR\u001a\u0010B\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010D\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010F\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010H\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001R\u0019\u0010L\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010oR\u0019\u0010M\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010qR\u0019\u0010N\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010qR\u0017\u0010O\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010yR\u0019\u0010P\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010oR\u0019\u0010Q\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010jR\u0019\u0010R\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010jR\u001a\u0010S\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010U\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010oR\u0019\u0010V\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b¶\u0001\u0010oR\u0019\u0010W\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b·\u0001\u0010qR\u0018\u0010X\u001a\u00020Y8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010Z\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010oR\u001a\u0010[\u001a\u0004\u0018\u00010\\8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010¼\u0001R\u0019\u0010]\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010jR\u0018\u0010^\u001a\u00020_8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010`\u001a\u00020a8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010b\u001a\u00020c8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010d\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÄ\u0001\u0010\u0082\u0001R\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÇ\u0001\u0010Æ\u0001R\u001e\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010Æ\u0001¨\u0006Ñ\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/OrderUpdate;", "Lcom/squareup/wire/Message;", "", "id", "Lcom/robinhood/rosetta/mainst/UUID;", "order_id", "state", "Lrosetta/mainst/OrderState;", "cancelled_quantity", "Lcom/robinhood/rosetta/mainst/Decimal;", "created_at", "Lcom/robinhood/rosetta/mainst/Time;", "last_transaction_at", "stop_triggered_at", "executions", "", "Lcom/robinhood/rosetta/mainst/OrderUpdateExecution;", "version", "", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "account_number", "", "side", "Lrosetta/mainst/Side;", "quantity", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "stop_price", "last_trail_price", "instrument_id", "clearing_firm", "Lcom/robinhood/rosetta/mainst/NullableString;", "legs", "Lcom/robinhood/rosetta/mainst/OrderUpdateLeg;", "response_category", "Lrosetta/order/ResponseCategory;", "update_created_at", "cancel_open_agent", "Lrosetta/order/Agent;", "cancel_close_agent", "last_trail_price_with_collar", "is_heartbeat", "", "last_sent_at", "mainst_shard_id", "order_created_service", "Lrosetta/order/ClientService;", "created_affiliate", "Lcom/robinhood/rosetta/i18n/Affiliate;", "service_shard_id", "Lcom/robinhood/rosetta/mainst/NullableInt;", "created_agent", "time_in_force", "Lrosetta/mainst/TimeInForce;", "instrument_type", "Lrosetta/mainst/InstrumentType;", "peg_type", "Lrosetta/order/PegType;", "market_hours", "Lrosetta/order/MarketHours;", "response_text", "trigger", "Lrosetta/mainst/OrderTrigger;", "type", "Lrosetta/mainst/OrderType;", "executed_quantity", "fractional_details", "Lcom/robinhood/rosetta/mainst/FractionalOrderDetails;", "ipo_details", "Lcom/robinhood/rosetta/mainst/IPOOrderDetails;", "waiting_category", "Lrosetta/order/WaitingCategory;", "metadata", "Lcom/robinhood/rosetta/mainst/OrderMetadata;", "modifications", "Lcom/robinhood/rosetta/mainst/OrderModification;", "estimated_notional", "cancel_open_time", "cancel_close_time", "symbol", "trailing_peg", "list_root_id", "replacement_order_id", "replaces_order", "Lcom/robinhood/rosetta/mainst/ReplacesOrderDetails;", "notional", "cancelled_notional", "cancel_triggering_time", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lrosetta/order/AccountType;", "leverage", "reduce_only", "Lcom/robinhood/rosetta/mainst/NullableBool;", "bulk_event_id", "currency_denomination", "Lrosetta/order/CurrencyDenomination;", "margin_mode_v2", "Lrosetta/mainst/MarginMode;", "position_effect", "Lrosetta/mainst/PositionEffect;", "position_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/OrderState;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Ljava/util/List;ILrosetta/mainst/Route;Ljava/lang/String;Lrosetta/mainst/Side;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/NullableString;Ljava/util/List;Lrosetta/order/ResponseCategory;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/Agent;Lrosetta/order/Agent;Lcom/robinhood/rosetta/mainst/Decimal;ZLcom/robinhood/rosetta/mainst/Time;Ljava/lang/String;Lrosetta/order/ClientService;Lcom/robinhood/rosetta/i18n/Affiliate;Lcom/robinhood/rosetta/mainst/NullableInt;Lrosetta/order/Agent;Lrosetta/mainst/TimeInForce;Lrosetta/mainst/InstrumentType;Lrosetta/order/PegType;Lrosetta/order/MarketHours;Lcom/robinhood/rosetta/mainst/NullableString;Lrosetta/mainst/OrderTrigger;Lrosetta/mainst/OrderType;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/FractionalOrderDetails;Lcom/robinhood/rosetta/mainst/IPOOrderDetails;Lrosetta/order/WaitingCategory;Lcom/robinhood/rosetta/mainst/OrderMetadata;Ljava/util/List;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/ReplacesOrderDetails;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/order/AccountType;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableBool;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/order/CurrencyDenomination;Lrosetta/mainst/MarginMode;Lrosetta/mainst/PositionEffect;Lcom/robinhood/rosetta/mainst/NullableString;Lokio/ByteString;)V", "getId", "()Lcom/robinhood/rosetta/mainst/UUID;", "getOrder_id", "getState", "()Lrosetta/mainst/OrderState;", "getCancelled_quantity", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getCreated_at", "()Lcom/robinhood/rosetta/mainst/Time;", "getLast_transaction_at", "getStop_triggered_at", "getVersion", "()I", "getRoute", "()Lrosetta/mainst/Route;", "getAccount_number", "()Ljava/lang/String;", "getSide", "()Lrosetta/mainst/Side;", "getQuantity", "getPrice", "getStop_price", "getLast_trail_price", "getInstrument_id", "getClearing_firm", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getResponse_category", "()Lrosetta/order/ResponseCategory;", "getUpdate_created_at", "getCancel_open_agent", "()Lrosetta/order/Agent;", "getCancel_close_agent", "getLast_trail_price_with_collar", "is_heartbeat$annotations", "()V", "()Z", "getLast_sent_at", "getMainst_shard_id", "getOrder_created_service", "()Lrosetta/order/ClientService;", "getCreated_affiliate", "()Lcom/robinhood/rosetta/i18n/Affiliate;", "getService_shard_id", "()Lcom/robinhood/rosetta/mainst/NullableInt;", "getCreated_agent", "getTime_in_force", "()Lrosetta/mainst/TimeInForce;", "getInstrument_type", "()Lrosetta/mainst/InstrumentType;", "getPeg_type", "()Lrosetta/order/PegType;", "getMarket_hours", "()Lrosetta/order/MarketHours;", "getResponse_text", "getTrigger", "()Lrosetta/mainst/OrderTrigger;", "getType", "()Lrosetta/mainst/OrderType;", "getExecuted_quantity", "getFractional_details", "()Lcom/robinhood/rosetta/mainst/FractionalOrderDetails;", "getIpo_details", "()Lcom/robinhood/rosetta/mainst/IPOOrderDetails;", "getWaiting_category", "()Lrosetta/order/WaitingCategory;", "getMetadata", "()Lcom/robinhood/rosetta/mainst/OrderMetadata;", "getEstimated_notional", "getCancel_open_time", "getCancel_close_time", "getSymbol", "getTrailing_peg", "getList_root_id", "getReplacement_order_id", "getReplaces_order", "()Lcom/robinhood/rosetta/mainst/ReplacesOrderDetails;", "getNotional", "getCancelled_notional", "getCancel_triggering_time", "getAccount_type", "()Lrosetta/order/AccountType;", "getLeverage", "getReduce_only", "()Lcom/robinhood/rosetta/mainst/NullableBool;", "getBulk_event_id", "getCurrency_denomination", "()Lrosetta/order/CurrencyDenomination;", "getMargin_mode_v2", "()Lrosetta/mainst/MarginMode;", "getPosition_effect", "()Lrosetta/mainst/PositionEffect;", "getPosition_id", "getExecutions", "()Ljava/util/List;", "getLegs", "getModifications", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderUpdate extends Message {

    @JvmField
    public static final ProtoAdapter<OrderUpdate> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String account_number;

    @WireField(adapter = "rosetta.order.AccountType#ADAPTER", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 55, tag = 58)
    private final AccountType account_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "bulkEventId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 58, tag = 62)
    private final UUID bulk_event_id;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelCloseAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final Agent cancel_close_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelCloseTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 46, tag = 49)
    private final Time cancel_close_time;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "cancelOpenAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final Agent cancel_open_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelOpenTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 45, tag = 48)
    private final Time cancel_open_time;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "cancelTriggeringTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 54, tag = 57)
    private final Time cancel_triggering_time;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "cancelledNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 53, tag = 56)
    private final Decimal cancelled_notional;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "cancelledQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Decimal cancelled_quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "clearingFirm", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final NullableString clearing_firm;

    @WireField(adapter = "com.robinhood.rosetta.i18n.Affiliate#ADAPTER", jsonName = "createdAffiliate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 30)
    private final Affiliate created_affiliate;

    @WireField(adapter = "rosetta.order.Agent#ADAPTER", jsonName = "createdAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 32)
    private final Agent created_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time created_at;

    @WireField(adapter = "rosetta.order.CurrencyDenomination#ADAPTER", jsonName = "currencyDenomination", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 59, tag = 63)
    private final CurrencyDenomination currency_denomination;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "estimatedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 44, tag = 47)
    private final Decimal estimated_notional;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "executedQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 43)
    private final Decimal executed_quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderUpdateExecution#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    private final List<OrderUpdateExecution> executions;

    @WireField(adapter = "com.robinhood.rosetta.mainst.FractionalOrderDetails#ADAPTER", jsonName = "fractionalDetails", oneofName = "ExtraDetails", schemaIndex = 39, tag = 38)
    private final FractionalOrderDetails fractional_details;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final UUID instrument_id;

    @WireField(adapter = "rosetta.mainst.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 35)
    private final InstrumentType instrument_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.IPOOrderDetails#ADAPTER", jsonName = "ipoDetails", oneofName = "ExtraDetails", schemaIndex = 40, tag = 39)
    private final IPOOrderDetails ipo_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isHeartbeat", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final boolean is_heartbeat;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "lastSentAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final Time last_sent_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "lastTrailPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final Decimal last_trail_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "lastTrailPriceWithCollar", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final Decimal last_trail_price_with_collar;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "lastTransactionAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Time last_transaction_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderUpdateLeg#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 18, tag = 19)
    private final List<OrderUpdateLeg> legs;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 56, tag = 60)
    private final Decimal leverage;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "listRootId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 49, tag = 52)
    private final UUID list_root_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mainstShardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final String mainst_shard_id;

    @WireField(adapter = "rosetta.mainst.MarginMode#ADAPTER", jsonName = "marginModeV2", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 60, tag = 64)
    private final MarginMode margin_mode_v2;

    @WireField(adapter = "rosetta.order.MarketHours#ADAPTER", jsonName = "marketHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 37)
    private final MarketHours market_hours;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderMetadata#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 45)
    private final OrderMetadata metadata;

    @WireField(adapter = "com.robinhood.rosetta.mainst.OrderModification#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 43, tag = 46)
    private final List<OrderModification> modifications;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 52, tag = 55)
    private final Decimal notional;

    @WireField(adapter = "rosetta.order.ClientService#ADAPTER", jsonName = "orderCreatedService", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 29)
    private final ClientService order_created_service;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID order_id;

    @WireField(adapter = "rosetta.order.PegType#ADAPTER", jsonName = "pegType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 36)
    private final PegType peg_type;

    @WireField(adapter = "rosetta.mainst.PositionEffect#ADAPTER", jsonName = "positionEffect", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 61, tag = 65)
    private final PositionEffect position_effect;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 62, tag = 66)
    private final NullableString position_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final Decimal quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableBool#ADAPTER", jsonName = "reduceOnly", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 57, tag = 61)
    private final NullableBool reduce_only;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "replacementOrderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 50, tag = 53)
    private final UUID replacement_order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ReplacesOrderDetails#ADAPTER", jsonName = "replacesOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 51, tag = 54)
    private final ReplacesOrderDetails replaces_order;

    @WireField(adapter = "rosetta.order.ResponseCategory#ADAPTER", jsonName = "responseCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final ResponseCategory response_category;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "responseText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 40)
    private final NullableString response_text;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableInt#ADAPTER", jsonName = "serviceShardId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 31)
    private final NullableInt service_shard_id;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Side side;

    @WireField(adapter = "rosetta.mainst.OrderState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final OrderState state;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "stopPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final Decimal stop_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "stopTriggeredAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Time stop_triggered_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 47, tag = 50)
    private final String symbol;

    @WireField(adapter = "rosetta.mainst.TimeInForce#ADAPTER", jsonName = "timeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 34)
    private final TimeInForce time_in_force;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "trailingPeg", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 48, tag = 51)
    private final Decimal trailing_peg;

    @WireField(adapter = "rosetta.mainst.OrderTrigger#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 41)
    private final OrderTrigger trigger;

    @WireField(adapter = "rosetta.mainst.OrderType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 42)
    private final OrderType type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "updateCreatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final Time update_created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final int version;

    @WireField(adapter = "rosetta.order.WaitingCategory#ADAPTER", jsonName = "waitingCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 44)
    private final WaitingCategory waiting_category;

    public OrderUpdate() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, null);
    }

    @Deprecated
    public static /* synthetic */ void is_heartbeat$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24693newBuilder();
    }

    public final UUID getId() {
        return this.id;
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final OrderState getState() {
        return this.state;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderUpdate(UUID uuid, UUID uuid2, OrderState orderState, Decimal decimal, Time time, Time time2, Time time3, List list, int i, Route route, String str, Side side, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, UUID uuid3, NullableString nullableString, List list2, ResponseCategory responseCategory, Time time4, Agent agent, Agent agent2, Decimal decimal6, boolean z, Time time5, String str2, ClientService clientService, Affiliate affiliate, NullableInt nullableInt, Agent agent3, TimeInForce timeInForce, InstrumentType instrumentType, PegType pegType, MarketHours marketHours, NullableString nullableString2, OrderTrigger orderTrigger, OrderType orderType, Decimal decimal7, FractionalOrderDetails fractionalOrderDetails, IPOOrderDetails iPOOrderDetails, WaitingCategory waitingCategory, OrderMetadata orderMetadata, List list3, Decimal decimal8, Time time6, Time time7, String str3, Decimal decimal9, UUID uuid4, UUID uuid5, ReplacesOrderDetails replacesOrderDetails, Decimal decimal10, Decimal decimal11, Time time8, AccountType accountType, Decimal decimal12, NullableBool nullableBool, UUID uuid6, CurrencyDenomination currencyDenomination, MarginMode marginMode, PositionEffect positionEffect, NullableString nullableString3, ByteString byteString, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        UUID uuid7 = (i2 & 1) != 0 ? null : uuid;
        this(uuid7, (i2 & 2) != 0 ? null : uuid2, (i2 & 4) != 0 ? OrderState.ORDER_STATE_UNSPECIFIED : orderState, (i2 & 8) != 0 ? null : decimal, (i2 & 16) != 0 ? null : time, (i2 & 32) != 0 ? null : time2, (i2 & 64) != 0 ? null : time3, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list, (i2 & 256) != 0 ? 0 : i, (i2 & 512) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i2 & 1024) != 0 ? "" : str, (i2 & 2048) != 0 ? Side.SIDE_UNSPECIFIED : side, (i2 & 4096) != 0 ? null : decimal2, (i2 & 8192) != 0 ? null : decimal3, (i2 & 16384) != 0 ? null : decimal4, (i2 & 32768) != 0 ? null : decimal5, (i2 & 65536) != 0 ? null : uuid3, (i2 & 131072) != 0 ? null : nullableString, (i2 & 262144) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 524288) != 0 ? ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED : responseCategory, (i2 & 1048576) != 0 ? null : time4, (i2 & 2097152) != 0 ? Agent.AGENT_UNSPECIFIED : agent, (i2 & 4194304) != 0 ? Agent.AGENT_UNSPECIFIED : agent2, (i2 & 8388608) != 0 ? null : decimal6, (i2 & 16777216) != 0 ? false : z, (i2 & 33554432) != 0 ? null : time5, (i2 & 67108864) != 0 ? "" : str2, (i2 & 134217728) != 0 ? ClientService.CLIENT_SERVICE_UNSPECIFIED : clientService, (i2 & 268435456) != 0 ? Affiliate.AFFILIATE_UNSPECIFIED : affiliate, (i2 & 536870912) != 0 ? null : nullableInt, (i2 & 1073741824) != 0 ? Agent.AGENT_UNSPECIFIED : agent3, (i2 & Integer.MIN_VALUE) != 0 ? TimeInForce.TIME_IN_FORCE_UNSPECIFIED : timeInForce, (i3 & 1) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i3 & 2) != 0 ? PegType.PEG_TYPE_UNSPECIFIED : pegType, (i3 & 4) != 0 ? MarketHours.MARKET_HOURS_UNSPECIFIED : marketHours, (i3 & 8) != 0 ? null : nullableString2, (i3 & 16) != 0 ? OrderTrigger.ORDER_TRIGGER_UNSPECIFIED : orderTrigger, (i3 & 32) != 0 ? OrderType.ORDER_TYPE_UNSPECIFIED : orderType, (i3 & 64) != 0 ? null : decimal7, (i3 & 128) != 0 ? null : fractionalOrderDetails, (i3 & 256) != 0 ? null : iPOOrderDetails, (i3 & 512) != 0 ? WaitingCategory.WAITING_CATEGORY_UNSPECIFIED : waitingCategory, (i3 & 1024) != 0 ? null : orderMetadata, (i3 & 2048) != 0 ? CollectionsKt.emptyList() : list3, (i3 & 4096) != 0 ? null : decimal8, (i3 & 8192) != 0 ? null : time6, (i3 & 16384) != 0 ? null : time7, (i3 & 32768) == 0 ? str3 : "", (i3 & 65536) != 0 ? null : decimal9, (i3 & 131072) != 0 ? null : uuid4, (i3 & 262144) != 0 ? null : uuid5, (i3 & 524288) != 0 ? null : replacesOrderDetails, (i3 & 1048576) != 0 ? null : decimal10, (i3 & 2097152) != 0 ? null : decimal11, (i3 & 4194304) != 0 ? null : time8, (i3 & 8388608) != 0 ? AccountType.ACCOUNT_TYPE_UNSPECIFIED : accountType, (i3 & 16777216) != 0 ? null : decimal12, (i3 & 33554432) != 0 ? null : nullableBool, (i3 & 67108864) != 0 ? null : uuid6, (i3 & 134217728) != 0 ? CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED : currencyDenomination, (i3 & 268435456) != 0 ? MarginMode.MARGIN_MODE_UNSPECIFIED : marginMode, (i3 & 536870912) != 0 ? PositionEffect.POSITION_EFFECT_UNSPECIFIED : positionEffect, (i3 & 1073741824) != 0 ? null : nullableString3, (i3 & Integer.MIN_VALUE) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Decimal getCancelled_quantity() {
        return this.cancelled_quantity;
    }

    public final Time getCreated_at() {
        return this.created_at;
    }

    public final Time getLast_transaction_at() {
        return this.last_transaction_at;
    }

    public final Time getStop_triggered_at() {
        return this.stop_triggered_at;
    }

    public final int getVersion() {
        return this.version;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final Side getSide() {
        return this.side;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Decimal getStop_price() {
        return this.stop_price;
    }

    public final Decimal getLast_trail_price() {
        return this.last_trail_price;
    }

    public final UUID getInstrument_id() {
        return this.instrument_id;
    }

    public final NullableString getClearing_firm() {
        return this.clearing_firm;
    }

    public final ResponseCategory getResponse_category() {
        return this.response_category;
    }

    public final Time getUpdate_created_at() {
        return this.update_created_at;
    }

    public final Agent getCancel_open_agent() {
        return this.cancel_open_agent;
    }

    public final Agent getCancel_close_agent() {
        return this.cancel_close_agent;
    }

    public final Decimal getLast_trail_price_with_collar() {
        return this.last_trail_price_with_collar;
    }

    /* renamed from: is_heartbeat, reason: from getter */
    public final boolean getIs_heartbeat() {
        return this.is_heartbeat;
    }

    public final Time getLast_sent_at() {
        return this.last_sent_at;
    }

    public final String getMainst_shard_id() {
        return this.mainst_shard_id;
    }

    public final ClientService getOrder_created_service() {
        return this.order_created_service;
    }

    public final Affiliate getCreated_affiliate() {
        return this.created_affiliate;
    }

    public final NullableInt getService_shard_id() {
        return this.service_shard_id;
    }

    public final Agent getCreated_agent() {
        return this.created_agent;
    }

    public final TimeInForce getTime_in_force() {
        return this.time_in_force;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    public final PegType getPeg_type() {
        return this.peg_type;
    }

    public final MarketHours getMarket_hours() {
        return this.market_hours;
    }

    public final NullableString getResponse_text() {
        return this.response_text;
    }

    public final OrderTrigger getTrigger() {
        return this.trigger;
    }

    public final OrderType getType() {
        return this.type;
    }

    public final Decimal getExecuted_quantity() {
        return this.executed_quantity;
    }

    public final FractionalOrderDetails getFractional_details() {
        return this.fractional_details;
    }

    public final IPOOrderDetails getIpo_details() {
        return this.ipo_details;
    }

    public final WaitingCategory getWaiting_category() {
        return this.waiting_category;
    }

    public final OrderMetadata getMetadata() {
        return this.metadata;
    }

    public final Decimal getEstimated_notional() {
        return this.estimated_notional;
    }

    public final Time getCancel_open_time() {
        return this.cancel_open_time;
    }

    public final Time getCancel_close_time() {
        return this.cancel_close_time;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final Decimal getTrailing_peg() {
        return this.trailing_peg;
    }

    public final UUID getList_root_id() {
        return this.list_root_id;
    }

    public final UUID getReplacement_order_id() {
        return this.replacement_order_id;
    }

    public final ReplacesOrderDetails getReplaces_order() {
        return this.replaces_order;
    }

    public final Decimal getNotional() {
        return this.notional;
    }

    public final Decimal getCancelled_notional() {
        return this.cancelled_notional;
    }

    public final Time getCancel_triggering_time() {
        return this.cancel_triggering_time;
    }

    public final AccountType getAccount_type() {
        return this.account_type;
    }

    public final Decimal getLeverage() {
        return this.leverage;
    }

    public final NullableBool getReduce_only() {
        return this.reduce_only;
    }

    public final UUID getBulk_event_id() {
        return this.bulk_event_id;
    }

    public final CurrencyDenomination getCurrency_denomination() {
        return this.currency_denomination;
    }

    public final MarginMode getMargin_mode_v2() {
        return this.margin_mode_v2;
    }

    public final PositionEffect getPosition_effect() {
        return this.position_effect;
    }

    public final NullableString getPosition_id() {
        return this.position_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderUpdate(UUID uuid, UUID uuid2, OrderState state, Decimal decimal, Time time, Time time2, Time time3, List<OrderUpdateExecution> executions, int i, Route route, String account_number, Side side, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, UUID uuid3, NullableString nullableString, List<OrderUpdateLeg> legs, ResponseCategory response_category, Time time4, Agent cancel_open_agent, Agent cancel_close_agent, Decimal decimal6, boolean z, Time time5, String mainst_shard_id, ClientService order_created_service, Affiliate created_affiliate, NullableInt nullableInt, Agent created_agent, TimeInForce time_in_force, InstrumentType instrument_type, PegType peg_type, MarketHours market_hours, NullableString nullableString2, OrderTrigger trigger, OrderType type2, Decimal decimal7, FractionalOrderDetails fractionalOrderDetails, IPOOrderDetails iPOOrderDetails, WaitingCategory waiting_category, OrderMetadata orderMetadata, List<OrderModification> modifications, Decimal decimal8, Time time6, Time time7, String symbol, Decimal decimal9, UUID uuid4, UUID uuid5, ReplacesOrderDetails replacesOrderDetails, Decimal decimal10, Decimal decimal11, Time time8, AccountType account_type, Decimal decimal12, NullableBool nullableBool, UUID uuid6, CurrencyDenomination currency_denomination, MarginMode margin_mode_v2, PositionEffect position_effect, NullableString nullableString3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = uuid;
        this.order_id = uuid2;
        this.state = state;
        this.cancelled_quantity = decimal;
        this.created_at = time;
        this.last_transaction_at = time2;
        this.stop_triggered_at = time3;
        this.version = i;
        this.route = route;
        this.account_number = account_number;
        this.side = side;
        this.quantity = decimal2;
        this.price = decimal3;
        this.stop_price = decimal4;
        this.last_trail_price = decimal5;
        this.instrument_id = uuid3;
        this.clearing_firm = nullableString;
        this.response_category = response_category;
        this.update_created_at = time4;
        this.cancel_open_agent = cancel_open_agent;
        this.cancel_close_agent = cancel_close_agent;
        this.last_trail_price_with_collar = decimal6;
        this.is_heartbeat = z;
        this.last_sent_at = time5;
        this.mainst_shard_id = mainst_shard_id;
        this.order_created_service = order_created_service;
        this.created_affiliate = created_affiliate;
        this.service_shard_id = nullableInt;
        this.created_agent = created_agent;
        this.time_in_force = time_in_force;
        this.instrument_type = instrument_type;
        this.peg_type = peg_type;
        this.market_hours = market_hours;
        this.response_text = nullableString2;
        this.trigger = trigger;
        this.type = type2;
        this.executed_quantity = decimal7;
        this.fractional_details = fractionalOrderDetails;
        this.ipo_details = iPOOrderDetails;
        this.waiting_category = waiting_category;
        this.metadata = orderMetadata;
        this.estimated_notional = decimal8;
        this.cancel_open_time = time6;
        this.cancel_close_time = time7;
        this.symbol = symbol;
        this.trailing_peg = decimal9;
        this.list_root_id = uuid4;
        this.replacement_order_id = uuid5;
        this.replaces_order = replacesOrderDetails;
        this.notional = decimal10;
        this.cancelled_notional = decimal11;
        this.cancel_triggering_time = time8;
        this.account_type = account_type;
        this.leverage = decimal12;
        this.reduce_only = nullableBool;
        this.bulk_event_id = uuid6;
        this.currency_denomination = currency_denomination;
        this.margin_mode_v2 = margin_mode_v2;
        this.position_effect = position_effect;
        this.position_id = nullableString3;
        this.executions = Internal.immutableCopyOf("executions", executions);
        this.legs = Internal.immutableCopyOf("legs", legs);
        this.modifications = Internal.immutableCopyOf("modifications", modifications);
        if (Internal.countNonNull(fractionalOrderDetails, iPOOrderDetails) > 1) {
            throw new IllegalArgumentException("At most one of fractional_details, ipo_details may be non-null");
        }
    }

    public final List<OrderUpdateExecution> getExecutions() {
        return this.executions;
    }

    public final List<OrderUpdateLeg> getLegs() {
        return this.legs;
    }

    public final List<OrderModification> getModifications() {
        return this.modifications;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24693newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrderUpdate)) {
            return false;
        }
        OrderUpdate orderUpdate = (OrderUpdate) other;
        return Intrinsics.areEqual(unknownFields(), orderUpdate.unknownFields()) && Intrinsics.areEqual(this.id, orderUpdate.id) && Intrinsics.areEqual(this.order_id, orderUpdate.order_id) && this.state == orderUpdate.state && Intrinsics.areEqual(this.cancelled_quantity, orderUpdate.cancelled_quantity) && Intrinsics.areEqual(this.created_at, orderUpdate.created_at) && Intrinsics.areEqual(this.last_transaction_at, orderUpdate.last_transaction_at) && Intrinsics.areEqual(this.stop_triggered_at, orderUpdate.stop_triggered_at) && Intrinsics.areEqual(this.executions, orderUpdate.executions) && this.version == orderUpdate.version && this.route == orderUpdate.route && Intrinsics.areEqual(this.account_number, orderUpdate.account_number) && this.side == orderUpdate.side && Intrinsics.areEqual(this.quantity, orderUpdate.quantity) && Intrinsics.areEqual(this.price, orderUpdate.price) && Intrinsics.areEqual(this.stop_price, orderUpdate.stop_price) && Intrinsics.areEqual(this.last_trail_price, orderUpdate.last_trail_price) && Intrinsics.areEqual(this.instrument_id, orderUpdate.instrument_id) && Intrinsics.areEqual(this.clearing_firm, orderUpdate.clearing_firm) && Intrinsics.areEqual(this.legs, orderUpdate.legs) && this.response_category == orderUpdate.response_category && Intrinsics.areEqual(this.update_created_at, orderUpdate.update_created_at) && this.cancel_open_agent == orderUpdate.cancel_open_agent && this.cancel_close_agent == orderUpdate.cancel_close_agent && Intrinsics.areEqual(this.last_trail_price_with_collar, orderUpdate.last_trail_price_with_collar) && this.is_heartbeat == orderUpdate.is_heartbeat && Intrinsics.areEqual(this.last_sent_at, orderUpdate.last_sent_at) && Intrinsics.areEqual(this.mainst_shard_id, orderUpdate.mainst_shard_id) && this.order_created_service == orderUpdate.order_created_service && this.created_affiliate == orderUpdate.created_affiliate && Intrinsics.areEqual(this.service_shard_id, orderUpdate.service_shard_id) && this.created_agent == orderUpdate.created_agent && this.time_in_force == orderUpdate.time_in_force && this.instrument_type == orderUpdate.instrument_type && this.peg_type == orderUpdate.peg_type && this.market_hours == orderUpdate.market_hours && Intrinsics.areEqual(this.response_text, orderUpdate.response_text) && this.trigger == orderUpdate.trigger && this.type == orderUpdate.type && Intrinsics.areEqual(this.executed_quantity, orderUpdate.executed_quantity) && Intrinsics.areEqual(this.fractional_details, orderUpdate.fractional_details) && Intrinsics.areEqual(this.ipo_details, orderUpdate.ipo_details) && this.waiting_category == orderUpdate.waiting_category && Intrinsics.areEqual(this.metadata, orderUpdate.metadata) && Intrinsics.areEqual(this.modifications, orderUpdate.modifications) && Intrinsics.areEqual(this.estimated_notional, orderUpdate.estimated_notional) && Intrinsics.areEqual(this.cancel_open_time, orderUpdate.cancel_open_time) && Intrinsics.areEqual(this.cancel_close_time, orderUpdate.cancel_close_time) && Intrinsics.areEqual(this.symbol, orderUpdate.symbol) && Intrinsics.areEqual(this.trailing_peg, orderUpdate.trailing_peg) && Intrinsics.areEqual(this.list_root_id, orderUpdate.list_root_id) && Intrinsics.areEqual(this.replacement_order_id, orderUpdate.replacement_order_id) && Intrinsics.areEqual(this.replaces_order, orderUpdate.replaces_order) && Intrinsics.areEqual(this.notional, orderUpdate.notional) && Intrinsics.areEqual(this.cancelled_notional, orderUpdate.cancelled_notional) && Intrinsics.areEqual(this.cancel_triggering_time, orderUpdate.cancel_triggering_time) && this.account_type == orderUpdate.account_type && Intrinsics.areEqual(this.leverage, orderUpdate.leverage) && Intrinsics.areEqual(this.reduce_only, orderUpdate.reduce_only) && Intrinsics.areEqual(this.bulk_event_id, orderUpdate.bulk_event_id) && this.currency_denomination == orderUpdate.currency_denomination && this.margin_mode_v2 == orderUpdate.margin_mode_v2 && this.position_effect == orderUpdate.position_effect && Intrinsics.areEqual(this.position_id, orderUpdate.position_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.order_id;
        int iHashCode3 = (((iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37) + this.state.hashCode()) * 37;
        Decimal decimal = this.cancelled_quantity;
        int iHashCode4 = (iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Time time = this.created_at;
        int iHashCode5 = (iHashCode4 + (time != null ? time.hashCode() : 0)) * 37;
        Time time2 = this.last_transaction_at;
        int iHashCode6 = (iHashCode5 + (time2 != null ? time2.hashCode() : 0)) * 37;
        Time time3 = this.stop_triggered_at;
        int iHashCode7 = (((((((((((iHashCode6 + (time3 != null ? time3.hashCode() : 0)) * 37) + this.executions.hashCode()) * 37) + Integer.hashCode(this.version)) * 37) + this.route.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.side.hashCode()) * 37;
        Decimal decimal2 = this.quantity;
        int iHashCode8 = (iHashCode7 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.price;
        int iHashCode9 = (iHashCode8 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.stop_price;
        int iHashCode10 = (iHashCode9 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37;
        Decimal decimal5 = this.last_trail_price;
        int iHashCode11 = (iHashCode10 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        UUID uuid3 = this.instrument_id;
        int iHashCode12 = (iHashCode11 + (uuid3 != null ? uuid3.hashCode() : 0)) * 37;
        NullableString nullableString = this.clearing_firm;
        int iHashCode13 = (((((iHashCode12 + (nullableString != null ? nullableString.hashCode() : 0)) * 37) + this.legs.hashCode()) * 37) + this.response_category.hashCode()) * 37;
        Time time4 = this.update_created_at;
        int iHashCode14 = (((((iHashCode13 + (time4 != null ? time4.hashCode() : 0)) * 37) + this.cancel_open_agent.hashCode()) * 37) + this.cancel_close_agent.hashCode()) * 37;
        Decimal decimal6 = this.last_trail_price_with_collar;
        int iHashCode15 = (((iHashCode14 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_heartbeat)) * 37;
        Time time5 = this.last_sent_at;
        int iHashCode16 = (((((((iHashCode15 + (time5 != null ? time5.hashCode() : 0)) * 37) + this.mainst_shard_id.hashCode()) * 37) + this.order_created_service.hashCode()) * 37) + this.created_affiliate.hashCode()) * 37;
        NullableInt nullableInt = this.service_shard_id;
        int iHashCode17 = (((((((((((iHashCode16 + (nullableInt != null ? nullableInt.hashCode() : 0)) * 37) + this.created_agent.hashCode()) * 37) + this.time_in_force.hashCode()) * 37) + this.instrument_type.hashCode()) * 37) + this.peg_type.hashCode()) * 37) + this.market_hours.hashCode()) * 37;
        NullableString nullableString2 = this.response_text;
        int iHashCode18 = (((((iHashCode17 + (nullableString2 != null ? nullableString2.hashCode() : 0)) * 37) + this.trigger.hashCode()) * 37) + this.type.hashCode()) * 37;
        Decimal decimal7 = this.executed_quantity;
        int iHashCode19 = (iHashCode18 + (decimal7 != null ? decimal7.hashCode() : 0)) * 37;
        FractionalOrderDetails fractionalOrderDetails = this.fractional_details;
        int iHashCode20 = (iHashCode19 + (fractionalOrderDetails != null ? fractionalOrderDetails.hashCode() : 0)) * 37;
        IPOOrderDetails iPOOrderDetails = this.ipo_details;
        int iHashCode21 = (((iHashCode20 + (iPOOrderDetails != null ? iPOOrderDetails.hashCode() : 0)) * 37) + this.waiting_category.hashCode()) * 37;
        OrderMetadata orderMetadata = this.metadata;
        int iHashCode22 = (((iHashCode21 + (orderMetadata != null ? orderMetadata.hashCode() : 0)) * 37) + this.modifications.hashCode()) * 37;
        Decimal decimal8 = this.estimated_notional;
        int iHashCode23 = (iHashCode22 + (decimal8 != null ? decimal8.hashCode() : 0)) * 37;
        Time time6 = this.cancel_open_time;
        int iHashCode24 = (iHashCode23 + (time6 != null ? time6.hashCode() : 0)) * 37;
        Time time7 = this.cancel_close_time;
        int iHashCode25 = (((iHashCode24 + (time7 != null ? time7.hashCode() : 0)) * 37) + this.symbol.hashCode()) * 37;
        Decimal decimal9 = this.trailing_peg;
        int iHashCode26 = (iHashCode25 + (decimal9 != null ? decimal9.hashCode() : 0)) * 37;
        UUID uuid4 = this.list_root_id;
        int iHashCode27 = (iHashCode26 + (uuid4 != null ? uuid4.hashCode() : 0)) * 37;
        UUID uuid5 = this.replacement_order_id;
        int iHashCode28 = (iHashCode27 + (uuid5 != null ? uuid5.hashCode() : 0)) * 37;
        ReplacesOrderDetails replacesOrderDetails = this.replaces_order;
        int iHashCode29 = (iHashCode28 + (replacesOrderDetails != null ? replacesOrderDetails.hashCode() : 0)) * 37;
        Decimal decimal10 = this.notional;
        int iHashCode30 = (iHashCode29 + (decimal10 != null ? decimal10.hashCode() : 0)) * 37;
        Decimal decimal11 = this.cancelled_notional;
        int iHashCode31 = (iHashCode30 + (decimal11 != null ? decimal11.hashCode() : 0)) * 37;
        Time time8 = this.cancel_triggering_time;
        int iHashCode32 = (((iHashCode31 + (time8 != null ? time8.hashCode() : 0)) * 37) + this.account_type.hashCode()) * 37;
        Decimal decimal12 = this.leverage;
        int iHashCode33 = (iHashCode32 + (decimal12 != null ? decimal12.hashCode() : 0)) * 37;
        NullableBool nullableBool = this.reduce_only;
        int iHashCode34 = (iHashCode33 + (nullableBool != null ? nullableBool.hashCode() : 0)) * 37;
        UUID uuid6 = this.bulk_event_id;
        int iHashCode35 = (((((((iHashCode34 + (uuid6 != null ? uuid6.hashCode() : 0)) * 37) + this.currency_denomination.hashCode()) * 37) + this.margin_mode_v2.hashCode()) * 37) + this.position_effect.hashCode()) * 37;
        NullableString nullableString3 = this.position_id;
        int iHashCode36 = iHashCode35 + (nullableString3 != null ? nullableString3.hashCode() : 0);
        this.hashCode = iHashCode36;
        return iHashCode36;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.id;
        if (uuid != null) {
            arrayList.add("id=" + uuid);
        }
        UUID uuid2 = this.order_id;
        if (uuid2 != null) {
            arrayList.add("order_id=" + uuid2);
        }
        arrayList.add("state=" + this.state);
        Decimal decimal = this.cancelled_quantity;
        if (decimal != null) {
            arrayList.add("cancelled_quantity=" + decimal);
        }
        Time time = this.created_at;
        if (time != null) {
            arrayList.add("created_at=" + time);
        }
        Time time2 = this.last_transaction_at;
        if (time2 != null) {
            arrayList.add("last_transaction_at=" + time2);
        }
        Time time3 = this.stop_triggered_at;
        if (time3 != null) {
            arrayList.add("stop_triggered_at=" + time3);
        }
        if (!this.executions.isEmpty()) {
            arrayList.add("executions=" + this.executions);
        }
        arrayList.add("version=" + this.version);
        arrayList.add("route=" + this.route);
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("side=" + this.side);
        Decimal decimal2 = this.quantity;
        if (decimal2 != null) {
            arrayList.add("quantity=" + decimal2);
        }
        Decimal decimal3 = this.price;
        if (decimal3 != null) {
            arrayList.add("price=" + decimal3);
        }
        Decimal decimal4 = this.stop_price;
        if (decimal4 != null) {
            arrayList.add("stop_price=" + decimal4);
        }
        Decimal decimal5 = this.last_trail_price;
        if (decimal5 != null) {
            arrayList.add("last_trail_price=" + decimal5);
        }
        UUID uuid3 = this.instrument_id;
        if (uuid3 != null) {
            arrayList.add("instrument_id=" + uuid3);
        }
        NullableString nullableString = this.clearing_firm;
        if (nullableString != null) {
            arrayList.add("clearing_firm=" + nullableString);
        }
        if (!this.legs.isEmpty()) {
            arrayList.add("legs=" + this.legs);
        }
        arrayList.add("response_category=" + this.response_category);
        Time time4 = this.update_created_at;
        if (time4 != null) {
            arrayList.add("update_created_at=" + time4);
        }
        arrayList.add("cancel_open_agent=" + this.cancel_open_agent);
        arrayList.add("cancel_close_agent=" + this.cancel_close_agent);
        Decimal decimal6 = this.last_trail_price_with_collar;
        if (decimal6 != null) {
            arrayList.add("last_trail_price_with_collar=" + decimal6);
        }
        arrayList.add("is_heartbeat=" + this.is_heartbeat);
        Time time5 = this.last_sent_at;
        if (time5 != null) {
            arrayList.add("last_sent_at=" + time5);
        }
        arrayList.add("mainst_shard_id=" + Internal.sanitize(this.mainst_shard_id));
        arrayList.add("order_created_service=" + this.order_created_service);
        arrayList.add("created_affiliate=" + this.created_affiliate);
        NullableInt nullableInt = this.service_shard_id;
        if (nullableInt != null) {
            arrayList.add("service_shard_id=" + nullableInt);
        }
        arrayList.add("created_agent=" + this.created_agent);
        arrayList.add("time_in_force=" + this.time_in_force);
        arrayList.add("instrument_type=" + this.instrument_type);
        arrayList.add("peg_type=" + this.peg_type);
        arrayList.add("market_hours=" + this.market_hours);
        NullableString nullableString2 = this.response_text;
        if (nullableString2 != null) {
            arrayList.add("response_text=" + nullableString2);
        }
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("type=" + this.type);
        Decimal decimal7 = this.executed_quantity;
        if (decimal7 != null) {
            arrayList.add("executed_quantity=" + decimal7);
        }
        FractionalOrderDetails fractionalOrderDetails = this.fractional_details;
        if (fractionalOrderDetails != null) {
            arrayList.add("fractional_details=" + fractionalOrderDetails);
        }
        IPOOrderDetails iPOOrderDetails = this.ipo_details;
        if (iPOOrderDetails != null) {
            arrayList.add("ipo_details=" + iPOOrderDetails);
        }
        arrayList.add("waiting_category=" + this.waiting_category);
        OrderMetadata orderMetadata = this.metadata;
        if (orderMetadata != null) {
            arrayList.add("metadata=" + orderMetadata);
        }
        if (!this.modifications.isEmpty()) {
            arrayList.add("modifications=" + this.modifications);
        }
        Decimal decimal8 = this.estimated_notional;
        if (decimal8 != null) {
            arrayList.add("estimated_notional=" + decimal8);
        }
        Time time6 = this.cancel_open_time;
        if (time6 != null) {
            arrayList.add("cancel_open_time=" + time6);
        }
        Time time7 = this.cancel_close_time;
        if (time7 != null) {
            arrayList.add("cancel_close_time=" + time7);
        }
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        Decimal decimal9 = this.trailing_peg;
        if (decimal9 != null) {
            arrayList.add("trailing_peg=" + decimal9);
        }
        UUID uuid4 = this.list_root_id;
        if (uuid4 != null) {
            arrayList.add("list_root_id=" + uuid4);
        }
        UUID uuid5 = this.replacement_order_id;
        if (uuid5 != null) {
            arrayList.add("replacement_order_id=" + uuid5);
        }
        ReplacesOrderDetails replacesOrderDetails = this.replaces_order;
        if (replacesOrderDetails != null) {
            arrayList.add("replaces_order=" + replacesOrderDetails);
        }
        Decimal decimal10 = this.notional;
        if (decimal10 != null) {
            arrayList.add("notional=" + decimal10);
        }
        Decimal decimal11 = this.cancelled_notional;
        if (decimal11 != null) {
            arrayList.add("cancelled_notional=" + decimal11);
        }
        Time time8 = this.cancel_triggering_time;
        if (time8 != null) {
            arrayList.add("cancel_triggering_time=" + time8);
        }
        arrayList.add("account_type=" + this.account_type);
        Decimal decimal12 = this.leverage;
        if (decimal12 != null) {
            arrayList.add("leverage=" + decimal12);
        }
        NullableBool nullableBool = this.reduce_only;
        if (nullableBool != null) {
            arrayList.add("reduce_only=" + nullableBool);
        }
        UUID uuid6 = this.bulk_event_id;
        if (uuid6 != null) {
            arrayList.add("bulk_event_id=" + uuid6);
        }
        arrayList.add("currency_denomination=" + this.currency_denomination);
        arrayList.add("margin_mode_v2=" + this.margin_mode_v2);
        arrayList.add("position_effect=" + this.position_effect);
        NullableString nullableString3 = this.position_id;
        if (nullableString3 != null) {
            arrayList.add("position_id=" + nullableString3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OrderUpdate{", "}", 0, null, null, 56, null);
    }

    public final OrderUpdate copy(UUID id, UUID order_id, OrderState state, Decimal cancelled_quantity, Time created_at, Time last_transaction_at, Time stop_triggered_at, List<OrderUpdateExecution> executions, int version, Route route, String account_number, Side side, Decimal quantity, Decimal price, Decimal stop_price, Decimal last_trail_price, UUID instrument_id, NullableString clearing_firm, List<OrderUpdateLeg> legs, ResponseCategory response_category, Time update_created_at, Agent cancel_open_agent, Agent cancel_close_agent, Decimal last_trail_price_with_collar, boolean is_heartbeat, Time last_sent_at, String mainst_shard_id, ClientService order_created_service, Affiliate created_affiliate, NullableInt service_shard_id, Agent created_agent, TimeInForce time_in_force, InstrumentType instrument_type, PegType peg_type, MarketHours market_hours, NullableString response_text, OrderTrigger trigger, OrderType type2, Decimal executed_quantity, FractionalOrderDetails fractional_details, IPOOrderDetails ipo_details, WaitingCategory waiting_category, OrderMetadata metadata, List<OrderModification> modifications, Decimal estimated_notional, Time cancel_open_time, Time cancel_close_time, String symbol, Decimal trailing_peg, UUID list_root_id, UUID replacement_order_id, ReplacesOrderDetails replaces_order, Decimal notional, Decimal cancelled_notional, Time cancel_triggering_time, AccountType account_type, Decimal leverage, NullableBool reduce_only, UUID bulk_event_id, CurrencyDenomination currency_denomination, MarginMode margin_mode_v2, PositionEffect position_effect, NullableString position_id, ByteString unknownFields) {
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
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OrderUpdate(id, order_id, state, cancelled_quantity, created_at, last_transaction_at, stop_triggered_at, executions, version, route, account_number, side, quantity, price, stop_price, last_trail_price, instrument_id, clearing_firm, legs, response_category, update_created_at, cancel_open_agent, cancel_close_agent, last_trail_price_with_collar, is_heartbeat, last_sent_at, mainst_shard_id, order_created_service, created_affiliate, service_shard_id, created_agent, time_in_force, instrument_type, peg_type, market_hours, response_text, trigger, type2, executed_quantity, fractional_details, ipo_details, waiting_category, metadata, modifications, estimated_notional, cancel_open_time, cancel_close_time, symbol, trailing_peg, list_root_id, replacement_order_id, replaces_order, notional, cancelled_notional, cancel_triggering_time, account_type, leverage, reduce_only, bulk_event_id, currency_denomination, margin_mode_v2, position_effect, position_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderUpdate.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OrderUpdate>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.OrderUpdate$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OrderUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getId());
                }
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getOrder_id());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    size += OrderState.ADAPTER.encodedSizeWithTag(3, value.getState());
                }
                if (value.getCancelled_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getCancelled_quantity());
                }
                if (value.getCreated_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getCreated_at());
                }
                if (value.getLast_transaction_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(6, value.getLast_transaction_at());
                }
                if (value.getStop_triggered_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(7, value.getStop_triggered_at());
                }
                int iEncodedSizeWithTag = size + OrderUpdateExecution.ADAPTER.asRepeated().encodedSizeWithTag(8, value.getExecutions());
                if (value.getVersion() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getVersion()));
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    iEncodedSizeWithTag += Route.ADAPTER.encodedSizeWithTag(10, value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getAccount_number());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    iEncodedSizeWithTag += Side.ADAPTER.encodedSizeWithTag(12, value.getSide());
                }
                if (value.getQuantity() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(13, value.getQuantity());
                }
                if (value.getPrice() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(14, value.getPrice());
                }
                if (value.getStop_price() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(15, value.getStop_price());
                }
                if (value.getLast_trail_price() != null) {
                    iEncodedSizeWithTag += Decimal.ADAPTER.encodedSizeWithTag(16, value.getLast_trail_price());
                }
                if (value.getInstrument_id() != null) {
                    iEncodedSizeWithTag += UUID.ADAPTER.encodedSizeWithTag(17, value.getInstrument_id());
                }
                if (value.getClearing_firm() != null) {
                    iEncodedSizeWithTag += NullableString.ADAPTER.encodedSizeWithTag(18, value.getClearing_firm());
                }
                int iEncodedSizeWithTag2 = iEncodedSizeWithTag + OrderUpdateLeg.ADAPTER.asRepeated().encodedSizeWithTag(19, value.getLegs());
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += ResponseCategory.ADAPTER.encodedSizeWithTag(20, value.getResponse_category());
                }
                if (value.getUpdate_created_at() != null) {
                    iEncodedSizeWithTag2 += Time.ADAPTER.encodedSizeWithTag(21, value.getUpdate_created_at());
                }
                Agent cancel_open_agent = value.getCancel_open_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (cancel_open_agent != agent) {
                    iEncodedSizeWithTag2 += Agent.ADAPTER.encodedSizeWithTag(22, value.getCancel_open_agent());
                }
                if (value.getCancel_close_agent() != agent) {
                    iEncodedSizeWithTag2 += Agent.ADAPTER.encodedSizeWithTag(23, value.getCancel_close_agent());
                }
                if (value.getLast_trail_price_with_collar() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(24, value.getLast_trail_price_with_collar());
                }
                if (value.getIs_heartbeat()) {
                    iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.getIs_heartbeat()));
                }
                if (value.getLast_sent_at() != null) {
                    iEncodedSizeWithTag2 += Time.ADAPTER.encodedSizeWithTag(26, value.getLast_sent_at());
                }
                if (!Intrinsics.areEqual(value.getMainst_shard_id(), "")) {
                    iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(27, value.getMainst_shard_id());
                }
                if (value.getOrder_created_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += ClientService.ADAPTER.encodedSizeWithTag(29, value.getOrder_created_service());
                }
                if (value.getCreated_affiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += Affiliate.ADAPTER.encodedSizeWithTag(30, value.getCreated_affiliate());
                }
                if (value.getService_shard_id() != null) {
                    iEncodedSizeWithTag2 += NullableInt.ADAPTER.encodedSizeWithTag(31, value.getService_shard_id());
                }
                if (value.getCreated_agent() != agent) {
                    iEncodedSizeWithTag2 += Agent.ADAPTER.encodedSizeWithTag(32, value.getCreated_agent());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += TimeInForce.ADAPTER.encodedSizeWithTag(34, value.getTime_in_force());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += InstrumentType.ADAPTER.encodedSizeWithTag(35, value.getInstrument_type());
                }
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += PegType.ADAPTER.encodedSizeWithTag(36, value.getPeg_type());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += MarketHours.ADAPTER.encodedSizeWithTag(37, value.getMarket_hours());
                }
                if (value.getResponse_text() != null) {
                    iEncodedSizeWithTag2 += NullableString.ADAPTER.encodedSizeWithTag(40, value.getResponse_text());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderTrigger.ADAPTER.encodedSizeWithTag(41, value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag2 += OrderType.ADAPTER.encodedSizeWithTag(42, value.getType());
                }
                if (value.getExecuted_quantity() != null) {
                    iEncodedSizeWithTag2 += Decimal.ADAPTER.encodedSizeWithTag(43, value.getExecuted_quantity());
                }
                int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + FractionalOrderDetails.ADAPTER.encodedSizeWithTag(38, value.getFractional_details()) + IPOOrderDetails.ADAPTER.encodedSizeWithTag(39, value.getIpo_details());
                if (value.getWaiting_category() != WaitingCategory.WAITING_CATEGORY_UNSPECIFIED) {
                    iEncodedSizeWithTag3 += WaitingCategory.ADAPTER.encodedSizeWithTag(44, value.getWaiting_category());
                }
                if (value.getMetadata() != null) {
                    iEncodedSizeWithTag3 += OrderMetadata.ADAPTER.encodedSizeWithTag(45, value.getMetadata());
                }
                int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + OrderModification.ADAPTER.asRepeated().encodedSizeWithTag(46, value.getModifications());
                if (value.getEstimated_notional() != null) {
                    iEncodedSizeWithTag4 += Decimal.ADAPTER.encodedSizeWithTag(47, value.getEstimated_notional());
                }
                if (value.getCancel_open_time() != null) {
                    iEncodedSizeWithTag4 += Time.ADAPTER.encodedSizeWithTag(48, value.getCancel_open_time());
                }
                if (value.getCancel_close_time() != null) {
                    iEncodedSizeWithTag4 += Time.ADAPTER.encodedSizeWithTag(49, value.getCancel_close_time());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    iEncodedSizeWithTag4 += ProtoAdapter.STRING.encodedSizeWithTag(50, value.getSymbol());
                }
                if (value.getTrailing_peg() != null) {
                    iEncodedSizeWithTag4 += Decimal.ADAPTER.encodedSizeWithTag(51, value.getTrailing_peg());
                }
                if (value.getList_root_id() != null) {
                    iEncodedSizeWithTag4 += UUID.ADAPTER.encodedSizeWithTag(52, value.getList_root_id());
                }
                if (value.getReplacement_order_id() != null) {
                    iEncodedSizeWithTag4 += UUID.ADAPTER.encodedSizeWithTag(53, value.getReplacement_order_id());
                }
                if (value.getReplaces_order() != null) {
                    iEncodedSizeWithTag4 += ReplacesOrderDetails.ADAPTER.encodedSizeWithTag(54, value.getReplaces_order());
                }
                if (value.getNotional() != null) {
                    iEncodedSizeWithTag4 += Decimal.ADAPTER.encodedSizeWithTag(55, value.getNotional());
                }
                if (value.getCancelled_notional() != null) {
                    iEncodedSizeWithTag4 += Decimal.ADAPTER.encodedSizeWithTag(56, value.getCancelled_notional());
                }
                if (value.getCancel_triggering_time() != null) {
                    iEncodedSizeWithTag4 += Time.ADAPTER.encodedSizeWithTag(57, value.getCancel_triggering_time());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += AccountType.ADAPTER.encodedSizeWithTag(58, value.getAccount_type());
                }
                if (value.getLeverage() != null) {
                    iEncodedSizeWithTag4 += Decimal.ADAPTER.encodedSizeWithTag(60, value.getLeverage());
                }
                if (value.getReduce_only() != null) {
                    iEncodedSizeWithTag4 += NullableBool.ADAPTER.encodedSizeWithTag(61, value.getReduce_only());
                }
                if (value.getBulk_event_id() != null) {
                    iEncodedSizeWithTag4 += UUID.ADAPTER.encodedSizeWithTag(62, value.getBulk_event_id());
                }
                if (value.getCurrency_denomination() != CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += CurrencyDenomination.ADAPTER.encodedSizeWithTag(63, value.getCurrency_denomination());
                }
                if (value.getMargin_mode_v2() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += MarginMode.ADAPTER.encodedSizeWithTag(64, value.getMargin_mode_v2());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    iEncodedSizeWithTag4 += PositionEffect.ADAPTER.encodedSizeWithTag(65, value.getPosition_effect());
                }
                return value.getPosition_id() != null ? iEncodedSizeWithTag4 + NullableString.ADAPTER.encodedSizeWithTag(66, value.getPosition_id()) : iEncodedSizeWithTag4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OrderUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getCancelled_quantity());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getCreated_at());
                }
                if (value.getLast_transaction_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 6, (int) value.getLast_transaction_at());
                }
                if (value.getStop_triggered_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getStop_triggered_at());
                }
                OrderUpdateExecution.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getExecutions());
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getVersion()));
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 10, (int) value.getRoute());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAccount_number());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 12, (int) value.getSide());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 13, (int) value.getQuantity());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 14, (int) value.getPrice());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 15, (int) value.getStop_price());
                }
                if (value.getLast_trail_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 16, (int) value.getLast_trail_price());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 17, (int) value.getInstrument_id());
                }
                if (value.getClearing_firm() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 18, (int) value.getClearing_firm());
                }
                OrderUpdateLeg.ADAPTER.asRepeated().encodeWithTag(writer, 19, (int) value.getLegs());
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 20, (int) value.getResponse_category());
                }
                if (value.getUpdate_created_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 21, (int) value.getUpdate_created_at());
                }
                Agent cancel_open_agent = value.getCancel_open_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (cancel_open_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 22, (int) value.getCancel_open_agent());
                }
                if (value.getCancel_close_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 23, (int) value.getCancel_close_agent());
                }
                if (value.getLast_trail_price_with_collar() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 24, (int) value.getLast_trail_price_with_collar());
                }
                if (value.getIs_heartbeat()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getIs_heartbeat()));
                }
                if (value.getLast_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 26, (int) value.getLast_sent_at());
                }
                if (!Intrinsics.areEqual(value.getMainst_shard_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getMainst_shard_id());
                }
                if (value.getOrder_created_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    ClientService.ADAPTER.encodeWithTag(writer, 29, (int) value.getOrder_created_service());
                }
                if (value.getCreated_affiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 30, (int) value.getCreated_affiliate());
                }
                if (value.getService_shard_id() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 31, (int) value.getService_shard_id());
                }
                if (value.getCreated_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 32, (int) value.getCreated_agent());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 34, (int) value.getTime_in_force());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 35, (int) value.getInstrument_type());
                }
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 36, (int) value.getPeg_type());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 37, (int) value.getMarket_hours());
                }
                if (value.getResponse_text() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 40, (int) value.getResponse_text());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 41, (int) value.getTrigger());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 42, (int) value.getType());
                }
                if (value.getExecuted_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 43, (int) value.getExecuted_quantity());
                }
                if (value.getWaiting_category() != WaitingCategory.WAITING_CATEGORY_UNSPECIFIED) {
                    WaitingCategory.ADAPTER.encodeWithTag(writer, 44, (int) value.getWaiting_category());
                }
                if (value.getMetadata() != null) {
                    OrderMetadata.ADAPTER.encodeWithTag(writer, 45, (int) value.getMetadata());
                }
                OrderModification.ADAPTER.asRepeated().encodeWithTag(writer, 46, (int) value.getModifications());
                if (value.getEstimated_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 47, (int) value.getEstimated_notional());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 48, (int) value.getCancel_open_time());
                }
                if (value.getCancel_close_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 49, (int) value.getCancel_close_time());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 50, (int) value.getSymbol());
                }
                if (value.getTrailing_peg() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 51, (int) value.getTrailing_peg());
                }
                if (value.getList_root_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 52, (int) value.getList_root_id());
                }
                if (value.getReplacement_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 53, (int) value.getReplacement_order_id());
                }
                if (value.getReplaces_order() != null) {
                    ReplacesOrderDetails.ADAPTER.encodeWithTag(writer, 54, (int) value.getReplaces_order());
                }
                if (value.getNotional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 55, (int) value.getNotional());
                }
                if (value.getCancelled_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 56, (int) value.getCancelled_notional());
                }
                if (value.getCancel_triggering_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 57, (int) value.getCancel_triggering_time());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 58, (int) value.getAccount_type());
                }
                if (value.getLeverage() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 60, (int) value.getLeverage());
                }
                if (value.getReduce_only() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 61, (int) value.getReduce_only());
                }
                if (value.getBulk_event_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 62, (int) value.getBulk_event_id());
                }
                if (value.getCurrency_denomination() != CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED) {
                    CurrencyDenomination.ADAPTER.encodeWithTag(writer, 63, (int) value.getCurrency_denomination());
                }
                if (value.getMargin_mode_v2() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 64, (int) value.getMargin_mode_v2());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 65, (int) value.getPosition_effect());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 66, (int) value.getPosition_id());
                }
                FractionalOrderDetails.ADAPTER.encodeWithTag(writer, 38, (int) value.getFractional_details());
                IPOOrderDetails.ADAPTER.encodeWithTag(writer, 39, (int) value.getIpo_details());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OrderUpdate value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                IPOOrderDetails.ADAPTER.encodeWithTag(writer, 39, (int) value.getIpo_details());
                FractionalOrderDetails.ADAPTER.encodeWithTag(writer, 38, (int) value.getFractional_details());
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 66, (int) value.getPosition_id());
                }
                if (value.getPosition_effect() != PositionEffect.POSITION_EFFECT_UNSPECIFIED) {
                    PositionEffect.ADAPTER.encodeWithTag(writer, 65, (int) value.getPosition_effect());
                }
                if (value.getMargin_mode_v2() != MarginMode.MARGIN_MODE_UNSPECIFIED) {
                    MarginMode.ADAPTER.encodeWithTag(writer, 64, (int) value.getMargin_mode_v2());
                }
                if (value.getCurrency_denomination() != CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED) {
                    CurrencyDenomination.ADAPTER.encodeWithTag(writer, 63, (int) value.getCurrency_denomination());
                }
                if (value.getBulk_event_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 62, (int) value.getBulk_event_id());
                }
                if (value.getReduce_only() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 61, (int) value.getReduce_only());
                }
                if (value.getLeverage() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 60, (int) value.getLeverage());
                }
                if (value.getAccount_type() != AccountType.ACCOUNT_TYPE_UNSPECIFIED) {
                    AccountType.ADAPTER.encodeWithTag(writer, 58, (int) value.getAccount_type());
                }
                if (value.getCancel_triggering_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 57, (int) value.getCancel_triggering_time());
                }
                if (value.getCancelled_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 56, (int) value.getCancelled_notional());
                }
                if (value.getNotional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 55, (int) value.getNotional());
                }
                if (value.getReplaces_order() != null) {
                    ReplacesOrderDetails.ADAPTER.encodeWithTag(writer, 54, (int) value.getReplaces_order());
                }
                if (value.getReplacement_order_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 53, (int) value.getReplacement_order_id());
                }
                if (value.getList_root_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 52, (int) value.getList_root_id());
                }
                if (value.getTrailing_peg() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 51, (int) value.getTrailing_peg());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 50, (int) value.getSymbol());
                }
                if (value.getCancel_close_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 49, (int) value.getCancel_close_time());
                }
                if (value.getCancel_open_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 48, (int) value.getCancel_open_time());
                }
                if (value.getEstimated_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 47, (int) value.getEstimated_notional());
                }
                OrderModification.ADAPTER.asRepeated().encodeWithTag(writer, 46, (int) value.getModifications());
                if (value.getMetadata() != null) {
                    OrderMetadata.ADAPTER.encodeWithTag(writer, 45, (int) value.getMetadata());
                }
                if (value.getWaiting_category() != WaitingCategory.WAITING_CATEGORY_UNSPECIFIED) {
                    WaitingCategory.ADAPTER.encodeWithTag(writer, 44, (int) value.getWaiting_category());
                }
                if (value.getExecuted_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 43, (int) value.getExecuted_quantity());
                }
                if (value.getType() != OrderType.ORDER_TYPE_UNSPECIFIED) {
                    OrderType.ADAPTER.encodeWithTag(writer, 42, (int) value.getType());
                }
                if (value.getTrigger() != OrderTrigger.ORDER_TRIGGER_UNSPECIFIED) {
                    OrderTrigger.ADAPTER.encodeWithTag(writer, 41, (int) value.getTrigger());
                }
                if (value.getResponse_text() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 40, (int) value.getResponse_text());
                }
                if (value.getMarket_hours() != MarketHours.MARKET_HOURS_UNSPECIFIED) {
                    MarketHours.ADAPTER.encodeWithTag(writer, 37, (int) value.getMarket_hours());
                }
                if (value.getPeg_type() != PegType.PEG_TYPE_UNSPECIFIED) {
                    PegType.ADAPTER.encodeWithTag(writer, 36, (int) value.getPeg_type());
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 35, (int) value.getInstrument_type());
                }
                if (value.getTime_in_force() != TimeInForce.TIME_IN_FORCE_UNSPECIFIED) {
                    TimeInForce.ADAPTER.encodeWithTag(writer, 34, (int) value.getTime_in_force());
                }
                Agent created_agent = value.getCreated_agent();
                Agent agent = Agent.AGENT_UNSPECIFIED;
                if (created_agent != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 32, (int) value.getCreated_agent());
                }
                if (value.getService_shard_id() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 31, (int) value.getService_shard_id());
                }
                if (value.getCreated_affiliate() != Affiliate.AFFILIATE_UNSPECIFIED) {
                    Affiliate.ADAPTER.encodeWithTag(writer, 30, (int) value.getCreated_affiliate());
                }
                if (value.getOrder_created_service() != ClientService.CLIENT_SERVICE_UNSPECIFIED) {
                    ClientService.ADAPTER.encodeWithTag(writer, 29, (int) value.getOrder_created_service());
                }
                if (!Intrinsics.areEqual(value.getMainst_shard_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 27, (int) value.getMainst_shard_id());
                }
                if (value.getLast_sent_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 26, (int) value.getLast_sent_at());
                }
                if (value.getIs_heartbeat()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getIs_heartbeat()));
                }
                if (value.getLast_trail_price_with_collar() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 24, (int) value.getLast_trail_price_with_collar());
                }
                if (value.getCancel_close_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 23, (int) value.getCancel_close_agent());
                }
                if (value.getCancel_open_agent() != agent) {
                    Agent.ADAPTER.encodeWithTag(writer, 22, (int) value.getCancel_open_agent());
                }
                if (value.getUpdate_created_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 21, (int) value.getUpdate_created_at());
                }
                if (value.getResponse_category() != ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED) {
                    ResponseCategory.ADAPTER.encodeWithTag(writer, 20, (int) value.getResponse_category());
                }
                OrderUpdateLeg.ADAPTER.asRepeated().encodeWithTag(writer, 19, (int) value.getLegs());
                if (value.getClearing_firm() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 18, (int) value.getClearing_firm());
                }
                if (value.getInstrument_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 17, (int) value.getInstrument_id());
                }
                if (value.getLast_trail_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 16, (int) value.getLast_trail_price());
                }
                if (value.getStop_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 15, (int) value.getStop_price());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 14, (int) value.getPrice());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 13, (int) value.getQuantity());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 12, (int) value.getSide());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAccount_number());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 10, (int) value.getRoute());
                }
                if (value.getVersion() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 9, (int) Integer.valueOf(value.getVersion()));
                }
                OrderUpdateExecution.ADAPTER.asRepeated().encodeWithTag(writer, 8, (int) value.getExecutions());
                if (value.getStop_triggered_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getStop_triggered_at());
                }
                if (value.getLast_transaction_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 6, (int) value.getLast_transaction_at());
                }
                if (value.getCreated_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getCreated_at());
                }
                if (value.getCancelled_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getCancelled_quantity());
                }
                if (value.getState() != OrderState.ORDER_STATE_UNSPECIFIED) {
                    OrderState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrder_id());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getId());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OrderUpdate decode(ProtoReader reader) throws IOException {
                Side side;
                Agent agent;
                ClientService clientService;
                OrderState orderStateDecode;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OrderState orderState = OrderState.ORDER_STATE_UNSPECIFIED;
                ArrayList arrayList = new ArrayList();
                Route route = Route.ROUTE_UNSPECIFIED;
                Side side2 = Side.SIDE_UNSPECIFIED;
                ArrayList arrayList2 = new ArrayList();
                ResponseCategory responseCategory = ResponseCategory.RESPONSE_CATEGORY_UNSPECIFIED;
                Agent agent2 = Agent.AGENT_UNSPECIFIED;
                ClientService clientService2 = ClientService.CLIENT_SERVICE_UNSPECIFIED;
                Affiliate affiliate = Affiliate.AFFILIATE_UNSPECIFIED;
                TimeInForce timeInForce = TimeInForce.TIME_IN_FORCE_UNSPECIFIED;
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                PegType pegType = PegType.PEG_TYPE_UNSPECIFIED;
                MarketHours marketHours = MarketHours.MARKET_HOURS_UNSPECIFIED;
                OrderTrigger orderTrigger = OrderTrigger.ORDER_TRIGGER_UNSPECIFIED;
                OrderType orderType = OrderType.ORDER_TYPE_UNSPECIFIED;
                WaitingCategory waitingCategory = WaitingCategory.WAITING_CATEGORY_UNSPECIFIED;
                Route routeDecode = route;
                ArrayList arrayList3 = new ArrayList();
                AccountType accountType = AccountType.ACCOUNT_TYPE_UNSPECIFIED;
                CurrencyDenomination currencyDenomination = CurrencyDenomination.CURRENCY_DENOMINATION_UNSPECIFIED;
                MarginMode marginMode = MarginMode.MARGIN_MODE_UNSPECIFIED;
                PositionEffect positionEffect = PositionEffect.POSITION_EFFECT_UNSPECIFIED;
                ResponseCategory responseCategoryDecode = responseCategory;
                Agent agentDecode = agent2;
                long jBeginMessage = reader.beginMessage();
                OrderState orderState2 = orderState;
                UUID uuid = null;
                UUID uuid2 = null;
                Decimal decimal = null;
                Time time = null;
                Time time2 = null;
                Time time3 = null;
                Decimal decimal2 = null;
                Decimal decimal3 = null;
                Decimal decimal4 = null;
                Decimal decimal5 = null;
                UUID uuid3 = null;
                NullableString nullableString = null;
                Time time4 = null;
                Decimal decimal6 = null;
                Time time5 = null;
                NullableInt nullableInt = null;
                NullableString nullableString2 = null;
                Decimal decimal7 = null;
                FractionalOrderDetails fractionalOrderDetails = null;
                IPOOrderDetails iPOOrderDetails = null;
                OrderMetadata orderMetadata = null;
                Decimal decimal8 = null;
                Time time6 = null;
                Time time7 = null;
                Decimal decimal9 = null;
                UUID uuid4 = null;
                UUID uuid5 = null;
                ReplacesOrderDetails replacesOrderDetails = null;
                Decimal decimal10 = null;
                Decimal decimal11 = null;
                Time time8 = null;
                Decimal decimal12 = null;
                NullableBool nullableBool = null;
                UUID uuid6 = null;
                NullableString nullableString3 = null;
                int i = 0;
                boolean z = false;
                String str = "";
                String str2 = str;
                String str3 = str2;
                CurrencyDenomination currencyDenominationDecode = currencyDenomination;
                MarginMode marginModeDecode = marginMode;
                PositionEffect positionEffectDecode = positionEffect;
                OrderType orderTypeDecode = orderType;
                WaitingCategory waitingCategoryDecode = waitingCategory;
                AccountType accountTypeDecode = accountType;
                PegType pegTypeDecode = pegType;
                MarketHours marketHoursDecode = marketHours;
                OrderTrigger orderTriggerDecode = orderTrigger;
                Affiliate affiliateDecode = affiliate;
                TimeInForce timeInForceDecode = timeInForce;
                InstrumentType instrumentTypeDecode = instrumentType;
                Agent agentDecode2 = agentDecode;
                Agent agentDecode3 = agentDecode2;
                ClientService clientServiceDecode = clientService2;
                Side sideDecode = side2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OrderUpdate(uuid, uuid2, orderState2, decimal, time, time2, time3, arrayList, i, routeDecode, str, sideDecode, decimal2, decimal3, decimal4, decimal5, uuid3, nullableString, arrayList2, responseCategoryDecode, time4, agentDecode, agentDecode2, decimal6, z, time5, str2, clientServiceDecode, affiliateDecode, nullableInt, agentDecode3, timeInForceDecode, instrumentTypeDecode, pegTypeDecode, marketHoursDecode, nullableString2, orderTriggerDecode, orderTypeDecode, decimal7, fractionalOrderDetails, iPOOrderDetails, waitingCategoryDecode, orderMetadata, arrayList3, decimal8, time6, time7, str3, decimal9, uuid4, uuid5, replacesOrderDetails, decimal10, decimal11, time8, accountTypeDecode, decimal12, nullableBool, uuid6, currencyDenominationDecode, marginModeDecode, positionEffectDecode, nullableString3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                orderStateDecode = OrderState.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                orderStateDecode = orderState2;
                            }
                            Unit unit3 = Unit.INSTANCE;
                            orderState2 = orderStateDecode;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 4:
                            Decimal decimalDecode = Decimal.ADAPTER.decode(reader);
                            Unit unit4 = Unit.INSTANCE;
                            decimal = decimalDecode;
                            break;
                        case 5:
                            Time timeDecode = Time.ADAPTER.decode(reader);
                            Unit unit5 = Unit.INSTANCE;
                            time = timeDecode;
                            break;
                        case 6:
                            Time timeDecode2 = Time.ADAPTER.decode(reader);
                            Unit unit6 = Unit.INSTANCE;
                            time2 = timeDecode2;
                            break;
                        case 7:
                            Time timeDecode3 = Time.ADAPTER.decode(reader);
                            Unit unit7 = Unit.INSTANCE;
                            time3 = timeDecode3;
                            break;
                        case 8:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            arrayList.add(OrderUpdateExecution.ADAPTER.decode(reader));
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 9:
                            int iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            Unit unit8 = Unit.INSTANCE;
                            i = iIntValue;
                            break;
                        case 10:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                routeDecode = Route.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            Unit unit9 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 11:
                            String strDecode = ProtoAdapter.STRING.decode(reader);
                            Unit unit10 = Unit.INSTANCE;
                            str = strDecode;
                            break;
                        case 12:
                            Side side3 = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                sideDecode = Side.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                sideDecode = side3;
                            }
                            Unit unit11 = Unit.INSTANCE;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 13:
                            Decimal decimalDecode2 = Decimal.ADAPTER.decode(reader);
                            Unit unit12 = Unit.INSTANCE;
                            decimal2 = decimalDecode2;
                            break;
                        case 14:
                            Decimal decimalDecode3 = Decimal.ADAPTER.decode(reader);
                            Unit unit13 = Unit.INSTANCE;
                            decimal3 = decimalDecode3;
                            break;
                        case 15:
                            Decimal decimalDecode4 = Decimal.ADAPTER.decode(reader);
                            Unit unit14 = Unit.INSTANCE;
                            decimal4 = decimalDecode4;
                            break;
                        case 16:
                            Decimal decimalDecode5 = Decimal.ADAPTER.decode(reader);
                            Unit unit15 = Unit.INSTANCE;
                            decimal5 = decimalDecode5;
                            break;
                        case 17:
                            UUID uuidDecode3 = UUID.ADAPTER.decode(reader);
                            Unit unit16 = Unit.INSTANCE;
                            uuid3 = uuidDecode3;
                            break;
                        case 18:
                            NullableString nullableStringDecode = NullableString.ADAPTER.decode(reader);
                            Unit unit17 = Unit.INSTANCE;
                            nullableString = nullableStringDecode;
                            break;
                        case 19:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            arrayList2.add(OrderUpdateLeg.ADAPTER.decode(reader));
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 20:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                responseCategoryDecode = ResponseCategory.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            Unit unit18 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 21:
                            Time timeDecode4 = Time.ADAPTER.decode(reader);
                            Unit unit19 = Unit.INSTANCE;
                            time4 = timeDecode4;
                            break;
                        case 22:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                agentDecode = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            Unit unit20 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 23:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                agentDecode2 = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            Unit unit21 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 24:
                            Decimal decimalDecode6 = Decimal.ADAPTER.decode(reader);
                            Unit unit22 = Unit.INSTANCE;
                            decimal6 = decimalDecode6;
                            break;
                        case 25:
                            boolean zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            Unit unit23 = Unit.INSTANCE;
                            z = zBooleanValue;
                            break;
                        case 26:
                            Time timeDecode5 = Time.ADAPTER.decode(reader);
                            Unit unit24 = Unit.INSTANCE;
                            time5 = timeDecode5;
                            break;
                        case 27:
                            String strDecode2 = ProtoAdapter.STRING.decode(reader);
                            Unit unit25 = Unit.INSTANCE;
                            str2 = strDecode2;
                            break;
                        case 28:
                        case 33:
                        case 59:
                        default:
                            reader.readUnknownField(iNextTag);
                            Unit unit26 = Unit.INSTANCE;
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 29:
                            Side side4 = sideDecode;
                            Agent agent3 = agentDecode3;
                            ClientService clientService3 = clientServiceDecode;
                            try {
                                clientServiceDecode = ClientService.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                clientServiceDecode = clientService3;
                            }
                            Unit unit27 = Unit.INSTANCE;
                            sideDecode = side4;
                            agentDecode3 = agent3;
                            break;
                        case 30:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                affiliateDecode = Affiliate.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                            }
                            Unit unit28 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 31:
                            NullableInt nullableIntDecode = NullableInt.ADAPTER.decode(reader);
                            Unit unit29 = Unit.INSTANCE;
                            nullableInt = nullableIntDecode;
                            break;
                        case 32:
                            Side side5 = sideDecode;
                            Agent agent4 = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                agentDecode3 = Agent.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                agentDecode3 = agent4;
                            }
                            Unit unit30 = Unit.INSTANCE;
                            sideDecode = side5;
                            clientServiceDecode = clientService;
                            break;
                        case 34:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                timeInForceDecode = TimeInForce.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                            }
                            Unit unit31 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 35:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                            }
                            Unit unit32 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 36:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                pegTypeDecode = PegType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e12.value));
                            }
                            Unit unit33 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 37:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                marketHoursDecode = MarketHours.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e13.value));
                            }
                            Unit unit34 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 38:
                            FractionalOrderDetails fractionalOrderDetailsDecode = FractionalOrderDetails.ADAPTER.decode(reader);
                            Unit unit35 = Unit.INSTANCE;
                            fractionalOrderDetails = fractionalOrderDetailsDecode;
                            break;
                        case 39:
                            IPOOrderDetails iPOOrderDetailsDecode = IPOOrderDetails.ADAPTER.decode(reader);
                            Unit unit36 = Unit.INSTANCE;
                            iPOOrderDetails = iPOOrderDetailsDecode;
                            break;
                        case 40:
                            NullableString nullableStringDecode2 = NullableString.ADAPTER.decode(reader);
                            Unit unit37 = Unit.INSTANCE;
                            nullableString2 = nullableStringDecode2;
                            break;
                        case 41:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                orderTriggerDecode = OrderTrigger.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e14.value));
                            }
                            Unit unit38 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 42:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                orderTypeDecode = OrderType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e15.value));
                            }
                            Unit unit39 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 43:
                            Decimal decimalDecode7 = Decimal.ADAPTER.decode(reader);
                            Unit unit40 = Unit.INSTANCE;
                            decimal7 = decimalDecode7;
                            break;
                        case 44:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                waitingCategoryDecode = WaitingCategory.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e16.value));
                            }
                            Unit unit41 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 45:
                            OrderMetadata orderMetadataDecode = OrderMetadata.ADAPTER.decode(reader);
                            Unit unit42 = Unit.INSTANCE;
                            orderMetadata = orderMetadataDecode;
                            break;
                        case 46:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            arrayList3.add(OrderModification.ADAPTER.decode(reader));
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 47:
                            Decimal decimalDecode8 = Decimal.ADAPTER.decode(reader);
                            Unit unit43 = Unit.INSTANCE;
                            decimal8 = decimalDecode8;
                            break;
                        case 48:
                            Time timeDecode6 = Time.ADAPTER.decode(reader);
                            Unit unit44 = Unit.INSTANCE;
                            time6 = timeDecode6;
                            break;
                        case 49:
                            Time timeDecode7 = Time.ADAPTER.decode(reader);
                            Unit unit45 = Unit.INSTANCE;
                            time7 = timeDecode7;
                            break;
                        case 50:
                            String strDecode3 = ProtoAdapter.STRING.decode(reader);
                            Unit unit46 = Unit.INSTANCE;
                            str3 = strDecode3;
                            break;
                        case 51:
                            Decimal decimalDecode9 = Decimal.ADAPTER.decode(reader);
                            Unit unit47 = Unit.INSTANCE;
                            decimal9 = decimalDecode9;
                            break;
                        case 52:
                            UUID uuidDecode4 = UUID.ADAPTER.decode(reader);
                            Unit unit48 = Unit.INSTANCE;
                            uuid4 = uuidDecode4;
                            break;
                        case 53:
                            UUID uuidDecode5 = UUID.ADAPTER.decode(reader);
                            Unit unit49 = Unit.INSTANCE;
                            uuid5 = uuidDecode5;
                            break;
                        case 54:
                            ReplacesOrderDetails replacesOrderDetailsDecode = ReplacesOrderDetails.ADAPTER.decode(reader);
                            Unit unit50 = Unit.INSTANCE;
                            replacesOrderDetails = replacesOrderDetailsDecode;
                            break;
                        case 55:
                            Decimal decimalDecode10 = Decimal.ADAPTER.decode(reader);
                            Unit unit51 = Unit.INSTANCE;
                            decimal10 = decimalDecode10;
                            break;
                        case 56:
                            Decimal decimalDecode11 = Decimal.ADAPTER.decode(reader);
                            Unit unit52 = Unit.INSTANCE;
                            decimal11 = decimalDecode11;
                            break;
                        case 57:
                            Time timeDecode8 = Time.ADAPTER.decode(reader);
                            Unit unit53 = Unit.INSTANCE;
                            time8 = timeDecode8;
                            break;
                        case 58:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                accountTypeDecode = AccountType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e17.value));
                            }
                            Unit unit54 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 60:
                            Decimal decimalDecode12 = Decimal.ADAPTER.decode(reader);
                            Unit unit55 = Unit.INSTANCE;
                            decimal12 = decimalDecode12;
                            break;
                        case 61:
                            NullableBool nullableBoolDecode = NullableBool.ADAPTER.decode(reader);
                            Unit unit56 = Unit.INSTANCE;
                            nullableBool = nullableBoolDecode;
                            break;
                        case 62:
                            UUID uuidDecode6 = UUID.ADAPTER.decode(reader);
                            Unit unit57 = Unit.INSTANCE;
                            uuid6 = uuidDecode6;
                            break;
                        case 63:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                currencyDenominationDecode = CurrencyDenomination.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e18) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e18.value));
                            }
                            Unit unit58 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 64:
                            side = sideDecode;
                            agent = agentDecode3;
                            clientService = clientServiceDecode;
                            try {
                                marginModeDecode = MarginMode.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e19) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e19.value));
                            }
                            Unit unit59 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 65:
                            try {
                                positionEffectDecode = PositionEffect.ADAPTER.decode(reader);
                                side = sideDecode;
                                agent = agentDecode3;
                                clientService = clientServiceDecode;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e20) {
                                side = sideDecode;
                                agent = agentDecode3;
                                clientService = clientServiceDecode;
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e20.value));
                            }
                            Unit unit60 = Unit.INSTANCE;
                            sideDecode = side;
                            agentDecode3 = agent;
                            clientServiceDecode = clientService;
                            break;
                        case 66:
                            NullableString nullableStringDecode3 = NullableString.ADAPTER.decode(reader);
                            Unit unit61 = Unit.INSTANCE;
                            nullableString3 = nullableStringDecode3;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OrderUpdate redact(OrderUpdate value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID id = value.getId();
                UUID uuidRedact = id != null ? UUID.ADAPTER.redact(id) : null;
                UUID order_id = value.getOrder_id();
                UUID uuidRedact2 = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                Decimal cancelled_quantity = value.getCancelled_quantity();
                Decimal decimalRedact = cancelled_quantity != null ? Decimal.ADAPTER.redact(cancelled_quantity) : null;
                Time created_at = value.getCreated_at();
                Time timeRedact = created_at != null ? Time.ADAPTER.redact(created_at) : null;
                Time last_transaction_at = value.getLast_transaction_at();
                Time timeRedact2 = last_transaction_at != null ? Time.ADAPTER.redact(last_transaction_at) : null;
                Time stop_triggered_at = value.getStop_triggered_at();
                Time timeRedact3 = stop_triggered_at != null ? Time.ADAPTER.redact(stop_triggered_at) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getExecutions(), OrderUpdateExecution.ADAPTER);
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact2 = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact3 = price != null ? Decimal.ADAPTER.redact(price) : null;
                Decimal stop_price = value.getStop_price();
                Decimal decimalRedact4 = stop_price != null ? Decimal.ADAPTER.redact(stop_price) : null;
                Decimal last_trail_price = value.getLast_trail_price();
                Decimal decimalRedact5 = last_trail_price != null ? Decimal.ADAPTER.redact(last_trail_price) : null;
                UUID instrument_id = value.getInstrument_id();
                UUID uuidRedact3 = instrument_id != null ? UUID.ADAPTER.redact(instrument_id) : null;
                NullableString clearing_firm = value.getClearing_firm();
                NullableString nullableStringRedact = clearing_firm != null ? NullableString.ADAPTER.redact(clearing_firm) : null;
                List listM26823redactElements2 = Internal.m26823redactElements(value.getLegs(), OrderUpdateLeg.ADAPTER);
                Time update_created_at = value.getUpdate_created_at();
                Time timeRedact4 = update_created_at != null ? Time.ADAPTER.redact(update_created_at) : null;
                Decimal last_trail_price_with_collar = value.getLast_trail_price_with_collar();
                Decimal decimalRedact6 = last_trail_price_with_collar != null ? Decimal.ADAPTER.redact(last_trail_price_with_collar) : null;
                Time last_sent_at = value.getLast_sent_at();
                Time timeRedact5 = last_sent_at != null ? Time.ADAPTER.redact(last_sent_at) : null;
                NullableInt service_shard_id = value.getService_shard_id();
                NullableInt nullableIntRedact = service_shard_id != null ? NullableInt.ADAPTER.redact(service_shard_id) : null;
                NullableString response_text = value.getResponse_text();
                NullableString nullableStringRedact2 = response_text != null ? NullableString.ADAPTER.redact(response_text) : null;
                Decimal executed_quantity = value.getExecuted_quantity();
                Decimal decimalRedact7 = executed_quantity != null ? Decimal.ADAPTER.redact(executed_quantity) : null;
                FractionalOrderDetails fractional_details = value.getFractional_details();
                FractionalOrderDetails fractionalOrderDetailsRedact = fractional_details != null ? FractionalOrderDetails.ADAPTER.redact(fractional_details) : null;
                IPOOrderDetails ipo_details = value.getIpo_details();
                IPOOrderDetails iPOOrderDetailsRedact = ipo_details != null ? IPOOrderDetails.ADAPTER.redact(ipo_details) : null;
                OrderMetadata metadata = value.getMetadata();
                OrderMetadata orderMetadataRedact = metadata != null ? OrderMetadata.ADAPTER.redact(metadata) : null;
                List listM26823redactElements3 = Internal.m26823redactElements(value.getModifications(), OrderModification.ADAPTER);
                Decimal estimated_notional = value.getEstimated_notional();
                Decimal decimalRedact8 = estimated_notional != null ? Decimal.ADAPTER.redact(estimated_notional) : null;
                Time cancel_open_time = value.getCancel_open_time();
                Time timeRedact6 = cancel_open_time != null ? Time.ADAPTER.redact(cancel_open_time) : null;
                Time cancel_close_time = value.getCancel_close_time();
                Time timeRedact7 = cancel_close_time != null ? Time.ADAPTER.redact(cancel_close_time) : null;
                Decimal trailing_peg = value.getTrailing_peg();
                Decimal decimalRedact9 = trailing_peg != null ? Decimal.ADAPTER.redact(trailing_peg) : null;
                UUID list_root_id = value.getList_root_id();
                UUID uuidRedact4 = list_root_id != null ? UUID.ADAPTER.redact(list_root_id) : null;
                UUID replacement_order_id = value.getReplacement_order_id();
                UUID uuidRedact5 = replacement_order_id != null ? UUID.ADAPTER.redact(replacement_order_id) : null;
                ReplacesOrderDetails replaces_order = value.getReplaces_order();
                ReplacesOrderDetails replacesOrderDetailsRedact = replaces_order != null ? ReplacesOrderDetails.ADAPTER.redact(replaces_order) : null;
                Decimal notional = value.getNotional();
                Decimal decimalRedact10 = notional != null ? Decimal.ADAPTER.redact(notional) : null;
                Decimal cancelled_notional = value.getCancelled_notional();
                Decimal decimalRedact11 = cancelled_notional != null ? Decimal.ADAPTER.redact(cancelled_notional) : null;
                Time cancel_triggering_time = value.getCancel_triggering_time();
                Time timeRedact8 = cancel_triggering_time != null ? Time.ADAPTER.redact(cancel_triggering_time) : null;
                Decimal leverage = value.getLeverage();
                Decimal decimalRedact12 = leverage != null ? Decimal.ADAPTER.redact(leverage) : null;
                NullableBool reduce_only = value.getReduce_only();
                NullableBool nullableBoolRedact = reduce_only != null ? NullableBool.ADAPTER.redact(reduce_only) : null;
                UUID bulk_event_id = value.getBulk_event_id();
                UUID uuidRedact6 = bulk_event_id != null ? UUID.ADAPTER.redact(bulk_event_id) : null;
                NullableString position_id = value.getPosition_id();
                return value.copy(((-580382972) & 1) != 0 ? value.id : uuidRedact, ((-580382972) & 2) != 0 ? value.order_id : uuidRedact2, ((-580382972) & 4) != 0 ? value.state : null, ((-580382972) & 8) != 0 ? value.cancelled_quantity : decimalRedact, ((-580382972) & 16) != 0 ? value.created_at : timeRedact, ((-580382972) & 32) != 0 ? value.last_transaction_at : timeRedact2, ((-580382972) & 64) != 0 ? value.stop_triggered_at : timeRedact3, ((-580382972) & 128) != 0 ? value.executions : listM26823redactElements, ((-580382972) & 256) != 0 ? value.version : 0, ((-580382972) & 512) != 0 ? value.route : null, ((-580382972) & 1024) != 0 ? value.account_number : null, ((-580382972) & 2048) != 0 ? value.side : null, ((-580382972) & 4096) != 0 ? value.quantity : decimalRedact2, ((-580382972) & 8192) != 0 ? value.price : decimalRedact3, ((-580382972) & 16384) != 0 ? value.stop_price : decimalRedact4, ((-580382972) & 32768) != 0 ? value.last_trail_price : decimalRedact5, ((-580382972) & 65536) != 0 ? value.instrument_id : uuidRedact3, ((-580382972) & 131072) != 0 ? value.clearing_firm : nullableStringRedact, ((-580382972) & 262144) != 0 ? value.legs : listM26823redactElements2, ((-580382972) & 524288) != 0 ? value.response_category : null, ((-580382972) & 1048576) != 0 ? value.update_created_at : timeRedact4, ((-580382972) & 2097152) != 0 ? value.cancel_open_agent : null, ((-580382972) & 4194304) != 0 ? value.cancel_close_agent : null, ((-580382972) & 8388608) != 0 ? value.last_trail_price_with_collar : decimalRedact6, ((-580382972) & 16777216) != 0 ? value.is_heartbeat : false, ((-580382972) & 33554432) != 0 ? value.last_sent_at : timeRedact5, ((-580382972) & 67108864) != 0 ? value.mainst_shard_id : null, ((-580382972) & 134217728) != 0 ? value.order_created_service : null, ((-580382972) & 268435456) != 0 ? value.created_affiliate : null, ((-580382972) & 536870912) != 0 ? value.service_shard_id : nullableIntRedact, ((-580382972) & 1073741824) != 0 ? value.created_agent : null, ((-580382972) & Integer.MIN_VALUE) != 0 ? value.time_in_force : null, (947946039 & 1) != 0 ? value.instrument_type : null, (947946039 & 2) != 0 ? value.peg_type : null, (947946039 & 4) != 0 ? value.market_hours : null, (947946039 & 8) != 0 ? value.response_text : nullableStringRedact2, (947946039 & 16) != 0 ? value.trigger : null, (947946039 & 32) != 0 ? value.type : null, (947946039 & 64) != 0 ? value.executed_quantity : decimalRedact7, (947946039 & 128) != 0 ? value.fractional_details : fractionalOrderDetailsRedact, (947946039 & 256) != 0 ? value.ipo_details : iPOOrderDetailsRedact, (947946039 & 512) != 0 ? value.waiting_category : null, (947946039 & 1024) != 0 ? value.metadata : orderMetadataRedact, (947946039 & 2048) != 0 ? value.modifications : listM26823redactElements3, (947946039 & 4096) != 0 ? value.estimated_notional : decimalRedact8, (947946039 & 8192) != 0 ? value.cancel_open_time : timeRedact6, (947946039 & 16384) != 0 ? value.cancel_close_time : timeRedact7, (947946039 & 32768) != 0 ? value.symbol : null, (947946039 & 65536) != 0 ? value.trailing_peg : decimalRedact9, (947946039 & 131072) != 0 ? value.list_root_id : uuidRedact4, (947946039 & 262144) != 0 ? value.replacement_order_id : uuidRedact5, (947946039 & 524288) != 0 ? value.replaces_order : replacesOrderDetailsRedact, (947946039 & 1048576) != 0 ? value.notional : decimalRedact10, (947946039 & 2097152) != 0 ? value.cancelled_notional : decimalRedact11, (947946039 & 4194304) != 0 ? value.cancel_triggering_time : timeRedact8, (947946039 & 8388608) != 0 ? value.account_type : null, (947946039 & 16777216) != 0 ? value.leverage : decimalRedact12, (947946039 & 33554432) != 0 ? value.reduce_only : nullableBoolRedact, (947946039 & 67108864) != 0 ? value.bulk_event_id : uuidRedact6, (947946039 & 134217728) != 0 ? value.currency_denomination : null, (947946039 & 268435456) != 0 ? value.margin_mode_v2 : null, (947946039 & 536870912) != 0 ? value.position_effect : null, (947946039 & 1073741824) != 0 ? value.position_id : position_id != null ? NullableString.ADAPTER.redact(position_id) : null, (947946039 & Integer.MIN_VALUE) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
