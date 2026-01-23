package com.robinhood.analytics;

import android.content.res.Configuration;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import com.adjust.sdk.Constants;
import com.plaid.internal.EnumC7081g;
import com.robinhood.Logger;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.api.TraderAnalyticsApi;
import com.robinhood.analytics.dao.SharedLegacyEventDao;
import com.robinhood.analytics.models.DebugAnalyticsLogger;
import com.robinhood.analytics.models.LegacyEvent;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.options.extensions.Analytics3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.ReferredCampaign;
import com.robinhood.rosetta.converters.platform.AppInfo2;
import com.robinhood.shared.legacy.models.AnalyticsRequest;
import com.robinhood.shared.legacy.models.AppAnalytics;
import com.robinhood.shared.legacy.models.DeviceAnalytics;
import com.robinhood.shared.legacy.models.EventAnalytics;
import com.robinhood.shared.legacy.models.UserAnalytics;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.http.MediaTypes;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.squareup.moshi.JsonAdapter;
import dispatch.core.Flow7;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import okhttp3.RequestBody;
import p479j$.time.Instant;
import p479j$.util.DateRetargetClass;
import p479j$.util.DesugarTimeZone;
import retrofit2.HttpException;
import timber.log.Timber;

/* compiled from: Analytics.kt */
@Metadata(m3635d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010$\n\u0002\b*\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u0000 å\u00012\u00020\u00012\u00020\u0002:\u0006æ\u0001å\u0001ç\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014Jg\u0010\u001f\u001a\u00060\u0015R\u00020\u0000*\u00060\u0015R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 Jc\u0010*\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u0014J\u001e\u00104\u001a\u00020\u00102\f\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0082@¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u000206*\b\u0012\u0004\u0012\u00020201H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00102\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b=\u0010<J#\u0010?\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010>\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b?\u0010@J#\u0010C\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010\t2\b\u0010B\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00102\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ{\u0010O\u001a\u00060\u0015R\u00020\u00002\u0006\u0010!\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010\t2\b\u0010K\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010L\u001a\u0004\u0018\u00010\t2\b\u0010M\u001a\u0004\u0018\u00010\t2\b\u0010N\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00060\u0015R\u00020\u00002\u0006\u0010I\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bQ\u0010RJ-\u0010S\u001a\u00060\u0015R\u00020\u00002\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bS\u0010TJ'\u0010U\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\bU\u0010VJK\u0010W\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bW\u0010XJK\u0010Y\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bY\u0010XJS\u0010Z\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bZ\u0010[J!\u0010\\\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\\\u0010@J3\u0010^\u001a\u00020\u00102\u0006\u0010]\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b^\u0010_J[\u0010`\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b`\u0010aJ[\u0010b\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bb\u0010aJ[\u0010c\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bc\u0010aJ[\u0010i\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010d\u001a\u00020\u001a2\b\u0010N\u001a\u0004\u0018\u00010\t2\b\u0010e\u001a\u0004\u0018\u00010\t2\b\u0010f\u001a\u0004\u0018\u00010\t2\b\u0010g\u001a\u0004\u0018\u00010\t2\b\u0010h\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bi\u0010jJ5\u0010o\u001a\u00020\u00102\b\u0010k\u001a\u0004\u0018\u00010\t2\u0006\u0010l\u001a\u00020\t2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0mH\u0016¢\u0006\u0004\bo\u0010pJc\u0010x\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010q\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\b\u0010r\u001a\u0004\u0018\u00010\t2\b\u0010s\u001a\u0004\u0018\u00010\t2\b\u0010t\u001a\u0004\u0018\u00010\t2\b\u0010u\u001a\u0004\u0018\u00010\t2\b\u0010v\u001a\u0004\u0018\u00010\t2\b\u0010w\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bx\u0010yJ\u001f\u0010z\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020-H\u0016¢\u0006\u0004\bz\u0010{J3\u0010~\u001a\u00020\u00102\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010-2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b~\u0010\u007fJ<\u0010\u0082\u0001\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\u0006\u0010N\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u00020\u001a2\u0007\u0010\u0081\u0001\u001a\u00020\u001aH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u009f\u0001\u0010\u0091\u0001\u001a\u00020\u00102\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t2\u0007\u0010\u008e\u0001\u001a\u00020\t2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J=\u0010\u0093\u0001\u001a\u00020\u00102\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0005\b\u0093\u0001\u0010_J\u0080\u0001\u0010\u0096\u0001\u001a\u00020\u00102\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JP\u0010\u009a\u0001\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\t2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00012\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\t2\u0007\u0010\u0090\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009d\u0001\u001a\u00020\u00102\u0007\u0010\u009c\u0001\u001a\u00020-H\u0016¢\u0006\u0005\b\u009d\u0001\u0010/J%\u0010\u009e\u0001\u001a\u00060\u0015R\u00020\u00002\u0006\u0010v\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0016¢\u0006\u0005\b\u009e\u0001\u0010RJ$\u0010¡\u0001\u001a\u00020\u00102\u0006\u0010F\u001a\u00020E2\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0014¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0014\u0010¤\u0001\u001a\u00030£\u0001H\u0096@¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u001d\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R\u001d\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\u000f\n\u0005\b\b\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001e\u0010°\u0001\u001a\t\u0012\u0004\u0012\u0002090¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010³\u0001\u001a\u00030²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0018\u0010¶\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R(\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030¼\u00010»\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001R'\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020E0»\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010¾\u0001\u001a\u0006\bÃ\u0001\u0010À\u0001R\u001e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010É\u0001\u001a\u00030È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ì\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R1\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0006@\u0006X\u0087.¢\u0006\u001f\n\u0006\bÒ\u0001\u0010Ó\u0001\u0012\u0005\bØ\u0001\u0010\u0014\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R+\u0010Ù\u0001\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010Þ\u0001R\u001b\u0010ß\u0001\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010Ú\u0001R\u001b\u0010à\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0017\u0010ä\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001¨\u0006è\u0001"}, m3636d2 = {"Lcom/robinhood/analytics/Analytics;", "Lcom/robinhood/analytics/AnalyticsLogger;", "Lcom/robinhood/analytics/models/DebugAnalyticsLogger;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/robinhood/analytics/SessionManager;", "sessionManager", "Lcom/robinhood/analytics/AnalyticsBundle;", "analyticsBundle", "", "username", "userUuid", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/analytics/SessionManager;Lcom/robinhood/analytics/AnalyticsBundle;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "", "onNewSession", "(Ljava/util/UUID;)V", "onEndSession", "()V", "Lcom/robinhood/analytics/Analytics$Builder;", "screenName", "contentType", "template", "newsUuid", "", "rank", "timeSpent", "collectionCategory", "collectionRank", "appendNewsFeedArticleData", "(Lcom/robinhood/analytics/Analytics$Builder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/robinhood/analytics/Analytics$Builder;", "event", "groupTitle", "buttonTitle", "buttonDescription", "numShares", "entityId", "entityType", "tag", "source", "logButtonGroup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logAppSessionStart", "", "logAppSessionEnd", "(J)V", "logAppSessionNotificationState", "", "Lcom/robinhood/analytics/models/LegacyEvent;", "events", "upload", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "toRequestBody", "(Ljava/util/List;)Lokhttp3/RequestBody;", "Lcom/robinhood/analytics/models/DebugAnalyticsLogger$Listener;", "listener", "addListener", "(Lcom/robinhood/analytics/models/DebugAnalyticsLogger$Listener;)V", "removeListener", "userSecret", "onUserChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "referredCampaignJson", "engagementTime", "onReferredCampaign", "(Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/robinhood/shared/legacy/models/AnalyticsRequest;", "request", "forwardWebRequest", "(Lcom/robinhood/shared/legacy/models/AnalyticsRequest;)V", "name", "desc", "reason", "sourceScreenName", "messageType", "type", "buildTransitionEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/robinhood/analytics/Analytics$Builder;", "buildSimpleTransitionEvent", "(Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/analytics/Analytics$Builder;", "buildScreenTransitionEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/analytics/Analytics$Builder;", "logNewsDisappear", "(Ljava/lang/String;Ljava/util/UUID;I)V", "logNewsFeedContentClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/String;Ljava/lang/Integer;)V", "logNewsFeedContentAppear", "logNewsFeedContentDisappear", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;IILjava/lang/String;Ljava/lang/Integer;)V", "logError", "userAction", "logUserAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logButtonGroupTap", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logButtonGroupAppear", "logButtonGroupDismiss", "numNotifications", "cardId", "loadId", "message", "deeplinkUri", "logNotificationStack", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", Constants.REFERRER, "rootUrl", "", "params", "logDeepLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "uuid", "title", CarResultComposable2.BODY, "expandedBodyOverride", "poBox", RhGcmListenerService.EXTRA_CATEGORY, "tapIdentifier", "logPushNotification", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logFieldTransition", "(Ljava/lang/String;J)V", "groupName", "tabName", "logTabGroup", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "intended", "sent", "logComm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "errorType", "errorCode", "errorMessage", "eventName", "institutionId", "institutionName", "institutionSearchQuery", "linkSessionId", "mfaType", "requestId", "plaidTimeStamp", "viewName", "sourceTag", "logPlaidLinkEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "logPlaidLinkConnection", "exitStatus", "status", "logPlaidExitEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logPlaidIavEventPostSdk", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "milliseconds", "logPathfinderTimeToInteraction", "buildEvent", "j$/time/Instant", "timestamp", "batchRequest", "(Lcom/robinhood/shared/legacy/models/AnalyticsRequest;Lj$/time/Instant;)V", "", "uploadAnalytics", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lcom/robinhood/analytics/AnalyticsBundle;", "getAnalyticsBundle", "()Lcom/robinhood/analytics/AnalyticsBundle;", "Lkotlinx/coroutines/sync/Mutex;", "uploadLock", "Lkotlinx/coroutines/sync/Mutex;", "", "listeners", "Ljava/util/Set;", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "dao", "Lcom/robinhood/analytics/dao/SharedLegacyEventDao;", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "analyticsApi", "Lcom/robinhood/analytics/api/TraderAnalyticsApi;", "Lcom/robinhood/analytics/AnalyticsPrefs;", "prefs", "Lcom/robinhood/analytics/AnalyticsPrefs;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/ReferredCampaign;", "referredCampaignJsonAdapter$delegate", "Lkotlin/Lazy;", "getReferredCampaignJsonAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "referredCampaignJsonAdapter", "analyticsRequestJsonAdapter$delegate", "getAnalyticsRequestJsonAdapter", "analyticsRequestJsonAdapter", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "triggerFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Ljava/text/DateFormat;", "format", "Ljava/text/DateFormat;", "Lcom/robinhood/shared/legacy/models/AppAnalytics;", "appAnalytics", "Lcom/robinhood/shared/legacy/models/AppAnalytics;", "Lcom/robinhood/shared/legacy/models/DeviceAnalytics;", "deviceAnalytics", "Lcom/robinhood/shared/legacy/models/DeviceAnalytics;", "Lcom/robinhood/shared/legacy/models/UserAnalytics;", "userAnalytics", "Lcom/robinhood/shared/legacy/models/UserAnalytics;", "getUserAnalytics", "()Lcom/robinhood/shared/legacy/models/UserAnalytics;", "setUserAnalytics", "(Lcom/robinhood/shared/legacy/models/UserAnalytics;)V", "getUserAnalytics$annotations", "currentTab", "Ljava/lang/String;", "getCurrentTab", "()Ljava/lang/String;", "setCurrentTab", "(Ljava/lang/String;)V", "sessionId", "sessionStartTime", "Ljava/lang/Long;", "getMinAnalyticsDurationMs", "()I", "minAnalyticsDurationMs", "Companion", "ButtonGroupAdditionalInfo", "Builder", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class Analytics implements AnalyticsLogger, DebugAnalyticsLogger {
    public static final String DEVICE_PLATFORM_ANDROID = "Android";
    public static final String DEVICE_PLATFORM_ANDROID_TABLET = "Android-tablet";
    private static final int MAX_ANALYTICS_BATCH_SIZE = 25;
    public static final int MIN_DURATION_FOR_ANALYTICS_MS = 250;
    public static final String PLAID_EVENT_CATEGORY = "plaid_iav";
    public static final long WAIT_DURATION_FOR_ANALYTICS_BATCHING_S = 10;
    private final TraderAnalyticsApi analyticsApi;
    private final AnalyticsBundle analyticsBundle;

    /* renamed from: analyticsRequestJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy analyticsRequestJsonAdapter;
    private final AppAnalytics appAnalytics;
    private final CoroutineScope coroutineScope;
    private String currentTab;
    private final SharedLegacyEventDao dao;
    private final DeviceAnalytics deviceAnalytics;
    private final DateFormat format;
    private final Set<DebugAnalyticsLogger.Listener> listeners;
    private final AnalyticsPrefs prefs;

    /* renamed from: referredCampaignJsonAdapter$delegate, reason: from kotlin metadata */
    private final Lazy referredCampaignJsonAdapter;
    private String sessionId;
    private Long sessionStartTime;
    private final SharedFlow2<Unit> triggerFlow;
    private final Mutex uploadLock;
    public UserAnalytics userAnalytics;

    /* compiled from: Analytics.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.Analytics", m3645f = "Analytics.kt", m3646l = {851, 860}, m3647m = "upload")
    /* renamed from: com.robinhood.analytics.Analytics$upload$1 */
    /* loaded from: classes24.dex */
    static final class C73031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C73031(Continuation<? super C73031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Analytics.this.upload(null, this);
        }
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.Analytics", m3645f = "Analytics.kt", m3646l = {932, 807}, m3647m = "uploadAnalytics$suspendImpl")
    /* renamed from: com.robinhood.analytics.Analytics$uploadAnalytics$1 */
    static final class C73041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C73041(Continuation<? super C73041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Analytics.uploadAnalytics$suspendImpl(Analytics.this, this);
        }
    }

    public static /* synthetic */ void getUserAnalytics$annotations() {
    }

    public int getMinAnalyticsDurationMs() {
        return 250;
    }

    public Object uploadAnalytics(Continuation<? super Boolean> continuation) {
        return uploadAnalytics$suspendImpl(this, continuation);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logUserAction(String str) {
        AnalyticsLogger.DefaultImpls.logUserAction(this, str);
    }

    public Analytics(CoroutineScope coroutineScope, SessionManager sessionManager, AnalyticsBundle analyticsBundle, String str, String str2) {
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(analyticsBundle, "analyticsBundle");
        this.coroutineScope = coroutineScope;
        this.analyticsBundle = analyticsBundle;
        this.uploadLock = Mutex3.Mutex$default(false, 1, null);
        this.listeners = new LinkedHashSet();
        this.dao = analyticsBundle.getDao();
        this.analyticsApi = analyticsBundle.getAnalytics();
        AnalyticsPrefs analyticsPrefs = analyticsBundle.getAnalyticsPrefs();
        this.prefs = analyticsPrefs;
        this.referredCampaignJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.Analytics$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Analytics.referredCampaignJsonAdapter_delegate$lambda$0(this.f$0);
            }
        });
        this.analyticsRequestJsonAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.analytics.Analytics$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Analytics.analyticsRequestJsonAdapter_delegate$lambda$1(this.f$0);
            }
        });
        SharedFlow2<Unit> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this.triggerFlow = sharedFlow2MutableSharedFlow$default;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        this.format = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        Locale locale = Locale.getDefault();
        String applicationId = analyticsBundle.getApplicationId();
        Long lValueOf = Long.valueOf(analyticsBundle.getVersionCode());
        String language = locale.getLanguage();
        language = language == null ? "n/a" : language;
        String country = locale.getCountry();
        this.appAnalytics = new AppAnalytics(applicationId, lValueOf, language, country != null ? country : "n/a", analyticsBundle.getVersionName(), AppInfo2.toProtobuf(analyticsBundle.getBuildVariant()).name());
        String screenRes = analyticsPrefs.getScreenRes();
        if (screenRes == null) {
            DisplayMetrics displayMetrics = analyticsBundle.getContext().getResources().getDisplayMetrics();
            screenRes = displayMetrics.widthPixels + " x " + displayMetrics.heightPixels;
            analyticsPrefs.saveScreenRes(screenRes);
        }
        String str5 = screenRes;
        String densityIndependentScreenRes = analyticsPrefs.getDensityIndependentScreenRes();
        if (densityIndependentScreenRes == null) {
            Configuration configuration = analyticsBundle.getContext().getResources().getConfiguration();
            densityIndependentScreenRes = configuration.screenWidthDp + " x " + configuration.screenHeightDp;
            analyticsPrefs.saveDensityIndependentScreenRes(densityIndependentScreenRes);
        }
        String str6 = densityIndependentScreenRes;
        String strMo2745id = analyticsBundle.getInstallation().mo2745id();
        String str7 = Build.MANUFACTURER;
        if (str7 != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = str7.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str3 = lowerCase;
        } else {
            str3 = null;
        }
        String str8 = Build.MODEL;
        if (str8 != null) {
            Locale ROOT2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
            String lowerCase2 = str8.toLowerCase(ROOT2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            str4 = lowerCase2;
        } else {
            str4 = null;
        }
        this.deviceAnalytics = new DeviceAnalytics(strMo2745id, str4, str3, String.valueOf(Build.VERSION.SDK_INT), analyticsBundle.getPlatform(), str5, str6, null, null, false, null, null, null, null, null, null, null, 130944, null);
        if (str != null) {
            onUserChanged(str, str2);
        } else {
            onUserChanged(analyticsPrefs.getLastKnownUsername(), analyticsPrefs.getLastKnownUserSecret());
        }
        Duration.Companion companion = Duration.INSTANCE;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.m28820sampleHG0u8IE(sharedFlow2MutableSharedFlow$default, Duration3.toDuration(10L, DurationUnitJvm.SECONDS)), new C72991(null)), coroutineScope);
        ScopedSubscriptionKt.subscribeIn(analyticsBundle.getAdIdProvider().getAdId(), coroutineScope, new Function1() { // from class: com.robinhood.analytics.Analytics$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Analytics._init_$lambda$2(this.f$0, (String) obj);
            }
        });
        ScopedSubscriptionKt.subscribeIn(analyticsBundle.getFirebaseAppInstanceIdProvider().getFirebaseAppInstanceId(), coroutineScope, new Function1() { // from class: com.robinhood.analytics.Analytics$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Analytics._init_$lambda$3(this.f$0, (Optional) obj);
            }
        });
        FlowKt.launchIn(Flow7.flowOnMainImmediate(FlowKt.onEach(sessionManager.getSessionId(), new C73004(null))), coroutineScope);
    }

    protected final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    protected final AnalyticsBundle getAnalyticsBundle() {
        return this.analyticsBundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ReferredCampaign> getReferredCampaignJsonAdapter() {
        return (JsonAdapter) this.referredCampaignJsonAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter referredCampaignJsonAdapter_delegate$lambda$0(Analytics analytics) {
        LazyMoshi moshi = analytics.analyticsBundle.getMoshi();
        Types types = Types.INSTANCE;
        return moshi.adapter(new TypeToken<ReferredCampaign>() { // from class: com.robinhood.analytics.Analytics$referredCampaignJsonAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter analyticsRequestJsonAdapter_delegate$lambda$1(Analytics analytics) {
        LazyMoshi moshi = analytics.analyticsBundle.getMoshi();
        Types types = Types.INSTANCE;
        return moshi.adapter(new TypeToken<AnalyticsRequest>() { // from class: com.robinhood.analytics.Analytics$analyticsRequestJsonAdapter_delegate$lambda$1$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<AnalyticsRequest> getAnalyticsRequestJsonAdapter() {
        return (JsonAdapter) this.analyticsRequestJsonAdapter.getValue();
    }

    public final UserAnalytics getUserAnalytics() {
        UserAnalytics userAnalytics = this.userAnalytics;
        if (userAnalytics != null) {
            return userAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userAnalytics");
        return null;
    }

    public final void setUserAnalytics(UserAnalytics userAnalytics) {
        Intrinsics.checkNotNullParameter(userAnalytics, "<set-?>");
        this.userAnalytics = userAnalytics;
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public String getCurrentTab() {
        return this.currentTab;
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void setCurrentTab(String str) {
        this.currentTab = str;
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.Analytics$1", m3645f = "Analytics.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.Analytics$1 */
    /* loaded from: classes24.dex */
    static final class C72991 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;

        C72991(Continuation<? super C72991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Analytics.this.new C72991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((C72991) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Analytics analytics = Analytics.this;
                this.label = 1;
                if (analytics.uploadAnalytics(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(Analytics analytics, String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        analytics.deviceAnalytics.setAdid(adId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(Analytics analytics, Optional appInstanceId) {
        Intrinsics.checkNotNullParameter(appInstanceId, "appInstanceId");
        analytics.deviceAnalytics.setFirebase_app_instance_id((String) appInstanceId.getOrNull());
        return Unit.INSTANCE;
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "sessionId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.Analytics$4", m3645f = "Analytics.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.Analytics$4 */
    static final class C73004 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C73004(Continuation<? super C73004> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C73004 c73004 = Analytics.this.new C73004(continuation);
            c73004.L$0 = obj;
            return c73004;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UUID uuid, Continuation<? super Unit> continuation) {
            return ((C73004) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            if (uuid == null) {
                Analytics.this.onEndSession();
            } else {
                Analytics.this.onNewSession(uuid);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewSession(UUID id) {
        Logger.INSTANCE.mo1683i("New session: " + id, new Object[0]);
        this.sessionId = id.toString();
        this.sessionStartTime = Long.valueOf(SystemClock.elapsedRealtime());
        logAppSessionStart();
        logAppSessionNotificationState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEndSession() {
        if (this.sessionId == null) {
            return;
        }
        Logger.INSTANCE.mo1683i("End session", new Object[0]);
        this.sessionId = null;
        Long l = this.sessionStartTime;
        logAppSessionEnd(l != null ? SystemClock.elapsedRealtime() - l.longValue() : 0L);
        this.sessionStartTime = null;
    }

    @Override // com.robinhood.analytics.models.DebugAnalyticsLogger
    public void addListener(DebugAnalyticsLogger.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.robinhood.analytics.models.DebugAnalyticsLogger
    public void removeListener(DebugAnalyticsLogger.Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void onUserChanged(String username, String userSecret) {
        setUserAnalytics(new UserAnalytics(userSecret, username));
        this.prefs.saveLastKnownUserInfo(username, userSecret);
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.Analytics$onReferredCampaign$1", m3645f = "Analytics.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.Analytics$onReferredCampaign$1 */
    /* loaded from: classes24.dex */
    static final class C73021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $engagementTime;
        final /* synthetic */ String $referredCampaignJson;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73021(String str, Long l, Continuation<? super C73021> continuation) {
            super(2, continuation);
            this.$referredCampaignJson = str;
            this.$engagementTime = l;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Analytics.this.new C73021(this.$referredCampaignJson, this.$engagementTime, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C73021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Object objFromJson = Analytics.this.getReferredCampaignJsonAdapter().fromJson(this.$referredCampaignJson);
                Intrinsics.checkNotNull(objFromJson);
                ReferredCampaign referredCampaign = (ReferredCampaign) objFromJson;
                Analytics.this.deviceAnalytics.setSource(referredCampaign.getAnalyticsSource());
                Analytics.this.deviceAnalytics.setCampaign(referredCampaign.getCampaign());
                Analytics.this.deviceAnalytics.setCampaign_version(referredCampaign.getExperiment());
                Analytics.this.deviceAnalytics.setEngagement_time(this.$engagementTime);
                Analytics.this.deviceAnalytics.setSharer_id(referredCampaign.getRhSharerId());
                Analytics.this.deviceAnalytics.setWeb_device_id(referredCampaign.getRhDeviceId());
                Analytics.this.deviceAnalytics.setSharer_url(referredCampaign.getRhUrl());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void onReferredCampaign(String referredCampaignJson, Long engagementTime) {
        if (referredCampaignJson == null || referredCampaignJson.length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C73021(referredCampaignJson, engagementTime, null), 3, null);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void forwardWebRequest(AnalyticsRequest request) throws ParseException {
        Intrinsics.checkNotNullParameter(request, "request");
        AnalyticsRequest analyticsRequestCopy$default = AnalyticsRequest.copy$default(request, null, DeviceAnalytics.copy$default(this.deviceAnalytics, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, 130559, null), EventAnalytics.copy$default(request.getEvent(), null, null, this.sessionId, null, null, 27, null), null, null, 25, null);
        Date date = this.format.parse(request.getTimestamp());
        if (date == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Instant instant = DateRetargetClass.toInstant(date);
        Intrinsics.checkNotNullExpressionValue(instant, "toInstant(...)");
        batchRequest(analyticsRequestCopy$default, instant);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public Builder buildTransitionEvent(String event, String name, String desc, String reason, String source, String sourceScreenName, String messageType, String type2, String entityId, String tag, int timeSpent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(name, "name");
        return buildEvent("screen_transition", event).appendEventData("screen_name", (Object) name).appendEventData("screen_description", (Object) desc).appendEventData("transition_reason", (Object) reason).appendEventData("source", (Object) source).appendEventData("source_screen_name", (Object) sourceScreenName).appendEventData("message_type", (Object) messageType).appendEventData("type", (Object) type2).appendEventData("entity_id", (Object) entityId).appendEventData("tag", (Object) tag).appendEventData("time_spent", (Object) Integer.valueOf(timeSpent));
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public Builder buildSimpleTransitionEvent(String name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        return buildEvent("screen_transition", AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR).appendEventData("screen_name", (Object) name).appendEventData("screen_description", (Object) desc);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public Builder buildScreenTransitionEvent(String event, String screenName, String desc) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        return buildEvent("screen_transition", event).appendEventData("screen_name", (Object) screenName).appendEventData("screen_description", (Object) desc);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logNewsDisappear(String screenName, UUID newsUuid, int timeSpent) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
        if (timeSpent > getMinAnalyticsDurationMs()) {
            buildEvent("screen_transition", AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR).appendEventData("screen_name", (Object) screenName).appendEventData("screen_description", (Object) newsUuid).appendEventData("time_spent", (Object) Integer.valueOf(timeSpent)).send();
        }
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logNewsFeedContentClick(String screenName, String contentType, String template, UUID newsUuid, int rank, String collectionCategory, Integer collectionRank) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
        appendNewsFeedArticleData$default(this, buildEvent("screen_transition", AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR), screenName, contentType, template, newsUuid, rank, null, collectionCategory, collectionRank, 32, null).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logNewsFeedContentAppear(String screenName, String contentType, String template, UUID newsUuid, int rank, String collectionCategory, Integer collectionRank) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
        appendNewsFeedArticleData$default(this, buildEvent("screen_transition", Analytics3.EVENT_APPEAR), screenName, contentType, template, newsUuid, rank, null, collectionCategory, collectionRank, 32, null).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logNewsFeedContentDisappear(String screenName, String contentType, String template, UUID newsUuid, int rank, int timeSpent, String collectionCategory, Integer collectionRank) {
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(newsUuid, "newsUuid");
        if (timeSpent > getMinAnalyticsDurationMs()) {
            appendNewsFeedArticleData(buildEvent("screen_transition", AnalyticsStrings.SCREEN_TRANSITION_EVENT_DISAPPEAR), screenName, contentType, template, newsUuid, rank, Integer.valueOf(timeSpent), collectionCategory, collectionRank).send();
        }
    }

    static /* synthetic */ Builder appendNewsFeedArticleData$default(Analytics analytics, Builder builder, String str, String str2, String str3, UUID uuid, int i, Integer num, String str4, Integer num2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendNewsFeedArticleData");
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        return analytics.appendNewsFeedArticleData(builder, str, str2, str3, uuid, i, num, str4, num2);
    }

    private final Builder appendNewsFeedArticleData(Builder builder, String str, String str2, String str3, UUID uuid, int i, Integer num, String str4, Integer num2) {
        builder.appendEventData("screen_name", (Object) str);
        builder.appendEventData("type", (Object) str2);
        builder.appendEventData("screen_description", (Object) uuid);
        builder.appendEventData("message_type", (Object) str3);
        builder.appendEventData("entity_id", (Object) String.valueOf(i));
        builder.appendEventData("time_spent", (Object) num);
        builder.appendEventData("message", (Object) str4);
        builder.appendEventData("message_uuid", (Object) (num2 != null ? num2.toString() : null));
        return builder;
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logError(String event, String tag) {
        Intrinsics.checkNotNullParameter(event, "event");
        buildEvent("error_event", event).appendEventData("tag", (Object) tag).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logUserAction(String userAction, String event, String buttonTitle, String tag) {
        Intrinsics.checkNotNullParameter(userAction, "userAction");
        Intrinsics.checkNotNullParameter(event, "event");
        Builder builderAppendEventData = buildEvent("user_action", event).appendEventData("action_name", (Object) userAction);
        if (buttonTitle != null) {
            builderAppendEventData.appendEventData("button_title", (Object) buttonTitle);
        }
        if (tag != null) {
            builderAppendEventData.appendEventData("tag", (Object) tag);
        }
        builderAppendEventData.send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logButtonGroupTap(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
        Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        logButtonGroup("tap", groupTitle, buttonTitle, buttonDescription, numShares, entityId, entityType, tag, source);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logButtonGroupAppear(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
        Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        logButtonGroup(Analytics3.EVENT_APPEAR, groupTitle, buttonTitle, buttonDescription, numShares, entityId, entityType, tag, source);
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logButtonGroupDismiss(String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
        Intrinsics.checkNotNullParameter(groupTitle, "groupTitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        logButtonGroup("dismiss", groupTitle, buttonTitle, buttonDescription, numShares, entityId, entityType, tag, source);
    }

    private final void logButtonGroup(String event, String groupTitle, String buttonTitle, String buttonDescription, Integer numShares, String entityId, String entityType, String tag, String source) {
        Builder builderAppendEventData = buildEvent("button_group", event).appendEventData("button_group_title", (Object) groupTitle).appendEventData("button_title", (Object) buttonTitle);
        if (buttonDescription != null) {
            builderAppendEventData.appendEventData("button_description", (Object) buttonDescription);
        }
        if (numShares != null) {
            builderAppendEventData.appendEventData("additional_info", (Object) new ButtonGroupAdditionalInfo(numShares.intValue()));
        }
        if (entityId != null) {
            builderAppendEventData.appendEventData("entity_id", (Object) entityId);
        }
        if (entityType != null) {
            builderAppendEventData.appendEventData("entity_type", (Object) entityType);
        }
        if (tag != null) {
            builderAppendEventData.appendEventData("tag", (Object) tag);
        }
        if (source != null) {
            builderAppendEventData.appendEventData("source", (Object) source);
        }
        builderAppendEventData.send();
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/analytics/Analytics$ButtonGroupAdditionalInfo;", "", "num_shares", "", "<init>", "(I)V", "getNum_shares", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final /* data */ class ButtonGroupAdditionalInfo {
        private final int num_shares;

        public static /* synthetic */ ButtonGroupAdditionalInfo copy$default(ButtonGroupAdditionalInfo buttonGroupAdditionalInfo, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = buttonGroupAdditionalInfo.num_shares;
            }
            return buttonGroupAdditionalInfo.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNum_shares() {
            return this.num_shares;
        }

        public final ButtonGroupAdditionalInfo copy(int num_shares) {
            return new ButtonGroupAdditionalInfo(num_shares);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ButtonGroupAdditionalInfo) && this.num_shares == ((ButtonGroupAdditionalInfo) other).num_shares;
        }

        public int hashCode() {
            return Integer.hashCode(this.num_shares);
        }

        public String toString() {
            return "ButtonGroupAdditionalInfo(num_shares=" + this.num_shares + ")";
        }

        public ButtonGroupAdditionalInfo(int i) {
            this.num_shares = i;
        }

        public final int getNum_shares() {
            return this.num_shares;
        }
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logNotificationStack(String event, int numNotifications, String type2, String cardId, String loadId, String message, String deeplinkUri, String entityId) {
        Intrinsics.checkNotNullParameter(event, "event");
        buildEvent("notification_stack", event).appendEventData("number_of_notifications", (Object) Integer.valueOf(numNotifications)).appendEventData("type", (Object) type2).appendEventData("message_uuid", (Object) cardId).appendEventData("tag", (Object) loadId).appendEventData("message", (Object) message).appendEventData("url", (Object) deeplinkUri).appendEventData("entity_id", (Object) entityId).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logDeepLink(String referrer, String rootUrl, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(rootUrl, "rootUrl");
        Intrinsics.checkNotNullParameter(params, "params");
        buildEvent("deep_link", "open").appendEventData(Constants.REFERRER, (Object) referrer).appendEventData("root_url", (Object) rootUrl).appendEventData("url_params", (Object) params).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logPushNotification(String event, String uuid, String type2, String title, String body, String expandedBodyOverride, String poBox, String category, String tapIdentifier) {
        Builder builderAppendEventData;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(type2, "type");
        Builder builderAppendEventData2 = buildEvent("push_notification", event).appendEventData("message_uuid", (Object) uuid).appendEventData("message_type", (Object) type2).appendEventData("message_title", (Object) title).appendEventData("message_body", (Object) body);
        if (expandedBodyOverride != null && (builderAppendEventData = builderAppendEventData2.appendEventData("message_expanded_body", (Object) expandedBodyOverride)) != null) {
            builderAppendEventData2 = builderAppendEventData;
        }
        builderAppendEventData2.appendEventData("po_box", (Object) poBox).appendEventData(RhGcmListenerService.EXTRA_CATEGORY, (Object) category).appendEventData("action_identifier", (Object) tapIdentifier).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logFieldTransition(String name, long timeSpent) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (timeSpent > getMinAnalyticsDurationMs()) {
            buildEvent("field_transition", "leave").appendEventData("field_name", (Object) name).appendEventData("time_spent", (Object) Long.valueOf(timeSpent)).send();
        }
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logTabGroup(String groupName, String tabName, Long timeSpent, String tag) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        if (timeSpent == null || timeSpent.longValue() > getMinAnalyticsDurationMs()) {
            buildEvent("tab_group", "leave").appendEventData("tab_group_name", (Object) groupName).appendEventData("tab_name", (Object) tabName).appendEventData("time_spent", (Object) timeSpent).appendEventData("tag", (Object) tag).send();
        }
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logComm(String event, String type2, String source, int intended, int sent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(source, "source");
        buildEvent("device_communication", event).appendEventData("type", (Object) type2).appendEventData("source", (Object) source).appendEventData("intended", (Object) Integer.valueOf(intended)).appendEventData("sent", (Object) Integer.valueOf(sent)).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logPlaidLinkEvent(String errorType, String errorCode, String errorMessage, String eventName, String institutionId, String institutionName, String institutionSearchQuery, String linkSessionId, String mfaType, String requestId, String plaidTimeStamp, String viewName, String sourceTag) {
        Intrinsics.checkNotNullParameter(plaidTimeStamp, "plaidTimeStamp");
        buildEvent(PLAID_EVENT_CATEGORY, "onEvent").appendEventData("error_type", (Object) errorType).appendEventData(ErrorResponse.ERROR_CODE, (Object) errorCode).appendEventData("error_message", (Object) errorMessage).appendEventData("event_name", (Object) eventName).appendEventData("institution_id", (Object) institutionId).appendEventData("institution_name", (Object) institutionName).appendEventData("institution_search_query", (Object) institutionSearchQuery).appendEventData("link_session_id", (Object) linkSessionId).appendEventData("mfa_type", (Object) mfaType).appendEventData("request_id", (Object) requestId).appendEventData("plaid_timestamp", (Object) plaidTimeStamp).appendEventData("view_name", (Object) viewName).appendEventData("source_tag", (Object) sourceTag).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logPlaidLinkConnection(String institutionId, String institutionName, String linkSessionId, String sourceTag) {
        buildEvent(PLAID_EVENT_CATEGORY, "onSuccess").appendEventData("institution_id", (Object) institutionId).appendEventData("institution_name", (Object) institutionName).appendEventData("link_session_id", (Object) linkSessionId).appendEventData("source_tag", (Object) sourceTag).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logPlaidExitEvent(String errorType, String errorCode, String errorMessage, String exitStatus, String institutionId, String institutionName, String linkSessionId, String requestId, String status, String sourceTag) {
        buildEvent(PLAID_EVENT_CATEGORY, "onExit").appendEventData("error_type", (Object) errorType).appendEventData(ErrorResponse.ERROR_CODE, (Object) errorCode).appendEventData("error_message", (Object) errorMessage).appendEventData("exit_status", (Object) exitStatus).appendEventData("institution_id", (Object) institutionId).appendEventData("institution_name", (Object) institutionName).appendEventData("link_session_id", (Object) linkSessionId).appendEventData("request_id", (Object) requestId).appendEventData("status", (Object) status).appendEventData("source_tag", (Object) sourceTag).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logPlaidIavEventPostSdk(String event, Throwable throwable, String linkSessionId, String institutionId, String institutionName, String sourceTag) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceTag, "sourceTag");
        Builder builderBuildEvent = buildEvent(PLAID_EVENT_CATEGORY, event);
        if (throwable != null) {
            builderBuildEvent.appendEventData("error_type", (Object) throwable.getClass().getName());
            if (throwable instanceof HttpException) {
                builderBuildEvent.appendEventData(ErrorResponse.ERROR_CODE, (Object) String.valueOf(((HttpException) throwable).code()));
            }
        }
        builderBuildEvent.appendEventData("link_session_id", (Object) linkSessionId).appendEventData("institution_id", (Object) institutionId).appendEventData("institution_name", (Object) institutionName).appendEventData("source_tag", (Object) sourceTag).send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public void logPathfinderTimeToInteraction(long milliseconds) {
        buildEvent("pathfinder", "time_first_interaction").appendEventData("milliseconds", (Object) Long.valueOf(milliseconds)).send();
    }

    private final void logAppSessionStart() {
        buildEvent("app_session", "start").send();
    }

    private final void logAppSessionEnd(long timeSpent) {
        buildEvent("app_session", "end").appendEventData("time_spent", (Object) Long.valueOf(timeSpent)).send();
    }

    private final void logAppSessionNotificationState() {
        buildEvent("app_session", ContextSystemServices.getNotificationManager(this.analyticsBundle.getContext()).areNotificationsEnabled() ? "notification_on" : "notification_off").send();
    }

    @Override // com.robinhood.analytics.AnalyticsLogger
    public Builder buildEvent(String category, String event) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(event, "event");
        return new Builder(this, category, event);
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.analytics.Analytics$batchRequest$1", m3645f = "Analytics.kt", m3646l = {797}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.analytics.Analytics$batchRequest$1 */
    /* loaded from: classes24.dex */
    static final class C73011 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnalyticsRequest $request;
        final /* synthetic */ Instant $timestamp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C73011(AnalyticsRequest analyticsRequest, Instant instant, Continuation<? super C73011> continuation) {
            super(2, continuation);
            this.$request = analyticsRequest;
            this.$timestamp = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Analytics.this.new C73011(this.$request, this.$timestamp, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C73011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedLegacyEventDao sharedLegacyEventDao = Analytics.this.dao;
                String json = Analytics.this.getAnalyticsRequestJsonAdapter().toJson(this.$request);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                Instant instant = this.$timestamp;
                this.label = 1;
                if (sharedLegacyEventDao.insert(json, instant, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SharedFlow2 sharedFlow2 = Analytics.this.triggerFlow;
            Unit unit = Unit.INSTANCE;
            if (sharedFlow2.tryEmit(unit)) {
                return unit;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    protected void batchRequest(AnalyticsRequest request, Instant timestamp) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C73011(request, timestamp, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object uploadAnalytics$suspendImpl(Analytics analytics, Continuation<? super Boolean> continuation) throws Throwable {
        C73041 c73041;
        Mutex mutex;
        Mutex mutex2;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof C73041) {
            c73041 = (C73041) continuation;
            int i = c73041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73041.label = i - Integer.MIN_VALUE;
            } else {
                c73041 = analytics.new C73041(continuation);
            }
        }
        Object obj = c73041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73041.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = analytics.uploadLock;
                c73041.L$0 = analytics;
                c73041.L$1 = mutex;
                c73041.label = 1;
                if (mutex.lock(null, c73041) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) c73041.L$1;
                mutex2 = (Mutex) c73041.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Boolean boolBoxBoolean = boxing.boxBoolean(!booleanRef.element);
                    mutex2.unlock(null);
                    return boolBoxBoolean;
                } catch (Throwable th) {
                    th = th;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) c73041.L$1;
            Analytics analytics2 = (Analytics) c73041.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            analytics = analytics2;
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            Object eventLogDatabase = analytics.analyticsBundle.getEventLogDatabase();
            Intrinsics.checkNotNull(eventLogDatabase, "null cannot be cast to non-null type androidx.room.RoomDatabase");
            Analytics2 analytics22 = new Analytics2(analytics, booleanRef2, null);
            c73041.L$0 = mutex;
            c73041.L$1 = booleanRef2;
            c73041.label = 2;
            if (RoomDatabaseKt.withTransaction((RoomDatabase) eventLogDatabase, analytics22, c73041) != coroutine_suspended) {
                mutex2 = mutex;
                booleanRef = booleanRef2;
                Boolean boolBoxBoolean2 = boxing.boxBoolean(!booleanRef.element);
                mutex2.unlock(null);
                return boolBoxBoolean2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r2.postAnalytics(r11, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object upload(List<LegacyEvent> list, Continuation<? super Unit> continuation) throws Exception {
        C73031 c73031;
        List<LegacyEvent> list2;
        RequestBody requestBody;
        Exception e;
        Integer httpStatusCode;
        Iterator it;
        if (continuation instanceof C73031) {
            c73031 = (C73031) continuation;
            int i = c73031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c73031.label = i - Integer.MIN_VALUE;
            } else {
                c73031 = new C73031(continuation);
            }
        }
        Object obj = c73031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c73031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (list.isEmpty()) {
                return Unit.INSTANCE;
            }
            RequestBody requestBody2 = toRequestBody(list);
            try {
                TraderAnalyticsApi traderAnalyticsApi = this.analyticsApi;
                c73031.L$0 = list;
                c73031.L$1 = requestBody2;
                c73031.label = 1;
            } catch (Exception e2) {
                list2 = list;
                requestBody = requestBody2;
                e = e2;
                httpStatusCode = Throwables.getHttpStatusCode(e);
                if (httpStatusCode != null && httpStatusCode.intValue() == 201) {
                    throw new IllegalStateException("201 response in analytics error case");
                }
                if (httpStatusCode == null && httpStatusCode.intValue() == 413) {
                    Timber.INSTANCE.mo3353e("Size of the payload is too big: %d", boxing.boxLong(requestBody.contentLength()));
                    it = CollectionsKt.chunked(list2, (list2.size() + 1) / 2, new Function1() { // from class: com.robinhood.analytics.Analytics$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Analytics.upload$lambda$8(this.f$0, (List) obj2);
                        }
                    }).iterator();
                    while (it.hasNext()) {
                    }
                    return Unit.INSTANCE;
                }
                throw e;
            }
        } else {
            if (i2 == 1) {
                requestBody = (RequestBody) c73031.L$1;
                list2 = (List) c73031.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e3) {
                    e = e3;
                    httpStatusCode = Throwables.getHttpStatusCode(e);
                    if (httpStatusCode != null) {
                        throw new IllegalStateException("201 response in analytics error case");
                    }
                    if (httpStatusCode == null) {
                    }
                    throw e;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c73031.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            RequestBody requestBody3 = (RequestBody) it.next();
            TraderAnalyticsApi traderAnalyticsApi2 = this.analyticsApi;
            c73031.L$0 = it;
            c73031.L$1 = null;
            c73031.label = 2;
            if (traderAnalyticsApi2.postAnalytics(requestBody3, c73031) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestBody upload$lambda$8(Analytics analytics, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return analytics.toRequestBody(it);
    }

    private final RequestBody toRequestBody(List<LegacyEvent> list) {
        return RequestBody.INSTANCE.create(CollectionsKt.joinToString$default(list, ",", "[", "]", 0, null, new Function1() { // from class: com.robinhood.analytics.Analytics$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Analytics.toRequestBody$lambda$9((LegacyEvent) obj);
            }
        }, 24, null), MediaTypes.JSON_UTF8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toRequestBody$lambda$9(LegacyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRequestJson();
    }

    /* compiled from: Analytics.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u000e\u001a\u00060\u0000R\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/analytics/Analytics$Builder;", "Lcom/robinhood/analytics/AnalyticsLogger$EventBuilder;", RhGcmListenerService.EXTRA_CATEGORY, "", "event", "<init>", "(Lcom/robinhood/analytics/Analytics;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getEvent", "eventAnalytics", "Lcom/robinhood/shared/legacy/models/EventAnalytics;", "sent", "", "appendEventData", "Lcom/robinhood/analytics/Analytics;", "name", "value", "", "send", "", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public class Builder implements AnalyticsLogger.EventBuilder {
        private final String category;
        private final String event;
        private final EventAnalytics eventAnalytics;
        private boolean sent;
        final /* synthetic */ Analytics this$0;

        public Builder(Analytics analytics, String category, String event) {
            Intrinsics.checkNotNullParameter(category, "category");
            Intrinsics.checkNotNullParameter(event, "event");
            this.this$0 = analytics;
            this.category = category;
            this.event = event;
            this.eventAnalytics = new EventAnalytics(category, event, analytics.sessionId, null, analytics.getCurrentTab(), 8, null);
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getEvent() {
            return this.event;
        }

        @Override // com.robinhood.analytics.AnalyticsLogger.EventBuilder
        public Builder appendEventData(String name, Object value) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.eventAnalytics.getData().put(name, value);
            return this;
        }

        @Override // com.robinhood.analytics.AnalyticsLogger.EventBuilder
        public void send() {
            if (this.sent) {
                throw new IllegalStateException("Check failed.");
            }
            Instant instantNow = Instant.now(this.this$0.getAnalyticsBundle().getClock());
            AppAnalytics appAnalytics = this.this$0.appAnalytics;
            DeviceAnalytics deviceAnalytics = this.this$0.deviceAnalytics;
            EventAnalytics eventAnalytics = this.eventAnalytics;
            String str = this.this$0.format.format(Long.valueOf(instantNow.toEpochMilli()));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            AnalyticsRequest analyticsRequest = new AnalyticsRequest(appAnalytics, deviceAnalytics, eventAnalytics, str, this.this$0.getUserAnalytics());
            Analytics analytics = this.this$0;
            Intrinsics.checkNotNull(instantNow);
            analytics.batchRequest(analyticsRequest, instantNow);
            this.sent = true;
            Iterator it = this.this$0.listeners.iterator();
            while (it.hasNext()) {
                ((DebugAnalyticsLogger.Listener) it.next()).onAnalyticsEvent(analyticsRequest);
            }
        }
    }
}
