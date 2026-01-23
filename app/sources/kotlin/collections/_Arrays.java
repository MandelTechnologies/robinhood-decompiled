package kotlin.collections;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import io.jsonwebtoken.Header;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator2;
import kotlin.jvm.internal.ArrayIterators7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
@Metadata(m3635d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a/\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0005\u0010\f\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u000f\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0012\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0014\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u0018\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u0018\u0010\u001a\u001a\u0011\u0010\u0018\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u0018\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u000e*\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\r2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010#\u001a\u001b\u0010!\u001a\u0004\u0018\u00010\u0016*\u00020\u00152\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010$\u001a,\u0010%\u001a\u00020\u000e\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b%\u0010'\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b%\u0010(\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b%\u0010)\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b%\u0010*\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b%\u0010+\u001a\u0019\u0010%\u001a\u00020\u000e*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b%\u0010,\u001a\u001f\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b-\u0010\u0019\u001a\u0011\u0010-\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b-\u0010\u001d\u001a,\u0010.\u001a\u00020\u000e\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b.\u0010&\u001a\u0019\u0010.\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b.\u0010'\u001a\u0019\u0010.\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b.\u0010(\u001a\u0019\u0010.\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b.\u0010)\u001a\u0019\u0010.\u001a\u00020\u000e*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b.\u0010*\u001a\u0019\u0010.\u001a\u00020\u000e*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b.\u0010+\u001a\u0019\u0010.\u001a\u00020\u000e*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b.\u0010,\u001a!\u0010/\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b/\u0010\u0019\u001a\u001f\u00100\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b0\u0010\u0019\u001a\u0011\u00100\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b0\u0010\u001a\u001a\u0011\u00100\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b0\u00101\u001a!\u00102\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b2\u0010\u0019\u001a-\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u00103\u001a\u00020\u000e¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u001604*\u00020\u00152\u0006\u00103\u001a\u00020\u000e¢\u0006\u0004\b7\u00108\u001a+\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000004\"\b\b\u0000\u0010\u0001*\u000209*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b:\u0010;\u001a?\u0010?\u001a\u00028\u0000\"\u0010\b\u0000\u0010=*\n\u0012\u0006\b\u0000\u0012\u00028\u00010<\"\b\b\u0001\u0010\u0001*\u000209*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00022\u0006\u0010>\u001a\u00028\u0000¢\u0006\u0004\b?\u0010@\u001a\u0019\u0010C\u001a\u00020\u0007*\u00020\u00072\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010D\u001a\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001604*\u00020\u00152\u0006\u00103\u001a\u00020\u000e¢\u0006\u0004\bE\u00108\u001a-\u0010F\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u00103\u001a\u00020\u000e¢\u0006\u0004\bF\u00106\u001a\u001d\u0010H\u001a\u00020G\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bH\u0010I\u001a%\u0010J\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\bJ\u0010;\u001aC\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u001a\u0010M\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Kj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`L¢\u0006\u0004\bN\u0010O\u001aA\u0010P\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u001a\u0010M\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Kj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`L¢\u0006\u0004\bP\u0010Q\u001a9\u0010R\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0010\b\u0001\u0010=*\n\u0012\u0006\b\u0000\u0012\u00028\u00000<*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010>\u001a\u00028\u0001¢\u0006\u0004\bR\u0010@\u001a%\u0010S\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\bS\u0010;\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\b04*\u00020\u0007¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b04*\u00020\n¢\u0006\u0004\bS\u0010U\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000e04*\u00020\r¢\u0006\u0004\bS\u0010V\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001104*\u00020\u0010¢\u0006\u0004\bS\u0010W\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001c04*\u00020\u001b¢\u0006\u0004\bS\u0010X\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020Z04*\u00020Y¢\u0006\u0004\bS\u0010[\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000404*\u00020\u0013¢\u0006\u0004\bS\u0010\\\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001604*\u00020\u0015¢\u0006\u0004\bS\u0010]\u001a%\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b_\u0010;\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\b0^*\u00020\u0007¢\u0006\u0004\b_\u0010T\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000b0^*\u00020\n¢\u0006\u0004\b_\u0010U\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000e0^*\u00020\r¢\u0006\u0004\b_\u0010V\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110^*\u00020\u0010¢\u0006\u0004\b_\u0010W\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001c0^*\u00020\u001b¢\u0006\u0004\b_\u0010X\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020Z0^*\u00020Y¢\u0006\u0004\b_\u0010[\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040^*\u00020\u0013¢\u0006\u0004\b_\u0010\\\u001a\u0017\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00160^*\u00020\u0015¢\u0006\u0004\b_\u0010]\u001a%\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000`\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\ba\u0010b\u001a+\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000d0c\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\be\u0010f\u001a\u0013\u0010h\u001a\u00020\u000e*\u00020\rH\u0007¢\u0006\u0004\bg\u0010\u001a\u001a\u0015\u0010i\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0007¢\u0006\u0004\bi\u0010\u001f\u001a\u0015\u0010i\u001a\u0004\u0018\u00010\u001c*\u00020\u001bH\u0007¢\u0006\u0004\bi\u0010j\u001a\u0013\u0010l\u001a\u00020\u000e*\u00020\rH\u0007¢\u0006\u0004\bk\u0010\u001a\u001a\u0015\u0010m\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0007¢\u0006\u0004\bm\u0010\u001f\u001a\u0015\u0010m\u001a\u0004\u0018\u00010\u001c*\u00020\u001bH\u0007¢\u0006\u0004\bm\u0010j\u001aJ\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010p04\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010n*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010o\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0002H\u0086\u0004¢\u0006\u0004\bq\u0010r\u001aH\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010p04\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010n*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\f\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00010cH\u0086\u0004¢\u0006\u0004\bq\u0010s\u001a.\u0010q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0p04*\u00020\r2\u0006\u0010o\u001a\u00020\rH\u0086\u0004¢\u0006\u0004\bq\u0010t\u001a\u0083\u0001\u0010\u0081\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\f\b\u0001\u0010w*\u00060uj\u0002`v*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010x\u001a\u00028\u00012\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020\u00072\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020\n2\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0084\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020\r2\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0085\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020\u00102\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0086\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020\u001b2\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0087\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020Y2\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0088\u0001\u001au\u0010\u0081\u0001\u001a\u00028\u0000\"\f\b\u0000\u0010w*\u00060uj\u0002`v*\u00020\u00152\u0006\u0010x\u001a\u00028\u00002\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0089\u0001\u001an\u0010\u008b\u0001\u001a\u00030\u008a\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020\u00072\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u008d\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020\n2\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u008e\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020\r2\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u008f\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020\u00102\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u0090\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020\u001b2\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u0091\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020Y2\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u0092\u0001\u001a`\u0010\u008b\u0001\u001a\u00030\u008a\u0001*\u00020\u00152\b\b\u0002\u0010z\u001a\u00020y2\b\b\u0002\u0010{\u001a\u00020y2\b\b\u0002\u0010|\u001a\u00020y2\b\b\u0002\u0010}\u001a\u00020\u000e2\b\b\u0002\u0010~\u001a\u00020y2\u0017\b\u0002\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020y\u0018\u00010\u007f¢\u0006\u0006\b\u008b\u0001\u0010\u0093\u0001\u001a'\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0005\b\u0094\u0001\u0010f\u001a)\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u001b\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0095\u0001*\u00020\u0015¢\u0006\u0006\b\u0096\u0001\u0010\u0098\u0001\u001a\u0013\u0010\u0099\u0001\u001a\u00020\u000e*\u00020\r¢\u0006\u0005\b\u0099\u0001\u0010\u001a\"%\u0010B\u001a\u00020A\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00028F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010B\u001a\u00020A*\u00020\r8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009c\u0001\"\u0017\u0010B\u001a\u00020A*\u00020\u001b8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009d\u0001\"&\u0010 \u0001\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00028F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0017\u0010 \u0001\u001a\u00020\u000e*\u00020\r8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\u001a\"\u0018\u0010 \u0001\u001a\u00020\u000e*\u00020\u00108F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010¡\u0001\"\u0018\u0010 \u0001\u001a\u00020\u000e*\u00020\u001b8F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010¢\u0001¨\u0006£\u0001"}, m3636d2 = {"Lkotlin/internal/OnlyInputTypes;", "T", "", "element", "", "contains", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "([BB)Z", "", "", "([SS)Z", "", "", "([II)Z", "", "", "([JJ)Z", "", "([ZZ)Z", "", "", "([CC)Z", "first", "([Ljava/lang/Object;)Ljava/lang/Object;", "([I)I", "", "", "([F)F", "firstOrNull", "([I)Ljava/lang/Integer;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getOrNull", "([Ljava/lang/Object;I)Ljava/lang/Object;", "([II)Ljava/lang/Integer;", "([CI)Ljava/lang/Character;", "indexOf", "([Ljava/lang/Object;Ljava/lang/Object;)I", "([BB)I", "([SS)I", "([II)I", "([JJ)I", "([ZZ)I", "([CC)I", "last", "lastIndexOf", "lastOrNull", "single", "([C)C", "singleOrNull", Constants.RequestParamsKeys.APP_NAME_KEY, "", "drop", "([Ljava/lang/Object;I)Ljava/util/List;", "dropLast", "([CI)Ljava/util/List;", "", "filterNotNull", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "filterNotNullTo", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "sliceArray", "([BLkotlin/ranges/IntRange;)[B", "take", "takeLast", "", "reverse", "([Ljava/lang/Object;)V", "reversed", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortedArrayWith", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "sortedWith", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "toCollection", "toList", "([B)Ljava/util/List;", "([S)Ljava/util/List;", "([I)Ljava/util/List;", "([J)Ljava/util/List;", "([F)Ljava/util/List;", "", "", "([D)Ljava/util/List;", "([Z)Ljava/util/List;", "([C)Ljava/util/List;", "", "toMutableList", "", "toSet", "([Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/collections/IndexedValue;", "withIndex", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "maxOrThrow", AnalyticsStrings.MAX_WELCOME_TAG, "maxOrNull", "([F)Ljava/lang/Float;", "minOrThrow", "min", "minOrNull", "R", "other", "Lkotlin/Pair;", Header.COMPRESSION_ALGORITHM, "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "([I[I)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "joinTo", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([SLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([ILjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([JLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([FLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([DLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([CLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "joinToString", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([SLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([JLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([FLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([DLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "([CLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "asIterable", "Lkotlin/sequences/Sequence;", "asSequence", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "([C)Lkotlin/sequences/Sequence;", "sum", "getIndices", "([Ljava/lang/Object;)Lkotlin/ranges/IntRange;", "([I)Lkotlin/ranges/IntRange;", "([F)Lkotlin/ranges/IntRange;", "getLastIndex", "([Ljava/lang/Object;)I", "lastIndex", "([J)I", "([F)I", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* renamed from: kotlin.collections.ArraysKt___ArraysKt, reason: use source file name */
/* loaded from: classes21.dex */
public class _Arrays extends _ArraysJvm {
    public static <T> boolean contains(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return indexOf(tArr, t) >= 0;
    }

    public static boolean contains(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return indexOf(bArr, b) >= 0;
    }

    public static boolean contains(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return indexOf(sArr, s) >= 0;
    }

    public static boolean contains(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return indexOf(iArr, i) >= 0;
    }

    public static boolean contains(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return indexOf(jArr, j) >= 0;
    }

    public static final boolean contains(boolean[] zArr, boolean z) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return indexOf(zArr, z) >= 0;
    }

    public static boolean contains(char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return indexOf(cArr, c) >= 0;
    }

    public static <T> T first(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static int first(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[0];
    }

    public static float first(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[0];
    }

    public static <T> T firstOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static Integer firstOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[0]);
    }

    public static <T> T getOrNull(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static Integer getOrNull(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Character getOrNull(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i < 0 || i >= cArr.length) {
            return null;
        }
        return Character.valueOf(cArr[i]);
    }

    public static <T> int indexOf(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (Intrinsics.areEqual(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int indexOf(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int indexOf(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOf(boolean[] zArr, boolean z) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (z == zArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOf(char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T last(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[getLastIndex(tArr)];
    }

    public static float last(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return fArr[getLastIndex(fArr)];
    }

    public static <T> int lastIndexOf(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (Intrinsics.areEqual(t, tArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (b == bArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (s == sArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    public static int lastIndexOf(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (j == jArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int lastIndexOf(boolean[] zArr, boolean z) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (z == zArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static final int lastIndexOf(char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (c == cArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    public static <T> T lastOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static <T> T single(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static int single(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return iArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static char single(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T singleOrNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static <T> List<T> drop(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        return takeLast(tArr, RangesKt.coerceAtLeast(tArr.length - i, 0));
    }

    public static List<Character> dropLast(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        return take(cArr, RangesKt.coerceAtLeast(cArr.length - i, 0));
    }

    public static <T> List<T> filterNotNull(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) filterNotNullTo(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : tArr) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    public static byte[] sliceArray(byte[] bArr, PrimitiveRanges2 indices) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? new byte[0] : _ArraysJvm.copyOfRange(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static List<Character> take(char[] cArr, int i) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (i >= cArr.length) {
            return toList(cArr);
        }
        if (i == 1) {
            return CollectionsJVM.listOf(Character.valueOf(cArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLast(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int length = tArr.length;
        if (i >= length) {
            return toList(tArr);
        }
        if (i == 1) {
            return CollectionsJVM.listOf(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(tArr[i2]);
        }
        return arrayList;
    }

    public static <T> void reverse(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int lastIndex = getLastIndex(tArr);
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            T t = tArr[i];
            tArr[i] = tArr[lastIndex];
            tArr[lastIndex] = t;
            lastIndex--;
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static <T> List<T> reversed(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> mutableList = toMutableList(tArr);
        _CollectionsJvm.reverse(mutableList);
        return mutableList;
    }

    public static final <T> T[] sortedArrayWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        _ArraysJvm.sortWith(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> sortedWith(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return _ArraysJvm.asList(sortedArrayWith(tArr, comparator));
    }

    public static <T> PrimitiveRanges2 getIndices(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new PrimitiveRanges2(0, getLastIndex(tArr));
    }

    public static PrimitiveRanges2 getIndices(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new PrimitiveRanges2(0, getLastIndex(iArr));
    }

    public static PrimitiveRanges2 getIndices(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new PrimitiveRanges2(0, getLastIndex(fArr));
    }

    public static <T> int getLastIndex(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    public static int getLastIndex(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int getLastIndex(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int getLastIndex(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length - 1;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : tArr) {
            destination.add(t);
        }
        return destination;
    }

    public static <T> List<T> toList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(tArr[0]);
        }
        return toMutableList(tArr);
    }

    public static List<Byte> toList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Byte.valueOf(bArr[0]));
        }
        return toMutableList(bArr);
    }

    public static List<Short> toList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Short.valueOf(sArr[0]));
        }
        return toMutableList(sArr);
    }

    public static List<Integer> toList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Integer.valueOf(iArr[0]));
        }
        return toMutableList(iArr);
    }

    public static List<Long> toList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Long.valueOf(jArr[0]));
        }
        return toMutableList(jArr);
    }

    public static List<Float> toList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Float.valueOf(fArr[0]));
        }
        return toMutableList(fArr);
    }

    public static List<Double> toList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Double.valueOf(dArr[0]));
        }
        return toMutableList(dArr);
    }

    public static List<Boolean> toList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Boolean.valueOf(zArr[0]));
        }
        return toMutableList(zArr);
    }

    public static List<Character> toList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (length == 1) {
            return CollectionsJVM.listOf(Character.valueOf(cArr[0]));
        }
        return toMutableList(cArr);
    }

    public static <T> List<T> toMutableList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(CollectionsKt__CollectionsKt.asCollection(tArr));
    }

    public static final List<Byte> toMutableList(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static final List<Short> toMutableList(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static List<Integer> toMutableList(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final List<Long> toMutableList(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final List<Float> toMutableList(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final List<Double> toMutableList(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static final List<Boolean> toMutableList(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static final List<Character> toMutableList(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    public static <T> Set<T> toSet(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return Sets4.emptySet();
        }
        if (length == 1) {
            return SetsJVM.setOf(tArr[0]);
        }
        return (Set) toCollection(tArr, new LinkedHashSet(MapsJVM.mapCapacity(tArr.length)));
    }

    public static <T> Iterable<IndexedValue<T>> withIndex(final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.ArraysKt___ArraysKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ArrayIterator2.iterator(tArr);
            }
        });
    }

    @SinceKotlin
    @JvmName
    public static int maxOrThrow(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @SinceKotlin
    public static Integer maxOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @SinceKotlin
    public static Float maxOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fMax);
    }

    @SinceKotlin
    @JvmName
    public static int minOrThrow(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    @SinceKotlin
    public static Integer minOrNull(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int lastIndex = getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return Integer.valueOf(i);
    }

    @SinceKotlin
    public static Float minOrNull(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int lastIndex = getLastIndex(fArr);
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Float.valueOf(fMin);
    }

    public static <T, R> List<Tuples2<T, R>> zip(T[] tArr, R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(Tuples4.m3642to(tArr[i], other[i]));
        }
        return arrayList;
    }

    public static <T, R> List<Tuples2<T, R>> zip(T[] tArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10), length));
        int i = 0;
        for (R r : other) {
            if (i >= length) {
                break;
            }
            arrayList.add(Tuples4.m3642to(tArr[i], r));
            i++;
        }
        return arrayList;
    }

    public static List<Tuples2<Integer, Integer>> zip(int[] iArr, int[] other) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(Tuples4.m3642to(Integer.valueOf(iArr[i]), Integer.valueOf(other[i])));
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A joinTo(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : tArr) {
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

    public static final <A extends Appendable> A joinTo(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b)));
            } else {
                buffer.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(short[] sArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Short, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (short s : sArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Short.valueOf(s)));
            } else {
                buffer.append(String.valueOf((int) s));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Integer.valueOf(i3)));
            } else {
                buffer.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(long[] jArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Long, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Long.valueOf(j)));
            } else {
                buffer.append(String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Float, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Float.valueOf(f)));
            } else {
                buffer.append(String.valueOf(f));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(double[] dArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Double, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (double d : dArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Double.valueOf(d)));
            } else {
                buffer.append(String.valueOf(d));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A joinTo(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Character.valueOf(c)));
            } else {
                buffer.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ String joinToString$default(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(objArr, charSequence, charSequence2, charSequence3, i, charSequence5, function12);
    }

    public static final <T> String joinToString(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(tArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(bArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Byte, ? extends CharSequence>) function12);
    }

    public static final String joinToString(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(bArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(sArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Short, ? extends CharSequence>) function12);
    }

    public static final String joinToString(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Short, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(sArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(iArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Integer, ? extends CharSequence>) function12);
    }

    public static final String joinToString(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(iArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(jArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Long, ? extends CharSequence>) function12);
    }

    public static final String joinToString(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Long, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(jArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(fArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Float, ? extends CharSequence>) function12);
    }

    public static final String joinToString(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Float, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(fArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(dArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Double, ? extends CharSequence>) function12);
    }

    public static final String joinToString(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Double, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(dArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static /* synthetic */ String joinToString$default(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return joinToString(cArr, charSequence, charSequence2, charSequence3, i, charSequence5, (Function1<? super Character, ? extends CharSequence>) function12);
    }

    public static final String joinToString(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(cArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static <T> Iterable<T> asIterable(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? CollectionsKt__CollectionsKt.emptyList() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    public static <T> Sequence<T> asSequence(final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator */
            public Iterator<T> iterator2() {
                return ArrayIterator2.iterator(tArr);
            }
        };
    }

    public static Sequence<Character> asSequence(final char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length == 0 ? SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$9
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator */
            public Iterator<Character> iterator2() {
                return ArrayIterators7.iterator(cArr);
            }
        };
    }

    public static int sum(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
