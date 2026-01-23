package com.robinhood.rosetta.mainst;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
import rosetta.mainst.LastLiquidityInd;
import rosetta.mainst.Route;
import rosetta.mainst.Side;
import rosetta.mainst.TradeBreakAgent;
import rosetta.mainst.Venue;

/* compiled from: Execution.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u009f\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u009f\u0001B£\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010)\u001a\u00020&\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010-\u001a\u00020.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u00100\u001a\u000201\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00106\u001a\u00020\u000f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u00108\u001a\u00020\u000f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010>\u001a\u00020?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010H\u001a\u00020I\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\b\b\u0002\u0010L\u001a\u00020M¢\u0006\u0004\bN\u0010OJ\t\u0010\u0098\u0001\u001a\u00020\u0002H\u0017J\u0016\u0010\u0099\u0001\u001a\u00020\u000f2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0096\u0002J\t\u0010\u009c\u0001\u001a\u00020\u0012H\u0016J\t\u0010\u009d\u0001\u001a\u00020\fH\u0016J£\u0005\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010%\u001a\u00020&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010)\u001a\u00020&2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u00020\u000f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00108\u001a\u00020\u000f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010>\u001a\u00020?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010H\u001a\u00020I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\b\b\u0002\u0010L\u001a\u00020MR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010QR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010TR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010WR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010YR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010TR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010aR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010aR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010WR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010WR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010TR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010TR\u0016\u0010\u001f\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0018\u0010!\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010aR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010TR\u0018\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010TR\u0018\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010TR\u0016\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0018\u0010'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010TR\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010TR\u0016\u0010)\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010sR\u0018\u0010*\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010WR\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010QR\u0018\u0010,\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010QR\u0016\u0010-\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0018\u0010/\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010WR\u0016\u00100\u001a\u0002018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0018\u00102\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010TR\u0019\u00103\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010TR\u0019\u00104\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b4\u0010\u0081\u0001R\u0017\u00106\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\\R\u0019\u00107\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010TR\u0017\u00108\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\\R\u0019\u00109\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010TR\u0019\u0010:\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010TR\u0019\u0010;\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010aR\u0019\u0010<\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010TR\u0019\u0010=\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010TR\u0018\u0010>\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010@\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010aR\u0019\u0010A\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010TR\u0019\u0010B\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010aR\u0019\u0010C\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010aR\u0019\u0010D\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010TR\u0019\u0010E\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010aR\u0019\u0010F\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010WR\u0019\u0010G\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010QR\u0018\u0010H\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010J\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006 \u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/Execution;", "Lcom/squareup/wire/Message;", "", "order_id", "Lcom/robinhood/rosetta/mainst/UUID;", "id", "quantity", "Lcom/robinhood/rosetta/mainst/Decimal;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "timestamp", "Lcom/robinhood/rosetta/mainst/Time;", "execution_id", "", "broken_at", "fill", "", "exec_broker", "update_count", "", "leg_id", "Lcom/robinhood/rosetta/mainst/NullableString;", "commission", "commission_currency", "commission_type", "liquidity_ind", "Lcom/robinhood/rosetta/mainst/NullableInt;", "settlement_type", "settlement_date", "trade_date", "sec_fee", "taf_fee", PlaceTypes.ROUTE, "Lrosetta/mainst/Route;", "cl_ord_id", "rounded_notional", "nbbo_ask_price", "nbbo_ask_quantity", "nbbo_ask_venue", "Lrosetta/mainst/Venue;", "nbbo_bid_price", "nbbo_bid_quantity", "nbbo_bid_venue", "nbbo_exchange_timestamp", "pending_execution_id", "price_source_execution_id", "trade_break_agent", "Lrosetta/mainst/TradeBreakAgent;", "processed_at", "capacity", "Lrosetta/mainst/Capacity;", "limit_up_price", "limit_down_price", "is_adjustment", "Lcom/robinhood/rosetta/mainst/NullableBool;", "notional_execution", "clearing_quantity", "notional_fill", "or_fee", "occ_fee", "trade_match_id", "exchange_fee", "base_currency_traded", "side", "Lrosetta/mainst/Side;", "position_id", "non_denominated_currency_traded", "uti", "rel_tx_id", "fx_fee_in_bps", "contra_firm_account", "estimated_next_settlement_time", "associated_fx_execution_id", "last_liquidity_ind", "Lrosetta/mainst/LastLiquidityInd;", "execution_fees", "Lcom/robinhood/rosetta/mainst/ExecutionFees;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Time;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Time;ZLjava/lang/String;ILcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableInt;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Route;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Venue;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Venue;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/UUID;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/TradeBreakAgent;Lcom/robinhood/rosetta/mainst/Time;Lrosetta/mainst/Capacity;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableBool;ZLcom/robinhood/rosetta/mainst/Decimal;ZLcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lrosetta/mainst/Side;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/NullableString;Lcom/robinhood/rosetta/mainst/Time;Lcom/robinhood/rosetta/mainst/UUID;Lrosetta/mainst/LastLiquidityInd;Lcom/robinhood/rosetta/mainst/ExecutionFees;Lokio/ByteString;)V", "getOrder_id", "()Lcom/robinhood/rosetta/mainst/UUID;", "getId", "getQuantity", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getPrice", "getTimestamp", "()Lcom/robinhood/rosetta/mainst/Time;", "getExecution_id", "()Ljava/lang/String;", "getBroken_at", "getFill", "()Z", "getExec_broker", "getUpdate_count", "()I", "getLeg_id", "()Lcom/robinhood/rosetta/mainst/NullableString;", "getCommission", "getCommission_currency", "getCommission_type", "getLiquidity_ind", "()Lcom/robinhood/rosetta/mainst/NullableInt;", "getSettlement_type", "getSettlement_date", "getTrade_date", "getSec_fee", "getTaf_fee", "getRoute", "()Lrosetta/mainst/Route;", "getCl_ord_id", "getRounded_notional", "getNbbo_ask_price", "getNbbo_ask_quantity", "getNbbo_ask_venue", "()Lrosetta/mainst/Venue;", "getNbbo_bid_price", "getNbbo_bid_quantity", "getNbbo_bid_venue", "getNbbo_exchange_timestamp", "getPending_execution_id", "getPrice_source_execution_id", "getTrade_break_agent", "()Lrosetta/mainst/TradeBreakAgent;", "getProcessed_at", "getCapacity", "()Lrosetta/mainst/Capacity;", "getLimit_up_price", "getLimit_down_price", "()Lcom/robinhood/rosetta/mainst/NullableBool;", "getNotional_execution", "getClearing_quantity", "getNotional_fill", "getOr_fee", "getOcc_fee", "getTrade_match_id", "getExchange_fee", "getBase_currency_traded", "getSide", "()Lrosetta/mainst/Side;", "getPosition_id", "getNon_denominated_currency_traded", "getUti", "getRel_tx_id", "getFx_fee_in_bps", "getContra_firm_account", "getEstimated_next_settlement_time", "getAssociated_fx_execution_id", "getLast_liquidity_ind", "()Lrosetta/mainst/LastLiquidityInd;", "getExecution_fees", "()Lcom/robinhood/rosetta/mainst/ExecutionFees;", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Execution extends Message {

    @JvmField
    public static final ProtoAdapter<Execution> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "associatedFxExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 54, tag = 56)
    private final UUID associated_fx_execution_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "baseCurrencyTraded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 45, tag = 47)
    private final Decimal base_currency_traded;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "brokenAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Time broken_at;

    @WireField(adapter = "rosetta.mainst.Capacity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 35)
    private final Capacity capacity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "clOrdId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final NullableString cl_ord_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "clearingQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 40)
    private final Decimal clearing_quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final Decimal commission;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "commissionCurrency", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final NullableString commission_currency;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "commissionType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final NullableString commission_type;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "contraFirmAccount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 52, tag = 54)
    private final NullableString contra_firm_account;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "estimatedNextSettlementTime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 53, tag = 55)
    private final Time estimated_next_settlement_time;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "exchangeFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 44, tag = 46)
    private final Decimal exchange_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "execBroker", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String exec_broker;

    @WireField(adapter = "com.robinhood.rosetta.mainst.ExecutionFees#ADAPTER", jsonName = "executionFees", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 56, tag = 58)
    private final ExecutionFees execution_fees;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "executionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String execution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean fill;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "fxFeeInBps", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 51, tag = 53)
    private final Decimal fx_fee_in_bps;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final UUID id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableBool#ADAPTER", jsonName = "isAdjustment", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 38)
    private final NullableBool is_adjustment;

    @WireField(adapter = "rosetta.mainst.LastLiquidityInd#ADAPTER", jsonName = "lastLiquidityInd", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 55, tag = 57)
    private final LastLiquidityInd last_liquidity_ind;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "legId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final NullableString leg_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "limitDownPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 37)
    private final Decimal limit_down_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "limitUpPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 36)
    private final Decimal limit_up_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableInt#ADAPTER", jsonName = "liquidityInd", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final NullableInt liquidity_ind;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nbboAskPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final Decimal nbbo_ask_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nbboAskQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final Decimal nbbo_ask_quantity;

    @WireField(adapter = "rosetta.mainst.Venue#ADAPTER", jsonName = "nbboAskVenue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final Venue nbbo_ask_venue;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nbboBidPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final Decimal nbbo_bid_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nbboBidQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final Decimal nbbo_bid_quantity;

    @WireField(adapter = "rosetta.mainst.Venue#ADAPTER", jsonName = "nbboBidVenue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final Venue nbbo_bid_venue;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "nbboExchangeTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final Time nbbo_exchange_timestamp;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "nonDenominatedCurrencyTraded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 48, tag = 50)
    private final Decimal non_denominated_currency_traded;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notionalExecution", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 39)
    private final boolean notional_execution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notionalFill", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 40, tag = 41)
    private final boolean notional_fill;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "occFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 43)
    private final Decimal occ_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "orFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 42)
    private final Decimal or_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "orderId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UUID order_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "pendingExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final UUID pending_execution_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "positionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 47, tag = 49)
    private final NullableString position_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Decimal price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.UUID#ADAPTER", jsonName = "priceSourceExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final UUID price_source_execution_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "processedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 34)
    private final Time processed_at;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Decimal quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "relTxId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 50, tag = 52)
    private final NullableString rel_tx_id;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "roundedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final Decimal rounded_notional;

    @WireField(adapter = "rosetta.mainst.Route#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final Route route;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "secFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Decimal sec_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "settlementDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final Time settlement_date;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "settlementType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final NullableString settlement_type;

    @WireField(adapter = "rosetta.mainst.Side#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 46, tag = 48)
    private final Side side;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "tafFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final Decimal taf_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Time timestamp;

    @WireField(adapter = "rosetta.mainst.TradeBreakAgent#ADAPTER", jsonName = "tradeBreakAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final TradeBreakAgent trade_break_agent;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Time#ADAPTER", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final Time trade_date;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", jsonName = "tradeMatchId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 43, tag = 44)
    private final NullableString trade_match_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "updateCount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final int update_count;

    @WireField(adapter = "com.robinhood.rosetta.mainst.NullableString#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 49, tag = 51)
    private final NullableString uti;

    public Execution() {
        this(null, null, null, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 67108863, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Execution(UUID uuid, UUID uuid2, Decimal decimal, Decimal decimal2, Time time, String str, Time time2, boolean z, String str2, int i, NullableString nullableString, Decimal decimal3, NullableString nullableString2, NullableString nullableString3, NullableInt nullableInt, NullableString nullableString4, Time time3, Time time4, Decimal decimal4, Decimal decimal5, Route route, NullableString nullableString5, Decimal decimal6, Decimal decimal7, Decimal decimal8, Venue venue, Decimal decimal9, Decimal decimal10, Venue venue2, Time time5, UUID uuid3, UUID uuid4, TradeBreakAgent tradeBreakAgent, Time time6, Capacity capacity, Decimal decimal11, Decimal decimal12, NullableBool nullableBool, boolean z2, Decimal decimal13, boolean z3, Decimal decimal14, Decimal decimal15, NullableString nullableString6, Decimal decimal16, Decimal decimal17, Side side, NullableString nullableString7, Decimal decimal18, NullableString nullableString8, NullableString nullableString9, Decimal decimal19, NullableString nullableString10, Time time7, UUID uuid5, LastLiquidityInd lastLiquidityInd, ExecutionFees executionFees, ByteString byteString, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        UUID uuid6 = (i2 & 1) != 0 ? null : uuid;
        this(uuid6, (i2 & 2) != 0 ? null : uuid2, (i2 & 4) != 0 ? null : decimal, (i2 & 8) != 0 ? null : decimal2, (i2 & 16) != 0 ? null : time, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : time2, (i2 & 128) != 0 ? false : z, (i2 & 256) == 0 ? str2 : "", (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? null : nullableString, (i2 & 2048) != 0 ? null : decimal3, (i2 & 4096) != 0 ? null : nullableString2, (i2 & 8192) != 0 ? null : nullableString3, (i2 & 16384) != 0 ? null : nullableInt, (i2 & 32768) != 0 ? null : nullableString4, (i2 & 65536) != 0 ? null : time3, (i2 & 131072) != 0 ? null : time4, (i2 & 262144) != 0 ? null : decimal4, (i2 & 524288) != 0 ? null : decimal5, (i2 & 1048576) != 0 ? Route.ROUTE_UNSPECIFIED : route, (i2 & 2097152) != 0 ? null : nullableString5, (i2 & 4194304) != 0 ? null : decimal6, (i2 & 8388608) != 0 ? null : decimal7, (i2 & 16777216) != 0 ? null : decimal8, (i2 & 33554432) != 0 ? Venue.VENUE_UNSPECIFIED : venue, (i2 & 67108864) != 0 ? null : decimal9, (i2 & 134217728) != 0 ? null : decimal10, (i2 & 268435456) != 0 ? Venue.VENUE_UNSPECIFIED : venue2, (i2 & 536870912) != 0 ? null : time5, (i2 & 1073741824) != 0 ? null : uuid3, (i2 & Integer.MIN_VALUE) != 0 ? null : uuid4, (i3 & 1) != 0 ? TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED : tradeBreakAgent, (i3 & 2) != 0 ? null : time6, (i3 & 4) != 0 ? Capacity.CAPACITY_UNSPECIFIED : capacity, (i3 & 8) != 0 ? null : decimal11, (i3 & 16) != 0 ? null : decimal12, (i3 & 32) != 0 ? null : nullableBool, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? null : decimal13, (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? null : decimal14, (i3 & 1024) != 0 ? null : decimal15, (i3 & 2048) != 0 ? null : nullableString6, (i3 & 4096) != 0 ? null : decimal16, (i3 & 8192) != 0 ? null : decimal17, (i3 & 16384) != 0 ? Side.SIDE_UNSPECIFIED : side, (i3 & 32768) != 0 ? null : nullableString7, (i3 & 65536) != 0 ? null : decimal18, (i3 & 131072) != 0 ? null : nullableString8, (i3 & 262144) != 0 ? null : nullableString9, (i3 & 524288) != 0 ? null : decimal19, (i3 & 1048576) != 0 ? null : nullableString10, (i3 & 2097152) != 0 ? null : time7, (i3 & 4194304) != 0 ? null : uuid5, (i3 & 8388608) != 0 ? LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED : lastLiquidityInd, (i3 & 16777216) != 0 ? null : executionFees, (i3 & 33554432) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24654newBuilder();
    }

    public final UUID getOrder_id() {
        return this.order_id;
    }

    public final UUID getId() {
        return this.id;
    }

    public final Decimal getQuantity() {
        return this.quantity;
    }

    public final Decimal getPrice() {
        return this.price;
    }

    public final Time getTimestamp() {
        return this.timestamp;
    }

    public final String getExecution_id() {
        return this.execution_id;
    }

    public final Time getBroken_at() {
        return this.broken_at;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final String getExec_broker() {
        return this.exec_broker;
    }

    public final int getUpdate_count() {
        return this.update_count;
    }

    public final NullableString getLeg_id() {
        return this.leg_id;
    }

    public final Decimal getCommission() {
        return this.commission;
    }

    public final NullableString getCommission_currency() {
        return this.commission_currency;
    }

    public final NullableString getCommission_type() {
        return this.commission_type;
    }

    public final NullableInt getLiquidity_ind() {
        return this.liquidity_ind;
    }

    public final NullableString getSettlement_type() {
        return this.settlement_type;
    }

    public final Time getSettlement_date() {
        return this.settlement_date;
    }

    public final Time getTrade_date() {
        return this.trade_date;
    }

    public final Decimal getSec_fee() {
        return this.sec_fee;
    }

    public final Decimal getTaf_fee() {
        return this.taf_fee;
    }

    public final Route getRoute() {
        return this.route;
    }

    public final NullableString getCl_ord_id() {
        return this.cl_ord_id;
    }

    public final Decimal getRounded_notional() {
        return this.rounded_notional;
    }

    public final Decimal getNbbo_ask_price() {
        return this.nbbo_ask_price;
    }

    public final Decimal getNbbo_ask_quantity() {
        return this.nbbo_ask_quantity;
    }

    public final Venue getNbbo_ask_venue() {
        return this.nbbo_ask_venue;
    }

    public final Decimal getNbbo_bid_price() {
        return this.nbbo_bid_price;
    }

    public final Decimal getNbbo_bid_quantity() {
        return this.nbbo_bid_quantity;
    }

    public final Venue getNbbo_bid_venue() {
        return this.nbbo_bid_venue;
    }

    public final Time getNbbo_exchange_timestamp() {
        return this.nbbo_exchange_timestamp;
    }

    public final UUID getPending_execution_id() {
        return this.pending_execution_id;
    }

    public final UUID getPrice_source_execution_id() {
        return this.price_source_execution_id;
    }

    public final TradeBreakAgent getTrade_break_agent() {
        return this.trade_break_agent;
    }

    public final Time getProcessed_at() {
        return this.processed_at;
    }

    public final Capacity getCapacity() {
        return this.capacity;
    }

    public final Decimal getLimit_up_price() {
        return this.limit_up_price;
    }

    public final Decimal getLimit_down_price() {
        return this.limit_down_price;
    }

    /* renamed from: is_adjustment, reason: from getter */
    public final NullableBool getIs_adjustment() {
        return this.is_adjustment;
    }

    public final boolean getNotional_execution() {
        return this.notional_execution;
    }

    public final Decimal getClearing_quantity() {
        return this.clearing_quantity;
    }

    public final boolean getNotional_fill() {
        return this.notional_fill;
    }

    public final Decimal getOr_fee() {
        return this.or_fee;
    }

    public final Decimal getOcc_fee() {
        return this.occ_fee;
    }

    public final NullableString getTrade_match_id() {
        return this.trade_match_id;
    }

    public final Decimal getExchange_fee() {
        return this.exchange_fee;
    }

    public final Decimal getBase_currency_traded() {
        return this.base_currency_traded;
    }

    public final Side getSide() {
        return this.side;
    }

    public final NullableString getPosition_id() {
        return this.position_id;
    }

    public final Decimal getNon_denominated_currency_traded() {
        return this.non_denominated_currency_traded;
    }

    public final NullableString getUti() {
        return this.uti;
    }

    public final NullableString getRel_tx_id() {
        return this.rel_tx_id;
    }

    public final Decimal getFx_fee_in_bps() {
        return this.fx_fee_in_bps;
    }

    public final NullableString getContra_firm_account() {
        return this.contra_firm_account;
    }

    public final Time getEstimated_next_settlement_time() {
        return this.estimated_next_settlement_time;
    }

    public final UUID getAssociated_fx_execution_id() {
        return this.associated_fx_execution_id;
    }

    public final LastLiquidityInd getLast_liquidity_ind() {
        return this.last_liquidity_ind;
    }

    public final ExecutionFees getExecution_fees() {
        return this.execution_fees;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Execution(UUID uuid, UUID uuid2, Decimal decimal, Decimal decimal2, Time time, String execution_id, Time time2, boolean z, String exec_broker, int i, NullableString nullableString, Decimal decimal3, NullableString nullableString2, NullableString nullableString3, NullableInt nullableInt, NullableString nullableString4, Time time3, Time time4, Decimal decimal4, Decimal decimal5, Route route, NullableString nullableString5, Decimal decimal6, Decimal decimal7, Decimal decimal8, Venue nbbo_ask_venue, Decimal decimal9, Decimal decimal10, Venue nbbo_bid_venue, Time time5, UUID uuid3, UUID uuid4, TradeBreakAgent trade_break_agent, Time time6, Capacity capacity, Decimal decimal11, Decimal decimal12, NullableBool nullableBool, boolean z2, Decimal decimal13, boolean z3, Decimal decimal14, Decimal decimal15, NullableString nullableString6, Decimal decimal16, Decimal decimal17, Side side, NullableString nullableString7, Decimal decimal18, NullableString nullableString8, NullableString nullableString9, Decimal decimal19, NullableString nullableString10, Time time7, UUID uuid5, LastLiquidityInd last_liquidity_ind, ExecutionFees executionFees, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(nbbo_ask_venue, "nbbo_ask_venue");
        Intrinsics.checkNotNullParameter(nbbo_bid_venue, "nbbo_bid_venue");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_id = uuid;
        this.id = uuid2;
        this.quantity = decimal;
        this.price = decimal2;
        this.timestamp = time;
        this.execution_id = execution_id;
        this.broken_at = time2;
        this.fill = z;
        this.exec_broker = exec_broker;
        this.update_count = i;
        this.leg_id = nullableString;
        this.commission = decimal3;
        this.commission_currency = nullableString2;
        this.commission_type = nullableString3;
        this.liquidity_ind = nullableInt;
        this.settlement_type = nullableString4;
        this.settlement_date = time3;
        this.trade_date = time4;
        this.sec_fee = decimal4;
        this.taf_fee = decimal5;
        this.route = route;
        this.cl_ord_id = nullableString5;
        this.rounded_notional = decimal6;
        this.nbbo_ask_price = decimal7;
        this.nbbo_ask_quantity = decimal8;
        this.nbbo_ask_venue = nbbo_ask_venue;
        this.nbbo_bid_price = decimal9;
        this.nbbo_bid_quantity = decimal10;
        this.nbbo_bid_venue = nbbo_bid_venue;
        this.nbbo_exchange_timestamp = time5;
        this.pending_execution_id = uuid3;
        this.price_source_execution_id = uuid4;
        this.trade_break_agent = trade_break_agent;
        this.processed_at = time6;
        this.capacity = capacity;
        this.limit_up_price = decimal11;
        this.limit_down_price = decimal12;
        this.is_adjustment = nullableBool;
        this.notional_execution = z2;
        this.clearing_quantity = decimal13;
        this.notional_fill = z3;
        this.or_fee = decimal14;
        this.occ_fee = decimal15;
        this.trade_match_id = nullableString6;
        this.exchange_fee = decimal16;
        this.base_currency_traded = decimal17;
        this.side = side;
        this.position_id = nullableString7;
        this.non_denominated_currency_traded = decimal18;
        this.uti = nullableString8;
        this.rel_tx_id = nullableString9;
        this.fx_fee_in_bps = decimal19;
        this.contra_firm_account = nullableString10;
        this.estimated_next_settlement_time = time7;
        this.associated_fx_execution_id = uuid5;
        this.last_liquidity_ind = last_liquidity_ind;
        this.execution_fees = executionFees;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24654newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Execution)) {
            return false;
        }
        Execution execution = (Execution) other;
        return Intrinsics.areEqual(unknownFields(), execution.unknownFields()) && Intrinsics.areEqual(this.order_id, execution.order_id) && Intrinsics.areEqual(this.id, execution.id) && Intrinsics.areEqual(this.quantity, execution.quantity) && Intrinsics.areEqual(this.price, execution.price) && Intrinsics.areEqual(this.timestamp, execution.timestamp) && Intrinsics.areEqual(this.execution_id, execution.execution_id) && Intrinsics.areEqual(this.broken_at, execution.broken_at) && this.fill == execution.fill && Intrinsics.areEqual(this.exec_broker, execution.exec_broker) && this.update_count == execution.update_count && Intrinsics.areEqual(this.leg_id, execution.leg_id) && Intrinsics.areEqual(this.commission, execution.commission) && Intrinsics.areEqual(this.commission_currency, execution.commission_currency) && Intrinsics.areEqual(this.commission_type, execution.commission_type) && Intrinsics.areEqual(this.liquidity_ind, execution.liquidity_ind) && Intrinsics.areEqual(this.settlement_type, execution.settlement_type) && Intrinsics.areEqual(this.settlement_date, execution.settlement_date) && Intrinsics.areEqual(this.trade_date, execution.trade_date) && Intrinsics.areEqual(this.sec_fee, execution.sec_fee) && Intrinsics.areEqual(this.taf_fee, execution.taf_fee) && this.route == execution.route && Intrinsics.areEqual(this.cl_ord_id, execution.cl_ord_id) && Intrinsics.areEqual(this.rounded_notional, execution.rounded_notional) && Intrinsics.areEqual(this.nbbo_ask_price, execution.nbbo_ask_price) && Intrinsics.areEqual(this.nbbo_ask_quantity, execution.nbbo_ask_quantity) && this.nbbo_ask_venue == execution.nbbo_ask_venue && Intrinsics.areEqual(this.nbbo_bid_price, execution.nbbo_bid_price) && Intrinsics.areEqual(this.nbbo_bid_quantity, execution.nbbo_bid_quantity) && this.nbbo_bid_venue == execution.nbbo_bid_venue && Intrinsics.areEqual(this.nbbo_exchange_timestamp, execution.nbbo_exchange_timestamp) && Intrinsics.areEqual(this.pending_execution_id, execution.pending_execution_id) && Intrinsics.areEqual(this.price_source_execution_id, execution.price_source_execution_id) && this.trade_break_agent == execution.trade_break_agent && Intrinsics.areEqual(this.processed_at, execution.processed_at) && this.capacity == execution.capacity && Intrinsics.areEqual(this.limit_up_price, execution.limit_up_price) && Intrinsics.areEqual(this.limit_down_price, execution.limit_down_price) && Intrinsics.areEqual(this.is_adjustment, execution.is_adjustment) && this.notional_execution == execution.notional_execution && Intrinsics.areEqual(this.clearing_quantity, execution.clearing_quantity) && this.notional_fill == execution.notional_fill && Intrinsics.areEqual(this.or_fee, execution.or_fee) && Intrinsics.areEqual(this.occ_fee, execution.occ_fee) && Intrinsics.areEqual(this.trade_match_id, execution.trade_match_id) && Intrinsics.areEqual(this.exchange_fee, execution.exchange_fee) && Intrinsics.areEqual(this.base_currency_traded, execution.base_currency_traded) && this.side == execution.side && Intrinsics.areEqual(this.position_id, execution.position_id) && Intrinsics.areEqual(this.non_denominated_currency_traded, execution.non_denominated_currency_traded) && Intrinsics.areEqual(this.uti, execution.uti) && Intrinsics.areEqual(this.rel_tx_id, execution.rel_tx_id) && Intrinsics.areEqual(this.fx_fee_in_bps, execution.fx_fee_in_bps) && Intrinsics.areEqual(this.contra_firm_account, execution.contra_firm_account) && Intrinsics.areEqual(this.estimated_next_settlement_time, execution.estimated_next_settlement_time) && Intrinsics.areEqual(this.associated_fx_execution_id, execution.associated_fx_execution_id) && this.last_liquidity_ind == execution.last_liquidity_ind && Intrinsics.areEqual(this.execution_fees, execution.execution_fees);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UUID uuid = this.order_id;
        int iHashCode2 = (iHashCode + (uuid != null ? uuid.hashCode() : 0)) * 37;
        UUID uuid2 = this.id;
        int iHashCode3 = (iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 37;
        Decimal decimal = this.quantity;
        int iHashCode4 = (iHashCode3 + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.price;
        int iHashCode5 = (iHashCode4 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Time time = this.timestamp;
        int iHashCode6 = (((iHashCode5 + (time != null ? time.hashCode() : 0)) * 37) + this.execution_id.hashCode()) * 37;
        Time time2 = this.broken_at;
        int iHashCode7 = (((((((iHashCode6 + (time2 != null ? time2.hashCode() : 0)) * 37) + Boolean.hashCode(this.fill)) * 37) + this.exec_broker.hashCode()) * 37) + Integer.hashCode(this.update_count)) * 37;
        NullableString nullableString = this.leg_id;
        int iHashCode8 = (iHashCode7 + (nullableString != null ? nullableString.hashCode() : 0)) * 37;
        Decimal decimal3 = this.commission;
        int iHashCode9 = (iHashCode8 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        NullableString nullableString2 = this.commission_currency;
        int iHashCode10 = (iHashCode9 + (nullableString2 != null ? nullableString2.hashCode() : 0)) * 37;
        NullableString nullableString3 = this.commission_type;
        int iHashCode11 = (iHashCode10 + (nullableString3 != null ? nullableString3.hashCode() : 0)) * 37;
        NullableInt nullableInt = this.liquidity_ind;
        int iHashCode12 = (iHashCode11 + (nullableInt != null ? nullableInt.hashCode() : 0)) * 37;
        NullableString nullableString4 = this.settlement_type;
        int iHashCode13 = (iHashCode12 + (nullableString4 != null ? nullableString4.hashCode() : 0)) * 37;
        Time time3 = this.settlement_date;
        int iHashCode14 = (iHashCode13 + (time3 != null ? time3.hashCode() : 0)) * 37;
        Time time4 = this.trade_date;
        int iHashCode15 = (iHashCode14 + (time4 != null ? time4.hashCode() : 0)) * 37;
        Decimal decimal4 = this.sec_fee;
        int iHashCode16 = (iHashCode15 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37;
        Decimal decimal5 = this.taf_fee;
        int iHashCode17 = (((iHashCode16 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37) + this.route.hashCode()) * 37;
        NullableString nullableString5 = this.cl_ord_id;
        int iHashCode18 = (iHashCode17 + (nullableString5 != null ? nullableString5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.rounded_notional;
        int iHashCode19 = (iHashCode18 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37;
        Decimal decimal7 = this.nbbo_ask_price;
        int iHashCode20 = (iHashCode19 + (decimal7 != null ? decimal7.hashCode() : 0)) * 37;
        Decimal decimal8 = this.nbbo_ask_quantity;
        int iHashCode21 = (((iHashCode20 + (decimal8 != null ? decimal8.hashCode() : 0)) * 37) + this.nbbo_ask_venue.hashCode()) * 37;
        Decimal decimal9 = this.nbbo_bid_price;
        int iHashCode22 = (iHashCode21 + (decimal9 != null ? decimal9.hashCode() : 0)) * 37;
        Decimal decimal10 = this.nbbo_bid_quantity;
        int iHashCode23 = (((iHashCode22 + (decimal10 != null ? decimal10.hashCode() : 0)) * 37) + this.nbbo_bid_venue.hashCode()) * 37;
        Time time5 = this.nbbo_exchange_timestamp;
        int iHashCode24 = (iHashCode23 + (time5 != null ? time5.hashCode() : 0)) * 37;
        UUID uuid3 = this.pending_execution_id;
        int iHashCode25 = (iHashCode24 + (uuid3 != null ? uuid3.hashCode() : 0)) * 37;
        UUID uuid4 = this.price_source_execution_id;
        int iHashCode26 = (((iHashCode25 + (uuid4 != null ? uuid4.hashCode() : 0)) * 37) + this.trade_break_agent.hashCode()) * 37;
        Time time6 = this.processed_at;
        int iHashCode27 = (((iHashCode26 + (time6 != null ? time6.hashCode() : 0)) * 37) + this.capacity.hashCode()) * 37;
        Decimal decimal11 = this.limit_up_price;
        int iHashCode28 = (iHashCode27 + (decimal11 != null ? decimal11.hashCode() : 0)) * 37;
        Decimal decimal12 = this.limit_down_price;
        int iHashCode29 = (iHashCode28 + (decimal12 != null ? decimal12.hashCode() : 0)) * 37;
        NullableBool nullableBool = this.is_adjustment;
        int iHashCode30 = (((iHashCode29 + (nullableBool != null ? nullableBool.hashCode() : 0)) * 37) + Boolean.hashCode(this.notional_execution)) * 37;
        Decimal decimal13 = this.clearing_quantity;
        int iHashCode31 = (((iHashCode30 + (decimal13 != null ? decimal13.hashCode() : 0)) * 37) + Boolean.hashCode(this.notional_fill)) * 37;
        Decimal decimal14 = this.or_fee;
        int iHashCode32 = (iHashCode31 + (decimal14 != null ? decimal14.hashCode() : 0)) * 37;
        Decimal decimal15 = this.occ_fee;
        int iHashCode33 = (iHashCode32 + (decimal15 != null ? decimal15.hashCode() : 0)) * 37;
        NullableString nullableString6 = this.trade_match_id;
        int iHashCode34 = (iHashCode33 + (nullableString6 != null ? nullableString6.hashCode() : 0)) * 37;
        Decimal decimal16 = this.exchange_fee;
        int iHashCode35 = (iHashCode34 + (decimal16 != null ? decimal16.hashCode() : 0)) * 37;
        Decimal decimal17 = this.base_currency_traded;
        int iHashCode36 = (((iHashCode35 + (decimal17 != null ? decimal17.hashCode() : 0)) * 37) + this.side.hashCode()) * 37;
        NullableString nullableString7 = this.position_id;
        int iHashCode37 = (iHashCode36 + (nullableString7 != null ? nullableString7.hashCode() : 0)) * 37;
        Decimal decimal18 = this.non_denominated_currency_traded;
        int iHashCode38 = (iHashCode37 + (decimal18 != null ? decimal18.hashCode() : 0)) * 37;
        NullableString nullableString8 = this.uti;
        int iHashCode39 = (iHashCode38 + (nullableString8 != null ? nullableString8.hashCode() : 0)) * 37;
        NullableString nullableString9 = this.rel_tx_id;
        int iHashCode40 = (iHashCode39 + (nullableString9 != null ? nullableString9.hashCode() : 0)) * 37;
        Decimal decimal19 = this.fx_fee_in_bps;
        int iHashCode41 = (iHashCode40 + (decimal19 != null ? decimal19.hashCode() : 0)) * 37;
        NullableString nullableString10 = this.contra_firm_account;
        int iHashCode42 = (iHashCode41 + (nullableString10 != null ? nullableString10.hashCode() : 0)) * 37;
        Time time7 = this.estimated_next_settlement_time;
        int iHashCode43 = (iHashCode42 + (time7 != null ? time7.hashCode() : 0)) * 37;
        UUID uuid5 = this.associated_fx_execution_id;
        int iHashCode44 = (((iHashCode43 + (uuid5 != null ? uuid5.hashCode() : 0)) * 37) + this.last_liquidity_ind.hashCode()) * 37;
        ExecutionFees executionFees = this.execution_fees;
        int iHashCode45 = iHashCode44 + (executionFees != null ? executionFees.hashCode() : 0);
        this.hashCode = iHashCode45;
        return iHashCode45;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UUID uuid = this.order_id;
        if (uuid != null) {
            arrayList.add("order_id=" + uuid);
        }
        UUID uuid2 = this.id;
        if (uuid2 != null) {
            arrayList.add("id=" + uuid2);
        }
        Decimal decimal = this.quantity;
        if (decimal != null) {
            arrayList.add("quantity=" + decimal);
        }
        Decimal decimal2 = this.price;
        if (decimal2 != null) {
            arrayList.add("price=" + decimal2);
        }
        Time time = this.timestamp;
        if (time != null) {
            arrayList.add("timestamp=" + time);
        }
        arrayList.add("execution_id=" + Internal.sanitize(this.execution_id));
        Time time2 = this.broken_at;
        if (time2 != null) {
            arrayList.add("broken_at=" + time2);
        }
        arrayList.add("fill=" + this.fill);
        arrayList.add("exec_broker=" + Internal.sanitize(this.exec_broker));
        arrayList.add("update_count=" + this.update_count);
        NullableString nullableString = this.leg_id;
        if (nullableString != null) {
            arrayList.add("leg_id=" + nullableString);
        }
        Decimal decimal3 = this.commission;
        if (decimal3 != null) {
            arrayList.add("commission=" + decimal3);
        }
        NullableString nullableString2 = this.commission_currency;
        if (nullableString2 != null) {
            arrayList.add("commission_currency=" + nullableString2);
        }
        NullableString nullableString3 = this.commission_type;
        if (nullableString3 != null) {
            arrayList.add("commission_type=" + nullableString3);
        }
        NullableInt nullableInt = this.liquidity_ind;
        if (nullableInt != null) {
            arrayList.add("liquidity_ind=" + nullableInt);
        }
        NullableString nullableString4 = this.settlement_type;
        if (nullableString4 != null) {
            arrayList.add("settlement_type=" + nullableString4);
        }
        Time time3 = this.settlement_date;
        if (time3 != null) {
            arrayList.add("settlement_date=" + time3);
        }
        Time time4 = this.trade_date;
        if (time4 != null) {
            arrayList.add("trade_date=" + time4);
        }
        Decimal decimal4 = this.sec_fee;
        if (decimal4 != null) {
            arrayList.add("sec_fee=" + decimal4);
        }
        Decimal decimal5 = this.taf_fee;
        if (decimal5 != null) {
            arrayList.add("taf_fee=" + decimal5);
        }
        arrayList.add("route=" + this.route);
        NullableString nullableString5 = this.cl_ord_id;
        if (nullableString5 != null) {
            arrayList.add("cl_ord_id=" + nullableString5);
        }
        Decimal decimal6 = this.rounded_notional;
        if (decimal6 != null) {
            arrayList.add("rounded_notional=" + decimal6);
        }
        Decimal decimal7 = this.nbbo_ask_price;
        if (decimal7 != null) {
            arrayList.add("nbbo_ask_price=" + decimal7);
        }
        Decimal decimal8 = this.nbbo_ask_quantity;
        if (decimal8 != null) {
            arrayList.add("nbbo_ask_quantity=" + decimal8);
        }
        arrayList.add("nbbo_ask_venue=" + this.nbbo_ask_venue);
        Decimal decimal9 = this.nbbo_bid_price;
        if (decimal9 != null) {
            arrayList.add("nbbo_bid_price=" + decimal9);
        }
        Decimal decimal10 = this.nbbo_bid_quantity;
        if (decimal10 != null) {
            arrayList.add("nbbo_bid_quantity=" + decimal10);
        }
        arrayList.add("nbbo_bid_venue=" + this.nbbo_bid_venue);
        Time time5 = this.nbbo_exchange_timestamp;
        if (time5 != null) {
            arrayList.add("nbbo_exchange_timestamp=" + time5);
        }
        UUID uuid3 = this.pending_execution_id;
        if (uuid3 != null) {
            arrayList.add("pending_execution_id=" + uuid3);
        }
        UUID uuid4 = this.price_source_execution_id;
        if (uuid4 != null) {
            arrayList.add("price_source_execution_id=" + uuid4);
        }
        arrayList.add("trade_break_agent=" + this.trade_break_agent);
        Time time6 = this.processed_at;
        if (time6 != null) {
            arrayList.add("processed_at=" + time6);
        }
        arrayList.add("capacity=" + this.capacity);
        Decimal decimal11 = this.limit_up_price;
        if (decimal11 != null) {
            arrayList.add("limit_up_price=" + decimal11);
        }
        Decimal decimal12 = this.limit_down_price;
        if (decimal12 != null) {
            arrayList.add("limit_down_price=" + decimal12);
        }
        NullableBool nullableBool = this.is_adjustment;
        if (nullableBool != null) {
            arrayList.add("is_adjustment=" + nullableBool);
        }
        arrayList.add("notional_execution=" + this.notional_execution);
        Decimal decimal13 = this.clearing_quantity;
        if (decimal13 != null) {
            arrayList.add("clearing_quantity=" + decimal13);
        }
        arrayList.add("notional_fill=" + this.notional_fill);
        Decimal decimal14 = this.or_fee;
        if (decimal14 != null) {
            arrayList.add("or_fee=" + decimal14);
        }
        Decimal decimal15 = this.occ_fee;
        if (decimal15 != null) {
            arrayList.add("occ_fee=" + decimal15);
        }
        NullableString nullableString6 = this.trade_match_id;
        if (nullableString6 != null) {
            arrayList.add("trade_match_id=" + nullableString6);
        }
        Decimal decimal16 = this.exchange_fee;
        if (decimal16 != null) {
            arrayList.add("exchange_fee=" + decimal16);
        }
        Decimal decimal17 = this.base_currency_traded;
        if (decimal17 != null) {
            arrayList.add("base_currency_traded=" + decimal17);
        }
        arrayList.add("side=" + this.side);
        NullableString nullableString7 = this.position_id;
        if (nullableString7 != null) {
            arrayList.add("position_id=" + nullableString7);
        }
        Decimal decimal18 = this.non_denominated_currency_traded;
        if (decimal18 != null) {
            arrayList.add("non_denominated_currency_traded=" + decimal18);
        }
        NullableString nullableString8 = this.uti;
        if (nullableString8 != null) {
            arrayList.add("uti=" + nullableString8);
        }
        NullableString nullableString9 = this.rel_tx_id;
        if (nullableString9 != null) {
            arrayList.add("rel_tx_id=" + nullableString9);
        }
        Decimal decimal19 = this.fx_fee_in_bps;
        if (decimal19 != null) {
            arrayList.add("fx_fee_in_bps=" + decimal19);
        }
        NullableString nullableString10 = this.contra_firm_account;
        if (nullableString10 != null) {
            arrayList.add("contra_firm_account=" + nullableString10);
        }
        Time time7 = this.estimated_next_settlement_time;
        if (time7 != null) {
            arrayList.add("estimated_next_settlement_time=" + time7);
        }
        UUID uuid5 = this.associated_fx_execution_id;
        if (uuid5 != null) {
            arrayList.add("associated_fx_execution_id=" + uuid5);
        }
        arrayList.add("last_liquidity_ind=" + this.last_liquidity_ind);
        ExecutionFees executionFees = this.execution_fees;
        if (executionFees != null) {
            arrayList.add("execution_fees=" + executionFees);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Execution{", "}", 0, null, null, 56, null);
    }

    public final Execution copy(UUID order_id, UUID id, Decimal quantity, Decimal price, Time timestamp, String execution_id, Time broken_at, boolean fill, String exec_broker, int update_count, NullableString leg_id, Decimal commission, NullableString commission_currency, NullableString commission_type, NullableInt liquidity_ind, NullableString settlement_type, Time settlement_date, Time trade_date, Decimal sec_fee, Decimal taf_fee, Route route, NullableString cl_ord_id, Decimal rounded_notional, Decimal nbbo_ask_price, Decimal nbbo_ask_quantity, Venue nbbo_ask_venue, Decimal nbbo_bid_price, Decimal nbbo_bid_quantity, Venue nbbo_bid_venue, Time nbbo_exchange_timestamp, UUID pending_execution_id, UUID price_source_execution_id, TradeBreakAgent trade_break_agent, Time processed_at, Capacity capacity, Decimal limit_up_price, Decimal limit_down_price, NullableBool is_adjustment, boolean notional_execution, Decimal clearing_quantity, boolean notional_fill, Decimal or_fee, Decimal occ_fee, NullableString trade_match_id, Decimal exchange_fee, Decimal base_currency_traded, Side side, NullableString position_id, Decimal non_denominated_currency_traded, NullableString uti, NullableString rel_tx_id, Decimal fx_fee_in_bps, NullableString contra_firm_account, Time estimated_next_settlement_time, UUID associated_fx_execution_id, LastLiquidityInd last_liquidity_ind, ExecutionFees execution_fees, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(execution_id, "execution_id");
        Intrinsics.checkNotNullParameter(exec_broker, "exec_broker");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(nbbo_ask_venue, "nbbo_ask_venue");
        Intrinsics.checkNotNullParameter(nbbo_bid_venue, "nbbo_bid_venue");
        Intrinsics.checkNotNullParameter(trade_break_agent, "trade_break_agent");
        Intrinsics.checkNotNullParameter(capacity, "capacity");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(last_liquidity_ind, "last_liquidity_ind");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Execution(order_id, id, quantity, price, timestamp, execution_id, broken_at, fill, exec_broker, update_count, leg_id, commission, commission_currency, commission_type, liquidity_ind, settlement_type, settlement_date, trade_date, sec_fee, taf_fee, route, cl_ord_id, rounded_notional, nbbo_ask_price, nbbo_ask_quantity, nbbo_ask_venue, nbbo_bid_price, nbbo_bid_quantity, nbbo_bid_venue, nbbo_exchange_timestamp, pending_execution_id, price_source_execution_id, trade_break_agent, processed_at, capacity, limit_up_price, limit_down_price, is_adjustment, notional_execution, clearing_quantity, notional_fill, or_fee, occ_fee, trade_match_id, exchange_fee, base_currency_traded, side, position_id, non_denominated_currency_traded, uti, rel_tx_id, fx_fee_in_bps, contra_firm_account, estimated_next_settlement_time, associated_fx_execution_id, last_liquidity_ind, execution_fees, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Execution.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Execution>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.Execution$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Execution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(1, value.getOrder_id());
                }
                if (value.getId() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(2, value.getId());
                }
                if (value.getQuantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(3, value.getQuantity());
                }
                if (value.getPrice() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getPrice());
                }
                if (value.getTimestamp() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(5, value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getExecution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getExecution_id());
                }
                if (value.getBroken_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(7, value.getBroken_at());
                }
                if (value.getFill()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getFill()));
                }
                if (!Intrinsics.areEqual(value.getExec_broker(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getExec_broker());
                }
                if (value.getUpdate_count() != 0) {
                    size += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.getUpdate_count()));
                }
                if (value.getLeg_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(11, value.getLeg_id());
                }
                if (value.getCommission() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(12, value.getCommission());
                }
                if (value.getCommission_currency() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(13, value.getCommission_currency());
                }
                if (value.getCommission_type() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(14, value.getCommission_type());
                }
                if (value.getLiquidity_ind() != null) {
                    size += NullableInt.ADAPTER.encodedSizeWithTag(15, value.getLiquidity_ind());
                }
                if (value.getSettlement_type() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(16, value.getSettlement_type());
                }
                if (value.getSettlement_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(17, value.getSettlement_date());
                }
                if (value.getTrade_date() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(18, value.getTrade_date());
                }
                if (value.getSec_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(19, value.getSec_fee());
                }
                if (value.getTaf_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(20, value.getTaf_fee());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    size += Route.ADAPTER.encodedSizeWithTag(21, value.getRoute());
                }
                if (value.getCl_ord_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(22, value.getCl_ord_id());
                }
                if (value.getRounded_notional() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(23, value.getRounded_notional());
                }
                if (value.getNbbo_ask_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(24, value.getNbbo_ask_price());
                }
                if (value.getNbbo_ask_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(25, value.getNbbo_ask_quantity());
                }
                Venue nbbo_ask_venue = value.getNbbo_ask_venue();
                Venue venue = Venue.VENUE_UNSPECIFIED;
                if (nbbo_ask_venue != venue) {
                    size += Venue.ADAPTER.encodedSizeWithTag(26, value.getNbbo_ask_venue());
                }
                if (value.getNbbo_bid_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(27, value.getNbbo_bid_price());
                }
                if (value.getNbbo_bid_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(28, value.getNbbo_bid_quantity());
                }
                if (value.getNbbo_bid_venue() != venue) {
                    size += Venue.ADAPTER.encodedSizeWithTag(29, value.getNbbo_bid_venue());
                }
                if (value.getNbbo_exchange_timestamp() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(30, value.getNbbo_exchange_timestamp());
                }
                if (value.getPending_execution_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(31, value.getPending_execution_id());
                }
                if (value.getPrice_source_execution_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(32, value.getPrice_source_execution_id());
                }
                if (value.getTrade_break_agent() != TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED) {
                    size += TradeBreakAgent.ADAPTER.encodedSizeWithTag(33, value.getTrade_break_agent());
                }
                if (value.getProcessed_at() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(34, value.getProcessed_at());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    size += Capacity.ADAPTER.encodedSizeWithTag(35, value.getCapacity());
                }
                if (value.getLimit_up_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(36, value.getLimit_up_price());
                }
                if (value.getLimit_down_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(37, value.getLimit_down_price());
                }
                if (value.getIs_adjustment() != null) {
                    size += NullableBool.ADAPTER.encodedSizeWithTag(38, value.getIs_adjustment());
                }
                if (value.getNotional_execution()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(39, Boolean.valueOf(value.getNotional_execution()));
                }
                if (value.getClearing_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(40, value.getClearing_quantity());
                }
                if (value.getNotional_fill()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.getNotional_fill()));
                }
                if (value.getOr_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(42, value.getOr_fee());
                }
                if (value.getOcc_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(43, value.getOcc_fee());
                }
                if (value.getTrade_match_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(44, value.getTrade_match_id());
                }
                if (value.getExchange_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(46, value.getExchange_fee());
                }
                if (value.getBase_currency_traded() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(47, value.getBase_currency_traded());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    size += Side.ADAPTER.encodedSizeWithTag(48, value.getSide());
                }
                if (value.getPosition_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(49, value.getPosition_id());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(50, value.getNon_denominated_currency_traded());
                }
                if (value.getUti() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(51, value.getUti());
                }
                if (value.getRel_tx_id() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(52, value.getRel_tx_id());
                }
                if (value.getFx_fee_in_bps() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(53, value.getFx_fee_in_bps());
                }
                if (value.getContra_firm_account() != null) {
                    size += NullableString.ADAPTER.encodedSizeWithTag(54, value.getContra_firm_account());
                }
                if (value.getEstimated_next_settlement_time() != null) {
                    size += Time.ADAPTER.encodedSizeWithTag(55, value.getEstimated_next_settlement_time());
                }
                if (value.getAssociated_fx_execution_id() != null) {
                    size += UUID.ADAPTER.encodedSizeWithTag(56, value.getAssociated_fx_execution_id());
                }
                if (value.getLast_liquidity_ind() != LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED) {
                    size += LastLiquidityInd.ADAPTER.encodedSizeWithTag(57, value.getLast_liquidity_ind());
                }
                return value.getExecution_fees() != null ? size + ExecutionFees.ADAPTER.encodedSizeWithTag(58, value.getExecution_fees()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Execution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getId());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrice());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (!Intrinsics.areEqual(value.getExecution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExecution_id());
                }
                if (value.getBroken_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getBroken_at());
                }
                if (value.getFill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getFill()));
                }
                if (!Intrinsics.areEqual(value.getExec_broker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getExec_broker());
                }
                if (value.getUpdate_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getUpdate_count()));
                }
                if (value.getLeg_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 11, (int) value.getLeg_id());
                }
                if (value.getCommission() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 12, (int) value.getCommission());
                }
                if (value.getCommission_currency() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 13, (int) value.getCommission_currency());
                }
                if (value.getCommission_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 14, (int) value.getCommission_type());
                }
                if (value.getLiquidity_ind() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 15, (int) value.getLiquidity_ind());
                }
                if (value.getSettlement_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 16, (int) value.getSettlement_type());
                }
                if (value.getSettlement_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 17, (int) value.getSettlement_date());
                }
                if (value.getTrade_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 18, (int) value.getTrade_date());
                }
                if (value.getSec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 19, (int) value.getSec_fee());
                }
                if (value.getTaf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 20, (int) value.getTaf_fee());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 21, (int) value.getRoute());
                }
                if (value.getCl_ord_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 22, (int) value.getCl_ord_id());
                }
                if (value.getRounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 23, (int) value.getRounded_notional());
                }
                if (value.getNbbo_ask_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 24, (int) value.getNbbo_ask_price());
                }
                if (value.getNbbo_ask_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 25, (int) value.getNbbo_ask_quantity());
                }
                Venue nbbo_ask_venue = value.getNbbo_ask_venue();
                Venue venue = Venue.VENUE_UNSPECIFIED;
                if (nbbo_ask_venue != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 26, (int) value.getNbbo_ask_venue());
                }
                if (value.getNbbo_bid_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 27, (int) value.getNbbo_bid_price());
                }
                if (value.getNbbo_bid_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 28, (int) value.getNbbo_bid_quantity());
                }
                if (value.getNbbo_bid_venue() != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 29, (int) value.getNbbo_bid_venue());
                }
                if (value.getNbbo_exchange_timestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 30, (int) value.getNbbo_exchange_timestamp());
                }
                if (value.getPending_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 31, (int) value.getPending_execution_id());
                }
                if (value.getPrice_source_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 32, (int) value.getPrice_source_execution_id());
                }
                if (value.getTrade_break_agent() != TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED) {
                    TradeBreakAgent.ADAPTER.encodeWithTag(writer, 33, (int) value.getTrade_break_agent());
                }
                if (value.getProcessed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 34, (int) value.getProcessed_at());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    Capacity.ADAPTER.encodeWithTag(writer, 35, (int) value.getCapacity());
                }
                if (value.getLimit_up_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 36, (int) value.getLimit_up_price());
                }
                if (value.getLimit_down_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 37, (int) value.getLimit_down_price());
                }
                if (value.getIs_adjustment() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 38, (int) value.getIs_adjustment());
                }
                if (value.getNotional_execution()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 39, (int) Boolean.valueOf(value.getNotional_execution()));
                }
                if (value.getClearing_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 40, (int) value.getClearing_quantity());
                }
                if (value.getNotional_fill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 41, (int) Boolean.valueOf(value.getNotional_fill()));
                }
                if (value.getOr_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 42, (int) value.getOr_fee());
                }
                if (value.getOcc_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 43, (int) value.getOcc_fee());
                }
                if (value.getTrade_match_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 44, (int) value.getTrade_match_id());
                }
                if (value.getExchange_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 46, (int) value.getExchange_fee());
                }
                if (value.getBase_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 47, (int) value.getBase_currency_traded());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 48, (int) value.getSide());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 49, (int) value.getPosition_id());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 50, (int) value.getNon_denominated_currency_traded());
                }
                if (value.getUti() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 51, (int) value.getUti());
                }
                if (value.getRel_tx_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 52, (int) value.getRel_tx_id());
                }
                if (value.getFx_fee_in_bps() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 53, (int) value.getFx_fee_in_bps());
                }
                if (value.getContra_firm_account() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 54, (int) value.getContra_firm_account());
                }
                if (value.getEstimated_next_settlement_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 55, (int) value.getEstimated_next_settlement_time());
                }
                if (value.getAssociated_fx_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 56, (int) value.getAssociated_fx_execution_id());
                }
                if (value.getLast_liquidity_ind() != LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED) {
                    LastLiquidityInd.ADAPTER.encodeWithTag(writer, 57, (int) value.getLast_liquidity_ind());
                }
                if (value.getExecution_fees() != null) {
                    ExecutionFees.ADAPTER.encodeWithTag(writer, 58, (int) value.getExecution_fees());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Execution value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getExecution_fees() != null) {
                    ExecutionFees.ADAPTER.encodeWithTag(writer, 58, (int) value.getExecution_fees());
                }
                if (value.getLast_liquidity_ind() != LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED) {
                    LastLiquidityInd.ADAPTER.encodeWithTag(writer, 57, (int) value.getLast_liquidity_ind());
                }
                if (value.getAssociated_fx_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 56, (int) value.getAssociated_fx_execution_id());
                }
                if (value.getEstimated_next_settlement_time() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 55, (int) value.getEstimated_next_settlement_time());
                }
                if (value.getContra_firm_account() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 54, (int) value.getContra_firm_account());
                }
                if (value.getFx_fee_in_bps() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 53, (int) value.getFx_fee_in_bps());
                }
                if (value.getRel_tx_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 52, (int) value.getRel_tx_id());
                }
                if (value.getUti() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 51, (int) value.getUti());
                }
                if (value.getNon_denominated_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 50, (int) value.getNon_denominated_currency_traded());
                }
                if (value.getPosition_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 49, (int) value.getPosition_id());
                }
                if (value.getSide() != Side.SIDE_UNSPECIFIED) {
                    Side.ADAPTER.encodeWithTag(writer, 48, (int) value.getSide());
                }
                if (value.getBase_currency_traded() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 47, (int) value.getBase_currency_traded());
                }
                if (value.getExchange_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 46, (int) value.getExchange_fee());
                }
                if (value.getTrade_match_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 44, (int) value.getTrade_match_id());
                }
                if (value.getOcc_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 43, (int) value.getOcc_fee());
                }
                if (value.getOr_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 42, (int) value.getOr_fee());
                }
                if (value.getNotional_fill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 41, (int) Boolean.valueOf(value.getNotional_fill()));
                }
                if (value.getClearing_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 40, (int) value.getClearing_quantity());
                }
                if (value.getNotional_execution()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 39, (int) Boolean.valueOf(value.getNotional_execution()));
                }
                if (value.getIs_adjustment() != null) {
                    NullableBool.ADAPTER.encodeWithTag(writer, 38, (int) value.getIs_adjustment());
                }
                if (value.getLimit_down_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 37, (int) value.getLimit_down_price());
                }
                if (value.getLimit_up_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 36, (int) value.getLimit_up_price());
                }
                if (value.getCapacity() != Capacity.CAPACITY_UNSPECIFIED) {
                    Capacity.ADAPTER.encodeWithTag(writer, 35, (int) value.getCapacity());
                }
                if (value.getProcessed_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 34, (int) value.getProcessed_at());
                }
                if (value.getTrade_break_agent() != TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED) {
                    TradeBreakAgent.ADAPTER.encodeWithTag(writer, 33, (int) value.getTrade_break_agent());
                }
                if (value.getPrice_source_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 32, (int) value.getPrice_source_execution_id());
                }
                if (value.getPending_execution_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 31, (int) value.getPending_execution_id());
                }
                if (value.getNbbo_exchange_timestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 30, (int) value.getNbbo_exchange_timestamp());
                }
                Venue nbbo_bid_venue = value.getNbbo_bid_venue();
                Venue venue = Venue.VENUE_UNSPECIFIED;
                if (nbbo_bid_venue != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 29, (int) value.getNbbo_bid_venue());
                }
                if (value.getNbbo_bid_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 28, (int) value.getNbbo_bid_quantity());
                }
                if (value.getNbbo_bid_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 27, (int) value.getNbbo_bid_price());
                }
                if (value.getNbbo_ask_venue() != venue) {
                    Venue.ADAPTER.encodeWithTag(writer, 26, (int) value.getNbbo_ask_venue());
                }
                if (value.getNbbo_ask_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 25, (int) value.getNbbo_ask_quantity());
                }
                if (value.getNbbo_ask_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 24, (int) value.getNbbo_ask_price());
                }
                if (value.getRounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 23, (int) value.getRounded_notional());
                }
                if (value.getCl_ord_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 22, (int) value.getCl_ord_id());
                }
                if (value.getRoute() != Route.ROUTE_UNSPECIFIED) {
                    Route.ADAPTER.encodeWithTag(writer, 21, (int) value.getRoute());
                }
                if (value.getTaf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 20, (int) value.getTaf_fee());
                }
                if (value.getSec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 19, (int) value.getSec_fee());
                }
                if (value.getTrade_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 18, (int) value.getTrade_date());
                }
                if (value.getSettlement_date() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 17, (int) value.getSettlement_date());
                }
                if (value.getSettlement_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 16, (int) value.getSettlement_type());
                }
                if (value.getLiquidity_ind() != null) {
                    NullableInt.ADAPTER.encodeWithTag(writer, 15, (int) value.getLiquidity_ind());
                }
                if (value.getCommission_type() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 14, (int) value.getCommission_type());
                }
                if (value.getCommission_currency() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 13, (int) value.getCommission_currency());
                }
                if (value.getCommission() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 12, (int) value.getCommission());
                }
                if (value.getLeg_id() != null) {
                    NullableString.ADAPTER.encodeWithTag(writer, 11, (int) value.getLeg_id());
                }
                if (value.getUpdate_count() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 10, (int) Integer.valueOf(value.getUpdate_count()));
                }
                if (!Intrinsics.areEqual(value.getExec_broker(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getExec_broker());
                }
                if (value.getFill()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getFill()));
                }
                if (value.getBroken_at() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 7, (int) value.getBroken_at());
                }
                if (!Intrinsics.areEqual(value.getExecution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExecution_id());
                }
                if (value.getTimestamp() != null) {
                    Time.ADAPTER.encodeWithTag(writer, 5, (int) value.getTimestamp());
                }
                if (value.getPrice() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getPrice());
                }
                if (value.getQuantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getQuantity());
                }
                if (value.getId() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 2, (int) value.getId());
                }
                if (value.getOrder_id() != null) {
                    UUID.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_id());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Execution decode(ProtoReader reader) throws IOException {
                Venue venue;
                Venue venue2;
                TradeBreakAgent tradeBreakAgent;
                Route routeDecode;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Route route = Route.ROUTE_UNSPECIFIED;
                Venue venue3 = Venue.VENUE_UNSPECIFIED;
                TradeBreakAgent tradeBreakAgent2 = TradeBreakAgent.TRADE_BREAK_AGENT_UNSPECIFIED;
                Capacity capacity = Capacity.CAPACITY_UNSPECIFIED;
                Side side = Side.SIDE_UNSPECIFIED;
                LastLiquidityInd lastLiquidityInd = LastLiquidityInd.LAST_LIQUIDITY_IND_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Route route2 = route;
                UUID uuid = null;
                Decimal decimal = null;
                Decimal decimal2 = null;
                Time time = null;
                Time time2 = null;
                NullableString nullableString = null;
                Decimal decimal3 = null;
                NullableString nullableString2 = null;
                NullableString nullableString3 = null;
                NullableInt nullableInt = null;
                NullableString nullableString4 = null;
                Time time3 = null;
                Time time4 = null;
                Decimal decimal4 = null;
                Decimal decimal5 = null;
                NullableString nullableString5 = null;
                Decimal decimal6 = null;
                Decimal decimal7 = null;
                Decimal decimal8 = null;
                Decimal decimal9 = null;
                Decimal decimal10 = null;
                Time time5 = null;
                UUID uuid2 = null;
                UUID uuid3 = null;
                Time time6 = null;
                Decimal decimal11 = null;
                Decimal decimal12 = null;
                NullableBool nullableBool = null;
                Decimal decimal13 = null;
                Decimal decimal14 = null;
                Decimal decimal15 = null;
                NullableString nullableString6 = null;
                Decimal decimal16 = null;
                Decimal decimal17 = null;
                NullableString nullableString7 = null;
                Decimal decimal18 = null;
                NullableString nullableString8 = null;
                NullableString nullableString9 = null;
                Decimal decimal19 = null;
                NullableString nullableString10 = null;
                Time time7 = null;
                UUID uuid4 = null;
                ExecutionFees executionFees = null;
                String str = "";
                String str2 = str;
                boolean z = false;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                Side sideDecode = side;
                LastLiquidityInd lastLiquidityIndDecode = lastLiquidityInd;
                UUID uuid5 = null;
                TradeBreakAgent tradeBreakAgentDecode = tradeBreakAgent2;
                Capacity capacityDecode = capacity;
                Venue venueDecode = venue3;
                Venue venueDecode2 = venueDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                UUID uuidDecode = UUID.ADAPTER.decode(reader);
                                Unit unit = Unit.INSTANCE;
                                uuid5 = uuidDecode;
                                break;
                            case 2:
                                UUID uuidDecode2 = UUID.ADAPTER.decode(reader);
                                Unit unit2 = Unit.INSTANCE;
                                uuid = uuidDecode2;
                                break;
                            case 3:
                                Decimal decimalDecode = Decimal.ADAPTER.decode(reader);
                                Unit unit3 = Unit.INSTANCE;
                                decimal = decimalDecode;
                                break;
                            case 4:
                                Decimal decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                Unit unit4 = Unit.INSTANCE;
                                decimal2 = decimalDecode2;
                                break;
                            case 5:
                                Time timeDecode = Time.ADAPTER.decode(reader);
                                Unit unit5 = Unit.INSTANCE;
                                time = timeDecode;
                                break;
                            case 6:
                                String strDecode = ProtoAdapter.STRING.decode(reader);
                                Unit unit6 = Unit.INSTANCE;
                                str = strDecode;
                                break;
                            case 7:
                                Time timeDecode2 = Time.ADAPTER.decode(reader);
                                Unit unit7 = Unit.INSTANCE;
                                time2 = timeDecode2;
                                break;
                            case 8:
                                boolean zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit8 = Unit.INSTANCE;
                                z = zBooleanValue;
                                break;
                            case 9:
                                String strDecode2 = ProtoAdapter.STRING.decode(reader);
                                Unit unit9 = Unit.INSTANCE;
                                str2 = strDecode2;
                                break;
                            case 10:
                                int iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                Unit unit10 = Unit.INSTANCE;
                                i = iIntValue;
                                break;
                            case 11:
                                NullableString nullableStringDecode = NullableString.ADAPTER.decode(reader);
                                Unit unit11 = Unit.INSTANCE;
                                nullableString = nullableStringDecode;
                                break;
                            case 12:
                                Decimal decimalDecode3 = Decimal.ADAPTER.decode(reader);
                                Unit unit12 = Unit.INSTANCE;
                                decimal3 = decimalDecode3;
                                break;
                            case 13:
                                NullableString nullableStringDecode2 = NullableString.ADAPTER.decode(reader);
                                Unit unit13 = Unit.INSTANCE;
                                nullableString2 = nullableStringDecode2;
                                break;
                            case 14:
                                NullableString nullableStringDecode3 = NullableString.ADAPTER.decode(reader);
                                Unit unit14 = Unit.INSTANCE;
                                nullableString3 = nullableStringDecode3;
                                break;
                            case 15:
                                NullableInt nullableIntDecode = NullableInt.ADAPTER.decode(reader);
                                Unit unit15 = Unit.INSTANCE;
                                nullableInt = nullableIntDecode;
                                break;
                            case 16:
                                NullableString nullableStringDecode4 = NullableString.ADAPTER.decode(reader);
                                Unit unit16 = Unit.INSTANCE;
                                nullableString4 = nullableStringDecode4;
                                break;
                            case 17:
                                Time timeDecode3 = Time.ADAPTER.decode(reader);
                                Unit unit17 = Unit.INSTANCE;
                                time3 = timeDecode3;
                                break;
                            case 18:
                                Time timeDecode4 = Time.ADAPTER.decode(reader);
                                Unit unit18 = Unit.INSTANCE;
                                time4 = timeDecode4;
                                break;
                            case 19:
                                Decimal decimalDecode4 = Decimal.ADAPTER.decode(reader);
                                Unit unit19 = Unit.INSTANCE;
                                decimal4 = decimalDecode4;
                                break;
                            case 20:
                                Decimal decimalDecode5 = Decimal.ADAPTER.decode(reader);
                                Unit unit20 = Unit.INSTANCE;
                                decimal5 = decimalDecode5;
                                break;
                            case 21:
                                venue = venueDecode;
                                venue2 = venueDecode2;
                                tradeBreakAgent = tradeBreakAgentDecode;
                                try {
                                    routeDecode = Route.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    routeDecode = route2;
                                }
                                Unit unit21 = Unit.INSTANCE;
                                route2 = routeDecode;
                                venueDecode = venue;
                                venueDecode2 = venue2;
                                tradeBreakAgentDecode = tradeBreakAgent;
                                break;
                            case 22:
                                NullableString nullableStringDecode5 = NullableString.ADAPTER.decode(reader);
                                Unit unit22 = Unit.INSTANCE;
                                nullableString5 = nullableStringDecode5;
                                break;
                            case 23:
                                Decimal decimalDecode6 = Decimal.ADAPTER.decode(reader);
                                Unit unit23 = Unit.INSTANCE;
                                decimal6 = decimalDecode6;
                                break;
                            case 24:
                                Decimal decimalDecode7 = Decimal.ADAPTER.decode(reader);
                                Unit unit24 = Unit.INSTANCE;
                                decimal7 = decimalDecode7;
                                break;
                            case 25:
                                Decimal decimalDecode8 = Decimal.ADAPTER.decode(reader);
                                Unit unit25 = Unit.INSTANCE;
                                decimal8 = decimalDecode8;
                                break;
                            case 26:
                                Venue venue4 = venueDecode;
                                venue2 = venueDecode2;
                                tradeBreakAgent = tradeBreakAgentDecode;
                                try {
                                    venueDecode = Venue.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    venueDecode = venue4;
                                }
                                Unit unit26 = Unit.INSTANCE;
                                venueDecode2 = venue2;
                                tradeBreakAgentDecode = tradeBreakAgent;
                                break;
                            case 27:
                                Decimal decimalDecode9 = Decimal.ADAPTER.decode(reader);
                                Unit unit27 = Unit.INSTANCE;
                                decimal9 = decimalDecode9;
                                break;
                            case 28:
                                Decimal decimalDecode10 = Decimal.ADAPTER.decode(reader);
                                Unit unit28 = Unit.INSTANCE;
                                decimal10 = decimalDecode10;
                                break;
                            case 29:
                                Venue venue5 = venueDecode;
                                Venue venue6 = venueDecode2;
                                tradeBreakAgent = tradeBreakAgentDecode;
                                try {
                                    venueDecode2 = Venue.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    venueDecode2 = venue6;
                                }
                                Unit unit29 = Unit.INSTANCE;
                                venueDecode = venue5;
                                tradeBreakAgentDecode = tradeBreakAgent;
                                break;
                            case 30:
                                Time timeDecode5 = Time.ADAPTER.decode(reader);
                                Unit unit30 = Unit.INSTANCE;
                                time5 = timeDecode5;
                                break;
                            case 31:
                                UUID uuidDecode3 = UUID.ADAPTER.decode(reader);
                                Unit unit31 = Unit.INSTANCE;
                                uuid2 = uuidDecode3;
                                break;
                            case 32:
                                UUID uuidDecode4 = UUID.ADAPTER.decode(reader);
                                Unit unit32 = Unit.INSTANCE;
                                uuid3 = uuidDecode4;
                                break;
                            case 33:
                                Venue venue7 = venueDecode;
                                Venue venue8 = venueDecode2;
                                TradeBreakAgent tradeBreakAgent3 = tradeBreakAgentDecode;
                                try {
                                    tradeBreakAgentDecode = TradeBreakAgent.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    tradeBreakAgentDecode = tradeBreakAgent3;
                                }
                                Unit unit33 = Unit.INSTANCE;
                                venueDecode = venue7;
                                venueDecode2 = venue8;
                                break;
                            case 34:
                                Time timeDecode6 = Time.ADAPTER.decode(reader);
                                Unit unit34 = Unit.INSTANCE;
                                time6 = timeDecode6;
                                break;
                            case 35:
                                venue = venueDecode;
                                venue2 = venueDecode2;
                                tradeBreakAgent = tradeBreakAgentDecode;
                                try {
                                    capacityDecode = Capacity.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                Unit unit35 = Unit.INSTANCE;
                                venueDecode = venue;
                                venueDecode2 = venue2;
                                tradeBreakAgentDecode = tradeBreakAgent;
                                break;
                            case 36:
                                Decimal decimalDecode11 = Decimal.ADAPTER.decode(reader);
                                Unit unit36 = Unit.INSTANCE;
                                decimal11 = decimalDecode11;
                                break;
                            case 37:
                                Decimal decimalDecode12 = Decimal.ADAPTER.decode(reader);
                                Unit unit37 = Unit.INSTANCE;
                                decimal12 = decimalDecode12;
                                break;
                            case 38:
                                NullableBool nullableBoolDecode = NullableBool.ADAPTER.decode(reader);
                                Unit unit38 = Unit.INSTANCE;
                                nullableBool = nullableBoolDecode;
                                break;
                            case 39:
                                boolean zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit39 = Unit.INSTANCE;
                                z2 = zBooleanValue2;
                                break;
                            case 40:
                                Decimal decimalDecode13 = Decimal.ADAPTER.decode(reader);
                                Unit unit40 = Unit.INSTANCE;
                                decimal13 = decimalDecode13;
                                break;
                            case 41:
                                boolean zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit41 = Unit.INSTANCE;
                                z3 = zBooleanValue3;
                                break;
                            case 42:
                                Decimal decimalDecode14 = Decimal.ADAPTER.decode(reader);
                                Unit unit42 = Unit.INSTANCE;
                                decimal14 = decimalDecode14;
                                break;
                            case 43:
                                Decimal decimalDecode15 = Decimal.ADAPTER.decode(reader);
                                Unit unit43 = Unit.INSTANCE;
                                decimal15 = decimalDecode15;
                                break;
                            case 44:
                                NullableString nullableStringDecode6 = NullableString.ADAPTER.decode(reader);
                                Unit unit44 = Unit.INSTANCE;
                                nullableString6 = nullableStringDecode6;
                                break;
                            case 45:
                            default:
                                reader.readUnknownField(iNextTag);
                                Unit unit45 = Unit.INSTANCE;
                                break;
                            case 46:
                                Decimal decimalDecode16 = Decimal.ADAPTER.decode(reader);
                                Unit unit46 = Unit.INSTANCE;
                                decimal16 = decimalDecode16;
                                break;
                            case 47:
                                Decimal decimalDecode17 = Decimal.ADAPTER.decode(reader);
                                Unit unit47 = Unit.INSTANCE;
                                decimal17 = decimalDecode17;
                                break;
                            case 48:
                                venue = venueDecode;
                                venue2 = venueDecode2;
                                tradeBreakAgent = tradeBreakAgentDecode;
                                try {
                                    sideDecode = Side.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                Unit unit48 = Unit.INSTANCE;
                                venueDecode = venue;
                                venueDecode2 = venue2;
                                tradeBreakAgentDecode = tradeBreakAgent;
                                break;
                            case 49:
                                NullableString nullableStringDecode7 = NullableString.ADAPTER.decode(reader);
                                Unit unit49 = Unit.INSTANCE;
                                nullableString7 = nullableStringDecode7;
                                break;
                            case 50:
                                Decimal decimalDecode18 = Decimal.ADAPTER.decode(reader);
                                Unit unit50 = Unit.INSTANCE;
                                decimal18 = decimalDecode18;
                                break;
                            case 51:
                                NullableString nullableStringDecode8 = NullableString.ADAPTER.decode(reader);
                                Unit unit51 = Unit.INSTANCE;
                                nullableString8 = nullableStringDecode8;
                                break;
                            case 52:
                                NullableString nullableStringDecode9 = NullableString.ADAPTER.decode(reader);
                                Unit unit52 = Unit.INSTANCE;
                                nullableString9 = nullableStringDecode9;
                                break;
                            case 53:
                                Decimal decimalDecode19 = Decimal.ADAPTER.decode(reader);
                                Unit unit53 = Unit.INSTANCE;
                                decimal19 = decimalDecode19;
                                break;
                            case 54:
                                NullableString nullableStringDecode10 = NullableString.ADAPTER.decode(reader);
                                Unit unit54 = Unit.INSTANCE;
                                nullableString10 = nullableStringDecode10;
                                break;
                            case 55:
                                Time timeDecode7 = Time.ADAPTER.decode(reader);
                                Unit unit55 = Unit.INSTANCE;
                                time7 = timeDecode7;
                                break;
                            case 56:
                                UUID uuidDecode5 = UUID.ADAPTER.decode(reader);
                                Unit unit56 = Unit.INSTANCE;
                                uuid4 = uuidDecode5;
                                break;
                            case 57:
                                try {
                                    lastLiquidityIndDecode = LastLiquidityInd.ADAPTER.decode(reader);
                                    venue = venueDecode;
                                    venue2 = venueDecode2;
                                    tradeBreakAgent = tradeBreakAgentDecode;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    venue = venueDecode;
                                    venue2 = venueDecode2;
                                    tradeBreakAgent = tradeBreakAgentDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                }
                                Unit unit57 = Unit.INSTANCE;
                                venueDecode = venue;
                                venueDecode2 = venue2;
                                tradeBreakAgentDecode = tradeBreakAgent;
                                break;
                            case 58:
                                ExecutionFees executionFeesDecode = ExecutionFees.ADAPTER.decode(reader);
                                Unit unit58 = Unit.INSTANCE;
                                executionFees = executionFeesDecode;
                                break;
                        }
                    } else {
                        return new Execution(uuid5, uuid, decimal, decimal2, time, str, time2, z, str2, i, nullableString, decimal3, nullableString2, nullableString3, nullableInt, nullableString4, time3, time4, decimal4, decimal5, route2, nullableString5, decimal6, decimal7, decimal8, venueDecode, decimal9, decimal10, venueDecode2, time5, uuid2, uuid3, tradeBreakAgentDecode, time6, capacityDecode, decimal11, decimal12, nullableBool, z2, decimal13, z3, decimal14, decimal15, nullableString6, decimal16, decimal17, sideDecode, nullableString7, decimal18, nullableString8, nullableString9, decimal19, nullableString10, time7, uuid4, lastLiquidityIndDecode, executionFees, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Execution redact(Execution value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UUID order_id = value.getOrder_id();
                UUID uuidRedact = order_id != null ? UUID.ADAPTER.redact(order_id) : null;
                UUID id = value.getId();
                UUID uuidRedact2 = id != null ? UUID.ADAPTER.redact(id) : null;
                Decimal quantity = value.getQuantity();
                Decimal decimalRedact = quantity != null ? Decimal.ADAPTER.redact(quantity) : null;
                Decimal price = value.getPrice();
                Decimal decimalRedact2 = price != null ? Decimal.ADAPTER.redact(price) : null;
                Time timestamp = value.getTimestamp();
                Time timeRedact = timestamp != null ? Time.ADAPTER.redact(timestamp) : null;
                Time broken_at = value.getBroken_at();
                Time timeRedact2 = broken_at != null ? Time.ADAPTER.redact(broken_at) : null;
                NullableString leg_id = value.getLeg_id();
                NullableString nullableStringRedact = leg_id != null ? NullableString.ADAPTER.redact(leg_id) : null;
                Decimal commission = value.getCommission();
                Decimal decimalRedact3 = commission != null ? Decimal.ADAPTER.redact(commission) : null;
                NullableString commission_currency = value.getCommission_currency();
                NullableString nullableStringRedact2 = commission_currency != null ? NullableString.ADAPTER.redact(commission_currency) : null;
                NullableString commission_type = value.getCommission_type();
                NullableString nullableStringRedact3 = commission_type != null ? NullableString.ADAPTER.redact(commission_type) : null;
                NullableInt liquidity_ind = value.getLiquidity_ind();
                NullableInt nullableIntRedact = liquidity_ind != null ? NullableInt.ADAPTER.redact(liquidity_ind) : null;
                NullableString settlement_type = value.getSettlement_type();
                NullableString nullableStringRedact4 = settlement_type != null ? NullableString.ADAPTER.redact(settlement_type) : null;
                Time settlement_date = value.getSettlement_date();
                Time timeRedact3 = settlement_date != null ? Time.ADAPTER.redact(settlement_date) : null;
                Time trade_date = value.getTrade_date();
                Time timeRedact4 = trade_date != null ? Time.ADAPTER.redact(trade_date) : null;
                Decimal sec_fee = value.getSec_fee();
                Decimal decimalRedact4 = sec_fee != null ? Decimal.ADAPTER.redact(sec_fee) : null;
                Decimal taf_fee = value.getTaf_fee();
                Decimal decimalRedact5 = taf_fee != null ? Decimal.ADAPTER.redact(taf_fee) : null;
                NullableString cl_ord_id = value.getCl_ord_id();
                NullableString nullableStringRedact5 = cl_ord_id != null ? NullableString.ADAPTER.redact(cl_ord_id) : null;
                Decimal rounded_notional = value.getRounded_notional();
                Decimal decimalRedact6 = rounded_notional != null ? Decimal.ADAPTER.redact(rounded_notional) : null;
                Decimal nbbo_ask_price = value.getNbbo_ask_price();
                Decimal decimalRedact7 = nbbo_ask_price != null ? Decimal.ADAPTER.redact(nbbo_ask_price) : null;
                Decimal nbbo_ask_quantity = value.getNbbo_ask_quantity();
                Decimal decimalRedact8 = nbbo_ask_quantity != null ? Decimal.ADAPTER.redact(nbbo_ask_quantity) : null;
                Decimal nbbo_bid_price = value.getNbbo_bid_price();
                Decimal decimalRedact9 = nbbo_bid_price != null ? Decimal.ADAPTER.redact(nbbo_bid_price) : null;
                Decimal nbbo_bid_quantity = value.getNbbo_bid_quantity();
                Decimal decimalRedact10 = nbbo_bid_quantity != null ? Decimal.ADAPTER.redact(nbbo_bid_quantity) : null;
                Time nbbo_exchange_timestamp = value.getNbbo_exchange_timestamp();
                Time timeRedact5 = nbbo_exchange_timestamp != null ? Time.ADAPTER.redact(nbbo_exchange_timestamp) : null;
                UUID pending_execution_id = value.getPending_execution_id();
                UUID uuidRedact3 = pending_execution_id != null ? UUID.ADAPTER.redact(pending_execution_id) : null;
                UUID price_source_execution_id = value.getPrice_source_execution_id();
                UUID uuidRedact4 = price_source_execution_id != null ? UUID.ADAPTER.redact(price_source_execution_id) : null;
                Time processed_at = value.getProcessed_at();
                Time timeRedact6 = processed_at != null ? Time.ADAPTER.redact(processed_at) : null;
                Decimal limit_up_price = value.getLimit_up_price();
                Decimal decimalRedact11 = limit_up_price != null ? Decimal.ADAPTER.redact(limit_up_price) : null;
                Decimal limit_down_price = value.getLimit_down_price();
                Decimal decimalRedact12 = limit_down_price != null ? Decimal.ADAPTER.redact(limit_down_price) : null;
                NullableBool is_adjustment = value.getIs_adjustment();
                NullableBool nullableBoolRedact = is_adjustment != null ? NullableBool.ADAPTER.redact(is_adjustment) : null;
                Decimal clearing_quantity = value.getClearing_quantity();
                Decimal decimalRedact13 = clearing_quantity != null ? Decimal.ADAPTER.redact(clearing_quantity) : null;
                Decimal or_fee = value.getOr_fee();
                Decimal decimalRedact14 = or_fee != null ? Decimal.ADAPTER.redact(or_fee) : null;
                Decimal occ_fee = value.getOcc_fee();
                Decimal decimalRedact15 = occ_fee != null ? Decimal.ADAPTER.redact(occ_fee) : null;
                NullableString trade_match_id = value.getTrade_match_id();
                NullableString nullableStringRedact6 = trade_match_id != null ? NullableString.ADAPTER.redact(trade_match_id) : null;
                Decimal exchange_fee = value.getExchange_fee();
                Decimal decimalRedact16 = exchange_fee != null ? Decimal.ADAPTER.redact(exchange_fee) : null;
                Decimal base_currency_traded = value.getBase_currency_traded();
                Decimal decimalRedact17 = base_currency_traded != null ? Decimal.ADAPTER.redact(base_currency_traded) : null;
                NullableString position_id = value.getPosition_id();
                NullableString nullableStringRedact7 = position_id != null ? NullableString.ADAPTER.redact(position_id) : null;
                Decimal non_denominated_currency_traded = value.getNon_denominated_currency_traded();
                Decimal decimalRedact18 = non_denominated_currency_traded != null ? Decimal.ADAPTER.redact(non_denominated_currency_traded) : null;
                NullableString uti = value.getUti();
                NullableString nullableStringRedact8 = uti != null ? NullableString.ADAPTER.redact(uti) : null;
                NullableString rel_tx_id = value.getRel_tx_id();
                NullableString nullableStringRedact9 = rel_tx_id != null ? NullableString.ADAPTER.redact(rel_tx_id) : null;
                Decimal fx_fee_in_bps = value.getFx_fee_in_bps();
                Decimal decimalRedact19 = fx_fee_in_bps != null ? Decimal.ADAPTER.redact(fx_fee_in_bps) : null;
                NullableString contra_firm_account = value.getContra_firm_account();
                NullableString nullableStringRedact10 = contra_firm_account != null ? NullableString.ADAPTER.redact(contra_firm_account) : null;
                Time estimated_next_settlement_time = value.getEstimated_next_settlement_time();
                Time timeRedact7 = estimated_next_settlement_time != null ? Time.ADAPTER.redact(estimated_next_settlement_time) : null;
                UUID associated_fx_execution_id = value.getAssociated_fx_execution_id();
                UUID uuidRedact5 = associated_fx_execution_id != null ? UUID.ADAPTER.redact(associated_fx_execution_id) : null;
                ExecutionFees execution_fees = value.getExecution_fees();
                return value.copy((303039392 & 1) != 0 ? value.order_id : uuidRedact, (303039392 & 2) != 0 ? value.id : uuidRedact2, (303039392 & 4) != 0 ? value.quantity : decimalRedact, (303039392 & 8) != 0 ? value.price : decimalRedact2, (303039392 & 16) != 0 ? value.timestamp : timeRedact, (303039392 & 32) != 0 ? value.execution_id : null, (303039392 & 64) != 0 ? value.broken_at : timeRedact2, (303039392 & 128) != 0 ? value.fill : false, (303039392 & 256) != 0 ? value.exec_broker : null, (303039392 & 512) != 0 ? value.update_count : 0, (303039392 & 1024) != 0 ? value.leg_id : nullableStringRedact, (303039392 & 2048) != 0 ? value.commission : decimalRedact3, (303039392 & 4096) != 0 ? value.commission_currency : nullableStringRedact2, (303039392 & 8192) != 0 ? value.commission_type : nullableStringRedact3, (303039392 & 16384) != 0 ? value.liquidity_ind : nullableIntRedact, (303039392 & 32768) != 0 ? value.settlement_type : nullableStringRedact4, (303039392 & 65536) != 0 ? value.settlement_date : timeRedact3, (303039392 & 131072) != 0 ? value.trade_date : timeRedact4, (303039392 & 262144) != 0 ? value.sec_fee : decimalRedact4, (303039392 & 524288) != 0 ? value.taf_fee : decimalRedact5, (303039392 & 1048576) != 0 ? value.route : null, (303039392 & 2097152) != 0 ? value.cl_ord_id : nullableStringRedact5, (303039392 & 4194304) != 0 ? value.rounded_notional : decimalRedact6, (303039392 & 8388608) != 0 ? value.nbbo_ask_price : decimalRedact7, (303039392 & 16777216) != 0 ? value.nbbo_ask_quantity : decimalRedact8, (303039392 & 33554432) != 0 ? value.nbbo_ask_venue : null, (303039392 & 67108864) != 0 ? value.nbbo_bid_price : decimalRedact9, (303039392 & 134217728) != 0 ? value.nbbo_bid_quantity : decimalRedact10, (303039392 & 268435456) != 0 ? value.nbbo_bid_venue : null, (303039392 & 536870912) != 0 ? value.nbbo_exchange_timestamp : timeRedact5, (303039392 & 1073741824) != 0 ? value.pending_execution_id : uuidRedact3, (303039392 & Integer.MIN_VALUE) != 0 ? value.price_source_execution_id : uuidRedact4, (8405317 & 1) != 0 ? value.trade_break_agent : null, (8405317 & 2) != 0 ? value.processed_at : timeRedact6, (8405317 & 4) != 0 ? value.capacity : null, (8405317 & 8) != 0 ? value.limit_up_price : decimalRedact11, (8405317 & 16) != 0 ? value.limit_down_price : decimalRedact12, (8405317 & 32) != 0 ? value.is_adjustment : nullableBoolRedact, (8405317 & 64) != 0 ? value.notional_execution : false, (8405317 & 128) != 0 ? value.clearing_quantity : decimalRedact13, (8405317 & 256) != 0 ? value.notional_fill : false, (8405317 & 512) != 0 ? value.or_fee : decimalRedact14, (8405317 & 1024) != 0 ? value.occ_fee : decimalRedact15, (8405317 & 2048) != 0 ? value.trade_match_id : nullableStringRedact6, (8405317 & 4096) != 0 ? value.exchange_fee : decimalRedact16, (8405317 & 8192) != 0 ? value.base_currency_traded : decimalRedact17, (8405317 & 16384) != 0 ? value.side : null, (8405317 & 32768) != 0 ? value.position_id : nullableStringRedact7, (8405317 & 65536) != 0 ? value.non_denominated_currency_traded : decimalRedact18, (8405317 & 131072) != 0 ? value.uti : nullableStringRedact8, (8405317 & 262144) != 0 ? value.rel_tx_id : nullableStringRedact9, (8405317 & 524288) != 0 ? value.fx_fee_in_bps : decimalRedact19, (8405317 & 1048576) != 0 ? value.contra_firm_account : nullableStringRedact10, (8405317 & 2097152) != 0 ? value.estimated_next_settlement_time : timeRedact7, (8405317 & 4194304) != 0 ? value.associated_fx_execution_id : uuidRedact5, (8405317 & 8388608) != 0 ? value.last_liquidity_ind : null, (8405317 & 16777216) != 0 ? value.execution_fees : execution_fees != null ? ExecutionFees.ADAPTER.redact(execution_fees) : null, (8405317 & 33554432) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
