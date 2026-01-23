package kotlin.collections;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import io.jsonwebtoken.Header;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Collections.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\u001a-\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u000f\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0012\u001a'\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a*\u0010\u0016\u001a\u00020\u0007\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u0016\u001a\u00020\u0007\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u0010\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0019\u0010\u0012\u001a*\u0010\u001a\u001a\u00020\u0007\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001b\u0010\u0010\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001b\u0010\u0012\u001a'\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b \u0010\u0010\u001a\u001d\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b \u0010\u0012\u001a\u001f\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b!\u0010\u0010\u001a\u001f\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b!\u0010\u0012\u001a+\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$\u001a+\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&\u001a=\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a)\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0001*\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b+\u0010,\u001a=\u00100\u001a\u00028\u0000\"\u0010\b\u0000\u0010.*\n\u0012\u0006\b\u0000\u0012\u00028\u00010-\"\b\b\u0001\u0010\u0001*\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00022\u0006\u0010/\u001a\u00028\u0000¢\u0006\u0004\b0\u00101\u001a+\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105\u001a+\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b6\u0010$\u001a+\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b7\u0010&\u001a#\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b8\u0010,\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b:\u0010,\u001a-\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b;\u0010,\u001a?\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010>\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000<j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`=¢\u0006\u0004\b?\u0010@\u001a\u0017\u0010B\u001a\u00020A*\b\u0012\u0004\u0012\u00020\u00040\u001c¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020D0\u001c¢\u0006\u0004\bF\u0010G\u001a\u0017\u0010J\u001a\u00020I*\b\u0012\u0004\u0012\u00020H0\u001c¢\u0006\u0004\bJ\u0010K\u001a\u0017\u0010N\u001a\u00020M*\b\u0012\u0004\u0012\u00020L0\u001c¢\u0006\u0004\bN\u0010O\u001a\u0017\u0010Q\u001a\u00020P*\b\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010U\u001a\u00020T*\b\u0012\u0004\u0012\u00020S0\u001c¢\u0006\u0004\bU\u0010V\u001a7\u0010W\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0010\b\u0001\u0010.*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010/\u001a\u00028\u0001¢\u0006\u0004\bW\u00101\u001a-\u0010Z\u001a\u0012\u0012\u0004\u0012\u00028\u00000Xj\b\u0012\u0004\u0012\u00028\u0000`Y\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bZ\u0010[\u001a#\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\\\u0010,\u001a#\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b^\u0010,\u001a#\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b^\u0010_\u001a#\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\ba\u0010b\u001aC\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010c*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\be\u0010)\u001a)\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000f0\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bg\u0010h\u001a#\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bi\u0010,\u001a4\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004¢\u0006\u0004\bk\u0010l\u001a4\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004¢\u0006\u0004\bm\u0010l\u001a#\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bo\u0010b\u001a4\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004¢\u0006\u0004\bp\u0010l\u001a7\u0010q\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bq\u0010r\u001a\u001d\u0010s\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bs\u0010t\u001a\u001d\u0010u\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bu\u0010v\u001a)\u0010y\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\bw\u0010x\u001a\u001b\u0010{\u001a\u0004\u0018\u00010z*\b\u0012\u0004\u0012\u00020z0\u0002H\u0007¢\u0006\u0004\b{\u0010|\u001a\u001b\u0010{\u001a\u0004\u0018\u00010L*\b\u0012\u0004\u0012\u00020L0\u0002H\u0007¢\u0006\u0004\b{\u0010}\u001a+\u0010{\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b{\u0010x\u001a=\u0010~\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010>\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000<j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`=H\u0007¢\u0006\u0004\b~\u0010\u007f\u001a+\u0010\u0081\u0001\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0005\b\u0080\u0001\u0010x\u001a\u001d\u0010\u0082\u0001\u001a\u0004\u0018\u00010z*\b\u0012\u0004\u0012\u00020z0\u0002H\u0007¢\u0006\u0005\b\u0082\u0001\u0010|\u001a\u001d\u0010\u0082\u0001\u001a\u0004\u0018\u00010L*\b\u0012\u0004\u0012\u00020L0\u0002H\u0007¢\u0006\u0005\b\u0082\u0001\u0010}\u001a-\u0010\u0082\u0001\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0005\b\u0082\u0001\u0010x\u001a6\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0005\b\u0084\u0001\u0010$\u001aQ\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010c*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u00072\u0018\u0010d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u00010\u000bH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a1\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a8\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0089\u0001\u001a1\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a1\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a8\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001\u001a8\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001c2\r\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001\u001a9\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u001c2\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008d\u0001H\u0086\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008e\u0001\u001aM\u0010\u0091\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001ag\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010c*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u0083\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00042\u0018\u0010d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u00010\u000bH\u0007¢\u0006\u0006\b\u0091\u0001\u0010\u0093\u0001\u001aJ\u0010\u0095\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0094\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010c*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0004¢\u0006\u0006\b\u0095\u0001\u0010\u0089\u0001\u001a4\u0010\u0096\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0094\u00010\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0005\b\u0096\u0001\u0010,\u001a\u008e\u0001\u0010¡\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u000f\b\u0001\u0010\u0099\u0001*\b0\u0097\u0001j\u0003`\u0098\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u009a\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u009b\u00012\n\b\u0002\u0010\u009d\u0001\u001a\u00030\u009b\u00012\n\b\u0002\u0010\u009e\u0001\u001a\u00030\u009b\u00012\t\b\u0002\u0010\u009f\u0001\u001a\u00020\u00072\n\b\u0002\u0010 \u0001\u001a\u00030\u009b\u00012\u0017\b\u0002\u0010d\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009b\u0001\u0018\u00010\u000b¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001au\u0010¤\u0001\u001a\u00030£\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u009b\u00012\n\b\u0002\u0010\u009d\u0001\u001a\u00030\u009b\u00012\n\b\u0002\u0010\u009e\u0001\u001a\u00030\u009b\u00012\t\b\u0002\u0010\u009f\u0001\u001a\u00020\u00072\n\b\u0002\u0010 \u0001\u001a\u00030\u009b\u00012\u0017\b\u0002\u0010d\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009b\u0001\u0018\u00010\u000b¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a'\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008d\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a\u001b\u0010©\u0001\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0005\b¨\u0001\u0010v\u001a\u001c\u0010©\u0001\u001a\u00020S*\b\u0012\u0004\u0012\u00020S0\u0002H\u0007¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a\u001c\u0010©\u0001\u001a\u00020L*\b\u0012\u0004\u0012\u00020L0\u0002H\u0007¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u001c\u0010©\u0001\u001a\u00020z*\b\u0012\u0004\u0012\u00020z0\u0002H\u0007¢\u0006\u0006\b®\u0001\u0010¯\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006°\u0001"}, m3636d2 = {"Lkotlin/internal/OnlyInputTypes;", "T", "", "element", "", "contains", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "elementAt", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "elementAtOrElse", "(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "first", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "(Ljava/util/List;)Ljava/lang/Object;", "firstOrNull", "getOrNull", "(Ljava/util/List;I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "(Ljava/util/List;Ljava/lang/Object;)I", "last", "lastIndexOf", "lastOrNull", "", "Lkotlin/random/Random;", "random", "(Ljava/util/Collection;Lkotlin/random/Random;)Ljava/lang/Object;", "single", "singleOrNull", Constants.RequestParamsKeys.APP_NAME_KEY, "drop", "(Ljava/lang/Iterable;I)Ljava/util/List;", "dropLast", "(Ljava/util/List;I)Ljava/util/List;", "predicate", "filter", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "filterNotNull", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "filterNotNullTo", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "slice", "(Ljava/util/List;Lkotlin/ranges/IntRange;)Ljava/util/List;", "take", "takeLast", "reversed", "", "sorted", "sortedDescending", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortedWith", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "toBooleanArray", "(Ljava/util/Collection;)[Z", "", "", "toByteArray", "(Ljava/util/Collection;)[B", "", "", "toCharArray", "(Ljava/util/Collection;)[C", "", "", "toFloatArray", "(Ljava/util/Collection;)[F", "", "toIntArray", "(Ljava/util/Collection;)[I", "", "", "toLongArray", "(Ljava/util/Collection;)[J", "toCollection", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "toHashSet", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "toList", "", "toMutableList", "(Ljava/util/Collection;)Ljava/util/List;", "", "toSet", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "map", "Lkotlin/collections/IndexedValue;", "withIndex", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "distinct", "other", "intersect", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "subtract", "", "toMutableSet", "union", ApiRenderablePlatforms.VERSIONS_ALL, "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "any", "(Ljava/lang/Iterable;)Z", "count", "(Ljava/lang/Iterable;)I", "maxOrThrow", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", AnalyticsStrings.MAX_WELCOME_TAG, "", "maxOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "maxWithOrNull", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "minOrThrow", "min", "minOrNull", "size", "chunked", "(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "minus", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "plus", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "Lkotlin/sequences/Sequence;", "(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Ljava/util/List;", "step", "partialWindows", "windowed", "(Ljava/lang/Iterable;IIZ)Ljava/util/List;", "(Ljava/lang/Iterable;IIZLkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlin/Pair;", Header.COMPRESSION_ALGORITHM, "zipWithNext", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "joinTo", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "joinToString", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "asSequence", "(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "sumOfInt", "sum", "sumOfLong", "(Ljava/lang/Iterable;)J", "sumOfFloat", "(Ljava/lang/Iterable;)F", "sumOfDouble", "(Ljava/lang/Iterable;)D", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
/* renamed from: kotlin.collections.CollectionsKt___CollectionsKt, reason: use source file name */
/* loaded from: classes21.dex */
public class _Collections3 extends _CollectionsJvm {
    public static <T> boolean contains(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return indexOf(iterable, t) >= 0;
    }

    public static <T> T elementAt(Iterable<? extends T> iterable, final int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) elementAtOrElse(iterable, i, new Function1() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return _Collections3.elementAt$lambda$0$CollectionsKt___CollectionsKt(i, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object elementAt$lambda$0$CollectionsKt___CollectionsKt(int i, int i2) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i >= list.size()) ? defaultValue.invoke(Integer.valueOf(i)) : (T) list.get(i);
        }
        if (i < 0) {
            return defaultValue.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return defaultValue.invoke(Integer.valueOf(i));
    }

    public static <T> T first(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return it.next();
    }

    public static <T> T first(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T firstOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T getOrNull(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> int indexOf(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> int indexOf(List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t);
    }

    public static <T> T last(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T last(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    public static <T> int lastIndexOf(List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t);
    }

    public static <T> T lastOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T lastOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @SinceKotlin
    public static <T> T random(Collection<? extends T> collection, Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static <T> T single(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T single(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T singleOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T singleOrNull(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> drop(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (size == 1) {
                return CollectionsJVM.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> dropLast(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        return take(list, RangesKt.coerceAtLeast(list.size() - i, 0));
    }

    public static <T> List<T> filter(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (predicate.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : iterable) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    public static <T> List<T> slice(List<? extends T> list, PrimitiveRanges2 indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static <T> List<T> take(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i == 1) {
                return CollectionsJVM.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> takeLast(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int size = list.size();
        if (i >= size) {
            return toList(list);
        }
        if (i == 1) {
            return CollectionsJVM.listOf(last((List) list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static <T> List<T> reversed(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        _CollectionsJvm.reverse(mutableList);
        return mutableList;
    }

    public static <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return toList(iterable);
            }
            Object[] array2 = collection.toArray(new Comparable[0]);
            _ArraysJvm.sort((Comparable[]) array2);
            return _ArraysJvm.asList(array2);
        }
        List<T> mutableList = toMutableList(iterable);
        MutableCollectionsJVM.sort(mutableList);
        return mutableList;
    }

    public static <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return sortedWith(iterable, ComparisonsKt.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return toList(iterable);
            }
            Object[] array2 = collection.toArray(new Object[0]);
            _ArraysJvm.sortWith(array2, comparator);
            return _ArraysJvm.asList(array2);
        }
        List<T> mutableList = toMutableList(iterable);
        MutableCollectionsJVM.sortWith(mutableList, comparator);
        return mutableList;
    }

    public static boolean[] toBooleanArray(Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] toByteArray(Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static char[] toCharArray(Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = it.next().charValue();
            i++;
        }
        return cArr;
    }

    public static float[] toFloatArray(Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] toIntArray(Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static long[] toLongArray(Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) toCollection(iterable, new HashSet(MapsJVM.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 12))));
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (size != 1) {
                return toMutableList(collection);
            }
            return CollectionsJVM.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(iterable));
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return toMutableList((Collection) iterable);
        }
        return (List) toCollection(iterable, new ArrayList());
    }

    public static <T> List<T> toMutableList(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return Sets4.emptySet();
            }
            if (size != 1) {
                return (Set) toCollection(iterable, new LinkedHashSet(MapsJVM.mapCapacity(collection.size())));
            }
            return SetsJVM.setOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return Sets4.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
    }

    public static <T, R> List<R> map(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static <T> Iterable<IndexedValue<T>> withIndex(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    public static <T> List<T> distinct(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return toList(toMutableSet(iterable));
    }

    public static <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        MutableCollections.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        MutableCollections.removeAll(mutableSet, other);
        return mutableSet;
    }

    public static <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        MutableCollections.addAll(mutableSet, other);
        return mutableSet;
    }

    public static <T> boolean all(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> int count(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    @SinceKotlin
    @JvmName
    public static <T extends Comparable<? super T>> T maxOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin
    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static Double m28651maxOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin
    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static Float m28652maxOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin
    public static <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    @SinceKotlin
    @JvmName
    public static <T extends Comparable<? super T>> T minOrThrow(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin
    /* renamed from: minOrNull, reason: collision with other method in class */
    public static Double m28653minOrNull(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @SinceKotlin
    /* renamed from: minOrNull, reason: collision with other method in class */
    public static Float m28654minOrNull(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin
    public static <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i, i, true);
    }

    @SinceKotlin
    public static <T, R> List<R> chunked(Iterable<? extends T> iterable, int i, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return windowed(iterable, i, i, true, transform);
    }

    public static <T> List<T> minus(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static <T> List<T> minus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collectionConvertToListIfNotCollection = MutableCollections.convertToListIfNotCollection(elements);
        if (!collectionConvertToListIfNotCollection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (T t : iterable) {
                if (!collectionConvertToListIfNotCollection.contains(t)) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
        return toList(iterable);
    }

    public static <T> List<T> plus(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object) t);
        }
        ArrayList arrayList = new ArrayList();
        MutableCollections.addAll(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> plus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Iterable) elements);
        }
        ArrayList arrayList = new ArrayList();
        MutableCollections.addAll(arrayList, iterable);
        MutableCollections.addAll(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        MutableCollections.addAll(arrayList2, elements);
        return arrayList2;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        MutableCollections.addAll(arrayList, elements);
        return arrayList;
    }

    @SinceKotlin
    public static <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        SlidingWindow3.checkWindowSizeStep(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            int i3 = 0;
            while (i3 >= 0 && i3 < size) {
                int iCoerceAtMost = RangesKt.coerceAtMost(i, size - i3);
                if (iCoerceAtMost < i && !z) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList(iCoerceAtMost);
                for (int i4 = 0; i4 < iCoerceAtMost; i4++) {
                    arrayList2.add(list.get(i4 + i3));
                }
                arrayList.add(arrayList2);
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator itWindowedIterator = SlidingWindow3.windowedIterator(iterable.iterator(), i, i2, z, false);
        while (itWindowedIterator.hasNext()) {
            arrayList3.add((List) itWindowedIterator.next());
        }
        return arrayList3;
    }

    @SinceKotlin
    public static final <T, R> List<R> windowed(Iterable<? extends T> iterable, int i, int i2, boolean z, Function1<? super List<? extends T>, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindow3.checkWindowSizeStep(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = 0;
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            SlidingWindow slidingWindow = new SlidingWindow(list);
            while (i3 >= 0 && i3 < size) {
                int iCoerceAtMost = RangesKt.coerceAtMost(i, size - i3);
                if (!z && iCoerceAtMost < i) {
                    return arrayList;
                }
                slidingWindow.move(i3, iCoerceAtMost + i3);
                arrayList.add(transform.invoke(slidingWindow));
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itWindowedIterator = SlidingWindow3.windowedIterator(iterable.iterator(), i, i2, z, true);
        while (itWindowedIterator.hasNext()) {
            arrayList2.add(transform.invoke((List) itWindowedIterator.next()));
        }
        return arrayList2;
    }

    public static <T, R> List<Tuples2<T, R>> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(Tuples4.m3642to(it.next(), it2.next()));
        }
        return arrayList;
    }

    @SinceKotlin
    public static <T> List<Tuples2<T, T>> zipWithNext(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(Tuples4.m3642to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            StringsKt.appendElement(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return joinToString(iterable, charSequence, charSequence2, charSequence3, i, charSequence5, function12);
    }

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static <T> Sequence<T> asSequence(final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new Sequence<T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator */
            public Iterator<T> iterator2() {
                return iterable.iterator();
            }
        };
    }

    @JvmName
    public static int sumOfInt(Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @JvmName
    public static long sumOfLong(Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @JvmName
    public static float sumOfFloat(Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @JvmName
    public static double sumOfDouble(Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }
}
