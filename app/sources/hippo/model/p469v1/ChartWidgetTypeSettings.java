package hippo.model.p469v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ChartWidgetTypeSettings.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ¦\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002¦\u0001B×\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020\u000b\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\b\b\u0002\u0010*\u001a\u00020\u000b\u0012\b\b\u0002\u0010+\u001a\u00020\u000b\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\b\b\u0002\u0010-\u001a\u00020\u000b\u0012\b\b\u0002\u0010.\u001a\u00020\u000b\u0012\b\b\u0002\u0010/\u001a\u00020\u000b\u0012\b\b\u0002\u00100\u001a\u00020\u000b\u0012\b\b\u0002\u00101\u001a\u000202\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00105\u001a\u00020\u000b\u0012\b\b\u0002\u00106\u001a\u00020\u000b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u00109\u001a\u00020\u000b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010>\u001a\u00020\u000b\u0012\b\b\u0002\u0010?\u001a\u00020@\u0012\b\b\u0002\u0010A\u001a\u00020B\u0012\b\b\u0002\u0010C\u001a\u00020@\u0012\b\b\u0002\u0010D\u001a\u00020B\u0012\b\b\u0002\u0010E\u001a\u00020F\u0012\b\b\u0002\u0010G\u001a\u00020H\u0012\b\b\u0002\u0010I\u001a\u00020J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\b\b\u0002\u0010M\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\t\u0010\u009d\u0001\u001a\u00020\u0002H\u0017J\u0016\u0010\u009e\u0001\u001a\u00020\u000b2\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010 \u0001H\u0096\u0002J\n\u0010¡\u0001\u001a\u00030¢\u0001H\u0016J\t\u0010£\u0001\u001a\u00020\u000eH\u0016JÝ\u0004\u0010¤\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u00101\u001a\u0002022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000b2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\b\b\u0002\u00109\u001a\u00020\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020@2\b\b\u0002\u0010D\u001a\u00020B2\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\b\b\u0002\u0010M\u001a\u00020N¢\u0006\u0003\u0010¥\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010RR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010YR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010YR\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010YR\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010YR\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010YR\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010YR\u0016\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010YR\u0016\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010YR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010YR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010YR\u0016\u0010\u0018\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010YR\u0016\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010YR\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0016\u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010YR\u0016\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010YR\u0016\u0010 \u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010YR\u0016\u0010!\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010YR\u0016\u0010\"\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010YR\u0016\u0010#\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010YR\u0016\u0010$\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010YR\u0016\u0010%\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0016\u0010'\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010YR\u0016\u0010(\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010YR\u0016\u0010)\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010YR\u0016\u0010*\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010YR\u0016\u0010+\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010YR\u0016\u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010YR\u0016\u0010-\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010YR\u0016\u0010.\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010YR\u0016\u0010/\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010YR\u0016\u00100\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010YR\u0017\u00101\u001a\u0002028\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u00105\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010YR\u0017\u00106\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010YR\u001a\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u00109\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010YR\u001a\u0010:\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010<\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001d\u0010=\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\r\n\u0003\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008b\u0001R\u0017\u0010>\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010YR\u0018\u0010?\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010A\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010C\u001a\u00020@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0090\u0001R\u0018\u0010D\u001a\u00020B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0092\u0001R\u0018\u0010E\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010G\u001a\u00020H8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010I\u001a\u00020J8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010K\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006§\u0001"}, m3636d2 = {"Lhippo/model/v1/ChartWidgetTypeSettings;", "Lcom/squareup/wire/Message;", "", "favorite_intervals", "Lhippo/model/v1/AggregationPeriodList;", "custom_intervals", "dx_feed_indicator_template", "Lhippo/model/v1/DxFeedIndicatorTemplateList;", "dx_feed_fav_drawing_tools", "Lhippo/model/v1/DxFeedFavDrawingToolsList;", "snap_to_data_enabled", "", "drawing_mode_enabled", "drawing_config", "", "show_indicator_markers", "show_indicator_line_markers", "show_indicator_ribbon_markers", "show_symbol_markers", "show_symbol_line_markers", "show_symbol_ribbon_markers", "show_symbol_bar_closed_markers", "show_grid", "show_grid_horizontal_lines", "show_grid_vertical_lines", "snap_crosshair_to_price_enabled", "zoom", "Lhippo/model/v1/Zoom;", "snap_crosshair_to_price", "Lhippo/model/v1/SnapCrosshairToPrice;", "show_high_low_price", "show_legend", "show_legend_ohlcv", "show_legend_indicators", "show_extended_hours", "show_trading_session_highlights", "show_volume_enabled", "show_volume", "Lhippo/model/v1/ShowVolume;", "trade_from_chart", "trade_from_chart_current_price", "trade_from_chart_top_left", "show_open_orders", "show_open_market_orders", "show_open_limit_orders", "show_open_stop_market_orders", "show_open_stop_limit_orders", "show_open_trailing_stop_orders", "show_open_positions_enabled", "show_open_positions", "Lhippo/model/v1/ShowOpenPositions;", "asset_comparison_settings", "Lhippo/model/v1/AssetComparisonSettings;", "show_indicator_name", "show_symbol_ticker_markers", "last_used_drawing_types", "Lhippo/model/v1/LastUsedDrawingTypes;", "drawing_sync_enabled", "top_display_settings", "Lhippo/model/v1/ChartWidgetTypeTopDisplaySettings;", "show_symbol_extended_hours_line_markers", "show_symbol_extended_hours_ribbon_markers", "auto_send_trading_enabled", "equity_time_in_force_long_order", "Lhippo/model/v1/EquityTimeInForce;", "equity_trading_session_long_order", "Lhippo/model/v1/EquityTradingSession;", "equity_time_in_force_short_order", "equity_trading_session_short_order", "futures_time_in_force", "Lhippo/model/v1/FuturesTimeInForce;", "crypto_time_in_force", "Lhippo/model/v1/CryptoTimeInForce;", "crypto_amount_type", "Lhippo/model/v1/CryptoAmountType;", "chart_custom_color_settings", "Lhippo/model/v1/ChartCustomColorSettings;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/AggregationPeriodList;Lhippo/model/v1/AggregationPeriodList;Lhippo/model/v1/DxFeedIndicatorTemplateList;Lhippo/model/v1/DxFeedFavDrawingToolsList;ZZLjava/lang/String;ZZZZZZZZZZZLhippo/model/v1/Zoom;Lhippo/model/v1/SnapCrosshairToPrice;ZZZZZZZLhippo/model/v1/ShowVolume;ZZZZZZZZZZLhippo/model/v1/ShowOpenPositions;Lhippo/model/v1/AssetComparisonSettings;ZZLhippo/model/v1/LastUsedDrawingTypes;ZLhippo/model/v1/ChartWidgetTypeTopDisplaySettings;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/FuturesTimeInForce;Lhippo/model/v1/CryptoTimeInForce;Lhippo/model/v1/CryptoAmountType;Lhippo/model/v1/ChartCustomColorSettings;Lokio/ByteString;)V", "getFavorite_intervals", "()Lhippo/model/v1/AggregationPeriodList;", "getCustom_intervals", "getDx_feed_indicator_template", "()Lhippo/model/v1/DxFeedIndicatorTemplateList;", "getDx_feed_fav_drawing_tools", "()Lhippo/model/v1/DxFeedFavDrawingToolsList;", "getSnap_to_data_enabled", "()Z", "getDrawing_mode_enabled", "getDrawing_config", "()Ljava/lang/String;", "getShow_indicator_markers", "getShow_indicator_line_markers", "getShow_indicator_ribbon_markers", "getShow_symbol_markers", "getShow_symbol_line_markers", "getShow_symbol_ribbon_markers", "getShow_symbol_bar_closed_markers", "getShow_grid", "getShow_grid_horizontal_lines", "getShow_grid_vertical_lines", "getSnap_crosshair_to_price_enabled", "getZoom", "()Lhippo/model/v1/Zoom;", "getSnap_crosshair_to_price", "()Lhippo/model/v1/SnapCrosshairToPrice;", "getShow_high_low_price", "getShow_legend", "getShow_legend_ohlcv", "getShow_legend_indicators", "getShow_extended_hours", "getShow_trading_session_highlights", "getShow_volume_enabled", "getShow_volume", "()Lhippo/model/v1/ShowVolume;", "getTrade_from_chart", "getTrade_from_chart_current_price", "getTrade_from_chart_top_left", "getShow_open_orders", "getShow_open_market_orders", "getShow_open_limit_orders", "getShow_open_stop_market_orders", "getShow_open_stop_limit_orders", "getShow_open_trailing_stop_orders", "getShow_open_positions_enabled", "getShow_open_positions", "()Lhippo/model/v1/ShowOpenPositions;", "getAsset_comparison_settings", "()Lhippo/model/v1/AssetComparisonSettings;", "getShow_indicator_name", "getShow_symbol_ticker_markers", "getLast_used_drawing_types", "()Lhippo/model/v1/LastUsedDrawingTypes;", "getDrawing_sync_enabled", "getTop_display_settings", "()Lhippo/model/v1/ChartWidgetTypeTopDisplaySettings;", "getShow_symbol_extended_hours_line_markers", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShow_symbol_extended_hours_ribbon_markers", "getAuto_send_trading_enabled", "getEquity_time_in_force_long_order", "()Lhippo/model/v1/EquityTimeInForce;", "getEquity_trading_session_long_order", "()Lhippo/model/v1/EquityTradingSession;", "getEquity_time_in_force_short_order", "getEquity_trading_session_short_order", "getFutures_time_in_force", "()Lhippo/model/v1/FuturesTimeInForce;", "getCrypto_time_in_force", "()Lhippo/model/v1/CryptoTimeInForce;", "getCrypto_amount_type", "()Lhippo/model/v1/CryptoAmountType;", "getChart_custom_color_settings", "()Lhippo/model/v1/ChartCustomColorSettings;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lhippo/model/v1/AggregationPeriodList;Lhippo/model/v1/AggregationPeriodList;Lhippo/model/v1/DxFeedIndicatorTemplateList;Lhippo/model/v1/DxFeedFavDrawingToolsList;ZZLjava/lang/String;ZZZZZZZZZZZLhippo/model/v1/Zoom;Lhippo/model/v1/SnapCrosshairToPrice;ZZZZZZZLhippo/model/v1/ShowVolume;ZZZZZZZZZZLhippo/model/v1/ShowOpenPositions;Lhippo/model/v1/AssetComparisonSettings;ZZLhippo/model/v1/LastUsedDrawingTypes;ZLhippo/model/v1/ChartWidgetTypeTopDisplaySettings;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/EquityTimeInForce;Lhippo/model/v1/EquityTradingSession;Lhippo/model/v1/FuturesTimeInForce;Lhippo/model/v1/CryptoTimeInForce;Lhippo/model/v1/CryptoAmountType;Lhippo/model/v1/ChartCustomColorSettings;Lokio/ByteString;)Lhippo/model/v1/ChartWidgetTypeSettings;", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ChartWidgetTypeSettings extends Message {

    @JvmField
    public static final ProtoAdapter<ChartWidgetTypeSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.AssetComparisonSettings#ADAPTER", jsonName = "assetComparisonSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 39, tag = 40)
    private final AssetComparisonSettings asset_comparison_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSendTradingEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 47, tag = 48)
    private final boolean auto_send_trading_enabled;

    @WireField(adapter = "hippo.model.v1.ChartCustomColorSettings#ADAPTER", jsonName = "chartCustomColorSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 55, tag = 56)
    private final ChartCustomColorSettings chart_custom_color_settings;

    @WireField(adapter = "hippo.model.v1.CryptoAmountType#ADAPTER", jsonName = "cryptoAmountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 54, tag = 55)
    private final CryptoAmountType crypto_amount_type;

    @WireField(adapter = "hippo.model.v1.CryptoTimeInForce#ADAPTER", jsonName = "cryptoTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 53, tag = 54)
    private final CryptoTimeInForce crypto_time_in_force;

    @WireField(adapter = "hippo.model.v1.AggregationPeriodList#ADAPTER", jsonName = "customIntervals", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AggregationPeriodList custom_intervals;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE", jsonName = "drawingConfig", schemaIndex = 6, tag = 7)
    private final String drawing_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "drawingModeEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean drawing_mode_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "drawingSyncEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 43, tag = 44)
    private final boolean drawing_sync_enabled;

    @WireField(adapter = "hippo.model.v1.DxFeedFavDrawingToolsList#ADAPTER", jsonName = "dxFeedFavDrawingTools", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final DxFeedFavDrawingToolsList dx_feed_fav_drawing_tools;

    @WireField(adapter = "hippo.model.v1.DxFeedIndicatorTemplateList#ADAPTER", jsonName = "dxFeedIndicatorTemplate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DxFeedIndicatorTemplateList dx_feed_indicator_template;

    @WireField(adapter = "hippo.model.v1.EquityTimeInForce#ADAPTER", jsonName = "equityTimeInForceLongOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 48, tag = 49)
    private final EquityTimeInForce equity_time_in_force_long_order;

    @WireField(adapter = "hippo.model.v1.EquityTimeInForce#ADAPTER", jsonName = "equityTimeInForceShortOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 50, tag = 51)
    private final EquityTimeInForce equity_time_in_force_short_order;

    @WireField(adapter = "hippo.model.v1.EquityTradingSession#ADAPTER", jsonName = "equityTradingSessionLongOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 49, tag = 50)
    private final EquityTradingSession equity_trading_session_long_order;

    @WireField(adapter = "hippo.model.v1.EquityTradingSession#ADAPTER", jsonName = "equityTradingSessionShortOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 51, tag = 52)
    private final EquityTradingSession equity_trading_session_short_order;

    @WireField(adapter = "hippo.model.v1.AggregationPeriodList#ADAPTER", jsonName = "favoriteIntervals", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final AggregationPeriodList favorite_intervals;

    @WireField(adapter = "hippo.model.v1.FuturesTimeInForce#ADAPTER", jsonName = "futuresTimeInForce", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 52, tag = 53)
    private final FuturesTimeInForce futures_time_in_force;

    @WireField(adapter = "hippo.model.v1.LastUsedDrawingTypes#ADAPTER", jsonName = "lastUsedDrawingTypes", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 42, tag = 43)
    private final LastUsedDrawingTypes last_used_drawing_types;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showExtendedHours", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 24, tag = 25)
    private final boolean show_extended_hours;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showGrid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 15)
    private final boolean show_grid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showGridHorizontalLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 16)
    private final boolean show_grid_horizontal_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showGridVerticalLines", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 17)
    private final boolean show_grid_vertical_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showHighLowPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 21)
    private final boolean show_high_low_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showIndicatorLineMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean show_indicator_line_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showIndicatorMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean show_indicator_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showIndicatorName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 40, tag = 41)
    private final boolean show_indicator_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showIndicatorRibbonMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean show_indicator_ribbon_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showLegend", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 22)
    private final boolean show_legend;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showLegendIndicators", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 23, tag = 24)
    private final boolean show_legend_indicators;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showLegendOhlcv", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 23)
    private final boolean show_legend_ohlcv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenLimitOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 33, tag = 34)
    private final boolean show_open_limit_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenMarketOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 32, tag = 33)
    private final boolean show_open_market_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 31, tag = 32)
    private final boolean show_open_orders;

    @WireField(adapter = "hippo.model.v1.ShowOpenPositions#ADAPTER", jsonName = "showOpenPositions", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 38, tag = 39)
    private final ShowOpenPositions show_open_positions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenPositionsEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 37, tag = 38)
    private final boolean show_open_positions_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenStopLimitOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 35, tag = 36)
    private final boolean show_open_stop_limit_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenStopMarketOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 34, tag = 35)
    private final boolean show_open_stop_market_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showOpenTrailingStopOrders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 36, tag = 37)
    private final boolean show_open_trailing_stop_orders;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showSymbolBarClosedMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 14)
    private final boolean show_symbol_bar_closed_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showSymbolExtendedHoursLineMarkers", schemaIndex = 45, tag = 46)
    private final Boolean show_symbol_extended_hours_line_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "showSymbolExtendedHoursRibbonMarkers", schemaIndex = 46, tag = 47)
    private final Boolean show_symbol_extended_hours_ribbon_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showSymbolLineMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final boolean show_symbol_line_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showSymbolMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final boolean show_symbol_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showSymbolRibbonMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final boolean show_symbol_ribbon_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showSymbolTickerMarkers", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 41, tag = 42)
    private final boolean show_symbol_ticker_markers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showTradingSessionHighlights", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 25, tag = 26)
    private final boolean show_trading_session_highlights;

    @WireField(adapter = "hippo.model.v1.ShowVolume#ADAPTER", jsonName = "showVolume", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 27, tag = 28)
    private final ShowVolume show_volume;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showVolumeEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 26, tag = 27)
    private final boolean show_volume_enabled;

    @WireField(adapter = "hippo.model.v1.SnapCrosshairToPrice#ADAPTER", jsonName = "snapCrosshairToPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 19, tag = 20)
    private final SnapCrosshairToPrice snap_crosshair_to_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "snapCrosshairToPriceEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 18)
    private final boolean snap_crosshair_to_price_enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "snapToDataEnabled", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean snap_to_data_enabled;

    @WireField(adapter = "hippo.model.v1.ChartWidgetTypeTopDisplaySettings#ADAPTER", jsonName = "topDisplaySettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 44, tag = 45)
    private final ChartWidgetTypeTopDisplaySettings top_display_settings;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tradeFromChart", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 28, tag = 29)
    private final boolean trade_from_chart;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tradeFromChartCurrentPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 29, tag = 30)
    private final boolean trade_from_chart_current_price;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tradeFromChartTopLeft", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 30, tag = 31)
    private final boolean trade_from_chart_top_left;

    @WireField(adapter = "hippo.model.v1.Zoom#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 19)
    private final Zoom zoom;

    public ChartWidgetTypeSettings() {
        this(null, null, null, null, false, false, null, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, false, null, null, false, false, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, -1, 33554431, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28235newBuilder();
    }

    public final AggregationPeriodList getFavorite_intervals() {
        return this.favorite_intervals;
    }

    public final AggregationPeriodList getCustom_intervals() {
        return this.custom_intervals;
    }

    public final DxFeedIndicatorTemplateList getDx_feed_indicator_template() {
        return this.dx_feed_indicator_template;
    }

    public final DxFeedFavDrawingToolsList getDx_feed_fav_drawing_tools() {
        return this.dx_feed_fav_drawing_tools;
    }

    public final boolean getSnap_to_data_enabled() {
        return this.snap_to_data_enabled;
    }

    public final boolean getDrawing_mode_enabled() {
        return this.drawing_mode_enabled;
    }

    public final String getDrawing_config() {
        return this.drawing_config;
    }

    public final boolean getShow_indicator_markers() {
        return this.show_indicator_markers;
    }

    public final boolean getShow_indicator_line_markers() {
        return this.show_indicator_line_markers;
    }

    public final boolean getShow_indicator_ribbon_markers() {
        return this.show_indicator_ribbon_markers;
    }

    public final boolean getShow_symbol_markers() {
        return this.show_symbol_markers;
    }

    public final boolean getShow_symbol_line_markers() {
        return this.show_symbol_line_markers;
    }

    public final boolean getShow_symbol_ribbon_markers() {
        return this.show_symbol_ribbon_markers;
    }

    public final boolean getShow_symbol_bar_closed_markers() {
        return this.show_symbol_bar_closed_markers;
    }

    public final boolean getShow_grid() {
        return this.show_grid;
    }

    public final boolean getShow_grid_horizontal_lines() {
        return this.show_grid_horizontal_lines;
    }

    public final boolean getShow_grid_vertical_lines() {
        return this.show_grid_vertical_lines;
    }

    public final boolean getSnap_crosshair_to_price_enabled() {
        return this.snap_crosshair_to_price_enabled;
    }

    public final Zoom getZoom() {
        return this.zoom;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChartWidgetTypeSettings(AggregationPeriodList aggregationPeriodList, AggregationPeriodList aggregationPeriodList2, DxFeedIndicatorTemplateList dxFeedIndicatorTemplateList, DxFeedFavDrawingToolsList dxFeedFavDrawingToolsList, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Zoom zoom, SnapCrosshairToPrice snapCrosshairToPrice, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, ShowVolume showVolume, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, ShowOpenPositions showOpenPositions, AssetComparisonSettings assetComparisonSettings, boolean z31, boolean z32, LastUsedDrawingTypes lastUsedDrawingTypes, boolean z33, ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettings, Boolean bool, Boolean bool2, boolean z34, EquityTimeInForce equityTimeInForce, EquityTradingSession equityTradingSession, EquityTimeInForce equityTimeInForce2, EquityTradingSession equityTradingSession2, FuturesTimeInForce futuresTimeInForce, CryptoTimeInForce cryptoTimeInForce, CryptoAmountType cryptoAmountType, ChartCustomColorSettings chartCustomColorSettings, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        AggregationPeriodList aggregationPeriodList3 = (i & 1) != 0 ? null : aggregationPeriodList;
        this(aggregationPeriodList3, (i & 2) != 0 ? null : aggregationPeriodList2, (i & 4) != 0 ? null : dxFeedIndicatorTemplateList, (i & 8) != 0 ? null : dxFeedFavDrawingToolsList, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? false : z6, (i & 2048) != 0 ? false : z7, (i & 4096) != 0 ? false : z8, (i & 8192) != 0 ? false : z9, (i & 16384) != 0 ? false : z10, (i & 32768) != 0 ? false : z11, (i & 65536) != 0 ? false : z12, (i & 131072) != 0 ? false : z13, (i & 262144) != 0 ? Zoom.ZOOM_UNSPECIFIED : zoom, (i & 524288) != 0 ? SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED : snapCrosshairToPrice, (i & 1048576) != 0 ? false : z14, (i & 2097152) != 0 ? false : z15, (i & 4194304) != 0 ? false : z16, (i & 8388608) != 0 ? false : z17, (i & 16777216) != 0 ? false : z18, (i & 33554432) != 0 ? false : z19, (i & 67108864) != 0 ? false : z20, (i & 134217728) != 0 ? ShowVolume.SHOW_VOLUME_UNSPECIFIED : showVolume, (i & 268435456) != 0 ? false : z21, (i & 536870912) != 0 ? false : z22, (i & 1073741824) != 0 ? false : z23, (i & Integer.MIN_VALUE) != 0 ? false : z24, (i2 & 1) != 0 ? false : z25, (i2 & 2) != 0 ? false : z26, (i2 & 4) != 0 ? false : z27, (i2 & 8) != 0 ? false : z28, (i2 & 16) != 0 ? false : z29, (i2 & 32) != 0 ? false : z30, (i2 & 64) != 0 ? ShowOpenPositions.SHOW_OPEN_POSITIONS_UNSPECIFIED : showOpenPositions, (i2 & 128) != 0 ? null : assetComparisonSettings, (i2 & 256) != 0 ? false : z31, (i2 & 512) != 0 ? false : z32, (i2 & 1024) != 0 ? null : lastUsedDrawingTypes, (i2 & 2048) != 0 ? false : z33, (i2 & 4096) != 0 ? null : chartWidgetTypeTopDisplaySettings, (i2 & 8192) != 0 ? null : bool, (i2 & 16384) != 0 ? null : bool2, (i2 & 32768) != 0 ? false : z34, (i2 & 65536) != 0 ? EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED : equityTimeInForce, (i2 & 131072) != 0 ? EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED : equityTradingSession, (i2 & 262144) != 0 ? EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED : equityTimeInForce2, (i2 & 524288) != 0 ? EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED : equityTradingSession2, (i2 & 1048576) != 0 ? FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED : futuresTimeInForce, (i2 & 2097152) != 0 ? CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED : cryptoTimeInForce, (i2 & 4194304) != 0 ? CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED : cryptoAmountType, (i2 & 8388608) != 0 ? null : chartCustomColorSettings, (i2 & 16777216) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SnapCrosshairToPrice getSnap_crosshair_to_price() {
        return this.snap_crosshair_to_price;
    }

    public final boolean getShow_high_low_price() {
        return this.show_high_low_price;
    }

    public final boolean getShow_legend() {
        return this.show_legend;
    }

    public final boolean getShow_legend_ohlcv() {
        return this.show_legend_ohlcv;
    }

    public final boolean getShow_legend_indicators() {
        return this.show_legend_indicators;
    }

    public final boolean getShow_extended_hours() {
        return this.show_extended_hours;
    }

    public final boolean getShow_trading_session_highlights() {
        return this.show_trading_session_highlights;
    }

    public final boolean getShow_volume_enabled() {
        return this.show_volume_enabled;
    }

    public final ShowVolume getShow_volume() {
        return this.show_volume;
    }

    public final boolean getTrade_from_chart() {
        return this.trade_from_chart;
    }

    public final boolean getTrade_from_chart_current_price() {
        return this.trade_from_chart_current_price;
    }

    public final boolean getTrade_from_chart_top_left() {
        return this.trade_from_chart_top_left;
    }

    public final boolean getShow_open_orders() {
        return this.show_open_orders;
    }

    public final boolean getShow_open_market_orders() {
        return this.show_open_market_orders;
    }

    public final boolean getShow_open_limit_orders() {
        return this.show_open_limit_orders;
    }

    public final boolean getShow_open_stop_market_orders() {
        return this.show_open_stop_market_orders;
    }

    public final boolean getShow_open_stop_limit_orders() {
        return this.show_open_stop_limit_orders;
    }

    public final boolean getShow_open_trailing_stop_orders() {
        return this.show_open_trailing_stop_orders;
    }

    public final boolean getShow_open_positions_enabled() {
        return this.show_open_positions_enabled;
    }

    public final ShowOpenPositions getShow_open_positions() {
        return this.show_open_positions;
    }

    public final AssetComparisonSettings getAsset_comparison_settings() {
        return this.asset_comparison_settings;
    }

    public final boolean getShow_indicator_name() {
        return this.show_indicator_name;
    }

    public final boolean getShow_symbol_ticker_markers() {
        return this.show_symbol_ticker_markers;
    }

    public final LastUsedDrawingTypes getLast_used_drawing_types() {
        return this.last_used_drawing_types;
    }

    public final boolean getDrawing_sync_enabled() {
        return this.drawing_sync_enabled;
    }

    public final ChartWidgetTypeTopDisplaySettings getTop_display_settings() {
        return this.top_display_settings;
    }

    public final Boolean getShow_symbol_extended_hours_line_markers() {
        return this.show_symbol_extended_hours_line_markers;
    }

    public final Boolean getShow_symbol_extended_hours_ribbon_markers() {
        return this.show_symbol_extended_hours_ribbon_markers;
    }

    public final boolean getAuto_send_trading_enabled() {
        return this.auto_send_trading_enabled;
    }

    public final EquityTimeInForce getEquity_time_in_force_long_order() {
        return this.equity_time_in_force_long_order;
    }

    public final EquityTradingSession getEquity_trading_session_long_order() {
        return this.equity_trading_session_long_order;
    }

    public final EquityTimeInForce getEquity_time_in_force_short_order() {
        return this.equity_time_in_force_short_order;
    }

    public final EquityTradingSession getEquity_trading_session_short_order() {
        return this.equity_trading_session_short_order;
    }

    public final FuturesTimeInForce getFutures_time_in_force() {
        return this.futures_time_in_force;
    }

    public final CryptoTimeInForce getCrypto_time_in_force() {
        return this.crypto_time_in_force;
    }

    public final CryptoAmountType getCrypto_amount_type() {
        return this.crypto_amount_type;
    }

    public final ChartCustomColorSettings getChart_custom_color_settings() {
        return this.chart_custom_color_settings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartWidgetTypeSettings(AggregationPeriodList aggregationPeriodList, AggregationPeriodList aggregationPeriodList2, DxFeedIndicatorTemplateList dxFeedIndicatorTemplateList, DxFeedFavDrawingToolsList dxFeedFavDrawingToolsList, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Zoom zoom, SnapCrosshairToPrice snap_crosshair_to_price, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, ShowVolume show_volume, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, ShowOpenPositions show_open_positions, AssetComparisonSettings assetComparisonSettings, boolean z31, boolean z32, LastUsedDrawingTypes lastUsedDrawingTypes, boolean z33, ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettings, Boolean bool, Boolean bool2, boolean z34, EquityTimeInForce equity_time_in_force_long_order, EquityTradingSession equity_trading_session_long_order, EquityTimeInForce equity_time_in_force_short_order, EquityTradingSession equity_trading_session_short_order, FuturesTimeInForce futures_time_in_force, CryptoTimeInForce crypto_time_in_force, CryptoAmountType crypto_amount_type, ChartCustomColorSettings chartCustomColorSettings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(zoom, "zoom");
        Intrinsics.checkNotNullParameter(snap_crosshair_to_price, "snap_crosshair_to_price");
        Intrinsics.checkNotNullParameter(show_volume, "show_volume");
        Intrinsics.checkNotNullParameter(show_open_positions, "show_open_positions");
        Intrinsics.checkNotNullParameter(equity_time_in_force_long_order, "equity_time_in_force_long_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_long_order, "equity_trading_session_long_order");
        Intrinsics.checkNotNullParameter(equity_time_in_force_short_order, "equity_time_in_force_short_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_short_order, "equity_trading_session_short_order");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.favorite_intervals = aggregationPeriodList;
        this.custom_intervals = aggregationPeriodList2;
        this.dx_feed_indicator_template = dxFeedIndicatorTemplateList;
        this.dx_feed_fav_drawing_tools = dxFeedFavDrawingToolsList;
        this.snap_to_data_enabled = z;
        this.drawing_mode_enabled = z2;
        this.drawing_config = str;
        this.show_indicator_markers = z3;
        this.show_indicator_line_markers = z4;
        this.show_indicator_ribbon_markers = z5;
        this.show_symbol_markers = z6;
        this.show_symbol_line_markers = z7;
        this.show_symbol_ribbon_markers = z8;
        this.show_symbol_bar_closed_markers = z9;
        this.show_grid = z10;
        this.show_grid_horizontal_lines = z11;
        this.show_grid_vertical_lines = z12;
        this.snap_crosshair_to_price_enabled = z13;
        this.zoom = zoom;
        this.snap_crosshair_to_price = snap_crosshair_to_price;
        this.show_high_low_price = z14;
        this.show_legend = z15;
        this.show_legend_ohlcv = z16;
        this.show_legend_indicators = z17;
        this.show_extended_hours = z18;
        this.show_trading_session_highlights = z19;
        this.show_volume_enabled = z20;
        this.show_volume = show_volume;
        this.trade_from_chart = z21;
        this.trade_from_chart_current_price = z22;
        this.trade_from_chart_top_left = z23;
        this.show_open_orders = z24;
        this.show_open_market_orders = z25;
        this.show_open_limit_orders = z26;
        this.show_open_stop_market_orders = z27;
        this.show_open_stop_limit_orders = z28;
        this.show_open_trailing_stop_orders = z29;
        this.show_open_positions_enabled = z30;
        this.show_open_positions = show_open_positions;
        this.asset_comparison_settings = assetComparisonSettings;
        this.show_indicator_name = z31;
        this.show_symbol_ticker_markers = z32;
        this.last_used_drawing_types = lastUsedDrawingTypes;
        this.drawing_sync_enabled = z33;
        this.top_display_settings = chartWidgetTypeTopDisplaySettings;
        this.show_symbol_extended_hours_line_markers = bool;
        this.show_symbol_extended_hours_ribbon_markers = bool2;
        this.auto_send_trading_enabled = z34;
        this.equity_time_in_force_long_order = equity_time_in_force_long_order;
        this.equity_trading_session_long_order = equity_trading_session_long_order;
        this.equity_time_in_force_short_order = equity_time_in_force_short_order;
        this.equity_trading_session_short_order = equity_trading_session_short_order;
        this.futures_time_in_force = futures_time_in_force;
        this.crypto_time_in_force = crypto_time_in_force;
        this.crypto_amount_type = crypto_amount_type;
        this.chart_custom_color_settings = chartCustomColorSettings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28235newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChartWidgetTypeSettings)) {
            return false;
        }
        ChartWidgetTypeSettings chartWidgetTypeSettings = (ChartWidgetTypeSettings) other;
        return Intrinsics.areEqual(unknownFields(), chartWidgetTypeSettings.unknownFields()) && Intrinsics.areEqual(this.favorite_intervals, chartWidgetTypeSettings.favorite_intervals) && Intrinsics.areEqual(this.custom_intervals, chartWidgetTypeSettings.custom_intervals) && Intrinsics.areEqual(this.dx_feed_indicator_template, chartWidgetTypeSettings.dx_feed_indicator_template) && Intrinsics.areEqual(this.dx_feed_fav_drawing_tools, chartWidgetTypeSettings.dx_feed_fav_drawing_tools) && this.snap_to_data_enabled == chartWidgetTypeSettings.snap_to_data_enabled && this.drawing_mode_enabled == chartWidgetTypeSettings.drawing_mode_enabled && Intrinsics.areEqual(this.drawing_config, chartWidgetTypeSettings.drawing_config) && this.show_indicator_markers == chartWidgetTypeSettings.show_indicator_markers && this.show_indicator_line_markers == chartWidgetTypeSettings.show_indicator_line_markers && this.show_indicator_ribbon_markers == chartWidgetTypeSettings.show_indicator_ribbon_markers && this.show_symbol_markers == chartWidgetTypeSettings.show_symbol_markers && this.show_symbol_line_markers == chartWidgetTypeSettings.show_symbol_line_markers && this.show_symbol_ribbon_markers == chartWidgetTypeSettings.show_symbol_ribbon_markers && this.show_symbol_bar_closed_markers == chartWidgetTypeSettings.show_symbol_bar_closed_markers && this.show_grid == chartWidgetTypeSettings.show_grid && this.show_grid_horizontal_lines == chartWidgetTypeSettings.show_grid_horizontal_lines && this.show_grid_vertical_lines == chartWidgetTypeSettings.show_grid_vertical_lines && this.snap_crosshair_to_price_enabled == chartWidgetTypeSettings.snap_crosshair_to_price_enabled && this.zoom == chartWidgetTypeSettings.zoom && this.snap_crosshair_to_price == chartWidgetTypeSettings.snap_crosshair_to_price && this.show_high_low_price == chartWidgetTypeSettings.show_high_low_price && this.show_legend == chartWidgetTypeSettings.show_legend && this.show_legend_ohlcv == chartWidgetTypeSettings.show_legend_ohlcv && this.show_legend_indicators == chartWidgetTypeSettings.show_legend_indicators && this.show_extended_hours == chartWidgetTypeSettings.show_extended_hours && this.show_trading_session_highlights == chartWidgetTypeSettings.show_trading_session_highlights && this.show_volume_enabled == chartWidgetTypeSettings.show_volume_enabled && this.show_volume == chartWidgetTypeSettings.show_volume && this.trade_from_chart == chartWidgetTypeSettings.trade_from_chart && this.trade_from_chart_current_price == chartWidgetTypeSettings.trade_from_chart_current_price && this.trade_from_chart_top_left == chartWidgetTypeSettings.trade_from_chart_top_left && this.show_open_orders == chartWidgetTypeSettings.show_open_orders && this.show_open_market_orders == chartWidgetTypeSettings.show_open_market_orders && this.show_open_limit_orders == chartWidgetTypeSettings.show_open_limit_orders && this.show_open_stop_market_orders == chartWidgetTypeSettings.show_open_stop_market_orders && this.show_open_stop_limit_orders == chartWidgetTypeSettings.show_open_stop_limit_orders && this.show_open_trailing_stop_orders == chartWidgetTypeSettings.show_open_trailing_stop_orders && this.show_open_positions_enabled == chartWidgetTypeSettings.show_open_positions_enabled && this.show_open_positions == chartWidgetTypeSettings.show_open_positions && Intrinsics.areEqual(this.asset_comparison_settings, chartWidgetTypeSettings.asset_comparison_settings) && this.show_indicator_name == chartWidgetTypeSettings.show_indicator_name && this.show_symbol_ticker_markers == chartWidgetTypeSettings.show_symbol_ticker_markers && Intrinsics.areEqual(this.last_used_drawing_types, chartWidgetTypeSettings.last_used_drawing_types) && this.drawing_sync_enabled == chartWidgetTypeSettings.drawing_sync_enabled && Intrinsics.areEqual(this.top_display_settings, chartWidgetTypeSettings.top_display_settings) && Intrinsics.areEqual(this.show_symbol_extended_hours_line_markers, chartWidgetTypeSettings.show_symbol_extended_hours_line_markers) && Intrinsics.areEqual(this.show_symbol_extended_hours_ribbon_markers, chartWidgetTypeSettings.show_symbol_extended_hours_ribbon_markers) && this.auto_send_trading_enabled == chartWidgetTypeSettings.auto_send_trading_enabled && this.equity_time_in_force_long_order == chartWidgetTypeSettings.equity_time_in_force_long_order && this.equity_trading_session_long_order == chartWidgetTypeSettings.equity_trading_session_long_order && this.equity_time_in_force_short_order == chartWidgetTypeSettings.equity_time_in_force_short_order && this.equity_trading_session_short_order == chartWidgetTypeSettings.equity_trading_session_short_order && this.futures_time_in_force == chartWidgetTypeSettings.futures_time_in_force && this.crypto_time_in_force == chartWidgetTypeSettings.crypto_time_in_force && this.crypto_amount_type == chartWidgetTypeSettings.crypto_amount_type && Intrinsics.areEqual(this.chart_custom_color_settings, chartWidgetTypeSettings.chart_custom_color_settings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        AggregationPeriodList aggregationPeriodList = this.favorite_intervals;
        int iHashCode2 = (iHashCode + (aggregationPeriodList != null ? aggregationPeriodList.hashCode() : 0)) * 37;
        AggregationPeriodList aggregationPeriodList2 = this.custom_intervals;
        int iHashCode3 = (iHashCode2 + (aggregationPeriodList2 != null ? aggregationPeriodList2.hashCode() : 0)) * 37;
        DxFeedIndicatorTemplateList dxFeedIndicatorTemplateList = this.dx_feed_indicator_template;
        int iHashCode4 = (iHashCode3 + (dxFeedIndicatorTemplateList != null ? dxFeedIndicatorTemplateList.hashCode() : 0)) * 37;
        DxFeedFavDrawingToolsList dxFeedFavDrawingToolsList = this.dx_feed_fav_drawing_tools;
        int iHashCode5 = (((((iHashCode4 + (dxFeedFavDrawingToolsList != null ? dxFeedFavDrawingToolsList.hashCode() : 0)) * 37) + Boolean.hashCode(this.snap_to_data_enabled)) * 37) + Boolean.hashCode(this.drawing_mode_enabled)) * 37;
        String str = this.drawing_config;
        int iHashCode6 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 37) + Boolean.hashCode(this.show_indicator_markers)) * 37) + Boolean.hashCode(this.show_indicator_line_markers)) * 37) + Boolean.hashCode(this.show_indicator_ribbon_markers)) * 37) + Boolean.hashCode(this.show_symbol_markers)) * 37) + Boolean.hashCode(this.show_symbol_line_markers)) * 37) + Boolean.hashCode(this.show_symbol_ribbon_markers)) * 37) + Boolean.hashCode(this.show_symbol_bar_closed_markers)) * 37) + Boolean.hashCode(this.show_grid)) * 37) + Boolean.hashCode(this.show_grid_horizontal_lines)) * 37) + Boolean.hashCode(this.show_grid_vertical_lines)) * 37) + Boolean.hashCode(this.snap_crosshair_to_price_enabled)) * 37) + this.zoom.hashCode()) * 37) + this.snap_crosshair_to_price.hashCode()) * 37) + Boolean.hashCode(this.show_high_low_price)) * 37) + Boolean.hashCode(this.show_legend)) * 37) + Boolean.hashCode(this.show_legend_ohlcv)) * 37) + Boolean.hashCode(this.show_legend_indicators)) * 37) + Boolean.hashCode(this.show_extended_hours)) * 37) + Boolean.hashCode(this.show_trading_session_highlights)) * 37) + Boolean.hashCode(this.show_volume_enabled)) * 37) + this.show_volume.hashCode()) * 37) + Boolean.hashCode(this.trade_from_chart)) * 37) + Boolean.hashCode(this.trade_from_chart_current_price)) * 37) + Boolean.hashCode(this.trade_from_chart_top_left)) * 37) + Boolean.hashCode(this.show_open_orders)) * 37) + Boolean.hashCode(this.show_open_market_orders)) * 37) + Boolean.hashCode(this.show_open_limit_orders)) * 37) + Boolean.hashCode(this.show_open_stop_market_orders)) * 37) + Boolean.hashCode(this.show_open_stop_limit_orders)) * 37) + Boolean.hashCode(this.show_open_trailing_stop_orders)) * 37) + Boolean.hashCode(this.show_open_positions_enabled)) * 37) + this.show_open_positions.hashCode()) * 37;
        AssetComparisonSettings assetComparisonSettings = this.asset_comparison_settings;
        int iHashCode7 = (((((iHashCode6 + (assetComparisonSettings != null ? assetComparisonSettings.hashCode() : 0)) * 37) + Boolean.hashCode(this.show_indicator_name)) * 37) + Boolean.hashCode(this.show_symbol_ticker_markers)) * 37;
        LastUsedDrawingTypes lastUsedDrawingTypes = this.last_used_drawing_types;
        int iHashCode8 = (((iHashCode7 + (lastUsedDrawingTypes != null ? lastUsedDrawingTypes.hashCode() : 0)) * 37) + Boolean.hashCode(this.drawing_sync_enabled)) * 37;
        ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettings = this.top_display_settings;
        int iHashCode9 = (iHashCode8 + (chartWidgetTypeTopDisplaySettings != null ? chartWidgetTypeTopDisplaySettings.hashCode() : 0)) * 37;
        Boolean bool = this.show_symbol_extended_hours_line_markers;
        int iHashCode10 = (iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.show_symbol_extended_hours_ribbon_markers;
        int iHashCode11 = (((((((((((((((((iHashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 37) + Boolean.hashCode(this.auto_send_trading_enabled)) * 37) + this.equity_time_in_force_long_order.hashCode()) * 37) + this.equity_trading_session_long_order.hashCode()) * 37) + this.equity_time_in_force_short_order.hashCode()) * 37) + this.equity_trading_session_short_order.hashCode()) * 37) + this.futures_time_in_force.hashCode()) * 37) + this.crypto_time_in_force.hashCode()) * 37) + this.crypto_amount_type.hashCode()) * 37;
        ChartCustomColorSettings chartCustomColorSettings = this.chart_custom_color_settings;
        int iHashCode12 = iHashCode11 + (chartCustomColorSettings != null ? chartCustomColorSettings.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        AggregationPeriodList aggregationPeriodList = this.favorite_intervals;
        if (aggregationPeriodList != null) {
            arrayList.add("favorite_intervals=" + aggregationPeriodList);
        }
        AggregationPeriodList aggregationPeriodList2 = this.custom_intervals;
        if (aggregationPeriodList2 != null) {
            arrayList.add("custom_intervals=" + aggregationPeriodList2);
        }
        DxFeedIndicatorTemplateList dxFeedIndicatorTemplateList = this.dx_feed_indicator_template;
        if (dxFeedIndicatorTemplateList != null) {
            arrayList.add("dx_feed_indicator_template=" + dxFeedIndicatorTemplateList);
        }
        DxFeedFavDrawingToolsList dxFeedFavDrawingToolsList = this.dx_feed_fav_drawing_tools;
        if (dxFeedFavDrawingToolsList != null) {
            arrayList.add("dx_feed_fav_drawing_tools=" + dxFeedFavDrawingToolsList);
        }
        arrayList.add("snap_to_data_enabled=" + this.snap_to_data_enabled);
        arrayList.add("drawing_mode_enabled=" + this.drawing_mode_enabled);
        String str = this.drawing_config;
        if (str != null) {
            arrayList.add("drawing_config=" + str);
        }
        arrayList.add("show_indicator_markers=" + this.show_indicator_markers);
        arrayList.add("show_indicator_line_markers=" + this.show_indicator_line_markers);
        arrayList.add("show_indicator_ribbon_markers=" + this.show_indicator_ribbon_markers);
        arrayList.add("show_symbol_markers=" + this.show_symbol_markers);
        arrayList.add("show_symbol_line_markers=" + this.show_symbol_line_markers);
        arrayList.add("show_symbol_ribbon_markers=" + this.show_symbol_ribbon_markers);
        arrayList.add("show_symbol_bar_closed_markers=" + this.show_symbol_bar_closed_markers);
        arrayList.add("show_grid=" + this.show_grid);
        arrayList.add("show_grid_horizontal_lines=" + this.show_grid_horizontal_lines);
        arrayList.add("show_grid_vertical_lines=" + this.show_grid_vertical_lines);
        arrayList.add("snap_crosshair_to_price_enabled=" + this.snap_crosshair_to_price_enabled);
        arrayList.add("zoom=" + this.zoom);
        arrayList.add("snap_crosshair_to_price=" + this.snap_crosshair_to_price);
        arrayList.add("show_high_low_price=" + this.show_high_low_price);
        arrayList.add("show_legend=" + this.show_legend);
        arrayList.add("show_legend_ohlcv=" + this.show_legend_ohlcv);
        arrayList.add("show_legend_indicators=" + this.show_legend_indicators);
        arrayList.add("show_extended_hours=" + this.show_extended_hours);
        arrayList.add("show_trading_session_highlights=" + this.show_trading_session_highlights);
        arrayList.add("show_volume_enabled=" + this.show_volume_enabled);
        arrayList.add("show_volume=" + this.show_volume);
        arrayList.add("trade_from_chart=" + this.trade_from_chart);
        arrayList.add("trade_from_chart_current_price=" + this.trade_from_chart_current_price);
        arrayList.add("trade_from_chart_top_left=" + this.trade_from_chart_top_left);
        arrayList.add("show_open_orders=" + this.show_open_orders);
        arrayList.add("show_open_market_orders=" + this.show_open_market_orders);
        arrayList.add("show_open_limit_orders=" + this.show_open_limit_orders);
        arrayList.add("show_open_stop_market_orders=" + this.show_open_stop_market_orders);
        arrayList.add("show_open_stop_limit_orders=" + this.show_open_stop_limit_orders);
        arrayList.add("show_open_trailing_stop_orders=" + this.show_open_trailing_stop_orders);
        arrayList.add("show_open_positions_enabled=" + this.show_open_positions_enabled);
        arrayList.add("show_open_positions=" + this.show_open_positions);
        AssetComparisonSettings assetComparisonSettings = this.asset_comparison_settings;
        if (assetComparisonSettings != null) {
            arrayList.add("asset_comparison_settings=" + assetComparisonSettings);
        }
        arrayList.add("show_indicator_name=" + this.show_indicator_name);
        arrayList.add("show_symbol_ticker_markers=" + this.show_symbol_ticker_markers);
        LastUsedDrawingTypes lastUsedDrawingTypes = this.last_used_drawing_types;
        if (lastUsedDrawingTypes != null) {
            arrayList.add("last_used_drawing_types=" + lastUsedDrawingTypes);
        }
        arrayList.add("drawing_sync_enabled=" + this.drawing_sync_enabled);
        ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettings = this.top_display_settings;
        if (chartWidgetTypeTopDisplaySettings != null) {
            arrayList.add("top_display_settings=" + chartWidgetTypeTopDisplaySettings);
        }
        Boolean bool = this.show_symbol_extended_hours_line_markers;
        if (bool != null) {
            arrayList.add("show_symbol_extended_hours_line_markers=" + bool);
        }
        Boolean bool2 = this.show_symbol_extended_hours_ribbon_markers;
        if (bool2 != null) {
            arrayList.add("show_symbol_extended_hours_ribbon_markers=" + bool2);
        }
        arrayList.add("auto_send_trading_enabled=" + this.auto_send_trading_enabled);
        arrayList.add("equity_time_in_force_long_order=" + this.equity_time_in_force_long_order);
        arrayList.add("equity_trading_session_long_order=" + this.equity_trading_session_long_order);
        arrayList.add("equity_time_in_force_short_order=" + this.equity_time_in_force_short_order);
        arrayList.add("equity_trading_session_short_order=" + this.equity_trading_session_short_order);
        arrayList.add("futures_time_in_force=" + this.futures_time_in_force);
        arrayList.add("crypto_time_in_force=" + this.crypto_time_in_force);
        arrayList.add("crypto_amount_type=" + this.crypto_amount_type);
        ChartCustomColorSettings chartCustomColorSettings = this.chart_custom_color_settings;
        if (chartCustomColorSettings != null) {
            arrayList.add("chart_custom_color_settings=" + chartCustomColorSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChartWidgetTypeSettings{", "}", 0, null, null, 56, null);
    }

    public final ChartWidgetTypeSettings copy(AggregationPeriodList favorite_intervals, AggregationPeriodList custom_intervals, DxFeedIndicatorTemplateList dx_feed_indicator_template, DxFeedFavDrawingToolsList dx_feed_fav_drawing_tools, boolean snap_to_data_enabled, boolean drawing_mode_enabled, String drawing_config, boolean show_indicator_markers, boolean show_indicator_line_markers, boolean show_indicator_ribbon_markers, boolean show_symbol_markers, boolean show_symbol_line_markers, boolean show_symbol_ribbon_markers, boolean show_symbol_bar_closed_markers, boolean show_grid, boolean show_grid_horizontal_lines, boolean show_grid_vertical_lines, boolean snap_crosshair_to_price_enabled, Zoom zoom, SnapCrosshairToPrice snap_crosshair_to_price, boolean show_high_low_price, boolean show_legend, boolean show_legend_ohlcv, boolean show_legend_indicators, boolean show_extended_hours, boolean show_trading_session_highlights, boolean show_volume_enabled, ShowVolume show_volume, boolean trade_from_chart, boolean trade_from_chart_current_price, boolean trade_from_chart_top_left, boolean show_open_orders, boolean show_open_market_orders, boolean show_open_limit_orders, boolean show_open_stop_market_orders, boolean show_open_stop_limit_orders, boolean show_open_trailing_stop_orders, boolean show_open_positions_enabled, ShowOpenPositions show_open_positions, AssetComparisonSettings asset_comparison_settings, boolean show_indicator_name, boolean show_symbol_ticker_markers, LastUsedDrawingTypes last_used_drawing_types, boolean drawing_sync_enabled, ChartWidgetTypeTopDisplaySettings top_display_settings, Boolean show_symbol_extended_hours_line_markers, Boolean show_symbol_extended_hours_ribbon_markers, boolean auto_send_trading_enabled, EquityTimeInForce equity_time_in_force_long_order, EquityTradingSession equity_trading_session_long_order, EquityTimeInForce equity_time_in_force_short_order, EquityTradingSession equity_trading_session_short_order, FuturesTimeInForce futures_time_in_force, CryptoTimeInForce crypto_time_in_force, CryptoAmountType crypto_amount_type, ChartCustomColorSettings chart_custom_color_settings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(zoom, "zoom");
        Intrinsics.checkNotNullParameter(snap_crosshair_to_price, "snap_crosshair_to_price");
        Intrinsics.checkNotNullParameter(show_volume, "show_volume");
        Intrinsics.checkNotNullParameter(show_open_positions, "show_open_positions");
        Intrinsics.checkNotNullParameter(equity_time_in_force_long_order, "equity_time_in_force_long_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_long_order, "equity_trading_session_long_order");
        Intrinsics.checkNotNullParameter(equity_time_in_force_short_order, "equity_time_in_force_short_order");
        Intrinsics.checkNotNullParameter(equity_trading_session_short_order, "equity_trading_session_short_order");
        Intrinsics.checkNotNullParameter(futures_time_in_force, "futures_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_time_in_force, "crypto_time_in_force");
        Intrinsics.checkNotNullParameter(crypto_amount_type, "crypto_amount_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChartWidgetTypeSettings(favorite_intervals, custom_intervals, dx_feed_indicator_template, dx_feed_fav_drawing_tools, snap_to_data_enabled, drawing_mode_enabled, drawing_config, show_indicator_markers, show_indicator_line_markers, show_indicator_ribbon_markers, show_symbol_markers, show_symbol_line_markers, show_symbol_ribbon_markers, show_symbol_bar_closed_markers, show_grid, show_grid_horizontal_lines, show_grid_vertical_lines, snap_crosshair_to_price_enabled, zoom, snap_crosshair_to_price, show_high_low_price, show_legend, show_legend_ohlcv, show_legend_indicators, show_extended_hours, show_trading_session_highlights, show_volume_enabled, show_volume, trade_from_chart, trade_from_chart_current_price, trade_from_chart_top_left, show_open_orders, show_open_market_orders, show_open_limit_orders, show_open_stop_market_orders, show_open_stop_limit_orders, show_open_trailing_stop_orders, show_open_positions_enabled, show_open_positions, asset_comparison_settings, show_indicator_name, show_symbol_ticker_markers, last_used_drawing_types, drawing_sync_enabled, top_display_settings, show_symbol_extended_hours_line_markers, show_symbol_extended_hours_ribbon_markers, auto_send_trading_enabled, equity_time_in_force_long_order, equity_trading_session_long_order, equity_time_in_force_short_order, equity_trading_session_short_order, futures_time_in_force, crypto_time_in_force, crypto_amount_type, chart_custom_color_settings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChartWidgetTypeSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChartWidgetTypeSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.ChartWidgetTypeSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChartWidgetTypeSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getFavorite_intervals() != null) {
                    size += AggregationPeriodList.ADAPTER.encodedSizeWithTag(1, value.getFavorite_intervals());
                }
                if (value.getCustom_intervals() != null) {
                    size += AggregationPeriodList.ADAPTER.encodedSizeWithTag(2, value.getCustom_intervals());
                }
                if (value.getDx_feed_indicator_template() != null) {
                    size += DxFeedIndicatorTemplateList.ADAPTER.encodedSizeWithTag(3, value.getDx_feed_indicator_template());
                }
                if (value.getDx_feed_fav_drawing_tools() != null) {
                    size += DxFeedFavDrawingToolsList.ADAPTER.encodedSizeWithTag(4, value.getDx_feed_fav_drawing_tools());
                }
                if (value.getSnap_to_data_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getSnap_to_data_enabled()));
                }
                if (value.getDrawing_mode_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getDrawing_mode_enabled()));
                }
                if (value.getDrawing_config() != null) {
                    size += ProtoAdapter.STRING_VALUE.encodedSizeWithTag(7, value.getDrawing_config());
                }
                if (value.getShow_indicator_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getShow_indicator_markers()));
                }
                if (value.getShow_indicator_line_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getShow_indicator_line_markers()));
                }
                if (value.getShow_indicator_ribbon_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getShow_indicator_ribbon_markers()));
                }
                if (value.getShow_symbol_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(11, Boolean.valueOf(value.getShow_symbol_markers()));
                }
                if (value.getShow_symbol_line_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getShow_symbol_line_markers()));
                }
                if (value.getShow_symbol_ribbon_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getShow_symbol_ribbon_markers()));
                }
                if (value.getShow_symbol_bar_closed_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.getShow_symbol_bar_closed_markers()));
                }
                if (value.getShow_grid()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(15, Boolean.valueOf(value.getShow_grid()));
                }
                if (value.getShow_grid_horizontal_lines()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getShow_grid_horizontal_lines()));
                }
                if (value.getShow_grid_vertical_lines()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getShow_grid_vertical_lines()));
                }
                if (value.getSnap_crosshair_to_price_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getSnap_crosshair_to_price_enabled()));
                }
                if (value.getZoom() != Zoom.ZOOM_UNSPECIFIED) {
                    size += Zoom.ADAPTER.encodedSizeWithTag(19, value.getZoom());
                }
                if (value.getSnap_crosshair_to_price() != SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED) {
                    size += SnapCrosshairToPrice.ADAPTER.encodedSizeWithTag(20, value.getSnap_crosshair_to_price());
                }
                if (value.getShow_high_low_price()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.getShow_high_low_price()));
                }
                if (value.getShow_legend()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.getShow_legend()));
                }
                if (value.getShow_legend_ohlcv()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(23, Boolean.valueOf(value.getShow_legend_ohlcv()));
                }
                if (value.getShow_legend_indicators()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(24, Boolean.valueOf(value.getShow_legend_indicators()));
                }
                if (value.getShow_extended_hours()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.getShow_extended_hours()));
                }
                if (value.getShow_trading_session_highlights()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(26, Boolean.valueOf(value.getShow_trading_session_highlights()));
                }
                if (value.getShow_volume_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(27, Boolean.valueOf(value.getShow_volume_enabled()));
                }
                if (value.getShow_volume() != ShowVolume.SHOW_VOLUME_UNSPECIFIED) {
                    size += ShowVolume.ADAPTER.encodedSizeWithTag(28, value.getShow_volume());
                }
                if (value.getTrade_from_chart()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(29, Boolean.valueOf(value.getTrade_from_chart()));
                }
                if (value.getTrade_from_chart_current_price()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(30, Boolean.valueOf(value.getTrade_from_chart_current_price()));
                }
                if (value.getTrade_from_chart_top_left()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(31, Boolean.valueOf(value.getTrade_from_chart_top_left()));
                }
                if (value.getShow_open_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(32, Boolean.valueOf(value.getShow_open_orders()));
                }
                if (value.getShow_open_market_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(33, Boolean.valueOf(value.getShow_open_market_orders()));
                }
                if (value.getShow_open_limit_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(34, Boolean.valueOf(value.getShow_open_limit_orders()));
                }
                if (value.getShow_open_stop_market_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(35, Boolean.valueOf(value.getShow_open_stop_market_orders()));
                }
                if (value.getShow_open_stop_limit_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.getShow_open_stop_limit_orders()));
                }
                if (value.getShow_open_trailing_stop_orders()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(37, Boolean.valueOf(value.getShow_open_trailing_stop_orders()));
                }
                if (value.getShow_open_positions_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(38, Boolean.valueOf(value.getShow_open_positions_enabled()));
                }
                if (value.getShow_open_positions() != ShowOpenPositions.SHOW_OPEN_POSITIONS_UNSPECIFIED) {
                    size += ShowOpenPositions.ADAPTER.encodedSizeWithTag(39, value.getShow_open_positions());
                }
                if (value.getAsset_comparison_settings() != null) {
                    size += AssetComparisonSettings.ADAPTER.encodedSizeWithTag(40, value.getAsset_comparison_settings());
                }
                if (value.getShow_indicator_name()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.getShow_indicator_name()));
                }
                if (value.getShow_symbol_ticker_markers()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(42, Boolean.valueOf(value.getShow_symbol_ticker_markers()));
                }
                if (value.getLast_used_drawing_types() != null) {
                    size += LastUsedDrawingTypes.ADAPTER.encodedSizeWithTag(43, value.getLast_used_drawing_types());
                }
                if (value.getDrawing_sync_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(44, Boolean.valueOf(value.getDrawing_sync_enabled()));
                }
                if (value.getTop_display_settings() != null) {
                    size += ChartWidgetTypeTopDisplaySettings.ADAPTER.encodedSizeWithTag(45, value.getTop_display_settings());
                }
                if (value.getShow_symbol_extended_hours_line_markers() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(46, value.getShow_symbol_extended_hours_line_markers());
                }
                if (value.getShow_symbol_extended_hours_ribbon_markers() != null) {
                    size += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(47, value.getShow_symbol_extended_hours_ribbon_markers());
                }
                if (value.getAuto_send_trading_enabled()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(48, Boolean.valueOf(value.getAuto_send_trading_enabled()));
                }
                EquityTimeInForce equity_time_in_force_long_order = value.getEquity_time_in_force_long_order();
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                if (equity_time_in_force_long_order != equityTimeInForce) {
                    size += EquityTimeInForce.ADAPTER.encodedSizeWithTag(49, value.getEquity_time_in_force_long_order());
                }
                EquityTradingSession equity_trading_session_long_order = value.getEquity_trading_session_long_order();
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                if (equity_trading_session_long_order != equityTradingSession) {
                    size += EquityTradingSession.ADAPTER.encodedSizeWithTag(50, value.getEquity_trading_session_long_order());
                }
                if (value.getEquity_time_in_force_short_order() != equityTimeInForce) {
                    size += EquityTimeInForce.ADAPTER.encodedSizeWithTag(51, value.getEquity_time_in_force_short_order());
                }
                if (value.getEquity_trading_session_short_order() != equityTradingSession) {
                    size += EquityTradingSession.ADAPTER.encodedSizeWithTag(52, value.getEquity_trading_session_short_order());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    size += FuturesTimeInForce.ADAPTER.encodedSizeWithTag(53, value.getFutures_time_in_force());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    size += CryptoTimeInForce.ADAPTER.encodedSizeWithTag(54, value.getCrypto_time_in_force());
                }
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    size += CryptoAmountType.ADAPTER.encodedSizeWithTag(55, value.getCrypto_amount_type());
                }
                return value.getChart_custom_color_settings() != null ? size + ChartCustomColorSettings.ADAPTER.encodedSizeWithTag(56, value.getChart_custom_color_settings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChartWidgetTypeSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getFavorite_intervals() != null) {
                    AggregationPeriodList.ADAPTER.encodeWithTag(writer, 1, (int) value.getFavorite_intervals());
                }
                if (value.getCustom_intervals() != null) {
                    AggregationPeriodList.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustom_intervals());
                }
                if (value.getDx_feed_indicator_template() != null) {
                    DxFeedIndicatorTemplateList.ADAPTER.encodeWithTag(writer, 3, (int) value.getDx_feed_indicator_template());
                }
                if (value.getDx_feed_fav_drawing_tools() != null) {
                    DxFeedFavDrawingToolsList.ADAPTER.encodeWithTag(writer, 4, (int) value.getDx_feed_fav_drawing_tools());
                }
                if (value.getSnap_to_data_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getSnap_to_data_enabled()));
                }
                if (value.getDrawing_mode_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getDrawing_mode_enabled()));
                }
                if (value.getDrawing_config() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 7, (int) value.getDrawing_config());
                }
                if (value.getShow_indicator_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getShow_indicator_markers()));
                }
                if (value.getShow_indicator_line_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getShow_indicator_line_markers()));
                }
                if (value.getShow_indicator_ribbon_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getShow_indicator_ribbon_markers()));
                }
                if (value.getShow_symbol_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getShow_symbol_markers()));
                }
                if (value.getShow_symbol_line_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getShow_symbol_line_markers()));
                }
                if (value.getShow_symbol_ribbon_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getShow_symbol_ribbon_markers()));
                }
                if (value.getShow_symbol_bar_closed_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 14, (int) Boolean.valueOf(value.getShow_symbol_bar_closed_markers()));
                }
                if (value.getShow_grid()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) Boolean.valueOf(value.getShow_grid()));
                }
                if (value.getShow_grid_horizontal_lines()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getShow_grid_horizontal_lines()));
                }
                if (value.getShow_grid_vertical_lines()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getShow_grid_vertical_lines()));
                }
                if (value.getSnap_crosshair_to_price_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getSnap_crosshair_to_price_enabled()));
                }
                if (value.getZoom() != Zoom.ZOOM_UNSPECIFIED) {
                    Zoom.ADAPTER.encodeWithTag(writer, 19, (int) value.getZoom());
                }
                if (value.getSnap_crosshair_to_price() != SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED) {
                    SnapCrosshairToPrice.ADAPTER.encodeWithTag(writer, 20, (int) value.getSnap_crosshair_to_price());
                }
                if (value.getShow_high_low_price()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) Boolean.valueOf(value.getShow_high_low_price()));
                }
                if (value.getShow_legend()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 22, (int) Boolean.valueOf(value.getShow_legend()));
                }
                if (value.getShow_legend_ohlcv()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) Boolean.valueOf(value.getShow_legend_ohlcv()));
                }
                if (value.getShow_legend_indicators()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) Boolean.valueOf(value.getShow_legend_indicators()));
                }
                if (value.getShow_extended_hours()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getShow_extended_hours()));
                }
                if (value.getShow_trading_session_highlights()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 26, (int) Boolean.valueOf(value.getShow_trading_session_highlights()));
                }
                if (value.getShow_volume_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 27, (int) Boolean.valueOf(value.getShow_volume_enabled()));
                }
                if (value.getShow_volume() != ShowVolume.SHOW_VOLUME_UNSPECIFIED) {
                    ShowVolume.ADAPTER.encodeWithTag(writer, 28, (int) value.getShow_volume());
                }
                if (value.getTrade_from_chart()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 29, (int) Boolean.valueOf(value.getTrade_from_chart()));
                }
                if (value.getTrade_from_chart_current_price()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 30, (int) Boolean.valueOf(value.getTrade_from_chart_current_price()));
                }
                if (value.getTrade_from_chart_top_left()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 31, (int) Boolean.valueOf(value.getTrade_from_chart_top_left()));
                }
                if (value.getShow_open_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 32, (int) Boolean.valueOf(value.getShow_open_orders()));
                }
                if (value.getShow_open_market_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 33, (int) Boolean.valueOf(value.getShow_open_market_orders()));
                }
                if (value.getShow_open_limit_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 34, (int) Boolean.valueOf(value.getShow_open_limit_orders()));
                }
                if (value.getShow_open_stop_market_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 35, (int) Boolean.valueOf(value.getShow_open_stop_market_orders()));
                }
                if (value.getShow_open_stop_limit_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 36, (int) Boolean.valueOf(value.getShow_open_stop_limit_orders()));
                }
                if (value.getShow_open_trailing_stop_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 37, (int) Boolean.valueOf(value.getShow_open_trailing_stop_orders()));
                }
                if (value.getShow_open_positions_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 38, (int) Boolean.valueOf(value.getShow_open_positions_enabled()));
                }
                if (value.getShow_open_positions() != ShowOpenPositions.SHOW_OPEN_POSITIONS_UNSPECIFIED) {
                    ShowOpenPositions.ADAPTER.encodeWithTag(writer, 39, (int) value.getShow_open_positions());
                }
                if (value.getAsset_comparison_settings() != null) {
                    AssetComparisonSettings.ADAPTER.encodeWithTag(writer, 40, (int) value.getAsset_comparison_settings());
                }
                if (value.getShow_indicator_name()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 41, (int) Boolean.valueOf(value.getShow_indicator_name()));
                }
                if (value.getShow_symbol_ticker_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 42, (int) Boolean.valueOf(value.getShow_symbol_ticker_markers()));
                }
                if (value.getLast_used_drawing_types() != null) {
                    LastUsedDrawingTypes.ADAPTER.encodeWithTag(writer, 43, (int) value.getLast_used_drawing_types());
                }
                if (value.getDrawing_sync_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 44, (int) Boolean.valueOf(value.getDrawing_sync_enabled()));
                }
                if (value.getTop_display_settings() != null) {
                    ChartWidgetTypeTopDisplaySettings.ADAPTER.encodeWithTag(writer, 45, (int) value.getTop_display_settings());
                }
                if (value.getShow_symbol_extended_hours_line_markers() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 46, (int) value.getShow_symbol_extended_hours_line_markers());
                }
                if (value.getShow_symbol_extended_hours_ribbon_markers() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 47, (int) value.getShow_symbol_extended_hours_ribbon_markers());
                }
                if (value.getAuto_send_trading_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 48, (int) Boolean.valueOf(value.getAuto_send_trading_enabled()));
                }
                EquityTimeInForce equity_time_in_force_long_order = value.getEquity_time_in_force_long_order();
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                if (equity_time_in_force_long_order != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 49, (int) value.getEquity_time_in_force_long_order());
                }
                EquityTradingSession equity_trading_session_long_order = value.getEquity_trading_session_long_order();
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                if (equity_trading_session_long_order != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 50, (int) value.getEquity_trading_session_long_order());
                }
                if (value.getEquity_time_in_force_short_order() != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 51, (int) value.getEquity_time_in_force_short_order());
                }
                if (value.getEquity_trading_session_short_order() != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 52, (int) value.getEquity_trading_session_short_order());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    FuturesTimeInForce.ADAPTER.encodeWithTag(writer, 53, (int) value.getFutures_time_in_force());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    CryptoTimeInForce.ADAPTER.encodeWithTag(writer, 54, (int) value.getCrypto_time_in_force());
                }
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    CryptoAmountType.ADAPTER.encodeWithTag(writer, 55, (int) value.getCrypto_amount_type());
                }
                if (value.getChart_custom_color_settings() != null) {
                    ChartCustomColorSettings.ADAPTER.encodeWithTag(writer, 56, (int) value.getChart_custom_color_settings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChartWidgetTypeSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getChart_custom_color_settings() != null) {
                    ChartCustomColorSettings.ADAPTER.encodeWithTag(writer, 56, (int) value.getChart_custom_color_settings());
                }
                if (value.getCrypto_amount_type() != CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED) {
                    CryptoAmountType.ADAPTER.encodeWithTag(writer, 55, (int) value.getCrypto_amount_type());
                }
                if (value.getCrypto_time_in_force() != CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED) {
                    CryptoTimeInForce.ADAPTER.encodeWithTag(writer, 54, (int) value.getCrypto_time_in_force());
                }
                if (value.getFutures_time_in_force() != FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED) {
                    FuturesTimeInForce.ADAPTER.encodeWithTag(writer, 53, (int) value.getFutures_time_in_force());
                }
                EquityTradingSession equity_trading_session_short_order = value.getEquity_trading_session_short_order();
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                if (equity_trading_session_short_order != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 52, (int) value.getEquity_trading_session_short_order());
                }
                EquityTimeInForce equity_time_in_force_short_order = value.getEquity_time_in_force_short_order();
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                if (equity_time_in_force_short_order != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 51, (int) value.getEquity_time_in_force_short_order());
                }
                if (value.getEquity_trading_session_long_order() != equityTradingSession) {
                    EquityTradingSession.ADAPTER.encodeWithTag(writer, 50, (int) value.getEquity_trading_session_long_order());
                }
                if (value.getEquity_time_in_force_long_order() != equityTimeInForce) {
                    EquityTimeInForce.ADAPTER.encodeWithTag(writer, 49, (int) value.getEquity_time_in_force_long_order());
                }
                if (value.getAuto_send_trading_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 48, (int) Boolean.valueOf(value.getAuto_send_trading_enabled()));
                }
                if (value.getShow_symbol_extended_hours_ribbon_markers() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 47, (int) value.getShow_symbol_extended_hours_ribbon_markers());
                }
                if (value.getShow_symbol_extended_hours_line_markers() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 46, (int) value.getShow_symbol_extended_hours_line_markers());
                }
                if (value.getTop_display_settings() != null) {
                    ChartWidgetTypeTopDisplaySettings.ADAPTER.encodeWithTag(writer, 45, (int) value.getTop_display_settings());
                }
                if (value.getDrawing_sync_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 44, (int) Boolean.valueOf(value.getDrawing_sync_enabled()));
                }
                if (value.getLast_used_drawing_types() != null) {
                    LastUsedDrawingTypes.ADAPTER.encodeWithTag(writer, 43, (int) value.getLast_used_drawing_types());
                }
                if (value.getShow_symbol_ticker_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 42, (int) Boolean.valueOf(value.getShow_symbol_ticker_markers()));
                }
                if (value.getShow_indicator_name()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 41, (int) Boolean.valueOf(value.getShow_indicator_name()));
                }
                if (value.getAsset_comparison_settings() != null) {
                    AssetComparisonSettings.ADAPTER.encodeWithTag(writer, 40, (int) value.getAsset_comparison_settings());
                }
                if (value.getShow_open_positions() != ShowOpenPositions.SHOW_OPEN_POSITIONS_UNSPECIFIED) {
                    ShowOpenPositions.ADAPTER.encodeWithTag(writer, 39, (int) value.getShow_open_positions());
                }
                if (value.getShow_open_positions_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 38, (int) Boolean.valueOf(value.getShow_open_positions_enabled()));
                }
                if (value.getShow_open_trailing_stop_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 37, (int) Boolean.valueOf(value.getShow_open_trailing_stop_orders()));
                }
                if (value.getShow_open_stop_limit_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 36, (int) Boolean.valueOf(value.getShow_open_stop_limit_orders()));
                }
                if (value.getShow_open_stop_market_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 35, (int) Boolean.valueOf(value.getShow_open_stop_market_orders()));
                }
                if (value.getShow_open_limit_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 34, (int) Boolean.valueOf(value.getShow_open_limit_orders()));
                }
                if (value.getShow_open_market_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 33, (int) Boolean.valueOf(value.getShow_open_market_orders()));
                }
                if (value.getShow_open_orders()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 32, (int) Boolean.valueOf(value.getShow_open_orders()));
                }
                if (value.getTrade_from_chart_top_left()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 31, (int) Boolean.valueOf(value.getTrade_from_chart_top_left()));
                }
                if (value.getTrade_from_chart_current_price()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 30, (int) Boolean.valueOf(value.getTrade_from_chart_current_price()));
                }
                if (value.getTrade_from_chart()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 29, (int) Boolean.valueOf(value.getTrade_from_chart()));
                }
                if (value.getShow_volume() != ShowVolume.SHOW_VOLUME_UNSPECIFIED) {
                    ShowVolume.ADAPTER.encodeWithTag(writer, 28, (int) value.getShow_volume());
                }
                if (value.getShow_volume_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 27, (int) Boolean.valueOf(value.getShow_volume_enabled()));
                }
                if (value.getShow_trading_session_highlights()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 26, (int) Boolean.valueOf(value.getShow_trading_session_highlights()));
                }
                if (value.getShow_extended_hours()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 25, (int) Boolean.valueOf(value.getShow_extended_hours()));
                }
                if (value.getShow_legend_indicators()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 24, (int) Boolean.valueOf(value.getShow_legend_indicators()));
                }
                if (value.getShow_legend_ohlcv()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 23, (int) Boolean.valueOf(value.getShow_legend_ohlcv()));
                }
                if (value.getShow_legend()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 22, (int) Boolean.valueOf(value.getShow_legend()));
                }
                if (value.getShow_high_low_price()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 21, (int) Boolean.valueOf(value.getShow_high_low_price()));
                }
                if (value.getSnap_crosshair_to_price() != SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED) {
                    SnapCrosshairToPrice.ADAPTER.encodeWithTag(writer, 20, (int) value.getSnap_crosshair_to_price());
                }
                if (value.getZoom() != Zoom.ZOOM_UNSPECIFIED) {
                    Zoom.ADAPTER.encodeWithTag(writer, 19, (int) value.getZoom());
                }
                if (value.getSnap_crosshair_to_price_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 18, (int) Boolean.valueOf(value.getSnap_crosshair_to_price_enabled()));
                }
                if (value.getShow_grid_vertical_lines()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 17, (int) Boolean.valueOf(value.getShow_grid_vertical_lines()));
                }
                if (value.getShow_grid_horizontal_lines()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 16, (int) Boolean.valueOf(value.getShow_grid_horizontal_lines()));
                }
                if (value.getShow_grid()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 15, (int) Boolean.valueOf(value.getShow_grid()));
                }
                if (value.getShow_symbol_bar_closed_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 14, (int) Boolean.valueOf(value.getShow_symbol_bar_closed_markers()));
                }
                if (value.getShow_symbol_ribbon_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 13, (int) Boolean.valueOf(value.getShow_symbol_ribbon_markers()));
                }
                if (value.getShow_symbol_line_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 12, (int) Boolean.valueOf(value.getShow_symbol_line_markers()));
                }
                if (value.getShow_symbol_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 11, (int) Boolean.valueOf(value.getShow_symbol_markers()));
                }
                if (value.getShow_indicator_ribbon_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getShow_indicator_ribbon_markers()));
                }
                if (value.getShow_indicator_line_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getShow_indicator_line_markers()));
                }
                if (value.getShow_indicator_markers()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getShow_indicator_markers()));
                }
                if (value.getDrawing_config() != null) {
                    ProtoAdapter.STRING_VALUE.encodeWithTag(writer, 7, (int) value.getDrawing_config());
                }
                if (value.getDrawing_mode_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 6, (int) Boolean.valueOf(value.getDrawing_mode_enabled()));
                }
                if (value.getSnap_to_data_enabled()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getSnap_to_data_enabled()));
                }
                if (value.getDx_feed_fav_drawing_tools() != null) {
                    DxFeedFavDrawingToolsList.ADAPTER.encodeWithTag(writer, 4, (int) value.getDx_feed_fav_drawing_tools());
                }
                if (value.getDx_feed_indicator_template() != null) {
                    DxFeedIndicatorTemplateList.ADAPTER.encodeWithTag(writer, 3, (int) value.getDx_feed_indicator_template());
                }
                if (value.getCustom_intervals() != null) {
                    AggregationPeriodList.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustom_intervals());
                }
                if (value.getFavorite_intervals() != null) {
                    AggregationPeriodList.ADAPTER.encodeWithTag(writer, 1, (int) value.getFavorite_intervals());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChartWidgetTypeSettings decode(ProtoReader reader) throws IOException {
                SnapCrosshairToPrice snapCrosshairToPrice;
                ShowVolume showVolume;
                ShowOpenPositions showOpenPositions;
                Zoom zoomDecode;
                Intrinsics.checkNotNullParameter(reader, "reader");
                Zoom zoom = Zoom.ZOOM_UNSPECIFIED;
                SnapCrosshairToPrice snapCrosshairToPrice2 = SnapCrosshairToPrice.SNAP_CROSSHAIR_TO_PRICE_UNSPECIFIED;
                ShowVolume showVolume2 = ShowVolume.SHOW_VOLUME_UNSPECIFIED;
                ShowOpenPositions showOpenPositions2 = ShowOpenPositions.SHOW_OPEN_POSITIONS_UNSPECIFIED;
                EquityTimeInForce equityTimeInForce = EquityTimeInForce.EQUITY_TIME_IN_FORCE_UNSPECIFIED;
                EquityTradingSession equityTradingSession = EquityTradingSession.EQUITY_TRADING_SESSION_UNSPECIFIED;
                FuturesTimeInForce futuresTimeInForce = FuturesTimeInForce.FUTURES_TIME_IN_FORCE_UNSPECIFIED;
                CryptoTimeInForce cryptoTimeInForce = CryptoTimeInForce.CRYPTO_TIME_IN_FORCE_UNSPECIFIED;
                CryptoAmountType cryptoAmountType = CryptoAmountType.CRYPTO_AMOUNT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Zoom zoom2 = zoom;
                CryptoAmountType cryptoAmountTypeDecode = cryptoAmountType;
                AggregationPeriodList aggregationPeriodList = null;
                AggregationPeriodList aggregationPeriodList2 = null;
                DxFeedIndicatorTemplateList dxFeedIndicatorTemplateList = null;
                DxFeedFavDrawingToolsList dxFeedFavDrawingToolsList = null;
                String str = null;
                AssetComparisonSettings assetComparisonSettings = null;
                LastUsedDrawingTypes lastUsedDrawingTypes = null;
                ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettings = null;
                Boolean bool = null;
                Boolean bool2 = null;
                ChartCustomColorSettings chartCustomColorSettings = null;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                boolean z29 = false;
                boolean z30 = false;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                EquityTradingSession equityTradingSessionDecode = equityTradingSession;
                FuturesTimeInForce futuresTimeInForceDecode = futuresTimeInForce;
                CryptoTimeInForce cryptoTimeInForceDecode = cryptoTimeInForce;
                EquityTimeInForce equityTimeInForceDecode = equityTimeInForce;
                EquityTimeInForce equityTimeInForceDecode2 = equityTimeInForceDecode;
                EquityTradingSession equityTradingSessionDecode2 = equityTradingSessionDecode;
                ShowOpenPositions showOpenPositionsDecode = showOpenPositions2;
                ShowVolume showVolumeDecode = showVolume2;
                SnapCrosshairToPrice snapCrosshairToPriceDecode = snapCrosshairToPrice2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                AggregationPeriodList aggregationPeriodListDecode = AggregationPeriodList.ADAPTER.decode(reader);
                                Unit unit = Unit.INSTANCE;
                                aggregationPeriodList = aggregationPeriodListDecode;
                                break;
                            case 2:
                                AggregationPeriodList aggregationPeriodListDecode2 = AggregationPeriodList.ADAPTER.decode(reader);
                                Unit unit2 = Unit.INSTANCE;
                                aggregationPeriodList2 = aggregationPeriodListDecode2;
                                break;
                            case 3:
                                DxFeedIndicatorTemplateList dxFeedIndicatorTemplateListDecode = DxFeedIndicatorTemplateList.ADAPTER.decode(reader);
                                Unit unit3 = Unit.INSTANCE;
                                dxFeedIndicatorTemplateList = dxFeedIndicatorTemplateListDecode;
                                break;
                            case 4:
                                DxFeedFavDrawingToolsList dxFeedFavDrawingToolsListDecode = DxFeedFavDrawingToolsList.ADAPTER.decode(reader);
                                Unit unit4 = Unit.INSTANCE;
                                dxFeedFavDrawingToolsList = dxFeedFavDrawingToolsListDecode;
                                break;
                            case 5:
                                boolean zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit5 = Unit.INSTANCE;
                                z = zBooleanValue;
                                break;
                            case 6:
                                boolean zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit6 = Unit.INSTANCE;
                                z2 = zBooleanValue2;
                                break;
                            case 7:
                                String strDecode = ProtoAdapter.STRING_VALUE.decode(reader);
                                Unit unit7 = Unit.INSTANCE;
                                str = strDecode;
                                break;
                            case 8:
                                boolean zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit8 = Unit.INSTANCE;
                                z3 = zBooleanValue3;
                                break;
                            case 9:
                                boolean zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit9 = Unit.INSTANCE;
                                z4 = zBooleanValue4;
                                break;
                            case 10:
                                boolean zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit10 = Unit.INSTANCE;
                                z5 = zBooleanValue5;
                                break;
                            case 11:
                                boolean zBooleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit11 = Unit.INSTANCE;
                                z6 = zBooleanValue6;
                                break;
                            case 12:
                                boolean zBooleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit12 = Unit.INSTANCE;
                                z7 = zBooleanValue7;
                                break;
                            case 13:
                                boolean zBooleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit13 = Unit.INSTANCE;
                                z8 = zBooleanValue8;
                                break;
                            case 14:
                                boolean zBooleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit14 = Unit.INSTANCE;
                                z9 = zBooleanValue9;
                                break;
                            case 15:
                                boolean zBooleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit15 = Unit.INSTANCE;
                                z10 = zBooleanValue10;
                                break;
                            case 16:
                                boolean zBooleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit16 = Unit.INSTANCE;
                                z11 = zBooleanValue11;
                                break;
                            case 17:
                                boolean zBooleanValue12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit17 = Unit.INSTANCE;
                                z12 = zBooleanValue12;
                                break;
                            case 18:
                                boolean zBooleanValue13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit18 = Unit.INSTANCE;
                                z13 = zBooleanValue13;
                                break;
                            case 19:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    zoomDecode = Zoom.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    zoomDecode = zoom2;
                                }
                                Unit unit19 = Unit.INSTANCE;
                                zoom2 = zoomDecode;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 20:
                                SnapCrosshairToPrice snapCrosshairToPrice3 = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    snapCrosshairToPriceDecode = SnapCrosshairToPrice.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    snapCrosshairToPriceDecode = snapCrosshairToPrice3;
                                }
                                Unit unit20 = Unit.INSTANCE;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 21:
                                boolean zBooleanValue14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit21 = Unit.INSTANCE;
                                z14 = zBooleanValue14;
                                break;
                            case 22:
                                boolean zBooleanValue15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit22 = Unit.INSTANCE;
                                z15 = zBooleanValue15;
                                break;
                            case 23:
                                boolean zBooleanValue16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit23 = Unit.INSTANCE;
                                z16 = zBooleanValue16;
                                break;
                            case 24:
                                boolean zBooleanValue17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit24 = Unit.INSTANCE;
                                z17 = zBooleanValue17;
                                break;
                            case 25:
                                boolean zBooleanValue18 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit25 = Unit.INSTANCE;
                                z18 = zBooleanValue18;
                                break;
                            case 26:
                                boolean zBooleanValue19 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit26 = Unit.INSTANCE;
                                z19 = zBooleanValue19;
                                break;
                            case 27:
                                boolean zBooleanValue20 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit27 = Unit.INSTANCE;
                                z20 = zBooleanValue20;
                                break;
                            case 28:
                                SnapCrosshairToPrice snapCrosshairToPrice4 = snapCrosshairToPriceDecode;
                                ShowVolume showVolume3 = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    showVolumeDecode = ShowVolume.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    showVolumeDecode = showVolume3;
                                }
                                Unit unit28 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice4;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 29:
                                boolean zBooleanValue21 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit29 = Unit.INSTANCE;
                                z21 = zBooleanValue21;
                                break;
                            case 30:
                                boolean zBooleanValue22 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit30 = Unit.INSTANCE;
                                z22 = zBooleanValue22;
                                break;
                            case 31:
                                boolean zBooleanValue23 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit31 = Unit.INSTANCE;
                                z23 = zBooleanValue23;
                                break;
                            case 32:
                                boolean zBooleanValue24 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit32 = Unit.INSTANCE;
                                z24 = zBooleanValue24;
                                break;
                            case 33:
                                boolean zBooleanValue25 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit33 = Unit.INSTANCE;
                                z25 = zBooleanValue25;
                                break;
                            case 34:
                                boolean zBooleanValue26 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit34 = Unit.INSTANCE;
                                z26 = zBooleanValue26;
                                break;
                            case 35:
                                boolean zBooleanValue27 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit35 = Unit.INSTANCE;
                                z27 = zBooleanValue27;
                                break;
                            case 36:
                                boolean zBooleanValue28 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit36 = Unit.INSTANCE;
                                z28 = zBooleanValue28;
                                break;
                            case 37:
                                boolean zBooleanValue29 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit37 = Unit.INSTANCE;
                                z29 = zBooleanValue29;
                                break;
                            case 38:
                                boolean zBooleanValue30 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit38 = Unit.INSTANCE;
                                z30 = zBooleanValue30;
                                break;
                            case 39:
                                SnapCrosshairToPrice snapCrosshairToPrice5 = snapCrosshairToPriceDecode;
                                ShowVolume showVolume4 = showVolumeDecode;
                                ShowOpenPositions showOpenPositions3 = showOpenPositionsDecode;
                                try {
                                    showOpenPositionsDecode = ShowOpenPositions.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                    showOpenPositionsDecode = showOpenPositions3;
                                }
                                Unit unit39 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice5;
                                showVolumeDecode = showVolume4;
                                break;
                            case 40:
                                AssetComparisonSettings assetComparisonSettingsDecode = AssetComparisonSettings.ADAPTER.decode(reader);
                                Unit unit40 = Unit.INSTANCE;
                                assetComparisonSettings = assetComparisonSettingsDecode;
                                break;
                            case 41:
                                boolean zBooleanValue31 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit41 = Unit.INSTANCE;
                                z31 = zBooleanValue31;
                                break;
                            case 42:
                                boolean zBooleanValue32 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit42 = Unit.INSTANCE;
                                z32 = zBooleanValue32;
                                break;
                            case 43:
                                LastUsedDrawingTypes lastUsedDrawingTypesDecode = LastUsedDrawingTypes.ADAPTER.decode(reader);
                                Unit unit43 = Unit.INSTANCE;
                                lastUsedDrawingTypes = lastUsedDrawingTypesDecode;
                                break;
                            case 44:
                                boolean zBooleanValue33 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit44 = Unit.INSTANCE;
                                z33 = zBooleanValue33;
                                break;
                            case 45:
                                ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettingsDecode = ChartWidgetTypeTopDisplaySettings.ADAPTER.decode(reader);
                                Unit unit45 = Unit.INSTANCE;
                                chartWidgetTypeTopDisplaySettings = chartWidgetTypeTopDisplaySettingsDecode;
                                break;
                            case 46:
                                Boolean boolDecode = ProtoAdapter.BOOL_VALUE.decode(reader);
                                Unit unit46 = Unit.INSTANCE;
                                bool = boolDecode;
                                break;
                            case 47:
                                Boolean boolDecode2 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                Unit unit47 = Unit.INSTANCE;
                                bool2 = boolDecode2;
                                break;
                            case 48:
                                boolean zBooleanValue34 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                Unit unit48 = Unit.INSTANCE;
                                z34 = zBooleanValue34;
                                break;
                            case 49:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    equityTimeInForceDecode = EquityTimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                }
                                Unit unit49 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 50:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    equityTradingSessionDecode2 = EquityTradingSession.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                }
                                Unit unit50 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 51:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    equityTimeInForceDecode2 = EquityTimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                }
                                Unit unit51 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 52:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    equityTradingSessionDecode = EquityTradingSession.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                }
                                Unit unit52 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 53:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    futuresTimeInForceDecode = FuturesTimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                }
                                Unit unit53 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 54:
                                snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                showVolume = showVolumeDecode;
                                showOpenPositions = showOpenPositionsDecode;
                                try {
                                    cryptoTimeInForceDecode = CryptoTimeInForce.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                                }
                                Unit unit54 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 55:
                                try {
                                    cryptoAmountTypeDecode = CryptoAmountType.ADAPTER.decode(reader);
                                    snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                    showVolume = showVolumeDecode;
                                    showOpenPositions = showOpenPositionsDecode;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                    snapCrosshairToPrice = snapCrosshairToPriceDecode;
                                    showVolume = showVolumeDecode;
                                    showOpenPositions = showOpenPositionsDecode;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                                }
                                Unit unit55 = Unit.INSTANCE;
                                snapCrosshairToPriceDecode = snapCrosshairToPrice;
                                showVolumeDecode = showVolume;
                                showOpenPositionsDecode = showOpenPositions;
                                break;
                            case 56:
                                ChartCustomColorSettings chartCustomColorSettingsDecode = ChartCustomColorSettings.ADAPTER.decode(reader);
                                Unit unit56 = Unit.INSTANCE;
                                chartCustomColorSettings = chartCustomColorSettingsDecode;
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                Unit unit57 = Unit.INSTANCE;
                                break;
                        }
                    } else {
                        return new ChartWidgetTypeSettings(aggregationPeriodList, aggregationPeriodList2, dxFeedIndicatorTemplateList, dxFeedFavDrawingToolsList, z, z2, str, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, zoom2, snapCrosshairToPriceDecode, z14, z15, z16, z17, z18, z19, z20, showVolumeDecode, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, showOpenPositionsDecode, assetComparisonSettings, z31, z32, lastUsedDrawingTypes, z33, chartWidgetTypeTopDisplaySettings, bool, bool2, z34, equityTimeInForceDecode, equityTradingSessionDecode2, equityTimeInForceDecode2, equityTradingSessionDecode, futuresTimeInForceDecode, cryptoTimeInForceDecode, cryptoAmountTypeDecode, chartCustomColorSettings, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChartWidgetTypeSettings redact(ChartWidgetTypeSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AggregationPeriodList favorite_intervals = value.getFavorite_intervals();
                AggregationPeriodList aggregationPeriodListRedact = favorite_intervals != null ? AggregationPeriodList.ADAPTER.redact(favorite_intervals) : null;
                AggregationPeriodList custom_intervals = value.getCustom_intervals();
                AggregationPeriodList aggregationPeriodListRedact2 = custom_intervals != null ? AggregationPeriodList.ADAPTER.redact(custom_intervals) : null;
                DxFeedIndicatorTemplateList dx_feed_indicator_template = value.getDx_feed_indicator_template();
                DxFeedIndicatorTemplateList dxFeedIndicatorTemplateListRedact = dx_feed_indicator_template != null ? DxFeedIndicatorTemplateList.ADAPTER.redact(dx_feed_indicator_template) : null;
                DxFeedFavDrawingToolsList dx_feed_fav_drawing_tools = value.getDx_feed_fav_drawing_tools();
                DxFeedFavDrawingToolsList dxFeedFavDrawingToolsListRedact = dx_feed_fav_drawing_tools != null ? DxFeedFavDrawingToolsList.ADAPTER.redact(dx_feed_fav_drawing_tools) : null;
                String drawing_config = value.getDrawing_config();
                String strRedact = drawing_config != null ? ProtoAdapter.STRING_VALUE.redact(drawing_config) : null;
                AssetComparisonSettings asset_comparison_settings = value.getAsset_comparison_settings();
                AssetComparisonSettings assetComparisonSettingsRedact = asset_comparison_settings != null ? AssetComparisonSettings.ADAPTER.redact(asset_comparison_settings) : null;
                LastUsedDrawingTypes last_used_drawing_types = value.getLast_used_drawing_types();
                LastUsedDrawingTypes lastUsedDrawingTypesRedact = last_used_drawing_types != null ? LastUsedDrawingTypes.ADAPTER.redact(last_used_drawing_types) : null;
                ChartWidgetTypeTopDisplaySettings top_display_settings = value.getTop_display_settings();
                ChartWidgetTypeTopDisplaySettings chartWidgetTypeTopDisplaySettingsRedact = top_display_settings != null ? ChartWidgetTypeTopDisplaySettings.ADAPTER.redact(top_display_settings) : null;
                Boolean show_symbol_extended_hours_line_markers = value.getShow_symbol_extended_hours_line_markers();
                Boolean boolRedact = show_symbol_extended_hours_line_markers != null ? ProtoAdapter.BOOL_VALUE.redact(show_symbol_extended_hours_line_markers) : null;
                Boolean show_symbol_extended_hours_ribbon_markers = value.getShow_symbol_extended_hours_ribbon_markers();
                Boolean boolRedact2 = show_symbol_extended_hours_ribbon_markers != null ? ProtoAdapter.BOOL_VALUE.redact(show_symbol_extended_hours_ribbon_markers) : null;
                ChartCustomColorSettings chart_custom_color_settings = value.getChart_custom_color_settings();
                return value.copy(((-80) & 1) != 0 ? value.favorite_intervals : aggregationPeriodListRedact, ((-80) & 2) != 0 ? value.custom_intervals : aggregationPeriodListRedact2, ((-80) & 4) != 0 ? value.dx_feed_indicator_template : dxFeedIndicatorTemplateListRedact, ((-80) & 8) != 0 ? value.dx_feed_fav_drawing_tools : dxFeedFavDrawingToolsListRedact, ((-80) & 16) != 0 ? value.snap_to_data_enabled : false, ((-80) & 32) != 0 ? value.drawing_mode_enabled : false, ((-80) & 64) != 0 ? value.drawing_config : strRedact, ((-80) & 128) != 0 ? value.show_indicator_markers : false, ((-80) & 256) != 0 ? value.show_indicator_line_markers : false, ((-80) & 512) != 0 ? value.show_indicator_ribbon_markers : false, ((-80) & 1024) != 0 ? value.show_symbol_markers : false, ((-80) & 2048) != 0 ? value.show_symbol_line_markers : false, ((-80) & 4096) != 0 ? value.show_symbol_ribbon_markers : false, ((-80) & 8192) != 0 ? value.show_symbol_bar_closed_markers : false, ((-80) & 16384) != 0 ? value.show_grid : false, ((-80) & 32768) != 0 ? value.show_grid_horizontal_lines : false, ((-80) & 65536) != 0 ? value.show_grid_vertical_lines : false, ((-80) & 131072) != 0 ? value.snap_crosshair_to_price_enabled : false, ((-80) & 262144) != 0 ? value.zoom : null, ((-80) & 524288) != 0 ? value.snap_crosshair_to_price : null, ((-80) & 1048576) != 0 ? value.show_high_low_price : false, ((-80) & 2097152) != 0 ? value.show_legend : false, ((-80) & 4194304) != 0 ? value.show_legend_ohlcv : false, ((-80) & 8388608) != 0 ? value.show_legend_indicators : false, ((-80) & 16777216) != 0 ? value.show_extended_hours : false, ((-80) & 33554432) != 0 ? value.show_trading_session_highlights : false, ((-80) & 67108864) != 0 ? value.show_volume_enabled : false, ((-80) & 134217728) != 0 ? value.show_volume : null, ((-80) & 268435456) != 0 ? value.trade_from_chart : false, ((-80) & 536870912) != 0 ? value.trade_from_chart_current_price : false, ((-80) & 1073741824) != 0 ? value.trade_from_chart_top_left : false, ((-80) & Integer.MIN_VALUE) != 0 ? value.show_open_orders : false, (8358783 & 1) != 0 ? value.show_open_market_orders : false, (8358783 & 2) != 0 ? value.show_open_limit_orders : false, (8358783 & 4) != 0 ? value.show_open_stop_market_orders : false, (8358783 & 8) != 0 ? value.show_open_stop_limit_orders : false, (8358783 & 16) != 0 ? value.show_open_trailing_stop_orders : false, (8358783 & 32) != 0 ? value.show_open_positions_enabled : false, (8358783 & 64) != 0 ? value.show_open_positions : null, (8358783 & 128) != 0 ? value.asset_comparison_settings : assetComparisonSettingsRedact, (8358783 & 256) != 0 ? value.show_indicator_name : false, (8358783 & 512) != 0 ? value.show_symbol_ticker_markers : false, (8358783 & 1024) != 0 ? value.last_used_drawing_types : lastUsedDrawingTypesRedact, (8358783 & 2048) != 0 ? value.drawing_sync_enabled : false, (8358783 & 4096) != 0 ? value.top_display_settings : chartWidgetTypeTopDisplaySettingsRedact, (8358783 & 8192) != 0 ? value.show_symbol_extended_hours_line_markers : boolRedact, (8358783 & 16384) != 0 ? value.show_symbol_extended_hours_ribbon_markers : boolRedact2, (8358783 & 32768) != 0 ? value.auto_send_trading_enabled : false, (8358783 & 65536) != 0 ? value.equity_time_in_force_long_order : null, (8358783 & 131072) != 0 ? value.equity_trading_session_long_order : null, (8358783 & 262144) != 0 ? value.equity_time_in_force_short_order : null, (8358783 & 524288) != 0 ? value.equity_trading_session_short_order : null, (8358783 & 1048576) != 0 ? value.futures_time_in_force : null, (8358783 & 2097152) != 0 ? value.crypto_time_in_force : null, (8358783 & 4194304) != 0 ? value.crypto_amount_type : null, (8358783 & 8388608) != 0 ? value.chart_custom_color_settings : chart_custom_color_settings != null ? ChartCustomColorSettings.ADAPTER.redact(chart_custom_color_settings) : null, (8358783 & 16777216) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
