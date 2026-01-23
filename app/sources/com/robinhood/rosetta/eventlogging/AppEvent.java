package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AppEvent.kt */
@Metadata(m3635d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 Ê\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002Ê\u0001BÙ\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010[\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010_\u0012\b\b\u0002\u0010`\u001a\u00020a¢\u0006\u0004\bb\u0010cJ\t\u0010Á\u0001\u001a\u00020\u0002H\u0017J\u0017\u0010Â\u0001\u001a\u00030Ã\u00012\n\u0010Ä\u0001\u001a\u0005\u0018\u00010Å\u0001H\u0096\u0002J\n\u0010Æ\u0001\u001a\u00030Ç\u0001H\u0016J\t\u0010È\u0001\u001a\u00020\u0004H\u0016JÙ\u0004\u0010É\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u0001092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010O2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010U2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010Y2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010_2\b\b\u0002\u0010`\u001a\u00020aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010eR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010eR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010eR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010eR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010.\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u00100\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u00102\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u00104\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u00106\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u00108\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010:\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010<\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010>\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010@\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010B\u001a\u0004\u0018\u00010C8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010D\u001a\u0004\u0018\u00010E8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010H\u001a\u0004\u0018\u00010I8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010J\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010L\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010N\u001a\u0004\u0018\u00010O8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¯\u0001\u0010°\u0001R\u001a\u0010P\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b±\u0001\u0010²\u0001R\u001a\u0010R\u001a\u0004\u0018\u00010S8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b³\u0001\u0010´\u0001R\u001a\u0010T\u001a\u0004\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010V\u001a\u0004\u0018\u00010W8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b·\u0001\u0010¸\u0001R\u001a\u0010X\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010Z\u001a\u0004\u0018\u00010[8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010¼\u0001R\u001a\u0010\\\u001a\u0004\u0018\u00010]8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010^\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¿\u0001\u0010À\u0001¨\u0006Ë\u0001"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/AppEvent;", "Lcom/squareup/wire/Message;", "", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "nav_tab", "experiments", "session_id", "url", "web_referrer", "web_referrer_host", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/rosetta/eventlogging/AppEventData;", "screen_data", "Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventData;", "push_notification_data", "Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "notification_stack_data", "Lcom/robinhood/rosetta/eventlogging/NotificationStackEventData;", "tab_group_data", "Lcom/robinhood/rosetta/eventlogging/TabGroupEventData;", "button_group_data", "Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventData;", "app_session_data", "Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "tutorial_data", "Lcom/robinhood/rosetta/eventlogging/TutorialEventData;", "deep_link_data", "Lcom/robinhood/rosetta/eventlogging/DeepLinkEventData;", "email_data", "Lcom/robinhood/rosetta/eventlogging/EmailEventData;", "error_data", "Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "web_data", "Lcom/robinhood/rosetta/eventlogging/WebEventData;", "user_action_data", "Lcom/robinhood/rosetta/eventlogging/UserActionData;", "sms_data", "Lcom/robinhood/rosetta/eventlogging/SMSData;", "adjust_data", "Lcom/robinhood/rosetta/eventlogging/AdjustData;", "plaid_event_data", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData;", "debit_card_s_c_a_event_data", "Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventData;", "user_interaction_event_data", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "performance_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "performance_metric_span_event_data", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "order_data", "Lcom/robinhood/rosetta/eventlogging/OrderEventData;", "time_first_interaction_data", "Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionData;", "experiments_data", "Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "equity_order_data", "Lcom/robinhood/rosetta/eventlogging/EquityOrderEventData;", "option_order_data", "Lcom/robinhood/rosetta/eventlogging/OptionOrderEventData;", "crypto_order_data", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventData;", "web_view_navigation_data", "Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;", "network_error_data", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "device_security_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "http_call_data", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "device_metric_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "arkose_labs_event_data", "Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData;", "oauth_login_event_data", "Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData;", "prompts_challenge_event_data", "Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;", "twilio_conversations_sdk_event_data", "Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;", "pathfinder_fallback_to_web_view_event_data", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;", "recommendations_event_data", "Lcom/robinhood/rosetta/eventlogging/RecommendationsEventData;", "device_approval_reenrollment_event_data", "Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData;", "account_security_event_data", "Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;", "catpay_order_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "perpetual_order_data", "Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventData;", "perceived_loading_time_event_data", "Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/AppEventData;Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventData;Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;Lcom/robinhood/rosetta/eventlogging/NotificationStackEventData;Lcom/robinhood/rosetta/eventlogging/TabGroupEventData;Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventData;Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;Lcom/robinhood/rosetta/eventlogging/TutorialEventData;Lcom/robinhood/rosetta/eventlogging/DeepLinkEventData;Lcom/robinhood/rosetta/eventlogging/EmailEventData;Lcom/robinhood/rosetta/eventlogging/ErrorEventData;Lcom/robinhood/rosetta/eventlogging/WebEventData;Lcom/robinhood/rosetta/eventlogging/UserActionData;Lcom/robinhood/rosetta/eventlogging/SMSData;Lcom/robinhood/rosetta/eventlogging/AdjustData;Lcom/robinhood/rosetta/eventlogging/PlaidEventData;Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventData;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;Lcom/robinhood/rosetta/eventlogging/OrderEventData;Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionData;Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;Lcom/robinhood/rosetta/eventlogging/EquityOrderEventData;Lcom/robinhood/rosetta/eventlogging/OptionOrderEventData;Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventData;Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;Lcom/robinhood/rosetta/eventlogging/HttpCallData;Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData;Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData;Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;Lcom/robinhood/rosetta/eventlogging/RecommendationsEventData;Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData;Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventData;Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;Lokio/ByteString;)V", "getCategory", "()Ljava/lang/String;", "getEvent", "getNav_tab", "getExperiments", "getSession_id", "getUrl", "getWeb_referrer", "getWeb_referrer_host", "getData", "()Lcom/robinhood/rosetta/eventlogging/AppEventData;", "getScreen_data", "()Lcom/robinhood/rosetta/eventlogging/ScreenTransitionEventData;", "getPush_notification_data", "()Lcom/robinhood/rosetta/eventlogging/PushNotificationEventData;", "getNotification_stack_data", "()Lcom/robinhood/rosetta/eventlogging/NotificationStackEventData;", "getTab_group_data", "()Lcom/robinhood/rosetta/eventlogging/TabGroupEventData;", "getButton_group_data", "()Lcom/robinhood/rosetta/eventlogging/ButtonGroupEventData;", "getApp_session_data", "()Lcom/robinhood/rosetta/eventlogging/AppSessionEventData;", "getTutorial_data", "()Lcom/robinhood/rosetta/eventlogging/TutorialEventData;", "getDeep_link_data", "()Lcom/robinhood/rosetta/eventlogging/DeepLinkEventData;", "getEmail_data", "()Lcom/robinhood/rosetta/eventlogging/EmailEventData;", "getError_data", "()Lcom/robinhood/rosetta/eventlogging/ErrorEventData;", "getWeb_data", "()Lcom/robinhood/rosetta/eventlogging/WebEventData;", "getUser_action_data", "()Lcom/robinhood/rosetta/eventlogging/UserActionData;", "getSms_data", "()Lcom/robinhood/rosetta/eventlogging/SMSData;", "getAdjust_data", "()Lcom/robinhood/rosetta/eventlogging/AdjustData;", "getPlaid_event_data", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventData;", "getDebit_card_s_c_a_event_data", "()Lcom/robinhood/rosetta/eventlogging/DebitCardSCAEventData;", "getUser_interaction_event_data", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getPerformance_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData;", "getPerformance_metric_span_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData;", "getOrder_data", "()Lcom/robinhood/rosetta/eventlogging/OrderEventData;", "getTime_first_interaction_data", "()Lcom/robinhood/rosetta/eventlogging/TimeFirstInteractionData;", "getExperiments_data", "()Lcom/robinhood/rosetta/eventlogging/ExperimentsEventData;", "getEquity_order_data", "()Lcom/robinhood/rosetta/eventlogging/EquityOrderEventData;", "getOption_order_data", "()Lcom/robinhood/rosetta/eventlogging/OptionOrderEventData;", "getCrypto_order_data", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderEventData;", "getWeb_view_navigation_data", "()Lcom/robinhood/rosetta/eventlogging/WebViewNavigationData;", "getNetwork_error_data", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "getDevice_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData;", "getHttp_call_data", "()Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "getDevice_metric_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceMetricEventData;", "getArkose_labs_event_data", "()Lcom/robinhood/rosetta/eventlogging/ArkoseLabsEventData;", "getOauth_login_event_data", "()Lcom/robinhood/rosetta/eventlogging/OAuthLoginEventData;", "getPrompts_challenge_event_data", "()Lcom/robinhood/rosetta/eventlogging/PromptsChallengeEventData;", "getTwilio_conversations_sdk_event_data", "()Lcom/robinhood/rosetta/eventlogging/TwilioConversationsSdkEventData;", "getPathfinder_fallback_to_web_view_event_data", "()Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData;", "getRecommendations_event_data", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsEventData;", "getDevice_approval_reenrollment_event_data", "()Lcom/robinhood/rosetta/eventlogging/DeviceApprovalReenrollmentEventData;", "getAccount_security_event_data", "()Lcom/robinhood/rosetta/eventlogging/AccountSecurityEventData;", "getCatpay_order_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "getPerpetual_order_data", "()Lcom/robinhood/rosetta/eventlogging/PerpetualOrderEventData;", "getPerceived_loading_time_event_data", "()Lcom/robinhood/rosetta/eventlogging/PerceivedLoadingTimeEventData;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class AppEvent extends Message {

    @JvmField
    public static final ProtoAdapter<AppEvent> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AccountSecurityEventData#ADAPTER", jsonName = "accountSecurityEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 46, tag = 47)
    private final AccountSecurityEventData account_security_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AdjustData#ADAPTER", jsonName = "adjustData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final AdjustData adjust_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AppSessionEventData#ADAPTER", jsonName = "appSessionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final AppSessionEventData app_session_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ArkoseLabsEventData#ADAPTER", jsonName = "arkoseLabsEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 40)
    private final ArkoseLabsEventData arkose_labs_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ButtonGroupEventData#ADAPTER", jsonName = "buttonGroupData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final ButtonGroupEventData button_group_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String category;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderEventData#ADAPTER", jsonName = "catpayOrderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 47, tag = 48)
    private final CatpayOrderEventData catpay_order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderEventData#ADAPTER", jsonName = "cryptoOrderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 34)
    private final CryptoOrderEventData crypto_order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AppEventData#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final AppEventData data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DebitCardSCAEventData#ADAPTER", jsonName = "debitCardSCAEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final DebitCardSCAEventData debit_card_s_c_a_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeepLinkEventData#ADAPTER", jsonName = "deepLinkData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final DeepLinkEventData deep_link_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceApprovalReenrollmentEventData#ADAPTER", jsonName = "deviceApprovalReenrollmentEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 45, tag = 46)
    private final DeviceApprovalReenrollmentEventData device_approval_reenrollment_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceMetricEventData#ADAPTER", jsonName = "deviceMetricEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 39)
    private final DeviceMetricEventData device_metric_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DeviceSecurityEventData#ADAPTER", jsonName = "deviceSecurityEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 37)
    private final DeviceSecurityEventData device_security_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EmailEventData#ADAPTER", jsonName = "emailData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final EmailEventData email_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.EquityOrderEventData#ADAPTER", jsonName = "equityOrderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final EquityOrderEventData equity_order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ErrorEventData#ADAPTER", jsonName = "errorData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final ErrorEventData error_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String experiments;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ExperimentsEventData#ADAPTER", jsonName = "experimentsData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final ExperimentsEventData experiments_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.HttpCallData#ADAPTER", jsonName = "httpCallData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 38)
    private final HttpCallData http_call_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "navTab", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String nav_tab;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NetworkErrorData#ADAPTER", jsonName = "networkErrorData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 36)
    private final NetworkErrorData network_error_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NotificationStackEventData#ADAPTER", jsonName = "notificationStackData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final NotificationStackEventData notification_stack_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OAuthLoginEventData#ADAPTER", jsonName = "oauthLoginEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 40, tag = 41)
    private final OAuthLoginEventData oauth_login_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionOrderEventData#ADAPTER", jsonName = "optionOrderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final OptionOrderEventData option_order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OrderEventData#ADAPTER", jsonName = "orderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final OrderEventData order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData#ADAPTER", jsonName = "pathfinderFallbackToWebViewEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 43, tag = 44)
    private final PathfinderFallbackToWebViewEventData pathfinder_fallback_to_web_view_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerceivedLoadingTimeEventData#ADAPTER", jsonName = "perceivedLoadingTimeEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 49, tag = 50)
    private final PerceivedLoadingTimeEventData perceived_loading_time_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricEventData#ADAPTER", jsonName = "performanceMetricEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final PerformanceMetricEventData performance_metric_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData#ADAPTER", jsonName = "performanceMetricSpanEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final PerformanceMetricSpanEventData performance_metric_span_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PerpetualOrderEventData#ADAPTER", jsonName = "perpetualOrderData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 48, tag = 49)
    private final PerpetualOrderEventData perpetual_order_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PlaidEventData#ADAPTER", jsonName = "plaidEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final PlaidEventData plaid_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PromptsChallengeEventData#ADAPTER", jsonName = "promptsChallengeEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 42)
    private final PromptsChallengeEventData prompts_challenge_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PushNotificationEventData#ADAPTER", jsonName = "pushNotificationData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final PushNotificationEventData push_notification_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.RecommendationsEventData#ADAPTER", jsonName = "recommendationsEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 44, tag = 45)
    private final RecommendationsEventData recommendations_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ScreenTransitionEventData#ADAPTER", jsonName = "screenData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final ScreenTransitionEventData screen_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String session_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SMSData#ADAPTER", jsonName = "smsData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final SMSData sms_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TabGroupEventData#ADAPTER", jsonName = "tabGroupData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final TabGroupEventData tab_group_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TimeFirstInteractionData#ADAPTER", jsonName = "timeFirstInteractionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final TimeFirstInteractionData time_first_interaction_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TutorialEventData#ADAPTER", jsonName = "tutorialData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final TutorialEventData tutorial_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.TwilioConversationsSdkEventData#ADAPTER", jsonName = "twilioConversationsSdkEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 43)
    private final TwilioConversationsSdkEventData twilio_conversations_sdk_event_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String url;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserActionData#ADAPTER", jsonName = "userActionData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final UserActionData user_action_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserInteractionEventData#ADAPTER", jsonName = "userInteractionEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final UserInteractionEventData user_interaction_event_data;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WebEventData#ADAPTER", jsonName = "webData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final WebEventData web_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webReferrer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String web_referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webReferrerHost", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String web_referrer_host;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.WebViewNavigationData#ADAPTER", jsonName = "webViewNavigationData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 35)
    private final WebViewNavigationData web_view_navigation_data;

    public AppEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AppEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, AppEventData appEventData, ScreenTransitionEventData screenTransitionEventData, PushNotificationEventData pushNotificationEventData, NotificationStackEventData notificationStackEventData, TabGroupEventData tabGroupEventData, ButtonGroupEventData buttonGroupEventData, AppSessionEventData appSessionEventData, TutorialEventData tutorialEventData, DeepLinkEventData deepLinkEventData, EmailEventData emailEventData, ErrorEventData errorEventData, WebEventData webEventData, UserActionData userActionData, SMSData sMSData, AdjustData adjustData, PlaidEventData plaidEventData, DebitCardSCAEventData debitCardSCAEventData, UserInteractionEventData userInteractionEventData, PerformanceMetricEventData performanceMetricEventData, PerformanceMetricSpanEventData performanceMetricSpanEventData, OrderEventData orderEventData, TimeFirstInteractionData timeFirstInteractionData, ExperimentsEventData experimentsEventData, EquityOrderEventData equityOrderEventData, OptionOrderEventData optionOrderEventData, CryptoOrderEventData cryptoOrderEventData, WebViewNavigationData webViewNavigationData, NetworkErrorData networkErrorData, DeviceSecurityEventData deviceSecurityEventData, HttpCallData httpCallData, DeviceMetricEventData deviceMetricEventData, ArkoseLabsEventData arkoseLabsEventData, OAuthLoginEventData oAuthLoginEventData, PromptsChallengeEventData promptsChallengeEventData, TwilioConversationsSdkEventData twilioConversationsSdkEventData, PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData, RecommendationsEventData recommendationsEventData, DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventData, AccountSecurityEventData accountSecurityEventData, CatpayOrderEventData catpayOrderEventData, PerpetualOrderEventData perpetualOrderEventData, PerceivedLoadingTimeEventData perceivedLoadingTimeEventData, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str9 = (i & 1) != 0 ? "" : str;
        this(str9, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? null : appEventData, (i & 512) != 0 ? null : screenTransitionEventData, (i & 1024) != 0 ? null : pushNotificationEventData, (i & 2048) != 0 ? null : notificationStackEventData, (i & 4096) != 0 ? null : tabGroupEventData, (i & 8192) != 0 ? null : buttonGroupEventData, (i & 16384) != 0 ? null : appSessionEventData, (i & 32768) != 0 ? null : tutorialEventData, (i & 65536) != 0 ? null : deepLinkEventData, (i & 131072) != 0 ? null : emailEventData, (i & 262144) != 0 ? null : errorEventData, (i & 524288) != 0 ? null : webEventData, (i & 1048576) != 0 ? null : userActionData, (i & 2097152) != 0 ? null : sMSData, (i & 4194304) != 0 ? null : adjustData, (i & 8388608) != 0 ? null : plaidEventData, (i & 16777216) != 0 ? null : debitCardSCAEventData, (i & 33554432) != 0 ? null : userInteractionEventData, (i & 67108864) != 0 ? null : performanceMetricEventData, (i & 134217728) != 0 ? null : performanceMetricSpanEventData, (i & 268435456) != 0 ? null : orderEventData, (i & 536870912) != 0 ? null : timeFirstInteractionData, (i & 1073741824) != 0 ? null : experimentsEventData, (i & Integer.MIN_VALUE) != 0 ? null : equityOrderEventData, (i2 & 1) != 0 ? null : optionOrderEventData, (i2 & 2) != 0 ? null : cryptoOrderEventData, (i2 & 4) != 0 ? null : webViewNavigationData, (i2 & 8) != 0 ? null : networkErrorData, (i2 & 16) != 0 ? null : deviceSecurityEventData, (i2 & 32) != 0 ? null : httpCallData, (i2 & 64) != 0 ? null : deviceMetricEventData, (i2 & 128) != 0 ? null : arkoseLabsEventData, (i2 & 256) != 0 ? null : oAuthLoginEventData, (i2 & 512) != 0 ? null : promptsChallengeEventData, (i2 & 1024) != 0 ? null : twilioConversationsSdkEventData, (i2 & 2048) != 0 ? null : pathfinderFallbackToWebViewEventData, (i2 & 4096) != 0 ? null : recommendationsEventData, (i2 & 8192) != 0 ? null : deviceApprovalReenrollmentEventData, (i2 & 16384) != 0 ? null : accountSecurityEventData, (i2 & 32768) != 0 ? null : catpayOrderEventData, (i2 & 65536) != 0 ? null : perpetualOrderEventData, (i2 & 131072) != 0 ? null : perceivedLoadingTimeEventData, (i2 & 262144) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24009newBuilder();
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getNav_tab() {
        return this.nav_tab;
    }

    public final String getExperiments() {
        return this.experiments;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWeb_referrer() {
        return this.web_referrer;
    }

    public final String getWeb_referrer_host() {
        return this.web_referrer_host;
    }

    public final AppEventData getData() {
        return this.data;
    }

    public final ScreenTransitionEventData getScreen_data() {
        return this.screen_data;
    }

    public final PushNotificationEventData getPush_notification_data() {
        return this.push_notification_data;
    }

    public final NotificationStackEventData getNotification_stack_data() {
        return this.notification_stack_data;
    }

    public final TabGroupEventData getTab_group_data() {
        return this.tab_group_data;
    }

    public final ButtonGroupEventData getButton_group_data() {
        return this.button_group_data;
    }

    public final AppSessionEventData getApp_session_data() {
        return this.app_session_data;
    }

    public final TutorialEventData getTutorial_data() {
        return this.tutorial_data;
    }

    public final DeepLinkEventData getDeep_link_data() {
        return this.deep_link_data;
    }

    public final EmailEventData getEmail_data() {
        return this.email_data;
    }

    public final ErrorEventData getError_data() {
        return this.error_data;
    }

    public final WebEventData getWeb_data() {
        return this.web_data;
    }

    public final UserActionData getUser_action_data() {
        return this.user_action_data;
    }

    public final SMSData getSms_data() {
        return this.sms_data;
    }

    public final AdjustData getAdjust_data() {
        return this.adjust_data;
    }

    public final PlaidEventData getPlaid_event_data() {
        return this.plaid_event_data;
    }

    public final DebitCardSCAEventData getDebit_card_s_c_a_event_data() {
        return this.debit_card_s_c_a_event_data;
    }

    public final UserInteractionEventData getUser_interaction_event_data() {
        return this.user_interaction_event_data;
    }

    public final PerformanceMetricEventData getPerformance_metric_event_data() {
        return this.performance_metric_event_data;
    }

    public final PerformanceMetricSpanEventData getPerformance_metric_span_event_data() {
        return this.performance_metric_span_event_data;
    }

    public final OrderEventData getOrder_data() {
        return this.order_data;
    }

    public final TimeFirstInteractionData getTime_first_interaction_data() {
        return this.time_first_interaction_data;
    }

    public final ExperimentsEventData getExperiments_data() {
        return this.experiments_data;
    }

    public final EquityOrderEventData getEquity_order_data() {
        return this.equity_order_data;
    }

    public final OptionOrderEventData getOption_order_data() {
        return this.option_order_data;
    }

    public final CryptoOrderEventData getCrypto_order_data() {
        return this.crypto_order_data;
    }

    public final WebViewNavigationData getWeb_view_navigation_data() {
        return this.web_view_navigation_data;
    }

    public final NetworkErrorData getNetwork_error_data() {
        return this.network_error_data;
    }

    public final DeviceSecurityEventData getDevice_security_event_data() {
        return this.device_security_event_data;
    }

    public final HttpCallData getHttp_call_data() {
        return this.http_call_data;
    }

    public final DeviceMetricEventData getDevice_metric_event_data() {
        return this.device_metric_event_data;
    }

    public final ArkoseLabsEventData getArkose_labs_event_data() {
        return this.arkose_labs_event_data;
    }

    public final OAuthLoginEventData getOauth_login_event_data() {
        return this.oauth_login_event_data;
    }

    public final PromptsChallengeEventData getPrompts_challenge_event_data() {
        return this.prompts_challenge_event_data;
    }

    public final TwilioConversationsSdkEventData getTwilio_conversations_sdk_event_data() {
        return this.twilio_conversations_sdk_event_data;
    }

    public final PathfinderFallbackToWebViewEventData getPathfinder_fallback_to_web_view_event_data() {
        return this.pathfinder_fallback_to_web_view_event_data;
    }

    public final RecommendationsEventData getRecommendations_event_data() {
        return this.recommendations_event_data;
    }

    public final DeviceApprovalReenrollmentEventData getDevice_approval_reenrollment_event_data() {
        return this.device_approval_reenrollment_event_data;
    }

    public final AccountSecurityEventData getAccount_security_event_data() {
        return this.account_security_event_data;
    }

    public final CatpayOrderEventData getCatpay_order_data() {
        return this.catpay_order_data;
    }

    public final PerpetualOrderEventData getPerpetual_order_data() {
        return this.perpetual_order_data;
    }

    public final PerceivedLoadingTimeEventData getPerceived_loading_time_event_data() {
        return this.perceived_loading_time_event_data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppEvent(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventData appEventData, ScreenTransitionEventData screenTransitionEventData, PushNotificationEventData pushNotificationEventData, NotificationStackEventData notificationStackEventData, TabGroupEventData tabGroupEventData, ButtonGroupEventData buttonGroupEventData, AppSessionEventData appSessionEventData, TutorialEventData tutorialEventData, DeepLinkEventData deepLinkEventData, EmailEventData emailEventData, ErrorEventData errorEventData, WebEventData webEventData, UserActionData userActionData, SMSData sMSData, AdjustData adjustData, PlaidEventData plaidEventData, DebitCardSCAEventData debitCardSCAEventData, UserInteractionEventData userInteractionEventData, PerformanceMetricEventData performanceMetricEventData, PerformanceMetricSpanEventData performanceMetricSpanEventData, OrderEventData orderEventData, TimeFirstInteractionData timeFirstInteractionData, ExperimentsEventData experimentsEventData, EquityOrderEventData equityOrderEventData, OptionOrderEventData optionOrderEventData, CryptoOrderEventData cryptoOrderEventData, WebViewNavigationData webViewNavigationData, NetworkErrorData networkErrorData, DeviceSecurityEventData deviceSecurityEventData, HttpCallData httpCallData, DeviceMetricEventData deviceMetricEventData, ArkoseLabsEventData arkoseLabsEventData, OAuthLoginEventData oAuthLoginEventData, PromptsChallengeEventData promptsChallengeEventData, TwilioConversationsSdkEventData twilioConversationsSdkEventData, PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData, RecommendationsEventData recommendationsEventData, DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventData, AccountSecurityEventData accountSecurityEventData, CatpayOrderEventData catpayOrderEventData, PerpetualOrderEventData perpetualOrderEventData, PerceivedLoadingTimeEventData perceivedLoadingTimeEventData, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.category = category;
        this.event = event;
        this.nav_tab = nav_tab;
        this.experiments = experiments;
        this.session_id = session_id;
        this.url = url;
        this.web_referrer = web_referrer;
        this.web_referrer_host = web_referrer_host;
        this.data = appEventData;
        this.screen_data = screenTransitionEventData;
        this.push_notification_data = pushNotificationEventData;
        this.notification_stack_data = notificationStackEventData;
        this.tab_group_data = tabGroupEventData;
        this.button_group_data = buttonGroupEventData;
        this.app_session_data = appSessionEventData;
        this.tutorial_data = tutorialEventData;
        this.deep_link_data = deepLinkEventData;
        this.email_data = emailEventData;
        this.error_data = errorEventData;
        this.web_data = webEventData;
        this.user_action_data = userActionData;
        this.sms_data = sMSData;
        this.adjust_data = adjustData;
        this.plaid_event_data = plaidEventData;
        this.debit_card_s_c_a_event_data = debitCardSCAEventData;
        this.user_interaction_event_data = userInteractionEventData;
        this.performance_metric_event_data = performanceMetricEventData;
        this.performance_metric_span_event_data = performanceMetricSpanEventData;
        this.order_data = orderEventData;
        this.time_first_interaction_data = timeFirstInteractionData;
        this.experiments_data = experimentsEventData;
        this.equity_order_data = equityOrderEventData;
        this.option_order_data = optionOrderEventData;
        this.crypto_order_data = cryptoOrderEventData;
        this.web_view_navigation_data = webViewNavigationData;
        this.network_error_data = networkErrorData;
        this.device_security_event_data = deviceSecurityEventData;
        this.http_call_data = httpCallData;
        this.device_metric_event_data = deviceMetricEventData;
        this.arkose_labs_event_data = arkoseLabsEventData;
        this.oauth_login_event_data = oAuthLoginEventData;
        this.prompts_challenge_event_data = promptsChallengeEventData;
        this.twilio_conversations_sdk_event_data = twilioConversationsSdkEventData;
        this.pathfinder_fallback_to_web_view_event_data = pathfinderFallbackToWebViewEventData;
        this.recommendations_event_data = recommendationsEventData;
        this.device_approval_reenrollment_event_data = deviceApprovalReenrollmentEventData;
        this.account_security_event_data = accountSecurityEventData;
        this.catpay_order_data = catpayOrderEventData;
        this.perpetual_order_data = perpetualOrderEventData;
        this.perceived_loading_time_event_data = perceivedLoadingTimeEventData;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24009newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AppEvent)) {
            return false;
        }
        AppEvent appEvent = (AppEvent) other;
        return Intrinsics.areEqual(unknownFields(), appEvent.unknownFields()) && Intrinsics.areEqual(this.category, appEvent.category) && Intrinsics.areEqual(this.event, appEvent.event) && Intrinsics.areEqual(this.nav_tab, appEvent.nav_tab) && Intrinsics.areEqual(this.experiments, appEvent.experiments) && Intrinsics.areEqual(this.session_id, appEvent.session_id) && Intrinsics.areEqual(this.url, appEvent.url) && Intrinsics.areEqual(this.web_referrer, appEvent.web_referrer) && Intrinsics.areEqual(this.web_referrer_host, appEvent.web_referrer_host) && Intrinsics.areEqual(this.data, appEvent.data) && Intrinsics.areEqual(this.screen_data, appEvent.screen_data) && Intrinsics.areEqual(this.push_notification_data, appEvent.push_notification_data) && Intrinsics.areEqual(this.notification_stack_data, appEvent.notification_stack_data) && Intrinsics.areEqual(this.tab_group_data, appEvent.tab_group_data) && Intrinsics.areEqual(this.button_group_data, appEvent.button_group_data) && Intrinsics.areEqual(this.app_session_data, appEvent.app_session_data) && Intrinsics.areEqual(this.tutorial_data, appEvent.tutorial_data) && Intrinsics.areEqual(this.deep_link_data, appEvent.deep_link_data) && Intrinsics.areEqual(this.email_data, appEvent.email_data) && Intrinsics.areEqual(this.error_data, appEvent.error_data) && Intrinsics.areEqual(this.web_data, appEvent.web_data) && Intrinsics.areEqual(this.user_action_data, appEvent.user_action_data) && Intrinsics.areEqual(this.sms_data, appEvent.sms_data) && Intrinsics.areEqual(this.adjust_data, appEvent.adjust_data) && Intrinsics.areEqual(this.plaid_event_data, appEvent.plaid_event_data) && Intrinsics.areEqual(this.debit_card_s_c_a_event_data, appEvent.debit_card_s_c_a_event_data) && Intrinsics.areEqual(this.user_interaction_event_data, appEvent.user_interaction_event_data) && Intrinsics.areEqual(this.performance_metric_event_data, appEvent.performance_metric_event_data) && Intrinsics.areEqual(this.performance_metric_span_event_data, appEvent.performance_metric_span_event_data) && Intrinsics.areEqual(this.order_data, appEvent.order_data) && Intrinsics.areEqual(this.time_first_interaction_data, appEvent.time_first_interaction_data) && Intrinsics.areEqual(this.experiments_data, appEvent.experiments_data) && Intrinsics.areEqual(this.equity_order_data, appEvent.equity_order_data) && Intrinsics.areEqual(this.option_order_data, appEvent.option_order_data) && Intrinsics.areEqual(this.crypto_order_data, appEvent.crypto_order_data) && Intrinsics.areEqual(this.web_view_navigation_data, appEvent.web_view_navigation_data) && Intrinsics.areEqual(this.network_error_data, appEvent.network_error_data) && Intrinsics.areEqual(this.device_security_event_data, appEvent.device_security_event_data) && Intrinsics.areEqual(this.http_call_data, appEvent.http_call_data) && Intrinsics.areEqual(this.device_metric_event_data, appEvent.device_metric_event_data) && Intrinsics.areEqual(this.arkose_labs_event_data, appEvent.arkose_labs_event_data) && Intrinsics.areEqual(this.oauth_login_event_data, appEvent.oauth_login_event_data) && Intrinsics.areEqual(this.prompts_challenge_event_data, appEvent.prompts_challenge_event_data) && Intrinsics.areEqual(this.twilio_conversations_sdk_event_data, appEvent.twilio_conversations_sdk_event_data) && Intrinsics.areEqual(this.pathfinder_fallback_to_web_view_event_data, appEvent.pathfinder_fallback_to_web_view_event_data) && Intrinsics.areEqual(this.recommendations_event_data, appEvent.recommendations_event_data) && Intrinsics.areEqual(this.device_approval_reenrollment_event_data, appEvent.device_approval_reenrollment_event_data) && Intrinsics.areEqual(this.account_security_event_data, appEvent.account_security_event_data) && Intrinsics.areEqual(this.catpay_order_data, appEvent.catpay_order_data) && Intrinsics.areEqual(this.perpetual_order_data, appEvent.perpetual_order_data) && Intrinsics.areEqual(this.perceived_loading_time_event_data, appEvent.perceived_loading_time_event_data);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.category.hashCode()) * 37) + this.event.hashCode()) * 37) + this.nav_tab.hashCode()) * 37) + this.experiments.hashCode()) * 37) + this.session_id.hashCode()) * 37) + this.url.hashCode()) * 37) + this.web_referrer.hashCode()) * 37) + this.web_referrer_host.hashCode()) * 37;
        AppEventData appEventData = this.data;
        int iHashCode2 = (iHashCode + (appEventData != null ? appEventData.hashCode() : 0)) * 37;
        ScreenTransitionEventData screenTransitionEventData = this.screen_data;
        int iHashCode3 = (iHashCode2 + (screenTransitionEventData != null ? screenTransitionEventData.hashCode() : 0)) * 37;
        PushNotificationEventData pushNotificationEventData = this.push_notification_data;
        int iHashCode4 = (iHashCode3 + (pushNotificationEventData != null ? pushNotificationEventData.hashCode() : 0)) * 37;
        NotificationStackEventData notificationStackEventData = this.notification_stack_data;
        int iHashCode5 = (iHashCode4 + (notificationStackEventData != null ? notificationStackEventData.hashCode() : 0)) * 37;
        TabGroupEventData tabGroupEventData = this.tab_group_data;
        int iHashCode6 = (iHashCode5 + (tabGroupEventData != null ? tabGroupEventData.hashCode() : 0)) * 37;
        ButtonGroupEventData buttonGroupEventData = this.button_group_data;
        int iHashCode7 = (iHashCode6 + (buttonGroupEventData != null ? buttonGroupEventData.hashCode() : 0)) * 37;
        AppSessionEventData appSessionEventData = this.app_session_data;
        int iHashCode8 = (iHashCode7 + (appSessionEventData != null ? appSessionEventData.hashCode() : 0)) * 37;
        TutorialEventData tutorialEventData = this.tutorial_data;
        int iHashCode9 = (iHashCode8 + (tutorialEventData != null ? tutorialEventData.hashCode() : 0)) * 37;
        DeepLinkEventData deepLinkEventData = this.deep_link_data;
        int iHashCode10 = (iHashCode9 + (deepLinkEventData != null ? deepLinkEventData.hashCode() : 0)) * 37;
        EmailEventData emailEventData = this.email_data;
        int iHashCode11 = (iHashCode10 + (emailEventData != null ? emailEventData.hashCode() : 0)) * 37;
        ErrorEventData errorEventData = this.error_data;
        int iHashCode12 = (iHashCode11 + (errorEventData != null ? errorEventData.hashCode() : 0)) * 37;
        WebEventData webEventData = this.web_data;
        int iHashCode13 = (iHashCode12 + (webEventData != null ? webEventData.hashCode() : 0)) * 37;
        UserActionData userActionData = this.user_action_data;
        int iHashCode14 = (iHashCode13 + (userActionData != null ? userActionData.hashCode() : 0)) * 37;
        SMSData sMSData = this.sms_data;
        int iHashCode15 = (iHashCode14 + (sMSData != null ? sMSData.hashCode() : 0)) * 37;
        AdjustData adjustData = this.adjust_data;
        int iHashCode16 = (iHashCode15 + (adjustData != null ? adjustData.hashCode() : 0)) * 37;
        PlaidEventData plaidEventData = this.plaid_event_data;
        int iHashCode17 = (iHashCode16 + (plaidEventData != null ? plaidEventData.hashCode() : 0)) * 37;
        DebitCardSCAEventData debitCardSCAEventData = this.debit_card_s_c_a_event_data;
        int iHashCode18 = (iHashCode17 + (debitCardSCAEventData != null ? debitCardSCAEventData.hashCode() : 0)) * 37;
        UserInteractionEventData userInteractionEventData = this.user_interaction_event_data;
        int iHashCode19 = (iHashCode18 + (userInteractionEventData != null ? userInteractionEventData.hashCode() : 0)) * 37;
        PerformanceMetricEventData performanceMetricEventData = this.performance_metric_event_data;
        int iHashCode20 = (iHashCode19 + (performanceMetricEventData != null ? performanceMetricEventData.hashCode() : 0)) * 37;
        PerformanceMetricSpanEventData performanceMetricSpanEventData = this.performance_metric_span_event_data;
        int iHashCode21 = (iHashCode20 + (performanceMetricSpanEventData != null ? performanceMetricSpanEventData.hashCode() : 0)) * 37;
        OrderEventData orderEventData = this.order_data;
        int iHashCode22 = (iHashCode21 + (orderEventData != null ? orderEventData.hashCode() : 0)) * 37;
        TimeFirstInteractionData timeFirstInteractionData = this.time_first_interaction_data;
        int iHashCode23 = (iHashCode22 + (timeFirstInteractionData != null ? timeFirstInteractionData.hashCode() : 0)) * 37;
        ExperimentsEventData experimentsEventData = this.experiments_data;
        int iHashCode24 = (iHashCode23 + (experimentsEventData != null ? experimentsEventData.hashCode() : 0)) * 37;
        EquityOrderEventData equityOrderEventData = this.equity_order_data;
        int iHashCode25 = (iHashCode24 + (equityOrderEventData != null ? equityOrderEventData.hashCode() : 0)) * 37;
        OptionOrderEventData optionOrderEventData = this.option_order_data;
        int iHashCode26 = (iHashCode25 + (optionOrderEventData != null ? optionOrderEventData.hashCode() : 0)) * 37;
        CryptoOrderEventData cryptoOrderEventData = this.crypto_order_data;
        int iHashCode27 = (iHashCode26 + (cryptoOrderEventData != null ? cryptoOrderEventData.hashCode() : 0)) * 37;
        WebViewNavigationData webViewNavigationData = this.web_view_navigation_data;
        int iHashCode28 = (iHashCode27 + (webViewNavigationData != null ? webViewNavigationData.hashCode() : 0)) * 37;
        NetworkErrorData networkErrorData = this.network_error_data;
        int iHashCode29 = (iHashCode28 + (networkErrorData != null ? networkErrorData.hashCode() : 0)) * 37;
        DeviceSecurityEventData deviceSecurityEventData = this.device_security_event_data;
        int iHashCode30 = (iHashCode29 + (deviceSecurityEventData != null ? deviceSecurityEventData.hashCode() : 0)) * 37;
        HttpCallData httpCallData = this.http_call_data;
        int iHashCode31 = (iHashCode30 + (httpCallData != null ? httpCallData.hashCode() : 0)) * 37;
        DeviceMetricEventData deviceMetricEventData = this.device_metric_event_data;
        int iHashCode32 = (iHashCode31 + (deviceMetricEventData != null ? deviceMetricEventData.hashCode() : 0)) * 37;
        ArkoseLabsEventData arkoseLabsEventData = this.arkose_labs_event_data;
        int iHashCode33 = (iHashCode32 + (arkoseLabsEventData != null ? arkoseLabsEventData.hashCode() : 0)) * 37;
        OAuthLoginEventData oAuthLoginEventData = this.oauth_login_event_data;
        int iHashCode34 = (iHashCode33 + (oAuthLoginEventData != null ? oAuthLoginEventData.hashCode() : 0)) * 37;
        PromptsChallengeEventData promptsChallengeEventData = this.prompts_challenge_event_data;
        int iHashCode35 = (iHashCode34 + (promptsChallengeEventData != null ? promptsChallengeEventData.hashCode() : 0)) * 37;
        TwilioConversationsSdkEventData twilioConversationsSdkEventData = this.twilio_conversations_sdk_event_data;
        int iHashCode36 = (iHashCode35 + (twilioConversationsSdkEventData != null ? twilioConversationsSdkEventData.hashCode() : 0)) * 37;
        PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData = this.pathfinder_fallback_to_web_view_event_data;
        int iHashCode37 = (iHashCode36 + (pathfinderFallbackToWebViewEventData != null ? pathfinderFallbackToWebViewEventData.hashCode() : 0)) * 37;
        RecommendationsEventData recommendationsEventData = this.recommendations_event_data;
        int iHashCode38 = (iHashCode37 + (recommendationsEventData != null ? recommendationsEventData.hashCode() : 0)) * 37;
        DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventData = this.device_approval_reenrollment_event_data;
        int iHashCode39 = (iHashCode38 + (deviceApprovalReenrollmentEventData != null ? deviceApprovalReenrollmentEventData.hashCode() : 0)) * 37;
        AccountSecurityEventData accountSecurityEventData = this.account_security_event_data;
        int iHashCode40 = (iHashCode39 + (accountSecurityEventData != null ? accountSecurityEventData.hashCode() : 0)) * 37;
        CatpayOrderEventData catpayOrderEventData = this.catpay_order_data;
        int iHashCode41 = (iHashCode40 + (catpayOrderEventData != null ? catpayOrderEventData.hashCode() : 0)) * 37;
        PerpetualOrderEventData perpetualOrderEventData = this.perpetual_order_data;
        int iHashCode42 = (iHashCode41 + (perpetualOrderEventData != null ? perpetualOrderEventData.hashCode() : 0)) * 37;
        PerceivedLoadingTimeEventData perceivedLoadingTimeEventData = this.perceived_loading_time_event_data;
        int iHashCode43 = iHashCode42 + (perceivedLoadingTimeEventData != null ? perceivedLoadingTimeEventData.hashCode() : 0);
        this.hashCode = iHashCode43;
        return iHashCode43;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("category=" + Internal.sanitize(this.category));
        arrayList.add("event=" + Internal.sanitize(this.event));
        arrayList.add("nav_tab=" + Internal.sanitize(this.nav_tab));
        arrayList.add("experiments=" + Internal.sanitize(this.experiments));
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("web_referrer=" + Internal.sanitize(this.web_referrer));
        arrayList.add("web_referrer_host=" + Internal.sanitize(this.web_referrer_host));
        AppEventData appEventData = this.data;
        if (appEventData != null) {
            arrayList.add("data=" + appEventData);
        }
        ScreenTransitionEventData screenTransitionEventData = this.screen_data;
        if (screenTransitionEventData != null) {
            arrayList.add("screen_data=" + screenTransitionEventData);
        }
        PushNotificationEventData pushNotificationEventData = this.push_notification_data;
        if (pushNotificationEventData != null) {
            arrayList.add("push_notification_data=" + pushNotificationEventData);
        }
        NotificationStackEventData notificationStackEventData = this.notification_stack_data;
        if (notificationStackEventData != null) {
            arrayList.add("notification_stack_data=" + notificationStackEventData);
        }
        TabGroupEventData tabGroupEventData = this.tab_group_data;
        if (tabGroupEventData != null) {
            arrayList.add("tab_group_data=" + tabGroupEventData);
        }
        ButtonGroupEventData buttonGroupEventData = this.button_group_data;
        if (buttonGroupEventData != null) {
            arrayList.add("button_group_data=" + buttonGroupEventData);
        }
        AppSessionEventData appSessionEventData = this.app_session_data;
        if (appSessionEventData != null) {
            arrayList.add("app_session_data=" + appSessionEventData);
        }
        TutorialEventData tutorialEventData = this.tutorial_data;
        if (tutorialEventData != null) {
            arrayList.add("tutorial_data=" + tutorialEventData);
        }
        DeepLinkEventData deepLinkEventData = this.deep_link_data;
        if (deepLinkEventData != null) {
            arrayList.add("deep_link_data=" + deepLinkEventData);
        }
        EmailEventData emailEventData = this.email_data;
        if (emailEventData != null) {
            arrayList.add("email_data=" + emailEventData);
        }
        ErrorEventData errorEventData = this.error_data;
        if (errorEventData != null) {
            arrayList.add("error_data=" + errorEventData);
        }
        WebEventData webEventData = this.web_data;
        if (webEventData != null) {
            arrayList.add("web_data=" + webEventData);
        }
        UserActionData userActionData = this.user_action_data;
        if (userActionData != null) {
            arrayList.add("user_action_data=" + userActionData);
        }
        SMSData sMSData = this.sms_data;
        if (sMSData != null) {
            arrayList.add("sms_data=" + sMSData);
        }
        AdjustData adjustData = this.adjust_data;
        if (adjustData != null) {
            arrayList.add("adjust_data=" + adjustData);
        }
        PlaidEventData plaidEventData = this.plaid_event_data;
        if (plaidEventData != null) {
            arrayList.add("plaid_event_data=" + plaidEventData);
        }
        DebitCardSCAEventData debitCardSCAEventData = this.debit_card_s_c_a_event_data;
        if (debitCardSCAEventData != null) {
            arrayList.add("debit_card_s_c_a_event_data=" + debitCardSCAEventData);
        }
        UserInteractionEventData userInteractionEventData = this.user_interaction_event_data;
        if (userInteractionEventData != null) {
            arrayList.add("user_interaction_event_data=" + userInteractionEventData);
        }
        PerformanceMetricEventData performanceMetricEventData = this.performance_metric_event_data;
        if (performanceMetricEventData != null) {
            arrayList.add("performance_metric_event_data=" + performanceMetricEventData);
        }
        PerformanceMetricSpanEventData performanceMetricSpanEventData = this.performance_metric_span_event_data;
        if (performanceMetricSpanEventData != null) {
            arrayList.add("performance_metric_span_event_data=" + performanceMetricSpanEventData);
        }
        OrderEventData orderEventData = this.order_data;
        if (orderEventData != null) {
            arrayList.add("order_data=" + orderEventData);
        }
        TimeFirstInteractionData timeFirstInteractionData = this.time_first_interaction_data;
        if (timeFirstInteractionData != null) {
            arrayList.add("time_first_interaction_data=" + timeFirstInteractionData);
        }
        ExperimentsEventData experimentsEventData = this.experiments_data;
        if (experimentsEventData != null) {
            arrayList.add("experiments_data=" + experimentsEventData);
        }
        EquityOrderEventData equityOrderEventData = this.equity_order_data;
        if (equityOrderEventData != null) {
            arrayList.add("equity_order_data=" + equityOrderEventData);
        }
        OptionOrderEventData optionOrderEventData = this.option_order_data;
        if (optionOrderEventData != null) {
            arrayList.add("option_order_data=" + optionOrderEventData);
        }
        CryptoOrderEventData cryptoOrderEventData = this.crypto_order_data;
        if (cryptoOrderEventData != null) {
            arrayList.add("crypto_order_data=" + cryptoOrderEventData);
        }
        WebViewNavigationData webViewNavigationData = this.web_view_navigation_data;
        if (webViewNavigationData != null) {
            arrayList.add("web_view_navigation_data=" + webViewNavigationData);
        }
        NetworkErrorData networkErrorData = this.network_error_data;
        if (networkErrorData != null) {
            arrayList.add("network_error_data=" + networkErrorData);
        }
        DeviceSecurityEventData deviceSecurityEventData = this.device_security_event_data;
        if (deviceSecurityEventData != null) {
            arrayList.add("device_security_event_data=" + deviceSecurityEventData);
        }
        HttpCallData httpCallData = this.http_call_data;
        if (httpCallData != null) {
            arrayList.add("http_call_data=" + httpCallData);
        }
        DeviceMetricEventData deviceMetricEventData = this.device_metric_event_data;
        if (deviceMetricEventData != null) {
            arrayList.add("device_metric_event_data=" + deviceMetricEventData);
        }
        ArkoseLabsEventData arkoseLabsEventData = this.arkose_labs_event_data;
        if (arkoseLabsEventData != null) {
            arrayList.add("arkose_labs_event_data=" + arkoseLabsEventData);
        }
        OAuthLoginEventData oAuthLoginEventData = this.oauth_login_event_data;
        if (oAuthLoginEventData != null) {
            arrayList.add("oauth_login_event_data=" + oAuthLoginEventData);
        }
        PromptsChallengeEventData promptsChallengeEventData = this.prompts_challenge_event_data;
        if (promptsChallengeEventData != null) {
            arrayList.add("prompts_challenge_event_data=" + promptsChallengeEventData);
        }
        TwilioConversationsSdkEventData twilioConversationsSdkEventData = this.twilio_conversations_sdk_event_data;
        if (twilioConversationsSdkEventData != null) {
            arrayList.add("twilio_conversations_sdk_event_data=" + twilioConversationsSdkEventData);
        }
        PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventData = this.pathfinder_fallback_to_web_view_event_data;
        if (pathfinderFallbackToWebViewEventData != null) {
            arrayList.add("pathfinder_fallback_to_web_view_event_data=" + pathfinderFallbackToWebViewEventData);
        }
        RecommendationsEventData recommendationsEventData = this.recommendations_event_data;
        if (recommendationsEventData != null) {
            arrayList.add("recommendations_event_data=" + recommendationsEventData);
        }
        DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventData = this.device_approval_reenrollment_event_data;
        if (deviceApprovalReenrollmentEventData != null) {
            arrayList.add("device_approval_reenrollment_event_data=" + deviceApprovalReenrollmentEventData);
        }
        AccountSecurityEventData accountSecurityEventData = this.account_security_event_data;
        if (accountSecurityEventData != null) {
            arrayList.add("account_security_event_data=" + accountSecurityEventData);
        }
        CatpayOrderEventData catpayOrderEventData = this.catpay_order_data;
        if (catpayOrderEventData != null) {
            arrayList.add("catpay_order_data=" + catpayOrderEventData);
        }
        PerpetualOrderEventData perpetualOrderEventData = this.perpetual_order_data;
        if (perpetualOrderEventData != null) {
            arrayList.add("perpetual_order_data=" + perpetualOrderEventData);
        }
        PerceivedLoadingTimeEventData perceivedLoadingTimeEventData = this.perceived_loading_time_event_data;
        if (perceivedLoadingTimeEventData != null) {
            arrayList.add("perceived_loading_time_event_data=" + perceivedLoadingTimeEventData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppEvent{", "}", 0, null, null, 56, null);
    }

    public final AppEvent copy(String category, String event, String nav_tab, String experiments, String session_id, String url, String web_referrer, String web_referrer_host, AppEventData data, ScreenTransitionEventData screen_data, PushNotificationEventData push_notification_data, NotificationStackEventData notification_stack_data, TabGroupEventData tab_group_data, ButtonGroupEventData button_group_data, AppSessionEventData app_session_data, TutorialEventData tutorial_data, DeepLinkEventData deep_link_data, EmailEventData email_data, ErrorEventData error_data, WebEventData web_data, UserActionData user_action_data, SMSData sms_data, AdjustData adjust_data, PlaidEventData plaid_event_data, DebitCardSCAEventData debit_card_s_c_a_event_data, UserInteractionEventData user_interaction_event_data, PerformanceMetricEventData performance_metric_event_data, PerformanceMetricSpanEventData performance_metric_span_event_data, OrderEventData order_data, TimeFirstInteractionData time_first_interaction_data, ExperimentsEventData experiments_data, EquityOrderEventData equity_order_data, OptionOrderEventData option_order_data, CryptoOrderEventData crypto_order_data, WebViewNavigationData web_view_navigation_data, NetworkErrorData network_error_data, DeviceSecurityEventData device_security_event_data, HttpCallData http_call_data, DeviceMetricEventData device_metric_event_data, ArkoseLabsEventData arkose_labs_event_data, OAuthLoginEventData oauth_login_event_data, PromptsChallengeEventData prompts_challenge_event_data, TwilioConversationsSdkEventData twilio_conversations_sdk_event_data, PathfinderFallbackToWebViewEventData pathfinder_fallback_to_web_view_event_data, RecommendationsEventData recommendations_event_data, DeviceApprovalReenrollmentEventData device_approval_reenrollment_event_data, AccountSecurityEventData account_security_event_data, CatpayOrderEventData catpay_order_data, PerpetualOrderEventData perpetual_order_data, PerceivedLoadingTimeEventData perceived_loading_time_event_data, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(nav_tab, "nav_tab");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(web_referrer, "web_referrer");
        Intrinsics.checkNotNullParameter(web_referrer_host, "web_referrer_host");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AppEvent(category, event, nav_tab, experiments, session_id, url, web_referrer, web_referrer_host, data, screen_data, push_notification_data, notification_stack_data, tab_group_data, button_group_data, app_session_data, tutorial_data, deep_link_data, email_data, error_data, web_data, user_action_data, sms_data, adjust_data, plaid_event_data, debit_card_s_c_a_event_data, user_interaction_event_data, performance_metric_event_data, performance_metric_span_event_data, order_data, time_first_interaction_data, experiments_data, equity_order_data, option_order_data, crypto_order_data, web_view_navigation_data, network_error_data, device_security_event_data, http_call_data, device_metric_event_data, arkose_labs_event_data, oauth_login_event_data, prompts_challenge_event_data, twilio_conversations_sdk_event_data, pathfinder_fallback_to_web_view_event_data, recommendations_event_data, device_approval_reenrollment_event_data, account_security_event_data, catpay_order_data, perpetual_order_data, perceived_loading_time_event_data, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AppEvent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AppEvent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.AppEvent$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AppEvent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                AppEventData appEventDataDecode = null;
                ScreenTransitionEventData screenTransitionEventDataDecode = null;
                PushNotificationEventData pushNotificationEventDataDecode = null;
                NotificationStackEventData notificationStackEventDataDecode = null;
                TabGroupEventData tabGroupEventDataDecode = null;
                ButtonGroupEventData buttonGroupEventDataDecode = null;
                AppSessionEventData appSessionEventDataDecode = null;
                TutorialEventData tutorialEventDataDecode = null;
                DeepLinkEventData deepLinkEventDataDecode = null;
                EmailEventData emailEventDataDecode = null;
                ErrorEventData errorEventDataDecode = null;
                WebEventData webEventDataDecode = null;
                UserActionData userActionDataDecode = null;
                SMSData sMSDataDecode = null;
                AdjustData adjustDataDecode = null;
                PlaidEventData plaidEventDataDecode = null;
                DebitCardSCAEventData debitCardSCAEventDataDecode = null;
                UserInteractionEventData userInteractionEventDataDecode = null;
                PerformanceMetricEventData performanceMetricEventDataDecode = null;
                PerformanceMetricSpanEventData performanceMetricSpanEventDataDecode = null;
                OrderEventData orderEventDataDecode = null;
                TimeFirstInteractionData timeFirstInteractionDataDecode = null;
                ExperimentsEventData experimentsEventDataDecode = null;
                EquityOrderEventData equityOrderEventDataDecode = null;
                OptionOrderEventData optionOrderEventDataDecode = null;
                CryptoOrderEventData cryptoOrderEventDataDecode = null;
                WebViewNavigationData webViewNavigationDataDecode = null;
                NetworkErrorData networkErrorDataDecode = null;
                DeviceSecurityEventData deviceSecurityEventDataDecode = null;
                HttpCallData httpCallDataDecode = null;
                DeviceMetricEventData deviceMetricEventDataDecode = null;
                ArkoseLabsEventData arkoseLabsEventDataDecode = null;
                OAuthLoginEventData oAuthLoginEventDataDecode = null;
                PromptsChallengeEventData promptsChallengeEventDataDecode = null;
                TwilioConversationsSdkEventData twilioConversationsSdkEventDataDecode = null;
                PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventDataDecode = null;
                RecommendationsEventData recommendationsEventDataDecode = null;
                DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventDataDecode = null;
                AccountSecurityEventData accountSecurityEventDataDecode = null;
                CatpayOrderEventData catpayOrderEventDataDecode = null;
                PerpetualOrderEventData perpetualOrderEventDataDecode = null;
                PerceivedLoadingTimeEventData perceivedLoadingTimeEventDataDecode = null;
                String strDecode8 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode8;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                appEventDataDecode = AppEventData.ADAPTER.decode(reader);
                                break;
                            case 10:
                                screenTransitionEventDataDecode = ScreenTransitionEventData.ADAPTER.decode(reader);
                                break;
                            case 11:
                                pushNotificationEventDataDecode = PushNotificationEventData.ADAPTER.decode(reader);
                                break;
                            case 12:
                                notificationStackEventDataDecode = NotificationStackEventData.ADAPTER.decode(reader);
                                break;
                            case 13:
                                tabGroupEventDataDecode = TabGroupEventData.ADAPTER.decode(reader);
                                break;
                            case 14:
                                buttonGroupEventDataDecode = ButtonGroupEventData.ADAPTER.decode(reader);
                                break;
                            case 15:
                                appSessionEventDataDecode = AppSessionEventData.ADAPTER.decode(reader);
                                break;
                            case 16:
                                tutorialEventDataDecode = TutorialEventData.ADAPTER.decode(reader);
                                break;
                            case 17:
                                deepLinkEventDataDecode = DeepLinkEventData.ADAPTER.decode(reader);
                                break;
                            case 18:
                                emailEventDataDecode = EmailEventData.ADAPTER.decode(reader);
                                break;
                            case 19:
                                errorEventDataDecode = ErrorEventData.ADAPTER.decode(reader);
                                break;
                            case 20:
                                webEventDataDecode = WebEventData.ADAPTER.decode(reader);
                                break;
                            case 21:
                                userActionDataDecode = UserActionData.ADAPTER.decode(reader);
                                break;
                            case 22:
                                sMSDataDecode = SMSData.ADAPTER.decode(reader);
                                break;
                            case 23:
                                adjustDataDecode = AdjustData.ADAPTER.decode(reader);
                                break;
                            case 24:
                                plaidEventDataDecode = PlaidEventData.ADAPTER.decode(reader);
                                break;
                            case 25:
                                debitCardSCAEventDataDecode = DebitCardSCAEventData.ADAPTER.decode(reader);
                                break;
                            case 26:
                                userInteractionEventDataDecode = UserInteractionEventData.ADAPTER.decode(reader);
                                break;
                            case 27:
                                performanceMetricEventDataDecode = PerformanceMetricEventData.ADAPTER.decode(reader);
                                break;
                            case 28:
                                performanceMetricSpanEventDataDecode = PerformanceMetricSpanEventData.ADAPTER.decode(reader);
                                break;
                            case 29:
                                orderEventDataDecode = OrderEventData.ADAPTER.decode(reader);
                                break;
                            case 30:
                                timeFirstInteractionDataDecode = TimeFirstInteractionData.ADAPTER.decode(reader);
                                break;
                            case 31:
                                experimentsEventDataDecode = ExperimentsEventData.ADAPTER.decode(reader);
                                break;
                            case 32:
                                equityOrderEventDataDecode = EquityOrderEventData.ADAPTER.decode(reader);
                                break;
                            case 33:
                                optionOrderEventDataDecode = OptionOrderEventData.ADAPTER.decode(reader);
                                break;
                            case 34:
                                cryptoOrderEventDataDecode = CryptoOrderEventData.ADAPTER.decode(reader);
                                break;
                            case 35:
                                webViewNavigationDataDecode = WebViewNavigationData.ADAPTER.decode(reader);
                                break;
                            case 36:
                                networkErrorDataDecode = NetworkErrorData.ADAPTER.decode(reader);
                                break;
                            case 37:
                                deviceSecurityEventDataDecode = DeviceSecurityEventData.ADAPTER.decode(reader);
                                break;
                            case 38:
                                httpCallDataDecode = HttpCallData.ADAPTER.decode(reader);
                                break;
                            case 39:
                                deviceMetricEventDataDecode = DeviceMetricEventData.ADAPTER.decode(reader);
                                break;
                            case 40:
                                arkoseLabsEventDataDecode = ArkoseLabsEventData.ADAPTER.decode(reader);
                                break;
                            case 41:
                                oAuthLoginEventDataDecode = OAuthLoginEventData.ADAPTER.decode(reader);
                                break;
                            case 42:
                                promptsChallengeEventDataDecode = PromptsChallengeEventData.ADAPTER.decode(reader);
                                break;
                            case 43:
                                twilioConversationsSdkEventDataDecode = TwilioConversationsSdkEventData.ADAPTER.decode(reader);
                                break;
                            case 44:
                                pathfinderFallbackToWebViewEventDataDecode = PathfinderFallbackToWebViewEventData.ADAPTER.decode(reader);
                                break;
                            case 45:
                                recommendationsEventDataDecode = RecommendationsEventData.ADAPTER.decode(reader);
                                break;
                            case 46:
                                deviceApprovalReenrollmentEventDataDecode = DeviceApprovalReenrollmentEventData.ADAPTER.decode(reader);
                                break;
                            case 47:
                                accountSecurityEventDataDecode = AccountSecurityEventData.ADAPTER.decode(reader);
                                break;
                            case 48:
                                catpayOrderEventDataDecode = CatpayOrderEventData.ADAPTER.decode(reader);
                                break;
                            case 49:
                                perpetualOrderEventDataDecode = PerpetualOrderEventData.ADAPTER.decode(reader);
                                break;
                            case 50:
                                perceivedLoadingTimeEventDataDecode = PerceivedLoadingTimeEventData.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode8 = str;
                    } else {
                        return new AppEvent(strDecode7, str, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, appEventDataDecode, screenTransitionEventDataDecode, pushNotificationEventDataDecode, notificationStackEventDataDecode, tabGroupEventDataDecode, buttonGroupEventDataDecode, appSessionEventDataDecode, tutorialEventDataDecode, deepLinkEventDataDecode, emailEventDataDecode, errorEventDataDecode, webEventDataDecode, userActionDataDecode, sMSDataDecode, adjustDataDecode, plaidEventDataDecode, debitCardSCAEventDataDecode, userInteractionEventDataDecode, performanceMetricEventDataDecode, performanceMetricSpanEventDataDecode, orderEventDataDecode, timeFirstInteractionDataDecode, experimentsEventDataDecode, equityOrderEventDataDecode, optionOrderEventDataDecode, cryptoOrderEventDataDecode, webViewNavigationDataDecode, networkErrorDataDecode, deviceSecurityEventDataDecode, httpCallDataDecode, deviceMetricEventDataDecode, arkoseLabsEventDataDecode, oAuthLoginEventDataDecode, promptsChallengeEventDataDecode, twilioConversationsSdkEventDataDecode, pathfinderFallbackToWebViewEventDataDecode, recommendationsEventDataDecode, deviceApprovalReenrollmentEventDataDecode, accountSecurityEventDataDecode, catpayOrderEventDataDecode, perpetualOrderEventDataDecode, perceivedLoadingTimeEventDataDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AppEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCategory());
                }
                if (!Intrinsics.areEqual(value.getEvent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getNav_tab(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNav_tab());
                }
                if (!Intrinsics.areEqual(value.getExperiments(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getExperiments());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getWeb_referrer());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer_host(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getWeb_referrer_host());
                }
                if (value.getData() != null) {
                    size += AppEventData.ADAPTER.encodedSizeWithTag(9, value.getData());
                }
                if (value.getScreen_data() != null) {
                    size += ScreenTransitionEventData.ADAPTER.encodedSizeWithTag(10, value.getScreen_data());
                }
                if (value.getPush_notification_data() != null) {
                    size += PushNotificationEventData.ADAPTER.encodedSizeWithTag(11, value.getPush_notification_data());
                }
                if (value.getNotification_stack_data() != null) {
                    size += NotificationStackEventData.ADAPTER.encodedSizeWithTag(12, value.getNotification_stack_data());
                }
                if (value.getTab_group_data() != null) {
                    size += TabGroupEventData.ADAPTER.encodedSizeWithTag(13, value.getTab_group_data());
                }
                if (value.getButton_group_data() != null) {
                    size += ButtonGroupEventData.ADAPTER.encodedSizeWithTag(14, value.getButton_group_data());
                }
                if (value.getApp_session_data() != null) {
                    size += AppSessionEventData.ADAPTER.encodedSizeWithTag(15, value.getApp_session_data());
                }
                if (value.getTutorial_data() != null) {
                    size += TutorialEventData.ADAPTER.encodedSizeWithTag(16, value.getTutorial_data());
                }
                if (value.getDeep_link_data() != null) {
                    size += DeepLinkEventData.ADAPTER.encodedSizeWithTag(17, value.getDeep_link_data());
                }
                if (value.getEmail_data() != null) {
                    size += EmailEventData.ADAPTER.encodedSizeWithTag(18, value.getEmail_data());
                }
                if (value.getError_data() != null) {
                    size += ErrorEventData.ADAPTER.encodedSizeWithTag(19, value.getError_data());
                }
                if (value.getWeb_data() != null) {
                    size += WebEventData.ADAPTER.encodedSizeWithTag(20, value.getWeb_data());
                }
                if (value.getUser_action_data() != null) {
                    size += UserActionData.ADAPTER.encodedSizeWithTag(21, value.getUser_action_data());
                }
                if (value.getSms_data() != null) {
                    size += SMSData.ADAPTER.encodedSizeWithTag(22, value.getSms_data());
                }
                if (value.getAdjust_data() != null) {
                    size += AdjustData.ADAPTER.encodedSizeWithTag(23, value.getAdjust_data());
                }
                if (value.getPlaid_event_data() != null) {
                    size += PlaidEventData.ADAPTER.encodedSizeWithTag(24, value.getPlaid_event_data());
                }
                if (value.getDebit_card_s_c_a_event_data() != null) {
                    size += DebitCardSCAEventData.ADAPTER.encodedSizeWithTag(25, value.getDebit_card_s_c_a_event_data());
                }
                if (value.getUser_interaction_event_data() != null) {
                    size += UserInteractionEventData.ADAPTER.encodedSizeWithTag(26, value.getUser_interaction_event_data());
                }
                if (value.getPerformance_metric_event_data() != null) {
                    size += PerformanceMetricEventData.ADAPTER.encodedSizeWithTag(27, value.getPerformance_metric_event_data());
                }
                if (value.getPerformance_metric_span_event_data() != null) {
                    size += PerformanceMetricSpanEventData.ADAPTER.encodedSizeWithTag(28, value.getPerformance_metric_span_event_data());
                }
                if (value.getOrder_data() != null) {
                    size += OrderEventData.ADAPTER.encodedSizeWithTag(29, value.getOrder_data());
                }
                if (value.getTime_first_interaction_data() != null) {
                    size += TimeFirstInteractionData.ADAPTER.encodedSizeWithTag(30, value.getTime_first_interaction_data());
                }
                if (value.getExperiments_data() != null) {
                    size += ExperimentsEventData.ADAPTER.encodedSizeWithTag(31, value.getExperiments_data());
                }
                if (value.getEquity_order_data() != null) {
                    size += EquityOrderEventData.ADAPTER.encodedSizeWithTag(32, value.getEquity_order_data());
                }
                if (value.getOption_order_data() != null) {
                    size += OptionOrderEventData.ADAPTER.encodedSizeWithTag(33, value.getOption_order_data());
                }
                if (value.getCrypto_order_data() != null) {
                    size += CryptoOrderEventData.ADAPTER.encodedSizeWithTag(34, value.getCrypto_order_data());
                }
                if (value.getWeb_view_navigation_data() != null) {
                    size += WebViewNavigationData.ADAPTER.encodedSizeWithTag(35, value.getWeb_view_navigation_data());
                }
                if (value.getNetwork_error_data() != null) {
                    size += NetworkErrorData.ADAPTER.encodedSizeWithTag(36, value.getNetwork_error_data());
                }
                if (value.getDevice_security_event_data() != null) {
                    size += DeviceSecurityEventData.ADAPTER.encodedSizeWithTag(37, value.getDevice_security_event_data());
                }
                if (value.getHttp_call_data() != null) {
                    size += HttpCallData.ADAPTER.encodedSizeWithTag(38, value.getHttp_call_data());
                }
                if (value.getDevice_metric_event_data() != null) {
                    size += DeviceMetricEventData.ADAPTER.encodedSizeWithTag(39, value.getDevice_metric_event_data());
                }
                if (value.getArkose_labs_event_data() != null) {
                    size += ArkoseLabsEventData.ADAPTER.encodedSizeWithTag(40, value.getArkose_labs_event_data());
                }
                if (value.getOauth_login_event_data() != null) {
                    size += OAuthLoginEventData.ADAPTER.encodedSizeWithTag(41, value.getOauth_login_event_data());
                }
                if (value.getPrompts_challenge_event_data() != null) {
                    size += PromptsChallengeEventData.ADAPTER.encodedSizeWithTag(42, value.getPrompts_challenge_event_data());
                }
                if (value.getTwilio_conversations_sdk_event_data() != null) {
                    size += TwilioConversationsSdkEventData.ADAPTER.encodedSizeWithTag(43, value.getTwilio_conversations_sdk_event_data());
                }
                if (value.getPathfinder_fallback_to_web_view_event_data() != null) {
                    size += PathfinderFallbackToWebViewEventData.ADAPTER.encodedSizeWithTag(44, value.getPathfinder_fallback_to_web_view_event_data());
                }
                if (value.getRecommendations_event_data() != null) {
                    size += RecommendationsEventData.ADAPTER.encodedSizeWithTag(45, value.getRecommendations_event_data());
                }
                if (value.getDevice_approval_reenrollment_event_data() != null) {
                    size += DeviceApprovalReenrollmentEventData.ADAPTER.encodedSizeWithTag(46, value.getDevice_approval_reenrollment_event_data());
                }
                if (value.getAccount_security_event_data() != null) {
                    size += AccountSecurityEventData.ADAPTER.encodedSizeWithTag(47, value.getAccount_security_event_data());
                }
                if (value.getCatpay_order_data() != null) {
                    size += CatpayOrderEventData.ADAPTER.encodedSizeWithTag(48, value.getCatpay_order_data());
                }
                if (value.getPerpetual_order_data() != null) {
                    size += PerpetualOrderEventData.ADAPTER.encodedSizeWithTag(49, value.getPerpetual_order_data());
                }
                return value.getPerceived_loading_time_event_data() != null ? size + PerceivedLoadingTimeEventData.ADAPTER.encodedSizeWithTag(50, value.getPerceived_loading_time_event_data()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AppEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCategory(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCategory());
                }
                if (!Intrinsics.areEqual(value.getEvent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getNav_tab(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNav_tab());
                }
                if (!Intrinsics.areEqual(value.getExperiments(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExperiments());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getWeb_referrer());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_referrer_host());
                }
                if (value.getData() != null) {
                    AppEventData.ADAPTER.encodeWithTag(writer, 9, (int) value.getData());
                }
                if (value.getScreen_data() != null) {
                    ScreenTransitionEventData.ADAPTER.encodeWithTag(writer, 10, (int) value.getScreen_data());
                }
                if (value.getPush_notification_data() != null) {
                    PushNotificationEventData.ADAPTER.encodeWithTag(writer, 11, (int) value.getPush_notification_data());
                }
                if (value.getNotification_stack_data() != null) {
                    NotificationStackEventData.ADAPTER.encodeWithTag(writer, 12, (int) value.getNotification_stack_data());
                }
                if (value.getTab_group_data() != null) {
                    TabGroupEventData.ADAPTER.encodeWithTag(writer, 13, (int) value.getTab_group_data());
                }
                if (value.getButton_group_data() != null) {
                    ButtonGroupEventData.ADAPTER.encodeWithTag(writer, 14, (int) value.getButton_group_data());
                }
                if (value.getApp_session_data() != null) {
                    AppSessionEventData.ADAPTER.encodeWithTag(writer, 15, (int) value.getApp_session_data());
                }
                if (value.getTutorial_data() != null) {
                    TutorialEventData.ADAPTER.encodeWithTag(writer, 16, (int) value.getTutorial_data());
                }
                if (value.getDeep_link_data() != null) {
                    DeepLinkEventData.ADAPTER.encodeWithTag(writer, 17, (int) value.getDeep_link_data());
                }
                if (value.getEmail_data() != null) {
                    EmailEventData.ADAPTER.encodeWithTag(writer, 18, (int) value.getEmail_data());
                }
                if (value.getError_data() != null) {
                    ErrorEventData.ADAPTER.encodeWithTag(writer, 19, (int) value.getError_data());
                }
                if (value.getWeb_data() != null) {
                    WebEventData.ADAPTER.encodeWithTag(writer, 20, (int) value.getWeb_data());
                }
                if (value.getUser_action_data() != null) {
                    UserActionData.ADAPTER.encodeWithTag(writer, 21, (int) value.getUser_action_data());
                }
                if (value.getSms_data() != null) {
                    SMSData.ADAPTER.encodeWithTag(writer, 22, (int) value.getSms_data());
                }
                if (value.getAdjust_data() != null) {
                    AdjustData.ADAPTER.encodeWithTag(writer, 23, (int) value.getAdjust_data());
                }
                if (value.getPlaid_event_data() != null) {
                    PlaidEventData.ADAPTER.encodeWithTag(writer, 24, (int) value.getPlaid_event_data());
                }
                if (value.getDebit_card_s_c_a_event_data() != null) {
                    DebitCardSCAEventData.ADAPTER.encodeWithTag(writer, 25, (int) value.getDebit_card_s_c_a_event_data());
                }
                if (value.getUser_interaction_event_data() != null) {
                    UserInteractionEventData.ADAPTER.encodeWithTag(writer, 26, (int) value.getUser_interaction_event_data());
                }
                if (value.getPerformance_metric_event_data() != null) {
                    PerformanceMetricEventData.ADAPTER.encodeWithTag(writer, 27, (int) value.getPerformance_metric_event_data());
                }
                if (value.getPerformance_metric_span_event_data() != null) {
                    PerformanceMetricSpanEventData.ADAPTER.encodeWithTag(writer, 28, (int) value.getPerformance_metric_span_event_data());
                }
                if (value.getOrder_data() != null) {
                    OrderEventData.ADAPTER.encodeWithTag(writer, 29, (int) value.getOrder_data());
                }
                if (value.getTime_first_interaction_data() != null) {
                    TimeFirstInteractionData.ADAPTER.encodeWithTag(writer, 30, (int) value.getTime_first_interaction_data());
                }
                if (value.getExperiments_data() != null) {
                    ExperimentsEventData.ADAPTER.encodeWithTag(writer, 31, (int) value.getExperiments_data());
                }
                if (value.getEquity_order_data() != null) {
                    EquityOrderEventData.ADAPTER.encodeWithTag(writer, 32, (int) value.getEquity_order_data());
                }
                if (value.getOption_order_data() != null) {
                    OptionOrderEventData.ADAPTER.encodeWithTag(writer, 33, (int) value.getOption_order_data());
                }
                if (value.getCrypto_order_data() != null) {
                    CryptoOrderEventData.ADAPTER.encodeWithTag(writer, 34, (int) value.getCrypto_order_data());
                }
                if (value.getWeb_view_navigation_data() != null) {
                    WebViewNavigationData.ADAPTER.encodeWithTag(writer, 35, (int) value.getWeb_view_navigation_data());
                }
                if (value.getNetwork_error_data() != null) {
                    NetworkErrorData.ADAPTER.encodeWithTag(writer, 36, (int) value.getNetwork_error_data());
                }
                if (value.getDevice_security_event_data() != null) {
                    DeviceSecurityEventData.ADAPTER.encodeWithTag(writer, 37, (int) value.getDevice_security_event_data());
                }
                if (value.getHttp_call_data() != null) {
                    HttpCallData.ADAPTER.encodeWithTag(writer, 38, (int) value.getHttp_call_data());
                }
                if (value.getDevice_metric_event_data() != null) {
                    DeviceMetricEventData.ADAPTER.encodeWithTag(writer, 39, (int) value.getDevice_metric_event_data());
                }
                if (value.getArkose_labs_event_data() != null) {
                    ArkoseLabsEventData.ADAPTER.encodeWithTag(writer, 40, (int) value.getArkose_labs_event_data());
                }
                if (value.getOauth_login_event_data() != null) {
                    OAuthLoginEventData.ADAPTER.encodeWithTag(writer, 41, (int) value.getOauth_login_event_data());
                }
                if (value.getPrompts_challenge_event_data() != null) {
                    PromptsChallengeEventData.ADAPTER.encodeWithTag(writer, 42, (int) value.getPrompts_challenge_event_data());
                }
                if (value.getTwilio_conversations_sdk_event_data() != null) {
                    TwilioConversationsSdkEventData.ADAPTER.encodeWithTag(writer, 43, (int) value.getTwilio_conversations_sdk_event_data());
                }
                if (value.getPathfinder_fallback_to_web_view_event_data() != null) {
                    PathfinderFallbackToWebViewEventData.ADAPTER.encodeWithTag(writer, 44, (int) value.getPathfinder_fallback_to_web_view_event_data());
                }
                if (value.getRecommendations_event_data() != null) {
                    RecommendationsEventData.ADAPTER.encodeWithTag(writer, 45, (int) value.getRecommendations_event_data());
                }
                if (value.getDevice_approval_reenrollment_event_data() != null) {
                    DeviceApprovalReenrollmentEventData.ADAPTER.encodeWithTag(writer, 46, (int) value.getDevice_approval_reenrollment_event_data());
                }
                if (value.getAccount_security_event_data() != null) {
                    AccountSecurityEventData.ADAPTER.encodeWithTag(writer, 47, (int) value.getAccount_security_event_data());
                }
                if (value.getCatpay_order_data() != null) {
                    CatpayOrderEventData.ADAPTER.encodeWithTag(writer, 48, (int) value.getCatpay_order_data());
                }
                if (value.getPerpetual_order_data() != null) {
                    PerpetualOrderEventData.ADAPTER.encodeWithTag(writer, 49, (int) value.getPerpetual_order_data());
                }
                if (value.getPerceived_loading_time_event_data() != null) {
                    PerceivedLoadingTimeEventData.ADAPTER.encodeWithTag(writer, 50, (int) value.getPerceived_loading_time_event_data());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AppEvent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPerceived_loading_time_event_data() != null) {
                    PerceivedLoadingTimeEventData.ADAPTER.encodeWithTag(writer, 50, (int) value.getPerceived_loading_time_event_data());
                }
                if (value.getPerpetual_order_data() != null) {
                    PerpetualOrderEventData.ADAPTER.encodeWithTag(writer, 49, (int) value.getPerpetual_order_data());
                }
                if (value.getCatpay_order_data() != null) {
                    CatpayOrderEventData.ADAPTER.encodeWithTag(writer, 48, (int) value.getCatpay_order_data());
                }
                if (value.getAccount_security_event_data() != null) {
                    AccountSecurityEventData.ADAPTER.encodeWithTag(writer, 47, (int) value.getAccount_security_event_data());
                }
                if (value.getDevice_approval_reenrollment_event_data() != null) {
                    DeviceApprovalReenrollmentEventData.ADAPTER.encodeWithTag(writer, 46, (int) value.getDevice_approval_reenrollment_event_data());
                }
                if (value.getRecommendations_event_data() != null) {
                    RecommendationsEventData.ADAPTER.encodeWithTag(writer, 45, (int) value.getRecommendations_event_data());
                }
                if (value.getPathfinder_fallback_to_web_view_event_data() != null) {
                    PathfinderFallbackToWebViewEventData.ADAPTER.encodeWithTag(writer, 44, (int) value.getPathfinder_fallback_to_web_view_event_data());
                }
                if (value.getTwilio_conversations_sdk_event_data() != null) {
                    TwilioConversationsSdkEventData.ADAPTER.encodeWithTag(writer, 43, (int) value.getTwilio_conversations_sdk_event_data());
                }
                if (value.getPrompts_challenge_event_data() != null) {
                    PromptsChallengeEventData.ADAPTER.encodeWithTag(writer, 42, (int) value.getPrompts_challenge_event_data());
                }
                if (value.getOauth_login_event_data() != null) {
                    OAuthLoginEventData.ADAPTER.encodeWithTag(writer, 41, (int) value.getOauth_login_event_data());
                }
                if (value.getArkose_labs_event_data() != null) {
                    ArkoseLabsEventData.ADAPTER.encodeWithTag(writer, 40, (int) value.getArkose_labs_event_data());
                }
                if (value.getDevice_metric_event_data() != null) {
                    DeviceMetricEventData.ADAPTER.encodeWithTag(writer, 39, (int) value.getDevice_metric_event_data());
                }
                if (value.getHttp_call_data() != null) {
                    HttpCallData.ADAPTER.encodeWithTag(writer, 38, (int) value.getHttp_call_data());
                }
                if (value.getDevice_security_event_data() != null) {
                    DeviceSecurityEventData.ADAPTER.encodeWithTag(writer, 37, (int) value.getDevice_security_event_data());
                }
                if (value.getNetwork_error_data() != null) {
                    NetworkErrorData.ADAPTER.encodeWithTag(writer, 36, (int) value.getNetwork_error_data());
                }
                if (value.getWeb_view_navigation_data() != null) {
                    WebViewNavigationData.ADAPTER.encodeWithTag(writer, 35, (int) value.getWeb_view_navigation_data());
                }
                if (value.getCrypto_order_data() != null) {
                    CryptoOrderEventData.ADAPTER.encodeWithTag(writer, 34, (int) value.getCrypto_order_data());
                }
                if (value.getOption_order_data() != null) {
                    OptionOrderEventData.ADAPTER.encodeWithTag(writer, 33, (int) value.getOption_order_data());
                }
                if (value.getEquity_order_data() != null) {
                    EquityOrderEventData.ADAPTER.encodeWithTag(writer, 32, (int) value.getEquity_order_data());
                }
                if (value.getExperiments_data() != null) {
                    ExperimentsEventData.ADAPTER.encodeWithTag(writer, 31, (int) value.getExperiments_data());
                }
                if (value.getTime_first_interaction_data() != null) {
                    TimeFirstInteractionData.ADAPTER.encodeWithTag(writer, 30, (int) value.getTime_first_interaction_data());
                }
                if (value.getOrder_data() != null) {
                    OrderEventData.ADAPTER.encodeWithTag(writer, 29, (int) value.getOrder_data());
                }
                if (value.getPerformance_metric_span_event_data() != null) {
                    PerformanceMetricSpanEventData.ADAPTER.encodeWithTag(writer, 28, (int) value.getPerformance_metric_span_event_data());
                }
                if (value.getPerformance_metric_event_data() != null) {
                    PerformanceMetricEventData.ADAPTER.encodeWithTag(writer, 27, (int) value.getPerformance_metric_event_data());
                }
                if (value.getUser_interaction_event_data() != null) {
                    UserInteractionEventData.ADAPTER.encodeWithTag(writer, 26, (int) value.getUser_interaction_event_data());
                }
                if (value.getDebit_card_s_c_a_event_data() != null) {
                    DebitCardSCAEventData.ADAPTER.encodeWithTag(writer, 25, (int) value.getDebit_card_s_c_a_event_data());
                }
                if (value.getPlaid_event_data() != null) {
                    PlaidEventData.ADAPTER.encodeWithTag(writer, 24, (int) value.getPlaid_event_data());
                }
                if (value.getAdjust_data() != null) {
                    AdjustData.ADAPTER.encodeWithTag(writer, 23, (int) value.getAdjust_data());
                }
                if (value.getSms_data() != null) {
                    SMSData.ADAPTER.encodeWithTag(writer, 22, (int) value.getSms_data());
                }
                if (value.getUser_action_data() != null) {
                    UserActionData.ADAPTER.encodeWithTag(writer, 21, (int) value.getUser_action_data());
                }
                if (value.getWeb_data() != null) {
                    WebEventData.ADAPTER.encodeWithTag(writer, 20, (int) value.getWeb_data());
                }
                if (value.getError_data() != null) {
                    ErrorEventData.ADAPTER.encodeWithTag(writer, 19, (int) value.getError_data());
                }
                if (value.getEmail_data() != null) {
                    EmailEventData.ADAPTER.encodeWithTag(writer, 18, (int) value.getEmail_data());
                }
                if (value.getDeep_link_data() != null) {
                    DeepLinkEventData.ADAPTER.encodeWithTag(writer, 17, (int) value.getDeep_link_data());
                }
                if (value.getTutorial_data() != null) {
                    TutorialEventData.ADAPTER.encodeWithTag(writer, 16, (int) value.getTutorial_data());
                }
                if (value.getApp_session_data() != null) {
                    AppSessionEventData.ADAPTER.encodeWithTag(writer, 15, (int) value.getApp_session_data());
                }
                if (value.getButton_group_data() != null) {
                    ButtonGroupEventData.ADAPTER.encodeWithTag(writer, 14, (int) value.getButton_group_data());
                }
                if (value.getTab_group_data() != null) {
                    TabGroupEventData.ADAPTER.encodeWithTag(writer, 13, (int) value.getTab_group_data());
                }
                if (value.getNotification_stack_data() != null) {
                    NotificationStackEventData.ADAPTER.encodeWithTag(writer, 12, (int) value.getNotification_stack_data());
                }
                if (value.getPush_notification_data() != null) {
                    PushNotificationEventData.ADAPTER.encodeWithTag(writer, 11, (int) value.getPush_notification_data());
                }
                if (value.getScreen_data() != null) {
                    ScreenTransitionEventData.ADAPTER.encodeWithTag(writer, 10, (int) value.getScreen_data());
                }
                if (value.getData() != null) {
                    AppEventData.ADAPTER.encodeWithTag(writer, 9, (int) value.getData());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer_host(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getWeb_referrer_host());
                }
                if (!Intrinsics.areEqual(value.getWeb_referrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getWeb_referrer());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSession_id());
                }
                if (!Intrinsics.areEqual(value.getExperiments(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExperiments());
                }
                if (!Intrinsics.areEqual(value.getNav_tab(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNav_tab());
                }
                if (!Intrinsics.areEqual(value.getEvent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEvent());
                }
                if (Intrinsics.areEqual(value.getCategory(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCategory());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AppEvent redact(AppEvent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AppEventData data = value.getData();
                AppEventData appEventDataRedact = data != null ? AppEventData.ADAPTER.redact(data) : null;
                ScreenTransitionEventData screen_data = value.getScreen_data();
                ScreenTransitionEventData screenTransitionEventDataRedact = screen_data != null ? ScreenTransitionEventData.ADAPTER.redact(screen_data) : null;
                PushNotificationEventData push_notification_data = value.getPush_notification_data();
                PushNotificationEventData pushNotificationEventDataRedact = push_notification_data != null ? PushNotificationEventData.ADAPTER.redact(push_notification_data) : null;
                NotificationStackEventData notification_stack_data = value.getNotification_stack_data();
                NotificationStackEventData notificationStackEventDataRedact = notification_stack_data != null ? NotificationStackEventData.ADAPTER.redact(notification_stack_data) : null;
                TabGroupEventData tab_group_data = value.getTab_group_data();
                TabGroupEventData tabGroupEventDataRedact = tab_group_data != null ? TabGroupEventData.ADAPTER.redact(tab_group_data) : null;
                ButtonGroupEventData button_group_data = value.getButton_group_data();
                ButtonGroupEventData buttonGroupEventDataRedact = button_group_data != null ? ButtonGroupEventData.ADAPTER.redact(button_group_data) : null;
                AppSessionEventData app_session_data = value.getApp_session_data();
                AppSessionEventData appSessionEventDataRedact = app_session_data != null ? AppSessionEventData.ADAPTER.redact(app_session_data) : null;
                TutorialEventData tutorial_data = value.getTutorial_data();
                TutorialEventData tutorialEventDataRedact = tutorial_data != null ? TutorialEventData.ADAPTER.redact(tutorial_data) : null;
                DeepLinkEventData deep_link_data = value.getDeep_link_data();
                DeepLinkEventData deepLinkEventDataRedact = deep_link_data != null ? DeepLinkEventData.ADAPTER.redact(deep_link_data) : null;
                EmailEventData email_data = value.getEmail_data();
                EmailEventData emailEventDataRedact = email_data != null ? EmailEventData.ADAPTER.redact(email_data) : null;
                ErrorEventData error_data = value.getError_data();
                ErrorEventData errorEventDataRedact = error_data != null ? ErrorEventData.ADAPTER.redact(error_data) : null;
                WebEventData web_data = value.getWeb_data();
                WebEventData webEventDataRedact = web_data != null ? WebEventData.ADAPTER.redact(web_data) : null;
                UserActionData user_action_data = value.getUser_action_data();
                UserActionData userActionDataRedact = user_action_data != null ? UserActionData.ADAPTER.redact(user_action_data) : null;
                SMSData sms_data = value.getSms_data();
                SMSData sMSDataRedact = sms_data != null ? SMSData.ADAPTER.redact(sms_data) : null;
                AdjustData adjust_data = value.getAdjust_data();
                AdjustData adjustDataRedact = adjust_data != null ? AdjustData.ADAPTER.redact(adjust_data) : null;
                PlaidEventData plaid_event_data = value.getPlaid_event_data();
                PlaidEventData plaidEventDataRedact = plaid_event_data != null ? PlaidEventData.ADAPTER.redact(plaid_event_data) : null;
                DebitCardSCAEventData debit_card_s_c_a_event_data = value.getDebit_card_s_c_a_event_data();
                DebitCardSCAEventData debitCardSCAEventDataRedact = debit_card_s_c_a_event_data != null ? DebitCardSCAEventData.ADAPTER.redact(debit_card_s_c_a_event_data) : null;
                UserInteractionEventData user_interaction_event_data = value.getUser_interaction_event_data();
                UserInteractionEventData userInteractionEventDataRedact = user_interaction_event_data != null ? UserInteractionEventData.ADAPTER.redact(user_interaction_event_data) : null;
                PerformanceMetricEventData performance_metric_event_data = value.getPerformance_metric_event_data();
                PerformanceMetricEventData performanceMetricEventDataRedact = performance_metric_event_data != null ? PerformanceMetricEventData.ADAPTER.redact(performance_metric_event_data) : null;
                PerformanceMetricSpanEventData performance_metric_span_event_data = value.getPerformance_metric_span_event_data();
                PerformanceMetricSpanEventData performanceMetricSpanEventDataRedact = performance_metric_span_event_data != null ? PerformanceMetricSpanEventData.ADAPTER.redact(performance_metric_span_event_data) : null;
                OrderEventData order_data = value.getOrder_data();
                OrderEventData orderEventDataRedact = order_data != null ? OrderEventData.ADAPTER.redact(order_data) : null;
                TimeFirstInteractionData time_first_interaction_data = value.getTime_first_interaction_data();
                TimeFirstInteractionData timeFirstInteractionDataRedact = time_first_interaction_data != null ? TimeFirstInteractionData.ADAPTER.redact(time_first_interaction_data) : null;
                ExperimentsEventData experiments_data = value.getExperiments_data();
                ExperimentsEventData experimentsEventDataRedact = experiments_data != null ? ExperimentsEventData.ADAPTER.redact(experiments_data) : null;
                EquityOrderEventData equity_order_data = value.getEquity_order_data();
                EquityOrderEventData equityOrderEventDataRedact = equity_order_data != null ? EquityOrderEventData.ADAPTER.redact(equity_order_data) : null;
                OptionOrderEventData option_order_data = value.getOption_order_data();
                OptionOrderEventData optionOrderEventDataRedact = option_order_data != null ? OptionOrderEventData.ADAPTER.redact(option_order_data) : null;
                CryptoOrderEventData crypto_order_data = value.getCrypto_order_data();
                CryptoOrderEventData cryptoOrderEventDataRedact = crypto_order_data != null ? CryptoOrderEventData.ADAPTER.redact(crypto_order_data) : null;
                WebViewNavigationData web_view_navigation_data = value.getWeb_view_navigation_data();
                WebViewNavigationData webViewNavigationDataRedact = web_view_navigation_data != null ? WebViewNavigationData.ADAPTER.redact(web_view_navigation_data) : null;
                NetworkErrorData network_error_data = value.getNetwork_error_data();
                NetworkErrorData networkErrorDataRedact = network_error_data != null ? NetworkErrorData.ADAPTER.redact(network_error_data) : null;
                DeviceSecurityEventData device_security_event_data = value.getDevice_security_event_data();
                DeviceSecurityEventData deviceSecurityEventDataRedact = device_security_event_data != null ? DeviceSecurityEventData.ADAPTER.redact(device_security_event_data) : null;
                HttpCallData http_call_data = value.getHttp_call_data();
                HttpCallData httpCallDataRedact = http_call_data != null ? HttpCallData.ADAPTER.redact(http_call_data) : null;
                DeviceMetricEventData device_metric_event_data = value.getDevice_metric_event_data();
                DeviceMetricEventData deviceMetricEventDataRedact = device_metric_event_data != null ? DeviceMetricEventData.ADAPTER.redact(device_metric_event_data) : null;
                ArkoseLabsEventData arkose_labs_event_data = value.getArkose_labs_event_data();
                ArkoseLabsEventData arkoseLabsEventDataRedact = arkose_labs_event_data != null ? ArkoseLabsEventData.ADAPTER.redact(arkose_labs_event_data) : null;
                OAuthLoginEventData oauth_login_event_data = value.getOauth_login_event_data();
                OAuthLoginEventData oAuthLoginEventDataRedact = oauth_login_event_data != null ? OAuthLoginEventData.ADAPTER.redact(oauth_login_event_data) : null;
                PromptsChallengeEventData prompts_challenge_event_data = value.getPrompts_challenge_event_data();
                PromptsChallengeEventData promptsChallengeEventDataRedact = prompts_challenge_event_data != null ? PromptsChallengeEventData.ADAPTER.redact(prompts_challenge_event_data) : null;
                TwilioConversationsSdkEventData twilio_conversations_sdk_event_data = value.getTwilio_conversations_sdk_event_data();
                TwilioConversationsSdkEventData twilioConversationsSdkEventDataRedact = twilio_conversations_sdk_event_data != null ? TwilioConversationsSdkEventData.ADAPTER.redact(twilio_conversations_sdk_event_data) : null;
                PathfinderFallbackToWebViewEventData pathfinder_fallback_to_web_view_event_data = value.getPathfinder_fallback_to_web_view_event_data();
                PathfinderFallbackToWebViewEventData pathfinderFallbackToWebViewEventDataRedact = pathfinder_fallback_to_web_view_event_data != null ? PathfinderFallbackToWebViewEventData.ADAPTER.redact(pathfinder_fallback_to_web_view_event_data) : null;
                RecommendationsEventData recommendations_event_data = value.getRecommendations_event_data();
                RecommendationsEventData recommendationsEventDataRedact = recommendations_event_data != null ? RecommendationsEventData.ADAPTER.redact(recommendations_event_data) : null;
                DeviceApprovalReenrollmentEventData device_approval_reenrollment_event_data = value.getDevice_approval_reenrollment_event_data();
                DeviceApprovalReenrollmentEventData deviceApprovalReenrollmentEventDataRedact = device_approval_reenrollment_event_data != null ? DeviceApprovalReenrollmentEventData.ADAPTER.redact(device_approval_reenrollment_event_data) : null;
                AccountSecurityEventData account_security_event_data = value.getAccount_security_event_data();
                AccountSecurityEventData accountSecurityEventDataRedact = account_security_event_data != null ? AccountSecurityEventData.ADAPTER.redact(account_security_event_data) : null;
                CatpayOrderEventData catpay_order_data = value.getCatpay_order_data();
                CatpayOrderEventData catpayOrderEventDataRedact = catpay_order_data != null ? CatpayOrderEventData.ADAPTER.redact(catpay_order_data) : null;
                PerpetualOrderEventData perpetual_order_data = value.getPerpetual_order_data();
                PerpetualOrderEventData perpetualOrderEventDataRedact = perpetual_order_data != null ? PerpetualOrderEventData.ADAPTER.redact(perpetual_order_data) : null;
                PerceivedLoadingTimeEventData perceived_loading_time_event_data = value.getPerceived_loading_time_event_data();
                return value.copy(((-1308885011) & 1) != 0 ? value.category : null, ((-1308885011) & 2) != 0 ? value.event : null, ((-1308885011) & 4) != 0 ? value.nav_tab : null, ((-1308885011) & 8) != 0 ? value.experiments : null, ((-1308885011) & 16) != 0 ? value.session_id : null, ((-1308885011) & 32) != 0 ? value.url : null, ((-1308885011) & 64) != 0 ? value.web_referrer : null, ((-1308885011) & 128) != 0 ? value.web_referrer_host : null, ((-1308885011) & 256) != 0 ? value.data : appEventDataRedact, ((-1308885011) & 512) != 0 ? value.screen_data : screenTransitionEventDataRedact, ((-1308885011) & 1024) != 0 ? value.push_notification_data : pushNotificationEventDataRedact, ((-1308885011) & 2048) != 0 ? value.notification_stack_data : notificationStackEventDataRedact, ((-1308885011) & 4096) != 0 ? value.tab_group_data : tabGroupEventDataRedact, ((-1308885011) & 8192) != 0 ? value.button_group_data : buttonGroupEventDataRedact, ((-1308885011) & 16384) != 0 ? value.app_session_data : appSessionEventDataRedact, ((-1308885011) & 32768) != 0 ? value.tutorial_data : tutorialEventDataRedact, ((-1308885011) & 65536) != 0 ? value.deep_link_data : deepLinkEventDataRedact, ((-1308885011) & 131072) != 0 ? value.email_data : emailEventDataRedact, ((-1308885011) & 262144) != 0 ? value.error_data : errorEventDataRedact, ((-1308885011) & 524288) != 0 ? value.web_data : webEventDataRedact, ((-1308885011) & 1048576) != 0 ? value.user_action_data : userActionDataRedact, ((-1308885011) & 2097152) != 0 ? value.sms_data : sMSDataRedact, ((-1308885011) & 4194304) != 0 ? value.adjust_data : adjustDataRedact, ((-1308885011) & 8388608) != 0 ? value.plaid_event_data : plaidEventDataRedact, ((-1308885011) & 16777216) != 0 ? value.debit_card_s_c_a_event_data : debitCardSCAEventDataRedact, ((-1308885011) & 33554432) != 0 ? value.user_interaction_event_data : userInteractionEventDataRedact, ((-1308885011) & 67108864) != 0 ? value.performance_metric_event_data : performanceMetricEventDataRedact, ((-1308885011) & 134217728) != 0 ? value.performance_metric_span_event_data : performanceMetricSpanEventDataRedact, ((-1308885011) & 268435456) != 0 ? value.order_data : orderEventDataRedact, ((-1308885011) & 536870912) != 0 ? value.time_first_interaction_data : timeFirstInteractionDataRedact, ((-1308885011) & 1073741824) != 0 ? value.experiments_data : experimentsEventDataRedact, ((-1308885011) & Integer.MIN_VALUE) != 0 ? value.equity_order_data : equityOrderEventDataRedact, (524247 & 1) != 0 ? value.option_order_data : optionOrderEventDataRedact, (524247 & 2) != 0 ? value.crypto_order_data : cryptoOrderEventDataRedact, (524247 & 4) != 0 ? value.web_view_navigation_data : webViewNavigationDataRedact, (524247 & 8) != 0 ? value.network_error_data : networkErrorDataRedact, (524247 & 16) != 0 ? value.device_security_event_data : deviceSecurityEventDataRedact, (524247 & 32) != 0 ? value.http_call_data : httpCallDataRedact, (524247 & 64) != 0 ? value.device_metric_event_data : deviceMetricEventDataRedact, (524247 & 128) != 0 ? value.arkose_labs_event_data : arkoseLabsEventDataRedact, (524247 & 256) != 0 ? value.oauth_login_event_data : oAuthLoginEventDataRedact, (524247 & 512) != 0 ? value.prompts_challenge_event_data : promptsChallengeEventDataRedact, (524247 & 1024) != 0 ? value.twilio_conversations_sdk_event_data : twilioConversationsSdkEventDataRedact, (524247 & 2048) != 0 ? value.pathfinder_fallback_to_web_view_event_data : pathfinderFallbackToWebViewEventDataRedact, (524247 & 4096) != 0 ? value.recommendations_event_data : recommendationsEventDataRedact, (524247 & 8192) != 0 ? value.device_approval_reenrollment_event_data : deviceApprovalReenrollmentEventDataRedact, (524247 & 16384) != 0 ? value.account_security_event_data : accountSecurityEventDataRedact, (524247 & 32768) != 0 ? value.catpay_order_data : catpayOrderEventDataRedact, (524247 & 65536) != 0 ? value.perpetual_order_data : perpetualOrderEventDataRedact, (524247 & 131072) != 0 ? value.perceived_loading_time_event_data : perceived_loading_time_event_data != null ? PerceivedLoadingTimeEventData.ADAPTER.redact(perceived_loading_time_event_data) : null, (524247 & 262144) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
